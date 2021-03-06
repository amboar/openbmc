SUMMARY = "An example of partitioned image."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP}"

IMAGE_FSTYPES = "wic.bz2"
RM_OLD_IMAGE = "1"

# core-image-minimal is referenced in .wks, so we need its rootfs
# to be ready before our rootfs
do_rootfs[depends] += "core-image-minimal:do_rootfs"

IMAGE_ROOTFS_EXTRA_SPACE = "2000"

inherit image

S = "${WORKDIR}/pyflame-${PV}"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS = "python"

inherit pkgconfig autotools


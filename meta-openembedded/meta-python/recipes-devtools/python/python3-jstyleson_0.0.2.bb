SUMMARY = "Library to parse JSON with js-style comments."
HOMEPAGE = "https://github.com/linjackson78/jstyleson"

LICENSE = "MIT"

PYPI_PACKAGE_EXT = "tar.gz"

inherit pypi setuptools3

SRC_URI[sha256sum] = "680003f3b15a2959e4e6a351f3b858e3c07dd3e073a0d54954e34d8ea5e1308e"

BBCLASSEXTEND = "native nativesdk"

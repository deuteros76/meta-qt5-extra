SUMMARY = "A file metadata and text extraction library"
LICENSE = "MIT & LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-kf5 pkgconfig gettext

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e2d2de67f9dcbdabc950ef0a3ad5d5c5"
SRC_URI[sha256sum] = "1a08707ce6f6203f1f3770d628fc027d1cae7f5daa9f6acf633a1a121efc8fa3"
SRC_URI += "file://0001-Revert-extractors-Hide-warnings-from-system-headers.patch"

# TODO: optionals PACKAGECONFIG (poppler-qt5 / exiv2 / ffmpeg / epub)
DEPENDS += " \
    qtmultimedia \
    lmdb \
    ki18n \
    karchive \
    libav \
    poppler \
    taglib \
    exiv2 \
"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/kf5"

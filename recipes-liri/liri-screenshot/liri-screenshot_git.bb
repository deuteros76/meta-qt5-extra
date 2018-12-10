SUMMARY = "Utility to capture the screen of a Liri desktop"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

DEPENDS += " \
    qtquickcontrols2 \
"

PV = "0.9.0+git${SRCPV}"
SRCREV = "c85e2cad59a9451952f1d8b57e06f22f28685a89"
S = "${WORKDIR}/git"

SUMMARY = "LIRI Calculator"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=8f0e2cd40e05189ec81232da84bd6e1a \
"

inherit liri gtk-icon-cache

DEPENDS += " \
    qtquickcontrols2 \
    liri-fluid \
"

SRCREV = "fe7a193cf7d751d3009922d44f1ac91e69d802ad"
S = "${WORKDIR}/git"
PV = "1.2.0+git${SRCPV}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/icons \
"

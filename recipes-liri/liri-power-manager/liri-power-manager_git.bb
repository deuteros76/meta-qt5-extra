SUMMARY = "Power management support for Liri"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri gsettings

PV = "0.9.0+git${SRCPV}"

SRCREV = "c7f3d51d2526e3a983f0c01fadc628f2d44e6ae7"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtwayland \
    qtgraphicaleffects \
    qtquickcontrols2 \
    qtsvg \
    liri-fluid \
    liri-qtgsettings \
    liri-libliri \
    solid \
"

EXTRA_OECMAKE = "-DINSTALL_SYSCONFDIR=${sysconfdir}"

FILES_${PN} += " \
    ${datadir}/liri-settings \
    ${datadir}/liri-shell \
    ${OE_QMAKE_PATH_QML} \
"

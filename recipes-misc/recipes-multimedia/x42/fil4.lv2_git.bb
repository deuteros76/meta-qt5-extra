SUMMARY = "4 Band Parametric EQ"
HOMEPAGE = "http://x42-plugins.com/x42/x42-eq"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit autotools-brokensep pkgconfig

DEPENDS += " \
    virtual/libgl \
    libglu \
    glib-2.0 \
    pango \
    cairo \
    lv2 \
    jack \
    fftw \
"

SRC_URI = "gitsm://github.com/x42/fil4.lv2.git"
SRCREV = "797f63d47c47d8676fdbad3ab7595398e8dd99cc"
PV = "0.6.1"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += " \
    PREFIX=${prefix} \
    STRIP=echo \
    OPTIMIZATIONS= \
"

FILES_${PN} += "${libdir}/lv2"

SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = " file://CMakeLists.txt \
            file://inc/add.h \
            file://src/add.cpp \
            file://addition-lib.pc.in \
            "

S = "${WORKDIR}"

inherit cmake pkgconfig

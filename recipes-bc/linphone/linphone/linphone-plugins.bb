DESCRIPTION = "Plugins for linphone to have additional codecs."
LICENSE = "MIT"

inherit packagegroup

PROVIDES = "linphone-plugins"

RDEPENDS_${PN} = "linphonec libvpx msopenh264"
# RDEPENDS_${PN} += "msilbc"


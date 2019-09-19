FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI_append_ibm-ac-server = " file://witherspoon.cfg"
SRC_URI_append_mihawk = " file://mihawk.cfg"
SRC_URI_append_witherspoon-128 = " file://0001-ARM-dts-Aspeed-Witherspoon-128-Update-BMC-partitioni.patch"
SRC_URI_append_witherspoon-tacoma = " \
    file://0001-clk-ast2600-Add-RMII-RCLK-gates-for-all-four-MACs.patch \
    file://0002-net-ftgmac100-Ungate-RCLK-for-NCSI-on-AST2600.patch \
    file://0003-ARM-dts-tacoma-Enable-50MHz-RMII-RCLK-for-NCSI.patch \
    file://0004-hack-net-ftgmac100-Disregard-RX_ERR-for-Tacoma.patch \
"

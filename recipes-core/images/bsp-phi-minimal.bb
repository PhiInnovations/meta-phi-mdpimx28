DESCRIPTION = "Base image for MDP iMX28 System On Module."

IMAGE_INSTALL = "packagegroup-core-boot \
		${ROOTFS_PKGMANAGE_BOOTSTRAP} \
		${CORE_IMAGE_EXTRA_INSTALL} \
		mtd-utils-misc \
		mtd-utils-ubifs \
		openssh \
		nfs-utils \
		i2c-tools \
		rpm \
		python-core \
		sqlite \
		lighttpd \
		"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE = "24576"

# remove not needed ipkg informations
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "

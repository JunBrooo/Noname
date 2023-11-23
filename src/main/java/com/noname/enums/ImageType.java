package com.noname.enums;

public enum ImageType {
        USER("/Users/buenhjcho/WebDevelop/03.portfolio/02.Noname/upload/user"),
        PRODUCT("/Users/buenhjcho/WebDevelop/03.portfolio/02.Noname/upload");

        private final String uploadPath;

        private ImageType(String uploadPath) {
            this.uploadPath = uploadPath;
        }

        public String getUploadPath() {
            return uploadPath;
        }


}

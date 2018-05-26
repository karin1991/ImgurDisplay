package com.example.karin.imgurdisplay;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;






public class Album {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("datetime")
    @Expose
    private Integer datetime;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("account_url")
    @Expose
    private String accountUrl;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("privacy")
    @Expose
    private String privacy;
    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("images_count")
    @Expose
    private Integer imagesCount;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Integer getDatetime() {
        return datetime;
    }

    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getImagesCount() {
        return imagesCount;
    }

    public void setImagesCount(Integer imagesCount) {
        this.imagesCount = imagesCount;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }



    public class Image {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private Object title;
        @SerializedName("description")
        @Expose
        private Object description;
        @SerializedName("datetime")
        @Expose
        private Integer datetime;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("animated")
        @Expose
        private Boolean animated;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("size")
        @Expose
        private Integer size;
        @SerializedName("views")
        @Expose
        private Integer views;
        @SerializedName("bandwidth")
        @Expose
        private Integer bandwidth;
        @SerializedName("link")
        @Expose
        private String link;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getTitle() {
            return title;
        }

        public void setTitle(Object title) {
            this.title = title;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Integer getDatetime() {
            return datetime;
        }

        public void setDatetime(Integer datetime) {
            this.datetime = datetime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getAnimated() {
            return animated;
        }

        public void setAnimated(Boolean animated) {
            this.animated = animated;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getViews() {
            return views;
        }

        public void setViews(Integer views) {
            this.views = views;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

    }

}


//public class Example {
//
//    @SerializedName("data")
//    @Expose
//    private Data data;
//    @SerializedName("success")
//    @Expose
//    private Boolean success;
//    @SerializedName("status")
//    @Expose
//    private Integer status;
//
//    public Data getData() {
//        return data;
//    }
//
//    public void setData(Data data) {
//        this.data = data;
//    }
//
//    public Boolean getSuccess() {
//        return success;
//    }
//
//    public void setSuccess(Boolean success) {
//        this.success = success;
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//}



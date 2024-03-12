public class AlexaInternetAccess extends AlexaDevice{
    private Boolean hasMusicAccount = false;
    private Boolean canSearch = false;
    private Boolean canPlayVideos = false;

    public Boolean getHasMusicAccount() {
        return hasMusicAccount;
    }

    public void setHasMusicAccount(Boolean hasMusicAccount) {
        this.hasMusicAccount = hasMusicAccount;
    }

    public Boolean getCanSearch() {
        return canSearch;
    }

    public void setCanSearch(Boolean canSearch) {
        this.canSearch = canSearch;
    }

    public Boolean getCanPlayVideos() {
        return canPlayVideos;
    }

    public void setCanPlayVideos(Boolean canPlayVideos) {
        this.canPlayVideos = canPlayVideos;
    }
}

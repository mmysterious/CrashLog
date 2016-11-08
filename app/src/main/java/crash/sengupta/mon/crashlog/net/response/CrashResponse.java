package crash.sengupta.mon.crashlog.net.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mondrita on 11/8/16.
 */
public class CrashResponse {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("displayReason")
    @Expose
    private Object displayReason;
    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("isSymbolized")
    @Expose
    private String isSymbolized;
    @SerializedName("lastOccurred")
    @Expose
    private String lastOccurred;
    @SerializedName("uniqueSessionCount")
    @Expose
    private Integer uniqueSessionCount;
    @SerializedName("sessionCount")
    @Expose
    private Integer sessionCount;
    @SerializedName("suspectLine")
    @Expose
    private String suspectLine;

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason The reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return The displayReason
     */
    public Object getDisplayReason() {
        return displayReason;
    }

    /**
     * @param displayReason The displayReason
     */
    public void setDisplayReason(Object displayReason) {
        this.displayReason = displayReason;
    }

    /**
     * @return The hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * @param hash The hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The isSymbolized
     */
    public String getIsSymbolized() {
        return isSymbolized;
    }

    /**
     * @param isSymbolized The isSymbolized
     */
    public void setIsSymbolized(String isSymbolized) {
        this.isSymbolized = isSymbolized;
    }

    /**
     * @return The lastOccurred
     */
    public String getLastOccurred() {
        return lastOccurred;
    }

    /**
     * @param lastOccurred The lastOccurred
     */
    public void setLastOccurred(String lastOccurred) {
        this.lastOccurred = lastOccurred;
    }

    /**
     * @return The uniqueSessionCount
     */
    public Integer getUniqueSessionCount() {
        return uniqueSessionCount;
    }

    /**
     * @param uniqueSessionCount The uniqueSessionCount
     */
    public void setUniqueSessionCount(Integer uniqueSessionCount) {
        this.uniqueSessionCount = uniqueSessionCount;
    }

    /**
     * @return The sessionCount
     */
    public Integer getSessionCount() {
        return sessionCount;
    }

    /**
     * @param sessionCount The sessionCount
     */
    public void setSessionCount(Integer sessionCount) {
        this.sessionCount = sessionCount;
    }

    /**
     * @return The suspectLine
     */
    public String getSuspectLine() {
        return suspectLine;
    }

    /**
     * @param suspectLine The suspectLine
     */
    public void setSuspectLine(String suspectLine) {
        this.suspectLine = suspectLine;
    }

}


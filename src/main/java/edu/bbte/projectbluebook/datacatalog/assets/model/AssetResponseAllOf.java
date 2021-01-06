package edu.bbte.projectbluebook.datacatalog.assets.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.bbte.projectbluebook.datacatalog.assets.model.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssetResponseAllOf
 */

public class AssetResponseAllOf  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("createdAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  @JsonProperty("ownerId")
  private String ownerId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("shortDescription")
  private String shortDescription;

  @JsonProperty("location")
  private Location location;

  /**
   * The file format of the asset. 
   */
  public enum FormatEnum {
    CSV("csv"),
    
    JSON("json");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("format")
  private FormatEnum format;

  @JsonProperty("namespace")
  private String namespace;

  public AssetResponseAllOf id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the asset.
   * @return id
  */
  @ApiModelProperty(value = "Unique identifier of the asset.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssetResponseAllOf createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date of creation.
   * @return createdAt
  */
  @ApiModelProperty(value = "Date of creation.")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AssetResponseAllOf updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Date of the last update.
   * @return updatedAt
  */
  @ApiModelProperty(value = "Date of the last update.")

  @Valid

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AssetResponseAllOf ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The id of the user who owns the Asset.
   * @return ownerId
  */
  @ApiModelProperty(value = "The id of the user who owns the Asset.")


  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public AssetResponseAllOf name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A short name of the data asset.
   * @return name
  */
  @ApiModelProperty(example = "Iris Dataset", value = "A short name of the data asset.")

@Size(min=3,max=120) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssetResponseAllOf description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A longer description about the content of the data asset.
   * @return description
  */
  @ApiModelProperty(example = "This is perhaps the best known database to be found in the pattern recognition literature. Fisher's paper is a classic in the field and is referenced frequently to this day. (See Duda & Hart, for example.) The data set contains 3 classes of 50 instances each, where each class refers to a type of iris plant. One class is linearly separable from the other 2; the latter are NOT linearly separable from each other.", value = "A longer description about the content of the data asset.")

@Size(min=3) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssetResponseAllOf shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Short description breifly definig an asset.
   * @return shortDescription
  */
  @ApiModelProperty(example = "This is perhaps the best known database to be found in the pattern recognition literature.", value = "Short description breifly definig an asset.")

@Size(max=300) 
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public AssetResponseAllOf location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public AssetResponseAllOf format(FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * The file format of the asset. 
   * @return format
  */
  @ApiModelProperty(example = "csv", value = "The file format of the asset. ")


  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public AssetResponseAllOf namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The namespace of the asset. An asset has one namespace, which can be used to group assets together (eg. by projects).
   * @return namespace
  */
  @ApiModelProperty(example = "flowerproject", value = "The namespace of the asset. An asset has one namespace, which can be used to group assets together (eg. by projects).")


  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetResponseAllOf assetResponseAllOf = (AssetResponseAllOf) o;
    return Objects.equals(this.id, assetResponseAllOf.id) &&
        Objects.equals(this.createdAt, assetResponseAllOf.createdAt) &&
        Objects.equals(this.updatedAt, assetResponseAllOf.updatedAt) &&
        Objects.equals(this.ownerId, assetResponseAllOf.ownerId) &&
        Objects.equals(this.name, assetResponseAllOf.name) &&
        Objects.equals(this.description, assetResponseAllOf.description) &&
        Objects.equals(this.shortDescription, assetResponseAllOf.shortDescription) &&
        Objects.equals(this.location, assetResponseAllOf.location) &&
        Objects.equals(this.format, assetResponseAllOf.format) &&
        Objects.equals(this.namespace, assetResponseAllOf.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, ownerId, name, description, shortDescription, location, format, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetResponseAllOf {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}




# Pet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**category** | [**Category**](Category.md) |  |  [optional] |
|**name** | **String** |  |  |
|**photoUrls** | **Set&lt;String&gt;** |  |  |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |
|**status** | [**Status**](#Status) | pet status in the store |  [optional] |



## Enum: Status

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| PENDING | &quot;pending&quot; |
| SOLD | &quot;sold&quot; |


## Implemented Interfaces

* Parcelable



# NOTE: This file is auto generated by OpenAPI Generator 6.6.5-amadeus (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.NullableClass do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :integer_prop,
    :number_prop,
    :boolean_prop,
    :string_prop,
    :date_prop,
    :datetime_prop,
    :array_nullable_prop,
    :array_and_items_nullable_prop,
    :array_items_nullable,
    :object_nullable_prop,
    :object_and_items_nullable_prop,
    :object_items_nullable
  ]

  @type t :: %__MODULE__{
    :integer_prop => integer() | nil,
    :number_prop => float() | nil,
    :boolean_prop => boolean() | nil,
    :string_prop => String.t | nil,
    :date_prop => Date.t | nil,
    :datetime_prop => DateTime.t | nil,
    :array_nullable_prop => [map()] | nil,
    :array_and_items_nullable_prop => [map()] | nil,
    :array_items_nullable => [map()] | nil,
    :object_nullable_prop => %{optional(String.t) => map()} | nil,
    :object_and_items_nullable_prop => %{optional(String.t) => map()} | nil,
    :object_items_nullable => %{optional(String.t) => map()} | nil
  }
end

defimpl Poison.Decoder, for: OpenapiPetstore.Model.NullableClass do
  import OpenapiPetstore.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:date_prop, :date, nil, options)
  end
end


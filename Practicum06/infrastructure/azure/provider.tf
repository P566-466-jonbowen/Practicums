terraform {
  required_providers {
    azurerm = {
      source = "hashicorp/azurerm"
    }
    azapi = {
      source = "Azure/azapi"
    }
  }

  required_version = ">= 1.5.6"
  }

provider "azurerm" {
  subscription_id = "a2c3e885-f69e-433e-bb32-1a383326d4c5"
  features {

    resource_group {
      prevent_deletion_if_contains_resources = false
    }
  }
}

provider "azapi" {}
package com.taurus.repository

import com.taurus.repository.remote.Status

class Resource<T> private constructor(val status: Status, val data: T?) {
  companion object {
    fun <T> error() = Resource(Status.ERROR, null)
    fun <T> success(data: T) = Resource(Status.SUCCESS, data)
    fun <T> loading(data: T) = Resource(Status.LOADING, data)
  }
}
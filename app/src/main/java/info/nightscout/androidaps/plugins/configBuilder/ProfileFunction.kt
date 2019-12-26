package info.nightscout.androidaps.plugins.configBuilder

import info.nightscout.androidaps.data.Profile
import info.nightscout.androidaps.data.ProfileStore
import info.nightscout.androidaps.db.ProfileSwitch

interface ProfileFunction {
    fun getProfileName(): String?
    fun getProfileName(customized: Boolean): String
    fun getProfileNameWithDuration(): String
    fun getProfileName(time: Long, customized: Boolean, showRemainingTime: Boolean): String
    fun isProfileValid(from: String): Boolean
    fun getProfile(): Profile?
    fun getUnits(): String
    fun getProfile(time: Long): Profile?
    fun prepareProfileSwitch(profileStore: ProfileStore, profileName: String, duration: Int, percentage: Int, timeShift: Int, date: Long): ProfileSwitch
    fun doProfileSwitch(profileStore: ProfileStore, profileName: String, duration: Int, percentage: Int, timeShift: Int, date: Long)
    fun doProfileSwitch(duration: Int, percentage: Int, timeShift: Int)
}
package net.ivpn.core.rest.data.wireguard;

/*
 IVPN Android app
 https://github.com/ivpn/android-app

 Created by Oleksandr Mykhailenko.
 Copyright (c) 2020 Privatus Limited.

 This file is part of the IVPN Android app.

 The IVPN Android app is free software: you can redistribute it and/or
 modify it under the terms of the GNU General Public License as published by the Free
 Software Foundation, either version 3 of the License, or (at your option) any later version.

 The IVPN Android app is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 details.

 You should have received a copy of the GNU General Public License
 along with the IVPN Android app. If not, see <https://www.gnu.org/licenses/>.
*/

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddWireGuardPublicKeyResponse {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("ip_address")
    @Expose
    private String ipAddress;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("kem_cipher1")
    @Expose
    private String kemCipher1;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getKemCipher1() { return kemCipher1; }

    public void setKemCipher1(String kemCipher1) {
        this.kemCipher1 = kemCipher1;
    }

    @Override
    public String toString() {
        return "AddWireGuardPublicKeyResponse{" +
                "result='" + result + '\'' +
                ", status=" + status +
                ", ipAddress='" + ipAddress + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

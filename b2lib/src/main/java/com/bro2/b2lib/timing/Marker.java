package com.bro2.b2lib.timing;

import android.text.TextUtils;

/**
 * Created by Bro2 on 2017/9/6
 */

public class Marker {
    private final String mId;
    private final Object mAttachment;

    public Marker(String id) {
        this(id, null);
    }

    public Marker(String id, Object attachment) {
        mId = id;
        mAttachment = attachment;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Marker)) {
            return false;
        }

        Marker marker = (Marker) obj;
        if (!TextUtils.equals(mId, marker.mId)) {
            return false;
        }

        if (mAttachment == null) {
            return marker.mAttachment == null;
        }

        return mAttachment.equals(marker.mAttachment);
    }

    @Override
    public int hashCode() {
        int code = 17;
        code += 31 * code + mId.hashCode();

        if (mAttachment != null) {
            code += 31 * code + mAttachment.hashCode();
        }
        return code;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ID: ");
        builder.append(mId);
        builder.append(" Attachment: ");
        builder.append(mAttachment);
        return builder.toString();
    }
}
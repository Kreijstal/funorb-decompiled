/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityCheck {
    private boolean complete;
    static String field_b;
    private boolean available;
    static int field_c;
    private String email;

    final boolean isAvailable(byte param0) {
        if (param0 != -20) {
          EmailAvailabilityCheck.clearSharedReferences((byte) 88);
          return this.available;
        }
        return this.available;
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = -87 / ((param0 - 62) / 54);
        field_b = null;
    }

    final String getEmail(int param0) {
        if (param0 != 4) {
          this.getEmail(-61);
          return this.email;
        }
        return this.email;
    }

    final boolean isComplete(int param0) {
        if (param0 != 4) {
          return false;
        }
        return this.complete;
    }

    final void complete(int param0, boolean param1) {
        if (param0 == 7861) {
          this.available = param1 ? true : false;
          this.complete = true;
          return;
        }
        EmailAvailabilityCheck.clearSharedReferences((byte) -96);
        this.available = param1 ? true : false;
        this.complete = true;
    }

    EmailAvailabilityCheck(String param0) {
        this.complete = false;
        this.available = false;
        try {
          this.email = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 4;
        field_b = "Press the <%0>,<%1>,<%2> and <%3> keys to move";
    }
}

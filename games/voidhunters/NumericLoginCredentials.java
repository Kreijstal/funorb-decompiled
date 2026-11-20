/*
 * Decompiled by CFR-JS 0.4.0.
 */
class NumericLoginCredentials extends LoginCredentials {
    static int field_f;
    private long encodedIdentifier;
    static SoftLruCache field_d;
    private String password;

    public static void clearSharedReferences(byte param0) {
        if (param0 < 27) {
          return;
        }
        field_d = null;
    }

    LoginCredentialType getType(byte param0) {
        int var2 = -127 % ((param0 + 7) / 56);
        return GetTorpedoReload.numericCredentialType;
    }

    NumericLoginCredentials(long param0, String param1) {
        try {
          this.encodedIdentifier = param0;
          this.password = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "us.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void write(PacketBuffer param0, int param1) {
        try {
          if (param1 != -26216) {
            field_f = 54;
          }
          param0.writeLong(this.encodedIdentifier, 90);
          param0.writeBase38Name((byte) -53, this.password);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "us.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_f = 8;
        field_d = new SoftLruCache(64);
    }
}

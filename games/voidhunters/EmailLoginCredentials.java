/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailLoginCredentials extends LoginCredentials {
    private String password;
    private String email;
    static String field_e;

    public static void clearSharedReferences(byte param0) {
        int var1 = 121 % ((-54 - param0) / 33);
        field_e = null;
    }

    final LoginCredentialType getType(byte param0) {
        int var2 = -125 % ((param0 + 7) / 56);
        return GetSalvoDamageMultiplier.emailCredentialType;
    }

    final void write(PacketBuffer param0, int param1) {
        try {
          param0.writeCircumfixedString((byte) 0, this.email);
          param0.writeBase38Name((byte) -53, this.password);
          if (param1 != -26216) {
            this.password = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cfa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static UiTextStyle getValidationStatusStyle(byte param0) {
        if (param0 <= -66) {
          if (null == PerlinNoiseVolumeGenerator.validationStatusStyle) {
            PerlinNoiseVolumeGenerator.validationStatusStyle = new UiTextStyle(SetTorpedoProjectileLife.field_o, 20, 0, 0, 0, 11579568, -1, 0, 0, SetTorpedoProjectileLife.field_o.maxAscent, -1, 2147483647, true);
          }
          return PerlinNoiseVolumeGenerator.validationStatusStyle;
        }
        EmailLoginCredentials.clearSharedReferences((byte) 108);
        if (null == PerlinNoiseVolumeGenerator.validationStatusStyle) {
          PerlinNoiseVolumeGenerator.validationStatusStyle = new UiTextStyle(SetTorpedoProjectileLife.field_o, 20, 0, 0, 0, 11579568, -1, 0, 0, SetTorpedoProjectileLife.field_o.maxAscent, -1, 2147483647, true);
        }
        return PerlinNoiseVolumeGenerator.validationStatusStyle;
    }

    EmailLoginCredentials(String param0, String param1) {
        try {
          this.email = param0;
          this.password = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cfa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Offensive account name";
    }
}

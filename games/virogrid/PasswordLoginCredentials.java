/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordLoginCredentials extends LoginCredentials {
    static String field_m;
    private String field_i;
    static IntrusiveDeque field_h;
    static float field_k;
    private String field_e;
    static String field_j;
    static long field_n;
    static boolean field_l;
    static UiTheme field_g;
    static String field_f;

    final LoginCredentialType getCredentialType(boolean param0) {
        if (!param0) {
          PasswordLoginCredentials.resetLoginState((byte) 48);
          return RasterSnapshot.field_r;
        }
        return RasterSnapshot.field_r;
    }

    final static void resetLoginState(byte param0) {
        ChatPanelSetupHelpers.field_c = false;
        NameEntryPopup.field_Fb = false;
        if (param0 < -113) {
          DualLinkHashTable.setLoginResultCode(-1, -1);
          MouseWheelInput.field_c = ClientServiceHelpers.field_e;
          MusicVoiceMixer.field_l = ClientServiceHelpers.field_e;
          return;
        }
        PasswordLoginCredentials.resetLoginState((byte) -39);
        DualLinkHashTable.setLoginResultCode(-1, -1);
        MouseWheelInput.field_c = ClientServiceHelpers.field_e;
        MusicVoiceMixer.field_l = ClientServiceHelpers.field_e;
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_m = null;
        if (param0 == 31856) {
          field_h = null;
          field_j = null;
          field_f = null;
          return;
        }
        PasswordLoginCredentials.resetLoginState((byte) -109);
        field_h = null;
        field_j = null;
        field_f = null;
    }

    PasswordLoginCredentials(String param0, String param1) {
        try {
          this.field_i = param1;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeTo(boolean param0, PacketBuffer param1) {
        if (param0) {
          return;
        }
        try {
          param1.writeZeroPrefixedString(this.field_e, (byte) 112);
          param1.writeBase38Name(this.field_i, (byte) 82);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "vi.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Members";
        field_j = "Invite only";
        field_h = new IntrusiveDeque();
        field_f = "No";
    }
}

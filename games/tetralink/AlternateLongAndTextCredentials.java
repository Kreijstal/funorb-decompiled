/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlternateLongAndTextCredentials extends LongAndTextCredentials {
    static String field_q;
    static IntrusiveDeque field_p;
    static int[] field_n;
    static QuickChatMenu field_o;

    AlternateLongAndTextCredentials(long param0, String param1) {
        super(param0, param1);
    }

    final LoginCredentialType getCredentialType(byte param0) {
        if (param0 > -77) {
          return (LoginCredentialType) null;
        }
        return CommonUiHelpers.field_h;
    }

    final static void drawActivePopup(boolean param0, byte param1) {
        if (null != AccountServerResult.field_g) {
          SoftwareRasterizer.darkenRectangle(SoftwareRasterizer.field_j, SoftwareRasterizer.field_i, -SoftwareRasterizer.field_j + SoftwareRasterizer.field_l, -SoftwareRasterizer.field_i + SoftwareRasterizer.field_g);
          AccountServerResult.field_g.drawFullScreen(param0, 256);
          if (param1 != 24) {
            AlternateLongAndTextCredentials.drawActivePopup(true, (byte) -84);
            return;
          }
          return;
        }
        if (param1 == 24) {
          return;
        }
        AlternateLongAndTextCredentials.drawActivePopup(true, (byte) -84);
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        field_o = null;
        field_q = null;
        if (param0 != 24943) {
          field_n = (int[]) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    final static void setTargetFrameRate(byte param0, int param1) {
        CacheEntry.field_B = 1000000000L / (long)param1;
        if (param0 <= 121) {
          field_p = (IntrusiveDeque) null;
        }
    }

    static {
        field_q = "Hotseat multiplayer game";
    }
}

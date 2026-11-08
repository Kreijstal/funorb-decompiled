/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NineSliceFrame {
    static int field_b;
    static int[] field_a;
    static boolean[] field_d;
    static String field_c;
    private Sprite[] field_e;
    static String field_f;

    final void drawFrame(int param0, int param1, byte param2, int param3, int param4) {
        NineSliceFrameHelpers.drawNineSliceFrame(param3, (byte) -36, this.field_e, param1, param4, param0);
        int var6 = 11 % ((-72 - param2) / 50);
    }

    final static Archive createArchive(int param0, int param1) {
        int var2 = 33 / ((param0 - 4) / 40);
        return ArchiveFactoryHelpers.createResourceArchive(false, param1, false, 1, (byte) 38, true);
    }

    final static void resetTooltipState(byte param0) {
        WeightedLruCache.field_i = 0;
        NetworkGameClient.field_z = -1;
        TooltipTextGlobals.field_c = null;
        BufferedSocket.field_s = false;
        AccountCreationDialog.field_Db = -1;
        if (param0 != -83) {
          field_b = 56;
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 >= 115) {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
        field_f = (String) null;
        field_f = null;
        field_d = null;
        field_c = null;
    }

    final static void showLoginForm(int param0, String param1, String param2) {
        try {
          if (null != BufferedSocket.field_u) {
            BufferedSocket.field_u.closeDialog(-127);
          }
          ChatReceiveHelpers.field_c = new LoginPanel(param2, param1, false, true, true);
          if (param0 != -1) {
            field_a = (int[]) null;
          }
          PasswordValidator.field_u.transitionToContent(ChatReceiveHelpers.field_c, param0 - 27666);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ve.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void setMusicVolume(int param0, int param1) {
        FontAndFrameStyleHelpers.field_a = param0;
        if (param1 > 18) {
          if (SharedPanelFactory.field_b != null) {
            SharedPanelFactory.field_b.setMasterVolume((byte) 98, param0);
          }
          if (ProxyAuthenticationRequiredException.field_c != null) {
            ProxyAuthenticationRequiredException.field_c.setVolume(param0, 1);
          }
          return;
        }
        field_f = (String) null;
        if (SharedPanelFactory.field_b != null) {
          SharedPanelFactory.field_b.setMasterVolume((byte) 98, param0);
        }
        if (ProxyAuthenticationRequiredException.field_c != null) {
          ProxyAuthenticationRequiredException.field_c.setVolume(param0, 1);
        }
    }

    NineSliceFrame(Sprite[] param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Show chat (1 unread message)";
        field_f = "The following settings need to be changed:  ";
    }
}

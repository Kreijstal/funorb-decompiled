/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterSnapshot extends IntrusiveNode {
    static String field_s;
    int[] field_p;
    int field_q;
    static FrameSkin field_l;
    int field_k;
    int field_v;
    static String field_m;
    int field_t;
    static LoginCredentialType field_r;
    int field_i;
    static Sprite[] frameBottomSprites;
    int field_o;
    static int field_n;
    static Sprite displayNameChangedIcon;
    static ModelMesh field_h;
    static int field_w;
    static int field_g;

    final static void handleSocialNameEntry(int param0, boolean param1, int param2) {
        CharSequence var31 = null;
        Object var5 = null;
        String var4 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        if (LobbyGame.field_Xb == null) {
          if (param0 != 7377) {
            RasterSnapshot.releaseStatics(119);
            return;
          }
          return;
        }
        int var3 = LobbyGame.field_Xb.updateNameEntry(param1, param0 ^ -29471);
        if (0 == var3) {
          if (param0 == 7377) {
            return;
          }
          RasterSnapshot.releaseStatics(119);
          return;
        }
        if (var3 == 2 &&
          LobbyGame.field_Xb.field_V != null) {
          if (LobbyGame.field_Xb.field_V.equals("")) {
            LobbyGame.field_Xb = null;
            AccountDialogHelpers.field_d = -1;
            if (param0 != 7377) {
              RasterSnapshot.releaseStatics(119);
              return;
            }
            return;
          }
          if (LobbyGame.field_Xb.field_V.charAt(0) == 91) {
            var4 = LobbyGame.field_Xb.field_V;
          } else {
            var31 = (CharSequence) ((Object) LobbyGame.field_Xb.field_V);
            var4 = DisplayNameHelpers.normalizeDisplayName(var31, true);
          }
          var5 = null;
          if (0 == AccountDialogHelpers.field_d) {
            var5 = BirthDateEntryPanel.requestAddFriend((byte) 73, var4, param2);
          }
          if (AccountDialogHelpers.field_d == 1) {
            var5 = BoundedUrlRequest.requestRemoveFriend(var4, true, param2);
          }
          if (AccountDialogHelpers.field_d == 2) {
            var5 = ChatAndIgnoreHelpers.requestAddIgnore(var4, -128, param2);
          }
          if (AccountDialogHelpers.field_d == 3) {
            var5 = BoundedUrlRequest.requestRemoveIgnore(var4, param2, (byte) 60, var4);
          }
          if (var5 != null) {
            String var6 = (String) null;
            ArrayWidgetContainer.addChatMessage(var4, 0, false, (String) (var5), 2, (String) null);
            LobbyGame.field_Xb = null;
            AccountDialogHelpers.field_d = -1;
            if (param0 != 7377) {
              RasterSnapshot.releaseStatics(119);
              return;
            }
            return;
          }
        }
        LobbyGame.field_Xb = null;
        AccountDialogHelpers.field_d = -1;
        if (param0 != 7377) {
          RasterSnapshot.releaseStatics(119);
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        displayNameChangedIcon = null;
        field_s = null;
        field_l = null;
        frameBottomSprites = null;
        field_m = null;
        if (param0 >= 104) {
          field_r = null;
          return;
        }
        frameBottomSprites = (Sprite[]) null;
        field_r = null;
    }

    RasterSnapshot() {
    }

    final void capture(int[] param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_q = param4;
          this.field_p = param0;
          this.field_v = param5;
          this.field_o = param1;
          this.field_i = param2;
          this.field_t = param7;
          if (param3 != -45) {
            this.field_k = 79;
          }
          this.field_k = param6;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "qg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_m = "Orb points: ";
        field_s = "No players";
        field_r = new LoginCredentialType(3);
    }
}

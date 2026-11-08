/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static vd field_b;
    static long field_d;
    static String field_c;
    static String field_a;
    static String field_f;
    static int field_e;

    public static void releaseStatics(int param0) {
        field_f = null;
        field_a = null;
        int var1 = 91 % ((param0 - 56) / 62);
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
          MusicCrossfadeStream.field_z.field_S = param1;
          LobbyStateHelpers.field_b = true;
          var2_int = Checkbox.field_bb.field_c;
          var3 = Checkbox.field_bb.field_i;
          var4 = MusicCrossfadeStream.field_z.field_L.paragraphHeight(param1, 272, MusicCrossfadeStream.field_z.field_Ib);
          var5 = -110 + (var3 / 2 + 7 - var4 / 2);
          TeamColourTinter.field_b.setBounds(0, var5, -(var5 * 2) - 120 + var3, (var2_int - 320) / 2, param0);
          TeamColourTinter.field_b.field_I = PopupMenuSupport.buildSolidFrameSprites(3, 2105376, 11579568, TeamColourTinter.field_b.field_Lb, 8421504, param0 ^ 13382);
          MusicCrossfadeStream.field_z.setBounds(param0 - 320, 16, -24 + (TeamColourTinter.field_b.field_Lb - 20), 24, -24 + (TeamColourTinter.field_b.field_zb - 24));
          LoginForm.field_gb.setBounds(0, -20 + (TeamColourTinter.field_b.field_Lb - 24), 24, 120, 80);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "vf.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String var4 = null;
        rh var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          var5 = (rh) (QuickChatHelpDialog.field_Vb.first(13058));
          while (var5 != null) {
            PasswordValidator.a(param1, -103, var5);
            var5 = (rh) (QuickChatHelpDialog.field_Vb.next((byte) -92));
          }
          var2 = RegistrationRequestDialog.field_Ub.first(13058);
          while (var2 != null) {
            HighscoreSubmission.sendFlagRequest(87, param1);
            var2 = RegistrationRequestDialog.field_Ub.next((byte) -111);
          }
          if (!param0) {
            return;
          }
          var4 = (String) null;
          vf.a(4, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var2_ref), "vf.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = new vd();
        field_c = "MODULES";
        field_f = "Players";
        field_e = 360;
        field_a = "Previous";
    }
}

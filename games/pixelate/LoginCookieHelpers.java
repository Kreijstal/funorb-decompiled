/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginCookieHelpers {
    static SceneWidget field_c;
    static Sprite[] field_d;
    static String[] field_b;
    static int field_a;

    final static String getJoinFailureMessage(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        Object stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (3 == param2) {
            stackIn_3_0 = LoadingProgressDialog.field_ib;
            return stackIn_3_0;
          }
          if (param2 == 6) {
            stackIn_7_0 = Base37NameHelpers.field_c;
            return stackIn_7_0;
          }
          if (param2 == 7) {
            stackIn_10_0 = AlternateNameCredentials.field_l;
            return stackIn_10_0;
          }
          if (param2 == 8) {
            stackIn_14_0 = PairedTextColumns.field_Eb;
            return stackIn_14_0;
          }
          if (param2 == 9) {
            stackIn_18_0 = TutorialPageGlobals.field_c;
            return stackIn_18_0;
          }
          if (10 == param2) {
            stackIn_22_0 = EditableTextWidget.field_O;
            return stackIn_22_0;
          }
          if (param2 == 11) {
            stackIn_26_0 = AccountNamePrompt.field_Gb;
            return stackIn_26_0;
          }
          if (param2 == 14) {
            stackIn_29_0 = AlphaContainer.formatTemplate(Puzzle.field_m, 28, new String[]{param1});
            return stackIn_29_0;
          }
          if (param0 > 113) {
            return null;
          }
          field_b = (String[]) null;
          stackIn_33_0 = null;
          return (String) (stackIn_33_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("lg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String normalizeAccountName(int param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        ResourceArchive var9 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 == null) {
            stackIn_4_0 = ContextMenuHelpers.field_b;
            return stackIn_4_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = DisplayNameHelpers.normalizeDisplayName(param2, (byte) 97);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!MatchController.isNameSeparatorChar((byte) 122, var4.charAt(0)) &&
                !MatchController.isNameSeparatorChar((byte) 126, var4.charAt(-1 + var4.length()))) {
                if (param0 != 11) {
                  var9 = (ResourceArchive) null;
                  LoginCookieHelpers.loadMusicTracks(55, (ResourceArchive) null);
                }
                var5 = 0;
                for (var6 = 0; param2.length() > var6; var6++) {
                  var7 = param2.charAt(var6);
                  if (!MatchController.isNameSeparatorChar((byte) 118, (char) var7)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (2 <= var5 &&
                    !param1) {
                    stackIn_31_0 = AsyncValidationResult.field_f;
                    return stackIn_31_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_36_0 = MatchController.field_k;
                return stackIn_36_0;
              }
              stackIn_19_0 = MatchController.field_k;
              return stackIn_19_0;
            }
            stackIn_14_0 = ContextMenuHelpers.field_b;
            return stackIn_14_0;
          }
          stackIn_9_0 = ContextMenuHelpers.field_b;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("lg.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final static LoginMethod readLastLoginMethodCookie(java.applet.Applet param0, int param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        LoginMethod[] var3 = null;
        LoginMethod var5 = null;
        int var6 = 0;
        NineSliceFrame var7 = null;
        LoginMethod stackIn_6_0 = null;
        LoginMethod stackIn_12_0 = null;
        LoginMethod stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 != -18992) {
            var7 = (NineSliceFrame) null;
            LoginCookieHelpers.setMenuButtonStyle((NineSliceFrame) null, -23, -37, (NineSliceFrame) null, 119, 116);
          }
          var2 = PatchNoteUsage.readCookie(param0, "jagex-last-login-method", (byte) -85);
          if (var2 == null) {
            stackIn_6_0 = LoginMethodGlobals.field_c;
            return stackIn_6_0;
          }
          var3 = Checkbox.getLoginMethods((byte) -8);
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.hasName(var2, -66)) {
              stackIn_12_0 = var5;
              return stackIn_12_0;
            }
          }
          stackIn_15_0 = LoginMethodGlobals.field_c;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("lg.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        int var1 = -115 / ((param0 + 84) / 35);
    }

    final static void loadMusicTracks(int param0, ResourceArchive param1) {
        try {
          ChallengePuzzleHelpers.field_c[0] = MusicTrack.load(param1, "", "pix_title");
          ChallengePuzzleHelpers.field_c[1] = MusicTrack.load(param1, "", "pix_end_game");
          ChallengePuzzleHelpers.field_c[2] = MusicTrack.load(param1, "", "skin1");
          ChallengePuzzleHelpers.field_c[param0] = MusicTrack.load(param1, "", "skin8");
          ChallengePuzzleHelpers.field_c[4] = MusicTrack.load(param1, "", "skin2");
          ChallengePuzzleHelpers.field_c[5] = MusicTrack.load(param1, "", "skin9");
          ChallengePuzzleHelpers.field_c[6] = MusicTrack.load(param1, "", "skin3");
          ChallengePuzzleHelpers.field_c[7] = MusicTrack.load(param1, "", "skin16");
          ChallengePuzzleHelpers.field_c[8] = MusicTrack.load(param1, "", "skin4");
          ChallengePuzzleHelpers.field_c[9] = MusicTrack.load(param1, "", "skin11");
          ChallengePuzzleHelpers.field_c[10] = MusicTrack.load(param1, "", "skin12");
          ChallengePuzzleHelpers.field_c[11] = MusicTrack.load(param1, "", "skin7");
          ChallengePuzzleHelpers.field_c[12] = MusicTrack.load(param1, "", "skin5");
          ChallengePuzzleHelpers.field_c[13] = MusicTrack.load(param1, "", "skin6");
          ChallengePuzzleHelpers.field_c[14] = MusicTrack.load(param1, "", "skin13");
          ChallengePuzzleHelpers.field_c[15] = MusicTrack.load(param1, "", "skin14");
          ChallengePuzzleHelpers.field_c[16] = MusicTrack.load(param1, "", "skin15");
          ChallengePuzzleHelpers.field_c[17] = MusicTrack.load(param1, "", "skin10");
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "lg.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void setMenuButtonStyle(NineSliceFrame param0, int param1, int param2, NineSliceFrame param3, int param4, int param5) {
        try {
          ConnectionState.field_c = param5;
          MarkerSlider.field_N = param3;
          if (param2 >= -114) {
            LoginCookieHelpers.releaseStatics((byte) 57);
          }
          LoadingProgressDialog.field_fb = param4;
          AccountTermsPanel.field_J = param1;
          AudioService.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "lg.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static java.net.URL withSessionParameters(boolean param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var5 = (CharSequence) null;
            LoginCookieHelpers.normalizeAccountName(-66, true, (CharSequence) null);
          }
          var3 = null;
          var4 = null;
          if (null != ArchiveProvider.field_c &&
            !ArchiveProvider.field_c.equals(param1.getParameter("settings"))) {
            var3 = ArchiveProvider.field_c;
            var4 = var3;
            var4 = var3;
          }
          if (null != DirectByteStorage.field_n &&
            !DirectByteStorage.field_n.equals(param1.getParameter("session"))) {
            var4 = DirectByteStorage.field_n;
          }
          stackIn_10_0 = UrlRewriteHelpers.rewriteUrlPathParameters(-102, param2, (String) (var3), (String) (var4), -1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("lg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_b = new String[255];
        field_d = new Sprite[2];
    }
}

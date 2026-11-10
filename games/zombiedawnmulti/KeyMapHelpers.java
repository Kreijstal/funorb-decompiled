/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyMapHelpers {
    static String field_h;
    static String field_f;
    static String field_g;
    static String field_a;
    static ScrollPane field_d;
    static String field_c;
    static String field_b;
    static String field_e;

    public static void releaseStatics(int param0) {
        field_e = null;
        field_h = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_g = null;
        if (param0 == 10066329) {
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void resetTransferErrorCounters(byte param0) {
        SharedTransportGlobals.field_a.field_n = 0;
        if (param0 >= -87) {
          KeyMapHelpers.releaseStatics(-65);
          SharedTransportGlobals.field_a.field_p = 0;
          return;
        }
        SharedTransportGlobals.field_a.field_p = 0;
    }

    final static void insertNodeAfter(IntrusiveNode param0, IntrusiveNode param1, boolean param2) {
        try {
          if (param1.next != null) {
            param1.unlink(true);
          }
          if (!param2) {
            KeyMapHelpers.configurePunctuationKeys((byte) -38);
          }
          param1.next = param0.next;
          param1.previous = param0;
          param1.next.previous = param1;
          param1.previous.next = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vc.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void configurePunctuationKeys(byte param0) {
        DialSelectorWidget.field_V[92] = 74;
        DialSelectorWidget.field_V[44] = 71;
        DialSelectorWidget.field_V[46] = 72;
        DialSelectorWidget.field_V[93] = 43;
        DialSelectorWidget.field_V[45] = 26;
        DialSelectorWidget.field_V[61] = 27;
        DialSelectorWidget.field_V[91] = 42;
        DialSelectorWidget.field_V[192] = 28;
        if (param0 >= 41) {
          DialSelectorWidget.field_V[222] = 58;
          DialSelectorWidget.field_V[520] = 59;
          DialSelectorWidget.field_V[59] = 57;
          DialSelectorWidget.field_V[47] = 73;
          return;
        }
        field_h = (String) null;
        DialSelectorWidget.field_V[222] = 58;
        DialSelectorWidget.field_V[520] = 59;
        DialSelectorWidget.field_V[59] = 57;
        DialSelectorWidget.field_V[47] = 73;
    }

    final static boolean canResizeViewport(int param0) {
        if (param0 != 4996418) {
          return true;
        }
        if (LevelFileEntry.field_i == null) {
          return false;
        }
        if (!LevelFileEntry.field_i.handleNormalizedNameKey(124)) {
          return false;
        }
        return true;
    }

    final static void mapTextColoursToPalette(boolean param0) {
        int[] var6 = null;
        int[] var5 = null;
        int[] var4 = null;
        int[] array$0 = null;
        int var2 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!param0) {
            field_h = (String) null;
          }
          MarkerSliderWidget.field_Q[0] = TranslatedUiText.field_e.findNearestBasePaletteIndex(16711680);
          MarkerSliderWidget.field_Q[1] = TranslatedUiText.field_e.findNearestBasePaletteIndex(7829248);
          MarkerSliderWidget.field_Q[2] = TranslatedUiText.field_e.findNearestBasePaletteIndex(16776960);
          MarkerSliderWidget.field_Q[3] = TranslatedUiText.field_e.findNearestBasePaletteIndex(30464);
          MarkerSliderWidget.field_Q[4] = TranslatedUiText.field_e.findNearestBasePaletteIndex(65280);
          MarkerSliderWidget.field_Q[5] = TranslatedUiText.field_e.findNearestBasePaletteIndex(30583);
          MarkerSliderWidget.field_Q[6] = TranslatedUiText.field_e.findNearestBasePaletteIndex(65535);
          MarkerSliderWidget.field_Q[7] = TranslatedUiText.field_e.findNearestBasePaletteIndex(119);
          MarkerSliderWidget.field_Q[8] = TranslatedUiText.field_e.findNearestBasePaletteIndex(255);
          MarkerSliderWidget.field_Q[9] = TranslatedUiText.field_e.findNearestBasePaletteIndex(16745473);
          PasswordValidator.field_s = TranslatedUiText.field_e.findNearestBasePaletteIndex(16777215);
          RubbleChunk.field_F = TranslatedUiText.field_e.findNearestBasePaletteIndex(6710886);
          var6 = TranslatedUiText.field_e.colorPalettes[0];
          var5 = var6;
          var4 = var5;
          int[] var1 = var4;
          TranslatedUiText.field_e.colorPalettes = new int[13][];
          TranslatedUiText.field_e.colorPalettes[0] = var6;
          array$0 = new int[TranslatedUiText.field_e.colorPalettes[0].length];
          TranslatedUiText.field_e.colorPalettes[4] = array$0;
          for (var2 = 0; TranslatedUiText.field_e.colorPalettes[4].length > var2; var2++) {
            TranslatedUiText.field_e.colorPalettes[4][var2] = 16777215;
          }
          FontPaletteHelpers.defineFontColourPalette(16777215, 2, -17895, 65793, 13369344);
          FontPaletteHelpers.defineFontColourPalette(4194304, 0, -17895, 8388608, 16711680);
          FontPaletteHelpers.defineFontColourPalette(16777215, 1, -17895, 65793, 5481009);
          FontPaletteHelpers.defineFontColourPalette(4210688, 3, -17895, 8421376, 16776960);
          FontPaletteHelpers.defineFontColourPalette(0, 5, -17895, 0, 0);
          FontPaletteHelpers.defineFontColourPalette(0, 6, -17895, 4473924, 10066329);
          FontPaletteHelpers.defineFontColourPalette(16777215, 7, -17895, 4473924, 10066329);
          FontPaletteHelpers.defineFontColourPalette(0, 8, -17895, 4996418, 14540253);
          FontPaletteHelpers.defineFontColourPalette(0, 9, -17895, 16777215, 14540253);
          FontPaletteHelpers.defineFontColourPalette(4096, 10, -17895, 16384, 5481009);
          FontPaletteHelpers.defineFontColourPalette(16777215, 11, -17895, 4473924, 5481009);
          FontPaletteHelpers.defineFontColourPalette(4096, 12, -17895, 16384, 16556032);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vc.D(" + param0 + ')');
        }
    }

    static {
        field_f = "Your powerups will recharge faster.";
        field_a = "Select any target!";
        field_c = "Searching for opponents";
        field_g = "Report abuse";
        field_b = "These slots can only be unlocked with the appropriate traits.";
        field_h = "Who can join";
        field_e = "This is <%0>'s RuneScape clan if they have one.";
    }
}

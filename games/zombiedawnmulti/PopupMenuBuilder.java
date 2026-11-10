/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PopupMenuBuilder {
    int[] field_g;
    int[] field_G;
    int field_H;
    int field_d;
    int field_o;
    static String field_e;
    static int field_A;
    int field_n;
    boolean[] field_I;
    static boolean field_p;
    byte[][] field_z;
    static int[] field_J;
    static QuickChatCommandType field_w;
    static String field_L;
    byte[] field_C;
    int field_x;
    int[][] field_O;
    byte[] field_t;
    int field_D;
    int field_q;
    int[][] field_c;
    byte[] field_l;
    int field_K;
    int[] field_a;
    byte[] field_v;
    int[][] field_h;
    int field_b;
    byte[] field_r;
    int field_N;
    int field_P;
    boolean[] field_E;
    int field_F;
    byte field_j;
    int field_u;
    int field_s;
    static UiComponent field_B;
    byte[] field_k;
    int field_f;
    int[] field_m;
    static int field_M;
    static String field_i;
    static String field_y;

    final static boolean isNameSeparator(byte param0, char param1) {
        int var2;
        boolean stackIn_7_0 = false;
        var2 = 24 / ((param0 + 12) / 58);
        stackIn_7_0 = (160 == param1) || (param1 == 32) || (param1 == 95) || (param1 == 45);
        return stackIn_7_0;
    }

    final static Sprite[] buildSprites(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        Sprite[] var1 = new Sprite[ArchiveRequest.field_v];
        for (var2 = 0; var2 < ArchiveRequest.field_v; var2++) {
          var3 = AppearanceScreen.field_p[var2] * ThreeSliceButtonPainter.field_w[var2];
          var4 = MatchingTextValidator.field_t[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = UsernameAvailabilityValidator.field_t[ScrollPane.bitAnd((int) var4[var6], 255)];
          }
          var1[var2] = new Sprite(ContentTransitionDialog.field_nb, SpriteDecodeGlobals.field_a, PacketBuffer.field_i[var2], PowerupCommand.field_o[var2], ThreeSliceButtonPainter.field_w[var2], AppearanceScreen.field_p[var2], var5);
        }
        if (param0 <= 2) {
          PopupMenuBuilder.buildPopupMenu(true, false, -9);
        }
        PropObject.clearSpriteDecodeBuffers((byte) 127);
        return var1;
    }

    final static String formatSignedNumber(int param0, boolean param1, boolean param2) {
        if (!param2) {
          return (String) null;
        }
        if (param1 &&
          0 <= param0) {
          return HumanView.toRadixString(param0, param1, 10, -1);
        }
        return Integer.toString(param0);
    }

    final static void buildPopupMenu(boolean param0, boolean param1, int param2) {
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        String stackIn_75_2 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        boolean stackIn_89_2 = false;
        int stackIn_111_0 = 0;
        int stackIn_112_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          OptionsMenuScreen.field_q = param2;
          SectorCacheStore.field_c = true;
          if (OptionsMenuScreen.field_q == 0) {
            var3_int = MusicVoice.wrapBalancedText(BrowserPageHelpers.field_f, false, RankingEntry.field_e, QuitPageHelpers.field_e, TickButtonPainter.field_b);
            var4 = 3 + var3_int;
            TextWidgetPainter.field_m = new String[var4];
            MessageDialogContent.field_Q = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              MessageDialogContent.field_Q[var5] = -1;
            }
            LobbySlideLayout.field_b = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              TextWidgetPainter.field_m[var5] = QuitPageHelpers.field_e[var5];
            }
            TextWidgetPainter.field_m[-3 + var4] = "";
            TextWidgetPainter.field_m[-2 + var4] = ObjectFactoryHelpers.field_b;
            MessageDialogContent.field_Q[var4 - 2] = 0;
            LobbySlideLayout.field_b[0] = 4;
            TextWidgetPainter.field_m[var4 - 1] = LoginCredentials.field_f;
            MessageDialogContent.field_Q[var4 - 1] = 1;
            LobbySlideLayout.field_b[1] = 5;
          } else if (OptionsMenuScreen.field_q == 1) {
            var3_int = MusicVoice.wrapBalancedText(BrowserPageHelpers.field_f, false, RankingEntry.field_e, QuitPageHelpers.field_e, TickButtonPainter.field_b);
            var4 = var3_int + 2;
            MessageDialogContent.field_Q = new int[var4];
            TextWidgetPainter.field_m = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              MessageDialogContent.field_Q[var5] = -1;
            }
            LobbySlideLayout.field_b = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              TextWidgetPainter.field_m[var5] = QuitPageHelpers.field_e[var5];
            }
            TextWidgetPainter.field_m[var4 - 2] = "";
            TextWidgetPainter.field_m[var4 - 1] = LoginCredentials.field_f;
            MessageDialogContent.field_Q[var4 - 1] = 0;
            LobbySlideLayout.field_b[0] = 5;
          } else if (OptionsMenuScreen.field_q != 2) {
            if (OptionsMenuScreen.field_q == 3) {
              if (ArrayWidgetGroup.field_J.field_d) {
                var3_int = MusicVoice.wrapBalancedText(BrowserPageHelpers.field_f, param0, ArmedHumanView.field_sb, QuitPageHelpers.field_e, TickButtonPainter.field_b);
              } else {
                var3_int = MusicVoice.wrapBalancedText(BrowserPageHelpers.field_f, false, NanoTickClock.field_j, QuitPageHelpers.field_e, TickButtonPainter.field_b);
              }
              var4 = 2 + var3_int;
              MessageDialogContent.field_Q = new int[var4];
              TextWidgetPainter.field_m = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                MessageDialogContent.field_Q[var5] = -1;
              }
              LobbySlideLayout.field_b = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                TextWidgetPainter.field_m[var5] = QuitPageHelpers.field_e[var5];
              }
              TextWidgetPainter.field_m[-2 + var4] = "";
              TextWidgetPainter.field_m[-1 + var4] = LoginCredentials.field_f;
              MessageDialogContent.field_Q[-1 + var4] = 0;
              LobbySlideLayout.field_b[0] = 5;
            } else if (OptionsMenuScreen.field_q == 4) {
              var3_int = MusicVoice.wrapBalancedText(BrowserPageHelpers.field_f, false, ValidatedTextInputWidget.field_cb, QuitPageHelpers.field_e, TickButtonPainter.field_b);
              var4 = 2 + var3_int;
              TextWidgetPainter.field_m = new String[var4];
              MessageDialogContent.field_Q = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                MessageDialogContent.field_Q[var5] = -1;
              }
              LobbySlideLayout.field_b = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                TextWidgetPainter.field_m[var5] = QuitPageHelpers.field_e[var5];
              }
              TextWidgetPainter.field_m[var4 - 2] = "";
              TextWidgetPainter.field_m[var4 - 1] = LoginCredentials.field_f;
              MessageDialogContent.field_Q[var4 - 1] = 0;
              LobbySlideLayout.field_b[0] = 5;
            } else {
              if (OptionsMenuScreen.field_q != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = MusicVoice.wrapBalancedText(BrowserPageHelpers.field_f, false, CipherPacketBuffer.field_t, QuitPageHelpers.field_e, TickButtonPainter.field_b);
              var4 = 3 + var3_int;
              MessageDialogContent.field_Q = new int[var4];
              TextWidgetPainter.field_m = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                MessageDialogContent.field_Q[var5] = -1;
              }
              LobbySlideLayout.field_b = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                TextWidgetPainter.field_m[var5] = QuitPageHelpers.field_e[var5];
              }
              TextWidgetPainter.field_m[-3 + var4] = "";
              TextWidgetPainter.field_m[-2 + var4] = LayoutCenterHelpers.field_d;
              MessageDialogContent.field_Q[-2 + var4] = 0;
              LobbySlideLayout.field_b[0] = 3;
              TextWidgetPainter.field_m[var4 - 1] = LoginCredentials.field_f;
              MessageDialogContent.field_Q[-1 + var4] = 1;
              LobbySlideLayout.field_b[1] = 5;
            }
          } else {
            var3_int = MusicVoice.wrapBalancedText(BrowserPageHelpers.field_f, param0, QueuedListRequest.substituteTemplateArguments(MusicPatchPcmStream.field_l, new String[]{"<br><%0><br>"}, 2), QuitPageHelpers.field_e, TickButtonPainter.field_b);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(QuitPageHelpers.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            NanoTickClock.field_n = new String[var4];
            ArrayOperations.copy(QuitPageHelpers.field_e, 0, NanoTickClock.field_n, 0, var4);
            KeyboardStateHelpers.field_a = new String[var3_int - var4 - 1];
            ArrayOperations.copy(QuitPageHelpers.field_e, var4 + 1, KeyboardStateHelpers.field_a, 0, var3_int - var4 - 1);
            var4 = -1;
            var3_int = MusicVoice.wrapBalancedText(BrowserPageHelpers.field_f, false, QueuedListRequest.substituteTemplateArguments(FullscreenSupport.field_g, new String[]{"<br><%0><br>"}, 2), QuitPageHelpers.field_e, TickButtonPainter.field_b);
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(QuitPageHelpers.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            SineTableHelpers.field_a = new String[var4];
            ArrayOperations.copy(QuitPageHelpers.field_e, 0, SineTableHelpers.field_a, 0, var4);
            DialSelectorWidget.field_N = new String[var3_int - var4 - 1];
            ArrayOperations.copy(QuitPageHelpers.field_e, var4 + 1, DialSelectorWidget.field_N, 0, var3_int + (-var4 - 1));
            if (NanoTickClock.field_n.length >= SineTableHelpers.field_a.length) {
              stackIn_57_0 = NanoTickClock.field_n.length;
            } else {
              stackIn_57_0 = SineTableHelpers.field_a.length;
            }
            var5 = stackIn_57_0;
            if (DialSelectorWidget.field_N.length <= KeyboardStateHelpers.field_a.length) {
              stackIn_60_0 = KeyboardStateHelpers.field_a.length;
            } else {
              stackIn_60_0 = DialSelectorWidget.field_N.length;
            }
            var6 = stackIn_60_0;
            var7 = var6 + var5 + 7;
            TextWidgetPainter.field_m = new String[var7];
            MessageDialogContent.field_Q = new int[var7];
            for (var8 = 0; var7 > var8; var8++) {
              MessageDialogContent.field_Q[var8] = -1;
            }
            LobbySlideLayout.field_b = new int[2];
            MessageDialogContent.field_Q[1] = 0;
            TextWidgetPainter.field_m[1] = HudSpriteStore.field_b;
            TextWidgetPainter.field_m[0] = AchievementsScreen.field_q;
            TextWidgetPainter.field_m[3] = DefaultQuickChatContext.field_e;
            LobbySlideLayout.field_b[1] = 2;
            LobbySlideLayout.field_b[0] = 5;
            TextWidgetPainter.field_m[2] = QuitPageHelpers.field_a;
            TextWidgetPainter.field_m[4] = SoundEffectInstance.field_h;
            TextWidgetPainter.field_m[5] = "";
            MessageDialogContent.field_Q[3] = 1;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_67_0 = TextWidgetPainter.field_m;
              stackIn_67_1 = 6 + var8Lifetime2;
              if (0 > var8Lifetime2 + (SineTableHelpers.field_a.length - var5)) {
                stackIn_68_2 = "";
              } else {
                stackIn_68_2 = SineTableHelpers.field_a[var8Lifetime2 + SineTableHelpers.field_a.length - var5];
              }
              stackIn_67_0[stackIn_67_1] = stackIn_68_2;
            }
            TextWidgetPainter.field_m[6 + var5] = null;
            MessageDialogContent.field_Q[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_72_0 = TextWidgetPainter.field_m;
              stackIn_72_1 = var5 + 7 + var8Lifetime3;
              stackIn_72_2 = ~var8Lifetime3;
              stackIn_72_3 = ~DialSelectorWidget.field_N.length;
              if (stackIn_72_2 > stackIn_72_3) {
                stackIn_75_2 = DialSelectorWidget.field_N[var8Lifetime3];
              } else {
                stackIn_75_2 = "";
              }
              stackIn_72_0[stackIn_72_1] = stackIn_75_2;
            }
            UnitStateEvent.field_s = ClockAndScreenHelpers.monotonicMillis((byte) 41);
          }
          NetworkGameClient.field_B.field_c = LobbySlideLayout.field_b.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; TextWidgetPainter.field_m.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_88_0 = 0;
            stackIn_88_1 = TextWidgetPainter.field_m[var4Lifetime1];
            stackIn_89_2 = !(0 > MessageDialogContent.field_Q[var4Lifetime1]);
            var5Lifetime1 = FrameCycleAnimation.measureMenuText(stackIn_88_0, stackIn_88_1, stackIn_89_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (OptionsMenuScreen.field_q == 2) {
            var10 = NanoTickClock.field_n;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = FrameCycleAnimation.measureMenuText(0, var11, false);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = KeyboardStateHelpers.field_a;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = FrameCycleAnimation.measureMenuText(0, var12, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          Waypoint.field_j = NetworkGameClient.field_B.field_c * (ResizableDialog.field_bb + DateInputWidget.field_G << 1);
          ZombieDawnMulti.field_H = TeamSpriteHelpers.field_c - (var3_intLifetime1 >> 1);
          ByteArrayPool.field_a = -(var3_intLifetime1 >> 1) + (TeamSpriteHelpers.field_c + var3_intLifetime1);
          for (var4Lifetime2 = 0; TextWidgetPainter.field_m.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_111_0 = Waypoint.field_j;
            if (MessageDialogContent.field_Q[var4Lifetime2] >= 0) {
              stackIn_112_1 = SoundCache.field_h;
            } else {
              stackIn_112_1 = WidgetContainer.field_C;
            }
            Waypoint.field_j = stackIn_111_0 + stackIn_112_1;
          }
          TerrainEffectZone.field_k = AgeValidator.field_r - (Waypoint.field_j >> 1);
          MoveOrderMarker.field_b = new int[TextWidgetPainter.field_m.length][];
          if (param0) {
            field_M = -108;
          }
          var4Lifetime3 = 0;
          var5Lifetime3 = TerrainEffectZone.field_k;
          while (var4Lifetime3 < TextWidgetPainter.field_m.length) {
            var6Lifetime1 = MessageDialogContent.field_Q[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + WidgetContainer.field_C;
            } else {
              var7Lifetime2 = FrameCycleAnimation.measureMenuText(0, TextWidgetPainter.field_m[var4Lifetime3], true);
              var8Lifetime1 = TeamSpriteHelpers.field_c - (var7Lifetime2 >> 1);
              var5Lifetime3 = var5Lifetime3 + ResizableDialog.field_bb;
              MoveOrderMarker.field_b[var4Lifetime3] = new int[4];
              MoveOrderMarker.field_b[var4Lifetime3][0] = var8Lifetime1 - QuickChatHelpDialog.field_Gb;
              MoveOrderMarker.field_b[var4Lifetime3][1] = var5Lifetime3;
              MoveOrderMarker.field_b[var4Lifetime3][2] = var7Lifetime2 + (QuickChatHelpDialog.field_Gb << 1);
              MoveOrderMarker.field_b[var4Lifetime3][3] = (DateInputWidget.field_G << 1) + SoundCache.field_h;
              var5Lifetime3 = var5Lifetime3 + ((DateInputWidget.field_G << 1) - (-ResizableDialog.field_bb - SoundCache.field_h));
            }
            var4Lifetime3++;
          }
          if (OptionsMenuScreen.field_q != 2) {
            NetworkGameClient.field_B.initializeSelection(0, param1, -31458, TutorialAndMenuHelpers.hitTestMenuOption(LoginMethod.field_d, -1, MouseInputHandler.field_g));
          } else {
            NetworkGameClient.field_B.initializeSelection(-1, param1, -31458, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "eb.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_L = null;
        if (!param0) {
          PopupMenuBuilder.formatSignedNumber(-18, false, true);
        }
        field_e = null;
        field_w = null;
        field_J = null;
        field_y = null;
        field_i = null;
        field_B = null;
    }

    PopupMenuBuilder() {
        this.field_z = new byte[6][258];
        this.field_c = new int[6][258];
        this.field_I = new boolean[256];
        this.field_O = new int[6][258];
        this.field_b = 0;
        this.field_l = new byte[18002];
        this.field_C = new byte[256];
        this.field_t = new byte[18002];
        this.field_E = new boolean[16];
        this.field_D = 0;
        this.field_g = new int[16];
        this.field_v = new byte[4096];
        this.field_h = new int[6][258];
        this.field_G = new int[257];
        this.field_a = new int[6];
        this.field_m = new int[256];
    }

    static {
        field_e = "Field Marshal";
        field_L = "This game option has not yet been unlocked for use.";
        field_A = 2;
        field_J = new int[8192];
        field_w = new QuickChatCommandType(15, 0, 1, 0);
        field_i = "Strong zombie is strong.";
        field_y = "Password is valid";
    }
}

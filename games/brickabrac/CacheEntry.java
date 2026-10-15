/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CacheEntry extends DualLinkNode {
    static long field_v;
    static java.applet.Applet field_x;
    static BrickABrac field_C;
    static int field_z;
    static RgbSprite field_D;
    static QuickChatParameterType field_B;
    static String receivedChatContextLabel;
    int weight;
    static String[] field_A;
    static boolean field_w;

    public static void f(int param0) {
        field_x = null;
        receivedChatContextLabel = null;
        field_A = null;
        field_B = null;
        if (param0 != 31434) {
          CacheEntry.a((String[][]) null, (RgbSprite[][]) null, -45, (String[]) null, 69, (byte[]) null, (String[]) null, (ResourceArchive) null, (int[]) null, (RgbSprite[][]) null, (byte[]) null, 112, (String[]) null, -119, (String[][]) null);
        }
        field_C = null;
        field_D = null;
    }

    abstract Object getValue(int obfuscationGuard);

    final static void a(String[][] param0, RgbSprite[][] param1, int param2, String[] param3, int param4, byte[] param5, String[] param6, ResourceArchive param7, int[] param8, RgbSprite[][] param9, byte[] param10, int param11, String[] param12, int param13, String[][] param14) {
        AlignedIconLabel[] array$0 = null;
        AlignedIconLabel[] array$1 = null;
        AlignedIconLabel[] array$2 = null;
        int var19 = 0;
        UiComponent stackIn_6_0;
        UiComponent stackIn_6_1;
        long stackIn_6_2;
        UiComponent stackIn_6_3;
        UiComponent stackIn_7_0 = null;
        UiComponent stackIn_7_1 = null;
        String stackIn_7_4 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        UiComponent var16 = null;
        int var17_int = 0;
        UiComponent var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        UiComponent var23 = null;
        UiComponent var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = BrickABrac.field_J ? 1 : 0;
        try {
          ScreenshotViewer.field_n = param8;
          IntArrayRequest.field_t = param4;
          Brick.field_O = param5;
          MouseInput.field_c = param10;
          QuickChatPhraseRegistry.field_b = param12;
          QuickChatParameterType.field_a = param3;
          aj.field_c = param1;
          SecondaryHashTable.field_c = param0;
          GzipInflater.field_c = param6;
          LoginCredentials.field_i = param14;
          RadialSelectorRenderer.field_i = param11;
          BackgroundScene.field_k = param9;
          GameClock.field_f = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param7, "gameprivacy", 2);
          bq.field_c = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param7, "ratedgame", 2);
          uo.field_c = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param7, "opentome", 2);
          Ball.field_K = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param7, "allowspectators", 2);
          AchievementsScreen.field_H = new String[5];
          AchievementsScreen.field_H[3] = AlternateNumericLoginCredentials.field_u;
          AchievementsScreen.field_H[1] = t.field_e;
          AchievementsScreen.field_H[2] = IterableIntrusiveHashTable.field_g;
          AchievementsScreen.field_H[4] = bq.field_a;
          AchievementsScreen.field_H[0] = MainMenuScreen.field_r;
          Ball.field_A = new UiComponent(0L, (UiComponent) null);
          FarmBackground.field_v = new UiComponent(0L, MainMenuScreen.field_t, n.nameColumnHeadingText);
          GameUiController.field_a = new UiComponent(0L, IntrusiveHashIterator.field_a, RadialSelectorRenderer.field_c);
          IsaacGenerator.field_b = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), ReportAbuseDialog.field_Qb, ic.field_c);
          Ball.field_A.addChild(FarmBackground.field_v, 0);
          if (vd.field_e) {
            Ball.field_A.addChild(GameUiController.field_a, 0);
          }
          Ball.field_A.addChild(IsaacGenerator.field_b, 0);
          IsaacGenerator.field_b.viewport.copyStyle((byte) -74, CappedUrlRequest.field_l);
          IsaacGenerator.field_b.viewport.verticalAlignment = 1;
          var23 = IsaacGenerator.field_b.viewport;
          var24 = var23;
          var24.horizontalAlignment = 1;
          DraggableWidget.field_N = new UiComponent(0L, CappedUrlRequest.field_l);
          DraggableWidget.field_N.horizontalAlignment = 1;
          HighscorePackSelector.field_k = new UiComponent(0L, MatchCompleteScreen.field_x, VerticalScrollbar.field_Rb.toUpperCase());
          sc.field_b = new UiComponent(0L, ValidationStatus.field_j, rl.field_c.toUpperCase());
          ll.field_e = new UiComponent(0L, FarmBackground.field_x);
          nk.field_g = new UiComponent(0L, MainMenuScreen.field_t, nk.field_b);
          nk.field_a = new UiComponent(0L, LoginCredentialKind.field_d, VolcanicBackground.field_r);
          kk.field_b = new UiComponent(0L, LoginCredentialKind.field_d, ch.field_d);
          la.field_b = new UiComponent(0L, LoginCredentialKind.field_d, BallPulseEffect.field_o);
          BufferedSocket.field_h = new UiComponent(0L, LoginCredentialKind.field_d, TextFieldRenderer.field_v);
          HalloweenBackground.field_x = new UiComponent(0L, IntrusiveHashIterator.field_a, ByteStorage.field_d);
          rl.field_e = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), ReportAbuseDialog.field_Qb, ic.field_c);
          gj.field_b = new UiComponent(0L, fm.field_b, GameplayRenderHelpers.field_e.toUpperCase());
          gj.field_b.enabled = vd.field_e;
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = 0L;
          stackIn_6_3 = fm.field_b;
          if (vd.field_e) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = MultiplayerMatch.field_e;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = UnderwaterBackground.field_v;
          }
          VolcanicBackground.field_v = new UiComponent(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_7_4).toUpperCase());
          rm.field_a = new UiComponent(0L, (UiComponent) null);
          rm.field_a.addChild(sc.field_b, 0);
          rm.field_a.addChild(ll.field_e, 0);
          ll.field_e.addChild(nk.field_g, 0);
          if (param2 < 13) {
            return;
          }
          ll.field_e.addChild(nk.field_a, 0);
          ll.field_e.addChild(kk.field_b, 0);
          if (vd.field_e) {
            ll.field_e.addChild(la.field_b, 0);
          }
          ll.field_e.addChild(BufferedSocket.field_h, 0);
          ll.field_e.addChild(HalloweenBackground.field_x, 0);
          ll.field_e.addChild(rl.field_e, 0);
          if (vd.field_e) {
            rm.field_a.addChild(gj.field_b, 0);
          }
          rm.field_a.addChild(VolcanicBackground.field_v, 0);
          Brick.field_A = new UiComponent(0L, CappedUrlRequest.field_l);
          Brick.field_A.horizontalAlignment = 1;
          Brick.field_A.verticalAlignment = 0;
          nh.field_a = new UiComponent(0L, GameUiController.field_b, TextFieldValidator.field_j.toUpperCase());
          qp.field_f = new UiComponent(0L, MenuSelection.field_m);
          qp.field_f.addChild(Brick.field_A, 0);
          qp.field_f.addChild(nh.field_a, 0);
          t.field_f = new UiComponent(0L, ReportAbuseDialog.field_Qb);
          t.field_f.copyStyle((byte) -83, CappedUrlRequest.field_l);
          t.field_f.verticalAlignment = 1;
          var16 = t.field_f;
          var16.horizontalAlignment = 1;
          IterableIntrusiveHashTable.field_b = new UiComponent(0L, (UiComponent) null);
          TextWidgetRenderer.field_b = new UiComponent(0L, CappedUrlRequest.field_l);
          TextWidgetRenderer.field_b.horizontalAlignment = 1;
          BoundedFile.field_g = new UiComponent(0L, MainMenuScreen.field_t, n.nameColumnHeadingText);
          QuickChatPhraseDefinition.field_E = new UiComponent(0L, IntrusiveHashIterator.field_a, RadialSelectorRenderer.field_c);
          TimedSplashScreen.field_u = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), ReportAbuseDialog.field_Qb, ic.field_c);
          IterableIntrusiveHashTable.field_b.addChild(TextWidgetRenderer.field_b, 0);
          IterableIntrusiveHashTable.field_b.addChild(BoundedFile.field_g, 0);
          if (vd.field_e) {
            IterableIntrusiveHashTable.field_b.addChild(QuickChatPhraseDefinition.field_E, 0);
          }
          IterableIntrusiveHashTable.field_b.addChild(TimedSplashScreen.field_u, 0);
          GameUiController.field_e = new UiComponent(0L, MatchCompleteScreen.field_x, di.field_a.toUpperCase());
          ba.field_v = new UiComponent(0L, ValidationStatus.field_j);
          QuickChatPhraseRegistry.field_e = new UiComponent(0L, FarmBackground.field_x);
          jd.field_a = new UiComponent(0L, PowerUpWarning.field_k, ArchiveSource.field_b.toUpperCase());
          ChatMessage.field_l = new UiComponent[4 + param13];
          MatchCompleteScreen.field_A = new AlignedIconLabel[4 + param13][];
          ChatMessage.field_l[0] = new UiComponent(0L, ProxySocketConnector.field_n, Bzip2State.field_H);
          MatchCompleteScreen.field_A[0] = new AlignedIconLabel[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            MatchCompleteScreen.field_A[0][1 + var17_int] = new AlignedIconLabel(0L, AchievementMaskRequest.field_n, (UiComponent) null, DualLinkNode.field_t, GameClock.field_f[var17_int], AchievementsScreen.field_H[var17_int]);
          }
          if (2 <= ScreenshotViewer.field_n.length) {
            ChatMessage.field_l[1] = new UiComponent(0L, ProxySocketConnector.field_n, QuickChatMenu.field_ac);
            array$0 = new AlignedIconLabel[1 + ScreenshotViewer.field_n.length];
            MatchCompleteScreen.field_A[1] = array$0;
            MatchCompleteScreen.field_A[1][0] = new AlignedIconLabel(0L, AchievementMaskRequest.field_n, (UiComponent) null, DualLinkNode.field_t, (RgbSprite) null, StateIconLabel.field_Pb);
            for (var17_intLifetime1 = 0; var17_intLifetime1 < ScreenshotViewer.field_n.length; var17_intLifetime1++) {
              MatchCompleteScreen.field_A[1][var17_intLifetime1 + 1] = new AlignedIconLabel(0L, AchievementMaskRequest.field_n, (UiComponent) null, DualLinkNode.field_t, (RgbSprite) null, Integer.toString(ScreenshotViewer.field_n[var17_intLifetime1]));
            }
          }
          ChatMessage.field_l[2] = new UiComponent(0L, ProxySocketConnector.field_n, PlayerInputBatch.field_j);
          MatchCompleteScreen.field_A[2] = new AlignedIconLabel[]{new AlignedIconLabel(0L, AchievementMaskRequest.field_n, (UiComponent) null, DualLinkNode.field_t, (RgbSprite) null, StateIconLabel.field_Pb), new AlignedIconLabel(0L, AchievementMaskRequest.field_n, (UiComponent) null, DualLinkNode.field_t, Ball.field_K[0], MenuSelection.field_a), new AlignedIconLabel(0L, AchievementMaskRequest.field_n, (UiComponent) null, DualLinkNode.field_t, Ball.field_K[1], hh.field_f)};
          if (1 < IntArrayRequest.field_t) {
            ChatMessage.field_l[3] = new UiComponent(0L, ProxySocketConnector.field_n, EmailConfirmationValidator.field_r);
            array$1 = new AlignedIconLabel[IntArrayRequest.field_t + 1];
            MatchCompleteScreen.field_A[3] = array$1;
            MatchCompleteScreen.field_A[3][0] = new AlignedIconLabel(0L, AchievementMaskRequest.field_n, (UiComponent) null, DualLinkNode.field_t, (RgbSprite) null, StateIconLabel.field_Pb);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < IntArrayRequest.field_t; var17_intLifetime2++) {
              MatchCompleteScreen.field_A[3][var17_intLifetime2 + 1] = new AlignedIconLabel(0L, AchievementMaskRequest.field_n, (UiComponent) null, DualLinkNode.field_t, (RgbSprite) null, GzipInflater.field_c[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param13 > var17_intLifetime3; var17_intLifetime3++) {
            ChatMessage.field_l[var17_intLifetime3 + 4] = new UiComponent(0L, ProxySocketConnector.field_n, QuickChatPhraseRegistry.field_b[var17_intLifetime3]);
            array$2 = new AlignedIconLabel[IntrusiveHashIterator.a((int) MouseInput.field_c[var17_intLifetime3], 255) + 1];
            MatchCompleteScreen.field_A[4 + var17_intLifetime3] = array$2;
            MatchCompleteScreen.field_A[4 + var17_intLifetime3][0] = new AlignedIconLabel(0L, AchievementMaskRequest.field_n, (UiComponent) null, DualLinkNode.field_t, (RgbSprite) null, StateIconLabel.field_Pb);
            for (var18 = 0; (255 & MouseInput.field_c[var17_intLifetime3]) > var18; var18++) {
              if (BackgroundScene.field_k != null) {
                if (BackgroundScene.field_k[var17_intLifetime3] == null) {
                  var19_ref = null;
                } else {
                  var19_ref = BackgroundScene.field_k[var17_intLifetime3][var18];
                }
              } else {
                var19_ref = null;
              }
              if (SecondaryHashTable.field_c != null) {
                if (null == SecondaryHashTable.field_c[var17_intLifetime3]) {
                  var20 = null;
                } else {
                  var20 = SecondaryHashTable.field_c[var17_intLifetime3][var18];
                }
              } else {
                var20 = null;
              }
              MatchCompleteScreen.field_A[4 + var17_intLifetime3][var18 + 1] = new AlignedIconLabel(0L, AchievementMaskRequest.field_n, (UiComponent) null, DualLinkNode.field_t, (RgbSprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; 4 + param13 > var17_intLifetime4; var17_intLifetime4++) {
            if (ChatMessage.field_l[var17_intLifetime4] != null) {
              ChatMessage.field_l[var17_intLifetime4].lineSpacing = 11;
            }
            if (null != MatchCompleteScreen.field_A[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; var18Lifetime1 < MatchCompleteScreen.field_A[var17_intLifetime4].length; var18Lifetime1++) {
                if (null != MatchCompleteScreen.field_A[var17_intLifetime4][var18Lifetime1] &&
                  null != MatchCompleteScreen.field_A[var17_intLifetime4][var18Lifetime1].label) {
                  MatchCompleteScreen.field_A[var17_intLifetime4][var18Lifetime1].label.lineSpacing = 11;
                }
              }
            }
          }
          RadialSelectorRenderer.field_h = new UiComponent(0L, fm.field_b);
          DraggableWidget.field_K = new UiComponent(0L, fm.field_b);
          AppletGameShell.field_e = new UiComponent(0L, Paddle.field_C);
          AppletGameShell.field_e.copyStyle((byte) -125, CappedUrlRequest.field_l);
          var17 = AppletGameShell.field_e;
          AppletGameShell.field_e.verticalAlignment = 1;
          var17.horizontalAlignment = 1;
          MultiplayerMatch.field_d = new UiComponent(0L, (UiComponent) null);
          MultiplayerMatch.field_d.addChild(ba.field_v, 0);
          MultiplayerMatch.field_d.addChild(QuickChatPhraseRegistry.field_e, 0);
          QuickChatPhraseRegistry.field_e.addChild(jd.field_a, 0);
          for (var18Lifetime2 = 0; param13 + 4 > var18Lifetime2; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(ScreenshotViewer.field_n.length < 2)) && (var18Lifetime2 != 3 ||
              !(IntArrayRequest.field_t <= 1))) {
              QuickChatPhraseRegistry.field_e.addChild(ChatMessage.field_l[var18Lifetime2], 0);
              for (var19 = 0; MatchCompleteScreen.field_A[var18Lifetime2].length > var19; var19++) {
                if (MatchCompleteScreen.field_A[var18Lifetime2][var19] != null) {
                  QuickChatPhraseRegistry.field_e.addChild(MatchCompleteScreen.field_A[var18Lifetime2][var19], 0);
                }
              }
            }
          }
          MultiplayerMatch.field_d.addChild(RadialSelectorRenderer.field_h, 0);
          MultiplayerMatch.field_d.addChild(DraggableWidget.field_K, 0);
          MultiplayerMatch.field_d.addChild(AppletGameShell.field_e, 0);
          TableNameEntry.field_h = new UiComponent(0L, rf.field_c, SecondaryNodeQueue.field_a.toUpperCase());
          nd.field_a = new UiComponent(0L, GameUiController.field_b, fh.field_e.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_77_0 = var15;
          stackIn_77_1 = new StringBuilder().append("sl.F(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',');
          if (param1 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',');
          if (param6 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',');
          if (param7 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          stackIn_95_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',');
          if (param8 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_98_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',');
          if (param9 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',');
          if (param10 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_107_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(')').toString());
        }
    }

    abstract boolean isSoft(boolean obfuscationGuard);

    CacheEntry(int weight) {
        this.weight = weight;
    }

    static {
        field_z = 2147483647;
        field_A = new String[29];
        field_B = new QuickChatParameterType(12, 0, 1, 0);
    }
}

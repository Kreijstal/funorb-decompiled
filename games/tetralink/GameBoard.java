/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameBoard {
    int field_k;
    String[] field_o;
    int field_n;
    boolean field_l;
    static String field_c;
    static boolean field_f;
    static int[] field_i;
    int field_h;
    static String field_a;
    static UiComponent[] field_m;
    int field_b;
    int field_j;
    byte[] field_e;
    int field_d;
    byte[] field_p;
    int field_g;

    public static void releaseStatics(int param0) {
        field_c = null;
        int var1 = -124 / ((-9 - param0) / 35);
        field_i = null;
        field_a = null;
        field_m = null;
    }

    final static void initializeLobbyWidgets(String[] args, int param1, int param2, String[] param3, Sprite[][] param4, String[] param5, int[] param6, Archive param7, byte[] param8, Sprite[][] param9, int param10, String[][] param11, int param12, String[][] param13, byte[] param14) {
        IconLabelItem[] array$0 = null;
        IconLabelItem[] array$1 = null;
        IconLabelItem[] array$2 = null;
        int var19 = 0;
        UiComponent stackIn_8_0;
        UiComponent stackIn_8_1;
        long stackIn_8_2;
        UiComponent stackIn_8_3;
        UiComponent stackIn_9_0 = null;
        UiComponent stackIn_9_1 = null;
        String stackIn_9_4 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
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
        var21 = TetraLink.field_J;
        try {
          GameOptionTextTables.field_c = param13;
          PieceDropAnimation.field_o = param14;
          SocialTabsPanel.field_e = param1;
          KeyHandlerHelpers.field_b = param9;
          AccountTextGlobals.field_g = param4;
          ArchiveRequest.field_y = param5;
          CameraAndChatHelpers.field_e = param8;
          QuickChatHelpDialog.field_Rb = args;
          TetraLink.field_N = param12;
          LinkTextPainter.field_a = param3;
          ChatPanelSlideHelpers.field_g = param11;
          MenuScreen.field_f = param6;
          LoadingScreenHelpers.field_b = PlayingSound.loadSpritesByName((byte) -87, param7, "lobby", "gameprivacy");
          if (param10 <= 81) {
            return;
          }
          MenuThemeHelpers.field_e = PlayingSound.loadSpritesByName((byte) -107, param7, "lobby", "ratedgame");
          ArchiveRequest.field_u = PlayingSound.loadSpritesByName((byte) -76, param7, "lobby", "opentome");
          SpriteState.field_B = PlayingSound.loadSpritesByName((byte) -122, param7, "lobby", "allowspectators");
          TriangleSpanHelpers.field_b = new String[5];
          TriangleSpanHelpers.field_b[3] = HuffmanCodec.field_d;
          TriangleSpanHelpers.field_b[0] = GraphicsSettings.field_k;
          TriangleSpanHelpers.field_b[1] = QuickChatMenuFactory.field_f;
          TriangleSpanHelpers.field_b[4] = HighscoreQuery.field_A;
          TriangleSpanHelpers.field_b[2] = LobbyGame.field_dc;
          TextMetricsGlobals.field_c = new UiComponent(0L, (UiComponent) null);
          QuickChatMenuFactory.field_d = new UiComponent(0L, CacheEntry.field_x, FullscreenCanvasHelpers.field_o);
          FullscreenErrorDialog.field_eb = new UiComponent(0L, TextFieldValidator.field_l, NameSeparatorHelpers.field_c);
          DateInputWidget.field_Q = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), MatchingTextValidator.field_t, FullscreenErrorDialog.field_cb);
          TextMetricsGlobals.field_c.addChild((byte) -92, QuickChatMenuFactory.field_d);
          if (IntroFinalFrameHelpers.field_b) {
            TextMetricsGlobals.field_c.addChild((byte) 97, FullscreenErrorDialog.field_eb);
          }
          TextMetricsGlobals.field_c.addChild((byte) -98, DateInputWidget.field_Q);
          DateInputWidget.field_Q.field_Ob.applyStyle(TextLayoutLine.field_i, -2147483648);
          DateInputWidget.field_Q.field_Ob.field_J = 1;
          var23 = DateInputWidget.field_Q.field_Ob;
          var24 = var23;
          var24.field_xb = 1;
          GameClock.field_e = new UiComponent(0L, TextLayoutLine.field_i);
          GameClock.field_e.field_xb = 1;
          PasswordLoginCredentials.field_i = new UiComponent(0L, SecondaryNodeDeque.field_d, AccountWelcomePanel.field_K.toUpperCase());
          StatefulWidgetRenderer.field_r = new UiComponent(0L, DialWidgetPainter.field_j, MenuReturnHelpers.field_f.toUpperCase());
          CanvasAndErrorHelpers.field_f = new UiComponent(0L, OpacityWidget.field_Q);
          QueuedListRequest.field_A = new UiComponent(0L, CacheEntry.field_x, LoginCredentialType.field_c);
          StrongCacheEntry.field_D = new UiComponent(0L, ModelMergeHelpers.field_e, Archive.field_c);
          AccountTextGlobals.field_a = new UiComponent(0L, ModelMergeHelpers.field_e, LobbyListHelpers.field_b);
          LruTextureCache.field_p = new UiComponent(0L, ModelMergeHelpers.field_e, ArchiveRequest.field_E);
          FlaggedTextValue.field_d = new UiComponent(0L, ModelMergeHelpers.field_e, TwoColumnListPanel.field_Mb);
          LoadingScreenHelpers.field_g = new UiComponent(0L, TextFieldValidator.field_l, ChatPanelSlideHelpers.field_i);
          NetworkGameClient.field_t = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), MatchingTextValidator.field_t, FullscreenErrorDialog.field_cb);
          GameSession.field_q = new UiComponent(0L, FlaggedTextValue.field_l, LoadingStageHook.field_b.toUpperCase());
          GameSession.field_q.field_S = IntroFinalFrameHelpers.field_b;
          stackIn_8_0 = null;
          stackIn_8_1 = null;
          stackIn_8_2 = 0L;
          stackIn_8_3 = FlaggedTextValue.field_l;
          if (IntroFinalFrameHelpers.field_b) {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = LoginDialog.field_pb;
          } else {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = LoginPanel.field_T;
          }
          IntrusiveDeque.field_e = new UiComponent(stackIn_8_2, stackIn_8_3, ((String) (Object) stackIn_9_4).toUpperCase());
          GameKeyHandler.field_c = new UiComponent(0L, (UiComponent) null);
          GameKeyHandler.field_c.addChild((byte) -96, StatefulWidgetRenderer.field_r);
          GameKeyHandler.field_c.addChild((byte) 39, CanvasAndErrorHelpers.field_f);
          CanvasAndErrorHelpers.field_f.addChild((byte) -108, QueuedListRequest.field_A);
          CanvasAndErrorHelpers.field_f.addChild((byte) -92, StrongCacheEntry.field_D);
          CanvasAndErrorHelpers.field_f.addChild((byte) -95, AccountTextGlobals.field_a);
          if (IntroFinalFrameHelpers.field_b) {
            CanvasAndErrorHelpers.field_f.addChild((byte) 16, LruTextureCache.field_p);
          }
          CanvasAndErrorHelpers.field_f.addChild((byte) -119, FlaggedTextValue.field_d);
          CanvasAndErrorHelpers.field_f.addChild((byte) -103, LoadingScreenHelpers.field_g);
          CanvasAndErrorHelpers.field_f.addChild((byte) -128, NetworkGameClient.field_t);
          if (IntroFinalFrameHelpers.field_b) {
            GameKeyHandler.field_c.addChild((byte) 15, GameSession.field_q);
          }
          GameKeyHandler.field_c.addChild((byte) -102, IntrusiveDeque.field_e);
          MarkerSliderPainter.field_e = new UiComponent(0L, TextLayoutLine.field_i);
          MarkerSliderPainter.field_e.field_J = 0;
          MarkerSliderPainter.field_e.field_xb = 1;
          DelegatingCanvas.field_a = new UiComponent(0L, ClockAndTextHelpers.field_a, TooltipTextGlobals.field_b.toUpperCase());
          ArchiveIndex.field_q = new UiComponent(0L, RandomAccessCacheFile.field_h);
          ArchiveIndex.field_q.addChild((byte) 75, MarkerSliderPainter.field_e);
          ArchiveIndex.field_q.addChild((byte) -94, DelegatingCanvas.field_a);
          QueuedStatSubmission.field_q = new UiComponent(0L, MatchingTextValidator.field_t);
          QueuedStatSubmission.field_q.applyStyle(TextLayoutLine.field_i, -2147483648);
          var16 = QueuedStatSubmission.field_q;
          QueuedStatSubmission.field_q.field_J = 1;
          var16.field_xb = 1;
          DialWidget.field_Q = new UiComponent(0L, (UiComponent) null);
          IndexedSpriteHelpers.field_d = new UiComponent(0L, TextLayoutLine.field_i);
          IndexedSpriteHelpers.field_d.field_xb = 1;
          TextButton.field_J = new UiComponent(0L, CacheEntry.field_x, FullscreenCanvasHelpers.field_o);
          EmailSyntaxValidator.field_q = new UiComponent(0L, TextFieldValidator.field_l, NameSeparatorHelpers.field_c);
          QueuedListRequest.field_x = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), MatchingTextValidator.field_t, FullscreenErrorDialog.field_cb);
          DialWidget.field_Q.addChild((byte) -94, IndexedSpriteHelpers.field_d);
          DialWidget.field_Q.addChild((byte) 57, TextButton.field_J);
          if (IntroFinalFrameHelpers.field_b) {
            DialWidget.field_Q.addChild((byte) 9, EmailSyntaxValidator.field_q);
          }
          DialWidget.field_Q.addChild((byte) 18, QueuedListRequest.field_x);
          SparkParticle.field_n = new UiComponent(0L, SecondaryNodeDeque.field_d, LoginDialog.field_ob.toUpperCase());
          CommonUiHelpers.field_d = new UiComponent(0L, DialWidgetPainter.field_j);
          VerticalScrollbar.field_Qb = new UiComponent(0L, OpacityWidget.field_Q);
          AnimationFrameSet.field_x = new UiComponent(0L, ChatLayoutHelpers.field_d, PatchNoteUsage.field_n.toUpperCase());
          ClientException.field_e = new IconLabelItem[4 + param2][];
          field_m = new UiComponent[4 + param2];
          field_m[0] = new UiComponent(0L, LoginDialog.field_rb, RasterBuffer.field_b);
          ClientException.field_e[0] = new IconLabelItem[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            ClientException.field_e[0][var17_int + 1] = new IconLabelItem(0L, AccountTermsPanel.field_L, (UiComponent) null, NotificationToast.field_n, LoadingScreenHelpers.field_b[var17_int], TriangleSpanHelpers.field_b[var17_int]);
          }
          if (MenuScreen.field_f.length >= 2) {
            field_m[1] = new UiComponent(0L, LoginDialog.field_rb, AccountCreationDialog.field_zb);
            array$0 = new IconLabelItem[MenuScreen.field_f.length + 1];
            ClientException.field_e[1] = array$0;
            ClientException.field_e[1][0] = new IconLabelItem(0L, AccountTermsPanel.field_L, (UiComponent) null, NotificationToast.field_n, (Sprite) null, ReflectionCheckHelpers.field_c);
            for (var17_intLifetime1 = 0; MenuScreen.field_f.length > var17_intLifetime1; var17_intLifetime1++) {
              ClientException.field_e[1][var17_intLifetime1 + 1] = new IconLabelItem(0L, AccountTermsPanel.field_L, (UiComponent) null, NotificationToast.field_n, (Sprite) null, Integer.toString(MenuScreen.field_f[var17_intLifetime1]));
            }
          }
          field_m[2] = new UiComponent(0L, LoginDialog.field_rb, TriangleSpanHelpers.field_i);
          ClientException.field_e[2] = new IconLabelItem[]{new IconLabelItem(0L, AccountTermsPanel.field_L, (UiComponent) null, NotificationToast.field_n, (Sprite) null, ReflectionCheckHelpers.field_c), new IconLabelItem(0L, AccountTermsPanel.field_L, (UiComponent) null, NotificationToast.field_n, SpriteState.field_B[0], LinkTextPainter.field_d), new IconLabelItem(0L, AccountTermsPanel.field_L, (UiComponent) null, NotificationToast.field_n, SpriteState.field_B[1], ReportAbuseDialog.field_Zb)};
          if (SocialTabsPanel.field_e > 1) {
            field_m[3] = new UiComponent(0L, LoginDialog.field_rb, InterfaceTextLoader.field_a);
            array$1 = new IconLabelItem[SocialTabsPanel.field_e + 1];
            ClientException.field_e[3] = array$1;
            ClientException.field_e[3][0] = new IconLabelItem(0L, AccountTermsPanel.field_L, (UiComponent) null, NotificationToast.field_n, (Sprite) null, ReflectionCheckHelpers.field_c);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < SocialTabsPanel.field_e; var17_intLifetime2++) {
              ClientException.field_e[3][1 + var17_intLifetime2] = new IconLabelItem(0L, AccountTermsPanel.field_L, (UiComponent) null, NotificationToast.field_n, (Sprite) null, QuickChatHelpDialog.field_Rb[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; var17_intLifetime3 < param2; var17_intLifetime3++) {
            field_m[4 + var17_intLifetime3] = new UiComponent(0L, LoginDialog.field_rb, ArchiveRequest.field_y[var17_intLifetime3]);
            array$2 = new IconLabelItem[1 + StatusRequestHelpers.bitAnd(255, (int) CameraAndChatHelpers.field_e[var17_intLifetime3])];
            ClientException.field_e[var17_intLifetime3 + 4] = array$2;
            ClientException.field_e[4 + var17_intLifetime3][0] = new IconLabelItem(0L, AccountTermsPanel.field_L, (UiComponent) null, NotificationToast.field_n, (Sprite) null, ReflectionCheckHelpers.field_c);
            for (var18 = 0; (CameraAndChatHelpers.field_e[var17_intLifetime3] & 255) > var18; var18++) {
              if (null == AccountTextGlobals.field_g) {
                var19_ref = null;
              } else {
                if (null != AccountTextGlobals.field_g[var17_intLifetime3]) {
                  var19_ref = AccountTextGlobals.field_g[var17_intLifetime3][var18];
                } else {
                  var19_ref = null;
                }
              }
              if (ChatPanelSlideHelpers.field_g == null) {
                var20 = null;
              } else {
                if (null != ChatPanelSlideHelpers.field_g[var17_intLifetime3]) {
                  var20 = ChatPanelSlideHelpers.field_g[var17_intLifetime3][var18];
                } else {
                  var20 = null;
                }
              }
              ClientException.field_e[4 + var17_intLifetime3][1 + var18] = new IconLabelItem(0L, AccountTermsPanel.field_L, (UiComponent) null, NotificationToast.field_n, (Sprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; param2 + 4 > var17_intLifetime4; var17_intLifetime4++) {
            if (field_m[var17_intLifetime4] != null) {
              field_m[var17_intLifetime4].field_Q = 11;
            }
            if (ClientException.field_e[var17_intLifetime4] != null) {
              for (var18Lifetime1 = 0; var18Lifetime1 < ClientException.field_e[var17_intLifetime4].length; var18Lifetime1++) {
                if (ClientException.field_e[var17_intLifetime4][var18Lifetime1] != null &&
                  ClientException.field_e[var17_intLifetime4][var18Lifetime1].field_Rb != null) {
                  ClientException.field_e[var17_intLifetime4][var18Lifetime1].field_Rb.field_Q = 11;
                }
              }
            }
          }
          ReflectionCheck.field_n = new UiComponent(0L, FlaggedTextValue.field_l);
          LoadingResourceHelpers.field_c = new UiComponent(0L, FlaggedTextValue.field_l);
          ServerConnectionHelpers.field_a = new UiComponent(0L, ServerConnectionHelpers.field_b);
          ServerConnectionHelpers.field_a.applyStyle(TextLayoutLine.field_i, -2147483648);
          ServerConnectionHelpers.field_a.field_J = 1;
          var17 = ServerConnectionHelpers.field_a;
          var17.field_xb = 1;
          HotspotTextWidget.field_V = new UiComponent(0L, (UiComponent) null);
          HotspotTextWidget.field_V.addChild((byte) 77, CommonUiHelpers.field_d);
          HotspotTextWidget.field_V.addChild((byte) -109, VerticalScrollbar.field_Qb);
          VerticalScrollbar.field_Qb.addChild((byte) -124, AnimationFrameSet.field_x);
          for (var18Lifetime2 = 0; var18Lifetime2 < param2 + 4; var18Lifetime2++) {
            if ((1 != var18Lifetime2 ||
              !(2 > MenuScreen.field_f.length)) && (var18Lifetime2 != 3 ||
              !(SocialTabsPanel.field_e <= 1))) {
              VerticalScrollbar.field_Qb.addChild((byte) -93, field_m[var18Lifetime2]);
              for (var19 = 0; var19 < ClientException.field_e[var18Lifetime2].length; var19++) {
                if (null != ClientException.field_e[var18Lifetime2][var19]) {
                  VerticalScrollbar.field_Qb.addChild((byte) 29, ClientException.field_e[var18Lifetime2][var19]);
                }
              }
            }
          }
          HotspotTextWidget.field_V.addChild((byte) -91, ReflectionCheck.field_n);
          HotspotTextWidget.field_V.addChild((byte) 101, LoadingResourceHelpers.field_c);
          HotspotTextWidget.field_V.addChild((byte) 69, ServerConnectionHelpers.field_a);
          MarkerSliderPainter.field_l = new UiComponent(0L, UiComponent.field_gb, TransitionPhase.field_c.toUpperCase());
          GraphicsSettings.field_b = new UiComponent(0L, ClockAndTextHelpers.field_a, TetraLink.field_O.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_76_0 = var15;
          stackIn_76_1 = new StringBuilder().append("em.F(");
          if (args == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param4 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param5 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',');
          if (param6 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param7 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',');
          if (param8 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param9 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
          if (param14 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
    }

    final static WidgetTheme getDefaultTheme(int param0) {
        if (param0 != 0) {
          return (WidgetTheme) null;
        }
        if (null == TriangleSpanHelpers.field_c) {
          TriangleSpanHelpers.field_c = new WidgetTheme();
          TriangleSpanHelpers.field_c.installDefaultPainters(param0 + 15658734, NumericDateInputWidget.field_S);
          TriangleSpanHelpers.field_c.field_f = 0;
          TriangleSpanHelpers.field_c.field_d = 7697781;
          TriangleSpanHelpers.field_c.field_o = 4;
          TriangleSpanHelpers.field_c.field_q = 5;
          TriangleSpanHelpers.field_c.field_p = 14;
          TriangleSpanHelpers.field_c.field_k = LruTextureCache.field_d;
          TriangleSpanHelpers.field_c.field_v = 6;
          TriangleSpanHelpers.field_c.field_g = 2763306;
        }
        return TriangleSpanHelpers.field_c;
    }

    final void resetBoard(int param0) {
        this.field_p = new byte[6];
        this.field_e = new byte[6];
        this.field_h = 0;
        this.field_l = false;
        this.field_j = 0;
        int var2 = this.field_b;
        if (var2 != 0 &&
          var2 != 1) {
          var2 = this.field_g;
        }
        int localTemp$0 = var2 == 1 ? 0 : 1;
        var2 = localTemp$0;
        this.field_g = localTemp$0;
        int var3 = -112 % ((-76 - param0) / 33);
        this.setTurnState(0, 18936, var2);
    }

    final boolean isValidMove(int param0, int param1, int param2) {
        int var4;
        if (param1 > 6) {
          return false;
        }
        if (param1 < 0) {
          return false;
        }
        if (5 >= param0 &&
          param0 >= 0) {
          var4 = 1 << param1;
          if (((this.field_p[param0] | this.field_e[param0]) & var4) != 0) {
            return false;
          }
          if (param2 > -120) {
            this.field_l = true;
          }
          if (0 < param0 &&
            ((this.field_p[param0 - 1] | this.field_e[-1 + param0]) & var4) == 0) {
            return false;
          }
          return true;
        }
        return false;
    }

    final void advanceTurn(boolean param0) {
        int var3 = TetraLink.field_J;
        if (this.field_l) {
          throw new IllegalStateException();
        }
        if (!param0) {
          this.field_l = true;
        }
        this.field_k = this.field_k + 1;
        do {
          this.field_b = (this.field_b + 1) % 2;
        } while ((this.field_j & 1 << this.field_b) != 0);
    }

    final static void drawLegacyMenu(int param0) {
        int var1 = MarkerSliderPainter.getLegacyMenuWidth((byte) 120);
        if (param0 < 49) {
          GameBoard.drawLegacyMenu(-27);
        }
        int var2 = AccountTermsPanel.getMenuHeight(88);
        IntKeyLookup.field_b.drawFrame(TopLevelContainerHelpers.field_e - SoundEffectLibrary.field_d, DateOfBirthPanel.field_V - NameAlphabetTable.field_d, (byte) 28, (NameAlphabetTable.field_d << 1) + var1, (SoundEffectLibrary.field_d << 1) + var2);
        MarkerSliderPainter.drawLegacyMenuRows(1000);
    }

    final void readBoardState(PacketBuffer param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = TetraLink.field_J;
        try {
          if (param1 != -7) {
            this.field_e = (byte[]) null;
          }
          var3_int = param0.readUnsignedByte((byte) -99);
          if ((var3_int & 2) != 0) {
            for (var4 = 0; 6 > var4; var4++) {
              this.field_p[var4] = param0.readSignedByte(-1772093437);
              this.field_e[var4] = param0.readSignedByte(-1772093437);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "em.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int findDropRow(int param0, byte param1) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        int var3 = 1 << param0;
        for (var4 = 0; var4 < 6; var4++) {
          if ((var3 & (this.field_p[var4] | this.field_e[var4])) == 0) {
            return var4;
          }
        }
        if (param1 != 101) {
          GameBoard.releaseStatics(-56);
        }
        return -1;
    }

    final boolean checkGameEnd(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        var8 = TetraLink.field_J;
        if (this.field_l) {
          throw new IllegalStateException();
        }
        if (param0 != 2) {
          this.field_j = -9;
        }
        for (var3 = 0; var3 < 4; var3++) {
          var4 = 15 << var3;
          for (var2 = 0; var2 < 6; var2++) {
            if (~(var4 & this.field_p[var2]) == ~var4) {
              this.endGame(0, 4);
              return true;
            }
            if (var4 == (var4 & this.field_e[var2])) {
              this.endGame(1, param0 ^ 6);
              return true;
            }
          }
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < 7; var3Lifetime1++) {
          var4Lifetime1 = 1 << var3Lifetime1;
          for (var2Lifetime1 = 0; 3 > var2Lifetime1; var2Lifetime1++) {
            if (~(this.field_p[var2Lifetime1] & var4Lifetime1) == ~var4Lifetime1 &&
              var4Lifetime1 == (var4Lifetime1 & this.field_p[1 + var2Lifetime1]) &&
              var4Lifetime1 == (this.field_p[var2Lifetime1 + 2] & var4Lifetime1) &&
              var4Lifetime1 == (this.field_p[3 + var2Lifetime1] & var4Lifetime1)) {
              this.endGame(0, 4);
              return true;
            }
            if ((this.field_e[var2Lifetime1] & var4Lifetime1) == var4Lifetime1 &&
              (this.field_e[1 + var2Lifetime1] & var4Lifetime1) == var4Lifetime1 &&
              var4Lifetime1 == (this.field_e[2 + var2Lifetime1] & var4Lifetime1) &&
              var4Lifetime1 == (this.field_e[var2Lifetime1 + 3] & var4Lifetime1)) {
              this.endGame(1, 4);
              return true;
            }
          }
        }
        for (var3Lifetime2 = 0; var3Lifetime2 < 4; var3Lifetime2++) {
          var4Lifetime2 = 1 << var3Lifetime2;
          var5 = 2 << var3Lifetime2;
          var6 = 4 << var3Lifetime2;
          var7 = 8 << var3Lifetime2;
          for (var2Lifetime2 = 0; var2Lifetime2 < 3; var2Lifetime2++) {
            if (var4Lifetime2 == (var4Lifetime2 & this.field_p[var2Lifetime2]) &&
              var5 == (this.field_p[1 + var2Lifetime2] & var5) &&
              (var6 & this.field_p[var2Lifetime2 + 2]) == var6 &&
              (var7 & this.field_p[var2Lifetime2 + 3]) == var7) {
              this.endGame(0, 4);
              return true;
            }
            if (var7 == (var7 & this.field_p[var2Lifetime2]) &&
              (this.field_p[1 + var2Lifetime2] & var6) == var6 &&
              var5 == (var5 & this.field_p[2 + var2Lifetime2]) &&
              var4Lifetime2 == (var4Lifetime2 & this.field_p[3 + var2Lifetime2])) {
              this.endGame(0, 4);
              return true;
            }
            if ((this.field_e[var2Lifetime2] & var4Lifetime2) == var4Lifetime2 &&
              var5 == (var5 & this.field_e[1 + var2Lifetime2]) &&
              var6 == (var6 & this.field_e[2 + var2Lifetime2]) &&
              (var7 & this.field_e[var2Lifetime2 + 3]) == var7) {
              this.endGame(1, param0 + 2);
              return true;
            }
            if ((var7 & this.field_e[var2Lifetime2]) == var7 &&
              var6 == (var6 & this.field_e[var2Lifetime2 + 1]) &&
              (this.field_e[var2Lifetime2 + 2] & var5) == var5 &&
              var4Lifetime2 == (var4Lifetime2 & this.field_e[3 + var2Lifetime2])) {
              this.endGame(1, 4);
              return true;
            }
          }
        }
        if ((this.field_e[5] | this.field_p[5]) != 127) {
          return false;
        }
        this.endGame(-1, 4);
        return true;
    }

    final void placePiece(int param0, int param1, int param2, int param3) {
        if (param3 != -28067) {
          this.setTurnState(-5, 78, -83);
        }
        if (this.field_l) {
          throw new IllegalStateException();
        }
        int var5 = 1 << param1;
        if (param2 != 0) {
          this.field_e[param0] = (byte)IntrusiveNode.bitOr((int) this.field_e[param0], var5);
        } else {
          this.field_p[param0] = (byte)IntrusiveNode.bitOr((int) this.field_p[param0], var5);
        }
    }

    final void setTurnState(int param0, int param1, int param2) {
        if (param1 != 18936) {
          return;
        }
        this.field_k = param0;
        this.field_b = param2;
    }

    final void endGame(int param0, int param1) {
        if (param1 != 4) {
          return;
        }
        this.field_b = param0;
        this.field_l = true;
    }

    final static void switchToPublicChat(int param0) {
        SecondaryNodeDequeIterator.field_d = 0;
        TextLayout.openQuickChatRootMenu(param0 ^ -20647);
        if (param0 != -20715) {
          field_f = true;
        }
    }

    GameBoard(int param0, String[] param1, int param2) {
        try {
          this.field_d = param0;
          if (param1.length != 2) {
            throw new RuntimeException();
          }
          this.field_e = new byte[6];
          this.field_g = param2;
          this.field_b = param2;
          this.field_p = new byte[6];
          this.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "em.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "To Customer Support";
        field_a = "Breaking real-world laws";
        field_i = new int[8192];
    }
}

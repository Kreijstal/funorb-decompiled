/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QueuedListRequest extends IntrusiveNode {
    static String field_i;
    static String field_j;
    int field_m;
    static String field_k;
    static int[] field_o;
    static int field_n;
    int[] field_p;
    static int field_g;
    static WidgetLayerStack field_l;
    static int[] field_h;

    public static void releaseStatics(int param0) {
        field_j = null;
        field_i = null;
        field_l = null;
        field_o = null;
        if (param0 > -48) {
          return;
        }
        field_h = null;
        field_k = null;
    }

    final static void drawNineSliceFrame(int param0, int param1, boolean param2, int param3, int param4, Sprite[] param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        Sprite[] var23 = null;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = Virogrid.field_F ? 1 : 0;
        try {
          if (param5 == null) {
            return;
          }
          if (param3 > 0 &&
            param4 > 0) {
            if (param5[3] == null) {
              stackIn_9_0 = 0;
            } else {
              stackIn_9_0 = param5[3].field_u;
            }
            var6_int = stackIn_9_0;
            if (null == param5[5]) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param5[5].field_u;
            }
            var7 = stackIn_12_0;
            if (null == param5[1]) {
              stackIn_15_0 = 0;
            } else {
              stackIn_15_0 = param5[1].field_z;
            }
            var8 = stackIn_15_0;
            if (param5[7] != null) {
              stackIn_18_0 = param5[7].field_z;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            var10 = param0 + param3;
            var11 = param1 + param4;
            var12 = var6_int + param0;
            var13 = var10 - var7;
            var14 = var8 + param1;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param3 * var6_int / (var6_int + var7) + param0;
              var16 = param3 * var6_int / (var6_int + var7) + param0;
            }
            var18 = var14;
            var19 = var15;
            Rasterizer.saveClip(TextDecodeHelpers.field_f);
            if (var19 < var18) {
              var19 = param1 + var8 * param4 / (var9 + var8);
              var18 = param1 + var8 * param4 / (var9 + var8);
            }
            if (param5[0] != null) {
              Rasterizer.intersectClip(param0, param1, var16, var18);
              param5[0].drawTransparent(param0, param1);
              Rasterizer.restoreClip(TextDecodeHelpers.field_f);
            }
            if (null != param5[2]) {
              Rasterizer.intersectClip(var17, param1, var10, var18);
              param5[2].drawTransparent(var13, param1);
              Rasterizer.restoreClip(TextDecodeHelpers.field_f);
            }
            if (param5[6] != null) {
              Rasterizer.intersectClip(param0, var19, var16, var11);
              param5[6].drawTransparent(param0, var15);
              Rasterizer.restoreClip(TextDecodeHelpers.field_f);
            }
            if (param5[8] != null) {
              Rasterizer.intersectClip(var17, var19, var10, var11);
              param5[8].drawTransparent(var13, var15);
              Rasterizer.restoreClip(TextDecodeHelpers.field_f);
            }
            if (param5[1] != null &&
              param5[1].field_u != 0) {
              Rasterizer.intersectClip(var16, param1, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param5[1].field_u) {
                param5[1].drawTransparent(var20, param1);
              }
              Rasterizer.restoreClip(TextDecodeHelpers.field_f);
            }
            if (null != param5[7] &&
              param5[7].field_u != 0) {
              Rasterizer.intersectClip(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param5[7].field_u) {
                param5[7].drawTransparent(var20Lifetime1, var15);
              }
              Rasterizer.restoreClip(TextDecodeHelpers.field_f);
            }
            if (param2) {
              var23 = (Sprite[]) null;
              QueuedListRequest.drawNineSliceFrame(-38, 91, true, -16, -31, (Sprite[]) null);
            }
            if (null != param5[3] &&
              param5[3].field_z != 0) {
              Rasterizer.intersectClip(param0, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param5[3].field_z) {
                param5[3].drawTransparent(param0, var20Lifetime2);
              }
              Rasterizer.restoreClip(TextDecodeHelpers.field_f);
            }
            if (null != param5[5] &&
              param5[5].field_z != 0) {
              Rasterizer.intersectClip(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param5[5].field_z) {
                param5[5].drawTransparent(var13, var20Lifetime3);
              }
              Rasterizer.restoreClip(TextDecodeHelpers.field_f);
            }
            if (param5[4] != null &&
              0 != param5[4].field_u &&
              param5[4].field_z != 0) {
              Rasterizer.intersectClip(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param5[4].field_z) {
                for (var21 = var12; var13 > var21; var21 = var21 + param5[4].field_u) {
                  param5[4].drawTransparent(var21, var20Lifetime4);
                }
              }
              Rasterizer.restoreClip(TextDecodeHelpers.field_f);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("tm.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final static PlayingSound queueSoundPlayback(PcmSampleStream param0, int param1) {
        PlayingSound var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        PlayingSound stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new PlayingSound(param0, param0);
          LoginMethod.field_a.addFirst(var2, (byte) -70);
          var3 = -54 % ((7 - param1) / 49);
          ReflectionCheckHelpers.field_g.addSubStream(param0);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("tm.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void initializeLobbyWidgets(Sprite[][] param0, int param1, int param2, int param3, int[] param4, Js5Archive param5, Sprite[][] param6, byte[] param7, String[][] param8, int param9, String[][] param10, String[] param11, String[] param12, byte[] param13, String[] param14) {
        IconTextComponent[] array$0 = null;
        IconTextComponent[] array$1 = null;
        IconTextComponent[] array$2 = null;
        int var19 = 0;
        SpriteWidget stackIn_7_0;
        SpriteWidget stackIn_7_1;
        long stackIn_7_2;
        SpriteWidget stackIn_7_3;
        SpriteWidget stackIn_8_0 = null;
        SpriteWidget stackIn_8_1 = null;
        String stackIn_8_4 = null;
        Object stackIn_45_0 = null;
        SpriteWidget stackIn_45_1 = null;
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
        SpriteWidget var16 = null;
        int var17_int = 0;
        SpriteWidget var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        SpriteWidget var23 = null;
        SpriteWidget var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = Virogrid.field_F ? 1 : 0;
        try {
          DialogMessagePane.field_J = param0;
          QuickChatMenu.field_Vb = param2;
          PopupMenuDrawHelpers.field_f = param3;
          LoginMethodHelpers.field_a = param12;
          UiLayerInputHelpers.field_b = param4;
          LoadingProgressDialog.field_fb = param6;
          DisplayModeInfo.field_j = param11;
          ProxyAuthenticationRequiredException.field_e = param14;
          IntrusiveDeque.field_e = param7;
          GameSession.field_f = param13;
          QuickChatPhraseDefinition.field_p = param10;
          GameBoard.field_d = param8;
          BirthDateInputWidget.gamePrivacyIcons = WidgetNode.loadSpritesByName(32, param5, "lobby", "gameprivacy");
          CellAnimator.ratedGameIcons = WidgetNode.loadSpritesByName(32, param5, "lobby", "ratedgame");
          TypeCode.openToMeIcons = WidgetNode.loadSpritesByName(32, param5, "lobby", "opentome");
          ProxySocketConnector.allowSpectatorsIcons = WidgetNode.loadSpritesByName(32, param5, "lobby", "allowspectators");
          ChatMessage.field_b = new String[5];
          ChatMessage.field_b[1] = StateToken.field_a;
          ChatMessage.field_b[0] = PasswordLoginCredentials.field_j;
          ChatMessage.field_b[2] = RasterBuffer.field_i;
          ChatMessage.field_b[3] = LoginPanel.field_R;
          ChatMessage.field_b[4] = TextEncodingHelpers.field_c;
          BackgroundParticle.field_m = new SpriteWidget(0L, (SpriteWidget) null);
          MouseInputHandler.field_d = new SpriteWidget(0L, DelegatingCanvas.field_d, DirectByteStorage.field_h);
          TriangleMesh.field_m = new SpriteWidget(0L, LobbyGame.field_Jb, AudioSetupHelpers.field_f);
          GameBoard.field_j = new ScrollPane(0L, new SpriteWidget(0L, (SpriteWidget) null), FadingModalPanel.field_M, NetworkArchiveRequest.field_z);
          BackgroundParticle.field_m.addChild(0, MouseInputHandler.field_d);
          if (DialWidgetPainter.field_d) {
            BackgroundParticle.field_m.addChild(0, TriangleMesh.field_m);
          }
          BackgroundParticle.field_m.addChild(0, GameBoard.field_j);
          GameBoard.field_j.field_Eb.applyStyle(18003, LinkTextPainter.field_h);
          GameBoard.field_j.field_Eb.field_D = 1;
          var23 = GameBoard.field_j.field_Eb;
          var24 = var23;
          var24.field_lb = 1;
          MusicPatchEnvelope.field_f = new SpriteWidget(0L, LinkTextPainter.field_h);
          if (param1 <= 92) {
            return;
          }
          MusicPatchEnvelope.field_f.field_lb = 1;
          InputSetupHelpers.field_b = new SpriteWidget(0L, NanoTickClock.field_j, ScrollPane.field_Ib.toUpperCase());
          ValidationMessageWidget.field_Z = new SpriteWidget(0L, ClientServiceHelpers.field_b, GameBoard.field_o.toUpperCase());
          HotspotTextWidget.field_I = new SpriteWidget(0L, TextFieldPainter.field_w);
          DualLinkDequeIterator.field_c = new SpriteWidget(0L, DelegatingCanvas.field_d, LobbyGameListHelpers.field_a);
          DialWidget.field_H = new SpriteWidget(0L, LobbyLayout.field_b, RasterBuffer.field_g);
          LobbySessionHelpers.field_d = new SpriteWidget(0L, LobbyLayout.field_b, MouseHandlerSupport.field_c);
          IterableNodeHashTable.field_b = new SpriteWidget(0L, LobbyLayout.field_b, QuickChatPhraseDefinition.field_r);
          SingleChildWidget.field_C = new SpriteWidget(0L, LobbyLayout.field_b, CameraAndLogoHelpers.field_d);
          DialWidget.field_J = new SpriteWidget(0L, LobbyGame.field_Jb, ReflectionCheck.field_k);
          DisplayModeInfo.field_a = new ScrollPane(0L, new SpriteWidget(0L, (SpriteWidget) null), FadingModalPanel.field_M, NetworkArchiveRequest.field_z);
          GrowableIntList.field_a = new SpriteWidget(0L, LoginMethodHelpers.field_b, CacheReference.field_s.toUpperCase());
          GrowableIntList.field_a.field_Y = DialWidgetPainter.field_d;
          stackIn_7_0 = null;
          stackIn_7_1 = null;
          stackIn_7_2 = 0L;
          stackIn_7_3 = LoginMethodHelpers.field_b;
          if (DialWidgetPainter.field_d) {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_4 = ClientEnvironmentHelpers.field_f;
          } else {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_4 = DualLinkNode.field_l;
          }
          ResizableDialog.field_R = new SpriteWidget(stackIn_7_2, stackIn_7_3, ((String) (Object) stackIn_8_4).toUpperCase());
          CipherPacketBuffer.field_p = new SpriteWidget(0L, (SpriteWidget) null);
          CipherPacketBuffer.field_p.addChild(0, ValidationMessageWidget.field_Z);
          CipherPacketBuffer.field_p.addChild(0, HotspotTextWidget.field_I);
          HotspotTextWidget.field_I.addChild(0, DualLinkDequeIterator.field_c);
          HotspotTextWidget.field_I.addChild(0, DialWidget.field_H);
          HotspotTextWidget.field_I.addChild(0, LobbySessionHelpers.field_d);
          if (DialWidgetPainter.field_d) {
            HotspotTextWidget.field_I.addChild(0, IterableNodeHashTable.field_b);
          }
          HotspotTextWidget.field_I.addChild(0, SingleChildWidget.field_C);
          HotspotTextWidget.field_I.addChild(0, DialWidget.field_J);
          HotspotTextWidget.field_I.addChild(0, DisplayModeInfo.field_a);
          if (DialWidgetPainter.field_d) {
            CipherPacketBuffer.field_p.addChild(0, GrowableIntList.field_a);
          }
          CipherPacketBuffer.field_p.addChild(0, ResizableDialog.field_R);
          MusicVoiceMixer.field_o = new SpriteWidget(0L, LinkTextPainter.field_h);
          MusicVoiceMixer.field_o.field_D = 0;
          MusicVoiceMixer.field_o.field_lb = 1;
          HotspotTextWidget.field_H = new SpriteWidget(0L, PendingSubmission.field_n, ChatPanelSetupHelpers.field_a.toUpperCase());
          WidgetStyleLayer.field_a = new SpriteWidget(0L, LobbySessionHelpers.field_e);
          WidgetStyleLayer.field_a.addChild(0, MusicVoiceMixer.field_o);
          WidgetStyleLayer.field_a.addChild(0, HotspotTextWidget.field_H);
          IntrusiveNode.field_b = new SpriteWidget(0L, FadingModalPanel.field_M);
          IntrusiveNode.field_b.applyStyle(18003, LinkTextPainter.field_h);
          var16 = IntrusiveNode.field_b;
          IntrusiveNode.field_b.field_D = 1;
          var16.field_lb = 1;
          ViewControlStrings.field_d = new SpriteWidget(0L, (SpriteWidget) null);
          AccountCreationForm.field_R = new SpriteWidget(0L, LinkTextPainter.field_h);
          AccountCreationForm.field_R.field_lb = 1;
          ClientServiceHelpers.field_g = new SpriteWidget(0L, DelegatingCanvas.field_d, DirectByteStorage.field_h);
          CheckboxButton.field_F = new SpriteWidget(0L, LobbyGame.field_Jb, AudioSetupHelpers.field_f);
          TriangleMesh.field_r = new ScrollPane(0L, new SpriteWidget(0L, (SpriteWidget) null), FadingModalPanel.field_M, NetworkArchiveRequest.field_z);
          ViewControlStrings.field_d.addChild(0, AccountCreationForm.field_R);
          ViewControlStrings.field_d.addChild(0, ClientServiceHelpers.field_g);
          if (DialWidgetPainter.field_d) {
            ViewControlStrings.field_d.addChild(0, CheckboxButton.field_F);
          }
          ViewControlStrings.field_d.addChild(0, TriangleMesh.field_r);
          CellFlip.field_o = new SpriteWidget(0L, NanoTickClock.field_j, NanoTickClock.field_i.toUpperCase());
          PopupMenuDrawHelpers.field_e = new SpriteWidget(0L, ClientServiceHelpers.field_b);
          ChatSettingsHelpers.field_b = new SpriteWidget(0L, TextFieldPainter.field_w);
          PacketRequestHelpers.field_c = new SpriteWidget(0L, MouseInputHandler.field_c, UrlRewriteHelpers.field_a.toUpperCase());
          SessionSeedHelpers.field_b = new IconTextComponent[4 + param9][];
          DualLinkDequeIterator.field_f = new SpriteWidget[param9 + 4];
          DualLinkDequeIterator.field_f[0] = new SpriteWidget(0L, WidgetNode.field_u, LoginCredentialType.field_b);
          SessionSeedHelpers.field_b[0] = new IconTextComponent[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            SessionSeedHelpers.field_b[0][var17_int + 1] = new IconTextComponent(0L, EmailDomainValidationHelpers.field_e, (SpriteWidget) null, IntrusiveDequeCursor.field_e, BirthDateInputWidget.gamePrivacyIcons[var17_int], ChatMessage.field_b[var17_int]);
          }
          if (2 <= UiLayerInputHelpers.field_b.length) {
            DualLinkDequeIterator.field_f[1] = new SpriteWidget(0L, WidgetNode.field_u, FrameSkin.field_d);
            array$0 = new IconTextComponent[UiLayerInputHelpers.field_b.length + 1];
            SessionSeedHelpers.field_b[1] = array$0;
            SessionSeedHelpers.field_b[1][0] = new IconTextComponent(0L, EmailDomainValidationHelpers.field_e, (SpriteWidget) null, IntrusiveDequeCursor.field_e, (Sprite) null, CheckboxButton.field_I);
            for (var17_intLifetime1 = 0; var17_intLifetime1 < UiLayerInputHelpers.field_b.length; var17_intLifetime1++) {
              SessionSeedHelpers.field_b[1][1 + var17_intLifetime1] = new IconTextComponent(0L, EmailDomainValidationHelpers.field_e, (SpriteWidget) null, IntrusiveDequeCursor.field_e, (Sprite) null, Integer.toString(UiLayerInputHelpers.field_b[var17_intLifetime1]));
            }
          }
          DualLinkDequeIterator.field_f[2] = new SpriteWidget(0L, WidgetNode.field_u, field_i);
          SessionSeedHelpers.field_b[2] = new IconTextComponent[]{new IconTextComponent(0L, EmailDomainValidationHelpers.field_e, (SpriteWidget) null, IntrusiveDequeCursor.field_e, (Sprite) null, CheckboxButton.field_I), new IconTextComponent(0L, EmailDomainValidationHelpers.field_e, (SpriteWidget) null, IntrusiveDequeCursor.field_e, ProxySocketConnector.allowSpectatorsIcons[0], PasswordLoginCredentials.field_f), new IconTextComponent(0L, EmailDomainValidationHelpers.field_e, (SpriteWidget) null, IntrusiveDequeCursor.field_e, ProxySocketConnector.allowSpectatorsIcons[1], LabeledChildWidget.field_F)};
          if (PopupMenuDrawHelpers.field_f > 1) {
            DualLinkDequeIterator.field_f[3] = new SpriteWidget(0L, WidgetNode.field_u, LoadingProgressHelpers.field_c);
            array$1 = new IconTextComponent[1 + PopupMenuDrawHelpers.field_f];
            SessionSeedHelpers.field_b[3] = array$1;
            SessionSeedHelpers.field_b[3][0] = new IconTextComponent(0L, EmailDomainValidationHelpers.field_e, (SpriteWidget) null, IntrusiveDequeCursor.field_e, (Sprite) null, CheckboxButton.field_I);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < PopupMenuDrawHelpers.field_f; var17_intLifetime2++) {
              SessionSeedHelpers.field_b[3][var17_intLifetime2 + 1] = new IconTextComponent(0L, EmailDomainValidationHelpers.field_e, (SpriteWidget) null, IntrusiveDequeCursor.field_e, (Sprite) null, ProxyAuthenticationRequiredException.field_e[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param9 > var17_intLifetime3; var17_intLifetime3++) {
            DualLinkDequeIterator.field_f[var17_intLifetime3 + 4] = new SpriteWidget(0L, WidgetNode.field_u, LoginMethodHelpers.field_a[var17_intLifetime3]);
            array$2 = new IconTextComponent[1 + WidgetFactoryHelpers.bitAnd(255, (int) GameSession.field_f[var17_intLifetime3])];
            SessionSeedHelpers.field_b[4 + var17_intLifetime3] = array$2;
            SessionSeedHelpers.field_b[var17_intLifetime3 + 4][0] = new IconTextComponent(0L, EmailDomainValidationHelpers.field_e, (SpriteWidget) null, IntrusiveDequeCursor.field_e, (Sprite) null, CheckboxButton.field_I);
            for (var18 = 0; var18 < (GameSession.field_f[var17_intLifetime3] & 255); var18++) {
              if (DialogMessagePane.field_J == null) {
                var19_ref = null;
              } else {
                if (null != DialogMessagePane.field_J[var17_intLifetime3]) {
                  var19_ref = DialogMessagePane.field_J[var17_intLifetime3][var18];
                } else {
                  var19_ref = null;
                }
              }
              if (GameBoard.field_d != null) {
                if (GameBoard.field_d[var17_intLifetime3] == null) {
                  var20 = null;
                } else {
                  var20 = GameBoard.field_d[var17_intLifetime3][var18];
                }
              } else {
                var20 = null;
              }
              SessionSeedHelpers.field_b[4 + var17_intLifetime3][var18 + 1] = new IconTextComponent(0L, EmailDomainValidationHelpers.field_e, (SpriteWidget) null, IntrusiveDequeCursor.field_e, (Sprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; var17_intLifetime4 < param9 + 4; var17_intLifetime4++) {
            stackIn_45_0 = null;
            stackIn_45_1 = DualLinkDequeIterator.field_f[var17_intLifetime4];
            if (stackIn_45_0 != stackIn_45_1) {
              DualLinkDequeIterator.field_f[var17_intLifetime4].field_fb = 11;
            }
            if (null != SessionSeedHelpers.field_b[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; var18Lifetime1 < SessionSeedHelpers.field_b[var17_intLifetime4].length; var18Lifetime1++) {
                if (null != SessionSeedHelpers.field_b[var17_intLifetime4][var18Lifetime1] &&
                  SessionSeedHelpers.field_b[var17_intLifetime4][var18Lifetime1].field_Fb != null) {
                  SessionSeedHelpers.field_b[var17_intLifetime4][var18Lifetime1].field_Fb.field_fb = 11;
                }
              }
            }
          }
          ChecksumHelpers.field_c = new SpriteWidget(0L, LoginMethodHelpers.field_b);
          HuffmanCodec.field_d = new SpriteWidget(0L, LoginMethodHelpers.field_b);
          BitCountAndDialogHelpers.field_b = new SpriteWidget(0L, QueuedResultSubmission.field_n);
          BitCountAndDialogHelpers.field_b.applyStyle(18003, LinkTextPainter.field_h);
          var17 = BitCountAndDialogHelpers.field_b;
          BitCountAndDialogHelpers.field_b.field_D = 1;
          var17.field_lb = 1;
          CacheReference.field_r = new SpriteWidget(0L, (SpriteWidget) null);
          CacheReference.field_r.addChild(0, PopupMenuDrawHelpers.field_e);
          CacheReference.field_r.addChild(0, ChatSettingsHelpers.field_b);
          ChatSettingsHelpers.field_b.addChild(0, PacketRequestHelpers.field_c);
          for (var18Lifetime2 = 0; 4 + param9 > var18Lifetime2; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(UiLayerInputHelpers.field_b.length < 2)) && (var18Lifetime2 != 3 ||
              !(PopupMenuDrawHelpers.field_f <= 1))) {
              ChatSettingsHelpers.field_b.addChild(0, DualLinkDequeIterator.field_f[var18Lifetime2]);
              for (var19 = 0; SessionSeedHelpers.field_b[var18Lifetime2].length > var19; var19++) {
                if (null != SessionSeedHelpers.field_b[var18Lifetime2][var19]) {
                  ChatSettingsHelpers.field_b.addChild(0, SessionSeedHelpers.field_b[var18Lifetime2][var19]);
                }
              }
            }
          }
          CacheReference.field_r.addChild(0, ChecksumHelpers.field_c);
          CacheReference.field_r.addChild(0, HuffmanCodec.field_d);
          CacheReference.field_r.addChild(0, BitCountAndDialogHelpers.field_b);
          WidgetStyleLayer.field_m = new SpriteWidget(0L, ByteStorage.field_a, TypeCode.field_h.toUpperCase());
          HelpPopup.field_Ib = new SpriteWidget(0L, PendingSubmission.field_n, StateToken.field_b.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_76_0 = var15;
          stackIn_76_1 = new StringBuilder().append("tm.C(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param5 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param6 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',');
          if (param7 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param8 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param11 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',');
          if (param12 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',');
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
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
    }

    final static Sprite[] loadSpriteFrames(Js5Archive param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Sprite[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 4) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          if (PendingHighscoreRequest.decodeSpriteSheetFromArchive(param0, param1, param3, (byte) 109)) {
            return DecodedSpriteHelpers.buildSprites((byte) -123);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("tm.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private QueuedListRequest() throws Throwable {
        throw new Error();
    }

    static {
        field_j = "<%0> has joined your game.";
        field_i = "Allow spectators?";
        field_k = null;
    }
}

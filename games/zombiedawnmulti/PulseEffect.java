/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PulseEffect extends IntrusiveNode {
    private int field_h;
    static boolean[] field_m;
    private int field_j;
    private int field_f;
    private int field_p;
    static ClientProtocolStage field_l;
    private SceneObject field_o;
    private int field_k;
    boolean field_q;
    static String field_n;
    static String field_i;
    static String field_g;

    final static IndexedSprite buildFirstDecodedIndexedSprite(byte param0) {
        if (param0 != 89) {
          ResourceArchive var2 = (ResourceArchive) null;
          PulseEffect.loadLobbyResources(-40, (ResourceArchive) null, (int[]) null, (IndexedSprite[]) null, (ResourceArchive) null);
        }
        IndexedSprite var1 = new IndexedSprite(ContentTransitionDialog.field_nb, SpriteDecodeGlobals.field_a, PacketBuffer.field_i[0], PowerupCommand.field_o[0], ThreeSliceButtonPainter.field_w[0], AppearanceScreen.field_p[0], MatchingTextValidator.field_t[0], UsernameAvailabilityValidator.field_t);
        PropObject.clearSpriteDecodeBuffers((byte) 126);
        return var1;
    }

    final boolean advance(byte param0) {
        this.field_p = this.field_p + 1;
        if (this.field_o != null) {
          this.field_k = this.field_o.getX(109);
          this.field_j = this.field_o.getY(-104) - 24;
        }
        this.field_q = 100 - 2 * this.field_p <= 0 ? true : false;
        if (param0 != 76) {
          return false;
        }
        return this.field_q;
    }

    public static void releaseStatics(byte param0) {
        field_i = null;
        field_l = null;
        field_n = null;
        if (param0 != 87) {
          PulseEffect.releaseStatics((byte) -116);
        }
        field_m = null;
        field_g = null;
    }

    final boolean draw(int param0, Camera param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int var7Lifetime1;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_h == 255) {
            return true;
          }
          if (param0 != 16711680) {
            PulseEffect.buildFirstDecodedIndexedSprite((byte) 95);
          }
          if (this.field_q) {
            throw new IllegalStateException("Why call me? I'm done!");
          }
          var3_int = 100 - this.field_p * 2;
          if (var3_int <= 0) {
            return true;
          }
          var4 = param1.worldToScreenX(this.field_k, param0 - 16731806);
          var5 = param1.worldToScreenY(this.field_j, 106);
          if (this.field_f == -1) {
            SoftwareRasterizer.fillCircleAlpha(var4, var5, 50 - var3_int / 2, 12071039, var3_int);
            return true;
          }
          SoftwareRasterizer.fillCircleAlpha(var4, var5, var3_int, 16711680, 70);
          var10 = new int[64];
          var9 = var10;
          var6 = var9;
          for (var7 = 0; var7 < 64; var7++) {
            var6[var7] = var7 * 196864;
          }
          var7Lifetime1 = 3 * var3_int / 4;
          SoftwareRasterizer.fillRadialGlow(var4 << 4, var5 << 4, var3_int << 4, 33, var10);
          MarkerSliderPainter.field_b[this.field_h].drawScaledAlpha(-var7Lifetime1 + var4, var5 - var7Lifetime1, var7Lifetime1 * 2, var7Lifetime1 * 2, 40 + var3_int);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("lc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void noOperation(int param0) {
        if (param0 < 22) {
          PulseEffect.noOperation(-37);
        }
    }

    final void attachTo(int param0, int param1, SceneObject param2, byte param3) {
        try {
          this.reset(-24 + param2.getY(-76), param0, param2.getX(-86), param1, (byte) 127);
          if (param3 <= 44) {
            PulseEffect.noOperation(10);
          }
          this.field_o = param2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void reset(int param0, int param1, int param2, int param3, byte param4) {
        this.field_p = 0;
        this.field_q = false;
        this.field_o = null;
        if (param4 < 103) {
          ResourceArchive var7 = (ResourceArchive) null;
          PulseEffect.loadLobbyResources(83, (ResourceArchive) null, (int[]) null, (IndexedSprite[]) null, (ResourceArchive) null);
        }
        this.field_k = param2;
        this.field_j = param0;
        this.field_h = param3;
        this.field_f = param1;
    }

    final static void loadLobbyResources(int param0, ResourceArchive param1, int[] param2, IndexedSprite[] param3, ResourceArchive param4) {
        Sprite[] dupTemp$0 = null;
        Sprite[] dupTemp$1 = null;
        Sprite[] dupTemp$2 = null;
        Sprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        IndexedSprite[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        BinaryBitmapFont var7 = null;
        UiComponent var8 = null;
        UiComponent var9 = null;
        UiComponent var10 = null;
        UiComponent var11 = null;
        Sprite[] var12 = null;
        Sprite[] var13 = null;
        Sprite[] var14 = null;
        UiComponent var15 = null;
        Sprite[] var16 = null;
        Sprite[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var20 = InflaterDecompressor.loadIndexedSpritesByName("crowns", param1, (byte) 19, "lobby");
          var5 = var20;
          ArmedHumanView.field_ub = var20.length;
          if (param3 != null) {
            var6 = new IndexedSprite[param3.length + ArmedHumanView.field_ub];
            for (var7_int = 0; ArmedHumanView.field_ub > var7_int; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            var5 = var6;
            for (var7_intLifetime3 = 0; var7_intLifetime3 < param3.length; var7_intLifetime3++) {
              var6[var7_intLifetime3 + ArmedHumanView.field_ub] = param3[var7_intLifetime3];
            }
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; ArmedHumanView.field_ub > var7_intLifetime1; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param3 != null) {
            if (param2 != null) {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param3.length; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + ArmedHumanView.field_ub] = param2[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; param3.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[ArmedHumanView.field_ub + var7_intLifetime2] = param3[var7_intLifetime2].field_a;
              }
            }
          }
          FeatureSupportHelpers.field_f = 2;
          ChatPromptHelpers.field_f = 11;
          MusicPatchEnvelope.field_h = 4;
          UpgradeAccessHelpers.field_f = 15;
          LevelFileCatalog.field_c = 2;
          var7 = Under13NoticePanel.loadBinaryFontByName(param1, 4, param4, "largefont", "lobby");
          PropObject.field_G = Under13NoticePanel.loadBinaryFontByName(param1, param0 + 12039, param4, "generalfont", "lobby");
          PhantomDecoy.field_L = Under13NoticePanel.loadBinaryFontByName(param1, 4, param4, "chatfont", "lobby");
          var7.setInlineSprites(var5, var24);
          PropObject.field_G.setInlineSprites(var5, var24);
          PhantomDecoy.field_L.setInlineSprites(var5, var24);
          var8 = new UiComponent(0L, (UiComponent) null);
          var8.field_M = 16777215;
          var8.field_J = UpgradeAccessHelpers.field_f;
          var8.field_yb = (BitmapFont) ((Object) var7);
          var9 = var8;
          var8.field_lb = 1;
          var9.field_R = 1;
          var10 = new UiComponent(0L, (UiComponent) null);
          var10.field_J = UpgradeAccessHelpers.field_f;
          var10.field_yb = (BitmapFont) ((Object) PropObject.field_G);
          var10.field_M = 16777215;
          var11 = var10;
          var10.field_lb = 1;
          var11.field_R = 1;
          LevelFileCatalog.field_d = new UiComponent(0L, var8);
          LevelFileCatalog.field_d.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "heading"), param0 + 12035);
          HudSpriteStore.field_d = new UiComponent(0L, (UiComponent) null);
          HudSpriteStore.field_d.field_ab = LabeledChildWidget.createGradientTabSprites(120, 8421504, 0, 4210752, false, false);
          NodeHashTableIterator.field_g = new UiComponent(0L, (UiComponent) null);
          NodeHashTableIterator.field_g.field_ab = AudioPumpThread.createGradientFrameSprites(1, 114, 6316128, 3, 6316128, 108);
          StringHashHelpers.field_a = new UiComponent(0L, (UiComponent) null);
          StringHashHelpers.field_a.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 ^ 12285, "popup"), 0);
          var12 = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "popup_mouseover"), 0);
          var13 = EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "button");
          var14 = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "tab_active"), 0);
          ScreenSizeGlobals.field_c = new UiComponent(0L, var8);
          ScreenSizeGlobals.field_c.field_ab = var14;
          ReportDialogGlobals.field_a = new UiComponent(0L, (UiComponent) null);
          ReportDialogGlobals.field_a.field_rb = ByteArrayPool.loadSpriteByName("lobby", "closebutton", param1, param0 ^ -1106);
          ReportDialogGlobals.field_a.field_K = ByteArrayPool.loadSpriteByName("lobby", "closebutton_mouseover", param1, param0 + 23126);
          EmailAvailabilityValidator.field_x = new UiComponent(0L, var8);
          EmailAvailabilityValidator.field_x.field_ab = LabeledChildWidget.createGradientTabSprites(40, 3815994, 0, 2039583, true, true);
          SleepAndNameHelpers.field_a = new UiComponent(0L, var10);
          SleepAndNameHelpers.field_a.field_V = 2;
          SleepAndNameHelpers.field_a.field_ab = LabeledChildWidget.createGradientTabSprites(30, 3815994, param0 + 12035, 2039583, false, true);
          ResizableDialog.field_fb = new UiComponent(0L, var10);
          ResizableDialog.field_fb.field_V = 2;
          ResizableDialog.field_fb.field_ab = LabeledChildWidget.createGradientTabSprites(30, 3815994, 0, 2039583, false, false);
          ArchiveAvailabilityHelpers.field_g = new UiComponent(0L, var10);
          ArchiveAvailabilityHelpers.field_g.field_V = 2;
          ArchiveAvailabilityHelpers.field_g.field_ab = LabeledChildWidget.createGradientTabSprites(30, 3815994, 0, 2039583, true, false);
          IntroScreen.field_m = new UiComponent(0L, (UiComponent) null);
          IntroScreen.field_m.field_J = UpgradeAccessHelpers.field_f;
          IntroScreen.field_m.field_M = 13421772;
          IntroScreen.field_m.field_yb = (BitmapFont) ((Object) PropObject.field_G);
          IntroScreen.field_m.field_lb = 1;
          LobbyRequestHelpers.field_b = new UiComponent(0L, IntroScreen.field_m);
          LobbyRequestHelpers.field_b.field_M = 16764006;
          LobbyRequestHelpers.field_b.field_ob = 16777215;
          LobbyRequestHelpers.field_b.field_Db = 16777215;
          LobbyRequestHelpers.field_b.field_xb = 16777215;
          LobbyRequestHelpers.field_b.field_H = 8421504;
          var15 = new UiComponent(0L, LobbyRequestHelpers.field_b);
          var15.field_J = UpgradeAccessHelpers.field_f;
          var15.field_M = 16777215;
          var15.field_yb = (BitmapFont) ((Object) var7);
          ArchiveRequest.field_u = new UiComponent(0L, IntroScreen.field_m);
          ArchiveRequest.field_u.field_ab = LabeledChildWidget.createGradientTabSprites(16, 2236962, 0, 2236962, false, false);
          ArchiveRequest.field_u.field_V = 2;
          PasswordTextPainter.field_B = new UiComponent(0L, IntroScreen.field_m);
          PasswordTextPainter.field_B.field_ab = LabeledChildWidget.createGradientTabSprites(16, 1513239, 0, 1513239, false, false);
          PasswordTextPainter.field_B.field_V = 2;
          ScorePopup.field_H = new UiComponent(0L, ArchiveRequest.field_u);
          ScorePopup.field_H.copyStyle((byte) -32, LobbyRequestHelpers.field_b);
          PasswordTextPainter.field_x = new UiComponent(0L, PasswordTextPainter.field_B);
          PasswordTextPainter.field_x.copyStyle((byte) -32, LobbyRequestHelpers.field_b);
          var16 = EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "button_mouseover");
          RasterStackHelpers.field_d = new ContextMenu(StringHashHelpers.field_a, var12, IntroScreen.field_m, LobbyRequestHelpers.field_b, 3, 2, LevelFileCatalog.field_c, 3, UpgradeAccessHelpers.field_f);
          ProgressDialog.field_gb = new UiComponent(0L, LobbyRequestHelpers.field_b);
          ProgressDialog.field_gb.field_X = var16;
          ProgressDialog.field_gb.field_sb = 1;
          ProgressDialog.field_gb.field_N = 1;
          ProgressDialog.field_gb.field_ab = var13;
          ProgressDialog.field_gb.field_P = 1;
          ProgressDialog.field_gb.field_eb = 1;
          ProgressDialog.field_gb.field_S = EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 ^ 12285, "button_mouseheld");
          ProgressDialog.field_gb.field_gb = EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 + 11779, "button_active");
          ProgressDialog.field_gb.field_Bb = EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "button_disabled");
          ProgressDialog.field_gb.field_R = 1;
          ProxySocketConnector.field_i = new UiComponent(0L, LobbyRequestHelpers.field_b);
          ProxySocketConnector.field_i.field_R = 1;
          ProxySocketConnector.field_i.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "tab_inactive"), 0);
          ProxySocketConnector.field_i.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "tab_mouseover"), 0);
          ProxySocketConnector.field_i.field_gb = var14;
          NanoTickClock.field_l = new UiComponent(0L, (UiComponent) null);
          NanoTickClock.field_l.field_ab = AudioPumpThread.createGradientFrameSprites(-1, 206, 1127256, 3, 1856141, 32);
          MeltdownPuddleView.field_f = new UiComponent(0L, (UiComponent) null);
          MeltdownPuddleView.field_f.field_ab = AudioPumpThread.createGradientFrameSprites(-1, 290, 6052956, 3, 11579568, param0 ^ -12112);
          LinkButtonPainter.field_i = new UiComponent(0L, var15);
          LinkButtonPainter.field_i.field_sb = 1;
          LinkButtonPainter.field_i.field_P = 1;
          LinkButtonPainter.field_i.field_N = 1;
          LinkButtonPainter.field_i.field_R = 1;
          LinkButtonPainter.field_i.field_eb = 1;
          GameWorld.field_n = new UiComponent(0L, LinkButtonPainter.field_i);
          EffectVolumeHelpers.field_b = new UiComponent(0L, LobbyRequestHelpers.field_b);
          EffectVolumeHelpers.field_b.field_R = 1;
          EffectVolumeHelpers.field_b.field_N = 1;
          EffectVolumeHelpers.field_b.field_P = 1;
          EffectVolumeHelpers.field_b.field_eb = 1;
          EffectVolumeHelpers.field_b.field_sb = 1;
          PropObject.field_O = new UiComponent(0L, EffectVolumeHelpers.field_b);
          AwtEventPumpHelpers.field_f = new UiComponent(0L, EffectVolumeHelpers.field_b);
          DiskCacheWorker.field_c = new UiComponent(0L, LinkButtonPainter.field_i);
          PendingIntArrayReply.field_j = new UiComponent(0L, EffectVolumeHelpers.field_b);
          SpriteState.field_v = new UiComponent(0L, EffectVolumeHelpers.field_b);
          BrowserPageHelpers.field_d = new UiComponent(0L, EffectVolumeHelpers.field_b);
          EffectVolumeHelpers.field_b.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 + 11779, "smallbutton"), 0);
          EffectVolumeHelpers.field_b.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "smallbutton_mouseover"), 0);
          dupTemp$0 = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "smallbutton_active"), 0);
          EffectVolumeHelpers.field_b.field_gb = dupTemp$0;
          EffectVolumeHelpers.field_b.field_S = dupTemp$0;
          EffectVolumeHelpers.field_b.field_Bb = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "smallbutton_disabled"), 0);
          GameWorld.field_n.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "mediumbutton"), 0);
          GameWorld.field_n.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "mediumbutton_mouseover"), param0 ^ param0);
          GameWorld.field_n.field_S = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "mediumbutton_mouseheld"), 0);
          LinkButtonPainter.field_i.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "bigbutton"), 0);
          LinkButtonPainter.field_i.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "bigbutton_mouseover"), 0);
          LinkButtonPainter.field_i.field_S = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "bigbutton_mouseheld"), param0 ^ -12035);
          LinkButtonPainter.field_i.field_Bb = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 ^ 12285, "bigbutton_disabled"), param0 + 12035);
          PropObject.field_O.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 ^ 12285, "greenbutton"), 0);
          PropObject.field_O.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 + 11779, "greenbutton_mouseover"), 0);
          PropObject.field_O.field_S = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 ^ 12285, "greenbutton_mouseheld"), 0);
          AwtEventPumpHelpers.field_f.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 + 11779, "redbutton"), 0);
          AwtEventPumpHelpers.field_f.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "redbutton_mouseover"), 0);
          AwtEventPumpHelpers.field_f.field_S = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "redbutton_mouseheld"), 0);
          DiskCacheWorker.field_c.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "backbutton"), param0 + 12035);
          DiskCacheWorker.field_c.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "backbutton_mouseover"), 0);
          DiskCacheWorker.field_c.field_S = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 + 11779, "backbutton_mouseheld"), 0);
          DiskCacheWorker.field_c.field_Bb = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "backbutton_disabled"), 0);
          BrowserPageHelpers.field_d.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 + 11779, "gameoptionbutton"), param0 ^ -12035);
          BrowserPageHelpers.field_d.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 + 11779, "gameoptionbutton_mouseover"), 0);
          dupTemp$1 = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "gameoptionbutton_active"), 0);
          BrowserPageHelpers.field_d.field_gb = dupTemp$1;
          BrowserPageHelpers.field_d.field_S = dupTemp$1;
          BrowserPageHelpers.field_d.field_Bb = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "gameoptionbutton_disabled"), 0);
          PendingIntArrayReply.field_j.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 + 11779, "chatbutton"), 0);
          PendingIntArrayReply.field_j.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "chatbutton_mouseover"), 0);
          dupTemp$2 = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 + 11779, "chatbutton_active"), param0 ^ -12035);
          PendingIntArrayReply.field_j.field_gb = dupTemp$2;
          PendingIntArrayReply.field_j.field_S = dupTemp$2;
          SpriteState.field_v.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "chatfilterbutton"), 0);
          SpriteState.field_v.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, param0 + 11779, "chatfilterbutton_mouseover"), 0);
          dupTemp$3 = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "chatfilterbutton_active"), 0);
          SpriteState.field_v.field_gb = dupTemp$3;
          SpriteState.field_v.field_S = dupTemp$3;
          var17 = EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "checkbox");
          UpgradeAccessHelpers.field_h = new StateIconLabel(0L, var17[1], var17[0], 1, LobbyRequestHelpers.field_b, (String) null);
          MusicPatch.field_k = new UiComponent(0L, (UiComponent) null);
          MusicPatch.field_k.field_ab = GameEvent.createCentreOnlyFrame(ByteArrayPool.loadSpriteByName("lobby", "slideregion", param1, param0 + 23126), 27117);
          MusicPatch.field_k.field_X = GameEvent.createCentreOnlyFrame(ByteArrayPool.loadSpriteByName("lobby", "slideregion_mouseover", param1, 11091), 27117);
          MusicPatch.field_k.field_S = GameEvent.createCentreOnlyFrame(ByteArrayPool.loadSpriteByName("lobby", "slideregion_mouseheld", param1, 11091), 27117);
          MusicPatch.field_k.field_Bb = GameEvent.createCentreOnlyFrame(ByteArrayPool.loadSpriteByName("lobby", "slideregion_disabled", param1, 11091), 27117);
          IntHashIndex.field_c = new UiComponent(0L, (UiComponent) null);
          IntHashIndex.field_c.field_ab = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "dragbar"), 0);
          IntHashIndex.field_c.field_X = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "dragbar_mouseover"), 0);
          IntHashIndex.field_c.field_S = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "dragbar_mouseheld"), param0 + 12035);
          IntHashIndex.field_c.field_Bb = AntialiasedFontHelpers.resetSpriteOffsets(EffectAudioHelpers.loadSpritesByName("lobby", param1, -256, "dragbar_disabled"), param0 ^ -12035);
          ScrollBar.field_Mb = new UiComponent(0L, (UiComponent) null);
          ScrollBar.field_Mb.field_rb = ByteArrayPool.loadSpriteByName("lobby", "upbutton", param1, 11091);
          ScrollBar.field_Mb.field_K = ByteArrayPool.loadSpriteByName("lobby", "upbutton_mouseover", param1, 11091);
          ScrollBar.field_Mb.field_nb = ByteArrayPool.loadSpriteByName("lobby", "upbutton_mouseheld", param1, 11091);
          ScrollBar.field_Mb.field_cb = ByteArrayPool.loadSpriteByName("lobby", "upbutton_disabled", param1, 11091);
          IntHashIndex.field_b = new UiComponent(0L, (UiComponent) null);
          IntHashIndex.field_b.field_rb = ByteArrayPool.loadSpriteByName("lobby", "downbutton", param1, 11091);
          IntHashIndex.field_b.field_K = ByteArrayPool.loadSpriteByName("lobby", "downbutton_mouseover", param1, 11091);
          IntHashIndex.field_b.field_nb = ByteArrayPool.loadSpriteByName("lobby", "downbutton_mouseheld", param1, 11091);
          IntHashIndex.field_b.field_cb = ByteArrayPool.loadSpriteByName("lobby", "downbutton_disabled", param1, 11091);
          TextLayoutLine.field_f = new VerticalScrollbar(0L, ScrollBar.field_Mb, IntHashIndex.field_b, MusicPatch.field_k, IntHashIndex.field_c);
          BirthDateEntryPanel.field_Q = new ScrollPaneWithFooter(0L, (UiComponent) null, MenuScreen.field_e, TextLayoutLine.field_f, EffectVolumeHelpers.field_b, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("lc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public PulseEffect() {
    }

    static {
        field_m = new boolean[112];
        field_l = new ClientProtocolStage();
        field_n = "From <%0>: ";
        field_g = "Reload game";
        field_i = "Prepared";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundCache {
    static String loadingExtradata;
    private IterableNodeHashTable field_e;
    static String fsAcceptCountdownPl;
    static String tutorialNineBallBreak;
    static int field_b;
    static int[] field_g;
    private ResourceArchive field_d;
    private ResourceArchive field_h;
    static nj[] field_a;
    static IntrusiveDeque field_k;
    private IterableNodeHashTable field_f;

    private final PcmSample a(String param0, byte param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        PcmSample stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_h.getGroupId(param0, -1);
          if (0 > var5_int) {
            stackIn_2_0 = null;
            return (PcmSample) (stackIn_2_0);
          }
          var6 = this.field_h.a(var5_int, param1 ^ 18, param3);
          if (param1 != 18) {
            fsAcceptCountdownPl = (String) null;
          }
          if (var6 >= 0) {
            stackIn_9_0 = this.a(true, var5_int, var6, param2);
            return stackIn_9_0;
          }
          stackIn_7_0 = null;
          return (PcmSample) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("cf.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        field_g = null;
        if (param0 != 28746) {
          field_g = (int[]) null;
        }
        tutorialNineBallBreak = null;
        loadingExtradata = null;
        fsAcceptCountdownPl = null;
        field_a = null;
    }

    final static void a(int param0, ResourceArchive param1) {
        TableScene var10 = null;
        IndexedSprite var11 = null;
        int[] var25 = null;
        int[] var23 = null;
        int[] var13 = null;
        int[] var4_ref_int__ = null;
        int var5_int = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        Sprite dupTemp$0 = null;
        Sprite var14 = null;
        Sprite var8 = null;
        Sprite dupTemp$1 = null;
        Sprite var15 = null;
        Sprite dupTemp$2 = null;
        Sprite var16 = null;
        Sprite dupTemp$3 = null;
        Sprite var17 = null;
        Sprite dupTemp$4 = null;
        Sprite var18 = null;
        Sprite dupTemp$5 = null;
        Sprite var19 = null;
        Sprite[] var3 = null;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        Sprite[] var20 = null;
        int var4 = 0;
        IndexedSprite var21 = null;
        int var2_int = 0;
        int var9 = Pool.field_O;
        Sprite var8Lifetime1;
        Sprite var8Lifetime2;
        Sprite var8Lifetime3;
        Sprite var8Lifetime4;
        Sprite var8Lifetime5;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var2_intLifetime4;
        try {
          for (var2_int = 0; var2_int < nn.field_b.length; var2_int++) {
            var10 = nn.field_b[var2_int];
            var10.c(-23569, param1);
          }
          for (var2_intLifetime1 = 0; PoolGameModel.field_B.length > var2_intLifetime1; var2_intLifetime1++) {
            PoolGameModel.field_B[var2_intLifetime1].loadTopBarSprites(198123656, param1);
          }
          IntrusiveNodeHashTable.field_b = new Sprite[]{WidgetStyleLayer.loadSprite("", (byte) 46, "menu_background_modern", param1), WidgetStyleLayer.loadSprite("", (byte) 42, "menu_background_plasma", param1), WidgetStyleLayer.loadSprite("", (byte) 62, "menu_background_jungle", param1), WidgetStyleLayer.loadSprite("", (byte) 40, "menu_background_polar", param1), WidgetStyleLayer.loadSprite("", (byte) 76, "menu_background_shuttle", param1)};
          uj.field_c = WidgetStyleLayer.loadSprite("", (byte) 124, "select_table_thumbnail_modern", param1);
          NineSliceFrame.field_d = WidgetStyleLayer.loadSprite("", (byte) 120, "select_table_thumbnail_plasma", param1);
          sk.field_b = WidgetStyleLayer.loadSprite("", (byte) 121, "select_table_thumbnail_jungle", param1);
          LobbyPlayer.field_Vb = WidgetStyleLayer.loadSprite("", (byte) 44, "select_table_thumbnail_polar", param1);
          wn.field_e = WidgetStyleLayer.loadSprite("", (byte) 91, "select_table_thumbnail_shuttle", param1);
          pk.field_b = WidgetStyleLayer.loadSprite("", (byte) 50, "select_table_thumbnail_jungle_locked", param1);
          tq.field_n = WidgetStyleLayer.loadSprite("", (byte) 87, "select_table_thumbnail_polar_locked", param1);
          IntrusiveNodeHashTable.field_g = WidgetStyleLayer.loadSprite("", (byte) 62, "select_table_thumbnail_shuttle_locked", param1);
          MatchingTextValidator.field_t = new Sprite[]{null, null, pk.field_b, tq.field_n, IntrusiveNodeHashTable.field_g};
          TutorialSelectScreen.field_K = new Sprite[]{uj.field_c, NineSliceFrame.field_d, sk.field_b, LobbyPlayer.field_Vb, wn.field_e};
          nn.field_a[0] = NameEntryPopup.a(cq.a(param0, 0), "", param1, "gameopt_listicons_turntime");
          nn.field_a[2] = NameEntryPopup.a(param0 + 0, "", param1, "gameopt_listicons_theme");
          nn.field_a[1] = NameEntryPopup.a(cq.a(param0, 0), "", param1, "gameopt_listicons_ruleset");
          nn.field_a[3] = NameEntryPopup.a(0, "", param1, "gameopt_listicons_guides");
          ff.field_f[0] = nn.field_a[0];
          ff.field_f[2] = NameEntryPopup.a(cq.a(param0, 0), "", param1, "gameopt_buttonicons_theme");
          ff.field_f[3] = nn.field_a[3];
          ff.field_f[1] = nn.field_a[1];
          rm.field_g = gn.a(NameEntryPopup.a(0, "", param1, "frame"), (byte) -29);
          MidiPcmStream.field_y = gn.a(NameEntryPopup.a(0, "", param1, "frame_dark"), (byte) -29);
          UsernameSuggestionsPanel.field_N = gn.a(NameEntryPopup.a(param0 + 0, "", param1, "frame_black"), (byte) -29);
          ln.field_s = gn.a(NameEntryPopup.a(0, "", param1, "frame_selected"), (byte) -29);
          cq.field_b = gn.a(NameEntryPopup.a(0, "", param1, "menu_main_frame"), (byte) -29);
          DisplayNamePanel.field_T = WidgetStyleLayer.loadSprite("", (byte) 109, "menu_main_frame_pocket_bottom", param1);
          mj.field_b = WidgetStyleLayer.loadSprite("", (byte) 104, "menu_main_frame_pocket_top", param1);
          bi.field_a = WidgetStyleLayer.loadSprite("", (byte) 47, "menu_main_frame_pocket_left", param1);
          MessageDialogContent.field_T = WidgetStyleLayer.loadSprite("", (byte) 123, "menu_main_frame_pocket_right", param1);
          FullscreenFocusCanvas.field_a = lb.loadSprite(param1, -45, "", "title_corner_ball8");
          cl.field_k = lb.loadSprite(param1, param0 ^ 101, "", "title_corner_ball9");
          IsaacCipher.field_f = NameEntryPopup.a(0, "", param1, "achievements");
          for (var2_intLifetime2 = 0; IsaacCipher.field_f.length > var2_intLifetime2; var2_intLifetime2++) {
            TextInputValidator.a(IsaacCipher.field_f[var2_intLifetime2], (byte) -12);
          }
          te.field_n = lb.loadSprite(param1, 99, "", "achievement_highlight_hover");
          td.field_g = lb.loadSprite(param1, 109, "", "achievement_highlight_selected");
          cl.field_m = lb.loadSprite(param1, -10, "", "title_pool_logo_withalpha");
          var11 = RankingsScreen.a(param1, 3812, "gradient_arrow_left", "");
          var25 = var11.field_i;
          var23 = new int[var25.length];
          var13 = var23;
          var4_ref_int__ = var13;
          for (var5_int = 0; var5_int < var25.length; var5_int++) {
            var23[var5_int] = var5_int;
          }
          StrongCacheEntry.a(var25, var23, (byte) -54);
          var5 = dn.a(var4_ref_int__, (byte) 117, ta.buildGradientPalette(new int[]{0, 16744192, var25.length, 16777087}, param0 ^ -126));
          var6 = dn.a(var4_ref_int__, (byte) 10, ta.buildGradientPalette(new int[]{0, 16776960, var25.length, 16777023}, 18));
          var7 = dn.a(var4_ref_int__, (byte) 7, ta.buildGradientPalette(new int[]{0, 8355711, var25.length, 16777215}, param0 ^ 70));
          var11.field_i = var5;
          dupTemp$0 = ii.a(2, var11);
          hp.field_b = dupTemp$0;
          var14 = dupTemp$0;
          var8 = var14;
          var8.field_B = 0;
          var8.field_w = var14.field_z;
          var8.field_y = var14.field_A;
          var8.field_G = 0;
          var11.field_i = var6;
          dupTemp$1 = ii.a(2, var11);
          eh.field_y = dupTemp$1;
          var15 = dupTemp$1;
          var8Lifetime1 = var15;
          var8Lifetime1.field_w = var15.field_z;
          var8Lifetime1.field_y = var15.field_A;
          var8Lifetime1.field_G = 0;
          var8Lifetime1.field_B = 0;
          var11.field_i = var7;
          dupTemp$2 = ii.a(param0 + 2, var11);
          ProgressBarWidget.field_T = dupTemp$2;
          var16 = dupTemp$2;
          var8Lifetime2 = var16;
          var8Lifetime2.field_G = 0;
          var8Lifetime2.field_B = 0;
          var8Lifetime2.field_w = var16.field_z;
          var8Lifetime2.field_y = var16.field_A;
          var11.a();
          var11.field_i = var5;
          dupTemp$3 = ii.a(2, var11);
          CushionSegment.field_h = dupTemp$3;
          var17 = dupTemp$3;
          var8Lifetime3 = var17;
          var8Lifetime3.field_G = 0;
          var8Lifetime3.field_w = var17.field_z;
          var8Lifetime3.field_y = var17.field_A;
          var8Lifetime3.field_B = 0;
          var11.field_i = var6;
          dupTemp$4 = ii.a(2, var11);
          wf.field_a = dupTemp$4;
          var18 = dupTemp$4;
          var8Lifetime4 = var18;
          var8Lifetime4.field_w = var18.field_z;
          var8Lifetime4.field_G = param0;
          var8Lifetime4.field_y = var18.field_A;
          var8Lifetime4.field_B = 0;
          var11.field_i = var7;
          dupTemp$5 = ii.a(2, var11);
          ag.field_b = dupTemp$5;
          var19 = dupTemp$5;
          var8Lifetime5 = var19;
          var8Lifetime5.field_y = var19.field_A;
          var8Lifetime5.field_B = 0;
          var8Lifetime5.field_G = 0;
          var8Lifetime5.field_w = var19.field_z;
          var2_intLifetime3 = 0;
          var3 = NetworkGameClient.a(106, param1, "titles", "");
          incrementValue$6 = var2_intLifetime3;
          var2_intLifetime3++;
          AudioService.field_a = var3[incrementValue$6];
          incrementValue$7 = var2_intLifetime3;
          var2_intLifetime3++;
          ScrollPaneWithFooter.field_Pb = var3[incrementValue$7];
          incrementValue$8 = var2_intLifetime3;
          var2_intLifetime3++;
          HighscoresScreen.field_M = var3[incrementValue$8];
          incrementValue$9 = var2_intLifetime3;
          var2_intLifetime3++;
          AimTarget.field_i = var3[incrementValue$9];
          incrementValue$10 = var2_intLifetime3;
          var2_intLifetime3++;
          VerticalScrollbar.field_Wb = var3[incrementValue$10];
          incrementValue$11 = var2_intLifetime3;
          var2_intLifetime3++;
          LobbyPlayer.field_Lb = var3[incrementValue$11];
          incrementValue$12 = var2_intLifetime3;
          var2_intLifetime3++;
          ChatMessageLine.field_w = var3[incrementValue$12];
          incrementValue$13 = var2_intLifetime3;
          var2_intLifetime3++;
          FreePlayRules.field_k = var3[incrementValue$13];
          incrementValue$14 = var2_intLifetime3;
          var2_intLifetime3++;
          DialogLayer.field_Q = var3[incrementValue$14];
          il.field_f = WidgetStyleLayer.loadSprite("", (byte) 84, "side_power_bar", param1);
          LimitedRandomAccessFile.field_c = WidgetStyleLayer.loadSprite("", (byte) 94, "side_power_bar_fill", param1);
          bq.field_n = WidgetStyleLayer.loadSprite("", (byte) 102, "top_bar_inner", param1);
          Js5Transport.field_q = WidgetStyleLayer.loadSprite("", (byte) 115, "top_bar", param1);
          ClassicBallSkin.field_n = WidgetStyleLayer.loadSprite("", (byte) 80, "top_bar_ball_open", param1);
          Quaternion.field_l = NameEntryPopup.a(0, "", param1, "hud_chat_tab_frame_empty");
          lb.field_O = NameEntryPopup.a(0, "", param1, "hud_chat_tab_frame");
          dr.field_d = WidgetStyleLayer.loadSprite("", (byte) 95, "hud_chat_star", param1);
          var2_intLifetime4 = sa.field_h.b(UsernameAvailabilityValidator.chatButton);
          ta.field_e = new Sprite(var2_intLifetime4, sa.field_h.maxAscent + sa.field_h.maxDescent + 1);
          ta.field_e.e();
          sa.field_h.d(UsernameAvailabilityValidator.chatButton, 0, sa.field_h.maxAscent, 16777215, 1);
          jh.field_e = new Sprite(dr.field_d.field_z + ta.field_e.field_z + 2, ta.field_e.field_A);
          jh.field_e.e();
          sa.field_h.d(UsernameAvailabilityValidator.chatButton, 0, sa.field_h.maxAscent, 16777215, 1);
          dr.field_d.draw(2 + var2_intLifetime4, jh.field_e.field_A - dr.field_d.field_A >> 1);
          OpacityWidget.field_P.bindAsRenderTarget(15100);
          wp.field_a = WidgetStyleLayer.loadSprite("", (byte) 60, "slider", param1);
          WidgetStyleLayer.loadSprite("", (byte) 35, "flash_foul", param1);
          WidgetStyleLayer.loadSprite("", (byte) 91, "hud_hbar_inner", param1);
          DebouncedValidationProvider.field_b = gn.a(NameEntryPopup.a(0, "", param1, "hud_hbar_frame"), (byte) -29);
          id.field_a = gn.a(NameEntryPopup.a(0, "", param1, "hud_vbar_frame"), (byte) -29);
          DateInputWidget.field_Q = NameEntryPopup.a(0, "", param1, "top_bar_frame");
          RasterBuffer.field_d = WidgetStyleLayer.loadSprite("", (byte) 73, "icon_break", param1);
          il.field_a = WidgetStyleLayer.loadSprite("", (byte) 73, "icon_ball_in_hand", param1);
          WidgetStyleLayer.loadSprite("", (byte) 98, "icon_extra_shot", param1);
          gd.field_e = WidgetStyleLayer.loadSprite("", (byte) 101, "icon_extra_visit", param1);
          TableScene.field_D = WidgetStyleLayer.loadSprite("", (byte) 90, "icon_snookered", param1);
          sb.field_c = new Sprite[4];
          sb.field_c[0] = WidgetStyleLayer.loadSprite("", (byte) 108, "menu_eightball", param1);
          sb.field_c[1] = WidgetStyleLayer.loadSprite("", (byte) 107, "menu_nineball", param1);
          sb.field_c[2] = WidgetStyleLayer.loadSprite("", (byte) 63, "menu_killer", param1);
          sb.field_c[3] = WidgetStyleLayer.loadSprite("", (byte) 112, "menu_freeplay", param1);
          var20 = NameEntryPopup.a(0, "", param1, "tutorial_text_box");
          ff.field_e = new Sprite[]{new Sprite(0, var20[0].field_y), var20[0], new Sprite(0, var20[0].field_y), new Sprite(0, var20[1].field_y), var20[1], new Sprite(0, var20[1].field_y), new Sprite(0, var20[2].field_y), var20[2], new Sprite(0, var20[2].field_y)};
          dq.field_e = NameEntryPopup.a(0, "", param1, "playerlist_button");
          vm.field_d = NameEntryPopup.a(0, "", param1, "tutorial_controls");
          qg.field_b = WidgetStyleLayer.loadSprite("", (byte) 52, "tutorial_box_progress", param1);
          AccountCreationForm.field_Z = ArchiveRequest.a(param1, "", -24155, "controls");
          bi.field_d = new int[AccountCreationForm.field_Z.length];
          op.field_f = 0;
          for (var4 = 0; AccountCreationForm.field_Z.length > var4; var4++) {
            var21 = AccountCreationForm.field_Z[var4];
            var21.trimX = 0;
            var21.fullHeight = var21.height;
            var21.fullWidth = var21.width;
            var21.trimY = 0;
            bi.field_d[var4] = var21.fullHeight + sa.field_h.maxAscent - sa.field_h.maxDescent >> 1;
            if (op.field_f < var21.height) {
              op.field_f = var21.height;
            }
          }
          bc.b((byte) 17);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cf.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final PcmSample a(int[] param0, int param1, int param2, int param3) {
        PcmSample stackIn_2_0 = null;
        Object stackIn_14_0 = null;
        PcmSample stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        VorbisSample var9 = null;
        int var10 = 0;
        PcmSample var8Lifetime1;
        try {
          var5_int = (param2 >>> 12 | (param2 & -1610608641) << 4) ^ param3;
          var5_int = var5_int | param2 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (PcmSample) (this.field_f.a(false, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            return null;
          }
          var10 = -125 % ((param1 - 64) / 36);
          var9 = (VorbisSample) (this.field_e.a(false, var6));
          if (var9 == null) {
            var9 = VorbisSample.a(this.field_d, param2, param3);
            if (var9 == null) {
              return null;
            }
            this.field_e.a((byte) -128, var9, var6);
          }
          var8Lifetime1 = var9.decodeToPcm(param0);
          if (var8Lifetime1 == null) {
            stackIn_14_0 = null;
            return (PcmSample) (stackIn_14_0);
          }
          var9.unlink((byte) -117);
          this.field_f.a((byte) -128, var8Lifetime1, var6);
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("cf.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final PcmSample a(boolean param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        SoundEffect var9 = null;
        PcmSample var10 = null;
        PcmSample stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        PcmSample stackIn_10_0 = null;
        PcmSample stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSample var8Lifetime1;
        try {
          var5_int = param2 ^ (param1 >>> 12 | (param1 & 1879052287) << 4);
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int;
          var8 = (PcmSample) (this.field_f.a(false, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            stackIn_7_0 = null;
            return (PcmSample) (stackIn_7_0);
          }
          if (!param0) {
            stackIn_10_0 = (PcmSample) null;
            return stackIn_10_0;
          }
          var9 = SoundEffect.a(this.field_h, param1, param2);
          if (var9 == null) {
            return null;
          }
          var10 = var9.toPcmSample();
          var8Lifetime1 = var10;
          this.field_f.a((byte) -126, var8Lifetime1, var6);
          if (param3 != null) {
            param3[0] = param3[0] - var10.field_n.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("cf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final PcmSample a(String param0, boolean param1, String param2) {
        RuntimeException var4 = null;
        String var5 = null;
        PcmSample stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var5 = (String) null;
            this.a((String) null, false, (String) null);
          }
          stackIn_3_0 = this.a(param2, param0, (int[]) null, (byte) 126);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("cf.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final PcmSample a(String param0, String param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        PcmSample stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_d.getGroupId(param0, -1);
          if (var5_int < 0) {
            return null;
          }
          var6 = -114 % ((4 - param3) / 60);
          var7 = this.field_d.a(var5_int, 0, param1);
          if (var7 < 0) {
            return null;
          }
          stackIn_7_0 = this.a(param2, -50, var5_int, var7);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("cf.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final PcmSample a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_h.f(param2)) {
            stackIn_3_0 = this.a(true, 0, param1, param0);
            return stackIn_3_0;
          }
          if (1 != this.field_h.a(false, param1)) {
            throw new RuntimeException();
          }
          stackIn_6_0 = this.a(true, param1, 0, param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cf.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, long param1) {
        if (0L >= param1) {
          return;
        }
        if (param0 >= -77) {
          tutorialNineBallBreak = (String) null;
        }
        if (0L == param1 % 10L) {
          Bzip2DecoderState.a(param1 - 1L, (byte) 104);
          Bzip2DecoderState.a(1L, (byte) 104);
        } else {
          Bzip2DecoderState.a(param1, (byte) 104);
        }
    }

    final PcmSample a(String param0, String param1, byte param2) {
        RuntimeException var4 = null;
        String var5 = null;
        PcmSample stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 120) {
            var5 = (String) null;
            this.a((String) null, true, (String) null);
          }
          stackIn_3_0 = this.a(param0, (byte) 18, (int[]) null, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("cf.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3 = EightBallRules.c((byte) -123, param2);
        int var4 = UiComponentNode.sineFixed(param2, (byte) -116);
        int var5 = EightBallRules.c((byte) -124, param0);
        int var6 = UiComponentNode.sineFixed(param0, (byte) -89);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        if (param1) {
          return (int[]) null;
        }
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    SoundCache(ResourceArchive param0, ResourceArchive param1) {
        this.field_e = new IterableNodeHashTable(256);
        this.field_f = new IterableNodeHashTable(256);
        try {
          this.field_d = param1;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final PcmSample b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d.f(-1) == 1) {
            stackIn_3_0 = this.a(param0, 127, 0, param2);
            return stackIn_3_0;
          }
          if (this.field_d.a(false, param2) == 1) {
            stackIn_7_0 = this.a(param0, 3, param2, 0);
            return stackIn_7_0;
          }
          if (param1 != 6789) {
            this.field_d = (ResourceArchive) null;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("cf.I(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        loadingExtradata = "Loading extra data";
        tutorialNineBallBreak = "Now let's \"break\": Shoot the cue ball at the rack (the triangle of balls) now. Aim for the 1 ball.";
        fsAcceptCountdownPl = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_g = new int[64];
    }
}

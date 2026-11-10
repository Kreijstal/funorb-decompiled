/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fp {
    static int[] field_d;
    static int field_e;
    static int field_a;
    static String field_b;
    static it field_c;

    public static void releaseStatics(int param0) {
        if (param0 != 29325) {
          fp.releaseStatics(-97);
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(String param0, int param1, ResourceArchive param2, byte param3) {
        int var5_int = 0;
        int var9_int = 0;
        int var12_int = 0;
        SpriteData[] var11 = null;
        SpriteData[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int incrementValue$8 = 0;
        int var10_int = 0;
        int var11_int = 0;
        Object var16 = null;
        int var15 = TombRacer.field_G ? 1 : 0;
        GameAssetLoader var16_ref = (GameAssetLoader) (dma.field_l);
        int var10_intLifetime1;
        int var11_intLifetime1;
        var16_ref.a(param1, (byte) 47, param0);
        ArrayWidgetGroup.field_v = SpriteData.loadSprite(param2, "", "title");
        eta.field_a = new SpriteData[6][];
        eta.field_a[0] = new SpriteData[1];
        eta.field_a[0][0] = SpriteData.loadSprite(param2, "", "billboard_flame");
        eta.field_a[1] = new SpriteData[1];
        eta.field_a[1][0] = SpriteData.loadSprite(param2, "", "billboard_smoke");
        eta.field_a[2] = new SpriteData[1];
        eta.field_a[2][0] = SpriteData.loadSprite(param2, "", "billboard_dust_thin");
        eta.field_a[3] = new SpriteData[1];
        eta.field_a[3][0] = SpriteData.loadSprite(param2, "", "billboard_dust_thick");
        eta.field_a[4] = new SpriteData[1];
        eta.field_a[4][0] = SpriteData.loadSprite(param2, "", "billboard_spark");
        eta.field_a[5] = new SpriteData[1];
        eta.field_a[5][0] = SpriteData.loadSprite(param2, "", "billboard_gas");
        int incrementValue$0 = param1;
        param1++;
        var16_ref.a(incrementValue$0, (byte) 47, param0);
        ColourFillOperator.field_p = new SpriteData[6];
        ColourFillOperator.field_p[0] = SpriteData.loadSprite(param2, "", "menu_button_sml");
        ColourFillOperator.field_p[1] = SpriteData.loadSprite(param2, "", "menu_button_mid");
        ColourFillOperator.field_p[2] = SpriteData.loadSprite(param2, "", "menu_button_lrg");
        ColourFillOperator.field_p[3] = SpriteData.loadSprite(param2, "", "menu_button_xlrg");
        ColourFillOperator.field_p[4] = SpriteData.loadSprite(param2, "", "button_main1");
        ColourFillOperator.field_p[5] = SpriteData.loadSprite(param2, "", "button_main2");
        int incrementValue$1 = param1;
        param1++;
        var16_ref.a(incrementValue$1, (byte) 47, param0);
        dna.field_F = SpriteData.loadSprite(param2, "", "bg_slab");
        RoundWinnerPhase.field_p = SpriteData.loadSheet(param2, "", "inset_frame");
        tba.field_f = SpriteData.loadSheet(param2, "", "keys");
        SpriteState.field_l = new int[tba.field_f.length];
        for (var5_int = 0; SpriteState.field_l.length > var5_int; var5_int++) {
          SpriteState.field_l[var5_int] = 12;
        }
        SpriteData var5 = tba.field_f[9];
        int var6 = var5.field_i;
        var5.field_i = var5.field_i - 9;
        byte[] var7 = var5.field_h;
        byte[] var8 = var5.field_f;
        var5.field_h = new byte[var5.field_i * var5.field_a];
        var5.field_f = new byte[var5.field_a * var5.field_i];
        for (var9_int = 0; var9_int < var5.field_a; var9_int++) {
          for (var10_int = 0; var10_int < var5.field_i; var10_int++) {
            var5.field_f[var10_int + var5.field_i * var9_int] = var8[var6 * var9_int + var10_int];
            var5.field_h[var9_int * var5.field_i + var10_int] = var7[var9_int * var6 + var10_int];
          }
        }
        SpriteData var9 = tba.field_f[11];
        var6 = var9.field_i;
        var9.field_i = var9.field_i - 5;
        var7 = var9.field_h;
        var8 = var9.field_f;
        var9.field_h = new byte[var9.field_i * var9.field_a];
        var9.field_f = new byte[var9.field_i * var9.field_a];
        for (var10_intLifetime1 = 0; var10_intLifetime1 < var9.field_a; var10_intLifetime1++) {
          for (var11_int = 0; var11_int < var9.field_i; var11_int++) {
            var9.field_f[var9.field_i * var10_intLifetime1 + var11_int] = var8[var11_int + var6 * var10_intLifetime1];
            var9.field_h[var10_intLifetime1 * var9.field_i + var11_int] = var7[var11_int + var10_intLifetime1 * var6];
          }
        }
        SpriteData var10 = tba.field_f[15];
        var6 = var10.field_i;
        var8 = var10.field_f;
        var7 = var10.field_h;
        var10.field_i = var10.field_i - 5;
        var10.field_f = new byte[var10.field_a * var10.field_i];
        var10.field_h = new byte[var10.field_i * var10.field_a];
        for (var11_intLifetime1 = 0; var11_intLifetime1 < var10.field_a; var11_intLifetime1++) {
          for (var12_int = 0; var12_int < var10.field_i; var12_int++) {
            var10.field_f[var12_int + var10.field_i * var11_intLifetime1] = var8[var6 * var11_intLifetime1 + var12_int];
            var10.field_h[var12_int + var10.field_i * var11_intLifetime1] = var7[var11_intLifetime1 * var6 + var12_int];
          }
        }
        int incrementValue$2 = param1;
        param1++;
        var16_ref.a(incrementValue$2, (byte) 47, param0);
        ara.field_vb = SpriteData.loadSprite(param2, "", "hud_score");
        tla.field_g = SpriteData.loadSprite(param2, "", "hud_room");
        CharacterChoice.field_c = SpriteData.loadSprite(param2, "", "hud_timer");
        LegacyOpenGlTexture3D.field_l = SpriteData.loadSprite(param2, "", "hud_timer_head");
        wj.field_a = SpriteData.loadSprite(param2, "", "hud_timer_jaw");
        ProxySocketConnector.field_e = SpriteData.loadSheet(param2, "", "hud_sand");
        via.field_a = new SpriteData[3];
        via.field_a[2] = SpriteData.loadSprite(param2, "", "hud_idolhead");
        via.field_a[0] = SpriteData.loadSprite(param2, "", "hud_coin");
        via.field_a[1] = SpriteData.loadSprite(param2, "", "hud_bag");
        Transform3D.field_d = SpriteData.loadSheet(param2, "", "frame_main");
        nm.field_i = SpriteData.loadSprite(param2, "", "map_room");
        int incrementValue$3 = param1;
        param1++;
        var16_ref.a(incrementValue$3, (byte) 47, param0);
        WidgetStyleLayer.field_f = SpriteData.loadSheet(param2, "", "achievements");
        MatchStatistics.field_g = SpriteData.loadSprite(PitComponent.field_G, "basic", "unachieved");
        aa.field_a = SpriteData.loadSprite(param2, "", "map_routedot");
        pha.field_Bb = SpriteData.loadSprite(param2, "", "map_coin_gold");
        ConstrainToRectangleLocomotor.field_t = SpriteData.loadSprite(param2, "", "map_coin_silver");
        MatchScreen.field_q = SpriteData.loadSprite(param2, "", "map_coin_bronze");
        TimeSwitchBehaviour.field_n = SpriteData.loadSprite(param2, "", "map_locationdot");
        int incrementValue$4 = param1;
        param1++;
        var16_ref.a(incrementValue$4, (byte) 47, param0);
        WallCrusherComponent.field_F = new SpriteData[9];
        WallCrusherComponent.field_F[0] = SpriteData.loadSprite(param2, "", "map_set1");
        WallCrusherComponent.field_F[1] = SpriteData.loadSprite(param2, "", "map_set2a");
        WallCrusherComponent.field_F[2] = SpriteData.loadSprite(param2, "", "map_set2b");
        WallCrusherComponent.field_F[3] = SpriteData.loadSprite(param2, "", "map_set3a");
        WallCrusherComponent.field_F[4] = SpriteData.loadSprite(param2, "", "map_set3b");
        WallCrusherComponent.field_F[5] = SpriteData.loadSprite(param2, "", "map_set3c");
        WallCrusherComponent.field_F[6] = SpriteData.loadSprite(param2, "", "map_set4a");
        WallCrusherComponent.field_F[7] = SpriteData.loadSprite(param2, "", "map_set4b");
        WallCrusherComponent.field_F[8] = SpriteData.loadSprite(param2, "", "map_set5");
        int incrementValue$5 = param1;
        param1++;
        var16_ref.a(incrementValue$5, (byte) 47, param0);
        LegacyOpenGlCubeTexture.field_l = SpriteData.loadSprite(param2, "", "silhoutte");
        baa.field_g = SpriteData.loadSprite(param2, "", "slab_small1");
        FullscreenConfirmationDialog.field_O = SpriteData.loadSprite(param2, "", "slab_small2");
        WaveformOperator.field_q = SpriteData.loadSprite(param2, "", "slab_small3");
        SceneLight.field_n = SpriteData.loadSprite(param2, "", "slab_small4");
        vua.field_y = SpriteData.loadSprite(param2, "", "slab_medium");
        int incrementValue$6 = param1;
        param1++;
        var16_ref.a(incrementValue$6, (byte) 47, param0);
        Effect.field_e = new SpriteData[7];
        Effect.field_e[0] = SpriteData.loadSprite(param2, "", "reward_coin");
        Effect.field_e[1] = SpriteData.loadSprite(param2, "", "reward_moneybag");
        Effect.field_e[2] = SpriteData.loadSprite(param2, "", "reward_idol");
        ena.field_l = SpriteData.loadSprite(param2, "", "endround_flag");
        MirrorComponent.field_F = SpriteData.loadSprite(param2, "", "endround_divider_line");
        rp.field_f = SpriteData.loadSprite(param2, "", "endround_smoke_trail");
        StandingsPhase.field_o = SpriteData.loadSheet(param2, "", "endround_stage_lines");
        ko.field_j = SpriteData.loadSprite(param2, "", "podium");
        int incrementValue$7 = param1;
        param1++;
        var16_ref.a(incrementValue$7, (byte) 47, param0);
        ht.field_Db = SpriteData.loadSprite(param2, "", "options_bar_empty");
        RenderableNode.field_j = SpriteData.loadSprite(param2, "", "options_bar_full");
        ResourceArchive.field_h = SpriteData.loadSprite(param2, "", "button_music");
        re.field_a = SpriteData.loadSprite(param2, "", "button_sound");
        ina.field_c = SpriteData.loadSheet(param2, "", "multipliers");
        lt.field_a = SpriteData.loadSprite(param2, "", "room_total");
        FleeLocomotor.field_C = SpriteData.loadSprite(param2, "", "tombname_frame");
        mna.field_c = SpriteData.loadSheet(param2, "", "blackframe");
        fm.field_h = SpriteData.loadSprite(param2, "", "sandblock");
        TextResourceLoader.field_b = SpriteData.loadSprite(param2, "", "medal_gold");
        sla.field_a = SpriteData.loadSprite(param2, "", "medal_silver");
        if (param3 != 17) {
          return;
        }
        try {
          SocketArchiveNetworkClient.field_s = SpriteData.loadSprite(param2, "", "medal_bronze");
          var11 = SpriteData.loadSheet(param2, "", "mugshots");
          var12 = SpriteData.loadSheet(param2, "", "hud_icons");
          LegacyOpenGlSpriteTexture.field_u = var12[1];
          mp.field_d = var12[1];
          nk.field_k = new SpriteData[13];
          var13 = 0;
          for (var14 = 0; var14 < 13; var14++) {
            nk.field_k[var13] = var11[var13];
            var13++;
          }
          hka.field_c = var11[var13];
          incrementValue$8 = param1;
          param1++;
          var16_ref.a(incrementValue$8, (byte) 47, param0);
          MaskBlendOperator.a(PitComponent.field_G, "basic", "orbcoin", -121);
          MatchState.field_p = MaskBlendOperator.a(param2, "", "lobby_game_logo", -119);
          RoundWinnerPhase.field_m = BoulderComponent.a(param2, "", 5, "lobby_icons");
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        boolean stackIn_40_2 = false;
        apa stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        apa var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var1_int = jua.field_d;
          if (param0 != -83) {
            fp.a((byte) -23);
          }
          var2 = 0;
          if (mq.field_a == 2) {
            var3_long = bva.currentTimeMillis((byte) -107) - PlatformComponent.field_H;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; mba.field_g.length > var3; var3++) {
            var4 = CoinItemComponent.field_H[var3];
            if (var4 >= 0) {
              if (FacePointLocomotor.field_r.field_h == var4) {
                var5 = ct.field_a;
              } else {
                var5 = MandelbrotOperator.field_m;
              }
            } else {
              var5 = mn.field_k;
            }
            var6 = mba.field_g[var3];
            if (2 == mq.field_a &&
              var2 == 1) {
              if (cia.field_a.length < pm.field_d.length) {
                stackIn_19_0 = pm.field_d.length;
              } else {
                stackIn_19_0 = cia.field_a.length;
              }
              var7 = stackIn_19_0;
              if (var3 >= 6 &&
                var7 + 6 > var3) {
                if (cia.field_a.length - 6 + (var3 - var7) >= 0) {
                  stackIn_24_0 = cia.field_a[-var7 + (var3 - 6 + cia.field_a.length)];
                } else {
                  stackIn_24_0 = "";
                }
                var6 = stackIn_24_0;
              }
              if (C2SActionPacket.field_k.length <= ToggleMusicChannelCommand.field_o.length) {
                stackIn_28_0 = ToggleMusicChannelCommand.field_o.length;
              } else {
                stackIn_28_0 = C2SActionPacket.field_k.length;
              }
              var8 = stackIn_28_0;
              if (var3 >= 7 + var7 &&
                7 + var7 + var8 > var3) {
                if (ToggleMusicChannelCommand.field_o.length > -7 + (var3 - var7)) {
                  stackIn_33_0 = ToggleMusicChannelCommand.field_o[-7 + var3 - var7];
                } else {
                  stackIn_33_0 = "";
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_39_0 = -116;
            stackIn_39_1 = var6;
            stackIn_40_2 = !(var4 < 0);
            var7Lifetime1 = PathMoveLocomotor.$cfr$intArgs$a$590e95718a07(stackIn_39_0, stackIn_39_1, stackIn_40_2);
            var8Lifetime1 = ega.field_c - (var7Lifetime1 >> 1);
            if (0 <= var4) {
              if (var4 == FacePointLocomotor.field_r.field_h) {
                stackIn_45_0 = mpa.field_V;
              } else {
                stackIn_45_0 = jaa.field_b;
              }
              var9 = stackIn_45_0;
              var1_int = var1_int + mha.field_C;
              if (var9 != null) {
                var9.a((byte) 57, var7Lifetime1 + (InvisibleTouchSwitchComponent.field_L << 1), var1_int, -InvisibleTouchSwitchComponent.field_L + var8Lifetime1, nt.field_d + (GasVentModel.field_p << 1));
              }
              var1_int = var1_int + GasVentModel.field_p;
            }
            if (var4 >= 0) {
              qt.field_a.c(var6, var8Lifetime1, MatchPhase.field_j + var1_int, var5, -1);
              var1_int = var1_int + (nt.field_d + GasVentModel.field_p + mha.field_C);
            } else {
              ConsoleValue.field_c.c(var6, var8Lifetime1, var1_int + vi.field_a, var5, -1);
              var1_int = var1_int + ComponentTargetList.field_b;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "fp.C(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        if (dna.field_G) {
          return;
        }
        int var1 = 71 % ((-30 - param0) / 44);
        if (null != cs.field_c &&
          !cs.field_c.g(126)) {
          return;
        }
        int var2 = aq.a(-5640);
        int var3 = BufferedSocket.a(2147483647, new Random(), 45);
        cs.field_c = new MatchScreen(false, 0, new String[]{""}, 0, false, var2, -1 + var2, 1, 2, 0, (BitSet[]) null, new boolean[]{ReportAbuseDialog.field_ub > 0 ? true : false}, new qha(var3));
        cs.field_c.k((byte) -25);
        wka.field_d = true;
    }

    static {
        field_a = 49;
        field_b = "Freezethrower";
        field_c = new it();
    }
}

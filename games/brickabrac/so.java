/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static String field_e;
    private to field_a;
    static AppletGameShell field_f;
    static int field_b;
    static fk field_d;
    private ResourceArchive field_g;
    private ResourceArchive field_c;

    final static RasterCacheSurface a(int param0, int param1, int param2, NodeDeque param3) {
        Object var4 = null;
        RasterCacheSurface var5 = null;
        NodeDeque var6 = null;
        Object stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = null;
          if (param0 != 0) {
            var6 = (NodeDeque) null;
            so.a(8, 113, -81, (NodeDeque) null);
          }
          var5 = (RasterCacheSurface) (param3.first(-15));
          while (var5 != null) {
            if (!var5.matchesCacheKeys((byte) -84, param1, param2)) {
              var5 = (RasterCacheSurface) (param3.next((byte) 116));
              continue;
            }
            var4 = var5;
            break;
          }
          if (var4 == null) {
            var4 = (RasterCacheSurface) (param3.removeLast(127));
          }
          param3.addFirst(true, (IntrusiveNode) (var4));
          stackIn_11_0 = var4;
          return (RasterCacheSurface) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("so.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        int var1 = 22 % ((param0 - 19) / 35);
        field_d = null;
        field_e = null;
    }

    final static int a(byte param0) {
        if (param0 != -35) {
          return 43;
        }
        return gr.pointerIdleTicks;
    }

    final kn a(int param0, byte param1) {
        byte[] var4 = null;
        kn var3 = (kn) (this.field_a.a((long)param0, true));
        if (var3 != null) {
          return var3;
        }
        if (param0 < 32768) {
          var4 = this.field_g.takeFile(param0, 0, 4);
        } else {
          var4 = this.field_c.takeFile(32767 & param0, 0, 4);
        }
        var3 = new kn();
        if (var4 != null) {
          var3.a(new PacketBuffer(var4), -29539);
        }
        if (param0 >= 32768) {
          var3.c((byte) -124);
        }
        int var5 = -120 % ((param1 - 22) / 49);
        this.field_a.a(72, var3, (long)param0);
        return var3;
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2, int param3, ResourceArchive param4) {
        int var7_int = 0;
        RgbSprite dupTemp$0 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        RgbSprite[] var7 = null;
        Object var8 = null;
        Object var9 = null;
        int var10_int = 0;
        RgbSprite var10 = null;
        int var11 = 0;
        RgbSprite var11_ref_jp = null;
        int var12 = 0;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        IndexedSprite[] var16 = null;
        byte[] var17 = null;
        IndexedSprite[] var18 = null;
        RgbSprite var19 = null;
        RgbSprite var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var5Lifetime1;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var10_intLifetime3;
        int var10_intLifetime4;
        int var10_intLifetime5;
        int var10_intLifetime6;
        int var10_intLifetime7;
        int var10_intLifetime8;
        int var10_intLifetime9;
        int var10_intLifetime10;
        int var10_intLifetime11;
        int var10_intLifetime12;
        int var10_intLifetime13;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          RankingsScreen.field_t = uo.loadIndexedSpriteByName((byte) 29, param0, "splash", "basic");
          er.field_b = pl.loadRgbSpriteByName("basic", "lobby_game_logo", (byte) 110, param0);
          var21 = param2.takeFileByName(-86, "basic", "gamefont");
          var15 = var21;
          var13 = var15;
          var5 = var13;
          var16 = PacketBuffer.a("basic", param0, "gamefont", param3 - 946744493);
          sn.a(param3 ^ 29068, var21, 1);
          ma.field_O = IndexedSpriteGeometry.a(0, var21, 0, var16, 0, 1);
          ma.field_O.palettes = bg.field_n;
          nn.field_g = IndexedSpriteGeometry.a(2, var21, 0, var16, 0, 1);
          nn.field_g.palettes = bg.field_n;
          var22 = param4.takeFileByName(86, "kartika13", "");
          var17 = var22;
          var14 = var17;
          var5Lifetime1 = var14;
          var18 = PacketBuffer.a("kartika13", param1, "", -946715356);
          ob.field_D = IndexedSpriteGeometry.a(0, var22, 0, var18, 0, 1);
          ob.field_D.palettes = bg.field_n;
          ce.field_e = IndexedSpriteGeometry.a(1, var22, 0, var18, 0, 1);
          ce.field_e.palettes = bg.field_n;
          gj.field_c = bd.loadRgbSpritesByName("basic", "menu_overlays", param0, (byte) -8);
          for (var7_int = 0; gj.field_c.length > var7_int; var7_int++) {
            gj.field_c[var7_int] = GameConnectionShell.a(gj.field_c[var7_int], 1);
            if (gj.field_c[var7_int].width == 0 ||
              gj.field_c[var7_int].height == 0) {
              gj.field_c[var7_int] = null;
            }
          }
          cd.field_h = kf.a("frame", "basic", param0, -122);
          t.field_d = kf.a("frame_track", "basic", param0, -128);
          t.field_d[4] = null;
          var7 = cd.field_h;
          var7[4] = null;
          pl.loadRgbSpriteByName("basic", "frame_bracket", (byte) 106, param0);
          AchievementBrowserScreen.field_A = kf.a("button_frame", "basic", param0, -91);
          Ball.field_G = kf.a("button_raised", "basic", param0, 103);
          pe.field_k = kf.a("button_depressed", "basic", param0, -104);
          IntrusiveHashTable.achievementSourceIcons = PacketBuffer.a("basic", param0, "achievements_large", -946715356);
          LevelCompleteScreen.field_F = pl.loadRgbSpriteByName("basic", "unachieved", (byte) 97, param1);
          DelayedPacket.field_p = pl.loadRgbSpriteByName("basic", "orbcoin", (byte) 122, param1);
          pl.loadRgbSpriteByName("basic", "locked", (byte) -45, param1);
          nj.field_z = new RgbSprite(32, 32);
          nj.field_z.bindRasterTarget();
          DelayedPacket.field_p.c(0, 0, 32, 32);
          kc.field_q.a((byte) 91);
          DelayedPacket.field_p = null;
          var19 = new RgbSprite(LevelCompleteScreen.field_F.canvasWidth / 4, LevelCompleteScreen.field_F.canvasHeight / 4);
          var19.bindRasterTarget();
          LevelCompleteScreen.field_F.e(0, 0);
          kc.field_q.a((byte) 113);
          bf.field_L = p.a(-12, var19, 8, 9838226);
          qh.field_c = p.a(-12, var19, 12, 9838226);
          var8 = null;
          e.field_l = new RgbSprite[IntrusiveHashTable.achievementSourceIcons.length];
          pa.field_h = new RgbSprite[IntrusiveHashTable.achievementSourceIcons.length];
          var20 = new RgbSprite(LevelCompleteScreen.field_F.canvasWidth / 4, LevelCompleteScreen.field_F.canvasHeight / 4);
          for (var10_int = 0; var10_int < IntrusiveHashTable.achievementSourceIcons.length; var10_int++) {
            var20.bindRasterTarget();
            Rasterizer2D.clear();
            IntrusiveHashTable.achievementSourceIcons[var10_int].drawQuarter(0, 0);
            kc.field_q.a((byte) 101);
            e.field_l[var10_int] = p.a(-12, var20, 8, 9838226);
            pa.field_h[var10_int] = p.a(pn.a(param3, -29147), var20, 12, 9838226);
          }
          CircleBody.field_t = new RgbSprite[lo.field_c.length][];
          var9 = null;
          for (var10_intLifetime1 = 0; lo.field_c.length > var10_intLifetime1; var10_intLifetime1++) {
            CircleBody.field_t[var10_intLifetime1] = cr.loadRgbSpritesByName("basic", param0, lo.field_c[var10_intLifetime1], 2);
          }
          MenuSelection.field_k = pl.loadRgbSpriteByName("basic", "ball", (byte) 121, param0);
          Ball.field_D = pl.loadRgbSpriteByName("basic", "steelball", (byte) 98, param0);
          h.field_C = PacketBuffer.a("basic", param0, "brickset", -946715356);
          dg.field_b = cr.loadRgbSpritesByName("basic", param0, "paddlecaps", param3 - 29135);
          GameConnectionShell.field_D = cr.loadRgbSpritesByName("basic", param0, "paddleseg", 2);
          dk.field_R = pl.loadRgbSpriteByName("basic", "paddlecentre", (byte) 100, param0);
          gg.field_p = cr.loadRgbSpritesByName("basic", param0, "powerup", 2);
          LevelPackSelectScreen.field_r = pl.loadRgbSpriteByName("basic", "powerupbar", (byte) 104, param0);
          ch.field_l = pl.loadRgbSpriteByName("basic", "heart", (byte) -108, param0);
          kb.field_Ub = cr.loadRgbSpritesByName("basic", param0, "characters_fm", 2);
          GzipInflater.field_a = cr.loadRgbSpritesByName("basic", param0, "lever_game", param3 - 29135);
          IntrusiveNode.field_f = cr.loadRgbSpritesByName("basic", param0, "eyes_game", 2);
          tf.field_g = cr.loadRgbSpritesByName("basic", param0, "track_heads", 2);
          ef.field_e = cr.loadRgbSpritesByName("basic", param0, "characters_small", 2);
          ScorePopup.field_k = cr.loadRgbSpritesByName("basic", param0, "character_heads", param3 ^ 29139);
          cn.field_e = cr.loadRgbSpritesByName("basic", param0, "lever_small", 2);
          ScorePopup.field_r = cr.loadRgbSpritesByName("basic", param0, "lever_small_choc", 2);
          lp.field_yb = cr.loadRgbSpritesByName("basic", param0, "lever_small_space", param3 ^ 29139);
          qi.field_K = kf.a("frame_bubble", "basic", param0, -105);
          ap.field_a = pl.loadRgbSpriteByName("basic", "frame_bubble_point", (byte) -120, param0);
          ln.field_j = bd.loadRgbSpritesByName("basic", "rosette_sml", param0, (byte) -8);
          IntHistoryBuffer.field_l = bd.loadRgbSpritesByName("basic", "rosette_lrg", param0, (byte) -8);
          me.field_a = PacketBuffer.a("basic", param0, "podium2", -946715356);
          pl.field_f = PacketBuffer.a("basic", param0, "podium3", param3 ^ -946719499);
          BrickMotionPath.field_r = cr.loadRgbSpritesByName("basic", param0, "podium_happy", 2);
          e.field_q = cr.loadRgbSpritesByName("basic", param0, "podium_sad", param3 ^ 29139);
          qh.field_e = um.a("basic", "congratulations", 1593955777, param0);
          pa.field_m = new RgbSprite[h.field_C.length];
          for (var10_intLifetime2 = 0; var10_intLifetime2 < pa.field_m.length; var10_intLifetime2++) {
            pa.field_m[var10_intLifetime2] = h.field_C[var10_intLifetime2].toRgbSprite();
          }
          pa.field_m[24].bindRasterTarget();
          Rasterizer2D.grayscaleRectangle(0, 0, Rasterizer2D.width, Rasterizer2D.height);
          ResourceArchive.field_a = new RgbSprite[pa.field_m.length];
          for (var10_intLifetime3 = 0; var10_intLifetime3 < pa.field_m.length; var10_intLifetime3++) {
            ResourceArchive.field_a[var10_intLifetime3] = new RgbSprite(pa.field_m[var10_intLifetime3].canvasWidth / 2, pa.field_m[var10_intLifetime3].canvasHeight / 2);
            ResourceArchive.field_a[var10_intLifetime3].bindRasterTarget();
            pa.field_m[var10_intLifetime3 % 29].a(0, 0);
          }
          kp.field_e = new RgbSprite[dg.field_b.length];
          for (var10_intLifetime4 = 0; dg.field_b.length > var10_intLifetime4; var10_intLifetime4++) {
            kp.field_e[var10_intLifetime4] = new RgbSprite(dg.field_b[var10_intLifetime4].canvasWidth / 2, dg.field_b[var10_intLifetime4].canvasHeight / 2);
            kp.field_e[var10_intLifetime4].bindRasterTarget();
            dg.field_b[var10_intLifetime4].a(0, 0);
          }
          LevelPackSelectScreen.field_z = new RgbSprite[GameConnectionShell.field_D.length];
          for (var10_intLifetime5 = 0; GameConnectionShell.field_D.length > var10_intLifetime5; var10_intLifetime5++) {
            LevelPackSelectScreen.field_z[var10_intLifetime5] = new RgbSprite(GameConnectionShell.field_D[var10_intLifetime5].canvasWidth / 2, GameConnectionShell.field_D[var10_intLifetime5].canvasHeight / 2);
            LevelPackSelectScreen.field_z[var10_intLifetime5].bindRasterTarget();
            GameConnectionShell.field_D[var10_intLifetime5].a(0, 0);
          }
          ep.field_j = new RgbSprite(dk.field_R.canvasWidth / 2, dk.field_R.canvasHeight / 2);
          ep.field_j.bindRasterTarget();
          dk.field_R.a(0, 0);
          p.field_i = new RgbSprite(MenuSelection.field_k.canvasWidth / 2, MenuSelection.field_k.canvasHeight / 2);
          p.field_i.bindRasterTarget();
          MenuSelection.field_k.a(0, 0);
          mh.field_ib = new RgbSprite(Ball.field_D.canvasWidth / 2, Ball.field_D.canvasHeight / 2);
          mh.field_ib.bindRasterTarget();
          Ball.field_D.a(0, 0);
          ch.field_k = new RgbSprite[gg.field_p.length];
          if (param3 != 29137) {
            so.a((byte) -25);
          }
          for (var10_intLifetime6 = 0; ch.field_k.length > var10_intLifetime6; var10_intLifetime6++) {
            ch.field_k[var10_intLifetime6] = new RgbSprite(gg.field_p[var10_intLifetime6].canvasWidth / 2, gg.field_p[var10_intLifetime6].canvasHeight / 2);
            ch.field_k[var10_intLifetime6].bindRasterTarget();
            gg.field_p[var10_intLifetime6].a(0, 0);
          }
          kc.field_q.a((byte) 79);
          for (var10_intLifetime7 = 0; var10_intLifetime7 < ln.field_j.length; var10_intLifetime7++) {
            ln.field_j[var10_intLifetime7].trimTransparentBorders();
          }
          for (var10_intLifetime8 = 0; IntHistoryBuffer.field_l.length > var10_intLifetime8; var10_intLifetime8++) {
            IntHistoryBuffer.field_l[var10_intLifetime8].trimTransparentBorders();
          }
          um.field_p = pl.loadRgbSpriteByName("basic", "character_menu", (byte) -62, param0);
          pa.field_j = pl.loadRgbSpriteByName("basic", "character_menu_eyes", (byte) -120, param0);
          gr.field_d = cr.loadRgbSpritesByName("basic", param0, "lever_menu", 2);
          nl.field_b = um.a("basic", "logo", 1593955777, param0);
          g.field_l = cr.loadRgbSpritesByName("basic", param0, "sliders", 2);
          mp.field_Vb = cr.loadRgbSpritesByName("basic", param0, "arrow_level", param3 ^ 29139);
          pa.field_l = new RgbSprite[mp.field_Vb.length];
          for (var10_intLifetime9 = 0; mp.field_Vb.length > var10_intLifetime9; var10_intLifetime9++) {
            dupTemp$0 = mp.field_Vb[var10_intLifetime9].copy();
            pa.field_l[var10_intLifetime9] = dupTemp$0;
            var11_ref_jp = dupTemp$0;
            var11_ref_jp.rotateCounterclockwise();
          }
          un.field_e = new IndexedSprite[7];
          un.field_e[0] = uo.loadIndexedSpriteByName((byte) 29, param0, "p1_key_right", "basic");
          un.field_e[1] = uo.loadIndexedSpriteByName((byte) 29, param0, "p1_key_left", "basic");
          un.field_e[2] = uo.loadIndexedSpriteByName((byte) 29, param0, "p1_key_launch", "basic");
          un.field_e[3] = uo.loadIndexedSpriteByName((byte) 29, param0, "p2_key_right", "basic");
          un.field_e[4] = uo.loadIndexedSpriteByName((byte) 29, param0, "p2_key_left", "basic");
          un.field_e[5] = uo.loadIndexedSpriteByName((byte) 29, param0, "p2_key_launch", "basic");
          un.field_e[6] = uo.loadIndexedSpriteByName((byte) 29, param0, "key_enter", "basic");
          nd.field_f = new int[58];
          for (var10_intLifetime10 = 0; nd.field_f.length > var10_intLifetime10; var10_intLifetime10++) {
            nd.field_f[var10_intLifetime10] = 14;
          }
          jk.field_u = lg.a(2, mo.field_N, -1);
          ClientException.field_b = lg.a(2, ci.field_s.toUpperCase(), -1);
          ed.field_b = new RgbSprite[3];
          for (var10_intLifetime11 = 0; var10_intLifetime11 < ed.field_b.length; var10_intLifetime11++) {
            ed.field_b[var10_intLifetime11] = OptionsScreen.a(2, 2, Integer.toString(-var10_intLifetime11 + 3), true);
          }
          BoundedFile.field_a = new RgbSprite[tf.field_g.length];
          for (var10_intLifetime12 = 0; BoundedFile.field_a.length > var10_intLifetime12; var10_intLifetime12++) {
            BoundedFile.field_a[var10_intLifetime12] = p.a(pn.a(param3, -29147), tf.field_g[var10_intLifetime12], 14, 16755200);
          }
          lk.field_n = new RgbSprite[tf.field_g.length];
          for (var10_intLifetime13 = 0; var10_intLifetime13 < lk.field_n.length; var10_intLifetime13++) {
            lk.field_n[var10_intLifetime13] = DelayedPacket.a(tf.field_g[var10_intLifetime13], 20, pn.a(param3, -13351));
          }
          rk.field_Sb = ap.field_a.copy();
          rk.field_Sb.rotateCounterclockwise();
          dg.field_e = pl.loadRgbSpriteByName("basic", "shutter", (byte) 110, param0);
          cq.field_o = new RgbSprite(dg.field_e.canvasWidth / 2, dg.field_e.canvasHeight / 2);
          cq.field_o.bindRasterTarget();
          dg.field_e.a(0, 0);
          kc.field_q.a((byte) 118);
          var10 = pl.loadRgbSpriteByName("basic", "flame", (byte) 107, param0);
          hc.field_a = new RgbSprite[2][4];
          ip.field_v = new RgbSprite[2][4];
          for (var11 = 0; var11 < 4; var11++) {
            ip.field_v[0][var11] = new RgbSprite(var10.canvasWidth - var11, var10.canvasHeight);
            ip.field_v[0][var11].bindRasterTarget();
            var10.a(0, 0, -var11 + var10.canvasWidth, var10.canvasHeight);
            ip.field_v[1][var11] = ip.field_v[0][var11].copyFlippedHorizontal();
            hc.field_a[0][var11] = new RgbSprite(ip.field_v[0][var11].canvasWidth / 2, ip.field_v[0][var11].canvasHeight / 2);
            hc.field_a[0][var11].bindRasterTarget();
            var10.a(0, 0, ip.field_v[0][var11].canvasWidth / 2, ip.field_v[0][var11].canvasHeight / 2);
            hc.field_a[1][var11] = hc.field_a[0][var11].copyFlippedHorizontal();
          }
          kc.field_q.a((byte) 127);
          SaveResultsPromptScreen.packCardIcons = bd.loadRgbSpritesByName("basic", "expansion_icons", param0, (byte) -8);
          ArchiveNetworkRequest.packSelectorIcons = new RgbSprite[SaveResultsPromptScreen.packCardIcons.length];
          for (var11Lifetime1 = 0; var11Lifetime1 < SaveResultsPromptScreen.packCardIcons.length; var11Lifetime1++) {
            ArchiveNetworkRequest.packSelectorIcons[var11Lifetime1] = new RgbSprite(SaveResultsPromptScreen.packCardIcons[var11Lifetime1].canvasWidth / 2, SaveResultsPromptScreen.packCardIcons[var11Lifetime1].canvasHeight / 2);
            IndexedSpriteGeometry.pushSpriteRaster(-59, ArchiveNetworkRequest.packSelectorIcons[var11Lifetime1]);
            SaveResultsPromptScreen.packCardIcons[var11Lifetime1].a(0, 0);
            sc.popRaster(-89);
          }
          cm.field_r = new RgbSprite[SaveResultsPromptScreen.packCardIcons.length];
          for (var11Lifetime2 = 0; SaveResultsPromptScreen.packCardIcons.length > var11Lifetime2; var11Lifetime2++) {
            cm.field_r[var11Lifetime2] = DelayedPacket.a(ArchiveNetworkRequest.packSelectorIcons[var11Lifetime2], 20, -17912);
          }
          ik.field_f = new RgbSprite[SaveResultsPromptScreen.packCardIcons.length];
          for (var11Lifetime3 = 0; var11Lifetime3 < SaveResultsPromptScreen.packCardIcons.length; var11Lifetime3++) {
            ik.field_f[var11Lifetime3] = p.a(pn.a(param3, -29147), ArchiveNetworkRequest.packSelectorIcons[var11Lifetime3], 14, 16777215);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_67_0 = var5_ref;
          stackIn_67_1 = new StringBuilder().append("so.D(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    so(int param0, ResourceArchive param1, ResourceArchive param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_a = new to(64);
        try {
          this.field_c = param2;
          this.field_g = param1;
          if (this.field_g != null) {
            this.field_g.getFileCapacity(-123, 0);
          }
          if (this.field_c != null) {
            this.field_c.getFileCapacity(-113, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("so.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_e = "Rating";
        field_f = null;
    }
}

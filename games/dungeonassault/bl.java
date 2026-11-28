/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bl {
    String field_f;
    String field_g;
    int field_m;
    static int[] field_n;
    static boolean field_k;
    static RgbSprite field_j;
    static Random field_i;
    ResourceArchive field_q;
    String field_h;
    static String field_b;
    static RgbSprite[] field_d;
    static RgbSprite field_s;
    static int field_p;
    static RgbSprite field_o;
    static rj field_l;
    static RgbSprite field_e;
    static int field_c;
    static je field_r;
    static String field_a;
    static ResourceArchive field_t;

    public static void clearStaticReferences(byte param0) {
        field_o = null;
        field_b = null;
        field_s = null;
        field_n = null;
        field_i = null;
        field_e = null;
        field_r = null;
        field_a = null;
        field_t = null;
        field_j = null;
        if (param0 >= -127) {
          field_a = (String) null;
        }
        field_d = null;
        field_l = null;
    }

    final static void c(byte param0) {
        RgbSprite var19 = null;
        RgbSprite var2 = null;
        RgbSprite var3 = null;
        RgbSprite var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        RgbSprite var7 = null;
        int var8_int = 0;
        RgbSprite var8 = null;
        int var9_int = 0;
        RgbSprite var9 = null;
        RgbSprite var10 = null;
        int var11_int = 0;
        RgbSprite[] var11 = null;
        RgbSprite[] var20 = null;
        RgbSprite var14_ref_cn = null;
        RgbSprite var21 = null;
        RgbSprite var15_ref_cn = null;
        byte[] var14_ref_byte__ = null;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int[] var13 = null;
        RgbSprite discarded$1 = null;
        int var1_int = 0;
        int var10_int = 0;
        int var13_int = 0;
        RgbSprite var22 = null;
        int var15 = 0;
        int var14 = 0;
        int var18 = DungeonAssault.field_K;
        RgbSprite var22Lifetime1;
        RgbSprite var22Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var10_intLifetime1;
        int var13_intLifetime1;
        int var13_intLifetime2;
        int var13_intLifetime3;
        int var15Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        try {
          kk.field_l = ah.a(np.field_A, 200, "smallfont", "", hj.field_Z);
          db.field_v = ah.a(np.field_A, 200, "roman12bold", "", hj.field_Z);
          df.field_c = rc.a("", sb.field_a, "main_center", (byte) 71);
          dm.field_d = new RgbSprite[3];
          IterableNodeHashTable.field_f = new RgbSprite[3];
          for (var1_int = 0; var1_int < 3; var1_int++) {
            dm.field_d[var1_int] = rc.a("", sb.field_a, "main_left_0" + (var1_int + 1), (byte) 71);
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 3; var1_intLifetime1++) {
            IterableNodeHashTable.field_f[var1_intLifetime1] = rc.a("", sb.field_a, "main_right_0" + (var1_intLifetime1 + 1), (byte) 71);
          }
          tm.field_p = oh.a(hj.field_Z, "", 11091, "menu_block");
          of.field_j = oh.a(hj.field_Z, "", 11091, "menu_button");
          le.field_f = oh.a(hj.field_Z, "", 11091, "menu_moss_top_left");
          e.field_j = oh.a(hj.field_Z, "", 11091, "menu_moss_top_right");
          CipherPacketBuffer.field_w = oh.a(hj.field_Z, "", 11091, "menu_moss_1");
          oj.field_a = oh.a(hj.field_Z, "", 11091, "menu_moss_2");
          oh.a(hj.field_Z, "", 11091, "menu_moss_bottom");
          am.field_a = oh.a(hj.field_Z, "", 11091, "menu_chain_frame");
          lf.field_x = oh.a(hj.field_Z, "", 11091, "menu_chain_ext");
          lf.field_n = oh.a(hj.field_Z, "", 11091, "menu_chain_line");
          hf.field_Ab = oh.a(hj.field_Z, "", 11091, "menu_chain");
          AccountNameAvailabilityValidator.field_m = kn.a(hj.field_Z, "", "cursor", -49);
          jg.field_c = new RgbSprite[AccountNameAvailabilityValidator.field_m.length];
          for (var1_intLifetime2 = 0; AccountNameAvailabilityValidator.field_m.length > var1_intLifetime2; var1_intLifetime2++) {
            jg.field_c[var1_intLifetime2] = rb.a(8, AccountNameAvailabilityValidator.field_m[var1_intLifetime2], 16711680, (byte) 124);
          }
          bf.field_d = oh.a(hj.field_Z, "", 11091, "smoke");
          bo.field_Kb = oh.a(hj.field_Z, "", 11091, "scrollbar_top");
          IntroSequenceScreen.field_y = oh.a(hj.field_Z, "", 11091, "scrollbar_bottom");
          qh.field_q = oh.a(hj.field_Z, "", 11091, "scrollbar_slider");
          tn.field_W = bo.field_Kb.copy();
          tn.field_W.rotateCounterclockwise();
          Bzip2State.field_x = IntroSequenceScreen.field_y.copy();
          Bzip2State.field_x.rotateCounterclockwise();
          ml.field_a = qh.field_q.copy();
          ml.field_a.rotateCounterclockwise();
          AchievementIconEntry.field_q = dd.a((byte) -112, 4, bo.field_Kb);
          qf.field_f = dd.a((byte) -112, 4, IntroSequenceScreen.field_y);
          ji.field_G = dd.a((byte) -112, 4, qh.field_q);
          field_o = dd.a((byte) -112, 4, tn.field_W);
          DungeonRaidScreen.field_S = dd.a((byte) -112, 4, Bzip2State.field_x);
          im.field_m = dd.a((byte) -112, 4, ml.field_a);
          var19 = oh.a(hj.field_Z, "", 11091, "cracked_bar");
          var2 = var19.copy();
          var2.rotateClockwise();
          var3 = oh.a(hj.field_Z, "", 11091, "cracked_bar_endcap");
          var4 = var3.copy();
          var4.rotateClockwise();
          ad.field_e = ph.a(hj.field_Z, "", "interface_crescent");
          oe.field_m = ph.a(hj.field_Z, "", "interface_dragon");
          pi.field_b = oh.a(hj.field_Z, "", 11091, "interface_lattice");
          jm.field_i = oh.a(hj.field_Z, "", 11091, "button_152");
          oh.a(hj.field_Z, "", 11091, "button_252");
          gh.field_g = kn.a(hj.field_Z, "", "strategy_buttons", -98);
          jh.c();
          var5 = var19.field_y;
          var6 = var19.field_v;
          for (var7_int = 0; var5 * var6 > var7_int; var7_int++) {
            var19.field_B[var7_int] = mp.a(var19.field_B[var7_int], -2147483648);
          }
          var7 = new RgbSprite(var5, var6);
          var7.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(0, 0, var5, 2, 16416);
          SoftwareRasterizer.fillRectangle(0, 2, var5, var6 - 4, 96);
          SoftwareRasterizer.fillRectangle(0, var6 - 2, var5, 2, 49184);
          PcmOutputWorker.field_e = new ph(var19, var7);
          var5Lifetime1 = var2.field_y;
          var6Lifetime1 = var2.field_v;
          for (var8_int = 0; var8_int < var5Lifetime1 * var6Lifetime1; var8_int++) {
            var2.field_B[var8_int] = mp.a(var2.field_B[var8_int], -2147483648);
          }
          var8 = new RgbSprite(var5Lifetime1, var6Lifetime1);
          var8.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(0, 0, 2, var6Lifetime1, 4194336);
          SoftwareRasterizer.fillRectangle(2, 0, var5Lifetime1 - 4, var6Lifetime1, 96);
          SoftwareRasterizer.fillRectangle(-2 + var5Lifetime1, 0, 2, var6Lifetime1, 12582944);
          MatchingFieldValidator.field_o = new ph(var2, var8);
          var6Lifetime2 = var3.field_v;
          var5Lifetime2 = var3.field_y;
          for (var9_int = 0; var6Lifetime2 * var5Lifetime2 > var9_int; var9_int++) {
            var3.field_B[var9_int] = mp.a(var3.field_B[var9_int], -2147483648);
          }
          var9 = new RgbSprite(var5Lifetime2, var6Lifetime2);
          var9.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(0, 0, var5Lifetime2, 2, 16416);
          SoftwareRasterizer.fillRectangle(0, 2, var5Lifetime2, -4 + var6Lifetime2, 96);
          SoftwareRasterizer.fillRectangle(0, var6Lifetime2 - 2, var5Lifetime2, 2, 49184);
          for (var10_int = 0; var10_int < var5Lifetime2 * var6Lifetime2; var10_int++) {
            if (var3.field_B[var10_int] == -2147483648) {
              var3.field_B[var10_int] = 0;
              var9.field_B[var10_int] = 0;
            }
          }
          wh.field_g = new ph(var3, var9);
          var6Lifetime3 = var4.field_v;
          var5Lifetime3 = var4.field_y;
          for (var10_intLifetime1 = 0; var10_intLifetime1 < var6Lifetime3 * var5Lifetime3; var10_intLifetime1++) {
            var4.field_B[var10_intLifetime1] = mp.a(var4.field_B[var10_intLifetime1], -2147483648);
          }
          var10 = new RgbSprite(var5Lifetime3, var6Lifetime3);
          var10.bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(0, 0, 2, var6Lifetime3, 4194336);
          SoftwareRasterizer.fillRectangle(2, 0, var5Lifetime3 - 4, var6Lifetime3, 96);
          SoftwareRasterizer.fillRectangle(var5Lifetime3 - 2, 0, 2, var6Lifetime3, 12582944);
          for (var11_int = 0; var11_int < var6Lifetime3 * var5Lifetime3; var11_int++) {
            if (-2147483648 == var4.field_B[var11_int]) {
              var4.field_B[var11_int] = 0;
              var10.field_B[var11_int] = 0;
            }
          }
          ac.field_w = new ph(var4, var10);
          PacketBuffer.field_j = qa.a(15322, "achievements_large", "", hj.field_Z);
          IntrusiveDeque.a(97, f.field_a);
          IntrusiveDeque.a(98, PlayerDungeonProfile.field_o);
          cf.field_f = new RgbSprite(32, 32);
          cf.field_f.bindAsRenderTarget();
          PlayerDungeonProfile.field_o.drawDownscaledAreaAveraged(0, 0, 32, 32);
          jh.b();
          PlayerDungeonProfile.field_o = null;
          nb.field_d = oh.a(hj.field_Z, "", 11091, "base");
          var11 = kn.a(hj.field_Z, "", "room_icons", -66);
          HuffmanDecoder.field_b = kn.a(hj.field_Z, "", "room_icons_2d", -105);
          field_d = kn.a(hj.field_Z, "", "wall_icons_2d", -84);
          ri.field_d = kn.a(hj.field_Z, "", "walls", -127);
          mc.field_w = kn.a(hj.field_Z, "", "room_floors", -78);
          var20 = mc.field_w;
          for (var13_int = 0; var13_int < var20.length; var13_int++) {
            var14_ref_cn = var20[var13_int];
            var22 = var14_ref_cn;
            var22Lifetime2 = var14_ref_cn;
            var14_ref_cn.field_A = 18;
          }
          i.field_r = wk.a(var11, 0);
          var21 = oh.a(hj.field_Z, "", 11091, "room_monster");
          for (var13_intLifetime1 = 0; var13_intLifetime1 < 38; var13_intLifetime1++) {
            if (null != gh.field_i[var13_intLifetime1] &&
              gh.field_i[var13_intLifetime1].field_g == 2) {
              i.field_r[var13_intLifetime1] = var21;
            }
          }
          i.field_r[0] = mc.field_w[0];
          i.field_r[2] = oh.a(hj.field_Z, "", 11091, "room_gold");
          i.field_r[4] = oh.a(hj.field_Z, "", 11091, "room_pit");
          i.field_r[5] = oh.a(hj.field_Z, "", 11091, "room_snakes");
          i.field_r[6] = oh.a(hj.field_Z, "", 11091, "room_nails");
          i.field_r[7] = oh.a(hj.field_Z, "", 11091, "room_hiddenpit");
          i.field_r[8] = oh.a(hj.field_Z, "", 11091, "room_teleport");
          i.field_r[9] = oh.a(hj.field_Z, "", 11091, "room_hiddennails");
          i.field_r[10] = oh.a(hj.field_Z, "", 11091, "room_pit");
          i.field_r[11] = oh.a(hj.field_Z, "", 11091, "room_crusher");
          i.field_r[12] = oh.a(hj.field_Z, "", 11091, "room_crossbow");
          i.field_r[14] = oh.a(hj.field_Z, "", 11091, "room_gas");
          i.field_r[36] = oh.a(hj.field_Z, "", 11091, "room_hallofglass");
          sn.field_c = kn.a(hj.field_Z, "", "torches", -86);
          AccountRegistrationPanel.i(112);
          mf.field_b = kn.a(hj.field_Z, "", "doormasks", -49);
          jh.c();
          ua.field_b = new ph[6];
          for (var13_intLifetime2 = 0; var13_intLifetime2 < 6; var13_intLifetime2++) {
            var22Lifetime1 = ri.field_d[var13_intLifetime2];
            for (var15 = 0; var22Lifetime1.field_B.length > var15; var15++) {
              if (var22Lifetime1.field_B[var15] != 0) {
                var22Lifetime1.field_B[var15] = mp.a(var22Lifetime1.field_B[var15], -2147483648);
              }
            }
            var15_ref_cn = new RgbSprite(var22Lifetime1.field_y, var22Lifetime1.field_v);
            var15_ref_cn.bindAsRenderTarget();
            var22Lifetime1.drawSilhouette(0, 0, (1 & var13_intLifetime2) == 0 ? 3199008 : 13684768);
            ua.field_b[var13_intLifetime2] = new ph(var22Lifetime1, var15_ref_cn);
          }
          jh.b();
          jc.field_c = oh.a(hj.field_Z, "pieces", 11091, "piece_baeserker");
          if (param0 > -21) {
            bl.a(false, -71, -26);
          }
          f.field_f = oh.a(hj.field_Z, "pieces", 11091, "piece_banshee");
          EmailFormatValidator.field_m = oh.a(hj.field_Z, "pieces", 11091, "piece_bat");
          ia.field_R = oh.a(hj.field_Z, "pieces", 11091, "piece_beastman");
          ld.field_d = oh.a(hj.field_Z, "pieces", 11091, "piece_blackknight");
          InteractiveWidget.field_G = oh.a(hj.field_Z, "pieces", 11091, "piece_blade_construct");
          DualLinkNode.field_q = oh.a(hj.field_Z, "pieces", 11091, "piece_darkelf");
          PlayerDungeonProfile.field_v = oh.a(hj.field_Z, "pieces", 11091, "piece_demon");
          fp.field_b = oh.a(hj.field_Z, "pieces", 11091, "piece_dryhad");
          bj.field_F = oh.a(hj.field_Z, "pieces", 11091, "piece_dwarf");
          ie.field_i = oh.a(hj.field_Z, "pieces", 11091, "piece_enchantress");
          hl.field_h = oh.a(hj.field_Z, "pieces", 11091, "piece_goblin_cleaver");
          tn.field_I = oh.a(hj.field_Z, "pieces", 11091, "piece_goblin_club");
          jl.field_c = oh.a(hj.field_Z, "pieces", 11091, "piece_goblin_scout");
          bn.field_h = oh.a(hj.field_Z, "pieces", 11091, "piece_hellbeast");
          fl.field_j = oh.a(hj.field_Z, "pieces", 11091, "piece_imp");
          ub.field_j = oh.a(hj.field_Z, "pieces", 11091, "piece_merc");
          fn.field_o = oh.a(hj.field_Z, "pieces", 11091, "piece_minotaur");
          g.field_Ib = oh.a(hj.field_Z, "pieces", 11091, "piece_necromancer");
          df.field_e = oh.a(hj.field_Z, "pieces", 11091, "piece_northman");
          ef.field_e = oh.a(hj.field_Z, "pieces", 11091, "piece_ogre");
          ImageProducerRasterBuffer.field_k = oh.a(hj.field_Z, "pieces", 11091, "piece_ork_blademaster");
          lj.field_o = oh.a(hj.field_Z, "pieces", 11091, "piece_ork_mace");
          le.field_d = oh.a(hj.field_Z, "pieces", 11091, "piece_ork_shaman");
          oo.field_c = oh.a(hj.field_Z, "pieces", 11091, "piece_pitdemon");
          cg.field_b = oh.a(hj.field_Z, "pieces", 11091, "piece_priest");
          lm.field_z = oh.a(hj.field_Z, "pieces", 11091, "piece_rat");
          ii.field_H = oh.a(hj.field_Z, "pieces", 11091, "piece_rotworm");
          sp.field_a = oh.a(hj.field_Z, "pieces", 11091, "piece_saurus_imp");
          qd.field_d = oh.a(hj.field_Z, "pieces", 11091, "piece_saurus_spawn");
          na.field_A = oh.a(hj.field_Z, "pieces", 11091, "piece_saurus_warrior");
          dk.field_b = oh.a(hj.field_Z, "pieces", 11091, "piece_skeleton");
          n.field_b = oh.a(hj.field_Z, "pieces", 11091, "piece_snake");
          hh.field_o = oh.a(hj.field_Z, "pieces", 11091, "piece_spectre");
          jf.field_f = oh.a(hj.field_Z, "pieces", 11091, "piece_spider");
          DungeonAssault.field_I = oh.a(hj.field_Z, "pieces", 11091, "piece_spy");
          DebouncedFieldValidator.field_c = oh.a(hj.field_Z, "pieces", 11091, "piece_thief");
          sp.field_d = oh.a(hj.field_Z, "pieces", 11091, "piece_troglodyte");
          gd.field_A = oh.a(hj.field_Z, "pieces", 11091, "piece_troll");
          RaiderDefinition.field_E = oh.a(hj.field_Z, "pieces", 11091, "piece_vampire");
          NetworkGameClient.field_D = oh.a(hj.field_Z, "pieces", 11091, "piece_witch");
          up.field_b = oh.a(hj.field_Z, "pieces", 11091, "piece_zealot");
          gd.field_E = oh.a(hj.field_Z, "", 11091, "stat_attack");
          jj.field_b = oh.a(hj.field_Z, "", 11091, "stat_defence");
          ProxyAuthenticationRequiredException.field_d = oh.a(hj.field_Z, "", 11091, "stat_dodge");
          pk.field_o = oh.a(hj.field_Z, "", 11091, "stat_sneak");
          tb.field_c = oh.a(hj.field_Z, "", 11091, "stat_snare");
          kd.field_f = oh.a(hj.field_Z, "", 11091, "stat_detect");
          uj.field_c = oh.a(hj.field_Z, "", 11091, "stat_renown");
          ue.field_i = kn.a(hj.field_Z, "", "modifier_icons", -80);
          oh.a(hj.field_Z, "", 11091, "dead_icon");
          rj.field_k = oh.a(hj.field_Z, "", 11091, "youarehere");
          fj.field_d = kn.a(hj.field_Z, "", "spy_icon", -70);
          bf.field_e = kn.a(hj.field_Z, "", "sac_icon", -44);
          AccountNameAvailabilityValidator.field_r = oh.a(hj.field_Z, "", 11091, "revive_icon");
          hj.field_T = oh.a(hj.field_Z, "", 11091, "menu_locked");
          n.field_e = pa.a((byte) -103, hj.field_Z, "", "ingot");
          tb.field_a = n.field_e.d();
          fb.field_f = n.field_e.c();
          for (var13_intLifetime3 = 0; var13_intLifetime3 < 2; var13_intLifetime3++) {
            if ((1 & fb.field_f.field_g) != 0) {
              fb.field_f.field_g = fb.field_f.field_g + 1;
            }
            if ((fb.field_f.field_d & 1) != 0) {
              fb.field_f.field_d = fb.field_f.field_d + 1;
            }
            fb.field_f.field_g = fb.field_f.field_g / 2;
            fb.field_f.field_d = fb.field_f.field_d / 2;
            var14_ref_byte__ = new byte[fb.field_f.field_d * fb.field_f.field_g];
            var15Lifetime1 = 0;
            for (var16 = 0; var16 < fb.field_f.field_e; var16++) {
              for (var17 = 0; fb.field_f.field_h > var17; var17++) {
                incrementValue$0 = var15Lifetime1;
                var15Lifetime1++;
                var14_ref_byte__[(fb.field_f.field_b + var17 >> 1) + (var16 + fb.field_f.field_a >> 1) * fb.field_f.field_d] = fb.field_f.field_j[incrementValue$0];
              }
            }
            fb.field_f.field_j = var14_ref_byte__;
            fb.field_f.field_e = fb.field_f.field_g;
            fb.field_f.field_h = fb.field_f.field_d;
            fb.field_f.field_a = 0;
            fb.field_f.field_b = 0;
          }
          la.field_b.setInlineSprites(new q[]{fb.field_f, rf.a(10)}, new int[]{9, 10});
          fl.field_i = fn.a(2);
          PackedBitSet.field_h = fl.field_i.copyMirroredHorizontally();
          SecondaryNodeDeque.field_a = rj.a((byte) 127);
          sm.field_g = BoundedRandomAccessFile.a(true);
          fo.field_a = wo.a(5, 1, 6, 5, 16744448);
          BoundedRandomAccessFile.field_a = fo.field_a.copy();
          BoundedRandomAccessFile.field_a.rotateClockwise();
          i.field_v = BoundedRandomAccessFile.field_a.copy();
          i.field_v.rotateClockwise();
          IterableNodeHashTable.field_i = i.field_v.copy();
          IterableNodeHashTable.field_i.rotateClockwise();
          DungeonAssaultScreen.setStatBarIcons(gd.field_E, jj.field_b, ProxyAuthenticationRequiredException.field_d, pk.field_o, tb.field_c, kd.field_f);
          ao.field_n = oh.a(hj.field_Z, "", 11091, "scroll_top");
          rn.field_c = oh.a(hj.field_Z, "", 11091, "scroll_bottom");
          field_s = oh.a(hj.field_Z, "", 11091, "scroll_tile");
          li.field_l = new RgbSprite[9];
          li.field_l[0] = oh.a(hj.field_Z, "", 11091, "scroll_top_left");
          li.field_l[1] = oh.a(hj.field_Z, "", 11091, "scroll_top_centre");
          li.field_l[2] = oh.a(hj.field_Z, "", 11091, "scroll_top_right");
          li.field_l[3] = oh.a(hj.field_Z, "", 11091, "scroll_centre_left");
          li.field_l[4] = new RgbSprite(li.field_l[0].field_y, li.field_l[0].field_v);
          li.field_l[4].bindAsRenderTarget();
          SoftwareRasterizer.fillRectangle(0, 0, SoftwareRasterizer.field_i, SoftwareRasterizer.field_c, 13619075);
          k.field_h.setAsRasterTarget(true);
          li.field_l[5] = oh.a(hj.field_Z, "", 11091, "scroll_centre_right");
          li.field_l[6] = oh.a(hj.field_Z, "", 11091, "scroll_bottom_left");
          li.field_l[7] = oh.a(hj.field_Z, "", 11091, "scroll_bottom_centre");
          li.field_l[8] = oh.a(hj.field_Z, "", 11091, "scroll_bottom_right");
          GameAppletShell.field_a = oh.a(hj.field_Z, "", 11091, "small_button");
          jn.field_n = new lg(327680, 1310720, 327680, 327680, 65536, 32768, 49152, 24576, 0, -4096, 100, 50);
          var13 = new int[256];
          for (var14 = 0; var14 < 64; var14++) {
            var13[var14] = 262144 * var14;
          }
          for (var14Lifetime1 = 64; var14Lifetime1 < 192; var14Lifetime1++) {
            var13[var14Lifetime1] = -32768 + 512 * var14Lifetime1 + 16711680;
          }
          for (var14Lifetime2 = 192; var14Lifetime2 < 256; var14Lifetime2++) {
            var13[var14Lifetime2] = 16776960 + (-192 + var14Lifetime2) * 4;
          }
          jn.field_n.field_v.field_i = var13;
          fp.field_d = new tf(IntrusiveNode.field_c, tp.field_u, cm.field_M);
          na.field_w = new tf(IntrusiveNode.field_c, bn.field_q, cm.field_M);
          cg.field_a = new tf(IntrusiveNode.field_c, vd.field_c, cm.field_M);
          RaiderRecruitmentScreen.field_x = new tf(IntrusiveNode.field_c, AwtRasterBuffer.field_e.toUpperCase(), cm.field_M);
          bf.field_m = new tf(IntrusiveNode.field_c, DisplayNameSelectionPanel.field_K, cm.field_M);
          kd.field_e = new tf[ie.field_j.length];
          for (var14Lifetime3 = 0; var14Lifetime3 < ie.field_j.length; var14Lifetime3++) {
            kd.field_e[var14Lifetime3] = new tf(db.field_v, ie.field_j[var14Lifetime3], cm.field_M);
          }
          discarded$1 = new RgbSprite(SoftwareRasterizer.field_i, SoftwareRasterizer.field_c);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "bl.D(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        int var1;
        int var2;
        var2 = DungeonAssault.field_K;
        cd.field_b = false;
        ub.field_o = null;
        if (param0 != -97) {
          field_p = -78;
        }
        if (!MenuScreen.field_t) {
          var1 = hf.field_sb;
          if (0 < var1) {
            if (var1 != 1) {
              ub.field_o = jk.a(new String[]{Integer.toString(var1)}, AchievementIconEntry.field_j, 30496);
            } else {
              ub.field_o = fb.field_g;
            }
            ub.field_o = nf.a(new CharSequence[]{(CharSequence) ((Object) ub.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) qa.field_b)}, (byte) 34);
          }
          a.field_n.j((byte) 79);
          hl.a(true);
        } else {
          a.field_n.o(4210752);
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        pp stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        pp stackIn_25_0 = null;
        boolean stackIn_26_1 = false;
        pp stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        int var1;
        int var2;
        if (hh.field_s == SecondaryNodeDequeIterator.field_l) {
          SecondaryNodeDequeIterator.field_l = null;
        }
        if (0 <= ce.field_p) {
          fieldTemp$0 = ce.field_p + 1;
          ce.field_p = ce.field_p + 1;
          if (fieldTemp$0 >= 50) {
            jn.field_l = DisplayNameSelectionPanel.field_L;
            ce.field_p = -1;
            ui.field_a = hc.field_b;
          }
        }
        wi.field_kb = fa.a((byte) -127, ui.field_a, hc.field_b);
        if (DisplayNameSelectionPanel.field_L == null) {
          stackIn_8_0 = 620;
        } else {
          stackIn_8_0 = hh.field_p - 100;
        }
        ArchiveRequest.field_w = stackIn_8_0;
        if (null != DisplayNameSelectionPanel.field_L) {
          stackIn_11_0 = ed.field_P - (wi.field_kb >> 1);
        } else {
          stackIn_11_0 = 480 - wi.field_kb >> 1;
        }
        MenuScreen.field_w = stackIn_11_0;
        if (-1 != ce.field_p) {
          if (jn.field_l == null) {
            stackIn_16_0 = 620;
          } else {
            stackIn_16_0 = -100 + hh.field_p;
          }
          var1 = stackIn_16_0;
          if (jn.field_l != null) {
            stackIn_19_0 = -(wi.field_kb >> 1) + ed.field_P;
          } else {
            stackIn_19_0 = 480 - wi.field_kb >> 1;
          }
          var2 = stackIn_19_0;
          ArchiveRequest.field_w = fa.a((byte) -127, var1, ArchiveRequest.field_w);
          MenuScreen.field_w = fa.a((byte) -128, var2, MenuScreen.field_w);
        }
        ti.field_A.b(204 + ArchiveRequest.field_w, MenuScreen.field_w - 28, (byte) 4);
        tk.field_k.b(ArchiveRequest.field_w - 7, 20 + MenuScreen.field_w + wi.field_kb, (byte) 4);
        PacketBuffer.field_n.b(7 + (ArchiveRequest.field_w + 200), MenuScreen.field_w + (wi.field_kb + 22), (byte) 4);
        stackIn_22_0 = ti.field_A;
        stackIn_23_1 = (null == DisplayNameSelectionPanel.field_L) ? false : true;
        stackIn_22_0.field_w = stackIn_23_1;
        stackIn_25_0 = tk.field_k;
        stackIn_26_1 = (param0 >= fc.field_d) ? false : true;
        stackIn_25_0.field_w = stackIn_26_1;
        stackIn_28_0 = PacketBuffer.field_n;
        stackIn_29_1 = (fc.field_d >= uo.field_f.length - 1) ? false : true;
        stackIn_28_0.field_w = stackIn_29_1;
    }

    final static void a(byte param0) {
        ac[] stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        ac[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var4 = 0;
        ac[] var5 = null;
        int var6 = 0;
        RaiderDefinition[] var7 = null;
        RaiderDefinition var8 = null;
        ac var9 = null;
        int var2Lifetime1;
        var4 = DungeonAssault.field_K;
        try {
          var7 = hp.field_b;
          for (var2 = 0; var7.length > var2; var2++) {
            var8 = var7[var2];
            if (var8 != null) {
              if (var8.field_e != null) {
                var8.field_e.a((byte) -19);
              }
              if (var8.field_u != null) {
                var8.field_u.a((byte) -19);
              }
              if (null != var8.field_t) {
                var8.field_t.a((byte) -19);
              }
              if (null != var8.field_v) {
                var8.field_v.a((byte) -19);
              }
              if (null != var8.field_l) {
                var8.field_l.a((byte) -19);
              }
            }
          }
          var5 = gh.field_i;
          var1 = var5;
          var6 = 0;
          var2Lifetime1 = var6;
          if (param0 <= 1) {
            return;
          }
          stackIn_23_0 = var1;
          while (stackIn_23_0.length > var6) {
            var9 = var5[var6];
            if (var9 != null) {
              if (var9.field_d != null) {
                var9.field_d.a((byte) -19);
              }
              if (var9.field_u != null) {
                var9.field_u.a((byte) -19);
              }
              if (var9.field_m != null) {
                var9.field_m.a((byte) -19);
              }
            }
            var6++;
            stackIn_23_0 = var5;
          }
          System.gc();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var1_ref), "bl.E(" + param0 + ')');
        }
    }

    final static RgbSprite a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        RgbSprite var6 = new RgbSprite(param2, param2);
        RgbSprite var3 = var6;
        for (var4 = 0; var3.field_B.length > var4; var4++) {
          var6.field_B[var4] = param1;
        }
        if (param0) {
          return (RgbSprite) null;
        }
        return var3;
    }

    final static DungeonTileState a(boolean param0, PacketBuffer param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        DungeonTileState var4 = null;
        PacketBuffer var5 = null;
        DungeonTileState stackIn_5_0 = null;
        PacketBuffer stackIn_5_1 = null;
        boolean stackIn_6_2 = false;
        DungeonTileState stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            var5 = (PacketBuffer) null;
            bl.a(false, (PacketBuffer) null, true);
          }
          var3_int = param1.readUnsignedByte(true);
          var4 = new DungeonTileState(var3_int);
          var4.field_p = param1.readUnsignedByte(true);
          var4.field_g = param1.readUnsignedByte(true);
          var4.field_r = param1.readUnsignedByte(true);
          var4.field_q = param1.readUnsignedByte(true);
          if (!param0) {
            var4.field_j = param1.readUnsignedByte(true);
            var4.field_l = param1.readUnsignedByte(true);
            stackIn_5_0 = var4;
            stackIn_5_1 = (PacketBuffer) (param1);
            stackIn_6_2 = !(param2);
            stackIn_5_0.field_s = ((PacketBuffer) (Object) stackIn_5_1).readUnsignedByte(stackIn_6_2);
            var4.field_o = param1.readUnsignedByte(true);
          }
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("bl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_n = new int[]{6, 11, 12, 13, 7};
        field_i = new Random();
        field_b = "<col=FF0000>Free players are limited to a maximum of 5 Orbs of this type.<%0></col>";
        field_c = 0;
        field_a = "Next";
    }
}

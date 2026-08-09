/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends gp {
    private byte[][] field_u;
    private int field_v;
    ul[] field_t;

    final boolean a(byte param0) {
        int var2;
        int var3_int;
        nj var3;
        int var4;
        int var6;
        ed var8;
        int var9;
        Object var10;
        mb var11;
        int var12;
        r var13;
        int var14;
        ed var17;
        int[] var28;
        byte[] var29;
        int[] var30;
        byte[] var31;
        var12 = Vertigo2.field_L ? 1 : 0;
        if (this.field_t != null) {
          return true;
        } else {
          L0: {
            if (null != this.field_u) {
              break L0;
            } else {
              if (!oc.field_r.c(11321, this.field_v)) {
                return false;
              } else {
                var28 = oc.field_r.a(0, this.field_v);
                this.field_u = new byte[var28.length][];
                var3_int = 0;
                L1: while (true) {
                  if (var28.length <= var3_int) {
                    break L0;
                  } else {
                    this.field_u[var3_int] = oc.field_r.a(this.field_v, var28[var3_int], (byte) -107);
                    var3_int++;
                    continue L1;
                  }
                }
              }
            }
          }
          var2 = 1;
          var14 = 0;
          var3_int = var14;
          L2: while (true) {
            if (this.field_u.length <= var14) {
              L3: {
                if (param0 >= 68) {
                  break L3;
                } else {
                  var13 = (r) null;
                  ei.a((r) null, (byte) -11);
                  break L3;
                }
              }
              if (var2 != 0) {
                var3 = new nj();
                var4 = oc.field_r.b(this.field_v, (byte) -47);
                this.field_t = new ul[var4];
                var30 = oc.field_r.a(0, this.field_v);
                var6 = 0;
                L4: while (true) {
                  if (var30.length <= var6) {
                    this.field_u = (byte[][]) null;
                    return true;
                  } else {
                    var31 = this.field_u[var6];
                    var8 = new ed(var31);
                    var8.field_u = 1;
                    var9 = var8.a((byte) -11);
                    var10 = null;
                    var11 = (mb) ((Object) var3.a((byte) 100));
                    L5: while (true) {
                      L6: {
                        if (var11 == null) {
                          break L6;
                        } else {
                          if (var11.field_x == var9) {
                            var10 = var11;
                            break L6;
                          } else {
                            var11 = (mb) ((Object) var3.b(68));
                            continue L5;
                          }
                        }
                      }
                      L7: {
                        if (var10 == null) {
                          var10 = new mb(var9, hd.field_b.a(true, var9));
                          var3.a((li) (var10), false);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      this.field_t[var30[var6]] = new ul(var31, (mb) (var10));
                      var6++;
                      continue L4;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              var29 = this.field_u[var14];
              var17 = new ed(var29);
              var17.field_u = 1;
              var6 = var17.a((byte) -11);
              var2 = var2 != 0 & hd.field_b.a(var6, (byte) -124) ? 1 : 0;
              var14++;
              continue L2;
            }
          }
        }
    }

    final static void a(r param0, byte param1) {
        lg[] dupTemp$0 = null;
        lg dupTemp$1 = null;
        lg[] arrayValue$2 = null;
        lg[] dupTemp$3 = null;
        lg dupTemp$4 = null;
        lg[] arrayValue$5 = null;
        lg[] dupTemp$6 = null;
        lg dupTemp$7 = null;
        lg[] arrayValue$8 = null;
        lg[] dupTemp$9 = null;
        lg dupTemp$10 = null;
        lg[] arrayValue$11 = null;
        lg[] dupTemp$12 = null;
        lg dupTemp$13 = null;
        lg[] arrayValue$14 = null;
        lg[] dupTemp$15 = null;
        lg dupTemp$16 = null;
        lg[] arrayValue$17 = null;
        lg[] dupTemp$18 = null;
        lg dupTemp$19 = null;
        lg[] arrayValue$20 = null;
        lg[] arrayValue$21 = null;
        lg[] var9 = null;
        lg[] var2 = null;
        int var3_int = 0;
        lg[] dupTemp$22 = null;
        lg dupTemp$23 = null;
        lg[] arrayValue$24 = null;
        lg[] dupTemp$25 = null;
        lg dupTemp$26 = null;
        lg[] arrayValue$27 = null;
        lg[] dupTemp$28 = null;
        lg dupTemp$29 = null;
        lg[] arrayValue$30 = null;
        lg[] dupTemp$31 = null;
        lg dupTemp$32 = null;
        lg[] arrayValue$33 = null;
        lg[] dupTemp$34 = null;
        lg dupTemp$35 = null;
        lg[] arrayValue$36 = null;
        lg[] dupTemp$37 = null;
        lg dupTemp$38 = null;
        lg[] arrayValue$39 = null;
        lg var3 = null;
        lg var4 = null;
        lg var5 = null;
        int var6 = 0;
        lg var10 = null;
        fc[] dupTemp$40 = null;
        fc dupTemp$41 = null;
        fc[] arrayValue$42 = null;
        lg var11 = null;
        lg var12 = null;
        lg var13 = null;
        fc[] dupTemp$43 = null;
        fc dupTemp$44 = null;
        fc[] arrayValue$45 = null;
        lg var14 = null;
        fc[] dupTemp$46 = null;
        fc dupTemp$47 = null;
        fc[] arrayValue$48 = null;
        lg var15 = null;
        fc[] dupTemp$49 = null;
        fc dupTemp$50 = null;
        fc[] arrayValue$51 = null;
        lg var16 = null;
        fc[] dupTemp$52 = null;
        fc dupTemp$53 = null;
        fc[] arrayValue$54 = null;
        lg var17 = null;
        lg var18 = null;
        lg var19 = null;
        fc[] dupTemp$55 = null;
        fc dupTemp$56 = null;
        fc[] arrayValue$57 = null;
        lg var20 = null;
        fc[] dupTemp$58 = null;
        fc dupTemp$59 = null;
        fc[] arrayValue$60 = null;
        lg var21 = null;
        lg var22 = null;
        lg var23 = null;
        lg var24 = null;
        lg var25 = null;
        lg var26 = null;
        lg var27 = null;
        lg var28 = null;
        lg var29 = null;
        lg var30 = null;
        lg var31 = null;
        lg var32 = null;
        lg var33 = null;
        lg var34 = null;
        lg var35 = null;
        lg var36 = null;
        lg var37 = null;
        lg var38 = null;
        lg var39 = null;
        lg var40 = null;
        lg var41 = null;
        lg var42 = null;
        lg var43 = null;
        fc[] dupTemp$61 = null;
        fc dupTemp$62 = null;
        fc[] arrayValue$63 = null;
        lg var44 = null;
        fc[] dupTemp$64 = null;
        fc dupTemp$65 = null;
        fc[] arrayValue$66 = null;
        fc[] arrayValue$67 = null;
        fc[] arrayValue$68 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        try {
            wi.field_j[3][0] = new fc(lg.a(param0, "", "blocks/std_block_blue"), 110, 1560, 10, -10, -5);
            wi.field_j[4][0] = new fc(lg.a(param0, "", "blocks/std_block_purple"), 110, 1560, 10, -10, -5);
            wi.field_j[2][0] = new fc(lg.a(param0, "", "character/fan_block_purple"), 110, 1560, 10, -10, -5);
            wi.field_j[1][0] = new fc(lg.a(param0, "", "character/fan_block_blue"), 110, 1560, 10, -10, -5);
            wi.field_j[3][1] = new fc(lg.a(param0, "", "blocks/low_poly/std_block_blue_lp"), 110, 1560, 10, -10, -5);
            wi.field_j[4][1] = new fc(lg.a(param0, "", "blocks/low_poly/std_block_purple_lp"), 110, 1560, 10, -10, -5);
            wi.field_j[2][1] = new fc(lg.a(param0, "", "character/fan_block_purple_lp"), 110, 1560, 10, -10, -5);
            wi.field_j[1][1] = new fc(lg.a(param0, "", "character/fan_block_blue_lp"), 110, 1560, 10, -10, -5);
            vl.field_a[0][0] = lg.a(param0, "", "character/vertigo_char_nopaint");
            vl.field_a[1][0] = lg.a(param0, "", "character/vertigo_char_01");
            vl.field_a[2][0] = lg.a(param0, "", "character/vertigo_char_01_blue");
            vl.field_a[3][0] = lg.a(param0, "", "character/vertigo_char_jetp_nopaint");
            vl.field_a[4][0] = lg.a(param0, "", "character/vertigo_char_jetp_paint");
            vl.field_a[5][0] = lg.a(param0, "", "character/vertigo_char_jetp_paint_blue");
            dupTemp$0 = vl.field_a[6];
            dupTemp$1 = lg.a(param0, "", "character/vertigo_char_01_skul_nopaint");
            arrayValue$2 = vl.field_a[6];
            dupTemp$0[0] = dupTemp$1;
            arrayValue$2[1] = dupTemp$1;
            dupTemp$3 = vl.field_a[7];
            dupTemp$4 = lg.a(param0, "", "character/vertigo_char_01_skull");
            arrayValue$5 = vl.field_a[7];
            dupTemp$3[0] = dupTemp$4;
            arrayValue$5[1] = dupTemp$4;
            dupTemp$6 = vl.field_a[8];
            dupTemp$7 = lg.a(param0, "", "character/vertigo_char_01_skull_blue_paint");
            arrayValue$8 = vl.field_a[8];
            dupTemp$6[0] = dupTemp$7;
            arrayValue$8[1] = dupTemp$7;
            dupTemp$9 = vl.field_a[10];
            dupTemp$10 = lg.a(param0, "", "character/vertigo_char_01_skull_blue_paint");
            arrayValue$11 = vl.field_a[10];
            dupTemp$9[0] = dupTemp$10;
            arrayValue$11[1] = dupTemp$10;
            dupTemp$12 = vl.field_a[9];
            dupTemp$13 = lg.a(param0, "", "character/vertigo_char_skull_jetp_paint_blue");
            arrayValue$14 = vl.field_a[9];
            dupTemp$12[0] = dupTemp$13;
            arrayValue$14[1] = dupTemp$13;
            dupTemp$15 = vl.field_a[12];
            dupTemp$16 = lg.a(param0, "", "character/vertigo_char_01_skull_jetp_paint");
            arrayValue$17 = vl.field_a[12];
            dupTemp$15[0] = dupTemp$16;
            arrayValue$17[1] = dupTemp$16;
            dupTemp$18 = vl.field_a[11];
            dupTemp$19 = lg.a(param0, "", "character/vertigo_char_01_ghost");
            arrayValue$20 = vl.field_a[11];
            arrayValue$21 = vl.field_a[11];
            dupTemp$18[0] = dupTemp$19;
            arrayValue$21[1] = dupTemp$19;
            arrayValue$20[1] = dupTemp$19;
            vl.field_a[0][1] = lg.a(param0, "", "character/vertigo_char_nopaint_P2");
            vl.field_a[1][1] = lg.a(param0, "", "character/vertigo_char_01_P2");
            vl.field_a[2][1] = lg.a(param0, "", "character/vertigo_char_01_blue_P2");
            vl.field_a[3][1] = lg.a(param0, "", "character/vertigo_char_jetp_nopaint_P2");
            vl.field_a[4][1] = lg.a(param0, "", "character/vertigo_char_jetp_paint_P2");
            vl.field_a[5][1] = lg.a(param0, "", "character/vertigo_char_jetp_paint_blue_P2");
            qo.field_A = lg.a(param0, "", "character/dynamite");
            ch.field_d[0] = lg.a(param0, "", "character/vertigo_blobs");
            ch.field_d[1] = lg.a(param0, "", "character/vertigo_blobs_blue");
            rp.field_c = lg.a(param0, "", "character/flame");
            lg.a(param0, "", "character/death_block");
            ui.field_e = lg.a(param0, "", "character/death_block_electric");
            kn.field_p = lg.a(param0, "", "character/mouth");
            sl.field_u = lg.a(param0, "", "character/spikes");
            fb.field_v = lg.a(param0, "", "character/char_shadow");
            var9 = new lg[2];
            var2 = var9;
            var2[1] = rp.field_c;
            for (var3_int = 0; -3 < (var3_int ^ -1); var3_int++) {
                var2[0] = vl.field_a[3][var3_int];
                vl.field_a[3][var3_int] = new lg(var9, 2);
                var2[0] = vl.field_a[4][var3_int];
                vl.field_a[4][var3_int] = new lg(var9, 2);
                var2[0] = vl.field_a[5][var3_int];
                vl.field_a[5][var3_int] = new lg(var9, 2);
            }
            var2[1] = kn.field_p;
            var2[0] = vl.field_a[6][0];
            dupTemp$22 = vl.field_a[6];
            dupTemp$23 = new lg(var9, 2);
            arrayValue$24 = vl.field_a[6];
            dupTemp$22[0] = dupTemp$23;
            arrayValue$24[1] = dupTemp$23;
            var2[0] = vl.field_a[7][0];
            dupTemp$25 = vl.field_a[7];
            dupTemp$26 = new lg(var9, 2);
            arrayValue$27 = vl.field_a[7];
            dupTemp$25[0] = dupTemp$26;
            arrayValue$27[1] = dupTemp$26;
            var2[0] = vl.field_a[8][0];
            dupTemp$28 = vl.field_a[8];
            dupTemp$29 = new lg(var9, 2);
            arrayValue$30 = vl.field_a[8];
            dupTemp$28[0] = dupTemp$29;
            arrayValue$30[1] = dupTemp$29;
            var2[0] = vl.field_a[10][0];
            dupTemp$31 = vl.field_a[10];
            dupTemp$32 = new lg(var9, 2);
            arrayValue$33 = vl.field_a[10];
            dupTemp$31[0] = dupTemp$32;
            arrayValue$33[1] = dupTemp$32;
            var2[0] = vl.field_a[9][0];
            dupTemp$34 = vl.field_a[9];
            dupTemp$35 = new lg(var9, 2);
            arrayValue$36 = vl.field_a[9];
            dupTemp$34[0] = dupTemp$35;
            arrayValue$36[1] = dupTemp$35;
            var2[0] = vl.field_a[12][0];
            dupTemp$37 = vl.field_a[12];
            dupTemp$38 = new lg(var9, 2);
            arrayValue$39 = vl.field_a[12];
            dupTemp$37[0] = dupTemp$38;
            arrayValue$39[1] = dupTemp$38;
            rq.field_r = lg.a(param0, "", "character/explosion");
            var3 = lg.a(param0, "", "character/debris");
            var4 = lg.a(param0, "", "character/debris_blue");
            var5 = lg.a(param0, "", "character/debris_grey");
            wo.field_q[0] = lg.a(param0, "", "character/purple_block_cracked_for_anim");
            qb.field_f[0] = lg.a(param0, "", "character/blue_block_cracked_for_anim");
            th.field_a[0] = lg.a(param0, "", "character/grey_block_cracked_for_anim");
            wo.field_q[1] = lg.a(param0, "", "character/purple_block_cracked_for_anim_lp");
            qb.field_f[1] = lg.a(param0, "", "character/blue_block_cracked_for_anim_lp");
            th.field_a[1] = lg.a(param0, "", "character/grey_block_cracked_for_anim_lp");
            for (var6 = 0; (var6 ^ -1) > -3; var6++) {
                var2[0] = var3;
                var2[1] = wo.field_q[var6];
                wo.field_q[var6] = new lg(var9, 2);
                var2[0] = var4;
                var2[1] = qb.field_f[var6];
                qb.field_f[var6] = new lg(var9, 2);
                var2[0] = var5;
                var2[1] = th.field_a[var6];
                th.field_a[var6] = new lg(var9, 2);
            }
            var10 = lg.a(param0, "", "game_object_models/paint_bucket_purple");
            dupTemp$40 = wi.field_j[5];
            dupTemp$41 = new fc(var10, 110, 1560, 10, -10, -5);
            arrayValue$42 = wi.field_j[5];
            dupTemp$40[0] = dupTemp$41;
            arrayValue$42[1] = dupTemp$41;
            var11 = lg.a(param0, "", "blocks/bomb_block");
            wi.field_j[8][0] = new fc(var11, 110, 1560, 10, -10, -5);
            var12 = lg.a(param0, "", "blocks/low_poly/bomb_block_lp");
            wi.field_j[8][1] = new fc(var12, 110, 1560, 10, -10, -5);
            var13 = lg.a(param0, "", "game_object_models/compass");
            dupTemp$43 = wi.field_j[9];
            dupTemp$44 = new fc(var13, 110, 1560, 10, -10, -5);
            arrayValue$45 = wi.field_j[9];
            dupTemp$43[0] = dupTemp$44;
            arrayValue$45[1] = dupTemp$44;
            var14 = lg.a(param0, "", "game_object_models/paint_bucket_blue");
            dupTemp$46 = wi.field_j[10];
            dupTemp$47 = new fc(var14, 110, 1560, 10, -10, -5);
            arrayValue$48 = wi.field_j[10];
            dupTemp$46[0] = dupTemp$47;
            arrayValue$48[1] = dupTemp$47;
            var15 = lg.a(param0, "", "game_object_models/dynamite");
            dupTemp$49 = wi.field_j[11];
            dupTemp$50 = new fc(var15, 110, 1560, 10, -10, -5);
            arrayValue$51 = wi.field_j[11];
            dupTemp$49[0] = dupTemp$50;
            arrayValue$51[1] = dupTemp$50;
            var16 = lg.a(param0, "", "game_object_models/100_coin");
            dupTemp$52 = wi.field_j[12];
            dupTemp$53 = new fc(var16, 110, 1560, 10, -10, -5);
            arrayValue$54 = wi.field_j[12];
            dupTemp$52[0] = dupTemp$53;
            arrayValue$54[1] = dupTemp$53;
            var17 = lg.a(param0, "", "blocks/blocking_block");
            wi.field_j[17][0] = new fc(var17, 110, 1560, 10, -10, -5);
            var18 = lg.a(param0, "", "blocks/low_poly/blocking_block_lp");
            wi.field_j[17][1] = new fc(var18, 110, 1560, 10, -10, -5);
            vq.field_i = lg.a(param0, "", "character/portal_block_purple");
            wi.field_j[7][0] = new fc(vq.field_i, 110, 1560, 10, -10, -5);
            vq.field_i = lg.a(param0, "", "character/portal_block_purple_lp");
            wi.field_j[7][1] = new fc(vq.field_i, 110, 1560, 10, -10, -5);
            var19 = lg.a(param0, "", "game_object_models/jetpack");
            dupTemp$55 = wi.field_j[18];
            dupTemp$56 = new fc(var19, 110, 1560, 10, -10, -5);
            arrayValue$57 = wi.field_j[18];
            dupTemp$55[0] = dupTemp$56;
            arrayValue$57[1] = dupTemp$56;
            var20 = lg.a(param0, "", "game_object_models/restart_point");
            dupTemp$58 = wi.field_j[20];
            dupTemp$59 = new fc(var20, 110, 1560, 10, -10, -5);
            arrayValue$60 = wi.field_j[20];
            dupTemp$58[0] = dupTemp$59;
            arrayValue$60[1] = dupTemp$59;
            var21 = lg.a(param0, "", "blocks/cracked_block");
            wi.field_j[15][0] = new fc(var21, 110, 1560, 10, -10, -5);
            var22 = lg.a(param0, "", "blocks/low_poly/cracked_block_lp");
            wi.field_j[15][1] = new fc(var22, 110, 1560, 10, -10, -5);
            var23 = lg.a(param0, "", "character/ice_block_cracked");
            wi.field_j[23][0] = new fc(var23, 110, 1560, 10, -10, -5);
            if (param1 >= -25) {
                r var8 = (r) null;
                ei.a((r) null, (byte) 72);
            }
            var24 = lg.a(param0, "", "character/ice_block_cracked_lp");
            wi.field_j[23][1] = new fc(var24, 110, 1560, 10, -10, -5);
            var25 = lg.a(param0, "", "character/ice_block_cracked_for_anim");
            wi.field_j[28][0] = new fc(var25, 110, 1560, 10, -10, -5);
            var26 = lg.a(param0, "", "character/ice_block_cracked_for_anim_lp");
            wi.field_j[28][1] = new fc(var26, 110, 1560, 10, -10, -5);
            var27 = lg.a(param0, "", "blocks/repel_block");
            wi.field_j[13][0] = new fc(var27, 110, 1560, 10, -10, -5);
            var28 = lg.a(param0, "", "blocks/low_poly/repel_block_lp");
            wi.field_j[13][1] = new fc(var28, 110, 1560, 10, -10, -5);
            var29 = lg.a(param0, "", "blocks/attract_block");
            wi.field_j[14][0] = new fc(var29, 110, 1560, 10, -10, -5);
            var30 = lg.a(param0, "", "blocks/low_poly/attract_block_lp");
            wi.field_j[14][1] = new fc(var30, 110, 1560, 10, -10, -5);
            var31 = lg.a(param0, "", "character/portal_block_red_purple");
            wi.field_j[25][0] = new fc(var31, 110, 1560, 10, -10, -5);
            var32 = lg.a(param0, "", "character/portal_block_red_purple_lp");
            wi.field_j[25][1] = new fc(var32, 110, 1560, 10, -10, -5);
            var33 = lg.a(param0, "", "character/portal_block_red_blue");
            wi.field_j[26][0] = new fc(var33, 110, 1560, 10, -10, -5);
            var34 = lg.a(param0, "", "character/portal_block_red_blue_lp");
            wi.field_j[26][1] = new fc(var34, 110, 1560, 10, -10, -5);
            var35 = lg.a(param0, "", "blocks/death_block");
            wi.field_j[6][0] = new fc(var35, 110, 1560, 10, -10, -5);
            var36 = lg.a(param0, "", "character/death_block_lp");
            wi.field_j[6][1] = new fc(var36, 110, 1560, 10, -10, -5);
            var37 = lg.a(param0, "", "blocks/unpaintable_block");
            wi.field_j[27][0] = new fc(var37, 110, 1560, 10, -10, -5);
            var38 = lg.a(param0, "", "blocks/low_poly/unpaintable_block_lp");
            wi.field_j[27][1] = new fc(var38, 110, 1560, 10, -10, -5);
            var39 = lg.a(param0, "", "blocks/bomb_block_flash");
            wi.field_j[22][0] = new fc(var39, 110, 1560, 10, -10, -5);
            var40 = lg.a(param0, "", "blocks/low_poly/bomb_block_flash_lp");
            wi.field_j[22][1] = new fc(var40, 110, 1560, 10, -10, -5);
            var41 = lg.a(param0, "", "blocks/sticky_block");
            wi.field_j[16][0] = new fc(var41, 110, 1560, 10, -10, -5);
            var42 = lg.a(param0, "", "blocks/low_poly/sticky_block_lp");
            wi.field_j[16][1] = new fc(var42, 110, 1560, 10, -10, -5);
            var43 = lg.a(param0, "", "game_object_models/extra_life");
            dupTemp$61 = wi.field_j[19];
            dupTemp$62 = new fc(var43, 110, 1560, 10, -10, -5);
            arrayValue$63 = wi.field_j[19];
            dupTemp$61[0] = dupTemp$62;
            arrayValue$63[1] = dupTemp$62;
            var44 = lg.a(param0, "", "game_object_models/skull");
            dupTemp$64 = wi.field_j[29];
            dupTemp$65 = new fc(var44, 110, 1560, 10, -10, -5);
            arrayValue$66 = wi.field_j[30];
            arrayValue$67 = wi.field_j[30];
            arrayValue$68 = wi.field_j[29];
            dupTemp$64[0] = dupTemp$65;
            arrayValue$68[1] = dupTemp$65;
            arrayValue$67[0] = dupTemp$65;
            arrayValue$66[1] = dupTemp$65;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ei.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ei(int param0) {
        this.field_v = param0;
    }

    static {
    }
}

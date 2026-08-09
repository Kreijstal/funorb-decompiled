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

    public static void b(int param0) {
        if (param0 != 29325) {
            fp.b(-97);
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(String param0, int param1, cn param2, byte param3) {
        int var5_int = 0;
        int var9_int = 0;
        int var12_int = 0;
        jpa[] var11 = null;
        jpa[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int incrementValue$8 = 0;
        int var10_int = 0;
        int var11_int = 0;
        Object var16 = null;
        int var15 = TombRacer.field_G ? 1 : 0;
        sra var16_ref = (sra) ((Object) dma.field_l);
        var16_ref.a(param1, (byte) 47, param0);
        rva.field_v = jpa.a(param2, "", "title");
        eta.field_a = new jpa[6][];
        eta.field_a[0] = new jpa[1];
        eta.field_a[0][0] = jpa.a(param2, "", "billboard_flame");
        eta.field_a[1] = new jpa[1];
        eta.field_a[1][0] = jpa.a(param2, "", "billboard_smoke");
        eta.field_a[2] = new jpa[1];
        eta.field_a[2][0] = jpa.a(param2, "", "billboard_dust_thin");
        eta.field_a[3] = new jpa[1];
        eta.field_a[3][0] = jpa.a(param2, "", "billboard_dust_thick");
        eta.field_a[4] = new jpa[1];
        eta.field_a[4][0] = jpa.a(param2, "", "billboard_spark");
        eta.field_a[5] = new jpa[1];
        eta.field_a[5][0] = jpa.a(param2, "", "billboard_gas");
        int incrementValue$0 = param1;
        param1++;
        var16_ref.a(incrementValue$0, (byte) 47, param0);
        lm.field_p = new jpa[6];
        lm.field_p[0] = jpa.a(param2, "", "menu_button_sml");
        lm.field_p[1] = jpa.a(param2, "", "menu_button_mid");
        lm.field_p[2] = jpa.a(param2, "", "menu_button_lrg");
        lm.field_p[3] = jpa.a(param2, "", "menu_button_xlrg");
        lm.field_p[4] = jpa.a(param2, "", "button_main1");
        lm.field_p[5] = jpa.a(param2, "", "button_main2");
        int incrementValue$1 = param1;
        param1++;
        var16_ref.a(incrementValue$1, (byte) 47, param0);
        dna.field_F = jpa.a(param2, "", "bg_slab");
        bp.field_p = jpa.b(param2, "", "inset_frame");
        tba.field_f = jpa.b(param2, "", "keys");
        wca.field_l = new int[tba.field_f.length];
        for (var5_int = 0; wca.field_l.length > var5_int; var5_int++) {
            wca.field_l[var5_int] = 12;
        }
        jpa var5 = tba.field_f[9];
        int var6 = var5.field_i;
        var5.field_i = var5.field_i - 9;
        byte[] var7 = var5.field_h;
        byte[] var8 = var5.field_f;
        var5.field_h = new byte[var5.field_i * var5.field_a];
        var5.field_f = new byte[var5.field_a * var5.field_i];
        for (var9_int = 0; var9_int < var5.field_a; var9_int++) {
            for (var10_int = 0; var10_int < var5.field_i; var10_int++) {
                var5.field_f[var10_int - -(var5.field_i * var9_int)] = var8[var6 * var9_int + var10_int];
                var5.field_h[var9_int * var5.field_i + var10_int] = var7[var9_int * var6 + var10_int];
            }
        }
        jpa var9 = tba.field_f[11];
        var6 = var9.field_i;
        var9.field_i = var9.field_i - 5;
        var7 = var9.field_h;
        var8 = var9.field_f;
        var9.field_h = new byte[var9.field_i * var9.field_a];
        var9.field_f = new byte[var9.field_i * var9.field_a];
        for (var10_int = 0; var10_int < var9.field_a; var10_int++) {
            for (var11_int = 0; var11_int < var9.field_i; var11_int++) {
                var9.field_f[var9.field_i * var10_int + var11_int] = var8[var11_int + var6 * var10_int];
                var9.field_h[var10_int * var9.field_i + var11_int] = var7[var11_int + var10_int * var6];
            }
        }
        jpa var10 = tba.field_f[15];
        var6 = var10.field_i;
        var8 = var10.field_f;
        var7 = var10.field_h;
        var10.field_i = var10.field_i - 5;
        var10.field_f = new byte[var10.field_a * var10.field_i];
        var10.field_h = new byte[var10.field_i * var10.field_a];
        for (var11_int = 0; var11_int < var10.field_a; var11_int++) {
            for (var12_int = 0; var12_int < var10.field_i; var12_int++) {
                var10.field_f[var12_int - -(var10.field_i * var11_int)] = var8[var6 * var11_int + var12_int];
                var10.field_h[var12_int - -(var10.field_i * var11_int)] = var7[var11_int * var6 + var12_int];
            }
        }
        int incrementValue$2 = param1;
        param1++;
        var16_ref.a(incrementValue$2, (byte) 47, param0);
        ara.field_vb = jpa.a(param2, "", "hud_score");
        tla.field_g = jpa.a(param2, "", "hud_room");
        wd.field_c = jpa.a(param2, "", "hud_timer");
        lha.field_l = jpa.a(param2, "", "hud_timer_head");
        wj.field_a = jpa.a(param2, "", "hud_timer_jaw");
        qb.field_e = jpa.b(param2, "", "hud_sand");
        via.field_a = new jpa[3];
        via.field_a[2] = jpa.a(param2, "", "hud_idolhead");
        via.field_a[0] = jpa.a(param2, "", "hud_coin");
        via.field_a[1] = jpa.a(param2, "", "hud_bag");
        gda.field_d = jpa.b(param2, "", "frame_main");
        nm.field_i = jpa.a(param2, "", "map_room");
        int incrementValue$3 = param1;
        param1++;
        var16_ref.a(incrementValue$3, (byte) 47, param0);
        ng.field_f = jpa.b(param2, "", "achievements");
        ds.field_g = jpa.a(oma.field_G, "basic", "unachieved");
        aa.field_a = jpa.a(param2, "", "map_routedot");
        pha.field_Bb = jpa.a(param2, "", "map_coin_gold");
        ira.field_t = jpa.a(param2, "", "map_coin_silver");
        qh.field_q = jpa.a(param2, "", "map_coin_bronze");
        tl.field_n = jpa.a(param2, "", "map_locationdot");
        int incrementValue$4 = param1;
        param1++;
        var16_ref.a(incrementValue$4, (byte) 47, param0);
        ga.field_F = new jpa[9];
        ga.field_F[0] = jpa.a(param2, "", "map_set1");
        ga.field_F[1] = jpa.a(param2, "", "map_set2a");
        ga.field_F[2] = jpa.a(param2, "", "map_set2b");
        ga.field_F[3] = jpa.a(param2, "", "map_set3a");
        ga.field_F[4] = jpa.a(param2, "", "map_set3b");
        ga.field_F[5] = jpa.a(param2, "", "map_set3c");
        ga.field_F[6] = jpa.a(param2, "", "map_set4a");
        ga.field_F[7] = jpa.a(param2, "", "map_set4b");
        ga.field_F[8] = jpa.a(param2, "", "map_set5");
        int incrementValue$5 = param1;
        param1++;
        var16_ref.a(incrementValue$5, (byte) 47, param0);
        hoa.field_l = jpa.a(param2, "", "silhoutte");
        baa.field_g = jpa.a(param2, "", "slab_small1");
        op.field_O = jpa.a(param2, "", "slab_small2");
        ifa.field_q = jpa.a(param2, "", "slab_small3");
        ob.field_n = jpa.a(param2, "", "slab_small4");
        vua.field_y = jpa.a(param2, "", "slab_medium");
        int incrementValue$6 = param1;
        param1++;
        var16_ref.a(incrementValue$6, (byte) 47, param0);
        up.field_e = new jpa[7];
        up.field_e[0] = jpa.a(param2, "", "reward_coin");
        up.field_e[1] = jpa.a(param2, "", "reward_moneybag");
        up.field_e[2] = jpa.a(param2, "", "reward_idol");
        ena.field_l = jpa.a(param2, "", "endround_flag");
        aw.field_F = jpa.a(param2, "", "endround_divider_line");
        rp.field_f = jpa.a(param2, "", "endround_smoke_trail");
        qka.field_o = jpa.b(param2, "", "endround_stage_lines");
        ko.field_j = jpa.a(param2, "", "podium");
        int incrementValue$7 = param1;
        param1++;
        var16_ref.a(incrementValue$7, (byte) 47, param0);
        ht.field_Db = jpa.a(param2, "", "options_bar_empty");
        oea.field_j = jpa.a(param2, "", "options_bar_full");
        cn.field_h = jpa.a(param2, "", "button_music");
        re.field_a = jpa.a(param2, "", "button_sound");
        ina.field_c = jpa.b(param2, "", "multipliers");
        lt.field_a = jpa.a(param2, "", "room_total");
        bha.field_C = jpa.a(param2, "", "tombname_frame");
        mna.field_c = jpa.b(param2, "", "blackframe");
        fm.field_h = jpa.a(param2, "", "sandblock");
        jga.field_b = jpa.a(param2, "", "medal_gold");
        sla.field_a = jpa.a(param2, "", "medal_silver");
        if (param3 != 17) {
            return;
        }
        try {
            gv.field_s = jpa.a(param2, "", "medal_bronze");
            var11 = jpa.b(param2, "", "mugshots");
            var12 = jpa.b(param2, "", "hud_icons");
            qk.field_u = var12[1];
            mp.field_d = var12[1];
            nk.field_k = new jpa[13];
            var13 = 0;
            for (var14 = 0; var14 < 13; var14++) {
                nk.field_k[var13] = var11[var13];
                var13++;
            }
            hka.field_c = var11[var13];
            incrementValue$8 = param1;
            param1++;
            var16_ref.a(incrementValue$8, (byte) 47, param0);
            nia.a(oma.field_G, "basic", "orbcoin", -121);
            ff.field_p = nia.a(param2, "", "lobby_game_logo", -119);
            bp.field_m = uka.a(param2, "", 5, "lobby_icons");
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        apa stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        apa var9 = null;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = jua.field_d;
              if (param0 == -83) {
                break L1;
              } else {
                fp.a((byte) -23);
                break L1;
              }
            }
            L2: {
              var2 = 0;
              if (-3 != (mq.field_a ^ -1)) {
                break L2;
              } else {
                var3_long = bva.b((byte) -107) + -ln.field_H;
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (-1 < (var2 ^ -1)) {
                  var2 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (mba.field_g.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = bla.field_H[var3];
                  if (-1 >= (var4 ^ -1)) {
                    if (sa.field_r.field_h == var4) {
                      var5 = ct.field_a;
                      break L4;
                    } else {
                      var5 = qv.field_m;
                      break L4;
                    }
                  } else {
                    var5 = mn.field_k;
                    break L4;
                  }
                }
                L5: {
                  var6 = mba.field_g[var3];
                  if (2 != mq.field_a) {
                    break L5;
                  } else {
                    if ((var2 ^ -1) != -2) {
                      break L5;
                    } else {
                      L6: {
                        if (cia.field_a.length < pm.field_d.length) {
                          stackIn_19_0 = pm.field_d.length;
                          break L6;
                        } else {
                          stackIn_19_0 = cia.field_a.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (var7 + 6 <= var3) {
                            break L7;
                          } else {
                            L8: {
                              if (-1 >= (cia.field_a.length + -6 + (var3 - var7) ^ -1)) {
                                stackIn_24_0 = cia.field_a[-var7 + (var3 + -6 - -cia.field_a.length)];
                                break L8;
                              } else {
                                stackIn_24_0 = "";
                                break L8;
                              }
                            }
                            var6 = stackIn_24_0;
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (ea.field_k.length <= wr.field_o.length) {
                          stackIn_28_0 = wr.field_o.length;
                          break L9;
                        } else {
                          stackIn_28_0 = ea.field_k.length;
                          break L9;
                        }
                      }
                      var8 = stackIn_28_0;
                      if (var3 < 7 - -var7) {
                        break L5;
                      } else {
                        if (7 + var7 + var8 <= var3) {
                          break L5;
                        } else {
                          L10: {
                            if (wr.field_o.length > -7 + (var3 - var7)) {
                              stackIn_33_0 = wr.field_o[-7 + var3 - var7];
                              break L10;
                            } else {
                              stackIn_33_0 = "";
                              break L10;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if ((var4 ^ -1) == 1) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackIn_39_0 = -116;

                  stackIn_39_1 = (String) (var6);

                  if ((var4 ^ -1) > -1) {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = (String) ((Object) stackIn_39_1);
                    stackIn_40_2 = 0;
                    break L12;
                  } else {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = (String) ((Object) stackIn_39_1);
                    stackIn_40_2 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = ro.a((byte) stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0);
                  var8 = ega.field_c - (var7 >> -933934047);
                  if (0 <= var4) {
                    L14: {
                      if (var4 == sa.field_r.field_h) {
                        stackIn_45_0 = mpa.field_V;
                        break L14;
                      } else {
                        stackIn_45_0 = jaa.field_b;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_45_0;
                      var1_int = var1_int + mha.field_C;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a((byte) 57, var7 + (nja.field_L << 1958511713), var1_int, -nja.field_L + var8, nt.field_d + (pqa.field_p << 919639873));
                        break L15;
                      }
                    }
                    var1_int = var1_int + pqa.field_p;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if ((var4 ^ -1) <= -1) {
                    qt.field_a.c(var6, var8, qra.field_j + var1_int, var5, -1);
                    var1_int = var1_int + (nt.field_d + pqa.field_p + mha.field_C);
                    break L16;
                  } else {
                    bfa.field_c.c(var6, var8, var1_int + vi.field_a, var5, -1);
                    var1_int = var1_int + f.field_b;
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "fp.C(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        if (!(!dna.field_G)) {
            return;
        }
        int var1 = 71 % ((-30 - param0) / 44);
        if (null != cs.field_c && !cs.field_c.g(126)) {
            return;
        }
        int var2 = aq.a(-5640);
        int var3 = jqa.a(2147483647, new Random(), 45);
        cs.field_c = new qh(false, 0, new String[]{""}, 0, false, var2, -1 + var2, 1, 2, 0, (BitSet[]) null, new boolean[]{(wla.field_ub ^ -1) < -1 ? true : false}, new qha(var3));
        cs.field_c.k((byte) -25);
        wka.field_d = true;
    }

    static {
        field_a = 49;
        field_b = "Freezethrower";
        field_c = new it();
    }
}

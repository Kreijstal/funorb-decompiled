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
        jpa var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9_int = 0;
        jpa var9 = null;
        int var10_int = 0;
        jpa var10 = null;
        int var11_int = 0;
        jpa[] var11 = null;
        int var12_int = 0;
        jpa[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        sra var16_ref = null;
        var16 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        var16_ref = (sra) (Object) dma.field_l;
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
        param1++;
        var16_ref.a(param1, (byte) 47, param0);
        lm.field_p = new jpa[6];
        lm.field_p[0] = jpa.a(param2, "", "menu_button_sml");
        lm.field_p[1] = jpa.a(param2, "", "menu_button_mid");
        lm.field_p[2] = jpa.a(param2, "", "menu_button_lrg");
        lm.field_p[3] = jpa.a(param2, "", "menu_button_xlrg");
        lm.field_p[4] = jpa.a(param2, "", "button_main1");
        lm.field_p[5] = jpa.a(param2, "", "button_main2");
        param1++;
        var16_ref.a(param1, (byte) 47, param0);
        dna.field_F = jpa.a(param2, "", "bg_slab");
        bp.field_p = jpa.b(param2, "", "inset_frame");
        tba.field_f = jpa.b(param2, "", "keys");
        wca.field_l = new int[tba.field_f.length];
        var5_int = 0;
        L0: while (true) {
          if (wca.field_l.length <= var5_int) {
            var5 = tba.field_f[9];
            var6 = var5.field_i;
            var5.field_i = var5.field_i - 9;
            var7 = var5.field_h;
            var8 = var5.field_f;
            var5.field_h = new byte[var5.field_i * var5.field_a];
            var5.field_f = new byte[var5.field_a * var5.field_i];
            var9_int = 0;
            L1: while (true) {
              if (var9_int >= var5.field_a) {
                var9 = tba.field_f[11];
                var6 = var9.field_i;
                var9.field_i = var9.field_i - 5;
                var7 = var9.field_h;
                var8 = var9.field_f;
                var9.field_h = new byte[var9.field_i * var9.field_a];
                var9.field_f = new byte[var9.field_i * var9.field_a];
                var10_int = 0;
                L2: while (true) {
                  if (var10_int >= var9.field_a) {
                    var10 = tba.field_f[15];
                    var6 = var10.field_i;
                    var8 = var10.field_f;
                    var7 = var10.field_h;
                    var10.field_i = var10.field_i - 5;
                    var10.field_f = new byte[var10.field_a * var10.field_i];
                    var10.field_h = new byte[var10.field_i * var10.field_a];
                    var11_int = 0;
                    L3: while (true) {
                      if (var11_int >= var10.field_a) {
                        param1++;
                        var16_ref.a(param1, (byte) 47, param0);
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
                        param1++;
                        var16_ref.a(param1, (byte) 47, param0);
                        ng.field_f = jpa.b(param2, "", "achievements");
                        ds.field_g = jpa.a(oma.field_G, "basic", "unachieved");
                        aa.field_a = jpa.a(param2, "", "map_routedot");
                        pha.field_Bb = jpa.a(param2, "", "map_coin_gold");
                        ira.field_t = jpa.a(param2, "", "map_coin_silver");
                        qh.field_q = jpa.a(param2, "", "map_coin_bronze");
                        tl.field_n = jpa.a(param2, "", "map_locationdot");
                        param1++;
                        var16_ref.a(param1, (byte) 47, param0);
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
                        param1++;
                        var16_ref.a(param1, (byte) 47, param0);
                        hoa.field_l = jpa.a(param2, "", "silhoutte");
                        baa.field_g = jpa.a(param2, "", "slab_small1");
                        op.field_O = jpa.a(param2, "", "slab_small2");
                        ifa.field_q = jpa.a(param2, "", "slab_small3");
                        ob.field_n = jpa.a(param2, "", "slab_small4");
                        vua.field_y = jpa.a(param2, "", "slab_medium");
                        param1++;
                        var16_ref.a(param1, (byte) 47, param0);
                        up.field_e = new jpa[7];
                        up.field_e[0] = jpa.a(param2, "", "reward_coin");
                        up.field_e[1] = jpa.a(param2, "", "reward_moneybag");
                        up.field_e[2] = jpa.a(param2, "", "reward_idol");
                        ena.field_l = jpa.a(param2, "", "endround_flag");
                        aw.field_F = jpa.a(param2, "", "endround_divider_line");
                        rp.field_f = jpa.a(param2, "", "endround_smoke_trail");
                        qka.field_o = jpa.b(param2, "", "endround_stage_lines");
                        ko.field_j = jpa.a(param2, "", "podium");
                        param1++;
                        var16_ref.a(param1, (byte) 47, param0);
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
                        if (param3 == 17) {
                          gv.field_s = jpa.a(param2, "", "medal_bronze");
                          var11 = jpa.b(param2, "", "mugshots");
                          var12 = jpa.b(param2, "", "hud_icons");
                          qk.field_u = var12[1];
                          mp.field_d = var12[1];
                          nk.field_k = new jpa[13];
                          var13 = 0;
                          var14 = 0;
                          L4: while (true) {
                            if (var14 >= 13) {
                              hka.field_c = var11[var13];
                              param1++;
                              var16_ref.a(param1, (byte) 47, param0);
                              iu discarded$1 = nia.a(oma.field_G, "basic", "orbcoin", -121);
                              ff.field_p = nia.a(param2, "", "lobby_game_logo", -119);
                              bp.field_m = uka.a(param2, "", 5, "lobby_icons");
                              return;
                            } else {
                              nk.field_k[var13] = var11[var13];
                              var13++;
                              var14++;
                              continue L4;
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        var12_int = 0;
                        L5: while (true) {
                          if (var12_int < var10.field_i) {
                            var10.field_f[var12_int - -(var10.field_i * var11_int)] = var8[var6 * var11_int + var12_int];
                            var10.field_h[var12_int - -(var10.field_i * var11_int)] = var7[var11_int * var6 + var12_int];
                            var12_int++;
                            continue L5;
                          } else {
                            var11_int++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var11_int = 0;
                    L6: while (true) {
                      if (var11_int >= var9.field_i) {
                        var10_int++;
                        continue L2;
                      } else {
                        var9.field_f[var9.field_i * var10_int + var11_int] = var8[var11_int + var6 * var10_int];
                        var9.field_h[var10_int * var9.field_i + var11_int] = var7[var11_int + var10_int * var6];
                        var11_int++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                var10_int = 0;
                L7: while (true) {
                  if (var10_int >= var5.field_i) {
                    var9_int++;
                    continue L1;
                  } else {
                    var5.field_f[var10_int - -(var5.field_i * var9_int)] = var8[var6 * var9_int + var10_int];
                    var5.field_h[var9_int * var5.field_i + var10_int] = var7[var9_int * var6 + var10_int];
                    var10_int++;
                    continue L7;
                  }
                }
              }
            }
          } else {
            wca.field_l[var5_int] = 12;
            var5_int++;
            continue L0;
          }
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        apa var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_32_0 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        apa stackIn_44_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        apa stackOut_43_0 = null;
        apa stackOut_42_0 = null;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          var1 = jua.field_d;
          if (param0 == -83) {
            break L0;
          } else {
            fp.a((byte) -23);
            break L0;
          }
        }
        L1: {
          var2 = 0;
          if (-3 != mq.field_a) {
            break L1;
          } else {
            var3_long = bva.b((byte) -107) + -ln.field_H;
            var2 = (int)((10999L + -var3_long) / 1000L);
            if (-1 > var2) {
              var2 = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        var3 = 0;
        L2: while (true) {
          if (mba.field_g.length <= var3) {
            return;
          } else {
            L3: {
              var4 = bla.field_H[var3];
              if (-1 >= (var4 ^ -1)) {
                if (sa.field_r.field_h == var4) {
                  var5 = ct.field_a;
                  break L3;
                } else {
                  var5 = qv.field_m;
                  break L3;
                }
              } else {
                var5 = mn.field_k;
                break L3;
              }
            }
            L4: {
              var6 = mba.field_g[var3];
              if (2 != mq.field_a) {
                break L4;
              } else {
                if ((var2 ^ -1) != -2) {
                  break L4;
                } else {
                  L5: {
                    if (cia.field_a.length < pm.field_d.length) {
                      stackOut_17_0 = pm.field_d.length;
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = cia.field_a.length;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_18_0;
                    if (var3 < 6) {
                      break L6;
                    } else {
                      if (var7 + 6 <= var3) {
                        break L6;
                      } else {
                        L7: {
                          if (-1 >= (cia.field_a.length + -6 + (var3 - var7) ^ -1)) {
                            stackOut_22_0 = cia.field_a[-var7 + (var3 + -6 - -cia.field_a.length)];
                            stackIn_23_0 = stackOut_22_0;
                            break L7;
                          } else {
                            stackOut_21_0 = "";
                            stackIn_23_0 = stackOut_21_0;
                            break L7;
                          }
                        }
                        var6_ref = stackIn_23_0;
                        break L6;
                      }
                    }
                  }
                  L8: {
                    if (ea.field_k.length <= wr.field_o.length) {
                      stackOut_26_0 = wr.field_o.length;
                      stackIn_27_0 = stackOut_26_0;
                      break L8;
                    } else {
                      stackOut_25_0 = ea.field_k.length;
                      stackIn_27_0 = stackOut_25_0;
                      break L8;
                    }
                  }
                  var8 = stackIn_27_0;
                  if (var3 < 7 - -var7) {
                    break L4;
                  } else {
                    if (7 + var7 + var8 <= var3) {
                      break L4;
                    } else {
                      L9: {
                        if (wr.field_o.length > -7 + (var3 - var7)) {
                          stackOut_31_0 = wr.field_o[-7 + var3 - var7];
                          stackIn_32_0 = stackOut_31_0;
                          break L9;
                        } else {
                          stackOut_30_0 = "";
                          stackIn_32_0 = stackOut_30_0;
                          break L9;
                        }
                      }
                      var6_ref = stackIn_32_0;
                      break L4;
                    }
                  }
                }
              }
            }
            L10: {
              if ((var4 ^ -1) == 1) {
                var6_ref = Integer.toString(var2);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              stackOut_36_0 = -116;
              stackOut_36_1 = (String) var6_ref;
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              if ((var4 ^ -1) > -1) {
                stackOut_38_0 = stackIn_38_0;
                stackOut_38_1 = (String) (Object) stackIn_38_1;
                stackOut_38_2 = 0;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                stackIn_39_2 = stackOut_38_2;
                break L11;
              } else {
                stackOut_37_0 = stackIn_37_0;
                stackOut_37_1 = (String) (Object) stackIn_37_1;
                stackOut_37_2 = 1;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_39_2 = stackOut_37_2;
                break L11;
              }
            }
            L12: {
              var7 = ro.a((byte) stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0);
              var8 = ega.field_c - (var7 >> -933934047);
              if (0 <= var4) {
                L13: {
                  if (var4 == sa.field_r.field_h) {
                    stackOut_43_0 = mpa.field_V;
                    stackIn_44_0 = stackOut_43_0;
                    break L13;
                  } else {
                    stackOut_42_0 = jaa.field_b;
                    stackIn_44_0 = stackOut_42_0;
                    break L13;
                  }
                }
                L14: {
                  var9 = stackIn_44_0;
                  var1 = var1 + mha.field_C;
                  if (var9 == null) {
                    break L14;
                  } else {
                    var9.a((byte) 57, var7 + (nja.field_L << 1958511713), var1, -nja.field_L + var8, nt.field_d + (pqa.field_p << 919639873));
                    break L14;
                  }
                }
                var1 = var1 + pqa.field_p;
                break L12;
              } else {
                break L12;
              }
            }
            if ((var4 ^ -1) <= -1) {
              qt.field_a.c(var6_ref, var8, qra.field_j + var1, var5, -1);
              var1 = var1 + (nt.field_d + pqa.field_p + mha.field_C);
              var3++;
              continue L2;
            } else {
              bfa.field_c.c(var6_ref, var8, var1 + vi.field_a, var5, -1);
              var1 = var1 + f.field_b;
              var3++;
              continue L2;
            }
          }
        }
    }

    final static void a(int param0) {
        if (!(!dna.field_G)) {
            return;
        }
        int var1 = 71 % ((-30 - param0) / 44);
        if (null != cs.field_c) {
            if (!cs.field_c.g(126)) {
                return;
            }
        }
        int var2 = aq.a(-5640);
        int var3 = jqa.a(2147483647, new Random(), 45);
        cs.field_c = new qh(false, 0, new String[1], 0, false, var2, -1 + var2, 1, 2, 0, (BitSet[]) null, new boolean[1], (ou) (Object) new qha(var3));
        cs.field_c.k((byte) -25);
        wka.field_d = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 49;
        field_b = "Freezethrower";
        field_c = new it();
    }
}

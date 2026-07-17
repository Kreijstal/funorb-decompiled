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
        RuntimeException var4 = null;
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
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var16 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
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
            int incrementValue$10 = param1;
            param1++;
            var16_ref.a(incrementValue$10, (byte) 47, param0);
            lm.field_p = new jpa[6];
            lm.field_p[0] = jpa.a(param2, "", "menu_button_sml");
            lm.field_p[1] = jpa.a(param2, "", "menu_button_mid");
            lm.field_p[2] = jpa.a(param2, "", "menu_button_lrg");
            lm.field_p[3] = jpa.a(param2, "", "menu_button_xlrg");
            lm.field_p[4] = jpa.a(param2, "", "button_main1");
            lm.field_p[5] = jpa.a(param2, "", "button_main2");
            int incrementValue$11 = param1;
            param1++;
            var16_ref.a(incrementValue$11, (byte) 47, param0);
            dna.field_F = jpa.a(param2, "", "bg_slab");
            bp.field_p = jpa.b(param2, "", "inset_frame");
            tba.field_f = jpa.b(param2, "", "keys");
            wca.field_l = new int[tba.field_f.length];
            var5_int = 0;
            L1: while (true) {
              if (wca.field_l.length <= var5_int) {
                var5 = tba.field_f[9];
                var6 = var5.field_i;
                var5.field_i = var5.field_i - 9;
                var7 = var5.field_h;
                var8 = var5.field_f;
                var5.field_h = new byte[var5.field_i * var5.field_a];
                var5.field_f = new byte[var5.field_a * var5.field_i];
                var9_int = 0;
                L2: while (true) {
                  if (var9_int >= var5.field_a) {
                    var9 = tba.field_f[11];
                    var6 = var9.field_i;
                    var9.field_i = var9.field_i - 5;
                    var7 = var9.field_h;
                    var8 = var9.field_f;
                    var9.field_h = new byte[var9.field_i * var9.field_a];
                    var9.field_f = new byte[var9.field_i * var9.field_a];
                    var10_int = 0;
                    L3: while (true) {
                      if (var10_int >= var9.field_a) {
                        var10 = tba.field_f[15];
                        var6 = var10.field_i;
                        var8 = var10.field_f;
                        var7 = var10.field_h;
                        var10.field_i = var10.field_i - 5;
                        var10.field_f = new byte[var10.field_a * var10.field_i];
                        var10.field_h = new byte[var10.field_i * var10.field_a];
                        var11_int = 0;
                        L4: while (true) {
                          if (var11_int >= var10.field_a) {
                            int incrementValue$12 = param1;
                            param1++;
                            var16_ref.a(incrementValue$12, (byte) 47, param0);
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
                            int incrementValue$13 = param1;
                            param1++;
                            var16_ref.a(incrementValue$13, (byte) 47, param0);
                            ng.field_f = jpa.b(param2, "", "achievements");
                            ds.field_g = jpa.a(oma.field_G, "basic", "unachieved");
                            aa.field_a = jpa.a(param2, "", "map_routedot");
                            pha.field_Bb = jpa.a(param2, "", "map_coin_gold");
                            ira.field_t = jpa.a(param2, "", "map_coin_silver");
                            qh.field_q = jpa.a(param2, "", "map_coin_bronze");
                            tl.field_n = jpa.a(param2, "", "map_locationdot");
                            int incrementValue$14 = param1;
                            param1++;
                            var16_ref.a(incrementValue$14, (byte) 47, param0);
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
                            int incrementValue$15 = param1;
                            param1++;
                            var16_ref.a(incrementValue$15, (byte) 47, param0);
                            hoa.field_l = jpa.a(param2, "", "silhoutte");
                            baa.field_g = jpa.a(param2, "", "slab_small1");
                            op.field_O = jpa.a(param2, "", "slab_small2");
                            ifa.field_q = jpa.a(param2, "", "slab_small3");
                            ob.field_n = jpa.a(param2, "", "slab_small4");
                            vua.field_y = jpa.a(param2, "", "slab_medium");
                            int incrementValue$16 = param1;
                            param1++;
                            var16_ref.a(incrementValue$16, (byte) 47, param0);
                            up.field_e = new jpa[7];
                            up.field_e[0] = jpa.a(param2, "", "reward_coin");
                            up.field_e[1] = jpa.a(param2, "", "reward_moneybag");
                            up.field_e[2] = jpa.a(param2, "", "reward_idol");
                            ena.field_l = jpa.a(param2, "", "endround_flag");
                            aw.field_F = jpa.a(param2, "", "endround_divider_line");
                            rp.field_f = jpa.a(param2, "", "endround_smoke_trail");
                            qka.field_o = jpa.b(param2, "", "endround_stage_lines");
                            ko.field_j = jpa.a(param2, "", "podium");
                            int incrementValue$17 = param1;
                            param1++;
                            var16_ref.a(incrementValue$17, (byte) 47, param0);
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
                            gv.field_s = jpa.a(param2, "", "medal_bronze");
                            var11 = jpa.b(param2, "", "mugshots");
                            var12 = jpa.b(param2, "", "hud_icons");
                            qk.field_u = var12[1];
                            mp.field_d = var12[1];
                            nk.field_k = new jpa[13];
                            var13 = 0;
                            var14 = 0;
                            L5: while (true) {
                              if (var14 >= 13) {
                                hka.field_c = var11[var13];
                                int incrementValue$18 = param1;
                                param1++;
                                var16_ref.a(incrementValue$18, (byte) 47, param0);
                                iu discarded$19 = nia.a(oma.field_G, "basic", "orbcoin", -121);
                                ff.field_p = nia.a(param2, "", "lobby_game_logo", -119);
                                bp.field_m = uka.a(param2, "", 5, "lobby_icons");
                                break L0;
                              } else {
                                nk.field_k[var13] = var11[var13];
                                var13++;
                                var14++;
                                continue L5;
                              }
                            }
                          } else {
                            var12_int = 0;
                            L6: while (true) {
                              if (var12_int >= var10.field_i) {
                                var11_int++;
                                continue L4;
                              } else {
                                var10.field_f[var12_int - -(var10.field_i * var11_int)] = var8[var6 * var11_int + var12_int];
                                var10.field_h[var12_int - -(var10.field_i * var11_int)] = var7[var11_int * var6 + var12_int];
                                var12_int++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var11_int = 0;
                        L7: while (true) {
                          if (var11_int >= var9.field_i) {
                            var10_int++;
                            continue L3;
                          } else {
                            var9.field_f[var9.field_i * var10_int + var11_int] = var8[var11_int + var6 * var10_int];
                            var9.field_h[var10_int * var9.field_i + var11_int] = var7[var11_int + var10_int * var6];
                            var11_int++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var10_int = 0;
                    L8: while (true) {
                      if (var10_int >= var5.field_i) {
                        var9_int++;
                        continue L2;
                      } else {
                        var5.field_f[var10_int - -(var5.field_i * var9_int)] = var8[var6 * var9_int + var10_int];
                        var5.field_h[var9_int * var5.field_i + var10_int] = var7[var9_int * var6 + var10_int];
                        var10_int++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                wca.field_l[var5_int] = 12;
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("fp.B(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param1).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + 17 + 41);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        apa var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        apa stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        String stackOut_23_0 = null;
        String stackOut_22_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        apa stackOut_44_0 = null;
        apa stackOut_43_0 = null;
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
              if (mq.field_a != 2) {
                break L2;
              } else {
                var3_long = bva.b((byte) -107) + -ln.field_H;
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (~mba.field_g.length >= ~var3) {
                break L0;
              } else {
                L4: {
                  var4 = bla.field_H[var3];
                  if (var4 >= 0) {
                    if (~sa.field_r.field_h == ~var4) {
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
                    if (var2 != 1) {
                      break L5;
                    } else {
                      L6: {
                        if (~cia.field_a.length > ~pm.field_d.length) {
                          stackOut_18_0 = pm.field_d.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L6;
                        } else {
                          stackOut_17_0 = cia.field_a.length;
                          stackIn_19_0 = stackOut_17_0;
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
                              if (cia.field_a.length + -6 + (var3 - var7) >= 0) {
                                stackOut_23_0 = cia.field_a[-var7 + (var3 + -6 - -cia.field_a.length)];
                                stackIn_24_0 = stackOut_23_0;
                                break L8;
                              } else {
                                stackOut_22_0 = "";
                                stackIn_24_0 = stackOut_22_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_24_0;
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (~ea.field_k.length >= ~wr.field_o.length) {
                          stackOut_27_0 = wr.field_o.length;
                          stackIn_28_0 = stackOut_27_0;
                          break L9;
                        } else {
                          stackOut_26_0 = ea.field_k.length;
                          stackIn_28_0 = stackOut_26_0;
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
                            if (~wr.field_o.length < ~(-7 + (var3 - var7))) {
                              stackOut_32_0 = wr.field_o[-7 + var3 - var7];
                              stackIn_33_0 = stackOut_32_0;
                              break L10;
                            } else {
                              stackOut_31_0 = "";
                              stackIn_33_0 = stackOut_31_0;
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
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackOut_37_0 = -116;
                  stackOut_37_1 = (String) var6;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  if (var4 < 0) {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = (String) (Object) stackIn_39_1;
                    stackOut_39_2 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    break L12;
                  } else {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = (String) (Object) stackIn_38_1;
                    stackOut_38_2 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    stackIn_40_2 = stackOut_38_2;
                    break L12;
                  }
                }
                L13: {
                  var7 = ro.a((byte) stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0);
                  var8 = ega.field_c - (var7 >> 1);
                  if (0 <= var4) {
                    L14: {
                      if (var4 == sa.field_r.field_h) {
                        stackOut_44_0 = mpa.field_V;
                        stackIn_45_0 = stackOut_44_0;
                        break L14;
                      } else {
                        stackOut_43_0 = jaa.field_b;
                        stackIn_45_0 = stackOut_43_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_45_0;
                      var1_int = var1_int + mha.field_C;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a((byte) 57, var7 + (nja.field_L << 1), var1_int, -nja.field_L + var8, nt.field_d + (pqa.field_p << 1));
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
                  if (var4 >= 0) {
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
          throw tba.a((Throwable) (Object) var1, "fp.C(" + param0 + 41);
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

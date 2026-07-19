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
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        iu discarded$19 = null;
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
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        byte stackOut_32_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var16 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var16_ref = (sra) ((Object) dma.field_l);
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
            incrementValue$10 = param1;
            param1++;
            var16_ref.a(incrementValue$10, (byte) 47, param0);
            lm.field_p = new jpa[6];
            lm.field_p[0] = jpa.a(param2, "", "menu_button_sml");
            lm.field_p[1] = jpa.a(param2, "", "menu_button_mid");
            lm.field_p[2] = jpa.a(param2, "", "menu_button_lrg");
            lm.field_p[3] = jpa.a(param2, "", "menu_button_xlrg");
            lm.field_p[4] = jpa.a(param2, "", "button_main1");
            lm.field_p[5] = jpa.a(param2, "", "button_main2");
            incrementValue$11 = param1;
            param1++;
            var16_ref.a(incrementValue$11, (byte) 47, param0);
            dna.field_F = jpa.a(param2, "", "bg_slab");
            bp.field_p = jpa.b(param2, "", "inset_frame");
            tba.field_f = jpa.b(param2, "", "keys");
            wca.field_l = new int[tba.field_f.length];
            var5_int = 0;
            L1: while (true) {
              L2: {
                if (wca.field_l.length <= var5_int) {
                  break L2;
                } else {
                  wca.field_l[var5_int] = 12;
                  var5_int++;
                  if (var15 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = tba.field_f[9];
              var6 = var5.field_i;
              var5.field_i = var5.field_i - 9;
              var7 = var5.field_h;
              var8 = var5.field_f;
              var5.field_h = new byte[var5.field_i * var5.field_a];
              var5.field_f = new byte[var5.field_a * var5.field_i];
              var9_int = 0;
              L3: while (true) {
                L4: {
                  if (var9_int >= var5.field_a) {
                    break L4;
                  } else {
                    var10_int = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var10_int >= var5.field_i) {
                            break L7;
                          } else {
                            var5.field_f[var10_int - -(var5.field_i * var9_int)] = var8[var6 * var9_int + var10_int];
                            var5.field_h[var9_int * var5.field_i + var10_int] = var7[var9_int * var6 + var10_int];
                            var10_int++;
                            if (var15 != 0) {
                              break L6;
                            } else {
                              if (var15 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var9_int++;
                        break L6;
                      }
                      if (var15 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var9 = tba.field_f[11];
                var6 = var9.field_i;
                var9.field_i = var9.field_i - 5;
                var7 = var9.field_h;
                var8 = var9.field_f;
                var9.field_h = new byte[var9.field_i * var9.field_a];
                var9.field_f = new byte[var9.field_i * var9.field_a];
                var10_int = 0;
                L8: while (true) {
                  L9: {
                    if (var10_int >= var9.field_a) {
                      break L9;
                    } else {
                      var11_int = 0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (var11_int >= var9.field_i) {
                              break L12;
                            } else {
                              var9.field_f[var9.field_i * var10_int + var11_int] = var8[var11_int + var6 * var10_int];
                              var9.field_h[var10_int * var9.field_i + var11_int] = var7[var11_int + var10_int * var6];
                              var11_int++;
                              if (var15 != 0) {
                                break L11;
                              } else {
                                if (var15 == 0) {
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          var10_int++;
                          break L11;
                        }
                        if (var15 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  var10 = tba.field_f[15];
                  var6 = var10.field_i;
                  var8 = var10.field_f;
                  var7 = var10.field_h;
                  var10.field_i = var10.field_i - 5;
                  var10.field_f = new byte[var10.field_a * var10.field_i];
                  var10.field_h = new byte[var10.field_i * var10.field_a];
                  var11_int = 0;
                  L13: while (true) {
                    L14: {
                      L15: {
                        if (var11_int >= var10.field_a) {
                          break L15;
                        } else {
                          stackOut_24_0 = 0;
                          stackIn_33_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (var15 != 0) {
                            break L14;
                          } else {
                            var12_int = stackIn_25_0;
                            L16: while (true) {
                              L17: {
                                L18: {
                                  if (var12_int >= var10.field_i) {
                                    break L18;
                                  } else {
                                    var10.field_f[var12_int - -(var10.field_i * var11_int)] = var8[var6 * var11_int + var12_int];
                                    var10.field_h[var12_int - -(var10.field_i * var11_int)] = var7[var11_int * var6 + var12_int];
                                    var12_int++;
                                    if (var15 != 0) {
                                      break L17;
                                    } else {
                                      if (var15 == 0) {
                                        continue L16;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                var11_int++;
                                break L17;
                              }
                              if (var15 == 0) {
                                continue L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      incrementValue$12 = param1;
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
                      incrementValue$13 = param1;
                      param1++;
                      var16_ref.a(incrementValue$13, (byte) 47, param0);
                      ng.field_f = jpa.b(param2, "", "achievements");
                      ds.field_g = jpa.a(oma.field_G, "basic", "unachieved");
                      aa.field_a = jpa.a(param2, "", "map_routedot");
                      pha.field_Bb = jpa.a(param2, "", "map_coin_gold");
                      ira.field_t = jpa.a(param2, "", "map_coin_silver");
                      qh.field_q = jpa.a(param2, "", "map_coin_bronze");
                      tl.field_n = jpa.a(param2, "", "map_locationdot");
                      incrementValue$14 = param1;
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
                      incrementValue$15 = param1;
                      param1++;
                      var16_ref.a(incrementValue$15, (byte) 47, param0);
                      hoa.field_l = jpa.a(param2, "", "silhoutte");
                      baa.field_g = jpa.a(param2, "", "slab_small1");
                      op.field_O = jpa.a(param2, "", "slab_small2");
                      ifa.field_q = jpa.a(param2, "", "slab_small3");
                      ob.field_n = jpa.a(param2, "", "slab_small4");
                      vua.field_y = jpa.a(param2, "", "slab_medium");
                      incrementValue$16 = param1;
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
                      incrementValue$17 = param1;
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
                      stackOut_32_0 = param3;
                      stackIn_33_0 = stackOut_32_0;
                      break L14;
                    }
                    if (stackIn_33_0 == 17) {
                      gv.field_s = jpa.a(param2, "", "medal_bronze");
                      var11 = jpa.b(param2, "", "mugshots");
                      var12 = jpa.b(param2, "", "hud_icons");
                      qk.field_u = var12[1];
                      mp.field_d = var12[1];
                      nk.field_k = new jpa[13];
                      var13 = 0;
                      var14 = 0;
                      L19: while (true) {
                        L20: {
                          if (var14 >= 13) {
                            hka.field_c = var11[var13];
                            incrementValue$18 = param1;
                            param1++;
                            var16_ref.a(incrementValue$18, (byte) 47, param0);
                            discarded$19 = nia.a(oma.field_G, "basic", "orbcoin", -121);
                            ff.field_p = nia.a(param2, "", "lobby_game_logo", -119);
                            bp.field_m = uka.a(param2, "", 5, "lobby_icons");
                            break L20;
                          } else {
                            nk.field_k[var13] = var11[var13];
                            var13++;
                            var14++;
                            if (var15 != 0) {
                              break L20;
                            } else {
                              continue L19;
                            }
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var4);
            stackOut_42_1 = new StringBuilder().append("fp.B(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L21;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L21;
            }
          }
          L22: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L22;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L22;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int stackIn_20_0 = 0;
        String stackIn_25_0 = null;
        int stackIn_29_0 = 0;
        String stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        apa stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_40_0 = 0;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        apa stackOut_45_0 = null;
        apa stackOut_44_0 = null;
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
              L4: {
                if (mba.field_g.length <= var3) {
                  break L4;
                } else {
                  var4 = bla.field_H[var3];
                  if (var10 != 0) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        if (-1 >= (var4 ^ -1)) {
                          break L6;
                        } else {
                          var5 = mn.field_k;
                          if (var10 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (sa.field_r.field_h == var4) {
                          break L7;
                        } else {
                          var5 = qv.field_m;
                          if (var10 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var5 = ct.field_a;
                      break L5;
                    }
                    L8: {
                      var6 = mba.field_g[var3];
                      if (2 != mq.field_a) {
                        break L8;
                      } else {
                        if ((var2 ^ -1) != -2) {
                          break L8;
                        } else {
                          L9: {
                            if (cia.field_a.length < pm.field_d.length) {
                              stackOut_19_0 = pm.field_d.length;
                              stackIn_20_0 = stackOut_19_0;
                              break L9;
                            } else {
                              stackOut_18_0 = cia.field_a.length;
                              stackIn_20_0 = stackOut_18_0;
                              break L9;
                            }
                          }
                          L10: {
                            var7 = stackIn_20_0;
                            if (var3 < 6) {
                              break L10;
                            } else {
                              if (var7 + 6 <= var3) {
                                break L10;
                              } else {
                                L11: {
                                  if (-1 >= (cia.field_a.length + -6 + (var3 - var7) ^ -1)) {
                                    stackOut_24_0 = cia.field_a[-var7 + (var3 + -6 - -cia.field_a.length)];
                                    stackIn_25_0 = stackOut_24_0;
                                    break L11;
                                  } else {
                                    stackOut_23_0 = "";
                                    stackIn_25_0 = stackOut_23_0;
                                    break L11;
                                  }
                                }
                                var6 = stackIn_25_0;
                                break L10;
                              }
                            }
                          }
                          L12: {
                            if (ea.field_k.length <= wr.field_o.length) {
                              stackOut_28_0 = wr.field_o.length;
                              stackIn_29_0 = stackOut_28_0;
                              break L12;
                            } else {
                              stackOut_27_0 = ea.field_k.length;
                              stackIn_29_0 = stackOut_27_0;
                              break L12;
                            }
                          }
                          var8 = stackIn_29_0;
                          if (var3 < 7 - -var7) {
                            break L8;
                          } else {
                            if (7 + var7 + var8 <= var3) {
                              break L8;
                            } else {
                              L13: {
                                if (wr.field_o.length > -7 + (var3 - var7)) {
                                  stackOut_33_0 = wr.field_o[-7 + var3 - var7];
                                  stackIn_34_0 = stackOut_33_0;
                                  break L13;
                                } else {
                                  stackOut_32_0 = "";
                                  stackIn_34_0 = stackOut_32_0;
                                  break L13;
                                }
                              }
                              var6 = stackIn_34_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if ((var4 ^ -1) == 1) {
                        var6 = Integer.toString(var2);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      stackOut_38_0 = -116;
                      stackOut_38_1 = (String) (var6);
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      if ((var4 ^ -1) > -1) {
                        stackOut_40_0 = stackIn_40_0;
                        stackOut_40_1 = (String) ((Object) stackIn_40_1);
                        stackOut_40_2 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        break L15;
                      } else {
                        stackOut_39_0 = stackIn_39_0;
                        stackOut_39_1 = (String) ((Object) stackIn_39_1);
                        stackOut_39_2 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_41_2 = stackOut_39_2;
                        break L15;
                      }
                    }
                    L16: {
                      var7 = ro.a((byte) stackIn_41_0, stackIn_41_1, stackIn_41_2 != 0);
                      var8 = ega.field_c - (var7 >> -933934047);
                      if (0 <= var4) {
                        L17: {
                          if (var4 == sa.field_r.field_h) {
                            stackOut_45_0 = mpa.field_V;
                            stackIn_46_0 = stackOut_45_0;
                            break L17;
                          } else {
                            stackOut_44_0 = jaa.field_b;
                            stackIn_46_0 = stackOut_44_0;
                            break L17;
                          }
                        }
                        L18: {
                          var9 = stackIn_46_0;
                          var1_int = var1_int + mha.field_C;
                          if (var9 == null) {
                            break L18;
                          } else {
                            var9.a((byte) 57, var7 + (nja.field_L << 1958511713), var1_int, -nja.field_L + var8, nt.field_d + (pqa.field_p << 919639873));
                            break L18;
                          }
                        }
                        var1_int = var1_int + pqa.field_p;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L19: {
                      L20: {
                        if ((var4 ^ -1) <= -1) {
                          break L20;
                        } else {
                          bfa.field_c.c(var6, var8, var1_int + vi.field_a, var5, -1);
                          var1_int = var1_int + f.field_b;
                          if (var10 == 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      qt.field_a.c(var6, var8, qra.field_j + var1_int, var5, -1);
                      var1_int = var1_int + (nt.field_d + pqa.field_p + mha.field_C);
                      break L19;
                    }
                    var3++;
                    continue L3;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "fp.C(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        qh stackIn_5_0 = null;
        qh stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        String[] stackIn_5_4 = null;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        int stackIn_5_8 = 0;
        int stackIn_5_9 = 0;
        int stackIn_5_10 = 0;
        int stackIn_5_11 = 0;
        Object stackIn_5_12 = null;
        boolean[] stackIn_5_13 = null;
        boolean[] stackIn_5_14 = null;
        int stackIn_5_15 = 0;
        qh stackIn_6_0 = null;
        qh stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        String[] stackIn_6_4 = null;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        int stackIn_6_8 = 0;
        int stackIn_6_9 = 0;
        int stackIn_6_10 = 0;
        int stackIn_6_11 = 0;
        Object stackIn_6_12 = null;
        boolean[] stackIn_6_13 = null;
        boolean[] stackIn_6_14 = null;
        int stackIn_6_15 = 0;
        qh stackIn_7_0 = null;
        qh stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        String[] stackIn_7_4 = null;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        int stackIn_7_9 = 0;
        int stackIn_7_10 = 0;
        int stackIn_7_11 = 0;
        Object stackIn_7_12 = null;
        boolean[] stackIn_7_13 = null;
        boolean[] stackIn_7_14 = null;
        int stackIn_7_15 = 0;
        int stackIn_7_16 = 0;
        qh stackIn_10_0 = null;
        qh stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        String[] stackIn_10_4 = null;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        int stackIn_10_9 = 0;
        int stackIn_10_10 = 0;
        int stackIn_10_11 = 0;
        Object stackIn_10_12 = null;
        boolean[] stackIn_10_13 = null;
        boolean[] stackIn_10_14 = null;
        int stackIn_10_15 = 0;
        qh stackIn_11_0 = null;
        qh stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        String[] stackIn_11_4 = null;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        int stackIn_11_9 = 0;
        int stackIn_11_10 = 0;
        int stackIn_11_11 = 0;
        Object stackIn_11_12 = null;
        boolean[] stackIn_11_13 = null;
        boolean[] stackIn_11_14 = null;
        int stackIn_11_15 = 0;
        qh stackIn_12_0 = null;
        qh stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        String[] stackIn_12_4 = null;
        int stackIn_12_5 = 0;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        int stackIn_12_8 = 0;
        int stackIn_12_9 = 0;
        int stackIn_12_10 = 0;
        int stackIn_12_11 = 0;
        Object stackIn_12_12 = null;
        boolean[] stackIn_12_13 = null;
        boolean[] stackIn_12_14 = null;
        int stackIn_12_15 = 0;
        int stackIn_12_16 = 0;
        qh stackOut_9_0 = null;
        qh stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        String[] stackOut_9_4 = null;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        int stackOut_9_9 = 0;
        int stackOut_9_10 = 0;
        int stackOut_9_11 = 0;
        Object stackOut_9_12 = null;
        boolean[] stackOut_9_13 = null;
        boolean[] stackOut_9_14 = null;
        int stackOut_9_15 = 0;
        qh stackOut_11_0 = null;
        qh stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        String[] stackOut_11_4 = null;
        int stackOut_11_5 = 0;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        int stackOut_11_8 = 0;
        int stackOut_11_9 = 0;
        int stackOut_11_10 = 0;
        int stackOut_11_11 = 0;
        Object stackOut_11_12 = null;
        boolean[] stackOut_11_13 = null;
        boolean[] stackOut_11_14 = null;
        int stackOut_11_15 = 0;
        int stackOut_11_16 = 0;
        qh stackOut_10_0 = null;
        qh stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        String[] stackOut_10_4 = null;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_10_8 = 0;
        int stackOut_10_9 = 0;
        int stackOut_10_10 = 0;
        int stackOut_10_11 = 0;
        Object stackOut_10_12 = null;
        boolean[] stackOut_10_13 = null;
        boolean[] stackOut_10_14 = null;
        int stackOut_10_15 = 0;
        int stackOut_10_16 = 0;
        qh stackOut_4_0 = null;
        qh stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        String[] stackOut_4_4 = null;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        int stackOut_4_8 = 0;
        int stackOut_4_9 = 0;
        int stackOut_4_10 = 0;
        int stackOut_4_11 = 0;
        Object stackOut_4_12 = null;
        boolean[] stackOut_4_13 = null;
        boolean[] stackOut_4_14 = null;
        int stackOut_4_15 = 0;
        qh stackOut_6_0 = null;
        qh stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        String[] stackOut_6_4 = null;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        int stackOut_6_9 = 0;
        int stackOut_6_10 = 0;
        int stackOut_6_11 = 0;
        Object stackOut_6_12 = null;
        boolean[] stackOut_6_13 = null;
        boolean[] stackOut_6_14 = null;
        int stackOut_6_15 = 0;
        int stackOut_6_16 = 0;
        qh stackOut_5_0 = null;
        qh stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        String[] stackOut_5_4 = null;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        int stackOut_5_9 = 0;
        int stackOut_5_10 = 0;
        int stackOut_5_11 = 0;
        Object stackOut_5_12 = null;
        boolean[] stackOut_5_13 = null;
        boolean[] stackOut_5_14 = null;
        int stackOut_5_15 = 0;
        int stackOut_5_16 = 0;
        if (dna.field_G) {
          return;
        } else {
          var1 = 71 % ((-30 - param0) / 44);
          if (null != cs.field_c) {
            if (!cs.field_c.g(126)) {
              return;
            } else {
              L0: {
                var2 = aq.a(-5640);
                var3 = jqa.a(2147483647, new Random(), 45);
                stackOut_9_0 = null;
                stackOut_9_1 = null;
                stackOut_9_2 = 0;
                stackOut_9_3 = 0;
                stackOut_9_4 = new String[]{""};
                stackOut_9_5 = 0;
                stackOut_9_6 = 0;
                stackOut_9_7 = var2;
                stackOut_9_8 = -1 + var2;
                stackOut_9_9 = 1;
                stackOut_9_10 = 2;
                stackOut_9_11 = 0;
                stackOut_9_12 = null;
                stackOut_9_13 = new boolean[1];
                stackOut_9_14 = new boolean[1];
                stackOut_9_15 = 0;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                stackIn_11_3 = stackOut_9_3;
                stackIn_11_4 = stackOut_9_4;
                stackIn_11_5 = stackOut_9_5;
                stackIn_11_6 = stackOut_9_6;
                stackIn_11_7 = stackOut_9_7;
                stackIn_11_8 = stackOut_9_8;
                stackIn_11_9 = stackOut_9_9;
                stackIn_11_10 = stackOut_9_10;
                stackIn_11_11 = stackOut_9_11;
                stackIn_11_12 = stackOut_9_12;
                stackIn_11_13 = stackOut_9_13;
                stackIn_11_14 = stackOut_9_14;
                stackIn_11_15 = stackOut_9_15;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                stackIn_10_4 = stackOut_9_4;
                stackIn_10_5 = stackOut_9_5;
                stackIn_10_6 = stackOut_9_6;
                stackIn_10_7 = stackOut_9_7;
                stackIn_10_8 = stackOut_9_8;
                stackIn_10_9 = stackOut_9_9;
                stackIn_10_10 = stackOut_9_10;
                stackIn_10_11 = stackOut_9_11;
                stackIn_10_12 = stackOut_9_12;
                stackIn_10_13 = stackOut_9_13;
                stackIn_10_14 = stackOut_9_14;
                stackIn_10_15 = stackOut_9_15;
                if ((wla.field_ub ^ -1) >= -1) {
                  stackOut_11_0 = null;
                  stackOut_11_1 = null;
                  stackOut_11_2 = stackIn_11_2;
                  stackOut_11_3 = stackIn_11_3;
                  stackOut_11_4 = (String[]) ((Object) stackIn_11_4);
                  stackOut_11_5 = stackIn_11_5;
                  stackOut_11_6 = stackIn_11_6;
                  stackOut_11_7 = stackIn_11_7;
                  stackOut_11_8 = stackIn_11_8;
                  stackOut_11_9 = stackIn_11_9;
                  stackOut_11_10 = stackIn_11_10;
                  stackOut_11_11 = stackIn_11_11;
                  stackOut_11_12 = stackIn_11_12;
                  stackOut_11_13 = (boolean[]) ((Object) stackIn_11_13);
                  stackOut_11_14 = (boolean[]) ((Object) stackIn_11_14);
                  stackOut_11_15 = stackIn_11_15;
                  stackOut_11_16 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  stackIn_12_3 = stackOut_11_3;
                  stackIn_12_4 = stackOut_11_4;
                  stackIn_12_5 = stackOut_11_5;
                  stackIn_12_6 = stackOut_11_6;
                  stackIn_12_7 = stackOut_11_7;
                  stackIn_12_8 = stackOut_11_8;
                  stackIn_12_9 = stackOut_11_9;
                  stackIn_12_10 = stackOut_11_10;
                  stackIn_12_11 = stackOut_11_11;
                  stackIn_12_12 = stackOut_11_12;
                  stackIn_12_13 = stackOut_11_13;
                  stackIn_12_14 = stackOut_11_14;
                  stackIn_12_15 = stackOut_11_15;
                  stackIn_12_16 = stackOut_11_16;
                  break L0;
                } else {
                  stackOut_10_0 = null;
                  stackOut_10_1 = null;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = stackIn_10_3;
                  stackOut_10_4 = (String[]) ((Object) stackIn_10_4);
                  stackOut_10_5 = stackIn_10_5;
                  stackOut_10_6 = stackIn_10_6;
                  stackOut_10_7 = stackIn_10_7;
                  stackOut_10_8 = stackIn_10_8;
                  stackOut_10_9 = stackIn_10_9;
                  stackOut_10_10 = stackIn_10_10;
                  stackOut_10_11 = stackIn_10_11;
                  stackOut_10_12 = stackIn_10_12;
                  stackOut_10_13 = (boolean[]) ((Object) stackIn_10_13);
                  stackOut_10_14 = (boolean[]) ((Object) stackIn_10_14);
                  stackOut_10_15 = stackIn_10_15;
                  stackOut_10_16 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_12_3 = stackOut_10_3;
                  stackIn_12_4 = stackOut_10_4;
                  stackIn_12_5 = stackOut_10_5;
                  stackIn_12_6 = stackOut_10_6;
                  stackIn_12_7 = stackOut_10_7;
                  stackIn_12_8 = stackOut_10_8;
                  stackIn_12_9 = stackOut_10_9;
                  stackIn_12_10 = stackOut_10_10;
                  stackIn_12_11 = stackOut_10_11;
                  stackIn_12_12 = stackOut_10_12;
                  stackIn_12_13 = stackOut_10_13;
                  stackIn_12_14 = stackOut_10_14;
                  stackIn_12_15 = stackOut_10_15;
                  stackIn_12_16 = stackOut_10_16;
                  break L0;
                }
              }
              stackIn_12_14[stackIn_12_15] = stackIn_12_16 != 0;
              cs.field_c = new qh(stackIn_12_2 != 0, stackIn_12_3, stackIn_12_4, stackIn_12_5, stackIn_12_6 != 0, stackIn_12_7, stackIn_12_8, stackIn_12_9, stackIn_12_10, stackIn_12_11, (BitSet[]) ((Object) stackIn_12_12), stackIn_12_13, new qha(var3));
              cs.field_c.k((byte) -25);
              wka.field_d = true;
              return;
            }
          } else {
            L1: {
              var2 = aq.a(-5640);
              var3 = jqa.a(2147483647, new Random(), 45);
              stackOut_4_0 = null;
              stackOut_4_1 = null;
              stackOut_4_2 = 0;
              stackOut_4_3 = 0;
              stackOut_4_4 = new String[]{""};
              stackOut_4_5 = 0;
              stackOut_4_6 = 0;
              stackOut_4_7 = var2;
              stackOut_4_8 = -1 + var2;
              stackOut_4_9 = 1;
              stackOut_4_10 = 2;
              stackOut_4_11 = 0;
              stackOut_4_12 = null;
              stackOut_4_13 = new boolean[1];
              stackOut_4_14 = new boolean[1];
              stackOut_4_15 = 0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_6_3 = stackOut_4_3;
              stackIn_6_4 = stackOut_4_4;
              stackIn_6_5 = stackOut_4_5;
              stackIn_6_6 = stackOut_4_6;
              stackIn_6_7 = stackOut_4_7;
              stackIn_6_8 = stackOut_4_8;
              stackIn_6_9 = stackOut_4_9;
              stackIn_6_10 = stackOut_4_10;
              stackIn_6_11 = stackOut_4_11;
              stackIn_6_12 = stackOut_4_12;
              stackIn_6_13 = stackOut_4_13;
              stackIn_6_14 = stackOut_4_14;
              stackIn_6_15 = stackOut_4_15;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              stackIn_5_5 = stackOut_4_5;
              stackIn_5_6 = stackOut_4_6;
              stackIn_5_7 = stackOut_4_7;
              stackIn_5_8 = stackOut_4_8;
              stackIn_5_9 = stackOut_4_9;
              stackIn_5_10 = stackOut_4_10;
              stackIn_5_11 = stackOut_4_11;
              stackIn_5_12 = stackOut_4_12;
              stackIn_5_13 = stackOut_4_13;
              stackIn_5_14 = stackOut_4_14;
              stackIn_5_15 = stackOut_4_15;
              if ((wla.field_ub ^ -1) >= -1) {
                stackOut_6_0 = null;
                stackOut_6_1 = null;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = (String[]) ((Object) stackIn_6_4);
                stackOut_6_5 = stackIn_6_5;
                stackOut_6_6 = stackIn_6_6;
                stackOut_6_7 = stackIn_6_7;
                stackOut_6_8 = stackIn_6_8;
                stackOut_6_9 = stackIn_6_9;
                stackOut_6_10 = stackIn_6_10;
                stackOut_6_11 = stackIn_6_11;
                stackOut_6_12 = stackIn_6_12;
                stackOut_6_13 = (boolean[]) ((Object) stackIn_6_13);
                stackOut_6_14 = (boolean[]) ((Object) stackIn_6_14);
                stackOut_6_15 = stackIn_6_15;
                stackOut_6_16 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                stackIn_7_6 = stackOut_6_6;
                stackIn_7_7 = stackOut_6_7;
                stackIn_7_8 = stackOut_6_8;
                stackIn_7_9 = stackOut_6_9;
                stackIn_7_10 = stackOut_6_10;
                stackIn_7_11 = stackOut_6_11;
                stackIn_7_12 = stackOut_6_12;
                stackIn_7_13 = stackOut_6_13;
                stackIn_7_14 = stackOut_6_14;
                stackIn_7_15 = stackOut_6_15;
                stackIn_7_16 = stackOut_6_16;
                break L1;
              } else {
                stackOut_5_0 = null;
                stackOut_5_1 = null;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = (String[]) ((Object) stackIn_5_4);
                stackOut_5_5 = stackIn_5_5;
                stackOut_5_6 = stackIn_5_6;
                stackOut_5_7 = stackIn_5_7;
                stackOut_5_8 = stackIn_5_8;
                stackOut_5_9 = stackIn_5_9;
                stackOut_5_10 = stackIn_5_10;
                stackOut_5_11 = stackIn_5_11;
                stackOut_5_12 = stackIn_5_12;
                stackOut_5_13 = (boolean[]) ((Object) stackIn_5_13);
                stackOut_5_14 = (boolean[]) ((Object) stackIn_5_14);
                stackOut_5_15 = stackIn_5_15;
                stackOut_5_16 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                stackIn_7_6 = stackOut_5_6;
                stackIn_7_7 = stackOut_5_7;
                stackIn_7_8 = stackOut_5_8;
                stackIn_7_9 = stackOut_5_9;
                stackIn_7_10 = stackOut_5_10;
                stackIn_7_11 = stackOut_5_11;
                stackIn_7_12 = stackOut_5_12;
                stackIn_7_13 = stackOut_5_13;
                stackIn_7_14 = stackOut_5_14;
                stackIn_7_15 = stackOut_5_15;
                stackIn_7_16 = stackOut_5_16;
                break L1;
              }
            }
            stackIn_7_14[stackIn_7_15] = stackIn_7_16 != 0;
            cs.field_c = new qh(stackIn_7_2 != 0, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6 != 0, stackIn_7_7, stackIn_7_8, stackIn_7_9, stackIn_7_10, stackIn_7_11, (BitSet[]) ((Object) stackIn_7_12), stackIn_7_13, new qha(var3));
            cs.field_c.k((byte) -25);
            wka.field_d = true;
            return;
          }
        }
    }

    static {
        field_a = 49;
        field_b = "Freezethrower";
        field_c = new it();
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ja extends ff {
    private int field_g;
    static Boolean field_f;
    static dl[] field_h;

    final static void d(byte param0) {
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        jg var4_ref_jg = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        jg var17 = null;
        int var18 = 0;
        var19 = CrazyCrystals.field_B;
        try {
          L0: {
            ai.field_j = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = rn.field_o.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = ai.field_j[9] >> 444637768;
                  var4 = ai.field_j[10] >> -79625880;
                  var5 = ai.field_j[11] >> -712023160;
                  var6 = sn.field_c << -1780300252;
                  var7 = 0;
                  var8 = rl.b(var6, (byte) -23) >> 1666887016;
                  var9 = tm.a(var6, 500) >> -2013514200;
                  if (qh.field_i == -1) {
                    break L2;
                  } else {
                    if (0 == (bm.field_h ^ -1)) {
                      break L2;
                    } else {
                      var7 = qh.field_i + -320;
                      var9 = -128;
                      var8 = -bm.field_h + 240;
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var7 * var7 - (-(var8 * var8) + -(var9 * var9))));
                var7 = (int)((double)var7 * var10);
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var12 = var7 - var3;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var12 * var12 - -(var13 * var13) - -(var14 * var14)));
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                if (param0 == -67) {
                  var15 = 0;
                  L3: while (true) {
                    if (var15 >= rn.field_o.length) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var16 = 0;
                      var17_int = 1;
                      L4: while (true) {
                        if (rn.field_o.length <= var17_int) {
                          var21[var16] = -2147483648;
                          var17 = rn.field_o[var16];
                          vh.a(var16, 10718);
                          var18 = 0;
                          L5: while (true) {
                            if (-4 >= (var18 ^ -1)) {
                              wl.a(ai.field_j, var17, 9, false, false, kf.field_a, true);
                              tg.a(var9, var7, var12, -9206, var14, var8, var17, var13);
                              var15++;
                              continue L3;
                            } else {
                              kf.field_a[var18] = kf.field_a[var18] + je.field_d[var15][var18];
                              var18++;
                              continue L5;
                            }
                          }
                        } else {
                          if (var21[var17_int] > var21[var16]) {
                            var16 = var17_int;
                            var17_int++;
                            continue L4;
                          } else {
                            var17_int++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var4_ref_jg = rn.field_o[var3];
                var4_ref_jg.b(32767);
                vh.a(var3, 10718);
                var5 = var4_ref_jg.field_j + var4_ref_jg.field_x >> 224283297;
                var6 = var4_ref_jg.field_E + var4_ref_jg.field_C >> 1045471969;
                var7 = var4_ref_jg.field_p - -var4_ref_jg.field_e >> -98325791;
                var8 = ai.field_j[9] >> -397311998;
                var9 = ai.field_j[10] >> 450539682;
                var10_int = ai.field_j[11] >> -1115873598;
                var11 = kf.field_a[5] * var10_int + var8 * kf.field_a[3] - -(var9 * kf.field_a[4]) >> -1591669362;
                var12 = var9 * kf.field_a[7] + (var8 * kf.field_a[6] - -(var10_int * kf.field_a[8])) >> 1119006094;
                var13 = kf.field_a[10] * var9 + (var8 * kf.field_a[9] + var10_int * kf.field_a[11]) >> -330648594;
                var2[var3] = var13 * var7 + (var11 * var5 - -(var12 * var6)) >> -1278136336;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "ja.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(char param0, byte param1) {
        int var2;
        int stackIn_11_0 = 0;
        L0: {
          L1: {
            L2: {
              var2 = 32 % ((-73 - param1) / 42);
              if (param0 < 48) {
                break L2;
              } else {
                if (param0 <= 57) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 65) {
                break L3;
              } else {
                if (param0 <= 90) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (97 > param0) {
                break L4;
              } else {
                if (122 < param0) {
                  break L4;
                } else {
                  break L1;
                }
              }
            }
            stackIn_11_0 = 0;
            break L0;
          }
          stackIn_11_0 = 1;
          break L0;
        }
        return stackIn_11_0 != 0;
    }

    final static void a(vc param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            tn.e((byte) -128);
            if (param5 != -17213) {
                field_h = (dl[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ja.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(int param0) {
        dl stackIn_7_0 = null;
        ef stackIn_19_0 = null;
        ef stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int var2;
        dl var3;
        int var4;
        int var5;
        ln var6;
        int var7;
        dl var8;
        kk var9;
        L0: {
          var7 = CrazyCrystals.field_B;
          this.a(7.5, true);
          if ((jj.field_b ^ -1) <= -1) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ma.field_n.length) {
                var2 = 0;
                L2: while (true) {
                  if (bp.field_b.size() <= var2) {
                    break L0;
                  } else {
                    var9 = (kk) (bp.field_b.elementAt(var2));
                    var9.a((byte) 35);
                    var2++;
                    continue L2;
                  }
                }
              } else {
                L3: {
                  if (q.field_a[ma.field_n[var2]].field_h) {
                    stackIn_7_0 = jd.field_A;
                    break L3;
                  } else {
                    stackIn_7_0 = vj.field_a[11][this.field_g >> -755314590];
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_7_0;
                  var3 = var8;
                  var4 = ek.field_f[ma.field_n[var2]];
                  var8.c(-37 - -(15 * m.field_l[var2]), -37 + (240 + jj.field_b) + 0 + -24, var4);
                  if (-1 == (q.field_a[ma.field_n[var2]].field_i ^ -1)) {
                    break L4;
                  } else {
                    go.field_l.b(Integer.toString(q.field_a[ma.field_n[var2]].field_i), 15 * (m.field_l[var2] + 9) + -37, 460 + (0 + jj.field_b - 255), var4, -1);
                    break L4;
                  }
                }
                L5: {
                  if (0 != pd.field_g[var2]) {
                    go.field_l.b(Integer.toString(pd.field_g[var2]), -37 + (m.field_l[var2] + 9) * 15, -255 + (0 - -jj.field_b) + 480, 16760896, -1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (!vh.field_a) {
                  var5 = ib.field_l[var2];
                  L6: while (true) {
                    if (r.field_i[var2] > var5) {
                      L7: {
                        var6 = (ln) (vm.field_j[var2].elementAt(var5));
                        an.field_q.a(var6.field_a, -37 - -(m.field_l[var2] * 15), 252 + (jj.field_b - 255) + 15 * (var5 + fo.field_m[var2]), var4, -1);
                        stackIn_19_0 = an.field_q;

                        if (-1 == (var6.field_e ^ -1)) {
                          stackIn_20_0 = (ef) ((Object) stackIn_19_0);
                          stackIn_20_1 = "<times>2";
                          break L7;
                        } else {
                          stackIn_20_0 = (ef) ((Object) stackIn_19_0);
                          stackIn_20_1 = Integer.toString(var6.field_e);
                          break L7;
                        }
                      }
                      ((ef) (Object) stackIn_20_0).b(stackIn_20_1, 135 + (15 * m.field_l[var2] + -37), -15 + (jj.field_b + (fo.field_m[var2] - -var5) * 15 + 12), 16760896, -1);
                      var5++;
                      continue L6;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 == -1771219320) {
            break L8;
          } else {
            field_f = (Boolean) null;
            break L8;
          }
        }
    }

    final static void a(int param0, f[][] param1, int param2, boolean param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var5_int = param0 - -1;
            L1: while (true) {
              if (var5_int >= -1 + -param0 + param1.length) {
                L2: {
                  if (param4 == 1) {
                    break L2;
                  } else {
                    field_f = (Boolean) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var6 = 1 + param2;
                L3: while (true) {
                  if (var6 >= -1 + -param2 + param1[0].length) {
                    var5_int++;
                    continue L1;
                  } else {
                    L4: {
                      if (param1[var5_int][var6] instanceof c) {
                        na.a(var6, param3, param1, var5_int, param4 ^ 76);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ja.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 27348) {
            field_h = (dl[]) null;
        }
        field_h = null;
    }

    ja() {
        int incrementValue$0 = 0;
        String[] var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        L0: {
          this.field_g = 0;
          bp.field_b = new Vector();
          tb.field_d.a(wc.field_q, 100, 128 * qd.field_r, 8192);
          var2 = 31;
          var3 = 11;
          if (-2 != (ul.field_g ^ -1)) {
            if (ul.field_g != 2) {
              if (ul.field_g != 3) {
                var1 = new String[]{"      @   @@@ @ @ @@@ @        ", "      @   @   @ @ @   @        ", "      @   @@  @ @ @@  @        ", "      @   @    @  @   @        ", "      @@@ @@@  @  @@@ @@@      ", "                               ", "@@@ @@@ @ @ @@@ @   @@@ @@@ @@@", "@   @ @ @@@ @ @ @   @    @  @  ", "@   @ @ @ @ @@@ @   @@   @  @@ ", "@   @ @ @ @ @   @   @    @  @  ", "@@@ @@@ @ @ @   @@@ @@@  @  @@@"};
                break L0;
              } else {
                var1 = new String[]{"     @@@ @@@ @ @    @@  @@@    ", "     @    @  @@@    @ @ @ @    ", "     @@@  @  @ @    @ @ @ @    ", "     @    @  @ @    @ @ @ @    ", "     @   @@@ @ @    @@  @@@    ", "                               ", "             @                 ", "            @                  ", "      @  @ @@@ @ @ @@@ @       ", "      @@ @  @  @ @ @   @       ", "      @ @@  @  @ @ @@@ @       ", "      @  @  @  @ @ @   @       ", "      @  @ @@@  @  @@@ @@@     "};
                var3 = 13;
                break L0;
              }
            } else {
              var1 = new String[]{"   @  @ @@@ @ @ @@@  @  @ @    ", "   @@ @  @  @ @ @   @ @ @ @    ", "   @ @@  @  @ @ @@  @@@ @ @    ", "   @  @  @   @  @   @ @ @ @    ", "   @  @ @@@  @  @@@ @ @ @@@    ", "                            @  ", " @@@ @@@ @@@ @ @ @@@ @  @ @@@  ", "  @  @   @ @ @@@  @  @@ @ @    ", "  @  @@  @@  @ @  @  @ @@ @@   ", "  @  @   @ @ @ @  @  @  @ @    ", "  @  @@@ @ @ @ @ @@@ @  @ @@@  "};
              break L0;
            }
          } else {
            var1 = new String[]{"      @   @@@ @ @ @@@ @        ", "      @   @   @ @ @   @        ", "      @   @@  @ @ @@  @        ", "      @   @    @  @   @        ", "      @@@ @@@  @  @@@ @@@      ", "                               ", "  @@@ @@@ @@@ @  @ @@  @@@ @@@ ", "  @ @ @   @   @@ @ @ @ @    @  ", "  @@  @@  @@  @ @@ @ @ @@   @  ", "  @ @ @   @   @  @ @ @ @    @  ", "  @@@ @@@ @@@ @  @ @@  @@@  @  "};
            break L0;
          }
        }
        kk.field_a = dp.a(37, -27919, var3 + 2, var1, 37 - var2 >> 695077345, 35);
        var4 = 0;
        var5 = 0;
        L1: while (true) {
          if (var5 >= 3) {
            m.field_l = new int[var4];
            pd.field_g = new int[var4];
            ma.field_n = new int[var4];
            var4 = 0;
            var5 = 0;
            L2: while (true) {
              if (-4 >= (var5 ^ -1)) {
                var5 = (-(11 * var4) + 39) / 2;
                var6 = 0;
                L3: while (true) {
                  if (var4 <= var6) {
                    L4: {
                      if (vh.field_a) {
                        break L4;
                      } else {
                        this.e(15);
                        break L4;
                      }
                    }
                    var8 = 0;
                    var6 = var8;
                    L5: while (true) {
                      if (var8 >= var4) {
                        jj.field_b = (int)Math.floor(-172.5);
                        this.field_c = (l) ((Object) new ek());
                        return;
                      } else {
                        kk.field_a[15][m.field_l[var8]] = aj.field_s;
                        kk.field_a[15][m.field_l[var8] - -1] = aj.field_s;
                        kk.field_a[15][2 + m.field_l[var8]] = aj.field_s;
                        kk.field_a[16][m.field_l[var8]] = aj.field_s;
                        kk.field_a[16][m.field_l[var8] - -1] = aj.field_s;
                        kk.field_a[16][m.field_l[var8] + 2] = aj.field_s;
                        kk.field_a[17][m.field_l[var8]] = aj.field_s;
                        kk.field_a[17][1 + m.field_l[var8]] = aj.field_s;
                        kk.field_a[17][2 + m.field_l[var8]] = aj.field_s;
                        var8++;
                        continue L5;
                      }
                    }
                  } else {
                    m.field_l[var6] = var5 - -(var6 * 11);
                    var6++;
                    continue L3;
                  }
                }
              } else {
                if (q.field_a[var5].field_b) {
                  incrementValue$0 = var4;
                  var4++;
                  ma.field_n[incrementValue$0] = var5;
                  var5++;
                  continue L2;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          } else {
            if (q.field_a[var5].field_b) {
              var4++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0) {
        super.a(param0 ^ 0);
        if (param0 != -1) {
            this.field_g = 31;
        }
        kj.a((byte) 37);
    }

    private final void e(int param0) {
        ln[] array$0 = null;
        ln[] stackIn_14_0;
        ln[] stackIn_14_1;
        int stackIn_14_2;
        ba stackIn_14_3;
        ba stackIn_14_4;
        ln[] stackIn_15_0 = null;
        ln[] stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        ba stackIn_15_3 = null;
        ba stackIn_15_4 = null;
        String stackIn_15_5 = null;
        int stackIn_17_2;
        fn stackIn_17_3;
        fn stackIn_17_4;
        int stackIn_18_2 = 0;
        fn stackIn_18_3 = null;
        fn stackIn_18_4 = null;
        String stackIn_18_5 = null;
        int stackIn_20_2;
        fh stackIn_20_3;
        fh stackIn_20_4;
        int stackIn_21_2;
        fh stackIn_21_3;
        fh stackIn_21_4;
        String stackIn_21_5;
        int var2;
        int var3;
        int var4_int;
        ln[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = CrazyCrystals.field_B;
        var2 = 0;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if ((var4_int ^ -1) <= -4) {
            L1: {
              if (param0 == 15) {
                break L1;
              } else {
                field_h = (dl[]) null;
                break L1;
              }
            }
            L2: {
              array$0 = new ln[8];
              stackIn_14_0 = (ln[]) (array$0);

              stackIn_14_1 = (ln[]) (array$0);

              stackIn_14_2 = 3;

              stackIn_14_3 = null;

              stackIn_14_4 = null;

              if (-2 == (var2 ^ -1)) {
                stackIn_15_0 = (ln[]) ((Object) stackIn_14_0);
                stackIn_15_1 = (ln[]) ((Object) stackIn_14_1);
                stackIn_15_2 = stackIn_14_2;
                stackIn_15_3 = null;
                stackIn_15_4 = null;
                stackIn_15_5 = og.field_y;
                break L2;
              } else {
                stackIn_15_0 = (ln[]) ((Object) stackIn_14_0);
                stackIn_15_1 = (ln[]) ((Object) stackIn_14_1);
                stackIn_15_2 = stackIn_14_2;
                stackIn_15_3 = null;
                stackIn_15_4 = null;
                stackIn_15_5 = ra.field_a;
                break L2;
              }
            }
            L3: {
              stackIn_15_1[stackIn_15_2] = (ln) ((Object) new ba(stackIn_15_5, 50, var2, var3));




              stackIn_17_2 = 4;

              stackIn_17_3 = null;

              stackIn_17_4 = null;

              if (var2 != 1) {
                stackIn_15_0 = (ln[]) ((Object) stackIn_15_0);
                stackIn_15_0 = (ln[]) ((Object) stackIn_15_0);
                stackIn_18_2 = stackIn_17_2;
                stackIn_18_3 = null;
                stackIn_18_4 = null;
                stackIn_18_5 = je.field_h;
                break L3;
              } else {
                stackIn_15_0 = (ln[]) ((Object) stackIn_15_0);
                stackIn_15_0 = (ln[]) ((Object) stackIn_15_0);
                stackIn_18_2 = stackIn_17_2;
                stackIn_18_3 = null;
                stackIn_18_4 = null;
                stackIn_18_5 = og.field_u;
                break L3;
              }
            }
            L4: {
              stackIn_15_0[stackIn_18_2] = (ln) ((Object) new fn(stackIn_18_5, 50, var2, var3));




              stackIn_20_2 = 5;

              stackIn_20_3 = null;

              stackIn_20_4 = null;

              if ((var2 ^ -1) != -2) {
                stackIn_15_0 = (ln[]) ((Object) stackIn_15_0);
                stackIn_15_0 = (ln[]) ((Object) stackIn_15_0);
                stackIn_21_2 = stackIn_20_2;
                stackIn_21_3 = null;
                stackIn_21_4 = null;
                stackIn_21_5 = tf.field_b;
                break L4;
              } else {
                stackIn_15_0 = (ln[]) ((Object) stackIn_15_0);
                stackIn_15_0 = (ln[]) ((Object) stackIn_15_0);
                stackIn_21_2 = stackIn_20_2;
                stackIn_21_3 = null;
                stackIn_21_4 = null;
                stackIn_21_5 = mn.field_m;
                break L4;
              }
            }
            stackIn_15_0[stackIn_21_2] = (ln) ((Object) new fh(stackIn_21_5, 50, var2, var3));
            stackIn_15_0[6] = (ln) ((Object) new le(jn.field_l, 0, var2, var3));
            stackIn_15_0[7] = (ln) ((Object) new go(kp.field_l, -100, var2, var3));
            var4 = stackIn_15_0;
            vm.field_j = new Vector[ma.field_n.length];
            fo.field_m = new int[ma.field_n.length];
            ib.field_l = new int[ma.field_n.length];
            r.field_i = new int[ma.field_n.length];
            var5 = 0;
            L5: while (true) {
              if (var5 >= vm.field_j.length) {
                return;
              } else {
                vm.field_j[var5] = new Vector();
                var6 = 0;
                L6: while (true) {
                  if (var4.length <= var6) {
                    var5++;
                    continue L5;
                  } else {
                    var7 = var4[var6].a(ma.field_n[var5], (byte) -18);
                    var8 = 0;
                    L7: while (true) {
                      if (var7 <= var8) {
                        var6++;
                        continue L6;
                      } else {
                        vm.field_j[var5].addElement(var4[var6]);
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (q.field_a[var4_int].field_b) {
              var2++;
              var5 = 0;
              var6 = 0;
              L8: while (true) {
                if (2 <= var6) {
                  if (var3 < var5) {
                    var3 = var5;
                    var4_int++;
                    continue L0;
                  } else {
                    var4_int++;
                    continue L0;
                  }
                } else {
                  var5 = var5 + q.field_a[var4_int].field_e[var6];
                  var6++;
                  continue L8;
                }
              }
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final te b(byte param0) {
        int var2;
        kk var3;
        int var4;
        L0: {
          var4 = CrazyCrystals.field_B;
          if (param0 == -39) {
            break L0;
          } else {
            this.a(-27);
            break L0;
          }
        }
        L1: {
          if (jj.field_b < 0) {
            break L1;
          } else {
            this.field_g = this.field_g + 1;
            if (bp.field_c[11] << 1739704098 <= this.field_g) {
              this.field_g = fg.field_j[11] << 194403682;
              break L1;
            } else {
              break L1;
            }
          }
        }
        var2 = 0;
        L2: while (true) {
          if (bp.field_b.size() <= var2) {
            return super.b((byte) -39);
          } else {
            var3 = (kk) (bp.field_b.elementAt(var2));
            if (!var3.b(-49)) {
              bp.field_b.removeElementAt(var2);
              continue L2;
            } else {
              var2++;
              continue L2;
            }
          }
        }
    }

    static {
    }
}

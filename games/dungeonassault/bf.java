/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    private int[] field_n;
    static int field_k;
    private int[] field_j;
    private int[] field_a;
    static qe[] field_f;
    private int[] field_l;
    static ge field_h;
    private int field_g;
    static int field_b;
    static cn field_d;
    static String field_o;
    private int[] field_c;
    private int[] field_i;
    static tf field_m;
    static cn[] field_e;

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        ((bf) this).field_l = new int[200];
        ((bf) this).field_a = new int[200];
        ((bf) this).field_g = 0;
        ((bf) this).field_j = new int[200];
        ((bf) this).field_c = new int[200];
        int var3 = param0 & 16711935;
        int var4 = param0 & 65280;
        ((bf) this).field_i = new int[64];
        for (var5 = 0; 64 > var5; var5++) {
            var6 = (var5 << 2) * var3 & -16711936 | 16711680 & (var5 << 2) * var4;
            ((bf) this).field_i[var5] = var6 >> 8;
        }
        var4 = param0 & 65280;
        var3 = param0 & 16711935;
        ((bf) this).field_n = new int[32];
        for (var5 = 0; var5 < 16; var5++) {
            var6 = var5 * var4 & 1044480 | 267390960 & var3 * var5;
            ((bf) this).field_n[var5] = var6 >> 4;
            ((bf) this).field_n[31 - var5] = var6 >> 4;
        }
    }

    final static void a(String param0, tg param1, int param2, se param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              if (param0.length() <= var7) {
                break L0;
              } else {
                L2: {
                  var8 = param0.charAt(var7);
                  if (var8 != 60) {
                    break L2;
                  } else {
                    var6 = param1.field_k[0] + ((var5_int >> 8) + param3.b(param0.substring(0, var7)));
                    break L2;
                  }
                }
                L3: {
                  if (var6 != -1) {
                    param1.field_k[var7] = var6;
                    break L3;
                  } else {
                    L4: {
                      if (var8 == 32) {
                        var5_int = var5_int + param2;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param1.field_k[var7] = param1.field_k[0] + ((var5_int >> 8) - -param3.b(param0.substring(0, 1 + var7))) - param3.a((char) var8);
                    break L3;
                  }
                }
                L5: {
                  if (62 != var8) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("bf.G(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + 15553 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              gf.a(kd.field_g);
              gf.e(41, 48, 599, 416);
              if (param0) {
                var2_int = oi.b(0, 3);
                var3 = oi.b(0, 3);
                dm.field_d[var2_int].c(41, 48);
                qi.field_f[var3].c(-qi.field_f[0].field_y + 599, 48);
                df.field_c.c(41 - -dm.field_d[var2_int].field_y, 48);
                break L1;
              } else {
                var2_int = 41;
                L2: while (true) {
                  if (var2_int >= 599) {
                    break L1;
                  } else {
                    df.field_c.c(var2_int, 48);
                    var2_int = var2_int + df.field_c.field_E;
                    continue L2;
                  }
                }
              }
            }
            gf.b(kd.field_g);
            c.a(0, 640, 0, (byte) 80);
            c.a(0, 640, 40, (byte) 46);
            vf.a(432, true, 33, -75, 48);
            vf.a(432, true, 599, 113, 48);
            vf.a(32, true, 164, -113, 8);
            vf.a(32, true, 468, 108, 8);
            un.a(41, (byte) 77, 558, 416, true);
            ad.field_e.h(41, 48);
            ad.field_e.j(-ad.field_e.field_d + 599, 48);
            ad.field_e.f(164 + -ad.field_e.field_d, 40 + -ad.field_e.field_b);
            ad.field_e.i(172, -ad.field_e.field_b + 40);
            ad.field_e.f(-ad.field_e.field_d + 468, -ad.field_e.field_b + 40);
            ad.field_e.i(476, -ad.field_e.field_b + 40);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "bf.H(" + param0 + ',' + -128 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        gf.f(param1, param0, param3 >> 1, 0);
        gf.h(param1, param0, param3 >> 1, ((bf) this).field_i[63]);
        var9 = 0;
        if (param2) {
          L0: while (true) {
            if (200 <= var9) {
              gf.g(param1, param0, param3 >> 1, 0, 50);
              gf.a(param1 << 4, param0 << 4, param3 - -2 << 4 >> 1, 192, ((bf) this).field_n);
              gf.a(param1 << 4, param0 << 4, 2 + param3 << 3, 192, ((bf) this).field_n);
              gf.a(param1 << 4, param0 << 4, param3 - -2 << 3, 192, ((bf) this).field_n);
              gf.a(param1 << 4, param0 << 4, 2 + param3 << 3, 192, ((bf) this).field_n);
              return;
            } else {
              var7 = ((((bf) this).field_l[var9] >> 4) * (((bf) this).field_l[var9] >> 4) - -((((bf) this).field_a[var9] >> 4) * (((bf) this).field_a[var9] >> 4))) / 3;
              if (var7 > 0) {
                L1: {
                  var8 = var7 >> 4;
                  var5 = (int)((double)(((bf) this).field_l[var9] * param3) / Math.sqrt((double)(3 * var7)));
                  if (var8 <= 63) {
                    break L1;
                  } else {
                    var8 = 63;
                    break L1;
                  }
                }
                var6 = (int)((double)(param3 * ((bf) this).field_a[var9]) / Math.sqrt((double)(var7 * 3)));
                var7 = var7 * param3;
                gf.b((var5 >> 1) + (param1 << 4), (var6 >> 1) - -(param0 << 4), var7 >> 10, var8, ((bf) this).field_i);
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_f = null;
        field_m = null;
        field_d = null;
        field_e = null;
        field_h = null;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        pm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wj var13 = null;
        int var14 = 0;
        int var15 = 0;
        wj var16 = null;
        int[][] var20 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            var13 = ra.field_c;
            var16 = var13;
            var2 = var16.c(true);
            var3 = (pm) (Object) li.field_a.e(-24172);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_j == var2) {
                    break L2;
                  } else {
                    var3 = (pm) (Object) li.field_a.a(4);
                    continue L1;
                  }
                }
              }
              if (var3 == null) {
                tl.a(-32);
                return;
              } else {
                L3: {
                  var4 = var16.c(true);
                  if (var4 != 0) {
                    ah.field_c[0] = tc.field_u;
                    var5 = var3.field_i;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        hg.a(31751, var5, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            kj.a(var5, 0);
                            var6 = new String[2][var5];
                            var20 = new int[2][var5 * 4];
                            var8 = lc.field_d;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L7: while (true) {
                                  if (var14 < var8) {
                                    L8: {
                                      var11 = ol.field_k[var14 + var5];
                                      var6[1][var15] = ah.field_c[var11];
                                      var20[1][var15 * 4] = i.field_t[var11];
                                      var20[1][4 * var15 + 1] = mf.field_d[var11];
                                      var20[1][4 * var15 + 2] = wa.field_m[var11];
                                      var20[1][var15 * 4 + 3] = tc.field_w[var11];
                                      if (!eh.a(true, ah.field_c[var11])) {
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var15++;
                                    continue L7;
                                  } else {
                                    var3.a(false);
                                    break L3;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = ol.field_k[var9];
                                  var6[0][var10] = ah.field_c[var11];
                                  var20[0][var10 * 4] = i.field_t[var11];
                                  var20[0][1 + var10 * 4] = mf.field_d[var11];
                                  var20[0][2 + var10 * 4] = wa.field_m[var11];
                                  var20[0][4 * var10 - -3] = tc.field_w[var11];
                                  if (!eh.a(true, ah.field_c[var11])) {
                                    break L9;
                                  } else {
                                    if (wa.field_m[var11] + mf.field_d[var11] - -tc.field_w[var11] != 0) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  }
                                }
                                var10++;
                                var9++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              dj.a((ec) (Object) var16, (byte) 123);
                              if (var6_int != 0) {
                                oc.a(var6_int, (byte) -59, dh.field_g, cm.field_P, fm.field_g, ln.field_e);
                                break L10;
                              } else {
                                oc.a(var6_int, (byte) -66, dh.field_g, cm.field_P, fm.field_g, ln.field_e);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        ah.field_c[var6_int] = var13.d(-108);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.a(false);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "bf.E(" + 19664 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (param0 <= -84) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= 200) {
              L1: {
                var2 = 864 + oi.b(0, 160);
                var3 = 0.01 * (double)oi.b(0, 21400);
                ((bf) this).field_c[((bf) this).field_g] = (int)((double)var2 * Math.sin(var3));
                ((bf) this).field_j[((bf) this).field_g] = (int)((double)var2 * Math.cos(var3));
                ((bf) this).field_g = ((bf) this).field_g + 1;
                if (((bf) this).field_g < 200) {
                  break L1;
                } else {
                  ((bf) this).field_g = 0;
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                if (((bf) this).field_l[var2] >= ((bf) this).field_c[var2]) {
                  break L2;
                } else {
                  ((bf) this).field_l[var2] = ((bf) this).field_l[var2] + 6;
                  break L2;
                }
              }
              L3: {
                if (((bf) this).field_c[var2] < ((bf) this).field_l[var2]) {
                  ((bf) this).field_l[var2] = ((bf) this).field_l[var2] - 3;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (((bf) this).field_j[var2] <= ((bf) this).field_a[var2]) {
                  break L4;
                } else {
                  ((bf) this).field_a[var2] = ((bf) this).field_a[var2] + 3;
                  break L4;
                }
              }
              if (((bf) this).field_a[var2] > ((bf) this).field_j[var2]) {
                ((bf) this).field_a[var2] = ((bf) this).field_a[var2] - 6;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param0 <= 1) {
                if (param0 != 1) {
                  stackOut_12_0 = var3_int;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = var3_int * param1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                L2: {
                  if ((1 & param0) != 0) {
                    var3_int = var3_int * param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param0 = param0 >> 1;
                param1 = param1 * param1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "bf.B(" + param0 + ',' + param1 + ',' + -106 + ')');
        }
        return stackIn_13_0;
    }

    final static void a(int param0, int param1, int param2, int param3, String param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            kn.a(param2, param4 + "_defeat", param1, param0, 125, 96, param4 + "_special", param4 + "_reveal");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("bf.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(-18228).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param4 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    bf(int param0) {
        int var2 = 0;
        this.a(param0, 31);
        for (var2 = 0; var2 < 100; var2++) {
            ((bf) this).a(-105);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new qe[14];
    }
}

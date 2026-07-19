/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends da {
    static boolean[][] field_i;
    int field_m;
    static int[] field_j;
    int field_k;
    static String field_l;

    final static void a(tc param0, int param1, int param2) {
        pa var3 = null;
        try {
            var3 = dk.field_s;
            var3.d(25, param2);
            var3.d(param1, (byte) 122);
            var3.d(0, (byte) 122);
            var3.d(param0.field_j, (byte) 122);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ue.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            ii.field_h = new ka[8];
            var1_int = 0;
            ii.field_h[5] = rd.field_i[6];
            ii.field_h[2] = rd.field_i[2];
            ii.field_h[0] = rd.field_i[0];
            ii.field_h[7] = rd.field_i[8];
            var4 = 480 - rd.field_i[0].field_v * 2;
            var3 = 3;
            var2 = rd.field_i[0].field_v;
            ii.field_h[3] = new ka(var3, 480);
            ii.field_h[3].d();
            qg.c(var1_int, var2, var3, var4, si.field_H[0], si.field_H[2]);
            qg.c(var1_int - -1, var2, 1, var4, ih.field_N[0], ih.field_N[2]);
            ii.field_h[3].h();
            ii.field_h[4] = new ka(var3, 480);
            ii.field_h[4].d();
            qg.c(var1_int, var2, var3, var4, si.field_H[1], si.field_H[3]);
            qg.c(var1_int + 1, var2, 1, var4, ih.field_N[1], ih.field_N[3]);
            ii.field_h[4].h();
            var1_int = 0;
            var2 = rd.field_i[0].field_v;
            var3 = 3;
            var4 = -(rd.field_i[0].field_q * 2) + 640;
            ii.field_h[1] = new ka(var3, 640);
            ii.field_h[1].d();
            qg.c(var1_int, var2, var3, var4, si.field_H[0], si.field_H[1]);
            qg.c(1 + var1_int, var2, 1, var4, ih.field_N[0], ih.field_N[1]);
            var5 = new int[640 * var3];
            var7 = 0;
            L1: while (true) {
              if (-641 >= (var7 ^ -1)) {
                var6 = ii.field_h[1].field_y;
                ii.field_h[1].field_p = 0;
                ii.field_h[1].field_v = var3;
                ii.field_h[1].field_s = 0;
                ii.field_h[1].field_u = 640;
                ii.field_h[1].field_y = var5;
                ii.field_h[1].field_q = 640;
                ii.field_h[1].field_x = var3;
                ii.field_h[1].h();
                ii.field_h[6] = new ka(var3, 640);
                ii.field_h[6].d();
                qg.c(var1_int, var2, var3, var4, si.field_H[2], si.field_H[3]);
                qg.c(1 + var1_int, var2, 1, var4, ih.field_N[2], ih.field_N[3]);
                var7 = 0;
                L2: while (true) {
                  if (-641 >= (var7 ^ -1)) {
                    var8 = 99 % ((-63 - param0) / 49);
                    ii.field_h[6].field_u = 640;
                    ii.field_h[6].field_y = var6;
                    ii.field_h[6].field_v = var3;
                    ii.field_h[6].field_p = 0;
                    ii.field_h[6].field_q = 640;
                    ii.field_h[6].field_x = var3;
                    ii.field_h[6].field_s = 0;
                    var5 = null;
                    ii.field_h[6].h();
                    var6 = null;
                    la.field_f.a(112);
                    break L0;
                  } else {
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= var3) {
                        var7++;
                        continue L2;
                      } else {
                        var6[var7 - -(var8 * 640)] = ii.field_h[6].field_y[var8 + var7 * var3];
                        var8++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var8 = 0;
                L4: while (true) {
                  if (var3 <= var8) {
                    var7++;
                    continue L1;
                  } else {
                    var5[var8 * 640 + var7] = ii.field_h[1].field_y[var8 + var7 * var3];
                    var8++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "ue.E(" + param0 + ')');
        }
    }

    final static ti[] a(int param0, pa param1) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ti[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        ti var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        ti[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ti[] stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.e(8, 118);
            if (var2_int <= 0) {
              L1: {
                if (param0 == -8191) {
                  break L1;
                } else {
                  ue.c((byte) -109);
                  break L1;
                }
              }
              var3 = param1.e(12, param0 ^ 8171);
              var4 = new ti[var3];
              var5 = 0;
              L2: while (true) {
                if (var5 >= var3) {
                  stackOut_12_0 = (ti[]) (var4);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (fl.a(param1, (byte) 124)) {
                      var6 = new ti();
                      discarded$12 = param1.e(24, 122);
                      discarded$13 = param1.e(24, -77);
                      var6.field_b = param1.e(24, -17);
                      discarded$14 = param1.e(9, param0 ^ 8162);
                      discarded$15 = param1.e(12, 99);
                      discarded$16 = param1.e(12, -70);
                      discarded$17 = param1.e(12, param0 + 8311);
                      var4[var5] = var6;
                      break L3;
                    } else {
                      var6_int = param1.e(ta.b(var5 - 1, 0), 95);
                      var4[var5] = var4[var6_int];
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("ue.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ti[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_13_0;
        }
    }

    public static void c(byte param0) {
        int var1 = -6 % ((90 - param0) / 32);
        field_l = null;
        field_i = (boolean[][]) null;
        field_j = null;
    }

    final static int a(int param0, int param1, int param2, int param3, byte param4) {
        ti[] discarded$0 = null;
        int var5 = -wb.field_p.field_o + param0;
        int var6 = param2 - wb.field_p.field_H;
        if (!(var5 >= 0)) {
            var5 = -var5;
        }
        if (param4 != 79) {
            pa var8 = (pa) null;
            discarded$0 = ue.a(71, (pa) null);
        }
        if (32 < var5) {
            var5 = 64 + -var5;
        }
        if (!((var6 ^ -1) <= -1)) {
            var6 = -var6;
        }
        if (-17 > (var5 ^ -1)) {
            return -1;
        }
        if (!(var6 * 64 <= 240)) {
            return -1;
        }
        var6 = var6 * 4 + 1;
        int var7 = var5 * var5 + var6 * var6;
        return var7;
    }

    private ue() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TorChallenge.field_F ? 1 : 0;
          var2 = 0;
          var3 = jc.field_c;
          if (-6 >= (var3 ^ -1)) {
            if (var3 >= 105) {
              if ((var3 ^ -1) <= -121) {
                break L0;
              } else {
                var3 = -var3 + 120;
                var2 = -(var3 * var3 * 8192 / 3300) + 8192;
                break L0;
              }
            } else {
              var2 = (var3 * 16384 - 40960) / 220;
              break L0;
            }
          } else {
            var2 = 8192 * (var3 * var3) / 1100;
            break L0;
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (-2 == (param0 ^ -1)) {
            var5 = 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 != 3) {
            break L2;
          } else {
            var4 = -1;
            break L2;
          }
        }
        L3: {
          if ((param0 ^ -1) != -5) {
            break L3;
          } else {
            var5 = 1;
            var4 = 1;
            break L3;
          }
        }
        L4: {
          if (-6 == (param0 ^ -1)) {
            var5 = 1;
            var4 = -1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!param1) {
            break L5;
          } else {
            field_i = (boolean[][]) null;
            break L5;
          }
        }
        L6: {
          if (6 != param0) {
            break L6;
          } else {
            var4 = 1;
            var5 = -1;
            break L6;
          }
        }
        L7: {
          L8: {
            if (-8 == (param0 ^ -1)) {
              break L8;
            } else {
              if (8 != param0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (param0 == 11) {
            var4 = -1;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (-13 != (param0 ^ -1)) {
            break L10;
          } else {
            var5 = -1;
            var4 = -1;
            break L10;
          }
        }
        L11: {
          if (param0 != 13) {
            break L11;
          } else {
            var5 = -1;
            var4 = 1;
            break L11;
          }
        }
        L12: {
          if (14 == param0) {
            var5 = 1;
            var4 = -1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if ((param0 ^ -1) != -16) {
            break L13;
          } else {
            var5 = 1;
            var4 = 1;
            break L13;
          }
        }
        uf.field_n = hh.b(var4 * var2, 7429, var2 * var5);
    }

    static {
        field_i = new boolean[][]{new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{false, false, false}};
        field_j = new int[]{54, 17, 238, 376};
        field_l = "Please enter your age in years";
    }
}

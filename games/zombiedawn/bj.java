/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bj extends nb {
    static oi field_q;
    static String field_p;
    int field_r;

    abstract Object d(byte param0);

    public static void e(int param0) {
        field_q = null;
        field_p = null;
    }

    final static gd a(am param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        gd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gd stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        gd stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var2_int = param0.k(99, 8);
            if (0 < var2_int) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = dg.a(param0, false) ? 1 : 0;
                var4 = dg.a(param0, false) ? 1 : 0;
                var5 = new gd();
                var5.field_k = (short)param0.k(61, 16);
                var5.field_G = ad.a(var5.field_G, true, 16, param0);
                var5.field_B = ad.a(var5.field_B, true, 16, param0);
                var5.field_m = ad.a(var5.field_m, true, 16, param0);
                var5.field_c = (short)param0.k(82, 16);
                var5.field_g = ad.a(var5.field_g, true, 16, param0);
                var5.field_H = ad.a(var5.field_H, true, 16, param0);
                var5.field_r = ad.a(var5.field_r, true, 16, param0);
                if (var3 != 0) {
                  var5.field_f = (short)param0.k(56, 16);
                  var5.field_M = ad.a(var5.field_M, true, 16, param0);
                  var5.field_q = ad.a(var5.field_q, true, 16, param0);
                  var5.field_y = ad.a(var5.field_y, true, 16, param0);
                  var5.field_O = ad.a(var5.field_O, true, 16, param0);
                  var5.field_n = ad.a(var5.field_n, true, 16, param0);
                  var5.field_v = ad.a(var5.field_v, true, 16, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  int discarded$1 = param0.k(13, 16);
                  var5.field_K = ad.a(var5.field_K, true, 16, param0);
                  var5.field_d = ad.a(var5.field_d, true, 16, param0);
                  var5.field_h = ad.a(var5.field_h, true, 16, param0);
                  var5.field_l = ad.a(var5.field_l, true, 16, param0);
                  var5.field_w = ad.a(var5.field_w, true, 16, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (dg.a(param0, false)) {
                  var5.field_x = ad.a(var5.field_x, true, 16, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!dg.a(param0, false)) {
                  break L4;
                } else {
                  var5.field_F = hc.a(16, param0, (byte) -44, var5.field_F);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var5.field_F.length) {
                      if (var6 != 0) {
                        var5.field_p = (byte)(var6 + 1);
                        break L4;
                      } else {
                        var5.field_F = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((255 & var5.field_F[var7]) <= var6) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_22_0 = (gd) var5;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("bj.G(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + -128 + ')');
        }
        return stackIn_23_0;
    }

    final static int a(boolean param0) {
        return qk.field_Mb;
    }

    final static boolean d(int param0) {
        return 10 <= fl.field_a && ld.field_j >= 13;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 > 44) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 < 48) {
              break L2;
            } else {
              if (param0 > 57) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    bj(int param0) {
        ((bj) this).field_r = param0;
    }

    final static vn[] a(String param0, int param1, dj param2, String param3) {
        vn[] var4 = null;
        RuntimeException var4_ref = null;
        vn[] var5 = null;
        Object stackIn_2_0 = null;
        vn[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var5 = vm.a((byte) 111, param3, param0, param2);
            var4 = var5;
            var5[3].field_q = var5[3].field_t;
            var5[1].field_r = var5[1].field_w;
            if (param1 <= -117) {
              var5[5].field_q = var5[5].field_t;
              var5[7].field_r = var5[7].field_w;
              stackOut_3_0 = (vn[]) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vn[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("bj.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_4_0;
    }

    abstract boolean b(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Click";
    }
}

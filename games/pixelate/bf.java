/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends fa {
    static String[][] field_q;
    static String field_t;
    private int field_n;
    static float field_o;
    private tf field_l;
    static ak field_k;
    private boolean[] field_p;
    static long field_m;
    static int[] field_r;
    private int field_s;

    final static tc a(int param0, fm param1, String param2, fm param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        tc stackIn_4_0 = null;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        tc stackOut_3_0 = null;
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
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              var5_int = param3.a(param0 ^ 122, param4);
              var6 = param3.a((byte) -111, param2, var5_int);
              stackOut_3_0 = um.a(param3, param1, var5_int, 121, var6);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (tc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("bf.D(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
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
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void a() {
        field_t = null;
        field_k = null;
        field_r = null;
        field_q = null;
    }

    final static int[] a(boolean param0) {
        if (param0) {
            return null;
        }
        return new int[8];
    }

    final static tf[] a(int param0, String param1, String param2) {
        tf[] var3 = null;
        RuntimeException var3_ref = null;
        tf[] var4 = null;
        tf[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = eh.a(param2, param1, (byte) 47, pf.field_d);
            var3 = var4;
            var4[1].field_A = var4[1].field_F;
            var4[3].field_B = var4[3].field_E;
            var4[7].field_A = var4[7].field_F;
            var4[param0].field_B = var4[5].field_E;
            stackOut_0_0 = (tf[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("bf.A(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        if (param0 >= -50) {
            int[] discarded$0 = bf.a(true);
        }
        int var4 = 0;
        if (param3) {
            var4 += 4;
        }
        if (param2) {
            var4 += 2;
        }
        var4++;
        return v.field_a[var4];
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          if (param4 > 0) {
            break L0;
          } else {
            if (param2 <= 0) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 0) {
            break L1;
          } else {
            ((bf) this).b(116, 75, (byte) -124);
            break L1;
          }
        }
        L2: {
          L3: {
            if (param4 < 256) {
              break L3;
            } else {
              if (param2 >= 256) {
                int discarded$3 = 98;
                this.a(param3, param1);
                break L2;
              } else {
                break L3;
              }
            }
          }
          t.a(a.field_N);
          ((bf) this).field_l.c();
          t.d();
          int discarded$4 = 98;
          this.a(0, 0);
          qa.field_f.a(19692);
          t.b(a.field_N);
          fi.a(((bf) this).field_l, param1, param3, param4, param2);
          break L2;
        }
    }

    private final void a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        tf[] stackIn_9_0 = null;
        tf[] stackIn_10_0 = null;
        tf[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        tf[] stackIn_14_0 = null;
        tf[] stackIn_15_0 = null;
        tf[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        tf[] stackIn_18_0 = null;
        tf[] stackIn_19_0 = null;
        tf[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        tf[] stackIn_21_0 = null;
        tf[] stackIn_22_0 = null;
        tf[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        tf[] stackOut_17_0 = null;
        tf[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        tf[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        tf[] stackOut_20_0 = null;
        tf[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        tf[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        tf[] stackOut_13_0 = null;
        tf[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        tf[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        tf[] stackOut_8_0 = null;
        tf[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        tf[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          var9 = Pixelate.field_H ? 1 : 0;
          var4 = param1;
          var5 = param0;
          if (null != fq.field_o) {
            stackOut_2_0 = fo.field_t;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        var7 = 0;
        L1: while (true) {
          if (var7 >= ((bf) this).field_s) {
            return;
          } else {
            var8 = 0;
            L2: while (true) {
              if (var8 >= ((bf) this).field_n) {
                var4 = param1;
                var5 += 16;
                var7++;
                continue L1;
              } else {
                if (var6 != 0) {
                  if (var6 != 256) {
                    L3: {
                      stackOut_17_0 = rg.field_e.field_a;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (((bf) this).field_p[var8 - -(var7 * ((bf) this).field_n)]) {
                        stackOut_19_0 = (tf[]) (Object) stackIn_19_0;
                        stackOut_19_1 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L3;
                      } else {
                        stackOut_18_0 = (tf[]) (Object) stackIn_18_0;
                        stackOut_18_1 = 0;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        break L3;
                      }
                    }
                    L4: {
                      ((tf) (Object) stackIn_20_0[stackIn_20_1]).f(var4, var5);
                      stackOut_20_0 = fq.field_o.field_a;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (((bf) this).field_p[var7 * ((bf) this).field_n + var8]) {
                        stackOut_22_0 = (tf[]) (Object) stackIn_22_0;
                        stackOut_22_1 = 1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        break L4;
                      } else {
                        stackOut_21_0 = (tf[]) (Object) stackIn_21_0;
                        stackOut_21_1 = 0;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        break L4;
                      }
                    }
                    ((tf) (Object) stackIn_23_0[stackIn_23_1]).a(var4, var5, var6);
                    var4 += 16;
                    var8++;
                    continue L2;
                  } else {
                    L5: {
                      stackOut_13_0 = fq.field_o.field_a;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (((bf) this).field_p[var8 + var7 * ((bf) this).field_n]) {
                        stackOut_15_0 = (tf[]) (Object) stackIn_15_0;
                        stackOut_15_1 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L5;
                      } else {
                        stackOut_14_0 = (tf[]) (Object) stackIn_14_0;
                        stackOut_14_1 = 0;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L5;
                      }
                    }
                    ((tf) (Object) stackIn_16_0[stackIn_16_1]).f(var4, var5);
                    var4 += 16;
                    var8++;
                    continue L2;
                  }
                } else {
                  L6: {
                    stackOut_8_0 = rg.field_e.field_a;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (!((bf) this).field_p[((bf) this).field_n * var7 + var8]) {
                      stackOut_10_0 = (tf[]) (Object) stackIn_10_0;
                      stackOut_10_1 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L6;
                    } else {
                      stackOut_9_0 = (tf[]) (Object) stackIn_9_0;
                      stackOut_9_1 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L6;
                    }
                  }
                  ((tf) (Object) stackIn_11_0[stackIn_11_1]).f(var4, var5);
                  var4 += 16;
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void b(int param0, int param1, byte param2) {
        int discarded$0 = 98;
        this.a(param1, param0);
        int var4 = 21 / ((param2 - -66) / 35);
    }

    bf(hh param0) {
        try {
            ((bf) this).field_p = ad.a(param0, 21922);
            ((bf) this).field_n = param0.field_f;
            ((bf) this).field_s = param0.field_a;
            ((bf) this).field_l = new tf(16 * ((bf) this).field_n, 16 * ((bf) this).field_s);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bf.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0L;
        field_t = "Not yet achieved";
        field_r = new int[4];
    }
}

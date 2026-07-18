/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ro extends am {
    int[] field_s;
    static String field_t;
    int field_u;
    static int field_w;
    static long field_v;
    int field_x;
    private int field_y;

    int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        int[][] var16 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var11 = Torquing.field_u;
          var16 = ((ro) this).field_r.a(15142, param1);
          var15 = var16;
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (!((ro) this).field_r.field_b) {
            break L0;
          } else {
            if (((ro) this).c(-31292)) {
              L1: {
                var4 = var16[0];
                var5 = var16[1];
                var6 = var16[2];
                if (((ro) this).field_u == um.field_o) {
                  stackOut_5_0 = param1;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = ((ro) this).field_u * param1 / um.field_o;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              var7 = stackIn_6_0 * ((ro) this).field_x;
              if (((ro) this).field_x == ci.field_c) {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= ci.field_c) {
                    break L0;
                  } else {
                    int incrementValue$1 = var7;
                    var7++;
                    var9 = ((ro) this).field_s[incrementValue$1];
                    var6[var8] = ie.a(255, var9) << 4;
                    var5[var8] = ie.a(65280, var9) >> 4;
                    var4[var8] = ie.a(16711680, var9) >> 12;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 0;
                L3: while (true) {
                  if (var8 >= ci.field_c) {
                    break L0;
                  } else {
                    var9 = var8 * ((ro) this).field_x / ci.field_c;
                    var10 = ((ro) this).field_s[var7 - -var9];
                    var6[var8] = ie.a(255, var10) << 4;
                    var5[var8] = ie.a(65280, var10) >> 4;
                    var4[var8] = ie.a(16711680, var10) >> 12;
                    var8++;
                    continue L3;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        if (param0 == -29116) {
          return var3;
        } else {
          return null;
        }
    }

    final int e(byte param0) {
        if (param0 <= 26) {
            return -10;
        }
        return ((ro) this).field_y;
    }

    final static String b(int param0) {
        if (2 > b.field_x) {
            return ip.field_c;
        }
        if (null != je.field_f) {
            if (!je.field_f.a(-12749)) {
                return Torquing.field_w;
            }
            return md.field_b;
        }
        if (!lp.field_a.a(-12749)) {
            return bo.field_i;
        }
        if (!(lp.field_a.a(true, "commonui"))) {
            return db.field_d + " - " + lp.field_a.a((byte) 102, "commonui") + "%";
        }
        if (!eg.field_v.a(-12749)) {
            return ol.field_e;
        }
        if (!eg.field_v.a(true, "commonui")) {
            return l.field_c + " - " + eg.field_v.a((byte) 50, "commonui") + "%";
        }
        if (!(kb.field_a.a(-12749))) {
            return ci.field_d;
        }
        if (!(kb.field_a.c(-19375))) {
            return la.field_b + " - " + kb.field_a.a((byte) -32) + "%";
        }
        return pm.field_p;
    }

    public static void g() {
        field_t = null;
    }

    final boolean c(int param0) {
        if (((ro) this).field_s != null) {
            return true;
        }
        if (param0 != -31292) {
            return true;
        }
        if (((ro) this).field_y < 0) {
            return false;
        }
        tc var2 = 0 <= po.field_u ? tc.a(vf.field_a, po.field_u, ((ro) this).field_y) : tc.a(vf.field_a, ((ro) this).field_y);
        var2.b();
        ((ro) this).field_s = var2.c();
        ((ro) this).field_u = var2.field_e;
        ((ro) this).field_x = var2.field_d;
        return true;
    }

    final void a(fj param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 35) {
                break L1;
              } else {
                ((ro) this).field_x = -83;
                break L1;
              }
            }
            L2: {
              if (0 == param2) {
                ((ro) this).field_y = param0.i(7088);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ro.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void d(byte param0) {
        int var2 = -128 % ((-63 - param0) / 62);
        super.d((byte) 91);
        ((ro) this).field_s = null;
    }

    public ro() {
        super(0, false);
        ((ro) this).field_y = -1;
    }

    final static boolean a(byte param0, la param1, la param2, la param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
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
        try {
          L0: {
            if (!param1.a(-12749)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param1.a(true, "commonui")) {
                L1: {
                  if (!param3.a(-12749)) {
                    break L1;
                  } else {
                    if (!param3.a(true, "commonui")) {
                      break L1;
                    } else {
                      L2: {
                        var4_int = -28;
                        if (!param2.a(-12749)) {
                          break L2;
                        } else {
                          if (param2.a(true, "button.gif")) {
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ro.O(").append(54).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          L5: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
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
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = -1;
        field_t = "LOW";
    }
}

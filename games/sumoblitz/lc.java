/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends sp implements ai {
    private wp[] field_H;
    private int field_F;
    private vn field_C;
    private int[] field_D;
    private String field_B;
    static boolean field_A;
    private gt field_G;

    final static void a(byte param0, boolean param1, boolean param2, int param3, int param4, tv param5) {
        Object var6 = null;
        RuntimeException var6_ref = null;
        Throwable var7 = null;
        Object var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          var6 = (Object) (Object) wd.field_f;
          synchronized (var6) {
            L0: {
              if (param5 == nd.field_B) {
                return;
              } else {
                L1: {
                  nd.field_B = param5;
                  if (nd.field_B != null) {
                    qc.field_e.a(param2, param3, 7094, param4, nd.field_B, true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 >= 98) {
                    break L2;
                  } else {
                    var8 = null;
                    lc.a((byte) -110, true, true, 90, -86, (tv) null);
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6_ref;
            stackOut_15_1 = new StringBuilder().append("lc.F(").append(param0).append(',').append(true).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    lc(gt param0, vn param1, String param2) {
        super(0, 0, 288, 0, (mh) null);
        int var4_int = 0;
        ((lc) this).field_F = 0;
        try {
            ((lc) this).field_B = param2;
            ((lc) this).field_G = param0;
            ((lc) this).field_C = param1;
            var4_int = ((lc) this).field_B != null ? ((lc) this).field_C.a(((lc) this).field_B, 260, ((lc) this).field_C.field_s) : 0;
            ((lc) this).a(-127, 0, 0, 22 - -var4_int, 288);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (null == hu.a(param1, (byte) 109)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("lc.D(").append(false).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        super.a(param0, param1, (byte) -118, param3);
        if (param2 >= -35) {
          var6 = null;
          boolean discarded$3 = lc.a(false, (String) null);
          int discarded$4 = ((lc) this).field_C.a(((lc) this).field_B, 14 + ((lc) this).field_r + param0, ((lc) this).field_v + (param1 - -10), -28 + ((lc) this).field_q, ((lc) this).field_p, 16777215, -1, 0, 0, ((lc) this).field_C.field_s);
          return;
        } else {
          int discarded$5 = ((lc) this).field_C.a(((lc) this).field_B, 14 + ((lc) this).field_r + param0, ((lc) this).field_v + (param1 - -10), -28 + ((lc) this).field_q, ((lc) this).field_p, 16777215, -1, 0, 0, ((lc) this).field_C.field_s);
          return;
        }
    }

    private final void a(byte param0, int param1) {
        wp[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        wp[] var8 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param1 <= ((lc) this).field_F) {
          return;
        } else {
          var8 = new wp[param1];
          var3 = var8;
          if (param0 == -124) {
            var4 = new int[param1];
            var5 = 0;
            L0: while (true) {
              if (((lc) this).field_F <= var5) {
                ((lc) this).field_H = var3;
                ((lc) this).field_F = param1;
                ((lc) this).field_D = var4;
                return;
              } else {
                var8[var5] = ((lc) this).field_H[var5];
                var4[var5] = ((lc) this).field_D[var5];
                var5++;
                continue L0;
              }
            }
          } else {
            var7 = null;
            ((lc) this).a(-17, -108, (wp) null, 120, -53);
            var4 = new int[param1];
            var5 = 0;
            L1: while (true) {
              if (((lc) this).field_F <= var5) {
                ((lc) this).field_H = var3;
                ((lc) this).field_F = param1;
                ((lc) this).field_D = var4;
                return;
              } else {
                var8[var5] = ((lc) this).field_H[var5];
                var4[var5] = ((lc) this).field_D[var5];
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int var4_int = 0;
        try {
            if (!param2) {
                ((lc) this).field_B = null;
            }
            var4_int = ((lc) this).field_F;
            this.a((byte) -124, var4_int - -1);
            ((lc) this).field_H[var4_int] = ((lc) this).a(param0, (byte) -123, (qm) this);
            ((lc) this).field_D[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "lc.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final wp a(String param0, byte param1, qm param2) {
        wp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wp stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -123) {
                break L1;
              } else {
                this.a((byte) 29, -68);
                break L1;
              }
            }
            var4 = new wp(param0, param2);
            var4.field_w = (mh) (Object) new ue();
            var5 = -2 + ((lc) this).field_p;
            ((lc) this).a(param1 ^ 62, 0, 0, 34 + ((lc) this).field_p, ((lc) this).field_q);
            var4.a(-57, 7, var5, 30, ((lc) this).field_q + -14);
            ((lc) this).a((pk) (Object) var4, param1 + 241);
            stackOut_2_0 = (wp) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("lc.H(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 710) {
                break L1;
              } else {
                var9 = null;
                ((lc) this).a((String) null, -37, false);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (((lc) this).field_F <= var6_int) {
                break L0;
              } else {
                if (((lc) this).field_H[var6_int] == param2) {
                  var7 = ((lc) this).field_D[var6_int];
                  if (-1 == var7) {
                    ((lc) this).field_G.n(-7);
                    return;
                  } else {
                    rd.a(((lc) this).field_D[var6_int], -59);
                    return;
                  }
                } else {
                  var6_int++;
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("lc.C(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = false;
    }
}

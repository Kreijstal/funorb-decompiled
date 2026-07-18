/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends bca {
    int field_r;
    static kv[] field_q;

    final int b(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          var3 = ((oo) this).field_l.a(param1 ^ -94, param0);
          if (param1 == -1) {
            if (((oo) this).field_r == 2) {
              stackOut_5_0 = var3.field_x;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              if (((oo) this).field_r == 4) {
                stackOut_15_0 = -1 + (param0.field_z - var3.field_x);
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0;
              } else {
                if (1 == ((oo) this).field_r) {
                  stackOut_13_0 = var3.field_J;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  if (((oo) this).field_r == 3) {
                    stackOut_11_0 = -1 + (param0.field_B + -var3.field_J);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    throw new IllegalStateException();
                  }
                }
              }
            }
          } else {
            stackOut_1_0 = 58;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("oo.D(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L0;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    final static hs a(int param0, byte param1, byte[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        cda[] var6 = null;
        int var7 = 0;
        cda var8 = null;
        int var9 = 0;
        int var10 = 0;
        lu var11 = null;
        hs stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        hs stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var11 = new lu(param2);
            var5 = var11.e((byte) 83);
            var6 = new cda[var11.e((byte) 66)];
            var7 = 0;
            L1: while (true) {
              if (var6.length <= var7) {
                stackOut_9_0 = new hs(param3, param0, var6, var5);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8 = new cda();
                var8.field_a = var11.e((byte) 66);
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 11) {
                    var6[var7] = var8;
                    var7++;
                    continue L1;
                  } else {
                    var8.field_b[var9].field_h = var11.c((byte) -85);
                    var8.field_b[var9].field_l = var11.c((byte) -85);
                    var8.field_b[var9].field_d = var11.c((byte) -85);
                    var8.field_b[var9].field_e = var11.c((byte) -85);
                    var8.field_b[var9].field_j = var11.f(52);
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("oo.B(").append(param0).append(',').append(-77).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        nm stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nm stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            stackOut_2_0 = new nm(param1, (oo) this);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oo.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return (at) (Object) stackIn_3_0;
    }

    oo(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            ((oo) this).field_k = param0.e((byte) 79);
            ((oo) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (0 > var2_int) {
                    break;
                }
                ((oo) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
            }
            ((oo) this).field_r = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "oo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    oo(int param0, nq param1, int param2) {
        super(param0, param1);
        try {
            ((oo) this).field_r = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "oo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, lu param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a((byte) -118, param1);
              param1.d(((oo) this).field_r, 0);
              if (param0 < -12) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oo.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void d() {
        field_q = null;
        int var1 = -102;
    }

    final void a(op param0, int param1) {
        try {
            ((oo) this).a(param0, (byte) -2);
            ((oo) this).field_l.a(79, param0).a(false, ((oo) this).b(param0, -1), ((oo) this).field_r);
            int var3_int = 118 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "oo.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends va {
    static String[] field_q;
    private int field_p;
    static o field_s;
    private ti field_r;

    final static ai a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6) {
        ai var9 = null;
        RuntimeException var9_ref = null;
        ai stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ai stackOut_0_0 = null;
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
            var9 = new ai(2, 65533, param6, param0, param5, param2, param1);
            fh.field_t.a((wl) (Object) var9, false);
            og.a(var9, 3, -61);
            stackOut_0_0 = (ai) var9;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9_ref;
            stackOut_2_1 = new StringBuilder().append("mg.D(").append(param0).append(',');
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
          throw bd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ',' + 3 + ',' + 99 + ',' + param5 + ',' + param6 + ',' + 65533 + ',' + 2 + ')');
        }
        return stackIn_1_0;
    }

    final static ua a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ua var3 = null;
        Object stackIn_2_0 = null;
        ua stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ua stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            var2_int = 97;
            if (param1 != null) {
              var3 = new ua(param1, ph.field_q, ne.field_h, cg.field_k, tf.field_b, ic.field_b, mf.field_j);
              eb.a(0);
              stackOut_3_0 = (ua) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ua) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("mg.H(").append(65).append(',');
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
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    mg(int param0) {
        super(param0);
    }

    public static void h() {
        field_s = null;
        field_q = null;
    }

    final void i(byte param0) {
        ((mg) this).field_m = (((mg) this).field_p - -7) / 8;
        if (param0 != -31) {
            field_q = null;
        }
    }

    final int m(int param0) {
        int var2 = -128 % ((param0 - -9) / 54);
        int fieldTemp$0 = ((mg) this).field_m;
        ((mg) this).field_m = ((mg) this).field_m + 1;
        return 255 & ((mg) this).field_k[fieldTemp$0] - ((mg) this).field_r.b((byte) 73);
    }

    final void c(byte param0, int param1) {
        int var3 = -41 / ((-1 - param0) / 44);
        int fieldTemp$0 = ((mg) this).field_m;
        ((mg) this).field_m = ((mg) this).field_m + 1;
        ((mg) this).field_k[fieldTemp$0] = (byte)(((mg) this).field_r.b((byte) 60) + param1);
    }

    final void l(int param0) {
        if (param0 != 19967) {
            return;
        }
        ((mg) this).field_p = ((mg) this).field_m * 8;
    }

    mg(byte[] param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            var5_int = param2;
            L1: while (true) {
              if (var5_int >= param1) {
                break L0;
              } else {
                int fieldTemp$5 = ((mg) this).field_m;
                ((mg) this).field_m = ((mg) this).field_m + 1;
                param3[var5_int + param0] = (byte)(((mg) this).field_k[fieldTemp$5] + -((mg) this).field_r.b((byte) 125));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("mg.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final void a(int[] param0, byte param1) {
        if (param1 != 109) {
            return;
        }
        try {
            ((mg) this).field_r = new ti(param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "mg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int g(int param0, int param1) {
        int var6 = wizardrun.field_H;
        if (param1 != -11719) {
            return 35;
        }
        int var3 = ((mg) this).field_p >> 3;
        int var4 = 8 + -(((mg) this).field_p & 7);
        int var5 = 0;
        ((mg) this).field_p = ((mg) this).field_p + param0;
        while (param0 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((mg) this).field_k[incrementValue$0] & lj.field_b[var4]) << param0 - var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (var4 == param0) {
            var5 = var5 + (lj.field_b[var4] & ((mg) this).field_k[var3]);
        } else {
            var5 = var5 + (((mg) this).field_k[var3] >> var4 - param0 & lj.field_b[param0]);
        }
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}

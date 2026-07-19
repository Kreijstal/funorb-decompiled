/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends bca {
    static int field_u;
    int field_s;
    int field_r;
    static sga field_q;
    static String field_t;

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        op var4 = null;
        pw stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        pw stackOut_2_0 = null;
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
                var4 = (op) null;
                this.a((op) null, -84);
                break L1;
              }
            }
            stackOut_2_0 = new pw(param1, (ak) (this));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ak.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (at) ((Object) stackIn_3_0);
    }

    final static boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1375) {
          L0: {
            field_t = (String) null;
            if (null == lna.field_C) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == lna.field_C) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    ak(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            this.field_k = param0.e((byte) 59);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (0 > var2_int) {
                    break;
                }
                this.field_o.a(dca.a((byte) 102, param0), true);
            }
            this.field_r = param0.b(16711935);
            this.field_s = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, lu param1) {
        try {
            super.a((byte) -27, param1);
            param1.d(this.field_r, 0);
            if (param0 > -12) {
                field_q = (sga) null;
            }
            param1.d(this.field_s, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ak.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ak(int param0, nq param1) {
        super(param0, param1);
    }

    public static void d(byte param0) {
        boolean discarded$0 = false;
        if (param0 < 26) {
            discarded$0 = ak.e(29);
            field_t = null;
            field_q = null;
            return;
        }
        field_t = null;
        field_q = null;
    }

    final void a(op param0, int param1) {
        try {
            int var3_int = 22 / ((param1 - 12) / 35);
            this.a(param0, (byte) -2);
            param0.a(0, this.field_r, this.field_s, true, this.d(1), 27);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ak.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int[][] d(int param0) {
        int[][] var5 = new int[17][17];
        int[][] var4 = var5;
        int[][] var3 = var4;
        int[][] var2 = var3;
        var5[6][7] = 1;
        var5[5][8] = 1;
        var5[6][9] = 1;
        var5[7][6] = 1;
        var5[6][8] = 1;
        var5[7][7] = 1;
        var5[7][8] = 1;
        var5[8][6] = 1;
        var5[8][5] = 1;
        var5[8][7] = 1;
        var5[7][9] = 1;
        var5[7][10] = 1;
        var5[8][10] = 1;
        var5[8][9] = 1;
        var5[9][7] = 1;
        var5[9][6] = 1;
        var5[8][11] = 1;
        var5[8][8] = 1;
        var5[9][10] = 1;
        var5[10][7] = 1;
        var5[9][9] = param0;
        var5[9][8] = 1;
        var5[10][9] = 1;
        var5[10][8] = 1;
        var5[11][8] = 1;
        return var2;
    }

    static {
    }
}

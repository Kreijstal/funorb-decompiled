/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf extends ta {
    static String field_q;
    int field_t;
    int field_s;
    int field_u;
    int field_w;
    static ei field_x;
    int field_v;
    int field_r;

    final static void c(byte param0) {
        int var1_int = 0;
        int var3_int = 0;
        double[] var4_ref_double__ = null;
        int var5 = 0;
        double[] var3 = null;
        int var4 = 0;
        int var6 = Torquing.field_u;
        try {
            int var2 = 0;
            for (var1_int = 0; var1_int < 8; var1_int++) {
                for (var3_int = 0; var3_int < 8; var3_int++) {
                    var4_ref_double__ = jl.field_O[var1_int];
                    mg.field_a[var1_int][var3_int] = 0.0;
                    var5 = var3_int;
                    var4_ref_double__[var5] = 0.0;
                }
                var3 = go.field_w;
                var4 = var1_int;
                vf.field_e[var1_int] = 0.0;
                var3[var4] = 0.0;
            }
            ia.field_i = 0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "wf.DB(" + 76 + 41);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = ((wf) this).field_w << 3;
        if (param1 != 1326547364) {
            ((wf) this).b(78, 62, -121, -50, -99);
        }
        param4 = (15 & var6) + (param4 << 4);
        int var7 = ((wf) this).field_u << 3;
        param3 = (param3 << 4) + (var7 & 15);
        ((wf) this).b(var6, var7, param4, param3, param2, param0);
    }

    final static t[] a(int param0, int param1, int param2, int param3, byte param4) {
        t[] var6 = new t[9];
        t[] var5 = var6;
        t dupTemp$0 = hj.a((byte) -87, param1, param2);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        t dupTemp$1 = hj.a((byte) -86, param3, param2);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(param0 == 0)) {
            var6[4] = hj.a((byte) -88, param0, 64);
        }
        return var5;
    }

    abstract void b(int param0, int param1, int param2, int param3, int param4, int param5);

    final static int a(byte param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param0 == -117) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            stackOut_2_0 = nn.a(7655, param2, 0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("wf.AB(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ph.b(2 + param3, param0 + 1, 4, param4);
        ph.a(param3 + 6, 2 + param0, 4, param4);
        ph.a(5 + param3, 6 + param0, 5, param4);
        ph.a(param3 + 4, param0 - -11, 4, param4);
        ph.b(param3 - -2, param0 - -15, 2, param4);
        ph.a(1 + param3, param0 + 2, 9, param4);
        int var5 = -89 / ((83 - param2) / 42);
        ph.a(2 + param3, param0 + 11, 4, param4);
        ph.a(2 + param3, param0 + 2, 9, param1);
        ph.a(param3 - -3, 2 + param0, 13, param1);
        ph.a(4 + param3, 2 + param0, 9, param1);
        ph.a(param3 - -5, param0 + 2, 4, param1);
    }

    public static void a(boolean param0) {
        field_x = null;
        field_q = null;
        if (param0) {
            wf.a(true);
        }
    }

    wf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "HIGH";
    }
}

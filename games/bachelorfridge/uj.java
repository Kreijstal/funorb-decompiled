/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends bca {
    static String field_v;
    int field_t;
    int field_q;
    static du field_u;
    static sna field_r;
    static char[] field_s;

    uj(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            ((uj) this).field_k = param0.e((byte) 59);
            ((uj) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (var2_int < 0) {
                    break;
                }
                ((uj) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
            }
            ((uj) this).field_q = param0.b(16711935);
            ((uj) this).field_t = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, lu param1) {
        try {
            super.a((byte) -108, param1);
            param1.d(((uj) this).field_q, 0);
            if (param0 > -12) {
                field_s = null;
            }
            param1.d(((uj) this).field_t, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uj.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_v = null;
        field_s = null;
        field_u = null;
        field_r = null;
        if (param0 != 20) {
            uj.d((byte) 88);
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        jba stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jba stackOut_3_0 = null;
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
            if (param0 == 5) {
              stackOut_3_0 = new jba(param1, (uj) this);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (at) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("uj.A(").append(param0).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return (at) (Object) stackIn_4_0;
    }

    final int[][] d(int param0) {
        int[][] var3 = new int[17][17];
        int[][] var2 = var3;
        var3[8][7] = 1;
        var3[7][8] = 1;
        var3[8][8] = param0;
        var3[8][9] = 1;
        var3[9][8] = 1;
        return var2;
    }

    final void a(op param0, int param1) {
        try {
            param0.a(0, ((uj) this).field_q, ((uj) this).field_t, false, ((uj) this).d(1), 28);
            int var3_int = -67 / ((param1 - 12) / 35);
            ((uj) this).a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    uj(int param0, nq param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Ignore";
        field_u = new du(4, 1, 1, 1);
        field_s = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends oka {
    static boolean field_v;
    static jg field_u;

    public static void c(int param0) {
        int var1 = -70 / ((60 - param0) / 47);
        field_u = null;
    }

    cm(int param0) {
        this(jca.field_a, param0);
    }

    final String c(wj param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
              if (param1 == 1) {
                break L1;
              } else {
                cm.c(35);
                break L1;
              }
            }
            stackOut_2_0 = uu.a(param0.field_w.length(), param1 + 82, '*');
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cm.K(");
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
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        fs.field_f = param0;
        if (!(saa.field_b == eb.field_t)) {
            var2 = saa.field_b * saa.field_b;
            var3 = var2 + -(eb.field_t * eb.field_t);
            param0 = param0 + (pda.field_p - param0) * var3 / var2;
        }
        i.field_a.a(120, 31407, 640, ce.field_t, param0);
        taa.a(5, gba.field_Bb, 115, -24 + pda.field_p, lm.field_d, 0, 640);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 1;
        mt.field_v = param2;
        wk.field_f = param0;
        ru.field_c = param1;
    }

    private cm(po param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = true;
        field_u = new jg();
    }
}

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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            cm.c(35);
          }
          stackIn_3_0 = uu.a(param0.field_w.length(), param1 + 82, '*');
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cm.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        fs.field_f = param0;
        if (saa.field_b != eb.field_t) {
          var2 = saa.field_b * saa.field_b;
          var3 = var2 - eb.field_t * eb.field_t;
          param0 = param0 + (pda.field_p - param0) * var3 / var2;
        }
        i.field_a.a(120, 31407, 640, ce.field_t, param0);
        if (param1 == -111) {
          taa.a(5, gba.field_Bb, 115, -24 + pda.field_p, lm.field_d, 0, 640);
          return;
        }
        cm.c(27);
        taa.a(5, gba.field_Bb, 115, -24 + pda.field_p, lm.field_d, 0, 640);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 103 % ((45 - param3) / 59);
        mt.field_v = param2;
        wk.field_f = param0;
        ru.field_c = param1;
    }

    private cm(po param0, int param1) {
        super(param0, param1);
    }

    static {
        field_v = true;
        field_u = new jg();
    }
}

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
        if (param1 != 1) {
          cm.c(35);
          return uu.a(param0.field_w.length(), param1 + 82, '*');
        } else {
          return uu.a(param0.field_w.length(), param1 + 82, '*');
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          fs.field_f = param0;
          if (saa.field_b != eb.field_t) {
            var2 = saa.field_b * saa.field_b;
            var3 = var2 + -(eb.field_t * eb.field_t);
            param0 = param0 + (pda.field_p - param0) * var3 / var2;
            break L0;
          } else {
            break L0;
          }
        }
        i.field_a.a(120, 31407, 640, ce.field_t, param0);
        if (param1 != -111) {
          cm.c(27);
          taa.a(5, gba.field_Bb, 115, -24 + pda.field_p, lm.field_d, 0, 640);
          return;
        } else {
          taa.a(5, gba.field_Bb, 115, -24 + pda.field_p, lm.field_d, 0, 640);
          return;
        }
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = true;
        field_u = new jg();
    }
}

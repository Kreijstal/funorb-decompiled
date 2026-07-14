/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dla extends bf {
    static char field_j;
    nq field_n;
    static char[] field_i;
    static sna field_k;
    static String field_m;
    static hn field_l;

    final void a(int param0, lu param1) {
        er.a(((dla) this).field_n, 122, param1);
        int var3 = 126 % ((param0 - -53) / 50);
    }

    final void a(op param0, int param1) {
        if (param1 != -26281) {
            Object var4 = null;
            ((dla) this).a(-110, (lu) null);
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        rt.a(sc.field_n, (String) null, param0 + 9);
    }

    public static void a(int param0) {
        field_i = null;
        field_l = null;
        if (param0 != 1097) {
            return;
        }
        field_m = null;
        field_k = null;
    }

    final static void a(int param0, int[] param1, int param2, byte[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        for (var5 = 0; wa.field_m.length > var5; var5++) {
            param4 = wa.field_m[var5];
            var6 = var5 << 145116932;
            while (true) {
                param4--;
                if (param4 == 0) {
                    break;
                }
                var6++;
                param0 = ci.field_q[var6];
                param1[param3[param0]] = param1[param3[param0]] + 1;
                ci.field_q[param1[param3[param0]]] = param0;
            }
            var5++;
        }
        var6 = -20 / ((8 - param2) / 33);
    }

    dla(nq param0) {
        ((dla) this).field_n = param0;
    }

    dla(lu param0) {
        ((dla) this).field_n = qi.a(param0, (byte) 81);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new char[128];
        field_m = "Account created successfully!";
    }
}

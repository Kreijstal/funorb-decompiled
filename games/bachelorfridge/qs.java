/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qs extends pu {
    static int field_o;
    static kv[][] field_l;
    static sna field_m;
    static int field_n;

    final static String[][] a(boolean param0, lu param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        if (param0) {
            field_l = null;
        }
        int var2 = param1.e((byte) 117);
        int var3 = param1.e((byte) 95);
        String[][] var4 = new String[var2][var3];
        for (var5 = 0; var5 < var2; var5++) {
            for (var6 = 0; var6 < var3; var6++) {
                var4[var5][var6] = param1.h((byte) 120);
            }
        }
        return var4;
    }

    final static void b(boolean param0) {
        int var2 = BachelorFridge.field_y;
        i.field_h = new js(16);
        int var1 = 0;
        if (param0) {
            field_l = null;
        }
        while (nm.field_C.length > var1) {
            i.field_h.a((long)nm.field_C[var1].toLowerCase().hashCode(), (byte) 127, (bw) (Object) new ji(var1));
            var1++;
        }
    }

    public static void b(int param0) {
        if (param0 != -5232) {
            return;
        }
        field_m = null;
        field_l = null;
    }

    final static void c(int param0) {
        int var2 = BachelorFridge.field_y;
        if (lfa.field_q < -1) {
            lfa.field_q = lfa.field_q - 1;
        } else {
            if (-1 < ld.field_p) {
                ld.field_p = ld.field_p - 1;
            } else {
                if (!((dja.field_m ^ -1) >= -1)) {
                    dja.field_m = dja.field_m - 1;
                }
            }
        }
        if ((lfa.field_q ^ -1) < -1) {
            pm.f(param0 + 11100);
        }
        if ((ld.field_p ^ -1) < -1) {
            dna.c(ld.field_p, false);
        }
        if (!((dja.field_m ^ -1) >= -1)) {
            dna.c(dja.field_m, false);
        }
        if (param0 != -10901) {
            Object var3 = null;
            String[][] discarded$0 = qs.a(false, (lu) null);
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends qc {
    private int field_k;
    static String field_l;
    static String field_m;
    private int field_j;

    final pb b(byte param0) {
        if (param0 > -127) {
            return null;
        }
        return (pb) (Object) new ac();
    }

    final void a(byte param0) {
        int var2 = -16 / ((param0 - 29) / 42);
        tb.field_d.a(cb.field_p, 100, ((sh) this).field_k * (gi.field_m * 48), ((sh) this).field_j / ((sh) this).field_k);
        ((sh) this).field_j = 0;
        ((sh) this).field_k = 0;
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        ((sh) this).field_j = ((sh) this).field_j + param3;
        if (param0) {
          field_m = null;
          ((sh) this).field_k = ((sh) this).field_k + 1;
          return (f) (Object) new cj(bm.field_g, 0, 0, 0);
        } else {
          ((sh) this).field_k = ((sh) this).field_k + 1;
          return (f) (Object) new cj(bm.field_g, 0, 0, 0);
        }
    }

    public static void c(int param0) {
        field_l = null;
        if (param0 <= 83) {
            sh.c(100);
            field_m = null;
            return;
        }
        field_m = null;
    }

    sh() {
        ((sh) this).field_k = 0;
        ((sh) this).field_j = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Confirm Email:";
        field_l = "Enter";
    }
}

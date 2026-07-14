/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static int field_e;
    bl field_f;
    int field_b;
    int field_d;
    static ri field_a;
    int field_g;
    int field_c;
    hr field_h;

    final void a(bl param0, int param1, int param2, hr param3, int param4, int param5, int param6) {
        ((bl) this).field_f = param0;
        ((bl) this).field_h = param3;
        ((bl) this).field_d = param2;
        ((bl) this).field_b = param1;
        ((bl) this).field_c = param6;
        if (param4 != -1) {
          ((bl) this).field_d = -107;
          ((bl) this).field_g = param5;
          return;
        } else {
          ((bl) this).field_g = param5;
          return;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            bl.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
    }
}

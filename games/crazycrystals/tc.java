/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends rl {
    private int field_l;
    static long field_j;
    private int field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        if (param0) {
          ((tc) this).field_k = -21;
          ((tc) this).field_k = ((tc) this).field_k + param3;
          ((tc) this).field_l = ((tc) this).field_l + 1;
          return (f) (Object) new jo(bm.field_g, 0);
        } else {
          ((tc) this).field_k = ((tc) this).field_k + param3;
          ((tc) this).field_l = ((tc) this).field_l + 1;
          return (f) (Object) new jo(bm.field_g, 0);
        }
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            ((tc) this).field_l = 101;
            return (pb) (Object) new sh();
        }
        return (pb) (Object) new sh();
    }

    final void a(byte param0) {
        int var2 = -78 / ((29 - param0) / 42);
        tb.field_d.a(re.field_h, 100, ((tc) this).field_l * (48 * gi.field_m), ((tc) this).field_k / ((tc) this).field_l);
        ((tc) this).field_k = 0;
        ((tc) this).field_l = 0;
    }

    tc() {
        ((tc) this).field_k = 0;
        ((tc) this).field_l = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0L;
    }
}

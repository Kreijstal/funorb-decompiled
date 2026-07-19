/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static boolean field_b;
    static sl field_a;
    static volatile boolean field_c;

    public static void a(boolean param0) {
        if (!param0) {
            dl.a(false);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        if (param0 != 11560) {
          field_b = false;
          fb.field_l = false;
          discarded$4 = eh.field_d.c((byte) 34);
          return;
        } else {
          fb.field_l = false;
          discarded$5 = eh.field_d.c((byte) 34);
          return;
        }
    }

    static {
        field_b = true;
        field_c = true;
    }
}

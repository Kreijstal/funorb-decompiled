/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jg {
    static int[] field_b;
    static String field_a;
    static int field_e;
    static boolean field_d;
    static dd field_f;
    static String field_c;

    abstract int b(int param0);

    final static int c(int param0) {
        if (param0 != 24178) {
            int discarded$0 = jg.c(61);
            return em.field_d;
        }
        return em.field_d;
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract void a(int param0, java.awt.Component param1);

    final static byte[] a(boolean param0, Object param1, boolean param2) {
        byte[] var3 = null;
        hd var4 = null;
        if (param1 == null) {
            return null;
        }
        if (param1 instanceof byte[]) {
            var3 = (byte[]) param1;
            if (!param2) {
                return var3;
            }
            return rl.a(1, var3);
        }
        if (param0) {
            jg.a(-40);
            if (!(!(param1 instanceof hd))) {
                var4 = (hd) param1;
                return var4.b(256);
            }
            throw new IllegalArgumentException();
        }
        if (!(!(param1 instanceof hd))) {
            var4 = (hd) param1;
            return var4.b(256);
        }
        throw new IllegalArgumentException();
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > -9) {
          jg.a(-122);
          field_a = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading...";
        field_e = 0;
        field_c = "<%0>Anti-Gravity:<%1> when a flea touches one of these, the gravity is reversed and all the fleas fly upwards. Everything now works upside down, including balloons and springs. Touching it again turns the gravity back to normal.";
        field_b = new int[8192];
    }
}

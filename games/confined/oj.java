/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends nd {
    static int field_A;
    static String[] field_w;
    static String field_z;
    static String field_y;
    static int[] field_D;
    static int field_B;
    private Object field_v;
    static mi field_C;
    static int field_x;

    public static void e(int param0) {
        if (param0 != 20) {
          field_B = -32;
          field_w = null;
          field_y = null;
          field_C = null;
          field_z = null;
          field_D = null;
          return;
        } else {
          field_w = null;
          field_y = null;
          field_C = null;
          field_z = null;
          field_D = null;
          return;
        }
    }

    oj(Object param0, int param1) {
        super(param1);
        try {
            ((oj) this).field_v = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "oj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean f(byte param0) {
        if (param0 > -100) {
            return true;
        }
        return false;
    }

    final Object d(int param0) {
        if (param0 != -4) {
            oj.e(-107);
            return ((oj) this).field_v;
        }
        return ((oj) this).field_v;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Unfortunately we are unable to create an account for you at this time.";
        field_z = "<col=FFFFFF>Boss:</col> appears when you fight a boss, and indicates how much of its shield remains.";
        field_w = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_x = 20;
    }
}

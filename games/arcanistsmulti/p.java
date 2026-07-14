/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends RuntimeException {
    static kc field_d;
    static h field_b;
    static int field_c;
    Throwable field_g;
    static String field_j;
    String field_i;
    static int field_a;
    static String field_f;
    static String field_h;
    static int field_e;

    final static boolean a(int param0, String param1) {
        if (param0 != -1) {
            field_b = null;
            if (!(fn.field_f != null)) {
                return false;
            }
            return -1 >= param1.toLowerCase().indexOf(fn.field_f.toLowerCase()) ? true : false;
        }
        if (!(fn.field_f != null)) {
            return false;
        }
        return -1 <= param1.toLowerCase().indexOf(fn.field_f.toLowerCase()) ? true : false;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        Object var10 = null;
        if (param2 != 11) {
          var10 = null;
          boolean discarded$1 = p.a(2, (String) null);
          he.field_e.b((byte) -124, 58);
          he.field_e.f(param0, (byte) -82);
          he.field_e.c(param6, (byte) -68);
          he.field_e.c(param8, (byte) -68);
          he.field_e.c(param7, (byte) -95);
          he.field_e.c(param1, (byte) -59);
          he.field_e.c(param4, (byte) -66);
          he.field_e.f(param3, (byte) -35);
          he.field_e.f(param5, (byte) -128);
          return;
        } else {
          he.field_e.b((byte) -124, 58);
          he.field_e.f(param0, (byte) -82);
          he.field_e.c(param6, (byte) -68);
          he.field_e.c(param8, (byte) -68);
          he.field_e.c(param7, (byte) -95);
          he.field_e.c(param1, (byte) -59);
          he.field_e.c(param4, (byte) -66);
          he.field_e.f(param3, (byte) -35);
          he.field_e.f(param5, (byte) -128);
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -46) {
            return;
        }
        field_h = null;
        field_j = null;
        field_d = null;
        field_f = null;
    }

    p(Throwable param0, String param1) {
        ((p) this).field_g = param0;
        ((p) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 48;
        field_f = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_h = "Bombs:";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static qb field_e;
    static kc field_d;
    static int field_f;
    static String field_a;
    static char[] field_c;
    static int field_b;

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, int param1, byte param2) {
        rl.field_m = param0;
        int var3 = 0;
        ln.field_J = param1;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (de.field_e < param0 - -param1) {
          if (0 <= -param1 + param0 + param2) {
            return -param1 + (param2 + param0);
          } else {
            return -param1 + de.field_e;
          }
        } else {
          return param0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Minion Control";
        field_c = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}

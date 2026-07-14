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
        if (param0 != 48) {
            field_f = -128;
        }
    }

    final static void a(int param0, int param1, byte param2) {
        rl.field_m = param0;
        int var3 = -78 % ((param2 - 8) / 55);
        ln.field_J = param1;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (de.field_e < param0 - -param1) {
          if (0 > -param1 + param0 + param2) {
            if (param3 != 246) {
              return -40;
            } else {
              return -param1 + de.field_e;
            }
          } else {
            return -param1 + (param2 + param0);
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
        field_c = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}

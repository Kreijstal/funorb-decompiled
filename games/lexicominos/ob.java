/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends bl {
    static db field_e;
    static String[] field_f;
    static boolean field_c;
    static db field_d;

    final static StringBuilder a(int param0, StringBuilder param1, byte param2, char param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var4 = param1.length();
        param1.setLength(param0);
        if (param2 != 22) {
          field_d = null;
          var5 = var4;
          L0: while (true) {
            if (param0 <= var5) {
              return param1;
            } else {
              param1.setCharAt(var5, param3);
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = var4;
          L1: while (true) {
            if (param0 <= var5) {
              return param1;
            } else {
              param1.setCharAt(var5, param3);
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 < 112) {
          ob.b(119);
          field_e = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
    }
}

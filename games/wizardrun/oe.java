/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static o field_a;
    static ol[] field_d;
    private int[] field_b;
    static char[] field_c;

    final int b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = wizardrun.field_H;
          if (param0 >= 25) {
            break L0;
          } else {
            ((oe) this).field_b = null;
            break L0;
          }
        }
        var3 = (((oe) this).field_b.length >> 1865187489) - 1;
        var4 = var3 & param1;
        L1: while (true) {
          var5 = ((oe) this).field_b[1 + (var4 + var4)];
          if (-1 != var5) {
            if (param1 == ((oe) this).field_b[var4 + var4]) {
              return var5;
            } else {
              var4 = var4 - -1 & var3;
              continue L1;
            }
          } else {
            return -1;
          }
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = wizardrun.field_H;
        ie var4 = (ie) (Object) pa.field_e.b((byte) 68);
        while (var4 != null) {
            tb.a(param1, param0 ^ 18014, var4);
            var4 = (ie) (Object) pa.field_e.d(8192);
        }
        if (param0 != -86) {
            oe.a(100);
        }
        wl var2 = df.field_c.b((byte) 49);
        while (var2 != null) {
            ub.a(0, param1);
            var2 = df.field_c.d(8192);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = di.a(sb.a((byte) -75, param1), 74);
        if (param0 != 27) {
            return null;
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        int var1 = -88 / ((param0 - -38) / 59);
    }

    final static boolean a(byte param0, mg param1) {
        if (param0 != -55) {
            return true;
        }
        return -2 == (param1.g(1, -11719) ^ -1) ? true : false;
    }

    oe(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while ((param0.length >> -418586015) + param0.length >= var2) {
            var2 = var2 << 1;
        }
        ((oe) this).field_b = new int[var2 + var2];
        for (var3 = 0; var2 + var2 > var3; var3++) {
            ((oe) this).field_b[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3] & var2 + -1;
            while ((((oe) this).field_b[1 + (var4 + var4)] ^ -1) != 0) {
                var4 = -1 + var2 & var4 - -1;
            }
            ((oe) this).field_b[var4 - -var4] = param0[var3];
            ((oe) this).field_b[1 + (var4 - -var4)] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}

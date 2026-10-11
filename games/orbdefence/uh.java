/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static int field_a;
    static int field_b;
    static String field_c;

    final static int a(byte param0, int param1) {
        int var2;
        var2 = 0;
        if (0 > param1) {
          var2 += 16;
          param1 = param1 >>> 16;
        } else {
          if (65536 <= param1) {
            var2 += 16;
            param1 = param1 >>> 16;
          }
        }
        if (param1 >= 256) {
          param1 = param1 >>> 8;
          var2 += 8;
        }
        if (param1 >= 16) {
          var2 += 4;
          param1 = param1 >>> 4;
        }
        if (param1 >= 4) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        if (param0 > -47) {
          return 110;
        }
        return var2 + param1;
    }

    final static String b(int param0) {
        if (mg.field_m == qc.field_g) {
          return of.field_H;
        }
        if (param0 != 4) {
          return (String) null;
        }
        return wd.field_p;
    }

    private uh() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        if (param0 != -5) {
          field_b = -19;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_c = "IRONO";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca {
    static String field_d;
    static String field_a;
    static lk field_c;
    static String field_b;

    abstract void a(java.awt.Component param0, boolean param1);

    abstract int a(int param0);

    final static void b(byte param0) {
        if (param0 != 76) {
            return;
        }
        if (!(null == bk.field_r)) {
            bk.field_r.a((byte) -34);
        }
    }

    final static void a(int param0, int param1, bd param2) {
        rd.field_b.a(-12328, (hg) (Object) param2);
        r.a(-110, param2, param1);
        if (param0 != 1) {
            field_a = null;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_b = null;
        if (param0 != 104) {
          var2 = null;
          String discarded$2 = ca.a(-29, 'ﾠ', (String) null, (String) null);
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static String a(int param0, char param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = EscapeVector.field_A;
        var4 = param2.length();
        var5 = param3.length();
        var6 = var4;
        var7 = param0 + var5;
        if (-1 != (var7 ^ -1)) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param2.indexOf((int) param1, var8_int);
            if ((var8_int ^ -1) <= -1) {
              var6 = var6 + var7;
              var8_int++;
              continue L0;
            } else {
              var13 = new StringBuilder(var6);
              var8 = var13;
              var9 = 0;
              L1: while (true) {
                var10 = param2.indexOf((int) param1, var9);
                if ((var10 ^ -1) <= -1) {
                  StringBuilder discarded$6 = var13.append(param2.substring(var9, var10));
                  var9 = 1 + var10;
                  StringBuilder discarded$7 = var13.append(param3);
                  continue L1;
                } else {
                  StringBuilder discarded$8 = var13.append(param2.substring(var9));
                  return var13.toString();
                }
              }
            }
          }
        } else {
          var12 = new StringBuilder(var6);
          var9 = 0;
          L2: while (true) {
            var10 = param2.indexOf((int) param1, var9);
            if ((var10 ^ -1) <= -1) {
              StringBuilder discarded$9 = var12.append(param2.substring(var9, var10));
              var9 = 1 + var10;
              StringBuilder discarded$10 = var12.append(param3);
              continue L2;
            } else {
              StringBuilder discarded$11 = var12.append(param2.substring(var9));
              return var12.toString();
            }
          }
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
    }
}

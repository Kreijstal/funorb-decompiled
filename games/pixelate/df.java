/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends fa {
    int field_p;
    int field_q;
    int field_o;
    int field_k;
    static String[] field_r;
    int field_l;
    static String field_m;
    int field_n;

    final static void a(int param0, int param1, int param2) {
        pc var4 = null;
        eq var6 = null;
        eq var7 = null;
        eq var9 = null;
        eq var12 = null;
        if (param0 != 3) {
          L0: {
            field_m = null;
            if (ec.field_r == param1) {
              break L0;
            } else {
              L1: {
                var6 = (eq) (Object) dg.field_f.a(-11434, (long)ec.field_r);
                var7 = var6;
                var6 = var7;
                ec.field_r = param1;
                if (var7 != null) {
                  var7.field_Ub = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = aa.field_f;
              var4.g(param2, param0 ^ 15513);
              var4.e(160, 3);
              var4.e(160, 11);
              var4.b(1276387944, param1);
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (ec.field_r == param1) {
              break L2;
            } else {
              L3: {
                var12 = (eq) (Object) dg.field_f.a(-11434, (long)ec.field_r);
                var6 = var12;
                var9 = var12;
                ec.field_r = param1;
                if (var9 != null) {
                  var9.field_Ub = null;
                  break L3;
                } else {
                  break L3;
                }
              }
              var4 = aa.field_f;
              var4.g(param2, param0 ^ 15513);
              var4.e(160, 3);
              var4.e(160, 11);
              var4.b(1276387944, param1);
              break L2;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 3) {
            field_m = null;
            field_r = null;
            field_m = null;
            return;
        }
        field_r = null;
        field_m = null;
    }

    private df() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Elapsed time";
    }
}

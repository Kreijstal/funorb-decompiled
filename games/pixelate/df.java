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
        eq var12 = null;
        eq var9 = null;
        eq var7 = null;
        eq var6 = null;
        pc var4 = null;
        eq var6Lifetime1;
        pc var4Lifetime1;
        eq var6Lifetime1Lifetime1;
        if (param0 == 3) {
          if (ec.field_r != param1) {
            var12 = (eq) (dg.field_f.a(-11434, (long)ec.field_r));
            var6 = var12;
            var9 = var12;
            ec.field_r = param1;
            if (var9 != null) {
              var9.field_Ub = null;
            }
            var4 = aa.field_f;
            var4.g(param2, param0 ^ 15513);
            var4.e(160, 3);
            var4.e(160, 11);
            var4.b(1276387944, param1);
          }
          return;
        }
        field_m = (String) null;
        if (ec.field_r != param1) {
          var6Lifetime1 = (eq) (dg.field_f.a(-11434, (long)ec.field_r));
          var7 = var6Lifetime1;
          var6Lifetime1Lifetime1 = var7;
          ec.field_r = param1;
          if (var7 != null) {
            var7.field_Ub = null;
          }
          var4Lifetime1 = aa.field_f;
          var4Lifetime1.g(param2, param0 ^ 15513);
          var4Lifetime1.e(160, 3);
          var4Lifetime1.e(160, 11);
          var4Lifetime1.b(1276387944, param1);
        }
    }

    public static void a(int param0) {
        if (param0 != 3) {
          field_m = (String) null;
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
        field_m = "Elapsed time";
    }
}

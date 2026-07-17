/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_a;

    final static void b(int param0, byte param1) {
        if (param0 == msa.field_a) {
          if (null != rba.field_a) {
            if (fna.field_j != null) {
              aoa.a(77, 1);
              if (param1 > 105) {
                aoa.a(91, 2);
                if (mh.field_I != 0) {
                  v.b(1, 0);
                  mh.field_I = -mh.field_I + 1;
                  qb.a(param0, 5);
                  v.b(uca.field_c.a(6, 0) + 3, 0);
                  return;
                } else {
                  v.b(2, 0);
                  mh.field_I = -mh.field_I + 1;
                  qb.a(param0, 5);
                  v.b(uca.field_c.a(6, 0) + 3, 0);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static su a(int param0, byte param1) {
        su[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        su[] var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        var5 = cma.c(126);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (var5[var3].field_a != param0) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "From <%0>: ";
    }
}

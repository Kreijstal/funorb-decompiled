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
                if (-1 != (mh.field_I ^ -1)) {
                  v.b(1, 0);
                  if (TombRacer.field_G) {
                    v.b(2, 0);
                    mh.field_I = -mh.field_I + 1;
                    qb.a(param0, 5);
                    v.b(uca.field_c.a(6, 0) + 3, 0);
                    return;
                  } else {
                    mh.field_I = -mh.field_I + 1;
                    qb.a(param0, 5);
                    v.b(uca.field_c.a(6, 0) + 3, 0);
                    return;
                  }
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
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        su[] var5 = cma.c(126);
        su[] var2 = var5;
        if (param1 <= 125) {
            li.b(-46, (byte) -102);
            var3 = 0;
            do {
                if (var5.length <= var3) {
                    return null;
                }
                if (var5[var3].field_a == param0) {
                    return var5[var3];
                }
                var3++;
            } while (var4 == 0);
            return null;
        }
        var3 = 0;
        do {
            if (var5.length <= var3) {
                return null;
            }
            if (var5[var3].field_a == param0) {
                return var5[var3];
            }
            var3++;
        } while (var4 == 0);
        return null;
    }

    public static void a(int param0) {
        if (param0 != 3) {
            field_a = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = "From <%0>: ";
    }
}

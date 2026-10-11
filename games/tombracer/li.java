/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_a;

    final static void b(int param0, byte param1) {
        if (param0 != msa.field_a) {
          return;
        }
        if (null == rba.field_a) {
          return;
        }
        if (fna.field_j == null) {
          return;
        }
        aoa.a(77, 1);
        if (param1 <= 105) {
          return;
        }
        aoa.a(91, 2);
        if (mh.field_I == 0) {
          v.b(2, 0);
          mh.field_I = -mh.field_I + 1;
          qb.a(param0, 5);
          v.b(uca.field_c.a(6, 0) + 3, 0);
          return;
        }
        v.b(1, 0);
        mh.field_I = -mh.field_I + 1;
        qb.a(param0, 5);
        v.b(uca.field_c.a(6, 0) + 3, 0);
    }

    final static su a(int param0, byte param1) {
        su[] var2;
        int var3;
        int var4;
        su[] var5;
        int var3Lifetime1;
        var4 = TombRacer.field_G ? 1 : 0;
        var5 = cma.c(126);
        var2 = var5;
        if (param1 > 125) {
          for (var3 = 0; var5.length > var3; var3++) {
            if (var5[var3].field_a == param0) {
              return var5[var3];
            }
          }
          return null;
        }
        li.b(-46, (byte) -102);
        for (var3Lifetime1 = 0; var5.length > var3Lifetime1; var3Lifetime1++) {
          if (var5[var3Lifetime1].field_a == param0) {
            return var5[var3Lifetime1];
          }
        }
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

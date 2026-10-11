/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static int field_a;
    private static String field_z;

    final static sj a(int param0, int param1, int param2, int param3, int param4) {
        sj var5;
        int var6;
        sj var5Lifetime1;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param1 > -55) {
          return (sj) null;
        }
        var5 = (sj) (il.field_b.a(true));
        while (var5 != null) {
          if (param4 == var5.field_h) {
            return var5;
          }
          var5 = (sj) (il.field_b.f(2));
        }
        var5Lifetime1 = new sj();
        var5Lifetime1.field_h = param4;
        var5Lifetime1.field_m = param0;
        var5Lifetime1.field_o = param2;
        il.field_b.b(116, var5Lifetime1);
        uh.a(var5Lifetime1, (byte) -121, param3);
        return var5Lifetime1;
    }

    static {
        field_z = "ud.A(";
        field_a = 0;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    private static String field_z;

    final static ts a(int param0, int param1) {
        int var3 = 0;
        ts[] var2;
        int var4;
        ts[] var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var5 = pb.a(96);
        var2 = var5;
        if (param0 != 10341) {
          return (ts) null;
        }
        for (var3 = 0; var5.length > var3; var3++) {
          if (param1 == var5[var3].field_b) {
            return var5[var3];
          }
        }
        return null;
    }

    static {
        field_z = "ij.A(";
    }
}

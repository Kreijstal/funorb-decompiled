/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static String field_a;
    static he field_b;

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 53) {
          mc.a((byte) 52);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int a(int param0) {
        int var1 = -107 / ((param0 + 53) / 59);
        return ak.field_e;
    }

    final static ci a(byte param0) {
        int var4_int = 0;
        ci var4 = null;
        int var5 = Terraphoenix.field_V;
        int var1 = rf.field_p[0] * sb.field_m[0];
        byte[] var2 = qc.field_b[0];
        int[] var3 = new int[var1];
        ci var4Lifetime1;
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = wb.field_a[dg.a(255, (int) var2[var4_int])];
        }
        if (param0 > 92) {
          var4 = new ci(ah.field_A, sb.field_j, ha.field_s[0], hj.field_K[0], sb.field_m[0], rf.field_p[0], var3);
          mj.a((byte) 69);
          return var4;
        }
        mc.b((byte) -126);
        var4Lifetime1 = new ci(ah.field_A, sb.field_j, ha.field_s[0], hj.field_K[0], sb.field_m[0], rf.field_p[0], var3);
        mj.a((byte) 69);
        return var4Lifetime1;
    }

    static {
        field_a = "Starting Turn ";
    }
}

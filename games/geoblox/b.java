/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_a;
    static eb field_b;

    final static void a(boolean param0, boolean param1, boolean param2) {
        Object var4 = null;
        og.a(2274, (String) null, param1, param0);
        if (param2) {
            b.a(true, false, true);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final static ck a(boolean param0, int param1) {
        ck[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ck[] var5 = null;
        var4 = Geoblox.field_C;
        var5 = fe.a(-1);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var3 < var5.length) {
            if (param1 == var5[var3].field_b) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    static {
    }
}

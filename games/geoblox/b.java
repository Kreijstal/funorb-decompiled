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
        if (param0 != 17062) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static ck a(boolean param0, int param1) {
        ck[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Geoblox.field_C;
          var2 = fe.a(-1);
          var3 = 0;
          if (!param0) {
            break L0;
          } else {
            b.a(-38);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 < var2.length) {
            if (param1 == var2[var3].field_b) {
              return var2[var3];
            } else {
              var3++;
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    static {
    }
}

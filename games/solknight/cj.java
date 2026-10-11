/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static long field_c;
    static String field_b;
    static nc field_a;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -26497) {
          return;
        }
        field_b = null;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          var1_int = 75 / ((param0 - 8) / 49);
          u.field_b.a(-1, th.field_K, true, ee.field_l);
          u.field_b.c(false);
          while (wk.a((byte) -56)) {
            u.field_b.a(el.field_n, ta.field_d, (byte) -48);
          }
          if (he.field_b != -1) {
            var2 = he.field_b;
            h.a(-1, true);
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          if (ce.field_b) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (gf.field_Z == gb.field_i) {
            stackIn_13_0 = 1;
            return stackIn_13_0;
          }
          if (!td.field_h.a(false)) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (ma.field_o != gf.field_Z) {
            stackIn_22_0 = -1;
            return stackIn_22_0;
          }
          stackIn_20_0 = 2;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "cj.B(" + param0 + ')');
        }
    }

    static {
        field_b = "Accept";
        field_a = new nc();
    }
}

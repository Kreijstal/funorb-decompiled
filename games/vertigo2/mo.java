/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mo {
    static String field_b;
    static String field_d;
    static String field_c;
    static nj field_h;
    static String field_e;
    static String field_i;
    static String field_g;
    static String field_a;
    static String field_f;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_i = null;
        field_e = null;
        field_h = null;
        field_f = null;
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 55;
            var2 = 0;
            L1: while (true) {
              if (rk.field_A.length <= var2) {
                break L0;
              } else {
                var3 = tk.field_c.c(rk.field_A[var2]);
                qi.a(false, -var3 + 620, var3, var1_int);
                tk.field_c.b(rk.field_A[var2], -var3 + 620, -2 + var1_int + (tk.field_c.field_D + 30) / 2, 16777215, -1);
                var1_int += 50;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "mo.G(" + true + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Hide private chat and appear offline to friends";
        field_e = "Join";
        field_c = "<%0> wants to draw.";
        field_b = "Fullscreen";
        field_i = "Show lobby chat from my friends";
        field_g = "Searching for opponents";
        field_h = new nj();
        field_a = "Names cannot contain consecutive spaces";
        field_f = "Total Time <%0>";
    }
}

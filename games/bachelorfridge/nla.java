/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nla {
    static boolean field_f;
    static sna field_b;
    static String field_e;
    static double field_d;
    static int[] field_a;
    gfa[] field_g;
    static String field_c;

    final void a(cda param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (param1) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= 11) {
                  break L0;
                } else {
                  ((nla) this).field_g[var3_int].field_h = param0.field_b[var3_int].field_h;
                  ((nla) this).field_g[var3_int].field_l = param0.field_b[var3_int].field_l;
                  ((nla) this).field_g[var3_int].field_d = param0.field_b[var3_int].field_d;
                  ((nla) this).field_g[var3_int].field_e = param0.field_b[var3_int].field_e;
                  ((nla) this).field_g[var3_int].field_j = param0.field_b[var3_int].field_j;
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("nla.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
    }

    nla() {
        int var1 = 0;
        ((nla) this).field_g = new gfa[11];
        for (var1 = 0; ((nla) this).field_g.length > var1; var1++) {
            ((nla) this).field_g[var1] = new gfa(0, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_d = 0.0;
        field_e = "You have withdrawn your request to join.";
        field_c = "Discard";
        field_a = new int[]{16777215, 15515761, 16101691, 15175695, 12219915, 9982214, 6040836, 2954769};
    }
}

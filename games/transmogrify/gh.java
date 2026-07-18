/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends wf {
    byte[] field_k;
    int field_j;
    static int field_l;
    static tf field_g;
    static int field_h;
    static sd field_m;
    static boolean field_i;

    final static void d() {
        cf var1 = null;
        hj var2 = null;
        var1 = (cf) (Object) mh.field_e.a((byte) -95);
        if (var1 == null) {
          int discarded$10 = 1;
          pc.a();
          return;
        } else {
          var2 = nf.field_l;
          int discarded$11 = var2.c((byte) -126);
          int discarded$12 = var2.c((byte) -108);
          int discarded$13 = var2.c((byte) -105);
          int discarded$14 = var2.c((byte) -119);
          var1.c(5);
          return;
        }
    }

    public static void e() {
        field_m = null;
        field_g = null;
    }

    private gh() throws Throwable {
        throw new Error();
    }

    final static void a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (uk.b(114, var3) == 0L) {
                  break L1;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("gh.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -112 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -17;
        field_g = new tf(10, 2, 2, 0);
        field_i = false;
    }
}

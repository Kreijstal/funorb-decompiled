/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static jc field_e;
    static long field_b;
    static km field_g;
    static int field_d;
    static String field_f;
    static km[][][][] field_c;
    static String field_a;
    static String field_h;

    final static void a(int param0, boolean param1) {
        pi.field_c.a(param1, -1730123902);
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (bc.field_b < 70) {
          rf.b(80, 10 + bc.field_b);
          var1 = 0;
          return;
        } else {
          rf.b(80, 80);
          var1 = 0;
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_h = null;
        field_g = null;
        field_a = null;
        if (param0 != 12) {
          cl.a(40);
          field_c = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static fn[] a(int param0, nk param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fn[] var4 = null;
        int var5 = 0;
        fn var6_ref_fn = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        fn[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        fn[] stackOut_13_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            var2_int = param1.e(-16, 8);
            if (var2_int <= 0) {
              var3 = param1.e(108, 12);
              var4 = new fn[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_13_0 = (fn[]) var4;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    if (!r.a(true, param1)) {
                      var6 = param1.e(-63, kb.a(-1 + var5, 74));
                      var4[var5] = var4[var6];
                      var5++;
                      break L2;
                    } else {
                      var6_ref_fn = new fn();
                      int discarded$126 = param1.e(122, 24);
                      int discarded$127 = param1.e(-33, 24);
                      var6_ref_fn.field_g = param1.e(-94, 24);
                      int discarded$128 = param1.e(123, 9);
                      int discarded$129 = param1.e(-18, 12);
                      int discarded$130 = param1.e(110, 12);
                      int discarded$131 = param1.e(105, 12);
                      var4[var5] = var6_ref_fn;
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (fn[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("cl.D(").append(-4974).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new km(0, 0);
        field_f = "Create unrated game";
        field_c = new km[2][2][2][7];
        field_a = "Match by...";
        field_h = "Honour";
    }
}

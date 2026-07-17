/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static int field_e;
    static int[][] field_c;
    static String field_b;
    static hj[] field_a;
    static int field_d;

    public static void b() {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static tg a(wd param0) {
        RuntimeException var3 = null;
        hn var3_ref = null;
        oe var4 = null;
        g var4_ref = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        dd var7 = null;
        g stackIn_4_0 = null;
        oe stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe stackOut_14_0 = null;
        g stackOut_3_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (!(param0 instanceof dd)) {
              L1: {
                var3_ref = (hn) (Object) param0;
                var4 = new oe(param0.f(50), param0.field_k, false);
                var5 = var3_ref.field_A;
                var6 = var3_ref.field_K;
                var4.field_l = var3_ref.field_H;
                if (var6 < var5) {
                  var5 = 1.0f - var5;
                  var4.field_k = var3_ref.field_Q;
                  var6 = -var6 + 1.0f;
                  var4.field_m = var3_ref.field_F;
                  break L1;
                } else {
                  var4.field_k = var3_ref.field_F;
                  var4.field_m = var3_ref.field_Q;
                  break L1;
                }
              }
              L2: {
                if (0.0f == var5) {
                  break L2;
                } else {
                  var4 = oc.a(var5, 16711935, var4);
                  var6 = (-var5 + var6) / (-var5 + 1.0f);
                  break L2;
                }
              }
              L3: {
                if (var6 == 1.0f) {
                  break L3;
                } else {
                  var4 = ua.a(false, var6, var4);
                  break L3;
                }
              }
              if (!Float.isNaN(var4.field_e)) {
                stackOut_14_0 = (oe) var4;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                throw new RuntimeException();
              }
            } else {
              var7 = (dd) (Object) param0;
              var4_ref = new g(param0.f(50), param0.field_k, false);
              var4_ref.field_n = var7.p(-1);
              var4_ref.field_j = var7.b((byte) -105);
              stackOut_3_0 = (g) var4_ref;
              stackIn_4_0 = stackOut_3_0;
              return (tg) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("hk.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 1 + 44 + 0 + 41);
        }
        return (tg) (Object) stackIn_15_0;
    }

    final static void a() {
        go.a(0, 4);
    }

    final static void a(boolean param0) {
        dj.a(true, qd.field_k, -94, ij.field_k);
        gn.field_g = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Continue";
    }
}

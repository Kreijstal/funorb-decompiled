/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class st {
    static String[] field_b;
    static float[] field_a;

    final static me[] a(boolean param0, dl param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        me[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        me var6_ref_me = null;
        int var7 = 0;
        me[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        me[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.b((byte) -96, 8);
            if (var2_int <= 0) {
              var3 = param1.b((byte) -77, 12);
              var4 = new me[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_15_0 = (me[]) var4;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  L2: {
                    if (!tn.a(101, param1)) {
                      var6 = param1.b((byte) 83, eo.a(112, var5 - 1));
                      var4[var5] = var4[var6];
                      var5++;
                      break L2;
                    } else {
                      var6_ref_me = new me();
                      int discarded$6 = param1.b((byte) 110, 24);
                      int discarded$7 = param1.b((byte) 80, 24);
                      var6_ref_me.field_c = param1.b((byte) 114, 24);
                      int discarded$8 = param1.b((byte) -76, 9);
                      int discarded$9 = param1.b((byte) -56, 12);
                      int discarded$10 = param1.b((byte) -49, 12);
                      int discarded$11 = param1.b((byte) 103, 12);
                      var4[var5] = var6_ref_me;
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("st.C(").append(1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    public static void b() {
        field_a = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(boolean param0, boolean param1, boolean param2) {
        int var4 = 0;
        var4 = 0;
        if (param0) {
          L0: {
            var4 += 4;
            if (param2) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          return wd.field_G[var4];
        } else {
          L1: {
            if (param2) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          return wd.field_G[var4];
        }
    }

    final static void a() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[16];
        field_a = new float[4];
    }
}

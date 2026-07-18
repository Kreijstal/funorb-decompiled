/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends na {
    static int field_i;
    static ka field_j;
    static String field_k;

    public static void g(int param0) {
        field_k = null;
        field_j = null;
        if (param0 != 12) {
            field_k = null;
        }
    }

    final static qk a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        qk var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        qk stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        qk stackOut_17_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (gl.field_e != null) {
            if (param1 != null) {
              if (param1.length() != 0) {
                var6 = (CharSequence) (Object) param1;
                var2 = il.a(var6, (byte) 21);
                if (var2 != null) {
                  var3 = (qk) (Object) gl.field_e.a(true, (long)var2.hashCode());
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_F;
                      var4 = il.a(var7, (byte) 21);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3 = (qk) (Object) gl.field_e.a((byte) 125);
                        continue L0;
                      } else {
                        stackOut_17_0 = (qk) var3;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref;
            stackOut_21_1 = new StringBuilder().append("ri.E(").append(0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final am a(boolean param0) {
        if (!param0) {
            ri.g(-27);
            return dh.field_V;
        }
        return dh.field_V;
    }

    final static void f(int param0) {
        if (!(pg.field_p == null)) {
            je.a((byte) 15, pg.field_p);
        }
        pg.field_p = null;
        ok.field_a = null;
        fe var1 = cj.field_h[10];
        int var2 = ab.field_g[10];
        e discarded$0 = ol.a(-118, var1, var2);
    }

    final static void a(String param0, byte param1) {
        try {
            kg.field_P = param0;
            fk.a(true, 12);
            int var2_int = -108 / ((param1 - -3) / 57);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "ri.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ri(long param0, String param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = -1;
        field_k = "Confirm Password: ";
    }
}

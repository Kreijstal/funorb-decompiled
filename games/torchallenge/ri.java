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
            field_k = (String) null;
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
        qk stackIn_10_0 = null;
        qk stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qk stackOut_18_0 = null;
        qk stackOut_9_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (gl.field_e != null) {
              if (param1 != null) {
                if (param1.length() != 0) {
                  var6 = (CharSequence) ((Object) param1);
                  var2 = il.a(var6, (byte) 21);
                  if (param0 == 0) {
                    if (var2 != null) {
                      var3 = (qk) ((Object) gl.field_e.a(true, (long)var2.hashCode()));
                      L1: while (true) {
                        if (var3 != null) {
                          var7 = (CharSequence) ((Object) var3.field_F);
                          var4 = il.a(var7, (byte) 21);
                          if (!var4.equals(var2)) {
                            var3 = (qk) ((Object) gl.field_e.a((byte) 125));
                            continue L1;
                          } else {
                            stackOut_18_0 = (qk) (var3);
                            stackIn_19_0 = stackOut_18_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    stackOut_9_0 = (qk) null;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2_ref);
            stackOut_22_1 = new StringBuilder().append("ri.E(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_19_0;
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
        e discarded$4 = null;
        e discarded$5 = null;
        fe var1 = null;
        int var2 = 0;
        L0: {
          if (pg.field_p != null) {
            je.a((byte) 15, pg.field_p);
            break L0;
          } else {
            break L0;
          }
        }
        pg.field_p = null;
        ok.field_a = null;
        var1 = cj.field_h[10];
        if (param0 < 122) {
          field_j = (ka) null;
          var2 = ab.field_g[10];
          discarded$4 = ol.a(-118, var1, var2);
          return;
        } else {
          var2 = ab.field_g[10];
          discarded$5 = ol.a(-118, var1, var2);
          return;
        }
    }

    final static void a(String param0, byte param1) {
        try {
            kg.field_P = param0;
            fk.a(true, 12);
            int var2_int = -108 / ((param1 - -3) / 57);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ri.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ri(long param0, String param1) {
        super(param0, param1);
    }

    static {
        field_i = -1;
        field_k = "Confirm Password: ";
    }
}

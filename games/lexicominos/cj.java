/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends kd {
    static volatile int field_i;
    byte[] field_h;

    final static hc a(byte param0, String param1) {
        Object var2 = null;
        hc var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        hc stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        hc stackOut_14_0 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (null != cl.field_P) {
              L1: {
                var6 = (CharSequence) (Object) param1;
                int discarded$4 = -48;
                var2 = (Object) (Object) ck.a(var6);
                if (var2 == null) {
                  var2 = (Object) (Object) var6;
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = (hc) (Object) cl.field_P.a((long)((String) var2).hashCode(), true);
              L2: while (true) {
                if (var3 == null) {
                  var4 = -88 % ((-51 - param0) / 52);
                  stackOut_17_0 = null;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L3: {
                    var7 = (CharSequence) (Object) var3.field_R;
                    int discarded$5 = -48;
                    var4_ref_String = ck.a(var7);
                    if (var4_ref_String == null) {
                      var4_ref_String = var3.field_R;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (var4_ref_String.equals(var2)) {
                    stackOut_14_0 = (hc) var3;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    var3 = (hc) (Object) cl.field_P.b(-99);
                    continue L2;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_19_0 = var2;
            stackOut_19_1 = new StringBuilder().append("cj.A(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return (hc) (Object) stackIn_18_0;
    }

    cj(byte[] param0) {
        try {
            ((cj) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "cj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = -1;
    }
}

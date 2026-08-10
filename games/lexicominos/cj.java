/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends kd {
    static volatile int field_i;
    byte[] field_h;

    final static hc a(byte param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        hc var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        hc stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (null != cl.field_P) {
              L1: {
                var6 = (CharSequence) ((Object) param1);
                var2 = ck.a(var6, (byte) -48);
                if (var2 == null) {
                  var2 = param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = (hc) ((Object) cl.field_P.a((long)var2.hashCode(), true));
              L2: while (true) {
                if (var3 == null) {
                  var4 = -88 % ((-51 - param0) / 52);
                  stackIn_18_0 = null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var7 = (CharSequence) ((Object) var3.field_R);
                    var4_ref_String = ck.a(var7, (byte) -48);
                    if (var4_ref_String == null) {
                      var4_ref_String = var3.field_R;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (var4_ref_String.equals(var2)) {
                    stackIn_15_0 = (hc) (var3);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var3 = (hc) ((Object) cl.field_P.b(-99));
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
            var2_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("cj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return (hc) ((Object) stackIn_18_0);
        }
    }

    cj(byte[] param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "cj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = -1;
    }
}

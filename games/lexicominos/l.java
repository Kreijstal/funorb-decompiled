/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends mg {
    static String field_E;
    static int[] field_F;
    static int field_G;
    static int[] field_D;
    static String field_C;

    public static void h(int param0) {
        field_D = null;
        if (param0 != 4) {
          l.h(36);
          field_E = null;
          field_C = null;
          field_F = null;
          return;
        } else {
          field_E = null;
          field_C = null;
          field_F = null;
          return;
        }
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        hh var7 = null;
        RuntimeException var7_ref = null;
        hh var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3 ^ param3, param4, param5);
              var8 = si.field_t;
              var7 = var8;
              if (var8 == null) {
                break L1;
              } else {
                if (((l) this).a(param5, param1, param4, param2, (byte) -117)) {
                  if (((l) this).field_r instanceof wk) {
                    ((wk) (Object) ((l) this).field_r).a(16797, (l) this, var8);
                    si.field_t = null;
                    return;
                  } else {
                    if (!(var8.field_r instanceof wk)) {
                      break L1;
                    } else {
                      ((wk) (Object) var8.field_r).a(16797, (l) this, var8);
                      si.field_t = null;
                      return;
                    }
                  }
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
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("l.BB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void i(int param0) {
        int var1 = -37;
    }

    private l(int param0, int param1, int param2, int param3, rd param4, vd param5, w param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((l) this).field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "l.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[4];
        field_C = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_E = "Members";
    }
}

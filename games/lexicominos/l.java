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
        RuntimeException var7 = null;
        hh var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3 ^ param3, param4, param5);
              var8 = si.field_t;
              if (var8 == null) {
                break L1;
              } else {
                if (this.a(param5, param1, param4, param2, (byte) -117)) {
                  if (this.field_r instanceof wk) {
                    ((wk) ((Object) this.field_r)).a(16797, (l) (this), var8);
                    si.field_t = null;
                    return;
                  } else {
                    if (!(var8.field_r instanceof wk)) {
                      break L1;
                    } else {
                      ((wk) ((Object) var8.field_r)).a(16797, (l) (this), var8);
                      si.field_t = null;
                      if (!Lexicominos.field_L) {
                        break L1;
                      } else {
                        ((wk) ((Object) this.field_r)).a(16797, (l) (this), var8);
                        si.field_t = null;
                        return;
                      }
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
            var7 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var7);
            stackOut_10_1 = new StringBuilder().append("l.BB(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void i(int param0) {
        int var1 = 74 / ((-45 - param0) / 38);
    }

    private l(int param0, int param1, int param2, int param3, rd param4, vd param5, w param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "l.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = new int[4];
        field_C = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_E = "Members";
    }
}

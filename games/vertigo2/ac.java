/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends oh {
    static String field_M;
    static byte[][] field_O;
    static String field_N;
    static r field_G;
    static String field_L;
    static String field_J;
    static int[] field_I;
    static int[] field_K;

    private ac(int param0, int param1, int param2, int param3, ur param4, uf param5, iq param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_C = param6;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ac.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(byte param0) {
        field_G = null;
        field_M = null;
        field_K = null;
        field_I = null;
        if (param0 <= 61) {
          field_G = (r) null;
          field_O = (byte[][]) null;
          field_L = null;
          field_J = null;
          field_N = null;
          return;
        } else {
          field_O = (byte[][]) null;
          field_L = null;
          field_J = null;
          field_N = null;
          return;
        }
    }

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        qg var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = um.field_E;
              if (var7 == null) {
                break L1;
              } else {
                if (!this.a(0, param3, param2, param4, param5)) {
                  break L1;
                } else {
                  if (!(this.field_v instanceof sh)) {
                    if (var7.field_v instanceof sh) {
                      ((sh) ((Object) var7.field_v)).a(param1 ^ -13387, var7, (ac) (this));
                      um.field_E = null;
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    ((sh) ((Object) this.field_v)).a(param1 ^ -13387, var7, (ac) (this));
                    um.field_E = null;
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("ac.HA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_M = "Offensive account name";
        field_J = "<%0> might change the options - wait and see.";
        field_N = "Shortcut Reference";
        field_L = "Creating your account";
        field_O = new byte[1000][];
        field_K = new int[16384];
    }
}

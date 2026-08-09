/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends en {
    static hl field_O;
    static String field_N;
    static String field_Q;
    static int field_P;
    static int field_R;

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        ed var7 = null;
        RuntimeException var7_ref = null;
        ed var8 = null;
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
              var8 = gi.field_c;
              var7 = var8;
              if (var8 == null) {
                break L1;
              } else {
                if (this.b(param4, 1343807649, param5, param3, param0)) {
                  if (this.field_s instanceof hf) {
                    ((hf) ((Object) this.field_s)).a(var8, 108, (te) (this));
                    gi.field_c = null;
                    return;
                  } else {
                    if (!(var8.field_s instanceof hf)) {
                      break L1;
                    } else {
                      ((hf) ((Object) var8.field_s)).a(var8, 92, (te) (this));
                      gi.field_c = null;
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
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("te.AB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 > -6) {
          te.h(115);
          field_N = null;
          field_Q = null;
          field_O = null;
          return;
        } else {
          field_N = null;
          field_Q = null;
          field_O = null;
          return;
        }
    }

    private te(int param0, int param1, int param2, int param3, kg param4, dn param5, na param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_J = param6;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "te.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = "Account created successfully!";
        field_P = 480;
        field_Q = "Unable to delete friend - system busy";
    }
}

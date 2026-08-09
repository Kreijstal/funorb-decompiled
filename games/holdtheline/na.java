/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends hl {
    int field_m;
    static boolean field_k;
    boolean field_j;
    static ib field_s;
    static hj field_t;
    int field_n;
    static va field_q;
    static vn field_p;
    int field_i;
    int field_l;
    static String field_o;
    static int[] field_r;

    final static void a(int param0, ih param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              io.field_c.a((byte) -105, param1);
              mk.a(1, param0, param1);
              if (param2 == -79) {
                break L1;
              } else {
                na.a(54);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("na.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_t = null;
        field_o = null;
        field_q = null;
        field_s = null;
        field_p = null;
        if (param0 >= -70) {
            field_q = (va) null;
        }
    }

    na(int param0, int param1, int param2, int param3, hj param4) {
        try {
            this.field_l = param0;
            this.field_j = false;
            this.field_i = param3;
            this.field_n = param1;
            this.field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "na.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = false;
        field_o = "Creating your account";
        field_r = new int[128];
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ajb extends ksa {
    int[] field_k;
    int field_j;
    int field_h;
    int field_g;
    static clb field_f;
    int field_i;
    int field_d;
    int field_e;

    final static void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        String var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              vda.field_o = param1;
              if (param0 == -74) {
                break L1;
              } else {
                var3 = (String) null;
                ajb.a((byte) 76, (String) null);
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

            stackIn_5_1 = new StringBuilder().append("ajb.C(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void c(byte param0) {
        field_f = null;
        if (param0 != 44) {
            ajb.c((byte) 98);
        }
    }

    final void a(int param0, int[] param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_g = param2;
            this.field_e = param5;
            this.field_d = param6;
            this.field_k = param1;
            if (param3 >= -84) {
                this.field_j = -65;
            }
            this.field_i = param0;
            this.field_h = param4;
            this.field_j = param7;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ajb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    ajb() {
    }

    static {
        field_f = new clb();
    }
}

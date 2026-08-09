/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends qc {
    private int field_k;
    static String field_l;
    static String field_m;
    private int field_j;

    final pb b(byte param0) {
        if (param0 > -127) {
            return (pb) null;
        }
        return (pb) ((Object) new ac());
    }

    final void a(byte param0) {
        int var2 = -16 / ((param0 - 29) / 42);
        tb.field_d.a(cb.field_p, 100, this.field_k * (gi.field_m * 48), this.field_j / this.field_k);
        this.field_j = 0;
        this.field_k = 0;
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        cj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_j = this.field_j + param3;
              if (!param0) {
                break L1;
              } else {
                field_m = (String) null;
                break L1;
              }
            }
            this.field_k = this.field_k + 1;
            stackIn_3_0 = new cj(bm.field_g, 0, 0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("sh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (f) ((Object) stackIn_3_0);
    }

    public static void c(int param0) {
        field_l = null;
        if (param0 <= 83) {
            sh.c(100);
            field_m = null;
            return;
        }
        field_m = null;
    }

    sh() {
        this.field_k = 0;
        this.field_j = 0;
    }

    static {
        field_m = "Confirm Email:";
        field_l = "Enter";
    }
}

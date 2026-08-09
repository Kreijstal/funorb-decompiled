/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends rl {
    private int field_l;
    static long field_j;
    private int field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        jo stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_k = -21;
                break L1;
              }
            }
            this.field_k = this.field_k + param3;
            this.field_l = this.field_l + 1;
            stackIn_3_0 = new jo(bm.field_g, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("tc.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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

    final pb b(byte param0) {
        if (param0 >= -127) {
            this.field_l = 101;
            return (pb) ((Object) new sh());
        }
        return (pb) ((Object) new sh());
    }

    final void a(byte param0) {
        int var2 = -78 / ((29 - param0) / 42);
        tb.field_d.a(re.field_h, 100, this.field_l * (48 * gi.field_m), this.field_k / this.field_l);
        this.field_k = 0;
        this.field_l = 0;
    }

    tc() {
        this.field_k = 0;
        this.field_l = 0;
    }

    static {
        field_j = 0L;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends um {
    static dl field_h;
    static String field_j;
    private int field_g;
    static ko field_k;
    private int field_i;

    final void a(byte param0) {
        int var2 = 57 / ((29 - param0) / 42);
        tb.field_d.a(ck.field_cb, 100, 48 * (gi.field_m * this.field_i), this.field_g / this.field_i);
        this.field_i = 0;
        this.field_g = 0;
    }

    public static void c(int param0) {
        field_k = null;
        field_j = null;
        field_h = null;
        if (param0 != 0) {
            field_h = (dl) null;
        }
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            this.b((byte) 105);
            return (pb) ((Object) new eq());
        }
        return (pb) ((Object) new eq());
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
          this.a(true, 97, 64, -58);
          pd.field_g[param1] = pd.field_g[param1] + param2 * 100;
          return;
        } else {
          pd.field_g[param1] = pd.field_g[param1] + param2 * 100;
          return;
        }
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        f stackIn_3_0 = null;
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
                this.field_g = -58;
                break L1;
              }
            }
            this.field_i = this.field_i + 1;
            this.field_g = this.field_g + param3;
            ph.a(100, (byte) 107, param1, param4);
            stackIn_3_0 = bm.field_g;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("ad.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
        return stackIn_3_0;
    }

    ad() {
        this.field_g = 0;
        this.field_i = 0;
    }

    static {
        field_j = "Type your password again to make sure it's correct";
    }
}

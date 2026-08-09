/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends pd {
    static int[] field_j;
    static String field_l;
    static java.awt.Font field_i;
    private int field_h;
    private int field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        gi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_k = this.field_k + 1;
              this.field_h = this.field_h + param3;
              if (!param0) {
                break L1;
              } else {
                this.a((byte) 104);
                break L1;
              }
            }
            stackIn_3_0 = new gi(3 & q.field_a[ma.field_n[param1]].field_c[param2], bm.field_g);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("fg.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
            return (pb) null;
        }
        return (pb) ((Object) new rn());
    }

    final static void c(byte param0) {
        if (param0 != 95) {
            fg.c(-20);
        }
    }

    final void a(byte param0) {
        int var2 = -55 / ((29 - param0) / 42);
        tb.field_d.a(ti.field_m, 100, this.field_k * (gi.field_m * 48), this.field_h / this.field_k);
        this.field_h = 0;
        this.field_k = 0;
    }

    public static void c(int param0) {
        field_i = null;
        field_l = null;
        field_j = null;
        int var1 = -114 % ((param0 - -30) / 53);
    }

    fg() {
        this.field_h = 0;
        this.field_k = 0;
    }

    static {
        field_j = new int[]{0, 0, 0, 0, -1, -1, -1, -1, 12, 0, 0, 12, 9, 8, 8, -1, 12, 12, 12, 12, -1, 11, 18};
        field_l = "Use this alternative as your account name";
    }
}

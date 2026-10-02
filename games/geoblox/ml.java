/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends ff {
    static String field_u;
    static d field_s;
    static pf field_t;
    static int field_r;
    private int field_w;
    private int field_x;
    private int field_v;
    private dm[] field_y;

    public ml() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param4.field_l) {
            if (param4.e((byte) 54)) {
              stackIn_6_0 = 1;
            } else {
              stackIn_6_0 = 0;
            }
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param4 instanceof hk) {
            param3 = param3 & ((hk) ((Object) param4)).field_D;
          }
          if (param1 >= -5) {
            ml.c(-17);
          }
          if (param3) {
            if (var6_int == 0) {
              stackIn_16_0 = this.field_w;
            } else {
              stackIn_16_0 = this.field_x;
            }
          } else {
            stackIn_16_0 = this.field_v;
          }
          var7 = stackIn_16_0;
          jf.a(this.field_y, var7, param0 + param4.field_v, param4.field_r, (-this.field_y[0].field_o + param4.field_h >> 1) + (param2 + param4.field_m), -17154);
          if (param3) {
            stackIn_19_0 = 16777215;
          } else {
            stackIn_19_0 = 7105644;
          }
          var8 = stackIn_19_0;
          this.field_n.a(param4.field_s, param4.field_v + param0, -2 + param2 - -param4.field_m, param4.field_r, param4.field_h, var8, -1, 1, 1, this.field_n.field_o);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = (RuntimeException) (var6);

          stackIn_23_1 = new StringBuilder().append("ml.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

          if (param4 == null) {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "null";
          } else {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 == 16777215) {
            field_u = null;
            field_t = null;
            field_s = null;
            return;
        }
        ml.b(11);
        field_u = null;
        field_t = null;
        field_s = null;
    }

    private ml(int param0, int param1, int param2) {
        this.field_n = hh.field_c;
        this.field_w = param0;
        this.field_v = param2;
        this.field_x = param1;
        this.field_y = vk.field_e;
    }

    final static String c(int param0) {
        String var1 = null;
        if (param0 == 7789) {
            var1 = "";
            if (!(null == field_t)) {
                var1 = field_t.h(87);
            }
            if (var1.length() == 0) {
                var1 = rc.d((byte) -53);
            }
            if (!(var1.length() != 0)) {
                var1 = th.field_g;
            }
            return var1;
        }
        return (String) null;
    }

    static {
        field_u = "Use this alternative as your account name";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends jd {
    private int field_q;
    private tg[] field_u;
    static String field_t;
    private int field_w;
    static ie field_s;
    static byte[][] field_r;
    private int field_v;

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          if (!param1.field_g) {
            stackIn_6_0 = (param1.e(1)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param1 instanceof wd) {
            param3 = param3 & ((wd) (param1)).field_y;
          }
          if (param3) {
            if (var6_int != 0) {
              stackIn_13_0 = this.field_v;
            } else {
              stackIn_13_0 = this.field_w;
            }
          } else {
            stackIn_13_0 = this.field_q;
          }
          var7 = stackIn_13_0;
          th.a(var7, (byte) 99, param1.field_i + param0 + (-this.field_u[0].field_o + param1.field_m >> 1), this.field_u, param4 + param1.field_r, param1.field_k);
          var9 = 113 / ((-60 - param2) / 56);
          stackIn_16_0 = (param3) ? 16777215 : 7105644;
          var8 = stackIn_16_0;
          this.field_b.a(param1.field_h, param1.field_r + param4, -2 + (param0 + param1.field_i), param1.field_k, param1.field_m, var8, -1, 1, 1, this.field_b.field_s);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("jh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public jh() {
        this(2188450, 2591221, 9543);
    }

    public static void c(int param0) {
        field_s = null;
        field_r = (byte[][]) null;
        if (param0 != -1) {
          return;
        }
        field_t = null;
    }

    final static boolean b(int param0) {
        if (param0 != 767564065) {
          jh.c(64);
          return pg.field_c;
        }
        return pg.field_c;
    }

    private jh(int param0, int param1, int param2) {
        this.field_q = param2;
        this.field_w = param0;
        this.field_u = ih.field_T;
        this.field_b = ne.field_v;
        this.field_v = param1;
    }

    static {
        field_t = "Connection timed out. Please try using a different server.";
        field_r = new byte[250][];
    }
}

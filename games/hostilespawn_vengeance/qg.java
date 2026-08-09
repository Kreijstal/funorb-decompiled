/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends lf {
    static int field_u;
    static String field_o;
    static String field_j;
    static bd field_q;
    static bd field_i;
    static bd field_m;
    private int field_f;
    static String field_s;
    static int field_p;
    static String field_r;
    static int field_n;
    static int field_l;
    private int field_k;
    private int field_h;
    private int field_t;
    static bd[] field_g;

    final static void b(byte param0) {
        if (param0 < 8) {
            field_n = 51;
        }
    }

    private final void a(int param0, byte param1) {
        this.field_f = param0 * param0;
        if (param1 != 21) {
            qg.a(false);
        }
    }

    final void a(int param0, int param1, oj param2) {
        double var4_double = 0.0;
        RuntimeException var4 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        oj var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param1 == 576) {
              break L0;
            } else {
              var10 = (oj) null;
              this.a(-75, -9, (oj) null);
              break L0;
            }
          }
          var4_double = param2.field_l.field_f + (double)param2.field_j.field_e - (double)this.field_k;
          var6 = (double)(-this.field_h) + (param2.field_l.field_a + (double)param2.field_j.field_g);
          var8 = (int)(var6 * var6 + var4_double * var4_double);
          if (var8 > this.field_f) {
            if (var8 >= this.field_t) {
              this.field_d = this.field_b;
              return;
            } else {
              this.field_d = (-var8 + this.field_t) * (-this.field_b + this.field_a) / (-this.field_f + this.field_t) + this.field_b;
              return;
            }
          } else {
            this.field_d = this.field_a;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("qg.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        field_r = null;
        field_s = null;
        field_m = null;
        field_g = null;
        field_q = null;
        if (!param0) {
          qg.a(false);
          field_j = null;
          field_o = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_o = null;
          field_i = null;
          return;
        }
    }

    private final void a(int param0, int param1) {
        if (param1 < 34) {
          this.a(-118, -110);
          this.field_t = param0 * param0;
          return;
        } else {
          this.field_t = param0 * param0;
          return;
        }
    }

    qg(vi param0) {
        try {
            this.a(256, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "qg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, vi param1) {
        try {
            this.field_c = param1.l(param0 + 32014);
            this.field_b = param1.l(32270);
            this.field_a = param1.l(32270);
            if (param0 != 256) {
                oj var4 = (oj) null;
                this.a(-53, -22, (oj) null);
            }
            this.field_k = param1.e(param0 + -248);
            this.field_h = param1.e(8);
            this.a(param1.l(32270), (byte) 21);
            this.a(param1.l(32270), 42);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "qg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Loading extra data";
        field_u = 250;
        field_p = 256;
        field_s = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}

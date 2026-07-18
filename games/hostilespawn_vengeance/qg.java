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

    final static void b() {
    }

    private final void a(int param0, byte param1) {
        ((qg) this).field_f = param0 * param0;
    }

    final void a(int param0, int param1, oj param2) {
        double var4_double = 0.0;
        RuntimeException var4 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param1 == 576) {
              break L0;
            } else {
              var10 = null;
              ((qg) this).a(-75, -9, (oj) null);
              break L0;
            }
          }
          var4_double = param2.field_l.field_f + (double)param2.field_j.field_e - (double)((qg) this).field_k;
          var6 = (double)(-((qg) this).field_h) + (param2.field_l.field_a + (double)param2.field_j.field_g);
          var8 = (int)(var6 * var6 + var4_double * var4_double);
          if (var8 > ((qg) this).field_f) {
            if (var8 >= ((qg) this).field_t) {
              ((qg) this).field_d = ((qg) this).field_b;
              return;
            } else {
              ((qg) this).field_d = (-var8 + ((qg) this).field_t) * (-((qg) this).field_b + ((qg) this).field_a) / (-((qg) this).field_f + ((qg) this).field_t) + ((qg) this).field_b;
              return;
            }
          } else {
            ((qg) this).field_d = ((qg) this).field_a;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("qg.D(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
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
          ((qg) this).field_t = param0 * param0;
          return;
        } else {
          ((qg) this).field_t = param0 * param0;
          return;
        }
    }

    qg(vi param0) {
        try {
            this.a(256, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "qg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, vi param1) {
        try {
            ((qg) this).field_c = param1.l(32270);
            ((qg) this).field_b = param1.l(32270);
            ((qg) this).field_a = param1.l(32270);
            ((qg) this).field_k = param1.e(8);
            ((qg) this).field_h = param1.e(8);
            this.a(param1.l(32270), (byte) 21);
            this.a(param1.l(32270), 42);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "qg.G(" + 256 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Loading extra data";
        field_u = 250;
        field_p = 256;
        field_s = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}

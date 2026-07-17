/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends lf {
    static int field_r;
    private int field_s;
    static String field_n;
    static uc field_o;
    static t field_p;
    static String field_t;
    static String field_u;
    private lf field_q;

    final static void a(byte param0, la param1) {
        t var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new t(param1.a(-116, "", "final_frame.jpg"), (java.awt.Component) (Object) k.field_d);
            var3 = var2.field_s;
            var4 = var2.field_t;
            bp.a((byte) -56);
            cl.field_a = new t(var3, var4 * 3 / 4);
            cl.field_a.e();
            var2.b(0, 0);
            de.field_a = new t(var3, -cl.field_a.field_t + var4);
            de.field_a.e();
            var2.b(0, -cl.field_a.field_t);
            de.field_a.field_r = cl.field_a.field_t;
            r.a(126);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "kl.D(" + 66 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int d() {
        return ((kl) this).field_q.d();
    }

    final void a(int param0) {
        if (!(param0 >= ((kl) this).field_s)) {
            ((kl) this).field_s = ((kl) this).field_s - param0;
            return;
        }
        param0 = param0 - ((kl) this).field_s;
        ((kl) this).field_q.field_h = ((kl) this).field_h;
        ((kl) this).field_s = 0;
        ((kl) this).field_q.field_e = ((kl) this).field_e;
        ((kl) this).field_h.field_e = (q) (Object) ((kl) this).field_q;
        ((kl) this).field_e.field_h = (q) (Object) ((kl) this).field_q;
        ((kl) this).field_h = null;
        ((kl) this).field_e = null;
        if (!(param0 <= 0)) {
            ((kl) this).field_q.a(param0);
        }
    }

    final lf c() {
        return null;
    }

    final lf b() {
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param2 >= kn.field_e) {
          if (qg.field_z >= param0) {
            if (param3 >= j.field_q) {
              if (qk.field_p < param4) {
                ha.a(param2, param5, -126, param0, param3, param4);
                return;
              } else {
                ta.a(0, param4, param3, param5, param2, param0);
                return;
              }
            } else {
              ha.a(param2, param5, -126, param0, param3, param4);
              return;
            }
          } else {
            ha.a(param2, param5, -126, param0, param3, param4);
            return;
          }
        } else {
          ha.a(param2, param5, -126, param0, param3, param4);
          return;
        }
    }

    final int a() {
        return 0;
    }

    public static void b(int param0) {
        field_n = null;
        field_p = null;
        field_t = null;
        field_u = null;
        field_o = null;
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param2 < ((kl) this).field_s) {
              ((kl) this).field_s = ((kl) this).field_s - param2;
              return;
            } else {
              param1 = param1 + ((kl) this).field_s;
              param2 = param2 - ((kl) this).field_s;
              ((kl) this).field_q.field_h = ((kl) this).field_h;
              ((kl) this).field_q.field_e = ((kl) this).field_e;
              ((kl) this).field_s = 0;
              ((kl) this).field_h.field_e = (q) (Object) ((kl) this).field_q;
              ((kl) this).field_e.field_h = (q) (Object) ((kl) this).field_q;
              ((kl) this).field_h = null;
              ((kl) this).field_e = null;
              if (0 >= param2) {
                break L0;
              } else {
                ((kl) this).field_q.b(param0, param1, param2);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("kl.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    kl(lf param0, int param1) {
        try {
            ((kl) this).field_q = param0;
            ((kl) this).field_s = param1;
            ((kl) this).field_m = ((kl) this).field_q.field_m;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "kl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Reload game";
        field_t = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_u = "Highscores";
    }
}

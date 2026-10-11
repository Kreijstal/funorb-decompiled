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
          var2 = new t(param1.a(-116, "", "final_frame.jpg"), (java.awt.Component) ((Object) k.field_d));
          var3 = var2.field_s;
          var4 = var2.field_t;
          bp.a((byte) -56);
          cl.field_a = new t(var3, var4 * 3 / 4);
          cl.field_a.e();
          var2.b(0, 0);
          de.field_a = new t(var3, -cl.field_a.field_t + var4);
          de.field_a.e();
          if (param0 != 66) {
            field_o = (uc) null;
          }
          var2.b(0, -cl.field_a.field_t);
          de.field_a.field_r = cl.field_a.field_t;
          r.a(126);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "kl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int d() {
        return this.field_q.d();
    }

    final void a(int param0) {
        if (param0 < this.field_s) {
          this.field_s = this.field_s - param0;
          return;
        }
        param0 = param0 - this.field_s;
        this.field_q.field_h = this.field_h;
        this.field_s = 0;
        this.field_q.field_e = this.field_e;
        this.field_h.field_e = (q) ((Object) this.field_q);
        this.field_e.field_h = (q) ((Object) this.field_q);
        this.field_h = null;
        this.field_e = null;
        if (param0 > 0) {
          this.field_q.a(param0);
        }
    }

    final lf c() {
        return null;
    }

    final lf b() {
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param1 != 16011) {
          return;
        }
        if (param2 < kn.field_e) {
          ha.a(param2, param5, -126, param0, param3, param4);
          return;
        }
        if (qg.field_z < param0) {
          ha.a(param2, param5, -126, param0, param3, param4);
          return;
        }
        if (param3 < j.field_q) {
          ha.a(param2, param5, -126, param0, param3, param4);
          return;
        }
        if (qk.field_p >= param4) {
          ta.a(0, param4, param3, param5, param2, param0);
          return;
        }
        ha.a(param2, param5, -126, param0, param3, param4);
    }

    final int a() {
        return 0;
    }

    public static void b(int param0) {
        if (param0 <= -113) {
          field_n = null;
          field_p = null;
          field_t = null;
          field_u = null;
          field_o = null;
          return;
        }
        field_o = (uc) null;
        field_n = null;
        field_p = null;
        field_t = null;
        field_u = null;
        field_o = null;
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < this.field_s) {
            this.field_s = this.field_s - param2;
            return;
          }
          param1 = param1 + this.field_s;
          param2 = param2 - this.field_s;
          this.field_q.field_h = this.field_h;
          this.field_q.field_e = this.field_e;
          this.field_s = 0;
          this.field_h.field_e = (q) ((Object) this.field_q);
          this.field_e.field_h = (q) ((Object) this.field_q);
          this.field_h = null;
          this.field_e = null;
          if (0 >= param2) {
            return;
          }
          this.field_q.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("kl.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    kl(lf param0, int param1) {
        try {
          this.field_q = param0;
          this.field_s = param1;
          this.field_m = this.field_q.field_m;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_n = "Reload game";
        field_t = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_u = "Highscores";
    }
}

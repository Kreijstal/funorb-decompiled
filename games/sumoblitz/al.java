/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends hj {
    private jn field_q;
    private jn field_o;
    private int field_p;
    private int field_r;

    private final void e() {
        md var1 = null;
        if (this.field_p > 0) {
          var1 = (md) (this.field_o.b(-108));
          while (var1 != null) {
            var1.field_k = var1.field_k - this.field_p;
            var1 = (md) (this.field_o.d((byte) 18));
          }
          this.field_r = this.field_r - this.field_p;
          this.field_p = 0;
        }
    }

    private final void a(ms param0, md param1) {
        while (true) {
          if (param0 == this.field_o.field_e) {
            ha.a(-2, param0, param1);
            this.field_r = ((md) (this.field_o.field_e.field_b)).field_k;
            return;
          }
          if (((md) (param0)).field_k <= param1.field_k) {
            param0 = param0.field_b;
            continue;
          }
          break;
        }
        ha.a(-2, param0, param1);
        this.field_r = ((md) (this.field_o.field_e.field_b)).field_k;
        return;
    }

    final synchronized void b(hj param0) {
        this.field_q.a(param0, -10295);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        md var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_r < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_p + param2 < this.field_r) {
            this.field_p = this.field_p + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_r - this.field_p;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_p = this.field_p + var4;
          this.e();
          var5 = (md) (this.field_o.b(69));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_k = var7;
              this.a(var5.field_b, var5);
            } else {
              var5.field_k = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        md var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_r < 0) {
            this.c(param0);
            return;
          }
          if (this.field_p + param0 < this.field_r) {
            this.field_p = this.field_p + param0;
            this.c(param0);
            return;
          }
          var2 = this.field_r - this.field_p;
          this.c(var2);
          param0 = param0 - var2;
          this.field_p = this.field_p + var2;
          this.e();
          var3 = (md) (this.field_o.b(-102));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_k = var5;
              this.a(var3.field_b, var3);
            } else {
              var3.field_k = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void c(int param0) {
        hj var2 = (hj) (this.field_q.b(105));
        while (var2 != null) {
          var2.a(param0);
          var2 = (hj) (this.field_q.d((byte) 18));
        }
    }

    final int d() {
        return 0;
    }

    private final void a(md param0) {
        param0.b(false);
        param0.a();
        ms var2 = this.field_o.field_e.field_b;
        if (var2 == this.field_o.field_e) {
          this.field_r = -1;
        } else {
          this.field_r = ((md) (var2)).field_k;
        }
    }

    final synchronized void a(hj param0) {
        param0.b(false);
    }

    final hj c() {
        return (hj) (this.field_q.d((byte) 18));
    }

    final hj a() {
        return (hj) (this.field_q.b(104));
    }

    private final void c(int[] param0, int param1, int param2) {
        hj var4 = (hj) (this.field_q.b(-91));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (hj) (this.field_q.d((byte) 18));
        }
    }

    public al() {
        this.field_q = new jn();
        this.field_o = new jn();
        this.field_r = -1;
        this.field_p = 0;
    }
}

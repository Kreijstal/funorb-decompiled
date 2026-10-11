/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends sn {
    private nj field_t;
    private nj field_r;
    private int field_u;
    private int field_s;

    private final void a(o param0) {
        param0.c(2);
        param0.a();
        li var2 = this.field_r.field_h.field_c;
        if (var2 == this.field_r.field_h) {
          this.field_u = -1;
        } else {
          this.field_u = ((o) (var2)).field_n;
        }
    }

    final sn a() {
        return (sn) (this.field_t.b(56));
    }

    final synchronized void a(sn param0) {
        this.field_t.a(param0, (byte) 27);
    }

    private final void a(li param0, o param1) {
        while (true) {
          if (param0 == this.field_r.field_h) {
            jn.a(param1, param0, 18724);
            this.field_u = ((o) (this.field_r.field_h.field_c)).field_n;
            return;
          }
          if (((o) (param0)).field_n <= param1.field_n) {
            param0 = param0.field_c;
            continue;
          }
          break;
        }
        jn.a(param1, param0, 18724);
        this.field_u = ((o) (this.field_r.field_h.field_c)).field_n;
        return;
    }

    private final void c(int[] param0, int param1, int param2) {
        sn var4 = (sn) (this.field_t.a((byte) 100));
        while (var4 != null) {
          var4.a(param0, param1, param2);
          var4 = (sn) (this.field_t.b(52));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        o var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_u < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_s + param2 < this.field_u) {
            this.field_s = this.field_s + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_u - this.field_s;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_s = this.field_s + var4;
          this.e();
          var5 = (o) (this.field_r.a((byte) 100));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_n = var7;
              this.a(var5.field_c, var5);
            } else {
              var5.field_n = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        o var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_u < 0) {
            this.e(param0);
            return;
          }
          if (this.field_s + param0 < this.field_u) {
            this.field_s = this.field_s + param0;
            this.e(param0);
            return;
          }
          var2 = this.field_u - this.field_s;
          this.e(var2);
          param0 = param0 - var2;
          this.field_s = this.field_s + var2;
          this.e();
          var3 = (o) (this.field_r.a((byte) 100));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_n = var5;
              this.a(var3.field_c, var3);
            } else {
              var3.field_n = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void e() {
        o var1 = null;
        if (this.field_s > 0) {
          var1 = (o) (this.field_r.a((byte) 100));
          while (var1 != null) {
            var1.field_n = var1.field_n - this.field_s;
            var1 = (o) (this.field_r.b(88));
          }
          this.field_u = this.field_u - this.field_s;
          this.field_s = 0;
        }
    }

    final sn c() {
        return (sn) (this.field_t.a((byte) 100));
    }

    final int d() {
        return 0;
    }

    private final void e(int param0) {
        sn var2 = (sn) (this.field_t.a((byte) 100));
        while (var2 != null) {
          var2.a(param0);
          var2 = (sn) (this.field_t.b(88));
        }
    }

    final synchronized void b(sn param0) {
        param0.c(2);
    }

    public fp() {
        this.field_t = new nj();
        this.field_r = new nj();
        this.field_s = 0;
        this.field_u = -1;
    }
}

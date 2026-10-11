/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends lq {
    private tf field_k;
    private tf field_i;
    private int field_j;
    private int field_l;

    final lq b() {
        return (lq) (this.field_k.c(33));
    }

    private final void b(int param0) {
        lq var2 = (lq) (this.field_k.g(24009));
        while (var2 != null) {
          var2.a(param0);
          var2 = (lq) (this.field_k.c(33));
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        me var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_l < 0) {
            this.b(param0);
            return;
          }
          if (this.field_j + param0 < this.field_l) {
            this.field_j = this.field_j + param0;
            this.b(param0);
            return;
          }
          var2 = this.field_l - this.field_j;
          this.b(var2);
          param0 = param0 - var2;
          this.field_j = this.field_j + var2;
          this.e();
          var3 = (me) (this.field_i.g(24009));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_e = var5;
              this.a(var3.field_d, var3);
            } else {
              var3.field_e = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    private final void c(int[] param0, int param1, int param2) {
        lq var4 = (lq) (this.field_k.g(24009));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (lq) (this.field_k.c(33));
        }
    }

    private final void a(me param0) {
        param0.c((byte) -109);
        param0.a();
        gn var2 = this.field_i.field_c.field_d;
        if (var2 == this.field_i.field_c) {
          this.field_l = -1;
        } else {
          this.field_l = ((me) (var2)).field_e;
        }
    }

    final synchronized void b(lq param0) {
        param0.c((byte) -109);
    }

    private final void a(gn param0, me param1) {
        while (true) {
          if (param0 == this.field_i.field_c) {
            ug.a(param0, 16737894, param1);
            this.field_l = ((me) (this.field_i.field_c.field_d)).field_e;
            return;
          }
          if (((me) (param0)).field_e <= param1.field_e) {
            param0 = param0.field_d;
            continue;
          }
          break;
        }
        ug.a(param0, 16737894, param1);
        this.field_l = ((me) (this.field_i.field_c.field_d)).field_e;
        return;
    }

    private final void e() {
        me var1 = null;
        if (this.field_j > 0) {
          var1 = (me) (this.field_i.g(24009));
          while (var1 != null) {
            var1.field_e = var1.field_e - this.field_j;
            var1 = (me) (this.field_i.c(33));
          }
          this.field_l = this.field_l - this.field_j;
          this.field_j = 0;
        }
    }

    final int d() {
        return 0;
    }

    final lq c() {
        return (lq) (this.field_k.g(24009));
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        me var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_l < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_j + param2 < this.field_l) {
            this.field_j = this.field_j + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_l - this.field_j;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_j = this.field_j + var4;
          this.e();
          var5 = (me) (this.field_i.g(24009));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_e = var7;
              this.a(var5.field_d, var5);
            } else {
              var5.field_e = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void a(lq param0) {
        this.field_k.a(0, param0);
    }

    public gq() {
        this.field_k = new tf();
        this.field_i = new tf();
        this.field_j = 0;
        this.field_l = -1;
    }
}

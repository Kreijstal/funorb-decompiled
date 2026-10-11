/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends sp {
    private vo field_n;
    private vo field_l;
    private int field_o;
    private int field_m;

    final sp c() {
        return (sp) (this.field_n.b((byte) 26));
    }

    final synchronized void b(sp param0) {
        this.field_n.a(param0, 97);
    }

    private final void a(le param0, bc param1) {
        while (true) {
          if (param0 == this.field_l.field_b) {
            we.a(param0, 0, param1);
            this.field_m = ((bc) (this.field_l.field_b.field_b)).field_h;
            return;
          }
          if (((bc) (param0)).field_h <= param1.field_h) {
            param0 = param0.field_b;
            continue;
          }
          break;
        }
        we.a(param0, 0, param1);
        this.field_m = ((bc) (this.field_l.field_b.field_b)).field_h;
        return;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        bc var5 = null;
        int var7 = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        do {
          if (this.field_m < 0) {
            this.c(param0, param1, param2);
            return;
          }
          if (this.field_o + param2 < this.field_m) {
            this.field_o = this.field_o + param2;
            this.c(param0, param1, param2);
            return;
          }
          var4 = this.field_m - this.field_o;
          this.c(param0, param1, var4);
          param1 = param1 + var4;
          param2 = param2 - var4;
          this.field_o = this.field_o + var4;
          this.e();
          var5 = (bc) (this.field_l.b((byte) 26));
          var6 = var5;
          synchronized (var6) {
            var7 = var5.a(this);
            if (var7 >= 0) {
              var5.field_h = var7;
              this.a(var5.field_b, var5);
            } else {
              var5.field_h = 0;
              this.a(var5);
            }
          }
        } while (param2 != 0);
        return;
    }

    final synchronized void a(sp param0) {
        param0.b(-27598);
    }

    private final void c(int param0) {
        sp var2 = (sp) (this.field_n.b((byte) 26));
        while (var2 != null) {
          var2.a(param0);
          var2 = (sp) (this.field_n.a(false));
        }
    }

    final sp d() {
        return (sp) (this.field_n.a(false));
    }

    private final void c(int[] param0, int param1, int param2) {
        sp var4 = (sp) (this.field_n.b((byte) 26));
        while (var4 != null) {
          var4.b(param0, param1, param2);
          var4 = (sp) (this.field_n.a(false));
        }
    }

    private final void a(bc param0) {
        param0.b(-27598);
        param0.a();
        le var2 = this.field_l.field_b.field_b;
        if (var2 == this.field_l.field_b) {
          this.field_m = -1;
        } else {
          this.field_m = ((bc) (var2)).field_h;
        }
    }

    final int a() {
        return 0;
    }

    private final void e() {
        bc var1 = null;
        if (this.field_o > 0) {
          var1 = (bc) (this.field_l.b((byte) 26));
          while (var1 != null) {
            var1.field_h = var1.field_h - this.field_o;
            var1 = (bc) (this.field_l.a(false));
          }
          this.field_m = this.field_m - this.field_o;
          this.field_o = 0;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        bc var3 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        do {
          if (this.field_m < 0) {
            this.c(param0);
            return;
          }
          if (this.field_o + param0 < this.field_m) {
            this.field_o = this.field_o + param0;
            this.c(param0);
            return;
          }
          var2 = this.field_m - this.field_o;
          this.c(var2);
          param0 = param0 - var2;
          this.field_o = this.field_o + var2;
          this.e();
          var3 = (bc) (this.field_l.b((byte) 26));
          var4 = var3;
          synchronized (var4) {
            var5 = var3.a(this);
            if (var5 >= 0) {
              var3.field_h = var5;
              this.a(var3.field_b, var3);
            } else {
              var3.field_h = 0;
              this.a(var3);
            }
          }
        } while (param0 != 0);
        return;
    }

    public fi() {
        this.field_n = new vo();
        this.field_l = new vo();
        this.field_o = 0;
        this.field_m = -1;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends ol {
    private vj field_t;
    private vj field_u;
    private int field_r;
    private int field_s;

    private final void e() {
        rh var1 = null;
        if (this.field_s > 0) {
            var1 = (rh) ((Object) this.field_u.c((byte) -59));
            while (var1 != null) {
                var1.field_o = var1.field_o - this.field_s;
                var1 = (rh) ((Object) this.field_u.d(true));
            }
            this.field_r = this.field_r - this.field_s;
            this.field_s = 0;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        rh var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_r >= 0) {
            if (this.field_s + param2 >= this.field_r) {
              var4 = this.field_r - this.field_s;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_s = this.field_s + var4;
              this.e();
              var5 = (rh) ((Object) this.field_u.c((byte) -109));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((mi) (this));
                    if (var7 >= 0) {
                      var5.field_o = var7;
                      this.a(var5.field_b, var5);
                      break L2;
                    } else {
                      var5.field_o = 0;
                      this.b(var5);
                      break L2;
                    }
                  }
                  break L1;
                }
              }
              if (param2 != 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_s = this.field_s + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void c(int param0) {
        ol var2 = (ol) ((Object) this.field_t.c((byte) -69));
        while (var2 != null) {
            var2.a(param0);
            var2 = (ol) ((Object) this.field_t.d(true));
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        rh var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_r >= 0) {
            if (this.field_s + param0 >= this.field_r) {
              var2 = this.field_r - this.field_s;
              this.c(var2);
              param0 = param0 - var2;
              this.field_s = this.field_s + var2;
              this.e();
              var3 = (rh) ((Object) this.field_u.c((byte) -54));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((mi) (this));
                    if (var5 >= 0) {
                      var3.field_o = var5;
                      this.a(var3.field_b, var3);
                      break L2;
                    } else {
                      var3.field_o = 0;
                      this.b(var3);
                      break L2;
                    }
                  }
                  break L1;
                }
              }
              if (param0 != 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_s = this.field_s + param0;
              this.c(param0);
              return;
            }
          } else {
            this.c(param0);
            return;
          }
        }
    }

    final synchronized void b(ol param0) {
        param0.b((byte) 108);
    }

    final ol c() {
        return (ol) ((Object) this.field_t.d(true));
    }

    final void a(ud param0, int param1, int param2, int param3) {
        this.a(ei.a(param0, param1, param2, param3));
    }

    final synchronized void a(ol param0) {
        this.field_t.b(param0, 7143);
    }

    private final void b(rh param0) {
        param0.b((byte) 114);
        param0.a();
        param0.field_n = null;
        bh var2 = this.field_u.field_c.field_b;
        if (var2 == this.field_u.field_c) {
            this.field_r = -1;
        } else {
            this.field_r = ((rh) ((Object) var2)).field_o;
        }
    }

    final synchronized void c(rh param0) {
        if (param0.field_n != null) {
          if (param0.field_n != this) {
            throw new RuntimeException();
          } else {
            this.e();
            this.b(param0);
            return;
          }
        } else {
          return;
        }
    }

    final int a() {
        return 0;
    }

    final synchronized void a(rh param0) {
        if (param0.field_n != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_n = (mi) (this);
          param0.b();
          this.a(this.field_u.field_c.field_b, param0);
          return;
        }
    }

    private final void a(bh param0, rh param1) {
        L0: while (true) {
          if (param0 != this.field_u.field_c) {
            if (((rh) ((Object) param0)).field_o <= param1.field_o) {
              param0 = param0.field_b;
              continue L0;
            } else {
              fm.a((byte) 10, param1, param0);
              this.field_r = ((rh) ((Object) this.field_u.field_c.field_b)).field_o;
              return;
            }
          } else {
            fm.a((byte) 10, param1, param0);
            this.field_r = ((rh) ((Object) this.field_u.field_c.field_b)).field_o;
            return;
          }
        }
    }

    final ol d() {
        return (ol) ((Object) this.field_t.c((byte) 126));
    }

    private final void c(int[] param0, int param1, int param2) {
        ol var4 = (ol) ((Object) this.field_t.c((byte) -106));
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (ol) ((Object) this.field_t.d(true));
        }
    }

    public mi() {
        this.field_t = new vj();
        this.field_u = new vj();
        this.field_r = -1;
        this.field_s = 0;
    }
}

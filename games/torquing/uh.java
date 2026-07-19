/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends lf {
    private ei field_n;
    private ei field_q;
    private int field_o;
    private int field_p;

    private final void e() {
        sl var1 = null;
        if (this.field_p > 0) {
            var1 = (sl) ((Object) this.field_q.b(0));
            while (var1 != null) {
                var1.field_k = var1.field_k - this.field_p;
                var1 = (sl) ((Object) this.field_q.f(-24059));
            }
            this.field_o = this.field_o - this.field_p;
            this.field_p = 0;
        }
    }

    private final void a(q param0, sl param1) {
        L0: while (true) {
          if (param0 != this.field_q.field_b) {
            if (((sl) ((Object) param0)).field_k <= param1.field_k) {
              param0 = param0.field_e;
              continue L0;
            } else {
              fi.a(param1, param0, -1240266932);
              this.field_o = ((sl) ((Object) this.field_q.field_b.field_e)).field_k;
              return;
            }
          } else {
            fi.a(param1, param0, -1240266932);
            this.field_o = ((sl) ((Object) this.field_q.field_b.field_e)).field_k;
            return;
          }
        }
    }

    final synchronized void a(sl param0) {
        if (param0.field_j != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_j = (uh) (this);
          param0.b();
          this.a(this.field_q.field_b.field_e, param0);
          return;
        }
    }

    final int a() {
        return 0;
    }

    final synchronized void a(lf param0) {
        param0.f(0);
    }

    final synchronized void c(sl param0) {
        if (param0.field_j != null) {
          if (param0.field_j != this) {
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

    final synchronized void a(int param0) {
        int var2 = 0;
        sl var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_o >= 0) {
            if (this.field_p + param0 >= this.field_o) {
              var2 = this.field_o - this.field_p;
              this.b(var2);
              param0 = param0 - var2;
              this.field_p = this.field_p + var2;
              this.e();
              var3 = (sl) ((Object) this.field_q.b(0));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((uh) (this));
                    if (var5 >= 0) {
                      var3.field_k = var5;
                      this.a(var3.field_e, var3);
                      break L2;
                    } else {
                      var3.field_k = 0;
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
              this.field_p = this.field_p + param0;
              this.b(param0);
              return;
            }
          } else {
            this.b(param0);
            return;
          }
        }
    }

    final lf c() {
        return (lf) ((Object) this.field_n.b(0));
    }

    final synchronized void b(lf param0) {
        this.field_n.b((byte) 68, param0);
    }

    private final void a(lf param0, int param1) {
        kl var1 = null;
        if (param1 > 0) {
            var1 = qc.a(param1, (byte) -112, param0);
        }
        this.b(var1);
    }

    final void a(gg param0, int param1, int param2, int param3) {
        this.a(nj.a(param0, param1, param2), param3);
    }

    private final void b(sl param0) {
        param0.f(0);
        param0.a();
        param0.field_j = null;
        q var2 = this.field_q.field_b.field_e;
        if (var2 == this.field_q.field_b) {
            this.field_o = -1;
        } else {
            this.field_o = ((sl) ((Object) var2)).field_k;
        }
    }

    final lf b() {
        return (lf) ((Object) this.field_n.f(-24059));
    }

    final void a(gg param0, int param1, int param2) {
        this.b(nj.a(param0, param1, param2));
    }

    private final void c(int[] param0, int param1, int param2) {
        lf var4 = (lf) ((Object) this.field_n.b(0));
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (lf) ((Object) this.field_n.f(-24059));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        sl var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_o >= 0) {
            if (this.field_p + param2 >= this.field_o) {
              var4 = this.field_o - this.field_p;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_p = this.field_p + var4;
              this.e();
              var5 = (sl) ((Object) this.field_q.b(0));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((uh) (this));
                    if (var7 >= 0) {
                      var5.field_k = var7;
                      this.a(var5.field_e, var5);
                      break L2;
                    } else {
                      var5.field_k = 0;
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
              this.field_p = this.field_p + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void b(int param0) {
        lf var2 = (lf) ((Object) this.field_n.b(0));
        while (var2 != null) {
            var2.a(param0);
            var2 = (lf) ((Object) this.field_n.f(-24059));
        }
    }

    public uh() {
        this.field_n = new ei();
        this.field_q = new ei();
        this.field_o = -1;
        this.field_p = 0;
    }
}

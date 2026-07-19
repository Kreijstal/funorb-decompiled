/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends je {
    private bk field_n;
    private bk field_m;
    private int field_k;
    private int field_l;

    private final void d(int param0) {
        je var2 = (je) ((Object) this.field_n.a((byte) 74));
        while (var2 != null) {
            var2.a(param0);
            var2 = (je) ((Object) this.field_n.b((byte) -121));
        }
    }

    final synchronized void b(sf param0) {
        if (param0.field_h != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_h = (qj) (this);
          param0.b();
          this.a(this.field_m.field_a.field_d, param0);
          return;
        }
    }

    final je a() {
        return (je) ((Object) this.field_n.b((byte) -95));
    }

    final synchronized void a(sf param0) {
        if (param0.field_h != null) {
          if (param0.field_h != this) {
            throw new RuntimeException();
          } else {
            this.e();
            this.c(param0);
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void b(je param0) {
        this.field_n.a(-126, param0);
    }

    private final void c(int[] param0, int param1, int param2) {
        je var4 = (je) ((Object) this.field_n.a((byte) 74));
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (je) ((Object) this.field_n.b((byte) -95));
        }
    }

    private final void e() {
        sf var1 = null;
        if (this.field_k > 0) {
            var1 = (sf) ((Object) this.field_m.a((byte) 74));
            while (var1 != null) {
                var1.field_g = var1.field_g - this.field_k;
                var1 = (sf) ((Object) this.field_m.b((byte) -122));
            }
            this.field_l = this.field_l - this.field_k;
            this.field_k = 0;
        }
    }

    private final void c(sf param0) {
        param0.c(107);
        param0.a();
        param0.field_h = null;
        qb var2 = this.field_m.field_a.field_d;
        if (var2 == this.field_m.field_a) {
            this.field_l = -1;
        } else {
            this.field_l = ((sf) ((Object) var2)).field_g;
        }
    }

    final int c() {
        return 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        sf var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_l >= 0) {
            if (this.field_k + param0 >= this.field_l) {
              var2 = this.field_l - this.field_k;
              this.d(var2);
              param0 = param0 - var2;
              this.field_k = this.field_k + var2;
              this.e();
              var3 = (sf) ((Object) this.field_m.a((byte) 74));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((qj) (this));
                    if (var5 >= 0) {
                      var3.field_g = var5;
                      this.a(var3.field_d, var3);
                      break L2;
                    } else {
                      var3.field_g = 0;
                      this.c(var3);
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
              this.field_k = this.field_k + param0;
              this.d(param0);
              return;
            }
          } else {
            this.d(param0);
            return;
          }
        }
    }

    private final void a(qb param0, sf param1) {
        L0: while (true) {
          if (param0 != this.field_m.field_a) {
            if (((sf) ((Object) param0)).field_g <= param1.field_g) {
              param0 = param0.field_d;
              continue L0;
            } else {
              ce.a(param0, 0, param1);
              this.field_l = ((sf) ((Object) this.field_m.field_a.field_d)).field_g;
              return;
            }
          } else {
            ce.a(param0, 0, param1);
            this.field_l = ((sf) ((Object) this.field_m.field_a.field_d)).field_g;
            return;
          }
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        sf var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_l >= 0) {
            if (this.field_k + param2 >= this.field_l) {
              var4 = this.field_l - this.field_k;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_k = this.field_k + var4;
              this.e();
              var5 = (sf) ((Object) this.field_m.a((byte) 74));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((qj) (this));
                    if (var7 >= 0) {
                      var5.field_g = var7;
                      this.a(var5.field_d, var5);
                      break L2;
                    } else {
                      var5.field_g = 0;
                      this.c(var5);
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
              this.field_k = this.field_k + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final synchronized void a(je param0) {
        param0.c(104);
    }

    public qj() {
        this.field_n = new bk();
        this.field_m = new bk();
        this.field_k = 0;
        this.field_l = -1;
    }

    final je b() {
        return (je) ((Object) this.field_n.a((byte) 74));
    }
}

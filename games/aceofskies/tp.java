/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends rf {
    private kp field_k;
    private kp field_j;
    private int field_l;
    private int field_i;

    private final void a(va param0) {
        param0.c(-126);
        param0.a();
        wf var2 = this.field_j.field_e.field_a;
        if (var2 == this.field_j.field_e) {
            this.field_i = -1;
        } else {
            this.field_i = ((va) ((Object) var2)).field_e;
        }
    }

    private final void a(wf param0, va param1) {
        L0: while (true) {
          if (param0 != this.field_j.field_e) {
            if (((va) ((Object) param0)).field_e <= param1.field_e) {
              param0 = param0.field_a;
              continue L0;
            } else {
              ml.a((byte) -20, param0, param1);
              this.field_i = ((va) ((Object) this.field_j.field_e.field_a)).field_e;
              return;
            }
          } else {
            ml.a((byte) -20, param0, param1);
            this.field_i = ((va) ((Object) this.field_j.field_e.field_a)).field_e;
            return;
          }
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        va var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_i >= 0) {
            if (this.field_l + param2 >= this.field_i) {
              var4 = this.field_i - this.field_l;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_l = this.field_l + var4;
              this.e();
              var5 = (va) ((Object) this.field_j.d(268435455));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((tp) (this));
                    if (var7 >= 0) {
                      var5.field_e = var7;
                      this.a(var5.field_a, var5);
                      break L2;
                    } else {
                      var5.field_e = 0;
                      this.a(var5);
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
              this.field_l = this.field_l + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void e() {
        va var1 = null;
        if (this.field_l > 0) {
            var1 = (va) ((Object) this.field_j.d(268435455));
            while (var1 != null) {
                var1.field_e = var1.field_e - this.field_l;
                var1 = (va) ((Object) this.field_j.b((byte) 103));
            }
            this.field_i = this.field_i - this.field_l;
            this.field_l = 0;
        }
    }

    final synchronized void b(rf param0) {
        this.field_k.a(param0, 25611);
    }

    private final void d(int param0) {
        rf var2 = (rf) ((Object) this.field_k.d(268435455));
        while (var2 != null) {
            var2.a(param0);
            var2 = (rf) ((Object) this.field_k.b((byte) 103));
        }
    }

    final rf a() {
        return (rf) ((Object) this.field_k.b((byte) 103));
    }

    private final void c(int[] param0, int param1, int param2) {
        rf var4 = (rf) ((Object) this.field_k.d(268435455));
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (rf) ((Object) this.field_k.b((byte) 103));
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        va var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_i >= 0) {
            if (this.field_l + param0 >= this.field_i) {
              var2 = this.field_i - this.field_l;
              this.d(var2);
              param0 = param0 - var2;
              this.field_l = this.field_l + var2;
              this.e();
              var3 = (va) ((Object) this.field_j.d(268435455));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((tp) (this));
                    if (var5 >= 0) {
                      var3.field_e = var5;
                      this.a(var3.field_a, var3);
                      break L2;
                    } else {
                      var3.field_e = 0;
                      this.a(var3);
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
              this.field_l = this.field_l + param0;
              this.d(param0);
              return;
            }
          } else {
            this.d(param0);
            return;
          }
        }
    }

    final synchronized void a(rf param0) {
        param0.c(-126);
    }

    final rf b() {
        return (rf) ((Object) this.field_k.d(268435455));
    }

    final int d() {
        return 0;
    }

    public tp() {
        this.field_k = new kp();
        this.field_j = new kp();
        this.field_i = -1;
        this.field_l = 0;
    }
}

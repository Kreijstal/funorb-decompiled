/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends wh {
    private ja field_p;
    private ja field_o;
    private int field_n;
    private int field_m;

    final synchronized void a(wh param0) {
        ((k) this).field_p.a((fc) (Object) param0, (byte) 36);
    }

    private final void a(i param0) {
        param0.a(-110);
        param0.a();
        fc var2 = ((k) this).field_o.field_d.field_h;
        if (var2 == ((k) this).field_o.field_d) {
            ((k) this).field_n = -1;
        } else {
            ((k) this).field_n = ((i) (Object) var2).field_i;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        i var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((k) this).field_n >= 0) {
            if (((k) this).field_m + param2 >= ((k) this).field_n) {
              var4 = ((k) this).field_n - ((k) this).field_m;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((k) this).field_m = ((k) this).field_m + var4;
              this.e();
              var5 = (i) (Object) ((k) this).field_o.b(2);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((k) this);
                    if (var7 >= 0) {
                      var5.field_i = var7;
                      this.a(var5.field_h, var5);
                      break L2;
                    } else {
                      var5.field_i = 0;
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
              ((k) this).field_m = ((k) this).field_m + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final int c() {
        return 0;
    }

    private final void e() {
        i var1 = null;
        if (((k) this).field_m > 0) {
            var1 = (i) (Object) ((k) this).field_o.b(2);
            while (var1 != null) {
                var1.field_i = var1.field_i - ((k) this).field_m;
                var1 = (i) (Object) ((k) this).field_o.a(10);
            }
            ((k) this).field_n = ((k) this).field_n - ((k) this).field_m;
            ((k) this).field_m = 0;
        }
    }

    private final void e(int param0) {
        wh var2 = (wh) (Object) ((k) this).field_p.b(2);
        while (var2 != null) {
            var2.d(param0);
            var2 = (wh) (Object) ((k) this).field_p.a(10);
        }
    }

    private final void a(fc param0, i param1) {
        L0: while (true) {
          if (param0 != ((k) this).field_o.field_d) {
            if (((i) (Object) param0).field_i <= param1.field_i) {
              param0 = param0.field_h;
              continue L0;
            } else {
              lj.a(param0, (fc) (Object) param1, -126);
              ((k) this).field_n = ((i) (Object) ((k) this).field_o.field_d.field_h).field_i;
              return;
            }
          } else {
            lj.a(param0, (fc) (Object) param1, -126);
            ((k) this).field_n = ((i) (Object) ((k) this).field_o.field_d.field_h).field_i;
            return;
          }
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        i var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((k) this).field_n >= 0) {
            if (((k) this).field_m + param0 >= ((k) this).field_n) {
              var2 = ((k) this).field_n - ((k) this).field_m;
              this.e(var2);
              param0 = param0 - var2;
              ((k) this).field_m = ((k) this).field_m + var2;
              this.e();
              var3 = (i) (Object) ((k) this).field_o.b(2);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((k) this);
                    if (var5 >= 0) {
                      var3.field_i = var5;
                      this.a(var3.field_h, var3);
                      break L2;
                    } else {
                      var3.field_i = 0;
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
              ((k) this).field_m = ((k) this).field_m + param0;
              this.e(param0);
              return;
            }
          } else {
            this.e(param0);
            return;
          }
        }
    }

    final synchronized void b(wh param0) {
        param0.a(-58);
    }

    private final void c(int[] param0, int param1, int param2) {
        wh var4 = (wh) (Object) ((k) this).field_p.b(2);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (wh) (Object) ((k) this).field_p.a(10);
        }
    }

    final wh b() {
        return (wh) (Object) ((k) this).field_p.b(2);
    }

    final wh a() {
        return (wh) (Object) ((k) this).field_p.a(10);
    }

    public k() {
        ((k) this).field_p = new ja();
        ((k) this).field_o = new ja();
        ((k) this).field_m = 0;
        ((k) this).field_n = -1;
    }
}

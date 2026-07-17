/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends qd {
    private vl field_o;
    private vl field_m;
    private int field_p;
    private int field_n;

    final qd d() {
        return (qd) (Object) ((ra) this).field_o.a((byte) 116);
    }

    final synchronized void b(qd param0) {
        ((ra) this).field_o.a(true, (nm) (Object) param0);
    }

    final qd a() {
        return (qd) (Object) ((ra) this).field_o.d(-112);
    }

    final int b() {
        return 0;
    }

    final synchronized void a(qd param0) {
        param0.b((byte) 111);
    }

    private final void a(nm param0, wf param1) {
        L0: while (true) {
          if (param0 != ((ra) this).field_m.field_e) {
            if (((wf) (Object) param0).field_i <= param1.field_i) {
              param0 = param0.field_e;
              continue L0;
            } else {
              il.a((nm) (Object) param1, 113, param0);
              ((ra) this).field_n = ((wf) (Object) ((ra) this).field_m.field_e.field_e).field_i;
              return;
            }
          } else {
            il.a((nm) (Object) param1, 113, param0);
            ((ra) this).field_n = ((wf) (Object) ((ra) this).field_m.field_e.field_e).field_i;
            return;
          }
        }
    }

    private final void c(int param0) {
        qd var2 = (qd) (Object) ((ra) this).field_o.d(-21);
        while (var2 != null) {
            var2.a(param0);
            var2 = (qd) (Object) ((ra) this).field_o.a((byte) 116);
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        qd var4 = (qd) (Object) ((ra) this).field_o.d(-96);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (qd) (Object) ((ra) this).field_o.a((byte) 116);
        }
    }

    private final void a(wf param0) {
        param0.b((byte) 111);
        param0.a();
        nm var2 = ((ra) this).field_m.field_e.field_e;
        if (var2 == ((ra) this).field_m.field_e) {
            ((ra) this).field_n = -1;
        } else {
            ((ra) this).field_n = ((wf) (Object) var2).field_i;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        wf var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((ra) this).field_n >= 0) {
            if (((ra) this).field_p + param2 >= ((ra) this).field_n) {
              var4 = ((ra) this).field_n - ((ra) this).field_p;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((ra) this).field_p = ((ra) this).field_p + var4;
              this.e();
              var5 = (wf) (Object) ((ra) this).field_m.d(-90);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((ra) this);
                    if (var7 >= 0) {
                      var5.field_i = var7;
                      this.a(var5.field_e, var5);
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
              ((ra) this).field_p = ((ra) this).field_p + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        wf var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((ra) this).field_n >= 0) {
            if (((ra) this).field_p + param0 >= ((ra) this).field_n) {
              var2 = ((ra) this).field_n - ((ra) this).field_p;
              this.c(var2);
              param0 = param0 - var2;
              ((ra) this).field_p = ((ra) this).field_p + var2;
              this.e();
              var3 = (wf) (Object) ((ra) this).field_m.d(-40);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((ra) this);
                    if (var5 >= 0) {
                      var3.field_i = var5;
                      this.a(var3.field_e, var3);
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
              ((ra) this).field_p = ((ra) this).field_p + param0;
              this.c(param0);
              return;
            }
          } else {
            this.c(param0);
            return;
          }
        }
    }

    private final void e() {
        wf var1 = null;
        if (((ra) this).field_p > 0) {
            var1 = (wf) (Object) ((ra) this).field_m.d(-127);
            while (var1 != null) {
                var1.field_i = var1.field_i - ((ra) this).field_p;
                var1 = (wf) (Object) ((ra) this).field_m.a((byte) 116);
            }
            ((ra) this).field_n = ((ra) this).field_n - ((ra) this).field_p;
            ((ra) this).field_p = 0;
        }
    }

    public ra() {
        ((ra) this).field_o = new vl();
        ((ra) this).field_m = new vl();
        ((ra) this).field_n = -1;
        ((ra) this).field_p = 0;
    }
}

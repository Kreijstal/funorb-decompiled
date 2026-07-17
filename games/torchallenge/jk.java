/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends qd {
    private sl field_o;
    private sl field_n;
    private int field_m;
    private int field_p;

    private final void e() {
        jb var1 = null;
        if (((jk) this).field_p > 0) {
            var1 = (jb) (Object) ((jk) this).field_n.c((byte) 111);
            while (var1 != null) {
                var1.field_i = var1.field_i - ((jk) this).field_p;
                var1 = (jb) (Object) ((jk) this).field_n.c(-270);
            }
            ((jk) this).field_m = ((jk) this).field_m - ((jk) this).field_p;
            ((jk) this).field_p = 0;
        }
    }

    final int a() {
        return 0;
    }

    private final void c(int param0) {
        qd var2 = (qd) (Object) ((jk) this).field_o.c((byte) 110);
        while (var2 != null) {
            var2.a(param0);
            var2 = (qd) (Object) ((jk) this).field_o.c(-270);
        }
    }

    final qd c() {
        return (qd) (Object) ((jk) this).field_o.c((byte) -113);
    }

    private final void a(da param0, jb param1) {
        L0: while (true) {
          if (param0 != ((jk) this).field_n.field_e) {
            if (((jb) (Object) param0).field_i <= param1.field_i) {
              param0 = param0.field_f;
              continue L0;
            } else {
              na.a((byte) 52, param0, (da) (Object) param1);
              ((jk) this).field_m = ((jb) (Object) ((jk) this).field_n.field_e.field_f).field_i;
              return;
            }
          } else {
            na.a((byte) 52, param0, (da) (Object) param1);
            ((jk) this).field_m = ((jb) (Object) ((jk) this).field_n.field_e.field_f).field_i;
            return;
          }
        }
    }

    final qd b() {
        return (qd) (Object) ((jk) this).field_o.c(-270);
    }

    private final void c(int[] param0, int param1, int param2) {
        qd var4 = (qd) (Object) ((jk) this).field_o.c((byte) 117);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (qd) (Object) ((jk) this).field_o.c(-270);
        }
    }

    final synchronized void a(qd param0) {
        ((jk) this).field_o.a((byte) 113, (da) (Object) param0);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        jb var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((jk) this).field_m >= 0) {
            if (((jk) this).field_p + param2 >= ((jk) this).field_m) {
              var4 = ((jk) this).field_m - ((jk) this).field_p;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((jk) this).field_p = ((jk) this).field_p + var4;
              this.e();
              var5 = (jb) (Object) ((jk) this).field_n.c((byte) 107);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((jk) this);
                    if (var7 >= 0) {
                      var5.field_i = var7;
                      this.a(var5.field_f, var5);
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
              ((jk) this).field_p = ((jk) this).field_p + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void a(jb param0) {
        param0.a(true);
        param0.a();
        da var2 = ((jk) this).field_n.field_e.field_f;
        if (var2 == ((jk) this).field_n.field_e) {
            ((jk) this).field_m = -1;
        } else {
            ((jk) this).field_m = ((jb) (Object) var2).field_i;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        jb var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((jk) this).field_m >= 0) {
            if (((jk) this).field_p + param0 >= ((jk) this).field_m) {
              var2 = ((jk) this).field_m - ((jk) this).field_p;
              this.c(var2);
              param0 = param0 - var2;
              ((jk) this).field_p = ((jk) this).field_p + var2;
              this.e();
              var3 = (jb) (Object) ((jk) this).field_n.c((byte) -4);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((jk) this);
                    if (var5 >= 0) {
                      var3.field_i = var5;
                      this.a(var3.field_f, var3);
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
              ((jk) this).field_p = ((jk) this).field_p + param0;
              this.c(param0);
              return;
            }
          } else {
            this.c(param0);
            return;
          }
        }
    }

    final synchronized void b(qd param0) {
        param0.a(true);
    }

    public jk() {
        ((jk) this).field_o = new sl();
        ((jk) this).field_n = new sl();
        ((jk) this).field_p = 0;
        ((jk) this).field_m = -1;
    }
}

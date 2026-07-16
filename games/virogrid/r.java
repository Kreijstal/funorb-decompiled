/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends in {
    private p field_m;
    private p field_l;
    private int field_k;
    private int field_n;

    final in c() {
        return (in) (Object) ((r) this).field_m.a((byte) -115);
    }

    final in b() {
        return (in) (Object) ((r) this).field_m.a(16213);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        cl var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((r) this).field_k >= 0) {
            if (((r) this).field_n + param0 >= ((r) this).field_k) {
              var2 = ((r) this).field_k - ((r) this).field_n;
              this.c(var2);
              param0 = param0 - var2;
              ((r) this).field_n = ((r) this).field_n + var2;
              this.e();
              var3 = (cl) (Object) ((r) this).field_l.a((byte) -124);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((r) this);
                    if (var5 >= 0) {
                      var3.field_g = var5;
                      this.a(var3.field_f, var3);
                      break L2;
                    } else {
                      var3.field_g = 0;
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
              ((r) this).field_n = ((r) this).field_n + param0;
              this.c(param0);
              return;
            }
          } else {
            this.c(param0);
            return;
          }
        }
    }

    private final void c(int param0) {
        in var2 = (in) (Object) ((r) this).field_m.a((byte) -106);
        while (var2 != null) {
            var2.a(param0);
            var2 = (in) (Object) ((r) this).field_m.a(16213);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        cl var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((r) this).field_k >= 0) {
            if (((r) this).field_n + param2 >= ((r) this).field_k) {
              var4 = ((r) this).field_k - ((r) this).field_n;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((r) this).field_n = ((r) this).field_n + var4;
              this.e();
              var5 = (cl) (Object) ((r) this).field_l.a((byte) -74);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((r) this);
                    if (var7 >= 0) {
                      var5.field_g = var7;
                      this.a(var5.field_f, var5);
                      break L2;
                    } else {
                      var5.field_g = 0;
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
              ((r) this).field_n = ((r) this).field_n + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void a(cl param0) {
        param0.a(false);
        param0.a();
        l var2 = ((r) this).field_l.field_i.field_f;
        if (var2 == ((r) this).field_l.field_i) {
            ((r) this).field_k = -1;
        } else {
            ((r) this).field_k = ((cl) (Object) var2).field_g;
        }
    }

    private final void a(l param0, cl param1) {
        L0: while (true) {
          if (param0 != ((r) this).field_l.field_i) {
            if (((cl) (Object) param0).field_g <= param1.field_g) {
              param0 = param0.field_f;
              continue L0;
            } else {
              td.a(param0, (byte) 120, (l) (Object) param1);
              ((r) this).field_k = ((cl) (Object) ((r) this).field_l.field_i.field_f).field_g;
              return;
            }
          } else {
            td.a(param0, (byte) 120, (l) (Object) param1);
            ((r) this).field_k = ((cl) (Object) ((r) this).field_l.field_i.field_f).field_g;
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        in var4 = (in) (Object) ((r) this).field_m.a((byte) -44);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (in) (Object) ((r) this).field_m.a(16213);
        }
    }

    final int d() {
        return 0;
    }

    private final void e() {
        cl var1 = null;
        if (((r) this).field_n > 0) {
            var1 = (cl) (Object) ((r) this).field_l.a((byte) -116);
            while (var1 != null) {
                var1.field_g = var1.field_g - ((r) this).field_n;
                var1 = (cl) (Object) ((r) this).field_l.a(16213);
            }
            ((r) this).field_k = ((r) this).field_k - ((r) this).field_n;
            ((r) this).field_n = 0;
        }
    }

    final synchronized void a(in param0) {
        ((r) this).field_m.b((l) (Object) param0, (byte) -45);
    }

    public r() {
        ((r) this).field_m = new p();
        ((r) this).field_l = new p();
        ((r) this).field_n = 0;
        ((r) this).field_k = -1;
    }
}

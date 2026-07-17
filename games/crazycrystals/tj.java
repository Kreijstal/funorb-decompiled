/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends od {
    private wb field_l;
    private wb field_m;
    private int field_k;
    private int field_j;

    private final void a(jb param0, rj param1) {
        L0: while (true) {
          if (param0 != ((tj) this).field_m.field_a) {
            if (((rj) (Object) param0).field_f <= param1.field_f) {
              param0 = param0.field_b;
              continue L0;
            } else {
              int discarded$4 = 47;
              rf.a(param0, (jb) (Object) param1);
              ((tj) this).field_j = ((rj) (Object) ((tj) this).field_m.field_a.field_b).field_f;
              return;
            }
          } else {
            int discarded$5 = 47;
            rf.a(param0, (jb) (Object) param1);
            ((tj) this).field_j = ((rj) (Object) ((tj) this).field_m.field_a.field_b).field_f;
            return;
          }
        }
    }

    final synchronized void a(od param0) {
        param0.a(false);
    }

    final synchronized void b(od param0) {
        ((tj) this).field_l.a(93, (jb) (Object) param0);
    }

    final void a(ko param0, int param1, int param2, int param3) {
        ((tj) this).b((od) (Object) kg.a(param0, param1, param2, param3));
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        rj var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((tj) this).field_j >= 0) {
            if (((tj) this).field_k + param2 >= ((tj) this).field_j) {
              var4 = ((tj) this).field_j - ((tj) this).field_k;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((tj) this).field_k = ((tj) this).field_k + var4;
              this.e();
              var5 = (rj) (Object) ((tj) this).field_m.g(32073);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((tj) this);
                    if (var7 >= 0) {
                      var5.field_f = var7;
                      this.a(var5.field_b, var5);
                      break L2;
                    } else {
                      var5.field_f = 0;
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
              ((tj) this).field_k = ((tj) this).field_k + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void a(rj param0) {
        param0.a(false);
        param0.a();
        jb var2 = ((tj) this).field_m.field_a.field_b;
        if (var2 == ((tj) this).field_m.field_a) {
            ((tj) this).field_j = -1;
        } else {
            ((tj) this).field_j = ((rj) (Object) var2).field_f;
        }
    }

    private final void e() {
        rj var1 = null;
        if (((tj) this).field_k > 0) {
            var1 = (rj) (Object) ((tj) this).field_m.g(32073);
            while (var1 != null) {
                var1.field_f = var1.field_f - ((tj) this).field_k;
                var1 = (rj) (Object) ((tj) this).field_m.a(false);
            }
            ((tj) this).field_j = ((tj) this).field_j - ((tj) this).field_k;
            ((tj) this).field_k = 0;
        }
    }

    private final void d(int param0) {
        od var2 = (od) (Object) ((tj) this).field_l.g(32073);
        while (var2 != null) {
            var2.a(param0);
            var2 = (od) (Object) ((tj) this).field_l.a(false);
        }
    }

    final od d() {
        return (od) (Object) ((tj) this).field_l.g(32073);
    }

    final od a() {
        return (od) (Object) ((tj) this).field_l.a(false);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        rj var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((tj) this).field_j >= 0) {
            if (((tj) this).field_k + param0 >= ((tj) this).field_j) {
              var2 = ((tj) this).field_j - ((tj) this).field_k;
              this.d(var2);
              param0 = param0 - var2;
              ((tj) this).field_k = ((tj) this).field_k + var2;
              this.e();
              var3 = (rj) (Object) ((tj) this).field_m.g(32073);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((tj) this);
                    if (var5 >= 0) {
                      var3.field_f = var5;
                      this.a(var3.field_b, var3);
                      break L2;
                    } else {
                      var3.field_f = 0;
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
              ((tj) this).field_k = ((tj) this).field_k + param0;
              this.d(param0);
              return;
            }
          } else {
            this.d(param0);
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        od var4 = (od) (Object) ((tj) this).field_l.g(32073);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (od) (Object) ((tj) this).field_l.a(false);
        }
    }

    final int c() {
        return 0;
    }

    public tj() {
        ((tj) this).field_l = new wb();
        ((tj) this).field_m = new wb();
        ((tj) this).field_k = 0;
        ((tj) this).field_j = -1;
    }
}

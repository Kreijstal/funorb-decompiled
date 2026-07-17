/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ia {
    private tf field_m;
    private tf field_j;
    private int field_k;
    private int field_l;

    private final void a(jd param0) {
        param0.a(false);
        param0.a();
        hf var2 = ((ob) this).field_j.field_a.field_b;
        if (var2 == ((ob) this).field_j.field_a) {
            ((ob) this).field_k = -1;
        } else {
            ((ob) this).field_k = ((jd) (Object) var2).field_f;
        }
    }

    final ia c() {
        return (ia) (Object) ((ob) this).field_m.d(1);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        jd var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((ob) this).field_k >= 0) {
            if (((ob) this).field_l + param2 >= ((ob) this).field_k) {
              var4 = ((ob) this).field_k - ((ob) this).field_l;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((ob) this).field_l = ((ob) this).field_l + var4;
              this.e();
              var5 = (jd) (Object) ((ob) this).field_j.g(0);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((ob) this);
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
              ((ob) this).field_l = ((ob) this).field_l + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void a(hf param0, jd param1) {
        L0: while (true) {
          if (param0 != ((ob) this).field_j.field_a) {
            if (((jd) (Object) param0).field_f <= param1.field_f) {
              param0 = param0.field_b;
              continue L0;
            } else {
              le.a(param0, 93, (hf) (Object) param1);
              ((ob) this).field_k = ((jd) (Object) ((ob) this).field_j.field_a.field_b).field_f;
              return;
            }
          } else {
            le.a(param0, 93, (hf) (Object) param1);
            ((ob) this).field_k = ((jd) (Object) ((ob) this).field_j.field_a.field_b).field_f;
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        ia var4 = (ia) (Object) ((ob) this).field_m.g(0);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (ia) (Object) ((ob) this).field_m.d(1);
        }
    }

    final int d() {
        return 0;
    }

    final synchronized void b(int param0) {
        int var2 = 0;
        jd var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((ob) this).field_k >= 0) {
            if (((ob) this).field_l + param0 >= ((ob) this).field_k) {
              var2 = ((ob) this).field_k - ((ob) this).field_l;
              this.c(var2);
              param0 = param0 - var2;
              ((ob) this).field_l = ((ob) this).field_l + var2;
              this.e();
              var3 = (jd) (Object) ((ob) this).field_j.g(0);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((ob) this);
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
              ((ob) this).field_l = ((ob) this).field_l + param0;
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
        jd var1 = null;
        if (((ob) this).field_l > 0) {
            var1 = (jd) (Object) ((ob) this).field_j.g(0);
            while (var1 != null) {
                var1.field_f = var1.field_f - ((ob) this).field_l;
                var1 = (jd) (Object) ((ob) this).field_j.d(1);
            }
            ((ob) this).field_k = ((ob) this).field_k - ((ob) this).field_l;
            ((ob) this).field_l = 0;
        }
    }

    final ia b() {
        return (ia) (Object) ((ob) this).field_m.g(0);
    }

    private final void c(int param0) {
        ia var2 = (ia) (Object) ((ob) this).field_m.g(0);
        while (var2 != null) {
            var2.b(param0);
            var2 = (ia) (Object) ((ob) this).field_m.d(1);
        }
    }

    final synchronized void a(ia param0) {
        ((ob) this).field_m.a((hf) (Object) param0, false);
    }

    public ob() {
        ((ob) this).field_m = new tf();
        ((ob) this).field_j = new tf();
        ((ob) this).field_k = -1;
        ((ob) this).field_l = 0;
    }
}

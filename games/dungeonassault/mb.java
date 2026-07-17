/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends qb {
    private md field_o;
    private md field_n;
    private int field_m;
    private int field_p;

    private final void c(int[] param0, int param1, int param2) {
        qb var4 = (qb) (Object) ((mb) this).field_o.e(-24172);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (qb) (Object) ((mb) this).field_o.a(4);
        }
    }

    private final void e() {
        kb var1 = null;
        if (((mb) this).field_m > 0) {
            var1 = (kb) (Object) ((mb) this).field_n.e(-24172);
            while (var1 != null) {
                var1.field_i = var1.field_i - ((mb) this).field_m;
                var1 = (kb) (Object) ((mb) this).field_n.a(4);
            }
            ((mb) this).field_p = ((mb) this).field_p - ((mb) this).field_m;
            ((mb) this).field_m = 0;
        }
    }

    private final void a(ne param0, kb param1) {
        L0: while (true) {
          if (param0 != ((mb) this).field_n.field_c) {
            if (((kb) (Object) param0).field_i <= param1.field_i) {
              param0 = param0.field_e;
              continue L0;
            } else {
              so.a((byte) 89, param0, (ne) (Object) param1);
              ((mb) this).field_p = ((kb) (Object) ((mb) this).field_n.field_c.field_e).field_i;
              return;
            }
          } else {
            so.a((byte) 89, param0, (ne) (Object) param1);
            ((mb) this).field_p = ((kb) (Object) ((mb) this).field_n.field_c.field_e).field_i;
            return;
          }
        }
    }

    final int a() {
        return 0;
    }

    final qb c() {
        return (qb) (Object) ((mb) this).field_o.a(4);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        kb var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((mb) this).field_p >= 0) {
            if (((mb) this).field_m + param0 >= ((mb) this).field_p) {
              var2 = ((mb) this).field_p - ((mb) this).field_m;
              this.d(var2);
              param0 = param0 - var2;
              ((mb) this).field_m = ((mb) this).field_m + var2;
              this.e();
              var3 = (kb) (Object) ((mb) this).field_n.e(-24172);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((mb) this);
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
              ((mb) this).field_m = ((mb) this).field_m + param0;
              this.d(param0);
              return;
            }
          } else {
            this.d(param0);
            return;
          }
        }
    }

    final synchronized void a(qb param0) {
        param0.a(false);
    }

    final synchronized void b(qb param0) {
        ((mb) this).field_o.b((ne) (Object) param0, false);
    }

    private final void a(kb param0) {
        param0.a(false);
        param0.a();
        ne var2 = ((mb) this).field_n.field_c.field_e;
        if (var2 == ((mb) this).field_n.field_c) {
            ((mb) this).field_p = -1;
        } else {
            ((mb) this).field_p = ((kb) (Object) var2).field_i;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        kb var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((mb) this).field_p >= 0) {
            if (((mb) this).field_m + param2 >= ((mb) this).field_p) {
              var4 = ((mb) this).field_p - ((mb) this).field_m;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((mb) this).field_m = ((mb) this).field_m + var4;
              this.e();
              var5 = (kb) (Object) ((mb) this).field_n.e(-24172);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((mb) this);
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
              ((mb) this).field_m = ((mb) this).field_m + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void d(int param0) {
        qb var2 = (qb) (Object) ((mb) this).field_o.e(-24172);
        while (var2 != null) {
            var2.a(param0);
            var2 = (qb) (Object) ((mb) this).field_o.a(4);
        }
    }

    final qb d() {
        return (qb) (Object) ((mb) this).field_o.e(-24172);
    }

    public mb() {
        ((mb) this).field_o = new md();
        ((mb) this).field_n = new md();
        ((mb) this).field_m = 0;
        ((mb) this).field_p = -1;
    }
}

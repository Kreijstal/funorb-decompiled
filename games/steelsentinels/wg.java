/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends we {
    private ul field_u;
    private ul field_s;
    private int field_t;
    private int field_v;

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        w var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((wg) this).field_v >= 0) {
            if (((wg) this).field_t + param2 >= ((wg) this).field_v) {
              var4 = ((wg) this).field_v - ((wg) this).field_t;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((wg) this).field_t = ((wg) this).field_t + var4;
              this.e();
              var5 = (w) (Object) ((wg) this).field_s.e(13058);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((wg) this);
                    if (var7 >= 0) {
                      var5.field_o = var7;
                      this.a(var5.field_k, var5);
                      break L2;
                    } else {
                      var5.field_o = 0;
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
              ((wg) this).field_t = ((wg) this).field_t + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final synchronized void b(we param0) {
        ((wg) this).field_u.a((ck) (Object) param0, -21459);
    }

    final we d() {
        return (we) (Object) ((wg) this).field_u.e(13058);
    }

    private final void a(w param0) {
        param0.b(4);
        param0.a();
        ck var2 = ((wg) this).field_s.field_e.field_k;
        if (var2 == ((wg) this).field_s.field_e) {
            ((wg) this).field_v = -1;
        } else {
            ((wg) this).field_v = ((w) (Object) var2).field_o;
        }
    }

    final we b() {
        return (we) (Object) ((wg) this).field_u.a((byte) -25);
    }

    private final void a(ck param0, w param1) {
        L0: while (true) {
          if (param0 != ((wg) this).field_s.field_e) {
            if (((w) (Object) param0).field_o <= param1.field_o) {
              param0 = param0.field_k;
              continue L0;
            } else {
              ie.a(param0, 30, (ck) (Object) param1);
              ((wg) this).field_v = ((w) (Object) ((wg) this).field_s.field_e.field_k).field_o;
              return;
            }
          } else {
            ie.a(param0, 30, (ck) (Object) param1);
            ((wg) this).field_v = ((w) (Object) ((wg) this).field_s.field_e.field_k).field_o;
            return;
          }
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        w var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((wg) this).field_v >= 0) {
            if (((wg) this).field_t + param0 >= ((wg) this).field_v) {
              var2 = ((wg) this).field_v - ((wg) this).field_t;
              this.e(var2);
              param0 = param0 - var2;
              ((wg) this).field_t = ((wg) this).field_t + var2;
              this.e();
              var3 = (w) (Object) ((wg) this).field_s.e(13058);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((wg) this);
                    if (var5 >= 0) {
                      var3.field_o = var5;
                      this.a(var3.field_k, var3);
                      break L2;
                    } else {
                      var3.field_o = 0;
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
              ((wg) this).field_t = ((wg) this).field_t + param0;
              this.e(param0);
              return;
            }
          } else {
            this.e(param0);
            return;
          }
        }
    }

    private final void e() {
        w var1 = null;
        if (((wg) this).field_t > 0) {
            var1 = (w) (Object) ((wg) this).field_s.e(13058);
            while (var1 != null) {
                var1.field_o = var1.field_o - ((wg) this).field_t;
                var1 = (w) (Object) ((wg) this).field_s.a((byte) -75);
            }
            ((wg) this).field_v = ((wg) this).field_v - ((wg) this).field_t;
            ((wg) this).field_t = 0;
        }
    }

    final int a() {
        return 0;
    }

    final synchronized void a(we param0) {
        param0.b(4);
    }

    private final void e(int param0) {
        we var2 = (we) (Object) ((wg) this).field_u.e(13058);
        while (var2 != null) {
            var2.d(param0);
            var2 = (we) (Object) ((wg) this).field_u.a((byte) -58);
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        we var4 = (we) (Object) ((wg) this).field_u.e(13058);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (we) (Object) ((wg) this).field_u.a((byte) -29);
        }
    }

    public wg() {
        ((wg) this).field_u = new ul();
        ((wg) this).field_s = new ul();
        ((wg) this).field_t = 0;
        ((wg) this).field_v = -1;
    }
}

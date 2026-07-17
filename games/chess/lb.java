/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends nm {
    private jc field_o;
    private jc field_q;
    private int field_n;
    private int field_p;

    private final void c(int[] param0, int param1, int param2) {
        nm var4 = (nm) (Object) ((lb) this).field_o.g(-18110);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (nm) (Object) ((lb) this).field_o.a((byte) -114);
        }
    }

    final nm a() {
        return (nm) (Object) ((lb) this).field_o.g(-18110);
    }

    private final void a(pl param0) {
        param0.c(-2193);
        param0.a();
        o var2 = ((lb) this).field_q.field_a.field_h;
        if (var2 == ((lb) this).field_q.field_a) {
            ((lb) this).field_p = -1;
        } else {
            ((lb) this).field_p = ((pl) (Object) var2).field_j;
        }
    }

    final nm b() {
        return (nm) (Object) ((lb) this).field_o.a((byte) -106);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        pl var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((lb) this).field_p >= 0) {
            if (((lb) this).field_n + param2 >= ((lb) this).field_p) {
              var4 = ((lb) this).field_p - ((lb) this).field_n;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((lb) this).field_n = ((lb) this).field_n + var4;
              this.e();
              var5 = (pl) (Object) ((lb) this).field_q.g(-18110);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((lb) this);
                    if (var7 >= 0) {
                      var5.field_j = var7;
                      this.a(var5.field_h, var5);
                      break L2;
                    } else {
                      var5.field_j = 0;
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
              ((lb) this).field_n = ((lb) this).field_n + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final int d() {
        return 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        pl var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((lb) this).field_p >= 0) {
            if (((lb) this).field_n + param0 >= ((lb) this).field_p) {
              var2 = ((lb) this).field_p - ((lb) this).field_n;
              this.d(var2);
              param0 = param0 - var2;
              ((lb) this).field_n = ((lb) this).field_n + var2;
              this.e();
              var3 = (pl) (Object) ((lb) this).field_q.g(-18110);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((lb) this);
                    if (var5 >= 0) {
                      var3.field_j = var5;
                      this.a(var3.field_h, var3);
                      break L2;
                    } else {
                      var3.field_j = 0;
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
              ((lb) this).field_n = ((lb) this).field_n + param0;
              this.d(param0);
              return;
            }
          } else {
            this.d(param0);
            return;
          }
        }
    }

    private final void e() {
        pl var1 = null;
        if (((lb) this).field_n > 0) {
            var1 = (pl) (Object) ((lb) this).field_q.g(-18110);
            while (var1 != null) {
                var1.field_j = var1.field_j - ((lb) this).field_n;
                var1 = (pl) (Object) ((lb) this).field_q.a((byte) -116);
            }
            ((lb) this).field_p = ((lb) this).field_p - ((lb) this).field_n;
            ((lb) this).field_n = 0;
        }
    }

    private final void a(o param0, pl param1) {
        L0: while (true) {
          if (param0 != ((lb) this).field_q.field_a) {
            if (((pl) (Object) param0).field_j <= param1.field_j) {
              param0 = param0.field_h;
              continue L0;
            } else {
              int discarded$4 = 1;
              he.a((o) (Object) param1, param0);
              ((lb) this).field_p = ((pl) (Object) ((lb) this).field_q.field_a.field_h).field_j;
              return;
            }
          } else {
            int discarded$5 = 1;
            he.a((o) (Object) param1, param0);
            ((lb) this).field_p = ((pl) (Object) ((lb) this).field_q.field_a.field_h).field_j;
            return;
          }
        }
    }

    final synchronized void a(nm param0) {
        ((lb) this).field_o.a((o) (Object) param0, 69);
    }

    private final void d(int param0) {
        nm var2 = (nm) (Object) ((lb) this).field_o.g(-18110);
        while (var2 != null) {
            var2.a(param0);
            var2 = (nm) (Object) ((lb) this).field_o.a((byte) -127);
        }
    }

    public lb() {
        ((lb) this).field_o = new jc();
        ((lb) this).field_q = new jc();
        ((lb) this).field_n = 0;
        ((lb) this).field_p = -1;
    }
}

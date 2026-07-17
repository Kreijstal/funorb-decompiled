/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends lj {
    private jj field_m;
    private jj field_o;
    private int field_n;
    private int field_l;

    final lj a() {
        return (lj) (Object) ((vg) this).field_m.e((byte) -119);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        we var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((vg) this).field_l >= 0) {
            if (((vg) this).field_n + param0 >= ((vg) this).field_l) {
              var2 = ((vg) this).field_l - ((vg) this).field_n;
              this.c(var2);
              param0 = param0 - var2;
              ((vg) this).field_n = ((vg) this).field_n + var2;
              this.e();
              var3 = (we) (Object) ((vg) this).field_o.d(9272);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((vg) this);
                    if (var5 >= 0) {
                      var3.field_h = var5;
                      this.a(var3.field_d, var3);
                      break L2;
                    } else {
                      var3.field_h = 0;
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
              ((vg) this).field_n = ((vg) this).field_n + param0;
              this.c(param0);
              return;
            }
          } else {
            this.c(param0);
            return;
          }
        }
    }

    private final void a(uf param0, we param1) {
        L0: while (true) {
          if (param0 != ((vg) this).field_o.field_a) {
            if (((we) (Object) param0).field_h <= param1.field_h) {
              param0 = param0.field_d;
              continue L0;
            } else {
              ha.a(127, param0, (uf) (Object) param1);
              ((vg) this).field_l = ((we) (Object) ((vg) this).field_o.field_a.field_d).field_h;
              return;
            }
          } else {
            ha.a(127, param0, (uf) (Object) param1);
            ((vg) this).field_l = ((we) (Object) ((vg) this).field_o.field_a.field_d).field_h;
            return;
          }
        }
    }

    private final void e() {
        we var1 = null;
        if (((vg) this).field_n > 0) {
            var1 = (we) (Object) ((vg) this).field_o.d(9272);
            while (var1 != null) {
                var1.field_h = var1.field_h - ((vg) this).field_n;
                var1 = (we) (Object) ((vg) this).field_o.e((byte) -119);
            }
            ((vg) this).field_l = ((vg) this).field_l - ((vg) this).field_n;
            ((vg) this).field_n = 0;
        }
    }

    private final void a(we param0) {
        param0.b((byte) 12);
        param0.a();
        uf var2 = ((vg) this).field_o.field_a.field_d;
        if (var2 == ((vg) this).field_o.field_a) {
            ((vg) this).field_l = -1;
        } else {
            ((vg) this).field_l = ((we) (Object) var2).field_h;
        }
    }

    final synchronized void a(lj param0) {
        ((vg) this).field_m.a((uf) (Object) param0, (byte) 0);
    }

    final int d() {
        return 0;
    }

    private final void c(int[] param0, int param1, int param2) {
        lj var4 = (lj) (Object) ((vg) this).field_m.d(9272);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (lj) (Object) ((vg) this).field_m.e((byte) -119);
        }
    }

    final void a(gg param0, int param1, int param2) {
        ((vg) this).a((lj) (Object) lh.a(param0, param1, param2));
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        we var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((vg) this).field_l >= 0) {
            if (((vg) this).field_n + param2 >= ((vg) this).field_l) {
              var4 = ((vg) this).field_l - ((vg) this).field_n;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((vg) this).field_n = ((vg) this).field_n + var4;
              this.e();
              var5 = (we) (Object) ((vg) this).field_o.d(9272);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((vg) this);
                    if (var7 >= 0) {
                      var5.field_h = var7;
                      this.a(var5.field_d, var5);
                      break L2;
                    } else {
                      var5.field_h = 0;
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
              ((vg) this).field_n = ((vg) this).field_n + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void c(int param0) {
        lj var2 = (lj) (Object) ((vg) this).field_m.d(9272);
        while (var2 != null) {
            var2.a(param0);
            var2 = (lj) (Object) ((vg) this).field_m.e((byte) -119);
        }
    }

    final lj c() {
        return (lj) (Object) ((vg) this).field_m.d(9272);
    }

    public vg() {
        ((vg) this).field_m = new jj();
        ((vg) this).field_o = new jj();
        ((vg) this).field_n = 0;
        ((vg) this).field_l = -1;
    }
}

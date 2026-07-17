/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends tj {
    private vl field_l;
    private vl field_o;
    private int field_n;
    private int field_m;

    private final void d(int param0) {
        tj var2 = (tj) (Object) ((wm) this).field_l.g(-48);
        while (var2 != null) {
            var2.c(param0);
            var2 = (tj) (Object) ((wm) this).field_l.a(12684);
        }
    }

    private final void e() {
        da var1 = null;
        if (((wm) this).field_n > 0) {
            var1 = (da) (Object) ((wm) this).field_o.g(-27);
            while (var1 != null) {
                var1.field_h = var1.field_h - ((wm) this).field_n;
                var1 = (da) (Object) ((wm) this).field_o.a(12684);
            }
            ((wm) this).field_m = ((wm) this).field_m - ((wm) this).field_n;
            ((wm) this).field_n = 0;
        }
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        da var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((wm) this).field_m >= 0) {
            if (((wm) this).field_n + param0 >= ((wm) this).field_m) {
              var2 = ((wm) this).field_m - ((wm) this).field_n;
              this.d(var2);
              param0 = param0 - var2;
              ((wm) this).field_n = ((wm) this).field_n + var2;
              this.e();
              var3 = (da) (Object) ((wm) this).field_o.g(-76);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((wm) this);
                    if (var5 >= 0) {
                      var3.field_h = var5;
                      this.a(var3.field_g, var3);
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
              ((wm) this).field_n = ((wm) this).field_n + param0;
              this.d(param0);
              return;
            }
          } else {
            this.d(param0);
            return;
          }
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        da var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((wm) this).field_m >= 0) {
            if (((wm) this).field_n + param2 >= ((wm) this).field_m) {
              var4 = ((wm) this).field_m - ((wm) this).field_n;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((wm) this).field_n = ((wm) this).field_n + var4;
              this.e();
              var5 = (da) (Object) ((wm) this).field_o.g(-69);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((wm) this);
                    if (var7 >= 0) {
                      var5.field_h = var7;
                      this.a(var5.field_g, var5);
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
              ((wm) this).field_n = ((wm) this).field_n + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final tj b() {
        return (tj) (Object) ((wm) this).field_l.a(12684);
    }

    private final void c(int[] param0, int param1, int param2) {
        tj var4 = (tj) (Object) ((wm) this).field_l.g(-15);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (tj) (Object) ((wm) this).field_l.a(12684);
        }
    }

    final synchronized void a(tj param0) {
        param0.b(-104);
    }

    final synchronized void b(tj param0) {
        ((wm) this).field_l.a((byte) -64, (am) (Object) param0);
    }

    final void a(jb param0, int param1, int param2) {
        ((wm) this).b((tj) (Object) b.a(param0, param1, param2));
    }

    final tj d() {
        return (tj) (Object) ((wm) this).field_l.g(-26);
    }

    private final void a(da param0) {
        param0.b(-62);
        param0.a();
        am var2 = ((wm) this).field_o.field_b.field_g;
        if (var2 == ((wm) this).field_o.field_b) {
            ((wm) this).field_m = -1;
        } else {
            ((wm) this).field_m = ((da) (Object) var2).field_h;
        }
    }

    private final void a(am param0, da param1) {
        L0: while (true) {
          if (param0 != ((wm) this).field_o.field_b) {
            if (((da) (Object) param0).field_h <= param1.field_h) {
              param0 = param0.field_g;
              continue L0;
            } else {
              uf.a((am) (Object) param1, param0, (byte) -78);
              ((wm) this).field_m = ((da) (Object) ((wm) this).field_o.field_b.field_g).field_h;
              return;
            }
          } else {
            uf.a((am) (Object) param1, param0, (byte) -78);
            ((wm) this).field_m = ((da) (Object) ((wm) this).field_o.field_b.field_g).field_h;
            return;
          }
        }
    }

    final int c() {
        return 0;
    }

    public wm() {
        ((wm) this).field_l = new vl();
        ((wm) this).field_o = new vl();
        ((wm) this).field_n = 0;
        ((wm) this).field_m = -1;
    }
}

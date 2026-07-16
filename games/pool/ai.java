/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends kd {
    private ko field_s;
    private ko field_q;
    private int field_p;
    private int field_r;

    private final void a(ma param0, rd param1) {
        L0: while (true) {
          if (param0 != ((ai) this).field_q.field_e) {
            if (((rd) (Object) param0).field_l <= param1.field_l) {
              param0 = param0.field_d;
              continue L0;
            } else {
              vj.a((ma) (Object) param1, (byte) -119, param0);
              ((ai) this).field_p = ((rd) (Object) ((ai) this).field_q.field_e.field_d).field_l;
              return;
            }
          } else {
            vj.a((ma) (Object) param1, (byte) -119, param0);
            ((ai) this).field_p = ((rd) (Object) ((ai) this).field_q.field_e.field_d).field_l;
            return;
          }
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        rd var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((ai) this).field_p >= 0) {
            if (((ai) this).field_r + param2 >= ((ai) this).field_p) {
              var4 = ((ai) this).field_p - ((ai) this).field_r;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((ai) this).field_r = ((ai) this).field_r + var4;
              this.e();
              var5 = (rd) (Object) ((ai) this).field_q.c((byte) 74);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((ai) this);
                    if (var7 >= 0) {
                      var5.field_l = var7;
                      this.a(var5.field_d, var5);
                      break L2;
                    } else {
                      var5.field_l = 0;
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
              ((ai) this).field_r = ((ai) this).field_r + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void a(rd param0) {
        param0.a((byte) -117);
        param0.a();
        ma var2 = ((ai) this).field_q.field_e.field_d;
        if (var2 == ((ai) this).field_q.field_e) {
            ((ai) this).field_p = -1;
        } else {
            ((ai) this).field_p = ((rd) (Object) var2).field_l;
        }
    }

    private final void e() {
        rd var1 = null;
        if (((ai) this).field_r > 0) {
            var1 = (rd) (Object) ((ai) this).field_q.c((byte) -83);
            while (var1 != null) {
                var1.field_l = var1.field_l - ((ai) this).field_r;
                var1 = (rd) (Object) ((ai) this).field_q.f((byte) -5);
            }
            ((ai) this).field_p = ((ai) this).field_p - ((ai) this).field_r;
            ((ai) this).field_r = 0;
        }
    }

    final kd a() {
        return (kd) (Object) ((ai) this).field_s.c((byte) 102);
    }

    final kd b() {
        return (kd) (Object) ((ai) this).field_s.f((byte) -5);
    }

    final synchronized void a(kd param0) {
        param0.a((byte) -117);
    }

    private final void c(int[] param0, int param1, int param2) {
        kd var4 = (kd) (Object) ((ai) this).field_s.c((byte) -90);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (kd) (Object) ((ai) this).field_s.f((byte) -5);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        rd var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((ai) this).field_p >= 0) {
            if (((ai) this).field_r + param0 >= ((ai) this).field_p) {
              var2 = ((ai) this).field_p - ((ai) this).field_r;
              this.c(var2);
              param0 = param0 - var2;
              ((ai) this).field_r = ((ai) this).field_r + var2;
              this.e();
              var3 = (rd) (Object) ((ai) this).field_q.c((byte) -51);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((ai) this);
                    if (var5 >= 0) {
                      var3.field_l = var5;
                      this.a(var3.field_d, var3);
                      break L2;
                    } else {
                      var3.field_l = 0;
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
              ((ai) this).field_r = ((ai) this).field_r + param0;
              this.c(param0);
              return;
            }
          } else {
            this.c(param0);
            return;
          }
        }
    }

    final synchronized void b(kd param0) {
        ((ai) this).field_s.a((byte) -84, (ma) (Object) param0);
    }

    final int d() {
        return 0;
    }

    private final void c(int param0) {
        kd var2 = (kd) (Object) ((ai) this).field_s.c((byte) -30);
        while (var2 != null) {
            var2.a(param0);
            var2 = (kd) (Object) ((ai) this).field_s.f((byte) -5);
        }
    }

    public ai() {
        ((ai) this).field_s = new ko();
        ((ai) this).field_q = new ko();
        ((ai) this).field_p = -1;
        ((ai) this).field_r = 0;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends lq {
    private tf field_k;
    private tf field_i;
    private int field_j;
    private int field_l;

    final lq b() {
        return (lq) (Object) ((gq) this).field_k.c(33);
    }

    private final void b(int param0) {
        lq var2 = (lq) (Object) ((gq) this).field_k.g(24009);
        while (var2 != null) {
            var2.a(param0);
            var2 = (lq) (Object) ((gq) this).field_k.c(33);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        me var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((gq) this).field_l >= 0) {
            if (((gq) this).field_j + param0 >= ((gq) this).field_l) {
              var2 = ((gq) this).field_l - ((gq) this).field_j;
              this.b(var2);
              param0 = param0 - var2;
              ((gq) this).field_j = ((gq) this).field_j + var2;
              this.e();
              var3 = (me) (Object) ((gq) this).field_i.g(24009);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((gq) this);
                    if (var5 >= 0) {
                      var3.field_e = var5;
                      this.a(var3.field_d, var3);
                      break L2;
                    } else {
                      var3.field_e = 0;
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
              ((gq) this).field_j = ((gq) this).field_j + param0;
              this.b(param0);
              return;
            }
          } else {
            this.b(param0);
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        lq var4 = (lq) (Object) ((gq) this).field_k.g(24009);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (lq) (Object) ((gq) this).field_k.c(33);
        }
    }

    private final void a(me param0) {
        param0.c((byte) -109);
        param0.a();
        gn var2 = ((gq) this).field_i.field_c.field_d;
        if (var2 == ((gq) this).field_i.field_c) {
            ((gq) this).field_l = -1;
        } else {
            ((gq) this).field_l = ((me) (Object) var2).field_e;
        }
    }

    final synchronized void b(lq param0) {
        param0.c((byte) -109);
    }

    private final void a(gn param0, me param1) {
        L0: while (true) {
          if (param0 != ((gq) this).field_i.field_c) {
            if (((me) (Object) param0).field_e <= param1.field_e) {
              param0 = param0.field_d;
              continue L0;
            } else {
              ug.a(param0, 16737894, (gn) (Object) param1);
              ((gq) this).field_l = ((me) (Object) ((gq) this).field_i.field_c.field_d).field_e;
              return;
            }
          } else {
            ug.a(param0, 16737894, (gn) (Object) param1);
            ((gq) this).field_l = ((me) (Object) ((gq) this).field_i.field_c.field_d).field_e;
            return;
          }
        }
    }

    private final void e() {
        me var1 = null;
        if (((gq) this).field_j > 0) {
            var1 = (me) (Object) ((gq) this).field_i.g(24009);
            while (var1 != null) {
                var1.field_e = var1.field_e - ((gq) this).field_j;
                var1 = (me) (Object) ((gq) this).field_i.c(33);
            }
            ((gq) this).field_l = ((gq) this).field_l - ((gq) this).field_j;
            ((gq) this).field_j = 0;
        }
    }

    final int d() {
        return 0;
    }

    final lq c() {
        return (lq) (Object) ((gq) this).field_k.g(24009);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        me var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((gq) this).field_l >= 0) {
            if (((gq) this).field_j + param2 >= ((gq) this).field_l) {
              var4 = ((gq) this).field_l - ((gq) this).field_j;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((gq) this).field_j = ((gq) this).field_j + var4;
              this.e();
              var5 = (me) (Object) ((gq) this).field_i.g(24009);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((gq) this);
                    if (var7 >= 0) {
                      var5.field_e = var7;
                      this.a(var5.field_d, var5);
                      break L2;
                    } else {
                      var5.field_e = 0;
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
              ((gq) this).field_j = ((gq) this).field_j + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final synchronized void a(lq param0) {
        ((gq) this).field_k.a(0, (gn) (Object) param0);
    }

    public gq() {
        ((gq) this).field_k = new tf();
        ((gq) this).field_i = new tf();
        ((gq) this).field_j = 0;
        ((gq) this).field_l = -1;
    }
}

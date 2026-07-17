/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends hj {
    private jn field_q;
    private jn field_o;
    private int field_p;
    private int field_r;

    private final void e() {
        md var1 = null;
        if (((al) this).field_p > 0) {
            var1 = (md) (Object) ((al) this).field_o.b(-108);
            while (var1 != null) {
                var1.field_k = var1.field_k - ((al) this).field_p;
                var1 = (md) (Object) ((al) this).field_o.d((byte) 18);
            }
            ((al) this).field_r = ((al) this).field_r - ((al) this).field_p;
            ((al) this).field_p = 0;
        }
    }

    private final void a(ms param0, md param1) {
        L0: while (true) {
          if (param0 != ((al) this).field_o.field_e) {
            if (((md) (Object) param0).field_k <= param1.field_k) {
              param0 = param0.field_b;
              continue L0;
            } else {
              ha.a(-2, param0, (ms) (Object) param1);
              ((al) this).field_r = ((md) (Object) ((al) this).field_o.field_e.field_b).field_k;
              return;
            }
          } else {
            ha.a(-2, param0, (ms) (Object) param1);
            ((al) this).field_r = ((md) (Object) ((al) this).field_o.field_e.field_b).field_k;
            return;
          }
        }
    }

    final synchronized void b(hj param0) {
        ((al) this).field_q.a((ms) (Object) param0, -10295);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        md var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((al) this).field_r >= 0) {
            if (((al) this).field_p + param2 >= ((al) this).field_r) {
              var4 = ((al) this).field_r - ((al) this).field_p;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((al) this).field_p = ((al) this).field_p + var4;
              this.e();
              var5 = (md) (Object) ((al) this).field_o.b(69);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((al) this);
                    if (var7 >= 0) {
                      var5.field_k = var7;
                      this.a(var5.field_b, var5);
                      break L2;
                    } else {
                      var5.field_k = 0;
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
              ((al) this).field_p = ((al) this).field_p + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        md var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((al) this).field_r >= 0) {
            if (((al) this).field_p + param0 >= ((al) this).field_r) {
              var2 = ((al) this).field_r - ((al) this).field_p;
              this.c(var2);
              param0 = param0 - var2;
              ((al) this).field_p = ((al) this).field_p + var2;
              this.e();
              var3 = (md) (Object) ((al) this).field_o.b(-102);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((al) this);
                    if (var5 >= 0) {
                      var3.field_k = var5;
                      this.a(var3.field_b, var3);
                      break L2;
                    } else {
                      var3.field_k = 0;
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
              ((al) this).field_p = ((al) this).field_p + param0;
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
        hj var2 = (hj) (Object) ((al) this).field_q.b(105);
        while (var2 != null) {
            var2.a(param0);
            var2 = (hj) (Object) ((al) this).field_q.d((byte) 18);
        }
    }

    final int d() {
        return 0;
    }

    private final void a(md param0) {
        param0.b(false);
        param0.a();
        ms var2 = ((al) this).field_o.field_e.field_b;
        if (var2 == ((al) this).field_o.field_e) {
            ((al) this).field_r = -1;
        } else {
            ((al) this).field_r = ((md) (Object) var2).field_k;
        }
    }

    final synchronized void a(hj param0) {
        param0.b(false);
    }

    final hj c() {
        return (hj) (Object) ((al) this).field_q.d((byte) 18);
    }

    final hj a() {
        return (hj) (Object) ((al) this).field_q.b(104);
    }

    private final void c(int[] param0, int param1, int param2) {
        hj var4 = (hj) (Object) ((al) this).field_q.b(-91);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (hj) (Object) ((al) this).field_q.d((byte) 18);
        }
    }

    public al() {
        ((al) this).field_q = new jn();
        ((al) this).field_o = new jn();
        ((al) this).field_r = -1;
        ((al) this).field_p = 0;
    }
}

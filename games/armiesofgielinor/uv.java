/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv extends hn {
    private at field_r;
    private at field_q;
    private int field_o;
    private int field_p;

    final int c() {
        return 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        bf var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((uv) this).field_p >= 0) {
            if (((uv) this).field_o + param0 >= ((uv) this).field_p) {
              var2 = ((uv) this).field_p - ((uv) this).field_o;
              this.e(var2);
              param0 = param0 - var2;
              ((uv) this).field_o = ((uv) this).field_o + var2;
              this.e();
              var3 = (bf) (Object) ((uv) this).field_q.e((byte) 110);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((uv) this);
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
              ((uv) this).field_o = ((uv) this).field_o + param0;
              this.e(param0);
              return;
            }
          } else {
            this.e(param0);
            return;
          }
        }
    }

    final synchronized void a(hn param0) {
        ((uv) this).field_r.a(750, (tc) (Object) param0);
    }

    private final void a(bf param0) {
        param0.d(103);
        param0.a();
        tc var2 = ((uv) this).field_q.field_d.field_b;
        if (var2 == ((uv) this).field_q.field_d) {
            ((uv) this).field_p = -1;
        } else {
            ((uv) this).field_p = ((bf) (Object) var2).field_k;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        bf var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((uv) this).field_p >= 0) {
            if (((uv) this).field_o + param2 >= ((uv) this).field_p) {
              var4 = ((uv) this).field_p - ((uv) this).field_o;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((uv) this).field_o = ((uv) this).field_o + var4;
              this.e();
              var5 = (bf) (Object) ((uv) this).field_q.e((byte) 127);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((uv) this);
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
              ((uv) this).field_o = ((uv) this).field_o + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        hn var4 = (hn) (Object) ((uv) this).field_r.e((byte) 118);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (hn) (Object) ((uv) this).field_r.a((byte) 123);
        }
    }

    final hn b() {
        return (hn) (Object) ((uv) this).field_r.a((byte) 123);
    }

    final hn a() {
        return (hn) (Object) ((uv) this).field_r.e((byte) 126);
    }

    private final void e(int param0) {
        hn var2 = (hn) (Object) ((uv) this).field_r.e((byte) 103);
        while (var2 != null) {
            var2.a(param0);
            var2 = (hn) (Object) ((uv) this).field_r.a((byte) 123);
        }
    }

    private final void e() {
        bf var1 = null;
        if (((uv) this).field_o > 0) {
            var1 = (bf) (Object) ((uv) this).field_q.e((byte) 111);
            while (var1 != null) {
                var1.field_k = var1.field_k - ((uv) this).field_o;
                var1 = (bf) (Object) ((uv) this).field_q.a((byte) 123);
            }
            ((uv) this).field_p = ((uv) this).field_p - ((uv) this).field_o;
            ((uv) this).field_o = 0;
        }
    }

    private final void a(tc param0, bf param1) {
        L0: while (true) {
          if (param0 != ((uv) this).field_q.field_d) {
            if (((bf) (Object) param0).field_k <= param1.field_k) {
              param0 = param0.field_b;
              continue L0;
            } else {
              fj.a((byte) -123, (tc) (Object) param1, param0);
              ((uv) this).field_p = ((bf) (Object) ((uv) this).field_q.field_d.field_b).field_k;
              return;
            }
          } else {
            fj.a((byte) -123, (tc) (Object) param1, param0);
            ((uv) this).field_p = ((bf) (Object) ((uv) this).field_q.field_d.field_b).field_k;
            return;
          }
        }
    }

    public uv() {
        ((uv) this).field_r = new at();
        ((uv) this).field_q = new at();
        ((uv) this).field_o = 0;
        ((uv) this).field_p = -1;
    }
}

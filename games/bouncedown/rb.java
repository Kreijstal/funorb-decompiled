/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends wf {
    private bc field_n;
    private bc field_l;
    private int field_m;
    private int field_k;

    private final void d(int param0) {
        wf var2 = (wf) (Object) ((rb) this).field_n.a((byte) -83);
        while (var2 != null) {
            var2.a(param0);
            var2 = (wf) (Object) ((rb) this).field_n.d((byte) -102);
        }
    }

    final wf d() {
        return (wf) (Object) ((rb) this).field_n.a((byte) -99);
    }

    private final void e() {
        oi var1 = null;
        if (((rb) this).field_m > 0) {
            var1 = (oi) (Object) ((rb) this).field_l.a((byte) -50);
            while (var1 != null) {
                var1.field_g = var1.field_g - ((rb) this).field_m;
                var1 = (oi) (Object) ((rb) this).field_l.d((byte) -94);
            }
            ((rb) this).field_k = ((rb) this).field_k - ((rb) this).field_m;
            ((rb) this).field_m = 0;
        }
    }

    final wf c() {
        return (wf) (Object) ((rb) this).field_n.d((byte) -60);
    }

    final int b() {
        return 0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        oi var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((rb) this).field_k >= 0) {
            if (((rb) this).field_m + param2 >= ((rb) this).field_k) {
              var4 = ((rb) this).field_k - ((rb) this).field_m;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((rb) this).field_m = ((rb) this).field_m + var4;
              this.e();
              var5 = (oi) (Object) ((rb) this).field_l.a((byte) -117);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  var7 = var5.a((rb) this);
                  if (var7 >= 0) {
                    var5.field_g = var7;
                    this.a(var5.field_c, var5);
                    break L1;
                  } else {
                    var5.field_g = 0;
                    this.a(var5);
                    break L1;
                  }
                }
              }
              if (param2 != 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              ((rb) this).field_m = ((rb) this).field_m + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final synchronized void a(wf param0) {
        ((rb) this).field_n.a((byte) 83, (ai) (Object) param0);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        oi var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((rb) this).field_k >= 0) {
            if (((rb) this).field_m + param0 >= ((rb) this).field_k) {
              var2 = ((rb) this).field_k - ((rb) this).field_m;
              this.d(var2);
              param0 = param0 - var2;
              ((rb) this).field_m = ((rb) this).field_m + var2;
              this.e();
              var3 = (oi) (Object) ((rb) this).field_l.a((byte) -84);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  var5 = var3.a((rb) this);
                  if (var5 >= 0) {
                    var3.field_g = var5;
                    this.a(var3.field_c, var3);
                    break L1;
                  } else {
                    var3.field_g = 0;
                    this.a(var3);
                    break L1;
                  }
                }
              }
              if (param0 != 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              ((rb) this).field_m = ((rb) this).field_m + param0;
              this.d(param0);
              return;
            }
          } else {
            this.d(param0);
            return;
          }
        }
    }

    final void a(ue param0, int param1, int param2) {
        ((rb) this).a((wf) (Object) pi.a(param0, param1, param2));
    }

    private final void a(oi param0) {
        param0.c(2);
        param0.a();
        ai var2 = ((rb) this).field_l.field_b.field_c;
        if (var2 == ((rb) this).field_l.field_b) {
            ((rb) this).field_k = -1;
        } else {
            ((rb) this).field_k = ((oi) (Object) var2).field_g;
        }
    }

    private final void a(ai param0, oi param1) {
        L0: while (true) {
          if (param0 != ((rb) this).field_l.field_b) {
            if (((oi) (Object) param0).field_g <= param1.field_g) {
              param0 = param0.field_c;
              continue L0;
            } else {
              lf.a(param0, (ai) (Object) param1, -17957);
              ((rb) this).field_k = ((oi) (Object) ((rb) this).field_l.field_b.field_c).field_g;
              return;
            }
          } else {
            lf.a(param0, (ai) (Object) param1, -17957);
            ((rb) this).field_k = ((oi) (Object) ((rb) this).field_l.field_b.field_c).field_g;
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        wf var4 = (wf) (Object) ((rb) this).field_n.a((byte) -78);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (wf) (Object) ((rb) this).field_n.d((byte) -77);
        }
    }

    public rb() {
        ((rb) this).field_n = new bc();
        ((rb) this).field_l = new bc();
        ((rb) this).field_m = 0;
        ((rb) this).field_k = -1;
    }
}

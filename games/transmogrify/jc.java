/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends ag {
    private qj field_n;
    private qj field_m;
    private int field_l;
    private int field_k;

    private final void a(gi param0) {
        param0.c(5);
        param0.a();
        wf var2 = this.field_m.field_d.field_b;
        if (var2 == this.field_m.field_d) {
            this.field_k = -1;
        } else {
            this.field_k = ((gi) ((Object) var2)).field_g;
        }
    }

    private final void e() {
        gi var1 = null;
        if (this.field_l > 0) {
            var1 = (gi) ((Object) this.field_m.a((byte) -95));
            while (var1 != null) {
                var1.field_g = var1.field_g - this.field_l;
                var1 = (gi) ((Object) this.field_m.a(true));
            }
            this.field_k = this.field_k - this.field_l;
            this.field_l = 0;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        ag var4 = (ag) ((Object) this.field_n.a((byte) -95));
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (ag) ((Object) this.field_n.a(true));
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        gi var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_k >= 0) {
            if (this.field_l + param0 >= this.field_k) {
              var2 = this.field_k - this.field_l;
              this.e(var2);
              param0 = param0 - var2;
              this.field_l = this.field_l + var2;
              this.e();
              var3 = (gi) ((Object) this.field_m.a((byte) -95));
              var4 = var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((jc) (this));
                    if (var5 >= 0) {
                      var3.field_g = var5;
                      this.a(var3.field_b, var3);
                      break L2;
                    } else {
                      var3.field_g = 0;
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
              this.field_l = this.field_l + param0;
              this.e(param0);
              return;
            }
          } else {
            this.e(param0);
            return;
          }
        }
    }

    private final void a(wf param0, gi param1) {
        L0: while (true) {
          if (param0 != this.field_m.field_d) {
            if (((gi) ((Object) param0)).field_g <= param1.field_g) {
              param0 = param0.field_b;
              continue L0;
            } else {
              td.a(param0, (byte) 125, param1);
              this.field_k = ((gi) ((Object) this.field_m.field_d.field_b)).field_g;
              return;
            }
          } else {
            td.a(param0, (byte) 125, param1);
            this.field_k = ((gi) ((Object) this.field_m.field_d.field_b)).field_g;
            return;
          }
        }
    }

    final ag d() {
        return (ag) ((Object) this.field_n.a((byte) -95));
    }

    final synchronized void a(ag param0) {
        this.field_n.a((wf) (param0), (byte) 33);
    }

    private final void e(int param0) {
        ag var2 = (ag) ((Object) this.field_n.a((byte) -95));
        while (var2 != null) {
            var2.d(param0);
            var2 = (ag) ((Object) this.field_n.a(true));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        gi var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (this.field_k >= 0) {
            if (this.field_l + param2 >= this.field_k) {
              var4 = this.field_k - this.field_l;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              this.field_l = this.field_l + var4;
              this.e();
              var5 = (gi) ((Object) this.field_m.a((byte) -95));
              var6 = var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((jc) (this));
                    if (var7 >= 0) {
                      var5.field_g = var7;
                      this.a(var5.field_b, var5);
                      break L2;
                    } else {
                      var5.field_g = 0;
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
              this.field_l = this.field_l + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final ag a() {
        return (ag) ((Object) this.field_n.a(true));
    }

    final int b() {
        return 0;
    }

    public jc() {
        this.field_n = new qj();
        this.field_m = new qj();
        this.field_l = 0;
        this.field_k = -1;
    }
}

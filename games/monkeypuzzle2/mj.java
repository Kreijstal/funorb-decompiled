/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends fh {
    private pj field_l;
    private pj field_i;
    private int field_k;
    private int field_j;

    final fh b() {
        return (fh) (Object) ((mj) this).field_l.d((byte) 63);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        og var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((mj) this).field_j >= 0) {
            if (((mj) this).field_k + param2 >= ((mj) this).field_j) {
              var4 = ((mj) this).field_j - ((mj) this).field_k;
              this.c(param0, param1, var4);
              param1 = param1 + var4;
              param2 = param2 - var4;
              ((mj) this).field_k = ((mj) this).field_k + var4;
              this.e();
              var5 = (og) (Object) ((mj) this).field_i.a((byte) -117);
              var6 = (Object) (Object) var5;
              synchronized (var6) {
                L1: {
                  L2: {
                    var7 = var5.a((mj) this);
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
              ((mj) this).field_k = ((mj) this).field_k + param2;
              this.c(param0, param1, param2);
              return;
            }
          } else {
            this.c(param0, param1, param2);
            return;
          }
        }
    }

    final fh a() {
        return (fh) (Object) ((mj) this).field_l.a((byte) -117);
    }

    final int d() {
        return 0;
    }

    final synchronized void b(fh param0) {
        param0.c(-19822);
    }

    private final void e(int param0) {
        fh var2 = (fh) (Object) ((mj) this).field_l.a((byte) -117);
        while (var2 != null) {
            var2.a(param0);
            var2 = (fh) (Object) ((mj) this).field_l.d((byte) 63);
        }
    }

    final synchronized void b(og param0) {
        if (param0.field_f != null) {
          if ((Object) (Object) param0.field_f != this) {
            throw new RuntimeException();
          } else {
            this.e();
            this.a(param0);
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        fh var4 = (fh) (Object) ((mj) this).field_l.a((byte) -117);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (fh) (Object) ((mj) this).field_l.d((byte) 63);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        og var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        L0: while (true) {
          if (((mj) this).field_j >= 0) {
            if (((mj) this).field_k + param0 >= ((mj) this).field_j) {
              var2 = ((mj) this).field_j - ((mj) this).field_k;
              this.e(var2);
              param0 = param0 - var2;
              ((mj) this).field_k = ((mj) this).field_k + var2;
              this.e();
              var3 = (og) (Object) ((mj) this).field_i.a((byte) -117);
              var4 = (Object) (Object) var3;
              synchronized (var4) {
                L1: {
                  L2: {
                    var5 = var3.a((mj) this);
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
              ((mj) this).field_k = ((mj) this).field_k + param0;
              this.e(param0);
              return;
            }
          } else {
            this.e(param0);
            return;
          }
        }
    }

    private final void a(og param0) {
        param0.c(-19822);
        param0.a();
        param0.field_f = null;
        ug var2 = ((mj) this).field_i.field_f.field_d;
        if (var2 == ((mj) this).field_i.field_f) {
            ((mj) this).field_j = -1;
        } else {
            ((mj) this).field_j = ((og) (Object) var2).field_e;
        }
    }

    final synchronized void c(og param0) {
        if (param0.field_f != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_f = (mj) this;
          param0.b();
          this.a(((mj) this).field_i.field_f.field_d, param0);
          return;
        }
    }

    private final void e() {
        og var1 = null;
        if (((mj) this).field_k > 0) {
            var1 = (og) (Object) ((mj) this).field_i.a((byte) -117);
            while (var1 != null) {
                var1.field_e = var1.field_e - ((mj) this).field_k;
                var1 = (og) (Object) ((mj) this).field_i.d((byte) 63);
            }
            ((mj) this).field_j = ((mj) this).field_j - ((mj) this).field_k;
            ((mj) this).field_k = 0;
        }
    }

    final synchronized void a(fh param0) {
        ((mj) this).field_l.a((ug) (Object) param0, (byte) 13);
    }

    private final void a(ug param0, og param1) {
        L0: while (true) {
          if (param0 != ((mj) this).field_i.field_f) {
            if (((og) (Object) param0).field_e <= param1.field_e) {
              param0 = param0.field_d;
              continue L0;
            } else {
              ja.a(param0, (ug) (Object) param1, -123);
              ((mj) this).field_j = ((og) (Object) ((mj) this).field_i.field_f.field_d).field_e;
              return;
            }
          } else {
            ja.a(param0, (ug) (Object) param1, -123);
            ((mj) this).field_j = ((og) (Object) ((mj) this).field_i.field_f.field_d).field_e;
            return;
          }
        }
    }

    public mj() {
        ((mj) this).field_l = new pj();
        ((mj) this).field_i = new pj();
        ((mj) this).field_j = -1;
        ((mj) this).field_k = 0;
    }
}

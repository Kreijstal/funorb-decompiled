/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr extends ana {
    private boolean field_v;
    private taa field_w;
    private tba field_x;

    private final void e(int param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = ((qr) this).field_x.field_l.a(8, ((qr) this).field_q.field_h);
        if (!(!var2.i(-79))) {
            return;
        }
        pp var3 = (pp) (Object) ((qr) this).field_x.field_o.b((byte) 90);
        while (var3 != null) {
            var4 = var3.field_h.a(-27449, ((qr) this).field_q);
            var4.b(-1, 6);
            var3.a(var2, ((qr) this).field_q.field_h, 12);
            if (!(!(var3 instanceof iv))) {
                ((qr) this).a(27799, (at) (Object) new ek(((qr) this).field_q, var4, var3.field_f));
            }
            var3 = (pp) (Object) ((qr) this).field_x.field_o.c(0);
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (!((qr) this).field_m.a((byte) -106)) {
          if (!((qr) this).field_w.a((byte) -106)) {
            L0: {
              if (!((qr) this).field_v) {
                this.d(-1);
                ((qr) this).field_v = true;
                break L0;
              } else {
                break L0;
              }
            }
            var2 = 93 / ((71 - param0) / 47);
            int fieldTemp$2 = ((qr) this).field_l - 1;
            ((qr) this).field_l = ((qr) this).field_l - 1;
            if (fieldTemp$2 >= 0) {
              return false;
            } else {
              this.f(-1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    qr(gj param0, tba param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((qr) this).field_x = param1;
            ((qr) this).field_w = new taa(((qr) this).field_q, ((qr) this).field_x.field_q, ((qr) this).field_x.field_s);
            ((qr) this).a(27799, (at) (Object) ((qr) this).field_w);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "qr.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void d(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        gf var6 = null;
        int var7 = 0;
        op var8 = null;
        var7 = BachelorFridge.field_y;
        var8 = ((qr) this).field_q.field_h;
        if (param0 == -1) {
          L0: {
            int[][] discarded$2 = ((qr) this).field_x.e(param0 ^ -7);
            var3 = 0;
            if (((qr) this).field_x.field_t.length <= var3) {
              break L0;
            } else {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      var4 = ((qr) this).field_x.field_t[var3][0];
                      var5 = ((qr) this).field_x.field_t[var3][1];
                      if (var4 < 0) {
                        var3++;
                        break L4;
                      } else {
                        if (var4 >= var8.field_z) {
                          break L4;
                        } else {
                          if (var5 < 0) {
                            break L3;
                          } else {
                            if (var8.field_B <= var5) {
                              break L2;
                            } else {
                              var6 = new gf(((qr) this).field_q, var4, var5);
                              ((kj) (Object) var6).a(0);
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    var3++;
                    break L3;
                  }
                  var3++;
                  break L2;
                }
                var3++;
                break L1;
              }
              var3++;
              var3++;
              var3++;
              var3++;
              var3++;
              var3++;
              break L0;
            }
          }
          return;
        } else {
          ((qr) this).field_v = false;
          L5: {
            int[][] discarded$3 = ((qr) this).field_x.e(param0 ^ -7);
            var3 = 0;
            if (((qr) this).field_x.field_t.length <= var3) {
              break L5;
            } else {
              L6: {
                L7: {
                  L8: {
                    L9: {
                      var4 = ((qr) this).field_x.field_t[var3][0];
                      var5 = ((qr) this).field_x.field_t[var3][1];
                      if (var4 < 0) {
                        var3++;
                        break L9;
                      } else {
                        if (var4 >= var8.field_z) {
                          break L9;
                        } else {
                          if (var5 < 0) {
                            break L8;
                          } else {
                            if (var8.field_B <= var5) {
                              break L7;
                            } else {
                              var6 = new gf(((qr) this).field_q, var4, var5);
                              ((kj) (Object) var6).a(0);
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    var3++;
                    break L8;
                  }
                  var3++;
                  break L7;
                }
                var3++;
                break L6;
              }
              var3++;
              var3++;
              var3++;
              var3++;
              var3++;
              var3++;
              break L5;
            }
          }
          return;
        }
    }

    private final void f(int param0) {
        if (param0 != -1) {
            this.d(-112);
            this.e(75);
            return;
        }
        this.e(75);
    }

    static {
    }
}

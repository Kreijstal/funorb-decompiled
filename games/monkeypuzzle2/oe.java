/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    private int field_c;
    private int field_h;
    private int field_s;
    static cd field_l;
    private int field_f;
    private float field_m;
    private int field_b;
    private int field_j;
    private int field_a;
    private int field_q;
    private boolean field_n;
    private int field_p;
    private rg field_r;
    static hi field_o;
    private int field_k;
    private int field_e;
    private int field_g;
    static boolean field_d;
    private int field_i;

    final void e(int param0) {
        this.field_r.a(this.field_i, this.field_b, param0 ^ -122);
        if (param0 != 0) {
            this.a(89, -36, 56);
        }
    }

    final static void a(m param0, int param1, byte param2) {
        hb var3 = null;
        if (param2 > -90) {
            return;
        }
        try {
            var3 = gf.field_c;
            var3.b(true, param1);
            var3.b(param0.field_g, -49152);
            var3.b(param0.field_j, -49152);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "oe.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_f = param2;
        this.field_j = param1;
        if (param0 >= -97) {
            this.field_i = -44;
        }
    }

    final void b(int param0) {
        int fieldTemp$0 = 0;
        if (null == ba.field_f) {
          L0: {
            if ((af.field_c ^ -1) < -1) {
              break L0;
            } else {
              this.field_n = false;
              break L0;
            }
          }
          if (!this.field_n) {
            L1: {
              if (this.field_j <= ub.field_b) {
                if ((this.field_j ^ -1) < -1) {
                  ue.field_D = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ue.field_D = (-ub.field_b + this.field_j) / 2;
                break L1;
              }
            }
            L2: {
              if (ub.field_b != this.field_p) {
                this.field_r.a(this.field_q, this.field_p, -116);
                break L2;
              } else {
                if (this.field_q == lb.field_z) {
                  break L2;
                } else {
                  this.field_r.a(this.field_q, this.field_p, -116);
                  break L2;
                }
              }
            }
            return;
          } else {
            if (param0 < -40) {
              fieldTemp$0 = this.field_k - 1;
              this.field_k = this.field_k - 1;
              if (fieldTemp$0 <= 0) {
                this.field_k = this.field_c;
                if (this.field_h > gb.field_i) {
                  this.field_n = false;
                  return;
                } else {
                  this.a(363);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if (this.field_h > gb.field_i) {
                break L1;
              } else {
                if (-1 <= (af.field_c ^ -1)) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
            ne.field_c.a(true);
            for (var1_int = 0; (var1_int ^ -1) > -33; var1_int++) {
                dl.field_a[var1_int] = 0L;
            }
            if (param0 <= 100) {
                oe.d(-61);
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ve.field_w[var1_int] = 0L;
            }
            bg.field_E = 0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "oe.F(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != -12248) {
            field_d = true;
        }
        field_o = null;
        field_l = null;
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var5;
        int var4;
        L0: {
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = this.field_j;
          var3 = this.field_f;
          if (param0 == 363) {
            break L0;
          } else {
            this.field_r = (rg) null;
            break L0;
          }
        }
        if (this.c(-1)) {
          L1: {
            if (var3 > this.field_e) {
              var3 = this.field_e;
              break L1;
            } else {
              if (var3 < this.field_s) {
                var3 = this.field_s;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (this.field_g < var2) {
              var2 = this.field_g;
              break L2;
            } else {
              if (var2 >= this.field_a) {
                break L2;
              } else {
                var2 = this.field_a;
                break L2;
              }
            }
          }
          L3: {
            if (this.field_m > 0.0f) {
              var4 = (int)(0.5f + (float)var3 * this.field_m);
              if (var4 > var2) {
                var3 = (int)((float)var2 / this.field_m);
                break L3;
              } else {
                if (var2 > var4) {
                  var2 = var4;
                  break L3;
                } else {
                  break L3;
                }
              }
            } else {
              break L3;
            }
          }
          L4: {
            L5: {
              if (ub.field_b != var2) {
                break L5;
              } else {
                if (var3 != lb.field_z) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            this.field_r.a(var3, var2, -121);
            break L4;
          }
          L6: {
            if ((this.field_j ^ -1) >= -1) {
              break L6;
            } else {
              ue.field_D = (-ub.field_b + this.field_j) / 2;
              break L6;
            }
          }
          return;
        } else {
          this.field_n = false;
          return;
        }
    }

    private oe() throws Throwable {
        throw new Error();
    }

    static {
        field_l = new cd("email");
        field_o = new hi();
        field_d = false;
    }
}

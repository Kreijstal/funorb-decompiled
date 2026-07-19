/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends vd {
    static pf field_v;
    private int field_C;
    static int[] field_y;
    private int field_B;
    static pf field_G;
    static pf field_D;
    gj field_x;
    static String field_E;
    static String field_H;
    static String field_u;
    static long field_z;
    static int field_w;
    static String field_A;
    private int field_F;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        if (!this.field_s) {
          return;
        } else {
          L0: {
            if (5 > param0) {
              param0 = 5;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-5 + this.field_i < param0) {
              param0 = -5 + this.field_i;
              break L1;
            } else {
              break L1;
            }
          }
          if (param1 == 0) {
            if (param0 == this.field_C) {
              return;
            } else {
              this.field_C = param0;
              var4 = (this.field_C + -2) * 65536 / (-10 + this.field_i);
              this.field_x.a(13280, var4);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(boolean param0, int param1, int param2) {
        L0: {
          if (-11 >= (param1 ^ -1)) {
            break L0;
          } else {
            param1 = 10;
            break L0;
          }
        }
        if (!param0) {
          field_E = (String) null;
          this.field_C = 5;
          this.field_i = param1;
          return;
        } else {
          this.field_C = 5;
          this.field_i = param1;
          return;
        }
    }

    public static void f(int param0) {
        if (param0 != 5) {
          return;
        } else {
          field_G = null;
          field_H = null;
          field_u = null;
          field_v = null;
          field_D = null;
          field_y = null;
          field_A = null;
          field_E = null;
          return;
        }
    }

    final static void d(byte param0) {
        int fieldTemp$2 = di.field_m + 1;
        di.field_m = di.field_m + 1;
        if ((fieldTemp$2 ^ -1) <= -201) {
          if (jn.field_a) {
            if (!p.field_n) {
              jc.a(1, (byte) 127);
              if (param0 != 44) {
                field_E = (String) null;
                return;
              } else {
                return;
              }
            } else {
              if (param0 != 44) {
                field_E = (String) null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 44) {
              field_E = (String) null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 44) {
            field_E = (String) null;
            return;
          } else {
            return;
          }
        }
    }

    final static boolean e(byte param0) {
        int var1 = -36 / ((-32 - param0) / 57);
        return ShatteredPlansClient.a(16, hd.field_k, nd.field_k);
    }

    lh(int param0, int param1, int param2, int param3) {
        super(param0, param1, 11, param2);
        this.field_C = 5;
        this.field_F = param3;
        this.field_B = ui.a(this.field_F, 0, -85, 128);
    }

    final static void a(byte param0, int[] param1, int[] param2) {
        try {
            rg.a(0, -2147483648, param2.length + -1, param1, param2);
            int var3_int = -92 % ((-25 - param0) / 57);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "lh.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        if (!(this.field_s)) {
            return;
        }
        gf.j(this.field_k - -5, this.field_t, this.field_i, this.field_p ? this.field_F : this.field_B);
        int var2 = 28 / ((param0 - 67) / 47);
        if (this.field_p) {
            gf.g(this.field_k + 5, this.field_p ? this.field_C + this.field_t : 5 + this.field_t, 5, !this.field_p ? this.field_B : this.field_F);
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (this.field_s) {
          L0: {
            var4 = bb.field_b - this.field_t;
            if (var4 < 5) {
              var4 = 5;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var4 > this.field_i - 5) {
              var4 = this.field_i + -5;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (this.field_C != var4) {
              L3: {
                this.field_C = var4;
                var5 = (-327680 + 65536 * this.field_C) / (this.field_i - 10);
                if (var5 <= 65536) {
                  break L3;
                } else {
                  var5 = 65536;
                  break L3;
                }
              }
              L4: {
                if (var5 < 0) {
                  var5 = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              this.field_x.a(13280, var5);
              break L2;
            } else {
              break L2;
            }
          }
          if (param2 != -498) {
            field_v = (pf) null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_y = new int[4];
        field_D = new pf();
        field_G = new pf();
        field_v = new pf();
        field_E = "<%0> cannot join; the game is full.";
        field_u = "Wormhole indicator";
        field_H = "1 fleet has retreated to <%0>";
        field_A = "<%0> and <%1> have signed a Non-Aggression Pact.";
    }
}

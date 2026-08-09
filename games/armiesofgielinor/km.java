/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class km {
    static ru[] field_c;
    private boolean field_b;
    private int field_k;
    int field_d;
    int field_f;
    private int field_e;
    private int field_g;
    static String field_a;
    static wk[] field_h;
    private vj field_i;
    static String[] field_j;

    final static int a(int param0) {
        if (param0 > -46) {
            field_j = (String[]) null;
        }
        return kw.field_R;
    }

    final static je c(int param0) {
        if (param0 != 0) {
            return (je) null;
        }
        return mw.field_E.field_Nb;
    }

    private final void a(int param0, int param1, boolean param2, byte param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param3 == -44) {
            break L0;
          } else {
            this.field_i = (vj) null;
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          L2: {
            if (-7 >= (var8 ^ -1)) {
              break L2;
            } else {
              if (var8 * 8 >= this.field_f) {
                break L2;
              } else {
                L3: {
                  if (param2) {
                    var7 = -((this.field_f + -(var8 * 4)) * 2) + (this.field_k + ns.a(false, var8 - -1, li.field_n));
                    var5 = -(this.field_g + -(5 * (-(4 * var8) + this.field_f))) - -ns.a(false, var8 - -1, li.field_n);
                    var6 = this.field_d;
                    break L3;
                  } else {
                    var7 = this.field_k + -(2 * (-24 + var8 * 4 + this.field_f)) - -ns.a(false, 1 + var8, li.field_n);
                    var5 = -((var8 * 4 + (-24 + this.field_f)) * 5) + (this.field_g + ns.a(false, var8 - -1, li.field_n));
                    var6 = this.field_d;
                    break L3;
                  }
                }
                fh.a(var7, -(var8 * 40) + 400, (byte) 56, fe.field_o[param0 + 1], -(5 * var8) + 63, var5, var6);
                var8++;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final static nt a(int param0, int param1, int param2, int param3) {
        nt var4;
        int var5;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = (nt) ((Object) s.field_a.e((byte) 112));
        L0: while (true) {
          if (var4 == null) {
            L1: {
              if (param1 >= 65) {
                break L1;
              } else {
                field_j = (String[]) null;
                break L1;
              }
            }
            var4 = new nt();
            var4.field_o = param0;
            var4.field_q = param2;
            s.field_a.a((byte) -119, (tc) (var4));
            tf.a(param3, var4, (byte) -64);
            return var4;
          } else {
            if ((var4.field_o ^ -1) == (param0 ^ -1)) {
              return var4;
            } else {
              var4 = (nt) ((Object) s.field_a.a((byte) 123));
              continue L0;
            }
          }
        }
    }

    final boolean b(int param0) {
        if (null != this.field_i) {
            this.field_i.a(-94);
        }
        int var2 = 36 % ((10 - param0) / 61);
        if (0 > (this.field_f ^ -1)) {
            this.field_f = this.field_f - 5;
            if (this.field_f < 0) {
                this.field_b = false;
                return true;
            }
        }
        return false;
    }

    public static void e(int param0) {
        if (param0 != 5) {
            return;
        }
        field_j = null;
        field_c = null;
        field_h = null;
        field_a = null;
    }

    private final void a(boolean param0, boolean param1, int param2) {
        int stackIn_8_0 = 0;
        gd stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_22_4;
        int stackIn_22_5;
        gd stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        Object var4;
        gd var4_ref;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var4 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 <= (this.field_f ^ -1)) {
          L0: {
            if (this.field_i != null) {
              var4_ref = (gd) ((Object) this.field_i.a(false, true, false, cs.field_db[this.field_e]));
              break L0;
            } else {
              var4_ref = (gd) ((Object) cs.field_db[this.field_e].a(false, false, false));
              break L0;
            }
          }
          L1: {
            if (!param0) {
              stackIn_8_0 = 140;
              break L1;
            } else {
              stackIn_8_0 = 1908;
              break L1;
            }
          }
          L2: {
            var5 = stackIn_8_0;
            var6 = 1536;
            var7 = 0;
            var8 = 150;
            if (this.field_e == 2) {
              var4_ref.b(256, 256, 256);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!param0) {
              var11 = -(this.field_f * 2) + this.field_k;
              var9 = -(5 * this.field_f) + this.field_g;
              var10 = this.field_d;
              break L3;
            } else {
              L4: {
                var10 = this.field_d;
                if (2 != this.field_e) {
                  var11 = -(2 * this.field_f) + this.field_k;
                  break L4;
                } else {
                  var11 = this.field_k - -60;
                  break L4;
                }
              }
              var9 = -(-(5 * this.field_f) + this.field_g);
              break L3;
            }
          }
          L5: {
            if (param1) {
              np.a(false, var4_ref);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            stackIn_22_0 = (gd) (var4_ref);

            stackIn_22_1 = var5;

            stackIn_22_2 = var6;

            stackIn_22_3 = var7;

            stackIn_22_4 = var8;

            stackIn_22_5 = var9;

            if (param1) {
              stackIn_23_0 = (gd) ((Object) stackIn_22_0);
              stackIn_23_1 = stackIn_22_1;
              stackIn_23_2 = stackIn_22_2;
              stackIn_23_3 = stackIn_22_3;
              stackIn_23_4 = stackIn_22_4;
              stackIn_23_5 = stackIn_22_5;
              stackIn_23_6 = 600;
              break L6;
            } else {
              stackIn_23_0 = (gd) ((Object) stackIn_22_0);
              stackIn_23_1 = stackIn_22_1;
              stackIn_23_2 = stackIn_22_2;
              stackIn_23_3 = stackIn_22_3;
              stackIn_23_4 = stackIn_22_4;
              stackIn_23_5 = stackIn_22_5;
              stackIn_23_6 = var11;
              break L6;
            }
          }
          ((gd) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4, stackIn_23_5, stackIn_23_6, var10);
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1, boolean param2, int param3) {
        int var6;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == -8) {
            break L0;
          } else {
            field_j = (String[]) null;
            break L0;
          }
        }
        L1: {
          if (!this.field_b) {
            break L1;
          } else {
            if ((this.field_e ^ -1) != -8) {
              if (this.field_e < 8) {
                this.a(param0, param2, param1 ^ 299);
                break L1;
              } else {
                if (param2) {
                  break L1;
                } else {
                  this.a(this.field_e - 8, param3, param0, (byte) -44);
                  break L1;
                }
              }
            } else {
              if (!param2) {
                this.a(6, param3, param0);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 6) {
            break L0;
          } else {
            km.a(52);
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var7 >= 6) {
              break L2;
            } else {
              if (20 * var7 >= this.field_f) {
                break L2;
              } else {
                L3: {
                  if (!param2) {
                    var6 = -(2 * (this.field_f - (-(var7 * 10) + 60))) + this.field_k;
                    var5 = this.field_d;
                    var4 = this.field_g + -(5 * (-((-var7 + 6) * 10) + this.field_f));
                    break L3;
                  } else {
                    var4 = -(this.field_g + -(5 * (this.field_f + -(var7 * 10))));
                    var6 = -(2 * (this.field_f + -(10 * var7))) + this.field_k;
                    var5 = this.field_d;
                    break L3;
                  }
                }
                cb.a(var5, hs.field_F[(-var7 + this.field_f / 20) % hs.field_F.length], (-var7 + 6) * 256 / 6, -110, var4, var6);
                var7++;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void d(int param0) {
        if (param0 < 8) {
            this.field_b = false;
        }
        if (!(this.field_i == null)) {
            this.field_i.a(-96);
        }
        this.field_f = this.field_f + 5;
    }

    km(int param0, int param1, int param2, int param3, int param4) {
        this.field_b = true;
        this.field_g = param0;
        this.field_f = param3;
        this.field_e = param4;
        this.field_k = param1;
        this.field_d = param2;
        if (-1 == (this.field_e ^ -1)) {
            this.field_i = new vj(1);
            this.field_i.a(-1, pv.field_a[0][0]);
        }
        if (this.field_e == 5) {
            this.field_i = new vj(1);
            this.field_i.a(-1, pv.field_a[5][0]);
        }
    }

    static {
        field_a = "Please remove <%0> from your ignore list first.";
        field_j = new String[]{"runewars_select_unit", "runewars_select_position", "runewars_errorsound", "runewars_capture_location"};
    }
}

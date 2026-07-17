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
            field_j = null;
        }
        return kw.field_R;
    }

    final static je c(int param0) {
        return mw.field_E.field_Nb;
    }

    private final void a(int param0, int param1, boolean param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var8 = 0;
        L0: while (true) {
          L1: {
            if (var8 >= 6) {
              break L1;
            } else {
              if (var8 * 8 >= ((km) this).field_f) {
                break L1;
              } else {
                L2: {
                  if (param2) {
                    var7 = -((((km) this).field_f + -(var8 * 4)) * 2) + (((km) this).field_k + ns.a(false, var8 - -1, li.field_n));
                    var5 = -(((km) this).field_g + -(5 * (-(4 * var8) + ((km) this).field_f))) - -ns.a(false, var8 - -1, li.field_n);
                    var6 = ((km) this).field_d;
                    break L2;
                  } else {
                    var7 = ((km) this).field_k + -(2 * (-24 + var8 * 4 + ((km) this).field_f)) - -ns.a(false, 1 + var8, li.field_n);
                    var5 = -((var8 * 4 + (-24 + ((km) this).field_f)) * 5) + (((km) this).field_g + ns.a(false, var8 - -1, li.field_n));
                    var6 = ((km) this).field_d;
                    break L2;
                  }
                }
                fh.a(var7, -(var8 * 40) + 400, (byte) 56, fe.field_o[param0 + 1], -(5 * var8) + 63, var5, var6);
                var8++;
                continue L0;
              }
            }
          }
          return;
        }
    }

    final static nt a(int param0, int param1, int param2, int param3) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        nt var4 = (nt) (Object) s.field_a.e((byte) 112);
        while (var4 != null) {
            if (!(var4.field_o != param0)) {
                return var4;
            }
            var4 = (nt) (Object) s.field_a.a((byte) 123);
        }
        if (param1 < 65) {
            field_j = null;
        }
        var4 = new nt();
        var4.field_o = param0;
        var4.field_q = param2;
        s.field_a.a((byte) -119, (tc) (Object) var4);
        tf.a(7, var4, (byte) -64);
        return var4;
    }

    final boolean b(int param0) {
        if (null != ((km) this).field_i) {
            boolean discarded$0 = ((km) this).field_i.a(-94);
        }
        int var2 = 36 % ((10 - param0) / 61);
        if (((km) this).field_f > -1) {
            ((km) this).field_f = ((km) this).field_f - 5;
            if (((km) this).field_f < 0) {
                ((km) this).field_b = false;
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
        Object var4 = null;
        gd var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_8_0 = 0;
        gd stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        gd stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        gd stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        gd stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        gd stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        gd stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        var4 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 <= ~((km) this).field_f) {
          L0: {
            if (((km) this).field_i != null) {
              var4_ref = (gd) (Object) ((km) this).field_i.a(false, true, false, cs.field_db[((km) this).field_e]);
              break L0;
            } else {
              var4_ref = (gd) (Object) cs.field_db[((km) this).field_e].a(false, false, false);
              break L0;
            }
          }
          L1: {
            if (!param0) {
              stackOut_7_0 = 140;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 1908;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var5 = stackIn_8_0;
            var6 = 1536;
            var7 = 0;
            var8 = 150;
            if (((km) this).field_e == 2) {
              var4_ref.b(256, 256, 256);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!param0) {
              var11 = -(((km) this).field_f * 2) + ((km) this).field_k;
              var9 = -(5 * ((km) this).field_f) + ((km) this).field_g;
              var10 = ((km) this).field_d;
              break L3;
            } else {
              L4: {
                var10 = ((km) this).field_d;
                if (2 != ((km) this).field_e) {
                  var11 = -(2 * ((km) this).field_f) + ((km) this).field_k;
                  break L4;
                } else {
                  var11 = ((km) this).field_k - -60;
                  break L4;
                }
              }
              var9 = -(-(5 * ((km) this).field_f) + ((km) this).field_g);
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
            stackOut_20_0 = (gd) var4_ref;
            stackOut_20_1 = var5;
            stackOut_20_2 = var6;
            stackOut_20_3 = var7;
            stackOut_20_4 = var8;
            stackOut_20_5 = var9;
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_22_2 = stackOut_20_2;
            stackIn_22_3 = stackOut_20_3;
            stackIn_22_4 = stackOut_20_4;
            stackIn_22_5 = stackOut_20_5;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            stackIn_21_2 = stackOut_20_2;
            stackIn_21_3 = stackOut_20_3;
            stackIn_21_4 = stackOut_20_4;
            stackIn_21_5 = stackOut_20_5;
            if (param1) {
              stackOut_22_0 = (gd) (Object) stackIn_22_0;
              stackOut_22_1 = stackIn_22_1;
              stackOut_22_2 = stackIn_22_2;
              stackOut_22_3 = stackIn_22_3;
              stackOut_22_4 = stackIn_22_4;
              stackOut_22_5 = stackIn_22_5;
              stackOut_22_6 = 600;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              stackIn_23_3 = stackOut_22_3;
              stackIn_23_4 = stackOut_22_4;
              stackIn_23_5 = stackOut_22_5;
              stackIn_23_6 = stackOut_22_6;
              break L6;
            } else {
              stackOut_21_0 = (gd) (Object) stackIn_21_0;
              stackOut_21_1 = stackIn_21_1;
              stackOut_21_2 = stackIn_21_2;
              stackOut_21_3 = stackIn_21_3;
              stackOut_21_4 = stackIn_21_4;
              stackOut_21_5 = stackIn_21_5;
              stackOut_21_6 = var11;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              stackIn_23_3 = stackOut_21_3;
              stackIn_23_4 = stackOut_21_4;
              stackIn_23_5 = stackOut_21_5;
              stackIn_23_6 = stackOut_21_6;
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
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == -8) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        L1: {
          if (!((km) this).field_b) {
            break L1;
          } else {
            if (((km) this).field_e != 7) {
              if (((km) this).field_e < 8) {
                this.a(param0, param2, param1 ^ 299);
                break L1;
              } else {
                if (param2) {
                  break L1;
                } else {
                  this.a(((km) this).field_e - 8, param3, param0, (byte) -44);
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 6) {
            break L0;
          } else {
            int discarded$2 = km.a(52);
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var7 >= 6) {
              break L2;
            } else {
              if (20 * var7 >= ((km) this).field_f) {
                break L2;
              } else {
                L3: {
                  if (!param2) {
                    var6 = -(2 * (((km) this).field_f - (-(var7 * 10) + 60))) + ((km) this).field_k;
                    var5 = ((km) this).field_d;
                    var4 = ((km) this).field_g + -(5 * (-((-var7 + 6) * 10) + ((km) this).field_f));
                    break L3;
                  } else {
                    var4 = -(((km) this).field_g + -(5 * (((km) this).field_f + -(var7 * 10))));
                    var6 = -(2 * (((km) this).field_f + -(10 * var7))) + ((km) this).field_k;
                    var5 = ((km) this).field_d;
                    break L3;
                  }
                }
                cb.a(var5, hs.field_F[(-var7 + ((km) this).field_f / 20) % hs.field_F.length], (-var7 + 6) * 256 / 6, -110, var4, var6);
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
            ((km) this).field_b = false;
        }
        if (!(((km) this).field_i == null)) {
            boolean discarded$0 = ((km) this).field_i.a(-96);
        }
        ((km) this).field_f = ((km) this).field_f + 5;
    }

    km(int param0, int param1, int param2, int param3, int param4) {
        ((km) this).field_b = true;
        ((km) this).field_g = param0;
        ((km) this).field_f = param3;
        ((km) this).field_e = param4;
        ((km) this).field_k = param1;
        ((km) this).field_d = param2;
        if (((km) this).field_e == 0) {
            ((km) this).field_i = new vj(1);
            ((km) this).field_i.a(-1, pv.field_a[0][0]);
        }
        if (((km) this).field_e == 5) {
            ((km) this).field_i = new vj(1);
            ((km) this).field_i.a(-1, pv.field_a[5][0]);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please remove <%0> from your ignore list first.";
        field_j = new String[]{"runewars_select_unit", "runewars_select_position", "runewars_errorsound", "runewars_capture_location"};
    }
}

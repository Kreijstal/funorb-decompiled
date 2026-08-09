/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends oj {
    int field_D;
    private boolean field_B;
    static je field_z;
    int field_y;
    static StringBuilder field_C;

    final static void h(int param0) {
        er.a((byte) -127);
        int var1 = 2 % ((1 - param0) / 51);
    }

    final void a(ha param0, int param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        jd var4 = null;
        jd var5 = null;
        try {
          L0: {
            if (!this.field_B) {
              this.field_B = true;
              var4 = param0.c(this.field_y, true, this.field_D);
              var5 = var4;
              if (var5 == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0.field_b) {
                    break L1;
                  } else {
                    if (param0.field_sb == var5.field_O) {
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                L2: {
                  if (param0.field_H[var4.field_O] < 10) {
                    param0.field_l.a((byte) -119, (tc) (new hp(this.field_D, this.field_y)));
                    break L2;
                  } else {
                    param0.field_H[var4.field_O] = param0.field_H[var4.field_O] - 10;
                    if (param0.field_b) {
                      param0.field_ub[var4.field_O] = param0.field_ub[var4.field_O] + 10;
                      param0.d(var5.field_O, param0.field_ub[var4.field_O], 85, 10);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                fl.a(param0, -113);
                if (param1 == -26661) {
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  field_z = (je) null;
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("qj.G(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(kl param0, int param1) {
        try {
            bc.field_j = new ru[6][];
            lt.field_h = new wk[6];
            lt.field_h[1] = ic.a("coatofarms_lbarespace", (byte) 51, "basic", param0);
            lt.field_h[2] = ic.a("coatofarms_rbarespace", (byte) 51, "basic", param0);
            lt.field_h[5] = ic.a("coatofarms_iconspace", (byte) 51, "basic", param0);
            lt.field_h[4] = ic.a("coatofarms_topperspace", (byte) 51, "basic", param0);
            bc.field_j[0] = lo.a("coatofarms_bases", -28106, "basic", param0);
            if (param1 <= 20) {
                kl var3 = (kl) null;
                qj.a((kl) null, 74);
            }
            bc.field_j[1] = lo.a("coatofarms_lbarers", -28106, "basic", param0);
            bc.field_j[2] = lo.a("coatofarms_rbarers", -28106, "basic", param0);
            bc.field_j[3] = lo.a("coatofarms_banners", -28106, "basic", param0);
            bc.field_j[5] = lo.a("coatofarms_icons", -28106, "basic", param0);
            bc.field_j[4] = lo.a("coatofarms_toppers", -28106, "basic", param0);
            a.field_m = fk.a("coatofarms_effects", (byte) -124, param0, "basic");
            ic.a("coatofarms_palette", (byte) 51, "basic", param0);
            sa.field_a = ic.a("coatofarms_scrollbutton", (byte) 51, "basic", param0);
            wv.field_h = fk.a("coatofarms_buttons", (byte) -128, param0, "basic");
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "qj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void g(int param0) {
        if (param0 != 10) {
            qj.g(30);
            field_z = null;
            field_C = null;
            return;
        }
        field_z = null;
        field_C = null;
    }

    final String a(byte param0, boolean param1) {
        int var3;
        String var4;
        var3 = -19 / ((param0 - 53) / 51);
        if (param1) {
          System.out.println("Upkeep event debug");
          System.out.println("Unit at " + this.field_D + "," + this.field_y);
          var4 = "EventUpkeep: (" + this.field_D + "," + this.field_y + ")";
          return var4;
        } else {
          var4 = "EventUpkeep: (" + this.field_D + "," + this.field_y + ")";
          return var4;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = this.a((byte) -39, param2, param0, true) ? 1 : 0;
            this.a(param2.field_xb, -26661);
            if (param1 < -84) {
              stackIn_4_0 = var4_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("qj.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    qj(int param0, int param1) {
        this.field_m = 20;
        this.field_D = param0;
        this.field_y = param1;
    }

    static {
        field_C = new StringBuilder(80);
    }
}

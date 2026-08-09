/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends tj implements he {
    static wk[] field_F;
    static int[] field_I;
    static String field_P;
    static String field_H;
    static int field_J;
    private fw field_G;
    static int field_N;
    private fw field_E;
    static kl field_M;
    static int field_Q;
    static rf field_K;
    static int[] field_O;
    private fw field_L;

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) != -99) {
                if ((param1 ^ -1) != -100) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.b((byte) -126, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a(false, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ce.F(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final static int[] a(int param0) {
        if (param0 > -26) {
            return (int[]) null;
        }
        return new int[8];
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        var5 = param0 + this.field_B;
        var6 = this.field_p + param1;
        if (param2 >= -82) {
          field_F = (wk[]) null;
          ArmiesOfGielinor.field_J.a(aq.field_a, 20 + var5, var6 - -20, -40 + this.field_l, -50 + this.field_w, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.field_H);
          super.a(param0, param1, (byte) -107, param3);
          return;
        } else {
          ArmiesOfGielinor.field_J.a(aq.field_a, 20 + var5, var6 - -20, -40 + this.field_l, -50 + this.field_w, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.field_H);
          super.a(param0, param1, (byte) -107, param3);
          return;
        }
    }

    public static void k(int param0) {
        field_P = null;
        field_I = null;
        field_M = null;
        if (param0 != 12000) {
          field_Q = -81;
          field_H = null;
          field_K = null;
          field_F = null;
          field_O = null;
          return;
        } else {
          field_H = null;
          field_K = null;
          field_F = null;
          field_O = null;
          return;
        }
    }

    public ce() {
        super(0, 0, 476, 225, (kh) null);
        this.field_L = new fw(li.field_p, (qo) null);
        this.field_G = new fw(pt.field_Y, (qo) null);
        this.field_E = new fw(pi.field_O, (qo) null);
        nu var1 = new nu();
        this.field_L.field_k = (kh) ((Object) var1);
        this.field_G.field_k = (kh) ((Object) var1);
        this.field_E.field_k = (kh) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -1319432543;
        this.field_G.a(this.field_l + -var3 >> 568564289, var4, this.field_w - 48 + -var2, 8192, 30);
        this.field_E.a((-var3 + this.field_l >> 158666433) - -var4 + var2, var4, -var2 + this.field_w - 48, 8192, 30);
        this.field_L.a(-var3 + this.field_l >> 1666722785, var3, -(2 * var2) + this.field_w + -78, 8192, 30);
        this.field_G.field_x = (qo) (this);
        this.field_L.field_x = (qo) (this);
        this.field_E.field_x = (qo) (this);
        this.field_L.field_s = hb.field_b;
        this.field_E.field_s = vn.field_e;
        this.a((byte) 10, (kb) (this.field_G));
        this.a((byte) 10, (kb) (this.field_L));
        this.a((byte) 10, (kb) (this.field_E));
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        fw var8 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_G == param4) {
                ou.b((byte) 126);
                break L1;
              } else {
                if (this.field_L != param4) {
                  if (this.field_E != param4) {
                    break L1;
                  } else {
                    di.c((byte) -127);
                    break L1;
                  }
                } else {
                  rq.a(false);
                  break L1;
                }
              }
            }
            if (param1 == 11) {
              break L0;
            } else {
              var8 = (fw) null;
              this.a(47, 86, -42, 41, (fw) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("ce.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    static {
        field_P = "(Exit)";
        field_Q = 640;
        field_H = "Your turn";
        field_I = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_J = 10;
        field_O = new int[]{12000, 9000, 7500, 6000, 4500, 3000, 1500};
    }
}

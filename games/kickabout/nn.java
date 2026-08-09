/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends wj implements vh {
    private wi field_H;
    static ot field_B;
    static String field_L;
    static ot field_K;
    static String[] field_G;
    private wi field_J;
    static boolean field_D;
    static String[] field_I;
    private wi field_E;
    static ut field_C;

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (param3 > 64) {
              if (param1 == this.field_J) {
                nn.a(-25085);
                return;
              } else {
                if (param1 == this.field_E) {
                  fr.a((byte) -76);
                  return;
                } else {
                  if (this.field_H == param1) {
                    bh.a(true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("nn.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        String var2;
        if (param0 != -25085) {
          nn.k(115);
          var2 = (String) null;
          ui.a("", (byte) 111, (String) null);
          return;
        } else {
          var2 = (String) null;
          ui.a("", (byte) 111, (String) null);
          return;
        }
    }

    public static void k(int param0) {
        if (param0 != 2) {
          field_C = (ut) null;
          field_L = null;
          field_B = null;
          field_I = null;
          field_G = null;
          field_K = null;
          field_C = null;
          return;
        } else {
          field_L = null;
          field_B = null;
          field_I = null;
          field_G = null;
          field_K = null;
          field_C = null;
          return;
        }
    }

    public nn() {
        super(0, 0, 476, 225, (gj) null);
        this.field_E = new wi(dw.field_f, (jv) null);
        this.field_J = new wi(vb.field_e, (jv) null);
        this.field_H = new wi(ba.field_o, (jv) null);
        op var1 = new op();
        this.field_E.field_r = (gj) ((Object) var1);
        this.field_J.field_r = (gj) ((Object) var1);
        this.field_H.field_r = (gj) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> -1929100191;
        this.field_J.a(30, 1, this.field_n + -var3 >> 1174333729, var4, -var2 + (this.field_i - 48));
        this.field_H.a(30, 1, var4 + ((-var3 + this.field_n >> -879203903) - -var2), var4, -48 + (this.field_i + -var2));
        this.field_E.a(30, 1, this.field_n + -var3 >> -705987071, var3, -(var2 * 2) + (this.field_i + -78));
        this.field_J.field_k = (jv) (this);
        this.field_E.field_k = (jv) (this);
        this.field_H.field_k = (jv) (this);
        this.field_E.field_u = so.field_c;
        this.field_H.field_u = pv.field_G;
        this.a(-59, this.field_J);
        this.a(-121, this.field_E);
        this.a(-54, this.field_H);
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, (byte) -101, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param3 ^ -1) == -99) {
                stackIn_7_0 = this.a(param2, (byte) -100);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 < -60) {
                  if ((param3 ^ -1) == -100) {
                    stackIn_14_0 = this.b(param2, (byte) 126);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("nn.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + this.field_t;
        int var6 = param3 + this.field_g;
        gf.field_a.a(vb.field_i, 20 + var5, 20 + var6, this.field_n + -40, this.field_i + -50, 16777215, -1, 1, 0, gf.field_a.field_G);
        super.a(param0, (int) (char)param1, param2, param3);
    }

    static {
        field_G = new String[]{"POW:", "SPD:", "TCK:", "EXP:"};
        field_D = false;
        field_L = "<%0> has resigned.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends ki implements ka {
    private pj field_G;
    static int[] field_H;
    private pj field_E;
    static int[] field_D;
    private pj field_F;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + ((ig) this).field_m;
        int var6 = ((ig) this).field_j + param0;
        int discarded$0 = ua.field_G.a(se.field_z, 20 + var5, 20 + var6, -40 + ((ig) this).field_t, -50 + ((ig) this).field_x, 16777215, -1, 1, param3, ua.field_G.field_F);
        super.a(param0, param1, param2, 0);
    }

    public static void e(byte param0) {
        Object var2 = null;
        field_H = null;
        if (param0 >= -85) {
          var2 = null;
          o discarded$2 = ig.a((o) null, 0, 30, 35, 43, 70);
          field_D = null;
          return;
        } else {
          field_D = null;
          return;
        }
    }

    public ig() {
        super(0, 0, 476, 225, (j) null);
        ((ig) this).field_E = new pj(wk.field_g, (dg) null);
        ((ig) this).field_F = new pj(mf.field_F, (dg) null);
        ((ig) this).field_G = new pj(pf.field_c, (dg) null);
        gh var1 = new gh();
        ((ig) this).field_E.field_w = (j) (Object) var1;
        ((ig) this).field_F.field_w = (j) (Object) var1;
        ((ig) this).field_G.field_w = (j) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        ((ig) this).field_F.b(30, var4, ((ig) this).field_t + -var3 >> 1, 0, -var2 + (-48 + ((ig) this).field_x));
        ((ig) this).field_G.b(30, var4, var2 + ((((ig) this).field_t + -var3 >> 1) + var4), 0, -var2 + (-48 + ((ig) this).field_x));
        ((ig) this).field_E.b(30, var3, -var3 + ((ig) this).field_t >> 1, 0, -(2 * var2) + (-78 + ((ig) this).field_x));
        ((ig) this).field_F.field_n = (dg) this;
        ((ig) this).field_E.field_n = (dg) this;
        ((ig) this).field_E.field_z = id.field_b;
        ((ig) this).field_G.field_n = (dg) this;
        ((ig) this).field_G.field_z = a.field_g;
        ((ig) this).a((rc) (Object) ((ig) this).field_F, 5411);
        ((ig) this).a((rc) (Object) ((ig) this).field_E, 5411);
        ((ig) this).a((rc) (Object) ((ig) this).field_G, 5411);
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, (byte) -106, param2, param3)) {
              if (param2 == 98) {
                stackOut_5_0 = ((ig) this).a((byte) -122, param3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var5_int = 67 % ((param1 - 31) / 56);
                if (param2 == 99) {
                  stackOut_9_0 = ((ig) this).b(97, param3);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ig.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final static void h(int param0) {
        if (param0 > -102) {
            ig.h(102);
        }
    }

    final static o a(o param0, int param1, int param2, int param3, int param4, int param5) {
        o var6 = null;
        RuntimeException var6_ref = null;
        Object stackIn_2_0 = null;
        o stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        o stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 30) {
              var6 = new o(param4, param5);
              o.a(param0, var6, param3, param2, 0, 0, param4, param5);
              stackOut_3_0 = (o) var6;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (o) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("ig.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_4_0;
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        return cj.a(-69);
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 != ((ig) this).field_F) {
                if (param3 != ((ig) this).field_E) {
                  if (((ig) this).field_G == param3) {
                    int discarded$2 = 4;
                    qk.f();
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  wf.d(350);
                  break L1;
                }
              } else {
                ok.a((byte) 96);
                break L1;
              }
            }
            if (param4) {
              break L0;
            } else {
              ig.e((byte) 30);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ig.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 41);
        }
    }

    final static void a(byte param0) {
        gf.field_cb.c(-3399, (rc) (Object) new ig());
        if (param0 > -31) {
            Object var2 = null;
            o discarded$0 = ig.a((o) null, 122, 9, -53, 119, 102);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new int[8192];
    }
}

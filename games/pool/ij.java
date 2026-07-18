/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends ma {
    int field_E;
    int[] field_L;
    int field_B;
    int[] field_x;
    int[] field_p;
    int field_H;
    vh field_q;
    int field_w;
    static int field_G;
    int field_m;
    static String field_n;
    int[] field_D;
    vh field_I;
    int[] field_F;
    int[] field_z;
    dd field_K;
    int field_r;
    static String field_A;
    int field_C;
    int field_y;
    vh field_l;
    static String field_s;
    static cg field_u;
    static so field_o;
    int field_v;
    static String field_t;
    int field_J;

    public static void a(int param0) {
        field_u = null;
        field_A = null;
        if (param0 != -273542815) {
          ij.a(118);
          field_t = null;
          field_o = null;
          field_s = null;
          field_n = null;
          return;
        } else {
          field_t = null;
          field_o = null;
          field_s = null;
          field_n = null;
          return;
        }
    }

    ij(int param0) {
        ((ij) this).field_q = null;
        ((ij) this).field_w = 256;
        ((ij) this).field_p = null;
        ((ij) this).field_D = null;
        ((ij) this).field_I = null;
        ((ij) this).field_y = 25;
        ((ij) this).field_l = null;
        ((ij) this).field_r = 10;
        ((ij) this).field_F = null;
        ((ij) this).field_H = 25;
        ((ij) this).field_v = 12;
        ((ij) this).field_z = new int[]{qh.field_l >> 1, qh.field_f >> 1};
        ((ij) this).field_m = param0;
        ((ij) this).field_L = new int[]{qh.field_l >> 1, qh.field_f >> 1};
        ((ij) this).field_x = new int[]{qh.field_l >> 1, qh.field_f >> 1};
        ((ij) this).field_B = 50;
    }

    final void a(String param0, byte param1, String param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dd var14 = null;
        int stackIn_7_0 = 0;
        an stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_17_7 = 0;
        an stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        an stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        int stackIn_19_6 = 0;
        int stackIn_19_7 = 0;
        int stackIn_19_8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        an stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        int stackOut_16_7 = 0;
        an stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        int stackOut_18_5 = 0;
        int stackOut_18_6 = 0;
        int stackOut_18_7 = 0;
        int stackOut_18_8 = 0;
        an stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        int stackOut_17_6 = 0;
        int stackOut_17_7 = 0;
        int stackOut_17_8 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 79) {
                break L1;
              } else {
                ((ij) this).field_L = null;
                break L1;
              }
            }
            var14 = dq.a(4, 0, param0);
            var5 = var14.field_z;
            if (param2 != null) {
              L2: {
                ((ij) this).field_B = 25 * param2.length() / 16;
                var6 = sa.field_h.b(param2, 320, sa.field_h.field_G + 3);
                var7 = 5 + mc.field_e.field_C + (mc.field_e.field_w - -var6);
                if (var5 >= 320) {
                  stackOut_6_0 = var5;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 320;
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                }
              }
              var8 = stackIn_7_0;
              ((ij) this).field_K = new dd(var8, var7);
              ((ij) this).field_K.e();
              var14.c(var8 - var14.field_z >> 1, 0);
              var9 = 0;
              var10 = new String[16];
              var11 = sa.field_h.a(param2, new int[1], var10);
              var12 = 0;
              L3: while (true) {
                if (var11 <= var12) {
                  L4: {
                    stackOut_16_0 = sa.field_h;
                    stackOut_16_1 = (String) param2;
                    stackOut_16_2 = (-320 + var8) / 2;
                    stackOut_16_3 = mc.field_e.field_w + (mc.field_e.field_C + 5);
                    stackOut_16_4 = 320;
                    stackOut_16_5 = var6;
                    stackOut_16_6 = 16777215;
                    stackOut_16_7 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    stackIn_18_4 = stackOut_16_4;
                    stackIn_18_5 = stackOut_16_5;
                    stackIn_18_6 = stackOut_16_6;
                    stackIn_18_7 = stackOut_16_7;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    stackIn_17_4 = stackOut_16_4;
                    stackIn_17_5 = stackOut_16_5;
                    stackIn_17_6 = stackOut_16_6;
                    stackIn_17_7 = stackOut_16_7;
                    if (var9 < 320) {
                      stackOut_18_0 = (an) (Object) stackIn_18_0;
                      stackOut_18_1 = (String) (Object) stackIn_18_1;
                      stackOut_18_2 = stackIn_18_2;
                      stackOut_18_3 = stackIn_18_3;
                      stackOut_18_4 = stackIn_18_4;
                      stackOut_18_5 = stackIn_18_5;
                      stackOut_18_6 = stackIn_18_6;
                      stackOut_18_7 = stackIn_18_7;
                      stackOut_18_8 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      stackIn_19_3 = stackOut_18_3;
                      stackIn_19_4 = stackOut_18_4;
                      stackIn_19_5 = stackOut_18_5;
                      stackIn_19_6 = stackOut_18_6;
                      stackIn_19_7 = stackOut_18_7;
                      stackIn_19_8 = stackOut_18_8;
                      break L4;
                    } else {
                      stackOut_17_0 = (an) (Object) stackIn_17_0;
                      stackOut_17_1 = (String) (Object) stackIn_17_1;
                      stackOut_17_2 = stackIn_17_2;
                      stackOut_17_3 = stackIn_17_3;
                      stackOut_17_4 = stackIn_17_4;
                      stackOut_17_5 = stackIn_17_5;
                      stackOut_17_6 = stackIn_17_6;
                      stackOut_17_7 = stackIn_17_7;
                      stackOut_17_8 = 3;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      stackIn_19_3 = stackOut_17_3;
                      stackIn_19_4 = stackOut_17_4;
                      stackIn_19_5 = stackOut_17_5;
                      stackIn_19_6 = stackOut_17_6;
                      stackIn_19_7 = stackOut_17_7;
                      stackIn_19_8 = stackOut_17_8;
                      break L4;
                    }
                  }
                  int discarded$1 = ((an) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_19_4, stackIn_19_5, stackIn_19_6, stackIn_19_7, stackIn_19_8, 0, 3 - -sa.field_h.field_G);
                  sh.field_P.b(15100);
                  break L0;
                } else {
                  L5: {
                    var13 = sa.field_h.b(var10[var12]);
                    if (var9 >= var13) {
                      var12++;
                      var12++;
                      break L5;
                    } else {
                      var9 = var13;
                      var12++;
                      break L5;
                    }
                  }
                  var12++;
                  continue L3;
                }
              }
            } else {
              ((ij) this).field_B = (param0.length() >> 3) * 25;
              ((ij) this).field_K = var14;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("ij.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 0;
        field_n = "Invalid date";
        field_A = "You<%0> are <%2>.";
        field_u = null;
        field_t = "Spots";
        field_s = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}

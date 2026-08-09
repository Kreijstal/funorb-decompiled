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
        this.field_q = null;
        this.field_w = 256;
        this.field_p = null;
        this.field_D = null;
        this.field_I = null;
        this.field_y = 25;
        this.field_l = null;
        this.field_r = 10;
        this.field_F = null;
        this.field_H = 25;
        this.field_v = 12;
        this.field_z = new int[]{qh.field_l >> -952715359, qh.field_f >> 599496897};
        this.field_m = param0;
        this.field_L = new int[]{qh.field_l >> 885399457, qh.field_f >> -1797351167};
        this.field_x = new int[]{qh.field_l >> 126986081, qh.field_f >> -273542815};
        this.field_B = 50;
    }

    final void a(String param0, byte param1, String param2) {
        int stackIn_7_0 = 0;
        an stackIn_15_0;
        String stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        int stackIn_15_5;
        int stackIn_15_6;
        int stackIn_15_7;
        an stackIn_16_0;
        String stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_16_4;
        int stackIn_16_5;
        int stackIn_16_6;
        int stackIn_16_7;
        int stackIn_16_8;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            L1: {
              if (param1 >= 79) {
                break L1;
              } else {
                this.field_L = (int[]) null;
                break L1;
              }
            }
            var14 = dq.a(4, 0, param0);
            var5 = var14.field_z;
            if (param2 != null) {
              L2: {
                this.field_B = 25 * param2.length() / 16;
                var6 = sa.field_h.b(param2, 320, sa.field_h.field_G + 3);
                var7 = 5 + mc.field_e.field_C + (mc.field_e.field_w - -var6);
                if (var5 >= 320) {
                  stackIn_7_0 = var5;
                  break L2;
                } else {
                  stackIn_7_0 = 320;
                  break L2;
                }
              }
              var8 = stackIn_7_0;
              this.field_K = new dd(var8, var7);
              this.field_K.e();
              var14.c(var8 - var14.field_z >> 626471457, 0);
              var9 = 0;
              var10 = new String[16];
              var11 = sa.field_h.a(param2, new int[]{320}, var10);
              var12 = 0;
              L3: while (true) {
                if (var11 <= var12) {
                  L4: {
                    stackIn_15_0 = sa.field_h;

                    stackIn_15_1 = (String) (param2);

                    stackIn_15_2 = (-320 + var8) / 2;

                    stackIn_15_3 = mc.field_e.field_w + (mc.field_e.field_C + 5);

                    stackIn_15_4 = 320;

                    stackIn_15_5 = var6;

                    stackIn_15_6 = 16777215;

                    stackIn_15_7 = 1;

                    if ((var9 ^ -1) > -321) {
                      stackIn_16_0 = (an) ((Object) stackIn_15_0);
                      stackIn_16_1 = (String) ((Object) stackIn_15_1);
                      stackIn_16_2 = stackIn_15_2;
                      stackIn_16_3 = stackIn_15_3;
                      stackIn_16_4 = stackIn_15_4;
                      stackIn_16_5 = stackIn_15_5;
                      stackIn_16_6 = stackIn_15_6;
                      stackIn_16_7 = stackIn_15_7;
                      stackIn_16_8 = 1;
                      break L4;
                    } else {
                      stackIn_16_0 = (an) ((Object) stackIn_15_0);
                      stackIn_16_1 = (String) ((Object) stackIn_15_1);
                      stackIn_16_2 = stackIn_15_2;
                      stackIn_16_3 = stackIn_15_3;
                      stackIn_16_4 = stackIn_15_4;
                      stackIn_16_5 = stackIn_15_5;
                      stackIn_16_6 = stackIn_15_6;
                      stackIn_16_7 = stackIn_15_7;
                      stackIn_16_8 = 3;
                      break L4;
                    }
                  }
                  ((an) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4, stackIn_16_5, stackIn_16_6, stackIn_16_7, stackIn_16_8, 0, 3 - -sa.field_h.field_G);
                  sh.field_P.b(15100);
                  break L0;
                } else {
                  L5: {
                    var13 = sa.field_h.b(var10[var12]);
                    if (var9 >= var13) {
                      break L5;
                    } else {
                      var9 = var13;
                      break L5;
                    }
                  }
                  var12++;
                  continue L3;
                }
              }
            } else {
              this.field_B = (param0.length() >> -1419604221) * 25;
              this.field_K = var14;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("ij.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
    }

    static {
        field_G = 0;
        field_n = "Invalid date";
        field_A = "You<%0> are <%2>.";
        field_u = null;
        field_t = "Spots";
        field_s = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}

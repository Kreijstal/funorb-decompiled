/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gh extends nh {
    private boolean field_h;
    private int field_g;
    static String field_f;
    private int field_l;
    private eo field_c;
    private boolean field_a;
    private int field_j;
    private boolean field_b;
    private gf field_d;
    private int field_k;
    static String field_e;
    private int field_i;
    private int field_m;

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        asa var12 = null;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        asa var27 = null;
        gf stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        gf stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        gf stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        gf stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        gf stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hs stackIn_5_2 = null;
        gf stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        gf stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        gf stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        gf stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hs stackOut_3_2 = null;
        gf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        hs stackOut_4_2 = null;
        L0: {
          L1: {
            var27 = ((gh) this).field_c.y((byte) -77);
            var12 = ((gh) this).field_c.C(0);
            stackOut_0_0 = ((gh) this).field_d;
            stackOut_0_1 = 7672;
            stackIn_4_0 = stackOut_0_0;
            stackIn_4_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (((gh) this).field_a) {
              break L1;
            } else {
              stackOut_1_0 = (gf) (Object) stackIn_1_0;
              stackOut_1_1 = stackIn_1_1;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (((gh) this).field_h) {
                break L1;
              } else {
                stackOut_2_0 = (gf) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if ((1 & param9) == 0) {
                  break L1;
                } else {
                  stackOut_3_0 = (gf) (Object) stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = aw.field_G;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = (gf) (Object) stackIn_4_0;
          stackOut_4_1 = stackIn_4_1;
          stackOut_4_2 = ue.field_v;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          stackIn_5_2 = stackOut_4_2;
          break L0;
        }
        L2: {
          ((gf) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2);
          ((gh) this).field_c.k((byte) 121);
          ((gh) this).field_c.a(true, (iva) (Object) ((gh) this).field_d);
          ((gh) this).field_c.c(param8, 1);
          ((gh) this).field_c.a((byte) -97, param6);
          ((gh) this).field_c.a(pea.field_c, 1, -82);
          ((gh) this).field_c.a(1, false, pea.field_c);
          ((gh) this).field_c.g(3625, param7);
          if (((gh) this).field_b) {
            var13 = (float)((gh) this).d();
            var14 = (float)((gh) this).b();
            var15 = (-param0 + param2) / var13;
            var16 = (param3 - param1) / var13;
            var17 = (-param0 + param4) / var14;
            var18 = (param5 - param1) / var14;
            var19 = var17 * (float)((gh) this).field_j;
            var20 = (float)((gh) this).field_j * var18;
            var21 = var15 * (float)((gh) this).field_g;
            var22 = (float)((gh) this).field_g * var16;
            var23 = (float)((gh) this).field_m * -var15;
            var24 = -var16 * (float)((gh) this).field_m;
            var25 = (float)((gh) this).field_i * -var17;
            param2 = var19 + (param2 + var23);
            param4 = var25 + (var21 + param4);
            var26 = (float)((gh) this).field_i * -var18;
            param1 = var20 + (var22 + param1);
            param0 = var21 + param0 + var19;
            param3 = var20 + (var24 + param3);
            param5 = var26 + (param5 + var22);
            break L2;
          } else {
            break L2;
          }
        }
        var27.a(0.0f, 0.0f, (byte) 102, 0.0f, 0.0f, -param0 + param2, -param0 + param4, -param1 + param3, 1.0f, -param1 + param5);
        var27.a(param1, -108, param0, 0.0f);
        var12.a(1.0f, ((gh) this).field_d.a((float)((gh) this).field_l, (byte) -33), false, ((gh) this).field_d.a(62, (float)((gh) this).field_k));
        ((gh) this).field_c.a(pfa.field_i, false);
        ((gh) this).field_c.F(-1662);
        ((gh) this).field_c.y(2);
        ((gh) this).field_c.p((byte) -60);
        ((gh) this).field_c.a(lja.field_j, 1, -22);
        ((gh) this).field_c.a(1, false, lja.field_j);
    }

    final int a() {
        return ((gh) this).field_l;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        asa var8 = ((gh) this).field_c.y((byte) -77);
        asa var7 = ((gh) this).field_c.C(0);
        param1 = param1 + ((gh) this).field_j;
        param0 = param0 + ((gh) this).field_g;
        ((gh) this).field_d.a(7672, ue.field_v);
        ((gh) this).field_c.k((byte) 105);
        ((gh) this).field_c.a(true, (iva) (Object) ((gh) this).field_d);
        ((gh) this).field_c.c(param4, 1);
        ((gh) this).field_c.a((byte) -19, param2);
        ((gh) this).field_c.a(pea.field_c, 1, -26);
        ((gh) this).field_c.a(1, false, pea.field_c);
        ((gh) this).field_c.g(3625, param3);
        var8.a(0.0f, (float)((gh) this).field_l, false, (float)((gh) this).field_k);
        var8.a(param0, param1, 0);
        var7.a(1.0f, ((gh) this).field_d.a((float)((gh) this).field_l, (byte) -33), false, ((gh) this).field_d.a(93, (float)((gh) this).field_k));
        ((gh) this).field_c.a(pfa.field_i, false);
        ((gh) this).field_c.F(-1662);
        ((gh) this).field_c.y(2);
        ((gh) this).field_c.p((byte) -58);
        ((gh) this).field_c.a(lja.field_j, 1, -89);
        ((gh) this).field_c.a(1, false, lja.field_j);
    }

    final static void a(kh param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!toa.field_j) {
              var2_int = param0.h(255);
              f.field_e = new BitSet(var2_int);
              param0.h((byte) -89);
              var3 = 0;
              L1: while (true) {
                if (var3 >= var2_int) {
                  L2: {
                    param0.i((byte) 98);
                    if (param1 < -41) {
                      break L2;
                    } else {
                      var5 = null;
                      gh.a((kh) null, (byte) 109);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  L3: {
                    if (uha.a(5907, param0)) {
                      f.field_e.set(var3);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("gh.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
    }

    final int d() {
        return ((gh) this).field_m + ((gh) this).field_g + ((gh) this).field_l;
    }

    final int b() {
        return ((gh) this).field_i + ((gh) this).field_j + ((gh) this).field_k;
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        int var1 = -2 % ((param0 - 70) / 50);
    }

    final int c() {
        return ((gh) this).field_k;
    }

    final void b(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          L1: {
            ((gh) this).field_i = param3;
            ((gh) this).field_g = param0;
            ((gh) this).field_j = param1;
            ((gh) this).field_m = param2;
            stackOut_0_0 = this;
            stackIn_5_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (0 != ((gh) this).field_g) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackIn_5_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-1 != ((gh) this).field_j) {
                break L1;
              } else {
                stackOut_2_0 = this;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (-1 != ((gh) this).field_m) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (((gh) this).field_i == 0) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L0;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = this;
          stackOut_5_1 = 1;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          break L0;
        }
        ((gh) this).field_b = stackIn_7_1 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        asa var10 = null;
        asa var11 = null;
        gf stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        gf stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        gf stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        gf stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        gf stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        gf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        hs stackIn_6_2 = null;
        gf stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        gf stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        gf stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        gf stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        hs stackOut_5_2 = null;
        gf stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        gf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        hs stackOut_4_2 = null;
        L0: {
          L1: {
            var11 = ((gh) this).field_c.y((byte) -77);
            var10 = ((gh) this).field_c.C(0);
            stackOut_0_0 = ((gh) this).field_d;
            stackOut_0_1 = 7672;
            stackIn_4_0 = stackOut_0_0;
            stackIn_4_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (((gh) this).field_a) {
              break L1;
            } else {
              stackOut_1_0 = (gf) (Object) stackIn_1_0;
              stackOut_1_1 = stackIn_1_1;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (((gh) this).field_h) {
                break L1;
              } else {
                stackOut_2_0 = (gf) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if ((param7 & 1) != 0) {
                  stackOut_5_0 = (gf) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = aw.field_G;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  break L0;
                } else {
                  stackOut_3_0 = (gf) (Object) stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = (gf) (Object) stackIn_4_0;
          stackOut_4_1 = stackIn_4_1;
          stackOut_4_2 = ue.field_v;
          stackIn_6_0 = stackOut_4_0;
          stackIn_6_1 = stackOut_4_1;
          stackIn_6_2 = stackOut_4_2;
          break L0;
        }
        L2: {
          ((gf) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2);
          ((gh) this).field_c.k((byte) 118);
          ((gh) this).field_c.a(true, (iva) (Object) ((gh) this).field_d);
          ((gh) this).field_c.c(param6, 1);
          ((gh) this).field_c.a((byte) 117, param4);
          ((gh) this).field_c.a(pea.field_c, 1, -74);
          ((gh) this).field_c.a(1, false, pea.field_c);
          ((gh) this).field_c.g(3625, param5);
          var10.a(1.0f, ((gh) this).field_d.a((float)((gh) this).field_l, (byte) -33), false, ((gh) this).field_d.a(81, (float)((gh) this).field_k));
          if (!((gh) this).field_b) {
            break L2;
          } else {
            param2 = ((gh) this).field_l * param2 / ((gh) this).d();
            param3 = param3 * ((gh) this).field_k / ((gh) this).b();
            param0 = param0 + param2 * ((gh) this).field_g / ((gh) this).field_l;
            param1 = param1 + param3 * ((gh) this).field_j / ((gh) this).field_k;
            break L2;
          }
        }
        var11.a(0.0f, (float)param2, false, (float)param3);
        var11.a(param0, param1, 0);
        ((gh) this).field_c.a(pfa.field_i, false);
        ((gh) this).field_c.F(-1662);
        ((gh) this).field_c.y(2);
        ((gh) this).field_c.p((byte) 84);
        ((gh) this).field_c.a(lja.field_j, 1, -64);
        ((gh) this).field_c.a(1, false, lja.field_j);
    }

    gh(eo param0, int param1, int param2, int[] param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((gh) this).field_g = 0;
        ((gh) this).field_j = 0;
        ((gh) this).field_b = false;
        ((gh) this).field_i = 0;
        ((gh) this).field_m = 0;
        try {
          L0: {
            L1: {
              ((gh) this).field_c = param0;
              ((gh) this).field_k = param2;
              ((gh) this).field_l = param1;
              ((gh) this).field_d = param0.a(param3, param4, false, param1, param5, param2, -82);
              ((gh) this).field_d.a((byte) -66, true, true);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((gh) this).field_d.b(-7070) == param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((gh) this).field_a = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param2 == ((gh) this).field_d.a((byte) -76)) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((gh) this).field_h = stackIn_7_1 != 0;
              if (((gh) this).field_a) {
                break L3;
              } else {
                boolean discarded$4 = ((gh) this).field_d.a(-14634);
                break L3;
              }
            }
            L4: {
              if (((gh) this).field_h) {
                break L4;
              } else {
                boolean discarded$5 = ((gh) this).field_d.a(-14634);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("gh.<init>(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You have not yet unlocked this option for use.";
        field_e = "Ace";
    }
}

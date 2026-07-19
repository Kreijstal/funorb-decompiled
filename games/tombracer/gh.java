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
            var27 = this.field_c.y((byte) -77);
            var12 = this.field_c.C(0);
            stackOut_0_0 = this.field_d;
            stackOut_0_1 = 7672;
            stackIn_4_0 = stackOut_0_0;
            stackIn_4_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (this.field_a) {
              break L1;
            } else {
              stackOut_1_0 = (gf) ((Object) stackIn_1_0);
              stackOut_1_1 = stackIn_1_1;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (this.field_h) {
                break L1;
              } else {
                stackOut_2_0 = (gf) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if ((1 & param9) == 0) {
                  break L1;
                } else {
                  stackOut_3_0 = (gf) ((Object) stackIn_3_0);
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
          stackOut_4_0 = (gf) ((Object) stackIn_4_0);
          stackOut_4_1 = stackIn_4_1;
          stackOut_4_2 = ue.field_v;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          stackIn_5_2 = stackOut_4_2;
          break L0;
        }
        L2: {
          ((gf) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2);
          this.field_c.k((byte) 121);
          this.field_c.a(true, this.field_d);
          this.field_c.c(param8, 1);
          this.field_c.a((byte) -97, param6);
          this.field_c.a(pea.field_c, 1, -82);
          this.field_c.a(1, false, pea.field_c);
          this.field_c.g(3625, param7);
          if (this.field_b) {
            var13 = (float)this.d();
            var14 = (float)this.b();
            var15 = (-param0 + param2) / var13;
            var16 = (param3 - param1) / var13;
            var17 = (-param0 + param4) / var14;
            var18 = (param5 - param1) / var14;
            var19 = var17 * (float)this.field_j;
            var20 = (float)this.field_j * var18;
            var21 = var15 * (float)this.field_g;
            var22 = (float)this.field_g * var16;
            var23 = (float)this.field_m * -var15;
            var24 = -var16 * (float)this.field_m;
            var25 = (float)this.field_i * -var17;
            param2 = var19 + (param2 + var23);
            param4 = var25 + (var21 + param4);
            var26 = (float)this.field_i * -var18;
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
        var12.a(1.0f, this.field_d.a((float)this.field_l, (byte) -33), false, this.field_d.a(62, (float)this.field_k));
        this.field_c.a(pfa.field_i, false);
        this.field_c.F(-1662);
        this.field_c.y(2);
        this.field_c.p((byte) -60);
        this.field_c.a(lja.field_j, 1, -22);
        this.field_c.a(1, false, lja.field_j);
    }

    final int a() {
        return this.field_l;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        asa var8 = this.field_c.y((byte) -77);
        asa var7 = this.field_c.C(0);
        param1 = param1 + this.field_j;
        param0 = param0 + this.field_g;
        this.field_d.a(7672, ue.field_v);
        this.field_c.k((byte) 105);
        this.field_c.a(true, this.field_d);
        this.field_c.c(param4, 1);
        this.field_c.a((byte) -19, param2);
        this.field_c.a(pea.field_c, 1, -26);
        this.field_c.a(1, false, pea.field_c);
        this.field_c.g(3625, param3);
        var8.a(0.0f, (float)this.field_l, false, (float)this.field_k);
        var8.a(param0, param1, 0);
        var7.a(1.0f, this.field_d.a((float)this.field_l, (byte) -33), false, this.field_d.a(93, (float)this.field_k));
        this.field_c.a(pfa.field_i, false);
        this.field_c.F(-1662);
        this.field_c.y(2);
        this.field_c.p((byte) -58);
        this.field_c.a(lja.field_j, 1, -89);
        this.field_c.a(1, false, lja.field_j);
    }

    final static void a(kh param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        kh var5 = null;
        boolean stackIn_6_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_10_0 = 0;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!toa.field_j) {
              var2_int = param0.h(255);
              f.field_e = new BitSet(var2_int);
              param0.h((byte) -89);
              var3 = 0;
              L1: while (true) {
                L2: {
                  if (var3 >= var2_int) {
                    param0.i((byte) 98);
                    stackOut_10_0 = param1;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_5_0 = uha.a(5907, param0);
                    stackIn_11_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L3: {
                        if (stackIn_6_0) {
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
                }
                if (stackIn_11_0 < -41) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = (kh) null;
                  gh.a((kh) null, (byte) 109);
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
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("gh.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int d() {
        return this.field_m + this.field_g + this.field_l;
    }

    final int b() {
        return this.field_i + this.field_j + this.field_k;
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        int var1 = -2 % ((param0 - 70) / 50);
    }

    final int c() {
        return this.field_k;
    }

    final void b(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        this.field_i = param3;
        this.field_g = param0;
        this.field_j = param1;
        this.field_m = param2;
        stackOut_0_0 = this;
        stackIn_2_0 = stackOut_0_0;
        stackIn_1_0 = stackOut_0_0;
        if (0 == this.field_g) {
          stackOut_2_0 = this;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (-1 == (this.field_j ^ -1)) {
            stackOut_4_0 = this;
            stackIn_8_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (-1 == (this.field_m ^ -1)) {
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (-1 != (this.field_i ^ -1)) {
                ((gh) (this)).field_b = true;
                return;
              } else {
                ((gh) (this)).field_b = false;
                return;
              }
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              ((gh) (this)).field_b = stackIn_7_1 != 0;
              return;
            }
          } else {
            ((gh) (this)).field_b = true;
            return;
          }
        } else {
          ((gh) (this)).field_b = true;
          return;
        }
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
            var11 = this.field_c.y((byte) -77);
            var10 = this.field_c.C(0);
            stackOut_0_0 = this.field_d;
            stackOut_0_1 = 7672;
            stackIn_4_0 = stackOut_0_0;
            stackIn_4_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (this.field_a) {
              break L1;
            } else {
              stackOut_1_0 = (gf) ((Object) stackIn_1_0);
              stackOut_1_1 = stackIn_1_1;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (this.field_h) {
                break L1;
              } else {
                stackOut_2_0 = (gf) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (-1 != (param7 & 1 ^ -1)) {
                  stackOut_5_0 = (gf) ((Object) stackIn_5_0);
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = aw.field_G;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  break L0;
                } else {
                  stackOut_3_0 = (gf) ((Object) stackIn_3_0);
                  stackOut_3_1 = stackIn_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = (gf) ((Object) stackIn_4_0);
          stackOut_4_1 = stackIn_4_1;
          stackOut_4_2 = ue.field_v;
          stackIn_6_0 = stackOut_4_0;
          stackIn_6_1 = stackOut_4_1;
          stackIn_6_2 = stackOut_4_2;
          break L0;
        }
        L2: {
          ((gf) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2);
          this.field_c.k((byte) 118);
          this.field_c.a(true, this.field_d);
          this.field_c.c(param6, 1);
          this.field_c.a((byte) 117, param4);
          this.field_c.a(pea.field_c, 1, -74);
          this.field_c.a(1, false, pea.field_c);
          this.field_c.g(3625, param5);
          var10.a(1.0f, this.field_d.a((float)this.field_l, (byte) -33), false, this.field_d.a(81, (float)this.field_k));
          if (!this.field_b) {
            break L2;
          } else {
            param2 = this.field_l * param2 / this.d();
            param3 = param3 * this.field_k / this.b();
            param0 = param0 + param2 * this.field_g / this.field_l;
            param1 = param1 + param3 * this.field_j / this.field_k;
            break L2;
          }
        }
        var11.a(0.0f, (float)param2, false, (float)param3);
        var11.a(param0, param1, 0);
        this.field_c.a(pfa.field_i, false);
        this.field_c.F(-1662);
        this.field_c.y(2);
        this.field_c.p((byte) 84);
        this.field_c.a(lja.field_j, 1, -64);
        this.field_c.a(1, false, lja.field_j);
    }

    gh(eo param0, int param1, int param2, int[] param3, int param4, int param5) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        this.field_g = 0;
        this.field_j = 0;
        this.field_b = false;
        this.field_i = 0;
        this.field_m = 0;
        try {
          L0: {
            L1: {
              this.field_c = param0;
              this.field_k = param2;
              this.field_l = param1;
              this.field_d = param0.a(param3, param4, false, param1, param5, param2, -82);
              this.field_d.a((byte) -66, true, true);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (this.field_d.b(-7070) == param1) {
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
              ((gh) (this)).field_a = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param2 == this.field_d.a((byte) -76)) {
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
              ((gh) (this)).field_h = stackIn_7_1 != 0;
              if (this.field_a) {
                break L3;
              } else {
                discarded$4 = this.field_d.a(-14634);
                break L3;
              }
            }
            if (!this.field_h) {
              discarded$5 = this.field_d.a(-14634);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var7);
            stackOut_13_1 = new StringBuilder().append("gh.<init>(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_f = "You have not yet unlocked this option for use.";
        field_e = "Ace";
    }
}

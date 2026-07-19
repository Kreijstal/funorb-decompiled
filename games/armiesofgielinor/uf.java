/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static je field_i;
    int field_c;
    static String field_g;
    int field_b;
    static int field_a;
    int field_k;
    static String field_l;
    static int field_e;
    static wk field_j;
    int field_d;
    static kl field_f;
    private String field_h;

    final static void a(ls[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ls var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            if (param1 == 1680474497) {
              var3 = 1;
              L1: while (true) {
                stackOut_4_0 = var3;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  if (stackIn_5_0 >= var2_int) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4 = param0[var3];
                    if (var6 == 0) {
                      var5 = var3 + -1;
                      L3: while (true) {
                        L4: {
                          if (-1 < (var5 ^ -1)) {
                            break L4;
                          } else {
                            stackOut_10_0 = nf.a(var4, param0[var5], 30549);
                            stackIn_5_0 = stackOut_10_0 ? 1 : 0;
                            stackIn_11_0 = stackOut_10_0;
                            if (var6 != 0) {
                              continue L2;
                            } else {
                              if (!stackIn_11_0) {
                                break L4;
                              } else {
                                param0[1 + var5] = param0[var5];
                                var5--;
                                continue L3;
                              }
                            }
                          }
                        }
                        param0[1 + var5] = var4;
                        var3++;
                        continue L1;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("uf.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = so.field_b.field_a;
        var5 = so.field_b.field_g;
        var6 = 30 + (rs.field_n.a(this.field_h, 200, 0) + 5);
        if (wg.a(-33, var4 / 2 - 100, -2 + var4 / 2, var5 / 2 + ((var6 >> -1234288511) - 30), (var6 >> 1291737441) + var5 / 2)) {
          return param2;
        } else {
          if (wg.a(-33, var4 / 2 + 2, var4 / 2 - -100, -30 + ((var6 >> -1581992159) + var5 / 2), var5 / 2 - -(var6 >> -926290399))) {
            return param0;
          } else {
            if (param1 < 41) {
              field_i = (je) null;
              return -1;
            } else {
              return -1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 <= 18) {
            return;
        }
        field_l = null;
        field_f = null;
        field_i = null;
        field_j = null;
    }

    final void b(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] stackIn_5_0 = null;
        int[] stackIn_8_0 = null;
        int[] stackOut_4_0 = null;
        int[] stackOut_3_0 = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_6_0 = null;
        var2 = so.field_b.field_a;
        var3 = so.field_b.field_g;
        if (param0 == 1619620993) {
          L0: {
            qn.b(0, 0, var2, var3, 0, 128);
            var4 = 5 + (rs.field_n.a(this.field_h, 200, 0) + 30);
            fe.b(212, -(var4 >> 452382465) + (-8 + var3 / 2), 216, 16 + var4, io.field_m, nd.field_b, 0, 128);
            discarded$1 = rs.field_n.a(this.field_h, var2 / 2 - 100, -(var4 >> -381734687) + var3 / 2, 200, var4, 16777215, 0, 1, 0, 0);
            if (!wg.a(param0 + -1619621026, var2 / 2 + -100, 318, -30 + var3 / 2 - -(var4 >> -843015263), (var4 >> 1345456481) + var3 / 2)) {
              stackOut_4_0 = nd.field_b;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = ci.field_e;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var10 = stackIn_5_0;
            var8 = var10;
            var6 = var8;
            var5 = var6;
            fe.a(-100 + var2 / 2, (var4 >> -1007423103) + (var3 / 2 - 30), 98, 30, il.field_s, var10, 0, 128, true);
            if (!wg.a(-33, 2 + var2 / 2, var2 / 2 + 100, var3 / 2 - (-(var4 >> 1680474497) - -30), var3 / 2 - -(var4 >> 426639201))) {
              stackOut_7_0 = nd.field_b;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = ci.field_e;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          var11 = stackIn_8_0;
          var9 = var11;
          var7 = var9;
          var5 = var7;
          fe.a(var2 / 2 + 2, -30 + (var3 / 2 - -(var4 >> 1619620993)), 98, 30, il.field_s, var11, 0, 128, true);
          fe.c(nt.field_p, 50 + (-100 + var2 / 2), 17 + (var4 >> 296021185) + var3 / 2 - 15, 0, true);
          fe.c(oa.field_G, -50 + var2 / 2 + 100, 2 + (var3 / 2 + (var4 >> 288365281)), 0, true);
          return;
        } else {
          return;
        }
    }

    uf(int param0, int param1, int param2, int param3, String param4, ic param5) {
        try {
            this.field_c = param3;
            this.field_k = param1;
            this.field_b = param2;
            this.field_h = param4;
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "uf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Open <%0> portal";
        field_l = "Reject";
        field_j = new wk(150, 150);
    }
}

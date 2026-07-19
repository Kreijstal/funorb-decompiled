/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fha {
    static String[] field_a;

    public static void a(byte param0) {
        field_a = null;
        int var1 = -23 % ((param0 - 77) / 44);
    }

    final static void a(boolean param0, cn param1, cn param2, cn param3) {
        hja discarded$1 = null;
        RuntimeException var4 = null;
        hja[] var5 = null;
        hja[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        hja[] var10 = null;
        iu var11 = null;
        int var11_int = 0;
        iu var12 = null;
        int var13 = 0;
        hja[] var14 = null;
        iu var15 = null;
        int[][] var16 = null;
        iu var17 = null;
        iu var18 = null;
        int[][] var19 = null;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            uca.field_f = uka.a(param2, "commonui", 5, "frame_top");
            if (param0) {
              fua.field_f = uka.a(param2, "commonui", 5, "frame_bottom");
              bg.field_s = nia.a(param2, "commonui", "jagex_logo_grey", -101);
              nga.field_n = uka.a(param2, "commonui", 5, "button");
              pq.field_b = hr.a("validation", param2, "commonui", -57);
              eka.field_o = (il) ((Object) oo.a(param2, param1, false, "commonui", "arezzo12"));
              mj.field_J = (il) ((Object) oo.a(param2, param1, false, "commonui", "arezzo14"));
              ft.field_c = (il) ((Object) oo.a(param2, param1, false, "commonui", "arezzo14bold"));
              var17 = new iu(param3.a("button.gif", (byte) 118, ""), (java.awt.Component) ((Object) nma.field_l));
              discarded$1 = uv.a("dropdown", param2, "commonui", 8864);
              var5 = tw.a((byte) 127, "screen_options", "commonui", param2);
              ita.field_e = new hja[4];
              rra.field_a = new hja[4];
              ie.field_f = new hja[4];
              var6 = new hja[][]{ie.field_f, rra.field_a, ita.field_e};
              var19 = new int[4][];
              var16 = var19;
              var7 = var16;
              var7[0] = var5[0].field_g;
              var8 = 1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var19.length <= var8) {
                      break L3;
                    } else {
                      var7[var8] = (int[]) ((Object) var19[0].clone());
                      var8++;
                      if (var13 != 0) {
                        break L2;
                      } else {
                        if (var13 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var8 = var5[0].field_h[0];
                  var19[2][var8] = 16777215;
                  var19[1][var8] = 2394342;
                  var19[3][var8] = 4767999;
                  break L2;
                }
                var9 = 0;
                L4: while (true) {
                  L5: {
                    if (var9 >= 3) {
                      var9 = var17.field_q;
                      gb.a(-29711);
                      var17.c();
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L5;
                    } else {
                      var14 = var6[var9];
                      var10 = var14;
                      stackOut_11_0 = 0;
                      stackIn_20_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var13 != 0) {
                        break L5;
                      } else {
                        var11_int = stackIn_12_0;
                        L6: while (true) {
                          L7: {
                            L8: {
                              if (var11_int >= var14.length) {
                                break L8;
                              } else {
                                var14[var11_int] = kua.a(21938, var19[var11_int], var5[var9]);
                                var11_int++;
                                if (var13 != 0) {
                                  break L7;
                                } else {
                                  if (var13 == 0) {
                                    continue L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            var9++;
                            break L7;
                          }
                          continue L4;
                        }
                      }
                    }
                  }
                  bea.a(stackIn_20_0, 0, bea.field_g, bea.field_a);
                  var15 = new iu(var9, var9);
                  var18 = var15;
                  var18.c();
                  var17.d(0, 0);
                  var11 = new iu(var9, var9);
                  var11.c();
                  var17.d(var9 + -var17.field_m, 0);
                  var12 = new iu(var17.field_m - var9 * 2, var9);
                  var12.c();
                  var17.d(-var9, 0);
                  pfa.a(1);
                  nga.field_n = new iu[]{var15, var12, var11};
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("fha.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}

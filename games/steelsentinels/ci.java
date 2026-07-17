/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String field_d;
    static int field_g;
    static bf field_a;
    static int[] field_c;
    static String field_h;
    static ul field_e;
    static String field_f;
    static String[] field_b;

    final static String a(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String stackIn_6_0 = null;
        String stackIn_16_0 = null;
        String stackOut_5_0 = null;
        String stackOut_15_0 = null;
        var5 = SteelSentinels.field_G;
        var6 = "(" + di.field_d + " " + ma.field_W + " " + aj.field_u + ") " + ch.field_N;
        if (param0 == 94) {
          if (jg.field_f <= 0) {
            return var6;
          } else {
            var1 = var6 + ":";
            var2 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 >= jg.field_f) {
                    break L2;
                  } else {
                    stackOut_5_0 = var1 + 32;
                    stackIn_16_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          var7 = stackIn_6_0;
                          var3 = rf.field_d.field_t[var2] & 255;
                          var4 = var3 >> 4;
                          var3 = var3 & 15;
                          if (10 > var4) {
                            break L4;
                          } else {
                            var4 += 55;
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var4 += 48;
                        break L3;
                      }
                      L5: {
                        L6: {
                          var8 = var7 + (char)var4;
                          if (var3 >= 10) {
                            break L6;
                          } else {
                            var3 += 48;
                            if (var5 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var3 += 55;
                        break L5;
                      }
                      var1 = var8 + (char)var3;
                      var2++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_15_0 = (String) var1;
                stackIn_16_0 = stackOut_15_0;
                break L1;
              }
              return stackIn_16_0;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        String discarded$0 = ci.a((byte) -76);
        field_f = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_h = null;
        field_a = null;
        field_b = null;
    }

    final static void a(cm param0, byte param1, cm param2, cm param3) {
        RuntimeException var4 = null;
        gk[] var5 = null;
        gk[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        gk[] var10 = null;
        wk var11 = null;
        int var11_int = 0;
        wk var12 = null;
        int var13 = 0;
        gk[] var14 = null;
        wk var15 = null;
        int[][] var16 = null;
        wk var17 = null;
        wk var18 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
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
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              jj.field_k = cf.a("frame_top", "commonui", (byte) -95, param0);
              jb.field_J = cf.a("frame_bottom", "commonui", (byte) -94, param0);
              jb.field_L = rl.a(param0, "commonui", "jagex_logo_grey", false);
              un.field_m = cf.a("button", "commonui", (byte) -54, param0);
              t.field_i = ec.a((byte) -62, "validation", param0, "commonui");
              rc.field_m = (mi) (Object) be.a(param0, param2, (byte) -48, "arezzo12", "commonui");
              tj.field_e = (mi) (Object) be.a(param0, param2, (byte) -62, "arezzo14", "commonui");
              gf.field_d = (mi) (Object) be.a(param0, param2, (byte) -57, "arezzo14bold", "commonui");
              var17 = new wk(param3.a("", -742, "button.gif"), (java.awt.Component) (Object) sl.field_n);
              if (param1 >= 63) {
                break L1;
              } else {
                ci.a(true);
                break L1;
              }
            }
            gk discarded$1 = gl.a(param0, (byte) 85, "commonui", "dropdown");
            var5 = cj.a(45, "commonui", param0, "screen_options");
            lh.field_q = new gk[4];
            ce.field_q = new gk[4];
            vm.field_r = new gk[4];
            var6 = new gk[][]{lh.field_q, ce.field_q, vm.field_r};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_o;
            var8 = 1;
            L2: while (true) {
              L3: {
                L4: {
                  if (var19.length <= var8) {
                    break L4;
                  } else {
                    var7[var8] = (int[]) var19[0].clone();
                    var8++;
                    if (var13 != 0) {
                      break L3;
                    } else {
                      if (var13 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var8 = var5[0].field_p[0];
                var19[2][var8] = 16777215;
                var19[1][var8] = 2394342;
                var19[3][var8] = 4767999;
                break L3;
              }
              var9 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var9 >= 3) {
                      break L7;
                    } else {
                      var14 = var6[var9];
                      var10 = var14;
                      stackOut_11_0 = 0;
                      stackIn_20_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var13 != 0) {
                        break L6;
                      } else {
                        var11_int = stackIn_12_0;
                        L8: while (true) {
                          L9: {
                            L10: {
                              if (var14.length <= var11_int) {
                                break L10;
                              } else {
                                var14[var11_int] = uh.a(var5[var9], var19[var11_int], false);
                                var11_int++;
                                if (var13 != 0) {
                                  break L9;
                                } else {
                                  if (var13 == 0) {
                                    continue L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            var9++;
                            break L9;
                          }
                          if (var13 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  var9 = var17.field_F;
                  jl.a(false);
                  var17.d();
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L6;
                }
                pb.b(stackIn_20_0, 0, pb.field_c, pb.field_j);
                var15 = new wk(var9, var9);
                var18 = var15;
                var18.d();
                var17.f(0, 0);
                var11 = new wk(var9, var9);
                var11.d();
                var17.f(var9 + -var17.field_A, 0);
                var12 = new wk(var17.field_A - var9 * 2, var9);
                var12.d();
                var17.f(-var9, 0);
                tk.f((byte) 122);
                un.field_m = new wk[]{var15, var12, var11};
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("ci.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L11;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L11;
            }
          }
          L12: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param1).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L12;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L12;
            }
          }
          L13: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L13;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L13;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    final static String a(cm param0, byte param1, String param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
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
        String stackOut_5_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
        try {
          L0: {
            if (param0.a(true)) {
              L1: {
                if (param1 >= 86) {
                  break L1;
                } else {
                  field_g = -116;
                  break L1;
                }
              }
              stackOut_5_0 = param3 + " - " + param0.a((byte) 94, param2) + "%";
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = (String) param4;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ci.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_6_0;
    }

    final static od a(Throwable param0, String param1) {
        od var2 = null;
        if (param0 instanceof od) {
            var2 = (od) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        } else {
            var2 = new od(param0, param1);
        }
        return var2;
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        L0: {
          if (null != ll.field_i) {
            jg.a(ll.field_i, 1);
            break L0;
          } else {
            break L0;
          }
        }
        if (null == an.field_i) {
          bh.a((byte) -115, param0);
          var2 = 40 % ((param1 - 49) / 45);
          if (n.field_x != null) {
            n.field_x.a(param0, (byte) 127);
            tf.a(0, param0);
            return;
          } else {
            tf.a(0, param0);
            return;
          }
        } else {
          an.field_i.b(param0, (byte) -114);
          bh.a((byte) -115, param0);
          var2 = 40 % ((param1 - 49) / 45);
          if (n.field_x == null) {
            tf.a(0, param0);
            return;
          } else {
            n.field_x.a(param0, (byte) 127);
            tf.a(0, param0);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Show chat";
        field_h = "Players: <%0>/<%1>";
        field_c = new int[8192];
        field_f = "Enemy wave - ";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}

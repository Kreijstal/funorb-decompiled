/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static String field_g;
    static boolean field_d;
    static String field_b;
    static String field_e;
    private String field_h;
    static char field_c;
    static String field_a;
    static int field_f;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        java.applet.Applet var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 8) {
                break L1;
              } else {
                var4 = (java.applet.Applet) null;
                this.a(-91, (java.applet.Applet) null);
                break L1;
              }
            }
            stackIn_3_0 = this.field_h.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("de.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != 7) {
            return;
        }
        field_g = null;
        field_a = null;
    }

    final static void a(int param0, int param1, wk[] param2, int param3, int param4, byte param5, int param6) {
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = SteelSentinels.field_G;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (-1 <= (param3 ^ -1)) {
                  break L1;
                } else {
                  if (0 >= param6) {
                    break L1;
                  } else {
                    if (param4 == 0) {
                      break L1;
                    } else {
                      L2: {
                        if (param2[3] == null) {
                          stackIn_11_0 = 0;
                          break L2;
                        } else {
                          stackIn_11_0 = param2[3].field_z;
                          break L2;
                        }
                      }
                      L3: {
                        var7_int = stackIn_11_0;
                        if (param2[5] != null) {
                          stackIn_14_0 = param2[5].field_z;
                          break L3;
                        } else {
                          stackIn_14_0 = 0;
                          break L3;
                        }
                      }
                      L4: {
                        var8 = stackIn_14_0;
                        if (null != param2[1]) {
                          stackIn_17_0 = param2[1].field_B;
                          break L4;
                        } else {
                          stackIn_17_0 = 0;
                          break L4;
                        }
                      }
                      L5: {
                        var9 = stackIn_17_0;
                        if (null == param2[7]) {
                          stackIn_20_0 = 0;
                          break L5;
                        } else {
                          stackIn_20_0 = param2[7].field_B;
                          break L5;
                        }
                      }
                      L6: {
                        var10 = stackIn_20_0;
                        var11 = param3 + param0;
                        var12 = param1 + param6;
                        var13 = var7_int + param0;
                        var14 = var11 - var8;
                        var15 = var9 + param1;
                        var16 = -var10 + var12;
                        var17 = var13;
                        var18 = var14;
                        if (var18 >= var17) {
                          break L6;
                        } else {
                          var18 = param0 - -(var7_int * param3 / (var8 + var7_int));
                          var17 = param0 - -(var7_int * param3 / (var8 + var7_int));
                          break L6;
                        }
                      }
                      L7: {
                        var19 = var15;
                        if (param5 == -31) {
                          break L7;
                        } else {
                          de.a(true, 28);
                          break L7;
                        }
                      }
                      L8: {
                        var20 = var16;
                        if (var20 < var19) {
                          var20 = var9 * param6 / (var9 - -var10) + param1;
                          var19 = var9 * param6 / (var9 - -var10) + param1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        pb.b(me.field_g);
                        if (null != param2[0]) {
                          pb.h(param0, param1, var17, var19);
                          param2[0].b(param0, param1, param4);
                          pb.a(me.field_g);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (null == param2[2]) {
                          break L10;
                        } else {
                          pb.h(var18, param1, var11, var19);
                          param2[2].b(var14, param1, param4);
                          pb.a(me.field_g);
                          break L10;
                        }
                      }
                      L11: {
                        if (null != param2[6]) {
                          pb.h(param0, var20, var17, var12);
                          param2[6].b(param0, var16, param4);
                          pb.a(me.field_g);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (param2[8] != null) {
                          pb.h(var18, var20, var11, var12);
                          param2[8].b(var14, var16, param4);
                          pb.a(me.field_g);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (null == param2[1]) {
                          break L13;
                        } else {
                          if (param2[1].field_z != 0) {
                            pb.h(var17, param1, var18, var19);
                            var21 = var13;
                            L14: while (true) {
                              if (var14 <= var21) {
                                pb.a(me.field_g);
                                break L13;
                              } else {
                                param2[1].b(var21, param1, param4);
                                var21 = var21 + param2[1].field_z;
                                continue L14;
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                      L15: {
                        if (null == param2[7]) {
                          break L15;
                        } else {
                          if (-1 != (param2[7].field_z ^ -1)) {
                            pb.h(var17, var20, var18, var12);
                            var21 = var13;
                            L16: while (true) {
                              if (var14 <= var21) {
                                pb.a(me.field_g);
                                break L15;
                              } else {
                                param2[7].b(var21, var16, param4);
                                var21 = var21 + param2[7].field_z;
                                continue L16;
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                      L17: {
                        if (param2[3] == null) {
                          break L17;
                        } else {
                          if (param2[3].field_B == 0) {
                            break L17;
                          } else {
                            pb.h(param0, var19, var17, var20);
                            var21 = var15;
                            L18: while (true) {
                              if (var21 >= var16) {
                                pb.a(me.field_g);
                                break L17;
                              } else {
                                param2[3].b(param0, var21, param4);
                                var21 = var21 + param2[3].field_B;
                                continue L18;
                              }
                            }
                          }
                        }
                      }
                      L19: {
                        if (null == param2[5]) {
                          break L19;
                        } else {
                          if (0 == param2[5].field_B) {
                            break L19;
                          } else {
                            pb.h(var18, var19, var11, var20);
                            var21 = var15;
                            L20: while (true) {
                              if (var21 >= var16) {
                                pb.a(me.field_g);
                                break L19;
                              } else {
                                param2[5].b(var14, var21, param4);
                                var21 = var21 + param2[5].field_B;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                      L21: {
                        if (param2[4] == null) {
                          break L21;
                        } else {
                          if (-1 == (param2[4].field_z ^ -1)) {
                            break L21;
                          } else {
                            if (param2[4].field_B == 0) {
                              break L21;
                            } else {
                              pb.h(var17, var19, var18, var20);
                              var21 = var15;
                              L22: while (true) {
                                if (var16 <= var21) {
                                  pb.a(me.field_g);
                                  break L21;
                                } else {
                                  var22 = var13;
                                  L23: while (true) {
                                    if (var14 <= var22) {
                                      var21 = var21 + param2[4].field_B;
                                      continue L22;
                                    } else {
                                      param2[4].b(var22, var21, param4);
                                      var22 = var22 + param2[4].field_z;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var7 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var7);

            stackIn_77_1 = new StringBuilder().append("de.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L24;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L24;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    de(String param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "de.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        if (param0 > -22) {
            return;
        }
        try {
            mm.a("jagex-last-login-method", (byte) 122, this.field_h, param1, 31536000L);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "de.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        nd.a(param0, 230827172);
        if (param1 > -121) {
            field_b = (String) null;
        }
    }

    final static boolean a(int param0, byte param1) {
        if (param1 >= -70) {
            return false;
        }
        return param0 == (param0 & -param0) ? true : false;
    }

    static {
        field_g = "SOLARITE EARNED: <img=24><col=<%1>><%0></col>";
        field_e = "<%0>.<%1> m";
        field_b = "Co-op Game";
        field_a = "You are invited to <%0>'s game.";
        field_f = 2;
    }
}

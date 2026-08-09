/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo extends java.awt.Canvas {
    static boolean field_c;
    static hr[] field_b;
    private java.awt.Component field_a;

    public static void a(int param0) {
        try {
            field_b = null;
            if (param0 <= 89) {
                field_b = (hr[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wo.A(" + param0 + ')');
        }
    }

    final static int a(String[] args, vn param1, int param2, boolean param3, String param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_46_1 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param1.a(param4);
              if ((var5_int ^ -1) < (param2 ^ -1)) {
                break L1;
              } else {
                if (-1 == param4.indexOf("<br>")) {
                  args[0] = param4;
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (-1 + param2 + var5_int) / param2;
            param2 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            if (!param3) {
              var8 = param4.length();
              var9 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var8 <= var9) {
                      break L4;
                    } else {
                      var10 = param4.charAt(var9);
                      stackIn_34_0 = var10;

                      stackIn_34_1 = 32;

                      if (var13 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_34_0 == stackIn_34_1) {
                              break L6;
                            } else {
                              if (var10 != 45) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var11 = param4.substring(var7, 1 + var9).trim();
                          var12 = param1.a(var11);
                          if ((var12 ^ -1) <= (param2 ^ -1)) {
                            var7 = var9 + 1;
                            incrementValue$0 = var6;
                            var6++;
                            args[incrementValue$0] = var11;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L7: {
                          if ((var10 ^ -1) != -63) {
                            break L7;
                          } else {
                            if (param4.regionMatches(var9 - 3, "<br>", 0, 4)) {
                              incrementValue$1 = var6;
                              var6++;
                              args[incrementValue$1] = param4.substring(var7, var9 + -3).trim();
                              var7 = 1 + var9;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var9++;
                        if (var13 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackIn_34_0 = var8 ^ -1;
                  stackIn_34_1 = var7 ^ -1;
                  break L3;
                }
                L8: {
                  if (stackIn_34_0 < stackIn_34_1) {
                    incrementValue$2 = var6;
                    var6++;
                    args[incrementValue$2] = param4.substring(var7, var8).trim();
                    break L8;
                  } else {
                    break L8;
                  }
                }
                stackIn_38_0 = var6;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_11_0 = -80;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var5);

            stackIn_42_1 = new StringBuilder().append("wo.B(");

            if (args == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L9;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L10;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L11;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L11;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_43_0), stackIn_51_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_38_0;
          }
        }
    }

    public final void paint(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_a.paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wo.paint(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_a.update(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wo.update(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(hr[] param0, int param1, int param2, int param3, int param4, ha param5, int param6, int param7, int param8, boolean param9) {
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_132_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        pm var10 = null;
        RuntimeException var10_ref = null;
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
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10 = wq.a(param5, (byte) 15);
                        if (param0 != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (0 >= param6) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0 >= param1) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        if (null != param0[3]) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = param0[3].b();
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var11 = stackIn_14_0;
                        if (param0[5] != null) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = param0[5].b();
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = stackIn_18_0;
                        if (null == param0[1]) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_22_0 = param0[1].d();
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13 = stackIn_22_0;
                        if (null == param0[7]) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_26_0 = param0[7].d();
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var14 = stackIn_26_0;
                        var15 = param6 + param2;
                        var16 = param7 - -param1;
                        var17 = var11 + param2;
                        var18 = var15 + -var12;
                        var19 = var13 + param7;
                        var20 = -var14 + var16;
                        var21 = var17;
                        if (param9) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        wo.a((hr[]) null, 78, -40, 98, -104, (ha) null, -45, 54, 115, true);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var22 = var18;
                        if (var21 <= var22) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var22 = param6 * var11 / (var11 - -var12) + param2;
                        var21 = param6 * var11 / (var11 - -var12) + param2;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var23 = var19;
                        var24 = var20;
                        if ((var24 ^ -1) > (var23 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var24 = param1 * var13 / (var13 - -var14) + param7;
                        var23 = param1 * var13 / (var13 - -var14) + param7;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null != param0[0]) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10.a((byte) 81, param7, var23, param2, var21);
                        param0[0].a(param2, param7, param4, param3, param8);
                        var10.a(29709);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (param0[2] != null) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var10.a((byte) -98, param7, var23, var22, var15);
                        param0[2].a(var18, param7, param4, param3, param8);
                        var10.a(29709);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null != param0[6]) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var10.a((byte) 43, var24, var16, param2, var21);
                        param0[6].a(param2, var20, param4, param3, param8);
                        var10.a(29709);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (param0[8] == null) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var10.a((byte) 37, var24, var16, var22, var15);
                        param0[8].a(var18, var20, param4, param3, param8);
                        var10.a(29709);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (param0[1] == null) {
                            statePc = 63;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (-1 != (param0[1].b() ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var10.a((byte) 51, param7, var23, var21, var22);
                        var25 = var17;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((var25 ^ -1) <= (var18 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        param0[1].a(var25, param7, param4, param3, param8);
                        var25 = var25 + param0[1].b();
                        if (var27 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var27 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var10.a(29709);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (null == param0[7]) {
                            statePc = 76;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((param0[7].b() ^ -1) != -1) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var10.a((byte) 109, var24, var16, var21, var22);
                        var25 = var17;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((var18 ^ -1) >= (var25 ^ -1)) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        param0[7].a(var25, var20, param4, param3, param8);
                        var25 = var25 + param0[7].b();
                        if (var27 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var27 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var10.a(29709);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (null == param0[3]) {
                            statePc = 89;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (-1 != (param0[3].d() ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var10.a((byte) -93, var23, var24, param2, var21);
                        var25 = var19;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if ((var20 ^ -1) >= (var25 ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        param0[3].a(param2, var25, param4, param3, param8);
                        var25 = var25 + param0[3].d();
                        if (var27 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var27 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var10.a(29709);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (param0[5] == null) {
                            statePc = 102;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if ((param0[5].d() ^ -1) != -1) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var10.a((byte) -128, var23, var24, var22, var15);
                        var25 = var19;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if ((var25 ^ -1) <= (var20 ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        param0[5].a(var18, var25, param4, param3, param8);
                        var25 = var25 + param0[5].d();
                        if (var27 != 0) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var27 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var10.a(29709);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (param0[4] == null) {
                            statePc = 133;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (-1 == (param0[4].b() ^ -1)) {
                            statePc = 133;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (0 != param0[4].d()) {
                            statePc = 111;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var10.a((byte) 97, var23, var24, var21, var22);
                        var25 = var19;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var20 <= var25) {
                            statePc = 122;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var27 != 0) {
                            statePc = 133;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var26 = var17;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (var18 <= var26) {
                            statePc = 120;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        param0[4].a(var26, var25, param4, param3, param8);
                        var26 = var26 + param0[4].b();
                        if (var27 != 0) {
                            statePc = 121;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var27 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var25 = var25 + param0[4].d();
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (var27 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var10.a(29709);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 124: {
                    var10_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_127_0 = (RuntimeException) (var10_ref);
                    stackIn_125_0 = stackIn_127_0;
                    stackIn_127_1 = new StringBuilder().append("wo.C(");
                    stackIn_125_1 = stackIn_127_1;
                    if (param0 == null) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackIn_128_0 = (RuntimeException) ((Object) stackIn_125_0);
                    stackIn_128_1 = (StringBuilder) ((Object) stackIn_125_1);
                    stackIn_128_2 = "{...}";
                    statePc = 128;
                    continue stateLoop;
                }
                case 127: {
                    stackIn_128_0 = (RuntimeException) ((Object) stackIn_127_0);
                    stackIn_128_1 = (StringBuilder) ((Object) stackIn_127_1);
                    stackIn_128_2 = "null";
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    stackIn_131_0 = (RuntimeException) ((Object) stackIn_128_0);
                    stackIn_129_0 = stackIn_131_0;
                    stackIn_131_1 = ((StringBuilder) (Object) stackIn_128_1).append(stackIn_128_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                    stackIn_129_1 = stackIn_131_1;
                    if (param5 == null) {
                        statePc = 131;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_132_0 = (RuntimeException) ((Object) stackIn_129_0);
                    stackIn_132_1 = (StringBuilder) ((Object) stackIn_129_1);
                    stackIn_132_2 = "{...}";
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = (RuntimeException) ((Object) stackIn_131_0);
                    stackIn_132_1 = (StringBuilder) ((Object) stackIn_131_1);
                    stackIn_132_2 = "null";
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    throw qo.a((Throwable) ((Object) stackIn_132_0), stackIn_132_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
                }
                case 133: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    wo(java.awt.Component param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("wo.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
    }
}

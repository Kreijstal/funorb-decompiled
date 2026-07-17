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
                field_b = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "wo.A(" + param0 + 41);
        }
    }

    final static int a(String[] args, vn param1, int param2, boolean param3, String param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param1.a(param4);
              if (~var5_int < ~param2) {
                break L1;
              } else {
                if (-1 == param4.indexOf("<br>")) {
                  args[0] = param4;
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
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
                      stackOut_14_0 = var10;
                      stackOut_14_1 = 32;
                      stackIn_34_0 = stackOut_14_0;
                      stackIn_34_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (var13 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_15_0 == stackIn_15_1) {
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
                          if (~var12 <= ~param2) {
                            var7 = var9 + 1;
                            int incrementValue$3 = var6;
                            var6++;
                            args[incrementValue$3] = var11;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L7: {
                          if (var10 != 62) {
                            break L7;
                          } else {
                            if (param4.regionMatches(var9 - 3, "<br>", 0, 4)) {
                              int incrementValue$4 = var6;
                              var6++;
                              args[incrementValue$4] = param4.substring(var7, var9 + -3).trim();
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
                  stackOut_33_0 = ~var8;
                  stackOut_33_1 = ~var7;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  break L3;
                }
                L8: {
                  if (stackIn_34_0 < stackIn_34_1) {
                    int incrementValue$5 = var6;
                    var6++;
                    args[incrementValue$5] = param4.substring(var7, var8).trim();
                    break L8;
                  } else {
                    break L8;
                  }
                }
                stackOut_37_0 = var6;
                stackIn_38_0 = stackOut_37_0;
                break L0;
              }
            } else {
              stackOut_10_0 = -80;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var5;
            stackOut_39_1 = new StringBuilder().append("wo.B(");
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (args == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L9;
            }
          }
          L10: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(44);
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L10;
            }
          }
          L11: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param4 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 41);
        }
        return stackIn_38_0;
    }

    public final void paint(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((wo) this).field_a.paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("wo.paint(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((wo) this).field_a.update(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("wo.update(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(hr[] param0, int param1, int param2, int param3, int param4, ha param5, int param6, int param7, int param8, boolean param9) {
        RuntimeException var10 = null;
        pm var10_ref = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        var27 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var10_ref = wq.a(param5, (byte) 15);
            if (param0 != null) {
              L1: {
                if (0 >= param6) {
                  break L1;
                } else {
                  if (0 >= param1) {
                    break L1;
                  } else {
                    L2: {
                      if (null != param0[3]) {
                        stackOut_13_0 = param0[3].b();
                        stackIn_14_0 = stackOut_13_0;
                        break L2;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_14_0 = stackOut_11_0;
                        break L2;
                      }
                    }
                    L3: {
                      var11 = stackIn_14_0;
                      if (param0[5] != null) {
                        stackOut_17_0 = param0[5].b();
                        stackIn_18_0 = stackOut_17_0;
                        break L3;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_18_0 = stackOut_15_0;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_18_0;
                      if (null == param0[1]) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        break L4;
                      } else {
                        stackOut_19_0 = param0[1].d();
                        stackIn_22_0 = stackOut_19_0;
                        break L4;
                      }
                    }
                    L5: {
                      var13 = stackIn_22_0;
                      if (null == param0[7]) {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        break L5;
                      } else {
                        stackOut_23_0 = param0[7].d();
                        stackIn_26_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    L6: {
                      var14 = stackIn_26_0;
                      var15 = param6 + param2;
                      var16 = param7 - -param1;
                      var17 = var11 + param2;
                      var18 = var15 + -var12;
                      var19 = var13 + param7;
                      var20 = -var14 + var16;
                      var21 = var17;
                      if (param9) {
                        break L6;
                      } else {
                        wo.a((hr[]) null, 78, -40, 98, -104, (ha) null, -45, 54, 115, true);
                        break L6;
                      }
                    }
                    L7: {
                      var22 = var18;
                      if (var21 <= var22) {
                        break L7;
                      } else {
                        var22 = param6 * var11 / (var11 - -var12) + param2;
                        var21 = param6 * var11 / (var11 - -var12) + param2;
                        break L7;
                      }
                    }
                    L8: {
                      var23 = var19;
                      var24 = var20;
                      if (~var24 > ~var23) {
                        var24 = param1 * var13 / (var13 - -var14) + param7;
                        var23 = param1 * var13 / (var13 - -var14) + param7;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (null != param0[0]) {
                        var10_ref.a((byte) 81, param7, var23, param2, var21);
                        param0[0].a(param2, param7, param4, param3, param8);
                        var10_ref.a(29709);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[2] != null) {
                        var10_ref.a((byte) -98, param7, var23, var22, var15);
                        param0[2].a(var18, param7, param4, param3, param8);
                        var10_ref.a(29709);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (null != param0[6]) {
                        var10_ref.a((byte) 43, var24, var16, param2, var21);
                        param0[6].a(param2, var20, param4, param3, param8);
                        var10_ref.a(29709);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param0[8] == null) {
                        break L12;
                      } else {
                        var10_ref.a((byte) 37, var24, var16, var22, var15);
                        param0[8].a(var18, var20, param4, param3, param8);
                        var10_ref.a(29709);
                        break L12;
                      }
                    }
                    L13: {
                      if (param0[1] == null) {
                        break L13;
                      } else {
                        if (param0[1].b() != 0) {
                          var10_ref.a((byte) 51, param7, var23, var21, var22);
                          var25 = var17;
                          L14: while (true) {
                            L15: {
                              if (~var25 <= ~var18) {
                                break L15;
                              } else {
                                param0[1].a(var25, param7, param4, param3, param8);
                                var25 = var25 + param0[1].b();
                                if (var27 != 0) {
                                  break L13;
                                } else {
                                  if (var27 == 0) {
                                    continue L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            var10_ref.a(29709);
                            break L13;
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L16: {
                      if (null == param0[7]) {
                        break L16;
                      } else {
                        if (param0[7].b() != 0) {
                          var10_ref.a((byte) 109, var24, var16, var21, var22);
                          var25 = var17;
                          L17: while (true) {
                            L18: {
                              if (~var18 >= ~var25) {
                                break L18;
                              } else {
                                param0[7].a(var25, var20, param4, param3, param8);
                                var25 = var25 + param0[7].b();
                                if (var27 != 0) {
                                  break L16;
                                } else {
                                  if (var27 == 0) {
                                    continue L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            var10_ref.a(29709);
                            break L16;
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L19: {
                      if (null == param0[3]) {
                        break L19;
                      } else {
                        if (param0[3].d() != 0) {
                          var10_ref.a((byte) -93, var23, var24, param2, var21);
                          var25 = var19;
                          L20: while (true) {
                            L21: {
                              if (~var20 >= ~var25) {
                                break L21;
                              } else {
                                param0[3].a(param2, var25, param4, param3, param8);
                                var25 = var25 + param0[3].d();
                                if (var27 != 0) {
                                  break L19;
                                } else {
                                  if (var27 == 0) {
                                    continue L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            var10_ref.a(29709);
                            break L19;
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    L22: {
                      if (param0[5] == null) {
                        break L22;
                      } else {
                        if (param0[5].d() != 0) {
                          var10_ref.a((byte) -128, var23, var24, var22, var15);
                          var25 = var19;
                          L23: while (true) {
                            L24: {
                              if (~var25 <= ~var20) {
                                break L24;
                              } else {
                                param0[5].a(var18, var25, param4, param3, param8);
                                var25 = var25 + param0[5].d();
                                if (var27 != 0) {
                                  break L22;
                                } else {
                                  if (var27 == 0) {
                                    continue L23;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            var10_ref.a(29709);
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                    }
                    L25: {
                      if (param0[4] == null) {
                        break L25;
                      } else {
                        if (param0[4].b() == 0) {
                          break L25;
                        } else {
                          if (0 != param0[4].d()) {
                            var10_ref.a((byte) 97, var23, var24, var21, var22);
                            var25 = var19;
                            L26: while (true) {
                              L27: {
                                if (var20 <= var25) {
                                  break L27;
                                } else {
                                  if (var27 != 0) {
                                    break L25;
                                  } else {
                                    var26 = var17;
                                    L28: while (true) {
                                      L29: {
                                        L30: {
                                          if (var18 <= var26) {
                                            break L30;
                                          } else {
                                            param0[4].a(var26, var25, param4, param3, param8);
                                            var26 = var26 + param0[4].b();
                                            if (var27 != 0) {
                                              break L29;
                                            } else {
                                              if (var27 == 0) {
                                                continue L28;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                        }
                                        var25 = var25 + param0[4].d();
                                        break L29;
                                      }
                                      if (var27 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                }
                              }
                              var10_ref.a(29709);
                              break L25;
                            }
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    break L0;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var10 = decompiledCaughtException;
            stackOut_124_0 = (RuntimeException) var10;
            stackOut_124_1 = new StringBuilder().append("wo.C(");
            stackIn_127_0 = stackOut_124_0;
            stackIn_127_1 = stackOut_124_1;
            stackIn_125_0 = stackOut_124_0;
            stackIn_125_1 = stackOut_124_1;
            if (param0 == null) {
              stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
              stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
              stackOut_127_2 = "null";
              stackIn_128_0 = stackOut_127_0;
              stackIn_128_1 = stackOut_127_1;
              stackIn_128_2 = stackOut_127_2;
              break L31;
            } else {
              stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
              stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
              stackOut_125_2 = "{...}";
              stackIn_128_0 = stackOut_125_0;
              stackIn_128_1 = stackOut_125_1;
              stackIn_128_2 = stackOut_125_2;
              break L31;
            }
          }
          L32: {
            stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
            stackOut_128_1 = ((StringBuilder) (Object) stackIn_128_1).append(stackIn_128_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_131_0 = stackOut_128_0;
            stackIn_131_1 = stackOut_128_1;
            stackIn_129_0 = stackOut_128_0;
            stackIn_129_1 = stackOut_128_1;
            if (param5 == null) {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "null";
              stackIn_132_0 = stackOut_131_0;
              stackIn_132_1 = stackOut_131_1;
              stackIn_132_2 = stackOut_131_2;
              break L32;
            } else {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "{...}";
              stackIn_132_0 = stackOut_129_0;
              stackIn_132_1 = stackOut_129_1;
              stackIn_132_2 = stackOut_129_2;
              break L32;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_132_0, stackIn_132_2 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    wo(java.awt.Component param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((wo) this).field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wo.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
    }
}

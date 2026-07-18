/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends hf {
    int field_h;
    long field_f;
    byte[] field_g;

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            var1 = uh.field_x;
            var2 = 0;
            var3 = var1.length;
            if (param0 == -35) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2 >= var3) {
                      break L3;
                    } else {
                      int incrementValue$16 = var2;
                      var2++;
                      var1[incrementValue$16] = 0;
                      int incrementValue$17 = var2;
                      var2++;
                      var1[incrementValue$17] = 0;
                      int incrementValue$18 = var2;
                      var2++;
                      var1[incrementValue$18] = 0;
                      int incrementValue$19 = var2;
                      var2++;
                      var1[incrementValue$19] = 0;
                      int incrementValue$20 = var2;
                      var2++;
                      var1[incrementValue$20] = 0;
                      int incrementValue$21 = var2;
                      var2++;
                      var1[incrementValue$21] = 0;
                      int incrementValue$22 = var2;
                      var2++;
                      var1[incrementValue$22] = 0;
                      int incrementValue$23 = var2;
                      var2++;
                      var1[incrementValue$23] = 0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "ma.E(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0, float param1, ja param2) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                int discarded$2 = ma.b(-91);
                break L1;
              }
            }
            stackOut_3_0 = aa.a(wd.field_b, 0, 0, vf.field_L, -wd.field_a + ng.field_G + -(vf.field_L.field_s >> 1323895489), -wd.field_d + -(vf.field_L.field_o >> -1840501887) + td.field_E);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ma.A(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final static int b(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            gb.field_b.a((byte) -65);
            if (param0 == 15869) {
              if (wg.field_i.a((byte) 95)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ge.a((byte) -74);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 61;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ma.C(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static boolean c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var1_int = 39 / ((param0 - 18) / 54);
              if (fa.field_b <= fj.field_m) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ma.F(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, dm[] param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
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
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        var22 = Geoblox.field_C;
        try {
          L0: {
            if (null != param5) {
              L1: {
                if (param4 <= 0) {
                  break L1;
                } else {
                  if (0 >= param2) {
                    break L1;
                  } else {
                    L2: {
                      if (param5[3] == null) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L2;
                      } else {
                        stackOut_11_0 = param5[3].field_s;
                        stackIn_14_0 = stackOut_11_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_14_0;
                      if (null == param5[5]) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L3;
                      } else {
                        stackOut_15_0 = param5[5].field_s;
                        stackIn_18_0 = stackOut_15_0;
                        break L3;
                      }
                    }
                    var7 = stackIn_18_0;
                    if (param3 == -92) {
                      L4: {
                        if (null != param5[1]) {
                          stackOut_23_0 = param5[1].field_o;
                          stackIn_24_0 = stackOut_23_0;
                          break L4;
                        } else {
                          stackOut_21_0 = 0;
                          stackIn_24_0 = stackOut_21_0;
                          break L4;
                        }
                      }
                      L5: {
                        var8 = stackIn_24_0;
                        if (null != param5[7]) {
                          stackOut_27_0 = param5[7].field_o;
                          stackIn_28_0 = stackOut_27_0;
                          break L5;
                        } else {
                          stackOut_25_0 = 0;
                          stackIn_28_0 = stackOut_25_0;
                          break L5;
                        }
                      }
                      L6: {
                        var9 = stackIn_28_0;
                        var10 = param4 + param1;
                        var11 = param0 + param2;
                        var12 = param1 + var6_int;
                        var13 = var10 - var7;
                        var14 = param0 - -var8;
                        var15 = -var9 + var11;
                        var16 = var12;
                        var17 = var13;
                        if (~var16 >= ~var17) {
                          break L6;
                        } else {
                          var17 = var6_int * param4 / (var6_int - -var7) + param1;
                          var16 = var6_int * param4 / (var6_int - -var7) + param1;
                          break L6;
                        }
                      }
                      L7: {
                        var18 = var14;
                        var19 = var15;
                        vb.a(hd.field_I);
                        if (~var19 <= ~var18) {
                          break L7;
                        } else {
                          var19 = param2 * var8 / (var8 + var9) + param0;
                          var18 = param2 * var8 / (var8 + var9) + param0;
                          break L7;
                        }
                      }
                      L8: {
                        if (null == param5[0]) {
                          break L8;
                        } else {
                          vb.b(param1, param0, var16, var18);
                          param5[0].b(param1, param0);
                          vb.b(hd.field_I);
                          break L8;
                        }
                      }
                      L9: {
                        if (param5[2] != null) {
                          vb.b(var17, param0, var10, var18);
                          param5[2].b(var13, param0);
                          vb.b(hd.field_I);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (null != param5[6]) {
                          vb.b(param1, var19, var16, var11);
                          param5[6].b(param1, var15);
                          vb.b(hd.field_I);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (null != param5[8]) {
                          vb.b(var17, var19, var10, var11);
                          param5[8].b(var13, var15);
                          vb.b(hd.field_I);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (null == param5[1]) {
                          break L12;
                        } else {
                          if (param5[1].field_s != 0) {
                            vb.b(var16, param0, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              L14: {
                                if (~var13 >= ~var20) {
                                  break L14;
                                } else {
                                  param5[1].b(var20, param0);
                                  var20 = var20 + param5[1].field_s;
                                  if (var22 != 0) {
                                    break L12;
                                  } else {
                                    if (var22 == 0) {
                                      continue L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              vb.b(hd.field_I);
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      L15: {
                        if (param5[7] == null) {
                          break L15;
                        } else {
                          if (0 != param5[7].field_s) {
                            vb.b(var16, var19, var17, var11);
                            var20 = var12;
                            L16: while (true) {
                              L17: {
                                if (var20 >= var13) {
                                  break L17;
                                } else {
                                  param5[7].b(var20, var15);
                                  var20 = var20 + param5[7].field_s;
                                  if (var22 != 0) {
                                    break L15;
                                  } else {
                                    if (var22 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                              }
                              vb.b(hd.field_I);
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                      L18: {
                        if (param5[3] == null) {
                          break L18;
                        } else {
                          if (0 != param5[3].field_o) {
                            vb.b(param1, var18, var16, var19);
                            var20 = var14;
                            L19: while (true) {
                              L20: {
                                if (~var15 >= ~var20) {
                                  break L20;
                                } else {
                                  param5[3].b(param1, var20);
                                  var20 = var20 + param5[3].field_o;
                                  if (var22 != 0) {
                                    break L18;
                                  } else {
                                    if (var22 == 0) {
                                      continue L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              vb.b(hd.field_I);
                              break L18;
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      L21: {
                        if (param5[5] == null) {
                          break L21;
                        } else {
                          if (param5[5].field_o != 0) {
                            vb.b(var17, var18, var10, var19);
                            var20 = var14;
                            L22: while (true) {
                              L23: {
                                if (~var20 <= ~var15) {
                                  break L23;
                                } else {
                                  param5[5].b(var13, var20);
                                  var20 = var20 + param5[5].field_o;
                                  if (var22 != 0) {
                                    break L21;
                                  } else {
                                    if (var22 == 0) {
                                      continue L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                              vb.b(hd.field_I);
                              break L21;
                            }
                          } else {
                            break L21;
                          }
                        }
                      }
                      L24: {
                        if (param5[4] == null) {
                          break L24;
                        } else {
                          if (param5[4].field_s == 0) {
                            break L24;
                          } else {
                            if (0 == param5[4].field_o) {
                              break L24;
                            } else {
                              vb.b(var16, var18, var17, var19);
                              var20 = var14;
                              L25: while (true) {
                                L26: {
                                  if (var15 <= var20) {
                                    break L26;
                                  } else {
                                    if (var22 != 0) {
                                      break L24;
                                    } else {
                                      var21 = var12;
                                      L27: while (true) {
                                        L28: {
                                          L29: {
                                            if (~var21 <= ~var13) {
                                              break L29;
                                            } else {
                                              param5[4].b(var21, var20);
                                              var21 = var21 + param5[4].field_s;
                                              if (var22 != 0) {
                                                break L28;
                                              } else {
                                                if (var22 == 0) {
                                                  continue L27;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                          }
                                          var20 = var20 + param5[4].field_o;
                                          break L28;
                                        }
                                        if (var22 == 0) {
                                          continue L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                }
                                vb.b(hd.field_I);
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
                      return;
                    }
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
          L30: {
            var6 = decompiledCaughtException;
            stackOut_119_0 = (RuntimeException) var6;
            stackOut_119_1 = new StringBuilder().append("ma.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_122_0 = stackOut_119_0;
            stackIn_122_1 = stackOut_119_1;
            stackIn_120_0 = stackOut_119_0;
            stackIn_120_1 = stackOut_119_1;
            if (param5 == null) {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L30;
            } else {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "{...}";
              stackIn_123_0 = stackOut_120_0;
              stackIn_123_1 = stackOut_120_1;
              stackIn_123_2 = stackOut_120_2;
              break L30;
            }
          }
          throw t.a((Throwable) (Object) stackIn_123_0, stackIn_123_2 + ')');
        }
    }

    final static boolean a(rh param0, rh param1, rh param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            L1: {
              if (!param2.a(0)) {
                break L1;
              } else {
                if (!param2.a("commonui", (byte) -127)) {
                  break L1;
                } else {
                  L2: {
                    if (!param1.a(param3 + 11652)) {
                      break L2;
                    } else {
                      if (!param1.a("commonui", (byte) -124)) {
                        break L2;
                      } else {
                        if (param3 == -11652) {
                          L3: {
                            if (!param0.a(0)) {
                              break L3;
                            } else {
                              if (!param0.a("button.gif", (byte) -125)) {
                                break L3;
                              } else {
                                stackOut_27_0 = 1;
                                stackIn_28_0 = stackOut_27_0;
                                break L0;
                              }
                            }
                          }
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0 != 0;
                        } else {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("ma.D(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L4;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L4;
            }
          }
          L5: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L5;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L5;
            }
          }
          L6: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L6;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param3 + ')');
        }
        return stackIn_28_0 != 0;
    }

    ma(long param0, int param1, byte[] param2) {
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
            ((ma) this).field_h = param1;
            ((ma) this).field_g = param2;
            ((ma) this).field_f = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ma.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
    }
}

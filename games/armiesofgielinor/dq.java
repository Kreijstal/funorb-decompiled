/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_j;
    static String field_d;
    static String field_f;
    static String field_g;
    private int[] field_h;
    static int field_c;
    private byte[] field_a;
    static wk[] field_i;
    static ru[] field_e;
    private int[] field_b;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 76 % ((param0 - 52) / 39);
        var3 = param1;
        var4 = param1;
        if (1 != var4) {
          if (var4 != 2) {
            if (var4 == 3) {
              if (var5 != 0) {
                L0: {
                  L1: {
                    if (var4 == 4) {
                      var3 = 3;
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  var3 = param1;
                  break L0;
                }
                return var3;
              } else {
                L2: {
                  var3 = 4;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    var3 = 3;
                    var3 = param1;
                    break L2;
                  }
                }
                return var3;
              }
            } else {
              L3: {
                L4: {
                  if (var4 == 4) {
                    var3 = 3;
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                var3 = param1;
                break L3;
              }
              return var3;
            }
          } else {
            if (var5 != 0) {
              if (var4 != 3) {
                L5: {
                  L6: {
                    if (var4 == 4) {
                      var3 = 3;
                      if (var5 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  var3 = param1;
                  break L5;
                }
                return var3;
              } else {
                L7: {
                  L8: {
                    L9: {
                      if (var5 == 0) {
                        var3 = 4;
                        if (var5 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      } else {
                        if (var4 == 4) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3 = 3;
                    if (var5 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                  var3 = param1;
                  break L7;
                }
                return var3;
              }
            } else {
              L10: {
                var3 = 1;
                if (var5 == 0) {
                  break L10;
                } else {
                  var3 = 4;
                  var3 = 3;
                  var3 = param1;
                  break L10;
                }
              }
              return var3;
            }
          }
        } else {
          L11: {
            var3 = 2;
            if (var5 == 0) {
              break L11;
            } else {
              var3 = 1;
              var3 = 4;
              var3 = 3;
              var3 = param1;
              break L11;
            }
          }
          return var3;
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != -1) {
          field_d = (String) null;
          field_i = null;
          field_d = null;
          return;
        } else {
          field_i = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, int param1, String param2, boolean param3, byte param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!param3) {
                  break L2;
                } else {
                  no.field_P.field_y = qn.field_l;
                  no.field_P.field_B = qn.field_d;
                  no.field_P.field_v = qn.field_g;
                  ku.field_J.b();
                  qn.b();
                  gq.b(bc.field_j[3][0], 0, 0, param1);
                  fe.c(jc.a(param2, (byte) 42), uh.field_e[3][0] >> 1294412577, 20 + (uh.field_e[3][1] >> 1909519937), 2, true);
                  no.field_P.b();
                  ku.field_J.h(param0, param5);
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              gq.b(bc.field_j[3][0], param0, param5, param1);
              fe.c(jc.a(param2, (byte) 42), (uh.field_e[3][0] >> 1376585217) - -param0, 20 + (uh.field_e[3][1] >> -272940991) + param5, 2, true);
              break L1;
            }
            var6_int = 67 % ((param4 - 48) / 53);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var6);
            stackOut_6_1 = new StringBuilder().append("dq.A(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 > 7) {
              stackOut_3_0 = ob.a(10, true, param1, 0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -59;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("dq.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, byte param5) {
        int dupTemp$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            var8 = param4 << 385110691;
            param2 = param2 + param0;
            if (param5 >= 24) {
              L1: while (true) {
                L2: {
                  if (param0 >= param2) {
                    stackOut_21_0 = var8 - -7 >> 1985910691;
                    stackOut_21_1 = param4;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L2;
                  } else {
                    var9 = param1[param0] & 255;
                    var10 = this.field_h[var9];
                    var11 = this.field_a[var9];
                    stackOut_5_0 = 0;
                    stackOut_5_1 = var11;
                    stackIn_22_0 = stackOut_5_0;
                    stackIn_22_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (stackIn_6_0 == stackIn_6_1) {
                        throw new RuntimeException("" + var9);
                      } else {
                        L3: {
                          L4: {
                            var12 = var8 >> -572783453;
                            var13 = var8 & 7;
                            var7_int = var7_int & -var13 >> -21459393;
                            var14 = var12 + (var11 + (var13 + -1) >> -1380689533);
                            var8 = var8 + var11;
                            var13 += 24;
                            dupTemp$1 = oe.c(var7_int, var10 >>> var13);
                            var7_int = dupTemp$1;
                            param3[var12] = (byte)dupTemp$1;
                            if (var12 < var14) {
                              break L4;
                            } else {
                              if (var15 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var13 -= 8;
                          var12++;
                          var7_int = var10 >>> var13;
                          param3[var12] = (byte)(var10 >>> var13);
                          if (var12 >= var14) {
                            break L3;
                          } else {
                            L5: {
                              var13 -= 8;
                              var12++;
                              var7_int = var10 >>> var13;
                              param3[var12] = (byte)(var10 >>> var13);
                              if (var14 > var12) {
                                break L5;
                              } else {
                                if (var15 == 0) {
                                  break L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              var13 -= 8;
                              var12++;
                              var7_int = var10 >>> var13;
                              param3[var12] = (byte)(var10 >>> var13);
                              if (var12 < var14) {
                                break L6;
                              } else {
                                if (var15 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var13 -= 8;
                            var12++;
                            var7_int = var10 << -var13;
                            param3[var12] = (byte)(var10 << -var13);
                            break L3;
                          }
                        }
                        param0++;
                        continue L1;
                      }
                    }
                  }
                }
                stackOut_22_0 = stackIn_22_0 - stackIn_22_1;
                stackIn_23_0 = stackOut_22_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = -2;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var7);
            stackOut_24_1 = new StringBuilder().append("dq.C(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_23_0;
        }
    }

    dq(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            this.field_a = param0;
            this.field_h = new int[var2_int];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            this.field_b = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              stackOut_2_0 = var5;
              stackOut_2_1 = var2_int;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                if (stackIn_3_0 >= stackIn_3_1) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var6 = param0[var5];
                  if (var15 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L3: {
                      L4: {
                        if (-1 != (var6 ^ -1)) {
                          break L4;
                        } else {
                          if (var15 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          L7: {
                            var7 = 1 << -var6 + 32;
                            var8 = var17[var6];
                            this.field_h[var5] = var8;
                            if (-1 != (var8 & var7 ^ -1)) {
                              break L7;
                            } else {
                              var9 = var8 | var7;
                              var10 = var6 - 1;
                              L8: while (true) {
                                L9: {
                                  if ((var10 ^ -1) > -2) {
                                    break L9;
                                  } else {
                                    var11 = var17[var10];
                                    stackOut_10_0 = var8 ^ -1;
                                    stackOut_10_1 = var11 ^ -1;
                                    stackIn_18_0 = stackOut_10_0;
                                    stackIn_18_1 = stackOut_10_1;
                                    stackIn_11_0 = stackOut_10_0;
                                    stackIn_11_1 = stackOut_10_1;
                                    if (var15 != 0) {
                                      break L5;
                                    } else {
                                      if (stackIn_11_0 != stackIn_11_1) {
                                        break L9;
                                      } else {
                                        L10: {
                                          var12 = 1 << -var10 + 32;
                                          if ((var11 & var12) == 0) {
                                            break L10;
                                          } else {
                                            var3[var10] = var3[-1 + var10];
                                            if (var15 == 0) {
                                              break L9;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        var3[var10] = oe.c(var11, var12);
                                        var10--;
                                        if (var15 == 0) {
                                          continue L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var15 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var9 = var3[var6 - 1];
                          break L6;
                        }
                        var17[var6] = var9;
                        stackOut_17_0 = 1;
                        stackOut_17_1 = var6;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        break L5;
                      }
                      var10 = stackIn_18_0 + stackIn_18_1;
                      if (-33 > (var10 ^ -1)) {
                        var10 = 0;
                        var11 = 0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (var11 >= var6) {
                                if (var4 > var10) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              } else {
                                var12 = -2147483648 >>> var11;
                                var19 = var8 & var12 ^ -1;
                                var18 = -1;
                                if (var15 != 0) {
                                  if (var18 < var19) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  L14: {
                                    L15: {
                                      if (var18 != var19) {
                                        break L15;
                                      } else {
                                        var10++;
                                        if (var15 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    L16: {
                                      if (0 != this.field_b[var10]) {
                                        break L16;
                                      } else {
                                        this.field_b[var10] = var4;
                                        break L16;
                                      }
                                    }
                                    var10 = this.field_b[var10];
                                    break L14;
                                  }
                                  L17: {
                                    L18: {
                                      if (var10 < this.field_b.length) {
                                        break L18;
                                      } else {
                                        var13 = new int[this.field_b.length * 2];
                                        var14 = 0;
                                        L19: while (true) {
                                          if (var14 >= this.field_b.length) {
                                            this.field_b = var13;
                                            break L18;
                                          } else {
                                            var13[var14] = this.field_b[var14];
                                            var14++;
                                            if (var15 != 0) {
                                              break L17;
                                            } else {
                                              continue L19;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var12 = var12 >>> 1;
                                    var11++;
                                    break L17;
                                  }
                                  continue L11;
                                }
                              }
                            }
                            var4 = 1 + var10;
                            break L12;
                          }
                          this.field_b[var10] = var5 ^ -1;
                          break L3;
                        }
                      } else {
                        stackOut_19_0 = var8 ^ -1;
                        stackOut_19_1 = var17[var10] ^ -1;
                        stackIn_3_0 = stackOut_19_0;
                        stackIn_3_1 = stackOut_19_1;
                        continue L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var2 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var2);
            stackOut_45_1 = new StringBuilder().append("dq.<init>(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L20;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L20;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(byte[] param0, int param1, boolean param2, int param3, int param4, byte[] param5) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_79_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              L1: {
                if (!param2) {
                  break L1;
                } else {
                  this.field_a = (byte[]) null;
                  break L1;
                }
              }
              param3 = param3 + param4;
              var7_int = 0;
              var8 = param1;
              L2: while (true) {
                L3: {
                  L4: {
                    var9 = param0[var8];
                    if (0 > var9) {
                      break L4;
                    } else {
                      var7_int++;
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var7_int = this.field_b[var7_int];
                  break L3;
                }
                L5: {
                  L6: {
                    var10 = this.field_b[var7_int];
                    if (-1 >= (this.field_b[var7_int] ^ -1)) {
                      break L6;
                    } else {
                      L7: {
                        incrementValue$8 = param4;
                        param4++;
                        param5[incrementValue$8] = (byte)(var10 ^ -1);
                        if (param3 > param4) {
                          break L7;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = 0;
                      break L6;
                    }
                  }
                  L8: {
                    L9: {
                      if ((var9 & 64) != 0) {
                        break L9;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var7_int = this.field_b[var7_int];
                    break L8;
                  }
                  L10: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L10;
                    } else {
                      L11: {
                        incrementValue$9 = param4;
                        param4++;
                        param5[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param4 < param3) {
                          break L11;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var7_int = 0;
                      break L10;
                    }
                  }
                  L12: {
                    if ((32 & var9) != 0) {
                      var7_int = this.field_b[var7_int];
                      if (var11 == 0) {
                        break L12;
                      } else {
                        var7_int++;
                        break L12;
                      }
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L13;
                    } else {
                      L14: {
                        incrementValue$10 = param4;
                        param4++;
                        param5[incrementValue$10] = (byte)(var10 ^ -1);
                        if (param3 > param4) {
                          break L14;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L14;
                          }
                        }
                      }
                      var7_int = 0;
                      break L13;
                    }
                  }
                  L15: {
                    if ((var9 & 16) != 0) {
                      var7_int = this.field_b[var7_int];
                      if (var11 == 0) {
                        break L15;
                      } else {
                        var7_int++;
                        break L15;
                      }
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] < 0) {
                      L17: {
                        incrementValue$11 = param4;
                        param4++;
                        param5[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param3 > param4) {
                          break L17;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var7_int = 0;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L18: {
                    L19: {
                      if (-1 != (8 & var9 ^ -1)) {
                        break L19;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    var7_int = this.field_b[var7_int];
                    break L18;
                  }
                  L20: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L20;
                    } else {
                      L21: {
                        incrementValue$12 = param4;
                        param4++;
                        param5[incrementValue$12] = (byte)(var10 ^ -1);
                        if (param4 < param3) {
                          break L21;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var7_int = 0;
                      break L20;
                    }
                  }
                  L22: {
                    if (-1 != (var9 & 4 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      if (var11 == 0) {
                        break L22;
                      } else {
                        var7_int++;
                        break L22;
                      }
                    } else {
                      var7_int++;
                      break L22;
                    }
                  }
                  L23: {
                    var10 = this.field_b[var7_int];
                    if (-1 < (this.field_b[var7_int] ^ -1)) {
                      incrementValue$13 = param4;
                      param4++;
                      param5[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param4 >= param3) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    L25: {
                      if (-1 != (2 & var9 ^ -1)) {
                        break L25;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    var7_int = this.field_b[var7_int];
                    break L24;
                  }
                  L26: {
                    var10 = this.field_b[var7_int];
                    if (0 > this.field_b[var7_int]) {
                      incrementValue$14 = param4;
                      param4++;
                      param5[incrementValue$14] = (byte)(var10 ^ -1);
                      if (param4 >= param3) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (0 != (var9 & 1)) {
                      var7_int = this.field_b[var7_int];
                      if (var11 == 0) {
                        break L27;
                      } else {
                        var7_int++;
                        break L27;
                      }
                    } else {
                      var7_int++;
                      break L27;
                    }
                  }
                  L28: {
                    var10 = this.field_b[var7_int];
                    if (-1 < (this.field_b[var7_int] ^ -1)) {
                      incrementValue$15 = param4;
                      param4++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param4 >= param3) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L28;
                      }
                    } else {
                      break L28;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_79_0 = 1 + (var8 - param1);
                stackIn_80_0 = stackOut_79_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var7 = decompiledCaughtException;
            stackOut_81_0 = (RuntimeException) (var7);
            stackOut_81_1 = new StringBuilder().append("dq.F(");
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param0 == null) {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L29;
            } else {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L29;
            }
          }
          L30: {
            stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
            stackOut_84_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_86_0 = stackOut_84_0;
            stackIn_86_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param5 == null) {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L30;
            } else {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "{...}";
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_87_2 = stackOut_85_2;
              break L30;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_87_0), stackIn_87_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_80_0;
        }
    }

    static {
        field_c = 0;
        field_d = "Useful items to carry with you. Each unit can only hold one accessory at a time. Equipping a unit with a new accessory will cause whatever accessory that unit is currently holding to be discarded.";
        field_f = "Breaking real-world laws";
        field_j = "Ranged weapons will improve the effectiveness of ranged attacks.";
        field_g = "Click to Scroll";
    }
}

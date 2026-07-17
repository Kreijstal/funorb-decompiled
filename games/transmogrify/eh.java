/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eh {
    private static long[] field_d;
    static h field_e;
    static ti[] field_c;
    static int field_a;
    static ii[] field_b;

    final static void a(ol param0, byte param1, String param2, kg param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        byte stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var7 <= ~param2.length()) {
                    break L3;
                  } else {
                    var8 = param2.charAt(var7);
                    stackOut_3_0 = var8;
                    stackOut_3_1 = 60;
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_17_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == stackIn_4_1) {
                          var6 = (var5_int >> 8) - -param0.field_g[0] - -param3.a(param2.substring(0, var7));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          if (-1 != var6) {
                            break L6;
                          } else {
                            L7: {
                              if (32 != var8) {
                                break L7;
                              } else {
                                var5_int = var5_int + -68;
                                break L7;
                              }
                            }
                            param0.field_g[var7] = param0.field_g[0] + ((var5_int >> 8) - (-param3.a(param2.substring(0, var7 + 1)) - -param3.a((char) var8)));
                            if (var9 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        param0.field_g[var7] = var6;
                        break L5;
                      }
                      L8: {
                        if (var8 == 62) {
                          var6 = -1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_16_0 = param1;
                stackOut_16_1 = 79;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              }
              L9: {
                if (stackIn_17_0 == stackIn_17_1) {
                  break L9;
                } else {
                  eh.b((byte) 42);
                  break L9;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("eh.B(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L10;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L10;
            }
          }
          L11: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param1).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L11;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L11;
            }
          }
          L12: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L12;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L12;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + -68 + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        int var1 = 104 % ((-37 - param0) / 39);
        field_c = null;
        field_e = null;
    }

    final static void a(sj param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        j var3_ref_j = null;
        j var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.field_t;
              if (param0.field_k == null) {
                break L1;
              } else {
                if (param0.field_k == od.field_g) {
                  break L1;
                } else {
                  if (null != param0.field_k.field_e[param0.field_s]) {
                    break L1;
                  } else {
                    param0.a(param0.field_s, 28, param0.field_k);
                    param0 = null;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param0.field_h != 0) {
                      break L4;
                    } else {
                      var4 = wk.field_a;
                      var3_ref_j = si.field_i;
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3_ref_j = wk.field_a;
                  var4 = si.field_i;
                  break L3;
                }
                var5 = 0;
                L5: while (true) {
                  L6: {
                    if (var3_ref_j.field_e.length <= var5) {
                      break L6;
                    } else {
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (null == var3_ref_j.field_e[var5]) {
                          param0.a(var5, 28, var3_ref_j);
                          param0 = null;
                          break L6;
                        } else {
                          var5++;
                          if (var6 == 0) {
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  if (param0 == null) {
                    break L2;
                  } else {
                    var5 = 0;
                    L7: while (true) {
                      if (~var5 <= ~var4.field_e.length) {
                        break L2;
                      } else {
                        L8: {
                          if (var4.field_e[var5] == null) {
                            param0.a(var5, 28, var4);
                            if (var6 == 0) {
                              break L2;
                            } else {
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var5++;
                        if (var6 == 0) {
                          continue L7;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            var3 = 1 + var2_int;
            L9: while (true) {
              L10: {
                L11: {
                  if (var3 >= 12) {
                    break L11;
                  } else {
                    if (var6 != 0) {
                      break L10;
                    } else {
                      L12: {
                        if (od.field_g.field_e[var3] != null) {
                          break L12;
                        } else {
                          if (var6 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      od.field_g.field_e[var3].a(-1 + var3, 28, od.field_g);
                      var3++;
                      if (var6 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                break L10;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("eh.D(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L13;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L13;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + 55 + 41);
        }
    }

    final static void b(byte param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            var3 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != oh.field_h) {
                    oh.field_h.a(-2025316960);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (fd.field_d != null) {
                    fd.field_d.c(-20444);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (kk.field_b != null) {
                    {
                      L4: {
                        kk.field_b.a((byte) -96);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  L7: {
                    if (null == oa.field_m) {
                      break L7;
                    } else {
                      var1_int = 0;
                      L8: while (true) {
                        if (~var1_int <= ~oa.field_m.length) {
                          break L7;
                        } else {
                          if (var3 != 0) {
                            break L6;
                          } else {
                            L9: {
                              if (oa.field_m[var1_int] != null) {
                                {
                                  L10: {
                                    oa.field_m[var1_int].a((byte) -61);
                                    break L10;
                                  }
                                }
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var1_int++;
                            if (var3 == 0) {
                              continue L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  var4 = null;
                  eh.a((ol) null, (byte) 4, (String) null, (kg) null, -68);
                  break L6;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw ch.a((Throwable) (Object) var1, "eh.E(" + 42 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sa a(ii[] param0, int param1, byte[] param2, int param3, int param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        byte[][] var10 = null;
        int var11_int = 0;
        sa var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        byte[] var22 = null;
        int var23 = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int[] var29 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        byte stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        sa stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        byte stackOut_12_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        sa stackOut_34_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var28 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (256 != param0.length) {
              throw new IllegalArgumentException();
            } else {
              var29 = new int[256];
              var5_array = var29;
              var6 = new int[256];
              var7 = new int[256];
              var8 = new int[256];
              var9 = new int[]{0, param3, param4};
              var10 = new byte[256][];
              var11_int = param1;
              L1: while (true) {
                stackOut_5_0 = ~var11_int;
                stackIn_6_0 = stackOut_5_0;
                L2: while (true) {
                  L3: {
                    if (stackIn_6_0 <= -257) {
                      break L3;
                    } else {
                      var29[var11_int] = param0[var11_int].field_c + -1;
                      var6[var11_int] = -1 + param0[var11_int].field_b;
                      var7[var11_int] = 2 + param0[var11_int].field_f;
                      var8[var11_int] = param0[var11_int].field_g - -2;
                      var10[var11_int] = new byte[var7[var11_int] * var8[var11_int]];
                      var12 = new byte[var7[var11_int] * var8[var11_int]];
                      var13 = param0[var11_int].field_i;
                      var14 = param0[var11_int].field_f;
                      var15 = param0[var11_int].field_g;
                      var16 = var7[var11_int];
                      var17 = var16 - var14;
                      var18 = 0;
                      var19 = 1 + var7[var11_int];
                      var20 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (~var15 >= ~var20) {
                              break L6;
                            } else {
                              stackOut_9_0 = 0;
                              stackIn_20_0 = stackOut_9_0;
                              stackIn_10_0 = stackOut_9_0;
                              if (var28 != 0) {
                                break L5;
                              } else {
                                var21 = stackIn_10_0;
                                L7: while (true) {
                                  L8: {
                                    L9: {
                                      if (var14 <= var21) {
                                        break L9;
                                      } else {
                                        int incrementValue$3 = var18;
                                        var18++;
                                        stackOut_12_0 = 0;
                                        stackOut_12_1 = var13[incrementValue$3];
                                        stackIn_18_0 = stackOut_12_0;
                                        stackIn_18_1 = stackOut_12_1;
                                        stackIn_13_0 = stackOut_12_0;
                                        stackIn_13_1 = stackOut_12_1;
                                        if (var28 != 0) {
                                          break L8;
                                        } else {
                                          L10: {
                                            if (stackIn_13_0 != stackIn_13_1) {
                                              var22 = var12;
                                              var23 = -var16 + var19;
                                              var24 = var12;
                                              var25 = -1 + var19;
                                              var26 = var12;
                                              var27 = var19 - -1;
                                              var12[var19 + var16] = (byte) 2;
                                              var26[var27] = (byte) 2;
                                              var24[var25] = (byte) 2;
                                              var22[var23] = (byte) 2;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          }
                                          var19++;
                                          var21++;
                                          if (var28 == 0) {
                                            continue L7;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_17_0 = var19;
                                    stackOut_17_1 = var17;
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    break L8;
                                  }
                                  var19 = stackIn_18_0 + stackIn_18_1;
                                  var20++;
                                  if (var28 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var19 = var7[var11_int] + 1;
                          var18 = 0;
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L5;
                        }
                        var20 = stackIn_20_0;
                        L11: while (true) {
                          L12: {
                            if (var20 >= var15) {
                              break L12;
                            } else {
                              stackOut_22_0 = 0;
                              stackIn_6_0 = stackOut_22_0;
                              stackIn_23_0 = stackOut_22_0;
                              if (var28 != 0) {
                                continue L2;
                              } else {
                                var21 = stackIn_23_0;
                                L13: while (true) {
                                  L14: {
                                    L15: {
                                      if (var14 <= var21) {
                                        break L15;
                                      } else {
                                        int incrementValue$4 = var18;
                                        var18++;
                                        stackOut_25_0 = ~var13[incrementValue$4];
                                        stackOut_25_1 = -1;
                                        stackIn_32_0 = stackOut_25_0;
                                        stackIn_32_1 = stackOut_25_1;
                                        stackIn_26_0 = stackOut_25_0;
                                        stackIn_26_1 = stackOut_25_1;
                                        if (var28 != 0) {
                                          break L14;
                                        } else {
                                          L16: {
                                            L17: {
                                              if (stackIn_26_0 == stackIn_26_1) {
                                                break L17;
                                              } else {
                                                int incrementValue$5 = var19;
                                                var19++;
                                                var12[incrementValue$5] = (byte) 1;
                                                if (var28 == 0) {
                                                  break L16;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            var19++;
                                            break L16;
                                          }
                                          var21++;
                                          if (var28 == 0) {
                                            continue L13;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_31_0 = var19;
                                    stackOut_31_1 = var17;
                                    stackIn_32_0 = stackOut_31_0;
                                    stackIn_32_1 = stackOut_31_1;
                                    break L14;
                                  }
                                  var19 = stackIn_32_0 + stackIn_32_1;
                                  var20++;
                                  if (var28 == 0) {
                                    continue L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          var11_int++;
                          if (var28 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var11 = new sa(param2, var29, var6, var7, var8, var9, var10);
                  var11.field_D = var11.field_D - 1;
                  var11.field_t = var11.field_t - 1;
                  var11.field_y = var11.field_y - 1;
                  stackOut_34_0 = (sa) var11;
                  stackIn_35_0 = stackOut_34_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var5;
            stackOut_36_1 = new StringBuilder().append("eh.C(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L18;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L18;
            }
          }
          L19: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L19;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L19;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_35_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        long var0 = 0L;
        int var3 = 0;
        field_d = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
            var0 = (long)var2;
            for (var3 = 0; var3 < 8; var3++) {
                if ((1L & var0) != 1L) {
                    var0 = var0 >>> 1;
                } else {
                    var0 = -3932672073523589310L ^ var0 >>> 1;
                }
            }
            field_d[var2] = var0;
        }
        field_a = 0;
    }
}

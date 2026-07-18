/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class mn extends kd {
    char[] field_F;
    String field_D;
    static rf field_G;
    int[] field_C;
    char[] field_z;
    int[] field_A;
    static gh field_E;
    static int field_y;
    boolean field_B;

    final void a(int param0, gi param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  var3_int = param1.f((byte) -107);
                  if (0 == var3_int) {
                    break L3;
                  } else {
                    this.a(param1, var3_int, (byte) -123);
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
                var3_int = -10 % ((-28 - param0) / 36);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("mn.F(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (null == param1) {
                break L1;
              } else {
                if (~param1.length() > ~hl.field_o) {
                  break L1;
                } else {
                  if (param1.length() <= hf.field_e) {
                    L2: {
                      if (param0 == -30157) {
                        break L2;
                      } else {
                        mn.g(59);
                        break L2;
                      }
                    }
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("mn.E(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void c(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((mn) this).field_A == null) {
                  break L2;
                } else {
                  var2_int = 0;
                  L3: while (true) {
                    if (var2_int >= ((mn) this).field_A.length) {
                      break L2;
                    } else {
                      ((mn) this).field_A[var2_int] = vn.a(((mn) this).field_A[var2_int], 32768);
                      var2_int++;
                      if (var3 != 0) {
                        break L1;
                      } else {
                        if (var3 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (param0 == -3) {
                break L1;
              } else {
                ((mn) this).field_F = null;
                break L1;
              }
            }
            L4: {
              L5: {
                if (null == ((mn) this).field_C) {
                  break L5;
                } else {
                  var2_int = 0;
                  L6: while (true) {
                    if (~var2_int <= ~((mn) this).field_C.length) {
                      break L5;
                    } else {
                      ((mn) this).field_C[var2_int] = vn.a(((mn) this).field_C[var2_int], 32768);
                      var2_int++;
                      if (var3 != 0) {
                        break L4;
                      } else {
                        if (var3 == 0) {
                          continue L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "mn.A(" + param0 + ')');
        }
    }

    private final void a(gi param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        char[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        char[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        char[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        char[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        char[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        char[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        char stackOut_33_2 = 0;
        char[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        char[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (1 == param1) {
                    break L3;
                  } else {
                    L4: {
                      if (param1 == 2) {
                        break L4;
                      } else {
                        L5: {
                          if (param1 != 3) {
                            break L5;
                          } else {
                            var4_int = param0.f((byte) -66);
                            ((mn) this).field_F = new char[var4_int];
                            ((mn) this).field_A = new int[var4_int];
                            var5 = 0;
                            L6: while (true) {
                              L7: {
                                if (var5 >= var4_int) {
                                  break L7;
                                } else {
                                  ((mn) this).field_A[var5] = param0.c((byte) -60);
                                  var6 = param0.d((byte) -2);
                                  if (var7 != 0) {
                                    break L1;
                                  } else {
                                    L8: {
                                      stackOut_11_0 = ((mn) this).field_F;
                                      stackOut_11_1 = var5;
                                      stackIn_16_0 = stackOut_11_0;
                                      stackIn_16_1 = stackOut_11_1;
                                      stackIn_12_0 = stackOut_11_0;
                                      stackIn_12_1 = stackOut_11_1;
                                      if (0 != var6) {
                                        stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                                        stackOut_16_1 = stackIn_16_1;
                                        stackOut_16_2 = eh.a((byte) -71, (byte) var6);
                                        stackIn_17_0 = stackOut_16_0;
                                        stackIn_17_1 = stackOut_16_1;
                                        stackIn_17_2 = stackOut_16_2;
                                        break L8;
                                      } else {
                                        stackOut_12_0 = (char[]) (Object) stackIn_12_0;
                                        stackOut_12_1 = stackIn_12_1;
                                        stackIn_14_0 = stackOut_12_0;
                                        stackIn_14_1 = stackOut_12_1;
                                        stackOut_14_0 = (char[]) (Object) stackIn_14_0;
                                        stackOut_14_1 = stackIn_14_1;
                                        stackOut_14_2 = 0;
                                        stackIn_17_0 = stackOut_14_0;
                                        stackIn_17_1 = stackOut_14_1;
                                        stackIn_17_2 = stackOut_14_2;
                                        break L8;
                                      }
                                    }
                                    stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                                    var5++;
                                    if (var7 == 0) {
                                      continue L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              if (var7 == 0) {
                                break L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        if (param1 != 4) {
                          break L2;
                        } else {
                          ((mn) this).field_B = true;
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var4_int = param0.f((byte) -59);
                    ((mn) this).field_C = new int[var4_int];
                    ((mn) this).field_z = new char[var4_int];
                    var5 = 0;
                    L9: while (true) {
                      L10: {
                        if (~var4_int >= ~var5) {
                          break L10;
                        } else {
                          ((mn) this).field_C[var5] = param0.c((byte) -60);
                          var6 = param0.d((byte) -2);
                          if (var7 != 0) {
                            break L1;
                          } else {
                            L11: {
                              stackOut_28_0 = ((mn) this).field_z;
                              stackOut_28_1 = var5;
                              stackIn_33_0 = stackOut_28_0;
                              stackIn_33_1 = stackOut_28_1;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              if (var6 != 0) {
                                stackOut_33_0 = (char[]) (Object) stackIn_33_0;
                                stackOut_33_1 = stackIn_33_1;
                                stackOut_33_2 = eh.a((byte) -71, (byte) var6);
                                stackIn_34_0 = stackOut_33_0;
                                stackIn_34_1 = stackOut_33_1;
                                stackIn_34_2 = stackOut_33_2;
                                break L11;
                              } else {
                                stackOut_29_0 = (char[]) (Object) stackIn_29_0;
                                stackOut_29_1 = stackIn_29_1;
                                stackIn_31_0 = stackOut_29_0;
                                stackIn_31_1 = stackOut_29_1;
                                stackOut_31_0 = (char[]) (Object) stackIn_31_0;
                                stackOut_31_1 = stackIn_31_1;
                                stackOut_31_2 = 0;
                                stackIn_34_0 = stackOut_31_0;
                                stackIn_34_1 = stackOut_31_1;
                                stackIn_34_2 = stackOut_31_2;
                                break L11;
                              }
                            }
                            stackIn_34_0[stackIn_34_1] = (char) stackIn_34_2;
                            var5++;
                            if (var7 == 0) {
                              continue L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((mn) this).field_D = param0.h(1);
                break L2;
              }
              var4_int = -16 % ((param2 - 46) / 58);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("mn.B(");
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L12;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L12;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void g(int param0) {
        try {
            field_G = null;
            field_E = null;
            if (param0 != 1) {
                field_E = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "mn.C(" + param0 + ')');
        }
    }

    final static java.awt.Frame a(int param0, int param1, pn param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        vc[] var6_array = null;
        wj var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_36_0 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_55_0 = null;
        java.awt.Frame stackIn_57_0 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_35_0 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_46_0 = null;
        Object stackOut_51_0 = null;
        java.awt.Frame stackOut_56_0 = null;
        Object stackOut_54_0 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            if (!param2.b(-98)) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (java.awt.Frame) (Object) stackIn_5_0;
            } else {
              L1: {
                if (0 == param4) {
                  var6_array = nc.a(38, param2);
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (~var6_array.length >= ~var8) {
                            break L4;
                          } else {
                            stackOut_14_0 = ~param3;
                            stackIn_36_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_15_0 != ~var6_array[var8].field_a) {
                                  break L5;
                                } else {
                                  if (var6_array[var8].field_g == param1) {
                                    L6: {
                                      if (param5 == 0) {
                                        break L6;
                                      } else {
                                        if (~var6_array[var8].field_i != ~param5) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var7_int == 0) {
                                        break L7;
                                      } else {
                                        if (~var6_array[var8].field_j >= ~param4) {
                                          break L5;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var7_int = 1;
                                    param4 = var6_array[var8].field_j;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var8++;
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_35_0 = var7_int;
                        stackIn_36_0 = stackOut_35_0;
                        break L3;
                      }
                      if (stackIn_36_0 != 0) {
                        break L1;
                      } else {
                        stackOut_37_0 = null;
                        stackIn_38_0 = stackOut_37_0;
                        return (java.awt.Frame) (Object) stackIn_38_0;
                      }
                    }
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (java.awt.Frame) (Object) stackIn_11_0;
                  }
                } else {
                  break L1;
                }
              }
              var6_ref = param2.a(param1, param5, param4, param3, 6);
              L8: while (true) {
                L9: {
                  L10: {
                    if (0 != var6_ref.field_a) {
                      break L10;
                    } else {
                      a.a((byte) 127, 10L);
                      if (var9 != 0) {
                        break L9;
                      } else {
                        if (var9 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  if (param0 == 22230) {
                    break L9;
                  } else {
                    stackOut_46_0 = null;
                    stackIn_47_0 = stackOut_46_0;
                    return (java.awt.Frame) (Object) stackIn_47_0;
                  }
                }
                var7 = (java.awt.Frame) var6_ref.field_c;
                if (var7 == null) {
                  stackOut_51_0 = null;
                  stackIn_52_0 = stackOut_51_0;
                  return (java.awt.Frame) (Object) stackIn_52_0;
                } else {
                  if (var6_ref.field_a != 2) {
                    stackOut_56_0 = (java.awt.Frame) var7;
                    stackIn_57_0 = stackOut_56_0;
                    break L0;
                  } else {
                    ok.a(-1, param2, var7);
                    stackOut_54_0 = null;
                    stackIn_55_0 = stackOut_54_0;
                    return (java.awt.Frame) (Object) stackIn_55_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var6;
            stackOut_58_1 = new StringBuilder().append("mn.D(").append(param0).append(',').append(param1).append(',');
            stackIn_61_0 = stackOut_58_0;
            stackIn_61_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param2 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L11;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L11;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_57_0;
    }

    mn() {
        ((mn) this).field_B = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new rf();
        field_y = 0;
    }
}

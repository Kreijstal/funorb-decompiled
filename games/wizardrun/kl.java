/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    private Object[][] field_c;
    private Object[] field_b;
    private boolean field_a;
    static String field_e;
    private hl field_g;
    private int field_f;
    private pc field_d;

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!((kl) this).b(17820)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 29) {
                  break L1;
                } else {
                  ((long[]) ((kl) this).field_b[0])[20] = -49L;
                  break L1;
                }
              }
              var3_int = ((kl) this).field_d.field_h.b((byte) 60, wj.a((CharSequence) (Object) param1, 2148));
              stackOut_8_0 = ((kl) this).a(false, var3_int);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("kl.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((kl) this).b(param0 + 17821)) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  boolean discarded$2 = ((kl) this).a(((byte[]) ((kl) this).field_b[0])[10], (String) null);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var3_int = ((kl) this).field_d.field_h.b((byte) 98, wj.a((CharSequence) (Object) param1, 2148));
              if (!this.a(var3_int, 6447)) {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                stackOut_11_0 = var3_int;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("kl.AA(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -11986) {
                break L1;
              } else {
                ((kl) this).field_b = null;
                break L1;
              }
            }
            if (this.a(param0, 6447)) {
              param1 = param1.toLowerCase();
              var4_int = ((kl) this).field_d.field_x[param0].b((byte) 80, wj.a((CharSequence) (Object) param1, 2148));
              if (this.a(var4_int, param0, true)) {
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = -1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("kl.T(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    private final synchronized boolean a(boolean param0, int[] param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        va var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        va var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        Object stackIn_21_0 = null;
        int[] stackIn_21_1 = null;
        int stackIn_35_0 = 0;
        Object stackIn_37_0 = null;
        int[] stackIn_37_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_70_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_163_0 = 0;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        String stackIn_168_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        Object stackOut_20_0 = null;
        int[] stackOut_20_1 = null;
        int stackOut_34_0 = 0;
        Object stackOut_36_0 = null;
        int[] stackOut_36_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        int stackOut_69_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_162_0 = 0;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
        RuntimeException stackOut_165_0 = null;
        StringBuilder stackOut_165_1 = null;
        String stackOut_165_2 = null;
        var22 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((long[]) ((kl) this).field_b[0])[29] = 95L;
                break L1;
              }
            }
            if (!this.a(param2, 6447)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              if (null == ((kl) this).field_b[param2]) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0 != 0;
              } else {
                L2: {
                  var5_int = ((kl) this).field_d.field_p[param2];
                  var6 = ((kl) this).field_d.field_w[param2];
                  if (((kl) this).field_c[param2] == null) {
                    ((kl) this).field_c[param2] = new Object[((kl) this).field_d.field_t[param2]];
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var7 = ((kl) this).field_c[param2];
                var8 = 1;
                var9_int = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var9_int >= var5_int) {
                        break L5;
                      } else {
                        stackOut_20_0 = null;
                        stackOut_20_1 = (int[]) var6;
                        stackIn_37_0 = stackOut_20_0;
                        stackIn_37_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (var22 != 0) {
                          break L4;
                        } else {
                          L6: {
                            L7: {
                              if (stackIn_21_0 == (Object) (Object) stackIn_21_1) {
                                break L7;
                              } else {
                                var10_int = var6[var9_int];
                                if (var22 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var10_int = var9_int;
                            break L6;
                          }
                          L8: {
                            if (null != var7[var10_int]) {
                              break L8;
                            } else {
                              var8 = 0;
                              if (var22 == 0) {
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var9_int++;
                          if (var22 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var8 != 0) {
                      stackOut_34_0 = 1;
                      stackIn_35_0 = stackOut_34_0;
                      return stackIn_35_0 != 0;
                    } else {
                      stackOut_36_0 = null;
                      stackOut_36_1 = (int[]) param1;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L4;
                    }
                  }
                  L9: {
                    L10: {
                      if (stackIn_37_0 == (Object) (Object) stackIn_37_1) {
                        break L10;
                      } else {
                        L11: {
                          if (param1[0] != 0) {
                            break L11;
                          } else {
                            if (param1[1] != 0) {
                              break L11;
                            } else {
                              if (0 != param1[2]) {
                                break L11;
                              } else {
                                if (0 != param1[3]) {
                                  break L11;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        var9_array = bh.a((byte) 104, ((kl) this).field_b[param2], true);
                        var10_ref = new va(var9_array);
                        var10_ref.a(param0, param1, 5, var10_ref.field_k.length);
                        break L9;
                      }
                    }
                    var9_array = bh.a((byte) 115, ((kl) this).field_b[param2], false);
                    break L9;
                  }
                  try {
                    L12: {
                      var10 = dg.a(var9_array, 31027);
                      break L12;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L13: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_54_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_54_1 = new StringBuilder();
                      stackIn_57_0 = stackOut_54_0;
                      stackIn_57_1 = stackOut_54_1;
                      stackIn_55_0 = stackOut_54_0;
                      stackIn_55_1 = stackOut_54_1;
                      if (param1 == null) {
                        stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
                        stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
                        stackOut_57_2 = 0;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        stackIn_58_2 = stackOut_57_2;
                        break L13;
                      } else {
                        stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                        stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                        stackOut_55_2 = 1;
                        stackIn_58_0 = stackOut_55_0;
                        stackIn_58_1 = stackOut_55_1;
                        stackIn_58_2 = stackOut_55_2;
                        break L13;
                      }
                    }
                    throw bd.a((Throwable) (Object) stackIn_58_0, (stackIn_58_2 != 0) + " " + param2 + " " + var9_array.length + " " + bi.a(var9_array, 10510, var9_array.length) + " " + bi.a(var9_array, 10510, -2 + var9_array.length) + " " + ((kl) this).field_d.field_q[param2] + " " + ((kl) this).field_d.field_i);
                  }
                  L14: {
                    if (((kl) this).field_a) {
                      ((kl) this).field_b[param2] = null;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      L17: {
                        if (1 >= var5_int) {
                          break L17;
                        } else {
                          L18: {
                            if (((kl) this).field_f != 2) {
                              break L18;
                            } else {
                              var11 = var10.length;
                              var11--;
                              var12 = var10[var11] & 255;
                              var11 = var11 - 4 * var12 * var5_int;
                              var13 = new va(var10);
                              var14_int = 0;
                              var15_int = 0;
                              var13.field_m = var11;
                              var16 = 0;
                              L19: while (true) {
                                L20: {
                                  L21: {
                                    if (var16 >= var12) {
                                      break L21;
                                    } else {
                                      var17 = 0;
                                      stackOut_69_0 = 0;
                                      stackIn_84_0 = stackOut_69_0;
                                      stackIn_70_0 = stackOut_69_0;
                                      if (var22 != 0) {
                                        break L20;
                                      } else {
                                        var18 = stackIn_70_0;
                                        L22: while (true) {
                                          L23: {
                                            L24: {
                                              if (~var5_int >= ~var18) {
                                                break L24;
                                              } else {
                                                var17 = var17 + var13.i(255);
                                                if (var22 != 0) {
                                                  break L23;
                                                } else {
                                                  L25: {
                                                    L26: {
                                                      if (null == var6) {
                                                        break L26;
                                                      } else {
                                                        var19 = var6[var18];
                                                        if (var22 == 0) {
                                                          break L25;
                                                        } else {
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    var19 = var18;
                                                    break L25;
                                                  }
                                                  L27: {
                                                    if (param3 != var19) {
                                                      break L27;
                                                    } else {
                                                      var14_int = var14_int + var17;
                                                      var15_int = var19;
                                                      break L27;
                                                    }
                                                  }
                                                  var18++;
                                                  if (var22 == 0) {
                                                    continue L22;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                            var16++;
                                            break L23;
                                          }
                                          if (var22 == 0) {
                                            continue L19;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_83_0 = -1;
                                  stackIn_84_0 = stackOut_83_0;
                                  break L20;
                                }
                                if (stackIn_84_0 != ~var14_int) {
                                  var16_ref_byte__ = new byte[var14_int];
                                  var13.field_m = var11;
                                  var14_int = 0;
                                  var17 = 0;
                                  var18 = 0;
                                  L28: while (true) {
                                    L29: {
                                      if (var18 >= var12) {
                                        break L29;
                                      } else {
                                        var19 = 0;
                                        stackOut_89_0 = 0;
                                        stackIn_163_0 = stackOut_89_0;
                                        stackIn_90_0 = stackOut_89_0;
                                        if (var22 != 0) {
                                          break L15;
                                        } else {
                                          var20 = stackIn_90_0;
                                          L30: while (true) {
                                            L31: {
                                              L32: {
                                                if (~var5_int >= ~var20) {
                                                  break L32;
                                                } else {
                                                  var19 = var19 + var13.i(255);
                                                  if (var22 != 0) {
                                                    break L31;
                                                  } else {
                                                    L33: {
                                                      L34: {
                                                        if (var6 != null) {
                                                          break L34;
                                                        } else {
                                                          var21 = var20;
                                                          if (var22 == 0) {
                                                            break L33;
                                                          } else {
                                                            break L34;
                                                          }
                                                        }
                                                      }
                                                      var21 = var6[var20];
                                                      break L33;
                                                    }
                                                    L35: {
                                                      if (~param3 != ~var21) {
                                                        break L35;
                                                      } else {
                                                        g.a(var10, var17, var16_ref_byte__, var14_int, var19);
                                                        var14_int = var14_int + var19;
                                                        break L35;
                                                      }
                                                    }
                                                    var17 = var17 + var19;
                                                    var20++;
                                                    if (var22 == 0) {
                                                      continue L30;
                                                    } else {
                                                      break L32;
                                                    }
                                                  }
                                                }
                                              }
                                              var18++;
                                              break L31;
                                            }
                                            if (var22 == 0) {
                                              continue L28;
                                            } else {
                                              break L29;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                    if (var22 == 0) {
                                      break L16;
                                    } else {
                                      break L18;
                                    }
                                  }
                                } else {
                                  stackOut_85_0 = 1;
                                  stackIn_86_0 = stackOut_85_0;
                                  return stackIn_86_0 != 0;
                                }
                              }
                            }
                          }
                          var11 = var10.length;
                          var11--;
                          var12 = 255 & var10[var11];
                          var11 = var11 - var5_int * var12 * 4;
                          var13 = new va(var10);
                          var14 = new int[var5_int];
                          var13.field_m = var11;
                          var15_int = 0;
                          L36: while (true) {
                            L37: {
                              L38: {
                                if (~var12 >= ~var15_int) {
                                  break L38;
                                } else {
                                  var16 = 0;
                                  stackOut_106_0 = 0;
                                  stackIn_116_0 = stackOut_106_0;
                                  stackIn_107_0 = stackOut_106_0;
                                  if (var22 != 0) {
                                    break L37;
                                  } else {
                                    var17 = stackIn_107_0;
                                    L39: while (true) {
                                      L40: {
                                        L41: {
                                          if (~var17 <= ~var5_int) {
                                            break L41;
                                          } else {
                                            var16 = var16 + var13.i(255);
                                            var14[var17] = var14[var17] + var16;
                                            var17++;
                                            if (var22 != 0) {
                                              break L40;
                                            } else {
                                              if (var22 == 0) {
                                                continue L39;
                                              } else {
                                                break L41;
                                              }
                                            }
                                          }
                                        }
                                        var15_int++;
                                        break L40;
                                      }
                                      if (var22 == 0) {
                                        continue L36;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_115_0 = var5_int;
                              stackIn_116_0 = stackOut_115_0;
                              break L37;
                            }
                            var15 = new byte[stackIn_116_0][];
                            var16 = 0;
                            L42: while (true) {
                              L43: {
                                L44: {
                                  if (var16 >= var5_int) {
                                    break L44;
                                  } else {
                                    var15[var16] = new byte[var14[var16]];
                                    var14[var16] = 0;
                                    var16++;
                                    if (var22 != 0) {
                                      break L43;
                                    } else {
                                      if (var22 == 0) {
                                        continue L42;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                }
                                var13.field_m = var11;
                                var16 = 0;
                                break L43;
                              }
                              var17 = 0;
                              L45: while (true) {
                                L46: {
                                  L47: {
                                    if (var17 >= var12) {
                                      break L47;
                                    } else {
                                      var18 = 0;
                                      stackOut_125_0 = 0;
                                      stackIn_135_0 = stackOut_125_0;
                                      stackIn_126_0 = stackOut_125_0;
                                      if (var22 != 0) {
                                        break L46;
                                      } else {
                                        var19 = stackIn_126_0;
                                        L48: while (true) {
                                          L49: {
                                            L50: {
                                              if (~var19 <= ~var5_int) {
                                                break L50;
                                              } else {
                                                var18 = var18 + var13.i(255);
                                                g.a(var10, var16, var15[var19], var14[var19], var18);
                                                var16 = var16 + var18;
                                                var14[var19] = var14[var19] + var18;
                                                var19++;
                                                if (var22 != 0) {
                                                  break L49;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L48;
                                                  } else {
                                                    break L50;
                                                  }
                                                }
                                              }
                                            }
                                            var17++;
                                            break L49;
                                          }
                                          if (var22 == 0) {
                                            continue L45;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_134_0 = 0;
                                  stackIn_135_0 = stackOut_134_0;
                                  break L46;
                                }
                                var17 = stackIn_135_0;
                                L51: while (true) {
                                  L52: {
                                    if (~var5_int >= ~var17) {
                                      break L52;
                                    } else {
                                      if (var22 != 0) {
                                        break L16;
                                      } else {
                                        L53: {
                                          L54: {
                                            if (var6 != null) {
                                              break L54;
                                            } else {
                                              var18 = var17;
                                              if (var22 == 0) {
                                                break L53;
                                              } else {
                                                break L54;
                                              }
                                            }
                                          }
                                          var18 = var6[var17];
                                          break L53;
                                        }
                                        L55: {
                                          L56: {
                                            if (0 == ((kl) this).field_f) {
                                              break L56;
                                            } else {
                                              var7[var18] = (Object) (Object) var15[var17];
                                              if (var22 == 0) {
                                                break L55;
                                              } else {
                                                break L56;
                                              }
                                            }
                                          }
                                          var7[var18] = pi.a(var15[var17], 0, false);
                                          break L55;
                                        }
                                        var17++;
                                        if (var22 == 0) {
                                          continue L51;
                                        } else {
                                          break L52;
                                        }
                                      }
                                    }
                                  }
                                  if (var22 == 0) {
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L57: {
                        L58: {
                          if (var6 != null) {
                            break L58;
                          } else {
                            var11 = 0;
                            if (var22 == 0) {
                              break L57;
                            } else {
                              break L58;
                            }
                          }
                        }
                        var11 = var6[0];
                        break L57;
                      }
                      L59: {
                        if (((kl) this).field_f != 0) {
                          break L59;
                        } else {
                          var7[var11] = pi.a(var10, 0, false);
                          if (var22 == 0) {
                            break L16;
                          } else {
                            break L59;
                          }
                        }
                      }
                      var7[var11] = (Object) (Object) var10;
                      break L16;
                    }
                    stackOut_162_0 = 1;
                    stackIn_163_0 = stackOut_162_0;
                    break L15;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L60: {
            var5 = decompiledCaughtException;
            stackOut_164_0 = (RuntimeException) var5;
            stackOut_164_1 = new StringBuilder().append("kl.Q(").append(param0).append(',');
            stackIn_167_0 = stackOut_164_0;
            stackIn_167_1 = stackOut_164_1;
            stackIn_165_0 = stackOut_164_0;
            stackIn_165_1 = stackOut_164_1;
            if (param1 == null) {
              stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
              stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
              stackOut_167_2 = "null";
              stackIn_168_0 = stackOut_167_0;
              stackIn_168_1 = stackOut_167_1;
              stackIn_168_2 = stackOut_167_2;
              break L60;
            } else {
              stackOut_165_0 = (RuntimeException) (Object) stackIn_165_0;
              stackOut_165_1 = (StringBuilder) (Object) stackIn_165_1;
              stackOut_165_2 = "{...}";
              stackIn_168_0 = stackOut_165_0;
              stackIn_168_1 = stackOut_165_1;
              stackIn_168_2 = stackOut_165_2;
              break L60;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_168_0, stackIn_168_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_163_0 != 0;
    }

    final static void a(int param0, java.awt.Component param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener((java.awt.event.KeyListener) (Object) ff.field_H);
            if (param0 == 0) {
              param1.addFocusListener((java.awt.event.FocusListener) (Object) ff.field_H);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("kl.M(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final synchronized boolean d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        var6 = wizardrun.field_H;
        try {
          L0: {
            if (!((kl) this).b(17820)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var2_int = -35 / (param0 / 45);
              var3 = 1;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (((kl) this).field_d.field_c.length <= var4) {
                      break L3;
                    } else {
                      stackOut_8_0 = ((kl) this).field_d.field_c[var4];
                      stackIn_18_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          var5 = stackIn_9_0;
                          if (((kl) this).field_b[var5] != null) {
                            break L4;
                          } else {
                            this.c(var5, -15053);
                            if (((kl) this).field_b[var5] == null) {
                              var3 = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_17_0 = var3;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "kl.W(" + param0 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            if (((kl) this).b(17820)) {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (0 > param0) {
                    break L2;
                  } else {
                    if (~param1 <= ~((kl) this).field_d.field_t.length) {
                      break L2;
                    } else {
                      if (((kl) this).field_d.field_t[param1] > param0) {
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (!v.field_a) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                return stackIn_22_0 != 0;
              } else {
                throw new IllegalArgumentException(param1 + " " + param0);
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var4, "kl.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_24_0 != 0;
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        Object stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_39_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        Object stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        Object stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                ((kl) this).field_g = null;
                break L1;
              }
            }
            if (this.a(param1, param3, true)) {
              L2: {
                L3: {
                  var5 = null;
                  if (((kl) this).field_c[param3] == null) {
                    break L3;
                  } else {
                    if (((kl) this).field_c[param3][param1] != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = this.a(false, param2, param3, param1) ? 1 : 0;
                if (var6 == 0) {
                  this.c(param3, -15053);
                  var6 = this.a(false, param2, param3, param1) ? 1 : 0;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    stackOut_14_0 = null;
                    stackIn_15_0 = stackOut_14_0;
                    return (byte[]) (Object) stackIn_15_0;
                  }
                } else {
                  break L2;
                }
              }
              if (null != ((kl) this).field_c[param3]) {
                L4: {
                  if (((kl) this).field_c[param3][param1] == null) {
                    break L4;
                  } else {
                    var5 = (Object) (Object) bh.a((byte) 115, ((kl) this).field_c[param3][param1], false);
                    if (var5 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L5: {
                  if (null != var5) {
                    L6: {
                      if (1 == ((kl) this).field_f) {
                        break L6;
                      } else {
                        if (((kl) this).field_f != 2) {
                          break L5;
                        } else {
                          ((kl) this).field_c[param3] = null;
                          if (wizardrun.field_H == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    ((kl) this).field_c[param3][param1] = null;
                    if (((kl) this).field_d.field_t[param3] == 1) {
                      ((kl) this).field_c[param3] = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_39_0 = var5;
                stackIn_40_0 = stackOut_39_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_41_0 = var5;
            stackOut_41_1 = new StringBuilder().append("kl.H(").append(param0).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_44_0 = stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L7;
            } else {
              stackOut_42_0 = stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L7;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_40_0;
    }

    final synchronized boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 17820) {
              L1: {
                if (((kl) this).field_d == null) {
                  ((kl) this).field_d = ((kl) this).field_g.b(false);
                  if (null != ((kl) this).field_d) {
                    ((kl) this).field_b = new Object[((kl) this).field_d.field_s];
                    ((kl) this).field_c = new Object[((kl) this).field_d.field_s][];
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                } else {
                  break L1;
                }
              }
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "kl.B(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final boolean c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (((kl) this).b(17820)) {
              param1 = param1.toLowerCase();
              var3_int = ((kl) this).field_d.field_h.b((byte) 117, wj.a((CharSequence) (Object) param1, param0 ^ -2149));
              if (param0 < ~var3_int) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("kl.K(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (!this.a(param1, 6447)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 <= -81) {
                  break L1;
                } else {
                  ((kl) this).field_f = ((int[]) ((kl) this).field_b[1])[2];
                  break L1;
                }
              }
              stackOut_8_0 = ((kl) this).field_d.field_t[param1];
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "kl.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_8_0 = null;
        byte[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var4_int = -66 / ((param0 - -18) / 54);
            if (!((kl) this).b(17820)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var5 = ((kl) this).field_d.field_h.b((byte) 104, wj.a((CharSequence) (Object) param2, 2148));
              if (!this.a(var5, 6447)) {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (byte[]) (Object) stackIn_9_0;
              } else {
                var6 = ((kl) this).field_d.field_x[var5].b((byte) 99, wj.a((CharSequence) (Object) param1, 2148));
                stackOut_10_0 = ((kl) this).a(var6, var5, 1);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("kl.S(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_11_0;
    }

    private final synchronized boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((kl) this).b(17820)) {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 >= ((kl) this).field_d.field_t.length) {
                    break L1;
                  } else {
                    if (((kl) this).field_d.field_t[param0] == 0) {
                      break L1;
                    } else {
                      if (param1 == 6447) {
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                }
              }
              if (v.field_a) {
                throw new IllegalArgumentException(Integer.toString(param0));
              } else {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "kl.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((kl) this).field_c = null;
                break L1;
              }
            }
            if (((kl) this).b(17820)) {
              param1 = param1.toLowerCase();
              var3_int = ((kl) this).field_d.field_h.b((byte) 102, wj.a((CharSequence) (Object) param1, 2148));
              stackOut_6_0 = ((kl) this).b((byte) -72, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("kl.BA(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                byte[] discarded$2 = ((kl) this).a(51, (String) null, (String) ((Object[]) ((kl) this).field_b[10])[2]);
                break L1;
              }
            }
            if (!((kl) this).b(17820)) {
              stackOut_6_0 = -1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = ((kl) this).field_d.field_t.length;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "kl.V(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized int b(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!this.a(param1, 6447)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 < -33) {
                if (((kl) this).field_b[param1] != null) {
                  stackOut_11_0 = 100;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = ((kl) this).field_g.a(false, param1);
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = 44;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "kl.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        byte stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        var5 = wizardrun.field_H;
        try {
          L0: {
            if (!((kl) this).b(17820)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4 <= ~((kl) this).field_b.length) {
                      break L3;
                    } else {
                      stackOut_8_0 = 0;
                      stackOut_8_1 = ((kl) this).field_d.field_p[var4];
                      stackIn_15_0 = stackOut_8_0;
                      stackIn_15_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_9_0 >= stackIn_9_1) {
                            break L4;
                          } else {
                            var2_int += 100;
                            var3 = var3 + ((kl) this).b((byte) -95, var4);
                            break L4;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = param0;
                  stackOut_14_1 = 75;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L2;
                }
                L5: {
                  if (stackIn_15_0 == stackIn_15_1) {
                    break L5;
                  } else {
                    kl.a(-90, (java.awt.Component) null);
                    break L5;
                  }
                }
                if (var2_int == 0) {
                  stackOut_21_0 = 100;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0;
                } else {
                  var4 = var3 * 100 / var2_int;
                  stackOut_23_0 = var4;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "kl.G(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    final synchronized byte[] a(byte param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        byte[] stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_13_0 = null;
        byte[] stackOut_19_0 = null;
        Object stackOut_16_0 = null;
        try {
          if (!((kl) this).b(17820)) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (((kl) this).field_d.field_t.length == 1) {
              stackOut_8_0 = ((kl) this).a(param1, 0, 1);
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              if (!this.a(param1, 6447)) {
                stackOut_13_0 = null;
                stackIn_14_0 = stackOut_13_0;
                return (byte[]) (Object) stackIn_14_0;
              } else {
                if (param0 < -126) {
                  if (((kl) this).field_d.field_t[param1] != 1) {
                    throw new RuntimeException();
                  } else {
                    stackOut_19_0 = ((kl) this).a(0, param1, 1);
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0;
                  }
                } else {
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  return (byte[]) (Object) stackIn_17_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "kl.N(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized void c(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -15053) {
              L1: {
                L2: {
                  if (((kl) this).field_a) {
                    break L2;
                  } else {
                    ((kl) this).field_b[param0] = pi.a(((kl) this).field_g.a((byte) -23, param0), 0, false);
                    if (wizardrun.field_H == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ((kl) this).field_b[param0] = (Object) (Object) ((kl) this).field_g.a((byte) -22, param0);
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "kl.I(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(char param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                kl.a(18);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (param0 < 48) {
                    break L4;
                  } else {
                    if (param0 <= 57) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param0 < 65) {
                    break L5;
                  } else {
                    if (param0 <= 90) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (param0 < 97) {
                    break L6;
                  } else {
                    if (param0 > 122) {
                      break L6;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              }
              stackOut_19_0 = 1;
              stackIn_22_0 = stackOut_19_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "kl.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_22_0 != 0;
    }

    static int b(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = param0 & param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "kl.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(param1, param0, true)) {
              L1: {
                if (((kl) this).field_c[param0] == null) {
                  break L1;
                } else {
                  if (null == ((kl) this).field_c[param0][param1]) {
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
              if (null != ((kl) this).field_b[param0]) {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0 != 0;
              } else {
                this.c(param0, param2 + -14987);
                if (((kl) this).field_b[param0] == null) {
                  L2: {
                    if (param2 == -66) {
                      break L2;
                    } else {
                      ((kl) this).field_f = -125;
                      break L2;
                    }
                  }
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var4, "kl.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!((kl) this).b(17820)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param2 < -125) {
                  break L1;
                } else {
                  boolean discarded$2 = ((kl) this).d(-13);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = ((kl) this).field_d.field_h.b((byte) 63, wj.a((CharSequence) (Object) param1, 2148));
              if (!this.a(var4_int, 6447)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              } else {
                var5 = ((kl) this).field_d.field_x[var4_int].b((byte) 89, wj.a((CharSequence) (Object) param0, 2148));
                stackOut_13_0 = ((kl) this).a(var4_int, var5, (byte) -66);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("kl.A(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized boolean a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((byte[]) ((kl) this).field_b[7])[1] = (byte) -124;
                break L1;
              }
            }
            if (!this.a(param1, 6447)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              if (null == ((kl) this).field_b[param1]) {
                this.c(param1, -15053);
                if (((kl) this).field_b[param1] == null) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              } else {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "kl.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final byte[] a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                boolean discarded$2 = kl.a('', true);
                break L1;
              }
            }
            stackOut_3_0 = this.a(1, param0, (int[]) null, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var4, "kl.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 22775) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            field_e = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "kl.P(" + param0 + ')');
        }
    }

    kl(hl param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((kl) this).field_d = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (2 >= param2) {
                  ((kl) this).field_g = param0;
                  ((kl) this).field_a = param1;
                  ((kl) this).field_f = param2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("kl.<init>(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Orb points: <%0>";
    }
}

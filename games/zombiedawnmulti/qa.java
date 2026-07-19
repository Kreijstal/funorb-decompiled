/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qa extends br {
    static String field_m;
    static String field_g;
    qa field_p;
    static String field_n;
    static String field_j;
    static long field_i;
    static int field_h;
    static int field_o;
    qa field_k;
    static int[] field_f;
    long field_l;

    public static void a(byte param0) {
        field_j = null;
        field_m = null;
        field_n = null;
        field_g = null;
        field_f = null;
        if (param0 != 43) {
            field_g = (String) null;
        }
    }

    final boolean c(int param0) {
        if (null == this.field_p) {
            return false;
        }
        if (param0 != 0) {
            field_i = -71L;
            return true;
        }
        return true;
    }

    final long d(int param0) {
        if (param0 > -60) {
            return -16L;
        }
        return this.field_l;
    }

    final void a(byte param0, long param1) {
        if (!(null == this.field_p)) {
            throw new RuntimeException();
        }
        this.field_l = param1;
        if (param0 != -85) {
            field_g = (String) null;
        }
    }

    final void a(int param0) {
        if (!(this.field_p != null)) {
            return;
        }
        this.field_p.field_k = this.field_k;
        this.field_k.field_p = this.field_p;
        if (param0 != -4564) {
            this.a((byte) -27, 73L);
        }
        this.field_k = null;
        this.field_p = null;
    }

    final static ja[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        ja[] var10 = null;
        ja[] var11_ref_ja__ = null;
        int var11 = 0;
        int var12 = 0;
        ja var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        byte stackOut_41_0 = 0;
        int stackOut_33_0 = 0;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        var9 = param7 + (param2 + param8);
        var10 = new ja[]{new ja(var9, var9), new ja(param3, var9), new ja(var9, var9), new ja(var9, param3), new ja(64, 64), new ja(var9, param3), new ja(var9, var9), new ja(param3, var9), new ja(var9, var9)};
        var11_ref_ja__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var11_ref_ja__.length <= var12) {
                break L2;
              } else {
                var13 = var11_ref_ja__[var12];
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var14 >= var13.field_B.length) {
                          break L5;
                        } else {
                          var13.field_B[var14] = param1;
                          var14++;
                          if (var15 != 0) {
                            break L4;
                          } else {
                            if (var15 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var12++;
                      break L4;
                    }
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var11 = stackIn_11_0;
          L6: while (true) {
            L7: {
              if (param2 <= var11) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L7;
              } else {
                stackOut_13_0 = 0;
                stackIn_22_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var15 != 0) {
                  break L7;
                } else {
                  var12 = stackIn_14_0;
                  L8: while (true) {
                    L9: {
                      if (var9 <= var12) {
                        var11++;
                        break L9;
                      } else {
                        var10[6].field_B[(var9 - (var11 - -1)) * var9 - -var12] = param0;
                        var10[8].field_B[var12 + var9 * (-1 + (var9 - var11))] = param0;
                        var10[2].field_B[var12 * var9 - -var9 + (-1 - var11)] = param0;
                        var10[8].field_B[-var11 + (-1 + var9 + var12 * var9)] = param0;
                        var12++;
                        if (var15 != 0) {
                          break L9;
                        } else {
                          continue L8;
                        }
                      }
                    }
                    continue L6;
                  }
                }
              }
            }
            var11 = stackIn_22_0;
            L10: while (true) {
              stackOut_23_0 = var11;
              stackOut_23_1 = param2;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              L11: while (true) {
                L12: {
                  if (stackIn_24_0 >= stackIn_24_1) {
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    break L12;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_31_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var15 != 0) {
                      break L12;
                    } else {
                      var12 = stackIn_26_0;
                      if (var9 <= var12) {
                        var11++;
                        continue L10;
                      } else {
                        var10[0].field_B[var12 - -(var11 * var9)] = param6;
                        var10[0].field_B[var9 * var12 - -var11] = param6;
                        stackOut_27_0 = var9 + -var11;
                        stackOut_27_1 = var12;
                        stackIn_24_0 = stackOut_27_0;
                        stackIn_24_1 = stackOut_27_1;
                        continue L11;
                      }
                    }
                  }
                }
                var11 = stackIn_31_0;
                L13: while (true) {
                  L14: {
                    if (var11 >= param3) {
                      stackOut_41_0 = param4;
                      stackIn_42_0 = stackOut_41_0;
                      break L14;
                    } else {
                      stackOut_33_0 = 0;
                      stackIn_42_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (var15 != 0) {
                        break L14;
                      } else {
                        var12 = stackIn_34_0;
                        L15: while (true) {
                          L16: {
                            if (param2 <= var12) {
                              var11++;
                              break L16;
                            } else {
                              var10[7].field_B[var11 + (-1 + var9 + -var12) * param3] = param0;
                              var10[5].field_B[var9 - (1 + var12 - var9 * var11)] = param0;
                              var10[1].field_B[var12 * param3 + var11] = param6;
                              var10[3].field_B[var12 + var9 * var11] = param6;
                              var12++;
                              if (var15 != 0) {
                                break L16;
                              } else {
                                continue L15;
                              }
                            }
                          }
                          continue L13;
                        }
                      }
                    }
                  }
                  L17: {
                    if (stackIn_42_0 > 59) {
                      break L17;
                    } else {
                      qa.a((byte) -29);
                      break L17;
                    }
                  }
                  var11 = 0;
                  L18: while (true) {
                    L19: {
                      if (param3 >> 179000001 <= var11) {
                        break L19;
                      } else {
                        var12 = 0;
                        L20: while (true) {
                          L21: {
                            if (var12 >= param8) {
                              var11++;
                              break L21;
                            } else {
                              var10[1].field_B[(-var12 + (var9 + -1)) * param3 - -var11] = param5;
                              var10[3].field_B[var9 + -1 + -var12 + var9 * var11] = param5;
                              var10[7].field_B[param3 * var12 + var11] = param5;
                              var10[5].field_B[var9 * var11 + var12] = param5;
                              var12++;
                              if (var15 != 0) {
                                break L21;
                              } else {
                                continue L20;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    return var10;
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var4 = 11 % ((-85 - param0) / 36);
            var3 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (param1.length() <= var3) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2_int;
                    stackIn_9_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == param1.charAt(var3)) {
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("qa.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    protected qa() {
    }

    static {
        field_n = "Find opponent";
        field_j = "Shortcut Reference";
        field_m = "Please enter your date of birth to enable chat:";
        field_g = "Account created successfully!";
        field_o = 15;
        field_f = new int[4];
    }
}

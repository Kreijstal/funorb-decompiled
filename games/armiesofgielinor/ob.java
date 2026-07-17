/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends hs {
    private int[] field_L;
    private int field_T;
    static String field_P;
    private int field_R;
    private int[] field_S;
    private int[] field_K;
    private int field_N;
    int field_Q;
    static volatile int field_J;
    static String[] field_M;
    static String field_O;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 8192) {
            field_J = 99;
        }
        super.a(param0, param1, param2, param3, param4);
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = null != ((ob) this).field_K ? ((ob) this).field_K.length : 0;
        int[] var5 = new int[param0 * var4];
        if (((ob) this).field_L != null) {
            if (0 < ((ob) this).field_L.length) {
                if (0 < var5.length) {
                    if (param1 > 0) {
                        vm.a(((ob) this).field_L, 0, var5, 0, var4 * Math.min(param1, param0));
                    }
                }
            }
        }
        ((ob) this).field_L = var5;
    }

    private final void a(int param0, byte param1, kb param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((ob) this).field_K[-1 + ((ob) this).field_K.length];
              var6 = ((ob) this).field_S[((ob) this).field_S.length + -1];
              stackOut_1_0 = ((ob) this).field_l;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param3 > 0) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = ((ob) this).field_K[param3 + -1];
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0 * stackIn_4_1 / var5_int;
              if (param0 <= 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ((ob) this).field_S[-1 + param0];
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var8 = stackIn_7_0 * ((ob) this).field_w / var6;
            var9 = ((ob) this).field_K[param3] * ((ob) this).field_l / var5_int;
            var10 = ((ob) this).field_w * ((ob) this).field_S[param0] / var6;
            var11 = param0 * ((ob) this).field_K.length - -param3;
            var12 = 48 & ((ob) this).field_L[var11];
            var13 = 192 & ((ob) this).field_L[var11];
            var14 = param2.field_B;
            if (param1 == 65) {
              L3: {
                L4: {
                  var15 = param2.field_p;
                  var16 = param2.field_l;
                  var17 = param2.field_w;
                  if (var9 - var7 <= var16) {
                    break L4;
                  } else {
                    if ((((ob) this).field_L[var11] & 1) == 0) {
                      break L4;
                    } else {
                      var16 = -var7 + var9;
                      var14 = var7;
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var16 <= -var7 + var9) {
                    break L5;
                  } else {
                    if (0 != (((ob) this).field_L[var11] & 4)) {
                      var14 = var7;
                      var16 = -var7 + var9;
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var12 != 16) {
                  if (32 != var12) {
                    var14 = var7;
                    break L3;
                  } else {
                    var14 = var9 - var16;
                    break L3;
                  }
                } else {
                  var14 = var7 - (-var9 + var16) >> 1;
                  break L3;
                }
              }
              L6: {
                L7: {
                  if (var17 >= var10 - var8) {
                    break L7;
                  } else {
                    if ((((ob) this).field_L[var11] & 2) != 0) {
                      var15 = var8;
                      var17 = var10 + -var8;
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var17 <= -var8 + var10) {
                    break L8;
                  } else {
                    if ((8 & ((ob) this).field_L[var11]) != 0) {
                      var17 = var10 - var8;
                      var15 = var8;
                      break L6;
                    } else {
                      break L8;
                    }
                  }
                }
                if (64 == var13) {
                  var15 = -var17 + var8 - -var10 >> 1;
                  break L6;
                } else {
                  if (var13 == 128) {
                    var15 = var10 - var17;
                    break L6;
                  } else {
                    var15 = var8;
                    break L6;
                  }
                }
              }
              var18 = ((ob) this).field_T;
              var19 = ((ob) this).field_R;
              param2.a(var14 + var18, var16 - var18 * 2, var15 + var19, 8192, -(2 * var19) + var17);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var5;
            stackOut_36_1 = new StringBuilder().append("ob.C(").append(param0).append(44).append(param1).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L9;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param3 + 41);
        }
    }

    final void a(kb param0, int param1, int param2) {
        int var4_int = ((ob) this).field_N % ((ob) this).field_K.length;
        int var5 = ((ob) this).field_N / ((ob) this).field_K.length;
        ((ob) this).field_L[((ob) this).field_N] = param1;
        ((ob) this).field_C[((ob) this).field_N] = param0;
        if (param0 != null) {
            this.a(var5, (byte) 65, param0, var4_int);
        }
        if (param2 != 0) {
            return;
        }
        try {
            ((ob) this).field_N = ((ob) this).field_N + 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ob.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
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
            if (param3 > 103) {
              stackOut_3_0 = super.a(param0, param1, param2, 123, param4, param5, param6);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("ob.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_4_0;
    }

    final static int a(int param0, boolean param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (param0 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      if (var5 != 0) {
                        stackOut_37_0 = var6;
                        stackIn_38_0 = stackOut_37_0;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L3: {
                        L4: {
                          var9 = param2.charAt(var8);
                          if (0 != var8) {
                            break L4;
                          } else {
                            if (45 == var9) {
                              var4_int = 1;
                              break L3;
                            } else {
                              if (43 != var9) {
                                break L4;
                              } else {
                                if (!param1) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (48 > var9) {
                              break L6;
                            } else {
                              if (var9 > 57) {
                                break L6;
                              } else {
                                var9 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var9 < 65) {
                              break L7;
                            } else {
                              if (var9 > 90) {
                                break L7;
                              } else {
                                var9 -= 55;
                                break L5;
                              }
                            }
                          }
                          L8: {
                            if (97 > var9) {
                              break L8;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 < param0) {
                          L9: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10 = var9 + param0 * var6;
                          if (var6 != var10 / param0) {
                            throw new NumberFormatException();
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L3;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("ob.H(").append(param0).append(44).append(param1).append(44);
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
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + 0 + 41);
        }
        return stackIn_38_0;
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 < 23) {
            field_J = -52;
        }
        int var4 = ((ob) this).field_K == null ? 0 : ((ob) this).field_K.length;
        kb[] var5 = new kb[param2 * var4];
        if (((ob) this).field_C != null) {
            if (-1 > ((ob) this).field_C.length) {
                if (-1 < var5.length) {
                    if (param1 > 0) {
                        vm.a((Object[]) (Object) ((ob) this).field_C, 0, (Object[]) (Object) var5, 0, Math.min(param1, param2) * var4);
                    }
                }
            }
        }
        ((ob) this).field_C = var5;
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_21_0 = 0;
        boolean stackOut_15_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              var5_int = param1;
              if (98 != var5_int) {
                if (99 == var5_int) {
                  stackOut_13_0 = ((ob) this).a(param0, ((ob) this).field_K.length, true);
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  if (96 != var5_int) {
                    if (var5_int == 97) {
                      stackOut_17_0 = ((ob) this).b(param3 ^ -12286, param0);
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      L1: {
                        if (param3 == -12215) {
                          break L1;
                        } else {
                          var7 = null;
                          this.a(14, (int[]) null);
                          break L1;
                        }
                      }
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    }
                  } else {
                    stackOut_15_0 = ((ob) this).a((byte) 88, param0);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                }
              } else {
                stackOut_11_0 = ((ob) this).a((byte) 106, param0, ((ob) this).field_K.length);
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("ob.F(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_22_0 != 0;
    }

    public static void e(byte param0) {
        field_P = null;
        field_M = null;
        field_O = null;
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        kb var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= ((ob) this).field_C.length) {
              break L1;
            } else {
              if (((ob) this).field_S.length <= var3) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (((ob) this).field_C.length > var2) {
                    if (var4 < ((ob) this).field_K.length) {
                      int incrementValue$2 = var2;
                      var2++;
                      var5 = ((ob) this).field_C[incrementValue$2];
                      if (var5 != null) {
                        this.a(var3, (byte) 65, var5, var4);
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            }
          }
          L3: {
            if (param0 >= 84) {
              break L3;
            } else {
              var7 = null;
              boolean discarded$3 = ((ob) this).a(-86, 103, -38, 9, (kb) null, 3, 102);
              break L3;
            }
          }
          return;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = null == ((ob) this).field_S ? 0 : ((ob) this).field_S.length;
        kb[] var5 = new kb[param1 * var4];
        if (null != ((ob) this).field_C) {
            if (((ob) this).field_C.length > 0) {
                if (var5.length > 0) {
                    if (!(param0 <= 0)) {
                        for (var6 = 0; var4 > var6; var6++) {
                            vm.a((Object[]) (Object) ((ob) this).field_C, var6 * param0, (Object[]) (Object) var5, var6 * param1, Math.min(param0, param1));
                        }
                    }
                }
            }
        }
    }

    ob(int param0, int param1, int param2, int param3, kh param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        ((ob) this).field_Q = 92;
        ((ob) this).field_N = 0;
        try {
            var10 = new int[param5];
            int[] var8 = var10;
            vm.a(var10, 0, param5, 1);
            var9 = new int[param6];
            vm.a(var9, 0, param6, 1);
            this.a((byte) 78, var10);
            this.a(0, var9);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ob.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 41);
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = ((ob) this).field_S != null ? ((ob) this).field_S.length : 0;
        int[] var5 = new int[param2 * var4];
        if (((ob) this).field_L != null) {
            if (0 < ((ob) this).field_L.length) {
                if (var5.length < -1) {
                    if (!(-1 >= param1)) {
                        for (var6 = 0; var4 > var6; var6++) {
                            vm.a(((ob) this).field_L, var6 * param1, var5, param2 * var6, Math.min(param1, param2));
                        }
                    }
                }
            }
        }
        if (!param0) {
            return;
        }
        ((ob) this).field_L = var5;
    }

    private final void a(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            var3_int = null != ((ob) this).field_S ? ((ob) this).field_S.length : 0;
            var4 = param1.length;
            ((ob) this).field_S = param1;
            var5 = param1;
            var6 = 0;
            var7 = param0;
            while (var5.length > var6) {
                var7 = var7 + var5[var6];
                var5[var6] = var7 + var5[var6];
                var6++;
            }
            this.a((byte) 65, var3_int, var4);
            this.c(var4, var3_int, 0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ob.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void d(int param0, int param1, int param2) {
        if (param1 != 57) {
            ((ob) this).field_N = 28;
        }
        ((ob) this).field_R = param0;
        ((ob) this).field_T = param2;
    }

    private final void a(byte param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            int var3_int = 85 % ((-2 - param0) / 62);
            var4 = ((ob) this).field_K != null ? ((ob) this).field_K.length : 0;
            var5 = param1.length;
            ((ob) this).field_K = param1;
            var6 = param1;
            var7 = 0;
            var8 = 0;
            while (var6.length > var7) {
                var8 = var8 + var6[var7];
                var6[var7] = var8 + var6[var7];
                var7++;
            }
            this.b(var4, var5, -20410);
            this.a(true, var4, var5);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ob.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static String j(int param0) {
        return mk.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Holding your chosen god's standard high, order your forces into battle. For here, upon these bloodstained battlefields, will the armies of Gielinor wage war.";
        field_J = 0;
        field_O = "Game";
    }
}

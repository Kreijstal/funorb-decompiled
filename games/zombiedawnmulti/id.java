/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class id extends ff {
    int field_C;
    static String field_x;
    static String field_A;
    int field_z;
    static ak field_B;
    int field_y;
    static int field_D;
    int field_E;

    abstract void f(byte param0);

    abstract void a(int param0, nm param1);

    final static void d(byte param0) {
        br var1 = null;
        RuntimeException var1_ref = null;
        br var2 = null;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_22_0 = false;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_13_0 = false;
        boolean stackOut_11_0 = false;
        boolean stackOut_21_0 = false;
        boolean stackOut_19_0 = false;
        int stackOut_26_0 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                field_D = -84;
                break L1;
              }
            }
            var1 = fd.field_M.c(49);
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        if (!(var1 instanceof wj)) {
                          break L7;
                        } else {
                          var2 = var1.field_d;
                          stackOut_5_0 = ((wj) ((Object) var1)).field_m.k();
                          stackIn_12_0 = stackOut_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          if (var3 != 0) {
                            L8: while (true) {
                              if (!stackIn_12_0) {
                                break L5;
                              } else {
                                var2 = var1.field_d;
                                stackOut_13_0 = ((wj) ((Object) var1)).field_m.k();
                                stackIn_20_0 = stackOut_13_0;
                                stackIn_14_0 = stackOut_13_0;
                                if (var3 != 0) {
                                  break L6;
                                } else {
                                  L9: {
                                    if (stackIn_14_0) {
                                      var1.a(true);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  var1 = var2;
                                  if (var3 == 0) {
                                    stackOut_11_0 = var1 instanceof wj;
                                    stackIn_12_0 = stackOut_11_0;
                                    continue L8;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          } else {
                            L10: {
                              if (stackIn_6_0) {
                                var1.a(true);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var1 = var2;
                            if (var3 == 0) {
                              continue L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var1 = qo.field_q.c(param0 ^ 68);
                      L11: while (true) {
                        stackOut_11_0 = var1 instanceof wj;
                        stackIn_12_0 = stackOut_11_0;
                        if (!stackIn_12_0) {
                          break L5;
                        } else {
                          var2 = var1.field_d;
                          stackOut_13_0 = ((wj) ((Object) var1)).field_m.k();
                          stackIn_20_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var3 != 0) {
                            break L6;
                          } else {
                            L12: {
                              if (stackIn_14_0) {
                                var1.a(true);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var1 = var2;
                            if (var3 == 0) {
                              continue L11;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    L13: while (true) {
                      if (!stackIn_20_0) {
                        break L4;
                      } else {
                        var2 = var1.field_d;
                        stackOut_21_0 = ((wj) ((Object) var1)).field_m.k();
                        stackIn_27_0 = stackOut_21_0 ? 1 : 0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var3 != 0) {
                          break L3;
                        } else {
                          L14: {
                            if (stackIn_22_0) {
                              var1.a(true);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          var1 = var2;
                          if (var3 == 0) {
                            stackOut_19_0 = var1 instanceof wj;
                            stackIn_20_0 = stackOut_19_0;
                            continue L13;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var1 = jp.field_c.c(80);
                  L15: while (true) {
                    stackOut_19_0 = var1 instanceof wj;
                    stackIn_20_0 = stackOut_19_0;
                    if (!stackIn_20_0) {
                      break L4;
                    } else {
                      var2 = var1.field_d;
                      stackOut_21_0 = ((wj) ((Object) var1)).field_m.k();
                      stackIn_27_0 = stackOut_21_0 ? 1 : 0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var3 != 0) {
                        break L3;
                      } else {
                        L16: {
                          if (stackIn_22_0) {
                            var1.a(true);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        var1 = var2;
                        if (var3 == 0) {
                          continue L15;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_26_0 = 127;
                stackIn_27_0 = stackOut_26_0;
                break L3;
              }
              L17: {
                wp.b(stackIn_27_0);
                if (null == td.field_b) {
                  break L17;
                } else {
                  if (wd.field_L.c(-37)) {
                    break L17;
                  } else {
                    fk.a(td.field_b, true);
                    td.field_b = null;
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "id.S(" + param0 + ')');
        }
    }

    public static void e(byte param0) {
        field_B = null;
        if (param0 < 60) {
            field_x = (String) null;
            field_x = null;
            field_A = null;
            return;
        }
        field_x = null;
        field_A = null;
    }

    final int h(int param0) {
        int var2 = 60 / ((12 - param0) / 58);
        return this.field_E >> -500960720;
    }

    final static ld a(cj param0, cj param1, byte param2, int[] param3, cj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        ld[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        tl var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_11_0 = null;
        ld stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
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
        Throwable decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        ld stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = param3.length;
            var6 = new String[var5_int];
            var14 = new char[var5_int];
            var13 = var14;
            var7 = var13;
            var8 = new ld[var5_int];
            var9 = 49;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var10_int) {
                      if (param2 == -65) {
                        break L3;
                      } else {
                        field_D = -90;
                        break L3;
                      }
                    } else {
                      var11 = bd.field_c.a(param3[var10_int], -11452);
                      var6[var10_int] = var11.e(-18572);
                      var9 = (char)(var9 + 1);
                      var7[var10_int] = (char)var9;
                      var8[var10_int] = null;
                      var10_int++;
                      if (var12 != 0) {
                        break L3;
                      } else {
                        continue L2;
                      }
                    }
                  }
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackOut_10_0 = null;
              stackIn_11_0 = stackOut_10_0;
              return (ld) ((Object) stackIn_11_0);
            }
            stackOut_12_0 = new ld(0L, param0, param4, param1, var8, param3, var6, var14);
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("id.P(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        return stackIn_13_0;
    }

    final int g(int param0) {
        int var2 = -126 / ((param0 - 13) / 45);
        return this.field_z >> -735148080;
    }

    id(int param0, int param1, int param2) {
        this.field_C = param2;
        this.field_E = param1 << 1205882640;
        this.field_z = param0 << -268982768;
    }

    static {
        field_A = "Unable to delete name - system busy";
        field_x = "Hide chat";
    }
}

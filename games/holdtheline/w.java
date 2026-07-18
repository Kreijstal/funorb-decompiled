/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w {
    static hj field_c;
    static uf field_a;
    static int field_b;

    final static void a(int param0, hj param1, int param2, int param3, int param4) {
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
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var5_int = param1.field_s;
              var6 = param1.field_y;
              var7 = 0;
              if (param4 < 0) {
                var7 = -param4;
                var5_int = var5_int + param4;
                param4 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = 0;
              if (var5_int + param4 > 640) {
                var5_int = -param4 + 640;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 < 0) {
                var6 = var6 + param3;
                var8 = -param3;
                param3 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param3 + var6 <= 480) {
                break L4;
              } else {
                var6 = 480 - param3;
                break L4;
              }
            }
            L5: {
              if (param2 > 86) {
                break L5;
              } else {
                field_b = 92;
                break L5;
              }
            }
            var9 = var8 * param1.field_s - -var7;
            var10 = param3 * tc.field_j + (param4 + -1);
            var11 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (~var6 >= ~var11) {
                    break L8;
                  } else {
                    if (var13 != 0) {
                      break L7;
                    } else {
                      var12 = 0;
                      L9: while (true) {
                        L10: {
                          L11: {
                            if (var12 >= var5_int) {
                              break L11;
                            } else {
                              stackOut_23_0 = 0;
                              stackOut_23_1 = param1.field_z[var9];
                              stackIn_40_0 = stackOut_23_0;
                              stackIn_40_1 = stackOut_23_1;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (var13 != 0) {
                                break L10;
                              } else {
                                L12: {
                                  L13: {
                                    if (stackIn_24_0 != stackIn_24_1) {
                                      break L13;
                                    } else {
                                      var10++;
                                      if (var13 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (param1.field_z[var9] != 16777215) {
                                      break L14;
                                    } else {
                                      var10++;
                                      tc.field_b[var10] = param0;
                                      if (var13 == 0) {
                                        break L12;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var10++;
                                  tc.field_b[var10] = param1.field_z[var9];
                                  break L12;
                                }
                                var9++;
                                var12++;
                                if (var13 == 0) {
                                  continue L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          var9 = var9 + (param1.field_s - var5_int);
                          stackOut_39_0 = var10;
                          stackOut_39_1 = tc.field_j - param1.field_s;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          break L10;
                        }
                        var10 = stackIn_40_0 + stackIn_40_1;
                        var11++;
                        if (var13 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                break L7;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var5 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var5;
            stackOut_42_1 = new StringBuilder().append("w.O(").append(param0).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L15;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L15;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract int a(long param0, int param1);

    public static void a(byte param0) {
        try {
            field_a = null;
            field_c = null;
            if (param0 <= 68) {
                ok discarded$0 = w.a((String[]) null, (byte) -85);
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "w.P(" + param0 + ')');
        }
    }

    final static ok a(String[] args, byte param1) {
        ok var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        int var4 = 0;
        String var5 = null;
        String[] var6 = null;
        int var7 = 0;
        Object stackIn_9_0 = null;
        ok stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        ok stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var2 = new ok();
            var3 = args;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4 <= ~var3.length) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    var6 = ca.a((byte) -107, ' ', var5);
                    var2.a(bg.a(0, var6), param1 ^ 67);
                    var4++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 == 55) {
                  break L2;
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (ok) (Object) stackIn_9_0;
                }
              }
              stackOut_10_0 = (ok) var2;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2_ref;
            stackOut_12_1 = new StringBuilder().append("w.Q(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (args == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    abstract long a(int param0);

    abstract void b(byte param0);

    final int b(long param0, int param1) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            L1: {
              var4_long = ((w) this).a(-123);
              if (0L < var4_long) {
                qe.a(var4_long, (byte) 45);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 > 38) {
              stackOut_7_0 = ((w) this).a(param0, -35);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_5_0 = 20;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var4, "w.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    static {
    }
}

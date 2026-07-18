/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ju {
    static wk[][] field_a;
    ts[] field_b;
    static int[] field_c;

    final int a(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -76 / ((param0 - 74) / 32);
            if (((ju) this).field_b == null) {
              break L1;
            } else {
              if (0 >= ((ju) this).field_b.length) {
                break L1;
              } else {
                stackOut_2_0 = ((ju) this).field_b[-1 + ((ju) this).field_b.length].field_c - ((ju) this).field_b[0].field_n;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ts var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((ju) this).field_b == null) {
            break L0;
          } else {
            if (0 == ((ju) this).field_b.length) {
              break L0;
            } else {
              if (((ju) this).field_b[0].field_n <= param1) {
                if (param1 <= ((ju) this).field_b[((ju) this).field_b.length + param2].field_c) {
                  if (((ju) this).field_b.length != 1) {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      if (((ju) this).field_b.length <= var5) {
                        return -1;
                      } else {
                        L2: {
                          var6 = ((ju) this).field_b[var5];
                          if (param1 < var6.field_n) {
                            break L2;
                          } else {
                            if (param1 > var6.field_c) {
                              break L2;
                            } else {
                              var7 = var6.a(param0, (byte) 29);
                              if (var7 == -1) {
                                return -1;
                              } else {
                                return var4 - -var7;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_i.length);
                        var5++;
                        continue L1;
                      }
                    }
                  } else {
                    return ((ju) this).field_b[0].a(param0, (byte) 29);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final static int a(bv param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param4 <= -121) {
                break L1;
              } else {
                var7 = null;
                int discarded$2 = ju.a((bv) null, 120, 29, -83, (byte) -93, 59);
                break L1;
              }
            }
            var6_int = param0.g(-106, 1);
            if (0 != var6_int) {
              if (1 == var6_int) {
                stackOut_9_0 = param0.g(95, param3) - -param1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                throw new IllegalStateException();
              }
            } else {
              L2: {
                if (param5 > 0) {
                  stackOut_5_0 = param0.g(-109, param5);
                  stackIn_6_0 = stackOut_5_0;
                  break L2;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_6_0 = stackOut_4_0;
                  break L2;
                }
              }
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ju.B(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_10_0;
    }

    final static int a(int param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ju.a(-112);
                break L1;
              }
            }
            stackOut_2_0 = ob.a(param1, true, param2, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ju.C(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final int a(boolean param0) {
        int var2 = 0;
        ts[] var3 = null;
        int var4 = 0;
        ts var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = -1;
          if (((ju) this).field_b == null) {
            break L0;
          } else {
            var3 = ((ju) this).field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(0);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            field_a = null;
            break L2;
          }
        }
        return var2;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        ts var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        ts[] var7 = ((ju) this).field_b;
        ts[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(var5.field_i.length <= param1)) {
                return var5.field_i[param1];
            }
            param1 = param1 - (-1 + var5.field_i.length);
        }
        if (param0 != -66) {
            int discarded$0 = ((ju) this).a(true);
            return 0;
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        ts var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var3 = param0; ((ju) this).field_b.length > var3; var3++) {
            var4 = ((ju) this).field_b[var3];
            if (!(var4.field_i.length <= param1)) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_i.length);
        }
        return ((ju) this).field_b.length;
    }

    public static void a(int param0) {
        if (param0 >= -111) {
            Object var2 = null;
            int discarded$0 = ju.a(-42, 6, (CharSequence) null);
        }
        field_c = null;
        field_a = null;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = param0;
            L1: while (true) {
              if (var7 <= var8) {
                if (var5_int > 0) {
                  stackOut_13_0 = (-param3 + param2 << 8) / var5_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  return 0;
                }
              } else {
                L2: {
                  var9 = param1.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (var9 == 62) {
                      var6 = 0;
                      break L2;
                    } else {
                      L3: {
                        if (var6 != 0) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var8++;
                      continue L1;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("ju.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}

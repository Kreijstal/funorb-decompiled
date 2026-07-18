/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    private int[] field_c;
    static String field_a;
    static int[] field_b;

    final static hh a(byte param0, ci param1, int param2, ci param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        hh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (rl.a(param4, 0, param2, param1)) {
              stackOut_5_0 = ak.a(param3.a((byte) -93, param4, param2), 21725);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (hh) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("pe.B(").append(-66).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 >= 92) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            param0--;
            L2: while (true) {
              if (param0 < 0) {
                break L0;
              } else {
                var9 = param1;
                var5_array = var9;
                var6 = param2;
                var7 = param4;
                var9[var6] = (vg.c(var9[var6], 16711422) >> 1) + var7;
                param2++;
                param0--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("pe.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_63_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 != 0) {
              param0 = param0 + param2;
              var7_int = param4;
              var8 = param5;
              L1: while (true) {
                L2: {
                  var9 = param3[var8];
                  if (var9 < 0) {
                    var7_int = ((pe) this).field_c[var7_int];
                    break L2;
                  } else {
                    var7_int++;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var10 = ((pe) this).field_c[var7_int];
                    if (0 <= ((pe) this).field_c[var7_int]) {
                      break L4;
                    } else {
                      int incrementValue$8 = param2;
                      param2++;
                      param1[incrementValue$8] = (byte)(~var10);
                      if (param0 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if ((var9 & 64) != 0) {
                      var7_int = ((pe) this).field_c[var7_int];
                      break L5;
                    } else {
                      var7_int++;
                      break L5;
                    }
                  }
                  L6: {
                    var10 = ((pe) this).field_c[var7_int];
                    if (((pe) this).field_c[var7_int] < 0) {
                      int incrementValue$9 = param2;
                      param2++;
                      param1[incrementValue$9] = (byte)(~var10);
                      if (param2 < param0) {
                        var7_int = 0;
                        break L6;
                      } else {
                        break L3;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((var9 & 32) == 0) {
                      var7_int++;
                      break L7;
                    } else {
                      var7_int = ((pe) this).field_c[var7_int];
                      break L7;
                    }
                  }
                  L8: {
                    var10 = ((pe) this).field_c[var7_int];
                    if (((pe) this).field_c[var7_int] < 0) {
                      int incrementValue$10 = param2;
                      param2++;
                      param1[incrementValue$10] = (byte)(~var10);
                      if (param0 > param2) {
                        var7_int = 0;
                        break L8;
                      } else {
                        break L3;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((var9 & 16) == 0) {
                      var7_int++;
                      break L9;
                    } else {
                      var7_int = ((pe) this).field_c[var7_int];
                      break L9;
                    }
                  }
                  L10: {
                    var10 = ((pe) this).field_c[var7_int];
                    if (((pe) this).field_c[var7_int] < 0) {
                      int incrementValue$11 = param2;
                      param2++;
                      param1[incrementValue$11] = (byte)(~var10);
                      if (param2 < param0) {
                        var7_int = 0;
                        break L10;
                      } else {
                        return -param5 + var8 - -1;
                      }
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (0 == (8 & var9)) {
                      var7_int++;
                      break L11;
                    } else {
                      var7_int = ((pe) this).field_c[var7_int];
                      break L11;
                    }
                  }
                  L12: {
                    var10 = ((pe) this).field_c[var7_int];
                    if (((pe) this).field_c[var7_int] < 0) {
                      int incrementValue$12 = param2;
                      param2++;
                      param1[incrementValue$12] = (byte)(~var10);
                      if (param2 >= param0) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if ((4 & var9) != 0) {
                      var7_int = ((pe) this).field_c[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    var10 = ((pe) this).field_c[var7_int];
                    if (((pe) this).field_c[var7_int] >= 0) {
                      break L14;
                    } else {
                      int incrementValue$13 = param2;
                      param2++;
                      param1[incrementValue$13] = (byte)(~var10);
                      if (param2 >= param0) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (0 != (var9 & 2)) {
                      var7_int = ((pe) this).field_c[var7_int];
                      break L15;
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    var10 = ((pe) this).field_c[var7_int];
                    if (((pe) this).field_c[var7_int] < 0) {
                      int incrementValue$14 = param2;
                      param2++;
                      param1[incrementValue$14] = (byte)(~var10);
                      if (param0 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if ((var9 & 1) != -1) {
                      var7_int = ((pe) this).field_c[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    var10 = ((pe) this).field_c[var7_int];
                    if (-1 > ((pe) this).field_c[var7_int]) {
                      int incrementValue$15 = param2;
                      param2++;
                      param1[incrementValue$15] = (byte)(~var10);
                      if (param2 >= param0) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackOut_63_0 = -param5 + var8 - -1;
                stackIn_64_0 = stackOut_63_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("pe.E(").append(param0).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L19;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L19;
            }
          }
          L20: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param3 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L20;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L20;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_64_0;
    }

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param1 = param1 & 8191;
        if (4096 > param1) {
          L0: {
            if (param1 >= 2048) {
              stackOut_7_0 = nj.field_r[-param1 + 4096];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = nj.field_r[param1];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1 < 6144) {
              stackOut_3_0 = -nj.field_r[param1 - 4096];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -nj.field_r[-param1 + 8192];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = -1;
    }

    private pe() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Try again";
    }
}

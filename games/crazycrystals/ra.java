/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    private int[] field_b;
    static fc field_d;
    static String field_a;
    static vc field_c;

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (!param0) {
            field_a = (String) null;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, int param4, byte[] param5) {
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
        int stackIn_4_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_63_0 = 0;
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
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            if ((param3 ^ -1) == param2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var7_int = 0;
              param3 = param3 + param1;
              var8 = param4;
              L1: while (true) {
                L2: {
                  var9 = param0[var8];
                  if (0 > var9) {
                    var7_int = this.field_b[var7_int];
                    break L2;
                  } else {
                    var7_int++;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L4;
                    } else {
                      incrementValue$8 = param1;
                      param1++;
                      param5[incrementValue$8] = (byte)(var10 ^ -1);
                      if (param3 <= param1) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (-1 == (var9 & 64 ^ -1)) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L6;
                    } else {
                      incrementValue$9 = param1;
                      param1++;
                      param5[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param1 >= param3) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if ((32 & var9) == 0) {
                      var7_int++;
                      break L7;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L7;
                    }
                  }
                  L8: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L8;
                    } else {
                      incrementValue$10 = param1;
                      param1++;
                      param5[incrementValue$10] = (byte)(var10 ^ -1);
                      if (param1 < param3) {
                        var7_int = 0;
                        break L8;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L9: {
                    if ((var9 & 16) != 0) {
                      var7_int = this.field_b[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      break L10;
                    } else {
                      incrementValue$11 = param1;
                      param1++;
                      param5[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param1 >= param3) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (0 == (8 & var9)) {
                      var7_int++;
                      break L11;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L11;
                    }
                  }
                  L12: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] < 0) {
                      incrementValue$12 = param1;
                      param1++;
                      param5[incrementValue$12] = (byte)(var10 ^ -1);
                      if (param1 < param3) {
                        var7_int = 0;
                        break L12;
                      } else {
                        break L3;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-1 == (var9 & 4 ^ -1)) {
                      var7_int++;
                      break L13;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L13;
                    }
                  }
                  L14: {
                    var10 = this.field_b[var7_int];
                    if (-1 < (this.field_b[var7_int] ^ -1)) {
                      incrementValue$13 = param1;
                      param1++;
                      param5[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param3 <= param1) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var9 & 2) == 0) {
                      var7_int++;
                      break L15;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L15;
                    }
                  }
                  L16: {
                    var10 = this.field_b[var7_int];
                    if (-1 < (this.field_b[var7_int] ^ -1)) {
                      incrementValue$14 = param1;
                      param1++;
                      param5[incrementValue$14] = (byte)(var10 ^ -1);
                      if (param3 > param1) {
                        var7_int = 0;
                        break L16;
                      } else {
                        return -param4 + var8 + 1;
                      }
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if ((var9 & 1) != 0) {
                      var7_int = this.field_b[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] < 0) {
                      incrementValue$15 = param1;
                      param1++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param3 <= param1) {
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
                stackOut_63_0 = -param4 + var8 + 1;
                stackIn_64_0 = stackOut_63_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var7);
            stackOut_65_1 = new StringBuilder().append("ra.B(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L19;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L19;
            }
          }
          L20: {
            stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param5 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L20;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L20;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_64_0;
        }
    }

    private ra() throws Throwable {
        throw new Error();
    }

    static {
        field_d = new fc(16);
        field_a = "Last Bomb";
    }
}

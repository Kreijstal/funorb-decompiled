/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    private int[] field_c;
    static fn field_b;
    static int field_a;

    final int a(byte[] param0, boolean param1, int param2, int param3, int param4, byte[] param5) {
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
        int stackIn_7_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            if (param4 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var7_int = 0;
              if (param1) {
                param4 = param4 + param2;
                var8 = param3;
                L1: while (true) {
                  L2: {
                    var9 = param5[var8];
                    if (0 > var9) {
                      var7_int = this.field_c[var7_int];
                      break L2;
                    } else {
                      var7_int++;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = this.field_c[var7_int];
                      if (this.field_c[var7_int] >= 0) {
                        break L4;
                      } else {
                        incrementValue$8 = param2;
                        param2++;
                        param0[incrementValue$8] = (byte)(var10 ^ -1);
                        if (param2 >= param4) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if ((64 & var9) != 0) {
                        var7_int = this.field_c[var7_int];
                        break L5;
                      } else {
                        var7_int++;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = this.field_c[var7_int];
                      if (this.field_c[var7_int] < 0) {
                        incrementValue$9 = param2;
                        param2++;
                        param0[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param4 <= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (0 == (var9 & 32)) {
                        var7_int++;
                        break L7;
                      } else {
                        var7_int = this.field_c[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      var10 = this.field_c[var7_int];
                      if (0 > this.field_c[var7_int]) {
                        incrementValue$10 = param2;
                        param2++;
                        param0[incrementValue$10] = (byte)(var10 ^ -1);
                        if (param2 >= param4) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L8;
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
                        var7_int = this.field_c[var7_int];
                        break L9;
                      }
                    }
                    L10: {
                      var10 = this.field_c[var7_int];
                      if (-1 >= (this.field_c[var7_int] ^ -1)) {
                        break L10;
                      } else {
                        incrementValue$11 = param2;
                        param2++;
                        param0[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param4 <= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (-1 != (var9 & 8 ^ -1)) {
                        var7_int = this.field_c[var7_int];
                        break L11;
                      } else {
                        var7_int++;
                        break L11;
                      }
                    }
                    L12: {
                      var10 = this.field_c[var7_int];
                      if (this.field_c[var7_int] >= 0) {
                        break L12;
                      } else {
                        incrementValue$12 = param2;
                        param2++;
                        param0[incrementValue$12] = (byte)(var10 ^ -1);
                        if (param4 <= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if ((var9 & 4) != 0) {
                        var7_int = this.field_c[var7_int];
                        break L13;
                      } else {
                        var7_int++;
                        break L13;
                      }
                    }
                    L14: {
                      var10 = this.field_c[var7_int];
                      if (-1 >= (this.field_c[var7_int] ^ -1)) {
                        break L14;
                      } else {
                        incrementValue$13 = param2;
                        param2++;
                        param0[incrementValue$13] = (byte)(var10 ^ -1);
                        if (param2 >= param4) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (0 != (2 & var9)) {
                        var7_int = this.field_c[var7_int];
                        break L15;
                      } else {
                        var7_int++;
                        break L15;
                      }
                    }
                    L16: {
                      var10 = this.field_c[var7_int];
                      if (-1 >= (this.field_c[var7_int] ^ -1)) {
                        break L16;
                      } else {
                        incrementValue$14 = param2;
                        param2++;
                        param0[incrementValue$14] = (byte)(var10 ^ -1);
                        if (param2 < param4) {
                          var7_int = 0;
                          break L16;
                        } else {
                          return -param3 + 1 + var8;
                        }
                      }
                    }
                    L17: {
                      if (-1 != (var9 & 1 ^ -1)) {
                        var7_int = this.field_c[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    L18: {
                      var10 = this.field_c[var7_int];
                      if (this.field_c[var7_int] < 0) {
                        incrementValue$15 = param2;
                        param2++;
                        param0[incrementValue$15] = (byte)(var10 ^ -1);
                        if (param4 > param2) {
                          var7_int = 0;
                          break L18;
                        } else {
                          break L3;
                        }
                      } else {
                        break L18;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackOut_64_0 = -param3 + 1 + var8;
                  stackIn_65_0 = stackOut_64_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = 81;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) (var7);
            stackOut_66_1 = new StringBuilder().append("ph.A(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L19;
            } else {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L19;
            }
          }
          L20: {
            stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param5 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L20;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L20;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_65_0;
          }
        }
    }

    final static ed[] a(int param0, int param1, int param2, int param3) {
        if (param1 != 1) {
          ph.a((byte) 124);
          return ob.a(param2, param3, 1, 1, param0);
        } else {
          return ob.a(param2, param3, 1, 1, param0);
        }
    }

    private ph() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        if (param0 != 106) {
            field_b = (fn) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = new fn(16, 6);
    }
}

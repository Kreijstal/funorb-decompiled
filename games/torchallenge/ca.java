/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static String field_c;
    static int[][] field_a;
    private int[] field_b;

    public static void a(int param0) {
        field_a = (int[][]) null;
        if (param0 != 32) {
            ca.a(-32);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final int a(int param0, int param1, int param2, int param3, byte[] param4, byte[] param5) {
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
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (0 == param3) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 25790) {
                var7_int = 0;
                param3 = param3 + param2;
                var8 = param1;
                L1: while (true) {
                  L2: {
                    var9 = param5[var8];
                    if (-1 >= (var9 ^ -1)) {
                      var7_int++;
                      break L2;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = this.field_b[var7_int];
                      if (this.field_b[var7_int] < 0) {
                        incrementValue$8 = param2;
                        param2++;
                        param4[incrementValue$8] = (byte)(var10 ^ -1);
                        if (param2 < param3) {
                          var7_int = 0;
                          break L4;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (-1 == (64 & var9 ^ -1)) {
                        var7_int++;
                        break L5;
                      } else {
                        var7_int = this.field_b[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      var10 = this.field_b[var7_int];
                      if (0 > this.field_b[var7_int]) {
                        incrementValue$9 = param2;
                        param2++;
                        param4[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param2 >= param3) {
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
                      if (-1 != (var9 & 32 ^ -1)) {
                        var7_int = this.field_b[var7_int];
                        break L7;
                      } else {
                        var7_int++;
                        break L7;
                      }
                    }
                    L8: {
                      var10 = this.field_b[var7_int];
                      if (this.field_b[var7_int] < 0) {
                        incrementValue$10 = param2;
                        param2++;
                        param4[incrementValue$10] = (byte)(var10 ^ -1);
                        if ((param3 ^ -1) >= (param2 ^ -1)) {
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
                      if ((16 & var9) != 0) {
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
                        incrementValue$11 = param2;
                        param2++;
                        param4[incrementValue$11] = (byte)(var10 ^ -1);
                        if ((param2 ^ -1) <= (param3 ^ -1)) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (0 != (var9 & 8)) {
                        var7_int = this.field_b[var7_int];
                        break L11;
                      } else {
                        var7_int++;
                        break L11;
                      }
                    }
                    L12: {
                      var10 = this.field_b[var7_int];
                      if (-1 >= (this.field_b[var7_int] ^ -1)) {
                        break L12;
                      } else {
                        incrementValue$12 = param2;
                        param2++;
                        param4[incrementValue$12] = (byte)(var10 ^ -1);
                        if ((param3 ^ -1) < (param2 ^ -1)) {
                          var7_int = 0;
                          break L12;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L13: {
                      if (-1 != (var9 & 4 ^ -1)) {
                        var7_int = this.field_b[var7_int];
                        break L13;
                      } else {
                        var7_int++;
                        break L13;
                      }
                    }
                    L14: {
                      var10 = this.field_b[var7_int];
                      if (this.field_b[var7_int] >= 0) {
                        break L14;
                      } else {
                        incrementValue$13 = param2;
                        param2++;
                        param4[incrementValue$13] = (byte)(var10 ^ -1);
                        if ((param3 ^ -1) < (param2 ^ -1)) {
                          var7_int = 0;
                          break L14;
                        } else {
                          return -param1 + 1 + var8;
                        }
                      }
                    }
                    L15: {
                      if ((2 & var9) == 0) {
                        var7_int++;
                        break L15;
                      } else {
                        var7_int = this.field_b[var7_int];
                        break L15;
                      }
                    }
                    L16: {
                      var10 = this.field_b[var7_int];
                      if (this.field_b[var7_int] < 0) {
                        incrementValue$14 = param2;
                        param2++;
                        param4[incrementValue$14] = (byte)(var10 ^ -1);
                        if ((param2 ^ -1) <= (param3 ^ -1)) {
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
                      if ((1 & var9) != 0) {
                        var7_int = this.field_b[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    var10 = this.field_b[var7_int];
                    if (this.field_b[var7_int] >= 0) {
                      var8++;
                      continue L1;
                    } else {
                      incrementValue$15 = param2;
                      param2++;
                      param4[incrementValue$15] = (byte)(var10 ^ -1);
                      if ((param2 ^ -1) > (param3 ^ -1)) {
                        var7_int = 0;
                        var8++;
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_66_0 = -param1 + 1 + var8;
                  stackIn_67_0 = stackOut_66_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = 2;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var7);
            stackOut_68_1 = new StringBuilder().append("ca.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param4 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L18;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L18;
            }
          }
          L19: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param5 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L19;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L19;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_67_0;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) ((Object) var2);
                if (-1L == (lg.a(var3, -1) ^ -1L)) {
                  break L1;
                } else {
                  L2: {
                    if (param1 <= -101) {
                      break L2;
                    } else {
                      ca.a(1);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("ca.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private ca() throws Throwable {
        throw new Error();
    }

    static {
        field_c = "Orb coins: <%0>";
        field_a = new int[][]{null, null, null, null, new int[]{10, 1}, new int[]{17, 2}, new int[]{18, 7}};
    }
}

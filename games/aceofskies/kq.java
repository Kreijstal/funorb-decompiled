/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq {
    private int[] field_a;
    static al field_b;

    final int a(int param0, int param1, byte[] param2, boolean param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_71_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param3) {
                param1 = param1 + param0;
                var7_int = 0;
                var8 = param4;
                L1: while (true) {
                  L2: {
                    var9 = param2[var8];
                    if (0 <= var9) {
                      var7_int++;
                      break L2;
                    } else {
                      var7_int = ((kq) this).field_a[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = ((kq) this).field_a[var7_int];
                      if (((kq) this).field_a[var7_int] >= 0) {
                        break L4;
                      } else {
                        int incrementValue$8 = param0;
                        param0++;
                        param5[incrementValue$8] = (byte)(~var10);
                        if (param0 >= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (0 == (var9 & 64)) {
                        var7_int++;
                        break L5;
                      } else {
                        var7_int = ((kq) this).field_a[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      var10 = ((kq) this).field_a[var7_int];
                      if (0 > ((kq) this).field_a[var7_int]) {
                        int incrementValue$9 = param0;
                        param0++;
                        param5[incrementValue$9] = (byte)(~var10);
                        if (param1 > param0) {
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
                      if ((32 & var9) == 0) {
                        var7_int++;
                        break L7;
                      } else {
                        var7_int = ((kq) this).field_a[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      var10 = ((kq) this).field_a[var7_int];
                      if (0 > ((kq) this).field_a[var7_int]) {
                        int incrementValue$10 = param0;
                        param0++;
                        param5[incrementValue$10] = (byte)(~var10);
                        if (param1 > param0) {
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
                      if (0 == (var9 & 16)) {
                        var7_int++;
                        break L9;
                      } else {
                        var7_int = ((kq) this).field_a[var7_int];
                        break L9;
                      }
                    }
                    L10: {
                      var10 = ((kq) this).field_a[var7_int];
                      if (((kq) this).field_a[var7_int] >= 0) {
                        break L10;
                      } else {
                        int incrementValue$11 = param0;
                        param0++;
                        param5[incrementValue$11] = (byte)var10;
                        if (param0 >= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (-1 == (var9 & 8)) {
                        var7_int++;
                        break L11;
                      } else {
                        var7_int = ((kq) this).field_a[var7_int];
                        break L11;
                      }
                    }
                    L12: {
                      var10 = ((kq) this).field_a[var7_int];
                      if (((kq) this).field_a[var7_int] < 0) {
                        int incrementValue$12 = param0;
                        param0++;
                        param5[incrementValue$12] = (byte)(~var10);
                        if (param1 > param0) {
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
                      if ((4 & var9) != 0) {
                        var7_int = ((kq) this).field_a[var7_int];
                        break L13;
                      } else {
                        var7_int++;
                        break L13;
                      }
                    }
                    L14: {
                      var10 = ((kq) this).field_a[var7_int];
                      if (((kq) this).field_a[var7_int] < 0) {
                        int incrementValue$13 = param0;
                        param0++;
                        param5[incrementValue$13] = (byte)(~var10);
                        if (param0 < param1) {
                          var7_int = 0;
                          break L14;
                        } else {
                          return 1 + var8 - param4;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (0 != (2 & var9)) {
                        var7_int = ((kq) this).field_a[var7_int];
                        break L15;
                      } else {
                        var7_int++;
                        break L15;
                      }
                    }
                    L16: {
                      var10 = ((kq) this).field_a[var7_int];
                      if (((kq) this).field_a[var7_int] < 0) {
                        int incrementValue$14 = param0;
                        param0++;
                        param5[incrementValue$14] = (byte)(~var10);
                        if (param1 <= param0) {
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
                      if (0 == (var9 & 1)) {
                        var7_int++;
                        break L17;
                      } else {
                        var7_int = ((kq) this).field_a[var7_int];
                        break L17;
                      }
                    }
                    L18: {
                      var10 = ((kq) this).field_a[var7_int];
                      if (((kq) this).field_a[var7_int] >= 0) {
                        var8++;
                        break L18;
                      } else {
                        int incrementValue$15 = param0;
                        param0++;
                        param5[incrementValue$15] = (byte)(~var10);
                        if (param1 <= param0) {
                          break L3;
                        } else {
                          var7_int = 0;
                          var8++;
                          break L18;
                        }
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackOut_70_0 = 1 + var8 - param4;
                  stackIn_71_0 = stackOut_70_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = 13;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var7;
            stackOut_72_1 = new StringBuilder().append("kq.B(").append(param0).append(44).append(param1).append(44);
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param2 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L19;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L19;
            }
          }
          L20: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param5 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L20;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L20;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 41);
        }
        return stackIn_71_0;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1178) {
            kq.a(-49);
        }
    }

    private kq() throws Throwable {
        throw new Error();
    }

    static {
    }
}

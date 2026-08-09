/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq {
    private int[] field_a;
    static al field_b;

    final int a(int param0, int param1, byte[] param2, boolean param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
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
                      var7_int = this.field_a[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      dupTemp$0 = this.field_a[var7_int];
                      var10 = dupTemp$0;
                      if (dupTemp$0 >= 0) {
                        break L4;
                      } else {
                        incrementValue$1 = param0;
                        param0++;
                        param5[incrementValue$1] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_a[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      dupTemp$2 = this.field_a[var7_int];
                      var10 = dupTemp$2;
                      if (0 > dupTemp$2) {
                        incrementValue$3 = param0;
                        param0++;
                        param5[incrementValue$3] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_a[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      dupTemp$4 = this.field_a[var7_int];
                      var10 = dupTemp$4;
                      if (0 > dupTemp$4) {
                        incrementValue$5 = param0;
                        param0++;
                        param5[incrementValue$5] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_a[var7_int];
                        break L9;
                      }
                    }
                    L10: {
                      dupTemp$6 = this.field_a[var7_int];
                      var10 = dupTemp$6;
                      if (dupTemp$6 >= 0) {
                        break L10;
                      } else {
                        incrementValue$7 = param0;
                        param0++;
                        param5[incrementValue$7] = (byte)(var10 ^ -1);
                        if (param0 >= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (-1 == (var9 & 8 ^ -1)) {
                        var7_int++;
                        break L11;
                      } else {
                        var7_int = this.field_a[var7_int];
                        break L11;
                      }
                    }
                    L12: {
                      dupTemp$8 = this.field_a[var7_int];
                      var10 = dupTemp$8;
                      if (dupTemp$8 < 0) {
                        incrementValue$9 = param0;
                        param0++;
                        param5[incrementValue$9] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_a[var7_int];
                        break L13;
                      } else {
                        var7_int++;
                        break L13;
                      }
                    }
                    L14: {
                      dupTemp$10 = this.field_a[var7_int];
                      var10 = dupTemp$10;
                      if (-1 < (dupTemp$10 ^ -1)) {
                        incrementValue$11 = param0;
                        param0++;
                        param5[incrementValue$11] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_a[var7_int];
                        break L15;
                      } else {
                        var7_int++;
                        break L15;
                      }
                    }
                    L16: {
                      dupTemp$12 = this.field_a[var7_int];
                      var10 = dupTemp$12;
                      if (-1 < (dupTemp$12 ^ -1)) {
                        incrementValue$13 = param0;
                        param0++;
                        param5[incrementValue$13] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_a[var7_int];
                        break L17;
                      }
                    }
                    L18: {
                      dupTemp$14 = this.field_a[var7_int];
                      var10 = dupTemp$14;
                      if (dupTemp$14 >= 0) {
                        break L18;
                      } else {
                        incrementValue$15 = param0;
                        param0++;
                        param5[incrementValue$15] = (byte)(var10 ^ -1);
                        if (param1 <= param0) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L18;
                        }
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackIn_69_0 = 1 + var8 - param4;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = 13;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var7);

            stackIn_72_1 = new StringBuilder().append("kq.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L19;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L20;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L20;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_73_0), stackIn_76_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_69_0;
          }
        }
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

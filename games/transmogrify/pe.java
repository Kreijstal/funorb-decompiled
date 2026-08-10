/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    private int[] field_c;
    static String field_a;
    static int[] field_b;

    final static hh a(byte param0, ci param1, int param2, ci param3, int param4) {
        RuntimeException var5 = null;
        hh stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -66) {
              if (rl.a(param4, 0, param2, param1)) {
                stackIn_7_0 = ak.a(param3.a((byte) -93, param4, param2), 21725);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (hh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("pe.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (hh) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4) {
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 >= 92) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            param0--;
            L2: while (true) {
              if ((param0 ^ -1) > -1) {
                break L0;
              } else {
                var9 = param1;
                var5 = var9;
                var6 = param2;
                var7 = param4;
                var9[var6] = (vg.c(var9[var6], 16711422) >> 921440353) + var7;
                param2++;
                param0--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5_ref);

            stackIn_10_1 = new StringBuilder().append("pe.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
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
        int stackIn_3_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
                  if (-1 < (var9 ^ -1)) {
                    var7_int = this.field_c[var7_int];
                    break L2;
                  } else {
                    var7_int++;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    dupTemp$0 = this.field_c[var7_int];
                    var10 = dupTemp$0;
                    if (0 <= dupTemp$0) {
                      break L4;
                    } else {
                      incrementValue$1 = param2;
                      param2++;
                      param1[incrementValue$1] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L5;
                    } else {
                      var7_int++;
                      break L5;
                    }
                  }
                  L6: {
                    dupTemp$2 = this.field_c[var7_int];
                    var10 = dupTemp$2;
                    if (-1 < (dupTemp$2 ^ -1)) {
                      incrementValue$3 = param2;
                      param2++;
                      param1[incrementValue$3] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L7;
                    }
                  }
                  L8: {
                    dupTemp$4 = this.field_c[var7_int];
                    var10 = dupTemp$4;
                    if (-1 < (dupTemp$4 ^ -1)) {
                      incrementValue$5 = param2;
                      param2++;
                      param1[incrementValue$5] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L9;
                    }
                  }
                  L10: {
                    dupTemp$6 = this.field_c[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 < 0) {
                      incrementValue$7 = param2;
                      param2++;
                      param1[incrementValue$7] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L11;
                    }
                  }
                  L12: {
                    dupTemp$8 = this.field_c[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param2;
                      param2++;
                      param1[incrementValue$9] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    dupTemp$10 = this.field_c[var7_int];
                    var10 = dupTemp$10;
                    if (-1 >= (dupTemp$10 ^ -1)) {
                      break L14;
                    } else {
                      incrementValue$11 = param2;
                      param2++;
                      param1[incrementValue$11] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L15;
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    dupTemp$12 = this.field_c[var7_int];
                    var10 = dupTemp$12;
                    if (dupTemp$12 < 0) {
                      incrementValue$13 = param2;
                      param2++;
                      param1[incrementValue$13] = (byte)(var10 ^ -1);
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
                    if ((var9 & 1) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    dupTemp$14 = this.field_c[var7_int];
                    var10 = dupTemp$14;
                    if (-1 < (dupTemp$14 ^ -1)) {
                      incrementValue$15 = param2;
                      param2++;
                      param1[incrementValue$15] = (byte)(var10 ^ -1);
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
                stackIn_64_0 = -param5 + var8 - -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var7);

            stackIn_67_1 = new StringBuilder().append("pe.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L19;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L20;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L20;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_68_0), stackIn_71_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_64_0;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        param1 = param1 & 8191;
        if (param0 > param1) {
          L0: {
            if (param1 >= 2048) {
              stackIn_8_0 = nj.field_r[-param1 + 4096];
              break L0;
            } else {
              stackIn_8_0 = nj.field_r[param1];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (-6145 < (param1 ^ -1)) {
              stackIn_4_0 = -nj.field_r[param1 - 4096];
              break L1;
            } else {
              stackIn_4_0 = -nj.field_r[-param1 + 8192];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = -82 % ((49 - param0) / 47);
    }

    private pe() throws Throwable {
        throw new Error();
    }

    static {
        field_a = "Try again";
    }
}

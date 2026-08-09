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
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            if ((param3 ^ -1) == param2) {
              stackIn_4_0 = 0;
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
                    dupTemp$0 = this.field_b[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L4;
                    } else {
                      incrementValue$1 = param1;
                      param1++;
                      param5[incrementValue$1] = (byte)(var10 ^ -1);
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
                    dupTemp$2 = this.field_b[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L6;
                    } else {
                      incrementValue$3 = param1;
                      param1++;
                      param5[incrementValue$3] = (byte)(var10 ^ -1);
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
                    dupTemp$4 = this.field_b[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L8;
                    } else {
                      incrementValue$5 = param1;
                      param1++;
                      param5[incrementValue$5] = (byte)(var10 ^ -1);
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
                    dupTemp$6 = this.field_b[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 >= 0) {
                      break L10;
                    } else {
                      incrementValue$7 = param1;
                      param1++;
                      param5[incrementValue$7] = (byte)(var10 ^ -1);
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
                    dupTemp$8 = this.field_b[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param1;
                      param1++;
                      param5[incrementValue$9] = (byte)(var10 ^ -1);
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
                    dupTemp$10 = this.field_b[var7_int];
                    var10 = dupTemp$10;
                    if (-1 < (dupTemp$10 ^ -1)) {
                      incrementValue$11 = param1;
                      param1++;
                      param5[incrementValue$11] = (byte)(var10 ^ -1);
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
                    dupTemp$12 = this.field_b[var7_int];
                    var10 = dupTemp$12;
                    if (-1 < (dupTemp$12 ^ -1)) {
                      incrementValue$13 = param1;
                      param1++;
                      param5[incrementValue$13] = (byte)(var10 ^ -1);
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
                    dupTemp$14 = this.field_b[var7_int];
                    var10 = dupTemp$14;
                    if (dupTemp$14 < 0) {
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
                stackIn_64_0 = -param4 + var8 + 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var7);

            stackIn_67_1 = new StringBuilder().append("ra.B(");

            if (param0 == null) {
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


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_68_0), stackIn_71_2 + ')');
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

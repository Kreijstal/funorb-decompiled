/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static int field_c;
    static int[] field_a;
    static cf field_d;
    private int[] field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            bm.a((byte) -11, -100);
            field_d = null;
            return;
        }
        field_d = null;
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
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            if (0 == param2) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var7_int = 0;
                param2 = param2 + param1;
                if (param3 == 13674) {
                  break L1;
                } else {
                  this.field_b = (int[]) null;
                  break L1;
                }
              }
              var8 = param4;
              L2: while (true) {
                L3: {
                  var9 = param0[var8];
                  if ((var9 ^ -1) <= -1) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = this.field_b[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_b[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L5;
                    } else {
                      incrementValue$1 = param1;
                      param1++;
                      param5[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param2 > param1) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if ((var9 & 64) != 0) {
                      var7_int = this.field_b[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_b[var7_int];
                    var10 = dupTemp$2;
                    if (-1 < (dupTemp$2 ^ -1)) {
                      incrementValue$3 = param1;
                      param1++;
                      param5[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param2 <= param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-1 != (var9 & 32 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_b[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L9;
                    } else {
                      incrementValue$5 = param1;
                      param1++;
                      param5[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param2 <= param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (0 != (var9 & 16)) {
                      var7_int = this.field_b[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_b[var7_int];
                    var10 = dupTemp$6;
                    if (-1 >= (dupTemp$6 ^ -1)) {
                      break L11;
                    } else {
                      incrementValue$7 = param1;
                      param1++;
                      param5[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param1 < param2) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L12: {
                    if ((8 & var9) == 0) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_b[var7_int];
                    var10 = dupTemp$8;
                    if (0 <= dupTemp$8) {
                      break L13;
                    } else {
                      incrementValue$9 = param1;
                      param1++;
                      param5[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param2 > param1) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if ((4 & var9) == 0) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_b[var7_int];
                    var10 = dupTemp$10;
                    if (0 > dupTemp$10) {
                      incrementValue$11 = param1;
                      param1++;
                      param5[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param2 > param1) {
                        var7_int = 0;
                        break L15;
                      } else {
                        return -param4 + 1 + var8;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (-1 == (2 & var9 ^ -1)) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_b[var7_int];
                    var10 = dupTemp$12;
                    if (-1 < (dupTemp$12 ^ -1)) {
                      incrementValue$13 = param1;
                      param1++;
                      param5[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param1 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (0 == (var9 & 1)) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L18;
                    }
                  }
                  dupTemp$14 = this.field_b[var7_int];
                  var10 = dupTemp$14;
                  if (-1 < (dupTemp$14 ^ -1)) {
                    incrementValue$15 = param1;
                    param1++;
                    param5[incrementValue$15] = (byte)(var10 ^ -1);
                    if (param1 >= param2) {
                      break L4;
                    } else {
                      var7_int = 0;
                      var8++;
                      continue L2;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
                stackIn_65_0 = -param4 + 1 + var8;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var7);

            stackIn_68_1 = new StringBuilder().append("bm.B(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L19;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L20;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L20;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_69_0), stackIn_72_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_65_0;
        }
    }

    final static vn[] a(byte param0, int param1) {
        vn[] var2;
        vn[] var3;
        var3 = new vn[9];
        var2 = var3;
        if (param0 >= -67) {
          bm.a((byte) 106, 78);
          var3[4] = qk.c(param1, (byte) -71, 64);
          return var2;
        } else {
          var3[4] = qk.c(param1, (byte) -71, 64);
          return var2;
        }
    }

    private bm() throws Throwable {
        throw new Error();
    }

    static {
        field_a = new int[16];
    }
}

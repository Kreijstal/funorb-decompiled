/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static int field_c;
    static int[] field_a;
    static cf field_d;
    private int[] field_b;

    public static void a() {
        field_a = null;
        field_d = null;
    }

    final int a(byte[] param0, int param1, int param2, int param3, int param4, byte[] param5) {
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
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            if (0 == param2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var7_int = 0;
                param2 = param2 + param1;
                if (param3 == 13674) {
                  break L1;
                } else {
                  ((bm) this).field_b = null;
                  break L1;
                }
              }
              var8 = param4;
              L2: while (true) {
                L3: {
                  var9 = param0[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = ((bm) this).field_b[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((bm) this).field_b[var7_int];
                    if (((bm) this).field_b[var7_int] >= 0) {
                      break L5;
                    } else {
                      int incrementValue$7 = param1;
                      param1++;
                      param5[incrementValue$7] = (byte)(~var10);
                      if (param2 > param1) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if ((var9 & 64) != -1) {
                      var7_int = ((bm) this).field_b[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((bm) this).field_b[var7_int];
                    if (-1 > ((bm) this).field_b[var7_int]) {
                      int incrementValue$8 = param1;
                      param1++;
                      param5[incrementValue$8] = (byte)var10;
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
                    if (-1 != (var9 & 32)) {
                      var7_int = ((bm) this).field_b[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((bm) this).field_b[var7_int];
                    if (((bm) this).field_b[var7_int] >= 0) {
                      break L9;
                    } else {
                      int incrementValue$9 = param1;
                      param1++;
                      param5[incrementValue$9] = (byte)(~var10);
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
                      var7_int = ((bm) this).field_b[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((bm) this).field_b[var7_int];
                    if (((bm) this).field_b[var7_int] >= 0) {
                      break L11;
                    } else {
                      int incrementValue$10 = param1;
                      param1++;
                      param5[incrementValue$10] = (byte)(~var10);
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
                      var7_int = ((bm) this).field_b[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((bm) this).field_b[var7_int];
                    if (0 <= ((bm) this).field_b[var7_int]) {
                      break L13;
                    } else {
                      int incrementValue$11 = param1;
                      param1++;
                      param5[incrementValue$11] = (byte)(~var10);
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
                      var7_int = ((bm) this).field_b[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((bm) this).field_b[var7_int];
                    if (0 > ((bm) this).field_b[var7_int]) {
                      int incrementValue$12 = param1;
                      param1++;
                      param5[incrementValue$12] = (byte)(~var10);
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
                    if (-1 == (2 & var9)) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = ((bm) this).field_b[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((bm) this).field_b[var7_int];
                    if (-1 > ((bm) this).field_b[var7_int]) {
                      int incrementValue$13 = param1;
                      param1++;
                      param5[incrementValue$13] = (byte)(~var10);
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
                      var7_int = ((bm) this).field_b[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((bm) this).field_b[var7_int];
                    if (((bm) this).field_b[var7_int] >= 0) {
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_63_0 = -param4 + 1 + var8;
                stackIn_64_0 = stackOut_63_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("bm.B(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L20;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L20;
            }
          }
          L21: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param5 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L21;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L21;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 41);
        }
        return stackIn_64_0;
    }

    final static vn[] a(byte param0, int param1) {
        vn[] var2 = null;
        vn[] var3 = null;
        var3 = new vn[9];
        var2 = var3;
        if (param0 >= -67) {
          vn[] discarded$2 = bm.a((byte) 106, 78);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[16];
    }
}

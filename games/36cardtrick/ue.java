/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private int[] field_c;
    static int field_d;
    static bk field_b;
    static qk field_a;

    public static void a(int param0) {
        if (param0 != 4) {
            ue.a(-20);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2) {
        s.field_c = param0;
        dl.field_g = param2;
    }

    final int a(int param0, byte[] param1, byte[] param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_67_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var11 = Main.field_T;
        try {
          L0: {
            if (param0 != 0) {
              L1: {
                var7_int = 0;
                param0 = param0 + param3;
                if (param4 > 95) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              var8 = param5;
              L2: while (true) {
                L3: {
                  var9 = param2[var8];
                  if (0 <= var9) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = ((ue) this).field_c[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((ue) this).field_c[var7_int];
                    if (((ue) this).field_c[var7_int] >= 0) {
                      break L5;
                    } else {
                      int incrementValue$8 = param3;
                      param3++;
                      param1[incrementValue$8] = (byte)(~var10);
                      if (param3 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (0 != (64 & var9)) {
                      var7_int = ((ue) this).field_c[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((ue) this).field_c[var7_int];
                    if (((ue) this).field_c[var7_int] >= 0) {
                      break L7;
                    } else {
                      int incrementValue$9 = param3;
                      param3++;
                      param1[incrementValue$9] = (byte)var10;
                      if (param3 < param0) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if (-1 == (var9 & 32)) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = ((ue) this).field_c[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((ue) this).field_c[var7_int];
                    if (((ue) this).field_c[var7_int] < 0) {
                      int incrementValue$10 = param3;
                      param3++;
                      param1[incrementValue$10] = (byte)(~var10);
                      if (param0 > param3) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var9 & 16) != 0) {
                      var7_int = ((ue) this).field_c[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((ue) this).field_c[var7_int];
                    if (0 <= ((ue) this).field_c[var7_int]) {
                      break L11;
                    } else {
                      int incrementValue$11 = param3;
                      param3++;
                      param1[incrementValue$11] = (byte)var10;
                      if (param3 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (-1 == (8 & var9)) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = ((ue) this).field_c[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((ue) this).field_c[var7_int];
                    if (((ue) this).field_c[var7_int] >= 0) {
                      break L13;
                    } else {
                      int incrementValue$12 = param3;
                      param3++;
                      param1[incrementValue$12] = (byte)var10;
                      if (param0 > param3) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (-1 != (var9 & 4)) {
                      var7_int = ((ue) this).field_c[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((ue) this).field_c[var7_int];
                    if (((ue) this).field_c[var7_int] >= 0) {
                      break L15;
                    } else {
                      int incrementValue$13 = param3;
                      param3++;
                      param1[incrementValue$13] = (byte)(~var10);
                      if (param3 < param0) {
                        var7_int = 0;
                        break L15;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L16: {
                    if ((var9 & 2) == 0) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = ((ue) this).field_c[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((ue) this).field_c[var7_int];
                    if (((ue) this).field_c[var7_int] < 0) {
                      int incrementValue$14 = param3;
                      param3++;
                      param1[incrementValue$14] = (byte)(~var10);
                      if (param0 > param3) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return 1 + (var8 - param5);
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
                      var7_int = ((ue) this).field_c[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((ue) this).field_c[var7_int];
                    if (((ue) this).field_c[var7_int] >= 0) {
                      var8++;
                      break L19;
                    } else {
                      int incrementValue$15 = param3;
                      param3++;
                      param1[incrementValue$15] = (byte)(~var10);
                      if (param0 > param3) {
                        var7_int = 0;
                        var8++;
                        break L19;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_67_0 = 1 + (var8 - param5);
                stackIn_68_0 = stackOut_67_0;
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
          L20: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("ue.B(").append(param0).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L20;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L20;
            }
          }
          L21: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(44);
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
              break L21;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L21;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_68_0;
    }

    private ue() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new bk();
    }
}

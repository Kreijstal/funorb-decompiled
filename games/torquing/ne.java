/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ne {
    private int[] field_c;
    static int[] field_d;
    static Calendar field_b;
    static int[] field_a;

    final int a(byte[] param0, boolean param1, int param2, byte[] param3, int param4, int param5) {
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
        int stackIn_6_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_69_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var11 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_c = (int[]) null;
                break L1;
              }
            }
            if (0 == param5) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param5 = param5 + param4;
              var7_int = 0;
              var8 = param2;
              L2: while (true) {
                L3: {
                  var9 = param3[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = this.field_c[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] >= 0) {
                      break L5;
                    } else {
                      incrementValue$8 = param4;
                      param4++;
                      param0[incrementValue$8] = (byte)(var10 ^ -1);
                      if (param4 < param5) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if ((var9 & 64) == 0) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      incrementValue$9 = param4;
                      param4++;
                      param0[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param5 > param4) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (0 == (32 & var9)) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      incrementValue$10 = param4;
                      param4++;
                      param0[incrementValue$10] = (byte)(var10 ^ -1);
                      if (param5 > param4) {
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
                    if (0 == (var9 & 16)) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] >= 0) {
                      break L11;
                    } else {
                      incrementValue$11 = param4;
                      param4++;
                      param0[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param4 < param5) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L12: {
                    if ((var9 & 8) == 0) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      incrementValue$12 = param4;
                      param4++;
                      param0[incrementValue$12] = (byte)(var10 ^ -1);
                      if (param4 < param5) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if ((var9 & 4) == 0) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      incrementValue$13 = param4;
                      param4++;
                      param0[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param5 <= param4) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if ((2 & var9) == 0) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    var10 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      incrementValue$14 = param4;
                      param4++;
                      param0[incrementValue$14] = (byte)(var10 ^ -1);
                      if (param4 < param5) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return 1 + (var8 - param2);
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((var9 & 1) == 0) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L18;
                    }
                  }
                  var10 = this.field_c[var7_int];
                  if (-1 < (this.field_c[var7_int] ^ -1)) {
                    incrementValue$15 = param4;
                    param4++;
                    param0[incrementValue$15] = (byte)(var10 ^ -1);
                    if (param4 < param5) {
                      var7_int = 0;
                      var8++;
                      continue L2;
                    } else {
                      break L4;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
                stackOut_69_0 = 1 + (var8 - param2);
                stackIn_70_0 = stackOut_69_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) (var7);
            stackOut_71_1 = new StringBuilder().append("ne.A(");
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
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
          L20: {
            stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L20;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L20;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_70_0;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (param1 == 0) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var3 = (CharSequence) ((Object) var2);
                if (0L != mm.a(var3, (byte) 116)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("ne.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 4512) {
            field_b = (Calendar) null;
        }
        field_b = null;
        field_a = null;
        field_d = null;
    }

    private ne() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_d = new int[256];
            var1 = 0;
            L0: while (true) {
              if ((var1 ^ -1) <= -257) {
                field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
                field_a = new int[12];
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if ((var2 ^ -1) <= -9) {
                    field_d[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((var0 & 1 ^ -1) == -2) {
                      var0 = -306674912 ^ var0 >>> 505932129;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}

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
        int stackIn_6_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
              stackIn_6_0 = 0;
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
                    dupTemp$0 = this.field_c[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L5;
                    } else {
                      incrementValue$1 = param4;
                      param4++;
                      param0[incrementValue$1] = (byte)(var10 ^ -1);
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
                    dupTemp$2 = this.field_c[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 < 0) {
                      incrementValue$3 = param4;
                      param4++;
                      param0[incrementValue$3] = (byte)(var10 ^ -1);
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
                    dupTemp$4 = this.field_c[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 < 0) {
                      incrementValue$5 = param4;
                      param4++;
                      param0[incrementValue$5] = (byte)(var10 ^ -1);
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
                    dupTemp$6 = this.field_c[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 >= 0) {
                      break L11;
                    } else {
                      incrementValue$7 = param4;
                      param4++;
                      param0[incrementValue$7] = (byte)(var10 ^ -1);
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
                    dupTemp$8 = this.field_c[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param4;
                      param4++;
                      param0[incrementValue$9] = (byte)(var10 ^ -1);
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
                    dupTemp$10 = this.field_c[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 < 0) {
                      incrementValue$11 = param4;
                      param4++;
                      param0[incrementValue$11] = (byte)(var10 ^ -1);
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
                    dupTemp$12 = this.field_c[var7_int];
                    var10 = dupTemp$12;
                    if (dupTemp$12 < 0) {
                      incrementValue$13 = param4;
                      param4++;
                      param0[incrementValue$13] = (byte)(var10 ^ -1);
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
                  dupTemp$14 = this.field_c[var7_int];
                  var10 = dupTemp$14;
                  if (-1 < (dupTemp$14 ^ -1)) {
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
                stackIn_70_0 = 1 + (var8 - param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var7);

            stackIn_73_1 = new StringBuilder().append("ne.A(");

            if (param0 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L19;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L20;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L20;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_74_0), stackIn_77_2 + ',' + param4 + ',' + param5 + ')');
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("ne.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
            int var0;
            int var1;
            int var2;
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

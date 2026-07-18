/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static int field_c;
    static int[] field_b;
    static String field_g;
    private int[] field_f;
    static eb field_a;
    static int field_d;
    static int[] field_e;

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (ml.b(-107)) {
              boolean discarded$7 = b.field_n.a(em.field_q, false, true, lc.field_t);
              b.field_n.o(117);
              var1_int = 0;
              L1: while (true) {
                if (!nf.e(32722)) {
                  break L0;
                } else {
                  boolean discarded$8 = b.field_n.a(od.field_k, true, ob.field_K);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (mg.field_k == null) {
                  break L2;
                } else {
                  if (mg.field_k.field_e) {
                    lb.a(true);
                    b.field_n.b((byte) 74, (pj) (Object) new gg(b.field_n, hh.field_d));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "cf.B(" + 109 + ')');
        }
    }

    private cf() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, int param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
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
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (0 == param5) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var7_int = 0;
                if (param2 == -1) {
                  break L1;
                } else {
                  field_e = null;
                  break L1;
                }
              }
              param5 = param5 + param3;
              var8 = param0;
              L2: while (true) {
                L3: {
                  var9 = param4[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = ((cf) this).field_f[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((cf) this).field_f[var7_int];
                    if (((cf) this).field_f[var7_int] < 0) {
                      int incrementValue$8 = param3;
                      param3++;
                      param1[incrementValue$8] = (byte)var10;
                      if (param3 >= param5) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (-1 == (64 & var9)) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = ((cf) this).field_f[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((cf) this).field_f[var7_int];
                    if (((cf) this).field_f[var7_int] >= 0) {
                      break L7;
                    } else {
                      int incrementValue$9 = param3;
                      param3++;
                      param1[incrementValue$9] = (byte)(~var10);
                      if (param5 > param3) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if ((var9 & 32) == 0) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = ((cf) this).field_f[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((cf) this).field_f[var7_int];
                    if (0 <= ((cf) this).field_f[var7_int]) {
                      break L9;
                    } else {
                      int incrementValue$10 = param3;
                      param3++;
                      param1[incrementValue$10] = (byte)var10;
                      if (param5 > param3) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if (-1 == (16 & var9)) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = ((cf) this).field_f[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((cf) this).field_f[var7_int];
                    if (((cf) this).field_f[var7_int] < 0) {
                      int incrementValue$11 = param3;
                      param3++;
                      param1[incrementValue$11] = (byte)var10;
                      if (param5 > param3) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-1 == (var9 & 8)) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = ((cf) this).field_f[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((cf) this).field_f[var7_int];
                    if (((cf) this).field_f[var7_int] < 0) {
                      int incrementValue$12 = param3;
                      param3++;
                      param1[incrementValue$12] = (byte)(~var10);
                      if (param5 <= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (0 != (4 & var9)) {
                      var7_int = ((cf) this).field_f[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((cf) this).field_f[var7_int];
                    if (((cf) this).field_f[var7_int] >= 0) {
                      break L15;
                    } else {
                      int incrementValue$13 = param3;
                      param3++;
                      param1[incrementValue$13] = (byte)var10;
                      if (param5 > param3) {
                        var7_int = 0;
                        break L15;
                      } else {
                        return 1 + var8 - param0;
                      }
                    }
                  }
                  L16: {
                    if (-1 == (2 & var9)) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = ((cf) this).field_f[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((cf) this).field_f[var7_int];
                    if (0 <= ((cf) this).field_f[var7_int]) {
                      break L17;
                    } else {
                      int incrementValue$14 = param3;
                      param3++;
                      param1[incrementValue$14] = (byte)(~var10);
                      if (param3 >= param5) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if ((1 & var9) != 0) {
                      var7_int = ((cf) this).field_f[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((cf) this).field_f[var7_int];
                    if (((cf) this).field_f[var7_int] < 0) {
                      int incrementValue$15 = param3;
                      param3++;
                      param1[incrementValue$15] = (byte)(~var10);
                      if (param5 > param3) {
                        var7_int = 0;
                        var8++;
                        break L19;
                      } else {
                        break L4;
                      }
                    } else {
                      var8++;
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_69_0 = 1 + var8 - param0;
                stackIn_70_0 = stackOut_69_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var7;
            stackOut_71_1 = new StringBuilder().append("cf.C(").append(param0).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L20;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L20;
            }
          }
          L21: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param4 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L21;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L21;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param5 + ')');
        }
        return stackIn_70_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_g = "TIME";
        field_e = new int[8192];
    }
}

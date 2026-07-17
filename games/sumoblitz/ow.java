/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ow {
    private int[] field_c;
    static jn field_f;
    static String field_a;
    static String field_b;
    static int field_e;
    static byte[][] field_d;

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_65_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (0 != param4) {
              param4 = param4 + param0;
              var7_int = 0;
              var9 = -35 / ((52 - param3) / 59);
              var8 = param1;
              L1: while (true) {
                L2: {
                  var10 = param5[var8];
                  if (var10 < 0) {
                    var7_int = ((ow) this).field_c[var7_int];
                    break L2;
                  } else {
                    var7_int++;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var11 = ((ow) this).field_c[var7_int];
                    if (((ow) this).field_c[var7_int] < 0) {
                      int incrementValue$8 = param0;
                      param0++;
                      param2[incrementValue$8] = (byte)var11;
                      if (param4 > param0) {
                        var7_int = 0;
                        break L4;
                      } else {
                        break L3;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (-1 == (64 & var10)) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = ((ow) this).field_c[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    var11 = ((ow) this).field_c[var7_int];
                    if (((ow) this).field_c[var7_int] >= 0) {
                      break L6;
                    } else {
                      int incrementValue$9 = param0;
                      param0++;
                      param2[incrementValue$9] = (byte)var11;
                      if (param0 >= param4) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (-1 == (var10 & 32)) {
                      var7_int++;
                      break L7;
                    } else {
                      var7_int = ((ow) this).field_c[var7_int];
                      break L7;
                    }
                  }
                  L8: {
                    var11 = ((ow) this).field_c[var7_int];
                    if (0 <= ((ow) this).field_c[var7_int]) {
                      break L8;
                    } else {
                      int incrementValue$10 = param0;
                      param0++;
                      param2[incrementValue$10] = (byte)(~var11);
                      if (param0 < param4) {
                        var7_int = 0;
                        break L8;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L9: {
                    if ((16 & var10) != 0) {
                      var7_int = ((ow) this).field_c[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    var11 = ((ow) this).field_c[var7_int];
                    if (((ow) this).field_c[var7_int] >= 0) {
                      break L10;
                    } else {
                      int incrementValue$11 = param0;
                      param0++;
                      param2[incrementValue$11] = (byte)var11;
                      if (param0 >= param4) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (-1 != (8 & var10)) {
                      var7_int = ((ow) this).field_c[var7_int];
                      break L11;
                    } else {
                      var7_int++;
                      break L11;
                    }
                  }
                  L12: {
                    var11 = ((ow) this).field_c[var7_int];
                    if (((ow) this).field_c[var7_int] >= 0) {
                      break L12;
                    } else {
                      int incrementValue$12 = param0;
                      param0++;
                      param2[incrementValue$12] = (byte)(~var11);
                      if (param0 < param4) {
                        var7_int = 0;
                        break L12;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L13: {
                    if ((var10 & 4) != 0) {
                      var7_int = ((ow) this).field_c[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    var11 = ((ow) this).field_c[var7_int];
                    if (((ow) this).field_c[var7_int] < 0) {
                      int incrementValue$13 = param0;
                      param0++;
                      param2[incrementValue$13] = (byte)(~var11);
                      if (param4 > param0) {
                        var7_int = 0;
                        break L14;
                      } else {
                        return -param1 + var8 + 1;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((2 & var10) != 0) {
                      var7_int = ((ow) this).field_c[var7_int];
                      break L15;
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    var11 = ((ow) this).field_c[var7_int];
                    if (((ow) this).field_c[var7_int] >= 0) {
                      break L16;
                    } else {
                      int incrementValue$14 = param0;
                      param0++;
                      param2[incrementValue$14] = (byte)(~var11);
                      if (param4 <= param0) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if ((1 & var10) != 0) {
                      var7_int = ((ow) this).field_c[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    var11 = ((ow) this).field_c[var7_int];
                    if (((ow) this).field_c[var7_int] < 0) {
                      int incrementValue$15 = param0;
                      param0++;
                      param2[incrementValue$15] = (byte)(~var11);
                      if (param0 < param4) {
                        var7_int = 0;
                        var8++;
                        break L18;
                      } else {
                        break L3;
                      }
                    } else {
                      var8++;
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackOut_65_0 = -param1 + var8 + 1;
                stackIn_66_0 = stackOut_65_0;
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
          L19: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("ow.C(").append(param0).append(44).append(param1).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param2 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L19;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L19;
            }
          }
          L20: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param5 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L20;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L20;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 41);
        }
        return stackIn_66_0;
    }

    private ow() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, ki param1, wi param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            ha.field_e = param1;
            pn.field_n = "";
            if (param0 == -18527) {
              break L0;
            } else {
              ow.a((byte) 19);
              break L0;
            }
          }
          L1: {
            qn.field_e = param2;
            if (!en.field_h.startsWith("win")) {
              if (en.field_h.startsWith("linux")) {
                pn.field_n = pn.field_n + "linux/";
                break L1;
              } else {
                if (!en.field_h.startsWith("mac")) {
                  break L1;
                } else {
                  pn.field_n = pn.field_n + "macos/";
                  break L1;
                }
              }
            } else {
              pn.field_n = pn.field_n + "windows/";
              break L1;
            }
          }
          if (qn.field_e.field_t) {
            pn.field_n = pn.field_n + "msjava/";
            return;
          } else {
            L2: {
              if (en.field_d.startsWith("amd64")) {
                break L2;
              } else {
                if (!en.field_d.startsWith("x86_64")) {
                  L3: {
                    if (en.field_d.startsWith("i386")) {
                      break L3;
                    } else {
                      if (en.field_d.startsWith("i486")) {
                        break L3;
                      } else {
                        if (en.field_d.startsWith("i586")) {
                          break L3;
                        } else {
                          if (!en.field_d.startsWith("x86")) {
                            if (en.field_d.startsWith("ppc")) {
                              pn.field_n = pn.field_n + "ppc/";
                              return;
                            } else {
                              pn.field_n = pn.field_n + "universal/";
                              return;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  pn.field_n = pn.field_n + "x86/";
                  return;
                } else {
                  break L2;
                }
              }
            }
            pn.field_n = pn.field_n + "x86_64/";
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("ow.B(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L4;
            }
          }
          L5: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    public static void a(byte param0) {
        if (param0 != 123) {
          field_f = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading fonts";
        field_f = new jn();
        field_b = "Email: ";
        field_d = new byte[250][];
    }
}

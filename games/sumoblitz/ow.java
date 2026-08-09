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
        int var12 = 0;
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
                    var11 = dupTemp$0;
                    if (dupTemp$0 < 0) {
                      incrementValue$1 = param0;
                      param0++;
                      param2[incrementValue$1] = (byte)(var11 ^ -1);
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
                    if (-1 == (64 & var10 ^ -1)) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    dupTemp$2 = this.field_c[var7_int];
                    var11 = dupTemp$2;
                    if (-1 >= (dupTemp$2 ^ -1)) {
                      break L6;
                    } else {
                      incrementValue$3 = param0;
                      param0++;
                      param2[incrementValue$3] = (byte)(var11 ^ -1);
                      if (param0 >= param4) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (-1 == (var10 & 32 ^ -1)) {
                      var7_int++;
                      break L7;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L7;
                    }
                  }
                  L8: {
                    dupTemp$4 = this.field_c[var7_int];
                    var11 = dupTemp$4;
                    if (0 <= dupTemp$4) {
                      break L8;
                    } else {
                      incrementValue$5 = param0;
                      param0++;
                      param2[incrementValue$5] = (byte)(var11 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    dupTemp$6 = this.field_c[var7_int];
                    var11 = dupTemp$6;
                    if (dupTemp$6 >= 0) {
                      break L10;
                    } else {
                      incrementValue$7 = param0;
                      param0++;
                      param2[incrementValue$7] = (byte)(var11 ^ -1);
                      if (param0 >= param4) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (-1 != (8 & var10 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L11;
                    } else {
                      var7_int++;
                      break L11;
                    }
                  }
                  L12: {
                    dupTemp$8 = this.field_c[var7_int];
                    var11 = dupTemp$8;
                    if (dupTemp$8 >= 0) {
                      break L12;
                    } else {
                      incrementValue$9 = param0;
                      param0++;
                      param2[incrementValue$9] = (byte)(var11 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    dupTemp$10 = this.field_c[var7_int];
                    var11 = dupTemp$10;
                    if (dupTemp$10 < 0) {
                      incrementValue$11 = param0;
                      param0++;
                      param2[incrementValue$11] = (byte)(var11 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L15;
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    dupTemp$12 = this.field_c[var7_int];
                    var11 = dupTemp$12;
                    if (-1 >= (dupTemp$12 ^ -1)) {
                      break L16;
                    } else {
                      incrementValue$13 = param0;
                      param0++;
                      param2[incrementValue$13] = (byte)(var11 ^ -1);
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
                      var7_int = this.field_c[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    dupTemp$14 = this.field_c[var7_int];
                    var11 = dupTemp$14;
                    if (dupTemp$14 < 0) {
                      incrementValue$15 = param0;
                      param0++;
                      param2[incrementValue$15] = (byte)(var11 ^ -1);
                      if (param0 < param4) {
                        var7_int = 0;
                        break L18;
                      } else {
                        break L3;
                      }
                    } else {
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackIn_64_0 = -param1 + var8 + 1;
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

            stackIn_67_1 = new StringBuilder().append("ow.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param3).append(',').append(param4).append(',');

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
          throw qo.a((Throwable) ((Object) stackIn_68_0), stackIn_71_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_64_0;
        }
    }

    private ow() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, ki param1, wi param2) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
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
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("ow.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 123) {
          field_f = (jn) null;
          field_a = null;
          field_d = (byte[][]) null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = (byte[][]) null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    static {
        field_a = "Loading fonts";
        field_f = new jn();
        field_b = "Email: ";
        field_d = new byte[250][];
    }
}

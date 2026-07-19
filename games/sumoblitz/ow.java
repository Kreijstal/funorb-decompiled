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
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_76_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
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
                  L3: {
                    var10 = param5[var8];
                    if (var10 < 0) {
                      break L3;
                    } else {
                      var7_int++;
                      if (var12 != 0) {
                        break L2;
                      } else {
                        if (var12 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var7_int = this.field_c[var7_int];
                  break L2;
                }
                L4: {
                  L5: {
                    var11 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      L6: {
                        incrementValue$8 = param0;
                        param0++;
                        param2[incrementValue$8] = (byte)(var11 ^ -1);
                        if (param4 > param0) {
                          break L6;
                        } else {
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (-1 != (64 & var10 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      if (var12 == 0) {
                        break L7;
                      } else {
                        var7_int++;
                        break L7;
                      }
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    var11 = this.field_c[var7_int];
                    if (-1 >= (this.field_c[var7_int] ^ -1)) {
                      break L8;
                    } else {
                      incrementValue$9 = param0;
                      param0++;
                      param2[incrementValue$9] = (byte)(var11 ^ -1);
                      if (param0 >= param4) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (-1 != (var10 & 32 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      if (var12 == 0) {
                        break L9;
                      } else {
                        var7_int++;
                        break L9;
                      }
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    var11 = this.field_c[var7_int];
                    if (0 <= this.field_c[var7_int]) {
                      break L10;
                    } else {
                      L11: {
                        incrementValue$10 = param0;
                        param0++;
                        param2[incrementValue$10] = (byte)(var11 ^ -1);
                        if (param0 < param4) {
                          break L11;
                        } else {
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var7_int = 0;
                      break L10;
                    }
                  }
                  L12: {
                    L13: {
                      if ((16 & var10) != 0) {
                        break L13;
                      } else {
                        var7_int++;
                        if (var12 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var7_int = this.field_c[var7_int];
                    break L12;
                  }
                  L14: {
                    var11 = this.field_c[var7_int];
                    if (this.field_c[var7_int] >= 0) {
                      break L14;
                    } else {
                      incrementValue$11 = param0;
                      param0++;
                      param2[incrementValue$11] = (byte)(var11 ^ -1);
                      if (param0 >= param4) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    L16: {
                      if (-1 != (8 & var10 ^ -1)) {
                        break L16;
                      } else {
                        var7_int++;
                        if (var12 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    var7_int = this.field_c[var7_int];
                    break L15;
                  }
                  L17: {
                    var11 = this.field_c[var7_int];
                    if (this.field_c[var7_int] >= 0) {
                      break L17;
                    } else {
                      L18: {
                        incrementValue$12 = param0;
                        param0++;
                        param2[incrementValue$12] = (byte)(var11 ^ -1);
                        if (param0 < param4) {
                          break L18;
                        } else {
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var7_int = 0;
                      break L17;
                    }
                  }
                  L19: {
                    L20: {
                      if ((var10 & 4) != 0) {
                        break L20;
                      } else {
                        var7_int++;
                        if (var12 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var7_int = this.field_c[var7_int];
                    break L19;
                  }
                  L21: {
                    var11 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      L22: {
                        incrementValue$13 = param0;
                        param0++;
                        param2[incrementValue$13] = (byte)(var11 ^ -1);
                        if (param4 > param0) {
                          break L22;
                        } else {
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var7_int = 0;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L23: {
                    L24: {
                      if ((2 & var10) != 0) {
                        break L24;
                      } else {
                        var7_int++;
                        if (var12 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    var7_int = this.field_c[var7_int];
                    break L23;
                  }
                  L25: {
                    var11 = this.field_c[var7_int];
                    if (-1 >= (this.field_c[var7_int] ^ -1)) {
                      break L25;
                    } else {
                      incrementValue$14 = param0;
                      param0++;
                      param2[incrementValue$14] = (byte)(var11 ^ -1);
                      if (param4 <= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L25;
                      }
                    }
                  }
                  L26: {
                    L27: {
                      if ((1 & var10) != 0) {
                        break L27;
                      } else {
                        var7_int++;
                        if (var12 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    var7_int = this.field_c[var7_int];
                    break L26;
                  }
                  L28: {
                    var11 = this.field_c[var7_int];
                    if (this.field_c[var7_int] < 0) {
                      L29: {
                        incrementValue$15 = param0;
                        param0++;
                        param2[incrementValue$15] = (byte)(var11 ^ -1);
                        if (param0 < param4) {
                          break L29;
                        } else {
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L29;
                          }
                        }
                      }
                      var7_int = 0;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackOut_76_0 = -param1 + var8 + 1;
                stackIn_77_0 = stackOut_76_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var7 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var7);
            stackOut_78_1 = new StringBuilder().append("ow.C(").append(param0).append(',').append(param1).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L30;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L30;
            }
          }
          L31: {
            stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param5 == null) {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L31;
            } else {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L31;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_77_0;
        }
    }

    private ow() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, ki param1, wi param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ha.field_e = param1;
              pn.field_n = "";
              if (param0 == -18527) {
                break L1;
              } else {
                ow.a((byte) 19);
                break L1;
              }
            }
            L2: {
              L3: {
                qn.field_e = param2;
                if (!en.field_h.startsWith("win")) {
                  break L3;
                } else {
                  pn.field_n = pn.field_n + "windows/";
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (en.field_h.startsWith("linux")) {
                  break L4;
                } else {
                  if (!en.field_h.startsWith("mac")) {
                    break L2;
                  } else {
                    pn.field_n = pn.field_n + "macos/";
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              pn.field_n = pn.field_n + "linux/";
              break L2;
            }
            L5: {
              if (qn.field_e.field_t) {
                break L5;
              } else {
                L6: {
                  L7: {
                    L8: {
                      if (en.field_d.startsWith("amd64")) {
                        break L8;
                      } else {
                        if (!en.field_d.startsWith("x86_64")) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    pn.field_n = pn.field_n + "x86_64/";
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                  L9: {
                    L10: {
                      if (en.field_d.startsWith("i386")) {
                        break L10;
                      } else {
                        if (en.field_d.startsWith("i486")) {
                          break L10;
                        } else {
                          if (en.field_d.startsWith("i586")) {
                            break L10;
                          } else {
                            if (!en.field_d.startsWith("x86")) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    }
                    pn.field_n = pn.field_n + "x86/";
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L9;
                    }
                  }
                  L11: {
                    if (en.field_d.startsWith("ppc")) {
                      break L11;
                    } else {
                      pn.field_n = pn.field_n + "universal/";
                      if (var4 == 0) {
                        break L6;
                      } else {
                        break L11;
                      }
                    }
                  }
                  pn.field_n = pn.field_n + "ppc/";
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
                break L0;
              }
            }
            pn.field_n = pn.field_n + "msjava/";
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("ow.B(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          L13: {
            stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L13;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L13;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
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

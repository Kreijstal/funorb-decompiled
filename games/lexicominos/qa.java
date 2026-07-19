/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static String field_b;
    private int[] field_a;
    static la field_c;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 < 42) {
            qa.a(101);
        }
    }

    final static void b(int param0) {
        wb.field_g = null;
        af.field_a = null;
        if (param0 != 0) {
            qa.b(-30);
        }
    }

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
        int stackIn_3_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_77_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if ((param0 ^ -1) != param1) {
              var7_int = 0;
              param0 = param0 + param3;
              var8 = param4;
              L1: while (true) {
                L2: {
                  L3: {
                    var9 = param2[var8];
                    if (-1 < (var9 ^ -1)) {
                      break L3;
                    } else {
                      var7_int++;
                      if (var11 != 0) {
                        break L2;
                      } else {
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var7_int = this.field_a[var7_int];
                  break L2;
                }
                L4: {
                  L5: {
                    var10 = this.field_a[var7_int];
                    if (-1 < (this.field_a[var7_int] ^ -1)) {
                      incrementValue$8 = param3;
                      param3++;
                      param5[incrementValue$8] = (byte)(var10 ^ -1);
                      if (param3 >= param0) {
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
                    if ((var9 & 64) != 0) {
                      var7_int = this.field_a[var7_int];
                      if (var11 == 0) {
                        break L6;
                      } else {
                        var7_int++;
                        break L6;
                      }
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = this.field_a[var7_int];
                    if (-1 < (this.field_a[var7_int] ^ -1)) {
                      L8: {
                        incrementValue$9 = param3;
                        param3++;
                        param5[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param0 > param3) {
                          break L8;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var7_int = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L9: {
                    if ((var9 & 32) != 0) {
                      var7_int = this.field_a[var7_int];
                      if (var11 == 0) {
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
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] >= 0) {
                      break L10;
                    } else {
                      L11: {
                        incrementValue$10 = param3;
                        param3++;
                        param5[incrementValue$10] = (byte)(var10 ^ -1);
                        if (param3 < param0) {
                          break L11;
                        } else {
                          if (var11 == 0) {
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
                      if ((var9 & 16) != 0) {
                        break L13;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L12;
                  }
                  L14: {
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] < 0) {
                      L15: {
                        incrementValue$11 = param3;
                        param3++;
                        param5[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param3 < param0) {
                          break L15;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var7_int = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L16: {
                    L17: {
                      if (-1 != (var9 & 8 ^ -1)) {
                        break L17;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L16;
                  }
                  L18: {
                    var10 = this.field_a[var7_int];
                    if (-1 >= (this.field_a[var7_int] ^ -1)) {
                      break L18;
                    } else {
                      L19: {
                        incrementValue$12 = param3;
                        param3++;
                        param5[incrementValue$12] = (byte)(var10 ^ -1);
                        if (param0 > param3) {
                          break L19;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var7_int = 0;
                      break L18;
                    }
                  }
                  L20: {
                    L21: {
                      if ((var9 & 4) != 0) {
                        break L21;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L20;
                  }
                  L22: {
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] >= 0) {
                      break L22;
                    } else {
                      incrementValue$13 = param3;
                      param3++;
                      param5[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param0 <= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (0 != (var9 & 2)) {
                      var7_int = this.field_a[var7_int];
                      if (var11 == 0) {
                        break L23;
                      } else {
                        var7_int++;
                        break L23;
                      }
                    } else {
                      var7_int++;
                      break L23;
                    }
                  }
                  L24: {
                    var10 = this.field_a[var7_int];
                    if (-1 < (this.field_a[var7_int] ^ -1)) {
                      L25: {
                        incrementValue$14 = param3;
                        param3++;
                        param5[incrementValue$14] = (byte)(var10 ^ -1);
                        if (param0 > param3) {
                          break L25;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L25;
                          }
                        }
                      }
                      var7_int = 0;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L26: {
                    L27: {
                      if (-1 != (var9 & 1 ^ -1)) {
                        break L27;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L26;
                  }
                  L28: {
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] >= 0) {
                      break L28;
                    } else {
                      incrementValue$15 = param3;
                      param3++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param3 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L28;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackOut_77_0 = var8 - (-1 + param4);
                stackIn_78_0 = stackOut_77_0;
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
          L29: {
            var7 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) (var7);
            stackOut_79_1 = new StringBuilder().append("qa.B(").append(param0).append(',').append(param1).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param2 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L29;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L29;
            }
          }
          L30: {
            stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param5 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L30;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L30;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_78_0;
        }
    }

    private qa() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Unpacking animations";
    }
}

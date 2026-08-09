/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    private int[] field_c;
    static String field_a;
    static int[] field_b;

    final static hh a(byte param0, ci param1, int param2, ci param3, int param4) {
        RuntimeException var5 = null;
        hh stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -66) {
              if (rl.a(param4, 0, param2, param1)) {
                stackIn_7_0 = ak.a(param3.a((byte) -93, param4, param2), 21725);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (hh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("pe.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (hh) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4) {
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 >= 92) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_b = (int[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0--;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param0--;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((param0 ^ -1) > -1) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = param1;
                        var5 = var9;
                        var6 = param2;
                        var7 = param4;
                        var9[var6] = (vg.c(var9[var6], 16711422) >> 921440353) + var7;
                        param2++;
                        if (var8 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var5_ref);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("pe.A(").append(param0).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param1 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 14: {
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
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
        int stackIn_76_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 != 0) {
              param0 = param0 + param2;
              var7_int = param4;
              var8 = param5;
              L1: while (true) {
                L2: {
                  L3: {
                    var9 = param3[var8];
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
                  var7_int = this.field_c[var7_int];
                  break L2;
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_c[var7_int];
                    var10 = dupTemp$0;
                    if (0 <= dupTemp$0) {
                      break L5;
                    } else {
                      incrementValue$1 = param2;
                      param2++;
                      param1[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param0 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if ((var9 & 64) != 0) {
                        break L7;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var7_int = this.field_c[var7_int];
                    break L6;
                  }
                  L8: {
                    dupTemp$2 = this.field_c[var7_int];
                    var10 = dupTemp$2;
                    if (-1 < (dupTemp$2 ^ -1)) {
                      L9: {
                        incrementValue$3 = param2;
                        param2++;
                        param1[incrementValue$3] = (byte)(var10 ^ -1);
                        if (param2 < param0) {
                          break L9;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var7_int = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L10: {
                    if ((var9 & 32) != 0) {
                      var7_int = this.field_c[var7_int];
                      if (var11 == 0) {
                        break L10;
                      } else {
                        var7_int++;
                        break L10;
                      }
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$4 = this.field_c[var7_int];
                    var10 = dupTemp$4;
                    if (-1 < (dupTemp$4 ^ -1)) {
                      L12: {
                        incrementValue$5 = param2;
                        param2++;
                        param1[incrementValue$5] = (byte)(var10 ^ -1);
                        if (param0 > param2) {
                          break L12;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var7_int = 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L13: {
                    if ((var9 & 16) != 0) {
                      var7_int = this.field_c[var7_int];
                      if (var11 == 0) {
                        break L13;
                      } else {
                        var7_int++;
                        break L13;
                      }
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    dupTemp$6 = this.field_c[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 < 0) {
                      L15: {
                        incrementValue$7 = param2;
                        param2++;
                        param1[incrementValue$7] = (byte)(var10 ^ -1);
                        if (param2 < param0) {
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
                    if (0 != (8 & var9)) {
                      var7_int = this.field_c[var7_int];
                      if (var11 == 0) {
                        break L16;
                      } else {
                        var7_int++;
                        break L16;
                      }
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$8 = this.field_c[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param2;
                      param2++;
                      param1[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param2 >= param0) {
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
                    L19: {
                      if ((4 & var9) != 0) {
                        break L19;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    var7_int = this.field_c[var7_int];
                    break L18;
                  }
                  L20: {
                    dupTemp$10 = this.field_c[var7_int];
                    var10 = dupTemp$10;
                    if (-1 >= (dupTemp$10 ^ -1)) {
                      break L20;
                    } else {
                      incrementValue$11 = param2;
                      param2++;
                      param1[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param2 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L20;
                      }
                    }
                  }
                  L21: {
                    L22: {
                      if (0 != (var9 & 2)) {
                        break L22;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    var7_int = this.field_c[var7_int];
                    break L21;
                  }
                  L23: {
                    dupTemp$12 = this.field_c[var7_int];
                    var10 = dupTemp$12;
                    if (dupTemp$12 < 0) {
                      incrementValue$13 = param2;
                      param2++;
                      param1[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param0 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    L25: {
                      if ((var9 & 1) != 0) {
                        break L25;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    var7_int = this.field_c[var7_int];
                    break L24;
                  }
                  L26: {
                    dupTemp$14 = this.field_c[var7_int];
                    var10 = dupTemp$14;
                    if (-1 < (dupTemp$14 ^ -1)) {
                      incrementValue$15 = param2;
                      param2++;
                      param1[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param2 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  var8++;
                  if (var11 == 0) {
                    continue L1;
                  } else {
                    break L4;
                  }
                }
                stackIn_76_0 = -param5 + var8 - -1;
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
          L27: {
            var7 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var7);

            stackIn_79_1 = new StringBuilder().append("pe.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L27;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_82_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L28;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L28;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_80_0), stackIn_83_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_76_0;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        param1 = param1 & 8191;
        if (param0 > param1) {
          L0: {
            if (param1 >= 2048) {
              stackIn_8_0 = nj.field_r[-param1 + 4096];
              break L0;
            } else {
              stackIn_8_0 = nj.field_r[param1];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (-6145 < (param1 ^ -1)) {
              stackIn_4_0 = -nj.field_r[param1 - 4096];
              break L1;
            } else {
              stackIn_4_0 = -nj.field_r[-param1 + 8192];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = -82 % ((49 - param0) / 47);
    }

    private pe() throws Throwable {
        throw new Error();
    }

    static {
        field_a = "Try again";
    }
}

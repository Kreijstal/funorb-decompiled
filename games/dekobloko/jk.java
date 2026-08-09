/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static String field_a;
    static int field_e;
    private int[] field_d;
    static String field_g;
    static int field_c;
    private int[] field_f;
    private byte[] field_b;

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        L0: {
          L1: {
            var3 = client.field_A ? 1 : 0;
            if (eh.field_a > 0) {
              break L1;
            } else {
              L2: {
                if (ph.n(-30146)) {
                  break L2;
                } else {
                  var2 = 1;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = 0;
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            L4: {
              if (li.field_b == null) {
                break L4;
              } else {
                cl.field_v = li.field_b.c(27134);
                p.a(2, (byte) -30);
                if (var3 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            cl.field_v = sg.a(640, lf.field_e, 0, 0, 82, 480);
            break L3;
          }
          L5: {
            if (null == cl.field_v) {
              break L5;
            } else {
              hl.a(cl.field_v, (byte) -42);
              var2 = 2;
              if (var3 == 0) {
                break L0;
              } else {
                break L5;
              }
            }
          }
          var2 = 3;
          break L0;
        }
        L6: {
          if (param0 == 2) {
            break L6;
          } else {
            field_e = -30;
            break L6;
          }
        }
        L7: {
          if (li.field_b != null) {
            break L7;
          } else {
            if (!ij.field_e) {
              break L7;
            } else {
              bl.a(param0 + -73, var2, param1);
              break L7;
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -5 % ((-29 - param0) / 55);
        field_g = null;
        field_a = null;
    }

    final int a(int param0, byte param1, int param2, byte[] param3, byte[] param4, int param5) {
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
        int stackIn_4_0 = 0;
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
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            if ((param5 ^ -1) == -1) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 > 86) {
                  break L1;
                } else {
                  jk.a(-83, true);
                  break L1;
                }
              }
              param5 = param5 + param2;
              var7_int = 0;
              var8 = param0;
              L2: while (true) {
                L3: {
                  L4: {
                    var9 = param4[var8];
                    if (0 <= var9) {
                      break L4;
                    } else {
                      var7_int = this.field_f[var7_int];
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var7_int++;
                  break L3;
                }
                L5: {
                  L6: {
                    dupTemp$0 = this.field_f[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L6;
                    } else {
                      L7: {
                        incrementValue$1 = param2;
                        param2++;
                        param3[incrementValue$1] = (byte)(var10 ^ -1);
                        if (param5 > param2) {
                          break L7;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = 0;
                      break L6;
                    }
                  }
                  L8: {
                    L9: {
                      if ((var9 & 64) != 0) {
                        break L9;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var7_int = this.field_f[var7_int];
                    break L8;
                  }
                  L10: {
                    dupTemp$2 = this.field_f[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 < 0) {
                      L11: {
                        incrementValue$3 = param2;
                        param2++;
                        param3[incrementValue$3] = (byte)(var10 ^ -1);
                        if (param2 < param5) {
                          break L11;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var7_int = 0;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L12: {
                    L13: {
                      if (-1 != (32 & var9 ^ -1)) {
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
                    var7_int = this.field_f[var7_int];
                    break L12;
                  }
                  L14: {
                    dupTemp$4 = this.field_f[var7_int];
                    var10 = dupTemp$4;
                    if (-1 >= (dupTemp$4 ^ -1)) {
                      break L14;
                    } else {
                      incrementValue$5 = param2;
                      param2++;
                      param3[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param5 <= param2) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    L16: {
                      if ((16 & var9 ^ -1) == -1) {
                        break L16;
                      } else {
                        var7_int = this.field_f[var7_int];
                        if (var11 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    var7_int++;
                    break L15;
                  }
                  L17: {
                    dupTemp$6 = this.field_f[var7_int];
                    var10 = dupTemp$6;
                    if (-1 < (dupTemp$6 ^ -1)) {
                      L18: {
                        incrementValue$7 = param2;
                        param2++;
                        param3[incrementValue$7] = (byte)(var10 ^ -1);
                        if (param5 > param2) {
                          break L18;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var7_int = 0;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L19: {
                    L20: {
                      if (0 != (8 & var9)) {
                        break L20;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var7_int = this.field_f[var7_int];
                    break L19;
                  }
                  L21: {
                    dupTemp$8 = this.field_f[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      L22: {
                        incrementValue$9 = param2;
                        param2++;
                        param3[incrementValue$9] = (byte)(var10 ^ -1);
                        if ((param5 ^ -1) < (param2 ^ -1)) {
                          break L22;
                        } else {
                          if (var11 == 0) {
                            break L5;
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
                      if ((4 & var9 ^ -1) == -1) {
                        break L24;
                      } else {
                        var7_int = this.field_f[var7_int];
                        if (var11 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    var7_int++;
                    break L23;
                  }
                  L25: {
                    dupTemp$10 = this.field_f[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 < 0) {
                      incrementValue$11 = param2;
                      param2++;
                      param3[incrementValue$11] = (byte)(var10 ^ -1);
                      if ((param5 ^ -1) >= (param2 ^ -1)) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    L27: {
                      if (-1 == (2 & var9 ^ -1)) {
                        break L27;
                      } else {
                        var7_int = this.field_f[var7_int];
                        if (var11 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    var7_int++;
                    break L26;
                  }
                  L28: {
                    dupTemp$12 = this.field_f[var7_int];
                    var10 = dupTemp$12;
                    if (0 <= dupTemp$12) {
                      break L28;
                    } else {
                      incrementValue$13 = param2;
                      param2++;
                      param3[incrementValue$13] = (byte)(var10 ^ -1);
                      if ((param2 ^ -1) <= (param5 ^ -1)) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L28;
                      }
                    }
                  }
                  L29: {
                    L30: {
                      if (-1 != (1 & var9 ^ -1)) {
                        break L30;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    var7_int = this.field_f[var7_int];
                    break L29;
                  }
                  L31: {
                    dupTemp$14 = this.field_f[var7_int];
                    var10 = dupTemp$14;
                    if (dupTemp$14 >= 0) {
                      break L31;
                    } else {
                      incrementValue$15 = param2;
                      param2++;
                      param3[incrementValue$15] = (byte)(var10 ^ -1);
                      if ((param5 ^ -1) >= (param2 ^ -1)) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L31;
                      }
                    }
                  }
                  var8++;
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    break L5;
                  }
                }
                stackIn_76_0 = var8 - (-1 - -param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var7 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var7);

            stackIn_79_1 = new StringBuilder().append("jk.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L32;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L32;
            }
          }
          L33: {


            stackIn_82_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');

            if (param4 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L33;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L33;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_80_0), stackIn_83_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_76_0;
        }
    }

    final int a(byte[] param0, byte[] param1, int param2, int param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param5 == 8) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_c = -58;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7_int = 0;
                        var8 = param3 << -1718073853;
                        param2 = param2 + param4;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((param2 ^ -1) >= (param4 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = 255 & param1[param4];
                        var10 = this.field_d[var9];
                        var11 = this.field_b[var9];
                        stackIn_20_0 = var11 ^ -1;
                        stackIn_6_0 = stackIn_20_0;
                        stackIn_20_1 = -1;
                        stackIn_6_1 = stackIn_20_1;
                        if (var15 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 == stackIn_6_1) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw new RuntimeException("" + var9);
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var12 = var8 >> 1407045219;
                        var13 = var8 & 7;
                        var7_int = var7_int & -var13 >> -1061197921;
                        var14 = var12 - -(var13 + (var11 + -1) >> 425602563);
                        var13 += 24;
                        dupTemp$0 = de.b(var7_int, var10 >>> var13);
                        var7_int = dupTemp$0;
                        param0[var12] = (byte)dupTemp$0;
                        if (var14 > var12) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var15 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        param0[var12] = (byte)(var10 >>> var13);
                        if ((var12 ^ -1) <= (var14 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param0[var12] = (byte)(var10 >>> var13);
                        if ((var12 ^ -1) > (var14 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var15 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        param0[var12] = (byte)(var10 >>> var13);
                        if (var14 <= var12) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 << -var13;
                        param0[var12] = (byte)(var10 << -var13);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = var8 + var11;
                        param4++;
                        if (var15 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = -param3;
                        stackIn_20_1 = var8 + 7 >> -1057081885;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = stackIn_20_0 + stackIn_20_1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var7);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("jk.B(");
                    stackIn_23_1 = stackIn_24_1;
                    if (param0 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param1 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw dh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    jk(byte[] param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length;
                        this.field_b = param0;
                        this.field_d = new int[var2_int];
                        this.field_f = new int[8];
                        var17 = new int[33];
                        var16 = var17;
                        var3 = var16;
                        var4 = 0;
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = var5;
                        stackIn_3_1 = var2_int;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= stackIn_3_1) {
                            statePc = 50;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = param0[var5];
                        if (var15 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (0 != var6) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var15 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = 1 << -var6 + 32;
                        var8 = var17[var6];
                        this.field_d[var5] = var8;
                        if ((var8 & var7) == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = var3[var6 - 1];
                        if (var15 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = var8 | var7;
                        var10 = -1 + var6;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var10 ^ -1) > -2) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11 = var17[var10];
                        stackIn_18_0 = var8 ^ -1;
                        stackIn_12_0 = stackIn_18_0;
                        stackIn_18_1 = var11 ^ -1;
                        stackIn_12_1 = stackIn_18_1;
                        if (var15 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 != stackIn_12_1) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var12 = 1 << 32 + -var10;
                        if ((var12 & var11) != 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3[var10] = de.b(var11, var12);
                        if (var15 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3[var10] = var3[var10 - 1];
                        if (var15 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10--;
                        if (var15 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var17[var6] = var9;
                        stackIn_18_0 = var6;
                        stackIn_18_1 = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10 = stackIn_18_0 + stackIn_18_1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var10 ^ -1) < -33) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_3_0 = var8;
                        stackIn_21_0 = stackIn_3_0;
                        stackIn_3_1 = var17[var10];
                        stackIn_21_1 = stackIn_3_1;
                        if (var15 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 != stackIn_21_1) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var17[var10] = var9;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var10 = 0;
                        var11 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((var6 ^ -1) >= (var11 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var12 = -2147483648 >>> var11;
                        stackIn_41_0 = -1;
                        stackIn_27_0 = stackIn_41_0;
                        stackIn_41_1 = var12 & var8 ^ -1;
                        stackIn_27_1 = stackIn_41_1;
                        if (var15 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 == stackIn_27_1) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((this.field_f[var10] ^ -1) != -1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_f[var10] = var4;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10 = this.field_f[var10];
                        if (var15 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var10++;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12 = var12 >>> 1;
                        if ((this.field_f.length ^ -1) < (var10 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var13 = new int[2 * this.field_f.length];
                        var14 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var14 ^ -1) <= (this.field_f.length ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var13[var14] = this.field_f[var14];
                        var14++;
                        if (var15 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var15 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_f = var13;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var11++;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var15 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = var10 ^ -1;
                        stackIn_41_1 = var4 ^ -1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 > stackIn_41_1) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var4 = 1 + var10;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.field_f[var10] = var5 ^ -1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var5++;
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_48_0 = (RuntimeException) (var2);
                    stackIn_47_0 = stackIn_48_0;
                    stackIn_48_1 = new StringBuilder().append("jk.<init>(");
                    stackIn_47_1 = stackIn_48_1;
                    if (param0 == null) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_49_2 = "{...}";
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_49_2 = "null";
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    throw dh.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_g = "Names can only contain letters, numbers, spaces and underscores";
    }
}

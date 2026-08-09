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
        if (param0 != 0) {
            field_a = (eb) null;
        }
        field_b = null;
        field_e = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ml.b(-107)) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (mg.field_k == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (mg.field_k.field_e) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        lb.a(true);
                        b.field_n.b((byte) 74, (pj) (new gg(b.field_n, hh.field_d)));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        b.field_n.a(em.field_q, false, true, lc.field_t);
                        b.field_n.o(117);
                        var1_int = 17 % ((param0 - 53) / 47);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!nf.e(32722)) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        b.field_n.a(od.field_k, true, ob.field_K);
                        if (var2 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var2 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var1), "cf.B(" + param0 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private cf() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, int param3, byte[] param4, int param5) {
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
        int stackIn_81_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        StringBuilder stackIn_87_1 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (0 == param5) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var7_int = 0;
                if (param2 == -1) {
                  break L1;
                } else {
                  field_e = (int[]) null;
                  break L1;
                }
              }
              param5 = param5 + param3;
              var8 = param0;
              L2: while (true) {
                L3: {
                  L4: {
                    var9 = param4[var8];
                    if (var9 >= 0) {
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
                    if (dupTemp$0 < 0) {
                      incrementValue$1 = param3;
                      param3++;
                      param1[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param3 >= param5) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (-1 != (64 & var9 ^ -1)) {
                      var7_int = this.field_f[var7_int];
                      if (var11 == 0) {
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
                    dupTemp$2 = this.field_f[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L8;
                    } else {
                      L9: {
                        incrementValue$3 = param3;
                        param3++;
                        param1[incrementValue$3] = (byte)(var10 ^ -1);
                        if (param5 > param3) {
                          break L9;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var7_int = 0;
                      break L8;
                    }
                  }
                  L10: {
                    if ((var9 & 32) != 0) {
                      var7_int = this.field_f[var7_int];
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
                    dupTemp$4 = this.field_f[var7_int];
                    var10 = dupTemp$4;
                    if (0 <= dupTemp$4) {
                      break L11;
                    } else {
                      L12: {
                        incrementValue$5 = param3;
                        param3++;
                        param1[incrementValue$5] = (byte)(var10 ^ -1);
                        if (param5 > param3) {
                          break L12;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var7_int = 0;
                      break L11;
                    }
                  }
                  L13: {
                    if (-1 != (16 & var9 ^ -1)) {
                      var7_int = this.field_f[var7_int];
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
                    dupTemp$6 = this.field_f[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 < 0) {
                      L15: {
                        incrementValue$7 = param3;
                        param3++;
                        param1[incrementValue$7] = (byte)(var10 ^ -1);
                        if (param5 > param3) {
                          break L15;
                        } else {
                          if (var11 == 0) {
                            break L5;
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
                    if (-1 != (var9 & 8 ^ -1)) {
                      var7_int = this.field_f[var7_int];
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
                    dupTemp$8 = this.field_f[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param3;
                      param3++;
                      param1[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param5 <= param3) {
                        break L5;
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
                      if (0 != (4 & var9)) {
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
                    var7_int = this.field_f[var7_int];
                    break L18;
                  }
                  L20: {
                    dupTemp$10 = this.field_f[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 >= 0) {
                      break L20;
                    } else {
                      L21: {
                        incrementValue$11 = param3;
                        param3++;
                        param1[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param5 > param3) {
                          break L21;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var7_int = 0;
                      break L20;
                    }
                  }
                  L22: {
                    if (-1 != (2 & var9 ^ -1)) {
                      var7_int = this.field_f[var7_int];
                      if (var11 == 0) {
                        break L22;
                      } else {
                        var7_int++;
                        break L22;
                      }
                    } else {
                      var7_int++;
                      break L22;
                    }
                  }
                  L23: {
                    dupTemp$12 = this.field_f[var7_int];
                    var10 = dupTemp$12;
                    if (0 <= dupTemp$12) {
                      break L23;
                    } else {
                      incrementValue$13 = param3;
                      param3++;
                      param1[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param3 >= param5) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L23;
                      }
                    }
                  }
                  L24: {
                    L25: {
                      if ((1 & var9) != 0) {
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
                    var7_int = this.field_f[var7_int];
                    break L24;
                  }
                  L26: {
                    dupTemp$14 = this.field_f[var7_int];
                    var10 = dupTemp$14;
                    if (-1 < (dupTemp$14 ^ -1)) {
                      L27: {
                        incrementValue$15 = param3;
                        param3++;
                        param1[incrementValue$15] = (byte)(var10 ^ -1);
                        if (param5 > param3) {
                          break L27;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L27;
                          }
                        }
                      }
                      var7_int = 0;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  var8++;
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    break L5;
                  }
                }
                stackIn_81_0 = 1 + var8 - param0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var7 = decompiledCaughtException;
            stackIn_84_0 = (RuntimeException) (var7);

            stackIn_84_1 = new StringBuilder().append("cf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "null";
              break L28;
            } else {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "{...}";
              break L28;
            }
          }
          L29: {


            stackIn_87_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_85_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "null";
              break L29;
            } else {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "{...}";
              break L29;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_85_0), stackIn_88_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_81_0;
        }
    }

    static {
        field_b = new int[8192];
        field_g = "TIME";
        field_e = new int[8192];
    }
}

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
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (ml.b(-107)) {
              discarded$4 = b.field_n.a(em.field_q, false, true, lc.field_t);
              b.field_n.o(117);
              var1_int = 17 % ((param0 - 53) / 47);
              L1: while (true) {
                L2: {
                  if (!nf.e(32722)) {
                    break L2;
                  } else {
                    discarded$5 = b.field_n.a(od.field_k, true, ob.field_K);
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L3: {
                if (mg.field_k == null) {
                  break L3;
                } else {
                  if (mg.field_k.field_e) {
                    lb.a(true);
                    b.field_n.b((byte) 74, (pj) (new gg(b.field_n, hh.field_d)));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "cf.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private cf() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, int param3, byte[] param4, int param5) {
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
        int stackIn_4_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_80_0 = 0;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (0 == param5) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
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
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] < 0) {
                      incrementValue$8 = param3;
                      param3++;
                      param1[incrementValue$8] = (byte)(var10 ^ -1);
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
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] >= 0) {
                      break L8;
                    } else {
                      L9: {
                        incrementValue$9 = param3;
                        param3++;
                        param1[incrementValue$9] = (byte)(var10 ^ -1);
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
                    var10 = this.field_f[var7_int];
                    if (0 <= this.field_f[var7_int]) {
                      break L11;
                    } else {
                      L12: {
                        incrementValue$10 = param3;
                        param3++;
                        param1[incrementValue$10] = (byte)(var10 ^ -1);
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
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] < 0) {
                      L15: {
                        incrementValue$11 = param3;
                        param3++;
                        param1[incrementValue$11] = (byte)(var10 ^ -1);
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
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] < 0) {
                      incrementValue$12 = param3;
                      param3++;
                      param1[incrementValue$12] = (byte)(var10 ^ -1);
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
                    var10 = this.field_f[var7_int];
                    if (this.field_f[var7_int] >= 0) {
                      break L20;
                    } else {
                      L21: {
                        incrementValue$13 = param3;
                        param3++;
                        param1[incrementValue$13] = (byte)(var10 ^ -1);
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
                    var10 = this.field_f[var7_int];
                    if (0 <= this.field_f[var7_int]) {
                      break L23;
                    } else {
                      incrementValue$14 = param3;
                      param3++;
                      param1[incrementValue$14] = (byte)(var10 ^ -1);
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
                    var10 = this.field_f[var7_int];
                    if (-1 < (this.field_f[var7_int] ^ -1)) {
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
                  continue L2;
                }
                stackOut_80_0 = 1 + var8 - param0;
                stackIn_81_0 = stackOut_80_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var7 = decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) (var7);
            stackOut_82_1 = new StringBuilder().append("cf.C(").append(param0).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param1 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L28;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L28;
            }
          }
          L29: {
            stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
            stackOut_85_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_85_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param4 == null) {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L29;
            } else {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L29;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ',' + param5 + ')');
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

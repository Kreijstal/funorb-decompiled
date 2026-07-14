/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class g extends fb {
    int field_W;
    static int[] field_P;
    int field_ab;
    int field_T;
    int field_Z;
    int field_K;
    int field_I;
    int field_D;
    int field_O;
    int field_R;
    static boolean field_Q;
    fn field_U;
    int field_X;
    boolean field_J;
    int field_Y;
    static String field_H;
    int field_E;
    int field_F;
    int field_M;
    int field_S;
    int field_G;
    boolean field_V;
    int field_N;
    private int field_L;

    final va m(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        va var7 = null;
        var6 = ZombieDawn.field_J;
        if (dj.field_e.field_mb.field_e) {
          var7 = ub.a(127, ((g) this).l(-95));
          var3 = 49 % ((param0 - 36) / 50);
          if (var7 != null) {
            ((g) this).field_y = ((g) this).field_y + var7.field_h;
            ((g) this).field_x = ((g) this).field_x + var7.field_i;
            if (!dj.field_e.field_H.a(false, ((g) this).field_x >> -984512976, ((g) this).field_y >> 1785541360, true)) {
              ((g) this).field_x = ((g) this).field_x - var7.field_i;
              ((g) this).field_y = ((g) this).field_y - var7.field_h;
              if (((g) this).field_F != 6) {
                if (-6 != (((g) this).field_F ^ -1)) {
                  if (((g) this).field_F != 1) {
                    if ((((g) this).field_F ^ -1) != -8) {
                      return var7;
                    } else {
                      ((g) this).c(0, ((g) this).field_L);
                      return var7;
                    }
                  } else {
                    ((g) this).c(0, ((g) this).field_L);
                    return var7;
                  }
                } else {
                  ((g) this).c(0, ((g) this).field_L);
                  return var7;
                }
              } else {
                var4 = ((g) this).field_G;
                var5 = ((g) this).field_N;
                ((g) this).e(4, -6904);
                ((g) this).field_N = var5;
                ((g) this).field_G = var4;
                return var7;
              }
            } else {
              ((g) this).d((byte) 12);
              if (((g) this).field_F != 6) {
                if (-6 != (((g) this).field_F ^ -1)) {
                  if (((g) this).field_F != 1) {
                    if ((((g) this).field_F ^ -1) != -8) {
                      return var7;
                    } else {
                      ((g) this).c(0, ((g) this).field_L);
                      return var7;
                    }
                  } else {
                    ((g) this).c(0, ((g) this).field_L);
                    return var7;
                  }
                } else {
                  ((g) this).c(0, ((g) this).field_L);
                  return var7;
                }
              } else {
                var4 = ((g) this).field_G;
                var5 = ((g) this).field_N;
                ((g) this).e(4, -6904);
                ((g) this).field_N = var5;
                ((g) this).field_G = var4;
                return var7;
              }
            }
          } else {
            return var7;
          }
        } else {
          return null;
        }
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ((g) this).field_L = param1;
        param1 = param1 * ((g) this).field_W / 4;
        var3 = ((g) this).field_Y - ((g) this).a(true);
        if (param0 != 0) {
          L0: {
            ((g) this).field_D = -90;
            var4 = ((g) this).field_X + -((g) this).f(237239984);
            var5 = so.b(var3 * var3 - -(var4 * var4));
            if (var5 != 0) {
              L1: {
                var6 = param1 / var5;
                ((g) this).field_O = var3 * var6;
                ((g) this).field_T = var4 * var6;
                ((g) this).field_E = 3 * ((g) this).field_O / 4;
                ((g) this).field_ab = ((g) this).field_T * 3 / 4;
                stackOut_16_0 = this;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (((g) this).field_O > 0) {
                  stackOut_18_0 = this;
                  stackOut_18_1 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L1;
                } else {
                  stackOut_17_0 = this;
                  stackOut_17_1 = 3;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L1;
                }
              }
              ((g) this).field_S = stackIn_19_1;
              ((g) this).field_M = 2 * ((g) this).field_T - ((g) this).field_ab;
              ((g) this).field_I = -((g) this).field_E + ((g) this).field_O * 2;
              ((g) this).field_K = (((g) this).field_O + -((g) this).field_E) / 2;
              ((g) this).field_R = (-((g) this).field_ab + ((g) this).field_T) / 2;
              break L0;
            } else {
              L2: {
                stackOut_12_0 = this;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (!(this instanceof ah)) {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 4;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L2;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L2;
                }
              }
              ((g) this).e(stackIn_15_1, -6904);
              break L0;
            }
          }
          return;
        } else {
          L3: {
            var4 = ((g) this).field_X + -((g) this).f(237239984);
            var5 = so.b(var3 * var3 - -(var4 * var4));
            if (var5 != 0) {
              L4: {
                var6 = param1 / var5;
                ((g) this).field_O = var3 * var6;
                ((g) this).field_T = var4 * var6;
                ((g) this).field_E = 3 * ((g) this).field_O / 4;
                ((g) this).field_ab = ((g) this).field_T * 3 / 4;
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (((g) this).field_O > 0) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L4;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 3;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L4;
                }
              }
              ((g) this).field_S = stackIn_9_1;
              ((g) this).field_M = 2 * ((g) this).field_T - ((g) this).field_ab;
              ((g) this).field_I = -((g) this).field_E + ((g) this).field_O * 2;
              ((g) this).field_K = (((g) this).field_O + -((g) this).field_E) / 2;
              ((g) this).field_R = (-((g) this).field_ab + ((g) this).field_T) / 2;
              break L3;
            } else {
              L5: {
                stackOut_2_0 = this;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (!(this instanceof ah)) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 4;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L5;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = 0;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L5;
                }
              }
              ((g) this).e(stackIn_5_1, -6904);
              break L3;
            }
          }
          return;
        }
    }

    final int l(int param0) {
        if (param0 > -71) {
          String discarded$2 = g.a(false, -39, true, true);
          return ((g) this).b(0, ((g) this).a(true), ((g) this).f(237239984));
        } else {
          return ((g) this).b(0, ((g) this).a(true), ((g) this).f(237239984));
        }
    }

    abstract void k(int param0);

    void j(int param0) {
        if (param0 < 66) {
            return;
        }
        ((g) this).field_V = true;
    }

    final void d(int param0, int param1) {
        L0: {
          if (((g) this).field_G >= cg.field_h[param0]) {
            ((g) this).field_G = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((((g) this).field_W ^ -1) == -5) {
            break L1;
          } else {
            break L1;
          }
        }
        if (param1 != -26109) {
          L2: {
            ((g) this).b((byte) -24, 107);
            ((g) this).field_N = ((g) this).field_N + 1;
            if (((g) this).field_N + 1 <= cg.field_b[param0]) {
              break L2;
            } else {
              L3: {
                ((g) this).field_G = ((g) this).field_G + 1;
                if (((g) this).field_G + 1 == cg.field_h[param0]) {
                  ((g) this).field_G = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              ((g) this).field_N = 0;
              break L2;
            }
          }
          return;
        } else {
          L4: {
            ((g) this).field_N = ((g) this).field_N + 1;
            if (((g) this).field_N + 1 <= cg.field_b[param0]) {
              break L4;
            } else {
              L5: {
                ((g) this).field_G = ((g) this).field_G + 1;
                if (((g) this).field_G + 1 == cg.field_h[param0]) {
                  ((g) this).field_G = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              ((g) this).field_N = 0;
              break L4;
            }
          }
          return;
        }
    }

    final void b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        var3 = -66 / ((param0 - 27) / 46);
        ((g) this).field_Z = param1;
        ((g) this).field_W = 2;
        var4 = ((g) this).field_F;
        if (var4 != -6) {
          if (-2 != var4) {
            if (7 != var4) {
              if (-3 != var4) {
                if (-7 != var4) {
                  if (var4 == 8) {
                    ((kd) this).k((byte) 40);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((g) this).c(0, 28672);
                  return;
                }
              } else {
                ((g) this).c(0, 401408);
                return;
              }
            } else {
              ((g) this).c(0, 114688);
              return;
            }
          } else {
            ((g) this).c(0, ((g) this).field_D);
            return;
          }
        } else {
          ((g) this).c(0, 57344);
          return;
        }
    }

    void e(int param0, int param1) {
        if (param1 == -6904) {
          if (((g) this).field_F != param0) {
            ((g) this).field_G = 0;
            ((g) this).field_F = param0;
            ((g) this).field_N = 0;
            return;
          } else {
            return;
          }
        } else {
          va discarded$8 = ((g) this).m(-100);
          if (((g) this).field_F == param0) {
            return;
          } else {
            ((g) this).field_G = 0;
            ((g) this).field_F = param0;
            ((g) this).field_N = 0;
            return;
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = 114 % ((-28 - param0) / 37);
        var5 = ((g) this).field_y >> 1701384688;
        var6 = ((g) this).field_x >> -1445108208;
        if (param1 < -7 + var5 + 24) {
          if (var5 + -17 < param1) {
            if (param2 > 5 + (var6 + -48)) {
              if (2 + var6 <= param2) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int[][] var6 = null;
        var4 = param1 / 24;
        var5 = param2 / 24;
        var6 = dj.field_e.field_H.field_A.field_f;
        if (var4 >= param0) {
          if (0 <= var5) {
            if (var4 < var6[0].length) {
              if (var5 >= var6.length) {
                return 0;
              } else {
                return var6[var5][var4];
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    g(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        ((g) this).field_U = null;
        ((g) this).field_W = 4;
        ((g) this).field_J = false;
        ((g) this).field_Z = 0;
        ((g) this).field_F = this instanceof ah ? 0 : 4;
        ((g) this).field_S = -2 != (pb.a(so.field_a, 2, 1) ^ -1) ? 1 : 3;
        ((g) this).field_G = 0;
        ((g) this).field_N = 0;
        ((g) this).field_D = param3;
    }

    final void g(byte param0) {
        if (!(!((g) this).field_V)) {
            return;
        }
        ((g) this).field_x = ((g) this).field_x + ((g) this).field_T;
        int var2 = 71 / ((param0 - -41) / 52);
        ((g) this).field_y = ((g) this).field_y + ((g) this).field_O;
        ((g) this).d((byte) -18);
    }

    final boolean h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_233_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var2 = ((g) this).field_Y << 1355039824;
          var3 = ((g) this).field_X << -12768496;
          if (((g) this).field_O != 0) {
            break L0;
          } else {
            if (-1 != ((g) this).field_T) {
              break L0;
            } else {
              return false;
            }
          }
        }
        if (-1 != ((g) this).field_O) {
          if (((g) this).field_O <= 0) {
            L1: {
              if (((g) this).field_O >= 0) {
                break L1;
              } else {
                if (((g) this).field_y >= var2) {
                  break L1;
                } else {
                  L2: {
                    var4 = 1;
                    if (((g) this).field_T != -1) {
                      L3: {
                        if (-1 >= ((g) this).field_T) {
                          break L3;
                        } else {
                          if (((g) this).field_x <= var3) {
                            break L3;
                          } else {
                            stackOut_166_0 = 1;
                            stackIn_174_0 = stackOut_166_0;
                            break L2;
                          }
                        }
                      }
                      if ((((g) this).field_T ^ -1) > -1) {
                        if (((g) this).field_x < var3) {
                          stackOut_172_0 = 1;
                          stackIn_174_0 = stackOut_172_0;
                          break L2;
                        } else {
                          stackOut_171_0 = 0;
                          stackIn_174_0 = stackOut_171_0;
                          break L2;
                        }
                      } else {
                        stackOut_169_0 = 0;
                        stackIn_174_0 = stackOut_169_0;
                        break L2;
                      }
                    } else {
                      stackOut_163_0 = 1;
                      stackIn_174_0 = stackOut_163_0;
                      break L2;
                    }
                  }
                  L4: {
                    var5 = stackIn_174_0;
                    var6 = 67 % ((-53 - param0) / 32);
                    if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                      break L4;
                    } else {
                      if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                        break L4;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var4 == 0) {
                        break L6;
                      } else {
                        if (var5 != 0) {
                          break L6;
                        } else {
                          ((g) this).field_O = 0;
                          break L5;
                        }
                      }
                    }
                    L7: {
                      if (var4 != 0) {
                        break L7;
                      } else {
                        if (var5 == 0) {
                          break L7;
                        } else {
                          ((g) this).field_T = 0;
                          return false;
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L5;
                    } else {
                      return false;
                    }
                  }
                  return false;
                }
              }
            }
            var4 = 0;
            if (((g) this).field_T != 0) {
              if (-1 <= (((g) this).field_T ^ -1)) {
                if ((((g) this).field_T ^ -1) > -1) {
                  if (((g) this).field_x < var3) {
                    L8: {
                      var5 = 1;
                      var6 = 67 % ((-53 - param0) / 32);
                      if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                        break L8;
                      } else {
                        if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                          break L8;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var4 == 0) {
                        break L9;
                      } else {
                        if (var5 != 0) {
                          break L9;
                        } else {
                          ((g) this).field_O = 0;
                          return false;
                        }
                      }
                    }
                    L10: {
                      if (var4 != 0) {
                        if (var4 == 0) {
                          break L10;
                        } else {
                          return false;
                        }
                      } else {
                        if (var5 != 0) {
                          ((g) this).field_T = 0;
                          break L10;
                        } else {
                          L11: {
                            if (var4 == 0) {
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          return false;
                        }
                      }
                    }
                    return false;
                  } else {
                    L12: {
                      var5 = 0;
                      var6 = 67 % ((-53 - param0) / 32);
                      if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                        break L12;
                      } else {
                        if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                          break L12;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (var4 == 0) {
                        break L13;
                      } else {
                        if (var5 != 0) {
                          break L13;
                        } else {
                          ((g) this).field_O = 0;
                          return false;
                        }
                      }
                    }
                    L14: {
                      if (var4 != 0) {
                        if (var4 == 0) {
                          break L14;
                        } else {
                          return false;
                        }
                      } else {
                        if (var5 != 0) {
                          ((g) this).field_T = 0;
                          break L14;
                        } else {
                          if (var4 == 0) {
                            return false;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    return false;
                  }
                } else {
                  L15: {
                    var5 = 0;
                    var6 = 67 % ((-53 - param0) / 32);
                    if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                      break L15;
                    } else {
                      if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                        break L15;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (var4 == 0) {
                      break L16;
                    } else {
                      if (var5 != 0) {
                        break L16;
                      } else {
                        ((g) this).field_O = 0;
                        return false;
                      }
                    }
                  }
                  L17: {
                    if (var4 != 0) {
                      if (var4 == 0) {
                        break L17;
                      } else {
                        return false;
                      }
                    } else {
                      if (var5 != 0) {
                        ((g) this).field_T = 0;
                        break L17;
                      } else {
                        if (var4 == 0) {
                          return false;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                  return false;
                }
              } else {
                if (((g) this).field_x <= var3) {
                  L18: {
                    if ((((g) this).field_T ^ -1) > -1) {
                      if (((g) this).field_x >= var3) {
                        stackOut_232_0 = 0;
                        stackIn_233_0 = stackOut_232_0;
                        break L18;
                      } else {
                        stackOut_231_0 = 1;
                        stackIn_233_0 = stackOut_231_0;
                        break L18;
                      }
                    } else {
                      stackOut_229_0 = 0;
                      stackIn_233_0 = stackOut_229_0;
                      break L18;
                    }
                  }
                  L19: {
                    var5 = stackIn_233_0;
                    var6 = 67 % ((-53 - param0) / 32);
                    if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                      break L19;
                    } else {
                      if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                        break L19;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L19;
                      }
                    }
                  }
                  L20: {
                    L21: {
                      if (var4 == 0) {
                        break L21;
                      } else {
                        if (var5 != 0) {
                          break L21;
                        } else {
                          ((g) this).field_O = 0;
                          break L20;
                        }
                      }
                    }
                    L22: {
                      if (var4 != 0) {
                        break L22;
                      } else {
                        if (var5 == 0) {
                          break L22;
                        } else {
                          ((g) this).field_T = 0;
                          return false;
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L20;
                    } else {
                      return false;
                    }
                  }
                  return false;
                } else {
                  L23: {
                    var5 = 1;
                    var6 = 67 % ((-53 - param0) / 32);
                    if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                      break L23;
                    } else {
                      if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                        break L23;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (var4 == 0) {
                      break L24;
                    } else {
                      if (var5 != 0) {
                        break L24;
                      } else {
                        ((g) this).field_O = 0;
                        return false;
                      }
                    }
                  }
                  if (var4 != 0) {
                    if (var4 != 0) {
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    if (var5 == 0) {
                      if (var4 != 0) {
                        return false;
                      } else {
                        return false;
                      }
                    } else {
                      ((g) this).field_T = 0;
                      return false;
                    }
                  }
                }
              }
            } else {
              L25: {
                var5 = 1;
                var6 = 67 % ((-53 - param0) / 32);
                if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                  break L25;
                } else {
                  if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                    break L25;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L25;
                  }
                }
              }
              L26: {
                if (var4 == 0) {
                  break L26;
                } else {
                  if (var5 != 0) {
                    break L26;
                  } else {
                    ((g) this).field_O = 0;
                    return false;
                  }
                }
              }
              if (var4 != 0) {
                if (var4 != 0) {
                  return false;
                } else {
                  return false;
                }
              } else {
                if (var5 == 0) {
                  if (var4 != 0) {
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  ((g) this).field_T = 0;
                  return false;
                }
              }
            }
          } else {
            if (var2 >= ((g) this).field_y) {
              L27: {
                if (((g) this).field_O < 0) {
                  if (((g) this).field_y >= var2) {
                    stackOut_132_0 = 0;
                    stackIn_133_0 = stackOut_132_0;
                    break L27;
                  } else {
                    stackOut_131_0 = 1;
                    stackIn_133_0 = stackOut_131_0;
                    break L27;
                  }
                } else {
                  stackOut_129_0 = 0;
                  stackIn_133_0 = stackOut_129_0;
                  break L27;
                }
              }
              L28: {
                var4 = stackIn_133_0;
                if (((g) this).field_T != -1) {
                  L29: {
                    if (-1 >= ((g) this).field_T) {
                      break L29;
                    } else {
                      if (((g) this).field_x <= var3) {
                        break L29;
                      } else {
                        stackOut_137_0 = 1;
                        stackIn_145_0 = stackOut_137_0;
                        break L28;
                      }
                    }
                  }
                  if ((((g) this).field_T ^ -1) > -1) {
                    if (((g) this).field_x < var3) {
                      stackOut_143_0 = 1;
                      stackIn_145_0 = stackOut_143_0;
                      break L28;
                    } else {
                      stackOut_142_0 = 0;
                      stackIn_145_0 = stackOut_142_0;
                      break L28;
                    }
                  } else {
                    stackOut_140_0 = 0;
                    stackIn_145_0 = stackOut_140_0;
                    break L28;
                  }
                } else {
                  stackOut_134_0 = 1;
                  stackIn_145_0 = stackOut_134_0;
                  break L28;
                }
              }
              L30: {
                var5 = stackIn_145_0;
                var6 = 67 % ((-53 - param0) / 32);
                if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                  break L30;
                } else {
                  if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                    break L30;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L30;
                  }
                }
              }
              L31: {
                L32: {
                  if (var4 == 0) {
                    break L32;
                  } else {
                    if (var5 != 0) {
                      break L32;
                    } else {
                      ((g) this).field_O = 0;
                      break L31;
                    }
                  }
                }
                L33: {
                  if (var4 != 0) {
                    break L33;
                  } else {
                    if (var5 == 0) {
                      break L33;
                    } else {
                      ((g) this).field_T = 0;
                      return false;
                    }
                  }
                }
                if (var4 != 0) {
                  break L31;
                } else {
                  return false;
                }
              }
              return false;
            } else {
              L34: {
                var4 = 1;
                if (((g) this).field_T != -1) {
                  if (-1 >= ((g) this).field_T) {
                    if ((((g) this).field_T ^ -1) > -1) {
                      if (((g) this).field_x < var3) {
                        L35: {
                          var5 = 1;
                          var6 = 67 % ((-53 - param0) / 32);
                          if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                            break L35;
                          } else {
                            if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                              break L35;
                            } else {
                              var4 = 1;
                              var5 = 1;
                              break L35;
                            }
                          }
                        }
                        L36: {
                          L37: {
                            if (var4 == 0) {
                              break L37;
                            } else {
                              if (var5 != 0) {
                                break L37;
                              } else {
                                ((g) this).field_O = 0;
                                break L36;
                              }
                            }
                          }
                          L38: {
                            if (var4 != 0) {
                              break L38;
                            } else {
                              if (var5 == 0) {
                                break L38;
                              } else {
                                ((g) this).field_T = 0;
                                return false;
                              }
                            }
                          }
                          if (var4 != 0) {
                            break L36;
                          } else {
                            return false;
                          }
                        }
                        return false;
                      } else {
                        stackOut_96_0 = 0;
                        stackIn_113_0 = stackOut_96_0;
                        break L34;
                      }
                    } else {
                      stackOut_94_0 = 0;
                      stackIn_113_0 = stackOut_94_0;
                      break L34;
                    }
                  } else {
                    if (((g) this).field_x <= var3) {
                      L39: {
                        if ((((g) this).field_T ^ -1) > -1) {
                          if (((g) this).field_x < var3) {
                            stackOut_76_0 = 1;
                            stackIn_78_0 = stackOut_76_0;
                            break L39;
                          } else {
                            stackOut_75_0 = 0;
                            stackIn_78_0 = stackOut_75_0;
                            break L39;
                          }
                        } else {
                          stackOut_73_0 = 0;
                          stackIn_78_0 = stackOut_73_0;
                          break L39;
                        }
                      }
                      L40: {
                        var5 = stackIn_78_0;
                        var6 = 67 % ((-53 - param0) / 32);
                        if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                          break L40;
                        } else {
                          if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                            break L40;
                          } else {
                            var4 = 1;
                            var5 = 1;
                            break L40;
                          }
                        }
                      }
                      L41: {
                        L42: {
                          if (var4 == 0) {
                            break L42;
                          } else {
                            if (var5 != 0) {
                              break L42;
                            } else {
                              ((g) this).field_O = 0;
                              break L41;
                            }
                          }
                        }
                        L43: {
                          if (var4 != 0) {
                            break L43;
                          } else {
                            if (var5 == 0) {
                              break L43;
                            } else {
                              ((g) this).field_T = 0;
                              return false;
                            }
                          }
                        }
                        if (var4 != 0) {
                          break L41;
                        } else {
                          return false;
                        }
                      }
                      return false;
                    } else {
                      stackOut_71_0 = 1;
                      stackIn_113_0 = stackOut_71_0;
                      break L34;
                    }
                  }
                } else {
                  stackOut_68_0 = 1;
                  stackIn_113_0 = stackOut_68_0;
                  break L34;
                }
              }
              L44: {
                var5 = stackIn_113_0;
                var6 = 67 % ((-53 - param0) / 32);
                if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                  break L44;
                } else {
                  if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                    break L44;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L44;
                  }
                }
              }
              L45: {
                L46: {
                  if (var4 == 0) {
                    break L46;
                  } else {
                    if (var5 != 0) {
                      break L46;
                    } else {
                      ((g) this).field_O = 0;
                      break L45;
                    }
                  }
                }
                L47: {
                  if (var4 != 0) {
                    break L47;
                  } else {
                    if (var5 == 0) {
                      break L47;
                    } else {
                      ((g) this).field_T = 0;
                      return false;
                    }
                  }
                }
                if (var4 != 0) {
                  break L45;
                } else {
                  return false;
                }
              }
              return false;
            }
          }
        } else {
          L48: {
            var4 = 1;
            if (((g) this).field_T != -1) {
              if (-1 >= ((g) this).field_T) {
                if ((((g) this).field_T ^ -1) > -1) {
                  if (((g) this).field_x < var3) {
                    L49: {
                      var5 = 1;
                      var6 = 67 % ((-53 - param0) / 32);
                      if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                        break L49;
                      } else {
                        if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                          break L49;
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L49;
                        }
                      }
                    }
                    L50: {
                      L51: {
                        if (var4 == 0) {
                          break L51;
                        } else {
                          if (var5 != 0) {
                            break L51;
                          } else {
                            ((g) this).field_O = 0;
                            break L50;
                          }
                        }
                      }
                      L52: {
                        if (var4 != 0) {
                          break L52;
                        } else {
                          if (var5 == 0) {
                            break L52;
                          } else {
                            ((g) this).field_T = 0;
                            return false;
                          }
                        }
                      }
                      if (var4 != 0) {
                        break L50;
                      } else {
                        return false;
                      }
                    }
                    return false;
                  } else {
                    stackOut_33_0 = 0;
                    stackIn_50_0 = stackOut_33_0;
                    break L48;
                  }
                } else {
                  stackOut_31_0 = 0;
                  stackIn_50_0 = stackOut_31_0;
                  break L48;
                }
              } else {
                if (((g) this).field_x <= var3) {
                  L53: {
                    if ((((g) this).field_T ^ -1) > -1) {
                      if (((g) this).field_x < var3) {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        break L53;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_15_0 = stackOut_12_0;
                        break L53;
                      }
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_15_0 = stackOut_10_0;
                      break L53;
                    }
                  }
                  L54: {
                    var5 = stackIn_15_0;
                    var6 = 67 % ((-53 - param0) / 32);
                    if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
                      break L54;
                    } else {
                      if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                        break L54;
                      } else {
                        var4 = 1;
                        var5 = 1;
                        break L54;
                      }
                    }
                  }
                  L55: {
                    if (var4 == 0) {
                      break L55;
                    } else {
                      if (var5 != 0) {
                        break L55;
                      } else {
                        ((g) this).field_O = 0;
                        return false;
                      }
                    }
                  }
                  L56: {
                    if (var4 != 0) {
                      break L56;
                    } else {
                      if (var5 == 0) {
                        break L56;
                      } else {
                        ((g) this).field_T = 0;
                        return false;
                      }
                    }
                  }
                  if (var4 != 0) {
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_8_0 = 1;
                  stackIn_50_0 = stackOut_8_0;
                  break L48;
                }
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_50_0 = stackOut_5_0;
              break L48;
            }
          }
          L57: {
            var5 = stackIn_50_0;
            var6 = 67 % ((-53 - param0) / 32);
            if (Math.abs(-var2 + ((g) this).field_y) >= hd.field_y) {
              break L57;
            } else {
              if (Math.abs(((g) this).field_x - var3) >= hd.field_y) {
                break L57;
              } else {
                var4 = 1;
                var5 = 1;
                break L57;
              }
            }
          }
          L58: {
            L59: {
              if (var4 == 0) {
                break L59;
              } else {
                if (var5 != 0) {
                  break L59;
                } else {
                  ((g) this).field_O = 0;
                  break L58;
                }
              }
            }
            L60: {
              if (var4 != 0) {
                break L60;
              } else {
                if (var5 == 0) {
                  break L60;
                } else {
                  ((g) this).field_T = 0;
                  return false;
                }
              }
            }
            if (var4 != 0) {
              break L58;
            } else {
              return false;
            }
          }
          return false;
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param0) {
          L0: {
            if (param3) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 <= -113) {
            if (param2) {
              var4++;
              return tk.field_e[var4];
            } else {
              return tk.field_e[var4];
            }
          } else {
            return null;
          }
        } else {
          L1: {
            var4 += 4;
            if (param3) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param1 <= -113) {
            if (!param2) {
              return tk.field_e[var4];
            } else {
              var4++;
              return tk.field_e[var4];
            }
          } else {
            return null;
          }
        }
    }

    public static void i(int param0) {
        field_P = null;
        field_H = null;
        if (param0 != 0) {
            field_H = null;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        hk.i(1584);
        bi.c(param4, param0, param2, param3);
        if (param1 != 99) {
            field_P = null;
        }
    }

    abstract void f(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new int[8192];
        field_Q = false;
    }
}

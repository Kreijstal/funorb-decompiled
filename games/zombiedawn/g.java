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
          var7 = ub.a(127, this.l(-95));
          var3 = 49 % ((param0 - 36) / 50);
          if (var7 != null) {
            this.field_y = this.field_y + var7.field_h;
            this.field_x = this.field_x + var7.field_i;
            if (!dj.field_e.field_H.a(false, this.field_x >> -984512976, this.field_y >> 1785541360, true)) {
              this.field_x = this.field_x - var7.field_i;
              this.field_y = this.field_y - var7.field_h;
              if (this.field_F != 6) {
                if (-6 != (this.field_F ^ -1)) {
                  if (this.field_F != 1) {
                    if ((this.field_F ^ -1) != -8) {
                      return var7;
                    } else {
                      this.c(0, this.field_L);
                      return var7;
                    }
                  } else {
                    this.c(0, this.field_L);
                    return var7;
                  }
                } else {
                  this.c(0, this.field_L);
                  return var7;
                }
              } else {
                var4 = this.field_G;
                var5 = this.field_N;
                this.e(4, -6904);
                this.field_N = var5;
                this.field_G = var4;
                return var7;
              }
            } else {
              this.d((byte) 12);
              if (this.field_F != 6) {
                if (-6 != (this.field_F ^ -1)) {
                  if (this.field_F != 1) {
                    if ((this.field_F ^ -1) != -8) {
                      return var7;
                    } else {
                      this.c(0, this.field_L);
                      return var7;
                    }
                  } else {
                    this.c(0, this.field_L);
                    return var7;
                  }
                } else {
                  this.c(0, this.field_L);
                  return var7;
                }
              } else {
                var4 = this.field_G;
                var5 = this.field_N;
                this.e(4, -6904);
                this.field_N = var5;
                this.field_G = var4;
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
        this.field_L = param1;
        param1 = param1 * this.field_W / 4;
        var3 = this.field_Y - this.a(true);
        if (param0 != 0) {
          L0: {
            this.field_D = -90;
            var4 = this.field_X + -this.f(237239984);
            var5 = so.b(var3 * var3 - -(var4 * var4));
            if (var5 != 0) {
              L1: {
                var6 = param1 / var5;
                this.field_O = var3 * var6;
                this.field_T = var4 * var6;
                this.field_E = 3 * this.field_O / 4;
                this.field_ab = this.field_T * 3 / 4;
                stackOut_16_0 = this;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (this.field_O > 0) {
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
              ((g) (this)).field_S = stackIn_19_1;
              this.field_M = 2 * this.field_T - this.field_ab;
              this.field_I = -this.field_E + this.field_O * 2;
              this.field_K = (this.field_O + -this.field_E) / 2;
              this.field_R = (-this.field_ab + this.field_T) / 2;
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
              this.e(stackIn_15_1, -6904);
              break L0;
            }
          }
          return;
        } else {
          L3: {
            var4 = this.field_X + -this.f(237239984);
            var5 = so.b(var3 * var3 - -(var4 * var4));
            if (var5 != 0) {
              L4: {
                var6 = param1 / var5;
                this.field_O = var3 * var6;
                this.field_T = var4 * var6;
                this.field_E = 3 * this.field_O / 4;
                this.field_ab = this.field_T * 3 / 4;
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (this.field_O > 0) {
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
              ((g) (this)).field_S = stackIn_9_1;
              this.field_M = 2 * this.field_T - this.field_ab;
              this.field_I = -this.field_E + this.field_O * 2;
              this.field_K = (this.field_O + -this.field_E) / 2;
              this.field_R = (-this.field_ab + this.field_T) / 2;
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
              this.e(stackIn_5_1, -6904);
              break L3;
            }
          }
          return;
        }
    }

    final int l(int param0) {
        String discarded$2 = null;
        if (param0 > -71) {
          discarded$2 = g.a(false, -39, true, true);
          return this.b(0, this.a(true), this.f(237239984));
        } else {
          return this.b(0, this.a(true), this.f(237239984));
        }
    }

    abstract void k(int param0);

    void j(int param0) {
        if (param0 < 66) {
            return;
        }
        this.field_V = true;
    }

    final void d(int param0, int param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        L0: {
          if (this.field_G >= cg.field_h[param0]) {
            this.field_G = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((this.field_W ^ -1) == -5) {
            break L1;
          } else {
            break L1;
          }
        }
        if (param1 != -26109) {
          L2: {
            this.b((byte) -24, 107);
            fieldTemp$4 = this.field_N + 1;
            this.field_N = this.field_N + 1;
            if (fieldTemp$4 <= cg.field_b[param0]) {
              break L2;
            } else {
              L3: {
                fieldTemp$5 = this.field_G + 1;
                this.field_G = this.field_G + 1;
                if (fieldTemp$5 == cg.field_h[param0]) {
                  this.field_G = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_N = 0;
              break L2;
            }
          }
          return;
        } else {
          L4: {
            fieldTemp$6 = this.field_N + 1;
            this.field_N = this.field_N + 1;
            if (fieldTemp$6 <= cg.field_b[param0]) {
              break L4;
            } else {
              L5: {
                fieldTemp$7 = this.field_G + 1;
                this.field_G = this.field_G + 1;
                if (fieldTemp$7 == cg.field_h[param0]) {
                  this.field_G = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              this.field_N = 0;
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
        this.field_Z = param1;
        this.field_W = 2;
        var4 = this.field_F;
        if ((var4 ^ -1) != -6) {
          if (-2 != (var4 ^ -1)) {
            if (7 != var4) {
              if (-3 != (var4 ^ -1)) {
                if (-7 != (var4 ^ -1)) {
                  if (var4 == 8) {
                    ((kd) (this)).k((byte) 40);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.c(0, 28672);
                  return;
                }
              } else {
                this.c(0, 401408);
                return;
              }
            } else {
              this.c(0, 114688);
              return;
            }
          } else {
            this.c(0, this.field_D);
            return;
          }
        } else {
          this.c(0, 57344);
          return;
        }
    }

    void e(int param0, int param1) {
        va discarded$8 = null;
        if (param1 == -6904) {
          if (this.field_F != param0) {
            this.field_G = 0;
            this.field_F = param0;
            this.field_N = 0;
            return;
          } else {
            return;
          }
        } else {
          discarded$8 = this.m(-100);
          if (this.field_F == param0) {
            return;
          } else {
            this.field_G = 0;
            this.field_F = param0;
            this.field_N = 0;
            return;
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = 114 % ((-28 - param0) / 37);
        var5 = this.field_y >> 1701384688;
        var6 = this.field_x >> -1445108208;
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
        this.field_U = null;
        this.field_W = 4;
        this.field_J = false;
        this.field_Z = 0;
        this.field_F = this instanceof ah ? 0 : 4;
        this.field_S = -2 != (pb.a(so.field_a, 2, 1) ^ -1) ? 1 : 3;
        this.field_G = 0;
        this.field_N = 0;
        this.field_D = param3;
    }

    final void g(byte param0) {
        if (!(!this.field_V)) {
            return;
        }
        this.field_x = this.field_x + this.field_T;
        int var2 = 71 / ((param0 - -41) / 52);
        this.field_y = this.field_y + this.field_O;
        this.d((byte) -18);
    }

    final boolean h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_253_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_252_0 = 0;
        int stackOut_251_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var2 = this.field_Y << 1355039824;
          var3 = this.field_X << -12768496;
          if (this.field_O != 0) {
            break L0;
          } else {
            if (-1 != (this.field_T ^ -1)) {
              break L0;
            } else {
              return false;
            }
          }
        }
        if (-1 != (this.field_O ^ -1)) {
          if (this.field_O <= 0) {
            L1: {
              if (this.field_O >= 0) {
                break L1;
              } else {
                if (this.field_y >= var2) {
                  break L1;
                } else {
                  L2: {
                    var4 = 1;
                    if (this.field_T != 0) {
                      L3: {
                        if (-1 <= (this.field_T ^ -1)) {
                          break L3;
                        } else {
                          if (this.field_x <= var3) {
                            break L3;
                          } else {
                            stackOut_180_0 = 1;
                            stackIn_188_0 = stackOut_180_0;
                            break L2;
                          }
                        }
                      }
                      if ((this.field_T ^ -1) > -1) {
                        if (this.field_x < var3) {
                          stackOut_186_0 = 1;
                          stackIn_188_0 = stackOut_186_0;
                          break L2;
                        } else {
                          stackOut_185_0 = 0;
                          stackIn_188_0 = stackOut_185_0;
                          break L2;
                        }
                      } else {
                        stackOut_183_0 = 0;
                        stackIn_188_0 = stackOut_183_0;
                        break L2;
                      }
                    } else {
                      stackOut_177_0 = 1;
                      stackIn_188_0 = stackOut_177_0;
                      break L2;
                    }
                  }
                  L4: {
                    var5 = stackIn_188_0;
                    var6 = 67 % ((-53 - param0) / 32);
                    if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                      break L4;
                    } else {
                      if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                          this.field_O = 0;
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
                          this.field_T = 0;
                          return false;
                        }
                      }
                    }
                    if (var4 != 0) {
                      if (var5 != 0) {
                        this.field_x = this.field_X << -610966416;
                        this.field_y = this.field_Y << 1214442512;
                        return true;
                      } else {
                        break L5;
                      }
                    } else {
                      return false;
                    }
                  }
                  return false;
                }
              }
            }
            var4 = 0;
            if (this.field_T != 0) {
              if (-1 <= (this.field_T ^ -1)) {
                if ((this.field_T ^ -1) > -1) {
                  if (this.field_x < var3) {
                    L8: {
                      var5 = 1;
                      var6 = 67 % ((-53 - param0) / 32);
                      if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                        break L8;
                      } else {
                        if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                          this.field_O = 0;
                          return false;
                        }
                      }
                    }
                    L10: {
                      if (var4 != 0) {
                        if (var4 == 0) {
                          break L10;
                        } else {
                          if (var5 != 0) {
                            this.field_x = this.field_X << -610966416;
                            this.field_y = this.field_Y << 1214442512;
                            return true;
                          } else {
                            return false;
                          }
                        }
                      } else {
                        if (var5 != 0) {
                          this.field_T = 0;
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
                      if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                        break L12;
                      } else {
                        if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                          this.field_O = 0;
                          return false;
                        }
                      }
                    }
                    L14: {
                      if (var4 != 0) {
                        if (var4 == 0) {
                          break L14;
                        } else {
                          if (var5 != 0) {
                            this.field_x = this.field_X << -610966416;
                            this.field_y = this.field_Y << 1214442512;
                            return true;
                          } else {
                            return false;
                          }
                        }
                      } else {
                        if (var5 != 0) {
                          this.field_T = 0;
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
                    if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                      break L15;
                    } else {
                      if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                        this.field_O = 0;
                        return false;
                      }
                    }
                  }
                  L17: {
                    if (var4 != 0) {
                      if (var4 == 0) {
                        break L17;
                      } else {
                        if (var5 != 0) {
                          this.field_x = this.field_X << -610966416;
                          this.field_y = this.field_Y << 1214442512;
                          return true;
                        } else {
                          return false;
                        }
                      }
                    } else {
                      if (var5 != 0) {
                        this.field_T = 0;
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
                if (this.field_x <= var3) {
                  L18: {
                    if ((this.field_T ^ -1) > -1) {
                      if (this.field_x >= var3) {
                        stackOut_252_0 = 0;
                        stackIn_253_0 = stackOut_252_0;
                        break L18;
                      } else {
                        stackOut_251_0 = 1;
                        stackIn_253_0 = stackOut_251_0;
                        break L18;
                      }
                    } else {
                      stackOut_249_0 = 0;
                      stackIn_253_0 = stackOut_249_0;
                      break L18;
                    }
                  }
                  L19: {
                    var5 = stackIn_253_0;
                    var6 = 67 % ((-53 - param0) / 32);
                    if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                      break L19;
                    } else {
                      if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                          this.field_O = 0;
                          break L20;
                        }
                      }
                    }
                    L22: {
                      if (var4 != 0) {
                        break L22;
                      } else {
                        if (var5 != 0) {
                          this.field_T = 0;
                          break L20;
                        } else {
                          break L22;
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L20;
                    } else {
                      if (var5 != 0) {
                        this.field_x = this.field_X << -610966416;
                        this.field_y = this.field_Y << 1214442512;
                        return true;
                      } else {
                        break L20;
                      }
                    }
                  }
                  return false;
                } else {
                  L23: {
                    var5 = 1;
                    var6 = 67 % ((-53 - param0) / 32);
                    if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                      break L23;
                    } else {
                      if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                        this.field_O = 0;
                        return false;
                      }
                    }
                  }
                  if (var4 != 0) {
                    if (var4 != 0) {
                      if (var5 == 0) {
                        return false;
                      } else {
                        this.field_x = this.field_X << -610966416;
                        this.field_y = this.field_Y << 1214442512;
                        return true;
                      }
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
                      this.field_T = 0;
                      return false;
                    }
                  }
                }
              }
            } else {
              L25: {
                var5 = 1;
                var6 = 67 % ((-53 - param0) / 32);
                if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                  break L25;
                } else {
                  if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                    this.field_O = 0;
                    return false;
                  }
                }
              }
              if (var4 != 0) {
                if (var4 != 0) {
                  if (var5 == 0) {
                    return false;
                  } else {
                    this.field_x = this.field_X << -610966416;
                    this.field_y = this.field_Y << 1214442512;
                    return true;
                  }
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
                  this.field_T = 0;
                  return false;
                }
              }
            }
          } else {
            if (var2 >= this.field_y) {
              L27: {
                if (this.field_O < 0) {
                  if (this.field_y >= var2) {
                    stackOut_144_0 = 0;
                    stackIn_145_0 = stackOut_144_0;
                    break L27;
                  } else {
                    stackOut_143_0 = 1;
                    stackIn_145_0 = stackOut_143_0;
                    break L27;
                  }
                } else {
                  stackOut_141_0 = 0;
                  stackIn_145_0 = stackOut_141_0;
                  break L27;
                }
              }
              L28: {
                var4 = stackIn_145_0;
                if (this.field_T != 0) {
                  L29: {
                    if (-1 <= (this.field_T ^ -1)) {
                      break L29;
                    } else {
                      if (this.field_x <= var3) {
                        break L29;
                      } else {
                        stackOut_149_0 = 1;
                        stackIn_157_0 = stackOut_149_0;
                        break L28;
                      }
                    }
                  }
                  if ((this.field_T ^ -1) > -1) {
                    if (this.field_x < var3) {
                      stackOut_155_0 = 1;
                      stackIn_157_0 = stackOut_155_0;
                      break L28;
                    } else {
                      stackOut_154_0 = 0;
                      stackIn_157_0 = stackOut_154_0;
                      break L28;
                    }
                  } else {
                    stackOut_152_0 = 0;
                    stackIn_157_0 = stackOut_152_0;
                    break L28;
                  }
                } else {
                  stackOut_146_0 = 1;
                  stackIn_157_0 = stackOut_146_0;
                  break L28;
                }
              }
              L30: {
                var5 = stackIn_157_0;
                var6 = 67 % ((-53 - param0) / 32);
                if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                  break L30;
                } else {
                  if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                      this.field_O = 0;
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
                      this.field_T = 0;
                      return false;
                    }
                  }
                }
                if (var4 != 0) {
                  if (var5 != 0) {
                    this.field_x = this.field_X << -610966416;
                    this.field_y = this.field_Y << 1214442512;
                    return true;
                  } else {
                    break L31;
                  }
                } else {
                  return false;
                }
              }
              return false;
            } else {
              L34: {
                var4 = 1;
                if (this.field_T != 0) {
                  if (-1 <= (this.field_T ^ -1)) {
                    if ((this.field_T ^ -1) > -1) {
                      if (this.field_x < var3) {
                        L35: {
                          var5 = 1;
                          var6 = 67 % ((-53 - param0) / 32);
                          if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                            break L35;
                          } else {
                            if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                                this.field_O = 0;
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
                                this.field_T = 0;
                                return false;
                              }
                            }
                          }
                          if (var4 != 0) {
                            if (var5 != 0) {
                              this.field_x = this.field_X << -610966416;
                              this.field_y = this.field_Y << 1214442512;
                              return true;
                            } else {
                              break L36;
                            }
                          } else {
                            return false;
                          }
                        }
                        return false;
                      } else {
                        stackOut_104_0 = 0;
                        stackIn_123_0 = stackOut_104_0;
                        break L34;
                      }
                    } else {
                      stackOut_102_0 = 0;
                      stackIn_123_0 = stackOut_102_0;
                      break L34;
                    }
                  } else {
                    if (this.field_x <= var3) {
                      L39: {
                        if ((this.field_T ^ -1) > -1) {
                          if (this.field_x < var3) {
                            stackOut_82_0 = 1;
                            stackIn_84_0 = stackOut_82_0;
                            break L39;
                          } else {
                            stackOut_81_0 = 0;
                            stackIn_84_0 = stackOut_81_0;
                            break L39;
                          }
                        } else {
                          stackOut_79_0 = 0;
                          stackIn_84_0 = stackOut_79_0;
                          break L39;
                        }
                      }
                      L40: {
                        var5 = stackIn_84_0;
                        var6 = 67 % ((-53 - param0) / 32);
                        if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                          break L40;
                        } else {
                          if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                              this.field_O = 0;
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
                              this.field_T = 0;
                              return false;
                            }
                          }
                        }
                        if (var4 != 0) {
                          if (var5 != 0) {
                            this.field_x = this.field_X << -610966416;
                            this.field_y = this.field_Y << 1214442512;
                            return true;
                          } else {
                            break L41;
                          }
                        } else {
                          return false;
                        }
                      }
                      return false;
                    } else {
                      stackOut_77_0 = 1;
                      stackIn_123_0 = stackOut_77_0;
                      break L34;
                    }
                  }
                } else {
                  stackOut_74_0 = 1;
                  stackIn_123_0 = stackOut_74_0;
                  break L34;
                }
              }
              L44: {
                var5 = stackIn_123_0;
                var6 = 67 % ((-53 - param0) / 32);
                if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                  break L44;
                } else {
                  if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                      this.field_O = 0;
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
                      this.field_T = 0;
                      return false;
                    }
                  }
                }
                if (var4 != 0) {
                  if (var5 != 0) {
                    this.field_x = this.field_X << -610966416;
                    this.field_y = this.field_Y << 1214442512;
                    return true;
                  } else {
                    break L45;
                  }
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
            if (this.field_T != 0) {
              if (-1 <= (this.field_T ^ -1)) {
                if ((this.field_T ^ -1) > -1) {
                  if (this.field_x < var3) {
                    L49: {
                      var5 = 1;
                      var6 = 67 % ((-53 - param0) / 32);
                      if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                        break L49;
                      } else {
                        if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                            this.field_O = 0;
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
                            this.field_T = 0;
                            return false;
                          }
                        }
                      }
                      if (var4 != 0) {
                        if (var5 != 0) {
                          this.field_x = this.field_X << -610966416;
                          this.field_y = this.field_Y << 1214442512;
                          return true;
                        } else {
                          break L50;
                        }
                      } else {
                        return false;
                      }
                    }
                    return false;
                  } else {
                    stackOut_35_0 = 0;
                    stackIn_54_0 = stackOut_35_0;
                    break L48;
                  }
                } else {
                  stackOut_33_0 = 0;
                  stackIn_54_0 = stackOut_33_0;
                  break L48;
                }
              } else {
                if (this.field_x <= var3) {
                  L53: {
                    if ((this.field_T ^ -1) > -1) {
                      if (this.field_x < var3) {
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
                    if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
                      break L54;
                    } else {
                      if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                        this.field_O = 0;
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
                        this.field_T = 0;
                        return false;
                      }
                    }
                  }
                  if (var4 != 0) {
                    if (var5 != 0) {
                      this.field_x = this.field_X << -610966416;
                      this.field_y = this.field_Y << 1214442512;
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  stackOut_8_0 = 1;
                  stackIn_54_0 = stackOut_8_0;
                  break L48;
                }
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_54_0 = stackOut_5_0;
              break L48;
            }
          }
          L57: {
            var5 = stackIn_54_0;
            var6 = 67 % ((-53 - param0) / 32);
            if (Math.abs(-var2 + this.field_y) >= hd.field_y) {
              break L57;
            } else {
              if (Math.abs(this.field_x - var3) >= hd.field_y) {
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
                  this.field_O = 0;
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
                  this.field_T = 0;
                  return false;
                }
              }
            }
            if (var4 != 0) {
              if (var5 != 0) {
                this.field_x = this.field_X << -610966416;
                this.field_y = this.field_Y << 1214442512;
                return true;
              } else {
                break L58;
              }
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
            return (String) null;
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
            return (String) null;
          }
        }
    }

    public static void i(int param0) {
        field_P = null;
        field_H = null;
        if (param0 != 0) {
            field_H = (String) null;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        hk.i(1584);
        bi.c(param4, param0, param2, param3);
        if (param1 != 99) {
            field_P = (int[]) null;
        }
    }

    abstract void f(byte param0);

    static {
        field_P = new int[8192];
        field_Q = false;
    }
}

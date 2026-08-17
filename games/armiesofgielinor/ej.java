/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ej extends tc implements mm {
    private jd field_r;
    float[] field_P;
    nn field_l;
    private at field_p;
    private int field_o;
    private int field_L;
    private id[] field_u;
    nn field_U;
    private float[] field_T;
    private int field_B;
    float[][] field_A;
    private int field_q;
    float[][] field_K;
    private int field_t;
    ha field_D;
    float[] field_V;
    static String field_R;
    ir field_m;
    float[][][] field_n;
    private int field_k;
    private sm field_Q;
    private sm field_F;
    private cl field_S;
    private at field_H;
    private float[] field_v;
    static ka field_G;
    private int field_y;
    float[] field_N;
    private float[] field_C;
    private boolean field_w;
    private cl field_M;
    cl field_J;
    float[][][] field_I;
    private at field_O;
    private int field_E;
    private int field_x;
    int field_z;
    private int field_s;

    public static void a(int param0) {
        if (param0 != -27464) {
            ej.b(-7, -126, -85, -67);
        }
        field_R = null;
        field_G = null;
    }

    private final float a(int param0, int param1, int param2, byte param3) {
        float stackIn_64_0 = 0.0f;
        float stackIn_66_0 = 0.0f;
        float stackIn_67_0 = 0.0f;
        float stackIn_67_1 = 0.0f;
        float var5;
        int var6;
        ne var7;
        int var8_int;
        float var8;
        int var9;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < 0) {
            break L0;
          } else {
            if (-1 < (param2 ^ -1)) {
              break L0;
            } else {
              if (param0 >= this.field_D.field_v) {
                break L0;
              } else {
                if (param2 >= this.field_D.field_db) {
                  break L0;
                } else {
                  L1: {
                    if (param3 == -90) {
                      break L1;
                    } else {
                      this.i(104);
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      var5 = 0.0f;
                      var6 = param2 * this.field_D.field_v + param0;
                      var7 = this.field_D.field_Eb[var6];
                      var8_int = param1;
                      if (var8_int != 29) {
                        if (var8_int != 30) {
                          if (-32 != (var8_int ^ -1)) {
                            if ((var8_int ^ -1) == -33) {
                              break L3;
                            } else {
                              if (var8_int == 33) {
                                break L3;
                              } else {
                                L4: {
                                  if ((var8_int ^ -1) == -24) {
                                    break L4;
                                  } else {
                                    if (24 == var8_int) {
                                      break L4;
                                    } else {
                                      L5: {
                                        if (-48 != (var8_int ^ -1)) {
                                          if (48 != var8_int) {
                                            if (-50 != (var8_int ^ -1)) {
                                              if ((var8_int ^ -1) != -51) {
                                                if ((var8_int ^ -1) != -52) {
                                                  if (52 == var8_int) {
                                                    break L5;
                                                  } else {
                                                    if (53 == var8_int) {
                                                      break L5;
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  break L5;
                                                }
                                              } else {
                                                break L5;
                                              }
                                            } else {
                                              break L5;
                                            }
                                          } else {
                                            break L5;
                                          }
                                        } else {
                                          break L5;
                                        }
                                      }
                                      if (var7.field_c == null) {
                                        break L2;
                                      } else {
                                        L6: {
                                          if (uc.field_d[param1][6] > var7.field_c.field_Y) {
                                            stackIn_64_0 = (float)var7.field_c.field_Y;
                                            break L6;
                                          } else {
                                            stackIn_64_0 = (float)uc.field_d[param1][6];
                                            break L6;
                                          }
                                        }
                                        L7: {
                                          var8 = stackIn_64_0;
                                          stackIn_66_0 = var5;

                                          if (this.field_z == var7.field_c.field_O) {
                                            stackIn_67_0 = stackIn_66_0;
                                            stackIn_67_1 = -var8;
                                            break L7;
                                          } else {
                                            stackIn_67_0 = stackIn_66_0;
                                            stackIn_67_1 = var8;
                                            break L7;
                                          }
                                        }
                                        var5 = stackIn_67_0 + stackIn_67_1;
                                        break L2;
                                      }
                                    }
                                  }
                                }
                                if (!var7.c(62)) {
                                  break L2;
                                } else {
                                  if (var7.field_c == null) {
                                    L8: {
                                      var8 = this.a(20, param3 ^ -89, var6);
                                      if (1.0f > var8) {
                                        var8 = 1.0f;
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var5 = var5 + var8;
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    if (null == var7.field_c) {
                      break L2;
                    } else {
                      if (this.field_z != var7.field_c.field_O) {
                        break L2;
                      } else {
                        L9: {
                          L10: {
                            var8_int = 0;
                            if (0 >= param0) {
                              break L10;
                            } else {
                              if (this.field_D.field_Eb[-1 + var6].field_c != null) {
                                break L10;
                              } else {
                                var8_int = 1;
                                break L9;
                              }
                            }
                          }
                          L11: {
                            if ((param2 ^ -1) >= -1) {
                              break L11;
                            } else {
                              if (this.field_D.field_Eb[-this.field_D.field_v + var6].field_c == null) {
                                var8_int = 1;
                                break L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (param2 >= this.field_D.field_db + -1) {
                              break L12;
                            } else {
                              if (null == this.field_D.field_Eb[var6 + this.field_D.field_v].field_c) {
                                var8_int = 1;
                                break L9;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if (-1 + this.field_D.field_v <= param0) {
                            break L9;
                          } else {
                            if (this.field_D.field_Eb[1 + var6].field_c != null) {
                              break L9;
                            } else {
                              var8_int = 1;
                              break L9;
                            }
                          }
                        }
                        if (var7.field_c.field_bb) {
                          var5 = 0.0f;
                          break L2;
                        } else {
                          if (var8_int != 0) {
                            var5 = this.a(var7.field_c.field_N, 1, var6);
                            if (var5 >= 1.0f) {
                              break L2;
                            } else {
                              var5 = 1.0f;
                              break L2;
                            }
                          } else {
                            var5 = 0.0f;
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  return var5;
                }
              }
            }
          }
        }
        return -3.4028234663852886e+38f;
    }

    final boolean a(mn param0, int param1) {
        bd var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0.a(58, this.field_D);
                if (var3 != null) {
                  var3.a(64, this.field_D);
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param1 <= -123) {
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ej.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        float stackIn_7_0 = 0.0f;
        float var4;
        int var5;
        int var6;
        ne var7;
        int var8;
        int var9;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0.0f;
        var5 = param0 % this.field_D.field_v;
        var6 = param0 / this.field_D.field_v;
        var7 = this.field_D.field_Eb[param0];
        if (!var7.a(param1)) {
          return;
        } else {
          L0: {
            if (!var7.d(-60)) {
              break L0;
            } else {
              L1: {
                if (var7.field_a != this.field_z) {
                  stackIn_7_0 = 101.0f;
                  break L1;
                } else {
                  stackIn_7_0 = 0.0f;
                  break L1;
                }
              }
              var4 = stackIn_7_0;
              break L0;
            }
          }
          L2: {
            if (this.field_z != var7.field_a) {
              L3: {
                L4: {
                  if (-10 == (var7.field_h ^ -1)) {
                    break L4;
                  } else {
                    if (-15 == (var7.field_h ^ -1)) {
                      break L4;
                    } else {
                      if (8 != var7.field_h) {
                        break L3;
                      } else {
                        var4 = 21.0f;
                        break L3;
                      }
                    }
                  }
                }
                var4 = 81.0f;
                break L3;
              }
              L5: {
                if (0 <= (var7.field_a ^ -1)) {
                  break L5;
                } else {
                  if (this.field_z == var7.field_a) {
                    break L5;
                  } else {
                    var4 = var4 * this.field_P[9];
                    break L5;
                  }
                }
              }
              if (null == var7.field_c) {
                break L2;
              } else {
                if (var7.field_c.field_O != this.field_z) {
                  break L2;
                } else {
                  if (var7.field_c.i(-21428)) {
                    var4 = 0.0f;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          L6: {
            if (0.0f >= var4) {
              break L6;
            } else {
              var8 = 0;
              L7: while (true) {
                if ((var8 ^ -1) <= -8) {
                  break L6;
                } else {
                  this.field_m.a(-101, var6, (float)param2 * var4, var8, 9, this.field_n, var5);
                  var8++;
                  continue L7;
                }
              }
            }
          }
          this.field_v[param0] = (float)param2 * var4;
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        float[] var7;
        int var8;
        int var9;
        int var10;
        int var11_int;
        float var11;
        int var12;
        int var13;
        int var14;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          var6 = 0;
          if (param1 == -14092) {
            break L0;
          } else {
            this.field_E = 123;
            break L0;
          }
        }
        L1: while (true) {
          if (var6 >= 8) {
            return;
          } else {
            if (this.field_I[var6].length >= param3) {
              var7 = this.field_I[var6][param3 - 1];
              if (var7 != null) {
                var8 = param2 % this.field_D.field_v;
                var9 = param2 / this.field_D.field_v;
                if (param0 != 0) {
                  var10 = 0;
                  var11_int = -param0;
                  L2: while (true) {
                    if (param0 <= var11_int) {
                      var11 = (float)param4 * this.field_P[55] / (float)var10;
                      var12 = -param0;
                      L3: while (true) {
                        if (param0 > var12) {
                          var13 = -param0;
                          L4: while (true) {
                            if (var13 >= param0) {
                              var12++;
                              continue L3;
                            } else {
                              if ((param0 ^ -1) == (Math.abs(var12) + Math.abs(var13) ^ -1)) {
                                if (0 <= var12 + var8) {
                                  if (var13 + var9 >= 0) {
                                    if (this.field_D.field_v > var12 + var8) {
                                      if (var9 - -var13 < this.field_D.field_db) {
                                        this.field_m.a(var7, false, var11, var6, (byte) -4, 0, var9 + var13, var8 + var12);
                                        var13++;
                                        continue L4;
                                      } else {
                                        var13++;
                                        continue L4;
                                      }
                                    } else {
                                      var13++;
                                      continue L4;
                                    }
                                  } else {
                                    var13++;
                                    continue L4;
                                  }
                                } else {
                                  var13++;
                                  continue L4;
                                }
                              } else {
                                var13++;
                                continue L4;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    } else {
                      var12 = -param0;
                      L5: while (true) {
                        if (param0 <= var12) {
                          var11_int++;
                          continue L2;
                        } else {
                          if (param0 == Math.abs(var11_int) + Math.abs(var12)) {
                            if (var8 + var11_int >= 0) {
                              if (var9 + var12 >= 0) {
                                if (this.field_D.field_v > var11_int + var8) {
                                  if (this.field_D.field_db > var12 + var9) {
                                    var10++;
                                    var12++;
                                    continue L5;
                                  } else {
                                    var12++;
                                    continue L5;
                                  }
                                } else {
                                  var12++;
                                  continue L5;
                                }
                              } else {
                                var12++;
                                continue L5;
                              }
                            } else {
                              var12++;
                              continue L5;
                            }
                          } else {
                            var12++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.field_m.a(var7, false, this.field_P[55] * (float)param4, var6, (byte) -4, 0, var9, var8);
                  var6++;
                  continue L1;
                }
              } else {
                var6++;
                continue L1;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean h(int param0) {
        int var2;
        ne[] var3_ref_ne__;
        int var3;
        int var4;
        ne var5;
        int var6;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_t = this.field_t + 1;
        if (-1 > (this.field_D.field_l.b(false) ^ -1)) {
          return false;
        } else {
          if (this.field_w) {
            if (0 == this.field_t % 2) {
              vi.b(-128);
              this.c((byte) -117);
              vi.b(111);
              return false;
            } else {
              return false;
            }
          } else {
            var2 = this.field_k;
            if (var2 == 0) {
              L0: {
                if ((this.field_t ^ -1) <= -31) {
                  this.b(1, 4);
                  break L0;
                } else {
                  break L0;
                }
              }
              return false;
            } else {
              L1: {
                if (1 == var2) {
                  if (-1 == (this.field_t ^ -1)) {
                    L2: {
                      if (0 != this.field_D.field_t[this.field_z].b(false)) {
                        break L2;
                      } else {
                        if (null == this.field_D.field_K) {
                          break L2;
                        } else {
                          var2 = 0;
                          var3_ref_ne__ = this.field_D.field_Eb;
                          var4 = 0;
                          L3: while (true) {
                            L4: {
                              if (var3_ref_ne__.length <= var4) {
                                break L4;
                              } else {
                                var5 = var3_ref_ne__[var4];
                                if (var5.a(this.field_z, (byte) 91)) {
                                  if (var5.d(param0 + 5026)) {
                                    if (null == var5.field_c) {
                                      var2 = 1;
                                      break L4;
                                    } else {
                                      var4++;
                                      continue L3;
                                    }
                                  } else {
                                    var4++;
                                    continue L3;
                                  }
                                } else {
                                  var4++;
                                  continue L3;
                                }
                              }
                            }
                            if (var2 != 0) {
                              break L2;
                            } else {
                              var3 = 0;
                              var4 = 0;
                              L5: while (true) {
                                L6: {
                                  if (this.field_D.field_W <= var4) {
                                    break L6;
                                  } else {
                                    if (var3 != 0) {
                                      break L6;
                                    } else {
                                      if (var4 != this.field_z) {
                                        if (0 != (1 & this.field_D.a((byte) 78) >> var4)) {
                                          if (!this.field_D.c(var4, -16985, this.field_D.field_K.field_w)) {
                                            var3 = 1;
                                            var4++;
                                            continue L5;
                                          } else {
                                            var4++;
                                            continue L5;
                                          }
                                        } else {
                                          var4++;
                                          continue L5;
                                        }
                                      } else {
                                        var4++;
                                        continue L5;
                                      }
                                    }
                                  }
                                }
                                L7: {
                                  if (var3 == 0) {
                                    this.field_D.a(0, this.field_D.field_u | 1 << this.field_z);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                this.b(7, param0 ^ -5090);
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                    this.field_S = null;
                    this.field_o = 0;
                    this.field_w = true;
                    this.field_M = (cl) ((Object) this.field_p.e((byte) 122));
                    this.field_L = 0;
                    this.b(2, 4);
                    break L1;
                  } else {
                    this.field_L = 0;
                    this.b(2, 4);
                    break L1;
                  }
                } else {
                  if ((var2 ^ -1) == -3) {
                    this.a(-113, false);
                    break L1;
                  } else {
                    if ((var2 ^ -1) != -9) {
                      if (3 == var2) {
                        if (-1 == (this.field_t ^ -1)) {
                          this.a(this.field_p, 0);
                          this.field_S = null;
                          this.field_M = (cl) ((Object) this.field_p.e((byte) 127));
                          this.f(0);
                          break L1;
                        } else {
                          this.f(0);
                          break L1;
                        }
                      } else {
                        if (-5 == (var2 ^ -1)) {
                          this.a(param0 + 4972, true);
                          break L1;
                        } else {
                          if (var2 != 5) {
                            if (-7 != (var2 ^ -1)) {
                              if (var2 != 7) {
                                break L1;
                              } else {
                                if (-51 < (this.field_t ^ -1)) {
                                  return false;
                                } else {
                                  return true;
                                }
                              }
                            } else {
                              this.e(-24236);
                              break L1;
                            }
                          } else {
                            this.i(0);
                            break L1;
                          }
                        }
                      }
                    } else {
                      this.g(-25523);
                      break L1;
                    }
                  }
                }
              }
              if (param0 == -5094) {
                return false;
              } else {
                return false;
              }
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        if (!(null != this.field_D.field_K)) {
            this.b(param1 ? 5 : 8, 4);
            return;
        }
        this.a(param1, this.field_L, 23);
        if (param0 > -89) {
            this.field_H = (at) null;
        }
        this.field_L = this.field_L + 1;
        if (5 <= this.field_L) {
            this.field_L = 0;
            this.b(!param1 ? 8 : 5, 4);
        }
    }

    final sm a(cl param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        sm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 29 % ((param1 - -27) / 60);
            stackIn_1_0 = this.field_Q;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ej.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final void c(byte param0) {
        int stackIn_48_0 = 0;
        float[][] stackIn_51_0 = null;
        int var2;
        float[] var2_ref_float__;
        Object var3;
        int var3_int;
        int var4;
        float[] var4_ref_float__;
        float[][] var5;
        int var5_int;
        tc var6;
        int var7;
        float[] var8;
        float[] var9;
        ne var10;
        ne var11;
        jd var12;
        float[][] var13;
        float[] var14;
        float[][] var15;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-1 != (this.field_o ^ -1)) {
          L0: {
            if (this.field_o == 1) {
              if (this.field_D.field_W <= this.field_x) {
                this.field_o = this.field_o + 1;
                break L0;
              } else {
                L1: {
                  var2 = this.field_x;
                  var12 = this.field_r;
                  var3 = var12;
                  if (this.field_D.o(var2, -1) != this.field_D.o(this.field_z, -1)) {
                    stackIn_48_0 = 0;
                    break L1;
                  } else {
                    stackIn_48_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  var4 = stackIn_48_0;
                  if (var4 == 0) {
                    stackIn_51_0 = this.field_K;
                    break L2;
                  } else {
                    stackIn_51_0 = this.field_A;
                    break L2;
                  }
                }
                L3: {
                  var15 = stackIn_51_0;
                  var13 = var15;
                  var5 = var13;
                  if (-9 > (this.field_s ^ -1)) {
                    L4: {
                      if (var12 == null) {
                        var6 = this.field_D.field_t[var2].field_d.field_b;
                        break L4;
                      } else {
                        var6 = var12.field_b;
                        break L4;
                      }
                    }
                    L5: {
                      if (!(var6 instanceof jd)) {
                        var3 = null;
                        break L5;
                      } else {
                        var3 = (jd) ((Object) var6);
                        break L5;
                      }
                    }
                    this.field_r = (jd) (var3);
                    this.field_s = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (var3 == null) {
                  this.field_x = this.field_x + 1;
                  this.field_s = 9;
                  break L0;
                } else {
                  L6: {
                    if (((jd) (var3)).field_S) {
                      break L6;
                    } else {
                      if (0 != this.field_s) {
                        if (var4 != 0) {
                          this.field_s = 8;
                          break L6;
                        } else {
                          this.a(1, -1 + this.field_s, 19551, (jd) (var3));
                          break L6;
                        }
                      } else {
                        this.field_m.a(var15, 1, -19545, (jd) (var3));
                        break L6;
                      }
                    }
                  }
                  this.field_s = this.field_s + 1;
                  ((jd) (var3)).field_X = false;
                  break L0;
                }
              }
            } else {
              if ((this.field_o ^ -1) != -3) {
                if (-4 == (this.field_o ^ -1)) {
                  var2 = 0;
                  L7: while (true) {
                    if (this.field_I.length <= var2) {
                      var2 = 0;
                      L8: while (true) {
                        if (var2 >= this.field_D.field_Eb.length) {
                          this.field_o = this.field_o + 1;
                          break L0;
                        } else {
                          L9: {
                            var11 = this.field_D.field_Eb[var2];
                            var4 = var11.a((byte) -107);
                            if ((var4 ^ -1) == -1) {
                              break L9;
                            } else {
                              this.a(var4, 1, var2, 29);
                              break L9;
                            }
                          }
                          if (null != var11.field_c) {
                            var4 = var11.field_c.field_E;
                            if (-1 != (var4 ^ -1)) {
                              this.a(3, -14092, var2, var4, 1);
                              var2++;
                              continue L8;
                            } else {
                              var2++;
                              continue L8;
                            }
                          } else {
                            var2++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      var3_int = 0;
                      L10: while (true) {
                        if (var3_int >= this.field_I[var2].length) {
                          var2++;
                          continue L7;
                        } else {
                          if (null != this.field_I[var2][var3_int]) {
                            var4 = 0;
                            L11: while (true) {
                              if (this.field_I[var2][var3_int].length > var4) {
                                this.field_I[var2][var3_int][var4] = 0.0f;
                                var4++;
                                continue L11;
                              } else {
                                var3_int++;
                                continue L10;
                              }
                            }
                          } else {
                            var3_int++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.field_w = false;
                  this.field_o = 0;
                  break L0;
                }
              } else {
                var2 = 0;
                L12: while (true) {
                  if (this.field_V.length <= var2) {
                    var14 = this.field_n[0][9];
                    var9 = var14;
                    var8 = var9;
                    var2_ref_float__ = var8;
                    var3_int = 0;
                    L13: while (true) {
                      if (var3_int >= var14.length) {
                        var3_int = 0;
                        L14: while (true) {
                          if (var3_int >= this.field_D.field_Eb.length) {
                            this.field_o = this.field_o + 1;
                            break L0;
                          } else {
                            var4_ref_float__ = this.field_C;
                            var5_int = var3_int;
                            this.field_T[var3_int] = 0.0f;
                            var4_ref_float__[var5_int] = 0.0f;
                            var10 = this.field_D.field_Eb[var3_int];
                            var11 = var10;
                            var11 = var10;
                            this.a(var3_int, false, 1);
                            if (!var10.d(-16)) {
                              var3_int++;
                              continue L14;
                            } else {
                              var3_int++;
                              continue L14;
                            }
                          }
                        }
                      } else {
                        var8[var3_int] = 0.0f;
                        var3_int++;
                        continue L13;
                      }
                    }
                  } else {
                    this.field_V[var2] = 0.0f;
                    var2++;
                    continue L12;
                  }
                }
              }
            }
          }
          var2 = 9 % ((param0 - -68) / 49);
          return;
        } else {
          this.a((byte) 108, this.field_A);
          this.a((byte) 111, this.field_K);
          var2 = 0;
          L15: while (true) {
            if (this.field_n.length <= var2) {
              this.field_o = this.field_o + 1;
              this.field_x = 0;
              this.field_s = 9;
              this.field_r = null;
              return;
            } else {
              this.a((byte) 73, this.field_n[var2]);
              var2++;
              continue L15;
            }
          }
        }
    }

    private final void g(int param0) {
        cl var3 = null;
        if (null == this.field_M) {
            this.b(3, param0 ^ -25527);
            return;
        }
        if (this.field_M.field_o.field_S || this.field_M.field_o.field_O != this.field_z) {
            var3 = (cl) ((Object) this.field_p.a((byte) 123));
            cl var2 = var3;
            this.field_M.d(-115);
            this.field_M = var3;
            return;
        }
        if (param0 != -25523) {
            this.field_m = (ir) null;
        }
        this.field_M.f(-119);
        this.field_S = this.field_M;
        this.field_M = (cl) ((Object) this.field_p.a((byte) 123));
    }

    private final void a(int param0, jd param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 > 56) {
              var4_int = 0;
              L1: while (true) {
                if (-9 >= (var4_int ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.a(param2, var4_int, 19551, param1);
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ej.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(jd param0, byte param1) {
        try {
            if (param1 != -2) {
                field_G = (ka) null;
            }
            this.a(80, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ej.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, boolean param3) {
        Object var5;
        int var6;
        float[][] var6_ref_float____;
        int var7_int;
        jd var7;
        cl var8;
        float[][][] var8_array;
        int var9;
        float[][] var10;
        int var11;
        float[][][] var12;
        int var13;
        float[][] var14;
        float[][][] var15;
        float[][] var16;
        float[][] var17;
        float[][][] var18;
        float[][] var19;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!param3) {
            break L0;
          } else {
            this.field_o = 0;
            this.field_w = true;
            L1: while (true) {
              if (!this.field_w) {
                break L0;
              } else {
                this.c((byte) 29);
                continue L1;
              }
            }
          }
        }
        L2: {
          var5 = null;
          if (param2 == 18) {
            break L2;
          } else {
            this.f(22);
            break L2;
          }
        }
        var6 = 0;
        L3: while (true) {
          if (var6 >= fs.field_b.length) {
            L4: {
              var7_int = param0;
              if (-1 == (var7_int ^ -1)) {
                break L4;
              } else {
                if ((var7_int ^ -1) != -2) {
                  if ((var7_int ^ -1) == -3) {
                    var5 = this.field_K[param1];
                    break L4;
                  } else {
                    if ((var7_int ^ -1) != -4) {
                      if ((var7_int ^ -1) == -5) {
                        var5 = null;
                        if (rd.field_j == null) {
                          break L4;
                        } else {
                          var7 = rd.field_j.field_T;
                          if (var7 == null) {
                            break L4;
                          } else {
                            var8 = (cl) ((Object) this.field_p.e((byte) 114));
                            L5: while (true) {
                              if (var8 == null) {
                                break L4;
                              } else {
                                if (var7 != var8.field_o) {
                                  var8 = (cl) ((Object) this.field_p.a((byte) 123));
                                  continue L5;
                                } else {
                                  var8.a(false, (byte) -127);
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      var17 = this.field_I[1];
                      var14 = var17;
                      var6_ref_float____ = var14;
                      if (var6_ref_float____ == null) {
                        break L4;
                      } else {
                        if (0 >= var17.length) {
                          break L4;
                        } else {
                          var7_int = param1 % var17.length;
                          var18 = this.field_I;
                          var15 = var18;
                          var12 = var15;
                          var8_array = var12;
                          var9 = 0;
                          L6: while (true) {
                            if (var9 >= var18.length) {
                              break L4;
                            } else {
                              var19 = var18[var9];
                              var16 = var19;
                              var10 = var16;
                              if (var10 != null) {
                                if (var7_int < var19.length) {
                                  if (var19[var7_int] != null) {
                                    var5 = var19[var7_int];
                                    break L4;
                                  } else {
                                    var9++;
                                    continue L6;
                                  }
                                } else {
                                  var9++;
                                  continue L6;
                                }
                              } else {
                                var9++;
                                continue L6;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var5 = this.field_n[param1 % this.field_n[4].length][9];
                  break L4;
                }
              }
            }
            L7: {
              if (var5 == null) {
                break L7;
              } else {
                var13 = 0;
                var6 = var13;
                L8: while (true) {
                  if (java.lang.reflect.Array.getLength(var5) <= var13) {
                    break L7;
                  } else {
                    fs.field_b[var13] = ((float[]) (var5))[var13];
                    var13++;
                    continue L8;
                  }
                }
              }
            }
            return;
          } else {
            fs.field_b[var6] = 0.0f;
            var6++;
            continue L3;
          }
        }
    }

    private final float a(int param0, int param1, int param2) {
        float var4;
        int var5;
        int var6;
        float var7;
        float var8;
        float var9;
        float var10;
        int var11;
        int var12;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = 0.0f;
          var5 = 0;
          var6 = bw.field_m[param0][0];
          var4 = var4 + this.field_P[43] * (this.field_K[8][param2] * (float)fk.field_d[var6][0]);
          if (var5 == 0) {
            break L0;
          } else {
            System.out.println("Analyzing " + dn.field_Pb[param0] + " base score " + var4);
            break L0;
          }
        }
        var7 = 0.0f;
        var8 = 0.0f;
        var9 = (float)param1;
        var10 = 1.0f;
        var11 = 0;
        L1: while (true) {
          if (8 <= var11) {
            L2: {
              if (var5 == 0) {
                break L2;
              } else {
                System.out.println("summoning enemy vuln: " + var7 + ", total " + var9);
                break L2;
              }
            }
            L3: {
              var4 = var4 + var7 / var9;
              if (var5 == 0) {
                break L3;
              } else {
                System.out.println("summoning enemy power: " + var8 + ", total " + var10);
                break L3;
              }
            }
            L4: {
              var4 = var4 - var8 / var10;
              if (var5 != 0) {
                System.out.println("Damage-wise: " + dn.field_Pb[param0] + " score " + var4);
                break L4;
              } else {
                break L4;
              }
            }
            return var4;
          } else {
            L5: {
              L6: {
                var9 = var9 + this.field_n[var6][var11][param2];
                var10 = var10 + this.field_K[var11][param2];
                if ((var11 ^ -1) != -5) {
                  break L6;
                } else {
                  if (!c.a(param0, (byte) -69)) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              var7 = var7 + this.field_n[var6][var11][param2] * (float)fk.field_d[var6][var11] * this.field_P[28];
              break L5;
            }
            L7: {
              if (var6 != 4) {
                break L7;
              } else {
                if (4 == var11) {
                  break L7;
                } else {
                  if (2 == var11) {
                    break L7;
                  } else {
                    if (-4 == (var11 ^ -1)) {
                      break L7;
                    } else {
                      var11++;
                      continue L1;
                    }
                  }
                }
              }
            }
            var8 = var8 + this.field_K[var11][param2] * (float)fk.field_d[var11][var6] * this.field_P[29];
            var11++;
            continue L1;
          }
        }
    }

    private final void e(int param0) {
        jd var2;
        int[] var3;
        L0: {
          if (param0 == -24236) {
            break L0;
          } else {
            var3 = (int[]) null;
            this.a((int[]) null, -30, (byte) -27);
            break L0;
          }
        }
        L1: {
          var2 = this.field_D.c(this.field_y, true, this.field_E);
          if (var2 != null) {
            this.a(80, var2);
            this.b(3, param0 + 24240);
            break L1;
          } else {
            if (this.field_t > this.field_B - -100) {
              this.b(7, 4);
              break L1;
            } else {
              break L1;
            }
          }
        }
    }

    private final void a(int[] param0, int param1, byte param2) {
        cl discarded$1 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (param0.length <= var4_int) {
                L2: {
                  if (param2 >= 79) {
                    break L2;
                  } else {
                    var8 = (jd) null;
                    discarded$1 = this.b((jd) null, (byte) -90);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = 0;
                  if (-1 != param0[var4_int]) {
                    var6 = 0;
                    L4: while (true) {
                      L5: {
                        if (var6 >= var4_int) {
                          break L5;
                        } else {
                          if (param0[var4_int] != param0[var6]) {
                            var6++;
                            continue L4;
                          } else {
                            var5 = 1;
                            break L5;
                          }
                        }
                      }
                      if (var5 == 0) {
                        this.a(param0[var4_int], false, param1);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ej.J(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, float[][] param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = -13 % ((30 - param0) / 40);
            L1: while (true) {
              if (param1.length <= var3_int) {
                break L0;
              } else {
                var5 = 0;
                L2: while (true) {
                  if (param1[var3_int].length <= var5) {
                    var3_int++;
                    continue L1;
                  } else {
                    param1[var3_int][var5] = 0.0f;
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ej.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static int a(bv param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_G = (ka) null;
                break L1;
              }
            }
            var2_int = de.a(-108, param0, 4, 14, 30, 20);
            stackIn_3_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ej.H(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void c(jd param0, byte param1) {
        cl var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = 123 % ((param1 - 53) / 41);
            var3 = (cl) ((Object) this.field_p.e((byte) 95));
            L1: while (true) {
              if (var3 == null) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (var3.field_o == param0) {
                  var3.a(false, (byte) -124);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = (cl) ((Object) this.field_p.a((byte) 123));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("ej.EA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int statePc = 0;
        int var4 = 0;
        sm var5 = null;
        int var6 = 0;
        jb var7 = null;
        int var8_int = 0;
        wa var8 = null;
        int var9_int = 0;
        to var9 = null;
        float var10 = 0.0f;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (this.field_D == null) {
                        statePc = 68;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_D.field_B[this.field_z] == null) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (param2 == 23) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    var4 = this.field_D.field_B[this.field_z][param1];
                    if (var4 != -1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    var5 = this.field_F;
                    var5.b((byte) -120);
                    if (!param0) {
                        statePc = 10;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var8_int = var4;
                    if (var8_int != 29) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var6 = uc.field_d[var4][7];
                    var8_int = var6;
                    if (-var6 + this.field_D.field_db <= var8_int) {
                        statePc = 65;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var9_int = var6;
                    if (this.field_D.field_v + -var6 > var9_int) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var8_int++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 14: {
                    var10 = 0.0f;
                    var11 = -var6 + var8_int;
                    if (var8_int - -var6 < var11) {
                        statePc = 61;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var12 = -var6 + var9_int;
                    if (var9_int + var6 >= var12) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var11++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 17: {
                    var10 = var10 + this.a(var12, var4, var11, (byte) -90);
                    var12++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 18: {
                    if (var8_int == 30) {
                        statePc = 49;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (31 == var8_int) {
                        statePc = 49;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (-33 == (var8_int ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (33 == var8_int) {
                        statePc = 49;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var8_int == 23) {
                        statePc = 49;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var8_int != 24) {
                        statePc = 25;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if ((var8_int ^ -1) != -48) {
                        statePc = 27;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (48 == var8_int) {
                        statePc = 49;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (49 != var8_int) {
                        statePc = 36;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var6 = uc.field_d[var4][7];
                    var8_int = var6;
                    if (-var6 + this.field_D.field_db <= var8_int) {
                        statePc = 65;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var9_int = var6;
                    if (this.field_D.field_v + -var6 > var9_int) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var8_int++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 32: {
                    var10 = 0.0f;
                    var11 = -var6 + var8_int;
                    if (var8_int - -var6 < var11) {
                        statePc = 61;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var12 = -var6 + var9_int;
                    if (var9_int + var6 >= var12) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var11++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 35: {
                    var10 = var10 + this.a(var12, var4, var11, (byte) -90);
                    var12++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 36: {
                    if (50 != var8_int) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var6 = uc.field_d[var4][7];
                    var8_int = var6;
                    if (-var6 + this.field_D.field_db <= var8_int) {
                        statePc = 65;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var9_int = var6;
                    if (this.field_D.field_v + -var6 > var9_int) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var8_int++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 40: {
                    var10 = 0.0f;
                    var11 = -var6 + var8_int;
                    if (var8_int - -var6 < var11) {
                        statePc = 61;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var12 = -var6 + var9_int;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (var9_int + var6 >= var12) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var11++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 44: {
                    var10 = var10 + this.a(var12, var4, var11, (byte) -90);
                    var12++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 45: {
                    if (var8_int == 51) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (52 == var8_int) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if ((var8_int ^ -1) == -54) {
                        statePc = 49;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var6 = uc.field_d[var4][7];
                    var8_int = var6;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (-var6 + this.field_D.field_db <= var8_int) {
                        statePc = 65;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var9_int = var6;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (this.field_D.field_v + -var6 > var9_int) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var8_int++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 54: {
                    var10 = 0.0f;
                    var11 = -var6 + var8_int;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var8_int - -var6 < var11) {
                        statePc = 61;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var12 = -var6 + var9_int;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var9_int + var6 >= var12) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var11++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 59: {
                    var10 = var10 + this.a(var12, var4, var11, (byte) -90);
                    var12++;
                    statePc = 57;
                    continue stateLoop;
                }
                case 61: {
                    if (var10 != 0.0f) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var9_int++;
                    statePc = 52;
                    continue stateLoop;
                }
                case 63: {
                    var5.a(param1, var9_int, var8_int, var10, (byte) 71, this.field_z);
                    var9_int++;
                    statePc = 52;
                    continue stateLoop;
                }
                case 65: {
                    var7 = var5.a((byte) -102);
                    if (var7 == null) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    this.field_D.field_J = true;
                    var8 = new wa(var4, var7.field_s, var7.field_q);
                    var9 = new to(var8, -1, this.field_z);
                    this.a(var9, -126);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    return;
                }
                case 68: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, jd param1) {
        cl var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (param1 != null) {
              if (this.field_z != param1.field_O) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1.field_p == null) {
                    break L1;
                  } else {
                    if (this != param1.field_p.field_r) {
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                L2: {
                  var3 = this.b(param1, (byte) -98);
                  var3.f(param0 ^ 14);
                  if (param0 == 80) {
                    break L2;
                  } else {
                    ej.a(-94);
                    break L2;
                  }
                }
                L3: {
                  this.field_m.a(this.field_A, 1, param0 ^ -19465, var3.field_o);
                  if (6 != this.field_k) {
                    break L3;
                  } else {
                    this.b(3, 4);
                    this.field_M = (cl) ((Object) this.field_p.a(true, var3));
                    this.field_t = 2;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("ej.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void f(int param0) {
        int var2_int;
        float var2;
        int var3;
        int var4;
        int var5;
        jd var6;
        jd var7;
        jd var8;
        L0: {
          if (null != this.field_S) {
            L1: {
              if (this.field_S.field_o.field_X) {
                L2: {
                  if (this.field_S.field_o.field_S) {
                    break L2;
                  } else {
                    this.field_m.a(this.field_A, 1, -19545, this.field_S.field_o);
                    if (this.field_S.field_o.field_E == 0) {
                      break L2;
                    } else {
                      this.a(3, -14092, this.field_D.field_v * this.field_S.field_o.field_w + this.field_S.field_o.field_J, this.field_S.field_o.field_E, 1);
                      break L2;
                    }
                  }
                }
                this.field_S.field_o.field_X = false;
                var2_int = this.field_S.field_u;
                var3 = this.field_S.field_n;
                var4 = this.field_S.field_m;
                this.a(new int[]{var2_int, var3, var4}, -1, (byte) 113);
                this.field_S.field_n = -1;
                this.field_S.field_u = -1;
                this.field_S.field_m = -1;
                break L1;
              } else {
                break L1;
              }
            }
            var7 = this.field_S.field_l;
            var8 = var7;
            if (var8 != null) {
              if (var8.field_X) {
                L3: {
                  this.field_m.a(this.field_K, 1, -19545, var8);
                  if (var8.field_E == 0) {
                    break L3;
                  } else {
                    this.a(3, -14092, var8.field_w * this.field_D.field_v + var8.field_J, var8.field_E, 1);
                    break L3;
                  }
                }
                this.a(66, var8, 1);
                this.field_m.a(this.field_n[var7.g(0)], 1, param0 + -19545, var8);
                var8.field_X = false;
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        this.field_S = this.field_M;
        if (param0 == 0) {
          if (null != this.field_M) {
            L4: {
              this.field_J = this.field_M;
              var2 = this.field_M.a(true, (byte) -124);
              if (-3.4028234663852886e+38f == var2) {
                break L4;
              } else {
                L5: {
                  this.field_m.a(this.field_A, -1, param0 ^ -19545, this.field_M.field_o);
                  var3 = this.field_M.field_o.field_w * this.field_D.field_v + this.field_M.field_o.field_J;
                  if (this.field_M.field_o.field_E != 0) {
                    this.a(3, -14092, var3, this.field_M.field_o.field_E, -1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4 = -1;
                  var5 = -1;
                  var6 = this.field_M.field_l;
                  if (var6 == null) {
                    break L6;
                  } else {
                    this.field_m.a(this.field_K, -1, -19545, var6);
                    this.a(77, var6, -1);
                    var4 = this.field_D.field_v * var6.field_w + var6.field_J;
                    if (var6.field_E != 0) {
                      this.a(3, -14092, var4, var6.field_E, -1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (!this.field_M.field_k.a(0)) {
                    break L7;
                  } else {
                    var5 = this.field_M.field_k.field_s + this.field_D.field_v * this.field_M.field_k.field_q;
                    break L7;
                  }
                }
                this.a(new int[]{var3, var4, var5}, -1, (byte) 98);
                this.field_M.field_n = var4;
                this.field_M.field_m = var5;
                this.field_M.field_u = var3;
                this.field_M.g(4);
                this.field_M.field_o.field_X = true;
                if (var6 == null) {
                  break L4;
                } else {
                  var6.field_X = true;
                  break L4;
                }
              }
            }
            L8: {
              L9: {
                if (-3.4028234663852886e+38f == var2) {
                  break L9;
                } else {
                  if (this.field_M.field_k.field_r == -2) {
                    break L9;
                  } else {
                    if (this.field_M.field_o.field_B > 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              this.field_M = (cl) ((Object) this.field_p.a((byte) 123));
              break L8;
            }
            return;
          } else {
            this.b(4, param0 + 4);
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0) {
        int var2_int;
        jd var2;
        jd var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.b(0, param0 + 127);
        this.field_q = 0;
        this.field_H.b(param0 ^ -28);
        this.field_O.b(param0 ^ -42);
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= this.field_D.field_t.length) {
            L1: {
              if (param0 == -123) {
                break L1;
              } else {
                this.field_D = (ha) null;
                break L1;
              }
            }
            var2 = (jd) ((Object) this.field_D.field_t[this.field_z].e((byte) 99));
            L2: while (true) {
              if (var2 == null) {
                this.field_M = (cl) ((Object) this.field_p.e((byte) 108));
                this.field_S = null;
                return;
              } else {
                L3: {
                  if (var2.field_p == null) {
                    break L3;
                  } else {
                    if (this != var2.field_p.field_r) {
                      var2.field_p.d(param0 ^ -11);
                      var2.field_p = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var2.field_p != null) {
                    break L4;
                  } else {
                    var2.field_p = new cl((ej) (this), var2);
                    this.field_p.a(param0 + 873, var2.field_p);
                    break L4;
                  }
                }
                var2 = (jd) ((Object) this.field_D.field_t[this.field_z].a((byte) 123));
                continue L2;
              }
            }
          } else {
            var3 = (jd) ((Object) this.field_D.field_t[var2_int].e((byte) 112));
            L5: while (true) {
              if (var3 == null) {
                var2_int++;
                continue L0;
              } else {
                var3.field_X = true;
                var3 = (jd) ((Object) this.field_D.field_t[var2_int].a((byte) 123));
                continue L5;
              }
            }
          }
        }
    }

    private final void a(at param0, int param1) {
        int var3_int = 0;
        Object var4 = null;
        cl var4_ref = null;
        Object var5 = null;
        cl var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (var3_int == 0) {
                L2: {
                  if (param1 == 0) {
                    break L2;
                  } else {
                    this.field_t = 6;
                    break L2;
                  }
                }
                break L0;
              } else {
                var3_int = 0;
                var4 = null;
                var5_ref = (cl) ((Object) this.field_p.e((byte) 113));
                L3: while (true) {
                  if (var5_ref == null) {
                    continue L1;
                  } else {
                    var4_ref = (cl) ((Object) this.field_p.a((byte) 123));
                    if (var4_ref == null) {
                      continue L1;
                    } else {
                      L4: {
                        if (var5_ref.a((byte) -87, var4_ref)) {
                          var5_ref.d(-122);
                          var3_int = 1;
                          ro.a(var4_ref, var5_ref, true);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var5_ref = var4_ref;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ej.AA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param3 != 29) {
            cl var6 = (cl) null;
            this.a((cl) null, (byte) -87);
        }
        this.a(0, param3 ^ -14103, param2, param0, param1);
    }

    private final void i(int param0) {
        int stackIn_62_0 = 0;
        float var3;
        double var4;
        double var6;
        double var8;
        double var10;
        int var12;
        int var13_int;
        jb var13;
        int var14;
        int[] var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        float var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        jd var29;
        cl var30;
        float var31;
        int var32;
        Object var33;
        sm var34;
        ne var35;
        ne var36;
        jd var37;
        L0: {
          var33 = null;
          var32 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            this.field_T = (float[]) null;
            break L0;
          }
        }
        L1: {
          var34 = this.field_F;
          if ((this.field_D.field_H[this.field_z] + -this.field_q ^ -1) <= -51) {
            var3 = 1.401298464324817e-45f;
            var4 = 0.3;
            var6 = 0.0;
            var8 = 0.0;
            var10 = 0.0;
            var34.b((byte) -122);
            var37 = (jd) ((Object) this.field_D.field_t[this.field_z].e((byte) 89));
            L2: while (true) {
              if (var37 == null) {
                var13_int = 0;
                L3: while (true) {
                  if (this.field_D.field_Eb.length <= var13_int) {
                    var12 = 0;
                    var13_int = 0;
                    L4: while (true) {
                      if (this.field_D.field_Eb.length <= var13_int) {
                        L5: {
                          if (var12 == 0) {
                            break L5;
                          } else {
                            var13 = var34.a((byte) -84);
                            if (var13 == null) {
                              break L5;
                            } else {
                              this.b(6, 4);
                              this.field_B = this.field_t;
                              var14 = var13.field_r;
                              var13.a((byte) 5, (ej) (this));
                              if (var14 == -1) {
                                break L5;
                              } else {
                                if (0 <= var14) {
                                  this.field_q = this.field_q + bw.field_m[var14][8];
                                  break L5;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        }
                        this.b(7, param0 ^ 4);
                        break L1;
                      } else {
                        var36 = this.field_D.field_Eb[var13_int];
                        if (null == var36.field_c) {
                          if (var36.d(-37)) {
                            if (this.field_z == var36.field_a) {
                              var15 = this.field_D.field_E[this.field_z];
                              var16 = var13_int % this.field_D.field_v;
                              var17 = var13_int / this.field_D.field_v;
                              var18 = 0;
                              L6: while (true) {
                                if (-76 < (var18 ^ -1)) {
                                  if ((var18 ^ -1) != -73) {
                                    if (-40 != (var18 ^ -1)) {
                                      if ((var18 ^ -1) != -8) {
                                        if (-35 != (var18 ^ -1)) {
                                          if (-52 != (var18 ^ -1)) {
                                            if (var18 != 27) {
                                              L7: {
                                                var19 = bw.field_m[var18][1];
                                                if ((var36.field_h ^ -1) != -12) {
                                                  break L7;
                                                } else {
                                                  if (var36.field_g == var19) {
                                                    break L7;
                                                  } else {
                                                    var18++;
                                                    continue L6;
                                                  }
                                                }
                                              }
                                              L8: {
                                                if (-1 == var19) {
                                                  if ((this.field_D.field_a[this.field_z][var19 + 1] & 1 << b.a(false, var18)) != 0) {
                                                    break L8;
                                                  } else {
                                                    var18++;
                                                    continue L6;
                                                  }
                                                } else {
                                                  break L8;
                                                }
                                              }
                                              L9: {
                                                var20 = this.field_D.b(var17, -26813, var18, var16, this.field_z) ? 1 : 0;
                                                var21 = var20;
                                                if (var20 != 0) {
                                                  break L9;
                                                } else {
                                                  L10: {
                                                    this.field_D.field_H[this.field_z] = this.field_D.field_H[this.field_z] + this.field_D.k(-116, this.field_z);
                                                    if (!this.field_D.b(var17, param0 ^ -26813, var18, var16, this.field_z)) {
                                                      stackIn_62_0 = 0;
                                                      break L10;
                                                    } else {
                                                      stackIn_62_0 = 1;
                                                      break L10;
                                                    }
                                                  }
                                                  var21 = stackIn_62_0;
                                                  this.field_D.field_H[this.field_z] = this.field_D.field_H[this.field_z] - this.field_D.k(-101, this.field_z);
                                                  break L9;
                                                }
                                              }
                                              if (var21 != 0) {
                                                L11: {
                                                  var22 = 0.0f;
                                                  var23 = bw.field_m[var18][4];
                                                  var22 = var22 + (float)var23 * this.field_P[26];
                                                  var22 = this.a(var18, 1, var13_int);
                                                  var25 = bw.field_m[var18][1];
                                                  if (0 == (var25 ^ -1)) {
                                                    break L11;
                                                  } else {
                                                    var24 = var15[var25];
                                                    if (var24 == bw.field_m[var18][2]) {
                                                      var22 = var22 + (float)var24 * this.field_P[23];
                                                      break L11;
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                }
                                                L12: {
                                                  var22 = var22 - this.field_P[25] * (float)bw.field_m[var18][8] * 0.029999999329447746f;
                                                  var26 = bw.field_m[var18][10];
                                                  var27 = bw.field_m[var18][12];
                                                  if (18 == var27) {
                                                    var22 = var22 - this.field_P[45];
                                                    break L12;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                                L13: {
                                                  L14: {
                                                    if ((var26 & 2) != 0) {
                                                      break L14;
                                                    } else {
                                                      if ((16 & var26) == 0) {
                                                        break L13;
                                                      } else {
                                                        break L14;
                                                      }
                                                    }
                                                  }
                                                  var22 = (float)((double)var22 + var8);
                                                  var28 = 0;
                                                  L15: while (true) {
                                                    if (var28 >= 8) {
                                                      break L13;
                                                    } else {
                                                      var22 = var22 + this.field_P[15] * this.field_A[var28][var13_int];
                                                      var28++;
                                                      continue L15;
                                                    }
                                                  }
                                                }
                                                L16: {
                                                  if (-1 != (32 & var26 ^ -1)) {
                                                    var22 = (float)((double)var22 + var10);
                                                    break L16;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                                L17: {
                                                  if (21 == var18) {
                                                    var22 = (float)((double)var22 + var6);
                                                    break L17;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                                L18: {
                                                  L19: {
                                                    if (var18 == 0) {
                                                      break L19;
                                                    } else {
                                                      if (3 != var18) {
                                                        break L18;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  var22 = (float)((double)var22 + var4);
                                                  var28 = 0;
                                                  L20: while (true) {
                                                    if (var28 >= 8) {
                                                      break L18;
                                                    } else {
                                                      var22 = var22 + this.field_P[44] * this.field_A[var28][var13_int];
                                                      var22 = var22 - this.field_K[var28][var13_int] * this.field_P[44];
                                                      var28++;
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                                L21: {
                                                  var28 = 1;
                                                  if ((var18 ^ -1) != -75) {
                                                    break L21;
                                                  } else {
                                                    var28 = 2;
                                                    break L21;
                                                  }
                                                }
                                                var29 = new jd(var16, var17, var18, this.field_z, var23, var23, var28, 0, 0, this.field_D, 0, 0, -1, true, 0);
                                                var30 = new cl((ej) (this), var29);
                                                var30.f(-86);
                                                var31 = var30.a(false, (byte) -127);
                                                var22 = var22 + var31;
                                                if (var20 != 0) {
                                                  var34.a(var17, var18, var22, this.field_z, var16, true);
                                                  var12 = 1;
                                                  if (var3 < var22) {
                                                    var3 = var22;
                                                    var18++;
                                                    continue L6;
                                                  } else {
                                                    var18++;
                                                    continue L6;
                                                  }
                                                } else {
                                                  if (var21 != 0) {
                                                    var22 = var22 - this.field_P[42];
                                                    var34.a((byte) -68, var18, var22);
                                                    var18++;
                                                    continue L6;
                                                  } else {
                                                    var18++;
                                                    continue L6;
                                                  }
                                                }
                                              } else {
                                                var18++;
                                                continue L6;
                                              }
                                            } else {
                                              var18++;
                                              continue L6;
                                            }
                                          } else {
                                            var18++;
                                            continue L6;
                                          }
                                        } else {
                                          var18++;
                                          continue L6;
                                        }
                                      } else {
                                        var18++;
                                        continue L6;
                                      }
                                    } else {
                                      var18++;
                                      continue L6;
                                    }
                                  } else {
                                    var18++;
                                    continue L6;
                                  }
                                } else {
                                  var13_int++;
                                  continue L4;
                                }
                              }
                            } else {
                              var13_int++;
                              continue L4;
                            }
                          } else {
                            var13_int++;
                            continue L4;
                          }
                        } else {
                          var13_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    L22: {
                      var35 = this.field_D.field_Eb[var13_int];
                      var36 = var35;
                      var36 = var35;
                      if (this.field_z == var35.field_a) {
                        break L22;
                      } else {
                        if (var35.a(false)) {
                          var4 = var4 + (double)(this.field_P[21] * 2.0f / (float)this.field_D.field_W);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    if (var35.c(83)) {
                      var10 = var10 + (double)this.field_P[17];
                      var6 = var6 + (double)this.field_P[13];
                      var13_int++;
                      continue L3;
                    } else {
                      var13_int++;
                      continue L3;
                    }
                  }
                }
              } else {
                L23: {
                  if (var37.i(-21428)) {
                    var4 = var4 - (double)(this.field_P[22] * 2.0f / (float)this.field_D.field_W);
                    break L23;
                  } else {
                    if (!var37.f((byte) -125)) {
                      if (var37.s(param0 + 127)) {
                        var10 = var10 - (double)this.field_P[18];
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      var6 = var6 - (double)this.field_P[14];
                      break L23;
                    }
                  }
                }
                L24: {
                  L25: {
                    if (var37.p((byte) -113)) {
                      break L25;
                    } else {
                      if (!var37.d((byte) 105)) {
                        var8 = var8 + (double)this.field_P[27];
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  var8 = var8 - (double)this.field_P[16];
                  break L24;
                }
                var37 = (jd) ((Object) this.field_D.field_t[this.field_z].a((byte) 123));
                continue L2;
              }
            }
          } else {
            this.b(7, param0 ^ 4);
            break L1;
          }
        }
    }

    final static boolean b(int param0, int param1, int param2, int param3) {
        int var4;
        int stackIn_22_0 = 0;
        L0: {
          if (param2 == -14) {
            break L0;
          } else {
            field_G = (ka) null;
            break L0;
          }
        }
        L1: {
          if (null == ik.field_d) {
            break L1;
          } else {
            if (-14 != (rs.field_q ^ -1)) {
              break L1;
            } else {
              ik.field_d = null;
              return true;
            }
          }
        }
        if (hf.field_c) {
          if (os.e(-1)) {
            L2: {
              if (!ro.b(param3, (byte) -59, param0)) {
                stackIn_22_0 = 0;
                break L2;
              } else {
                stackIn_22_0 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                var4 = stackIn_22_0;
                if (80 == rs.field_q) {
                  break L4;
                } else {
                  if (84 == rs.field_q) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              hf.field_c = false;
              var4 = 1;
              break L3;
            }
            L5: {
              if (-14 != (rs.field_q ^ -1)) {
                break L5;
              } else {
                rd.b(8445);
                hf.field_c = false;
                var4 = 1;
                break L5;
              }
            }
            return var4 != 0;
          } else {
            return false;
          }
        } else {
          L6: {
            if (iu.field_h) {
              break L6;
            } else {
              if (-10 == (rs.field_q ^ -1)) {
                break L6;
              } else {
                if (-11 == (rs.field_q ^ -1)) {
                  break L6;
                } else {
                  if (rs.field_q != 11) {
                    if (80 != rs.field_q) {
                      return false;
                    } else {
                      if (os.e(-1)) {
                        hf.field_c = true;
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              }
            }
          }
          return cd.a(param0, param1, false);
        }
    }

    private final void b(int param0, int param1) {
        this.field_k = param0;
        if (param1 != 4) {
            return;
        }
        this.field_t = -1;
    }

    private final void a(int param0, int param1, int param2, jd param3) {
        float var5_float = 0.0f;
        if (param2 != 19551) {
            return;
        }
        try {
            var5_float = (float)param3.g((byte) 122);
            if (!(!param3.c(false))) {
                var5_float = var5_float * this.field_P[59];
            }
            this.field_m.a(param2 ^ -19507, param3.field_w, (float)param0 * var5_float, param1, param3.g(0), this.field_n, param3.field_J);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ej.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final cl b(jd param0, byte param1) {
        float[] array$0 = null;
        cl stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        cl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        id var5 = null;
        int var6 = 0;
        mn var7 = null;
        id[] var8 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_u != null) {
                var8 = this.field_u;
                var4 = 0;
                L2: while (true) {
                  if (var4 >= var8.length) {
                    break L1;
                  } else {
                    L3: {
                      var5 = var8[var4];
                      if (var5 == null) {
                        break L3;
                      } else {
                        if (param0.field_N != var5.field_a) {
                          break L3;
                        } else {
                          param0.field_K = var5.field_e;
                          if (0 >= var5.field_b) {
                            break L1;
                          } else {
                            param0.field_t = var5.field_b;
                            param0.field_Y = var5.field_b;
                            break L1;
                          }
                        }
                      }
                    }
                    var4++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              var3 = new cl((ej) (this), param0);
              this.field_p.a((byte) -119, (tc) (var3));
              if (param1 <= -66) {
                break L4;
              } else {
                var7 = (mn) null;
                this.a((mn) null, 49);
                break L4;
              }
            }
            L5: {
              if (param0.field_H == 0) {
                break L5;
              } else {
                if (null != this.field_I[param0.g(0)][-1 + param0.field_H]) {
                  break L5;
                } else {
                  array$0 = new float[this.field_D.field_Eb.length];
                  this.field_I[param0.g(0)][param0.field_H - 1] = array$0;
                  break L5;
                }
              }
            }
            stackIn_16_0 = (cl) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("ej.FA(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    ej(ha param0, int param1, boolean param2, id[] param3) {
        int var5_int = 0;
        jd var6 = null;
        cl discarded$0 = null;
        try {
            this.field_H = new at();
            this.field_O = new at();
            this.field_p = new at();
            this.field_D = param0;
            this.field_z = param1;
            this.field_P = new float[62];
            ns.a(false, 3, li.field_n);
            this.field_D.field_k.a((byte) -119, (tc) (this));
            aj.a(this.field_P, 117);
            this.field_u = param3;
            var5_int = 0;
            var6 = (jd) ((Object) this.field_D.field_t[this.field_z].e((byte) 104));
            while (var6 != null) {
                if (var5_int < var6.field_H) {
                    var5_int = var6.field_H;
                }
                var6 = (jd) ((Object) this.field_D.field_t[this.field_z].a((byte) 123));
            }
            this.field_I = new float[8][var5_int][];
            this.field_U = new nn(this.field_D);
            this.field_l = new nn(this.field_D);
            this.field_A = new float[10][this.field_D.field_Eb.length];
            this.field_K = new float[10][this.field_D.field_Eb.length];
            this.field_n = new float[8][10][this.field_D.field_Eb.length];
            this.field_V = new float[this.field_D.field_Eb.length];
            this.field_N = new float[this.field_D.field_Eb.length];
            this.field_J = null;
            this.field_m = new ir(this.field_D.field_Eb, this.field_D.field_v, this.field_D.field_db);
            this.field_v = new float[this.field_D.field_Eb.length];
            this.field_T = new float[this.field_D.field_Eb.length];
            this.field_C = new float[this.field_D.field_Eb.length];
            var6 = (jd) ((Object) this.field_D.field_t[this.field_z].e((byte) 126));
            while (var6 != null) {
                discarded$0 = this.b(var6, (byte) -68);
                var6 = (jd) ((Object) this.field_D.field_t[this.field_z].a((byte) 123));
            }
            this.field_Q = (sm) ((Object) new aw((ej) (this)));
            this.field_F = (sm) ((Object) new ge((ej) (this)));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_R = "Unpacking models";
    }
}

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
            boolean discarded$0 = ej.b(-7, -126, -85, -67);
        }
        field_R = null;
        field_G = null;
    }

    private final float a(int param0, int param1, int param2, byte param3) {
        float var5 = 0.0f;
        int var6 = 0;
        ne var7 = null;
        int var8_int = 0;
        float var8 = 0.0f;
        int var9 = 0;
        float stackIn_64_0 = 0.0f;
        float stackIn_65_0 = 0.0f;
        float stackIn_66_0 = 0.0f;
        float stackIn_67_0 = 0.0f;
        float stackIn_67_1 = 0.0f;
        float stackOut_63_0 = 0.0f;
        float stackOut_62_0 = 0.0f;
        float stackOut_64_0 = 0.0f;
        float stackOut_66_0 = 0.0f;
        float stackOut_66_1 = 0.0f;
        float stackOut_65_0 = 0.0f;
        float stackOut_65_1 = 0.0f;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < 0) {
            break L0;
          } else {
            if (-1 < (param2 ^ -1)) {
              break L0;
            } else {
              if (param0 >= ((ej) this).field_D.field_v) {
                break L0;
              } else {
                if (param2 >= ((ej) this).field_D.field_db) {
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
                      var6 = param2 * ((ej) this).field_D.field_v + param0;
                      var7 = ((ej) this).field_D.field_Eb[var6];
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
                                  if (var8_int == -24) {
                                    break L4;
                                  } else {
                                    if (24 == var8_int) {
                                      break L4;
                                    } else {
                                      L5: {
                                        if (-48 != var8_int) {
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
                                            stackOut_63_0 = (float)var7.field_c.field_Y;
                                            stackIn_64_0 = stackOut_63_0;
                                            break L6;
                                          } else {
                                            stackOut_62_0 = (float)uc.field_d[param1][6];
                                            stackIn_64_0 = stackOut_62_0;
                                            break L6;
                                          }
                                        }
                                        L7: {
                                          var8 = stackIn_64_0;
                                          stackOut_64_0 = var5;
                                          stackIn_66_0 = stackOut_64_0;
                                          stackIn_65_0 = stackOut_64_0;
                                          if (((ej) this).field_z == var7.field_c.field_O) {
                                            stackOut_66_0 = stackIn_66_0;
                                            stackOut_66_1 = -var8;
                                            stackIn_67_0 = stackOut_66_0;
                                            stackIn_67_1 = stackOut_66_1;
                                            break L7;
                                          } else {
                                            stackOut_65_0 = stackIn_65_0;
                                            stackOut_65_1 = var8;
                                            stackIn_67_0 = stackOut_65_0;
                                            stackIn_67_1 = stackOut_65_1;
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
                      if (((ej) this).field_z != var7.field_c.field_O) {
                        break L2;
                      } else {
                        L9: {
                          L10: {
                            var8_int = 0;
                            if (0 >= param0) {
                              break L10;
                            } else {
                              if (((ej) this).field_D.field_Eb[-1 + var6].field_c != null) {
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
                              if (((ej) this).field_D.field_Eb[-((ej) this).field_D.field_v + var6].field_c == null) {
                                var8_int = 1;
                                break L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (param2 >= ((ej) this).field_D.field_db + -1) {
                              break L12;
                            } else {
                              if (null == ((ej) this).field_D.field_Eb[var6 + ((ej) this).field_D.field_v].field_c) {
                                var8_int = 1;
                                break L9;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if (-1 + ((ej) this).field_D.field_v <= param0) {
                            break L9;
                          } else {
                            if (((ej) this).field_D.field_Eb[1 + var6].field_c != null) {
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
        if (!(param0 == null)) {
            var3 = param0.a(58, ((ej) this).field_D);
            if (!(var3 == null)) {
                var3.a(64, ((ej) this).field_D);
                return true;
            }
        }
        if (param1 > -123) {
            return true;
        }
        return false;
    }

    private final void a(int param0, boolean param1, int param2) {
        float var4 = 0.0f;
        int var5 = 0;
        int var6 = 0;
        ne var7 = null;
        int var8 = 0;
        int var9 = 0;
        float stackIn_7_0 = 0.0f;
        float stackOut_6_0 = 0.0f;
        float stackOut_5_0 = 0.0f;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0.0f;
        var5 = param0 % ((ej) this).field_D.field_v;
        var6 = param0 / ((ej) this).field_D.field_v;
        var7 = ((ej) this).field_D.field_Eb[param0];
        if (!var7.a(param1)) {
          return;
        } else {
          L0: {
            if (!var7.d(-60)) {
              break L0;
            } else {
              L1: {
                if (var7.field_a != ((ej) this).field_z) {
                  stackOut_6_0 = 101.0f;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 0.0f;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              var4 = stackIn_7_0;
              break L0;
            }
          }
          L2: {
            if (((ej) this).field_z != var7.field_a) {
              L3: {
                L4: {
                  if (-10 == var7.field_h) {
                    break L4;
                  } else {
                    if (-15 == var7.field_h) {
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
                  if (((ej) this).field_z == var7.field_a) {
                    break L5;
                  } else {
                    var4 = var4 * ((ej) this).field_P[9];
                    break L5;
                  }
                }
              }
              if (null == var7.field_c) {
                break L2;
              } else {
                if (var7.field_c.field_O != ((ej) this).field_z) {
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
                  ((ej) this).field_m.a(-101, var6, (float)param2 * var4, var8, 9, ((ej) this).field_n, var5);
                  var8++;
                  continue L7;
                }
              }
            }
          }
          ((ej) this).field_v[param0] = (float)param2 * var4;
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        float[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        float var11 = 0.0f;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          var6 = 0;
          if (param1 == -14092) {
            break L0;
          } else {
            ((ej) this).field_E = 123;
            break L0;
          }
        }
        L1: while (true) {
          if (var6 >= 8) {
            return;
          } else {
            if (((ej) this).field_I[var6].length >= param3) {
              var7 = ((ej) this).field_I[var6][param3 - 1];
              if (var7 != null) {
                var8 = param2 % ((ej) this).field_D.field_v;
                var9 = param2 / ((ej) this).field_D.field_v;
                if (param0 != 0) {
                  var10 = 0;
                  var11_int = -param0;
                  L2: while (true) {
                    if (param0 <= var11_int) {
                      var11 = (float)param4 * ((ej) this).field_P[55] / (float)var10;
                      var12 = -param0;
                      L3: while (true) {
                        if (param0 > var12) {
                          var13 = -param0;
                          L4: while (true) {
                            if (var13 >= param0) {
                              var12++;
                              continue L3;
                            } else {
                              if (param0 == Math.abs(var12) + Math.abs(var13)) {
                                if (0 <= var12 + var8) {
                                  if (var13 + var9 >= 0) {
                                    if (((ej) this).field_D.field_v > var12 + var8) {
                                      if (var9 - -var13 < ((ej) this).field_D.field_db) {
                                        ((ej) this).field_m.a(var7, false, var11, var6, (byte) -4, 0, var9 + var13, var8 + var12);
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
                                if (((ej) this).field_D.field_v > var11_int + var8) {
                                  if (((ej) this).field_D.field_db > var12 + var9) {
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
                  ((ej) this).field_m.a(var7, false, ((ej) this).field_P[55] * (float)param4, var6, (byte) -4, 0, var9, var8);
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
        int var2 = 0;
        ne[] var3_ref_ne__ = null;
        int var3 = 0;
        int var4 = 0;
        ne var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((ej) this).field_t = ((ej) this).field_t + 1;
        if (-1 > (((ej) this).field_D.field_l.b(false) ^ -1)) {
          return false;
        } else {
          if (((ej) this).field_w) {
            if (0 == ((ej) this).field_t % 2) {
              this.c((byte) -117);
              return false;
            } else {
              return false;
            }
          } else {
            var2 = ((ej) this).field_k;
            if (var2 == 0) {
              L0: {
                if (((ej) this).field_t <= -31) {
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
                  if (-1 == ((ej) this).field_t) {
                    L2: {
                      if (0 != ((ej) this).field_D.field_t[((ej) this).field_z].b(false)) {
                        break L2;
                      } else {
                        if (null == ((ej) this).field_D.field_K) {
                          break L2;
                        } else {
                          var2 = 0;
                          var3_ref_ne__ = ((ej) this).field_D.field_Eb;
                          var4 = 0;
                          L3: while (true) {
                            L4: {
                              if (var3_ref_ne__.length <= var4) {
                                break L4;
                              } else {
                                var5 = var3_ref_ne__[var4];
                                if (var5.a(((ej) this).field_z, (byte) 91)) {
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
                                  if (((ej) this).field_D.field_W <= var4) {
                                    break L6;
                                  } else {
                                    if (var3 != 0) {
                                      break L6;
                                    } else {
                                      if (var4 != ((ej) this).field_z) {
                                        if (0 != (1 & ((ej) this).field_D.a((byte) 78) >> var4)) {
                                          if (!((ej) this).field_D.c(var4, -16985, ((ej) this).field_D.field_K.field_w)) {
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
                                    ((ej) this).field_D.a(0, ((ej) this).field_D.field_u | 1 << ((ej) this).field_z);
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
                    ((ej) this).field_S = null;
                    ((ej) this).field_o = 0;
                    ((ej) this).field_w = true;
                    ((ej) this).field_M = (cl) (Object) ((ej) this).field_p.e((byte) 122);
                    ((ej) this).field_L = 0;
                    this.b(2, 4);
                    break L1;
                  } else {
                    ((ej) this).field_L = 0;
                    this.b(2, 4);
                    break L1;
                  }
                } else {
                  if ((var2 ^ -1) == -3) {
                    this.a(-113, false);
                    break L1;
                  } else {
                    if (var2 != -9) {
                      if (3 == var2) {
                        if (-1 == (((ej) this).field_t ^ -1)) {
                          this.a(((ej) this).field_p, 0);
                          ((ej) this).field_S = null;
                          ((ej) this).field_M = (cl) (Object) ((ej) this).field_p.e((byte) 127);
                          this.f(0);
                          break L1;
                        } else {
                          this.f(0);
                          break L1;
                        }
                      } else {
                        if (-5 == var2) {
                          this.a(param0 + 4972, true);
                          break L1;
                        } else {
                          if (var2 != 5) {
                            if (-7 != (var2 ^ -1)) {
                              if (var2 != 7) {
                                break L1;
                              } else {
                                if (-51 < (((ej) this).field_t ^ -1)) {
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
        if (!(null != ((ej) this).field_D.field_K)) {
            this.b(param1 ? 5 : 8, 4);
            return;
        }
        this.a(param1, ((ej) this).field_L, 23);
        if (param0 > -89) {
            ((ej) this).field_H = null;
        }
        ((ej) this).field_L = ((ej) this).field_L + 1;
        if (5 <= ((ej) this).field_L) {
            ((ej) this).field_L = 0;
            this.b(!param1 ? 8 : 5, 4);
        }
    }

    final sm a(cl param0, byte param1) {
        int var3 = 29 % ((param1 - -27) / 60);
        return ((ej) this).field_Q;
    }

    private final void c(byte param0) {
        int var2 = 0;
        float[] var2_ref_float__ = null;
        jd var3 = null;
        int var3_int = 0;
        ne var3_ref = null;
        jd var3_ref2 = null;
        int var4 = 0;
        float[] var4_ref_float__ = null;
        float[][] var5 = null;
        int var5_int = 0;
        tc var6 = null;
        ne var6_ref = null;
        int var7 = 0;
        float[] var8 = null;
        int stackIn_48_0 = 0;
        float[][] stackIn_51_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        float[][] stackOut_50_0 = null;
        float[][] stackOut_49_0 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-1 != (((ej) this).field_o ^ -1)) {
          L0: {
            if (((ej) this).field_o == 1) {
              if (((ej) this).field_D.field_W <= ((ej) this).field_x) {
                ((ej) this).field_o = ((ej) this).field_o + 1;
                break L0;
              } else {
                L1: {
                  var2 = ((ej) this).field_x;
                  var3 = ((ej) this).field_r;
                  if (((ej) this).field_D.o(var2, -1) != ((ej) this).field_D.o(((ej) this).field_z, -1)) {
                    stackOut_47_0 = 0;
                    stackIn_48_0 = stackOut_47_0;
                    break L1;
                  } else {
                    stackOut_46_0 = 1;
                    stackIn_48_0 = stackOut_46_0;
                    break L1;
                  }
                }
                L2: {
                  var4 = stackIn_48_0;
                  if (var4 == 0) {
                    stackOut_50_0 = ((ej) this).field_K;
                    stackIn_51_0 = stackOut_50_0;
                    break L2;
                  } else {
                    stackOut_49_0 = ((ej) this).field_A;
                    stackIn_51_0 = stackOut_49_0;
                    break L2;
                  }
                }
                L3: {
                  var5 = (float[][]) (Object) stackIn_51_0;
                  if (-9 > (((ej) this).field_s ^ -1)) {
                    L4: {
                      if (var3 == null) {
                        var6 = ((ej) this).field_D.field_t[var2].field_d.field_b;
                        break L4;
                      } else {
                        var6 = var3.field_b;
                        break L4;
                      }
                    }
                    L5: {
                      if (!(var6 instanceof jd)) {
                        var3 = null;
                        break L5;
                      } else {
                        var3_ref2 = (jd) (Object) var6;
                        break L5;
                      }
                    }
                    ((ej) this).field_r = var3;
                    ((ej) this).field_s = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (var3 == null) {
                  ((ej) this).field_x = ((ej) this).field_x + 1;
                  ((ej) this).field_s = 9;
                  break L0;
                } else {
                  L6: {
                    if (var3.field_S) {
                      break L6;
                    } else {
                      if (0 != ((ej) this).field_s) {
                        if (var4 != 0) {
                          ((ej) this).field_s = 8;
                          break L6;
                        } else {
                          this.a(1, -1 + ((ej) this).field_s, 19551, var3);
                          break L6;
                        }
                      } else {
                        ((ej) this).field_m.a(var5, 1, -19545, var3);
                        break L6;
                      }
                    }
                  }
                  ((ej) this).field_s = ((ej) this).field_s + 1;
                  var3.field_X = false;
                  break L0;
                }
              }
            } else {
              if ((((ej) this).field_o ^ -1) != -3) {
                if (-4 == (((ej) this).field_o ^ -1)) {
                  var2 = 0;
                  L7: while (true) {
                    if (((ej) this).field_I.length <= var2) {
                      var2 = 0;
                      L8: while (true) {
                        if (var2 >= ((ej) this).field_D.field_Eb.length) {
                          ((ej) this).field_o = ((ej) this).field_o + 1;
                          break L0;
                        } else {
                          L9: {
                            var3_ref = ((ej) this).field_D.field_Eb[var2];
                            var4 = var3_ref.a((byte) -107);
                            if (var4 == 0) {
                              break L9;
                            } else {
                              this.a(var4, 1, var2, 29);
                              break L9;
                            }
                          }
                          if (null != var3_ref.field_c) {
                            var4 = var3_ref.field_c.field_E;
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
                        if (var3_int >= ((ej) this).field_I[var2].length) {
                          var2++;
                          continue L7;
                        } else {
                          if (null != ((ej) this).field_I[var2][var3_int]) {
                            var4 = 0;
                            L11: while (true) {
                              if (((ej) this).field_I[var2][var3_int].length > var4) {
                                ((ej) this).field_I[var2][var3_int][var4] = 0.0f;
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
                  ((ej) this).field_w = false;
                  ((ej) this).field_o = 0;
                  break L0;
                }
              } else {
                var2 = 0;
                L12: while (true) {
                  if (((ej) this).field_V.length <= var2) {
                    var8 = ((ej) this).field_n[0][9];
                    var2_ref_float__ = var8;
                    var3_int = 0;
                    L13: while (true) {
                      if (var3_int >= var8.length) {
                        var3_int = 0;
                        L14: while (true) {
                          if (var3_int >= ((ej) this).field_D.field_Eb.length) {
                            ((ej) this).field_o = ((ej) this).field_o + 1;
                            break L0;
                          } else {
                            var4_ref_float__ = ((ej) this).field_C;
                            var5_int = var3_int;
                            ((ej) this).field_T[var3_int] = 0.0f;
                            var4_ref_float__[var5_int] = 0.0f;
                            var6_ref = ((ej) this).field_D.field_Eb[var3_int];
                            this.a(var3_int, false, 1);
                            if (!var6_ref.d(-16)) {
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
                    ((ej) this).field_V[var2] = 0.0f;
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
          this.a((byte) 108, ((ej) this).field_A);
          this.a((byte) 111, ((ej) this).field_K);
          var2 = 0;
          L15: while (true) {
            if (((ej) this).field_n.length <= var2) {
              ((ej) this).field_o = ((ej) this).field_o + 1;
              ((ej) this).field_x = 0;
              ((ej) this).field_s = 9;
              ((ej) this).field_r = null;
              return;
            } else {
              this.a((byte) 73, ((ej) this).field_n[var2]);
              var2++;
              continue L15;
            }
          }
        }
    }

    private final void g(int param0) {
        cl var2 = null;
        cl var3 = null;
        if (null != ((ej) this).field_M) {
          L0: {
            if (((ej) this).field_M.field_o.field_S) {
              break L0;
            } else {
              if (((ej) this).field_M.field_o.field_O == ((ej) this).field_z) {
                L1: {
                  if (param0 == -25523) {
                    break L1;
                  } else {
                    ((ej) this).field_m = null;
                    break L1;
                  }
                }
                ((ej) this).field_M.f(-119);
                ((ej) this).field_S = ((ej) this).field_M;
                ((ej) this).field_M = (cl) (Object) ((ej) this).field_p.a((byte) 123);
                return;
              } else {
                break L0;
              }
            }
          }
          var3 = (cl) (Object) ((ej) this).field_p.a((byte) 123);
          var2 = var3;
          ((ej) this).field_M.d(-115);
          ((ej) this).field_M = var3;
          return;
        } else {
          this.b(3, param0 ^ -25527);
          return;
        }
    }

    private final void a(int param0, jd param1, int param2) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 <= 56) {
            return;
        }
        for (var4 = 0; -9 < (var4 ^ -1); var4++) {
            this.a(param2, var4, 19551, param1);
        }
    }

    public final void a(jd param0, byte param1) {
        if (param1 != -2) {
            field_G = null;
        }
        ((ej) this).a(80, param0);
    }

    final void a(int param0, int param1, byte param2, boolean param3) {
        Object[] var5 = null;
        float[] var5_array = null;
        int var6 = 0;
        float[][] var6_ref_float____ = null;
        int var7_int = 0;
        jd var7 = null;
        cl var8 = null;
        float[][][] var8_array = null;
        int var9 = 0;
        float[][] var10 = null;
        int var11 = 0;
        float[][][] var12 = null;
        int var13 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!param3) {
            break L0;
          } else {
            ((ej) this).field_o = 0;
            ((ej) this).field_w = true;
            L1: while (true) {
              if (!((ej) this).field_w) {
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
                    var5_array = ((ej) this).field_K[param1];
                    break L4;
                  } else {
                    if ((var7_int ^ -1) != -4) {
                      if ((var7_int ^ -1) == -5) {
                        var5_array = null;
                        if (rd.field_j == null) {
                          break L4;
                        } else {
                          var7 = rd.field_j.field_T;
                          if (var7 == null) {
                            break L4;
                          } else {
                            var8 = (cl) (Object) ((ej) this).field_p.e((byte) 114);
                            L5: while (true) {
                              if (var8 == null) {
                                break L4;
                              } else {
                                if (var7 != var8.field_o) {
                                  var8 = (cl) (Object) ((ej) this).field_p.a((byte) 123);
                                  continue L5;
                                } else {
                                  float discarded$1 = var8.a(false, (byte) -127);
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
                      var6_ref_float____ = ((ej) this).field_I[1];
                      if (var6_ref_float____ == null) {
                        break L4;
                      } else {
                        if (0 >= var6_ref_float____.length) {
                          break L4;
                        } else {
                          var7_int = param1 % var6_ref_float____.length;
                          var12 = ((ej) this).field_I;
                          var8_array = var12;
                          var9 = 0;
                          L6: while (true) {
                            if (var9 >= var12.length) {
                              break L4;
                            } else {
                              var10 = var12[var9];
                              if (var10 != null) {
                                if (var7_int < var10.length) {
                                  if (var10[var7_int] != null) {
                                    var5_array = var10[var7_int];
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
                  var5_array = ((ej) this).field_n[param1 % ((ej) this).field_n[4].length][9];
                  break L4;
                }
              }
            }
            L7: {
              if (var5_array == null) {
                break L7;
              } else {
                var13 = 0;
                var6 = var13;
                L8: while (true) {
                  if (var5_array.length <= var13) {
                    break L7;
                  } else {
                    fs.field_b[var13] = var5_array[var13];
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
        float var4 = 0.0f;
        int var5 = 0;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = 0.0f;
          var5 = 0;
          var6 = bw.field_m[param0][0];
          var4 = var4 + ((ej) this).field_P[43] * (((ej) this).field_K[8][param2] * (float)fk.field_d[var6][0]);
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
                var9 = var9 + ((ej) this).field_n[var6][var11][param2];
                var10 = var10 + ((ej) this).field_K[var11][param2];
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
              var7 = var7 + ((ej) this).field_n[var6][var11][param2] * (float)fk.field_d[var6][var11] * ((ej) this).field_P[28];
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
            var8 = var8 + ((ej) this).field_K[var11][param2] * (float)fk.field_d[var11][var6] * ((ej) this).field_P[29];
            var11++;
            continue L1;
          }
        }
    }

    private final void e(int param0) {
        jd var2 = null;
        Object var3 = null;
        L0: {
          if (param0 == -24236) {
            break L0;
          } else {
            var3 = null;
            this.a((int[]) null, -30, (byte) -27);
            break L0;
          }
        }
        L1: {
          var2 = ((ej) this).field_D.c(((ej) this).field_y, true, ((ej) this).field_E);
          if (var2 != null) {
            ((ej) this).a(80, var2);
            this.b(3, param0 + 24240);
            break L1;
          } else {
            if (((ej) this).field_t > ((ej) this).field_B - -100) {
              this.b(7, 4);
              break L1;
            } else {
              break L1;
            }
          }
        }
    }

    private final void a(int[] param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (param0.length <= var4) {
            L1: {
              if (param2 >= 79) {
                break L1;
              } else {
                var8 = null;
                cl discarded$1 = this.b((jd) null, (byte) -90);
                break L1;
              }
            }
            return;
          } else {
            var5 = 0;
            if (-1 != param0[var4]) {
              var6 = 0;
              L2: while (true) {
                L3: {
                  if (var6 >= var4) {
                    break L3;
                  } else {
                    if (param0[var4] != param0[var6]) {
                      var6++;
                      continue L2;
                    } else {
                      var5 = 1;
                      break L3;
                    }
                  }
                }
                if (var5 == 0) {
                  this.a(param0[var4], false, param1);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(byte param0, float[][] param1) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = 0;
        int var4 = -13 % ((30 - param0) / 40);
        while (param1.length > var3) {
            for (var5 = 0; param1[var3].length > var5; var5++) {
                param1[var3][var5] = 0.0f;
            }
            var3++;
        }
    }

    final static int a(bv param0, boolean param1) {
        if (!param1) {
            field_G = null;
        }
        int var2 = de.a(-108, param0, 4, 14, 30, 20);
        return var2;
    }

    final void c(jd param0, byte param1) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = 123 % ((param1 - 53) / 41);
        cl var3 = (cl) (Object) ((ej) this).field_p.e((byte) 95);
        while (var3 != null) {
            if (!(var3.field_o != param0)) {
                float discarded$0 = var3.a(false, (byte) -124);
                return;
            }
            var3 = (cl) (Object) ((ej) this).field_p.a((byte) 123);
        }
    }

    private final void a(boolean param0, int param1, int param2) {
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (((ej) this).field_D == null) {
                        statePc = 68;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (((ej) this).field_D.field_B[((ej) this).field_z] == null) {
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
                    var4 = ((ej) this).field_D.field_B[((ej) this).field_z][param1];
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
                    var5 = ((ej) this).field_F;
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
                    if (-var6 + ((ej) this).field_D.field_db <= var8_int) {
                        statePc = 65;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var9_int = var6;
                    if (((ej) this).field_D.field_v + -var6 > var9_int) {
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
                    if (-var6 + ((ej) this).field_D.field_db <= var8_int) {
                        statePc = 65;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var9_int = var6;
                    if (((ej) this).field_D.field_v + -var6 > var9_int) {
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
                    if (-var6 + ((ej) this).field_D.field_db <= var8_int) {
                        statePc = 65;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var9_int = var6;
                    if (((ej) this).field_D.field_v + -var6 > var9_int) {
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
                    if (-var6 + ((ej) this).field_D.field_db <= var8_int) {
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
                    if (((ej) this).field_D.field_v + -var6 > var9_int) {
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
                    var5.a(param1, var9_int, var8_int, var10, (byte) 71, ((ej) this).field_z);
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
                    ((ej) this).field_D.field_J = true;
                    var8 = new wa(var4, var7.field_s, var7.field_q);
                    var9 = new to((ik) (Object) var8, -1, ((ej) this).field_z);
                    boolean discarded$1 = ((ej) this).a((mn) (Object) var9, -126);
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
        if (param1 == null) {
            return;
        }
        if (!(((ej) this).field_z == param1.field_O)) {
            return;
        }
        if (param1.field_p != null) {
            if (this == (Object) (Object) param1.field_p.field_r) {
                return;
            }
        }
        cl var3 = this.b(param1, (byte) -98);
        var3.f(param0 ^ 14);
        if (param0 != 80) {
            ej.a(-94);
        }
        ((ej) this).field_m.a(((ej) this).field_A, 1, param0 ^ -19465, var3.field_o);
        if (6 == ((ej) this).field_k) {
            this.b(3, 4);
            ((ej) this).field_M = (cl) (Object) ((ej) this).field_p.a(true, (tc) (Object) var3);
            ((ej) this).field_t = 2;
        }
    }

    private final void f(int param0) {
        int var2_int = 0;
        jd var2_ref = null;
        float var2 = 0.0f;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        jd var7 = null;
        L0: {
          if (null != ((ej) this).field_S) {
            L1: {
              if (((ej) this).field_S.field_o.field_X) {
                L2: {
                  if (((ej) this).field_S.field_o.field_S) {
                    break L2;
                  } else {
                    ((ej) this).field_m.a(((ej) this).field_A, 1, -19545, ((ej) this).field_S.field_o);
                    if (((ej) this).field_S.field_o.field_E == 0) {
                      break L2;
                    } else {
                      this.a(3, -14092, ((ej) this).field_D.field_v * ((ej) this).field_S.field_o.field_w + ((ej) this).field_S.field_o.field_J, ((ej) this).field_S.field_o.field_E, 1);
                      break L2;
                    }
                  }
                }
                ((ej) this).field_S.field_o.field_X = false;
                var2_int = ((ej) this).field_S.field_u;
                var3 = ((ej) this).field_S.field_n;
                var4 = ((ej) this).field_S.field_m;
                this.a(new int[3], -1, (byte) 113);
                ((ej) this).field_S.field_n = -1;
                ((ej) this).field_S.field_u = -1;
                ((ej) this).field_S.field_m = -1;
                break L1;
              } else {
                break L1;
              }
            }
            var7 = ((ej) this).field_S.field_l;
            var2_ref = var7;
            if (var2_ref != null) {
              if (var2_ref.field_X) {
                L3: {
                  ((ej) this).field_m.a(((ej) this).field_K, 1, -19545, var2_ref);
                  if (var2_ref.field_E == 0) {
                    break L3;
                  } else {
                    this.a(3, -14092, var2_ref.field_w * ((ej) this).field_D.field_v + var2_ref.field_J, var2_ref.field_E, 1);
                    break L3;
                  }
                }
                this.a(66, var2_ref, 1);
                ((ej) this).field_m.a(((ej) this).field_n[var7.g(0)], 1, param0 + -19545, var2_ref);
                var2_ref.field_X = false;
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
        ((ej) this).field_S = ((ej) this).field_M;
        if (param0 == 0) {
          if (null != ((ej) this).field_M) {
            L4: {
              ((ej) this).field_J = ((ej) this).field_M;
              var2 = ((ej) this).field_M.a(true, (byte) -124);
              if (-3.4028234663852886e+38f == var2) {
                break L4;
              } else {
                L5: {
                  ((ej) this).field_m.a(((ej) this).field_A, -1, param0 ^ -19545, ((ej) this).field_M.field_o);
                  var3 = ((ej) this).field_M.field_o.field_w * ((ej) this).field_D.field_v + ((ej) this).field_M.field_o.field_J;
                  if (((ej) this).field_M.field_o.field_E != 0) {
                    this.a(3, -14092, var3, ((ej) this).field_M.field_o.field_E, -1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4 = -1;
                  var5 = -1;
                  var6 = ((ej) this).field_M.field_l;
                  if (var6 == null) {
                    break L6;
                  } else {
                    ((ej) this).field_m.a(((ej) this).field_K, -1, -19545, var6);
                    this.a(77, var6, -1);
                    var4 = ((ej) this).field_D.field_v * var6.field_w + var6.field_J;
                    if (var6.field_E != 0) {
                      this.a(3, -14092, var4, var6.field_E, -1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (!((ej) this).field_M.field_k.a(0)) {
                    break L7;
                  } else {
                    var5 = ((ej) this).field_M.field_k.field_s + ((ej) this).field_D.field_v * ((ej) this).field_M.field_k.field_q;
                    break L7;
                  }
                }
                this.a(new int[3], -1, (byte) 98);
                ((ej) this).field_M.field_n = var4;
                ((ej) this).field_M.field_m = var5;
                ((ej) this).field_M.field_u = var3;
                ((ej) this).field_M.g(4);
                ((ej) this).field_M.field_o.field_X = true;
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
                  if (((ej) this).field_M.field_k.field_r == -2) {
                    break L9;
                  } else {
                    if (((ej) this).field_M.field_o.field_B > 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              ((ej) this).field_M = (cl) (Object) ((ej) this).field_p.a((byte) 123);
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
        int var2_int = 0;
        jd var2 = null;
        jd var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.b(0, param0 + 127);
        ((ej) this).field_q = 0;
        ((ej) this).field_H.b(param0 ^ -28);
        ((ej) this).field_O.b(param0 ^ -42);
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= ((ej) this).field_D.field_t.length) {
            L1: {
              if (param0 == -123) {
                break L1;
              } else {
                ((ej) this).field_D = null;
                break L1;
              }
            }
            var2 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].e((byte) 99);
            L2: while (true) {
              if (var2 == null) {
                ((ej) this).field_M = (cl) (Object) ((ej) this).field_p.e((byte) 108);
                ((ej) this).field_S = null;
                return;
              } else {
                L3: {
                  if (var2.field_p == null) {
                    break L3;
                  } else {
                    if (this != (Object) (Object) var2.field_p.field_r) {
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
                    var2.field_p = new cl((ej) this, var2);
                    ((ej) this).field_p.a(param0 + 873, (tc) (Object) var2.field_p);
                    break L4;
                  }
                }
                var2 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].a((byte) 123);
                continue L2;
              }
            }
          } else {
            var3 = (jd) (Object) ((ej) this).field_D.field_t[var2_int].e((byte) 112);
            L5: while (true) {
              if (var3 == null) {
                var2_int++;
                continue L0;
              } else {
                var3.field_X = true;
                var3 = (jd) (Object) ((ej) this).field_D.field_t[var2_int].a((byte) 123);
                continue L5;
              }
            }
          }
        }
    }

    private final void a(at param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        cl var4_ref = null;
        cl var5 = null;
        cl var5_ref = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 1;
        L0: while (true) {
          if (var3 == 0) {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((ej) this).field_t = 6;
                break L1;
              }
            }
            return;
          } else {
            var3 = 0;
            var4 = null;
            var5_ref = (cl) (Object) ((ej) this).field_p.e((byte) 113);
            L2: while (true) {
              if (var5_ref == null) {
                continue L0;
              } else {
                var4_ref = (cl) (Object) ((ej) this).field_p.a((byte) 123);
                if (var4_ref == null) {
                  continue L0;
                } else {
                  L3: {
                    if (var5_ref.a((byte) -87, var4_ref)) {
                      var5_ref.d(-122);
                      var3 = 1;
                      ro.a((tc) (Object) var4_ref, (tc) (Object) var5_ref, true);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5 = var4_ref;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param3 != 29) {
            Object var6 = null;
            sm discarded$0 = ((ej) this).a((cl) null, (byte) -87);
        }
        this.a(0, param3 ^ -14103, param2, param0, param1);
    }

    private final void i(int param0) {
        sm var2 = null;
        float var3 = 0.0f;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13_int = 0;
        jb var13 = null;
        ne var14_ref_ne = null;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        float var22 = 0.0f;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        jd var29 = null;
        cl var30 = null;
        float var31 = 0.0f;
        int var32 = 0;
        Object var33 = null;
        jd var34 = null;
        int stackIn_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        L0: {
          var33 = null;
          var32 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            ((ej) this).field_T = null;
            break L0;
          }
        }
        L1: {
          var2 = ((ej) this).field_F;
          if ((((ej) this).field_D.field_H[((ej) this).field_z] + -((ej) this).field_q ^ -1) <= -51) {
            var3 = 1.401298464324817e-45f;
            var4 = 0.3;
            var6 = 0.0;
            var8 = 0.0;
            var10 = 0.0;
            var2.b((byte) -122);
            var34 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].e((byte) 89);
            L2: while (true) {
              if (var34 == null) {
                var13_int = 0;
                L3: while (true) {
                  if (((ej) this).field_D.field_Eb.length <= var13_int) {
                    var12 = 0;
                    var13_int = 0;
                    L4: while (true) {
                      if (((ej) this).field_D.field_Eb.length <= var13_int) {
                        L5: {
                          if (var12 == 0) {
                            break L5;
                          } else {
                            var13 = var2.a((byte) -84);
                            if (var13 == null) {
                              break L5;
                            } else {
                              this.b(6, 4);
                              ((ej) this).field_B = ((ej) this).field_t;
                              var14 = var13.field_r;
                              int discarded$1 = var13.a((byte) 5, (ej) this);
                              if (var14 == -1) {
                                break L5;
                              } else {
                                if (0 <= var14) {
                                  ((ej) this).field_q = ((ej) this).field_q + bw.field_m[var14][8];
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
                        var14_ref_ne = ((ej) this).field_D.field_Eb[var13_int];
                        if (null == var14_ref_ne.field_c) {
                          if (var14_ref_ne.d(-37)) {
                            if (((ej) this).field_z == var14_ref_ne.field_a) {
                              var15 = ((ej) this).field_D.field_E[((ej) this).field_z];
                              var16 = var13_int % ((ej) this).field_D.field_v;
                              var17 = var13_int / ((ej) this).field_D.field_v;
                              var18 = 0;
                              L6: while (true) {
                                if (-76 < var18) {
                                  if (var18 != -73) {
                                    if (-40 != var18) {
                                      if (var18 != -8) {
                                        if (-35 != var18) {
                                          if (-52 != var18) {
                                            if (var18 != 27) {
                                              L7: {
                                                var19 = bw.field_m[var18][1];
                                                if ((var14_ref_ne.field_h ^ -1) != -12) {
                                                  break L7;
                                                } else {
                                                  if (var14_ref_ne.field_g == var19) {
                                                    break L7;
                                                  } else {
                                                    var18++;
                                                    continue L6;
                                                  }
                                                }
                                              }
                                              L8: {
                                                if (-1 == var19) {
                                                  if ((((ej) this).field_D.field_a[((ej) this).field_z][var19 + 1] & 1 << b.a(false, var18)) != 0) {
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
                                                var20 = ((ej) this).field_D.b(var17, -26813, var18, var16, ((ej) this).field_z) ? 1 : 0;
                                                var21 = var20;
                                                if (var20 != 0) {
                                                  break L9;
                                                } else {
                                                  L10: {
                                                    ((ej) this).field_D.field_H[((ej) this).field_z] = ((ej) this).field_D.field_H[((ej) this).field_z] + ((ej) this).field_D.k(-116, ((ej) this).field_z);
                                                    if (!((ej) this).field_D.b(var17, param0 ^ -26813, var18, var16, ((ej) this).field_z)) {
                                                      stackOut_61_0 = 0;
                                                      stackIn_62_0 = stackOut_61_0;
                                                      break L10;
                                                    } else {
                                                      stackOut_60_0 = 1;
                                                      stackIn_62_0 = stackOut_60_0;
                                                      break L10;
                                                    }
                                                  }
                                                  var21 = stackIn_62_0;
                                                  ((ej) this).field_D.field_H[((ej) this).field_z] = ((ej) this).field_D.field_H[((ej) this).field_z] - ((ej) this).field_D.k(-101, ((ej) this).field_z);
                                                  break L9;
                                                }
                                              }
                                              if (var21 != 0) {
                                                L11: {
                                                  var22 = 0.0f;
                                                  var23 = bw.field_m[var18][4];
                                                  var22 = var22 + (float)var23 * ((ej) this).field_P[26];
                                                  var22 = this.a(var18, 1, var13_int);
                                                  var25 = bw.field_m[var18][1];
                                                  if (0 == (var25 ^ -1)) {
                                                    break L11;
                                                  } else {
                                                    var24 = var15[var25];
                                                    if (var24 == bw.field_m[var18][2]) {
                                                      var22 = var22 + (float)var24 * ((ej) this).field_P[23];
                                                      break L11;
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                }
                                                L12: {
                                                  var22 = var22 - ((ej) this).field_P[25] * (float)bw.field_m[var18][8] * 0.029999999329447746f;
                                                  var26 = bw.field_m[var18][10];
                                                  var27 = bw.field_m[var18][12];
                                                  if (18 == var27) {
                                                    var22 = var22 - ((ej) this).field_P[45];
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
                                                      var22 = var22 + ((ej) this).field_P[15] * ((ej) this).field_A[var28][var13_int];
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
                                                      var22 = var22 + ((ej) this).field_P[44] * ((ej) this).field_A[var28][var13_int];
                                                      var22 = var22 - ((ej) this).field_K[var28][var13_int] * ((ej) this).field_P[44];
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
                                                var29 = new jd(var16, var17, var18, ((ej) this).field_z, var23, var23, var28, 0, 0, ((ej) this).field_D, 0, 0, -1, true, 0);
                                                var30 = new cl((ej) this, var29);
                                                var30.f(-86);
                                                var31 = var30.a(false, (byte) -127);
                                                var22 = var22 + var31;
                                                if (var20 != 0) {
                                                  var2.a(var17, var18, var22, ((ej) this).field_z, var16, true);
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
                                                    var22 = var22 - ((ej) this).field_P[42];
                                                    var2.a((byte) -68, var18, var22);
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
                      var14_ref_ne = ((ej) this).field_D.field_Eb[var13_int];
                      if (((ej) this).field_z == var14_ref_ne.field_a) {
                        break L22;
                      } else {
                        if (var14_ref_ne.a(false)) {
                          var4 = var4 + (double)(((ej) this).field_P[21] * 2.0f / (float)((ej) this).field_D.field_W);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    if (var14_ref_ne.c(83)) {
                      var10 = var10 + (double)((ej) this).field_P[17];
                      var6 = var6 + (double)((ej) this).field_P[13];
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
                  if (var34.i(-21428)) {
                    var4 = var4 - (double)(((ej) this).field_P[22] * 2.0f / (float)((ej) this).field_D.field_W);
                    break L23;
                  } else {
                    if (!var34.f((byte) -125)) {
                      if (var34.s(param0 + 127)) {
                        var10 = var10 - (double)((ej) this).field_P[18];
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      var6 = var6 - (double)((ej) this).field_P[14];
                      break L23;
                    }
                  }
                }
                L24: {
                  L25: {
                    if (var34.p((byte) -113)) {
                      break L25;
                    } else {
                      if (!var34.d((byte) 105)) {
                        var8 = var8 + (double)((ej) this).field_P[27];
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  var8 = var8 - (double)((ej) this).field_P[16];
                  break L24;
                }
                var34 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].a((byte) 123);
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
        int var4 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          if (param2 == -14) {
            break L0;
          } else {
            field_G = null;
            break L0;
          }
        }
        L1: {
          if (null == ik.field_d) {
            break L1;
          } else {
            if (-14 != rs.field_q) {
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
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
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
              if (-10 == rs.field_q) {
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
        ((ej) this).field_k = param0;
        if (param1 != 4) {
            return;
        }
        ((ej) this).field_t = -1;
    }

    private final void a(int param0, int param1, int param2, jd param3) {
        if (param2 != 19551) {
            return;
        }
        float var5 = (float)param3.g((byte) 122);
        if (!(!param3.c(false))) {
            var5 = var5 * ((ej) this).field_P[59];
        }
        ((ej) this).field_m.a(param2 ^ -19507, param3.field_w, (float)param0 * var5, param1, param3.g(0), ((ej) this).field_n, param3.field_J);
    }

    private final cl b(jd param0, byte param1) {
        id[] var3 = null;
        cl var3_ref = null;
        int var4 = 0;
        id var5 = null;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((ej) this).field_u != null) {
            var3 = ((ej) this).field_u;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  if (param0.field_N == var5.field_a) {
                    param0.field_K = var5.field_e;
                    if (0 >= var5.field_b) {
                      break L0;
                    } else {
                      param0.field_t = var5.field_b;
                      param0.field_Y = var5.field_b;
                      break L0;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          var3_ref = new cl((ej) this, param0);
          ((ej) this).field_p.a((byte) -119, (tc) (Object) var3_ref);
          if (param1 <= -66) {
            break L2;
          } else {
            var7 = null;
            boolean discarded$1 = ((ej) this).a((mn) null, 49);
            break L2;
          }
        }
        L3: {
          if (param0.field_H == 0) {
            break L3;
          } else {
            if (null != ((ej) this).field_I[param0.g(0)][-1 + param0.field_H]) {
              break L3;
            } else {
              ((ej) this).field_I[param0.g(0)][param0.field_H - 1] = new float[((ej) this).field_D.field_Eb.length];
              break L3;
            }
          }
        }
        return var3_ref;
    }

    ej(ha param0, int param1, boolean param2, id[] param3) {
        ((ej) this).field_H = new at();
        ((ej) this).field_O = new at();
        ((ej) this).field_p = new at();
        ((ej) this).field_D = param0;
        ((ej) this).field_z = param1;
        ((ej) this).field_P = new float[62];
        int discarded$0 = ns.a(false, 3, li.field_n);
        ((ej) this).field_D.field_k.a((byte) -119, (tc) this);
        aj.a(((ej) this).field_P, 117);
        ((ej) this).field_u = param3;
        int var5 = 0;
        jd var6 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].e((byte) 104);
        while (var6 != null) {
            if (var5 < var6.field_H) {
                var5 = var6.field_H;
            }
            var6 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].a((byte) 123);
        }
        ((ej) this).field_I = new float[8][var5][];
        ((ej) this).field_U = new nn(((ej) this).field_D);
        ((ej) this).field_l = new nn(((ej) this).field_D);
        ((ej) this).field_A = new float[10][((ej) this).field_D.field_Eb.length];
        ((ej) this).field_K = new float[10][((ej) this).field_D.field_Eb.length];
        ((ej) this).field_n = new float[8][10][((ej) this).field_D.field_Eb.length];
        ((ej) this).field_V = new float[((ej) this).field_D.field_Eb.length];
        ((ej) this).field_N = new float[((ej) this).field_D.field_Eb.length];
        ((ej) this).field_J = null;
        ((ej) this).field_m = new ir(((ej) this).field_D.field_Eb, ((ej) this).field_D.field_v, ((ej) this).field_D.field_db);
        ((ej) this).field_v = new float[((ej) this).field_D.field_Eb.length];
        ((ej) this).field_T = new float[((ej) this).field_D.field_Eb.length];
        ((ej) this).field_C = new float[((ej) this).field_D.field_Eb.length];
        var6 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].e((byte) 126);
        while (var6 != null) {
            cl discarded$1 = this.b(var6, (byte) -68);
            var6 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].a((byte) 123);
        }
        ((ej) this).field_Q = (sm) (Object) new aw((ej) this);
        ((ej) this).field_F = (sm) (Object) new ge((ej) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Unpacking models";
    }
}

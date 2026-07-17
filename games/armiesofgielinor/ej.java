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
        float stackIn_71_0 = 0.0f;
        float stackIn_72_0 = 0.0f;
        float stackIn_73_0 = 0.0f;
        float stackIn_74_0 = 0.0f;
        float stackIn_74_1 = 0.0f;
        float stackOut_70_0 = 0.0f;
        float stackOut_69_0 = 0.0f;
        float stackOut_71_0 = 0.0f;
        float stackOut_73_0 = 0.0f;
        float stackOut_73_1 = 0.0f;
        float stackOut_72_0 = 0.0f;
        float stackOut_72_1 = 0.0f;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < 0) {
            break L0;
          } else {
            if (param2 < 0) {
              break L0;
            } else {
              if (~param0 <= ~((ej) this).field_D.field_v) {
                break L0;
              } else {
                if (~param2 <= ~((ej) this).field_D.field_db) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      var5 = 0.0f;
                      var6 = param2 * ((ej) this).field_D.field_v + param0;
                      var7 = ((ej) this).field_D.field_Eb[var6];
                      var8_int = param1;
                      if (var8_int != 29) {
                        if (var8_int != 30) {
                          if (var8_int != 31) {
                            if (var8_int == 32) {
                              break L2;
                            } else {
                              if (var8_int == 33) {
                                break L2;
                              } else {
                                L3: {
                                  if (var8_int == 23) {
                                    break L3;
                                  } else {
                                    if (24 == var8_int) {
                                      break L3;
                                    } else {
                                      L4: {
                                        if (var8_int != 47) {
                                          if (48 != var8_int) {
                                            if (var8_int != 49) {
                                              if (var8_int != 50) {
                                                if (var8_int != 51) {
                                                  if (52 == var8_int) {
                                                    break L4;
                                                  } else {
                                                    if (53 == var8_int) {
                                                      break L4;
                                                    } else {
                                                      break L1;
                                                    }
                                                  }
                                                } else {
                                                  break L4;
                                                }
                                              } else {
                                                break L4;
                                              }
                                            } else {
                                              break L4;
                                            }
                                          } else {
                                            break L4;
                                          }
                                        } else {
                                          break L4;
                                        }
                                      }
                                      if (var7.field_c == null) {
                                        break L1;
                                      } else {
                                        L5: {
                                          if (uc.field_d[param1][6] > var7.field_c.field_Y) {
                                            stackOut_70_0 = (float)var7.field_c.field_Y;
                                            stackIn_71_0 = stackOut_70_0;
                                            break L5;
                                          } else {
                                            stackOut_69_0 = (float)uc.field_d[param1][6];
                                            stackIn_71_0 = stackOut_69_0;
                                            break L5;
                                          }
                                        }
                                        L6: {
                                          var8 = stackIn_71_0;
                                          stackOut_71_0 = var5;
                                          stackIn_73_0 = stackOut_71_0;
                                          stackIn_72_0 = stackOut_71_0;
                                          if (((ej) this).field_z == var7.field_c.field_O) {
                                            stackOut_73_0 = stackIn_73_0;
                                            stackOut_73_1 = -var8;
                                            stackIn_74_0 = stackOut_73_0;
                                            stackIn_74_1 = stackOut_73_1;
                                            break L6;
                                          } else {
                                            stackOut_72_0 = stackIn_72_0;
                                            stackOut_72_1 = var8;
                                            stackIn_74_0 = stackOut_72_0;
                                            stackIn_74_1 = stackOut_72_1;
                                            break L6;
                                          }
                                        }
                                        var5 = stackIn_74_0 + stackIn_74_1;
                                        break L1;
                                      }
                                    }
                                  }
                                }
                                if (!var7.c(62)) {
                                  break L1;
                                } else {
                                  if (var7.field_c == null) {
                                    L7: {
                                      var8 = this.a(20, 1, var6);
                                      if (1.0f > var8) {
                                        var8 = 1.0f;
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    var5 = var5 + var8;
                                    break L1;
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                            }
                          } else {
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    if (null == var7.field_c) {
                      break L1;
                    } else {
                      if (((ej) this).field_z != var7.field_c.field_O) {
                        break L1;
                      } else {
                        L8: {
                          L9: {
                            var8_int = 0;
                            if (0 >= param0) {
                              break L9;
                            } else {
                              if (((ej) this).field_D.field_Eb[-1 + var6].field_c != null) {
                                break L9;
                              } else {
                                var8_int = 1;
                                break L8;
                              }
                            }
                          }
                          L10: {
                            if (param2 <= 0) {
                              break L10;
                            } else {
                              if (((ej) this).field_D.field_Eb[-((ej) this).field_D.field_v + var6].field_c == null) {
                                var8_int = 1;
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (param2 >= ((ej) this).field_D.field_db + -1) {
                              break L11;
                            } else {
                              if (null == ((ej) this).field_D.field_Eb[var6 + ((ej) this).field_D.field_v].field_c) {
                                var8_int = 1;
                                break L8;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (~(-1 + ((ej) this).field_D.field_v) >= ~param0) {
                            break L8;
                          } else {
                            if (((ej) this).field_D.field_Eb[1 + var6].field_c != null) {
                              break L8;
                            } else {
                              var8_int = 1;
                              break L8;
                            }
                          }
                        }
                        L12: {
                          if (var7.field_c.field_bb) {
                            var5 = 0.0f;
                            break L12;
                          } else {
                            if (var8_int != 0) {
                              var5 = this.a(var7.field_c.field_N, 1, var6);
                              if (var5 >= 1.0f) {
                                break L12;
                              } else {
                                var5 = 1.0f;
                                break L1;
                              }
                            } else {
                              var5 = 0.0f;
                              break L1;
                            }
                          }
                        }
                        break L1;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0.a(58, ((ej) this).field_D);
                if (var3 != null) {
                  var3.a(64, ((ej) this).field_D);
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param1 <= -123) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ej.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0 != 0;
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
        if (!var7.a(false)) {
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
                if (var7.field_a <= -1) {
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
                if (var8 >= 7) {
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
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = 0;
        stackOut_1_0 = var6;
        stackIn_3_0 = stackOut_1_0;
        L0: while (true) {
          if (stackIn_3_0 >= 8) {
            return;
          } else {
            if (((ej) this).field_I[var6].length >= param3) {
              L1: {
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
                            break L1;
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
                    break L1;
                  }
                } else {
                  var6++;
                  break L1;
                }
              }
              stackOut_2_0 = var6;
              stackIn_3_0 = stackOut_2_0;
              continue L0;
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
        if (((ej) this).field_D.field_l.b(false) > 0) {
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
                if (((ej) this).field_t >= 30) {
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
                  L2: {
                    if (((ej) this).field_t == 0) {
                      L3: {
                        if (0 != ((ej) this).field_D.field_t[((ej) this).field_z].b(false)) {
                          break L3;
                        } else {
                          if (null == ((ej) this).field_D.field_K) {
                            break L3;
                          } else {
                            var2 = 0;
                            var3_ref_ne__ = ((ej) this).field_D.field_Eb;
                            var4 = 0;
                            L4: while (true) {
                              L5: {
                                if (var3_ref_ne__.length <= var4) {
                                  break L5;
                                } else {
                                  L6: {
                                    var5 = var3_ref_ne__[var4];
                                    if (!var5.a(((ej) this).field_z, (byte) 91)) {
                                      break L6;
                                    } else {
                                      if (!var5.d(param0 + 5026)) {
                                        break L6;
                                      } else {
                                        if (null != var5.field_c) {
                                          break L6;
                                        } else {
                                          var2 = 1;
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                  var4++;
                                  continue L4;
                                }
                              }
                              if (var2 != 0) {
                                break L3;
                              } else {
                                var3 = 0;
                                var4 = 0;
                                L7: while (true) {
                                  L8: {
                                    if (((ej) this).field_D.field_W <= var4) {
                                      break L8;
                                    } else {
                                      if (var3 != 0) {
                                        break L8;
                                      } else {
                                        L9: {
                                          if (~var4 == ~((ej) this).field_z) {
                                            break L9;
                                          } else {
                                            if (0 == (1 & ((ej) this).field_D.a((byte) 78) >> var4)) {
                                              break L9;
                                            } else {
                                              if (((ej) this).field_D.c(var4, -16985, ((ej) this).field_D.field_K.field_w)) {
                                                break L9;
                                              } else {
                                                var3 = 1;
                                                break L9;
                                              }
                                            }
                                          }
                                        }
                                        var4++;
                                        continue L7;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (var3 == 0) {
                                      ((ej) this).field_D.a(0, ((ej) this).field_D.field_u | 1 << ((ej) this).field_z);
                                      break L10;
                                    } else {
                                      break L10;
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
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((ej) this).field_L = 0;
                  this.b(2, 4);
                  break L1;
                } else {
                  if (var2 == 2) {
                    this.a(-113, false);
                    break L1;
                  } else {
                    if (var2 != 8) {
                      if (3 == var2) {
                        L11: {
                          if (((ej) this).field_t != 0) {
                            break L11;
                          } else {
                            int discarded$4 = 0;
                            this.a(((ej) this).field_p);
                            ((ej) this).field_S = null;
                            ((ej) this).field_M = (cl) (Object) ((ej) this).field_p.e((byte) 127);
                            break L11;
                          }
                        }
                        this.f(0);
                        break L1;
                      } else {
                        if (var2 == 4) {
                          this.a(param0 + 4972, true);
                          break L1;
                        } else {
                          if (var2 != 5) {
                            if (var2 != 6) {
                              if (var2 != 7) {
                                break L1;
                              } else {
                                if (((ej) this).field_t < 50) {
                                  return false;
                                } else {
                                  return true;
                                }
                              }
                            } else {
                              int discarded$5 = -24236;
                              this.e();
                              break L1;
                            }
                          } else {
                            int discarded$6 = 0;
                            this.i();
                            break L1;
                          }
                        }
                      }
                    } else {
                      int discarded$7 = -25523;
                      this.g();
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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        if (null == ((ej) this).field_D.field_K) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param1) {
              stackOut_4_0 = this;
              stackOut_4_1 = 8;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 5;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          this.b(stackIn_5_1, 4);
          return;
        } else {
          L1: {
            int discarded$2 = 23;
            this.a(param1, ((ej) this).field_L);
            if (param0 <= -89) {
              break L1;
            } else {
              ((ej) this).field_H = null;
              break L1;
            }
          }
          L2: {
            ((ej) this).field_L = ((ej) this).field_L + 1;
            if (5 > ((ej) this).field_L) {
              break L2;
            } else {
              L3: {
                ((ej) this).field_L = 0;
                stackOut_9_0 = this;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (param1) {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 5;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L3;
                } else {
                  stackOut_10_0 = this;
                  stackOut_10_1 = 8;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L3;
                }
              }
              this.b(stackIn_12_1, 4);
              break L2;
            }
          }
          return;
        }
    }

    final sm a(cl param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        sm stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        sm stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 29 % ((param1 - -27) / 60);
            stackOut_0_0 = ((ej) this).field_Q;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ej.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    private final void c(byte param0) {
        int var2 = 0;
        float[] var2_ref_float__ = null;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        float[] var4_ref_float__ = null;
        float[][] var5 = null;
        int var5_int = 0;
        tc var6 = null;
        int var7 = 0;
        float[] var8 = null;
        float[] var9 = null;
        ne var10 = null;
        ne var11 = null;
        jd var12 = null;
        float[][] var13 = null;
        float[] var14 = null;
        float[][] var15 = null;
        float[] var16 = null;
        float[][] var17 = null;
        float[] var18 = null;
        float[][] var19 = null;
        int stackIn_52_0 = 0;
        float[][] stackIn_55_0 = null;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        float[][] stackOut_54_0 = null;
        float[][] stackOut_53_0 = null;
        var3 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ej) this).field_o != 0) {
          L0: {
            if (((ej) this).field_o == 1) {
              if (((ej) this).field_D.field_W <= ((ej) this).field_x) {
                ((ej) this).field_o = ((ej) this).field_o + 1;
                break L0;
              } else {
                L1: {
                  var2 = ((ej) this).field_x;
                  var12 = ((ej) this).field_r;
                  if (((ej) this).field_D.o(var2, -1) != ((ej) this).field_D.o(((ej) this).field_z, -1)) {
                    stackOut_51_0 = 0;
                    stackIn_52_0 = stackOut_51_0;
                    break L1;
                  } else {
                    stackOut_50_0 = 1;
                    stackIn_52_0 = stackOut_50_0;
                    break L1;
                  }
                }
                L2: {
                  var4 = stackIn_52_0;
                  if (var4 == 0) {
                    stackOut_54_0 = ((ej) this).field_K;
                    stackIn_55_0 = stackOut_54_0;
                    break L2;
                  } else {
                    stackOut_53_0 = ((ej) this).field_A;
                    stackIn_55_0 = stackOut_53_0;
                    break L2;
                  }
                }
                L3: {
                  var19 = stackIn_55_0;
                  var17 = var19;
                  var15 = var17;
                  var13 = var15;
                  var5 = var13;
                  if (((ej) this).field_s > 8) {
                    L4: {
                      if (var12 == null) {
                        var6 = ((ej) this).field_D.field_t[var2].field_d.field_b;
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
                        var3 = (Object) (Object) (jd) (Object) var6;
                        break L5;
                      }
                    }
                    ((ej) this).field_r = (jd) var3;
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
                    if (((jd) var3).field_S) {
                      break L6;
                    } else {
                      if (0 != ((ej) this).field_s) {
                        if (var4 != 0) {
                          ((ej) this).field_s = 8;
                          break L6;
                        } else {
                          this.a(1, -1 + ((ej) this).field_s, 19551, (jd) var3);
                          break L6;
                        }
                      } else {
                        ((ej) this).field_m.a(var19, 1, -19545, (jd) var3);
                        break L6;
                      }
                    }
                  }
                  ((ej) this).field_s = ((ej) this).field_s + 1;
                  ((jd) var3).field_X = false;
                  break L0;
                }
              }
            } else {
              if (((ej) this).field_o != 2) {
                if (((ej) this).field_o == 3) {
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
                            var11 = ((ej) this).field_D.field_Eb[var2];
                            var4 = var11.a((byte) -107);
                            if (var4 == 0) {
                              break L9;
                            } else {
                              this.a(var4, 1, var2, 29);
                              break L9;
                            }
                          }
                          if (null != var11.field_c) {
                            var4 = var11.field_c.field_E;
                            if (var4 != 0) {
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
                    var18 = ((ej) this).field_n[0][9];
                    var16 = var18;
                    var14 = var16;
                    var9 = var14;
                    var8 = var9;
                    var2_ref_float__ = var8;
                    var3_int = 0;
                    L13: while (true) {
                      if (var3_int >= var18.length) {
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
                            var10 = ((ej) this).field_D.field_Eb[var3_int];
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

    private final void g() {
        cl var2 = null;
        cl var3 = null;
        if (null != ((ej) this).field_M) {
          L0: {
            if (((ej) this).field_M.field_o.field_S) {
              break L0;
            } else {
              if (((ej) this).field_M.field_o.field_O == ((ej) this).field_z) {
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
          this.b(3, 4);
          return;
        }
    }

    private final void a(int param0, jd param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 > 56) {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= 8) {
                  break L0;
                } else {
                  this.a(param2, var4_int, 19551, param1);
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ej.K(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    public final void a(jd param0, byte param1) {
        try {
            if (param1 != -2) {
                field_G = null;
            }
            ((ej) this).a(80, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ej.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, boolean param3) {
        Object var5 = null;
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
        float[][] var14 = null;
        float[][][] var15 = null;
        float[][] var16 = null;
        float[][] var17 = null;
        float[][][] var18 = null;
        float[][] var19 = null;
        float[][] var20 = null;
        float[][][] var21 = null;
        float[][] var22 = null;
        float[][] var23 = null;
        float[][][] var24 = null;
        float[][] var25 = null;
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
              if (var7_int == 0) {
                break L4;
              } else {
                if (var7_int != 1) {
                  if (var7_int == 2) {
                    var5 = (Object) (Object) ((ej) this).field_K[param1];
                    break L4;
                  } else {
                    if (var7_int != 3) {
                      if (var7_int == 4) {
                        var5 = null;
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
                      var23 = ((ej) this).field_I[1];
                      var20 = var23;
                      var17 = var20;
                      var14 = var17;
                      var6_ref_float____ = var14;
                      if (var6_ref_float____ == null) {
                        break L4;
                      } else {
                        if (0 >= var23.length) {
                          break L4;
                        } else {
                          var7_int = param1 % var23.length;
                          var24 = ((ej) this).field_I;
                          var21 = var24;
                          var18 = var21;
                          var15 = var18;
                          var12 = var15;
                          var8_array = var12;
                          var9 = 0;
                          L6: while (true) {
                            if (var9 >= var24.length) {
                              break L4;
                            } else {
                              var25 = var24[var9];
                              var22 = var25;
                              var19 = var22;
                              var16 = var19;
                              var10 = var16;
                              if (var10 != null) {
                                if (var7_int < var25.length) {
                                  if (var25[var7_int] != null) {
                                    var5 = (Object) (Object) var25[var7_int];
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
                  var5 = (Object) (Object) ((ej) this).field_n[param1 % ((ej) this).field_n[4].length][9];
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
                  if (((Object[]) var5).length <= var13) {
                    break L7;
                  } else {
                    fs.field_b[var13] = ((float[]) var5)[var13];
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
        var9 = (float)1;
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
                if (var11 != 4) {
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
                    if (var11 == 3) {
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

    private final void e() {
        jd var2 = null;
        L0: {
          var2 = ((ej) this).field_D.c(((ej) this).field_y, true, ((ej) this).field_E);
          if (var2 != null) {
            ((ej) this).a(80, var2);
            this.b(3, 4);
            break L0;
          } else {
            if (((ej) this).field_t > ((ej) this).field_B - -100) {
              this.b(7, 4);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    private final void a(int[] param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
                    var8 = null;
                    cl discarded$1 = this.b((jd) null, (byte) -90);
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
                        this.a(param0[var4_int], false, -1);
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
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("ej.J(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + -1 + 44 + param2 + 41);
        }
    }

    private final void a(byte param0, float[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ej.Q(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static int a(bv param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$8 = 20;
            int discarded$9 = 30;
            int discarded$10 = 14;
            int discarded$11 = 4;
            var2_int = de.a(-108, param0);
            stackOut_0_0 = var2_int;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ej.H(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 1 + 41);
        }
        return stackIn_1_0;
    }

    final void c(jd param0, byte param1) {
        cl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = 123 % ((param1 - 53) / 41);
            var3 = (cl) (Object) ((ej) this).field_p.e((byte) 95);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                if (var3.field_o == param0) {
                  float discarded$4 = var3.a(false, (byte) -124);
                  return;
                } else {
                  var3 = (cl) (Object) ((ej) this).field_p.a((byte) 123);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("ej.EA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    private final void a(boolean param0, int param1) {
        int var13 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ej) this).field_D == null) {
          return;
        } else {
          if (((ej) this).field_D.field_B[((ej) this).field_z] == null) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, jd param1) {
        cl var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (((ej) this).field_z != param1.field_O) {
                return;
              } else {
                L1: {
                  if (param1.field_p == null) {
                    break L1;
                  } else {
                    if (this != (Object) (Object) param1.field_p.field_r) {
                      break L1;
                    } else {
                      return;
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
                  ((ej) this).field_m.a(((ej) this).field_A, 1, param0 ^ -19465, var3.field_o);
                  if (6 != ((ej) this).field_k) {
                    break L3;
                  } else {
                    this.b(3, 4);
                    ((ej) this).field_M = (cl) (Object) ((ej) this).field_p.a(true, (tc) (Object) var3);
                    ((ej) this).field_t = 2;
                    break L3;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("ej.W(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    private final void f(int param0) {
        int var2_int = 0;
        float var2 = 0.0f;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        jd var7 = null;
        jd var8 = null;
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
            var8 = var7;
            if (var8 != null) {
              if (var8.field_X) {
                L3: {
                  ((ej) this).field_m.a(((ej) this).field_K, 1, -19545, var8);
                  if (var8.field_E == 0) {
                    break L3;
                  } else {
                    this.a(3, -14092, var8.field_w * ((ej) this).field_D.field_v + var8.field_J, var8.field_E, 1);
                    break L3;
                  }
                }
                this.a(66, var8, 1);
                ((ej) this).field_m.a(((ej) this).field_n[var7.g(0)], 1, param0 + -19545, var8);
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
              if (var3 != null) {
                var3.field_X = true;
                var3 = (jd) (Object) ((ej) this).field_D.field_t[var2_int].a((byte) 123);
                continue L5;
              } else {
                var2_int++;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(at param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        cl var4_ref = null;
        Object var5 = null;
        cl var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (var3_int == 0) {
                break L0;
              } else {
                var3_int = 0;
                var4 = null;
                var5_ref = (cl) (Object) ((ej) this).field_p.e((byte) 113);
                L2: while (true) {
                  if (var5_ref == null) {
                    continue L1;
                  } else {
                    var4_ref = (cl) (Object) ((ej) this).field_p.a((byte) 123);
                    if (var4_ref == null) {
                      continue L1;
                    } else {
                      L3: {
                        if (var5_ref.a((byte) -87, var4_ref)) {
                          var5_ref.d(-122);
                          var3_int = 1;
                          ro.a((tc) (Object) var4_ref, (tc) (Object) var5_ref, true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var5_ref = var4_ref;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ej.AA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 0 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        this.a(0, -14092, param2, param0, 1);
    }

    private final void i() {
        float var3 = 0.0f;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13_int = 0;
        jb var13 = null;
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
        sm var34 = null;
        ne var35 = null;
        ne var36 = null;
        jd var37 = null;
        int stackIn_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        L0: {
          var33 = null;
          var32 = ArmiesOfGielinor.field_M ? 1 : 0;
          var34 = ((ej) this).field_F;
          if (((ej) this).field_D.field_H[((ej) this).field_z] + -((ej) this).field_q >= 50) {
            var3 = 1.401298464324817e-45f;
            var4 = 0.3;
            var6 = 0.0;
            var8 = 0.0;
            var10 = 0.0;
            var34.b((byte) -122);
            var37 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].e((byte) 89);
            L1: while (true) {
              if (var37 == null) {
                var13_int = 0;
                L2: while (true) {
                  if (((ej) this).field_D.field_Eb.length <= var13_int) {
                    var12 = 0;
                    var13_int = 0;
                    L3: while (true) {
                      if (~((ej) this).field_D.field_Eb.length >= ~var13_int) {
                        L4: {
                          if (var12 == 0) {
                            break L4;
                          } else {
                            var13 = var34.a((byte) -84);
                            if (var13 == null) {
                              break L4;
                            } else {
                              this.b(6, 4);
                              ((ej) this).field_B = ((ej) this).field_t;
                              var14 = var13.field_r;
                              int discarded$1 = var13.a((byte) 5, (ej) this);
                              if (var14 == -1) {
                                break L4;
                              } else {
                                if (0 <= var14) {
                                  ((ej) this).field_q = ((ej) this).field_q + bw.field_m[var14][8];
                                  break L4;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        }
                        this.b(7, 4);
                        break L0;
                      } else {
                        L5: {
                          var36 = ((ej) this).field_D.field_Eb[var13_int];
                          if (null == var36.field_c) {
                            if (!var36.d(-37)) {
                              break L5;
                            } else {
                              if (((ej) this).field_z != var36.field_a) {
                                break L5;
                              } else {
                                var15 = ((ej) this).field_D.field_E[((ej) this).field_z];
                                var16 = var13_int % ((ej) this).field_D.field_v;
                                var17 = var13_int / ((ej) this).field_D.field_v;
                                var18 = 0;
                                L6: while (true) {
                                  if (var18 >= 75) {
                                    break L5;
                                  } else {
                                    L7: {
                                      if (var18 == 72) {
                                        break L7;
                                      } else {
                                        if (var18 == 39) {
                                          break L7;
                                        } else {
                                          if (var18 != 7) {
                                            if (var18 == 34) {
                                              break L7;
                                            } else {
                                              if (var18 != 51) {
                                                if (var18 != 27) {
                                                  L8: {
                                                    var19 = bw.field_m[var18][1];
                                                    if (var36.field_h != 11) {
                                                      break L8;
                                                    } else {
                                                      if (~var36.field_g == ~var19) {
                                                        break L8;
                                                      } else {
                                                        break L7;
                                                      }
                                                    }
                                                  }
                                                  L9: {
                                                    if (-1 == var19) {
                                                      if ((((ej) this).field_D.field_a[((ej) this).field_z][var19 + 1] & 1 << b.a(false, var18)) == 0) {
                                                        break L7;
                                                      } else {
                                                        break L9;
                                                      }
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                  L10: {
                                                    var20 = ((ej) this).field_D.b(var17, -26813, var18, var16, ((ej) this).field_z) ? 1 : 0;
                                                    var21 = var20;
                                                    if (var20 != 0) {
                                                      break L10;
                                                    } else {
                                                      L11: {
                                                        ((ej) this).field_D.field_H[((ej) this).field_z] = ((ej) this).field_D.field_H[((ej) this).field_z] + ((ej) this).field_D.k(-116, ((ej) this).field_z);
                                                        if (!((ej) this).field_D.b(var17, -26813, var18, var16, ((ej) this).field_z)) {
                                                          stackOut_58_0 = 0;
                                                          stackIn_59_0 = stackOut_58_0;
                                                          break L11;
                                                        } else {
                                                          stackOut_57_0 = 1;
                                                          stackIn_59_0 = stackOut_57_0;
                                                          break L11;
                                                        }
                                                      }
                                                      var21 = stackIn_59_0;
                                                      ((ej) this).field_D.field_H[((ej) this).field_z] = ((ej) this).field_D.field_H[((ej) this).field_z] - ((ej) this).field_D.k(-101, ((ej) this).field_z);
                                                      break L10;
                                                    }
                                                  }
                                                  if (var21 == 0) {
                                                    break L7;
                                                  } else {
                                                    L12: {
                                                      var22 = 0.0f;
                                                      var23 = bw.field_m[var18][4];
                                                      var22 = var22 + (float)var23 * ((ej) this).field_P[26];
                                                      var22 = this.a(var18, 1, var13_int);
                                                      var25 = bw.field_m[var18][1];
                                                      if (var25 == -1) {
                                                        break L12;
                                                      } else {
                                                        var24 = var15[var25];
                                                        if (~var24 == ~bw.field_m[var18][2]) {
                                                          var22 = var22 + (float)var24 * ((ej) this).field_P[23];
                                                          break L12;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      var22 = var22 - ((ej) this).field_P[25] * (float)bw.field_m[var18][8] * 0.029999999329447746f;
                                                      var26 = bw.field_m[var18][10];
                                                      var27 = bw.field_m[var18][12];
                                                      if (18 == var27) {
                                                        var22 = var22 - ((ej) this).field_P[45];
                                                        break L13;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                    L14: {
                                                      L15: {
                                                        if ((var26 & 2) != 0) {
                                                          break L15;
                                                        } else {
                                                          if ((16 & var26) == 0) {
                                                            break L14;
                                                          } else {
                                                            break L15;
                                                          }
                                                        }
                                                      }
                                                      var22 = (float)((double)var22 + var8);
                                                      var28 = 0;
                                                      L16: while (true) {
                                                        if (var28 >= 8) {
                                                          break L14;
                                                        } else {
                                                          var22 = var22 + ((ej) this).field_P[15] * ((ej) this).field_A[var28][var13_int];
                                                          var28++;
                                                          continue L16;
                                                        }
                                                      }
                                                    }
                                                    L17: {
                                                      if ((32 & var26) != 0) {
                                                        var22 = (float)((double)var22 + var10);
                                                        break L17;
                                                      } else {
                                                        break L17;
                                                      }
                                                    }
                                                    L18: {
                                                      if (21 == var18) {
                                                        var22 = (float)((double)var22 + var6);
                                                        break L18;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                    L19: {
                                                      L20: {
                                                        if (var18 == 0) {
                                                          break L20;
                                                        } else {
                                                          if (3 != var18) {
                                                            break L19;
                                                          } else {
                                                            break L20;
                                                          }
                                                        }
                                                      }
                                                      var22 = (float)((double)var22 + var4);
                                                      var28 = 0;
                                                      L21: while (true) {
                                                        if (var28 >= 8) {
                                                          break L19;
                                                        } else {
                                                          var22 = var22 + ((ej) this).field_P[44] * ((ej) this).field_A[var28][var13_int];
                                                          var22 = var22 - ((ej) this).field_K[var28][var13_int] * ((ej) this).field_P[44];
                                                          var28++;
                                                          continue L21;
                                                        }
                                                      }
                                                    }
                                                    L22: {
                                                      var28 = 1;
                                                      if (var18 != 74) {
                                                        break L22;
                                                      } else {
                                                        var28 = 2;
                                                        break L22;
                                                      }
                                                    }
                                                    var29 = new jd(var16, var17, var18, ((ej) this).field_z, var23, var23, var28, 0, 0, ((ej) this).field_D, 0, 0, -1, true, 0);
                                                    var30 = new cl((ej) this, var29);
                                                    var30.f(-86);
                                                    var31 = var30.a(false, (byte) -127);
                                                    var22 = var22 + var31;
                                                    if (var20 != 0) {
                                                      var34.a(var17, var18, var22, ((ej) this).field_z, var16, true);
                                                      var12 = 1;
                                                      if (var3 < var22) {
                                                        var3 = var22;
                                                        break L7;
                                                      } else {
                                                        break L7;
                                                      }
                                                    } else {
                                                      if (var21 == 0) {
                                                        break L7;
                                                      } else {
                                                        var22 = var22 - ((ej) this).field_P[42];
                                                        var34.a((byte) -68, var18, var22);
                                                        break L7;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L7;
                                                }
                                              } else {
                                                break L7;
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                    var18++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var13_int++;
                        continue L3;
                      }
                    }
                  } else {
                    L23: {
                      var35 = ((ej) this).field_D.field_Eb[var13_int];
                      var36 = var35;
                      var36 = var35;
                      if (~((ej) this).field_z == ~var35.field_a) {
                        break L23;
                      } else {
                        if (var35.a(false)) {
                          var4 = var4 + (double)(((ej) this).field_P[21] * 2.0f / (float)((ej) this).field_D.field_W);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var35.c(83)) {
                        var10 = var10 + (double)((ej) this).field_P[17];
                        var6 = var6 + (double)((ej) this).field_P[13];
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    var13_int++;
                    continue L2;
                  }
                }
              } else {
                L25: {
                  if (var37.i(-21428)) {
                    var4 = var4 - (double)(((ej) this).field_P[22] * 2.0f / (float)((ej) this).field_D.field_W);
                    break L25;
                  } else {
                    if (!var37.f((byte) -125)) {
                      if (var37.s(127)) {
                        var10 = var10 - (double)((ej) this).field_P[18];
                        break L25;
                      } else {
                        break L25;
                      }
                    } else {
                      var6 = var6 - (double)((ej) this).field_P[14];
                      break L25;
                    }
                  }
                }
                L26: {
                  L27: {
                    if (var37.p((byte) -113)) {
                      break L27;
                    } else {
                      if (!var37.d((byte) 105)) {
                        var8 = var8 + (double)((ej) this).field_P[27];
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                  var8 = var8 - (double)((ej) this).field_P[16];
                  break L26;
                }
                var37 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].a((byte) 123);
                continue L1;
              }
            }
          } else {
            this.b(7, 4);
            break L0;
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
            if (rs.field_q != 13) {
              break L1;
            } else {
              ik.field_d = null;
              return true;
            }
          }
        }
        if (hf.field_c) {
          int discarded$10 = -1;
          if (os.e()) {
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
              if (rs.field_q != 13) {
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
              if (rs.field_q == 9) {
                break L6;
              } else {
                if (rs.field_q == 10) {
                  break L6;
                } else {
                  if (rs.field_q != 11) {
                    if (80 != rs.field_q) {
                      return false;
                    } else {
                      int discarded$11 = -1;
                      if (os.e()) {
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
          int discarded$12 = 0;
          return cd.a(param0, param1);
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
        float var5_float = 0.0f;
        try {
            var5_float = (float)param3.g((byte) 122);
            if (!(!param3.c(false))) {
                var5_float = var5_float * ((ej) this).field_P[59];
            }
            ((ej) this).field_m.a(-110, param3.field_w, (float)param0 * var5_float, param1, param3.g(0), ((ej) this).field_n, param3.field_J);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ej.G(" + param0 + 44 + param1 + 44 + 19551 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final cl b(jd param0, byte param1) {
        RuntimeException var3 = null;
        cl var3_ref = null;
        int var4 = 0;
        id var5 = null;
        int var6 = 0;
        Object var7 = null;
        id[] var8 = null;
        cl stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        cl stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((ej) this).field_u != null) {
                var8 = ((ej) this).field_u;
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
              var3_ref = new cl((ej) this, param0);
              ((ej) this).field_p.a((byte) -119, (tc) (Object) var3_ref);
              if (param1 <= -66) {
                break L4;
              } else {
                var7 = null;
                boolean discarded$1 = ((ej) this).a((mn) null, 49);
                break L4;
              }
            }
            L5: {
              if (param0.field_H == 0) {
                break L5;
              } else {
                if (null != ((ej) this).field_I[param0.g(0)][-1 + param0.field_H]) {
                  break L5;
                } else {
                  ((ej) this).field_I[param0.g(0)][param0.field_H - 1] = new float[((ej) this).field_D.field_Eb.length];
                  break L5;
                }
              }
            }
            stackOut_17_0 = (cl) var3_ref;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("ej.FA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0;
    }

    ej(ha param0, int param1, boolean param2, id[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        jd var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            ((ej) this).field_H = new at();
            ((ej) this).field_O = new at();
            ((ej) this).field_p = new at();
            ((ej) this).field_D = param0;
            ((ej) this).field_z = param1;
            ((ej) this).field_P = new float[62];
            int discarded$3 = ns.a(false, 3, li.field_n);
            ((ej) this).field_D.field_k.a((byte) -119, (tc) this);
            int discarded$4 = 117;
            aj.a(((ej) this).field_P);
            ((ej) this).field_u = param3;
            var5_int = 0;
            var6 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].e((byte) 104);
            L1: while (true) {
              if (var6 == null) {
                ((ej) this).field_I = new float[8][var5_int][];
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
                L2: while (true) {
                  if (var6 == null) {
                    ((ej) this).field_Q = (sm) (Object) new aw((ej) this);
                    ((ej) this).field_F = (sm) (Object) new ge((ej) this);
                    break L0;
                  } else {
                    cl discarded$5 = this.b(var6, (byte) -68);
                    var6 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].a((byte) 123);
                    continue L2;
                  }
                }
              } else {
                L3: {
                  if (var5_int >= var6.field_H) {
                    break L3;
                  } else {
                    var5_int = var6.field_H;
                    break L3;
                  }
                }
                var6 = (jd) (Object) ((ej) this).field_D.field_t[((ej) this).field_z].a((byte) 123);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ej.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Unpacking models";
    }
}

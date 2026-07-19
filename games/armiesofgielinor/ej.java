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
        boolean discarded$0 = false;
        if (param0 != -27464) {
            discarded$0 = ej.b(-7, -126, -85, -67);
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
        float stackIn_73_0 = 0.0f;
        float stackIn_74_0 = 0.0f;
        float stackIn_75_0 = 0.0f;
        float stackIn_76_0 = 0.0f;
        float stackIn_76_1 = 0.0f;
        float stackOut_72_0 = 0.0f;
        float stackOut_71_0 = 0.0f;
        float stackOut_73_0 = 0.0f;
        float stackOut_75_0 = 0.0f;
        float stackOut_75_1 = 0.0f;
        float stackOut_74_0 = 0.0f;
        float stackOut_74_1 = 0.0f;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < 0) {
            break L0;
          } else {
            if (-1 < (param2 ^ -1)) {
              break L0;
            } else {
              if ((param0 ^ -1) <= (this.field_D.field_v ^ -1)) {
                break L0;
              } else {
                if ((param2 ^ -1) <= (this.field_D.field_db ^ -1)) {
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
                      L4: {
                        L5: {
                          var5 = 0.0f;
                          var6 = param2 * this.field_D.field_v + param0;
                          var7 = this.field_D.field_Eb[var6];
                          var8_int = param1;
                          if (var8_int != 29) {
                            break L5;
                          } else {
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var8_int != 30) {
                            break L6;
                          } else {
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (-32 != (var8_int ^ -1)) {
                            break L7;
                          } else {
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if ((var8_int ^ -1) == -33) {
                          break L4;
                        } else {
                          if (var8_int == 33) {
                            break L4;
                          } else {
                            if ((var8_int ^ -1) == -24) {
                              break L3;
                            } else {
                              if (24 == var8_int) {
                                break L3;
                              } else {
                                L8: {
                                  L9: {
                                    if (-48 != (var8_int ^ -1)) {
                                      break L9;
                                    } else {
                                      if (var9 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (48 != var8_int) {
                                      break L10;
                                    } else {
                                      if (var9 == 0) {
                                        break L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (-50 != (var8_int ^ -1)) {
                                      break L11;
                                    } else {
                                      if (var9 == 0) {
                                        break L8;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if ((var8_int ^ -1) != -51) {
                                      break L12;
                                    } else {
                                      if (var9 == 0) {
                                        break L8;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if ((var8_int ^ -1) != -52) {
                                      break L13;
                                    } else {
                                      if (var9 == 0) {
                                        break L8;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  if (52 == var8_int) {
                                    break L8;
                                  } else {
                                    if (53 == var8_int) {
                                      break L8;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                if (var7.field_c == null) {
                                  break L2;
                                } else {
                                  L14: {
                                    if (uc.field_d[param1][6] > var7.field_c.field_Y) {
                                      stackOut_72_0 = (float)var7.field_c.field_Y;
                                      stackIn_73_0 = stackOut_72_0;
                                      break L14;
                                    } else {
                                      stackOut_71_0 = (float)uc.field_d[param1][6];
                                      stackIn_73_0 = stackOut_71_0;
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    var8 = stackIn_73_0;
                                    stackOut_73_0 = var5;
                                    stackIn_75_0 = stackOut_73_0;
                                    stackIn_74_0 = stackOut_73_0;
                                    if (this.field_z == var7.field_c.field_O) {
                                      stackOut_75_0 = stackIn_75_0;
                                      stackOut_75_1 = -var8;
                                      stackIn_76_0 = stackOut_75_0;
                                      stackIn_76_1 = stackOut_75_1;
                                      break L15;
                                    } else {
                                      stackOut_74_0 = stackIn_74_0;
                                      stackOut_74_1 = var8;
                                      stackIn_76_0 = stackOut_74_0;
                                      stackIn_76_1 = stackOut_74_1;
                                      break L15;
                                    }
                                  }
                                  var5 = stackIn_76_0 + stackIn_76_1;
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (null == var7.field_c) {
                        break L2;
                      } else {
                        if (this.field_z != var7.field_c.field_O) {
                          break L2;
                        } else {
                          L16: {
                            L17: {
                              var8_int = 0;
                              if (0 >= param0) {
                                break L17;
                              } else {
                                if (this.field_D.field_Eb[-1 + var6].field_c != null) {
                                  break L17;
                                } else {
                                  var8_int = 1;
                                  if (var9 == 0) {
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            L18: {
                              L19: {
                                if ((param2 ^ -1) >= -1) {
                                  break L19;
                                } else {
                                  if (this.field_D.field_Eb[-this.field_D.field_v + var6].field_c == null) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              L20: {
                                L21: {
                                  if (param2 >= this.field_D.field_db + -1) {
                                    break L21;
                                  } else {
                                    if (null == this.field_D.field_Eb[var6 + this.field_D.field_v].field_c) {
                                      break L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                if ((-1 + this.field_D.field_v ^ -1) >= (param0 ^ -1)) {
                                  break L16;
                                } else {
                                  if (this.field_D.field_Eb[1 + var6].field_c != null) {
                                    break L16;
                                  } else {
                                    var8_int = 1;
                                    if (var9 == 0) {
                                      break L16;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              var8_int = 1;
                              if (var9 == 0) {
                                break L16;
                              } else {
                                break L18;
                              }
                            }
                            var8_int = 1;
                            break L16;
                          }
                          L22: {
                            L23: {
                              if (var7.field_c.field_bb) {
                                break L23;
                              } else {
                                L24: {
                                  if (var8_int != 0) {
                                    break L24;
                                  } else {
                                    var5 = 0.0f;
                                    if (var9 == 0) {
                                      break L22;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                var5 = this.a(var7.field_c.field_N, 1, var6);
                                if (var5 >= 1.0f) {
                                  break L22;
                                } else {
                                  var5 = 1.0f;
                                  if (var9 == 0) {
                                    break L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            var5 = 0.0f;
                            break L22;
                          }
                          if (var9 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (!var7.c(62)) {
                      break L2;
                    } else {
                      if (var7.field_c == null) {
                        L25: {
                          var8 = this.a(20, param3 ^ -89, var6);
                          if (1.0f > var8) {
                            var8 = 1.0f;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        var5 = var5 + var8;
                        break L2;
                      } else {
                        break L2;
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
        int decompiledRegionSelector0 = 0;
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
                var3 = param0.a(58, this.field_D);
                if (var3 != null) {
                  var3.a(64, this.field_D);
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
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
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("ej.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
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
                if ((var7.field_a ^ -1) != (this.field_z ^ -1)) {
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
            if ((this.field_z ^ -1) != (var7.field_a ^ -1)) {
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
                        if (var9 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
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
                  if ((this.field_z ^ -1) == (var7.field_a ^ -1)) {
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
                if ((var7.field_c.field_O ^ -1) != (this.field_z ^ -1)) {
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
            L7: {
              if (0.0f >= var4) {
                break L7;
              } else {
                var8 = 0;
                L8: while (true) {
                  if ((var8 ^ -1) <= -8) {
                    break L7;
                  } else {
                    this.field_m.a(-101, var6, (float)param2 * var4, var8, 9, this.field_n, var5);
                    var8++;
                    if (var9 != 0) {
                      break L6;
                    } else {
                      if (var9 == 0) {
                        continue L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
            }
            this.field_v[param0] = (float)param2 * var4;
            break L6;
          }
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
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_3_0 = 0;
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
        stackOut_2_0 = var6;
        stackIn_4_0 = stackOut_2_0;
        L1: while (true) {
          L2: {
            if (stackIn_4_0 >= 8) {
              break L2;
            } else {
              if (var14 != 0) {
                break L2;
              } else {
                if ((this.field_I[var6].length ^ -1) <= (param3 ^ -1)) {
                  L3: {
                    var7 = this.field_I[var6][param3 - 1];
                    if (var7 != null) {
                      L4: {
                        var8 = param2 % this.field_D.field_v;
                        var9 = param2 / this.field_D.field_v;
                        if ((param0 ^ -1) != -1) {
                          break L4;
                        } else {
                          this.field_m.a(var7, false, this.field_P[55] * (float)param4, var6, (byte) -4, 0, var9, var8);
                          if (var14 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var10 = 0;
                      var11_int = -param0;
                      L5: while (true) {
                        stackOut_14_0 = param0 ^ -1;
                        stackOut_14_1 = var11_int ^ -1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        L6: while (true) {
                          L7: {
                            L8: {
                              if (stackIn_15_0 >= stackIn_15_1) {
                                break L8;
                              } else {
                                stackOut_16_0 = -param0;
                                stackIn_29_0 = stackOut_16_0;
                                stackIn_17_0 = stackOut_16_0;
                                if (var14 != 0) {
                                  break L7;
                                } else {
                                  var12 = stackIn_17_0;
                                  L9: while (true) {
                                    L10: {
                                      if ((param0 ^ -1) >= (var12 ^ -1)) {
                                        break L10;
                                      } else {
                                        stackOut_19_0 = param0;
                                        stackOut_19_1 = Math.abs(var11_int) + Math.abs(var12);
                                        stackIn_15_0 = stackOut_19_0;
                                        stackIn_15_1 = stackOut_19_1;
                                        stackIn_20_0 = stackOut_19_0;
                                        stackIn_20_1 = stackOut_19_1;
                                        if (var14 != 0) {
                                          continue L6;
                                        } else {
                                          L11: {
                                            if (stackIn_20_0 != stackIn_20_1) {
                                              break L11;
                                            } else {
                                              if (var8 + var11_int < 0) {
                                                break L11;
                                              } else {
                                                if (var9 + var12 < 0) {
                                                  break L11;
                                                } else {
                                                  if ((this.field_D.field_v ^ -1) >= (var11_int + var8 ^ -1)) {
                                                    break L11;
                                                  } else {
                                                    if ((this.field_D.field_db ^ -1) >= (var12 + var9 ^ -1)) {
                                                      break L11;
                                                    } else {
                                                      var10++;
                                                      break L11;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var12++;
                                          if (var14 == 0) {
                                            continue L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    var11_int++;
                                    if (var14 == 0) {
                                      continue L5;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_28_0 = param4;
                            stackIn_29_0 = stackOut_28_0;
                            break L7;
                          }
                          var11 = (float)stackIn_29_0 * this.field_P[55] / (float)var10;
                          var12 = -param0;
                          L12: while (true) {
                            stackOut_30_0 = param0;
                            stackOut_30_1 = var12;
                            stackIn_31_0 = stackOut_30_0;
                            stackIn_31_1 = stackOut_30_1;
                            L13: while (true) {
                              if (stackIn_31_0 <= stackIn_31_1) {
                                break L3;
                              } else {
                                stackOut_32_0 = -param0;
                                stackIn_4_0 = stackOut_32_0;
                                stackIn_33_0 = stackOut_32_0;
                                if (var14 != 0) {
                                  continue L1;
                                } else {
                                  var13 = stackIn_33_0;
                                  L14: while (true) {
                                    L15: {
                                      if (var13 >= param0) {
                                        break L15;
                                      } else {
                                        stackOut_35_0 = param0 ^ -1;
                                        stackOut_35_1 = Math.abs(var12) + Math.abs(var13) ^ -1;
                                        stackIn_31_0 = stackOut_35_0;
                                        stackIn_31_1 = stackOut_35_1;
                                        stackIn_36_0 = stackOut_35_0;
                                        stackIn_36_1 = stackOut_35_1;
                                        if (var14 != 0) {
                                          continue L13;
                                        } else {
                                          L16: {
                                            if (stackIn_36_0 != stackIn_36_1) {
                                              break L16;
                                            } else {
                                              if (0 > var12 + var8) {
                                                break L16;
                                              } else {
                                                if (var13 + var9 < 0) {
                                                  break L16;
                                                } else {
                                                  if (this.field_D.field_v <= var12 + var8) {
                                                    break L16;
                                                  } else {
                                                    if (var9 - -var13 < this.field_D.field_db) {
                                                      this.field_m.a(var7, false, var11, var6, (byte) -4, 0, var9 + var13, var8 + var12);
                                                      break L16;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var13++;
                                          if (var14 == 0) {
                                            continue L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    var12++;
                                    if (var14 == 0) {
                                      continue L12;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var6++;
                  if (var14 == 0) {
                    stackOut_3_0 = var6;
                    stackIn_4_0 = stackOut_3_0;
                    continue L1;
                  } else {
                    break L2;
                  }
                } else {
                  return;
                }
              }
            }
          }
          return;
        }
    }

    final boolean h(int param0) {
        int var2 = 0;
        ne[] var3_ref_ne__ = null;
        int var3 = 0;
        int var4 = 0;
        ne var5 = null;
        int var6 = 0;
        boolean stackIn_36_0 = false;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        boolean stackOut_35_0 = false;
        int stackOut_42_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_53_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_t = this.field_t + 1;
        if (-1 > (this.field_D.field_l.b(false) ^ -1)) {
          return false;
        } else {
          if (this.field_w) {
            if (0 == this.field_t % 2) {
              this.c((byte) -117);
              return false;
            } else {
              return false;
            }
          } else {
            L0: {
              var2 = this.field_k;
              if ((var2 ^ -1) == -1) {
                break L0;
              } else {
                L1: {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            L7: {
                              L8: {
                                if (1 == var2) {
                                  L9: {
                                    if (-1 == (this.field_t ^ -1)) {
                                      L10: {
                                        if (0 != this.field_D.field_t[this.field_z].b(false)) {
                                          break L10;
                                        } else {
                                          if (null == this.field_D.field_K) {
                                            break L10;
                                          } else {
                                            var2 = 0;
                                            var3_ref_ne__ = this.field_D.field_Eb;
                                            var4 = 0;
                                            L11: while (true) {
                                              L12: {
                                                L13: {
                                                  if (var3_ref_ne__.length <= var4) {
                                                    break L13;
                                                  } else {
                                                    var5 = var3_ref_ne__[var4];
                                                    stackOut_35_0 = var5.a(this.field_z, (byte) 91);
                                                    stackIn_43_0 = stackOut_35_0 ? 1 : 0;
                                                    stackIn_36_0 = stackOut_35_0;
                                                    if (var6 != 0) {
                                                      break L12;
                                                    } else {
                                                      L14: {
                                                        if (!stackIn_36_0) {
                                                          break L14;
                                                        } else {
                                                          if (!var5.d(param0 + 5026)) {
                                                            break L14;
                                                          } else {
                                                            if (null != var5.field_c) {
                                                              break L14;
                                                            } else {
                                                              var2 = 1;
                                                              if (var6 == 0) {
                                                                break L13;
                                                              } else {
                                                                break L14;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var4++;
                                                      if (var6 == 0) {
                                                        continue L11;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_42_0 = var2;
                                                stackIn_43_0 = stackOut_42_0;
                                                break L12;
                                              }
                                              if (stackIn_43_0 != 0) {
                                                break L10;
                                              } else {
                                                var3 = 0;
                                                var4 = 0;
                                                L15: while (true) {
                                                  L16: {
                                                    L17: {
                                                      if (this.field_D.field_W <= var4) {
                                                        break L17;
                                                      } else {
                                                        stackOut_46_0 = var3;
                                                        stackIn_54_0 = stackOut_46_0;
                                                        stackIn_47_0 = stackOut_46_0;
                                                        if (var6 != 0) {
                                                          break L16;
                                                        } else {
                                                          if (stackIn_47_0 != 0) {
                                                            break L17;
                                                          } else {
                                                            L18: {
                                                              if ((var4 ^ -1) == (this.field_z ^ -1)) {
                                                                break L18;
                                                              } else {
                                                                if (0 == (1 & this.field_D.a((byte) 78) >> var4)) {
                                                                  break L18;
                                                                } else {
                                                                  if (this.field_D.c(var4, -16985, this.field_D.field_K.field_w)) {
                                                                    break L18;
                                                                  } else {
                                                                    var3 = 1;
                                                                    break L18;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var4++;
                                                            if (var6 == 0) {
                                                              continue L15;
                                                            } else {
                                                              break L17;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    stackOut_53_0 = var3;
                                                    stackIn_54_0 = stackOut_53_0;
                                                    break L16;
                                                  }
                                                  L19: {
                                                    if (stackIn_54_0 == 0) {
                                                      this.field_D.a(0, this.field_D.field_u | 1 << this.field_z);
                                                      break L19;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                  this.b(7, param0 ^ -5090);
                                                  if (var6 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L10;
                                                  }
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
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  this.field_L = 0;
                                  this.b(2, 4);
                                  if (var6 == 0) {
                                    break L1;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  if ((var2 ^ -1) == -3) {
                                    break L8;
                                  } else {
                                    L20: {
                                      if ((var2 ^ -1) != -9) {
                                        break L20;
                                      } else {
                                        if (var6 == 0) {
                                          break L7;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    if (3 == var2) {
                                      break L6;
                                    } else {
                                      if (-5 == (var2 ^ -1)) {
                                        break L5;
                                      } else {
                                        L21: {
                                          if (var2 != 5) {
                                            break L21;
                                          } else {
                                            if (var6 == 0) {
                                              break L4;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        L22: {
                                          if (-7 != (var2 ^ -1)) {
                                            break L22;
                                          } else {
                                            if (var6 == 0) {
                                              break L3;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        if (var2 != 7) {
                                          break L1;
                                        } else {
                                          if (var6 == 0) {
                                            break L2;
                                          } else {
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              this.a(-113, false);
                              if (var6 == 0) {
                                break L1;
                              } else {
                                break L7;
                              }
                            }
                            this.g(-25523);
                            if (var6 == 0) {
                              break L1;
                            } else {
                              break L6;
                            }
                          }
                          L23: {
                            if (-1 != (this.field_t ^ -1)) {
                              break L23;
                            } else {
                              this.a(this.field_p, 0);
                              this.field_S = null;
                              this.field_M = (cl) ((Object) this.field_p.e((byte) 127));
                              break L23;
                            }
                          }
                          this.f(0);
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                        this.a(param0 + 4972, true);
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                      this.i(0);
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                    this.e(-24236);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  if (-51 < (this.field_t ^ -1)) {
                    return false;
                  } else {
                    return true;
                  }
                }
                if (param0 == -5094) {
                  return false;
                } else {
                  return false;
                }
              }
            }
            L24: {
              if ((this.field_t ^ -1) <= -31) {
                this.b(1, 4);
                break L24;
              } else {
                break L24;
              }
            }
            return false;
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
            stackOut_0_0 = this.field_Q;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("ej.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final void c(byte param0) {
        int var2 = 0;
        float[] var2_ref_float__ = null;
        jd var3 = null;
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
        boolean stackIn_23_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_63_0 = 0;
        float[][] stackIn_66_0 = null;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_90_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_32_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        float[][] stackOut_65_0 = null;
        float[][] stackOut_64_0 = null;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_89_0 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-1 != (this.field_o ^ -1)) {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (this.field_o == 1) {
                      break L4;
                    } else {
                      L5: {
                        if ((this.field_o ^ -1) != -3) {
                          break L5;
                        } else {
                          var2 = 0;
                          L6: while (true) {
                            L7: {
                              if (this.field_V.length <= var2) {
                                break L7;
                              } else {
                                this.field_V[var2] = 0.0f;
                                var2++;
                                if (var7 != 0) {
                                  break L0;
                                } else {
                                  if (var7 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            var14 = this.field_n[0][9];
                            var9 = var14;
                            var8 = var9;
                            var2_ref_float__ = var8;
                            var3_int = 0;
                            L8: while (true) {
                              L9: {
                                L10: {
                                  if (var3_int >= var14.length) {
                                    break L10;
                                  } else {
                                    var8[var3_int] = 0.0f;
                                    var3_int++;
                                    if (var7 != 0) {
                                      break L9;
                                    } else {
                                      if (var7 == 0) {
                                        continue L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                var3_int = 0;
                                break L9;
                              }
                              L11: while (true) {
                                L12: {
                                  if (var3_int >= this.field_D.field_Eb.length) {
                                    break L12;
                                  } else {
                                    var4_ref_float__ = this.field_C;
                                    var5_int = var3_int;
                                    this.field_T[var3_int] = 0.0f;
                                    var4_ref_float__[var5_int] = 0.0f;
                                    var10 = this.field_D.field_Eb[var3_int];
                                    var11 = var10;
                                    var11 = var10;
                                    this.a(var3_int, false, 1);
                                    stackOut_22_0 = var10.d(-16);
                                    stackIn_90_0 = stackOut_22_0 ? 1 : 0;
                                    stackIn_23_0 = stackOut_22_0;
                                    if (var7 != 0) {
                                      break L1;
                                    } else {
                                      L13: {
                                        if (stackIn_23_0) {
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      var3_int++;
                                      if (var7 == 0) {
                                        continue L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                this.field_o = this.field_o + 1;
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      L14: {
                        if (-4 == (this.field_o ^ -1)) {
                          break L14;
                        } else {
                          this.field_w = false;
                          this.field_o = 0;
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L14;
                          }
                        }
                      }
                      var2 = 0;
                      L15: while (true) {
                        L16: {
                          L17: {
                            if (this.field_I.length <= var2) {
                              break L17;
                            } else {
                              stackOut_32_0 = 0;
                              stackIn_48_0 = stackOut_32_0;
                              stackIn_33_0 = stackOut_32_0;
                              if (var7 != 0) {
                                break L16;
                              } else {
                                var3_int = stackIn_33_0;
                                L18: while (true) {
                                  L19: {
                                    L20: {
                                      if (var3_int >= this.field_I[var2].length) {
                                        break L20;
                                      } else {
                                        if (var7 != 0) {
                                          break L19;
                                        } else {
                                          L21: {
                                            L22: {
                                              if (null != this.field_I[var2][var3_int]) {
                                                var4 = 0;
                                                L23: while (true) {
                                                  if (this.field_I[var2][var3_int].length <= var4) {
                                                    break L22;
                                                  } else {
                                                    this.field_I[var2][var3_int][var4] = 0.0f;
                                                    var4++;
                                                    if (var7 != 0) {
                                                      break L21;
                                                    } else {
                                                      if (var7 == 0) {
                                                        continue L23;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L22;
                                              }
                                            }
                                            var3_int++;
                                            break L21;
                                          }
                                          if (var7 == 0) {
                                            continue L18;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                    }
                                    var2++;
                                    break L19;
                                  }
                                  if (var7 == 0) {
                                    continue L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_47_0 = 0;
                          stackIn_48_0 = stackOut_47_0;
                          break L16;
                        }
                        var2 = stackIn_48_0;
                        L24: while (true) {
                          L25: {
                            if (var2 >= this.field_D.field_Eb.length) {
                              break L25;
                            } else {
                              var11 = this.field_D.field_Eb[var2];
                              var4 = var11.a((byte) -107);
                              stackOut_50_0 = var4 ^ -1;
                              stackOut_50_1 = -1;
                              stackIn_89_0 = stackOut_50_0;
                              stackIn_89_1 = stackOut_50_1;
                              stackIn_51_0 = stackOut_50_0;
                              stackIn_51_1 = stackOut_50_1;
                              if (var7 != 0) {
                                break L2;
                              } else {
                                L26: {
                                  if (stackIn_51_0 == stackIn_51_1) {
                                    break L26;
                                  } else {
                                    this.a(var4, 1, var2, 29);
                                    break L26;
                                  }
                                }
                                L27: {
                                  if (null == var11.field_c) {
                                    break L27;
                                  } else {
                                    var4 = var11.field_c.field_E;
                                    if (-1 != (var4 ^ -1)) {
                                      this.a(3, -14092, var2, var4, 1);
                                      break L27;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var2++;
                                if (var7 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          this.field_o = this.field_o + 1;
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L28: {
                    if (this.field_D.field_W <= this.field_x) {
                      break L28;
                    } else {
                      L29: {
                        var2 = this.field_x;
                        var12 = this.field_r;
                        var3 = var12;
                        if ((this.field_D.o(var2, -1) ^ -1) != (this.field_D.o(this.field_z, -1) ^ -1)) {
                          stackOut_62_0 = 0;
                          stackIn_63_0 = stackOut_62_0;
                          break L29;
                        } else {
                          stackOut_61_0 = 1;
                          stackIn_63_0 = stackOut_61_0;
                          break L29;
                        }
                      }
                      L30: {
                        var4 = stackIn_63_0;
                        if (var4 == 0) {
                          stackOut_65_0 = this.field_K;
                          stackIn_66_0 = stackOut_65_0;
                          break L30;
                        } else {
                          stackOut_64_0 = this.field_A;
                          stackIn_66_0 = stackOut_64_0;
                          break L30;
                        }
                      }
                      L31: {
                        var15 = stackIn_66_0;
                        var13 = var15;
                        var5 = var13;
                        if (-9 > (this.field_s ^ -1)) {
                          L32: {
                            L33: {
                              if (var12 == null) {
                                break L33;
                              } else {
                                var6 = var12.field_b;
                                if (var7 == 0) {
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            var6 = this.field_D.field_t[var2].field_d.field_b;
                            break L32;
                          }
                          L34: {
                            L35: {
                              if (!(var6 instanceof jd)) {
                                break L35;
                              } else {
                                var3 = (jd) ((Object) var6);
                                if (var7 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var3 = null;
                            break L34;
                          }
                          this.field_r = var3;
                          this.field_s = 0;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      L36: {
                        L37: {
                          if (var3 == null) {
                            break L37;
                          } else {
                            L38: {
                              if (var3.field_S) {
                                break L38;
                              } else {
                                L39: {
                                  if (0 != this.field_s) {
                                    break L39;
                                  } else {
                                    this.field_m.a(var15, 1, -19545, var3);
                                    if (var7 == 0) {
                                      break L38;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                                L40: {
                                  if (var4 != 0) {
                                    break L40;
                                  } else {
                                    this.a(1, -1 + this.field_s, 19551, var3);
                                    if (var7 == 0) {
                                      break L38;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                                this.field_s = 8;
                                break L38;
                              }
                            }
                            this.field_s = this.field_s + 1;
                            var3.field_X = false;
                            if (var7 == 0) {
                              break L36;
                            } else {
                              break L37;
                            }
                          }
                        }
                        this.field_x = this.field_x + 1;
                        this.field_s = 9;
                        break L36;
                      }
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L28;
                      }
                    }
                  }
                  this.field_o = this.field_o + 1;
                  break L3;
                }
                stackOut_88_0 = 9;
                stackOut_88_1 = (param0 - -68) / 49;
                stackIn_89_0 = stackOut_88_0;
                stackIn_89_1 = stackOut_88_1;
                break L2;
              }
              stackOut_89_0 = stackIn_89_0 % stackIn_89_1;
              stackIn_90_0 = stackOut_89_0;
              break L1;
            }
            var2 = stackIn_90_0;
            break L0;
          }
          return;
        } else {
          this.a((byte) 108, this.field_A);
          this.a((byte) 111, this.field_K);
          var2 = 0;
          L41: while (true) {
            L42: {
              if ((this.field_n.length ^ -1) >= (var2 ^ -1)) {
                break L42;
              } else {
                this.a((byte) 73, this.field_n[var2]);
                var2++;
                if (var7 != 0) {
                  return;
                } else {
                  if (var7 == 0) {
                    continue L41;
                  } else {
                    break L42;
                  }
                }
              }
            }
            this.field_o = this.field_o + 1;
            this.field_x = 0;
            this.field_s = 9;
            this.field_r = null;
            return;
          }
        }
    }

    private final void g(int param0) {
        cl var2 = null;
        cl var3 = null;
        if (null != this.field_M) {
          L0: {
            if (this.field_M.field_o.field_S) {
              break L0;
            } else {
              if (this.field_M.field_o.field_O == this.field_z) {
                L1: {
                  if (param0 == -25523) {
                    break L1;
                  } else {
                    this.field_m = (ir) null;
                    break L1;
                  }
                }
                this.field_M.f(-119);
                this.field_S = this.field_M;
                this.field_M = (cl) ((Object) this.field_p.a((byte) 123));
                return;
              } else {
                break L0;
              }
            }
          }
          var3 = (cl) ((Object) this.field_p.a((byte) 123));
          var2 = var3;
          this.field_M.d(-115);
          this.field_M = var3;
          return;
        } else {
          this.b(3, param0 ^ -25527);
          return;
        }
    }

    private final void a(int param0, jd param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (param0 > 56) {
              var4_int = 0;
              L1: while (true) {
                L2: {
                  if (-9 >= (var4_int ^ -1)) {
                    break L2;
                  } else {
                    this.a(param2, var4_int, 19551, param1);
                    var4_int++;
                    if (var5 != 0) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (var5 == 0) {
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("ej.K(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
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
        float discarded$1 = 0.0f;
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
        float[][] var13 = null;
        float[][][] var14 = null;
        float[][] var15 = null;
        float[][] var16 = null;
        float[][][] var17 = null;
        float[][] var18 = null;
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
                if (var11 == 0) {
                  continue L1;
                } else {
                  break L0;
                }
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
          L4: {
            if (var6 >= fs.field_b.length) {
              break L4;
            } else {
              fs.field_b[var6] = 0.0f;
              var6++;
              if (var11 == 0) {
                continue L3;
              } else {
                break L4;
              }
            }
          }
          L5: {
            var7_int = param0;
            if (-1 == (var7_int ^ -1)) {
              break L5;
            } else {
              L6: {
                if ((var7_int ^ -1) != -2) {
                  break L6;
                } else {
                  if (var11 == 0) {
                    var5 = this.field_n[param1 % this.field_n[4].length][9];
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((var7_int ^ -1) == -3) {
                var5 = this.field_K[param1];
                break L5;
              } else {
                L7: {
                  if ((var7_int ^ -1) != -4) {
                    break L7;
                  } else {
                    if (var11 == 0) {
                      var16 = this.field_I[1];
                      var13 = var16;
                      var6_ref_float____ = var13;
                      if (var6_ref_float____ == null) {
                        break L5;
                      } else {
                        if (0 >= var16.length) {
                          break L5;
                        } else {
                          var7_int = param1 % var16.length;
                          var17 = this.field_I;
                          var14 = var17;
                          var12 = var14;
                          var8_array = var12;
                          var9 = 0;
                          L8: while (true) {
                            if (var9 >= var17.length) {
                              break L5;
                            } else {
                              L9: {
                                var18 = var17[var9];
                                var15 = var18;
                                var10 = var15;
                                if (var10 == null) {
                                  break L9;
                                } else {
                                  if (var7_int >= var18.length) {
                                    break L9;
                                  } else {
                                    if (var18[var7_int] == null) {
                                      break L9;
                                    } else {
                                      var5 = var18[var7_int];
                                      break L5;
                                    }
                                  }
                                }
                              }
                              var9++;
                              continue L8;
                            }
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                if ((var7_int ^ -1) == -5) {
                  var5 = null;
                  if (rd.field_j == null) {
                    break L5;
                  } else {
                    var7 = rd.field_j.field_T;
                    if (var7 == null) {
                      break L5;
                    } else {
                      var8 = (cl) ((Object) this.field_p.e((byte) 114));
                      L10: while (true) {
                        if (var8 == null) {
                          break L5;
                        } else {
                          L11: {
                            if (var7 != var8.field_o) {
                              break L11;
                            } else {
                              discarded$1 = var8.a(false, (byte) -127);
                              if (var11 == 0) {
                                break L5;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var8 = (cl) ((Object) this.field_p.a((byte) 123));
                          continue L10;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
          }
          L12: {
            if (var5 == null) {
              break L12;
            } else {
              var6 = 0;
              L13: while (true) {
                if ((((Object[]) (var5)).length ^ -1) >= (var6 ^ -1)) {
                  break L12;
                } else {
                  fs.field_b[var6] = ((float[]) (var5))[var6];
                  var6++;
                  if (var11 != 0) {
                    break L12;
                  } else {
                    if (var11 == 0) {
                      continue L13;
                    } else {
                      break L12;
                    }
                  }
                }
              }
            }
          }
          return;
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
        int stackIn_5_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_16_0 = 0;
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
          L2: {
            L3: {
              if (8 <= var11) {
                break L3;
              } else {
                var9 = var9 + this.field_n[var6][var11][param2];
                var10 = var10 + this.field_K[var11][param2];
                stackOut_4_0 = var11 ^ -1;
                stackIn_17_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var12 != 0) {
                  break L2;
                } else {
                  L4: {
                    L5: {
                      if (stackIn_5_0 != -5) {
                        break L5;
                      } else {
                        if (!c.a(param0, (byte) -69)) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var7 = var7 + this.field_n[var6][var11][param2] * (float)fk.field_d[var6][var11] * this.field_P[28];
                    break L4;
                  }
                  L6: {
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
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    var8 = var8 + this.field_K[var11][param2] * (float)fk.field_d[var11][var6] * this.field_P[29];
                    break L6;
                  }
                  var11++;
                  if (var12 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_16_0 = var5;
            stackIn_17_0 = stackOut_16_0;
            break L2;
          }
          L8: {
            if (stackIn_17_0 == 0) {
              break L8;
            } else {
              System.out.println("summoning enemy vuln: " + var7 + ", total " + var9);
              break L8;
            }
          }
          L9: {
            var4 = var4 + var7 / var9;
            if (var5 == 0) {
              break L9;
            } else {
              System.out.println("summoning enemy power: " + var8 + ", total " + var10);
              break L9;
            }
          }
          L10: {
            var4 = var4 - var8 / var10;
            if (var5 != 0) {
              System.out.println("Damage-wise: " + dn.field_Pb[param0] + " score " + var4);
              break L10;
            } else {
              break L10;
            }
          }
          return var4;
        }
    }

    private final void e(int param0) {
        jd var2 = null;
        int[] var3 = null;
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
          L2: {
            var2 = this.field_D.c(this.field_y, true, this.field_E);
            if (var2 != null) {
              break L2;
            } else {
              if (this.field_t > this.field_B - -100) {
                this.b(7, 4);
                if (!ArmiesOfGielinor.field_M) {
                  break L1;
                } else {
                  break L2;
                }
              } else {
                break L1;
              }
            }
          }
          this.a(80, var2);
          this.b(3, param0 + 24240);
          break L1;
        }
    }

    private final void a(int[] param0, int param1, byte param2) {
        cl discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        byte stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              stackOut_2_0 = param0.length ^ -1;
              stackOut_2_1 = var4_int ^ -1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                      break L4;
                    } else {
                      var5 = 0;
                      stackOut_4_0 = -1;
                      stackOut_4_1 = param0[var4_int];
                      stackIn_20_0 = stackOut_4_0;
                      stackIn_20_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_5_0 != stackIn_5_1) {
                              break L6;
                            } else {
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var6 = 0;
                          L7: while (true) {
                            L8: {
                              if (var6 >= var4_int) {
                                break L8;
                              } else {
                                stackOut_10_0 = param0[var4_int];
                                stackOut_10_1 = param0[var6];
                                stackIn_3_0 = stackOut_10_0;
                                stackIn_3_1 = stackOut_10_1;
                                stackIn_11_0 = stackOut_10_0;
                                stackIn_11_1 = stackOut_10_1;
                                if (var7 != 0) {
                                  continue L2;
                                } else {
                                  L9: {
                                    if (stackIn_11_0 != stackIn_11_1) {
                                      break L9;
                                    } else {
                                      var5 = 1;
                                      if (var7 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var6++;
                                  if (var7 == 0) {
                                    continue L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            if (var5 == 0) {
                              this.a(param0[var4_int], false, param1);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var4_int++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_19_0 = param2;
                  stackOut_19_1 = 79;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L3;
                }
                L10: {
                  if (stackIn_20_0 >= stackIn_20_1) {
                    break L10;
                  } else {
                    var8 = (jd) null;
                    discarded$2 = this.b((jd) null, (byte) -90);
                    break L10;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var4);
            stackOut_23_1 = new StringBuilder().append("ej.J(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L11;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, float[][] param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
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
            var3_int = 0;
            var4 = -13 % ((30 - param0) / 40);
            L1: while (true) {
              L2: {
                if ((param1.length ^ -1) >= (var3_int ^ -1)) {
                  break L2;
                } else {
                  if (var6 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if ((param1[var3_int].length ^ -1) >= (var5 ^ -1)) {
                            break L5;
                          } else {
                            param1[var3_int][var5] = 0.0f;
                            var5++;
                            if (var6 != 0) {
                              break L4;
                            } else {
                              if (var6 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var3_int++;
                        break L4;
                      }
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("ej.Q(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(bv param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = var2_int;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ej.H(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void c(jd param0, byte param1) {
        float discarded$2 = 0.0f;
        cl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = 123 % ((param1 - 53) / 41);
            var3 = (cl) ((Object) this.field_p.e((byte) 95));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var5 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    if (var3.field_o == param0) {
                      discarded$2 = var3.a(false, (byte) -124);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3 = (cl) ((Object) this.field_p.a((byte) 123));
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("ej.EA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var4 = 0;
        sm var5 = null;
        int var6 = 0;
        jb var7 = null;
        int var8_int = 0;
        wa var8 = null;
        to var9 = null;
        int var9_int = 0;
        float var10 = 0.0f;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_52_0 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_D == null) {
          return;
        } else {
          if (this.field_D.field_B[this.field_z] == null) {
            return;
          } else {
            if (param2 == 23) {
              var4 = this.field_D.field_B[this.field_z][param1];
              if (var4 != -1) {
                L0: {
                  var5 = this.field_F;
                  var5.b((byte) -120);
                  if (!param0) {
                    L1: {
                      L2: {
                        var8_int = var4;
                        if (var8_int != 29) {
                          break L2;
                        } else {
                          if (var13 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (var8_int == 30) {
                        break L1;
                      } else {
                        if (31 == var8_int) {
                          break L1;
                        } else {
                          if (-33 == (var8_int ^ -1)) {
                            break L1;
                          } else {
                            if (33 == var8_int) {
                              break L1;
                            } else {
                              if (var8_int == 23) {
                                break L1;
                              } else {
                                L3: {
                                  if (var8_int != 24) {
                                    break L3;
                                  } else {
                                    if (var13 == 0) {
                                      break L1;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                L4: {
                                  if ((var8_int ^ -1) != -48) {
                                    break L4;
                                  } else {
                                    if (var13 == 0) {
                                      break L1;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                if (48 == var8_int) {
                                  break L1;
                                } else {
                                  L5: {
                                    if (49 != var8_int) {
                                      break L5;
                                    } else {
                                      if (var13 == 0) {
                                        break L1;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  L6: {
                                    if (50 != var8_int) {
                                      break L6;
                                    } else {
                                      if (var13 == 0) {
                                        break L1;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  if (var8_int == 51) {
                                    break L1;
                                  } else {
                                    if (52 == var8_int) {
                                      break L1;
                                    } else {
                                      if ((var8_int ^ -1) == -54) {
                                        break L1;
                                      } else {
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var6 = uc.field_d[var4][7];
                    var8_int = var6;
                    L7: while (true) {
                      stackOut_36_0 = -var6 + this.field_D.field_db ^ -1;
                      stackIn_37_0 = stackOut_36_0;
                      L8: while (true) {
                        L9: {
                          if (stackIn_37_0 >= (var8_int ^ -1)) {
                            break L9;
                          } else {
                            if (var13 != 0) {
                              break L0;
                            } else {
                              var9_int = var6;
                              L10: while (true) {
                                L11: {
                                  if ((this.field_D.field_v + -var6 ^ -1) >= (var9_int ^ -1)) {
                                    break L11;
                                  } else {
                                    var10 = 0.0f;
                                    stackOut_41_0 = -var6 + var8_int;
                                    stackIn_37_0 = stackOut_41_0;
                                    stackIn_42_0 = stackOut_41_0;
                                    if (var13 != 0) {
                                      continue L8;
                                    } else {
                                      var11 = stackIn_42_0;
                                      L12: while (true) {
                                        L13: {
                                          L14: {
                                            if ((var8_int - -var6 ^ -1) > (var11 ^ -1)) {
                                              break L14;
                                            } else {
                                              stackOut_44_0 = -var6 + var9_int;
                                              stackIn_53_0 = stackOut_44_0;
                                              stackIn_45_0 = stackOut_44_0;
                                              if (var13 != 0) {
                                                break L13;
                                              } else {
                                                var12 = stackIn_45_0;
                                                L15: while (true) {
                                                  L16: {
                                                    L17: {
                                                      if ((var9_int + var6 ^ -1) > (var12 ^ -1)) {
                                                        break L17;
                                                      } else {
                                                        var10 = var10 + this.a(var12, var4, var11, (byte) -90);
                                                        var12++;
                                                        if (var13 != 0) {
                                                          break L16;
                                                        } else {
                                                          if (var13 == 0) {
                                                            continue L15;
                                                          } else {
                                                            break L17;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var11++;
                                                    break L16;
                                                  }
                                                  if (var13 == 0) {
                                                    continue L12;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          stackOut_52_0 = (var10 < 0.0f ? -1 : (var10 == 0.0f ? 0 : 1));
                                          stackIn_53_0 = stackOut_52_0;
                                          break L13;
                                        }
                                        L18: {
                                          if (stackIn_53_0 == 0) {
                                            break L18;
                                          } else {
                                            var5.a(param1, var9_int, var8_int, var10, (byte) 71, this.field_z);
                                            break L18;
                                          }
                                        }
                                        var9_int++;
                                        if (var13 == 0) {
                                          continue L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                                var8_int++;
                                if (var13 == 0) {
                                  continue L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        L19: {
                          var7 = var5.a((byte) -102);
                          if (var7 == null) {
                            break L19;
                          } else {
                            this.field_D.field_J = true;
                            var8 = new wa(var4, var7.field_s, var7.field_q);
                            var9 = new to(var8, -1, this.field_z);
                            discarded$1 = this.a(var9, -126);
                            break L19;
                          }
                        }
                        break L0;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
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
        int decompiledRegionSelector0 = 0;
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
              if ((this.field_z ^ -1) != (param1.field_O ^ -1)) {
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
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("ej.W(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
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
        int var2_int = 0;
        float var2 = 0.0f;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        jd var7 = null;
        jd var8 = null;
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
                  if ((this.field_M.field_o.field_E ^ -1) != -1) {
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
                    if ((var6.field_E ^ -1) != -1) {
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
        int var2_int = 0;
        jd var2 = null;
        jd var3 = null;
        int var4 = 0;
        jd stackIn_3_0 = null;
        jd stackIn_13_0 = null;
        jd stackOut_2_0 = null;
        jd stackOut_12_0 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.b(0, param0 + 127);
        this.field_q = 0;
        this.field_H.b(param0 ^ -28);
        this.field_O.b(param0 ^ -42);
        var2_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var2_int ^ -1) <= (this.field_D.field_t.length ^ -1)) {
                break L2;
              } else {
                stackOut_2_0 = (jd) ((Object) this.field_D.field_t[var2_int].e((byte) 112));
                stackIn_13_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  var3 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var3 == null) {
                          break L5;
                        } else {
                          var3.field_X = true;
                          var3 = (jd) ((Object) this.field_D.field_t[var2_int].a((byte) 123));
                          if (var4 != 0) {
                            break L4;
                          } else {
                            if (var4 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var2_int++;
                      break L4;
                    }
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L6: {
              if (param0 == -123) {
                break L6;
              } else {
                this.field_D = (ha) null;
                break L6;
              }
            }
            stackOut_12_0 = (jd) ((Object) this.field_D.field_t[this.field_z].e((byte) 99));
            stackIn_13_0 = stackOut_12_0;
            break L1;
          }
          var2 = stackIn_13_0;
          L7: while (true) {
            L8: {
              L9: {
                if (var2 == null) {
                  break L9;
                } else {
                  if (var4 != 0) {
                    break L8;
                  } else {
                    L10: {
                      if (var2.field_p == null) {
                        break L10;
                      } else {
                        if (this != var2.field_p.field_r) {
                          var2.field_p.d(param0 ^ -11);
                          var2.field_p = null;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var2.field_p != null) {
                        break L11;
                      } else {
                        var2.field_p = new cl((ej) (this), var2);
                        this.field_p.a(param0 + 873, var2.field_p);
                        break L11;
                      }
                    }
                    var2 = (jd) ((Object) this.field_D.field_t[this.field_z].a((byte) 123));
                    if (var4 == 0) {
                      continue L7;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              this.field_M = (cl) ((Object) this.field_p.e((byte) 108));
              this.field_S = null;
              break L8;
            }
            return;
          }
        }
    }

    private final void a(at param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        Object var4 = null;
        cl var4_ref = null;
        cl var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var3_int == 0) {
                      break L4;
                    } else {
                      var3_int = 0;
                      var4 = null;
                      stackOut_3_0 = this;
                      stackIn_15_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var5 = (cl) ((Object) ((ej) (this)).field_p.e((byte) 113));
                        L5: while (true) {
                          L6: {
                            if (var5 == null) {
                              break L6;
                            } else {
                              var4_ref = (cl) ((Object) this.field_p.a((byte) 123));
                              if (var6 != 0) {
                                continue L1;
                              } else {
                                if (var4_ref == null) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (var5.a((byte) -87, var4_ref)) {
                                      var5.d(-122);
                                      var3_int = 1;
                                      ro.a(var4_ref, var5, true);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var5 = var4_ref;
                                  if (var6 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == 0) {
                    break L2;
                  } else {
                    stackOut_14_0 = this;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  }
                }
                ((ej) (this)).field_t = 6;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (runtimeException);
            stackOut_17_1 = new StringBuilder().append("ej.AA(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        sm discarded$0 = null;
        if (param3 != 29) {
            cl var6 = (cl) null;
            discarded$0 = this.a((cl) null, (byte) -87);
        }
        this.a(0, param3 ^ -14103, param2, param0, param1);
    }

    private final void i(int param0) {
        int discarded$1 = 0;
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
        boolean stackIn_7_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_68_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
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
              L3: {
                L4: {
                  if (var37 == null) {
                    break L4;
                  } else {
                    stackOut_6_0 = var37.i(-21428);
                    stackIn_21_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var32 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_7_0) {
                            break L6;
                          } else {
                            L7: {
                              if (!var37.f((byte) -125)) {
                                break L7;
                              } else {
                                var6 = var6 - (double)this.field_P[14];
                                if (var32 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            if (var37.s(param0 + 127)) {
                              var10 = var10 - (double)this.field_P[18];
                              if (var32 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        var4 = var4 - (double)(this.field_P[22] * 2.0f / (float)this.field_D.field_W);
                        break L5;
                      }
                      L8: {
                        L9: {
                          L10: {
                            if (var37.p((byte) -113)) {
                              break L10;
                            } else {
                              if (!var37.d((byte) 105)) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var8 = var8 - (double)this.field_P[16];
                          if (var32 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                        var8 = var8 + (double)this.field_P[27];
                        break L8;
                      }
                      var37 = (jd) ((Object) this.field_D.field_t[this.field_z].a((byte) 123));
                      if (var32 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L3;
              }
              var13_int = stackIn_21_0;
              L11: while (true) {
                L12: {
                  L13: {
                    if (this.field_D.field_Eb.length <= var13_int) {
                      break L13;
                    } else {
                      var35 = this.field_D.field_Eb[var13_int];
                      var36 = var35;
                      var36 = var35;
                      stackOut_23_0 = this.field_z ^ -1;
                      stackIn_33_0 = stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var32 != 0) {
                        break L12;
                      } else {
                        L14: {
                          if (stackIn_24_0 == (var35.field_a ^ -1)) {
                            break L14;
                          } else {
                            if (var35.a(false)) {
                              var4 = var4 + (double)(this.field_P[21] * 2.0f / (float)this.field_D.field_W);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (var35.c(83)) {
                            var10 = var10 + (double)this.field_P[17];
                            var6 = var6 + (double)this.field_P[13];
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        var13_int++;
                        if (var32 == 0) {
                          continue L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  break L12;
                }
                var12 = stackIn_33_0;
                var13_int = 0;
                L16: while (true) {
                  stackOut_34_0 = this.field_D.field_Eb.length ^ -1;
                  stackOut_34_1 = var13_int ^ -1;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  L17: while (true) {
                    L18: {
                      if (stackIn_35_0 >= stackIn_35_1) {
                        break L18;
                      } else {
                        var36 = this.field_D.field_Eb[var13_int];
                        if (var32 != 0) {
                          break L1;
                        } else {
                          L19: {
                            L20: {
                              if (null == var36.field_c) {
                                break L20;
                              } else {
                                if (var32 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            if (!var36.d(-37)) {
                              break L19;
                            } else {
                              if (this.field_z != var36.field_a) {
                                break L19;
                              } else {
                                var15 = this.field_D.field_E[this.field_z];
                                var16 = var13_int % this.field_D.field_v;
                                var17 = var13_int / this.field_D.field_v;
                                var18 = 0;
                                L21: while (true) {
                                  if (-76 >= (var18 ^ -1)) {
                                    break L19;
                                  } else {
                                    stackOut_44_0 = var18 ^ -1;
                                    stackOut_44_1 = -73;
                                    stackIn_35_0 = stackOut_44_0;
                                    stackIn_35_1 = stackOut_44_1;
                                    stackIn_45_0 = stackOut_44_0;
                                    stackIn_45_1 = stackOut_44_1;
                                    if (var32 != 0) {
                                      continue L17;
                                    } else {
                                      L22: {
                                        if (stackIn_45_0 == stackIn_45_1) {
                                          break L22;
                                        } else {
                                          if (-40 == (var18 ^ -1)) {
                                            break L22;
                                          } else {
                                            L23: {
                                              if ((var18 ^ -1) != -8) {
                                                break L23;
                                              } else {
                                                if (var32 == 0) {
                                                  break L22;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                            if (-35 == (var18 ^ -1)) {
                                              break L22;
                                            } else {
                                              L24: {
                                                if (-52 != (var18 ^ -1)) {
                                                  break L24;
                                                } else {
                                                  if (var32 == 0) {
                                                    break L22;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                              L25: {
                                                if (var18 != 27) {
                                                  break L25;
                                                } else {
                                                  if (var32 == 0) {
                                                    break L22;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                              L26: {
                                                var19 = bw.field_m[var18][1];
                                                if ((var36.field_h ^ -1) != -12) {
                                                  break L26;
                                                } else {
                                                  if ((var36.field_g ^ -1) == (var19 ^ -1)) {
                                                    break L26;
                                                  } else {
                                                    if (var32 == 0) {
                                                      break L22;
                                                    } else {
                                                      break L26;
                                                    }
                                                  }
                                                }
                                              }
                                              L27: {
                                                if (-1 == var19) {
                                                  if ((this.field_D.field_a[this.field_z][var19 + 1] & 1 << b.a(false, var18)) == 0) {
                                                    break L22;
                                                  } else {
                                                    break L27;
                                                  }
                                                } else {
                                                  break L27;
                                                }
                                              }
                                              L28: {
                                                var20 = this.field_D.b(var17, -26813, var18, var16, this.field_z) ? 1 : 0;
                                                var21 = var20;
                                                if (var20 != 0) {
                                                  break L28;
                                                } else {
                                                  L29: {
                                                    this.field_D.field_H[this.field_z] = this.field_D.field_H[this.field_z] + this.field_D.k(-116, this.field_z);
                                                    if (!this.field_D.b(var17, param0 ^ -26813, var18, var16, this.field_z)) {
                                                      stackOut_67_0 = 0;
                                                      stackIn_68_0 = stackOut_67_0;
                                                      break L29;
                                                    } else {
                                                      stackOut_66_0 = 1;
                                                      stackIn_68_0 = stackOut_66_0;
                                                      break L29;
                                                    }
                                                  }
                                                  var21 = stackIn_68_0;
                                                  this.field_D.field_H[this.field_z] = this.field_D.field_H[this.field_z] - this.field_D.k(-101, this.field_z);
                                                  break L28;
                                                }
                                              }
                                              if (var21 == 0) {
                                                break L22;
                                              } else {
                                                L30: {
                                                  var22 = 0.0f;
                                                  var23 = bw.field_m[var18][4];
                                                  var22 = var22 + (float)var23 * this.field_P[26];
                                                  var22 = this.a(var18, 1, var13_int);
                                                  var25 = bw.field_m[var18][1];
                                                  if (0 == (var25 ^ -1)) {
                                                    break L30;
                                                  } else {
                                                    var24 = var15[var25];
                                                    if ((var24 ^ -1) == (bw.field_m[var18][2] ^ -1)) {
                                                      var22 = var22 + (float)var24 * this.field_P[23];
                                                      break L30;
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                }
                                                L31: {
                                                  var22 = var22 - this.field_P[25] * (float)bw.field_m[var18][8] * 0.029999999329447746f;
                                                  var26 = bw.field_m[var18][10];
                                                  var27 = bw.field_m[var18][12];
                                                  if (18 == var27) {
                                                    var22 = var22 - this.field_P[45];
                                                    break L31;
                                                  } else {
                                                    break L31;
                                                  }
                                                }
                                                L32: {
                                                  L33: {
                                                    L34: {
                                                      L35: {
                                                        if ((var26 & 2) != 0) {
                                                          break L35;
                                                        } else {
                                                          if ((16 & var26 ^ -1) == -1) {
                                                            break L34;
                                                          } else {
                                                            break L35;
                                                          }
                                                        }
                                                      }
                                                      var22 = (float)((double)var22 + var8);
                                                      var28 = 0;
                                                      L36: while (true) {
                                                        if (var28 >= 8) {
                                                          break L34;
                                                        } else {
                                                          var22 = var22 + this.field_P[15] * this.field_A[var28][var13_int];
                                                          var28++;
                                                          if (var32 != 0) {
                                                            break L33;
                                                          } else {
                                                            if (var32 == 0) {
                                                              continue L36;
                                                            } else {
                                                              break L34;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (-1 != (32 & var26 ^ -1)) {
                                                      break L33;
                                                    } else {
                                                      break L32;
                                                    }
                                                  }
                                                  var22 = (float)((double)var22 + var10);
                                                  break L32;
                                                }
                                                L37: {
                                                  if (21 == var18) {
                                                    var22 = (float)((double)var22 + var6);
                                                    break L37;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                                L38: {
                                                  L39: {
                                                    L40: {
                                                      if (var18 == 0) {
                                                        break L40;
                                                      } else {
                                                        if (3 != var18) {
                                                          break L39;
                                                        } else {
                                                          break L40;
                                                        }
                                                      }
                                                    }
                                                    var22 = (float)((double)var22 + var4);
                                                    var28 = 0;
                                                    L41: while (true) {
                                                      if (var28 >= 8) {
                                                        break L39;
                                                      } else {
                                                        var22 = var22 + this.field_P[44] * this.field_A[var28][var13_int];
                                                        var22 = var22 - this.field_K[var28][var13_int] * this.field_P[44];
                                                        var28++;
                                                        if (var32 != 0) {
                                                          break L38;
                                                        } else {
                                                          if (var32 == 0) {
                                                            continue L41;
                                                          } else {
                                                            break L39;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var28 = 1;
                                                  break L38;
                                                }
                                                L42: {
                                                  if ((var18 ^ -1) != -75) {
                                                    break L42;
                                                  } else {
                                                    var28 = 2;
                                                    break L42;
                                                  }
                                                }
                                                L43: {
                                                  var29 = new jd(var16, var17, var18, this.field_z, var23, var23, var28, 0, 0, this.field_D, 0, 0, -1, true, 0);
                                                  var30 = new cl((ej) (this), var29);
                                                  var30.f(-86);
                                                  var31 = var30.a(false, (byte) -127);
                                                  var22 = var22 + var31;
                                                  if (var20 != 0) {
                                                    break L43;
                                                  } else {
                                                    if (var21 == 0) {
                                                      break L22;
                                                    } else {
                                                      var22 = var22 - this.field_P[42];
                                                      var34.a((byte) -68, var18, var22);
                                                      if (var32 == 0) {
                                                        break L22;
                                                      } else {
                                                        break L43;
                                                      }
                                                    }
                                                  }
                                                }
                                                var34.a(var17, var18, var22, this.field_z, var16, true);
                                                var12 = 1;
                                                if (var3 < var22) {
                                                  var3 = var22;
                                                  break L22;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var18++;
                                      if (var32 == 0) {
                                        continue L21;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var13_int++;
                          if (var32 == 0) {
                            continue L16;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    L44: {
                      if (var12 == 0) {
                        break L44;
                      } else {
                        var13 = var34.a((byte) -84);
                        if (var13 == null) {
                          break L44;
                        } else {
                          this.b(6, 4);
                          this.field_B = this.field_t;
                          var14 = var13.field_r;
                          discarded$1 = var13.a((byte) 5, (ej) (this));
                          if (var14 == -1) {
                            break L44;
                          } else {
                            if (0 <= var14) {
                              this.field_q = this.field_q + bw.field_m[var14][8];
                              break L44;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    this.b(7, param0 ^ 4);
                    break L1;
                  }
                }
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
        boolean discarded$2 = false;
        float[] array$3 = null;
        RuntimeException var3 = null;
        id[] var3_array = null;
        cl var3_ref = null;
        int var4 = 0;
        id var5 = null;
        int var6 = 0;
        mn var7 = null;
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
              if (this.field_u != null) {
                var8 = this.field_u;
                var3_array = var8;
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
                        if ((param0.field_N ^ -1) != (var5.field_a ^ -1)) {
                          break L3;
                        } else {
                          param0.field_K = var5.field_e;
                          if (0 >= var5.field_b) {
                            break L1;
                          } else {
                            param0.field_t = var5.field_b;
                            param0.field_Y = var5.field_b;
                            if (var6 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              var3_ref = new cl((ej) (this), param0);
              this.field_p.a((byte) -119, (tc) (var3_ref));
              if (param1 <= -66) {
                break L4;
              } else {
                var7 = (mn) null;
                discarded$2 = this.a((mn) null, 49);
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
                  array$3 = new float[this.field_D.field_Eb.length];
                  this.field_I[param0.g(0)][param0.field_H - 1] = array$3;
                  break L5;
                }
              }
            }
            stackOut_17_0 = (cl) (var3_ref);
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("ej.FA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    ej(ha param0, int param1, boolean param2, id[] param3) {
        int discarded$2 = 0;
        cl discarded$3 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        jd var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_H = new at();
            this.field_O = new at();
            this.field_p = new at();
            this.field_D = param0;
            this.field_z = param1;
            this.field_P = new float[62];
            discarded$2 = ns.a(false, 3, li.field_n);
            this.field_D.field_k.a((byte) -119, (tc) (this));
            aj.a(this.field_P, 117);
            this.field_u = param3;
            var5_int = 0;
            var6 = (jd) ((Object) this.field_D.field_t[this.field_z].e((byte) 104));
            L1: while (true) {
              L2: {
                L3: {
                  if (var6 == null) {
                    break L3;
                  } else {
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var5_int >= var6.field_H) {
                          break L4;
                        } else {
                          var5_int = var6.field_H;
                          break L4;
                        }
                      }
                      var6 = (jd) ((Object) this.field_D.field_t[this.field_z].a((byte) 123));
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
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
                break L2;
              }
              var6 = (jd) ((Object) this.field_D.field_t[this.field_z].e((byte) 126));
              L5: while (true) {
                L6: {
                  L7: {
                    if (var6 == null) {
                      break L7;
                    } else {
                      discarded$3 = this.b(var6, (byte) -68);
                      var6 = (jd) ((Object) this.field_D.field_t[this.field_z].a((byte) 123));
                      if (var7 != 0) {
                        break L6;
                      } else {
                        if (var7 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  this.field_Q = (sm) ((Object) new aw((ej) (this)));
                  this.field_F = (sm) ((Object) new ge((ej) (this)));
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("ej.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L8;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L8;
            }
          }
          L9: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L9;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    static {
        field_R = "Unpacking models";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class hi extends fj {
    private int field_z;
    private qi field_V;
    private hj field_P;
    private int field_E;
    private hj field_cb;
    private int field_U;
    static int[] field_W;
    private int field_eb;
    private int field_J;
    private boolean field_G;
    private hj[] field_Z;
    private boolean field_O;
    private boolean field_db;
    private hj field_K;
    private int field_S;
    private boolean field_C;
    private boolean field_M;
    private int field_w;
    private hj field_F;
    private hj[] field_Q;
    private String field_bb;
    private hj[] field_B;
    private int field_A;
    private hj field_R;
    private int field_T;
    private int field_y;
    private int field_H;
    private int field_D;
    private int field_t;
    private String field_u;
    static hj field_N;
    private boolean field_ab;
    private int field_fb;
    private hj[] field_Y;
    private int field_I;
    private int field_L;
    private int field_X;
    private hj[] field_v;
    private int field_x;

    final static hj a(int param0, byte param1, int param2) {
        hj var3 = null;
        int var4 = 0;
        int var5 = 0;
        hj var6 = null;
        hj var7 = null;
        var5 = HoldTheLine.field_D;
        var3 = (hj) (Object) hf.field_j.b((byte) 126);
        L0: while (true) {
          if (var3 == null) {
            var6 = new hj(param0, param2);
            var7 = var6;
            var4 = param0 * param2;
            L1: while (true) {
              if (0 >= var4) {
                vb.a(-74, var7);
                if (param1 > -37) {
                  return null;
                } else {
                  L2: {
                    if (128 < param2) {
                      ra.field_hb.a(param0 + -128 >> 1, -128 + param2 >> 1);
                      break L2;
                    } else {
                      ra.field_hb.d(-(param2 * 3 / 4) + param0 >> 1, 0, 3 * param2 / 4, param2);
                      break L2;
                    }
                  }
                  hf.field_j.a((byte) -121, (hl) (Object) var7);
                  ug.b(-1);
                  return var7;
                }
              } else {
                var4--;
                var6.field_z[var4] = 1;
                continue L1;
              }
            }
          } else {
            L3: {
              if (var3.field_s != param0) {
                break L3;
              } else {
                if (param2 != var3.field_y) {
                  break L3;
                } else {
                  return var3;
                }
              }
            }
            var3 = (hj) (Object) hf.field_j.c((byte) 114);
            continue L0;
          }
        }
    }

    public static void c(byte param0) {
        int var1 = 0;
        field_N = null;
        field_W = null;
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param0.getGraphics();
            b.field_c.a(0, 0, var4, 34);
            var4.dispose();
        } catch (Exception exception) {
            param0.repaint();
        }
    }

    final static void a(hj[] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param3 <= 0) {
                  break L1;
                } else {
                  if (param1 > 0) {
                    L2: {
                      if (param0[3] == null) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = param0[3].field_o;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (param0[5] == null) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = param0[5].field_o;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (null == param0[1]) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = param0[1].field_v;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (param0[7] != null) {
                        stackOut_17_0 = param0[7].field_v;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    var9 = stackIn_18_0;
                    var10 = param4 - -param3;
                    var11 = param5 + param1;
                    var12 = param4 - -var6_int;
                    L6: {
                      var13 = var10 + -var7;
                      var14 = var8 + param5;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var17 < var16) {
                        var17 = param4 + var6_int * param3 / (var6_int - -var7);
                        var16 = param4 + var6_int * param3 / (var6_int - -var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      tc.b(bj.field_L);
                      if (var19 < var18) {
                        var19 = param1 * var8 / (var8 - -var9) + param5;
                        var18 = param1 * var8 / (var8 - -var9) + param5;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (null != param0[0]) {
                        tc.e(param4, param5, var16, var18);
                        param0[0].a(param4, param5);
                        tc.a(bj.field_L);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (null != param0[2]) {
                        tc.e(var17, param5, var10, var18);
                        param0[2].a(var13, param5);
                        tc.a(bj.field_L);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (null != param0[6]) {
                        tc.e(param4, var19, var16, var11);
                        param0[6].a(param4, var15);
                        tc.a(bj.field_L);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param0[8]) {
                        break L11;
                      } else {
                        tc.e(var17, var19, var10, var11);
                        param0[8].a(var13, var15);
                        tc.a(bj.field_L);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param0[1]) {
                        break L12;
                      } else {
                        if (param0[1].field_o == 0) {
                          break L12;
                        } else {
                          tc.e(var16, param5, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var13 <= var20) {
                              tc.a(bj.field_L);
                              break L12;
                            } else {
                              param0[1].a(var20, param5);
                              var20 = var20 + param0[1].field_o;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (null == param0[7]) {
                        break L14;
                      } else {
                        if (param0[7].field_o == 0) {
                          break L14;
                        } else {
                          tc.e(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var20 >= var13) {
                              tc.a(bj.field_L);
                              break L14;
                            } else {
                              param0[7].a(var20, var15);
                              var20 = var20 + param0[7].field_o;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (null == param0[3]) {
                        break L16;
                      } else {
                        if (0 != param0[3].field_v) {
                          tc.e(param4, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var20 >= var15) {
                              tc.a(bj.field_L);
                              break L16;
                            } else {
                              param0[3].a(param4, var20);
                              var20 = var20 + param0[3].field_v;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (param0[5] == null) {
                        break L18;
                      } else {
                        if (0 != param0[5].field_v) {
                          tc.e(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var15 <= var20) {
                              tc.a(bj.field_L);
                              break L18;
                            } else {
                              param0[5].a(var13, var20);
                              var20 = var20 + param0[5].field_v;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (param0[4] == null) {
                        break L20;
                      } else {
                        if (param0[4].field_o == 0) {
                          break L20;
                        } else {
                          if (0 == param0[4].field_v) {
                            break L20;
                          } else {
                            tc.e(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var15 <= var20) {
                                tc.a(bj.field_L);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param0[4].field_v;
                                    continue L21;
                                  } else {
                                    param0[4].a(var21, var20);
                                    var21 = var21 + param0[4].field_o;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var6;
            stackOut_74_1 = new StringBuilder().append("hi.N(");
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L23;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L23;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param1 + ',' + true + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    hi(long param0, hi param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static ie a(int param0, int param1) {
        ie var2 = null;
        if (param1 >= -51) {
          return null;
        } else {
          var2 = new ie();
          oc.field_d.a((byte) -104, (hl) (Object) var2);
          q.a(6, 51);
          return var2;
        }
    }

    private final void a(hi param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                L2: {
                  if (null != param0.field_cb) {
                    ((hi) this).field_cb = param0.field_cb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param0.field_G) {
                    ((hi) this).field_G = param0.field_G;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (null == param0.field_u) {
                    break L4;
                  } else {
                    ((hi) this).field_u = param0.field_u;
                    break L4;
                  }
                }
                L5: {
                  if (param0.field_Y == null) {
                    break L5;
                  } else {
                    ((hi) this).field_Y = param0.field_Y;
                    break L5;
                  }
                }
                L6: {
                  if (-2147483648 != param0.field_J) {
                    ((hi) this).field_J = param0.field_J;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (256 != param0.field_w) {
                    ((hi) this).field_w = param0.field_w;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param0.field_H == 0) {
                    break L8;
                  } else {
                    ((hi) this).field_H = param0.field_H;
                    break L8;
                  }
                }
                L9: {
                  if (param0.field_eb != 0) {
                    ((hi) this).field_eb = param0.field_eb;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param0.field_O) {
                    ((hi) this).field_O = param0.field_O;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param0.field_z >= 0) {
                    ((hi) this).field_z = param0.field_z;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (null != param0.field_v) {
                    ((hi) this).field_v = param0.field_v;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (param0.field_t < 0) {
                    break L13;
                  } else {
                    ((hi) this).field_t = param0.field_t;
                    break L13;
                  }
                }
                L14: {
                  if (param0.field_db) {
                    ((hi) this).field_db = param0.field_db;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param0.field_M) {
                    ((hi) this).field_M = param0.field_M;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (null != param0.field_F) {
                    ((hi) this).field_F = param0.field_F;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param0.field_T != 0) {
                    ((hi) this).field_T = param0.field_T;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param0.field_y == -2147483648) {
                    break L18;
                  } else {
                    ((hi) this).field_y = param0.field_y;
                    break L18;
                  }
                }
                L19: {
                  if (param0.field_S == 0) {
                    break L19;
                  } else {
                    ((hi) this).field_S = param0.field_S;
                    break L19;
                  }
                }
                L20: {
                  if (param0.field_X < 0) {
                    break L20;
                  } else {
                    ((hi) this).field_X = param0.field_X;
                    break L20;
                  }
                }
                L21: {
                  if (param0.field_A == 0) {
                    break L21;
                  } else {
                    ((hi) this).field_A = param0.field_A;
                    break L21;
                  }
                }
                L22: {
                  if (param0.field_Z != null) {
                    ((hi) this).field_Z = param0.field_Z;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (-2147483648 == param0.field_D) {
                    break L23;
                  } else {
                    ((hi) this).field_D = param0.field_D;
                    break L23;
                  }
                }
                L24: {
                  if (param0.field_P != null) {
                    ((hi) this).field_P = param0.field_P;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param0.field_C) {
                    ((hi) this).field_C = param0.field_C;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (param0.field_L < 0) {
                    break L26;
                  } else {
                    ((hi) this).field_L = param0.field_L;
                    break L26;
                  }
                }
                L27: {
                  if (!param0.field_ab) {
                    break L27;
                  } else {
                    ((hi) this).field_ab = param0.field_ab;
                    break L27;
                  }
                }
                L28: {
                  if (null == param0.field_V) {
                    break L28;
                  } else {
                    ((hi) this).field_V = param0.field_V;
                    break L28;
                  }
                }
                L29: {
                  if (param0.field_E == -2147483648) {
                    break L29;
                  } else {
                    ((hi) this).field_E = param0.field_E;
                    break L29;
                  }
                }
                L30: {
                  if (param0.field_B != null) {
                    ((hi) this).field_B = param0.field_B;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (param0.field_K == null) {
                    break L31;
                  } else {
                    ((hi) this).field_K = param0.field_K;
                    break L31;
                  }
                }
                L32: {
                  if (-2147483648 == param0.field_U) {
                    break L32;
                  } else {
                    ((hi) this).field_U = param0.field_U;
                    break L32;
                  }
                }
                L33: {
                  if (-2147483648 != param0.field_x) {
                    ((hi) this).field_x = param0.field_x;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (param0.field_I != 0) {
                    ((hi) this).field_I = param0.field_I;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (null != param0.field_R) {
                    ((hi) this).field_R = param0.field_R;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (param0.field_bb != null) {
                    ((hi) this).field_bb = param0.field_bb;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param0.field_Q != null) {
                    ((hi) this).field_Q = param0.field_Q;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                if (param0.field_fb == 0) {
                  break L1;
                } else {
                  ((hi) this).field_fb = param0.field_fb;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L38: {
            var3 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) var3;
            stackOut_99_1 = new StringBuilder().append("hi.O(");
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param0 == null) {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L38;
            } else {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L38;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_102_0, stackIn_102_2 + ',' + -114 + ')');
        }
    }

    final static float a(int param0, float param1, int param2, wd[] param3, int param4, qm param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        wd var10 = null;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        Object var20 = null;
        hn var20_ref = null;
        Object var21 = null;
        dd var21_ref = null;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        float stackIn_34_0 = 0.0f;
        float stackIn_43_0 = 0.0f;
        float stackIn_46_0 = 0.0f;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_45_0 = 0.0f;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        float stackOut_42_0 = 0.0f;
        float stackOut_33_0 = 0.0f;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var20 = null;
        var21 = null;
        var19 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                param0 = param0 * 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7_int = (int)param1;
              param0++;
              if (param0 <= param3.length) {
                break L2;
              } else {
                param0 = param3.length;
                break L2;
              }
            }
            var8 = 0;
            L3: while (true) {
              if (param0 <= var8) {
                stackOut_45_0 = -1.0f;
                stackIn_46_0 = stackOut_45_0;
                break L0;
              } else {
                L4: {
                  stackOut_9_0 = var7_int;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (0 == param2) {
                    stackOut_11_0 = stackIn_11_0;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (var8 % 2 != 1) {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = -(var8 / 2);
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L4;
                    } else {
                      stackOut_12_0 = stackIn_12_0;
                      stackOut_12_1 = (1 + var8) / 2;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L4;
                    }
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = param2 * var8;
                    stackIn_14_0 = stackOut_10_0;
                    stackIn_14_1 = stackOut_10_1;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_14_0 - -stackIn_14_1;
                  if (param3.length <= var9) {
                    var9 = var9 - param3.length;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var9 < 0) {
                    var9 = var9 + param3.length;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var10 = param3[var9];
                  if (-var10.field_k + param6 > 1) {
                    break L7;
                  } else {
                    if (-1 <= param6 - var10.field_k) {
                      if (var10 instanceof dd) {
                        var21_ref = (dd) (Object) var10;
                        var12 = (float)(param5.field_h + -var21_ref.field_R.field_h);
                        var13 = (float)(-var21_ref.field_R.field_f + param5.field_f);
                        var14 = var21_ref.field_B * var12 - var13 * var21_ref.field_D;
                        if (0.0f > var14) {
                          break L7;
                        } else {
                          if (var21_ref.field_J >= var14) {
                            var15 = var14 / var21_ref.field_J;
                            var16 = var12 * var21_ref.field_D + var13 * var21_ref.field_B;
                            var17 = (float)var21_ref.d(var15, 0);
                            var18 = (float)var21_ref.c(96, var15);
                            if (var17 > var16) {
                              break L7;
                            } else {
                              if (var16 <= var18) {
                                stackOut_42_0 = var15 + (float)var9;
                                stackIn_43_0 = stackOut_42_0;
                                return stackIn_43_0;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        L8: {
                          var20_ref = (hn) (Object) var10;
                          var12 = (float)(-var20_ref.field_U.field_h + param5.field_h);
                          var13 = (float)(-var20_ref.field_U.field_f + param5.field_f);
                          var14 = (float)var20_ref.field_D;
                          var15 = (float)var20_ref.field_R;
                          if (var20_ref.field_E > var20_ref.field_I) {
                            var15 = (float)var20_ref.field_D;
                            var14 = (float)var20_ref.field_R;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var16 = var12 * var12 + var13 * var13;
                        if (var16 < var14 * var14) {
                          break L7;
                        } else {
                          if (var16 <= var15 * var15) {
                            var17 = ha.a(var20_ref.field_U, param5, false);
                            var18 = var20_ref.a(var17, (byte) 72);
                            if (var18 < 0.0f) {
                              break L7;
                            } else {
                              if (1.0f >= var18) {
                                stackOut_33_0 = var18 + (float)var9;
                                stackIn_34_0 = stackOut_33_0;
                                return stackIn_34_0;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                var8++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var7;
            stackOut_47_1 = new StringBuilder().append("hi.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param3 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L9;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L9;
            }
          }
          L10: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(-24659).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param5 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L10;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L10;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + param6 + ')');
        }
        return stackIn_46_0;
    }

    final static boolean b(int param0, byte param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_11_0 = 0;
            int stackIn_13_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_10_0 = 0;
            if (rd.field_e.field_l < param0) {
              if (null == lk.field_h) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = lk.field_h.b(false);
                    if (var2_int <= 0) {
                      L1: {
                        if (var2_int < 0) {
                          break L1;
                        } else {
                          if (sf.d(101) <= 30000L) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      r.a(-28036);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L2: {
                        if (var2_int > param0 + -rd.field_e.field_l) {
                          var2_int = -rd.field_e.field_l + param0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      lk.field_h.a(rd.field_e.field_i, var2_int, rd.field_e.field_l, 125);
                      cm.field_b = bb.b(-1);
                      rd.field_e.field_l = rd.field_e.field_l + var2_int;
                      if (param0 <= rd.field_e.field_l) {
                        rd.field_e.field_l = 0;
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    r.a(-28036);
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private hi(long param0, hi param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((hi) this).field_G = true;
        ((hi) this).field_J = -2147483648;
        ((hi) this).field_U = -2147483648;
        ((hi) this).field_C = false;
        ((hi) this).field_w = 256;
        ((hi) this).field_y = -2147483648;
        ((hi) this).field_D = -2147483648;
        ((hi) this).field_z = -1;
        ((hi) this).field_E = -2147483648;
        ((hi) this).field_t = -1;
        ((hi) this).field_X = -1;
        ((hi) this).field_L = -1;
        ((hi) this).field_x = -2147483648;
        try {
          L0: {
            L1: {
              ((hi) this).field_f = param0;
              this.a(param1, -114);
              if (param6 == null) {
                break L1;
              } else {
                ((hi) this).field_bb = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("hi.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new int[4];
    }
}

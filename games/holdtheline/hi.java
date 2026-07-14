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
                      ra.field_hb.a(param0 + -128 >> -349375519, -128 + param2 >> -82935327);
                      break L2;
                    } else {
                      ra.field_hb.d(-(param2 * 3 / 4) + param0 >> -490660095, 0, 3 * param2 / 4, param2);
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
        int var1 = -105 % ((param0 - 37) / 49);
        field_N = null;
        field_W = null;
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2, int param3) {
        java.awt.Graphics var4 = null;
        if (!param2) {
            hi.c((byte) -49);
        }
        try {
            var4 = param0.getGraphics();
            b.field_c.a(param1, param3, var4, 34);
            var4.dispose();
        } catch (Exception exception) {
            param0.repaint();
        }
    }

    final static void a(hj[] param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var6 = 0;
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
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var22 = HoldTheLine.field_D;
        if (param0 != null) {
          L0: {
            if ((param3 ^ -1) >= -1) {
              break L0;
            } else {
              if (param1 > 0) {
                L1: {
                  if (param0[3] == null) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = param0[3].field_o;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_8_0;
                  if (param0[5] == null) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = param0[5].field_o;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_11_0;
                  if (null == param0[1]) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = param0[1].field_v;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_14_0;
                  if (param0[7] != null) {
                    stackOut_16_0 = param0[7].field_v;
                    stackIn_17_0 = stackOut_16_0;
                    break L4;
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_17_0 = stackOut_15_0;
                    break L4;
                  }
                }
                var9 = stackIn_17_0;
                var10 = param4 - -param3;
                var11 = param5 + param1;
                var12 = param4 - -var6;
                if (param2) {
                  L5: {
                    var13 = var10 + -var7;
                    var14 = var8 + param5;
                    var15 = -var9 + var11;
                    var16 = var12;
                    var17 = var13;
                    if (var17 < var16) {
                      var17 = param4 + var6 * param3 / (var6 - -var7);
                      var16 = param4 + var6 * param3 / (var6 - -var7);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var18 = var14;
                    var19 = var15;
                    tc.b(bj.field_L);
                    if (var19 < var18) {
                      var19 = param1 * var8 / (var8 - -var9) + param5;
                      var18 = param1 * var8 / (var8 - -var9) + param5;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (null != param0[0]) {
                      tc.e(param4, param5, var16, var18);
                      param0[0].a(param4, param5);
                      tc.a(bj.field_L);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (null != param0[2]) {
                      tc.e(var17, param5, var10, var18);
                      param0[2].a(var13, param5);
                      tc.a(bj.field_L);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (null != param0[6]) {
                      tc.e(param4, var19, var16, var11);
                      param0[6].a(param4, var15);
                      tc.a(bj.field_L);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (null == param0[8]) {
                      break L10;
                    } else {
                      tc.e(var17, var19, var10, var11);
                      param0[8].a(var13, var15);
                      tc.a(bj.field_L);
                      break L10;
                    }
                  }
                  L11: {
                    if (null == param0[1]) {
                      break L11;
                    } else {
                      if (-1 == (param0[1].field_o ^ -1)) {
                        break L11;
                      } else {
                        tc.e(var16, param5, var17, var18);
                        var20 = var12;
                        L12: while (true) {
                          L13: {
                            if (var13 <= var20) {
                              break L13;
                            } else {
                              param0[1].a(var20, param5);
                              var20 = var20 + param0[1].field_o;
                              if (0 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          tc.a(bj.field_L);
                          break L11;
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
                          L16: {
                            if (var20 >= var13) {
                              break L16;
                            } else {
                              param0[7].a(var20, var15);
                              var20 = var20 + param0[7].field_o;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          tc.a(bj.field_L);
                          break L14;
                        }
                      }
                    }
                  }
                  L17: {
                    if (null == param0[3]) {
                      break L17;
                    } else {
                      if (0 != param0[3].field_v) {
                        tc.e(param4, var18, var16, var19);
                        var20 = var14;
                        L18: while (true) {
                          L19: {
                            if (var20 >= var15) {
                              break L19;
                            } else {
                              param0[3].a(param4, var20);
                              var20 = var20 + param0[3].field_v;
                              if (0 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          tc.a(bj.field_L);
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  L20: {
                    if (param0[5] == null) {
                      break L20;
                    } else {
                      if (0 != param0[5].field_v) {
                        tc.e(var17, var18, var10, var19);
                        var20 = var14;
                        L21: while (true) {
                          L22: {
                            if (var15 <= var20) {
                              break L22;
                            } else {
                              param0[5].a(var13, var20);
                              var20 = var20 + param0[5].field_v;
                              if (0 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          tc.a(bj.field_L);
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  L23: {
                    if (param0[4] == null) {
                      break L23;
                    } else {
                      if (-1 == (param0[4].field_o ^ -1)) {
                        break L23;
                      } else {
                        if (0 == param0[4].field_v) {
                          break L23;
                        } else {
                          tc.e(var16, var18, var17, var19);
                          var20 = var14;
                          L24: while (true) {
                            L25: {
                              if (var15 <= var20) {
                                break L25;
                              } else {
                                var21 = var12;
                                L26: while (true) {
                                  L27: {
                                    if (var21 >= var13) {
                                      break L27;
                                    } else {
                                      param0[4].a(var21, var20);
                                      var21 = var21 + param0[4].field_o;
                                      if (0 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var20 = var20 + param0[4].field_v;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            tc.a(bj.field_L);
                            break L23;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
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
          q.a(param0, 51);
          return var2;
        }
    }

    private final void a(hi param0, int param1) {
        int var3 = 0;
        L0: {
          if (param0 != null) {
            L1: {
              if (null != param0.field_cb) {
                ((hi) this).field_cb = param0.field_cb;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0.field_G) {
                ((hi) this).field_G = param0.field_G;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (null == param0.field_u) {
                break L3;
              } else {
                ((hi) this).field_u = param0.field_u;
                break L3;
              }
            }
            L4: {
              if (param0.field_Y == null) {
                break L4;
              } else {
                ((hi) this).field_Y = param0.field_Y;
                break L4;
              }
            }
            L5: {
              if (-2147483648 != param0.field_J) {
                ((hi) this).field_J = param0.field_J;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (256 != param0.field_w) {
                ((hi) this).field_w = param0.field_w;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0.field_H == -1) {
                break L7;
              } else {
                ((hi) this).field_H = param0.field_H;
                break L7;
              }
            }
            L8: {
              if (-1 != param0.field_eb) {
                ((hi) this).field_eb = param0.field_eb;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param0.field_O) {
                ((hi) this).field_O = param0.field_O;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (-1 >= (param0.field_z ^ -1)) {
                ((hi) this).field_z = param0.field_z;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (null != param0.field_v) {
                ((hi) this).field_v = param0.field_v;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param0.field_t < 0) {
                break L12;
              } else {
                ((hi) this).field_t = param0.field_t;
                break L12;
              }
            }
            L13: {
              if (param0.field_db) {
                ((hi) this).field_db = param0.field_db;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (param0.field_M) {
                ((hi) this).field_M = param0.field_M;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (null != param0.field_F) {
                ((hi) this).field_F = param0.field_F;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (-1 != param0.field_T) {
                ((hi) this).field_T = param0.field_T;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (2147483647 == param0.field_y) {
                break L17;
              } else {
                ((hi) this).field_y = param0.field_y;
                break L17;
              }
            }
            L18: {
              if (param0.field_S == 0) {
                break L18;
              } else {
                ((hi) this).field_S = param0.field_S;
                break L18;
              }
            }
            L19: {
              if ((param0.field_X ^ -1) > -1) {
                break L19;
              } else {
                ((hi) this).field_X = param0.field_X;
                break L19;
              }
            }
            L20: {
              if (param0.field_A == 0) {
                break L20;
              } else {
                ((hi) this).field_A = param0.field_A;
                break L20;
              }
            }
            L21: {
              if (param0.field_Z != null) {
                ((hi) this).field_Z = param0.field_Z;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (-2147483648 == param0.field_D) {
                break L22;
              } else {
                ((hi) this).field_D = param0.field_D;
                break L22;
              }
            }
            L23: {
              if (param0.field_P != null) {
                ((hi) this).field_P = param0.field_P;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (param0.field_C) {
                ((hi) this).field_C = param0.field_C;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (param0.field_L < 0) {
                break L25;
              } else {
                ((hi) this).field_L = param0.field_L;
                break L25;
              }
            }
            L26: {
              if (!param0.field_ab) {
                break L26;
              } else {
                ((hi) this).field_ab = param0.field_ab;
                break L26;
              }
            }
            L27: {
              if (null == param0.field_V) {
                break L27;
              } else {
                ((hi) this).field_V = param0.field_V;
                break L27;
              }
            }
            L28: {
              if ((param0.field_E ^ -1) == 2147483647) {
                break L28;
              } else {
                ((hi) this).field_E = param0.field_E;
                break L28;
              }
            }
            L29: {
              if (param0.field_B != null) {
                ((hi) this).field_B = param0.field_B;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (param0.field_K == null) {
                break L30;
              } else {
                ((hi) this).field_K = param0.field_K;
                break L30;
              }
            }
            L31: {
              if (-2147483648 == param0.field_U) {
                break L31;
              } else {
                ((hi) this).field_U = param0.field_U;
                break L31;
              }
            }
            L32: {
              if (-2147483648 != param0.field_x) {
                ((hi) this).field_x = param0.field_x;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (param0.field_I != 0) {
                ((hi) this).field_I = param0.field_I;
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              if (null != param0.field_R) {
                ((hi) this).field_R = param0.field_R;
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if (param0.field_bb != null) {
                ((hi) this).field_bb = param0.field_bb;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (param0.field_Q != null) {
                ((hi) this).field_Q = param0.field_Q;
                break L36;
              } else {
                break L36;
              }
            }
            if (param0.field_fb == 0) {
              break L0;
            } else {
              ((hi) this).field_fb = param0.field_fb;
              break L0;
            }
          } else {
            break L0;
          }
        }
        var3 = 32 % ((38 - param1) / 58);
    }

    final static float a(int param0, float param1, int param2, wd[] param3, int param4, qm param5, int param6) {
        int var7 = 0;
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
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        L0: {
          var20 = null;
          var21 = null;
          var19 = HoldTheLine.field_D;
          if (-1 == (param2 ^ -1)) {
            param0 = param0 * 2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var7 = (int)param1;
          param0++;
          if (param0 <= param3.length) {
            break L1;
          } else {
            param0 = param3.length;
            break L1;
          }
        }
        if (param4 == -24659) {
          var8 = 0;
          L2: while (true) {
            if (param0 > var8) {
              L3: {
                stackOut_10_0 = var7;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (0 == param2) {
                  stackOut_12_0 = stackIn_12_0;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if ((var8 % 2 ^ -1) != -2) {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = -(var8 / 2);
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L3;
                  } else {
                    stackOut_13_0 = stackIn_13_0;
                    stackOut_13_1 = (1 + var8) / 2;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L3;
                  }
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = param2 * var8;
                  stackIn_15_0 = stackOut_11_0;
                  stackIn_15_1 = stackOut_11_1;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_15_0 - -stackIn_15_1;
                if (param3.length <= var9) {
                  var9 = var9 - param3.length;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if ((var9 ^ -1) > -1) {
                  var9 = var9 + param3.length;
                  break L5;
                } else {
                  break L5;
                }
              }
              var10 = param3[var9];
              if ((-var10.field_k + param6 ^ -1) >= -2) {
                if (-1 <= param6 - var10.field_k) {
                  if (var10 instanceof dd) {
                    var21_ref = (dd) (Object) var10;
                    var12 = (float)(param5.field_h + -var21_ref.field_R.field_h);
                    var13 = (float)(-var21_ref.field_R.field_f + param5.field_f);
                    var14 = var21_ref.field_B * var12 - var13 * var21_ref.field_D;
                    if (0.0f <= var14) {
                      if (var21_ref.field_J >= var14) {
                        var15 = var14 / var21_ref.field_J;
                        var16 = var12 * var21_ref.field_D + var13 * var21_ref.field_B;
                        var17 = (float)var21_ref.d(var15, 0);
                        var18 = (float)var21_ref.c(96, var15);
                        if (var17 <= var16) {
                          if (var16 <= var18) {
                            return var15 + (float)var9;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      } else {
                        var8++;
                        continue L2;
                      }
                    } else {
                      var8++;
                      continue L2;
                    }
                  } else {
                    L6: {
                      var20_ref = (hn) (Object) var10;
                      var12 = (float)(-var20_ref.field_U.field_h + param5.field_h);
                      var13 = (float)(-var20_ref.field_U.field_f + param5.field_f);
                      var14 = (float)var20_ref.field_D;
                      var15 = (float)var20_ref.field_R;
                      if (var20_ref.field_E > var20_ref.field_I) {
                        var15 = (float)var20_ref.field_D;
                        var14 = (float)var20_ref.field_R;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var16 = var12 * var12 + var13 * var13;
                    if (var16 >= var14 * var14) {
                      if (var16 <= var15 * var15) {
                        var17 = ha.a(var20_ref.field_U, param5, false);
                        var18 = var20_ref.a(var17, (byte) 72);
                        if (var18 >= 0.0f) {
                          if (1.0f >= var18) {
                            return var18 + (float)var9;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      } else {
                        var8++;
                        continue L2;
                      }
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  var8++;
                  continue L2;
                }
              } else {
                var8++;
                continue L2;
              }
            } else {
              return -1.0f;
            }
          }
        } else {
          return 1.185455083847046f;
        }
    }

    final static boolean b(int param0, byte param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_14_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (rd.field_e.field_l < param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        if (null == lk.field_h) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        try {
                            if (param1 == 40) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            field_W = null;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var2_int = lk.field_h.b(false);
                            if ((var2_int ^ -1) >= -1) {
                                statePc = 16;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var2_int > param0 + -rd.field_e.field_l) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2_int = -rd.field_e.field_l + param0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            lk.field_h.a(rd.field_e.field_i, var2_int, rd.field_e.field_l, 125);
                            cm.field_b = bb.b(-1);
                            rd.field_e.field_l = rd.field_e.field_l + var2_int;
                            if (param0 <= rd.field_e.field_l) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            rd.field_e.field_l = 0;
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
                    }
                    case 16: {
                        try {
                            if (var2_int < 0) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (sf.d(101) <= 30000L) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            r.a(-28036);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return false;
                    }
                    case 21: {
                        var2 = (IOException) (Object) caughtException;
                        r.a(-28036);
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        return false;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private hi(long param0, hi param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((hi) this).field_f = param0;
        this.a(param1, -114);
        if (param6 != null) {
            ((hi) this).field_bb = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new int[4];
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ec extends pc {
    private boolean field_w;
    private int[] field_J;
    private int[] field_V;
    int[][] field_F;
    static vi field_D;
    static String field_z;
    private int[] field_S;
    private int field_W;
    static int field_C;
    private int[] field_p;
    private int field_Y;
    String[] field_Q;
    private int field_ab;
    private boolean field_t;
    private int field_Z;
    private int[] field_K;
    private int[] field_T;
    private String field_L;
    private String[] field_O;
    String[][] field_X;
    private float[] field_A;
    private int[] field_B;
    private int field_u;
    static String field_v;
    private float field_r;
    private float[] field_x;
    String[][] field_G;
    private int field_M;
    private int field_q;
    hj[][] field_o;
    private int field_R;
    static tk field_s;
    private int[] field_N;
    private int[] field_H;
    private int field_E;
    private int[] field_I;
    int field_P;
    static fo field_y;

    final void c(int param0, int param1) {
        if (param1 != -3565) {
            return;
        }
        this.a(param0, true, (byte) 122, false);
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        if (param3 >= -75) {
            ((ec) this).field_A = null;
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var5 = HoldTheLine.field_D;
          if (param0) {
            break L0;
          } else {
            ((ec) this).field_A = null;
            break L0;
          }
        }
        if (((ec) this).field_k) {
          return;
        } else {
          L1: {
            if (aa.field_n != 1) {
              break L1;
            } else {
              if (!mg.field_c) {
                break L1;
              } else {
                L2: {
                  if (kb.field_c) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L2;
                  }
                }
                kb.field_c = stackIn_10_0 != 0;
                break L1;
              }
            }
          }
          L3: {
            if (!pj.b((byte) 116)) {
              if (((ec) this).field_a < -2) {
                stackOut_15_0 = 1;
                stackIn_17_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = 0;
                stackIn_17_0 = stackOut_14_0;
                break L3;
              }
            } else {
              stackOut_12_0 = 1;
              stackIn_17_0 = stackOut_12_0;
              break L3;
            }
          }
          L4: {
            var2 = stackIn_17_0;
            if (-2 < ((ec) this).field_a) {
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              break L4;
            } else {
              stackOut_18_0 = 2;
              stackIn_20_0 = stackOut_18_0;
              break L4;
            }
          }
          L5: {
            var3 = stackIn_20_0;
            if (-99 == (aa.field_n ^ -1)) {
              ((ec) this).field_q = ((ec) this).field_q - 1;
              if (0 > ((ec) this).field_q - 1) {
                if (1 == ((ec) this).field_Y) {
                  L6: {
                    if (((ec) this).field_R == -1) {
                      ((ec) this).field_R = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((ec) this).field_q = ((ec) this).field_c;
                  ((ec) this).field_Y = -1;
                  break L5;
                } else {
                  L7: {
                    if (0 != ((ec) this).field_Y) {
                      break L7;
                    } else {
                      if (var2 == 0) {
                        break L7;
                      } else {
                        ((ec) this).field_Y = 1;
                        ((ec) this).field_Z = var3;
                        ((ec) this).field_q = -1;
                        break L5;
                      }
                    }
                  }
                  ((ec) this).field_Y = 0;
                  ((ec) this).field_q = -1;
                  break L5;
                }
              } else {
                ((ec) this).field_Y = -1;
                ((ec) this).field_g = true;
                if (((ec) this).field_F[((ec) this).field_q].length == ((ec) this).field_F[((ec) this).field_q + 1].length) {
                  break L5;
                } else {
                  L8: {
                    var4 = ((ec) this).field_F[((ec) this).field_q].length - ((ec) this).field_F[1 + ((ec) this).field_q].length;
                    ((ec) this).field_R = ((ec) this).field_R + var4 / 2;
                    if (0 <= ((ec) this).field_R) {
                      break L8;
                    } else {
                      ((ec) this).field_R = 0;
                      break L8;
                    }
                  }
                  if (((ec) this).field_R <= ((ec) this).field_F[((ec) this).field_q].length + -1) {
                    break L5;
                  } else {
                    ((ec) this).field_R = -1 + ((ec) this).field_F[((ec) this).field_q].length;
                    break L5;
                  }
                }
              }
            } else {
              if ((aa.field_n ^ -1) != -85) {
                if (99 == aa.field_n) {
                  L9: {
                    if (-1 == ((ec) this).field_q) {
                      break L9;
                    } else {
                      ((ec) this).field_q = ((ec) this).field_q + 1;
                      if (((ec) this).field_q + 1 >= ((ec) this).field_a) {
                        break L9;
                      } else {
                        ((ec) this).field_g = true;
                        ((ec) this).field_Y = -1;
                        if (((ec) this).field_F[((ec) this).field_q].length == ((ec) this).field_F[-1 + ((ec) this).field_q].length) {
                          break L5;
                        } else {
                          L10: {
                            var4 = -((ec) this).field_F[-1 + ((ec) this).field_q].length + ((ec) this).field_F[((ec) this).field_q].length;
                            ((ec) this).field_R = ((ec) this).field_R + var4 / 2;
                            if (((ec) this).field_R >= 0) {
                              break L10;
                            } else {
                              ((ec) this).field_R = 0;
                              break L10;
                            }
                          }
                          if (-1 + ((ec) this).field_F[((ec) this).field_q].length >= ((ec) this).field_R) {
                            break L5;
                          } else {
                            ((ec) this).field_R = ((ec) this).field_F[((ec) this).field_q].length - 1;
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  if (((ec) this).field_Y != 0) {
                    L11: {
                      if ((((ec) this).field_Y ^ -1) == -2) {
                        break L11;
                      } else {
                        if (var2 != 0) {
                          ((ec) this).field_q = -1;
                          ((ec) this).field_Z = var3;
                          ((ec) this).field_Y = 1;
                          break L5;
                        } else {
                          break L11;
                        }
                      }
                    }
                    ((ec) this).field_q = -1;
                    ((ec) this).field_Y = 0;
                    break L5;
                  } else {
                    ((ec) this).field_q = 0;
                    ((ec) this).field_Y = -1;
                    if ((((ec) this).field_R ^ -1) != 0) {
                      break L5;
                    } else {
                      ((ec) this).field_R = 0;
                      break L5;
                    }
                  }
                } else {
                  L12: {
                    if ((aa.field_n ^ -1) != -2) {
                      break L12;
                    } else {
                      if (!lk.field_g[82]) {
                        break L12;
                      } else {
                        if (!mg.field_c) {
                          break L12;
                        } else {
                          l.field_b = true;
                          hk.field_d = -1 + pc.field_l[3];
                          ao.field_b = 3;
                          h.b((byte) -78);
                          this.d((byte) -77, 0);
                          break L5;
                        }
                      }
                    }
                  }
                  if (((ec) this).field_Y != -1) {
                    L13: {
                      if (-97 == (aa.field_n ^ -1)) {
                        this.a(((ec) this).field_Y, ((ec) this).field_J[((ec) this).field_Y], 1, -45);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (97 != aa.field_n) {
                      break L5;
                    } else {
                      this.a(((ec) this).field_Y, ((ec) this).field_J[((ec) this).field_Y], 0, 3);
                      break L5;
                    }
                  } else {
                    if (0 != ((ec) this).field_q) {
                      L14: {
                        if (-97 != aa.field_n) {
                          break L14;
                        } else {
                          ((ec) this).field_R = ((ec) this).field_R - 1;
                          if (-1 < (((ec) this).field_R - 1 ^ -1)) {
                            ((ec) this).field_R = ((ec) this).field_R + 1;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (97 == aa.field_n) {
                        ((ec) this).field_R = ((ec) this).field_R + 1;
                        if (((ec) this).field_R + 1 < ((ec) this).field_F[((ec) this).field_q].length) {
                          break L5;
                        } else {
                          ((ec) this).field_R = ((ec) this).field_R - 1;
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              } else {
                if (((ec) this).field_Y != -1) {
                  this.a(((ec) this).field_Y, ((ec) this).field_J[((ec) this).field_Y], 2, -79);
                  break L5;
                } else {
                  if ((((ec) this).field_q ^ -1) == 0) {
                    break L5;
                  } else {
                    if ((((ec) this).field_R ^ -1) != 0) {
                      this.b(((ec) this).field_R, ((ec) this).field_q, 16777215);
                      this.a(((ec) this).field_q, true, (byte) 122, false);
                      ((ec) this).field_g = true;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    final boolean b(byte param0) {
        int var2 = 78 / ((param0 - 19) / 59);
        return -4 == (((ec) this).field_P ^ -1) ? true : false;
    }

    private final void d(int param0) {
        int var2 = 0;
        float var2_float = 0.0f;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        L0: {
          var8 = HoldTheLine.field_D;
          if ((((ec) this).field_P ^ -1) != -2) {
            break L0;
          } else {
            L1: {
              L2: {
                var2 = this.d(rf.field_X, -110, nc.field_g);
                if ((var2 ^ -1) != 0) {
                  break L2;
                } else {
                  if (((ec) this).field_g) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ec) this).field_Y = var2;
              ((ec) this).field_g = false;
              break L1;
            }
            var3 = this.a(rf.field_X, false);
            if (0 > var3) {
              break L0;
            } else {
              if (((ec) this).field_a > var3) {
                L3: {
                  var4 = rf.field_X + -this.c((byte) -113, var3);
                  var5 = -1;
                  if (var4 <= 18) {
                    break L3;
                  } else {
                    if (-103 >= (var4 ^ -1)) {
                      break L3;
                    } else {
                      var6 = 0;
                      L4: while (true) {
                        if (((ec) this).field_F[var3].length <= var6) {
                          break L3;
                        } else {
                          var7 = nc.field_g + -this.a(var3, 4, var6);
                          if ((var7 ^ -1) < -25) {
                            if ((var7 ^ -1) > -137) {
                              var5 = var6;
                              break L3;
                            } else {
                              var6++;
                              continue L4;
                            }
                          } else {
                            var6++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (var5 != 0) {
                    break L5;
                  } else {
                    if (((ec) this).field_g) {
                      break L0;
                    } else {
                      break L5;
                    }
                  }
                }
                ((ec) this).field_q = var3;
                ((ec) this).field_R = var5;
                ((ec) this).field_g = false;
                if (0 == ((ec) this).field_R) {
                  break L0;
                } else {
                  if (((ec) this).field_a + -1 != ((ec) this).field_q) {
                    break L0;
                  } else {
                    this.b(((ec) this).field_R, ((ec) this).field_q, 16777215);
                    ci.a(1, (byte) 125, 13, ((ec) this).field_R);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        L6: {
          if (((ec) this).field_a + -1 == ((ec) this).field_q) {
            var2_float = (float)nc.field_g / 640.0f;
            this.c(((ec) this).field_a + -1, -1, (int)((float)((ec) this).field_V[-1 + ((ec) this).field_a] * var2_float));
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (gg.field_J != 0) {
            if (0 != ((ec) this).field_P) {
              if ((((ec) this).field_P ^ -1) == -3) {
                ((ec) this).field_W = 0;
                ((ec) this).field_P = 3;
                ((ec) this).field_r = (float)((ec) this).field_M;
                return;
              } else {
                if ((((ec) this).field_Y ^ -1) == 0) {
                  break L7;
                } else {
                  var2 = this.d(rf.field_X, -108, nc.field_g);
                  if (var2 != ((ec) this).field_Y) {
                    return;
                  } else {
                    L8: {
                      stackOut_36_0 = this;
                      stackOut_36_1 = ((ec) this).field_Y;
                      stackOut_36_2 = ((ec) this).field_J[((ec) this).field_Y];
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      if (1 != gg.field_J) {
                        stackOut_38_0 = this;
                        stackOut_38_1 = stackIn_38_1;
                        stackOut_38_2 = stackIn_38_2;
                        stackOut_38_3 = 4;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        stackIn_39_3 = stackOut_38_3;
                        break L8;
                      } else {
                        stackOut_37_0 = this;
                        stackOut_37_1 = stackIn_37_1;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = 3;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_39_3 = stackOut_37_3;
                        break L8;
                      }
                    }
                    this.a(stackIn_39_1, stackIn_39_2, stackIn_39_3, -69);
                    return;
                  }
                }
              }
            } else {
              ((ec) this).field_W = 0;
              ((ec) this).field_r = (float)((ec) this).field_M;
              ((ec) this).field_P = 1;
              return;
            }
          } else {
            break L7;
          }
        }
        L9: {
          if (gg.field_J != 1) {
            break L9;
          } else {
            if (0 == (nc.field_g ^ -1)) {
              break L9;
            } else {
              ((ec) this).field_q = this.a(jb.field_U, false);
              if ((((ec) this).field_q ^ -1) > -1) {
                break L9;
              } else {
                if (((ec) this).field_q < ((ec) this).field_a) {
                  var2 = jb.field_U - this.c((byte) -113, ((ec) this).field_q);
                  if (-19 <= (var2 ^ -1)) {
                    break L9;
                  } else {
                    if (94 <= var2) {
                      break L9;
                    } else {
                      var3 = 0;
                      L10: while (true) {
                        if (((ec) this).field_F[((ec) this).field_q].length <= var3) {
                          break L9;
                        } else {
                          var4 = lb.field_x - this.a(((ec) this).field_q, 4, var3);
                          if (-25 > (var4 ^ -1)) {
                            if (136 > var4) {
                              L11: {
                                if (((ec) this).field_q == -1 + ((ec) this).field_a) {
                                  break L11;
                                } else {
                                  if (((ec) this).field_H[((ec) this).field_q] != var3) {
                                    break L11;
                                  } else {
                                    var3++;
                                    continue L10;
                                  }
                                }
                              }
                              this.b(var3, ((ec) this).field_q, 16777215);
                              this.a(((ec) this).field_q, false, (byte) 122, false);
                              break L9;
                            } else {
                              var3++;
                              continue L10;
                            }
                          } else {
                            var3++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
          }
        }
        L12: {
          if (param0 > 85) {
            break L12;
          } else {
            int discarded$1 = this.a(81, true);
            break L12;
          }
        }
    }

    private final void d(byte param0, int param1) {
        int var3 = 0;
        int[] var10 = null;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        ((ec) this).field_u = -1;
        if (param0 >= -74) {
            ((ec) this).a((byte) -107, false);
        }
        for (var3 = param1 - -1; var3 < ((ec) this).field_a; var3++) {
            var10 = ((ec) this).field_H;
            var5 = var3;
            ((ec) this).field_N[var3] = -1;
            var10[var5] = -1;
            ((ec) this).field_p[var3] = (-640 + ((ec) this).field_V[var3]) / 2;
        }
        ((ec) this).field_a = param1 + 1;
        if (((ec) this).field_c > param1) {
            ((ec) this).field_c = param1;
        }
        if (!(((ec) this).field_q <= param1)) {
            ((ec) this).field_q = param1;
            ((ec) this).field_R = ((ec) this).field_N[param1];
            if (0 == (((ec) this).field_R ^ -1)) {
                ((ec) this).field_R = 0;
            }
        }
        om.a(new String[2][], 103, 13);
        ((ec) this).field_M = 312 + (112 + -(112 * ((ec) this).field_a));
    }

    final void a(int param0) {
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        if (3 != ((ec) this).field_P) {
          var2 = 0;
          L0: while (true) {
            if (-5 >= (var2 ^ -1)) {
              var2 = 0;
              if (param0 == -55) {
                L1: {
                  if (-3 != (((ec) this).field_P ^ -1)) {
                    break L1;
                  } else {
                    var2 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)(((ec) this).field_W + -5))) + 1.0));
                    break L1;
                  }
                }
                fl.a(((ec) this).field_L.toUpperCase(), var2, 1, param0 + -1698, 8);
                var3_int = 0;
                L2: while (true) {
                  if (var3_int >= ((ec) this).field_J.length) {
                    L3: {
                      var3 = ((ec) this).field_Q[((ec) this).field_a - 1];
                      if (var3 == null) {
                        break L3;
                      } else {
                        var4 = HoldTheLine.field_F.a(var3);
                        var5 = this.c((byte) -113, ((ec) this).field_a - 1);
                        tc.c(0, var5, 20 + var4, 28, 0, 192);
                        tc.a(0, var5, 20 + var4, 28, 16777215);
                        HoldTheLine.field_F.a(var3, 10, 18 + var5, 4, -1);
                        break L3;
                      }
                    }
                    oi.a(1, 13);
                    return;
                  } else {
                    this.a(this.a((byte) -128, var3_int), ((ec) this).field_J[var3_int], true, var3_int);
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                return;
              }
            } else {
              if (null != ((ec) this).field_F[var2]) {
                this.b((byte) 47, var2);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        if (!param1) {
          var3 = -1 + ((ec) this).field_a;
          L0: while (true) {
            if ((var3 ^ -1) > -1) {
              return -1;
            } else {
              var4 = this.c((byte) -113, var3);
              if (param0 >= var4) {
                if (var4 + 112 > param0) {
                  return var3;
                } else {
                  var3--;
                  continue L0;
                }
              } else {
                var3--;
                continue L0;
              }
            }
          }
        } else {
          return -38;
        }
    }

    private final int a(int param0, int param1, int param2) {
        if (param1 != 4) {
            ((ec) this).field_R = -9;
        }
        return 160 * param2 + (240 - (int)((ec) this).field_A[param0]);
    }

    private final void a(int param0, byte param1) {
        ((ec) this).field_V[param0] = ((ec) this).field_F[param0].length * 160;
        this.c(param0, -1, 0);
        ((ec) this).field_A[param0] = (float)((ec) this).field_p[param0];
        int var3 = -102 / ((-66 - param1) / 45);
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        ((ec) this).field_P = 0;
        ((ec) this).field_W = 0;
        for (var3 = 0; -5 < (var3 ^ -1); var3++) {
            ((ec) this).field_B[var3] = 0;
        }
        ((ec) this).field_M = 312;
        ((ec) this).field_u = -1;
        ((ec) this).field_q = !param1 ? 0 : -1;
        ((ec) this).field_r = 480.0f;
        if (param0 != 69) {
            return;
        }
        ((ec) this).field_ab = 0;
        ((ec) this).field_a = 1;
        ((ec) this).field_c = 0;
        ((ec) this).field_Z = 0;
        ((ec) this).field_R = !param1 ? 0 : -1;
        ((ec) this).a(true, 6267);
        om.a(new String[2][], 67, 13);
    }

    private final void b(int param0, int param1, int param2) {
        if (-1 < (param0 ^ -1)) {
            param0 = 0;
        }
        if (!(((ec) this).field_F[param1].length > param0)) {
            param0 = -1 + ((ec) this).field_F[param1].length;
        }
        if (param2 != 16777215) {
            ((ec) this).field_Y = -76;
        }
        ((ec) this).field_H[param1] = param0;
        ((ec) this).field_N[param1] = ((ec) this).field_F[param1][param0];
        this.c(param1, -1, param0 * 160 - -80);
    }

    final static void b(int param0, byte param1) {
        int var3 = HoldTheLine.field_D;
        if (param1 != 51) {
            return;
        }
        fl var4 = (fl) (Object) pd.field_e.b((byte) 125);
        while (var4 != null) {
            om.a(27391, var4, param0);
            var4 = (fl) (Object) pd.field_e.c((byte) -89);
        }
        hl var2 = oc.field_d.b((byte) 121);
        while (var2 != null) {
            q.a(param0, 60);
            var2 = oc.field_d.c((byte) 124);
        }
    }

    final void d(int param0, int param1) {
        if (param0 < 97) {
            ((ec) this).field_S = null;
        }
    }

    public static void e(byte param0) {
        field_y = null;
        if (param0 != -122) {
            return;
        }
        field_z = null;
        field_v = null;
        field_s = null;
        field_D = null;
    }

    private final int e(byte param0, int param1) {
        int var3 = 78 % ((74 - param0) / 33);
        return 240 - (int)((ec) this).field_A[param1];
    }

    final void c(byte param0) {
        float var2 = 0.0f;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = HoldTheLine.field_D;
        if (((ec) this).field_P != 3) {
          L0: {
            if (((ec) this).field_P == 0) {
              L1: {
                if (((ec) this).field_W == 0) {
                  ui discarded$2 = bd.a(17405, 64, 0, j.field_c.field_f);
                  ui discarded$3 = bd.a(param0 + 17514, 64, 256, j.field_c.field_h);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((ec) this).field_W = ((ec) this).field_W + 1;
              if (((ec) this).field_W + 1 == 5 * ((ec) this).field_J.length + 50) {
                ((ec) this).field_P = 1;
                ((ec) this).field_W = 0;
                break L0;
              } else {
                break L0;
              }
            } else {
              if (((ec) this).field_P != 2) {
                break L0;
              } else {
                ((ec) this).field_W = ((ec) this).field_W + 1;
                if (-260.0 <= (double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)(((ec) this).field_W + 1 + -5))))) {
                  break L0;
                } else {
                  ((ec) this).field_P = 3;
                  ((ec) this).field_W = 0;
                  break L0;
                }
              }
            }
          }
          L2: {
            var2 = (float)((ec) this).field_M - ((ec) this).field_r;
            ((ec) this).field_r = ((ec) this).field_r + 0.20000000298023224f * var2;
            if ((((ec) this).field_u ^ -1) == 0) {
              break L2;
            } else {
              if (Math.abs(var2) < 5.0f) {
                this.a(-1 + ((ec) this).field_a, ((ec) this).field_w, (byte) 122, true);
                break L2;
              } else {
                break L2;
              }
            }
          }
          var3 = 0;
          L3: while (true) {
            if (((ec) this).field_a <= var3) {
              var5 = 0;
              var3 = var5;
              L4: while (true) {
                if (var5 >= ((ec) this).field_J.length) {
                  L5: {
                    if (param0 == -109) {
                      break L5;
                    } else {
                      ec.e((byte) 121);
                      break L5;
                    }
                  }
                  L6: {
                    if (1 < ((ec) this).field_P) {
                      break L6;
                    } else {
                      L7: {
                        if (!na.field_k) {
                          break L7;
                        } else {
                          if (-1 != nc.field_g) {
                            this.d(86);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: while (true) {
                        if (!qh.c(-85)) {
                          break L6;
                        } else {
                          ((ec) this).a(true);
                          continue L8;
                        }
                      }
                    }
                  }
                  th.b(true);
                  return;
                } else {
                  ((ec) this).field_x[var5] = ((ec) this).field_x[var5] + (-((ec) this).field_x[var5] + (float)((ec) this).field_I[var5]) * 0.20000000298023224f;
                  var5++;
                  continue L4;
                }
              }
            } else {
              L9: {
                if ((float)((ec) this).field_p[var3] != ((ec) this).field_A[var3]) {
                  ((ec) this).field_A[var3] = ((ec) this).field_A[var3] + ((float)((ec) this).field_p[var3] - ((ec) this).field_A[var3]) * 0.05000000074505806f;
                  break L9;
                } else {
                  break L9;
                }
              }
              if (((ec) this).field_B[var3] > 0) {
                ((ec) this).field_B[var3] = ((ec) this).field_B[var3] - 1;
                var3++;
                continue L3;
              } else {
                var3++;
                continue L3;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int c(byte param0, int param1) {
        if (param0 != -113) {
            return -39;
        }
        return 112 * param1 - -(int)((ec) this).field_r;
    }

    final void d(byte param0) {
        if (-3 != (((ec) this).field_P ^ -1)) {
            if (!(3 != ((ec) this).field_P)) {
                return;
            }
            bn.a(1, -107);
            ((ec) this).field_P = 2;
            if (param0 >= -104) {
                return;
            }
            ((ec) this).field_W = 0;
            ((ec) this).field_M = 480;
            return;
        }
    }

    private final void a(String param0, int param1, int[] param2, hj[] param3, boolean param4, String[] param5, String[] param6, int param7) {
        ((ec) this).field_F[((ec) this).field_a] = param2;
        ((ec) this).field_o[((ec) this).field_a] = param3;
        ((ec) this).field_X[((ec) this).field_a] = param6;
        ((ec) this).field_G[((ec) this).field_a] = param5;
        ((ec) this).field_Q[((ec) this).field_a] = param0;
        ((ec) this).field_T[((ec) this).field_a] = param1;
        ((ec) this).field_H[((ec) this).field_a] = -1;
        ((ec) this).field_N[((ec) this).field_a] = -1;
        if (param4) {
            ((ec) this).field_q = ((ec) this).field_a;
            ((ec) this).field_R = 0;
        }
        this.a(((ec) this).field_a, (byte) 126);
        ((ec) this).field_a = ((ec) this).field_a + 1;
        ((ec) this).field_c = ((ec) this).field_a;
        om.a(new String[2][], param7 ^ 374, 13);
        ((ec) this).field_M = -(112 * (((ec) this).field_a + -1)) + param7;
        ((ec) this).field_u = -1;
    }

    private final void b(byte param0, int param1) {
        int[] var3 = null;
        hj[] var4 = null;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          var11 = HoldTheLine.field_D;
          var16 = ((ec) this).field_F[param1];
          var15 = var16;
          var14 = var15;
          var13 = var14;
          var3 = var13;
          var4 = ((ec) this).field_o[param1];
          var5 = ((ec) this).field_X[param1];
          if (param0 == 47) {
            break L0;
          } else {
            field_y = null;
            break L0;
          }
        }
        if (var3 != null) {
          var6 = this.e((byte) 17, param1) + 24;
          var7 = this.c((byte) -113, param1);
          var8 = 18 + var7;
          var9 = (424 + -var7) * 256 / 112;
          if (16 >= var9) {
            return;
          } else {
            L1: {
              if ((var9 ^ -1) <= -257) {
                hh.field_e.b(0, var7);
                var12 = 0;
                var10 = var12;
                L2: while (true) {
                  if (var12 >= var16.length) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        if (param1 != ((ec) this).field_q) {
                          break L4;
                        } else {
                          if (((ec) this).field_R != var12) {
                            break L4;
                          } else {
                            if ((((ec) this).field_Y ^ -1) != 0) {
                              break L4;
                            } else {
                              tc.c(-5 + var6, -5 + var8, 121, 94, 16744576, 128);
                              var4[var12].b(var6, var8);
                              break L3;
                            }
                          }
                        }
                      }
                      L5: {
                        if (((ec) this).field_H[param1] != var12) {
                          break L5;
                        } else {
                          if (0 == (((ec) this).field_Y ^ -1)) {
                            tc.c(var6 + -5, -5 + var8, 121, 94, 16777215, 128);
                            var4[var12].b(var6, var8);
                            if ((((ec) this).field_B[param1] ^ -1) >= -1) {
                              break L3;
                            } else {
                              if (((-((ec) this).field_B[param1] + 90) % 30 ^ -1) < -16) {
                                break L3;
                              } else {
                                tc.c(var6, var8, 111, 84, 16777215, 128);
                                break L3;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      var4[var12].b(var6, var8);
                      o.a(128, 84, var8, 128, 111, -4441, var6);
                      break L3;
                    }
                    wb.a(20, var5[var12], 4, 2, 111, var8, var6, 74, -1, 1, HoldTheLine.field_F);
                    // wide iinc 6 160
                    var12++;
                    continue L2;
                  }
                }
              } else {
                hh.field_e.d(0, var7, var9);
                var10 = 0;
                L6: while (true) {
                  if (var10 >= var16.length) {
                    break L1;
                  } else {
                    L7: {
                      L8: {
                        if (var10 != ((ec) this).field_H[param1]) {
                          break L8;
                        } else {
                          if (0 == (((ec) this).field_Y ^ -1)) {
                            tc.c(var6 - 5, -5 + var8, 121, 94, 16777215, var9 >> 329836513);
                            var4[var10].d(var6, var8, var9);
                            if ((((ec) this).field_B[param1] ^ -1) >= -1) {
                              break L7;
                            } else {
                              if ((-((ec) this).field_B[param1] + 90) % 30 > 15) {
                                break L7;
                              } else {
                                tc.c(var6, var8, 111, 84, 16777215, var9 >> -370132799);
                                break L7;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (((ec) this).field_q != param1) {
                          break L9;
                        } else {
                          if (((ec) this).field_R != var10) {
                            break L9;
                          } else {
                            if ((((ec) this).field_Y ^ -1) == 0) {
                              tc.c(-5 + var6, -5 + var8, 121, 94, 16777215, var9 >> 1339127681);
                              var4[var10].d(var6, var8, var9);
                              break L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      var4[var10].d(var6, var8, var9);
                      o.a(128, 84, var8, 128, 111, param0 + -4488, var6);
                      break L7;
                    }
                    wb.a(20, var5[var10], 4, 2, 111, var8, var6, 74, param0 ^ -48, 1, HoldTheLine.field_F);
                    // wide iinc 6 160
                    var10++;
                    continue L6;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (!(-641 > (((ec) this).field_V[param0] ^ -1))) {
            ((ec) this).field_p[param0] = (-160 + ((ec) this).field_V[param0]) / 2;
            return;
        }
        int var4 = -80 + param2;
        if (param1 != -1) {
            field_s = null;
        }
        if (-241 < (var4 ^ -1)) {
            var4 = 240;
        }
        if (!(-400 + ((ec) this).field_V[param0] >= var4)) {
            var4 = ((ec) this).field_V[param0] + -400;
        }
        ((ec) this).field_p[param0] = var4;
    }

    final void a(int param0, int param1) {
        if (param0 != 1) {
            Object var4 = null;
            this.a((String) null, 117, (int[]) null, (hj[]) null, true, (String[]) null, (String[]) null, 115);
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        String var9_ref = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String[] var7_array = null;
        String var8 = null;
        String var9 = null;
        String[] var9_array = null;
        int var10 = 0;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        String[] stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int[] stackIn_21_0 = null;
        String[] stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int[] stackIn_22_0 = null;
        String[] stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        StringBuilder stackIn_30_0 = null;
        StringBuilder stackIn_31_0 = null;
        StringBuilder stackIn_32_0 = null;
        String stackIn_32_1 = null;
        StringBuilder stackIn_35_0 = null;
        StringBuilder stackIn_36_0 = null;
        StringBuilder stackIn_37_0 = null;
        String stackIn_37_1 = null;
        StringBuilder stackIn_39_0 = null;
        StringBuilder stackIn_40_0 = null;
        StringBuilder stackIn_41_0 = null;
        String stackIn_41_1 = null;
        String[] stackIn_42_0 = null;
        String[] stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        String[] stackIn_43_0 = null;
        String[] stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        String[] stackIn_44_0 = null;
        String[] stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        String stackIn_44_3 = null;
        int[] stackIn_45_0 = null;
        String[] stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int[] stackIn_46_0 = null;
        String[] stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int[] stackIn_47_0 = null;
        String[] stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        StringBuilder stackOut_34_0 = null;
        StringBuilder stackOut_36_0 = null;
        String stackOut_36_1 = null;
        StringBuilder stackOut_35_0 = null;
        String stackOut_35_1 = null;
        StringBuilder stackOut_29_0 = null;
        StringBuilder stackOut_31_0 = null;
        String stackOut_31_1 = null;
        StringBuilder stackOut_30_0 = null;
        String stackOut_30_1 = null;
        StringBuilder stackOut_38_0 = null;
        StringBuilder stackOut_40_0 = null;
        String stackOut_40_1 = null;
        StringBuilder stackOut_39_0 = null;
        String stackOut_39_1 = null;
        String[] stackOut_41_0 = null;
        String[] stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        String[] stackOut_43_0 = null;
        String[] stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        String stackOut_43_3 = null;
        String[] stackOut_42_0 = null;
        String[] stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        String stackOut_42_3 = null;
        int[] stackOut_44_0 = null;
        String[] stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int[] stackOut_46_0 = null;
        String[] stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int[] stackOut_45_0 = null;
        String[] stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        String stackOut_15_0 = null;
        String stackOut_14_0 = null;
        String stackOut_18_0 = null;
        String stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        String[] stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int[] stackOut_21_0 = null;
        String[] stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int[] stackOut_20_0 = null;
        String[] stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        var9_ref = null;
        L0: {
          var10 = HoldTheLine.field_D;
          var5 = 0;
          if (0 == ((ec) this).field_P) {
            var5 = 50 + -((ec) this).field_W + 5 * param3;
            break L0;
          } else {
            if ((((ec) this).field_P ^ -1) == -3) {
              var5 = ((ec) this).field_W - (-25 - -(5 * (((ec) this).field_J.length - param3)));
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (param2) {
          L1: {
            if (var5 < 0) {
              var5 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var6 = (int)((double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)var5))));
            var6 = (int)((float)var6 + ((ec) this).field_x[param3]);
            if ((param1 ^ -1) == -23) {
              L3: {
                if (7 != mi.field_d) {
                  if (mi.field_d == -1) {
                    L4: {
                      stackOut_34_0 = new StringBuilder();
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (!wb.field_c) {
                        stackOut_36_0 = (StringBuilder) (Object) stackIn_36_0;
                        stackOut_36_1 = tf.field_r;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L4;
                      } else {
                        stackOut_35_0 = (StringBuilder) (Object) stackIn_35_0;
                        stackOut_35_1 = h.field_e;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        break L4;
                      }
                    }
                    var7 = stackIn_37_1 + " " + bo.field_a;
                    break L3;
                  } else {
                    if (-2 == mi.field_d) {
                      var7 = cj.field_M;
                      break L3;
                    } else {
                      if (-3 == (mi.field_d ^ -1)) {
                        L5: {
                          stackOut_29_0 = new StringBuilder();
                          stackIn_31_0 = stackOut_29_0;
                          stackIn_30_0 = stackOut_29_0;
                          if (wb.field_c) {
                            stackOut_31_0 = (StringBuilder) (Object) stackIn_31_0;
                            stackOut_31_1 = h.field_e;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            break L5;
                          } else {
                            stackOut_30_0 = (StringBuilder) (Object) stackIn_30_0;
                            stackOut_30_1 = tf.field_r;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_32_1 = stackOut_30_1;
                            break L5;
                          }
                        }
                        var7 = stackIn_32_1 + " " + qm.field_g;
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } else {
                  var7 = pg.field_H;
                  break L3;
                }
              }
              L6: {
                var7 = uk.field_c[20] + var7;
                stackOut_38_0 = new StringBuilder().append(uk.field_c[21]);
                stackIn_40_0 = stackOut_38_0;
                stackIn_39_0 = stackOut_38_0;
                if (em.field_o) {
                  stackOut_40_0 = (StringBuilder) (Object) stackIn_40_0;
                  stackOut_40_1 = hf.field_l;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  break L6;
                } else {
                  stackOut_39_0 = (StringBuilder) (Object) stackIn_39_0;
                  stackOut_39_1 = dl.field_h;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  break L6;
                }
              }
              L7: {
                var8 = stackIn_41_1;
                stackOut_41_0 = new String[3];
                stackOut_41_1 = new String[3];
                stackOut_41_2 = 2;
                stackIn_43_0 = stackOut_41_0;
                stackIn_43_1 = stackOut_41_1;
                stackIn_43_2 = stackOut_41_2;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                stackIn_42_2 = stackOut_41_2;
                if (((ec) this).field_t) {
                  stackOut_43_0 = (String[]) (Object) stackIn_43_0;
                  stackOut_43_1 = (String[]) (Object) stackIn_43_1;
                  stackOut_43_2 = stackIn_43_2;
                  stackOut_43_3 = (String) var8;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  stackIn_44_3 = stackOut_43_3;
                  break L7;
                } else {
                  stackOut_42_0 = (String[]) (Object) stackIn_42_0;
                  stackOut_42_1 = (String[]) (Object) stackIn_42_1;
                  stackOut_42_2 = stackIn_42_2;
                  stackOut_42_3 = "";
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  stackIn_44_2 = stackOut_42_2;
                  stackIn_44_3 = stackOut_42_3;
                  break L7;
                }
              }
              L8: {
                stackIn_44_1[stackIn_44_2] = stackIn_44_3;
                var9_array = stackIn_44_0;
                stackOut_44_0 = ((ec) this).field_K;
                stackOut_44_1 = (String[]) var9_array;
                stackOut_44_2 = 120;
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_46_2 = stackOut_44_2;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                stackIn_45_2 = stackOut_44_2;
                if (((ec) this).field_Y == param3) {
                  stackOut_46_0 = (int[]) (Object) stackIn_46_0;
                  stackOut_46_1 = (String[]) (Object) stackIn_46_1;
                  stackOut_46_2 = stackIn_46_2;
                  stackOut_46_3 = ((ec) this).field_ab;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  stackIn_47_3 = stackOut_46_3;
                  break L8;
                } else {
                  stackOut_45_0 = (int[]) (Object) stackIn_45_0;
                  stackOut_45_1 = (String[]) (Object) stackIn_45_1;
                  stackOut_45_2 = stackIn_45_2;
                  stackOut_45_3 = -1;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  stackIn_47_3 = stackOut_45_3;
                  break L8;
                }
              }
              fk.a(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_47_3, param0, -1, var6);
              break L2;
            } else {
              if (param1 == 23) {
                L9: {
                  if (((ec) this).field_a > 1) {
                    stackOut_15_0 = lg.field_r;
                    stackIn_16_0 = stackOut_15_0;
                    break L9;
                  } else {
                    stackOut_14_0 = "";
                    stackIn_16_0 = stackOut_14_0;
                    break L9;
                  }
                }
                L10: {
                  var8 = stackIn_16_0;
                  var7 = var8;
                  var7 = var8;
                  if (pj.b((byte) 124)) {
                    stackOut_18_0 = uk.field_c[9];
                    stackIn_19_0 = stackOut_18_0;
                    break L10;
                  } else {
                    stackOut_17_0 = "";
                    stackIn_19_0 = stackOut_17_0;
                    break L10;
                  }
                }
                L11: {
                  var9_ref = stackIn_19_0;
                  var7 = var9_ref;
                  var7 = var9_ref;
                  var7_array = new String[]{var8, "", var9_ref};
                  stackOut_19_0 = ((ec) this).field_K;
                  stackOut_19_1 = (String[]) var7_array;
                  stackOut_19_2 = 72;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  if (((ec) this).field_Y != param3) {
                    stackOut_21_0 = (int[]) (Object) stackIn_21_0;
                    stackOut_21_1 = (String[]) (Object) stackIn_21_1;
                    stackOut_21_2 = stackIn_21_2;
                    stackOut_21_3 = -1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    stackIn_22_3 = stackOut_21_3;
                    break L11;
                  } else {
                    stackOut_20_0 = (int[]) (Object) stackIn_20_0;
                    stackOut_20_1 = (String[]) (Object) stackIn_20_1;
                    stackOut_20_2 = stackIn_20_2;
                    stackOut_20_3 = ((ec) this).field_Z;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_22_2 = stackOut_20_2;
                    stackIn_22_3 = stackOut_20_3;
                    break L11;
                  }
                }
                fk.a(stackIn_22_0, stackIn_22_1, stackIn_22_2, stackIn_22_3, param0, -1, var6);
                break L2;
              } else {
                break L2;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_102_0 = 0;
        Object stackIn_107_0 = null;
        Object stackIn_108_0 = null;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        Object stackIn_125_0 = null;
        Object stackIn_126_0 = null;
        Object stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        Object stackIn_131_0 = null;
        Object stackIn_132_0 = null;
        Object stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_98_0 = 0;
        Object stackOut_106_0 = null;
        Object stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        Object stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        Object stackOut_124_0 = null;
        Object stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        Object stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        Object stackOut_130_0 = null;
        Object stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        Object stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        L0: {
          var14 = HoldTheLine.field_D;
          if (-2 != param2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (-1 != param2) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          var9 = 116 / ((param3 - 55) / 51);
          if (param2 != 2) {
            if (-4 == (param2 ^ -1)) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = 0;
              stackIn_12_0 = stackOut_9_0;
              break L2;
            }
          } else {
            stackOut_7_0 = 1;
            stackIn_12_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_12_0;
          if (param2 != 4) {
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L3;
          } else {
            stackOut_13_0 = 1;
            stackIn_15_0 = stackOut_13_0;
            break L3;
          }
        }
        L4: {
          var8 = stackIn_15_0;
          if (param2 != 2) {
            if (param2 == 3) {
              stackOut_19_0 = 1;
              stackIn_21_0 = stackOut_19_0;
              break L4;
            } else {
              stackOut_18_0 = 0;
              stackIn_21_0 = stackOut_18_0;
              break L4;
            }
          } else {
            stackOut_16_0 = 1;
            stackIn_21_0 = stackOut_16_0;
            break L4;
          }
        }
        L5: {
          var10 = stackIn_21_0;
          if ((param2 ^ -1) == -4) {
            stackOut_25_0 = 1;
            stackIn_27_0 = stackOut_25_0;
            break L5;
          } else {
            if (param2 == 4) {
              stackOut_24_0 = 1;
              stackIn_27_0 = stackOut_24_0;
              break L5;
            } else {
              stackOut_23_0 = 0;
              stackIn_27_0 = stackOut_23_0;
              break L5;
            }
          }
        }
        L6: {
          var11 = stackIn_27_0;
          ui discarded$1 = qf.a(293, cf.field_r);
          if (param1 != 22) {
            if (param1 == 23) {
              L7: {
                if (0 < ((ec) this).field_c) {
                  stackOut_96_0 = 0;
                  stackIn_97_0 = stackOut_96_0;
                  break L7;
                } else {
                  stackOut_95_0 = 2;
                  stackIn_97_0 = stackOut_95_0;
                  break L7;
                }
              }
              L8: {
                var12 = stackIn_97_0;
                if (pj.b((byte) 90)) {
                  if (((ec) this).field_c <= 0) {
                    stackOut_101_0 = 0;
                    stackIn_102_0 = stackOut_101_0;
                    break L8;
                  } else {
                    stackOut_100_0 = 1;
                    stackIn_102_0 = stackOut_100_0;
                    break L8;
                  }
                } else {
                  stackOut_98_0 = 0;
                  stackIn_102_0 = stackOut_98_0;
                  break L8;
                }
              }
              L9: {
                L10: {
                  var13 = stackIn_102_0;
                  if (var5 != 0) {
                    break L10;
                  } else {
                    if (var6 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (var13 == 0) {
                  ((ec) this).field_Z = var12;
                  break L9;
                } else {
                  L11: {
                    stackOut_106_0 = this;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_107_0 = stackOut_106_0;
                    if (((ec) this).field_Z != 0) {
                      stackOut_108_0 = this;
                      stackOut_108_1 = 0;
                      stackIn_109_0 = stackOut_108_0;
                      stackIn_109_1 = stackOut_108_1;
                      break L11;
                    } else {
                      stackOut_107_0 = this;
                      stackOut_107_1 = 2;
                      stackIn_109_0 = stackOut_107_0;
                      stackIn_109_1 = stackOut_107_1;
                      break L11;
                    }
                  }
                  ((ec) this).field_Z = stackIn_109_1;
                  break L9;
                }
              }
              L12: {
                if (var10 != 0) {
                  if (0 == ((ec) this).field_Z) {
                    if (-1 != ((ec) this).field_c) {
                      this.d((byte) -92, -1 + ((ec) this).field_c);
                      ((ec) this).field_g = true;
                      ((ec) this).field_Y = -1;
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    if (-3 != ((ec) this).field_Z) {
                      break L12;
                    } else {
                      if (pj.b((byte) 113)) {
                        i.a((byte) 60, true);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                } else {
                  break L12;
                }
              }
              if (var13 == 0) {
                L13: {
                  if (var7 != 0) {
                    break L13;
                  } else {
                    if (var8 != 0) {
                      break L13;
                    } else {
                      break L6;
                    }
                  }
                }
                ((ec) this).field_Z = var12;
                break L6;
              } else {
                L14: {
                  if (var7 != 0) {
                    L15: {
                      stackOut_124_0 = this;
                      stackIn_126_0 = stackOut_124_0;
                      stackIn_125_0 = stackOut_124_0;
                      if (((ec) this).field_Z == 2) {
                        stackOut_126_0 = this;
                        stackOut_126_1 = 0;
                        stackIn_127_0 = stackOut_126_0;
                        stackIn_127_1 = stackOut_126_1;
                        break L15;
                      } else {
                        stackOut_125_0 = this;
                        stackOut_125_1 = 2;
                        stackIn_127_0 = stackOut_125_0;
                        stackIn_127_1 = stackOut_125_1;
                        break L15;
                      }
                    }
                    ((ec) this).field_Z = stackIn_127_1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                if (var8 != 0) {
                  L16: {
                    stackOut_130_0 = this;
                    stackIn_132_0 = stackOut_130_0;
                    stackIn_131_0 = stackOut_130_0;
                    if (((ec) this).field_Z == 0) {
                      stackOut_132_0 = this;
                      stackOut_132_1 = 2;
                      stackIn_133_0 = stackOut_132_0;
                      stackIn_133_1 = stackOut_132_1;
                      break L16;
                    } else {
                      stackOut_131_0 = this;
                      stackOut_131_1 = 0;
                      stackIn_133_0 = stackOut_131_0;
                      stackIn_133_1 = stackOut_131_1;
                      break L16;
                    }
                  }
                  ((ec) this).field_Z = stackIn_133_1;
                  break L6;
                } else {
                  break L6;
                }
              }
            } else {
              break L6;
            }
          } else {
            L17: {
              if (((ec) this).field_t) {
                stackOut_30_0 = 2;
                stackIn_31_0 = stackOut_30_0;
                break L17;
              } else {
                stackOut_29_0 = 1;
                stackIn_31_0 = stackOut_29_0;
                break L17;
              }
            }
            L18: {
              var12 = stackIn_31_0;
              if (var5 == 0) {
                if (var6 == 0) {
                  break L18;
                } else {
                  ((ec) this).field_ab = ((ec) this).field_ab + 1;
                  if (var12 < ((ec) this).field_ab + 1) {
                    ((ec) this).field_ab = 0;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              } else {
                ((ec) this).field_ab = ((ec) this).field_ab - 1;
                if (0 <= ((ec) this).field_ab - 1) {
                  break L18;
                } else {
                  ((ec) this).field_ab = var12;
                  break L18;
                }
              }
            }
            if (((ec) this).field_ab == 0) {
              L19: {
                if (var7 != 0) {
                  if (mi.field_d == 7) {
                    wb.field_c = false;
                    mi.field_d = 0;
                    break L19;
                  } else {
                    if (mi.field_d == 0) {
                      L20: {
                        if (wb.field_c) {
                          mi.field_d = 1;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        if (wb.field_c) {
                          stackOut_84_0 = 0;
                          stackIn_85_0 = stackOut_84_0;
                          break L21;
                        } else {
                          stackOut_83_0 = 1;
                          stackIn_85_0 = stackOut_83_0;
                          break L21;
                        }
                      }
                      wb.field_c = stackIn_85_0 != 0;
                      break L19;
                    } else {
                      if (1 != mi.field_d) {
                        if (2 == mi.field_d) {
                          L22: {
                            if (wb.field_c) {
                              mi.field_d = 7;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          L23: {
                            if (wb.field_c) {
                              stackOut_77_0 = 0;
                              stackIn_78_0 = stackOut_77_0;
                              break L23;
                            } else {
                              stackOut_76_0 = 1;
                              stackIn_78_0 = stackOut_76_0;
                              break L23;
                            }
                          }
                          wb.field_c = stackIn_78_0 != 0;
                          break L19;
                        } else {
                          break L19;
                        }
                      } else {
                        mi.field_d = 2;
                        break L19;
                      }
                    }
                  }
                } else {
                  if (var8 == 0) {
                    break L19;
                  } else {
                    if (7 != mi.field_d) {
                      if (mi.field_d != 0) {
                        if (mi.field_d != -2) {
                          if (-3 != mi.field_d) {
                            break L19;
                          } else {
                            L24: {
                              if (!wb.field_c) {
                                mi.field_d = 1;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            wb.field_c = false;
                            break L19;
                          }
                        } else {
                          mi.field_d = 0;
                          wb.field_c = true;
                          break L19;
                        }
                      } else {
                        L25: {
                          if (wb.field_c) {
                            break L25;
                          } else {
                            mi.field_d = 7;
                            break L25;
                          }
                        }
                        wb.field_c = false;
                        break L19;
                      }
                    } else {
                      wb.field_c = true;
                      mi.field_d = 2;
                      break L19;
                    }
                  }
                }
              }
              L26: {
                if (var7 != 0) {
                  break L26;
                } else {
                  if (var8 == 0) {
                    break L6;
                  } else {
                    break L26;
                  }
                }
              }
              h.b((byte) 125);
              ((ec) this).field_O[param0] = cc.field_C[mi.field_d];
              ((ec) this).a(false, 6267);
              this.a(0, (byte) -124);
              ((ec) this).field_H[0] = -1;
              ((ec) this).field_N[0] = -1;
              this.d((byte) -96, 0);
              break L6;
            } else {
              if (1 != ((ec) this).field_ab) {
                if (!((ec) this).field_t) {
                  break L6;
                } else {
                  L27: {
                    if (var10 != 0) {
                      break L27;
                    } else {
                      if (var7 != 0) {
                        break L27;
                      } else {
                        if (var8 != 0) {
                          break L27;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L28: {
                    if (em.field_o) {
                      stackOut_49_0 = 0;
                      stackIn_50_0 = stackOut_49_0;
                      break L28;
                    } else {
                      stackOut_48_0 = 1;
                      stackIn_50_0 = stackOut_48_0;
                      break L28;
                    }
                  }
                  em.field_o = stackIn_50_0 != 0;
                  break L6;
                }
              } else {
                if (var10 == 0) {
                  break L6;
                } else {
                  wm.a(var11 != 0, false, 0);
                  break L6;
                }
              }
            }
          }
        }
    }

    private final int d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HoldTheLine.field_D;
          if (param1 <= -51) {
            break L0;
          } else {
            ((ec) this).field_L = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            if (((ec) this).field_J.length <= var4) {
              break L2;
            } else {
              var5 = this.a((byte) -128, var4);
              if (param0 >= var5) {
                if (30 + var5 >= param0) {
                  break L2;
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
          if (((ec) this).field_J.length == var4) {
            return -1;
          } else {
            L3: {
              if (22 != ((ec) this).field_J[var4]) {
                if (((ec) this).field_J[var4] == 23) {
                  ((ec) this).field_Z = fj.a(((ec) this).field_S, (byte) -119, param2);
                  break L3;
                } else {
                  L4: {
                    if ((param2 ^ -1) > -16) {
                      break L4;
                    } else {
                      if (param2 > 355) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return -1;
                }
              } else {
                ((ec) this).field_ab = fj.a(((ec) this).field_K, (byte) -119, param2);
                if (((ec) this).field_ab == 0) {
                  ci.a(0, (byte) 67, 13, 0);
                  break L3;
                } else {
                  if (((ec) this).field_ab != 2) {
                    break L3;
                  } else {
                    if (((ec) this).field_t) {
                      ci.a(0, (byte) 100, 13, 1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            return var4;
          }
        }
    }

    final void a(boolean param0, int param1) {
        ((ec) this).field_J = em.field_i[((ec) this).field_E];
        ((ec) this).field_t = wb.field_c;
        if (param1 != 6267) {
            int discarded$0 = this.d(20, 52, -61);
        }
        ((ec) this).field_t = ((ec) this).field_t | (-2 == mi.field_d ? true : false);
        ((ec) this).field_t = ((ec) this).field_t & (-8 != mi.field_d ? true : false);
        ((ec) this).field_O = new String[]{cc.field_C[mi.field_d], cd.field_c};
    }

    private final void a(int param0, boolean param1, byte param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        int var11 = 0;
        hj[] var12 = null;
        hj[] var13 = null;
        hj[] var14 = null;
        hj[] var15 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        String stackIn_34_0 = null;
        String stackIn_47_0 = null;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        String stackOut_46_0 = null;
        String stackOut_45_0 = null;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var11 = HoldTheLine.field_D;
        ((ec) this).field_Y = -1;
        if (((ec) this).field_a + -1 <= param0) {
          L0: {
            ((ec) this).field_u = -1;
            ui discarded$1 = qf.a(293, cf.field_r);
            var5 = ((ec) this).field_H[param0];
            if (param2 == 122) {
              break L0;
            } else {
              ((ec) this).field_p = null;
              break L0;
            }
          }
          var6 = ((ec) this).field_N[param0];
          if (-1 == var5) {
            return;
          } else {
            L1: {
              ((ec) this).field_B[param0] = 90;
              if (-8 == mi.field_d) {
                if (param0 != 0) {
                  break L1;
                } else {
                  if (!param3) {
                    var7 = pf.a((byte) 60, var6);
                    if (var7 == 0) {
                      L2: {
                        cf.field_w = var6;
                        vg.field_P = 0;
                        bn.a(var6 + 4, -107);
                        stackOut_68_0 = -21383;
                        stackIn_70_0 = stackOut_68_0;
                        stackIn_69_0 = stackOut_68_0;
                        if (param1) {
                          stackOut_70_0 = stackIn_70_0;
                          stackOut_70_1 = 0;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          break L2;
                        } else {
                          stackOut_69_0 = stackIn_69_0;
                          stackOut_69_1 = 1;
                          stackIn_71_0 = stackOut_69_0;
                          stackIn_71_1 = stackOut_69_1;
                          break L2;
                        }
                      }
                      ma.a(stackIn_71_0, stackIn_71_1 != 0);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                L3: {
                  if (mi.field_d == 1) {
                    break L3;
                  } else {
                    if (-1 == mi.field_d) {
                      break L3;
                    } else {
                      if (param0 == 0) {
                        L4: {
                          vg.field_P = var6;
                          cf.field_w = var6;
                          var7 = pf.a((byte) 92, cf.field_w);
                          if (0 == var7) {
                            L5: {
                              var8 = cf.field_w;
                              var13 = new hj[]{ua.field_b.a(84, go.field_g[var8][0], 9, 111), ua.field_b.a(84, go.field_g[var8][1], param2 ^ 115, 111)};
                              if (!wb.field_c) {
                                stackOut_33_0 = ui.field_m;
                                stackIn_34_0 = stackOut_33_0;
                                break L5;
                              } else {
                                stackOut_32_0 = ui.field_m + " " + ac.field_g;
                                stackIn_34_0 = stackOut_32_0;
                                break L5;
                              }
                            }
                            var10 = stackIn_34_0;
                            this.a(var10, 16711680, go.field_g[var8], var13, param1, v.field_A[var8], sg.field_gb[var8], 312);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        bn.a(4 + cf.field_w, param2 ^ -16);
                        break L1;
                      } else {
                        if (1 != param0) {
                          if (-3 != (param0 ^ -1)) {
                            break L1;
                          } else {
                            if (!param3) {
                              L6: {
                                ah.field_b = var6;
                                stackOut_25_0 = -21383;
                                stackIn_27_0 = stackOut_25_0;
                                stackIn_26_0 = stackOut_25_0;
                                if (param1) {
                                  stackOut_27_0 = stackIn_27_0;
                                  stackOut_27_1 = 0;
                                  stackIn_28_0 = stackOut_27_0;
                                  stackIn_28_1 = stackOut_27_1;
                                  break L6;
                                } else {
                                  stackOut_26_0 = stackIn_26_0;
                                  stackOut_26_1 = 1;
                                  stackIn_28_0 = stackOut_26_0;
                                  stackIn_28_1 = stackOut_26_1;
                                  break L6;
                                }
                              }
                              ma.a(stackIn_28_0, stackIn_28_1 != 0);
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          t.field_l = var6;
                          if (wb.field_c) {
                            var7 = cf.field_w;
                            var12 = new hj[]{ua.field_b.a(84, go.field_g[var7][0] + 8, 9, 111), ua.field_b.a(84, 8 - -go.field_g[var7][1], 9, 111)};
                            this.a(ui.field_m + " " + qe.field_e, 65280, go.field_g[var7], var12, param1, v.field_A[var7], sg.field_gb[var7], 312);
                            break L1;
                          } else {
                            if (param3) {
                              break L1;
                            } else {
                              L7: {
                                stackOut_17_0 = -21383;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_18_0 = stackOut_17_0;
                                if (param1) {
                                  stackOut_19_0 = stackIn_19_0;
                                  stackOut_19_1 = 0;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  break L7;
                                } else {
                                  stackOut_18_0 = stackIn_18_0;
                                  stackOut_18_1 = 1;
                                  stackIn_20_0 = stackOut_18_0;
                                  stackIn_20_1 = stackOut_18_1;
                                  break L7;
                                }
                              }
                              ma.a(stackIn_20_0, stackIn_20_1 != 0);
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L8: {
                  if (0 != param0) {
                    break L8;
                  } else {
                    var7 = pf.a((byte) 65, var6);
                    if (-1 == (var7 ^ -1)) {
                      cf.field_w = var6;
                      bn.a(4 - -var6, -112);
                      h.b((byte) 101);
                      this.a(nc.field_a, qm.field_i[var5], ((ec) this).field_F[1], ((ec) this).field_o[1], param1, ((ec) this).field_G[1], ((ec) this).field_X[1], 312);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (-2 == (param0 ^ -1)) {
                    vg.field_P = var6;
                    var7 = kn.b((byte) -49).field_p;
                    if (gj.a(vg.field_P, -70, cf.field_w) == 0) {
                      L10: {
                        var14 = new hj[]{ua.field_b.a(84, go.field_g[var7][0], 9, 111), ua.field_b.a(84, go.field_g[var7][1], 9, 111)};
                        if (wb.field_c) {
                          stackOut_46_0 = ui.field_m + " " + ac.field_g;
                          stackIn_47_0 = stackOut_46_0;
                          break L10;
                        } else {
                          stackOut_45_0 = ui.field_m;
                          stackIn_47_0 = stackOut_45_0;
                          break L10;
                        }
                      }
                      var9 = stackIn_47_0;
                      this.a(var9, 16711680, go.field_g[var7], var14, param1, v.field_A[var7], sg.field_gb[var7], 312);
                      break L9;
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L11: {
                  if (-3 != (param0 ^ -1)) {
                    break L11;
                  } else {
                    t.field_l = var6;
                    var7 = kn.b((byte) -49).field_p;
                    if (wb.field_c) {
                      var15 = new hj[]{ua.field_b.a(84, 8 - -go.field_g[var7][0], 9, 111), ua.field_b.a(84, go.field_g[var7][1] + 8, 9, 111)};
                      this.a(ui.field_m + " " + qe.field_e, 65280, go.field_g[var7], var15, param1, v.field_A[var7], sg.field_gb[var7], 312);
                      break L11;
                    } else {
                      if (!param3) {
                        L12: {
                          stackOut_52_0 = -21383;
                          stackIn_54_0 = stackOut_52_0;
                          stackIn_53_0 = stackOut_52_0;
                          if (param1) {
                            stackOut_54_0 = stackIn_54_0;
                            stackOut_54_1 = 0;
                            stackIn_55_0 = stackOut_54_0;
                            stackIn_55_1 = stackOut_54_1;
                            break L12;
                          } else {
                            stackOut_53_0 = stackIn_53_0;
                            stackOut_53_1 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            stackIn_55_1 = stackOut_53_1;
                            break L12;
                          }
                        }
                        ma.a(stackIn_55_0, stackIn_55_1 != 0);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                if (param0 != 3) {
                  break L1;
                } else {
                  if (param3) {
                    break L1;
                  } else {
                    L13: {
                      ah.field_b = var6;
                      stackOut_59_0 = -21383;
                      stackIn_61_0 = stackOut_59_0;
                      stackIn_60_0 = stackOut_59_0;
                      if (param1) {
                        stackOut_61_0 = stackIn_61_0;
                        stackOut_61_1 = 0;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        break L13;
                      } else {
                        stackOut_60_0 = stackIn_60_0;
                        stackOut_60_1 = 1;
                        stackIn_62_0 = stackOut_60_0;
                        stackIn_62_1 = stackOut_60_1;
                        break L13;
                      }
                    }
                    ma.a(stackIn_62_0, stackIn_62_1 != 0);
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } else {
          L14: {
            this.d((byte) -75, param0);
            ((ec) this).field_u = ((ec) this).field_H[param0];
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L14;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L14;
            }
          }
          ((ec) this).field_w = stackIn_4_1 != 0;
          return;
        }
    }

    private final int a(byte param0, int param1) {
        if (!(((ec) this).field_J[param1] != 23)) {
            return 448;
        }
        if (param0 > -123) {
            ((ec) this).a((byte) -56, true);
        }
        return 35 * (1 - -param1) + 8;
    }

    ec(int param0, int[] param1, hj[] param2, String[] param3, String[] param4, String param5, int param6) {
        int var8 = 0;
        ((ec) this).field_S = new int[]{0, 240, 140, 240};
        ((ec) this).field_K = new int[]{0, 240, 140, 240};
        ((ec) this).field_F = new int[4][];
        ((ec) this).field_o = new hj[4][];
        ((ec) this).field_X = new String[4][];
        ((ec) this).field_G = new String[4][];
        ((ec) this).field_E = param0;
        ((ec) this).field_J = em.field_i[param0];
        ((ec) this).field_x = new float[((ec) this).field_J.length];
        ((ec) this).field_I = new int[((ec) this).field_J.length];
        ((ec) this).field_T = new int[4];
        ((ec) this).field_B = new int[4];
        ((ec) this).field_V = new int[4];
        ((ec) this).field_A = new float[4];
        ((ec) this).field_N = new int[4];
        ((ec) this).field_H = new int[4];
        ((ec) this).field_Q = new String[4];
        ((ec) this).field_p = new int[4];
        ((ec) this).field_L = qe.field_g[param0];
        for (var8 = 0; (var8 ^ -1) > -5; var8++) {
            ((ec) this).field_V[var8] = 0;
            ((ec) this).field_A[var8] = 0.0f;
            ((ec) this).field_p[var8] = 0;
            ((ec) this).field_H[var8] = -1;
            ((ec) this).field_N[var8] = -1;
        }
        ((ec) this).field_F[0] = param1;
        ((ec) this).field_o[0] = param2;
        ((ec) this).field_X[0] = param3;
        ((ec) this).field_G[0] = param4;
        if (pj.b((byte) 93)) {
            ((ec) this).field_O = new String[]{cc.field_C[mi.field_d], null, cd.field_c};
        } else {
            ((ec) this).field_O = new String[]{cc.field_C[mi.field_d], cd.field_c};
        }
        ((ec) this).field_Q[0] = param5;
        ((ec) this).field_T[0] = param6;
        ((ec) this).field_H[0] = -1;
        ((ec) this).field_a = 1;
        ((ec) this).field_N[0] = param1[0];
        this.a(0, (byte) -122);
        ((ec) this).a((byte) 69, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = 0;
    }
}

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
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
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
            L4: {
              if (pj.b((byte) 116)) {
                break L4;
              } else {
                if (((ec) this).field_a <= 1) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            stackOut_14_0 = 1;
            stackIn_16_0 = stackOut_14_0;
            break L3;
          }
          L5: {
            var2 = stackIn_16_0;
            if (((ec) this).field_a > 1) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L5;
            } else {
              stackOut_17_0 = 2;
              stackIn_19_0 = stackOut_17_0;
              break L5;
            }
          }
          L6: {
            L7: {
              var3 = stackIn_19_0;
              if (aa.field_n == 98) {
                int fieldTemp$4 = ((ec) this).field_q - 1;
                ((ec) this).field_q = ((ec) this).field_q - 1;
                if (0 > fieldTemp$4) {
                  if (1 == ((ec) this).field_Y) {
                    L8: {
                      if (((ec) this).field_R == -1) {
                        ((ec) this).field_R = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    ((ec) this).field_q = ((ec) this).field_c;
                    ((ec) this).field_Y = -1;
                    break L7;
                  } else {
                    L9: {
                      if (0 != ((ec) this).field_Y) {
                        break L9;
                      } else {
                        if (var2 == 0) {
                          break L9;
                        } else {
                          ((ec) this).field_Y = 1;
                          ((ec) this).field_Z = var3;
                          ((ec) this).field_q = -1;
                          break L6;
                        }
                      }
                    }
                    ((ec) this).field_Y = 0;
                    ((ec) this).field_q = -1;
                    break L6;
                  }
                } else {
                  ((ec) this).field_Y = -1;
                  ((ec) this).field_g = true;
                  if (((ec) this).field_F[((ec) this).field_q].length == ((ec) this).field_F[((ec) this).field_q + 1].length) {
                    break L7;
                  } else {
                    L10: {
                      var4 = ((ec) this).field_F[((ec) this).field_q].length - ((ec) this).field_F[1 + ((ec) this).field_q].length;
                      ((ec) this).field_R = ((ec) this).field_R + var4 / 2;
                      if (0 <= ((ec) this).field_R) {
                        break L10;
                      } else {
                        ((ec) this).field_R = 0;
                        break L10;
                      }
                    }
                    if (((ec) this).field_R <= ((ec) this).field_F[((ec) this).field_q].length + -1) {
                      break L6;
                    } else {
                      ((ec) this).field_R = -1 + ((ec) this).field_F[((ec) this).field_q].length;
                      break L6;
                    }
                  }
                }
              } else {
                if (aa.field_n != 84) {
                  if (99 == aa.field_n) {
                    L11: {
                      if (-1 == ((ec) this).field_q) {
                        break L11;
                      } else {
                        int fieldTemp$5 = ((ec) this).field_q + 1;
                        ((ec) this).field_q = ((ec) this).field_q + 1;
                        if (~fieldTemp$5 <= ~((ec) this).field_a) {
                          break L11;
                        } else {
                          ((ec) this).field_g = true;
                          ((ec) this).field_Y = -1;
                          if (((ec) this).field_F[((ec) this).field_q].length == ((ec) this).field_F[-1 + ((ec) this).field_q].length) {
                            break L7;
                          } else {
                            L12: {
                              var4 = -((ec) this).field_F[-1 + ((ec) this).field_q].length + ((ec) this).field_F[((ec) this).field_q].length;
                              ((ec) this).field_R = ((ec) this).field_R + var4 / 2;
                              if (((ec) this).field_R >= 0) {
                                break L12;
                              } else {
                                ((ec) this).field_R = 0;
                                break L12;
                              }
                            }
                            if (~(-1 + ((ec) this).field_F[((ec) this).field_q].length) <= ~((ec) this).field_R) {
                              break L6;
                            } else {
                              ((ec) this).field_R = ((ec) this).field_F[((ec) this).field_q].length - 1;
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    if (((ec) this).field_Y != 0) {
                      L13: {
                        if (((ec) this).field_Y == 1) {
                          break L13;
                        } else {
                          if (var2 != 0) {
                            ((ec) this).field_q = -1;
                            ((ec) this).field_Z = var3;
                            ((ec) this).field_Y = 1;
                            break L6;
                          } else {
                            break L13;
                          }
                        }
                      }
                      ((ec) this).field_q = -1;
                      ((ec) this).field_Y = 0;
                      break L6;
                    } else {
                      ((ec) this).field_q = 0;
                      ((ec) this).field_Y = -1;
                      if (((ec) this).field_R != -1) {
                        break L7;
                      } else {
                        ((ec) this).field_R = 0;
                        break L6;
                      }
                    }
                  } else {
                    L14: {
                      if (aa.field_n != 1) {
                        break L14;
                      } else {
                        if (!lk.field_g[82]) {
                          break L14;
                        } else {
                          if (!mg.field_c) {
                            break L14;
                          } else {
                            l.field_b = true;
                            hk.field_d = -1 + pc.field_l[3];
                            ao.field_b = 3;
                            h.b((byte) -78);
                            this.d((byte) -77, 0);
                            break L6;
                          }
                        }
                      }
                    }
                    if (((ec) this).field_Y != -1) {
                      L15: {
                        if (aa.field_n == 96) {
                          this.a(((ec) this).field_Y, ((ec) this).field_J[((ec) this).field_Y], 1, -45);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      if (97 != aa.field_n) {
                        break L7;
                      } else {
                        this.a(((ec) this).field_Y, ((ec) this).field_J[((ec) this).field_Y], 0, 3);
                        break L6;
                      }
                    } else {
                      if (((ec) this).field_q != -1) {
                        L16: {
                          if (aa.field_n != 96) {
                            break L16;
                          } else {
                            int fieldTemp$6 = ((ec) this).field_R - 1;
                            ((ec) this).field_R = ((ec) this).field_R - 1;
                            if (fieldTemp$6 < 0) {
                              ((ec) this).field_R = ((ec) this).field_R + 1;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        }
                        if (97 == aa.field_n) {
                          int fieldTemp$7 = ((ec) this).field_R + 1;
                          ((ec) this).field_R = ((ec) this).field_R + 1;
                          if (~fieldTemp$7 > ~((ec) this).field_F[((ec) this).field_q].length) {
                            break L7;
                          } else {
                            ((ec) this).field_R = ((ec) this).field_R - 1;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                } else {
                  if (((ec) this).field_Y != -1) {
                    this.a(((ec) this).field_Y, ((ec) this).field_J[((ec) this).field_Y], 2, -79);
                    break L6;
                  } else {
                    if (((ec) this).field_q == -1) {
                      break L6;
                    } else {
                      if (((ec) this).field_R != -1) {
                        this.b(((ec) this).field_R, ((ec) this).field_q, 16777215);
                        this.a(((ec) this).field_q, true, (byte) 122, false);
                        ((ec) this).field_g = true;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
            }
            break L6;
          }
          return;
        }
    }

    final boolean b(byte param0) {
        int var2 = 78 / ((param0 - 19) / 59);
        return ((ec) this).field_P == 3 ? true : false;
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
          if (((ec) this).field_P != 1) {
            break L0;
          } else {
            L1: {
              L2: {
                var2 = this.d(rf.field_X, -110, nc.field_g);
                if (var2 != -1) {
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
                    if (var4 >= 102) {
                      break L3;
                    } else {
                      var6 = 0;
                      L4: while (true) {
                        if (((ec) this).field_F[var3].length <= var6) {
                          break L3;
                        } else {
                          var7 = nc.field_g + -this.a(var3, 4, var6);
                          if (var7 > 24) {
                            if (var7 < 136) {
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
              if (((ec) this).field_P == 2) {
                ((ec) this).field_W = 0;
                ((ec) this).field_P = 3;
                ((ec) this).field_r = (float)((ec) this).field_M;
                return;
              } else {
                if (((ec) this).field_Y == -1) {
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
            if (nc.field_g == -1) {
              break L9;
            } else {
              ((ec) this).field_q = this.a(jb.field_U, false);
              if (((ec) this).field_q < 0) {
                break L9;
              } else {
                if (((ec) this).field_q < ((ec) this).field_a) {
                  var2 = jb.field_U - this.c((byte) -113, ((ec) this).field_q);
                  if (var2 <= 18) {
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
                          if (var4 > 24) {
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
            if (((ec) this).field_R == -1) {
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
            if (var2 >= 4) {
              var2 = 0;
              if (param0 == -55) {
                L1: {
                  if (((ec) this).field_P != 2) {
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
        var3 = -1 + ((ec) this).field_a;
        L0: while (true) {
          if (var3 < 0) {
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
    }

    private final int a(int param0, int param1, int param2) {
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
        for (var3 = 0; var3 < 4; var3++) {
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
        if (param0 < 0) {
            param0 = 0;
        }
        if (!(((ec) this).field_F[param1].length > param0)) {
            param0 = -1 + ((ec) this).field_F[param1].length;
        }
        ((ec) this).field_H[param1] = param0;
        ((ec) this).field_N[param1] = ((ec) this).field_F[param1][param0];
        this.c(param1, -1, param0 * 160 - -80);
    }

    final static void b(int param0, byte param1) {
        hl var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        fl var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            var4 = (fl) (Object) pd.field_e.b((byte) 125);
            L1: while (true) {
              if (var4 == null) {
                var2 = oc.field_d.b((byte) 121);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    q.a(6, 60);
                    var2 = oc.field_d.c((byte) 124);
                    continue L2;
                  }
                }
              } else {
                om.a(27391, var4, 6);
                var4 = (fl) (Object) pd.field_e.c((byte) -89);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2_ref, "ec.LB(" + 6 + ',' + 51 + ')');
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
                  ui discarded$4 = bd.a(17405, 64, 0, j.field_c.field_f);
                  ui discarded$5 = bd.a(param0 + 17514, 64, 256, j.field_c.field_h);
                  break L1;
                } else {
                  break L1;
                }
              }
              int fieldTemp$6 = ((ec) this).field_W + 1;
              ((ec) this).field_W = ((ec) this).field_W + 1;
              if (fieldTemp$6 == 5 * ((ec) this).field_J.length + 50) {
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
                int fieldTemp$7 = ((ec) this).field_W + 1;
                ((ec) this).field_W = ((ec) this).field_W + 1;
                if (-260.0 <= (double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)(fieldTemp$7 + -5))))) {
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
            if (((ec) this).field_u == -1) {
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
        if (((ec) this).field_P != 2) {
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
        RuntimeException var9 = null;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
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
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              ((ec) this).field_F[((ec) this).field_a] = param2;
              ((ec) this).field_o[((ec) this).field_a] = param3;
              ((ec) this).field_X[((ec) this).field_a] = param6;
              ((ec) this).field_G[((ec) this).field_a] = param5;
              ((ec) this).field_Q[((ec) this).field_a] = param0;
              ((ec) this).field_T[((ec) this).field_a] = param1;
              ((ec) this).field_H[((ec) this).field_a] = -1;
              ((ec) this).field_N[((ec) this).field_a] = -1;
              if (!param4) {
                break L1;
              } else {
                ((ec) this).field_q = ((ec) this).field_a;
                ((ec) this).field_R = 0;
                break L1;
              }
            }
            this.a(((ec) this).field_a, (byte) 126);
            int fieldTemp$1 = ((ec) this).field_a;
            ((ec) this).field_a = ((ec) this).field_a + 1;
            ((ec) this).field_c = fieldTemp$1;
            om.a(new String[2][], param7 ^ 374, 13);
            ((ec) this).field_M = -(112 * (((ec) this).field_a + -1)) + param7;
            ((ec) this).field_u = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9;
            stackOut_4_1 = new StringBuilder().append("ec.FB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param4).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param7 + ')');
        }
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
        var11 = HoldTheLine.field_D;
        var16 = ((ec) this).field_F[param1];
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var3 = var13;
        var4 = ((ec) this).field_o[param1];
        var5 = ((ec) this).field_X[param1];
        if (var3 != null) {
          var6 = this.e((byte) 17, param1) + 24;
          var7 = this.c((byte) -113, param1);
          var8 = 18 + var7;
          var9 = (424 + -var7) * 256 / 112;
          if (16 >= var9) {
            return;
          } else {
            L0: {
              if (var9 >= 256) {
                hh.field_e.b(0, var7);
                var12 = 0;
                var10 = var12;
                L1: while (true) {
                  if (var12 >= var16.length) {
                    break L0;
                  } else {
                    L2: {
                      L3: {
                        if (param1 != ((ec) this).field_q) {
                          break L3;
                        } else {
                          if (((ec) this).field_R != var12) {
                            break L3;
                          } else {
                            if (((ec) this).field_Y != -1) {
                              break L3;
                            } else {
                              tc.c(-5 + var6, -5 + var8, 121, 94, 16744576, 128);
                              var4[var12].b(var6, var8);
                              break L2;
                            }
                          }
                        }
                      }
                      L4: {
                        if (((ec) this).field_H[param1] != var12) {
                          break L4;
                        } else {
                          if (((ec) this).field_Y == -1) {
                            tc.c(var6 + -5, -5 + var8, 121, 94, 16777215, 128);
                            var4[var12].b(var6, var8);
                            if (((ec) this).field_B[param1] <= 0) {
                              break L2;
                            } else {
                              if ((-((ec) this).field_B[param1] + 90) % 30 > 15) {
                                break L2;
                              } else {
                                tc.c(var6, var8, 111, 84, 16777215, 128);
                                break L2;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4[var12].b(var6, var8);
                      o.a(128, 84, var8, 128, 111, -4441, var6);
                      break L2;
                    }
                    wb.a(20, var5[var12], 4, 2, 111, var8, var6, 74, -1, 1, HoldTheLine.field_F);
                    var6 += 160;
                    var12++;
                    continue L1;
                  }
                }
              } else {
                hh.field_e.d(0, var7, var9);
                var10 = 0;
                L5: while (true) {
                  if (var10 >= var16.length) {
                    break L0;
                  } else {
                    L6: {
                      L7: {
                        if (var10 != ((ec) this).field_H[param1]) {
                          break L7;
                        } else {
                          if (((ec) this).field_Y == -1) {
                            tc.c(var6 - 5, -5 + var8, 121, 94, 16777215, var9 >> 1);
                            var4[var10].d(var6, var8, var9);
                            if (((ec) this).field_B[param1] <= 0) {
                              break L6;
                            } else {
                              if ((-((ec) this).field_B[param1] + 90) % 30 > 15) {
                                break L6;
                              } else {
                                tc.c(var6, var8, 111, 84, 16777215, var9 >> 1);
                                break L6;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (((ec) this).field_q != param1) {
                          break L8;
                        } else {
                          if (((ec) this).field_R != var10) {
                            break L8;
                          } else {
                            if (((ec) this).field_Y == -1) {
                              tc.c(-5 + var6, -5 + var8, 121, 94, 16777215, var9 >> 1);
                              var4[var10].d(var6, var8, var9);
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      var4[var10].d(var6, var8, var9);
                      o.a(128, 84, var8, 128, 111, -4441, var6);
                      break L6;
                    }
                    wb.a(20, var5[var10], 4, 2, 111, var8, var6, 74, -1, 1, HoldTheLine.field_F);
                    var6 += 160;
                    var10++;
                    continue L5;
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
        if (!(((ec) this).field_V[param0] > 640)) {
            ((ec) this).field_p[param0] = (-160 + ((ec) this).field_V[param0]) / 2;
            return;
        }
        int var4 = -80 + param2;
        if (var4 < 240) {
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
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String[] var7_array = null;
        String var8 = null;
        String var9 = null;
        String[] var9_array = null;
        int var10 = 0;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        String[] stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int[] stackIn_19_0 = null;
        String[] stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int[] stackIn_20_0 = null;
        String[] stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        StringBuilder stackIn_28_0 = null;
        StringBuilder stackIn_29_0 = null;
        StringBuilder stackIn_30_0 = null;
        String stackIn_30_1 = null;
        StringBuilder stackIn_33_0 = null;
        StringBuilder stackIn_34_0 = null;
        StringBuilder stackIn_35_0 = null;
        String stackIn_35_1 = null;
        StringBuilder stackIn_37_0 = null;
        StringBuilder stackIn_38_0 = null;
        StringBuilder stackIn_39_0 = null;
        String stackIn_39_1 = null;
        String[] stackIn_40_0 = null;
        String[] stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        String[] stackIn_41_0 = null;
        String[] stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        String[] stackIn_42_0 = null;
        String[] stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        String stackIn_42_3 = null;
        int[] stackIn_43_0 = null;
        String[] stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int[] stackIn_44_0 = null;
        String[] stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        int[] stackIn_45_0 = null;
        String[] stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        StringBuilder stackOut_32_0 = null;
        StringBuilder stackOut_34_0 = null;
        String stackOut_34_1 = null;
        StringBuilder stackOut_33_0 = null;
        String stackOut_33_1 = null;
        StringBuilder stackOut_27_0 = null;
        StringBuilder stackOut_29_0 = null;
        String stackOut_29_1 = null;
        StringBuilder stackOut_28_0 = null;
        String stackOut_28_1 = null;
        StringBuilder stackOut_36_0 = null;
        StringBuilder stackOut_38_0 = null;
        String stackOut_38_1 = null;
        StringBuilder stackOut_37_0 = null;
        String stackOut_37_1 = null;
        String[] stackOut_39_0 = null;
        String[] stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        String[] stackOut_41_0 = null;
        String[] stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        String stackOut_41_3 = null;
        String[] stackOut_40_0 = null;
        String[] stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        String stackOut_40_3 = null;
        int[] stackOut_42_0 = null;
        String[] stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int[] stackOut_44_0 = null;
        String[] stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int[] stackOut_43_0 = null;
        String[] stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        String stackOut_13_0 = null;
        String stackOut_12_0 = null;
        String stackOut_16_0 = null;
        String stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        String[] stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int[] stackOut_19_0 = null;
        String[] stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int[] stackOut_18_0 = null;
        String[] stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        L0: {
          var10 = HoldTheLine.field_D;
          var5 = 0;
          if (0 == ((ec) this).field_P) {
            var5 = 50 + -((ec) this).field_W + 5 * param3;
            break L0;
          } else {
            if (((ec) this).field_P == 2) {
              var5 = ((ec) this).field_W - (-25 - -(5 * (((ec) this).field_J.length - param3)));
              break L0;
            } else {
              break L0;
            }
          }
        }
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
          if (param1 == 22) {
            L3: {
              if (7 != mi.field_d) {
                if (mi.field_d == 0) {
                  L4: {
                    stackOut_32_0 = new StringBuilder();
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (!wb.field_c) {
                      stackOut_34_0 = (StringBuilder) (Object) stackIn_34_0;
                      stackOut_34_1 = tf.field_r;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      break L4;
                    } else {
                      stackOut_33_0 = (StringBuilder) (Object) stackIn_33_0;
                      stackOut_33_1 = h.field_e;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      break L4;
                    }
                  }
                  var7 = stackIn_35_1 + " " + bo.field_a;
                  break L3;
                } else {
                  if (mi.field_d == 1) {
                    var7 = cj.field_M;
                    break L3;
                  } else {
                    if (mi.field_d == 2) {
                      L5: {
                        stackOut_27_0 = new StringBuilder();
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if (wb.field_c) {
                          stackOut_29_0 = (StringBuilder) (Object) stackIn_29_0;
                          stackOut_29_1 = h.field_e;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          break L5;
                        } else {
                          stackOut_28_0 = (StringBuilder) (Object) stackIn_28_0;
                          stackOut_28_1 = tf.field_r;
                          stackIn_30_0 = stackOut_28_0;
                          stackIn_30_1 = stackOut_28_1;
                          break L5;
                        }
                      }
                      var7 = stackIn_30_1 + " " + qm.field_g;
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
              stackOut_36_0 = new StringBuilder().append(uk.field_c[21]);
              stackIn_38_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if (em.field_o) {
                stackOut_38_0 = (StringBuilder) (Object) stackIn_38_0;
                stackOut_38_1 = hf.field_l;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                break L6;
              } else {
                stackOut_37_0 = (StringBuilder) (Object) stackIn_37_0;
                stackOut_37_1 = dl.field_h;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                break L6;
              }
            }
            L7: {
              var8 = stackIn_39_1;
              stackOut_39_0 = new String[3];
              stackOut_39_1 = new String[3];
              stackOut_39_2 = 2;
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              if (((ec) this).field_t) {
                stackOut_41_0 = (String[]) (Object) stackIn_41_0;
                stackOut_41_1 = (String[]) (Object) stackIn_41_1;
                stackOut_41_2 = stackIn_41_2;
                stackOut_41_3 = (String) var8;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                stackIn_42_2 = stackOut_41_2;
                stackIn_42_3 = stackOut_41_3;
                break L7;
              } else {
                stackOut_40_0 = (String[]) (Object) stackIn_40_0;
                stackOut_40_1 = (String[]) (Object) stackIn_40_1;
                stackOut_40_2 = stackIn_40_2;
                stackOut_40_3 = "";
                stackIn_42_0 = stackOut_40_0;
                stackIn_42_1 = stackOut_40_1;
                stackIn_42_2 = stackOut_40_2;
                stackIn_42_3 = stackOut_40_3;
                break L7;
              }
            }
            L8: {
              stackIn_42_1[stackIn_42_2] = stackIn_42_3;
              var9_array = stackIn_42_0;
              stackOut_42_0 = ((ec) this).field_K;
              stackOut_42_1 = (String[]) var9_array;
              stackOut_42_2 = 120;
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              if (~((ec) this).field_Y == ~param3) {
                stackOut_44_0 = (int[]) (Object) stackIn_44_0;
                stackOut_44_1 = (String[]) (Object) stackIn_44_1;
                stackOut_44_2 = stackIn_44_2;
                stackOut_44_3 = ((ec) this).field_ab;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                stackIn_45_2 = stackOut_44_2;
                stackIn_45_3 = stackOut_44_3;
                break L8;
              } else {
                stackOut_43_0 = (int[]) (Object) stackIn_43_0;
                stackOut_43_1 = (String[]) (Object) stackIn_43_1;
                stackOut_43_2 = stackIn_43_2;
                stackOut_43_3 = -1;
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_45_2 = stackOut_43_2;
                stackIn_45_3 = stackOut_43_3;
                break L8;
              }
            }
            fk.a(stackIn_45_0, stackIn_45_1, stackIn_45_2, stackIn_45_3, param0, -1, var6);
            break L2;
          } else {
            if (param1 == 23) {
              L9: {
                if (((ec) this).field_a > 1) {
                  stackOut_13_0 = lg.field_r;
                  stackIn_14_0 = stackOut_13_0;
                  break L9;
                } else {
                  stackOut_12_0 = "";
                  stackIn_14_0 = stackOut_12_0;
                  break L9;
                }
              }
              L10: {
                var8 = stackIn_14_0;
                var7 = var8;
                var7 = var8;
                if (pj.b((byte) 124)) {
                  stackOut_16_0 = uk.field_c[9];
                  stackIn_17_0 = stackOut_16_0;
                  break L10;
                } else {
                  stackOut_15_0 = "";
                  stackIn_17_0 = stackOut_15_0;
                  break L10;
                }
              }
              L11: {
                var9 = stackIn_17_0;
                var7 = var9;
                var7 = var9;
                var7_array = new String[]{var8, "", var9};
                stackOut_17_0 = ((ec) this).field_K;
                stackOut_17_1 = (String[]) var7_array;
                stackOut_17_2 = 72;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                if (((ec) this).field_Y != param3) {
                  stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                  stackOut_19_1 = (String[]) (Object) stackIn_19_1;
                  stackOut_19_2 = stackIn_19_2;
                  stackOut_19_3 = -1;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  stackIn_20_3 = stackOut_19_3;
                  break L11;
                } else {
                  stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                  stackOut_18_1 = (String[]) (Object) stackIn_18_1;
                  stackOut_18_2 = stackIn_18_2;
                  stackOut_18_3 = ((ec) this).field_Z;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_20_3 = stackOut_18_3;
                  break L11;
                }
              }
              fk.a(stackIn_20_0, stackIn_20_1, stackIn_20_2, stackIn_20_3, param0, -1, var6);
              break L2;
            } else {
              break L2;
            }
          }
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
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_98_0 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_104_0 = null;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        Object stackIn_121_0 = null;
        Object stackIn_122_0 = null;
        Object stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        Object stackIn_127_0 = null;
        Object stackIn_128_0 = null;
        Object stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_97_0 = 0;
        Object stackOut_102_0 = null;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        Object stackOut_120_0 = null;
        Object stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        Object stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        Object stackOut_126_0 = null;
        Object stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        Object stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        L0: {
          var14 = HoldTheLine.field_D;
          if (param2 != 1) {
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
          if (param2 != 0) {
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
          L3: {
            var6 = stackIn_6_0;
            var9 = 116 / ((param3 - 55) / 51);
            if (param2 == 2) {
              break L3;
            } else {
              if (param2 != 3) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                break L3;
              }
            }
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L2;
        }
        L4: {
          var7 = stackIn_11_0;
          if (param2 != 4) {
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L4;
          } else {
            stackOut_12_0 = 1;
            stackIn_14_0 = stackOut_12_0;
            break L4;
          }
        }
        L5: {
          L6: {
            var8 = stackIn_14_0;
            if (param2 == 2) {
              break L6;
            } else {
              if (param2 != 3) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                break L6;
              }
            }
          }
          stackOut_17_0 = 1;
          stackIn_19_0 = stackOut_17_0;
          break L5;
        }
        L7: {
          L8: {
            var10 = stackIn_19_0;
            if (param2 == 3) {
              break L8;
            } else {
              if (param2 != 4) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L7;
              } else {
                break L8;
              }
            }
          }
          stackOut_22_0 = 1;
          stackIn_24_0 = stackOut_22_0;
          break L7;
        }
        L9: {
          var11 = stackIn_24_0;
          ui discarded$3 = qf.a(293, cf.field_r);
          if (param1 != 22) {
            if (param1 == 23) {
              L10: {
                if (0 < ((ec) this).field_c) {
                  stackOut_93_0 = 0;
                  stackIn_94_0 = stackOut_93_0;
                  break L10;
                } else {
                  stackOut_92_0 = 2;
                  stackIn_94_0 = stackOut_92_0;
                  break L10;
                }
              }
              L11: {
                L12: {
                  var12 = stackIn_94_0;
                  if (!pj.b((byte) 90)) {
                    break L12;
                  } else {
                    if (((ec) this).field_c <= 0) {
                      break L12;
                    } else {
                      stackOut_96_0 = 1;
                      stackIn_98_0 = stackOut_96_0;
                      break L11;
                    }
                  }
                }
                stackOut_97_0 = 0;
                stackIn_98_0 = stackOut_97_0;
                break L11;
              }
              L13: {
                L14: {
                  var13 = stackIn_98_0;
                  if (var5 != 0) {
                    break L14;
                  } else {
                    if (var6 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                if (var13 == 0) {
                  ((ec) this).field_Z = var12;
                  break L13;
                } else {
                  L15: {
                    stackOut_102_0 = this;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_103_0 = stackOut_102_0;
                    if (((ec) this).field_Z != 0) {
                      stackOut_104_0 = this;
                      stackOut_104_1 = 0;
                      stackIn_105_0 = stackOut_104_0;
                      stackIn_105_1 = stackOut_104_1;
                      break L15;
                    } else {
                      stackOut_103_0 = this;
                      stackOut_103_1 = 2;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      break L15;
                    }
                  }
                  ((ec) this).field_Z = stackIn_105_1;
                  break L13;
                }
              }
              L16: {
                if (var10 != 0) {
                  if (0 == ((ec) this).field_Z) {
                    if (((ec) this).field_c != 0) {
                      this.d((byte) -92, -1 + ((ec) this).field_c);
                      ((ec) this).field_g = true;
                      ((ec) this).field_Y = -1;
                      break L16;
                    } else {
                      break L16;
                    }
                  } else {
                    if (((ec) this).field_Z != 2) {
                      break L16;
                    } else {
                      if (pj.b((byte) 113)) {
                        i.a((byte) 60, true);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  }
                } else {
                  break L16;
                }
              }
              if (var13 == 0) {
                L17: {
                  if (var7 != 0) {
                    break L17;
                  } else {
                    if (var8 != 0) {
                      break L17;
                    } else {
                      break L9;
                    }
                  }
                }
                ((ec) this).field_Z = var12;
                break L9;
              } else {
                L18: {
                  if (var7 != 0) {
                    L19: {
                      stackOut_120_0 = this;
                      stackIn_122_0 = stackOut_120_0;
                      stackIn_121_0 = stackOut_120_0;
                      if (((ec) this).field_Z == 2) {
                        stackOut_122_0 = this;
                        stackOut_122_1 = 0;
                        stackIn_123_0 = stackOut_122_0;
                        stackIn_123_1 = stackOut_122_1;
                        break L19;
                      } else {
                        stackOut_121_0 = this;
                        stackOut_121_1 = 2;
                        stackIn_123_0 = stackOut_121_0;
                        stackIn_123_1 = stackOut_121_1;
                        break L19;
                      }
                    }
                    ((ec) this).field_Z = stackIn_123_1;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                if (var8 != 0) {
                  L20: {
                    stackOut_126_0 = this;
                    stackIn_128_0 = stackOut_126_0;
                    stackIn_127_0 = stackOut_126_0;
                    if (((ec) this).field_Z == 0) {
                      stackOut_128_0 = this;
                      stackOut_128_1 = 2;
                      stackIn_129_0 = stackOut_128_0;
                      stackIn_129_1 = stackOut_128_1;
                      break L20;
                    } else {
                      stackOut_127_0 = this;
                      stackOut_127_1 = 0;
                      stackIn_129_0 = stackOut_127_0;
                      stackIn_129_1 = stackOut_127_1;
                      break L20;
                    }
                  }
                  ((ec) this).field_Z = stackIn_129_1;
                  break L9;
                } else {
                  break L9;
                }
              }
            } else {
              break L9;
            }
          } else {
            L21: {
              if (((ec) this).field_t) {
                stackOut_27_0 = 2;
                stackIn_28_0 = stackOut_27_0;
                break L21;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L21;
              }
            }
            L22: {
              var12 = stackIn_28_0;
              if (var5 == 0) {
                if (var6 == 0) {
                  break L22;
                } else {
                  int fieldTemp$4 = ((ec) this).field_ab + 1;
                  ((ec) this).field_ab = ((ec) this).field_ab + 1;
                  if (~var12 > ~fieldTemp$4) {
                    ((ec) this).field_ab = 0;
                    break L22;
                  } else {
                    break L22;
                  }
                }
              } else {
                int fieldTemp$5 = ((ec) this).field_ab - 1;
                ((ec) this).field_ab = ((ec) this).field_ab - 1;
                if (0 <= fieldTemp$5) {
                  break L22;
                } else {
                  ((ec) this).field_ab = var12;
                  break L22;
                }
              }
            }
            L23: {
              if (((ec) this).field_ab == 0) {
                L24: {
                  if (var7 != 0) {
                    if (mi.field_d == 7) {
                      wb.field_c = false;
                      mi.field_d = 0;
                      break L24;
                    } else {
                      if (mi.field_d == 0) {
                        L25: {
                          if (wb.field_c) {
                            mi.field_d = 1;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (wb.field_c) {
                            stackOut_81_0 = 0;
                            stackIn_82_0 = stackOut_81_0;
                            break L26;
                          } else {
                            stackOut_80_0 = 1;
                            stackIn_82_0 = stackOut_80_0;
                            break L26;
                          }
                        }
                        wb.field_c = stackIn_82_0 != 0;
                        break L24;
                      } else {
                        if (1 != mi.field_d) {
                          if (2 == mi.field_d) {
                            L27: {
                              if (wb.field_c) {
                                mi.field_d = 7;
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            L28: {
                              if (wb.field_c) {
                                stackOut_74_0 = 0;
                                stackIn_75_0 = stackOut_74_0;
                                break L28;
                              } else {
                                stackOut_73_0 = 1;
                                stackIn_75_0 = stackOut_73_0;
                                break L28;
                              }
                            }
                            wb.field_c = stackIn_75_0 != 0;
                            break L24;
                          } else {
                            break L24;
                          }
                        } else {
                          mi.field_d = 2;
                          break L24;
                        }
                      }
                    }
                  } else {
                    if (var8 == 0) {
                      break L24;
                    } else {
                      if (7 != mi.field_d) {
                        if (mi.field_d != 0) {
                          if (mi.field_d != 1) {
                            if (mi.field_d != 2) {
                              break L24;
                            } else {
                              L29: {
                                if (!wb.field_c) {
                                  mi.field_d = 1;
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              wb.field_c = false;
                              break L24;
                            }
                          } else {
                            mi.field_d = 0;
                            wb.field_c = true;
                            break L24;
                          }
                        } else {
                          L30: {
                            if (wb.field_c) {
                              break L30;
                            } else {
                              mi.field_d = 7;
                              break L30;
                            }
                          }
                          wb.field_c = false;
                          break L24;
                        }
                      } else {
                        wb.field_c = true;
                        mi.field_d = 2;
                        break L24;
                      }
                    }
                  }
                }
                L31: {
                  if (var7 != 0) {
                    break L31;
                  } else {
                    if (var8 == 0) {
                      break L23;
                    } else {
                      break L31;
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
                break L9;
              } else {
                if (1 != ((ec) this).field_ab) {
                  if (!((ec) this).field_t) {
                    break L23;
                  } else {
                    L32: {
                      if (var10 != 0) {
                        break L32;
                      } else {
                        if (var7 != 0) {
                          break L32;
                        } else {
                          if (var8 != 0) {
                            break L32;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    L33: {
                      if (em.field_o) {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        break L33;
                      } else {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        break L33;
                      }
                    }
                    em.field_o = stackIn_47_0 != 0;
                    break L9;
                  }
                } else {
                  if (var10 == 0) {
                    break L23;
                  } else {
                    wm.a(var11 != 0, false, 0);
                    break L9;
                  }
                }
              }
            }
            break L9;
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
                    if (param2 < 15) {
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
        ((ec) this).field_t = ((ec) this).field_t | (mi.field_d == 1 ? true : false);
        ((ec) this).field_t = ((ec) this).field_t & (mi.field_d != 7 ? true : false);
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
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        String stackIn_32_0 = null;
        String stackIn_45_0 = null;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        String stackOut_44_0 = null;
        String stackOut_43_0 = null;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var11 = HoldTheLine.field_D;
        ((ec) this).field_Y = -1;
        if (((ec) this).field_a + -1 <= param0) {
          ((ec) this).field_u = -1;
          ui discarded$1 = qf.a(293, cf.field_r);
          var5 = ((ec) this).field_H[param0];
          var6 = ((ec) this).field_N[param0];
          if (-1 == var5) {
            return;
          } else {
            L0: {
              L1: {
                ((ec) this).field_B[param0] = 90;
                if (mi.field_d == 7) {
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
                          stackOut_66_0 = -21383;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_67_0 = stackOut_66_0;
                          if (param1) {
                            stackOut_68_0 = stackIn_68_0;
                            stackOut_68_1 = 0;
                            stackIn_69_0 = stackOut_68_0;
                            stackIn_69_1 = stackOut_68_1;
                            break L2;
                          } else {
                            stackOut_67_0 = stackIn_67_0;
                            stackOut_67_1 = 1;
                            stackIn_69_0 = stackOut_67_0;
                            stackIn_69_1 = stackOut_67_1;
                            break L2;
                          }
                        }
                        ma.a(stackIn_69_0, stackIn_69_1 != 0);
                        break L1;
                      } else {
                        break L0;
                      }
                    } else {
                      break L0;
                    }
                  }
                } else {
                  L3: {
                    if (mi.field_d == 1) {
                      break L3;
                    } else {
                      if (mi.field_d == 0) {
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
                                var13 = new hj[]{ua.field_b.a(84, go.field_g[var8][0], 9, 111), ua.field_b.a(84, go.field_g[var8][1], 9, 111)};
                                if (!wb.field_c) {
                                  stackOut_31_0 = ui.field_m;
                                  stackIn_32_0 = stackOut_31_0;
                                  break L5;
                                } else {
                                  stackOut_30_0 = ui.field_m + " " + ac.field_g;
                                  stackIn_32_0 = stackOut_30_0;
                                  break L5;
                                }
                              }
                              var10 = stackIn_32_0;
                              this.a(var10, 16711680, go.field_g[var8], var13, param1, v.field_A[var8], sg.field_gb[var8], 312);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          bn.a(4 + cf.field_w, -118);
                          break L0;
                        } else {
                          if (1 != param0) {
                            if (param0 != 2) {
                              break L1;
                            } else {
                              if (!param3) {
                                L6: {
                                  ah.field_b = var6;
                                  stackOut_23_0 = -21383;
                                  stackIn_25_0 = stackOut_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  if (param1) {
                                    stackOut_25_0 = stackIn_25_0;
                                    stackOut_25_1 = 0;
                                    stackIn_26_0 = stackOut_25_0;
                                    stackIn_26_1 = stackOut_25_1;
                                    break L6;
                                  } else {
                                    stackOut_24_0 = stackIn_24_0;
                                    stackOut_24_1 = 1;
                                    stackIn_26_0 = stackOut_24_0;
                                    stackIn_26_1 = stackOut_24_1;
                                    break L6;
                                  }
                                }
                                ma.a(stackIn_26_0, stackIn_26_1 != 0);
                                break L0;
                              } else {
                                break L0;
                              }
                            }
                          } else {
                            t.field_l = var6;
                            if (wb.field_c) {
                              var7 = cf.field_w;
                              var12 = new hj[]{ua.field_b.a(84, go.field_g[var7][0] + 8, 9, 111), ua.field_b.a(84, 8 - -go.field_g[var7][1], 9, 111)};
                              this.a(ui.field_m + " " + qe.field_e, 65280, go.field_g[var7], var12, param1, v.field_A[var7], sg.field_gb[var7], 312);
                              break L0;
                            } else {
                              if (param3) {
                                break L0;
                              } else {
                                L7: {
                                  stackOut_15_0 = -21383;
                                  stackIn_17_0 = stackOut_15_0;
                                  stackIn_16_0 = stackOut_15_0;
                                  if (param1) {
                                    stackOut_17_0 = stackIn_17_0;
                                    stackOut_17_1 = 0;
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    break L7;
                                  } else {
                                    stackOut_16_0 = stackIn_16_0;
                                    stackOut_16_1 = 1;
                                    stackIn_18_0 = stackOut_16_0;
                                    stackIn_18_1 = stackOut_16_1;
                                    break L7;
                                  }
                                }
                                ma.a(stackIn_18_0, stackIn_18_1 != 0);
                                break L0;
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
                      if (var7 == 0) {
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
                    if (param0 == 1) {
                      vg.field_P = var6;
                      var7 = kn.b((byte) -49).field_p;
                      if (gj.a(vg.field_P, -70, cf.field_w) == 0) {
                        L10: {
                          var14 = new hj[]{ua.field_b.a(84, go.field_g[var7][0], 9, 111), ua.field_b.a(84, go.field_g[var7][1], 9, 111)};
                          if (wb.field_c) {
                            stackOut_44_0 = ui.field_m + " " + ac.field_g;
                            stackIn_45_0 = stackOut_44_0;
                            break L10;
                          } else {
                            stackOut_43_0 = ui.field_m;
                            stackIn_45_0 = stackOut_43_0;
                            break L10;
                          }
                        }
                        var9 = stackIn_45_0;
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
                    if (param0 != 2) {
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
                            stackOut_50_0 = -21383;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_51_0 = stackOut_50_0;
                            if (param1) {
                              stackOut_52_0 = stackIn_52_0;
                              stackOut_52_1 = 0;
                              stackIn_53_0 = stackOut_52_0;
                              stackIn_53_1 = stackOut_52_1;
                              break L12;
                            } else {
                              stackOut_51_0 = stackIn_51_0;
                              stackOut_51_1 = 1;
                              stackIn_53_0 = stackOut_51_0;
                              stackIn_53_1 = stackOut_51_1;
                              break L12;
                            }
                          }
                          ma.a(stackIn_53_0, stackIn_53_1 != 0);
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
                        stackOut_57_0 = -21383;
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_58_0 = stackOut_57_0;
                        if (param1) {
                          stackOut_59_0 = stackIn_59_0;
                          stackOut_59_1 = 0;
                          stackIn_60_0 = stackOut_59_0;
                          stackIn_60_1 = stackOut_59_1;
                          break L13;
                        } else {
                          stackOut_58_0 = stackIn_58_0;
                          stackOut_58_1 = 1;
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_60_1 = stackOut_58_1;
                          break L13;
                        }
                      }
                      ma.a(stackIn_60_0, stackIn_60_1 != 0);
                      break L0;
                    }
                  }
                }
              }
              break L0;
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
        return 35 * (1 - -param1) + 8;
    }

    ec(int param0, int[] param1, hj[] param2, String[] param3, String[] param4, String param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        ((ec) this).field_S = new int[]{0, 240, 140, 240};
        ((ec) this).field_K = new int[]{0, 240, 140, 240};
        try {
          L0: {
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
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= 4) {
                L2: {
                  ((ec) this).field_F[0] = param1;
                  ((ec) this).field_o[0] = param2;
                  ((ec) this).field_X[0] = param3;
                  ((ec) this).field_G[0] = param4;
                  if (!pj.b((byte) 93)) {
                    ((ec) this).field_O = new String[]{cc.field_C[mi.field_d], cd.field_c};
                    break L2;
                  } else {
                    ((ec) this).field_O = new String[]{cc.field_C[mi.field_d], null, cd.field_c};
                    break L2;
                  }
                }
                ((ec) this).field_Q[0] = param5;
                ((ec) this).field_T[0] = param6;
                ((ec) this).field_H[0] = -1;
                ((ec) this).field_a = 1;
                ((ec) this).field_N[0] = param1[0];
                this.a(0, (byte) -122);
                ((ec) this).a((byte) 69, false);
                break L0;
              } else {
                ((ec) this).field_V[var8_int] = 0;
                ((ec) this).field_A[var8_int] = 0.0f;
                ((ec) this).field_p[var8_int] = 0;
                ((ec) this).field_H[var8_int] = -1;
                ((ec) this).field_N[var8_int] = -1;
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("ec.<init>(").append(param0).append(',');
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
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param5 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = 0;
    }
}

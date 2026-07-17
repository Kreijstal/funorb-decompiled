/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends bj {
    private int[] field_h;
    private int[] field_z;
    private int[] field_e;
    private int[] field_o;
    private short field_B;
    private int[] field_t;
    private int[] field_g;
    private int field_R;
    private int[] field_Q;
    private byte[] field_q;
    private int[] field_U;
    private int field_I;
    private byte[] field_C;
    private int[] field_O;
    private short[] field_M;
    private int field_p;
    private boolean field_L;
    private int field_u;
    private int[] field_N;
    private int[] field_P;
    private int[] field_A;
    private byte[] field_s;
    private static int[] field_D;
    private static int[] field_V;
    private static int[] field_K;
    private static int[] field_F;
    private static int[] field_J;
    private static int[] field_v;
    private static int[] field_l;
    private static int[] field_n;
    private static int[] field_i;
    private static int[] field_S;
    private static int[] field_r;
    private static int[] field_j;
    private static int[] field_f;
    private static int[] field_d;
    private static boolean[] field_k;
    private static int[] field_G;
    private static boolean field_T;
    private static int field_m;
    private static int[][] field_H;
    private static int[][] field_E;
    private static int[] field_y;
    private static boolean[] field_W;
    private static int[][] field_w;
    private static int[] field_x;

    private final void a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var1 = 32767;
        var2 = 32767;
        var3 = 32767;
        var4 = -32768;
        var5 = -32768;
        var6 = -32768;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        L0: while (true) {
          if (var9 >= ((sc) this).field_R) {
            ((sc) this).field_B = (short)(int)(Math.sqrt((double)var8) + 0.99);
            ((sc) this).field_L = true;
            return;
          } else {
            L1: {
              var10 = ((sc) this).field_P[var9];
              var11 = ((sc) this).field_e[var9];
              var12 = ((sc) this).field_N[var9];
              if (var10 >= var1) {
                break L1;
              } else {
                var1 = var10;
                break L1;
              }
            }
            L2: {
              if (var10 <= var4) {
                break L2;
              } else {
                var4 = var10;
                break L2;
              }
            }
            L3: {
              if (var11 >= var2) {
                break L3;
              } else {
                var2 = var11;
                break L3;
              }
            }
            L4: {
              if (var11 <= var5) {
                break L4;
              } else {
                var5 = var11;
                break L4;
              }
            }
            L5: {
              if (var12 >= var3) {
                break L5;
              } else {
                var3 = var12;
                break L5;
              }
            }
            L6: {
              if (var12 <= var6) {
                break L6;
              } else {
                var6 = var12;
                break L6;
              }
            }
            L7: {
              var13 = var10 * var10 + var12 * var12;
              if (var13 <= var7) {
                break L7;
              } else {
                var7 = var13;
                break L7;
              }
            }
            var13 = var13 + var11 * var11;
            if (var13 > var8) {
              var8 = var13;
              var9++;
              continue L0;
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    public static void b() {
        field_W = null;
        field_k = null;
        field_V = null;
        field_v = null;
        field_F = null;
        field_D = null;
        field_S = null;
        field_l = null;
        field_J = null;
        field_w = null;
        field_j = null;
        field_E = null;
        field_y = null;
        field_f = null;
        field_r = null;
        field_H = null;
        field_d = null;
        field_x = null;
        field_K = null;
        field_n = null;
        field_G = null;
        field_i = null;
    }

    private final static int c(int param0) {
        if (param0 < 2) {
            param0 = 2;
        } else {
            if (param0 > 126) {
                param0 = 126;
            }
        }
        return param0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7) {
        RuntimeException var10 = null;
        int var10_int = 0;
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
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        try {
          L0: {
            L1: {
              if (((sc) this).field_L) {
                break L1;
              } else {
                this.a();
                break L1;
              }
            }
            var10_int = cc.field_n;
            var11 = cc.field_p;
            var12 = cc.field_g[param0];
            var13 = cc.field_h[param0];
            var14 = cc.field_g[param1];
            var15 = cc.field_h[param1];
            var16 = cc.field_g[param2];
            var17 = cc.field_h[param2];
            var18 = cc.field_g[param3];
            var19 = cc.field_h[param3];
            var20 = param5 * var18 + param6 * var19 >> 16;
            var21 = 0;
            L2: while (true) {
              if (var21 >= ((sc) this).field_p) {
                L3: {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 0;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (param7 < 0L) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    break L3;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = 1;
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_17_1 = stackOut_14_1;
                    stackIn_17_2 = stackOut_14_2;
                    break L3;
                  }
                }
                this.a(stackIn_17_1 != 0, stackIn_17_2 != 0, param7, (int) ((sc) this).field_B, ((sc) this).field_B << 1);
                break L0;
              } else {
                L4: {
                  var22 = ((sc) this).field_P[var21];
                  var23 = ((sc) this).field_e[var21];
                  var24 = ((sc) this).field_N[var21];
                  if (param2 == 0) {
                    break L4;
                  } else {
                    var25 = var23 * var16 + var22 * var17 >> 16;
                    var23 = var23 * var17 - var22 * var16 >> 16;
                    var22 = var25;
                    break L4;
                  }
                }
                L5: {
                  if (param0 == 0) {
                    break L5;
                  } else {
                    var25 = var23 * var13 - var24 * var12 >> 16;
                    var24 = var23 * var12 + var24 * var13 >> 16;
                    var23 = var25;
                    break L5;
                  }
                }
                L6: {
                  if (param1 == 0) {
                    break L6;
                  } else {
                    var25 = var24 * var14 + var22 * var15 >> 16;
                    var24 = var24 * var15 - var22 * var14 >> 16;
                    var22 = var25;
                    break L6;
                  }
                }
                L7: {
                  var22 = var22 + param4;
                  var23 = var23 + param5;
                  var24 = var24 + param6;
                  var25 = var23 * var19 - var24 * var18 >> 16;
                  var24 = var23 * var18 + var24 * var19 >> 16;
                  var23 = var25;
                  field_F[var21] = var24 - var20;
                  field_V[var21] = var10_int + (var22 << 9) / var24;
                  field_v[var21] = var11 + (var23 << 9) / var24;
                  if (((sc) this).field_u <= 0) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var21++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            break L8;
          }
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param1 < param2) {
            if (param1 < param3) {
                if (param1 < param4) {
                    return false;
                }
            }
        }
        if (param1 > param2) {
            if (param1 > param3) {
                if (param1 > param4) {
                    return false;
                }
            }
        }
        if (param0 < param5) {
            if (param0 < param6) {
                if (param0 < param7) {
                    return false;
                }
            }
        }
        if (param0 > param5) {
            if (param0 > param6) {
                if (param0 > param7) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void a(boolean param0, boolean param1, long param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        int[] var14 = null;
        int var15_int = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int var29 = 0;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int stackIn_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        if (param4 < 1600) {
          L0: {
            var7 = 0;
            if (field_T) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_m = 0;
                      break L0;
                    } else {
                      field_j[var8] = 0;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  field_J[var8] = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= ((sc) this).field_I) {
              L4: {
                if (!field_T) {
                  if (((sc) this).field_C != null) {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= 12) {
                        var8 = param4 - 1;
                        L6: while (true) {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            L7: {
                              var9 = field_J[var8];
                              if (var9 <= 0) {
                                break L7;
                              } else {
                                L8: {
                                  if (var9 <= 64) {
                                    var10 = var9;
                                    break L8;
                                  } else {
                                    var10 = 64;
                                    break L8;
                                  }
                                }
                                var47 = field_w[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    var13 = var47[var12];
                                    var14_int = ((sc) this).field_C[var13];
                                    field_r[var14_int] = field_r[var14_int] + 1;
                                    var15_int = field_r[var14_int];
                                    field_H[var14_int][var15_int] = var13;
                                    if (var14_int >= 10) {
                                      if (var14_int != 10) {
                                        field_x[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      } else {
                                        field_d[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      }
                                    } else {
                                      field_K[var14_int] = field_K[var14_int] + var8;
                                      var12++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 > 64) {
                              var10 = field_J[var8] - 65;
                              var48 = field_E[var10];
                              var12 = 0;
                              L10: while (true) {
                                if (var12 < field_j[var10]) {
                                  var13 = var48[var12];
                                  var14_int = ((sc) this).field_C[var13];
                                  field_r[var14_int] = field_r[var14_int] + 1;
                                  var15_int = field_r[var14_int];
                                  field_H[var14_int][var15_int] = var13;
                                  if (var14_int >= 10) {
                                    if (var14_int != 10) {
                                      field_x[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    } else {
                                      field_d[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    }
                                  } else {
                                    field_K[var14_int] = field_K[var14_int] + var8;
                                    var12++;
                                    continue L10;
                                  }
                                } else {
                                  var8--;
                                  continue L6;
                                }
                              }
                            } else {
                              var8--;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        field_r[var8] = 0;
                        field_K[var8] = 0;
                        var8++;
                        continue L5;
                      }
                    }
                  } else {
                    var8 = param4 - 1;
                    L11: while (true) {
                      if (var8 < 0) {
                        return;
                      } else {
                        L12: {
                          var9 = field_J[var8];
                          if (var9 <= 0) {
                            break L12;
                          } else {
                            L13: {
                              if (var9 <= 64) {
                                stackOut_74_0 = var9;
                                stackIn_75_0 = stackOut_74_0;
                                break L13;
                              } else {
                                stackOut_72_0 = 64;
                                stackIn_75_0 = stackOut_72_0;
                                break L13;
                              }
                            }
                            var10 = stackIn_75_0;
                            var45 = field_w[var8];
                            var12 = 0;
                            L14: while (true) {
                              if (var12 >= var10) {
                                break L12;
                              } else {
                                this.d(var45[var12]);
                                var12++;
                                continue L14;
                              }
                            }
                          }
                        }
                        if (var9 > 64) {
                          var10 = field_J[var8] - 65;
                          var46 = field_E[var10];
                          var12 = 0;
                          L15: while (true) {
                            if (var12 < field_j[var10]) {
                              this.d(var46[var12]);
                              var12++;
                              continue L15;
                            } else {
                              var8--;
                              continue L11;
                            }
                          }
                        } else {
                          var8--;
                          continue L11;
                        }
                      }
                    }
                  }
                } else {
                  q.a(1, 0, field_y, field_f, var7 - 1);
                  if (((sc) this).field_C != null) {
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L17: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            var9 = field_f[var8];
                            var10 = field_y[var8];
                            var11 = ((sc) this).field_C[var9];
                            field_r[var11] = field_r[var11] + 1;
                            var12 = field_r[var11];
                            field_H[var11][var12] = var9;
                            if (var11 >= 10) {
                              if (var11 != 10) {
                                field_x[var12] = var10;
                                var8++;
                                continue L17;
                              } else {
                                field_d[var12] = var10;
                                var8++;
                                continue L17;
                              }
                            } else {
                              field_K[var11] = field_K[var11] + var10;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        field_r[var8] = 0;
                        field_K[var8] = 0;
                        var8++;
                        continue L16;
                      }
                    }
                  } else {
                    var8 = 0;
                    L18: while (true) {
                      if (var8 >= var7) {
                        return;
                      } else {
                        this.d(field_f[var8]);
                        var8++;
                        continue L18;
                      }
                    }
                  }
                }
              }
              L19: {
                L20: {
                  var8 = 0;
                  if (field_r[1] > 0) {
                    break L20;
                  } else {
                    if (field_r[2] <= 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = (field_K[1] + field_K[2]) / (field_r[1] + field_r[2]);
                break L19;
              }
              L21: {
                L22: {
                  var9 = 0;
                  if (field_r[3] > 0) {
                    break L22;
                  } else {
                    if (field_r[4] <= 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                var9 = (field_K[3] + field_K[4]) / (field_r[3] + field_r[4]);
                break L21;
              }
              L23: {
                L24: {
                  var10 = 0;
                  if (field_r[6] > 0) {
                    break L24;
                  } else {
                    if (field_r[8] <= 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var10 = (field_K[6] + field_K[8]) / (field_r[6] + field_r[8]);
                break L23;
              }
              L25: {
                var12 = 0;
                var13 = field_r[10];
                var14 = field_H[10];
                var15 = field_d;
                if (var12 != var13) {
                  break L25;
                } else {
                  var12 = 0;
                  var13 = field_r[11];
                  var14 = field_H[11];
                  var15 = field_x;
                  break L25;
                }
              }
              L26: {
                if (var12 >= var13) {
                  var11 = -1000;
                  break L26;
                } else {
                  var11 = var15[var12];
                  break L26;
                }
              }
              var16 = 0;
              L27: while (true) {
                if (var16 >= 10) {
                  L28: while (true) {
                    if (var11 == -1000) {
                      return;
                    } else {
                      L29: {
                        int incrementValue$6 = var12;
                        var12++;
                        this.d(var14[incrementValue$6]);
                        if (var12 != var13) {
                          break L29;
                        } else {
                          if (var14 == field_H[11]) {
                            break L29;
                          } else {
                            var12 = 0;
                            var14 = field_H[11];
                            var13 = field_r[11];
                            var15 = field_x;
                            break L29;
                          }
                        }
                      }
                      if (var12 >= var13) {
                        var11 = -1000;
                        continue L28;
                      } else {
                        var11 = var15[var12];
                        continue L28;
                      }
                    }
                  }
                } else {
                  L30: while (true) {
                    L31: {
                      if (var16 != 0) {
                        break L31;
                      } else {
                        if (var11 <= var8) {
                          break L31;
                        } else {
                          L32: {
                            int incrementValue$7 = var12;
                            var12++;
                            this.d(var14[incrementValue$7]);
                            if (var12 != var13) {
                              break L32;
                            } else {
                              if (var14 == field_H[11]) {
                                break L32;
                              } else {
                                var12 = 0;
                                var13 = field_r[11];
                                var14 = field_H[11];
                                var15 = field_x;
                                break L32;
                              }
                            }
                          }
                          if (var12 >= var13) {
                            var11 = -1000;
                            continue L30;
                          } else {
                            var11 = var15[var12];
                            continue L30;
                          }
                        }
                      }
                    }
                    L33: while (true) {
                      L34: {
                        if (var16 != 3) {
                          break L34;
                        } else {
                          if (var11 <= var9) {
                            break L34;
                          } else {
                            L35: {
                              int incrementValue$8 = var12;
                              var12++;
                              this.d(var14[incrementValue$8]);
                              if (var12 != var13) {
                                break L35;
                              } else {
                                if (var14 == field_H[11]) {
                                  break L35;
                                } else {
                                  var12 = 0;
                                  var13 = field_r[11];
                                  var14 = field_H[11];
                                  var15 = field_x;
                                  break L35;
                                }
                              }
                            }
                            if (var12 >= var13) {
                              var11 = -1000;
                              continue L33;
                            } else {
                              var11 = var15[var12];
                              continue L33;
                            }
                          }
                        }
                      }
                      L36: while (true) {
                        L37: {
                          if (var16 != 5) {
                            break L37;
                          } else {
                            if (var11 <= var10) {
                              break L37;
                            } else {
                              L38: {
                                int incrementValue$9 = var12;
                                var12++;
                                this.d(var14[incrementValue$9]);
                                if (var12 != var13) {
                                  break L38;
                                } else {
                                  if (var14 == field_H[11]) {
                                    break L38;
                                  } else {
                                    var12 = 0;
                                    var13 = field_r[11];
                                    var14 = field_H[11];
                                    var15 = field_x;
                                    break L38;
                                  }
                                }
                              }
                              if (var12 >= var13) {
                                var11 = -1000;
                                continue L36;
                              } else {
                                var11 = var15[var12];
                                continue L36;
                              }
                            }
                          }
                        }
                        L39: {
                          var17 = field_r[var16];
                          var49 = field_H[var16];
                          var29 = 0;
                          var19 = var29;
                          if (var29 >= var17) {
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        var16++;
                        continue L27;
                      }
                    }
                  }
                }
              }
            } else {
              if (((sc) this).field_g[var8] != -2) {
                var9 = ((sc) this).field_U[var8];
                var10 = ((sc) this).field_O[var8];
                var11 = ((sc) this).field_o[var8];
                var12 = field_V[var9];
                var13 = field_V[var10];
                var14_int = field_V[var11];
                L40: {
                  if (!param1) {
                    break L40;
                  } else {
                    if (!this.a(o.field_f + cc.field_n, tc.field_v + cc.field_p, field_v[var9], field_v[var10], field_v[var11], var12, var13, var14_int)) {
                      break L40;
                    } else {
                      int fieldTemp$10 = db.field_c;
                      db.field_c = db.field_c + 1;
                      pl.field_Q[fieldTemp$10] = param2;
                      param1 = false;
                      break L40;
                    }
                  }
                }
                if ((var12 - var13) * (field_v[var11] - field_v[var10]) - (field_v[var9] - field_v[var10]) * (var14_int - var13) > 0) {
                  L41: {
                    L42: {
                      field_k[var8] = false;
                      if (var12 < 0) {
                        break L42;
                      } else {
                        if (var13 < 0) {
                          break L42;
                        } else {
                          if (var14_int < 0) {
                            break L42;
                          } else {
                            if (var12 > cc.field_m) {
                              break L42;
                            } else {
                              if (var13 > cc.field_m) {
                                break L42;
                              } else {
                                if (var14_int <= cc.field_m) {
                                  field_W[var8] = false;
                                  break L41;
                                } else {
                                  break L42;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    field_W[var8] = true;
                    break L41;
                  }
                  if (!field_T) {
                    var15_int = (field_F[var9] + field_F[var10] + field_F[var11]) / 3 + param3;
                    if (field_J[var15_int] >= 64) {
                      L43: {
                        var16 = field_J[var15_int];
                        if (var16 != 64) {
                          break L43;
                        } else {
                          if (field_m != 512) {
                            field_m = field_m + 1;
                            var16 = 65 + field_m;
                            field_J[var15_int] = 65 + field_m;
                            break L43;
                          } else {
                            var8++;
                            continue L3;
                          }
                        }
                      }
                      var16 -= 65;
                      field_j[var16] = field_j[var16] + 1;
                      field_E[var16][field_j[var16]] = var8;
                      var8++;
                      continue L3;
                    } else {
                      field_J[var15_int] = field_J[var15_int] + 1;
                      field_w[var15_int][field_J[var15_int]] = var8;
                      var8++;
                      continue L3;
                    }
                  } else {
                    field_y[var7] = (field_F[var9] + field_F[var10] + field_F[var11]) / 3;
                    int incrementValue$11 = var7;
                    var7++;
                    field_f[incrementValue$11] = var8;
                    var8++;
                    continue L3;
                  }
                } else {
                  var8++;
                  continue L3;
                }
              } else {
                var8++;
                continue L3;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var2 = cc.field_n;
          var3 = cc.field_p;
          var4 = 0;
          var5 = ((sc) this).field_U[param0];
          var6 = ((sc) this).field_O[param0];
          var7 = ((sc) this).field_o[param0];
          var8 = field_l[var5];
          var9 = field_l[var6];
          var10 = field_l[var7];
          if (((sc) this).field_q != null) {
            cc.field_d = ((sc) this).field_q[param0] & 255;
            break L0;
          } else {
            cc.field_d = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_D[var5];
              var12 = field_S[var5];
              var13 = ((sc) this).field_z[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * cc.field_l[var10 - var8];
                field_n[var4] = var2 + (var11 + ((field_D[var7] - var11) * var14 >> 16) << 9) / 50;
                field_G[var4] = var3 + (var12 + ((field_S[var7] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$9 = var4;
                var4++;
                field_i[incrementValue$9] = var13 + (((((sc) this).field_g[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * cc.field_l[var9 - var8];
              field_n[var4] = var2 + (var11 + ((field_D[var6] - var11) * var14 >> 16) << 9) / 50;
              field_G[var4] = var3 + (var12 + ((field_S[var6] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$10 = var4;
              var4++;
              field_i[incrementValue$10] = var13 + (((((sc) this).field_A[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_n[var4] = field_V[var5];
            field_G[var4] = field_v[var5];
            int incrementValue$11 = var4;
            var4++;
            field_i[incrementValue$11] = ((sc) this).field_z[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_D[var6];
              var12 = field_S[var6];
              var13 = ((sc) this).field_A[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * cc.field_l[var8 - var9];
                field_n[var4] = var2 + (var11 + ((field_D[var5] - var11) * var14 >> 16) << 9) / 50;
                field_G[var4] = var3 + (var12 + ((field_S[var5] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$12 = var4;
                var4++;
                field_i[incrementValue$12] = var13 + (((((sc) this).field_z[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * cc.field_l[var10 - var9];
              field_n[var4] = var2 + (var11 + ((field_D[var7] - var11) * var14 >> 16) << 9) / 50;
              field_G[var4] = var3 + (var12 + ((field_S[var7] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$13 = var4;
              var4++;
              field_i[incrementValue$13] = var13 + (((((sc) this).field_g[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_n[var4] = field_V[var6];
            field_G[var4] = field_v[var6];
            int incrementValue$14 = var4;
            var4++;
            field_i[incrementValue$14] = ((sc) this).field_A[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_D[var7];
              var12 = field_S[var7];
              var13 = ((sc) this).field_g[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * cc.field_l[var9 - var10];
                field_n[var4] = var2 + (var11 + ((field_D[var6] - var11) * var14 >> 16) << 9) / 50;
                field_G[var4] = var3 + (var12 + ((field_S[var6] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$15 = var4;
                var4++;
                field_i[incrementValue$15] = var13 + (((((sc) this).field_A[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * cc.field_l[var8 - var10];
              field_n[var4] = var2 + (var11 + ((field_D[var5] - var11) * var14 >> 16) << 9) / 50;
              field_G[var4] = var3 + (var12 + ((field_S[var5] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$16 = var4;
              var4++;
              field_i[incrementValue$16] = var13 + (((((sc) this).field_z[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_n[var4] = field_V[var7];
            field_G[var4] = field_v[var7];
            int incrementValue$17 = var4;
            var4++;
            field_i[incrementValue$17] = ((sc) this).field_g[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_n[0];
          var12 = field_n[1];
          var13 = field_n[2];
          var14 = field_G[0];
          var15 = field_G[1];
          var16 = field_G[2];
          cc.field_q = false;
          if (var4 != 3) {
            break L7;
          } else {
            L8: {
              L9: {
                if (var11 < 0) {
                  break L9;
                } else {
                  if (var12 < 0) {
                    break L9;
                  } else {
                    if (var13 < 0) {
                      break L9;
                    } else {
                      if (var11 > cc.field_m) {
                        break L9;
                      } else {
                        if (var12 > cc.field_m) {
                          break L9;
                        } else {
                          if (var13 <= cc.field_m) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              cc.field_q = true;
              break L8;
            }
            L10: {
              if (((sc) this).field_M == null) {
                break L10;
              } else {
                if (((sc) this).field_M[param0] != -1) {
                  L11: {
                    L12: {
                      if (((sc) this).field_s == null) {
                        break L12;
                      } else {
                        if (((sc) this).field_s[param0] == -1) {
                          break L12;
                        } else {
                          var20 = ((sc) this).field_s[param0] & 255;
                          var17 = ((sc) this).field_Q[var20];
                          var18 = ((sc) this).field_t[var20];
                          var19 = ((sc) this).field_h[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (((sc) this).field_g[param0] != -1) {
                    cc.a(var14, var15, var16, var11, var12, var13, field_i[0], field_i[1], field_i[2], field_D[var17], field_D[var18], field_D[var19], field_S[var17], field_S[var18], field_S[var19], field_l[var17], field_l[var18], field_l[var19], (int) ((sc) this).field_M[param0]);
                    break L7;
                  } else {
                    cc.a(var14, var15, var16, var11, var12, var13, ((sc) this).field_z[param0], ((sc) this).field_z[param0], ((sc) this).field_z[param0], field_D[var17], field_D[var18], field_D[var19], field_S[var17], field_S[var18], field_S[var19], field_l[var17], field_l[var18], field_l[var19], (int) ((sc) this).field_M[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((sc) this).field_g[param0] != -1) {
              cc.a(var14, var15, var16, var11, var12, var13, field_i[0], field_i[1], field_i[2]);
              break L7;
            } else {
              cc.a(var14, var15, var16, var11, var12, var13, cc.field_e[((sc) this).field_z[param0] & 65535]);
              break L7;
            }
          }
        }
        if (var4 != 4) {
          return;
        } else {
          L13: {
            L14: {
              if (var11 < 0) {
                break L14;
              } else {
                if (var12 < 0) {
                  break L14;
                } else {
                  if (var13 < 0) {
                    break L14;
                  } else {
                    if (var11 > cc.field_m) {
                      break L14;
                    } else {
                      if (var12 > cc.field_m) {
                        break L14;
                      } else {
                        if (var13 > cc.field_m) {
                          break L14;
                        } else {
                          if (field_n[3] < 0) {
                            break L14;
                          } else {
                            if (field_n[3] <= cc.field_m) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            cc.field_q = true;
            break L13;
          }
          L15: {
            L16: {
              if (((sc) this).field_M == null) {
                break L16;
              } else {
                if (((sc) this).field_M[param0] != -1) {
                  L17: {
                    L18: {
                      if (((sc) this).field_s == null) {
                        break L18;
                      } else {
                        if (((sc) this).field_s[param0] == -1) {
                          break L18;
                        } else {
                          var20 = ((sc) this).field_s[param0] & 255;
                          var17 = ((sc) this).field_Q[var20];
                          var18 = ((sc) this).field_t[var20];
                          var19 = ((sc) this).field_h[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = ((sc) this).field_M[param0];
                  if (((sc) this).field_g[param0] != -1) {
                    cc.a(var14, var15, var16, var11, var12, var13, field_i[0], field_i[1], field_i[2], field_D[var17], field_D[var18], field_D[var19], field_S[var17], field_S[var18], field_S[var19], field_l[var17], field_l[var18], field_l[var19], var20);
                    cc.a(var14, var16, field_G[3], var11, var13, field_n[3], field_i[0], field_i[2], field_i[3], field_D[var17], field_D[var18], field_D[var19], field_S[var17], field_S[var18], field_S[var19], field_l[var17], field_l[var18], field_l[var19], var20);
                    break L15;
                  } else {
                    cc.a(var14, var15, var16, var11, var12, var13, ((sc) this).field_z[param0], ((sc) this).field_z[param0], ((sc) this).field_z[param0], field_D[var17], field_D[var18], field_D[var19], field_S[var17], field_S[var18], field_S[var19], field_l[var17], field_l[var18], field_l[var19], var20);
                    cc.a(var14, var16, field_G[3], var11, var13, field_n[3], ((sc) this).field_z[param0], ((sc) this).field_z[param0], ((sc) this).field_z[param0], field_D[var17], field_D[var18], field_D[var19], field_S[var17], field_S[var18], field_S[var19], field_l[var17], field_l[var18], field_l[var19], var20);
                    break L15;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (((sc) this).field_g[param0] != -1) {
              cc.a(var14, var15, var16, var11, var12, var13, field_i[0], field_i[1], field_i[2]);
              cc.a(var14, var16, field_G[3], var11, var13, field_n[3], field_i[0], field_i[2], field_i[3]);
              break L15;
            } else {
              var17 = cc.field_e[((sc) this).field_z[param0] & 65535];
              cc.a(var14, var15, var16, var11, var12, var13, var17);
              cc.a(var14, var16, field_G[3], var11, var13, field_n[3], var17);
              break L15;
            }
          }
          return;
        }
    }

    private final static int a(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
            param1 = 2;
        } else {
            if (param1 > 126) {
                param1 = 126;
            }
        }
        return (param0 & 65408) + param1;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!field_k[param0]) {
          L0: {
            var2 = ((sc) this).field_U[param0];
            var3 = ((sc) this).field_O[param0];
            var4 = ((sc) this).field_o[param0];
            cc.field_q = field_W[param0];
            if (((sc) this).field_q != null) {
              cc.field_d = ((sc) this).field_q[param0] & 255;
              break L0;
            } else {
              cc.field_d = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (((sc) this).field_M == null) {
                break L2;
              } else {
                if (((sc) this).field_M[param0] != -1) {
                  L3: {
                    L4: {
                      if (((sc) this).field_s == null) {
                        break L4;
                      } else {
                        if (((sc) this).field_s[param0] == -1) {
                          break L4;
                        } else {
                          var8 = ((sc) this).field_s[param0] & 255;
                          var5 = ((sc) this).field_Q[var8];
                          var6 = ((sc) this).field_t[var8];
                          var7 = ((sc) this).field_h[var8];
                          break L3;
                        }
                      }
                    }
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    break L3;
                  }
                  if (((sc) this).field_g[param0] != -1) {
                    cc.a(field_v[var2], field_v[var3], field_v[var4], field_V[var2], field_V[var3], field_V[var4], ((sc) this).field_z[param0], ((sc) this).field_A[param0], ((sc) this).field_g[param0], field_D[var5], field_D[var6], field_D[var7], field_S[var5], field_S[var6], field_S[var7], field_l[var5], field_l[var6], field_l[var7], (int) ((sc) this).field_M[param0]);
                    break L1;
                  } else {
                    cc.a(field_v[var2], field_v[var3], field_v[var4], field_V[var2], field_V[var3], field_V[var4], ((sc) this).field_z[param0], ((sc) this).field_z[param0], ((sc) this).field_z[param0], field_D[var5], field_D[var6], field_D[var7], field_S[var5], field_S[var6], field_S[var7], field_l[var5], field_l[var6], field_l[var7], (int) ((sc) this).field_M[param0]);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (((sc) this).field_g[param0] != -1) {
              cc.a(field_v[var2], field_v[var3], field_v[var4], field_V[var2], field_V[var3], field_V[var4], ((sc) this).field_z[param0] & 65535, ((sc) this).field_A[param0] & 65535, ((sc) this).field_g[param0] & 65535);
              break L1;
            } else {
              cc.a(field_v[var2], field_v[var3], field_v[var4], field_V[var2], field_V[var3], field_V[var4], cc.field_e[((sc) this).field_z[param0] & 65535]);
              break L1;
            }
          }
          return;
        } else {
          this.e(param0);
          return;
        }
    }

    private sc() {
        ((sc) this).field_I = 0;
        ((sc) this).field_R = 0;
        ((sc) this).field_p = 0;
        ((sc) this).field_u = 0;
        ((sc) this).field_L = false;
    }

    sc(pa param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nk var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        l var18 = null;
        l var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          ((sc) this).field_I = 0;
          ((sc) this).field_R = 0;
          ((sc) this).field_p = 0;
          ((sc) this).field_u = 0;
          ((sc) this).field_L = false;
          param0.a();
          param0.b();
          ((sc) this).field_p = param0.field_m;
          ((sc) this).field_R = param0.field_v;
          ((sc) this).field_P = param0.field_g;
          ((sc) this).field_e = param0.field_F;
          ((sc) this).field_N = param0.field_C;
          ((sc) this).field_I = param0.field_h;
          ((sc) this).field_U = param0.field_z;
          ((sc) this).field_O = param0.field_E;
          ((sc) this).field_o = param0.field_G;
          ((sc) this).field_C = param0.field_x;
          ((sc) this).field_q = param0.field_j;
          var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
          var8 = param2 * var7 >> 8;
          ((sc) this).field_z = new int[((sc) this).field_I];
          ((sc) this).field_A = new int[((sc) this).field_I];
          ((sc) this).field_g = new int[((sc) this).field_I];
          if (param0.field_D == null) {
            ((sc) this).field_M = null;
            break L0;
          } else {
            ((sc) this).field_M = new short[((sc) this).field_I];
            var9 = 0;
            L1: while (true) {
              if (var9 >= ((sc) this).field_I) {
                break L0;
              } else {
                L2: {
                  var10 = param0.field_D[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!cc.field_k.a(var10, (byte) 114)) {
                      break L2;
                    } else {
                      ((sc) this).field_M[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                ((sc) this).field_M[var9] = (short) -1;
                var9++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param0.field_L <= 0) {
            break L3;
          } else {
            if (param0.field_J == null) {
              break L3;
            } else {
              var22 = new int[param0.field_L];
              var21 = var22;
              var20 = var21;
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= ((sc) this).field_I) {
                  ((sc) this).field_u = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= param0.field_L) {
                      ((sc) this).field_Q = new int[((sc) this).field_u];
                      ((sc) this).field_t = new int[((sc) this).field_u];
                      ((sc) this).field_h = new int[((sc) this).field_u];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= param0.field_L) {
                          ((sc) this).field_s = new byte[((sc) this).field_I];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= ((sc) this).field_I) {
                              break L3;
                            } else {
                              if (param0.field_J[var11] == -1) {
                                ((sc) this).field_s[var11] = (byte) -1;
                                var11++;
                                continue L7;
                              } else {
                                ((sc) this).field_s[var11] = (byte)var9_ref_int__[param0.field_J[var11] & 255];
                                if (((sc) this).field_s[var11] == -1) {
                                  if (((sc) this).field_M != null) {
                                    ((sc) this).field_M[var11] = (short) -1;
                                    var11++;
                                    continue L7;
                                  } else {
                                    var11++;
                                    continue L7;
                                  }
                                } else {
                                  var11++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        } else {
                          L8: {
                            if (var22[var11] <= 0) {
                              break L8;
                            } else {
                              if (param0.field_i[var11] != 0) {
                                break L8;
                              } else {
                                ((sc) this).field_Q[var10] = param0.field_B[var11] & 65535;
                                ((sc) this).field_t[var10] = param0.field_w[var11] & 65535;
                                ((sc) this).field_h[var10] = param0.field_k[var11] & 65535;
                                int incrementValue$1 = var10;
                                var10++;
                                var9_ref_int__[var11] = incrementValue$1;
                                var11++;
                                continue L6;
                              }
                            }
                          }
                          var22[var11] = -1;
                          var11++;
                          continue L6;
                        }
                      }
                    } else {
                      if (var22[var10] > 0) {
                        if (param0.field_i[var10] == 0) {
                          ((sc) this).field_u = ((sc) this).field_u + 1;
                          var10++;
                          continue L5;
                        } else {
                          var10++;
                          continue L5;
                        }
                      } else {
                        var10++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (param0.field_J[var10] != -1) {
                    var9_ref_int__[param0.field_J[var10] & 255] = var9_ref_int__[param0.field_J[var10] & 255] + 1;
                    var10++;
                    continue L4;
                  } else {
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        var16 = 0;
        var9 = var16;
        L9: while (true) {
          if (var16 >= ((sc) this).field_I) {
            return;
          } else {
            L10: {
              if (param0.field_q != null) {
                var10 = param0.field_q[var16];
                break L10;
              } else {
                var10 = 0;
                break L10;
              }
            }
            L11: {
              if (param0.field_j != null) {
                var11 = param0.field_j[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (((sc) this).field_M != null) {
                var12 = ((sc) this).field_M[var16];
                break L12;
              } else {
                var12 = -1;
                break L12;
              }
            }
            L13: {
              if (var11 != -2) {
                break L13;
              } else {
                var10 = 3;
                break L13;
              }
            }
            L14: {
              if (var11 != -1) {
                break L14;
              } else {
                var10 = 2;
                break L14;
              }
            }
            if (var12 != -1) {
              if (var10 != 0) {
                if (var10 != 1) {
                  ((sc) this).field_g[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = param0.field_l[var16];
                  var14 = param1 + (param3 * var19.field_i + param4 * var19.field_c + param5 * var19.field_a) / (var8 + var8 / 2);
                  ((sc) this).field_z[var16] = sc.c(var14);
                  ((sc) this).field_g[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (param0.field_s == null) {
                      break L16;
                    } else {
                      if (param0.field_s[((sc) this).field_U[var16]] == null) {
                        break L16;
                      } else {
                        var13 = param0.field_s[((sc) this).field_U[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = param0.field_u[((sc) this).field_U[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g);
                    ((sc) this).field_z[var16] = sc.c(var14);
                    if (param0.field_s == null) {
                      break L18;
                    } else {
                      if (param0.field_s[((sc) this).field_O[var16]] == null) {
                        break L18;
                      } else {
                        var13 = param0.field_s[((sc) this).field_O[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = param0.field_u[((sc) this).field_O[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g);
                    ((sc) this).field_A[var16] = sc.c(var14);
                    if (param0.field_s == null) {
                      break L20;
                    } else {
                      if (param0.field_s[((sc) this).field_o[var16]] == null) {
                        break L20;
                      } else {
                        var13 = param0.field_s[((sc) this).field_o[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = param0.field_u[((sc) this).field_o[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g);
                ((sc) this).field_g[var16] = sc.c(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    ((sc) this).field_g[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    ((sc) this).field_z[var16] = 128;
                    ((sc) this).field_g[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = param0.field_l[var16];
                  var14 = param1 + (param3 * var18.field_i + param4 * var18.field_c + param5 * var18.field_a) / (var8 + var8 / 2) << 17;
                  ((sc) this).field_z[var16] = var14 | sc.a(param0.field_I[var16] & 65535, var14 >> 17);
                  ((sc) this).field_g[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = param0.field_I[var16] & 65535;
                    if (param0.field_s == null) {
                      break L22;
                    } else {
                      if (param0.field_s[((sc) this).field_U[var16]] == null) {
                        break L22;
                      } else {
                        var13 = param0.field_s[((sc) this).field_U[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = param0.field_u[((sc) this).field_U[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                    ((sc) this).field_z[var16] = var14 | sc.a(var15, var14 >> 17);
                    if (param0.field_s == null) {
                      break L24;
                    } else {
                      if (param0.field_s[((sc) this).field_O[var16]] == null) {
                        break L24;
                      } else {
                        var13 = param0.field_s[((sc) this).field_O[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = param0.field_u[((sc) this).field_O[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                    ((sc) this).field_A[var16] = var14 | sc.a(var15, var14 >> 17);
                    if (param0.field_s == null) {
                      break L26;
                    } else {
                      if (param0.field_s[((sc) this).field_o[var16]] == null) {
                        break L26;
                      } else {
                        var13 = param0.field_s[((sc) this).field_o[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = param0.field_u[((sc) this).field_o[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                ((sc) this).field_g[var16] = var14 | sc.a(var15, var14 >> 17);
                var16++;
                continue L9;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        L0: {
          sc discarded$6 = new sc();
          sc discarded$7 = new sc();
          sc discarded$8 = new sc();
          field_V = new int[4096];
          field_i = new int[10];
          field_S = new int[4096];
          field_l = new int[4096];
          field_v = new int[4096];
          field_d = new int[4096];
          field_K = new int[12];
          field_D = new int[4096];
          field_T = false;
          field_r = new int[12];
          field_G = new int[10];
          field_F = new int[4096];
          field_H = new int[12][4096];
          if (!field_T) {
            field_J = new int[1600];
            field_w = new int[1600][64];
            field_j = new int[32];
            field_E = new int[32][512];
            break L0;
          } else {
            field_y = new int[4096];
            field_f = new int[4096];
            break L0;
          }
        }
        field_m = 0;
        field_W = new boolean[4096];
        field_n = new int[10];
        field_k = new boolean[4096];
        field_x = new int[4096];
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    private ft field_F;
    private boolean field_P;
    private String field_O;
    private int field_p;
    private int field_N;
    static int field_D;
    private ft field_b;
    private int field_g;
    private wk[] field_X;
    private hh field_hb;
    private int field_cb;
    private int field_bb;
    int[] field_w;
    private int[] field_J;
    private vj field_ab;
    private boolean field_o;
    private em field_H;
    private boolean field_Q;
    private ft field_n;
    private hr field_h;
    private int field_t;
    private ft field_x;
    private String field_a;
    private boolean field_j;
    static int field_B;
    static int field_r;
    private hr field_fb;
    private hr field_S;
    private ft field_K;
    private jd field_q;
    private int field_m;
    static String field_gb;
    private String field_k;
    static String field_y;
    private em field_u;
    static String field_c;
    private String field_eb;
    private int field_i;
    private int field_Y;
    private int field_T;
    private int field_f;
    private int field_e;
    private ft field_V;
    private hr field_v;
    private jd field_W;
    private ft field_C;
    private hr field_s;
    private jd field_d;
    private int field_l;
    private boolean field_I;
    private ft field_R;
    private ft field_Z;
    private int field_db;
    private hr field_M;
    private em field_L;
    private int field_A;
    private int field_z;
    private int field_E;

    private final void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (null == ((rk) this).field_W) {
            var4 = 0;
            var5 = 1;
            var6 = 0;
            ((rk) this).field_W = this.b(var4, -1, var5, var6);
        }
        if (null == ((rk) this).field_W) {
            return;
        }
        var4 = 76;
        hs.a(false, true, ((rk) this).field_W, 0, db.a(true, param2), 0, var4, u.a(param0, (byte) 94));
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == ((rk) this).field_H) {
          return;
        } else {
          L0: {
            var5 = -48;
            var4 = ((rk) this).field_H.field_a;
            if (var4 < 0) {
              break L0;
            } else {
              if (var4 < ((rk) this).field_H.field_f) {
                var6 = 0;
                L1: while (true) {
                  if (3 <= var6) {
                    return;
                  } else {
                    L2: {
                      var7 = var6;
                      var8 = var6 - -1;
                      if (null == gt.field_c) {
                        break L2;
                      } else {
                        if (0 > var7) {
                          break L2;
                        } else {
                          if (gt.field_c.length > var7) {
                            L3: {
                              var9 = -(gt.field_c[var7].field_A >> 1) + 50 >> 1;
                              param1 = param1 - -var9;
                              if (null == hr.field_d) {
                                break L3;
                              } else {
                                if (1 + var7 < 0) {
                                  break L3;
                                } else {
                                  if (1 + var7 >= hr.field_d.length) {
                                    break L3;
                                  } else {
                                    L4: {
                                      hr.field_d[1 + var7].h(db.a(true, 6 + param1), u.a(param2 + 9, (byte) 94));
                                      gt.field_c[var7 + 1].h(db.a(true, param1), u.a(param2, (byte) 94));
                                      if (var8 <= 0) {
                                        break L4;
                                      } else {
                                        if (null == fe.field_o) {
                                          break L4;
                                        } else {
                                          if (0 > 1 + var7) {
                                            break L4;
                                          } else {
                                            if (var7 + 1 < fe.field_o.length) {
                                              fe.a(db.a(true, 18 + param1), u.a(param2 - -21, (byte) 94), var7 + 1, var8, var4);
                                              param1 = 50 + param1 - var9;
                                              var6++;
                                              continue L1;
                                            } else {
                                              break L4;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                            }
                            return;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    final static String c() {
        int var5 = 0;
        String var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        ic var1 = rd.field_j;
        if (null == var1) {
            return "No game in progress.";
        }
        String[] var2 = var1.field_xb.e(26524);
        String var3 = "";
        String[] var4 = var2;
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var3 = var3 + var6 + "\n";
        }
        return var3;
    }

    private final void c(byte param0) {
        ((rk) this).field_S = null;
        ((rk) this).field_S = new hr(18);
        if (param0 > -101) {
            ((rk) this).field_W = null;
        }
    }

    private final void d(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (param2 < 0) {
            break L0;
          } else {
            if (~va.field_G.length >= ~param2) {
              break L0;
            } else {
              L1: {
                var6 = va.field_G[param2];
                var7 = va.field_G[0];
                ds.a(param1, param0, var7, 27066, true, 0, true, var6);
                ds.a(param1, param0, var7, 27066, true, 0, false, var6);
                if (param2 != 3) {
                  break L1;
                } else {
                  int discarded$1 = 1;
                  vu.a(true, true, param1, param0, 0, 1);
                  break L1;
                }
              }
              L2: {
                if (param2 == 2) {
                  this.a(0, (byte) 85, 1, true, param1, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param2 != 8) {
                  break L3;
                } else {
                  var8 = 0;
                  this.a(param1, var8, 0, (byte) 114, param0);
                  break L3;
                }
              }
              L4: {
                if (param2 != 14) {
                  break L4;
                } else {
                  var8 = 11;
                  this.a(param1, var8, 0, (byte) 114, param0 - 5);
                  break L4;
                }
              }
              L5: {
                if (12 == param2) {
                  var8 = 24;
                  this.a(param1, var8, 0, (byte) 114, param0);
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            }
          }
        }
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = fk.field_d[param2][param0];
        var5 = fk.field_d[param0][param2];
        if (var5 >= var4) {
          if (var4 < var5) {
            if (var5 + -var4 > 45) {
              return 4;
            } else {
              return 3;
            }
          } else {
            return 2;
          }
        } else {
          if (-var5 + var4 > 45) {
            return 0;
          } else {
            return 1;
          }
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          if (null == ((rk) this).field_w) {
            break L0;
          } else {
            if (((rk) this).field_w.length == 0) {
              break L0;
            } else {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (((rk) this).field_w.length <= param0) {
                    break L1;
                  } else {
                    if (!param1) {
                      L2: {
                        if (null == ((rk) this).field_Z) {
                          break L2;
                        } else {
                          if (((rk) this).field_R == null) {
                            break L2;
                          } else {
                            if (((rk) this).field_n == null) {
                              break L2;
                            } else {
                              if (null == ((rk) this).field_b) {
                                break L2;
                              } else {
                                L3: {
                                  var3 = ((rk) this).field_w[param0];
                                  if (22 == var3) {
                                    break L3;
                                  } else {
                                    if (var3 != 23) {
                                      if (var3 == 8) {
                                        return ((rk) this).field_n.field_n + -((rk) this).field_Z.field_n;
                                      } else {
                                        return 1;
                                      }
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                return ((rk) this).field_b.field_n + -((rk) this).field_R.field_n;
                              }
                            }
                          }
                        }
                      }
                      return 1;
                    } else {
                      return 106;
                    }
                  }
                }
              }
              return 1;
            }
          }
        }
        return 1;
    }

    private final void a(byte param0, int param1, boolean param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          int discarded$2 = 31559;
          this.p();
          if (param3) {
            ((rk) this).field_o = true;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!param2) {
            break L1;
          } else {
            ((rk) this).field_I = true;
            break L1;
          }
        }
        L2: {
          if (null == ((rk) this).field_w) {
            break L2;
          } else {
            if (((rk) this).field_w.length != 0) {
              L3: {
                if (param1 < 0) {
                  break L3;
                } else {
                  if (((rk) this).field_w.length <= param1) {
                    break L3;
                  } else {
                    L4: {
                      var5 = ((rk) this).field_w[param1];
                      if (var5 != 22) {
                        if (23 == var5) {
                          ((rk) this).field_Q = true;
                          break L4;
                        } else {
                          if (var5 != 8) {
                            break L4;
                          } else {
                            ((rk) this).field_P = true;
                            break L4;
                          }
                        }
                      } else {
                        ((rk) this).field_j = true;
                        break L4;
                      }
                    }
                    return;
                  }
                }
              }
              return;
            } else {
              break L2;
            }
          }
        }
    }

    private final void m() {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((rk) this).field_f = -1;
        if (null != ((rk) this).field_X) {
          var2 = 0;
          L0: while (true) {
            if (((rk) this).field_X.length <= var2) {
              ((rk) this).field_X = null;
              return;
            } else {
              if (((rk) this).field_X[var2] != null) {
                ((rk) this).field_X[var2].field_B = null;
                ((rk) this).field_X[var2] = null;
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

    private final void k() {
        String[] var2 = null;
        String[][] var3 = null;
        String[][][] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((rk) this).field_N < 0) {
            break L0;
          } else {
            if (((rk) this).field_N >= ((rk) this).field_p) {
              break L0;
            } else {
              if (null != up.field_b[((rk) this).field_N]) {
                var11 = up.field_b[((rk) this).field_N];
                var2 = var11;
                if (null != up.field_g[((rk) this).field_N]) {
                  var3 = up.field_g[((rk) this).field_N];
                  if (null == up.field_c[((rk) this).field_N]) {
                    return;
                  } else {
                    var4 = up.field_c[((rk) this).field_N];
                    if (null != go.field_f[((rk) this).field_N]) {
                      var5 = go.field_f[((rk) this).field_N];
                      if (da.field_a[((rk) this).field_N] == null) {
                        return;
                      } else {
                        var6 = da.field_a[((rk) this).field_N];
                        var7 = ((rk) this).field_T + -this.a(true);
                        var8 = 0;
                        L1: while (true) {
                          if (~var8 <= ~var11.length) {
                            return;
                          } else {
                            L2: {
                              if (var2 != null) {
                                if (var3 != null) {
                                  if (var4 != null) {
                                    if (var5 != null) {
                                      if (var6 == null) {
                                        break L2;
                                      } else {
                                        L3: {
                                          if (((rk) this).field_N != 9) {
                                            break L3;
                                          } else {
                                            if (var8 != 0) {
                                              break L3;
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                        var9 = this.a(var11[var8], var4[var8], var8, var5[var8], var7, -1185705759, var3[var8], var6[var8]);
                                        var7 = var7 + var9;
                                        break L2;
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
                              } else {
                                break L2;
                              }
                            }
                            var8++;
                            continue L1;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    private final int a(String param0, String[][] param1, int param2, int[] param3, int param4, int param5, String[] param6, int[] param7) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            var9_int = ((rk) this).field_F.field_k;
            var10 = param4;
            var11 = (this.a(true) >> 1) - -this.h(-2881);
            var10 = var11 + var10;
            L1: {
              var12 = param0;
              if (var12 == null) {
                break L1;
              } else {
                fe.c(var12, db.a(true, var9_int), u.a(var10, (byte) 94), nd.field_b, true);
                break L1;
              }
            }
            L2: {
              var13 = param4;
              var11 = ((rk) this).field_Y + -((rk) this).field_T - -(this.a(true) >> 1);
              if (var12 != null) {
                var13 = param4 + var11;
                break L2;
              } else {
                break L2;
              }
            }
            var14 = this.a(param6, param1, var13 + 10, param3, param7, (byte) -120, param2);
            if (var12 != null) {
              stackOut_11_0 = 10 + var11 + var14;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_9_0 = var14;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var9;
            stackOut_13_1 = new StringBuilder().append("rk.T(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param2).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          L6: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param4).append(44).append(-1185705759).append(44);
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          L7: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param7 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return stackIn_12_0;
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param4 == -1) {
          return;
        } else {
          L0: {
            if (param4 < 0) {
              break L0;
            } else {
              if (fn.field_Q.length > param4) {
                var7 = ((rk) this).field_u.field_a;
                L1: {
                  if (var7 >= 0) {
                    break L1;
                  } else {
                    var7 = 0;
                    break L1;
                  }
                }
                var8 = fn.field_Q[param4];
                if (var8 >= 0) {
                  L2: {
                    if (null == l.field_b) {
                      break L2;
                    } else {
                      if (l.field_b.length <= 0) {
                        break L2;
                      } else {
                        if (null == l.field_b[0]) {
                          break L2;
                        } else {
                          if (l.field_b.length == 0) {
                            break L2;
                          } else {
                            L3: {
                              if (2 == var8) {
                                L4: {
                                  if (17 >= l.field_b.length) {
                                    break L4;
                                  } else {
                                    if (l.field_b.length > 16) {
                                      L5: {
                                        L6: {
                                          l.field_b[17].a(db.a(true, param0), u.a(-40 + param1, (byte) 94));
                                          var9 = 1;
                                          if (null == ds.field_a) {
                                            break L6;
                                          } else {
                                            if (~param2 > ~ds.field_a.length) {
                                              break L5;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                        var9 = 0;
                                        break L5;
                                      }
                                      L7: {
                                        L8: {
                                          if (null == le.field_c) {
                                            break L8;
                                          } else {
                                            if (~param2 > ~le.field_c.length) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        var9 = 0;
                                        break L7;
                                      }
                                      L9: {
                                        if (var9 == 0) {
                                          break L9;
                                        } else {
                                          mv.a(db.a(true, 20 + param0), (byte) -70, var7, param2, u.a(param1, (byte) 94));
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (-1 < param2) {
                                          int discarded$1 = -10374;
                                          ks.a(mn.field_k[76][param2], false, u.a(-40 + param1, (byte) 94), ((rk) this).field_ab, 128, 150, db.a(true, param0), (js) null);
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      l.field_b[16].a(db.a(true, param0), u.a(param1 + -40, (byte) 94));
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                return;
                              } else {
                                if (var8 == 1) {
                                  if (l.field_b.length <= 8) {
                                    return;
                                  } else {
                                    l.field_b[8].a(db.a(true, param0), u.a(-50 + param1, (byte) 94));
                                    if (param2 <= -1) {
                                      break L3;
                                    } else {
                                      if (param2 >= op.field_c.length) {
                                        break L3;
                                      } else {
                                        wb.a(7816226, db.a(true, param0 + 21), param2, var7, u.a(-30 + param1, (byte) 94));
                                        break L3;
                                      }
                                    }
                                  }
                                } else {
                                  if (0 != var8) {
                                    if (var8 != 8) {
                                      break L3;
                                    } else {
                                      if (11 >= l.field_b.length) {
                                        return;
                                      } else {
                                        l.field_b[11].a(db.a(true, param0), u.a(-10 + (param1 - 40), (byte) 94));
                                        if (param2 <= -1) {
                                          break L3;
                                        } else {
                                          if (op.field_c.length > param2) {
                                            wb.a(7816226, db.a(true, param0 - -20), param2, var7, u.a(param1 - 20, (byte) 94));
                                            eu.a(db.a(true, param0 - -15), param2, 11, 127, u.a(21 + param1, (byte) 94));
                                            break L3;
                                          } else {
                                            break L3;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (l.field_b.length > 0) {
                                      l.field_b[0].a(db.a(true, param0), u.a(-40 + param1, (byte) 94));
                                      if (param2 <= -1) {
                                        break L3;
                                      } else {
                                        if (op.field_c.length > param2) {
                                          wb.a(7816226, db.a(true, 20 + param0), param2, var7, u.a(10 + param1, (byte) 94));
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    } else {
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                            return;
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
        }
    }

    private final void p() {
        ((rk) this).field_o = false;
        ((rk) this).field_Q = false;
        ((rk) this).field_j = false;
        ((rk) this).field_I = false;
        ((rk) this).field_P = false;
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] stackIn_10_0 = null;
        int[] stackOut_9_0 = null;
        int[] stackOut_7_0 = null;
        L0: {
          if (param0 <= -48) {
            break L0;
          } else {
            this.c((byte) -46);
            break L0;
          }
        }
        L1: {
          var2 = ((rk) this).field_Z.field_k;
          var3 = ((rk) this).field_Z.field_n;
          var4 = ((rk) this).field_n.field_k + -var2;
          var5 = -var3 + ((rk) this).field_n.field_n;
          qn.f(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, ((rk) this).field_cb);
          fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, nd.field_b, ((rk) this).field_A, ((rk) this).field_e);
          var6 = ((rk) this).field_Z.field_n;
          var7 = ((rk) this).field_n.field_n;
          var3 = var6 - -var7 >> 1;
          int discarded$2 = 21695;
          var8 = this.a();
          var3 = var3 - -var8;
          var9 = ((rk) this).field_O;
          if (null == var9) {
            break L1;
          } else {
            if (var9.length() != 0) {
              L2: {
                if (!((rk) this).field_P) {
                  stackOut_9_0 = nd.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_7_0 = ci.field_e;
                  stackIn_10_0 = stackOut_7_0;
                  break L2;
                }
              }
              var14 = stackIn_10_0;
              var13 = var14;
              var12 = var13;
              var11 = var12;
              var10 = var11;
              fe.c(var9, db.a(true, ((rk) this).field_F.field_k), u.a(var3, (byte) 94), var14, true);
              return;
            } else {
              break L1;
            }
          }
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            ((rk) this).field_C = new ft(25, 33);
            ((rk) this).field_V = new ft(614, 446);
            ((rk) this).field_A = 0;
            ((rk) this).field_e = 128;
            if (wb.field_b == null) {
              break L1;
            } else {
              if (7 <= wb.field_b.length) {
                ((rk) this).field_a = wb.field_b[7];
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((rk) this).field_a = null;
          break L0;
        }
        L2: {
          ((rk) this).field_F = new ft(so.field_b.field_a >> 1, so.field_b.field_g >> 1);
          ((rk) this).field_x = new ft(42, 63);
          ((rk) this).field_K = new ft(597, 417);
          ((rk) this).n(99);
          ((rk) this).field_cb = 3223077;
          if (il.field_t == null) {
            break L2;
          } else {
            L3: {
              if (il.field_t.length <= 8) {
                ((rk) this).field_O = null;
                break L3;
              } else {
                ((rk) this).field_O = il.field_t[8];
                break L3;
              }
            }
            L4: {
              if (il.field_t.length > 22) {
                ((rk) this).field_k = il.field_t[22];
                break L4;
              } else {
                ((rk) this).field_k = null;
                break L4;
              }
            }
            if (il.field_t.length <= 23) {
              ((rk) this).field_eb = null;
              break L2;
            } else {
              ((rk) this).field_eb = il.field_t[23];
              break L2;
            }
          }
        }
        L5: {
          ((rk) this).field_bb = 58;
          ((rk) this).field_t = 578;
          if (param0 > 6) {
            break L5;
          } else {
            boolean discarded$5 = this.c(66, 56);
            break L5;
          }
        }
        var2 = ((rk) this).field_x.field_n;
        int discarded$6 = 70;
        var3 = this.b();
        var4 = this.a(true);
        ((rk) this).field_m = 583;
        ((rk) this).field_T = var4 + var2 - -(var3 >> 1);
        ((rk) this).field_i = 56;
        ((rk) this).field_Y = var2 - -var3;
        ((rk) this).field_E = this.i(112);
        ((rk) this).field_g = ((rk) this).field_E;
        ((rk) this).field_l = 14540255;
        ((rk) this).field_db = 14;
        ((rk) this).field_z = 14398754;
        ((rk) this).field_hb = new hh(0, 256, 100);
        ((rk) this).field_u = new em(256);
        ((rk) this).field_H = new em(100);
        ((rk) this).field_J = new int[4];
        int discarded$7 = -11195;
        this.f();
        int discarded$8 = 28;
        this.i();
        this.c((byte) -109);
        int discarded$9 = -7;
        this.j();
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, jd param5, jd param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            uf.field_j.b();
            qn.b();
            fe.b(0, 0, 134, 61, io.field_m, nd.field_b, 0, 0);
            qt.field_e.b(2, 2);
            qn.b(5, 5, 124, 18, 0, 192);
            if (param4 >= 70) {
              L1: {
                qn.b(5, 25, 30, 30, 0, 192);
                en.field_E.b(dn.field_Pb[param5.field_N], 10, 17, op.field_c[0][param5.field_O], -1);
                en.field_E.a(param5.field_A + param5.field_Y + "/" + param5.field_t, 126, 18, op.field_c[0][param5.field_O], -1);
                if (param5.field_O != param2) {
                  if (null != param6) {
                    qn.b(37, 25, 92, 30, 0, 128);
                    ro.field_rb[param6.g(0)].a(43, 32);
                    sg.field_b[this.a(param6.g(0), (byte) -6, param5.g(0))].a(75, 32);
                    break L1;
                  } else {
                    qn.b(99, 25, 30, 30, 0, 128);
                    break L1;
                  }
                } else {
                  qn.b(99, 25, 30, 30, 0, 128);
                  qn.b(52, 25, 30, 30, 0, 128);
                  var9_int = param5.l(-27014);
                  cp.field_e[eb.a((byte) -126, ~var9_int & 3)].a(56, 25);
                  break L1;
                }
              }
              ro.field_rb[param5.g(0)].a(106, 32);
              en.field_E.c(100 + -param3 + "%", 20, 45, 16777215, -1);
              vb.field_t.b(68, 60, nd.field_b[-1 + nd.field_b.length]);
              so.field_b.a(5605);
              uf.field_j.e(db.a(true, param1), u.a(param7, (byte) 94), 256);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var9;
            stackOut_11_1 = new StringBuilder().append("rk.R(").append(0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param7 + 41);
        }
    }

    private final ft b(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          if (param2 == 0) {
            break L0;
          } else {
            if (param2 == 1) {
              break L0;
            } else {
              this.c(50, param1, param4);
              return null;
            }
          }
        }
        return this.a(param2, 4, -90);
    }

    private final ft a(int param0, int param1, int param2, int param3, int param4) {
        if (null != uf.field_j) {
          if (param1 == 0) {
            return new ft(uf.field_j.field_A, uf.field_j.field_x);
          } else {
            if (param1 != 1) {
              L0: {
                if (param1 == 2) {
                  this.a(param0, param3, param2, -19556);
                  break L0;
                } else {
                  break L0;
                }
              }
              return null;
            } else {
              return new ft(0, 0);
            }
          }
        } else {
          return null;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        L0: {
          if (null == ((rk) this).field_s) {
            break L0;
          } else {
            ((rk) this).field_s.a(0, (byte) -50);
            break L0;
          }
        }
        if (((rk) this).field_L == null) {
          return;
        } else {
          L1: {
            if (!((rk) this).field_L.c(param0 + -39)) {
              break L1;
            } else {
              ((rk) this).field_L.b(17);
              break L1;
            }
          }
          L2: {
            if (param0 == 38) {
              break L2;
            } else {
              ((rk) this).field_cb = 104;
              break L2;
            }
          }
          L3: {
            var2 = 0;
            if (((rk) this).field_L.field_a < 100) {
              break L3;
            } else {
              if (((rk) this).field_L.field_a > 250) {
                break L3;
              } else {
                var2 = 5;
                break L3;
              }
            }
          }
          L4: {
            if (null != ((rk) this).field_fb) {
              ((rk) this).field_fb.a(var2, (byte) -50);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final int o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          if (((rk) this).field_Z == null) {
            break L0;
          } else {
            if (((rk) this).field_n == null) {
              break L0;
            } else {
              if (((rk) this).field_R == null) {
                break L0;
              } else {
                if (null == ((rk) this).field_b) {
                  break L0;
                } else {
                  L1: {
                    if (((rk) this).field_R.field_n < ((rk) this).field_Z.field_n) {
                      stackOut_10_0 = ((rk) this).field_R.field_n;
                      stackIn_11_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_8_0 = ((rk) this).field_Z.field_n;
                      stackIn_11_0 = stackOut_8_0;
                      break L1;
                    }
                  }
                  L2: {
                    var2 = stackIn_11_0;
                    if (((rk) this).field_Z.field_n >= ((rk) this).field_R.field_n) {
                      stackOut_14_0 = ((rk) this).field_Z.field_n;
                      stackIn_15_0 = stackOut_14_0;
                      break L2;
                    } else {
                      stackOut_12_0 = ((rk) this).field_R.field_n;
                      stackIn_15_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  L3: {
                    var3 = stackIn_15_0;
                    if (param0 < ~var2) {
                      break L3;
                    } else {
                      if (0 > var3) {
                        break L3;
                      } else {
                        if (var3 <= var2) {
                          break L3;
                        } else {
                          return -var2 + var3;
                        }
                      }
                    }
                  }
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    private final ft a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        L0: {
          if (param5 == 0) {
            break L0;
          } else {
            if (param5 == 1) {
              break L0;
            } else {
              this.c(param0, param2, -31550, param1, param6);
              return null;
            }
          }
        }
        return this.a(param5, param3, 110);
    }

    private final void g() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        String var13 = null;
        int[] var14 = null;
        String var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] stackIn_6_0 = null;
        int[] stackIn_14_0 = null;
        int[] stackOut_5_0 = null;
        int[] stackOut_3_0 = null;
        int[] stackOut_13_0 = null;
        int[] stackOut_11_0 = null;
        var2 = ((rk) this).field_R.field_k;
        var3 = ((rk) this).field_R.field_n;
        var4 = ((rk) this).field_b.field_k - var2;
        var5 = ((rk) this).field_b.field_n + -var3;
        qn.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, ((rk) this).field_A, ((rk) this).field_e);
        var6 = ((rk) this).field_R.field_n;
        L0: {
          var7 = ((rk) this).field_b.field_n;
          var3 = var6 + var7 >> 1;
          int discarded$2 = 21695;
          var8 = this.a();
          var3 = var3 - -var8;
          var2 = ((rk) this).field_bb;
          var13 = ((rk) this).field_k;
          if (((rk) this).field_j) {
            stackOut_5_0 = ci.field_e;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          } else {
            stackOut_3_0 = nd.field_b;
            stackIn_6_0 = stackOut_3_0;
            break L0;
          }
        }
        L1: {
          var18 = stackIn_6_0;
          var17 = var18;
          var16 = var17;
          var14 = var16;
          var11 = var14;
          var10 = var11;
          if (!((rk) this).field_o) {
            break L1;
          } else {
            if (var13 == null) {
              break L1;
            } else {
              if (var13.length() <= 0) {
                break L1;
              } else {
                fe.a(var13, db.a(true, var2), u.a(var3, (byte) 94), var18, true);
                break L1;
              }
            }
          }
        }
        L2: {
          if (((rk) this).field_Q) {
            stackOut_13_0 = ci.field_e;
            stackIn_14_0 = stackOut_13_0;
            break L2;
          } else {
            stackOut_11_0 = nd.field_b;
            stackIn_14_0 = stackOut_11_0;
            break L2;
          }
        }
        L3: {
          var12 = stackIn_14_0;
          var10 = var12;
          var2 = ((rk) this).field_t;
          var15 = ((rk) this).field_eb;
          if (!((rk) this).field_I) {
            break L3;
          } else {
            if (var15 == null) {
              break L3;
            } else {
              if (var15.length() <= 0) {
                break L3;
              } else {
                int discarded$3 = 1;
                fe.b(var15, db.a(true, var2), u.a(var3, (byte) 94), var12);
                break L3;
              }
            }
          }
        }
        var2 = ((rk) this).field_F.field_k;
        var9 = qk.a(((rk) this).field_p, -2823, ((rk) this).field_N);
        fe.c(var9, db.a(true, var2), u.a(var3, (byte) 94), ci.field_e, true);
    }

    private final int d() {
        return rs.field_n.field_L + rs.field_n.field_H;
    }

    private final void c(int param0, int param1, int param2) {
        if (null != ((rk) this).field_v) {
            ((rk) this).field_v.a(db.a(true, 40 + param1), u.a(param2 + 50, (byte) 94), (byte) -117);
            ((rk) this).field_v.a((byte) -72, false);
            nb.a(db.a(true, param1), u.a(param2 + 38, (byte) 94), (byte) -97, (jd) null);
        }
    }

    final ft e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        if (((rk) this).field_Z != null) {
          if (null != ((rk) this).field_n) {
            if (null != ((rk) this).field_R) {
              if (null != ((rk) this).field_b) {
                L0: {
                  if (((rk) this).field_R.field_k < ((rk) this).field_Z.field_k) {
                    stackOut_17_0 = ((rk) this).field_R.field_k;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    stackOut_15_0 = ((rk) this).field_Z.field_k;
                    stackIn_18_0 = stackOut_15_0;
                    break L0;
                  }
                }
                L1: {
                  var2 = stackIn_18_0;
                  var3 = -47 % ((param0 - 32) / 46);
                  if (((rk) this).field_R.field_n < ((rk) this).field_Z.field_n) {
                    stackOut_21_0 = ((rk) this).field_R.field_n;
                    stackIn_22_0 = stackOut_21_0;
                    break L1;
                  } else {
                    stackOut_19_0 = ((rk) this).field_Z.field_n;
                    stackIn_22_0 = stackOut_19_0;
                    break L1;
                  }
                }
                var4 = stackIn_22_0;
                if (var2 >= 0) {
                  if (var4 >= 0) {
                    return new ft(var2, var4);
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final ft b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != gt.field_c) {
          if (param0 != 0) {
            if (param0 == 1) {
              return new ft(0, 0);
            } else {
              return null;
            }
          } else {
            var3 = 150;
            var4 = -1;
            var5 = 0;
            L0: while (true) {
              if (gt.field_c.length <= var5) {
                L1: {
                  if (0 > var3) {
                    break L1;
                  } else {
                    if (var4 < 0) {
                      break L1;
                    } else {
                      return new ft(var3, var4);
                    }
                  }
                }
                return new ft(0, 0);
              } else {
                L2: {
                  var6 = gt.field_c[var5].field_A;
                  var6 = var6 >> 1;
                  var7 = gt.field_c[var5].field_x;
                  if (0 <= var3) {
                    break L2;
                  } else {
                    if (var6 < 0) {
                      break L2;
                    } else {
                      var3 = var6;
                      break L2;
                    }
                  }
                }
                L3: {
                  var7 = var7 >> 1;
                  if (var6 <= var3) {
                    break L3;
                  } else {
                    var3 = var6;
                    break L3;
                  }
                }
                L4: {
                  if (0 <= var4) {
                    break L4;
                  } else {
                    if (var7 >= 0) {
                      var4 = var7;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var7 > var4) {
                  var4 = var7;
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    private final jd b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        jd var13 = null;
        var5 = 0;
        var6 = 0;
        if (param3 >= 0) {
          if (param3 < op.field_c.length) {
            if (param0 >= 0) {
              if (param0 < bw.field_m.length) {
                L0: {
                  var7 = bw.field_m[param0][4];
                  var8 = -1 + var7;
                  if (var8 <= 0) {
                    var8 = 1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var9 = 1;
                var10 = 0;
                var11 = null;
                var12 = 1;
                var13 = new jd(var5, var6, param0, param3, var7, var8, var9, 0, var10, (ha) var11, 0, 0, -1, var12 != 0, 0);
                return var13;
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          if (null == ((rk) this).field_w) {
            break L0;
          } else {
            if (((rk) this).field_w.length == 0) {
              break L0;
            } else {
              L1: {
                if (0 > param1) {
                  break L1;
                } else {
                  if (param1 >= ((rk) this).field_w.length) {
                    break L1;
                  } else {
                    L2: {
                      if (!param0) {
                        break L2;
                      } else {
                        int discarded$1 = ((rk) this).a(false, -94);
                        break L2;
                      }
                    }
                    L3: {
                      if (((rk) this).field_n == null) {
                        break L3;
                      } else {
                        if (((rk) this).field_b == null) {
                          break L3;
                        } else {
                          var3 = ((rk) this).field_w[param1];
                          if (22 == var3) {
                            return -1 + (so.field_b.field_a >> 1);
                          } else {
                            if (var3 == 23) {
                              L4: {
                                if (param0) {
                                  stackOut_24_0 = 0;
                                  stackIn_25_0 = stackOut_24_0;
                                  break L4;
                                } else {
                                  stackOut_22_0 = 1;
                                  stackIn_25_0 = stackOut_22_0;
                                  break L4;
                                }
                              }
                              return db.a(stackIn_25_0 != 0, ((rk) this).field_b.field_k);
                            } else {
                              if (var3 != 8) {
                                return 1;
                              } else {
                                return db.a(true, ((rk) this).field_n.field_k);
                              }
                            }
                          }
                        }
                      }
                    }
                    return 1;
                  }
                }
              }
              return 1;
            }
          }
        }
        return 1;
    }

    private final void j() {
        ((rk) this).field_v = null;
        ((rk) this).field_v = new hr(25);
    }

    private final int a() {
        return (nr.field_e.field_y >> 2) + -nr.field_e.field_L + nr.field_e.field_v + (-(nr.field_e.field_H >> 1) - -3);
    }

    private final void a(wk param0, int param1, int param2, wk param3) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        wk var19 = null;
        wk var20 = null;
        int var21 = 0;
        int var22 = 0;
        wk var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var27 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (param1 >= ue.field_k.length) {
                  break L1;
                } else {
                  if (hr.field_d.length <= param1 - -1) {
                    break L1;
                  } else {
                    if (gt.field_c.length <= param1) {
                      break L1;
                    } else {
                      L2: {
                        if (null == param3) {
                          break L2;
                        } else {
                          if (null == param0) {
                            break L2;
                          } else {
                            if (((rk) this).field_J != null) {
                              L3: {
                                qn.b(((rk) this).field_J);
                                param3.b();
                                qn.b();
                                var7_int = ((rk) this).field_hb.a(-122) ? 1 : 0;
                                var8 = ((rk) this).field_hb.c(-1953891327);
                                var9 = ((rk) this).field_hb.field_b;
                                var8 = var9;
                                var10 = var9 >> 1;
                                var11 = var8;
                                var12 = var8;
                                var13 = (int)((double)var10 - Math.cos((double)var11 * 3.141592653589793 / (double)var9) * (double)var10);
                                var14 = (int)(-((double)var10 * Math.cos(3.141592653589793 * (double)var12 / (double)var9)) + (double)var10);
                                if (var7_int != 0) {
                                  stackOut_16_0 = -1;
                                  stackIn_17_0 = stackOut_16_0;
                                  break L3;
                                } else {
                                  stackOut_14_0 = param1;
                                  stackIn_17_0 = stackOut_14_0;
                                  break L3;
                                }
                              }
                              L4: {
                                var15 = stackIn_17_0;
                                if (var7_int != 0) {
                                  stackOut_20_0 = param1;
                                  stackIn_21_0 = stackOut_20_0;
                                  break L4;
                                } else {
                                  stackOut_18_0 = -1;
                                  stackIn_21_0 = stackOut_18_0;
                                  break L4;
                                }
                              }
                              L5: {
                                var16 = stackIn_21_0;
                                var17 = -19;
                                var18 = -22;
                                var19 = ue.field_k[1 + param1];
                                if (var15 != param1) {
                                  if (param1 != var16) {
                                    break L5;
                                  } else {
                                    var19.f(0, 0, -var14 + var9);
                                    break L5;
                                  }
                                } else {
                                  var19.f(0, 0, var9 + -var13);
                                  break L5;
                                }
                              }
                              L6: {
                                var19.f(0, 0, var9);
                                var20 = hr.field_d[param1 - -1];
                                var20.g(-var17, -var18);
                                if (var15 != param1) {
                                  if (param1 != var16) {
                                    break L6;
                                  } else {
                                    var20.f(-var17, -var18, var9 + -var14);
                                    break L6;
                                  }
                                } else {
                                  var20.f(-var17, -var18, -var13 + var9);
                                  break L6;
                                }
                              }
                              var21 = -12;
                              var22 = -17;
                              var24 = -105;
                              var23 = gt.field_c[1 + param1];
                              var23.g(var21 + -var17, var22 + -var18);
                              so.field_b.a(5605);
                              qn.a(((rk) this).field_J);
                              qn.b(((rk) this).field_J);
                              param0.b();
                              qn.b();
                              var25 = param0.field_A;
                              var26 = param0.field_x;
                              param3.d(0, 0, var25, var26);
                              so.field_b.a(5605);
                              qn.a(((rk) this).field_J);
                              fe.a(param0);
                              param0.a();
                              break L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var7;
            stackOut_33_1 = new StringBuilder().append("rk.GC(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L7;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L7;
            }
          }
          L8: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44).append(param1).append(44).append(0).append(44);
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param3 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + -110 + 44 + 0 + 41);
        }
    }

    private final int b() {
        return nr.field_e.field_H - -nr.field_e.field_L >> 1;
    }

    private final ft a(int param0, int param1, int param2) {
        int var4 = 0;
        if (param0 == 0) {
          return new ft(80, param1 * 80 >> 2);
        } else {
          if (param0 != 1) {
            var4 = -19 / ((param2 - -8) / 40);
            return null;
          } else {
            return new ft(0, -(80 * param1) + 320 >> 2);
          }
        }
    }

    private final wk b(int param0, int param1) {
        if (null == ((rk) this).field_X) {
            return null;
        }
        if (param1 < 0) {
            return null;
        }
        if (param1 >= ((rk) this).field_X.length) {
            return null;
        }
        return ((rk) this).field_X[param1];
    }

    private final ft a(int param0, int param1, int param2, int param3, int param4, int param5) {
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            if (param1 == 1) {
              break L0;
            } else {
              this.d(param3, param0, param4, 0, 1);
              return null;
            }
          }
        }
        return this.e(3, param1);
    }

    private final ft c(int param0, int param1, int param2, int param3) {
        L0: {
          if (param3 == 0) {
            break L0;
          } else {
            if (param3 != 1) {
              L1: {
                if (2 == param3) {
                  this.a((byte) 116, param0, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              return null;
            } else {
              break L0;
            }
          }
        }
        return this.b(param3, (byte) 16);
    }

    final ft a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        if (((rk) this).field_Z != null) {
          if (null != ((rk) this).field_n) {
            if (((rk) this).field_R != null) {
              if (null != ((rk) this).field_b) {
                L0: {
                  if (param0 == -108) {
                    break L0;
                  } else {
                    ((rk) this).field_I = true;
                    break L0;
                  }
                }
                L1: {
                  if (((rk) this).field_b.field_k <= ((rk) this).field_n.field_k) {
                    stackOut_15_0 = ((rk) this).field_n.field_k;
                    stackIn_16_0 = stackOut_15_0;
                    break L1;
                  } else {
                    stackOut_13_0 = ((rk) this).field_b.field_k;
                    stackIn_16_0 = stackOut_13_0;
                    break L1;
                  }
                }
                L2: {
                  var2 = stackIn_16_0;
                  if (((rk) this).field_n.field_n >= ((rk) this).field_b.field_n) {
                    stackOut_19_0 = ((rk) this).field_n.field_n;
                    stackIn_20_0 = stackOut_19_0;
                    break L2;
                  } else {
                    stackOut_17_0 = ((rk) this).field_b.field_n;
                    stackIn_20_0 = stackOut_17_0;
                    break L2;
                  }
                }
                var3 = stackIn_20_0;
                if (var2 >= 0) {
                  if (var3 >= 0) {
                    return new ft(var2, var3);
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final ft a(byte param0, int param1, int param2, wk param3, int param4, ru param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_6_0 = null;
        ft stackIn_12_0 = null;
        ft stackIn_24_0 = null;
        ft stackIn_30_0 = null;
        int stackIn_42_0 = 0;
        ft stackIn_52_0 = null;
        Object stackIn_54_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        ft stackOut_11_0 = null;
        ft stackOut_51_0 = null;
        ft stackOut_23_0 = null;
        ft stackOut_29_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        Object stackOut_53_0 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = -1;
              if (null != param3) {
                break L1;
              } else {
                if (param5 != null) {
                  break L1;
                } else {
                  stackOut_5_0 = null;
                  stackIn_6_0 = stackOut_5_0;
                  return (ft) (Object) stackIn_6_0;
                }
              }
            }
            L2: {
              if (null == param3) {
                break L2;
              } else {
                if (param2 != 0) {
                  break L2;
                } else {
                  stackOut_11_0 = new ft(param3.field_A, param3.field_v);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
            L3: {
              if (param5 == null) {
                break L3;
              } else {
                if (param2 == 0) {
                  stackOut_51_0 = new ft(param5.field_g, param5.field_h);
                  stackIn_52_0 = stackOut_51_0;
                  return stackIn_52_0;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (null == param3) {
                break L4;
              } else {
                if (param2 != 1) {
                  break L4;
                } else {
                  stackOut_23_0 = new ft(0, 0);
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0;
                }
              }
            }
            L5: {
              if (param5 == null) {
                break L5;
              } else {
                if (1 != param2) {
                  break L5;
                } else {
                  stackOut_29_0 = new ft(0, 0);
                  stackIn_30_0 = stackOut_29_0;
                  return stackIn_30_0;
                }
              }
            }
            L6: {
              if (null != param3) {
                break L6;
              } else {
                if (param5 != null) {
                  break L6;
                } else {
                  return null;
                }
              }
            }
            L7: {
              if (null != param5) {
                stackOut_41_0 = -param5.field_d + param4;
                stackIn_42_0 = stackOut_41_0;
                break L7;
              } else {
                stackOut_39_0 = -param3.field_z + param4;
                stackIn_42_0 = stackOut_39_0;
                break L7;
              }
            }
            L8: {
              param4 = stackIn_42_0;
              if (param3 != null) {
                param3.g(db.a(true, param1), u.a(param4, (byte) 94));
                break L8;
              } else {
                if (null != param5) {
                  param5.a(db.a(true, param1), u.a(param4, (byte) 94));
                  break L8;
                } else {
                  return null;
                }
              }
            }
            stackOut_53_0 = null;
            stackIn_54_0 = stackOut_53_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var7;
            stackOut_55_1 = new StringBuilder().append("rk.DA(").append(114).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param3 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L9;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L9;
            }
          }
          L10: {
            stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(44).append(param4).append(44);
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param5 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L10;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 41);
        }
        return (ft) (Object) stackIn_54_0;
    }

    final static void e(int param0) {
        bj var1 = null;
        int var2 = 0;
        bv var3 = null;
        var2 = 122 % ((param0 - -31) / 56);
        var1 = (bj) (Object) jm.field_o.e((byte) 126);
        if (var1 == null) {
          dj.a((byte) -128);
          return;
        } else {
          var3 = mg.field_e;
          int discarded$4 = var3.i(1);
          int discarded$5 = var3.i(1);
          int discarded$6 = var3.i(1);
          int discarded$7 = var3.i(1);
          var1.d(-115);
          return;
        }
    }

    private final int i(int param0) {
        int var2 = 0;
        return rs.field_n.field_L + rs.field_n.field_H;
    }

    private final int h(int param0) {
        return 3 + nr.field_e.field_v + -nr.field_e.field_L - (nr.field_e.field_H >> 1);
    }

    private final void j(int param0) {
        int var2 = 0;
        wp var3 = null;
        L0: {
          if (param0 == -302977872) {
            break L0;
          } else {
            ((rk) this).field_hb = null;
            break L0;
          }
        }
        L1: {
          if (((rk) this).field_ab == null) {
            int discarded$15 = -11195;
            this.f();
            break L1;
          } else {
            boolean discarded$16 = ((rk) this).field_ab.a(-118);
            var2 = ((rk) this).field_ab.field_i >> 16;
            int discarded$17 = 1;
            var3 = we.a(var2);
            if (((rk) this).field_ab == null) {
              var3 = null;
              return;
            } else {
              int discarded$18 = -34;
              io.a(var3);
              break L1;
            }
          }
        }
    }

    private final ft a(int param0, int param1, int param2, int param3, wk param4) {
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        ft stackIn_6_0 = null;
        ft stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ft stackOut_13_0 = null;
        Object stackOut_17_0 = null;
        ft stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (param4 != null) {
              if (0 == param0) {
                stackOut_13_0 = new ft(param4.field_A >> 1, param4.field_v >> 1);
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              } else {
                if (param0 != 1) {
                  L1: {
                    if (null != param4) {
                      param3 = param3 - param4.field_z;
                      if (param4 == null) {
                        break L1;
                      } else {
                        param4.h(db.a(true, param2), u.a(param3, (byte) 94));
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  if (param1 != 26823) {
                    stackOut_17_0 = null;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  stackOut_5_0 = new ft(0, 0);
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ft) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("rk.GA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return (ft) (Object) stackIn_18_0;
    }

    public static void q() {
        field_y = null;
        field_gb = null;
        field_c = null;
    }

    private final ft a(boolean param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        L0: {
          if (param5 == 0) {
            break L0;
          } else {
            if (param5 == 1) {
              break L0;
            } else {
              this.a(8, 0, param7, true, -1, param3);
              return null;
            }
          }
        }
        return this.a(param5, 4, 95);
    }

    private final int h() {
        return nr.field_e.field_v - nr.field_e.field_L - (nr.field_e.field_H - ((nr.field_e.field_y >> 1) + 3));
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        L0: {
          if (l.field_b == null) {
            break L0;
          } else {
            if (l.field_b.length < -1) {
              L1: {
                if (null == l.field_b) {
                  break L1;
                } else {
                  if (-1 > param1) {
                    break L1;
                  } else {
                    if (l.field_b.length <= param1) {
                      break L1;
                    } else {
                      if (null != l.field_b[param1]) {
                        l.field_b[param1].d(db.a(true, param0), u.a(-20 + param4, (byte) 94));
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ru var12 = null;
        int var13 = 0;
        L0: {
          var13 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (nr.field_c == null) {
            break L0;
          } else {
            if (nr.field_c.length <= 0) {
              break L0;
            } else {
              if (null == nr.field_c[0]) {
                break L0;
              } else {
                param2 = param2 << 8 | param2;
                var7 = param2 >> 1 ^ param2;
                var10 = 0;
                L1: while (true) {
                  if (var10 >= 4) {
                    return;
                  } else {
                    L2: {
                      var9 = -64 + ((param2 & 3) - -20);
                      var8 = -44 + ((7 & var7) + bm.field_y[var10][0] + 40);
                      if (var10 != 0) {
                        var9 = var9 + bm.field_y[var10][1];
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      var8 = var8 >> 1;
                      var9 = var9 >> 1;
                      var11 = -1;
                      if (var10 == 0) {
                        var11 = 16 + param2 % 9;
                        break L3;
                      } else {
                        var11 = param2 % 9 + 25;
                        break L3;
                      }
                    }
                    var7 = var7 >> 1;
                    param2 = param2 >> 1;
                    if (0 <= var11) {
                      if (nr.field_c.length > var11) {
                        if (nr.field_c[var11] != null) {
                          var12 = nr.field_c[var11];
                          var12.d(db.a(true, var8 + param4), u.a(var9 + param5, (byte) 94));
                          var10++;
                          continue L1;
                        } else {
                          var10++;
                          continue L1;
                        }
                      } else {
                        var10++;
                        continue L1;
                      }
                    } else {
                      var10++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final ft a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        Object var7 = null;
        Object var8 = null;
        L0: {
          if (param5 == 0) {
            break L0;
          } else {
            if (param5 == 1) {
              break L0;
            } else {
              if (2 == param5) {
                break L0;
              } else {
                return null;
              }
            }
          }
        }
        var7 = null;
        if (param1 >= 32) {
          L1: {
            var8 = null;
            if (((rk) this).field_N != 0) {
              break L1;
            } else {
              if (param4 == 1) {
                return this.a(param0, 0, 7, 2, true, param5, param3);
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (((rk) this).field_N != 2) {
              break L2;
            } else {
              if (4 != param4) {
                break L2;
              } else {
                int discarded$2 = 0;
                return this.d(param3, param5, param0);
              }
            }
          }
          L3: {
            L4: {
              if (((rk) this).field_N != 3) {
                break L4;
              } else {
                if (param4 == 1) {
                  var8 = (Object) (Object) this.f(0, 0);
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (((rk) this).field_N != 3) {
                break L5;
              } else {
                if (2 != param4) {
                  break L5;
                } else {
                  var8 = (Object) (Object) this.f(0, 1);
                  break L3;
                }
              }
            }
            L6: {
              if (((rk) this).field_N != 3) {
                break L6;
              } else {
                if (3 != param4) {
                  break L6;
                } else {
                  var8 = (Object) (Object) this.f(0, 2);
                  break L3;
                }
              }
            }
            L7: {
              if (3 != ((rk) this).field_N) {
                break L7;
              } else {
                if (param4 == 4) {
                  var8 = (Object) (Object) this.f(0, 3);
                  break L3;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (4 != ((rk) this).field_N) {
                break L8;
              } else {
                if (param4 != 0) {
                  break L8;
                } else {
                  var8 = (Object) (Object) this.f(0, 5);
                  break L3;
                }
              }
            }
            L9: {
              if (((rk) this).field_N != 4) {
                break L9;
              } else {
                if (param4 == 1) {
                  var8 = (Object) (Object) this.f(0, 4);
                  break L3;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (((rk) this).field_N != 4) {
                break L10;
              } else {
                if (2 == param4) {
                  var8 = (Object) (Object) this.f(0, 6);
                  break L3;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              if (((rk) this).field_N != 4) {
                break L11;
              } else {
                if (param4 == 3) {
                  var8 = (Object) (Object) this.f(0, 7);
                  break L3;
                } else {
                  break L11;
                }
              }
            }
            L12: {
              if (((rk) this).field_N != 5) {
                break L12;
              } else {
                if (3 != param4) {
                  break L12;
                } else {
                  return this.a(param3, param5, param0, 0, -3);
                }
              }
            }
            L13: {
              if (5 != ((rk) this).field_N) {
                break L13;
              } else {
                if (param4 == 4) {
                  return this.a(param3, param5, param0, 1, -3);
                } else {
                  break L13;
                }
              }
            }
            L14: {
              if (((rk) this).field_N != 6) {
                break L14;
              } else {
                if (1 == param4) {
                  return this.a(true, 8, 4, param3, (byte) 74, param5, 0, param0);
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if (6 != ((rk) this).field_N) {
                break L15;
              } else {
                if (param4 != 2) {
                  break L15;
                } else {
                  return this.a(param0, 0, 9, 4, true, param5, param3);
                }
              }
            }
            L16: {
              if (((rk) this).field_N != 6) {
                break L16;
              } else {
                if (param4 == 3) {
                  return this.a(param0, 0, 7, 4, true, param5, param3);
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if (((rk) this).field_N != 7) {
                break L17;
              } else {
                if (param4 != 1) {
                  break L17;
                } else {
                  return this.a(param0, -1, 8, 3, true, param5, param3);
                }
              }
            }
            L18: {
              if (7 != ((rk) this).field_N) {
                break L18;
              } else {
                if (param4 == 2) {
                  return this.a(param0, 0, 7, 3, true, param5, param3);
                } else {
                  break L18;
                }
              }
            }
            L19: {
              if (((rk) this).field_N != 7) {
                break L19;
              } else {
                if (param4 == 3) {
                  return this.a(param0, -1, 9, 3, true, param5, param3);
                } else {
                  break L19;
                }
              }
            }
            L20: {
              if (8 != ((rk) this).field_N) {
                break L20;
              } else {
                if (3 == param4) {
                  return this.c(param3, param0, -116, param5);
                } else {
                  break L20;
                }
              }
            }
            L21: {
              if (((rk) this).field_N != 9) {
                break L21;
              } else {
                if (param2 != 0) {
                  break L21;
                } else {
                  if (param4 != 1) {
                    break L21;
                  } else {
                    return this.a(param5, 26823, param3, param0, bj.field_p[0]);
                  }
                }
              }
            }
            L22: {
              if (9 != ((rk) this).field_N) {
                break L22;
              } else {
                if (param2 != 0) {
                  break L22;
                } else {
                  if (2 != param4) {
                    break L22;
                  } else {
                    return this.a(param5, 26823, param3, param0, bj.field_p[2]);
                  }
                }
              }
            }
            L23: {
              if (((rk) this).field_N != 9) {
                break L23;
              } else {
                if (0 != param2) {
                  break L23;
                } else {
                  if (param4 == 3) {
                    return this.a(param5, 26823, param3, param0, bj.field_p[1]);
                  } else {
                    break L23;
                  }
                }
              }
            }
            L24: {
              if (((rk) this).field_N != 9) {
                break L24;
              } else {
                if (param2 != 0) {
                  break L24;
                } else {
                  if (param4 != 4) {
                    break L24;
                  } else {
                    return this.a(param5, 26823, param3, param0, bj.field_p[3]);
                  }
                }
              }
            }
            L25: {
              if (((rk) this).field_N != 9) {
                break L25;
              } else {
                if (param2 != 1) {
                  break L25;
                } else {
                  if (param4 != 0) {
                    break L25;
                  } else {
                    return this.a(param3, param5, 0, param0, 0, 2);
                  }
                }
              }
            }
            L26: {
              if (9 != ((rk) this).field_N) {
                break L26;
              } else {
                if (param2 != 1) {
                  break L26;
                } else {
                  if (param4 != 1) {
                    break L26;
                  } else {
                    return this.a(param3, param5, 0, param0, 1, 2);
                  }
                }
              }
            }
            L27: {
              if (((rk) this).field_N != 9) {
                break L27;
              } else {
                if (param2 != 1) {
                  break L27;
                } else {
                  if (param4 == 2) {
                    return this.a(param3, param5, 0, param0, 4, 2);
                  } else {
                    break L27;
                  }
                }
              }
            }
            L28: {
              if (((rk) this).field_N != 9) {
                break L28;
              } else {
                if (param2 != 1) {
                  break L28;
                } else {
                  if (param4 == 3) {
                    return this.a(param3, param5, 0, param0, 3, 2);
                  } else {
                    break L28;
                  }
                }
              }
            }
            L29: {
              if (((rk) this).field_N != 10) {
                break L29;
              } else {
                if (param4 == 0) {
                  return this.a(param3, param5, 0, param0, 2, 2);
                } else {
                  break L29;
                }
              }
            }
            L30: {
              if (10 != ((rk) this).field_N) {
                break L30;
              } else {
                if (param4 == 1) {
                  return this.a(param3, param5, 0, param0, 5, 2);
                } else {
                  break L30;
                }
              }
            }
            L31: {
              if (((rk) this).field_N != 10) {
                break L31;
              } else {
                if (param4 == 2) {
                  return this.a(param3, param5, 0, param0, 6, 2);
                } else {
                  break L31;
                }
              }
            }
            L32: {
              if (10 != ((rk) this).field_N) {
                break L32;
              } else {
                if (param4 == 3) {
                  return this.a(param3, param5, 0, param0, 8, 2);
                } else {
                  break L32;
                }
              }
            }
            L33: {
              if (((rk) this).field_N != 10) {
                break L33;
              } else {
                if (param4 != 4) {
                  break L33;
                } else {
                  return this.a(param3, param5, 0, param0, 12, 2);
                }
              }
            }
            L34: {
              if (((rk) this).field_N != 10) {
                break L34;
              } else {
                if (5 != param4) {
                  break L34;
                } else {
                  return this.a(param3, param5, 0, param0, 14, 2);
                }
              }
            }
            L35: {
              if (((rk) this).field_N != 11) {
                break L35;
              } else {
                if (param4 == 1) {
                  return this.a(param0, -1, 8, 3, true, param5, param3);
                } else {
                  break L35;
                }
              }
            }
            L36: {
              if (11 != ((rk) this).field_N) {
                break L36;
              } else {
                if (param4 != 2) {
                  break L36;
                } else {
                  return this.a(param0, 0, 7, 3, true, param5, param3);
                }
              }
            }
            L37: {
              if (11 != ((rk) this).field_N) {
                break L37;
              } else {
                if (param4 != 3) {
                  break L37;
                } else {
                  return this.a(param0, -1, 9, 3, true, param5, param3);
                }
              }
            }
            L38: {
              if (12 != ((rk) this).field_N) {
                break L38;
              } else {
                if (param4 != 1) {
                  break L38;
                } else {
                  var7 = (Object) (Object) this.b(20255, 0);
                  break L3;
                }
              }
            }
            L39: {
              if (((rk) this).field_N != 12) {
                break L39;
              } else {
                if (2 != param4) {
                  break L39;
                } else {
                  var7 = (Object) (Object) this.b(20255, 1);
                  break L3;
                }
              }
            }
            L40: {
              if (12 != ((rk) this).field_N) {
                break L40;
              } else {
                if (param4 != 3) {
                  break L40;
                } else {
                  var7 = (Object) (Object) this.b(20255, 2);
                  break L3;
                }
              }
            }
            L41: {
              if (13 != ((rk) this).field_N) {
                break L41;
              } else {
                if (param4 == 1) {
                  var7 = (Object) (Object) this.b(20255, 0);
                  break L3;
                } else {
                  break L41;
                }
              }
            }
            L42: {
              if (13 != ((rk) this).field_N) {
                break L42;
              } else {
                if (param4 != 2) {
                  break L42;
                } else {
                  var7 = (Object) (Object) this.b(20255, 1);
                  break L3;
                }
              }
            }
            L43: {
              if (((rk) this).field_N != 13) {
                break L43;
              } else {
                if (param4 != 3) {
                  break L43;
                } else {
                  var7 = (Object) (Object) this.b(20255, 2);
                  break L3;
                }
              }
            }
            L44: {
              if (((rk) this).field_N != 16) {
                break L44;
              } else {
                if (param4 != 1) {
                  break L44;
                } else {
                  int discarded$3 = 4;
                  return this.e(-94, param5, param3, param0);
                }
              }
            }
            L45: {
              if (((rk) this).field_N != 16) {
                break L45;
              } else {
                if (2 != param4) {
                  break L45;
                } else {
                  return this.a(param0, 0, 14, 3, true, param5, param3);
                }
              }
            }
            L46: {
              if (((rk) this).field_N != 16) {
                break L46;
              } else {
                if (param4 != 3) {
                  break L46;
                } else {
                  return this.b(-2, param3, param5, 4, param0);
                }
              }
            }
            if (gv.field_a == null) {
              break L3;
            } else {
              if (((rk) this).field_N < 0) {
                break L3;
              } else {
                if (~gv.field_a.length >= ~((rk) this).field_N) {
                  break L3;
                } else {
                  if (null == gv.field_a[((rk) this).field_N]) {
                    break L3;
                  } else {
                    if (param2 < 0) {
                      break L3;
                    } else {
                      if (~param2 <= ~gv.field_a[((rk) this).field_N].length) {
                        break L3;
                      } else {
                        if (null == gv.field_a[((rk) this).field_N][param2]) {
                          break L3;
                        } else {
                          if (param4 < 0) {
                            break L3;
                          } else {
                            if (gv.field_a[((rk) this).field_N][param2].length <= param4) {
                              break L3;
                            } else {
                              if (null == gv.field_a[((rk) this).field_N][param2][param4]) {
                                break L3;
                              } else {
                                var7 = (Object) (Object) gv.field_a[((rk) this).field_N][param2][param4];
                                break L3;
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
          }
          L47: {
            if (var7 != null) {
              break L47;
            } else {
              if (null != var8) {
                break L47;
              } else {
                return null;
              }
            }
          }
          return this.a((byte) 114, param3, param5, (wk) var7, param0, (ru) var8);
        } else {
          return null;
        }
    }

    final int g(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (((rk) this).field_w == null) {
            break L0;
          } else {
            if (0 == ((rk) this).field_w.length) {
              break L0;
            } else {
              if (0 > param1) {
                return 1;
              } else {
                if (param1 < ((rk) this).field_w.length) {
                  L1: {
                    if (((rk) this).field_Z == null) {
                      break L1;
                    } else {
                      if (null != ((rk) this).field_R) {
                        L2: {
                          if (param0 < -75) {
                            break L2;
                          } else {
                            int discarded$1 = ((rk) this).g(0, -60);
                            break L2;
                          }
                        }
                        L3: {
                          var3 = ((rk) this).field_w[param1];
                          if (22 == var3) {
                            break L3;
                          } else {
                            if (23 != var3) {
                              if (var3 != 8) {
                                return 1;
                              } else {
                                return u.a(((rk) this).field_Z.field_n, (byte) 94);
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        return u.a(((rk) this).field_R.field_n, (byte) 94);
                      } else {
                        break L1;
                      }
                    }
                  }
                  return 1;
                } else {
                  return 1;
                }
              }
            }
          }
        }
        return 1;
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        hr var7 = null;
        hr var8 = null;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        stackOut_0_0 = this;
        stackOut_0_1 = param2;
        stackOut_0_2 = 8;
        stackOut_0_3 = -31550;
        stackIn_2_0 = stackOut_0_0;
        stackIn_2_1 = stackOut_0_1;
        stackIn_2_2 = stackOut_0_2;
        stackIn_2_3 = stackOut_0_3;
        this.c(stackIn_2_1, stackIn_2_2, stackIn_2_3, -1, param5);
        var7 = ((rk) this).field_s;
        L0: {
          var8 = ((rk) this).field_fb;
          if (null != var8) {
            var8.a(db.a(true, param5 - -40), u.a(param2 - -60, (byte) 94), (byte) -117);
            var8.a((byte) -72, false);
            break L0;
          } else {
            break L0;
          }
        }
        this.a(db.a(true, param5), 0, u.a(param2 - -40, (byte) 94), false);
    }

    private final void a(int param0, int param1, hr param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 == null) {
              return;
            } else {
              param2.a(db.a(true, param3), u.a(param0, (byte) 94), (byte) 77);
              param2.a((byte) -72, false);
              var5_int = -57 % ((param1 - 3) / 48);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("rk.NA(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    private final boolean a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          if (0 >= param1) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          } else {
            stackOut_3_0 = 1;
            stackIn_6_0 = stackOut_3_0;
            break L0;
          }
        }
        return stackIn_6_0 != 0;
    }

    private final void i() {
        ((rk) this).field_s = null;
        ((rk) this).field_s = new hr(0);
        ((rk) this).field_fb = null;
        ((rk) this).field_fb = new hr(0);
        ((rk) this).field_L = new em(250);
    }

    private final void b(int param0, int param1, int param2) {
        L0: {
          if (((rk) this).field_S != null) {
            ((rk) this).field_S.a(db.a(true, 40 + param2), u.a(90 + param0, (byte) 94), (byte) -3);
            ((rk) this).field_S.a((byte) -72, false);
            eu.a(-10, u.a(38 + param0, (byte) 94), db.a(true, param2), (jd) null);
            break L0;
          } else {
            break L0;
          }
        }
    }

    private final ft e(int param0, int param1, int param2, int param3) {
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            if (param1 != 1) {
              this.b(param3, -31123, param2);
              return null;
            } else {
              break L0;
            }
          }
        }
        return this.a(param1, 4, -93);
    }

    private final ru f(int param0, int param1) {
        ru[] var4 = ro.field_rb;
        ru[] var3 = var4;
        if (param1 < 0) {
            return null;
        }
        if (param1 > var4.length) {
            return null;
        }
        return var4[param1];
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var6 = 0;
        L0: {
          var7 = 0;
          if (param1 < 0) {
            break L0;
          } else {
            if (va.field_G.length > param1) {
              var8 = va.field_G[param1];
              ds.a(param4, 40 + param0, var7, 27066, false, var6, true, var8);
              ds.a(param4, param0 + 40, var7, 27066, false, var6, false, var8);
              this.b(param4, 40 + param0, param3, -25713, param1, var6);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        L0: {
          if (null == ((rk) this).field_w) {
            break L0;
          } else {
            if (((rk) this).field_w.length == 0) {
              break L0;
            } else {
              if (param0 < 0) {
                return 1;
              } else {
                if (param0 < ((rk) this).field_w.length) {
                  L1: {
                    if (((rk) this).field_Z == null) {
                      break L1;
                    } else {
                      if (null != ((rk) this).field_R) {
                        if (param1 == 4) {
                          var3 = ((rk) this).field_w[param0];
                          if (var3 != 22) {
                            if (var3 != 23) {
                              if (var3 != 8) {
                                return 1;
                              } else {
                                return db.a(true, ((rk) this).field_Z.field_k);
                              }
                            } else {
                              return so.field_b.field_a >> 1;
                            }
                          } else {
                            return db.a(true, ((rk) this).field_R.field_k);
                          }
                        } else {
                          return 0;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  return 1;
                } else {
                  return 1;
                }
              }
            }
          }
        }
        return 1;
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        wk var4 = null;
        ft var5_ref_ft = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (null == ((rk) this).field_X) {
            break L0;
          } else {
            if (((rk) this).field_X.length != 3) {
              break L0;
            } else {
              if (~((rk) this).field_N != ~((rk) this).field_f) {
                break L0;
              } else {
                return;
              }
            }
          }
        }
        var2 = -1;
        var3 = -1;
        var4_int = 0;
        L1: while (true) {
          if (var4_int >= 6) {
            L2: {
              if (var2 < 0) {
                break L2;
              } else {
                stackOut_34_0 = 0;
                stackOut_34_1 = var3;
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                if (stackIn_36_0 <= stackIn_36_1) {
                  L3: {
                    if (var2 <= 0) {
                      break L3;
                    } else {
                      if (var3 > 0) {
                        var4 = new wk(var2, var3);
                        var5 = 3 * var2 >> 2;
                        ((rk) this).field_X = new wk[3];
                        var6 = var3 * 3 >> 2;
                        var7 = 0;
                        L4: while (true) {
                          if (~((rk) this).field_X.length >= ~var7) {
                            var4.field_B = null;
                            var4 = null;
                            ((rk) this).field_f = ((rk) this).field_N;
                            return;
                          } else {
                            L5: {
                              ((rk) this).field_X[var7] = new wk(var5, var6);
                              var8 = var7;
                              if (((rk) this).field_N != 13) {
                                break L5;
                              } else {
                                var8 = ((rk) this).field_X.length + var7;
                                break L5;
                              }
                            }
                            int discarded$2 = 0;
                            int discarded$3 = -110;
                            this.a(((rk) this).field_X[var7], var8, 0, var4);
                            var7++;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  return;
                } else {
                  break L2;
                }
              }
            }
            return;
          } else {
            L6: {
              var5_ref_ft = this.d(var4_int, 1);
              if (var3 >= 0) {
                break L6;
              } else {
                if (0 <= var5_ref_ft.field_n) {
                  var3 = var5_ref_ft.field_n;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (0 <= var2) {
                break L7;
              } else {
                if (var5_ref_ft.field_k >= 0) {
                  var2 = var5_ref_ft.field_k;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (var2 < 0) {
                break L8;
              } else {
                if (var5_ref_ft.field_k > var2) {
                  var2 = var5_ref_ft.field_k;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (var3 < 0) {
                break L9;
              } else {
                if (var3 >= var5_ref_ft.field_n) {
                  break L9;
                } else {
                  var3 = var5_ref_ft.field_n;
                  break L9;
                }
              }
            }
            var4_int++;
            continue L1;
          }
        }
    }

    private final int a(boolean param0) {
        return nr.field_e.field_H >> 1;
    }

    private final ft e(int param0, int param1) {
        if (param1 == 0) {
            return new ft(40, 20);
        }
        if (param1 == 1) {
            return new ft(0, 0);
        }
        return null;
    }

    private final int a(int[] param0, int param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param1 >= param0.length) {
                    break L1;
                  } else {
                    L2: {
                      if (param0[param1] != -1) {
                        break L2;
                      } else {
                        if (1 + param1 >= param0.length) {
                          break L2;
                        } else {
                          var4_int = param1 + 1;
                          L3: while (true) {
                            if (var4_int >= param0.length) {
                              stackOut_27_0 = -1;
                              stackIn_28_0 = stackOut_27_0;
                              break L0;
                            } else {
                              var5 = param0[var4_int];
                              if (0 < var5) {
                                stackOut_21_0 = var5;
                                stackIn_22_0 = stackOut_21_0;
                                return stackIn_22_0;
                              } else {
                                if (var5 == 0) {
                                  var4_int++;
                                  continue L3;
                                } else {
                                  stackOut_24_0 = -1;
                                  stackIn_25_0 = stackOut_24_0;
                                  return stackIn_25_0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_14_0 = -1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                }
              }
            }
            stackOut_8_0 = -1;
            stackIn_9_0 = stackOut_8_0;
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("rk.S(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L4;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param1 + 44 + 50 + 41);
        }
        return stackIn_28_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ft var9 = null;
        ft var10 = null;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 < 0) {
            break L0;
          } else {
            if (param1 <= 1) {
              L1: {
                L2: {
                  if (param1 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (((rk) this).field_d == null) {
                        break L3;
                      } else {
                        if (((rk) this).field_h == null) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var5 = 29;
                    var6 = 1;
                    ((rk) this).field_d = this.b(var5, -1, var6, param1);
                    ((rk) this).field_h = new hr(var5);
                    break L1;
                  }
                }
                if (param1 != 1) {
                  break L1;
                } else {
                  L4: {
                    if (((rk) this).field_q == null) {
                      break L4;
                    } else {
                      if (((rk) this).field_M != null) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var5 = 10;
                  var6 = 1;
                  ((rk) this).field_q = this.b(var5, -1, var6, param1);
                  ((rk) this).field_M = new hr(var5);
                  ((rk) this).field_M.a(false, 256);
                  break L1;
                }
              }
              L5: {
                L6: {
                  if (0 != param1) {
                    break L6;
                  } else {
                    if (((rk) this).field_d == null) {
                      break L6;
                    } else {
                      if (((rk) this).field_h != null) {
                        var10 = this.a(param0, 0, param2, param1, -3);
                        if (null != var10) {
                          this.a(7 * (var10.field_n >> 3) + param2, 88, ((rk) this).field_h, (var10.field_k >> 1) + param0);
                          var6 = ri.field_c[0];
                          var7 = 0;
                          this.a(var7, param0, ((rk) this).field_d.field_O, var6, 110, ((rk) this).field_d, ((rk) this).field_d, param2);
                          break L5;
                        } else {
                          return;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (1 != param1) {
                  break L5;
                } else {
                  if (null == ((rk) this).field_q) {
                    break L5;
                  } else {
                    if (null == ((rk) this).field_M) {
                      break L5;
                    } else {
                      var9 = this.a(param0, 0, param2, param1, -3);
                      if (null != var9) {
                        this.a(7 * (var9.field_n >> 3) + param2, 57, ((rk) this).field_M, param0 - -(var9.field_k >> 1));
                        var6 = ri.field_c[0];
                        var7 = 0;
                        this.a(var7, param0, ((rk) this).field_d.field_O, var6, 102, ((rk) this).field_q, ((rk) this).field_d, param2);
                        break L5;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    private final boolean c(int param0, int param1) {
        Object var4 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (param1 == 256) {
            break L0;
          } else {
            var4 = null;
            ft discarded$2 = this.a(-114, 69, 36, -82, (wk) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 == -1) {
              break L2;
            } else {
              if (param0 == 0) {
                break L2;
              } else {
                if (param0 <= 0) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_10_0 = 1;
          stackIn_13_0 = stackOut_10_0;
          break L1;
        }
        return stackIn_13_0 != 0;
    }

    final void n(int param0) {
        L0: {
          ((rk) this).field_N = 0;
          ((rk) this).field_p = -1;
          if (null == ((rk) this).field_Z) {
            ((rk) this).field_Z = new ft(31, 431);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((rk) this).field_n != null) {
            break L1;
          } else {
            ((rk) this).field_n = new ft(608, 462);
            break L1;
          }
        }
        L2: {
          if (param0 > 98) {
            break L2;
          } else {
            this.j(40);
            break L2;
          }
        }
        L3: {
          if (null == ((rk) this).field_R) {
            ((rk) this).field_R = new ft(44, 386);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (null != ((rk) this).field_b) {
            break L4;
          } else {
            ((rk) this).field_b = new ft(595, 415);
            break L4;
          }
        }
        L5: {
          if (((rk) this).field_w == null) {
            ((rk) this).field_w = new int[]{22, 8, 23};
            break L5;
          } else {
            break L5;
          }
        }
        int discarded$1 = 31559;
        this.p();
    }

    private final void g(int param0) {
        if (!(null != ((rk) this).field_a)) {
            return;
        }
        int var2 = ((rk) this).field_C.field_n;
        int discarded$0 = -117;
        int var3 = this.h();
        int var4 = var3 + var2;
        fe.b(((rk) this).field_a, db.a(true, ((rk) this).field_F.field_k), u.a(var4, (byte) 94));
        fe.c(((rk) this).field_a, db.a(true, ((rk) this).field_F.field_k), u.a(var4, (byte) 94), nd.field_b, false);
    }

    private final void f() {
        int var2 = 0;
        qb var3 = null;
        L0: {
          ((rk) this).field_ab = null;
          if (null == sf.field_P) {
            break L0;
          } else {
            if (sf.field_P.length <= 76) {
              break L0;
            } else {
              L1: {
                var2 = sf.field_P[76];
                if (null == ck.field_e) {
                  break L1;
                } else {
                  if (var2 < 0) {
                    break L1;
                  } else {
                    if (ck.field_e.length <= var2) {
                      break L1;
                    } else {
                      L2: {
                        if (null == ck.field_e[var2]) {
                          break L2;
                        } else {
                          if (ck.field_e[var2].length <= 0) {
                            break L2;
                          } else {
                            var3 = ck.field_e[sf.field_P[76]][0];
                            if (null != var3) {
                              ((rk) this).field_ab = new vj(1);
                              ((rk) this).field_ab.a(-1, var3);
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    private final int a(String[] param0, String[][] param1, int param2, int[] param3, int[] param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var19 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == param1) {
                break L1;
              } else {
                if (null == param0) {
                  break L1;
                } else {
                  if (param4 != null) {
                    if (param1.length != param0.length) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      if (param1.length != param3.length) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        if (param1.length == param4.length) {
                          var8_int = param2;
                          var9 = ((rk) this).field_i;
                          var10 = ((rk) this).field_m;
                          var11 = -var9 + var10;
                          var12 = 0;
                          var13 = 0;
                          L2: while (true) {
                            if (var13 >= param1.length) {
                              stackOut_38_0 = param2 - var8_int;
                              stackIn_39_0 = stackOut_38_0;
                              break L0;
                            } else {
                              L3: {
                                var14 = param1[var13];
                                var15 = param0[var13];
                                var16 = param3[var13];
                                var17 = param4[var13];
                                if (var17 == -1) {
                                  int discarded$1 = 50;
                                  var18 = this.a(param4, var13);
                                  if (var18 < 0) {
                                    break L3;
                                  } else {
                                    var11 = var11 / var18;
                                    var12 = 1;
                                    var10 = var11 + var9;
                                    break L3;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                              L4: {
                                L5: {
                                  var18 = this.a(param6, var14, var15, var10, 9, var16, var13, param2, var9);
                                  if (var12 == 0) {
                                    break L5;
                                  } else {
                                    if (!this.c(var17, 256)) {
                                      break L5;
                                    } else {
                                      var9 = var9 - -var11;
                                      var10 = var11 + var10;
                                      if (this.a(0, var17)) {
                                        var12 = 0;
                                        var9 = ((rk) this).field_i;
                                        var10 = ((rk) this).field_m;
                                        param2 = param2 - -var18;
                                        var11 = var10 - var9;
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                }
                                var12 = 0;
                                param2 = var18 + param2;
                                break L4;
                              }
                              var13++;
                              continue L2;
                            }
                          }
                        } else {
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var8;
            stackOut_40_1 = new StringBuilder().append("rk.SA(");
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L6;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L6;
            }
          }
          L7: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(44);
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L7;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L7;
            }
          }
          L8: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44).append(param2).append(44);
            stackIn_51_0 = stackOut_48_0;
            stackIn_51_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param3 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L8;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              stackIn_52_2 = stackOut_49_2;
              break L8;
            }
          }
          L9: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(44);
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param4 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L9;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 44 + -120 + 44 + param6 + 41);
        }
        return stackIn_39_0;
    }

    final static int a(byte param0, int param1, boolean param2, String param3, String param4, boolean param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_4_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_55_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_92_0 = 0;
            int stackIn_104_0 = 0;
            int stackIn_106_0 = 0;
            int stackIn_116_0 = 0;
            int stackIn_119_0 = 0;
            RuntimeException stackIn_121_0 = null;
            StringBuilder stackIn_121_1 = null;
            RuntimeException stackIn_122_0 = null;
            StringBuilder stackIn_122_1 = null;
            RuntimeException stackIn_123_0 = null;
            StringBuilder stackIn_123_1 = null;
            String stackIn_123_2 = null;
            RuntimeException stackIn_124_0 = null;
            StringBuilder stackIn_124_1 = null;
            RuntimeException stackIn_125_0 = null;
            StringBuilder stackIn_125_1 = null;
            RuntimeException stackIn_126_0 = null;
            StringBuilder stackIn_126_1 = null;
            String stackIn_126_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_54_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_105_0 = 0;
            int stackOut_103_0 = 0;
            int stackOut_115_0 = 0;
            int stackOut_118_0 = 0;
            RuntimeException stackOut_120_0 = null;
            StringBuilder stackOut_120_1 = null;
            RuntimeException stackOut_122_0 = null;
            StringBuilder stackOut_122_1 = null;
            String stackOut_122_2 = null;
            RuntimeException stackOut_121_0 = null;
            StringBuilder stackOut_121_1 = null;
            String stackOut_121_2 = null;
            RuntimeException stackOut_123_0 = null;
            StringBuilder stackOut_123_1 = null;
            RuntimeException stackOut_125_0 = null;
            StringBuilder stackOut_125_1 = null;
            String stackOut_125_2 = null;
            RuntimeException stackOut_124_0 = null;
            StringBuilder stackOut_124_1 = null;
            String stackOut_124_2 = null;
            var9 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != am.field_z) {
                    break L1;
                  } else {
                    int discarded$11 = 0;
                    if (tb.a(param5)) {
                      break L1;
                    } else {
                      stackOut_3_0 = -1;
                      stackIn_4_0 = stackOut_3_0;
                      return stackIn_4_0;
                    }
                  }
                }
                L2: {
                  if (ov.field_g == sg.field_a) {
                    L3: {
                      if (param5) {
                        var10 = null;
                        fu.field_g = oi.a((String) null, param3, false, 1, dc.field_o);
                        break L3;
                      } else {
                        fu.field_g = ml.a(false, param4, (byte) 10, param3);
                        break L3;
                      }
                    }
                    vl.field_n.field_q = 0;
                    vl.field_n.b(1, 14);
                    vl.field_n.b(1, fu.field_g.a((byte) -16).field_c);
                    hb.a((byte) 67, -1);
                    ov.field_g = gi.field_d;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (ov.field_g == gi.field_d) {
                    if (es.a(-111, 1)) {
                      L5: {
                        var6_int = mg.field_e.k(0);
                        if (0 != var6_int) {
                          nm.field_o = var6_int;
                          fk.field_b = -1;
                          ov.field_g = be.field_z;
                          break L5;
                        } else {
                          ov.field_g = mh.field_a;
                          break L5;
                        }
                      }
                      mg.field_e.field_q = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (mh.field_a == ov.field_g) {
                    if (!es.a(-115, 8)) {
                      break L6;
                    } else {
                      ts.field_h = mg.field_e.j((byte) -2);
                      mg.field_e.field_q = 0;
                      bk.a(param2, param5, fu.field_g, 0, param1);
                      ov.field_g = jf.field_D;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (ov.field_g != jf.field_D) {
                    break L7;
                  } else {
                    if (es.a(-90, 1)) {
                      L8: {
                        var6_int = mg.field_e.k(0);
                        mg.field_e.field_q = 0;
                        gh.field_P = null;
                        nm.field_o = var6_int;
                        if (var6_int == 0) {
                          break L8;
                        } else {
                          if (var6_int == 1) {
                            break L8;
                          } else {
                            if (var6_int != 8) {
                              ov.field_g = be.field_z;
                              fk.field_b = -1;
                              break L7;
                            } else {
                              dj.a((byte) -126);
                              ev.field_b = false;
                              stackOut_34_0 = var6_int;
                              stackIn_35_0 = stackOut_34_0;
                              return stackIn_35_0;
                            }
                          }
                        }
                      }
                      ov.field_g = oq.field_m;
                      fk.field_b = -1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  if (oq.field_m != ov.field_g) {
                    break L9;
                  } else {
                    int discarded$12 = 2;
                    if (!jh.g()) {
                      break L9;
                    } else {
                      L10: {
                        dc.field_o = mg.field_e.j((byte) -2);
                        wl.field_I = param3;
                        hi.field_j = mg.field_e.k(0);
                        tf.field_l = mg.field_e.k(0);
                        df.field_M = mg.field_e.e((byte) -104);
                        var6_ref = mg.field_e.c((byte) -125);
                        var7 = mg.field_e.k(0);
                        if ((var7 & 1) != 0) {
                          int discarded$13 = 0;
                          wj.a();
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (!param5) {
                          L12: {
                            if ((var7 & 8) == 0) {
                              stackOut_51_0 = 0;
                              stackIn_52_0 = stackOut_51_0;
                              break L12;
                            } else {
                              stackOut_50_0 = 1;
                              stackIn_52_0 = stackOut_50_0;
                              break L12;
                            }
                          }
                          L13: {
                            bb.field_a = stackIn_52_0 != 0;
                            if ((2 & var7) == 0) {
                              stackOut_54_0 = 0;
                              stackIn_55_0 = stackOut_54_0;
                              break L13;
                            } else {
                              stackOut_53_0 = 1;
                              stackIn_55_0 = stackOut_53_0;
                              break L13;
                            }
                          }
                          L14: {
                            vi.field_d = stackIn_55_0 != 0;
                            if ((4 & var7) == 0) {
                              stackOut_57_0 = 0;
                              stackIn_58_0 = stackOut_57_0;
                              break L14;
                            } else {
                              stackOut_56_0 = 1;
                              stackIn_58_0 = stackOut_56_0;
                              break L14;
                            }
                          }
                          ul.field_m = stackIn_58_0 != 0;
                          if (!bb.field_a) {
                            break L11;
                          } else {
                            vi.field_d = true;
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                      L15: {
                        if ((16 & var7) == 0) {
                          stackOut_62_0 = 0;
                          stackIn_63_0 = stackOut_62_0;
                          break L15;
                        } else {
                          stackOut_61_0 = 1;
                          stackIn_63_0 = stackOut_61_0;
                          break L15;
                        }
                      }
                      L16: {
                        c.field_c = stackIn_63_0 != 0;
                        if (!ul.field_a) {
                          break L16;
                        } else {
                          int discarded$14 = mg.field_e.k(0);
                          int discarded$15 = mg.field_e.k(0);
                          int discarded$16 = mg.field_e.i(1);
                          of.field_Nb = mg.field_e.e((byte) -104);
                          nk.field_C = new byte[of.field_Nb];
                          var8 = 0;
                          L17: while (true) {
                            if (of.field_Nb <= var8) {
                              break L16;
                            } else {
                              nk.field_C[var8] = mg.field_e.a((byte) -49);
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      }
                      L18: {
                        mv.field_d = mg.field_e.g(1);
                        var11 = (CharSequence) (Object) mv.field_d;
                        int discarded$17 = 0;
                        ft.field_p = k.a(var11);
                        vt.field_n = mg.field_e.k(0);
                        ov.field_g = kl.field_k;
                        if (fu.field_g.a((byte) 50) != pt.field_db) {
                          if (fu.field_g.a((byte) -11) != fl.field_u) {
                            break L18;
                          } else {
                            ps.field_y.a(-137, ag.d((byte) -120));
                            break L18;
                          }
                        } else {
                          vn.field_j.a(-137, ag.d((byte) -127));
                          break L18;
                        }
                      }
                      L19: {
                        ev.field_b = false;
                        if (null == var6_ref) {
                          break L19;
                        } else {
                          int discarded$18 = 0;
                          ph.a(var6_ref, ag.d((byte) -117));
                          break L19;
                        }
                      }
                      L20: {
                        L21: {
                          if (df.field_M > 0) {
                            break L21;
                          } else {
                            if (ul.field_m) {
                              break L21;
                            } else {
                              try {
                                L22: {
                                  Object discarded$19 = lj.a("unzap", (byte) -52, ag.d((byte) -128));
                                  break L22;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L23: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L23;
                                }
                              }
                              break L20;
                            }
                          }
                        }
                        try {
                          L24: {
                            Object discarded$20 = lj.a(ag.d((byte) -115), "zap", new Object[1], 106);
                            break L24;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L25: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L25;
                          }
                        }
                        break L20;
                      }
                      L26: {
                        if (df.field_M <= 0) {
                          break L26;
                        } else {
                          aw.field_l = true;
                          break L26;
                        }
                      }
                      vl.field_n.a(ag.field_L, -106);
                      var8 = 0;
                      L27: while (true) {
                        if (4 <= var8) {
                          mg.field_e.a(ag.field_L, -119);
                          stackOut_91_0 = nm.field_o;
                          stackIn_92_0 = stackOut_91_0;
                          return stackIn_92_0;
                        } else {
                          ag.field_L[var8] = ag.field_L[var8] + 50;
                          var8++;
                          continue L27;
                        }
                      }
                    }
                  }
                }
                L28: {
                  if (be.field_z == ov.field_g) {
                    int discarded$21 = 2;
                    if (jh.g()) {
                      L29: {
                        dj.a((byte) -128);
                        if (nm.field_o != 7) {
                          break L29;
                        } else {
                          if (!ev.field_b) {
                            ev.field_b = true;
                            stackOut_105_0 = -1;
                            stackIn_106_0 = stackOut_105_0;
                            return stackIn_106_0;
                          } else {
                            break L29;
                          }
                        }
                      }
                      L30: {
                        if (nm.field_o != 7) {
                          break L30;
                        } else {
                          nm.field_o = 3;
                          break L30;
                        }
                      }
                      lk.field_r = mg.field_e.g(1);
                      ev.field_b = false;
                      stackOut_103_0 = nm.field_o;
                      stackIn_104_0 = stackOut_103_0;
                      return stackIn_104_0;
                    } else {
                      break L28;
                    }
                  } else {
                    break L28;
                  }
                }
                L31: {
                  if (null == am.field_z) {
                    if (!ev.field_b) {
                      var6_int = rn.field_d;
                      rn.field_d = sm.field_c;
                      sm.field_c = var6_int;
                      ev.field_b = true;
                      break L31;
                    } else {
                      L32: {
                        if (ca.b(0) <= 30000L) {
                          lk.field_r = nw.field_y;
                          break L32;
                        } else {
                          lk.field_r = gu.field_a;
                          break L32;
                        }
                      }
                      ev.field_b = false;
                      stackOut_115_0 = 3;
                      stackIn_116_0 = stackOut_115_0;
                      return stackIn_116_0;
                    }
                  } else {
                    break L31;
                  }
                }
                stackOut_118_0 = -1;
                stackIn_119_0 = stackOut_118_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L33: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_120_0 = (RuntimeException) var6;
                stackOut_120_1 = new StringBuilder().append("rk.BB(").append(-53).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_122_0 = stackOut_120_0;
                stackIn_122_1 = stackOut_120_1;
                stackIn_121_0 = stackOut_120_0;
                stackIn_121_1 = stackOut_120_1;
                if (param3 == null) {
                  stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
                  stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
                  stackOut_122_2 = "null";
                  stackIn_123_0 = stackOut_122_0;
                  stackIn_123_1 = stackOut_122_1;
                  stackIn_123_2 = stackOut_122_2;
                  break L33;
                } else {
                  stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
                  stackOut_121_1 = (StringBuilder) (Object) stackIn_121_1;
                  stackOut_121_2 = "{...}";
                  stackIn_123_0 = stackOut_121_0;
                  stackIn_123_1 = stackOut_121_1;
                  stackIn_123_2 = stackOut_121_2;
                  break L33;
                }
              }
              L34: {
                stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
                stackOut_123_1 = ((StringBuilder) (Object) stackIn_123_1).append(stackIn_123_2).append(44);
                stackIn_125_0 = stackOut_123_0;
                stackIn_125_1 = stackOut_123_1;
                stackIn_124_0 = stackOut_123_0;
                stackIn_124_1 = stackOut_123_1;
                if (param4 == null) {
                  stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
                  stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
                  stackOut_125_2 = "null";
                  stackIn_126_0 = stackOut_125_0;
                  stackIn_126_1 = stackOut_125_1;
                  stackIn_126_2 = stackOut_125_2;
                  break L34;
                } else {
                  stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
                  stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
                  stackOut_124_2 = "{...}";
                  stackIn_126_0 = stackOut_124_0;
                  stackIn_126_1 = stackOut_124_1;
                  stackIn_126_2 = stackOut_124_2;
                  break L34;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_126_0, stackIn_126_2 + 44 + param5 + 41);
            }
            return stackIn_119_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(String param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            L1: {
              if (0 <= ((rk) this).field_p) {
                break L1;
              } else {
                ((rk) this).field_p = up.field_c.length;
                break L1;
              }
            }
            L2: {
              if (param5 == ((rk) this).field_N) {
                break L2;
              } else {
                if (param5 < 0) {
                  break L2;
                } else {
                  if (param5 < ((rk) this).field_p) {
                    ((rk) this).field_N = param5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              L4: {
                if (((rk) this).field_N < 0) {
                  break L4;
                } else {
                  if (((rk) this).field_N >= ((rk) this).field_p) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              ((rk) this).field_N = 0;
              break L3;
            }
            L5: {
              this.a((byte) -106, param3, param4, param1);
              if (null != ((rk) this).field_hb) {
                break L5;
              } else {
                ((rk) this).field_hb = new hh(0, 256, 100);
                break L5;
              }
            }
            L6: {
              ((rk) this).field_hb.b((byte) -66);
              if (null != ((rk) this).field_u) {
                break L6;
              } else {
                ((rk) this).field_u = new em(256);
                break L6;
              }
            }
            L7: {
              if (((rk) this).field_u.c(-1)) {
                ((rk) this).field_u.b(17);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (null != ((rk) this).field_H) {
                break L8;
              } else {
                ((rk) this).field_H = new em(100);
                break L8;
              }
            }
            L9: {
              if (((rk) this).field_H.c(-1)) {
                ((rk) this).field_H.b(param2 ^ 117);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              this.j(-302977872);
              this.b(param2 + -62);
              ((rk) this).field_O = param0;
              if (((rk) this).field_N != -13) {
                if (-14 != ((rk) this).field_N) {
                  int discarded$1 = 0;
                  this.m();
                  break L10;
                } else {
                  this.b(true);
                  break L10;
                }
              } else {
                this.b(true);
                break L10;
              }
            }
            L11: {
              if (param2 == 100) {
                break L11;
              } else {
                ((rk) this).field_Q = true;
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var7;
            stackOut_36_1 = new StringBuilder().append("rk.G(");
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L12;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final ft d(int param0, int param1) {
        ft var3 = null;
        L0: {
          var3 = new ft(-1, -1);
          if (0 > param0) {
            break L0;
          } else {
            if (param0 >= ue.field_k.length) {
              break L0;
            } else {
              if (1 + param0 >= hr.field_d.length) {
                break L0;
              } else {
                if (gt.field_c.length <= param0) {
                  break L0;
                } else {
                  var3.field_k = ue.field_k[param0].field_A;
                  var3.field_n = ue.field_k[param0].field_x;
                  return var3;
                }
              }
            }
          }
        }
        return var3;
    }

    private final int a(int param0, String[] param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        ft var26 = null;
        int stackIn_91_0 = 0;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_90_0 = 0;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var24 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var10_int = param8;
            L1: {
              var11 = param3;
              var12 = param7;
              var13 = 0;
              var14 = 0;
              int discarded$6 = 17;
              var15 = this.d();
              var16 = null;
              var17 = null;
              if (param5 == -1) {
                break L1;
              } else {
                L2: {
                  var26 = this.a(0, (byte) 80, param0, 0, param6, 0);
                  if (var26 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (var26.field_k < 0) {
                        break L3;
                      } else {
                        if (var26.field_n >= 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var16 = null;
                    break L2;
                  }
                }
                var17 = (Object) (Object) this.a(0, (byte) 73, param0, 0, param6, 1);
                break L1;
              }
            }
            L4: {
              if (param5 != 5) {
                break L4;
              } else {
                if (null == var16) {
                  break L4;
                } else {
                  if (var17 != null) {
                    var11 = var11 - (((rk) this).field_db + ((ft) var16).field_k);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (3 != param5) {
                break L5;
              } else {
                if (var16 == null) {
                  break L5;
                } else {
                  if (null != var17) {
                    var10_int = var10_int + (((rk) this).field_db + ((ft) var16).field_k);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (param5 != 1) {
                break L6;
              } else {
                if (var16 == null) {
                  break L6;
                } else {
                  if (var17 == null) {
                    break L6;
                  } else {
                    var18 = (-((ft) var16).field_k + param3 - param8 >> 1) + -((ft) var17).field_k + param8;
                    var19 = param7 + -((ft) var17).field_n + var13;
                    ft discarded$7 = this.a(var19, (byte) 46, param0, var18, param6, 2);
                    var12 = var12 + ((ft) var16).field_n;
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (null != param2) {
                L8: {
                  var18 = var10_int;
                  var19 = var12;
                  var20 = var11 - var10_int;
                  var21 = rs.field_n.a(param2, var20, var15);
                  var22 = ((rk) this).field_z;
                  var23 = 0;
                  if (param5 != 1) {
                    break L8;
                  } else {
                    if (var16 == null) {
                      break L8;
                    } else {
                      if (var17 == null) {
                        break L8;
                      } else {
                        var23 = 1;
                        break L8;
                      }
                    }
                  }
                }
                L9: {
                  int discarded$8 = rs.field_n.a(param2, db.a(true, var18), u.a(var19, (byte) 94), var20, var21, var22, -1, var23, 0, var15);
                  var12 = var12 + var21;
                  if (null == param1) {
                    break L9;
                  } else {
                    var12 = var12 + ((rk) this).field_g;
                    break L9;
                  }
                }
                var19 = var19 + var21;
                var13 = var12 + -param7;
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (null == param1) {
                break L10;
              } else {
                if (rs.field_n == null) {
                  break L10;
                } else {
                  var18 = var10_int;
                  var19 = var12;
                  var20 = var11 + -var10_int;
                  var25 = 0;
                  var21 = var25;
                  L11: while (true) {
                    if (param1.length <= var25) {
                      var13 = var19 + -param7;
                      break L10;
                    } else {
                      L12: {
                        var22 = rs.field_n.a(param1[var25], var20, var15);
                        var23 = ((rk) this).field_l;
                        int discarded$9 = rs.field_n.a(param1[var25], db.a(true, var18), u.a(var19, (byte) 94), var20, var22, var23, -1, 0, 0, var15);
                        var19 = var19 + var22;
                        if (~(-1 + param1.length) >= ~var25) {
                          break L12;
                        } else {
                          var19 = var19 + ((rk) this).field_E;
                          break L12;
                        }
                      }
                      var25++;
                      continue L11;
                    }
                  }
                }
              }
            }
            L13: {
              L14: {
                if (param5 != 3) {
                  break L14;
                } else {
                  if (var16 == null) {
                    break L14;
                  } else {
                    if (null == var17) {
                      break L14;
                    } else {
                      L15: {
                        var18 = param8 - ((ft) var17).field_k;
                        var19 = -((ft) var17).field_n + param7;
                        if (~((ft) var16).field_n < ~var13) {
                          break L15;
                        } else {
                          var19 = var19 + (var13 + -((ft) var16).field_n >> 1);
                          break L15;
                        }
                      }
                      ft discarded$10 = this.a(var19, (byte) 52, param0, var18, param6, 2);
                      if (~(((rk) this).field_E + var13) > ~((ft) var16).field_n) {
                        var14 = var14 + ((ft) var16).field_n;
                        break L13;
                      } else {
                        var14 = var14 + var13;
                        break L13;
                      }
                    }
                  }
                }
              }
              L16: {
                if (param5 != 5) {
                  break L16;
                } else {
                  if (var16 == null) {
                    break L16;
                  } else {
                    if (var17 == null) {
                      break L16;
                    } else {
                      L17: {
                        var18 = -((ft) var16).field_k + -((ft) var17).field_k + param3;
                        var19 = param7 + -((ft) var17).field_n;
                        if (var13 < ((ft) var16).field_n) {
                          break L17;
                        } else {
                          var19 = var19 + (-((ft) var16).field_n + var13 >> 1);
                          break L17;
                        }
                      }
                      ft discarded$11 = this.a(var19, (byte) 68, param0, var18, param6, 2);
                      if (~(((rk) this).field_E + var13) <= ~((ft) var16).field_n) {
                        var14 = var14 + var13;
                        break L13;
                      } else {
                        var14 = var14 + ((ft) var16).field_n;
                        break L13;
                      }
                    }
                  }
                }
              }
              var14 = var14 + var13;
              break L13;
            }
            var14 = var14 + ((rk) this).field_E;
            stackOut_90_0 = var14;
            stackIn_91_0 = stackOut_90_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var10 = decompiledCaughtException;
            stackOut_92_0 = (RuntimeException) var10;
            stackOut_92_1 = new StringBuilder().append("rk.TA(").append(param0).append(44);
            stackIn_95_0 = stackOut_92_0;
            stackIn_95_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param1 == null) {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L18;
            } else {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "{...}";
              stackIn_96_0 = stackOut_93_0;
              stackIn_96_1 = stackOut_93_1;
              stackIn_96_2 = stackOut_93_2;
              break L18;
            }
          }
          L19: {
            stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
            stackOut_96_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_96_2).append(44);
            stackIn_99_0 = stackOut_96_0;
            stackIn_99_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param2 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L19;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_100_0 = stackOut_97_0;
              stackIn_100_1 = stackOut_97_1;
              stackIn_100_2 = stackOut_97_2;
              break L19;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_100_0, stackIn_100_2 + 44 + param3 + 44 + 9 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
        return stackIn_91_0;
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (op.field_c.length <= 0) {
          return;
        } else {
          L0: {
            if (((rk) this).field_L == null) {
              break L0;
            } else {
              if (((rk) this).field_L.field_a < 0) {
                break L0;
              } else {
                if (((rk) this).field_L.field_f <= 0) {
                  break L0;
                } else {
                  if (((rk) this).field_L.field_a > ((rk) this).field_L.field_f) {
                    break L0;
                  } else {
                    var5 = 18;
                    var6 = 30;
                    param0 = param0 + var5;
                    L1: {
                      param2 = param2 + var6;
                      var7 = 42;
                      var8 = 6;
                      qn.b(param0, param2, var7, var8, 16777215);
                      qn.f(param0 + 1, param2 + 1, -2 + var7, var8 + -2, 0);
                      var9 = 0;
                      if (((rk) this).field_L.field_f > 0) {
                        var9 = 1 - -(((rk) this).field_L.field_a * (var7 + -2) / 100);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (var9 >= 0) {
                        break L2;
                      } else {
                        var9 = 0;
                        break L2;
                      }
                    }
                    L3: {
                      if (var9 > var7 - 2) {
                        var9 = var7 - 2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    qn.f(param0 + 1, param2 - -1, var9, var8 - 2, op.field_c[0][0]);
                    return;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final void d(byte param0) {
        if (((rk) this).field_p < 0) {
            return;
        }
        int var2 = ((rk) this).field_C.field_k;
        if (param0 != -102) {
            ((rk) this).field_g = -92;
        }
        int var3 = ((rk) this).field_C.field_n;
        int var4 = ((rk) this).field_V.field_k + -var2;
        int var5 = ((rk) this).field_V.field_n - var3;
        fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, nd.field_b, ((rk) this).field_A, ((rk) this).field_e);
        this.g(120);
        var2 = ((rk) this).field_x.field_k;
        var3 = ((rk) this).field_x.field_n;
        var4 = -var2 + ((rk) this).field_K.field_k;
        var5 = -var3 + ((rk) this).field_K.field_n;
        fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, ci.field_e, ((rk) this).field_A, ((rk) this).field_e);
        int discarded$0 = -107;
        this.k();
        this.l(param0 + 19);
        int discarded$1 = 10;
        this.g();
    }

    private final ft d(int param0, int param1, int param2) {
        if (param1 != 0) {
          if (param1 == 1) {
            return new ft(0, 0);
          } else {
            L0: {
              if (param1 == 2) {
                this.b(param2, (byte) 127, param0);
                break L0;
              } else {
                break L0;
              }
            }
            return null;
          }
        } else {
          return new ft(309, 81);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "Reward";
        field_y = "Quit";
        field_c = "Music: ";
    }
}

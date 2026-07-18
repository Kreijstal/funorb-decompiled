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
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ((rk) this).field_W) {
                break L1;
              } else {
                var4_int = 0;
                var5 = 1;
                var6 = 0;
                ((rk) this).field_W = this.b(var4_int, -1, var5, var6);
                break L1;
              }
            }
            if (null != ((rk) this).field_W) {
              L2: {
                var4_int = 76;
                if (param1 >= 90) {
                  break L2;
                } else {
                  boolean discarded$2 = this.c(60, 20);
                  break L2;
                }
              }
              hs.a(false, true, ((rk) this).field_W, 0, db.a(true, param2), 0, var4_int, u.a(param0, (byte) 94));
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "rk.IA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null == ((rk) this).field_H) {
              return;
            } else {
              L1: {
                var5 = -96 / ((param0 - 2) / 57);
                var4_int = ((rk) this).field_H.field_a;
                if (var4_int < 0) {
                  break L1;
                } else {
                  if (~var4_int > ~((rk) this).field_H.field_f) {
                    var6 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (3 <= var6) {
                            break L4;
                          } else {
                            var7 = var6;
                            var8 = var6 - -1;
                            if (var10 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (null == gt.field_c) {
                                  break L5;
                                } else {
                                  if (0 > var7) {
                                    break L5;
                                  } else {
                                    if (~gt.field_c.length < ~var7) {
                                      L6: {
                                        var9 = -(gt.field_c[var7].field_A >> 637068225) + 50 >> -1437175135;
                                        param1 = param1 - -var9;
                                        if (null == hr.field_d) {
                                          break L6;
                                        } else {
                                          if (1 + var7 < 0) {
                                            break L6;
                                          } else {
                                            if (~(1 + var7) <= ~hr.field_d.length) {
                                              break L6;
                                            } else {
                                              L7: {
                                                hr.field_d[1 + var7].h(db.a(true, 6 + param1), u.a(param2 + 9, (byte) 94));
                                                gt.field_c[var7 + 1].h(db.a(true, param1), u.a(param2, (byte) 94));
                                                if (var8 <= 0) {
                                                  break L7;
                                                } else {
                                                  if (null == fe.field_o) {
                                                    break L7;
                                                  } else {
                                                    if (0 > 1 + var7) {
                                                      break L7;
                                                    } else {
                                                      if (~(var7 + 1) > ~fe.field_o.length) {
                                                        fe.a(db.a(true, 18 + param1), u.a(param2 - -21, (byte) 94), var7 + 1, var8, var4_int);
                                                        param1 = 50 + param1 - var9;
                                                        var6++;
                                                        if (var10 == 0) {
                                                          continue L2;
                                                        } else {
                                                          break L4;
                                                        }
                                                      } else {
                                                        break L7;
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
                                      break L5;
                                    }
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        break L3;
                      }
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "rk.CC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String c(int param0) {
        ic var1 = null;
        RuntimeException var1_ref = null;
        String[] var2 = null;
        String var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_11_0 = null;
        String stackOut_2_0 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var1 = rd.field_j;
            if (null != var1) {
              L1: {
                var2 = var1.field_xb.e(26524);
                if (param0 == -29288) {
                  break L1;
                } else {
                  field_B = -83;
                  break L1;
                }
              }
              var3 = "";
              var4 = var2;
              var5 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var4.length <= var5) {
                      break L4;
                    } else {
                      var6 = var4[var5];
                      stackOut_9_0 = var3 + var6 + "\n";
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        var3 = stackIn_10_0;
                        var5++;
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_11_0 = (String) var3;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = "No game in progress.";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1_ref, "rk.KB(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((rk) this).field_S = null;
              ((rk) this).field_S = new hr(18);
              if (param0 <= -101) {
                break L1;
              } else {
                ((rk) this).field_W = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.EB(" + param0 + ')');
        }
    }

    private final void d(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (~va.field_G.length >= ~param2) {
                  break L1;
                } else {
                  L2: {
                    var6_int = va.field_G[param2];
                    var7 = va.field_G[0];
                    ds.a(param1, param0, var7, 27066, true, param3, true, var6_int);
                    ds.a(param1, param0, var7, 27066, true, param3, false, var6_int);
                    if (param2 != 3) {
                      break L2;
                    } else {
                      vu.a(true, true, param1, param0, param3, 1, param4);
                      break L2;
                    }
                  }
                  L3: {
                    if (param2 == 2) {
                      this.a(param3, (byte) 85, 1, true, param1, param0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (param4 == 1) {
                    L4: {
                      if (param2 != 8) {
                        break L4;
                      } else {
                        var8 = 0;
                        this.a(param1, var8, param3, (byte) 114, param0);
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 != 14) {
                        break L5;
                      } else {
                        var8 = 11;
                        this.a(param1, var8, param3, (byte) 114, param0 - 5);
                        break L5;
                      }
                    }
                    L6: {
                      if (12 == param2) {
                        var8 = 24;
                        this.a(param1, var8, param3, (byte) 114, param0);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "rk.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            var4_int = fk.field_d[param2][param0];
            var5 = fk.field_d[param0][param2];
            if (var5 >= var4_int) {
              if (var4_int < var5) {
                if (var5 + -var4_int > 45) {
                  stackOut_16_0 = 4;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                } else {
                  stackOut_18_0 = 3;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                }
              } else {
                L1: {
                  if (param1 == -6) {
                    break L1;
                  } else {
                    this.b(-122);
                    break L1;
                  }
                }
                stackOut_23_0 = 2;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              }
            } else {
              if (-var5 + var4_int > 45) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "rk.SB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_24_0;
    }

    final int a(int param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              if (null == ((rk) this).field_w) {
                break L1;
              } else {
                if (((rk) this).field_w.length == 0) {
                  break L1;
                } else {
                  L2: {
                    if (param0 < 0) {
                      break L2;
                    } else {
                      if (~((rk) this).field_w.length >= ~param0) {
                        break L2;
                      } else {
                        if (!param1) {
                          L3: {
                            if (null == ((rk) this).field_Z) {
                              break L3;
                            } else {
                              if (((rk) this).field_R == null) {
                                break L3;
                              } else {
                                if (((rk) this).field_n == null) {
                                  break L3;
                                } else {
                                  if (null == ((rk) this).field_b) {
                                    break L3;
                                  } else {
                                    L4: {
                                      var3_int = ((rk) this).field_w[param0];
                                      if (22 == var3_int) {
                                        break L4;
                                      } else {
                                        if (var3_int != 23) {
                                          if (var3_int == 8) {
                                            stackOut_42_0 = ((rk) this).field_n.field_n + -((rk) this).field_Z.field_n;
                                            stackIn_43_0 = stackOut_42_0;
                                            return stackIn_43_0;
                                          } else {
                                            stackOut_44_0 = 1;
                                            stackIn_45_0 = stackOut_44_0;
                                            break L0;
                                          }
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                    stackOut_37_0 = ((rk) this).field_b.field_n + -((rk) this).field_R.field_n;
                                    stackIn_38_0 = stackOut_37_0;
                                    return stackIn_38_0;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_31_0 = 1;
                          stackIn_32_0 = stackOut_31_0;
                          return stackIn_32_0;
                        } else {
                          stackOut_17_0 = 106;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "rk.UA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_45_0;
    }

    private final void a(byte param0, int param1, boolean param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.p(31559);
              if (param3) {
                ((rk) this).field_o = true;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 < -87) {
                break L2;
              } else {
                this.k(-121);
                break L2;
              }
            }
            L3: {
              if (!param2) {
                break L3;
              } else {
                ((rk) this).field_I = true;
                break L3;
              }
            }
            L4: {
              if (null == ((rk) this).field_w) {
                break L4;
              } else {
                if (((rk) this).field_w.length != 0) {
                  L5: {
                    if (param1 < 0) {
                      break L5;
                    } else {
                      if (((rk) this).field_w.length <= param1) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var5_int = ((rk) this).field_w[param1];
                            if (var5_int != 22) {
                              break L7;
                            } else {
                              ((rk) this).field_j = true;
                              if (var6 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (23 == var5_int) {
                              break L8;
                            } else {
                              if (var5_int != 8) {
                                break L6;
                              } else {
                                ((rk) this).field_P = true;
                                if (var6 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          ((rk) this).field_Q = true;
                          break L6;
                        }
                        break L0;
                      }
                    }
                  }
                  return;
                } else {
                  break L4;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "rk.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_15_0 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((rk) this).field_f = -1;
            if (null != ((rk) this).field_X) {
              var2_int = param0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~((rk) this).field_X.length >= ~var2_int) {
                      break L3;
                    } else {
                      stackOut_5_0 = this;
                      stackIn_16_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (((rk) this).field_X[var2_int] != null) {
                              break L5;
                            } else {
                              if (var3 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ((rk) this).field_X[var2_int].field_B = null;
                          ((rk) this).field_X[var2_int] = null;
                          break L4;
                        }
                        var2_int++;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = this;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
                ((rk) this).field_X = null;
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "rk.VB(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException var2 = null;
        String[] var2_array = null;
        String[][] var3 = null;
        String[][][] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((rk) this).field_N < 0) {
                break L1;
              } else {
                if (((rk) this).field_N >= ((rk) this).field_p) {
                  break L1;
                } else {
                  if (null != up.field_b[((rk) this).field_N]) {
                    var2_array = up.field_b[((rk) this).field_N];
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
                            L2: {
                              if (param0 < -73) {
                                break L2;
                              } else {
                                this.l(58);
                                break L2;
                              }
                            }
                            var6 = da.field_a[((rk) this).field_N];
                            var7 = ((rk) this).field_T + -this.a(true);
                            var8 = 0;
                            L3: while (true) {
                              L4: {
                                if (~var8 <= ~var2_array.length) {
                                  break L4;
                                } else {
                                  L5: {
                                    L6: {
                                      if (var2_array != null) {
                                        break L6;
                                      } else {
                                        if (var10 == 0) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var3 != null) {
                                        break L7;
                                      } else {
                                        if (var10 == 0) {
                                          break L5;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    L8: {
                                      if (var4 != null) {
                                        break L8;
                                      } else {
                                        if (var10 == 0) {
                                          break L5;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (var5 != null) {
                                        break L9;
                                      } else {
                                        if (var10 == 0) {
                                          break L5;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if (var6 == null) {
                                      break L5;
                                    } else {
                                      L10: {
                                        if (((rk) this).field_N != 9) {
                                          break L10;
                                        } else {
                                          if (var8 != 0) {
                                            break L10;
                                          } else {
                                            if (var10 == 0) {
                                              break L5;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                      var9 = this.a(var2_array[var8], var4[var8], var8, var5[var8], var7, -1185705759, var3[var8], var6[var8]);
                                      var7 = var7 + var9;
                                      break L5;
                                    }
                                  }
                                  var8++;
                                  if (var10 == 0) {
                                    continue L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              break L0;
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
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.NB(" + param0 + ')');
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
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              var9_int = ((rk) this).field_F.field_k;
              var10 = param4;
              var11 = (this.a(true) >> 894779169) - -this.h(-2881);
              var10 = var11 + var10;
              if (param5 == -1185705759) {
                break L1;
              } else {
                ((rk) this).field_R = null;
                break L1;
              }
            }
            L2: {
              var12 = param0;
              if (var12 == null) {
                break L2;
              } else {
                fe.c(var12, db.a(true, var9_int), u.a(var10, (byte) 94), nd.field_b, true);
                break L2;
              }
            }
            L3: {
              var13 = param4;
              var11 = ((rk) this).field_Y + -((rk) this).field_T - -(this.a(true) >> -1185705759);
              if (var12 != null) {
                var13 = param4 + var11;
                break L3;
              } else {
                break L3;
              }
            }
            var14 = this.a(param6, param1, var13 + 10, param3, param7, (byte) -120, param2);
            if (var12 != null) {
              stackOut_13_0 = 10 + var11 + var14;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_11_0 = var14;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var9;
            stackOut_15_1 = new StringBuilder().append("rk.T(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          L6: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
            }
          }
          L7: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param6 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L7;
            }
          }
          L8: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param7 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_14_0;
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param4 == -1) {
              return;
            } else {
              L1: {
                if (param4 < 0) {
                  break L1;
                } else {
                  if (fn.field_Q.length > param4) {
                    var7_int = ((rk) this).field_u.field_a;
                    if (param3 == -25713) {
                      L2: {
                        if (var7_int >= 0) {
                          break L2;
                        } else {
                          var7_int = 0;
                          break L2;
                        }
                      }
                      var8 = fn.field_Q[param4];
                      if (var8 >= 0) {
                        L3: {
                          if (null == l.field_b) {
                            break L3;
                          } else {
                            if (0 > param5) {
                              break L3;
                            } else {
                              if (~l.field_b.length >= ~param5) {
                                break L3;
                              } else {
                                if (null == l.field_b[param5]) {
                                  break L3;
                                } else {
                                  if (l.field_b.length == 0) {
                                    break L3;
                                  } else {
                                    L4: {
                                      L5: {
                                        if (2 == var8) {
                                          break L5;
                                        } else {
                                          L6: {
                                            if (var8 == 1) {
                                              break L6;
                                            } else {
                                              L7: {
                                                if (0 != var8) {
                                                  break L7;
                                                } else {
                                                  if (l.field_b.length > 0) {
                                                    l.field_b[0].a(db.a(true, param0), u.a(-40 + param1, (byte) 94));
                                                    if (param2 <= -1) {
                                                      break L4;
                                                    } else {
                                                      if (op.field_c.length > param2) {
                                                        wb.a(param3 + 7841939, db.a(true, 20 + param0), param2, var7_int, u.a(10 + param1, (byte) 94));
                                                        if (var10 == 0) {
                                                          break L4;
                                                        } else {
                                                          break L7;
                                                        }
                                                      } else {
                                                        break L4;
                                                      }
                                                    }
                                                  } else {
                                                    return;
                                                  }
                                                }
                                              }
                                              if (var8 != 8) {
                                                break L4;
                                              } else {
                                                if (11 >= l.field_b.length) {
                                                  return;
                                                } else {
                                                  l.field_b[11].a(db.a(true, param0), u.a(-10 + (param1 - 40), (byte) 94));
                                                  if (param2 <= -1) {
                                                    break L4;
                                                  } else {
                                                    if (op.field_c.length > param2) {
                                                      wb.a(7816226, db.a(true, param0 - -20), param2, var7_int, u.a(param1 - 20, (byte) 94));
                                                      eu.a(db.a(true, param0 - -15), param2, 11, 127, u.a(21 + param1, (byte) 94));
                                                      if (var10 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L6;
                                                      }
                                                    } else {
                                                      break L4;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (l.field_b.length <= 8) {
                                            return;
                                          } else {
                                            l.field_b[8].a(db.a(true, param0), u.a(-50 + param1, (byte) 94));
                                            if (param2 <= -1) {
                                              break L4;
                                            } else {
                                              if (param2 >= op.field_c.length) {
                                                break L4;
                                              } else {
                                                wb.a(7816226, db.a(true, param0 + 21), param2, var7_int, u.a(-30 + param1, (byte) 94));
                                                if (var10 == 0) {
                                                  break L4;
                                                } else {
                                                  break L5;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L8: {
                                        if (17 >= l.field_b.length) {
                                          break L8;
                                        } else {
                                          if (l.field_b.length > 16) {
                                            L9: {
                                              L10: {
                                                l.field_b[17].a(db.a(true, param0), u.a(-40 + param1, (byte) 94));
                                                var9 = 1;
                                                if (null == ds.field_a) {
                                                  break L10;
                                                } else {
                                                  if (~param2 > ~ds.field_a.length) {
                                                    break L9;
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                              }
                                              var9 = 0;
                                              break L9;
                                            }
                                            L11: {
                                              L12: {
                                                if (null == le.field_c) {
                                                  break L12;
                                                } else {
                                                  if (~param2 > ~le.field_c.length) {
                                                    break L11;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              }
                                              var9 = 0;
                                              break L11;
                                            }
                                            L13: {
                                              if (var9 == 0) {
                                                break L13;
                                              } else {
                                                mv.a(db.a(true, 20 + param0), (byte) -70, var7_int, param2, u.a(param1, (byte) 94));
                                                break L13;
                                              }
                                            }
                                            L14: {
                                              if (-1 < param2) {
                                                ks.a(mn.field_k[76][param2], false, u.a(-40 + param1, (byte) 94), ((rk) this).field_ab, 128, 150, db.a(true, param0), (js) null, -10374);
                                                break L14;
                                              } else {
                                                break L14;
                                              }
                                            }
                                            l.field_b[16].a(db.a(true, param0), u.a(param1 + -40, (byte) 94));
                                            break L4;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      return;
                                    }
                                    break L0;
                                  }
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
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var7, "rk.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void p(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((rk) this).field_o = false;
              if (param0 == 31559) {
                break L1;
              } else {
                field_r = -110;
                break L1;
              }
            }
            ((rk) this).field_Q = false;
            ((rk) this).field_j = false;
            ((rk) this).field_I = false;
            ((rk) this).field_P = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.HA(" + param0 + ')');
        }
    }

    private final void l(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int[] var10 = null;
        int[] stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_11_0 = null;
        int[] stackOut_9_0 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -48) {
                break L1;
              } else {
                this.c((byte) -46);
                break L1;
              }
            }
            L2: {
              var2_int = ((rk) this).field_Z.field_k;
              var3 = ((rk) this).field_Z.field_n;
              var4 = ((rk) this).field_n.field_k + -var2_int;
              var5 = -var3 + ((rk) this).field_n.field_n;
              qn.f(db.a(true, var2_int), u.a(var3, (byte) 94), var4, var5, ((rk) this).field_cb);
              fe.b(db.a(true, var2_int), u.a(var3, (byte) 94), var4, var5, io.field_m, nd.field_b, ((rk) this).field_A, ((rk) this).field_e);
              var6 = ((rk) this).field_Z.field_n;
              var7 = ((rk) this).field_n.field_n;
              var3 = var6 - -var7 >> 1691857889;
              var8 = this.a(21695);
              var3 = var3 - -var8;
              var9 = ((rk) this).field_O;
              if (null == var9) {
                break L2;
              } else {
                if (var9.length() != 0) {
                  L3: {
                    if (!((rk) this).field_P) {
                      stackOut_11_0 = nd.field_b;
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_9_0 = ci.field_e;
                      stackIn_12_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  var10 = stackIn_12_0;
                  fe.c(var9, db.a(true, ((rk) this).field_F.field_k), u.a(var3, (byte) 94), var10, true);
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.C(" + param0 + ')');
        }
    }

    final void f(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  ((rk) this).field_C = new ft(25, 33);
                  ((rk) this).field_V = new ft(614, 446);
                  ((rk) this).field_A = 0;
                  ((rk) this).field_e = 128;
                  if (wb.field_b == null) {
                    break L3;
                  } else {
                    if (7 <= wb.field_b.length) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ((rk) this).field_a = null;
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              ((rk) this).field_a = wb.field_b[7];
              break L1;
            }
            L4: {
              ((rk) this).field_F = new ft(so.field_b.field_a >> -1208047007, so.field_b.field_g >> 759142465);
              ((rk) this).field_x = new ft(42, 63);
              ((rk) this).field_K = new ft(597, 417);
              ((rk) this).n(99);
              ((rk) this).field_cb = 3223077;
              if (il.field_t == null) {
                break L4;
              } else {
                L5: {
                  L6: {
                    if (il.field_t.length <= 8) {
                      break L6;
                    } else {
                      ((rk) this).field_O = il.field_t[8];
                      if (var5 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ((rk) this).field_O = null;
                  break L5;
                }
                L7: {
                  L8: {
                    if (il.field_t.length > 22) {
                      break L8;
                    } else {
                      ((rk) this).field_k = null;
                      if (var5 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  ((rk) this).field_k = il.field_t[22];
                  break L7;
                }
                L9: {
                  if (il.field_t.length <= 23) {
                    break L9;
                  } else {
                    ((rk) this).field_eb = il.field_t[23];
                    if (var5 == 0) {
                      break L4;
                    } else {
                      break L9;
                    }
                  }
                }
                ((rk) this).field_eb = null;
                break L4;
              }
            }
            L10: {
              ((rk) this).field_bb = 58;
              ((rk) this).field_t = 578;
              if (param0 > 6) {
                break L10;
              } else {
                boolean discarded$1 = this.c(66, 56);
                break L10;
              }
            }
            var2_int = ((rk) this).field_x.field_n;
            var3 = this.b((byte) 70);
            var4 = this.a(true);
            ((rk) this).field_m = 583;
            ((rk) this).field_T = var4 + var2_int - -(var3 >> 1326805057);
            ((rk) this).field_i = 56;
            ((rk) this).field_Y = var2_int - -var3;
            ((rk) this).field_E = this.i(112);
            ((rk) this).field_g = ((rk) this).field_E;
            ((rk) this).field_l = 14540255;
            ((rk) this).field_db = 14;
            ((rk) this).field_z = 14398754;
            ((rk) this).field_hb = new hh(0, 256, 100);
            ((rk) this).field_u = new em(256);
            ((rk) this).field_H = new em(100);
            ((rk) this).field_J = new int[4];
            this.f(-11195);
            this.i((byte) 28);
            this.c((byte) -109);
            this.j((byte) -7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.D(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, jd param5, jd param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
                L2: {
                  qn.b(5, 25, 30, 30, 0, 192);
                  en.field_E.b(dn.field_Pb[param5.field_N], 10, 17, op.field_c[0][param5.field_O], -1);
                  en.field_E.a(param5.field_A + param5.field_Y + "/" + param5.field_t, 126, 18, op.field_c[0][param5.field_O], -1);
                  if (param5.field_O != param2) {
                    break L2;
                  } else {
                    qn.b(99, 25, 30, 30, 0, 128);
                    qn.b(52, 25, 30, 30, 0, 128);
                    var9_int = param5.l(-27014);
                    cp.field_e[eb.a((byte) -126, ~var9_int & 3)].a(56, 25);
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (null != param6) {
                    break L3;
                  } else {
                    qn.b(99, 25, 30, 30, 0, 128);
                    if (var10 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                qn.b(37, 25, 92, 30, 0, 128);
                ro.field_rb[param6.g(0)].a(43, 32);
                sg.field_b[this.a(param6.g(0), (byte) -6, param5.g(0))].a(75, 32);
                break L1;
              }
              ro.field_rb[param5.g(0)].a(106, 32);
              en.field_E.c(100 + -param3 + "%", 20, 45, 16777215, -1);
              vb.field_t.b(68, 60, nd.field_b[-1 + nd.field_b.length]);
              so.field_b.a(5605);
              uf.field_j.e(db.a(true, param1), u.a(param7, (byte) 94), -param0 + 32 << -454534877);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var9;
            stackOut_15_1 = new StringBuilder().append("rk.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param6 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param7 + ')');
        }
    }

    private final ft b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        ft stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        ft stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                if (param2 == 1) {
                  break L1;
                } else {
                  this.c(50, param1, param4);
                  if (!ArmiesOfGielinor.field_M) {
                    L2: {
                      if (param0 == -2) {
                        break L2;
                      } else {
                        this.b(-21);
                        break L2;
                      }
                    }
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_7_0 = this.a(param2, param3, param0 ^ 88);
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "rk.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (ft) (Object) stackIn_13_0;
    }

    private final ft a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        Object stackIn_7_0 = null;
        ft stackIn_13_0 = null;
        ft stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_20_0 = null;
        ft stackOut_12_0 = null;
        ft stackOut_18_0 = null;
        try {
          L0: {
            L1: {
              if (param4 == -3) {
                break L1;
              } else {
                ((rk) this).field_m = 124;
                break L1;
              }
            }
            if (null == uf.field_j) {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (ft) (Object) stackIn_7_0;
            } else {
              L2: {
                if (param1 == 0) {
                  break L2;
                } else {
                  if (param1 != 1) {
                    L3: {
                      if (param1 == 2) {
                        this.a(param0, param3, param2, -19556);
                        if (!ArmiesOfGielinor.field_M) {
                          break L3;
                        } else {
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                    stackOut_20_0 = null;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_12_0 = new ft(0, 0);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
              stackOut_18_0 = new ft(uf.field_j.field_A, uf.field_j.field_x);
              stackIn_19_0 = stackOut_18_0;
              return stackIn_19_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "rk.UB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (ft) (Object) stackIn_21_0;
    }

    private final void b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((rk) this).field_s) {
                break L1;
              } else {
                ((rk) this).field_s.a(0, (byte) -50);
                break L1;
              }
            }
            if (((rk) this).field_L == null) {
              return;
            } else {
              L2: {
                if (!((rk) this).field_L.c(param0 + -39)) {
                  break L2;
                } else {
                  ((rk) this).field_L.b(17);
                  break L2;
                }
              }
              L3: {
                if (param0 == 38) {
                  break L3;
                } else {
                  ((rk) this).field_cb = 104;
                  break L3;
                }
              }
              L4: {
                var2_int = 0;
                if (((rk) this).field_L.field_a < 100) {
                  break L4;
                } else {
                  if (((rk) this).field_L.field_a > 250) {
                    break L4;
                  } else {
                    var2_int = 5;
                    break L4;
                  }
                }
              }
              L5: {
                if (null != ((rk) this).field_fb) {
                  ((rk) this).field_fb.a(var2_int, (byte) -50);
                  break L5;
                } else {
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.FB(" + param0 + ')');
        }
    }

    final int o(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (((rk) this).field_Z == null) {
                break L1;
              } else {
                if (((rk) this).field_n == null) {
                  break L1;
                } else {
                  if (((rk) this).field_R == null) {
                    break L1;
                  } else {
                    if (null == ((rk) this).field_b) {
                      break L1;
                    } else {
                      L2: {
                        if (~((rk) this).field_R.field_n > ~((rk) this).field_Z.field_n) {
                          stackOut_17_0 = ((rk) this).field_R.field_n;
                          stackIn_18_0 = stackOut_17_0;
                          break L2;
                        } else {
                          stackOut_15_0 = ((rk) this).field_Z.field_n;
                          stackIn_18_0 = stackOut_15_0;
                          break L2;
                        }
                      }
                      L3: {
                        var2_int = stackIn_18_0;
                        if (~((rk) this).field_Z.field_n <= ~((rk) this).field_R.field_n) {
                          stackOut_21_0 = ((rk) this).field_Z.field_n;
                          stackIn_22_0 = stackOut_21_0;
                          break L3;
                        } else {
                          stackOut_19_0 = ((rk) this).field_R.field_n;
                          stackIn_22_0 = stackOut_19_0;
                          break L3;
                        }
                      }
                      L4: {
                        var3 = stackIn_22_0;
                        if (param0 < ~var2_int) {
                          break L4;
                        } else {
                          if (0 > var3) {
                            break L4;
                          } else {
                            if (~var3 >= ~var2_int) {
                              break L4;
                            } else {
                              stackOut_33_0 = -var2_int + var3;
                              stackIn_34_0 = stackOut_33_0;
                              break L0;
                            }
                          }
                        }
                      }
                      stackOut_31_0 = -1;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0;
                    }
                  }
                }
              }
            }
            stackOut_12_0 = -1;
            stackIn_13_0 = stackOut_12_0;
            return stackIn_13_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.HB(" + param0 + ')');
        }
        return stackIn_34_0;
    }

    private final ft a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        RuntimeException var8 = null;
        ft stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        ft stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              if (param5 == 0) {
                break L1;
              } else {
                if (param5 == 1) {
                  break L1;
                } else {
                  this.c(param0, param2, -31550, param1, param6);
                  if (!ArmiesOfGielinor.field_M) {
                    L2: {
                      if (param4) {
                        break L2;
                      } else {
                        int discarded$2 = this.a((String[]) null, (String[][]) null, -14, (int[]) null, (int[]) null, (byte) -11, 90);
                        break L2;
                      }
                    }
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_7_0 = this.a(param5, param3, 110);
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var8, "rk.LB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return (ft) (Object) stackIn_13_0;
    }

    private final void g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int[] var10 = null;
        int[] stackIn_7_0 = null;
        int[] stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_4_0 = null;
        int[] stackOut_19_0 = null;
        int[] stackOut_17_0 = null;
        try {
          L0: {
            L1: {
              var2_int = ((rk) this).field_R.field_k;
              var3 = ((rk) this).field_R.field_n;
              var4 = ((rk) this).field_b.field_k - var2_int;
              var5 = ((rk) this).field_b.field_n + -var3;
              qn.b(db.a(true, var2_int), u.a(var3, (byte) 94), var4, var5, ((rk) this).field_A, ((rk) this).field_e);
              var6 = ((rk) this).field_R.field_n;
              if (param0 == 10) {
                break L1;
              } else {
                this.j(76);
                break L1;
              }
            }
            L2: {
              var7 = ((rk) this).field_b.field_n;
              var3 = var6 + var7 >> 770356673;
              var8 = this.a(21695);
              var3 = var3 - -var8;
              var2_int = ((rk) this).field_bb;
              var9 = ((rk) this).field_k;
              if (((rk) this).field_j) {
                stackOut_6_0 = ci.field_e;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = nd.field_b;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var10 = stackIn_7_0;
              if (!((rk) this).field_o) {
                break L3;
              } else {
                if (var9 == null) {
                  break L3;
                } else {
                  if (var9.length() <= 0) {
                    break L3;
                  } else {
                    fe.a(var9, db.a(true, var2_int), u.a(var3, (byte) 94), var10, true);
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (((rk) this).field_Q) {
                stackOut_19_0 = ci.field_e;
                stackIn_20_0 = stackOut_19_0;
                break L4;
              } else {
                stackOut_17_0 = nd.field_b;
                stackIn_20_0 = stackOut_17_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_20_0;
              var2_int = ((rk) this).field_t;
              var9 = ((rk) this).field_eb;
              if (!((rk) this).field_I) {
                break L5;
              } else {
                if (var9 == null) {
                  break L5;
                } else {
                  if (var9.length() <= 0) {
                    break L5;
                  } else {
                    fe.b(var9, db.a(true, var2_int), u.a(var3, (byte) 94), var10, true);
                    break L5;
                  }
                }
              }
            }
            var2_int = ((rk) this).field_F.field_k;
            var9 = qk.a(((rk) this).field_p, -2823, ((rk) this).field_N);
            fe.c(var9, db.a(true, var2_int), u.a(var3, (byte) 94), ci.field_e, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.FA(" + param0 + ')');
        }
    }

    private final int d(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 17) {
                break L1;
              } else {
                ft discarded$2 = ((rk) this).e((byte) -89);
                break L1;
              }
            }
            stackOut_3_0 = rs.field_n.field_L + rs.field_n.field_H;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.DC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((rk) this).field_v) {
                break L1;
              } else {
                ((rk) this).field_v.a(db.a(true, 40 + param1), u.a(param2 + 50, (byte) 94), (byte) -117);
                ((rk) this).field_v.a((byte) -72, false);
                nb.a(db.a(true, param1), u.a(param2 + 38, (byte) 94), (byte) -97, (jd) null);
                break L1;
              }
            }
            if (param0 == 50) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "rk.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final ft e(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_13_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        Object stackIn_27_0 = null;
        ft stackIn_29_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        ft stackOut_28_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_12_0 = null;
        try {
          L0: {
            L1: {
              if (((rk) this).field_Z == null) {
                break L1;
              } else {
                if (null == ((rk) this).field_n) {
                  break L1;
                } else {
                  if (null == ((rk) this).field_R) {
                    break L1;
                  } else {
                    if (null == ((rk) this).field_b) {
                      break L1;
                    } else {
                      L2: {
                        if (((rk) this).field_R.field_k < ((rk) this).field_Z.field_k) {
                          stackOut_17_0 = ((rk) this).field_R.field_k;
                          stackIn_18_0 = stackOut_17_0;
                          break L2;
                        } else {
                          stackOut_15_0 = ((rk) this).field_Z.field_k;
                          stackIn_18_0 = stackOut_15_0;
                          break L2;
                        }
                      }
                      L3: {
                        var2_int = stackIn_18_0;
                        var3 = -47 % ((param0 - 32) / 46);
                        if (((rk) this).field_R.field_n < ((rk) this).field_Z.field_n) {
                          stackOut_21_0 = ((rk) this).field_R.field_n;
                          stackIn_22_0 = stackOut_21_0;
                          break L3;
                        } else {
                          stackOut_19_0 = ((rk) this).field_Z.field_n;
                          stackIn_22_0 = stackOut_19_0;
                          break L3;
                        }
                      }
                      L4: {
                        var4 = stackIn_22_0;
                        if (var2_int < 0) {
                          break L4;
                        } else {
                          if (var4 >= 0) {
                            stackOut_28_0 = new ft(var2_int, var4);
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      stackOut_26_0 = null;
                      stackIn_27_0 = stackOut_26_0;
                      return (ft) (Object) stackIn_27_0;
                    }
                  }
                }
              }
            }
            stackOut_12_0 = null;
            stackIn_13_0 = stackOut_12_0;
            return (ft) (Object) stackIn_13_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.QB(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    private final ft b(int param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_6_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        ft stackIn_38_0 = null;
        ft stackIn_40_0 = null;
        ft stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        ft stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        ft stackOut_37_0 = null;
        ft stackOut_39_0 = null;
        Object stackOut_5_0 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 16) {
                break L1;
              } else {
                ((rk) this).field_F = null;
                break L1;
              }
            }
            if (null != gt.field_c) {
              if (param0 != 0) {
                if (param0 == 1) {
                  stackOut_44_0 = new ft(0, 0);
                  stackIn_45_0 = stackOut_44_0;
                  return stackIn_45_0;
                } else {
                  stackOut_46_0 = null;
                  stackIn_47_0 = stackOut_46_0;
                  break L0;
                }
              } else {
                var3_int = 150;
                var4 = -1;
                var5 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~gt.field_c.length >= ~var5) {
                        break L4;
                      } else {
                        var6 = gt.field_c[var5].field_A;
                        var6 = var6 >> 691895905;
                        var7 = gt.field_c[var5].field_x;
                        stackOut_10_0 = 0;
                        stackOut_10_1 = var3_int;
                        stackIn_33_0 = stackOut_10_0;
                        stackIn_33_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (stackIn_11_0 <= stackIn_11_1) {
                              break L5;
                            } else {
                              if (var6 < 0) {
                                break L5;
                              } else {
                                var3_int = var6;
                                break L5;
                              }
                            }
                          }
                          L6: {
                            var7 = var7 >> -499107871;
                            if (var6 <= var3_int) {
                              break L6;
                            } else {
                              var3_int = var6;
                              break L6;
                            }
                          }
                          L7: {
                            if (0 <= var4) {
                              break L7;
                            } else {
                              if (var7 >= 0) {
                                var4 = var7;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var7 > var4) {
                              var4 = var7;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var5++;
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    stackOut_32_0 = 0;
                    stackOut_32_1 = var3_int;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L3;
                  }
                  L9: {
                    if (stackIn_33_0 > stackIn_33_1) {
                      break L9;
                    } else {
                      if (var4 < 0) {
                        break L9;
                      } else {
                        stackOut_37_0 = new ft(var3_int, var4);
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0;
                      }
                    }
                  }
                  stackOut_39_0 = new ft(0, 0);
                  stackIn_40_0 = stackOut_39_0;
                  return stackIn_40_0;
                }
              }
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (ft) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "rk.JB(" + param0 + ',' + param1 + ')');
        }
        return (ft) (Object) stackIn_47_0;
    }

    private final jd b(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        jd var13 = null;
        Object stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        jd stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        jd stackOut_16_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              if (~param3 > param1) {
                break L1;
              } else {
                if (~param3 > ~op.field_c.length) {
                  L2: {
                    if (param0 < 0) {
                      break L2;
                    } else {
                      if (param0 < bw.field_m.length) {
                        L3: {
                          var7 = bw.field_m[param0][4];
                          var8 = -1 + var7;
                          if (var8 <= 0) {
                            var8 = 1;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var9 = 1;
                        var10 = 0;
                        var11 = null;
                        var12 = 1;
                        var13 = new jd(var5_int, var6, param0, param3, var7, var8, var9, 0, var10, (ha) var11, 0, 0, -1, var12 != 0, 0);
                        stackOut_16_0 = (jd) var13;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (jd) (Object) stackIn_11_0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = null;
            stackIn_5_0 = stackOut_4_0;
            return (jd) (Object) stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "rk.DB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    final int a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              if (null == ((rk) this).field_w) {
                break L1;
              } else {
                if (((rk) this).field_w.length == 0) {
                  break L1;
                } else {
                  L2: {
                    if (0 > param1) {
                      break L2;
                    } else {
                      if (~param1 <= ~((rk) this).field_w.length) {
                        break L2;
                      } else {
                        L3: {
                          if (!param0) {
                            break L3;
                          } else {
                            int discarded$2 = ((rk) this).a(false, -94);
                            break L3;
                          }
                        }
                        L4: {
                          if (((rk) this).field_n == null) {
                            break L4;
                          } else {
                            if (((rk) this).field_b == null) {
                              break L4;
                            } else {
                              var3_int = ((rk) this).field_w[param1];
                              if (22 == var3_int) {
                                stackOut_42_0 = -1 + (so.field_b.field_a >> 1640770209);
                                stackIn_43_0 = stackOut_42_0;
                                return stackIn_43_0;
                              } else {
                                if (var3_int == 23) {
                                  L5: {
                                    if (param0) {
                                      stackOut_39_0 = 0;
                                      stackIn_40_0 = stackOut_39_0;
                                      break L5;
                                    } else {
                                      stackOut_37_0 = 1;
                                      stackIn_40_0 = stackOut_37_0;
                                      break L5;
                                    }
                                  }
                                  stackOut_40_0 = db.a(stackIn_40_0 != 0, ((rk) this).field_b.field_k);
                                  stackIn_41_0 = stackOut_40_0;
                                  return stackIn_41_0;
                                } else {
                                  if (var3_int != 8) {
                                    stackOut_44_0 = 1;
                                    stackIn_45_0 = stackOut_44_0;
                                    break L0;
                                  } else {
                                    stackOut_34_0 = db.a(true, ((rk) this).field_n.field_k);
                                    stackIn_35_0 = stackOut_34_0;
                                    return stackIn_35_0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_25_0 = 1;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      }
                    }
                  }
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "rk.PB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_45_0;
    }

    private final void j(byte param0) {
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((rk) this).field_v = null;
            ((rk) this).field_v = new hr(25);
            if (param0 == -7) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 21695) {
              stackOut_3_0 = (nr.field_e.field_y >> -1889391838) + -nr.field_e.field_L + nr.field_e.field_v + (-(nr.field_e.field_H >> 1230185921) - -3);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 113;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.L(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(wk param0, int param1, int param2, wk param3, int param4, int param5) {
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
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
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
                    if (~gt.field_c.length >= ~param1) {
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
                                var10 = var9 >> -672130271;
                                var11 = var8;
                                var12 = var8;
                                var13 = (int)((double)var10 - Math.cos((double)var11 * 3.141592653589793 / (double)var9) * (double)var10);
                                var14 = (int)(-((double)var10 * Math.cos(3.141592653589793 * (double)var12 / (double)var9)) + (double)var10);
                                if (var7_int != 0) {
                                  stackOut_25_0 = -1;
                                  stackIn_26_0 = stackOut_25_0;
                                  break L3;
                                } else {
                                  stackOut_23_0 = param1;
                                  stackIn_26_0 = stackOut_23_0;
                                  break L3;
                                }
                              }
                              L4: {
                                var15 = stackIn_26_0;
                                if (var7_int != 0) {
                                  stackOut_29_0 = param1;
                                  stackIn_30_0 = stackOut_29_0;
                                  break L4;
                                } else {
                                  stackOut_27_0 = -1;
                                  stackIn_30_0 = stackOut_27_0;
                                  break L4;
                                }
                              }
                              L5: {
                                L6: {
                                  var16 = stackIn_30_0;
                                  var17 = -19;
                                  var18 = -22;
                                  var19 = ue.field_k[1 + param1];
                                  if (~var15 != ~param1) {
                                    break L6;
                                  } else {
                                    var19.f(0, 0, var9 + -var13);
                                    if (var27 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if (~param1 != ~var16) {
                                  break L5;
                                } else {
                                  var19.f(0, 0, -var14 + var9);
                                  break L5;
                                }
                              }
                              L7: {
                                L8: {
                                  var19.f(0, 0, var9);
                                  var20 = hr.field_d[param1 - -1];
                                  var20.g(-var17, -var18);
                                  if (~var15 != ~param1) {
                                    break L8;
                                  } else {
                                    var20.f(-var17, -var18, -var13 + var9);
                                    if (var27 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                if (~param1 != ~var16) {
                                  break L7;
                                } else {
                                  var20.f(-var17, -var18, var9 + -var14);
                                  break L7;
                                }
                              }
                              var21 = -12;
                              var22 = -17;
                              var24 = 105 / ((param4 - -25) / 48);
                              var23 = gt.field_c[1 + param1];
                              var23.g(var21 + -var17, var22 + -var18);
                              so.field_b.a(5605);
                              qn.a(((rk) this).field_J);
                              qn.b(((rk) this).field_J);
                              param0.b();
                              qn.b();
                              var25 = param0.field_A;
                              var26 = param0.field_x;
                              param3.d(param5, param2, var25, var26);
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
          L9: {
            var7 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var7;
            stackOut_50_1 = new StringBuilder().append("rk.GC(");
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L9;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L9;
            }
          }
          L10: {
            stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
            stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_57_0 = stackOut_54_0;
            stackIn_57_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param3 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L10;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 14) {
                break L1;
              } else {
                ((rk) this).field_n = null;
                break L1;
              }
            }
            stackOut_3_0 = nr.field_e.field_H - -nr.field_e.field_L >> -585173727;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.K(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final ft a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ft stackIn_5_0 = null;
        ft stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        ft stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        ft stackOut_4_0 = null;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_6_0 = new ft(80, param1 * 80 >> 548922530);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (param0 != 1) {
                var4_int = -19 / ((param2 - -8) / 40);
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_4_0 = new ft(0, -(80 * param1) + 320 >> -2099785982);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "rk.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (ft) (Object) stackIn_9_0;
    }

    private final wk b(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        wk stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        wk stackOut_14_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            L1: {
              if (null == ((rk) this).field_X) {
                break L1;
              } else {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (~param1 <= ~((rk) this).field_X.length) {
                    break L1;
                  } else {
                    if (param0 == 20255) {
                      stackOut_14_0 = ((rk) this).field_X[param1];
                      stackIn_15_0 = stackOut_14_0;
                      break L0;
                    } else {
                      stackOut_12_0 = null;
                      stackIn_13_0 = stackOut_12_0;
                      return (wk) (Object) stackIn_13_0;
                    }
                  }
                }
              }
            }
            stackOut_9_0 = null;
            stackIn_10_0 = stackOut_9_0;
            return (wk) (Object) stackIn_10_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "rk.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    private final ft a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        ft stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        ft stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                if (param1 == 1) {
                  break L1;
                } else {
                  this.d(param3, param0, param4, param2, 1);
                  if (!ArmiesOfGielinor.field_M) {
                    L2: {
                      if (param5 == 2) {
                        break L2;
                      } else {
                        int discarded$2 = ((rk) this).g(37, -69);
                        break L2;
                      }
                    }
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_7_0 = this.e(3, param1);
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var7, "rk.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (ft) (Object) stackIn_13_0;
    }

    private final ft c(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        ft stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_11_0 = null;
        ft stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                if (param3 != 1) {
                  L2: {
                    if (2 == param3) {
                      this.a((byte) 116, param0, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (param2 < -4) {
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    stackOut_11_0 = null;
                    stackIn_12_0 = stackOut_11_0;
                    return (ft) (Object) stackIn_12_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = this.b(param3, (byte) 16);
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "rk.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (ft) (Object) stackIn_14_0;
    }

    final ft a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_11_0 = null;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_30_0 = null;
        ft stackIn_32_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        ft stackOut_31_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_10_0 = null;
        try {
          L0: {
            L1: {
              if (((rk) this).field_Z == null) {
                break L1;
              } else {
                if (null == ((rk) this).field_n) {
                  break L1;
                } else {
                  if (((rk) this).field_R == null) {
                    break L1;
                  } else {
                    if (null != ((rk) this).field_b) {
                      L2: {
                        if (param0 == -108) {
                          break L2;
                        } else {
                          ((rk) this).field_I = true;
                          break L2;
                        }
                      }
                      L3: {
                        if (~((rk) this).field_b.field_k >= ~((rk) this).field_n.field_k) {
                          stackOut_18_0 = ((rk) this).field_n.field_k;
                          stackIn_19_0 = stackOut_18_0;
                          break L3;
                        } else {
                          stackOut_16_0 = ((rk) this).field_b.field_k;
                          stackIn_19_0 = stackOut_16_0;
                          break L3;
                        }
                      }
                      L4: {
                        var2_int = stackIn_19_0;
                        if (((rk) this).field_n.field_n >= ((rk) this).field_b.field_n) {
                          stackOut_22_0 = ((rk) this).field_n.field_n;
                          stackIn_23_0 = stackOut_22_0;
                          break L4;
                        } else {
                          stackOut_20_0 = ((rk) this).field_b.field_n;
                          stackIn_23_0 = stackOut_20_0;
                          break L4;
                        }
                      }
                      L5: {
                        var3 = stackIn_23_0;
                        if (var2_int < 0) {
                          break L5;
                        } else {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            stackOut_31_0 = new ft(var2_int, var3);
                            stackIn_32_0 = stackOut_31_0;
                            break L0;
                          }
                        }
                      }
                      stackOut_29_0 = null;
                      stackIn_30_0 = stackOut_29_0;
                      return (ft) (Object) stackIn_30_0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = null;
            stackIn_11_0 = stackOut_10_0;
            return (ft) (Object) stackIn_11_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.AA(" + param0 + ')');
        }
        return stackIn_32_0;
    }

    private final ft a(byte param0, int param1, int param2, wk param3, int param4, ru param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_6_0 = null;
        ft stackIn_12_0 = null;
        ft stackIn_24_0 = null;
        ft stackIn_30_0 = null;
        int stackIn_41_0 = 0;
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
        ft stackOut_23_0 = null;
        ft stackOut_29_0 = null;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        Object stackOut_53_0 = null;
        ft stackOut_51_0 = null;
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
              var7_int = -82 % ((param0 - -58) / 54);
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
              L4: {
                if (param5 == null) {
                  break L4;
                } else {
                  if (param2 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (null == param3) {
                  break L5;
                } else {
                  if (param2 != 1) {
                    break L5;
                  } else {
                    stackOut_23_0 = new ft(0, 0);
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0;
                  }
                }
              }
              L6: {
                if (param5 == null) {
                  break L6;
                } else {
                  if (1 != param2) {
                    break L6;
                  } else {
                    stackOut_29_0 = new ft(0, 0);
                    stackIn_30_0 = stackOut_29_0;
                    return stackIn_30_0;
                  }
                }
              }
              L7: {
                L8: {
                  if (null != param3) {
                    break L8;
                  } else {
                    if (param5 == null) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (null != param5) {
                    stackOut_40_0 = -param5.field_d + param4;
                    stackIn_41_0 = stackOut_40_0;
                    break L9;
                  } else {
                    stackOut_38_0 = -param3.field_z + param4;
                    stackIn_41_0 = stackOut_38_0;
                    break L9;
                  }
                }
                L10: {
                  param4 = stackIn_41_0;
                  if (param3 != null) {
                    break L10;
                  } else {
                    if (null == param5) {
                      break L7;
                    } else {
                      param5.a(db.a(true, param1), u.a(param4, (byte) 94));
                      if (var8 == 0) {
                        break L7;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                param3.g(db.a(true, param1), u.a(param4, (byte) 94));
                if (var8 == 0) {
                  break L7;
                } else {
                  break L3;
                }
              }
              stackOut_53_0 = null;
              stackIn_54_0 = stackOut_53_0;
              break L0;
            }
            stackOut_51_0 = new ft(param5.field_g, param5.field_h);
            stackIn_52_0 = stackOut_51_0;
            return stackIn_52_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var7;
            stackOut_55_1 = new StringBuilder().append("rk.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L11;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L11;
            }
          }
          L12: {
            stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',').append(param4).append(',');
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
              break L12;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L12;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ')');
        }
        return (ft) (Object) stackIn_54_0;
    }

    final static void e(int param0) {
        RuntimeException runtimeException = null;
        bj var1 = null;
        int var2 = 0;
        bv var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = 122 % ((param0 - -31) / 56);
            var1 = (bj) (Object) jm.field_o.e((byte) 126);
            if (var1 == null) {
              dj.a((byte) -128);
              return;
            } else {
              var3 = mg.field_e;
              int discarded$8 = var3.i(1);
              int discarded$9 = var3.i(1);
              int discarded$10 = var3.i(1);
              int discarded$11 = var3.i(1);
              var1.d(-115);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "rk.AC(" + param0 + ')');
        }
    }

    private final int i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = 32 % ((-32 - param0) / 59);
            stackOut_0_0 = rs.field_n.field_L + rs.field_n.field_H;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.GB(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    private final int h(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -2881) {
              stackOut_3_0 = 3 + nr.field_e.field_v + -nr.field_e.field_L - (nr.field_e.field_H >> -1503557247);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -79;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.WA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        wp var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -302977872) {
                break L1;
              } else {
                ((rk) this).field_hb = null;
                break L1;
              }
            }
            L2: {
              if (((rk) this).field_ab == null) {
                this.f(-11195);
                break L2;
              } else {
                boolean discarded$3 = ((rk) this).field_ab.a(-118);
                var2_int = ((rk) this).field_ab.field_i >> -302977872;
                var3 = we.a(var2_int, true);
                if (((rk) this).field_ab == null) {
                  var3 = null;
                  return;
                } else {
                  io.a(var3, (byte) -34);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.O(" + param0 + ')');
        }
    }

    private final ft a(int param0, int param1, int param2, int param3, wk param4) {
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        ft stackIn_8_0 = null;
        ft stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        Object stackOut_19_0 = null;
        ft stackOut_7_0 = null;
        ft stackOut_16_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (0 == param0) {
                  break L1;
                } else {
                  if (param0 != 1) {
                    L2: {
                      if (null != param4) {
                        param3 = param3 - param4.field_z;
                        if (param4 == null) {
                          break L2;
                        } else {
                          param4.h(db.a(true, param2), u.a(param3, (byte) 94));
                          if (!ArmiesOfGielinor.field_M) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    if (param1 == 26823) {
                      stackOut_21_0 = null;
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    } else {
                      stackOut_19_0 = null;
                      stackIn_20_0 = stackOut_19_0;
                      return (ft) (Object) stackIn_20_0;
                    }
                  } else {
                    stackOut_7_0 = new ft(0, 0);
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              stackOut_16_0 = new ft(param4.field_A >> -1184800383, param4.field_v >> -908155455);
              stackIn_17_0 = stackOut_16_0;
              return stackIn_17_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ft) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6;
            stackOut_23_1 = new StringBuilder().append("rk.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return (ft) (Object) stackIn_22_0;
    }

    public static void q(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_y = null;
              if (param0 < -20) {
                break L1;
              } else {
                rk.e(41);
                break L1;
              }
            }
            field_gb = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "rk.EA(" + param0 + ')');
        }
    }

    private final ft a(boolean param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        ft stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        ft stackOut_10_0 = null;
        try {
          L0: {
            L1: {
              if (param4 == 74) {
                break L1;
              } else {
                ((rk) this).field_x = null;
                break L1;
              }
            }
            L2: {
              if (param5 == 0) {
                break L2;
              } else {
                if (param5 == 1) {
                  break L2;
                } else {
                  this.a(param1, param6, param7, param0, -1, param3);
                  if (!ArmiesOfGielinor.field_M) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_10_0 = this.a(param5, param2, 95);
            stackIn_11_0 = stackOut_10_0;
            return stackIn_11_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var9, "rk.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        return (ft) (Object) stackIn_13_0;
    }

    private final int h(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -90) {
                break L1;
              } else {
                String discarded$2 = rk.c(117);
                break L1;
              }
            }
            stackOut_3_0 = nr.field_e.field_v - nr.field_e.field_L - (nr.field_e.field_H - ((nr.field_e.field_y >> 187839297) + 3));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.MB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (l.field_b == null) {
                break L1;
              } else {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (~l.field_b.length < ~param2) {
                    L2: {
                      if (null == l.field_b) {
                        break L2;
                      } else {
                        if (param1 < 0) {
                          break L2;
                        } else {
                          if (l.field_b.length <= param1) {
                            break L2;
                          } else {
                            L3: {
                              if (param3 == 114) {
                                break L3;
                              } else {
                                this.j((byte) 86);
                                break L3;
                              }
                            }
                            if (null != l.field_b[param1]) {
                              l.field_b[param1].d(db.a(true, param0), u.a(-20 + param4, (byte) 94));
                              break L0;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "rk.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, boolean param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ru var12 = null;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (nr.field_c == null) {
                break L1;
              } else {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (~param0 <= ~nr.field_c.length) {
                    break L1;
                  } else {
                    if (null == nr.field_c[param0]) {
                      break L1;
                    } else {
                      L2: {
                        if (param1 >= 71) {
                          break L2;
                        } else {
                          int discarded$1 = this.a(55, (String[]) null, (String) null, 27, -41, -10, 103, 60, -125);
                          break L2;
                        }
                      }
                      param2 = param2 << -1038953368 | param2;
                      var7_int = param2 >> 1182001857 ^ param2;
                      var10 = 0;
                      L3: while (true) {
                        L4: {
                          if (var10 >= 4) {
                            break L4;
                          } else {
                            L5: {
                              var9 = -64 + ((param2 & 3) - -20);
                              var8 = -44 + ((7 & var7_int) + bm.field_y[var10][0] + 40);
                              if (var10 != 0) {
                                var9 = var9 + bm.field_y[var10][1];
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (!param3) {
                                break L6;
                              } else {
                                var8 = var8 >> 650802753;
                                var9 = var9 >> 1928204673;
                                break L6;
                              }
                            }
                            L7: {
                              L8: {
                                var11 = -1;
                                if (var10 == 0) {
                                  break L8;
                                } else {
                                  var11 = param2 % 9 + 25;
                                  if (var13 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var11 = 16 + param2 % 9;
                              break L7;
                            }
                            L9: {
                              var7_int = var7_int >> 1;
                              param2 = param2 >> 1;
                              if (0 > var11) {
                                break L9;
                              } else {
                                if (nr.field_c.length <= var11) {
                                  break L9;
                                } else {
                                  if (nr.field_c[var11] != null) {
                                    L10: {
                                      var12 = nr.field_c[var11];
                                      if (param3) {
                                        break L10;
                                      } else {
                                        var12.a(db.a(true, param4 - -var8), u.a(param5 - -var9, (byte) 94));
                                        if (var13 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    var12.d(db.a(true, var8 + param4), u.a(var9 + param5, (byte) 94));
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var10++;
                            if (var13 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var7, "rk.WB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
                return this.d(param3, param5, param0, 0);
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
                  return this.e(-94, param5, param3, param0, 4);
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
              if (null == var8) {
                return null;
              } else {
                break L47;
              }
            }
          }
          return this.a((byte) 114, param3, param5, (wk) var7, param0, (ru) var8);
        } else {
          return null;
        }
    }

    final int g(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              if (((rk) this).field_w == null) {
                break L1;
              } else {
                if (0 == ((rk) this).field_w.length) {
                  break L1;
                } else {
                  L2: {
                    if (0 > param1) {
                      break L2;
                    } else {
                      if (~param1 > ~((rk) this).field_w.length) {
                        L3: {
                          if (((rk) this).field_Z == null) {
                            break L3;
                          } else {
                            if (null != ((rk) this).field_R) {
                              L4: {
                                if (param0 < -75) {
                                  break L4;
                                } else {
                                  int discarded$2 = ((rk) this).g(0, -60);
                                  break L4;
                                }
                              }
                              L5: {
                                var3_int = ((rk) this).field_w[param1];
                                if (22 == var3_int) {
                                  break L5;
                                } else {
                                  if (23 != var3_int) {
                                    if (var3_int != 8) {
                                      stackOut_32_0 = 1;
                                      stackIn_33_0 = stackOut_32_0;
                                      break L0;
                                    } else {
                                      stackOut_30_0 = u.a(((rk) this).field_Z.field_n, (byte) 94);
                                      stackIn_31_0 = stackOut_30_0;
                                      return stackIn_31_0;
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              stackOut_27_0 = u.a(((rk) this).field_R.field_n, (byte) 94);
                              stackIn_28_0 = stackOut_27_0;
                              return stackIn_28_0;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "rk.BA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_33_0;
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        hr var7 = null;
        RuntimeException var7_ref = null;
        Object stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this;
              stackOut_0_1 = param2;
              stackOut_0_2 = param0;
              stackOut_0_3 = -31550;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_3_2 = stackOut_0_2;
              stackIn_3_3 = stackOut_0_3;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              if (param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = -1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = stackIn_1_3;
                stackOut_1_4 = param1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                stackIn_4_3 = stackOut_1_3;
                stackIn_4_4 = stackOut_1_4;
                break L1;
              }
            }
            L2: {
              this.c(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, param5);
              var7 = ((rk) this).field_s;
              if (param3) {
                var7 = ((rk) this).field_fb;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (null != var7) {
                var7.a(db.a(true, param5 - -40), u.a(param2 - -60, (byte) 94), (byte) -117);
                var7.a((byte) -72, false);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param4 == -1) {
                break L4;
              } else {
                ft discarded$2 = this.e(-40, -71, -63, -38, 73);
                break L4;
              }
            }
            L5: {
              if (param3) {
                this.a(db.a(true, param5), param1, u.a(param2 - -40, (byte) 94), false);
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var7_ref, "rk.EC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
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
            stackOut_5_1 = new StringBuilder().append("rk.NA(").append(param0).append(',').append(param1).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    private final boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.g((byte) -105);
                break L1;
              }
            }
            L2: {
              if (0 >= param1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "rk.QA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final void i(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((rk) this).field_s = null;
              if (param0 == 28) {
                break L1;
              } else {
                ((rk) this).field_l = 29;
                break L1;
              }
            }
            ((rk) this).field_s = new hr(0);
            ((rk) this).field_fb = null;
            ((rk) this).field_fb = new hr(0);
            ((rk) this).field_L = new em(250);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.KA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -31123) {
                break L1;
              } else {
                ((rk) this).field_t = -120;
                break L1;
              }
            }
            L2: {
              if (((rk) this).field_S != null) {
                ((rk) this).field_S.a(db.a(true, 40 + param2), u.a(90 + param0, (byte) 94), (byte) -3);
                ((rk) this).field_S.a((byte) -72, false);
                eu.a(-10, u.a(38 + param0, (byte) 94), db.a(true, param2), (jd) null);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "rk.BC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final ft e(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        ft stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        ft stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              if (param0 < -35) {
                break L1;
              } else {
                this.m(-120);
                break L1;
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                if (param1 != 1) {
                  this.b(param3, -31123, param2);
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackOut_7_0 = this.a(param1, param4, -93);
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "rk.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return (ft) (Object) stackIn_10_0;
    }

    private final ru f(int param0, int param1) {
        ru[] var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        ru stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        ru stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              var3 = ro.field_rb;
              if (param1 < param0) {
                break L1;
              } else {
                if (~param1 < ~var3.length) {
                  break L1;
                } else {
                  stackOut_8_0 = var3[param1];
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = null;
            stackIn_7_0 = stackOut_6_0;
            return (ru) (Object) stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3_ref, "rk.AB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param2 == -31550) {
                break L1;
              } else {
                ft discarded$2 = ((rk) this).a((byte) -64);
                break L1;
              }
            }
            L2: {
              var7 = 0;
              if (param1 < 0) {
                break L2;
              } else {
                if (~va.field_G.length < ~param1) {
                  var8 = va.field_G[param1];
                  ds.a(param4, 40 + param0, var7, param2 + 58616, false, var6_int, true, var8);
                  ds.a(param4, param0 + 40, var7, param2 + 58616, false, var6_int, false, var8);
                  this.b(param4, 40 + param0, param3, -25713, param1, var6_int);
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "rk.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int a(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              if (null == ((rk) this).field_w) {
                break L1;
              } else {
                if (((rk) this).field_w.length == 0) {
                  break L1;
                } else {
                  L2: {
                    if (param0 < 0) {
                      break L2;
                    } else {
                      if (~param0 > ~((rk) this).field_w.length) {
                        L3: {
                          if (((rk) this).field_Z == null) {
                            break L3;
                          } else {
                            if (null != ((rk) this).field_R) {
                              if (param1 == 4) {
                                var3_int = ((rk) this).field_w[param0];
                                if (var3_int != 22) {
                                  if (var3_int != 23) {
                                    if (var3_int != 8) {
                                      stackOut_32_0 = 1;
                                      stackIn_33_0 = stackOut_32_0;
                                      break L0;
                                    } else {
                                      stackOut_30_0 = db.a(true, ((rk) this).field_Z.field_k);
                                      stackIn_31_0 = stackOut_30_0;
                                      return stackIn_31_0;
                                    }
                                  } else {
                                    stackOut_27_0 = so.field_b.field_a >> 99795777;
                                    stackIn_28_0 = stackOut_27_0;
                                    return stackIn_28_0;
                                  }
                                } else {
                                  stackOut_24_0 = db.a(true, ((rk) this).field_R.field_k);
                                  stackIn_25_0 = stackOut_24_0;
                                  return stackIn_25_0;
                                }
                              } else {
                                stackOut_21_0 = 0;
                                stackIn_22_0 = stackOut_21_0;
                                return stackIn_22_0;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "rk.W(" + param0 + ',' + param1 + ')');
        }
        return stackIn_33_0;
    }

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4_int = 0;
        wk var4 = null;
        ft var5_ref_ft = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((rk) this).field_X) {
                break L1;
              } else {
                if (((rk) this).field_X.length != 3) {
                  break L1;
                } else {
                  if (~((rk) this).field_N != ~((rk) this).field_f) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            var2_int = -1;
            var3 = -1;
            var4_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var4_int >= 6) {
                      break L5;
                    } else {
                      var5_ref_ft = this.d(var4_int, 1);
                      stackOut_11_0 = -1;
                      stackOut_11_1 = ~var3;
                      stackIn_44_0 = stackOut_11_0;
                      stackIn_44_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (var9 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_12_0 >= stackIn_12_1) {
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
                          if (0 <= var2_int) {
                            break L7;
                          } else {
                            if (var5_ref_ft.field_k >= 0) {
                              var2_int = var5_ref_ft.field_k;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (var2_int < 0) {
                            break L8;
                          } else {
                            if (var5_ref_ft.field_k > var2_int) {
                              var2_int = var5_ref_ft.field_k;
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
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (var2_int < 0) {
                    break L3;
                  } else {
                    stackOut_42_0 = 0;
                    stackOut_42_1 = var3;
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_44_1 = stackOut_42_1;
                    break L4;
                  }
                }
                if (stackIn_44_0 <= stackIn_44_1) {
                  L10: {
                    if (var2_int <= 0) {
                      break L10;
                    } else {
                      if (var3 > 0) {
                        L11: {
                          var4 = new wk(var2_int, var3);
                          var5 = 3 * var2_int >> 1903659170;
                          if (param0) {
                            break L11;
                          } else {
                            ((rk) this).field_v = null;
                            break L11;
                          }
                        }
                        ((rk) this).field_X = new wk[3];
                        var6 = var3 * 3 >> 894871042;
                        var7 = 0;
                        L12: while (true) {
                          L13: {
                            L14: {
                              if (~((rk) this).field_X.length >= ~var7) {
                                break L14;
                              } else {
                                ((rk) this).field_X[var7] = new wk(var5, var6);
                                var8 = var7;
                                if (var9 != 0) {
                                  break L13;
                                } else {
                                  L15: {
                                    if (((rk) this).field_N != 13) {
                                      break L15;
                                    } else {
                                      var8 = ((rk) this).field_X.length + var7;
                                      break L15;
                                    }
                                  }
                                  this.a(((rk) this).field_X[var7], var8, 0, var4, -110, 0);
                                  var7++;
                                  if (var9 == 0) {
                                    continue L12;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            var4.field_B = null;
                            break L13;
                          }
                          var4 = null;
                          ((rk) this).field_f = ((rk) this).field_N;
                          break L0;
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                  return;
                } else {
                  break L3;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.OB(" + param0 + ')');
        }
    }

    private final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_D = 24;
                break L1;
              }
            }
            stackOut_3_0 = nr.field_e.field_H >> 1799193921;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.CB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final ft e(int param0, int param1) {
        RuntimeException var3 = null;
        ft stackIn_2_0 = null;
        ft stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        ft stackOut_4_0 = null;
        ft stackOut_1_0 = null;
        try {
          L0: {
            if (param1 != 0) {
              if (param1 != 1) {
                L1: {
                  if (param0 == 3) {
                    break L1;
                  } else {
                    ((rk) this).field_ab = null;
                    break L1;
                  }
                }
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_4_0 = new ft(0, 0);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = new ft(40, 20);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "rk.RB(" + param0 + ',' + param1 + ')');
        }
        return (ft) (Object) stackIn_10_0;
    }

    private final int a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 17) {
                break L1;
              } else {
                ((rk) this).field_N = 84;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (param1 >= param0.length) {
                    break L2;
                  } else {
                    L3: {
                      if (param0[param1] != -1) {
                        break L3;
                      } else {
                        if (~(1 + param1) <= ~param0.length) {
                          break L3;
                        } else {
                          var4_int = param1 + 1;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (~var4_int <= ~param0.length) {
                                  break L6;
                                } else {
                                  var5 = param0[var4_int];
                                  stackOut_25_0 = 0;
                                  stackIn_38_0 = stackOut_25_0;
                                  stackIn_26_0 = stackOut_25_0;
                                  if (var6 != 0) {
                                    break L5;
                                  } else {
                                    if (stackIn_26_0 < var5) {
                                      stackOut_31_0 = var5;
                                      stackIn_32_0 = stackOut_31_0;
                                      return stackIn_32_0;
                                    } else {
                                      if (var5 == 0) {
                                        var4_int++;
                                        if (var6 == 0) {
                                          continue L4;
                                        } else {
                                          break L6;
                                        }
                                      } else {
                                        stackOut_34_0 = -1;
                                        stackIn_35_0 = stackOut_34_0;
                                        return stackIn_35_0;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_37_0 = -1;
                              stackIn_38_0 = stackOut_37_0;
                              break L5;
                            }
                            break L0;
                          }
                        }
                      }
                    }
                    stackOut_21_0 = -1;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0;
                  }
                }
              }
            }
            stackOut_13_0 = -1;
            stackIn_14_0 = stackOut_13_0;
            return stackIn_14_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("rk.S(");
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L7;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_38_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        ft var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (param1 <= 1) {
                  L2: {
                    L3: {
                      L4: {
                        if (param1 != 0) {
                          break L4;
                        } else {
                          if (((rk) this).field_d == null) {
                            break L3;
                          } else {
                            if (((rk) this).field_h == null) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (param1 != 1) {
                        break L2;
                      } else {
                        L5: {
                          if (((rk) this).field_q == null) {
                            break L5;
                          } else {
                            if (((rk) this).field_M != null) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_int = 10;
                        var6 = 1;
                        ((rk) this).field_q = this.b(var5_int, -1, var6, param1);
                        ((rk) this).field_M = new hr(var5_int);
                        ((rk) this).field_M.a(false, 256);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5_int = 29;
                    var6 = 1;
                    ((rk) this).field_d = this.b(var5_int, param3 ^ 19555, var6, param1);
                    ((rk) this).field_h = new hr(var5_int);
                    break L2;
                  }
                  L6: {
                    if (param3 == -19556) {
                      break L6;
                    } else {
                      ((rk) this).field_t = 104;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      L9: {
                        if (0 != param1) {
                          break L9;
                        } else {
                          if (((rk) this).field_d == null) {
                            break L9;
                          } else {
                            if (((rk) this).field_h != null) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      if (1 != param1) {
                        break L7;
                      } else {
                        if (null == ((rk) this).field_q) {
                          break L7;
                        } else {
                          if (null == ((rk) this).field_M) {
                            break L7;
                          } else {
                            var5_ref = this.a(param0, 0, param2, param1, -3);
                            if (null != var5_ref) {
                              this.a(7 * (var5_ref.field_n >> -1006471837) + param2, 57, ((rk) this).field_M, param0 - -(var5_ref.field_k >> 541572449));
                              var6 = ri.field_c[0];
                              var7 = 0;
                              this.a(var7, param0, ((rk) this).field_d.field_O, var6, 102, ((rk) this).field_q, ((rk) this).field_d, param2);
                              if (var8 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    var5_ref = this.a(param0, 0, param2, param1, -3);
                    if (null != var5_ref) {
                      this.a(7 * (var5_ref.field_n >> -1811977501) + param2, 88, ((rk) this).field_h, (var5_ref.field_k >> -1939182623) + param0);
                      var6 = ri.field_c[0];
                      var7 = 0;
                      this.a(var7, param0, ((rk) this).field_d.field_O, var6, 110, ((rk) this).field_d, ((rk) this).field_d, param2);
                      break L7;
                    } else {
                      return;
                    }
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "rk.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 256) {
                break L1;
              } else {
                ft discarded$2 = this.a(-114, 69, 36, -82, (wk) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 == -1) {
                  break L3;
                } else {
                  if (param0 == 0) {
                    break L3;
                  } else {
                    if (param0 <= 0) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_10_0 = 1;
              stackIn_13_0 = stackOut_10_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "rk.RA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void n(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((rk) this).field_N = 0;
              ((rk) this).field_p = -1;
              if (null == ((rk) this).field_Z) {
                ((rk) this).field_Z = new ft(31, 431);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((rk) this).field_n != null) {
                break L2;
              } else {
                ((rk) this).field_n = new ft(608, 462);
                break L2;
              }
            }
            L3: {
              if (param0 > 98) {
                break L3;
              } else {
                this.j(40);
                break L3;
              }
            }
            L4: {
              if (null == ((rk) this).field_R) {
                ((rk) this).field_R = new ft(44, 386);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != ((rk) this).field_b) {
                break L5;
              } else {
                ((rk) this).field_b = new ft(595, 415);
                break L5;
              }
            }
            L6: {
              if (((rk) this).field_w == null) {
                ((rk) this).field_w = new int[]{22, 8, 23};
                break L6;
              } else {
                break L6;
              }
            }
            this.p(31559);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.JA(" + param0 + ')');
        }
    }

    private final void g(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((rk) this).field_a) {
              return;
            } else {
              L1: {
                var2_int = ((rk) this).field_C.field_n;
                var3 = this.h((byte) -117);
                if (param0 >= 105) {
                  break L1;
                } else {
                  this.g((byte) 9);
                  break L1;
                }
              }
              var4 = var3 + var2_int;
              fe.b(((rk) this).field_a, db.a(true, ((rk) this).field_F.field_k), u.a(var4, (byte) 94));
              fe.c(((rk) this).field_a, db.a(true, ((rk) this).field_F.field_k), u.a(var4, (byte) 94), nd.field_b, false);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.H(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        qb var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((rk) this).field_ab = null;
              if (null == sf.field_P) {
                break L1;
              } else {
                if (sf.field_P.length <= 76) {
                  break L1;
                } else {
                  L2: {
                    var2_int = sf.field_P[76];
                    if (null == ck.field_e) {
                      break L2;
                    } else {
                      if (var2_int < 0) {
                        break L2;
                      } else {
                        if (ck.field_e.length <= var2_int) {
                          break L2;
                        } else {
                          L3: {
                            if (null == ck.field_e[var2_int]) {
                              break L3;
                            } else {
                              if (ck.field_e[var2_int].length <= 0) {
                                break L3;
                              } else {
                                L4: {
                                  if (param0 == -11195) {
                                    break L4;
                                  } else {
                                    ((rk) this).field_I = false;
                                    break L4;
                                  }
                                }
                                var3 = ck.field_e[sf.field_P[76]][0];
                                if (null != var3) {
                                  ((rk) this).field_ab = new vj(1);
                                  ((rk) this).field_ab.a(-1, var3);
                                  break L0;
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
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "rk.IB(" + param0 + ')');
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
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
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
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
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
        var19 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param5 <= -111) {
              L1: {
                if (null == param1) {
                  break L1;
                } else {
                  if (null == param0) {
                    break L1;
                  } else {
                    if (param4 != null) {
                      if (~param1.length != ~param0.length) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        if (param1.length != param3.length) {
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        } else {
                          if (param1.length == param4.length) {
                            var8_int = param2;
                            var9 = ((rk) this).field_i;
                            var10 = ((rk) this).field_m;
                            var11 = -var9 + var10;
                            var12 = 0;
                            var13 = 0;
                            L2: while (true) {
                              L3: {
                                L4: {
                                  if (~var13 <= ~param1.length) {
                                    break L4;
                                  } else {
                                    var14 = param1[var13];
                                    var15 = param0[var13];
                                    var16 = param3[var13];
                                    var17 = param4[var13];
                                    stackOut_28_0 = ~var17;
                                    stackIn_46_0 = stackOut_28_0;
                                    stackIn_29_0 = stackOut_28_0;
                                    if (var19 != 0) {
                                      break L3;
                                    } else {
                                      L5: {
                                        if (stackIn_29_0 == 0) {
                                          var18 = this.a(param4, var13, 50);
                                          if (var18 < 0) {
                                            break L5;
                                          } else {
                                            var11 = var11 / var18;
                                            var12 = 1;
                                            var10 = var11 + var9;
                                            break L5;
                                          }
                                        } else {
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        L7: {
                                          var18 = this.a(param6, var14, var15, var10, 9, var16, var13, param2, var9);
                                          if (var12 == 0) {
                                            break L7;
                                          } else {
                                            if (!this.c(var17, 256)) {
                                              break L7;
                                            } else {
                                              var9 = var9 - -var11;
                                              var10 = var11 + var10;
                                              if (this.a(0, var17)) {
                                                var12 = 0;
                                                var9 = ((rk) this).field_i;
                                                var10 = ((rk) this).field_m;
                                                param2 = param2 - -var18;
                                                var11 = var10 - var9;
                                                if (var19 == 0) {
                                                  break L6;
                                                } else {
                                                  break L7;
                                                }
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                        }
                                        var12 = 0;
                                        param2 = var18 + param2;
                                        break L6;
                                      }
                                      var13++;
                                      if (var19 == 0) {
                                        continue L2;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                }
                                stackOut_45_0 = param2 - var8_int;
                                stackIn_46_0 = stackOut_45_0;
                                break L3;
                              }
                              break L0;
                            }
                          } else {
                            stackOut_24_0 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0;
            } else {
              stackOut_2_0 = 69;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var8;
            stackOut_47_1 = new StringBuilder().append("rk.SA(");
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L8;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L8;
            }
          }
          L9: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L9;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L9;
            }
          }
          L10: {
            stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param2).append(',');
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
              break L10;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L10;
            }
          }
          L11: {
            stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',');
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param4 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L11;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L11;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_46_0;
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
            int stackIn_4_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_70_0 = 0;
            int stackIn_74_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_126_0 = 0;
            int stackIn_143_0 = 0;
            int stackIn_145_0 = 0;
            int stackIn_159_0 = 0;
            int stackIn_162_0 = 0;
            RuntimeException stackIn_164_0 = null;
            StringBuilder stackIn_164_1 = null;
            RuntimeException stackIn_166_0 = null;
            StringBuilder stackIn_166_1 = null;
            RuntimeException stackIn_167_0 = null;
            StringBuilder stackIn_167_1 = null;
            String stackIn_167_2 = null;
            RuntimeException stackIn_168_0 = null;
            StringBuilder stackIn_168_1 = null;
            RuntimeException stackIn_170_0 = null;
            StringBuilder stackIn_170_1 = null;
            RuntimeException stackIn_171_0 = null;
            StringBuilder stackIn_171_1 = null;
            String stackIn_171_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_69_0 = 0;
            int stackOut_67_0 = 0;
            int stackOut_73_0 = 0;
            int stackOut_71_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_84_0 = 0;
            int stackOut_82_0 = 0;
            int stackOut_125_0 = 0;
            int stackOut_144_0 = 0;
            int stackOut_142_0 = 0;
            int stackOut_158_0 = 0;
            int stackOut_161_0 = 0;
            int stackOut_53_0 = 0;
            RuntimeException stackOut_163_0 = null;
            StringBuilder stackOut_163_1 = null;
            RuntimeException stackOut_166_0 = null;
            StringBuilder stackOut_166_1 = null;
            String stackOut_166_2 = null;
            RuntimeException stackOut_164_0 = null;
            StringBuilder stackOut_164_1 = null;
            String stackOut_164_2 = null;
            RuntimeException stackOut_167_0 = null;
            StringBuilder stackOut_167_1 = null;
            RuntimeException stackOut_170_0 = null;
            StringBuilder stackOut_170_1 = null;
            String stackOut_170_2 = null;
            RuntimeException stackOut_168_0 = null;
            StringBuilder stackOut_168_1 = null;
            String stackOut_168_2 = null;
            var9 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != am.field_z) {
                    break L1;
                  } else {
                    var6_int = tb.a(param5, 0) ? 1 : 0;
                    if (var6_int != 0) {
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
                      L4: {
                        if (param5) {
                          break L4;
                        } else {
                          fu.field_g = ml.a(false, param4, (byte) 10, param3);
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      fu.field_g = oi.a((String) null, param3, false, 1, dc.field_o);
                      break L3;
                    }
                    vl.field_n.field_q = 0;
                    vl.field_n.b(1, 14);
                    vl.field_n.b(param0 ^ -54, fu.field_g.a((byte) -16).field_c);
                    hb.a((byte) 67, -1);
                    ov.field_g = gi.field_d;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  if (ov.field_g == gi.field_d) {
                    if (es.a(-111, 1)) {
                      L6: {
                        L7: {
                          var6_int = mg.field_e.k(0);
                          if (0 != var6_int) {
                            break L7;
                          } else {
                            ov.field_g = mh.field_a;
                            if (var9 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        nm.field_o = var6_int;
                        fk.field_b = -1;
                        ov.field_g = be.field_z;
                        break L6;
                      }
                      mg.field_e.field_q = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if (mh.field_a == ov.field_g) {
                    if (!es.a(-115, 8)) {
                      break L8;
                    } else {
                      ts.field_h = mg.field_e.j((byte) -2);
                      mg.field_e.field_q = 0;
                      bk.a(param2, param5, fu.field_g, 0, param1);
                      ov.field_g = jf.field_D;
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (ov.field_g != jf.field_D) {
                    break L9;
                  } else {
                    if (es.a(-90, 1)) {
                      L10: {
                        var6_int = mg.field_e.k(param0 + 53);
                        mg.field_e.field_q = 0;
                        gh.field_P = null;
                        nm.field_o = var6_int;
                        if (var6_int == 0) {
                          break L10;
                        } else {
                          if (var6_int == 1) {
                            break L10;
                          } else {
                            if (var6_int != 8) {
                              ov.field_g = be.field_z;
                              fk.field_b = -1;
                              if (var9 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            } else {
                              dj.a((byte) -126);
                              ev.field_b = false;
                              stackOut_47_0 = var6_int;
                              stackIn_48_0 = stackOut_47_0;
                              return stackIn_48_0;
                            }
                          }
                        }
                      }
                      ov.field_g = oq.field_m;
                      fk.field_b = -1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                if (param0 == -53) {
                  L11: {
                    if (oq.field_m != ov.field_g) {
                      break L11;
                    } else {
                      if (!jh.g(2)) {
                        break L11;
                      } else {
                        L12: {
                          dc.field_o = mg.field_e.j((byte) -2);
                          wl.field_I = param3;
                          hi.field_j = mg.field_e.k(0);
                          tf.field_l = mg.field_e.k(0);
                          df.field_M = mg.field_e.e((byte) -104);
                          var6_ref = mg.field_e.c((byte) -125);
                          var7 = mg.field_e.k(param0 + 53);
                          if ((var7 & 1) != 0) {
                            wj.a(0);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (!param5) {
                            L14: {
                              if ((var7 & 8) == 0) {
                                stackOut_69_0 = 0;
                                stackIn_70_0 = stackOut_69_0;
                                break L14;
                              } else {
                                stackOut_67_0 = 1;
                                stackIn_70_0 = stackOut_67_0;
                                break L14;
                              }
                            }
                            L15: {
                              bb.field_a = stackIn_70_0 != 0;
                              if ((2 & var7) == 0) {
                                stackOut_73_0 = 0;
                                stackIn_74_0 = stackOut_73_0;
                                break L15;
                              } else {
                                stackOut_71_0 = 1;
                                stackIn_74_0 = stackOut_71_0;
                                break L15;
                              }
                            }
                            L16: {
                              vi.field_d = stackIn_74_0 != 0;
                              if ((4 & var7) == 0) {
                                stackOut_77_0 = 0;
                                stackIn_78_0 = stackOut_77_0;
                                break L16;
                              } else {
                                stackOut_75_0 = 1;
                                stackIn_78_0 = stackOut_75_0;
                                break L16;
                              }
                            }
                            ul.field_m = stackIn_78_0 != 0;
                            if (!bb.field_a) {
                              break L13;
                            } else {
                              vi.field_d = true;
                              break L13;
                            }
                          } else {
                            break L13;
                          }
                        }
                        L17: {
                          if ((16 & var7) == 0) {
                            stackOut_84_0 = 0;
                            stackIn_85_0 = stackOut_84_0;
                            break L17;
                          } else {
                            stackOut_82_0 = 1;
                            stackIn_85_0 = stackOut_82_0;
                            break L17;
                          }
                        }
                        L18: {
                          L19: {
                            c.field_c = stackIn_85_0 != 0;
                            if (!ul.field_a) {
                              break L19;
                            } else {
                              int discarded$5 = mg.field_e.k(0);
                              int discarded$6 = mg.field_e.k(param0 ^ -53);
                              int discarded$7 = mg.field_e.i(param0 + 54);
                              of.field_Nb = mg.field_e.e((byte) -104);
                              nk.field_C = new byte[of.field_Nb];
                              var8 = 0;
                              L20: while (true) {
                                if (of.field_Nb <= var8) {
                                  break L19;
                                } else {
                                  nk.field_C[var8] = mg.field_e.a((byte) -49);
                                  var8++;
                                  if (var9 != 0) {
                                    break L18;
                                  } else {
                                    if (var9 == 0) {
                                      continue L20;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          mv.field_d = mg.field_e.g(1);
                          ft.field_p = k.a((CharSequence) (Object) mv.field_d, false);
                          vt.field_n = mg.field_e.k(0);
                          ov.field_g = kl.field_k;
                          break L18;
                        }
                        L21: {
                          L22: {
                            if (fu.field_g.a((byte) 50) != pt.field_db) {
                              break L22;
                            } else {
                              vn.field_j.a(param0 + -84, ag.d((byte) -127));
                              if (var9 == 0) {
                                break L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          if (fu.field_g.a((byte) -11) != fl.field_u) {
                            break L21;
                          } else {
                            ps.field_y.a(param0 + -84, ag.d((byte) -120));
                            break L21;
                          }
                        }
                        L23: {
                          ev.field_b = false;
                          if (null == var6_ref) {
                            break L23;
                          } else {
                            ph.a(var6_ref, ag.d((byte) -117), false);
                            break L23;
                          }
                        }
                        L24: {
                          L25: {
                            if (df.field_M > 0) {
                              break L25;
                            } else {
                              if (ul.field_m) {
                                break L25;
                              } else {
                                try {
                                  L26: {
                                    Object discarded$8 = lj.a("unzap", (byte) -52, ag.d((byte) -128));
                                    decompiledRegionSelector0 = 0;
                                    break L26;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L27: {
                                    var8_ref_Throwable = decompiledCaughtException;
                                    if (var9 == 0) {
                                      decompiledRegionSelector0 = 0;
                                      break L27;
                                    } else {
                                      decompiledRegionSelector0 = 1;
                                      break L27;
                                    }
                                  }
                                }
                                if (decompiledRegionSelector0 == 0) {
                                  break L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          try {
                            L28: {
                              Object discarded$9 = lj.a(ag.d((byte) -115), "zap", new Object[1], 106);
                              break L28;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L29: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L29;
                            }
                          }
                          break L24;
                        }
                        L30: {
                          if (df.field_M <= 0) {
                            break L30;
                          } else {
                            aw.field_l = true;
                            break L30;
                          }
                        }
                        vl.field_n.a(ag.field_L, -106);
                        var8 = 0;
                        L31: while (true) {
                          L32: {
                            L33: {
                              if (4 <= var8) {
                                break L33;
                              } else {
                                ag.field_L[var8] = ag.field_L[var8] + 50;
                                var8++;
                                if (var9 != 0) {
                                  break L32;
                                } else {
                                  if (var9 == 0) {
                                    continue L31;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                            mg.field_e.a(ag.field_L, param0 + -66);
                            break L32;
                          }
                          stackOut_125_0 = nm.field_o;
                          stackIn_126_0 = stackOut_125_0;
                          return stackIn_126_0;
                        }
                      }
                    }
                  }
                  L34: {
                    if (be.field_z == ov.field_g) {
                      if (jh.g(2)) {
                        L35: {
                          dj.a((byte) -128);
                          if (nm.field_o != 7) {
                            break L35;
                          } else {
                            if (!ev.field_b) {
                              ev.field_b = true;
                              stackOut_144_0 = -1;
                              stackIn_145_0 = stackOut_144_0;
                              return stackIn_145_0;
                            } else {
                              break L35;
                            }
                          }
                        }
                        L36: {
                          if (nm.field_o != 7) {
                            break L36;
                          } else {
                            nm.field_o = 3;
                            break L36;
                          }
                        }
                        lk.field_r = mg.field_e.g(1);
                        ev.field_b = false;
                        stackOut_142_0 = nm.field_o;
                        stackIn_143_0 = stackOut_142_0;
                        return stackIn_143_0;
                      } else {
                        break L34;
                      }
                    } else {
                      break L34;
                    }
                  }
                  L37: {
                    if (null == am.field_z) {
                      if (!ev.field_b) {
                        var6_int = rn.field_d;
                        rn.field_d = sm.field_c;
                        sm.field_c = var6_int;
                        ev.field_b = true;
                        break L37;
                      } else {
                        L38: {
                          L39: {
                            if (ca.b(0) <= 30000L) {
                              break L39;
                            } else {
                              lk.field_r = gu.field_a;
                              if (var9 == 0) {
                                break L38;
                              } else {
                                break L39;
                              }
                            }
                          }
                          lk.field_r = nw.field_y;
                          break L38;
                        }
                        ev.field_b = false;
                        stackOut_158_0 = 3;
                        stackIn_159_0 = stackOut_158_0;
                        return stackIn_159_0;
                      }
                    } else {
                      break L37;
                    }
                  }
                  stackOut_161_0 = -1;
                  stackIn_162_0 = stackOut_161_0;
                  break L0;
                } else {
                  stackOut_53_0 = -46;
                  stackIn_54_0 = stackOut_53_0;
                  return stackIn_54_0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L40: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_163_0 = (RuntimeException) var6;
                stackOut_163_1 = new StringBuilder().append("rk.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_166_0 = stackOut_163_0;
                stackIn_166_1 = stackOut_163_1;
                stackIn_164_0 = stackOut_163_0;
                stackIn_164_1 = stackOut_163_1;
                if (param3 == null) {
                  stackOut_166_0 = (RuntimeException) (Object) stackIn_166_0;
                  stackOut_166_1 = (StringBuilder) (Object) stackIn_166_1;
                  stackOut_166_2 = "null";
                  stackIn_167_0 = stackOut_166_0;
                  stackIn_167_1 = stackOut_166_1;
                  stackIn_167_2 = stackOut_166_2;
                  break L40;
                } else {
                  stackOut_164_0 = (RuntimeException) (Object) stackIn_164_0;
                  stackOut_164_1 = (StringBuilder) (Object) stackIn_164_1;
                  stackOut_164_2 = "{...}";
                  stackIn_167_0 = stackOut_164_0;
                  stackIn_167_1 = stackOut_164_1;
                  stackIn_167_2 = stackOut_164_2;
                  break L40;
                }
              }
              L41: {
                stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
                stackOut_167_1 = ((StringBuilder) (Object) stackIn_167_1).append(stackIn_167_2).append(',');
                stackIn_170_0 = stackOut_167_0;
                stackIn_170_1 = stackOut_167_1;
                stackIn_168_0 = stackOut_167_0;
                stackIn_168_1 = stackOut_167_1;
                if (param4 == null) {
                  stackOut_170_0 = (RuntimeException) (Object) stackIn_170_0;
                  stackOut_170_1 = (StringBuilder) (Object) stackIn_170_1;
                  stackOut_170_2 = "null";
                  stackIn_171_0 = stackOut_170_0;
                  stackIn_171_1 = stackOut_170_1;
                  stackIn_171_2 = stackOut_170_2;
                  break L41;
                } else {
                  stackOut_168_0 = (RuntimeException) (Object) stackIn_168_0;
                  stackOut_168_1 = (StringBuilder) (Object) stackIn_168_1;
                  stackOut_168_2 = "{...}";
                  stackIn_171_0 = stackOut_168_0;
                  stackIn_171_1 = stackOut_168_1;
                  stackIn_171_2 = stackOut_168_2;
                  break L41;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_171_0, stackIn_171_2 + ',' + param5 + ')');
            }
            return stackIn_162_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(String param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
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
              if (~param5 == ~((rk) this).field_N) {
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
                  if (~((rk) this).field_N <= ~((rk) this).field_p) {
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
              L11: {
                this.j(-302977872);
                this.b(param2 + -62);
                ((rk) this).field_O = param0;
                if (((rk) this).field_N == 12) {
                  break L11;
                } else {
                  if (((rk) this).field_N == 13) {
                    break L11;
                  } else {
                    this.m(0);
                    if (!ArmiesOfGielinor.field_M) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              this.b(true);
              break L10;
            }
            L12: {
              if (param2 == 100) {
                break L12;
              } else {
                ((rk) this).field_Q = true;
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var7 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var7;
            stackOut_50_1 = new StringBuilder().append("rk.G(");
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L13;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L13;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final ft d(int param0, int param1) {
        ft var3 = null;
        RuntimeException var3_ref = null;
        ft stackIn_13_0 = null;
        ft stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        ft stackOut_17_0 = null;
        ft stackOut_12_0 = null;
        try {
          L0: {
            L1: {
              var3 = new ft(-1, -1);
              if (0 > param0) {
                break L1;
              } else {
                if (~param0 <= ~ue.field_k.length) {
                  break L1;
                } else {
                  if (1 + param0 >= hr.field_d.length) {
                    break L1;
                  } else {
                    if (gt.field_c.length <= param0) {
                      break L1;
                    } else {
                      L2: {
                        if (param1 == 1) {
                          break L2;
                        } else {
                          ((rk) this).field_o = false;
                          break L2;
                        }
                      }
                      var3.field_k = ue.field_k[param0].field_A;
                      var3.field_n = ue.field_k[param0].field_x;
                      stackOut_17_0 = (ft) var3;
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_12_0 = (ft) var3;
            stackIn_13_0 = stackOut_12_0;
            return stackIn_13_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3_ref, "rk.MA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_18_0;
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
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_99_0 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        var24 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var10_int = param8;
              if (param4 == 9) {
                break L1;
              } else {
                int discarded$6 = this.h(-86);
                break L1;
              }
            }
            L2: {
              var11 = param3;
              var12 = param7;
              var13 = 0;
              var14 = 0;
              var15 = this.d(17);
              var16 = null;
              var17 = null;
              if (param5 == -1) {
                break L2;
              } else {
                L3: {
                  var16 = (Object) (Object) this.a(0, (byte) 80, param0, 0, param6, 0);
                  if (var16 == null) {
                    break L3;
                  } else {
                    L4: {
                      if (((ft) var16).field_k < 0) {
                        break L4;
                      } else {
                        if (((ft) var16).field_n >= 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var16 = null;
                    break L3;
                  }
                }
                var17 = (Object) (Object) this.a(0, (byte) 73, param0, 0, param6, 1);
                break L2;
              }
            }
            L5: {
              if (param5 != 5) {
                break L5;
              } else {
                if (null == var16) {
                  break L5;
                } else {
                  if (var17 != null) {
                    var11 = var11 - (((rk) this).field_db + ((ft) var16).field_k);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (3 != param5) {
                break L6;
              } else {
                if (var16 == null) {
                  break L6;
                } else {
                  if (null != var17) {
                    var10_int = var10_int + (((rk) this).field_db + ((ft) var16).field_k);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (param5 != 1) {
                break L7;
              } else {
                if (var16 == null) {
                  break L7;
                } else {
                  if (var17 == null) {
                    break L7;
                  } else {
                    var18 = (-((ft) var16).field_k + param3 - param8 >> -1404634623) + -((ft) var17).field_k + param8;
                    var19 = param7 + -((ft) var17).field_n + var13;
                    ft discarded$7 = this.a(var19, (byte) 46, param0, var18, param6, 2);
                    var12 = var12 + ((ft) var16).field_n;
                    break L7;
                  }
                }
              }
            }
            L8: {
              if (null != param2) {
                L9: {
                  var18 = var10_int;
                  var19 = var12;
                  var20 = var11 - var10_int;
                  var21 = rs.field_n.a(param2, var20, var15);
                  var22 = ((rk) this).field_z;
                  var23 = 0;
                  if (param5 != 1) {
                    break L9;
                  } else {
                    if (var16 == null) {
                      break L9;
                    } else {
                      if (var17 == null) {
                        break L9;
                      } else {
                        var23 = 1;
                        break L9;
                      }
                    }
                  }
                }
                L10: {
                  int discarded$8 = rs.field_n.a(param2, db.a(true, var18), u.a(var19, (byte) 94), var20, var21, var22, -1, var23, 0, var15);
                  var12 = var12 + var21;
                  if (null == param1) {
                    break L10;
                  } else {
                    var12 = var12 + ((rk) this).field_g;
                    break L10;
                  }
                }
                var19 = var19 + var21;
                var13 = var12 + -param7;
                break L8;
              } else {
                break L8;
              }
            }
            L11: {
              if (null == param1) {
                break L11;
              } else {
                if (rs.field_n == null) {
                  break L11;
                } else {
                  var18 = var10_int;
                  var19 = var12;
                  var20 = var11 + -var10_int;
                  var21 = 0;
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (param1.length <= var21) {
                          break L14;
                        } else {
                          var22 = rs.field_n.a(param1[var21], var20, var15);
                          var23 = ((rk) this).field_l;
                          int discarded$9 = rs.field_n.a(param1[var21], db.a(true, var18), u.a(var19, (byte) 94), var20, var22, var23, -1, 0, 0, var15);
                          var19 = var19 + var22;
                          stackOut_62_0 = ~(-1 + param1.length);
                          stackOut_62_1 = ~var21;
                          stackIn_69_0 = stackOut_62_0;
                          stackIn_69_1 = stackOut_62_1;
                          stackIn_63_0 = stackOut_62_0;
                          stackIn_63_1 = stackOut_62_1;
                          if (var24 != 0) {
                            break L13;
                          } else {
                            L15: {
                              if (stackIn_63_0 >= stackIn_63_1) {
                                break L15;
                              } else {
                                var19 = var19 + ((rk) this).field_E;
                                break L15;
                              }
                            }
                            var21++;
                            if (var24 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      stackOut_68_0 = var19;
                      stackOut_68_1 = -param7;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      break L13;
                    }
                    var13 = stackIn_69_0 + stackIn_69_1;
                    break L11;
                  }
                }
              }
            }
            L16: {
              L17: {
                if (param5 != 3) {
                  break L17;
                } else {
                  if (var16 == null) {
                    break L17;
                  } else {
                    if (null == var17) {
                      break L17;
                    } else {
                      L18: {
                        var18 = param8 - ((ft) var17).field_k;
                        var19 = -((ft) var17).field_n + param7;
                        if (~((ft) var16).field_n < ~var13) {
                          break L18;
                        } else {
                          var19 = var19 + (var13 + -((ft) var16).field_n >> -1943477791);
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          ft discarded$10 = this.a(var19, (byte) 52, param0, var18, param6, 2);
                          if (~(((rk) this).field_E + var13) > ~((ft) var16).field_n) {
                            break L20;
                          } else {
                            var14 = var14 + var13;
                            if (var24 == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var14 = var14 + ((ft) var16).field_n;
                        break L19;
                      }
                      if (var24 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
              }
              L21: {
                if (param5 != 5) {
                  break L21;
                } else {
                  if (var16 == null) {
                    break L21;
                  } else {
                    if (var17 == null) {
                      break L21;
                    } else {
                      L22: {
                        var18 = -((ft) var16).field_k + -((ft) var17).field_k + param3;
                        var19 = param7 + -((ft) var17).field_n;
                        if (var13 < ((ft) var16).field_n) {
                          break L22;
                        } else {
                          var19 = var19 + (-((ft) var16).field_n + var13 >> 1354795105);
                          break L22;
                        }
                      }
                      L23: {
                        L24: {
                          ft discarded$11 = this.a(var19, (byte) 68, param0, var18, param6, 2);
                          if (~(((rk) this).field_E + var13) <= ~((ft) var16).field_n) {
                            break L24;
                          } else {
                            var14 = var14 + ((ft) var16).field_n;
                            if (var24 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        var14 = var14 + var13;
                        break L23;
                      }
                      if (var24 == 0) {
                        break L16;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
              }
              var14 = var14 + var13;
              break L16;
            }
            var14 = var14 + ((rk) this).field_E;
            stackOut_99_0 = var14;
            stackIn_100_0 = stackOut_99_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var10 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var10;
            stackOut_101_1 = new StringBuilder().append("rk.TA(").append(param0).append(',');
            stackIn_104_0 = stackOut_101_0;
            stackIn_104_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param1 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L25;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_105_0 = stackOut_102_0;
              stackIn_105_1 = stackOut_102_1;
              stackIn_105_2 = stackOut_102_2;
              break L25;
            }
          }
          L26: {
            stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
            stackOut_105_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_105_2).append(',');
            stackIn_108_0 = stackOut_105_0;
            stackIn_108_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param2 == null) {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "null";
              stackIn_109_0 = stackOut_108_0;
              stackIn_109_1 = stackOut_108_1;
              stackIn_109_2 = stackOut_108_2;
              break L26;
            } else {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "{...}";
              stackIn_109_0 = stackOut_106_0;
              stackIn_109_1 = stackOut_106_1;
              stackIn_109_2 = stackOut_106_2;
              break L26;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_109_0, stackIn_109_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_100_0;
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (~op.field_c.length >= ~param1) {
                  break L1;
                } else {
                  L2: {
                    if (((rk) this).field_L == null) {
                      break L2;
                    } else {
                      if (((rk) this).field_L.field_a < 0) {
                        break L2;
                      } else {
                        if (((rk) this).field_L.field_f <= 0) {
                          break L2;
                        } else {
                          if (~((rk) this).field_L.field_a < ~((rk) this).field_L.field_f) {
                            break L2;
                          } else {
                            L3: {
                              var5_int = 18;
                              var6 = 30;
                              param0 = param0 + var5_int;
                              if (!param3) {
                                break L3;
                              } else {
                                this.c((byte) -78);
                                break L3;
                              }
                            }
                            L4: {
                              param2 = param2 + var6;
                              var7 = 42;
                              var8 = 6;
                              qn.b(param0, param2, var7, var8, 16777215);
                              qn.f(param0 + 1, param2 + 1, -2 + var7, var8 + -2, 0);
                              var9 = 0;
                              if (((rk) this).field_L.field_f > 0) {
                                var9 = 1 - -(((rk) this).field_L.field_a * (var7 + -2) / 100);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              if (var9 >= 0) {
                                break L5;
                              } else {
                                var9 = 0;
                                break L5;
                              }
                            }
                            L6: {
                              if (~var9 < ~(var7 - 2)) {
                                var9 = var7 - 2;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            qn.f(param0 + 1, param2 - -1, var9, var8 - 2, op.field_c[0][param1]);
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "rk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((rk) this).field_p >= 0) {
              L1: {
                var2_int = ((rk) this).field_C.field_k;
                if (param0 == -102) {
                  break L1;
                } else {
                  ((rk) this).field_g = -92;
                  break L1;
                }
              }
              var3 = ((rk) this).field_C.field_n;
              var4 = ((rk) this).field_V.field_k + -var2_int;
              var5 = ((rk) this).field_V.field_n - var3;
              fe.b(db.a(true, var2_int), u.a(var3, (byte) 94), var4, var5, io.field_m, nd.field_b, ((rk) this).field_A, ((rk) this).field_e);
              this.g(120);
              var2_int = ((rk) this).field_x.field_k;
              var3 = ((rk) this).field_x.field_n;
              var4 = -var2_int + ((rk) this).field_K.field_k;
              var5 = -var3 + ((rk) this).field_K.field_n;
              fe.b(db.a(true, var2_int), u.a(var3, (byte) 94), var4, var5, io.field_m, ci.field_e, ((rk) this).field_A, ((rk) this).field_e);
              this.k(-107);
              this.l(param0 + 19);
              this.g((byte) 10);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "rk.J(" + param0 + ')');
        }
    }

    private final ft d(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ft stackIn_5_0 = null;
        ft stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        ft stackOut_13_0 = null;
        ft stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param3 == 0) {
              if (param1 != 0) {
                L1: {
                  if (param1 == 1) {
                    break L1;
                  } else {
                    L2: {
                      if (param1 == 2) {
                        this.b(param2, (byte) 127, param0);
                        if (!ArmiesOfGielinor.field_M) {
                          break L2;
                        } else {
                          break L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  }
                }
                stackOut_13_0 = new ft(0, 0);
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              } else {
                stackOut_4_0 = new ft(309, 81);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ft) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "rk.TB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (ft) (Object) stackIn_16_0;
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

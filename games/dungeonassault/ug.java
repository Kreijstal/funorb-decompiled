/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends qb {
    private int field_L;
    private wa field_W;
    private int[] field_O;
    private int[] field_q;
    private lp[][] field_u;
    private int[] field_J;
    private int[] field_U;
    private int[] field_m;
    private lp[][] field_r;
    private int field_x;
    private int[] field_N;
    private int[] field_K;
    int[] field_Q;
    private vm field_A;
    private int[] field_s;
    private int[] field_I;
    int[] field_o;
    private int[] field_n;
    private int[] field_V;
    private int[] field_B;
    private int[] field_P;
    static int[] field_E;
    int[] field_G;
    static fd field_w;
    private long field_F;
    private boolean field_T;
    private long field_z;
    private int field_t;
    private int field_p;
    static qk field_y;
    private hg field_R;
    private vh field_S;
    private int field_v;
    private boolean field_D;
    static String[] field_M;

    final synchronized void d(int param0) {
        this.c(true, 100);
        if (param0 >= -78) {
            this.b(false, -122);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 != 78) {
            this.f(61);
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_O[param2] = param1;
        this.field_Q[param2] = (int)(0.5 + 2097152.0 * Math.pow((double)param0, 0.00054931640625 * (double)param1));
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        lp var6;
        int var7;
        lp var8;
        var7 = DungeonAssault.field_K;
        var8 = this.field_u[param2][param1];
        if (var8 == null) {
          return;
        } else {
          L0: {
            if (param0) {
              break L0;
            } else {
              this.b((int[]) null, -89, 102);
              break L0;
            }
          }
          L1: {
            L2: {
              this.field_u[param2][param1] = null;
              if ((this.field_G[param2] & 2) == 0) {
                break L2;
              } else {
                var6 = (lp) ((Object) this.field_R.field_q.e(-24172));
                L3: while (true) {
                  L4: {
                    if (var6 == null) {
                      break L4;
                    } else {
                      if (var7 != 0) {
                        break L1;
                      } else {
                        L5: {
                          if (var6.field_p != var8.field_p) {
                            break L5;
                          } else {
                            if ((var6.field_r ^ -1) <= -1) {
                              break L5;
                            } else {
                              if (var6 == var8) {
                                break L5;
                              } else {
                                var8.field_r = 0;
                                if (var7 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var6 = (lp) ((Object) this.field_R.field_q.a(4));
                        if (var7 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var8.field_r = 0;
            break L1;
          }
          return;
        }
    }

    final synchronized void a(vh param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(true, -16257, param0, param2);
              if (param1 == 20938) {
                break L1;
              } else {
                ug.a(false, 34, (CharSequence) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ug.RA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = DungeonAssault.field_K;
                    if (param0 < 70) {
                        statePc = 9;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param1 != this.field_P[param2]) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_P[param2] = param1;
                    var4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((var4 ^ -1) <= -129) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_r[param2][var4] = null;
                    var4++;
                    if (var5 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var5 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1) {
        lp var3;
        int var4;
        lp stackIn_14_0 = null;
        lp stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          if (!param1) {
            break L0;
          } else {
            this.field_Q = (int[]) null;
            break L0;
          }
        }
        var3 = (lp) ((Object) this.field_R.field_q.e(-24172));
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var4 != 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (-1 < (param0 ^ -1)) {
                      break L4;
                    } else {
                      if (var3.field_p == param0) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (null != var3.field_v) {
                      L6: {
                        var3.field_v.f(vn.field_t / 100);
                        if (!var3.field_v.e()) {
                          break L6;
                        } else {
                          this.field_R.field_o.b(var3.field_v);
                          break L6;
                        }
                      }
                      L7: {
                        stackIn_14_0 = (lp) (var3);

                        if (param1) {
                          stackIn_15_0 = (lp) ((Object) stackIn_14_0);
                          stackIn_15_1 = 0;
                          break L7;
                        } else {
                          stackIn_15_0 = (lp) ((Object) stackIn_14_0);
                          stackIn_15_1 = 1;
                          break L7;
                        }
                      }
                      ((lp) (Object) stackIn_15_0).b(stackIn_15_1 != 0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L8: {
                    if (-1 >= (var3.field_r ^ -1)) {
                      break L8;
                    } else {
                      this.field_u[var3.field_p][var3.field_y] = null;
                      break L8;
                    }
                  }
                  var3.a(param1);
                  break L3;
                }
                var3 = (lp) ((Object) this.field_R.field_q.a(4));
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    final synchronized boolean b(byte param0) {
        if (param0 >= -116) {
            this.field_q = (int[]) null;
        }
        return this.field_A.g();
    }

    private final void b(byte param0, int param1, int param2) {
        this.field_J[param2] = param1;
        this.field_K[param2] = nb.a(-128, param1);
        if (param0 >= -54) {
            this.field_N = (int[]) null;
        }
        this.a((byte) 114, param1, param2);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param3 < 62) {
            this.f(-63, 116);
        }
    }

    final synchronized void f(int param0) {
        int var3 = 0;
        kk var4 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = DungeonAssault.field_K;
                    if (param0 == -50) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(100, (byte) 104, 28);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = (kk) ((Object) this.field_W.a(true));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var4 == null) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4.a((byte) -97);
                    var4 = (kk) ((Object) this.field_W.a(4318));
                    if (var3 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized int a() {
        return 0;
    }

    private final void d(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = DungeonAssault.field_K;
                    if (!param0) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(-1, false);
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.b(true, -1);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    this.e(-1, 0);
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (16 <= var3) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_P[var3] = this.field_J[var3];
                    var3++;
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var4 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (param1 == 16) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.a((lp) null, 42);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var5 = 0;
                    var3 = var5;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var5 >= 16) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_K[var5] = nb.a(this.field_J[var5], -128);
                    var5++;
                    if (var4 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var4 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        lp stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_18_0 = null;
        lp stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackIn_19_0 = null;
        lp stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        lp stackOut_3_0;
        int var5;
        lp var6;
        int var7_int;
        va var7;
        lp var8;
        lp var9;
        int var10;
        kk var11;
        kk var12;
        L0: {
          L1: {
            var10 = DungeonAssault.field_K;
            this.a(true, param2, param3, 64);
            var5 = 109 / ((57 - param1) / 44);
            if (0 == (2 & this.field_G[param3])) {
              break L1;
            } else {
              var6 = (lp) ((Object) this.field_R.field_q.d(-14205));
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  stackOut_3_0 = (lp) (var6);
                  stackIn_9_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var10 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_4_0.field_p != param3) {
                        break L3;
                      } else {
                        if (var6.field_r >= 0) {
                          break L3;
                        } else {
                          this.field_u[param3][var6.field_y] = null;
                          this.field_u[param3][param2] = var6;
                          var7_int = var6.field_s - -(var6.field_w * var6.field_J >> -2049184180);
                          var6.field_s = var6.field_s + (param2 - var6.field_y << 87126856);
                          var6.field_y = param2;
                          var6.field_J = var7_int + -var6.field_s;
                          var6.field_w = 4096;
                          return;
                        }
                      }
                    }
                    var6 = (lp) ((Object) this.field_R.field_q.g(20));
                    if (var10 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackIn_9_0 = this.field_W.a((long)this.field_P[param3], 8);
          break L0;
        }
        var11 = (kk) ((Object) stackIn_9_0);
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var7 = var11.field_k[param2];
          if (var7 == null) {
            return;
          } else {
            L4: {
              L5: {
                var8 = new lp();
                var8.field_x = var12;
                var8.field_I = var7;
                var8.field_p = param3;
                var8.field_A = var11.field_n[param2];
                var8.field_D = var11.field_o[param2];
                var8.field_y = param2;
                var8.field_t = 1024 + var11.field_m[param2] * var12.field_j * (param0 * param0) >> 437537835;
                var8.field_i = var11.field_p[param2] & 255;
                var8.field_s = (param2 << 1510794408) + -(32767 & var11.field_r[param2]);
                var8.field_r = -1;
                var8.field_j = 0;
                var8.field_u = 0;
                var8.field_k = 0;
                var8.field_l = 0;
                if (0 == this.field_o[param3]) {
                  break L5;
                } else {
                  L6: {
                    var8.field_v = ni.a(var7, this.a((byte) 46, var8), 0, this.a(var8, false));
                    stackIn_18_0 = this;

                    stackIn_18_1 = (lp) (var8);

                    stackIn_18_2 = 4917;

                    if (var11.field_r[param2] >= 0) {
                      stackIn_19_0 = this;
                      stackIn_19_1 = (lp) ((Object) stackIn_18_1);
                      stackIn_19_2 = stackIn_18_2;
                      stackIn_19_3 = 0;
                      break L6;
                    } else {
                      stackIn_19_0 = this;
                      stackIn_19_1 = (lp) ((Object) stackIn_18_1);
                      stackIn_19_2 = stackIn_18_2;
                      stackIn_19_3 = 1;
                      break L6;
                    }
                  }
                  this.a(stackIn_19_1, stackIn_19_2, stackIn_19_3 != 0);
                  if (var10 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var8.field_v = ni.a(var7, this.a((byte) 78, var8), this.b(var8, 0), this.a(var8, false));
              break L4;
            }
            L7: {
              if (-1 >= (var11.field_r[param2] ^ -1)) {
                break L7;
              } else {
                var8.field_v.e(-1);
                break L7;
              }
            }
            L8: {
              if (var8.field_D < 0) {
                break L8;
              } else {
                L9: {
                  var9 = this.field_r[param3][var8.field_D];
                  if (var9 == null) {
                    break L9;
                  } else {
                    if (-1 >= (var9.field_r ^ -1)) {
                      break L9;
                    } else {
                      this.field_u[param3][var9.field_y] = null;
                      var9.field_r = 0;
                      break L9;
                    }
                  }
                }
                this.field_r[param3][var8.field_D] = var8;
                break L8;
              }
            }
            this.field_R.field_q.a(var8, false);
            this.field_u[param3][param2] = var8;
            return;
          }
        }
    }

    private final void f(int param0, int param1) {
        int var3;
        lp var4;
        int var5;
        L0: {
          var5 = DungeonAssault.field_K;
          var3 = 13 / ((param1 - -35) / 49);
          if ((this.field_G[param0] & 4) != 0) {
            var4 = (lp) ((Object) this.field_R.field_q.e(-24172));
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                if (var5 != 0) {
                  break L0;
                } else {
                  L2: {
                    if (param0 == var4.field_p) {
                      var4.field_m = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var4 = (lp) ((Object) this.field_R.field_q.a(4));
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
    }

    final boolean a(lp param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.field_v == null) {
              L1: {
                if (0 > param0.field_r) {
                  break L1;
                } else {
                  param0.a(false);
                  if (param0.field_D <= 0) {
                    break L1;
                  } else {
                    if (param0 != this.field_r[param0.field_p][param0.field_D]) {
                      break L1;
                    } else {
                      this.field_r[param0.field_p][param0.field_D] = null;
                      return true;
                    }
                  }
                }
              }
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param1 == -16257) {
                  break L2;
                } else {
                  this.field_r = (lp[][]) null;
                  break L2;
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ug.P(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        this.field_B[param2] = param1;
        if (param0) {
            ug.a(false, 29);
        }
    }

    private final synchronized void c(boolean param0, int param1) {
        this.field_A.c();
        if (param1 <= 27) {
            return;
        }
        this.field_S = null;
        this.d(param0, 16);
    }

    private final int a(byte param0, lp param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        of var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_J * param1.field_w >> 1304504076) + param1.field_s;
              var3_int = var3_int + ((-8192 + this.field_B[param1.field_p]) * this.field_I[param1.field_p] >> -393744788);
              if (param0 > 2) {
                break L1;
              } else {
                this.b((int[]) null, 108, -85);
                break L1;
              }
            }
            L2: {
              var4 = param1.field_A;
              if ((var4.field_i ^ -1) >= -1) {
                break L2;
              } else {
                L3: {
                  if (var4.field_h > 0) {
                    break L3;
                  } else {
                    if (-1 <= (this.field_U[param1.field_p] ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_h << -1402346078;
                  var6 = var4.field_a << 1930747233;
                  if (param1.field_G < var6) {
                    var5 = param1.field_G * var5 / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (this.field_U[param1.field_p] >> -480773785);
                var7 = Math.sin((double)(param1.field_E & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(256 * param1.field_I.field_n) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)vn.field_t + 0.5);
              if ((var5 ^ -1) > -2) {
                stackIn_13_0 = 1;
                break L5;
              } else {
                stackIn_13_0 = var5;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ug.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = DungeonAssault.field_K;
                    if (param1 < 0) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_V[param1] = param0;
                    if (var5 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (-17 >= (var4 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_V[var4] = param0;
                    var4++;
                    if (var5 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var5 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = 54 / ((-2 - param2) / 60);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_A.g()) {
                  break L2;
                } else {
                  var4_int = this.field_A.field_c * this.field_x / vn.field_t;
                  L3: while (true) {
                    L4: {
                      var5 = this.field_z - -((long)param2 * (long)var4_int);
                      if (this.field_F - var5 >= 0L) {
                        this.field_z = var5;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var7 = (int)(((long)var4_int + this.field_F - this.field_z + -1L) / (long)var4_int);
                    this.field_z = this.field_z + (long)var4_int * (long)var7;
                    this.field_R.b(param0, param1, var7);
                    this.a((byte) -24);
                    param1 = param1 + var7;
                    param2 = param2 - var7;
                    if (!this.field_A.g()) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        this.field_R.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
              }
              this.field_R.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ug.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0, int param1) {
        int var4;
        var4 = DungeonAssault.field_K;
        if (param1 > param0) {
          param0 = 0;
          L0: while (true) {
            if (16 > param0) {
              this.e(param0, param1 + 0);
              param0++;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_q[param0] = 12800;
          this.field_n[param0] = 8192;
          this.field_m[param0] = 16383;
          this.field_B[param0] = 8192;
          this.field_U[param0] = 0;
          this.field_s[param0] = 8192;
          this.d(param0, -1);
          this.f(param0, param1 + -108);
          this.field_G[param0] = 0;
          this.field_N[param0] = 32767;
          this.field_I[param0] = 256;
          this.field_o[param0] = 0;
          this.a(2, 8192, param0);
          return;
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        String stackIn_10_0 = null;
        int stackIn_13_0 = 0;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            var3 = cm.a(param0, -125, param2);
            if (var3 == null) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= param2.length()) {
                      break L3;
                    } else {
                      stackOut_6_0 = rp.a(param2.charAt(var4), (byte) -120);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          stackIn_10_0 = me.field_a;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var4++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = param1;
                  break L2;
                }
                if (stackIn_13_0 > -39) {
                  stackIn_16_0 = (String) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("ug.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final synchronized qb d() {
        return (qb) ((Object) this.field_R);
    }

    final synchronized void c(byte param0, int param1, int param2) {
        this.b((byte) -87, param1, param2);
        int var4 = -56 % ((param0 - -57) / 43);
    }

    private final synchronized void a(boolean param0, int param1, vh param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.c(param0, param1 + 16353);
                        this.field_A.a(param2.field_i);
                        this.field_z = 0L;
                        if (param1 == -16257) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a((vh) null, -111, false);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_5_0 = this;
                        stackIn_4_0 = stackIn_5_0;
                        if (!param3) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_6_0 = this;
                        stackIn_6_1 = 1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = this;
                        stackIn_6_1 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((ug) (this)).field_T = stackIn_6_1 != 0;
                        var5_int = this.field_A.a();
                        var6 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5_int <= var6) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_A.d(var6);
                        this.field_A.b(var6);
                        this.field_A.a(var6);
                        var6++;
                        if (var7 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_p = this.field_A.b();
                        this.field_t = this.field_A.field_d[this.field_p];
                        this.field_F = this.field_A.e(this.field_t);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("ug.EA(").append(param0).append(',').append(param1).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param2 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized qb c() {
        return null;
    }

    private final void b(boolean param0, int param1) {
        lp var3;
        int var4;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var4 = DungeonAssault.field_K;
        var3 = (lp) ((Object) this.field_R.field_q.e(-24172));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackIn_10_0 = -1;

                stackIn_10_1 = param1 ^ -1;

                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_10_0 < stackIn_10_1) {
                        break L4;
                      } else {
                        if (param1 == var3.field_p) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (-1 >= (var3.field_r ^ -1)) {
                      break L3;
                    } else {
                      this.field_u[var3.field_p][var3.field_y] = null;
                      var3.field_r = 0;
                      break L3;
                    }
                  }
                  var3 = (lp) ((Object) this.field_R.field_q.a(4));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_10_0 = param0 ? 1 : 0;
            stackIn_10_1 = 1;
            break L1;
          }
          L5: {
            if (stackIn_10_0 == stackIn_10_1) {
              break L5;
            } else {
              this.field_x = 27;
              break L5;
            }
          }
          return;
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param1 != 24509) {
            return;
        }
        this.field_L = param0;
    }

    public static void e(int param0) {
        field_E = null;
        field_y = null;
        field_M = null;
        if (param0 != 0) {
            ug.a(true, -75);
        }
        field_w = null;
    }

    private final void a(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = DungeonAssault.field_K;
                    if (param0 == -24) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_V = (int[]) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var2 = this.field_p;
                    var3 = this.field_t;
                    var4 = this.field_F;
                    if (this.field_S == null) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_v != var3) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.a(this.field_D, -16257, this.field_S, this.field_T);
                    this.a((byte) -24);
                    return;
                }
                case 6: {
                    if (this.field_t == var3) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_t = var3;
                    this.field_F = var4;
                    this.field_p = var2;
                    if (null == this.field_S) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = var3;
                    stackIn_9_1 = this.field_v;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 <= stackIn_9_1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_p = -1;
                    this.field_t = this.field_v;
                    this.field_F = this.field_A.e(this.field_t);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    stackIn_15_0 = this.field_A.field_d[var2];
                    stackIn_13_0 = stackIn_15_0;
                    stackIn_15_1 = var3;
                    stackIn_13_1 = stackIn_15_1;
                    if (var7 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (stackIn_13_0 != stackIn_13_1) {
                        statePc = 32;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_A.d(var2);
                    var6 = this.field_A.c(var2);
                    stackIn_19_0 = 1;
                    stackIn_19_1 = var6;
                    statePc = 19;
                    continue stateLoop;
                }
                case 15: {
                    if (stackIn_15_0 <= stackIn_15_1) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_p = -1;
                    this.field_t = this.field_v;
                    this.field_F = this.field_A.e(this.field_t);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 19: {
                    if (stackIn_19_0 != stackIn_19_1) {
                        statePc = 28;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    this.field_A.e();
                    this.field_A.a(var2);
                    if (!this.field_A.f()) {
                        statePc = 32;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (null == this.field_S) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.a(this.field_S, 20938, this.field_T);
                    this.a((byte) -24);
                    return;
                }
                case 23: {
                    if (!this.field_T) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (0 != var3) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_A.a(var4);
                    if (var7 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.d(true, 16);
                    this.field_A.c();
                    return;
                }
                case 28: {
                    if (-1 != (128 & var6 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.a(var6, 16384);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    this.field_A.b(var2);
                    this.field_A.a(var2);
                    if (var7 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var2 = this.field_A.b();
                    var3 = this.field_A.field_d[var2];
                    var4 = this.field_A.e(var3);
                    if (var7 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_t = var3;
                    this.field_F = var4;
                    this.field_p = var2;
                    if (null == this.field_S) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = var3;
                    stackIn_35_1 = this.field_v;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (stackIn_35_0 <= stackIn_35_1) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_p = -1;
                    this.field_t = this.field_v;
                    this.field_F = this.field_A.e(this.field_t);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, int param2, lp param3, int[] param4) {
        int stackIn_10_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_78_1 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        of var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              param3.field_H = vn.field_t / 100;
              if (-1 < (param3.field_r ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_v) {
                    break L2;
                  } else {
                    if (param3.field_v.f()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.b(true);
                  param3.a(false);
                  if (-1 <= (param3.field_D ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_r[param3.field_p][param3.field_D] == param3) {
                      this.field_r[param3.field_p][param3.field_D] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param3.field_w;
              if (0 < var6_int) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)this.field_s[param3.field_p]) * 16.0 + 0.5);
                  if (-1 >= (var6_int ^ -1)) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param3.field_w = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_v.g(this.a((byte) 119, param3));
              var7 = param3.field_A;
              param3.field_E = param3.field_E + var7.field_i;
              var8 = 0;
              param3.field_G = param3.field_G + 1;
              var9 = (double)((param3.field_J * param3.field_w >> -74208788) + (-60 + param3.field_y << -1507399608)) * 0.000005086263020833333;
              if (0 >= var7.field_c) {
                break L6;
              } else {
                L7: {
                  L8: {
                    if (0 < var7.field_b) {
                      break L8;
                    } else {
                      param3.field_k = param3.field_k + 128;
                      if (var12 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param3.field_k = param3.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
                  break L7;
                }
                if (819200 > param3.field_k * var7.field_c) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              }
            }
            L9: {
              if (var7.field_n == null) {
                break L9;
              } else {
                L10: {
                  L11: {
                    if (var7.field_e > 0) {
                      break L11;
                    } else {
                      param3.field_u = param3.field_u + 128;
                      if (var12 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param3.field_u = param3.field_u + (int)(Math.pow(2.0, var9 * (double)var7.field_e) * 128.0 + 0.5);
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (param3.field_l >= var7.field_n.length - 2) {
                        break L14;
                      } else {
                        stackIn_34_0 = param3.field_u ^ -1;

                        stackIn_34_1 = (var7.field_n[param3.field_l - -2] & 255) << -1048706744 ^ -1;

                        if (var12 != 0) {
                          break L13;
                        } else {
                          if (stackIn_34_0 >= stackIn_34_1) {
                            break L14;
                          } else {
                            param3.field_l = param3.field_l + 2;
                            if (var12 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackIn_34_0 = var7.field_n.length - 2;
                    stackIn_34_1 = param3.field_l;
                    break L13;
                  }
                  if (stackIn_34_0 != stackIn_34_1) {
                    break L9;
                  } else {
                    if (var7.field_n[1 + param3.field_l] != 0) {
                      break L9;
                    } else {
                      var8 = 1;
                      break L9;
                    }
                  }
                }
              }
            }
            L15: {
              if (-1 < (param3.field_r ^ -1)) {
                break L15;
              } else {
                if (null == var7.field_o) {
                  break L15;
                } else {
                  if ((1 & this.field_G[param3.field_p]) != 0) {
                    break L15;
                  } else {
                    L16: {
                      if ((param3.field_D ^ -1) > -1) {
                        break L16;
                      } else {
                        if (this.field_r[param3.field_p][param3.field_D] != param3) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (0 < var7.field_m) {
                          break L18;
                        } else {
                          param3.field_r = param3.field_r + 128;
                          if (var12 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param3.field_r = param3.field_r + (int)(Math.pow(2.0, var9 * (double)var7.field_m) * 128.0 + 0.5);
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (var7.field_o.length - 2 <= param3.field_j) {
                            break L21;
                          } else {
                            stackIn_53_0 = (var7.field_o[param3.field_j - -2] & 255) << -1263441464 ^ -1;

                            stackIn_53_1 = param3.field_r ^ -1;

                            if (var12 != 0) {
                              break L20;
                            } else {
                              if (stackIn_53_0 <= stackIn_53_1) {
                                break L21;
                              } else {
                                param3.field_j = param3.field_j + 2;
                                if (var12 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackIn_53_0 = param3.field_j;
                        stackIn_53_1 = var7.field_o.length + -2;
                        break L20;
                      }
                      if (stackIn_53_0 == stackIn_53_1) {
                        var8 = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
              }
            }
            var11 = -89 % ((param0 - -80) / 44);
            if (var8 != 0) {
              L22: {
                L23: {
                  param3.field_v.f(param3.field_H);
                  if (param4 == null) {
                    break L23;
                  } else {
                    param3.field_v.b(param4, param1, param2);
                    if (var12 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param3.field_v.a(param2);
                break L22;
              }
              L24: {
                if (!param3.field_v.e()) {
                  break L24;
                } else {
                  this.field_R.field_o.b(param3.field_v);
                  break L24;
                }
              }
              L25: {
                param3.b(true);
                if (param3.field_r < 0) {
                  break L25;
                } else {
                  param3.a(false);
                  if (0 >= param3.field_D) {
                    break L25;
                  } else {
                    if (this.field_r[param3.field_p][param3.field_D] == param3) {
                      this.field_r[param3.field_p][param3.field_D] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              stackIn_70_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param3.field_v.a(param3.field_H, this.b(param3, 0), this.a(param3, false));
              stackIn_72_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackIn_75_0 = (RuntimeException) (var6);

            stackIn_75_1 = new StringBuilder().append("ug.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L26;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_78_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',');

            if (param4 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L27;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L27;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_76_0), stackIn_79_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_70_0 != 0;
          } else {
            return stackIn_72_0 != 0;
          }
        }
    }

    private final void a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = DungeonAssault.field_K;
        var3 = param0 & 240;
        if ((var3 ^ -1) != -129) {
          if ((var3 ^ -1) != -145) {
            if (-161 == (var3 ^ -1)) {
              var4 = param0 & 15;
              var5 = (param0 & 32616) >> -441246840;
              var6 = param0 >> -934978256 & 127;
              this.a(var5, var6, var4, 73);
              return;
            } else {
              if (176 == var3) {
                L0: {
                  var4 = 15 & param0;
                  var5 = param0 >> 920555240 & 127;
                  var6 = (param0 & 8364021) >> 1906167408;
                  if (0 == var5) {
                    this.field_K[var4] = (var6 << 837209358) + nb.a(this.field_K[var4], -2080769);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (32 != var5) {
                    break L1;
                  } else {
                    this.field_K[var4] = (var6 << -400930393) + nb.a(this.field_K[var4], -16257);
                    break L1;
                  }
                }
                L2: {
                  if (1 != var5) {
                    break L2;
                  } else {
                    this.field_U[var4] = (var6 << 1889208487) + nb.a(this.field_U[var4], -16257);
                    break L2;
                  }
                }
                L3: {
                  if (-34 == (var5 ^ -1)) {
                    this.field_U[var4] = nb.a(-128, this.field_U[var4]) - -var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((var5 ^ -1) != -6) {
                    break L4;
                  } else {
                    this.field_s[var4] = (var6 << -1005307801) + nb.a(this.field_s[var4], -16257);
                    break L4;
                  }
                }
                L5: {
                  if (37 != var5) {
                    break L5;
                  } else {
                    this.field_s[var4] = var6 + nb.a(-128, this.field_s[var4]);
                    break L5;
                  }
                }
                L6: {
                  if ((var5 ^ -1) == -8) {
                    this.field_q[var4] = (var6 << -701083449) + nb.a(this.field_q[var4], -16257);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-40 == (var5 ^ -1)) {
                    this.field_q[var4] = nb.a(-128, this.field_q[var4]) - -var6;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (-11 == (var5 ^ -1)) {
                    this.field_n[var4] = (var6 << -503820953) + nb.a(this.field_n[var4], -16257);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var5 != 42) {
                    break L9;
                  } else {
                    this.field_n[var4] = var6 + nb.a(-128, this.field_n[var4]);
                    break L9;
                  }
                }
                L10: {
                  if (var5 != 11) {
                    break L10;
                  } else {
                    this.field_m[var4] = (var6 << -960643065) + nb.a(this.field_m[var4], -16257);
                    break L10;
                  }
                }
                L11: {
                  if (43 != var5) {
                    break L11;
                  } else {
                    this.field_m[var4] = var6 + nb.a(-128, this.field_m[var4]);
                    break L11;
                  }
                }
                L12: {
                  if (64 == var5) {
                    L13: {
                      if (-65 < (var6 ^ -1)) {
                        break L13;
                      } else {
                        this.field_G[var4] = mp.a(this.field_G[var4], 1);
                        if (var8 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    this.field_G[var4] = nb.a(this.field_G[var4], -2);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L14: {
                  if (var5 == 65) {
                    L15: {
                      if (64 > var6) {
                        break L15;
                      } else {
                        this.field_G[var4] = mp.a(this.field_G[var4], 2);
                        if (var8 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    this.d(var4, -1);
                    this.field_G[var4] = nb.a(this.field_G[var4], -3);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (var5 != 99) {
                    break L16;
                  } else {
                    this.field_N[var4] = (var6 << -983617305) + nb.a(127, this.field_N[var4]);
                    break L16;
                  }
                }
                L17: {
                  if (var5 == 98) {
                    this.field_N[var4] = nb.a(16256, this.field_N[var4]) - -var6;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (-102 == (var5 ^ -1)) {
                    this.field_N[var4] = (var6 << -1451847545) + 16384 - -nb.a(this.field_N[var4], 127);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (-101 != (var5 ^ -1)) {
                    break L19;
                  } else {
                    this.field_N[var4] = nb.a(this.field_N[var4], 16256) + (16384 + var6);
                    break L19;
                  }
                }
                L20: {
                  if (120 != var5) {
                    break L20;
                  } else {
                    this.a(var4, false);
                    break L20;
                  }
                }
                L21: {
                  if (121 != var5) {
                    break L21;
                  } else {
                    this.e(var4, 0);
                    break L21;
                  }
                }
                L22: {
                  if (var5 == 123) {
                    this.b(true, var4);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (var5 == 6) {
                    var7 = this.field_N[var4];
                    if (-16385 != (var7 ^ -1)) {
                      break L23;
                    } else {
                      this.field_I[var4] = nb.a(-16257, this.field_I[var4]) + (var6 << 1439700103);
                      break L23;
                    }
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (38 != var5) {
                    break L24;
                  } else {
                    var7 = this.field_N[var4];
                    if (var7 != 16384) {
                      break L24;
                    } else {
                      this.field_I[var4] = nb.a(-128, this.field_I[var4]) - -var6;
                      break L24;
                    }
                  }
                }
                L25: {
                  if (-17 == (var5 ^ -1)) {
                    this.field_o[var4] = nb.a(-16257, this.field_o[var4]) + (var6 << 23190535);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (-49 == (var5 ^ -1)) {
                    this.field_o[var4] = nb.a(-128, this.field_o[var4]) + var6;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (81 == var5) {
                    L28: {
                      if (var6 >= 64) {
                        break L28;
                      } else {
                        this.f(var4, param1 ^ 16418);
                        this.field_G[var4] = nb.a(this.field_G[var4], -5);
                        if (var8 == 0) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    this.field_G[var4] = mp.a(this.field_G[var4], 4);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L29: {
                  if ((var5 ^ -1) == -18) {
                    this.a(2, (-16257 & this.field_O[var4]) + (var6 << 1133207975), var4);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (-50 == (var5 ^ -1)) {
                    this.a(2, var6 + (this.field_O[var4] & -128), var4);
                    break L30;
                  } else {
                    break L30;
                  }
                }
                return;
              } else {
                if ((var3 ^ -1) == -193) {
                  var4 = 15 & param0;
                  var5 = 127 & param0 >> 527765672;
                  this.a((byte) 106, this.field_K[var4] + var5, var4);
                  return;
                } else {
                  L31: {
                    if (param1 == 16384) {
                      break L31;
                    } else {
                      this.field_m = (int[]) null;
                      break L31;
                    }
                  }
                  if ((var3 ^ -1) != -209) {
                    if (224 == var3) {
                      var4 = param0 & 15;
                      var5 = (param0 >> 427745577 & 16256) + ((32761 & param0) >> 1532984104);
                      this.a(false, var5, var4);
                      return;
                    } else {
                      var3 = 255 & param0;
                      if (var3 == 255) {
                        this.d(true, 16);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    var4 = param0 & 15;
                    var5 = 127 & param0 >> 295606440;
                    this.a(var5, (byte) 78, var4);
                    return;
                  }
                }
              }
            }
          } else {
            var4 = param0 & 15;
            var5 = param0 >> 194301640 & 127;
            var6 = (param0 & 8385741) >> 1207982832;
            if (0 >= var6) {
              this.a(true, var5, var4, 64);
              if (var8 != 0) {
                this.b(var6, -29, var5, var4);
                return;
              } else {
                return;
              }
            } else {
              this.b(var6, -29, var5, var4);
              return;
            }
          }
        } else {
          var4 = 15 & param0;
          var5 = (32667 & param0) >> -895345400;
          var6 = (8372321 & param0) >> -458272624;
          this.a(true, var5, var4, var6);
          return;
        }
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
          if (65536L > (long)param1) {
            if (256L <= (long)param1) {
              if ((long)param1 < 4096L) {
                if ((long)param1 >= 1024L) {
                  return lc.field_h[param1 >> 1041245092] >> 1926292682;
                } else {
                  return lc.field_h[param1 >> 302826466] >> -1126087221;
                }
              } else {
                if ((long)param1 < 16384L) {
                  return lc.field_h[param1 >> 195908710] >> -961943799;
                } else {
                  return lc.field_h[param1 >> 960380328] >> 1977364200;
                }
              }
            } else {
              if ((param1 ^ -1) <= -1) {
                return lc.field_h[param1] >> 1033422348;
              } else {
                return -1;
              }
            }
          } else {
            if (((long)param1 ^ -1L) > -16777217L) {
              if (-1048577L < ((long)param1 ^ -1L)) {
                if (((long)param1 ^ -1L) <= -262145L) {
                  return lc.field_h[param1 >> -1816909716] >> 1703478534;
                } else {
                  return lc.field_h[param1 >> -1339337302] >> -930371193;
                }
              } else {
                if ((long)param1 >= 4194304L) {
                  return lc.field_h[param1 >> 1798204208] >> 2105270884;
                } else {
                  return lc.field_h[param1 >> 826135758] >> 1320719301;
                }
              }
            } else {
              if (-268435457L < ((long)param1 ^ -1L)) {
                if (-67108865L < ((long)param1 ^ -1L)) {
                  return lc.field_h[param1 >> -1509973038] >> -1348626845;
                } else {
                  return lc.field_h[param1 >> 513142900] >> -1241490750;
                }
              } else {
                if (-1073741825L >= ((long)param1 ^ -1L)) {
                  return lc.field_h[param1 >> 759036184];
                } else {
                  return lc.field_h[param1 >> -1278419722] >> -1576437087;
                }
              }
            }
          }
        } else {
          return 34;
        }
    }

    private final int a(lp param0, boolean param1) {
        int discarded$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                discarded$1 = this.b((lp) null, 45);
                break L1;
              }
            }
            var3_int = this.field_n[param0.field_p];
            if (-8193 >= (var3_int ^ -1)) {
              stackIn_6_0 = -((-param0.field_i + 128) * (-var3_int + 16384) + 32 >> -310870714) + 16384;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 32 + var3_int * param0.field_i >> -1763752794;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ug.S(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final void d(int param0, int param1) {
        lp var3;
        int var4;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param1 != (this.field_G[param0] & 2 ^ -1)) {
            var3 = (lp) ((Object) this.field_R.field_q.e(-24172));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                if (var4 != 0) {
                  break L0;
                } else {
                  L2: {
                    if (param0 != var3.field_p) {
                      break L2;
                    } else {
                      if (this.field_u[param0][var3.field_y] == null) {
                        if (-1 >= (var3.field_r ^ -1)) {
                          break L2;
                        } else {
                          var3.field_r = 0;
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var3 = (lp) ((Object) this.field_R.field_q.a(4));
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
    }

    final synchronized void b(int param0, int param1) {
        this.field_x = param0;
        if (param1 != 0) {
            this.a(true, -114, (vh) null, false);
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        L0: {
          L1: {
            var6 = DungeonAssault.field_K;
            if (this.field_A.g()) {
              var2 = this.field_x * this.field_A.field_c / vn.field_t;
              L2: while (true) {
                L3: {
                  var3 = (long)param0 * (long)var2 + this.field_z;
                  if ((this.field_F + -var3 ^ -1L) <= -1L) {
                    this.field_z = var3;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var5 = (int)((-1L + (long)var2 + this.field_F + -this.field_z) / (long)var2);
                  this.field_z = this.field_z + (long)var5 * (long)var2;
                  this.field_R.a(var5);
                  param0 = param0 - var5;
                  this.a((byte) -24);
                  if (this.field_A.g()) {
                    break L4;
                  } else {
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 == 0) {
                  continue L2;
                } else {
                  this.field_R.a(param0);
                  break L0;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_R.a(param0);
          break L0;
        }
    }

    final synchronized boolean a(boolean param0, lc param1, nh param2, int param3, vh param4) {
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        mk var8 = null;
        int var9 = 0;
        kk var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param4.a();
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_u = (lp[][]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6_int = 1;
                        var7 = null;
                        if ((param3 ^ -1) < -1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = new int[]{param3};
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = (mk) ((Object) param4.field_j.a(true));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 == null) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = (int)var8.field_h;
                        var10 = (kk) ((Object) this.field_W.a((long)var9, 8));
                        if (var11 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var10 != null) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = dl.a((byte) 110, var9, param2);
                        if (var10 == null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6_int = 0;
                        if (var11 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_W.a(var10, 12460, (long)var9);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!var10.a((byte) 45, param1, (int[]) (var7), var8.field_k)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6_int = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = (mk) ((Object) param4.field_j.a(4318));
                        if (var11 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var6_int == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param4.b();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = var6_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var6);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("ug.L(").append(param0).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param1 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param2 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param3).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param4 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw vk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int b(lp param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        of var9 = null;
        of var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_V[param0.field_p] == 0) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = param0.field_A;
                var10 = var9;
                var4 = 4096 + this.field_q[param0.field_p] * this.field_m[param0.field_p] >> 943240237;
                var4 = var4 * var4 + 16384 >> -2050112401;
                var4 = 16384 + var4 * param0.field_t >> 1701060655;
                var4 = var4 * this.field_L - -128 >> -1912563480;
                var4 = this.field_V[param0.field_p] * var4 + 128 >> 1121079720;
                if (var10.field_c <= 0) {
                  break L1;
                } else {
                  var4 = (int)(Math.pow(0.5, (double)param0.field_k * 0.00001953125 * (double)var10.field_c) * (double)var4 + 0.5);
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_n) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_u;
                    var6 = var10.field_n[param0.field_l + 1];
                    if (param0.field_l < var10.field_n.length + -2) {
                      var7 = 65280 & var9.field_n[param0.field_l] << 622465704;
                      var8 = (255 & var10.field_n[2 + param0.field_l]) << 1593804776;
                      var6 = var6 + (-var6 + var10.field_n[3 + param0.field_l]) * (-var7 + var5) / (var8 + -var7);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = var6 * var4 + 32 >> 1069653030;
                  break L2;
                }
              }
              L4: {
                if (param1 >= param0.field_r) {
                  break L4;
                } else {
                  if (null == var10.field_o) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param0.field_r;
                      var6 = var10.field_o[1 + param0.field_j];
                      if (param0.field_j >= -2 + var10.field_o.length) {
                        break L5;
                      } else {
                        var7 = (255 & var9.field_o[param0.field_j]) << -169855512;
                        var8 = (var10.field_o[param0.field_j - -2] & 255) << -1547970168;
                        var6 = var6 + (-var7 + var5) * (-var6 + var10.field_o[param0.field_j - -3]) / (var8 + -var7);
                        break L5;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 1613877446;
                    break L4;
                  }
                }
              }
              stackIn_17_0 = var4;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("ug.BA(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_17_0;
        }
    }

    final void a(lp param0, int param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param0.field_I.field_k.length;
                if (!param2) {
                  break L2;
                } else {
                  if (!param0.field_I.field_j) {
                    break L2;
                  } else {
                    L3: {
                      var6 = -param0.field_I.field_l + var4_int + var4_int;
                      var5 = (int)((long)var6 * (long)this.field_o[param0.field_p] >> -1917788474);
                      var4_int = var4_int << 8;
                      if (var5 >= var4_int) {
                        param0.field_v.b(true);
                        var5 = var4_int + var4_int + -1 + -var5;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (DungeonAssault.field_K == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)this.field_o[param0.field_p] >> -846751738);
              break L1;
            }
            L4: {
              param0.field_v.i(var5);
              if (param1 == 4917) {
                break L4;
              } else {
                this.a(false, (lc) null, (nh) null, 98, (vh) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("ug.IA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public ug() {
        this.field_L = 256;
        this.field_q = new int[16];
        this.field_u = new lp[16][128];
        this.field_O = new int[16];
        this.field_I = new int[16];
        this.field_K = new int[16];
        this.field_m = new int[16];
        this.field_x = 1000000;
        this.field_r = new lp[16][128];
        this.field_V = new int[16];
        this.field_J = new int[16];
        this.field_U = new int[16];
        this.field_Q = new int[16];
        this.field_N = new int[16];
        this.field_B = new int[16];
        this.field_s = new int[16];
        this.field_P = new int[16];
        this.field_n = new int[16];
        this.field_G = new int[16];
        this.field_o = new int[16];
        this.field_A = new vm();
        this.field_R = new hg((ug) (this));
        this.field_W = new wa(128);
        this.a(256, -1, (byte) -84);
        this.d(true, 16);
    }

    ug(ug param0) {
        this.field_L = 256;
        this.field_q = new int[16];
        this.field_u = new lp[16][128];
        this.field_O = new int[16];
        this.field_I = new int[16];
        this.field_K = new int[16];
        this.field_m = new int[16];
        this.field_x = 1000000;
        this.field_r = new lp[16][128];
        this.field_V = new int[16];
        this.field_J = new int[16];
        this.field_U = new int[16];
        this.field_Q = new int[16];
        this.field_N = new int[16];
        this.field_B = new int[16];
        this.field_s = new int[16];
        this.field_P = new int[16];
        this.field_n = new int[16];
        this.field_G = new int[16];
        this.field_o = new int[16];
        this.field_A = new vm();
        this.field_R = new hg((ug) (this));
        try {
            this.field_W = param0.field_W;
            this.a(256, -1, (byte) -63);
            this.d(true, 16);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_E = rb.b(0, 0, 64);
        field_w = new fd(2);
        field_M = new String[]{"Hoard Room", "Well done! By reaching the <%highlight>hoard room</col> you have claimed possession of this dungeon. It is now yours to defend against other players. When you raid the dungeon of another player, their dragon will occupy this central tile instead, and you will have the opportunity to steal a portion of their Treasure and Renown.<br><br><%command>For now, end this game (by clicking Exit) and we will move on to Dungeon Construction.</col>"};
    }
}

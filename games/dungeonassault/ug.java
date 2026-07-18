/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        try {
            this.c(true, 100);
            if (param0 >= -78) {
                this.b(false, -122);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.W(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        try {
            if (param1 != 78) {
                ((ug) this).f(61);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.FA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        try {
            ((ug) this).field_O[param2] = param1;
            ((ug) this).field_Q[param2] = (int)(0.5 + 2097152.0 * Math.pow((double)param0, 0.00054931640625 * (double)param1));
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        lp var5 = null;
        RuntimeException var5_ref = null;
        lp var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            var5 = ((ug) this).field_u[param2][param1];
            if (var5 == null) {
              return;
            } else {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  ((ug) this).b((int[]) null, -89, 102);
                  break L1;
                }
              }
              L2: {
                L3: {
                  ((ug) this).field_u[param2][param1] = null;
                  if ((((ug) this).field_G[param2] & 2) == 0) {
                    break L3;
                  } else {
                    var6 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
                    L4: while (true) {
                      L5: {
                        if (null == var6) {
                          break L5;
                        } else {
                          if (var7 != 0) {
                            break L2;
                          } else {
                            L6: {
                              if (var6.field_p != var5.field_p) {
                                break L6;
                              } else {
                                if (var6.field_r >= 0) {
                                  break L6;
                                } else {
                                  if (var6 == var5) {
                                    break L6;
                                  } else {
                                    var5.field_r = 0;
                                    if (var7 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            var6 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
                            if (var7 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5.field_r = 0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var5_ref, "ug.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(vh param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(true, -16257, param0, param2);
              if (param1 == 20938) {
                break L1;
              } else {
                String discarded$3 = ug.a(false, 34, (CharSequence) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ug.RA(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 >= 70) {
              L1: {
                L2: {
                  if (param1 != ((ug) this).field_P[param2]) {
                    ((ug) this).field_P[param2] = param1;
                    var4_int = 0;
                    L3: while (true) {
                      if (var4_int >= 128) {
                        break L2;
                      } else {
                        ((ug) this).field_r[param2][var4_int] = null;
                        var4_int++;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "ug.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        lp var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lp stackIn_22_0 = null;
        lp stackIn_24_0 = null;
        lp stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        RuntimeException decompiledCaughtException = null;
        lp stackOut_21_0 = null;
        lp stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        lp stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((ug) this).field_Q = null;
                break L1;
              }
            }
            var3 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var3) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (param0 < 0) {
                            break L6;
                          } else {
                            if (var3.field_p == param0) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L7: {
                          if (null != var3.field_v) {
                            L8: {
                              var3.field_v.f(vn.field_t / 100);
                              if (!var3.field_v.e()) {
                                break L8;
                              } else {
                                ((ug) this).field_R.field_o.b((qb) (Object) var3.field_v);
                                break L8;
                              }
                            }
                            L9: {
                              stackOut_21_0 = (lp) var3;
                              stackIn_24_0 = stackOut_21_0;
                              stackIn_22_0 = stackOut_21_0;
                              if (param1) {
                                stackOut_24_0 = (lp) (Object) stackIn_24_0;
                                stackOut_24_1 = 0;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                break L9;
                              } else {
                                stackOut_22_0 = (lp) (Object) stackIn_22_0;
                                stackOut_22_1 = 1;
                                stackIn_25_0 = stackOut_22_0;
                                stackIn_25_1 = stackOut_22_1;
                                break L9;
                              }
                            }
                            ((lp) (Object) stackIn_25_0).b(stackIn_25_1 != 0);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L10: {
                          if (var3.field_r >= 0) {
                            break L10;
                          } else {
                            ((ug) this).field_u[var3.field_p][var3.field_y] = null;
                            break L10;
                          }
                        }
                        var3.a(param1);
                        break L5;
                      }
                      var3 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3_ref, "ug.D(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean b(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 < -116) {
                break L1;
              } else {
                ((ug) this).field_q = null;
                break L1;
              }
            }
            stackOut_3_0 = ((ug) this).field_A.g();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ug.Q(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void b(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((ug) this).field_J[param2] = param1;
              ((ug) this).field_K[param2] = nb.a(-128, param1);
              if (param0 < -54) {
                break L1;
              } else {
                ((ug) this).field_N = null;
                break L1;
              }
            }
            this.a((byte) 114, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "ug.PA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        try {
            if (param3 < 62) {
                this.f(-63, 116);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void f(int param0) {
        kk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 == -50) {
                break L1;
              } else {
                this.a(100, (byte) 104, 28);
                break L1;
              }
            }
            var2 = (kk) (Object) ((ug) this).field_W.a(true);
            L2: while (true) {
              L3: {
                L4: {
                  if (var2 == null) {
                    break L4;
                  } else {
                    var2.a((byte) -97);
                    var2 = (kk) (Object) ((ug) this).field_W.a(4318);
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2_ref, "ug.B(" + param0 + ')');
        }
    }

    final synchronized int a() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ug.A()");
        }
        return stackIn_1_0;
    }

    private final void d(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  this.a(-1, false);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.b(true, -1);
              break L1;
            }
            this.e(-1, 0);
            var3_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (16 <= var3_int) {
                    break L5;
                  } else {
                    ((ug) this).field_P[var3_int] = ((ug) this).field_J[var3_int];
                    var3_int++;
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
                if (param1 == 16) {
                  break L4;
                } else {
                  boolean discarded$2 = ((ug) this).a((lp) null, 42);
                  break L4;
                }
              }
              var3_int = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (var3_int >= 16) {
                      break L8;
                    } else {
                      ((ug) this).field_K[var3_int] = nb.a(((ug) this).field_J[var3_int], -128);
                      var3_int++;
                      if (var4 != 0) {
                        break L7;
                      } else {
                        if (var4 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  break L7;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "ug.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        lp var6 = null;
        kk var6_ref = null;
        va var7 = null;
        int var7_int = 0;
        lp var8 = null;
        lp var9 = null;
        int var10 = 0;
        lp stackIn_5_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_25_0 = null;
        lp stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        Object stackIn_27_0 = null;
        lp stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        Object stackIn_29_0 = null;
        lp stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        Object stackIn_30_0 = null;
        lp stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        RuntimeException decompiledCaughtException = null;
        lp stackOut_4_0 = null;
        ne stackOut_14_0 = null;
        Object stackOut_24_0 = null;
        lp stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        Object stackOut_29_0 = null;
        lp stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        Object stackOut_25_0 = null;
        lp stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        Object stackOut_27_0 = null;
        lp stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                this.a(true, param2, param3, 64);
                var5_int = 109 / ((57 - param1) / 44);
                if (0 == (2 & ((ug) this).field_G[param3])) {
                  break L2;
                } else {
                  var6 = (lp) (Object) ((ug) this).field_R.field_q.d(-14205);
                  L3: while (true) {
                    if (var6 == null) {
                      break L2;
                    } else {
                      stackOut_4_0 = (lp) var6;
                      stackIn_15_0 = (Object) (Object) stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var10 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (~stackIn_5_0.field_p != ~param3) {
                            break L4;
                          } else {
                            if (var6.field_r >= 0) {
                              break L4;
                            } else {
                              ((ug) this).field_u[param3][var6.field_y] = null;
                              ((ug) this).field_u[param3][param2] = var6;
                              var7_int = var6.field_s - -(var6.field_w * var6.field_J >> -2049184180);
                              var6.field_s = var6.field_s + (param2 - var6.field_y << 87126856);
                              var6.field_y = param2;
                              var6.field_J = var7_int + -var6.field_s;
                              var6.field_w = 4096;
                              return;
                            }
                          }
                        }
                        var6 = (lp) (Object) ((ug) this).field_R.field_q.g(20);
                        if (var10 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_14_0 = ((ug) this).field_W.a((long)((ug) this).field_P[param3], 8);
              stackIn_15_0 = (Object) (Object) stackOut_14_0;
              break L1;
            }
            var6_ref = (kk) (Object) stackIn_15_0;
            if (var6_ref == null) {
              return;
            } else {
              var7 = var6_ref.field_k[param2];
              if (var7 == null) {
                return;
              } else {
                L5: {
                  L6: {
                    var8 = new lp();
                    var8.field_x = var6_ref;
                    var8.field_I = var7;
                    var8.field_p = param3;
                    var8.field_A = var6_ref.field_n[param2];
                    var8.field_D = var6_ref.field_o[param2];
                    var8.field_y = param2;
                    var8.field_t = 1024 + var6_ref.field_m[param2] * var6_ref.field_j * (param0 * param0) >> 437537835;
                    var8.field_i = var6_ref.field_p[param2] & 255;
                    var8.field_s = (param2 << 1510794408) + -(32767 & var6_ref.field_r[param2]);
                    var8.field_r = -1;
                    var8.field_j = 0;
                    var8.field_u = 0;
                    var8.field_k = 0;
                    var8.field_l = 0;
                    if (0 == ((ug) this).field_o[param3]) {
                      break L6;
                    } else {
                      L7: {
                        var8.field_v = ni.a(var7, this.a((byte) 46, var8), 0, this.a(var8, false));
                        stackOut_24_0 = this;
                        stackOut_24_1 = (lp) var8;
                        stackOut_24_2 = 4917;
                        stackIn_29_0 = stackOut_24_0;
                        stackIn_29_1 = stackOut_24_1;
                        stackIn_29_2 = stackOut_24_2;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        if (var6_ref.field_r[param2] >= 0) {
                          stackOut_29_0 = this;
                          stackOut_29_1 = (lp) (Object) stackIn_29_1;
                          stackOut_29_2 = stackIn_29_2;
                          stackOut_29_3 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          stackIn_30_2 = stackOut_29_2;
                          stackIn_30_3 = stackOut_29_3;
                          break L7;
                        } else {
                          stackOut_25_0 = this;
                          stackOut_25_1 = (lp) (Object) stackIn_25_1;
                          stackOut_25_2 = stackIn_25_2;
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          stackIn_27_2 = stackOut_25_2;
                          stackOut_27_0 = this;
                          stackOut_27_1 = (lp) (Object) stackIn_27_1;
                          stackOut_27_2 = stackIn_27_2;
                          stackOut_27_3 = 1;
                          stackIn_30_0 = stackOut_27_0;
                          stackIn_30_1 = stackOut_27_1;
                          stackIn_30_2 = stackOut_27_2;
                          stackIn_30_3 = stackOut_27_3;
                          break L7;
                        }
                      }
                      ((ug) this).a(stackIn_30_1, stackIn_30_2, stackIn_30_3 != 0);
                      if (var10 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var8.field_v = ni.a(var7, this.a((byte) 78, var8), this.b(var8, 0), this.a(var8, false));
                  break L5;
                }
                L8: {
                  if (var6_ref.field_r[param2] >= 0) {
                    break L8;
                  } else {
                    var8.field_v.e(-1);
                    break L8;
                  }
                }
                L9: {
                  if (var8.field_D < 0) {
                    break L9;
                  } else {
                    L10: {
                      var9 = ((ug) this).field_r[param3][var8.field_D];
                      if (var9 == null) {
                        break L10;
                      } else {
                        if (var9.field_r >= 0) {
                          break L10;
                        } else {
                          ((ug) this).field_u[param3][var9.field_y] = null;
                          var9.field_r = 0;
                          break L10;
                        }
                      }
                    }
                    ((ug) this).field_r[param3][var8.field_D] = var8;
                    break L9;
                  }
                }
                ((ug) this).field_R.field_q.a((ne) (Object) var8, false);
                ((ug) this).field_u[param3][param2] = var8;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var5, "ug.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void f(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        lp var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 13 / ((param1 - -35) / 49);
                if ((((ug) this).field_G[param0] & 4) != 0) {
                  var4 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
                  L3: while (true) {
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (param0 == var4.field_p) {
                            var4.field_m = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var4 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "ug.R(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(lp param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
                    if (param0 != ((ug) this).field_r[param0.field_p][param0.field_D]) {
                      break L1;
                    } else {
                      ((ug) this).field_r[param0.field_p][param0.field_D] = null;
                      break L1;
                    }
                  }
                }
              }
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0 != 0;
            } else {
              L2: {
                if (param1 == -16257) {
                  break L2;
                } else {
                  ((ug) this).field_r = null;
                  break L2;
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("ug.P(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final void a(boolean param0, int param1, int param2) {
        try {
            ((ug) this).field_B[param2] = param1;
            if (param0) {
                int discarded$0 = ug.a(false, 29);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void c(boolean param0, int param1) {
        ((ug) this).field_A.c();
        if (param1 <= 27) {
            return;
        }
        try {
            ((ug) this).field_S = null;
            this.d(param0, 16);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.TA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(byte param0, lp param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        of var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
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
            L1: {
              var3_int = (param1.field_J * param1.field_w >> 1304504076) + param1.field_s;
              var3_int = var3_int + ((-8192 + ((ug) this).field_B[param1.field_p]) * ((ug) this).field_I[param1.field_p] >> -393744788);
              if (param0 > 2) {
                break L1;
              } else {
                ((ug) this).b((int[]) null, 108, -85);
                break L1;
              }
            }
            L2: {
              var4 = param1.field_A;
              if (var4.field_i <= 0) {
                break L2;
              } else {
                L3: {
                  if (var4.field_h > 0) {
                    break L3;
                  } else {
                    if (((ug) this).field_U[param1.field_p] <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_h << -1402346078;
                  var6 = var4.field_a << 1930747233;
                  if (~param1.field_G > ~var6) {
                    var5 = param1.field_G * var5 / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (((ug) this).field_U[param1.field_p] >> -480773785);
                var7 = Math.sin((double)(param1.field_E & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(256 * param1.field_I.field_n) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)vn.field_t + 0.5);
              if (var5 < 1) {
                stackOut_18_0 = 1;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_16_0 = var5;
                stackIn_19_0 = stackOut_16_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("ug.T(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_19_0;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param1 < 0) {
                    break L3;
                  } else {
                    ((ug) this).field_V[param1] = param0;
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4_int = 0;
                L4: while (true) {
                  if (var4_int >= 16) {
                    break L2;
                  } else {
                    ((ug) this).field_V[var4_int] = param0;
                    var4_int++;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      if (var5 == 0) {
                        continue L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var4_int = 54 / ((-2 - param2) / 60);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "ug.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (!((ug) this).field_A.g()) {
                break L1;
              } else {
                var4_int = ((ug) this).field_A.field_c * ((ug) this).field_x / vn.field_t;
                L2: while (true) {
                  L3: {
                    var5 = ((ug) this).field_z - -((long)param2 * (long)var4_int);
                    if (((ug) this).field_F - var5 >= 0L) {
                      ((ug) this).field_z = var5;
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var7 = (int)(((long)var4_int + ((ug) this).field_F - ((ug) this).field_z + -1L) / (long)var4_int);
                  ((ug) this).field_z = ((ug) this).field_z + (long)var4_int * (long)var7;
                  ((ug) this).field_R.b(param0, param1, var7);
                  this.a((byte) -24);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  if (!((ug) this).field_A.g()) {
                    break L1;
                  } else {
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            ((ug) this).field_R.b(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("ug.F(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 <= param0) {
              ((ug) this).field_q[param0] = 12800;
              ((ug) this).field_n[param0] = 8192;
              ((ug) this).field_m[param0] = 16383;
              ((ug) this).field_B[param0] = 8192;
              ((ug) this).field_U[param0] = 0;
              ((ug) this).field_s[param0] = 8192;
              this.d(param0, -1);
              this.f(param0, param1 + -108);
              ((ug) this).field_G[param0] = 0;
              ((ug) this).field_N[param0] = 32767;
              ((ug) this).field_I[param0] = 256;
              ((ug) this).field_o[param0] = 0;
              this.a(2, 8192, param0);
              break L0;
            } else {
              param0 = 0;
              L1: while (true) {
                L2: {
                  if (16 <= param0) {
                    break L2;
                  } else {
                    this.e(param0, param1);
                    param0++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "ug.SA(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        String stackIn_12_0 = null;
        int stackIn_15_0 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        String stackOut_11_0 = null;
        int stackOut_14_0 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_16_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                      stackIn_15_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          stackOut_11_0 = me.field_a;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0;
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
                  stackOut_14_0 = param1;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                }
                if (stackIn_15_0 <= -39) {
                  stackOut_18_0 = null;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  return (String) (Object) stackIn_17_0;
                }
              }
            } else {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3_ref;
            stackOut_20_1 = new StringBuilder().append("ug.H(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return (String) (Object) stackIn_19_0;
    }

    final synchronized qb d() {
        RuntimeException var1 = null;
        hg stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        hg stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((ug) this).field_R;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ug.C()");
        }
        return (qb) (Object) stackIn_1_0;
    }

    final synchronized void c(byte param0, int param1, int param2) {
        try {
            this.b((byte) -87, param1, param2);
            int var4_int = -56 % ((param0 - -57) / 43);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(boolean param0, int param1, vh param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              this.c(param0, param1 + 16353);
              ((ug) this).field_A.a(param2.field_i);
              ((ug) this).field_z = 0L;
              if (param1 == -16257) {
                break L1;
              } else {
                ((ug) this).a((vh) null, -111, false);
                break L1;
              }
            }
            ((ug) this).field_T = param3;
            var5_int = ((ug) this).field_A.a();
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5_int <= var6) {
                    break L4;
                  } else {
                    ((ug) this).field_A.d(var6);
                    ((ug) this).field_A.b(var6);
                    ((ug) this).field_A.a(var6);
                    var6++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((ug) this).field_p = ((ug) this).field_A.b();
                ((ug) this).field_t = ((ug) this).field_A.field_d[((ug) this).field_p];
                ((ug) this).field_F = ((ug) this).field_A.e(((ug) this).field_t);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ug.EA(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final synchronized qb c() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ug.E()");
        }
        return (qb) (Object) stackIn_1_0;
    }

    private final void b(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        lp var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_16_1 = 0;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var3 = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = -1;
                    stackOut_3_1 = ~param1;
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_17_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < stackIn_4_1) {
                            break L5;
                          } else {
                            if (~param1 == ~var3.field_p) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var3.field_r >= 0) {
                          break L4;
                        } else {
                          ((ug) this).field_u[var3.field_p][var3.field_y] = null;
                          var3.field_r = 0;
                          break L4;
                        }
                      }
                      var3 = (lp) (Object) ((ug) this).field_R.field_q.a(4);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_16_0 = param0;
                stackOut_16_1 = 1;
                stackIn_17_0 = stackOut_16_0 ? 1 : 0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              }
              L6: {
                if (stackIn_17_0 == stackIn_17_1) {
                  break L6;
                } else {
                  ((ug) this).field_x = 27;
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "ug.KA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param1 != 24509) {
            return;
        }
        try {
            ((ug) this).field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.GA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void e(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_E = null;
              field_y = null;
              field_M = null;
              if (param0 == 0) {
                break L1;
              } else {
                int discarded$2 = ug.a(true, -75);
                break L1;
              }
            }
            field_w = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ug.V(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 == -24) {
                break L1;
              } else {
                ((ug) this).field_V = null;
                break L1;
              }
            }
            L2: {
              var2_int = ((ug) this).field_p;
              var3 = ((ug) this).field_t;
              var4 = ((ug) this).field_F;
              if (((ug) this).field_S == null) {
                break L2;
              } else {
                if (((ug) this).field_v != var3) {
                  break L2;
                } else {
                  this.a(((ug) this).field_D, -16257, ((ug) this).field_S, ((ug) this).field_T);
                  this.a((byte) -24);
                  return;
                }
              }
            }
            L3: while (true) {
              stackOut_10_0 = ~((ug) this).field_t;
              stackOut_10_1 = ~var3;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      if (stackIn_11_0 != stackIn_11_1) {
                        break L7;
                      } else {
                        L8: while (true) {
                          stackOut_12_0 = ((ug) this).field_A.field_d[var2_int];
                          stackOut_12_1 = var3;
                          stackIn_42_0 = stackOut_12_0;
                          stackIn_42_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (var7 != 0) {
                            break L6;
                          } else {
                            L9: {
                              if (stackIn_13_0 != stackIn_13_1) {
                                break L9;
                              } else {
                                ((ug) this).field_A.d(var2_int);
                                var6 = ((ug) this).field_A.c(var2_int);
                                stackOut_14_0 = 1;
                                stackOut_14_1 = var6;
                                stackIn_11_0 = stackOut_14_0;
                                stackIn_11_1 = stackOut_14_1;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                if (var7 != 0) {
                                  continue L4;
                                } else {
                                  if (stackIn_15_0 != stackIn_15_1) {
                                    L10: {
                                      if ((128 & var6) != 0) {
                                        this.a(var6, 16384);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    ((ug) this).field_A.b(var2_int);
                                    ((ug) this).field_A.a(var2_int);
                                    if (var7 == 0) {
                                      continue L8;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    ((ug) this).field_A.e();
                                    ((ug) this).field_A.a(var2_int);
                                    if (!((ug) this).field_A.f()) {
                                      break L9;
                                    } else {
                                      if (null == ((ug) this).field_S) {
                                        L11: {
                                          if (!((ug) this).field_T) {
                                            break L11;
                                          } else {
                                            if (0 != var3) {
                                              ((ug) this).field_A.a(var4);
                                              if (var7 == 0) {
                                                break L9;
                                              } else {
                                                break L11;
                                              }
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        this.d(true, 16);
                                        ((ug) this).field_A.c();
                                        return;
                                      } else {
                                        ((ug) this).a(((ug) this).field_S, 20938, ((ug) this).field_T);
                                        this.a((byte) -24);
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var2_int = ((ug) this).field_A.b();
                            var3 = ((ug) this).field_A.field_d[var2_int];
                            var4 = ((ug) this).field_A.e(var3);
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    ((ug) this).field_t = var3;
                    ((ug) this).field_F = var4;
                    ((ug) this).field_p = var2_int;
                    if (null == ((ug) this).field_S) {
                      break L5;
                    } else {
                      stackOut_40_0 = var3;
                      stackOut_40_1 = ((ug) this).field_v;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      break L6;
                    }
                  }
                  if (stackIn_42_0 <= stackIn_42_1) {
                    break L5;
                  } else {
                    ((ug) this).field_p = -1;
                    ((ug) this).field_t = ((ug) this).field_v;
                    ((ug) this).field_F = ((ug) this).field_A.e(((ug) this).field_t);
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ug.DA(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, lp param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        of var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_18_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_117_0 = 0;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_122_2 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_116_0 = 0;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              param3.field_H = vn.field_t / 100;
              if (param3.field_r < 0) {
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
                  if (param3.field_D <= 0) {
                    break L3;
                  } else {
                    if (((ug) this).field_r[param3.field_p][param3.field_D] == param3) {
                      ((ug) this).field_r[param3.field_p][param3.field_D] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              }
            }
            L4: {
              var6_int = param3.field_w;
              if (0 < var6_int) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)((ug) this).field_s[param3.field_p]) * 16.0 + 0.5);
                  if (var6_int >= 0) {
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
                        stackOut_46_0 = ~param3.field_u;
                        stackOut_46_1 = ~((var7.field_n[param3.field_l - -2] & 255) << -1048706744);
                        stackIn_54_0 = stackOut_46_0;
                        stackIn_54_1 = stackOut_46_1;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        if (var12 != 0) {
                          break L13;
                        } else {
                          if (stackIn_47_0 >= stackIn_47_1) {
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
                    stackOut_53_0 = var7.field_n.length - 2;
                    stackOut_53_1 = param3.field_l;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    break L13;
                  }
                  if (stackIn_54_0 != stackIn_54_1) {
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
              if (param3.field_r < 0) {
                break L15;
              } else {
                if (null == var7.field_o) {
                  break L15;
                } else {
                  if ((1 & ((ug) this).field_G[param3.field_p]) != 0) {
                    break L15;
                  } else {
                    L16: {
                      if (param3.field_D < 0) {
                        break L16;
                      } else {
                        if (((ug) this).field_r[param3.field_p][param3.field_D] != param3) {
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
                          if (~(var7.field_o.length - 2) >= ~param3.field_j) {
                            break L21;
                          } else {
                            stackOut_81_0 = ~((var7.field_o[param3.field_j - -2] & 255) << -1263441464);
                            stackOut_81_1 = ~param3.field_r;
                            stackIn_89_0 = stackOut_81_0;
                            stackIn_89_1 = stackOut_81_1;
                            stackIn_82_0 = stackOut_81_0;
                            stackIn_82_1 = stackOut_81_1;
                            if (var12 != 0) {
                              break L20;
                            } else {
                              if (stackIn_82_0 <= stackIn_82_1) {
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
                        stackOut_88_0 = ~param3.field_j;
                        stackOut_88_1 = ~(var7.field_o.length + -2);
                        stackIn_89_0 = stackOut_88_0;
                        stackIn_89_1 = stackOut_88_1;
                        break L20;
                      }
                      if (stackIn_89_0 == stackIn_89_1) {
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
                  ((ug) this).field_R.field_o.b((qb) (Object) param3.field_v);
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
                    if (((ug) this).field_r[param3.field_p][param3.field_D] == param3) {
                      ((ug) this).field_r[param3.field_p][param3.field_D] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              stackOut_114_0 = 1;
              stackIn_115_0 = stackOut_114_0;
              return stackIn_115_0 != 0;
            } else {
              param3.field_v.a(param3.field_H, this.b(param3, 0), this.a(param3, false));
              stackOut_116_0 = 0;
              stackIn_117_0 = stackOut_116_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_118_0 = (RuntimeException) var6;
            stackOut_118_1 = new StringBuilder().append("ug.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_121_0 = stackOut_118_0;
            stackIn_121_1 = stackOut_118_1;
            stackIn_119_0 = stackOut_118_0;
            stackIn_119_1 = stackOut_118_1;
            if (param3 == null) {
              stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
              stackOut_121_1 = (StringBuilder) (Object) stackIn_121_1;
              stackOut_121_2 = "null";
              stackIn_122_0 = stackOut_121_0;
              stackIn_122_1 = stackOut_121_1;
              stackIn_122_2 = stackOut_121_2;
              break L26;
            } else {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "{...}";
              stackIn_122_0 = stackOut_119_0;
              stackIn_122_1 = stackOut_119_1;
              stackIn_122_2 = stackOut_119_2;
              break L26;
            }
          }
          L27: {
            stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
            stackOut_122_1 = ((StringBuilder) (Object) stackIn_122_1).append(stackIn_122_2).append(',');
            stackIn_125_0 = stackOut_122_0;
            stackIn_125_1 = stackOut_122_1;
            stackIn_123_0 = stackOut_122_0;
            stackIn_123_1 = stackOut_122_1;
            if (param4 == null) {
              stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
              stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
              stackOut_125_2 = "null";
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              stackIn_126_2 = stackOut_125_2;
              break L27;
            } else {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "{...}";
              stackIn_126_0 = stackOut_123_0;
              stackIn_126_1 = stackOut_123_1;
              stackIn_126_2 = stackOut_123_2;
              break L27;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_126_0, stackIn_126_2 + ')');
        }
        return stackIn_117_0 != 0;
    }

    private final void a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var3_int = param0 & 240;
            if (var3_int != 128) {
              if (var3_int != 144) {
                if (var3_int == 160) {
                  var4 = param0 & 15;
                  var5 = (param0 & 32616) >> -441246840;
                  var6 = param0 >> -934978256 & 127;
                  this.a(var5, var6, var4, 73);
                  return;
                } else {
                  if (176 == var3_int) {
                    L1: {
                      var4 = 15 & param0;
                      var5 = param0 >> 920555240 & 127;
                      var6 = (param0 & 8364021) >> 1906167408;
                      if (0 == var5) {
                        ((ug) this).field_K[var4] = (var6 << 837209358) + nb.a(((ug) this).field_K[var4], -2080769);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (32 != var5) {
                        break L2;
                      } else {
                        ((ug) this).field_K[var4] = (var6 << -400930393) + nb.a(((ug) this).field_K[var4], -16257);
                        break L2;
                      }
                    }
                    L3: {
                      if (1 != var5) {
                        break L3;
                      } else {
                        ((ug) this).field_U[var4] = (var6 << 1889208487) + nb.a(((ug) this).field_U[var4], -16257);
                        break L3;
                      }
                    }
                    L4: {
                      if (var5 == 33) {
                        ((ug) this).field_U[var4] = nb.a(-128, ((ug) this).field_U[var4]) - -var6;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 != 5) {
                        break L5;
                      } else {
                        ((ug) this).field_s[var4] = (var6 << -1005307801) + nb.a(((ug) this).field_s[var4], -16257);
                        break L5;
                      }
                    }
                    L6: {
                      if (37 != var5) {
                        break L6;
                      } else {
                        ((ug) this).field_s[var4] = var6 + nb.a(-128, ((ug) this).field_s[var4]);
                        break L6;
                      }
                    }
                    L7: {
                      if (var5 == 7) {
                        ((ug) this).field_q[var4] = (var6 << -701083449) + nb.a(((ug) this).field_q[var4], -16257);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var5 == 39) {
                        ((ug) this).field_q[var4] = nb.a(-128, ((ug) this).field_q[var4]) - -var6;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var5 == 10) {
                        ((ug) this).field_n[var4] = (var6 << -503820953) + nb.a(((ug) this).field_n[var4], -16257);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var5 != 42) {
                        break L10;
                      } else {
                        ((ug) this).field_n[var4] = var6 + nb.a(-128, ((ug) this).field_n[var4]);
                        break L10;
                      }
                    }
                    L11: {
                      if (var5 != 11) {
                        break L11;
                      } else {
                        ((ug) this).field_m[var4] = (var6 << -960643065) + nb.a(((ug) this).field_m[var4], -16257);
                        break L11;
                      }
                    }
                    L12: {
                      if (43 != var5) {
                        break L12;
                      } else {
                        ((ug) this).field_m[var4] = var6 + nb.a(-128, ((ug) this).field_m[var4]);
                        break L12;
                      }
                    }
                    L13: {
                      if (64 == var5) {
                        L14: {
                          if (var6 < 64) {
                            break L14;
                          } else {
                            ((ug) this).field_G[var4] = mp.a(((ug) this).field_G[var4], 1);
                            if (var8 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        ((ug) this).field_G[var4] = nb.a(((ug) this).field_G[var4], -2);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L15: {
                      if (var5 == 65) {
                        L16: {
                          if (64 > var6) {
                            break L16;
                          } else {
                            ((ug) this).field_G[var4] = mp.a(((ug) this).field_G[var4], 2);
                            if (var8 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.d(var4, -1);
                        ((ug) this).field_G[var4] = nb.a(((ug) this).field_G[var4], -3);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L17: {
                      if (var5 != 99) {
                        break L17;
                      } else {
                        ((ug) this).field_N[var4] = (var6 << -983617305) + nb.a(127, ((ug) this).field_N[var4]);
                        break L17;
                      }
                    }
                    L18: {
                      if (var5 == 98) {
                        ((ug) this).field_N[var4] = nb.a(16256, ((ug) this).field_N[var4]) - -var6;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (var5 == 101) {
                        ((ug) this).field_N[var4] = (var6 << -1451847545) + 16384 - -nb.a(((ug) this).field_N[var4], 127);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (var5 != 100) {
                        break L20;
                      } else {
                        ((ug) this).field_N[var4] = nb.a(((ug) this).field_N[var4], 16256) + (16384 + var6);
                        break L20;
                      }
                    }
                    L21: {
                      if (120 != var5) {
                        break L21;
                      } else {
                        this.a(var4, false);
                        break L21;
                      }
                    }
                    L22: {
                      if (121 != var5) {
                        break L22;
                      } else {
                        this.e(var4, 0);
                        break L22;
                      }
                    }
                    L23: {
                      if (var5 == 123) {
                        this.b(true, var4);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (var5 == 6) {
                        var7 = ((ug) this).field_N[var4];
                        if (var7 != 16384) {
                          break L24;
                        } else {
                          ((ug) this).field_I[var4] = nb.a(-16257, ((ug) this).field_I[var4]) + (var6 << 1439700103);
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (38 != var5) {
                        break L25;
                      } else {
                        var7 = ((ug) this).field_N[var4];
                        if (var7 != 16384) {
                          break L25;
                        } else {
                          ((ug) this).field_I[var4] = nb.a(-128, ((ug) this).field_I[var4]) - -var6;
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if (var5 == 16) {
                        ((ug) this).field_o[var4] = nb.a(-16257, ((ug) this).field_o[var4]) + (var6 << 23190535);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (var5 == 48) {
                        ((ug) this).field_o[var4] = nb.a(-128, ((ug) this).field_o[var4]) + var6;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (81 == var5) {
                        L29: {
                          if (var6 >= 64) {
                            break L29;
                          } else {
                            this.f(var4, param1 ^ 16418);
                            ((ug) this).field_G[var4] = nb.a(((ug) this).field_G[var4], -5);
                            if (var8 == 0) {
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        ((ug) this).field_G[var4] = mp.a(((ug) this).field_G[var4], 4);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L30: {
                      if (var5 == 17) {
                        this.a(2, (-16257 & ((ug) this).field_O[var4]) + (var6 << 1133207975), var4);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (var5 == 49) {
                        this.a(2, var6 + (((ug) this).field_O[var4] & -128), var4);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    return;
                  } else {
                    if (var3_int == 192) {
                      var4 = 15 & param0;
                      var5 = 127 & param0 >> 527765672;
                      this.a((byte) 106, ((ug) this).field_K[var4] + var5, var4);
                      return;
                    } else {
                      L32: {
                        if (param1 == 16384) {
                          break L32;
                        } else {
                          ((ug) this).field_m = null;
                          break L32;
                        }
                      }
                      if (var3_int != 208) {
                        if (224 == var3_int) {
                          var4 = param0 & 15;
                          var5 = (param0 >> 427745577 & 16256) + ((32761 & param0) >> 1532984104);
                          this.a(false, var5, var4);
                          return;
                        } else {
                          var3_int = 255 & param0;
                          if (var3_int == 255) {
                            this.d(true, 16);
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
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
                L33: {
                  L34: {
                    var4 = param0 & 15;
                    var5 = param0 >> 194301640 & 127;
                    var6 = (param0 & 8385741) >> 1207982832;
                    if (0 < var6) {
                      break L34;
                    } else {
                      this.a(true, var5, var4, 64);
                      if (var8 == 0) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  this.b(var6, -29, var5, var4);
                  break L33;
                }
                return;
              }
            } else {
              var4 = 15 & param0;
              var5 = (32667 & param0) >> -895345400;
              var6 = (8372321 & param0) >> -458272624;
              this.a(true, var5, var4, var6);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "ug.JA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              if (65536L > (long)param1) {
                if (256L <= (long)param1) {
                  if ((long)param1 < 4096L) {
                    if ((long)param1 < 1024L) {
                      stackOut_52_0 = lc.field_h[param1 >> 302826466] >> -1126087221;
                      stackIn_53_0 = stackOut_52_0;
                      return stackIn_53_0;
                    } else {
                      stackOut_50_0 = lc.field_h[param1 >> 1041245092] >> 1926292682;
                      stackIn_51_0 = stackOut_50_0;
                      return stackIn_51_0;
                    }
                  } else {
                    if ((long)param1 >= 16384L) {
                      stackOut_47_0 = lc.field_h[param1 >> 960380328] >> 1977364200;
                      stackIn_48_0 = stackOut_47_0;
                      return stackIn_48_0;
                    } else {
                      stackOut_45_0 = lc.field_h[param1 >> 195908710] >> -961943799;
                      stackIn_46_0 = stackOut_45_0;
                      return stackIn_46_0;
                    }
                  }
                } else {
                  if (param1 < 0) {
                    stackOut_54_0 = -1;
                    stackIn_55_0 = stackOut_54_0;
                    break L0;
                  } else {
                    stackOut_39_0 = lc.field_h[param1] >> 1033422348;
                    stackIn_40_0 = stackOut_39_0;
                    return stackIn_40_0;
                  }
                }
              } else {
                if ((long)param1 < 16777216L) {
                  if ((long)param1 < 1048576L) {
                    if ((long)param1 < 262144L) {
                      stackOut_33_0 = lc.field_h[param1 >> -1339337302] >> -930371193;
                      stackIn_34_0 = stackOut_33_0;
                      return stackIn_34_0;
                    } else {
                      stackOut_31_0 = lc.field_h[param1 >> -1816909716] >> 1703478534;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0;
                    }
                  } else {
                    if ((long)param1 < 4194304L) {
                      stackOut_28_0 = lc.field_h[param1 >> 826135758] >> 1320719301;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0;
                    } else {
                      stackOut_26_0 = lc.field_h[param1 >> 1798204208] >> 2105270884;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0;
                    }
                  }
                } else {
                  if ((long)param1 < 268435456L) {
                    if ((long)param1 >= 67108864L) {
                      stackOut_20_0 = lc.field_h[param1 >> 513142900] >> -1241490750;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    } else {
                      stackOut_18_0 = lc.field_h[param1 >> -1509973038] >> -1348626845;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    }
                  } else {
                    if ((long)param1 < 1073741824L) {
                      stackOut_15_0 = lc.field_h[param1 >> -1278419722] >> -1576437087;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      stackOut_13_0 = lc.field_h[param1 >> 759036184];
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  }
                }
              }
            } else {
              stackOut_1_0 = 34;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ug.LA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_55_0;
    }

    private final int a(lp param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                int discarded$2 = this.b((lp) null, 45);
                break L1;
              }
            }
            var3_int = ((ug) this).field_n[param0.field_p];
            if (var3_int >= 8192) {
              stackOut_6_0 = -((-param0.field_i + 128) * (-var3_int + 16384) + 32 >> -310870714) + 16384;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 32 + var3_int * param0.field_i >> -1763752794;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ug.S(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void d(int param0, int param1) {
        RuntimeException var3 = null;
        lp var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 != ~(((ug) this).field_G[param0] & 2)) {
                  var3_ref = (lp) (Object) ((ug) this).field_R.field_q.e(-24172);
                  L3: while (true) {
                    if (null == var3_ref) {
                      break L2;
                    } else {
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (~param0 != ~var3_ref.field_p) {
                            break L4;
                          } else {
                            if (((ug) this).field_u[param0][var3_ref.field_y] == null) {
                              if (var3_ref.field_r >= 0) {
                                break L4;
                              } else {
                                var3_ref.field_r = 0;
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        var3_ref = (lp) (Object) ((ug) this).field_R.field_q.a(4);
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "ug.G(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void b(int param0, int param1) {
        try {
            ((ug) this).field_x = param0;
            if (param1 != 0) {
                this.a(true, -114, (vh) null, false);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.O(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (((ug) this).field_A.g()) {
                var2_int = ((ug) this).field_x * ((ug) this).field_A.field_c / vn.field_t;
                L2: while (true) {
                  L3: {
                    var3 = (long)param0 * (long)var2_int + ((ug) this).field_z;
                    if (((ug) this).field_F + -var3 >= 0L) {
                      ((ug) this).field_z = var3;
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
                    var5 = (int)((-1L + (long)var2_int + ((ug) this).field_F + -((ug) this).field_z) / (long)var2_int);
                    ((ug) this).field_z = ((ug) this).field_z + (long)var5 * (long)var2_int;
                    ((ug) this).field_R.a(var5);
                    param0 = param0 - var5;
                    this.a((byte) -24);
                    if (((ug) this).field_A.g()) {
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
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            ((ug) this).field_R.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ug.I(" + param0 + ')');
        }
    }

    final synchronized boolean a(boolean param0, lc param1, nh param2, int param3, vh param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        mk var8 = null;
        int var9 = 0;
        kk var10 = null;
        int var11 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              param4.a();
              if (!param0) {
                break L1;
              } else {
                ((ug) this).field_u = null;
                break L1;
              }
            }
            L2: {
              var6_int = 1;
              var7 = null;
              if (param3 > 0) {
                var7 = (Object) (Object) new int[]{param3};
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (mk) (Object) param4.field_j.a(true);
            L3: while (true) {
              L4: {
                L5: {
                  if (var8 == null) {
                    break L5;
                  } else {
                    var9 = (int)var8.field_h;
                    var10 = (kk) (Object) ((ug) this).field_W.a((long)var9, 8);
                    if (var11 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (var10 != null) {
                            break L7;
                          } else {
                            L8: {
                              var10 = dl.a((byte) 110, var9, param2);
                              if (var10 == null) {
                                var6_int = 0;
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            }
                            ((ug) this).field_W.a((ne) (Object) var10, 12460, (long)var9);
                            break L7;
                          }
                        }
                        if (!var10.a((byte) 45, param1, (int[]) var7, var8.field_k)) {
                          var6_int = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var8 = (mk) (Object) param4.field_j.a(4318);
                      if (var11 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (var6_int == 0) {
                  break L4;
                } else {
                  param4.b();
                  break L4;
                }
              }
              stackOut_28_0 = var6_int;
              stackIn_29_0 = stackOut_28_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("ug.L(").append(param0).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L9;
            }
          }
          L10: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L10;
            }
          }
          L11: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param3).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param4 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L11;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L11;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
        return stackIn_29_0 != 0;
    }

    private final int b(lp param0, int param1) {
        RuntimeException var3 = null;
        of var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (((ug) this).field_V[param0.field_p] == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var3_ref = param0.field_A;
                var4 = 4096 + ((ug) this).field_q[param0.field_p] * ((ug) this).field_m[param0.field_p] >> 943240237;
                var4 = var4 * var4 + 16384 >> -2050112401;
                var4 = 16384 + var4 * param0.field_t >> 1701060655;
                var4 = var4 * ((ug) this).field_L - -128 >> -1912563480;
                var4 = ((ug) this).field_V[param0.field_p] * var4 + 128 >> 1121079720;
                if (var3_ref.field_c <= 0) {
                  break L1;
                } else {
                  var4 = (int)(Math.pow(0.5, (double)param0.field_k * 0.00001953125 * (double)var3_ref.field_c) * (double)var4 + 0.5);
                  break L1;
                }
              }
              L2: {
                if (null == var3_ref.field_n) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_u;
                    var6 = var3_ref.field_n[param0.field_l + 1];
                    if (param0.field_l < var3_ref.field_n.length + -2) {
                      var7 = 65280 & var3_ref.field_n[param0.field_l] << 622465704;
                      var8 = (255 & var3_ref.field_n[2 + param0.field_l]) << 1593804776;
                      var6 = var6 + (-var6 + var3_ref.field_n[3 + param0.field_l]) * (-var7 + var5) / (var8 + -var7);
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
                  if (null == var3_ref.field_o) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param0.field_r;
                      var6 = var3_ref.field_o[1 + param0.field_j];
                      if (~param0.field_j <= ~(-2 + var3_ref.field_o.length)) {
                        break L5;
                      } else {
                        var7 = (255 & var3_ref.field_o[param0.field_j]) << -169855512;
                        var8 = (var3_ref.field_o[param0.field_j - -2] & 255) << -1547970168;
                        var6 = var6 + (-var7 + var5) * (-var6 + var3_ref.field_o[param0.field_j - -3]) / (var8 + -var7);
                        break L5;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 1613877446;
                    break L4;
                  }
                }
              }
              stackOut_20_0 = var4;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("ug.BA(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    final void a(lp param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
                      var5 = (int)((long)var6 * (long)((ug) this).field_o[param0.field_p] >> -1917788474);
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
              var5 = (int)((long)var4_int * (long)((ug) this).field_o[param0.field_p] >> -846751738);
              break L1;
            }
            L4: {
              param0.field_v.i(var5);
              if (param1 == 4917) {
                break L4;
              } else {
                boolean discarded$3 = ((ug) this).a(false, (lc) null, (nh) null, 98, (vh) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ug.IA(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public ug() {
        ((ug) this).field_L = 256;
        ((ug) this).field_q = new int[16];
        ((ug) this).field_u = new lp[16][128];
        ((ug) this).field_O = new int[16];
        ((ug) this).field_I = new int[16];
        ((ug) this).field_K = new int[16];
        ((ug) this).field_m = new int[16];
        ((ug) this).field_x = 1000000;
        ((ug) this).field_r = new lp[16][128];
        ((ug) this).field_V = new int[16];
        ((ug) this).field_J = new int[16];
        ((ug) this).field_U = new int[16];
        ((ug) this).field_Q = new int[16];
        ((ug) this).field_N = new int[16];
        ((ug) this).field_B = new int[16];
        ((ug) this).field_s = new int[16];
        ((ug) this).field_P = new int[16];
        ((ug) this).field_n = new int[16];
        ((ug) this).field_G = new int[16];
        ((ug) this).field_o = new int[16];
        ((ug) this).field_A = new vm();
        ((ug) this).field_R = new hg((ug) this);
        try {
            ((ug) this).field_W = new wa(128);
            ((ug) this).a(256, -1, (byte) -84);
            this.d(true, 16);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ug.<init>()");
        }
    }

    ug(ug param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((ug) this).field_L = 256;
        ((ug) this).field_q = new int[16];
        ((ug) this).field_u = new lp[16][128];
        ((ug) this).field_O = new int[16];
        ((ug) this).field_I = new int[16];
        ((ug) this).field_K = new int[16];
        ((ug) this).field_m = new int[16];
        ((ug) this).field_x = 1000000;
        ((ug) this).field_r = new lp[16][128];
        ((ug) this).field_V = new int[16];
        ((ug) this).field_J = new int[16];
        ((ug) this).field_U = new int[16];
        ((ug) this).field_Q = new int[16];
        ((ug) this).field_N = new int[16];
        ((ug) this).field_B = new int[16];
        ((ug) this).field_s = new int[16];
        ((ug) this).field_P = new int[16];
        ((ug) this).field_n = new int[16];
        ((ug) this).field_G = new int[16];
        ((ug) this).field_o = new int[16];
        ((ug) this).field_A = new vm();
        ((ug) this).field_R = new hg((ug) this);
        try {
          L0: {
            ((ug) this).field_W = param0.field_W;
            ((ug) this).a(256, -1, (byte) -63);
            this.d(true, 16);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ug.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = rb.b(0, 0, 64);
        field_w = new fd(2);
        field_M = new String[]{"Hoard Room", "Well done! By reaching the <%highlight>hoard room</col> you have claimed possession of this dungeon. It is now yours to defend against other players. When you raid the dungeon of another player, their dragon will occupy this central tile instead, and you will have the opportunity to steal a portion of their Treasure and Renown.<br><br><%command>For now, end this game (by clicking Exit) and we will move on to Dungeon Construction.</col>"};
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class op {
    int field_J;
    static String field_q;
    static kv[] field_I;
    int field_G;
    int field_m;
    static kv field_u;
    Random field_w;
    int field_Q;
    boolean field_R;
    int field_s;
    int field_F;
    private eaa field_P;
    int field_E;
    int field_A;
    private eaa[] field_t;
    wia[][] field_a;
    int field_e;
    int field_f;
    private nq[] field_n;
    boolean field_l;
    boolean field_r;
    int[][] field_c;
    int field_h;
    tk[] field_H;
    paa field_T;
    private int field_D;
    int field_O;
    String[] field_y;
    private int[] field_g;
    lr field_L;
    boolean field_N;
    eaa field_U;
    int field_B;
    int field_k;
    int[] field_C;
    ib[] field_S;
    int field_v;
    int field_b;
    int field_z;
    boolean field_x;
    sfa[][] field_j;
    int[][] field_i;
    int field_o;
    int field_K;
    vg field_p;
    int field_d;
    int field_M;

    final void g(int param0) {
        if (param0 < 126) {
            Object var3 = null;
            ((op) this).a(42, (rk[]) null, -43);
        }
    }

    final void a(int param0, aga param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (((op) this).field_a[param1.field_x][param1.field_J].field_n == 20) {
                break L1;
              } else {
                ((op) this).b((byte) 123, param2, param1.field_x, param1.field_J);
                break L1;
              }
            }
            L2: {
              if (0 > -1 + param1.field_x) {
                break L2;
              } else {
                if (((op) this).field_a[-1 + param1.field_x][param1.field_J].field_n == 20) {
                  break L2;
                } else {
                  ((op) this).b((byte) -63, param2, -1 + param1.field_x, param1.field_J);
                  break L2;
                }
              }
            }
            L3: {
              if (1 + param1.field_x >= ((op) this).field_z) {
                break L3;
              } else {
                if (20 == ((op) this).field_a[1 + param1.field_x][param1.field_J].field_n) {
                  break L3;
                } else {
                  ((op) this).b((byte) 91, param2, param1.field_x - -1, param1.field_J);
                  break L3;
                }
              }
            }
            L4: {
              if (param0 == -25) {
                break L4;
              } else {
                boolean discarded$1 = ((op) this).a((byte) 64, -97);
                break L4;
              }
            }
            L5: {
              if (-1 + param1.field_J < 0) {
                break L5;
              } else {
                if (((op) this).field_a[param1.field_x][param1.field_J + -1].field_n != 20) {
                  ((op) this).b((byte) -82, param2, param1.field_x, -1 + param1.field_J);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (((op) this).field_B <= param1.field_J - -1) {
                break L6;
              } else {
                if (((op) this).field_a[param1.field_x][param1.field_J - -1].field_n == 20) {
                  break L6;
                } else {
                  ((op) this).b((byte) 119, param2, param1.field_x, param1.field_J + 1);
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("op.H(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
    }

    final int a(int param0, aga param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        wia var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param3 == -1) {
                break L1;
              } else {
                ((op) this).field_B = -3;
                break L1;
              }
            }
            var5_int = 0;
            var6 = 1;
            L2: while (true) {
              if (param0 < var6) {
                stackOut_32_0 = var5_int;
                stackIn_33_0 = stackOut_32_0;
                break L0;
              } else {
                L3: {
                  var7 = param1.field_x;
                  var8 = param1.field_J;
                  if (param2 != 2) {
                    if (param2 == 4) {
                      var7 = var7 + var6;
                      break L3;
                    } else {
                      if (param2 != 1) {
                        if (3 == param2) {
                          var8 = var8 + var6;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var8 = var8 - var6;
                        break L3;
                      }
                    }
                  } else {
                    var7 = var7 - var6;
                    break L3;
                  }
                }
                L4: {
                  if (var7 < 0) {
                    break L4;
                  } else {
                    if (var7 >= ((op) this).field_z) {
                      break L4;
                    } else {
                      if (0 > var8) {
                        break L4;
                      } else {
                        if (((op) this).field_B > var8) {
                          var9 = ((op) this).field_a[var7][var8];
                          var10 = var9.field_n;
                          if (var10 == 21) {
                            stackOut_23_0 = var6;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          } else {
                            if (param1.a(var10, false)) {
                              L5: {
                                if (null == var9.field_l) {
                                  var5_int = var6;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var6++;
                              continue L2;
                            } else {
                              stackOut_26_0 = var6 + -1;
                              stackIn_27_0 = stackOut_26_0;
                              return stackIn_27_0;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_19_0 = -1 + var6;
                stackIn_20_0 = stackOut_19_0;
                return stackIn_20_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var5;
            stackOut_34_1 = new StringBuilder().append("op.HC(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L6;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_33_0;
    }

    private final void d(int param0) {
        int[] var2_ref_int__ = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var11 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var8 = BachelorFridge.field_y;
          if (((op) this).field_o != 2) {
            if (((op) this).field_o != 3) {
              break L0;
            } else {
              var2 = -1;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (((op) this).field_d <= var4) {
                  if (var3 > 3) {
                    ((op) this).field_M = var2;
                    ((op) this).field_Q = 0;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  if (((op) this).field_C[var4] > var3) {
                    var2 = var4;
                    var3 = ((op) this).field_C[var4];
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var20 = new int[((op) this).field_d];
            var17 = var20;
            var14 = var17;
            var11 = var14;
            var2_ref_int__ = var11;
            var3 = 0;
            var18 = ((op) this).field_i;
            var5 = 0;
            L2: while (true) {
              if (var18.length <= var5) {
                var4 = -1;
                var5 = var3;
                var6 = 0;
                L3: while (true) {
                  if (var20.length <= var6) {
                    if (var4 > -1) {
                      if (var4 == ((op) this).field_M) {
                        ((op) this).field_Q = ((op) this).field_Q - 1;
                        break L0;
                      } else {
                        ((op) this).field_M = var4;
                        ((op) this).field_Q = 3;
                        break L0;
                      }
                    } else {
                      ((op) this).field_M = var4;
                      ((op) this).field_Q = -1;
                      break L0;
                    }
                  } else {
                    var7 = var20[var6];
                    if (var7 > var5) {
                      var4 = var6;
                      var5 = var7;
                      var6++;
                      continue L3;
                    } else {
                      if (var7 == var5) {
                        var4 = -1;
                        var6++;
                        continue L3;
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var19 = var18[var5];
                var7 = var19[2];
                if (-1 == var7) {
                  var3++;
                  var5++;
                  continue L2;
                } else {
                  var2_ref_int__[var7] = var2_ref_int__[var7] + 1;
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void b(lu param0, byte param1) {
        try {
            param0.b(((op) this).field_A, -126);
            param0.d(((op) this).field_N ? 1 : 0, 0);
            int var3_int = -55 / ((param1 - 85) / 37);
            param0.d(((op) this).field_M, 0);
            param0.d(((op) this).field_Q, 0);
            this.c(param0, (byte) 92);
            this.d(param0, (byte) -115);
            this.a(param0, (byte) 113);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "op.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(aga param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 0) {
                break L1;
              } else {
                param2 = ov.b(param2, 60);
                param3 = -param3;
                break L1;
              }
            }
            if (param1 >= 68) {
              stackOut_5_0 = this.a(param2, param3, param0, (byte) -44);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 9;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("op.GA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, lu param1) {
        int var3_int = 0;
        int var4 = 0;
        aga var5 = null;
        int var6 = BachelorFridge.field_y;
        try {
            ((op) this).field_A = param1.e((byte) 91);
            ((op) this).field_N = ~param1.b(16711935) != param0 ? false : true;
            ((op) this).field_M = param1.b(true);
            ((op) this).field_Q = param1.b(16711935);
            this.b(-1, param1);
            this.b(param1, 68);
            ((op) this).field_S = new ib[((op) this).field_d];
            for (var3_int = 0; ((op) this).field_d > var3_int; var3_int++) {
                ((op) this).field_S[var3_int] = new ib(var3_int);
                for (var4 = 0; var4 < 7; var4++) {
                    var5 = ng.a((op) this, -51, param1);
                    if (!(var5 == null)) {
                        ((op) this).field_S[var3_int].field_b[var4] = var5;
                        ((op) this).field_S[var3_int].field_a = ((op) this).field_S[var3_int].field_a + 1;
                    }
                }
            }
            ((op) this).j(-1);
            ((op) this).g(127);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "op.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_I = null;
        field_q = null;
        field_u = null;
        if (param0 < 34) {
            op.e((byte) 67);
        }
    }

    final void i(byte param0) {
        int var2 = 0;
        int var3 = 0;
        aga var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 7) {
            ((op) this).field_n = new nq[7 * ((op) this).field_d];
            var2 = 0;
            L1: while (true) {
              if (var2 >= ((op) this).field_d) {
                var2 = 89 / ((-14 - param0) / 32);
                return;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 7) {
                    var2++;
                    continue L1;
                  } else {
                    var4 = ((op) this).field_S[var2].field_b[var3];
                    if (var4 != null) {
                      if (!var4.i(-118)) {
                        L3: {
                          var5 = var4.field_k[1];
                          if (!var4.field_z) {
                            var5++;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        ((op) this).field_t[var5].a((bw) (Object) new nq(var4.field_D, var4.field_u), true);
                        var3++;
                        continue L2;
                      } else {
                        var3++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            ((op) this).field_t[var2] = new eaa();
            var2++;
            continue L0;
          }
        }
    }

    final void a(int[][] param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        wia var10 = null;
        int var11 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 >= 4) {
                break L1;
              } else {
                ((op) this).field_o = -87;
                break L1;
              }
            }
            var7_int = 0;
            L2: while (true) {
              if (param2 <= var7_int) {
                break L0;
              } else {
                L3: {
                  var8 = param0[var7_int][0];
                  var9 = param0[var7_int][1];
                  if (var8 < 0) {
                    break L3;
                  } else {
                    if (((op) this).field_z <= var8) {
                      break L3;
                    } else {
                      if (var9 < 0) {
                        break L3;
                      } else {
                        if (((op) this).field_B > var9) {
                          var10 = ((op) this).field_a[var8][var9];
                          if (var10.field_n == 20) {
                            break L3;
                          } else {
                            if (22 == var10.field_n) {
                              break L3;
                            } else {
                              if (var10.field_n == 21) {
                                break L3;
                              } else {
                                if (23 == var10.field_n) {
                                  break L3;
                                } else {
                                  if (var10.field_n == 24) {
                                    break L3;
                                  } else {
                                    if (25 == var10.field_n) {
                                      break L3;
                                    } else {
                                      if (var10.field_n == 26) {
                                        break L3;
                                      } else {
                                        ((op) this).b((byte) -73, param3, var8, var9);
                                        break L3;
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
                    }
                  }
                }
                var7_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var7;
            stackOut_20_1 = new StringBuilder().append("op.E(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int a(int param0, int param1, aga param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = 1;
            L1: while (true) {
              if (~var5_int < ~param1) {
                L2: {
                  if (param3 == -44) {
                    break L2;
                  } else {
                    ((op) this).a(-49, -74, false);
                    break L2;
                  }
                }
                stackOut_28_0 = param1;
                stackIn_29_0 = stackOut_28_0;
                break L0;
              } else {
                L3: {
                  var6 = param2.field_x;
                  var7 = param2.field_J;
                  if (param0 == 2) {
                    var6 = var6 - var5_int;
                    break L3;
                  } else {
                    if (4 == param0) {
                      var6 = var6 + var5_int;
                      break L3;
                    } else {
                      if (param0 != 1) {
                        if (3 != param0) {
                          break L3;
                        } else {
                          var7 = var7 + var5_int;
                          break L3;
                        }
                      } else {
                        var7 = var7 - var5_int;
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (var6 < 0) {
                    break L4;
                  } else {
                    if (((op) this).field_z <= var6) {
                      break L4;
                    } else {
                      if (var7 < 0) {
                        break L4;
                      } else {
                        if (((op) this).field_B > var7) {
                          if (((op) this).field_a[var6][var7].field_n != 21) {
                            if (!((op) this).a(param2, var7, var6, (byte) 54)) {
                              stackOut_23_0 = var5_int - 1;
                              stackIn_24_0 = stackOut_23_0;
                              return stackIn_24_0;
                            } else {
                              var5_int++;
                              continue L1;
                            }
                          } else {
                            stackOut_19_0 = var5_int;
                            stackIn_20_0 = stackOut_19_0;
                            return stackIn_20_0;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_16_0 = -1 + var5_int;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5;
            stackOut_30_1 = new StringBuilder().append("op.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param3 + ')');
        }
        return stackIn_29_0;
    }

    final void a(int param0, aj[] param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        wia var8 = null;
        int var9 = 0;
        Object var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param3 == -36) {
                break L1;
              } else {
                var10 = null;
                int discarded$1 = this.a(-106, -64, (aga) null, (byte) 29);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= param0) {
                break L0;
              } else {
                L3: {
                  var6 = param1[var5_int].field_c;
                  var7 = param1[var5_int].field_a;
                  if (var6 < 0) {
                    break L3;
                  } else {
                    if (((op) this).field_z <= var6) {
                      break L3;
                    } else {
                      if (0 > var7) {
                        break L3;
                      } else {
                        if (~((op) this).field_B >= ~var7) {
                          break L3;
                        } else {
                          var8 = ((op) this).field_a[var6][var7];
                          if (var8.field_n == 20) {
                            break L3;
                          } else {
                            if (var8.field_n == 22) {
                              break L3;
                            } else {
                              if (var8.field_n == 21) {
                                break L3;
                              } else {
                                if (var8.field_n == 23) {
                                  break L3;
                                } else {
                                  if (24 == var8.field_n) {
                                    break L3;
                                  } else {
                                    if (25 == var8.field_n) {
                                      break L3;
                                    } else {
                                      if (var8.field_n == 26) {
                                        break L3;
                                      } else {
                                        ((op) this).b((byte) 111, param2, var6, var7);
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
                }
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("op.U(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(aga param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (((op) this).field_z <= param2) {
                    break L1;
                  } else {
                    if (param1 >= ((op) this).field_B) {
                      break L1;
                    } else {
                      if (!param0.a(((op) this).field_a[param2][param1].field_n, false)) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      } else {
                        L2: {
                          if (param3 == 54) {
                            break L2;
                          } else {
                            ((op) this).field_l = true;
                            break L2;
                          }
                        }
                        L3: {
                          if (param2 != param0.field_x) {
                            break L3;
                          } else {
                            if (param0.field_J == param1) {
                              stackOut_16_0 = 1;
                              stackIn_17_0 = stackOut_16_0;
                              return stackIn_17_0 != 0;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (((op) this).field_a[param2][param1].field_l != null) {
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("op.UB(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_21_0 != 0;
    }

    private final cj a(sfa param0, byte param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        ii var4 = null;
        int var5 = 0;
        aga var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        ii stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ii stackOut_11_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
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
            if (param0 != null) {
              var6 = param0.field_h.a(29, (op) this);
              var3 = var6;
              if (var3 != null) {
                if (!var3.i(125)) {
                  L1: {
                    var4 = param0.a((op) this, 3);
                    var3.field_z = true;
                    var5 = ((op) this).field_T.field_w[var6.field_D];
                    ((cj) (Object) var4).a((op) this, false);
                    if (3 > -var5 + ((op) this).field_T.field_w[var6.field_D]) {
                      break L1;
                    } else {
                      ((op) this).field_T.field_a[var6.field_D] = true;
                      break L1;
                    }
                  }
                  ((op) this).field_U.a((bw) (Object) var4, true);
                  stackOut_11_0 = (ii) var4;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_7_0 = null;
                  stackIn_8_0 = stackOut_7_0;
                  return (cj) (Object) stackIn_8_0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (cj) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("op.CC(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 91 + ')');
        }
        return (cj) (Object) stackIn_12_0;
    }

    final int a(sfa[] param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        oha var5 = null;
        int var6 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((op) this).b(-125);
                break L1;
              }
            }
            var3_int = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= param0.length) {
                stackOut_11_0 = var3_int;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L3: {
                  if (null != param0[var4]) {
                    var5 = ur.field_e[param0[var4].field_g];
                    if (var5 instanceof hd) {
                      var3_int++;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("op.KB(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        eaa var4 = null;
        nq var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        var2 = param0;
        var3 = 6;
        L0: while (true) {
          if (var3 < 0) {
            return;
          } else {
            var4 = ((op) this).field_t[var3];
            if (var4 != null) {
              if (var4.g(0) != 0) {
                var5 = (nq) (Object) var4.b((byte) 90);
                var6 = ((op) this).field_A / 2 % var4.g(0);
                var7 = 0;
                var8 = 0;
                L1: while (true) {
                  if (var7 < var4.g(0)) {
                    if (var6 <= var8) {
                      ((op) this).field_n[var2] = var5;
                      var2++;
                      var5 = (nq) (Object) var4.c(0);
                      if (var5 == null) {
                        var5 = (nq) (Object) var4.b((byte) 90);
                        var7++;
                        continue L1;
                      } else {
                        var7++;
                        continue L1;
                      }
                    } else {
                      var5 = (nq) (Object) var4.c(0);
                      var8++;
                      continue L1;
                    }
                  } else {
                    var3--;
                    continue L0;
                  }
                }
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

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          if (param0 == 23189) {
            break L0;
          } else {
            ((op) this).field_P = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= ((op) this).field_a.length) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= ((op) this).field_a.length) {
                L3: {
                  if (((op) this).field_l) {
                    ((op) this).field_F = ((op) this).field_F + 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (!((op) this).field_x) {
                    break L4;
                  } else {
                    ((op) this).field_K = ((op) this).field_K + 1;
                    break L4;
                  }
                }
                return;
              } else {
                var5 = 0;
                var3 = var5;
                L5: while (true) {
                  if (var5 >= ((op) this).field_a[0].length) {
                    var2++;
                    continue L2;
                  } else {
                    L6: {
                      if (((op) this).field_a[var2][var5].field_n == 35) {
                        break L6;
                      } else {
                        if (((op) this).field_a[var2][var5].field_n == 37) {
                          break L6;
                        } else {
                          if (((op) this).field_a[var2][var5].field_n == 33) {
                            break L6;
                          } else {
                            var5++;
                            continue L5;
                          }
                        }
                      }
                    }
                    ((op) this).field_a[var2][var5].field_j = ((op) this).field_a[var2][var5].field_j - 1;
                    var5++;
                    continue L5;
                  }
                }
              }
            }
          } else {
            var3 = 0;
            L7: while (true) {
              if (((op) this).field_a[0].length <= var3) {
                var2++;
                continue L1;
              } else {
                L8: {
                  if (((op) this).field_a[var2][var3].field_l != null) {
                    ((op) this).field_a[var2][var3].field_l.a(((op) this).field_a[var2][var3].field_m, (byte) -82, ((op) this).field_a[var2][var3].field_n);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (((op) this).field_a[var2][var3].a(false, (op) this)) {
                    ((op) this).field_a[var2][var3].field_j = ((op) this).field_a[var2][var3].field_j - 1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (od.field_w[((op) this).field_a[var2][var3].field_n].field_b) {
                  if (!((op) this).field_a[var2][var3].field_m) {
                    ((op) this).field_a[var2][var3].field_j = ((op) this).field_a[var2][var3].field_j - 1;
                    var3++;
                    continue L7;
                  } else {
                    var3++;
                    continue L7;
                  }
                } else {
                  var3++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        aga var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rv var14 = null;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var13 = BachelorFridge.field_y;
        var14 = new rv();
        var7 = 0;
        L0: while (true) {
          if (((op) this).field_d <= var7) {
            L1: {
              if (var14.field_m.e(12917)) {
                break L1;
              } else {
                var14.a((op) this, false);
                ((op) this).field_U.a((bw) (Object) var14, true);
                break L1;
              }
            }
            return;
          } else {
            if (!((op) this).field_S[var7].field_c) {
              var8 = 0;
              L2: while (true) {
                if (7 > var8) {
                  var9 = ((op) this).field_S[var7].field_b[var8];
                  if (var9 != null) {
                    if (!var9.i(101)) {
                      L3: {
                        if (var9.field_x > param4) {
                          stackOut_13_0 = var9.field_x - param4;
                          stackIn_14_0 = stackOut_13_0;
                          break L3;
                        } else {
                          stackOut_12_0 = param4 + -var9.field_x;
                          stackIn_14_0 = stackOut_12_0;
                          break L3;
                        }
                      }
                      L4: {
                        var10 = stackIn_14_0;
                        if (var9.field_J > param0) {
                          stackOut_16_0 = -param0 + var9.field_J;
                          stackIn_17_0 = stackOut_16_0;
                          break L4;
                        } else {
                          stackOut_15_0 = param0 + -var9.field_J;
                          stackIn_17_0 = stackOut_15_0;
                          break L4;
                        }
                      }
                      L5: {
                        var11 = stackIn_17_0;
                        if (var11 < var10) {
                          stackOut_19_0 = var10;
                          stackIn_20_0 = stackOut_19_0;
                          break L5;
                        } else {
                          stackOut_18_0 = var11;
                          stackIn_20_0 = stackOut_18_0;
                          break L5;
                        }
                      }
                      var12 = stackIn_20_0;
                      if (param1 >= var12) {
                        var14.a(true, (pp) (Object) new lia(new nq(var9), param3, -1));
                        var8++;
                        continue L2;
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
                  var7++;
                  continue L0;
                }
              }
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, aga param1, int param2, aga param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_9_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
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
        try {
          L0: {
            L1: {
              if (~param2 <= param4) {
                break L1;
              } else {
                param2 = -param2;
                param0 = ov.b(param0, 60);
                break L1;
              }
            }
            L2: {
              var6_int = this.a(param0, param2, param1, (byte) -44);
              param1.a(false, var6_int, param0);
              if (param1.a(32, (byte) 103)) {
                break L2;
              } else {
                if (((op) this).field_a[param1.field_x][param1.field_J].field_n == 21) {
                  ((op) this).field_T.field_l[param3.field_D] = ((op) this).field_T.field_l[param3.field_D] + 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var6_int < param2) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("op.KA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final void h(byte param0) {
        ((op) this).field_j = new sfa[((op) this).field_d][7];
        int var2 = -34 % ((-46 - param0) / 53);
    }

    private final String a(byte param0) {
        return pn.a((byte) 48, ((op) this).field_E, new String[3]);
    }

    final void a(int param0, int param1, int param2, int[][] param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            var6_int = 17;
            var7 = 17;
            var8 = -1 + var6_int >> 1;
            var9 = -1 + var7 >> 1;
            var10 = 0;
            L1: while (true) {
              if (var6_int <= var10) {
                L2: {
                  if (param0 == 878) {
                    break L2;
                  } else {
                    String discarded$2 = ((op) this).k((byte) -48);
                    break L2;
                  }
                }
                break L0;
              } else {
                var11 = 0;
                L3: while (true) {
                  if (var7 <= var11) {
                    var10++;
                    continue L1;
                  } else {
                    L4: {
                      if (1 != param3[var10][var11]) {
                        break L4;
                      } else {
                        var12 = param2 + (var10 + -var8);
                        var13 = param1 - (-var11 + var9);
                        if (var12 < 0) {
                          break L4;
                        } else {
                          if (var12 >= ((op) this).field_z) {
                            break L4;
                          } else {
                            if (0 > var13) {
                              break L4;
                            } else {
                              if (((op) this).field_B > var13) {
                                ((op) this).d(-1, var13, var12);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    var11++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("op.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        ((op) this).field_A = param0;
        ((op) this).field_N = param2 ? true : false;
        if (param1 != -16292) {
            boolean discarded$0 = ((op) this).e(-69, 112, 35);
        }
    }

    private final void b(lu param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = 71 / ((-28 - param1) / 35);
            ((op) this).field_n = new nq[((op) this).field_d * 7];
            var3_int = param0.b(16711935);
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3_int) {
                break L0;
              } else {
                ((op) this).field_n[var5] = qi.a(param0, (byte) 48);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("op.R(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final int c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        aga var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          var3 = -115 % ((43 - param0) / 32);
          var2 = 45853 * ((op) this).field_E + (3611 * ((op) this).field_o - -(2585 * ((op) this).field_d));
          var2 = var2 ^ 668347 * (((op) this).field_A + 1 >> 1);
          if (((op) this).field_o == 2) {
            var4 = 0;
            L1: while (true) {
              if (((op) this).field_i.length <= var4) {
                break L0;
              } else {
                var5 = ((op) this).field_i[var4][0];
                var6_int = ((op) this).field_i[var4][1];
                var7 = ((op) this).field_i[var4][2];
                var2 = var2 ^ (317 * var4 + 33919) * (var6_int * var7 + var5 * var6_int);
                var4++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (((op) this).field_o != 3) {
            break L2;
          } else {
            var4 = 0;
            L3: while (true) {
              if (((op) this).field_d <= var4) {
                break L2;
              } else {
                var2 = var2 ^ 5935 * var4 * ((op) this).field_C[var4];
                var5 = ((op) this).field_c[var4][0];
                var6_int = ((op) this).field_c[var4][1];
                var2 = var2 ^ (585 + var4) * 291 * (var5 * var6_int + var6_int);
                var4++;
                continue L3;
              }
            }
          }
        }
        L4: {
          if (((op) this).field_M == -1) {
            break L4;
          } else {
            var2 = var2 ^ 667 * (((op) this).field_Q + 487 * ((op) this).field_M);
            break L4;
          }
        }
        var2 = var2 ^ 87 * ((op) this).field_z + (((op) this).field_D * 599 + ((op) this).field_B * 713);
        var4 = 0;
        L5: while (true) {
          if (((op) this).field_z <= var4) {
            var4 = 0;
            L6: while (true) {
              if (var4 >= ((op) this).field_d) {
                return var2;
              } else {
                var5 = 0;
                L7: while (true) {
                  if (var5 >= 7) {
                    var4++;
                    continue L6;
                  } else {
                    var6 = ((op) this).field_S[var4].field_b[var5];
                    if (var6 != null) {
                      var2 = var2 ^ var6.g(94) * (31 + (var4 * 59 - -(53 * var5)));
                      var5++;
                      continue L7;
                    } else {
                      var5++;
                      continue L7;
                    }
                  }
                }
              }
            }
          } else {
            var5 = 0;
            L8: while (true) {
              if (((op) this).field_B <= var5) {
                var4++;
                continue L5;
              } else {
                var2 = var2 ^ ((op) this).field_a[var4][var5].d(1446291025) * (var5 * (var4 + 13) + 37 - -var4);
                var5++;
                continue L8;
              }
            }
          }
        }
    }

    private final void f(int param0) {
        int var3 = BachelorFridge.field_y;
        this.h(param0 ^ -26126);
        if (param0 != 26125) {
            Object var4 = null;
            ((op) this).a(-25, (aga) null, 68);
        }
        sfa var5 = (sfa) (Object) ((op) this).field_P.b((byte) 90);
        while (var5 != null) {
            cj discarded$0 = this.a(var5, (byte) 91);
            var5 = (sfa) (Object) ((op) this).field_P.c(param0 + -26125);
        }
    }

    final boolean a(byte param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -11) {
            break L0;
          } else {
            ((op) this).field_H = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 < 0) {
              break L2;
            } else {
              if ((((op) this).field_h & 1 << param1) == 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final aga c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        aga var6 = null;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var4 = 0;
        L0: while (true) {
          if (((op) this).field_d <= var4) {
            var4 = -89 / ((param2 - 69) / 33);
            return null;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= 7) {
                var4++;
                continue L0;
              } else {
                var6 = ((op) this).field_S[var4].field_b[var5];
                if (var6 != null) {
                  if (param0 == var6.field_x) {
                    if (param1 == var6.field_J) {
                      return var6;
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final int g(byte param0) {
        int var4 = 0;
        ib var5 = null;
        int var6 = BachelorFridge.field_y;
        int var2 = 0;
        ib[] var3 = ((op) this).field_S;
        if (param0 != 79) {
            ((op) this).field_r = false;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 + var5.b((byte) 84);
        }
        return var2;
    }

    private final void d(lu param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        nq[] var5_ref_nq__ = null;
        int var6 = 0;
        nq var7 = null;
        int var5 = 0;
        int var8 = BachelorFridge.field_y;
        try {
            ((op) this).j(-1);
            var3_int = param0.field_g;
            var4 = 0;
            if (param1 > -80) {
                ((op) this).field_y = null;
            }
            param0.field_g = param0.field_g + 1;
            var5_ref_nq__ = ((op) this).field_n;
            for (var6 = 0; var5_ref_nq__.length > var6; var6++) {
                var7 = var5_ref_nq__[var6];
                if (var7 != null) {
                    var4++;
                    er.a(var7, 110, param0);
                }
            }
            var5 = param0.field_g;
            param0.field_g = var3_int;
            param0.d(var4, 0);
            param0.field_g = var5;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "op.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, aga param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6 = 5 / ((55 - param0) / 37);
              var5_int = param3.field_x;
              var7 = param3.field_J;
              if (param2 == 2) {
                var5_int = var5_int - param1;
                break L1;
              } else {
                if (param2 != 4) {
                  if (param2 != 1) {
                    if (param2 == 3) {
                      var7 = var7 + param1;
                      break L1;
                    } else {
                      return ((op) this).a(param3, var7, var5_int, (byte) 54);
                    }
                  } else {
                    var7 = var7 - param1;
                    break L1;
                  }
                } else {
                  var5_int = var5_int + param1;
                  break L1;
                }
              }
            }
            stackOut_10_0 = ((op) this).a(param3, var7, var5_int, (byte) 54);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("op.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    private final sfa b(int param0, int param1) {
        int var3 = -48 / ((param0 - -60) / 52);
        if (param1 < 0) {
            return null;
        }
        if (param1 > ((op) this).field_n.length) {
            return null;
        }
        if (null == ((op) this).field_n[param1]) {
            return null;
        }
        return ((op) this).field_j[((op) this).field_n[param1].field_g][((op) this).field_n[param1].field_f];
    }

    final void b(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        L0: {
          var5 = -64 / ((0 - param0) / 39);
          if (20 == ((op) this).field_a[param2][param3].field_n) {
            break L0;
          } else {
            L1: {
              if (((op) this).field_a[param2][param3].field_n == 22) {
                break L1;
              } else {
                if (21 == ((op) this).field_a[param2][param3].field_n) {
                  break L1;
                } else {
                  if (23 == ((op) this).field_a[param2][param3].field_n) {
                    break L1;
                  } else {
                    if (((op) this).field_a[param2][param3].field_n == 24) {
                      break L1;
                    } else {
                      if (((op) this).field_a[param2][param3].field_n == 25) {
                        break L1;
                      } else {
                        if (((op) this).field_a[param2][param3].field_n == 26) {
                          break L1;
                        } else {
                          L2: {
                            if (param1 != 1) {
                              break L2;
                            } else {
                              ((op) this).field_a[param2][param3].field_i = true;
                              param1 = 0;
                              break L2;
                            }
                          }
                          L3: {
                            ((op) this).field_a[param2][param3].field_n = param1;
                            ((op) this).field_a[param2][param3].field_a = -1;
                            ((op) this).field_a[param2][param3].field_j = 0;
                            if (!od.field_w[param1].field_c) {
                              ((op) this).field_a[param2][param3].field_m = false;
                              break L3;
                            } else {
                              ((op) this).field_a[param2][param3].field_a = param1 + -6;
                              ((op) this).field_a[param2][param3].field_m = true;
                              break L3;
                            }
                          }
                          L4: {
                            if (35 != param1) {
                              break L4;
                            } else {
                              ((op) this).field_a[param2][param3].field_j = (param2 * 11 - -(((op) this).field_A * param3)) % 3 - -3;
                              break L4;
                            }
                          }
                          L5: {
                            if (27 == param1) {
                              ((op) this).field_a[param2][param3].field_j = 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (37 != param1) {
                              break L6;
                            } else {
                              ((op) this).field_a[param2][param3].field_j = (((op) this).field_A * param3 + 37 * param2) % 3 + 2;
                              break L6;
                            }
                          }
                          L7: {
                            if (33 == param1) {
                              ((op) this).field_a[param2][param3].field_j = 4;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ((op) this).field_a[param2][param3].field_h = od.field_w[param1].field_e;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        }
    }

    final boolean b(byte param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 5) {
            break L0;
          } else {
            ((op) this).field_d = 78;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 < 0) {
              break L2;
            } else {
              if ((((op) this).field_v & 1 << param1) == 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void h(int param0) {
        int var3 = 0;
        sfa var4 = null;
        oha var5 = null;
        int var6 = 0;
        eaa var7 = null;
        L0: {
          var6 = BachelorFridge.field_y;
          if (~(((op) this).field_A & 1) == param0) {
            this.d((byte) -74);
            break L0;
          } else {
            break L0;
          }
        }
        ((op) this).field_P = new eaa();
        ((op) this).field_U = new eaa();
        var7 = new eaa();
        var3 = 0;
        L1: while (true) {
          if (((op) this).field_n.length <= var3) {
            var3 = 3;
            L2: while (true) {
              if (var3 < 1) {
                var7.a(((op) this).field_P, 12632256);
                return;
              } else {
                var4 = (sfa) (Object) var7.b((byte) 90);
                L3: while (true) {
                  if (var4 == null) {
                    var3--;
                    continue L2;
                  } else {
                    L4: {
                      var5 = al.a(120, var4.field_g);
                      if (2 != var5.field_a) {
                        break L4;
                      } else {
                        if (!hl.a((byte) 121, var5.field_j)) {
                          break L4;
                        } else {
                          if (var5.field_l == var3) {
                            ((op) this).field_P.a((bw) (Object) var4, true);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var4 = (sfa) (Object) var7.c(~param0);
                    continue L3;
                  }
                }
              }
            }
          } else {
            var4 = this.b(param0 + -112, var3);
            if (var4 != null) {
              var7.a((bw) (Object) var4, true);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param0 == 1845) {
            break L0;
          } else {
            this.c(80);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (((op) this).field_d <= var4) {
            return -1;
          } else {
            if (param2 == ((op) this).field_c[var4][0]) {
              if (param1 == ((op) this).field_c[var4][1]) {
                return var4;
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
    }

    final boolean e(int param0, int param1, int param2) {
        if (((op) this).field_a[param0][param1].field_l != null) {
            return false;
        }
        if (20 != ((op) this).field_a[param0][param1].field_n) {
            if (((op) this).field_a[param0][param1].field_n != 22) {
                if (((op) this).field_a[param0][param1].field_n != 21) {
                    if (((op) this).field_a[param0][param1].field_n != 23) {
                        if (((op) this).field_a[param0][param1].field_n != 24) {
                            if (((op) this).field_a[param0][param1].field_n != 25) {
                                if (!(((op) this).field_a[param0][param1].field_n == 26)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (param2 != -11066) {
            ((op) this).field_f = -16;
            return false;
        }
        return false;
    }

    private final void c(lu param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        wia var6 = null;
        int var7 = 0;
        int var8 = 0;
        lu stackIn_9_0 = null;
        lu stackIn_10_0 = null;
        lu stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        lu stackIn_12_0 = null;
        lu stackIn_13_0 = null;
        lu stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        lu stackOut_8_0 = null;
        lu stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        lu stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        lu stackOut_11_0 = null;
        lu stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        lu stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            param0.d(((op) this).field_D, 0);
            param0.d(((op) this).field_o, 0);
            param0.d(((op) this).field_E, 0);
            param0.d(((op) this).field_z, 0);
            var3_int = -73;
            param0.d(((op) this).field_B, 0);
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((op) this).field_B) {
                L2: {
                  if (2 != ((op) this).field_o) {
                    break L2;
                  } else {
                    var4 = 0;
                    L3: while (true) {
                      if (((op) this).field_i.length <= var4) {
                        break L2;
                      } else {
                        param0.d(((op) this).field_i[var4][0], 0);
                        param0.d(((op) this).field_i[var4][1], 0);
                        param0.d(((op) this).field_i[var4][2], 0);
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
                L4: {
                  if (3 != ((op) this).field_o) {
                    break L4;
                  } else {
                    var4 = 0;
                    L5: while (true) {
                      if (((op) this).field_d <= var4) {
                        var4 = 0;
                        L6: while (true) {
                          if (var4 >= ((op) this).field_d) {
                            break L4;
                          } else {
                            param0.d(((op) this).field_C[var4], 0);
                            var4++;
                            continue L6;
                          }
                        }
                      } else {
                        param0.d(((op) this).field_c[var4][0], 0);
                        param0.d(((op) this).field_c[var4][1], 0);
                        var4++;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                var5 = 0;
                L7: while (true) {
                  if (((op) this).field_z <= var5) {
                    var4++;
                    continue L1;
                  } else {
                    L8: {
                      var6 = ((op) this).field_a[var5][var4];
                      var7 = var6.field_n;
                      if (var6.field_i) {
                        var7 = var7 | 128;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      param0.d(var7, 0);
                      param0.d(var6.field_j, 0);
                      param0.d(var6.field_a, 0);
                      stackOut_8_0 = (lu) param0;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var6.field_m) {
                        stackOut_10_0 = (lu) (Object) stackIn_10_0;
                        stackOut_10_1 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L9;
                      } else {
                        stackOut_9_0 = (lu) (Object) stackIn_9_0;
                        stackOut_9_1 = 0;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L9;
                      }
                    }
                    L10: {
                      ((lu) (Object) stackIn_11_0).d(stackIn_11_1, 0);
                      param0.d(var6.field_h, 0);
                      stackOut_11_0 = (lu) param0;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var6.field_d) {
                        stackOut_13_0 = (lu) (Object) stackIn_13_0;
                        stackOut_13_1 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L10;
                      } else {
                        stackOut_12_0 = (lu) (Object) stackIn_12_0;
                        stackOut_12_1 = 0;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L10;
                      }
                    }
                    ((lu) (Object) stackIn_14_0).d(stackIn_14_1, 0);
                    var5++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("op.N(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + 92 + ')');
        }
    }

    final void d(int param0, int param1, int param2) {
        if (~param2 > param0) {
          return;
        } else {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (((op) this).field_z <= param2) {
                break L0;
              } else {
                if (((op) this).field_B <= param1) {
                  break L0;
                } else {
                  ((op) this).field_a[param2][param1].field_d = true;
                  return;
                }
              }
            }
          }
          return;
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        L0: {
          var4 = -126 % ((3 - param2) / 37);
          if (param0 < 0) {
            break L0;
          } else {
            if (param1 < 0) {
              break L0;
            } else {
              if (~param0 <= ~((op) this).field_z) {
                break L0;
              } else {
                if (~param1 <= ~((op) this).field_B) {
                  break L0;
                } else {
                  return ju.c(23745, ((op) this).field_a[param0][param1].field_n);
                }
              }
            }
          }
        }
        return false;
    }

    private final boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        aga var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((op) this).field_d) {
            return true;
          } else {
            var3 = 0;
            L1: while (true) {
              if (var3 >= 7) {
                var2++;
                continue L0;
              } else {
                var4 = ((op) this).field_S[var2].field_b[var3];
                if (var4 != null) {
                  L2: {
                    if (var4 != ((op) this).field_a[var4.field_x][var4.field_J].field_l) {
                      break L2;
                    } else {
                      if (var4.i(69)) {
                        return false;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!var4.i(-115)) {
                    if (((op) this).field_a[var4.field_x][var4.field_J].field_l != var4) {
                      return false;
                    } else {
                      var3++;
                      continue L1;
                    }
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void a(aga param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (((op) this).field_n.length <= var3_int) {
                break L0;
              } else {
                if (((op) this).field_n[var3_int] == null) {
                  ((op) this).field_n[var3_int] = new nq(param0);
                  param0.field_v = var3_int;
                  return;
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("op.O(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + true + ')');
        }
    }

    final void b(int param0) {
        if (!(!((op) this).field_r)) {
            throw new IllegalStateException();
        }
        if (!(((op) this).field_A <= 0)) {
            ((op) this).field_N = !((op) this).field_N ? true : false;
            ((op) this).field_A = ((op) this).field_A + 1;
            this.f((byte) 103);
            this.f(param0 + 26125);
        }
        if (param0 != 0) {
            return;
        }
        if (!((op) this).field_N) {
            lc discarded$0 = this.e(0);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        L0: {
          var5 = -8 / ((50 - param1) / 63);
          if (((op) this).a((byte) -113, param2, param0 + 1, param3)) {
            break L0;
          } else {
            if (((op) this).a((byte) -115, param2, param0 + -1, param3)) {
              break L0;
            } else {
              if (!((op) this).a((byte) -105, param2, param0, param3 - -1)) {
                if (!((op) this).a((byte) -126, param2, param0, -1 + param3)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
        return true;
    }

    final void a(sfa[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        sfa var5_ref_sfa = null;
        int var5 = 0;
        int var9 = 0;
        Object var10 = null;
        int var13 = 0;
        aga[] var14 = null;
        aga var15 = null;
        aga[] var16 = null;
        aga var17 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= 7) {
                L2: {
                  if (!((op) this).field_N) {
                    break L2;
                  } else {
                    if (!((op) this).field_S[param1].a((byte) -52, 42)) {
                      break L2;
                    } else {
                      var14 = ((op) this).field_S[param1].field_b;
                      var5 = 0;
                      L3: while (true) {
                        if (var14.length <= var5) {
                          break L2;
                        } else {
                          var15 = var14[var5];
                          var17 = var15;
                          var17 = var15;
                          if (var15 != null) {
                            L4: {
                              if (var15.i(115)) {
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var5++;
                            continue L3;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (param2 == -31) {
                    break L5;
                  } else {
                    var10 = null;
                    boolean discarded$1 = ((op) this).b((aga) null, (byte) -16);
                    break L5;
                  }
                }
                L6: {
                  if (((op) this).field_N) {
                    break L6;
                  } else {
                    if (!((op) this).field_S[param1].a((byte) -49, 40)) {
                      break L6;
                    } else {
                      var16 = ((op) this).field_S[param1].field_b;
                      var13 = 0;
                      var5 = var13;
                      L7: while (true) {
                        if (var13 >= var16.length) {
                          break L6;
                        } else {
                          L8: {
                            var17 = var16[var13];
                            if (var17 == null) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var13++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                L9: {
                  var5_ref_sfa = param0[var4_int];
                  if (var5_ref_sfa != null) {
                    ((op) this).field_j[param1][var5_ref_sfa.field_h.field_f] = var5_ref_sfa;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("op.TA(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int[][] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wia var15 = null;
        int var16 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var16 = BachelorFridge.field_y;
        try {
          L0: {
            var7_int = 17;
            var8 = 17;
            var9 = var7_int - 1 >> 1;
            var10 = var8 - 1 >> 1;
            var11 = param0;
            L1: while (true) {
              if (~var11 <= ~var7_int) {
                break L0;
              } else {
                var12 = 0;
                L2: while (true) {
                  if (var8 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    L3: {
                      if (param4[var11][var12] == 1) {
                        var13 = param1 - (-var11 + var9);
                        var14 = -var10 + (var12 + param2);
                        if (var13 < 0) {
                          break L3;
                        } else {
                          if (~var13 <= ~((op) this).field_z) {
                            break L3;
                          } else {
                            if (var14 < 0) {
                              break L3;
                            } else {
                              if (~var14 <= ~((op) this).field_B) {
                                break L3;
                              } else {
                                var15 = ((op) this).field_a[var13][var14];
                                if (!ju.c(23745, var15.field_n)) {
                                  break L3;
                                } else {
                                  if (20 == var15.field_n) {
                                    break L3;
                                  } else {
                                    if (var15.field_n == 23) {
                                      break L3;
                                    } else {
                                      if (var15.field_n == 24) {
                                        break L3;
                                      } else {
                                        if (var15.field_n == 25) {
                                          break L3;
                                        } else {
                                          if (var15.field_n == 26) {
                                            break L3;
                                          } else {
                                            L4: {
                                              if (param3) {
                                                break L4;
                                              } else {
                                                if (var15.field_l != null) {
                                                  break L3;
                                                } else {
                                                  break L4;
                                                }
                                              }
                                            }
                                            ((op) this).b((byte) -66, param5, var13, var14);
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
                      } else {
                        break L3;
                      }
                    }
                    var12++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("op.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param5 + ')');
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (((op) this).field_d <= var2) {
            return;
          } else {
            var3 = 0;
            L1: while (true) {
              if (7 <= var3) {
                var2++;
                continue L0;
              } else {
                if (((op) this).field_S[var2].field_b[var3] != null) {
                  ((op) this).field_S[var2].field_b[var3].field_z = false;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var4 = ((op) this).field_L.field_o[param2][param0].field_n - -19;
        if (23 == var4) {
            return true;
        }
        if (var4 != 24) {
            if (25 == var4) {
                return true;
            }
            if (26 != var4) {
                return false;
            }
        }
        return true;
    }

    private final int[] a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((op) this).field_z) {
            return new int[]{-1, -1};
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((op) this).field_B) {
                var3++;
                continue L0;
              } else {
                L2: {
                  if (param1 != 0) {
                    break L2;
                  } else {
                    if (23 == ((op) this).field_a[var3][var4].field_n) {
                      return new int[]{var3, var4};
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param1 != 1) {
                    break L3;
                  } else {
                    if (24 != ((op) this).field_a[var3][var4].field_n) {
                      break L3;
                    } else {
                      return new int[]{var3, var4};
                    }
                  }
                }
                L4: {
                  if (param1 != 2) {
                    break L4;
                  } else {
                    if (((op) this).field_a[var3][var4].field_n != 25) {
                      break L4;
                    } else {
                      return new int[]{var3, var4};
                    }
                  }
                }
                L5: {
                  if (param1 != 3) {
                    break L5;
                  } else {
                    if (26 != ((op) this).field_a[var3][var4].field_n) {
                      break L5;
                    } else {
                      return new int[]{var3, var4};
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        aga var8 = null;
        aga var9 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((op) this).field_r = stackIn_3_1 != 0;
          ((op) this).field_b = param1;
          if (-1 == ((op) this).field_b) {
            break L1;
          } else {
            ((op) this).field_g[((op) this).field_b] = ((op) this).field_g[((op) this).field_b] + 300;
            break L1;
          }
        }
        var3 = 0;
        L2: while (true) {
          if (((op) this).field_d <= var3) {
            var3 = 0;
            L3: while (true) {
              if (((op) this).field_d <= var3) {
                ((op) this).field_H = new tk[((op) this).field_d];
                var3 = 0;
                L4: while (true) {
                  if (var3 >= ((op) this).field_d) {
                    return;
                  } else {
                    ((op) this).field_H[var3] = ((op) this).field_T.a((byte) 9, var3);
                    var3++;
                    continue L4;
                  }
                }
              } else {
                var7 = 0;
                var4 = var7;
                L5: while (true) {
                  if (var7 >= 7) {
                    var3++;
                    continue L3;
                  } else {
                    var9 = ((op) this).field_S[var3].field_b[var7];
                    if (var9 != null) {
                      ((op) this).field_T.field_C[var3] = sr.a(((op) this).field_T.field_C[var3], 1L << var9.field_o.field_b);
                      var7++;
                      continue L5;
                    } else {
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            var4 = 0;
            L6: while (true) {
              if (var4 >= 7) {
                var3++;
                continue L2;
              } else {
                var8 = ((op) this).field_S[var3].field_b[var4];
                if (var8 != null) {
                  if (var3 != ((op) this).field_b) {
                    ((op) this).field_p.a((byte) -28, (bf) (Object) new dla(new nq(var8.field_D, var8.field_u)));
                    var4++;
                    continue L6;
                  } else {
                    ((op) this).field_p.a((byte) -28, (bf) (Object) new qja(new nq(var8.field_D, var8.field_u)));
                    var4++;
                    continue L6;
                  }
                } else {
                  var4++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    final void a(aga param0, int param1, int param2, int param3) {
        if (param1 != 1) {
            return;
        }
        try {
            ((op) this).field_S[param2].field_b[param3] = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "op.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final aga a(byte param0, aga param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        Object var4 = null;
        aga var5 = null;
        aga var6 = null;
        aga var7 = null;
        aga var8 = null;
        Object stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_27_0 = null;
        Object stackOut_25_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (((op) this).field_S[param1.field_D].field_a != 7) {
                L1: {
                  L2: {
                    var3_int = -21 / ((16 - param0) / 55);
                    var4 = null;
                    if (param1.field_x <= 0) {
                      break L2;
                    } else {
                      if (null != ((op) this).field_a[-1 + param1.field_x][param1.field_J].field_l) {
                        break L2;
                      } else {
                        if (!((op) this).field_a[param1.field_x + -1][param1.field_J].e(-35)) {
                          break L2;
                        } else {
                          var5 = param1.b(true);
                          var5.field_s = 2;
                          var5.field_x = var5.field_x - 1;
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    if (-1 + ((op) this).field_z <= param1.field_x) {
                      break L3;
                    } else {
                      if (((op) this).field_a[param1.field_x - -1][param1.field_J].field_l != null) {
                        break L3;
                      } else {
                        if (((op) this).field_a[param1.field_x + 1][param1.field_J].e(-126)) {
                          var8 = param1.b(true);
                          var4 = (Object) (Object) var8;
                          var8.field_x = var8.field_x + 1;
                          var8.field_s = 4;
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param1.field_J <= 0) {
                      break L4;
                    } else {
                      if (null != ((op) this).field_a[param1.field_x][-1 + param1.field_J].field_l) {
                        break L4;
                      } else {
                        if (((op) this).field_a[param1.field_x][-1 + param1.field_J].e(-120)) {
                          var7 = param1.b(true);
                          var7.field_s = 1;
                          var7.field_J = var7.field_J - 1;
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param1.field_J >= -1 + ((op) this).field_B) {
                    break L1;
                  } else {
                    if (null != ((op) this).field_a[param1.field_x][1 + param1.field_J].field_l) {
                      break L1;
                    } else {
                      if (!((op) this).field_a[param1.field_x][1 + param1.field_J].e(-36)) {
                        break L1;
                      } else {
                        var6 = param1.b(true);
                        var6.field_J = var6.field_J + 1;
                        var6.field_s = 3;
                        break L1;
                      }
                    }
                  }
                }
                if (var4 != null) {
                  ((op) this).field_S[param1.field_D].a(-20836, (aga) var4);
                  ((op) this).field_a[((aga) var4).field_x][((aga) var4).field_J].field_l = (aga) var4;
                  param1.d(-107);
                  ((aga) var4).d(3);
                  stackOut_27_0 = var4;
                  stackIn_28_0 = stackOut_27_0;
                  break L0;
                } else {
                  stackOut_25_0 = null;
                  stackIn_26_0 = stackOut_25_0;
                  return (aga) (Object) stackIn_26_0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("op.FA(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return (aga) (Object) stackIn_28_0;
    }

    final void j(int param0) {
        int var2 = 0;
        nq var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (((op) this).field_n.length <= var2) {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ((op) this).a((int[][]) null, (byte) -21, -84, -59, 6, 41);
                break L1;
              }
            }
            return;
          } else {
            var3 = ((op) this).field_n[var2];
            if (var3 != null) {
              ((op) this).field_S[var3.field_g].field_b[var3.field_f].field_v = var2 - -1;
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final boolean a(aga param0, aga param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 != null) {
                if (!param1.a(((op) this).field_a[param0.field_x][param0.field_J].field_n, false)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  if (param0.a(((op) this).field_a[param1.field_x][param1.field_J].field_n, false)) {
                    if (param2 == 4) {
                      var4_int = param1.field_x;
                      var5 = param1.field_J;
                      param1.a(param0.field_J, param0.field_x, true);
                      param0.a(var5, var4_int, true);
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      break L0;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    }
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0 != 0;
                  }
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("op.GB(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L1;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L1;
            }
          }
          L2: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    private final void a(int param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        aga var5 = null;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= 7) {
                break L0;
              } else {
                var5 = ((op) this).field_S[param0].field_b[var4_int];
                rha.a((rk) (Object) var5, param1, (byte) -118);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("op.PB(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -123 + ')');
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (((op) this).field_o == 3) {
          L0: {
            if (param1 > 114) {
              break L0;
            } else {
              ((op) this).field_K = -110;
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (var4 >= ((op) this).field_d) {
              return false;
            } else {
              if (param2 == ((op) this).field_c[var4][0]) {
                if (param0 == ((op) this).field_c[var4][1]) {
                  return true;
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
        } else {
          return false;
        }
    }

    private final int[] a(aga param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] stackIn_67_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_66_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = param0.field_x;
            var4 = param0.field_J;
            var5 = ((t) (Object) al.a(-97, 24)).field_t;
            var6 = 1 + kla.a(4, ((op) this).field_w, -2147483648);
            var7 = var6;
            var8 = 0;
            var9 = 0;
            var10 = var5;
            L1: while (true) {
              if (4 <= var8) {
                L2: {
                  if (0 != var9) {
                    break L2;
                  } else {
                    var9 = 1 + kla.a(4, ((op) this).field_w, -2147483648);
                    break L2;
                  }
                }
                L3: {
                  if (var10 == 0) {
                    var10 = kla.a(var5, ((op) this).field_w, -2147483648);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_66_0 = new int[]{var9, -1 + var10};
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L4: {
                  if (var7 != 2) {
                    if (var7 == 4) {
                      var11 = 1;
                      L5: while (true) {
                        if (var5 <= var11) {
                          break L4;
                        } else {
                          if (-1 + ((op) this).field_z < var3_int - -var11) {
                            break L4;
                          } else {
                            if (((op) this).field_a[var11 + var3_int][var4].e(-121)) {
                              L6: {
                                if (((op) this).field_z <= var11 + var3_int) {
                                  break L6;
                                } else {
                                  if (null == ((op) this).field_a[var3_int - -var11][var4].field_l) {
                                    break L6;
                                  } else {
                                    if (var11 < var10) {
                                      var9 = 4;
                                      var10 = var11;
                                      break L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var11++;
                              continue L5;
                            } else {
                              L7: {
                                var7++;
                                if (var7 != 5) {
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              var8++;
                              continue L1;
                            }
                          }
                        }
                      }
                    } else {
                      if (var7 == 1) {
                        var11 = 1;
                        L8: while (true) {
                          if (var11 >= var5) {
                            break L4;
                          } else {
                            if (0 > var4 + -var11) {
                              break L4;
                            } else {
                              if (((op) this).field_a[var3_int][var4 - var11].e(-106)) {
                                L9: {
                                  if (-var11 + var4 < 0) {
                                    break L9;
                                  } else {
                                    if (((op) this).field_a[var3_int][-var11 + var4].field_l == null) {
                                      break L9;
                                    } else {
                                      if (var11 < var10) {
                                        var10 = var11;
                                        var9 = 1;
                                        break L4;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                var11++;
                                continue L8;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      } else {
                        if (var7 == 3) {
                          var11 = 1;
                          L10: while (true) {
                            if (var5 <= var11) {
                              break L4;
                            } else {
                              if (-1 + ((op) this).field_B < var11 + var4) {
                                break L4;
                              } else {
                                if (!((op) this).field_a[var3_int][var4 - -var11].e(-31)) {
                                  break L4;
                                } else {
                                  L11: {
                                    if (((op) this).field_B <= var4 + var11) {
                                      break L11;
                                    } else {
                                      if (null == ((op) this).field_a[var3_int][var11 + var4].field_l) {
                                        break L11;
                                      } else {
                                        if (var11 < var10) {
                                          var9 = 3;
                                          var10 = var11;
                                          break L4;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  continue L10;
                                }
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    var11 = 1;
                    L12: while (true) {
                      if (var11 >= var5) {
                        break L4;
                      } else {
                        if (-var11 + var3_int < 0) {
                          break L4;
                        } else {
                          if (((op) this).field_a[-var11 + var3_int][var4].e(-84)) {
                            L13: {
                              if (-var11 + var3_int < 0) {
                                break L13;
                              } else {
                                if (((op) this).field_a[-var11 + var3_int][var4].field_l == null) {
                                  break L13;
                                } else {
                                  if (var10 > var11) {
                                    var10 = var11;
                                    var9 = 2;
                                    break L4;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var11++;
                            continue L12;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                L14: {
                  var7++;
                  if (var7 != 5) {
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var3;
            stackOut_68_1 = new StringBuilder().append("op.P(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L15;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L15;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + 0 + ')');
        }
        return stackIn_67_0;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aga var6_ref_aga = null;
        int var6 = 0;
        int var7 = 0;
        aga var8 = null;
        int var9 = 0;
        rv var10 = null;
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          if (param0 > 97) {
            break L0;
          } else {
            ((op) this).field_G = -71;
            break L0;
          }
        }
        var2 = 50 + 25 * (((op) this).field_A + -((op) this).field_J >> 1);
        var3 = 0;
        L1: while (true) {
          if (var3 >= ((op) this).field_d) {
            return;
          } else {
            var4 = 0;
            var5 = 0;
            L2: while (true) {
              if (var5 >= 7) {
                if (-1 != var4) {
                  var5 = var2 / var4;
                  var6 = var2 % var4;
                  var7 = 0;
                  L3: while (true) {
                    if (-8 > var7) {
                      var8 = ((op) this).field_S[var3].field_b[var7];
                      if (var8 != null) {
                        if (!var8.i(-120)) {
                          L4: {
                            var9 = var5;
                            var6--;
                            if (var6 >= 0) {
                              var9++;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var10 = new rv();
                          var10.a(true, (pp) (Object) new qq(new nq(var8), -1, var9));
                          var10.a((op) this, false);
                          ((op) this).field_U.a((bw) (Object) var10, true);
                          var7++;
                          continue L3;
                        } else {
                          var7++;
                          continue L3;
                        }
                      } else {
                        var7++;
                        continue L3;
                      }
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var6_ref_aga = ((op) this).field_S[var3].field_b[var5];
                var8 = var6_ref_aga;
                var8 = var6_ref_aga;
                if (var6_ref_aga != null) {
                  if (!var6_ref_aga.i(68)) {
                    var4++;
                    var5++;
                    continue L2;
                  } else {
                    var5++;
                    continue L2;
                  }
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(int param0, byte param1) {
        ((op) this).field_c[param0] = this.a(0, param0);
        wia var3 = ((op) this).field_a[((op) this).field_c[param0][0]][((op) this).field_c[param0][1]];
        var3.field_m = true;
        if (param1 <= 43) {
            ((op) this).a(38, -108, -127, (int[][]) null, 91);
        }
        aga var4 = var3.field_l;
        if (var4 != null) {
            if (param0 != var4.field_D) {
                if (!var4.g((byte) 85)) {
                    var4.b((byte) 124, 24 + param0);
                }
            }
        }
    }

    final void a(int param0, aga param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param4 <= -70) {
                break L1;
              } else {
                ((op) this).field_w = null;
                break L1;
              }
            }
            L2: {
              if (param3 == 2) {
                ((op) this).b((byte) -65, param2, -param0 + param1.field_x, param1.field_J);
                break L2;
              } else {
                if (param3 != 4) {
                  if (param3 != 1) {
                    if (param3 == 3) {
                      ((op) this).b((byte) -45, param2, param1.field_x, param0 + param1.field_J);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    ((op) this).b((byte) 62, param2, param1.field_x, param1.field_J - param0);
                    break L2;
                  }
                } else {
                  ((op) this).b((byte) 50, param2, param1.field_x + param0, param1.field_J);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("op.DA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3) {
        int[] var5 = null;
        Object var6 = null;
        int[] var7 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var7 = this.a(0, param1);
          var5 = var7;
          if (param0 < -95) {
            break L0;
          } else {
            var6 = null;
            int discarded$2 = this.a(-117, 19, (aga) null, (byte) -1);
            break L0;
          }
        }
        L1: {
          L2: {
            if (var7[0] != param2) {
              break L2;
            } else {
              if (var7[1] != param3) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void f(byte param0) {
    }

    private final void b(int param0, lu param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        wia stackIn_14_0 = null;
        wia stackIn_15_0 = null;
        wia stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        wia stackIn_19_0 = null;
        wia stackIn_20_0 = null;
        wia stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        wia stackIn_25_0 = null;
        wia stackIn_26_0 = null;
        wia stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        wia stackOut_13_0 = null;
        wia stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        wia stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        wia stackOut_18_0 = null;
        wia stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        wia stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        wia stackOut_24_0 = null;
        wia stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        wia stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            ((op) this).field_D = param1.b(16711935);
            ((op) this).field_L = rs.field_g[((op) this).field_D];
            ((op) this).field_o = param1.b(16711935);
            ((op) this).field_E = param1.b(16711935);
            ((op) this).field_z = param1.b(16711935);
            ((op) this).field_B = param1.b(16711935);
            ((op) this).field_a = new wia[((op) this).field_z][((op) this).field_B];
            ((op) this).field_i = new int[((op) this).field_L.field_m][3];
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= ((op) this).field_i.length) {
                L2: {
                  var3_int = 3 + ((op) this).field_d;
                  if (var3_int > 9) {
                    var3_int = 9;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4 = 0;
                var5 = 0;
                L3: while (true) {
                  if (((op) this).field_B <= var5) {
                    L4: {
                      if (((op) this).field_o != 2) {
                        break L4;
                      } else {
                        ((op) this).field_i = new int[((op) this).field_L.field_m][3];
                        var5 = 0;
                        L5: while (true) {
                          if (((op) this).field_i.length <= var5) {
                            break L4;
                          } else {
                            ((op) this).field_i[var5] = new int[3];
                            var5++;
                            continue L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (((op) this).field_o == 3) {
                        ((op) this).field_c = new int[((op) this).field_d][0];
                        var5 = 0;
                        L7: while (true) {
                          if (((op) this).field_d <= var5) {
                            ((op) this).field_C = new int[((op) this).field_d];
                            var5 = 0;
                            L8: while (true) {
                              if (((op) this).field_d <= var5) {
                                break L6;
                              } else {
                                ((op) this).field_C[var5] = param1.b(16711935);
                                var5++;
                                continue L8;
                              }
                            }
                          } else {
                            ((op) this).field_c[var5] = new int[2];
                            var5++;
                            continue L7;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    break L0;
                  } else {
                    var6 = 0;
                    L9: while (true) {
                      if (((op) this).field_z <= var6) {
                        var5++;
                        continue L3;
                      } else {
                        L10: {
                          var7 = param1.b(16711935);
                          ((op) this).field_a[var6][var5] = new wia(dda.a(var7, 127));
                          stackOut_13_0 = ((op) this).field_a[var6][var5];
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if ((var7 & 128) == 0) {
                            stackOut_15_0 = (wia) (Object) stackIn_15_0;
                            stackOut_15_1 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            break L10;
                          } else {
                            stackOut_14_0 = (wia) (Object) stackIn_14_0;
                            stackOut_14_1 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            break L10;
                          }
                        }
                        L11: {
                          stackIn_16_0.field_i = stackIn_16_1 != 0;
                          ((op) this).field_a[var6][var5].field_j = param1.b(16711935);
                          if (((op) this).field_a[var6][var5].field_j != 255) {
                            break L11;
                          } else {
                            ((op) this).field_a[var6][var5].field_j = -1;
                            break L11;
                          }
                        }
                        L12: {
                          ((op) this).field_a[var6][var5].field_a = param1.b(true);
                          stackOut_18_0 = ((op) this).field_a[var6][var5];
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_19_0 = stackOut_18_0;
                          if (1 == param1.b(16711935)) {
                            stackOut_20_0 = (wia) (Object) stackIn_20_0;
                            stackOut_20_1 = 1;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            break L12;
                          } else {
                            stackOut_19_0 = (wia) (Object) stackIn_19_0;
                            stackOut_19_1 = 0;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            break L12;
                          }
                        }
                        L13: {
                          stackIn_21_0.field_m = stackIn_21_1 != 0;
                          if (((op) this).field_a[var6][var5].field_n == 20) {
                            ((op) this).field_i[var4][0] = var6;
                            ((op) this).field_i[var4][1] = var5;
                            ((op) this).field_i[var4][2] = -1;
                            var4++;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          ((op) this).field_a[var6][var5].field_h = param1.b(16711935);
                          stackOut_24_0 = ((op) this).field_a[var6][var5];
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (1 != param1.b(16711935)) {
                            stackOut_26_0 = (wia) (Object) stackIn_26_0;
                            stackOut_26_1 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            break L14;
                          } else {
                            stackOut_25_0 = (wia) (Object) stackIn_25_0;
                            stackOut_25_1 = 1;
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            break L14;
                          }
                        }
                        stackIn_27_0.field_d = stackIn_27_1 != 0;
                        var6++;
                        continue L9;
                      }
                    }
                  }
                }
              } else {
                ((op) this).field_i[var3_int] = new int[3];
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var3;
            stackOut_42_1 = new StringBuilder().append("op.IB(").append(-1).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L15;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L15;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ')');
        }
    }

    final boolean b(aga param0, byte param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0 = false;
        boolean stackOut_11_0 = false;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 113) {
                break L1;
              } else {
                var4 = null;
                ((op) this).a(2, (aj[]) null, 108, (byte) -104);
                break L1;
              }
            }
            if (param0.field_D == 0) {
              stackOut_13_0 = param0.i(23, 116);
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              if (1 == param0.field_D) {
                stackOut_11_0 = param0.i(24, 126);
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                if (param0.field_D != 2) {
                  if (3 == param0.field_D) {
                    stackOut_9_0 = param0.i(26, 122);
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_5_0 = param0.i(25, 124);
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("op.SB(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final void a(int param0, boolean param1, lu param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        cj var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = param2.field_g + param0;
            this.b(param2, -69);
            ((op) this).field_O = param2.b(16711935);
            ((op) this).field_U = new eaa();
            L1: while (true) {
              if (var4_int <= param2.field_g) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    ((op) this).field_m = -104;
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = tma.a(param2, (byte) -50);
                var5.field_j = param2.f(-98);
                ((op) this).field_U.a((bw) (Object) var5, true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("op.B(").append(param0).append(',').append(param1).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final int b(boolean param0, int param1) {
        if (23 == param1) {
          return 0;
        } else {
          if (param1 != 24) {
            if (25 == param1) {
              return 2;
            } else {
              if (param1 != 26) {
                L0: {
                  if (!param0) {
                    break L0;
                  } else {
                    ((op) this).field_S = null;
                    break L0;
                  }
                }
                return -1;
              } else {
                return 3;
              }
            }
          } else {
            return 1;
          }
        }
    }

    private final int[] a(boolean param0, aga param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] stackIn_50_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_49_0 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = param1.field_x;
            var4 = param1.field_J;
            var5 = param1.f((byte) 123);
            var6 = kla.a(4, ((op) this).field_w, -2147483648) + 1;
            var7 = var6;
            var8 = 0;
            var9 = 0;
            var10 = 0;
            L1: while (true) {
              if (var8 >= 4) {
                L2: {
                  if (var9 == 0) {
                    var9 = 1 + kla.a(4, ((op) this).field_w, -2147483648);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var10 != 0) {
                    break L3;
                  } else {
                    var10 = kla.a(var5, ((op) this).field_w, -2147483648);
                    break L3;
                  }
                }
                stackOut_49_0 = new int[]{var9, var10};
                stackIn_50_0 = stackOut_49_0;
                break L0;
              } else {
                L4: {
                  if (var7 == 2) {
                    var11 = 1;
                    L5: while (true) {
                      if (var11 >= var5) {
                        break L4;
                      } else {
                        if (var3_int - var11 < 0) {
                          break L4;
                        } else {
                          if (((op) this).field_a[-var11 + var3_int][var4].e(-110)) {
                            L6: {
                              if (-var11 + var3_int < 0) {
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var11++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  } else {
                    if (var7 != 4) {
                      if (1 == var7) {
                        var11 = 1;
                        L7: while (true) {
                          if (var11 >= var5) {
                            break L4;
                          } else {
                            if (0 > var4 - var11) {
                              break L4;
                            } else {
                              if (((op) this).field_a[var3_int][var4 + -var11].e(-88)) {
                                L8: {
                                  if (var4 + -var11 < 0) {
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                var11++;
                                continue L7;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      } else {
                        if (var7 != 3) {
                          break L4;
                        } else {
                          var11 = 1;
                          L9: while (true) {
                            if (var5 <= var11) {
                              break L4;
                            } else {
                              if (((op) this).field_B + -1 < var11 + var4) {
                                break L4;
                              } else {
                                if (((op) this).field_a[var3_int][var11 + var4].e(-35)) {
                                  L10: {
                                    if (((op) this).field_B <= var11 + var4) {
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var11++;
                                  continue L9;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var11 = 1;
                      L11: while (true) {
                        if (var11 >= var5) {
                          break L4;
                        } else {
                          if (var3_int + var11 > ((op) this).field_z + -1) {
                            break L4;
                          } else {
                            if (!((op) this).field_a[var11 + var3_int][var4].e(-80)) {
                              break L4;
                            } else {
                              L12: {
                                if (var3_int + var11 >= ((op) this).field_z) {
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var11++;
                              continue L11;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L13: {
                  var7++;
                  if (var7 == 5) {
                    var7 = 1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var3;
            stackOut_51_1 = new StringBuilder().append("op.AC(").append(true).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L14;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L14;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
        return stackIn_50_0;
    }

    final void a(lu param0, int param1) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                ((op) this).d(52, -96, -42);
                break L1;
              }
            }
            this.d(param0, (byte) -116);
            param0.d(((op) this).field_O, 0);
            var3 = (cj) (Object) ((op) this).field_U.b((byte) 90);
            L2: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                nca.a(101, param0, var3);
                param0.e(var3.field_j, -1615464796);
                var3 = (cj) (Object) ((op) this).field_U.c(~param1);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("op.MA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final int b(byte param0, aga param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 44) {
                break L1;
              } else {
                ((op) this).field_n = null;
                break L1;
              }
            }
            L2: {
              if (!param1.g((byte) 85)) {
                break L2;
              } else {
                if (param1.field_y == 24) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  if (param1.field_y != 25) {
                    if (26 == param1.field_y) {
                      stackOut_12_0 = 2;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    } else {
                      if (param1.field_y == 27) {
                        stackOut_10_0 = 3;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
            }
            stackOut_16_0 = -1;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("op.JB(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    private final lc e(int param0) {
        int var3 = 0;
        int var4 = 0;
        ej var4_ref_ej = null;
        wia var5_ref_wia = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        lc var8 = null;
        int stackIn_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        var7 = BachelorFridge.field_y;
        boolean discarded$2 = this.b((byte) 10);
        ((op) this).i((byte) 56);
        ((op) this).i(0);
        ((op) this).j(-1);
        var8 = new lc();
        ((op) this).a(23189);
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((op) this).field_z) {
            var3 = 0;
            L1: while (true) {
              if (((op) this).field_z <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (((op) this).field_z <= var3) {
                    L3: {
                      if (((op) this).field_E != 2) {
                        break L3;
                      } else {
                        L4: {
                          L5: {
                            if (sh.field_C == null) {
                              break L5;
                            } else {
                              if (((op) this).field_z * ((op) this).field_B <= sh.field_C.length) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          sh.field_C = new aj[((op) this).field_z * ((op) this).field_B];
                          break L4;
                        }
                        var3 = 0;
                        var4 = 0;
                        L6: while (true) {
                          if (var4 >= ((op) this).field_z) {
                            if (var3 != 0) {
                              var8.a((jm) (Object) new ow(sh.field_C, var3), (byte) 93);
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            var5 = 0;
                            L7: while (true) {
                              if (((op) this).field_B <= var5) {
                                var4++;
                                continue L6;
                              } else {
                                if (((op) this).field_a[var4][var5].a((byte) -63)) {
                                  if (((op) this).field_a[var4][var5].field_j == -1) {
                                    int incrementValue$3 = var3;
                                    var3++;
                                    sh.field_C[incrementValue$3] = new aj(var4, var5);
                                    var5++;
                                    continue L7;
                                  } else {
                                    var5++;
                                    continue L7;
                                  }
                                } else {
                                  var5++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      if (!((op) this).field_x) {
                        break L8;
                      } else {
                        if (((op) this).field_K >= 4) {
                          var3 = 0;
                          L9: while (true) {
                            if (var3 >= ((op) this).field_z) {
                              var8.a((jm) (Object) new bg(), (byte) 39);
                              break L8;
                            } else {
                              var4 = 0;
                              L10: while (true) {
                                if (((op) this).field_B <= var4) {
                                  var3++;
                                  continue L9;
                                } else {
                                  if (27 == ((op) this).field_a[var3][var4].field_n) {
                                    var8.a((jm) (Object) new tga(var3, var4), (byte) 117);
                                    var4++;
                                    continue L10;
                                  } else {
                                    var4++;
                                    continue L10;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    L11: {
                      if (!((op) this).field_l) {
                        break L11;
                      } else {
                        if (((op) this).field_F >= 3) {
                          var8.a((jm) (Object) new bja(), (byte) 114);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var8.a((op) this, false);
                    ((op) this).field_U.a((bw) (Object) var8, true);
                    this.a(var8, (byte) 73);
                    var3 = 0;
                    L12: while (true) {
                      if (var3 >= ((op) this).field_d) {
                        L13: {
                          if (((op) this).field_A > ((op) this).field_J) {
                            var3 = 0;
                            var4 = 0;
                            L14: while (true) {
                              if (var4 >= ((op) this).field_d) {
                                L15: {
                                  if (var3 >= 2) {
                                    break L15;
                                  } else {
                                    if (1 != ((op) this).field_d) {
                                      break L13;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                this.c(101);
                                this.a(var8, (byte) 73);
                                break L13;
                              } else {
                                if (!((op) this).field_S[var4].field_c) {
                                  var3++;
                                  var4++;
                                  continue L14;
                                } else {
                                  var4++;
                                  continue L14;
                                }
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                        var3 = 0;
                        L16: while (true) {
                          if (((op) this).field_d <= var3) {
                            this.d(98);
                            return var8;
                          } else {
                            L17: {
                              if (((op) this).field_T.field_n[var3] > ((op) this).field_T.field_o[var3]) {
                                ((op) this).field_T.field_o[var3] = ((op) this).field_T.field_n[var3];
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              ((op) this).field_T.field_n[var3] = 0;
                              if (((op) this).field_T.field_q[var3] >= ((op) this).field_T.field_y[var3]) {
                                break L18;
                              } else {
                                ((op) this).field_T.field_q[var3] = ((op) this).field_T.field_y[var3];
                                break L18;
                              }
                            }
                            ((op) this).field_T.field_y[var3] = 0;
                            var3++;
                            continue L16;
                          }
                        }
                      } else {
                        if (!((op) this).field_S[var3].field_c) {
                          if (((op) this).b((byte) 53, var3)) {
                            var4_ref_ej = new ej(var3);
                            var8.a((jm) (Object) var4_ref_ej, (byte) 112);
                            var4_ref_ej.a(false, (op) this);
                            var3++;
                            continue L12;
                          } else {
                            var3++;
                            continue L12;
                          }
                        } else {
                          var3++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    var4 = 0;
                    L19: while (true) {
                      if (var4 >= ((op) this).field_B) {
                        var3++;
                        continue L2;
                      } else {
                        L20: {
                          if (-1 != ((op) this).field_a[var3][var4].field_j) {
                            break L20;
                          } else {
                            L21: {
                              if (-38 == ((op) this).field_a[var3][var4].field_n) {
                                break L21;
                              } else {
                                if (35 == ((op) this).field_a[var3][var4].field_n) {
                                  break L21;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var8.a((jm) (Object) new wp(var3, var4), (byte) 93);
                            break L20;
                          }
                        }
                        if (((op) this).field_a[var3][var4].field_j == -1) {
                          if (((op) this).field_a[var3][var4].field_n == 33) {
                            var8.a((jm) (Object) new tga(var3, var4), (byte) 51);
                            var4++;
                            continue L19;
                          } else {
                            var4++;
                            continue L19;
                          }
                        } else {
                          var4++;
                          continue L19;
                        }
                      }
                    }
                  }
                }
              } else {
                var4 = 0;
                L22: while (true) {
                  if (var4 >= ((op) this).field_B) {
                    var3++;
                    continue L1;
                  } else {
                    var5_ref_wia = ((op) this).field_a[var3][var4];
                    if (var5_ref_wia.field_n == 33) {
                      L23: {
                        if (var5_ref_wia.field_j != 3) {
                          if (var5_ref_wia.field_j == 2) {
                            stackOut_32_0 = 60;
                            stackIn_33_0 = stackOut_32_0;
                            break L23;
                          } else {
                            if (1 != var5_ref_wia.field_j) {
                              if (var5_ref_wia.field_j != 0) {
                                stackOut_31_0 = 15;
                                stackIn_33_0 = stackOut_31_0;
                                break L23;
                              } else {
                                stackOut_30_0 = 30;
                                stackIn_33_0 = stackOut_30_0;
                                break L23;
                              }
                            } else {
                              stackOut_28_0 = 45;
                              stackIn_33_0 = stackOut_28_0;
                              break L23;
                            }
                          }
                        } else {
                          stackOut_25_0 = 75;
                          stackIn_33_0 = stackOut_25_0;
                          break L23;
                        }
                      }
                      var6 = stackIn_33_0;
                      this.a(var4, 3 + -var5_ref_wia.field_j, -1, var6, var3);
                      var4++;
                      continue L22;
                    } else {
                      var4++;
                      continue L22;
                    }
                  }
                }
              }
            }
          } else {
            var4 = 0;
            L24: while (true) {
              if (((op) this).field_B <= var4) {
                var3++;
                continue L0;
              } else {
                L25: {
                  if (null == ((op) this).field_a[var3][var4].field_l) {
                    break L25;
                  } else {
                    ((op) this).field_a[var3][var4].field_l.a(((op) this).field_a[var3][var4], var8, ((op) this).field_U, (byte) 121);
                    break L25;
                  }
                }
                L26: {
                  if (((op) this).field_a[var3][var4].field_n != 27) {
                    break L26;
                  } else {
                    if (((op) this).field_a[var3][var4].field_j > 3) {
                      break L26;
                    } else {
                      var8.a((jm) (Object) new fi(var3, var4), (byte) 113);
                      break L26;
                    }
                  }
                }
                if (od.field_w[((op) this).field_a[var3][var4].field_n].field_b) {
                  if (!((op) this).field_a[var3][var4].field_m) {
                    if (((op) this).field_a[var3][var4].field_j == 0) {
                      var8.a((jm) (Object) new oca(var3, var4), (byte) 60);
                      var4++;
                      continue L24;
                    } else {
                      var4++;
                      continue L24;
                    }
                  } else {
                    var4++;
                    continue L24;
                  }
                } else {
                  var4++;
                  continue L24;
                }
              }
            }
          }
        }
    }

    private final void a(lc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        aga var6 = null;
        int var7 = 0;
        ib stackIn_12_0 = null;
        ib stackIn_13_0 = null;
        ib stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ib stackOut_11_0 = null;
        ib stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ib stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (((op) this).field_d <= var3_int) {
                break L0;
              } else {
                var4 = 1;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 7) {
                    L3: {
                      stackOut_11_0 = ((op) this).field_S[var3_int];
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var4 == 0) {
                        stackOut_13_0 = (ib) (Object) stackIn_13_0;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L3;
                      } else {
                        stackOut_12_0 = (ib) (Object) stackIn_12_0;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L3;
                      }
                    }
                    L4: {
                      stackIn_14_0.field_c = stackIn_14_1 != 0;
                      if (var4 != 0) {
                        param0.a((jm) (Object) new iia(var3_int), (byte) 116);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3_int++;
                    continue L1;
                  } else {
                    L5: {
                      var6 = ((op) this).field_S[var3_int].field_b[var5];
                      if (var6 != null) {
                        if (!var6.i(75)) {
                          var4 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("op.VA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 73 + ')');
        }
    }

    private final String j(byte param0) {
        return pn.a((byte) -122, ((op) this).field_o, new String[4]);
    }

    final void a(int param0, rk[] param1, int param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        int var5 = 0;
        aga[] var6 = null;
        int var7 = 0;
        rk var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[][] var19 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            ((op) this).field_S[param2] = new ib(param2);
            var18 = new int[7];
            var16 = var18;
            var14 = var16;
            var12 = var14;
            var4_array = var12;
            var5 = 0;
            L1: while (true) {
              if (7 <= var5) {
                dk.a((Object[]) (Object) param1, (byte) 96, var18);
                var19 = ((op) this).field_L.b(param2, -36);
                var6 = ((op) this).field_S[param2].field_b;
                var7 = 0;
                L2: while (true) {
                  L3: {
                    if (var19.length <= var7) {
                      break L3;
                    } else {
                      if (var7 >= param1.length) {
                        break L3;
                      } else {
                        var8 = param1[var7];
                        if (var8 == null) {
                          break L3;
                        } else {
                          var9 = var19[var7][0];
                          var10 = var19[var7][1];
                          var6[var7] = new aga(var8, (op) this, param2, var7);
                          var6[var7].field_x = var9;
                          var6[var7].field_J = var10;
                          ((op) this).field_a[var9][var10].field_l = var6[var7];
                          ((op) this).field_S[param2].field_a = ((op) this).field_S[param2].field_a + 1;
                          var7++;
                          continue L2;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param0 == 1) {
                      break L4;
                    } else {
                      ((op) this).field_y = null;
                      break L4;
                    }
                  }
                  break L0;
                }
              } else {
                L5: {
                  if (param1[var5] != null) {
                    var4_array[var5] = -param1[var5].field_k[1];
                    break L5;
                  } else {
                    var4_array[var5] = 2147483646;
                    break L5;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("op.FC(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
    }

    final String k(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        aga var5 = null;
        int var6 = 0;
        int var7 = 0;
        rha var8 = null;
        var6 = BachelorFridge.field_y;
        var8 = new rha();
        var8.a((Object) (Object) ("gametype: " + this.j((byte) 42)), 4819);
        var8.a((Object) (Object) ("players: " + ((op) this).field_d), 4819);
        var8.a(99, 2);
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((op) this).field_d) {
            L1: {
              var8.a(102, -2);
              var8.a((Object) (Object) ("boardtype: " + this.a((byte) -83)), 4819);
              var8.a((Object) (Object) ("turnid: " + ((op) this).field_A), 4819);
              if (((op) this).field_o != 3) {
                break L1;
              } else {
                var8.a((Object) (Object) "flags:", 4819);
                var8.a(119, 2);
                var3 = 0;
                L2: while (true) {
                  if (var3 >= ((op) this).field_d) {
                    var8.a(120, -2);
                    break L1;
                  } else {
                    var8.a((Object) (Object) (((op) this).field_c[var3][0] + ", " + ((op) this).field_c[var3][1]), 4819);
                    var3++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (((op) this).field_M != -1) {
                var8.a((Object) (Object) ("winning: " + ((op) this).field_M + ": " + ((op) this).field_Q + " turns"), 4819);
                break L3;
              } else {
                break L3;
              }
            }
            var8.a((Object) (Object) ("map: " + ((op) this).field_D + " - " + ((op) this).field_z + "x" + ((op) this).field_B), 4819);
            var3 = 0;
            L4: while (true) {
              if (((op) this).field_z <= var3) {
                L5: {
                  var3 = 0;
                  if (param0 <= -60) {
                    break L5;
                  } else {
                    ((op) this).field_U = null;
                    break L5;
                  }
                }
                L6: while (true) {
                  if (var3 >= ((op) this).field_d) {
                    var8.a((Object) (Object) ("Resultant checksum: " + Integer.toHexString(((op) this).c((byte) -87))), 4819);
                    return var8.a((byte) -128);
                  } else {
                    var8.a((Object) (Object) ("player: " + ((op) this).field_y[var3]), 4819);
                    var8.a(-17, 2);
                    var7 = 0;
                    var4 = var7;
                    L7: while (true) {
                      if (var7 >= 7) {
                        var8.a(101, -2);
                        var3++;
                        continue L6;
                      } else {
                        var5 = ((op) this).field_S[var3].field_b[var7];
                        if (var5 != null) {
                          var5.a(var8, (byte) 73);
                          var7++;
                          continue L7;
                        } else {
                          var8.a((Object) (Object) (var7 + ": (empty)"), 4819);
                          var7++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                var4 = 0;
                L8: while (true) {
                  if (((op) this).field_B <= var4) {
                    var3++;
                    continue L4;
                  } else {
                    var5_int = ((op) this).field_E * 2 + ((op) this).field_L.field_o[var3][var4].field_n;
                    if (((op) this).field_a[var3][var4].a(-27864, (op) this, var5_int)) {
                      ((op) this).field_a[var3][var4].a(-128, var3, var8, (op) this, var4);
                      var4++;
                      continue L8;
                    } else {
                      var4++;
                      continue L8;
                    }
                  }
                }
              }
            }
          } else {
            if (((op) this).field_o == 3) {
              var8.a((Object) (Object) (((op) this).field_y[var3] + ": " + ((op) this).field_C[var3]), 4819);
              var3++;
              continue L0;
            } else {
              var8.a((Object) (Object) ((op) this).field_y[var3], 4819);
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (3 == ((op) this).field_o) {
          L0: {
            L1: {
              var5 = 81 / ((38 - param3) / 53);
              if (param1 != ((op) this).field_c[param0][0]) {
                break L1;
              } else {
                if (param2 != ((op) this).field_c[param0][1]) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    private final void a(lu param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((op) this).field_d) {
                break L0;
              } else {
                this.a(var4, param0, -123);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("op.K(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 113 + ')');
        }
    }

    final aga a(aga param0, byte param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        aga stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        aga stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((op) this).a((byte) 112, param0);
              if (param1 < -39) {
                break L1;
              } else {
                String discarded$2 = ((op) this).k((byte) -50);
                break L1;
              }
            }
            L2: {
              if (var3 != null) {
                var3.f(32);
                this.a(var3, true);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (aga) var3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("op.S(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    op(int param0, int param1, int param2, int param3, int param4, String[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[][] var21 = null;
        int[] var22 = null;
        wia stackIn_13_0 = null;
        wia stackIn_14_0 = null;
        wia stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        wia stackOut_12_0 = null;
        wia stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        wia stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        ((op) this).field_w = new Random();
        ((op) this).field_Q = -1;
        ((op) this).field_M = -1;
        try {
          L0: {
            ((op) this).field_G = param0;
            ((op) this).field_d = param5.length;
            ((op) this).field_k = param2;
            ((op) this).field_o = param3;
            ((op) this).field_m = param4;
            ((op) this).field_J = st.field_d[((op) this).field_m];
            ((op) this).field_y = param5;
            ((op) this).field_L = ww.a(0, ((op) this).field_d, ((op) this).field_o, ((op) this).field_k, af.field_a);
            ((op) this).field_D = ((op) this).field_L.field_g;
            if (null != ((op) this).field_L) {
              L1: {
                var7_int = 3 + ((op) this).field_d;
                if (var7_int <= 9) {
                  break L1;
                } else {
                  var7_int = 9;
                  break L1;
                }
              }
              ((op) this).field_B = ((op) this).field_L.field_q;
              ((op) this).field_E = param1;
              ((op) this).field_z = ((op) this).field_L.field_f;
              ((op) this).field_a = new wia[((op) this).field_z][((op) this).field_B];
              var8 = 0;
              L2: while (true) {
                if (((op) this).field_B <= var8) {
                  ((op) this).field_i = new int[((op) this).field_L.field_m][3];
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= ((op) this).field_L.field_m) {
                      L4: {
                        if (((op) this).field_o != 2) {
                          break L4;
                        } else {
                          var21 = ((op) this).field_i;
                          var14 = 0;
                          var9 = var14;
                          L5: while (true) {
                            if (var14 >= var21.length) {
                              break L4;
                            } else {
                              L6: {
                                L7: {
                                  var22 = var21[var14];
                                  var11 = var22[0];
                                  var12 = var22[1];
                                  if (var11 != -1) {
                                    break L7;
                                  } else {
                                    if (-1 == var12) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                ((op) this).field_a[var11][var12].field_n = 20;
                                ((op) this).field_a[var11][var12].field_a = 8;
                                var22[2] = -1;
                                break L6;
                              }
                              var14++;
                              continue L5;
                            }
                          }
                        }
                      }
                      ((op) this).field_S = new ib[((op) this).field_d];
                      var8 = 0;
                      L8: while (true) {
                        if (var8 >= ((op) this).field_d) {
                          L9: {
                            if (3 != ((op) this).field_o) {
                              break L9;
                            } else {
                              ((op) this).field_c = new int[((op) this).field_d][2];
                              var8 = 0;
                              L10: while (true) {
                                if (var8 >= ((op) this).field_d) {
                                  ((op) this).field_C = new int[((op) this).field_d];
                                  break L9;
                                } else {
                                  L11: {
                                    ((op) this).field_c[var8] = this.a(0, var8);
                                    if (((op) this).field_c[var8][0] == -1) {
                                      break L11;
                                    } else {
                                      if (((op) this).field_c[var8][1] == -1) {
                                        break L11;
                                      } else {
                                        ((op) this).field_a[((op) this).field_c[var8][0]][((op) this).field_c[var8][1]].field_n = var8 + 23;
                                        ((op) this).field_a[((op) this).field_c[var8][0]][((op) this).field_c[var8][1]].field_m = true;
                                        break L11;
                                      }
                                    }
                                  }
                                  var8++;
                                  continue L10;
                                }
                              }
                            }
                          }
                          L12: {
                            ((op) this).field_j = new sfa[((op) this).field_d][7];
                            ((op) this).field_t = new eaa[7];
                            ((op) this).field_n = new nq[7 * ((op) this).field_d];
                            ((op) this).field_g = new int[((op) this).field_d];
                            ((op) this).field_p = new vg();
                            ((op) this).field_T = new paa((op) this);
                            if (!af.field_a) {
                              break L12;
                            } else {
                              ((op) this).field_a[3][6].field_n = 39;
                              ((op) this).field_a[3][6].field_h = 20;
                              ((op) this).field_a[4][5].field_h = 20;
                              ((op) this).field_a[4][5].field_n = 39;
                              ((op) this).field_a[0][2].field_n = 39;
                              ((op) this).field_e = 3;
                              ((op) this).field_a[0][2].field_h = 20;
                              break L12;
                            }
                          }
                          break L0;
                        } else {
                          ((op) this).field_S[var8] = new ib(var8);
                          var8++;
                          continue L8;
                        }
                      }
                    } else {
                      L13: {
                        if (((op) this).field_o == 2) {
                          ((op) this).field_i[var8] = new int[3];
                          break L13;
                        } else {
                          ((op) this).field_i[var8] = new int[3];
                          break L13;
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  var9 = 0;
                  L14: while (true) {
                    if (var9 >= ((op) this).field_z) {
                      var8++;
                      continue L2;
                    } else {
                      L15: {
                        var10 = ((op) this).field_L.field_o[var9][var8].field_n;
                        if (var10 < 2) {
                          var10 = 0;
                          break L15;
                        } else {
                          var10 += 19;
                          break L15;
                        }
                      }
                      L16: {
                        ((op) this).field_a[var9][var8] = new wia(var10);
                        stackOut_12_0 = ((op) this).field_a[var9][var8];
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (((op) this).field_L.field_o[var9][var8].field_n != 1) {
                          stackOut_14_0 = (wia) (Object) stackIn_14_0;
                          stackOut_14_1 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          break L16;
                        } else {
                          stackOut_13_0 = (wia) (Object) stackIn_13_0;
                          stackOut_13_1 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          break L16;
                        }
                      }
                      L17: {
                        stackIn_15_0.field_i = stackIn_15_1 != 0;
                        if (!((op) this).field_a[var9][var8].a(false, (op) this)) {
                          break L17;
                        } else {
                          ((op) this).field_a[var9][var8].field_j = kla.a(3, ((op) this).field_w, -2147483648);
                          break L17;
                        }
                      }
                      L18: {
                        if (-1 == ((op) this).field_L.field_o[var9][var8].field_a) {
                          break L18;
                        } else {
                          if (((op) this).field_L.field_o[var9][var8].field_a >= 13) {
                            break L18;
                          } else {
                            if (!this.b(var8, 26, var9)) {
                              ((op) this).field_a[var9][var8].field_n = ((op) this).field_L.field_o[var9][var8].field_a;
                              ((op) this).field_a[var9][var8].field_a = ((op) this).field_L.field_o[var9][var8].field_a;
                              ((op) this).field_a[var9][var8].field_m = true;
                              break L18;
                            } else {
                              ((op) this).field_a[var9][var8].field_a = -1;
                              break L18;
                            }
                          }
                        }
                      }
                      var9++;
                      continue L14;
                    }
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var7;
            stackOut_51_1 = new StringBuilder().append("op.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param5 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L19;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L19;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Accept <%0> into this game";
    }
}

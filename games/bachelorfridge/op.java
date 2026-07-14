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
        L0: {
          if (-21 == (((op) this).field_a[param1.field_x][param1.field_J].field_n ^ -1)) {
            break L0;
          } else {
            ((op) this).b((byte) 123, param2, param1.field_x, param1.field_J);
            break L0;
          }
        }
        L1: {
          if (0 > -1 + param1.field_x) {
            break L1;
          } else {
            if (-21 == (((op) this).field_a[-1 + param1.field_x][param1.field_J].field_n ^ -1)) {
              break L1;
            } else {
              ((op) this).b((byte) -63, param2, -1 + param1.field_x, param1.field_J);
              break L1;
            }
          }
        }
        L2: {
          if (1 + param1.field_x >= ((op) this).field_z) {
            break L2;
          } else {
            if (20 == ((op) this).field_a[1 + param1.field_x][param1.field_J].field_n) {
              break L2;
            } else {
              ((op) this).b((byte) 91, param2, param1.field_x - -1, param1.field_J);
              break L2;
            }
          }
        }
        L3: {
          if (param0 == -25) {
            break L3;
          } else {
            boolean discarded$1 = ((op) this).a((byte) 64, -97);
            break L3;
          }
        }
        L4: {
          if ((-1 + param1.field_J ^ -1) > -1) {
            break L4;
          } else {
            if ((((op) this).field_a[param1.field_x][param1.field_J + -1].field_n ^ -1) != -21) {
              ((op) this).b((byte) -82, param2, param1.field_x, -1 + param1.field_J);
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (((op) this).field_B <= param1.field_J - -1) {
            break L5;
          } else {
            if ((((op) this).field_a[param1.field_x][param1.field_J - -1].field_n ^ -1) == -21) {
              break L5;
            } else {
              ((op) this).b((byte) 119, param2, param1.field_x, param1.field_J + 1);
              break L5;
            }
          }
        }
    }

    final int a(int param0, aga param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        wia var9 = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          if (param3 == -1) {
            break L0;
          } else {
            ((op) this).field_B = -3;
            break L0;
          }
        }
        var5 = 0;
        var6 = 1;
        L1: while (true) {
          if (param0 < var6) {
            return var5;
          } else {
            L2: {
              var7 = param1.field_x;
              var8 = param1.field_J;
              if (param2 != 2) {
                if (-5 == (param2 ^ -1)) {
                  var7 = var7 + var6;
                  break L2;
                } else {
                  if ((param2 ^ -1) != -2) {
                    if (3 == param2) {
                      var8 = var8 + var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var8 = var8 - var6;
                    break L2;
                  }
                }
              } else {
                var7 = var7 - var6;
                break L2;
              }
            }
            L3: {
              if ((var7 ^ -1) > -1) {
                break L3;
              } else {
                if (var7 >= ((op) this).field_z) {
                  break L3;
                } else {
                  if (0 > var8) {
                    break L3;
                  } else {
                    if (((op) this).field_B > var8) {
                      var9 = ((op) this).field_a[var7][var8];
                      var10 = var9.field_n;
                      if (var10 == 21) {
                        return var6;
                      } else {
                        if (param1.a(var10, false)) {
                          if (null == var9.field_l) {
                            var5 = var6;
                            var6++;
                            continue L1;
                          } else {
                            var6++;
                            continue L1;
                          }
                        } else {
                          return var6 + -1;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            return -1 + var6;
          }
        }
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
        var8 = BachelorFridge.field_y;
        if (param0 > 92) {
          L0: {
            if ((((op) this).field_o ^ -1) != -3) {
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
                      if ((var4 ^ -1) < 0) {
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
          return;
        } else {
          return;
        }
    }

    final void b(lu param0, byte param1) {
        param0.b(((op) this).field_A, -126);
        param0.d(((op) this).field_N ? 1 : 0, 0);
        int var3 = -55 / ((param1 - 85) / 37);
        param0.d(((op) this).field_M, 0);
        param0.d(((op) this).field_Q, 0);
        this.c(param0, (byte) 92);
        this.d(param0, (byte) -115);
        this.a(param0, (byte) 113);
    }

    final int b(aga param0, int param1, int param2, int param3) {
        if (param3 < 0) {
            param2 = ov.b(param2, 60);
            param3 = -param3;
        }
        if (param1 < 68) {
            return 9;
        }
        return this.a(param2, param3, param0, (byte) -44);
    }

    final void a(int param0, lu param1) {
        int var3 = 0;
        int var4 = 0;
        aga var5 = null;
        int var6 = 0;
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
          ((op) this).field_A = param1.e((byte) 91);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((param1.b(16711935) ^ -1) == param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((op) this).field_N = stackIn_3_1 != 0;
        ((op) this).field_M = param1.b(true);
        ((op) this).field_Q = param1.b(16711935);
        this.b(-1, param1);
        this.b(param1, 68);
        ((op) this).field_S = new ib[((op) this).field_d];
        var3 = 0;
        L1: while (true) {
          if (((op) this).field_d <= var3) {
            ((op) this).j(-1);
            ((op) this).g(127);
            return;
          } else {
            ((op) this).field_S[var3] = new ib(var3);
            var4 = 0;
            L2: while (true) {
              if (var4 >= 7) {
                var3++;
                continue L1;
              } else {
                var5 = ng.a((op) this, -51, param1);
                if (var5 != null) {
                  ((op) this).field_S[var3].field_b[var4] = var5;
                  ((op) this).field_S[var3].field_a = ((op) this).field_S[var3].field_a + 1;
                  var4++;
                  continue L2;
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
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
                  if ((var3 ^ -1) <= -8) {
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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wia var10 = null;
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          if (param1 >= 4) {
            break L0;
          } else {
            ((op) this).field_o = -87;
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (param2 <= var7) {
            return;
          } else {
            var8 = param0[var7][0];
            var9 = param0[var7][1];
            if ((var8 ^ -1) <= -1) {
              if (((op) this).field_z > var8) {
                if ((var9 ^ -1) <= -1) {
                  if (((op) this).field_B > var9) {
                    var10 = ((op) this).field_a[var8][var9];
                    if (-21 != (var10.field_n ^ -1)) {
                      if (22 != var10.field_n) {
                        if (var10.field_n != 21) {
                          if (23 != var10.field_n) {
                            if (var10.field_n != 24) {
                              if (25 != var10.field_n) {
                                if ((var10.field_n ^ -1) != -27) {
                                  ((op) this).b((byte) -73, param3, var8, var9);
                                  var7++;
                                  continue L1;
                                } else {
                                  var7++;
                                  continue L1;
                                }
                              } else {
                                var7++;
                                continue L1;
                              }
                            } else {
                              var7++;
                              continue L1;
                            }
                          } else {
                            var7++;
                            continue L1;
                          }
                        } else {
                          var7++;
                          continue L1;
                        }
                      } else {
                        var7++;
                        continue L1;
                      }
                    } else {
                      var7++;
                      continue L1;
                    }
                  } else {
                    var7++;
                    continue L1;
                  }
                } else {
                  var7++;
                  continue L1;
                }
              } else {
                var7++;
                continue L1;
              }
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    private final int a(int param0, int param1, aga param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        var5 = 1;
        L0: while (true) {
          if (var5 > param1) {
            L1: {
              if (param3 == -44) {
                break L1;
              } else {
                ((op) this).a(-49, -74, false);
                break L1;
              }
            }
            return param1;
          } else {
            L2: {
              var6 = param2.field_x;
              var7 = param2.field_J;
              if (-3 == param0) {
                var6 = var6 - var5;
                break L2;
              } else {
                if (4 == param0) {
                  var6 = var6 + var5;
                  break L2;
                } else {
                  if (-2 != param0) {
                    if (3 != param0) {
                      break L2;
                    } else {
                      var7 = var7 + var5;
                      break L2;
                    }
                  } else {
                    var7 = var7 - var5;
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (var6 < 0) {
                break L3;
              } else {
                if (((op) this).field_z <= var6) {
                  break L3;
                } else {
                  if ((var7 ^ -1) > -1) {
                    break L3;
                  } else {
                    if (((op) this).field_B > var7) {
                      if ((((op) this).field_a[var6][var7].field_n ^ -1) != -22) {
                        if (!((op) this).a(param2, var7, var6, (byte) 54)) {
                          return var5 - 1;
                        } else {
                          var5++;
                          continue L0;
                        }
                      } else {
                        return var5;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            return -1 + var5;
          }
        }
    }

    final void a(int param0, aj[] param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wia var8 = null;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = BachelorFridge.field_y;
          if (param3 == -36) {
            break L0;
          } else {
            var10 = null;
            int discarded$2 = this.a(-106, -64, (aga) null, (byte) 29);
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (var5 >= param0) {
            return;
          } else {
            var6 = param1[var5].field_c;
            var7 = param1[var5].field_a;
            if ((var6 ^ -1) <= -1) {
              if (((op) this).field_z > var6) {
                if (0 <= var7) {
                  if (((op) this).field_B > var7) {
                    var8 = ((op) this).field_a[var6][var7];
                    if (var8.field_n != 20) {
                      if (-23 != (var8.field_n ^ -1)) {
                        if (var8.field_n != -22) {
                          if (-24 != var8.field_n) {
                            if (24 != var8.field_n) {
                              if (25 != var8.field_n) {
                                if (-27 != (var8.field_n ^ -1)) {
                                  ((op) this).b((byte) 111, param2, var6, var7);
                                  var5++;
                                  continue L1;
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

    final boolean a(aga param0, int param1, int param2, byte param3) {
        if ((param2 ^ -1) <= -1) {
            // if_icmpgt L33
            // if_icmple L33
            // if_icmpge L33
        } else {
            return false;
        }
        if (!(param0.a(((op) this).field_a[param2][param1].field_n, false))) {
            return false;
        }
        if (param3 != 54) {
            ((op) this).field_l = true;
        }
        if (param2 == param0.field_x) {
            if (!(param0.field_J != param1)) {
                return true;
            }
        }
        if (((op) this).field_a[param2][param1].field_l == null) {
            return true;
        }
        return false;
    }

    private final cj a(sfa param0, byte param1) {
        if (param0 == null) {
            return null;
        }
        aga var6 = param0.field_h.a(29, (op) this);
        aga var7 = var6;
        if (var7 == null) {
            return null;
        }
        if (var7.i(125)) {
            return null;
        }
        ii var4 = param0.a((op) this, 3);
        var7.field_z = true;
        int var5 = ((op) this).field_T.field_w[var6.field_D];
        if (param1 != 91) {
            boolean discarded$0 = ((op) this).e(-72, 2, 10);
        }
        ((cj) (Object) var4).a((op) this, false);
        if (3 <= -var5 + ((op) this).field_T.field_w[var6.field_D]) {
            ((op) this).field_T.field_a[var6.field_D] = true;
        }
        ((op) this).field_U.a((bw) (Object) var4, true);
        return (cj) (Object) var4;
    }

    final int a(sfa[] param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        oha var5 = null;
        int var6 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          if (!param1) {
            break L0;
          } else {
            ((op) this).b(-125);
            break L0;
          }
        }
        var3 = 0;
        var4 = 0;
        L1: while (true) {
          if (var4 >= param0.length) {
            return var3;
          } else {
            if (null != param0[var4]) {
              var5 = ur.field_e[param0[var4].field_g];
              if (var5 instanceof hd) {
                var3++;
                var4++;
                continue L1;
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
                      if (-36 == (((op) this).field_a[var2][var5].field_n ^ -1)) {
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
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var13 = BachelorFridge.field_y;
          var14 = new rv();
          if (param2 == -1) {
            break L0;
          } else {
            ((op) this).field_t = null;
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (((op) this).field_d <= var7) {
            L2: {
              if (var14.field_m.e(12917)) {
                break L2;
              } else {
                var14.a((op) this, false);
                ((op) this).field_U.a((bw) (Object) var14, true);
                break L2;
              }
            }
            return;
          } else {
            if (!((op) this).field_S[var7].field_c) {
              var8 = 0;
              L3: while (true) {
                if (7 > var8) {
                  var9 = ((op) this).field_S[var7].field_b[var8];
                  if (var9 != null) {
                    if (!var9.i(101)) {
                      L4: {
                        if (var9.field_x > param4) {
                          stackOut_15_0 = var9.field_x - param4;
                          stackIn_16_0 = stackOut_15_0;
                          break L4;
                        } else {
                          stackOut_14_0 = param4 + -var9.field_x;
                          stackIn_16_0 = stackOut_14_0;
                          break L4;
                        }
                      }
                      L5: {
                        var10 = stackIn_16_0;
                        if (var9.field_J > param0) {
                          stackOut_18_0 = -param0 + var9.field_J;
                          stackIn_19_0 = stackOut_18_0;
                          break L5;
                        } else {
                          stackOut_17_0 = param0 + -var9.field_J;
                          stackIn_19_0 = stackOut_17_0;
                          break L5;
                        }
                      }
                      L6: {
                        var11 = stackIn_19_0;
                        if (var11 < var10) {
                          stackOut_21_0 = var10;
                          stackIn_22_0 = stackOut_21_0;
                          break L6;
                        } else {
                          stackOut_20_0 = var11;
                          stackIn_22_0 = stackOut_20_0;
                          break L6;
                        }
                      }
                      var12 = stackIn_22_0;
                      if (param1 >= var12) {
                        var14.a(true, (pp) (Object) new lia(new nq(var9), param3, -1));
                        var8++;
                        continue L3;
                      } else {
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
                } else {
                  var7++;
                  continue L1;
                }
              }
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, aga param1, int param2, aga param3, int param4) {
        if ((param2 ^ -1) > param4) {
            param2 = -param2;
            param0 = ov.b(param0, 60);
        }
        int var6 = this.a(param0, param2, param1, (byte) -44);
        param1.a(false, var6, param0);
        if (!param1.a(32, (byte) 103)) {
            if (!((((op) this).field_a[param1.field_x][param1.field_J].field_n ^ -1) != -22)) {
                ((op) this).field_T.field_l[param3.field_D] = ((op) this).field_T.field_l[param3.field_D] + 1;
            }
        }
        return var6 >= param2 ? true : false;
    }

    final void h(byte param0) {
        ((op) this).field_j = new sfa[((op) this).field_d][7];
        int var2 = -34 % ((-46 - param0) / 53);
    }

    private final String a(byte param0) {
        if (param0 > -46) {
            int discarded$0 = ((op) this).c((byte) 75);
        }
        return pn.a((byte) 48, ((op) this).field_E, new String[3]);
    }

    final void a(int param0, int param1, int param2, int[][] param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BachelorFridge.field_y;
        var6 = 17;
        var7 = 17;
        var8 = -1 + var6 >> 2130105281;
        var9 = -1 + var7 >> 951663681;
        var10 = 0;
        L0: while (true) {
          if (var6 <= var10) {
            L1: {
              if (param0 == 878) {
                break L1;
              } else {
                String discarded$1 = ((op) this).k((byte) -48);
                break L1;
              }
            }
            return;
          } else {
            var11 = 0;
            L2: while (true) {
              if (var7 <= var11) {
                var10++;
                continue L0;
              } else {
                if (1 == param3[var10][var11]) {
                  var12 = param2 + (var10 + -var8);
                  var13 = param1 - (-var11 + var9);
                  if (var12 >= 0) {
                    if (var12 < ((op) this).field_z) {
                      if (0 <= var13) {
                        if (((op) this).field_B > var13) {
                          ((op) this).d(-1, var13, var12);
                          var11++;
                          continue L2;
                        } else {
                          var11++;
                          continue L2;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    } else {
                      var11++;
                      continue L2;
                    }
                  } else {
                    var11++;
                    continue L2;
                  }
                } else {
                  var11++;
                  continue L2;
                }
              }
            }
          }
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
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        int var4 = 71 / ((-28 - param1) / 35);
        ((op) this).field_n = new nq[((op) this).field_d * 7];
        int var3 = param0.b(16711935);
        for (var5 = 0; var5 < var3; var5++) {
            ((op) this).field_n[var5] = qi.a(param0, (byte) 48);
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
          var2 = var2 ^ 668347 * (((op) this).field_A + 1 >> -1666068351);
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
          if (-4 != (((op) this).field_o ^ -1)) {
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
          if (0 == (((op) this).field_M ^ -1)) {
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
            if ((param1 ^ -1) > -1) {
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
              if ((var5 ^ -1) <= -8) {
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
        int var3 = 0;
        int var4 = 0;
        nq[] var5_ref_nq__ = null;
        int var5 = 0;
        int var6 = 0;
        nq var7 = null;
        int var8 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          ((op) this).j(-1);
          var3 = param0.field_g;
          var4 = 0;
          if (param1 <= -80) {
            break L0;
          } else {
            ((op) this).field_y = null;
            break L0;
          }
        }
        param0.field_g = param0.field_g + 1;
        var5_ref_nq__ = ((op) this).field_n;
        var6 = 0;
        L1: while (true) {
          if (var5_ref_nq__.length <= var6) {
            var5 = param0.field_g;
            param0.field_g = var3;
            param0.d(var4, 0);
            param0.field_g = var5;
            return;
          } else {
            var7 = var5_ref_nq__[var6];
            if (var7 != null) {
              var4++;
              er.a(var7, 110, param0);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, aga param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          var6 = 5 / ((55 - param0) / 37);
          var5 = param3.field_x;
          var7 = param3.field_J;
          if (-3 == (param2 ^ -1)) {
            var5 = var5 - param1;
            break L0;
          } else {
            if ((param2 ^ -1) != -5) {
              if (param2 != 1) {
                if ((param2 ^ -1) == -4) {
                  var7 = var7 + param1;
                  break L0;
                } else {
                  return ((op) this).a(param3, var7, var5, (byte) 54);
                }
              } else {
                var7 = var7 - param1;
                break L0;
              }
            } else {
              var5 = var5 + param1;
              break L0;
            }
          }
        }
        return ((op) this).a(param3, var7, var5, (byte) 54);
    }

    private final sfa b(int param0, int param1) {
        int var3 = -48 / ((param0 - -60) / 52);
        if ((param1 ^ -1) > -1) {
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
            if ((((op) this).field_a[param2][param3].field_n ^ -1) == -23) {
              break L0;
            } else {
              if (21 == ((op) this).field_a[param2][param3].field_n) {
                break L0;
              } else {
                if (23 == ((op) this).field_a[param2][param3].field_n) {
                  break L0;
                } else {
                  if (((op) this).field_a[param2][param3].field_n == -25) {
                    break L0;
                  } else {
                    if (-26 == ((op) this).field_a[param2][param3].field_n) {
                      break L0;
                    } else {
                      if (((op) this).field_a[param2][param3].field_n == 26) {
                        break L0;
                      } else {
                        L1: {
                          if (-2 != (param1 ^ -1)) {
                            break L1;
                          } else {
                            ((op) this).field_a[param2][param3].field_i = true;
                            param1 = 0;
                            break L1;
                          }
                        }
                        L2: {
                          ((op) this).field_a[param2][param3].field_n = param1;
                          ((op) this).field_a[param2][param3].field_a = -1;
                          ((op) this).field_a[param2][param3].field_j = 0;
                          if (!od.field_w[param1].field_c) {
                            ((op) this).field_a[param2][param3].field_m = false;
                            break L2;
                          } else {
                            ((op) this).field_a[param2][param3].field_a = param1 + -6;
                            ((op) this).field_a[param2][param3].field_m = true;
                            break L2;
                          }
                        }
                        L3: {
                          if (35 != param1) {
                            break L3;
                          } else {
                            ((op) this).field_a[param2][param3].field_j = (param2 * 11 - -(((op) this).field_A * param3)) % 3 - -3;
                            break L3;
                          }
                        }
                        L4: {
                          if (27 == param1) {
                            ((op) this).field_a[param2][param3].field_j = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (37 != param1) {
                            break L5;
                          } else {
                            ((op) this).field_a[param2][param3].field_j = (((op) this).field_A * param3 + 37 * param2) % 3 + 2;
                            break L5;
                          }
                        }
                        L6: {
                          if (33 == param1) {
                            ((op) this).field_a[param2][param3].field_j = 4;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((op) this).field_a[param2][param3].field_h = od.field_w[param1].field_e;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
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
            if (-1 < (param1 ^ -1)) {
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
        sfa var4_ref = null;
        oha var5 = null;
        int var6 = 0;
        eaa var7 = null;
        L0: {
          var6 = BachelorFridge.field_y;
          if ((((op) this).field_A & 1 ^ -1) == param0) {
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
                var4_ref = (sfa) (Object) var7.b((byte) 90);
                L3: while (true) {
                  if (var4_ref == null) {
                    var3--;
                    continue L2;
                  } else {
                    L4: {
                      var5 = al.a(120, var4_ref.field_g);
                      if (2 != var5.field_a) {
                        break L4;
                      } else {
                        if (!hl.a((byte) 121, var5.field_j)) {
                          break L4;
                        } else {
                          if (var5.field_l == var3) {
                            ((op) this).field_P.a((bw) (Object) var4_ref, true);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var4_ref = (sfa) (Object) var7.c(param0 ^ -1);
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
                if (-22 != (((op) this).field_a[param0][param1].field_n ^ -1)) {
                    if ((((op) this).field_a[param0][param1].field_n ^ -1) != -24) {
                        if (((op) this).field_a[param0][param1].field_n != 24) {
                            if (-26 != (((op) this).field_a[param0][param1].field_n ^ -1)) {
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wia var6 = null;
        int var7 = 0;
        int var8 = 0;
        lu stackIn_8_0 = null;
        lu stackIn_9_0 = null;
        lu stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        lu stackIn_11_0 = null;
        lu stackIn_12_0 = null;
        lu stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        lu stackOut_7_0 = null;
        lu stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        lu stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        lu stackOut_10_0 = null;
        lu stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        lu stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        var8 = BachelorFridge.field_y;
        param0.d(((op) this).field_D, 0);
        param0.d(((op) this).field_o, 0);
        param0.d(((op) this).field_E, 0);
        param0.d(((op) this).field_z, 0);
        var3 = -73 / ((param1 - -9) / 63);
        param0.d(((op) this).field_B, 0);
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((op) this).field_B) {
            L1: {
              if (2 != ((op) this).field_o) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (((op) this).field_i.length <= var4) {
                    break L1;
                  } else {
                    param0.d(((op) this).field_i[var4][0], 0);
                    param0.d(((op) this).field_i[var4][1], 0);
                    param0.d(((op) this).field_i[var4][2], 0);
                    var4++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (3 != ((op) this).field_o) {
                break L3;
              } else {
                var4 = 0;
                L4: while (true) {
                  if (((op) this).field_d <= var4) {
                    var4 = 0;
                    L5: while (true) {
                      if (var4 >= ((op) this).field_d) {
                        break L3;
                      } else {
                        param0.d(((op) this).field_C[var4], 0);
                        var4++;
                        continue L5;
                      }
                    }
                  } else {
                    param0.d(((op) this).field_c[var4][0], 0);
                    param0.d(((op) this).field_c[var4][1], 0);
                    var4++;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            var5 = 0;
            L6: while (true) {
              if (((op) this).field_z <= var5) {
                var4++;
                continue L0;
              } else {
                L7: {
                  var6 = ((op) this).field_a[var5][var4];
                  var7 = var6.field_n;
                  if (var6.field_i) {
                    var7 = var7 | 128;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  param0.d(var7, 0);
                  param0.d(var6.field_j, 0);
                  param0.d(var6.field_a, 0);
                  stackOut_7_0 = (lu) param0;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var6.field_m) {
                    stackOut_9_0 = (lu) (Object) stackIn_9_0;
                    stackOut_9_1 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L8;
                  } else {
                    stackOut_8_0 = (lu) (Object) stackIn_8_0;
                    stackOut_8_1 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L8;
                  }
                }
                L9: {
                  ((lu) (Object) stackIn_10_0).d(stackIn_10_1, 0);
                  param0.d(var6.field_h, 0);
                  stackOut_10_0 = (lu) param0;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var6.field_d) {
                    stackOut_12_0 = (lu) (Object) stackIn_12_0;
                    stackOut_12_1 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L9;
                  } else {
                    stackOut_11_0 = (lu) (Object) stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L9;
                  }
                }
                ((lu) (Object) stackIn_13_0).d(stackIn_13_1, 0);
                var5++;
                continue L6;
              }
            }
          }
        }
    }

    final void d(int param0, int param1, int param2) {
        if ((param2 ^ -1) <= param0) {
            if (param1 >= 0) {
                // if_icmple L30
                // if_icmple L30
            } else {
                return;
            }
            ((op) this).field_a[param2][param1].field_d = true;
            return;
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4 = -126 % ((3 - param2) / 37);
        if (param0 <= -1) {
            // if_icmpgt L40
            // if_icmpge L40
            // if_icmpge L40
        } else {
            return false;
        }
        return ju.c(23745, ((op) this).field_a[param0][param1].field_n);
    }

    private final boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        aga var4 = null;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          var2 = 0;
          if (param0 == 10) {
            break L0;
          } else {
            ((op) this).field_d = 84;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= ((op) this).field_d) {
            return true;
          } else {
            var3 = 0;
            L2: while (true) {
              if (var3 >= 7) {
                var2++;
                continue L1;
              } else {
                var4 = ((op) this).field_S[var2].field_b[var3];
                if (var4 != null) {
                  L3: {
                    if (var4 != ((op) this).field_a[var4.field_x][var4.field_J].field_l) {
                      break L3;
                    } else {
                      if (var4.i(69)) {
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (!var4.i(-115)) {
                    if (((op) this).field_a[var4.field_x][var4.field_J].field_l != var4) {
                      return false;
                    } else {
                      var3++;
                      continue L2;
                    }
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
    }

    private final void a(aga param0, boolean param1) {
        int var4 = BachelorFridge.field_y;
        int var3 = 0;
        if (!param1) {
            return;
        }
        while (((op) this).field_n.length > var3) {
            if (!(((op) this).field_n[var3] != null)) {
                ((op) this).field_n[var3] = new nq(param0);
                param0.field_v = var3;
                return;
            }
            var3++;
        }
    }

    final void b(int param0) {
        if (!(!((op) this).field_r)) {
            throw new IllegalStateException();
        }
        if (!((((op) this).field_A ^ -1) >= -1)) {
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
        int var4 = 0;
        sfa var5_ref_sfa = null;
        int var5 = 0;
        hia var7 = null;
        int var9 = 0;
        Object var10 = null;
        int var13 = 0;
        aga[] var14 = null;
        aga var15 = null;
        aga[] var16 = null;
        aga var17 = null;
        aga var17_ref = null;
        int[] var20 = null;
        int[] var21 = null;
        var9 = BachelorFridge.field_y;
        var4 = 0;
        L0: while (true) {
          if (var4 >= 7) {
            L1: {
              if (!((op) this).field_N) {
                break L1;
              } else {
                if (!((op) this).field_S[param1].a((byte) -52, 42)) {
                  break L1;
                } else {
                  var14 = ((op) this).field_S[param1].field_b;
                  var5 = 0;
                  L2: while (true) {
                    if (var14.length <= var5) {
                      break L1;
                    } else {
                      var15 = var14[var5];
                      var17 = var15;
                      var17 = var15;
                      if (var15 != null) {
                        if (!var15.i(115)) {
                          if (var15.field_y == 42) {
                            var7 = new hia(24, var15);
                            var20 = this.a(var15, 0);
                            var7.field_k = var20[1];
                            var7.field_j = var20[0];
                            ((op) this).field_j[param1][var15.field_u] = (sfa) (Object) var7;
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
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            L3: {
              if (param2 == -31) {
                break L3;
              } else {
                var10 = null;
                boolean discarded$1 = ((op) this).b((aga) null, (byte) -16);
                break L3;
              }
            }
            L4: {
              if (((op) this).field_N) {
                break L4;
              } else {
                if (!((op) this).field_S[param1].a((byte) -49, 40)) {
                  break L4;
                } else {
                  var16 = ((op) this).field_S[param1].field_b;
                  var13 = 0;
                  var5 = var13;
                  L5: while (true) {
                    if (var13 >= var16.length) {
                      break L4;
                    } else {
                      var17_ref = var16[var13];
                      if (var17_ref != null) {
                        if (!var17_ref.i(124)) {
                          if (var17_ref.field_y == 40) {
                            var7 = (hia) (Object) new gm(0, var17_ref);
                            var21 = this.a(true, var17_ref);
                            ((gm) (Object) var7).field_i = var21[0];
                            ((gm) (Object) var7).field_l = var21[1];
                            ((op) this).field_j[param1][var17_ref.field_u] = (sfa) (Object) var7;
                            var13++;
                            continue L5;
                          } else {
                            var13++;
                            continue L5;
                          }
                        } else {
                          var13++;
                          continue L5;
                        }
                      } else {
                        var13++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            return;
          } else {
            var5_ref_sfa = param0[var4];
            if (var5_ref_sfa != null) {
              ((op) this).field_j[param1][var5_ref_sfa.field_h.field_f] = var5_ref_sfa;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int[][] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wia var15 = null;
        int var16 = 0;
        var16 = BachelorFridge.field_y;
        var7 = 17;
        var8 = 17;
        var9 = var7 - 1 >> 195021953;
        var10 = var8 - 1 >> -438294079;
        var11 = param0;
        L0: while (true) {
          if (var11 >= var7) {
            return;
          } else {
            var12 = 0;
            L1: while (true) {
              if (var8 > var12) {
                L2: {
                  if (-2 == (param4[var11][var12] ^ -1)) {
                    var13 = param1 - (-var11 + var9);
                    var14 = -var10 + (var12 + param2);
                    if (-1 < (var13 ^ -1)) {
                      break L2;
                    } else {
                      if (var13 >= ((op) this).field_z) {
                        break L2;
                      } else {
                        if ((var14 ^ -1) > -1) {
                          break L2;
                        } else {
                          if (var14 >= ((op) this).field_B) {
                            break L2;
                          } else {
                            var15 = ((op) this).field_a[var13][var14];
                            if (!ju.c(23745, var15.field_n)) {
                              break L2;
                            } else {
                              if (20 == var15.field_n) {
                                break L2;
                              } else {
                                if (var15.field_n == -24) {
                                  break L2;
                                } else {
                                  if (-25 == var15.field_n) {
                                    break L2;
                                  } else {
                                    if ((var15.field_n ^ -1) == -26) {
                                      break L2;
                                    } else {
                                      if (var15.field_n == 26) {
                                        break L2;
                                      } else {
                                        L3: {
                                          if (param3) {
                                            break L3;
                                          } else {
                                            if (var15.field_l != null) {
                                              break L2;
                                            } else {
                                              break L3;
                                            }
                                          }
                                        }
                                        ((op) this).b((byte) -66, param5, var13, var14);
                                        break L2;
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
                    break L2;
                  }
                }
                var12++;
                continue L1;
              } else {
                var11++;
                continue L0;
              }
            }
          }
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = BachelorFridge.field_y;
          var2 = 0;
          if (param0 == -74) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = ((op) this).a((aga) null, -119, 102, (byte) 43);
            break L0;
          }
        }
        L1: while (true) {
          if (((op) this).field_d <= var2) {
            return;
          } else {
            var3 = 0;
            L2: while (true) {
              if (7 <= var3) {
                var2++;
                continue L1;
              } else {
                if (((op) this).field_S[var2].field_b[var3] != null) {
                  ((op) this).field_S[var2].field_b[var3].field_z = false;
                  var3++;
                  continue L2;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        if (param1 != 26) {
            return true;
        }
        int var4 = ((op) this).field_L.field_o[param2][param0].field_n - -19;
        if (23 == var4) {
            return true;
        }
        if ((var4 ^ -1) != -25) {
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
        var3 = param0;
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
                  if (-1 != param1) {
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
                  if (-2 != param1) {
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
                  if (-3 != (param1 ^ -1)) {
                    break L4;
                  } else {
                    if (((op) this).field_a[var3][var4].field_n != 25) {
                      break L4;
                    } else {
                      return new int[]{var3, var4};
                    }
                  }
                }
                if (param1 == 3) {
                  if (26 == ((op) this).field_a[var3][var4].field_n) {
                    return new int[]{var3, var4};
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
                  if (-8 >= (var7 ^ -1)) {
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
              if (-8 >= (var4 ^ -1)) {
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
        ((op) this).field_S[param2].field_b[param3] = param0;
    }

    final aga a(byte param0, aga param1) {
        int var3 = 0;
        aga var4 = null;
        aga var5 = null;
        aga var6 = null;
        aga var7 = null;
        aga var8 = null;
        if (param1 != null) {
          if ((((op) this).field_S[param1.field_D].field_a ^ -1) != -8) {
            L0: {
              L1: {
                var3 = -21 / ((16 - param0) / 55);
                var4 = null;
                if ((param1.field_x ^ -1) >= -1) {
                  break L1;
                } else {
                  if (null != ((op) this).field_a[-1 + param1.field_x][param1.field_J].field_l) {
                    break L1;
                  } else {
                    if (!((op) this).field_a[param1.field_x + -1][param1.field_J].e(-35)) {
                      break L1;
                    } else {
                      var5 = param1.b(true);
                      var5.field_s = 2;
                      var5.field_x = var5.field_x - 1;
                      break L0;
                    }
                  }
                }
              }
              L2: {
                if (-1 + ((op) this).field_z <= param1.field_x) {
                  break L2;
                } else {
                  if (((op) this).field_a[param1.field_x - -1][param1.field_J].field_l != null) {
                    break L2;
                  } else {
                    if (((op) this).field_a[param1.field_x + 1][param1.field_J].e(-126)) {
                      var8 = param1.b(true);
                      var4 = var8;
                      var8.field_x = var8.field_x + 1;
                      var8.field_s = 4;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if ((param1.field_J ^ -1) >= -1) {
                  break L3;
                } else {
                  if (null != ((op) this).field_a[param1.field_x][-1 + param1.field_J].field_l) {
                    break L3;
                  } else {
                    if (((op) this).field_a[param1.field_x][-1 + param1.field_J].e(-120)) {
                      var7 = param1.b(true);
                      var7.field_s = 1;
                      var7.field_J = var7.field_J - 1;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (param1.field_J >= -1 + ((op) this).field_B) {
                break L0;
              } else {
                if (null != ((op) this).field_a[param1.field_x][1 + param1.field_J].field_l) {
                  break L0;
                } else {
                  if (!((op) this).field_a[param1.field_x][1 + param1.field_J].e(-36)) {
                    break L0;
                  } else {
                    var6 = param1.b(true);
                    var6.field_J = var6.field_J + 1;
                    var6.field_s = 3;
                    break L0;
                  }
                }
              }
            }
            if (var4 != null) {
              ((op) this).field_S[param1.field_D].a(-20836, var4);
              ((op) this).field_a[var4.field_x][var4.field_J].field_l = var4;
              param1.d(-107);
              var4.d(3);
              return var4;
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
        int var4 = 0;
        int var5 = 0;
        if (param1 == null) {
          return false;
        } else {
          if (param0 != null) {
            if (!param1.a(((op) this).field_a[param0.field_x][param0.field_J].field_n, false)) {
              return false;
            } else {
              if (param0.a(((op) this).field_a[param1.field_x][param1.field_J].field_n, false)) {
                if (param2 == 4) {
                  var4 = param1.field_x;
                  var5 = param1.field_J;
                  param1.a(param0.field_J, param0.field_x, true);
                  param0.a(var5, var4, true);
                  return true;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    private final void a(int param0, lu param1, int param2) {
        int var4 = 0;
        aga var5 = null;
        int var6 = BachelorFridge.field_y;
        if (param2 >= -111) {
            Object var7 = null;
            int discarded$0 = this.a(-84, 118, (aga) null, (byte) 51);
        }
        for (var4 = 0; var4 < 7; var4++) {
            var5 = ((op) this).field_S[param0].field_b[var4];
            rha.a((rk) (Object) var5, param1, (byte) -118);
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (-4 == (((op) this).field_o ^ -1)) {
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
        var12 = BachelorFridge.field_y;
        if (param1 == 0) {
          var3 = param0.field_x;
          var4 = param0.field_J;
          var5 = ((t) (Object) al.a(-97, 24)).field_t;
          var6 = 1 + kla.a(4, ((op) this).field_w, -2147483648);
          var7 = var6;
          var8 = 0;
          var9 = 0;
          var10 = var5;
          L0: while (true) {
            if (4 <= var8) {
              L1: {
                if (0 != var9) {
                  break L1;
                } else {
                  var9 = 1 + kla.a(4, ((op) this).field_w, -2147483648);
                  break L1;
                }
              }
              L2: {
                if (-1 == (var10 ^ -1)) {
                  var10 = kla.a(var5, ((op) this).field_w, param1 ^ -2147483648);
                  break L2;
                } else {
                  break L2;
                }
              }
              return new int[]{var9, -1 + var10};
            } else {
              L3: {
                L4: {
                  if (var7 != 2) {
                    if (var7 == 4) {
                      var11 = 1;
                      L5: while (true) {
                        if (var5 <= var11) {
                          break L4;
                        } else {
                          if (-1 + ((op) this).field_z < var3 - -var11) {
                            break L4;
                          } else {
                            if (((op) this).field_a[var11 + var3][var4].e(-121)) {
                              if (((op) this).field_z > var11 + var3) {
                                if (null != ((op) this).field_a[var3 - -var11][var4].field_l) {
                                  if (var11 < var10) {
                                    var9 = 4;
                                    var10 = var11;
                                    break L4;
                                  } else {
                                    var11++;
                                    continue L5;
                                  }
                                } else {
                                  var11++;
                                  continue L5;
                                }
                              } else {
                                var11++;
                                continue L5;
                              }
                            } else {
                              var7++;
                              if ((var7 ^ -1) == -6) {
                                break L3;
                              } else {
                                var8++;
                                continue L0;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if ((var7 ^ -1) == -2) {
                        var11 = 1;
                        L6: while (true) {
                          if (var11 >= var5) {
                            break L4;
                          } else {
                            if (0 > var4 + -var11) {
                              break L4;
                            } else {
                              if (((op) this).field_a[var3][var4 - var11].e(-106)) {
                                if (-1 >= (-var11 + var4 ^ -1)) {
                                  if (((op) this).field_a[var3][-var11 + var4].field_l != null) {
                                    if (var11 < var10) {
                                      var10 = var11;
                                      var9 = 1;
                                      break L4;
                                    } else {
                                      var11++;
                                      continue L6;
                                    }
                                  } else {
                                    var11++;
                                    continue L6;
                                  }
                                } else {
                                  var11++;
                                  continue L6;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      } else {
                        if ((var7 ^ -1) == -4) {
                          var11 = 1;
                          L7: while (true) {
                            if (var5 <= var11) {
                              break L4;
                            } else {
                              if (-1 + ((op) this).field_B < var11 + var4) {
                                break L4;
                              } else {
                                if (!((op) this).field_a[var3][var4 - -var11].e(-31)) {
                                  break L4;
                                } else {
                                  if (((op) this).field_B > var4 + var11) {
                                    if (null != ((op) this).field_a[var3][var11 + var4].field_l) {
                                      if (var11 < var10) {
                                        var9 = 3;
                                        var10 = var11;
                                        break L4;
                                      } else {
                                        var11++;
                                        continue L7;
                                      }
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
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    var11 = 1;
                    L8: while (true) {
                      if (var11 >= var5) {
                        break L4;
                      } else {
                        if (-var11 + var3 < 0) {
                          break L4;
                        } else {
                          if (((op) this).field_a[-var11 + var3][var4].e(-84)) {
                            if (-var11 + var3 >= 0) {
                              if (((op) this).field_a[-var11 + var3][var4].field_l != null) {
                                if (var10 > var11) {
                                  var10 = var11;
                                  var9 = 2;
                                  break L4;
                                } else {
                                  var11++;
                                  continue L8;
                                }
                              } else {
                                var11++;
                                continue L8;
                              }
                            } else {
                              var11++;
                              continue L8;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                var7++;
                if ((var7 ^ -1) == -6) {
                  break L3;
                } else {
                  var8++;
                  continue L0;
                }
              }
              var7 = 1;
              var8++;
              continue L0;
            }
          }
        } else {
          return null;
        }
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
        aga var8_ref = null;
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
        var2 = 50 + 25 * (((op) this).field_A + -((op) this).field_J >> -444969855);
        var3 = 0;
        L1: while (true) {
          if (var3 >= ((op) this).field_d) {
            return;
          } else {
            var4 = 0;
            var5 = 0;
            L2: while (true) {
              if (-8 >= (var5 ^ -1)) {
                if (-1 != var4) {
                  var5 = var2 / var4;
                  var6 = var2 % var4;
                  var7 = 0;
                  L3: while (true) {
                    if (-8 > var7) {
                      var8_ref = ((op) this).field_S[var3].field_b[var7];
                      if (var8_ref != null) {
                        if (!var8_ref.i(-120)) {
                          L4: {
                            var9 = var5;
                            var6--;
                            if (-1 >= (var6 ^ -1)) {
                              var9++;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var10 = new rv();
                          var10.a(true, (pp) (Object) new qq(new nq(var8_ref), -1, var9));
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
        int var7 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          if (param4 <= -70) {
            break L0;
          } else {
            ((op) this).field_w = null;
            break L0;
          }
        }
        L1: {
          if ((param3 ^ -1) == -3) {
            ((op) this).b((byte) -65, param2, -param0 + param1.field_x, param1.field_J);
            break L1;
          } else {
            if ((param3 ^ -1) != -5) {
              if (param3 != 1) {
                if (param3 == 3) {
                  ((op) this).b((byte) -45, param2, param1.field_x, param0 + param1.field_J);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ((op) this).b((byte) 62, param2, param1.field_x, param1.field_J - param0);
                break L1;
              }
            } else {
              ((op) this).b((byte) 50, param2, param1.field_x + param0, param1.field_J);
              break L1;
            }
          }
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
        if (param0 != 103) {
            ((op) this).field_t = null;
        }
    }

    private final void b(int param0, lu param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        wia stackIn_13_0 = null;
        wia stackIn_14_0 = null;
        wia stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        wia stackIn_18_0 = null;
        wia stackIn_19_0 = null;
        wia stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        wia stackIn_24_0 = null;
        wia stackIn_25_0 = null;
        wia stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        wia stackOut_12_0 = null;
        wia stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        wia stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        wia stackOut_17_0 = null;
        wia stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        wia stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        wia stackOut_23_0 = null;
        wia stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        wia stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        var8 = BachelorFridge.field_y;
        ((op) this).field_D = param1.b(16711935);
        ((op) this).field_L = rs.field_g[((op) this).field_D];
        ((op) this).field_o = param1.b(16711935);
        ((op) this).field_E = param1.b(param0 + 16711936);
        ((op) this).field_z = param1.b(16711935);
        ((op) this).field_B = param1.b(16711935);
        ((op) this).field_a = new wia[((op) this).field_z][((op) this).field_B];
        ((op) this).field_i = new int[((op) this).field_L.field_m][3];
        if (param0 == -1) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((op) this).field_i.length) {
              L1: {
                var3 = 3 + ((op) this).field_d;
                if (var3 > 9) {
                  var3 = 9;
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = 0;
              var5 = 0;
              L2: while (true) {
                if (((op) this).field_B <= var5) {
                  L3: {
                    if ((((op) this).field_o ^ -1) != -3) {
                      break L3;
                    } else {
                      ((op) this).field_i = new int[((op) this).field_L.field_m][3];
                      var5 = 0;
                      L4: while (true) {
                        if (((op) this).field_i.length <= var5) {
                          break L3;
                        } else {
                          ((op) this).field_i[var5] = new int[3];
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  }
                  L5: {
                    if ((((op) this).field_o ^ -1) == -4) {
                      ((op) this).field_c = new int[((op) this).field_d][0];
                      var5 = 0;
                      L6: while (true) {
                        if (((op) this).field_d <= var5) {
                          ((op) this).field_C = new int[((op) this).field_d];
                          var5 = 0;
                          L7: while (true) {
                            if (((op) this).field_d <= var5) {
                              break L5;
                            } else {
                              ((op) this).field_C[var5] = param1.b(16711935);
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          ((op) this).field_c[var5] = new int[2];
                          var5++;
                          continue L6;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  return;
                } else {
                  var6 = 0;
                  L8: while (true) {
                    if (((op) this).field_z <= var6) {
                      var5++;
                      continue L2;
                    } else {
                      L9: {
                        var7 = param1.b(16711935);
                        ((op) this).field_a[var6][var5] = new wia(dda.a(var7, 127));
                        stackOut_12_0 = ((op) this).field_a[var6][var5];
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if ((var7 & 128) == 0) {
                          stackOut_14_0 = (wia) (Object) stackIn_14_0;
                          stackOut_14_1 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          break L9;
                        } else {
                          stackOut_13_0 = (wia) (Object) stackIn_13_0;
                          stackOut_13_1 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          break L9;
                        }
                      }
                      L10: {
                        ((wia) (Object) stackIn_15_0).field_i = stackIn_15_1 != 0;
                        ((op) this).field_a[var6][var5].field_j = param1.b(16711935);
                        if (((op) this).field_a[var6][var5].field_j != 255) {
                          break L10;
                        } else {
                          ((op) this).field_a[var6][var5].field_j = -1;
                          break L10;
                        }
                      }
                      L11: {
                        ((op) this).field_a[var6][var5].field_a = param1.b(true);
                        stackOut_17_0 = ((op) this).field_a[var6][var5];
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (1 == param1.b(16711935)) {
                          stackOut_19_0 = (wia) (Object) stackIn_19_0;
                          stackOut_19_1 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L11;
                        } else {
                          stackOut_18_0 = (wia) (Object) stackIn_18_0;
                          stackOut_18_1 = 0;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L11;
                        }
                      }
                      L12: {
                        ((wia) (Object) stackIn_20_0).field_m = stackIn_20_1 != 0;
                        if (-21 == (((op) this).field_a[var6][var5].field_n ^ -1)) {
                          ((op) this).field_i[var4][0] = var6;
                          ((op) this).field_i[var4][1] = var5;
                          ((op) this).field_i[var4][2] = -1;
                          var4++;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        ((op) this).field_a[var6][var5].field_h = param1.b(param0 + 16711936);
                        stackOut_23_0 = ((op) this).field_a[var6][var5];
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (1 != param1.b(16711935)) {
                          stackOut_25_0 = (wia) (Object) stackIn_25_0;
                          stackOut_25_1 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          break L13;
                        } else {
                          stackOut_24_0 = (wia) (Object) stackIn_24_0;
                          stackOut_24_1 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          break L13;
                        }
                      }
                      ((wia) (Object) stackIn_26_0).field_d = stackIn_26_1 != 0;
                      var6++;
                      continue L8;
                    }
                  }
                }
              }
            } else {
              ((op) this).field_i[var3] = new int[3];
              var3++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final boolean b(aga param0, byte param1) {
        if (param1 < 113) {
            Object var4 = null;
            ((op) this).a(2, (aj[]) null, 108, (byte) -104);
        }
        if (-1 != (param0.field_D ^ -1)) {
            if (1 != param0.field_D) {
                if (param0.field_D == 2) {
                    return param0.i(25, 124);
                }
                if (3 != param0.field_D) {
                    return false;
                }
                return param0.i(26, 122);
            }
            return param0.i(24, 126);
        }
        return param0.i(23, 116);
    }

    final void a(int param0, boolean param1, lu param2) {
        cj var5 = null;
        int var6 = BachelorFridge.field_y;
        int var4 = param2.field_g + param0;
        this.b(param2, -69);
        ((op) this).field_O = param2.b(16711935);
        ((op) this).field_U = new eaa();
        while (var4 > param2.field_g) {
            var5 = tma.a(param2, (byte) -50);
            var5.field_j = param2.f(-98);
            ((op) this).field_U.a((bw) (Object) var5, true);
        }
        if (!param1) {
            ((op) this).field_m = -104;
        }
    }

    final int b(boolean param0, int param1) {
        if (23 == param1) {
          return 0;
        } else {
          if (param1 != -25) {
            if (25 == param1) {
              return 2;
            } else {
              if (-27 != param1) {
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
        var12 = BachelorFridge.field_y;
        var3 = param1.field_x;
        var4 = param1.field_J;
        var5 = param1.f((byte) 123);
        var6 = kla.a(4, ((op) this).field_w, -2147483648) + 1;
        if (param0) {
          var7 = var6;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          L0: while (true) {
            if (var8 >= 4) {
              L1: {
                if (var9 == 0) {
                  var9 = 1 + kla.a(4, ((op) this).field_w, -2147483648);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var10 != 0) {
                  break L2;
                } else {
                  var10 = kla.a(var5, ((op) this).field_w, -2147483648);
                  break L2;
                }
              }
              return new int[]{var9, var10};
            } else {
              L3: {
                if (var7 == 2) {
                  var11 = 1;
                  L4: while (true) {
                    if (var11 >= var5) {
                      break L3;
                    } else {
                      if ((var3 - var11 ^ -1) > -1) {
                        break L3;
                      } else {
                        if (((op) this).field_a[-var11 + var3][var4].e(-110)) {
                          if (-1 >= (-var11 + var3 ^ -1)) {
                            if (((op) this).field_a[-var11 + var3][var4].field_l == null) {
                              if (var11 > var10) {
                                var10 = var11;
                                var9 = 2;
                                var11++;
                                continue L4;
                              } else {
                                var11++;
                                continue L4;
                              }
                            } else {
                              var11++;
                              continue L4;
                            }
                          } else {
                            var11++;
                            continue L4;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  if ((var7 ^ -1) != -5) {
                    if (1 == var7) {
                      var11 = 1;
                      L5: while (true) {
                        if (var11 >= var5) {
                          break L3;
                        } else {
                          if (0 > var4 - var11) {
                            break L3;
                          } else {
                            if (((op) this).field_a[var3][var4 + -var11].e(-88)) {
                              if (var4 + -var11 >= 0) {
                                if (((op) this).field_a[var3][var4 - var11].field_l == null) {
                                  if (var10 < var11) {
                                    var9 = 1;
                                    var10 = var11;
                                    var11++;
                                    continue L5;
                                  } else {
                                    var11++;
                                    continue L5;
                                  }
                                } else {
                                  var11++;
                                  continue L5;
                                }
                              } else {
                                var11++;
                                continue L5;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    } else {
                      if (-4 != (var7 ^ -1)) {
                        break L3;
                      } else {
                        var11 = 1;
                        L6: while (true) {
                          if (var5 <= var11) {
                            break L3;
                          } else {
                            if (((op) this).field_B + -1 < var11 + var4) {
                              break L3;
                            } else {
                              if (((op) this).field_a[var3][var11 + var4].e(-35)) {
                                if (((op) this).field_B > var11 + var4) {
                                  if (null == ((op) this).field_a[var3][var11 + var4].field_l) {
                                    if (var10 < var11) {
                                      var9 = 3;
                                      var10 = var11;
                                      var11++;
                                      continue L6;
                                    } else {
                                      var11++;
                                      continue L6;
                                    }
                                  } else {
                                    var11++;
                                    continue L6;
                                  }
                                } else {
                                  var11++;
                                  continue L6;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var11 = 1;
                    L7: while (true) {
                      if (var11 >= var5) {
                        break L3;
                      } else {
                        if (var3 + var11 > ((op) this).field_z + -1) {
                          break L3;
                        } else {
                          if (!((op) this).field_a[var11 + var3][var4].e(-80)) {
                            break L3;
                          } else {
                            if (var3 + var11 < ((op) this).field_z) {
                              if (null == ((op) this).field_a[var11 + var3][var4].field_l) {
                                if (var10 < var11) {
                                  var10 = var11;
                                  var9 = 4;
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
                            } else {
                              var11++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              var7++;
              if ((var7 ^ -1) == -6) {
                var7 = 1;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(lu param0, int param1) {
        int var4 = BachelorFridge.field_y;
        if (param1 != -1) {
            ((op) this).d(52, -96, -42);
        }
        this.d(param0, (byte) -116);
        param0.d(((op) this).field_O, 0);
        cj var3 = (cj) (Object) ((op) this).field_U.b((byte) 90);
        while (var3 != null) {
            nca.a(101, param0, var3);
            param0.e(var3.field_j, -1615464796);
            var3 = (cj) (Object) ((op) this).field_U.c(param1 ^ -1);
        }
    }

    final int b(byte param0, aga param1) {
        L0: {
          if (param0 >= 44) {
            break L0;
          } else {
            ((op) this).field_n = null;
            break L0;
          }
        }
        L1: {
          if (!param1.g((byte) 85)) {
            break L1;
          } else {
            if (param1.field_y == 24) {
              return 0;
            } else {
              if (-26 != (param1.field_y ^ -1)) {
                if (26 == param1.field_y) {
                  return 2;
                } else {
                  if (param1.field_y == 27) {
                    return 3;
                  } else {
                    break L1;
                  }
                }
              } else {
                return 1;
              }
            }
          }
        }
        return -1;
    }

    private final lc e(int param0) {
        int var3 = 0;
        int var4 = 0;
        ej var4_ref = null;
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
        boolean discarded$1 = this.b((byte) 10);
        ((op) this).i((byte) 56);
        ((op) this).i(0);
        ((op) this).j(-1);
        var8 = new lc();
        ((op) this).a(23189);
        var3 = param0;
        L0: while (true) {
          if (var3 >= ((op) this).field_z) {
            var3 = 0;
            L1: while (true) {
              if (((op) this).field_z <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (((op) this).field_z <= var3) {
                    L3: {
                      if (-3 != (((op) this).field_E ^ -1)) {
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
                                  if ((((op) this).field_a[var4][var5].field_j ^ -1) == 0) {
                                    var3++;
                                    sh.field_C[var3] = new aj(var4, var5);
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
                                  if ((var3 ^ -1) <= -3) {
                                    break L15;
                                  } else {
                                    if (1 != ((op) this).field_d) {
                                      break L13;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                this.c(param0 ^ 101);
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
                            var4_ref = new ej(var3);
                            var8.a((jm) (Object) var4_ref, (byte) 112);
                            var4_ref.a(false, (op) this);
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
                        if ((var5_ref_wia.field_j ^ -1) != -4) {
                          if (var5_ref_wia.field_j == 2) {
                            stackOut_32_0 = 60;
                            stackIn_33_0 = stackOut_32_0;
                            break L23;
                          } else {
                            if (1 != var5_ref_wia.field_j) {
                              if (-1 != (var5_ref_wia.field_j ^ -1)) {
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
                  if ((((op) this).field_a[var3][var4].field_n ^ -1) != -28) {
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
                    if (-1 == (((op) this).field_a[var3][var4].field_j ^ -1)) {
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aga var6 = null;
        int var7 = 0;
        ib stackIn_11_0 = null;
        ib stackIn_12_0 = null;
        ib stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ib stackOut_10_0 = null;
        ib stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ib stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          var3 = 0;
          if (param1 == 73) {
            break L0;
          } else {
            ((op) this).field_Q = 29;
            break L0;
          }
        }
        L1: while (true) {
          if (((op) this).field_d <= var3) {
            return;
          } else {
            var4 = 1;
            var5 = 0;
            L2: while (true) {
              if (-8 >= (var5 ^ -1)) {
                L3: {
                  stackOut_10_0 = ((op) this).field_S[var3];
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var4 == 0) {
                    stackOut_12_0 = (ib) (Object) stackIn_12_0;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L3;
                  } else {
                    stackOut_11_0 = (ib) (Object) stackIn_11_0;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L3;
                  }
                }
                ((ib) (Object) stackIn_13_0).field_c = stackIn_13_1 != 0;
                if (var4 != 0) {
                  param0.a((jm) (Object) new iia(var3), (byte) 116);
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var6 = ((op) this).field_S[var3].field_b[var5];
                if (var6 != null) {
                  if (!var6.i(75)) {
                    var4 = 0;
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

    private final String j(byte param0) {
        if (param0 != 42) {
            return null;
        }
        return pn.a((byte) -122, ((op) this).field_o, new String[4]);
    }

    final void a(int param0, rk[] param1, int param2) {
        int[] var4 = null;
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
        var11 = BachelorFridge.field_y;
        ((op) this).field_S[param2] = new ib(param2);
        var18 = new int[7];
        var16 = var18;
        var14 = var16;
        var12 = var14;
        var4 = var12;
        var5 = 0;
        L0: while (true) {
          if (7 <= var5) {
            dk.a((Object[]) (Object) param1, (byte) 96, var18);
            var19 = ((op) this).field_L.b(param2, -36);
            var6 = ((op) this).field_S[param2].field_b;
            var7 = 0;
            L1: while (true) {
              L2: {
                if (var19.length <= var7) {
                  break L2;
                } else {
                  if (var7 >= param1.length) {
                    break L2;
                  } else {
                    var8 = param1[var7];
                    if (var8 == null) {
                      break L2;
                    } else {
                      var9 = var19[var7][0];
                      var10 = var19[var7][1];
                      var6[var7] = new aga(var8, (op) this, param2, var7);
                      var6[var7].field_x = var9;
                      var6[var7].field_J = var10;
                      ((op) this).field_a[var9][var10].field_l = var6[var7];
                      ((op) this).field_S[param2].field_a = ((op) this).field_S[param2].field_a + 1;
                      var7++;
                      continue L1;
                    }
                  }
                }
              }
              L3: {
                if (param0 == 1) {
                  break L3;
                } else {
                  ((op) this).field_y = null;
                  break L3;
                }
              }
              return;
            }
          } else {
            if (param1[var5] != null) {
              var4[var5] = -param1[var5].field_k[1];
              var5++;
              continue L0;
            } else {
              var4[var5] = 2147483646;
              var5++;
              continue L0;
            }
          }
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
              if (-4 != (((op) this).field_o ^ -1)) {
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
            if (-4 == (((op) this).field_o ^ -1)) {
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
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        int var3 = 40 % ((61 - param1) / 45);
        for (var4 = 0; var4 < ((op) this).field_d; var4++) {
            this.a(var4, param0, -123);
        }
    }

    final aga a(aga param0, byte param1) {
        aga var3 = ((op) this).a((byte) 112, param0);
        if (param1 >= -39) {
            String discarded$0 = ((op) this).k((byte) -50);
        }
        if (!(var3 == null)) {
            var3.f(32);
            this.a(var3, true);
        }
        return var3;
    }

    op(int param0, int param1, int param2, int param3, int param4, String[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[][] var21 = null;
        int[] var22 = null;
        wia stackIn_12_0 = null;
        wia stackIn_13_0 = null;
        wia stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        wia stackOut_11_0 = null;
        wia stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        wia stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ((op) this).field_w = new Random();
        ((op) this).field_Q = -1;
        ((op) this).field_M = -1;
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
          L0: {
            var7 = 3 + ((op) this).field_d;
            if ((var7 ^ -1) >= -10) {
              break L0;
            } else {
              var7 = 9;
              break L0;
            }
          }
          ((op) this).field_B = ((op) this).field_L.field_q;
          ((op) this).field_E = param1;
          ((op) this).field_z = ((op) this).field_L.field_f;
          ((op) this).field_a = new wia[((op) this).field_z][((op) this).field_B];
          var8 = 0;
          L1: while (true) {
            if (((op) this).field_B <= var8) {
              ((op) this).field_i = new int[((op) this).field_L.field_m][3];
              var8 = 0;
              L2: while (true) {
                if (var8 >= ((op) this).field_L.field_m) {
                  L3: {
                    if ((((op) this).field_o ^ -1) != -3) {
                      break L3;
                    } else {
                      var21 = ((op) this).field_i;
                      var14 = 0;
                      var9 = var14;
                      L4: while (true) {
                        if (var14 >= var21.length) {
                          break L3;
                        } else {
                          L5: {
                            var22 = var21[var14];
                            var11 = var22[0];
                            var12 = var22[1];
                            if (var11 != -1) {
                              break L5;
                            } else {
                              if (-1 != var12) {
                                break L5;
                              } else {
                                var14++;
                                continue L4;
                              }
                            }
                          }
                          ((op) this).field_a[var11][var12].field_n = 20;
                          ((op) this).field_a[var11][var12].field_a = 8;
                          var22[2] = -1;
                          var14++;
                          continue L4;
                        }
                      }
                    }
                  }
                  ((op) this).field_S = new ib[((op) this).field_d];
                  var8 = 0;
                  L6: while (true) {
                    if (var8 >= ((op) this).field_d) {
                      L7: {
                        if (3 != ((op) this).field_o) {
                          break L7;
                        } else {
                          ((op) this).field_c = new int[((op) this).field_d][2];
                          var8 = 0;
                          L8: while (true) {
                            if (var8 >= ((op) this).field_d) {
                              ((op) this).field_C = new int[((op) this).field_d];
                              break L7;
                            } else {
                              ((op) this).field_c[var8] = this.a(0, var8);
                              if ((((op) this).field_c[var8][0] ^ -1) != 0) {
                                if ((((op) this).field_c[var8][1] ^ -1) != 0) {
                                  ((op) this).field_a[((op) this).field_c[var8][0]][((op) this).field_c[var8][1]].field_n = var8 + 23;
                                  ((op) this).field_a[((op) this).field_c[var8][0]][((op) this).field_c[var8][1]].field_m = true;
                                  var8++;
                                  continue L8;
                                } else {
                                  var8++;
                                  continue L8;
                                }
                              } else {
                                var8++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                      L9: {
                        ((op) this).field_j = new sfa[((op) this).field_d][7];
                        ((op) this).field_t = new eaa[7];
                        ((op) this).field_n = new nq[7 * ((op) this).field_d];
                        ((op) this).field_g = new int[((op) this).field_d];
                        ((op) this).field_p = new vg();
                        ((op) this).field_T = new paa((op) this);
                        if (!af.field_a) {
                          break L9;
                        } else {
                          ((op) this).field_a[3][6].field_n = 39;
                          ((op) this).field_a[3][6].field_h = 20;
                          ((op) this).field_a[4][5].field_h = 20;
                          ((op) this).field_a[4][5].field_n = 39;
                          ((op) this).field_a[0][2].field_n = 39;
                          ((op) this).field_e = 3;
                          ((op) this).field_a[0][2].field_h = 20;
                          break L9;
                        }
                      }
                    } else {
                      ((op) this).field_S[var8] = new ib(var8);
                      var8++;
                      continue L6;
                    }
                  }
                } else {
                  if (((op) this).field_o == 2) {
                    ((op) this).field_i[var8] = new int[3];
                    var8++;
                    continue L2;
                  } else {
                    ((op) this).field_i[var8] = new int[3];
                    var8++;
                    continue L2;
                  }
                }
              }
            } else {
              var9 = 0;
              L10: while (true) {
                if (var9 >= ((op) this).field_z) {
                  var8++;
                  continue L1;
                } else {
                  L11: {
                    var10 = ((op) this).field_L.field_o[var9][var8].field_n;
                    if (var10 < 2) {
                      var10 = 0;
                      break L11;
                    } else {
                      var10 += 19;
                      break L11;
                    }
                  }
                  L12: {
                    ((op) this).field_a[var9][var8] = new wia(var10);
                    stackOut_11_0 = ((op) this).field_a[var9][var8];
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (((op) this).field_L.field_o[var9][var8].field_n != 1) {
                      stackOut_13_0 = (wia) (Object) stackIn_13_0;
                      stackOut_13_1 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L12;
                    } else {
                      stackOut_12_0 = (wia) (Object) stackIn_12_0;
                      stackOut_12_1 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L12;
                    }
                  }
                  L13: {
                    ((wia) (Object) stackIn_14_0).field_i = stackIn_14_1 != 0;
                    if (!((op) this).field_a[var9][var8].a(false, (op) this)) {
                      break L13;
                    } else {
                      ((op) this).field_a[var9][var8].field_j = kla.a(3, ((op) this).field_w, -2147483648);
                      break L13;
                    }
                  }
                  if (-1 != ((op) this).field_L.field_o[var9][var8].field_a) {
                    if (((op) this).field_L.field_o[var9][var8].field_a < 13) {
                      if (!this.b(var8, 26, var9)) {
                        ((op) this).field_a[var9][var8].field_n = ((op) this).field_L.field_o[var9][var8].field_a;
                        ((op) this).field_a[var9][var8].field_a = ((op) this).field_L.field_o[var9][var8].field_a;
                        ((op) this).field_a[var9][var8].field_m = true;
                        var9++;
                        continue L10;
                      } else {
                        ((op) this).field_a[var9][var8].field_a = -1;
                        var9++;
                        continue L10;
                      }
                    } else {
                      var9++;
                      continue L10;
                    }
                  } else {
                    var9++;
                    continue L10;
                  }
                }
              }
            }
          }
        } else {
          throw new RuntimeException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Accept <%0> into this game";
    }
}

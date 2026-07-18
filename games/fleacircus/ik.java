/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ik extends wi {
    int field_S;
    boolean[] field_t;
    int field_r;
    private dd field_y;
    private int field_I;
    private boolean field_L;
    private dd field_q;
    static double field_G;
    int field_s;
    String[] field_z;
    private int field_B;
    int field_x;
    int field_Q;
    int field_u;
    private int field_v;
    int field_w;
    fa field_D;
    private int field_P;
    private boolean field_A;
    int field_H;
    private String field_M;
    boolean field_J;
    int field_O;
    int field_F;
    static boolean field_R;
    static String field_C;
    private dd field_K;
    private dd field_E;
    private int field_N;

    final static pd a(sf param0, byte param1) {
        RuntimeException var2 = null;
        pd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        pd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = sg.a((byte) 20, ie.a(param0, 100, 96));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ik.F(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -84 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, byte param1) {
        vh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 110) {
                break L1;
              } else {
                ik.a(-105, (byte) 117);
                break L1;
              }
            }
            var2 = (vh) (Object) al.field_e.c((byte) 47);
            L2: while (true) {
              if (var2 == null) {
                break L0;
              } else {
                fleas.a(param0, var2, param1 ^ 108);
                var2 = (vh) (Object) al.field_e.b((byte) -105);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "ik.B(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        L0: {
          if (param1 >= 94) {
            break L0;
          } else {
            field_R = false;
            break L0;
          }
        }
        if (param0 >= 0) {
          if (((ik) this).field_t.length <= param0) {
            return false;
          } else {
            return ((ik) this).field_t[param0];
          }
        } else {
          return false;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        String var5_ref_String = null;
        int var6 = 0;
        dd var7 = null;
        dd var8 = null;
        int var9 = 0;
        int stackIn_9_0 = 0;
        String stackIn_15_0 = null;
        int stackIn_18_0 = 0;
        float stackIn_23_0 = 0.0f;
        float stackIn_24_0 = 0.0f;
        float stackIn_25_0 = 0.0f;
        int stackIn_25_1 = 0;
        dd stackIn_30_0 = null;
        dd stackIn_33_0 = null;
        float stackOut_22_0 = 0.0f;
        float stackOut_24_0 = 0.0f;
        int stackOut_24_1 = 0;
        float stackOut_23_0 = 0.0f;
        int stackOut_23_1 = 0;
        dd stackOut_29_0 = null;
        dd stackOut_28_0 = null;
        dd stackOut_32_0 = null;
        dd stackOut_31_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        String stackOut_13_0 = null;
        String stackOut_14_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var9 = fleas.field_A ? 1 : 0;
        gb.a(ia.field_q);
        gb.a(((ik) this).field_l, ((ik) this).field_a + ((ik) this).field_D.field_N, ((ik) this).field_l - (-((ik) this).field_n + ((ik) this).field_P), ((ik) this).field_a + ((ik) this).field_d);
        var2 = ((ik) this).field_D.field_N + ((ik) this).field_a;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (((ik) this).field_z.length > var3) {
              break L1;
            } else {
              if (((ik) this).field_a - -((ik) this).field_d < var2) {
                L2: {
                  gb.b(ia.field_q);
                  var3 = -((ik) this).field_P + ((ik) this).field_l + ((ik) this).field_n;
                  var4 = ((ik) this).field_D.field_N + ((ik) this).field_a;
                  gb.g(var3, var4, ((ik) this).field_P, ((ik) this).field_d - ((ik) this).field_D.field_N, ((ik) this).field_s & k.field_a, ((ik) this).field_s >>> ii.field_b);
                  gb.g(var3, var4, ((ik) this).field_P, ((ik) this).field_P, k.field_a & ((ik) this).field_s, ((ik) this).field_s >>> ii.field_b);
                  if (null == ((ik) this).field_q) {
                    break L2;
                  } else {
                    ((ik) this).field_q.d(var3, var4, ((ik) this).field_P, ((ik) this).field_d + -((ik) this).field_D.field_N);
                    break L2;
                  }
                }
                L3: {
                  gb.g(var3, ((ik) this).field_a - (-((ik) this).field_d - -((ik) this).field_P), ((ik) this).field_P, ((ik) this).field_P, k.field_a & ((ik) this).field_s, ((ik) this).field_s >>> ii.field_b);
                  var5 = (float)((ik) this).field_x / (float)(-1 + ((ik) this).field_z.length);
                  stackOut_22_0 = (float)((ik) this).field_P;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (null != ((ik) this).field_K) {
                    stackOut_24_0 = stackIn_24_0;
                    stackOut_24_1 = 2 * ((ik) this).field_K.field_r;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    break L3;
                  } else {
                    stackOut_23_0 = stackIn_23_0;
                    stackOut_23_1 = ((ik) this).field_P;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    break L3;
                  }
                }
                L4: {
                  var6 = (int)(stackIn_25_0 + (float)(-stackIn_25_1 - 2 * ((ik) this).field_P + (((ik) this).field_d + -((ik) this).field_D.field_N)) * var5);
                  if (((ik) this).field_E == null) {
                    break L4;
                  } else {
                    if (((ik) this).field_y == null) {
                      break L4;
                    } else {
                      L5: {
                        if (((ik) this).field_A) {
                          stackOut_29_0 = ((ik) this).field_y;
                          stackIn_30_0 = stackOut_29_0;
                          break L5;
                        } else {
                          stackOut_28_0 = ((ik) this).field_E;
                          stackIn_30_0 = stackOut_28_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_30_0;
                        if (!((ik) this).field_L) {
                          stackOut_32_0 = ((ik) this).field_E;
                          stackIn_33_0 = stackOut_32_0;
                          break L6;
                        } else {
                          stackOut_31_0 = ((ik) this).field_y;
                          stackIn_33_0 = stackOut_31_0;
                          break L6;
                        }
                      }
                      var8 = stackIn_33_0;
                      var7.d(var3, var4);
                      var8.b(var3, -var8.field_r + ((ik) this).field_d + ((ik) this).field_a);
                      break L4;
                    }
                  }
                }
                L7: {
                  if (null == ((ik) this).field_K) {
                    gb.g(var3, var4 - -var6, ((ik) this).field_P, ((ik) this).field_P, ((ik) this).field_r & k.field_a, ((ik) this).field_r >>> ii.field_b);
                    gb.e(var3, var4 + var6, ((ik) this).field_P, ((ik) this).field_P, k.field_a & ((ik) this).field_F, ((ik) this).field_F >>> ii.field_b);
                    break L7;
                  } else {
                    ((ik) this).field_K.d(-(((ik) this).field_K.field_x / 2) + var3 + ((ik) this).field_P / 2, var6 + var4 + ((ik) this).field_K.field_r / 2);
                    break L7;
                  }
                }
                gb.e(((ik) this).field_l, ((ik) this).field_a, ((ik) this).field_n, ((ik) this).field_d, ((ik) this).field_I & k.field_a, ((ik) this).field_I >>> ii.field_b);
                gb.e(param0 + ((ik) this).field_l, ((ik) this).field_a + -1, ((ik) this).field_n - -2, 2 + ((ik) this).field_d, k.field_a & ((ik) this).field_N, ((ik) this).field_N >>> ii.field_b);
                return;
              } else {
                break L1;
              }
            }
          }
          L8: {
            if (var3 != ((ik) this).field_x) {
              if ((var3 & 1) != 0) {
                stackOut_8_0 = ((ik) this).field_u;
                stackIn_9_0 = stackOut_8_0;
                break L8;
              } else {
                stackOut_7_0 = ((ik) this).field_w;
                stackIn_9_0 = stackOut_7_0;
                break L8;
              }
            } else {
              stackOut_5_0 = ((ik) this).field_O;
              stackIn_9_0 = stackOut_5_0;
              break L8;
            }
          }
          L9: {
            var4 = stackIn_9_0;
            gb.g(((ik) this).field_l, -((ik) this).field_S + var2, -((ik) this).field_P + ((ik) this).field_n, ((ik) this).field_D.field_N, var4 & k.field_a, var4 >>> ii.field_b);
            if (((ik) this).field_z.length > var3) {
              L10: {
                L11: {
                  if (((ik) this).field_t[var3]) {
                    break L11;
                  } else {
                    if (null == ((ik) this).field_M) {
                      break L11;
                    } else {
                      stackOut_13_0 = ((ik) this).field_M;
                      stackIn_15_0 = stackOut_13_0;
                      break L10;
                    }
                  }
                }
                stackOut_14_0 = ((ik) this).field_z[var3];
                stackIn_15_0 = stackOut_14_0;
                break L10;
              }
              L12: {
                var5_ref_String = stackIn_15_0;
                if (((ik) this).field_t[var3]) {
                  stackOut_17_0 = ((ik) this).field_Q;
                  stackIn_18_0 = stackOut_17_0;
                  break L12;
                } else {
                  stackOut_16_0 = ((ik) this).field_H;
                  stackIn_18_0 = stackOut_16_0;
                  break L12;
                }
              }
              var6 = stackIn_18_0;
              ((ik) this).field_D.a(var5_ref_String, ((ik) this).field_l - -5, -((ik) this).field_D.field_K + (((ik) this).field_D.field_N + var2) + -((ik) this).field_S, k.field_a & var6, -1, var6 >>> ii.field_b);
              break L9;
            } else {
              break L9;
            }
          }
          var3++;
          var2 = var2 + ((ik) this).field_D.field_N;
          continue L0;
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        double var5_double = 0.0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_77_0 = null;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_76_0 = null;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        var11 = fleas.field_A ? 1 : 0;
        ((ik) this).field_J = false;
        ((ik) this).field_A = false;
        ((ik) this).field_L = false;
        var2 = -1 + ((ik) this).field_d / ((ik) this).field_D.field_N;
        var3 = ((ik) this).field_D.field_N * (((ik) this).field_z.length + -var2);
        if (((ik) this).field_k) {
          L0: {
            L1: {
              stackOut_2_0 = this;
              stackIn_5_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (kc.field_f != 1) {
                break L1;
              } else {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!((ik) this).a((byte) 103)) {
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L0;
                }
              }
            }
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L0;
          }
          L2: {
            ((ik) this).field_g = stackIn_6_1 != 0;
            if (param0 == 99) {
              break L2;
            } else {
              ((ik) this).e(1);
              break L2;
            }
          }
          L3: {
            ((ik) this).field_B = ((ik) this).field_B - 1;
            ((ik) this).field_v = ((ik) this).field_v - 1;
            var4 = ((ik) this).field_x;
            if (((ik) this).field_i) {
              if (0 > ((ik) this).field_x) {
                break L3;
              } else {
                if (((ik) this).field_z.length <= ((ik) this).field_x) {
                  break L3;
                } else {
                  L4: {
                    if (ei.field_H[98]) {
                      if (((ik) this).field_v < 0) {
                        ((ik) this).field_x = ((ik) this).field_x - 1;
                        ((ik) this).field_v = ij.field_L;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (!ei.field_H[99]) {
                        ((ik) this).field_v = -1;
                        break L4;
                      } else {
                        if (((ik) this).field_v >= 0) {
                          break L4;
                        } else {
                          ((ik) this).field_x = ((ik) this).field_x + 1;
                          ((ik) this).field_v = ij.field_L;
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    if (0 <= ((ik) this).field_x) {
                      break L5;
                    } else {
                      ((ik) this).field_x = 0;
                      break L5;
                    }
                  }
                  if (((ik) this).field_x >= ((ik) this).field_z.length) {
                    ((ik) this).field_x = -1 + ((ik) this).field_z.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          if (((ik) this).field_g) {
            ((ik) this).field_i = true;
            if (((ik) this).field_a + ((ik) this).field_D.field_N < kc.field_b) {
              L6: {
                if (ag.field_f < ((ik) this).field_l - (-((ik) this).field_n - -((ik) this).field_P)) {
                  if (jk.field_r == 0) {
                    break L6;
                  } else {
                    var5 = ((ik) this).field_S + (-((ik) this).field_a - (((ik) this).field_D.field_N - kc.field_b));
                    ((ik) this).field_x = var5 / ((ik) this).field_D.field_N;
                    break L6;
                  }
                } else {
                  if (kc.field_b > ((ik) this).field_D.field_N + (((ik) this).field_a + ((ik) this).field_P)) {
                    if (-((ik) this).field_P + (((ik) this).field_d + ((ik) this).field_a) > kc.field_b) {
                      L7: {
                        ((ik) this).field_B = -1;
                        var5_double = (double)(-((ik) this).field_D.field_N + (-((ik) this).field_a + kc.field_b - (((ik) this).field_P + ((ik) this).field_P / 2)));
                        if (var5_double >= 0.0) {
                          break L7;
                        } else {
                          var5_double = 0.0;
                          break L7;
                        }
                      }
                      L8: {
                        var7 = (double)(-((ik) this).field_P + (-(((ik) this).field_P * 2) + (-((ik) this).field_D.field_N + ((ik) this).field_d)));
                        if (var5_double <= var7) {
                          break L8;
                        } else {
                          var5_double = var7;
                          break L8;
                        }
                      }
                      var9 = var5_double / var7;
                      ((ik) this).field_x = (int)(var9 * (double)(-1 + ((ik) this).field_z.length));
                      break L6;
                    } else {
                      L9: {
                        if (((ik) this).field_B >= 0) {
                          break L9;
                        } else {
                          ((ik) this).field_x = ((ik) this).field_x + 1;
                          ((ik) this).field_B = ij.field_L;
                          break L9;
                        }
                      }
                      ((ik) this).field_L = true;
                      break L6;
                    }
                  } else {
                    ((ik) this).field_A = true;
                    if (((ik) this).field_B >= 0) {
                      break L6;
                    } else {
                      ((ik) this).field_x = ((ik) this).field_x - 1;
                      ((ik) this).field_B = ij.field_L;
                      break L6;
                    }
                  }
                }
              }
              L10: {
                if (var3 < ((ik) this).field_S) {
                  ((ik) this).field_S = var3;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (0 > ((ik) this).field_x) {
                  ((ik) this).field_x = 0;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (((ik) this).field_z.length <= ((ik) this).field_x) {
                  ((ik) this).field_x = ((ik) this).field_z.length + -1;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                stackOut_76_0 = this;
                stackIn_78_0 = stackOut_76_0;
                stackIn_77_0 = stackOut_76_0;
                if (((ik) this).field_x == var4) {
                  stackOut_78_0 = this;
                  stackOut_78_1 = 0;
                  stackIn_79_0 = stackOut_78_0;
                  stackIn_79_1 = stackOut_78_1;
                  break L13;
                } else {
                  stackOut_77_0 = this;
                  stackOut_77_1 = 1;
                  stackIn_79_0 = stackOut_77_0;
                  stackIn_79_1 = stackOut_77_1;
                  break L13;
                }
              }
              L14: {
                ((ik) this).field_J = stackIn_79_1 != 0;
                if (((ik) this).field_x >= var2 / 2) {
                  if (((ik) this).field_z.length - ((ik) this).field_x >= var2 / 2) {
                    var5 = var3 * (-(var2 / 2) + ((ik) this).field_x) / (-var2 + ((ik) this).field_z.length);
                    break L14;
                  } else {
                    var5 = var3;
                    break L14;
                  }
                } else {
                  var5 = 0;
                  break L14;
                }
              }
              L15: {
                if (((ik) this).field_S == var5) {
                  break L15;
                } else {
                  var6 = ((ik) this).field_S - var5;
                  if (var6 / 4 == -1) {
                    if (-1 != var6 / 2) {
                      ((ik) this).field_S = ((ik) this).field_S - var6 / 2;
                      break L15;
                    } else {
                      ((ik) this).field_S = ((ik) this).field_S - var6;
                      break L15;
                    }
                  } else {
                    ((ik) this).field_S = ((ik) this).field_S - var6 / 4;
                    break L15;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L16: {
              if (kc.field_f != 1) {
                break L16;
              } else {
                ((ik) this).field_i = false;
                break L16;
              }
            }
            L17: {
              if (0 > ((ik) this).field_x) {
                ((ik) this).field_x = 0;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (((ik) this).field_z.length <= ((ik) this).field_x) {
                ((ik) this).field_x = ((ik) this).field_z.length + -1;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              stackOut_34_0 = this;
              stackIn_36_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (((ik) this).field_x == var4) {
                stackOut_36_0 = this;
                stackOut_36_1 = 0;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                break L19;
              } else {
                stackOut_35_0 = this;
                stackOut_35_1 = 1;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                break L19;
              }
            }
            L20: {
              ((ik) this).field_J = stackIn_37_1 != 0;
              if (((ik) this).field_x >= var2 / 2) {
                if (((ik) this).field_z.length - ((ik) this).field_x >= var2 / 2) {
                  var5 = var3 * (-(var2 / 2) + ((ik) this).field_x) / (-var2 + ((ik) this).field_z.length);
                  break L20;
                } else {
                  var5 = var3;
                  break L20;
                }
              } else {
                var5 = 0;
                break L20;
              }
            }
            L21: {
              if (((ik) this).field_S == var5) {
                break L21;
              } else {
                var6 = ((ik) this).field_S - var5;
                if (var6 / 4 == -1) {
                  if (-1 != var6 / 2) {
                    ((ik) this).field_S = ((ik) this).field_S - var6 / 2;
                    break L21;
                  } else {
                    ((ik) this).field_S = ((ik) this).field_S - var6;
                    break L21;
                  }
                } else {
                  ((ik) this).field_S = ((ik) this).field_S - var6 / 4;
                  break L21;
                }
              }
            }
            return;
          }
        } else {
          ((ik) this).field_B = 0;
          ((ik) this).field_v = 0;
          ((ik) this).field_g = false;
          ((ik) this).field_c = false;
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void d(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 104) {
                break L1;
              } else {
                ik.d(69);
                break L1;
              }
            }
            var5 = ge.field_e;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1_ref, "ik.E(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        field_C = null;
    }

    ik(int param0, int param1, int param2, int param3, fa param4, dd param5, dd param6, dd param7, dd param8) {
        RuntimeException var10 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
        ((ik) this).field_I = 0;
        ((ik) this).field_r = -16727809;
        ((ik) this).field_s = -257908576;
        ((ik) this).field_u = -252645136;
        ((ik) this).field_Q = -16777215;
        ((ik) this).field_A = false;
        ((ik) this).field_B = 0;
        ((ik) this).field_v = 0;
        ((ik) this).field_M = null;
        ((ik) this).field_H = -8355712;
        ((ik) this).field_x = -1;
        ((ik) this).field_L = false;
        ((ik) this).field_t = new boolean[]{};
        ((ik) this).field_F = -16777215;
        ((ik) this).field_z = new String[]{};
        ((ik) this).field_O = -2147434304;
        ((ik) this).field_w = -1;
        ((ik) this).field_J = false;
        ((ik) this).field_N = 0;
        try {
          L0: {
            L1: {
              ((ik) this).field_n = param2;
              ((ik) this).field_D = param4;
              ((ik) this).field_a = param1;
              ((ik) this).field_d = param3;
              ((ik) this).field_l = param0;
              ((ik) this).field_K = param7;
              ((ik) this).field_q = param8;
              ((ik) this).field_y = param6;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param5 == null) {
                stackOut_3_0 = this;
                stackOut_3_1 = ((ik) this).field_D.field_N;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = param5.field_x;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((ik) this).field_P = stackIn_4_1;
            ((ik) this).field_E = param5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10;
            stackOut_6_1 = new StringBuilder().append("ik.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
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
            if (param6 == null) {
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
            if (param7 == null) {
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
            if (param8 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = Math.atan2(1.0, 0.0);
        field_R = true;
        field_C = "Not yet reached";
    }
}

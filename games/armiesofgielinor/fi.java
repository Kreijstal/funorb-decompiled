/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fi extends tc {
    private int field_n;
    static at field_u;
    private boolean field_p;
    private int field_t;
    private int field_q;
    private int field_k;
    static long field_s;
    jd field_r;
    private int field_o;
    private int field_m;
    static String field_l;

    final static me b(int param0, int param1) {
        me[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        me stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        me stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2 = uj.c((byte) 105);
            var3 = param0;
            L1: while (true) {
              L2: {
                if (~var2.length >= ~var3) {
                  break L2;
                } else {
                  if (var2[var3].field_b == param1) {
                    stackOut_6_0 = var2[var3];
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  } else {
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "fi.B(" + param0 + ',' + param1 + ')');
        }
        return (me) (Object) stackIn_10_0;
    }

    final void a(jd param0, int param1, int param2, int param3, int param4, ha param5) {
        RuntimeException var7 = null;
        String var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        tu stackIn_2_0 = null;
        String stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int[][] stackIn_2_4 = null;
        tu stackIn_4_0 = null;
        String stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int[][] stackIn_4_4 = null;
        tu stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int[][] stackIn_5_4 = null;
        int stackIn_5_5 = 0;
        tu stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int[][] stackIn_8_4 = null;
        tu stackIn_10_0 = null;
        String stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int[][] stackIn_10_4 = null;
        tu stackIn_11_0 = null;
        String stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int[][] stackIn_11_4 = null;
        int stackIn_11_5 = 0;
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
        tu stackOut_1_0 = null;
        String stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int[][] stackOut_1_4 = null;
        tu stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int[][] stackOut_4_4 = null;
        int stackOut_4_5 = 0;
        tu stackOut_2_0 = null;
        String stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int[][] stackOut_2_4 = null;
        int stackOut_2_5 = 0;
        tu stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int[][] stackOut_7_4 = null;
        tu stackOut_10_0 = null;
        String stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int[][] stackOut_10_4 = null;
        int stackOut_10_5 = 0;
        tu stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int[][] stackOut_8_4 = null;
        int stackOut_8_5 = 0;
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
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              uf.field_j.b();
              qn.b();
              fe.b(0, 0, 134, 61, io.field_m, nd.field_b, 0, 0);
              qt.field_e.b(2, 2);
              qn.b(5, 5, 124, 18, 0, 192);
              qn.b(5, 25, 30, 30, 0, 192);
              var7_ref = ((fi) this).field_r.field_K;
              qn.f(5, param2, 95, 23);
              stackOut_1_0 = en.field_E;
              stackOut_1_1 = (String) var7_ref;
              stackOut_1_2 = 10 + -(((fi) this).field_q >> 1427297665);
              stackOut_1_3 = 17;
              stackOut_1_4 = op.field_c;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_4_2 = stackOut_1_2;
              stackIn_4_3 = stackOut_1_3;
              stackIn_4_4 = stackOut_1_4;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              if (param5.field_wb) {
                stackOut_4_0 = (tu) (Object) stackIn_4_0;
                stackOut_4_1 = (String) (Object) stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = (int[][]) (Object) stackIn_4_4;
                stackOut_4_5 = 1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                stackIn_5_5 = stackOut_4_5;
                break L1;
              } else {
                stackOut_2_0 = (tu) (Object) stackIn_2_0;
                stackOut_2_1 = (String) (Object) stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = (int[][]) (Object) stackIn_2_4;
                stackOut_2_5 = 0;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                stackIn_5_3 = stackOut_2_3;
                stackIn_5_4 = stackOut_2_4;
                stackIn_5_5 = stackOut_2_5;
                break L1;
              }
            }
            L2: {
              ((tu) (Object) stackIn_5_0).b(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4[stackIn_5_5][((fi) this).field_r.field_O], -1);
              qn.a();
              var8 = ((fi) this).field_r.g((byte) 122);
              if (var8 >= 0) {
                break L2;
              } else {
                var8 = 0;
                break L2;
              }
            }
            L3: {
              stackOut_7_0 = en.field_E;
              stackOut_7_1 = var8 + "/" + ((fi) this).field_r.field_t;
              stackOut_7_2 = 126;
              stackOut_7_3 = 18;
              stackOut_7_4 = op.field_c;
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              stackIn_10_3 = stackOut_7_3;
              stackIn_10_4 = stackOut_7_4;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              stackIn_8_4 = stackOut_7_4;
              if (!param5.field_wb) {
                stackOut_10_0 = (tu) (Object) stackIn_10_0;
                stackOut_10_1 = (String) (Object) stackIn_10_1;
                stackOut_10_2 = stackIn_10_2;
                stackOut_10_3 = stackIn_10_3;
                stackOut_10_4 = (int[][]) (Object) stackIn_10_4;
                stackOut_10_5 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = stackOut_10_3;
                stackIn_11_4 = stackOut_10_4;
                stackIn_11_5 = stackOut_10_5;
                break L3;
              } else {
                stackOut_8_0 = (tu) (Object) stackIn_8_0;
                stackOut_8_1 = (String) (Object) stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = (int[][]) (Object) stackIn_8_4;
                stackOut_8_5 = 1;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                stackIn_11_2 = stackOut_8_2;
                stackIn_11_3 = stackOut_8_3;
                stackIn_11_4 = stackOut_8_4;
                stackIn_11_5 = stackOut_8_5;
                break L3;
              }
            }
            L4: {
              L5: {
                ((tu) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4[stackIn_11_5][((fi) this).field_r.field_O], -1);
                if (param1 == ((fi) this).field_r.field_O) {
                  break L5;
                } else {
                  L6: {
                    if (null == param0) {
                      break L6;
                    } else {
                      qn.b(37, 25, 92, 30, 0, 128);
                      ro.field_rb[param0.g(0)].a(43, 32);
                      sg.field_b[this.a(param0.g(0), ((fi) this).field_r.g(param2 + -5), -46)].a(75, 32);
                      if (var13 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  qn.b(99, 25, 30, 30, 0, 128);
                  if (var13 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              qn.b(99, 25, 30, 30, 0, 128);
              qn.b(53, 25, 30, 30, 0, 128);
              var9 = ((fi) this).field_r.l(-27014);
              cp.field_e[eb.a((byte) -97, ~var9 & 3)].a(56, 25);
              break L4;
            }
            L7: {
              ro.field_rb[((fi) this).field_r.g(0)].a(106, 32);
              en.field_E.c(-param5.a(param5.field_v * ((fi) this).field_r.field_w + ((fi) this).field_r.field_J, param2 + -9, ((fi) this).field_r) + 100 + "%", 20, 45, 16777215, -1);
              vb.field_t.b(68, 60, nd.field_b[-1 + nd.field_b.length]);
              so.field_b.a(param2 + 5600);
              var9 = ((fi) this).field_k - param3 - 75;
              var10 = ((fi) this).field_t - (param4 - -80);
              uf.field_j.e(var9, var10, -((fi) this).field_m + 32 << 481598755);
              var11 = bw.field_m[((fi) this).field_r.field_N][12];
              if (var11 == -1) {
                break L7;
              } else {
                bd.a(32 + -((fi) this).field_m << -2130959837, true, var9 - -96, e.field_b, 40, 60 + var10);
                if (~var11 <= ~lb.field_e.length) {
                  break L7;
                } else {
                  lb.field_e[var11].a(var9 - -101, var10 + 58, -((fi) this).field_m + 32 << 856234691);
                  break L7;
                }
              }
            }
            L8: {
              var12 = ((fi) this).field_r.f(param2 + 11);
              if (var12 != -1) {
                bd.a(-((fi) this).field_m + 32 << -1954006365, true, var9, e.field_b, 40, var10 - -60);
                ii.field_a[var12].c(var9 + 8, 60 + var10, 24, 24, -((fi) this).field_m + 32 << -1500864733);
                break L8;
              } else {
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var7;
            stackOut_33_1 = new StringBuilder().append("fi.C(");
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
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L9;
            }
          }
          L10: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param5 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            var4_int = fk.field_d[param1][param0];
            var5 = fk.field_d[param0][param1];
            if (~var5 > ~var4_int) {
              if (-var5 + var4_int <= 45) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              if (param2 == -46) {
                if (var4_int >= var5) {
                  stackOut_21_0 = 2;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                } else {
                  if (45 < -var4_int + var5) {
                    stackOut_17_0 = 4;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    stackOut_19_0 = 3;
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0;
                  }
                }
              } else {
                stackOut_9_0 = 26;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "fi.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_22_0;
    }

    public static void a(int param0) {
        try {
            field_l = null;
            field_u = null;
            if (param0 > -24) {
                field_s = 68L;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fi.F(" + param0 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  L3: {
                    if (((fi) this).field_m < 32) {
                      ((fi) this).field_m = ((fi) this).field_m + 4;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (((fi) this).field_m < 32) {
                    break L1;
                  } else {
                    ((fi) this).d(108);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (((fi) this).field_m > 0) {
                  break L4;
                } else {
                  if (((fi) this).field_o <= 0) {
                    break L1;
                  } else {
                    L5: {
                      if (((fi) this).field_p) {
                        break L5;
                      } else {
                        L6: {
                          if (((fi) this).field_q <= 0) {
                            break L6;
                          } else {
                            ((fi) this).field_q = ((fi) this).field_q - 1;
                            break L6;
                          }
                        }
                        if (((fi) this).field_q > 0) {
                          break L1;
                        } else {
                          ((fi) this).field_n = ((fi) this).field_n - 1;
                          if (((fi) this).field_n <= 0) {
                            ((fi) this).field_n = 50;
                            ((fi) this).field_p = true;
                            if (var4 == 0) {
                              break L1;
                            } else {
                              break L5;
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    L7: {
                      if (~((fi) this).field_q > ~((fi) this).field_o) {
                        ((fi) this).field_q = ((fi) this).field_q + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (~((fi) this).field_q <= ~((fi) this).field_o) {
                      ((fi) this).field_n = ((fi) this).field_n - 1;
                      if (((fi) this).field_n <= 0) {
                        ((fi) this).field_n = 50;
                        ((fi) this).field_p = false;
                        if (var4 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              ((fi) this).field_m = ((fi) this).field_m - 4;
              break L1;
            }
            L8: {
              if (param0 <= -100) {
                break L8;
              } else {
                ((fi) this).a((jd) null, -88, 39, -11, 35, (ha) null);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "fi.A(" + param0 + ',' + param1 + ')');
        }
    }

    fi(jd param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ((fi) this).field_k = param1;
              ((fi) this).field_m = 32;
              ((fi) this).field_p = false;
              ((fi) this).field_q = 0;
              ((fi) this).field_r = param0;
              ((fi) this).field_t = param2;
              ((fi) this).field_o = -110 + rs.field_n.a(((fi) this).field_r.field_K);
              if (((fi) this).field_o < 0) {
                ((fi) this).field_o = 0;
                break L1;
              } else {
                break L1;
              }
            }
            ((fi) this).field_n = 100;
            ((fi) this).field_o = ((fi) this).field_o << 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("fi.<init>(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, boolean param5, int param6, ha param7, Random param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        ne[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        ne[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        ne[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        ne[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_49_0 = 0;
        ne[] stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_51_0 = 0;
        ne[] stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_53_0 = 0;
        ne[] stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_54_0 = 0;
        ne[] stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
        Object stackIn_59_0 = null;
        ne[] stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        Object stackIn_61_0 = null;
        ne[] stackIn_61_1 = null;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        int stackIn_61_4 = 0;
        Object stackIn_63_0 = null;
        ne[] stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        int stackIn_63_4 = 0;
        Object stackIn_64_0 = null;
        ne[] stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        int stackIn_64_5 = 0;
        int stackIn_66_0 = 0;
        ne[] stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_68_0 = 0;
        ne[] stackIn_68_1 = null;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        int stackIn_70_0 = 0;
        ne[] stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        int stackIn_71_0 = 0;
        ne[] stackIn_71_1 = null;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        int stackIn_71_4 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        int stackIn_94_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_113_2 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        ne[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        ne[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        ne[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        ne[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_48_0 = 0;
        ne[] stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_53_0 = 0;
        ne[] stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int stackOut_49_0 = 0;
        ne[] stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_51_0 = 0;
        ne[] stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        Object stackOut_58_0 = null;
        ne[] stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        Object stackOut_63_0 = null;
        ne[] stackOut_63_1 = null;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        int stackOut_63_5 = 0;
        Object stackOut_59_0 = null;
        ne[] stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        Object stackOut_61_0 = null;
        ne[] stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        int stackOut_61_4 = 0;
        int stackOut_61_5 = 0;
        int stackOut_65_0 = 0;
        ne[] stackOut_65_1 = null;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_70_0 = 0;
        ne[] stackOut_70_1 = null;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        int stackOut_70_4 = 0;
        int stackOut_66_0 = 0;
        ne[] stackOut_66_1 = null;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_68_0 = 0;
        ne[] stackOut_68_1 = null;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        int stackOut_68_4 = 0;
        int stackOut_80_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int stackOut_93_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_int = -param0 + param4;
              var10 = -param3 + param6;
              if (param1 == 101) {
                break L1;
              } else {
                fi.a(-20, (byte) 51, -30, 104, -20, false, -76, (ha) null, (Random) null);
                break L1;
              }
            }
            var11 = 0;
            var12 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (~var10 != ~var11) {
                      break L5;
                    } else {
                      stackOut_6_0 = var9_int;
                      stackOut_6_1 = var12;
                      stackIn_40_0 = stackOut_6_0;
                      stackIn_40_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var13 != 0) {
                        break L4;
                      } else {
                        if (stackIn_7_0 == stackIn_7_1) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    if (param7.field_Eb[var12 + param0 + (var11 - -param3) * param7.field_v] == null) {
                      break L6;
                    } else {
                      if (param7.field_Eb[var12 + (param0 - -((var11 - -param3) * param7.field_v))].field_h == param2) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    L8: {
                      if (param7.field_Eb[param0 + var12 - -((var11 + param3) * param7.field_v)] == null) {
                        break L8;
                      } else {
                        L9: {
                          if (param7.field_Eb[param7.field_v * (var11 - -param3) + (var12 - -param0)].field_h == 4) {
                            break L9;
                          } else {
                            if (6 != param7.field_Eb[(var11 + param3) * param7.field_v + (var12 + param0)].field_h) {
                              break L7;
                            } else {
                              if (!param5) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        L10: {
                          if (param2 == 1) {
                            break L10;
                          } else {
                            param7.field_Eb[(param3 + var11) * param7.field_v + param0 + var12] = new ne(param2, param7);
                            if (var13 == 0) {
                              break L7;
                            } else {
                              break L10;
                            }
                          }
                        }
                        param7.field_Eb[(param3 + var11) * param7.field_v + var12 + param0] = new ne(10, param7);
                        if (var13 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param7.field_Eb[param7.field_v * (var11 - -param3) + (param0 + var12)] = new ne(param2, param7);
                    break L7;
                  }
                  stackOut_39_0 = ~var9_int;
                  stackOut_39_1 = ~var12;
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  break L4;
                }
                L11: {
                  if (stackIn_40_0 == stackIn_40_1) {
                    break L11;
                  } else {
                    L12: {
                      stackOut_41_0 = param7.field_Eb;
                      stackOut_41_1 = param7.field_v * (var11 - -param3) + (param0 + var12);
                      stackIn_46_0 = stackOut_41_0;
                      stackIn_46_1 = stackOut_41_1;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      if (var9_int > 0) {
                        stackOut_46_0 = (ne[]) (Object) stackIn_46_0;
                        stackOut_46_1 = stackIn_46_1;
                        stackOut_46_2 = 1;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        stackIn_47_2 = stackOut_46_2;
                        break L12;
                      } else {
                        stackOut_42_0 = (ne[]) (Object) stackIn_42_0;
                        stackOut_42_1 = stackIn_42_1;
                        stackIn_44_0 = stackOut_42_0;
                        stackIn_44_1 = stackOut_42_1;
                        stackOut_44_0 = (ne[]) (Object) stackIn_44_0;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = -1;
                        stackIn_47_0 = stackOut_44_0;
                        stackIn_47_1 = stackOut_44_1;
                        stackIn_47_2 = stackOut_44_2;
                        break L12;
                      }
                    }
                    if (stackIn_47_0[stackIn_47_1 + stackIn_47_2] == null) {
                      break L11;
                    } else {
                      L13: {
                        stackOut_48_0 = param2;
                        stackOut_48_1 = param7.field_Eb;
                        stackOut_48_2 = param0;
                        stackOut_48_3 = var12;
                        stackIn_53_0 = stackOut_48_0;
                        stackIn_53_1 = stackOut_48_1;
                        stackIn_53_2 = stackOut_48_2;
                        stackIn_53_3 = stackOut_48_3;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        stackIn_49_2 = stackOut_48_2;
                        stackIn_49_3 = stackOut_48_3;
                        if (var9_int <= 0) {
                          stackOut_53_0 = stackIn_53_0;
                          stackOut_53_1 = (ne[]) (Object) stackIn_53_1;
                          stackOut_53_2 = stackIn_53_2;
                          stackOut_53_3 = stackIn_53_3;
                          stackOut_53_4 = -1;
                          stackIn_54_0 = stackOut_53_0;
                          stackIn_54_1 = stackOut_53_1;
                          stackIn_54_2 = stackOut_53_2;
                          stackIn_54_3 = stackOut_53_3;
                          stackIn_54_4 = stackOut_53_4;
                          break L13;
                        } else {
                          stackOut_49_0 = stackIn_49_0;
                          stackOut_49_1 = (ne[]) (Object) stackIn_49_1;
                          stackOut_49_2 = stackIn_49_2;
                          stackOut_49_3 = stackIn_49_3;
                          stackIn_51_0 = stackOut_49_0;
                          stackIn_51_1 = stackOut_49_1;
                          stackIn_51_2 = stackOut_49_2;
                          stackIn_51_3 = stackOut_49_3;
                          stackOut_51_0 = stackIn_51_0;
                          stackOut_51_1 = (ne[]) (Object) stackIn_51_1;
                          stackOut_51_2 = stackIn_51_2;
                          stackOut_51_3 = stackIn_51_3;
                          stackOut_51_4 = 1;
                          stackIn_54_0 = stackOut_51_0;
                          stackIn_54_1 = stackOut_51_1;
                          stackIn_54_2 = stackOut_51_2;
                          stackIn_54_3 = stackOut_51_3;
                          stackIn_54_4 = stackOut_51_4;
                          break L13;
                        }
                      }
                      if (stackIn_54_0 == stackIn_54_1[stackIn_54_2 + (stackIn_54_3 + (stackIn_54_4 + param7.field_v * (var11 + param3)))].field_h) {
                        break L3;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (~var10 == ~var11) {
                    break L14;
                  } else {
                    L15: {
                      stackOut_58_0 = null;
                      stackOut_58_1 = param7.field_Eb;
                      stackOut_58_2 = param7.field_v;
                      stackOut_58_3 = param3;
                      stackOut_58_4 = var11;
                      stackIn_63_0 = stackOut_58_0;
                      stackIn_63_1 = stackOut_58_1;
                      stackIn_63_2 = stackOut_58_2;
                      stackIn_63_3 = stackOut_58_3;
                      stackIn_63_4 = stackOut_58_4;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      stackIn_59_2 = stackOut_58_2;
                      stackIn_59_3 = stackOut_58_3;
                      stackIn_59_4 = stackOut_58_4;
                      if (var10 > 0) {
                        stackOut_63_0 = stackIn_63_0;
                        stackOut_63_1 = (ne[]) (Object) stackIn_63_1;
                        stackOut_63_2 = stackIn_63_2;
                        stackOut_63_3 = stackIn_63_3;
                        stackOut_63_4 = stackIn_63_4;
                        stackOut_63_5 = 1;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        stackIn_64_2 = stackOut_63_2;
                        stackIn_64_3 = stackOut_63_3;
                        stackIn_64_4 = stackOut_63_4;
                        stackIn_64_5 = stackOut_63_5;
                        break L15;
                      } else {
                        stackOut_59_0 = stackIn_59_0;
                        stackOut_59_1 = (ne[]) (Object) stackIn_59_1;
                        stackOut_59_2 = stackIn_59_2;
                        stackOut_59_3 = stackIn_59_3;
                        stackOut_59_4 = stackIn_59_4;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_61_1 = stackOut_59_1;
                        stackIn_61_2 = stackOut_59_2;
                        stackIn_61_3 = stackOut_59_3;
                        stackIn_61_4 = stackOut_59_4;
                        stackOut_61_0 = stackIn_61_0;
                        stackOut_61_1 = (ne[]) (Object) stackIn_61_1;
                        stackOut_61_2 = stackIn_61_2;
                        stackOut_61_3 = stackIn_61_3;
                        stackOut_61_4 = stackIn_61_4;
                        stackOut_61_5 = -1;
                        stackIn_64_0 = stackOut_61_0;
                        stackIn_64_1 = stackOut_61_1;
                        stackIn_64_2 = stackOut_61_2;
                        stackIn_64_3 = stackOut_61_3;
                        stackIn_64_4 = stackOut_61_4;
                        stackIn_64_5 = stackOut_61_5;
                        break L15;
                      }
                    }
                    if (stackIn_64_0 == (Object) (Object) stackIn_64_1[stackIn_64_2 * (stackIn_64_3 + (stackIn_64_4 + stackIn_64_5)) + param0 + var12]) {
                      break L14;
                    } else {
                      L16: {
                        stackOut_65_0 = ~param2;
                        stackOut_65_1 = param7.field_Eb;
                        stackOut_65_2 = var12 + param0;
                        stackOut_65_3 = param7.field_v;
                        stackIn_70_0 = stackOut_65_0;
                        stackIn_70_1 = stackOut_65_1;
                        stackIn_70_2 = stackOut_65_2;
                        stackIn_70_3 = stackOut_65_3;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        stackIn_66_2 = stackOut_65_2;
                        stackIn_66_3 = stackOut_65_3;
                        if (var10 > 0) {
                          stackOut_70_0 = stackIn_70_0;
                          stackOut_70_1 = (ne[]) (Object) stackIn_70_1;
                          stackOut_70_2 = stackIn_70_2;
                          stackOut_70_3 = stackIn_70_3;
                          stackOut_70_4 = 1;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          stackIn_71_2 = stackOut_70_2;
                          stackIn_71_3 = stackOut_70_3;
                          stackIn_71_4 = stackOut_70_4;
                          break L16;
                        } else {
                          stackOut_66_0 = stackIn_66_0;
                          stackOut_66_1 = (ne[]) (Object) stackIn_66_1;
                          stackOut_66_2 = stackIn_66_2;
                          stackOut_66_3 = stackIn_66_3;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          stackIn_68_2 = stackOut_66_2;
                          stackIn_68_3 = stackOut_66_3;
                          stackOut_68_0 = stackIn_68_0;
                          stackOut_68_1 = (ne[]) (Object) stackIn_68_1;
                          stackOut_68_2 = stackIn_68_2;
                          stackOut_68_3 = stackIn_68_3;
                          stackOut_68_4 = -1;
                          stackIn_71_0 = stackOut_68_0;
                          stackIn_71_1 = stackOut_68_1;
                          stackIn_71_2 = stackOut_68_2;
                          stackIn_71_3 = stackOut_68_3;
                          stackIn_71_4 = stackOut_68_4;
                          break L16;
                        }
                      }
                      if (stackIn_71_0 != ~stackIn_71_1[stackIn_71_2 - -(stackIn_71_3 * (stackIn_71_4 + param3 + var11))].field_h) {
                        break L14;
                      } else {
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                }
                L17: {
                  if (-var12 + var9_int <= 0) {
                    stackOut_80_0 = -(var9_int + -var12);
                    stackIn_81_0 = stackOut_80_0;
                    break L17;
                  } else {
                    stackOut_78_0 = -var12 + var9_int;
                    stackIn_81_0 = stackOut_78_0;
                    break L17;
                  }
                }
                L18: {
                  stackOut_81_0 = stackIn_81_0;
                  stackOut_81_1 = 0;
                  stackIn_84_0 = stackOut_81_0;
                  stackIn_84_1 = stackOut_81_1;
                  stackIn_82_0 = stackOut_81_0;
                  stackIn_82_1 = stackOut_81_1;
                  if (-var11 + var10 <= 0) {
                    stackOut_84_0 = stackIn_84_0;
                    stackOut_84_1 = stackIn_84_1;
                    stackOut_84_2 = -(var10 - var11);
                    stackIn_85_0 = stackOut_84_0;
                    stackIn_85_1 = stackOut_84_1;
                    stackIn_85_2 = stackOut_84_2;
                    break L18;
                  } else {
                    stackOut_82_0 = stackIn_82_0;
                    stackOut_82_1 = stackIn_82_1;
                    stackOut_82_2 = var10 - var11;
                    stackIn_85_0 = stackOut_82_0;
                    stackIn_85_1 = stackOut_82_1;
                    stackIn_85_2 = stackOut_82_2;
                    break L18;
                  }
                }
                L19: {
                  stackOut_85_0 = stackIn_85_0;
                  stackOut_85_1 = stackIn_85_1;
                  stackOut_85_2 = stackIn_85_2;
                  stackIn_88_0 = stackOut_85_0;
                  stackIn_88_1 = stackOut_85_1;
                  stackIn_88_2 = stackOut_85_2;
                  stackIn_86_0 = stackOut_85_0;
                  stackIn_86_1 = stackOut_85_1;
                  stackIn_86_2 = stackOut_85_2;
                  if (-var12 + var9_int > 0) {
                    stackOut_88_0 = stackIn_88_0;
                    stackOut_88_1 = stackIn_88_1;
                    stackOut_88_2 = stackIn_88_2;
                    stackOut_88_3 = var9_int + -var12;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    stackIn_89_3 = stackOut_88_3;
                    break L19;
                  } else {
                    stackOut_86_0 = stackIn_86_0;
                    stackOut_86_1 = stackIn_86_1;
                    stackOut_86_2 = stackIn_86_2;
                    stackOut_86_3 = -(var9_int - var12);
                    stackIn_89_0 = stackOut_86_0;
                    stackIn_89_1 = stackOut_86_1;
                    stackIn_89_2 = stackOut_86_2;
                    stackIn_89_3 = stackOut_86_3;
                    break L19;
                  }
                }
                L20: {
                  if (stackIn_89_0 <= ns.a(stackIn_89_1 != 0, stackIn_89_2 + stackIn_89_3, param8)) {
                    break L20;
                  } else {
                    if (var12 == var9_int) {
                      break L20;
                    } else {
                      L21: {
                        stackOut_93_0 = var12;
                        stackIn_98_0 = stackOut_93_0;
                        stackIn_94_0 = stackOut_93_0;
                        if (0 >= var9_int) {
                          stackOut_98_0 = stackIn_98_0;
                          stackOut_98_1 = -1;
                          stackIn_99_0 = stackOut_98_0;
                          stackIn_99_1 = stackOut_98_1;
                          break L21;
                        } else {
                          stackOut_94_0 = stackIn_94_0;
                          stackIn_96_0 = stackOut_94_0;
                          stackOut_96_0 = stackIn_96_0;
                          stackOut_96_1 = 1;
                          stackIn_99_0 = stackOut_96_0;
                          stackIn_99_1 = stackOut_96_1;
                          break L21;
                        }
                      }
                      var12 = stackIn_99_0 + stackIn_99_1;
                      if (var13 == 0) {
                        continue L2;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
                if (var11 != var10) {
                  L22: {
                    stackOut_103_0 = var11;
                    stackIn_106_0 = stackOut_103_0;
                    stackIn_104_0 = stackOut_103_0;
                    if (var10 <= 0) {
                      stackOut_106_0 = stackIn_106_0;
                      stackOut_106_1 = -1;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      break L22;
                    } else {
                      stackOut_104_0 = stackIn_104_0;
                      stackOut_104_1 = 1;
                      stackIn_107_0 = stackOut_104_0;
                      stackIn_107_1 = stackOut_104_1;
                      break L22;
                    }
                  }
                  var11 = stackIn_107_0 + stackIn_107_1;
                  if (var13 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                } else {
                  continue L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var9 = decompiledCaughtException;
            stackOut_109_0 = (RuntimeException) var9;
            stackOut_109_1 = new StringBuilder().append("fi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_112_0 = stackOut_109_0;
            stackIn_112_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param7 == null) {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "null";
              stackIn_113_0 = stackOut_112_0;
              stackIn_113_1 = stackOut_112_1;
              stackIn_113_2 = stackOut_112_2;
              break L23;
            } else {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "{...}";
              stackIn_113_0 = stackOut_110_0;
              stackIn_113_1 = stackOut_110_1;
              stackIn_113_2 = stackOut_110_2;
              break L23;
            }
          }
          L24: {
            stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
            stackOut_113_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_113_2).append(',');
            stackIn_116_0 = stackOut_113_0;
            stackIn_116_1 = stackOut_113_1;
            stackIn_114_0 = stackOut_113_0;
            stackIn_114_1 = stackOut_113_1;
            if (param8 == null) {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L24;
            } else {
              stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
              stackOut_114_2 = "{...}";
              stackIn_117_0 = stackOut_114_0;
              stackIn_117_1 = stackOut_114_1;
              stackIn_117_2 = stackOut_114_2;
              break L24;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_117_0, stackIn_117_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new at();
        field_l = "Rock";
    }
}

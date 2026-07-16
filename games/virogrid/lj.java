/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements ol {
    static float field_r;
    private e field_p;
    static byte[][] field_j;
    private int field_l;
    private int field_n;
    static byte[] field_d;
    static int field_g;
    private int field_f;
    private int field_b;
    private int field_a;
    static String field_k;
    private int field_q;
    private int field_h;
    private int field_o;
    static String field_i;
    private int field_c;
    private int field_e;
    private int field_m;

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 57) {
                break L1;
              } else {
                lj.b(114);
                break L1;
              }
            }
            field_i = null;
            field_j = null;
            field_d = null;
            field_k = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "lj.C(" + param0 + 41);
        }
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        double stackIn_7_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        double stackOut_6_0 = 0.0;
        double stackOut_4_0 = 0.0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == vg.field_I) {
                  break L2;
                } else {
                  L3: {
                    mn.a(false);
                    fe.g(1);
                    if (vg.field_I.field_e == 1) {
                      stackOut_6_0 = 0.0;
                      stackIn_7_0 = stackOut_6_0;
                      break L3;
                    } else {
                      stackOut_4_0 = 3.141592653589793;
                      stackIn_7_0 = stackOut_4_0;
                      break L3;
                    }
                  }
                  sj.field_o = (float)stackIn_7_0;
                  if (!Virogrid.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              sj.field_o = 3.1415927410125732f;
              break L1;
            }
            if (param0 >= 96) {
              L4: {
                el.a(true, (byte) -106);
                vm.field_d[0] = (double)field_r * Math.sin((double)cf.field_c);
                vm.field_d[2] = (double)field_r * Math.cos((double)cf.field_c);
                gb.c((byte) -44);
                ka.a(false, (byte) 87);
                pe discarded$2 = vm.a((byte) 30, u.field_t);
                var1_int = sh.a(4712, 3);
                if (kn.field_B == var1_int) {
                  var1_int = (1 + kn.field_B) % 3;
                  break L4;
                } else {
                  break L4;
                }
              }
              kn.field_B = var1_int;
              ei.a(0, oi.field_c[var1_int + 1]);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kg.a((Throwable) (Object) runtimeException, "lj.D(" + param0 + 41);
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        gn var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fi stackIn_4_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        fi stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof gn) {
                stackOut_3_0 = (fi) param1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_4_0 = (fi) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_ref = (gn) (Object) stackIn_4_0;
              if (var6_ref != null) {
                param2 = param2 & var6_ref.field_C;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4 == -23294) {
                break L3;
              } else {
                ((lj) this).a(107, (fi) null, true, -95, -123);
                break L3;
              }
            }
            L4: {
              var7 = 5592405;
              df.b(param0 - -param1.field_l, param1.field_u + param3, param1.field_g, param1.field_m, ((lj) this).field_l);
              if (param2) {
                var7 = 16777215;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = param0 - (-param1.field_l - ((lj) this).field_f);
              var9 = ((lj) this).field_a + (param3 - -param1.field_u);
              df.f(var8, var9, ((lj) this).field_n, ((lj) this).field_o, 5592405);
              df.b(var8, var9, ((lj) this).field_n, ((lj) this).field_o, var7);
              if (!var6_ref.field_z) {
                break L5;
              } else {
                df.a(var8, var9, ((lj) this).field_n + var8, ((lj) this).field_o + var9, 1);
                df.a(var8 - -((lj) this).field_n, var9, var8, ((lj) this).field_o + var9, 1);
                break L5;
              }
            }
            L6: {
              if (null == ((lj) this).field_p) {
                break L6;
              } else {
                var10 = ((lj) this).field_n + (((lj) this).field_f + ((lj) this).field_e);
                int discarded$1 = ((lj) this).field_p.a(param1.field_n, var10 + (param1.field_l + param0), param1.field_u + param3 - -((lj) this).field_q, param1.field_g - var10 + -((lj) this).field_e, -(((lj) this).field_e << -1482831743) + param1.field_m, ((lj) this).field_c, ((lj) this).field_b, ((lj) this).field_h, ((lj) this).field_m, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("lj.E(").append(param0).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, wm param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        boolean stackIn_12_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_45_0 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = pn.a(3 * (param0 - param3), (byte) -75);
            var6 = param3 * 3;
            a.b(12);
            if (param1) {
              L1: {
                var7 = -10 + var5_int;
                if ((param4.field_a ^ -1) >= -1) {
                  break L1;
                } else {
                  if (null == param4.field_z) {
                    break L1;
                  } else {
                    em.b(0);
                    break L1;
                  }
                }
              }
              ck.field_f = 0;
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (param4.field_k <= var8) {
                      break L4;
                    } else {
                      var9 = param4.field_J[var8];
                      var10 = param4.field_e[var8];
                      var11 = param4.field_j[var8];
                      stackOut_11_0 = param2;
                      stackIn_46_0 = stackOut_11_0 ? 1 : 0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var19 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (!stackIn_12_0) {
                              break L6;
                            } else {
                              var12 = en.field_Hb[var9];
                              var13 = ld.field_h[var9];
                              var14 = en.field_Hb[var10] + -var12;
                              var15 = en.field_Hb[var11] + -var12;
                              var16 = ld.field_h[var10] - var13;
                              var17 = -var13 + ld.field_h[var11];
                              if (-1 >= (var14 * var17 - var15 * var16 ^ -1)) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var12 = dn.field_a[var9];
                          if (-2147483648 == var12) {
                            break L5;
                          } else {
                            L7: {
                              var13 = dn.field_a[var10];
                              if (var13 != -2147483648) {
                                break L7;
                              } else {
                                if (var19 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var14 = dn.field_a[var11];
                            if (-2147483648 == var14) {
                              break L5;
                            } else {
                              L8: {
                                var15 = -var6 + var12 + var13 - -var14;
                                stackOut_22_0 = da.field_g.length;
                                stackOut_22_1 = -1;
                                stackIn_25_0 = stackOut_22_0;
                                stackIn_25_1 = stackOut_22_1;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                if (0 <= var7) {
                                  stackOut_25_0 = stackIn_25_0;
                                  stackOut_25_1 = stackIn_25_1;
                                  stackOut_25_2 = var15 >> var7;
                                  stackIn_26_0 = stackOut_25_0;
                                  stackIn_26_1 = stackOut_25_1;
                                  stackIn_26_2 = stackOut_25_2;
                                  break L8;
                                } else {
                                  stackOut_23_0 = stackIn_23_0;
                                  stackOut_23_1 = stackIn_23_1;
                                  stackOut_23_2 = var15 << -var7;
                                  stackIn_26_0 = stackOut_23_0;
                                  stackIn_26_1 = stackOut_23_1;
                                  stackIn_26_2 = stackOut_23_2;
                                  break L8;
                                }
                              }
                              var16 = stackIn_26_0 + (stackIn_26_1 + -stackIn_26_2);
                              var17 = da.field_g[var16];
                              L9: while (true) {
                                L10: {
                                  L11: {
                                    if ((var17 >> 1231154692 ^ -1) == -1) {
                                      break L11;
                                    } else {
                                      var16--;
                                      stackOut_28_0 = var16 ^ -1;
                                      stackOut_28_1 = -1;
                                      stackIn_36_0 = stackOut_28_0;
                                      stackIn_36_1 = stackOut_28_1;
                                      stackIn_29_0 = stackOut_28_0;
                                      stackIn_29_1 = stackOut_28_1;
                                      if (var19 != 0) {
                                        break L10;
                                      } else {
                                        L12: {
                                          if (stackIn_29_0 > stackIn_29_1) {
                                            System.err.println("Out of range!");
                                            if (var19 == 0) {
                                              break L5;
                                            } else {
                                              break L12;
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                        var17 = da.field_g[var16];
                                        if (var19 == 0) {
                                          continue L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_35_0 = var16 << -307386940;
                                  stackOut_35_1 = var17;
                                  stackIn_36_0 = stackOut_35_0;
                                  stackIn_36_1 = stackOut_35_1;
                                  break L10;
                                }
                                L13: {
                                  var18 = stackIn_36_0 + stackIn_36_1;
                                  bf.field_m[var18] = var8;
                                  da.field_g[var16] = 1 + var17;
                                  if ((param4.field_a ^ -1) >= -1) {
                                    break L13;
                                  } else {
                                    if (param4.field_z != null) {
                                      ph.field_o[param4.field_z[var8]] = ph.field_o[param4.field_z[var8]] + 1;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                ck.field_f = ck.field_f + 1;
                                break L5;
                              }
                            }
                          }
                        }
                        var8++;
                        if (var19 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_45_0 = param4.field_a ^ -1;
                  stackIn_46_0 = stackOut_45_0;
                  break L3;
                }
                L14: {
                  L15: {
                    if (stackIn_46_0 >= -1) {
                      break L15;
                    } else {
                      if (param4.field_z != null) {
                        var8 = 0;
                        var9 = 0;
                        L16: while (true) {
                          if (var9 >= ph.field_o.length) {
                            break L15;
                          } else {
                            var10 = ph.field_o[var9];
                            ph.field_o[var9] = var8;
                            var8 = var8 + var10;
                            var9++;
                            if (var19 != 0) {
                              break L14;
                            } else {
                              if (var19 == 0) {
                                continue L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      } else {
                        break L15;
                      }
                    }
                  }
                  break L14;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var5;
            stackOut_59_1 = new StringBuilder().append("lj.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
              break L17;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L17;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 41);
        }
    }

    final static void a(boolean param0, jc param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
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
            L1: {
              ve.field_s = param1.c((byte) 83) << 1973319621;
              var2_int = param1.g(11132);
              ve.field_s = ve.field_s + (var2_int >> -1224722717);
              ng.field_X = (var2_int & 7) << 714934034;
              ng.field_X = ng.field_X + (param1.c((byte) -43) << -207788830);
              var2_int = param1.g(11132);
              if (param0) {
                break L1;
              } else {
                field_r = 0.6400812864303589f;
                break L1;
              }
            }
            ng.field_X = ng.field_X + (var2_int >> -1073484602);
            ug.field_b = (63 & var2_int) << -112872785;
            ug.field_b = ug.field_b + (param1.g(11132) << -1838234041);
            var2_int = param1.g(11132);
            lm.field_j = (var2_int & 1) << -448396304;
            ug.field_b = ug.field_b + (var2_int >> -28791807);
            lm.field_j = lm.field_j + param1.c((byte) 70);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("lj.B(").append(param0).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    lj(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        ((lj) this).field_h = 1;
        ((lj) this).field_m = 1;
        try {
          L0: {
            ((lj) this).field_l = param9;
            ((lj) this).field_e = param1;
            ((lj) this).field_p = param0;
            ((lj) this).field_a = param6;
            ((lj) this).field_n = param8;
            ((lj) this).field_q = param2;
            ((lj) this).field_f = param5;
            ((lj) this).field_c = param3;
            ((lj) this).field_o = param7;
            ((lj) this).field_b = param4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lj.<init>(");
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
          throw kg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final static int c(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -28791807) {
                break L1;
              } else {
                lj.b(43);
                break L1;
              }
            }
            stackOut_3_0 = um.field_Fb;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "lj.A(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "The game options are not all set.";
        field_i = "<%0> has dropped out.";
    }
}

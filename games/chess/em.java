/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    short[] field_J;
    short[] field_l;
    static String field_M;
    int field_n;
    static String[] field_m;
    int field_K;
    short[] field_B;
    short[] field_N;
    byte field_j;
    int[] field_D;
    static km[] field_r;
    int field_x;
    int[] field_h;
    short field_d;
    byte[] field_y;
    short field_t;
    int[] field_p;
    short[] field_H;
    private boolean field_c;
    int[] field_q;
    int[] field_s;
    short field_e;
    short[] field_f;
    short[] field_o;
    int field_I;
    short[] field_C;
    short[] field_z;
    short[] field_a;
    int[] field_u;
    short[] field_R;
    short[] field_b;
    short[] field_i;
    static int field_O;
    static String field_k;
    int[] field_Q;
    short[] field_G;
    short[] field_E;
    short[] field_F;
    int[] field_w;
    int field_P;
    short[] field_A;
    int field_v;
    int[] field_L;
    short[] field_g;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Chess.field_G;
        if (param2 != -70) {
            return;
        }
        for (var6 = 0; var6 < ((em) this).field_d; var6++) {
            ((em) this).field_z[var6] = (short)(param0 * ((em) this).field_z[var6] / param4);
            ((em) this).field_a[var6] = (short)(param1 * ((em) this).field_a[var6] / param4);
            ((em) this).field_H[var6] = (short)(param3 * ((em) this).field_H[var6] / param4);
        }
        int discarded$0 = 1;
        this.a();
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = Chess.field_G;
        for (var5 = 0; var5 < ((em) this).field_d; var5++) {
            ((em) this).field_z[var5] = (short)(((em) this).field_z[var5] + param1);
            ((em) this).field_a[var5] = (short)(((em) this).field_a[var5] + param0);
            ((em) this).field_H[var5] = (short)(((em) this).field_H[var5] + param2);
        }
        if (param3 != -81) {
            ((em) this).a(-105, 51, -27, (byte) -74);
        }
        int discarded$0 = 1;
        this.a();
    }

    private final void a() {
        ((em) this).field_c = false;
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        int var2 = Chess.field_G;
        try {
            for (var1_int = 0; qf.field_c > var1_int; var1_int++) {
                ik.field_i[var1_int] = null;
            }
            qf.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "em.G(" + false + ')');
        }
    }

    public static void b() {
        field_k = null;
        field_m = null;
        field_M = null;
        field_r = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, boolean param5, boolean param6, int param7, boolean param8, boolean param9) {
        int var11 = 0;
        L0: {
          var11 = Chess.field_G;
          if (param2) {
            break L0;
          } else {
            L1: {
              if (wb.field_h != vi.field_d) {
                break L1;
              } else {
                if (fn.field_c == wb.field_c) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (~wb.field_c != ~ph.field_j.field_i) {
              break L0;
            } else {
              if (wb.field_h == ph.field_j.field_e) {
                if (pd.field_Rb != null) {
                  cf.a(127, false);
                  break L0;
                } else {
                  if (ib.field_d != null) {
                    cf.a(122, true);
                    break L0;
                  } else {
                    e.g((byte) -127);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param2) {
            fl.field_x = ln.field_rc;
            break L2;
          } else {
            fl.field_x = (vi.field_d - 640) / 2;
            break L2;
          }
        }
        L3: {
          ge.a(false, param2);
          if (an.field_e <= 0) {
            break L3;
          } else {
            int discarded$2 = -120;
            tb.a(11, param2, param5);
            break L3;
          }
        }
        L4: {
          tn.field_j.field_fb = 1;
          tn.field_j.field_z = ic.field_c.field_z;
          if (aj.field_c <= 0) {
            break L4;
          } else {
            vg.a(param2, 11, (byte) -84, param5);
            break L4;
          }
        }
        L5: {
          if (0 < ed.field_c) {
            pc.a(param5, -91, param6, param2, 11);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (!jh.field_a) {
              break L7;
            } else {
              if (~pd.field_Rb.field_hc >= ~pd.field_Rb.field_Xb) {
                bh.field_G.field_tb = false;
                ib.field_c.field_Jb.field_db = oj.field_b;
                fm.a(ib.field_c.field_Kb, -128);
                break L6;
              } else {
                break L7;
              }
            }
          }
          ib.field_c.field_Jb.field_db = null;
          bh.field_G.field_tb = true;
          s.a(21487, ib.field_c, param9, 11, param3);
          break L6;
        }
        int discarded$3 = 1;
        mk.a(11, 16777215, param9, (byte) -68, 16777215, param3);
        s.a(21487, se.field_S, param9, 11, param3);
        g.field_c = g.field_c + 1;
    }

    final void a(int param0) {
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
        var12 = Chess.field_G;
        if (!((em) this).field_c) {
          ((em) this).field_c = true;
          var2 = param0;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((em) this).field_d) {
              ((em) this).field_x = var7;
              ((em) this).field_I = var3;
              ((em) this).field_n = var4;
              ((em) this).field_K = var5;
              ((em) this).field_P = var2;
              ((em) this).field_v = var6;
              return;
            } else {
              L1: {
                var9 = ((em) this).field_z[var8];
                var10 = ((em) this).field_a[var8];
                if (var2 > var9) {
                  var2 = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var10 <= var6) {
                  break L2;
                } else {
                  var6 = var10;
                  break L2;
                }
              }
              L3: {
                if (var9 > var5) {
                  var5 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var11 = ((em) this).field_H[var8];
                if (var3 > var10) {
                  var3 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var11 < var4) {
                  var4 = var11;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var11 > var7) {
                var7 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, km[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var21 = 0;
        int var22 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var22 = Chess.field_G;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (0 >= param2) {
                  break L1;
                } else {
                  if (param5 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (null != param1[3]) {
                        stackOut_9_0 = param1[3].field_v;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (param1[5] == null) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param1[5].field_v;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (param1[1] != null) {
                        stackOut_15_0 = param1[1].field_u;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    var8 = stackIn_16_0;
                    L5: {
                      if (null == param1[7]) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L5;
                      } else {
                        stackOut_19_0 = param1[7].field_u;
                        stackIn_21_0 = stackOut_19_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_21_0;
                      var10 = param2 + param3;
                      var11 = param5 + param0;
                      var12 = var6_int + param3;
                      var13 = var10 - var7;
                      var14 = param0 + var8;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var16 > var17) {
                        var17 = param3 + param2 * var6_int / (var7 + var6_int);
                        var16 = param3 + param2 * var6_int / (var7 + var6_int);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      wb.b(fa.field_d);
                      if (var19 < var18) {
                        var19 = param5 * var8 / (var9 + var8) + param0;
                        var18 = param5 * var8 / (var9 + var8) + param0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (null != param1[0]) {
                        wb.e(param3, param0, var16, var18);
                        param1[0].b(param3, param0);
                        wb.a(fa.field_d);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param1[2] != null) {
                        wb.e(var17, param0, var10, var18);
                        param1[2].b(var13, param0);
                        wb.a(fa.field_d);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param1[6] == null) {
                        break L10;
                      } else {
                        wb.e(param3, var19, var16, var11);
                        param1[6].b(param3, var15);
                        wb.a(fa.field_d);
                        break L10;
                      }
                    }
                    L11: {
                      if (param1[8] != null) {
                        wb.e(var17, var19, var10, var11);
                        param1[8].b(var13, var15);
                        wb.a(fa.field_d);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param1[1]) {
                        break L12;
                      } else {
                        if (param1[1].field_v == 0) {
                          break L12;
                        } else {
                          wb.e(var16, param0, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              wb.a(fa.field_d);
                              break L12;
                            } else {
                              param1[1].b(var20, param0);
                              var20 = var20 + param1[1].field_v;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (param1[7] == null) {
                        break L14;
                      } else {
                        if (0 == param1[7].field_v) {
                          break L14;
                        } else {
                          wb.e(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var20 >= var13) {
                              wb.a(fa.field_d);
                              break L14;
                            } else {
                              param1[7].b(var20, var15);
                              var20 = var20 + param1[7].field_v;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (null == param1[3]) {
                        break L16;
                      } else {
                        if (param1[3].field_u != 0) {
                          wb.e(param3, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var15 <= var20) {
                              wb.a(fa.field_d);
                              break L16;
                            } else {
                              param1[3].b(param3, var20);
                              var20 = var20 + param1[3].field_u;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (null == param1[5]) {
                        break L18;
                      } else {
                        if (param1[5].field_u == 0) {
                          break L18;
                        } else {
                          wb.e(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var15 <= var20) {
                              wb.a(fa.field_d);
                              break L18;
                            } else {
                              param1[5].b(var13, var20);
                              var20 = var20 + param1[5].field_u;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      if (null == param1[4]) {
                        break L20;
                      } else {
                        if (0 == param1[4].field_v) {
                          break L20;
                        } else {
                          if (param1[4].field_u != 0) {
                            wb.e(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var15 <= var20) {
                                wb.a(fa.field_d);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param1[4].field_u;
                                    continue L21;
                                  } else {
                                    param1[4].b(var21, var20);
                                    var21 = var21 + param1[4].field_v;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    break L0;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) var6;
            stackOut_75_1 = new StringBuilder().append("em.A(").append(param0).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param1 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L23;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L23;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ',' + param2 + ',' + param3 + ',' + 24599 + ',' + param5 + ')');
        }
    }

    em() {
        ((em) this).field_c = false;
        ((em) this).field_j = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Email: ";
        field_M = "All games";
    }
}

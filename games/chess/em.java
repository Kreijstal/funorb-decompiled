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
        this.a(true);
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
        this.a(true);
    }

    private final void a(boolean param0) {
        if (!param0) {
            ((em) this).a(121, 113, -33, (byte) 80);
        }
        ((em) this).field_c = false;
    }

    final static void b(boolean param0) {
        int var2 = Chess.field_G;
        int var1 = 0;
        if (param0) {
            field_m = null;
        }
        while (qf.field_c > var1) {
            ik.field_i[var1] = null;
            var1++;
        }
        qf.field_c = 0;
    }

    public static void b(int param0) {
        field_k = null;
        field_m = null;
        field_M = null;
        if (param0 != 3) {
            field_O = 75;
        }
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
            if ((wb.field_c ^ -1) != (ph.field_j.field_i ^ -1)) {
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
          if (param1 == 2) {
            break L3;
          } else {
            field_m = null;
            break L3;
          }
        }
        L4: {
          if (-1 <= (an.field_e ^ -1)) {
            break L4;
          } else {
            tb.a(param7, param2, param5, (byte) -120);
            break L4;
          }
        }
        L5: {
          tn.field_j.field_fb = 1;
          tn.field_j.field_z = ic.field_c.field_z;
          if (-1 <= (aj.field_c ^ -1)) {
            break L5;
          } else {
            vg.a(param2, param7, (byte) -84, param5);
            break L5;
          }
        }
        L6: {
          if (0 < ed.field_c) {
            pc.a(param5, -91, param6, param2, param7);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if (!jh.field_a) {
              break L8;
            } else {
              if ((pd.field_Rb.field_hc ^ -1) >= (pd.field_Rb.field_Xb ^ -1)) {
                bh.field_G.field_tb = false;
                ib.field_c.field_Jb.field_db = oj.field_b;
                fm.a(ib.field_c.field_Kb, -128);
                break L7;
              } else {
                break L8;
              }
            }
          }
          ib.field_c.field_Jb.field_db = null;
          bh.field_G.field_tb = true;
          s.a(21487, ib.field_c, param9, param7, param3);
          break L7;
        }
        mk.a(param7, param4, param9, (byte) -68, param0, param3, param8);
        s.a(param1 + 21485, se.field_S, param9, param7, param3);
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var22 = Chess.field_G;
        if (param1 != null) {
          if (0 >= param2) {
            return;
          } else {
            if (param5 <= 0) {
              return;
            } else {
              L0: {
                if (null != param1[3]) {
                  stackOut_8_0 = param1[3].field_v;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  break L0;
                }
              }
              L1: {
                var6 = stackIn_9_0;
                if (param1[5] == null) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L1;
                } else {
                  stackOut_10_0 = param1[5].field_v;
                  stackIn_12_0 = stackOut_10_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_12_0;
                if (param1[1] != null) {
                  stackOut_14_0 = param1[1].field_u;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L2;
                }
              }
              var8 = stackIn_15_0;
              if (param4 == 24599) {
                L3: {
                  if (null == param1[7]) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L3;
                  } else {
                    stackOut_18_0 = param1[7].field_u;
                    stackIn_20_0 = stackOut_18_0;
                    break L3;
                  }
                }
                L4: {
                  var9 = stackIn_20_0;
                  var10 = param2 + param3;
                  var11 = param5 + param0;
                  var12 = var6 + param3;
                  var13 = var10 - var7;
                  var14 = param0 + var8;
                  var15 = var11 - var9;
                  var16 = var12;
                  var17 = var13;
                  if (var16 > var17) {
                    var17 = param3 + param2 * var6 / (var7 + var6);
                    var16 = param3 + param2 * var6 / (var7 + var6);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var18 = var14;
                  var19 = var15;
                  wb.b(fa.field_d);
                  if (var19 < var18) {
                    var19 = param5 * var8 / (var9 + var8) + param0;
                    var18 = param5 * var8 / (var9 + var8) + param0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (null != param1[0]) {
                    wb.e(param3, param0, var16, var18);
                    param1[0].b(param3, param0);
                    wb.a(fa.field_d);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param1[2] != null) {
                    wb.e(var17, param0, var10, var18);
                    param1[2].b(var13, param0);
                    wb.a(fa.field_d);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param1[6] == null) {
                    break L8;
                  } else {
                    wb.e(param3, var19, var16, var11);
                    param1[6].b(param3, var15);
                    wb.a(fa.field_d);
                    break L8;
                  }
                }
                L9: {
                  if (param1[8] != null) {
                    wb.e(var17, var19, var10, var11);
                    param1[8].b(var13, var15);
                    wb.a(fa.field_d);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (null == param1[1]) {
                    break L10;
                  } else {
                    if (param1[1].field_v == 0) {
                      break L10;
                    } else {
                      wb.e(var16, param0, var17, var18);
                      var20 = var12;
                      L11: while (true) {
                        L12: {
                          if (var20 >= var13) {
                            break L12;
                          } else {
                            param1[1].b(var20, param0);
                            var20 = var20 + param1[1].field_v;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        wb.a(fa.field_d);
                        break L10;
                      }
                    }
                  }
                }
                L13: {
                  if (param1[7] == null) {
                    break L13;
                  } else {
                    if (0 == param1[7].field_v) {
                      break L13;
                    } else {
                      wb.e(var16, var19, var17, var11);
                      var20 = var12;
                      L14: while (true) {
                        L15: {
                          if (var20 >= var13) {
                            break L15;
                          } else {
                            param1[7].b(var20, var15);
                            var20 = var20 + param1[7].field_v;
                            if (0 == 0) {
                              continue L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        wb.a(fa.field_d);
                        break L13;
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
                        L18: {
                          if (var15 <= var20) {
                            break L18;
                          } else {
                            param1[3].b(param3, var20);
                            var20 = var20 + param1[3].field_u;
                            if (0 == 0) {
                              continue L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        wb.a(fa.field_d);
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                L19: {
                  if (null == param1[5]) {
                    break L19;
                  } else {
                    if (param1[5].field_u == 0) {
                      break L19;
                    } else {
                      wb.e(var17, var18, var10, var19);
                      var20 = var14;
                      L20: while (true) {
                        L21: {
                          if (var15 <= var20) {
                            break L21;
                          } else {
                            param1[5].b(var13, var20);
                            var20 = var20 + param1[5].field_u;
                            if (0 == 0) {
                              continue L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        wb.a(fa.field_d);
                        break L19;
                      }
                    }
                  }
                }
                L22: {
                  if (null == param1[4]) {
                    break L22;
                  } else {
                    if (0 == param1[4].field_v) {
                      break L22;
                    } else {
                      if (-1 != (param1[4].field_u ^ -1)) {
                        wb.e(var16, var18, var17, var19);
                        var20 = var14;
                        L23: while (true) {
                          L24: {
                            if (var15 <= var20) {
                              break L24;
                            } else {
                              var21 = var12;
                              L25: while (true) {
                                L26: {
                                  if (var21 >= var13) {
                                    break L26;
                                  } else {
                                    param1[4].b(var21, var20);
                                    var21 = var21 + param1[4].field_v;
                                    if (0 == 0) {
                                      continue L25;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                var20 = var20 + param1[4].field_u;
                                if (0 == 0) {
                                  continue L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                          wb.a(fa.field_d);
                          break L22;
                        }
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
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

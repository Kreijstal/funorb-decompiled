/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends tf {
    private int field_o;
    int field_R;
    ml field_s;
    int field_G;
    boolean field_D;
    static kc field_V;
    int field_db;
    int field_T;
    int field_kb;
    int field_p;
    private int field_N;
    private int field_y;
    int field_lb;
    boolean field_U;
    int field_jb;
    double field_F;
    private int field_r;
    int field_X;
    int field_W;
    private int field_O;
    private int field_n;
    boolean field_J;
    private qb field_B;
    mi field_gb;
    int field_E;
    int field_u;
    static ll[] field_v;
    private qb field_cb;
    private qb field_bb;
    int field_M;
    static byte[] field_m;
    private boolean field_hb;
    int field_q;
    int field_P;
    private int field_t;
    private int field_ab;
    private nf field_L;
    qb field_w;
    int field_eb;
    private int field_A;
    int field_ib;
    private qb field_Q;
    private qb field_fb;
    static kc field_S;
    private int field_Z;
    int field_x;
    qb field_I;
    boolean field_z;
    static String field_K;
    int field_Y;
    static pe field_H;

    final boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                boolean discarded$2 = ((ml) this).x(99);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ml) this).field_ib <= 0) {
                  break L3;
                } else {
                  if (((ml) this).b((byte) -81)) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.MB(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final int v(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -110) {
                break L1;
              } else {
                boolean discarded$2 = this.e(true);
                break L1;
              }
            }
            stackOut_3_0 = ((ml) this).field_q;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.JA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            var4 = -72 / ((param1 - 4) / 62);
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int <= var5) {
                    break L3;
                  } else {
                    stackOut_3_0 = fe.a((byte) 74, param0.charAt(var5)) + ((var3 << -118977147) + -var3);
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var3 = stackIn_4_0;
                      var5++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = var3;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("ml.C(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final int g(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((ml) this).field_eb = -102;
                break L1;
              }
            }
            stackOut_3_0 = ((ml) this).field_u;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.IB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void g(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        mi var2_ref = null;
        int var3_int = 0;
        double var3 = 0.0;
        int var4_int = 0;
        mi var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        mi var7 = null;
        int var8 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_17_0 = false;
        int stackOut_28_0 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -5445) {
                break L1;
              } else {
                boolean discarded$1 = ((ml) this).t(22);
                break L1;
              }
            }
            L2: {
              if (2 != ((ml) this).field_ab) {
                break L2;
              } else {
                if (null == ((ml) this).field_s) {
                  var2_int = ((ml) this).field_L.field_y * ((ml) this).field_T / 6;
                  var3_int = -var2_int + ((ml) this).field_lb;
                  var4_int = ((ml) this).field_db + (-(((ml) this).field_Y >> 120148673) - -480);
                  if (var4_int <= 0) {
                    break L2;
                  } else {
                    L3: {
                      var5 = Math.abs(var4_int);
                      if (Math.abs(var3_int) > Math.abs(var4_int)) {
                        var5 = Math.abs(var3_int);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6 = 1;
                    var7_int = var5;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var7_int <= 0) {
                            break L6;
                          } else {
                            jo.field_b = false;
                            stackOut_17_0 = ((ml) this).field_L.a(-(((ml) this).field_Y >> 1783464865) + (((ml) this).field_db + -(var4_int * var7_int / var5)), -(var7_int * var3_int / var5) + ((ml) this).field_lb, (byte) -83);
                            stackIn_29_0 = stackOut_17_0 ? 1 : 0;
                            stackIn_18_0 = stackOut_17_0;
                            if (var8 != 0) {
                              break L5;
                            } else {
                              L7: {
                                if (!stackIn_18_0) {
                                  break L7;
                                } else {
                                  if (jo.field_b) {
                                    break L7;
                                  } else {
                                    var6 = 0;
                                    if (var8 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var7_int--;
                              if (var8 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        stackOut_28_0 = var6;
                        stackIn_29_0 = stackOut_28_0;
                        break L5;
                      }
                      if (stackIn_29_0 != 0) {
                        var7 = aj.a((ml) this, -480, false, 114, ((ml) this).field_L, var2_int);
                        var7.field_F = var4_int;
                        var7.field_u = var3_int;
                        ((ml) this).field_L.b(52, var7);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            L8: {
              if (((ml) this).field_jb != 12) {
                break L8;
              } else {
                if (Math.random() * 75.0 >= (double)((ml) this).field_ib) {
                  break L8;
                } else {
                  var2_int = (int)(Math.random() * (double)((ml) this).field_w.field_q);
                  var3_int = (int)(Math.random() * (double)((ml) this).field_w.field_y);
                  if (((ml) this).field_w.field_A[var3_int * ((ml) this).field_w.field_q + var2_int] != 0) {
                    var4 = aj.a((ml) null, -256 + (var3_int + ((ml) this).field_db) - -((ml) this).field_w.field_o, false, 109, ((ml) this).field_L, -128 + ((ml) this).field_w.field_x + (var2_int + ((ml) this).field_lb));
                    ((ml) this).field_L.b(52, var4);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (((ml) this).field_jb == 25) {
                var2_ref = aj.a((ml) null, ((ml) this).field_db - (((ml) this).field_Y >> 993997537), false, 100, ((ml) this).field_L, ((ml) this).field_lb);
                var3 = Math.random() * 6.28;
                var2_ref.field_u = (int)((double)(12 * -((ml) this).field_E) + 16.0 * Math.sin(var3));
                var2_ref.field_F = (int)(Math.cos(var3) * 16.0);
                ((ml) this).field_L.b(52, var2_ref);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (((ml) this).field_jb == 19) {
                var2_ref = aj.a((ml) null, ((ml) this).field_db, false, 100, ((ml) this).field_L, ((ml) this).field_lb);
                var3 = Math.random() * 6.28;
                var2_ref.field_F = (int)(8.0 + Math.sin(var3) * 12.0);
                var2_ref.field_u = (int)(16.0 * Math.cos(var3));
                ((ml) this).field_L.b(param0 + 5497, var2_ref);
                break L10;
              } else {
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.HA(" + param0 + ')');
        }
    }

    final int p(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -8323) {
              stackOut_3_0 = ((ml) this).field_Y;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -90;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.WA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (20 == ((ml) this).field_jb) {
                ((ml) this).field_q = 25;
                ((ml) this).field_Y = uj.field_i[0].field_w;
                ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                ((ml) this).field_w.a();
                uj.field_i[0].a(((ml) this).field_Y / 2 - uj.field_i[0].field_n / 2, 0, 16777215);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ml) this).field_jb == 22) {
                ((ml) this).field_q = 75;
                ((ml) this).field_Y = uj.field_i[1].field_w;
                ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                ((ml) this).field_w.a();
                uj.field_i[1].a(-(uj.field_i[1].field_n / 2) + ((ml) this).field_Y / 2, 0, 16777215);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == 6) {
                break L3;
              } else {
                ((ml) this).field_gb = null;
                break L3;
              }
            }
            L4: {
              if (((ml) this).field_jb != 38) {
                break L4;
              } else {
                ((ml) this).field_Y = uj.field_i[6].field_w;
                ((ml) this).field_q = 75;
                ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                ((ml) this).field_w.a();
                uj.field_i[6].a(-(uj.field_i[6].field_n / 2) + ((ml) this).field_Y / 2, 0, 16777215);
                break L4;
              }
            }
            L5: {
              if (((ml) this).field_jb == 21) {
                ((ml) this).field_q = 100;
                ((ml) this).field_Y = uj.field_i[2].field_w;
                ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                ((ml) this).field_w.a();
                uj.field_i[2].a(((ml) this).field_Y / 2 + -(uj.field_i[2].field_n / 2), 0, 16777215);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((ml) this).field_jb != 23) {
                break L6;
              } else {
                ((ml) this).field_Y = uj.field_i[3].field_w;
                ((ml) this).field_q = 75;
                ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                ((ml) this).field_w.a();
                uj.field_i[3].a(-(uj.field_i[3].field_n / 2) + ((ml) this).field_Y / 2, 0, 16777215);
                break L6;
              }
            }
            L7: {
              if (((ml) this).field_jb != 24) {
                break L7;
              } else {
                ((ml) this).field_Y = uj.field_i[4].field_w;
                ((ml) this).field_q = 75;
                ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                ((ml) this).field_w.a();
                uj.field_i[4].a(-(uj.field_i[4].field_n / 2) + ((ml) this).field_Y / 2, 0, 16777215);
                break L7;
              }
            }
            L8: {
              if (((ml) this).field_jb == 35) {
                ((ml) this).field_Y = -16 + (80 + uj.field_i[5].field_w);
                ((ml) this).field_q = 75;
                ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                ((ml) this).field_w.a();
                uj.field_i[5].a(((ml) this).field_Y / 2 + -(uj.field_i[5].field_n / 2), 64, 16777215);
                de.i(((ml) this).field_Y / 2, 80, 16, 16777215);
                break L8;
              } else {
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.EA(" + param0 + ')');
        }
    }

    final boolean g(byte param0) {
        RuntimeException var2 = null;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 88) {
                break L1;
              } else {
                ((ml) this).field_N = 58;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ml) this).field_jb == 20) {
                  break L3;
                } else {
                  if (22 == ((ml) this).field_jb) {
                    break L3;
                  } else {
                    if (((ml) this).field_jb == 21) {
                      break L3;
                    } else {
                      if (((ml) this).field_jb == 23) {
                        break L3;
                      } else {
                        if (((ml) this).field_jb == 24) {
                          break L3;
                        } else {
                          if (((ml) this).field_jb == 35) {
                            break L3;
                          } else {
                            if (((ml) this).field_jb != 38) {
                              stackOut_24_0 = 0;
                              stackIn_25_0 = stackOut_24_0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_22_0 = 1;
              stackIn_25_0 = stackOut_22_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.AB(" + param0 + ')');
        }
        return stackIn_25_0 != 0;
    }

    final void a(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ml var7 = null;
        mi var7_ref = null;
        mi var8 = null;
        int var9 = 0;
        ml stackIn_4_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        Object stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_3_0 = null;
        pg stackOut_14_0 = null;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        Object stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var6 = 16384;
            pi.field_b.a((byte) 95, ((ml) this).field_L.field_i);
            var7 = (ml) (Object) pi.field_b.b(-83);
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = (ml) var7;
                    stackIn_15_0 = (Object) (Object) stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0.field_jb == 19) {
                          var4 = -var7.field_db + (-48 + ((ml) this).field_db);
                          var3_int = -var7.field_lb + ((ml) this).field_lb;
                          var5 = var3_int * var3_int + var4 * var4;
                          if (var5 < var6) {
                            var7.field_z = true;
                            var7.field_jb = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var7 = (ml) (Object) pi.field_b.d(-18502);
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                pi.field_b.a((byte) 91, ((ml) this).field_L.field_Kb);
                stackOut_14_0 = pi.field_b.b(-58);
                stackIn_15_0 = (Object) (Object) stackOut_14_0;
                break L2;
              }
              L5: {
                var7_ref = (mi) (Object) stackIn_15_0;
                if (param1) {
                  break L5;
                } else {
                  ((ml) this).a(-6, -62);
                  break L5;
                }
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if (null == var7_ref) {
                      break L8;
                    } else {
                      if (var9 != 0) {
                        break L7;
                      } else {
                        L9: {
                          L10: {
                            if (var7_ref.field_I == 55) {
                              break L10;
                            } else {
                              if (157 == var7_ref.field_I) {
                                break L10;
                              } else {
                                if (var7_ref.field_I == 168) {
                                  break L10;
                                } else {
                                  if (111 == var7_ref.field_I) {
                                    break L10;
                                  } else {
                                    if (var7_ref.field_I == 68) {
                                      break L10;
                                    } else {
                                      if (var7_ref.field_I == 69) {
                                        break L10;
                                      } else {
                                        if (var7_ref.field_I == 70) {
                                          break L10;
                                        } else {
                                          if (var7_ref.field_I == 56) {
                                            break L10;
                                          } else {
                                            if (var7_ref.field_I == 106) {
                                              break L10;
                                            } else {
                                              if (var7_ref.field_I == 107) {
                                                break L10;
                                              } else {
                                                if (var7_ref.field_I == 117) {
                                                  break L10;
                                                } else {
                                                  if (var7_ref.field_I == 3) {
                                                    break L10;
                                                  } else {
                                                    if (121 == var7_ref.field_I) {
                                                      break L10;
                                                    } else {
                                                      if (var7_ref.field_I == 149) {
                                                        break L10;
                                                      } else {
                                                        break L9;
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
                              }
                            }
                          }
                          var3_int = -var7_ref.field_v + ((ml) this).field_lb;
                          var4 = -var7_ref.field_G + ((ml) this).field_db + -48;
                          var5 = var3_int * var3_int - -(var4 * var4);
                          if (var5 < var6) {
                            L11: {
                              if (this == (Object) (Object) var7_ref.field_t) {
                                break L11;
                              } else {
                                if (117 == var7_ref.field_I) {
                                  break L11;
                                } else {
                                  if (var7_ref.field_I == 3) {
                                    break L11;
                                  } else {
                                    if (149 != var7_ref.field_I) {
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            L12: {
                              if (!param0) {
                                break L12;
                              } else {
                                var8 = aj.a((ml) this, var7_ref.field_G, false, 154, ((ml) this).field_L, var7_ref.field_v);
                                ((ml) this).field_L.b(52, var8);
                                var8 = aj.a((ml) this, -48 + ((ml) this).field_db, false, 108, ((ml) this).field_L, ((ml) this).field_lb);
                                ((ml) this).field_L.b(52, var8);
                                break L12;
                              }
                            }
                            L13: {
                              if (var7_ref.field_I == 157) {
                                break L13;
                              } else {
                                if (var7_ref.field_I == 168) {
                                  break L13;
                                } else {
                                  var7_ref.f(0);
                                  if (var9 == 0) {
                                    break L9;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var7_ref.field_y = -1;
                            var7_ref.a(((ml) this).field_L.n((byte) -75), (byte) -83, ((ml) this).field_L.field_t, ((ml) this).field_L.field_mb);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L14: {
                          if (var7_ref.field_I != 149) {
                            break L14;
                          } else {
                            var3_int = -var7_ref.field_u + (-var7_ref.field_v + ((ml) this).field_lb);
                            var4 = -var7_ref.field_G + (-48 + (((ml) this).field_db + -var7_ref.field_F));
                            var5 = var3_int * var3_int - -(var4 * var4);
                            if (~var6 >= ~var5) {
                              break L14;
                            } else {
                              L15: {
                                if (param0) {
                                  L16: {
                                    stackOut_95_0 = this;
                                    stackOut_95_1 = var7_ref.field_G;
                                    stackIn_98_0 = stackOut_95_0;
                                    stackIn_98_1 = stackOut_95_1;
                                    stackIn_96_0 = stackOut_95_0;
                                    stackIn_96_1 = stackOut_95_1;
                                    if (param1) {
                                      stackOut_98_0 = this;
                                      stackOut_98_1 = stackIn_98_1;
                                      stackOut_98_2 = 0;
                                      stackIn_99_0 = stackOut_98_0;
                                      stackIn_99_1 = stackOut_98_1;
                                      stackIn_99_2 = stackOut_98_2;
                                      break L16;
                                    } else {
                                      stackOut_96_0 = this;
                                      stackOut_96_1 = stackIn_96_1;
                                      stackOut_96_2 = 1;
                                      stackIn_99_0 = stackOut_96_0;
                                      stackIn_99_1 = stackOut_96_1;
                                      stackIn_99_2 = stackOut_96_2;
                                      break L16;
                                    }
                                  }
                                  var8 = aj.a((ml) this, stackIn_99_1, stackIn_99_2 != 0, 154, ((ml) this).field_L, var7_ref.field_v);
                                  ((ml) this).field_L.b(52, var8);
                                  var8 = aj.a((ml) this, ((ml) this).field_db + -48, false, 108, ((ml) this).field_L, ((ml) this).field_lb);
                                  ((ml) this).field_L.b(52, var8);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              var7_ref.f(0);
                              break L14;
                            }
                          }
                        }
                        var7_ref = (mi) (Object) pi.field_b.d(-18502);
                        if (var9 == 0) {
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
          throw aa.a((Throwable) (Object) var3, "ml.K(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean s(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              if (~(((ml) this).field_X >> -1454644252) > ~(((ml) this).field_Y / 2)) {
                break L1;
              } else {
                if (~(((ml) this).field_X >> 1735964836) < ~(-(((ml) this).field_Y / 2) + ((ml) this).field_L.field_y)) {
                  break L1;
                } else {
                  L2: {
                    if (param0 == -1) {
                      break L2;
                    } else {
                      ((ml) this).field_t = 29;
                      break L2;
                    }
                  }
                  L3: {
                    if (null == ((ml) this).field_gb) {
                      break L3;
                    } else {
                      if (((ml) this).field_gb.field_I == 121) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (this.f((byte) -107)) {
                        break L5;
                      } else {
                        if (8 == ((ml) this).field_jb) {
                          break L5;
                        } else {
                          if (((ml) this).field_jb == 6) {
                            break L5;
                          } else {
                            if (((ml) this).field_jb == 25) {
                              break L5;
                            } else {
                              if (10 == ((ml) this).field_jb) {
                                break L5;
                              } else {
                                L6: {
                                  if (((ml) this).field_lb < 0) {
                                    break L6;
                                  } else {
                                    if (~((ml) this).field_lb < ~((ml) this).field_L.field_y) {
                                      break L6;
                                    } else {
                                      if (((ml) this).field_jb == 19) {
                                        break L5;
                                      } else {
                                        if (18 != ((ml) this).field_jb) {
                                          break L6;
                                        } else {
                                          if (((ml) this).field_x > 0) {
                                            break L6;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_49_0 = 0;
                                stackIn_50_0 = stackOut_49_0;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_47_0 = 1;
                    stackIn_50_0 = stackOut_47_0;
                    break L4;
                  }
                  break L0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.DA(" + param0 + ')');
        }
        return stackIn_50_0 != 0;
    }

    private final boolean f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -107) {
              L1: {
                L2: {
                  if (((ml) this).j(param0 + 81)) {
                    break L2;
                  } else {
                    if (((ml) this).field_jb != 17) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = 1;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.LB(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final boolean t(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 25) {
              L1: {
                if (((ml) this).field_s != null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.H(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void c(int param0, int param1, int param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        mi var7_ref_mi = null;
        int var7 = 0;
        int var8 = 0;
        qb var8_ref_qb = null;
        int var9 = 0;
        int var10 = 0;
        mi var10_ref_mi = null;
        int var11 = 0;
        int var12 = 0;
        qb var12_ref_qb = null;
        Object var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        qb var21 = null;
        int var21_int = 0;
        int[] var22 = null;
        int var22_int = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var28 = null;
        int var29 = 0;
        int var30 = 0;
        qb var31 = null;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        ll[] stackIn_155_0 = null;
        ll[] stackIn_156_0 = null;
        ll[] stackIn_157_0 = null;
        ll[] stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        ll[] stackIn_160_0 = null;
        ll[] stackIn_161_0 = null;
        ll[] stackIn_162_0 = null;
        ll[] stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        int stackIn_488_0 = 0;
        int stackIn_488_1 = 0;
        int stackIn_495_0 = 0;
        int stackIn_495_1 = 0;
        ll[] stackOut_154_0 = null;
        ll[] stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        ll[] stackOut_155_0 = null;
        ll[] stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        ll[] stackOut_159_0 = null;
        ll[] stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        ll[] stackOut_160_0 = null;
        ll[] stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        int stackOut_487_0 = 0;
        int stackOut_487_1 = 0;
        int stackOut_494_0 = 0;
        int stackOut_494_1 = 0;
        L0: {
          var34 = ArcanistsMulti.field_G ? 1 : 0;
          if (!((ml) this).field_J) {
            ((ml) this).a(12, false);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = new int[]{param1 + ((ml) this).field_lb, ((ml) this).field_db + param0};
            if (28 == ((ml) this).field_jb) {
              break L2;
            } else {
              if (((ml) this).field_jb == 29) {
                break L2;
              } else {
                if (((ml) this).field_jb == 30) {
                  break L2;
                } else {
                  if (((ml) this).field_jb != 32) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          if (-16 + ((ml) this).field_L.field_H > ((ml) this).field_db) {
            break L1;
          } else {
            var4[1] = (int)((double)var4[1] - (8.0 * Math.sin(3.141592653589793 * (double)ge.field_r / 64.0) + 2.0));
            break L1;
          }
        }
        L3: {
          var5 = nj.field_n[((ml) this).field_u];
          if (((ml) this).field_jb == 39) {
            if (((ml) this).field_F <= 2.5) {
              break L3;
            } else {
              var7_ref_mi = aj.a((ml) null, ((ml) this).field_db + (-(((ml) this).p(-8323) / 2) - -13), false, 166, ((ml) this).field_L, -(42 * ((ml) this).field_E) + ((ml) this).field_lb);
              var7_ref_mi.field_u = 20 * -((ml) this).field_E;
              var7_ref_mi.field_F = (int)(-5.0 + 15.0 * Math.random());
              ((ml) this).field_L.b(52, var7_ref_mi);
              break L3;
            }
          } else {
            break L3;
          }
        }
        L4: {
          var6 = 0;
          if (((ml) this).field_jb != 38) {
            break L4;
          } else {
            if (((ml) this).field_F <= 0.0) {
              break L4;
            } else {
              L5: {
                if (1.0 <= ((ml) this).field_F) {
                  break L5;
                } else {
                  var7_ref_mi = aj.a((ml) null, 13 + ((ml) this).field_db - ((ml) this).p(param2 ^ -1703912164) / 2, false, 166, ((ml) this).field_L, -(((ml) this).field_E * 22) + ((ml) this).field_lb);
                  var7_ref_mi.field_u = -((ml) this).field_E * 10;
                  var7_ref_mi.field_F = (int)(-5.0 + 15.0 * Math.random());
                  ((ml) this).field_L.b(52, var7_ref_mi);
                  if (var34 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (2.0 > ((ml) this).field_F) {
                  break L6;
                } else {
                  L7: {
                    if (((ml) this).field_F >= 3.0) {
                      break L7;
                    } else {
                      var7_ref_mi = aj.a((ml) null, -12 + (((ml) this).field_db + -(((ml) this).p(-8323) / 2)), false, 166, ((ml) this).field_L, ((ml) this).field_lb - ((ml) this).field_E * 22);
                      var7_ref_mi.field_u = 10 * -((ml) this).field_E;
                      var7_ref_mi.field_F = (int)(15.0 * Math.random() - 10.0);
                      ((ml) this).field_L.b(52, var7_ref_mi);
                      if (var34 == 0) {
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (4.0 > ((ml) this).field_F) {
                    var7_ref_mi = aj.a((ml) null, ((ml) this).field_db + (-(((ml) this).p(param2 ^ -1703912164) / 2) - -13 + -5), false, 166, ((ml) this).field_L, ((ml) this).field_lb - -(((ml) this).field_E * 22));
                    var7_ref_mi.field_u = 30 * ((ml) this).field_E;
                    var7_ref_mi.field_F = (int)(Math.random() * 15.0);
                    ((ml) this).field_L.b(52, var7_ref_mi);
                    if (var34 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              var7_ref_mi = aj.a((ml) null, -30 + ((ml) this).field_db - (((ml) this).p(-8323) / 2 + -13), false, 166, ((ml) this).field_L, ((ml) this).field_lb + ((ml) this).field_E * 22);
              var7_ref_mi.field_u = 30 * ((ml) this).field_E;
              var7_ref_mi.field_F = (int)(15.0 * Math.random() - 15.0);
              ((ml) this).field_L.b(52, var7_ref_mi);
              break L4;
            }
          }
        }
        L8: {
          if (12 != ((ml) this).field_jb) {
            break L8;
          } else {
            de.h(param1, param0, ((ml) this).field_L.field_y + param1, an.field_j);
            go.field_j[29].a(-128 + var4[0], var4[1] + -256);
            de.a();
            break L8;
          }
        }
        L9: {
          L10: {
            if (((ml) this).field_jb == 40) {
              break L10;
            } else {
              L11: {
                if (((ml) this).field_jb == 20) {
                  break L11;
                } else {
                  L12: {
                    if (((ml) this).field_jb == 22) {
                      break L12;
                    } else {
                      L13: {
                        if (((ml) this).field_jb != 38) {
                          break L13;
                        } else {
                          uj.field_i[6].c(-(uj.field_i[6].field_n / 2) + var4[0], -((ml) this).field_Y + var4[1]);
                          if (null == ((ml) this).field_I) {
                            break L9;
                          } else {
                            ((ml) this).field_I.e(-16 + var4[0], var6 + -(((ml) this).field_Y >> -1815421503) + var4[1] + -32);
                            if (var34 == 0) {
                              break L9;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      L14: {
                        if (((ml) this).field_jb != 21) {
                          break L14;
                        } else {
                          uj.field_i[2].c(-(uj.field_i[2].field_n / 2) + var4[0], -((ml) this).field_Y + var4[1]);
                          if (null == ((ml) this).field_I) {
                            break L9;
                          } else {
                            ((ml) this).field_I.e(-16 + var4[0], var4[1] + -(((ml) this).field_Y >> 507989281) + (-32 - -var6));
                            if (var34 == 0) {
                              break L9;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      L15: {
                        if (((ml) this).field_jb != 23) {
                          break L15;
                        } else {
                          uj.field_i[3].c(-(uj.field_i[3].field_n / 2) + var4[0], var4[1] + -((ml) this).field_Y);
                          if (((ml) this).field_I != null) {
                            ((ml) this).field_I.e(var4[0] - 16, var6 + (-32 + var4[1] - (((ml) this).field_Y >> 1449610177)));
                            if (var34 == 0) {
                              break L9;
                            } else {
                              break L15;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      L16: {
                        if (24 != ((ml) this).field_jb) {
                          break L16;
                        } else {
                          uj.field_i[4].c(var4[0] - uj.field_i[4].field_n / 2, -((ml) this).field_Y + var4[1]);
                          if (((ml) this).field_I != null) {
                            ((ml) this).field_I.e(var4[0] + -16, var6 + var4[1] - (((ml) this).field_Y >> -1600813727) - 32);
                            if (var34 == 0) {
                              break L9;
                            } else {
                              break L16;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      L17: {
                        if (((ml) this).field_jb == 35) {
                          break L17;
                        } else {
                          L18: {
                            if (((ml) this).field_jb != 26) {
                              break L18;
                            } else {
                              if (ff.field_b == null) {
                                break L18;
                              } else {
                                L19: {
                                  var7 = 0;
                                  if (((ml) this).field_F <= 1.5) {
                                    break L19;
                                  } else {
                                    var7 = 1;
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (((ml) this).field_F > 3.0) {
                                    var7 = 2;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                L21: {
                                  if (4.5 >= ((ml) this).field_F) {
                                    break L21;
                                  } else {
                                    var7 = 3;
                                    break L21;
                                  }
                                }
                                L22: {
                                  if (0.0 > ((ml) this).field_F) {
                                    L23: {
                                      var7 = 4;
                                      if (((ml) this).field_F > -2.0) {
                                        var7 = 5;
                                        break L23;
                                      } else {
                                        break L23;
                                      }
                                    }
                                    if (((ml) this).field_F > -1.0) {
                                      var7 = 6;
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  } else {
                                    break L22;
                                  }
                                }
                                L24: {
                                  L25: {
                                    if (((ml) this).field_E != -1) {
                                      break L25;
                                    } else {
                                      ff.field_b[var7].d(var4[0] + -(((ml) this).field_Y >> -955111135), var4[1] - ((ml) this).field_Y);
                                      if (var34 == 0) {
                                        break L24;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  ff.field_b[var7].a(var4[0] + -(((ml) this).field_Y >> 1703903841), var4[1] + -((ml) this).field_Y);
                                  break L24;
                                }
                                if (var34 == 0) {
                                  break L9;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          L26: {
                            if (((ml) this).field_jb != 39) {
                              break L26;
                            } else {
                              if (ub.field_e == null) {
                                break L26;
                              } else {
                                L27: {
                                  var7 = 0;
                                  if (((ml) this).field_F <= 1.5) {
                                    break L27;
                                  } else {
                                    var7 = 1;
                                    break L27;
                                  }
                                }
                                L28: {
                                  if (((ml) this).field_F <= 3.0) {
                                    break L28;
                                  } else {
                                    var7 = 2;
                                    break L28;
                                  }
                                }
                                L29: {
                                  if (4.5 < ((ml) this).field_F) {
                                    var7 = 3;
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                                L30: {
                                  if (0.0 <= ((ml) this).field_F) {
                                    break L30;
                                  } else {
                                    L31: {
                                      var7 = 4;
                                      if (-2.0 < ((ml) this).field_F) {
                                        var7 = 5;
                                        break L31;
                                      } else {
                                        break L31;
                                      }
                                    }
                                    if (((ml) this).field_F <= -1.0) {
                                      break L30;
                                    } else {
                                      var7 = 6;
                                      break L30;
                                    }
                                  }
                                }
                                L32: {
                                  L33: {
                                    if (-1 == ((ml) this).field_E) {
                                      break L33;
                                    } else {
                                      ub.field_e[var7].a(var4[0] - (((ml) this).field_Y >> 417241281), -((ml) this).field_Y + var4[1]);
                                      if (var34 == 0) {
                                        break L32;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                  ub.field_e[var7].d(-(((ml) this).field_Y >> 1106014241) + var4[0], var4[1] + -((ml) this).field_Y);
                                  break L32;
                                }
                                if (var34 == 0) {
                                  break L9;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          L34: {
                            L35: {
                              if (13 != ((ml) this).field_jb) {
                                break L35;
                              } else {
                                if (rc.field_d != null) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            L36: {
                              L37: {
                                if (15 != ((ml) this).field_jb) {
                                  break L37;
                                } else {
                                  if (bk.field_L != null) {
                                    break L36;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (14 != ((ml) this).field_jb) {
                                  break L38;
                                } else {
                                  if (null == jk.field_m) {
                                    break L38;
                                  } else {
                                    L39: {
                                      var7 = 0;
                                      if (((ml) this).field_F > 1.5) {
                                        var7 = 1;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                    L40: {
                                      if (((ml) this).field_F <= 3.0) {
                                        break L40;
                                      } else {
                                        var7 = 2;
                                        break L40;
                                      }
                                    }
                                    L41: {
                                      if (((ml) this).field_F <= 4.5) {
                                        break L41;
                                      } else {
                                        var7 = 3;
                                        break L41;
                                      }
                                    }
                                    L42: {
                                      if (0.0 <= ((ml) this).field_F) {
                                        break L42;
                                      } else {
                                        L43: {
                                          var7 = 4;
                                          if (-2.0 >= ((ml) this).field_F) {
                                            break L43;
                                          } else {
                                            var7 = 5;
                                            break L43;
                                          }
                                        }
                                        if (-1.0 >= ((ml) this).field_F) {
                                          break L42;
                                        } else {
                                          var7 = 6;
                                          break L42;
                                        }
                                      }
                                    }
                                    L44: {
                                      L45: {
                                        if (-1 == ((ml) this).field_E) {
                                          break L45;
                                        } else {
                                          jk.field_m[var7].a(var4[0] + -(((ml) this).field_Y >> -948359583), var4[1] - ((ml) this).field_Y);
                                          if (var34 == 0) {
                                            break L44;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                      jk.field_m[var7].d(-(((ml) this).field_Y >> -450855967) + var4[0], var4[1] - ((ml) this).field_Y);
                                      break L44;
                                    }
                                    if (var34 == 0) {
                                      break L9;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (17 != ((ml) this).field_jb) {
                                  break L46;
                                } else {
                                  if (null == ra.field_c) {
                                    break L46;
                                  } else {
                                    L47: {
                                      var7 = 0;
                                      if (((ml) this).field_F > 1.5) {
                                        var7 = 1;
                                        break L47;
                                      } else {
                                        break L47;
                                      }
                                    }
                                    L48: {
                                      if (3.0 < ((ml) this).field_F) {
                                        var7 = 2;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                    L49: {
                                      if (4.5 >= ((ml) this).field_F) {
                                        break L49;
                                      } else {
                                        var7 = 3;
                                        break L49;
                                      }
                                    }
                                    L50: {
                                      L51: {
                                        if (-1 == ((ml) this).field_E) {
                                          break L51;
                                        } else {
                                          L52: {
                                            stackOut_154_0 = ra.field_c;
                                            stackIn_157_0 = stackOut_154_0;
                                            stackIn_155_0 = stackOut_154_0;
                                            if (!((ml) this).field_U) {
                                              stackOut_157_0 = (ll[]) (Object) stackIn_157_0;
                                              stackOut_157_1 = 0;
                                              stackIn_158_0 = stackOut_157_0;
                                              stackIn_158_1 = stackOut_157_1;
                                              break L52;
                                            } else {
                                              stackOut_155_0 = (ll[]) (Object) stackIn_155_0;
                                              stackIn_156_0 = stackOut_155_0;
                                              stackOut_156_0 = (ll[]) (Object) stackIn_156_0;
                                              stackOut_156_1 = 4;
                                              stackIn_158_0 = stackOut_156_0;
                                              stackIn_158_1 = stackOut_156_1;
                                              break L52;
                                            }
                                          }
                                          ((ll) (Object) stackIn_158_0[stackIn_158_1 + var7]).a(var4[0] + -(((ml) this).field_Y >> -2026173023), var4[1] - ((ml) this).field_Y);
                                          if (var34 == 0) {
                                            break L50;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                      L53: {
                                        stackOut_159_0 = ra.field_c;
                                        stackIn_162_0 = stackOut_159_0;
                                        stackIn_160_0 = stackOut_159_0;
                                        if (!((ml) this).field_U) {
                                          stackOut_162_0 = (ll[]) (Object) stackIn_162_0;
                                          stackOut_162_1 = 0;
                                          stackIn_163_0 = stackOut_162_0;
                                          stackIn_163_1 = stackOut_162_1;
                                          break L53;
                                        } else {
                                          stackOut_160_0 = (ll[]) (Object) stackIn_160_0;
                                          stackIn_161_0 = stackOut_160_0;
                                          stackOut_161_0 = (ll[]) (Object) stackIn_161_0;
                                          stackOut_161_1 = 4;
                                          stackIn_163_0 = stackOut_161_0;
                                          stackIn_163_1 = stackOut_161_1;
                                          break L53;
                                        }
                                      }
                                      ((ll) (Object) stackIn_163_0[stackIn_163_1 + var7]).d(-(((ml) this).field_Y >> -355970495) + var4[0], var4[1] - ((ml) this).field_Y);
                                      break L50;
                                    }
                                    if (var34 == 0) {
                                      break L9;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              L54: {
                                if (((ml) this).field_jb != 6) {
                                  break L54;
                                } else {
                                  if (null == wl.field_U) {
                                    break L54;
                                  } else {
                                    L55: {
                                      var7 = 0;
                                      if (0.75 >= ((ml) this).field_F) {
                                        break L55;
                                      } else {
                                        var7 = 1;
                                        break L55;
                                      }
                                    }
                                    L56: {
                                      if (((ml) this).field_F > 1.5) {
                                        var7 = 2;
                                        break L56;
                                      } else {
                                        break L56;
                                      }
                                    }
                                    L57: {
                                      if (((ml) this).field_F <= 2.25) {
                                        break L57;
                                      } else {
                                        var7 = 3;
                                        break L57;
                                      }
                                    }
                                    L58: {
                                      if (3.0 >= ((ml) this).field_F) {
                                        break L58;
                                      } else {
                                        var7 = 4;
                                        break L58;
                                      }
                                    }
                                    L59: {
                                      if (((ml) this).field_F > 3.75) {
                                        var7 = 5;
                                        break L59;
                                      } else {
                                        break L59;
                                      }
                                    }
                                    L60: {
                                      if (4.5 < ((ml) this).field_F) {
                                        var7 = 6;
                                        break L60;
                                      } else {
                                        break L60;
                                      }
                                    }
                                    L61: {
                                      if (5.25 < ((ml) this).field_F) {
                                        var7 = 7;
                                        break L61;
                                      } else {
                                        break L61;
                                      }
                                    }
                                    L62: {
                                      L63: {
                                        if (-1 != ((ml) this).field_E) {
                                          break L63;
                                        } else {
                                          wl.field_U[var7].d(var4[0] - 24, -36 + var4[1]);
                                          if (var34 == 0) {
                                            break L62;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                      wl.field_U[var7].a(var4[0] - 24, -36 + var4[1]);
                                      break L62;
                                    }
                                    if (var34 == 0) {
                                      break L9;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                              L64: {
                                L65: {
                                  if (((ml) this).field_jb == 7) {
                                    break L65;
                                  } else {
                                    if (((ml) this).field_jb == 9) {
                                      break L65;
                                    } else {
                                      if (((ml) this).field_jb == 2) {
                                        break L65;
                                      } else {
                                        if (((ml) this).field_jb == 5) {
                                          break L65;
                                        } else {
                                          if (28 == ((ml) this).field_jb) {
                                            break L65;
                                          } else {
                                            if (((ml) this).field_jb == 29) {
                                              break L65;
                                            } else {
                                              if (((ml) this).field_jb != 30) {
                                                break L64;
                                              } else {
                                                break L65;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L66: {
                                  L67: {
                                    var7 = ((ml) this).field_Y;
                                    if (((ml) this).field_jb == 7) {
                                      break L67;
                                    } else {
                                      if (((ml) this).field_jb == 9) {
                                        break L67;
                                      } else {
                                        break L66;
                                      }
                                    }
                                  }
                                  var7 = 64;
                                  break L66;
                                }
                                L68: {
                                  var8_ref_qb = ((ml) this).field_fb;
                                  var9 = -(var7 >> 1427873218) + var4[0] - ((ml) this).field_n;
                                  if (-1 != ((ml) this).field_E) {
                                    var9 = -(var7 >> -1876659646) + (var4[0] + -(var7 >> -153590463) + ((ml) this).field_n);
                                    break L68;
                                  } else {
                                    break L68;
                                  }
                                }
                                L69: {
                                  var10 = var4[1] + -var7 + (((ml) this).field_O - -var6);
                                  if (((ml) this).field_E != -1) {
                                    break L69;
                                  } else {
                                    var8_ref_qb = var8_ref_qb.b();
                                    break L69;
                                  }
                                }
                                L70: {
                                  var11 = 0;
                                  if (((ml) this).field_gb == null) {
                                    break L70;
                                  } else {
                                    if (121 == ((ml) this).field_gb.field_I) {
                                      break L70;
                                    } else {
                                      L71: {
                                        if (((ml) this).field_gb.field_I == 138) {
                                          break L71;
                                        } else {
                                          L72: {
                                            if (2 != ((ml) this).field_jb) {
                                              break L72;
                                            } else {
                                              L73: {
                                                if (((ml) this).field_gb.field_y < 12) {
                                                  break L73;
                                                } else {
                                                  var10 = var10 + (-((ml) this).field_gb.field_y + 25) * ((ml) this).field_gb.field_F / 100;
                                                  var9 = var9 + ((ml) this).field_gb.field_u * (-((ml) this).field_gb.field_y + 25) / 100;
                                                  if (var34 == 0) {
                                                    break L70;
                                                  } else {
                                                    break L73;
                                                  }
                                                }
                                              }
                                              var9 = var9 + ((ml) this).field_gb.field_y * ((ml) this).field_gb.field_u / 100;
                                              var10 = var10 + ((ml) this).field_gb.field_y * ((ml) this).field_gb.field_F / 100;
                                              if (var34 == 0) {
                                                break L70;
                                              } else {
                                                break L72;
                                              }
                                            }
                                          }
                                          L74: {
                                            if (30 == ((ml) this).field_jb) {
                                              break L74;
                                            } else {
                                              L75: {
                                                if (((ml) this).field_jb == 9) {
                                                  break L75;
                                                } else {
                                                  if (((ml) this).field_jb == 5) {
                                                    break L75;
                                                  } else {
                                                    L76: {
                                                      L77: {
                                                        if (((ml) this).field_jb == 28) {
                                                          break L77;
                                                        } else {
                                                          if (((ml) this).field_jb != 29) {
                                                            break L76;
                                                          } else {
                                                            break L77;
                                                          }
                                                        }
                                                      }
                                                      var10 = var10 - ((ml) this).field_gb.field_y * ((ml) this).field_gb.field_F / 100;
                                                      var9 = var9 - ((ml) this).field_gb.field_y * ((ml) this).field_gb.field_u / 100;
                                                      var12_ref_qb = var8_ref_qb;
                                                      var8_ref_qb = new qb(2 * ((ml) this).field_Y, ((ml) this).field_Y * 2);
                                                      var9 = var9 - ((ml) this).field_Y / 2;
                                                      var10 = var10 - ((ml) this).field_Y / 2;
                                                      var8_ref_qb.a();
                                                      var12_ref_qb.b(((ml) this).field_Y / 2 << 1882738244, 3 * ((ml) this).field_Y / 4 << 632778852, ((ml) this).field_Y << 1126029156, ((ml) this).field_Y << 595061316, ((ml) this).field_E * 4000 * -((ml) this).field_gb.field_y, 4096);
                                                      ce.field_m.a(true);
                                                      if (var34 == 0) {
                                                        break L70;
                                                      } else {
                                                        break L76;
                                                      }
                                                    }
                                                    if (((ml) this).field_jb != 7) {
                                                      break L70;
                                                    } else {
                                                      var9 = var9 + ((ml) this).field_gb.field_u / 2;
                                                      var10 = var10 + ((ml) this).field_gb.field_F / 2;
                                                      var12_ref_qb = var8_ref_qb;
                                                      var8_ref_qb = new qb(128, 128);
                                                      var10 -= 32;
                                                      var9 -= 32;
                                                      var8_ref_qb.a();
                                                      var12_ref_qb.b(512, 768, 1024, 1024, ((ml) this).field_E * -((ml) this).field_gb.field_y * 8000, 4096);
                                                      ce.field_m.a(true);
                                                      if (var34 == 0) {
                                                        break L70;
                                                      } else {
                                                        break L75;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var9 = var9 + ((ml) this).field_gb.field_u * ((ml) this).field_gb.field_y / 200;
                                              var10 = var10 + ((ml) this).field_gb.field_y * ((ml) this).field_gb.field_F / 200;
                                              var12_ref_qb = var8_ref_qb;
                                              var9 -= 32;
                                              var10 -= 32;
                                              var8_ref_qb = new qb(128, 128);
                                              var8_ref_qb.a();
                                              var12_ref_qb.b(512, 768, 1024, 1024, ((ml) this).field_E * 4000 * -((ml) this).field_gb.field_y, 4096);
                                              ce.field_m.a(true);
                                              if (var34 == 0) {
                                                break L70;
                                              } else {
                                                break L74;
                                              }
                                            }
                                          }
                                          L78: {
                                            if (((ml) this).field_gb.field_y >= 12) {
                                              break L78;
                                            } else {
                                              var10 = var10 - 5 * ((ml) this).field_gb.field_F * ((ml) this).field_gb.field_y / 50;
                                              var9 = var9 - ((ml) this).field_gb.field_y * ((ml) this).field_gb.field_u * 5 / 50;
                                              if (var34 == 0) {
                                                break L70;
                                              } else {
                                                break L78;
                                              }
                                            }
                                          }
                                          var9 = var9 - (25 - ((ml) this).field_gb.field_y) * 5 * ((ml) this).field_gb.field_u / 50;
                                          var10 = var10 - (25 + -((ml) this).field_gb.field_y) * 5 * ((ml) this).field_gb.field_F / 50;
                                          if (var34 == 0) {
                                            break L70;
                                          } else {
                                            break L71;
                                          }
                                        }
                                      }
                                      var11 = 1;
                                      break L70;
                                    }
                                  }
                                }
                                L79: {
                                  L80: {
                                    if (-1 == ((ml) this).field_E) {
                                      break L80;
                                    } else {
                                      L81: {
                                        if (((ml) this).field_B == null) {
                                          break L81;
                                        } else {
                                          ((ml) this).field_B.c(-(var7 >> -791114718) + (var4[0] + ((ml) this).field_r), var6 + (var4[1] - var7 + ((ml) this).field_O));
                                          break L81;
                                        }
                                      }
                                      L82: {
                                        if (((ml) this).field_cb != null) {
                                          ((ml) this).field_cb.c(-(var7 >> -2062000511) + var4[0] - -((ml) this).field_t, ((ml) this).field_Z + (var4[1] - var7));
                                          break L82;
                                        } else {
                                          break L82;
                                        }
                                      }
                                      L83: {
                                        if (((ml) this).field_bb != null) {
                                          ((ml) this).field_bb.c(var4[0] + -(var7 >> -1669721471), var6 + -var7 + var4[1]);
                                          break L83;
                                        } else {
                                          break L83;
                                        }
                                      }
                                      L84: {
                                        if (((ml) this).field_I == null) {
                                          break L84;
                                        } else {
                                          L85: {
                                            if (var11 == 0) {
                                              break L85;
                                            } else {
                                              var12 = -(int)(Math.sin((double)jb.field_v * 0.2) * (500.0 * Math.random() + 1000.0));
                                              ((ml) this).field_I.a(4096, -(3 * var7 / 4) + (var4[1] - -var6), param2 ^ 1703903772, var4[0], var12);
                                              if (var34 == 0) {
                                                break L84;
                                              } else {
                                                break L85;
                                              }
                                            }
                                          }
                                          ((ml) this).field_I.c(var4[0] - (var7 >> 1298036705), var6 + -(var7 * 3 / 2) + var4[1]);
                                          break L84;
                                        }
                                      }
                                      L86: {
                                        if (null == ((ml) this).field_Q) {
                                          break L86;
                                        } else {
                                          ((ml) this).field_Q.c(-(var7 >> -2027413439) + var4[0] + ((ml) this).field_y, ((ml) this).field_o + (-var7 + var4[1]));
                                          break L86;
                                        }
                                      }
                                      if (((ml) this).field_fb != null) {
                                        var8_ref_qb.c(var9, var10);
                                        if (var34 == 0) {
                                          break L79;
                                        } else {
                                          break L80;
                                        }
                                      } else {
                                        break L79;
                                      }
                                    }
                                  }
                                  L87: {
                                    if (((ml) this).field_B == null) {
                                      break L87;
                                    } else {
                                      ((ml) this).field_B.e(-((ml) this).field_r + var4[0] - (var7 >> -1223359359) + -(var7 >> 1212325410), ((ml) this).field_O + (-var7 + (var4[1] - -var6)));
                                      break L87;
                                    }
                                  }
                                  L88: {
                                    if (((ml) this).field_cb != null) {
                                      ((ml) this).field_cb.e(var4[0] + -(var7 >> -271457279) - ((ml) this).field_t, -var7 + (var4[1] + ((ml) this).field_Z));
                                      break L88;
                                    } else {
                                      break L88;
                                    }
                                  }
                                  L89: {
                                    if (((ml) this).field_bb != null) {
                                      ((ml) this).field_bb.e(var4[0] + -(var7 >> 785879457), -var7 + (var4[1] + var6));
                                      break L89;
                                    } else {
                                      break L89;
                                    }
                                  }
                                  L90: {
                                    if (((ml) this).field_I == null) {
                                      break L90;
                                    } else {
                                      L91: {
                                        if (var11 == 0) {
                                          break L91;
                                        } else {
                                          var12 = (int)(Math.sin(0.2 * (double)jb.field_v) * (500.0 * Math.random() + 1000.0));
                                          ((ml) this).field_I.b().a(4096, var4[1] + (-(var7 * 3 / 4) - -var6), 19, var4[0], var12);
                                          if (var34 == 0) {
                                            break L90;
                                          } else {
                                            break L91;
                                          }
                                        }
                                      }
                                      ((ml) this).field_I.e(var4[0] + -(var7 >> 1262758529), var4[1] - var7 * 3 / 2 + var6);
                                      break L90;
                                    }
                                  }
                                  L92: {
                                    if (((ml) this).field_Q == null) {
                                      break L92;
                                    } else {
                                      ((ml) this).field_Q.e(-((ml) this).field_y + (var4[0] + -(var7 >> -990635199)), ((ml) this).field_o + (var4[1] + -var7));
                                      break L92;
                                    }
                                  }
                                  if (((ml) this).field_fb == null) {
                                    break L79;
                                  } else {
                                    var8_ref_qb.c(var9, var10);
                                    break L79;
                                  }
                                }
                                if (var34 == 0) {
                                  break L9;
                                } else {
                                  break L64;
                                }
                              }
                              L93: {
                                if (((ml) this).field_ab == 3) {
                                  break L93;
                                } else {
                                  L94: {
                                    L95: {
                                      var7 = ((ml) this).field_Y;
                                      if (((ml) this).field_E != -1) {
                                        break L95;
                                      } else {
                                        L96: {
                                          if (null != ((ml) this).field_B) {
                                            ((ml) this).field_B.e(-(var7 >> -1083108222) + (-(var7 >> -2077559391) + var4[0]) - ((ml) this).field_r, ((ml) this).field_O + (-var7 + var4[1]) - -var6);
                                            break L96;
                                          } else {
                                            break L96;
                                          }
                                        }
                                        L97: {
                                          if (((ml) this).field_cb == null) {
                                            break L97;
                                          } else {
                                            ((ml) this).field_cb.e(-(var7 >> -1060412223) + var4[0] - ((ml) this).field_t, ((ml) this).field_Z + (-var7 + var4[1]));
                                            break L97;
                                          }
                                        }
                                        L98: {
                                          if (((ml) this).field_bb != null) {
                                            ((ml) this).field_bb.e(var4[0] - (var7 >> -1212619103), var6 + (-var7 + var4[1]));
                                            break L98;
                                          } else {
                                            break L98;
                                          }
                                        }
                                        L99: {
                                          L100: {
                                            if (((ml) this).field_jb == 32) {
                                              break L100;
                                            } else {
                                              L101: {
                                                if (37 == ((ml) this).field_jb) {
                                                  break L101;
                                                } else {
                                                  if (null != ((ml) this).field_I) {
                                                    ((ml) this).field_I.e(-(var7 >> -41047807) + var4[0], var6 + -(3 * var7 / 2) + var4[1]);
                                                    if (var34 == 0) {
                                                      break L99;
                                                    } else {
                                                      break L101;
                                                    }
                                                  } else {
                                                    break L99;
                                                  }
                                                }
                                              }
                                              if (((ml) this).field_I != null) {
                                                ((ml) this).field_I.e(var4[0] - (var7 >> -305420351), var4[1] + (-(var7 * 3 / 2) + (var6 - 10)));
                                                if (var34 == 0) {
                                                  break L99;
                                                } else {
                                                  break L100;
                                                }
                                              } else {
                                                break L99;
                                              }
                                            }
                                          }
                                          if (((ml) this).field_I == null) {
                                            break L99;
                                          } else {
                                            ((ml) this).field_I.e(-12 + -(var7 >> 13165761) + var4[0], var6 + (-(3 * var7 / 2) + var4[1]));
                                            break L99;
                                          }
                                        }
                                        L102: {
                                          if (null != ((ml) this).field_Q) {
                                            ((ml) this).field_Q.e(-((ml) this).field_y + -(var7 >> 2121690849) + var4[0], ((ml) this).field_o + (-var7 + var4[1]));
                                            break L102;
                                          } else {
                                            break L102;
                                          }
                                        }
                                        L103: {
                                          if (((ml) this).field_ab != 1) {
                                            break L103;
                                          } else {
                                            gn.a(12, (byte) 117, 128, var4[0] + ((var7 >> 756631234) + -((ml) this).field_n + 4), ((ml) this).field_N + (8 + var4[1] + (-((ml) this).field_Y - -var6)));
                                            var8 = -((ml) this).field_n + (var7 >> -1205680158) - (-4 - (int)(13.0 * Math.random() - 6.0));
                                            var9 = ((ml) this).field_N + -((ml) this).field_Y - -8 - (-var6 - (int)(Math.random() * 13.0 - 18.0) - (-6 - -Math.abs(-4 + (var8 + -(var7 >> 1992415010)) + ((ml) this).field_n)));
                                            var10_ref_mi = aj.a((ml) null, ((ml) this).field_db + var9, false, 109, ((ml) this).field_L, ((ml) this).field_lb + var8);
                                            var10_ref_mi.field_y = 16;
                                            ((ml) this).field_L.b(52, var10_ref_mi);
                                            break L103;
                                          }
                                        }
                                        L104: {
                                          L105: {
                                            if (((ml) this).field_ab == 0) {
                                              L106: {
                                                var8 = 0;
                                                if (((ml) this).field_L.field_N == null) {
                                                  break L106;
                                                } else {
                                                  var8 = ((ml) this).field_L.field_N[((ml) this).field_T][5] | (((ml) this).field_L.field_N[((ml) this).field_T][3] << -1008437328 | ((ml) this).field_L.field_N[((ml) this).field_T][4] << 1373199240);
                                                  break L106;
                                                }
                                              }
                                              L107: {
                                                var9 = 4 + ((var7 >> 1112750562) + var4[0] + -((ml) this).field_n);
                                                var10 = ((ml) this).field_N + (-((ml) this).field_Y + var4[1]) - (-8 + -var6);
                                                var11 = 255 & jb.field_v;
                                                if (var11 < 128) {
                                                  break L107;
                                                } else {
                                                  var11 = -var11 + 256;
                                                  break L107;
                                                }
                                              }
                                              var11 += 64;
                                              de.c(var9, var10, 12, var8, var11);
                                              de.c(var9, var10, 10, var8, var11);
                                              de.c(var9, var10, 8, var8, var11);
                                              var12 = 0;
                                              L108: while (true) {
                                                if (var12 >= 7) {
                                                  break L105;
                                                } else {
                                                  var13_int = var9 - -(int)(9.0 * Math.sin(3.14 * ((double)var12 + 0.1 * (double)jb.field_v) / 3.5));
                                                  var14 = (int)(9.0 * Math.cos(((double)jb.field_v * 0.1 + (double)var12) * 3.14 / 3.5)) + var10;
                                                  jg.field_c[var12].b(-2 + var13_int, var14 + -2);
                                                  de.c(var13_int, var14, 4, var8, 32);
                                                  var12++;
                                                  if (var34 != 0) {
                                                    break L104;
                                                  } else {
                                                    if (var34 == 0) {
                                                      continue L108;
                                                    } else {
                                                      break L105;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L105;
                                            }
                                          }
                                          if (null == ((ml) this).field_fb) {
                                            break L104;
                                          } else {
                                            ((ml) this).field_fb.e(-(var7 >> -318913566) + (var4[0] + -((ml) this).field_n), ((ml) this).field_N + (var4[1] + -var7 + var6));
                                            break L104;
                                          }
                                        }
                                        if (((ml) this).field_jb != 18) {
                                          break L94;
                                        } else {
                                          if (gi.field_m == null) {
                                            break L94;
                                          } else {
                                            L109: {
                                              var8 = 0;
                                              if (((ml) this).field_F <= 1.5) {
                                                break L109;
                                              } else {
                                                var8 = 1;
                                                break L109;
                                              }
                                            }
                                            L110: {
                                              if (3.0 >= ((ml) this).field_F) {
                                                break L110;
                                              } else {
                                                var8 = 2;
                                                break L110;
                                              }
                                            }
                                            L111: {
                                              if (((ml) this).field_F <= 4.5) {
                                                break L111;
                                              } else {
                                                var8 = 3;
                                                break L111;
                                              }
                                            }
                                            gi.field_m[var8].d(-32 + (var4[0] + 16), var4[1] - 48);
                                            if (var34 == 0) {
                                              break L94;
                                            } else {
                                              break L95;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L112: {
                                      if (null != ((ml) this).field_B) {
                                        ((ml) this).field_B.c(((ml) this).field_r + var4[0] + -(var7 >> -1559999806), var4[1] + -var7 - (-((ml) this).field_O - var6));
                                        break L112;
                                      } else {
                                        break L112;
                                      }
                                    }
                                    L113: {
                                      if (((ml) this).field_cb == null) {
                                        break L113;
                                      } else {
                                        ((ml) this).field_cb.c(-(var7 >> 1101086049) + (var4[0] - -((ml) this).field_t), ((ml) this).field_Z + (-var7 + var4[1]));
                                        break L113;
                                      }
                                    }
                                    L114: {
                                      if (null == ((ml) this).field_bb) {
                                        break L114;
                                      } else {
                                        ((ml) this).field_bb.c(-(var7 >> 825315041) + var4[0], var4[1] - var7 - -var6);
                                        break L114;
                                      }
                                    }
                                    L115: {
                                      L116: {
                                        if (((ml) this).field_jb != 32) {
                                          break L116;
                                        } else {
                                          if (((ml) this).field_I != null) {
                                            ((ml) this).field_I.c(var4[0] - (var7 >> -1448803231) + 12, var6 + (var4[1] - var7 * 3 / 2));
                                            if (var34 == 0) {
                                              break L115;
                                            } else {
                                              break L116;
                                            }
                                          } else {
                                            break L115;
                                          }
                                        }
                                      }
                                      L117: {
                                        if (((ml) this).field_jb != 37) {
                                          break L117;
                                        } else {
                                          if (((ml) this).field_I == null) {
                                            break L115;
                                          } else {
                                            ((ml) this).field_I.c(var4[0] + -(var7 >> 1403885217), var4[1] + (-(var7 * 3 / 2) + (var6 - 10)));
                                            if (var34 == 0) {
                                              break L115;
                                            } else {
                                              break L117;
                                            }
                                          }
                                        }
                                      }
                                      if (null == ((ml) this).field_I) {
                                        break L115;
                                      } else {
                                        ((ml) this).field_I.c(-(var7 >> -139200287) + var4[0], var6 + (-(3 * var7 / 2) + var4[1]));
                                        break L115;
                                      }
                                    }
                                    L118: {
                                      if (((ml) this).field_Q == null) {
                                        break L118;
                                      } else {
                                        ((ml) this).field_Q.c(var4[0] + -(var7 >> -1414137599) + ((ml) this).field_y, ((ml) this).field_o + var4[1] + -var7);
                                        break L118;
                                      }
                                    }
                                    L119: {
                                      L120: {
                                        L121: {
                                          if (((ml) this).field_ab != 0) {
                                            break L121;
                                          } else {
                                            L122: {
                                              var8 = 0;
                                              if (((ml) this).field_L.field_N != null) {
                                                var8 = ((ml) this).field_L.field_N[((ml) this).field_T][5] | (((ml) this).field_L.field_N[((ml) this).field_T][3] << 2016524144 | ((ml) this).field_L.field_N[((ml) this).field_T][4] << -1824116920);
                                                break L122;
                                              } else {
                                                break L122;
                                              }
                                            }
                                            L123: {
                                              var9 = -4 + (((ml) this).field_n + var4[0]) + -(var7 >> 1511088770);
                                              var10 = ((ml) this).field_N + (var4[1] - ((ml) this).field_Y + (8 - -var6));
                                              var11 = jb.field_v & 255;
                                              if (var11 >= 128) {
                                                var11 = 256 - var11;
                                                break L123;
                                              } else {
                                                break L123;
                                              }
                                            }
                                            var11 += 64;
                                            de.c(var9, var10, 12, var8, var11);
                                            de.c(var9, var10, 10, var8, var11);
                                            de.c(var9, var10, 8, var8, var11);
                                            var12 = 0;
                                            L124: while (true) {
                                              if (var12 >= 7) {
                                                break L121;
                                              } else {
                                                var13_int = (int)(9.0 * Math.sin(3.14 * (0.1 * (double)jb.field_v + (double)var12) / 3.5)) + var9;
                                                var14 = var10 + (int)(9.0 * Math.cos(3.14 * ((double)var12 + 0.1 * (double)jb.field_v) / 3.5));
                                                jg.field_c[var12].b(-2 + var13_int, -2 + var14);
                                                de.c(var13_int, var14, 4, var8, 32);
                                                var12++;
                                                if (var34 != 0) {
                                                  break L120;
                                                } else {
                                                  if (var34 == 0) {
                                                    continue L124;
                                                  } else {
                                                    break L121;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (((ml) this).field_ab == 1) {
                                          gn.a(12, (byte) 73, 128, -4 + (((ml) this).field_n + -(var7 >> 2102388450)) + var4[0], var6 + ((ml) this).field_N + var4[1] + (-((ml) this).field_Y + 8));
                                          var8 = -4 + -(var7 >> -93290590) + (((ml) this).field_n - -(int)(-6.0 + 13.0 * Math.random()));
                                          var9 = -((ml) this).field_Y + 8 + ((ml) this).field_N - (-var6 + -(int)(-18.0 + 13.0 * Math.random()) - (-6 + Math.abs(-((ml) this).field_n + var8 + (var7 >> -53822174) - -4)));
                                          break L120;
                                        } else {
                                          break L119;
                                        }
                                      }
                                      var10_ref_mi = aj.a((ml) null, ((ml) this).field_db + var9, false, 109, ((ml) this).field_L, ((ml) this).field_lb + var8);
                                      var10_ref_mi.field_y = 16;
                                      ((ml) this).field_L.b(52, var10_ref_mi);
                                      break L119;
                                    }
                                    L125: {
                                      if (((ml) this).field_fb == null) {
                                        break L125;
                                      } else {
                                        ((ml) this).field_fb.c(((ml) this).field_n + -(var7 >> -493976734) + var4[0] - (var7 >> 2146500961), var6 + -var7 + (var4[1] - -((ml) this).field_N));
                                        break L125;
                                      }
                                    }
                                    if (((ml) this).field_jb != 18) {
                                      break L94;
                                    } else {
                                      if (null == gi.field_m) {
                                        break L94;
                                      } else {
                                        L126: {
                                          var8 = 0;
                                          if (((ml) this).field_F <= 1.5) {
                                            break L126;
                                          } else {
                                            var8 = 1;
                                            break L126;
                                          }
                                        }
                                        L127: {
                                          if (3.0 < ((ml) this).field_F) {
                                            var8 = 2;
                                            break L127;
                                          } else {
                                            break L127;
                                          }
                                        }
                                        L128: {
                                          if (4.5 >= ((ml) this).field_F) {
                                            break L128;
                                          } else {
                                            var8 = 3;
                                            break L128;
                                          }
                                        }
                                        gi.field_m[var8].a(-48 + var4[0], -48 + var4[1]);
                                        break L94;
                                      }
                                    }
                                  }
                                  if (var34 == 0) {
                                    break L9;
                                  } else {
                                    break L93;
                                  }
                                }
                              }
                              L129: {
                                if (((ml) this).field_E != -1) {
                                  break L129;
                                } else {
                                  ((ml) this).field_bb.b().a(var4[0], var4[1] + -(((ml) this).field_Y >> -196775359), (int)(((ml) this).field_F * 65536.0 / 6.28), 4096);
                                  if (var34 == 0) {
                                    break L9;
                                  } else {
                                    break L129;
                                  }
                                }
                              }
                              ((ml) this).field_bb.a(var4[0], -(((ml) this).field_Y >> 1969405025) + var4[1], (int)(-((ml) this).field_F * 65536.0 / 6.28), 4096);
                              if (var34 == 0) {
                                break L9;
                              } else {
                                break L36;
                              }
                            }
                            L130: {
                              var7 = 0;
                              if (((ml) this).field_F <= 1.5) {
                                break L130;
                              } else {
                                var7 = 1;
                                break L130;
                              }
                            }
                            L131: {
                              if (3.0 >= ((ml) this).field_F) {
                                break L131;
                              } else {
                                var7 = 2;
                                break L131;
                              }
                            }
                            L132: {
                              if (4.5 < ((ml) this).field_F) {
                                var7 = 3;
                                break L132;
                              } else {
                                break L132;
                              }
                            }
                            L133: {
                              if (((ml) this).field_F < 0.0) {
                                L134: {
                                  var7 = 4;
                                  if (-2.0 >= ((ml) this).field_F) {
                                    break L134;
                                  } else {
                                    var7 = 5;
                                    break L134;
                                  }
                                }
                                if (-1.0 >= ((ml) this).field_F) {
                                  break L133;
                                } else {
                                  var7 = 6;
                                  break L133;
                                }
                              } else {
                                break L133;
                              }
                            }
                            L135: {
                              L136: {
                                if (((ml) this).field_E != -1) {
                                  break L136;
                                } else {
                                  bk.field_L[var7].d(var4[0] - (((ml) this).field_Y >> -1826153247), var4[1] + -((ml) this).field_Y);
                                  if (var34 == 0) {
                                    break L135;
                                  } else {
                                    break L136;
                                  }
                                }
                              }
                              bk.field_L[var7].a(-(((ml) this).field_Y >> -745629247) + var4[0], var4[1] + -((ml) this).field_Y);
                              break L135;
                            }
                            if (var34 == 0) {
                              break L9;
                            } else {
                              break L34;
                            }
                          }
                          L137: {
                            var7 = 0;
                            if (1.5 >= ((ml) this).field_F) {
                              break L137;
                            } else {
                              var7 = 1;
                              break L137;
                            }
                          }
                          L138: {
                            if (((ml) this).field_F > 3.0) {
                              var7 = 2;
                              break L138;
                            } else {
                              break L138;
                            }
                          }
                          L139: {
                            if (((ml) this).field_F > 4.5) {
                              var7 = 3;
                              break L139;
                            } else {
                              break L139;
                            }
                          }
                          L140: {
                            if (0.0 > ((ml) this).field_F) {
                              L141: {
                                var7 = 4;
                                if (-2.0 >= ((ml) this).field_F) {
                                  break L141;
                                } else {
                                  var7 = 5;
                                  break L141;
                                }
                              }
                              if (((ml) this).field_F <= -1.0) {
                                break L140;
                              } else {
                                var7 = 6;
                                break L140;
                              }
                            } else {
                              break L140;
                            }
                          }
                          L142: {
                            L143: {
                              if (((ml) this).field_E != -1) {
                                break L143;
                              } else {
                                rc.field_d[var7].d(-(((ml) this).field_Y >> 411238593) + var4[0], var4[1] - ((ml) this).field_Y);
                                if (var34 == 0) {
                                  break L142;
                                } else {
                                  break L143;
                                }
                              }
                            }
                            rc.field_d[var7].a(-(((ml) this).field_Y >> 668165633) + var4[0], -((ml) this).field_Y + var4[1]);
                            break L142;
                          }
                          if (var34 == 0) {
                            break L9;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L144: {
                        L145: {
                          uj.field_i[5].c(-(uj.field_i[5].field_n / 2) + var4[0], -((ml) this).field_Y + var4[1] + 64);
                          if (((ml) this).field_E == -1) {
                            break L145;
                          } else {
                            L146: {
                              if (((ml) this).field_B == null) {
                                break L146;
                              } else {
                                ((ml) this).field_B.c(8 + (-16 + var4[0]), var4[1] + -(((ml) this).field_Y >> 6723713) - (16 + -var6));
                                break L146;
                              }
                            }
                            L147: {
                              if (null != ((ml) this).field_bb) {
                                ((ml) this).field_bb.c(var4[0] - 16, -16 + (var4[1] - ((((ml) this).field_Y >> -2084965599) - var6)));
                                break L147;
                              } else {
                                break L147;
                              }
                            }
                            L148: {
                              if (null != ((ml) this).field_fb) {
                                ((ml) this).field_fb.c(var4[0] + -24, -(((ml) this).field_Y >> 1171247745) + var4[1] + -16 - -var6);
                                break L148;
                              } else {
                                break L148;
                              }
                            }
                            if (null == ((ml) this).field_I) {
                              break L144;
                            } else {
                              ((ml) this).field_I.c(-16 + var4[0], var6 + (var4[1] - (((ml) this).field_Y >> 1694098401) - 32));
                              if (var34 == 0) {
                                break L144;
                              } else {
                                break L145;
                              }
                            }
                          }
                        }
                        L149: {
                          if (null == ((ml) this).field_B) {
                            break L149;
                          } else {
                            ((ml) this).field_B.e(-16 + (var4[0] - 8), -16 + (var4[1] - (((ml) this).field_Y >> 1296015649)) - -var6);
                            break L149;
                          }
                        }
                        L150: {
                          if (((ml) this).field_bb == null) {
                            break L150;
                          } else {
                            ((ml) this).field_bb.e(var4[0] + -16, -16 + var4[1] - (((ml) this).field_Y >> -2024840191) - -var6);
                            break L150;
                          }
                        }
                        L151: {
                          if (null == ((ml) this).field_fb) {
                            break L151;
                          } else {
                            ((ml) this).field_fb.e(8 + (-16 + var4[0]), var4[1] + -(((ml) this).field_Y >> -1112801471) + (-16 + var6));
                            break L151;
                          }
                        }
                        if (null == ((ml) this).field_I) {
                          break L144;
                        } else {
                          ((ml) this).field_I.e(var4[0] + -16, var6 + (-32 + (var4[1] + -(((ml) this).field_Y >> 801269633))));
                          break L144;
                        }
                      }
                      L152: {
                        var7 = 255 & jb.field_v;
                        if (128 >= var7) {
                          break L152;
                        } else {
                          var7 = 256 - var7;
                          break L152;
                        }
                      }
                      gn.a(128, (byte) 114, -320 - var7, var4[0], -48 + var4[1]);
                      if (var34 == 0) {
                        break L9;
                      } else {
                        break L12;
                      }
                    }
                  }
                  uj.field_i[1].c(-(uj.field_i[1].field_n / 2) + var4[0], -((ml) this).field_Y + var4[1]);
                  if (((ml) this).field_I == null) {
                    break L9;
                  } else {
                    ((ml) this).field_I.e(var4[0] - 16, var6 + (-32 + (var4[1] + -(((ml) this).field_Y >> -327960319))));
                    if (var34 == 0) {
                      break L9;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              uj.field_i[0].c(-(uj.field_i[0].field_n / 2) + var4[0], var4[1] + -((ml) this).field_Y);
              if (((ml) this).field_I == null) {
                break L9;
              } else {
                ((ml) this).field_I.e(var4[0] + -16, var6 + var4[1] + (-(((ml) this).field_Y >> -368948671) + -32));
                if (var34 == 0) {
                  break L9;
                } else {
                  break L10;
                }
              }
            }
          }
          var7 = (int)(4.0 * Math.sin(((ml) this).field_F * 2.0) + 18.0);
          var8 = (int)(32.0 + 4.0 * Math.cos(2.0 * ((ml) this).field_F));
          var9 = (int)(Math.cos(((ml) this).field_F) * 4.0);
          var10 = -8;
          L153: while (true) {
            L154: {
              L155: {
                if (8 <= var10) {
                  break L155;
                } else {
                  de.b(var10 / 4 + var4[0], var4[1], var9 + (var4[0] - -var10), var4[1] - var8, 6303744);
                  var10++;
                  if (var34 != 0) {
                    break L154;
                  } else {
                    if (var34 == 0) {
                      continue L153;
                    } else {
                      break L155;
                    }
                  }
                }
              }
              de.b(var4[0] + -2, var4[1], var9 + (var4[0] + -8), var4[1] + -var8, 0);
              de.b(2 + var4[0], var4[1], 8 + var9 + var4[0], var4[1] - var8, 0);
              de.b(var4[0] + 2, var4[1], var4[0] - 2, var4[1], 0);
              de.i(var4[0] + var9, -var8 + var4[1], var7, 16777215);
              de.c(var4[0] + var9, -var8 + var4[1], var7, 0);
              de.i(var9 + var4[0], -var8 + var4[1], (int)((double)var7 * 0.66), 255);
              break L154;
            }
            de.i(var4[0] + var9, var4[1] - var8, (int)(0.33 * (double)var7), 16711680);
            break L9;
          }
        }
        L156: {
          L157: {
            if (((ml) this).field_q > 0) {
              break L157;
            } else {
              if (!((ml) this).field_D) {
                break L157;
              } else {
                if (((ml) this).field_jb == 12) {
                  break L157;
                } else {
                  if (((ml) this).field_jb == 40) {
                    break L157;
                  } else {
                    var7 = 0;
                    L158: while (true) {
                      if (var7 >= 3) {
                        break L157;
                      } else {
                        var8 = var4[0] - -(int)(Math.sin(3.14 * (double)var7 / 1.5 + 0.125 * (double)jb.field_v) * 16.0);
                        var9 = -((ml) this).field_Y + (var4[1] - 10);
                        var10 = (int)(Math.cos(3.14 * (double)var7 / 1.5 + 0.125 * (double)jb.field_v) * 8.0);
                        stackOut_487_0 = -1;
                        stackOut_487_1 = ~var10;
                        stackIn_495_0 = stackOut_487_0;
                        stackIn_495_1 = stackOut_487_1;
                        stackIn_488_0 = stackOut_487_0;
                        stackIn_488_1 = stackOut_487_1;
                        if (var34 != 0) {
                          break L156;
                        } else {
                          L159: {
                            L160: {
                              if (stackIn_488_0 <= stackIn_488_1) {
                                break L160;
                              } else {
                                bb.field_g[(1 & jb.field_v / 7 + var7 * 3) + 86].c(var8 + -20, -20 + (var9 + var10));
                                if (var34 == 0) {
                                  break L159;
                                } else {
                                  break L160;
                                }
                              }
                            }
                            bb.field_g[(3 * var7 + jb.field_v / 7 & 1) + 86].e(var8 + -20, var9 - (-var10 + 20));
                            break L159;
                          }
                          var7++;
                          if (var34 == 0) {
                            continue L158;
                          } else {
                            break L157;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_494_0 = ((ml) this).field_u;
          stackOut_494_1 = ((ml) this).field_T;
          stackIn_495_0 = stackOut_494_0;
          stackIn_495_1 = stackOut_494_1;
          break L156;
        }
        L161: {
          if (stackIn_495_0 == stackIn_495_1) {
            var7 = ((ml) this).field_L.field_x[((ml) this).field_T];
            if (var7 == 10) {
              break L161;
            } else {
              if (((ml) this).field_L.field_X[((ml) this).field_T] > 0) {
                L162: {
                  var8 = ((ml) this).field_L.field_Ab[((ml) this).field_T];
                  var9 = ((ml) this).field_L.field_o[((ml) this).field_T];
                  var10 = var8 - -param1;
                  var11 = var9 + param0;
                  var12 = 0;
                  var13 = null;
                  var14 = 10;
                  if (0 != var7) {
                    break L162;
                  } else {
                    var12 = 1;
                    var13 = (Object) (Object) lf.field_c;
                    break L162;
                  }
                }
                L163: {
                  if (var7 == 1) {
                    var13 = (Object) (Object) tf.field_j;
                    break L163;
                  } else {
                    break L163;
                  }
                }
                L164: {
                  if (var7 != 2) {
                    break L164;
                  } else {
                    var12 = 1;
                    var13 = (Object) (Object) ij.field_Pb;
                    break L164;
                  }
                }
                L165: {
                  if (3 == var7) {
                    var13 = (Object) (Object) fo.field_g;
                    break L165;
                  } else {
                    break L165;
                  }
                }
                L166: {
                  if (var7 != 4) {
                    break L166;
                  } else {
                    var12 = 1;
                    var13 = (Object) (Object) fc.field_e;
                    break L166;
                  }
                }
                L167: {
                  if (var7 != 5) {
                    break L167;
                  } else {
                    var13 = (Object) (Object) ji.field_h;
                    var12 = 1;
                    break L167;
                  }
                }
                L168: {
                  if (var7 == 6) {
                    var13 = (Object) (Object) rc.field_k;
                    var12 = 1;
                    break L168;
                  } else {
                    break L168;
                  }
                }
                L169: {
                  if (var7 == 7) {
                    var13 = (Object) (Object) eo.field_a;
                    break L169;
                  } else {
                    break L169;
                  }
                }
                L170: {
                  if (var7 != 8) {
                    break L170;
                  } else {
                    var14 = 3;
                    var12 = 1;
                    var13 = (Object) (Object) ae.field_a;
                    break L170;
                  }
                }
                L171: {
                  L172: {
                    var15 = new int[]{255, 0, 0};
                    var16 = new int[]{0, 255, 0};
                    var17 = new int[]{0, 0, 255};
                    var18 = new int[]{255, 255, 255};
                    var19 = ((ml) this).field_u;
                    if (var19 == 0) {
                      break L172;
                    } else {
                      if (3 == var19) {
                        break L172;
                      } else {
                        if (var19 == 4) {
                          break L172;
                        } else {
                          break L171;
                        }
                      }
                    }
                  }
                  var15[2] = 255;
                  var15[1] = 255;
                  break L171;
                }
                L173: {
                  L174: {
                    if (var19 == 1) {
                      break L174;
                    } else {
                      if (var19 == 3) {
                        break L174;
                      } else {
                        if (var19 != 5) {
                          break L173;
                        } else {
                          break L174;
                        }
                      }
                    }
                  }
                  var16[0] = 255;
                  var16[2] = 255;
                  break L173;
                }
                L175: {
                  L176: {
                    if (var19 == 2) {
                      break L176;
                    } else {
                      if (var19 == 4) {
                        break L176;
                      } else {
                        if (var19 == 5) {
                          break L176;
                        } else {
                          break L175;
                        }
                      }
                    }
                  }
                  var17[2] = 255;
                  var17[0] = 255;
                  break L175;
                }
                L177: {
                  if (((ml) this).field_L.field_N == null) {
                    break L177;
                  } else {
                    var15[0] = ((ml) this).field_L.field_N[var19][0];
                    var15[1] = ((ml) this).field_L.field_N[var19][1];
                    var15[2] = ((ml) this).field_L.field_N[var19][2];
                    var16[0] = ((ml) this).field_L.field_N[var19][3];
                    var16[1] = ((ml) this).field_L.field_N[var19][4];
                    var16[2] = ((ml) this).field_L.field_N[var19][5];
                    var17[0] = ((ml) this).field_L.field_N[var19][6];
                    var17[1] = ((ml) this).field_L.field_N[var19][7];
                    var17[2] = ((ml) this).field_L.field_N[var19][8];
                    var18[0] = ((ml) this).field_L.field_N[var19][9];
                    var18[1] = ((ml) this).field_L.field_N[var19][10];
                    var18[2] = ((ml) this).field_L.field_N[var19][11];
                    break L177;
                  }
                }
                L178: {
                  if (var12 != 0) {
                    break L178;
                  } else {
                    L179: {
                      var11 -= 24;
                      var10 += 8;
                      var20 = ((ml) this).field_n;
                      var21_int = ((ml) this).field_r;
                      var22_int = ((ml) this).field_N;
                      var23 = ((ml) this).field_O;
                      var24 = ((ml) this).field_t;
                      var25 = ((ml) this).field_y;
                      var26 = ((ml) this).field_Z;
                      var27 = ((ml) this).field_o;
                      if (0 >= ((ml) this).field_q) {
                        break L179;
                      } else {
                        var20 = (int)(4.0 * Math.sin((double)(jb.field_v >> 1862564323)) + 4.0);
                        var21_int = -var20;
                        var22_int = (int)(Math.sin((double)(jb.field_v >> -1248468574)) * 4.0);
                        var23 = -var22_int;
                        break L179;
                      }
                    }
                    L180: {
                      L181: {
                        var28 = de.field_l;
                        var29 = de.field_e;
                        var30 = de.field_j;
                        var31 = new qb(64, 64);
                        var31.a();
                        var32 = 20;
                        var33 = 32;
                        pc.a(kg.field_d[2], var33 + var22_int, kg.field_d[3], kg.field_d[0], (byte) -127, kg.field_d[1], (qb) ((Object[]) var13)[5], var32 - -var20);
                        pc.a(kg.field_d[2], var26 + var33, kg.field_d[3], kg.field_d[0], (byte) -95, kg.field_d[1], (qb) ((Object[]) var13)[4], var24 + var32);
                        pc.a(kg.field_d[2], var33, kg.field_d[3], kg.field_d[0], (byte) 64, kg.field_d[1], (qb) ((Object[]) var13)[3], var32);
                        var33 -= 3;
                        var33 -= 6;
                        pc.a(kg.field_d[2], var33, kg.field_d[3], kg.field_d[0], (byte) 58, kg.field_d[1], (qb) ((Object[]) var13)[2], var32);
                        var33 += 6;
                        var33 -= 6;
                        var33 += 3;
                        var33 += 6;
                        pc.a(kg.field_d[2], var33 + var27, kg.field_d[3], kg.field_d[0], (byte) -91, kg.field_d[1], (qb) ((Object[]) var13)[1], var25 + var32);
                        pc.a(kg.field_d[2], var33 + var23, kg.field_d[3], kg.field_d[0], (byte) 18, kg.field_d[1], (qb) ((Object[]) var13)[0], var32 - -var21_int);
                        de.field_l = var28;
                        de.field_j = var30;
                        de.field_e = var29;
                        de.a();
                        if (0 > ((ml) this).field_E) {
                          break L181;
                        } else {
                          var31.c(var10 + -32, -32 + var11);
                          if (var34 == 0) {
                            break L180;
                          } else {
                            break L181;
                          }
                        }
                      }
                      var31.e(var10 - 32, -32 + var11);
                      break L180;
                    }
                    if (var34 == 0) {
                      break L161;
                    } else {
                      break L178;
                    }
                  }
                }
                L182: {
                  L183: {
                    var20 = jb.field_v / var14 % ((Object[]) var13).length;
                    var21 = new qb(((qb) ((Object[]) var13)[0]).field_n, ((qb) ((Object[]) var13)[0]).field_w);
                    var22 = de.field_l;
                    var23 = de.field_e;
                    var24 = de.field_j;
                    var21.a();
                    pc.a(var17, 0, var18, var15, (byte) 106, var16, (qb) ((Object[]) var13)[var20], 0);
                    de.field_e = var23;
                    de.field_j = var24;
                    de.field_l = var22;
                    de.a();
                    var25 = (int)(4.0 * Math.sin((double)(jb.field_v >> -10725468)));
                    if (var7 == 4) {
                      break L183;
                    } else {
                      if (var7 != 6) {
                        break L182;
                      } else {
                        break L183;
                      }
                    }
                  }
                  var25 = -1;
                  break L182;
                }
                L184: {
                  if (((ml) this).field_E >= 0) {
                    break L184;
                  } else {
                    if (var7 == 4) {
                      break L184;
                    } else {
                      var21.e(-(((qb) ((Object[]) var13)[var20]).field_n / 2) + var10, -var25 + -((qb) ((Object[]) var13)[var20]).field_w + var11);
                      if (var34 == 0) {
                        break L161;
                      } else {
                        break L184;
                      }
                    }
                  }
                }
                L185: {
                  if (var7 != 4) {
                    break L185;
                  } else {
                    if ((-1 + ((ml) this).field_L.field_X[((ml) this).field_u]) % 5 - (-1 - -((((ml) this).field_L.field_X[((ml) this).field_u] + -1) / 5)) <= 0) {
                      break L161;
                    } else {
                      break L185;
                    }
                  }
                }
                var21.c(-(((qb) ((Object[]) var13)[var20]).field_n / 2) + var10, -((qb) ((Object[]) var13)[var20]).field_w + var11 + -var25);
                break L161;
              } else {
                break L161;
              }
            }
          } else {
            break L161;
          }
        }
        L186: {
          if (((ml) this).field_z) {
            break L186;
          } else {
            if (((ml) this).field_jb == 12) {
              break L186;
            } else {
              if (((ml) this).field_jb != 40) {
                L187: {
                  L188: {
                    var7 = ((ml) this).field_ib;
                    if (((ml) this).field_jb == 32) {
                      break L188;
                    } else {
                      if (27 == ((ml) this).field_jb) {
                        break L188;
                      } else {
                        break L187;
                      }
                    }
                  }
                  var7 = var7 * 2;
                  break L187;
                }
                L189: {
                  if (0 >= ((ml) this).field_q) {
                    break L189;
                  } else {
                    var7 = var7 + ((ml) this).field_q;
                    break L189;
                  }
                }
                var8 = tj.field_t.field_C / 2;
                int discarded$3 = mi.field_B.a(Integer.toString(var7), -var8 + param1 + ((ml) this).field_lb, -(var8 * 2) + (param0 + ((ml) this).field_db) + (-((ml) this).field_Y - 2), var8 * 2, var8 * 2, (var5 | 8421504) ^ 8421504, 0, 1, 1, tj.field_t.field_C);
                int discarded$4 = mi.field_B.a(Integer.toString(var7), -1 + (-var8 + (param1 + ((ml) this).field_lb)), -((ml) this).field_Y + param0 + (((ml) this).field_db + -(var8 * 2) + -1), 2 * var8, var8 * 2, 8421504 ^ (var5 | 8421504), 0, 1, 1, tj.field_t.field_C);
                int discarded$5 = mi.field_B.a(Integer.toString(var7), param1 + ((ml) this).field_lb + -var8, -(2 * var8) + (((ml) this).field_db - -param0) - (((ml) this).field_Y - -1), var8 * 2, var8 * 2, var5, -1, 1, 1, tj.field_t.field_C);
                if (null != ((ml) this).field_s) {
                  break L186;
                } else {
                  if (~((ml) this).field_T <= ~((ml) this).field_L.field_q) {
                    break L186;
                  } else {
                    if (((ml) this).field_L.field_S[((ml) this).field_T] <= 0) {
                      break L186;
                    } else {
                      rb.field_o[-1 + ((ml) this).field_L.field_S[((ml) this).field_T]].d(param1 + (((ml) this).field_lb - 15), -(var8 * 2) + -((ml) this).field_Y + (param0 + ((ml) this).field_db + -13), var5);
                      break L186;
                    }
                  }
                }
              } else {
                break L186;
              }
            }
          }
        }
        L190: {
          if (param2 == 1703903841) {
            break L190;
          } else {
            ((ml) this).field_L = null;
            break L190;
          }
        }
    }

    final boolean i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = -108 / ((33 - param0) / 56);
              if (((ml) this).field_x <= 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.BB(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final boolean e(boolean param0) {
        RuntimeException var2 = null;
        ml var2_ref = null;
        int[] stackIn_18_0 = null;
        nf stackIn_18_1 = null;
        int[] stackIn_20_0 = null;
        nf stackIn_20_1 = null;
        int[] stackIn_21_0 = null;
        nf stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_17_0 = null;
        nf stackOut_17_1 = null;
        int[] stackOut_20_0 = null;
        nf stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int[] stackOut_18_0 = null;
        nf stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_24_0 = 0;
        int stackOut_32_0 = 0;
        try {
          L0: {
            L1: {
              if (((ml) this).field_x <= 0) {
                break L1;
              } else {
                L2: {
                  if (19 == ((ml) this).field_jb) {
                    ((ml) this).field_jb = 0;
                    ((ml) this).field_z = true;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    ((ml) this).a((byte) 101, 2);
                    if (((ml) this).field_q > 0) {
                      break L4;
                    } else {
                      ((ml) this).field_ib = ((ml) this).field_ib - ((ml) this).field_x;
                      if (!ArcanistsMulti.field_G) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var2_ref = ((ml) this).field_L.a(((ml) this).field_L.d(false), true);
                    if (null == var2_ref) {
                      break L5;
                    } else {
                      if (var2_ref.g((byte) 103)) {
                        L6: {
                          stackOut_17_0 = ((ml) this).field_L.field_R;
                          stackOut_17_1 = ((ml) this).field_L;
                          stackIn_20_0 = stackOut_17_0;
                          stackIn_20_1 = stackOut_17_1;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          if (param0) {
                            stackOut_20_0 = (int[]) (Object) stackIn_20_0;
                            stackOut_20_1 = (nf) (Object) stackIn_20_1;
                            stackOut_20_2 = 0;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            stackIn_21_2 = stackOut_20_2;
                            break L6;
                          } else {
                            stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                            stackOut_18_1 = (nf) (Object) stackIn_18_1;
                            stackOut_18_2 = 1;
                            stackIn_21_0 = stackOut_18_0;
                            stackIn_21_1 = stackOut_18_1;
                            stackIn_21_2 = stackOut_18_2;
                            break L6;
                          }
                        }
                        int dupTemp$1 = ((nf) (Object) stackIn_21_1).d(stackIn_21_2 != 0);
                        stackIn_21_0[dupTemp$1] = stackIn_21_0[dupTemp$1] + ((ml) this).field_x;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((ml) this).field_q = ((ml) this).field_q - ((ml) this).field_x;
                  break L3;
                }
                if (((ml) this).field_ib > 0) {
                  break L1;
                } else {
                  ((ml) this).field_M = 0;
                  ((ml) this).field_L.a((ml) this, 0);
                  ((ml) this).d(((ml) this).field_L.d(false), 120);
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  return stackIn_25_0 != 0;
                }
              }
            }
            L7: {
              if (((ml) this).field_x >= 0) {
                break L7;
              } else {
                ((ml) this).a(-((ml) this).field_x, -28922);
                break L7;
              }
            }
            L8: {
              ((ml) this).field_x = 0;
              if (param0) {
                break L8;
              } else {
                ((ml) this).field_D = true;
                break L8;
              }
            }
            stackOut_32_0 = 0;
            stackIn_33_0 = stackOut_32_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.SA(" + param0 + ')');
        }
        return stackIn_33_0 != 0;
    }

    final ml w(int param0) {
        RuntimeException var2 = null;
        ml stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 24501) {
                break L1;
              } else {
                ((ml) this).field_bb = null;
                break L1;
              }
            }
            stackOut_3_0 = ((ml) this).field_s;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.EB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final boolean q(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 12) {
              stackOut_3_0 = ((ml) this).field_U;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.KB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void z(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -11) {
                break L1;
              } else {
                boolean discarded$1 = this.f((byte) 37);
                break L1;
              }
            }
            L2: {
              var2_int = ((ml) this).s(-1) ? 1 : 0;
              if (12 != ((ml) this).field_jb) {
                break L2;
              } else {
                var2_int = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((ml) this).field_jb == 22) {
                  break L4;
                } else {
                  if (((ml) this).field_jb == 4) {
                    break L4;
                  } else {
                    if (((ml) this).field_jb == 5) {
                      break L4;
                    } else {
                      if (((ml) this).field_L.field_x[((ml) this).field_u] != 3) {
                        break L3;
                      } else {
                        if (0 >= ((ml) this).field_L.field_X[((ml) this).field_u]) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              if (((ml) this).field_lb < 0) {
                break L3;
              } else {
                if (~((ml) this).field_lb < ~((ml) this).field_L.field_y) {
                  break L3;
                } else {
                  if (-32 + ((ml) this).field_L.field_H >= ((ml) this).field_db) {
                    break L3;
                  } else {
                    L5: {
                      if (((ml) this).field_ib > 5) {
                        break L5;
                      } else {
                        if (0 < ((ml) this).field_q) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    ((ml) this).field_db = -32 + ((ml) this).field_L.field_H;
                    ((ml) this).field_L.a(-115, ((ml) this).field_lb - 24, gj.field_f[9], -gj.field_f[9].field_f + ((ml) this).field_L.field_H + -32);
                    ((ml) this).field_L.a(param0 ^ 117, -8 + ((ml) this).field_lb, gj.field_f[9], -gj.field_f[9].field_f + -32 + ((ml) this).field_L.field_H);
                    ((ml) this).field_L.a(param0 + 92, 8 + ((ml) this).field_lb, gj.field_f[9], ((ml) this).field_L.field_H - 32 - gj.field_f[9].field_f);
                    if (22 != ((ml) this).field_jb) {
                      ((ml) this).field_ib = ((ml) this).field_ib - 5;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            L6: {
              L7: {
                if (var2_int != 0) {
                  break L7;
                } else {
                  this.n(-126);
                  if (!ArcanistsMulti.field_G) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              this.d(true);
              break L6;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.BA(" + param0 + ')');
        }
    }

    final void k(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        ml var5 = null;
        int var6 = 0;
        ml var6_ref_ml = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_14_0 = false;
        boolean stackIn_21_0 = false;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_190_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        boolean stackOut_13_0 = false;
        boolean stackOut_20_0 = false;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        int stackOut_189_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_194_1 = 0;
        int stackOut_193_0 = 0;
        int stackOut_193_1 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          if (((ml) this).field_T == ((ml) this).field_u) {
            var2_int = ((ml) this).field_L.field_x[((ml) this).field_T];
            if (10 == var2_int) {
              break L0;
            } else {
              if (((ml) this).field_L.field_X[((ml) this).field_T] > 0) {
                L1: {
                  L2: {
                    var3 = ((ml) this).field_L.field_Ab[((ml) this).field_T];
                    var4 = ((ml) this).field_L.field_o[((ml) this).field_T];
                    var5_int = ((ml) this).field_lb + -(((ml) this).field_E * ((ml) this).field_Y / 2);
                    var6 = ((ml) this).field_db - ((ml) this).field_Y / 2;
                    if (var2_int == 1) {
                      break L2;
                    } else {
                      if (var2_int == 7) {
                        break L2;
                      } else {
                        if (3 != var2_int) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var6 = ((ml) this).field_db;
                  var5_int = -(((ml) this).field_E * ((ml) this).field_Y / 2) + ((ml) this).field_lb;
                  var7 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var7 >= 32) {
                          break L5;
                        } else {
                          stackOut_13_0 = ((ml) this).field_L.a(var6, var5_int, (byte) -83);
                          stackIn_21_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var11 != 0) {
                            break L4;
                          } else {
                            L6: {
                              L7: {
                                if (!stackIn_14_0) {
                                  break L7;
                                } else {
                                  var6 -= 2;
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var6 += 2;
                              break L6;
                            }
                            var7 += 2;
                            if (var11 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      stackOut_20_0 = ((ml) this).field_L.a(2 + var6, var5_int, (byte) -83);
                      stackIn_21_0 = stackOut_20_0;
                      break L4;
                    }
                    L8: {
                      if (stackIn_21_0) {
                        break L8;
                      } else {
                        var5_int = ((ml) this).field_lb + -(((ml) this).field_E * ((ml) this).field_Y / 4);
                        var6 = ((ml) this).field_db;
                        break L8;
                      }
                    }
                    L9: {
                      if (~var6 < ~var4) {
                        var4++;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (var4 <= var6) {
                      break L1;
                    } else {
                      var4--;
                      break L1;
                    }
                  }
                }
                L10: {
                  if (var2_int != 6) {
                    break L10;
                  } else {
                    if (null != rc.field_k) {
                      L11: {
                        if (13 > jb.field_v / 10 % rc.field_k.length) {
                          break L11;
                        } else {
                          if (((ml) this).field_z) {
                            break L11;
                          } else {
                            var5_int = ((ml) this).field_lb;
                            var3 = ((ml) this).field_lb;
                            var6 = ((ml) this).field_db;
                            var4 = ((ml) this).field_db;
                            if (var11 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      var5_int = var3;
                      var6 = var4;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  if (2 != var2_int) {
                    break L12;
                  } else {
                    if (null != rc.field_k) {
                      L13: {
                        if (~(jb.field_v / 10 % ij.field_Pb.length) > ~(ij.field_Pb.length - 1)) {
                          break L13;
                        } else {
                          if (((ml) this).field_z) {
                            break L13;
                          } else {
                            var5_int = ((ml) this).field_lb;
                            var3 = ((ml) this).field_lb;
                            var6 = -16 + -((ml) this).field_Y + ((ml) this).field_db;
                            var4 = -16 + -((ml) this).field_Y + ((ml) this).field_db;
                            if (var11 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var6 = var4;
                      var5_int = var3;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L14: {
                  if (var2_int == 4) {
                    var5_int = var3;
                    var6 = var4;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var3 = var3 * 15 - -var5_int >> 1975998020;
                ((ml) this).field_L.field_Ab[((ml) this).field_T] = var3 * 15 - -var5_int >> 1975998020;
                var4 = 15 * var4 - -var6 >> 648805572;
                ((ml) this).field_L.field_o[((ml) this).field_T] = 15 * var4 - -var6 >> 648805572;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (0 >= ((ml) this).field_x) {
            break L15;
          } else {
            ((ml) this).field_D = true;
            break L15;
          }
        }
        L16: {
          if (((ml) this).field_D) {
            ((ml) this).field_M = 0;
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          L18: {
            L19: {
              if (((ml) this).field_jb == 17) {
                break L19;
              } else {
                if (((ml) this).x(32)) {
                  ((ml) this).field_s = ((ml) this).field_L.a(((ml) this).field_u, true);
                  var2_int = 65536;
                  pi.field_b.a((byte) 99, ((ml) this).field_L.field_i);
                  var6_ref_ml = (ml) (Object) pi.field_b.b(-47);
                  L20: while (true) {
                    L21: {
                      if (var6_ref_ml == null) {
                        break L21;
                      } else {
                        stackOut_61_0 = ~var6_ref_ml.field_u;
                        stackOut_61_1 = ~((ml) this).field_u;
                        stackIn_91_0 = stackOut_61_0;
                        stackIn_91_1 = stackOut_61_1;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        if (var11 != 0) {
                          break L17;
                        } else {
                          L22: {
                            if (stackIn_62_0 != stackIn_62_1) {
                              break L22;
                            } else {
                              L23: {
                                if (null == var6_ref_ml.field_s) {
                                  break L23;
                                } else {
                                  if (var6_ref_ml.field_jb != 37) {
                                    break L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              var5_int = ((ml) this).field_db - (((ml) this).field_Y / 2 + var6_ref_ml.field_db);
                              var4 = ((ml) this).field_lb - var6_ref_ml.field_lb;
                              var3 = var4 * var4 + var5_int * var5_int;
                              if (~var2_int >= ~var3) {
                                break L22;
                              } else {
                                ((ml) this).field_s = var6_ref_ml;
                                var2_int = var3;
                                break L22;
                              }
                            }
                          }
                          var6_ref_ml = (ml) (Object) pi.field_b.d(-18502);
                          if (var11 == 0) {
                            continue L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                    if (var11 == 0) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                } else {
                  break L18;
                }
              }
            }
            ((ml) this).field_s = ((ml) this).field_L.a(((ml) this).field_u, true);
            var2_int = 65536;
            pi.field_b.a((byte) 114, ((ml) this).field_L.field_i);
            var6_ref_ml = (ml) (Object) pi.field_b.b(-31);
            L24: while (true) {
              if (null == var6_ref_ml) {
                break L18;
              } else {
                stackOut_74_0 = ~var6_ref_ml.field_u;
                stackOut_74_1 = ~((ml) this).field_u;
                stackIn_91_0 = stackOut_74_0;
                stackIn_91_1 = stackOut_74_1;
                stackIn_75_0 = stackOut_74_0;
                stackIn_75_1 = stackOut_74_1;
                if (var11 != 0) {
                  break L17;
                } else {
                  L25: {
                    if (stackIn_75_0 != stackIn_75_1) {
                      break L25;
                    } else {
                      L26: {
                        if (var6_ref_ml.field_s == null) {
                          break L26;
                        } else {
                          if (var6_ref_ml.field_jb == 9) {
                            break L26;
                          } else {
                            if (var6_ref_ml.field_jb == 7) {
                              break L26;
                            } else {
                              if (var6_ref_ml.field_jb == 37) {
                                break L26;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      var5_int = -var6_ref_ml.field_db + ((ml) this).field_db - ((ml) this).field_Y / 2;
                      var4 = ((ml) this).field_lb - var6_ref_ml.field_lb;
                      var3 = var5_int * var5_int + var4 * var4;
                      if (~var2_int < ~var3) {
                        var2_int = var3;
                        ((ml) this).field_s = var6_ref_ml;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  var6_ref_ml = (ml) (Object) pi.field_b.d(-18502);
                  if (var11 == 0) {
                    continue L24;
                  } else {
                    break L18;
                  }
                }
              }
            }
          }
          stackOut_90_0 = 35;
          stackOut_90_1 = ((ml) this).field_jb;
          stackIn_91_0 = stackOut_90_0;
          stackIn_91_1 = stackOut_90_1;
          break L17;
        }
        L27: {
          if (stackIn_91_0 != stackIn_91_1) {
            break L27;
          } else {
            ((ml) this).a(true, true);
            break L27;
          }
        }
        L28: {
          this.g(param0 + -5390);
          ((ml) this).field_lb = ((ml) this).field_X >> 2067865092;
          if (250 >= ((ml) this).field_ib) {
            break L28;
          } else {
            ((ml) this).field_ib = 250;
            break L28;
          }
        }
        L29: {
          L30: {
            ((ml) this).field_db = ((ml) this).field_R >> 833836484;
            var2_int = ((ml) this).field_lb;
            var3 = ((ml) this).field_db;
            var4 = 0;
            if (((ml) this).field_z) {
              break L30;
            } else {
              if (((ml) this).field_hb) {
                break L30;
              } else {
                if (((ml) this).field_M == 0) {
                  break L29;
                } else {
                  break L30;
                }
              }
            }
          }
          var4 = 1;
          ((ml) this).field_L.a((ml) this, 0);
          break L29;
        }
        L31: {
          if (null == ((ml) this).field_s) {
            break L31;
          } else {
            if (0 < ((ml) this).field_s.field_ib) {
              break L31;
            } else {
              if (null != ((ml) this).field_s.field_s) {
                ((ml) this).field_s = ((ml) this).field_s.field_s;
                break L31;
              } else {
                break L31;
              }
            }
          }
        }
        L32: {
          ((ml) this).field_hb = false;
          var5 = ((ml) this).field_L.a(((ml) this).field_u, true);
          if (((ml) this).field_s == null) {
            break L32;
          } else {
            L33: {
              if (var5 == null) {
                break L33;
              } else {
                if (0 < var5.field_ib) {
                  break L32;
                } else {
                  break L33;
                }
              }
            }
            L34: {
              ((ml) this).field_ib = 0;
              if (var4 != 0) {
                break L34;
              } else {
                ((ml) this).field_L.a((ml) this, 0);
                break L34;
              }
            }
            ((ml) this).d(((ml) this).field_L.d(false), 90);
            return;
          }
        }
        if (((ml) this).field_ib <= 0) {
          L35: {
            ((ml) this).field_M = 0;
            if (var4 == 0) {
              ((ml) this).field_L.a((ml) this, param0 ^ -55);
              break L35;
            } else {
              break L35;
            }
          }
          ((ml) this).d(((ml) this).field_L.d(false), 72);
          return;
        } else {
          L36: {
            L37: {
              if (!((ml) this).t(33)) {
                break L37;
              } else {
                if (((ml) this).field_L.field_x[((ml) this).field_u] == 4) {
                  L38: while (true) {
                    if (((ml) this).field_L.a(((ml) this).field_L.field_o[((ml) this).field_u] + 2, ((ml) this).field_L.field_Ab[((ml) this).field_u], (byte) -83)) {
                      break L37;
                    } else {
                      stackOut_128_0 = ~((ml) this).field_L.field_X[((ml) this).field_u];
                      stackOut_128_1 = -1;
                      stackIn_139_0 = stackOut_128_0;
                      stackIn_139_1 = stackOut_128_1;
                      stackIn_129_0 = stackOut_128_0;
                      stackIn_129_1 = stackOut_128_1;
                      if (var11 != 0) {
                        break L36;
                      } else {
                        if (stackIn_129_0 >= stackIn_129_1) {
                          break L37;
                        } else {
                          if (0 >= (((ml) this).field_L.field_X[((ml) this).field_u] - 1) % 5 - (-1 + (-1 + ((ml) this).field_L.field_X[((ml) this).field_u]) / 5)) {
                            break L37;
                          } else {
                            L39: {
                              ((ml) this).field_L.field_o[((ml) this).field_u] = ((ml) this).field_L.field_o[((ml) this).field_u] + 2;
                              if (~((ml) this).field_L.field_o[((ml) this).field_u] >= ~((ml) this).field_L.field_H) {
                                break L39;
                              } else {
                                ((ml) this).field_L.field_X[((ml) this).field_u] = ((ml) this).field_L.field_X[((ml) this).field_u] + 5;
                                if (~((ml) this).field_L.d(false) == ~((ml) this).field_u) {
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                            }
                            ((ml) this).field_z = true;
                            if (var11 == 0) {
                              continue L38;
                            } else {
                              break L37;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L37;
                }
              }
            }
            stackOut_138_0 = ((ml) this).field_db;
            stackOut_138_1 = -((ml) this).field_L.field_H * 10;
            stackIn_139_0 = stackOut_138_0;
            stackIn_139_1 = stackOut_138_1;
            break L36;
          }
          L40: {
            if (stackIn_139_0 >= stackIn_139_1) {
              break L40;
            } else {
              ((ml) this).field_eb = 0;
              ((ml) this).field_kb = 0;
              ((ml) this).field_X = ((ml) this).field_lb << 1358959780;
              ((ml) this).field_db = 10 * -((ml) this).field_L.field_H;
              ((ml) this).field_R = ((ml) this).field_db << -95718108;
              ((ml) this).field_L.field_u[((ml) this).g(false)] = true;
              break L40;
            }
          }
          L41: {
            L42: {
              if (((ml) this).field_jb == 22) {
                break L42;
              } else {
                if (((ml) this).field_jb == 4) {
                  break L42;
                } else {
                  if (((ml) this).field_jb == 5) {
                    break L42;
                  } else {
                    if (((ml) this).field_L.field_x[((ml) this).field_u] != 3) {
                      break L41;
                    } else {
                      if (((ml) this).field_L.field_X[((ml) this).field_u] <= 0) {
                        break L41;
                      } else {
                        break L42;
                      }
                    }
                  }
                }
              }
            }
            if (((ml) this).field_lb < 0) {
              break L41;
            } else {
              if (~((ml) this).field_L.field_y > ~((ml) this).field_lb) {
                break L41;
              } else {
                if (((ml) this).field_eb < 0) {
                  break L41;
                } else {
                  if (~((ml) this).field_db >= ~(-33 + ((ml) this).field_L.field_H)) {
                    break L41;
                  } else {
                    L43: {
                      if (((ml) this).field_ib > 5) {
                        break L43;
                      } else {
                        if (((ml) this).field_q > 0) {
                          break L43;
                        } else {
                          break L41;
                        }
                      }
                    }
                    ((ml) this).field_eb = 0;
                    ((ml) this).field_db = -33 + ((ml) this).field_L.field_H;
                    ((ml) this).field_R = ((ml) this).field_db << 437427396;
                    ((ml) this).field_L.a(param0 ^ -57, -24 + ((ml) this).field_lb, gj.field_f[9], -gj.field_f[9].field_f + (-33 + ((ml) this).field_L.field_H));
                    ((ml) this).field_L.a(-25, -8 + ((ml) this).field_lb, gj.field_f[9], ((ml) this).field_L.field_H - (33 + gj.field_f[9].field_f));
                    ((ml) this).field_L.a(89, ((ml) this).field_lb + 8, gj.field_f[9], -33 + (((ml) this).field_L.field_H - gj.field_f[9].field_f));
                    if (((ml) this).field_jb == 22) {
                      break L41;
                    } else {
                      ((ml) this).field_ib = ((ml) this).field_ib - 5;
                      break L41;
                    }
                  }
                }
              }
            }
          }
          L44: {
            if (((ml) this).field_db >= ((ml) this).field_L.field_H + 128) {
              break L44;
            } else {
              if (~(-640 - (((ml) this).field_Y >> -2048412895)) < ~((ml) this).field_lb) {
                break L44;
              } else {
                if (((ml) this).field_lb <= ((ml) this).field_L.field_y + 640 + (((ml) this).field_Y >> 1528860769)) {
                  L45: {
                    L46: {
                      var6 = 0;
                      if (((ml) this).field_jb == 28) {
                        break L46;
                      } else {
                        if (((ml) this).field_jb == 29) {
                          break L46;
                        } else {
                          if (((ml) this).field_jb == 30) {
                            break L46;
                          } else {
                            if (((ml) this).field_jb == 32) {
                              break L46;
                            } else {
                              if (((ml) this).field_L.field_x[((ml) this).field_u] != 7) {
                                break L45;
                              } else {
                                if (((ml) this).field_L.field_X[((ml) this).field_u] <= 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (0 > ((ml) this).field_lb) {
                      break L45;
                    } else {
                      if (~((ml) this).field_L.field_y > ~((ml) this).field_lb) {
                        break L45;
                      } else {
                        var6 = 1;
                        break L45;
                      }
                    }
                  }
                  L47: {
                    if (((ml) this).field_db <= ((ml) this).field_L.field_H - (32 + -(((ml) this).field_Y / 2))) {
                      stackOut_189_0 = 0;
                      stackIn_190_0 = stackOut_189_0;
                      break L47;
                    } else {
                      stackOut_188_0 = 1;
                      stackIn_190_0 = stackOut_188_0;
                      break L47;
                    }
                  }
                  L48: {
                    var7 = stackIn_190_0;
                    if (((ml) this).s(-1)) {
                      L49: {
                        stackOut_192_0 = var7;
                        stackIn_194_0 = stackOut_192_0;
                        stackIn_193_0 = stackOut_192_0;
                        if (((ml) this).field_db < ((ml) this).field_L.field_H) {
                          stackOut_194_0 = stackIn_194_0;
                          stackOut_194_1 = 0;
                          stackIn_195_0 = stackOut_194_0;
                          stackIn_195_1 = stackOut_194_1;
                          break L49;
                        } else {
                          stackOut_193_0 = stackIn_193_0;
                          stackOut_193_1 = 1;
                          stackIn_195_0 = stackOut_193_0;
                          stackIn_195_1 = stackOut_193_1;
                          break L49;
                        }
                      }
                      var7 = stackIn_195_0 | stackIn_195_1;
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                  L50: {
                    if (var7 == 0) {
                      break L50;
                    } else {
                      if (var6 == 0) {
                        if (((ml) this).field_jb == 12) {
                          L51: {
                            if (var4 == 0) {
                              ((ml) this).field_L.a((ml) this, param0 ^ -55);
                              break L51;
                            } else {
                              break L51;
                            }
                          }
                          ((ml) this).d(((ml) this).field_L.d(false), 89);
                          ((ml) this).field_ib = 0;
                          return;
                        } else {
                          L52: {
                            ((ml) this).field_db = ((ml) this).field_db + 1;
                            ((ml) this).field_R = ((ml) this).field_db << -961856892;
                            ((ml) this).field_M = 0;
                            ((ml) this).field_eb = ((ml) this).field_eb + 1;
                            ((ml) this).field_z = true;
                            var8 = -((ml) this).field_eb;
                            if (var8 > ((ml) this).field_Y >> 355541985) {
                              var8 = ((ml) this).field_Y >> -1249435487;
                              break L52;
                            } else {
                              break L52;
                            }
                          }
                          L53: {
                            if (var8 >= -(((ml) this).field_Y >> 2056283009)) {
                              break L53;
                            } else {
                              var8 = -(((ml) this).field_Y >> 1282430497);
                              break L53;
                            }
                          }
                          ((ml) this).field_o = var8 >> -1919569406;
                          ((ml) this).field_N = -(var8 >> -543692478);
                          ((ml) this).field_O = -(var8 >> -982051966);
                          ((ml) this).field_Z = var8 >> -996882750;
                          return;
                        }
                      } else {
                        break L50;
                      }
                    }
                  }
                  L54: {
                    L55: {
                      var8 = ((ml) this).g((byte) 108) ? 1 : 0;
                      if (var8 != 0) {
                        break L55;
                      } else {
                        if (((ml) this).field_jb == 12) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    L56: {
                      if (((ml) this).field_eb < 0) {
                        ((ml) this).field_eb = 0;
                        break L56;
                      } else {
                        break L56;
                      }
                    }
                    ((ml) this).field_kb = 0;
                    break L54;
                  }
                  L57: {
                    if (param0 == -55) {
                      break L57;
                    } else {
                      ((ml) this).e((byte) 40);
                      break L57;
                    }
                  }
                  L58: {
                    L59: {
                      if (((ml) this).field_z) {
                        break L59;
                      } else {
                        this.z(param0 + 44);
                        if (var11 == 0) {
                          break L58;
                        } else {
                          break L59;
                        }
                      }
                    }
                    this.h((byte) -120);
                    break L58;
                  }
                  L60: {
                    L61: {
                      if (((ml) this).field_ib <= 0) {
                        break L61;
                      } else {
                        if (((ml) this).field_z) {
                          break L61;
                        } else {
                          if (((ml) this).field_hb) {
                            break L61;
                          } else {
                            if (~var2_int != ~((ml) this).field_lb) {
                              break L61;
                            } else {
                              if (~var3 != ~((ml) this).field_db) {
                                break L61;
                              } else {
                                if (var4 == 0) {
                                  break L60;
                                } else {
                                  break L61;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L62: {
                      var9 = ((ml) this).field_lb;
                      ((ml) this).field_lb = var2_int;
                      var10 = ((ml) this).field_db;
                      ((ml) this).field_db = var3;
                      if (var4 != 0) {
                        break L62;
                      } else {
                        L63: {
                          if (((ml) this).field_jb != 12) {
                            break L63;
                          } else {
                            if (((ml) this).field_ib <= 0) {
                              break L62;
                            } else {
                              break L63;
                            }
                          }
                        }
                        ((ml) this).field_L.a((ml) this, param0 ^ -55);
                        break L62;
                      }
                    }
                    ((ml) this).field_lb = var9;
                    ((ml) this).field_db = var10;
                    if (((ml) this).field_ib <= 0) {
                      break L60;
                    } else {
                      ((ml) this).field_L.a(-63, (ml) this);
                      break L60;
                    }
                  }
                  return;
                } else {
                  break L44;
                }
              }
            }
          }
          this.l(param0 ^ -32759);
          ((ml) this).field_M = 0;
          return;
        }
    }

    final void a(int param0, boolean param1) {
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[] var8 = null;
        qb[][] var9 = null;
        int var10 = 0;
        ll[] var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        qb var12_ref = null;
        qb[][] var13_ref_qb____ = null;
        int var13 = 0;
        qb var14 = null;
        int var15 = 0;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        if (!((ml) this).field_J) {
          L0: {
            L1: {
              var3 = new int[]{255, 0, 0};
              var4 = new int[]{0, 255, 0};
              var5 = new int[]{0, 0, 255};
              var6 = new int[]{255, 255, 255};
              var7 = ((ml) this).field_u;
              if (var7 == 0) {
                break L1;
              } else {
                if (3 == var7) {
                  break L1;
                } else {
                  if (var7 != 4) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var3[2] = 255;
            var3[1] = 255;
            break L0;
          }
          L2: {
            L3: {
              if (1 == var7) {
                break L3;
              } else {
                if (var7 == 3) {
                  break L3;
                } else {
                  if (var7 != 5) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var4[2] = 255;
            var4[0] = 255;
            break L2;
          }
          L4: {
            L5: {
              if (var7 == 2) {
                break L5;
              } else {
                if (var7 == 4) {
                  break L5;
                } else {
                  if (var7 != 5) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            var5[0] = 255;
            var5[2] = 255;
            break L4;
          }
          L6: {
            if (null != ((ml) this).field_L.field_N) {
              var3[0] = ((ml) this).field_L.field_N[var7][0];
              var3[1] = ((ml) this).field_L.field_N[var7][1];
              var3[2] = ((ml) this).field_L.field_N[var7][2];
              var4[0] = ((ml) this).field_L.field_N[var7][3];
              var4[1] = ((ml) this).field_L.field_N[var7][4];
              var4[2] = ((ml) this).field_L.field_N[var7][5];
              var5[0] = ((ml) this).field_L.field_N[var7][6];
              var5[1] = ((ml) this).field_L.field_N[var7][7];
              var5[2] = ((ml) this).field_L.field_N[var7][8];
              var6[0] = ((ml) this).field_L.field_N[var7][9];
              var6[1] = ((ml) this).field_L.field_N[var7][10];
              var6[2] = ((ml) this).field_L.field_N[var7][11];
              break L6;
            } else {
              break L6;
            }
          }
          if (param0 == 12) {
            L7: {
              L8: {
                L9: {
                  L10: {
                    L11: {
                      L12: {
                        L13: {
                          L14: {
                            L15: {
                              L16: {
                                var12_int = ((ml) this).field_jb;
                                if (var12_int == 40) {
                                  break L16;
                                } else {
                                  if (var12_int == 12) {
                                    break L15;
                                  } else {
                                    if (var12_int == 39) {
                                      break L14;
                                    } else {
                                      if (var12_int == 13) {
                                        break L13;
                                      } else {
                                        L17: {
                                          if (var12_int != 15) {
                                            break L17;
                                          } else {
                                            if (var15 == 0) {
                                              break L12;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        L18: {
                                          if (var12_int != 14) {
                                            break L18;
                                          } else {
                                            if (var15 == 0) {
                                              break L11;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        L19: {
                                          if (26 != var12_int) {
                                            break L19;
                                          } else {
                                            if (var15 == 0) {
                                              break L10;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        L20: {
                                          if (var12_int != 17) {
                                            break L20;
                                          } else {
                                            if (var15 == 0) {
                                              break L9;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                        if (27 == var12_int) {
                                          break L8;
                                        } else {
                                          L21: {
                                            L22: {
                                              L23: {
                                                if (var12_int == 22) {
                                                  break L23;
                                                } else {
                                                  if (23 == var12_int) {
                                                    break L23;
                                                  } else {
                                                    L24: {
                                                      if (var12_int != 21) {
                                                        break L24;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L23;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    L25: {
                                                      if (24 != var12_int) {
                                                        break L25;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L23;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    if (var12_int == 35) {
                                                      break L23;
                                                    } else {
                                                      if (var12_int == 20) {
                                                        break L23;
                                                      } else {
                                                        L26: {
                                                          if (var12_int != 0) {
                                                            break L26;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L23;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                        }
                                                        L27: {
                                                          if (var12_int != 16) {
                                                            break L27;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L23;
                                                            } else {
                                                              break L27;
                                                            }
                                                          }
                                                        }
                                                        L28: {
                                                          if (var12_int != 18) {
                                                            break L28;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L23;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                        }
                                                        if (var12_int == 38) {
                                                          break L23;
                                                        } else {
                                                          L29: {
                                                            if (var12_int != 6) {
                                                              break L29;
                                                            } else {
                                                              if (var15 == 0) {
                                                                break L22;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          if (var12_int == 25) {
                                                            break L22;
                                                          } else {
                                                            if (11 == var12_int) {
                                                              break L21;
                                                            } else {
                                                              if (var12_int == 4) {
                                                                break L21;
                                                              } else {
                                                                L30: {
                                                                  if (var12_int != 5) {
                                                                    break L30;
                                                                  } else {
                                                                    if (var15 == 0) {
                                                                      break L21;
                                                                    } else {
                                                                      break L30;
                                                                    }
                                                                  }
                                                                }
                                                                if (var12_int == 1) {
                                                                  break L21;
                                                                } else {
                                                                  if (var12_int == 2) {
                                                                    break L21;
                                                                  } else {
                                                                    if (var12_int == 3) {
                                                                      break L21;
                                                                    } else {
                                                                      L31: {
                                                                        if (8 != var12_int) {
                                                                          break L31;
                                                                        } else {
                                                                          if (var15 == 0) {
                                                                            break L21;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var12_int == 7) {
                                                                        break L21;
                                                                      } else {
                                                                        L32: {
                                                                          if (var12_int != 10) {
                                                                            break L32;
                                                                          } else {
                                                                            if (var15 == 0) {
                                                                              break L21;
                                                                            } else {
                                                                              break L32;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (9 == var12_int) {
                                                                          break L21;
                                                                        } else {
                                                                          if (var12_int == 28) {
                                                                            break L21;
                                                                          } else {
                                                                            L33: {
                                                                              if (29 != var12_int) {
                                                                                break L33;
                                                                              } else {
                                                                                if (var15 == 0) {
                                                                                  break L21;
                                                                                } else {
                                                                                  break L33;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var12_int == 30) {
                                                                              break L21;
                                                                            } else {
                                                                              if (var12_int == 31) {
                                                                                break L21;
                                                                              } else {
                                                                                if (32 == var12_int) {
                                                                                  break L21;
                                                                                } else {
                                                                                  if (var12_int == 33) {
                                                                                    break L21;
                                                                                  } else {
                                                                                    L34: {
                                                                                      if (var12_int != 34) {
                                                                                        break L34;
                                                                                      } else {
                                                                                        if (var15 == 0) {
                                                                                          break L21;
                                                                                        } else {
                                                                                          break L34;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (36 != var12_int) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        if (var15 == 0) {
                                                                                          break L21;
                                                                                        } else {
                                                                                          break L35;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    if (var12_int != 37) {
                                                                                      break L23;
                                                                                    } else {
                                                                                      if (var15 == 0) {
                                                                                        break L21;
                                                                                      } else {
                                                                                        break L16;
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
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L36: {
                                                if (param1) {
                                                  ((ml) this).field_ib = 250;
                                                  break L36;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                              L37: {
                                                ((ml) this).field_Y = 32;
                                                if (param1) {
                                                  ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                                                  ((ml) this).field_w.a();
                                                  de.i(((ml) this).field_Y >> -2098818207, ((ml) this).field_Y >> -2034858495, ((ml) this).field_Y >> -672627263, 16777215);
                                                  break L37;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                              L38: {
                                                var8 = new int[]{var7, var7, var7, var7, var7, var7, var7, 0, 0};
                                                if (((ml) this).field_L.field_N != null) {
                                                  var12_int = 0;
                                                  L39: while (true) {
                                                    if (var12_int >= 6) {
                                                      break L38;
                                                    } else {
                                                      var8[var12_int] = ((ml) this).field_L.field_N[var7][var12_int - -12];
                                                      var12_int++;
                                                      if (var15 != 0) {
                                                        break L7;
                                                      } else {
                                                        if (var15 == 0) {
                                                          continue L39;
                                                        } else {
                                                          break L38;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L38;
                                                }
                                              }
                                              var9 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                                              if (kc.field_kb == null) {
                                                ((ml) this).field_J = false;
                                                if (var15 == 0) {
                                                  break L7;
                                                } else {
                                                  break L22;
                                                }
                                              } else {
                                                L40: {
                                                  L41: {
                                                    var12_ref = new qb(64, 96);
                                                    var12_ref.a();
                                                    if (((ml) this).field_jb != 16) {
                                                      break L41;
                                                    } else {
                                                      pc.a(var5, 16, var6, var3, (byte) 116, var4, tk.field_x[2], 0);
                                                      if (var15 == 0) {
                                                        break L40;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                  }
                                                  L42: {
                                                    pc.a(var5, 16, var6, var3, (byte) 78, var4, var9[0][var8[1]], 0);
                                                    pc.a(var5, 32, var6, var3, (byte) -91, var4, var9[4][var8[5]], 0);
                                                    if (var8[5] == 53) {
                                                      break L42;
                                                    } else {
                                                      if (var8[5] != 55) {
                                                        pc.a(var5, 32, var6, var3, (byte) -90, var4, var9[6][var8[6]], 0);
                                                        break L42;
                                                      } else {
                                                        break L42;
                                                      }
                                                    }
                                                  }
                                                  pc.a(var5, 16, var6, var3, (byte) 13, var4, var9[5][var8[4]], 0);
                                                  break L40;
                                                }
                                                L43: {
                                                  ((ml) this).field_I = new qb(32, 48);
                                                  ((ml) this).field_I.a();
                                                  var12_ref.a(16, 24, 0, 2048);
                                                  ((ml) this).field_I.e();
                                                  var12_ref = new qb(64, 64);
                                                  var12_ref.a();
                                                  pc.a(var5, 0, var6, var3, (byte) 91, var4, var9[1][var8[0]], 0);
                                                  ((ml) this).field_bb = new qb(32, 32);
                                                  ((ml) this).field_bb.a();
                                                  var12_ref.a(16, 16, 0, 2048);
                                                  ((ml) this).field_bb.e();
                                                  var12_ref = new qb(64, 64);
                                                  var12_ref.a();
                                                  pc.a(var5, 0, var6, var3, (byte) 123, var4, var9[7][0], 0);
                                                  ((ml) this).field_Q = new qb(32, 32);
                                                  ((ml) this).field_Q.a();
                                                  if (var8[0] == 46) {
                                                    break L43;
                                                  } else {
                                                    var12_ref.a(16, 16, 0, 2048);
                                                    break L43;
                                                  }
                                                }
                                                L44: {
                                                  ((ml) this).field_Q.e();
                                                  var12_ref = new qb(64, 64);
                                                  var12_ref.a();
                                                  pc.a(var5, 0, var6, var3, (byte) -81, var4, var9[8][0], 0);
                                                  ((ml) this).field_cb = new qb(32, 32);
                                                  ((ml) this).field_cb.a();
                                                  if (var8[0] == 46) {
                                                    break L44;
                                                  } else {
                                                    var12_ref.a(16, 16, 0, 2048);
                                                    break L44;
                                                  }
                                                }
                                                L45: {
                                                  ((ml) this).field_cb.e();
                                                  var12_ref = new qb(64, 64);
                                                  var12_ref.a();
                                                  pc.a(var5, 0, var6, var3, (byte) 126, var4, var9[2][var8[2]], 0);
                                                  ((ml) this).field_fb = new qb(32, 32);
                                                  ((ml) this).field_fb.a();
                                                  var12_ref.a(16, 16, 0, 2048);
                                                  ((ml) this).field_fb.e();
                                                  var12_ref = new qb(64, 64);
                                                  var12_ref.a();
                                                  pc.a(var5, 0, var6, var3, (byte) 14, var4, var9[3][var8[3]], 0);
                                                  ((ml) this).field_B = new qb(32, 32);
                                                  ((ml) this).field_B.a();
                                                  var12_ref.a(16, 16, 0, 2048);
                                                  ((ml) this).field_B.e();
                                                  ((ml) this).field_ab = -1;
                                                  if (var8[2] == 27) {
                                                    ((ml) this).field_ab = 0;
                                                    break L45;
                                                  } else {
                                                    break L45;
                                                  }
                                                }
                                                L46: {
                                                  if (28 != var8[2]) {
                                                    break L46;
                                                  } else {
                                                    ((ml) this).field_ab = 1;
                                                    break L46;
                                                  }
                                                }
                                                L47: {
                                                  if (var8[2] == 29) {
                                                    ((ml) this).field_ab = 2;
                                                    break L47;
                                                  } else {
                                                    break L47;
                                                  }
                                                }
                                                L48: {
                                                  if (var8[2] == 54) {
                                                    L49: {
                                                      ((ml) this).field_ab = 3;
                                                      var12_ref = new qb(64, 64);
                                                      var12_ref.a();
                                                      var13 = 32;
                                                      if (((ml) this).field_B != null) {
                                                        ((ml) this).field_B.c(32 + (-(var13 >> 1938536642) - 4), 48 + -var13);
                                                        break L49;
                                                      } else {
                                                        break L49;
                                                      }
                                                    }
                                                    L50: {
                                                      if (((ml) this).field_cb == null) {
                                                        break L50;
                                                      } else {
                                                        ((ml) this).field_cb.c(-(var13 >> -896131295) + 32, -var13 + 48);
                                                        break L50;
                                                      }
                                                    }
                                                    L51: {
                                                      if (((ml) this).field_bb != null) {
                                                        ((ml) this).field_bb.c(-(var13 >> 134101377) + 32, -var13 + 48);
                                                        break L51;
                                                      } else {
                                                        break L51;
                                                      }
                                                    }
                                                    L52: {
                                                      if (null != ((ml) this).field_I) {
                                                        ((ml) this).field_I.c(-(var13 >> 85799009) + 32, 48 - var13 * 3 / 2);
                                                        break L52;
                                                      } else {
                                                        break L52;
                                                      }
                                                    }
                                                    L53: {
                                                      if (((ml) this).field_Q != null) {
                                                        ((ml) this).field_Q.c(32 - (var13 >> -795307679), 48 + -var13);
                                                        break L53;
                                                      } else {
                                                        break L53;
                                                      }
                                                    }
                                                    L54: {
                                                      if (null == ((ml) this).field_fb) {
                                                        break L54;
                                                      } else {
                                                        ((ml) this).field_fb.c(-4 + -(var13 >> 1583231169) + 32, 48 - var13);
                                                        break L54;
                                                      }
                                                    }
                                                    ((ml) this).field_cb = null;
                                                    ((ml) this).field_B = null;
                                                    ((ml) this).field_bb = var12_ref;
                                                    ((ml) this).field_Q = null;
                                                    ((ml) this).field_fb = null;
                                                    break L48;
                                                  } else {
                                                    break L48;
                                                  }
                                                }
                                                ((ml) this).field_J = true;
                                                break L7;
                                              }
                                            }
                                            ((ml) this).field_J = true;
                                            ((ml) this).field_Y = 24;
                                            ((ml) this).field_ib = 25;
                                            ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                                            ((ml) this).field_w.a();
                                            de.i(12, 12, 12, 16777215);
                                            ((ml) this).field_p = ((ml) this).field_ib;
                                            ((ml) this).field_Y = ((ml) this).field_w.field_n;
                                            ((ml) this).e((byte) 6);
                                            if (var15 == 0) {
                                              break L7;
                                            } else {
                                              break L21;
                                            }
                                          }
                                          L55: {
                                            var10 = ((ml) this).field_ib;
                                            var11 = fb.field_a;
                                            ((ml) this).field_ib = 10;
                                            ((ml) this).field_Y = 24;
                                            if (11 != ((ml) this).field_jb) {
                                              break L55;
                                            } else {
                                              if (((ml) this).field_L.a(((ml) this).field_u, true).field_jb != 27) {
                                                break L55;
                                              } else {
                                                ((ml) this).field_ib = 100;
                                                break L55;
                                              }
                                            }
                                          }
                                          L56: {
                                            if (4 != ((ml) this).field_jb) {
                                              break L56;
                                            } else {
                                              ((ml) this).field_Y = 32;
                                              ((ml) this).field_ib = 50;
                                              var11 = bj.field_ob;
                                              break L56;
                                            }
                                          }
                                          L57: {
                                            if (5 == ((ml) this).field_jb) {
                                              ((ml) this).field_Y = 64;
                                              var11 = ea.field_v;
                                              ((ml) this).field_ib = 100;
                                              break L57;
                                            } else {
                                              break L57;
                                            }
                                          }
                                          L58: {
                                            if (1 != ((ml) this).field_jb) {
                                              break L58;
                                            } else {
                                              ((ml) this).field_Y = 32;
                                              ((ml) this).field_ib = 50;
                                              var11 = dh.field_Jb;
                                              break L58;
                                            }
                                          }
                                          L59: {
                                            if (((ml) this).field_jb != 33) {
                                              break L59;
                                            } else {
                                              var11 = jk.field_n;
                                              ((ml) this).field_Y = 32;
                                              ((ml) this).field_ib = 40;
                                              break L59;
                                            }
                                          }
                                          L60: {
                                            if (((ml) this).field_jb == 36) {
                                              ((ml) this).field_ib = 25;
                                              ((ml) this).field_Y = 32;
                                              var11 = e.field_I;
                                              if (!lk.a(0, (byte) -127)) {
                                                break L60;
                                              } else {
                                                ((ml) this).field_U = true;
                                                ((ml) this).field_ib = 75;
                                                break L60;
                                              }
                                            } else {
                                              break L60;
                                            }
                                          }
                                          L61: {
                                            if (34 != ((ml) this).field_jb) {
                                              break L61;
                                            } else {
                                              var11 = field_v;
                                              ((ml) this).field_ib = 25;
                                              ((ml) this).field_Y = 32;
                                              break L61;
                                            }
                                          }
                                          L62: {
                                            if (((ml) this).field_jb == 2) {
                                              ((ml) this).field_Y = 64;
                                              ((ml) this).field_ib = 100;
                                              var11 = i.field_g;
                                              break L62;
                                            } else {
                                              break L62;
                                            }
                                          }
                                          L63: {
                                            if (((ml) this).field_jb == 3) {
                                              ((ml) this).field_Y = 64;
                                              var11 = gb.field_c;
                                              ((ml) this).field_ib = 75;
                                              break L63;
                                            } else {
                                              break L63;
                                            }
                                          }
                                          L64: {
                                            if (8 == ((ml) this).field_jb) {
                                              ((ml) this).field_Y = 48;
                                              ((ml) this).field_ib = 50;
                                              var11 = pm.field_d;
                                              ((ml) this).field_U = true;
                                              break L64;
                                            } else {
                                              break L64;
                                            }
                                          }
                                          L65: {
                                            if (((ml) this).field_jb == 7) {
                                              var11 = ra.field_j;
                                              ((ml) this).field_Y = 64;
                                              ((ml) this).field_ib = 100;
                                              break L65;
                                            } else {
                                              break L65;
                                            }
                                          }
                                          L66: {
                                            if (((ml) this).field_jb == 10) {
                                              ((ml) this).field_ib = 25;
                                              var11 = oe.field_d;
                                              ((ml) this).field_Y = 16;
                                              break L66;
                                            } else {
                                              break L66;
                                            }
                                          }
                                          L67: {
                                            if (9 != ((ml) this).field_jb) {
                                              break L67;
                                            } else {
                                              ((ml) this).field_ib = 100;
                                              var11 = qj.field_d;
                                              ((ml) this).field_Y = 64;
                                              break L67;
                                            }
                                          }
                                          L68: {
                                            if (((ml) this).field_jb != 28) {
                                              break L68;
                                            } else {
                                              ((ml) this).field_Y = 24;
                                              var11 = g.field_f;
                                              ((ml) this).field_ib = 40;
                                              break L68;
                                            }
                                          }
                                          L69: {
                                            if (((ml) this).field_jb != 29) {
                                              break L69;
                                            } else {
                                              var11 = c.field_a;
                                              ((ml) this).field_Y = 48;
                                              ((ml) this).field_ib = 100;
                                              break L69;
                                            }
                                          }
                                          L70: {
                                            if (((ml) this).field_jb != 30) {
                                              break L70;
                                            } else {
                                              var11 = vm.field_g;
                                              ((ml) this).field_ib = 200;
                                              ((ml) this).field_Y = 100;
                                              break L70;
                                            }
                                          }
                                          L71: {
                                            if (((ml) this).field_jb == 31) {
                                              ((ml) this).field_Y = 64;
                                              var11 = vk.field_w;
                                              ((ml) this).field_ib = 100;
                                              break L71;
                                            } else {
                                              break L71;
                                            }
                                          }
                                          L72: {
                                            if (((ml) this).field_jb != 32) {
                                              break L72;
                                            } else {
                                              ((ml) this).field_ib = 250;
                                              ((ml) this).field_Y = 128;
                                              var11 = nj.field_k;
                                              break L72;
                                            }
                                          }
                                          L73: {
                                            if (((ml) this).field_jb == 37) {
                                              ((ml) this).field_ib = 50;
                                              var11 = fe.field_h;
                                              ((ml) this).field_Y = 32;
                                              break L73;
                                            } else {
                                              break L73;
                                            }
                                          }
                                          L74: {
                                            if (param1) {
                                              L75: {
                                                L76: {
                                                  if (((ml) this).field_jb == 7) {
                                                    break L76;
                                                  } else {
                                                    if (((ml) this).field_jb != 9) {
                                                      break L75;
                                                    } else {
                                                      break L76;
                                                    }
                                                  }
                                                }
                                                ((ml) this).field_w = new qb(48, 48);
                                                ((ml) this).field_w.a();
                                                de.i(24, 24, 24, 16777215);
                                                if (var15 == 0) {
                                                  break L74;
                                                } else {
                                                  break L75;
                                                }
                                              }
                                              ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                                              ((ml) this).field_w.a();
                                              de.i(((ml) this).field_Y >> -736443263, ((ml) this).field_Y >> 1158916129, ((ml) this).field_Y >> 4413505, 16777215);
                                              break L74;
                                            } else {
                                              break L74;
                                            }
                                          }
                                          L77: {
                                            if (var11 == null) {
                                              ((ml) this).field_J = false;
                                              break L77;
                                            } else {
                                              L78: {
                                                L79: {
                                                  var12_ref = new qb(((ml) this).field_Y, 3 * ((ml) this).field_Y / 2);
                                                  var12_ref.a();
                                                  if (((ml) this).field_jb == 11) {
                                                    break L79;
                                                  } else {
                                                    if (((ml) this).field_jb == 8) {
                                                      break L79;
                                                    } else {
                                                      if (6 == ((ml) this).field_jb) {
                                                        break L79;
                                                      } else {
                                                        if (((ml) this).field_jb == 25) {
                                                          break L79;
                                                        } else {
                                                          if (!((ml) this).field_U) {
                                                            break L79;
                                                          } else {
                                                            pc.a(var5, ((ml) this).field_Y / 2, var6, var3, (byte) -111, var4, var11[6].b(), 0);
                                                            if (var15 == 0) {
                                                              break L78;
                                                            } else {
                                                              break L79;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                pc.a(var5, ((ml) this).field_Y / 2, var6, var3, (byte) -85, var4, var11[2].b(), 0);
                                                break L78;
                                              }
                                              ((ml) this).field_I = var12_ref.g();
                                              var12_ref = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                                              var12_ref.a();
                                              pc.a(var5, 0, var6, var3, (byte) 70, var4, var11[3].b(), 0);
                                              ((ml) this).field_bb = var12_ref.g();
                                              var12_ref = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                                              var12_ref.a();
                                              pc.a(var5, 0, var6, var3, (byte) 33, var4, var11[1].b(), 0);
                                              ((ml) this).field_Q = var12_ref.g();
                                              var12_ref = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                                              var12_ref.a();
                                              pc.a(var5, 0, var6, var3, (byte) -127, var4, var11[4].b(), 0);
                                              ((ml) this).field_cb = var12_ref.g();
                                              var12_ref = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                                              var12_ref.a();
                                              pc.a(var5, 0, var6, var3, (byte) -4, var4, var11[0].b(), 0);
                                              ((ml) this).field_fb = var12_ref.g();
                                              var12_ref = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                                              var12_ref.a();
                                              pc.a(var5, 0, var6, var3, (byte) -86, var4, var11[5].b(), 0);
                                              ((ml) this).field_B = var12_ref.g();
                                              ((ml) this).field_J = true;
                                              break L77;
                                            }
                                          }
                                          if (!param1) {
                                            ((ml) this).field_ib = var10;
                                            break L7;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              ((ml) this).field_Y = 64;
                              ((ml) this).field_ib = 10;
                              ((ml) this).field_J = true;
                              ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                              ((ml) this).field_w.a();
                              de.i(32, 32, 10, 16777215);
                              de.i(32, 63, 1, 16777215);
                              if (var15 == 0) {
                                break L7;
                              } else {
                                break L15;
                              }
                            }
                            ((ml) this).field_J = true;
                            ((ml) this).field_ib = 75;
                            ((ml) this).field_z = true;
                            ((ml) this).field_Y = 256;
                            ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                            ((ml) this).field_w.a();
                            go.field_j[29].a(0, 0);
                            de.d(0, -2 + (go.field_j[29].field_f + go.field_j[29].field_c), ((ml) this).field_Y, ((ml) this).field_Y, 0);
                            if (var15 == 0) {
                              break L7;
                            } else {
                              break L14;
                            }
                          }
                          ((ml) this).field_J = true;
                          ((ml) this).field_Y = 100;
                          ((ml) this).field_ib = 100;
                          ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                          ((ml) this).field_w.a();
                          de.i(((ml) this).field_Y >> 1554575329, ((ml) this).field_Y >> -1371289439, ((ml) this).field_Y >> -1607789759, 16777215);
                          if (var15 == 0) {
                            break L7;
                          } else {
                            break L13;
                          }
                        }
                        ((ml) this).field_J = true;
                        ((ml) this).field_ib = 200;
                        ((ml) this).field_Y = 100;
                        ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                        ((ml) this).field_w.a();
                        de.i(((ml) this).field_Y >> -917470591, ((ml) this).field_Y >> 1685513953, ((ml) this).field_Y >> -100393279, 16777215);
                        if (var15 == 0) {
                          break L7;
                        } else {
                          break L12;
                        }
                      }
                      ((ml) this).field_J = true;
                      ((ml) this).field_Y = 100;
                      ((ml) this).field_ib = 150;
                      ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                      ((ml) this).field_w.a();
                      de.i(((ml) this).field_Y >> 1785854017, ((ml) this).field_Y >> 632717025, ((ml) this).field_Y >> -2070527903, 16777215);
                      if (var15 == 0) {
                        break L7;
                      } else {
                        break L11;
                      }
                    }
                    ((ml) this).field_ib = 150;
                    ((ml) this).field_J = true;
                    ((ml) this).field_Y = 100;
                    ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                    ((ml) this).field_w.a();
                    de.i(((ml) this).field_Y >> -2001765119, ((ml) this).field_Y >> 614805185, ((ml) this).field_Y >> 888971745, 16777215);
                    if (var15 == 0) {
                      break L7;
                    } else {
                      break L10;
                    }
                  }
                  ((ml) this).field_Y = 100;
                  ((ml) this).field_ib = 150;
                  ((ml) this).field_J = true;
                  ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                  ((ml) this).field_w.a();
                  de.i(((ml) this).field_Y >> -2112440895, ((ml) this).field_Y >> 1238221953, ((ml) this).field_Y >> 378147425, 16777215);
                  if (var15 == 0) {
                    break L7;
                  } else {
                    break L9;
                  }
                }
                ((ml) this).field_Y = 80;
                ((ml) this).field_J = true;
                ((ml) this).field_ib = 100;
                ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                ((ml) this).field_w.a();
                de.i(((ml) this).field_Y >> 917242145, ((ml) this).field_Y >> -1507659583, ((ml) this).field_Y >> -1190423839, 16777215);
                if (var15 == 0) {
                  break L7;
                } else {
                  break L8;
                }
              }
              L80: {
                ((ml) this).field_Y = 64;
                if (param1) {
                  ((ml) this).field_ib = 250;
                  break L80;
                } else {
                  break L80;
                }
              }
              L81: {
                ((ml) this).field_ab = 2;
                if (!param1) {
                  break L81;
                } else {
                  ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                  ((ml) this).field_w.a();
                  de.i(((ml) this).field_Y >> 1889445345, ((ml) this).field_Y >> -487186783, ((ml) this).field_Y >> -671284735, 16777215);
                  break L81;
                }
              }
              L82: {
                L83: {
                  var12 = new int[]{28, 0, 29, 33, 47, 50, var7, 0, 0};
                  var13_ref_qb____ = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                  if (kc.field_kb != null) {
                    break L83;
                  } else {
                    ((ml) this).field_J = false;
                    if (var15 == 0) {
                      break L82;
                    } else {
                      break L83;
                    }
                  }
                }
                L84: {
                  var3 = new int[]{204, 170, 238};
                  var5 = new int[]{32, 32, 32};
                  var6 = new int[]{128, 64, 128};
                  var4 = new int[]{255, 192, 255};
                  var14 = new qb(64, 96);
                  var14.a();
                  pc.a(var5, 16, var6, var3, (byte) -8, var4, var13_ref_qb____[0][var12[1]], 0);
                  pc.a(var5, 32, var6, var3, (byte) -96, var4, var13_ref_qb____[4][var12[5]], 0);
                  if (53 == var12[5]) {
                    break L84;
                  } else {
                    if (var12[5] == 55) {
                      break L84;
                    } else {
                      pc.a(var5, 32, var6, var3, (byte) 74, var4, var13_ref_qb____[6][var12[6]], 0);
                      break L84;
                    }
                  }
                }
                pc.a(var5, 16, var6, var3, (byte) 25, var4, var13_ref_qb____[5][var12[4]], 0);
                ((ml) this).field_I = new qb(64, 96);
                ((ml) this).field_I.a();
                var14.a(32, 48, 0, 4096);
                ((ml) this).field_I.e();
                var14 = new qb(64, 64);
                var14.a();
                pc.a(var5, 0, var6, var3, (byte) 49, var4, var13_ref_qb____[1][var12[0]], 0);
                ((ml) this).field_bb = new qb(64, 64);
                ((ml) this).field_bb.a();
                var14.a(32, 32, 0, 4096);
                ((ml) this).field_bb.e();
                var14 = new qb(64, 64);
                var14.a();
                pc.a(var5, 0, var6, var3, (byte) -104, var4, var13_ref_qb____[7][0], 0);
                ((ml) this).field_Q = new qb(64, 64);
                ((ml) this).field_Q.a();
                var14.a(32, 32, 0, 4096);
                ((ml) this).field_Q.e();
                var14 = new qb(64, 64);
                var14.a();
                pc.a(var5, 0, var6, var3, (byte) -124, var4, var13_ref_qb____[8][0], 0);
                ((ml) this).field_cb = new qb(64, 64);
                ((ml) this).field_cb.a();
                var14.a(32, 32, 0, 4096);
                ((ml) this).field_cb.e();
                var14 = new qb(64, 64);
                var14.a();
                pc.a(var5, 0, var6, var3, (byte) -112, var4, var13_ref_qb____[2][var12[2]], 0);
                ((ml) this).field_fb = new qb(64, 64);
                ((ml) this).field_fb.a();
                var14.a(32, 32, 0, 4096);
                ((ml) this).field_fb.e();
                var14 = new qb(64, 64);
                var14.a();
                pc.a(var5, 0, var6, var3, (byte) -79, var4, var13_ref_qb____[3][var12[3]], 0);
                ((ml) this).field_B = new qb(64, 64);
                ((ml) this).field_B.a();
                var14.a(32, 32, 0, 4096);
                ((ml) this).field_B.e();
                ((ml) this).field_J = true;
                break L82;
              }
              break L7;
            }
            L85: {
              if (!param1) {
                break L85;
              } else {
                ((ml) this).field_p = ((ml) this).field_ib;
                ((ml) this).field_Y = ((ml) this).field_w.field_n;
                ((ml) this).e((byte) 6);
                break L85;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int m(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -20357) {
                break L1;
              } else {
                ((ml) this).field_u = 27;
                break L1;
              }
            }
            if (((ml) this).field_jb == 27) {
              stackOut_6_0 = ((ml) this).field_ib * 2;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = ((ml) this).field_ib;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.IA(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final void c(int param0, int param1) {
        try {
            ((ml) this).field_M = param1;
            if (param0 != 0) {
                boolean discarded$0 = ((ml) this).t(8);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ml.U(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean u(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 84) {
              L1: {
                L2: {
                  if (((ml) this).field_q > 0) {
                    break L2;
                  } else {
                    L3: {
                      if (0 == ((ml) this).field_jb) {
                        break L3;
                      } else {
                        if (((ml) this).field_jb == 18) {
                          break L3;
                        } else {
                          if (((ml) this).field_jb == 19) {
                            break L3;
                          } else {
                            if (9 == ((ml) this).field_jb) {
                              break L3;
                            } else {
                              if (16 == ((ml) this).field_jb) {
                                break L3;
                              } else {
                                if (((ml) this).field_jb == 7) {
                                  break L3;
                                } else {
                                  if (((ml) this).field_jb != 37) {
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_25_0 = 1;
                    stackIn_28_0 = stackOut_25_0;
                    break L1;
                  }
                }
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.TA(" + param0 + ')');
        }
        return stackIn_28_0 != 0;
    }

    final boolean e(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 118) {
                break L1;
              } else {
                boolean discarded$2 = ((ml) this).f(false);
                break L1;
              }
            }
            L2: {
              if (((ml) this).field_z) {
                break L2;
              } else {
                if (((ml) this).field_hb) {
                  break L2;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              }
            }
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            return stackIn_10_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.FB(" + param0 + ')');
        }
        return stackIn_12_0 != 0;
    }

    public static void h(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_H = null;
              field_m = null;
              field_v = null;
              field_S = null;
              field_K = null;
              if (!param0) {
                break L1;
              } else {
                ml.a((dj) null, 88, (byte) 54, (dj) null);
                break L1;
              }
            }
            field_V = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ml.NA(" + param0 + ')');
        }
    }

    final int r(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((ml) this).field_L.field_d) {
              var2_int = -92 % ((param0 - -4) / 53);
              stackOut_3_0 = 1 & ((ml) this).field_u;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = ((ml) this).field_u;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int o(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -22625) {
                break L1;
              } else {
                ((ml) this).field_W = 1;
                break L1;
              }
            }
            stackOut_3_0 = ((ml) this).field_jb;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.LA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void d(int param0, int param1) {
        mi var3 = null;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (!((ml) this).t(57)) {
            break L0;
          } else {
            if (((ml) this).field_L.field_x[((ml) this).field_u] != 4) {
              break L0;
            } else {
              if (((ml) this).field_L.field_X[((ml) this).field_u] <= 0) {
                break L0;
              } else {
                if (0 < 1 + (-1 + ((ml) this).field_L.field_X[((ml) this).field_u]) % 5 + -((((ml) this).field_L.field_X[((ml) this).field_u] + -1) / 5)) {
                  ((ml) this).field_ib = 20 * ((((ml) this).field_L.field_X[((ml) this).field_u] - 1) % 5 + 1 - (-1 + ((ml) this).field_L.field_X[((ml) this).field_u]) / 5);
                  ((ml) this).field_x = 0;
                  var3 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                  ((ml) this).field_L.b(52, var3);
                  ((ml) this).field_L.a((ml) this, 0);
                  ((ml) this).field_lb = ((ml) this).field_L.field_Ab[((ml) this).field_u];
                  ((ml) this).field_db = ((ml) this).field_L.field_o[((ml) this).field_u];
                  ((ml) this).field_X = ((ml) this).field_lb << -1441401276;
                  ((ml) this).field_R = ((ml) this).field_db << 1405219364;
                  var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                  ((ml) this).field_L.b(52, var3);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if ((((ml) this).field_L.field_X[((ml) this).field_u] - 1) % 5 + (1 - (-1 + ((ml) this).field_L.field_X[((ml) this).field_u]) / 5) <= 0) {
                          break L3;
                        } else {
                          ((ml) this).field_L.field_X[((ml) this).field_u] = ((ml) this).field_L.field_X[((ml) this).field_u] + 5;
                          if (var7 != 0) {
                            break L2;
                          } else {
                            if (var7 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((ml) this).field_z = true;
                      break L2;
                    }
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L4: {
          if (((ml) this).field_jb != 27) {
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!((ml) this).t(109)) {
            break L5;
          } else {
            L6: {
              if (null == ((ml) this).field_L.field_Ib) {
                break L6;
              } else {
                L7: {
                  boolean discarded$1 = ((ml) this).field_L.field_Ib.a(0, ((ml) this).field_T);
                  var4_ref_String = ((ml) this).field_L.field_Ib.a((byte) 127, param0);
                  ((ml) this).field_L.field_Ib.a(0, 0, var4_ref_String, ((ml) this).field_T);
                  var5 = ((ml) this).field_G;
                  var6 = null;
                  if (var5 < 0) {
                    break L7;
                  } else {
                    if (tc.field_w.length > var5) {
                      var6 = (Object) (Object) tc.field_w[var5];
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var6 != null) {
                    break L8;
                  } else {
                    var6 = (Object) (Object) ("(unknown" + var5 + ")");
                    break L8;
                  }
                }
                ((ml) this).field_L.field_Ib.a(1, 0, (String) var6, ((ml) this).field_T);
                break L6;
              }
            }
            L9: {
              if (((ml) this).field_T == param0) {
                break L9;
              } else {
                ((ml) this).field_L.field_U[param0] = ((ml) this).field_L.field_U[param0] + 1;
                if (var7 == 0) {
                  break L5;
                } else {
                  break L9;
                }
              }
            }
            ((ml) this).field_L.field_U[param0] = ((ml) this).field_L.field_U[param0] - 1;
            break L5;
          }
        }
        L10: {
          if (((ml) this).field_jb != 36) {
            break L10;
          } else {
            if (~((ml) this).field_L.field_H >= ~((ml) this).field_db) {
              break L10;
            } else {
              ((ml) this).field_L.field_b[param0] = ((ml) this).field_L.field_b[param0] + 1;
              break L10;
            }
          }
        }
        ((ml) this).a((byte) 89, 1);
        ((ml) this).field_L.a((ml) this, 0);
        if (param1 >= 4) {
          L11: {
            L12: {
              L13: {
                L14: {
                  L15: {
                    L16: {
                      L17: {
                        L18: {
                          L19: {
                            L20: {
                              L21: {
                                L22: {
                                  L23: {
                                    L24: {
                                      L25: {
                                        L26: {
                                          L27: {
                                            L28: {
                                              L29: {
                                                L30: {
                                                  L31: {
                                                    L32: {
                                                      L33: {
                                                        L34: {
                                                          L35: {
                                                            L36: {
                                                              L37: {
                                                                var4 = ((ml) this).field_jb;
                                                                if (var4 == 40) {
                                                                  break L37;
                                                                } else {
                                                                  L38: {
                                                                    if (var4 != 0) {
                                                                      break L38;
                                                                    } else {
                                                                      if (var7 == 0) {
                                                                        break L36;
                                                                      } else {
                                                                        break L38;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var4 == 27) {
                                                                    break L36;
                                                                  } else {
                                                                    if (3 == var4) {
                                                                      break L35;
                                                                    } else {
                                                                      L39: {
                                                                        if (7 != var4) {
                                                                          break L39;
                                                                        } else {
                                                                          if (var7 == 0) {
                                                                            break L34;
                                                                          } else {
                                                                            break L39;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (1 == var4) {
                                                                        break L33;
                                                                      } else {
                                                                        if (var4 == 5) {
                                                                          break L32;
                                                                        } else {
                                                                          L40: {
                                                                            if (var4 != 2) {
                                                                              break L40;
                                                                            } else {
                                                                              if (var7 == 0) {
                                                                                break L31;
                                                                              } else {
                                                                                break L40;
                                                                              }
                                                                            }
                                                                          }
                                                                          L41: {
                                                                            if (var4 != 11) {
                                                                              break L41;
                                                                            } else {
                                                                              if (var7 == 0) {
                                                                                break L30;
                                                                              } else {
                                                                                break L41;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (var4 == 9) {
                                                                            break L29;
                                                                          } else {
                                                                            if (var4 == 17) {
                                                                              break L28;
                                                                            } else {
                                                                              if (var4 == 10) {
                                                                                break L27;
                                                                              } else {
                                                                                L42: {
                                                                                  if (var4 != 6) {
                                                                                    break L42;
                                                                                  } else {
                                                                                    if (var7 == 0) {
                                                                                      break L26;
                                                                                    } else {
                                                                                      break L42;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L43: {
                                                                                  if (var4 != 25) {
                                                                                    break L43;
                                                                                  } else {
                                                                                    if (var7 == 0) {
                                                                                      break L25;
                                                                                    } else {
                                                                                      break L43;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (var4 == 4) {
                                                                                  break L24;
                                                                                } else {
                                                                                  if (var4 == 8) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    L44: {
                                                                                      if (var4 != 13) {
                                                                                        break L44;
                                                                                      } else {
                                                                                        if (var7 == 0) {
                                                                                          break L22;
                                                                                        } else {
                                                                                          break L44;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    if (37 == var4) {
                                                                                      break L21;
                                                                                    } else {
                                                                                      if (var4 == 39) {
                                                                                        break L20;
                                                                                      } else {
                                                                                        if (var4 == 15) {
                                                                                          break L19;
                                                                                        } else {
                                                                                          L45: {
                                                                                            if (var4 != 14) {
                                                                                              break L45;
                                                                                            } else {
                                                                                              if (var7 == 0) {
                                                                                                break L18;
                                                                                              } else {
                                                                                                break L45;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L46: {
                                                                                            if (var4 != 26) {
                                                                                              break L46;
                                                                                            } else {
                                                                                              if (var7 == 0) {
                                                                                                break L17;
                                                                                              } else {
                                                                                                break L46;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (var4 == 12) {
                                                                                            break L16;
                                                                                          } else {
                                                                                            if (var4 == 33) {
                                                                                              break L15;
                                                                                            } else {
                                                                                              if (var4 == 31) {
                                                                                                break L15;
                                                                                              } else {
                                                                                                if (var4 == 29) {
                                                                                                  break L14;
                                                                                                } else {
                                                                                                  L47: {
                                                                                                    if (var4 != 30) {
                                                                                                      break L47;
                                                                                                    } else {
                                                                                                      if (var7 == 0) {
                                                                                                        break L14;
                                                                                                      } else {
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  L48: {
                                                                                                    if (28 != var4) {
                                                                                                      break L48;
                                                                                                    } else {
                                                                                                      if (var7 == 0) {
                                                                                                        break L14;
                                                                                                      } else {
                                                                                                        break L48;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  if (var4 == 32) {
                                                                                                    break L14;
                                                                                                  } else {
                                                                                                    if (var4 == 34) {
                                                                                                      break L13;
                                                                                                    } else {
                                                                                                      if (var4 != 36) {
                                                                                                        break L11;
                                                                                                      } else {
                                                                                                        if (var7 == 0) {
                                                                                                          break L12;
                                                                                                        } else {
                                                                                                          break L37;
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
                                                              var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 101, ((ml) this).field_L, ((ml) this).field_lb);
                                                              ((ml) this).field_L.b(52, var3);
                                                              if (var7 == 0) {
                                                                break L11;
                                                              } else {
                                                                break L36;
                                                              }
                                                            }
                                                            this.b(-30225, 53);
                                                            var3 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 101, ((ml) this).field_L, ((ml) this).field_lb);
                                                            ((ml) this).field_L.b(52, var3);
                                                            if (var7 == 0) {
                                                              break L11;
                                                            } else {
                                                              break L35;
                                                            }
                                                          }
                                                          var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 99, ((ml) this).field_L, ((ml) this).field_lb);
                                                          ((ml) this).field_L.b(52, var3);
                                                          if (var7 == 0) {
                                                            break L11;
                                                          } else {
                                                            break L34;
                                                          }
                                                        }
                                                        var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                                                        ((ml) this).field_L.b(52, var3);
                                                        if (var7 == 0) {
                                                          break L11;
                                                        } else {
                                                          break L33;
                                                        }
                                                      }
                                                      var3 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 89, ((ml) this).field_L, ((ml) this).field_lb);
                                                      ((ml) this).field_L.b(52, var3);
                                                      if (var7 == 0) {
                                                        break L11;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                    var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 94, ((ml) this).field_L, ((ml) this).field_lb);
                                                    ((ml) this).field_L.b(52, var3);
                                                    if (var7 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L31;
                                                    }
                                                  }
                                                  var3 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 89, ((ml) this).field_L, ((ml) this).field_lb);
                                                  ((ml) this).field_L.b(52, var3);
                                                  if (var7 == 0) {
                                                    break L11;
                                                  } else {
                                                    break L30;
                                                  }
                                                }
                                                var3 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 101, ((ml) this).field_L, ((ml) this).field_lb);
                                                ((ml) this).field_L.b(52, var3);
                                                if (var7 == 0) {
                                                  break L11;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                              var3 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 108, ((ml) this).field_L, ((ml) this).field_lb);
                                              ((ml) this).field_L.b(52, var3);
                                              if (var7 == 0) {
                                                break L11;
                                              } else {
                                                break L28;
                                              }
                                            }
                                            L49: {
                                              if (((ml) this).field_U) {
                                                break L49;
                                              } else {
                                                var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 108, ((ml) this).field_L, ((ml) this).field_lb);
                                                ((ml) this).field_L.b(52, var3);
                                                if (var7 == 0) {
                                                  break L11;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                            }
                                            var3 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                                            ((ml) this).field_L.b(52, var3);
                                            if (var7 == 0) {
                                              break L11;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var3 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 108, ((ml) this).field_L, ((ml) this).field_lb);
                                          ((ml) this).field_L.b(52, var3);
                                          if (var7 == 0) {
                                            break L11;
                                          } else {
                                            break L26;
                                          }
                                        }
                                        var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                                        ((ml) this).field_L.b(52, var3);
                                        if (var7 == 0) {
                                          break L11;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 99, ((ml) this).field_L, ((ml) this).field_lb);
                                      ((ml) this).field_L.b(52, var3);
                                      if (var7 == 0) {
                                        break L11;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 94, ((ml) this).field_L, ((ml) this).field_lb);
                                    ((ml) this).field_L.b(52, var3);
                                    if (var7 == 0) {
                                      break L11;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                                  ((ml) this).field_L.b(52, var3);
                                  if (var7 == 0) {
                                    break L11;
                                  } else {
                                    break L22;
                                  }
                                }
                                var3 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 85, ((ml) this).field_L, ((ml) this).field_lb);
                                ((ml) this).field_L.b(52, var3);
                                if (var7 == 0) {
                                  break L11;
                                } else {
                                  break L21;
                                }
                              }
                              var3 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 163, ((ml) this).field_L, ((ml) this).field_lb);
                              ((ml) this).field_L.b(52, var3);
                              if (var7 == 0) {
                                break L11;
                              } else {
                                break L20;
                              }
                            }
                            var3 = aj.a(((ml) this).field_s, -10 + (-(((ml) this).field_Y / 2) + ((ml) this).field_db), false, 159, ((ml) this).field_L, -10 + ((ml) this).field_lb);
                            ((ml) this).field_L.b(52, var3);
                            var3.field_u = -20;
                            var3.field_F = -20;
                            var3 = aj.a(((ml) this).field_s, -(((ml) this).field_Y / 2) + ((ml) this).field_db + -10, false, 159, ((ml) this).field_L, ((ml) this).field_lb + 10);
                            ((ml) this).field_L.b(52, var3);
                            var3.field_u = 20;
                            var3.field_F = -20;
                            var3 = aj.a(((ml) this).field_s, ((ml) this).field_db + -(((ml) this).field_Y / 2) + 10, false, 159, ((ml) this).field_L, ((ml) this).field_lb + 10);
                            ((ml) this).field_L.b(52, var3);
                            var3.field_u = 20;
                            var3.field_F = 20;
                            var3 = aj.a(((ml) this).field_s, 10 + (((ml) this).field_db - ((ml) this).field_Y / 2), false, 159, ((ml) this).field_L, -10 + ((ml) this).field_lb);
                            ((ml) this).field_L.b(52, var3);
                            var3.field_u = -20;
                            var3.field_F = 20;
                            var3 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 163, ((ml) this).field_L, ((ml) this).field_lb);
                            ((ml) this).field_L.b(52, var3);
                            if (var7 == 0) {
                              break L11;
                            } else {
                              break L19;
                            }
                          }
                          var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 94, ((ml) this).field_L, ((ml) this).field_lb);
                          ((ml) this).field_L.b(52, var3);
                          if (var7 == 0) {
                            break L11;
                          } else {
                            break L18;
                          }
                        }
                        var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 99, ((ml) this).field_L, ((ml) this).field_lb);
                        ((ml) this).field_L.b(52, var3);
                        if (var7 == 0) {
                          break L11;
                        } else {
                          break L17;
                        }
                      }
                      var3 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                      ((ml) this).field_L.b(52, var3);
                      if (var7 == 0) {
                        break L11;
                      } else {
                        break L16;
                      }
                    }
                    ((ml) this).field_L.a(((ml) this).field_db + -256, -60, ((ml) this).field_lb + -128, go.field_j[29].b());
                    if (var7 == 0) {
                      break L11;
                    } else {
                      break L15;
                    }
                  }
                  var3 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 154, ((ml) this).field_L, ((ml) this).field_lb);
                  ((ml) this).field_L.b(52, var3);
                  if (var7 == 0) {
                    break L11;
                  } else {
                    break L14;
                  }
                }
                var3 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 130, ((ml) this).field_L, ((ml) this).field_lb);
                ((ml) this).field_L.b(52, var3);
                if (var7 == 0) {
                  break L11;
                } else {
                  break L13;
                }
              }
              var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 146, ((ml) this).field_L, ((ml) this).field_lb);
              ((ml) this).field_L.b(52, var3);
              var3.field_y = 250;
              if (var7 == 0) {
                break L11;
              } else {
                break L12;
              }
            }
            var3 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 128, ((ml) this).field_L, ((ml) this).field_lb);
            ((ml) this).field_L.b(52, var3);
            break L11;
          }
          ((ml) this).a(true);
          ((ml) this).a((byte) 88);
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -35) {
                break L1;
              } else {
                ((ml) this).field_n = -119;
                break L1;
              }
            }
            L2: {
              if (null != ((ml) this).field_L.field_rb) {
                if (null != ((ml) this).field_L.field_rb[param2]) {
                  fk discarded$1 = ii.a(param1, false, ((ml) this).field_L.field_rb[param2], 100 * tm.field_a[param2] / param1);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "ml.CB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean x(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                ((ml) this).field_W = 61;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.f((byte) -107)) {
                  break L3;
                } else {
                  if (((ml) this).field_jb != 32) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.OA(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void h(int param0) {
        mi var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          L17: {
                                            L18: {
                                              L19: {
                                                L20: {
                                                  L21: {
                                                    L22: {
                                                      L23: {
                                                        L24: {
                                                          L25: {
                                                            L26: {
                                                              L27: {
                                                                var4 = ArcanistsMulti.field_G ? 1 : 0;
                                                                var3 = ((ml) this).field_jb;
                                                                if (var3 != 0) {
                                                                  break L27;
                                                                } else {
                                                                  if (var4 == 0) {
                                                                    break L26;
                                                                  } else {
                                                                    break L27;
                                                                  }
                                                                }
                                                              }
                                                              L28: {
                                                                if (27 != var3) {
                                                                  break L28;
                                                                } else {
                                                                  if (var4 == 0) {
                                                                    break L26;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                              L29: {
                                                                if (3 != var3) {
                                                                  break L29;
                                                                } else {
                                                                  if (var4 == 0) {
                                                                    break L25;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                              }
                                                              L30: {
                                                                if (7 != var3) {
                                                                  break L30;
                                                                } else {
                                                                  if (var4 == 0) {
                                                                    break L24;
                                                                  } else {
                                                                    break L30;
                                                                  }
                                                                }
                                                              }
                                                              if (1 == var3) {
                                                                break L23;
                                                              } else {
                                                                L31: {
                                                                  if (var3 != 5) {
                                                                    break L31;
                                                                  } else {
                                                                    if (var4 == 0) {
                                                                      break L22;
                                                                    } else {
                                                                      break L31;
                                                                    }
                                                                  }
                                                                }
                                                                L32: {
                                                                  if (2 != var3) {
                                                                    break L32;
                                                                  } else {
                                                                    if (var4 == 0) {
                                                                      break L21;
                                                                    } else {
                                                                      break L32;
                                                                    }
                                                                  }
                                                                }
                                                                L33: {
                                                                  if (var3 != 11) {
                                                                    break L33;
                                                                  } else {
                                                                    if (var4 == 0) {
                                                                      break L20;
                                                                    } else {
                                                                      break L33;
                                                                    }
                                                                  }
                                                                }
                                                                if (var3 == 9) {
                                                                  break L19;
                                                                } else {
                                                                  L34: {
                                                                    if (var3 != 17) {
                                                                      break L34;
                                                                    } else {
                                                                      if (var4 == 0) {
                                                                        break L18;
                                                                      } else {
                                                                        break L34;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var3 == 10) {
                                                                    break L17;
                                                                  } else {
                                                                    L35: {
                                                                      if (var3 != 6) {
                                                                        break L35;
                                                                      } else {
                                                                        if (var4 == 0) {
                                                                          break L16;
                                                                        } else {
                                                                          break L35;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (var3 == 25) {
                                                                      break L15;
                                                                    } else {
                                                                      if (var3 == 4) {
                                                                        break L14;
                                                                      } else {
                                                                        if (var3 == 8) {
                                                                          break L13;
                                                                        } else {
                                                                          if (var3 == 37) {
                                                                            break L12;
                                                                          } else {
                                                                            L36: {
                                                                              if (39 != var3) {
                                                                                break L36;
                                                                              } else {
                                                                                if (var4 == 0) {
                                                                                  break L11;
                                                                                } else {
                                                                                  break L36;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (13 == var3) {
                                                                              break L10;
                                                                            } else {
                                                                              L37: {
                                                                                if (var3 != 15) {
                                                                                  break L37;
                                                                                } else {
                                                                                  if (var4 == 0) {
                                                                                    break L9;
                                                                                  } else {
                                                                                    break L37;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (14 == var3) {
                                                                                break L8;
                                                                              } else {
                                                                                if (26 == var3) {
                                                                                  break L7;
                                                                                } else {
                                                                                  if (12 == var3) {
                                                                                    break L6;
                                                                                  } else {
                                                                                    L38: {
                                                                                      if (28 != var3) {
                                                                                        break L38;
                                                                                      } else {
                                                                                        if (var4 == 0) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          break L38;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    if (32 == var3) {
                                                                                      break L4;
                                                                                    } else {
                                                                                      L39: {
                                                                                        if (var3 != 33) {
                                                                                          break L39;
                                                                                        } else {
                                                                                          if (var4 == 0) {
                                                                                            break L3;
                                                                                          } else {
                                                                                            break L39;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L40: {
                                                                                        if (var3 != 31) {
                                                                                          break L40;
                                                                                        } else {
                                                                                          if (var4 == 0) {
                                                                                            break L2;
                                                                                          } else {
                                                                                            break L40;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (var3 != 34) {
                                                                                        break L0;
                                                                                      } else {
                                                                                        if (var4 == 0) {
                                                                                          break L1;
                                                                                        } else {
                                                                                          break L26;
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
                                                                }
                                                              }
                                                            }
                                                            var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 101, ((ml) this).field_L, ((ml) this).field_lb);
                                                            ((ml) this).field_L.b(52, var2);
                                                            if (var4 == 0) {
                                                              break L0;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                          var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 99, ((ml) this).field_L, ((ml) this).field_lb);
                                                          ((ml) this).field_L.b(52, var2);
                                                          if (var4 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                        var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y, false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                                                        ((ml) this).field_L.b(52, var2);
                                                        var2 = aj.a((ml) null, ((ml) this).field_db, false, 103, ((ml) this).field_L, ((ml) this).field_lb + -(((ml) this).field_Y / 2));
                                                        ((ml) this).field_L.b(52, var2);
                                                        var2 = aj.a((ml) null, ((ml) this).field_db, false, 103, ((ml) this).field_L, ((ml) this).field_lb - -(((ml) this).field_Y / 2));
                                                        ((ml) this).field_L.b(52, var2);
                                                        if (var4 == 0) {
                                                          break L0;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                      var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 89, ((ml) this).field_L, ((ml) this).field_lb);
                                                      ((ml) this).field_L.b(52, var2);
                                                      if (var4 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                    var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y, false, 94, ((ml) this).field_L, ((ml) this).field_lb);
                                                    ((ml) this).field_L.b(52, var2);
                                                    var2 = aj.a((ml) null, ((ml) this).field_db, false, 94, ((ml) this).field_L, ((ml) this).field_lb + -(((ml) this).field_Y / 2));
                                                    ((ml) this).field_L.b(52, var2);
                                                    var2 = aj.a((ml) null, ((ml) this).field_db, false, 94, ((ml) this).field_L, ((ml) this).field_Y / 2 + ((ml) this).field_lb);
                                                    ((ml) this).field_L.b(52, var2);
                                                    if (var4 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                  var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y, false, 89, ((ml) this).field_L, ((ml) this).field_lb);
                                                  ((ml) this).field_L.b(52, var2);
                                                  var2 = aj.a((ml) null, ((ml) this).field_db, false, 89, ((ml) this).field_L, -(((ml) this).field_Y / 2) + ((ml) this).field_lb);
                                                  ((ml) this).field_L.b(52, var2);
                                                  var2 = aj.a((ml) null, ((ml) this).field_db, false, 89, ((ml) this).field_L, ((ml) this).field_lb - -(((ml) this).field_Y / 2));
                                                  ((ml) this).field_L.b(52, var2);
                                                  if (var4 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                                var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 101, ((ml) this).field_L, ((ml) this).field_lb);
                                                ((ml) this).field_L.b(52, var2);
                                                if (var4 == 0) {
                                                  break L0;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                              var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y, false, 108, ((ml) this).field_L, ((ml) this).field_lb);
                                              ((ml) this).field_L.b(52, var2);
                                              var2 = aj.a((ml) null, ((ml) this).field_db, false, 108, ((ml) this).field_L, -(((ml) this).field_Y / 2) + ((ml) this).field_lb);
                                              ((ml) this).field_L.b(52, var2);
                                              var2 = aj.a((ml) null, ((ml) this).field_db, false, 108, ((ml) this).field_L, ((ml) this).field_lb - -(((ml) this).field_Y / 2));
                                              ((ml) this).field_L.b(52, var2);
                                              if (var4 == 0) {
                                                break L0;
                                              } else {
                                                break L18;
                                              }
                                            }
                                            var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 108, ((ml) this).field_L, ((ml) this).field_lb);
                                            ((ml) this).field_L.b(52, var2);
                                            if (var4 == 0) {
                                              break L0;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          var2 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 108, ((ml) this).field_L, ((ml) this).field_lb);
                                          ((ml) this).field_L.b(52, var2);
                                          if (var4 == 0) {
                                            break L0;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                                        ((ml) this).field_L.b(52, var2);
                                        if (var4 == 0) {
                                          break L0;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      var2 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 99, ((ml) this).field_L, ((ml) this).field_lb);
                                      ((ml) this).field_L.b(52, var2);
                                      if (var4 == 0) {
                                        break L0;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    var2 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 94, ((ml) this).field_L, ((ml) this).field_lb);
                                    ((ml) this).field_L.b(52, var2);
                                    if (var4 == 0) {
                                      break L0;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                                  ((ml) this).field_L.b(52, var2);
                                  if (var4 == 0) {
                                    break L0;
                                  } else {
                                    break L12;
                                  }
                                }
                                var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 163, ((ml) this).field_L, ((ml) this).field_lb);
                                ((ml) this).field_L.b(52, var2);
                                if (var4 == 0) {
                                  break L0;
                                } else {
                                  break L11;
                                }
                              }
                              var2 = aj.a((ml) null, -((ml) this).field_Y + ((ml) this).field_db, false, 163, ((ml) this).field_L, ((ml) this).field_lb);
                              ((ml) this).field_L.b(52, var2);
                              var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 163, ((ml) this).field_L, ((ml) this).field_lb + -(((ml) this).field_Y / 2));
                              ((ml) this).field_L.b(52, var2);
                              var2 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 163, ((ml) this).field_L, ((ml) this).field_lb + ((ml) this).field_Y / 2);
                              ((ml) this).field_L.b(52, var2);
                              var2 = aj.a((ml) null, ((ml) this).field_db, false, 163, ((ml) this).field_L, ((ml) this).field_lb);
                              ((ml) this).field_L.b(52, var2);
                              if (var4 == 0) {
                                break L0;
                              } else {
                                break L10;
                              }
                            }
                            var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y, false, 85, ((ml) this).field_L, ((ml) this).field_lb);
                            ((ml) this).field_L.b(52, var2);
                            var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 85, ((ml) this).field_L, -(((ml) this).field_Y / 2) + ((ml) this).field_lb);
                            ((ml) this).field_L.b(52, var2);
                            var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 85, ((ml) this).field_L, ((ml) this).field_Y / 2 + ((ml) this).field_lb);
                            ((ml) this).field_L.b(52, var2);
                            var2 = aj.a((ml) null, ((ml) this).field_db, false, 85, ((ml) this).field_L, ((ml) this).field_lb);
                            ((ml) this).field_L.b(52, var2);
                            if (var4 == 0) {
                              break L0;
                            } else {
                              break L9;
                            }
                          }
                          var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y, false, 94, ((ml) this).field_L, ((ml) this).field_lb);
                          ((ml) this).field_L.b(52, var2);
                          var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 94, ((ml) this).field_L, ((ml) this).field_lb + -(((ml) this).field_Y / 2));
                          ((ml) this).field_L.b(52, var2);
                          var2 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 94, ((ml) this).field_L, ((ml) this).field_Y / 2 + ((ml) this).field_lb);
                          ((ml) this).field_L.b(52, var2);
                          var2 = aj.a((ml) null, ((ml) this).field_db, false, 94, ((ml) this).field_L, ((ml) this).field_lb);
                          ((ml) this).field_L.b(52, var2);
                          if (var4 == 0) {
                            break L0;
                          } else {
                            break L8;
                          }
                        }
                        var2 = aj.a((ml) null, ((ml) this).field_db + -((ml) this).field_Y, false, 99, ((ml) this).field_L, ((ml) this).field_lb);
                        ((ml) this).field_L.b(52, var2);
                        var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 99, ((ml) this).field_L, ((ml) this).field_lb + -(((ml) this).field_Y / 2));
                        ((ml) this).field_L.b(52, var2);
                        var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 99, ((ml) this).field_L, ((ml) this).field_lb + ((ml) this).field_Y / 2);
                        ((ml) this).field_L.b(52, var2);
                        var2 = aj.a((ml) null, ((ml) this).field_db, false, 99, ((ml) this).field_L, ((ml) this).field_lb);
                        ((ml) this).field_L.b(52, var2);
                        if (var4 == 0) {
                          break L0;
                        } else {
                          break L7;
                        }
                      }
                      var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 103, ((ml) this).field_L, ((ml) this).field_lb);
                      ((ml) this).field_L.b(52, var2);
                      if (var4 == 0) {
                        break L0;
                      } else {
                        break L6;
                      }
                    }
                    var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 108, ((ml) this).field_L, ((ml) this).field_lb);
                    ((ml) this).field_L.b(52, var2);
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L5;
                    }
                  }
                  var2 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 130, ((ml) this).field_L, ((ml) this).field_lb);
                  ((ml) this).field_L.b(52, var2);
                  if (var4 == 0) {
                    break L0;
                  } else {
                    break L4;
                  }
                }
                var2 = aj.a((ml) null, -((ml) this).field_Y + ((ml) this).field_db, false, 130, ((ml) this).field_L, ((ml) this).field_lb);
                ((ml) this).field_L.b(52, var2);
                var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y / 2, false, 130, ((ml) this).field_L, ((ml) this).field_lb + -(((ml) this).field_Y / 2));
                ((ml) this).field_L.b(52, var2);
                var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 130, ((ml) this).field_L, ((ml) this).field_lb - -(((ml) this).field_Y / 2));
                ((ml) this).field_L.b(52, var2);
                var2 = aj.a((ml) null, ((ml) this).field_db, false, 130, ((ml) this).field_L, ((ml) this).field_lb);
                ((ml) this).field_L.b(52, var2);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
              var2 = aj.a((ml) null, ((ml) this).field_db + -(((ml) this).field_Y / 2), false, 128, ((ml) this).field_L, ((ml) this).field_lb);
              ((ml) this).field_L.b(52, var2);
              if (var4 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            var2 = aj.a((ml) null, ((ml) this).field_db - ((ml) this).field_Y, false, 154, ((ml) this).field_L, ((ml) this).field_lb);
            ((ml) this).field_L.b(52, var2);
            var2 = aj.a((ml) null, ((ml) this).field_db, false, 154, ((ml) this).field_L, -(((ml) this).field_Y / 2) + ((ml) this).field_lb);
            ((ml) this).field_L.b(52, var2);
            var2 = aj.a((ml) null, ((ml) this).field_db, false, 154, ((ml) this).field_L, ((ml) this).field_Y / 2 + ((ml) this).field_lb);
            ((ml) this).field_L.b(52, var2);
            if (var4 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          var2 = aj.a((ml) null, -(((ml) this).field_Y / 2) + ((ml) this).field_db, false, 131, ((ml) this).field_L, ((ml) this).field_lb);
          ((ml) this).field_L.b(52, var2);
          break L0;
        }
        var3 = -106 / ((param0 - -5) / 36);
    }

    final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              return;
            } else {
              L1: {
                if (param1 <= 0) {
                  break L1;
                } else {
                  if (param1 > ((ml) this).field_W) {
                    ((ml) this).field_W = param1;
                    ((ml) this).field_G = param2;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  var4_int = 79 % ((53 - param0) / 56);
                  if (((ml) this).field_jb == 32) {
                    break L3;
                  } else {
                    if (((ml) this).field_jb != 27) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param1 = (param1 + -1) / 2 + 1;
                break L2;
              }
              ((ml) this).field_x = ((ml) this).field_x + param1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "ml.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -30225) {
              L1: {
                if (((ml) this).field_L.field_rb != null) {
                  if (null != ((ml) this).field_L.field_rb[param1]) {
                    fk discarded$1 = ti.a((byte) -30, tm.field_a[param1], ((ml) this).field_L.field_rb[param1]);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "ml.S(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ml var6_ref_ml = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ml var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        mi var15 = null;
        int var16 = 0;
        ml stackIn_35_0 = null;
        ml stackIn_42_0 = null;
        boolean stackIn_82_0 = false;
        boolean stackIn_83_0 = false;
        boolean stackIn_84_0 = false;
        boolean stackIn_85_0 = false;
        int stackIn_85_1 = 0;
        Object stackIn_142_0 = null;
        Object stackIn_143_0 = null;
        Object stackIn_144_0 = null;
        Object stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        ml stackOut_34_0 = null;
        Object stackOut_41_0 = null;
        boolean stackOut_81_0 = false;
        boolean stackOut_84_0 = false;
        int stackOut_84_1 = 0;
        boolean stackOut_82_0 = false;
        boolean stackOut_83_0 = false;
        int stackOut_83_1 = 0;
        Object stackOut_141_0 = null;
        Object stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        Object stackOut_142_0 = null;
        Object stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        L0: {
          L1: {
            var16 = ArcanistsMulti.field_G ? 1 : 0;
            var2_int = ((ml) this).x(32) ? 1 : 0;
            var3 = ((ml) this).s(-1) ? 1 : 0;
            var4 = 0;
            var5 = 0;
            if (((ml) this).field_jb == 28) {
              break L1;
            } else {
              if (((ml) this).field_jb == 29) {
                break L1;
              } else {
                if (((ml) this).field_jb == 30) {
                  break L1;
                } else {
                  if (32 == ((ml) this).field_jb) {
                    break L1;
                  } else {
                    if (7 != ((ml) this).field_L.field_x[((ml) this).field_u]) {
                      break L0;
                    } else {
                      if (((ml) this).field_L.field_X[((ml) this).field_u] > 0) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
          if (((ml) this).field_lb < 0) {
            break L0;
          } else {
            if (~((ml) this).field_lb >= ~((ml) this).field_L.field_y) {
              var5 = 1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          L3: {
            if (((ml) this).field_q > 0) {
              break L3;
            } else {
              L4: {
                if (((ml) this).field_jb == 0) {
                  break L4;
                } else {
                  if (18 == ((ml) this).field_jb) {
                    break L4;
                  } else {
                    if (((ml) this).field_jb == 19) {
                      break L4;
                    } else {
                      if (((ml) this).field_jb == 9) {
                        break L4;
                      } else {
                        if (16 == ((ml) this).field_jb) {
                          break L4;
                        } else {
                          if (((ml) this).field_jb == 7) {
                            break L4;
                          } else {
                            if (((ml) this).field_jb != 37) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              pi.field_b.a((byte) 113, ((ml) this).field_L.field_i);
              var6_ref_ml = (ml) (Object) pi.field_b.b(-51);
              L5: while (true) {
                if (var6_ref_ml == null) {
                  break L3;
                } else {
                  stackOut_34_0 = var6_ref_ml.field_s;
                  stackIn_42_0 = stackOut_34_0;
                  stackIn_35_0 = stackOut_34_0;
                  if (var16 != 0) {
                    break L2;
                  } else {
                    L6: {
                      if ((Object) (Object) stackIn_35_0 != this) {
                        break L6;
                      } else {
                        if (!var6_ref_ml.x(32)) {
                          break L6;
                        } else {
                          var4 = 1;
                          ((ml) this).field_L.a(var6_ref_ml, 0);
                          break L6;
                        }
                      }
                    }
                    var6_ref_ml = (ml) (Object) pi.field_b.d(-18502);
                    if (var16 == 0) {
                      continue L5;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackOut_41_0 = this;
          stackIn_42_0 = (ml) (Object) stackOut_41_0;
          break L2;
        }
        this.field_hb = true;
        if (param0 == -120) {
          L7: {
            var6 = ((ml) this).field_X;
            if (((ml) this).field_P <= 0) {
              ((ml) this).field_X = ((ml) this).field_X + ((ml) this).field_kb;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            L9: {
              var7 = ((ml) this).field_R;
              ((ml) this).field_R = ((ml) this).field_R + ((ml) this).field_eb;
              if (var3 == 0) {
                break L9;
              } else {
                L10: {
                  ((ml) this).field_F = ((ml) this).field_F + 0.4;
                  if (((ml) this).field_F > 6.28) {
                    ((ml) this).field_F = ((ml) this).field_F - 6.28;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  ((ml) this).field_kb = ((ml) this).field_kb * 15 >> -1656332892;
                  ((ml) this).field_eb = ((ml) this).field_eb * 15 >> -580871356;
                  if (0 < ((ml) this).field_kb) {
                    ((ml) this).field_kb = ((ml) this).field_kb - 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (0 >= ((ml) this).field_eb) {
                    break L12;
                  } else {
                    ((ml) this).field_eb = ((ml) this).field_eb - 1;
                    break L12;
                  }
                }
                L13: {
                  if (((ml) this).field_kb >= 0) {
                    break L13;
                  } else {
                    ((ml) this).field_kb = ((ml) this).field_kb + 1;
                    break L13;
                  }
                }
                L14: {
                  if (((ml) this).field_eb >= 0) {
                    break L14;
                  } else {
                    ((ml) this).field_eb = ((ml) this).field_eb + 1;
                    break L14;
                  }
                }
                L15: {
                  if (0 != Math.abs(((ml) this).field_kb)) {
                    break L15;
                  } else {
                    if (Math.abs(((ml) this).field_eb) != 0) {
                      break L15;
                    } else {
                      ((ml) this).field_kb = 0;
                      ((ml) this).field_eb = 0;
                      ((ml) this).field_z = false;
                      break L15;
                    }
                  }
                }
                L16: {
                  if (((ml) this).field_Y << 977062148 <= ((ml) this).field_R) {
                    break L16;
                  } else {
                    ((ml) this).field_L.field_G = 25;
                    ((ml) this).field_R = ((ml) this).field_Y << 588371396;
                    break L16;
                  }
                }
                L17: {
                  if (~((ml) this).field_X > ~(((ml) this).field_Y << -866983357)) {
                    ((ml) this).field_L.field_G = 25;
                    ((ml) this).field_X = ((ml) this).field_Y << 557760323;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                if (~(((ml) this).field_L.field_y - (((ml) this).field_Y >> 507640129) << 607008356) > ~((ml) this).field_X) {
                  ((ml) this).field_X = -(((ml) this).field_Y >> -1466448863) + ((ml) this).field_L.field_y << 1069606372;
                  ((ml) this).field_L.field_G = 25;
                  if (var16 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                } else {
                  break L8;
                }
              }
            }
            ((ml) this).field_eb = ((ml) this).field_eb + 4;
            break L8;
          }
          L18: {
            if (var2_int == 0) {
              break L18;
            } else {
              if (((ml) this).field_s.field_q <= 0) {
                ((ml) this).field_L.a(((ml) this).field_s, 0);
                var8 = -((ml) this).field_lb + ((ml) this).field_s.field_lb;
                var9_int = ((ml) this).field_s.field_db - ((ml) this).field_db - (-(((ml) this).field_Y / 2) - -(((ml) this).field_s.field_Y / 2));
                if (var9_int * var9_int + var8 * var8 >= (((ml) this).field_s.field_Y + ((ml) this).field_Y) * (((ml) this).field_s.field_Y + ((ml) this).field_Y) >> -399988894) {
                  break L18;
                } else {
                  L19: {
                    if (((ml) this).field_s.field_x <= 0) {
                      break L19;
                    } else {
                      L20: {
                        stackOut_81_0 = ((ml) this).field_s.field_U;
                        stackIn_84_0 = stackOut_81_0;
                        stackIn_82_0 = stackOut_81_0;
                        if (((ml) this).field_U) {
                          stackOut_84_0 = stackIn_84_0;
                          stackOut_84_1 = 0;
                          stackIn_85_0 = stackOut_84_0;
                          stackIn_85_1 = stackOut_84_1;
                          break L20;
                        } else {
                          stackOut_82_0 = stackIn_82_0;
                          stackIn_83_0 = stackOut_82_0;
                          stackOut_83_0 = stackIn_83_0;
                          stackOut_83_1 = 1;
                          stackIn_85_0 = stackOut_83_0;
                          stackIn_85_1 = stackOut_83_1;
                          break L20;
                        }
                      }
                      if ((stackIn_85_0 ? 1 : 0) == stackIn_85_1) {
                        break L19;
                      } else {
                        L21: {
                          var10 = ((ml) this).field_s.field_x;
                          if (~(((ml) this).field_ib + -((ml) this).field_x) <= ~var10) {
                            break L21;
                          } else {
                            var10 = ((ml) this).field_ib - ((ml) this).field_x;
                            break L21;
                          }
                        }
                        L22: {
                          if (var10 < 0) {
                            var10 = 0;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (0 < var10) {
                          ((ml) this).field_L.field_cb[((ml) this).field_s.field_u] = ((ml) this).field_L.field_cb[((ml) this).field_s.field_u] + var10;
                          ((ml) this).field_x = ((ml) this).field_x + var10;
                          ((ml) this).field_s.field_x = ((ml) this).field_s.field_x - var10;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  L23: {
                    if (!((ml) this).field_s.field_z) {
                      break L23;
                    } else {
                      if (((ml) this).field_s.field_eb < 0) {
                        break L18;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    ((ml) this).field_s.field_R = ((ml) this).field_R + -(((ml) this).field_Y << -1597748957);
                    ((ml) this).field_s.field_X = ((ml) this).field_X + -(((ml) this).field_E * (((ml) this).field_Y << 755019297));
                    if (((ml) this).field_s.field_Y > 32) {
                      ((ml) this).field_s.field_R = ((ml) this).field_s.field_R + 192;
                      ((ml) this).field_s.field_X = ((ml) this).field_s.field_X + 0 * ((ml) this).field_E;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (((ml) this).field_jb != 32) {
                      break L25;
                    } else {
                      ((ml) this).field_s.field_X = ((ml) this).field_s.field_X + 448 * ((ml) this).field_E;
                      ((ml) this).field_s.field_R = ((ml) this).field_s.field_R - 480;
                      break L25;
                    }
                  }
                  ((ml) this).field_lb = ((ml) this).field_X >> 91900420;
                  ((ml) this).field_db = ((ml) this).field_R >> 595052516;
                  ((ml) this).field_s.field_db = ((ml) this).field_s.field_R >> 9382084;
                  ((ml) this).field_s.field_E = ((ml) this).field_E;
                  ((ml) this).field_s.field_lb = ((ml) this).field_s.field_X >> 1650459556;
                  break L18;
                }
              } else {
                break L18;
              }
            }
          }
          L26: {
            ((ml) this).field_lb = ((ml) this).field_X >> -1221777500;
            ((ml) this).field_db = ((ml) this).field_R >> -10866364;
            if (((ml) this).field_P <= 0) {
              break L26;
            } else {
              ((ml) this).field_P = ((ml) this).field_P - 1;
              break L26;
            }
          }
          L27: {
            L28: {
              L29: {
                if (((ml) this).field_P > 0) {
                  break L29;
                } else {
                  if (((ml) this).field_L.b(((ml) this).field_db - ((ml) this).field_Y, 2, -(((ml) this).field_Y >> 2084430369) + ((ml) this).field_lb, ((ml) this).field_w)) {
                    break L28;
                  } else {
                    break L29;
                  }
                }
              }
              ((ml) this).field_A = 0;
              if (var16 == 0) {
                break L27;
              } else {
                break L28;
              }
            }
            L30: {
              var10 = ((ml) this).field_kb;
              var11 = ((ml) this).field_eb;
              var9_int = ((ml) this).field_db + -ce.field_k + (((ml) this).field_Y >> 1633650273);
              var8 = ((ml) this).field_lb + -di.field_m;
              var12 = am.a(var9_int, var8, false);
              if (var12 < 1) {
                var8 = 0;
                var9_int = -1;
                var12 = 1;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              var13 = (var8 * (((ml) this).field_kb << -2060251416) - -((((ml) this).field_eb << -2021083160) * var9_int)) / var12;
              ((ml) this).field_X = var6;
              var14 = (-((((ml) this).field_eb << -376027896) * var8) + (((ml) this).field_kb << -247100024) * var9_int) / var12;
              if (((ml) this).field_P > 0) {
                break L31;
              } else {
                ((ml) this).field_R = var7;
                break L31;
              }
            }
            L32: {
              L33: {
                L34: {
                  ((ml) this).field_db = ((ml) this).field_R >> 944466084;
                  ((ml) this).field_lb = ((ml) this).field_X >> 1911184516;
                  if (32768 < var13) {
                    break L34;
                  } else {
                    if (((ml) this).field_eb < 0) {
                      break L34;
                    } else {
                      if (Math.abs(var14) <= 8192) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                }
                L35: {
                  var13 = -(var13 >> -1971030206);
                  var14 = var14 >> 1624992738;
                  if (var3 == 0) {
                    break L35;
                  } else {
                    var14 = 0;
                    var13 = var13 << -1818665535;
                    break L35;
                  }
                }
                ((ml) this).field_eb = (-(var8 * var14) + var13 * var9_int) / var12 >> 847282088;
                ((ml) this).field_kb = (var14 * var9_int + var13 * var8) / var12 >> -1324582456;
                if (var16 == 0) {
                  break L32;
                } else {
                  break L33;
                }
              }
              var13 = 0;
              var14 = 0;
              this.b(-30225, 51);
              ((ml) this).field_eb = 0;
              ((ml) this).field_kb = 0;
              break L32;
            }
            L36: {
              ((ml) this).field_A = ((ml) this).field_A + 1;
              if (5 < ((ml) this).field_A) {
                ((ml) this).field_eb = 0;
                ((ml) this).field_z = false;
                ((ml) this).field_A = 0;
                ((ml) this).field_kb = 0;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (Math.abs(var14 >> -792557112) >= 16) {
                break L37;
              } else {
                if (Math.abs(var13 >> -905626744) >= 16) {
                  break L37;
                } else {
                  ((ml) this).field_A = 0;
                  ((ml) this).field_z = false;
                  break L37;
                }
              }
            }
            if (0 <= ((ml) this).field_db - ((ml) this).field_Y) {
              break L27;
            } else {
              if (((ml) this).field_jb == 12) {
                break L27;
              } else {
                if (((ml) this).g((byte) 109)) {
                  break L27;
                } else {
                  L38: {
                    ((ml) this).field_kb = 2 * var10;
                    if (((ml) this).field_kb <= -5) {
                      break L38;
                    } else {
                      if (((ml) this).field_kb >= 5) {
                        break L38;
                      } else {
                        L39: {
                          stackOut_141_0 = this;
                          stackIn_144_0 = stackOut_141_0;
                          stackIn_142_0 = stackOut_141_0;
                          if (((ml) this).field_kb < 0) {
                            stackOut_144_0 = this;
                            stackOut_144_1 = -5;
                            stackIn_145_0 = stackOut_144_0;
                            stackIn_145_1 = stackOut_144_1;
                            break L39;
                          } else {
                            stackOut_142_0 = this;
                            stackIn_143_0 = stackOut_142_0;
                            stackOut_143_0 = this;
                            stackOut_143_1 = 5;
                            stackIn_145_0 = stackOut_143_0;
                            stackIn_145_1 = stackOut_143_1;
                            break L39;
                          }
                        }
                        ((ml) this).field_kb = stackIn_145_1;
                        break L38;
                      }
                    }
                  }
                  L40: {
                    ((ml) this).field_eb = -5 + -Math.abs(var11);
                    var15 = aj.a((ml) null, ((ml) this).field_db, false, 101, ((ml) this).field_L, ((ml) this).field_lb);
                    ((ml) this).field_L.b(52, var15);
                    ((ml) this).field_L.a(((ml) this).field_lb, ((ml) this).field_Y * 2, (byte) 51, -(((ml) this).field_Y / 2) + ((ml) this).field_db);
                    ((ml) this).field_z = true;
                    if (((ml) this).field_x < ((ml) this).field_ib) {
                      ((ml) this).field_x = ((ml) this).field_x + 15;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  ((ml) this).field_L.field_G = 25;
                  break L27;
                }
              }
            }
          }
          L41: {
            ((ml) this).field_M = 0;
            if (~(-16 + ((ml) this).field_L.field_H) < ~((ml) this).field_db) {
              break L41;
            } else {
              if (var5 == 0) {
                break L41;
              } else {
                ((ml) this).field_db = -16 + ((ml) this).field_L.field_H;
                ((ml) this).field_A = 0;
                ((ml) this).field_R = ((ml) this).field_db << -1358141692;
                ((ml) this).field_z = false;
                break L41;
              }
            }
          }
          L42: {
            var8 = -((ml) this).field_eb;
            if (((ml) this).field_Y >> 1575916801 < var8) {
              var8 = ((ml) this).field_Y >> -847457759;
              break L42;
            } else {
              break L42;
            }
          }
          L43: {
            if (~-(((ml) this).field_Y >> 1492758753) >= ~var8) {
              break L43;
            } else {
              var8 = -(((ml) this).field_Y >> -254484223);
              break L43;
            }
          }
          L44: {
            ((ml) this).field_O = -(var8 >> 981446754);
            ((ml) this).field_o = var8 >> -519481374;
            ((ml) this).field_N = -(var8 >> 1755592482);
            ((ml) this).field_Z = var8 >> 1383209730;
            if (var2_int == 0) {
              break L44;
            } else {
              if (0 >= ((ml) this).field_s.field_ib) {
                break L44;
              } else {
                ((ml) this).field_L.a(-41, ((ml) this).field_s);
                break L44;
              }
            }
          }
          L45: {
            L46: {
              if (var4 == 0) {
                break L46;
              } else {
                pi.field_b.a((byte) 87, ((ml) this).field_L.field_i);
                var9 = (ml) (Object) pi.field_b.b(-109);
                L47: while (true) {
                  if (var9 == null) {
                    break L46;
                  } else {
                    if (var16 != 0) {
                      break L45;
                    } else {
                      L48: {
                        if (this != (Object) (Object) var9.field_s) {
                          break L48;
                        } else {
                          if (var9.x(32)) {
                            if (var9.field_ib > 0) {
                              ((ml) this).field_L.a(-45, var9);
                              break L48;
                            } else {
                              break L48;
                            }
                          } else {
                            break L48;
                          }
                        }
                      }
                      var9 = (ml) (Object) pi.field_b.d(param0 ^ 18482);
                      if (var16 == 0) {
                        continue L47;
                      } else {
                        break L46;
                      }
                    }
                  }
                }
              }
            }
            break L45;
          }
          return;
        } else {
          return;
        }
    }

    final ml a(nf param0, byte param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        ml stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var3 = new ml(param0);
            var3.field_T = ((ml) this).field_T;
            var3.field_U = ((ml) this).field_U;
            var3.field_u = ((ml) this).field_u;
            var3.field_jb = ((ml) this).field_jb;
            var3.a(12, true);
            if (((ml) this).field_x == 0) {
              var3.field_q = ((ml) this).field_q;
              var3.field_X = ((ml) this).field_X;
              var3.field_R = ((ml) this).field_R;
              var3.field_db = ((ml) this).field_db;
              var3.field_lb = ((ml) this).field_lb;
              var3.field_p = ((ml) this).field_p;
              var3.field_ib = ((ml) this).field_ib;
              var3.field_D = ((ml) this).field_D;
              if (((ml) this).field_z) {
                throw new IllegalStateException();
              } else {
                if (0 != ((ml) this).field_M) {
                  throw new IllegalStateException();
                } else {
                  L1: {
                    var3.field_O = ((ml) this).field_O;
                    var3.field_N = ((ml) this).field_N;
                    var3.field_t = ((ml) this).field_t;
                    var3.field_E = ((ml) this).field_E;
                    var3.field_o = ((ml) this).field_o;
                    var3.field_P = ((ml) this).field_P;
                    var3.field_y = ((ml) this).field_y;
                    if (param1 == 59) {
                      break L1;
                    } else {
                      this.b(-34, 73);
                      break L1;
                    }
                  }
                  var3.field_n = ((ml) this).field_n;
                  var3.field_F = ((ml) this).field_F;
                  var3.field_r = ((ml) this).field_r;
                  var3.field_A = ((ml) this).field_A;
                  var3.field_Z = ((ml) this).field_Z;
                  stackOut_14_0 = (ml) var3;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                }
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("ml.G(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    final int y(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 17571) {
                break L1;
              } else {
                ((ml) this).field_D = true;
                break L1;
              }
            }
            stackOut_3_0 = ((ml) this).field_T;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.AA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = 95 / ((param0 - -11) / 35);
            stackOut_0_0 = ((ml) this).field_lb;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.B(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final boolean c(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((ml) this).field_y = -31;
                break L1;
              }
            }
            stackOut_3_0 = ((ml) this).field_D;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.GB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void n(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_38_0 = 0;
        boolean stackIn_69_0 = false;
        boolean stackIn_76_0 = false;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        boolean stackOut_68_0 = false;
        boolean stackOut_75_0 = false;
        L0: {
          L1: {
            var11 = ArcanistsMulti.field_G ? 1 : 0;
            var2_int = ((ml) this).g((byte) 117) ? 1 : 0;
            var3 = this.d(-10265) ? 1 : 0;
            var4 = ((ml) this).x(32) ? 1 : 0;
            var5 = 0;
            if (((ml) this).field_jb == 28) {
              break L1;
            } else {
              if (29 == ((ml) this).field_jb) {
                break L1;
              } else {
                if (((ml) this).field_jb == 30) {
                  break L1;
                } else {
                  if (((ml) this).field_jb == 32) {
                    break L1;
                  } else {
                    if (((ml) this).field_L.field_x[((ml) this).field_u] != 7) {
                      break L0;
                    } else {
                      if (((ml) this).field_L.field_X[((ml) this).field_u] > 0) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
          if (0 > ((ml) this).field_lb) {
            break L0;
          } else {
            if (((ml) this).field_lb > ((ml) this).field_L.field_y) {
              break L0;
            } else {
              var5 = 1;
              break L0;
            }
          }
        }
        L2: {
          if (var3 != 0) {
            break L2;
          } else {
            if (((ml) this).field_L.a(61, ((ml) this).field_w, -((ml) this).field_Y + ((ml) this).field_db - -1, -(((ml) this).field_Y >> 856517889) + ((ml) this).field_lb, ((ml) this).field_db - ((ml) this).field_Y)) {
              break L2;
            } else {
              L3: {
                if (var5 == 0) {
                  break L3;
                } else {
                  if (((ml) this).field_db >= -16 + ((ml) this).field_L.field_H) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((ml) this).field_P = 0;
              ((ml) this).field_eb = 0;
              ((ml) this).field_kb = 0;
              ((ml) this).field_z = true;
              break L2;
            }
          }
        }
        L4: {
          if (~(-16 + ((ml) this).field_L.field_H) < ~((ml) this).field_db) {
            break L4;
          } else {
            if (var5 != 0) {
              ((ml) this).field_db = -16 + ((ml) this).field_L.field_H;
              ((ml) this).field_A = 0;
              ((ml) this).field_R = ((ml) this).field_db << 515846852;
              ((ml) this).field_z = false;
              break L4;
            } else {
              break L4;
            }
          }
        }
        if (this.e(true)) {
          return;
        } else {
          L5: {
            if (((ml) this).field_z) {
              ((ml) this).field_M = 0;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (((ml) this).field_M != 0) {
              stackOut_37_0 = 0;
              stackIn_38_0 = stackOut_37_0;
              break L6;
            } else {
              stackOut_36_0 = 1;
              stackIn_38_0 = stackOut_36_0;
              break L6;
            }
          }
          L7: {
            var6 = stackIn_38_0;
            if (((ml) this).field_M == 0) {
              L8: {
                if (((ml) this).field_jb == 40) {
                  break L8;
                } else {
                  L9: {
                    if (((ml) this).field_ab != 3) {
                      break L9;
                    } else {
                      if (((ml) this).field_jb != 0) {
                        break L9;
                      } else {
                        ((ml) this).field_F = ((ml) this).field_F * 0.9;
                        if (var11 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  ((ml) this).field_F = 0.0;
                  if (var11 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              ((ml) this).field_F = ((ml) this).field_F + 0.1;
              if (6.283185307179586 >= ((ml) this).field_F) {
                break L7;
              } else {
                ((ml) this).field_F = ((ml) this).field_F - 6.283185307179586;
                break L7;
              }
            } else {
              break L7;
            }
          }
          L10: {
            if (var2_int != 0) {
              L11: {
                L12: {
                  if (((ml) this).field_M == 2) {
                    break L12;
                  } else {
                    if (((ml) this).field_M == 3) {
                      break L12;
                    } else {
                      if (((ml) this).field_q > 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                ((ml) this).field_db = ((ml) this).field_db - ((ml) this).field_Y / 2;
                ((ml) this).field_jb = 0;
                ((ml) this).field_R = ((ml) this).field_db << -590380668;
                ((ml) this).field_z = true;
                ((ml) this).field_q = 0;
                ((ml) this).field_Y = 32;
                ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                ((ml) this).field_w.a();
                de.i(((ml) this).field_Y >> 1259726881, ((ml) this).field_Y >> 291763841, ((ml) this).field_Y >> 981384481, 16777215);
                break L11;
              }
              if (((ml) this).field_jb != 38) {
                ((ml) this).field_M = 0;
                break L10;
              } else {
                break L10;
              }
            } else {
              break L10;
            }
          }
          L13: {
            L14: {
              if (((ml) this).field_M == -1) {
                break L14;
              } else {
                if (1 != ((ml) this).field_M) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            ((ml) this).field_E = ((ml) this).field_M;
            ((ml) this).field_db = ((ml) this).field_R >> -1822090396;
            ((ml) this).field_lb = ((ml) this).field_X >> -1549961436;
            var7 = ((ml) this).field_M + ((ml) this).field_lb;
            var8 = ((ml) this).field_db;
            var9 = 0;
            L15: while (true) {
              L16: {
                L17: {
                  if (8 <= var9) {
                    break L17;
                  } else {
                    stackOut_68_0 = ((ml) this).field_L.b(-((ml) this).field_Y + var8, 2, -(((ml) this).field_Y >> 1393985441) + var7, ((ml) this).field_w);
                    stackIn_76_0 = stackOut_68_0;
                    stackIn_69_0 = stackOut_68_0;
                    if (var11 != 0) {
                      break L16;
                    } else {
                      L18: {
                        L19: {
                          if (stackIn_69_0) {
                            break L19;
                          } else {
                            var8++;
                            if (var11 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var8--;
                        break L18;
                      }
                      var9++;
                      if (var11 == 0) {
                        continue L15;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                stackOut_75_0 = ((ml) this).field_L.b(((ml) this).field_db - ((ml) this).field_Y, 2, ((ml) this).field_lb - (((ml) this).field_Y >> 2141450113), ((ml) this).field_w);
                stackIn_76_0 = stackOut_75_0;
                break L16;
              }
              L20: {
                if (!stackIn_76_0) {
                  break L20;
                } else {
                  var8--;
                  break L20;
                }
              }
              L21: {
                ((ml) this).field_kb = 0;
                ((ml) this).field_eb = 0;
                if (var5 == 0) {
                  break L21;
                } else {
                  if (~(-16 + ((ml) this).field_L.field_H) < ~((ml) this).field_db) {
                    break L21;
                  } else {
                    if (~((ml) this).field_db > ~var8) {
                      var8 = ((ml) this).field_db;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              L22: {
                if (-((ml) this).field_Y + var8 >= 0) {
                  break L22;
                } else {
                  var8 = -100;
                  ((ml) this).field_L.field_G = 25;
                  break L22;
                }
              }
              L23: {
                L24: {
                  if (Math.abs(-((ml) this).field_db + var8) >= 5) {
                    break L24;
                  } else {
                    L25: {
                      if (~var7 == ~((ml) this).field_lb) {
                        break L25;
                      } else {
                        if (((ml) this).field_s == null) {
                          ((ml) this).field_L.field_Ob[((ml) this).field_T] = ((ml) this).field_L.field_Ob[((ml) this).field_T] + 1;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      L27: {
                        L28: {
                          ((ml) this).field_lb = var7;
                          if (((ml) this).field_ab != 3) {
                            break L28;
                          } else {
                            if (((ml) this).field_jb == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        ((ml) this).field_F = ((ml) this).field_F + 0.4;
                        if (var11 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                      ((ml) this).field_F = ((ml) this).field_F + 0.1;
                      break L26;
                    }
                    L29: {
                      ((ml) this).field_db = var8;
                      if (((ml) this).field_Y > 90) {
                        break L29;
                      } else {
                        if (((ml) this).field_jb == 31) {
                          break L29;
                        } else {
                          break L23;
                        }
                      }
                    }
                    ((ml) this).field_F = ((ml) this).field_F - 0.3;
                    if (var11 == 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                L30: {
                  L31: {
                    if (var8 <= ((ml) this).field_db) {
                      break L31;
                    } else {
                      if (((ml) this).field_jb != 38) {
                        break L30;
                      } else {
                        break L31;
                      }
                    }
                  }
                  if (((ml) this).field_db >= var8) {
                    break L23;
                  } else {
                    if (38 != ((ml) this).field_jb) {
                      break L23;
                    } else {
                      L32: {
                        ((ml) this).field_lb = var7;
                        ((ml) this).field_F = ((ml) this).field_F + 0.4;
                        if (90 < ((ml) this).field_Y) {
                          break L32;
                        } else {
                          if (31 == ((ml) this).field_jb) {
                            break L32;
                          } else {
                            break L23;
                          }
                        }
                      }
                      ((ml) this).field_F = ((ml) this).field_F - 0.3;
                      if (var11 == 0) {
                        break L23;
                      } else {
                        break L30;
                      }
                    }
                  }
                }
                ((ml) this).field_kb = 16 * ((ml) this).field_M;
                ((ml) this).field_z = true;
                ((ml) this).field_eb = -16;
                if (((ml) this).field_jb != 36) {
                  break L23;
                } else {
                  L33: {
                    if (!((ml) this).field_U) {
                      break L33;
                    } else {
                      if (lk.a(0, (byte) -61)) {
                        break L33;
                      } else {
                        break L23;
                      }
                    }
                  }
                  ((ml) this).field_kb = 0;
                  break L23;
                }
              }
              ((ml) this).field_X = ((ml) this).field_lb << 1148909796;
              ((ml) this).field_R = ((ml) this).field_db << -770209884;
              ((ml) this).field_M = 0;
              if (var4 == 0) {
                break L13;
              } else {
                if (((ml) this).field_s.field_q <= 0) {
                  L34: {
                    ((ml) this).field_L.a(((ml) this).field_s, 0);
                    var9 = -((ml) this).field_lb + ((ml) this).field_s.field_lb;
                    var10 = ((ml) this).field_Y / 2 + (-((ml) this).field_db + (((ml) this).field_s.field_db - ((ml) this).field_s.field_Y / 2));
                    if (!((ml) this).field_s.field_z) {
                      break L34;
                    } else {
                      if (0 > ((ml) this).field_s.field_eb) {
                        break L13;
                      } else {
                        break L34;
                      }
                    }
                  }
                  if (~((((ml) this).field_s.field_Y + ((ml) this).field_Y) * (((ml) this).field_s.field_Y + ((ml) this).field_Y) >> 1399913218) < ~(var9 * var9 + var10 * var10)) {
                    L35: {
                      ((ml) this).field_s.field_X = -(((ml) this).field_E * (((ml) this).field_Y << -1146742303)) + ((ml) this).field_X;
                      ((ml) this).field_s.field_R = -(((ml) this).field_Y << 739612003) + ((ml) this).field_R;
                      if (32 >= ((ml) this).field_s.field_Y) {
                        break L35;
                      } else {
                        ((ml) this).field_s.field_R = ((ml) this).field_s.field_R + 192;
                        ((ml) this).field_s.field_X = ((ml) this).field_s.field_X + 0 * ((ml) this).field_E;
                        break L35;
                      }
                    }
                    L36: {
                      if (((ml) this).field_jb == 32) {
                        ((ml) this).field_s.field_R = ((ml) this).field_s.field_R - 480;
                        ((ml) this).field_s.field_X = ((ml) this).field_s.field_X + ((ml) this).field_E * 448;
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    ((ml) this).field_lb = ((ml) this).field_X >> -860162812;
                    ((ml) this).field_db = ((ml) this).field_R >> -372875740;
                    ((ml) this).field_s.field_E = ((ml) this).field_E;
                    ((ml) this).field_s.field_db = ((ml) this).field_s.field_R >> -102326044;
                    ((ml) this).field_s.field_lb = ((ml) this).field_s.field_X >> -966954236;
                    break L13;
                  } else {
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
            }
          }
          L37: {
            if (2 != ((ml) this).field_M) {
              break L37;
            } else {
              L38: {
                if (null != ((ml) this).field_s) {
                  break L38;
                } else {
                  ((ml) this).field_L.field_c[((ml) this).field_T] = ((ml) this).field_L.field_c[((ml) this).field_T] + 1;
                  break L38;
                }
              }
              L39: {
                ((ml) this).field_kb = ((ml) this).field_E * 64;
                ((ml) this).field_eb = -96;
                if (((ml) this).field_jb == 4) {
                  ((ml) this).field_eb = -128;
                  ((ml) this).field_kb = 96 * ((ml) this).field_E;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                L41: {
                  if (5 == ((ml) this).field_jb) {
                    break L41;
                  } else {
                    if (((ml) this).field_jb != 31) {
                      break L40;
                    } else {
                      break L41;
                    }
                  }
                }
                ((ml) this).field_eb = -64;
                break L40;
              }
              L42: {
                if (((ml) this).field_jb == 1) {
                  ((ml) this).field_kb = 96 * ((ml) this).field_E;
                  ((ml) this).field_eb = -32;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                L44: {
                  if (((ml) this).field_jb == 2) {
                    break L44;
                  } else {
                    if (32 == ((ml) this).field_jb) {
                      break L44;
                    } else {
                      break L43;
                    }
                  }
                }
                ((ml) this).field_eb = -32;
                break L43;
              }
              L45: {
                L46: {
                  if (7 == ((ml) this).field_jb) {
                    break L46;
                  } else {
                    if (((ml) this).field_jb == 9) {
                      break L46;
                    } else {
                      break L45;
                    }
                  }
                }
                ((ml) this).field_eb = -32;
                break L45;
              }
              L47: {
                if (var3 == 0) {
                  break L47;
                } else {
                  ((ml) this).field_eb = -64;
                  break L47;
                }
              }
              L48: {
                if (((ml) this).field_L.field_x[((ml) this).field_u] == 3) {
                  L49: {
                    var7 = ((ml) this).field_L.field_X[((ml) this).field_u] / 20;
                    ((ml) this).field_kb = ((ml) this).field_kb + 8 * (var7 * ((ml) this).field_E);
                    ((ml) this).field_eb = ((ml) this).field_eb - 8 * var7;
                    if (96 < ((ml) this).field_kb * ((ml) this).field_E) {
                      ((ml) this).field_kb = ((ml) this).field_E * 96;
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                  if (((ml) this).field_eb >= -128) {
                    break L48;
                  } else {
                    ((ml) this).field_eb = -128;
                    break L48;
                  }
                } else {
                  break L48;
                }
              }
              L50: {
                if (36 != ((ml) this).field_jb) {
                  break L50;
                } else {
                  L51: {
                    if (!((ml) this).field_U) {
                      break L51;
                    } else {
                      if (!lk.a(0, (byte) -88)) {
                        break L50;
                      } else {
                        break L51;
                      }
                    }
                  }
                  ((ml) this).field_kb = 0;
                  ((ml) this).field_eb = -32;
                  break L50;
                }
              }
              ((ml) this).field_M = 0;
              ((ml) this).field_z = true;
              ((ml) this).field_P = 0;
              this.b(-30225, 49);
              break L37;
            }
          }
          L52: {
            if (((ml) this).field_M != 3) {
              break L52;
            } else {
              L53: {
                if (((ml) this).field_s == null) {
                  ((ml) this).field_L.field_c[((ml) this).field_T] = ((ml) this).field_L.field_c[((ml) this).field_T] + 1;
                  break L53;
                } else {
                  break L53;
                }
              }
              L54: {
                ((ml) this).field_kb = ((ml) this).field_E * 16;
                ((ml) this).field_eb = -128;
                if (4 == ((ml) this).field_jb) {
                  ((ml) this).field_eb = -148;
                  break L54;
                } else {
                  break L54;
                }
              }
              L55: {
                L56: {
                  if (((ml) this).field_jb == 5) {
                    break L56;
                  } else {
                    if (((ml) this).field_jb != 31) {
                      break L55;
                    } else {
                      break L56;
                    }
                  }
                }
                ((ml) this).field_eb = -96;
                break L55;
              }
              L57: {
                if (((ml) this).field_jb == 1) {
                  ((ml) this).field_eb = -64;
                  break L57;
                } else {
                  break L57;
                }
              }
              L58: {
                if (2 != ((ml) this).field_jb) {
                  break L58;
                } else {
                  ((ml) this).field_eb = -48;
                  break L58;
                }
              }
              L59: {
                L60: {
                  if (((ml) this).field_jb == 7) {
                    break L60;
                  } else {
                    if (((ml) this).field_jb == 9) {
                      break L60;
                    } else {
                      break L59;
                    }
                  }
                }
                ((ml) this).field_eb = -64;
                break L59;
              }
              L61: {
                if (var3 != 0) {
                  ((ml) this).field_kb = 32 * ((ml) this).field_E;
                  ((ml) this).field_eb = -128;
                  break L61;
                } else {
                  break L61;
                }
              }
              L62: {
                if (((ml) this).field_L.field_x[((ml) this).field_u] != 3) {
                  break L62;
                } else {
                  L63: {
                    var7 = ((ml) this).field_L.field_X[((ml) this).field_u] / 20;
                    ((ml) this).field_eb = ((ml) this).field_eb - 8 * var7;
                    ((ml) this).field_kb = ((ml) this).field_kb + ((ml) this).field_E * var7 * 4;
                    if (((ml) this).field_kb * ((ml) this).field_E > 32) {
                      ((ml) this).field_kb = ((ml) this).field_E * 32;
                      break L63;
                    } else {
                      break L63;
                    }
                  }
                  if (-196 <= ((ml) this).field_eb) {
                    break L62;
                  } else {
                    ((ml) this).field_eb = -196;
                    break L62;
                  }
                }
              }
              L64: {
                if (((ml) this).field_jb != 36) {
                  break L64;
                } else {
                  L65: {
                    if (!((ml) this).field_U) {
                      break L65;
                    } else {
                      if (lk.a(0, (byte) -23)) {
                        break L65;
                      } else {
                        break L64;
                      }
                    }
                  }
                  ((ml) this).field_eb = -32;
                  ((ml) this).field_kb = 0;
                  break L64;
                }
              }
              ((ml) this).field_M = 0;
              ((ml) this).field_z = true;
              ((ml) this).field_P = 0;
              this.b(-30225, 50);
              break L52;
            }
          }
          L66: {
            var7 = 117 % ((param0 - -64) / 59);
            ((ml) this).field_M = 0;
            if (((ml) this).field_F <= 6.28) {
              break L66;
            } else {
              ((ml) this).field_F = ((ml) this).field_F - 6.28;
              this.b(-30225, 48);
              break L66;
            }
          }
          L67: {
            if (0.0 <= ((ml) this).field_F) {
              break L67;
            } else {
              ((ml) this).field_F = ((ml) this).field_F + 6.28;
              break L67;
            }
          }
          L68: {
            L69: {
              var8 = (int)(Math.cos(((ml) this).field_F) * (double)(((ml) this).field_Y >> 69387618));
              var9 = (int)(Math.sin(((ml) this).field_F) * (double)(((ml) this).field_Y >> 846017666));
              ((ml) this).field_n = var8 >> 2018888545;
              ((ml) this).field_N = var9 >> 1815737922;
              ((ml) this).field_O = -(var9 >> -875779294);
              if (0 < var8) {
                break L69;
              } else {
                ((ml) this).field_Z = 0;
                if (var11 == 0) {
                  break L68;
                } else {
                  break L69;
                }
              }
            }
            ((ml) this).field_Z = -var8;
            break L68;
          }
          L70: {
            L71: {
              ((ml) this).field_y = -var9;
              if (var8 >= 0) {
                break L71;
              } else {
                ((ml) this).field_o = var8;
                if (var11 == 0) {
                  break L70;
                } else {
                  break L71;
                }
              }
            }
            ((ml) this).field_o = 0;
            break L70;
          }
          L72: {
            ((ml) this).field_t = var9;
            ((ml) this).field_r = -(var8 >> -1765043423);
            if (var6 == 0) {
              break L72;
            } else {
              ((ml) this).field_N = ((ml) this).field_O;
              ((ml) this).field_Z = ((ml) this).field_o;
              break L72;
            }
          }
          L73: {
            if (var4 == 0) {
              break L73;
            } else {
              if (((ml) this).field_s.u(92)) {
                var8 = -((ml) this).field_lb + ((ml) this).field_s.field_lb;
                var9 = -((ml) this).field_db + ((ml) this).field_s.field_db;
                if (!((ml) this).field_s.field_z) {
                  break L73;
                } else {
                  if (((ml) this).field_s.field_eb < 0) {
                    break L73;
                  } else {
                    if ((((ml) this).field_Y - -((ml) this).field_s.field_Y) * (((ml) this).field_Y + ((ml) this).field_s.field_Y) >> 333751778 > var8 * var8 - -(var9 * var9)) {
                      L74: {
                        ((ml) this).field_L.a(((ml) this).field_s, 0);
                        ((ml) this).field_s.field_z = false;
                        ((ml) this).field_s.field_R = ((ml) this).field_R + -(((ml) this).field_Y << -1234880893);
                        ((ml) this).field_s.field_eb = 0;
                        ((ml) this).field_s.field_X = -(((ml) this).field_E * (((ml) this).field_Y << -43125439)) + ((ml) this).field_X;
                        ((ml) this).field_s.field_kb = 0;
                        if (((ml) this).field_s.field_Y > 32) {
                          ((ml) this).field_s.field_R = ((ml) this).field_s.field_R + 192;
                          ((ml) this).field_s.field_X = ((ml) this).field_s.field_X + 0 * ((ml) this).field_E;
                          break L74;
                        } else {
                          break L74;
                        }
                      }
                      L75: {
                        if (32 != ((ml) this).field_jb) {
                          break L75;
                        } else {
                          ((ml) this).field_s.field_R = ((ml) this).field_s.field_R - 480;
                          ((ml) this).field_s.field_X = ((ml) this).field_s.field_X + ((ml) this).field_E * 448;
                          break L75;
                        }
                      }
                      ((ml) this).field_lb = ((ml) this).field_X >> 635118404;
                      ((ml) this).field_db = ((ml) this).field_R >> 9273348;
                      ((ml) this).field_s.field_lb = ((ml) this).field_s.field_X >> 1738587204;
                      ((ml) this).field_s.field_E = ((ml) this).field_E;
                      ((ml) this).field_s.field_db = ((ml) this).field_s.field_R >> 328194148;
                      if (0 >= ((ml) this).field_s.field_ib) {
                        break L73;
                      } else {
                        ((ml) this).field_L.a(-124, ((ml) this).field_s);
                        break L73;
                      }
                    } else {
                      break L73;
                    }
                  }
                }
              } else {
                break L73;
              }
            }
          }
          return;
        }
    }

    private final void d(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.f((byte) -107) ? 1 : 0;
              ((ml) this).field_F = ((ml) this).field_F + 0.1;
              if (((ml) this).field_F > 6.28) {
                ((ml) this).field_F = ((ml) this).field_F - 6.28;
                break L1;
              } else {
                break L1;
              }
            }
            if (!this.e(param0)) {
              L2: {
                if (!((ml) this).field_z) {
                  break L2;
                } else {
                  ((ml) this).field_M = 0;
                  break L2;
                }
              }
              L3: {
                if (((ml) this).field_M != -1) {
                  break L3;
                } else {
                  if (((ml) this).field_X > ((ml) this).field_L.field_y << -1129068924) {
                    ((ml) this).field_M = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (((ml) this).field_M != 1) {
                  break L4;
                } else {
                  if (0 > ((ml) this).field_X) {
                    ((ml) this).field_M = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  if (1 == ((ml) this).field_M) {
                    break L6;
                  } else {
                    if (-1 != ((ml) this).field_M) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (((ml) this).field_M == ((ml) this).field_E) {
                    break L7;
                  } else {
                    ((ml) this).field_E = ((ml) this).field_M;
                    ((ml) this).field_M = 0;
                    ((ml) this).field_z = true;
                    ((ml) this).field_kb = 32 * ((ml) this).field_E;
                    if (!ArcanistsMulti.field_G) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                ((ml) this).field_E = ((ml) this).field_M;
                ((ml) this).field_kb = ((ml) this).field_E * 96;
                ((ml) this).field_z = true;
                ((ml) this).field_M = 0;
                break L5;
              }
              L8: {
                if (((ml) this).field_M != 2) {
                  break L8;
                } else {
                  ((ml) this).field_kb = 32 * ((ml) this).field_E;
                  ((ml) this).field_eb = 96;
                  ((ml) this).field_M = 0;
                  ((ml) this).field_z = true;
                  break L8;
                }
              }
              L9: {
                if (((ml) this).field_M == 3) {
                  ((ml) this).field_kb = ((ml) this).field_E * 32;
                  ((ml) this).field_M = 0;
                  ((ml) this).field_eb = -96;
                  ((ml) this).field_z = true;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                ((ml) this).field_M = 0;
                if (var2_int == 0) {
                  break L10;
                } else {
                  if (!((ml) this).field_s.u(101)) {
                    break L10;
                  } else {
                    var3 = ((ml) this).field_s.field_lb - ((ml) this).field_lb;
                    var4 = ((ml) this).field_s.field_db - ((ml) this).field_db;
                    if (!((ml) this).field_s.field_z) {
                      break L10;
                    } else {
                      if (((ml) this).field_s.field_eb < 0) {
                        break L10;
                      } else {
                        if (var4 * var4 + var3 * var3 >= (((ml) this).field_Y + ((ml) this).field_s.field_Y) * (((ml) this).field_s.field_Y + ((ml) this).field_Y) >> 1048191266) {
                          break L10;
                        } else {
                          L11: {
                            ((ml) this).field_L.a(((ml) this).field_s, 0);
                            ((ml) this).field_s.field_z = false;
                            ((ml) this).field_s.field_kb = 0;
                            ((ml) this).field_s.field_eb = 0;
                            ((ml) this).field_s.field_X = -((((ml) this).field_Y << 380777057) * ((ml) this).field_E) + ((ml) this).field_X;
                            ((ml) this).field_s.field_R = -(((ml) this).field_Y << -1206297917) + ((ml) this).field_R;
                            if (((ml) this).field_s.field_Y <= 32) {
                              break L11;
                            } else {
                              ((ml) this).field_s.field_X = ((ml) this).field_s.field_X + 0 * ((ml) this).field_E;
                              ((ml) this).field_s.field_R = ((ml) this).field_s.field_R + 192;
                              break L11;
                            }
                          }
                          L12: {
                            if (32 == ((ml) this).field_jb) {
                              ((ml) this).field_s.field_X = ((ml) this).field_s.field_X + ((ml) this).field_E * 448;
                              ((ml) this).field_s.field_R = ((ml) this).field_s.field_R - 480;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          ((ml) this).field_lb = ((ml) this).field_X >> -1950423900;
                          ((ml) this).field_db = ((ml) this).field_R >> -1953124124;
                          ((ml) this).field_s.field_lb = ((ml) this).field_s.field_X >> 1361347428;
                          ((ml) this).field_s.field_db = ((ml) this).field_s.field_R >> -1734672284;
                          ((ml) this).field_s.field_E = ((ml) this).field_E;
                          if (((ml) this).field_s.field_ib > 0) {
                            ((ml) this).field_L.a(-55, ((ml) this).field_s);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.UA(" + param0 + ')');
        }
    }

    final boolean f(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((ml) this).field_B = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!((ml) this).b((byte) -82)) {
                  break L3;
                } else {
                  L4: {
                    if (((ml) this).field_z) {
                      break L4;
                    } else {
                      if (((ml) this).field_hb) {
                        break L4;
                      } else {
                        if (((ml) this).field_x != 0) {
                          break L4;
                        } else {
                          if (((ml) this).field_ib > 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 1;
                  stackIn_19_0 = stackOut_16_0;
                  break L2;
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.JB(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -100) {
                break L1;
              } else {
                ml.a((dj) null, -106, (byte) 51, (dj) null);
                break L1;
              }
            }
            eb.a(param0, -105);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.V(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean j(int param0) {
        RuntimeException var2 = null;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -26) {
                break L1;
              } else {
                this.b(28, -45);
                break L1;
              }
            }
            L2: {
              L3: {
                if (13 == ((ml) this).field_jb) {
                  break L3;
                } else {
                  if (((ml) this).field_jb == 15) {
                    break L3;
                  } else {
                    if (((ml) this).field_jb == 14) {
                      break L3;
                    } else {
                      if (((ml) this).field_jb == 26) {
                        break L3;
                      } else {
                        if (39 != ((ml) this).field_jb) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_16_0 = 1;
              stackIn_19_0 = stackOut_16_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.T(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (3 == ((ml) this).field_jb) {
                this.b(-30225, dm.field_G[param1]);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ml) this).field_jb != 7) {
                break L2;
              } else {
                this.b(-30225, hi.field_f[param1]);
                break L2;
              }
            }
            L3: {
              if (((ml) this).field_jb == 1) {
                this.b(-30225, fb.field_b[param1]);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (9 == ((ml) this).field_jb) {
                this.b(-30225, ed.field_Ib[param1]);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (2 == ((ml) this).field_jb) {
                this.b(-30225, tc.field_B[param1]);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((ml) this).field_jb == 4) {
                this.b(-30225, in.field_Fb[param1]);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((ml) this).field_jb != 8) {
                break L7;
              } else {
                this.b(-30225, s.field_i[param1]);
                break L7;
              }
            }
            L8: {
              if (((ml) this).field_jb == 11) {
                this.b(-30225, lj.field_g[param1]);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((ml) this).field_jb == 5) {
                this.b(-30225, mb.field_U[param1]);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (((ml) this).field_jb != 14) {
                break L10;
              } else {
                this.b(-30225, lj.field_n[param1]);
                break L10;
              }
            }
            L11: {
              if (((ml) this).field_jb != 15) {
                break L11;
              } else {
                this.b(-30225, gd.field_pb[param1]);
                break L11;
              }
            }
            L12: {
              if (((ml) this).field_jb != 17) {
                break L12;
              } else {
                this.b(-30225, cj.field_a[param1]);
                break L12;
              }
            }
            L13: {
              if (((ml) this).field_jb != 6) {
                break L13;
              } else {
                this.b(-30225, vg.field_c[param1]);
                break L13;
              }
            }
            L14: {
              if (((ml) this).field_jb != 13) {
                break L14;
              } else {
                this.b(-30225, fi.field_c[param1]);
                break L14;
              }
            }
            L15: {
              if (((ml) this).field_jb != 10) {
                break L15;
              } else {
                this.b(-30225, gg.field_j[param1]);
                break L15;
              }
            }
            L16: {
              if (((ml) this).field_jb == 37) {
                this.b(-30225, om.field_B[param1]);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (((ml) this).field_jb != 39) {
                break L17;
              } else {
                this.b(-30225, u.field_h[param1]);
                break L17;
              }
            }
            L18: {
              if (((ml) this).field_jb == 33) {
                this.b(-30225, fk.field_h[param1]);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (((ml) this).field_jb == 31) {
                this.b(-30225, jn.field_a[param1]);
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (((ml) this).field_jb != 32) {
                break L20;
              } else {
                this.b(-30225, fd.field_h[param1]);
                break L20;
              }
            }
            L21: {
              if (((ml) this).field_jb == 28) {
                this.a((byte) -49, 200, cd.field_p[param1]);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (((ml) this).field_jb == 29) {
                this.a((byte) -72, 100, cd.field_p[param1]);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (((ml) this).field_jb == 30) {
                this.a((byte) -91, 50, cd.field_p[param1]);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (((ml) this).field_jb != 34) {
                break L24;
              } else {
                this.b(-30225, cf.field_a[param1]);
                break L24;
              }
            }
            L25: {
              if (25 == ((ml) this).field_jb) {
                this.b(-30225, uj.field_c[param1]);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var3_int = -17 / ((param0 - 25) / 36);
              if (((ml) this).field_s != null) {
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (((ml) this).field_jb != 26) {
                break L27;
              } else {
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "ml.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var2 = param1.getCodeBase();
                  if (param0 < -59) {
                    var3 = nm.a(param1, var2, -31843).getFile();
                    Object discarded$6 = ei.a("updatelinks", param1, (byte) 114, new Object[2]);
                    Object discarded$7 = ei.a("updatelinks", param1, (byte) 114, new Object[2]);
                    Object discarded$8 = ei.a("updatelinks", param1, (byte) 114, new Object[2]);
                    Object discarded$9 = ei.a("updatelinks", param1, (byte) 114, new Object[2]);
                    Object discarded$10 = ei.a("updatelinks", param1, (byte) 114, new Object[2]);
                    Object discarded$11 = ei.a("updatelinks", param1, (byte) 114, new Object[2]);
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = decompiledCaughtException;
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("ml.KA(").append(param0).append(',');
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
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
              throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void l(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = ((ml) this).field_L.d(false);
              if (((ml) this).field_q > 0) {
                L2: {
                  ((ml) this).field_q = ((ml) this).field_q - ((ml) this).field_x;
                  if (((ml) this).field_q <= 0) {
                    break L2;
                  } else {
                    if (22 == ((ml) this).field_jb) {
                      break L2;
                    } else {
                      if (23 == ((ml) this).field_jb) {
                        break L2;
                      } else {
                        if (((ml) this).field_jb == 21) {
                          break L2;
                        } else {
                          if (24 == ((ml) this).field_jb) {
                            break L2;
                          } else {
                            if (35 == ((ml) this).field_jb) {
                              break L2;
                            } else {
                              if (((ml) this).field_jb == 38) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L3: {
                  L4: {
                    if (((ml) this).field_q > 0) {
                      break L4;
                    } else {
                      ((ml) this).field_x = -((ml) this).field_q;
                      if (!ArcanistsMulti.field_G) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((ml) this).field_x = 0;
                  break L3;
                }
                ((ml) this).field_db = ((ml) this).field_db - ((ml) this).field_Y / 2;
                ((ml) this).field_Y = 32;
                ((ml) this).field_jb = 0;
                ((ml) this).field_R = ((ml) this).field_db << -2077829116;
                ((ml) this).field_q = 0;
                ((ml) this).field_z = true;
                ((ml) this).field_w = new qb(((ml) this).field_Y, ((ml) this).field_Y);
                ((ml) this).field_w.a();
                de.i(((ml) this).field_Y >> -26143359, ((ml) this).field_Y >> 1318047201, ((ml) this).field_Y >> 718768545, 16777215);
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              if (!((ml) this).t(107)) {
                break L5;
              } else {
                if (-((ml) this).field_x + ((ml) this).field_ib <= 1) {
                  break L5;
                } else {
                  L6: {
                    if (~(256 + ((ml) this).field_L.field_H) < ~((ml) this).field_db) {
                      this.b(-30225, 54);
                      ((ml) this).field_L.field_Eb[((ml) this).field_T] = ((ml) this).field_L.field_Eb[((ml) this).field_T] + 1;
                      if (~((ml) this).field_T == ~var2_int) {
                        ((ml) this).field_L.field_D = false;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  ((ml) this).field_db = 256 + ((ml) this).field_L.field_H;
                  ((ml) this).field_z = false;
                  ((ml) this).field_R = ((ml) this).field_db << 1525138404;
                  if (param0 == 32704) {
                    L7: {
                      ((ml) this).field_q = 0;
                      if (0 >= ((ml) this).field_x) {
                        break L7;
                      } else {
                        L8: {
                          if (((ml) this).field_jb != 19) {
                            break L8;
                          } else {
                            ((ml) this).field_z = true;
                            ((ml) this).field_jb = 0;
                            break L8;
                          }
                        }
                        ((ml) this).a((byte) -76, 2);
                        ((ml) this).field_ib = ((ml) this).field_ib - ((ml) this).field_x;
                        if (((ml) this).field_ib > 0) {
                          break L7;
                        } else {
                          L9: {
                            ((ml) this).d(var2_int, 68);
                            if (!((ml) this).t(77)) {
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          return;
                        }
                      }
                    }
                    L10: {
                      if (0 > ((ml) this).field_x) {
                        ((ml) this).a(-((ml) this).field_x, -28922);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    ((ml) this).field_x = 0;
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            L11: {
              this.b(-30225, 54);
              ((ml) this).d(var2_int, 70);
              if (((ml) this).t(49)) {
                ((ml) this).field_L.field_Eb[((ml) this).field_T] = ((ml) this).field_L.field_Eb[((ml) this).field_T] + 1;
                break L11;
              } else {
                break L11;
              }
            }
            ((ml) this).field_ib = 0;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.HB(" + param0 + ')');
        }
    }

    private final boolean d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ml var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_33_0 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.u(param0 ^ -10366)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                if (param0 == -10265) {
                  break L1;
                } else {
                  boolean discarded$1 = this.u(87);
                  break L1;
                }
              }
              pi.field_b.a((byte) 125, ((ml) this).field_L.field_i);
              var2_int = 0;
              var3 = (ml) (Object) pi.field_b.b(param0 + 10161);
              L2: while (true) {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    L4: {
                      if (this != (Object) (Object) var3.field_s) {
                        break L4;
                      } else {
                        if (!var3.x(32)) {
                          break L4;
                        } else {
                          var4 = var3.field_lb + -((ml) this).field_lb;
                          var5 = var3.field_db + (-((ml) this).field_db - var3.field_Y / 2) + ((ml) this).field_Y / 2;
                          if ((((ml) this).field_Y + var3.field_Y) * (var3.field_Y + ((ml) this).field_Y) >> 1118601698 > var5 * var5 + var4 * var4) {
                            L5: {
                              L6: {
                                if (1 == ((ml) this).field_M) {
                                  break L6;
                                } else {
                                  if (((ml) this).field_M == -1) {
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                ((ml) this).field_E = ((ml) this).field_M;
                                ((ml) this).field_M = 0;
                                ((ml) this).field_R = var3.field_R + -(var3.field_Y << -300368893);
                                ((ml) this).field_X = -((var3.field_Y << 175864961) * var3.field_E) + var3.field_X;
                                if (((ml) this).field_Y <= 32) {
                                  break L7;
                                } else {
                                  ((ml) this).field_X = ((ml) this).field_X + 0 * var3.field_E;
                                  ((ml) this).field_R = ((ml) this).field_R + 192;
                                  break L7;
                                }
                              }
                              L8: {
                                if (32 != var3.field_jb) {
                                  break L8;
                                } else {
                                  ((ml) this).field_X = ((ml) this).field_X + 448 * var3.field_E;
                                  ((ml) this).field_R = ((ml) this).field_R - 480;
                                  break L8;
                                }
                              }
                              ((ml) this).field_lb = ((ml) this).field_X >> -1218935772;
                              ((ml) this).field_db = ((ml) this).field_R >> -950125372;
                              break L5;
                            }
                            var2_int = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var3 = (ml) (Object) pi.field_b.d(-18502);
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_33_0 = var2_int;
                stackIn_34_0 = stackOut_33_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.F(" + param0 + ')');
        }
        return stackIn_34_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ml var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((ml) this).field_jb == 12) {
                break L1;
              } else {
                if (40 != ((ml) this).field_jb) {
                  L2: {
                    if (param0 == 2) {
                      break L2;
                    } else {
                      ((ml) this).field_P = -86;
                      break L2;
                    }
                  }
                  L3: {
                    var4_int = nj.field_n[((ml) this).field_u];
                    var5 = ((ml) this).field_L.a(((ml) this).field_u, true);
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var5.field_jb == 27) {
                        var4_int = 13417437;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var6 = 8421504 ^ (var4_int | 8421504);
                      if (((ml) this).field_q > 0) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var7 = ((ml) this).field_Y;
                            if (7 == ((ml) this).field_jb) {
                              break L7;
                            } else {
                              if (((ml) this).field_jb != 9) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var7 = 48;
                          break L6;
                        }
                        var8 = param2 + ((ml) this).field_lb;
                        var9 = param1 + ((ml) this).field_db + -(var7 >> 1625000353);
                        de.c(var8, var9, var7 >> -120436959, var4_int, 128);
                        gn.a(var7 >> -238727231, (byte) 125, 128, var8, var9);
                        if (!ArcanistsMulti.field_G) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ((ml) this).field_w.a(((ml) this).field_lb + -(((ml) this).field_Y >> 1302399425) - (1 + -param2), -((ml) this).field_Y + ((ml) this).field_db + param1, var6);
                    ((ml) this).field_w.a(param2 + (1 + ((ml) this).field_lb) + -(((ml) this).field_Y >> -1485451775), param1 + ((ml) this).field_db + -((ml) this).field_Y, var6);
                    ((ml) this).field_w.a(param2 + (((ml) this).field_lb - (((ml) this).field_Y >> 961747745)), -1 + -((ml) this).field_Y + ((ml) this).field_db + param1, var6);
                    ((ml) this).field_w.a(param2 + (-(((ml) this).field_Y >> -985162559) + ((ml) this).field_lb), param1 + (1 + -((ml) this).field_Y + ((ml) this).field_db), var6);
                    ((ml) this).field_w.a(param2 + (((ml) this).field_lb - (((ml) this).field_Y >> -1191850175)), param1 + (((ml) this).field_db - ((ml) this).field_Y), var4_int);
                    break L4;
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
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "ml.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0, int param1) {
        try {
            ((ml) this).field_ib = param1;
            if (param0 > -79) {
                int discarded$0 = ((ml) this).y(111);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ml.DB(" + param0 + ',' + param1 + ')');
        }
    }

    private ml(nf param0) {
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
        ((ml) this).field_o = 0;
        ((ml) this).field_N = 0;
        ((ml) this).field_r = -4;
        ((ml) this).field_gb = null;
        ((ml) this).field_O = 0;
        ((ml) this).field_y = 0;
        ((ml) this).field_ab = -1;
        ((ml) this).field_t = 0;
        ((ml) this).field_n = 0;
        ((ml) this).field_J = false;
        ((ml) this).field_Z = 0;
        try {
          L0: {
            ((ml) this).field_L = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ml.<init>(");
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
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static void a(dj param0, int param1, byte param2, dj param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            eb.field_a = param1;
            mg.field_C = param3;
            if (param2 >= 76) {
              ko.field_j = param0;
              td.a(true, de.field_j / 2, de.field_e / 2);
              e.b(1, param3.field_o, param0.field_m + param0.field_o, param0.field_o, param3.field_m + param3.field_o);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ml.I(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((ml) this).field_ib = ((ml) this).field_ib + param0;
              if (250 < ((ml) this).field_ib) {
                ((ml) this).field_ib = 250;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -28922) {
                break L2;
              } else {
                ((ml) this).a((byte) 113, -24);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "ml.FA(" + param0 + ',' + param1 + ')');
        }
    }

    ml(int param0, int param1, int param2, int param3, nf param4, int param5) {
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
        ((ml) this).field_o = 0;
        ((ml) this).field_N = 0;
        ((ml) this).field_r = -4;
        ((ml) this).field_gb = null;
        ((ml) this).field_O = 0;
        ((ml) this).field_y = 0;
        ((ml) this).field_ab = -1;
        ((ml) this).field_t = 0;
        ((ml) this).field_n = 0;
        ((ml) this).field_J = false;
        ((ml) this).field_Z = 0;
        try {
          L0: {
            ((ml) this).field_lb = param1;
            ((ml) this).field_db = param2;
            ((ml) this).field_L = param4;
            ((ml) this).field_T = param3;
            ((ml) this).field_E = 1;
            ((ml) this).field_R = ((ml) this).field_db << -1960783548;
            ((ml) this).field_jb = param0;
            ((ml) this).field_u = param5;
            ((ml) this).field_X = ((ml) this).field_lb << 2083271332;
            ((ml) this).field_s = null;
            ((ml) this).a(12, true);
            this.h(115);
            ((ml) this).field_L.a(-93, (ml) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param5 + ')');
        }
    }

    final int i(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = -107 % ((param0 - 58) / 41);
            stackOut_0_0 = ((ml) this).field_db;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ml.E(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    ml(int param0, int param1, int param2, int param3, nf param4, ml param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((ml) this).field_o = 0;
        ((ml) this).field_N = 0;
        ((ml) this).field_r = -4;
        ((ml) this).field_gb = null;
        ((ml) this).field_O = 0;
        ((ml) this).field_y = 0;
        ((ml) this).field_ab = -1;
        ((ml) this).field_t = 0;
        ((ml) this).field_n = 0;
        ((ml) this).field_J = false;
        ((ml) this).field_Z = 0;
        try {
          L0: {
            ((ml) this).field_db = param2;
            ((ml) this).field_lb = param1;
            ((ml) this).field_X = ((ml) this).field_lb << -139780220;
            ((ml) this).field_s = param5;
            ((ml) this).field_L = param4;
            ((ml) this).field_E = 1;
            ((ml) this).field_T = param3;
            ((ml) this).field_R = ((ml) this).field_db << 2112675428;
            ((ml) this).field_jb = param0;
            ((ml) this).field_z = true;
            ((ml) this).field_u = ((ml) this).field_s.field_u;
            ((ml) this).a(12, true);
            this.h(-80);
            ((ml) this).a(12, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
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
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "You have fallen into the water! Choose a location to teleport to. Since you don't have Arcane Gate available, you will lose a third of your health (<%1>). If you fail to do this within the time limit, you will forfeit the game!";
    }
}

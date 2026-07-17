/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    boolean field_g;
    boolean field_ab;
    private int field_n;
    private int field_c;
    int field_a;
    int field_J;
    private int field_P;
    private boolean field_o;
    int field_D;
    private int field_L;
    private int field_j;
    private int field_S;
    private boolean field_C;
    static String field_db;
    private vn field_cb;
    private int field_Y;
    private int field_e;
    private int field_u;
    private int field_x;
    boolean field_G;
    private int field_p;
    static int[] field_d;
    boolean field_X;
    boolean field_y;
    private int field_K;
    private int field_M;
    private int[] field_v;
    int field_I;
    boolean field_H;
    static kc field_E;
    static int field_q;
    private int[] field_l;
    private boolean field_U;
    ol field_m;
    int field_bb;
    private int field_R;
    private int field_Q;
    static String field_N;
    private ge field_f;
    boolean field_i;
    private boolean field_F;
    private boolean field_k;
    boolean field_O;
    nf field_V;
    int field_b;
    private boolean field_T;
    static String field_A;
    boolean field_t;
    int field_z;
    boolean field_B;
    private int field_W;
    private int field_r;
    private int field_Z;
    nf field_w;
    private int field_h;
    int field_s;

    final static int h(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            boolean discarded$12 = p.field_b.a(mk.field_S, dn.field_Jb, true, (byte) -100);
            p.field_b.i(4);
            L1: while (true) {
              L2: {
                L3: {
                  if (!ib.b(false)) {
                    break L3;
                  } else {
                    boolean discarded$13 = p.field_b.a(ed.field_Bb, (byte) -89, vn.field_d);
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (qg.field_c != -1) {
                  break L2;
                } else {
                  if (param0 == -1993) {
                    if (!u.field_k) {
                      if (hb.field_Gb != sk.field_a) {
                        if (wn.field_z.a((byte) -88)) {
                          if (in.field_Gb == sk.field_a) {
                            stackOut_24_0 = 2;
                            stackIn_25_0 = stackOut_24_0;
                            break L0;
                          } else {
                            return -1;
                          }
                        } else {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      stackOut_14_0 = 3;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  } else {
                    stackOut_11_0 = -98;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              }
              var1_int = qg.field_c;
              ee.a(-1, (byte) 30);
              stackOut_8_0 = var1_int;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "le.KB(" + param0 + 41);
        }
        return stackIn_25_0;
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = ((le) this).field_V.b(param2) >= 0 ? an.field_f / 2 : -an.field_f / 2;
        if (!(~-var4 >= ~vn.field_c)) {
            ((le) this).field_n = 0;
            vn.field_c = -var4;
        }
        if (!(vn.field_c <= ((le) this).field_V.field_y + var4)) {
            vn.field_c = var4 + ((le) this).field_V.field_y;
            ((le) this).field_n = 0;
        }
        if (!(~ol.field_g <= ~param1)) {
            ((le) this).field_S = 0;
            ol.field_g = param1;
        }
        if (!(~param0 <= ~ol.field_g)) {
            ((le) this).field_S = 0;
            ol.field_g = param0;
        }
    }

    private final void a(int param0, int param1, wk param2, boolean param3) {
        hl var5 = new hl();
        var5.field_k = param1;
        byte[] var6 = new byte[param0];
        param2.a((byte) 123, 0, var6, param0);
        var5.field_j = new wk(var6);
        var5.field_g = jb.field_v;
        try {
            ((le) this).field_cb.b((pg) (Object) var5, -1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "le.QB(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    private final void e(int param0) {
        L0: {
          L1: {
            L2: {
              if (null != ((le) this).field_m.field_h) {
                break L2;
              } else {
                if (((le) this).field_m.field_d == null) {
                  break L0;
                } else {
                  L3: {
                    if (((le) this).field_m.field_d.f(true)) {
                      break L3;
                    } else {
                      if (~((le) this).field_m.field_d.y(17571) == ~((le) this).field_bb) {
                        break L3;
                      } else {
                        break L0;
                      }
                    }
                  }
                  vn.field_c = vn.field_c * 7 - -((le) this).field_m.field_d.f(64) >> 3;
                  ol.field_g = 7 * ol.field_g + ((le) this).field_m.field_d.i((byte) -53) >> 3;
                  if (!ArcanistsMulti.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (!((le) this).field_m.field_h.h(-139)) {
              break L1;
            } else {
              vn.field_c = vn.field_c * 7 - -((le) this).field_m.field_h.c(25) >> 3;
              ol.field_g = 7 * ol.field_g + ((le) this).field_m.field_h.e(52) >> 3;
              break L0;
            }
          }
          break L0;
        }
    }

    private final void b(int param0) {
        ml var2 = null;
        L0: {
          L1: {
            ((le) this).field_V.t(8);
            ((le) this).field_C = true;
            ((le) this).field_bb = ((le) this).field_V.d(false);
            var2 = ((le) this).field_V.a(((le) this).field_V.d(false), true);
            if (var2 != null) {
              break L1;
            } else {
              ((le) this).field_m.a(0);
              if (!ArcanistsMulti.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((le) this).field_m.a(-110, var2);
          break L0;
        }
        L2: {
          ((le) this).field_s = -1000;
          ((le) this).field_t = false;
          if (((le) this).field_ab) {
            break L2;
          } else {
            L3: {
              if (mj.field_p != 7) {
                break L3;
              } else {
                if (((le) this).field_V.field_q <= 1) {
                  break L3;
                } else {
                  ((le) this).field_I = ((le) this).field_V.d(false);
                  break L2;
                }
              }
            }
            break L2;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        var5 = n.field_g.field_nb;
        var6 = var5 / 2 + ((le) this).field_V.field_H - param0;
        var7 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (~var7 <= ~an.field_f) {
                break L2;
              } else {
                var8 = (int)Math.abs(18.0 * Math.cos(3.141592653589793 * (double)(param3 + (var7 - -(ge.field_r * 4))) / 64.0));
                stackOut_2_0 = ge.field_r;
                stackOut_2_1 = 64;
                stackIn_11_0 = stackOut_2_0;
                stackIn_11_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var9 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_3_0 < stackIn_3_1) {
                        break L4;
                      } else {
                        var8 = var8 * (96 - ge.field_r) / 32;
                        if (var9 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var8 = var8 * (ge.field_r - 32) / 32;
                    break L3;
                  }
                  L5: {
                    if (var8 > 0) {
                      var8 = -var8;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var8 += 12;
                  var8 = (int)((double)var8 + (32.0 + 8.0 * Math.sin((double)ge.field_r * 3.141592653589793 / 64.0)));
                  de.f(var7, -var8 + var6, var8, (65792 | param1) >> 1, 128);
                  var7++;
                  if (var9 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_10_0 = param2;
            stackOut_10_1 = 12224;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L1;
          }
          if (stackIn_11_0 == stackIn_11_1) {
            var7 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (an.field_f <= var7) {
                    break L8;
                  } else {
                    var8 = (int)Math.abs(20.0 * Math.sin(3.141592653589793 * (double)(param3 + (4 * ge.field_r + var7)) / 64.0));
                    stackOut_15_0 = 64;
                    stackOut_15_1 = ge.field_r;
                    stackIn_23_0 = stackOut_15_0;
                    stackIn_23_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (var9 != 0) {
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (stackIn_16_0 <= stackIn_16_1) {
                            break L10;
                          } else {
                            var8 = (-32 + ge.field_r) * var8 / 32;
                            if (var9 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var8 = var8 * (-ge.field_r + 96) / 32;
                        break L9;
                      }
                      L11: {
                        if (var8 <= 0) {
                          break L11;
                        } else {
                          var8 = -var8;
                          break L11;
                        }
                      }
                      var8 += 8;
                      var8 = (int)((double)var8 + (Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) * 8.0 + 32.0));
                      de.h(0, var6 - var8, an.field_f, an.field_j);
                      de.c(var7, var6 - 64, 1, 128, (123361 | param1) >> 1, 0);
                      var7++;
                      if (var9 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                de.a();
                stackOut_22_0 = an.field_j;
                stackOut_22_1 = var6 + 64;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L7;
              }
              L12: {
                if (stackIn_23_0 > stackIn_23_1) {
                  de.d(0, var6 - -64, an.field_f, -var6 + -64 + an.field_j, 0);
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    private final boolean j(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -27726) {
            break L0;
          } else {
            ((le) this).field_Z = 96;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((le) this).field_o) {
              break L2;
            } else {
              L3: {
                if (this.r(-74)) {
                  break L3;
                } else {
                  if (!((le) this).field_k) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    private final boolean f(int param0) {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var2 = 53 / ((param0 - -81) / 45);
            if (((le) this).field_o) {
              break L1;
            } else {
              L2: {
                if (this.r(-35)) {
                  break L2;
                } else {
                  if (!((le) this).field_k) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private final int b(int param0, int param1, int param2, int param3) {
        ml var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        String var14 = null;
        int var15 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          var5 = ((le) this).field_V.a(param2, true);
          if (var5 == null) {
            break L0;
          } else {
            if (0 == (1 << param2 & (((le) this).field_a | ((le) this).field_J))) {
              if (var5.field_I == null) {
                break L0;
              } else {
                L1: {
                  if (param2 == 0) {
                    break L1;
                  } else {
                    if (!qg.a(param3 + -99)) {
                      break L1;
                    } else {
                      if (mj.field_p != 6) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                L2: {
                  var6 = var5.v(-126);
                  if (0 <= var6) {
                    break L2;
                  } else {
                    var6 = 0;
                    break L2;
                  }
                }
                L3: {
                  var7 = var5.m(-20357) + var6;
                  var8 = nj.field_n[param2];
                  if (var5.o(-22625) != 27) {
                    break L3;
                  } else {
                    var8 = 13413102;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    L6: {
                      de.e(8, 2 + param0, 40 + param1 + -4, -4 + ((le) this).field_l[param2], 0, 192);
                      de.a(6, param0, param1 + 40, ((le) this).field_l[param2], 6, 0);
                      de.a(7, 1 + param0, param1 + 38, -2 + ((le) this).field_l[param2], 6, 16777215);
                      if (var5.o(-22625) == 3) {
                        break L6;
                      } else {
                        if (var5.o(param3 + -22621) != 27) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (((le) this).field_l[param2] != 17) {
                        break L7;
                      } else {
                        var5.field_I.f(8, -4 + param0);
                        if (var15 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var5.field_I.c(8, -24 + (param0 + ((le) this).field_l[param2] / 2), 32, 48, (-4335 + 255 * ((le) this).field_l[param2]) / 17);
                    if (var15 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                  L8: {
                    if (((le) this).field_l[param2] == 17) {
                      break L8;
                    } else {
                      var5.field_I.c(8, -24 + (param0 + ((le) this).field_l[param2] / 2), (-4335 + ((le) this).field_l[param2] * 255) / 17);
                      if (var15 == 0) {
                        break L4;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var5.field_I.b(8, -4 + param0);
                  break L4;
                }
                L9: {
                  var9 = ((le) this).field_V.c((byte) -123, param2);
                  var10 = 4 * ((le) this).field_V.s(0) + (-((le) this).field_V.b(12) - -((le) this).field_V.c((byte) -105, param2));
                  if (var10 > 4) {
                    var10 = 4;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var7 <= 0) {
                    break L10;
                  } else {
                    L11: {
                      var11_int = var7 * 120 / 250;
                      stackOut_28_0 = ~(param1 + (48 + var11_int));
                      stackOut_28_1 = -32;
                      stackOut_28_2 = 272;
                      stackOut_28_3 = mi.field_B.b("350");
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackIn_30_2 = stackOut_28_2;
                      stackIn_30_3 = stackOut_28_3;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      stackIn_29_2 = stackOut_28_2;
                      stackIn_29_3 = stackOut_28_3;
                      if (var9 <= 0) {
                        stackOut_30_0 = stackIn_30_0;
                        stackOut_30_1 = stackIn_30_1;
                        stackOut_30_2 = stackIn_30_2;
                        stackOut_30_3 = stackIn_30_3;
                        stackOut_30_4 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
                        stackIn_31_3 = stackOut_30_3;
                        stackIn_31_4 = stackOut_30_4;
                        break L11;
                      } else {
                        stackOut_29_0 = stackIn_29_0;
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = stackIn_29_2;
                        stackOut_29_3 = stackIn_29_3;
                        stackOut_29_4 = mi.field_B.b("5/5") - -1;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        stackIn_31_3 = stackOut_29_3;
                        stackIn_31_4 = stackOut_29_4;
                        break L11;
                      }
                    }
                    L12: {
                      if (stackIn_31_0 < ~(stackIn_31_1 + (stackIn_31_2 - (stackIn_31_3 + stackIn_31_4)))) {
                        L13: {
                          stackOut_33_0 = -32 + -mi.field_B.b("350");
                          stackOut_33_1 = -param1;
                          stackOut_33_2 = 224;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_35_2 = stackOut_33_2;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          stackIn_34_2 = stackOut_33_2;
                          if (var9 > 0) {
                            stackOut_35_0 = stackIn_35_0;
                            stackOut_35_1 = stackIn_35_1;
                            stackOut_35_2 = stackIn_35_2;
                            stackOut_35_3 = mi.field_B.b("5/5") + 1;
                            stackIn_36_0 = stackOut_35_0;
                            stackIn_36_1 = stackOut_35_1;
                            stackIn_36_2 = stackOut_35_2;
                            stackIn_36_3 = stackOut_35_3;
                            break L13;
                          } else {
                            stackOut_34_0 = stackIn_34_0;
                            stackOut_34_1 = stackIn_34_1;
                            stackOut_34_2 = stackIn_34_2;
                            stackOut_34_3 = 0;
                            stackIn_36_0 = stackOut_34_0;
                            stackIn_36_1 = stackOut_34_1;
                            stackIn_36_2 = stackOut_34_2;
                            stackIn_36_3 = stackOut_34_3;
                            break L13;
                          }
                        }
                        var11_int = stackIn_36_0 + (stackIn_36_1 + (stackIn_36_2 + -stackIn_36_3));
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L14: {
                      if (~var11_int < ~((le) this).field_v[param2]) {
                        ((le) this).field_v[param2] = ((le) this).field_v[param2] + 1;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (((le) this).field_v[param2] <= var11_int) {
                        break L15;
                      } else {
                        ((le) this).field_v[param2] = ((le) this).field_v[param2] - 1;
                        break L15;
                      }
                    }
                    L16: {
                      if (((le) this).field_l[param2] <= 17) {
                        break L16;
                      } else {
                        if (~((le) this).field_V.d(false) != ~param2) {
                          ((le) this).field_l[param2] = ((le) this).field_l[param2] - 1;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    }
                    if (((le) this).field_l[param2] >= 34) {
                      break L10;
                    } else {
                      if (param2 == ((le) this).field_V.d(false)) {
                        ((le) this).field_l[param2] = ((le) this).field_l[param2] + 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                L17: {
                  var11_int = 17 + ((le) this).field_v[param2];
                  stackOut_50_0 = param1 + 48;
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_51_0 = stackOut_50_0;
                  if (var9 <= 0) {
                    stackOut_52_0 = stackIn_52_0;
                    stackOut_52_1 = 0;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    break L17;
                  } else {
                    stackOut_51_0 = stackIn_51_0;
                    stackOut_51_1 = 1 + mi.field_B.b("5/4");
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_53_1 = stackOut_51_1;
                    break L17;
                  }
                }
                var12 = stackIn_53_0 - -stackIn_53_1;
                de.c(3 + var12, -8 + param0 + (((le) this).field_l[param2] / 2 + 3), -6 + var11_int, 11, var8, (var8 | 8421504) ^ 8421504);
                de.h(3 + var12, 3 + (-8 + (((le) this).field_l[param2] / 2 + param0)), -6 + var11_int + (3 + var12), 20 + (-8 + param0) + ((le) this).field_l[param2] / 2 + -6);
                var11_int = var11_int + (((le) this).field_j + param2 * 5) * ((le) this).field_l[param2] / 17 / 2;
                L18: while (true) {
                  L19: {
                    L20: {
                      if (0 >= var11_int) {
                        break L20;
                      } else {
                        var11_int = var11_int - g.field_a.field_n;
                        g.field_a.b(var11_int + 3 + var12, -12 + (param0 + ((le) this).field_l[param2] / 2 + -5), 64);
                        if (var15 != 0) {
                          break L19;
                        } else {
                          if (var15 == 0) {
                            continue L18;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    de.a();
                    var11_int = ((le) this).field_v[param2] - -17;
                    de.a(var12, ((le) this).field_l[param2] / 2 + param0 + -8, var11_int, 17, 6, 0);
                    de.a(2 + var12, -8 + (((le) this).field_l[param2] / 2 + (param0 + 2)), var11_int - 4, 13, 4, 0);
                    de.a(1 + var12, 1 + (param0 - -(((le) this).field_l[param2] / 2) - 8), var11_int + -2, 15, 6, 16777215);
                    de.a(var12 + 2, -8 + ((le) this).field_l[param2] / 2 + param0 + 2, -4 + var11_int, 13, 6, 0);
                    break L19;
                  }
                  L21: {
                    var13_int = var11_int + var12 + 2;
                    var14 = Integer.toString(var7);
                    mi.field_B.a(var14, var13_int, 3 + (-8 + ((le) this).field_l[param2] / 2 + param0 - (-4 - mi.field_B.field_C / 2 - -1)), 8421504 ^ (var8 | 8421504), 0);
                    mi.field_B.a(var14, -1 + var13_int, mi.field_B.field_C / 2 - 4 + (param0 - (-(((le) this).field_l[param2] / 2) + -3)), (var8 | 8421504) ^ 8421504, 0);
                    mi.field_B.a(var14, var13_int, -4 + (((le) this).field_l[param2] / 2 + param0 + (3 + mi.field_B.field_C / 2)), var8, -1);
                    if (0 < var9) {
                      L22: {
                        var12 = var12 - (mi.field_B.b("5/5") + 1);
                        var13 = var9 + "/" + var10;
                        if (var9 <= 4) {
                          break L22;
                        } else {
                          var13 = Integer.toString(var9);
                          break L22;
                        }
                      }
                      L23: {
                        if (((le) this).field_l[param2] < 34) {
                          break L23;
                        } else {
                          if (fb.field_a == null) {
                            break L23;
                          } else {
                            if (null != fb.field_a[2]) {
                              fb.field_a[2].a(1 + var12, param0);
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      mi.field_B.a(var13, var12, -6 + (param0 + ((le) this).field_l[param2] + -8 - (-4 - mi.field_B.field_C / 2)), 0, 0);
                      mi.field_B.a(var13, var12 - 1, mi.field_B.field_C / 2 + 3 + (-8 + param0) + (((le) this).field_l[param2] - 4), 0, 0);
                      mi.field_B.a(var13, var12, mi.field_B.field_C / 2 + 3 + (-8 + (((le) this).field_l[param2] + param0 + -8)) - -4, var8, -1);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L24: {
                    var11 = qo.a((byte) 121, (CharSequence) (Object) ((le) this).field_V.field_k[param2]);
                    mi.field_B.b(var11, 12 + param1 / 2 + 25, mi.field_B.field_C / 2 + (-1 + param0 + ((le) this).field_l[param2] / 2), 8421504 ^ (var8 | 8421504), 0);
                    mi.field_B.b(var11, 12 + param1 / 2 - -26, -1 + (-1 + ((le) this).field_l[param2] / 2 + param0 + mi.field_B.field_C / 2), 8421504 ^ (8421504 | var8), 0);
                    mi.field_B.b(var11, param1 / 2 + 38, -1 + (param0 - -(((le) this).field_l[param2] / 2) - -(mi.field_B.field_C / 2)), var8, -1);
                    if (((le) this).field_V.s(0) > 2) {
                      break L24;
                    } else {
                      L25: {
                        if (param2 != 1) {
                          break L25;
                        } else {
                          var8 = 16777215;
                          param0 -= 20;
                          var11 = sb.field_c;
                          mi.field_B.b(var11, -1 + param1 / 2 - -36, mi.field_B.field_C / 2 + param0 + 8, 8421504 ^ (var8 | 8421504), 0);
                          mi.field_B.b(var11, 12 + param1 / 2 - -24, -1 + param0 - (-8 + -(mi.field_B.field_C / 2)), (var8 | 8421504) ^ 8421504, 0);
                          mi.field_B.b(var11, param1 / 2 + 36, 8 + param0 - -(mi.field_B.field_C / 2), var8, -1);
                          break L25;
                        }
                      }
                      param0 = param0 + (20 + (((le) this).field_l[param2] + 3));
                      if (var15 == 0) {
                        break L0;
                      } else {
                        break L24;
                      }
                    }
                  }
                  param0 = param0 + (3 + ((le) this).field_l[param2]);
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
        }
        L26: {
          if (param3 == -4) {
            break L26;
          } else {
            ((le) this).field_M = -126;
            break L26;
          }
        }
        return param0;
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var8 = 0;
        String var8_ref_String = null;
        int var9_int = 0;
        qa var9 = null;
        vn var10_ref_vn = null;
        int var10 = 0;
        mi var11_ref_mi = null;
        int var11 = 0;
        String var11_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        String var15 = null;
        StringBuilder stackIn_66_0 = null;
        StringBuilder stackIn_67_0 = null;
        StringBuilder stackIn_68_0 = null;
        String stackIn_68_1 = null;
        int stackIn_76_0 = 0;
        int stackIn_103_0 = 0;
        StringBuilder stackOut_65_0 = null;
        StringBuilder stackOut_67_0 = null;
        String stackOut_67_1 = null;
        StringBuilder stackOut_66_0 = null;
        String stackOut_66_1 = null;
        int stackOut_75_0 = 0;
        boolean stackOut_102_0 = false;
        L0: {
          var13 = ArcanistsMulti.field_G ? 1 : 0;
          ce.field_m.a(true);
          de.h(param4, param2, param4 - -param6, param2 - -param1);
          if (!((le) this).field_k) {
            break L0;
          } else {
            if (!((le) this).field_V.n(4)) {
              de.d(param4, param2, param6, param1, 0);
              var8_ref_String = rb.field_l + " - " + ((le) this).field_L + "%";
              int discarded$1 = tj.field_t.a(var8_ref_String, param4, param2, param6, param1, 16777215, -1, 1, 1, 0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var8 = 2158624;
          if (((le) this).field_V.a(param5 ^ -31593) == 2) {
            var8 = 2239508;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (3 != ((le) this).field_V.a(-31497)) {
            break L2;
          } else {
            var8 = 3298412;
            break L2;
          }
        }
        L3: {
          if (((le) this).field_V.a(-31497) == 1) {
            var8 = 4214874;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((le) this).field_V.a(-31497) != 0) {
            break L4;
          } else {
            var8 = 5663344;
            break L4;
          }
        }
        L5: {
          if (4 != ((le) this).field_V.a(-31497)) {
            break L5;
          } else {
            var8 = 2895400;
            break L5;
          }
        }
        L6: {
          if (((le) this).field_V.a(-31497) == 5) {
            var8 = 9054474;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (param5 == 96) {
            break L7;
          } else {
            var14 = null;
            this.a(106, (byte) -85, (ml) null, -35);
            break L7;
          }
        }
        L8: {
          if (((le) this).field_V.a(-31497) == 6) {
            var8 = 15658734;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (((le) this).field_V.a(-31497) != 7) {
            break L9;
          } else {
            var8 = 1213580;
            break L9;
          }
        }
        L10: {
          if (((le) this).field_V.a(param5 ^ -31593) == 8) {
            var8 = 15597806;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (null == ((le) this).field_V.m((byte) 69)) {
            break L11;
          } else {
            L12: {
              L13: {
                this.a(vn.field_c, (byte) -121, var8, ol.field_g);
                this.b(vn.field_c, -98, ol.field_g);
                this.c(ol.field_g, 0, vn.field_c);
                this.a(-8, vn.field_c, ol.field_g);
                var9_int = n.field_g.field_nb;
                var10_ref_vn = ((le) this).field_V.e(param5 + -184);
                if (var10_ref_vn == null) {
                  break L13;
                } else {
                  var11_ref_mi = (mi) (Object) var10_ref_vn.b(12623);
                  L14: while (true) {
                    if (var11_ref_mi == null) {
                      break L13;
                    } else {
                      var11_ref_mi.a(-ol.field_g + (var9_int >> 1), 41, -vn.field_c + (an.field_f >> 1));
                      var11_ref_mi = (mi) (Object) var10_ref_vn.a(0);
                      if (var13 != 0) {
                        break L12;
                      } else {
                        if (var13 == 0) {
                          continue L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                }
              }
              var10_ref_vn = ((le) this).field_V.l((byte) 48);
              break L12;
            }
            L15: {
              L16: {
                if (var10_ref_vn == null) {
                  break L16;
                } else {
                  if (0 != (jb.field_v & 16)) {
                    break L16;
                  } else {
                    var11_ref_mi = (mi) (Object) var10_ref_vn.b(param5 + 12527);
                    L17: while (true) {
                      if (var11_ref_mi == null) {
                        break L16;
                      } else {
                        var11_ref_mi.a((var9_int >> 1) + -ol.field_g, -108, -vn.field_c - -(an.field_f >> 1));
                        var11_ref_mi = (mi) (Object) var10_ref_vn.a(0);
                        if (var13 != 0) {
                          break L15;
                        } else {
                          if (var13 == 0) {
                            continue L17;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                  }
                }
              }
              this.a(ol.field_g, var8, 12224, vn.field_c);
              break L15;
            }
            this.b(-113, param0);
            break L11;
          }
        }
        L18: {
          if (!param3) {
            break L18;
          } else {
            if (!((le) this).field_V.n(param5 ^ 100)) {
              if (((le) this).field_V.d(false) < 0) {
                break L18;
              } else {
                var9_int = nj.field_n[((le) this).field_V.d(false)];
                if (!((le) this).field_y) {
                  break L18;
                } else {
                  if (((le) this).field_V.a(true)) {
                    break L18;
                  } else {
                    if (((le) this).field_z <= 0) {
                      break L18;
                    } else {
                      L19: {
                        if (mj.field_p == -1) {
                          break L19;
                        } else {
                          if (((le) this).field_z < ((le) this).field_V.f(12955)) {
                            break L19;
                          } else {
                            if (mj.field_p != 6) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      if (o.field_s != 0) {
                        break L18;
                      } else {
                        L20: {
                          var10 = (((le) this).field_z + 49) / 50;
                          if (var10 <= ((le) this).field_V.f(12955) / 50) {
                            break L20;
                          } else {
                            L21: {
                              if (((le) this).field_V.field_x[((le) this).field_V.d(false)] != 8) {
                                break L21;
                              } else {
                                if (((le) this).field_V.field_X[((le) this).field_V.d(false)] != 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var10 = ((le) this).field_V.f(param5 ^ 13051) / 50;
                            break L20;
                          }
                        }
                        if (!((le) this).field_X) {
                          break L18;
                        } else {
                          L22: {
                            var11_ref_mi = null;
                            if (var10 < 60) {
                              var11_ref_String = Integer.toString(var10);
                              var15 = var11_ref_String;
                              var11_ref_String = var15;
                              var15 = var11_ref_String;
                              var11_ref_String = var15;
                              var15 = var11_ref_String;
                              break L22;
                            } else {
                              L23: {
                                var12 = var10 % 60;
                                stackOut_65_0 = new StringBuilder().append(var10 / 60);
                                stackIn_67_0 = stackOut_65_0;
                                stackIn_66_0 = stackOut_65_0;
                                if (var12 < 10) {
                                  stackOut_67_0 = (StringBuilder) (Object) stackIn_67_0;
                                  stackOut_67_1 = ":0";
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  break L23;
                                } else {
                                  stackOut_66_0 = (StringBuilder) (Object) stackIn_66_0;
                                  stackOut_66_1 = ":";
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_68_1 = stackOut_66_1;
                                  break L23;
                                }
                              }
                              var11_ref_String = stackIn_68_1 + var12;
                              break L22;
                            }
                          }
                          var12 = an.field_f / 2;
                          mi.field_B.b(co.field_i, var12, 16, var9_int, -1);
                          tj.field_t.b(var11_ref_String, var12, 40, var9_int, -1);
                          de.d(5, 5, var12 - 48, 0, 96, 44);
                          de.a(-48 + var12, 0, 96, 44, 0);
                          de.a(-1 + var12 - 48, 0, 98, 45, 11768360);
                          de.a(-50 + var12, 0, 100, 46, 8547138);
                          de.a(var12 + -51, 0, 102, 47, 0);
                          mi.field_B.b(co.field_i, -1 + var12, 16, 0, 0);
                          mi.field_B.b(co.field_i, var12, 15, 0, 0);
                          mi.field_B.b(co.field_i, var12, 16, var9_int, -1);
                          if (var11_ref_String == null) {
                            break L18;
                          } else {
                            tj.field_t.b(var11_ref_String, -1 + var12, 40, 0, 0);
                            tj.field_t.b(var11_ref_String, var12, 39, 0, 0);
                            tj.field_t.b(var11_ref_String, var12, 40, var9_int, -1);
                            break L18;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              break L18;
            }
          }
        }
        L24: {
          L25: {
            if (((le) this).field_V.n(param5 ^ 100)) {
              break L25;
            } else {
              var9_int = -64 + n.field_g.field_nb + -10;
              var10 = 0;
              L26: while (true) {
                if (((le) this).field_V.s(0) <= var10) {
                  break L25;
                } else {
                  stackOut_75_0 = ~((le) this).field_I;
                  stackIn_103_0 = stackOut_75_0;
                  stackIn_76_0 = stackOut_75_0;
                  if (var13 != 0) {
                    break L24;
                  } else {
                    L27: {
                      L28: {
                        L29: {
                          if (stackIn_76_0 == ~var10) {
                            break L29;
                          } else {
                            L30: {
                              var15 = ((le) this).field_V.field_k[var10];
                              var11_ref_String = var15;
                              var15 = var11_ref_String;
                              var11_ref_String = var15;
                              var11_ref_String = var15;
                              if ((((le) this).field_a & 1 << var10) != 0) {
                                break L30;
                              } else {
                                if ((((le) this).field_b & 1 << var10) != 0) {
                                  L31: {
                                    var15 = var11_ref_String;
                                    if (((le) this).field_i) {
                                      break L31;
                                    } else {
                                      var11_ref_String = tj.a(param5 + -127, new String[1], tj.field_y);
                                      if (var13 == 0) {
                                        break L28;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                  var11_ref_String = tj.a(-69, new String[1], pb.field_i);
                                  if (var13 == 0) {
                                    break L28;
                                  } else {
                                    break L30;
                                  }
                                } else {
                                  L32: {
                                    if ((((le) this).field_J & 1 << var10) != 0) {
                                      break L32;
                                    } else {
                                      if (((le) this).field_V.n(4)) {
                                        break L27;
                                      } else {
                                        if ((((le) this).field_D & 1 << var10) == 0) {
                                          break L27;
                                        } else {
                                          var11_ref_String = tj.a(-19, new String[1], ph.field_d);
                                          if (var13 == 0) {
                                            break L28;
                                          } else {
                                            break L32;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var11_ref_String = null;
                                  break L28;
                                }
                              }
                            }
                            if (0 == (((le) this).field_J & 1 << var10)) {
                              var11_ref_String = null;
                              if (var13 == 0) {
                                break L28;
                              } else {
                                break L29;
                              }
                            } else {
                              var11_ref_String = null;
                              break L28;
                            }
                          }
                        }
                        L33: {
                          if ((1 << var10 & ((le) this).field_b) != 0) {
                            break L33;
                          } else {
                            L34: {
                              if ((1 << var10 & ((le) this).field_J) == 0) {
                                break L34;
                              } else {
                                var11_ref_String = null;
                                if (var13 == 0) {
                                  break L28;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            if (((le) this).field_V.n(param5 + -92)) {
                              break L27;
                            } else {
                              if ((((le) this).field_D & 1 << var10) == 0) {
                                break L27;
                              } else {
                                var11_ref_String = nn.field_t;
                                if (var13 == 0) {
                                  break L28;
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                        }
                        L35: {
                          if (((le) this).field_i) {
                            break L35;
                          } else {
                            var11_ref_String = vi.field_R;
                            if (var13 == 0) {
                              break L28;
                            } else {
                              break L35;
                            }
                          }
                        }
                        var11_ref_String = mk.field_K;
                        break L28;
                      }
                      if (var11_ref_String == null) {
                        break L27;
                      } else {
                        var12 = -8 + an.field_f;
                        mi.field_B.c(var11_ref_String, -1 + var12, var9_int, 0, 0);
                        mi.field_B.c(var11_ref_String, 1 + var12, var9_int, 0, 0);
                        mi.field_B.c(var11_ref_String, var12, var9_int + -1, 0, 0);
                        mi.field_B.c(var11_ref_String, var12, var9_int - -1, 0, 0);
                        mi.field_B.c(var11_ref_String, var12, var9_int, 16777215, 0);
                        var9_int -= 14;
                        break L27;
                      }
                    }
                    var10++;
                    if (var13 == 0) {
                      continue L26;
                    } else {
                      break L25;
                    }
                  }
                }
              }
            }
          }
          stackOut_102_0 = ((le) this).field_V.n(4);
          stackIn_103_0 = stackOut_102_0 ? 1 : 0;
          break L24;
        }
        L36: {
          if (stackIn_103_0 == 0) {
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var9 = (qa) (Object) b.field_a.b(12623);
          if (var9 == null) {
            break L37;
          } else {
            L38: {
              L39: {
                var11 = wi.field_h;
                if (var11 >= 80) {
                  break L39;
                } else {
                  var10 = var11 / 2 - 32;
                  if (var13 == 0) {
                    break L38;
                  } else {
                    break L39;
                  }
                }
              }
              L40: {
                if (var11 < 230) {
                  break L40;
                } else {
                  var10 = -(var11 / 2) + 123;
                  if (var13 == 0) {
                    break L38;
                  } else {
                    break L40;
                  }
                }
              }
              var10 = 8;
              break L38;
            }
            mo.field_a[var9.field_n].c(8, var10, 32, 32);
            tj.field_t.a(rb.field_n[var9.field_n], 48, tj.field_t.field_C + var10, 0, -1);
            break L37;
          }
        }
        L41: {
          if (!jb.field_p) {
            break L41;
          } else {
            L42: {
              if (null != ((le) this).field_V) {
                tj.field_t.a("Visible c-sum" + ((le) this).field_V.o(4), 64, 64, 16776960, 0);
                break L42;
              } else {
                break L42;
              }
            }
            if (null == ((le) this).field_w) {
              break L41;
            } else {
              tj.field_t.a("Backup c-sum" + ((le) this).field_w.o(4), 64, 96, 65535, 0);
              break L41;
            }
          }
        }
        sb.b(param5 ^ 47);
    }

    final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ml var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          if (vn.field_d != 84) {
            break L0;
          } else {
            if (((le) this).field_B) {
              L1: {
                ((le) this).field_B = false;
                if (6 > mj.field_p) {
                  break L1;
                } else {
                  ((le) this).field_O = true;
                  break L1;
                }
              }
              rm.field_k = rm.field_k + 1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (!td.e(true)) {
            break L2;
          } else {
            if (!ri.field_b[82]) {
              break L2;
            } else {
              if (!ri.field_b[86]) {
                break L2;
              } else {
                if (vn.field_d != 12) {
                  break L2;
                } else {
                  he.field_e.b((byte) -59, 67);
                  he.field_e.a(0, (byte) -101);
                  we.a(0, (byte) 113);
                  break L2;
                }
              }
            }
          }
        }
        L3: {
          L4: {
            L5: {
              if (!((le) this).field_V.c((byte) 89)) {
                break L5;
              } else {
                if (!((le) this).field_V.j(39)) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            if (((le) this).field_V.a(true)) {
              break L4;
            } else {
              if (((le) this).field_V.k(-75)) {
                break L4;
              } else {
                if (((le) this).field_V.g(125)) {
                  break L4;
                } else {
                  if (1 >= ((le) this).field_z) {
                    break L4;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L3;
                  }
                }
              }
            }
          }
          stackOut_19_0 = 0;
          stackIn_20_0 = stackOut_19_0;
          break L3;
        }
        L6: {
          var2 = stackIn_20_0;
          if (!((le) this).field_ab) {
            break L6;
          } else {
            L7: {
              L8: {
                stackOut_21_0 = var2;
                stackIn_25_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (ef.field_r) {
                  break L8;
                } else {
                  stackOut_22_0 = stackIn_22_0;
                  stackIn_25_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (pn.a((byte) 119)) {
                    break L8;
                  } else {
                    stackOut_23_0 = stackIn_23_0;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_24_0 = stackOut_23_0;
                    if (((le) this).field_V.d(false) != ((le) this).field_I) {
                      break L8;
                    } else {
                      stackOut_24_0 = stackIn_24_0;
                      stackOut_24_1 = 1;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      break L7;
                    }
                  }
                }
              }
              stackOut_25_0 = stackIn_25_0;
              stackOut_25_1 = 0;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              break L7;
            }
            var2 = stackIn_26_0 & stackIn_26_1;
            break L6;
          }
        }
        L9: {
          if (param0 == 1) {
            break L9;
          } else {
            ((le) this).field_g = true;
            break L9;
          }
        }
        L10: {
          if (var2 == 0) {
            break L10;
          } else {
            L11: {
              var3 = n.field_g.field_nb;
              var4 = ol.field_g + (me.field_I + -(var3 >> 1));
              if (((le) this).field_u > 0) {
                var4 = ((le) this).field_c;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              L13: {
                var5 = ((le) this).field_V.a(((le) this).field_bb, true);
                if (vn.field_d == 84) {
                  break L13;
                } else {
                  if (vn.field_d != 82) {
                    stackOut_37_0 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              stackOut_36_0 = 1;
              stackIn_38_0 = stackOut_36_0;
              break L12;
            }
            L14: {
              L15: {
                var6 = stackIn_38_0;
                if (vn.field_d == 85) {
                  break L15;
                } else {
                  if (vn.field_d != 81) {
                    stackOut_42_0 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              stackOut_41_0 = 1;
              stackIn_43_0 = stackOut_41_0;
              break L14;
            }
            L16: {
              L17: {
                var7 = stackIn_43_0;
                if (var5 == null) {
                  break L17;
                } else {
                  if (((le) this).field_V.j(39)) {
                    break L17;
                  } else {
                    if (!((le) this).field_G) {
                      break L17;
                    } else {
                      if (((le) this).field_Z != 0) {
                        break L17;
                      } else {
                        stackOut_47_0 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        break L16;
                      }
                    }
                  }
                }
              }
              stackOut_48_0 = 0;
              stackIn_49_0 = stackOut_48_0;
              break L16;
            }
            L18: {
              var8 = stackIn_49_0;
              if (var6 == 0) {
                break L18;
              } else {
                if (var8 == 0) {
                  break L18;
                } else {
                  if (((le) this).field_O) {
                    break L18;
                  } else {
                    L19: {
                      ((le) this).field_Z = 25;
                      if (((le) this).field_h > 0) {
                        this.i(param0 + 1999);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (!((le) this).field_ab) {
                        break L20;
                      } else {
                        L21: {
                          stackOut_56_0 = ((le) this).field_V.n((byte) -75);
                          stackIn_58_0 = stackOut_56_0;
                          stackIn_57_0 = stackOut_56_0;
                          if (var5.field_E != -1) {
                            stackOut_58_0 = stackIn_58_0;
                            stackOut_58_1 = 4;
                            stackIn_59_0 = stackOut_58_0;
                            stackIn_59_1 = stackOut_58_1;
                            break L21;
                          } else {
                            stackOut_57_0 = stackIn_57_0;
                            stackOut_57_1 = 2;
                            stackIn_59_0 = stackOut_57_0;
                            stackIn_59_1 = stackOut_57_1;
                            break L21;
                          }
                        }
                        int fieldTemp$2 = ((le) this).field_p + 1;
                        ((le) this).field_p = ((le) this).field_p + 1;
                        p.a(stackIn_59_0, stackIn_59_1, (byte) 11, 158, ((le) this).field_r, 1, ((le) this).field_bb, var4, fieldTemp$2);
                        break L20;
                      }
                    }
                    var5.c(0, 2);
                    ((le) this).field_m.a(-119, var5);
                    ti.field_N = -1;
                    eb.field_b = null;
                    break L18;
                  }
                }
              }
            }
            L22: {
              if (var7 == 0) {
                break L22;
              } else {
                if (var8 != 0) {
                  L23: {
                    ((le) this).field_Z = 25;
                    if (((le) this).field_h <= 0) {
                      break L23;
                    } else {
                      this.i(param0 ^ 2001);
                      break L23;
                    }
                  }
                  L24: {
                    if (!((le) this).field_ab) {
                      break L24;
                    } else {
                      L25: {
                        stackOut_67_0 = ((le) this).field_V.n((byte) -75);
                        stackIn_69_0 = stackOut_67_0;
                        stackIn_68_0 = stackOut_67_0;
                        if (-1 != var5.field_E) {
                          stackOut_69_0 = stackIn_69_0;
                          stackOut_69_1 = 5;
                          stackIn_70_0 = stackOut_69_0;
                          stackIn_70_1 = stackOut_69_1;
                          break L25;
                        } else {
                          stackOut_68_0 = stackIn_68_0;
                          stackOut_68_1 = 3;
                          stackIn_70_0 = stackOut_68_0;
                          stackIn_70_1 = stackOut_68_1;
                          break L25;
                        }
                      }
                      int fieldTemp$3 = ((le) this).field_p + 1;
                      ((le) this).field_p = ((le) this).field_p + 1;
                      p.a(stackIn_70_0, stackIn_70_1, (byte) 11, 158, ((le) this).field_r, 1, ((le) this).field_bb, var4, fieldTemp$3);
                      break L24;
                    }
                  }
                  var5.c(param0 + -1, 3);
                  ((le) this).field_m.a(-90, var5);
                  ti.field_N = -1;
                  eb.field_b = null;
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            if (~vn.field_d != ~bg.field_c) {
              break L10;
            } else {
              if (!((le) this).field_O) {
                L26: {
                  if (((le) this).field_ab) {
                    break L26;
                  } else {
                    this.d(false);
                    if (var9 == 0) {
                      break L10;
                    } else {
                      break L26;
                    }
                  }
                }
                this.a(-113);
                break L10;
              } else {
                break L10;
              }
            }
          }
        }
        L27: {
          ((le) this).field_O = false;
          if (((le) this).field_ab) {
            break L27;
          } else {
            if (!qg.a(-79)) {
              break L27;
            } else {
              vg.a((byte) 86);
              break L27;
            }
          }
        }
        if (13 == vn.field_d) {
          L28: {
            var3 = 1;
            if (((le) this).field_ab) {
              L29: {
                L30: {
                  if (0 > ((le) this).field_I) {
                    break L30;
                  } else {
                    if (null == ((le) this).field_V.a(((le) this).field_I, true)) {
                      break L30;
                    } else {
                      if ((1 << ((le) this).field_I & ((le) this).field_J) == 0) {
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                }
                var3 = 4;
                if (var9 == 0) {
                  break L28;
                } else {
                  break L29;
                }
              }
              var3 = 2;
              break L28;
            } else {
              break L28;
            }
          }
          var4 = var3;
          gj.a(false, true, var4, mn.field_r);
          return;
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        hl var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = (hl) (Object) ((le) this).field_cb.b(12623);
          if (param0 > 26) {
            break L0;
          } else {
            ((le) this).field_v = null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var2 == null) {
              break L2;
            } else {
              var3 = 0;
              var4 = var2.field_k;
              if (var5 != 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                if (var4 == 61) {
                                  boolean dupTemp$7 = this.b((byte) -116);
                                  var3 = dupTemp$7 ? 1 : 0;
                                  if (!dupTemp$7) {
                                    break L3;
                                  } else {
                                    this.a(5158, var2.field_j);
                                    if (var5 == 0) {
                                      break L3;
                                    } else {
                                      break L10;
                                    }
                                  }
                                } else {
                                  L11: {
                                    if (var4 != 65) {
                                      break L11;
                                    } else {
                                      if (var5 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var4 != 66) {
                                      break L12;
                                    } else {
                                      if (var5 == 0) {
                                        break L9;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var4 == 63) {
                                    break L8;
                                  } else {
                                    L13: {
                                      if (var4 != 64) {
                                        break L13;
                                      } else {
                                        if (var5 == 0) {
                                          break L7;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    if (var4 == 62) {
                                      break L6;
                                    } else {
                                      if (var4 == 67) {
                                        break L5;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                }
                              }
                              boolean dupTemp$8 = this.e(true);
                              var3 = dupTemp$8 ? 1 : 0;
                              if (!dupTemp$8) {
                                break L3;
                              } else {
                                this.a(var2.field_j, -114);
                                if (var5 == 0) {
                                  break L3;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            boolean dupTemp$9 = this.f(false);
                            var3 = dupTemp$9 ? 1 : 0;
                            if (!dupTemp$9) {
                              break L3;
                            } else {
                              this.c(var2.field_j, 55);
                              if (var5 == 0) {
                                break L3;
                              } else {
                                break L8;
                              }
                            }
                          }
                          boolean dupTemp$10 = this.l(-8712);
                          var3 = dupTemp$10 ? 1 : 0;
                          if (dupTemp$10) {
                            this.b(50, var2.field_j);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L7;
                            }
                          } else {
                            break L3;
                          }
                        }
                        boolean dupTemp$11 = this.f(-126);
                        var3 = dupTemp$11 ? 1 : 0;
                        if (dupTemp$11) {
                          this.a((byte) 95, var2.field_j);
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        } else {
                          break L3;
                        }
                      }
                      boolean dupTemp$12 = this.j(-27726);
                      var3 = dupTemp$12 ? 1 : 0;
                      if (!dupTemp$12) {
                        break L3;
                      } else {
                        this.a(var2.field_j, jb.field_v - var2.field_g, 8888);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    boolean dupTemp$13 = this.b(false);
                    var3 = dupTemp$13 ? 1 : 0;
                    if (dupTemp$13) {
                      this.b(var2.field_j, -1);
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var6 = null;
                  throw new RuntimeException((String) null);
                }
                if (var3 != 0) {
                  var2.a(true);
                  var2 = (hl) (Object) ((le) this).field_cb.a(0);
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                } else {
                  return;
                }
              }
            }
          }
          return;
        }
    }

    public static void f(byte param0) {
        field_E = null;
        field_db = null;
        field_A = null;
        int var1 = -36 % ((param0 - 27) / 54);
        field_N = null;
        field_d = null;
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        ml var5_ref_ml = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        int stackIn_102_3 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        int stackIn_124_3 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackIn_125_3 = 0;
        int stackIn_125_4 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        int stackIn_126_4 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_127_3 = 0;
        int stackIn_127_4 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_128_2 = 0;
        int stackIn_128_3 = 0;
        int stackIn_128_4 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_129_2 = 0;
        int stackIn_129_3 = 0;
        int stackIn_129_4 = 0;
        int stackIn_129_5 = 0;
        ll[] stackIn_130_0 = null;
        ll[] stackIn_131_0 = null;
        ll[] stackIn_132_0 = null;
        ll[] stackIn_133_0 = null;
        ll[] stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        int stackOut_123_3 = 0;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        int stackOut_124_3 = 0;
        int stackOut_124_4 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        int stackOut_126_3 = 0;
        int stackOut_126_4 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_128_2 = 0;
        int stackOut_128_3 = 0;
        int stackOut_128_4 = 0;
        int stackOut_128_5 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_127_2 = 0;
        int stackOut_127_3 = 0;
        int stackOut_127_4 = 0;
        int stackOut_127_5 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        int stackOut_125_4 = 0;
        int stackOut_125_5 = 0;
        ll[] stackOut_129_0 = null;
        ll[] stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        ll[] stackOut_130_0 = null;
        ll[] stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        ll[] stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          kl.field_A = 320;
          ((le) this).field_H = true;
          ((le) this).field_B = false;
          ((le) this).field_X = true;
          ((le) this).field_g = true;
          mo.field_f = null;
          var3 = n.field_g.field_nb;
          var4 = 0;
          if (~((le) this).field_I == ~((le) this).field_V.d(false)) {
            var5_ref_ml = ((le) this).field_V.a(((le) this).field_bb, true);
            if (var5_ref_ml == null) {
              break L0;
            } else {
              if (null != var5_ref_ml.w(24501)) {
                break L0;
              } else {
                if (var5_ref_ml.i((byte) -60) >= 128 + ((le) this).field_V.field_H) {
                  L1: {
                    var4 = 1;
                    var6 = var5_ref_ml.m(-20357) / 2;
                    if (var6 >= 25) {
                      break L1;
                    } else {
                      var6 = 25;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      var7 = var5_ref_ml.y(17571);
                      if (((le) this).field_V.a(4, var7, -770226943) <= 0) {
                        break L3;
                      } else {
                        L4: {
                          mo.field_f = ck.field_g;
                          if (~var5_ref_ml.m(-20357) >= ~var6) {
                            mo.field_f = bc.field_a;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        mo.field_f = tj.a(-44, new String[1], mo.field_f);
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      var8 = var5_ref_ml.m(-20357) / 3;
                      if (5 > var8) {
                        var8 = 5;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      mo.field_f = in.field_Kb;
                      if (~var6 > ~var5_ref_ml.m(-20357)) {
                        break L6;
                      } else {
                        mo.field_f = ml.field_K;
                        break L6;
                      }
                    }
                    mo.field_f = tj.a(-33, new String[2], mo.field_f);
                    if (~var8 <= ~var5_ref_ml.m(-20357)) {
                      L7: {
                        L8: {
                          if (((le) this).field_ab) {
                            break L8;
                          } else {
                            this.d(false);
                            if (var11 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        this.a(33);
                        break L7;
                      }
                      mo.field_f = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  kl.field_A = 270;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L9: {
          if (qg.a(-114)) {
            jh.a(-3, var4 != 0);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (((le) this).field_H) {
            this.o(8);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          ce.field_m.a(true);
          var5 = 0;
          var5 += 6;
          if (!((le) this).field_g) {
            break L11;
          } else {
            var5 = this.a(var5, 0);
            break L11;
          }
        }
        L12: {
          L13: {
            L14: {
              if (((le) this).field_V.field_d) {
                break L14;
              } else {
                var6 = 0;
                L15: while (true) {
                  L16: {
                    if (~var6 <= ~((le) this).field_V.s(0)) {
                      break L16;
                    } else {
                      var5 = this.a(var5, (byte) -3, var6);
                      var6++;
                      if (var11 != 0) {
                        break L13;
                      } else {
                        if (var11 == 0) {
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  if (var11 == 0) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
            }
            var6 = 0;
            L17: while (true) {
              L18: {
                L19: {
                  if (((le) this).field_V.s(0) <= var6) {
                    break L19;
                  } else {
                    var5 = this.a(var5, (byte) -3, var6);
                    var6 += 2;
                    if (var11 != 0) {
                      break L18;
                    } else {
                      if (var11 == 0) {
                        continue L17;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                var6 = 1;
                break L18;
              }
              L20: while (true) {
                if (((le) this).field_V.s(0) <= var6) {
                  break L13;
                } else {
                  var5 = this.a(var5, (byte) -3, var6);
                  var6 += 2;
                  if (var11 != 0) {
                    break L12;
                  } else {
                    if (var11 == 0) {
                      continue L20;
                    } else {
                      break L13;
                    }
                  }
                }
              }
            }
          }
          if (param0 <= -112) {
            break L12;
          } else {
            this.b(-71, -18, -117);
            break L12;
          }
        }
        L21: {
          if (mf.field_g == -4) {
            mf.field_g = -1;
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          L23: {
            L24: {
              if (((le) this).field_I < 0) {
                break L24;
              } else {
                L25: {
                  if (mj.field_p == -1) {
                    break L25;
                  } else {
                    if (mj.field_p != 7) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                if (10 == ((le) this).field_V.field_x[((le) this).field_I]) {
                  break L24;
                } else {
                  if (((le) this).field_I == ((le) this).field_bb) {
                    L26: {
                      var6 = 30;
                      var7 = -150 + (var3 + ii.a((byte) -117));
                      var8 = 0;
                      if ((-var7 + me.field_I + 24) * (-var7 + (me.field_I + 24)) + (-var6 + an.field_g) * (-var6 + an.field_g) < 1296) {
                        L27: {
                          mf.field_g = -4;
                          var8 = 1;
                          var9 = 100;
                          if (4 != ((le) this).field_V.field_x[((le) this).field_I]) {
                            break L27;
                          } else {
                            var9 = ((le) this).field_V.field_X[((le) this).field_I] / 5 * 5 + 5;
                            if (((le) this).field_V.field_X[((le) this).field_I] <= 0) {
                              break L27;
                            } else {
                              if (((le) this).field_V.field_X[((le) this).field_I] - -5 == var9) {
                                var9 = ((le) this).field_V.field_X[((le) this).field_I];
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        L28: {
                          if (~((le) this).field_V.field_X[((le) this).field_I] > ~var9) {
                            break L28;
                          } else {
                            var8 = 0;
                            if (hc.field_f) {
                              L29: {
                                mo.field_f = vm.field_d[128 + (((le) this).field_V.field_x[((le) this).field_I] + 12)] + rc.field_i;
                                if (8 == ((le) this).field_V.field_x[((le) this).field_I]) {
                                  mo.field_f = vm.field_d[156] + rc.field_i;
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              if (((le) this).field_V.field_x[((le) this).field_I] != 9) {
                                break L26;
                              } else {
                                mo.field_f = vm.field_d[157] + rc.field_i;
                                if (var11 == 0) {
                                  break L26;
                                } else {
                                  break L28;
                                }
                              }
                            } else {
                              break L26;
                            }
                          }
                        }
                        L30: {
                          if (hc.field_f) {
                            L31: {
                              mo.field_f = vm.field_d[((le) this).field_V.field_x[((le) this).field_I] + 140];
                              if (((le) this).field_V.field_x[((le) this).field_I] == 8) {
                                mo.field_f = vm.field_d[156];
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            if (9 == ((le) this).field_V.field_x[((le) this).field_I]) {
                              mo.field_f = vm.field_d[157];
                              break L30;
                            } else {
                              break L30;
                            }
                          } else {
                            break L30;
                          }
                        }
                        if (((le) this).field_V.a(((le) this).field_V.d(false), true).m(-20357) > 20) {
                          break L26;
                        } else {
                          var8 = 0;
                          if (hc.field_f) {
                            mo.field_f = mo.field_f + hm.field_b;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                      } else {
                        break L26;
                      }
                    }
                    var9 = -20;
                    L32: while (true) {
                      L33: {
                        if (var9 >= 20) {
                          break L33;
                        } else {
                          de.h(0, 2 + (var7 + var9), an.field_f, 2 + (1 + var7 + var9));
                          de.i(var6, 2 + (-(var9 / 2) + var7), 20, 0);
                          de.h(0, -1 + (var9 + (var7 + 2)), an.field_f, var9 + (var7 + 2));
                          stackOut_94_0 = var6;
                          stackOut_94_1 = 2 + -(var9 / 2) + var7 - 1;
                          stackOut_94_2 = 20;
                          stackOut_94_3 = var8;
                          stackIn_124_0 = stackOut_94_0;
                          stackIn_124_1 = stackOut_94_1;
                          stackIn_124_2 = stackOut_94_2;
                          stackIn_124_3 = stackOut_94_3;
                          stackIn_95_0 = stackOut_94_0;
                          stackIn_95_1 = stackOut_94_1;
                          stackIn_95_2 = stackOut_94_2;
                          stackIn_95_3 = stackOut_94_3;
                          if (var11 != 0) {
                            break L23;
                          } else {
                            L34: {
                              stackOut_95_0 = stackIn_95_0;
                              stackOut_95_1 = stackIn_95_1;
                              stackOut_95_2 = stackIn_95_2;
                              stackIn_97_0 = stackOut_95_0;
                              stackIn_97_1 = stackOut_95_1;
                              stackIn_97_2 = stackOut_95_2;
                              stackIn_96_0 = stackOut_95_0;
                              stackIn_96_1 = stackOut_95_1;
                              stackIn_96_2 = stackOut_95_2;
                              if (stackIn_95_3 == 0) {
                                stackOut_97_0 = stackIn_97_0;
                                stackOut_97_1 = stackIn_97_1;
                                stackOut_97_2 = stackIn_97_2;
                                stackOut_97_3 = 7433831;
                                stackIn_98_0 = stackOut_97_0;
                                stackIn_98_1 = stackOut_97_1;
                                stackIn_98_2 = stackOut_97_2;
                                stackIn_98_3 = stackOut_97_3;
                                break L34;
                              } else {
                                stackOut_96_0 = stackIn_96_0;
                                stackOut_96_1 = stackIn_96_1;
                                stackOut_96_2 = stackIn_96_2;
                                stackOut_96_3 = 13093320;
                                stackIn_98_0 = stackOut_96_0;
                                stackIn_98_1 = stackOut_96_1;
                                stackIn_98_2 = stackOut_96_2;
                                stackIn_98_3 = stackOut_96_3;
                                break L34;
                              }
                            }
                            de.i(stackIn_98_0, stackIn_98_1, stackIn_98_2, stackIn_98_3);
                            var9++;
                            if (var11 == 0) {
                              continue L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      var9 = -16;
                      L35: while (true) {
                        L36: {
                          if (16 <= var9) {
                            break L36;
                          } else {
                            de.h(0, var9 + var7, an.field_f, var7 + (var9 - -1));
                            de.i(var6, var7 + -(var9 / 2), 16, 0);
                            de.h(0, -1 + var9 + var7, an.field_f, var9 + var7);
                            stackOut_101_0 = var6;
                            stackOut_101_1 = -1 + (-(var9 / 2) + var7);
                            stackOut_101_2 = 16;
                            stackOut_101_3 = var8;
                            stackIn_124_0 = stackOut_101_0;
                            stackIn_124_1 = stackOut_101_1;
                            stackIn_124_2 = stackOut_101_2;
                            stackIn_124_3 = stackOut_101_3;
                            stackIn_102_0 = stackOut_101_0;
                            stackIn_102_1 = stackOut_101_1;
                            stackIn_102_2 = stackOut_101_2;
                            stackIn_102_3 = stackOut_101_3;
                            if (var11 != 0) {
                              break L23;
                            } else {
                              L37: {
                                stackOut_102_0 = stackIn_102_0;
                                stackOut_102_1 = stackIn_102_1;
                                stackOut_102_2 = stackIn_102_2;
                                stackIn_104_0 = stackOut_102_0;
                                stackIn_104_1 = stackOut_102_1;
                                stackIn_104_2 = stackOut_102_2;
                                stackIn_103_0 = stackOut_102_0;
                                stackIn_103_1 = stackOut_102_1;
                                stackIn_103_2 = stackOut_102_2;
                                if (stackIn_102_3 == 0) {
                                  stackOut_104_0 = stackIn_104_0;
                                  stackOut_104_1 = stackIn_104_1;
                                  stackOut_104_2 = stackIn_104_2;
                                  stackOut_104_3 = 13093320;
                                  stackIn_105_0 = stackOut_104_0;
                                  stackIn_105_1 = stackOut_104_1;
                                  stackIn_105_2 = stackOut_104_2;
                                  stackIn_105_3 = stackOut_104_3;
                                  break L37;
                                } else {
                                  stackOut_103_0 = stackIn_103_0;
                                  stackOut_103_1 = stackIn_103_1;
                                  stackOut_103_2 = stackIn_103_2;
                                  stackOut_103_3 = 16777215;
                                  stackIn_105_0 = stackOut_103_0;
                                  stackIn_105_1 = stackOut_103_1;
                                  stackIn_105_2 = stackOut_103_2;
                                  stackIn_105_3 = stackOut_103_3;
                                  break L37;
                                }
                              }
                              de.i(stackIn_105_0, stackIn_105_1, stackIn_105_2, stackIn_105_3);
                              var9++;
                              if (var11 == 0) {
                                continue L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                        L38: {
                          L39: {
                            de.a();
                            if (var8 == 0) {
                              break L39;
                            } else {
                              rm.field_o[((le) this).field_V.field_x[((le) this).field_I] - -1].b(-32 + var6, -48 + (var7 - (int)(4.0 * Math.sin((double)jb.field_v * 0.5) + 4.0)));
                              if (var11 == 0) {
                                break L38;
                              } else {
                                break L39;
                              }
                            }
                          }
                          rm.field_o[((le) this).field_V.field_x[((le) this).field_I] - -1].b(var6 + -32, var7 - 48);
                          break L38;
                        }
                        if (((le) this).field_V.field_X[((le) this).field_I] > 0) {
                          L40: {
                            var9 = ((le) this).field_V.field_X[((le) this).field_I] / 20;
                            if (((le) this).field_V.field_x[((le) this).field_I] == 4) {
                              var9 = ((le) this).field_V.field_X[((le) this).field_I] % 5;
                              if (0 != var9) {
                                break L40;
                              } else {
                                if (0 < ((le) this).field_V.field_X[((le) this).field_I]) {
                                  var9 = 5;
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                            } else {
                              break L40;
                            }
                          }
                          var10 = tj.a(120, new String[1], bk.field_H);
                          var7 += 16;
                          mi.field_B.b(var10, var6 + -1, var7, 0, 0);
                          mi.field_B.b(var10, var6, -1 + var7, 0, 0);
                          mi.field_B.b(var10, var6, var7, 16777215, -1);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    }
                  } else {
                    break L24;
                  }
                }
              }
            }
            L41: {
              sb.a(param1, -58);
              if (null != mo.field_f) {
                break L41;
              } else {
                this.d(-25343);
                break L41;
              }
            }
            if (((le) this).field_ab) {
              var6 = 22;
              var7 = -16 + (var3 - 6);
              stackOut_123_0 = -16 + var6;
              stackOut_123_1 = var7 - 16;
              stackOut_123_2 = 32;
              stackOut_123_3 = 32;
              stackIn_124_0 = stackOut_123_0;
              stackIn_124_1 = stackOut_123_1;
              stackIn_124_2 = stackOut_123_2;
              stackIn_124_3 = stackOut_123_3;
              break L23;
            } else {
              break L22;
            }
          }
          L42: {
            stackOut_124_0 = stackIn_124_0;
            stackOut_124_1 = stackIn_124_1;
            stackOut_124_2 = stackIn_124_2;
            stackOut_124_3 = stackIn_124_3;
            stackOut_124_4 = 15;
            stackIn_126_0 = stackOut_124_0;
            stackIn_126_1 = stackOut_124_1;
            stackIn_126_2 = stackOut_124_2;
            stackIn_126_3 = stackOut_124_3;
            stackIn_126_4 = stackOut_124_4;
            stackIn_125_0 = stackOut_124_0;
            stackIn_125_1 = stackOut_124_1;
            stackIn_125_2 = stackOut_124_2;
            stackIn_125_3 = stackOut_124_3;
            stackIn_125_4 = stackOut_124_4;
            if (vh.field_t > 0) {
              stackOut_126_0 = stackIn_126_0;
              stackOut_126_1 = stackIn_126_1;
              stackOut_126_2 = stackIn_126_2;
              stackOut_126_3 = stackIn_126_3;
              stackOut_126_4 = stackIn_126_4;
              stackIn_128_0 = stackOut_126_0;
              stackIn_128_1 = stackOut_126_1;
              stackIn_128_2 = stackOut_126_2;
              stackIn_128_3 = stackOut_126_3;
              stackIn_128_4 = stackOut_126_4;
              stackIn_127_0 = stackOut_126_0;
              stackIn_127_1 = stackOut_126_1;
              stackIn_127_2 = stackOut_126_2;
              stackIn_127_3 = stackOut_126_3;
              stackIn_127_4 = stackOut_126_4;
              if ((8 & jb.field_v) == 0) {
                stackOut_128_0 = stackIn_128_0;
                stackOut_128_1 = stackIn_128_1;
                stackOut_128_2 = stackIn_128_2;
                stackOut_128_3 = stackIn_128_3;
                stackOut_128_4 = stackIn_128_4;
                stackOut_128_5 = 16711935;
                stackIn_129_0 = stackOut_128_0;
                stackIn_129_1 = stackOut_128_1;
                stackIn_129_2 = stackOut_128_2;
                stackIn_129_3 = stackOut_128_3;
                stackIn_129_4 = stackOut_128_4;
                stackIn_129_5 = stackOut_128_5;
                break L42;
              } else {
                stackOut_127_0 = stackIn_127_0;
                stackOut_127_1 = stackIn_127_1;
                stackOut_127_2 = stackIn_127_2;
                stackOut_127_3 = stackIn_127_3;
                stackOut_127_4 = stackIn_127_4;
                stackOut_127_5 = 16744703;
                stackIn_129_0 = stackOut_127_0;
                stackIn_129_1 = stackOut_127_1;
                stackIn_129_2 = stackOut_127_2;
                stackIn_129_3 = stackOut_127_3;
                stackIn_129_4 = stackOut_127_4;
                stackIn_129_5 = stackOut_127_5;
                break L42;
              }
            } else {
              stackOut_125_0 = stackIn_125_0;
              stackOut_125_1 = stackIn_125_1;
              stackOut_125_2 = stackIn_125_2;
              stackOut_125_3 = stackIn_125_3;
              stackOut_125_4 = stackIn_125_4;
              stackOut_125_5 = 16777215;
              stackIn_129_0 = stackOut_125_0;
              stackIn_129_1 = stackOut_125_1;
              stackIn_129_2 = stackOut_125_2;
              stackIn_129_3 = stackOut_125_3;
              stackIn_129_4 = stackOut_125_4;
              stackIn_129_5 = stackOut_125_5;
              break L42;
            }
          }
          L43: {
            de.g(stackIn_129_0, stackIn_129_1, stackIn_129_2, stackIn_129_3, stackIn_129_4, stackIn_129_5);
            de.a(var6 + -16, -16 + var7, 32, 32, 15, 0);
            stackOut_129_0 = tg.field_b;
            stackIn_133_0 = stackOut_129_0;
            stackIn_130_0 = stackOut_129_0;
            if (0 >= vh.field_t) {
              stackOut_133_0 = (ll[]) (Object) stackIn_133_0;
              stackOut_133_1 = 9;
              stackIn_134_0 = stackOut_133_0;
              stackIn_134_1 = stackOut_133_1;
              break L43;
            } else {
              stackOut_130_0 = (ll[]) (Object) stackIn_130_0;
              stackIn_132_0 = stackOut_130_0;
              stackIn_131_0 = stackOut_130_0;
              if ((jb.field_v & 8) != 0) {
                stackOut_132_0 = (ll[]) (Object) stackIn_132_0;
                stackOut_132_1 = 11;
                stackIn_134_0 = stackOut_132_0;
                stackIn_134_1 = stackOut_132_1;
                break L43;
              } else {
                stackOut_131_0 = (ll[]) (Object) stackIn_131_0;
                stackOut_131_1 = 10;
                stackIn_134_0 = stackOut_131_0;
                stackIn_134_1 = stackOut_131_1;
                break L43;
              }
            }
          }
          ((ll) (Object) stackIn_134_0[stackIn_134_1]).a(var6 - 16, var7 + -16);
          var8 = var6 - an.field_g;
          var9 = -me.field_I + var7;
          if (var8 * var8 - -(var9 * var9) >= 256) {
            break L22;
          } else {
            if (param1) {
              L44: {
                de.c(var6, var7, 16, 16777215, 128);
                mf.field_g = -3;
                var10 = rm.field_a;
                if (ao.field_d) {
                  break L44;
                } else {
                  L45: {
                    if (1 >= vh.field_t) {
                      break L45;
                    } else {
                      var10 = tj.a(120, new String[1], ig.field_d);
                      if (var11 == 0) {
                        break L44;
                      } else {
                        break L45;
                      }
                    }
                  }
                  L46: {
                    if (vh.field_t != 1) {
                      break L46;
                    } else {
                      var10 = am.field_a;
                      if (var11 == 0) {
                        break L44;
                      } else {
                        break L46;
                      }
                    }
                  }
                  var10 = bm.field_b;
                  break L44;
                }
              }
              mi.field_B.a(var10, 5 + var6, var7 - 1, 0, 0);
              mi.field_B.a(var10, 4 + var6, var7, 0, 0);
              mi.field_B.a(var10, 5 + (var6 - -1), var7, 0, 0);
              mi.field_B.a(var10, var6 - -5, var7 - -1, 0, 0);
              mi.field_B.a(var10, var6 + 5, var7, 16777215, 0);
              break L22;
            } else {
              break L22;
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        ml var6_ref_ml = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_24_0 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = 50;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                if (~((le) this).field_V.s(0) >= ~var5) {
                  break L3;
                } else {
                  var6_ref_ml = ((le) this).field_V.a(var5, true);
                  if (var7 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (var6_ref_ml != null) {
                        L5: {
                          if (~var6_ref_ml.m(-20357) >= ~var3) {
                            break L5;
                          } else {
                            var3 = var6_ref_ml.m(-20357);
                            break L5;
                          }
                        }
                        if (~var4 <= ~mi.field_B.b(((le) this).field_V.field_k[var5])) {
                          break L4;
                        } else {
                          var4 = mi.field_B.b(((le) this).field_V.field_k[var5]);
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var5++;
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (((le) this).field_V.field_d) {
                break L2;
              } else {
                var5 = 0;
                L6: while (true) {
                  L7: {
                    if (~var5 <= ~((le) this).field_V.s(0)) {
                      break L7;
                    } else {
                      param0 = this.b(param0, var4, var5, -4);
                      var5++;
                      if (var7 != 0) {
                        break L1;
                      } else {
                        if (var7 == 0) {
                          continue L6;
                        } else {
                          break L7;
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
            var5 = 0;
            L8: while (true) {
              L9: {
                if (((le) this).field_V.s(0) <= var5) {
                  break L9;
                } else {
                  param0 = this.b(param0, var4, var5, -4);
                  var5 += 2;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    if (var7 == 0) {
                      continue L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              var5_ref_String = sb.field_c;
              var6 = 16777215;
              mi.field_B.b(var5_ref_String, 23 + (12 + var4 / 2), mi.field_B.field_C / 2 + (8 + param0), 8421504 ^ (8421504 | var6), 0);
              mi.field_B.b(var5_ref_String, 12 + (var4 / 2 - -24), -1 + (mi.field_B.field_C / 2 + param0 + 8), 8421504 ^ (var6 | 8421504), 0);
              mi.field_B.b(var5_ref_String, 36 + var4 / 2, mi.field_B.field_C / 2 + (param0 + 8), var6, -1);
              param0 += 20;
              var5 = 1;
              L10: while (true) {
                if (~((le) this).field_V.s(0) >= ~var5) {
                  break L1;
                } else {
                  stackOut_24_0 = this.b(param0, var4, var5, -4);
                  stackIn_27_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (var7 != 0) {
                    return stackIn_27_0;
                  } else {
                    param0 = stackIn_25_0;
                    var5 += 2;
                    if (var7 == 0) {
                      continue L10;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          return param0;
        }
    }

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        vn var8 = null;
        ml var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int var11_int = 0;
        int[] var12 = null;
        int var12_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        int[] stackIn_3_0 = null;
        int[] stackIn_4_0 = null;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int[] stackOut_2_0 = null;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        L0: {
          L1: {
            var17 = ArcanistsMulti.field_G ? 1 : 0;
            if (null != ((le) this).field_V.m((byte) 69)) {
              L2: {
                stackOut_2_0 = nj.field_n;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (0 > ((le) this).field_I) {
                  stackOut_4_0 = (int[]) (Object) stackIn_4_0;
                  stackOut_4_1 = 6;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L2;
                } else {
                  stackOut_3_0 = (int[]) (Object) stackIn_3_0;
                  stackOut_3_1 = ((le) this).field_I;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = stackIn_5_0[stackIn_5_1];
                  ((le) this).field_K = 4;
                  var3 = ((le) this).field_V.field_y >> ((le) this).field_K;
                  var4 = ((le) this).field_V.field_H >> ((le) this).field_K;
                  var5 = an.field_j;
                  if (an.field_f > 8 + (var3 + 640)) {
                    break L4;
                  } else {
                    var5 = n.field_g.field_nb;
                    if (var17 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (640 + 2 * var3 - -8 <= an.field_f) {
                  ((le) this).field_K = 3;
                  var3 = ((le) this).field_V.field_y >> ((le) this).field_K;
                  var4 = ((le) this).field_V.field_H >> ((le) this).field_K;
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                var6 = 5;
                var7 = 1;
                de.a(-var7 + -var6 + -var3 + an.field_f, -var7 + (-var6 + -var4 + var5), var3 - -(2 * var7), var7 * 2 + var4, 4799269);
                var7++;
                de.a(-var7 + -var6 + (-var3 + an.field_f), -var4 + (var5 + (-var6 + -var7)), var3 - -(var7 * 2), 2 * var7 + var4, 8547138);
                var7++;
                de.a(-var7 + -var6 + (-var3 + an.field_f), var5 - (var4 - (-var6 + -var7)), var3 + 2 * var7, var4 - -(var7 * 2), 11768360);
                var7++;
                de.a(-var7 + (-var3 + an.field_f + -var6), -var7 + -var6 + (var5 + -var4), var3 + var7 * 2, var4 - -(var7 * 2), 0);
                var7++;
                de.h(an.field_f - (var3 + var6), -var4 + (var5 + -var6), -var6 + an.field_f, -var6 + var5);
                de.c(-var6 + -var3 + an.field_f, var5 - (var4 - -var6), var3, var4, nb.field_a, cg.field_Lb);
                ((le) this).field_V.m((byte) 69).b(-var6 + (-var3 + an.field_f), -var4 + var5 + -var6, var3, var4);
                de.f(an.field_f + -var3 - (var6 + -(-(an.field_f >> 1) + vn.field_c >> ((le) this).field_K)), (ol.field_g + -(var5 >> 1) >> ((le) this).field_K) + var5 + (-var4 + -var6), an.field_f >> ((le) this).field_K, var5 >> ((le) this).field_K, 16777215, 128);
                var8 = ((le) this).field_V.g((byte) 61);
                if (var8 == null) {
                  break L5;
                } else {
                  if (!var8.b(true)) {
                    var9 = (ml) (Object) var8.a(true);
                    L6: while (true) {
                      L7: {
                        L8: {
                          if (var9 == null) {
                            break L8;
                          } else {
                            stackOut_15_0 = null;
                            stackIn_29_0 = stackOut_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            if (var17 != 0) {
                              break L7;
                            } else {
                              L9: {
                                if (stackIn_16_0 == (Object) (Object) var9) {
                                  break L9;
                                } else {
                                  if (var9.o(-22625) == 12) {
                                    break L9;
                                  } else {
                                    var2 = 0;
                                    var10 = var9.g(false);
                                    var2 = nj.field_n[var10];
                                    var11_int = an.field_f + (-var3 - var6) - -(var9.f(-99) >> ((le) this).field_K);
                                    var12_int = var5 - (var4 + var6 + -(var9.i((byte) 110) - (var9.p(-8323) >> 1) >> ((le) this).field_K));
                                    de.i(var11_int, var12_int, 14 + (var9.p(-8323) >> 1) >> ((le) this).field_K, (var2 | 8421504) ^ 8421504);
                                    de.i(var11_int, var12_int, var9.p(-8323) >> 1 >> ((le) this).field_K, var2);
                                    de.c(var11_int, var12_int, 14 + (var9.p(-8323) >> 1) >> ((le) this).field_K, 8421504 ^ (var2 | 8421504));
                                    gn.a(14 + (var9.p(-8323) >> 1) >> ((le) this).field_K, (byte) 72, 255, var11_int, var12_int);
                                    if (var9.y(17571) != ((le) this).field_V.d(false)) {
                                      break L9;
                                    } else {
                                      L10: {
                                        if (((le) this).field_K == 4) {
                                          tg.field_b[3].b(-3 + var11_int, var12_int - (var9.p(-8323) >> ((le) this).field_K + 1) - 8);
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      if (((le) this).field_K != 2) {
                                        break L9;
                                      } else {
                                        tg.field_b[6].a(var11_int + -16, 8 + var12_int);
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                              var9 = (ml) (Object) var8.b((byte) 53);
                              if (var17 == 0) {
                                continue L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        L11: {
                          if (((le) this).field_K == 2) {
                            break L11;
                          } else {
                            de.a();
                            if (var17 == 0) {
                              break L5;
                            } else {
                              break L11;
                            }
                          }
                        }
                        i.b(90);
                        ti.field_N = -1;
                        stackOut_28_0 = null;
                        stackIn_29_0 = stackOut_28_0;
                        break L7;
                      }
                      eb.field_b = (mc[]) (Object) stackIn_29_0;
                      var10 = ((le) this).field_V.s(0);
                      var11 = new int[var10];
                      var12 = new int[var10];
                      var13 = new int[var10];
                      var9 = (ml) (Object) var8.b(12623);
                      L12: while (true) {
                        L13: {
                          L14: {
                            if (var9 == null) {
                              break L14;
                            } else {
                              stackOut_31_0 = ~var9.o(-22625);
                              stackOut_31_1 = -13;
                              stackIn_45_0 = stackOut_31_0;
                              stackIn_45_1 = stackOut_31_1;
                              stackIn_32_0 = stackOut_31_0;
                              stackIn_32_1 = stackOut_31_1;
                              if (var17 != 0) {
                                break L13;
                              } else {
                                L15: {
                                  if (stackIn_32_0 == stackIn_32_1) {
                                    break L15;
                                  } else {
                                    if (null != var9.w(24501)) {
                                      break L15;
                                    } else {
                                      var14 = var9.y(17571);
                                      var11[var14] = -var6 + an.field_f + -var3 + (var9.f(-85) >> ((le) this).field_K);
                                      var12[var14] = -var6 + -var4 + (var5 + -8);
                                      var13[var14] = mi.field_B.b(((le) this).field_V.field_k[var14]);
                                      var15_int = 0;
                                      L16: while (true) {
                                        if (var15_int >= var14) {
                                          break L15;
                                        } else {
                                          stackOut_36_0 = -1;
                                          stackOut_36_1 = ~var12[var15_int];
                                          stackIn_45_0 = stackOut_36_0;
                                          stackIn_45_1 = stackOut_36_1;
                                          stackIn_37_0 = stackOut_36_0;
                                          stackIn_37_1 = stackOut_36_1;
                                          if (var17 != 0) {
                                            break L13;
                                          } else {
                                            L17: {
                                              if (stackIn_37_0 == stackIn_37_1) {
                                                break L17;
                                              } else {
                                                if (Math.abs(var11[var15_int] - var11[var14]) < 4 + (var13[var14] + var13[var15_int]) / 2) {
                                                  if (~var12[var14] > ~var12[var15_int]) {
                                                    break L17;
                                                  } else {
                                                    var12[var14] = var12[var15_int] + -mi.field_B.field_C;
                                                    break L17;
                                                  }
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            var15_int++;
                                            if (var17 == 0) {
                                              continue L16;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var9 = (ml) (Object) var8.a(0);
                                if (var17 == 0) {
                                  continue L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          stackOut_44_0 = -var6 + (-var3 + an.field_f);
                          stackOut_44_1 = 0;
                          stackIn_45_0 = stackOut_44_0;
                          stackIn_45_1 = stackOut_44_1;
                          break L13;
                        }
                        de.h(stackIn_45_0, stackIn_45_1, -var6 + an.field_f, -var6 + var5);
                        var9 = (ml) (Object) var8.b(12623);
                        L18: while (true) {
                          L19: {
                            if (var9 == null) {
                              break L19;
                            } else {
                              stackOut_47_0 = ~var9.o(-22625);
                              stackOut_47_1 = -13;
                              stackIn_62_0 = stackOut_47_0;
                              stackIn_62_1 = stackOut_47_1;
                              stackIn_48_0 = stackOut_47_0;
                              stackIn_48_1 = stackOut_47_1;
                              if (var17 != 0) {
                                break L0;
                              } else {
                                L20: {
                                  if (stackIn_48_0 == stackIn_48_1) {
                                    break L20;
                                  } else {
                                    if (null == var9.w(24501)) {
                                      var2 = 0;
                                      var14 = var9.y(17571);
                                      var2 = nj.field_n[var14];
                                      var15_int = var9.i((byte) -39);
                                      var16 = var9.p(-8323);
                                      de.d(var11[var14], var12[var14] - 1, -var6 + (var5 + -var4) + ((var15_int + -var16 >> ((le) this).field_K) - var12[var14]), var2);
                                      de.d(var11[var14] - 1, var12[var14] - 2, (var15_int - var16 >> ((le) this).field_K) + var5 + (-var4 + (-var6 + -var12[var14])), 8421504 ^ (8421504 | var2));
                                      de.d(1 + var11[var14], -2 + var12[var14], -var6 + -var4 + var5 - -(-var16 + var15_int >> ((le) this).field_K) - var12[var14], (var2 | 8421504) ^ 8421504);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                var9 = (ml) (Object) var8.a(0);
                                if (var17 == 0) {
                                  continue L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          de.a();
                          var9 = (ml) (Object) var8.b(12623);
                          L21: while (true) {
                            if (var9 == null) {
                              break L5;
                            } else {
                              stackOut_55_0 = 12;
                              stackOut_55_1 = var9.o(-22625);
                              stackIn_62_0 = stackOut_55_0;
                              stackIn_62_1 = stackOut_55_1;
                              stackIn_56_0 = stackOut_55_0;
                              stackIn_56_1 = stackOut_55_1;
                              if (var17 != 0) {
                                break L0;
                              } else {
                                L22: {
                                  if (stackIn_56_0 == stackIn_56_1) {
                                    break L22;
                                  } else {
                                    if (var9.w(24501) != null) {
                                      break L22;
                                    } else {
                                      var2 = 0;
                                      var14 = var9.y(17571);
                                      var2 = nj.field_n[var14];
                                      var15 = ((le) this).field_V.field_k[var14];
                                      mi.field_B.b(var15, var11[var14], var12[var14] + -1, (var2 | 8421504) ^ 8421504, 0);
                                      mi.field_B.b(var15, -1 + var11[var14], var12[var14], 8421504 ^ (8421504 | var2), 0);
                                      mi.field_B.b(var15, var11[var14], var12[var14], var2, -1);
                                      break L22;
                                    }
                                  }
                                }
                                var9 = (ml) (Object) var8.a(0);
                                if (var17 == 0) {
                                  continue L21;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              de.a();
              break L1;
            } else {
              break L1;
            }
          }
          stackOut_61_0 = 8;
          stackOut_61_1 = 8;
          stackIn_62_0 = stackOut_61_0;
          stackIn_62_1 = stackOut_61_1;
          break L0;
        }
        L23: {
          if (stackIn_62_0 == stackIn_62_1) {
            break L23;
          } else {
            ((le) this).field_G = true;
            break L23;
          }
        }
    }

    final static void c(int param0, boolean param1) {
        if (!(kh.field_c == null)) {
            fk.a(0, kh.field_c);
        }
        if (eo.field_c != null) {
            eo.field_c.a(param0 ^ -22718, param1);
        }
        ji.a(param1, (byte) -101);
        if (!(db.field_a == null)) {
            db.field_a.a(param1, true);
        }
        ed.a((byte) 90, param1);
        if (param0 != 1) {
            field_A = null;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        qb var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11_int = 0;
        qb var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_20_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_165_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_163_0 = 0;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          var5 = -120 / ((param0 - 58) / 53);
          var4 = n.field_g.field_nb;
          if (ti.field_N < 0) {
            break L0;
          } else {
            if (ti.field_N == -1) {
              break L0;
            } else {
              if (null != eb.field_b) {
                break L0;
              } else {
                var6_int = rd.field_e[ti.field_N];
                if (1 != var6_int) {
                  break L0;
                } else {
                  if (((le) this).field_s == -1000) {
                    if (((le) this).field_V.c((byte) 89)) {
                      break L0;
                    } else {
                      var7 = an.field_g;
                      var8 = me.field_I;
                      tg.field_b[5].b().a(var7, var8, ((le) this).field_P << 8, 4096 - Math.abs(((le) this).field_P - 128));
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
        L1: {
          L2: {
            if (~((le) this).field_V.d(false) == ~((le) this).field_I) {
              break L2;
            } else {
              if (!((le) this).field_ab) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          var6 = ((le) this).field_V.a(((le) this).field_bb, true);
          if (var6 != null) {
            L3: {
              L4: {
                var7 = var6.f(-98);
                var8 = var6.i((byte) -5);
                if (((le) this).field_s == -1000) {
                  break L4;
                } else {
                  L5: {
                    if (ti.field_N == 78) {
                      break L5;
                    } else {
                      L6: {
                        if (ti.field_N == 4) {
                          break L6;
                        } else {
                          L7: {
                            if (ti.field_N != 150) {
                              break L7;
                            } else {
                              L8: {
                                var9_int = var6.p(-8323);
                                if (((le) this).field_V.a(((le) this).field_s, ((le) this).field_V.field_H - 16, (byte) -75, var6)) {
                                  stackOut_19_0 = 65280;
                                  stackIn_20_0 = stackOut_19_0;
                                  break L8;
                                } else {
                                  stackOut_18_0 = 16711680;
                                  stackIn_20_0 = stackOut_18_0;
                                  break L8;
                                }
                              }
                              L9: {
                                var10 = stackIn_20_0;
                                ce.field_m.a(true);
                                de.h((an.field_f >> 1) + -param1, (var4 >> 1) + -param2, ((le) this).field_V.field_y + -param1 + (an.field_f >> 1), (var4 >> 1) + (((le) this).field_V.field_H + -param2));
                                de.a();
                                var11_int = (an.field_f >> 1) + (((le) this).field_s - param1);
                                var12 = (var4 >> 1) + -param2 + ((le) this).field_V.field_H + (-16 + -(var9_int >> 1));
                                de.c(var11_int, var12, var9_int >> 1, var10, 128);
                                gn.a(var9_int >> 1, (byte) 78, 3 * Math.abs(-16 + (((le) this).field_P & 31)) - -128, var11_int, var12);
                                if (((le) this).field_V.c((byte) 89)) {
                                  break L9;
                                } else {
                                  tg.field_b[5].b().a(var11_int, var12, ((le) this).field_P << 8, var9_int * (-(Math.abs((((le) this).field_P & 31) - 16) * 64) + 4096) / 32);
                                  break L9;
                                }
                              }
                              if (var15 == 0) {
                                break L1;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L10: {
                            if (ti.field_N == 56) {
                              break L10;
                            } else {
                              if (ti.field_N == 57) {
                                break L10;
                              } else {
                                if (ti.field_N == 32) {
                                  break L10;
                                } else {
                                  if (33 == ti.field_N) {
                                    break L10;
                                  } else {
                                    if (ti.field_N == 42) {
                                      break L10;
                                    } else {
                                      if (ti.field_N == 17) {
                                        break L10;
                                      } else {
                                        if (ti.field_N == 23) {
                                          break L10;
                                        } else {
                                          if (ti.field_N == 59) {
                                            break L10;
                                          } else {
                                            if (ti.field_N == 47) {
                                              break L10;
                                            } else {
                                              if (ti.field_N == 65) {
                                                break L10;
                                              } else {
                                                if (ti.field_N == 67) {
                                                  break L10;
                                                } else {
                                                  if (ti.field_N == 64) {
                                                    break L10;
                                                  } else {
                                                    if (ti.field_N == 44) {
                                                      break L10;
                                                    } else {
                                                      if (ti.field_N == 76) {
                                                        break L10;
                                                      } else {
                                                        if (ti.field_N == 77) {
                                                          break L10;
                                                        } else {
                                                          if (ti.field_N == 6) {
                                                            break L10;
                                                          } else {
                                                            if (79 == ti.field_N) {
                                                              break L10;
                                                            } else {
                                                              if (ti.field_N == 98) {
                                                                break L10;
                                                              } else {
                                                                if (ti.field_N == 90) {
                                                                  break L10;
                                                                } else {
                                                                  if (ti.field_N == 104) {
                                                                    break L10;
                                                                  } else {
                                                                    if (ti.field_N == 92) {
                                                                      break L10;
                                                                    } else {
                                                                      if (107 == ti.field_N) {
                                                                        break L10;
                                                                      } else {
                                                                        if (112 == ti.field_N) {
                                                                          break L10;
                                                                        } else {
                                                                          if (ti.field_N == 118) {
                                                                            break L10;
                                                                          } else {
                                                                            L11: {
                                                                              if (9 != ti.field_N) {
                                                                                break L11;
                                                                              } else {
                                                                                L12: {
                                                                                  if (((le) this).field_V.a(false, ((le) this).field_s, ((le) this).field_r)) {
                                                                                    stackOut_50_0 = 65280;
                                                                                    stackIn_51_0 = stackOut_50_0;
                                                                                    break L12;
                                                                                  } else {
                                                                                    stackOut_49_0 = 16711680;
                                                                                    stackIn_51_0 = stackOut_49_0;
                                                                                    break L12;
                                                                                  }
                                                                                }
                                                                                L13: {
                                                                                  var9_int = stackIn_51_0;
                                                                                  ce.field_m.a(true);
                                                                                  var10 = 32;
                                                                                  var11_int = (an.field_f >> 1) + (-param1 + ((le) this).field_s);
                                                                                  var12 = -(var10 >> 1) + (-param2 + ((le) this).field_r - -(var4 >> 1));
                                                                                  de.c(var11_int, var12, var10 >> 1, var9_int, 128);
                                                                                  gn.a(var10 >> 1, (byte) 94, Math.abs((31 & ((le) this).field_P) + -16) * 3 - -128, var11_int, var12);
                                                                                  if (((le) this).field_V.c((byte) 89)) {
                                                                                    break L13;
                                                                                  } else {
                                                                                    tg.field_b[5].b().a(var11_int, var12, ((le) this).field_P << 8, (4096 - 64 * Math.abs((((le) this).field_P & 31) - 16)) * var10 / 32);
                                                                                    break L13;
                                                                                  }
                                                                                }
                                                                                if (var15 == 0) {
                                                                                  break L3;
                                                                                } else {
                                                                                  break L11;
                                                                                }
                                                                              }
                                                                            }
                                                                            L14: {
                                                                              if (ti.field_N != 5) {
                                                                                break L14;
                                                                              } else {
                                                                                L15: {
                                                                                  L16: {
                                                                                    if (!((le) this).field_V.a(false, ((le) this).field_s, ((le) this).field_r)) {
                                                                                      break L16;
                                                                                    } else {
                                                                                      if (!((le) this).field_V.a(false, var6.f(100), -32 + var6.i((byte) -65) - var6.p(-8323))) {
                                                                                        break L16;
                                                                                      } else {
                                                                                        stackOut_57_0 = 65280;
                                                                                        stackIn_59_0 = stackOut_57_0;
                                                                                        break L15;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  stackOut_58_0 = 16711680;
                                                                                  stackIn_59_0 = stackOut_58_0;
                                                                                  break L15;
                                                                                }
                                                                                L17: {
                                                                                  var9_int = stackIn_59_0;
                                                                                  ce.field_m.a(true);
                                                                                  var10 = 32;
                                                                                  var11_int = (an.field_f >> 1) + -param1 + var7;
                                                                                  var12 = (var4 >> 1) + var8 - param2 - (var6.p(-8323) - -32);
                                                                                  de.c(var11_int, var12, var10 >> 1, var9_int, 128);
                                                                                  gn.a(var10 >> 1, (byte) 63, 128 + 3 * Math.abs((((le) this).field_P & 31) + -16), var11_int, var12);
                                                                                  var13 = ((le) this).field_s - param1 - -(an.field_f >> 1);
                                                                                  var14 = (var4 >> 1) + (((le) this).field_r - param2) + -(var10 >> 1);
                                                                                  de.c(var13, var14, var10 >> 1, var9_int, 128);
                                                                                  gn.a(var10 >> 1, (byte) 125, 128 + Math.abs(-16 + (((le) this).field_P & 31)) * 3, var13, var14);
                                                                                  if (!((le) this).field_V.c((byte) 89)) {
                                                                                    tg.field_b[5].b().a(var13, var14, ((le) this).field_P << 8, (4096 - 64 * Math.abs((((le) this).field_P & 31) + -16)) * var10 / 32);
                                                                                    break L17;
                                                                                  } else {
                                                                                    break L17;
                                                                                  }
                                                                                }
                                                                                if (var15 == 0) {
                                                                                  break L3;
                                                                                } else {
                                                                                  break L14;
                                                                                }
                                                                              }
                                                                            }
                                                                            L18: {
                                                                              if (ti.field_N == 30) {
                                                                                break L18;
                                                                              } else {
                                                                                if (ti.field_N == -1) {
                                                                                  break L3;
                                                                                } else {
                                                                                  var9_int = -param1 + ((le) this).field_s + (an.field_f >> 1);
                                                                                  var10 = -param2 + ((le) this).field_r - -(var4 >> 1);
                                                                                  tg.field_b[5].b().a(var9_int, var10, ((le) this).field_P << 8, -Math.abs(-128 + ((le) this).field_P) + 4096);
                                                                                  if (var15 == 0) {
                                                                                    break L3;
                                                                                  } else {
                                                                                    break L18;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L19: {
                                                                              if (((le) this).field_V.a(((le) this).field_s, var6, 30882, ((le) this).field_r)) {
                                                                                stackOut_68_0 = 65280;
                                                                                stackIn_69_0 = stackOut_68_0;
                                                                                break L19;
                                                                              } else {
                                                                                stackOut_67_0 = 16711680;
                                                                                stackIn_69_0 = stackOut_67_0;
                                                                                break L19;
                                                                              }
                                                                            }
                                                                            var9_int = stackIn_69_0;
                                                                            bg.field_e.a(-(bg.field_e.field_n >> 1) + ((an.field_f >> 1) + -param1 + ((le) this).field_s), (var4 >> 1) + (-param2 + (((le) this).field_r - bg.field_e.field_w)), var9_int);
                                                                            bg.field_e.c(-param1 + ((le) this).field_s - -(an.field_f >> 1) - (bg.field_e.field_n >> 1), -bg.field_e.field_w + (((le) this).field_r - (param2 - (var4 >> 1))), 128);
                                                                            if (var15 == 0) {
                                                                              break L3;
                                                                            } else {
                                                                              break L10;
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
                                }
                              }
                            }
                          }
                          L20: {
                            var9_int = 32;
                            if (ti.field_N == 4) {
                              var9_int = var6.p(-8323);
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          L21: {
                            if (ti.field_N != 57) {
                              break L21;
                            } else {
                              var9_int = 64;
                              break L21;
                            }
                          }
                          L22: {
                            if (ti.field_N == 33) {
                              var9_int = 64;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          L23: {
                            if (ti.field_N == 42) {
                              var9_int = 64;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          L24: {
                            if (ti.field_N != 23) {
                              break L24;
                            } else {
                              var9_int = 100;
                              break L24;
                            }
                          }
                          L25: {
                            if (ti.field_N != 59) {
                              break L25;
                            } else {
                              var9_int = 100;
                              break L25;
                            }
                          }
                          L26: {
                            if (ti.field_N != 47) {
                              break L26;
                            } else {
                              var9_int = 100;
                              break L26;
                            }
                          }
                          L27: {
                            if (ti.field_N == 65) {
                              var9_int = 48;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            if (67 != ti.field_N) {
                              break L28;
                            } else {
                              var9_int = 48;
                              break L28;
                            }
                          }
                          L29: {
                            if (ti.field_N != 76) {
                              break L29;
                            } else {
                              var9_int = 80;
                              break L29;
                            }
                          }
                          L30: {
                            if (ti.field_N == 77) {
                              var9_int = 48;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          L31: {
                            if (ti.field_N == 6) {
                              var9_int = 96;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            if (ti.field_N == 79) {
                              var9_int = 96;
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            if (98 != ti.field_N) {
                              break L33;
                            } else {
                              var9_int = 96;
                              break L33;
                            }
                          }
                          L34: {
                            if (ti.field_N == 90) {
                              var9_int = 64;
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          L35: {
                            if (ti.field_N == 107) {
                              var9_int = 128;
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          L36: {
                            if (ti.field_N == 104) {
                              var9_int = 32;
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (ti.field_N == 92) {
                              var9_int = 96;
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (ti.field_N == 118) {
                              var9_int = 100;
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          L39: {
                            if (((le) this).field_V.a(false, var6, ti.field_N, ((le) this).field_r, ((le) this).field_s)) {
                              stackOut_122_0 = 65280;
                              stackIn_123_0 = stackOut_122_0;
                              break L39;
                            } else {
                              stackOut_121_0 = 16711680;
                              stackIn_123_0 = stackOut_121_0;
                              break L39;
                            }
                          }
                          L40: {
                            var10 = stackIn_123_0;
                            ce.field_m.a(true);
                            de.h(-param1 - -(an.field_f >> 1), -param2 - -(var4 >> 1), (an.field_f >> 1) + (-param1 - -((le) this).field_V.field_y), (var4 >> 1) + (-param2 + ((le) this).field_V.field_H));
                            var11_int = -param1 + (var7 + (an.field_f >> 1));
                            var12 = (var4 >> 1) + var8 + (-param2 + -(var9_int >> 1));
                            gn.a((var9_int >> 1) + 128, (byte) 88, -(128 + Math.abs(-16 + (31 & ((le) this).field_P)) * 3), var11_int, var12);
                            de.a();
                            var13 = (an.field_f >> 1) + ((le) this).field_s - param1;
                            var14 = -(var9_int >> 1) + ((var4 >> 1) + (-param2 + ((le) this).field_r));
                            de.c(var13, var14, var9_int >> 1, var10, 128);
                            gn.a(var9_int >> 1, (byte) 73, Math.abs(-16 + (31 & ((le) this).field_P)) * 3 - -128, var13, var14);
                            if (!((le) this).field_V.c((byte) 89)) {
                              tg.field_b[5].b().a(var13, var14, ((le) this).field_P << 8, var9_int * (4096 - 64 * Math.abs(-16 + (((le) this).field_P & 31))) / 32);
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          if (var15 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L41: {
                        var9_int = var6.p(-8323);
                        if (((le) this).field_V.b(((le) this).field_s, var6, -16, ((le) this).field_r)) {
                          stackOut_129_0 = 65280;
                          stackIn_130_0 = stackOut_129_0;
                          break L41;
                        } else {
                          stackOut_128_0 = 16711680;
                          stackIn_130_0 = stackOut_128_0;
                          break L41;
                        }
                      }
                      L42: {
                        var10 = stackIn_130_0;
                        ce.field_m.a(true);
                        de.h(-param1 - -(an.field_f >> 1), (var4 >> 1) + -param2, (an.field_f >> 1) + (-param1 + ((le) this).field_V.field_y), ((le) this).field_V.field_H + -param2 + (var4 >> 1));
                        de.a();
                        var11_int = -param1 + (((le) this).field_s - -(an.field_f >> 1));
                        var12 = -param2 + (((le) this).field_r + ((var4 >> 1) - (var9_int >> 1)));
                        de.c(var11_int, var12, var9_int >> 1, var10, 128);
                        gn.a(var9_int >> 1, (byte) 100, 128 + Math.abs(-16 + (((le) this).field_P & 31)) * 3, var11_int, var12);
                        if (!((le) this).field_V.c((byte) 89)) {
                          tg.field_b[5].b().a(var11_int, var12, ((le) this).field_P << 8, var9_int * (4096 - 64 * Math.abs((((le) this).field_P & 31) + -16)) / 32);
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      if (var15 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L43: {
                    var9_int = -(go.field_j[29].field_g / 2) + ((an.field_f >> 1) + (((le) this).field_s - param1));
                    var10 = (var4 >> 1) + ((le) this).field_r - param2 - go.field_j[29].field_k;
                    if (((le) this).field_V.a(var6, ((le) this).field_r, ((le) this).field_s, -5)) {
                      break L43;
                    } else {
                      go.field_j[29].b().a(var9_int, var10, 16711680);
                      break L43;
                    }
                  }
                  go.field_j[29].a(var9_int, var10, 64);
                  if (var15 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L44: {
                if (ti.field_N == 2) {
                  break L44;
                } else {
                  if (ti.field_N == 81) {
                    break L44;
                  } else {
                    if (ti.field_N == 31) {
                      break L44;
                    } else {
                      if (ti.field_N == 60) {
                        break L44;
                      } else {
                        if (ti.field_N == 55) {
                          break L44;
                        } else {
                          if (91 == ti.field_N) {
                            break L44;
                          } else {
                            if (ti.field_N == 114) {
                              break L44;
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
              L45: {
                var9 = uj.field_i[0];
                if (55 != ti.field_N) {
                  break L45;
                } else {
                  var9 = uj.field_i[1];
                  break L45;
                }
              }
              L46: {
                if (ti.field_N == 31) {
                  var9 = uj.field_i[2];
                  break L46;
                } else {
                  break L46;
                }
              }
              L47: {
                if (ti.field_N == 60) {
                  var9 = uj.field_i[3];
                  break L47;
                } else {
                  break L47;
                }
              }
              L48: {
                if (81 == ti.field_N) {
                  var9 = uj.field_i[4];
                  break L48;
                } else {
                  break L48;
                }
              }
              L49: {
                if (ti.field_N == 91) {
                  var9 = uj.field_i[5];
                  break L49;
                } else {
                  break L49;
                }
              }
              L50: {
                if (114 == ti.field_N) {
                  var9 = uj.field_i[6];
                  break L50;
                } else {
                  break L50;
                }
              }
              L51: {
                if (!((le) this).field_V.a(ti.field_N, var6.i((byte) 116), var6, (byte) 91, var6.f(45))) {
                  stackOut_164_0 = 16711680;
                  stackIn_165_0 = stackOut_164_0;
                  break L51;
                } else {
                  stackOut_163_0 = 65280;
                  stackIn_165_0 = stackOut_163_0;
                  break L51;
                }
              }
              var10 = stackIn_165_0;
              var11 = new qb(16 + var9.field_n, 16 + var9.field_w);
              var11.a();
              var9.a(8, 8, var10);
              de.d(5, 5, 0, 0, var11.field_n, var11.field_w);
              ce.field_m.a(true);
              var11.b(-param1 + (-(var9.field_n / 2) + var7 + (an.field_f >> 1) + -8), var8 + (-var9.field_w + (-param2 + (var4 >> 1)) - 8), 256);
              var9.a((an.field_f >> 1) + var7 + (-(var9.field_n / 2) - param1), (var4 >> 1) + (var8 + -var9.field_w + -param2), var10);
              var9.c(-param1 + (var7 - var9.field_n / 2 - -(an.field_f >> 1)), -param2 + var8 - (var9.field_w - (var4 >> 1)), 128);
              break L3;
            }
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final boolean f(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (((le) this).field_o) {
              break L1;
            } else {
              L2: {
                if (this.r(-87)) {
                  break L2;
                } else {
                  if (!((le) this).field_k) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final boolean e(byte param0) {
        if (param0 >= -75) {
            this.g(66);
        }
        return this.a((wk) (Object) df.field_z, on.field_g, 0, fj.field_h);
    }

    private final boolean b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (((le) this).field_o) {
              break L1;
            } else {
              L2: {
                if (this.r(-40)) {
                  break L2;
                } else {
                  if (!((le) this).field_k) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if (ij.field_Tb != null) {
            break L0;
          } else {
            ij.field_Tb = new qb(640, 480);
            break L0;
          }
        }
        L1: {
          ij.field_Tb.a();
          var2 = wm.a(((le) this).field_V.a(-31497), (byte) -124);
          var3 = ng.b((byte) -124, ((le) this).field_V.a(-31497));
          nb.field_a = var2;
          cg.field_Lb = var3;
          de.c(0, 0, 640, 480, var2, var3);
          if (null != e.field_M[((le) this).field_V.a(-31497)]) {
            break L1;
          } else {
            ue.field_d.field_f = 0;
            af.a(tj.a(115, new String[1], "background<%0>"), "", 19412, ue.field_d).b(0, 0, 640, 480);
            break L1;
          }
        }
        L2: {
          if (param0 == 413355681) {
            break L2;
          } else {
            ((le) this).field_S = 49;
            break L2;
          }
        }
        de.d(2, 2, 0, 0, 640, 480);
        var4 = 0;
        L3: while (true) {
          L4: {
            if (var4 >= ij.field_Tb.field_A.length) {
              break L4;
            } else {
              if (var5 != 0) {
                break L4;
              } else {
                L5: {
                  if (ij.field_Tb.field_A[var4] != 0) {
                    break L5;
                  } else {
                    ij.field_Tb.field_A[var4] = 1;
                    break L5;
                  }
                }
                var4++;
                if (var5 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
          }
          return;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        vn var5 = null;
        ml var6 = null;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (param1 <= -50) {
            break L0;
          } else {
            ((le) this).field_p = -101;
            break L0;
          }
        }
        L1: {
          var4 = n.field_g.field_nb;
          var5 = ((le) this).field_V.g((byte) 115);
          if (var5 != null) {
            var6 = (ml) (Object) var5.b(12623);
            L2: while (true) {
              if (var6 == null) {
                break L1;
              } else {
                var6.a(2, -param2 - -(var4 >> 1), (an.field_f >> 1) + -param0);
                var6 = (ml) (Object) var5.a(0);
                if (var7 != 0) {
                  break L1;
                } else {
                  if (var7 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    private final void a(byte param0, ml param1) {
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -7) {
              L1: {
                var3_int = n.field_g.field_nb;
                var4 = -(an.field_f >> 1) + (vn.field_c + an.field_g);
                var5 = -(var3_int >> 1) + ol.field_g + me.field_I;
                if (((le) this).field_u <= 0) {
                  break L1;
                } else {
                  var5 = ((le) this).field_c;
                  var4 = ((le) this).field_e;
                  break L1;
                }
              }
              L2: {
                var6 = param1.f(45);
                var7 = param1.i((byte) 114);
                var8 = param1.p(-8323);
                var9 = -var6 + var4;
                var10 = (var8 >> 1) + -var7 + var5;
                var11 = (int)Math.sqrt((double)(var10 * var10 + var9 * var9));
                if (0 != var11) {
                  break L2;
                } else {
                  var10 = -1;
                  var11 = 1;
                  break L2;
                }
              }
              L3: {
                if (!((le) this).field_V.a(true)) {
                  L4: {
                    L5: {
                      if (var9 <= 0) {
                        break L5;
                      } else {
                        param1.field_E = 1;
                        if (var18 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    param1.field_E = -1;
                    break L4;
                  }
                  L6: {
                    if (ti.field_N != 155) {
                      break L6;
                    } else {
                      if (Math.abs(var9) < Math.abs(var10)) {
                        L7: {
                          L8: {
                            var9 = param1.field_E * 64;
                            if (var10 < 0) {
                              break L8;
                            } else {
                              var10 = 64;
                              if (var18 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var10 = -64;
                          break L7;
                        }
                        var11 = (int)Math.sqrt((double)(var9 * var9 + var10 * var10));
                        if (var11 != 0) {
                          break L6;
                        } else {
                          var11 = 1;
                          var10 = -1;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  var12 = param1.p(param0 ^ 8324) / 2;
                  var15 = 0;
                  L9: while (true) {
                    L10: {
                      if (100 <= var15) {
                        break L10;
                      } else {
                        var16 = var12 - -(var15 / 4);
                        var14 = -var12 + var10 * var16 / var11;
                        var13 = var16 * var9 / var11;
                        var17 = 0;
                        if (var18 != 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L11: {
                            L12: {
                              if (var15 >= 25) {
                                break L12;
                              } else {
                                var17 = var17 | (255 & var15 * 10) << 16;
                                if (var18 == 0) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            L13: {
                              var17 = var17 | 16711680;
                              if (var15 >= 75) {
                                break L13;
                              } else {
                                var17 = var17 | (255 & -125 + var15 * 5) << 8;
                                if (var18 == 0) {
                                  break L11;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L14: {
                              var17 = var17 | 65280;
                              if (var15 >= 100) {
                                break L14;
                              } else {
                                var17 = var17 | 10 * var15 + -750 & 255;
                                if (var18 == 0) {
                                  break L11;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            var17 = var17 | 255;
                            break L11;
                          }
                          L15: {
                            L16: {
                              if (10 >= var15) {
                                break L16;
                              } else {
                                de.c((an.field_f >> 1) + var6 - (-var13 + vn.field_c), (var3_int >> 1) + var14 + var7 + -ol.field_g, 1600 / (200 - var15 * 100 / 100), var17, 10);
                                if (var18 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            de.c((an.field_f >> 1) + (var13 + var6 + -vn.field_c), var14 + var7 - (ol.field_g + -(var3_int >> 1)), 1600 / (200 + -(var15 * 100 / 100)), var17, var15);
                            break L15;
                          }
                          var15++;
                          if (var18 == 0) {
                            continue L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("le.UA(").append(param0).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L17;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L17;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static qb[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 1) {
            field_E = null;
        }
        return th.a(param4, 1, 3, param0, param2 + -32574, param3, 1, 1, param1);
    }

    private final void a(int param0) {
        int var2 = -52 / ((-45 - param0) / 63);
        he.field_e.b((byte) -78, 63);
        he.field_e.f(((le) this).field_V.n((byte) -75), (byte) -10);
        ((le) this).field_V.e(true);
        ((le) this).field_w.e(true);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        ((le) this).field_f = new ge(((le) this).field_I, param3, param1, param4, param6, param7, param0, param8);
        ((le) this).field_W = param2;
        ((le) this).field_x = 50;
        if (param5 != -30) {
            ((le) this).field_r = 83;
        }
        ob.a(20, ((le) this).field_f, param2);
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = n.field_g.field_nb;
          var3 = 16777215;
          if (0 >= ((le) this).field_V.field_G) {
            break L0;
          } else {
            var3 = 16711680;
            break L0;
          }
        }
        de.e((an.field_f >> 1) + -vn.field_c + -8, (var2 >> 1) + (-ol.field_g + -8), 8, 8, var3, 64);
        de.e(-vn.field_c - (-(an.field_f >> 1) + -((le) this).field_V.field_y), -8 + (-ol.field_g + (var2 >> 1)), 8, 8, var3, 64);
        de.h(-vn.field_c + (an.field_f >> 1), -8 + (var2 >> 1) + (-ol.field_g + param0), ((le) this).field_V.field_y + (-vn.field_c - -(an.field_f >> 1)), an.field_j);
        var4 = ((255 & jb.field_v) >> 2) + -64;
        L1: while (true) {
          L2: {
            L3: {
              if (8 + ((le) this).field_V.field_y < var4) {
                break L3;
              } else {
                de.e((an.field_f >> 1) + (-vn.field_c + var4), (var2 >> 1) + -ol.field_g - 8, 32, 8, var3, 64);
                var4 += 64;
                if (var5 != 0) {
                  break L2;
                } else {
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            de.h(-vn.field_c - -(an.field_f >> 1) + -8, (var2 >> 1) + -ol.field_g, (an.field_f >> 1) + (-vn.field_c - -((le) this).field_V.field_y) - -8, an.field_j);
            break L2;
          }
          var4 = -64 - ((jb.field_v & 255) >> 2);
          L4: while (true) {
            L5: {
              L6: {
                if (~var4 < ~((le) this).field_V.field_H) {
                  break L6;
                } else {
                  de.e(-8 + -vn.field_c - -(an.field_f >> 1), var4 - (ol.field_g - ((var2 >> 1) - 4)), 8, 32, var3, 64);
                  var4 += 64;
                  if (var5 != 0) {
                    break L5;
                  } else {
                    if (var5 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var4 = -64 - -(jb.field_v >> 2 & 63);
              break L5;
            }
            L7: while (true) {
              L8: {
                L9: {
                  if (~var4 < ~((le) this).field_V.field_H) {
                    break L9;
                  } else {
                    de.e((an.field_f >> 1) + (((le) this).field_V.field_y - vn.field_c), -4 + ((var2 >> 1) + (var4 - ol.field_g)), 8, 32, var3, 64);
                    var4 += 64;
                    if (var5 != 0) {
                      break L8;
                    } else {
                      if (var5 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                de.a();
                break L8;
              }
              return;
            }
          }
        }
    }

    private final boolean b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (((le) this).field_o) {
              break L1;
            } else {
              L2: {
                if (this.r(-95)) {
                  break L2;
                } else {
                  if (!((le) this).field_k) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private final void i(int param0) {
        if (((le) this).field_h <= 0) {
            throw new IllegalStateException();
        }
        if (((le) this).field_ab) {
            int fieldTemp$0 = ((le) this).field_p + 1;
            ((le) this).field_p = ((le) this).field_p + 1;
            p.a(((le) this).field_V.n((byte) -75), ((le) this).field_R, (byte) 11, 158, ((le) this).field_r, ((le) this).field_h, ((le) this).field_bb, 0, fieldTemp$0);
        }
        if (param0 != 2000) {
            ((le) this).field_T = false;
        }
        ((le) this).field_h = 0;
    }

    private final void a(wk param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        ml var4 = null;
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
        try {
          L0: {
            L1: {
              ((le) this).field_z = -param1 + param0.n(-98);
              if (((le) this).field_z >= 1) {
                break L1;
              } else {
                ((le) this).field_z = 1;
                break L1;
              }
            }
            L2: {
              if (!((le) this).field_k) {
                break L2;
              } else {
                L3: {
                  L4: {
                    ((le) this).field_k = false;
                    ((le) this).field_V.a((byte) 112, ((le) this).field_w);
                    ((le) this).field_V.field_rb = uk.field_g;
                    ((le) this).field_V.field_sb = cf.field_h;
                    ((le) this).field_C = true;
                    ((le) this).field_bb = ((le) this).field_V.d(false);
                    var4 = ((le) this).field_V.a(((le) this).field_V.d(false), true);
                    if (var4 == null) {
                      break L4;
                    } else {
                      ((le) this).field_m.a(-111, var4);
                      if (!ArcanistsMulti.field_G) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((le) this).field_m.a(0);
                  break L3;
                }
                ((le) this).field_t = false;
                ((le) this).field_s = -1000;
                break L2;
              }
            }
            ((le) this).field_o = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("le.A(");
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + 8888 + 41);
        }
    }

    private final boolean l(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (((le) this).field_o) {
              break L1;
            } else {
              L2: {
                if (this.r(-95)) {
                  break L2;
                } else {
                  if (!((le) this).field_k) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final void p(int param0) {
        if (!(((le) this).field_ab)) {
            throw new IllegalStateException();
        }
        if (param0 != 26873) {
            return;
        }
        he.field_e.b((byte) -74, 60);
    }

    final void a(boolean param0) {
        if (!((le) this).field_ab) {
            throw new IllegalStateException();
        }
        if (!param0) {
            ((le) this).field_a = -59;
        }
        he.field_e.b((byte) -24, 59);
    }

    final void a(boolean param0, int param1) {
        if (param1 != -26449) {
            ml discarded$0 = this.q(-86);
        }
        ((le) this).a(param0, an.field_j, 0, true, 0, 96, an.field_f);
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        ll var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        byte stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_33_0 = 0;
        boolean stackOut_41_0 = false;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          de.b();
          var5 = 0;
          param0 = param0 + ue.b((byte) -32);
          var7 = an.field_j;
          var7 = n.field_g.field_nb;
          var8 = ((le) this).field_V.b(true);
          var6 = -(param3 - -240) * (-an.field_j + 960) / 1440;
          var5 = (an.field_f - 1280) * (var8 + param0) / (2 * var8 + ((le) this).field_V.field_y);
          if (var6 <= 0) {
            break L0;
          } else {
            var6 = 0;
            break L0;
          }
        }
        L1: {
          L2: {
            if (960 < an.field_j) {
              break L2;
            } else {
              ij.field_Tb.c(var5, var6, 1280, 960);
              if (var15 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          ij.field_Tb.c(var5, 0, 1280, an.field_j);
          break L1;
        }
        L3: {
          ge.field_r = ge.field_r + 1;
          if (ge.field_r > 128) {
            ge.field_r = ge.field_r - 128;
            break L3;
          } else {
            break L3;
          }
        }
        var9 = 0;
        L4: while (true) {
          L5: {
            L6: {
              L7: {
                if (an.field_f <= var9) {
                  break L7;
                } else {
                  var10 = (int)Math.abs(Math.sin(3.141592653589793 * (double)(var9 + ge.field_r - -param0) / 64.0) * 12.0);
                  stackOut_11_0 = ~ge.field_r;
                  stackOut_11_1 = -65;
                  stackIn_100_0 = stackOut_11_0;
                  stackIn_100_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (var15 != 0) {
                    L8: while (true) {
                      if (stackIn_100_0 <= stackIn_100_1) {
                        break L6;
                      } else {
                        var10 = (int)Math.abs(Math.cos((double)(ge.field_r + (var9 + param0)) * 3.141592653589793 / 64.0) * 14.0);
                        stackOut_98_0 = -65;
                        stackOut_98_1 = ~ge.field_r;
                        stackIn_29_0 = stackOut_98_0;
                        stackIn_29_1 = stackOut_98_1;
                        stackIn_99_0 = stackOut_98_0;
                        stackIn_99_1 = stackOut_98_1;
                        if (var15 != 0) {
                          break L5;
                        } else {
                          stackOut_99_0 = stackIn_99_0;
                          stackOut_99_1 = stackIn_99_1;
                          stackIn_96_0 = stackOut_99_0;
                          stackIn_96_1 = stackOut_99_1;
                          L9: {
                            L10: {
                              if (stackIn_96_0 < stackIn_96_1) {
                                break L10;
                              } else {
                                var10 = var10 * (96 + -ge.field_r) / 32;
                                if (var15 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var10 = var10 * (ge.field_r - 32) / 32;
                            break L9;
                          }
                          L11: {
                            if (var10 <= 0) {
                              break L11;
                            } else {
                              var10 = -var10;
                              break L11;
                            }
                          }
                          var10 += 20;
                          var10 = (int)((double)var10 + (8.0 * Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) + 32.0));
                          de.d(var9, -param3 + ((le) this).field_V.field_H - (-(var7 >> 1) + var10), var10, 16448 | param2 >> 1);
                          var9++;
                          if (var15 == 0) {
                            stackOut_102_0 = an.field_f;
                            stackOut_102_1 = var9;
                            stackIn_100_0 = stackOut_102_0;
                            stackIn_100_1 = stackOut_102_1;
                            continue L8;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  } else {
                    L12: {
                      L13: {
                        if (stackIn_12_0 <= stackIn_12_1) {
                          break L13;
                        } else {
                          var10 = (ge.field_r + -32) * var10 / 32;
                          if (var15 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var10 = (96 - ge.field_r) * var10 / 32;
                      break L12;
                    }
                    L14: {
                      if (var10 > 0) {
                        var10 = -var10;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var10 += 22;
                    var10 = (int)((double)var10 + (8.0 * Math.sin(3.141592653589793 * (double)ge.field_r / 64.0) + 32.0));
                    de.d(var9, -var10 + ((le) this).field_V.field_H + (-param3 + (var7 >> 1)), var10, (16449 | param2) >> 1);
                    var9++;
                    if (var15 == 0) {
                      continue L4;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              var9 = 0;
              L15: while (true) {
                if (an.field_f <= var9) {
                  break L6;
                } else {
                  var10 = (int)Math.abs(Math.cos((double)(ge.field_r + (var9 + param0)) * 3.141592653589793 / 64.0) * 14.0);
                  stackOut_21_0 = -65;
                  stackOut_21_1 = ~ge.field_r;
                  stackIn_29_0 = stackOut_21_0;
                  stackIn_29_1 = stackOut_21_1;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  if (var15 != 0) {
                    break L5;
                  } else {
                    L16: {
                      L17: {
                        if (stackIn_22_0 < stackIn_22_1) {
                          break L17;
                        } else {
                          var10 = var10 * (96 + -ge.field_r) / 32;
                          if (var15 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var10 = var10 * (ge.field_r - 32) / 32;
                      break L16;
                    }
                    L18: {
                      if (var10 <= 0) {
                        break L18;
                      } else {
                        var10 = -var10;
                        break L18;
                      }
                    }
                    var10 += 20;
                    var10 = (int)((double)var10 + (8.0 * Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) + 32.0));
                    de.d(var9, -param3 + ((le) this).field_V.field_H - (-(var7 >> 1) + var10), var10, 16448 | param2 >> 1);
                    var9++;
                    if (var15 == 0) {
                      continue L15;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
            stackOut_28_0 = param1;
            stackOut_28_1 = -82;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            break L5;
          }
          L19: {
            if (stackIn_29_0 <= stackIn_29_1) {
              break L19;
            } else {
              ((le) this).field_V = null;
              break L19;
            }
          }
          var9 = 0;
          L20: while (true) {
            L21: {
              L22: {
                if (var9 >= an.field_f) {
                  break L22;
                } else {
                  var10 = (int)Math.abs(Math.sin(3.141592653589793 * (double)(var9 + ge.field_r * 2 - -param0) / 64.0) * 16.0);
                  stackOut_33_0 = ge.field_r;
                  stackIn_42_0 = stackOut_33_0;
                  stackIn_34_0 = stackOut_33_0;
                  if (var15 != 0) {
                    break L21;
                  } else {
                    L23: {
                      L24: {
                        if (stackIn_34_0 < 64) {
                          break L24;
                        } else {
                          var10 = var10 * (96 + -ge.field_r) / 32;
                          if (var15 == 0) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      var10 = (ge.field_r - 32) * var10 / 32;
                      break L23;
                    }
                    L25: {
                      if (var10 > 0) {
                        var10 = -var10;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    var10 += 16;
                    var10 = (int)((double)var10 + (Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) * 8.0 + 32.0));
                    de.f(var9, -var10 + (-param3 + ((le) this).field_V.field_H - -(var7 >> 1)), var10, param2 | 16448, 128);
                    var9++;
                    if (var15 == 0) {
                      continue L20;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              stackOut_41_0 = td.e(true);
              stackIn_42_0 = stackOut_41_0 ? 1 : 0;
              break L21;
            }
            L26: {
              L27: {
                if (stackIn_42_0 == 0) {
                  break L27;
                } else {
                  if (((le) this).field_T) {
                    ((le) this).field_V.m((byte) 69).b((an.field_f >> 1) + -param0, -param3 - -(var7 >> 1), ((le) this).field_V.field_y, ((le) this).field_V.field_H);
                    break L26;
                  } else {
                    break L27;
                  }
                }
              }
              L28: {
                var9_ref_int__ = ((le) this).field_V.field_V.field_l;
                if (null != ((le) this).field_V.field_pb) {
                  ((le) this).field_V.field_V.field_l = ((le) this).field_V.field_pb;
                  break L28;
                } else {
                  break L28;
                }
              }
              ((le) this).field_V.field_V.a((an.field_f >> 1) + -param0, -param3 - -(var7 >> 1));
              ((le) this).field_V.field_V.field_l = var9_ref_int__;
              break L26;
            }
            L29: {
              if (null != ((le) this).field_V.field_V) {
                L30: {
                  var9 = 0;
                  var10 = 0;
                  var11 = ((le) this).field_V.m((byte) 69);
                  gd.field_tb = gd.field_tb + 1;
                  if (~(-1 + ((le) this).field_V.field_y) >= ~gd.field_tb) {
                    gd.field_tb = 0;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  var12 = gd.field_tb - 2 * (1 & gd.field_tb) - -1;
                  if (var12 >= 0) {
                    break L31;
                  } else {
                    var12 = 0;
                    break L31;
                  }
                }
                L32: {
                  if (var12 >= -1 + ((le) this).field_V.field_y) {
                    var12 = ((le) this).field_V.field_y + -1;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                var10 = (gd.field_tb >> 1) + ((le) this).field_V.field_hb;
                var13 = 2 * (gd.field_tb & 1) + -1;
                var9 = gd.field_tb + 2 * ((le) this).field_V.field_y;
                var14 = 2;
                L33: while (true) {
                  if (var14 >= ((le) this).field_V.field_H + -2) {
                    break L29;
                  } else {
                    if (var15 != 0) {
                      break L29;
                    } else {
                      L34: {
                        L35: {
                          if (var11.field_m[var10] != 0) {
                            break L35;
                          } else {
                            if (var11.field_m[var10 + var13] != 0) {
                              break L34;
                            } else {
                              if (var11.field_m[var10 + -((le) this).field_V.field_hb] == 0) {
                                ((le) this).field_V.field_V.field_m[var9] = (byte) 0;
                                if (var15 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              } else {
                                break L34;
                              }
                            }
                          }
                        }
                        if (((le) this).field_V.field_V.field_m[var9] != 0) {
                          break L34;
                        } else {
                          if (var11.field_m[var10 + var13] == 0) {
                            break L34;
                          } else {
                            if (var11.field_m[-((le) this).field_V.field_hb + var10] == 0) {
                              break L34;
                            } else {
                              if (var11.field_m[var10] != -1) {
                                ((le) this).field_V.field_V.field_m[var9] = var11.field_m[var10];
                                break L34;
                              } else {
                                break L34;
                              }
                            }
                          }
                        }
                      }
                      L36: {
                        L37: {
                          var9 = var9 + ((le) this).field_V.field_y;
                          if (var11.field_m[var10] != 0) {
                            break L37;
                          } else {
                            if (0 != var11.field_m[var10 - -var13]) {
                              break L36;
                            } else {
                              if (var11.field_m[((le) this).field_V.field_hb + var10] == 0) {
                                ((le) this).field_V.field_V.field_m[var9] = (byte) 0;
                                if (var15 == 0) {
                                  break L36;
                                } else {
                                  break L37;
                                }
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                        if (((le) this).field_V.field_V.field_m[var9] != 0) {
                          break L36;
                        } else {
                          if (var11.field_m[var10 - -var13] == 0) {
                            break L36;
                          } else {
                            if (var11.field_m[var10 + ((le) this).field_V.field_hb] == 0) {
                              break L36;
                            } else {
                              if (var11.field_m[var10] != -1) {
                                ((le) this).field_V.field_V.field_m[var9] = var11.field_m[var10];
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                      }
                      var10 = var10 + ((le) this).field_V.field_hb;
                      var9 = var9 + ((le) this).field_V.field_y;
                      var14 += 2;
                      if (var15 == 0) {
                        continue L33;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
              } else {
                break L29;
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, wk param1) {
        RuntimeException runtimeException = null;
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
        try {
          L0: {
            L1: {
              if (param0 == 5158) {
                break L1;
              } else {
                this.d((byte) 118);
                break L1;
              }
            }
            L2: {
              if (((le) this).field_k) {
                break L2;
              } else {
                ((le) this).field_V.a((byte) 88, ((le) this).field_w);
                break L2;
              }
            }
            L3: {
              L4: {
                ((le) this).field_w.t(-111);
                int discarded$11 = ((le) this).field_w.e((byte) 72);
                ((le) this).field_w.f((byte) -20);
                if (((le) this).field_k) {
                  break L4;
                } else {
                  this.b(0);
                  if (!ArcanistsMulti.field_G) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              bk.a(2);
              break L3;
            }
            ((le) this).field_o = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("le.KA(").append(param0).append(44);
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    private final void a(byte param0, wk param1) {
        try {
            ((le) this).field_w.e(true);
            if (!(((le) this).field_k)) {
                ((le) this).field_V.e(true);
                ((le) this).field_z = 0;
            }
            if (param0 <= 11) {
                ((le) this).field_s = 97;
            }
            ((le) this).field_o = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "le.CA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void c(int param0) {
        vn var2 = null;
        ml var3 = null;
        vn var4 = null;
        mi var5 = null;
        int var6 = 0;
        boolean stackIn_3_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_23_0 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_33_0 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_8_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_22_0 = 0;
        boolean stackOut_26_0 = false;
        int stackOut_32_0 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = ((le) this).field_V.g((byte) 68);
        var3 = (ml) (Object) var2.b(12623);
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  stackOut_2_0 = var3.i(-52);
                  stackIn_9_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    if (stackIn_3_0) {
                      ((le) this).field_m.a(-105, var3);
                      return;
                    } else {
                      var3 = (ml) (Object) var2.a(0);
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              if (((le) this).field_m.field_h == null) {
                break L1;
              } else {
                stackOut_8_0 = ((le) this).field_m.field_h.d(6);
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
            }
            if (!stackIn_9_0) {
              break L1;
            } else {
              return;
            }
          }
          var4 = ((le) this).field_V.e(2);
          var5 = (mi) (Object) var4.b(12623);
          L4: while (true) {
            L5: {
              L6: {
                if (var5 == null) {
                  break L6;
                } else {
                  stackOut_13_0 = var5.d(6);
                  stackIn_23_0 = stackOut_13_0 ? 1 : 0;
                  stackIn_14_0 = stackOut_13_0;
                  if (var6 != 0) {
                    break L5;
                  } else {
                    if (stackIn_14_0) {
                      ((le) this).field_m.a(var5, -126);
                      return;
                    } else {
                      var5 = (mi) (Object) var4.a(0);
                      if (var6 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              L7: {
                if (null == ((le) this).field_m.field_d) {
                  break L7;
                } else {
                  if (((le) this).field_m.field_d.f(true)) {
                    return;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = (ml) (Object) var2.b(12623);
              stackOut_22_0 = -7775;
              stackIn_23_0 = stackOut_22_0;
              break L5;
            }
            L8: {
              if (stackIn_23_0 == -7775) {
                break L8;
              } else {
                ((le) this).field_j = 56;
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                L11: {
                  L12: {
                    if (var3 == null) {
                      break L12;
                    } else {
                      stackOut_26_0 = var3.f(true);
                      stackIn_33_0 = stackOut_26_0 ? 1 : 0;
                      stackIn_27_0 = stackOut_26_0;
                      if (var6 != 0) {
                        break L11;
                      } else {
                        if (stackIn_27_0) {
                          ((le) this).field_m.a(-116, var3);
                          return;
                        } else {
                          var3 = (ml) (Object) var2.a(0);
                          if (var6 == 0) {
                            continue L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  if (((le) this).field_m.field_d == null) {
                    break L10;
                  } else {
                    stackOut_32_0 = ~((le) this).field_m.field_d.y(17571);
                    stackIn_33_0 = stackOut_32_0;
                    break L11;
                  }
                }
                if (stackIn_33_0 == ~((le) this).field_V.d(false)) {
                  return;
                } else {
                  break L10;
                }
              }
              return;
            }
          }
        }
    }

    private final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          if (re.field_r != 1) {
            break L0;
          } else {
            if (-3 == mf.field_g) {
              L1: {
                if (ao.field_d) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              ao.field_d = stackIn_6_0 != 0;
              if (!ao.field_d) {
                break L0;
              } else {
                vh.field_t = 0;
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L2: {
          L3: {
            var2 = n.field_g.field_nb;
            if (((le) this).field_I >= 0) {
              break L3;
            } else {
              if (ao.field_d) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                break L3;
              }
            }
          }
          stackOut_11_0 = 1;
          stackIn_13_0 = stackOut_11_0;
          break L2;
        }
        L4: {
          L5: {
            L6: {
              var3 = stackIn_13_0;
              if (ri.field_b[96]) {
                break L6;
              } else {
                if (var3 == 0) {
                  break L5;
                } else {
                  if (!ri.field_b[p.field_a]) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            if (-16 >= ((le) this).field_n) {
              break L5;
            } else {
              ((le) this).field_m.a(0);
              ((le) this).field_n = ((le) this).field_n - 2;
              ((le) this).field_t = true;
              if (var8 == 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          if (((le) this).field_n >= 0) {
            break L4;
          } else {
            ((le) this).field_n = ((le) this).field_n + 1;
            break L4;
          }
        }
        L7: {
          L8: {
            L9: {
              if (ri.field_b[97]) {
                break L9;
              } else {
                if (var3 == 0) {
                  break L8;
                } else {
                  if (!ri.field_b[qo.field_b]) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
            }
            if (((le) this).field_n >= 16) {
              break L8;
            } else {
              ((le) this).field_m.a(0);
              ((le) this).field_n = ((le) this).field_n + 2;
              ((le) this).field_t = true;
              if (var8 == 0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          if (0 < ((le) this).field_n) {
            ((le) this).field_n = ((le) this).field_n - 1;
            break L7;
          } else {
            break L7;
          }
        }
        L10: {
          L11: {
            L12: {
              L13: {
                if (ri.field_b[98]) {
                  break L13;
                } else {
                  if (var3 == 0) {
                    break L12;
                  } else {
                    if (!ri.field_b[fi.field_e]) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
              }
              if (-16 < ((le) this).field_S) {
                break L11;
              } else {
                break L12;
              }
            }
            if (((le) this).field_S >= 0) {
              break L10;
            } else {
              ((le) this).field_S = ((le) this).field_S + 1;
              if (var8 == 0) {
                break L10;
              } else {
                break L11;
              }
            }
          }
          ((le) this).field_m.a(0);
          ((le) this).field_S = ((le) this).field_S - 2;
          ((le) this).field_t = true;
          break L10;
        }
        L14: {
          L15: {
            L16: {
              L17: {
                if (ri.field_b[99]) {
                  break L17;
                } else {
                  if (var3 == 0) {
                    break L16;
                  } else {
                    if (!ri.field_b[cm.field_j]) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              if (16 > ((le) this).field_S) {
                break L15;
              } else {
                break L16;
              }
            }
            if (((le) this).field_S > 0) {
              ((le) this).field_S = ((le) this).field_S - 1;
              if (var8 == 0) {
                break L14;
              } else {
                break L15;
              }
            } else {
              break L14;
            }
          }
          ((le) this).field_m.a(0);
          ((le) this).field_t = true;
          ((le) this).field_S = ((le) this).field_S + 2;
          break L14;
        }
        L18: {
          L19: {
            ol.field_g = ol.field_g + ((le) this).field_S;
            vn.field_c = vn.field_c + ((le) this).field_n;
            if (eb.field_b != null) {
              break L19;
            } else {
              L20: {
                if (((le) this).field_V.a(true)) {
                  break L20;
                } else {
                  if (((le) this).field_V.c((byte) 89)) {
                    break L20;
                  } else {
                    ((le) this).field_M = 15 * ((le) this).field_M >> 4;
                    if (var8 == 0) {
                      break L18;
                    } else {
                      break L20;
                    }
                  }
                }
              }
              ((le) this).field_M = 2000;
              if (var8 == 0) {
                break L18;
              } else {
                break L19;
              }
            }
          }
          ((le) this).field_M = 2000;
          break L18;
        }
        L21: {
          var4 = 0;
          if (((le) this).field_V.c((byte) 89)) {
            break L21;
          } else {
            if (((le) this).field_V.k(-45)) {
              break L21;
            } else {
              L22: {
                L23: {
                  if (ef.field_r) {
                    break L23;
                  } else {
                    if (!pn.a((byte) 110)) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                if (!((le) this).field_ab) {
                  break L22;
                } else {
                  break L21;
                }
              }
              L24: {
                var5 = ((le) this).field_V.field_y >> ((le) this).field_K;
                var6 = ((le) this).field_V.field_H >> ((le) this).field_K;
                var7 = an.field_j;
                if (~(var5 + 648) < ~an.field_f) {
                  var7 = var2;
                  break L24;
                } else {
                  break L24;
                }
              }
              L25: {
                if (~an.field_g > ~(-8 + -var5 + an.field_f)) {
                  break L25;
                } else {
                  if (me.field_I < -8 + (-var6 + var7)) {
                    break L25;
                  } else {
                    if (~me.field_I <= ~var7) {
                      break L25;
                    } else {
                      L26: {
                        if (wk.field_m != 1) {
                          break L26;
                        } else {
                          vn.field_c = 4 - an.field_f + (var5 + an.field_g) << ((le) this).field_K;
                          ((le) this).field_t = true;
                          ol.field_g = me.field_I - (-4 + -var6) - var7 << ((le) this).field_K;
                          break L26;
                        }
                      }
                      ((le) this).field_u = 0;
                      var4 = 1;
                      if (var8 == 0) {
                        break L21;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
              }
              if (1 != wk.field_m) {
                break L21;
              } else {
                ((le) this).field_K = 4;
                break L21;
              }
            }
          }
        }
        L27: {
          L28: {
            L29: {
              L30: {
                var5 = -var2 / 2;
                var6 = 64 + -(var2 / 2) + ((le) this).field_V.field_H;
                this.a(var6, var5, true);
                if (((le) this).field_V.d(false) != ((le) this).field_I) {
                  break L30;
                } else {
                  if (((le) this).field_z > 1) {
                    break L29;
                  } else {
                    break L30;
                  }
                }
              }
              if (((le) this).field_ab) {
                break L28;
              } else {
                break L29;
              }
            }
            if (((le) this).field_V.a(true)) {
              break L28;
            } else {
              L31: {
                if (!((le) this).field_ab) {
                  break L31;
                } else {
                  if (pn.a((byte) -51)) {
                    break L28;
                  } else {
                    if (ef.field_r) {
                      break L28;
                    } else {
                      break L31;
                    }
                  }
                }
              }
              if (((le) this).field_V.n(4)) {
                break L28;
              } else {
                this.a(var4 != 0, (byte) 10);
                if (var8 == 0) {
                  break L27;
                } else {
                  break L28;
                }
              }
            }
          }
          eb.field_b = null;
          ti.field_N = -1;
          break L27;
        }
        L32: {
          if (!((le) this).field_V.c((byte) 89)) {
            break L32;
          } else {
            ((le) this).field_K = 4;
            break L32;
          }
        }
    }

    private final int a(int param0, byte param1, int param2) {
        ml var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        String var8 = null;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (param1 == -3) {
            break L0;
          } else {
            boolean discarded$1 = this.r(122);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = ((le) this).field_V.a(param2, true);
            if (var4 == null) {
              break L2;
            } else {
              if (0 < ((((le) this).field_J | ((le) this).field_a) & 1 << var4.y(17571))) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (0 == param2) {
              break L3;
            } else {
              if (!qg.a(-113)) {
                break L3;
              } else {
                if (rm.field_k == 6) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
          }
          L4: {
            L5: {
              var5 = 16777215;
              var8 = ((le) this).field_V.field_k[param2];
              var6 = var8;
              if ((1 << param2 & ((le) this).field_J) > 0) {
                break L5;
              } else {
                L6: {
                  if (0 >= (1 << param2 & ((le) this).field_a)) {
                    break L6;
                  } else {
                    var6 = tj.a(param1 + -14, new String[1], cn.field_Q);
                    if (var7 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
                var6 = tj.a(122, new String[1], jl.field_i);
                if (var7 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if ((1 << param2 & ((le) this).field_a) > 0) {
                break L7;
              } else {
                var6 = tj.a(param1 + 116, new String[1], lc.field_a);
                if (var7 == 0) {
                  break L4;
                } else {
                  break L7;
                }
              }
            }
            var6 = tj.a(param1 ^ -124, new String[1], qc.field_g);
            break L4;
          }
          mi.field_B.a(var6, 3, mi.field_B.field_C / 2 + (param0 - -8), 15790320 ^ (var5 | 15790320), 0);
          mi.field_B.a(var6, 4, 8 + param0 + (mi.field_B.field_C / 2 - 1), 15790320 ^ (var5 | 15790320), 0);
          mi.field_B.a(var6, 4, mi.field_B.field_C / 2 + (8 + param0), var5, -1);
          param0 += 18;
          break L1;
        }
        return param0;
    }

    private final void a(int param0, byte param1, ml param2, int param3) {
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
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -82) {
                break L1;
              } else {
                boolean discarded$1 = this.j(-127);
                break L1;
              }
            }
            L2: {
              var5_int = n.field_g.field_nb;
              var6 = param2.f(-99);
              var7 = param2.i((byte) 120);
              var8 = param2.p(-8323);
              var9 = -var6 + param3;
              var10 = param0 - var7 - -(var8 >> 1);
              var11 = (int)Math.sqrt((double)(var10 * var10 + var9 * var9));
              if (var11 != 0) {
                break L2;
              } else {
                var11 = 1;
                var10 = -1;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((le) this).field_V.a(true)) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      if (var9 > 0) {
                        break L6;
                      } else {
                        param2.field_E = -1;
                        if (var18 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    param2.field_E = 1;
                    break L5;
                  }
                  L7: {
                    L8: {
                      if (ti.field_N == 127) {
                        break L8;
                      } else {
                        if (ti.field_N == 128) {
                          break L8;
                        } else {
                          if (ti.field_N == 129) {
                            break L8;
                          } else {
                            if (ti.field_N != 136) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    if (~Math.abs(var9) > ~Math.abs(var10)) {
                      L9: {
                        L10: {
                          var9 = 64 * param2.field_E;
                          if (var10 >= 0) {
                            break L10;
                          } else {
                            var10 = -64;
                            if (var18 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var10 = 64;
                        break L9;
                      }
                      var11 = (int)Math.sqrt((double)(var9 * var9 - -(var10 * var10)));
                      if (0 == var11) {
                        var11 = 1;
                        var10 = -1;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  var12 = var8 / 2;
                  if (((le) this).field_u < 100) {
                    var15 = 0;
                    L11: while (true) {
                      if (var15 >= ((le) this).field_u) {
                        break L4;
                      } else {
                        var16 = var15 + var12;
                        var14 = var16 * var10 / var11 + -var12;
                        var13 = var9 * var16 / var11;
                        var17 = 0;
                        if (var18 != 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L12: {
                            L13: {
                              if (25 > var15) {
                                break L13;
                              } else {
                                L14: {
                                  var17 = var17 | 16711680;
                                  if (var15 < 75) {
                                    break L14;
                                  } else {
                                    L15: {
                                      var17 = var17 | 65280;
                                      if (var15 < 100) {
                                        break L15;
                                      } else {
                                        var17 = var17 | 255;
                                        if (var18 == 0) {
                                          break L12;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var17 = var17 | -750 + 10 * var15 & 255;
                                    if (var18 == 0) {
                                      break L12;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var17 = var17 | ((var15 + -25) * 5 & 255) << 8;
                                if (var18 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            var17 = var17 | (255 & var15 * 10) << 16;
                            break L12;
                          }
                          L16: {
                            L17: {
                              if (var15 <= 25) {
                                break L17;
                              } else {
                                de.i(-vn.field_c + var13 + var6 - -(an.field_f >> 1), (var5_int >> 1) + (-ol.field_g + (var14 + var7)), 1600 / (200 - var15 * 100 / 100), var17);
                                if (var18 == 0) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            de.c(-vn.field_c + var13 + (var6 + (an.field_f >> 1)), -ol.field_g + var7 + (var14 - -(var5_int >> 1)), 1600 / (200 - 100 * var15 / 100), var17, 10 * var15);
                            break L16;
                          }
                          var15++;
                          if (var18 == 0) {
                            continue L11;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              break L3;
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var5;
            stackOut_41_1 = new StringBuilder().append("le.HB(").append(param0).append(44).append(param1).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L18;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param3 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean r(int param0) {
        if (param0 >= -26) {
            return false;
        }
        return !((le) this).field_V.d((byte) -128) ? true : false;
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        ml var4_ref_ml = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        rb var9 = null;
        rb var10 = null;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (((le) this).field_V.d(false) >= 0) {
            break L0;
          } else {
            if (!((le) this).field_V.n(4)) {
              param1 = false;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          ((le) this).field_o = false;
          if (ef.field_r) {
            break L1;
          } else {
            if (!pn.a((byte) 111)) {
              L2: {
                if (ri.field_b[69]) {
                  break L2;
                } else {
                  if (ri.field_b[ao.field_f]) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ((le) this).field_t = false;
              ((le) this).field_m.a(-96, ((le) this).field_V.a(((le) this).field_bb, true));
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          if (0 >= ((le) this).field_V.field_G) {
            break L3;
          } else {
            ((le) this).field_V.field_G = ((le) this).field_V.field_G - 1;
            break L3;
          }
        }
        L4: {
          vl.a(128);
          if (((le) this).field_Z <= 0) {
            break L4;
          } else {
            ((le) this).field_Z = ((le) this).field_Z - 1;
            break L4;
          }
        }
        L5: {
          L6: {
            if (an.field_g < 0) {
              break L6;
            } else {
              if (me.field_I < 0) {
                break L6;
              } else {
                if (~an.field_f < ~an.field_g) {
                  break L5;
                } else {
                  if (~me.field_I > ~an.field_j) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
          }
          ti.field_N = -1;
          break L5;
        }
        L7: {
          ((le) this).field_P = ((le) this).field_P + 1;
          if (0 <= ((le) this).field_Z) {
            break L7;
          } else {
            ((le) this).field_Z = ((le) this).field_Z + 1;
            break L7;
          }
        }
        L8: {
          if (256 > ((le) this).field_P) {
            break L8;
          } else {
            ((le) this).field_P = ((le) this).field_P - 256;
            break L8;
          }
        }
        L9: {
          ((le) this).field_j = ((le) this).field_j + 1;
          if (((le) this).field_j <= g.field_a.field_n * 2) {
            break L9;
          } else {
            ((le) this).field_j = ((le) this).field_j - g.field_a.field_n * 2;
            break L9;
          }
        }
        L10: {
          L11: {
            var3 = 0;
            e.g((byte) -49);
            if (dm.h((byte) 97)) {
              break L11;
            } else {
              var3 = 1;
              if (var7 == 0) {
                break L10;
              } else {
                break L11;
              }
            }
          }
          this.c((byte) -106);
          if (((le) this).field_V.c((byte) 89)) {
            break L10;
          } else {
            if (!((le) this).field_V.n(4)) {
              break L10;
            } else {
              if (mn.field_r == 3) {
                break L10;
              } else {
                if (-5 == mn.field_r) {
                  break L10;
                } else {
                  if (((le) this).field_V.d(1)) {
                    L12: {
                      L13: {
                        L14: {
                          var4 = ((le) this).field_V.d(false);
                          if (ob.field_Y == null) {
                            break L14;
                          } else {
                            if (ob.field_Y.field_l) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (an.field_f > 640) {
                          break L13;
                        } else {
                          if (an.field_j <= 480) {
                            stackOut_42_0 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      stackOut_41_0 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      break L12;
                    }
                    L15: {
                      var5 = stackIn_43_0;
                      if (var4 < 0) {
                        break L15;
                      } else {
                        if (((le) this).field_I < 0) {
                          break L15;
                        } else {
                          if (var5 == 0) {
                            break L15;
                          } else {
                            if (((le) this).field_i) {
                              L16: {
                                L17: {
                                  if (!((le) this).field_V.field_d) {
                                    break L17;
                                  } else {
                                    L18: {
                                      if (~(((le) this).field_I & 1) != ~(var4 & 1)) {
                                        stackOut_51_0 = 0;
                                        stackIn_52_0 = stackOut_51_0;
                                        break L18;
                                      } else {
                                        stackOut_50_0 = 1;
                                        stackIn_52_0 = stackOut_50_0;
                                        break L18;
                                      }
                                    }
                                    var6 = stackIn_52_0;
                                    if (var7 == 0) {
                                      break L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                L19: {
                                  if (((le) this).field_I != var4) {
                                    stackOut_55_0 = 0;
                                    stackIn_56_0 = stackOut_55_0;
                                    break L19;
                                  } else {
                                    stackOut_54_0 = 1;
                                    stackIn_56_0 = stackOut_54_0;
                                    break L19;
                                  }
                                }
                                var6 = stackIn_56_0;
                                break L16;
                              }
                              L20: {
                                if ((((le) this).field_J & 1 << ((le) this).field_I) == 0) {
                                  break L20;
                                } else {
                                  var6 = 0;
                                  break L20;
                                }
                              }
                              if (var6 == 0) {
                                break L15;
                              } else {
                                this.a((byte) 79, 56, 199);
                                break L15;
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    gj.a(true, true, 3, mn.field_r);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
        }
        L21: {
          this.c(-7775);
          if (!((le) this).field_t) {
            this.e(17608);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          if (((le) this).field_I <= 0) {
            break L22;
          } else {
            L23: {
              if (ri.field_b[69]) {
                break L23;
              } else {
                if (ri.field_b[ao.field_f]) {
                  break L23;
                } else {
                  if (ri.field_b[ig.field_g]) {
                    break L23;
                  } else {
                    if (ri.field_b[im.field_g]) {
                      break L23;
                    } else {
                      if (ri.field_b[84]) {
                        break L23;
                      } else {
                        if (ri.field_b[82]) {
                          break L23;
                        } else {
                          if (ri.field_b[81]) {
                            break L23;
                          } else {
                            if (ri.field_b[ko.field_k]) {
                              break L23;
                            } else {
                              if (ri.field_b[ud.field_w]) {
                                break L23;
                              } else {
                                if (ri.field_b[85]) {
                                  break L23;
                                } else {
                                  break L22;
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
            var9 = (rb) (Object) pb.field_m.b(12623);
            var10 = var9;
            ((le) this).field_K = 4;
            ((le) this).field_M = 2000;
            if (var10 == null) {
              break L22;
            } else {
              var10.field_i = false;
              break L22;
            }
          }
        }
        L24: {
          if (((le) this).field_V.c((byte) 89)) {
            break L24;
          } else {
            if (!((le) this).field_V.k(103)) {
              L25: {
                if (((le) this).field_C) {
                  L26: {
                    L27: {
                      ((le) this).field_C = false;
                      ((le) this).field_V.f((byte) -20);
                      ((le) this).field_bb = ((le) this).field_V.d(false);
                      var4_ref_ml = ((le) this).field_V.a(((le) this).field_bb, param0);
                      if (var4_ref_ml != null) {
                        break L27;
                      } else {
                        ((le) this).field_m.a(0);
                        if (var7 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    ((le) this).field_m.a(-89, var4_ref_ml);
                    break L26;
                  }
                  ((le) this).field_t = false;
                  ((le) this).field_s = -1000;
                  break L25;
                } else {
                  break L25;
                }
              }
              if (((le) this).field_w == null) {
                if (!((le) this).field_F) {
                  L28: {
                    ((le) this).field_F = true;
                    ((le) this).field_V.f((byte) -20);
                    if (((le) this).field_ab) {
                      break L28;
                    } else {
                      if (((le) this).field_V.b(((le) this).field_J, -93)) {
                        L29: {
                          if (!qg.a(-102)) {
                            break L29;
                          } else {
                            mh.i((byte) 74);
                            if (var7 == 0) {
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        gj.a(false, true, -1, mn.field_r);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                  if (((le) this).field_ab) {
                    break L24;
                  } else {
                    if (5 != mj.field_p) {
                      break L24;
                    } else {
                      wk.j(13805);
                      break L24;
                    }
                  }
                } else {
                  break L24;
                }
              } else {
                break L24;
              }
            } else {
              break L24;
            }
          }
        }
        L30: {
          if (mj.field_p != 6) {
            break L30;
          } else {
            L31: {
              if (rm.field_k < 5) {
                break L31;
              } else {
                ((le) this).field_G = true;
                if (var7 == 0) {
                  break L30;
                } else {
                  break L31;
                }
              }
            }
            ((le) this).field_G = false;
            break L30;
          }
        }
        L32: {
          if (!((le) this).field_V.a(param0)) {
            break L32;
          } else {
            if (((le) this).field_V.c((byte) 89)) {
              break L32;
            } else {
              if (((le) this).field_V.n(4)) {
                break L32;
              } else {
                if (((le) this).field_V.k(-127)) {
                  break L32;
                } else {
                  if (var3 != 0) {
                    break L32;
                  } else {
                    if (!pb.field_m.b(true)) {
                      break L32;
                    } else {
                      if (((le) this).field_ab) {
                        break L32;
                      } else {
                        L33: {
                          if (((le) this).field_y) {
                            break L33;
                          } else {
                            L34: {
                              if (!qg.a(-96)) {
                                break L34;
                              } else {
                                ik.b(0);
                                break L34;
                              }
                            }
                            this.c(false);
                            if (var7 == 0) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                        L35: {
                          ((le) this).field_t = false;
                          this.c(false);
                          if (mj.field_p != 6) {
                            break L35;
                          } else {
                            if (((le) this).field_V.d(false) == 0) {
                              break L35;
                            } else {
                              hj.a(-20602);
                              if (var7 == 0) {
                                break L32;
                              } else {
                                break L35;
                              }
                            }
                          }
                        }
                        ((le) this).field_V.a(((le) this).field_V.d(false), 157, (byte) 36, 0, 0, 0, 0, ((le) this).field_V.d(false), 0);
                        break L32;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L36: {
          var4 = n.field_g.field_nb;
          var5 = -var4 / 2;
          var6 = ((le) this).field_V.field_H - var4 / 2 - -64;
          this.a(var6, var5, param0);
          if (!param1) {
            break L36;
          } else {
            this.n(0);
            break L36;
          }
        }
        L37: {
          this.d((byte) 83);
          int fieldTemp$3 = ((le) this).field_x - 1;
          ((le) this).field_x = ((le) this).field_x - 1;
          if (fieldTemp$3 <= 0) {
            L38: {
              if (~((le) this).field_W == ~((le) this).field_V.n((byte) -75)) {
                ob.a(20, ((le) this).field_f, ((le) this).field_W);
                break L38;
              } else {
                break L38;
              }
            }
            ((le) this).field_x = 50;
            break L37;
          } else {
            break L37;
          }
        }
        L39: {
          L40: {
            if (((le) this).field_ab) {
              break L40;
            } else {
              L41: {
                if (((le) this).field_y) {
                  ((le) this).field_z = ((le) this).field_z - 1;
                  break L41;
                } else {
                  break L41;
                }
              }
              if (0 == ((le) this).field_z) {
                this.d(false);
                if (var7 == 0) {
                  break L39;
                } else {
                  break L40;
                }
              } else {
                break L39;
              }
            }
          }
          if (((le) this).field_z <= 1) {
            break L39;
          } else {
            ((le) this).field_z = ((le) this).field_z - 1;
            if (((le) this).field_z != 1) {
              break L39;
            } else {
              L42: {
                if (((le) this).field_h > 0) {
                  this.i(2000);
                  break L42;
                } else {
                  break L42;
                }
              }
              if (((le) this).field_V.a(true)) {
                break L39;
              } else {
                if (((le) this).field_V.d(false) == ((le) this).field_I) {
                  this.a(-113);
                  break L39;
                } else {
                  break L39;
                }
              }
            }
          }
        }
        L43: {
          if (null == b.field_a.b(12623)) {
            break L43;
          } else {
            int fieldTemp$4 = wi.field_h + 1;
            wi.field_h = wi.field_h + 1;
            if (fieldTemp$4 == 335) {
              wi.field_h = 0;
              pg discarded$5 = b.field_a.c(true);
              break L43;
            } else {
              break L43;
            }
          }
        }
    }

    private final void c(byte param0) {
        ((le) this).field_V.a(qg.a(-81), !((le) this).field_t ? ((le) this).field_m : null, 121);
    }

    private final boolean a(wk param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 60) {
              ((le) this).field_L = param0.e((byte) 99);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (68 != param1) {
                if (param1 != 69) {
                  if (70 != param1) {
                    if (71 != param1) {
                      if (param1 != 61) {
                        if (param1 != 65) {
                          if (param1 == 66) {
                            L1: {
                              L2: {
                                if (!this.f(false)) {
                                  break L2;
                                } else {
                                  if (!((le) this).field_cb.b(true)) {
                                    break L2;
                                  } else {
                                    this.c(param0, 105);
                                    if (var6 == 0) {
                                      break L1;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                              this.a(param3, param1, param0, false);
                              break L1;
                            }
                            stackOut_42_0 = 1;
                            stackIn_43_0 = stackOut_42_0;
                            return stackIn_43_0 != 0;
                          } else {
                            if (param1 != 63) {
                              if (param1 == 64) {
                                L3: {
                                  L4: {
                                    if (!this.f(-128)) {
                                      break L4;
                                    } else {
                                      if (!((le) this).field_cb.b(true)) {
                                        break L4;
                                      } else {
                                        this.a((byte) 59, param0);
                                        if (var6 == 0) {
                                          break L3;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                  }
                                  this.a(param3, param1, param0, false);
                                  break L3;
                                }
                                stackOut_59_0 = 1;
                                stackIn_60_0 = stackOut_59_0;
                                return stackIn_60_0 != 0;
                              } else {
                                if (param1 != 62) {
                                  if (67 != param1) {
                                    if (param2 == 0) {
                                      stackOut_80_0 = 0;
                                      stackIn_81_0 = stackOut_80_0;
                                      break L0;
                                    } else {
                                      ((le) this).field_O = true;
                                      return false;
                                    }
                                  } else {
                                    L5: {
                                      L6: {
                                        L7: {
                                          if (!this.b(false)) {
                                            break L7;
                                          } else {
                                            if (((le) this).field_cb.b(true)) {
                                              break L6;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        this.a(param3, param1, param0, false);
                                        if (var6 == 0) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                      this.b(param0, -1);
                                      break L5;
                                    }
                                    stackOut_76_0 = 1;
                                    stackIn_77_0 = stackOut_76_0;
                                    return stackIn_77_0 != 0;
                                  }
                                } else {
                                  L8: {
                                    L9: {
                                      if (!this.j(param2 + -27726)) {
                                        break L9;
                                      } else {
                                        if (!((le) this).field_cb.b(true)) {
                                          break L9;
                                        } else {
                                          this.a(param0, 0, 8888);
                                          if (var6 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    this.a(param3, param1, param0, false);
                                    break L8;
                                  }
                                  stackOut_67_0 = 1;
                                  stackIn_68_0 = stackOut_67_0;
                                  return stackIn_68_0 != 0;
                                }
                              }
                            } else {
                              L10: {
                                L11: {
                                  if (!this.l(-8712)) {
                                    break L11;
                                  } else {
                                    if (!((le) this).field_cb.b(true)) {
                                      break L11;
                                    } else {
                                      this.b(33, param0);
                                      if (var6 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                this.a(param3, param1, param0, false);
                                break L10;
                              }
                              stackOut_50_0 = 1;
                              stackIn_51_0 = stackOut_50_0;
                              return stackIn_51_0 != 0;
                            }
                          }
                        } else {
                          L12: {
                            L13: {
                              L14: {
                                if (!this.e(true)) {
                                  break L14;
                                } else {
                                  if (((le) this).field_cb.b(true)) {
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              this.a(param3, param1, param0, false);
                              if (var6 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                            this.a(param0, -122);
                            break L12;
                          }
                          stackOut_33_0 = 1;
                          stackIn_34_0 = stackOut_33_0;
                          return stackIn_34_0 != 0;
                        }
                      } else {
                        L15: {
                          L16: {
                            L17: {
                              if (!this.b((byte) -116)) {
                                break L17;
                              } else {
                                if (((le) this).field_cb.b(true)) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            this.a(param3, param1, param0, false);
                            if (var6 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                          this.a(5158, param0);
                          break L15;
                        }
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      }
                    } else {
                      ((le) this).field_a = param0.e((byte) -86);
                      jk.a((byte) 121);
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    }
                  } else {
                    ((le) this).field_b = param0.e((byte) 48);
                    jk.a((byte) 121);
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  ((le) this).field_J = param0.e((byte) 80);
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              } else {
                ((le) this).field_D = param0.e((byte) -90);
                jg.a(-3);
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) var5;
            stackOut_82_1 = new StringBuilder().append("le.V(");
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param0 == null) {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L18;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_85_0, stackIn_85_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_81_0 != 0;
    }

    final static boolean a(byte param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var1 = qj.b(-26572);
        if (param0 > 67) {
          var3 = -mh.field_K + var1;
          if (30000L >= var3) {
            L0: {
              L1: {
                var5 = 3000;
                if (7 <= ik.field_b) {
                  break L1;
                } else {
                  L2: {
                    if (ik.field_b < 5) {
                      break L2;
                    } else {
                      var5 = 9000;
                      if (var6 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (ik.field_b < 3) {
                    break L0;
                  } else {
                    var5 = 6000;
                    if (var6 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5 = 12000;
              break L0;
            }
            if (~(long)var5 > ~var3) {
              ik.field_b = ik.field_b + 1;
              mh.field_K = var1;
              return true;
            } else {
              return false;
            }
          } else {
            mh.field_K = var1;
            ik.field_b = 0;
            return true;
          }
        } else {
          return true;
        }
    }

    private final void d(boolean param0) {
        ((le) this).a(0, 0, 0, 0, 0, 0, -1, -118);
        ((le) this).field_V.e(true);
    }

    private final void a(byte param0, int param1, int param2) {
        if (!(!wi.a(param1, ad.field_f, param0 ^ 79))) {
            return;
        }
        int[] var6 = ad.field_f;
        int[] var4 = var6;
        int var5 = param1;
        var6[var5 >> 5] = fj.b(var6[var5 >> 5], 1 << dg.a(var5, 31));
        if (param0 != 79) {
            ((le) this).field_O = false;
        }
        b.field_a.b((pg) (Object) new qa(param1), -1);
        if (!((le) this).field_U) {
            wh.field_h.b((pg) (Object) new cm(param1, 199, 0, 0, 0, 0), param0 + -80);
        }
    }

    private final void a(wk param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -110) {
                break L1;
              } else {
                ((le) this).field_r = -122;
                break L1;
              }
            }
            L2: {
              var3_int = param0.e((byte) -99);
              if (!((le) this).field_k) {
                ((le) this).field_V.a((byte) 106, ((le) this).field_w);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                ((le) this).field_w.b((byte) 88, var3_int);
                int discarded$12 = ((le) this).field_w.e((byte) 72);
                if (((le) this).field_k) {
                  break L4;
                } else {
                  ((le) this).field_V.b((byte) 88, var3_int);
                  if (!ArcanistsMulti.field_G) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              bk.a(2);
              break L3;
            }
            ((le) this).field_o = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("le.RA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        ml var7_ref_ml = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_52_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_162_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          var3 = n.field_g.field_nb;
          var4 = an.field_g - (-vn.field_c + (an.field_f >> 1));
          var5 = -(var3 >> 1) + me.field_I + ol.field_g;
          if (((le) this).field_u > 0) {
            var4 = ((le) this).field_e;
            var5 = ((le) this).field_c;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (ti.field_N != 78) {
            break L1;
          } else {
            var5 += 64;
            break L1;
          }
        }
        L2: {
          L3: {
            L4: {
              var6 = ((le) this).field_V.a(((le) this).field_bb, true);
              if (var6 == null) {
                break L4;
              } else {
                if (var6.m(-20357) <= 0) {
                  break L4;
                } else {
                  if (var6 != null) {
                    break L2;
                  } else {
                    if (!((le) this).field_ab) {
                      break L2;
                    } else {
                      if (!((le) this).field_V.a(true)) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              var6 = ((le) this).field_V.a(((le) this).field_V.d(false), true);
              if (var6 == null) {
                break L5;
              } else {
                ((le) this).field_bb = var6.y(17571);
                break L5;
              }
            }
            if (var6 != null) {
              break L2;
            } else {
              if (!((le) this).field_ab) {
                break L2;
              } else {
                if (!((le) this).field_V.a(true)) {
                  break L3;
                } else {
                  break L2;
                }
              }
            }
          }
          this.a(36);
          break L2;
        }
        L6: {
          if (var6 == null) {
            break L6;
          } else {
            if (var6.w(24501) != null) {
              break L6;
            } else {
              if (~var6.y(17571) != ~((le) this).field_V.d(false)) {
                var6 = this.q(10781);
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
        L7: {
          if (var6 == null) {
            break L7;
          } else {
            if (var6.w(24501) == null) {
              break L7;
            } else {
              if (37 == var6.o(-22625)) {
                break L7;
              } else {
                var7_ref_ml = ((le) this).field_V.a(((le) this).field_V.d(false), true);
                if (var7_ref_ml == null) {
                  break L7;
                } else {
                  if (~var7_ref_ml.i((byte) -32) >= ~((le) this).field_V.field_H) {
                    break L7;
                  } else {
                    var6 = this.q(10781);
                    break L7;
                  }
                }
              }
            }
          }
        }
        L8: {
          if (var6 == null) {
            break L8;
          } else {
            if (null == var6.w(24501)) {
              break L8;
            } else {
              L9: {
                if (!((le) this).field_V.field_d) {
                  break L9;
                } else {
                  if (~var6.y(17571) == ~((le) this).field_V.d(false)) {
                    break L8;
                  } else {
                    L10: {
                      if (var6.w(24501) == null) {
                        break L10;
                      } else {
                        if (var6.r(-122) == ((le) this).field_V.q((byte) -122)) {
                          break L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var6 = this.q(10781);
                    if (var15 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              if (~var6.g(false) != ~((le) this).field_V.d(false)) {
                var6 = this.q(10781);
                break L8;
              } else {
                break L8;
              }
            }
          }
        }
        L11: {
          L12: {
            L13: {
              if (!((le) this).field_V.c((byte) 89)) {
                break L13;
              } else {
                if (!((le) this).field_V.j(39)) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            if (((le) this).field_V.k(-92)) {
              break L12;
            } else {
              if (((le) this).field_V.g(119)) {
                break L12;
              } else {
                if (1 >= ((le) this).field_z) {
                  break L12;
                } else {
                  L14: {
                    if (!((le) this).field_ab) {
                      break L14;
                    } else {
                      if (pn.a((byte) 127)) {
                        break L12;
                      } else {
                        if (ef.field_r) {
                          break L12;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  stackOut_50_0 = 1;
                  stackIn_52_0 = stackOut_50_0;
                  break L11;
                }
              }
            }
          }
          stackOut_51_0 = 0;
          stackIn_52_0 = stackOut_51_0;
          break L11;
        }
        L15: {
          var7 = stackIn_52_0;
          if (var6 == null) {
            break L15;
          } else {
            L16: {
              if (~var6.i((byte) 121) > ~(128 + ((le) this).field_V.field_H)) {
                break L16;
              } else {
                L17: {
                  L18: {
                    if (var6.m(-20357) <= 0) {
                      break L18;
                    } else {
                      if (null == var6.w(24501)) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  ((le) this).field_bb = ((le) this).field_V.d(false);
                  var6 = ((le) this).field_V.a(((le) this).field_bb, true);
                  eb.field_b = null;
                  ti.field_N = -1;
                  if (var15 == 0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
                if (((le) this).field_ab) {
                  break L16;
                } else {
                  if (!qg.a(-92)) {
                    break L16;
                  } else {
                    if (mj.field_p != 7) {
                      rm.a(var6, true);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                }
              }
            }
            L19: {
              L20: {
                if (var7 == 0) {
                  break L20;
                } else {
                  L21: {
                    if (ri.field_b[ig.field_g]) {
                      break L21;
                    } else {
                      if (!ri.field_b[ko.field_k]) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  stackOut_67_0 = 1;
                  stackIn_69_0 = stackOut_67_0;
                  break L19;
                }
              }
              stackOut_68_0 = 0;
              stackIn_69_0 = stackOut_68_0;
              break L19;
            }
            L22: {
              L23: {
                var8 = stackIn_69_0;
                if (var7 == 0) {
                  break L23;
                } else {
                  L24: {
                    if (ri.field_b[im.field_g]) {
                      break L24;
                    } else {
                      if (!ri.field_b[ud.field_w]) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  stackOut_73_0 = 1;
                  stackIn_75_0 = stackOut_73_0;
                  break L22;
                }
              }
              stackOut_74_0 = 0;
              stackIn_75_0 = stackOut_74_0;
              break L22;
            }
            L25: {
              var9 = stackIn_75_0;
              if (var8 != 0) {
                break L25;
              } else {
                if (var9 != 0) {
                  break L25;
                } else {
                  if (0 < ((le) this).field_h) {
                    this.i(2000);
                    break L25;
                  } else {
                    break L25;
                  }
                }
              }
            }
            if (var7 == 0) {
              break L15;
            } else {
              L26: {
                L27: {
                  if (ri.field_b[69]) {
                    break L27;
                  } else {
                    if (ri.field_b[ao.field_f]) {
                      break L27;
                    } else {
                      ((le) this).field_Y = 0;
                      if (var15 == 0) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                }
                L28: {
                  ((le) this).field_t = false;
                  if (((le) this).field_Y > 0) {
                    break L28;
                  } else {
                    L29: {
                      if (cf.field_h[224] == null) {
                        break L29;
                      } else {
                        fk discarded$5 = ti.a((byte) -30, to.field_r[224], cf.field_h[224]);
                        break L29;
                      }
                    }
                    ((le) this).field_Y = 25;
                    var6 = this.q(10781);
                    if (var6 != null) {
                      break L26;
                    } else {
                      var6 = ((le) this).field_V.a(((le) this).field_V.d(false), true);
                      if (var15 == 0) {
                        break L26;
                      } else {
                        break L28;
                      }
                    }
                  }
                }
                ((le) this).field_Y = ((le) this).field_Y - 1;
                break L26;
              }
              L30: {
                if (!((le) this).field_G) {
                  break L30;
                } else {
                  if (var8 == 0) {
                    break L30;
                  } else {
                    if (0 < ((le) this).field_Z) {
                      break L30;
                    } else {
                      L31: {
                        if (((le) this).field_h == 0) {
                          break L31;
                        } else {
                          if (((le) this).field_R != 0) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                      L32: {
                        L33: {
                          L34: {
                            ((le) this).field_F = true;
                            ((le) this).field_Z = -5;
                            if (0 >= ((le) this).field_h) {
                              break L34;
                            } else {
                              if (((le) this).field_R != 0) {
                                break L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                          if (((le) this).field_h <= 50) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                        this.i(2000);
                        break L32;
                      }
                      ((le) this).field_h = ((le) this).field_h + 1;
                      ((le) this).field_R = 0;
                      var6.c(0, -1);
                      ((le) this).field_m.a(-80, var6);
                      eb.field_b = null;
                      ti.field_N = -1;
                      break L30;
                    }
                  }
                }
              }
              if (!((le) this).field_G) {
                break L15;
              } else {
                if (var9 == 0) {
                  break L15;
                } else {
                  if (((le) this).field_Z < 0) {
                    break L15;
                  } else {
                    L35: {
                      if (((le) this).field_h <= 0) {
                        break L35;
                      } else {
                        if (((le) this).field_R != 1) {
                          break L15;
                        } else {
                          break L35;
                        }
                      }
                    }
                    L36: {
                      L37: {
                        L38: {
                          ((le) this).field_F = true;
                          ((le) this).field_Z = 5;
                          if (((le) this).field_h <= 0) {
                            break L38;
                          } else {
                            if (((le) this).field_R != 1) {
                              break L37;
                            } else {
                              break L38;
                            }
                          }
                        }
                        if (((le) this).field_h <= 50) {
                          break L36;
                        } else {
                          break L37;
                        }
                      }
                      this.i(2000);
                      break L36;
                    }
                    ((le) this).field_R = 1;
                    ((le) this).field_h = ((le) this).field_h + 1;
                    var6.c(0, 1);
                    ((le) this).field_m.a(-100, var6);
                    eb.field_b = null;
                    ti.field_N = -1;
                    break L15;
                  }
                }
              }
            }
          }
        }
        L39: {
          if (var7 != 0) {
            L40: {
              if (re.field_r != 1) {
                break L40;
              } else {
                L41: {
                  if (mf.field_g < 0) {
                    break L41;
                  } else {
                    if (null == lm.field_f) {
                      break L41;
                    } else {
                      if (((le) this).field_V.a(lm.field_f[mf.field_g], true, ((le) this).field_bb)) {
                        L42: {
                          ti.field_N = lm.field_f[mf.field_g];
                          var8 = 9;
                          if (ti.field_N / 12 > 9) {
                            break L42;
                          } else {
                            var8 = ti.field_N / 12;
                            break L42;
                          }
                        }
                        L43: {
                          L44: {
                            if (var8 != 0) {
                              break L44;
                            } else {
                              var8 = 9;
                              if (var15 == 0) {
                                break L43;
                              } else {
                                break L44;
                              }
                            }
                          }
                          var8--;
                          break L43;
                        }
                        L45: {
                          th.field_g[9] = 42;
                          if (null == cf.field_h[th.field_g[var8]]) {
                            break L45;
                          } else {
                            fk discarded$6 = ti.a((byte) -30, to.field_r[th.field_g[var8]], cf.field_h[th.field_g[var8]]);
                            break L45;
                          }
                        }
                        ((le) this).field_s = -1000;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                  }
                }
                L46: {
                  if (mf.field_g != -2) {
                    break L46;
                  } else {
                    L47: {
                      if (hc.field_f) {
                        stackOut_135_0 = 0;
                        stackIn_136_0 = stackOut_135_0;
                        break L47;
                      } else {
                        stackOut_134_0 = 1;
                        stackIn_136_0 = stackOut_134_0;
                        break L47;
                      }
                    }
                    hc.field_f = stackIn_136_0 != 0;
                    break L46;
                  }
                }
                L48: {
                  if (mf.field_g != -4) {
                    break L48;
                  } else {
                    L49: {
                      var8 = 100;
                      if (((le) this).field_V.field_x[((le) this).field_I] != 4) {
                        break L49;
                      } else {
                        var8 = ((le) this).field_V.field_X[((le) this).field_I] / 5 * 5 - -5;
                        if (((le) this).field_V.field_X[((le) this).field_I] <= 0) {
                          break L49;
                        } else {
                          if (~var8 != ~(((le) this).field_V.field_X[((le) this).field_I] + 5)) {
                            break L49;
                          } else {
                            var8 = ((le) this).field_V.field_X[((le) this).field_I];
                            break L49;
                          }
                        }
                      }
                    }
                    if (~((le) this).field_V.field_X[((le) this).field_I] > ~var8) {
                      if (((le) this).field_V.a(((le) this).field_V.d(false), true).m(-20357) <= 20) {
                        break L48;
                      } else {
                        L50: {
                          if (((le) this).field_ab) {
                            int fieldTemp$7 = ((le) this).field_p + 1;
                            ((le) this).field_p = ((le) this).field_p + 1;
                            p.a(((le) this).field_V.n((byte) -75), 0, (byte) 11, 159, 0, 1, ((le) this).field_bb, 0, fieldTemp$7);
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                        ((le) this).field_V.e(((le) this).field_bb, false);
                        break L48;
                      }
                    } else {
                      break L48;
                    }
                  }
                }
                if (mf.field_g >= -1) {
                  break L40;
                } else {
                  ((le) this).field_s = -1000;
                  break L40;
                }
              }
            }
            L51: {
              if (2 != re.field_r) {
                break L51;
              } else {
                ((le) this).field_s = -1000;
                ti.field_N = -1;
                break L51;
              }
            }
            if (((le) this).field_z <= 1) {
              break L39;
            } else {
              if (null != eb.field_b) {
                break L39;
              } else {
                if (var6 == null) {
                  break L39;
                } else {
                  if (param0) {
                    break L39;
                  } else {
                    if (-1 == mf.field_g) {
                      L52: {
                        if (ti.field_N < 0) {
                          stackOut_161_0 = 0;
                          stackIn_162_0 = stackOut_161_0;
                          break L52;
                        } else {
                          stackOut_160_0 = 1;
                          stackIn_162_0 = stackOut_160_0;
                          break L52;
                        }
                      }
                      L53: {
                        var8 = stackIn_162_0;
                        if (wk.field_m != 1) {
                          break L53;
                        } else {
                          L54: {
                            if (((le) this).field_u > 0) {
                              break L54;
                            } else {
                              if (re.field_r != 1) {
                                break L53;
                              } else {
                                break L54;
                              }
                            }
                          }
                          L55: {
                            if (((le) this).field_u == 0) {
                              break L55;
                            } else {
                              if (ti.field_N < 0) {
                                break L53;
                              } else {
                                break L55;
                              }
                            }
                          }
                          if (((le) this).field_u < 100) {
                            L56: {
                              if (re.field_r != 1) {
                                break L56;
                              } else {
                                if (cf.field_h[222] != null) {
                                  fk discarded$8 = ti.a((byte) -30, to.field_r[222], cf.field_h[222]);
                                  break L56;
                                } else {
                                  break L56;
                                }
                              }
                            }
                            L57: {
                              if (null == sm.field_e) {
                                L58: {
                                  L59: {
                                    var9 = -12 + ti.field_N;
                                    if (var9 < 0) {
                                      break L59;
                                    } else {
                                      if (var9 >= 96) {
                                        break L59;
                                      } else {
                                        if (var9 / 12 == 6) {
                                          break L59;
                                        } else {
                                          if (null == cf.field_h[wh.field_i[var9 / 12]]) {
                                            break L58;
                                          } else {
                                            sm.field_e = kd.a(cf.field_h[wh.field_i[var9 / 12]], 100, to.field_r[wh.field_i[var9 / 12]]);
                                            if (var15 == 0) {
                                              break L58;
                                            } else {
                                              break L59;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (cf.field_h[wh.field_i[0]] == null) {
                                    break L58;
                                  } else {
                                    sm.field_e = kd.a(cf.field_h[wh.field_i[0]], 100, to.field_r[wh.field_i[0]]);
                                    break L58;
                                  }
                                }
                                if (null != sm.field_e) {
                                  fk discarded$9 = sc.a(sm.field_e, (byte) 68);
                                  break L57;
                                } else {
                                  break L57;
                                }
                              } else {
                                break L57;
                              }
                            }
                            L60: {
                              var8 = 0;
                              if (((le) this).field_u >= 100) {
                                break L60;
                              } else {
                                ((le) this).field_u = ((le) this).field_u + 1;
                                if (1 == ((le) this).field_u) {
                                  ((le) this).field_c = -(var3 >> 1) + ol.field_g + me.field_I;
                                  ((le) this).field_e = -(an.field_f >> 1) + vn.field_c + an.field_g;
                                  break L60;
                                } else {
                                  break L60;
                                }
                              }
                            }
                            if (ti.field_N < 0) {
                              break L53;
                            } else {
                              if (((le) this).field_V.c((byte) 89)) {
                                break L53;
                              } else {
                                if (rd.field_e[ti.field_N] != 1) {
                                  break L53;
                                } else {
                                  if (((le) this).field_s != -1000) {
                                    break L53;
                                  } else {
                                    ((le) this).field_u = 0;
                                    ((le) this).field_s = var4;
                                    ((le) this).field_r = var5;
                                    break L53;
                                  }
                                }
                              }
                            }
                          } else {
                            break L53;
                          }
                        }
                      }
                      L61: {
                        L62: {
                          if (0 > ti.field_N) {
                            break L62;
                          } else {
                            L63: {
                              L64: {
                                var9 = rd.field_e[ti.field_N];
                                if (var9 == 2) {
                                  break L64;
                                } else {
                                  if (var9 == 4) {
                                    break L64;
                                  } else {
                                    if (3 != var9) {
                                      break L63;
                                    } else {
                                      break L64;
                                    }
                                  }
                                }
                              }
                              if (0 >= ((le) this).field_u) {
                                break L63;
                              } else {
                                ((le) this).field_u = 100;
                                var8 = 1;
                                break L63;
                              }
                            }
                            if (var15 == 0) {
                              break L61;
                            } else {
                              break L62;
                            }
                          }
                        }
                        var8 = 1;
                        break L61;
                      }
                      if (var8 == 0) {
                        break L39;
                      } else {
                        L65: {
                          if (0 < ((le) this).field_u) {
                            ((le) this).field_u = 64 * ((le) this).field_u / 100;
                            if (((le) this).field_u < 1) {
                              ((le) this).field_u = 1;
                              break L65;
                            } else {
                              break L65;
                            }
                          } else {
                            break L65;
                          }
                        }
                        L66: {
                          if (sm.field_e == null) {
                            break L66;
                          } else {
                            bl.a(sm.field_e, 125);
                            sm.field_e = null;
                            break L66;
                          }
                        }
                        L67: {
                          var9 = var6.f(-51);
                          var10 = var6.i((byte) 11);
                          var11 = var6.p(-8323);
                          var12 = -var9 + var4;
                          var13 = -var10 + (var5 - -(var11 >> 1));
                          var14 = (int)Math.sqrt((double)(var12 * var12 + var13 * var13));
                          if (0 > ti.field_N) {
                            break L67;
                          } else {
                            if (((le) this).field_V.c((byte) 89)) {
                              break L67;
                            } else {
                              L68: {
                                if (rd.field_e[ti.field_N] == 1) {
                                  if (-1000 == ((le) this).field_s) {
                                    ((le) this).field_u = 0;
                                    break L68;
                                  } else {
                                    break L68;
                                  }
                                } else {
                                  break L68;
                                }
                              }
                              L69: {
                                if (rd.field_e[ti.field_N] == 2) {
                                  break L69;
                                } else {
                                  if (rd.field_e[ti.field_N] == 4) {
                                    break L69;
                                  } else {
                                    if (rd.field_e[ti.field_N] != 3) {
                                      break L67;
                                    } else {
                                      if (!((le) this).field_V.a(var6, var6.i((byte) -111), var6.f(-109), -129, ti.field_N)) {
                                        ((le) this).field_u = 0;
                                        if (var15 == 0) {
                                          break L67;
                                        } else {
                                          break L69;
                                        }
                                      } else {
                                        break L67;
                                      }
                                    }
                                  }
                                }
                              }
                              ((le) this).field_s = var4;
                              ((le) this).field_r = var5;
                              if (!((le) this).field_V.a(var6, ((le) this).field_r, ((le) this).field_s, -129, ti.field_N)) {
                                ((le) this).field_u = 0;
                                break L67;
                              } else {
                                break L67;
                              }
                            }
                          }
                        }
                        L70: {
                          if (var14 != 0) {
                            break L70;
                          } else {
                            var13 = -1;
                            var14 = 1;
                            break L70;
                          }
                        }
                        if (((le) this).field_u <= 0) {
                          break L39;
                        } else {
                          if (((le) this).field_V.c((byte) 89)) {
                            break L39;
                          } else {
                            L71: {
                              if (((le) this).field_V.a(true)) {
                                break L71;
                              } else {
                                if (ti.field_N < 0) {
                                  break L71;
                                } else {
                                  L72: {
                                    ((le) this).field_u = (int)Math.sqrt((double)(((le) this).field_u * 32));
                                    if (ti.field_N == 87) {
                                      break L72;
                                    } else {
                                      if (ti.field_N == 116) {
                                        break L72;
                                      } else {
                                        if (ti.field_N == 45) {
                                          break L72;
                                        } else {
                                          if (54 == ti.field_N) {
                                            break L72;
                                          } else {
                                            if (154 == ti.field_N) {
                                              break L72;
                                            } else {
                                              if (ti.field_N == 139) {
                                                break L72;
                                              } else {
                                                if (ti.field_N != 152) {
                                                  ((le) this).field_V.e(true);
                                                  break L72;
                                                } else {
                                                  break L72;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L73: {
                                    L74: {
                                      if (((le) this).field_ab) {
                                        break L74;
                                      } else {
                                        ((le) this).a(var5, ti.field_N, ((le) this).field_r, var4, ((le) this).field_u, ((le) this).field_s, var6.y(17571), -75);
                                        if (ti.field_N != 87) {
                                          ti.field_N = -1;
                                          if (var15 == 0) {
                                            break L73;
                                          } else {
                                            break L74;
                                          }
                                        } else {
                                          break L73;
                                        }
                                      }
                                    }
                                    L75: {
                                      L76: {
                                        if (ti.field_N == 4) {
                                          break L76;
                                        } else {
                                          if (87 == ti.field_N) {
                                            break L76;
                                          } else {
                                            if (ti.field_N != 116) {
                                              break L75;
                                            } else {
                                              break L76;
                                            }
                                          }
                                        }
                                      }
                                      ((le) this).field_u = ((le) this).field_Q;
                                      ((le) this).field_Q = 255 & 1 + ((le) this).field_Q;
                                      break L75;
                                    }
                                    L77: {
                                      if (((le) this).field_h <= 0) {
                                        break L77;
                                      } else {
                                        this.i(2000);
                                        break L77;
                                      }
                                    }
                                    L78: {
                                      L79: {
                                        if (rd.field_e[ti.field_N] == 3) {
                                          break L79;
                                        } else {
                                          this.a(ti.field_N, var4, ((le) this).field_V.n((byte) -75), ((le) this).field_bb, var5, (byte) -30, ((le) this).field_s, ((le) this).field_r, ((le) this).field_u);
                                          if (var15 == 0) {
                                            break L78;
                                          } else {
                                            break L79;
                                          }
                                        }
                                      }
                                      this.a(ti.field_N, var4, ((le) this).field_V.n((byte) -75), ((le) this).field_bb, var5, (byte) -30, var6.f(-80), var6.i((byte) 113), ((le) this).field_u);
                                      break L78;
                                    }
                                    if (ti.field_N == 87) {
                                      break L73;
                                    } else {
                                      ti.field_N = -1;
                                      break L73;
                                    }
                                  }
                                  ((le) this).field_u = 0;
                                  if (var15 == 0) {
                                    break L39;
                                  } else {
                                    break L71;
                                  }
                                }
                              }
                            }
                            ((le) this).field_u = 0;
                            break L39;
                          }
                        }
                      }
                    } else {
                      break L39;
                    }
                  }
                }
              }
            }
          } else {
            break L39;
          }
        }
        L80: {
          if (((le) this).field_u <= 1) {
            break L80;
          } else {
            ((le) this).field_M = 2000;
            break L80;
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        if (param0 >= -97) {
            ((le) this).field_v = null;
        }
        if (!(((le) this).field_ab)) {
            var3 = param1 ? 1 : 0;
            gj.a(var3 != 0, true, 0, mn.field_r);
        }
    }

    private final void a(ml param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              if (ti.field_N < 0) {
                break L1;
              } else {
                if (ti.field_N == -1) {
                  break L1;
                } else {
                  if (null != eb.field_b) {
                    break L1;
                  } else {
                    L2: {
                      var3_int = rd.field_e[ti.field_N];
                      if (var3_int != 3) {
                        break L2;
                      } else {
                        L3: {
                          if (ti.field_N == 10) {
                            break L3;
                          } else {
                            if (ti.field_N == 123) {
                              break L3;
                            } else {
                              if (ti.field_N == 125) {
                                break L3;
                              } else {
                                if (138 == ti.field_N) {
                                  break L3;
                                } else {
                                  if (ti.field_N == 137) {
                                    break L3;
                                  } else {
                                    if (ti.field_N == 155) {
                                      break L3;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L4: {
                          if (!((le) this).field_ab) {
                            break L4;
                          } else {
                            if (~((le) this).field_V.d(false) == ~((le) this).field_I) {
                              break L4;
                            } else {
                              break L2;
                            }
                          }
                        }
                        this.a((byte) -7, param0);
                        break L2;
                      }
                    }
                    L5: {
                      if (0 == var3_int) {
                        break L5;
                      } else {
                        if (var3_int != 1) {
                          break L1;
                        } else {
                          if (((le) this).field_s == -1000) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (!((le) this).field_ab) {
                        break L6;
                      } else {
                        if (~((le) this).field_V.d(false) == ~((le) this).field_I) {
                          break L6;
                        } else {
                          break L1;
                        }
                      }
                    }
                    this.a(-110, param0);
                    break L1;
                  }
                }
              }
            }
            L7: {
              if (((le) this).field_u > 0) {
                L8: {
                  if (!((le) this).field_ab) {
                    break L8;
                  } else {
                    if (((le) this).field_V.d(false) == ((le) this).field_I) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  var3_int = ((le) this).field_e;
                  var4 = ((le) this).field_c;
                  if (ti.field_N == 78) {
                    var4 += 64;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                this.a(var4, (byte) -82, param0, var3_int);
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("le.OA(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + 98 + 41);
        }
    }

    private final void b(int param0, wk param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ml var10 = null;
        ml var11 = null;
        int var12 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            int discarded$3 = param1.d(-10674);
            var3_int = param1.n(-98);
            var4 = param1.m(0);
            if (param0 > 18) {
              L1: {
                L2: {
                  var5 = param1.m(0);
                  var6 = param1.m(0);
                  var7 = param1.m(0);
                  var8 = param1.e((byte) -127);
                  var9 = param1.e((byte) -94);
                  ((le) this).field_w.a(((le) this).field_w.d(false), var8, (byte) -107, var9, var4, var5, var7, var3_int, var6);
                  int discarded$4 = ((le) this).field_w.e((byte) 72);
                  if (!((le) this).field_k) {
                    break L2;
                  } else {
                    bk.a(2);
                    if (var12 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  L4: {
                    if (var8 == 158) {
                      break L4;
                    } else {
                      if (var8 != 159) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (~((le) this).field_V.d(false) == ~((le) this).field_I) {
                      break L5;
                    } else {
                      ((le) this).field_V.a(((le) this).field_V.d(false), var8, (byte) 25, var9, var4, var5, var7, var3_int, var6);
                      if (var8 == 159) {
                        ma.a(kj.field_b, 8421504, (byte) -117);
                        if (var12 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (~var4 != ~((le) this).field_p) {
                    break L1;
                  } else {
                    if (0 != ((le) this).field_h) {
                      break L1;
                    } else {
                      L6: {
                        L7: {
                          var10 = ((le) this).field_V.a(((le) this).field_bb, true);
                          var11 = ((le) this).field_w.a(((le) this).field_bb, true);
                          if (var10 != null) {
                            break L7;
                          } else {
                            if (var11 != null) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L8: {
                          if (var10 == null) {
                            break L8;
                          } else {
                            if (var11 == null) {
                              break L8;
                            } else {
                              if (var10.f(-118) != var11.f(72)) {
                                break L8;
                              } else {
                                if (var10.i((byte) -102) != var11.i((byte) 116)) {
                                  break L8;
                                } else {
                                  if (var10.o(-22625) != var11.o(-22625)) {
                                    break L8;
                                  } else {
                                    if (~var10.m(-20357) == ~var11.m(-20357)) {
                                      break L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((le) this).field_V.a((byte) 125, ((le) this).field_w);
                        int discarded$5 = ((le) this).field_V.e((byte) 72);
                        ((le) this).field_m.a(-86, ((le) this).field_V.a(((le) this).field_bb, true));
                        break L6;
                      }
                      if (var12 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L9: {
                  L10: {
                    ((le) this).field_t = false;
                    ((le) this).field_V.a(((le) this).field_V.d(false), var8, (byte) 11, var9, var4, var5, var7, var3_int, var6);
                    if (var8 == 6) {
                      break L10;
                    } else {
                      if (var8 != 79) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (pb.field_m.b(true)) {
                    break L9;
                  } else {
                    break L1;
                  }
                }
                ma.a(li.field_I + tc.field_w[var8], 8421504, (byte) -41);
                break L1;
              }
              ((le) this).field_o = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("le.EA(").append(param0).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
        }
    }

    private final boolean e(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (((le) this).field_o) {
              break L1;
            } else {
              L2: {
                if (this.r(-33)) {
                  break L2;
                } else {
                  if (!((le) this).field_k) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private final void a(int param0, ml param1) {
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = n.field_g.field_nb;
              var4 = an.field_g + (vn.field_c - (an.field_f >> 1));
              var5 = -(var3_int >> 1) + me.field_I - -ol.field_g;
              if (0 >= ((le) this).field_u) {
                break L1;
              } else {
                var4 = ((le) this).field_e;
                var5 = ((le) this).field_c;
                break L1;
              }
            }
            L2: {
              var6 = param1.f(54);
              var7 = param1.i((byte) 108);
              var8 = param1.p(-8323);
              var9 = -var6 + var4;
              var10 = (var8 >> 1) + (-var7 + var5);
              var11 = (int)Math.sqrt((double)(var9 * var9 + var10 * var10));
              if (0 != var11) {
                break L2;
              } else {
                var11 = 1;
                var10 = -1;
                break L2;
              }
            }
            L3: {
              var12 = 0;
              if (ti.field_N == 18) {
                var12 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (ti.field_N == 50) {
                var12 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (ti.field_N == 121) {
                var12 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (24 == ti.field_N) {
                var12 = 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (36 == ti.field_N) {
                var12 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (126 != ti.field_N) {
                break L8;
              } else {
                var12 = 1;
                break L8;
              }
            }
            L9: {
              if (ti.field_N != 127) {
                break L9;
              } else {
                var12 = 1;
                break L9;
              }
            }
            L10: {
              if (ti.field_N == 128) {
                var12 = 1;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (ti.field_N == 129) {
                var12 = 1;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (ti.field_N != 136) {
                break L12;
              } else {
                var12 = 1;
                break L12;
              }
            }
            L13: {
              if (ti.field_N == 37) {
                var12 = 1;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (ti.field_N != 102) {
                break L14;
              } else {
                var12 = 1;
                break L14;
              }
            }
            L15: {
              if (86 == ti.field_N) {
                var12 = 1;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (87 == ti.field_N) {
                var12 = 1;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (ti.field_N == 116) {
                var12 = 1;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (ti.field_N != 149) {
                break L18;
              } else {
                var12 = 1;
                break L18;
              }
            }
            L19: {
              if (param0 <= -107) {
                break L19;
              } else {
                ((le) this).field_L = 81;
                break L19;
              }
            }
            L20: {
              if (var12 == 0) {
                break L20;
              } else {
                if (((le) this).field_u > 0) {
                  ((le) this).field_u = 100;
                  break L20;
                } else {
                  break L20;
                }
              }
            }
            L21: {
              if (!((le) this).field_V.a(true)) {
                L22: {
                  L23: {
                    if (0 < var9) {
                      break L23;
                    } else {
                      param1.field_E = -1;
                      if (var19 == 0) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  param1.field_E = 1;
                  break L22;
                }
                L24: {
                  L25: {
                    if (ti.field_N == 127) {
                      break L25;
                    } else {
                      if (ti.field_N == 128) {
                        break L25;
                      } else {
                        if (ti.field_N == 129) {
                          break L25;
                        } else {
                          if (ti.field_N == 136) {
                            break L25;
                          } else {
                            if (155 == ti.field_N) {
                              break L25;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (~Math.abs(var9) <= ~Math.abs(var10)) {
                    break L24;
                  } else {
                    L26: {
                      L27: {
                        var9 = param1.field_E * 64;
                        if (0 > var10) {
                          break L27;
                        } else {
                          var10 = 64;
                          if (var19 == 0) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      var10 = -64;
                      break L26;
                    }
                    var11 = (int)Math.sqrt((double)(var9 * var9 - -(var10 * var10)));
                    if (var11 == 0) {
                      var11 = 1;
                      var10 = -1;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                }
                L28: {
                  L29: {
                    if (var12 == 0) {
                      break L29;
                    } else {
                      var15 = var8 / 2;
                      var16 = 100 + var15;
                      var14 = (var3_int >> 1) + -ol.field_g + var10 * (var16 + -50) / var11 + (-var15 + var7);
                      var13 = (an.field_f >> 1) + (var9 * (-50 + var16) / var11 - -var6) - vn.field_c;
                      tg.field_b[4].a(-16 + var13, -16 + var14);
                      var14 = (var3_int >> 1) + ((var16 - 66) * var10 / var11 - (var15 - var7 - -ol.field_g));
                      var13 = -vn.field_c + (var9 * (-50 + (var16 + -16)) / var11 + var6) - -(an.field_f >> 1);
                      tg.field_b[4].c(var13 + -8, var14 - 8);
                      var14 = (var3_int >> 1) + var7 + -var15 + (var10 * (-24 + (var16 - 50)) / var11 - ol.field_g);
                      var13 = -vn.field_c + var6 + var9 * (-24 + var16 + -50) / var11 + (an.field_f >> 1);
                      tg.field_b[4].b(var13 - 4, var14 - 4);
                      if (var19 == 0) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  var13 = var8 / 2;
                  var16 = 0;
                  L30: while (true) {
                    if (var16 >= 100) {
                      break L28;
                    } else {
                      var17 = var16 + var13;
                      var14 = var9 * var17 / var11;
                      var15 = -var13 + var17 * var10 / var11;
                      var18 = 0;
                      if (var19 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        L31: {
                          L32: {
                            if (var16 >= 25) {
                              break L32;
                            } else {
                              var18 = var18 | 16711680 & var16 * 10 << 16;
                              if (var19 == 0) {
                                break L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                          L33: {
                            var18 = var18 | 16711680;
                            if (var16 < 75) {
                              break L33;
                            } else {
                              L34: {
                                var18 = var18 | 65280;
                                if (var16 < 100) {
                                  break L34;
                                } else {
                                  var18 = var18 | 255;
                                  if (var19 == 0) {
                                    break L31;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              var18 = var18 | 10 * var16 - 750 & 255;
                              if (var19 == 0) {
                                break L31;
                              } else {
                                break L33;
                              }
                            }
                          }
                          var18 = var18 | var16 * 5 - 125 << 8 & 65280;
                          break L31;
                        }
                        L35: {
                          L36: {
                            if (var16 <= 25) {
                              break L36;
                            } else {
                              de.c((an.field_f >> 1) + (-vn.field_c + var6) + var14, (var3_int >> 1) + -ol.field_g + var15 + var7, 1600 / (200 - var16 * 100 / 100), var18, 25);
                              if (var19 == 0) {
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          de.c(-vn.field_c + (var6 - -var14 + (an.field_f >> 1)), (var3_int >> 1) + -ol.field_g + var15 + var7, 1600 / (200 + -(var16 * 100 / 100)), var18, var16);
                          break L35;
                        }
                        var16++;
                        if (var19 == 0) {
                          continue L30;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                }
                break L21;
              } else {
                break L21;
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var3 = decompiledCaughtException;
            stackOut_91_0 = (RuntimeException) var3;
            stackOut_91_1 = new StringBuilder().append("le.N(").append(param0).append(44);
            stackIn_93_0 = stackOut_91_0;
            stackIn_93_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param1 == null) {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L37;
            } else {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "{...}";
              stackIn_94_0 = stackOut_92_0;
              stackIn_94_1 = stackOut_92_1;
              stackIn_94_2 = stackOut_92_2;
              break L37;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_94_0, stackIn_94_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(wk param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
            var3_int = param0.d(-10674);
            ((le) this).field_w.c(-1);
            var4 = ((le) this).field_w.o(4);
            if (param1 <= 47) {
                ((le) this).field_I = -95;
            }
            if (!(var4 == var3_int)) {
                if (((le) this).field_k) {
                    he.field_e.b((byte) -67, 67);
                    he.field_e.a(var4, (byte) -101);
                    we.a(0, (byte) 93);
                }
                ka.b(false);
            }
            if (!(((le) this).field_k)) {
                ((le) this).field_V.c(-1);
                ((le) this).field_z = 0;
            }
            ((le) this).field_o = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "le.M(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        vn var5 = null;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == 0) {
          var4 = n.field_g.field_nb;
          var5 = ((le) this).field_V.g((byte) 70);
          if (var5 == null) {
            return;
          } else {
            var6 = (ml) (Object) var5.b(param1 + 12623);
            L0: while (true) {
              L1: {
                L2: {
                  L3: {
                    if (var6 == null) {
                      break L3;
                    } else {
                      stackOut_7_0 = var6.y(17571);
                      stackOut_7_1 = ((le) this).field_bb;
                      stackIn_14_0 = stackOut_7_0;
                      stackIn_14_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (var10 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_8_0 == stackIn_8_1) {
                            break L4;
                          } else {
                            var6.c((var4 >> 1) + -param0, -param2 + (an.field_f >> 1), 1703903841);
                            break L4;
                          }
                        }
                        var6 = (ml) (Object) var5.a(0);
                        if (var10 == 0) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var6 = ((le) this).field_V.a(((le) this).field_bb, true);
                  if (var6 != null) {
                    var6.c((var4 >> 1) + -param0, (an.field_f >> 1) + -param2, 1703903841);
                    stackOut_13_0 = ~((le) this).field_u;
                    stackOut_13_1 = -1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L2;
                  } else {
                    break L1;
                  }
                }
                L5: {
                  if (stackIn_14_0 != stackIn_14_1) {
                    break L5;
                  } else {
                    if (-1 == ti.field_N) {
                      break L5;
                    } else {
                      if (null == eb.field_b) {
                        var7 = -param2 - -(an.field_f >> 1) - -var6.f(-88);
                        var8 = -48 + (var4 >> 1) + -param0 - -var6.i((byte) 115) + (-var6.p(-8323) + -((le) this).field_M);
                        de.i(var7, var8, 20, 16777215);
                        gn.a(20, (byte) 99, 192, var7, var8);
                        de.c(var7, var8, 20, 0);
                        bb.field_g[dd.field_f[ti.field_N]].c(var7 + -20, var8 + -20);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (((le) this).field_u != 0) {
                    break L6;
                  } else {
                    if (ti.field_N != -1) {
                      break L6;
                    } else {
                      if (null != eb.field_b) {
                        break L6;
                      } else {
                        if (((le) this).field_V.d(false) >= 0) {
                          var7 = -param2 + ((an.field_f >> 1) + var6.f(param1 ^ -82));
                          var8 = -64 + var6.i((byte) 117) + (-param0 + ((var4 >> 1) - var6.p(-8323))) + -((le) this).field_M;
                          var9 = nj.field_n[((le) this).field_V.d(false)];
                          if (((le) this).field_V.d(false) < 0) {
                            break L6;
                          } else {
                            tg.field_b[3].b(var7 + -16, -(int)(Math.sin(3.14 * (double)((le) this).field_P / 32.0) * 32.0) + -16 + var8, var9);
                            break L6;
                          }
                        } else {
                          this.g(0);
                          this.a(var6, 98);
                          break L1;
                        }
                      }
                    }
                  }
                }
                this.g(0);
                this.a(var6, 98);
                break L1;
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    private final ml q(int param0) {
        vn var2 = null;
        int var3 = 0;
        ml var4 = null;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        pg stackIn_10_0 = null;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        pg stackOut_8_0 = null;
        pg stackOut_9_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArcanistsMulti.field_G ? 1 : 0;
                    var2 = ((le) this).field_V.g((byte) 85);
                    var3 = ((le) this).field_bb;
                    var4 = ((le) this).field_V.a(var3, true);
                    if (param0 == 10781) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    if (var4 != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return null;
                }
                case 4: {
                    var5 = 0;
                    if (~var4.i((byte) 127) > ~((le) this).field_V.field_H) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = 1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var6 = var4;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var6.field_b == var2.field_e) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = var6.field_b;
                    stackIn_10_0 = stackOut_8_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = var2.field_e.field_b;
                    stackIn_10_0 = stackOut_9_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var6 = (ml) (Object) stackIn_10_0;
                    if (var6 == var4) {
                        statePc = 30;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var6.t(34)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (37 != var6.o(-22625)) {
                        statePc = 7;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (((le) this).field_V.field_d) {
                        statePc = 20;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var6 == null) {
                        statePc = 7;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var6.o(-22625) == 12) {
                        statePc = 7;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var6.g(false) != ((le) this).field_V.d(false)) {
                        statePc = 7;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var4 = var6;
                    ((le) this).field_bb = var6.y(17571);
                    eb.field_b = null;
                    ti.field_N = -1;
                    var6.a((byte) 65, 0);
                    if (var7 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var6 == null) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = ~var6.y(17571);
                    stackOut_21_1 = ~((le) this).field_V.d(false);
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 == stackIn_22_1) {
                        statePc = 27;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var6.w(24501) == null) {
                        statePc = 7;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = var6.r(106);
                    stackOut_24_1 = ((le) this).field_V.q((byte) -115);
                    stackIn_22_0 = stackOut_24_0;
                    stackIn_22_1 = stackOut_24_1;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    if (var7 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 == stackIn_25_1) {
                        statePc = 27;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var6.o(param0 + -33406) != 12) {
                        statePc = 29;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var4 = var6;
                    ((le) this).field_bb = var6.y(param0 + 6790);
                    eb.field_b = null;
                    ti.field_N = -1;
                    var6.a((byte) -31, 0);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ((le) this).field_m.a(param0 + -10886, var4);
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(boolean param0) {
        ((le) this).field_V.b((byte) 88, ((le) this).field_J);
        ((le) this).field_V.c(-1);
        this.b(0);
        ((le) this).field_F = false;
        ((le) this).field_z = ((le) this).field_V.f(12955);
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var2 = -50 + an.field_f;
          var3 = 10;
          var4 = -1;
          if (0 == ((le) this).field_V.a(-31497)) {
            var4 = 5;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((le) this).field_V.a(-31497) == 1) {
            var4 = 17;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (2 != ((le) this).field_V.a(-31497)) {
            break L2;
          } else {
            var4 = 42;
            break L2;
          }
        }
        L3: {
          if (((le) this).field_V.a(-31497) == 4) {
            var4 = 29;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((le) this).field_V.a(-31497) == 5) {
            var4 = 55;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((le) this).field_V.a(-31497) != 6) {
            break L5;
          } else {
            var4 = 67;
            break L5;
          }
        }
        L6: {
          if (((le) this).field_V.a(-31497) != 7) {
            break L6;
          } else {
            var4 = 85;
            break L6;
          }
        }
        L7: {
          if (((le) this).field_V.a(-31497) != 8) {
            break L7;
          } else {
            var4 = 72;
            break L7;
          }
        }
        L8: {
          if (var4 == -1) {
            break L8;
          } else {
            L9: {
              L10: {
                if (((le) this).field_V.n((byte) -75) < ((le) this).field_V.l(4)) {
                  break L10;
                } else {
                  de.g(-4 + var2, -4 + var3, 48, 48, 8, 8323072);
                  de.g(-2 + var2, var3 + -2, 44, 44, 6, 16711680);
                  bb.field_g[var4].c(var2, var3);
                  if (!ArcanistsMulti.field_G) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              var5 = 256 * (((le) this).field_V.l(4) - ((le) this).field_V.n((byte) -75)) / ((le) this).field_V.l(4);
              de.g(-4 + var2, var3 - 4, 48, 48, 8, 8355711);
              de.g(-2 + var2, var3 + -2, 44, 44, 6, 16777215);
              bb.field_g[var4].c(var2, var3, -var5 + 256);
              var6 = (-1 + ((le) this).field_V.l(4) + (-((le) this).field_V.n((byte) -75) - -((le) this).field_V.s(0))) / ((le) this).field_V.s(0);
              int discarded$3 = tj.field_t.a(Integer.toString(var6), -4 + var2, -4 + (var3 + -1), 48, 48, 8355711, 0, 1, 1, tj.field_t.field_C);
              int discarded$4 = tj.field_t.a(Integer.toString(var6), -5 + var2, -4 + var3, 48, 48, 8355711, 0, 1, 1, tj.field_t.field_C);
              int discarded$5 = tj.field_t.a(Integer.toString(var6), -4 + var2, -4 + var3, 48, 48, 16777215, -1, 1, 1, tj.field_t.field_C);
              break L9;
            }
            break L8;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        L0: {
          var10 = ArcanistsMulti.field_G ? 1 : 0;
          if (param7 < -58) {
            break L0;
          } else {
            ((le) this).field_c = 77;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param6 != -1) {
              break L2;
            } else {
              ((le) this).field_V.e(true);
              if (var10 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            ((le) this).field_t = false;
            if (param1 == 87) {
              break L3;
            } else {
              if (param1 == 116) {
                break L3;
              } else {
                if (param1 == 158) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (6 == param1) {
                        break L5;
                      } else {
                        if (param1 != 79) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (pb.field_m.b(true)) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                  L6: {
                    if (param1 == 159) {
                      break L6;
                    } else {
                      ma.a(li.field_I + tc.field_w[param1], 8421504, (byte) -103);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ma.a(kj.field_b, 8421504, (byte) -42);
                  break L3;
                }
              }
            }
          }
          ((le) this).field_V.a(((le) this).field_V.d(false), param1, (byte) 77, param4, param3, param0, param2, param6, param5);
          break L1;
        }
        L7: {
          if (qg.a(-127)) {
            break L7;
          } else {
            if (((le) this).field_V.b(((le) this).field_J, -89)) {
              gj.a(false, true, -1, mn.field_r);
              break L7;
            } else {
              break L7;
            }
          }
        }
    }

    final void g(byte param0) {
        if (!((le) this).field_ab) {
            throw new IllegalStateException();
        }
        he.field_e.b((byte) -79, 61);
        if (param0 != -61) {
            ((le) this).field_e = -97;
        }
    }

    private final void b(wk param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
            ((le) this).field_k = false;
            ((le) this).field_V.a((byte) 72, ((le) this).field_w);
            var3_int = param0.o(6);
            var4 = param0.e((byte) -114);
            ((le) this).field_V.a(var3_int, (byte) 63, var4);
            if (null != ((le) this).field_w) {
                ((le) this).field_w.a(var3_int, (byte) 60, var4);
            }
            gj.a(false, true, -1, mn.field_r);
            ((le) this).field_o = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "le.G(" + (param0 != null ? "{...}" : "null") + 44 + -1 + 41);
        }
    }

    le(boolean param0, int param1, int param2, boolean param3, String[] param4, int param5, int[][] param6, int[][] param7, int[] param8, int param9, int param10, boolean param11, int param12, boolean[] param13) {
        RuntimeException var15 = null;
        int var15_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        ((le) this).field_g = true;
        ((le) this).field_y = true;
        ((le) this).field_v = new int[6];
        ((le) this).field_C = false;
        ((le) this).field_K = 4;
        ((le) this).field_F = false;
        ((le) this).field_U = false;
        ((le) this).field_H = true;
        ((le) this).field_o = false;
        ((le) this).field_l = new int[]{17, 17, 17, 17, 17, 17};
        ((le) this).field_T = false;
        ((le) this).field_X = true;
        ((le) this).field_t = false;
        ((le) this).field_O = false;
        ((le) this).field_G = true;
        ((le) this).field_B = false;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param0) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((le) this).field_ab = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param11) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              L4: {
                ((le) this).field_i = stackIn_7_1 != 0;
                ((le) this).field_I = param5;
                var15_int = param12;
                ((le) this).field_V = new nf(false, false, param1, param2, param3, param4, param9, param10, param6, param7, param8, var15_int, param13);
                ((le) this).field_V.field_H = 960;
                ((le) this).field_V.field_y = 1920;
                ((le) this).field_V.field_Hb = ((le) this).field_V.field_H >> 1;
                ((le) this).field_V.field_hb = ((le) this).field_V.field_y >> 1;
                ((le) this).field_V.p(88);
                ((le) this).field_V.c(true);
                ue.a((byte) -117, (le) this);
                ((le) this).field_W = -1;
                ((le) this).field_x = 0;
                ((le) this).field_f = null;
                ((le) this).field_m = new ol();
                ((le) this).field_cb = new vn();
                if (!((le) this).field_ab) {
                  break L4;
                } else {
                  tj.c(63);
                  ((le) this).field_w = new nf(false, false, param1, param2, param3, param4, param9, param10, param6, param7, param8, var15_int, param13);
                  ((le) this).field_w.p(63);
                  ((le) this).field_w.c(true);
                  ((le) this).field_k = true;
                  ((le) this).field_L = 0;
                  if (!ArcanistsMulti.field_G) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              k.a((le) this, true);
              df.a((byte) 83, 0);
              ((le) this).field_V.field_sb = cf.field_h;
              ((le) this).field_V.field_rb = uk.field_g;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var15 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var15;
            stackOut_11_1 = new StringBuilder().append("le.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          L6: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param5).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param6 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param7 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param8 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param9).append(44).append(param10).append(44).append(param11).append(44).append(param12).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param13 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 5, 5, 5, 0, 0, 3, 0, 0, 3, 0, 0, 0, 3, 5, 5, 0, 3, 0, 3, 0, 0, 3, 5, 0, 0, 3, 5, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 5, 5, 0, 3, 0, 0, 0, 5, 0, 3, 0, 5, 3, 5, 0, 3, 0, 5, 3, 5, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 5, 5, 0, 3, 0, 5, 3, 5, 0, 0, 0, 3, 5, 5, 0, 3, 0, 3, 0, 0, 0, 3, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 15, 15, 15, 15, 15, 15, 15, 0, 0, 0, 0, 0, 3, 0, 0};
        field_db = "Connecting to<br>friend server...";
        field_A = "Confirm Password: ";
        field_N = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}

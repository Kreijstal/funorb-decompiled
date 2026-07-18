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
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
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
                            stackOut_27_0 = 2;
                            stackIn_28_0 = stackOut_27_0;
                            return stackIn_28_0;
                          } else {
                            stackOut_29_0 = -1;
                            stackIn_30_0 = stackOut_29_0;
                            break L0;
                          }
                        } else {
                          stackOut_22_0 = 1;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      } else {
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    } else {
                      stackOut_16_0 = 3;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  } else {
                    stackOut_13_0 = -98;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
              var1_int = qg.field_c;
              ee.a(-1, (byte) 30);
              stackOut_10_0 = var1_int;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "le.KB(" + param0 + ')');
        }
        return stackIn_30_0;
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              if (((le) this).field_V.b(param2) < 0) {
                stackOut_3_0 = -an.field_f / 2;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = an.field_f / 2;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var4_int = stackIn_4_0;
              if (~-var4_int < ~vn.field_c) {
                ((le) this).field_n = 0;
                vn.field_c = -var4_int;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (vn.field_c > ((le) this).field_V.field_y + var4_int) {
                vn.field_c = var4_int + ((le) this).field_V.field_y;
                ((le) this).field_n = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (~ol.field_g > ~param1) {
                ((le) this).field_S = 0;
                ol.field_g = param1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (~param0 > ~ol.field_g) {
                ((le) this).field_S = 0;
                ol.field_g = param0;
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "le.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, wk param2, boolean param3) {
        RuntimeException runtimeException = null;
        hl var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var5 = new hl();
            var5.field_k = param1;
            var6 = new byte[param0];
            param2.a((byte) 123, 0, var6, param0);
            var5.field_j = new wk(var6);
            var5.field_g = jb.field_v;
            if (!param3) {
              ((le) this).field_cb.b((pg) (Object) var5, -1);
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
            stackOut_4_1 = new StringBuilder().append("le.QB(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null != ((le) this).field_m.field_h) {
                  break L2;
                } else {
                  if (((le) this).field_m.field_d == null) {
                    break L1;
                  } else {
                    L3: {
                      if (((le) this).field_m.field_d.f(true)) {
                        break L3;
                      } else {
                        if (~((le) this).field_m.field_d.y(param0 + -37) == ~((le) this).field_bb) {
                          break L3;
                        } else {
                          break L1;
                        }
                      }
                    }
                    vn.field_c = vn.field_c * 7 - -((le) this).field_m.field_d.f(64) >> 1872072771;
                    ol.field_g = 7 * ol.field_g + ((le) this).field_m.field_d.i((byte) -53) >> -1861216061;
                    if (!ArcanistsMulti.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (!((le) this).field_m.field_h.h(param0 + -17747)) {
                break L1;
              } else {
                vn.field_c = vn.field_c * 7 - -((le) this).field_m.field_h.c(param0 + -17583) >> 1818964803;
                ol.field_g = 7 * ol.field_g + ((le) this).field_m.field_h.e(52) >> 280332963;
                break L1;
              }
            }
            L4: {
              if (param0 == 17608) {
                break L4;
              } else {
                ((le) this).field_J = 85;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.BB(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        ml var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((le) this).field_V.t(8);
            ((le) this).field_C = true;
            ((le) this).field_bb = ((le) this).field_V.d(false);
            var2 = ((le) this).field_V.a(((le) this).field_V.d(false), true);
            if (param0 == 0) {
              L1: {
                L2: {
                  if (null != var2) {
                    break L2;
                  } else {
                    ((le) this).field_m.a(0);
                    if (!ArcanistsMulti.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ((le) this).field_m.a(-110, var2);
                break L1;
              }
              L3: {
                ((le) this).field_s = -1000;
                ((le) this).field_t = false;
                if (((le) this).field_ab) {
                  break L3;
                } else {
                  if (mj.field_p != 7) {
                    break L3;
                  } else {
                    if (((le) this).field_V.field_q <= 1) {
                      break L3;
                    } else {
                      ((le) this).field_I = ((le) this).field_V.d(false);
                      break L3;
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
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "le.U(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = n.field_g.field_nb;
            var6 = var5_int / 2 + ((le) this).field_V.field_H - param0;
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var7 <= ~an.field_f) {
                    break L3;
                  } else {
                    var8 = (int)Math.abs(18.0 * Math.cos(3.141592653589793 * (double)(param3 + (var7 - -(ge.field_r * 4))) / 64.0));
                    stackOut_3_0 = ge.field_r;
                    stackOut_3_1 = 64;
                    stackIn_15_0 = stackOut_3_0;
                    stackIn_15_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < stackIn_4_1) {
                            break L5;
                          } else {
                            var8 = var8 * (96 - ge.field_r) / 32;
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var8 = var8 * (ge.field_r - 32) / 32;
                        break L4;
                      }
                      L6: {
                        if (var8 > 0) {
                          var8 = -var8;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var8 += 12;
                      var8 = (int)((double)var8 + (32.0 + 8.0 * Math.sin((double)ge.field_r * 3.141592653589793 / 64.0)));
                      de.f(var7, -var8 + var6, var8, (65792 | param1) >> 235254433, 128);
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_14_0 = param2;
                stackOut_14_1 = 12224;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L2;
              }
              if (stackIn_15_0 == stackIn_15_1) {
                var7 = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (an.field_f <= var7) {
                        break L9;
                      } else {
                        var8 = (int)Math.abs(20.0 * Math.sin(3.141592653589793 * (double)(param3 + (4 * ge.field_r + var7)) / 64.0));
                        stackOut_19_0 = 64;
                        stackOut_19_1 = ge.field_r;
                        stackIn_29_0 = stackOut_19_0;
                        stackIn_29_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (var9 != 0) {
                          break L8;
                        } else {
                          L10: {
                            L11: {
                              if (stackIn_20_0 <= stackIn_20_1) {
                                break L11;
                              } else {
                                var8 = (-32 + ge.field_r) * var8 / 32;
                                if (var9 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var8 = var8 * (-ge.field_r + 96) / 32;
                            break L10;
                          }
                          L12: {
                            if (var8 <= 0) {
                              break L12;
                            } else {
                              var8 = -var8;
                              break L12;
                            }
                          }
                          var8 += 8;
                          var8 = (int)((double)var8 + (Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) * 8.0 + 32.0));
                          de.h(0, var6 - var8, an.field_f, an.field_j);
                          de.c(var7, var6 - 64, 1, 128, (123361 | param1) >> -143396095, 0);
                          var7++;
                          if (var9 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    de.a();
                    stackOut_28_0 = an.field_j;
                    stackOut_28_1 = var6 + 64;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    break L8;
                  }
                  L13: {
                    if (stackIn_29_0 > stackIn_29_1) {
                      de.d(0, var6 - -64, an.field_f, -var6 + -64 + an.field_j, 0);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "le.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean j(int param0) {
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -27726) {
                break L1;
              } else {
                ((le) this).field_Z = 96;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((le) this).field_o) {
                  break L3;
                } else {
                  L4: {
                    if (this.r(-74)) {
                      break L4;
                    } else {
                      if (!((le) this).field_k) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_13_0 = stackOut_10_0;
                  break L2;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.NA(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final boolean f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 53 / ((param0 - -81) / 45);
                if (((le) this).field_o) {
                  break L2;
                } else {
                  L3: {
                    if (this.r(-35)) {
                      break L3;
                    } else {
                      if (!((le) this).field_k) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_7_0 = 1;
                  stackIn_10_0 = stackOut_7_0;
                  break L1;
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.DB(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
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
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_57_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
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
                      stackOut_33_0 = ~(param1 + (48 + var11_int));
                      stackOut_33_1 = -32;
                      stackOut_33_2 = 272;
                      stackOut_33_3 = mi.field_B.b("350");
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      stackIn_35_2 = stackOut_33_2;
                      stackIn_35_3 = stackOut_33_3;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      stackIn_34_2 = stackOut_33_2;
                      stackIn_34_3 = stackOut_33_3;
                      if (var9 <= 0) {
                        stackOut_35_0 = stackIn_35_0;
                        stackOut_35_1 = stackIn_35_1;
                        stackOut_35_2 = stackIn_35_2;
                        stackOut_35_3 = stackIn_35_3;
                        stackOut_35_4 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        stackIn_36_2 = stackOut_35_2;
                        stackIn_36_3 = stackOut_35_3;
                        stackIn_36_4 = stackOut_35_4;
                        break L11;
                      } else {
                        stackOut_34_0 = stackIn_34_0;
                        stackOut_34_1 = stackIn_34_1;
                        stackOut_34_2 = stackIn_34_2;
                        stackOut_34_3 = stackIn_34_3;
                        stackOut_34_4 = mi.field_B.b("5/5") - -1;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        stackIn_36_2 = stackOut_34_2;
                        stackIn_36_3 = stackOut_34_3;
                        stackIn_36_4 = stackOut_34_4;
                        break L11;
                      }
                    }
                    L12: {
                      if (stackIn_36_0 < ~(stackIn_36_1 + (stackIn_36_2 - (stackIn_36_3 + stackIn_36_4)))) {
                        L13: {
                          stackOut_38_0 = -32 + -mi.field_B.b("350");
                          stackOut_38_1 = -param1;
                          stackOut_38_2 = 224;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          if (var9 > 0) {
                            stackOut_40_0 = stackIn_40_0;
                            stackOut_40_1 = stackIn_40_1;
                            stackOut_40_2 = stackIn_40_2;
                            stackOut_40_3 = mi.field_B.b("5/5") + 1;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            stackIn_41_2 = stackOut_40_2;
                            stackIn_41_3 = stackOut_40_3;
                            break L13;
                          } else {
                            stackOut_39_0 = stackIn_39_0;
                            stackOut_39_1 = stackIn_39_1;
                            stackOut_39_2 = stackIn_39_2;
                            stackOut_39_3 = 0;
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            stackIn_41_2 = stackOut_39_2;
                            stackIn_41_3 = stackOut_39_3;
                            break L13;
                          }
                        }
                        var11_int = stackIn_41_0 + (stackIn_41_1 + (stackIn_41_2 + -stackIn_41_3));
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
                  stackOut_57_0 = param1 + 48;
                  stackIn_59_0 = stackOut_57_0;
                  stackIn_58_0 = stackOut_57_0;
                  if (var9 <= 0) {
                    stackOut_59_0 = stackIn_59_0;
                    stackOut_59_1 = 0;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    break L17;
                  } else {
                    stackOut_58_0 = stackIn_58_0;
                    stackOut_58_1 = 1 + mi.field_B.b("5/4");
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_60_1 = stackOut_58_1;
                    break L17;
                  }
                }
                var12 = stackIn_60_0 - -stackIn_60_1;
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
                    mi.field_B.a(var14, -1 + var13_int, mi.field_B.field_C / 2 + 4 + -8 + (param0 - (-(((le) this).field_l[param2] / 2) + -3)), (var8 | 8421504) ^ 8421504, 0);
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
                      mi.field_B.a(var13, var12 - 1, mi.field_B.field_C / 2 + 3 + (-8 + param0) + (((le) this).field_l[param2] - 8 - -4), 0, 0);
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
                    mi.field_B.b(var11, param1 / 2 + 12 - -26, -1 + (param0 - -(((le) this).field_l[param2] / 2) - -(mi.field_B.field_C / 2)), var8, -1);
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
        int var8_int = 0;
        String var8 = null;
        int var9_int = 0;
        qa var9 = null;
        vn var10_ref_vn = null;
        int var10 = 0;
        mi var11_ref_mi = null;
        int var11 = 0;
        String var11_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        StringBuilder stackIn_75_0 = null;
        StringBuilder stackIn_76_0 = null;
        StringBuilder stackIn_77_0 = null;
        String stackIn_77_1 = null;
        int stackIn_85_0 = 0;
        int stackIn_123_0 = 0;
        StringBuilder stackOut_74_0 = null;
        StringBuilder stackOut_76_0 = null;
        String stackOut_76_1 = null;
        StringBuilder stackOut_75_0 = null;
        String stackOut_75_1 = null;
        int stackOut_84_0 = 0;
        boolean stackOut_122_0 = false;
        L0: {
          var13 = ArcanistsMulti.field_G ? 1 : 0;
          ce.field_m.a(true);
          de.h(param4, param2, param4 - -param6, param2 - -param1);
          if (!((le) this).field_k) {
            break L0;
          } else {
            if (!((le) this).field_V.n(4)) {
              de.d(param4, param2, param6, param1, 0);
              var8 = rb.field_l + " - " + ((le) this).field_L + "%";
              int discarded$1 = tj.field_t.a(var8, param4, param2, param6, param1, 16777215, -1, 1, 1, 0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var8_int = 2158624;
          if (((le) this).field_V.a(param5 ^ -31593) == 2) {
            var8_int = 2239508;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (3 != ((le) this).field_V.a(-31497)) {
            break L2;
          } else {
            var8_int = 3298412;
            break L2;
          }
        }
        L3: {
          if (((le) this).field_V.a(-31497) == 1) {
            var8_int = 4214874;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((le) this).field_V.a(-31497) != 0) {
            break L4;
          } else {
            var8_int = 5663344;
            break L4;
          }
        }
        L5: {
          if (4 != ((le) this).field_V.a(-31497)) {
            break L5;
          } else {
            var8_int = 2895400;
            break L5;
          }
        }
        L6: {
          if (((le) this).field_V.a(-31497) == 5) {
            var8_int = 9054474;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (param5 == 96) {
            break L7;
          } else {
            this.a(106, (byte) -85, (ml) null, -35);
            break L7;
          }
        }
        L8: {
          if (((le) this).field_V.a(-31497) == 6) {
            var8_int = 15658734;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (((le) this).field_V.a(-31497) != 7) {
            break L9;
          } else {
            var8_int = 1213580;
            break L9;
          }
        }
        L10: {
          if (((le) this).field_V.a(param5 ^ -31593) == 8) {
            var8_int = 15597806;
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
                this.a(vn.field_c, (byte) -121, var8_int, ol.field_g);
                this.b(vn.field_c, -98, ol.field_g);
                this.c(ol.field_g, 0, vn.field_c);
                this.a(-8, vn.field_c, ol.field_g);
                var9_int = n.field_g.field_nb;
                var10_ref_vn = ((le) this).field_V.e(param5 + -184);
                if (null == var10_ref_vn) {
                  break L13;
                } else {
                  var11_ref_mi = (mi) (Object) var10_ref_vn.b(12623);
                  L14: while (true) {
                    if (var11_ref_mi == null) {
                      break L13;
                    } else {
                      var11_ref_mi.a(-ol.field_g + (var9_int >> 1256824385), 41, -vn.field_c + (an.field_f >> -715420927));
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
                if (null == var10_ref_vn) {
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
                        var11_ref_mi.a((var9_int >> 891061793) + -ol.field_g, -108, -vn.field_c - -(an.field_f >> -518178271));
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
              this.a(ol.field_g, var8_int, 12224, vn.field_c);
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
                              break L22;
                            } else {
                              L23: {
                                var12 = var10 % 60;
                                stackOut_74_0 = new StringBuilder().append(var10 / 60);
                                stackIn_76_0 = stackOut_74_0;
                                stackIn_75_0 = stackOut_74_0;
                                if (var12 < 10) {
                                  stackOut_76_0 = (StringBuilder) (Object) stackIn_76_0;
                                  stackOut_76_1 = ":0";
                                  stackIn_77_0 = stackOut_76_0;
                                  stackIn_77_1 = stackOut_76_1;
                                  break L23;
                                } else {
                                  stackOut_75_0 = (StringBuilder) (Object) stackIn_75_0;
                                  stackOut_75_1 = ":";
                                  stackIn_77_0 = stackOut_75_0;
                                  stackIn_77_1 = stackOut_75_1;
                                  break L23;
                                }
                              }
                              var11_ref_String = stackIn_77_1 + var12;
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
                  stackOut_84_0 = ~((le) this).field_I;
                  stackIn_123_0 = stackOut_84_0;
                  stackIn_85_0 = stackOut_84_0;
                  if (var13 != 0) {
                    break L24;
                  } else {
                    L27: {
                      L28: {
                        L29: {
                          if (stackIn_85_0 == ~var10) {
                            break L29;
                          } else {
                            L30: {
                              var11_ref_String = ((le) this).field_V.field_k[var10];
                              if ((((le) this).field_a & 1 << var10) != 0) {
                                break L30;
                              } else {
                                if ((((le) this).field_b & 1 << var10) != 0) {
                                  L31: {
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
                      if (null == var11_ref_String) {
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
          stackOut_122_0 = ((le) this).field_V.n(4);
          stackIn_123_0 = stackOut_122_0 ? 1 : 0;
          break L24;
        }
        L36: {
          if (stackIn_123_0 == 0) {
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
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        ml var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_124_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (vn.field_d != 84) {
                break L1;
              } else {
                if (((le) this).field_B) {
                  L2: {
                    ((le) this).field_B = false;
                    if (6 > mj.field_p) {
                      break L2;
                    } else {
                      ((le) this).field_O = true;
                      break L2;
                    }
                  }
                  rm.field_k = rm.field_k + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (!td.e(true)) {
                break L3;
              } else {
                if (!ri.field_b[82]) {
                  break L3;
                } else {
                  if (!ri.field_b[86]) {
                    break L3;
                  } else {
                    if (vn.field_d != 12) {
                      break L3;
                    } else {
                      he.field_e.b((byte) -59, 67);
                      he.field_e.a(0, (byte) -101);
                      we.a(0, (byte) 113);
                      break L3;
                    }
                  }
                }
              }
            }
            L4: {
              L5: {
                L6: {
                  if (!((le) this).field_V.c((byte) 89)) {
                    break L6;
                  } else {
                    if (!((le) this).field_V.j(39)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (((le) this).field_V.a(true)) {
                  break L5;
                } else {
                  if (((le) this).field_V.k(-75)) {
                    break L5;
                  } else {
                    if (((le) this).field_V.g(125)) {
                      break L5;
                    } else {
                      if (1 >= ((le) this).field_z) {
                        break L5;
                      } else {
                        stackOut_39_0 = 1;
                        stackIn_42_0 = stackOut_39_0;
                        break L4;
                      }
                    }
                  }
                }
              }
              stackOut_41_0 = 0;
              stackIn_42_0 = stackOut_41_0;
              break L4;
            }
            L7: {
              var2_int = stackIn_42_0;
              if (!((le) this).field_ab) {
                break L7;
              } else {
                L8: {
                  L9: {
                    stackOut_43_0 = var2_int;
                    stackIn_54_0 = stackOut_43_0;
                    stackIn_44_0 = stackOut_43_0;
                    if (ef.field_r) {
                      break L9;
                    } else {
                      stackOut_44_0 = stackIn_44_0;
                      stackIn_46_0 = stackOut_44_0;
                      stackOut_46_0 = stackIn_46_0;
                      stackIn_54_0 = stackOut_46_0;
                      stackIn_47_0 = stackOut_46_0;
                      if (pn.a((byte) 119)) {
                        break L9;
                      } else {
                        stackOut_47_0 = stackIn_47_0;
                        stackIn_49_0 = stackOut_47_0;
                        stackOut_49_0 = stackIn_49_0;
                        stackIn_54_0 = stackOut_49_0;
                        stackIn_50_0 = stackOut_49_0;
                        if (((le) this).field_V.d(false) != ((le) this).field_I) {
                          break L9;
                        } else {
                          stackOut_50_0 = stackIn_50_0;
                          stackIn_52_0 = stackOut_50_0;
                          stackOut_52_0 = stackIn_52_0;
                          stackOut_52_1 = 1;
                          stackIn_55_0 = stackOut_52_0;
                          stackIn_55_1 = stackOut_52_1;
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_54_0 = stackIn_54_0;
                  stackOut_54_1 = 0;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  break L8;
                }
                var2_int = stackIn_55_0 & stackIn_55_1;
                break L7;
              }
            }
            L10: {
              if (param0 == 1) {
                break L10;
              } else {
                ((le) this).field_g = true;
                break L10;
              }
            }
            L11: {
              if (var2_int == 0) {
                break L11;
              } else {
                L12: {
                  var3 = n.field_g.field_nb;
                  var4 = ol.field_g + (me.field_I + -(var3 >> 696013313));
                  if (((le) this).field_u > 0) {
                    var4 = ((le) this).field_c;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  L14: {
                    var5 = ((le) this).field_V.a(((le) this).field_bb, true);
                    if (vn.field_d == 84) {
                      break L14;
                    } else {
                      if (vn.field_d != 82) {
                        stackOut_70_0 = 0;
                        stackIn_71_0 = stackOut_70_0;
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  stackOut_68_0 = 1;
                  stackIn_71_0 = stackOut_68_0;
                  break L13;
                }
                L15: {
                  L16: {
                    var6 = stackIn_71_0;
                    if (vn.field_d == 85) {
                      break L16;
                    } else {
                      if (vn.field_d != 81) {
                        stackOut_77_0 = 0;
                        stackIn_78_0 = stackOut_77_0;
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  stackOut_75_0 = 1;
                  stackIn_78_0 = stackOut_75_0;
                  break L15;
                }
                L17: {
                  L18: {
                    var7 = stackIn_78_0;
                    if (var5 == null) {
                      break L18;
                    } else {
                      if (((le) this).field_V.j(39)) {
                        break L18;
                      } else {
                        if (!((le) this).field_G) {
                          break L18;
                        } else {
                          if (((le) this).field_Z != 0) {
                            break L18;
                          } else {
                            stackOut_88_0 = 1;
                            stackIn_91_0 = stackOut_88_0;
                            break L17;
                          }
                        }
                      }
                    }
                  }
                  stackOut_90_0 = 0;
                  stackIn_91_0 = stackOut_90_0;
                  break L17;
                }
                L19: {
                  var8 = stackIn_91_0;
                  if (var6 == 0) {
                    break L19;
                  } else {
                    if (var8 == 0) {
                      break L19;
                    } else {
                      if (((le) this).field_O) {
                        break L19;
                      } else {
                        L20: {
                          ((le) this).field_Z = 25;
                          if (((le) this).field_h > 0) {
                            this.i(param0 + 1999);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (!((le) this).field_ab) {
                            break L21;
                          } else {
                            L22: {
                              stackOut_105_0 = ((le) this).field_V.n((byte) -75);
                              stackIn_110_0 = stackOut_105_0;
                              stackIn_106_0 = stackOut_105_0;
                              if (var5.field_E != -1) {
                                stackOut_110_0 = stackIn_110_0;
                                stackOut_110_1 = 4;
                                stackIn_111_0 = stackOut_110_0;
                                stackIn_111_1 = stackOut_110_1;
                                break L22;
                              } else {
                                stackOut_106_0 = stackIn_106_0;
                                stackIn_108_0 = stackOut_106_0;
                                stackOut_108_0 = stackIn_108_0;
                                stackOut_108_1 = 2;
                                stackIn_111_0 = stackOut_108_0;
                                stackIn_111_1 = stackOut_108_1;
                                break L22;
                              }
                            }
                            int fieldTemp$2 = ((le) this).field_p + 1;
                            ((le) this).field_p = ((le) this).field_p + 1;
                            p.a(stackIn_111_0, stackIn_111_1, (byte) 11, 158, ((le) this).field_r, 1, ((le) this).field_bb, var4, fieldTemp$2);
                            break L21;
                          }
                        }
                        var5.c(0, 2);
                        ((le) this).field_m.a(-119, var5);
                        ti.field_N = -1;
                        eb.field_b = null;
                        break L19;
                      }
                    }
                  }
                }
                L23: {
                  if (var7 == 0) {
                    break L23;
                  } else {
                    if (var8 != 0) {
                      L24: {
                        ((le) this).field_Z = 25;
                        if (((le) this).field_h <= 0) {
                          break L24;
                        } else {
                          this.i(param0 ^ 2001);
                          break L24;
                        }
                      }
                      L25: {
                        if (!((le) this).field_ab) {
                          break L25;
                        } else {
                          L26: {
                            stackOut_123_0 = ((le) this).field_V.n((byte) -75);
                            stackIn_128_0 = stackOut_123_0;
                            stackIn_124_0 = stackOut_123_0;
                            if (-1 != var5.field_E) {
                              stackOut_128_0 = stackIn_128_0;
                              stackOut_128_1 = 5;
                              stackIn_129_0 = stackOut_128_0;
                              stackIn_129_1 = stackOut_128_1;
                              break L26;
                            } else {
                              stackOut_124_0 = stackIn_124_0;
                              stackIn_126_0 = stackOut_124_0;
                              stackOut_126_0 = stackIn_126_0;
                              stackOut_126_1 = 3;
                              stackIn_129_0 = stackOut_126_0;
                              stackIn_129_1 = stackOut_126_1;
                              break L26;
                            }
                          }
                          int fieldTemp$3 = ((le) this).field_p + 1;
                          ((le) this).field_p = ((le) this).field_p + 1;
                          p.a(stackIn_129_0, stackIn_129_1, (byte) 11, 158, ((le) this).field_r, 1, ((le) this).field_bb, var4, fieldTemp$3);
                          break L25;
                        }
                      }
                      var5.c(param0 + -1, 3);
                      ((le) this).field_m.a(-90, var5);
                      ti.field_N = -1;
                      eb.field_b = null;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
                if (~vn.field_d != ~bg.field_c) {
                  break L11;
                } else {
                  if (!((le) this).field_O) {
                    L27: {
                      if (((le) this).field_ab) {
                        break L27;
                      } else {
                        this.d(false);
                        if (var9 == 0) {
                          break L11;
                        } else {
                          break L27;
                        }
                      }
                    }
                    this.a(-113);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
            }
            L28: {
              ((le) this).field_O = false;
              if (((le) this).field_ab) {
                break L28;
              } else {
                if (!qg.a(-79)) {
                  break L28;
                } else {
                  vg.a((byte) 86);
                  break L28;
                }
              }
            }
            if (13 == vn.field_d) {
              L29: {
                var3 = 1;
                if (((le) this).field_ab) {
                  L30: {
                    L31: {
                      if (0 > ((le) this).field_I) {
                        break L31;
                      } else {
                        if (null == ((le) this).field_V.a(((le) this).field_I, true)) {
                          break L31;
                        } else {
                          if ((1 << ((le) this).field_I & ((le) this).field_J) == 0) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    var3 = 4;
                    if (var9 == 0) {
                      break L29;
                    } else {
                      break L30;
                    }
                  }
                  var3 = 2;
                  break L29;
                } else {
                  break L29;
                }
              }
              var4 = var3;
              gj.a(false, true, var4, mn.field_r);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        RuntimeException var2 = null;
        hl var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_ref = (hl) (Object) ((le) this).field_cb.b(12623);
              if (param0 > 26) {
                break L1;
              } else {
                ((le) this).field_v = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var2_ref) {
                    break L4;
                  } else {
                    var3 = 0;
                    var4 = var2_ref.field_k;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                L10: {
                                  L11: {
                                    L12: {
                                      if (var4 == 61) {
                                        boolean dupTemp$7 = this.b((byte) -116);
                                        var3 = dupTemp$7 ? 1 : 0;
                                        if (!dupTemp$7) {
                                          break L5;
                                        } else {
                                          this.a(5158, var2_ref.field_j);
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      } else {
                                        L13: {
                                          if (var4 != 65) {
                                            break L13;
                                          } else {
                                            if (var5 == 0) {
                                              break L12;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (var4 != 66) {
                                            break L14;
                                          } else {
                                            if (var5 == 0) {
                                              break L11;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        if (var4 == 63) {
                                          break L10;
                                        } else {
                                          L15: {
                                            if (var4 != 64) {
                                              break L15;
                                            } else {
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          if (var4 == 62) {
                                            break L8;
                                          } else {
                                            if (var4 == 67) {
                                              break L7;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    boolean dupTemp$8 = this.e(true);
                                    var3 = dupTemp$8 ? 1 : 0;
                                    if (!dupTemp$8) {
                                      break L5;
                                    } else {
                                      this.a(var2_ref.field_j, -114);
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  boolean dupTemp$9 = this.f(false);
                                  var3 = dupTemp$9 ? 1 : 0;
                                  if (!dupTemp$9) {
                                    break L5;
                                  } else {
                                    this.c(var2_ref.field_j, 55);
                                    if (var5 == 0) {
                                      break L5;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                boolean dupTemp$10 = this.l(-8712);
                                var3 = dupTemp$10 ? 1 : 0;
                                if (dupTemp$10) {
                                  this.b(50, var2_ref.field_j);
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              boolean dupTemp$11 = this.f(-126);
                              var3 = dupTemp$11 ? 1 : 0;
                              if (dupTemp$11) {
                                this.a((byte) 95, var2_ref.field_j);
                                if (var5 == 0) {
                                  break L5;
                                } else {
                                  break L8;
                                }
                              } else {
                                break L5;
                              }
                            }
                            boolean dupTemp$12 = this.j(-27726);
                            var3 = dupTemp$12 ? 1 : 0;
                            if (!dupTemp$12) {
                              break L5;
                            } else {
                              this.a(var2_ref.field_j, jb.field_v - var2_ref.field_g, 8888);
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          boolean dupTemp$13 = this.b(false);
                          var3 = dupTemp$13 ? 1 : 0;
                          if (dupTemp$13) {
                            this.b(var2_ref.field_j, -1);
                            if (var5 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          } else {
                            break L5;
                          }
                        }
                        throw new RuntimeException((String) null);
                      }
                      if (var3 != 0) {
                        var2_ref.a(true);
                        var2_ref = (hl) (Object) ((le) this).field_cb.a(0);
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        return;
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
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.I(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        try {
            field_E = null;
            field_db = null;
            field_A = null;
            int var1_int = -36 % ((param0 - 27) / 54);
            field_N = null;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "le.EB(" + param0 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        ml var5_ref_ml = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
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
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        int stackIn_106_3 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        int stackIn_110_3 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_134_2 = 0;
        int stackIn_134_3 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_135_2 = 0;
        int stackIn_135_3 = 0;
        int stackIn_135_4 = 0;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        int stackIn_136_2 = 0;
        int stackIn_136_3 = 0;
        int stackIn_136_4 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_137_2 = 0;
        int stackIn_137_3 = 0;
        int stackIn_137_4 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_138_2 = 0;
        int stackIn_138_3 = 0;
        int stackIn_138_4 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_139_2 = 0;
        int stackIn_139_3 = 0;
        int stackIn_139_4 = 0;
        int stackIn_139_5 = 0;
        ll[] stackIn_140_0 = null;
        ll[] stackIn_141_0 = null;
        ll[] stackIn_142_0 = null;
        ll[] stackIn_143_0 = null;
        ll[] stackIn_144_0 = null;
        ll[] stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        int stackOut_109_3 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        int stackOut_133_3 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_134_2 = 0;
        int stackOut_134_3 = 0;
        int stackOut_134_4 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        int stackOut_136_2 = 0;
        int stackOut_136_3 = 0;
        int stackOut_136_4 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        int stackOut_138_2 = 0;
        int stackOut_138_3 = 0;
        int stackOut_138_4 = 0;
        int stackOut_138_5 = 0;
        int stackOut_137_0 = 0;
        int stackOut_137_1 = 0;
        int stackOut_137_2 = 0;
        int stackOut_137_3 = 0;
        int stackOut_137_4 = 0;
        int stackOut_137_5 = 0;
        int stackOut_135_0 = 0;
        int stackOut_135_1 = 0;
        int stackOut_135_2 = 0;
        int stackOut_135_3 = 0;
        int stackOut_135_4 = 0;
        int stackOut_135_5 = 0;
        ll[] stackOut_139_0 = null;
        ll[] stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        ll[] stackOut_140_0 = null;
        ll[] stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        ll[] stackOut_141_0 = null;
        ll[] stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          kl.field_A = 320;
          ((le) this).field_H = true;
          ((le) this).field_B = false;
          ((le) this).field_X = true;
          ((le) this).field_g = true;
          mo.field_f = null;
          var3_int = n.field_g.field_nb;
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
                      var7 = -150 + (var3_int + ii.a((byte) -117));
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
                              mo.field_f = vm.field_d[((le) this).field_V.field_x[((le) this).field_I] - -128 - -12];
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
                          stackOut_101_0 = var6;
                          stackOut_101_1 = 2 + -(var9 / 2) + var7 - 1;
                          stackOut_101_2 = 20;
                          stackOut_101_3 = var8;
                          stackIn_134_0 = stackOut_101_0;
                          stackIn_134_1 = stackOut_101_1;
                          stackIn_134_2 = stackOut_101_2;
                          stackIn_134_3 = stackOut_101_3;
                          stackIn_102_0 = stackOut_101_0;
                          stackIn_102_1 = stackOut_101_1;
                          stackIn_102_2 = stackOut_101_2;
                          stackIn_102_3 = stackOut_101_3;
                          if (var11 != 0) {
                            break L23;
                          } else {
                            L34: {
                              stackOut_102_0 = stackIn_102_0;
                              stackOut_102_1 = stackIn_102_1;
                              stackOut_102_2 = stackIn_102_2;
                              stackIn_105_0 = stackOut_102_0;
                              stackIn_105_1 = stackOut_102_1;
                              stackIn_105_2 = stackOut_102_2;
                              stackIn_103_0 = stackOut_102_0;
                              stackIn_103_1 = stackOut_102_1;
                              stackIn_103_2 = stackOut_102_2;
                              if (stackIn_102_3 == 0) {
                                stackOut_105_0 = stackIn_105_0;
                                stackOut_105_1 = stackIn_105_1;
                                stackOut_105_2 = stackIn_105_2;
                                stackOut_105_3 = 7433831;
                                stackIn_106_0 = stackOut_105_0;
                                stackIn_106_1 = stackOut_105_1;
                                stackIn_106_2 = stackOut_105_2;
                                stackIn_106_3 = stackOut_105_3;
                                break L34;
                              } else {
                                stackOut_103_0 = stackIn_103_0;
                                stackOut_103_1 = stackIn_103_1;
                                stackOut_103_2 = stackIn_103_2;
                                stackIn_104_0 = stackOut_103_0;
                                stackIn_104_1 = stackOut_103_1;
                                stackIn_104_2 = stackOut_103_2;
                                stackOut_104_0 = stackIn_104_0;
                                stackOut_104_1 = stackIn_104_1;
                                stackOut_104_2 = stackIn_104_2;
                                stackOut_104_3 = 13093320;
                                stackIn_106_0 = stackOut_104_0;
                                stackIn_106_1 = stackOut_104_1;
                                stackIn_106_2 = stackOut_104_2;
                                stackIn_106_3 = stackOut_104_3;
                                break L34;
                              }
                            }
                            de.i(stackIn_106_0, stackIn_106_1, stackIn_106_2, stackIn_106_3);
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
                            stackOut_109_0 = var6;
                            stackOut_109_1 = -1 + (-(var9 / 2) + var7);
                            stackOut_109_2 = 16;
                            stackOut_109_3 = var8;
                            stackIn_134_0 = stackOut_109_0;
                            stackIn_134_1 = stackOut_109_1;
                            stackIn_134_2 = stackOut_109_2;
                            stackIn_134_3 = stackOut_109_3;
                            stackIn_110_0 = stackOut_109_0;
                            stackIn_110_1 = stackOut_109_1;
                            stackIn_110_2 = stackOut_109_2;
                            stackIn_110_3 = stackOut_109_3;
                            if (var11 != 0) {
                              break L23;
                            } else {
                              L37: {
                                stackOut_110_0 = stackIn_110_0;
                                stackOut_110_1 = stackIn_110_1;
                                stackOut_110_2 = stackIn_110_2;
                                stackIn_113_0 = stackOut_110_0;
                                stackIn_113_1 = stackOut_110_1;
                                stackIn_113_2 = stackOut_110_2;
                                stackIn_111_0 = stackOut_110_0;
                                stackIn_111_1 = stackOut_110_1;
                                stackIn_111_2 = stackOut_110_2;
                                if (stackIn_110_3 == 0) {
                                  stackOut_113_0 = stackIn_113_0;
                                  stackOut_113_1 = stackIn_113_1;
                                  stackOut_113_2 = stackIn_113_2;
                                  stackOut_113_3 = 13093320;
                                  stackIn_114_0 = stackOut_113_0;
                                  stackIn_114_1 = stackOut_113_1;
                                  stackIn_114_2 = stackOut_113_2;
                                  stackIn_114_3 = stackOut_113_3;
                                  break L37;
                                } else {
                                  stackOut_111_0 = stackIn_111_0;
                                  stackOut_111_1 = stackIn_111_1;
                                  stackOut_111_2 = stackIn_111_2;
                                  stackIn_112_0 = stackOut_111_0;
                                  stackIn_112_1 = stackOut_111_1;
                                  stackIn_112_2 = stackOut_111_2;
                                  stackOut_112_0 = stackIn_112_0;
                                  stackOut_112_1 = stackIn_112_1;
                                  stackOut_112_2 = stackIn_112_2;
                                  stackOut_112_3 = 16777215;
                                  stackIn_114_0 = stackOut_112_0;
                                  stackIn_114_1 = stackOut_112_1;
                                  stackIn_114_2 = stackOut_112_2;
                                  stackIn_114_3 = stackOut_112_3;
                                  break L37;
                                }
                              }
                              de.i(stackIn_114_0, stackIn_114_1, stackIn_114_2, stackIn_114_3);
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
              var7 = -16 + (var3_int - 6);
              stackOut_133_0 = -16 + var6;
              stackOut_133_1 = var7 - 16;
              stackOut_133_2 = 32;
              stackOut_133_3 = 32;
              stackIn_134_0 = stackOut_133_0;
              stackIn_134_1 = stackOut_133_1;
              stackIn_134_2 = stackOut_133_2;
              stackIn_134_3 = stackOut_133_3;
              break L23;
            } else {
              break L22;
            }
          }
          L42: {
            stackOut_134_0 = stackIn_134_0;
            stackOut_134_1 = stackIn_134_1;
            stackOut_134_2 = stackIn_134_2;
            stackOut_134_3 = stackIn_134_3;
            stackOut_134_4 = 15;
            stackIn_136_0 = stackOut_134_0;
            stackIn_136_1 = stackOut_134_1;
            stackIn_136_2 = stackOut_134_2;
            stackIn_136_3 = stackOut_134_3;
            stackIn_136_4 = stackOut_134_4;
            stackIn_135_0 = stackOut_134_0;
            stackIn_135_1 = stackOut_134_1;
            stackIn_135_2 = stackOut_134_2;
            stackIn_135_3 = stackOut_134_3;
            stackIn_135_4 = stackOut_134_4;
            if (vh.field_t > 0) {
              stackOut_136_0 = stackIn_136_0;
              stackOut_136_1 = stackIn_136_1;
              stackOut_136_2 = stackIn_136_2;
              stackOut_136_3 = stackIn_136_3;
              stackOut_136_4 = stackIn_136_4;
              stackIn_138_0 = stackOut_136_0;
              stackIn_138_1 = stackOut_136_1;
              stackIn_138_2 = stackOut_136_2;
              stackIn_138_3 = stackOut_136_3;
              stackIn_138_4 = stackOut_136_4;
              stackIn_137_0 = stackOut_136_0;
              stackIn_137_1 = stackOut_136_1;
              stackIn_137_2 = stackOut_136_2;
              stackIn_137_3 = stackOut_136_3;
              stackIn_137_4 = stackOut_136_4;
              if ((8 & jb.field_v) == 0) {
                stackOut_138_0 = stackIn_138_0;
                stackOut_138_1 = stackIn_138_1;
                stackOut_138_2 = stackIn_138_2;
                stackOut_138_3 = stackIn_138_3;
                stackOut_138_4 = stackIn_138_4;
                stackOut_138_5 = 16711935;
                stackIn_139_0 = stackOut_138_0;
                stackIn_139_1 = stackOut_138_1;
                stackIn_139_2 = stackOut_138_2;
                stackIn_139_3 = stackOut_138_3;
                stackIn_139_4 = stackOut_138_4;
                stackIn_139_5 = stackOut_138_5;
                break L42;
              } else {
                stackOut_137_0 = stackIn_137_0;
                stackOut_137_1 = stackIn_137_1;
                stackOut_137_2 = stackIn_137_2;
                stackOut_137_3 = stackIn_137_3;
                stackOut_137_4 = stackIn_137_4;
                stackOut_137_5 = 16744703;
                stackIn_139_0 = stackOut_137_0;
                stackIn_139_1 = stackOut_137_1;
                stackIn_139_2 = stackOut_137_2;
                stackIn_139_3 = stackOut_137_3;
                stackIn_139_4 = stackOut_137_4;
                stackIn_139_5 = stackOut_137_5;
                break L42;
              }
            } else {
              stackOut_135_0 = stackIn_135_0;
              stackOut_135_1 = stackIn_135_1;
              stackOut_135_2 = stackIn_135_2;
              stackOut_135_3 = stackIn_135_3;
              stackOut_135_4 = stackIn_135_4;
              stackOut_135_5 = 16777215;
              stackIn_139_0 = stackOut_135_0;
              stackIn_139_1 = stackOut_135_1;
              stackIn_139_2 = stackOut_135_2;
              stackIn_139_3 = stackOut_135_3;
              stackIn_139_4 = stackOut_135_4;
              stackIn_139_5 = stackOut_135_5;
              break L42;
            }
          }
          L43: {
            de.g(stackIn_139_0, stackIn_139_1, stackIn_139_2, stackIn_139_3, stackIn_139_4, stackIn_139_5);
            de.a(var6 + -16, -16 + var7, 32, 32, 15, 0);
            stackOut_139_0 = tg.field_b;
            stackIn_144_0 = stackOut_139_0;
            stackIn_140_0 = stackOut_139_0;
            if (0 >= vh.field_t) {
              stackOut_144_0 = (ll[]) (Object) stackIn_144_0;
              stackOut_144_1 = 9;
              stackIn_145_0 = stackOut_144_0;
              stackIn_145_1 = stackOut_144_1;
              break L43;
            } else {
              stackOut_140_0 = (ll[]) (Object) stackIn_140_0;
              stackIn_143_0 = stackOut_140_0;
              stackIn_141_0 = stackOut_140_0;
              if ((jb.field_v & 8) != 0) {
                stackOut_143_0 = (ll[]) (Object) stackIn_143_0;
                stackOut_143_1 = 11;
                stackIn_145_0 = stackOut_143_0;
                stackIn_145_1 = stackOut_143_1;
                break L43;
              } else {
                stackOut_141_0 = (ll[]) (Object) stackIn_141_0;
                stackIn_142_0 = stackOut_141_0;
                stackOut_142_0 = (ll[]) (Object) stackIn_142_0;
                stackOut_142_1 = 10;
                stackIn_145_0 = stackOut_142_0;
                stackIn_145_1 = stackOut_142_1;
                break L43;
              }
            }
          }
          ((ll) (Object) stackIn_145_0[stackIn_145_1]).a(var6 - 16, var7 + -16);
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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        ml var6_ref_ml = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 50;
            var4 = param1;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (~((le) this).field_V.s(0) >= ~var5) {
                        break L5;
                      } else {
                        var6_ref_ml = ((le) this).field_V.a(var5, true);
                        if (var7 != 0) {
                          break L4;
                        } else {
                          L6: {
                            if (var6_ref_ml != null) {
                              L7: {
                                if (~var6_ref_ml.m(-20357) >= ~var3_int) {
                                  break L7;
                                } else {
                                  var3_int = var6_ref_ml.m(-20357);
                                  break L7;
                                }
                              }
                              if (~var4 <= ~mi.field_B.b(((le) this).field_V.field_k[var5])) {
                                break L6;
                              } else {
                                var4 = mi.field_B.b(((le) this).field_V.field_k[var5]);
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (((le) this).field_V.field_d) {
                      break L4;
                    } else {
                      var5 = 0;
                      L8: while (true) {
                        L9: {
                          if (~var5 <= ~((le) this).field_V.s(0)) {
                            break L9;
                          } else {
                            param0 = this.b(param0, var4, var5, param1 + -4);
                            var5++;
                            if (var7 != 0) {
                              break L3;
                            } else {
                              if (var7 == 0) {
                                continue L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (var7 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var5 = 0;
                  L10: while (true) {
                    L11: {
                      if (((le) this).field_V.s(0) <= var5) {
                        break L11;
                      } else {
                        param0 = this.b(param0, var4, var5, -4);
                        var5 += 2;
                        if (var7 != 0) {
                          break L3;
                        } else {
                          if (var7 == 0) {
                            continue L10;
                          } else {
                            break L11;
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
                    L12: while (true) {
                      if (~((le) this).field_V.s(0) >= ~var5) {
                        break L3;
                      } else {
                        stackOut_30_0 = this.b(param0, var4, var5, -4);
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        if (var7 != 0) {
                          break L2;
                        } else {
                          param0 = stackIn_31_0;
                          var5 += 2;
                          if (var7 == 0) {
                            continue L12;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_32_0 = param0;
                stackIn_33_0 = stackOut_32_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "le.WA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_33_0;
    }

    private final void o(int param0) {
        int var2_int = 0;
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
        Object stackIn_18_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int[] stackOut_2_0 = null;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
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
                  var2_int = stackIn_5_0[stackIn_5_1];
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
                de.f(an.field_f + -var3 - (var6 + -(-(an.field_f >> -382287263) + vn.field_c >> ((le) this).field_K)), (ol.field_g + -(var5 >> -1156768319) >> ((le) this).field_K) + var5 + (-var4 + -var6), an.field_f >> ((le) this).field_K, var5 >> ((le) this).field_K, 16777215, 128);
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
                            stackOut_17_0 = null;
                            stackIn_34_0 = stackOut_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            if (var17 != 0) {
                              break L7;
                            } else {
                              L9: {
                                if (stackIn_18_0 == (Object) (Object) var9) {
                                  break L9;
                                } else {
                                  if (var9.o(-22625) == 12) {
                                    break L9;
                                  } else {
                                    var2_int = 0;
                                    var10 = var9.g(false);
                                    var2_int = nj.field_n[var10];
                                    var11_int = an.field_f + (-var3 - var6) - -(var9.f(-99) >> ((le) this).field_K);
                                    var12_int = var5 - (var4 + var6 + -(var9.i((byte) 110) - (var9.p(param0 + -8331) >> -1632296895) >> ((le) this).field_K));
                                    de.i(var11_int, var12_int, 14 + (var9.p(-8323) >> 1463375137) >> ((le) this).field_K, (var2_int | 8421504) ^ 8421504);
                                    de.i(var11_int, var12_int, var9.p(param0 + -8331) >> -356206879 >> ((le) this).field_K, var2_int);
                                    de.c(var11_int, var12_int, 14 + (var9.p(-8323) >> 1063532353) >> ((le) this).field_K, 8421504 ^ (var2_int | 8421504));
                                    gn.a(14 + (var9.p(-8323) >> -106397151) >> ((le) this).field_K, (byte) 72, 255, var11_int, var12_int);
                                    if (var9.y(param0 + 17563) != ((le) this).field_V.d(false)) {
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
                        stackOut_33_0 = null;
                        stackIn_34_0 = stackOut_33_0;
                        break L7;
                      }
                      eb.field_b = (mc[]) (Object) stackIn_34_0;
                      var10 = ((le) this).field_V.s(param0 ^ 8);
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
                              stackOut_36_0 = ~var9.o(-22625);
                              stackOut_36_1 = -13;
                              stackIn_54_0 = stackOut_36_0;
                              stackIn_54_1 = stackOut_36_1;
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              if (var17 != 0) {
                                break L13;
                              } else {
                                L15: {
                                  if (stackIn_37_0 == stackIn_37_1) {
                                    break L15;
                                  } else {
                                    if (null != var9.w(24501)) {
                                      break L15;
                                    } else {
                                      var14 = var9.y(param0 ^ 17579);
                                      var11[var14] = -var6 + an.field_f + -var3 + (var9.f(-85) >> ((le) this).field_K);
                                      var12[var14] = -var6 + -var4 + (var5 + -8);
                                      var13[var14] = mi.field_B.b(((le) this).field_V.field_k[var14]);
                                      var15_int = 0;
                                      L16: while (true) {
                                        if (var15_int >= var14) {
                                          break L15;
                                        } else {
                                          stackOut_43_0 = -1;
                                          stackOut_43_1 = ~var12[var15_int];
                                          stackIn_54_0 = stackOut_43_0;
                                          stackIn_54_1 = stackOut_43_1;
                                          stackIn_44_0 = stackOut_43_0;
                                          stackIn_44_1 = stackOut_43_1;
                                          if (var17 != 0) {
                                            break L13;
                                          } else {
                                            L17: {
                                              if (stackIn_44_0 == stackIn_44_1) {
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
                          stackOut_53_0 = -var6 + (-var3 + an.field_f);
                          stackOut_53_1 = 0;
                          stackIn_54_0 = stackOut_53_0;
                          stackIn_54_1 = stackOut_53_1;
                          break L13;
                        }
                        de.h(stackIn_54_0, stackIn_54_1, -var6 + an.field_f, -var6 + var5);
                        var9 = (ml) (Object) var8.b(param0 + 12615);
                        L18: while (true) {
                          L19: {
                            if (null == var9) {
                              break L19;
                            } else {
                              stackOut_56_0 = ~var9.o(-22625);
                              stackOut_56_1 = -13;
                              stackIn_75_0 = stackOut_56_0;
                              stackIn_75_1 = stackOut_56_1;
                              stackIn_57_0 = stackOut_56_0;
                              stackIn_57_1 = stackOut_56_1;
                              if (var17 != 0) {
                                break L0;
                              } else {
                                L20: {
                                  if (stackIn_57_0 == stackIn_57_1) {
                                    break L20;
                                  } else {
                                    if (null == var9.w(24501)) {
                                      var2_int = 0;
                                      var14 = var9.y(17571);
                                      var2_int = nj.field_n[var14];
                                      var15_int = var9.i((byte) -39);
                                      var16 = var9.p(-8323);
                                      de.d(var11[var14], var12[var14] - 1, -var6 + (var5 + -var4) + ((var15_int + -var16 >> ((le) this).field_K) - var12[var14]), var2_int);
                                      de.d(var11[var14] - 1, var12[var14] - 2, (var15_int - var16 >> ((le) this).field_K) + var5 + (-var4 + (-var6 + -var12[var14])), 8421504 ^ (8421504 | var2_int));
                                      de.d(1 + var11[var14], -2 + var12[var14], -var6 + -var4 + var5 - -(-var16 + var15_int >> ((le) this).field_K) - var12[var14], (var2_int | 8421504) ^ 8421504);
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
                            if (null == var9) {
                              break L5;
                            } else {
                              stackOut_66_0 = 12;
                              stackOut_66_1 = var9.o(-22625);
                              stackIn_75_0 = stackOut_66_0;
                              stackIn_75_1 = stackOut_66_1;
                              stackIn_67_0 = stackOut_66_0;
                              stackIn_67_1 = stackOut_66_1;
                              if (var17 != 0) {
                                break L0;
                              } else {
                                L22: {
                                  if (stackIn_67_0 == stackIn_67_1) {
                                    break L22;
                                  } else {
                                    if (var9.w(param0 + 24493) != null) {
                                      break L22;
                                    } else {
                                      var2_int = 0;
                                      var14 = var9.y(17571);
                                      var2_int = nj.field_n[var14];
                                      var15 = ((le) this).field_V.field_k[var14];
                                      mi.field_B.b(var15, var11[var14], var12[var14] + -1, (var2_int | 8421504) ^ 8421504, 0);
                                      mi.field_B.b(var15, -1 + var11[var14], var12[var14], 8421504 ^ (8421504 | var2_int), 0);
                                      mi.field_B.b(var15, var11[var14], var12[var14], var2_int, -1);
                                      break L22;
                                    }
                                  }
                                }
                                var9 = (ml) (Object) var8.a(param0 ^ 8);
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
          stackOut_74_0 = param0;
          stackOut_74_1 = 8;
          stackIn_75_0 = stackOut_74_0;
          stackIn_75_1 = stackOut_74_1;
          break L0;
        }
        L23: {
          if (stackIn_75_0 == stackIn_75_1) {
            break L23;
          } else {
            ((le) this).field_G = true;
            break L23;
          }
        }
    }

    final static void c(int param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (kh.field_c != null) {
                fk.a(0, kh.field_c);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (eo.field_c == null) {
                break L2;
              } else {
                eo.field_c.a(param0 ^ -22718, param1);
                break L2;
              }
            }
            L3: {
              ji.a(param1, (byte) -101);
              if (db.field_a != null) {
                db.field_a.a(param1, true);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ed.a((byte) 90, param1);
              if (param0 == 1) {
                break L4;
              } else {
                field_A = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4_int = 0;
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
        int stackIn_27_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_211_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_209_0 = 0;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          var5 = -120 / ((param0 - 58) / 53);
          var4_int = n.field_g.field_nb;
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
                      tg.field_b[5].b().a(var7, var8, ((le) this).field_P << -1048402744, 4096 - Math.abs(((le) this).field_P - 128));
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
              var7 = var6.f(-98);
              var8 = var6.i((byte) -5);
              if (((le) this).field_s == -1000) {
                break L3;
              } else {
                L4: {
                  if (ti.field_N == 78) {
                    break L4;
                  } else {
                    L5: {
                      if (ti.field_N == 4) {
                        break L5;
                      } else {
                        L6: {
                          if (ti.field_N != 150) {
                            break L6;
                          } else {
                            L7: {
                              var9_int = var6.p(-8323);
                              if (((le) this).field_V.a(((le) this).field_s, ((le) this).field_V.field_H - 16, (byte) -75, var6)) {
                                stackOut_26_0 = 65280;
                                stackIn_27_0 = stackOut_26_0;
                                break L7;
                              } else {
                                stackOut_25_0 = 16711680;
                                stackIn_27_0 = stackOut_25_0;
                                break L7;
                              }
                            }
                            L8: {
                              var10 = stackIn_27_0;
                              ce.field_m.a(true);
                              de.h((an.field_f >> 1867039425) + -param1, (var4_int >> 471174177) + -param2, ((le) this).field_V.field_y + -param1 + (an.field_f >> 1160506721), (var4_int >> -1858825407) + (((le) this).field_V.field_H + -param2));
                              de.a();
                              var11_int = (an.field_f >> -2048079903) + (((le) this).field_s - param1);
                              var12 = (var4_int >> 194689985) + -param2 + ((le) this).field_V.field_H + (-16 + -(var9_int >> 1358143937));
                              de.c(var11_int, var12, var9_int >> -386938239, var10, 128);
                              gn.a(var9_int >> 1740083905, (byte) 78, 3 * Math.abs(-16 + (((le) this).field_P & 31)) - -128, var11_int, var12);
                              if (((le) this).field_V.c((byte) 89)) {
                                break L8;
                              } else {
                                tg.field_b[5].b().a(var11_int, var12, ((le) this).field_P << -597832120, var9_int * (-(Math.abs((((le) this).field_P & 31) - 16) * 64) + 4096) / 32);
                                break L8;
                              }
                            }
                            if (var15 == 0) {
                              break L1;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L9: {
                          if (ti.field_N == 56) {
                            break L9;
                          } else {
                            if (ti.field_N == 57) {
                              break L9;
                            } else {
                              if (ti.field_N == 32) {
                                break L9;
                              } else {
                                if (33 == ti.field_N) {
                                  break L9;
                                } else {
                                  if (ti.field_N == 42) {
                                    break L9;
                                  } else {
                                    if (ti.field_N == 17) {
                                      break L9;
                                    } else {
                                      if (ti.field_N == 23) {
                                        break L9;
                                      } else {
                                        if (ti.field_N == 59) {
                                          break L9;
                                        } else {
                                          if (ti.field_N == 47) {
                                            break L9;
                                          } else {
                                            if (ti.field_N == 65) {
                                              break L9;
                                            } else {
                                              if (ti.field_N == 67) {
                                                break L9;
                                              } else {
                                                if (ti.field_N == 64) {
                                                  break L9;
                                                } else {
                                                  if (ti.field_N == 44) {
                                                    break L9;
                                                  } else {
                                                    if (ti.field_N == 76) {
                                                      break L9;
                                                    } else {
                                                      if (ti.field_N == 77) {
                                                        break L9;
                                                      } else {
                                                        if (ti.field_N == 6) {
                                                          break L9;
                                                        } else {
                                                          if (79 == ti.field_N) {
                                                            break L9;
                                                          } else {
                                                            if (ti.field_N == 98) {
                                                              break L9;
                                                            } else {
                                                              if (ti.field_N == 90) {
                                                                break L9;
                                                              } else {
                                                                if (ti.field_N == 104) {
                                                                  break L9;
                                                                } else {
                                                                  if (ti.field_N == 92) {
                                                                    break L9;
                                                                  } else {
                                                                    if (107 == ti.field_N) {
                                                                      break L9;
                                                                    } else {
                                                                      if (112 == ti.field_N) {
                                                                        break L9;
                                                                      } else {
                                                                        if (ti.field_N == 118) {
                                                                          break L9;
                                                                        } else {
                                                                          L10: {
                                                                            if (9 != ti.field_N) {
                                                                              break L10;
                                                                            } else {
                                                                              L11: {
                                                                                if (((le) this).field_V.a(false, ((le) this).field_s, ((le) this).field_r)) {
                                                                                  stackOut_83_0 = 65280;
                                                                                  stackIn_84_0 = stackOut_83_0;
                                                                                  break L11;
                                                                                } else {
                                                                                  stackOut_82_0 = 16711680;
                                                                                  stackIn_84_0 = stackOut_82_0;
                                                                                  break L11;
                                                                                }
                                                                              }
                                                                              L12: {
                                                                                var9_int = stackIn_84_0;
                                                                                ce.field_m.a(true);
                                                                                var10 = 32;
                                                                                var11_int = (an.field_f >> 1352292737) + (-param1 + ((le) this).field_s);
                                                                                var12 = -(var10 >> -1349047295) + (-param2 + ((le) this).field_r - -(var4_int >> -2023381375));
                                                                                de.c(var11_int, var12, var10 >> -854135615, var9_int, 128);
                                                                                gn.a(var10 >> -2026415711, (byte) 94, Math.abs((31 & ((le) this).field_P) + -16) * 3 - -128, var11_int, var12);
                                                                                if (((le) this).field_V.c((byte) 89)) {
                                                                                  break L12;
                                                                                } else {
                                                                                  tg.field_b[5].b().a(var11_int, var12, ((le) this).field_P << -1147339096, (4096 - 64 * Math.abs((((le) this).field_P & 31) - 16)) * var10 / 32);
                                                                                  break L12;
                                                                                }
                                                                              }
                                                                              if (var15 == 0) {
                                                                                break L1;
                                                                              } else {
                                                                                break L10;
                                                                              }
                                                                            }
                                                                          }
                                                                          L13: {
                                                                            if (ti.field_N != 5) {
                                                                              break L13;
                                                                            } else {
                                                                              L14: {
                                                                                L15: {
                                                                                  if (!((le) this).field_V.a(false, ((le) this).field_s, ((le) this).field_r)) {
                                                                                    break L15;
                                                                                  } else {
                                                                                    if (!((le) this).field_V.a(false, var6.f(100), -32 + var6.i((byte) -65) - var6.p(-8323))) {
                                                                                      break L15;
                                                                                    } else {
                                                                                      stackOut_93_0 = 65280;
                                                                                      stackIn_95_0 = stackOut_93_0;
                                                                                      break L14;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                stackOut_94_0 = 16711680;
                                                                                stackIn_95_0 = stackOut_94_0;
                                                                                break L14;
                                                                              }
                                                                              L16: {
                                                                                var9_int = stackIn_95_0;
                                                                                ce.field_m.a(true);
                                                                                var10 = 32;
                                                                                var11_int = (an.field_f >> -324234367) + -param1 + var7;
                                                                                var12 = (var4_int >> 132038113) + var8 - param2 - (var6.p(-8323) - -32);
                                                                                de.c(var11_int, var12, var10 >> 61031137, var9_int, 128);
                                                                                gn.a(var10 >> -1645074943, (byte) 63, 128 + 3 * Math.abs((((le) this).field_P & 31) + -16), var11_int, var12);
                                                                                var13 = ((le) this).field_s - param1 - -(an.field_f >> -1130629183);
                                                                                var14 = (var4_int >> -2136676671) + (((le) this).field_r - param2) + -(var10 >> -1518423199);
                                                                                de.c(var13, var14, var10 >> 1937218049, var9_int, 128);
                                                                                gn.a(var10 >> -441540127, (byte) 125, 128 + Math.abs(-16 + (((le) this).field_P & 31)) * 3, var13, var14);
                                                                                if (!((le) this).field_V.c((byte) 89)) {
                                                                                  tg.field_b[5].b().a(var13, var14, ((le) this).field_P << -485192952, (4096 - 64 * Math.abs((((le) this).field_P & 31) + -16)) * var10 / 32);
                                                                                  break L16;
                                                                                } else {
                                                                                  break L16;
                                                                                }
                                                                              }
                                                                              if (var15 == 0) {
                                                                                break L1;
                                                                              } else {
                                                                                break L13;
                                                                              }
                                                                            }
                                                                          }
                                                                          L17: {
                                                                            if (ti.field_N == 30) {
                                                                              break L17;
                                                                            } else {
                                                                              if (ti.field_N == -1) {
                                                                                break L1;
                                                                              } else {
                                                                                var9_int = -param1 + ((le) this).field_s + (an.field_f >> 295157441);
                                                                                var10 = -param2 + ((le) this).field_r - -(var4_int >> -390360255);
                                                                                tg.field_b[5].b().a(var9_int, var10, ((le) this).field_P << -953705144, -Math.abs(-128 + ((le) this).field_P) + 4096);
                                                                                if (var15 == 0) {
                                                                                  break L1;
                                                                                } else {
                                                                                  break L17;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          L18: {
                                                                            if (((le) this).field_V.a(((le) this).field_s, var6, 30882, ((le) this).field_r)) {
                                                                              stackOut_107_0 = 65280;
                                                                              stackIn_108_0 = stackOut_107_0;
                                                                              break L18;
                                                                            } else {
                                                                              stackOut_106_0 = 16711680;
                                                                              stackIn_108_0 = stackOut_106_0;
                                                                              break L18;
                                                                            }
                                                                          }
                                                                          var9_int = stackIn_108_0;
                                                                          bg.field_e.a(-(bg.field_e.field_n >> -646388831) + ((an.field_f >> -2081649343) + -param1 + ((le) this).field_s), (var4_int >> 639158721) + (-param2 + (((le) this).field_r - bg.field_e.field_w)), var9_int);
                                                                          bg.field_e.c(-param1 + ((le) this).field_s - -(an.field_f >> 1174124513) - (bg.field_e.field_n >> -346069279), -bg.field_e.field_w + (((le) this).field_r - (param2 - (var4_int >> -463104799))), 128);
                                                                          if (var15 == 0) {
                                                                            break L1;
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
                        L19: {
                          var9_int = 32;
                          if (ti.field_N == 4) {
                            var9_int = var6.p(-8323);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        L20: {
                          if (ti.field_N != 57) {
                            break L20;
                          } else {
                            var9_int = 64;
                            break L20;
                          }
                        }
                        L21: {
                          if (ti.field_N == 33) {
                            var9_int = 64;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        L22: {
                          if (ti.field_N == 42) {
                            var9_int = 64;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        L23: {
                          if (ti.field_N != 23) {
                            break L23;
                          } else {
                            var9_int = 100;
                            break L23;
                          }
                        }
                        L24: {
                          if (ti.field_N != 59) {
                            break L24;
                          } else {
                            var9_int = 100;
                            break L24;
                          }
                        }
                        L25: {
                          if (ti.field_N != 47) {
                            break L25;
                          } else {
                            var9_int = 100;
                            break L25;
                          }
                        }
                        L26: {
                          if (ti.field_N == 65) {
                            var9_int = 48;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        L27: {
                          if (67 != ti.field_N) {
                            break L27;
                          } else {
                            var9_int = 48;
                            break L27;
                          }
                        }
                        L28: {
                          if (ti.field_N != 76) {
                            break L28;
                          } else {
                            var9_int = 80;
                            break L28;
                          }
                        }
                        L29: {
                          if (ti.field_N == 77) {
                            var9_int = 48;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L30: {
                          if (ti.field_N == 6) {
                            var9_int = 96;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        L31: {
                          if (ti.field_N == 79) {
                            var9_int = 96;
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                        L32: {
                          if (98 != ti.field_N) {
                            break L32;
                          } else {
                            var9_int = 96;
                            break L32;
                          }
                        }
                        L33: {
                          if (ti.field_N == 90) {
                            var9_int = 64;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        L34: {
                          if (ti.field_N == 107) {
                            var9_int = 128;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        L35: {
                          if (ti.field_N == 104) {
                            var9_int = 32;
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        L36: {
                          if (ti.field_N == 92) {
                            var9_int = 96;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        L37: {
                          if (ti.field_N == 118) {
                            var9_int = 100;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        L38: {
                          if (((le) this).field_V.a(false, var6, ti.field_N, ((le) this).field_r, ((le) this).field_s)) {
                            stackOut_161_0 = 65280;
                            stackIn_162_0 = stackOut_161_0;
                            break L38;
                          } else {
                            stackOut_160_0 = 16711680;
                            stackIn_162_0 = stackOut_160_0;
                            break L38;
                          }
                        }
                        L39: {
                          var10 = stackIn_162_0;
                          ce.field_m.a(true);
                          de.h(-param1 - -(an.field_f >> -536856095), -param2 - -(var4_int >> -393797535), (an.field_f >> -548660575) + (-param1 - -((le) this).field_V.field_y), (var4_int >> 548644737) + (-param2 + ((le) this).field_V.field_H));
                          var11_int = -param1 + (var7 + (an.field_f >> 355332865));
                          var12 = (var4_int >> -1657461215) + var8 + (-param2 + -(var9_int >> -683056095));
                          gn.a((var9_int >> 532077153) + 128, (byte) 88, -(128 + Math.abs(-16 + (31 & ((le) this).field_P)) * 3), var11_int, var12);
                          de.a();
                          var13 = (an.field_f >> -1668702143) + ((le) this).field_s - param1;
                          var14 = -(var9_int >> -1833395071) + ((var4_int >> 917736481) + (-param2 + ((le) this).field_r));
                          de.c(var13, var14, var9_int >> 1297612641, var10, 128);
                          gn.a(var9_int >> 304741217, (byte) 73, Math.abs(-16 + (31 & ((le) this).field_P)) * 3 - -128, var13, var14);
                          if (!((le) this).field_V.c((byte) 89)) {
                            tg.field_b[5].b().a(var13, var14, ((le) this).field_P << 89626312, var9_int * (4096 - 64 * Math.abs(-16 + (((le) this).field_P & 31))) / 32);
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        if (var15 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L40: {
                      var9_int = var6.p(-8323);
                      if (((le) this).field_V.b(((le) this).field_s, var6, -16, ((le) this).field_r)) {
                        stackOut_168_0 = 65280;
                        stackIn_169_0 = stackOut_168_0;
                        break L40;
                      } else {
                        stackOut_167_0 = 16711680;
                        stackIn_169_0 = stackOut_167_0;
                        break L40;
                      }
                    }
                    L41: {
                      var10 = stackIn_169_0;
                      ce.field_m.a(true);
                      de.h(-param1 - -(an.field_f >> -798828255), (var4_int >> -1515849695) + -param2, (an.field_f >> 1195920353) + (-param1 + ((le) this).field_V.field_y), ((le) this).field_V.field_H + -param2 + (var4_int >> 855847169));
                      de.a();
                      var11_int = -param1 + (((le) this).field_s - -(an.field_f >> 217096449));
                      var12 = -param2 + (((le) this).field_r + ((var4_int >> 13925697) - (var9_int >> 420777921)));
                      de.c(var11_int, var12, var9_int >> 257800417, var10, 128);
                      gn.a(var9_int >> 1945750849, (byte) 100, 128 + Math.abs(-16 + (((le) this).field_P & 31)) * 3, var11_int, var12);
                      if (!((le) this).field_V.c((byte) 89)) {
                        tg.field_b[5].b().a(var11_int, var12, ((le) this).field_P << -1411215064, var9_int * (4096 - 64 * Math.abs((((le) this).field_P & 31) + -16)) / 32);
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    if (var15 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                L42: {
                  var9_int = -(go.field_j[29].field_g / 2) + ((an.field_f >> 1328288673) + (((le) this).field_s - param1));
                  var10 = (var4_int >> -712293119) + ((le) this).field_r - param2 - go.field_j[29].field_k;
                  if (((le) this).field_V.a(var6, ((le) this).field_r, ((le) this).field_s, -5)) {
                    break L42;
                  } else {
                    go.field_j[29].b().a(var9_int, var10, 16711680);
                    break L42;
                  }
                }
                go.field_j[29].a(var9_int, var10, 64);
                if (var15 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            L43: {
              if (ti.field_N == 2) {
                break L43;
              } else {
                if (ti.field_N == 81) {
                  break L43;
                } else {
                  if (ti.field_N == 31) {
                    break L43;
                  } else {
                    if (ti.field_N == 60) {
                      break L43;
                    } else {
                      if (ti.field_N == 55) {
                        break L43;
                      } else {
                        if (91 == ti.field_N) {
                          break L43;
                        } else {
                          if (ti.field_N == 114) {
                            break L43;
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
            L44: {
              var9 = uj.field_i[0];
              if (55 != ti.field_N) {
                break L44;
              } else {
                var9 = uj.field_i[1];
                break L44;
              }
            }
            L45: {
              if (ti.field_N == 31) {
                var9 = uj.field_i[2];
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              if (ti.field_N == 60) {
                var9 = uj.field_i[3];
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              if (81 == ti.field_N) {
                var9 = uj.field_i[4];
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              if (ti.field_N == 91) {
                var9 = uj.field_i[5];
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              if (114 == ti.field_N) {
                var9 = uj.field_i[6];
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              if (!((le) this).field_V.a(ti.field_N, var6.i((byte) 116), var6, (byte) 91, var6.f(45))) {
                stackOut_210_0 = 16711680;
                stackIn_211_0 = stackOut_210_0;
                break L50;
              } else {
                stackOut_209_0 = 65280;
                stackIn_211_0 = stackOut_209_0;
                break L50;
              }
            }
            var10 = stackIn_211_0;
            var11 = new qb(16 + var9.field_n, 16 + var9.field_w);
            var11.a();
            var9.a(8, 8, var10);
            de.d(5, 5, 0, 0, var11.field_n, var11.field_w);
            ce.field_m.a(true);
            var11.b(-param1 + (-(var9.field_n / 2) + var7 + (an.field_f >> -217107199) + -8), var8 + (-var9.field_w + (-param2 + (var4_int >> -318371455)) - 8), 256);
            var9.a((an.field_f >> -867709951) + var7 + (-(var9.field_n / 2) - param1), (var4_int >> 885446209) + (var8 + -var9.field_w + -param2), var10);
            var9.c(-param1 + (var7 - var9.field_n / 2 - -(an.field_f >> 353137025)), -param2 + var8 - (var9.field_w - (var4_int >> 1558397409)), 128);
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final boolean f(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((le) this).field_n = -11;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((le) this).field_o) {
                  break L3;
                } else {
                  L4: {
                    if (this.r(-87)) {
                      break L4;
                    } else {
                      if (!((le) this).field_k) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_13_0 = stackOut_10_0;
                  break L2;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.QA(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final boolean e(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 < -75) {
                break L1;
              } else {
                this.g(66);
                break L1;
              }
            }
            stackOut_3_0 = this.a((wk) (Object) df.field_z, on.field_g, 0, fj.field_h);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.OB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param0) {
              L1: {
                L2: {
                  if (((le) this).field_o) {
                    break L2;
                  } else {
                    L3: {
                      if (this.r(-40)) {
                        break L3;
                      } else {
                        if (!((le) this).field_k) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_10_0 = 1;
                    stackIn_13_0 = stackOut_10_0;
                    break L1;
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
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
          throw aa.a((Throwable) (Object) var2, "le.B(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void m(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ij.field_Tb != null) {
                break L1;
              } else {
                ij.field_Tb = new qb(640, 480);
                break L1;
              }
            }
            L2: {
              ij.field_Tb.a();
              var2_int = wm.a(((le) this).field_V.a(-31497), (byte) -124);
              var3 = ng.b((byte) -124, ((le) this).field_V.a(-31497));
              nb.field_a = var2_int;
              cg.field_Lb = var3;
              de.c(0, 0, 640, 480, var2_int, var3);
              if (null != e.field_M[((le) this).field_V.a(-31497)]) {
                break L2;
              } else {
                ue.field_d.field_f = 0;
                af.a(tj.a(115, new String[1], "background<%0>"), "", 19412, ue.field_d).b(0, 0, 640, 480);
                break L2;
              }
            }
            L3: {
              if (param0 == 413355681) {
                break L3;
              } else {
                ((le) this).field_S = 49;
                break L3;
              }
            }
            de.d(2, 2, 0, 0, 640, 480);
            var4 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if (var4 >= ij.field_Tb.field_A.length) {
                    break L6;
                  } else {
                    if (var5 != 0) {
                      break L5;
                    } else {
                      L7: {
                        if (ij.field_Tb.field_A[var4] != 0) {
                          break L7;
                        } else {
                          ij.field_Tb.field_A[var4] = 1;
                          break L7;
                        }
                      }
                      var4++;
                      if (var5 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.F(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        vn var5 = null;
        ml var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -50) {
                break L1;
              } else {
                ((le) this).field_p = -101;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = n.field_g.field_nb;
                var5 = ((le) this).field_V.g((byte) 115);
                if (var5 != null) {
                  var6 = (ml) (Object) var5.b(12623);
                  L4: while (true) {
                    if (null == var6) {
                      break L3;
                    } else {
                      var6.a(2, -param2 - -(var4_int >> -1394999679), (an.field_f >> -1522253151) + -param0);
                      var6 = (ml) (Object) var5.a(0);
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "le.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -7) {
              L1: {
                var3_int = n.field_g.field_nb;
                var4 = -(an.field_f >> -1810272479) + (vn.field_c + an.field_g);
                var5 = -(var3_int >> 947012673) + ol.field_g + me.field_I;
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
                var10 = (var8 >> 2084825697) + -var7 + var5;
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
                L4: {
                  if (!((le) this).field_V.a(true)) {
                    L5: {
                      L6: {
                        if (var9 <= 0) {
                          break L6;
                        } else {
                          param1.field_E = 1;
                          if (var18 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      param1.field_E = -1;
                      break L5;
                    }
                    L7: {
                      if (ti.field_N != 155) {
                        break L7;
                      } else {
                        if (Math.abs(var9) < Math.abs(var10)) {
                          L8: {
                            L9: {
                              var9 = param1.field_E * 64;
                              if (var10 < 0) {
                                break L9;
                              } else {
                                var10 = 64;
                                if (var18 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var10 = -64;
                            break L8;
                          }
                          var11 = (int)Math.sqrt((double)(var9 * var9 + var10 * var10));
                          if (var11 != 0) {
                            break L7;
                          } else {
                            var11 = 1;
                            var10 = -1;
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                    var12 = param1.p(param0 ^ 8324) / 2;
                    var15 = 0;
                    L10: while (true) {
                      if (100 <= var15) {
                        break L4;
                      } else {
                        var16 = var12 - -(var15 / 4);
                        var14 = -var12 + var10 * var16 / var11;
                        var13 = var16 * var9 / var11;
                        var17 = 0;
                        if (var18 != 0) {
                          break L3;
                        } else {
                          L11: {
                            L12: {
                              if (var15 >= 25) {
                                break L12;
                              } else {
                                var17 = var17 | (255 & var15 * 10) << -641383728;
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
                                var17 = var17 | (255 & -125 + var15 * 5) << -1283761080;
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
                                de.c((an.field_f >> -985633279) + var6 - (-var13 + vn.field_c), (var3_int >> -2022663583) + var14 + var7 + -ol.field_g, 1600 / (200 - var15 * 100 / 100), var17, 10);
                                if (var18 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            de.c((an.field_f >> -497476959) + (var13 + var6 + -vn.field_c), var14 + var7 - (ol.field_g + -(var3_int >> 1596683169)), 1600 / (200 + -(var15 * 100 / 100)), var17, var15);
                            break L15;
                          }
                          var15++;
                          if (var18 == 0) {
                            continue L10;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L3;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var3;
            stackOut_47_1 = new StringBuilder().append("le.UA(").append(param0).append(',');
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L17;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L17;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ')');
        }
    }

    final static qb[] a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        qb[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        qb[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            stackOut_3_0 = th.a(param4, 1, 3, param0, param2 + -32574, param3, 1, 1, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "le.MB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(int param0) {
        try {
            int var2_int = -52 / ((-45 - param0) / 63);
            he.field_e.b((byte) -78, 63);
            he.field_e.f(((le) this).field_V.n((byte) -75), (byte) -10);
            ((le) this).field_V.e(true);
            ((le) this).field_w.e(true);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "le.SA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        RuntimeException var10 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((le) this).field_f = new ge(((le) this).field_I, param3, param1, param4, param6, param7, param0, param8);
              ((le) this).field_W = param2;
              ((le) this).field_x = 50;
              if (param5 == -30) {
                break L1;
              } else {
                ((le) this).field_r = 83;
                break L1;
              }
            }
            ob.a(20, ((le) this).field_f, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var10, "le.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void g(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = n.field_g.field_nb;
              var3 = 16777215;
              if (0 >= ((le) this).field_V.field_G) {
                break L1;
              } else {
                var3 = 16711680;
                break L1;
              }
            }
            de.e((an.field_f >> -2135483775) + -vn.field_c + -8, (var2_int >> 1700756897) + (-ol.field_g + -8), 8, 8, var3, 64);
            de.e(-vn.field_c - (-(an.field_f >> -597354623) + -((le) this).field_V.field_y), -8 + (-ol.field_g + (var2_int >> -20978431)), 8, 8, var3, 64);
            de.h(-vn.field_c + (an.field_f >> 1573945889), -8 + (var2_int >> -1696482303) + (-ol.field_g + param0), ((le) this).field_V.field_y + (-vn.field_c - -(an.field_f >> 1766458849)), an.field_j);
            var4 = ((255 & jb.field_v) >> 632843522) + -64;
            L2: while (true) {
              L3: {
                L4: {
                  if (8 + ((le) this).field_V.field_y < var4) {
                    break L4;
                  } else {
                    de.e((an.field_f >> 468029729) + (-vn.field_c + var4), (var2_int >> 1874523745) + -ol.field_g - 8, 32, 8, var3, 64);
                    var4 += 64;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                de.h(-vn.field_c - -(an.field_f >> -1825371967) + -8, (var2_int >> -346236575) + -ol.field_g, (an.field_f >> 614824193) + (-vn.field_c - -((le) this).field_V.field_y) - -8, an.field_j);
                break L3;
              }
              var4 = -64 - ((jb.field_v & 255) >> 938216258);
              L5: while (true) {
                L6: {
                  L7: {
                    if (~var4 < ~((le) this).field_V.field_H) {
                      break L7;
                    } else {
                      de.e(-8 + -vn.field_c - -(an.field_f >> 614757537), var4 - (ol.field_g - ((var2_int >> 1493398721) - 4)), 8, 32, var3, 64);
                      var4 += 64;
                      if (var5 != 0) {
                        break L6;
                      } else {
                        if (var5 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var4 = -64 - -(jb.field_v >> -2136401790 & 63);
                  break L6;
                }
                L8: while (true) {
                  L9: {
                    L10: {
                      if (~var4 < ~((le) this).field_V.field_H) {
                        break L10;
                      } else {
                        de.e((an.field_f >> 2056752449) + (((le) this).field_V.field_y - vn.field_c), -4 + ((var2_int >> -1280961631) + (var4 - ol.field_g)), 8, 32, var3, 64);
                        var4 += 64;
                        if (var5 != 0) {
                          break L9;
                        } else {
                          if (var5 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    de.a();
                    break L9;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.GA(" + param0 + ')');
        }
    }

    private final boolean b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -116) {
                break L1;
              } else {
                ((le) this).field_O = true;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((le) this).field_o) {
                  break L3;
                } else {
                  L4: {
                    if (this.r(param0 ^ 45)) {
                      break L4;
                    } else {
                      if (!((le) this).field_k) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_13_0 = stackOut_10_0;
                  break L2;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.JB(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final void i(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((le) this).field_h > 0) {
              L1: {
                if (!((le) this).field_ab) {
                  break L1;
                } else {
                  int fieldTemp$2 = ((le) this).field_p + 1;
                  ((le) this).field_p = ((le) this).field_p + 1;
                  p.a(((le) this).field_V.n((byte) -75), ((le) this).field_R, (byte) 11, 158, ((le) this).field_r, ((le) this).field_h, ((le) this).field_bb, 0, fieldTemp$2);
                  break L1;
                }
              }
              L2: {
                if (param0 == 2000) {
                  break L2;
                } else {
                  ((le) this).field_T = false;
                  break L2;
                }
              }
              ((le) this).field_h = 0;
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.Q(" + param0 + ')');
        }
    }

    private final void a(wk param0, int param1, int param2) {
        ml var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param2 == 8888) {
                break L1;
              } else {
                this.b(111, -81, -109);
                break L1;
              }
            }
            L2: {
              ((le) this).field_z = -param1 + param0.n(param2 ^ -8922);
              if (((le) this).field_z >= 1) {
                break L2;
              } else {
                ((le) this).field_z = 1;
                break L2;
              }
            }
            L3: {
              if (!((le) this).field_k) {
                break L3;
              } else {
                L4: {
                  L5: {
                    ((le) this).field_k = false;
                    ((le) this).field_V.a((byte) 112, ((le) this).field_w);
                    ((le) this).field_V.field_rb = uk.field_g;
                    ((le) this).field_V.field_sb = cf.field_h;
                    ((le) this).field_C = true;
                    ((le) this).field_bb = ((le) this).field_V.d(false);
                    var4 = ((le) this).field_V.a(((le) this).field_V.d(false), true);
                    if (var4 == null) {
                      break L5;
                    } else {
                      ((le) this).field_m.a(-111, var4);
                      if (!ArcanistsMulti.field_G) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((le) this).field_m.a(0);
                  break L4;
                }
                ((le) this).field_t = false;
                ((le) this).field_s = -1000;
                break L3;
              }
            }
            ((le) this).field_o = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4_ref;
            stackOut_16_1 = new StringBuilder().append("le.A(");
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
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean l(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -8712) {
              L1: {
                L2: {
                  if (((le) this).field_o) {
                    break L2;
                  } else {
                    L3: {
                      if (this.r(-95)) {
                        break L3;
                      } else {
                        if (!((le) this).field_k) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_10_0 = 1;
                    stackIn_13_0 = stackOut_10_0;
                    break L1;
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
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
          throw aa.a((Throwable) (Object) var2, "le.E(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void p(int param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!((le) this).field_ab) {
              throw new IllegalStateException();
            } else {
              if (param0 == 26873) {
                he.field_e.b((byte) -74, 60);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "le.BA(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((le) this).field_ab) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  ((le) this).field_a = -59;
                  break L1;
                }
              }
              he.field_e.b((byte) -24, 59);
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.RB(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -26449) {
                break L1;
              } else {
                ml discarded$2 = this.q(-86);
                break L1;
              }
            }
            ((le) this).a(param0, an.field_j, 0, true, 0, 96, an.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "le.FB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_56_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        byte stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_44_0 = 0;
        boolean stackOut_55_0 = false;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              de.b();
              var5_int = 0;
              param0 = param0 + ue.b((byte) -32);
              var7 = an.field_j;
              var7 = n.field_g.field_nb;
              var8 = ((le) this).field_V.b(true);
              var6 = -(param3 - -240) * (-an.field_j + 960) / 1440;
              var5_int = (an.field_f - 1280) * (var8 + param0) / (2 * var8 + ((le) this).field_V.field_y);
              if (var6 <= 0) {
                break L1;
              } else {
                var6 = 0;
                break L1;
              }
            }
            L2: {
              L3: {
                if (960 < an.field_j) {
                  break L3;
                } else {
                  ij.field_Tb.c(var5_int, var6, 1280, 960);
                  if (var15 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ij.field_Tb.c(var5_int, 0, 1280, an.field_j);
              break L2;
            }
            L4: {
              ge.field_r = ge.field_r + 1;
              if (ge.field_r > 128) {
                ge.field_r = ge.field_r - 128;
                break L4;
              } else {
                break L4;
              }
            }
            var9 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  L8: {
                    if (an.field_f <= var9) {
                      break L8;
                    } else {
                      var10 = (int)Math.abs(Math.sin(3.141592653589793 * (double)(var9 + ge.field_r - -param0) / 64.0) * 12.0);
                      stackOut_15_0 = ~ge.field_r;
                      stackOut_15_1 = -65;
                      stackIn_28_0 = stackOut_15_0;
                      stackIn_28_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (var15 != 0) {
                        L9: while (true) {
                          if (stackIn_28_0 <= stackIn_28_1) {
                            break L7;
                          } else {
                            var10 = (int)Math.abs(Math.cos((double)(ge.field_r + (var9 + param0)) * 3.141592653589793 / 64.0) * 14.0);
                            stackOut_29_0 = -65;
                            stackOut_29_1 = ~ge.field_r;
                            stackIn_39_0 = stackOut_29_0;
                            stackIn_39_1 = stackOut_29_1;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            if (var15 != 0) {
                              break L6;
                            } else {
                              L10: {
                                L11: {
                                  if (stackIn_30_0 < stackIn_30_1) {
                                    break L11;
                                  } else {
                                    var10 = var10 * (96 + -ge.field_r) / 32;
                                    if (var15 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var10 = var10 * (ge.field_r - 32) / 32;
                                break L10;
                              }
                              L12: {
                                if (var10 <= 0) {
                                  break L12;
                                } else {
                                  var10 = -var10;
                                  break L12;
                                }
                              }
                              var10 += 20;
                              var10 = (int)((double)var10 + (8.0 * Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) + 32.0));
                              de.d(var9, -param3 + ((le) this).field_V.field_H - (-(var7 >> -1971870431) + var10), var10, 16448 | param2 >> 306129473);
                              var9++;
                              if (var15 == 0) {
                                stackOut_27_0 = an.field_f;
                                stackOut_27_1 = var9;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                continue L9;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      } else {
                        L13: {
                          L14: {
                            if (stackIn_16_0 <= stackIn_16_1) {
                              break L14;
                            } else {
                              var10 = (ge.field_r + -32) * var10 / 32;
                              if (var15 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          var10 = (96 - ge.field_r) * var10 / 32;
                          break L13;
                        }
                        L15: {
                          if (var10 > 0) {
                            var10 = -var10;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        var10 += 22;
                        var10 = (int)((double)var10 + (8.0 * Math.sin(3.141592653589793 * (double)ge.field_r / 64.0) + 32.0));
                        de.d(var9, -var10 + ((le) this).field_V.field_H + (-param3 + (var7 >> -426135519)), var10, (16449 | param2) >> 562030913);
                        var9++;
                        if (var15 == 0) {
                          continue L5;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  var9 = 0;
                  L16: while (true) {
                    stackOut_27_0 = an.field_f;
                    stackOut_27_1 = var9;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    if (stackIn_28_0 <= stackIn_28_1) {
                      break L7;
                    } else {
                      var10 = (int)Math.abs(Math.cos((double)(ge.field_r + (var9 + param0)) * 3.141592653589793 / 64.0) * 14.0);
                      stackOut_29_0 = -65;
                      stackOut_29_1 = ~ge.field_r;
                      stackIn_39_0 = stackOut_29_0;
                      stackIn_39_1 = stackOut_29_1;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      if (var15 != 0) {
                        break L6;
                      } else {
                        L17: {
                          L18: {
                            if (stackIn_30_0 < stackIn_30_1) {
                              break L18;
                            } else {
                              var10 = var10 * (96 + -ge.field_r) / 32;
                              if (var15 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          var10 = var10 * (ge.field_r - 32) / 32;
                          break L17;
                        }
                        L19: {
                          if (var10 <= 0) {
                            break L19;
                          } else {
                            var10 = -var10;
                            break L19;
                          }
                        }
                        var10 += 20;
                        var10 = (int)((double)var10 + (8.0 * Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) + 32.0));
                        de.d(var9, -param3 + ((le) this).field_V.field_H - (-(var7 >> -1971870431) + var10), var10, 16448 | param2 >> 306129473);
                        var9++;
                        if (var15 == 0) {
                          continue L16;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                stackOut_38_0 = param1;
                stackOut_38_1 = -82;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                break L6;
              }
              L20: {
                if (stackIn_39_0 <= stackIn_39_1) {
                  break L20;
                } else {
                  ((le) this).field_V = null;
                  break L20;
                }
              }
              var9 = 0;
              L21: while (true) {
                L22: {
                  L23: {
                    if (var9 >= an.field_f) {
                      break L23;
                    } else {
                      var10 = (int)Math.abs(Math.sin(3.141592653589793 * (double)(var9 + ge.field_r * 2 - -param0) / 64.0) * 16.0);
                      stackOut_44_0 = ge.field_r;
                      stackIn_56_0 = stackOut_44_0;
                      stackIn_45_0 = stackOut_44_0;
                      if (var15 != 0) {
                        break L22;
                      } else {
                        L24: {
                          L25: {
                            if (stackIn_45_0 < 64) {
                              break L25;
                            } else {
                              var10 = var10 * (96 + -ge.field_r) / 32;
                              if (var15 == 0) {
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                          var10 = (ge.field_r - 32) * var10 / 32;
                          break L24;
                        }
                        L26: {
                          if (var10 > 0) {
                            var10 = -var10;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        var10 += 16;
                        var10 = (int)((double)var10 + (Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) * 8.0 + 32.0));
                        de.f(var9, -var10 + (-param3 + ((le) this).field_V.field_H - -(var7 >> 1076409121)), var10, param2 | 16448, 128);
                        var9++;
                        if (var15 == 0) {
                          continue L21;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                  stackOut_55_0 = td.e(true);
                  stackIn_56_0 = stackOut_55_0 ? 1 : 0;
                  break L22;
                }
                L27: {
                  L28: {
                    if (stackIn_56_0 == 0) {
                      break L28;
                    } else {
                      if (((le) this).field_T) {
                        ((le) this).field_V.m((byte) 69).b((an.field_f >> 367873601) + -param0, -param3 - -(var7 >> 1603102945), ((le) this).field_V.field_y, ((le) this).field_V.field_H);
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                  }
                  L29: {
                    var9_ref_int__ = ((le) this).field_V.field_V.field_l;
                    if (null != ((le) this).field_V.field_pb) {
                      ((le) this).field_V.field_V.field_l = ((le) this).field_V.field_pb;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  ((le) this).field_V.field_V.a((an.field_f >> 1646943201) + -param0, -param3 - -(var7 >> 979099361));
                  ((le) this).field_V.field_V.field_l = var9_ref_int__;
                  break L27;
                }
                L30: {
                  L31: {
                    if (null != ((le) this).field_V.field_V) {
                      L32: {
                        var9 = 0;
                        var10 = 0;
                        var11 = ((le) this).field_V.m((byte) 69);
                        gd.field_tb = gd.field_tb + 1;
                        if (~(-1 + ((le) this).field_V.field_y) >= ~gd.field_tb) {
                          gd.field_tb = 0;
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                      L33: {
                        var12 = gd.field_tb - 2 * (1 & gd.field_tb) - -1;
                        if (var12 >= 0) {
                          break L33;
                        } else {
                          var12 = 0;
                          break L33;
                        }
                      }
                      L34: {
                        if (var12 >= -1 + ((le) this).field_V.field_y) {
                          var12 = ((le) this).field_V.field_y + -1;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      var10 = (gd.field_tb >> -2089386335) + ((le) this).field_V.field_hb;
                      var13 = 2 * (gd.field_tb & 1) + -1;
                      var9 = gd.field_tb + 2 * ((le) this).field_V.field_y;
                      var14 = 2;
                      L35: while (true) {
                        if (var14 >= ((le) this).field_V.field_H + -2) {
                          break L31;
                        } else {
                          if (var15 != 0) {
                            break L30;
                          } else {
                            L36: {
                              L37: {
                                if (var11.field_m[var10] != 0) {
                                  break L37;
                                } else {
                                  if (var11.field_m[var10 + var13] != 0) {
                                    break L36;
                                  } else {
                                    if (var11.field_m[var10 + -((le) this).field_V.field_hb] == 0) {
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
                                if (var11.field_m[var10 + var13] == 0) {
                                  break L36;
                                } else {
                                  if (var11.field_m[-((le) this).field_V.field_hb + var10] == 0) {
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
                            L38: {
                              L39: {
                                var9 = var9 + ((le) this).field_V.field_y;
                                if (var11.field_m[var10] != 0) {
                                  break L39;
                                } else {
                                  if (0 != var11.field_m[var10 - -var13]) {
                                    break L38;
                                  } else {
                                    if (var11.field_m[((le) this).field_V.field_hb + var10] == 0) {
                                      ((le) this).field_V.field_V.field_m[var9] = (byte) 0;
                                      if (var15 == 0) {
                                        break L38;
                                      } else {
                                        break L39;
                                      }
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                              }
                              if (((le) this).field_V.field_V.field_m[var9] != 0) {
                                break L38;
                              } else {
                                if (var11.field_m[var10 - -var13] == 0) {
                                  break L38;
                                } else {
                                  if (var11.field_m[var10 + ((le) this).field_V.field_hb] == 0) {
                                    break L38;
                                  } else {
                                    if (var11.field_m[var10] != -1) {
                                      ((le) this).field_V.field_V.field_m[var9] = var11.field_m[var10];
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                              }
                            }
                            var10 = var10 + ((le) this).field_V.field_hb;
                            var9 = var9 + ((le) this).field_V.field_y;
                            var14 += 2;
                            if (var15 == 0) {
                              continue L35;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                    } else {
                      break L31;
                    }
                  }
                  break L30;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "le.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, wk param1) {
        RuntimeException var3 = null;
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
                int discarded$2 = ((le) this).field_w.e((byte) 72);
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
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("le.KA(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    private final void a(byte param0, wk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ((le) this).field_w.e(true);
              if (!((le) this).field_k) {
                ((le) this).field_V.e(true);
                ((le) this).field_z = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 11) {
                break L2;
              } else {
                ((le) this).field_s = 97;
                break L2;
              }
            }
            ((le) this).field_o = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("le.CA(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException var2 = null;
        vn var2_ref = null;
        ml var3 = null;
        vn var4 = null;
        mi var5 = null;
        int var6 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_19_0 = false;
        int stackIn_34_0 = 0;
        boolean stackIn_39_0 = false;
        int stackIn_49_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_12_0 = false;
        boolean stackOut_18_0 = false;
        int stackOut_33_0 = 0;
        boolean stackOut_38_0 = false;
        int stackOut_47_0 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_ref = ((le) this).field_V.g((byte) 68);
            var3 = (ml) (Object) var2_ref.b(param0 + 20398);
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (null == var3) {
                      break L4;
                    } else {
                      stackOut_3_0 = var3.i(-52);
                      stackIn_14_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        if (stackIn_4_0) {
                          ((le) this).field_m.a(-105, var3);
                          return;
                        } else {
                          var3 = (ml) (Object) var2_ref.a(0);
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (((le) this).field_m.field_h == null) {
                    break L2;
                  } else {
                    stackOut_12_0 = ((le) this).field_m.field_h.d(6);
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                }
                if (!stackIn_14_0) {
                  break L2;
                } else {
                  return;
                }
              }
              var4 = ((le) this).field_V.e(2);
              var5 = (mi) (Object) var4.b(param0 + 20398);
              L5: while (true) {
                L6: {
                  L7: {
                    if (var5 == null) {
                      break L7;
                    } else {
                      stackOut_18_0 = var5.d(6);
                      stackIn_34_0 = stackOut_18_0 ? 1 : 0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var6 != 0) {
                        break L6;
                      } else {
                        if (stackIn_19_0) {
                          ((le) this).field_m.a(var5, -126);
                          return;
                        } else {
                          var5 = (mi) (Object) var4.a(0);
                          if (var6 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if (null == ((le) this).field_m.field_d) {
                      break L8;
                    } else {
                      if (((le) this).field_m.field_d.f(true)) {
                        return;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var3 = (ml) (Object) var2_ref.b(12623);
                  stackOut_33_0 = param0;
                  stackIn_34_0 = stackOut_33_0;
                  break L6;
                }
                L9: {
                  if (stackIn_34_0 == -7775) {
                    break L9;
                  } else {
                    ((le) this).field_j = 56;
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    L12: {
                      L13: {
                        if (null == var3) {
                          break L13;
                        } else {
                          stackOut_38_0 = var3.f(true);
                          stackIn_49_0 = stackOut_38_0 ? 1 : 0;
                          stackIn_39_0 = stackOut_38_0;
                          if (var6 != 0) {
                            break L12;
                          } else {
                            if (stackIn_39_0) {
                              ((le) this).field_m.a(param0 ^ 7725, var3);
                              return;
                            } else {
                              var3 = (ml) (Object) var2_ref.a(0);
                              if (var6 == 0) {
                                continue L10;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                      }
                      if (((le) this).field_m.field_d == null) {
                        break L11;
                      } else {
                        stackOut_47_0 = ~((le) this).field_m.field_d.y(17571);
                        stackIn_49_0 = stackOut_47_0;
                        break L12;
                      }
                    }
                    if (stackIn_49_0 == ~((le) this).field_V.d(false)) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L11;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void n(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (re.field_r != 1) {
                break L1;
              } else {
                if (-3 == mf.field_g) {
                  L2: {
                    if (ao.field_d) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_11_0 = stackOut_8_0;
                      break L2;
                    }
                  }
                  ao.field_d = stackIn_11_0 != 0;
                  if (!ao.field_d) {
                    break L1;
                  } else {
                    vh.field_t = 0;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L3: {
              L4: {
                var2_int = n.field_g.field_nb;
                if (((le) this).field_I >= 0) {
                  break L4;
                } else {
                  if (ao.field_d) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_18_0 = 1;
              stackIn_21_0 = stackOut_18_0;
              break L3;
            }
            L5: {
              L6: {
                L7: {
                  var3 = stackIn_21_0;
                  if (ri.field_b[96]) {
                    break L7;
                  } else {
                    if (var3 == 0) {
                      break L6;
                    } else {
                      if (!ri.field_b[p.field_a]) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                if (-16 >= ((le) this).field_n) {
                  break L6;
                } else {
                  ((le) this).field_m.a(param0);
                  ((le) this).field_n = ((le) this).field_n - 2;
                  ((le) this).field_t = true;
                  if (var8 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((le) this).field_n >= 0) {
                break L5;
              } else {
                ((le) this).field_n = ((le) this).field_n + 1;
                break L5;
              }
            }
            L8: {
              L9: {
                L10: {
                  if (ri.field_b[97]) {
                    break L10;
                  } else {
                    if (var3 == 0) {
                      break L9;
                    } else {
                      if (!ri.field_b[qo.field_b]) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (((le) this).field_n >= 16) {
                  break L9;
                } else {
                  ((le) this).field_m.a(0);
                  ((le) this).field_n = ((le) this).field_n + 2;
                  ((le) this).field_t = true;
                  if (var8 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (0 < ((le) this).field_n) {
                ((le) this).field_n = ((le) this).field_n - 1;
                break L8;
              } else {
                break L8;
              }
            }
            L11: {
              L12: {
                L13: {
                  L14: {
                    if (ri.field_b[98]) {
                      break L14;
                    } else {
                      if (var3 == 0) {
                        break L13;
                      } else {
                        if (!ri.field_b[fi.field_e]) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  if (-16 < ((le) this).field_S) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
                if (((le) this).field_S >= 0) {
                  break L11;
                } else {
                  ((le) this).field_S = ((le) this).field_S + 1;
                  if (var8 == 0) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              ((le) this).field_m.a(0);
              ((le) this).field_S = ((le) this).field_S - 2;
              ((le) this).field_t = true;
              break L11;
            }
            L15: {
              L16: {
                L17: {
                  L18: {
                    if (ri.field_b[99]) {
                      break L18;
                    } else {
                      if (var3 == 0) {
                        break L17;
                      } else {
                        if (!ri.field_b[cm.field_j]) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  if (16 > ((le) this).field_S) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
                if (((le) this).field_S > 0) {
                  ((le) this).field_S = ((le) this).field_S - 1;
                  if (var8 == 0) {
                    break L15;
                  } else {
                    break L16;
                  }
                } else {
                  break L15;
                }
              }
              ((le) this).field_m.a(0);
              ((le) this).field_t = true;
              ((le) this).field_S = ((le) this).field_S + 2;
              break L15;
            }
            L19: {
              L20: {
                ol.field_g = ol.field_g + ((le) this).field_S;
                vn.field_c = vn.field_c + ((le) this).field_n;
                if (eb.field_b != null) {
                  break L20;
                } else {
                  L21: {
                    if (((le) this).field_V.a(true)) {
                      break L21;
                    } else {
                      if (((le) this).field_V.c((byte) 89)) {
                        break L21;
                      } else {
                        ((le) this).field_M = 15 * ((le) this).field_M >> 99314724;
                        if (var8 == 0) {
                          break L19;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                  ((le) this).field_M = 2000;
                  if (var8 == 0) {
                    break L19;
                  } else {
                    break L20;
                  }
                }
              }
              ((le) this).field_M = 2000;
              break L19;
            }
            L22: {
              var4 = 0;
              if (((le) this).field_V.c((byte) 89)) {
                break L22;
              } else {
                if (((le) this).field_V.k(-45)) {
                  break L22;
                } else {
                  L23: {
                    L24: {
                      if (ef.field_r) {
                        break L24;
                      } else {
                        if (!pn.a((byte) 110)) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    if (!((le) this).field_ab) {
                      break L23;
                    } else {
                      break L22;
                    }
                  }
                  L25: {
                    var5 = ((le) this).field_V.field_y >> ((le) this).field_K;
                    var6 = ((le) this).field_V.field_H >> ((le) this).field_K;
                    var7 = an.field_j;
                    if (~(var5 + 648) < ~an.field_f) {
                      var7 = var2_int;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (~an.field_g > ~(-8 + -var5 + an.field_f)) {
                      break L26;
                    } else {
                      if (me.field_I < -8 + (-var6 + var7)) {
                        break L26;
                      } else {
                        if (~me.field_I <= ~var7) {
                          break L26;
                        } else {
                          L27: {
                            if (wk.field_m != 1) {
                              break L27;
                            } else {
                              vn.field_c = 4 - an.field_f + (var5 + an.field_g) << ((le) this).field_K;
                              ((le) this).field_t = true;
                              ol.field_g = me.field_I - (-4 + -var6) - var7 << ((le) this).field_K;
                              break L27;
                            }
                          }
                          ((le) this).field_u = 0;
                          var4 = 1;
                          if (var8 == 0) {
                            break L22;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                  }
                  if (1 != wk.field_m) {
                    break L22;
                  } else {
                    ((le) this).field_K = 4;
                    break L22;
                  }
                }
              }
            }
            L28: {
              var5 = -var2_int / 2;
              if (param0 == 0) {
                break L28;
              } else {
                ((le) this).field_cb = null;
                break L28;
              }
            }
            L29: {
              L30: {
                L31: {
                  L32: {
                    var6 = 64 + -(var2_int / 2) + ((le) this).field_V.field_H;
                    this.a(var6, var5, true);
                    if (((le) this).field_V.d(false) != ((le) this).field_I) {
                      break L32;
                    } else {
                      if (((le) this).field_z > 1) {
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  if (((le) this).field_ab) {
                    break L30;
                  } else {
                    break L31;
                  }
                }
                if (((le) this).field_V.a(true)) {
                  break L30;
                } else {
                  L33: {
                    if (!((le) this).field_ab) {
                      break L33;
                    } else {
                      if (pn.a((byte) -51)) {
                        break L30;
                      } else {
                        if (ef.field_r) {
                          break L30;
                        } else {
                          break L33;
                        }
                      }
                    }
                  }
                  if (((le) this).field_V.n(param0 + 4)) {
                    break L30;
                  } else {
                    this.a(var4 != 0, (byte) 10);
                    if (var8 == 0) {
                      break L29;
                    } else {
                      break L30;
                    }
                  }
                }
              }
              eb.field_b = null;
              ti.field_N = -1;
              break L29;
            }
            L34: {
              if (!((le) this).field_V.c((byte) 89)) {
                break L34;
              } else {
                ((le) this).field_K = 4;
                break L34;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.P(" + param0 + ')');
        }
    }

    private final int a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        ml var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -3) {
                break L1;
              } else {
                boolean discarded$1 = this.r(122);
                break L1;
              }
            }
            L2: {
              L3: {
                var4_ref = ((le) this).field_V.a(param2, true);
                if (null == var4_ref) {
                  break L3;
                } else {
                  if (0 < ((((le) this).field_J | ((le) this).field_a) & 1 << var4_ref.y(17571))) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (0 == param2) {
                  break L4;
                } else {
                  if (!qg.a(-113)) {
                    break L4;
                  } else {
                    if (rm.field_k == 6) {
                      break L4;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L5: {
                L6: {
                  var5 = 16777215;
                  var6 = ((le) this).field_V.field_k[param2];
                  if ((1 << param2 & ((le) this).field_J) > 0) {
                    break L6;
                  } else {
                    L7: {
                      if (0 >= (1 << param2 & ((le) this).field_a)) {
                        break L7;
                      } else {
                        var6 = tj.a(param1 + -14, new String[1], cn.field_Q);
                        if (var7 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var6 = tj.a(122, new String[1], jl.field_i);
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  if ((1 << param2 & ((le) this).field_a) > 0) {
                    break L8;
                  } else {
                    var6 = tj.a(param1 + 116, new String[1], lc.field_a);
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L8;
                    }
                  }
                }
                var6 = tj.a(param1 ^ -124, new String[1], qc.field_g);
                break L5;
              }
              mi.field_B.a(var6, 3, mi.field_B.field_C / 2 + (param0 - -8), 15790320 ^ (var5 | 15790320), 0);
              mi.field_B.a(var6, 4, 8 + param0 + (mi.field_B.field_C / 2 - 1), 15790320 ^ (var5 | 15790320), 0);
              mi.field_B.a(var6, 4, mi.field_B.field_C / 2 + (8 + param0), var5, -1);
              param0 += 18;
              break L2;
            }
            stackOut_31_0 = param0;
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "le.PA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_32_0;
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
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
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
              var10 = param0 - var7 - -(var8 >> -1293172319);
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
                          break L3;
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
                                var17 = var17 | ((var15 + -25) * 5 & 255) << 1934919464;
                                if (var18 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            var17 = var17 | (255 & var15 * 10) << 1337437104;
                            break L12;
                          }
                          L16: {
                            L17: {
                              if (var15 <= 25) {
                                break L17;
                              } else {
                                de.i(-vn.field_c + var13 + var6 - -(an.field_f >> -378656927), (var5_int >> -11922111) + (-ol.field_g + (var14 + var7)), 1600 / (200 - var15 * 100 / 100), var17);
                                if (var18 == 0) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            de.c(-vn.field_c + var13 + (var6 + (an.field_f >> 700568097)), -ol.field_g + var7 + (var14 - -(var5_int >> -295165631)), 1600 / (200 - 100 * var15 / 100), var17, 10 * var15);
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
                    break L4;
                  }
                }
              }
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5;
            stackOut_60_1 = new StringBuilder().append("le.HB(").append(param0).append(',').append(param1).append(',');
            stackIn_63_0 = stackOut_60_0;
            stackIn_63_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param2 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L18;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_64_0 = stackOut_61_0;
              stackIn_64_1 = stackOut_61_1;
              stackIn_64_2 = stackOut_61_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param3 + ')');
        }
    }

    private final boolean r(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -26) {
              L1: {
                if (((le) this).field_V.d((byte) -128)) {
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
          throw aa.a((Throwable) (Object) var2, "le.LB(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        rb var4_ref_rb = null;
        int var4 = 0;
        ml var4_ref_ml = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_80_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_106_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_103_0 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((le) this).field_V.d(false) >= 0) {
                break L1;
              } else {
                if (!((le) this).field_V.n(4)) {
                  param1 = false;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              ((le) this).field_o = false;
              if (ef.field_r) {
                break L2;
              } else {
                if (!pn.a((byte) 111)) {
                  L3: {
                    if (ri.field_b[69]) {
                      break L3;
                    } else {
                      if (ri.field_b[ao.field_f]) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((le) this).field_t = false;
                  ((le) this).field_m.a(-96, ((le) this).field_V.a(((le) this).field_bb, true));
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              if (0 >= ((le) this).field_V.field_G) {
                break L4;
              } else {
                ((le) this).field_V.field_G = ((le) this).field_V.field_G - 1;
                break L4;
              }
            }
            L5: {
              vl.a(128);
              if (((le) this).field_Z <= 0) {
                break L5;
              } else {
                ((le) this).field_Z = ((le) this).field_Z - 1;
                break L5;
              }
            }
            L6: {
              L7: {
                if (an.field_g < 0) {
                  break L7;
                } else {
                  if (me.field_I < 0) {
                    break L7;
                  } else {
                    if (~an.field_f < ~an.field_g) {
                      break L6;
                    } else {
                      if (~me.field_I > ~an.field_j) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              ti.field_N = -1;
              break L6;
            }
            L8: {
              ((le) this).field_P = ((le) this).field_P + 1;
              if (0 <= ((le) this).field_Z) {
                break L8;
              } else {
                ((le) this).field_Z = ((le) this).field_Z + 1;
                break L8;
              }
            }
            L9: {
              if (256 > ((le) this).field_P) {
                break L9;
              } else {
                ((le) this).field_P = ((le) this).field_P - 256;
                break L9;
              }
            }
            L10: {
              ((le) this).field_j = ((le) this).field_j + 1;
              if (((le) this).field_j <= g.field_a.field_n * 2) {
                break L10;
              } else {
                ((le) this).field_j = ((le) this).field_j - g.field_a.field_n * 2;
                break L10;
              }
            }
            L11: {
              L12: {
                var3_int = 0;
                e.g((byte) -49);
                if (dm.h((byte) 97)) {
                  break L12;
                } else {
                  var3_int = 1;
                  if (var7 == 0) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              this.c((byte) -106);
              if (((le) this).field_V.c((byte) 89)) {
                break L11;
              } else {
                if (!((le) this).field_V.n(4)) {
                  break L11;
                } else {
                  if (mn.field_r == 3) {
                    break L11;
                  } else {
                    if (-5 == mn.field_r) {
                      break L11;
                    } else {
                      if (((le) this).field_V.d(1)) {
                        L13: {
                          L14: {
                            L15: {
                              var4 = ((le) this).field_V.d(false);
                              if (ob.field_Y == null) {
                                break L15;
                              } else {
                                if (ob.field_Y.field_l) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            if (an.field_f > 640) {
                              break L14;
                            } else {
                              if (an.field_j <= 480) {
                                stackOut_79_0 = 0;
                                stackIn_80_0 = stackOut_79_0;
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          stackOut_77_0 = 1;
                          stackIn_80_0 = stackOut_77_0;
                          break L13;
                        }
                        L16: {
                          var5 = stackIn_80_0;
                          if (var4 < 0) {
                            break L16;
                          } else {
                            if (((le) this).field_I < 0) {
                              break L16;
                            } else {
                              if (var5 == 0) {
                                break L16;
                              } else {
                                if (((le) this).field_i) {
                                  L17: {
                                    L18: {
                                      if (!((le) this).field_V.field_d) {
                                        break L18;
                                      } else {
                                        L19: {
                                          if (~(((le) this).field_I & 1) != ~(var4 & 1)) {
                                            stackOut_98_0 = 0;
                                            stackIn_99_0 = stackOut_98_0;
                                            break L19;
                                          } else {
                                            stackOut_96_0 = 1;
                                            stackIn_99_0 = stackOut_96_0;
                                            break L19;
                                          }
                                        }
                                        var6 = stackIn_99_0;
                                        if (var7 == 0) {
                                          break L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (((le) this).field_I != var4) {
                                        stackOut_105_0 = 0;
                                        stackIn_106_0 = stackOut_105_0;
                                        break L20;
                                      } else {
                                        stackOut_103_0 = 1;
                                        stackIn_106_0 = stackOut_103_0;
                                        break L20;
                                      }
                                    }
                                    var6 = stackIn_106_0;
                                    break L17;
                                  }
                                  L21: {
                                    if ((((le) this).field_J & 1 << ((le) this).field_I) == 0) {
                                      break L21;
                                    } else {
                                      var6 = 0;
                                      break L21;
                                    }
                                  }
                                  if (var6 == 0) {
                                    break L16;
                                  } else {
                                    this.a((byte) 79, 56, 199);
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                        }
                        gj.a(true, true, 3, mn.field_r);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
            }
            L22: {
              this.c(-7775);
              if (!((le) this).field_t) {
                this.e(17608);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (((le) this).field_I <= 0) {
                break L23;
              } else {
                L24: {
                  if (ri.field_b[69]) {
                    break L24;
                  } else {
                    if (ri.field_b[ao.field_f]) {
                      break L24;
                    } else {
                      if (ri.field_b[ig.field_g]) {
                        break L24;
                      } else {
                        if (ri.field_b[im.field_g]) {
                          break L24;
                        } else {
                          if (ri.field_b[84]) {
                            break L24;
                          } else {
                            if (ri.field_b[82]) {
                              break L24;
                            } else {
                              if (ri.field_b[81]) {
                                break L24;
                              } else {
                                if (ri.field_b[ko.field_k]) {
                                  break L24;
                                } else {
                                  if (ri.field_b[ud.field_w]) {
                                    break L24;
                                  } else {
                                    if (ri.field_b[85]) {
                                      break L24;
                                    } else {
                                      break L23;
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
                var4_ref_rb = (rb) (Object) pb.field_m.b(12623);
                ((le) this).field_K = 4;
                ((le) this).field_M = 2000;
                if (var4_ref_rb == null) {
                  break L23;
                } else {
                  var4_ref_rb.field_i = false;
                  break L23;
                }
              }
            }
            L25: {
              if (((le) this).field_V.c((byte) 89)) {
                break L25;
              } else {
                if (!((le) this).field_V.k(103)) {
                  L26: {
                    if (((le) this).field_C) {
                      L27: {
                        L28: {
                          ((le) this).field_C = false;
                          ((le) this).field_V.f((byte) -20);
                          ((le) this).field_bb = ((le) this).field_V.d(false);
                          var4_ref_ml = ((le) this).field_V.a(((le) this).field_bb, param0);
                          if (var4_ref_ml != null) {
                            break L28;
                          } else {
                            ((le) this).field_m.a(0);
                            if (var7 == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        ((le) this).field_m.a(-89, var4_ref_ml);
                        break L27;
                      }
                      ((le) this).field_t = false;
                      ((le) this).field_s = -1000;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  if (((le) this).field_w == null) {
                    if (!((le) this).field_F) {
                      L29: {
                        ((le) this).field_F = true;
                        ((le) this).field_V.f((byte) -20);
                        if (((le) this).field_ab) {
                          break L29;
                        } else {
                          if (((le) this).field_V.b(((le) this).field_J, -93)) {
                            L30: {
                              if (!qg.a(-102)) {
                                break L30;
                              } else {
                                mh.i((byte) 74);
                                if (var7 == 0) {
                                  break L29;
                                } else {
                                  break L30;
                                }
                              }
                            }
                            gj.a(false, true, -1, mn.field_r);
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                      }
                      if (((le) this).field_ab) {
                        break L25;
                      } else {
                        if (5 != mj.field_p) {
                          break L25;
                        } else {
                          wk.j(13805);
                          break L25;
                        }
                      }
                    } else {
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                } else {
                  break L25;
                }
              }
            }
            L31: {
              if (mj.field_p != 6) {
                break L31;
              } else {
                L32: {
                  if (rm.field_k < 5) {
                    break L32;
                  } else {
                    ((le) this).field_G = true;
                    if (var7 == 0) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                ((le) this).field_G = false;
                break L31;
              }
            }
            L33: {
              if (!((le) this).field_V.a(param0)) {
                break L33;
              } else {
                if (((le) this).field_V.c((byte) 89)) {
                  break L33;
                } else {
                  if (((le) this).field_V.n(4)) {
                    break L33;
                  } else {
                    if (((le) this).field_V.k(-127)) {
                      break L33;
                    } else {
                      if (var3_int != 0) {
                        break L33;
                      } else {
                        if (!pb.field_m.b(true)) {
                          break L33;
                        } else {
                          if (((le) this).field_ab) {
                            break L33;
                          } else {
                            L34: {
                              if (((le) this).field_y) {
                                break L34;
                              } else {
                                L35: {
                                  if (!qg.a(-96)) {
                                    break L35;
                                  } else {
                                    ik.b(0);
                                    break L35;
                                  }
                                }
                                this.c(false);
                                if (var7 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L36: {
                              ((le) this).field_t = false;
                              this.c(false);
                              if (mj.field_p != 6) {
                                break L36;
                              } else {
                                if (((le) this).field_V.d(false) == 0) {
                                  break L36;
                                } else {
                                  hj.a(-20602);
                                  if (var7 == 0) {
                                    break L33;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                            }
                            ((le) this).field_V.a(((le) this).field_V.d(false), 157, (byte) 36, 0, 0, 0, 0, ((le) this).field_V.d(false), 0);
                            break L33;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L37: {
              var4 = n.field_g.field_nb;
              var5 = -var4 / 2;
              var6 = ((le) this).field_V.field_H - var4 / 2 - -64;
              this.a(var6, var5, param0);
              if (!param1) {
                break L37;
              } else {
                this.n(0);
                break L37;
              }
            }
            L38: {
              this.d((byte) 83);
              int fieldTemp$3 = ((le) this).field_x - 1;
              ((le) this).field_x = ((le) this).field_x - 1;
              if (fieldTemp$3 <= 0) {
                L39: {
                  if (~((le) this).field_W == ~((le) this).field_V.n((byte) -75)) {
                    ob.a(20, ((le) this).field_f, ((le) this).field_W);
                    break L39;
                  } else {
                    break L39;
                  }
                }
                ((le) this).field_x = 50;
                break L38;
              } else {
                break L38;
              }
            }
            L40: {
              L41: {
                if (((le) this).field_ab) {
                  break L41;
                } else {
                  L42: {
                    if (((le) this).field_y) {
                      ((le) this).field_z = ((le) this).field_z - 1;
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  if (0 == ((le) this).field_z) {
                    this.d(false);
                    if (var7 == 0) {
                      break L40;
                    } else {
                      break L41;
                    }
                  } else {
                    break L40;
                  }
                }
              }
              if (((le) this).field_z <= 1) {
                break L40;
              } else {
                ((le) this).field_z = ((le) this).field_z - 1;
                if (((le) this).field_z != 1) {
                  break L40;
                } else {
                  L43: {
                    if (((le) this).field_h > 0) {
                      this.i(2000);
                      break L43;
                    } else {
                      break L43;
                    }
                  }
                  if (((le) this).field_V.a(true)) {
                    break L40;
                  } else {
                    if (((le) this).field_V.d(false) == ((le) this).field_I) {
                      this.a(-113);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                }
              }
            }
            L44: {
              if (null == b.field_a.b(12623)) {
                break L44;
              } else {
                int fieldTemp$4 = wi.field_h + 1;
                wi.field_h = wi.field_h + 1;
                if (fieldTemp$4 == 335) {
                  wi.field_h = 0;
                  pg discarded$5 = b.field_a.c(true);
                  break L44;
                } else {
                  break L44;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "le.IB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        nf stackIn_1_0 = null;
        boolean stackIn_1_1 = false;
        nf stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        nf stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        ol stackIn_4_2 = null;
        RuntimeException decompiledCaughtException = null;
        nf stackOut_0_0 = null;
        boolean stackOut_0_1 = false;
        nf stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        Object stackOut_3_2 = null;
        nf stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        ol stackOut_1_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = ((le) this).field_V;
              stackOut_0_1 = qg.a(-81);
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (((le) this).field_t) {
                stackOut_3_0 = (nf) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = null;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = (ol) (Object) stackOut_3_2;
                break L1;
              } else {
                stackOut_1_0 = (nf) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = ((le) this).field_m;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              ((nf) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, param0 ^ -17);
              if (param0 == -106) {
                break L2;
              } else {
                this.a(19, (wk) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.PB(" + param0 + ')');
        }
    }

    private final boolean a(wk param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_120_0 = 0;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_125_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 60) {
              ((le) this).field_L = param0.e((byte) 99);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
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
                            stackOut_58_0 = 1;
                            stackIn_59_0 = stackOut_58_0;
                            return stackIn_59_0 != 0;
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
                                stackOut_86_0 = 1;
                                stackIn_87_0 = stackOut_86_0;
                                return stackIn_87_0 != 0;
                              } else {
                                if (param1 != 62) {
                                  if (67 != param1) {
                                    L5: {
                                      if (param2 == 0) {
                                        break L5;
                                      } else {
                                        ((le) this).field_O = true;
                                        break L5;
                                      }
                                    }
                                    stackOut_119_0 = 0;
                                    stackIn_120_0 = stackOut_119_0;
                                    break L0;
                                  } else {
                                    L6: {
                                      L7: {
                                        L8: {
                                          if (!this.b(false)) {
                                            break L8;
                                          } else {
                                            if (((le) this).field_cb.b(true)) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        this.a(param3, param1, param0, false);
                                        if (var6 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                      this.b(param0, -1);
                                      break L6;
                                    }
                                    stackOut_114_0 = 1;
                                    stackIn_115_0 = stackOut_114_0;
                                    return stackIn_115_0 != 0;
                                  }
                                } else {
                                  L9: {
                                    L10: {
                                      if (!this.j(param2 + -27726)) {
                                        break L10;
                                      } else {
                                        if (!((le) this).field_cb.b(true)) {
                                          break L10;
                                        } else {
                                          this.a(param0, 0, 8888);
                                          if (var6 == 0) {
                                            break L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    this.a(param3, param1, param0, false);
                                    break L9;
                                  }
                                  stackOut_100_0 = 1;
                                  stackIn_101_0 = stackOut_100_0;
                                  return stackIn_101_0 != 0;
                                }
                              }
                            } else {
                              L11: {
                                L12: {
                                  if (!this.l(-8712)) {
                                    break L12;
                                  } else {
                                    if (!((le) this).field_cb.b(true)) {
                                      break L12;
                                    } else {
                                      this.b(33, param0);
                                      if (var6 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                this.a(param3, param1, param0, false);
                                break L11;
                              }
                              stackOut_72_0 = 1;
                              stackIn_73_0 = stackOut_72_0;
                              return stackIn_73_0 != 0;
                            }
                          }
                        } else {
                          L13: {
                            L14: {
                              L15: {
                                if (!this.e(true)) {
                                  break L15;
                                } else {
                                  if (((le) this).field_cb.b(true)) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              this.a(param3, param1, param0, false);
                              if (var6 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                            this.a(param0, -122);
                            break L13;
                          }
                          stackOut_44_0 = 1;
                          stackIn_45_0 = stackOut_44_0;
                          return stackIn_45_0 != 0;
                        }
                      } else {
                        L16: {
                          L17: {
                            L18: {
                              if (!this.b((byte) -116)) {
                                break L18;
                              } else {
                                if (((le) this).field_cb.b(true)) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            this.a(param3, param1, param0, false);
                            if (var6 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                          this.a(5158, param0);
                          break L16;
                        }
                        stackOut_30_0 = 1;
                        stackIn_31_0 = stackOut_30_0;
                        return stackIn_31_0 != 0;
                      }
                    } else {
                      ((le) this).field_a = param0.e((byte) -86);
                      jk.a((byte) 121);
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    }
                  } else {
                    ((le) this).field_b = param0.e((byte) 48);
                    jk.a((byte) 121);
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                } else {
                  ((le) this).field_J = param0.e((byte) 80);
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                ((le) this).field_D = param0.e((byte) -90);
                jg.a(-3);
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_121_0 = (RuntimeException) var5;
            stackOut_121_1 = new StringBuilder().append("le.V(");
            stackIn_124_0 = stackOut_121_0;
            stackIn_124_1 = stackOut_121_1;
            stackIn_122_0 = stackOut_121_0;
            stackIn_122_1 = stackOut_121_1;
            if (param0 == null) {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "null";
              stackIn_125_0 = stackOut_124_0;
              stackIn_125_1 = stackOut_124_1;
              stackIn_125_2 = stackOut_124_2;
              break L19;
            } else {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "{...}";
              stackIn_125_0 = stackOut_122_0;
              stackIn_125_1 = stackOut_122_1;
              stackIn_125_2 = stackOut_122_2;
              break L19;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_125_0, stackIn_125_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_120_0 != 0;
    }

    final static boolean a(byte param0) {
        long var1_long = 0L;
        RuntimeException var1 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var1_long = qj.b(-26572);
            if (param0 > 67) {
              var3 = -mh.field_K + var1_long;
              if (30000L >= var3) {
                L1: {
                  L2: {
                    var5 = 3000;
                    if (7 <= ik.field_b) {
                      break L2;
                    } else {
                      L3: {
                        if (ik.field_b < 5) {
                          break L3;
                        } else {
                          var5 = 9000;
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (ik.field_b < 3) {
                        break L1;
                      } else {
                        var5 = 6000;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var5 = 12000;
                  break L1;
                }
                if (~(long)var5 > ~var3) {
                  ik.field_b = ik.field_b + 1;
                  mh.field_K = var1_long;
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0 != 0;
                } else {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                }
              } else {
                mh.field_K = var1_long;
                ik.field_b = 0;
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "le.DA(" + param0 + ')');
        }
        return stackIn_23_0 != 0;
    }

    private final void d(boolean param0) {
        try {
            ((le) this).a(0, 0, 0, 0, 0, 0, -1, -118);
            ((le) this).field_V.e(true);
            if (param0) {
                ((le) this).field_Z = 120;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "le.MA(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wi.a(param1, ad.field_f, param0 ^ 79)) {
              return;
            } else {
              L1: {
                var4 = ad.field_f;
                var5 = param1;
                var4[var5 >> -695850555] = fj.b(var4[var5 >> -695850555], 1 << dg.a(var5, 31));
                if (param0 == 79) {
                  break L1;
                } else {
                  ((le) this).field_O = false;
                  break L1;
                }
              }
              L2: {
                b.field_a.b((pg) (Object) new qa(param1), -1);
                if (((le) this).field_U) {
                  break L2;
                } else {
                  wh.field_h.b((pg) (Object) new cm(param1, param2, 0, 0, 0, 0), param0 + -80);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "le.NB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(wk param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
                int discarded$2 = ((le) this).field_w.e((byte) 72);
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
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("le.RA(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        ml var7_ref_ml = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_69_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_210_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_208_0 = 0;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          var3_int = n.field_g.field_nb;
          if (param1 == 10) {
            break L0;
          } else {
            this.a(41, 48, 1, -100);
            break L0;
          }
        }
        L1: {
          var4 = an.field_g - (-vn.field_c + (an.field_f >> -1339707423));
          var5 = -(var3_int >> -1920262655) + me.field_I + ol.field_g;
          if (((le) this).field_u > 0) {
            var4 = ((le) this).field_e;
            var5 = ((le) this).field_c;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (ti.field_N != 78) {
            break L2;
          } else {
            var5 += 64;
            break L2;
          }
        }
        L3: {
          L4: {
            var6 = ((le) this).field_V.a(((le) this).field_bb, true);
            if (var6 == null) {
              break L4;
            } else {
              if (var6.m(-20357) <= 0) {
                break L4;
              } else {
                break L3;
              }
            }
          }
          var6 = ((le) this).field_V.a(((le) this).field_V.d(false), true);
          if (null == var6) {
            break L3;
          } else {
            ((le) this).field_bb = var6.y(17571);
            break L3;
          }
        }
        L5: {
          if (var6 != null) {
            break L5;
          } else {
            if (!((le) this).field_ab) {
              break L5;
            } else {
              if (!((le) this).field_V.a(true)) {
                this.a(36);
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
        L6: {
          if (null == var6) {
            break L6;
          } else {
            if (var6.w(param1 ^ 24511) != null) {
              break L6;
            } else {
              if (~var6.y(17571) != ~((le) this).field_V.d(false)) {
                var6 = this.q(param1 + 10771);
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
        L7: {
          if (null == var6) {
            break L7;
          } else {
            if (var6.w(24501) == null) {
              break L7;
            } else {
              if (37 == var6.o(-22625)) {
                break L7;
              } else {
                var7_ref_ml = ((le) this).field_V.a(((le) this).field_V.d(false), true);
                if (null == var7_ref_ml) {
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
          if (null == var6) {
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
                        if (var6.r(param1 + -132) == ((le) this).field_V.q((byte) -122)) {
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
                  stackOut_67_0 = 1;
                  stackIn_69_0 = stackOut_67_0;
                  break L11;
                }
              }
            }
          }
          stackOut_68_0 = 0;
          stackIn_69_0 = stackOut_68_0;
          break L11;
        }
        L15: {
          var7 = stackIn_69_0;
          if (null == var6) {
            break L15;
          } else {
            L16: {
              if (~var6.i((byte) 121) > ~(128 + ((le) this).field_V.field_H)) {
                break L16;
              } else {
                L17: {
                  L18: {
                    if (var6.m(param1 ^ -20367) <= 0) {
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
                  stackOut_90_0 = 1;
                  stackIn_92_0 = stackOut_90_0;
                  break L19;
                }
              }
              stackOut_91_0 = 0;
              stackIn_92_0 = stackOut_91_0;
              break L19;
            }
            L22: {
              L23: {
                var8 = stackIn_92_0;
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
                  stackOut_97_0 = 1;
                  stackIn_99_0 = stackOut_97_0;
                  break L22;
                }
              }
              stackOut_98_0 = 0;
              stackIn_99_0 = stackOut_98_0;
              break L22;
            }
            L25: {
              var9 = stackIn_99_0;
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
                    if (null != var6) {
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
                        this.i(param1 + 1990);
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
                    var6.c(param1 + -10, 1);
                    ((le) this).field_m.a(param1 ^ -106, var6);
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
                        stackOut_177_0 = 0;
                        stackIn_178_0 = stackOut_177_0;
                        break L47;
                      } else {
                        stackOut_176_0 = 1;
                        stackIn_178_0 = stackOut_176_0;
                        break L47;
                      }
                    }
                    hc.field_f = stackIn_178_0 != 0;
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
                          stackOut_209_0 = 0;
                          stackIn_210_0 = stackOut_209_0;
                          break L52;
                        } else {
                          stackOut_208_0 = 1;
                          stackIn_210_0 = stackOut_208_0;
                          break L52;
                        }
                      }
                      L53: {
                        var8 = stackIn_210_0;
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
                                  ((le) this).field_c = -(var3_int >> 1740300769) + ol.field_g + me.field_I;
                                  ((le) this).field_e = -(an.field_f >> 1845837313) + vn.field_c + an.field_g;
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
                            bl.a(sm.field_e, param1 ^ 119);
                            sm.field_e = null;
                            break L66;
                          }
                        }
                        L67: {
                          var9 = var6.f(-51);
                          var10 = var6.i((byte) 11);
                          var11 = var6.p(param1 ^ -8329);
                          var12 = -var9 + var4;
                          var13 = -var10 + (var5 - -(var11 >> -1147770175));
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
                                      if (!((le) this).field_V.a(var6, var6.i((byte) -111), var6.f(param1 ^ -103), -129, ti.field_N)) {
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
                                        ((le) this).a(var5, ti.field_N, ((le) this).field_r, var4, ((le) this).field_u, ((le) this).field_s, var6.y(17571), param1 ^ -65);
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
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -97) {
                break L1;
              } else {
                ((le) this).field_v = null;
                break L1;
              }
            }
            L2: {
              if (!((le) this).field_ab) {
                var3_int = param1 ? 1 : 0;
                gj.a(var3_int != 0, true, 0, mn.field_r);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "le.W(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(ml param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
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
            L10: {
              if (param1 > 42) {
                break L10;
              } else {
                ((le) this).field_s = -110;
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var3;
            stackOut_69_1 = new StringBuilder().append("le.OA(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L11;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
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
                          if (null == var10) {
                            break L8;
                          } else {
                            if (null == var11) {
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
            stackOut_67_0 = (RuntimeException) var3;
            stackOut_67_1 = new StringBuilder().append("le.EA(").append(param0).append(',');
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L11;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ')');
        }
    }

    private final boolean e(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((le) this).field_r = 70;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((le) this).field_o) {
                  break L3;
                } else {
                  L4: {
                    if (this.r(-33)) {
                      break L4;
                    } else {
                      if (!((le) this).field_k) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_13_0 = stackOut_10_0;
                  break L2;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.IA(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
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
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_127_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = n.field_g.field_nb;
              var4 = an.field_g + (vn.field_c - (an.field_f >> -1765702527));
              var5 = -(var3_int >> 1101346177) + me.field_I - -ol.field_g;
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
              var10 = (var8 >> -1578986239) + (-var7 + var5);
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
              L22: {
                if (!((le) this).field_V.a(true)) {
                  L23: {
                    L24: {
                      if (0 < var9) {
                        break L24;
                      } else {
                        param1.field_E = -1;
                        if (var19 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    param1.field_E = 1;
                    break L23;
                  }
                  L25: {
                    L26: {
                      if (ti.field_N == 127) {
                        break L26;
                      } else {
                        if (ti.field_N == 128) {
                          break L26;
                        } else {
                          if (ti.field_N == 129) {
                            break L26;
                          } else {
                            if (ti.field_N == 136) {
                              break L26;
                            } else {
                              if (155 == ti.field_N) {
                                break L26;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (~Math.abs(var9) <= ~Math.abs(var10)) {
                      break L25;
                    } else {
                      L27: {
                        L28: {
                          var9 = param1.field_E * 64;
                          if (0 > var10) {
                            break L28;
                          } else {
                            var10 = 64;
                            if (var19 == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        var10 = -64;
                        break L27;
                      }
                      var11 = (int)Math.sqrt((double)(var9 * var9 - -(var10 * var10)));
                      if (var11 == 0) {
                        var11 = 1;
                        var10 = -1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  L29: {
                    if (var12 == 0) {
                      break L29;
                    } else {
                      var15 = var8 / 2;
                      var16 = 100 + var15;
                      var14 = (var3_int >> 1725395873) + -ol.field_g + var10 * (var16 + -50) / var11 + (-var15 + var7);
                      var13 = (an.field_f >> 413355681) + (var9 * (-50 + var16) / var11 - -var6) - vn.field_c;
                      tg.field_b[4].a(-16 + var13, -16 + var14);
                      var14 = (var3_int >> -502661215) + ((var16 + -50 - 16) * var10 / var11 - (var15 - var7 - -ol.field_g));
                      var13 = -vn.field_c + (var9 * (-50 + (var16 + -16)) / var11 + var6) - -(an.field_f >> 336855617);
                      tg.field_b[4].c(var13 + -8, var14 - 8);
                      var14 = (var3_int >> 1372985025) + var7 + -var15 + (var10 * (-24 + (var16 - 50)) / var11 - ol.field_g);
                      var13 = -vn.field_c + var6 + var9 * (-24 + var16 + -50) / var11 + (an.field_f >> -1057883199);
                      tg.field_b[4].b(var13 - 4, var14 - 4);
                      if (var19 == 0) {
                        break L22;
                      } else {
                        break L29;
                      }
                    }
                  }
                  var13 = var8 / 2;
                  var16 = 0;
                  L30: while (true) {
                    if (var16 >= 100) {
                      break L22;
                    } else {
                      var17 = var16 + var13;
                      var14 = var9 * var17 / var11;
                      var15 = -var13 + var17 * var10 / var11;
                      var18 = 0;
                      if (var19 != 0) {
                        break L21;
                      } else {
                        L31: {
                          L32: {
                            if (var16 >= 25) {
                              break L32;
                            } else {
                              var18 = var18 | 16711680 & var16 * 10 << 285350768;
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
                          var18 = var18 | var16 * 5 - 125 << 130659656 & 65280;
                          break L31;
                        }
                        L35: {
                          L36: {
                            if (var16 <= 25) {
                              break L36;
                            } else {
                              de.c((an.field_f >> 625218945) + (-vn.field_c + var6) + var14, (var3_int >> -1692184031) + -ol.field_g + var15 + var7, 1600 / (200 - var16 * 100 / 100), var18, 25);
                              if (var19 == 0) {
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          de.c(-vn.field_c + (var6 - -var14 + (an.field_f >> -1285323487)), (var3_int >> 348597121) + -ol.field_g + var15 + var7, 1600 / (200 + -(var16 * 100 / 100)), var18, var16);
                          break L35;
                        }
                        var16++;
                        if (var19 == 0) {
                          continue L30;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                } else {
                  break L22;
                }
              }
              break L21;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var3 = decompiledCaughtException;
            stackOut_123_0 = (RuntimeException) var3;
            stackOut_123_1 = new StringBuilder().append("le.N(").append(param0).append(',');
            stackIn_126_0 = stackOut_123_0;
            stackIn_126_1 = stackOut_123_1;
            stackIn_124_0 = stackOut_123_0;
            stackIn_124_1 = stackOut_123_1;
            if (param1 == null) {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "null";
              stackIn_127_0 = stackOut_126_0;
              stackIn_127_1 = stackOut_126_1;
              stackIn_127_2 = stackOut_126_2;
              break L37;
            } else {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "{...}";
              stackIn_127_0 = stackOut_124_0;
              stackIn_127_1 = stackOut_124_1;
              stackIn_127_2 = stackOut_124_2;
              break L37;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_127_0, stackIn_127_2 + ')');
        }
    }

    private final void c(wk param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var3_int = param0.d(-10674);
              ((le) this).field_w.c(-1);
              var4 = ((le) this).field_w.o(4);
              if (param1 > 47) {
                break L1;
              } else {
                ((le) this).field_I = -95;
                break L1;
              }
            }
            L2: {
              if (var4 != var3_int) {
                L3: {
                  if (!((le) this).field_k) {
                    break L3;
                  } else {
                    he.field_e.b((byte) -67, 67);
                    he.field_e.a(var4, (byte) -101);
                    we.a(0, (byte) 93);
                    break L3;
                  }
                }
                ka.b(false);
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              if (!((le) this).field_k) {
                ((le) this).field_V.c(-1);
                ((le) this).field_z = 0;
                break L4;
              } else {
                break L4;
              }
            }
            ((le) this).field_o = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("le.M(");
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
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        vn var5 = null;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 0) {
              var4_int = n.field_g.field_nb;
              var5 = ((le) this).field_V.g((byte) 70);
              if (null == var5) {
                return;
              } else {
                var6 = (ml) (Object) var5.b(param1 + 12623);
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        if (var6 == null) {
                          break L4;
                        } else {
                          stackOut_9_0 = var6.y(17571);
                          stackOut_9_1 = ((le) this).field_bb;
                          stackIn_20_0 = stackOut_9_0;
                          stackIn_20_1 = stackOut_9_1;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          if (var10 != 0) {
                            break L3;
                          } else {
                            L5: {
                              if (stackIn_10_0 == stackIn_10_1) {
                                break L5;
                              } else {
                                var6.c((var4_int >> 1974162273) + -param0, -param2 + (an.field_f >> -923083935), 1703903841);
                                break L5;
                              }
                            }
                            var6 = (ml) (Object) var5.a(0);
                            if (var10 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var6 = ((le) this).field_V.a(((le) this).field_bb, true);
                      if (var6 != null) {
                        var6.c((var4_int >> -431058815) + -param0, (an.field_f >> 544990049) + -param2, 1703903841);
                        stackOut_19_0 = ~((le) this).field_u;
                        stackOut_19_1 = -1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                    L6: {
                      if (stackIn_20_0 != stackIn_20_1) {
                        break L6;
                      } else {
                        if (-1 == ti.field_N) {
                          break L6;
                        } else {
                          if (null == eb.field_b) {
                            var7 = -param2 - -(an.field_f >> 1384071201) - -var6.f(-88);
                            var8 = -48 + (var4_int >> 672378433) + -param0 - -var6.i((byte) 115) + (-var6.p(-8323) + -((le) this).field_M);
                            de.i(var7, var8, 20, 16777215);
                            gn.a(20, (byte) 99, 192, var7, var8);
                            de.c(var7, var8, 20, 0);
                            bb.field_g[dd.field_f[ti.field_N]].c(var7 + -20, var8 + -20);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      if (((le) this).field_u != 0) {
                        break L7;
                      } else {
                        if (ti.field_N != -1) {
                          break L7;
                        } else {
                          if (null != eb.field_b) {
                            break L7;
                          } else {
                            if (((le) this).field_V.d(false) >= 0) {
                              var7 = -param2 + ((an.field_f >> 1629268289) + var6.f(param1 ^ -82));
                              var8 = -64 + var6.i((byte) 117) + (-param0 + ((var4_int >> 1093167265) - var6.p(-8323))) + -((le) this).field_M;
                              var9 = nj.field_n[((le) this).field_V.d(false)];
                              if (((le) this).field_V.d(false) < 0) {
                                break L7;
                              } else {
                                tg.field_b[3].b(var7 + -16, -(int)(Math.sin(3.14 * (double)((le) this).field_P / 32.0) * 32.0) + -16 + var8, var9);
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    this.g(0);
                    this.a(var6, 98);
                    break L2;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "le.VA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final ml q(int param0) {
        RuntimeException var2 = null;
        vn var2_ref = null;
        int var3 = 0;
        ml var4 = null;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        pg stackIn_13_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        ml stackIn_47_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_5_0 = null;
        pg stackOut_11_0 = null;
        pg stackOut_12_0 = null;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        ml stackOut_46_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = ((le) this).field_V.g((byte) 85);
                        var3 = ((le) this).field_bb;
                        var4 = ((le) this).field_V.a(var3, true);
                        if (param0 == 10781) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = null;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (ml) (Object) stackIn_3_0;
                }
                case 4: {
                    try {
                        if (var4 != null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = null;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return (ml) (Object) stackIn_6_0;
                }
                case 7: {
                    try {
                        var5 = 0;
                        if (~var4.i((byte) 127) > ~((le) this).field_V.field_H) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = 1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = var4;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6.field_b == var2_ref.field_e) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = var6.field_b;
                        stackIn_13_0 = stackOut_11_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = var2_ref.field_e.field_b;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = (ml) (Object) stackIn_13_0;
                        if (var6 == var4) {
                            statePc = 46;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var6.t(34)) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (37 != var6.o(-22625)) {
                            statePc = 10;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (((le) this).field_V.field_d) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var6 == null) {
                            statePc = 10;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var6.o(-22625) == 12) {
                            statePc = 10;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var6.g(false) != ((le) this).field_V.d(false)) {
                            statePc = 10;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4 = var6;
                        ((le) this).field_bb = var6.y(17571);
                        eb.field_b = null;
                        ti.field_N = -1;
                        var6.a((byte) 65, 0);
                        if (var7 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var6 == null) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = ~var6.y(17571);
                        stackOut_33_1 = ~((le) this).field_V.d(false);
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 == stackIn_35_1) {
                            statePc = 42;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var6.w(24501) == null) {
                            statePc = 10;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = var6.r(106);
                        stackOut_37_1 = ((le) this).field_V.q((byte) -115);
                        stackIn_35_0 = stackOut_37_0;
                        stackIn_35_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (var7 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = stackIn_38_0;
                        stackOut_38_1 = stackIn_38_1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 == stackIn_40_1) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var6.o(param0 + -33406) != 12) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var4 = var6;
                        ((le) this).field_bb = var6.y(param0 + 6790);
                        eb.field_b = null;
                        ti.field_N = -1;
                        var6.a((byte) -31, 0);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((le) this).field_m.a(param0 + -10886, var4);
                        stackOut_46_0 = (ml) var4;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return stackIn_47_0;
                }
                case 48: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw aa.a((Throwable) (Object) var2, "le.C(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(boolean param0) {
        try {
            ((le) this).field_V.b((byte) 88, ((le) this).field_J);
            ((le) this).field_V.c(-1);
            this.b(0);
            ((le) this).field_F = param0;
            ((le) this).field_z = ((le) this).field_V.f(12955);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "le.R(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -50 + an.field_f;
              var3 = 10;
              var4 = -1;
              if (0 == ((le) this).field_V.a(param0 + -6154)) {
                var4 = 5;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -25343) {
                break L2;
              } else {
                this.a(-125, (ml) null);
                break L2;
              }
            }
            L3: {
              if (((le) this).field_V.a(param0 ^ 6646) == 1) {
                var4 = 17;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (2 != ((le) this).field_V.a(param0 ^ 6646)) {
                break L4;
              } else {
                var4 = 42;
                break L4;
              }
            }
            L5: {
              if (((le) this).field_V.a(-31497) == 4) {
                var4 = 29;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((le) this).field_V.a(-31497) == 5) {
                var4 = 55;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((le) this).field_V.a(-31497) != 6) {
                break L7;
              } else {
                var4 = 67;
                break L7;
              }
            }
            L8: {
              if (((le) this).field_V.a(-31497) != 7) {
                break L8;
              } else {
                var4 = 85;
                break L8;
              }
            }
            L9: {
              if (((le) this).field_V.a(-31497) != 8) {
                break L9;
              } else {
                var4 = 72;
                break L9;
              }
            }
            L10: {
              if (var4 == -1) {
                break L10;
              } else {
                L11: {
                  if (((le) this).field_V.n((byte) -75) < ((le) this).field_V.l(4)) {
                    break L11;
                  } else {
                    de.g(-4 + var2_int, -4 + var3, 48, 48, 8, 8323072);
                    de.g(-2 + var2_int, var3 + -2, 44, 44, 6, 16711680);
                    bb.field_g[var4].c(var2_int, var3);
                    if (!ArcanistsMulti.field_G) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                var5 = 256 * (((le) this).field_V.l(4) - ((le) this).field_V.n((byte) -75)) / ((le) this).field_V.l(4);
                de.g(-4 + var2_int, var3 - 4, 48, 48, 8, 8355711);
                de.g(-2 + var2_int, var3 + -2, 44, 44, 6, 16777215);
                bb.field_g[var4].c(var2_int, var3, -var5 + 256);
                var6 = (-1 + ((le) this).field_V.l(4) + (-((le) this).field_V.n((byte) -75) - -((le) this).field_V.s(0))) / ((le) this).field_V.s(0);
                int discarded$3 = tj.field_t.a(Integer.toString(var6), -4 + var2_int, -4 + (var3 + -1), 48, 48, 8355711, 0, 1, 1, tj.field_t.field_C);
                int discarded$4 = tj.field_t.a(Integer.toString(var6), -5 + var2_int, -4 + var3, 48, 48, 8355711, 0, 1, 1, tj.field_t.field_C);
                int discarded$5 = tj.field_t.a(Integer.toString(var6), -4 + var2_int, -4 + var3, 48, 48, 16777215, -1, 1, 1, tj.field_t.field_C);
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.HA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 < -58) {
                break L1;
              } else {
                ((le) this).field_c = 77;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param6 != -1) {
                  break L3;
                } else {
                  ((le) this).field_V.e(true);
                  if (var10 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                ((le) this).field_t = false;
                if (param1 == 87) {
                  break L4;
                } else {
                  if (param1 == 116) {
                    break L4;
                  } else {
                    if (param1 == 158) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (6 == param1) {
                            break L6;
                          } else {
                            if (param1 != 79) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (pb.field_m.b(true)) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                      L7: {
                        if (param1 == 159) {
                          break L7;
                        } else {
                          ma.a(li.field_I + tc.field_w[param1], 8421504, (byte) -103);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ma.a(kj.field_b, 8421504, (byte) -42);
                      break L4;
                    }
                  }
                }
              }
              ((le) this).field_V.a(((le) this).field_V.d(false), param1, (byte) 77, param4, param3, param0, param2, param6, param5);
              break L2;
            }
            L8: {
              if (qg.a(-127)) {
                break L8;
              } else {
                if (((le) this).field_V.b(((le) this).field_J, -89)) {
                  gj.a(false, true, -1, mn.field_r);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var9, "le.CB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void g(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((le) this).field_ab) {
              L1: {
                he.field_e.b((byte) -79, 61);
                if (param0 == -61) {
                  break L1;
                } else {
                  ((le) this).field_e = -97;
                  break L1;
                }
              }
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "le.FA(" + param0 + ')');
        }
    }

    private final void b(wk param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
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
              ((le) this).field_k = false;
              ((le) this).field_V.a((byte) 72, ((le) this).field_w);
              var3_int = param0.o(6);
              var4 = param0.e((byte) -114);
              ((le) this).field_V.a(var3_int, (byte) 63, var4);
              if (null == ((le) this).field_w) {
                break L1;
              } else {
                ((le) this).field_w.a(var3_int, (byte) 60, var4);
                break L1;
              }
            }
            gj.a(false, true, param1, mn.field_r);
            ((le) this).field_o = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("le.G(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    le(boolean param0, int param1, int param2, boolean param3, String[] param4, int param5, int[][] param6, int[][] param7, int[] param8, int param9, int param10, boolean param11, int param12, boolean[] param13) {
        RuntimeException var15 = null;
        int var15_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
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
              L2: {
                ((le) this).field_ab = param0;
                ((le) this).field_i = param11;
                ((le) this).field_I = param5;
                var15_int = param12;
                ((le) this).field_V = new nf(false, false, param1, param2, param3, param4, param9, param10, param6, param7, param8, var15_int, param13);
                ((le) this).field_V.field_H = 960;
                ((le) this).field_V.field_y = 1920;
                ((le) this).field_V.field_Hb = ((le) this).field_V.field_H >> 1283451265;
                ((le) this).field_V.field_hb = ((le) this).field_V.field_y >> 1971350049;
                ((le) this).field_V.p(88);
                ((le) this).field_V.c(true);
                ue.a((byte) -117, (le) this);
                ((le) this).field_W = -1;
                ((le) this).field_x = 0;
                ((le) this).field_f = null;
                ((le) this).field_m = new ol();
                ((le) this).field_cb = new vn();
                if (!((le) this).field_ab) {
                  break L2;
                } else {
                  tj.c(63);
                  ((le) this).field_w = new nf(false, false, param1, param2, param3, param4, param9, param10, param6, param7, param8, var15_int, param13);
                  ((le) this).field_w.p(63);
                  ((le) this).field_w.c(true);
                  ((le) this).field_k = true;
                  ((le) this).field_L = 0;
                  if (!ArcanistsMulti.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              k.a((le) this, true);
              df.a((byte) 83, 0);
              ((le) this).field_V.field_sb = cf.field_h;
              ((le) this).field_V.field_rb = uk.field_g;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var15 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var15;
            stackOut_8_1 = new StringBuilder().append("le.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param5).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param6 == null) {
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
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param7 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param8 == null) {
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
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param13 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
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

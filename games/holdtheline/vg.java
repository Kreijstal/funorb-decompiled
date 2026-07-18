/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vg extends v implements ed, pi {
    private rm field_Q;
    private boolean field_S;
    static int field_G;
    static String field_L;
    private nk field_M;
    private rm field_F;
    private boolean field_O;
    private boolean field_I;
    static int field_J;
    static String field_K;
    static int field_P;
    private nk field_H;
    private rm field_N;
    static int field_T;
    private String field_R;

    public static void i(int param0) {
        if (param0 <= 0) {
            return;
        }
        try {
            field_L = null;
            field_K = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "vg.R(" + param0 + ')');
        }
    }

    public final void a(nk param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -48 / ((-61 - param1) / 38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("vg.P(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (rd.b(-106)) {
                  break L2;
                } else {
                  if (0 >= ((vg) this).field_M.field_q.length()) {
                    break L1;
                  } else {
                    if (0 >= ((vg) this).field_H.field_q.length()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              mi.a(((vg) this).field_H.field_q, (byte) -60, ((vg) this).field_M.field_q);
              break L1;
            }
            L3: {
              if (param0 == -23) {
                break L3;
              } else {
                String discarded$2 = ((vg) this).a(true);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "vg.Q(" + param0 + ')');
        }
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        kk var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ee var8 = null;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 == -1542826527) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            var4 = (kk) (Object) rl.field_J.b((byte) 95);
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 == null) {
                    break L4;
                  } else {
                    if (var14 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (null == var4.field_p) {
                          break L5;
                        } else {
                          if (!var4.field_p.b(89)) {
                            var4.d(0);
                            var4 = (kk) (Object) rl.field_J.c((byte) -112);
                            if (var14 == 0) {
                              continue L2;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;
                        var8 = var4.field_q;
                        if (null != ch.field_i) {
                          var6 = -ch.field_i.field_A.field_f + var8.field_A.field_f;
                          var5 = var8.field_A.field_h - ch.field_i.field_A.field_h;
                          var7 = var6 * var6 + var5 * var5;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (var7 <= 0) {
                            break L8;
                          } else {
                            L9: {
                              var9 = (float)Math.sqrt((double)var7);
                              var10 = -ch.field_i.field_t + var8.field_t;
                              var11 = -ch.field_i.field_x + var8.field_x;
                              var12 = (var11 * (float)var6 + (float)var5 * var10) / var9;
                              var12 = 160.0f / (160.0f + var12);
                              if (0.75f <= var12) {
                                break L9;
                              } else {
                                var12 = 0.75f;
                                break L9;
                              }
                            }
                            L10: {
                              if (var12 <= 1.25f) {
                                break L10;
                              } else {
                                var12 = 1.25f;
                                break L10;
                              }
                            }
                            L11: {
                              var3 = (int)(256.0f * var12);
                              var1_int = 128000 / (int)var9;
                              if (var1_int <= 1536) {
                                break L11;
                              } else {
                                var1_int = 1536;
                                break L11;
                              }
                            }
                            L12: {
                              if (192 <= var1_int) {
                                break L12;
                              } else {
                                var1_int = 192;
                                break L12;
                              }
                            }
                            var13 = (float)var5 / var9;
                            var2 = (int)(8192.0f * (1.0f + var13));
                            if (var14 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var3 = 256;
                        var1_int = 2048;
                        var2 = 8192;
                        break L7;
                      }
                      L13: {
                        if (null == var4.field_p) {
                          var4.field_p = lg.a(var4.field_o, (byte) -68);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var4.field_p.b(pc.field_h * var4.field_n * var1_int >> -1212446192, true);
                      var4.field_p.a(var2, -64);
                      var4.field_p.a(var3, false);
                      var4 = (kk) (Object) rl.field_J.c((byte) 125);
                      if (var14 == 0) {
                        continue L2;
                      } else {
                        break L4;
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
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "vg.L(" + param0 + ')');
        }
    }

    final void a(int param0, String param1) {
        nk var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
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
              if (param0 < -86) {
                break L1;
              } else {
                boolean discarded$2 = vg.b(false);
                break L1;
              }
            }
            var3 = ((vg) this).field_M;
            var4 = param1;
            var3.a(false, var4, 1471);
            ((vg) this).field_H.o(1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("vg.K(").append(param0).append(',');
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
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    vg(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (dh) null);
        RuntimeException var6 = null;
        mo var6_ref = null;
        qi var7 = null;
        String var8 = null;
        mf var9 = null;
        dj var10 = null;
        int var11 = 0;
        Object stackIn_13_0 = null;
        rm stackIn_13_1 = null;
        rm stackIn_13_2 = null;
        Object stackIn_15_0 = null;
        rm stackIn_15_1 = null;
        rm stackIn_15_2 = null;
        Object stackIn_17_0 = null;
        rm stackIn_17_1 = null;
        rm stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        rm stackIn_18_1 = null;
        rm stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        rm stackOut_12_1 = null;
        rm stackOut_12_2 = null;
        Object stackOut_17_0 = null;
        rm stackOut_17_1 = null;
        rm stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_13_0 = null;
        rm stackOut_13_1 = null;
        rm stackOut_13_2 = null;
        Object stackOut_15_0 = null;
        rm stackOut_15_1 = null;
        rm stackOut_15_2 = null;
        String stackOut_15_3 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              ((vg) this).field_R = param1;
              ((vg) this).field_O = param3;
              ((vg) this).field_I = param2;
              ((vg) this).field_S = param4;
              if (!((vg) this).field_I) {
                break L1;
              } else {
                L2: {
                  if (((vg) this).field_O) {
                    break L2;
                  } else {
                    if (!((vg) this).field_S) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L3: {
              L4: {
                ((vg) this).field_M = (nk) (Object) new jb(param0, (tb) this, 100);
                ((vg) this).field_H = (nk) (Object) new jb("", (tb) this, 20);
                if (!((vg) this).field_I) {
                  break L4;
                } else {
                  ((vg) this).field_F = new rm(lg.field_p, (tb) null);
                  ((vg) this).field_Q = new rm(dl.field_n, (tb) null);
                  ((vg) this).field_M.field_D = false;
                  if (var11 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                ((vg) this).field_F = new rm(qh.field_c, (tb) null);
                stackOut_12_0 = this;
                stackOut_12_1 = null;
                stackOut_12_2 = null;
                stackIn_17_0 = stackOut_12_0;
                stackIn_17_1 = stackOut_12_1;
                stackIn_17_2 = stackOut_12_2;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                if (((vg) this).field_S) {
                  stackOut_17_0 = this;
                  stackOut_17_1 = null;
                  stackOut_17_2 = null;
                  stackOut_17_3 = ue.field_a;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  stackIn_18_3 = stackOut_17_3;
                  break L5;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = null;
                  stackOut_13_2 = null;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackOut_15_3 = kn.field_i;
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_18_2 = stackOut_15_2;
                  stackIn_18_3 = stackOut_15_3;
                  break L5;
                }
              }
              ((vg) this).field_Q = new rm(stackIn_18_3, (tb) null);
              if (!((vg) this).field_O) {
                break L3;
              } else {
                ((vg) this).field_N = new rm(fo.field_m, (tb) this);
                break L3;
              }
            }
            L6: {
              ((vg) this).field_M.field_l = (dh) (Object) new kl(10000536);
              ((vg) this).field_H.field_l = (dh) (Object) new tl(10000536);
              var6_ref = new mo();
              ((vg) this).field_F.field_l = (dh) (Object) var6_ref;
              if (((vg) this).field_Q == null) {
                break L6;
              } else {
                ((vg) this).field_Q.field_l = (dh) (Object) var6_ref;
                break L6;
              }
            }
            L7: {
              ((vg) this).field_M.field_z = gb.field_a;
              if (null != ((vg) this).field_N) {
                ((vg) this).field_N.field_l = (dh) (Object) var6_ref;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (null != ((vg) this).field_N) {
                ((vg) this).field_N.field_z = ml.field_b;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                if (((vg) this).field_I) {
                  break L10;
                } else {
                  L11: {
                    if (((vg) this).field_S) {
                      break L11;
                    } else {
                      ((vg) this).field_Q.field_l = (dh) (Object) new am();
                      if (var11 == 0) {
                        break L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                  ((vg) this).field_Q.field_z = wc.field_j;
                  ((vg) this).field_Q.field_l = (dh) (Object) new am();
                  if (var11 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              ((vg) this).field_Q.field_z = fd.field_b;
              break L9;
            }
            L12: {
              ((vg) this).field_o = 15;
              var7 = hl.field_g;
              if (((vg) this).field_R == null) {
                break L12;
              } else {
                ((vg) this).field_o = ((vg) this).field_o + (var7.b(((vg) this).field_R, ((vg) this).field_x + -40, var7.field_G) - -5);
                break L12;
              }
            }
            L13: {
              L14: {
                var8 = rf.field_bb;
                var9 = jj.a(en.a(110), (byte) 124);
                if (var9 == ja.field_Wb) {
                  break L14;
                } else {
                  if (var9 != gj.field_s) {
                    break L13;
                  } else {
                    var8 = co.field_c;
                    if (var11 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              var8 = rc.field_d;
              break L13;
            }
            L15: {
              dj dupTemp$2 = new dj(10, ((vg) this).field_o, -20 + ((vg) this).field_x, 25, (n) (Object) ((vg) this).field_M, false, 80, 3, var7, 16777215, var8);
              var10 = dupTemp$2;
              ((vg) this).a(true, (n) (Object) dupTemp$2);
              ((vg) this).field_o = ((vg) this).field_o + (((n) (Object) var10).field_u + 5);
              dj dupTemp$3 = new dj(10, ((vg) this).field_o, ((vg) this).field_x + -20, 25, (n) (Object) ((vg) this).field_H, false, 80, 3, var7, 16777215, lc.field_f);
              var10 = dupTemp$3;
              ((vg) this).a(true, (n) (Object) dupTemp$3);
              ((vg) this).field_F.field_t = (tb) this;
              ((vg) this).field_o = ((vg) this).field_o + (((n) (Object) var10).field_u - -5);
              if (((vg) this).field_N == null) {
                break L15;
              } else {
                ((vg) this).field_N.field_t = (tb) this;
                break L15;
              }
            }
            L16: {
              if (null == ((vg) this).field_Q) {
                break L16;
              } else {
                ((vg) this).field_Q.field_t = (tb) this;
                break L16;
              }
            }
            L17: {
              L18: {
                if (((vg) this).field_N == null) {
                  break L18;
                } else {
                  ((vg) this).field_F.a(85, (byte) 122, ((vg) this).field_o, 30, ((vg) this).field_x + -95);
                  ((vg) this).field_o = ((vg) this).field_o + 60;
                  if (var11 == 0) {
                    break L17;
                  } else {
                    break L18;
                  }
                }
              }
              ((vg) this).field_F.a(8, (byte) 122, ((vg) this).field_o, 30, ((vg) this).field_x + -6 + -10);
              ((vg) this).field_o = ((vg) this).field_o + 35;
              break L17;
            }
            L19: {
              if (((vg) this).field_N == null) {
                break L19;
              } else {
                ((vg) this).field_N.a(8, (byte) 122, ((vg) this).field_o, 30, -6 + ((vg) this).field_x - 10);
                ((vg) this).field_o = ((vg) this).field_o + 35;
                break L19;
              }
            }
            L20: {
              if (((vg) this).field_Q == null) {
                break L20;
              } else {
                L21: {
                  L22: {
                    if (((vg) this).field_I) {
                      break L22;
                    } else {
                      if (!((vg) this).field_S) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  ((vg) this).field_Q.a(8, (byte) 122, ((vg) this).field_o, 30, ((vg) this).field_x - 16);
                  ((vg) this).field_o = ((vg) this).field_o + 35;
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
                ((vg) this).field_Q.a(8, (byte) 122, ((vg) this).field_o, 20, 40);
                ((vg) this).field_o = ((vg) this).field_o + 25;
                break L20;
              }
            }
            L23: {
              ((vg) this).a(0, (byte) 122, 0, ((vg) this).field_o - -3, ((vg) this).field_x);
              ((vg) this).a(true, (n) (Object) ((vg) this).field_F);
              if (((vg) this).field_N == null) {
                break L23;
              } else {
                ((vg) this).a(true, (n) (Object) ((vg) this).field_N);
                break L23;
              }
            }
            L24: {
              if (((vg) this).field_Q == null) {
                break L24;
              } else {
                ((vg) this).a(true, (n) (Object) ((vg) this).field_Q);
                break L24;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var6 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) var6;
            stackOut_86_1 = new StringBuilder().append("vg.<init>(");
            stackIn_89_0 = stackOut_86_0;
            stackIn_89_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param0 == null) {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L25;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_90_0 = stackOut_87_0;
              stackIn_90_1 = stackOut_87_1;
              stackIn_90_2 = stackOut_87_2;
              break L25;
            }
          }
          L26: {
            stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
            stackOut_90_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(',');
            stackIn_93_0 = stackOut_90_0;
            stackIn_93_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (param1 == null) {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L26;
            } else {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "{...}";
              stackIn_94_0 = stackOut_91_0;
              stackIn_94_1 = stackOut_91_1;
              stackIn_94_2 = stackOut_91_2;
              break L26;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_94_0, stackIn_94_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static hj a(int param0, int param1, vk param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        hj var6 = null;
        hj var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9_int = 0;
        wm var9 = null;
        int var10_int = 0;
        hj var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        hj stackIn_20_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        hj stackIn_43_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        hj stackOut_42_0 = null;
        hj stackOut_19_0 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var15 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = param0;
            var5 = param0 * 3 / 4;
            var6 = new hj(var4_int, var5);
            if (param2.field_l == -1) {
              L1: {
                var7 = new hj(640, 480);
                vb.a(param3 ^ 12341, var7);
                dj.a(param1, param2, false);
                l.a(param3 ^ -17640, param2);
                if (param3 == -12392) {
                  break L1;
                } else {
                  vg.h(0);
                  break L1;
                }
              }
              var8 = -1;
              L2: while (true) {
                stackOut_25_0 = var8;
                stackOut_25_1 = 3;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (stackIn_26_0 > stackIn_26_1) {
                        break L5;
                      } else {
                        if (var15 != 0) {
                          break L4;
                        } else {
                          var9 = (wm) (Object) param2.field_m.b((byte) 97);
                          L6: while (true) {
                            L7: {
                              if (var9 == null) {
                                break L7;
                              } else {
                                stackOut_30_0 = ~var8;
                                stackOut_30_1 = ~var9.field_q;
                                stackIn_26_0 = stackOut_30_0;
                                stackIn_26_1 = stackOut_30_1;
                                stackIn_31_0 = stackOut_30_0;
                                stackIn_31_1 = stackOut_30_1;
                                if (var15 != 0) {
                                  continue L3;
                                } else {
                                  L8: {
                                    if (stackIn_31_0 != stackIn_31_1) {
                                      break L8;
                                    } else {
                                      var10 = var9.a((byte) -124);
                                      var10.a(-(var10.field_s >> -464967903) + var9.field_A.field_h, var9.field_A.field_f + -(var10.field_y >> -916041663));
                                      break L8;
                                    }
                                  }
                                  var9 = (wm) (Object) param2.field_m.c((byte) -122);
                                  if (var15 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            var9 = (wm) (Object) param2.field_k.b((byte) 123);
                            L9: while (true) {
                              L10: {
                                if (null == var9) {
                                  break L10;
                                } else {
                                  stackOut_36_0 = var9.field_q;
                                  stackOut_36_1 = var8;
                                  stackIn_26_0 = stackOut_36_0;
                                  stackIn_26_1 = stackOut_36_1;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackIn_37_1 = stackOut_36_1;
                                  if (var15 != 0) {
                                    continue L3;
                                  } else {
                                    L11: {
                                      if (stackIn_37_0 != stackIn_37_1) {
                                        break L11;
                                      } else {
                                        var10 = var9.a((byte) -121);
                                        var10.a(var9.field_A.field_h + -(var10.field_s >> -1542826527), var9.field_A.field_f - (var10.field_y >> -2093008095));
                                        break L11;
                                      }
                                    }
                                    var9 = (wm) (Object) param2.field_k.c((byte) 96);
                                    if (var15 == 0) {
                                      continue L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              var8++;
                              if (var15 == 0) {
                                continue L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    var6.f();
                    var7.c(0, 0, var4_int, var5);
                    ug.b(-1);
                    break L4;
                  }
                  stackOut_42_0 = (hj) var6;
                  stackIn_43_0 = stackOut_42_0;
                  break L0;
                }
              }
            } else {
              L12: {
                L13: {
                  L14: {
                    var6 = new hj(var4_int, var5);
                    vb.a(-55, var6);
                    var7_int = var5 * 3 / 4;
                    var8 = var7_int * 3 / 4;
                    if (param2.field_r) {
                      break L14;
                    } else {
                      ra.field_hb.a((var4_int - var8) / 2, 3 * var5 / 16, var8, var7_int);
                      var9_int = var5 / 16;
                      var10_int = var4_int / 2;
                      var11 = -(var9_int / 4) + var4_int / 2 - var10_int / 2;
                      var12 = 3 * var5 / 16 + -(var9_int / 2);
                      var13 = 0;
                      L15: while (true) {
                        L16: {
                          if (~var13 <= ~var9_int) {
                            break L16;
                          } else {
                            var14 = var10_int * param2.field_l >> 2008908776;
                            tc.b(var13 / 2 + var11, -var13 + var12, var14, 12517567);
                            tc.b(var14 + var13 / 2 + var11, var12 + -var13, -var14 + var10_int, 7274607);
                            var13++;
                            if (var15 != 0) {
                              break L12;
                            } else {
                              if (var15 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        if (var15 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  L17: {
                    if (var5 <= 128) {
                      break L17;
                    } else {
                      kj.field_q.a(-128 + var4_int >> -2095396511, var5 + -128 >> -849248351);
                      if (var15 == 0) {
                        break L13;
                      } else {
                        break L17;
                      }
                    }
                  }
                  kj.field_q.d(-var5 + var4_int >> -9931359, 0, var5, var5);
                  break L13;
                }
                ug.b(-1);
                break L12;
              }
              stackOut_19_0 = (hj) var6;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var4;
            stackOut_44_1 = new StringBuilder().append("vg.S(").append(param0).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L18;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L18;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param3 + ')');
        }
        return stackIn_43_0;
    }

    final void j(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((vg) this).field_M.o(1);
              if (param0 == 10) {
                break L1;
              } else {
                ((vg) this).field_M = null;
                break L1;
              }
            }
            ((vg) this).field_H.o(1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "vg.O(" + param0 + ')');
        }
    }

    final static boolean b(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_L = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == hh.field_c) {
                  break L3;
                } else {
                  if (!hh.field_c.a(true)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "vg.N(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_13_0 = 0;
        boolean stackOut_11_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param1 == 98) {
                stackOut_8_0 = ((vg) this).c(param0, param2 + 77);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param1 != 99) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  stackOut_11_0 = ((vg) this).b(param0, 116);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("vg.T(");
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
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final String a(boolean param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (!param0) {
              if (null == ((vg) this).field_M.field_q) {
                stackOut_6_0 = "";
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = ((vg) this).field_M.field_q;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "vg.J(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param2 == -4) {
                break L1;
              } else {
                this.a((byte) -70);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 != ((vg) this).field_F) {
                  break L3;
                } else {
                  this.a((byte) -23);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1 != ((vg) this).field_N) {
                  break L4;
                } else {
                  qj.h((byte) 124);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              if (param1 != ((vg) this).field_Q) {
                break L2;
              } else {
                L5: {
                  if (((vg) this).field_I) {
                    break L5;
                  } else {
                    L6: {
                      if (((vg) this).field_S) {
                        break L6;
                      } else {
                        hk.a(-30500);
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    og.a((byte) 44);
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                cf.h(-110);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var6;
            stackOut_32_1 = new StringBuilder().append("vg.M(").append(param0).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(byte param0, nk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 19) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            L2: {
              if (((vg) this).field_M != param1) {
                break L2;
              } else {
                boolean discarded$2 = ((vg) this).field_H.a((n) this, -25823);
                break L2;
              }
            }
            L3: {
              if (((vg) this).field_H != param1) {
                break L3;
              } else {
                this.a((byte) -23);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("vg.F(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ((vg) this).field_R) {
                int discarded$1 = hl.field_g.a(((vg) this).field_R, 20 + param2 - -((vg) this).field_k, 15 + (param1 - -((vg) this).field_o), ((vg) this).field_x - 40, ((vg) this).field_u, 16777215, -1, 1, 0, hl.field_g.field_G);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != ((vg) this).field_N) {
                tc.b(10 + param2, 134 + param1, -20 + ((vg) this).field_x, 4210752);
                break L2;
              } else {
                break L2;
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var5, "vg.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Placing first in a race earns you <col=1>5</col> championship points; placing second, <col=1>3</col> points; third, <col=1>1</col> point.<br><br>You must finish in <col=1>first or second</col> place to qualify for the next race, otherwise you must retry the course. You can only retry <col=1>3</col> times during a championship. After completing all four races, you have finished the championship and can attempt the next one!<br><br>After playing all <col=1>four courses</col> in each championship, your total time will be added to the highscores table.";
        field_K = "Machine gun";
    }
}

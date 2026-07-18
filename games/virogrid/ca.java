/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ca extends fd implements bo, ta {
    private boolean field_T;
    private wa field_E;
    private wa field_K;
    private boolean field_I;
    private tg field_J;
    private tg field_P;
    static wf field_M;
    private String field_S;
    private boolean field_H;
    private tg field_F;
    static String field_O;
    static int field_D;
    static id field_Q;
    static int field_G;
    static String field_R;
    static String field_L;

    final void a(int param0, String param1) {
        wa var3 = null;
        String var4 = null;
        if (param0 > -101) {
            return;
        }
        try {
            var3 = ((ca) this).field_E;
            var4 = param1;
            var3.a(var4, 81, false);
            ((ca) this).field_K.g(0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ca.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 63 / ((param0 - -91) / 35);
            if (sd.a(-11532)) {
              break L1;
            } else {
              if (((ca) this).field_E.field_n.length() <= 0) {
                break L0;
              } else {
                if (0 >= ((ca) this).field_K.field_n.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ub.a((byte) 102, ((ca) this).field_E.field_n, ((ca) this).field_K.field_n);
          break L0;
        }
    }

    public final void a(wa param0, int param1) {
        try {
            if (param1 != 13) {
                field_R = null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ca.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(byte param0) {
        field_L = null;
        field_Q = null;
        field_R = null;
        field_M = null;
        field_O = null;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = 0;
              var2 = 0;
              if (param0 == 2) {
                break L1;
              } else {
                field_M = null;
                break L1;
              }
            }
            L2: while (true) {
              if (!nd.b((byte) -103)) {
                L3: {
                  co.field_k.a(pn.a(hk.field_Jb, nl.field_u, (byte) 97), false, pn.a(a.field_y, ii.field_b, (byte) 10));
                  if (co.field_k.b(false)) {
                    var1_int = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L5;
                    } else {
                      if (co.field_k.field_d < 0) {
                        break L5;
                      } else {
                        L6: {
                          var3 = rb.field_a[co.field_k.field_d];
                          if (2 == var3) {
                            break L6;
                          } else {
                            if (5 != var3) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        nm.b(param0 ^ 3);
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L4;
                  } else {
                    if (p.field_d == 2) {
                      break L4;
                    } else {
                      nm.b(1);
                      break L4;
                    }
                  }
                }
                L7: {
                  if (0 != var3) {
                    break L7;
                  } else {
                    if (2 != p.field_d) {
                      break L7;
                    } else {
                      var4 = hc.a(-9986) - af.field_e;
                      var6 = (int)((10999L - var4) / 1000L);
                      if (var6 > 0) {
                        break L7;
                      } else {
                        nm.a(true, 5, (byte) 71);
                        var3 = 2;
                        break L7;
                      }
                    }
                  }
                }
                stackOut_24_0 = var3;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                L8: {
                  co.field_k.e(-126);
                  if (!co.field_k.b(false)) {
                    break L8;
                  } else {
                    var1_int = 1;
                    break L8;
                  }
                }
                if (um.field_Gb != 13) {
                  continue L2;
                } else {
                  var2 = 1;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "ca.P(" + param0 + ')');
        }
        return stackIn_25_0;
    }

    final void e(byte param0) {
        ((ca) this).field_E.g(0);
        ((ca) this).field_K.g(0);
        if (param0 > -77) {
            ((ca) this).field_P = null;
        }
    }

    ca(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ol) null);
        RuntimeException var6 = null;
        hf var6_ref = null;
        e var7 = null;
        String var8 = null;
        co var9 = null;
        ej var12 = null;
        ej var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        tg stackIn_17_1 = null;
        tg stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        tg stackIn_18_1 = null;
        tg stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        tg stackIn_19_1 = null;
        tg stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
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
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_16_0 = null;
        tg stackOut_16_1 = null;
        tg stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        tg stackOut_18_1 = null;
        tg stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        tg stackOut_17_1 = null;
        tg stackOut_17_2 = null;
        String stackOut_17_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
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
              ((ca) this).field_T = stackIn_4_1 != 0;
              ((ca) this).field_S = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
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
              ((ca) this).field_I = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((ca) this).field_H = stackIn_10_1 != 0;
              if (!((ca) this).field_H) {
                break L4;
              } else {
                L5: {
                  if (((ca) this).field_I) {
                    break L5;
                  } else {
                    if (!((ca) this).field_T) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              ((ca) this).field_E = (wa) (Object) new vd(param0, (cd) this, 100);
              ((ca) this).field_K = (wa) (Object) new vd("", (cd) this, 20);
              if (!((ca) this).field_H) {
                L7: {
                  ((ca) this).field_F = new tg(aj.field_q, (cd) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (((ca) this).field_T) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = dd.field_e;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = jl.field_D;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((ca) this).field_P = new tg(stackIn_19_3, (cd) null);
                if (!((ca) this).field_I) {
                  break L6;
                } else {
                  ((ca) this).field_J = new tg(bj.field_g, (cd) this);
                  break L6;
                }
              } else {
                ((ca) this).field_F = new tg(tn.field_e, (cd) null);
                ((ca) this).field_P = new tg(og.field_k, (cd) null);
                ((ca) this).field_E.field_C = false;
                break L6;
              }
            }
            L8: {
              ((ca) this).field_E.field_w = (ol) (Object) new cc(10000536);
              ((ca) this).field_K.field_w = (ol) (Object) new a(10000536);
              var6_ref = new hf();
              ((ca) this).field_F.field_w = (ol) (Object) var6_ref;
              if (((ca) this).field_P == null) {
                break L8;
              } else {
                ((ca) this).field_P.field_w = (ol) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((ca) this).field_E.field_h = sn.field_n;
              if (((ca) this).field_J == null) {
                break L9;
              } else {
                ((ca) this).field_J.field_w = (ol) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (null == ((ca) this).field_J) {
                break L10;
              } else {
                ((ca) this).field_J.field_h = mh.field_j;
                break L10;
              }
            }
            L11: {
              if (!((ca) this).field_H) {
                if (!((ca) this).field_T) {
                  ((ca) this).field_P.field_w = (ol) (Object) new ti();
                  break L11;
                } else {
                  ((ca) this).field_P.field_h = fn.field_f;
                  ((ca) this).field_P.field_w = (ol) (Object) new ti();
                  break L11;
                }
              } else {
                ((ca) this).field_P.field_h = pj.field_b;
                break L11;
              }
            }
            L12: {
              ((ca) this).field_u = 15;
              var7 = dj.field_h;
              if (((ca) this).field_S == null) {
                break L12;
              } else {
                ((ca) this).field_u = ((ca) this).field_u + (var7.a(((ca) this).field_S, -40 + ((ca) this).field_g, var7.field_H) - -5);
                break L12;
              }
            }
            L13: {
              var8 = uh.field_g;
              var9 = bd.a(-78, mb.g((byte) 39));
              if (aa.field_b != var9) {
                if (var9 != Virogrid.field_O) {
                  break L13;
                } else {
                  var8 = ll.field_c;
                  break L13;
                }
              } else {
                var8 = gf.field_y;
                break L13;
              }
            }
            L14: {
              ej dupTemp$2 = new ej(10, ((ca) this).field_u, ((ca) this).field_g + -20, 25, (fi) (Object) ((ca) this).field_E, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((ca) this).a((fi) (Object) dupTemp$2, (byte) -78);
              ((ca) this).field_u = ((ca) this).field_u + (5 + ((fi) (Object) var12).field_m);
              ej dupTemp$3 = new ej(10, ((ca) this).field_u, ((ca) this).field_g + -20, 25, (fi) (Object) ((ca) this).field_K, false, 80, 3, var7, 16777215, hm.field_b);
              var13 = dupTemp$3;
              ((ca) this).a((fi) (Object) dupTemp$3, (byte) -78);
              ((ca) this).field_u = ((ca) this).field_u + (5 + ((fi) (Object) var13).field_m);
              ((ca) this).field_F.field_o = (cd) this;
              if (((ca) this).field_J == null) {
                break L14;
              } else {
                ((ca) this).field_J.field_o = (cd) this;
                break L14;
              }
            }
            L15: {
              if (((ca) this).field_P == null) {
                break L15;
              } else {
                ((ca) this).field_P.field_o = (cd) this;
                break L15;
              }
            }
            L16: {
              if (((ca) this).field_J != null) {
                ((ca) this).field_F.a(30, true, ((ca) this).field_u, 85, ((ca) this).field_g - 95);
                ((ca) this).field_u = ((ca) this).field_u + 60;
                break L16;
              } else {
                ((ca) this).field_F.a(30, true, ((ca) this).field_u, 8, ((ca) this).field_g + -16);
                ((ca) this).field_u = ((ca) this).field_u + 35;
                break L16;
              }
            }
            L17: {
              if (((ca) this).field_J == null) {
                break L17;
              } else {
                ((ca) this).field_J.a(30, true, ((ca) this).field_u, 8, ((ca) this).field_g - 16);
                ((ca) this).field_u = ((ca) this).field_u + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((ca) this).field_P) {
                break L18;
              } else {
                L19: {
                  if (((ca) this).field_H) {
                    break L19;
                  } else {
                    if (((ca) this).field_T) {
                      break L19;
                    } else {
                      ((ca) this).field_P.a(20, true, ((ca) this).field_u, 8, 40);
                      ((ca) this).field_u = ((ca) this).field_u + 25;
                      break L18;
                    }
                  }
                }
                ((ca) this).field_P.a(30, true, ((ca) this).field_u, 8, -10 + (-6 + ((ca) this).field_g));
                ((ca) this).field_u = ((ca) this).field_u + 35;
                break L18;
              }
            }
            L20: {
              ((ca) this).a(((ca) this).field_u - -3, true, 0, 0, ((ca) this).field_g);
              ((ca) this).a((fi) (Object) ((ca) this).field_F, (byte) -78);
              if (null == ((ca) this).field_J) {
                break L20;
              } else {
                ((ca) this).a((fi) (Object) ((ca) this).field_J, (byte) -78);
                break L20;
              }
            }
            L21: {
              if (null == ((ca) this).field_P) {
                break L21;
              } else {
                ((ca) this).a((fi) (Object) ((ca) this).field_P, (byte) -78);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("ca.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(String param0, byte param1) {
        try {
            pi.a(param0, 0);
            gk.a(false, bn.field_a, false);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ca.S(" + (param0 != null ? "{...}" : "null") + ',' + -124 + ')');
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, param1, param2, 60)) {
              if (98 == param2) {
                stackOut_5_0 = ((ca) this).b(2, param0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var5_int = -8 % ((-75 - param3) / 36);
                if (param2 == 99) {
                  stackOut_9_0 = ((ca) this).a(-16234, param0);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ca.AA(");
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
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    public final void a(boolean param0, wa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (((ca) this).field_E != param1) {
                break L1;
              } else {
                boolean discarded$2 = ((ca) this).field_K.a((fi) this, -8515);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                field_G = 96;
                break L2;
              }
            }
            L3: {
              if (((ca) this).field_K != param1) {
                break L3;
              } else {
                this.a((byte) -46);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ca.T(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final static void b(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = Virogrid.field_F ? 1 : 0;
            if (param0) {
              break L1;
            } else {
              if (wl.field_d == null) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ad.field_h = false;
          break L0;
        }
        L2: {
          L3: {
            if (param0) {
              if (kh.field_d > 0) {
                kh.field_d = kh.field_d - 1;
                break L2;
              } else {
                if (hn.field_h <= 0) {
                  if (th.field_z <= 0) {
                    break L3;
                  } else {
                    th.field_z = th.field_z - 1;
                    break L2;
                  }
                } else {
                  hn.field_h = hn.field_h - 1;
                  break L2;
                }
              }
            } else {
              if (wl.field_d == null) {
                if (la.field_h != null) {
                  if (kh.field_d > 0) {
                    kh.field_d = kh.field_d - 1;
                    break L2;
                  } else {
                    if (0 < th.field_z) {
                      th.field_z = th.field_z - 1;
                      break L2;
                    } else {
                      if (~hn.field_h <= ~ve.field_t) {
                        break L3;
                      } else {
                        L4: {
                          if (hn.field_h == 0) {
                            qh.a((byte) -68, true);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        hn.field_h = hn.field_h + 1;
                        break L2;
                      }
                    }
                  }
                } else {
                  ad.field_h = false;
                  if (hn.field_h > 0) {
                    hn.field_h = hn.field_h - 1;
                    break L2;
                  } else {
                    if (th.field_z <= 0) {
                      if (kh.field_d < ve.field_t) {
                        L5: {
                          if (kh.field_d == 0) {
                            ld.a(0);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        kh.field_d = kh.field_d + 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      th.field_z = th.field_z - 1;
                      break L2;
                    }
                  }
                }
              } else {
                if (kh.field_d <= 0) {
                  if (hn.field_h <= 0) {
                    if (th.field_z < ve.field_t) {
                      L6: {
                        if (th.field_z != 0) {
                          break L6;
                        } else {
                          qh.a((byte) -68, false);
                          break L6;
                        }
                      }
                      th.field_z = th.field_z + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    hn.field_h = hn.field_h - 1;
                    break L2;
                  }
                } else {
                  kh.field_d = kh.field_d - 1;
                  break L2;
                }
              }
            }
          }
          break L2;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (((ca) this).field_S != null) {
            int discarded$0 = dj.field_h.a(((ca) this).field_S, ((ca) this).field_l + param1 + 20, param2 - (-((ca) this).field_u + -15), -40 + ((ca) this).field_g, ((ca) this).field_m, 16777215, -1, 1, 0, dj.field_h.field_H);
        }
        if (((ca) this).field_J != null) {
            df.b(param1 + 10, param2 + 134, -20 + ((ca) this).field_g, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final String f(int param0) {
        if (!(null != ((ca) this).field_E.field_n)) {
            return "";
        }
        if (param0 != -3) {
            return null;
        }
        return ((ca) this).field_E.field_n;
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0 <= 0) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = 1 & param1 | var3_int << 1;
                param0--;
                param1 = param1 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "ca.M(" + param0 + ',' + param1 + ',' + 13760 + ')');
        }
        return stackIn_5_0;
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 12085) {
                break L1;
              } else {
                var8 = null;
                boolean discarded$2 = ((ca) this).a((fi) null, '', 57, -15);
                break L1;
              }
            }
            L2: {
              if (((ca) this).field_F == param1) {
                this.a((byte) -127);
                break L2;
              } else {
                if (((ca) this).field_J != param1) {
                  if (param1 == ((ca) this).field_P) {
                    if (!((ca) this).field_H) {
                      if (((ca) this).field_T) {
                        ee.a((byte) 49);
                        break L2;
                      } else {
                        g.a((byte) -33);
                        break L2;
                      }
                    } else {
                      ne.a(17);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  va.a(false);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("ca.L(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Similar rating";
        field_L = "This game option is only available to members.";
    }
}

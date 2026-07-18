/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w extends f {
    static long field_I;
    boolean field_E;
    static String[][] field_J;
    private tc field_F;
    static bi field_D;
    private int field_G;
    static String field_H;

    final static void a(String[] args, int param1, sq param2, int param3) {
        RuntimeException runtimeException = null;
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
        try {
          L0: {
            L1: {
              param2.field_t = bg.a(args[0], 107);
              param2.field_b = bg.a(args[1], 108);
              param2.field_j = bg.a(args[2], 120);
              param2.field_q = bg.a(args[3], 100);
              param2.field_n = param1;
              if (param3 <= -11) {
                break L1;
              } else {
                String discarded$3 = w.a(-61);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("w.BA(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (args == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_23_0 = null;
        Object stackOut_2_0 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = "(" + rm.field_e + " " + tp.field_g + " " + kp.field_n + ") " + ej.field_e;
            if (param0 == 16738) {
              L1: {
                L2: {
                  if (0 < rr.field_t) {
                    var1_ref = var1_ref + ":";
                    var2 = 0;
                    L3: while (true) {
                      if (rr.field_t <= var2) {
                        break L2;
                      } else {
                        stackOut_9_0 = var1_ref + ' ';
                        stackIn_24_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          L4: {
                            L5: {
                              var1_ref = stackIn_10_0;
                              var3 = 255 & sa.field_a.field_h[var2];
                              var4 = var3 >> -1915117916;
                              var3 = var3 & 15;
                              if (10 > var4) {
                                break L5;
                              } else {
                                var4 += 55;
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4 += 48;
                            break L4;
                          }
                          L6: {
                            L7: {
                              if (10 <= var3) {
                                break L7;
                              } else {
                                var3 += 48;
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 += 55;
                            break L6;
                          }
                          var1_ref = var1_ref + (char)var4;
                          var1_ref = var1_ref + (char)var3;
                          var2++;
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                stackOut_23_0 = (String) var1_ref;
                stackIn_24_0 = stackOut_23_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "w.P(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((w) this).field_G == 0) {
              return;
            } else {
              if (((w) this).field_G >= 256) {
                if (param0 != 0) {
                  return;
                } else {
                  ((w) this).a(param3 - -((w) this).field_m, 103, ((w) this).field_q + param2);
                  super.a(param0, -11857, param2, param3);
                  return;
                }
              } else {
                L1: {
                  L2: {
                    if (ci.field_r == null) {
                      break L2;
                    } else {
                      if (ci.field_r.field_z < ((w) this).field_x) {
                        break L2;
                      } else {
                        if (ci.field_r.field_w >= ((w) this).field_n) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ci.field_r = new bi(((w) this).field_x, ((w) this).field_n);
                  break L1;
                }
                aq.a((byte) 110, ci.field_r);
                gf.b();
                ((w) this).a(0, 103, 0);
                super.a(param0, param1, -param2 - ((w) this).field_q, -param3 - ((w) this).field_m);
                ln.f((byte) -50);
                ci.field_r.a(((w) this).field_m + param3, ((w) this).field_q + param2, ((w) this).field_G);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5, "w.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean k(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            L2: {
              L3: {
                ((w) this).field_G = this.e(false);
                if (((w) this).field_G != 0) {
                  break L3;
                } else {
                  if (((w) this).field_E) {
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
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "w.O(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final vg i(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        vg stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        vg stackOut_1_0 = null;
        try {
          L0: {
            var2 = super.i(param0);
            if (null == var2) {
              stackOut_3_0 = this;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = (vg) var2;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "w.R(" + param0 + ')');
        }
        return (vg) this;
    }

    boolean a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        try {
          L0: {
            L1: {
              var3 = -91 % ((param0 - -23) / 52);
              var2_int = this.e(false);
              var3 = var2_int - ((w) this).field_G;
              if (0 < var3) {
                ((w) this).field_G = ((w) this).field_G + (8 + (var3 - 1)) / 8;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var3 >= 0) {
                break L2;
              } else {
                ((w) this).field_G = ((w) this).field_G + (-16 + var3 - -1) / 16;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((w) this).field_G != 0) {
                  break L4;
                } else {
                  if (0 != var2_int) {
                    break L4;
                  } else {
                    if (((w) this).field_E) {
                      break L4;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_17_0 = stackOut_14_0;
                      break L3;
                    }
                  }
                }
              }
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "w.Q(" + param0 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final void b(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -103) {
                break L1;
              } else {
                w.m(11);
                break L1;
              }
            }
            ((w) this).a(ec.field_q - param0 >> -923776095, param0, (byte) 122, ep.field_a - param1 >> -1276650719, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var4, "w.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ro a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ro stackIn_5_0 = null;
        ro stackIn_8_0 = null;
        ro stackIn_21_0 = null;
        ro stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        ro stackOut_4_0 = null;
        ro stackOut_20_0 = null;
        ro stackOut_25_0 = null;
        Object stackOut_28_0 = null;
        ro stackOut_7_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_4_0 = fg.field_a;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (var2_int <= 63) {
                var3 = 121 % ((param0 - -23) / 41);
                var4 = 0;
                L1: while (true) {
                  L2: {
                    if (var4 >= var2_int) {
                      break L2;
                    } else {
                      L3: {
                        var5 = param1.charAt(var4);
                        if (var5 == 45) {
                          L4: {
                            if (var4 == 0) {
                              break L4;
                            } else {
                              if (var2_int - 1 == var4) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_20_0 = as.field_t;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          if (ma.field_q.indexOf(var5) == -1) {
                            stackOut_25_0 = as.field_t;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_28_0 = null;
                  stackIn_29_0 = stackOut_28_0;
                  break L0;
                }
              } else {
                stackOut_7_0 = cm.field_e;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("w.W(").append(param0).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
        return (ro) (Object) stackIn_29_0;
    }

    w(tc param0, int param1, int param2) {
        super(ep.field_a - param1 >> 193364289, -param2 + ec.field_q >> 764213633, param1, param2, (iq) null);
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
        try {
          L0: {
            ((w) this).field_E = false;
            ((w) this).field_F = param0;
            ((w) this).field_G = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("w.<init>(");
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
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void f(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ej.c(0);
              if (tm.field_i != null) {
                hs.a(tm.field_i, (byte) -101);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              rs.g(-96);
              og.a(false);
              oa.a(0);
              if (oh.b(true)) {
                js.field_f.h(1, 255);
                d.a(0, (byte) 82);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              q.g(-107);
              if (param0 >= 56) {
                break L3;
              } else {
                field_J = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "w.V(" + param0 + ')');
        }
    }

    public static void m(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                String discarded$2 = w.a(56);
                break L1;
              }
            }
            field_D = null;
            field_H = null;
            field_J = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "w.N(" + param0 + ')');
        }
    }

    private final int e(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((w) this).a(-109, -11, -57, 34);
                break L1;
              }
            }
            L2: {
              if (!((w) this).field_E) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                if (this == (Object) (Object) ((w) this).field_F.g((byte) 119)) {
                  stackOut_9_0 = 256;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_11_0 = stackOut_7_0;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "w.U(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    abstract void a(int param0, int param1, int param2);

    final static String l(int param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              var1 = "";
              if (null == no.field_e) {
                break L1;
              } else {
                var1 = no.field_e.d(false);
                break L1;
              }
            }
            L2: {
              if (param0 != var1.length()) {
                break L2;
              } else {
                var1 = id.a(-106);
                break L2;
              }
            }
            L3: {
              if (var1.length() != 0) {
                break L3;
              } else {
                var1 = hb.field_c;
                break L3;
              }
            }
            stackOut_6_0 = (String) var1;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1_ref, "w.L(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static boolean d(boolean param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                w.m(-66);
                break L1;
              }
            }
            stackOut_3_0 = eh.field_P;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "w.M(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Successful defences";
        field_J = new String[][]{new String[0], new String[7], new String[4], new String[5], new String[2]};
    }
}

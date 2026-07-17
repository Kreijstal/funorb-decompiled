/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends am implements lja {
    private hf field_U;
    static kv field_S;
    static String field_V;
    static vr field_T;

    final static int a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_60_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_79_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            pn.field_f = pn.field_f + 65536;
            L1: while (true) {
              if (c.a(ph.field_D, pn.field_f, false) < 65536) {
                L2: {
                  var2_int = -1;
                  if (null == oja.field_f) {
                    if (null == taa.field_m) {
                      break L2;
                    } else {
                      var2_int = taa.field_m.length;
                      break L2;
                    }
                  } else {
                    var2_int = oja.field_f.length;
                    break L2;
                  }
                }
                L3: {
                  if (-1 == var2_int) {
                    break L3;
                  } else {
                    L4: {
                      if (ph.field_G <= gp.field_A) {
                        break L4;
                      } else {
                        L5: {
                          gp.field_A = gp.field_A + 1;
                          if (ph.field_E >= gp.field_A) {
                            break L5;
                          } else {
                            L6: {
                              if (oja.field_f == null) {
                                break L6;
                              } else {
                                if (null == oja.field_f[ih.field_l]) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            gp.field_A = gp.field_A - 1;
                            break L4;
                          }
                        }
                        if (gp.field_A < ph.field_G) {
                          break L4;
                        } else {
                          if (oja.field_f[(ih.field_l + 1) % var2_int] == null) {
                            gp.field_A = gp.field_A - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (gp.field_A >= ph.field_G) {
                        L8: {
                          vj.field_n = ih.field_l;
                          if (!ja.field_p) {
                            ih.field_l = ih.field_l - 1;
                            if (ih.field_l < 0) {
                              ih.field_l = ih.field_l + var2_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            ih.field_l = ih.field_l + 1;
                            if (ih.field_l < var2_int) {
                              break L8;
                            } else {
                              ih.field_l = ih.field_l - var2_int;
                              break L8;
                            }
                          }
                        }
                        gp.field_A = gp.field_A - ph.field_G;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (ph.field_E >= gp.field_A) {
                      break L3;
                    } else {
                      ja.field_p = true;
                      break L3;
                    }
                  }
                }
                L9: {
                  if (param1 == 0) {
                    break L9;
                  } else {
                    field_V = null;
                    break L9;
                  }
                }
                L10: {
                  if (id.field_h != null) {
                    L11: {
                      var3 = 357 + -(id.field_h.field_o / 2);
                      var4 = 0;
                      if (0 == lf.field_c) {
                        break L11;
                      } else {
                        if (var3 >= jc.field_r) {
                          break L11;
                        } else {
                          if (jc.field_r < id.field_h.field_p + var3) {
                            L12: {
                              if (269 + -id.field_h.field_q >= nfa.field_a) {
                                break L12;
                              } else {
                                if (nfa.field_a >= 269) {
                                  break L12;
                                } else {
                                  var4 = 1;
                                  ja.field_p = false;
                                  gp.field_A = ph.field_G;
                                  break L12;
                                }
                              }
                            }
                            if (586 >= nfa.field_a) {
                              break L11;
                            } else {
                              if (nfa.field_a >= 586 + id.field_h.field_q) {
                                break L11;
                              } else {
                                var4 = 1;
                                ja.field_p = true;
                                gp.field_A = ph.field_G;
                                break L11;
                              }
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L10;
                    } else {
                      if (ph.field_E >= gp.field_A) {
                        break L10;
                      } else {
                        if (gd.field_m <= var3) {
                          break L10;
                        } else {
                          if (id.field_h.field_p + var3 > gd.field_m) {
                            L13: {
                              if (-id.field_h.field_q + 269 >= mk.field_p) {
                                break L13;
                              } else {
                                if (mk.field_p < 269) {
                                  gp.field_A = ph.field_E;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            if (586 >= mk.field_p) {
                              break L10;
                            } else {
                              if (mk.field_p >= 586 - -id.field_h.field_q) {
                                break L10;
                              } else {
                                gp.field_A = ph.field_E;
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
                L14: {
                  if (!param0) {
                    break L14;
                  } else {
                    L15: {
                      ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
                      if (!ic.field_i.e(0)) {
                        break L15;
                      } else {
                        if (ic.field_i.field_g == 0) {
                          stackOut_60_0 = 3;
                          stackIn_61_0 = stackOut_60_0;
                          return stackIn_61_0;
                        } else {
                          if (ic.field_i.field_g != 1) {
                            break L15;
                          } else {
                            stackOut_63_0 = 2;
                            stackIn_64_0 = stackOut_63_0;
                            return stackIn_64_0;
                          }
                        }
                      }
                    }
                    L16: while (true) {
                      if (!kaa.b(param1 + 127)) {
                        break L14;
                      } else {
                        L17: {
                          ic.field_i.a(0, -128);
                          if (ic.field_i.e(0)) {
                            if (ic.field_i.field_g != 0) {
                              if (1 != ic.field_i.field_g) {
                                break L17;
                              } else {
                                stackOut_73_0 = 1;
                                stackIn_74_0 = stackOut_73_0;
                                return stackIn_74_0;
                              }
                            } else {
                              stackOut_70_0 = 3;
                              stackIn_71_0 = stackOut_70_0;
                              return stackIn_71_0;
                            }
                          } else {
                            break L17;
                          }
                        }
                        if (gf.field_k == 13) {
                          stackOut_77_0 = 1;
                          stackIn_78_0 = stackOut_77_0;
                          return stackIn_78_0;
                        } else {
                          continue L16;
                        }
                      }
                    }
                  }
                }
                stackOut_79_0 = 0;
                stackIn_80_0 = stackOut_79_0;
                break L0;
              } else {
                wga.field_s = wga.field_s + 1;
                pn.field_f = pn.field_f - ph.field_D;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "em.T(" + param0 + 44 + param1 + 41);
        }
        return stackIn_80_0;
    }

    final static void a(int param0, int param1) {
        L0: {
          fb.field_p = param1 >> 4 & 3;
          if (fb.field_p > 2) {
            fb.field_p = 2;
            break L0;
          } else {
            break L0;
          }
        }
        ri.field_c = param1 >> 2 & 3;
        if (2 >= ri.field_c) {
          fj.field_g = 3 & param1;
          if (param0 >= fj.field_g) {
            return;
          } else {
            fj.field_g = 2;
            return;
          }
        } else {
          ri.field_c = 2;
          fj.field_g = 3 & param1;
          if (param0 >= fj.field_g) {
            return;
          } else {
            fj.field_g = 2;
            return;
          }
        }
    }

    private final hf a(int param0, String param1, pl param2) {
        hf var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        hf stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hf stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new hf(param1, param2);
            var4.field_f = (qda) (Object) new ff();
            var6 = -85 % ((param0 - -69) / 54);
            var5 = ((em) this).field_q + -6;
            ((em) this).field_q = ((em) this).field_q + 38;
            var4.a(15, 30, (byte) 59, ((em) this).field_p - 30, var5);
            ((em) this).c((wj) (Object) var4, 61);
            ((em) this).d(6);
            stackOut_0_0 = (hf) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("em.B(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    em(rp param0, lo param1) {
        super(param0, 200, 150);
        Object var3 = null;
        wj var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (dn.field_b != param1) {
                if (r.field_m == param1) {
                  var3 = (Object) (Object) cn.field_k;
                  ((em) this).field_q = ((em) this).field_q + 10;
                  if (!od.e((byte) -127)) {
                    break L1;
                  } else {
                    ((em) this).field_q = ((em) this).field_q + 20;
                    var3 = (Object) (Object) dm.field_e;
                    break L1;
                  }
                } else {
                  if (param1 != tma.field_x) {
                    break L1;
                  } else {
                    ((em) this).field_q = ((em) this).field_q + 30;
                    var3 = (Object) (Object) jia.field_l;
                    break L1;
                  }
                }
              } else {
                var3 = (Object) (Object) qca.field_l;
                break L1;
              }
            }
            var4 = new wj((String) var3, (pl) null);
            var4.field_v = 50;
            var4.field_q = 80;
            var4.field_s = 0;
            var4.field_p = ((em) this).field_p;
            var4.field_f = (qda) (Object) new gha(oc.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((em) this).c(var4, 70);
            ((em) this).field_U = this.a(-2, ala.field_d, (pl) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("em.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    private final void n(int param0) {
        if (!((em) this).field_C) {
            return;
        }
        field_T = null;
        ((em) this).field_C = false;
    }

    final static boolean d(byte param0) {
        return null != wh.field_p;
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (((em) this).field_U != param1) {
                break L1;
              } else {
                this.n(0);
                break L1;
              }
            }
            if (param3 >= 50) {
              break L0;
            } else {
              field_T = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("em.AA(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void o(int param0) {
        field_T = null;
        field_S = null;
        field_V = null;
        if (param0 == -22799) {
            return;
        }
        em.o(95);
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pf {
    int field_c;
    aa field_j;
    static String field_k;
    private int[] field_g;
    private String field_i;
    static jk field_a;
    hl field_h;
    private int field_f;
    private long field_e;
    String field_b;
    static int field_d;

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                L2: {
                  if (((pf) this).field_j == null) {
                    break L2;
                  } else {
                    if (!((pf) this).field_j.e((byte) -87)) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
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
          throw oi.a((Throwable) (Object) var2, "pf.F(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final boolean b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param2 != 17) {
              if (param1 == -20991) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              mm.field_y = new om(((pf) this).field_h.field_eb, ((pf) this).field_h.field_z, ((pf) this).field_h.field_Hb, ((pf) this).field_h.field_R, param0, sa.field_h, hl.field_gb, sn.field_c, bk.field_i, vd.field_c, ek.field_n, ((pf) this).field_b, ((pf) this).field_e);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "pf.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final String b(int param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != ((pf) this).field_i) {
                  break L3;
                } else {
                  var2 = ((pf) this).field_b;
                  if (TetraLink.field_J == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = ((pf) this).field_i;
              break L2;
            }
            stackOut_6_0 = (String) var2;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2_ref, "pf.G(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    private final boolean d(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_36_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (param2 != 8) {
                  break L2;
                } else {
                  tb.a(false, ((pf) this).field_b, ((pf) this).field_e);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param2 == 18) {
                  break L3;
                } else {
                  L4: {
                    if (param2 != 11) {
                      break L4;
                    } else {
                      vj.a(((pf) this).field_f, param1, 0, 99);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param2 == 12) {
                      break L5;
                    } else {
                      L6: {
                        if (param2 != 13) {
                          break L6;
                        } else {
                          vj.a(((pf) this).field_f, param1, 2, 99);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (param2 == 14) {
                          break L7;
                        } else {
                          L8: {
                            if (20 != param2) {
                              break L8;
                            } else {
                              em.d(-20715);
                              if (var5 == 0) {
                                break L1;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (19 == param2) {
                            boolean discarded$1 = sj.a(((pf) this).field_e, ((pf) this).field_b, ((pf) this).field_g, 60, ((pf) this).field_f);
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L7;
                            }
                          } else {
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            return stackIn_36_0 != 0;
                          }
                        }
                      }
                      ei.d(-4210768);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  vj.a(((pf) this).field_f, param1, 1, 113);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              uf.a(-127, ((pf) this).field_b, ((pf) this).field_e);
              break L1;
            }
            if (param0 == -15) {
              stackOut_49_0 = 1;
              stackIn_50_0 = stackOut_49_0;
              break L0;
            } else {
              stackOut_47_0 = 0;
              stackIn_48_0 = stackOut_47_0;
              return stackIn_48_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "pf.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_50_0 != 0;
    }

    final void a(boolean param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((pf) this).field_b) {
                break L1;
              } else {
                if (~((pf) this).field_e == ~oj.field_c) {
                  break L1;
                } else {
                  var2 = this.b(2);
                  ((pf) this).field_j.a(sk.a(new String[1], qm.field_a, 125), 1, 17);
                  break L1;
                }
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                ((pf) this).field_j = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2_ref, "pf.O(" + param0 + ')');
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        RuntimeException var4_ref2 = null;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              var4 = null;
              if (4 == param2) {
                var4_ref = qf.a((byte) 122, ((pf) this).field_b, param1);
                break L1;
              } else {
                if (5 != param2) {
                  if (param2 != 6) {
                    if (param2 == 7) {
                      var4_ref = aa.a(((pf) this).field_b, param1, 2, ((pf) this).field_i);
                      break L1;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    }
                  } else {
                    var4_ref = li.a(param1, ((pf) this).field_b, 2);
                    break L1;
                  }
                } else {
                  var4_ref = ma.a(false, ((pf) this).field_b, param1);
                  break L1;
                }
              }
            }
            L2: {
              if (null == var4_ref) {
                break L2;
              } else {
                fi.a(0, 0, ((pf) this).field_b, 2, var4_ref, (String) null);
                break L2;
              }
            }
            var5 = -112 % ((11 - param0) / 54);
            stackOut_15_0 = 1;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4_ref2, "pf.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static void a(String param0, int param1, int param2, long param3, byte param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
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
            me.field_g = param2;
            va.field_u = true;
            kd.field_h = param1;
            rc.field_N = param3;
            var6_int = -83 % ((param4 - -59) / 56);
            qf.field_j = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("pf.J(");
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
          throw oi.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(fj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (param0.field_l) {
              return;
            } else {
              L1: {
                ((pf) this).field_f = param0.field_i;
                if (param0.field_i != 0) {
                  break L1;
                } else {
                  L2: {
                    if (ik.field_e == 0) {
                      ((pf) this).field_j.a(qk.field_b, 1, 12);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((pf) this).field_j.a(df.field_b, 1, 13);
                  break L1;
                }
              }
              L3: {
                if (param1 == 12) {
                  break L3;
                } else {
                  ((pf) this).a(20, (int[]) null, true);
                  break L3;
                }
              }
              L4: {
                if (1 != param0.field_i) {
                  break L4;
                } else {
                  L5: {
                    if (me.field_b != 0) {
                      break L5;
                    } else {
                      ((pf) this).field_j.a(kf.field_a, param1 + -11, 12);
                      break L5;
                    }
                  }
                  ((pf) this).field_j.a(md.field_H, 1, 13);
                  break L4;
                }
              }
              L6: {
                if (param0.field_i != 2) {
                  break L6;
                } else {
                  L7: {
                    if (mc.field_f == 0) {
                      ((pf) this).field_j.a(jn.field_a, param1 + -11, 12);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((pf) this).field_j.a(mc.field_a, 1, 13);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("pf.N(");
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L8;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, byte param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              var6_int = ((pf) this).field_j.b(param2, -109);
              if (param3 == 53) {
                break L1;
              } else {
                ((pf) this).field_h = null;
                break L1;
              }
            }
            if (var6_int == -2) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              boolean discarded$8 = this.a(var6_int, 122, param1);
              boolean discarded$9 = this.c(85, param0, var6_int);
              boolean discarded$10 = this.d(-15, param0, var6_int);
              boolean discarded$11 = this.b(param4, -20991, var6_int);
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var6, "pf.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        el var2_ref = null;
        String var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (qb.field_N != null) {
                break L1;
              } else {
                var2_ref = qd.c(param0 ^ 35, ((pf) this).field_c);
                if (null != var2_ref) {
                  L2: {
                    var3 = var2_ref.field_ec;
                    if (!var2_ref.field_Vb) {
                      break L2;
                    } else {
                      ((pf) this).field_j.a(sk.a(new String[1], cm.field_b, 123), 1, 2);
                      ((pf) this).field_j.a(sk.a(new String[1], ca.field_b, 122), param0 + -78, 3);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (!var2_ref.field_xc) {
                        break L4;
                      } else {
                        ((pf) this).field_j.a(sk.a(new String[1], oa.field_o, 127), 1, 2);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var2_ref.field_Wb) {
                      break L3;
                    } else {
                      if (!var2_ref.field_kc) {
                        break L3;
                      } else {
                        L5: {
                          if (!var2_ref.field_Kb) {
                            break L5;
                          } else {
                            if (var2_ref.field_xc) {
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        ((pf) this).field_j.a(sk.a(new String[1], bb.field_g, 120), 1, 2);
                        break L3;
                      }
                    }
                  }
                  if (!var2_ref.field_Wb) {
                    break L1;
                  } else {
                    ((pf) this).field_j.a(sk.a(new String[1], tk.field_e, 121), 1, 3);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (param0 == 79) {
                break L6;
              } else {
                field_a = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "pf.B(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        gd var3_ref = null;
        gd var4 = null;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (((pf) this).field_b == null) {
                break L1;
              } else {
                if (oj.field_c == ((pf) this).field_e) {
                  break L1;
                } else {
                  if (qb.field_N == null) {
                    break L1;
                  } else {
                    if (!s.b(63)) {
                      break L1;
                    } else {
                      L2: {
                        var3_ref = tm.a(((pf) this).field_e, -26778);
                        var4 = sf.a(-18701, ((pf) this).field_e);
                        var5 = this.b(2);
                        if (var4 == null) {
                          break L2;
                        } else {
                          L3: {
                            if (!qb.field_N.field_Kb) {
                              break L3;
                            } else {
                              if (qb.field_N.field_bc >= 0) {
                                break L3;
                              } else {
                                break L1;
                              }
                            }
                          }
                          ((pf) this).field_j.a(sk.a(new String[1], il.field_P, 124), 1, 1);
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (var3_ref == null) {
                        break L1;
                      } else {
                        if (!qb.field_N.field_kc) {
                          break L1;
                        } else {
                          if (~qb.field_N.field_jc <= ~qb.field_N.field_rc) {
                            break L1;
                          } else {
                            L4: {
                              if (var3_ref.field_cc) {
                                break L4;
                              } else {
                                L5: {
                                  if (!param1) {
                                    break L5;
                                  } else {
                                    if (!var3_ref.field_Kb) {
                                      break L5;
                                    } else {
                                      ((pf) this).field_j.a(sk.a(new String[1], fe.field_a, 125), 1, 0);
                                      ((pf) this).field_j.a(sk.a(new String[1], jd.field_c, param0 ^ 104), param0 + -18, 1);
                                      if (var6 == 0) {
                                        break L1;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                ((pf) this).field_j.a(sk.a(new String[1], nh.field_Lb, 126), 1, 0);
                                if (var6 == 0) {
                                  break L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            ((pf) this).field_j.a(sk.a(new String[1], ab.field_P, param0 + 106), param0 ^ 18, 1);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L6: {
              if (param0 == 19) {
                break L6;
              } else {
                pf.a((String) null, -98, -98, 115L, (byte) 47);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "pf.D(" + param0 + ',' + param1 + ')');
        }
    }

    pf(hl param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
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
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            ((pf) this).field_j = new aa(TetraLink.field_P);
            param0.field_zb = true;
            ((pf) this).field_e = param1;
            ((pf) this).field_b = param2;
            ((pf) this).field_h = param0;
            ((pf) this).field_f = param5;
            ((pf) this).field_g = param6;
            ((pf) this).field_c = param4;
            ((pf) this).field_i = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pf.<init>(");
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
          L2: {
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
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        try {
            ((pf) this).field_j.a(param0, 256);
            if (param1 != 15163) {
                ((pf) this).field_i = null;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "pf.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int[] param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        ud var5 = null;
        int var6 = 0;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        String stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        String stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        try {
          L0: {
            if (param2) {
              L1: {
                if (((pf) this).field_b == null) {
                  break L1;
                } else {
                  L2: {
                    if (oj.field_c != ((pf) this).field_e) {
                      break L2;
                    } else {
                      if (param0 != 2) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (ji.field_Tb != 2) {
                    break L1;
                  } else {
                    L3: {
                      var4_ref = this.b(2);
                      stackOut_12_0 = ((pf) this).field_b;
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (param2) {
                        stackOut_15_0 = (String) (Object) stackIn_15_0;
                        stackOut_15_1 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L3;
                      } else {
                        stackOut_13_0 = (String) (Object) stackIn_13_0;
                        stackOut_13_1 = 1;
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        break L3;
                      }
                    }
                    L4: {
                      var5 = ke.a(stackIn_16_0, stackIn_16_1 != 0);
                      var6 = sb.a((byte) 2, ((pf) this).field_b) ? 1 : 0;
                      if (null != var5) {
                        break L4;
                      } else {
                        if (var6 == 0) {
                          ((pf) this).field_j.a(sk.a(new String[1], l.field_i, 125), 1, 4);
                          ((pf) this).field_j.a(sk.a(new String[1], mi.field_Nb, 126), 1, 6);
                          if (null == param1) {
                            break L4;
                          } else {
                            if (param0 == 2) {
                              break L4;
                            } else {
                              if (cd.field_a) {
                                break L4;
                              } else {
                                ((pf) this).field_g = param1;
                                ((pf) this).field_j.a(sk.a(new String[1], tl.field_bb, 123), 1, 19);
                                break L4;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (null == var5) {
                        break L5;
                      } else {
                        L6: {
                          if (cc.a(((pf) this).field_b, (byte) -80)) {
                            break L6;
                          } else {
                            if (cd.field_a) {
                              break L6;
                            } else {
                              L7: {
                                if (fn.field_K) {
                                  break L7;
                                } else {
                                  ((pf) this).field_j.a(sk.a(new String[1], jk.field_a, 125), 1, 8);
                                  break L7;
                                }
                              }
                              ((pf) this).field_j.a(sk.a(new String[1], pl.field_b, 126), 1, 18);
                              if (param1 != null) {
                                ((pf) this).field_g = param1;
                                ((pf) this).field_j.a(sk.a(new String[1], tl.field_bb, 127), 1, 19);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        ((pf) this).field_j.a(sk.a(new String[1], wk.field_j, 120), 1, 5);
                        break L5;
                      }
                    }
                    if (var6 == 0) {
                      break L1;
                    } else {
                      ((pf) this).field_j.a(sk.a(new String[1], lk.field_nb, 126), 1, 7);
                      break L1;
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
          L8: {
            var4 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var4;
            stackOut_52_1 = new StringBuilder().append("pf.K(").append(param0).append(',');
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L8;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L8;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ',' + param2 + ')');
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_27_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (0 == param0) {
                  break L2;
                } else {
                  L3: {
                    if (param0 == 1) {
                      break L3;
                    } else {
                      L4: {
                        if (param0 == 2) {
                          break L4;
                        } else {
                          L5: {
                            if (param0 == 3) {
                              break L5;
                            } else {
                              if (10 == param0) {
                                mi.a(3, ((pf) this).field_c, param2);
                                if (var5 == 0) {
                                  break L1;
                                } else {
                                  break L5;
                                }
                              } else {
                                L6: {
                                  if (param0 != 15) {
                                    break L6;
                                  } else {
                                    g.a(param2, (byte) -125, ((pf) this).field_c);
                                    if (var5 == 0) {
                                      break L1;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                L7: {
                                  if (param0 != 16) {
                                    break L7;
                                  } else {
                                    g.a(param2, (byte) -123, 0);
                                    if (var5 == 0) {
                                      break L1;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                stackOut_26_0 = 0;
                                stackIn_27_0 = stackOut_26_0;
                                return stackIn_27_0 != 0;
                              }
                            }
                          }
                          g.e(((pf) this).field_c, -125, param2);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      uf.a(param2, (byte) 110, ((pf) this).field_c);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  qe.a(47, param2, ((pf) this).field_e);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              q.a(param2, (byte) -118, ((pf) this).field_e);
              break L1;
            }
            if (param1 > 108) {
              stackOut_43_0 = 1;
              stackIn_44_0 = stackOut_43_0;
              break L0;
            } else {
              stackOut_41_0 = 1;
              stackIn_42_0 = stackOut_41_0;
              return stackIn_42_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var4, "pf.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_44_0 != 0;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      Object discarded$1 = ii.a(new Object[1], 6760, "resizing", lk.q(13));
                      if (param0 > 115) {
                        break L2;
                      } else {
                        pf.a((byte) 9);
                        break L2;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw oi.a((Throwable) (Object) var2_ref, "pf.C(" + param0 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        try {
            field_a = null;
            field_k = null;
            if (param0 != 86) {
                pf.a(60, 17);
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "pf.I(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Create";
        field_a = new jk();
    }
}

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
        if (param0 == -1) {
          if (((pf) this).field_j != null) {
            if (!((pf) this).field_j.e((byte) -87)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        if (param2 == 17) {
          mm.field_y = new om(((pf) this).field_h.field_eb, ((pf) this).field_h.field_z, ((pf) this).field_h.field_Hb, ((pf) this).field_h.field_R, param0, sa.field_h, hl.field_gb, sn.field_c, bk.field_i, vd.field_c, ek.field_n, ((pf) this).field_b, ((pf) this).field_e);
          return true;
        } else {
          return false;
        }
    }

    private final String b() {
        String var2 = null;
        if (null == ((pf) this).field_i) {
            var2 = ((pf) this).field_b;
        } else {
            var2 = ((pf) this).field_i;
        }
        return var2;
    }

    private final boolean d(int param0, int param1, int param2) {
        int var5 = TetraLink.field_J;
        if (param2 == 8) {
            tb.a(false, ((pf) this).field_b, ((pf) this).field_e);
            return true;
        }
        if (param2 != 18) {
            if (param2 == 11) {
                vj.a(((pf) this).field_f, param1, 0, 99);
                return true;
            }
            if (param2 != 12) {
                if (param2 == 13) {
                    vj.a(((pf) this).field_f, param1, 2, 99);
                    return true;
                }
                if (param2 != 14) {
                    if (20 == param2) {
                        int discarded$0 = -20715;
                        em.d();
                        return true;
                    }
                    if (19 != param2) {
                        return false;
                    }
                    boolean discarded$1 = sj.a(((pf) this).field_e, ((pf) this).field_b, ((pf) this).field_g, 60, ((pf) this).field_f);
                    return true;
                }
                ei.d(-4210768);
                return true;
            }
            vj.a(((pf) this).field_f, param1, 1, 113);
            return true;
        }
        uf.a(-127, ((pf) this).field_b, ((pf) this).field_e);
        return true;
    }

    final void a(boolean param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (null == ((pf) this).field_b) {
            break L0;
          } else {
            if (~((pf) this).field_e == ~oj.field_c) {
              break L0;
            } else {
              int discarded$2 = 2;
              var3 = this.b();
              var2 = var3;
              ((pf) this).field_j.a(sk.a(new String[1], qm.field_a, 125), 1, 17);
              break L0;
            }
          }
        }
        if (!param0) {
          ((pf) this).field_j = null;
          return;
        } else {
          return;
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        var4 = null;
        if (4 == param2) {
          var4_ref = qf.a((byte) 122, ((pf) this).field_b, param1);
          if (var4_ref != null) {
            var6 = null;
            fi.a(0, 0, ((pf) this).field_b, 2, var4_ref, (String) null);
            var5 = 0;
            return true;
          } else {
            var5 = 0;
            return true;
          }
        } else {
          if (5 != param2) {
            if (param2 != 6) {
              if (param2 == 7) {
                var4_ref = aa.a(((pf) this).field_b, param1, 2, ((pf) this).field_i);
                if (var4_ref != null) {
                  var6 = null;
                  fi.a(0, 0, ((pf) this).field_b, 2, var4_ref, (String) null);
                  var5 = 0;
                  return true;
                } else {
                  var5 = 0;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              int discarded$1 = 2;
              var4_ref = li.a(param1, ((pf) this).field_b);
              if (var4_ref == null) {
                var5 = 0;
                return true;
              } else {
                var6 = null;
                fi.a(0, 0, ((pf) this).field_b, 2, var4_ref, (String) null);
                var5 = 0;
                return true;
              }
            }
          } else {
            var4_ref = ma.a(false, ((pf) this).field_b, param1);
            if (var4_ref == null) {
              var5 = 0;
              return true;
            } else {
              var6 = null;
              fi.a(0, 0, ((pf) this).field_b, 2, var4_ref, (String) null);
              var5 = 0;
              return true;
            }
          }
        }
    }

    final static void a(String param0, int param1, int param2, long param3, byte param4) {
        try {
            me.field_g = param2;
            va.field_u = true;
            kd.field_h = param1;
            rc.field_N = param3;
            int var6_int = -83 % ((param4 - -59) / 56);
            qf.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "pf.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(fj param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                  var4 = null;
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
            runtimeException = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) runtimeException;
            stackOut_20_1 = new StringBuilder().append("pf.N(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, byte param3, int param4) {
        int var6 = ((pf) this).field_j.b(param2, -109);
        if (param3 != 53) {
            ((pf) this).field_h = null;
            if (!(var6 != -2)) {
                return false;
            }
            boolean discarded$0 = this.a(var6, 122, param1);
            boolean discarded$1 = this.c(85, param0, var6);
            boolean discarded$2 = this.d(-15, param0, var6);
            boolean discarded$3 = this.b(param4, -20991, var6);
            return true;
        }
        if (!(var6 != -2)) {
            return false;
        }
        boolean discarded$4 = this.a(var6, 122, param1);
        boolean discarded$5 = this.c(85, param0, var6);
        boolean discarded$6 = this.d(-15, param0, var6);
        boolean discarded$7 = this.b(param4, -20991, var6);
        return true;
    }

    final void b(byte param0) {
        String var3 = null;
        int var4 = 0;
        el var5 = null;
        var4 = TetraLink.field_J;
        if (qb.field_N == null) {
          var5 = qd.c(param0 ^ 35, ((pf) this).field_c);
          if (var5 != null) {
            var3 = var5.field_ec;
            if (!var5.field_Vb) {
              if (!var5.field_xc) {
                if (!var5.field_Wb) {
                  if (!var5.field_kc) {
                    if (!var5.field_Wb) {
                      if (param0 == 79) {
                        return;
                      } else {
                        field_a = null;
                        return;
                      }
                    } else {
                      ((pf) this).field_j.a(sk.a(new String[1], tk.field_e, 121), 1, 3);
                      if (param0 == 79) {
                        return;
                      } else {
                        field_a = null;
                        return;
                      }
                    }
                  } else {
                    if (!var5.field_Kb) {
                      ((pf) this).field_j.a(sk.a(new String[1], bb.field_g, 120), 1, 2);
                      if (!var5.field_Wb) {
                        if (param0 == 79) {
                          return;
                        } else {
                          field_a = null;
                          return;
                        }
                      } else {
                        ((pf) this).field_j.a(sk.a(new String[1], tk.field_e, 121), 1, 3);
                        if (param0 == 79) {
                          return;
                        } else {
                          field_a = null;
                          return;
                        }
                      }
                    } else {
                      if (var5.field_xc) {
                        ((pf) this).field_j.a(sk.a(new String[1], bb.field_g, 120), 1, 2);
                        if (!var5.field_Wb) {
                          if (param0 == 79) {
                            return;
                          } else {
                            field_a = null;
                            return;
                          }
                        } else {
                          ((pf) this).field_j.a(sk.a(new String[1], tk.field_e, 121), 1, 3);
                          if (param0 == 79) {
                            return;
                          } else {
                            field_a = null;
                            return;
                          }
                        }
                      } else {
                        if (!var5.field_Wb) {
                          if (param0 == 79) {
                            return;
                          } else {
                            field_a = null;
                            return;
                          }
                        } else {
                          ((pf) this).field_j.a(sk.a(new String[1], tk.field_e, 121), 1, 3);
                          if (param0 != 79) {
                            field_a = null;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (!var5.field_Wb) {
                    if (param0 != 79) {
                      field_a = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((pf) this).field_j.a(sk.a(new String[1], tk.field_e, 121), 1, 3);
                    if (param0 != 79) {
                      field_a = null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                ((pf) this).field_j.a(sk.a(new String[1], oa.field_o, 127), 1, 2);
                if (var5.field_Wb) {
                  ((pf) this).field_j.a(sk.a(new String[1], tk.field_e, 121), 1, 3);
                  if (param0 == 79) {
                    return;
                  } else {
                    field_a = null;
                    return;
                  }
                } else {
                  if (param0 != 79) {
                    field_a = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              ((pf) this).field_j.a(sk.a(new String[1], cm.field_b, 123), 1, 2);
              ((pf) this).field_j.a(sk.a(new String[1], ca.field_b, 122), param0 + -78, 3);
              if (param0 != 79) {
                field_a = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 79) {
              field_a = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 79) {
            field_a = null;
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, boolean param1) {
        gd var4 = null;
        String var5 = null;
        int var6 = 0;
        gd var7 = null;
        var6 = TetraLink.field_J;
        if (((pf) this).field_b != null) {
          if (oj.field_c != ((pf) this).field_e) {
            if (qb.field_N != null) {
              int discarded$3 = 63;
              if (s.b()) {
                int discarded$4 = -26778;
                var7 = tm.a(((pf) this).field_e);
                var4 = sf.a(-18701, ((pf) this).field_e);
                int discarded$5 = 2;
                var5 = this.b();
                if (var4 == null) {
                  if (var7 != null) {
                    if (qb.field_N.field_kc) {
                      if (qb.field_N.field_jc >= qb.field_N.field_rc) {
                        if (param0 == 19) {
                          return;
                        } else {
                          pf.a((String) null, -98, -98, 115L, (byte) 47);
                          return;
                        }
                      } else {
                        if (var7.field_cc) {
                          ((pf) this).field_j.a(sk.a(new String[1], ab.field_P, param0 + 106), param0 ^ 18, 1);
                          if (param0 == 19) {
                            return;
                          } else {
                            pf.a((String) null, -98, -98, 115L, (byte) 47);
                            return;
                          }
                        } else {
                          if (param1) {
                            if (var7.field_Kb) {
                              ((pf) this).field_j.a(sk.a(new String[1], fe.field_a, 125), 1, 0);
                              ((pf) this).field_j.a(sk.a(new String[1], jd.field_c, param0 ^ 104), param0 + -18, 1);
                              if (param0 == 19) {
                                return;
                              } else {
                                pf.a((String) null, -98, -98, 115L, (byte) 47);
                                return;
                              }
                            } else {
                              ((pf) this).field_j.a(sk.a(new String[1], nh.field_Lb, 126), 1, 0);
                              if (param0 == 19) {
                                return;
                              } else {
                                pf.a((String) null, -98, -98, 115L, (byte) 47);
                                return;
                              }
                            }
                          } else {
                            ((pf) this).field_j.a(sk.a(new String[1], nh.field_Lb, 126), 1, 0);
                            if (param0 == 19) {
                              return;
                            } else {
                              pf.a((String) null, -98, -98, 115L, (byte) 47);
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      if (param0 == 19) {
                        return;
                      } else {
                        pf.a((String) null, -98, -98, 115L, (byte) 47);
                        return;
                      }
                    }
                  } else {
                    if (param0 != 19) {
                      pf.a((String) null, -98, -98, 115L, (byte) 47);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (qb.field_N.field_Kb) {
                    if (qb.field_N.field_bc < 0) {
                      if (param0 != 19) {
                        pf.a((String) null, -98, -98, 115L, (byte) 47);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((pf) this).field_j.a(sk.a(new String[1], il.field_P, 124), 1, 1);
                      if (param0 != 19) {
                        pf.a((String) null, -98, -98, 115L, (byte) 47);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ((pf) this).field_j.a(sk.a(new String[1], il.field_P, 124), 1, 1);
                    if (param0 != 19) {
                      pf.a((String) null, -98, -98, 115L, (byte) 47);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (param0 != 19) {
                  pf.a((String) null, -98, -98, 115L, (byte) 47);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != 19) {
                pf.a((String) null, -98, -98, 115L, (byte) 47);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 19) {
              pf.a((String) null, -98, -98, 115L, (byte) 47);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 19) {
            pf.a((String) null, -98, -98, 115L, (byte) 47);
            return;
          } else {
            return;
          }
        }
    }

    pf(hl param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            ((pf) this).field_j = new aa(TetraLink.field_P);
            param0.field_zb = true;
            ((pf) this).field_e = param1;
            ((pf) this).field_b = param2;
            ((pf) this).field_h = param0;
            ((pf) this).field_f = param5;
            ((pf) this).field_g = param6;
            ((pf) this).field_c = param4;
            ((pf) this).field_i = param3;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        ((pf) this).field_j.a(param0, 256);
        if (param1 != 15163) {
            ((pf) this).field_i = null;
        }
    }

    final void a(int param0, int[] param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        ud var5 = null;
        int var6 = 0;
        String var7 = null;
        String stackIn_8_0 = null;
        String stackIn_9_0 = null;
        String stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
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
                      int discarded$2 = 2;
                      var7 = this.b();
                      var4_ref = var7;
                      stackOut_7_0 = ((pf) this).field_b;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (param2) {
                        stackOut_9_0 = (String) (Object) stackIn_9_0;
                        stackOut_9_1 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L3;
                      } else {
                        stackOut_8_0 = (String) (Object) stackIn_8_0;
                        stackOut_8_1 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L3;
                      }
                    }
                    L4: {
                      var5 = ke.a(stackIn_10_0, stackIn_10_1 != 0);
                      var6 = sb.a((byte) 2, ((pf) this).field_b) ? 1 : 0;
                      if (var5 != null) {
                        break L4;
                      } else {
                        if (var6 == 0) {
                          ((pf) this).field_j.a(sk.a(new String[1], l.field_i, 125), 1, 4);
                          ((pf) this).field_j.a(sk.a(new String[1], mi.field_Nb, 126), 1, 6);
                          if (param1 == null) {
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
                      if (var5 == null) {
                        break L5;
                      } else {
                        L6: {
                          int discarded$3 = -80;
                          if (cc.a(((pf) this).field_b)) {
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
                      return;
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
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("pf.K(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ')');
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5 = TetraLink.field_J;
        if (0 == param0) {
            q.a(param2, (byte) -118, ((pf) this).field_e);
            return true;
        }
        if (param0 == 1) {
            qe.a(47, param2, ((pf) this).field_e);
            return true;
        }
        if (param0 == 2) {
            uf.a(param2, (byte) 110, ((pf) this).field_c);
            return true;
        }
        if (param0 == 3) {
            g.e(((pf) this).field_c, -125, param2);
            return true;
        }
        if (10 == param0) {
            mi.a(3, ((pf) this).field_c, param2);
            return true;
        }
        if (param0 == 15) {
            g.a(param2, (byte) -125, ((pf) this).field_c);
        } else {
            if (param0 != 16) {
                return false;
            }
            g.a(param2, (byte) -123, 0);
            return true;
        }
        return true;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  Object discarded$1 = ii.a(new Object[1], 6760, "resizing", lk.q(13));
                  if (param0 > 115) {
                    break L1;
                  } else {
                    pf.a((byte) 9);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_k = null;
        if (param0 != 86) {
            pf.a(60, 17);
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

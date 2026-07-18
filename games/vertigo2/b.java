/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    cr field_l;
    private int field_c;
    private int[] field_g;
    int field_j;
    static int[] field_m;
    private long field_o;
    static ll field_d;
    static int field_i;
    static String field_a;
    static cr field_h;
    static String field_f;
    static String field_b;
    private String field_e;
    kq field_n;
    String field_k;

    final void a(int[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        String var4_ref = null;
        tp var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((b) this).field_k) {
                break L1;
              } else {
                L2: {
                  if (ao.field_N != ((b) this).field_o) {
                    break L2;
                  } else {
                    if (param1 != 2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (2 == ba.field_d) {
                  L3: {
                    var7 = this.a(true);
                    var4_ref = var7;
                    var5 = vo.a(((b) this).field_k, 0);
                    var6 = iq.b(((b) this).field_k, 100) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 != 0) {
                        break L3;
                      } else {
                        ((b) this).field_n.a(Vertigo2.a(new String[1], ln.field_e, 69), 4, 0);
                        ((b) this).field_n.a(Vertigo2.a(new String[1], mi.field_x, 103), 6, 0);
                        if (param0 == null) {
                          break L3;
                        } else {
                          if (param1 == 2) {
                            break L3;
                          } else {
                            if (pe.field_r) {
                              break L3;
                            } else {
                              ((b) this).field_g = param0;
                              ((b) this).field_n.a(Vertigo2.a(new String[1], wp.field_b, -124), 19, 0);
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (ak.a(-89, ((b) this).field_k)) {
                          break L5;
                        } else {
                          if (pe.field_r) {
                            break L5;
                          } else {
                            L6: {
                              if (!hj.field_b) {
                                ((b) this).field_n.a(Vertigo2.a(new String[1], sc.field_b, -116), 8, 0);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            ((b) this).field_n.a(Vertigo2.a(new String[1], hh.field_d, 76), 18, 0);
                            if (param0 == null) {
                              break L5;
                            } else {
                              ((b) this).field_g = param0;
                              ((b) this).field_n.a(Vertigo2.a(new String[1], wp.field_b, -128), 19, 0);
                              break L5;
                            }
                          }
                        }
                      }
                      ((b) this).field_n.a(Vertigo2.a(new String[1], fg.field_X, -115), 5, 0);
                      break L4;
                    }
                  }
                  if (var6 == 0) {
                    break L1;
                  } else {
                    ((b) this).field_n.a(Vertigo2.a(new String[1], f.field_J, -121), 7, 0);
                    break L1;
                  }
                } else {
                  var4_int = -4 / ((param2 - -17) / 33);
                  return;
                }
              }
            }
            var4_int = -4 / ((param2 - -17) / 33);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("b.M(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        String var3 = null;
        int var4 = 0;
        uh var5 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null == gd.field_j) {
          var5 = ln.a(0, ((b) this).field_j);
          if (var5 != null) {
            var3 = var5.field_Nb;
            if (var5.field_Sb) {
              ((b) this).field_n.a(Vertigo2.a(new String[1], af.field_G, 87), 2, param0 + -2);
              ((b) this).field_n.a(Vertigo2.a(new String[1], aq.field_b, -124), 3, 0);
              if (param0 == 2) {
                return;
              } else {
                ((b) this).field_j = 36;
                return;
              }
            } else {
              if (var5.field_dc) {
                ((b) this).field_n.a(Vertigo2.a(new String[1], kq.field_Ub, -123), 2, 0);
                if (var5.field_qc) {
                  ((b) this).field_n.a(Vertigo2.a(new String[1], we.field_L, param0 ^ -114), 3, 0);
                  if (param0 == 2) {
                    return;
                  } else {
                    ((b) this).field_j = 36;
                    return;
                  }
                } else {
                  if (param0 == 2) {
                    return;
                  } else {
                    ((b) this).field_j = 36;
                    return;
                  }
                }
              } else {
                if (!var5.field_qc) {
                  if (var5.field_vc) {
                    if (var5.field_kc) {
                      if (!var5.field_dc) {
                        if (var5.field_qc) {
                          ((b) this).field_n.a(Vertigo2.a(new String[1], we.field_L, param0 ^ -114), 3, 0);
                          if (param0 == 2) {
                            return;
                          } else {
                            ((b) this).field_j = 36;
                            return;
                          }
                        } else {
                          if (param0 == 2) {
                            return;
                          } else {
                            ((b) this).field_j = 36;
                            return;
                          }
                        }
                      } else {
                        ((b) this).field_n.a(Vertigo2.a(new String[1], qj.field_a, -117), 2, 0);
                        if (var5.field_qc) {
                          ((b) this).field_n.a(Vertigo2.a(new String[1], we.field_L, param0 ^ -114), 3, 0);
                          if (param0 == 2) {
                            return;
                          } else {
                            ((b) this).field_j = 36;
                            return;
                          }
                        } else {
                          if (param0 != 2) {
                            ((b) this).field_j = 36;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      ((b) this).field_n.a(Vertigo2.a(new String[1], qj.field_a, -117), 2, 0);
                      if (var5.field_qc) {
                        ((b) this).field_n.a(Vertigo2.a(new String[1], we.field_L, param0 ^ -114), 3, 0);
                        if (param0 != 2) {
                          ((b) this).field_j = 36;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (param0 != 2) {
                          ((b) this).field_j = 36;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (var5.field_qc) {
                      ((b) this).field_n.a(Vertigo2.a(new String[1], we.field_L, param0 ^ -114), 3, 0);
                      if (param0 != 2) {
                        ((b) this).field_j = 36;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 != 2) {
                        ((b) this).field_j = 36;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (var5.field_qc) {
                    ((b) this).field_n.a(Vertigo2.a(new String[1], we.field_L, param0 ^ -114), 3, 0);
                    if (param0 != 2) {
                      ((b) this).field_j = 36;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 != 2) {
                      ((b) this).field_j = 36;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (param0 == 2) {
              return;
            } else {
              ((b) this).field_j = 36;
              return;
            }
          }
        } else {
          if (param0 != 2) {
            ((b) this).field_j = 36;
            return;
          } else {
            return;
          }
        }
    }

    final void c(int param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (null == ((b) this).field_k) {
            break L0;
          } else {
            if (((b) this).field_o == ao.field_N) {
              break L0;
            } else {
              var3 = this.a(true);
              var2 = var3;
              ((b) this).field_n.a(Vertigo2.a(new String[1], as.field_c, -121), 17, 0);
              break L0;
            }
          }
        }
        if (param0 != -24634) {
          field_f = null;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, tn param1) {
        RuntimeException var3 = null;
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
            if (!param1.field_n) {
              L1: {
                ((b) this).field_c = param1.field_s;
                if (param1.field_s != 0) {
                  break L1;
                } else {
                  L2: {
                    if (rm.field_B != 0) {
                      break L2;
                    } else {
                      ((b) this).field_n.a(jk.field_a, 12, 0);
                      break L2;
                    }
                  }
                  ((b) this).field_n.a(on.field_d, 13, 0);
                  break L1;
                }
              }
              L3: {
                if (param1.field_s != 1) {
                  break L3;
                } else {
                  L4: {
                    if (oa.field_p == 0) {
                      ((b) this).field_n.a(ng.field_b, 12, 0);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((b) this).field_n.a(sp.field_P, 13, 0);
                  break L3;
                }
              }
              L5: {
                if (param1.field_s == 2) {
                  L6: {
                    if (mf.field_b == 0) {
                      ((b) this).field_n.a(gm.field_b, 12, 0);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((b) this).field_n.a(mo.field_d, 13, 0);
                  break L5;
                } else {
                  break L5;
                }
              }
              if (param0) {
                break L0;
              } else {
                ((b) this).field_j = 116;
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("b.L(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = 0;
        if (param1 == 17) {
          up.field_z = new cb(((b) this).field_l.field_ob, ((b) this).field_l.field_C, ((b) this).field_l.field_Fb, ((b) this).field_l.field_db, param2, hb.field_D, ji.field_s, eh.field_a, ee.field_b, fr.field_a, ja.field_e, ((b) this).field_k, ((b) this).field_o);
          return true;
        } else {
          return false;
        }
    }

    private final boolean b(int param0, int param1, byte param2) {
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (param1 != 8) {
            if (param1 != 18) {
                if (param1 == 11) {
                    cf.a(((b) this).field_c, 0, param0, (byte) 53);
                    return true;
                }
                if (12 != param1) {
                    if (param1 != 13) {
                        if (14 != param1) {
                            if (param1 == 20) {
                                g.a((byte) -10);
                                return true;
                            }
                            if (param1 == 19) {
                                boolean discarded$0 = qm.a(((b) this).field_g, ((b) this).field_k, (byte) 114, ((b) this).field_c, ((b) this).field_o);
                                return true;
                            }
                            return false;
                        }
                        mj.a((byte) 4);
                        return true;
                    }
                    cf.a(((b) this).field_c, 2, param0, (byte) 104);
                    return true;
                }
                cf.a(((b) this).field_c, 1, param0, (byte) 63);
                return true;
            }
            lr.a(-57, ((b) this).field_k, ((b) this).field_o);
            return true;
        }
        di.a((byte) 119, ((b) this).field_o, ((b) this).field_k);
        return true;
    }

    private final String a(boolean param0) {
        String var2 = null;
        if (((b) this).field_e != null) {
            var2 = ((b) this).field_e;
        } else {
            var2 = ((b) this).field_k;
        }
        return var2;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final void a(boolean param0, int param1) {
        ((b) this).field_n.b(param0, 0);
        if (param1 > -49) {
            Object var4 = null;
            ((b) this).a((int[]) null, 63, (byte) 0);
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        var6 = ((b) this).field_n.a(false, param1);
        if (var6 != -2) {
          if (param4 != 2) {
            ((b) this).field_n = null;
            boolean discarded$8 = this.a(var6, param0, (byte) 41);
            boolean discarded$9 = this.a(param2, var6, 0);
            boolean discarded$10 = this.b(param2, var6, (byte) 110);
            boolean discarded$11 = this.b(59, var6, param3);
            return true;
          } else {
            boolean discarded$12 = this.a(var6, param0, (byte) 41);
            boolean discarded$13 = this.a(param2, var6, 0);
            boolean discarded$14 = this.b(param2, var6, (byte) 110);
            boolean discarded$15 = this.b(59, var6, param3);
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean d(int param0) {
        if (param0 == 2) {
          if (((b) this).field_n != null) {
            if (!((b) this).field_n.b((byte) 81)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((b) this).field_l = null;
          if (((b) this).field_n != null) {
            if (!((b) this).field_n.b((byte) 81)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        Object var4 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        var4 = null;
        if (param1 != 4) {
          if (param1 != 5) {
            if (param1 != 6) {
              if (param1 == 7) {
                var10 = en.a(((b) this).field_k, (byte) 67, ((b) this).field_e, param0);
                if (var10 != null) {
                  dh.a((byte) -52, var10, 2, (String) null, 0, ((b) this).field_k);
                  boolean discarded$8 = this.b(-26, 104, (byte) -5);
                  return true;
                } else {
                  boolean discarded$9 = this.b(-26, 104, (byte) -5);
                  return true;
                }
              } else {
                return false;
              }
            } else {
              var9 = br.a(((b) this).field_k, param0, 100);
              if (var9 != null) {
                dh.a((byte) -52, var9, 2, (String) null, 0, ((b) this).field_k);
                boolean discarded$10 = this.b(-26, 104, (byte) -5);
                return true;
              } else {
                boolean discarded$11 = this.b(-26, 104, (byte) -5);
                return true;
              }
            }
          } else {
            var8 = lk.a((byte) -41, param0, ((b) this).field_k);
            if (var8 == null) {
              boolean discarded$12 = this.b(-26, 104, (byte) -5);
              return true;
            } else {
              dh.a((byte) -52, var8, 2, (String) null, 0, ((b) this).field_k);
              boolean discarded$13 = this.b(-26, 104, (byte) -5);
              return true;
            }
          }
        } else {
          var7 = ia.a(-96, param0, ((b) this).field_k);
          if (var7 == null) {
            boolean discarded$14 = this.b(-26, 104, (byte) -5);
            return true;
          } else {
            dh.a((byte) -52, var7, 2, (String) null, 0, ((b) this).field_k);
            boolean discarded$15 = this.b(-26, 104, (byte) -5);
            return true;
          }
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_a = null;
        field_f = null;
        field_h = null;
        field_d = null;
        field_b = null;
    }

    final void a(int param0, boolean param1) {
        bs var4 = null;
        String var5 = null;
        int var6 = 0;
        bs var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (((b) this).field_k != null) {
          if (ao.field_N != ((b) this).field_o) {
            if (null != gd.field_j) {
              if (cn.b(false)) {
                var7 = jg.a(((b) this).field_o, -119);
                var4 = eq.a(((b) this).field_o, (byte) 84);
                var5 = this.a(true);
                if (var4 == null) {
                  if (var7 != null) {
                    if (gd.field_j.field_vc) {
                      if (gd.field_j.field_Qb < gd.field_j.field_uc) {
                        if (var7.field_Yb) {
                          ((b) this).field_n.a(Vertigo2.a(new String[1], kh.field_a, param0 ^ -118), 1, 0);
                          if (param0 == 0) {
                            return;
                          } else {
                            ((b) this).field_j = -69;
                            return;
                          }
                        } else {
                          if (!param1) {
                            ((b) this).field_n.a(Vertigo2.a(new String[1], pp.field_v, -118), 0, 0);
                            if (param0 == 0) {
                              return;
                            } else {
                              ((b) this).field_j = -69;
                              return;
                            }
                          } else {
                            if (var7.field_Ob) {
                              ((b) this).field_n.a(Vertigo2.a(new String[1], te.field_y, param0 ^ 9), 0, param0);
                              ((b) this).field_n.a(Vertigo2.a(new String[1], sj.field_a, -7), 1, 0);
                              if (param0 == 0) {
                                return;
                              } else {
                                ((b) this).field_j = -69;
                                return;
                              }
                            } else {
                              ((b) this).field_n.a(Vertigo2.a(new String[1], pp.field_v, -118), 0, 0);
                              if (param0 == 0) {
                                return;
                              } else {
                                ((b) this).field_j = -69;
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        if (param0 == 0) {
                          return;
                        } else {
                          ((b) this).field_j = -69;
                          return;
                        }
                      }
                    } else {
                      if (param0 == 0) {
                        return;
                      } else {
                        ((b) this).field_j = -69;
                        return;
                      }
                    }
                  } else {
                    if (param0 != 0) {
                      ((b) this).field_j = -69;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (gd.field_j.field_kc) {
                    if (gd.field_j.field_Yb < 0) {
                      if (param0 != 0) {
                        ((b) this).field_j = -69;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((b) this).field_n.a(Vertigo2.a(new String[1], vi.field_s, -126), 1, 0);
                      if (param0 != 0) {
                        ((b) this).field_j = -69;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ((b) this).field_n.a(Vertigo2.a(new String[1], vi.field_s, -126), 1, 0);
                    if (param0 != 0) {
                      ((b) this).field_j = -69;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (param0 != 0) {
                  ((b) this).field_j = -69;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != 0) {
                ((b) this).field_j = -69;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 0) {
              ((b) this).field_j = -69;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 0) {
            ((b) this).field_j = -69;
            return;
          } else {
            return;
          }
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (0 == param0) {
            ui.a(((b) this).field_o, param1, (byte) 103);
            return true;
        }
        if (1 == param0) {
            ed.a(((b) this).field_o, param1, (byte) -96);
            return true;
        }
        if (param0 == 2) {
            hk.a(param1, (byte) 60, ((b) this).field_j);
        } else {
            if (param0 == 3) {
                qk.d(((b) this).field_j, param1, 18964);
                return true;
            }
            if (param0 == -11) {
                bs.a(param1, (byte) -47, ((b) this).field_j);
                return true;
            }
            if (-16 == param0) {
                fa.a(param1, ((b) this).field_j, true);
                return true;
            }
            if (16 == param0) {
                fa.a(param1, 0, true);
                return true;
            }
            return false;
        }
        return true;
    }

    b(cr param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            ((b) this).field_n = new kq(ar.field_c);
            ((b) this).field_l = param0;
            ((b) this).field_e = param3;
            ((b) this).field_o = param1;
            ((b) this).field_c = param5;
            ((b) this).field_j = param4;
            param0.field_V = true;
            ((b) this).field_g = param6;
            ((b) this).field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ll();
        field_i = -1;
        field_a = "Collect the dynamite. This is a bomb you can carry with you and detonate where you like! Press <img=6> or <img=13> to detonate it. To complete this level, use the dynamite to destroy the last blue block. The spinning save star is a checkpoint; if you die on a level after collecting a save star, you'll start the level again from the point at which you collected it. It's usually a good idea to leave save stars until you want to attempt something tricky.";
        field_f = "Please wait...";
        field_b = "The small blob is a 1-UP (an extra life), so it's well worth collecting! Platforms with skulls on them are traps - if you stand on one, you'll lose a life. Some blocks here are moving, so make sure to get your timing right.";
    }
}

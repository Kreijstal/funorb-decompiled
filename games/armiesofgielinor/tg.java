/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    private long field_f;
    static String field_j;
    private String field_h;
    static je field_n;
    private int[] field_o;
    je field_g;
    String field_m;
    static byte[] field_d;
    static String field_l;
    np field_i;
    static int field_k;
    static int field_a;
    int field_c;
    static ru[] field_b;
    private int field_e;

    private final boolean b(int param0, byte param1, int param2) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 0) {
            int discarded$1 = 6;
            ra.a(((tg) this).field_f, param2);
        } else {
            if (param0 == 1) {
                te.a(param2, ((tg) this).field_f, (byte) 108);
                return true;
            }
            if (param0 == 2) {
                ag.a(param2, -48, ((tg) this).field_c);
                return true;
            }
            if (param0 != 3) {
                if (param0 != 10) {
                    if (param0 != 15) {
                        if (param0 != 16) {
                            return false;
                        }
                        bw.a(param2, 0, (byte) -116);
                        return true;
                    }
                    bw.a(param2, ((tg) this).field_c, (byte) -116);
                    return true;
                }
                ov.a(param2, 3, ((tg) this).field_c);
                return true;
            }
            pq.a(-119, ((tg) this).field_c, param2);
            return true;
        }
        return true;
    }

    private final boolean a(int param0, boolean param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        var4 = null;
        if (param2 != 4) {
          if (param2 != 5) {
            if (param2 == 6) {
              var4_ref = se.a(((tg) this).field_m, param0, -127);
              if (var4_ref != null) {
                int discarded$4 = 0;
                ta.a((String) null, 2, -18119, ((tg) this).field_m, var4_ref);
                return true;
              } else {
                return true;
              }
            } else {
              if (param2 == 7) {
                var4_ref = fq.a(param0, ((tg) this).field_h, false, ((tg) this).field_m);
                if (var4_ref != null) {
                  int discarded$5 = 0;
                  ta.a((String) null, 2, -18119, ((tg) this).field_m, var4_ref);
                  return true;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            var4_ref = nw.a(((tg) this).field_m, (byte) -27, param0);
            if (var4_ref == null) {
              return true;
            } else {
              int discarded$6 = 0;
              ta.a((String) null, 2, -18119, ((tg) this).field_m, var4_ref);
              return true;
            }
          }
        } else {
          var4_ref = op.a(20, ((tg) this).field_m, param0);
          if (var4_ref == null) {
            return true;
          } else {
            int discarded$7 = 0;
            ta.a((String) null, 2, -18119, ((tg) this).field_m, var4_ref);
            return true;
          }
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, boolean param4) {
        if (param1 <= 60) {
            return true;
        }
        int var6 = ((tg) this).field_i.a((byte) 116, param4);
        if (!(var6 != -2)) {
            return false;
        }
        boolean discarded$0 = this.b(var6, (byte) 101, param0);
        boolean discarded$1 = this.a(param2, false, var6);
        boolean discarded$2 = this.a(var6, param2, (byte) -81);
        boolean discarded$3 = this.a(var6, (byte) 113, param3);
        return true;
    }

    final void a(mo param0, int param1) {
        if (param0.field_f) {
            return;
        }
        try {
            ((tg) this).field_e = param0.field_b;
            if (param1 == param0.field_b) {
                if (ol.field_B == 0) {
                    ((tg) this).field_i.a(12, pk.field_S, (byte) -110);
                }
                ((tg) this).field_i.a(13, ou.field_g, (byte) -116);
            }
            if (param0.field_b == 1) {
                if (!(va.field_D != 0)) {
                    ((tg) this).field_i.a(12, jj.field_b, (byte) -108);
                }
                ((tg) this).field_i.a(13, fa.field_c, (byte) -121);
            }
            if (param0.field_b == 2) {
                if (!(cd.field_c != 0)) {
                    ((tg) this).field_i.a(12, hw.field_C, (byte) -120);
                }
                ((tg) this).field_i.a(13, ai.field_R, (byte) -119);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "tg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(kl param0, int param1, boolean param2, kl param3) {
        try {
            bk.a(param2, fp.field_Lb, eq.field_h, (ka) (Object) gm.field_f, ms.field_k, -106, ke.field_e, im.field_x, qc.field_e, ri.field_b, bd.field_o, rd.field_e);
            dh.field_n = fk.a("chatfilter", (byte) -125, param3, "lobby");
            co.field_k[0] = ar.field_v;
            co.field_k[1] = wg.field_a;
            co.field_k[param1] = cd.field_d;
            mu.a((ka) (Object) t.field_a, param1 + -2, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "tg.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 > -15) {
          var2 = null;
          tg.a((kl) null, 28, false, (kl) null);
          field_b = null;
          field_j = null;
          field_n = null;
          field_d = null;
          field_l = null;
          return;
        } else {
          field_b = null;
          field_j = null;
          field_n = null;
          field_d = null;
          field_l = null;
          return;
        }
    }

    final void a(int param0, boolean param1) {
        of var4 = null;
        String var5 = null;
        int var6 = 0;
        of var7 = null;
        of var10 = null;
        of var11 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 23899) {
          ((tg) this).field_e = 127;
          if (((tg) this).field_m != null) {
            if (((tg) this).field_f != oh.field_H) {
              if (null != vu.field_M) {
                int discarded$2 = 0;
                if (vu.b()) {
                  var11 = tr.a((byte) 121, ((tg) this).field_f);
                  var4 = hr.a(((tg) this).field_f, -86);
                  var5 = this.b(param0 + -24004);
                  if (var4 == null) {
                    if (var11 != null) {
                      if (vu.field_M.field_tc) {
                        if (vu.field_M.field_nc > vu.field_M.field_Ub) {
                          if (!var11.field_Wb) {
                            if (param1) {
                              if (var11.field_Ub) {
                                ((tg) this).field_i.a(0, fo.a(4800, ac.field_x, new String[1]), (byte) -126);
                                ((tg) this).field_i.a(1, fo.a(param0 + -19099, vq.field_g, new String[1]), (byte) -113);
                                return;
                              } else {
                                ((tg) this).field_i.a(0, fo.a(4800, pk.field_W, new String[1]), (byte) -118);
                                return;
                              }
                            } else {
                              ((tg) this).field_i.a(0, fo.a(4800, pk.field_W, new String[1]), (byte) -118);
                              return;
                            }
                          } else {
                            ((tg) this).field_i.a(1, fo.a(4800, oe.field_zb, new String[1]), (byte) -124);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (vu.field_M.field_kc) {
                      if (vu.field_M.field_bc < 0) {
                        return;
                      } else {
                        ((tg) this).field_i.a(1, fo.a(4800, wc.field_R, new String[1]), (byte) -103);
                        return;
                      }
                    } else {
                      ((tg) this).field_i.a(1, fo.a(4800, wc.field_R, new String[1]), (byte) -103);
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          if (((tg) this).field_m != null) {
            if (((tg) this).field_f != oh.field_H) {
              if (null != vu.field_M) {
                int discarded$3 = 0;
                if (vu.b()) {
                  var10 = tr.a((byte) 121, ((tg) this).field_f);
                  var7 = var10;
                  var4 = hr.a(((tg) this).field_f, -86);
                  var5 = this.b(param0 + -24004);
                  if (var4 == null) {
                    if (var10 != null) {
                      if (vu.field_M.field_tc) {
                        if (vu.field_M.field_nc > vu.field_M.field_Ub) {
                          if (!var10.field_Wb) {
                            if (param1) {
                              if (!var10.field_Ub) {
                                ((tg) this).field_i.a(0, fo.a(4800, pk.field_W, new String[1]), (byte) -118);
                                return;
                              } else {
                                ((tg) this).field_i.a(0, fo.a(4800, ac.field_x, new String[1]), (byte) -126);
                                ((tg) this).field_i.a(1, fo.a(param0 + -19099, vq.field_g, new String[1]), (byte) -113);
                                return;
                              }
                            } else {
                              ((tg) this).field_i.a(0, fo.a(4800, pk.field_W, new String[1]), (byte) -118);
                              return;
                            }
                          } else {
                            ((tg) this).field_i.a(1, fo.a(4800, oe.field_zb, new String[1]), (byte) -124);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (vu.field_M.field_kc) {
                      if (vu.field_M.field_bc >= 0) {
                        ((tg) this).field_i.a(1, fo.a(4800, wc.field_R, new String[1]), (byte) -103);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((tg) this).field_i.a(1, fo.a(4800, wc.field_R, new String[1]), (byte) -103);
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(byte param0) {
        String var3 = null;
        int var4 = 0;
        au var5 = null;
        au var6 = null;
        au var7 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 <= 46) {
          boolean discarded$1 = this.a(107, -75, (byte) 100);
          if (vu.field_M == null) {
            var7 = ij.b((byte) 74, ((tg) this).field_c);
            if (var7 != null) {
              var3 = var7.field_rc;
              if (!var7.field_Nb) {
                if (!var7.field_Sb) {
                  L0: {
                    if (var7.field_gc) {
                      break L0;
                    } else {
                      if (!var7.field_tc) {
                        break L0;
                      } else {
                        if (!var7.field_kc) {
                          ((tg) this).field_i.a(2, fo.a(4800, ho.field_d, new String[1]), (byte) -123);
                          if (var7.field_gc) {
                            ((tg) this).field_i.a(3, fo.a(4800, eq.field_j, new String[1]), (byte) -119);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (var7.field_Sb) {
                            ((tg) this).field_i.a(2, fo.a(4800, ho.field_d, new String[1]), (byte) -123);
                            if (var7.field_gc) {
                              ((tg) this).field_i.a(3, fo.a(4800, eq.field_j, new String[1]), (byte) -119);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (var7.field_gc) {
                              ((tg) this).field_i.a(3, fo.a(4800, eq.field_j, new String[1]), (byte) -119);
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (var7.field_gc) {
                    ((tg) this).field_i.a(3, fo.a(4800, eq.field_j, new String[1]), (byte) -119);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((tg) this).field_i.a(2, fo.a(4800, ev.field_e, new String[1]), (byte) -114);
                  if (var7.field_gc) {
                    ((tg) this).field_i.a(3, fo.a(4800, eq.field_j, new String[1]), (byte) -119);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ((tg) this).field_i.a(2, fo.a(4800, mg.field_b, new String[1]), (byte) -108);
                ((tg) this).field_i.a(3, fo.a(4800, or.field_a, new String[1]), (byte) -120);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          if (vu.field_M == null) {
            var6 = ij.b((byte) 74, ((tg) this).field_c);
            var5 = var6;
            if (var6 != null) {
              var3 = var6.field_rc;
              if (!var6.field_Nb) {
                if (!var6.field_Sb) {
                  L1: {
                    if (var6.field_gc) {
                      break L1;
                    } else {
                      if (!var6.field_tc) {
                        break L1;
                      } else {
                        if (var6.field_kc) {
                          if (var6.field_Sb) {
                            ((tg) this).field_i.a(2, fo.a(4800, ho.field_d, new String[1]), (byte) -123);
                            if (var6.field_gc) {
                              ((tg) this).field_i.a(3, fo.a(4800, eq.field_j, new String[1]), (byte) -119);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            L2: {
                              if (!var6.field_gc) {
                                break L2;
                              } else {
                                ((tg) this).field_i.a(3, fo.a(4800, eq.field_j, new String[1]), (byte) -119);
                                break L2;
                              }
                            }
                            return;
                          }
                        } else {
                          L3: {
                            ((tg) this).field_i.a(2, fo.a(4800, ho.field_d, new String[1]), (byte) -123);
                            if (!var6.field_gc) {
                              break L3;
                            } else {
                              ((tg) this).field_i.a(3, fo.a(4800, eq.field_j, new String[1]), (byte) -119);
                              break L3;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  if (!var6.field_gc) {
                    return;
                  } else {
                    ((tg) this).field_i.a(3, fo.a(4800, eq.field_j, new String[1]), (byte) -119);
                    return;
                  }
                } else {
                  L4: {
                    ((tg) this).field_i.a(2, fo.a(4800, ev.field_e, new String[1]), (byte) -114);
                    if (!var6.field_gc) {
                      break L4;
                    } else {
                      ((tg) this).field_i.a(3, fo.a(4800, eq.field_j, new String[1]), (byte) -119);
                      break L4;
                    }
                  }
                  return;
                }
              } else {
                ((tg) this).field_i.a(2, fo.a(4800, mg.field_b, new String[1]), (byte) -108);
                ((tg) this).field_i.a(3, fo.a(4800, or.field_a, new String[1]), (byte) -120);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 8) {
          if (18 != param0) {
            if (param0 != 11) {
              if (param0 != 12) {
                if (13 != param0) {
                  if (14 != param0) {
                    if (param0 != 20) {
                      if (param0 != 19) {
                        return false;
                      } else {
                        boolean discarded$1 = me.a(81, ((tg) this).field_m, ((tg) this).field_o, ((tg) this).field_f, ((tg) this).field_e);
                        var4 = 84 % ((param2 - 30) / 54);
                        return true;
                      }
                    } else {
                      np.k(110);
                      var4 = 84 % ((param2 - 30) / 54);
                      return true;
                    }
                  } else {
                    la.b(-26887);
                    var4 = 84 % ((param2 - 30) / 54);
                    return true;
                  }
                } else {
                  ud.b(2, false, ((tg) this).field_e, param1);
                  var4 = 84 % ((param2 - 30) / 54);
                  return true;
                }
              } else {
                ud.b(1, false, ((tg) this).field_e, param1);
                var4 = 84 % ((param2 - 30) / 54);
                return true;
              }
            } else {
              ud.b(0, false, ((tg) this).field_e, param1);
              var4 = 84 % ((param2 - 30) / 54);
              return true;
            }
          } else {
            og.a(((tg) this).field_f, 1, ((tg) this).field_m);
            var4 = 84 % ((param2 - 30) / 54);
            return true;
          }
        } else {
          gk.a(-23503, ((tg) this).field_m, ((tg) this).field_f);
          var4 = 84 % ((param2 - 30) / 54);
          return true;
        }
    }

    private final String b(int param0) {
        String var2 = null;
        if (((tg) this).field_h == null) {
            var2 = ((tg) this).field_m;
        } else {
            var2 = ((tg) this).field_h;
        }
        int var3 = -2 / ((param0 - -19) / 43);
        return var2;
    }

    private final boolean a(int param0, byte param1, int param2) {
        if (param0 != 17) {
          return false;
        } else {
          ik.field_b = new i(((tg) this).field_g.field_V, ((tg) this).field_g.field_D, ((tg) this).field_g.field_gb, ((tg) this).field_g.field_ob, param2, jm.field_b, hr.field_m, uc.field_b, eq.field_h, hs.field_H, ms.field_k, ((tg) this).field_m, ((tg) this).field_f);
          return true;
        }
    }

    final void a(byte param0, boolean param1) {
        if (param0 != -108) {
            tg.a(-128);
            ((tg) this).field_i.b(param1, 20);
            return;
        }
        ((tg) this).field_i.b(param1, 20);
    }

    final boolean c(byte param0) {
        if (param0 < -107) {
          if (null != ((tg) this).field_i) {
            if (!((tg) this).field_i.d((byte) 86)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (null != ((tg) this).field_i) {
            if (!((tg) this).field_i.d((byte) 86)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        hl var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((tg) this).field_m) {
                break L1;
              } else {
                L2: {
                  if (((tg) this).field_f != oh.field_H) {
                    break L2;
                  } else {
                    if (2 != param2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (2 == th.field_a) {
                  L3: {
                    var7 = this.b(-97);
                    var4_ref = var7;
                    var5 = lg.a(((tg) this).field_m, (byte) -34);
                    int discarded$2 = -3404;
                    var6 = si.a(((tg) this).field_m) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 != 0) {
                        break L3;
                      } else {
                        ((tg) this).field_i.a(4, fo.a(4800, vf.field_l, new String[1]), (byte) -125);
                        ((tg) this).field_i.a(6, fo.a(4800, sq.field_o, new String[1]), (byte) -100);
                        if (param0 == null) {
                          break L3;
                        } else {
                          if (param2 == 2) {
                            break L3;
                          } else {
                            if (bb.field_a) {
                              break L3;
                            } else {
                              ((tg) this).field_o = param0;
                              ((tg) this).field_i.a(19, fo.a(4800, kt.field_m, new String[1]), (byte) -115);
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
                        if (fs.a((byte) 111, ((tg) this).field_m)) {
                          break L5;
                        } else {
                          if (!bb.field_a) {
                            L6: {
                              if (vi.field_d) {
                                break L6;
                              } else {
                                ((tg) this).field_i.a(8, fo.a(4800, mi.field_k, new String[1]), (byte) -114);
                                break L6;
                              }
                            }
                            ((tg) this).field_i.a(18, fo.a(param1 ^ 4807, jc.field_w, new String[1]), (byte) -111);
                            if (param0 != null) {
                              ((tg) this).field_o = param0;
                              ((tg) this).field_i.a(19, fo.a(4800, kt.field_m, new String[1]), (byte) -115);
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                      break L4;
                    }
                  }
                  if (var6 != 0) {
                    ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L7: {
              if (param1 == 7) {
                break L7;
              } else {
                String discarded$3 = this.b(-101);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("tg.D(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (null == ((tg) this).field_m) {
            break L0;
          } else {
            if (~((tg) this).field_f == ~oh.field_H) {
              break L0;
            } else {
              var3 = this.b(96);
              var2 = var3;
              ((tg) this).field_i.a(17, fo.a(4800, wg.field_e, new String[1]), (byte) -127);
              break L0;
            }
          }
        }
        if (param0 < 42) {
          field_l = null;
          return;
        } else {
          return;
        }
    }

    tg(je param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            ((tg) this).field_i = new np(qb.field_h);
            ((tg) this).field_o = param6;
            ((tg) this).field_c = param4;
            ((tg) this).field_f = param1;
            ((tg) this).field_h = param3;
            ((tg) this).field_g = param0;
            ((tg) this).field_m = param2;
            ((tg) this).field_e = param5;
            param0.field_rb = true;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "tg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Members";
        field_l = "Most buildings";
        field_k = 1;
    }
}

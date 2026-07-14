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
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 != -1) {
            if (-2 != param0) {
              if (-3 != (param0 ^ -1)) {
                if (param0 == 3) {
                  pq.a(-119, ((tg) this).field_c, param2);
                  if (param1 != 101) {
                    ((tg) this).field_f = -51L;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (-11 == (param0 ^ -1)) {
                    ov.a(param2, 3, ((tg) this).field_c);
                    if (param1 != 101) {
                      ((tg) this).field_f = -51L;
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    if ((param0 ^ -1) == -16) {
                      bw.a(param2, ((tg) this).field_c, (byte) -116);
                      if (param1 != 101) {
                        ((tg) this).field_f = -51L;
                        return true;
                      } else {
                        return true;
                      }
                    } else {
                      if ((param0 ^ -1) == -17) {
                        bw.a(param2, 0, (byte) -116);
                        if (param1 == 101) {
                          return true;
                        } else {
                          ((tg) this).field_f = -51L;
                          return true;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                }
              } else {
                ag.a(param2, -48, ((tg) this).field_c);
                if (param1 == 101) {
                  return true;
                } else {
                  ((tg) this).field_f = -51L;
                  return true;
                }
              }
            } else {
              te.a(param2, ((tg) this).field_f, (byte) 108);
              break L0;
            }
          } else {
            ra.a(((tg) this).field_f, param2, 6);
            break L0;
          }
        }
        if (param1 != 101) {
          ((tg) this).field_f = -51L;
          return true;
        } else {
          return true;
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        var4 = null;
        if (!param1) {
          if (param2 != 4) {
            if ((param2 ^ -1) != -6) {
              if (-7 == (param2 ^ -1)) {
                var9 = se.a(((tg) this).field_m, param0, -127);
                if (var9 != null) {
                  ta.a((String) null, 2, -18119, ((tg) this).field_m, var9, 0);
                  return true;
                } else {
                  return true;
                }
              } else {
                if (param2 == 7) {
                  var8 = fq.a(param0, ((tg) this).field_h, false, ((tg) this).field_m);
                  if (var8 != null) {
                    ta.a((String) null, 2, -18119, ((tg) this).field_m, var8, 0);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              var7 = nw.a(((tg) this).field_m, (byte) -27, param0);
              if (var7 != null) {
                ta.a((String) null, 2, -18119, ((tg) this).field_m, var7, 0);
                return true;
              } else {
                return true;
              }
            }
          } else {
            var6 = op.a(20, ((tg) this).field_m, param0);
            if (var6 == null) {
              return true;
            } else {
              ta.a((String) null, 2, -18119, ((tg) this).field_m, var6, 0);
              return true;
            }
          }
        } else {
          L0: {
            ((tg) this).b((byte) 101);
            if (param2 != 4) {
              if (param2 != -6) {
                if (-7 == param2) {
                  var4 = se.a(((tg) this).field_m, param0, -127);
                  break L0;
                } else {
                  if (param2 == 7) {
                    var5 = fq.a(param0, ((tg) this).field_h, false, ((tg) this).field_m);
                    if (var5 == null) {
                      return true;
                    } else {
                      ta.a((String) null, 2, -18119, ((tg) this).field_m, var5, 0);
                      return true;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                var4 = nw.a(((tg) this).field_m, (byte) -27, param0);
                break L0;
              }
            } else {
              var4 = op.a(20, ((tg) this).field_m, param0);
              break L0;
            }
          }
          if (var4 == null) {
            return true;
          } else {
            ta.a((String) null, 2, -18119, ((tg) this).field_m, var4, 0);
            return true;
          }
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, boolean param4) {
        if (param1 <= 60) {
            return true;
        }
        int var6 = ((tg) this).field_i.a((byte) 116, param4);
        if (!((var6 ^ -1) != 1)) {
            return false;
        }
        boolean discarded$0 = this.b(var6, (byte) 101, param0);
        boolean discarded$1 = this.a(param2, false, var6);
        boolean discarded$2 = this.a(var6, param2, (byte) -81);
        boolean discarded$3 = this.a(var6, (byte) 113, param3);
        return true;
    }

    final void a(mo param0, int param1) {
        if (!param0.field_f) {
          ((tg) this).field_e = param0.field_b;
          if (param1 == param0.field_b) {
            if (ol.field_B != 0) {
              L0: {
                ((tg) this).field_i.a(13, ou.field_g, (byte) -116);
                if (param0.field_b != -2) {
                  break L0;
                } else {
                  L1: {
                    if (-1 == va.field_D) {
                      ((tg) this).field_i.a(12, jj.field_b, (byte) -108);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((tg) this).field_i.a(13, fa.field_c, (byte) -121);
                  break L0;
                }
              }
              L2: {
                if (param0.field_b != 2) {
                  break L2;
                } else {
                  L3: {
                    if (-1 == (cd.field_c ^ -1)) {
                      ((tg) this).field_i.a(12, hw.field_C, (byte) -120);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((tg) this).field_i.a(13, ai.field_R, (byte) -119);
                  break L2;
                }
              }
              return;
            } else {
              ((tg) this).field_i.a(12, pk.field_S, (byte) -110);
              L4: {
                ((tg) this).field_i.a(13, ou.field_g, (byte) -116);
                if (param0.field_b != -2) {
                  break L4;
                } else {
                  L5: {
                    if (-1 == va.field_D) {
                      ((tg) this).field_i.a(12, jj.field_b, (byte) -108);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((tg) this).field_i.a(13, fa.field_c, (byte) -121);
                  break L4;
                }
              }
              L6: {
                if (param0.field_b != 2) {
                  break L6;
                } else {
                  L7: {
                    if (-1 == (cd.field_c ^ -1)) {
                      ((tg) this).field_i.a(12, hw.field_C, (byte) -120);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((tg) this).field_i.a(13, ai.field_R, (byte) -119);
                  break L6;
                }
              }
              return;
            }
          } else {
            L8: {
              if (param0.field_b != -2) {
                break L8;
              } else {
                L9: {
                  if (-1 == va.field_D) {
                    ((tg) this).field_i.a(12, jj.field_b, (byte) -108);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((tg) this).field_i.a(13, fa.field_c, (byte) -121);
                break L8;
              }
            }
            L10: {
              if (param0.field_b != 2) {
                break L10;
              } else {
                L11: {
                  if (-1 == (cd.field_c ^ -1)) {
                    ((tg) this).field_i.a(12, hw.field_C, (byte) -120);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ((tg) this).field_i.a(13, ai.field_R, (byte) -119);
                break L10;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(kl param0, int param1, boolean param2, kl param3) {
        bk.a(param2, fp.field_Lb, eq.field_h, (ka) (Object) gm.field_f, ms.field_k, -106, ke.field_e, im.field_x, qc.field_e, ri.field_b, bd.field_o, rd.field_e);
        dh.field_n = fk.a("chatfilter", (byte) -125, param3, "lobby");
        co.field_k[0] = ar.field_v;
        co.field_k[1] = wg.field_a;
        co.field_k[param1] = cd.field_d;
        mu.a((ka) (Object) t.field_a, param1 + -2, param0);
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
                if (vu.b(false)) {
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
                if (vu.b(false)) {
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
        if ((param0 ^ -1) != -9) {
          if (18 != param0) {
            if (param0 != 11) {
              if (param0 != 12) {
                if (13 != param0) {
                  if (14 != param0) {
                    if (-21 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -20) {
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
        if (param1 > 38) {
          if ((param0 ^ -1) == -18) {
            ik.field_b = new i(((tg) this).field_g.field_V, ((tg) this).field_g.field_D, ((tg) this).field_g.field_gb, ((tg) this).field_g.field_ob, param2, jm.field_b, hr.field_m, uc.field_b, eq.field_h, hs.field_H, ms.field_k, ((tg) this).field_m, ((tg) this).field_f);
            return true;
          } else {
            return false;
          }
        } else {
          tg.a(-18);
          if ((param0 ^ -1) != -18) {
            return false;
          } else {
            ik.field_b = new i(((tg) this).field_g.field_V, ((tg) this).field_g.field_D, ((tg) this).field_g.field_gb, ((tg) this).field_g.field_ob, param2, jm.field_b, hr.field_m, uc.field_b, eq.field_h, hs.field_H, ms.field_k, ((tg) this).field_m, ((tg) this).field_f);
            return true;
          }
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
        String var4 = null;
        hl var5 = null;
        int var6 = 0;
        String var7 = null;
        if (null != ((tg) this).field_m) {
          if (((tg) this).field_f == oh.field_H) {
            if (2 == param2) {
              L0: {
                if (2 == th.field_a) {
                  L1: {
                    var7 = this.b(-97);
                    var4 = var7;
                    var5 = lg.a(((tg) this).field_m, (byte) -34);
                    var6 = si.a(((tg) this).field_m, -3404) ? 1 : 0;
                    if (var5 != null) {
                      break L1;
                    } else {
                      if (var6 != 0) {
                        break L1;
                      } else {
                        ((tg) this).field_i.a(4, fo.a(4800, vf.field_l, new String[1]), (byte) -125);
                        ((tg) this).field_i.a(6, fo.a(4800, sq.field_o, new String[1]), (byte) -100);
                        if (param0 == null) {
                          break L1;
                        } else {
                          if (param2 == 2) {
                            break L1;
                          } else {
                            if (bb.field_a) {
                              break L1;
                            } else {
                              L2: {
                                ((tg) this).field_o = param0;
                                ((tg) this).field_i.a(19, fo.a(4800, kt.field_m, new String[1]), (byte) -115);
                                if (var5 == null) {
                                  break L2;
                                } else {
                                  L3: {
                                    if (fs.a((byte) 111, ((tg) this).field_m)) {
                                      break L3;
                                    } else {
                                      if (!bb.field_a) {
                                        L4: {
                                          if (vi.field_d) {
                                            break L4;
                                          } else {
                                            ((tg) this).field_i.a(8, fo.a(4800, mi.field_k, new String[1]), (byte) -114);
                                            break L4;
                                          }
                                        }
                                        ((tg) this).field_i.a(18, fo.a(param1 ^ 4807, jc.field_w, new String[1]), (byte) -111);
                                        if (param0 != null) {
                                          ((tg) this).field_o = param0;
                                          ((tg) this).field_i.a(19, fo.a(4800, kt.field_m, new String[1]), (byte) -115);
                                          break L3;
                                        } else {
                                          ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                                          L5: {
                                            if (param1 == 7) {
                                              break L5;
                                            } else {
                                              String discarded$15 = this.b(-101);
                                              break L5;
                                            }
                                          }
                                          return;
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                                  break L2;
                                }
                              }
                              L6: {
                                if (var6 != 0) {
                                  ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              if (param1 != 7) {
                                String discarded$16 = this.b(-101);
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (var5 == null) {
                      break L7;
                    } else {
                      L8: {
                        if (fs.a((byte) 111, ((tg) this).field_m)) {
                          break L8;
                        } else {
                          if (!bb.field_a) {
                            if (vi.field_d) {
                              ((tg) this).field_i.a(18, fo.a(param1 ^ 4807, jc.field_w, new String[1]), (byte) -111);
                              if (param0 != null) {
                                ((tg) this).field_o = param0;
                                ((tg) this).field_i.a(19, fo.a(4800, kt.field_m, new String[1]), (byte) -115);
                                break L8;
                              } else {
                                L9: {
                                  ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                                  if (var6 != 0) {
                                    ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                if (param1 != 7) {
                                  String discarded$17 = this.b(-101);
                                  return;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              L10: {
                                ((tg) this).field_i.a(8, fo.a(4800, mi.field_k, new String[1]), (byte) -114);
                                ((tg) this).field_i.a(18, fo.a(param1 ^ 4807, jc.field_w, new String[1]), (byte) -111);
                                if (param0 != null) {
                                  ((tg) this).field_o = param0;
                                  ((tg) this).field_i.a(19, fo.a(4800, kt.field_m, new String[1]), (byte) -115);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L11: {
                                ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                                if (var6 != 0) {
                                  ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              if (param1 != 7) {
                                String discarded$18 = this.b(-101);
                                return;
                              } else {
                                return;
                              }
                            }
                          } else {
                            L12: {
                              ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                              if (var6 != 0) {
                                ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            if (param1 != 7) {
                              String discarded$19 = this.b(-101);
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                      break L7;
                    }
                  }
                  if (var6 != 0) {
                    ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                    break L0;
                  } else {
                    if (param1 != 7) {
                      String discarded$20 = this.b(-101);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  break L0;
                }
              }
              if (param1 == 7) {
                return;
              } else {
                String discarded$21 = this.b(-101);
                return;
              }
            } else {
              if (param1 != 7) {
                String discarded$22 = this.b(-101);
                return;
              } else {
                return;
              }
            }
          } else {
            L13: {
              if (2 == th.field_a) {
                L14: {
                  var7 = this.b(-97);
                  var4 = var7;
                  var5 = lg.a(((tg) this).field_m, (byte) -34);
                  var6 = si.a(((tg) this).field_m, -3404) ? 1 : 0;
                  if (var5 != null) {
                    break L14;
                  } else {
                    if (var6 != 0) {
                      break L14;
                    } else {
                      ((tg) this).field_i.a(4, fo.a(4800, vf.field_l, new String[1]), (byte) -125);
                      ((tg) this).field_i.a(6, fo.a(4800, sq.field_o, new String[1]), (byte) -100);
                      if (param0 == null) {
                        break L14;
                      } else {
                        if (param2 == 2) {
                          break L14;
                        } else {
                          if (bb.field_a) {
                            break L14;
                          } else {
                            L15: {
                              ((tg) this).field_o = param0;
                              ((tg) this).field_i.a(19, fo.a(4800, kt.field_m, new String[1]), (byte) -115);
                              if (var5 == null) {
                                break L15;
                              } else {
                                L16: {
                                  if (fs.a((byte) 111, ((tg) this).field_m)) {
                                    break L16;
                                  } else {
                                    if (!bb.field_a) {
                                      L17: {
                                        if (vi.field_d) {
                                          break L17;
                                        } else {
                                          ((tg) this).field_i.a(8, fo.a(4800, mi.field_k, new String[1]), (byte) -114);
                                          break L17;
                                        }
                                      }
                                      ((tg) this).field_i.a(18, fo.a(param1 ^ 4807, jc.field_w, new String[1]), (byte) -111);
                                      if (param0 != null) {
                                        ((tg) this).field_o = param0;
                                        ((tg) this).field_i.a(19, fo.a(4800, kt.field_m, new String[1]), (byte) -115);
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                                break L15;
                              }
                            }
                            L18: {
                              if (var6 != 0) {
                                ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (param1 == 7) {
                                break L19;
                              } else {
                                String discarded$23 = this.b(-101);
                                break L19;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                L20: {
                  if (var5 == null) {
                    break L20;
                  } else {
                    L21: {
                      if (fs.a((byte) 111, ((tg) this).field_m)) {
                        break L21;
                      } else {
                        if (!bb.field_a) {
                          if (vi.field_d) {
                            ((tg) this).field_i.a(18, fo.a(param1 ^ 4807, jc.field_w, new String[1]), (byte) -111);
                            if (param0 != null) {
                              ((tg) this).field_o = param0;
                              ((tg) this).field_i.a(19, fo.a(4800, kt.field_m, new String[1]), (byte) -115);
                              break L21;
                            } else {
                              L22: {
                                ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                                if (var6 != 0) {
                                  ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              L23: {
                                if (param1 == 7) {
                                  break L23;
                                } else {
                                  String discarded$24 = this.b(-101);
                                  break L23;
                                }
                              }
                              return;
                            }
                          } else {
                            L24: {
                              ((tg) this).field_i.a(8, fo.a(4800, mi.field_k, new String[1]), (byte) -114);
                              ((tg) this).field_i.a(18, fo.a(param1 ^ 4807, jc.field_w, new String[1]), (byte) -111);
                              if (param0 != null) {
                                ((tg) this).field_o = param0;
                                ((tg) this).field_i.a(19, fo.a(4800, kt.field_m, new String[1]), (byte) -115);
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            L25: {
                              ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                              if (var6 != 0) {
                                ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            L26: {
                              if (param1 == 7) {
                                break L26;
                              } else {
                                String discarded$25 = this.b(-101);
                                break L26;
                              }
                            }
                            return;
                          }
                        } else {
                          L27: {
                            ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                            if (var6 != 0) {
                              ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            if (param1 == 7) {
                              break L28;
                            } else {
                              String discarded$26 = this.b(-101);
                              break L28;
                            }
                          }
                          return;
                        }
                      }
                    }
                    ((tg) this).field_i.a(5, fo.a(4800, na.field_K, new String[1]), (byte) -111);
                    break L20;
                  }
                }
                if (var6 != 0) {
                  ((tg) this).field_i.a(7, fo.a(4800, oa.field_E, new String[1]), (byte) -102);
                  break L13;
                } else {
                  L29: {
                    if (param1 == 7) {
                      break L29;
                    } else {
                      String discarded$27 = this.b(-101);
                      break L29;
                    }
                  }
                  return;
                }
              } else {
                break L13;
              }
            }
            if (param1 != 7) {
              String discarded$28 = this.b(-101);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != 7) {
            String discarded$29 = this.b(-101);
            return;
          } else {
            return;
          }
        }
    }

    final void b(byte param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (null == ((tg) this).field_m) {
            break L0;
          } else {
            if ((((tg) this).field_f ^ -1L) == (oh.field_H ^ -1L)) {
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
        ((tg) this).field_i = new np(qb.field_h);
        ((tg) this).field_o = param6;
        ((tg) this).field_c = param4;
        ((tg) this).field_f = param1;
        ((tg) this).field_h = param3;
        ((tg) this).field_g = param0;
        ((tg) this).field_m = param2;
        ((tg) this).field_e = param5;
        param0.field_rb = true;
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

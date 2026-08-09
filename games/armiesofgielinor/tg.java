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
        int var5;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 != 0) {
            if (-2 != (param0 ^ -1)) {
              if (-3 != (param0 ^ -1)) {
                if (param0 == 3) {
                  pq.a(-119, this.field_c, param2);
                  if (param1 != 101) {
                    this.field_f = -51L;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (-11 == (param0 ^ -1)) {
                    ov.a(param2, 3, this.field_c);
                    if (param1 != 101) {
                      this.field_f = -51L;
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    if ((param0 ^ -1) == -16) {
                      bw.a(param2, this.field_c, (byte) -116);
                      if (param1 != 101) {
                        this.field_f = -51L;
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
                          this.field_f = -51L;
                          return true;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                }
              } else {
                ag.a(param2, -48, this.field_c);
                if (param1 == 101) {
                  return true;
                } else {
                  this.field_f = -51L;
                  return true;
                }
              }
            } else {
              te.a(param2, this.field_f, (byte) 108);
              break L0;
            }
          } else {
            ra.a(this.field_f, param2, 6);
            break L0;
          }
        }
        if (param1 != 101) {
          this.field_f = -51L;
          return true;
        } else {
          return true;
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        Object var4;
        String var4_ref;
        String var5;
        String var6;
        String var7;
        String var8;
        String var9;
        var4 = null;
        if (!param1) {
          if (param2 != 4) {
            if ((param2 ^ -1) != -6) {
              if (-7 == (param2 ^ -1)) {
                var9 = se.a(this.field_m, param0, -127);
                if (var9 != null) {
                  ta.a((String) null, 2, -18119, this.field_m, var9, 0);
                  return true;
                } else {
                  return true;
                }
              } else {
                if (param2 == 7) {
                  var8 = fq.a(param0, this.field_h, false, this.field_m);
                  if (var8 != null) {
                    ta.a((String) null, 2, -18119, this.field_m, var8, 0);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              var7 = nw.a(this.field_m, (byte) -27, param0);
              if (var7 != null) {
                ta.a((String) null, 2, -18119, this.field_m, var7, 0);
                return true;
              } else {
                return true;
              }
            }
          } else {
            var6 = op.a(20, this.field_m, param0);
            if (var6 == null) {
              return true;
            } else {
              ta.a((String) null, 2, -18119, this.field_m, var6, 0);
              return true;
            }
          }
        } else {
          L0: {
            this.b((byte) 101);
            if (param2 != 4) {
              if ((param2 ^ -1) != -6) {
                if (-7 == (param2 ^ -1)) {
                  var4_ref = se.a(this.field_m, param0, -127);
                  break L0;
                } else {
                  if (param2 == 7) {
                    var5 = fq.a(param0, this.field_h, false, this.field_m);
                    if (var5 == null) {
                      return true;
                    } else {
                      ta.a((String) null, 2, -18119, this.field_m, var5, 0);
                      return true;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                var4_ref = nw.a(this.field_m, (byte) -27, param0);
                break L0;
              }
            } else {
              var4_ref = op.a(20, this.field_m, param0);
              break L0;
            }
          }
          if (var4_ref == null) {
            return true;
          } else {
            ta.a((String) null, 2, -18119, this.field_m, var4_ref, 0);
            return true;
          }
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, boolean param4) {
        if (param1 <= 60) {
            return true;
        }
        int var6 = this.field_i.a((byte) 116, param4);
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
        if (param0.field_f) {
            return;
        }
        try {
            this.field_e = param0.field_b;
            if (param1 == param0.field_b) {
                if (ol.field_B == 0) {
                    this.field_i.a(12, pk.field_S, (byte) -110);
                }
                this.field_i.a(13, ou.field_g, (byte) -116);
            }
            if ((param0.field_b ^ -1) == -2) {
                if (!(-1 != (va.field_D ^ -1))) {
                    this.field_i.a(12, jj.field_b, (byte) -108);
                }
                this.field_i.a(13, fa.field_c, (byte) -121);
            }
            if (param0.field_b == 2) {
                if (!(-1 != (cd.field_c ^ -1))) {
                    this.field_i.a(12, hw.field_C, (byte) -120);
                }
                this.field_i.a(13, ai.field_R, (byte) -119);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(kl param0, int param1, boolean param2, kl param3) {
        try {
            bk.a(param2, fp.field_Lb, eq.field_h, gm.field_f, ms.field_k, -106, ke.field_e, im.field_x, qc.field_e, ri.field_b, bd.field_o, rd.field_e);
            dh.field_n = fk.a("chatfilter", (byte) -125, param3, "lobby");
            co.field_k[0] = ar.field_v;
            co.field_k[1] = wg.field_a;
            co.field_k[param1] = cd.field_d;
            mu.a(t.field_a, param1 + -2, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tg.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        kl var2;
        if (param0 > -15) {
          var2 = (kl) null;
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
        of var4;
        String var5;
        int var6;
        of var7;
        of var10;
        of var11;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 23899) {
          this.field_e = 127;
          if (this.field_m != null) {
            if (this.field_f != oh.field_H) {
              if (null != vu.field_M) {
                if (vu.b(false)) {
                  var11 = tr.a((byte) 121, this.field_f);
                  var4 = hr.a(this.field_f, -86);
                  var5 = this.b(param0 + -24004);
                  if (var4 == null) {
                    if (var11 != null) {
                      if (vu.field_M.field_tc) {
                        if (vu.field_M.field_nc > vu.field_M.field_Ub) {
                          if (!var11.field_Wb) {
                            if (param1) {
                              if (var11.field_Ub) {
                                this.field_i.a(0, fo.a(4800, ac.field_x, new String[]{var5}), (byte) -126);
                                this.field_i.a(1, fo.a(param0 + -19099, vq.field_g, new String[]{var5}), (byte) -113);
                                return;
                              } else {
                                this.field_i.a(0, fo.a(4800, pk.field_W, new String[]{var5}), (byte) -118);
                                return;
                              }
                            } else {
                              this.field_i.a(0, fo.a(4800, pk.field_W, new String[]{var5}), (byte) -118);
                              return;
                            }
                          } else {
                            this.field_i.a(1, fo.a(4800, oe.field_zb, new String[]{var5}), (byte) -124);
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
                        this.field_i.a(1, fo.a(4800, wc.field_R, new String[]{var5}), (byte) -103);
                        return;
                      }
                    } else {
                      this.field_i.a(1, fo.a(4800, wc.field_R, new String[]{var5}), (byte) -103);
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
          if (this.field_m != null) {
            if (this.field_f != oh.field_H) {
              if (null != vu.field_M) {
                if (vu.b(false)) {
                  var10 = tr.a((byte) 121, this.field_f);
                  var7 = var10;
                  var4 = hr.a(this.field_f, -86);
                  var5 = this.b(param0 + -24004);
                  if (var4 == null) {
                    if (var10 != null) {
                      if (vu.field_M.field_tc) {
                        if (vu.field_M.field_nc > vu.field_M.field_Ub) {
                          if (!var10.field_Wb) {
                            if (param1) {
                              if (!var10.field_Ub) {
                                this.field_i.a(0, fo.a(4800, pk.field_W, new String[]{var5}), (byte) -118);
                                return;
                              } else {
                                this.field_i.a(0, fo.a(4800, ac.field_x, new String[]{var5}), (byte) -126);
                                this.field_i.a(1, fo.a(param0 + -19099, vq.field_g, new String[]{var5}), (byte) -113);
                                return;
                              }
                            } else {
                              this.field_i.a(0, fo.a(4800, pk.field_W, new String[]{var5}), (byte) -118);
                              return;
                            }
                          } else {
                            this.field_i.a(1, fo.a(4800, oe.field_zb, new String[]{var5}), (byte) -124);
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
                        this.field_i.a(1, fo.a(4800, wc.field_R, new String[]{var5}), (byte) -103);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_i.a(1, fo.a(4800, wc.field_R, new String[]{var5}), (byte) -103);
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
        boolean discarded$0 = false;
        String var3;
        int var4;
        au var5;
        au var6;
        au var7;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 <= 46) {
          discarded$0 = this.a(107, -75, (byte) 100);
          if (vu.field_M == null) {
            var7 = ij.b((byte) 74, this.field_c);
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
                          this.field_i.a(2, fo.a(4800, ho.field_d, new String[]{var3}), (byte) -123);
                          if (var7.field_gc) {
                            this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (var7.field_Sb) {
                            this.field_i.a(2, fo.a(4800, ho.field_d, new String[]{var3}), (byte) -123);
                            if (var7.field_gc) {
                              this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (var7.field_gc) {
                              this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
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
                    this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_i.a(2, fo.a(4800, ev.field_e, new String[]{var3}), (byte) -114);
                  if (var7.field_gc) {
                    this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                this.field_i.a(2, fo.a(4800, mg.field_b, new String[]{var3}), (byte) -108);
                this.field_i.a(3, fo.a(4800, or.field_a, new String[]{var3}), (byte) -120);
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
            var6 = ij.b((byte) 74, this.field_c);
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
                            this.field_i.a(2, fo.a(4800, ho.field_d, new String[]{var3}), (byte) -123);
                            if (var6.field_gc) {
                              this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            L2: {
                              if (!var6.field_gc) {
                                break L2;
                              } else {
                                this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
                                break L2;
                              }
                            }
                            return;
                          }
                        } else {
                          L3: {
                            this.field_i.a(2, fo.a(4800, ho.field_d, new String[]{var3}), (byte) -123);
                            if (!var6.field_gc) {
                              break L3;
                            } else {
                              this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
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
                    this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
                    return;
                  }
                } else {
                  L4: {
                    this.field_i.a(2, fo.a(4800, ev.field_e, new String[]{var3}), (byte) -114);
                    if (!var6.field_gc) {
                      break L4;
                    } else {
                      this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
                      break L4;
                    }
                  }
                  return;
                }
              } else {
                this.field_i.a(2, fo.a(4800, mg.field_b, new String[]{var3}), (byte) -108);
                this.field_i.a(3, fo.a(4800, or.field_a, new String[]{var3}), (byte) -120);
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
        int var4;
        int var5;
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
                        me.a(81, this.field_m, this.field_o, this.field_f, this.field_e);
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
                  ud.b(2, false, this.field_e, param1);
                  var4 = 84 % ((param2 - 30) / 54);
                  return true;
                }
              } else {
                ud.b(1, false, this.field_e, param1);
                var4 = 84 % ((param2 - 30) / 54);
                return true;
              }
            } else {
              ud.b(0, false, this.field_e, param1);
              var4 = 84 % ((param2 - 30) / 54);
              return true;
            }
          } else {
            og.a(this.field_f, 1, this.field_m);
            var4 = 84 % ((param2 - 30) / 54);
            return true;
          }
        } else {
          gk.a(-23503, this.field_m, this.field_f);
          var4 = 84 % ((param2 - 30) / 54);
          return true;
        }
    }

    private final String b(int param0) {
        String var2 = null;
        if (this.field_h == null) {
            var2 = this.field_m;
        } else {
            var2 = this.field_h;
        }
        int var3 = -2 / ((param0 - -19) / 43);
        return var2;
    }

    private final boolean a(int param0, byte param1, int param2) {
        if (param1 <= 38) {
            tg.a(-18);
            if ((param0 ^ -1) == -18) {
                ik.field_b = new i(this.field_g.field_V, this.field_g.field_D, this.field_g.field_gb, this.field_g.field_ob, param2, jm.field_b, hr.field_m, uc.field_b, eq.field_h, hs.field_H, ms.field_k, this.field_m, this.field_f);
                return true;
            }
            return false;
        }
        if (!((param0 ^ -1) != -18)) {
            ik.field_b = new i(this.field_g.field_V, this.field_g.field_D, this.field_g.field_gb, this.field_g.field_ob, param2, jm.field_b, hr.field_m, uc.field_b, eq.field_h, hs.field_H, ms.field_k, this.field_m, this.field_f);
            return true;
        }
        return false;
    }

    final void a(byte param0, boolean param1) {
        if (param0 != -108) {
            tg.a(-128);
            this.field_i.b(param1, 20);
            return;
        }
        this.field_i.b(param1, 20);
    }

    final boolean c(byte param0) {
        if (param0 < -107) {
          if (null != this.field_i) {
            if (!this.field_i.d((byte) 86)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = (ru[]) null;
          if (null != this.field_i) {
            if (!this.field_i.d((byte) 86)) {
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
        String discarded$0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        hl var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_m) {
                break L1;
              } else {
                L2: {
                  if (this.field_f != oh.field_H) {
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
                    var4 = var7;
                    var5 = lg.a(this.field_m, (byte) -34);
                    var6 = si.a(this.field_m, -3404) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 != 0) {
                        break L3;
                      } else {
                        this.field_i.a(4, fo.a(4800, vf.field_l, new String[]{var7}), (byte) -125);
                        this.field_i.a(6, fo.a(4800, sq.field_o, new String[]{var7}), (byte) -100);
                        if (param0 == null) {
                          break L3;
                        } else {
                          if (param2 == 2) {
                            break L3;
                          } else {
                            if (bb.field_a) {
                              break L3;
                            } else {
                              this.field_o = param0;
                              this.field_i.a(19, fo.a(4800, kt.field_m, new String[]{var7}), (byte) -115);
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
                        if (fs.a((byte) 111, this.field_m)) {
                          break L5;
                        } else {
                          if (!bb.field_a) {
                            L6: {
                              if (vi.field_d) {
                                break L6;
                              } else {
                                this.field_i.a(8, fo.a(4800, mi.field_k, new String[]{var7}), (byte) -114);
                                break L6;
                              }
                            }
                            this.field_i.a(18, fo.a(param1 ^ 4807, jc.field_w, new String[]{var7}), (byte) -111);
                            if (param0 != null) {
                              this.field_o = param0;
                              this.field_i.a(19, fo.a(4800, kt.field_m, new String[]{var7}), (byte) -115);
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_i.a(5, fo.a(4800, na.field_K, new String[]{var7}), (byte) -111);
                      break L4;
                    }
                  }
                  if (var6 != 0) {
                    this.field_i.a(7, fo.a(4800, oa.field_E, new String[]{var7}), (byte) -102);
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
                discarded$0 = this.b(-101);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("tg.D(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        String var2;
        String var3;
        L0: {
          if (null == this.field_m) {
            break L0;
          } else {
            if ((this.field_f ^ -1L) == (oh.field_H ^ -1L)) {
              break L0;
            } else {
              var3 = this.b(96);
              var2 = var3;
              this.field_i.a(17, fo.a(4800, wg.field_e, new String[]{var3}), (byte) -127);
              break L0;
            }
          }
        }
        if (param0 < 42) {
          field_l = (String) null;
          return;
        } else {
          return;
        }
    }

    tg(je param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_i = new np(qb.field_h);
            this.field_o = param6;
            this.field_c = param4;
            this.field_f = param1;
            this.field_h = param3;
            this.field_g = param0;
            this.field_m = param2;
            this.field_e = param5;
            param0.field_rb = true;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Members";
        field_l = "Most buildings";
        field_k = 1;
    }
}

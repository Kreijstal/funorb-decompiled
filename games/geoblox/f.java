/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class f extends qf implements pl {
    private boolean field_gb;
    private boolean field_rb;
    private boolean field_mb;
    static int field_ib;
    static gk field_hb;
    static int field_qb;
    static java.awt.Canvas field_kb;
    static String field_nb;
    private boolean field_ob;
    private m field_jb;
    static String[] field_lb;
    private hl field_pb;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public void a(int param0, byte param1, int param2, int param3, hk param4) {
        Object var7 = null;
        if (param1 == -20) {
          if (((f) this).field_ob) {
            pc.a(3, false);
            ((f) this).h((byte) -104);
            return;
          } else {
            eb.a(k.c(111), (byte) 112, "tochangedisplayname.ws");
            return;
          }
        } else {
          var7 = null;
          boolean discarded$4 = f.b((byte) -98, (CharSequence) null);
          if (((f) this).field_ob) {
            pc.a(3, false);
            ((f) this).h((byte) -104);
            return;
          } else {
            eb.a(k.c(111), (byte) 112, "tochangedisplayname.ws");
            return;
          }
        }
    }

    final static void b(String param0, String param1, int param2) {
        if (Geoblox.field_y == null) {
          if (param2 != 7697781) {
            return;
          } else {
            ml.field_t = new pf(param0, param1, false, true, true);
            hk.field_C.b((el) (Object) ml.field_t, -81);
            return;
          }
        } else {
          Geoblox.field_y.h((byte) -104);
          if (param2 != 7697781) {
            return;
          } else {
            ml.field_t = new pf(param0, param1, false, true, true);
            hk.field_C.b((el) (Object) ml.field_t, -81);
            return;
          }
        }
    }

    f(ng param0, m param1, String param2, boolean param3, boolean param4) {
        super(param0, (el) (Object) new ni((f) null, param1, param2), 77, 10, 10);
        ((f) this).field_gb = param4 ? true : false;
        ((f) this).field_ob = false;
        ((f) this).field_rb = false;
        ((f) this).field_jb = param1;
        ((f) this).field_mb = param3 ? true : false;
        ((f) this).field_pb = new hl(13, 50, 274, 30, 15, 2113632, 4210752);
        ((f) this).field_pb.field_C = true;
        ((f) this).b((byte) -61, (el) (Object) ((f) this).field_pb);
    }

    final static void i(byte param0) {
        if (vl.field_n != null) {
          return;
        } else {
          if (param0 < -48) {
            vl.field_n = od.a(480, 0, 0, -3, ka.field_i, 640);
            if (null != vl.field_n) {
              sl.a((java.awt.Canvas) (Object) vl.field_n, 57);
              return;
            } else {
              return;
            }
          } else {
            field_qb = -112;
            vl.field_n = od.a(480, 0, 0, -3, ka.field_i, 640);
            if (null == vl.field_n) {
              return;
            } else {
              sl.a((java.awt.Canvas) (Object) vl.field_n, 57);
              return;
            }
          }
        }
    }

    final void h(byte param0) {
        if (!((f) this).field_I) {
          return;
        } else {
          ((f) this).field_I = false;
          if (param0 == -104) {
            if (!((f) this).field_mb) {
              if (((f) this).field_gb) {
                wl.b(-1);
                return;
              } else {
                return;
              }
            } else {
              tj.b((byte) -65);
              return;
            }
          } else {
            ((f) this).field_ob = true;
            if (!((f) this).field_mb) {
              if (!((f) this).field_gb) {
                return;
              } else {
                wl.b(-1);
                return;
              }
            } else {
              tj.b((byte) -65);
              return;
            }
          }
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        if (param0 == param1) {
            ((f) this).h((byte) -104);
            return true;
        }
        return super.a(param0, param1 + 0, param2, param3);
    }

    public static void n(int param0) {
        field_hb = null;
        int var1 = 44 % ((param0 - -23) / 41);
        field_kb = null;
        field_nb = null;
        field_lb = null;
    }

    final static void o(int param0) {
        float var1 = 0.0f;
        int var1_int = 0;
        int var2 = 0;
        var2 = Geoblox.field_C;
        af.field_c = af.field_c - 1;
        if (0 > af.field_c) {
          L0: {
            af.field_c = 20;
            if (uf.field_b == ka.field_h + 0) {
              uf.field_b = ka.field_h + 3;
              break L0;
            } else {
              var1_int = -ka.field_h + uf.field_b;
              if (1 == jk.field_d) {
                if (-2 <= (var1_int ^ -1)) {
                  L1: {
                    if (2 != jk.field_d) {
                      break L1;
                    } else {
                      if (5 <= var1_int) {
                        break L1;
                      } else {
                        uf.field_b = uf.field_b + 1;
                        break L0;
                      }
                    }
                  }
                  if (0 != jk.field_d) {
                    L2: {
                      if (0 == jk.field_d) {
                        break L2;
                      } else {
                        if (0 != jk.field_d) {
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (3 >= var1_int) {
                      break L0;
                    } else {
                      uf.field_b = uf.field_b - 1;
                      break L0;
                    }
                  } else {
                    if (0 != jk.field_d) {
                      break L0;
                    } else {
                      if (3 >= var1_int) {
                        break L0;
                      } else {
                        uf.field_b = uf.field_b - 1;
                        break L0;
                      }
                    }
                  }
                } else {
                  uf.field_b = uf.field_b - 1;
                  break L0;
                }
              } else {
                L3: {
                  L4: {
                    if (2 != jk.field_d) {
                      break L4;
                    } else {
                      if (5 <= var1_int) {
                        break L4;
                      } else {
                        uf.field_b = uf.field_b + 1;
                        break L3;
                      }
                    }
                  }
                  if (0 != jk.field_d) {
                    L5: {
                      if (0 == jk.field_d) {
                        break L5;
                      } else {
                        if (0 != jk.field_d) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (3 >= var1_int) {
                      break L3;
                    } else {
                      uf.field_b = uf.field_b - 1;
                      break L3;
                    }
                  } else {
                    if (0 != jk.field_d) {
                      break L3;
                    } else {
                      if (3 >= var1_int) {
                        break L3;
                      } else {
                        uf.field_b = uf.field_b - 1;
                        break L3;
                      }
                    }
                  }
                }
                L6: {
                  pa.field_g = pa.field_g - 1;
                  gi.field_e = gi.field_e + 1;
                  if (30 <= gi.field_e % param0) {
                    break L6;
                  } else {
                    uf.field_b = 0 + ka.field_h;
                    break L6;
                  }
                }
                L7: {
                  if (!el.field_o.field_x) {
                    break L7;
                  } else {
                    if (gi.field_e % 18 == -1) {
                      if (-1 == gg.field_b) {
                        if (pf.field_D) {
                          L8: {
                            gg.field_b = gg.field_b + 1;
                            g.field_j = 0;
                            fd.a(300, fl.field_c[22], false, j.field_gb);
                            g.field_j = g.field_j + 1;
                            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                            wa.field_a = wa.field_a - 1;
                            if (-1 <= wa.field_a) {
                              break L8;
                            } else {
                              ha.field_g = wa.field_a % 15 % 2;
                              break L8;
                            }
                          }
                          L9: {
                            jf.field_j = jf.field_j - 1;
                            if (-1 >= jf.field_j) {
                              break L9;
                            } else {
                              rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                              break L9;
                            }
                          }
                          return;
                        } else {
                          L10: {
                            g.field_j = g.field_j % 4;
                            ul.field_a = vf.field_H[g.field_j];
                            g.field_j = g.field_j + 1;
                            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                            wa.field_a = wa.field_a - 1;
                            if (-1 <= wa.field_a) {
                              break L10;
                            } else {
                              ha.field_g = wa.field_a % 15 % 2;
                              break L10;
                            }
                          }
                          L11: {
                            jf.field_j = jf.field_j - 1;
                            if (-1 >= jf.field_j) {
                              break L11;
                            } else {
                              rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                              break L11;
                            }
                          }
                          return;
                        }
                      } else {
                        if ((gg.field_b ^ -1) == -2) {
                          if (ok.field_a.length > g.field_j) {
                            L12: {
                              ul.field_a = ok.field_a[g.field_j];
                              g.field_j = g.field_j + 1;
                              var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                              wa.field_a = wa.field_a - 1;
                              if (-1 <= wa.field_a) {
                                break L12;
                              } else {
                                ha.field_g = wa.field_a % 15 % 2;
                                break L12;
                              }
                            }
                            L13: {
                              jf.field_j = jf.field_j - 1;
                              if (-1 >= jf.field_j) {
                                break L13;
                              } else {
                                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                                break L13;
                              }
                            }
                            return;
                          } else {
                            L14: {
                              gg.field_b = gg.field_b + 1;
                              pa.field_g = 200;
                              g.field_j = g.field_j + 1;
                              var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                              wa.field_a = wa.field_a - 1;
                              if (-1 <= wa.field_a) {
                                break L14;
                              } else {
                                ha.field_g = wa.field_a % 15 % 2;
                                break L14;
                              }
                            }
                            L15: {
                              jf.field_j = jf.field_j - 1;
                              if (-1 >= jf.field_j) {
                                break L15;
                              } else {
                                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                                break L15;
                              }
                            }
                            return;
                          }
                        } else {
                          g.field_j = g.field_j % 4;
                          ul.field_a = ld.field_b[g.field_j];
                          g.field_j = g.field_j + 1;
                          break L7;
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                wa.field_a = wa.field_a - 1;
                if (-1 <= wa.field_a) {
                  jf.field_j = jf.field_j - 1;
                  if (-1 > (jf.field_j ^ -1)) {
                    rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                    return;
                  } else {
                    return;
                  }
                } else {
                  L16: {
                    ha.field_g = wa.field_a % 15 % 2;
                    jf.field_j = jf.field_j - 1;
                    if (-1 >= jf.field_j) {
                      break L16;
                    } else {
                      rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                      break L16;
                    }
                  }
                  return;
                }
              }
            }
          }
          L17: {
            pa.field_g = pa.field_g - 1;
            gi.field_e = gi.field_e + 1;
            if (30 <= gi.field_e % param0) {
              break L17;
            } else {
              uf.field_b = 0 + ka.field_h;
              break L17;
            }
          }
          if (el.field_o.field_x) {
            L18: {
              if (gi.field_e % 18 == -1) {
                if (-1 == gg.field_b) {
                  if (!pf.field_D) {
                    g.field_j = g.field_j % 4;
                    ul.field_a = vf.field_H[g.field_j];
                    g.field_j = g.field_j + 1;
                    var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                    wa.field_a = wa.field_a - 1;
                    if (-1 <= wa.field_a) {
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (jf.field_j ^ -1)) {
                        return;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        return;
                      }
                    } else {
                      ha.field_g = wa.field_a % 15 % 2;
                      jf.field_j = jf.field_j - 1;
                      if (-1 >= jf.field_j) {
                        return;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        return;
                      }
                    }
                  } else {
                    gg.field_b = gg.field_b + 1;
                    g.field_j = 0;
                    fd.a(300, fl.field_c[22], false, j.field_gb);
                    g.field_j = g.field_j + 1;
                    var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                    wa.field_a = wa.field_a - 1;
                    if (-1 <= wa.field_a) {
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (jf.field_j ^ -1)) {
                        return;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        return;
                      }
                    } else {
                      L19: {
                        ha.field_g = wa.field_a % 15 % 2;
                        jf.field_j = jf.field_j - 1;
                        if (-1 >= jf.field_j) {
                          break L19;
                        } else {
                          rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                          break L19;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if ((gg.field_b ^ -1) == -2) {
                    if (ok.field_a.length <= g.field_j) {
                      L20: {
                        gg.field_b = gg.field_b + 1;
                        pa.field_g = 200;
                        g.field_j = g.field_j + 1;
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= wa.field_a) {
                          break L20;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L20;
                        }
                      }
                      jf.field_j = jf.field_j - 1;
                      if (-1 >= jf.field_j) {
                        return;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        return;
                      }
                    } else {
                      L21: {
                        ul.field_a = ok.field_a[g.field_j];
                        g.field_j = g.field_j + 1;
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= wa.field_a) {
                          break L21;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L21;
                        }
                      }
                      L22: {
                        jf.field_j = jf.field_j - 1;
                        if (-1 >= jf.field_j) {
                          break L22;
                        } else {
                          rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                          break L22;
                        }
                      }
                      return;
                    }
                  } else {
                    g.field_j = g.field_j % 4;
                    ul.field_a = ld.field_b[g.field_j];
                    g.field_j = g.field_j + 1;
                    break L18;
                  }
                }
              } else {
                break L18;
              }
            }
            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
            wa.field_a = wa.field_a - 1;
            if (-1 <= wa.field_a) {
              jf.field_j = jf.field_j - 1;
              if (-1 <= (jf.field_j ^ -1)) {
                return;
              } else {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              }
            } else {
              ha.field_g = wa.field_a % 15 % 2;
              jf.field_j = jf.field_j - 1;
              if (-1 >= jf.field_j) {
                return;
              } else {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              }
            }
          } else {
            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
            wa.field_a = wa.field_a - 1;
            if (-1 <= wa.field_a) {
              jf.field_j = jf.field_j - 1;
              if (-1 > (jf.field_j ^ -1)) {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              } else {
                return;
              }
            } else {
              ha.field_g = wa.field_a % 15 % 2;
              jf.field_j = jf.field_j - 1;
              if (-1 < jf.field_j) {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L23: {
            pa.field_g = pa.field_g - 1;
            gi.field_e = gi.field_e + 1;
            if (30 <= gi.field_e % param0) {
              break L23;
            } else {
              uf.field_b = 0 + ka.field_h;
              break L23;
            }
          }
          L24: {
            if (!el.field_o.field_x) {
              break L24;
            } else {
              if (gi.field_e % 18 == -1) {
                if (-1 == gg.field_b) {
                  if (pf.field_D) {
                    L25: {
                      gg.field_b = gg.field_b + 1;
                      g.field_j = 0;
                      fd.a(300, fl.field_c[22], false, j.field_gb);
                      g.field_j = g.field_j + 1;
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= wa.field_a) {
                        break L25;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L25;
                      }
                    }
                    L26: {
                      jf.field_j = jf.field_j - 1;
                      if (-1 >= jf.field_j) {
                        break L26;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        break L26;
                      }
                    }
                    return;
                  } else {
                    L27: {
                      g.field_j = g.field_j % 4;
                      ul.field_a = vf.field_H[g.field_j];
                      g.field_j = g.field_j + 1;
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= wa.field_a) {
                        break L27;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L27;
                      }
                    }
                    L28: {
                      jf.field_j = jf.field_j - 1;
                      if (-1 >= jf.field_j) {
                        break L28;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        break L28;
                      }
                    }
                    return;
                  }
                } else {
                  if ((gg.field_b ^ -1) == -2) {
                    if (ok.field_a.length > g.field_j) {
                      L29: {
                        ul.field_a = ok.field_a[g.field_j];
                        g.field_j = g.field_j + 1;
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= wa.field_a) {
                          break L29;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L29;
                        }
                      }
                      L30: {
                        jf.field_j = jf.field_j - 1;
                        if (-1 >= jf.field_j) {
                          break L30;
                        } else {
                          rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                          break L30;
                        }
                      }
                      return;
                    } else {
                      L31: {
                        gg.field_b = gg.field_b + 1;
                        pa.field_g = 200;
                        g.field_j = g.field_j + 1;
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= wa.field_a) {
                          break L31;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L31;
                        }
                      }
                      L32: {
                        jf.field_j = jf.field_j - 1;
                        if (-1 >= jf.field_j) {
                          break L32;
                        } else {
                          rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                          break L32;
                        }
                      }
                      return;
                    }
                  } else {
                    g.field_j = g.field_j % 4;
                    ul.field_a = ld.field_b[g.field_j];
                    g.field_j = g.field_j + 1;
                    break L24;
                  }
                }
              } else {
                break L24;
              }
            }
          }
          var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
          wa.field_a = wa.field_a - 1;
          if (-1 <= wa.field_a) {
            jf.field_j = jf.field_j - 1;
            if (-1 > (jf.field_j ^ -1)) {
              rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
              return;
            } else {
              return;
            }
          } else {
            L33: {
              ha.field_g = wa.field_a % 15 % 2;
              jf.field_j = jf.field_j - 1;
              if (-1 >= jf.field_j) {
                break L33;
              } else {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                break L33;
              }
            }
            return;
          }
        }
    }

    final static wa p(int param0) {
        if (null != uf.field_f) {
          if (param0 < 71) {
            return null;
          } else {
            return uf.field_f;
          }
        } else {
          uf.field_f = new wa();
          uf.field_f.a(9, ng.field_F);
          uf.field_f.field_h = 14;
          uf.field_f.field_f = 2763306;
          uf.field_f.field_d = 6;
          uf.field_f.field_n = 7697781;
          uf.field_f.field_e = 5;
          uf.field_f.field_i = 0;
          uf.field_f.field_p = 4;
          uf.field_f.field_m = hh.field_d;
          if (param0 < 71) {
            return null;
          } else {
            return uf.field_f;
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        int var5 = 0;
        ni var6 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ni stackIn_12_0 = null;
        ni stackIn_13_0 = null;
        ni stackIn_14_0 = null;
        String stackIn_14_1 = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ni stackOut_11_0 = null;
        ni stackOut_13_0 = null;
        String stackOut_13_1 = null;
        ni stackOut_12_0 = null;
        String stackOut_12_1 = null;
        var5 = Geoblox.field_C;
        if (((f) this).field_rb) {
          return;
        } else {
          if (param1 == 19810) {
            L0: {
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (256 != param0) {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L0;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L0;
              }
            }
            ((f) this).field_ob = stackIn_8_1 != 0;
            ((f) this).field_rb = true;
            ((f) this).field_pb.a(4210752, 8405024, (byte) -103);
            var6 = new ni((f) this, ((f) this).field_jb, param2);
            if (-6 == (param0 ^ -1)) {
              var6.a(nf.field_E, 1, 11);
              var6.a(rj.field_e, 1, 17);
              if (-4 != (param0 ^ -1)) {
                if (param0 != 4) {
                  if (-7 != param0) {
                    if (-10 != param0) {
                      ((f) this).b((el) (Object) var6, param1 ^ -19736);
                      return;
                    } else {
                      hk discarded$4 = var6.a(-2, fi.field_h, (bb) this);
                      ((f) this).b((el) (Object) var6, param1 ^ -19736);
                      return;
                    }
                  } else {
                    var6.a(jc.field_c, 1, 9);
                    ((f) this).b((el) (Object) var6, param1 ^ -19736);
                    return;
                  }
                } else {
                  var6.a(hb.field_h, 1, 8);
                  ((f) this).b((el) (Object) var6, param1 ^ -19736);
                  return;
                }
              } else {
                var6.a(ee.field_y, param1 ^ 19811, 7);
                ((f) this).b((el) (Object) var6, param1 ^ -19736);
                return;
              }
            } else {
              if (param0 != 256) {
                L1: {
                  stackOut_11_0 = (ni) var6;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (((f) this).field_mb) {
                    stackOut_13_0 = (ni) (Object) stackIn_13_0;
                    stackOut_13_1 = a.field_b;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L1;
                  } else {
                    stackOut_12_0 = (ni) (Object) stackIn_12_0;
                    stackOut_12_1 = ll.field_b;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    break L1;
                  }
                }
                ((ni) (Object) stackIn_14_0).a(stackIn_14_1, 1, -1);
                if (-4 != param0) {
                  L2: {
                    if (param0 != 4) {
                      if (-7 != param0) {
                        if (-10 == (param0 ^ -1)) {
                          hk discarded$5 = var6.a(-2, fi.field_h, (bb) this);
                          break L2;
                        } else {
                          ((f) this).b((el) (Object) var6, param1 ^ -19736);
                          return;
                        }
                      } else {
                        var6.a(jc.field_c, 1, 9);
                        ((f) this).b((el) (Object) var6, param1 ^ -19736);
                        return;
                      }
                    } else {
                      var6.a(hb.field_h, 1, 8);
                      break L2;
                    }
                  }
                  ((f) this).b((el) (Object) var6, param1 ^ -19736);
                  return;
                } else {
                  var6.a(ee.field_y, param1 ^ 19811, 7);
                  ((f) this).b((el) (Object) var6, param1 ^ -19736);
                  return;
                }
              } else {
                hk discarded$6 = var6.a(-2, a.field_b, (bb) this);
                if (-4 != (param0 ^ -1)) {
                  if (param0 != 4) {
                    if (-7 != param0) {
                      if (-10 != param0) {
                        ((f) this).b((el) (Object) var6, param1 ^ -19736);
                        return;
                      } else {
                        hk discarded$7 = var6.a(-2, fi.field_h, (bb) this);
                        ((f) this).b((el) (Object) var6, param1 ^ -19736);
                        return;
                      }
                    } else {
                      var6.a(jc.field_c, 1, 9);
                      ((f) this).b((el) (Object) var6, param1 ^ -19736);
                      return;
                    }
                  } else {
                    var6.a(hb.field_h, 1, 8);
                    ((f) this).b((el) (Object) var6, param1 ^ -19736);
                    return;
                  }
                } else {
                  var6.a(ee.field_y, param1 ^ 19811, 7);
                  ((f) this).b((el) (Object) var6, param1 ^ -19736);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static boolean b(byte param0, CharSequence param1) {
        if (param0 >= -111) {
            field_lb = null;
            return pa.a(param1, true, 10, 87);
        }
        return pa.a(param1, true, 10, 87);
    }

    final void c(boolean param0) {
        ni var2 = null;
        ((f) this).field_pb.a(4210752, 2121792, (byte) -103);
        if (param0) {
          field_kb = null;
          var2 = new ni((f) this, ((f) this).field_jb, oe.field_O);
          var2.a(jk.field_c, 1, 15);
          ((f) this).b((el) (Object) var2, -23);
          return;
        } else {
          var2 = new ni((f) this, ((f) this).field_jb, oe.field_O);
          var2.a(jk.field_c, 1, 15);
          ((f) this).b((el) (Object) var2, -23);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hb = new gk();
        field_lb = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_nb = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}

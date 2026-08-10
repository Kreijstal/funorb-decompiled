/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        CharSequence var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param1 == -20) {
                break L1;
              } else {
                var7 = (CharSequence) null;
                f.b((byte) -98, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              if (!this.field_ob) {
                eb.a(k.c(111), (byte) 112, "tochangedisplayname.ws");
                break L2;
              } else {
                pc.a(3, false);
                this.h((byte) -104);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("f.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void b(String param0, String param1, int param2) {
        if (Geoblox.field_y != null) {
            Geoblox.field_y.h((byte) -104);
        }
        if (param2 != 7697781) {
            return;
        }
        try {
            ml.field_t = new pf(param0, param1, false, true, true);
            hk.field_C.b(ml.field_t, -81);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "f.HA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    f(ng param0, m param1, String param2, boolean param3, boolean param4) {
        super(param0, new ni((f) null, param1, param2), 77, 10, 10);
        try {
            this.field_gb = param4 ? true : false;
            this.field_ob = false;
            this.field_rb = false;
            this.field_jb = param1;
            this.field_mb = param3 ? true : false;
            this.field_pb = new hl(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_pb.field_C = true;
            this.b((byte) -61, (el) (this.field_pb));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void i(byte param0) {
        if (vl.field_n != null) {
          return;
        } else {
          if (param0 < -48) {
            vl.field_n = od.a(480, 0, 0, -3, ka.field_i, 640);
            if (null != vl.field_n) {
              sl.a(vl.field_n, 57);
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
              sl.a(vl.field_n, 57);
              return;
            }
          }
        }
    }

    final void h(byte param0) {
        if (!this.field_I) {
          return;
        } else {
          this.field_I = false;
          if (param0 == -104) {
            if (!this.field_mb) {
              if (this.field_gb) {
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
            this.field_ob = true;
            if (!this.field_mb) {
              if (!this.field_gb) {
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
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != param1) {
              stackIn_4_0 = super.a(param0, param1 + 0, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.h((byte) -104);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("f.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void n(int param0) {
        field_hb = null;
        int var1 = 44 % ((param0 - -23) / 41);
        field_kb = null;
        field_nb = null;
        field_lb = null;
    }

    final static void o(int param0) {
        int fieldTemp$24 = 0;
        int fieldTemp$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        int fieldTemp$32 = 0;
        int fieldTemp$33 = 0;
        int fieldTemp$34 = 0;
        int fieldTemp$35 = 0;
        int fieldTemp$36 = 0;
        int fieldTemp$37 = 0;
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
        int fieldTemp$40 = 0;
        int fieldTemp$41 = 0;
        int fieldTemp$42 = 0;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$45 = 0;
        int fieldTemp$46 = 0;
        int fieldTemp$47 = 0;
        int fieldTemp$48 = 0;
        int fieldTemp$49 = 0;
        int fieldTemp$50 = 0;
        int fieldTemp$51 = 0;
        int fieldTemp$52 = 0;
        int fieldTemp$53 = 0;
        int fieldTemp$54 = 0;
        int fieldTemp$55 = 0;
        int fieldTemp$56 = 0;
        int fieldTemp$57 = 0;
        int fieldTemp$58 = 0;
        int fieldTemp$59 = 0;
        int fieldTemp$60 = 0;
        int fieldTemp$61 = 0;
        float var1;
        int var1_int;
        int var2;
        var2 = Geoblox.field_C;
        int fieldTemp$23 = af.field_c;
        af.field_c = af.field_c - 1;
        if (0 > fieldTemp$23) {
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
                  if (0 == jk.field_d) {
                    if (var1_int < 3) {
                      uf.field_b = uf.field_b + 1;
                      break L0;
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
                L2: {
                  L3: {
                    if (2 != jk.field_d) {
                      break L3;
                    } else {
                      if (5 <= var1_int) {
                        break L3;
                      } else {
                        uf.field_b = uf.field_b + 1;
                        break L2;
                      }
                    }
                  }
                  if (0 == jk.field_d) {
                    if (var1_int < 3) {
                      uf.field_b = uf.field_b + 1;
                      break L2;
                    } else {
                      if (0 != jk.field_d) {
                        break L2;
                      } else {
                        if (3 >= var1_int) {
                          break L2;
                        } else {
                          uf.field_b = uf.field_b - 1;
                          break L2;
                        }
                      }
                    }
                  } else {
                    if (0 != jk.field_d) {
                      break L2;
                    } else {
                      if (3 >= var1_int) {
                        break L2;
                      } else {
                        uf.field_b = uf.field_b - 1;
                        break L2;
                      }
                    }
                  }
                }
                L4: {
                  pa.field_g = pa.field_g - 1;
                  gi.field_e = gi.field_e + 1;
                  if (30 <= gi.field_e % param0) {
                    break L4;
                  } else {
                    uf.field_b = 0 + ka.field_h;
                    break L4;
                  }
                }
                L5: {
                  if (!el.field_o.field_x) {
                    break L5;
                  } else {
                    if (gi.field_e % 18 == 0) {
                      if (-1 == (gg.field_b ^ -1)) {
                        if (pf.field_D) {
                          L6: {
                            gg.field_b = gg.field_b + 1;
                            g.field_j = 0;
                            fd.a(300, fl.field_c[22], false, j.field_gb);
                            g.field_j = g.field_j + 1;
                            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                            fieldTemp$24 = wa.field_a;
                            wa.field_a = wa.field_a - 1;
                            if (-1 <= (fieldTemp$24 ^ -1)) {
                              break L6;
                            } else {
                              ha.field_g = wa.field_a % 15 % 2;
                              break L6;
                            }
                          }
                          L7: {
                            fieldTemp$25 = jf.field_j;
                            jf.field_j = jf.field_j - 1;
                            if (-1 <= (fieldTemp$25 ^ -1)) {
                              break L7;
                            } else {
                              rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                              break L7;
                            }
                          }
                          return;
                        } else {
                          L8: {
                            g.field_j = g.field_j % 4;
                            ul.field_a = vf.field_H[g.field_j];
                            g.field_j = g.field_j + 1;
                            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                            fieldTemp$26 = wa.field_a;
                            wa.field_a = wa.field_a - 1;
                            if (-1 <= (fieldTemp$26 ^ -1)) {
                              break L8;
                            } else {
                              ha.field_g = wa.field_a % 15 % 2;
                              break L8;
                            }
                          }
                          L9: {
                            fieldTemp$27 = jf.field_j;
                            jf.field_j = jf.field_j - 1;
                            if (-1 <= (fieldTemp$27 ^ -1)) {
                              break L9;
                            } else {
                              rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                              break L9;
                            }
                          }
                          return;
                        }
                      } else {
                        if ((gg.field_b ^ -1) == -2) {
                          if (ok.field_a.length > g.field_j) {
                            L10: {
                              ul.field_a = ok.field_a[g.field_j];
                              g.field_j = g.field_j + 1;
                              var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                              fieldTemp$28 = wa.field_a;
                              wa.field_a = wa.field_a - 1;
                              if (-1 <= (fieldTemp$28 ^ -1)) {
                                break L10;
                              } else {
                                ha.field_g = wa.field_a % 15 % 2;
                                break L10;
                              }
                            }
                            L11: {
                              fieldTemp$29 = jf.field_j;
                              jf.field_j = jf.field_j - 1;
                              if (-1 <= (fieldTemp$29 ^ -1)) {
                                break L11;
                              } else {
                                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                                break L11;
                              }
                            }
                            return;
                          } else {
                            L12: {
                              gg.field_b = gg.field_b + 1;
                              pa.field_g = 200;
                              g.field_j = g.field_j + 1;
                              var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                              fieldTemp$30 = wa.field_a;
                              wa.field_a = wa.field_a - 1;
                              if (-1 <= (fieldTemp$30 ^ -1)) {
                                break L12;
                              } else {
                                ha.field_g = wa.field_a % 15 % 2;
                                break L12;
                              }
                            }
                            L13: {
                              fieldTemp$31 = jf.field_j;
                              jf.field_j = jf.field_j - 1;
                              if (-1 <= (fieldTemp$31 ^ -1)) {
                                break L13;
                              } else {
                                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                                break L13;
                              }
                            }
                            return;
                          }
                        } else {
                          g.field_j = g.field_j % 4;
                          ul.field_a = ld.field_b[g.field_j];
                          g.field_j = g.field_j + 1;
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                fieldTemp$32 = wa.field_a;
                wa.field_a = wa.field_a - 1;
                if (-1 <= (fieldTemp$32 ^ -1)) {
                  fieldTemp$33 = jf.field_j;
                  jf.field_j = jf.field_j - 1;
                  if (-1 > (fieldTemp$33 ^ -1)) {
                    rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                    return;
                  } else {
                    return;
                  }
                } else {
                  L14: {
                    ha.field_g = wa.field_a % 15 % 2;
                    fieldTemp$34 = jf.field_j;
                    jf.field_j = jf.field_j - 1;
                    if (-1 <= (fieldTemp$34 ^ -1)) {
                      break L14;
                    } else {
                      rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                      break L14;
                    }
                  }
                  return;
                }
              }
            }
          }
          L15: {
            pa.field_g = pa.field_g - 1;
            gi.field_e = gi.field_e + 1;
            if (30 <= gi.field_e % param0) {
              break L15;
            } else {
              uf.field_b = 0 + ka.field_h;
              break L15;
            }
          }
          if (el.field_o.field_x) {
            L16: {
              if (gi.field_e % 18 == 0) {
                if (-1 == (gg.field_b ^ -1)) {
                  if (!pf.field_D) {
                    g.field_j = g.field_j % 4;
                    ul.field_a = vf.field_H[g.field_j];
                    g.field_j = g.field_j + 1;
                    var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                    fieldTemp$35 = wa.field_a;
                    wa.field_a = wa.field_a - 1;
                    if (-1 <= (fieldTemp$35 ^ -1)) {
                      fieldTemp$36 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$36 ^ -1)) {
                        return;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        return;
                      }
                    } else {
                      ha.field_g = wa.field_a % 15 % 2;
                      fieldTemp$37 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$37 ^ -1)) {
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
                    fieldTemp$38 = wa.field_a;
                    wa.field_a = wa.field_a - 1;
                    if (-1 <= (fieldTemp$38 ^ -1)) {
                      fieldTemp$39 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$39 ^ -1)) {
                        return;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        return;
                      }
                    } else {
                      L17: {
                        ha.field_g = wa.field_a % 15 % 2;
                        fieldTemp$40 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (-1 <= (fieldTemp$40 ^ -1)) {
                          break L17;
                        } else {
                          rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                          break L17;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if ((gg.field_b ^ -1) == -2) {
                    if (ok.field_a.length <= g.field_j) {
                      L18: {
                        gg.field_b = gg.field_b + 1;
                        pa.field_g = 200;
                        g.field_j = g.field_j + 1;
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        fieldTemp$41 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$41 ^ -1)) {
                          break L18;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L18;
                        }
                      }
                      fieldTemp$42 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$42 ^ -1)) {
                        return;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        return;
                      }
                    } else {
                      L19: {
                        ul.field_a = ok.field_a[g.field_j];
                        g.field_j = g.field_j + 1;
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        fieldTemp$43 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$43 ^ -1)) {
                          break L19;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L19;
                        }
                      }
                      L20: {
                        fieldTemp$44 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (-1 <= (fieldTemp$44 ^ -1)) {
                          break L20;
                        } else {
                          rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                          break L20;
                        }
                      }
                      return;
                    }
                  } else {
                    g.field_j = g.field_j % 4;
                    ul.field_a = ld.field_b[g.field_j];
                    g.field_j = g.field_j + 1;
                    break L16;
                  }
                }
              } else {
                break L16;
              }
            }
            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
            fieldTemp$45 = wa.field_a;
            wa.field_a = wa.field_a - 1;
            if (-1 <= (fieldTemp$45 ^ -1)) {
              fieldTemp$46 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (-1 <= (fieldTemp$46 ^ -1)) {
                return;
              } else {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              }
            } else {
              ha.field_g = wa.field_a % 15 % 2;
              fieldTemp$47 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (-1 <= (fieldTemp$47 ^ -1)) {
                return;
              } else {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              }
            }
          } else {
            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
            fieldTemp$48 = wa.field_a;
            wa.field_a = wa.field_a - 1;
            if (-1 <= (fieldTemp$48 ^ -1)) {
              fieldTemp$49 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (-1 > (fieldTemp$49 ^ -1)) {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              } else {
                return;
              }
            } else {
              ha.field_g = wa.field_a % 15 % 2;
              fieldTemp$50 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (-1 > (fieldTemp$50 ^ -1)) {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L21: {
            pa.field_g = pa.field_g - 1;
            gi.field_e = gi.field_e + 1;
            if (30 <= gi.field_e % param0) {
              break L21;
            } else {
              uf.field_b = 0 + ka.field_h;
              break L21;
            }
          }
          L22: {
            if (!el.field_o.field_x) {
              break L22;
            } else {
              if (gi.field_e % 18 == 0) {
                if (-1 == (gg.field_b ^ -1)) {
                  if (pf.field_D) {
                    L23: {
                      gg.field_b = gg.field_b + 1;
                      g.field_j = 0;
                      fd.a(300, fl.field_c[22], false, j.field_gb);
                      g.field_j = g.field_j + 1;
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      fieldTemp$51 = wa.field_a;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (fieldTemp$51 ^ -1)) {
                        break L23;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L23;
                      }
                    }
                    L24: {
                      fieldTemp$52 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$52 ^ -1)) {
                        break L24;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        break L24;
                      }
                    }
                    return;
                  } else {
                    L25: {
                      g.field_j = g.field_j % 4;
                      ul.field_a = vf.field_H[g.field_j];
                      g.field_j = g.field_j + 1;
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      fieldTemp$53 = wa.field_a;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (fieldTemp$53 ^ -1)) {
                        break L25;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L25;
                      }
                    }
                    L26: {
                      fieldTemp$54 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$54 ^ -1)) {
                        break L26;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        break L26;
                      }
                    }
                    return;
                  }
                } else {
                  if ((gg.field_b ^ -1) == -2) {
                    if (ok.field_a.length > g.field_j) {
                      L27: {
                        ul.field_a = ok.field_a[g.field_j];
                        g.field_j = g.field_j + 1;
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        fieldTemp$55 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$55 ^ -1)) {
                          break L27;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L27;
                        }
                      }
                      L28: {
                        fieldTemp$56 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (-1 <= (fieldTemp$56 ^ -1)) {
                          break L28;
                        } else {
                          rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                          break L28;
                        }
                      }
                      return;
                    } else {
                      L29: {
                        gg.field_b = gg.field_b + 1;
                        pa.field_g = 200;
                        g.field_j = g.field_j + 1;
                        var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                        fieldTemp$57 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$57 ^ -1)) {
                          break L29;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L29;
                        }
                      }
                      L30: {
                        fieldTemp$58 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (-1 <= (fieldTemp$58 ^ -1)) {
                          break L30;
                        } else {
                          rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                          break L30;
                        }
                      }
                      return;
                    }
                  } else {
                    g.field_j = g.field_j % 4;
                    ul.field_a = ld.field_b[g.field_j];
                    g.field_j = g.field_j + 1;
                    break L22;
                  }
                }
              } else {
                break L22;
              }
            }
          }
          var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
          fieldTemp$59 = wa.field_a;
          wa.field_a = wa.field_a - 1;
          if (-1 <= (fieldTemp$59 ^ -1)) {
            fieldTemp$60 = jf.field_j;
            jf.field_j = jf.field_j - 1;
            if (-1 > (fieldTemp$60 ^ -1)) {
              rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
              return;
            } else {
              return;
            }
          } else {
            L31: {
              ha.field_g = wa.field_a % 15 % 2;
              fieldTemp$61 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (-1 <= (fieldTemp$61 ^ -1)) {
                break L31;
              } else {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                break L31;
              }
            }
            return;
          }
        }
    }

    final static wa p(int param0) {
        if (null != uf.field_f) {
          if (param0 < 71) {
            return (wa) null;
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
            return (wa) null;
          } else {
            return uf.field_f;
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ni stackIn_14_0 = null;
        ni stackIn_15_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ni var6 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            if (this.field_rb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 19810) {
                L1: {
                  stackIn_8_0 = this;

                  if (256 != param0) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
                    break L1;
                  }
                }
                L2: {
                  ((f) (this)).field_ob = stackIn_9_1 != 0;
                  this.field_rb = true;
                  this.field_pb.a(4210752, 8405024, (byte) -103);
                  var6 = new ni((f) (this), this.field_jb, param2);
                  if (-6 == (param0 ^ -1)) {
                    var6.a(nf.field_E, 1, 11);
                    var6.a(rj.field_e, 1, 17);
                    break L2;
                  } else {
                    if (param0 != 256) {
                      L3: {
                        stackIn_14_0 = (ni) (var6);

                        if (this.field_mb) {
                          stackIn_15_0 = (ni) ((Object) stackIn_14_0);
                          stackIn_15_1 = a.field_b;
                          break L3;
                        } else {
                          stackIn_15_0 = (ni) ((Object) stackIn_14_0);
                          stackIn_15_1 = ll.field_b;
                          break L3;
                        }
                      }
                      ((ni) (Object) stackIn_15_0).a(stackIn_15_1, 1, -1);
                      break L2;
                    } else {
                      var6.a(-2, a.field_b, (bb) (this));
                      break L2;
                    }
                  }
                }
                L4: {
                  if (-4 == (param0 ^ -1)) {
                    var6.a(ee.field_y, param1 ^ 19811, 7);
                    break L4;
                  } else {
                    if (param0 != 4) {
                      if (-7 == (param0 ^ -1)) {
                        var6.a(jc.field_c, 1, 9);
                        break L4;
                      } else {
                        if (-10 == (param0 ^ -1)) {
                          var6.a(-2, fi.field_h, (bb) (this));
                          break L4;
                        } else {
                          this.b(var6, param1 ^ -19736);
                          return;
                        }
                      }
                    } else {
                      var6.a(hb.field_h, 1, 8);
                      break L4;
                    }
                  }
                }
                this.b(var6, param1 ^ -19736);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4);

            stackIn_30_1 = new StringBuilder().append("f.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static boolean b(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -111) {
                break L1;
              } else {
                field_lb = (String[]) null;
                break L1;
              }
            }
            stackIn_3_0 = pa.a(param1, true, 10, 87);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("f.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void c(boolean param0) {
        ni var2;
        this.field_pb.a(4210752, 2121792, (byte) -103);
        if (param0) {
          field_kb = (java.awt.Canvas) null;
          var2 = new ni((f) (this), this.field_jb, oe.field_O);
          var2.a(jk.field_c, 1, 15);
          this.b(var2, -23);
          return;
        } else {
          var2 = new ni((f) (this), this.field_jb, oe.field_O);
          var2.a(jk.field_c, 1, 15);
          this.b(var2, -23);
          return;
        }
    }

    static {
        field_hb = new gk();
        field_lb = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_nb = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}

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
        boolean discarded$2 = false;
        RuntimeException var6 = null;
        CharSequence var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -20) {
                break L1;
              } else {
                var7 = (CharSequence) null;
                discarded$2 = f.b((byte) -98, (CharSequence) null);
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
            stackOut_6_0 = (RuntimeException) (var6);
            stackOut_6_1 = new StringBuilder().append("f.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
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
            if (param0 != param1) {
              stackOut_3_0 = super.a(param0, param1 + 0, param2, param3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.h((byte) -104);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("f.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
        int fieldTemp$118 = 0;
        int fieldTemp$119 = 0;
        int fieldTemp$120 = 0;
        int fieldTemp$121 = 0;
        int fieldTemp$122 = 0;
        int fieldTemp$123 = 0;
        int fieldTemp$124 = 0;
        int fieldTemp$125 = 0;
        int fieldTemp$126 = 0;
        int fieldTemp$127 = 0;
        int fieldTemp$128 = 0;
        int fieldTemp$129 = 0;
        int fieldTemp$130 = 0;
        int fieldTemp$131 = 0;
        int fieldTemp$132 = 0;
        int fieldTemp$133 = 0;
        int fieldTemp$134 = 0;
        int fieldTemp$135 = 0;
        int fieldTemp$136 = 0;
        int fieldTemp$137 = 0;
        int fieldTemp$138 = 0;
        int fieldTemp$139 = 0;
        int fieldTemp$140 = 0;
        int fieldTemp$141 = 0;
        int fieldTemp$142 = 0;
        int fieldTemp$143 = 0;
        int fieldTemp$144 = 0;
        int fieldTemp$145 = 0;
        int fieldTemp$146 = 0;
        int fieldTemp$147 = 0;
        int fieldTemp$148 = 0;
        int fieldTemp$149 = 0;
        int fieldTemp$150 = 0;
        int fieldTemp$151 = 0;
        int fieldTemp$152 = 0;
        int fieldTemp$153 = 0;
        int fieldTemp$154 = 0;
        int fieldTemp$155 = 0;
        float var1 = 0.0f;
        int var1_int = 0;
        int var2 = 0;
        var2 = Geoblox.field_C;
        int fieldTemp$117 = af.field_c;
        af.field_c = af.field_c - 1;
        if (0 > fieldTemp$117) {
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
                    if (gi.field_e % 18 == 0) {
                      if (-1 == (gg.field_b ^ -1)) {
                        if (pf.field_D) {
                          L8: {
                            gg.field_b = gg.field_b + 1;
                            g.field_j = 0;
                            fd.a(300, fl.field_c[22], false, j.field_gb);
                            g.field_j = g.field_j + 1;
                            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                            fieldTemp$118 = wa.field_a;
                            wa.field_a = wa.field_a - 1;
                            if (-1 <= (fieldTemp$118 ^ -1)) {
                              break L8;
                            } else {
                              ha.field_g = wa.field_a % 15 % 2;
                              break L8;
                            }
                          }
                          L9: {
                            fieldTemp$119 = jf.field_j;
                            jf.field_j = jf.field_j - 1;
                            if (-1 <= (fieldTemp$119 ^ -1)) {
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
                            fieldTemp$120 = wa.field_a;
                            wa.field_a = wa.field_a - 1;
                            if (-1 <= (fieldTemp$120 ^ -1)) {
                              break L10;
                            } else {
                              ha.field_g = wa.field_a % 15 % 2;
                              break L10;
                            }
                          }
                          L11: {
                            fieldTemp$121 = jf.field_j;
                            jf.field_j = jf.field_j - 1;
                            if (-1 <= (fieldTemp$121 ^ -1)) {
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
                              fieldTemp$122 = wa.field_a;
                              wa.field_a = wa.field_a - 1;
                              if (-1 <= (fieldTemp$122 ^ -1)) {
                                break L12;
                              } else {
                                ha.field_g = wa.field_a % 15 % 2;
                                break L12;
                              }
                            }
                            L13: {
                              fieldTemp$123 = jf.field_j;
                              jf.field_j = jf.field_j - 1;
                              if (-1 <= (fieldTemp$123 ^ -1)) {
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
                              fieldTemp$124 = wa.field_a;
                              wa.field_a = wa.field_a - 1;
                              if (-1 <= (fieldTemp$124 ^ -1)) {
                                break L14;
                              } else {
                                ha.field_g = wa.field_a % 15 % 2;
                                break L14;
                              }
                            }
                            L15: {
                              fieldTemp$125 = jf.field_j;
                              jf.field_j = jf.field_j - 1;
                              if (-1 <= (fieldTemp$125 ^ -1)) {
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
                fieldTemp$126 = wa.field_a;
                wa.field_a = wa.field_a - 1;
                if (-1 <= (fieldTemp$126 ^ -1)) {
                  fieldTemp$127 = jf.field_j;
                  jf.field_j = jf.field_j - 1;
                  if (-1 > (fieldTemp$127 ^ -1)) {
                    rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                    return;
                  } else {
                    return;
                  }
                } else {
                  L16: {
                    ha.field_g = wa.field_a % 15 % 2;
                    fieldTemp$128 = jf.field_j;
                    jf.field_j = jf.field_j - 1;
                    if (-1 <= (fieldTemp$128 ^ -1)) {
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
              if (gi.field_e % 18 == 0) {
                if (-1 == (gg.field_b ^ -1)) {
                  if (!pf.field_D) {
                    g.field_j = g.field_j % 4;
                    ul.field_a = vf.field_H[g.field_j];
                    g.field_j = g.field_j + 1;
                    var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                    fieldTemp$129 = wa.field_a;
                    wa.field_a = wa.field_a - 1;
                    if (-1 <= (fieldTemp$129 ^ -1)) {
                      fieldTemp$130 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$130 ^ -1)) {
                        return;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        return;
                      }
                    } else {
                      ha.field_g = wa.field_a % 15 % 2;
                      fieldTemp$131 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$131 ^ -1)) {
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
                    fieldTemp$132 = wa.field_a;
                    wa.field_a = wa.field_a - 1;
                    if (-1 <= (fieldTemp$132 ^ -1)) {
                      fieldTemp$133 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$133 ^ -1)) {
                        return;
                      } else {
                        rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                        return;
                      }
                    } else {
                      L19: {
                        ha.field_g = wa.field_a % 15 % 2;
                        fieldTemp$134 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (-1 <= (fieldTemp$134 ^ -1)) {
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
                        fieldTemp$135 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$135 ^ -1)) {
                          break L20;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L20;
                        }
                      }
                      fieldTemp$136 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$136 ^ -1)) {
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
                        fieldTemp$137 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$137 ^ -1)) {
                          break L21;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L21;
                        }
                      }
                      L22: {
                        fieldTemp$138 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (-1 <= (fieldTemp$138 ^ -1)) {
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
            fieldTemp$139 = wa.field_a;
            wa.field_a = wa.field_a - 1;
            if (-1 <= (fieldTemp$139 ^ -1)) {
              fieldTemp$140 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (-1 <= (fieldTemp$140 ^ -1)) {
                return;
              } else {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              }
            } else {
              ha.field_g = wa.field_a % 15 % 2;
              fieldTemp$141 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (-1 <= (fieldTemp$141 ^ -1)) {
                return;
              } else {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              }
            }
          } else {
            var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
            fieldTemp$142 = wa.field_a;
            wa.field_a = wa.field_a - 1;
            if (-1 <= (fieldTemp$142 ^ -1)) {
              fieldTemp$143 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (-1 > (fieldTemp$143 ^ -1)) {
                rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
                return;
              } else {
                return;
              }
            } else {
              ha.field_g = wa.field_a % 15 % 2;
              fieldTemp$144 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (-1 > (fieldTemp$144 ^ -1)) {
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
              if (gi.field_e % 18 == 0) {
                if (-1 == (gg.field_b ^ -1)) {
                  if (pf.field_D) {
                    L25: {
                      gg.field_b = gg.field_b + 1;
                      g.field_j = 0;
                      fd.a(300, fl.field_c[22], false, j.field_gb);
                      g.field_j = g.field_j + 1;
                      var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                      fieldTemp$145 = wa.field_a;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (fieldTemp$145 ^ -1)) {
                        break L25;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L25;
                      }
                    }
                    L26: {
                      fieldTemp$146 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$146 ^ -1)) {
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
                      fieldTemp$147 = wa.field_a;
                      wa.field_a = wa.field_a - 1;
                      if (-1 <= (fieldTemp$147 ^ -1)) {
                        break L27;
                      } else {
                        ha.field_g = wa.field_a % 15 % 2;
                        break L27;
                      }
                    }
                    L28: {
                      fieldTemp$148 = jf.field_j;
                      jf.field_j = jf.field_j - 1;
                      if (-1 <= (fieldTemp$148 ^ -1)) {
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
                        fieldTemp$149 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$149 ^ -1)) {
                          break L29;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L29;
                        }
                      }
                      L30: {
                        fieldTemp$150 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (-1 <= (fieldTemp$150 ^ -1)) {
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
                        fieldTemp$151 = wa.field_a;
                        wa.field_a = wa.field_a - 1;
                        if (-1 <= (fieldTemp$151 ^ -1)) {
                          break L31;
                        } else {
                          ha.field_g = wa.field_a % 15 % 2;
                          break L31;
                        }
                      }
                      L32: {
                        fieldTemp$152 = jf.field_j;
                        jf.field_j = jf.field_j - 1;
                        if (-1 <= (fieldTemp$152 ^ -1)) {
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
          fieldTemp$153 = wa.field_a;
          wa.field_a = wa.field_a - 1;
          if (-1 <= (fieldTemp$153 ^ -1)) {
            fieldTemp$154 = jf.field_j;
            jf.field_j = jf.field_j - 1;
            if (-1 > (fieldTemp$154 ^ -1)) {
              rj.field_c = ((int)(md.field_b * var1) << -1388546160) + (r.field_ub - -((int)(var1 * fe.field_c) << 1841154216) - -(int)(uk.field_j * var1));
              return;
            } else {
              return;
            }
          } else {
            L33: {
              ha.field_g = wa.field_a % 15 % 2;
              fieldTemp$155 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (-1 <= (fieldTemp$155 ^ -1)) {
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
        hk discarded$2 = null;
        hk discarded$3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ni var6 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ni stackIn_13_0 = null;
        ni stackIn_14_0 = null;
        ni stackIn_15_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ni stackOut_12_0 = null;
        ni stackOut_14_0 = null;
        String stackOut_14_1 = null;
        ni stackOut_13_0 = null;
        String stackOut_13_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            if (this.field_rb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 19810) {
                L1: {
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (256 != param0) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L1;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
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
                        stackOut_12_0 = (ni) (var6);
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (this.field_mb) {
                          stackOut_14_0 = (ni) ((Object) stackIn_14_0);
                          stackOut_14_1 = a.field_b;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          break L3;
                        } else {
                          stackOut_13_0 = (ni) ((Object) stackIn_13_0);
                          stackOut_13_1 = ll.field_b;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          break L3;
                        }
                      }
                      ((ni) (Object) stackIn_15_0).a(stackIn_15_1, 1, -1);
                      break L2;
                    } else {
                      discarded$2 = var6.a(-2, a.field_b, (bb) (this));
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
                          discarded$3 = var6.a(-2, fi.field_h, (bb) (this));
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
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("f.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = pa.a(param1, true, 10, 87);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("f.JA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void c(boolean param0) {
        ni var2 = null;
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

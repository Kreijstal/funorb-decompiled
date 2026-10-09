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
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 != -20) {
            var7 = (CharSequence) null;
            f.b((byte) -98, (CharSequence) null);
          }
          if (!this.field_ob) {
            eb.a(k.c(111), (byte) 112, "tochangedisplayname.ws");
          } else {
            pc.a(3, false);
            this.h((byte) -104);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("f.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
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
        }
        if (param0 >= -48) {
            field_qb = -112;
            vl.field_n = od.a(480, 0, 0, -3, ka.field_i, 640);
            if (null != vl.field_n) {
                sl.a(vl.field_n, 57);
                return;
            }
            return;
        }
        vl.field_n = od.a(480, 0, 0, -3, ka.field_i, 640);
        if (null == vl.field_n) {
            return;
        }
        sl.a(vl.field_n, 57);
    }

    final void h(byte param0) {
        if (!this.field_I) {
            return;
        }
        this.field_I = false;
        if (param0 != -104) {
            this.field_ob = true;
            if (this.field_mb) {
                tj.b((byte) -65);
                return;
            }
            if (this.field_gb) {
                wl.b(-1);
                return;
            }
            return;
        }
        if (this.field_mb) {
            tj.b((byte) -65);
            return;
        }
        if (!this.field_gb) {
            return;
        }
        wl.b(-1);
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != param1) {
            stackIn_4_0 = super.a(param0, param1 + 0, param2, param3);
            return stackIn_4_0;
          }
          this.h((byte) -104);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("f.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void n(int param0) {
        field_hb = null;
        int var1 = 44 % ((param0 + 23) / 41);
        field_kb = null;
        field_nb = null;
        field_lb = null;
    }

    final static void o(int param0) {
        int fieldTemp$53 = 0;
        int fieldTemp$54 = 0;
        int fieldTemp$51 = 0;
        int fieldTemp$52 = 0;
        int fieldTemp$55 = 0;
        int fieldTemp$56 = 0;
        int fieldTemp$57 = 0;
        int fieldTemp$58 = 0;
        int fieldTemp$59 = 0;
        int fieldTemp$60 = 0;
        int fieldTemp$61 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$24 = 0;
        int fieldTemp$25 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        int fieldTemp$32 = 0;
        int fieldTemp$33 = 0;
        int fieldTemp$34 = 0;
        int fieldTemp$48 = 0;
        int fieldTemp$49 = 0;
        int fieldTemp$50 = 0;
        int fieldTemp$35 = 0;
        int fieldTemp$36 = 0;
        int fieldTemp$37 = 0;
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
        int fieldTemp$40 = 0;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$41 = 0;
        int fieldTemp$42 = 0;
        int fieldTemp$45 = 0;
        int fieldTemp$46 = 0;
        int fieldTemp$47 = 0;
        float var1;
        int var1_int;
        int var2;
        float var1Lifetime1;
        float var1Lifetime2;
        float var1Lifetime3;
        float var1Lifetime4;
        float var1Lifetime5;
        float var1Lifetime1Lifetime1;
        float var1Lifetime3Lifetime1;
        var2 = Geoblox.field_C;
        int fieldTemp$23 = af.field_c;
        af.field_c = af.field_c - 1;
        if (0 <= fieldTemp$23) {
          pa.field_g = pa.field_g - 1;
          gi.field_e = gi.field_e + 1;
          if (30 > gi.field_e % param0) {
            uf.field_b = 0 + ka.field_h;
          }
          if (el.field_o.field_x &&
              gi.field_e % 18 == 0) {
            if (gg.field_b == 0) {
              if (!pf.field_D) {
                g.field_j = g.field_j % 4;
                ul.field_a = vf.field_H[g.field_j];
                g.field_j = g.field_j + 1;
                var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                fieldTemp$53 = wa.field_a;
                wa.field_a = wa.field_a - 1;
                if (fieldTemp$53 > 0) {
                  ha.field_g = wa.field_a % 15 % 2;
                }
                fieldTemp$54 = jf.field_j;
                jf.field_j = jf.field_j - 1;
                if (fieldTemp$54 > 0) {
                  rj.field_c = ((int)(md.field_b * var1) << 16) + (r.field_ub + ((int)(var1 * fe.field_c) << 8) + (int)(uk.field_j * var1));
                }
                return;
              }
              gg.field_b = gg.field_b + 1;
              g.field_j = 0;
              fd.a(300, fl.field_c[22], false, j.field_gb);
              g.field_j = g.field_j + 1;
              var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
              fieldTemp$51 = wa.field_a;
              wa.field_a = wa.field_a - 1;
              if (fieldTemp$51 > 0) {
                ha.field_g = wa.field_a % 15 % 2;
              }
              fieldTemp$52 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$52 > 0) {
                rj.field_c = ((int)(md.field_b * var1) << 16) + (r.field_ub + ((int)(var1 * fe.field_c) << 8) + (int)(uk.field_j * var1));
              }
              return;
            }
            if (gg.field_b == 1) {
              if (ok.field_a.length > g.field_j) {
                ul.field_a = ok.field_a[g.field_j];
                g.field_j = g.field_j + 1;
                var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                fieldTemp$55 = wa.field_a;
                wa.field_a = wa.field_a - 1;
                if (fieldTemp$55 > 0) {
                  ha.field_g = wa.field_a % 15 % 2;
                }
                fieldTemp$56 = jf.field_j;
                jf.field_j = jf.field_j - 1;
                if (fieldTemp$56 > 0) {
                  rj.field_c = ((int)(md.field_b * var1) << 16) + (r.field_ub + ((int)(var1 * fe.field_c) << 8) + (int)(uk.field_j * var1));
                }
                return;
              }
              gg.field_b = gg.field_b + 1;
              pa.field_g = 200;
              g.field_j = g.field_j + 1;
              var1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
              fieldTemp$57 = wa.field_a;
              wa.field_a = wa.field_a - 1;
              if (fieldTemp$57 > 0) {
                ha.field_g = wa.field_a % 15 % 2;
              }
              fieldTemp$58 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$58 > 0) {
                rj.field_c = ((int)(md.field_b * var1) << 16) + (r.field_ub + ((int)(var1 * fe.field_c) << 8) + (int)(uk.field_j * var1));
              }
              return;
            }
            g.field_j = g.field_j % 4;
            ul.field_a = ld.field_b[g.field_j];
            g.field_j = g.field_j + 1;
          }
          var1Lifetime5 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
          fieldTemp$59 = wa.field_a;
          wa.field_a = wa.field_a - 1;
          if (fieldTemp$59 <= 0) {
            fieldTemp$60 = jf.field_j;
            jf.field_j = jf.field_j - 1;
            if (fieldTemp$60 <= 0) {
              return;
            }
            rj.field_c = ((int)(md.field_b * var1Lifetime5) << 16) + (r.field_ub + ((int)(var1Lifetime5 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime5));
            return;
          }
          ha.field_g = wa.field_a % 15 % 2;
          fieldTemp$61 = jf.field_j;
          jf.field_j = jf.field_j - 1;
          if (fieldTemp$61 > 0) {
            rj.field_c = ((int)(md.field_b * var1Lifetime5) << 16) + (r.field_ub + ((int)(var1Lifetime5 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime5));
          }
          return;
        }
        af.field_c = 20;
        if (uf.field_b == ka.field_h + 0) {
          uf.field_b = ka.field_h + 3;
        } else {
          var1_int = -ka.field_h + uf.field_b;
          if (1 != jk.field_d) {
            if (2 == jk.field_d &&
                5 > var1_int) {
              uf.field_b = uf.field_b + 1;
            } else {
              if (0 == jk.field_d) {
                if (var1_int < 3) {
                  uf.field_b = uf.field_b + 1;
                } else {
                  if (0 == jk.field_d &&
                      3 < var1_int) {
                    uf.field_b = uf.field_b - 1;
                  }
                }
              } else {
                if (0 == jk.field_d &&
                    3 < var1_int) {
                  uf.field_b = uf.field_b - 1;
                }
              }
            }
            pa.field_g = pa.field_g - 1;
            gi.field_e = gi.field_e + 1;
            if (30 > gi.field_e % param0) {
              uf.field_b = 0 + ka.field_h;
            }
            if (el.field_o.field_x &&
                gi.field_e % 18 == 0) {
              if (gg.field_b == 0) {
                if (!pf.field_D) {
                  g.field_j = g.field_j % 4;
                  ul.field_a = vf.field_H[g.field_j];
                  g.field_j = g.field_j + 1;
                  var1Lifetime1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                  fieldTemp$26 = wa.field_a;
                  wa.field_a = wa.field_a - 1;
                  if (fieldTemp$26 > 0) {
                    ha.field_g = wa.field_a % 15 % 2;
                  }
                  fieldTemp$27 = jf.field_j;
                  jf.field_j = jf.field_j - 1;
                  if (fieldTemp$27 > 0) {
                    rj.field_c = ((int)(md.field_b * var1Lifetime1) << 16) + (r.field_ub + ((int)(var1Lifetime1 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime1));
                  }
                  return;
                }
                gg.field_b = gg.field_b + 1;
                g.field_j = 0;
                fd.a(300, fl.field_c[22], false, j.field_gb);
                g.field_j = g.field_j + 1;
                var1Lifetime1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                fieldTemp$24 = wa.field_a;
                wa.field_a = wa.field_a - 1;
                if (fieldTemp$24 > 0) {
                  ha.field_g = wa.field_a % 15 % 2;
                }
                fieldTemp$25 = jf.field_j;
                jf.field_j = jf.field_j - 1;
                if (fieldTemp$25 > 0) {
                  rj.field_c = ((int)(md.field_b * var1Lifetime1) << 16) + (r.field_ub + ((int)(var1Lifetime1 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime1));
                }
                return;
              }
              if (gg.field_b == 1) {
                if (ok.field_a.length > g.field_j) {
                  ul.field_a = ok.field_a[g.field_j];
                  g.field_j = g.field_j + 1;
                  var1Lifetime1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                  fieldTemp$28 = wa.field_a;
                  wa.field_a = wa.field_a - 1;
                  if (fieldTemp$28 > 0) {
                    ha.field_g = wa.field_a % 15 % 2;
                  }
                  fieldTemp$29 = jf.field_j;
                  jf.field_j = jf.field_j - 1;
                  if (fieldTemp$29 > 0) {
                    rj.field_c = ((int)(md.field_b * var1Lifetime1) << 16) + (r.field_ub + ((int)(var1Lifetime1 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime1));
                  }
                  return;
                }
                gg.field_b = gg.field_b + 1;
                pa.field_g = 200;
                g.field_j = g.field_j + 1;
                var1Lifetime1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
                fieldTemp$30 = wa.field_a;
                wa.field_a = wa.field_a - 1;
                if (fieldTemp$30 > 0) {
                  ha.field_g = wa.field_a % 15 % 2;
                }
                fieldTemp$31 = jf.field_j;
                jf.field_j = jf.field_j - 1;
                if (fieldTemp$31 > 0) {
                  rj.field_c = ((int)(md.field_b * var1Lifetime1) << 16) + (r.field_ub + ((int)(var1Lifetime1 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime1));
                }
                return;
              }
              g.field_j = g.field_j % 4;
              ul.field_a = ld.field_b[g.field_j];
              g.field_j = g.field_j + 1;
            }
            var1Lifetime1Lifetime1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
            fieldTemp$32 = wa.field_a;
            wa.field_a = wa.field_a - 1;
            if (fieldTemp$32 <= 0) {
              fieldTemp$33 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$33 <= 0) {
                return;
              }
              rj.field_c = ((int)(md.field_b * var1Lifetime1Lifetime1) << 16) + (r.field_ub + ((int)(var1Lifetime1Lifetime1 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime1Lifetime1));
              return;
            }
            ha.field_g = wa.field_a % 15 % 2;
            fieldTemp$34 = jf.field_j;
            jf.field_j = jf.field_j - 1;
            if (fieldTemp$34 > 0) {
              rj.field_c = ((int)(md.field_b * var1Lifetime1Lifetime1) << 16) + (r.field_ub + ((int)(var1Lifetime1Lifetime1 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime1Lifetime1));
            }
            return;
          }
          if (var1_int <= 1) {
            if (2 == jk.field_d &&
                5 > var1_int) {
              uf.field_b = uf.field_b + 1;
            } else {
              if (0 == jk.field_d) {
                if (var1_int < 3) {
                  uf.field_b = uf.field_b + 1;
                } else {
                  if (0 == jk.field_d &&
                      3 < var1_int) {
                    uf.field_b = uf.field_b - 1;
                  }
                }
              } else {
                if (0 == jk.field_d &&
                    3 < var1_int) {
                  uf.field_b = uf.field_b - 1;
                }
              }
            }
          } else {
            uf.field_b = uf.field_b - 1;
          }
        }
        pa.field_g = pa.field_g - 1;
        gi.field_e = gi.field_e + 1;
        if (30 > gi.field_e % param0) {
          uf.field_b = 0 + ka.field_h;
        }
        if (!el.field_o.field_x) {
          var1Lifetime2 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
          fieldTemp$48 = wa.field_a;
          wa.field_a = wa.field_a - 1;
          if (fieldTemp$48 <= 0) {
            fieldTemp$49 = jf.field_j;
            jf.field_j = jf.field_j - 1;
            if (fieldTemp$49 <= 0) {
              return;
            }
            rj.field_c = ((int)(md.field_b * var1Lifetime2) << 16) + (r.field_ub + ((int)(var1Lifetime2 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime2));
            return;
          }
          ha.field_g = wa.field_a % 15 % 2;
          fieldTemp$50 = jf.field_j;
          jf.field_j = jf.field_j - 1;
          if (fieldTemp$50 <= 0) {
            return;
          }
          rj.field_c = ((int)(md.field_b * var1Lifetime2) << 16) + (r.field_ub + ((int)(var1Lifetime2 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime2));
          return;
        }
        if (gi.field_e % 18 == 0) {
          if (gg.field_b == 0) {
            if (!pf.field_D) {
              g.field_j = g.field_j % 4;
              ul.field_a = vf.field_H[g.field_j];
              g.field_j = g.field_j + 1;
              var1Lifetime3 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
              fieldTemp$35 = wa.field_a;
              wa.field_a = wa.field_a - 1;
              if (fieldTemp$35 <= 0) {
                fieldTemp$36 = jf.field_j;
                jf.field_j = jf.field_j - 1;
                if (fieldTemp$36 <= 0) {
                  return;
                }
                rj.field_c = ((int)(md.field_b * var1Lifetime3) << 16) + (r.field_ub + ((int)(var1Lifetime3 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime3));
                return;
              }
              ha.field_g = wa.field_a % 15 % 2;
              fieldTemp$37 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$37 <= 0) {
                return;
              }
              rj.field_c = ((int)(md.field_b * var1Lifetime3) << 16) + (r.field_ub + ((int)(var1Lifetime3 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime3));
              return;
            }
            gg.field_b = gg.field_b + 1;
            g.field_j = 0;
            fd.a(300, fl.field_c[22], false, j.field_gb);
            g.field_j = g.field_j + 1;
            var1Lifetime3 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
            fieldTemp$38 = wa.field_a;
            wa.field_a = wa.field_a - 1;
            if (fieldTemp$38 <= 0) {
              fieldTemp$39 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$39 <= 0) {
                return;
              }
              rj.field_c = ((int)(md.field_b * var1Lifetime3) << 16) + (r.field_ub + ((int)(var1Lifetime3 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime3));
              return;
            }
            ha.field_g = wa.field_a % 15 % 2;
            fieldTemp$40 = jf.field_j;
            jf.field_j = jf.field_j - 1;
            if (fieldTemp$40 > 0) {
              rj.field_c = ((int)(md.field_b * var1Lifetime3) << 16) + (r.field_ub + ((int)(var1Lifetime3 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime3));
            }
            return;
          }
          if (gg.field_b == 1) {
            if (ok.field_a.length > g.field_j) {
              ul.field_a = ok.field_a[g.field_j];
              g.field_j = g.field_j + 1;
              var1Lifetime3Lifetime1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
              fieldTemp$43 = wa.field_a;
              wa.field_a = wa.field_a - 1;
              if (fieldTemp$43 > 0) {
                ha.field_g = wa.field_a % 15 % 2;
              }
              fieldTemp$44 = jf.field_j;
              jf.field_j = jf.field_j - 1;
              if (fieldTemp$44 > 0) {
                rj.field_c = ((int)(md.field_b * var1Lifetime3Lifetime1) << 16) + (r.field_ub + ((int)(var1Lifetime3Lifetime1 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime3Lifetime1));
              }
              return;
            }
            gg.field_b = gg.field_b + 1;
            pa.field_g = 200;
            g.field_j = g.field_j + 1;
            var1Lifetime3Lifetime1 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
            fieldTemp$41 = wa.field_a;
            wa.field_a = wa.field_a - 1;
            if (fieldTemp$41 > 0) {
              ha.field_g = wa.field_a % 15 % 2;
            }
            fieldTemp$42 = jf.field_j;
            jf.field_j = jf.field_j - 1;
            if (fieldTemp$42 <= 0) {
              return;
            }
            rj.field_c = ((int)(md.field_b * var1Lifetime3Lifetime1) << 16) + (r.field_ub + ((int)(var1Lifetime3Lifetime1 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime3Lifetime1));
            return;
          }
          g.field_j = g.field_j % 4;
          ul.field_a = ld.field_b[g.field_j];
          g.field_j = g.field_j + 1;
        }
        var1Lifetime4 = (float)(50 - jf.field_j) * 0.0066999997943639755f;
        fieldTemp$45 = wa.field_a;
        wa.field_a = wa.field_a - 1;
        if (fieldTemp$45 <= 0) {
          fieldTemp$46 = jf.field_j;
          jf.field_j = jf.field_j - 1;
          if (fieldTemp$46 <= 0) {
            return;
          }
          rj.field_c = ((int)(md.field_b * var1Lifetime4) << 16) + (r.field_ub + ((int)(var1Lifetime4 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime4));
          return;
        }
        ha.field_g = wa.field_a % 15 % 2;
        fieldTemp$47 = jf.field_j;
        jf.field_j = jf.field_j - 1;
        if (fieldTemp$47 <= 0) {
          return;
        }
        rj.field_c = ((int)(md.field_b * var1Lifetime4) << 16) + (r.field_ub + ((int)(var1Lifetime4 * fe.field_c) << 8) + (int)(uk.field_j * var1Lifetime4));
        return;
    }

    final static wa p(int param0) {
        if (null == uf.field_f) {
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
            if (param0 >= 71) {
                return uf.field_f;
            }
            return (wa) null;
        }
        if (param0 >= 71) {
            return uf.field_f;
        }
        return (wa) null;
    }

    final void a(int param0, int param1, String param2) {
        boolean stackIn_9_1 = false;
        ni stackIn_14_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ni var6 = null;
        var5 = Geoblox.field_C;
        try {
          if (this.field_rb) {
            return;
          }
          if (param1 != 19810) {
            return;
          }
          stackIn_9_1 = !(256 != param0);
          this.field_ob = stackIn_9_1;
          this.field_rb = true;
          this.field_pb.a(4210752, 8405024, (byte) -103);
          var6 = new ni(this, this.field_jb, param2);
          if (param0 == 5) {
            var6.a(nf.field_E, 1, 11);
            var6.a(rj.field_e, 1, 17);
          } else {
            if (param0 != 256) {
              stackIn_14_0 = var6;
              if (this.field_mb) {
                stackIn_15_1 = a.field_b;
              } else {
                stackIn_15_1 = ll.field_b;
              }
              ((ni) (Object) stackIn_14_0).a(stackIn_15_1, 1, -1);
            } else {
              var6.a(-2, a.field_b, (bb) (this));
            }
          }
          if (param0 == 3) {
            var6.a(ee.field_y, param1 ^ 19811, 7);
          } else {
            if (param0 != 4) {
              if (param0 == 6) {
                var6.a(jc.field_c, 1, 9);
              } else {
                if (param0 != 9) {
                  this.b(var6, param1 ^ -19736);
                  return;
                }
                var6.a(-2, fi.field_h, (bb) (this));
              }
            } else {
              var6.a(hb.field_h, 1, 8);
            }
          }
          this.b(var6, param1 ^ -19736);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("f.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static boolean b(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -111) {
            field_lb = (String[]) null;
          }
          stackIn_3_0 = pa.a(param1, true, 10, 87);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("f.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void c(boolean param0) {
        ni var2 = null;
        this.field_pb.a(4210752, 2121792, (byte) -103);
        if (!param0) {
            var2 = new ni(this, this.field_jb, oe.field_O);
            var2.a(jk.field_c, 1, 15);
            this.b(var2, -23);
            return;
        }
        field_kb = (java.awt.Canvas) null;
        var2 = new ni(this, this.field_jb, oe.field_O);
        var2.a(jk.field_c, 1, 15);
        this.b(var2, -23);
    }

    static {
        field_hb = new gk();
        field_lb = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_nb = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}

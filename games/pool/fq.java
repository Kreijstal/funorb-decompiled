/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends qq implements tb {
    static boolean field_Gb;
    static String field_Db;
    static String field_Bb;
    private boolean field_Fb;
    private boolean field_Eb;
    static int[] field_Hb;
    private nf field_Cb;

    final static boolean m(int param0) {
        if (param0 == 0) {
          return null == ne.field_u ? um.field_e : true;
        }
        fq.m(71);
        return null == ne.field_u ? um.field_e : true;
    }

    public static void l(int param0) {
        field_Bb = null;
        field_Db = null;
        if (param0 != 5) {
          return;
        }
        field_Hb = null;
    }

    private final void a(wc param0, int param1, boolean param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        wk var5 = null;
        int var6 = 0;
        var6 = Pool.field_O;
        try {
          this.field_Fb = true;
          if (param1 != 5) {
            field_Gb = true;
          }
          if (!param0.field_f) {
            if (null == param0.field_c) {
              var4 = param0.field_b;
              if (param0.field_g == 248) {
                if (!param2) {
                  uf.r((byte) -80);
                }
                var4 = hb.field_b;
                this.field_Eb = true;
              }
            } else {
              var4 = gi.field_n;
              if (null != this.field_Cb) {
                this.field_Cb.a(param1 ^ 16777210);
              }
            }
          } else {
            var4 = ud.field_H;
          }
          var5 = new wk((qq) (this), bi.field_e, var4);
          if (param0.field_f) {
            if (param0.field_e) {
              this.d(new sd(this), 30);
              return;
            }
            var5.a(fg.field_c, param1 - 88, (cc) (this));
          } else {
            if (this.field_Eb) {
              var5.a(fg.field_c, -123, (cc) (this));
            } else {
              if (param0.field_g == 5) {
                var5.a(11, hb.field_c, param1 ^ 4);
                var5.a(17, dj.field_e, 1);
              } else {
                var5.a(-1, jk.field_a, param1 ^ 4);
              }
            }
            if (3 == param0.field_g) {
              var5.a(7, o.field_w, param1 ^ 4);
            } else {
              if (param0.field_g != 6) {
                this.d(var5, 30);
                return;
              }
              var5.a(9, e.field_f, 1);
            }
          }
          this.d(var5, 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("fq.TB(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        if (this.field_Eb) {
          t.a(115, false, true);
          return;
        }
        nm.a((byte) 41);
        if (!param0) {
          return;
        }
        try {
          this.k(17);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fq.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final boolean g(byte param0) {
        wc var2 = null;
        wc var2Lifetime1;
        if (param0 != -20) {
          field_Bb = (String) null;
          if (!this.field_R) {
            return super.g((byte) -20);
          }
          if (this.field_Fb) {
            return super.g((byte) -20);
          }
          var2 = hi.a(true);
          if (var2 != null) {
            this.a(var2, param0 + 25, false);
            return super.g((byte) -20);
          }
          return super.g((byte) -20);
        }
        if (!this.field_R) {
          return super.g((byte) -20);
        }
        if (this.field_Fb) {
          return super.g((byte) -20);
        }
        var2Lifetime1 = hi.a(true);
        if (var2Lifetime1 != null) {
          this.a(var2Lifetime1, param0 + 25, false);
          return super.g((byte) -20);
        }
        return super.g((byte) -20);
    }

    fq(lq param0, nf param1) {
        super(param0, bi.field_e, tk.field_j, false, false);
        try {
          this.field_Cb = param1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void p(byte param0) {
        this.a(gg.a(248, true, hb.field_b), 5, true);
        if (param0 > -44) {
          field_Gb = true;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4;
        lg.field_s.a(true, (byte) 106, (java.awt.Component) ((Object) vj.a((byte) -37)));
        sg.field_P = 0;
        sq.field_b = param1;
        if (param0 != -3405) {
          return;
        }
        ga.m(param0 ^ 22150);
        if (!dn.a(true, sq.field_b)) {
          if (sq.field_b < 0) {
            if (-2 == sq.field_b) {
              ac.a(256, false, true, ul.field_m);
              if (sq.field_b != -2 &&
                sq.field_b != -4) {
                vj.a((byte) -27, il.field_c[3]);
              }
              return;
            }
            if (sq.field_b == -5) {
              ac.a(256, false, true, ul.field_m);
            } else {
              if (sq.field_b == -4) {
                ac.a(256, false, true, ul.field_m);
              }
            }
          } else {
            if (s.field_c[sq.field_b].field_n) {
              ac.a(256, false, true, ul.field_m);
            } else {
              if (-2 == sq.field_b) {
                ac.a(256, false, true, ul.field_m);
              } else {
                if (sq.field_b == -5) {
                  ac.a(256, false, true, ul.field_m);
                } else {
                  if (sq.field_b == -4) {
                    ac.a(256, false, true, ul.field_m);
                  }
                }
              }
            }
          }
          if (sq.field_b == -2) {
            return;
          }
          if (sq.field_b == -4) {
            return;
          }
          vj.a((byte) -27, il.field_c[3]);
          return;
        }
        s.field_c[sq.field_b].field_w = param2;
        var4 = 0;
        if (sq.field_b == 21) {
          var4 = -1;
        }
        s.field_c[sq.field_b].a(0, var4, param3);
        if (sq.field_b != 21) {
          if (sq.field_b < 0) {
            if (-2 == sq.field_b) {
              ac.a(256, false, true, ul.field_m);
              if (sq.field_b != -2 &&
                sq.field_b != -4) {
                vj.a((byte) -27, il.field_c[3]);
              }
              return;
            }
            if (sq.field_b == -5) {
              ac.a(256, false, true, ul.field_m);
              if (sq.field_b != -2 &&
                sq.field_b != -4) {
                vj.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (sq.field_b == -4) {
              ac.a(256, false, true, ul.field_m);
            }
          } else {
            if (s.field_c[sq.field_b].field_n) {
              ac.a(256, false, true, ul.field_m);
            } else {
              if (-2 == sq.field_b) {
                ac.a(256, false, true, ul.field_m);
                if (sq.field_b != -2 &&
                  sq.field_b != -4) {
                  vj.a((byte) -27, il.field_c[3]);
                  return;
                }
                return;
              }
              if (sq.field_b == -5) {
                ac.a(256, false, true, ul.field_m);
                if (sq.field_b != -2 &&
                  sq.field_b != -4) {
                  vj.a((byte) -27, il.field_c[3]);
                  return;
                }
                return;
              }
              if (sq.field_b == -4) {
                ac.a(256, false, true, ul.field_m);
                if (sq.field_b != -2 &&
                  sq.field_b != -4) {
                  vj.a((byte) -27, il.field_c[3]);
                  return;
                }
                return;
              }
            }
          }
        } else {
          id.a(-83, param3);
          if (sq.field_b < 0) {
            if (-2 == sq.field_b) {
              ac.a(256, false, true, ul.field_m);
              if (sq.field_b != -2 &&
                sq.field_b != -4) {
                vj.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (sq.field_b == -5) {
              ac.a(256, false, true, ul.field_m);
              if (sq.field_b != -2 &&
                sq.field_b != -4) {
                vj.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (sq.field_b == -4) {
              ac.a(256, false, true, ul.field_m);
            }
          } else {
            if (s.field_c[sq.field_b].field_n) {
              ac.a(256, false, true, ul.field_m);
              if (sq.field_b != -2 &&
                sq.field_b != -4) {
                vj.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (-2 == sq.field_b) {
              ac.a(256, false, true, ul.field_m);
              if (sq.field_b != -2 &&
                sq.field_b != -4) {
                vj.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (sq.field_b == -5) {
              ac.a(256, false, true, ul.field_m);
              if (sq.field_b != -2 &&
                sq.field_b != -4) {
                vj.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (sq.field_b == -4) {
              ac.a(256, false, true, ul.field_m);
              if (sq.field_b != -2 &&
                sq.field_b != -4) {
                vj.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
          }
        }
        if (sq.field_b == -2) {
          return;
        }
        if (sq.field_b == -4) {
          return;
        }
        vj.a((byte) -27, il.field_c[3]);
        return;
    }

    static {
        field_Db = "On";
        field_Bb = "Set up new game";
        field_Hb = new int[]{2, 20, 21, 49, 6, 5, 12, 13};
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends fd implements bo, ta {
    private boolean field_T;
    private wa field_E;
    private wa field_K;
    private boolean field_I;
    private tg field_J;
    private tg field_P;
    static wf field_M;
    private String field_S;
    private boolean field_H;
    private tg field_F;
    static String field_O;
    static int field_D;
    static id field_Q;
    static int field_G;
    static String field_R;
    static String field_L;

    final void a(int param0, String param1) {
        wa var3 = null;
        String var4 = null;
        if (param0 > -101) {
          return;
        }
        try {
          var3 = this.field_E;
          var4 = param1;
          var3.a(var4, 81, false);
          this.field_K.g(0);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ca.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        int var2;
        var2 = 63 / ((param0 + 91) / 35);
        if (sd.a(-11532) ||
          !(this.field_E.field_n.length() <= 0) &&
          !(0 >= this.field_K.field_n.length())) {
          ub.a((byte) 102, this.field_E.field_n, this.field_K.field_n);
        }
    }

    public final void a(wa param0, int param1) {
        try {
          if (param1 != 13) {
            field_R = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ca.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(byte param0) {
        field_L = null;
        field_Q = null;
        field_R = null;
        field_M = null;
        field_O = null;
        if (param0 != 15) {
          ca.b(-80, -39, -127);
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          if (param0 != 2) {
            field_M = (wf) null;
          }
          while (nd.b((byte) -103)) {
            co.field_k.e(-126);
            if (co.field_k.b(false)) {
              var1_int = 1;
            }
            if (um.field_Gb != 13) {
              continue;
            }
            var2 = 1;
          }
          co.field_k.a(pn.a(hk.field_Jb, nl.field_u, (byte) 97), false, pn.a(a.field_y, ii.field_b, (byte) 10));
          if (co.field_k.b(false)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            co.field_k.field_d >= 0) {
            var3 = rb.field_a[co.field_k.field_d];
            if (2 == var3 ||
              5 == var3) {
              nm.b(param0 ^ 3);
            }
          } else {
            if (var2 != 0 &&
              p.field_d != 2) {
              nm.b(1);
            }
          }
          if (0 == var3 &&
            2 == p.field_d) {
            var4 = hc.a(-9986) - af.field_e;
            var6 = (int)((10999L - var4) / 1000L);
            if (var6 <= 0) {
              nm.a(true, 5, (byte) 71);
              var3 = 2;
            }
          }
          stackIn_25_0 = var3;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "ca.P(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        this.field_E.g(0);
        this.field_K.g(0);
        if (param0 > -77) {
          this.field_P = (tg) null;
        }
    }

    ca(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ol) null);
        ej dupTemp$0 = null;
        ej dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        tg stackIn_18_1 = null;
        tg stackIn_18_2 = null;
        tg stackIn_19_1 = null;
        tg stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        hf var6 = null;
        RuntimeException var6_ref = null;
        e var7 = null;
        String var8 = null;
        co var9 = null;
        ej var12 = null;
        ej var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_T = stackIn_4_1;
          this.field_S = param1;
          stackIn_7_1 = (param3);
          this.field_I = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_H = stackIn_10_1;
          if (this.field_H && (this.field_I ||
            this.field_T)) {
            throw new IllegalStateException();
          }
          this.field_E = (wa) ((Object) new vd(param0, (cd) (this), 100));
          this.field_K = (wa) ((Object) new vd("", (cd) (this), 20));
          if (!this.field_H) {
            this.field_F = new tg(aj.field_q, (cd) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_T) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = dd.field_e;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = jl.field_D;
            }
            this.field_P = new tg(stackIn_19_3, (cd) null);
            if (this.field_I) {
              this.field_J = new tg(bj.field_g, (cd) (this));
            }
          } else {
            this.field_F = new tg(tn.field_e, (cd) null);
            this.field_P = new tg(og.field_k, (cd) null);
            this.field_E.field_C = false;
          }
          this.field_E.field_w = (ol) ((Object) new cc(10000536));
          this.field_K.field_w = (ol) ((Object) new a(10000536));
          var6 = new hf();
          this.field_F.field_w = (ol) ((Object) var6);
          if (this.field_P != null) {
            this.field_P.field_w = (ol) ((Object) var6);
          }
          this.field_E.field_h = sn.field_n;
          if (this.field_J != null) {
            this.field_J.field_w = (ol) ((Object) var6);
          }
          if (null != this.field_J) {
            this.field_J.field_h = mh.field_j;
          }
          if (!this.field_H) {
            if (!this.field_T) {
              this.field_P.field_w = (ol) ((Object) new ti());
            } else {
              this.field_P.field_h = fn.field_f;
              this.field_P.field_w = (ol) ((Object) new ti());
            }
          } else {
            this.field_P.field_h = pj.field_b;
          }
          this.field_u = 15;
          var7 = dj.field_h;
          if (this.field_S != null) {
            this.field_u = this.field_u + (var7.a(this.field_S, -40 + this.field_g, var7.field_H) + 5);
          }
          var8 = uh.field_g;
          var9 = bd.a(-78, mb.g((byte) 39));
          if (aa.field_b != var9) {
            if (var9 == Virogrid.field_O) {
              var8 = ll.field_c;
            }
          } else {
            var8 = gf.field_y;
          }
          dupTemp$0 = new ej(10, this.field_u, this.field_g - 20, 25, this.field_E, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a((fi) (dupTemp$0), (byte) -78);
          this.field_u = this.field_u + (5 + ((fi) ((Object) var12)).field_m);
          dupTemp$1 = new ej(10, this.field_u, this.field_g - 20, 25, this.field_K, false, 80, 3, var7, 16777215, hm.field_b);
          var13 = dupTemp$1;
          this.a((fi) (dupTemp$1), (byte) -78);
          this.field_u = this.field_u + (5 + ((fi) ((Object) var13)).field_m);
          this.field_F.field_o = (cd) (this);
          if (this.field_J != null) {
            this.field_J.field_o = (cd) (this);
          }
          if (this.field_P != null) {
            this.field_P.field_o = (cd) (this);
          }
          if (this.field_J != null) {
            this.field_F.a(30, true, this.field_u, 85, this.field_g - 95);
            this.field_u = this.field_u + 60;
          } else {
            this.field_F.a(30, true, this.field_u, 8, this.field_g - 16);
            this.field_u = this.field_u + 35;
          }
          if (this.field_J != null) {
            this.field_J.a(30, true, this.field_u, 8, this.field_g - 6 - 10);
            this.field_u = this.field_u + 35;
          }
          if (null != this.field_P) {
            if (!this.field_H &&
              !this.field_T) {
              this.field_P.a(20, true, this.field_u, 8, 40);
              this.field_u = this.field_u + 25;
            } else {
              this.field_P.a(30, true, this.field_u, 8, -10 + (-6 + this.field_g));
              this.field_u = this.field_u + 35;
            }
          }
          this.a(this.field_u + 3, true, 0, 0, this.field_g);
          this.a((fi) (this.field_F), (byte) -78);
          if (null != this.field_J) {
            this.a((fi) (this.field_J), (byte) -78);
          }
          if (null != this.field_P) {
            this.a((fi) (this.field_P), (byte) -78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ca.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        try {
          if (param1 >= -23) {
            field_D = 103;
          }
          pi.a(param0, 0);
          gk.a(false, bn.field_a, false);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ca.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, 60)) {
            return true;
          }
          if (98 == param2) {
            stackIn_6_0 = this.b(2, param0);
            return stackIn_6_0;
          }
          var5_int = -8 % ((-75 - param3) / 36);
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(-16234, param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ca.AA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(boolean param0, wa param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_E == param1) {
            this.field_K.a((fi) (this), -8515);
          }
          if (param0) {
            field_G = 96;
          }
          if (this.field_K == param1) {
            this.a((byte) -46);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ca.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void b(boolean param0, int param1) {
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param0 ||
          wl.field_d == null) {
          ad.field_h = false;
        }
        if (param1 > -105) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0) {
          if (kh.field_d > 0) {
            kh.field_d = kh.field_d - 1;
          } else {
            if (hn.field_h > 0) {
              hn.field_h = hn.field_h - 1;
            } else {
              if (th.field_z > 0) {
                th.field_z = th.field_z - 1;
              }
            }
          }
        } else {
          if (wl.field_d != null) {
            if (kh.field_d > 0) {
              kh.field_d = kh.field_d - 1;
            } else {
              if (hn.field_h > 0) {
                hn.field_h = hn.field_h - 1;
              } else {
                if (!(th.field_z >= ve.field_t)) {
                  if (th.field_z == 0) {
                    qh.a((byte) -68, false);
                  }
                  th.field_z = th.field_z + 1;
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (la.field_h == null) {
              ad.field_h = false;
              if (hn.field_h > 0) {
                hn.field_h = hn.field_h - 1;
              } else {
                if (th.field_z > 0) {
                  th.field_z = th.field_z - 1;
                } else {
                  if (!(kh.field_d >= ve.field_t)) {
                    if (kh.field_d == 0) {
                      ld.a(0);
                    }
                    kh.field_d = kh.field_d + 1;
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (kh.field_d > 0) {
                kh.field_d = kh.field_d - 1;
              } else {
                if (0 < th.field_z) {
                  th.field_z = th.field_z - 1;
                } else {
                  if (hn.field_h < ve.field_t) {
                    if (hn.field_h == 0) {
                      qh.a((byte) -68, true);
                    }
                    hn.field_h = hn.field_h + 1;
                  }
                }
              }
            }
          }
        }

    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (this.field_S != null) {
          dj.field_h.a(this.field_S, this.field_l + param1 + 20, param2 - (-this.field_u - 15), -40 + this.field_g, this.field_m, 16777215, -1, 1, 0, dj.field_h.field_H);
        }
        if (this.field_J != null) {
          df.b(param1 + 10, param2 + 134, -20 + this.field_g, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final String f(int param0) {
        if (null == this.field_E.field_n) {
          return "";
        }
        if (param0 != -3) {
          return (String) null;
        }
        return this.field_E.field_n;
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 != 13760) {
            field_L = (String) null;
          }
          var3_int = 0;
          while (param0 > 0) {
            var3_int = 1 & param1 | var3_int << 1;
            param0--;
            param1 = param1 >>> 1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "ca.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        int var7 = 0;
        fi var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 12085) {
            var8 = (fi) null;
            this.a((fi) null, '\026', 57, -15);
          }
          if (this.field_F == param1) {
            this.a((byte) -127);
          } else {
            if (this.field_J != param1) {
              if (param1 == this.field_P) {
                if (!this.field_H) {
                  if (this.field_T) {
                    ee.a((byte) 49);
                  } else {
                    g.a((byte) -33);
                  }
                } else {
                  ne.a(17);
                }
              }
            } else {
              va.a(false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ca.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_R = "Similar rating";
        field_L = "This game option is only available to members.";
    }
}

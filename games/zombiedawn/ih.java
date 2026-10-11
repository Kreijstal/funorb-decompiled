/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends hp implements ok, hh {
    static int field_J;
    static int field_F;
    private an field_K;
    private an field_Q;
    private tb field_M;
    private tb field_N;
    static String field_T;
    private String field_P;
    private boolean field_H;
    private boolean field_O;
    private boolean field_L;
    static boolean field_S;
    private an field_R;

    public final void a(tb param0, int param1) {
        try {
          if (param1 != 8) {
            tb var4 = (tb) null;
            this.a((tb) null, 89);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ih.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String b(boolean param0) {
        if (param0) {
          this.field_N = (tb) null;
        }
        if (null == this.field_N.field_o) {
          return "";
        }
        return this.field_N.field_o;
    }

    ih(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (io) null);
        q dupTemp$0 = null;
        q dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        an stackIn_17_1 = null;
        an stackIn_17_2 = null;
        an stackIn_18_1 = null;
        an stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        vm var6 = null;
        RuntimeException var6_ref = null;
        rb var7 = null;
        String var8 = null;
        sn var9 = null;
        q var12 = null;
        q var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_L = stackIn_4_1;
          this.field_P = param1;
          stackIn_7_1 = (param2);
          this.field_O = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_H = stackIn_10_1;
          if (this.field_O && (this.field_L ||
            this.field_H)) {
            throw new IllegalStateException();
          }
          this.field_N = (tb) ((Object) new ic(param0, (sk) (this), 100));
          this.field_M = (tb) ((Object) new ic("", (sk) (this), 20));
          if (this.field_O) {
            this.field_R = new an(el.field_i, (sk) null);
            this.field_Q = new an(qd.field_d, (sk) null);
            this.field_N.field_C = false;
          } else {
            this.field_R = new an(gk.field_H, (sk) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_H) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = jk.field_g;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = hl.field_h;
            }
            this.field_Q = new an(stackIn_18_3, (sk) null);
            if (this.field_L) {
              this.field_K = new an(hk.field_P, (sk) (this));
            }
          }
          this.field_N.field_h = (io) ((Object) new tc(10000536));
          this.field_M.field_h = (io) ((Object) new jm(10000536));
          var6 = new vm();
          this.field_R.field_h = (io) ((Object) var6);
          if (null != this.field_Q) {
            this.field_Q.field_h = (io) ((Object) var6);
          }
          this.field_N.field_s = ia.field_a;
          if (null != this.field_K) {
            this.field_K.field_h = (io) ((Object) var6);
          }
          if (null != this.field_K) {
            this.field_K.field_s = nk.field_f;
          }
          if (this.field_O) {
            this.field_Q.field_s = cm.field_a;
          } else {
            if (this.field_H) {
              this.field_Q.field_s = fo.field_c;
              this.field_Q.field_h = (io) ((Object) new dp());
            } else {
              this.field_Q.field_h = (io) ((Object) new dp());
            }
          }
          this.field_j = 15;
          var7 = ia.field_e;
          if (this.field_P != null) {
            this.field_j = this.field_j + (5 + var7.b(this.field_P, -40 + this.field_i, var7.field_I));
          }
          var8 = qi.field_C;
          var9 = ne.a(hc.a(0), 0);
          if (var9 != em.field_J) {
            if (wn.field_a == var9) {
              var8 = uh.field_h;
            }
          } else {
            var8 = qn.field_a;
          }
          dupTemp$0 = new q(10, this.field_j, -20 + this.field_i, 25, this.field_N, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(dupTemp$0, 10);
          this.field_j = this.field_j + (((ga) ((Object) var12)).field_n + 5);
          dupTemp$1 = new q(10, this.field_j, this.field_i - 20, 25, this.field_M, false, 80, 3, var7, 16777215, ui.field_c);
          var13 = dupTemp$1;
          this.a(dupTemp$1, 10);
          this.field_R.field_v = (sk) (this);
          this.field_j = this.field_j + (5 + ((ga) ((Object) var13)).field_n);
          if (null != this.field_K) {
            this.field_K.field_v = (sk) (this);
          }
          if (this.field_Q != null) {
            this.field_Q.field_v = (sk) (this);
          }
          if (this.field_K == null) {
            this.field_R.a(80, this.field_j, 8, this.field_i - 6 - 10, 30);
            this.field_j = this.field_j + 35;
          } else {
            this.field_R.a(30, this.field_j, 85, this.field_i - 95, 30);
            this.field_j = this.field_j + 60;
          }
          if (null != this.field_K) {
            this.field_K.a(94, this.field_j, 8, -6 + (this.field_i - 10), 30);
            this.field_j = this.field_j + 35;
          }
          if (null != this.field_Q) {
            if (!this.field_O &&
              !this.field_H) {
              this.field_Q.a(81, this.field_j, 8, 40, 20);
              this.field_j = this.field_j + 25;
            } else {
              this.field_Q.a(-126, this.field_j, 8, this.field_i - 6 - 10, 30);
              this.field_j = this.field_j + 35;
            }
          }
          this.a(-116, 0, 0, this.field_i, this.field_j + 3);
          this.a(this.field_R, 10);
          if (this.field_K != null) {
            this.a(this.field_K, 10);
          }
          if (null != this.field_Q) {
            this.a(this.field_Q, 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ih.<init>(");
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
          throw sh.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void h(int param0) {
        if (param0 >= -89) {
          field_F = -81;
        }
        this.field_N.j(0);
        this.field_M.j(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_P != null) {
          ia.field_e.a(this.field_P, 20 + (param2 + this.field_k), param0 - (-this.field_j - 15), this.field_i - 40, this.field_n, 16777215, -1, 1, 0, ia.field_e.field_I);
        }
        if (this.field_K != null) {
          bi.b(10 + param2, param0 + 134, -20 + this.field_i, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0, int param1, boolean param2) {
        vj.field_q = 0;
        ul.field_f = false;
        ha.field_e = false;
        vj.field_o = 0;
        nm.field_b = false;
        if (param2) {
          vf.field_f = param1;
          ma.field_r = -1;
          uo.field_d = false;
          vk.field_c = param0;
          h.field_d = false;
          sm.field_a = -1;
          return;
        }
    }

    final void a(String param0, int param1) {
        tb var3 = null;
        String var4 = null;
        try {
          var3 = this.field_N;
          if (param1 != 20) {
            this.field_R = (an) null;
          }
          var4 = param0;
          var3.a(false, false, var4);
          this.field_M.j(0);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ih.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(tb param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_N) {
            this.field_M.a((byte) 125, (ga) (this));
          }
          var3_int = -126 / ((param1 - 35) / 38);
          if (this.field_M == param0) {
            this.e((byte) -127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ih.L(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ZombieDawn.field_J;
        try {
          if (this.field_R != param2) {
            if (this.field_K == param2) {
              vj.d(51);
            } else {
              if (param2 == this.field_Q) {
                if (!this.field_O) {
                  if (this.field_H) {
                    ZombieDawn.q(-10401);
                  } else {
                    mk.a((byte) -121);
                  }
                } else {
                  cj.d((byte) 111);
                }
              }
            }
          } else {
            this.e((byte) -66);
          }
          if (param1 != -6) {
            this.field_L = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ih.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(-123, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.b((byte) 120, param2);
            return stackIn_5_0;
          }
          if (99 == param1) {
            stackIn_8_0 = this.a(1, param2);
            return stackIn_8_0;
          }
          var5_int = 116 / ((param0 + 83) / 32);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ih.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void e(byte param0) {
        if (param0 > -23) {
          return;
        }
        if (eo.b(127) ||
          !(this.field_N.field_o.length() <= 0) &&
          !(this.field_M.field_o.length() <= 0)) {
          rg.a(this.field_N.field_o, -27, this.field_M.field_o);
        }
    }

    public static void a(int param0) {
        field_T = null;
        if (param0 != -31608) {
          ih.a(120, -75, true);
        }
    }

    static {
        field_T = "Unable to connect to the data server. Please check any firewall you are using.";
        field_F = 0;
    }
}

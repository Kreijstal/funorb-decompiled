/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends cj implements ih, ij {
    private kp field_O;
    private d field_K;
    private boolean field_S;
    private boolean field_N;
    private kp field_H;
    private String field_P;
    private d field_G;
    private boolean field_R;
    static nj field_Q;
    static String field_I;
    static nj field_M;
    private d field_J;
    static int field_L;
    static double field_F;

    private final void a(int param0) {
        if (hi.c((byte) 6) ||
          !(this.field_H.field_w.length() <= 0) &&
          !(this.field_O.field_w.length() <= 0)) {
          la.a(this.field_H.field_w, this.field_O.field_w, 26806);
        }
        if (param0 >= -86) {
          this.field_S = false;
        }
    }

    public final void a(byte param0, kp param1) {
        kp var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 == this.field_H) {
            this.field_O.a((byte) 116, (iq) (this));
          }
          if (param0 < 16) {
            var4 = (kp) null;
            this.a((byte) -64, (kp) null);
          }
          if (this.field_O == param1) {
            this.a(-123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.a(32345, param3);
            return stackIn_6_0;
          }
          if (99 != param2) {
            return false;
          }
          stackIn_9_0 = this.b((byte) -70, param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ob.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(byte param0, String param1) {
        kp var3 = null;
        String var4 = null;
        try {
          if (param0 != -79) {
            field_Q = (nj) null;
          }
          var3 = this.field_H;
          var4 = param1;
          var3.a(var4, -110, false);
          this.field_O.j(param0 ^ -79);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ob.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.applet.Applet e(byte param0) {
        int var1 = 8 % ((6 - param0) / 58);
        if (null != va.field_o) {
          return va.field_o;
        }
        return (java.applet.Applet) ((Object) qe.field_T);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          iq var6 = (iq) null;
          this.a('g', -59, 99, (iq) null);
        }
        if (null != this.field_P) {
          qc.field_x.a(this.field_P, this.field_o + param2 + 20, 15 + this.field_t + param3, this.field_n - 40, this.field_s, 16777215, -1, 1, 0, qc.field_x.field_z);
        }
        if (null != this.field_K) {
          bi.b(10 + param2, 134 + param3, this.field_n - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void a(byte param0) {
        field_M = null;
        if (param0 != -103) {
          ob.e((byte) 61);
        }
        field_Q = null;
        field_I = null;
    }

    public final void a(int param0, kp param1) {
        try {
          if (param0 >= -10) {
            this.field_H = (kp) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ob.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ob(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ur) null);
        mg dupTemp$0 = null;
        mg dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        d stackIn_17_1 = null;
        d stackIn_17_2 = null;
        d stackIn_18_1 = null;
        d stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        vo var6 = null;
        RuntimeException var6_ref = null;
        cc var7 = null;
        String var8 = null;
        ej var9 = null;
        mg var12 = null;
        mg var13 = null;
        try {
          this.field_P = param1;
          stackIn_4_1 = (param2);
          this.field_N = stackIn_4_1;
          stackIn_7_1 = (param4);
          this.field_R = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_S = stackIn_10_1;
          if (this.field_N && (this.field_S ||
            this.field_R)) {
            throw new IllegalStateException();
          }
          this.field_H = (kp) ((Object) new br(param0, (uf) (this), 100));
          this.field_O = (kp) ((Object) new br("", (uf) (this), 20));
          if (this.field_N) {
            this.field_J = new d(bk.field_d, (uf) null);
            this.field_G = new d(jd.field_b, (uf) null);
            this.field_H.field_F = false;
          } else {
            this.field_J = new d(wp.field_d, (uf) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_R) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ap.field_f;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = fd.field_o;
            }
            this.field_G = new d(stackIn_18_3, (uf) null);
            if (this.field_S) {
              this.field_K = new d(pk.field_r, (uf) (this));
            }
          }
          this.field_H.field_B = (ur) ((Object) new ml(10000536));
          this.field_O.field_B = (ur) ((Object) new om(10000536));
          var6 = new vo();
          this.field_J.field_B = (ur) ((Object) var6);
          if (this.field_G != null) {
            this.field_G.field_B = (ur) ((Object) var6);
          }
          this.field_H.field_q = wh.field_A;
          if (this.field_K != null) {
            this.field_K.field_B = (ur) ((Object) var6);
          }
          if (null != this.field_K) {
            this.field_K.field_q = ni.field_h;
          }
          if (this.field_N) {
            this.field_G.field_q = fm.field_h;
          } else {
            if (!this.field_R) {
              this.field_G.field_B = (ur) ((Object) new jc());
            } else {
              this.field_G.field_q = he.field_z;
              this.field_G.field_B = (ur) ((Object) new jc());
            }
          }
          this.field_t = 15;
          var7 = qc.field_x;
          if (this.field_P != null) {
            this.field_t = this.field_t + (5 + var7.a(this.field_P, this.field_n - 40, var7.field_z));
          }
          var8 = ll.field_a;
          var9 = kf.a((byte) -100, ob.e((byte) -52));
          if (li.field_j == var9) {
            var8 = la.field_c;
          } else {
            if (var9 == la.field_i) {
              var8 = w.field_A;
            }
          }
          dupTemp$0 = new mg(10, this.field_t, -20 + this.field_n, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.c((byte) -107, dupTemp$0);
          this.field_t = this.field_t + (5 + ((iq) ((Object) var12)).field_s);
          dupTemp$1 = new mg(10, this.field_t, -20 + this.field_n, 25, this.field_O, false, 80, 3, var7, 16777215, uc.field_c);
          var13 = dupTemp$1;
          this.c((byte) 83, dupTemp$1);
          this.field_J.field_v = (uf) (this);
          this.field_t = this.field_t + (((iq) ((Object) var13)).field_s + 5);
          if (null != this.field_K) {
            this.field_K.field_v = (uf) (this);
          }
          if (this.field_G != null) {
            this.field_G.field_v = (uf) (this);
          }
          if (this.field_K != null) {
            this.field_J.a(false, 85, this.field_t, 30, -95 + this.field_n);
            this.field_t = this.field_t + 60;
          } else {
            this.field_J.a(false, 8, this.field_t, 30, -10 + (-6 + this.field_n));
            this.field_t = this.field_t + 35;
          }
          if (null != this.field_K) {
            this.field_K.a(false, 8, this.field_t, 30, this.field_n - 6 - 10);
            this.field_t = this.field_t + 35;
          }
          if (this.field_G != null) {
            if (!this.field_N &&
              !this.field_R) {
              this.field_G.a(false, 8, this.field_t, 20, 40);
              this.field_t = this.field_t + 25;
            } else {
              this.field_G.a(false, 8, this.field_t, 30, -6 + this.field_n - 10);
              this.field_t = this.field_t + 35;
            }
          }
          this.a(false, 0, 0, this.field_t + 3, this.field_n);
          this.c((byte) 85, this.field_J);
          if (null != this.field_K) {
            this.c((byte) -43, this.field_K);
          }
          if (null != this.field_G) {
            this.c((byte) 99, this.field_G);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ob.<init>(");
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
          throw wn.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final String j(int param0) {
        if (null != this.field_H.field_w) {
          if (param0 != 5607) {
            this.a(true, 116, -61, 8);
          }
          return this.field_H.field_w;
        }
        return "";
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          var6_int = -35 / ((param2 + 63) / 51);
          if (param1 == this.field_J) {
            this.a(-113);
          } else {
            if (param1 != this.field_K) {
              if (this.field_G == param1) {
                if (this.field_N) {
                  rk.h(-128);
                } else {
                  if (this.field_R) {
                    sg.b((byte) 81);
                  } else {
                    oq.a(true);
                  }
                }
              }
            } else {
              ff.b((byte) -104);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ob.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void i(int param0) {
        this.field_H.j(param0 ^ param0);
        this.field_O.j(0);
    }

    static {
        field_Q = new nj();
        field_I = "Please log in as a subscribing member to access this feature.";
        field_F = -1.0;
        field_M = new nj();
    }
}

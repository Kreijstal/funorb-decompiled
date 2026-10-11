/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends ma implements ha, mj {
    private String field_V;
    static km field_Q;
    private qn field_N;
    private boolean field_Y;
    private fb field_M;
    static pf field_R;
    private fb field_L;
    private boolean field_T;
    static String field_X;
    private fb field_O;
    static String field_S;
    static String field_P;
    private boolean field_K;
    static id field_W;
    private qn field_U;

    public final void b(qn param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 3) {
            return;
          }
          if (this.field_N == param0) {
            this.field_U.a(0, (mf) (this));
          }
          if (this.field_U == param0) {
            this.h((byte) -85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wf.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    wf(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (jm) null);
        kg dupTemp$0 = null;
        kg dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        fb stackIn_18_1 = null;
        fb stackIn_18_2 = null;
        fb stackIn_19_1 = null;
        fb stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        sf var6 = null;
        RuntimeException var6_ref = null;
        lh var7 = null;
        String var8 = null;
        jd var9 = null;
        kg var12 = null;
        kg var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_Y = stackIn_4_1;
          this.field_V = param1;
          stackIn_7_1 = (param2);
          this.field_T = stackIn_7_1;
          stackIn_10_1 = (param4);
          this.field_K = stackIn_10_1;
          if (this.field_T && (this.field_Y ||
            this.field_K)) {
            throw new IllegalStateException();
          }
          this.field_N = (qn) ((Object) new bg(param0, (rg) (this), 100));
          this.field_U = (qn) ((Object) new bg("", (rg) (this), 20));
          if (!this.field_T) {
            this.field_M = new fb(ua.field_c, (rg) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_K) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = fa.field_k;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = jd.field_g;
            }
            this.field_O = new fb(stackIn_19_3, (rg) null);
            if (this.field_Y) {
              this.field_L = new fb(fd.field_o, (rg) (this));
            }
          } else {
            this.field_M = new fb(hl.field_f, (rg) null);
            this.field_O = new fb(sn.field_b, (rg) null);
            this.field_N.field_H = false;
          }
          this.field_N.field_n = (jm) ((Object) new wc(10000536));
          this.field_U.field_n = (jm) ((Object) new hk(10000536));
          var6 = new sf();
          this.field_M.field_n = (jm) ((Object) var6);
          if (null != this.field_O) {
            this.field_O.field_n = (jm) ((Object) var6);
          }
          this.field_N.field_j = lk.field_b;
          if (null != this.field_L) {
            this.field_L.field_n = (jm) ((Object) var6);
          }
          if (null != this.field_L) {
            this.field_L.field_j = sl.field_d;
          }
          if (!this.field_T) {
            if (!this.field_K) {
              this.field_O.field_n = (jm) ((Object) new wj());
            } else {
              this.field_O.field_j = qd.field_I;
              this.field_O.field_n = (jm) ((Object) new wj());
            }
          } else {
            this.field_O.field_j = ao.field_i;
          }
          this.field_r = 15;
          var7 = rb.field_b;
          if (this.field_V != null) {
            this.field_r = this.field_r + (5 + var7.b(this.field_V, this.field_y - 40, var7.field_C));
          }
          var8 = rc.field_e;
          var9 = ja.a((byte) 127, bh.i(81));
          if (var9 != ph.field_g) {
            if (le.field_g == var9) {
              var8 = oj.field_a;
            }
          } else {
            var8 = em.field_k;
          }
          dupTemp$0 = new kg(10, this.field_r, this.field_y - 20, 25, this.field_N, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b(dupTemp$0, 95);
          this.field_r = this.field_r + (((mf) ((Object) var12)).field_C + 5);
          dupTemp$1 = new kg(10, this.field_r, this.field_y - 20, 25, this.field_U, false, 80, 3, var7, 16777215, di.field_Qb);
          var13 = dupTemp$1;
          this.b(dupTemp$1, 95);
          this.field_r = this.field_r + (5 + ((mf) ((Object) var13)).field_C);
          this.field_M.field_p = (rg) (this);
          if (null != this.field_L) {
            this.field_L.field_p = (rg) (this);
          }
          if (this.field_O != null) {
            this.field_O.field_p = (rg) (this);
          }
          if (null == this.field_L) {
            this.field_M.a(this.field_r, 34, 30, -6 + this.field_y - 10, 8);
            this.field_r = this.field_r + 35;
          } else {
            this.field_M.a(this.field_r, 34, 30, -95 + this.field_y, 85);
            this.field_r = this.field_r + 60;
          }
          if (this.field_L != null) {
            this.field_L.a(this.field_r, 34, 30, -6 + this.field_y - 10, 8);
            this.field_r = this.field_r + 35;
          }
          if (null != this.field_O) {
            if (!this.field_T &&
              !this.field_K) {
              this.field_O.a(this.field_r, 34, 20, 40, 8);
              this.field_r = this.field_r + 25;
            } else {
              this.field_O.a(this.field_r, 34, 30, -10 + (this.field_y - 6), 8);
              this.field_r = this.field_r + 35;
            }
          }
          this.a(0, 34, this.field_r + 3, this.field_y, 0);
          this.b(this.field_M, 95);
          if (null != this.field_L) {
            this.b(this.field_L, 95);
          }
          if (this.field_O != null) {
            this.b(this.field_O, 95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("wf.<init>(");
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
          throw fk.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -80) {
          wf.a(-118);
        }
        if (this.field_V != null) {
          rb.field_b.a(this.field_V, 20 + (this.field_u + param3), this.field_r + param0 + 15, -40 + this.field_y, this.field_C, 16777215, -1, 1, 0, rb.field_b.field_C);
        }
        if (null != this.field_L) {
          wb.a(param3 + 10, 134 + param0, -20 + this.field_y, 4210752);
        }
        super.a(param0, param1, -117, param3);
    }

    public static void a(int param0) {
        field_S = null;
        if (param0 != 35) {
          field_W = (id) null;
        }
        field_W = null;
        field_X = null;
        field_Q = null;
        field_R = null;
        field_P = null;
    }

    final static void a(lm param0, int param1) {
        if (param0 == null) {
          return;
        }
        try {
          bj.a(na.a(param0, 100, 96), true);
          int var2_int = -101 % ((param1 + 24) / 39);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "wf.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void h(byte param0) {
        int var2;
        if (dc.a(124) ||
          !(this.field_N.field_v.length() <= 0) &&
          !(this.field_U.field_v.length() <= 0)) {
          cb.a(82, this.field_U.field_v, this.field_N.field_v);
        }
        var2 = 39 % ((-30 - param0) / 52);
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Chess.field_G;
        try {
          if (this.field_M != param0) {
            if (this.field_L != param0) {
              if (this.field_O == param0) {
                if (this.field_T) {
                  oa.b(-16586);
                } else {
                  if (!this.field_K) {
                    el.h(-117);
                  } else {
                    qf.a(108);
                  }
                }
              }
            } else {
              dc.c((byte) 127);
            }
          } else {
            this.h((byte) -121);
          }
          if (param4 != -24221) {
            this.field_K = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("wf.DA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(qn param0, int param1) {
        try {
          if (param1 != 10999) {
            wf.a(-13);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "wf.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Frame param0, jk param1, int param2) {
        nl var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Chess.field_G;
        try {
          while (true) {
            var3 = param1.a(param0, false);
            while (0 == var3.field_f) {
              bc.a(10L, (byte) 17);
            }
            if (var3.field_f != 1) {
              bc.a(100L, (byte) -104);
              continue;
            }
            break;
          }
          if (param2 < 48) {
            return;
          }
          param0.setVisible(false);
          param0.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("wf.K(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void g(byte param0) {
        int var2 = -102 % ((param0 - 40) / 38);
        this.field_N.i(-12881);
        this.field_U.i(-12881);
    }

    final void a(String param0, int param1) {
        qn var3 = null;
        String var4 = null;
        if (param1 != 20) {
          return;
        }
        try {
          var3 = this.field_N;
          var4 = param0;
          var3.a(0, false, var4);
          this.field_U.i(param1 ^ -12869);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "wf.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String i(byte param0) {
        if (this.field_N.field_v == null) {
          return "";
        }
        int var2 = 33 % ((param0 + 23) / 48);
        return this.field_N.field_v;
    }

    final static int c(boolean param0) {
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        jk var8 = null;
        var7 = Chess.field_G;
        try {
          var1_int = 0;
          if (!param0) {
            var8 = (jk) null;
            wf.a((java.awt.Frame) null, (jk) null, -94);
          }
          var2 = 0;
          while (kf.d(18954)) {
            ol.field_R.c((byte) -42);
            if (ol.field_R.d((byte) 101)) {
              var1_int = 1;
            }
            if (13 != vg.field_a) {
              continue;
            }
            var2 = 1;
          }
          ol.field_R.a(fe.a(re.field_m, 1, ag.field_f), 99, fe.a(hn.field_k, 1, rf.field_b));
          if (ol.field_R.d((byte) 124)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            ol.field_R.field_h >= 0) {
            var3 = fi.field_c[ol.field_R.field_h];
            if (var3 == 2 ||
              var3 == 5) {
              mh.b(13);
            }
          } else {
            if (var2 != 0 &&
              gm.field_f != 2) {
              mh.b(13);
            }
          }
          if (0 == var3 &&
            gm.field_f == 2) {
            var4 = -jg.field_M + ud.a(2);
            var6 = (int)((10999L - var4) / 1000L);
            if (0 >= var6) {
              qh.a(false, true, 5);
              var3 = 2;
            }
          }
          stackIn_30_0 = var3;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "wf.J(" + param0 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(param3, 27964);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param3, (byte) -73);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("wf.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_X = "Only show private chat from my friends and opponents";
        field_S = "<%0>%";
        field_P = "Bishop";
    }
}

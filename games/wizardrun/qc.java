/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends pe implements fj, qd {
    private boolean field_O;
    private boolean field_P;
    private og field_Q;
    private pl field_M;
    static o[] field_E;
    private String field_F;
    private pl field_G;
    private boolean field_J;
    private og field_K;
    static String field_N;
    static String field_I;
    static int field_L;
    private pl field_H;

    final void a(int param0, String param1) {
        og var3 = null;
        String var4 = null;
        try {
          var3 = this.field_K;
          if (param0 != 5990) {
            field_E = (o[]) null;
          }
          var4 = param1;
          var3.a(-1, false, var4);
          this.field_Q.e(true);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "qc.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(og param0, int param1) {
        try {
          if (param1 != 5) {
            pl var4 = (pl) null;
            this.a(56, (pl) null, 121, 39, 55);
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "qc.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        if (param0 != 4210752) {
          return;
        }
        if (qi.d(-1) ||
          !(0 >= this.field_K.field_k.length()) &&
          !(this.field_Q.field_k.length() <= 0)) {
          w.a(this.field_Q.field_k, this.field_K.field_k, -124);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_F != null) {
          gh.field_b.a(this.field_F, 20 + (param0 + this.field_o), 15 + (this.field_l + param3), this.field_r - 40, this.field_n, 16777215, -1, 1, 0, gh.field_b.field_M);
        }
        if (null != this.field_M) {
          ed.f(10 + param0, 134 + param3, this.field_r - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1 != -39) {
            stackIn_6_0 = (Class) null;
            return stackIn_6_0;
          }
          if (param0.equals("I")) {
            stackIn_9_0 = Integer.TYPE;
            return stackIn_9_0;
          }
          if (param0.equals("S")) {
            stackIn_12_0 = Short.TYPE;
            return stackIn_12_0;
          }
          if (param0.equals("J")) {
            stackIn_16_0 = Long.TYPE;
            return stackIn_16_0;
          }
          if (param0.equals("Z")) {
            stackIn_20_0 = Boolean.TYPE;
            return stackIn_20_0;
          }
          if (param0.equals("F")) {
            stackIn_23_0 = Float.TYPE;
            return stackIn_23_0;
          }
          if (param0.equals("D")) {
            stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!param0.equals("C")) {
            return Class.forName(param0);
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("qc.JA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) -125, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a((byte) -117, param3);
            return stackIn_6_0;
          }
          if (param2 > -96) {
            return true;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_12_0 = this.b(param3, 1);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qc.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void a(int param0, og param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_K == param1) {
            this.field_Q.a((ub) (this), 8);
          }
          if (this.field_Q == param1) {
            this.a(4210752);
          }
          if (param0 > -111) {
            this.field_O = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qc.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = wizardrun.field_H;
        try {
          if (param0 != -18905) {
            field_E = (o[]) null;
          }
          if (this.field_H == param1) {
            this.a(4210752);
          } else {
            if (this.field_M != param1) {
              if (this.field_G == param1) {
                if (this.field_J) {
                  ea.c(param0 ^ 12849);
                } else {
                  if (!this.field_O) {
                    sf.a((byte) -89);
                  } else {
                    pg.a((byte) -97);
                  }
                }
              }
            } else {
              w.b(param0 ^ 18904);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("qc.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void h(int param0) {
        this.field_K.e(true);
        this.field_Q.e(true);
        int var2 = 127 % ((-20 - param0) / 50);
    }

    qc(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (bf) null);
        ik dupTemp$0 = null;
        ik dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        pl stackIn_18_1 = null;
        pl stackIn_18_2 = null;
        pl stackIn_19_1 = null;
        pl stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        jl var6 = null;
        RuntimeException var6_ref = null;
        vd var7 = null;
        String var8 = null;
        uf var9 = null;
        ik var12 = null;
        ik var13 = null;
        try {
          this.field_F = param1;
          stackIn_4_1 = (param4);
          this.field_O = stackIn_4_1;
          stackIn_7_1 = (param2);
          this.field_J = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_P = stackIn_10_1;
          if (this.field_J && (this.field_P ||
            this.field_O)) {
            throw new IllegalStateException();
          }
          this.field_K = (og) ((Object) new p(param0, (ce) (this), 100));
          this.field_Q = (og) ((Object) new p("", (ce) (this), 20));
          if (!this.field_J) {
            this.field_H = new pl(dj.field_a, (ce) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_O) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ti.field_h;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = th.field_b;
            }
            this.field_G = new pl(stackIn_19_3, (ce) null);
            if (this.field_P) {
              this.field_M = new pl(qk.field_h, (ce) (this));
            }
          } else {
            this.field_H = new pl(me.field_a, (ce) null);
            this.field_G = new pl(pk.field_q, (ce) null);
            this.field_K.field_B = false;
          }
          this.field_K.field_w = (bf) ((Object) new qb(10000536));
          this.field_Q.field_w = (bf) ((Object) new ke(10000536));
          var6 = new jl();
          this.field_H.field_w = (bf) ((Object) var6);
          if (null != this.field_G) {
            this.field_G.field_w = (bf) ((Object) var6);
          }
          if (this.field_M != null) {
            this.field_M.field_w = (bf) ((Object) var6);
          }
          this.field_K.field_p = tf.field_a;
          if (this.field_M != null) {
            this.field_M.field_p = hb.field_i;
          }
          if (!this.field_J) {
            if (this.field_O) {
              this.field_G.field_p = hf.field_a;
              this.field_G.field_w = (bf) ((Object) new tk());
            } else {
              this.field_G.field_w = (bf) ((Object) new tk());
            }
          } else {
            this.field_G.field_p = sh.field_a;
          }
          this.field_l = 15;
          var7 = gh.field_b;
          if (null != this.field_F) {
            this.field_l = this.field_l + (5 + var7.a(this.field_F, -40 + this.field_r, var7.field_M));
          }
          var8 = ai.field_j;
          var9 = jf.a(jg.f(1), (byte) 48);
          if (var9 == hd.field_C) {
            var8 = dc.field_q;
          } else {
            if (var9 == jf.field_e) {
              var8 = tl.field_b;
            }
          }
          dupTemp$0 = new ik(10, this.field_l, -20 + this.field_r, 25, this.field_K, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a((ub) (dupTemp$0), (byte) 57);
          this.field_l = this.field_l + (5 + ((ub) ((Object) var12)).field_n);
          dupTemp$1 = new ik(10, this.field_l, -20 + this.field_r, 25, this.field_Q, false, 80, 3, var7, 16777215, qk.field_d);
          var13 = dupTemp$1;
          this.a((ub) (dupTemp$1), (byte) 85);
          this.field_l = this.field_l + (5 + ((ub) ((Object) var13)).field_n);
          this.field_H.field_s = (ce) (this);
          if (this.field_M != null) {
            this.field_M.field_s = (ce) (this);
          }
          if (this.field_G != null) {
            this.field_G.field_s = (ce) (this);
          }
          if (this.field_M != null) {
            this.field_H.a(118, this.field_l, 30, this.field_r - 95, 85);
            this.field_l = this.field_l + 60;
          } else {
            this.field_H.a(118, this.field_l, 30, -10 + (this.field_r - 6), 8);
            this.field_l = this.field_l + 35;
          }
          if (null != this.field_M) {
            this.field_M.a(121, this.field_l, 30, this.field_r - 16, 8);
            this.field_l = this.field_l + 35;
          }
          if (null != this.field_G) {
            if (!this.field_J &&
              !this.field_O) {
              this.field_G.a(121, this.field_l, 20, 40, 8);
              this.field_l = this.field_l + 25;
            } else {
              this.field_G.a(110, this.field_l, 30, -10 + (-6 + this.field_r), 8);
              this.field_l = this.field_l + 35;
            }
          }
          this.a(110, 0, this.field_l + 3, this.field_r, 0);
          this.a((ub) (this.field_H), (byte) 84);
          if (null != this.field_M) {
            this.a((ub) (this.field_M), (byte) 126);
          }
          if (this.field_G != null) {
            this.a((ub) (this.field_G), (byte) 58);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("qc.<init>(");
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
          throw bd.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, vh param3, int param4, String param5, boolean param6, int param7, int param8) {
        he.field_q = param1;
        ej.field_d = param8;
        fg.field_c = param4;
        pg.field_j = param7;
        if (!param6) {
          return;
        }
        try {
          vk.field_p = param3;
          kj.field_a = param0;
          nf.field_b = param2;
          aa.field_hb = param5;
          ii.field_f = (na) ((Object) new sl());
          ig.field_q = new cd(param3);
          wi.field_L = new ad(ii.field_f, ig.field_q);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "qc.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void g(int param0) {
        field_N = null;
        if (param0 != -6664) {
          field_L = 3;
        }
        field_E = null;
        field_I = null;
    }

    final String d(boolean param0) {
        if (param0) {
          return (String) null;
        }
        if (this.field_K.field_k == null) {
          return "";
        }
        return this.field_K.field_k;
    }

    static {
        field_N = "Sound         ";
    }
}

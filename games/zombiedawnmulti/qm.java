/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends se implements fi, in {
    static String field_I;
    private pm field_M;
    private boolean field_L;
    private gn field_P;
    private gn field_J;
    private boolean field_K;
    static String field_N;
    private pm field_H;
    private gn field_G;
    private boolean field_Q;
    private String field_O;

    final void a(int param0, String param1) {
        pm var4 = null;
        String var5 = null;
        try {
          int var3_int = 62 / ((-46 - param0) / 51);
          var4 = this.field_H;
          var5 = param1;
          var4.a(false, var5, (byte) 119);
          this.field_M.b(true);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qm.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(jh param0, boolean param1, String param2, int param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        jb var7 = null;
        String var8 = null;
        jb var9 = null;
        String var10 = null;
        jb var11 = null;
        String var12 = null;
        jb var13 = null;
        try {
          ve.a(0L, 196, (String) null, ek.field_H, (String) null, param0, -1, (int[]) null, param0.i(6));
          if (param0.field_Fb && (param0.field_fc == 2 ||
            !(kj.field_q < 2))) {
            var7 = pk.field_b;
            var8 = vl.a(wj.field_f, new String[]{param2}, 2);
            var7.field_j.a((byte) -118, var8, 10);
          }
          pk.field_b.a((byte) -120);
          if (param1) {
            if (ao.field_e == pk.field_b.field_b) {
              var11 = pk.field_b;
              var12 = vl.a(ag.field_g, new String[]{param2}, 2);
              var11.field_j.a((byte) -118, var12, 16);
            } else {
              var9 = pk.field_b;
              var10 = vl.a(kj.field_f, new String[]{param2}, 2);
              var9.field_j.a((byte) -118, var10, 15);
            }
          }
          var13 = pk.field_b;
          var5 = vb.field_f;
          if (param3 >= -117) {
            field_I = (String) null;
          }
          var6 = ka.field_t;
          var13.field_j.b(4542, var5, 0, var6, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("qm.K(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param3 >= -83) {
            return;
          }
          if (this.field_G == param2) {
            this.a((byte) -95);
          } else {
            if (this.field_P == param2) {
              hb.a(0);
            } else {
              if (param2 == this.field_J) {
                if (!this.field_K) {
                  if (!this.field_L) {
                    qi.a(false);
                  } else {
                    dq.c(-118);
                  }
                } else {
                  oi.a(-124);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("qm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_O) {
          ke.field_h.a(this.field_O, param3 - (-this.field_y - 20), 15 + (this.field_i + param1), this.field_n - 40, this.field_w, 16777215, -1, 1, 0, ke.field_h.field_C);
        }
        if (null != this.field_P) {
          oo.b(param3 + 10, param1 + 134, -20 + this.field_n, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final String h(int param0) {
        if (param0 != 6728) {
          return (String) null;
        }
        if (null == this.field_H.field_j) {
          return "";
        }
        return this.field_H.field_j;
    }

    final void g(byte param0) {
        this.field_H.b(true);
        if (param0 < 101) {
          cf var3 = (cf) null;
          this.a(39, '￟', (cf) null, 8);
        }
        this.field_M.b(true);
    }

    qm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (nl) null);
        el dupTemp$0 = null;
        el dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        gn stackIn_18_1 = null;
        gn stackIn_18_2 = null;
        gn stackIn_19_1 = null;
        gn stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        oq var6 = null;
        RuntimeException var6_ref = null;
        fm var7 = null;
        String var8 = null;
        bo var9 = null;
        el var12 = null;
        el var13 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_Q = stackIn_4_1;
          this.field_O = param1;
          stackIn_7_1 = (param4);
          this.field_L = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_K = stackIn_10_1;
          if (this.field_K && (this.field_Q ||
            this.field_L)) {
            throw new IllegalStateException();
          }
          this.field_H = (pm) ((Object) new on(param0, (bj) (this), 100));
          this.field_M = (pm) ((Object) new on("", (bj) (this), 20));
          if (!this.field_K) {
            this.field_G = new gn(qo.field_s, (bj) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_L) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = sn.field_Zb;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = gf.field_a;
            }
            this.field_J = new gn(stackIn_19_3, (bj) null);
            if (this.field_Q) {
              this.field_P = new gn(en.field_a, (bj) (this));
            }
          } else {
            this.field_G = new gn(ci.field_g, (bj) null);
            this.field_J = new gn(oe.field_b, (bj) null);
            this.field_H.field_F = false;
          }
          this.field_H.field_h = (nl) ((Object) new tb(10000536));
          this.field_M.field_h = (nl) ((Object) new m(10000536));
          var6 = new oq();
          this.field_G.field_h = (nl) ((Object) var6);
          if (this.field_J != null) {
            this.field_J.field_h = (nl) ((Object) var6);
          }
          if (null != this.field_P) {
            this.field_P.field_h = (nl) ((Object) var6);
          }
          this.field_H.field_x = lh.field_e;
          if (null != this.field_P) {
            this.field_P.field_x = field_I;
          }
          if (this.field_K) {
            this.field_J.field_x = gi.field_p;
          } else {
            if (this.field_L) {
              this.field_J.field_x = de.field_a;
              this.field_J.field_h = (nl) ((Object) new he());
            } else {
              this.field_J.field_h = (nl) ((Object) new he());
            }
          }
          this.field_i = 15;
          var7 = ke.field_h;
          if (null != this.field_O) {
            this.field_i = this.field_i + (var7.a(this.field_O, this.field_n - 40, var7.field_C) + 5);
          }
          var8 = sh.field_M;
          var9 = me.a(-57, jl.b(0));
          if (wp.field_b != var9) {
            if (l.field_c == var9) {
              var8 = lj.field_f;
            }
          } else {
            var8 = fa.field_Gb;
          }
          dupTemp$0 = new el(10, this.field_i, -20 + this.field_n, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b((byte) 112, dupTemp$0);
          this.field_i = this.field_i + (((cf) ((Object) var12)).field_w + 5);
          dupTemp$1 = new el(10, this.field_i, -20 + this.field_n, 25, this.field_M, false, 80, 3, var7, 16777215, gn.field_D);
          var13 = dupTemp$1;
          this.b((byte) 108, dupTemp$1);
          this.field_i = this.field_i + (5 + ((cf) ((Object) var13)).field_w);
          this.field_G.field_A = (bj) (this);
          if (null != this.field_P) {
            this.field_P.field_A = (bj) (this);
          }
          if (null != this.field_J) {
            this.field_J.field_A = (bj) (this);
          }
          if (this.field_P == null) {
            this.field_G.b(8, this.field_i, 28972, this.field_n - 6 - 10, 30);
            this.field_i = this.field_i + 35;
          } else {
            this.field_G.b(85, this.field_i, 28972, this.field_n - 95, 30);
            this.field_i = this.field_i + 60;
          }
          if (this.field_P != null) {
            this.field_P.b(8, this.field_i, 28972, -10 + (-6 + this.field_n), 30);
            this.field_i = this.field_i + 35;
          }
          if (null != this.field_J) {
            if (!this.field_K &&
              !this.field_L) {
              this.field_J.b(8, this.field_i, 28972, 40, 20);
              this.field_i = this.field_i + 25;
            } else {
              this.field_J.b(8, this.field_i, 28972, -10 + (this.field_n - 6), 30);
              this.field_i = this.field_i + 35;
            }
          }
          this.b(0, 0, 28972, this.field_n, 3 + this.field_i);
          this.b((byte) 70, this.field_G);
          if (null != this.field_P) {
            this.b((byte) 71, this.field_P);
          }
          if (this.field_J != null) {
            this.b((byte) 126, this.field_J);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("qm.<init>(");
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
          throw fa.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = 19 % ((-23 - param0) / 59);
        field_N = null;
        field_I = null;
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
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
          if (param0 == 98) {
            stackIn_6_0 = this.a((byte) -1, param2);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(66, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("qm.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static ae a(ga param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        uo stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.d((byte) 69);
          var3 = param0.d((byte) 69);
          var4 = param0.d((byte) 69);
          var5 = param0.d((byte) 69);
          if (!param1) {
            qm.a(16);
          }
          var6 = param0.d((byte) 69);
          stackIn_3_0 = fn.a(var6, var4, var3, (byte) 104, var2_int, var5);
          return (ae) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qm.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(pm param0, int param1) {
        try {
          if (param1 != 0) {
            String var4 = (String) null;
            qm.a(-1.2370823621749878f, -17, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qm.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(pm param0, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_H == param0) {
            this.field_M.a((cf) (this), 0);
          }
          if (this.field_M == param0) {
            this.a((byte) -99);
          }
          if (!param1) {
            this.field_G = (gn) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qm.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static vg b(int param0, int param1, int param2, int param3) {
        vg var4;
        int var5;
        vg var4Lifetime1;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = (vg) (ag.field_i.c(78));
        while (var4 != null) {
          if (param2 == var4.field_i) {
            return var4;
          }
          var4 = (vg) (ag.field_i.b(6));
        }
        if (param0 <= 97) {
          field_I = (String) null;
        }
        var4Lifetime1 = new vg();
        var4Lifetime1.field_p = param3;
        var4Lifetime1.field_i = param2;
        ag.field_i.a(var4Lifetime1, false);
        vi.a(param1, var4Lifetime1, (byte) -126);
        return var4Lifetime1;
    }

    final static void a(float param0, int param1, String param2) {
        try {
          lh.field_i = param0;
          if (param1 != 80) {
            String var4 = (String) null;
            qm.a(-1.1143913269042969f, -113, (String) null);
          }
          od.field_Bb = param2;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qm.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        int var2;
        var2 = 12 % ((param0 - 8) / 49);
        if (aa.e(0) ||
          !(this.field_H.field_j.length() <= 0) &&
          !(this.field_M.field_j.length() <= 0)) {
          hq.a(this.field_H.field_j, (byte) -125, this.field_M.field_j);
        }
    }

    static {
        field_I = "Create your own free Jagex account";
        field_N = "TRAITS";
    }
}

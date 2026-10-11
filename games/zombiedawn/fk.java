/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fk extends hp implements oa, hh, ri {
    private ic field_M;
    private an field_H;
    private ic field_P;
    private ic field_N;
    private hm field_J;
    kn field_I;
    private an field_L;
    static sd field_F;
    private ic field_G;
    private ic field_R;
    static vn field_K;
    private ic field_Q;
    private fm field_O;

    private final boolean f(byte param0) {
        if (!this.j(40)) {
          return false;
        }
        int var2 = -1;
        if (param0 >= -108) {
          return true;
        }
        try {
          var2 = Integer.parseInt(this.field_R.field_o);
        } catch (NumberFormatException numberFormatException) {
        }
        return kl.a(this.field_P.field_o, 640, this, this.field_N.field_o, var2, this.field_G.field_o, this.field_O.field_x);
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(-120, param1, param2, param3)) {
            return true;
          }
          var5_int = 61 / ((-83 - param0) / 32);
          if (98 == param1) {
            stackIn_5_0 = this.b((byte) 119, param2);
            return stackIn_5_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_9_0 = this.a(1, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fk.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0) {
        int var2 = 107 / ((39 - param0) / 49);
        ((ql) (this.field_N.a(0))).e(-28769);
    }

    private final boolean j(int param0) {
        if (param0 != 40) {
          this.field_L = (an) null;
          if (!this.a((byte) 77, (mi) (this.field_N))) {
            return false;
          }
          if (!this.a((byte) 77, (mi) (this.field_G))) {
            return false;
          }
          if (!this.a((byte) 77, (mi) (this.field_M))) {
            return false;
          }
          if (!this.a((byte) 77, (mi) (this.field_P))) {
            return false;
          }
          if (!this.a((byte) 77, (mi) (this.field_Q))) {
            return false;
          }
          if (this.a((byte) 77, (mi) (this.field_R))) {
            return true;
          }
          return false;
        }
        if (!this.a((byte) 77, (mi) (this.field_N))) {
          return false;
        }
        if (!this.a((byte) 77, (mi) (this.field_G))) {
          return false;
        }
        if (!this.a((byte) 77, (mi) (this.field_M))) {
          return false;
        }
        if (!this.a((byte) 77, (mi) (this.field_P))) {
          return false;
        }
        if (!this.a((byte) 77, (mi) (this.field_Q))) {
          return false;
        }
        if (this.a((byte) 77, (mi) (this.field_R))) {
          return true;
        }
        return false;
    }

    private final String i(int param0) {
        if (param0 != 60) {
          field_F = (sd) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(String param0, int param1, ga param2, int param3, int param4) {
        q var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new q(20, param3, param4 + param1, 25, param2, false, 120, 3, ia.field_e, 16777215, param0);
          this.a(var6, 10);
          stackIn_1_0 = var6.field_n;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("fk.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2, String param3, ga param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        np var7 = null;
        q var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new q(20, param1, param2 + 120, 25, param4, false, 120, 3, ia.field_e, 16777215, param3);
          this.a(var8, 10);
          var7 = new np(((mi) ((Object) param4)).a(0));
          this.a(var7, 10);
          if (param0 > -44) {
            discarded$1 = this.f((byte) -123);
          }
          var7.a(76, (-15 + var8.field_n >> 1) + var8.field_j, 3 + var8.field_k + var8.field_i, 15, 15);
          stackIn_3_0 = var8.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("fk.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_K = null;
        if (param0 != -31) {
          return;
        }
        field_F = null;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
          super.a(param0, (byte) -92, param2, param3);
          int var5_int = 40 % ((46 - param1) / 42);
          this.field_L.field_C = this.j(40);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "fk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(hm param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          if (param1 != 120) {
            this.field_Q = (ic) null;
          }
          if (param2 == 0) {
            nf.a(12, "terms.ws");
            return;
          }
          if (param2 == 1) {
            nf.a(12, "privacy.ws");
            return;
          }
          if (2 != param2) {
            return;
          }
          nf.a(12, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fk.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6) {
            return;
          }
          if (param2 == this.field_H) {
            ZombieDawn.q(-10401);
            return;
          }
          if (param2 != this.field_L) {
            return;
          }
          discarded$1 = this.f((byte) -125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("fk.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, ga param1, String param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        String var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -24519) {
            var8 = (String) null;
            this.a((byte) 41, (String) null);
          }
          stackIn_3_0 = this.a(param1, 0, param0, param2, 35, param5, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("fk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(ga param0, int param1, int param2, String param3, int param4, int param5, String param6) {
        RuntimeException var8 = null;
        wf var9 = null;
        q var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new q(20, param2, 120 + param5, 25, param0, false, 120, 3, ia.field_e, 16777215, param6);
          this.a(var10, 10);
          var9 = new wf(((mi) ((Object) param0)).a(param1 ^ param1), param3, 126, param2 + var10.field_n, param5 + 50, param4);
          var9.field_v = (sk) (this);
          this.a(var9, 10);
          stackIn_1_0 = var9.field_n + var10.field_n;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("fk.R(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final String h(int param0) {
        if (param0 < 84) {
          return (String) null;
        }
        return "</col></u>";
    }

    public final void a(byte param0, String param1) {
        ic var3 = null;
        String var4 = null;
        try {
          int var5 = 81 / ((param0 + 40) / 48);
          var3 = this.field_N;
          var4 = param1;
          ((tb) ((Object) var3)).a(false, false, var4);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "fk.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public fk() {
        super(0, 0, 496, 0, (io) null);
        this.field_N = new ic("", (sk) null, 12);
        this.field_G = new ic("", (sk) null, 100);
        this.field_M = new ic("", (sk) null, 100);
        this.field_P = new ic("", (sk) null, 20);
        this.field_Q = new ic("", (sk) null, 20);
        this.field_R = new ic("", (sk) null, 3);
        int var1 = 1;
        this.field_O = new fm("", (sk) null, var1 != 0);
        this.field_L = new an(al.field_c, (sk) null);
        this.field_H = new an(vl.field_f, (sk) null);
        this.field_N.field_s = sn.field_d;
        this.field_G.field_s = c.field_a;
        this.field_M.field_s = hi.field_pb;
        this.field_P.field_s = gm.field_f;
        this.field_Q.field_s = qo.field_t;
        this.field_R.field_s = lm.field_D;
        this.field_O.field_s = kf.field_V;
        this.field_N.a(-73, new ql(this.field_N));
        this.field_G.a(127, new mc(this.field_G));
        this.field_M.a(-110, new lk(this.field_M, this.field_G));
        this.field_P.a(79, new kg(this.field_P, this.field_N, this.field_G));
        this.field_Q.a(24, new fj(this.field_Q, this.field_P));
        this.field_R.a(-87, new kb(this.field_R));
        this.field_L.field_C = false;
        this.field_L.field_h = (io) ((Object) new vm());
        this.field_H.field_h = (io) ((Object) new dp());
        this.field_N.field_h = (io) ((Object) new tc(10000536));
        tc dupTemp$0 = new tc(10000536);
        this.field_M.field_h = (io) ((Object) dupTemp$0);
        this.field_G.field_h = (io) ((Object) dupTemp$0);
        this.field_R.field_h = (io) ((Object) new tc(10000536));
        this.field_O.field_h = (io) ((Object) new jb());
        jm dupTemp$1 = new jm(10000536);
        this.field_Q.field_h = (io) ((Object) dupTemp$1);
        this.field_P.field_h = (io) ((Object) dupTemp$1);
        String var2 = s.a(1938762664, jb.field_d, new String[]{this.i(60), this.h(110)});
        int var3 = 20;
        var3 = var3 + this.a(dk.field_Vb, 120, this.field_G, var3, 170);
        var3 = var3 + (5 + this.a(this.field_M, 0, var3, "", 20, 170, aa.field_g));
        var3 = var3 + this.a(ui.field_c, 120, this.field_P, var3, 170);
        var3 = var3 + (this.a(var3, this.field_Q, jj.field_J, gk.field_I, -24519, 170) + 5);
        var3 = var3 + (this.a(var3, this.field_N, a.field_l, b.field_i, -24519, 170) + 5);
        var3 = var3 + this.a(-55, var3, 170, bp.field_j, this.field_R);
        q var4 = new q(46, var3, this.field_i - 90, 25, this.field_O, true, this.field_i - 120, 5, ii.field_a, 11579568, ji.field_d);
        this.a(var4, 10);
        var3 = var3 + var4.field_n;
        vf var5 = new vf(ia.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, ia.field_e.field_I, -1, 2147483647, true);
        this.field_J = new hm(var2, var5);
        this.field_J.field_s = "";
        this.field_J.a(0, -21423, sm.field_b);
        this.field_J.a(1, -21423, sm.field_b);
        this.field_J.field_v = (sk) (this);
        this.field_J.a(46, var3, true, -90 + this.field_i);
        var3 = var3 + (15 + this.field_J.field_n);
        this.a(this.field_J, 10);
        int var6 = 4;
        int var7 = 200;
        this.field_L.a(57, var3, 496 - var7 >> 1, var7, 40);
        this.field_H.a(35, 15 + var3, var6 + 3, 60, 40);
        this.field_H.field_v = (sk) (this);
        this.field_L.field_v = (sk) (this);
        this.a(this.field_L, 10);
        this.a(this.field_H, 10);
        this.field_I = new kn((ri) (this));
        this.field_I.a(36, 20 + this.field_N.field_j, 60 + this.field_N.field_i + this.field_N.field_k, this.field_i + (-this.field_N.field_k - this.field_N.field_i - 60), 150);
        this.a(this.field_I, 10);
        this.a(35, 0, 0, 496, 55 + var3 + var6);
    }

    final static void b(boolean param0) {
        int fieldTemp$0 = oo.field_R;
        oo.field_R = oo.field_R - 1;
        if (fieldTemp$0 <= 0) {
          dj.field_e.field_R.a(0, new hk());
          oo.field_R = pb.a(so.field_a, 40, 1) + 40;
          if (param0) {
            fk.b(false);
            return;
          }
          return;
        }
        if (!param0) {
          return;
        }
        fk.b(false);
    }

    private final boolean a(byte param0, mi param1) {
        vc var3 = null;
        RuntimeException var3_ref = null;
        rh var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(0);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a((byte) -89);
          if (var4 == uc.field_b) {
            return false;
          }
          if (param0 != 77) {
            return true;
          }
          if (se.field_l == var4) {
            return false;
          }
          if (var4 != di.field_L) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("fk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
    }
}

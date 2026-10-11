/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bf extends bj implements sg, qb, qn {
    private gd field_R;
    static rk[] field_M;
    private bo field_J;
    private ue field_H;
    rh field_G;
    static String field_O;
    private hc field_P;
    static om field_L;
    private gd field_I;
    private hc field_K;
    private gd field_N;
    static ed field_T;
    private gd field_Q;
    private gd field_U;
    private gd field_S;

    private final int a(int param0, hm param1, String param2, int param3, int param4) {
        ki var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 100) {
            bf.i((byte) -65);
          }
          var6 = new ki(20, param3, param0 + 120, 25, param1, false, 120, 3, sb.field_a, 16777215, param2);
          this.b(var6, false);
          stackIn_3_0 = var6.field_x;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("bf.D(").append(param0).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != this.field_P) {
            if (this.field_K == param0) {
              discarded$1 = this.h((byte) 123);
            }
          } else {
            qe.a(true);
          }
          if (param3 == 1) {
            return;
          }
          this.field_N = (gd) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("bf.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, String param1, int param2, hm param3, String param4, int param5) {
        RuntimeException var7 = null;
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
          if (param0 != 170) {
            field_T = (ed) null;
          }
          stackIn_3_0 = this.a(35, param3, param5, param1, param0 - 145, param4, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("bf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(byte param0, String param1) {
        gd var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_S;
          var4 = param1;
          ((ul) ((Object) var3)).a(var4, false, -33);
          if (param0 < -49) {
            return;
          }
          this.field_U = (gd) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("bf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, DataInputStream param2, int param3, int param4, int[] param5, int param6) throws IOException {
        int var7_int = param4 + param3 >> 1;
        int var8 = param0 + param1 >> 1;
        int var9 = param2.readUnsignedByte();
        ka.a(param3, 3 & var9, var8, var7_int, param2, param5, (byte) -74, param0);
        var9 = var9 >>> 2;
        ka.a(var7_int, var9 & 3, var8, param4, param2, param5, (byte) -74, param0);
        var9 = var9 >>> 2;
        if (param6 != 2147483647) {
          return;
        }
        try {
          ka.a(param3, var9 & 3, param1, var7_int, param2, param5, (byte) -74, var8);
          var9 = var9 >>> 2;
          ka.a(var7_int, var9, param1, param4, param2, param5, (byte) -74, var8);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bf.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    public static void l(int param0) {
        field_T = null;
        field_L = null;
        if (param0 >= -118) {
          return;
        }
        field_O = null;
        field_M = null;
    }

    public bf() {
        super(0, 0, 496, 0, (db) null);
        this.field_S = new gd("", (wn) null, 12);
        this.field_I = new gd("", (wn) null, 100);
        this.field_R = new gd("", (wn) null, 100);
        this.field_Q = new gd("", (wn) null, 20);
        this.field_U = new gd("", (wn) null, 20);
        this.field_N = new gd("", (wn) null, 3);
        int var1 = 1;
        this.field_J = new bo("", (wn) null, var1 != 0);
        this.field_K = new hc(ag.field_c, (wn) null);
        this.field_P = new hc(c.field_p, (wn) null);
        this.field_S.field_i = bb.field_K;
        this.field_I.field_i = en.field_a;
        this.field_R.field_i = co.field_f;
        this.field_Q.field_i = aa.field_b;
        this.field_U.field_i = pl.field_i;
        this.field_N.field_i = ta.field_k;
        this.field_J.field_i = ad.field_h;
        this.field_S.a(new kf(this.field_S), (byte) 63);
        this.field_I.a(new hi(this.field_I), (byte) 63);
        this.field_R.a(new dg(this.field_R, this.field_I), (byte) 63);
        this.field_Q.a(new nk(this.field_Q, this.field_S, this.field_I), (byte) 63);
        this.field_U.a(new lb(this.field_U, this.field_Q), (byte) 63);
        this.field_N.a(new kl(this.field_N), (byte) 63);
        this.field_K.field_y = false;
        this.field_K.field_s = (db) ((Object) new ck());
        this.field_P.field_s = (db) ((Object) new ha());
        this.field_S.field_s = (db) ((Object) new re(10000536));
        re dupTemp$0 = new re(10000536);
        this.field_R.field_s = (db) ((Object) dupTemp$0);
        this.field_I.field_s = (db) ((Object) dupTemp$0);
        this.field_N.field_s = (db) ((Object) new re(10000536));
        this.field_J.field_s = (db) ((Object) new ae());
        un dupTemp$1 = new un(10000536);
        this.field_U.field_s = (db) ((Object) dupTemp$1);
        this.field_Q.field_s = (db) ((Object) dupTemp$1);
        String var2 = r.a(aj.field_b, -63, new String[]{this.j(66), this.k(3674)});
        int var3 = 20;
        var3 = var3 + this.a(170, this.field_I, tm.field_Z, var3, 100);
        var3 = var3 + (this.a(20, this.field_R, 170, ri.field_a, 25, "", var3) + 5);
        var3 = var3 + this.a(170, this.field_Q, qc.field_vb, var3, 100);
        var3 = var3 + (this.a(170, mh.field_d, var3, this.field_U, rm.field_a, 170) + 5);
        var3 = var3 + (5 + this.a(170, lf.field_J, var3, this.field_S, ig.field_i, 170));
        var3 = var3 + this.a(qm.field_a, (byte) 123, var3, this.field_N, 170);
        ki var4 = new ki(46, var3, -90 + this.field_g, 25, this.field_J, true, -120 + this.field_g, 5, ke.field_c, 11579568, ii.field_b);
        this.b(var4, false);
        var3 = var3 + var4.field_x;
        k var5 = new k(sb.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, sb.field_a.field_r, -1, 2147483647, true);
        this.field_H = new ue(var2, var5);
        this.field_H.field_i = "";
        this.field_H.a(ah.field_m, (byte) 65, 0);
        this.field_H.a(ah.field_m, (byte) 97, 1);
        this.field_H.field_q = (wn) (this);
        this.field_H.b(2463, 46, this.field_g - 90, var3);
        var3 = var3 + (15 + this.field_H.field_x);
        this.b(this.field_H, false);
        int var6 = 4;
        int var7 = 200;
        this.field_K.a(var7, var3, -var7 + 496 >> 1, true, 40);
        this.field_P.a(60, 15 + var3, var6 + 3, true, 40);
        this.field_P.field_q = (wn) (this);
        this.field_K.field_q = (wn) (this);
        this.b(this.field_K, false);
        this.b(this.field_P, false);
        this.field_G = new rh((qn) (this));
        this.field_G.a(-60 - this.field_S.field_k + (this.field_g - this.field_S.field_g), 20 + this.field_S.field_j, 60 + this.field_S.field_k + this.field_S.field_g, true, 150);
        this.b(this.field_G, false);
        this.a(496, 0, 0, true, var6 + (var3 + 55));
    }

    private final String k(int param0) {
        if (param0 != 3674) {
          field_L = (om) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(byte param0) {
        ((kf) (this.field_S.a((byte) -89))).g(22186);
        if (param0 != -61) {
          field_T = (ed) null;
        }
    }

    private final boolean a(boolean param0, og param1) {
        el var3 = null;
        RuntimeException var3_ref = null;
        rf var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          var3 = param1.a((byte) -89);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a(17124);
          if (var4 == ob.field_a) {
            return false;
          }
          if (var4 == of.field_f) {
            return false;
          }
          if (var4 != re.field_s) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("bf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static te a(mf param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        te stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.b(-1, param3);
          if (param1 <= 48) {
            field_L = (om) null;
          }
          var5 = param0.a(var4_int, param2, true);
          stackIn_3_0 = he.a(param0, -18109, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("bf.T(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int a(String param0, byte param1, int param2, hm param3, int param4) {
        RuntimeException var6 = null;
        oj var7 = null;
        ki var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new ki(20, param2, 120 + param4, 25, param3, false, 120, 3, sb.field_a, 16777215, param0);
          this.b(var8, false);
          if (param1 != 123) {
            this.field_J = (bo) null;
          }
          var7 = new oj(((og) ((Object) param3)).a((byte) -89));
          this.b(var7, false);
          var7.a(15, (-15 + var8.field_x >> 1) + var8.field_j, 3 + var8.field_g + var8.field_k, true, 15);
          stackIn_3_0 = var8.field_x;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("bf.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    final static java.awt.Canvas i(byte param0) {
        if (param0 == 10) {
          return null == df.field_d ? of.field_d : (java.awt.Canvas) ((Object) df.field_d);
        }
        field_M = (rk[]) null;
        return null == df.field_d ? of.field_d : (java.awt.Canvas) ((Object) df.field_d);
    }

    final void a(int param0, int param1, int param2, hm param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_K.field_y = this.b(true);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bf.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean b(boolean param0) {
        if (!param0) {
          return false;
        }
        if (!this.a(false, this.field_S)) {
          return false;
        }
        if (!this.a(false, this.field_I)) {
          return false;
        }
        if (!this.a(false, this.field_R)) {
          return false;
        }
        if (!this.a(!param0 ? true : false, this.field_Q)) {
          return false;
        }
        if (!this.a(false, this.field_U)) {
          return false;
        }
        if (this.a(false, this.field_N)) {
          return true;
        }
        return false;
    }

    private final String j(int param0) {
        int var2 = -12 % ((param0 + 57) / 43);
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, 20)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.a((byte) 22, param0);
            return stackIn_7_0;
          }
          if (param3 <= 0) {
            this.field_I = (gd) null;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_12_0 = this.a(param0, true);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("bf.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, hm param1, int param2, String param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        lf var9 = null;
        ki var10 = null;
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
          var10 = new ki(20, param6, 120 + param2, param4, param1, false, 120, 3, sb.field_a, 16777215, param3);
          this.b(var10, false);
          var9 = new lf(((og) ((Object) param1)).a((byte) -89), param5, 126, var10.field_x + param6, param2 + 50, param0);
          var9.field_q = (wn) (this);
          this.b(var9, false);
          stackIn_1_0 = var9.field_x + var10.field_x;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("bf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean h(byte param0) {
        if (!this.b(true)) {
          return false;
        }
        int var2 = -1;
        int var3 = 38 % ((param0 - 51) / 35);
        try {
          var2 = Integer.parseInt(this.field_N.field_l);
        } catch (NumberFormatException numberFormatException) {
        }
        return e.a(this, false, this.field_I.field_l, var2, this.field_Q.field_l, this.field_J.field_z, this.field_S.field_l);
    }

    public final void a(int param0, ue param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          if (param0 != -2861) {
            field_M = (rk[]) null;
          }
          if (0 == param2) {
            qd.a(12, "terms.ws");
            return;
          }
          if (1 == param2) {
            qd.a(12, "privacy.ws");
            return;
          }
          if (2 != param2) {
            return;
          }
          qd.a(12, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("bf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -15655) {
          return;
        }
        if (null != bk.field_r) {
          bk.field_r.b(-1, param0);
        }
    }

    static {
        field_O = "Complete the tutorial by following<br>the instructions at the top of the screen.";
        field_L = new om(11, 0, 1, 2);
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends pe implements ha, qd {
    private pl field_G;
    private pl field_F;
    wj field_H;
    private p field_E;

    private final boolean d(boolean param0) {
        if (param0) {
          this.field_F = (pl) null;
          if (this.a(3, this.field_E)) {
            return true;
          }
          return false;
        }
        if (this.a(3, this.field_E)) {
          return true;
        }
        return false;
    }

    private final int a(int param0, String param1, String param2, int param3, int param4, ub param5) {
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
          if (param3 != 29171) {
            this.field_E = (p) null;
          }
          stackIn_3_0 = this.a(-31970, param4, 35, param1, param5, param0, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("tb.IA(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, ub param3) {
        int discarded$0 = 0;
        try {
          super.a(param0 ^ 0, param1, param2, param3);
          if (param0 != 10000536) {
            ub var6 = (ub) null;
            discarded$0 = this.a(-69, (String) null, (String) null, -121, -105, (ub) null);
          }
          this.field_F.field_B = this.d(false);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "tb.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public tb() {
        super(0, 0, 496, 0, (bf) null);
        this.field_E = new p("", (ce) null, 12);
        ll var1 = new ll(e.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, gh.field_b.field_M, -1, 2147483647, true);
        ub var2 = new ub(ta.field_d, var1, (ce) null);
        this.field_F = new pl(td.field_b, (ce) null);
        this.field_G = new pl(oa.field_a, (ce) null);
        this.field_E.field_p = cd.field_a;
        this.field_E.a(0, new jg(this.field_E));
        this.field_F.field_B = false;
        this.field_F.field_w = (bf) ((Object) new jl());
        this.field_G.field_w = (bf) ((Object) new tk());
        this.field_E.field_w = (bf) ((Object) new qb(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(121, var3, 50, 270, 20);
        int var5 = 200;
        this.a(var2, (byte) 16);
        var3 += 50;
        var3 = var3 + (5 + this.a(170, d.field_b, re.field_E, 29171, var3, this.field_E));
        this.field_F.a(109, var3, 40, var5, -var5 + 496 >> 1);
        this.field_G.a(118, 15 + var3, 40, 60, var4 + 3);
        this.field_G.field_s = (ce) (this);
        this.field_F.field_s = (ce) (this);
        this.a((ub) (this.field_F), (byte) 105);
        this.a((ub) (this.field_G), (byte) 83);
        this.field_H = new wj((ha) (this));
        this.field_H.a(125, 20, 150, this.field_r - (this.field_E.field_o - (-this.field_E.field_r - 60)), this.field_E.field_o + (this.field_E.field_r + 60));
        this.a((ub) (this.field_H), (byte) 47);
        this.a(113, 0, 55 + var3 + var4, 496, 0);
    }

    final static void a(int param0, int param1, ie param2) {
        mg var5 = n.field_b;
        var5.c((byte) 77, param0);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        if (param1 != -17932) {
          return;
        }
        try {
          var5.b((byte) 11, 1);
          if (param2.field_i == null) {
            var5.b((byte) 11, 0);
          } else {
            var5.b((byte) 11, param2.field_i.length);
            var5.a(param2.field_i, 0, param2.field_i.length, param1 ^ -17983);
          }
          var5.e(var4, param1 - 1182869092);
          var5.field_m = var5.field_m - 4;
          param2.field_k = var5.i(255);
          var5.a(var5.field_m - var4, -88);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "tb.CA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        sb.field_d = param0;
        od.field_j = fl.field_M;
        hj.field_c = 0;
        ej.field_c = 0;
        jj.field_d = new rj(2);
        jj.field_d.a(param0 ^ -12785, wc.a(29292, fi.field_B, pg.field_n), param1, -1);
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -18905) {
            return;
          }
          if (param1 == this.field_G) {
            pc.a(-1);
            return;
          }
          if (param1 != this.field_F) {
            return;
          }
          this.g(104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("tb.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void g(int param0) {
        if (!this.d(false)) {
          return;
        }
        if (param0 <= 21) {
          return;
        }
        vc.a(-125, this.field_E.field_k);
    }

    private final boolean a(int param0, wa param1) {
        dk var3 = null;
        RuntimeException var3_ref = null;
        ok var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a((byte) -23);
          if (var3 == null) {
            return true;
          }
          if (param0 != 3) {
            this.field_G = (pl) null;
          }
          var4 = var3.a(true);
          stackIn_9_0 = (gf.field_V == var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("tb.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(int param0) {
        if (param0 == 2147483647) {
          ((jg) (this.field_E.a((byte) 0))).g(105);
          return;
        }
        ub var3 = (ub) null;
        int discarded$0 = this.a(4, (String) null, (String) null, 24, -50, (ub) null);
        ((jg) (this.field_E.a((byte) 0))).g(105);
    }

    private final int a(int param0, int param1, int param2, String param3, ub param4, int param5, String param6) {
        RuntimeException var8 = null;
        l var9 = null;
        pl var10 = null;
        ik var11 = null;
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
          var11 = new ik(20, param1, 120 + param5, 25, param4, false, 120, 3, gh.field_b, 16777215, param6);
          if (param0 != -31970) {
            var10 = (pl) null;
            this.a(19, (pl) null, -126, -50, 59);
          }
          this.a((ub) (var11), (byte) 44);
          var9 = new l(((wa) ((Object) param4)).a((byte) 117), param3, 126, param1 + var11.field_n, 25 + param5, param2);
          var9.field_s = (ce) (this);
          this.a((ub) (var9), (byte) 95);
          stackIn_3_0 = var9.field_n + var11.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("tb.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) -100, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.a((byte) -117, param3);
            return stackIn_7_0;
          }
          if (param2 >= -96) {
            tb.a(44, false);
          }
          if (99 != param1) {
            return false;
          }
          stackIn_13_0 = this.b(param3, 1);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("tb.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void a(String param0, byte param1) {
        p var3 = null;
        String var4 = null;
        if (param1 <= 61) {
          return;
        }
        try {
          var3 = this.field_E;
          var4 = param0;
          ((og) ((Object) var3)).a(-1, false, var4);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "tb.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}

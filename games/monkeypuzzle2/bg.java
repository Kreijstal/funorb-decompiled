/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends ua implements u, ql, sh {
    private em field_O;
    private t field_z;
    private t field_K;
    private jj field_C;
    static String[] field_B;
    static int[] field_L;
    private qc field_N;
    private qc field_J;
    private qc field_F;
    private qc field_I;
    cm field_G;
    private qc field_D;
    static int field_E;
    private qc field_H;

    private final int a(byte param0, int param1, we param2, String param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 96) {
            stackIn_4_0 = this.a(35, param4, param3, param1, param2, 3, param5);
            return stackIn_4_0;
          }
          stackIn_2_0 = 54;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("bg.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, jj param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 != -21099) {
            return;
          }
          if (param0 != 0) {
            if (param0 != 1) {
              if (2 == param0) {
                wc.a("conduct.ws", false);
              }
            } else {
              wc.a("privacy.ws", false);
            }
          } else {
            wc.a("terms.ws", false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("bg.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0, ag param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        kf var4 = null;
        na var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -94 / ((param0 - 51) / 56);
          var4 = param1.a(-118);
          if (var4 == null) {
            return true;
          }
          var5 = var4.b(false);
          if (var5 == ol.field_h) {
            return false;
          }
          if (var5 == ke.field_d) {
            return false;
          }
          if (var5 != uc.field_e) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("bg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final int a(int param0, String param1, we param2, int param3, int param4) {
        mh var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -96) {
            stackIn_2_0 = 55;
            return stackIn_2_0;
          }
          var6 = new mh(20, param4, 120 + param3, 25, param2, false, 120, 3, t.field_z, 16777215, param1);
          this.b((byte) -78, var6);
          stackIn_4_0 = var6.field_p;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("bg.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        var3 = uj.field_i;
        if (5 > var3) {
          var2 = var3 * (var3 * 8192) / 1100;
          if (param1 < 77) {
            return;
          }
          var4 = 1;
          var5 = 0;
          if (param0 == 1) {
            var5 = 1;
          }
          if (param0 == 3) {
            var4 = -1;
          }
          if (param0 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (param0 == 5) {
            var5 = 1;
            var4 = -1;
          }
          if (param0 == 6) {
            var5 = -1;
            var4 = 1;
          }
          if (7 == param0) {
            var5 = -1;
            var4 = -1;
          } else {
            if (8 == param0) {
              var5 = -1;
              var4 = -1;
            }
          }
          if (11 == param0) {
            var4 = -1;
          }
          if (param0 == 12) {
            var5 = -1;
            var4 = -1;
          }
          if (param0 == 13) {
            var4 = 1;
            var5 = -1;
          }
          if (param0 == 14) {
            var5 = 1;
            var4 = -1;
          }
          if (param0 == 15) {
            var4 = 1;
            var5 = 1;
          }
          ik.field_i = sc.a(-124, var2 * var5, var4 * var2);
          return;
        }
        if (var3 < 105) {
          var2 = (-40960 + 16384 * var3) / 220;
          if (param1 < 77) {
            return;
          }
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (param0 == 1) {
            var5Lifetime1 = 1;
          }
          if (param0 == 3) {
            var4Lifetime1 = -1;
          }
          if (param0 == 4) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (param0 == 5) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (param0 == 6) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (7 == param0) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          } else {
            if (8 == param0) {
              var5Lifetime1 = -1;
              var4Lifetime1 = -1;
            }
          }
          if (11 == param0) {
            var4Lifetime1 = -1;
          }
          if (param0 == 12) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          }
          if (param0 == 13) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (param0 == 14) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (param0 == 15) {
            var4Lifetime1 = 1;
            var5Lifetime1 = 1;
          }
          ik.field_i = sc.a(-124, var2 * var5Lifetime1, var4Lifetime1 * var2);
          return;
        }
        if (var3 >= 120) {
          if (param1 < 77) {
            return;
          }
          var4Lifetime2 = 1;
          var5Lifetime2 = 0;
          if (param0 == 1) {
            var5Lifetime2 = 1;
          }
          if (param0 == 3) {
            var4Lifetime2 = -1;
          }
          if (param0 == 4) {
            var5Lifetime2 = 1;
            var4Lifetime2 = 1;
          }
          if (param0 == 5) {
            var5Lifetime2 = 1;
            var4Lifetime2 = -1;
          }
          if (param0 == 6) {
            var5Lifetime2 = -1;
            var4Lifetime2 = 1;
          }
          if (7 == param0 ||
            8 == param0) {
            var5Lifetime2 = -1;
            var4Lifetime2 = -1;
          }
          if (11 == param0) {
            var4Lifetime2 = -1;
          }
          if (param0 == 12) {
            var5Lifetime2 = -1;
            var4Lifetime2 = -1;
          }
          if (param0 == 13) {
            var4Lifetime2 = 1;
            var5Lifetime2 = -1;
          }
          if (param0 == 14) {
            var5Lifetime2 = 1;
            var4Lifetime2 = -1;
          }
          if (param0 == 15) {
            var4Lifetime2 = 1;
            var5Lifetime2 = 1;
          }
          ik.field_i = sc.a(-124, var2 * var5Lifetime2, var4Lifetime2 * var2);
          return;
        }
        var3 = -var3 + 120;
        var2Lifetime1 = 8192 - var3 * var3 * 8192 / 3300;
        if (param1 < 77) {
          return;
        }
        var4Lifetime3 = 1;
        var5Lifetime3 = 0;
        if (param0 == 1) {
          var5Lifetime3 = 1;
        }
        if (param0 == 3) {
          var4Lifetime3 = -1;
        }
        if (param0 == 4) {
          var5Lifetime3 = 1;
          var4Lifetime3 = 1;
        }
        if (param0 == 5) {
          var5Lifetime3 = 1;
          var4Lifetime3 = -1;
        }
        if (param0 == 6) {
          var5Lifetime3 = -1;
          var4Lifetime3 = 1;
        }
        if (7 == param0 ||
          8 == param0) {
          var5Lifetime3 = -1;
          var4Lifetime3 = -1;
        }
        if (11 == param0) {
          var4Lifetime3 = -1;
        }
        if (param0 == 12) {
          var5Lifetime3 = -1;
          var4Lifetime3 = -1;
        }
        if (param0 == 13) {
          var4Lifetime3 = 1;
          var5Lifetime3 = -1;
        }
        if (param0 == 14) {
          var5Lifetime3 = 1;
          var4Lifetime3 = -1;
        }
        if (param0 == 15) {
          var4Lifetime3 = 1;
          var5Lifetime3 = 1;
        }
        ik.field_i = sc.a(-124, var2Lifetime1 * var5Lifetime3, var4Lifetime3 * var2Lifetime1);
        return;
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param0 != 4826) {
            return false;
          }
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!uc.a((char) var3, false) &&
              !re.a(param0 ^ -4843, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("bg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, String param2, int param3, we param4, int param5, String param6) {
        RuntimeException var8 = null;
        vg var9 = null;
        mh var10 = null;
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
          var10 = new mh(20, param1, 120 + param3, 25, param4, false, 120, param5, t.field_z, 16777215, param2);
          this.b((byte) -88, var10);
          var9 = new vg(((ag) ((Object) param4)).a(-121), param6, 126, var10.field_p + param1, param3 + 50, param0);
          var9.field_o = (of) (this);
          this.b((byte) -84, var9);
          stackIn_1_0 = var10.field_p + var9.field_p;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("bg.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(int param0) {
        if (param0 == 200) {
          ((hh) (this.field_N.a(-114))).f((byte) -82);
          return;
        }
        String var3 = (String) null;
        int discarded$0 = this.a(-96, -126, (String) null, 71, (we) null, 63, (String) null);
        ((hh) (this.field_N.a(-114))).f((byte) -82);
    }

    public final void a(String param0, int param1) {
        qc var3 = null;
        String var4 = null;
        try {
          var3 = this.field_N;
          var4 = param0;
          if (param1 >= -50) {
            String var5 = (String) null;
            this.a((String) null, -32);
          }
          ((rj) ((Object) var3)).a(false, -5905, var4);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "bg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public bg() {
        super(0, 0, 496, 0, (ml) null);
        this.field_N = new qc("", (of) null, 12);
        this.field_D = new qc("", (of) null, 100);
        this.field_I = new qc("", (of) null, 100);
        this.field_H = new qc("", (of) null, 20);
        this.field_J = new qc("", (of) null, 20);
        this.field_F = new qc("", (of) null, 3);
        int var1 = 1;
        this.field_O = new em("", (of) null, var1 != 0);
        this.field_z = new t(pl.field_b, (of) null);
        this.field_K = new t(aj.field_d, (of) null);
        this.field_N.field_m = oa.field_E;
        this.field_D.field_m = ad.field_f;
        this.field_I.field_m = rf.field_b;
        this.field_H.field_m = kd.field_d;
        this.field_J.field_m = id.field_h;
        this.field_F.field_m = ri.field_d;
        this.field_O.field_m = a.field_j;
        this.field_N.a(new hh(this.field_N), true);
        this.field_D.a(new uk(this.field_D), true);
        this.field_I.a(new fd(this.field_I, this.field_D), true);
        this.field_H.a(new df(this.field_H, this.field_N, this.field_D), true);
        this.field_J.a(new rd(this.field_J, this.field_H), true);
        this.field_F.a(new th(this.field_F), true);
        this.field_z.field_w = false;
        this.field_z.field_h = (ml) ((Object) new hd());
        this.field_K.field_h = (ml) ((Object) new lc());
        this.field_N.field_h = (ml) ((Object) new mg(10000536));
        mg dupTemp$0 = new mg(10000536);
        this.field_I.field_h = (ml) ((Object) dupTemp$0);
        this.field_D.field_h = (ml) ((Object) dupTemp$0);
        this.field_F.field_h = (ml) ((Object) new mg(10000536));
        this.field_O.field_h = (ml) ((Object) new wi());
        ve dupTemp$1 = new ve(10000536);
        this.field_J.field_h = (ml) ((Object) dupTemp$1);
        this.field_H.field_h = (ml) ((Object) dupTemp$1);
        String var2 = gg.a(new String[]{this.e((byte) -95), this.b(false)}, uk.field_p, true);
        int var3 = 20;
        var3 = var3 + this.a(-107, be.field_e, this.field_D, 170, var3);
        var3 = var3 + (5 + this.a(20, var3, ef.field_a, 170, this.field_I, 3, ""));
        var3 = var3 + this.a(-112, ec.field_c, this.field_H, 170, var3);
        var3 = var3 + (5 + this.a((byte) 98, 170, this.field_J, ce.field_a, var3, jj.field_B));
        var3 = var3 + (5 + this.a((byte) 122, 170, this.field_N, ke.field_e, var3, wj.field_l));
        var3 = var3 + this.a(var3, 93, 170, mg.field_v, this.field_F);
        mh var4 = new mh(46, var3, -90 + this.field_l, 25, this.field_O, true, -120 + this.field_l, 5, pf.field_c, 11579568, je.field_f);
        this.b((byte) -52, var4);
        var3 = var3 + var4.field_p;
        a var5 = new a(t.field_z, 0, 0, 0, 0, 16777215, -1, 0, 0, t.field_z.field_C, -1, 2147483647, true);
        this.field_C = new jj(var2, var5);
        this.field_C.field_m = "";
        this.field_C.a(false, 0, kg.field_a);
        this.field_C.a(false, 1, kg.field_a);
        this.field_C.field_o = (of) (this);
        this.field_C.c(46, var3, -90 + this.field_l, -1);
        var3 = var3 + (15 + this.field_C.field_p);
        this.b((byte) -127, this.field_C);
        int var6 = 4;
        int var7 = 200;
        this.field_z.a(40, 13361, 496 - var7 >> 1, var7, var3);
        this.field_K.a(40, 13361, var6 + 3, 60, 15 + var3);
        this.field_K.field_o = (of) (this);
        this.field_z.field_o = (of) (this);
        this.b((byte) -33, this.field_z);
        this.b((byte) -27, this.field_K);
        this.field_G = new cm((sh) (this));
        this.field_G.a(150, 13361, this.field_N.field_r + this.field_N.field_l + 60, -60 + (-this.field_N.field_l - this.field_N.field_r) + this.field_l, this.field_N.field_e + 20);
        this.b((byte) -112, this.field_G);
        this.a(var6 + 55 + var3, 13361, 0, 496, 0);
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        boolean discarded$1 = false;
        jj var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param3 != 7) {
            var7 = (jj) null;
            this.a(-82, -126, (jj) null, -55);
          }
          if (param4 != this.field_K) {
            if (param4 == this.field_z) {
              discarded$1 = this.d((byte) 104);
            }
          } else {
            wg.f(param3 ^ -8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("bg.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, 105)) {
            return true;
          }
          var5_int = -20 % ((37 - param3) / 50);
          if (param2 == 98) {
            stackIn_5_0 = this.a((byte) 112, param0);
            return stackIn_5_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(param0, false);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("bg.V(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2, String param3, we param4) {
        RuntimeException var6 = null;
        vh var7 = null;
        int var8 = 0;
        mh var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new mh(20, param0, param2 + 120, 25, param4, false, 120, 3, t.field_z, 16777215, param3);
          this.b((byte) -67, var9);
          var7 = new vh(((ag) ((Object) param4)).a(-107));
          this.b((byte) -82, var7);
          var8 = -12 / ((param1 + 16) / 48);
          var7.a(15, 13361, 3 + var9.field_l + var9.field_r, 15, (-15 + var9.field_p >> 1) + var9.field_e);
          stackIn_1_0 = var9.field_p;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("bg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final boolean l(int param0) {
        if (param0 != -2706) {
          return true;
        }
        if (!this.a(-59, this.field_N)) {
          return false;
        }
        if (!this.a(-110, this.field_D)) {
          return false;
        }
        if (!this.a(param0 + 2684, this.field_I)) {
          return false;
        }
        if (!this.a(param0 + 2694, this.field_H)) {
          return false;
        }
        if (!this.a(param0 + 2819, this.field_J)) {
          return false;
        }
        if (this.a(param0 + 2829, this.field_F)) {
          return true;
        }
        return false;
    }

    private final boolean d(byte param0) {
        if (!this.l(param0 - 2810)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_F.field_s);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 == 104) {
          return kh.a(this.field_H.field_s, 71, this.field_O.field_u, this.field_N.field_s, var2, this, this.field_D.field_s);
        }
        return false;
    }

    private final String b(boolean param0) {
        boolean discarded$0 = false;
        if (param0) {
          discarded$0 = this.d((byte) -104);
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final String e(byte param0) {
        int var2 = -60 / ((param0 + 43) / 45);
        return "<u=2164A2><col=2164A2>";
    }

    final void a(we param0, int param1, int param2, byte param3) {
        if (param3 > -13) {
          return;
        }
        try {
          super.a(param0, param1, param2, (byte) -23);
          this.field_z.field_w = this.l(-2706);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "bg.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void k(int param0) {
        field_B = null;
        field_L = null;
        if (param0 != 20660) {
          bg.k(96);
        }
    }

    static {
        field_B = new String[]{"All scores", "My scores", "Best each"};
        field_L = new int[8192];
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends nb implements ag, jk {
    static int field_D;
    bb field_F;
    private cl field_E;
    private kf field_B;
    private kf field_G;
    static String field_C;

    public final void a(String param0, byte param1) {
        cl var3 = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_E;
          var4 = param0;
          ((rl) ((Object) var3)).a(var4, -1, false);
          if (param1 < 103) {
            r.h(89);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("r.HA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(String param0, String param1, w param2, int param3, int param4, int param5) {
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
          if (param3 != 11271) {
            this.field_F = (bb) null;
          }
          stackIn_3_0 = this.a(param1, 35, 93, param5, param0, param4, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("r.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        String var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param2 != 215535458) {
            var7 = (String) null;
            this.a((String) null, (byte) 106);
          }
          if (this.field_B == param4) {
            dc.c(255);
          } else {
            if (this.field_G == param4) {
              this.g(126);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("r.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 != -12) {
          return;
        }
        ((ol) (this.field_E.a((byte) 94))).e(param0 + 95);
    }

    public static void h(int param0) {
        if (param0 != -100) {
          return;
        }
        field_C = null;
    }

    final void a(byte param0, w param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_G.field_D = this.d((byte) -89);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "r.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(String param0, int param1, int param2, int param3, String param4, int param5, w param6) {
        RuntimeException var8 = null;
        li var9 = null;
        int var10 = 0;
        jf var11 = null;
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
          var11 = new jf(20, param3, param5 + 120, 25, param6, false, 120, 3, ql.field_Q, 16777215, param0);
          this.b((byte) 73, var11);
          var9 = new li(((nd) ((Object) param6)).a((byte) 6), param4, 126, param3 + var11.field_v, 25 + param5, param1);
          var10 = -12 / ((21 - param2) / 47);
          var9.field_r = (vd) (this);
          this.b((byte) -93, var9);
          stackIn_1_0 = var9.field_v + var11.field_v;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("r.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw ld.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeKeyListener(ol.field_l);
          param0.removeFocusListener(ol.field_l);
          vg.field_b = -1;
          if (param1 != 20) {
            df var3 = (df) null;
            r.a((df) null, -73);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "r.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, nd param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        sc var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a((byte) 118);
          if (var3 == null) {
            return true;
          }
          var4 = var3.b((byte) 126);
          if (param0 == 4293) {
            stackIn_10_0 = (var4 == rh.field_p);
            return stackIn_10_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("r.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(df param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          for (var2_int = param1; var2_int < 3; var2_int++) {
            ok.field_G[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < pj.field_H; var2_intLifetime1++) {
            if (tf.field_d[var2_intLifetime1].field_g == param0.field_g) {
              dupTemp$3 = tf.field_d[var2_intLifetime1].a(-1);
              ok.field_G[dupTemp$3] = ok.field_G[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a(-1);
          ok.field_G[dupTemp$0] = ok.field_G[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; pj.field_H > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_g == tf.field_d[var3].field_g) {
              var4 = tf.field_d[var3].a(-1);
              if (ok.field_G[var4] > si.field_s) {
                ok.field_G[var4] = ok.field_G[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              tf.field_d[incrementValue$2] = tf.field_d[var3];
            }
          }
          pj.field_H = var2_intLifetime2;
          fieldTemp$1 = pj.field_H;
          pj.field_H = pj.field_H + 1;
          tf.field_d[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("r.H(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    public r() {
        super(0, 0, 496, 0, (rd) null);
        this.field_E = new cl("", (vd) null, 12);
        ik var1 = new ik(cl.field_T, 0, 0, 0, 0, 16777215, -1, 3, 0, ql.field_Q.field_E, -1, 2147483647, true);
        w var2 = new w(oh.field_c, var1, (vd) null);
        this.field_G = new kf(va.field_l, (vd) null);
        this.field_B = new kf(he.field_a, (vd) null);
        this.field_E.field_q = cl.field_Q;
        this.field_E.a(new ol(this.field_E), (byte) 23);
        this.field_G.field_D = false;
        this.field_G.field_i = (rd) ((Object) new v());
        this.field_B.field_i = (rd) ((Object) new uj());
        this.field_E.field_i = (rd) ((Object) new id(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 270, true, var3, 20);
        var3 += 50;
        this.b((byte) 106, var2);
        var3 = var3 + (5 + this.a(nk.field_C, hc.field_kb, this.field_E, 11271, 170, var3));
        this.field_G.a(40, var5, true, var3, 496 - var5 >> 1);
        this.field_B.a(40, 60, true, 15 + var3, var4 + 3);
        this.field_B.field_r = (vd) (this);
        this.field_G.field_r = (vd) (this);
        this.b((byte) -97, this.field_G);
        this.b((byte) -67, this.field_B);
        this.field_F = new bb((ag) (this));
        this.field_F.a(150, this.field_j - this.field_E.field_t + (-this.field_E.field_j - 60), true, 20, this.field_E.field_j + this.field_E.field_t + 60);
        this.b((byte) 53, this.field_F);
        this.a(55 + (var3 + var4), 496, true, 0, 0);
    }

    private final boolean d(byte param0) {
        int var2 = -82 % ((param0 - 48) / 58);
        if (!this.a(4293, (nd) (this.field_E))) {
          return false;
        }
        return true;
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, (byte) -105)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(0, param2);
            return stackIn_6_0;
          }
          var5_int = 3 % ((-13 - param3) / 55);
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.c((byte) 119, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("r.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void g(int param0) {
        if (!this.d((byte) 114)) {
          return;
        }
        if (param0 < 108) {
          this.field_F = (bb) null;
        }
        rb.a((byte) 112, this.field_E.field_u);
    }

    static {
        field_C = "Type your password again to make sure it's correct";
    }
}

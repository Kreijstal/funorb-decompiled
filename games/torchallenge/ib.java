/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends kj implements tb, sg {
    li field_L;
    private ng field_J;
    static int[] field_O;
    static ka[] field_M;
    static String field_N;
    private ng field_K;
    private rf field_P;

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        bf var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 != 25) {
            var5 = (bf) null;
            ib.a(true, (bf) null);
          }
          if (10 <= li.field_K) {
            if (!eh.a(param1 ^ 43)) {
              qg.b();
              v.e(240, 320, 101);
              nj.a(0, 0, param0, 0);
            } else {
              if (gj.field_c != 0) {
                il.a(-20895, param0);
              } else {
                ll.a(0, false, param2);
                nj.a(0, 0, param0, 0);
              }
            }
          } else {
            var3_int = 0;
            if (je.field_f) {
              je.field_f = false;
              var3_int = 1;
            }
            o.a(ra.a(param1 ^ 24), param1 + 278, var3_int != 0, dl.field_l, sa.a(true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ib.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(String param0, int param1, int param2, int param3, String param4, ee param5) {
        RuntimeException var7 = null;
        java.applet.Applet var8 = null;
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
          if (param3 > -89) {
            var8 = (java.applet.Applet) null;
            ib.a(-106, (java.applet.Applet) null);
          }
          stackIn_3_0 = this.a(param1, param4, param5, param2, param0, 83, 35);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ib.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0, bf param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            o.field_j[var2_int] = 0;
          }
          var2_intLifetime1 = 0;
          if (!param0) {
            field_O = (int[]) null;
          }
          while (var2_intLifetime1 < vd.field_f) {
            if (param1.field_b == we.field_i[var2_intLifetime1].field_b) {
              dupTemp$3 = we.field_i[var2_intLifetime1].a((byte) -116);
              o.field_j[dupTemp$3] = o.field_j[dupTemp$3] + 1;
            }
            var2_intLifetime1++;
          }
          dupTemp$0 = param1.a((byte) -116);
          o.field_j[dupTemp$0] = o.field_j[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; vd.field_f > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param1.field_b == we.field_i[var3].field_b) {
              var4 = we.field_i[var3].a((byte) -116);
              if (o.field_j[var4] > tc.field_l) {
                o.field_j[var4] = o.field_j[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              we.field_i[incrementValue$2] = we.field_i[var3];
            }
          }
          vd.field_f = var2_intLifetime2;
          fieldTemp$1 = vd.field_f;
          vd.field_f = vd.field_f + 1;
          we.field_i[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("ib.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4) {
            this.h(-69);
          }
          if (param0 != this.field_K) {
            if (param0 == this.field_J) {
              this.h(17945);
            }
          } else {
            nd.b((byte) 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ib.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean a(int param0, uh param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        rj var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(-117);
          if (var3 == null) {
            return true;
          }
          if (param0 >= -79) {
            return false;
          }
          var4 = var3.b(122);
          stackIn_9_0 = (tf.field_w == var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ib.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          java.awt.Canvas var8 = null;
          String var9 = null;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var7 = TorChallenge.field_F ? 1 : 0;
          try {
            if (ed.field_d) {
              return true;
            }
            try {
              if (param0 < 76) {
                var8 = (java.awt.Canvas) null;
                ib.a((java.awt.Canvas) null, -77, false);
              }
              var9 = "tuhstatbut";
              var3 = (String) (ff.a("getcookies", param1, 20511));
              var4 = dl.a(var3, ';', -26);
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var9)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            stackIn_19_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref;
            stackIn_22_1 = new StringBuilder().append("ib.I(").append(param0).append(',');
            if (param1 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        try {
          super.a(param0, param1, (byte) -101, param3);
          this.field_J.field_F = this.f((byte) 118);
          if (param2 > -97) {
            field_N = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ib.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(String param0, int param1) {
        rf var3 = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_P;
          var4 = param0;
          ((dj) ((Object) var3)).a(var4, false, (byte) -21);
          if (param1 > -84) {
            this.h(66);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("ib.AA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        if (param0) {
          return;
        }
        field_M = null;
        field_N = null;
        field_O = null;
    }

    public ib() {
        super(0, 0, 496, 0, (j) null);
        this.field_P = new rf("", (gg) null, 12);
        bc var1 = new bc(ug.field_f, 0, 0, 0, 0, 16777215, -1, 3, 0, oe.field_g.field_x, -1, 2147483647, true);
        ee var2 = new ee(kg.field_eb, var1, (gg) null);
        this.field_J = new ng(jl.field_g, (gg) null);
        this.field_K = new ng(nh.field_fb, (gg) null);
        this.field_P.field_r = ci.field_o;
        this.field_P.a(-27997, new i(this.field_P));
        this.field_J.field_F = false;
        this.field_J.field_q = (j) ((Object) new cl());
        this.field_K.field_q = (j) ((Object) new me());
        this.field_P.field_q = (j) ((Object) new fk(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a((byte) 119, 20, 50, 270, var3);
        this.a(0, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(pa.field_t, 170, var3, -114, te.field_a, this.field_P));
        this.field_J.a((byte) 120, 496 - var5 >> 1, 40, var5, var3);
        this.field_K.a((byte) 118, 3 + var4, 40, 60, var3 + 15);
        this.field_K.field_k = (gg) (this);
        this.field_J.field_k = (gg) (this);
        this.a(0, this.field_J);
        this.a(0, this.field_K);
        this.field_L = new li((tb) (this));
        this.field_L.a((byte) 115, this.field_P.field_m + (this.field_P.field_p + 60), 150, -60 + (-this.field_P.field_p + this.field_p) - this.field_P.field_m, 20);
        this.a(0, this.field_L);
        this.a((byte) 114, 0, 55 + var3 + var4, 496, 0);
    }

    public final void a(int param0) {
        ((i) (this.field_P.a(param0 + 23025))).f(param0 ^ param0);
    }

    private final boolean f(byte param0) {
        if (param0 <= 52) {
          this.field_L = (li) null;
        }
        if (this.a(-95, (uh) (this.field_P))) {
          return true;
        }
        return false;
    }

    private final void h(int param0) {
        if (!this.f((byte) 62)) {
          return;
        }
        nd.a(true, this.field_P.field_v);
        if (param0 != 17945) {
          field_M = (ka[]) null;
        }
    }

    private final int a(int param0, String param1, ee param2, int param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        dh var9 = null;
        bg var10 = null;
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
          var10 = new bg(20, param3, 120 + param0, 25, param2, false, 120, 3, oe.field_g, 16777215, param4);
          this.a(0, var10);
          var9 = new dh(((uh) ((Object) param2)).a(-126), param1, 126, var10.field_l + param3, param0 + 25, param6);
          var9.field_k = (gg) (this);
          this.a(0, var9);
          if (param5 < 0) {
            field_M = (ka[]) null;
          }
          stackIn_3_0 = var10.field_l + var9.field_l;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ib.D(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 9) {
            return false;
          }
          if (super.a(param0, param1, (byte) 117, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_10_0 = this.a(param3, (byte) -16);
            return stackIn_10_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_13_0 = this.b(106, param3);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ib.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2, t param3, boolean param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          wa.field_rb[0] = id.field_a.nextInt();
          wa.field_rb[1] = id.field_a.nextInt();
          wa.field_rb[2] = (int)(lh.field_u >> 32);
          wa.field_rb[3] = (int)lh.field_u;
          pk.field_e.field_q = 0;
          pk.field_e.a(wa.field_rb[0], param1);
          pk.field_e.a(wa.field_rb[1], false);
          pk.field_e.a(wa.field_rb[2], false);
          pk.field_e.a(wa.field_rb[3], param1);
          hc.a(pk.field_e, (byte) -13);
          pk.field_e.a(param0, (byte) 106);
          param3.a(pk.field_e, -76);
          dk.field_s.field_q = 0;
          if (param2) {
            dk.field_s.d(18, (byte) 122);
          } else {
            dk.field_s.d(16, (byte) 122);
          }
          dk.field_s.field_q = dk.field_s.field_q + 2;
          var5_int = dk.field_s.field_q;
          dk.field_s.a(na.field_c, false);
          dk.field_s.a(true, wh.field_c);
          var6 = 0;
          if (fg.field_S) {
            var6 = var6 | 1;
          }
          if (ed.field_e) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (le.field_c != null) {
            var6 = var6 | 16;
          }
          dk.field_s.d(var6, (byte) 122);
          var7 = mj.a(gi.b(12476), 121);
          if (var7 == null) {
            var7 = "";
          }
          dk.field_s.a(var7, (byte) 94);
          if (le.field_c != null) {
            dk.field_s.a((byte) 27, le.field_c);
          }
          ac.a(mb.field_a, (byte) -105, pk.field_e, jl.field_f, dk.field_s);
          dk.field_s.b(-var5_int + dk.field_s.field_q, (byte) -40);
          nb.a(-1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("ib.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_N = "Username: ";
        field_O = new int[8192];
    }
}

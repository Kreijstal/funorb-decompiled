/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends kn implements f, sh {
    private hc field_J;
    private hc field_P;
    ei field_K;
    private ke field_N;
    static ae field_M;
    static gh field_O;
    static String field_L;
    static String field_I;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param2 != 14965) {
            field_L = (String) null;
          }
          param0 = ke.a('_', (byte) 75, param0, "");
          var3 = re.a(param0, 0);
          stackIn_7_0 = (param1.indexOf(param0) != -1) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("lm.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String n(int param0) {
        if (ic.field_l == ci.field_e) {
          return km.field_b;
        }
        if (!wm.field_f.a(0)) {
          return wm.field_f.a(false);
        }
        int var1 = 104 % ((param0 - 25) / 54);
        if (ci.field_e == bd.field_h) {
          return wm.field_f.a(false);
        }
        return pl.field_a;
    }

    public final void a(byte param0) {
        ((qi) (this.field_N.a(35))).b((byte) -82);
        if (param0 != 47) {
          String var3 = (String) null;
          lm.a((String) null, (String) null, -67);
        }
    }

    public final void a(String param0, int param1) {
        ke var3 = null;
        String var4 = null;
        try {
          var3 = this.field_N;
          var4 = param0;
          ((ui) ((Object) var3)).a(false, false, var4);
          int var5 = 105 % ((param1 - 22) / 62);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "lm.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
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
          if (param3 == 98) {
            stackIn_6_0 = this.b(param1, param2 ^ -79);
            return stackIn_6_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(param1, (byte) 12);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("lm.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 > -85) {
          return;
        }
        field_L = null;
        field_O = null;
        field_M = null;
        field_I = null;
    }

    final static String[] a(sb param0, byte param1) {
        int var4 = 0;
        ta var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        String[] var3 = null;
        int var5 = 0;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          var2 = new ta();
          while (param0.field_u.length > param0.field_o) {
            var3_int = af.a(param0, var2, -113);
            if (!ne.a(var3_int, uf.field_q, param0, (byte) -87)) {
              continue;
            }
            param0.field_o = param0.field_o + (uf.field_q.length - 1);
            break;
          }
          var3 = new String[var2.c((byte) -121)];
          for (var4 = 0; var3.length > var4; var4++) {
            var3[var4] = ((lj) (var2.e(63854))).field_n;
          }
          if (param1 != -101) {
            lm.f((byte) -38);
          }
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("lm.U(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        int discarded$1 = 0;
        fe var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 != 6) {
            var7 = (fe) null;
            discarded$1 = this.a(false, (String) null, -122, (String) null, -18, (fe) null);
          }
          if (this.field_J != param2) {
            if (this.field_P == param2) {
              this.g((byte) -93);
            }
          } else {
            fl.a((byte) 107);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("lm.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public lm() {
        super(0, 0, 496, 0, (ad) null);
        this.field_N = new ke("", (rm) null, 12);
        eg var1 = new eg(sl.field_q, 0, 0, 0, 0, 16777215, -1, 3, 0, bn.field_d.field_I, -1, 2147483647, true);
        fe var2 = new fe(me.field_l, var1, (rm) null);
        this.field_P = new hc(he.field_c, (rm) null);
        this.field_J = new hc(u.field_b, (rm) null);
        this.field_N.field_n = vj.field_l;
        this.field_N.a(new qi(this.field_N), 1048576);
        this.field_P.field_E = false;
        this.field_P.field_A = (ad) ((Object) new wi());
        this.field_J.field_A = (ad) ((Object) new nc());
        this.field_N.field_A = (ad) ((Object) new gk(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, -73, 20, 270, var3);
        var3 += 50;
        this.a(-1, var2);
        var3 = var3 + (5 + this.a(false, wm.field_c, var3, hi.field_w, 170, this.field_N));
        this.field_P.a(40, -39, 496 - var5 >> 1, var5, var3);
        this.field_J.a(40, -54, var4 + 3, 60, var3 + 15);
        this.field_J.field_y = (rm) (this);
        this.field_P.field_y = (rm) (this);
        this.a(-1, this.field_P);
        this.a(-1, this.field_J);
        this.field_K = new ei((f) (this));
        this.field_K.a(150, -44, this.field_N.field_v + this.field_N.field_u + 60, -this.field_N.field_v + (this.field_v - this.field_N.field_u - 60), 20);
        this.a(-1, this.field_K);
        this.a(55 + (var3 + var4), -101, 0, 496, 0);
    }

    private final void g(byte param0) {
        if (this.e((byte) -68)) {
          int var2 = 51 / ((-18 - param0) / 62);
          gb.a(-126, this.field_N.field_s);
          return;
        }
    }

    private final int a(int param0, fe param1, String param2, boolean param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        w var9 = null;
        am var10 = null;
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
          var10 = new am(20, param0, 120 + param6, 25, param1, param3, 120, 3, bn.field_d, 16777215, param5);
          this.a(-1, var10);
          var9 = new w(((sg) ((Object) param1)).a(35), param2, 126, var10.field_q + param0, param6 + 25, param4);
          var9.field_y = (rm) (this);
          this.a(-1, var9);
          stackIn_1_0 = var9.field_q + var10.field_q;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("lm.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    private final int a(boolean param0, String param1, int param2, String param3, int param4, fe param5) {
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
          if (!param0) {
            stackIn_4_0 = this.a(param2, param5, param3, false, 35, param1, param4);
            return stackIn_4_0;
          }
          stackIn_2_0 = 85;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("lm.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
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
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final boolean e(byte param0) {
        if (param0 >= -13) {
          sb var3 = (sb) null;
          lm.a((sb) null, (byte) 25);
          if (this.a(124, (sg) (this.field_N))) {
            return true;
          }
          return false;
        }
        if (this.a(124, (sg) (this.field_N))) {
          return true;
        }
        return false;
    }

    private final boolean a(int param0, sg param1) {
        jm var3 = null;
        RuntimeException var3_ref = null;
        ag var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(35);
          if (var3 == null) {
            return true;
          }
          var4 = var3.b(24595);
          if (param0 < 25) {
            field_M = (ae) null;
          }
          stackIn_8_0 = (var4 == sc.field_a);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("lm.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        try {
          super.a(param0, param1, (byte) 103, param3);
          this.field_P.field_E = this.e((byte) -14);
          if (param2 < 49) {
            field_M = (ae) null;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "lm.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        int stackIn_110_0 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        var3 = MinerDisturbance.field_ab;
        if (param1 != 98) {
          return;
        }
        hk.field_e = hk.field_e + 1;
        if (se.field_K == param0) {
          se.field_K = param0;
          if (!fh.field_d &&
            ld.field_w > hk.field_e &&
            k.field_i) {
            hk.field_e = 0;
            im.field_c = nk.field_w;
            qd.field_P = gb.field_e;
          }
          if (fh.field_d) {
            if (hk.field_e != se.field_M) {
              return;
            }
            hk.field_e = 0;
            fh.field_d = false;
          }
          return;
        }
        if (fh.field_d) {
          var2 = 0;
          if (-1 == param0) {
            hk.field_e = 0;
          } else {
            if (!fh.field_d &&
              var2 == 0) {
              hk.field_e = 0;
            } else {
              hk.field_e = ld.field_w;
            }
          }
          im.field_c = nk.field_w;
          qd.field_P = gb.field_e;
          if (param0 != -1) {
            fh.field_d = false;
          } else {
            if (var2 != 0) {
              fh.field_d = true;
            }
          }
          se.field_K = param0;
          if (!fh.field_d &&
            ld.field_w > hk.field_e &&
            k.field_i) {
            hk.field_e = 0;
            im.field_c = nk.field_w;
            qd.field_P = gb.field_e;
          }
          if (fh.field_d &&
            hk.field_e == se.field_M) {
            hk.field_e = 0;
            fh.field_d = false;
          }
          return;
        }
        if (hk.field_e < ld.field_w) {
          var2Lifetime1 = 0;
          if (-1 == param0) {
            hk.field_e = 0;
          } else {
            if (!fh.field_d &&
              var2Lifetime1 == 0) {
              hk.field_e = 0;
            } else {
              hk.field_e = ld.field_w;
            }
          }
          im.field_c = nk.field_w;
          qd.field_P = gb.field_e;
          if (param0 != -1) {
            fh.field_d = false;
          } else {
            if (var2Lifetime1 != 0) {
              fh.field_d = true;
            }
          }
          se.field_K = param0;
          if (!fh.field_d &&
            ld.field_w > hk.field_e &&
            k.field_i) {
            hk.field_e = 0;
            im.field_c = nk.field_w;
            qd.field_P = gb.field_e;
          }
          if (fh.field_d &&
            hk.field_e == se.field_M) {
            hk.field_e = 0;
            fh.field_d = false;
          }
          return;
        }
        stackIn_110_0 = (ld.field_w + qn.field_K <= hk.field_e) ? 0 : 1;
        var2Lifetime2 = stackIn_110_0;
        if (-1 == param0) {
          hk.field_e = 0;
        } else {
          if (!fh.field_d &&
            var2Lifetime2 == 0) {
            hk.field_e = 0;
            im.field_c = nk.field_w;
            qd.field_P = gb.field_e;
            if (param0 != -1) {
              fh.field_d = false;
            } else {
            }
            se.field_K = param0;
            if (!fh.field_d &&
              ld.field_w > hk.field_e &&
              k.field_i) {
              hk.field_e = 0;
              im.field_c = nk.field_w;
              qd.field_P = gb.field_e;
            }
            if (fh.field_d &&
              hk.field_e == se.field_M) {
              hk.field_e = 0;
              fh.field_d = false;
            }
            return;
          }
          hk.field_e = ld.field_w;
        }
        im.field_c = nk.field_w;
        qd.field_P = gb.field_e;
        if (param0 != -1) {
          fh.field_d = false;
        } else {
          if (var2Lifetime2 != 0) {
            fh.field_d = true;
          }
        }
        se.field_K = param0;
        if (!fh.field_d &&
          ld.field_w > hk.field_e &&
          k.field_i) {
          hk.field_e = 0;
          im.field_c = nk.field_w;
          qd.field_P = gb.field_e;
        }
        if (!fh.field_d) {
          return;
        }
        if (hk.field_e != se.field_M) {
          return;
        }
        hk.field_e = 0;
        fh.field_d = false;
        return;
    }

    static {
        field_M = new ae();
        field_O = new gh();
        field_I = "Fed up of slip-sliding around? Grab these designer crampons and put the latest footwear craze to a practical use! You'll grip the ice as if it were rock.";
    }
}

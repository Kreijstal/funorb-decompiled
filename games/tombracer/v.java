/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static int field_k;
    private static String[] field_g;
    private bka field_a;
    static jea field_i;
    static String field_j;
    private int field_e;
    private int field_d;
    private vna field_h;
    private boolean field_f;
    private int[] field_b;
    private vi field_c;

    private final void a(byte param0, kh param1, qh param2) {
        lta var4 = null;
        try {
          if (param0 != -73) {
            this.d(28, -128);
          }
          var4 = new lta();
          this.a(var4, 112, param1);
          var4.a(param2, true, this);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(qh param0, kh param1, int param2) {
        lf var4 = null;
        try {
          if (param2 != 93) {
            java.applet.Applet var5 = (java.applet.Applet) null;
            v.a((byte) -52, (java.applet.Applet) null);
          }
          var4 = new lf();
          this.a(var4, 124, param1);
          var4.a(param0, 0, this);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void d(int param0, int param1) {
        ap var3 = new ap();
        var3.a(param0, (byte) -119);
        hw.a((byte) -111, 1, param1, var3);
    }

    final void a(boolean param0) {
        this.field_a.c(-79);
        if (!param0) {
          this.a((byte) -48);
        }
        this.field_h.d(8);
        this.field_c.a(0);
        this.field_f = false;
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
          this.field_c = (vi) null;
        }
        this.field_a.a((byte) -113, param1);
    }

    private final void a(int param0, kh param1, qh param2) {
        wga var4 = null;
        try {
          var4 = new wga();
          this.a(var4, -46, param1);
          var4.a(4545315, this, param2);
          int var5 = -6 / ((param0 + 78) / 34);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1) {
        if (null == fna.field_j) {
          return;
        }
        int var2 = (int)(1000.0 * qk.field_w[param0]);
        if (param1 == var2) {
          var2 = 1;
        }
        ((psa) (ab.field_n.field_n)).a(param0, vba.field_x[param0], (byte) -4, var2);
    }

    final boolean b(int param0) {
        if (param0 != 1) {
          v.a(-38, (byte) 20, -69, 62, 48, -77);
        }
        return this.field_f;
    }

    private final void a(kh param0, int param1) {
        tt var3 = new tt(this.field_e);
        this.a(var3, -67, param0);
        int var4 = this.field_c.a((byte) 36, var3) ? 1 : 0;
        int var5 = 1;
        if (this.field_d < param1) {
          return;
        }
        if (!var3.a(false, this.field_d)) {
          return;
        }
        try {
          if (var4 != 0) {
            if (!this.field_h.d((byte) 14)) {
              this.field_h.c(34);
              var5 = 0;
            }
            if (var5 == 0) {
            }
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(kh param0, qh param1, int param2) {
        cf var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = new cf(param1.field_k.field_H.length);
          this.a(var4, 126, param0);
          var4.a(param1, param2 - 93);
          if (param2 != 93) {
            this.field_a = (bka) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("v.O(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        uu var3 = new uu();
        var3.a(param1 + 44, param0);
        hw.a((byte) -111, param1, 72, var3);
    }

    final void a(qh param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_7_1 = false;
        Object stackIn_12_0;
        int stackIn_12_1;
        int stackIn_12_2;
        int stackIn_12_3;
        Object stackIn_13_0;
        int stackIn_13_4;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4_int = 0;
        tt var4 = null;
        la var5_ref_la = null;
        int var7 = 0;
        ff var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var8 = param0.field_k;
          if (param1 != 1) {
            return;
          }
          if (!param0.d((byte) 94)) {
            var4_int = this.field_h.a((byte) -16);
            stackIn_7_1 = !(var4_int < 15);
            this.field_f = stackIn_7_1;
            while (var4_int < 15) {
              if (this.field_a.b(param1 - 1) < 8) {
                break;
              }
              var5_ref_la = var8.a(0, this.field_d);
              stackIn_12_0 = this;
              stackIn_12_1 = -115;
              stackIn_12_2 = var8.field_A;
              stackIn_12_3 = var8.c((byte) 115, this.field_d);
              if (var5_ref_la != null) {
                stackIn_13_0 = this;
                stackIn_13_4 = var5_ref_la.q((byte) -82) + 1;
              } else {
                stackIn_13_0 = this;
                stackIn_13_4 = 0;
              }
              this.a(stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_13_4, var8.j(0, this.field_d));
              var4_int++;
            }
          }
          var4 = this.d(-16);
          while (var4 != null) {
            for (var5 = 0; var8.field_H.length > var5; var5++) {
              if (this.field_d != var5 &&
                var4.a(false, var5)) {
                for (var6 = 0; var6 < 8; var6++) {
                  if (this.field_b[var5] == -1) {
                    break;
                  }
                  if (this.field_b[var5] > 0) {
                    this.field_b[var5] = this.field_b[var5] - 1;
                  } else {
                    param0.a(var4.a(false, var5, var6), var5, false);
                  }
                }
              }
            }
            var4 = this.d(param1 - 17);
          }
          if (!param0.d((byte) 106)) {
            if (var8.field_G[this.field_d].b(param1 - 1)) {
              this.a(var8, (byte) -73);
              return;
            }
            if (var8.field_G[this.field_d].e(-31170)) {
              this.a(var8, (byte) -73);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("v.L(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, qh param1, kh param2) {
        nr var4 = null;
        try {
          var4 = new nr();
          if (param0 != 16) {
            this.a(24, 78, 58, -102, 85);
          }
          this.a(var4, param0 - 82, param2);
          var4.a((byte) -78, param1, this);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(bo param0, int param1, kh param2) {
        try {
          int var4_int = -28 / ((param1 - 61) / 43);
          param0.a(param2, (byte) -19);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, qh param1, kh param2) {
        foa var4 = null;
        qh var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = new foa();
          this.a(var4, 112, param2);
          var4.a(param1, -1, this);
          if (param0 >= -7) {
            var5 = (qh) null;
            this.a(-98, (kh) null, (qh) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("v.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(boolean param0, kh param1, qh param2) {
        bqa var4 = null;
        try {
          if (!param0) {
            this.field_h = (vna) null;
          }
          var4 = new bqa();
          this.a(var4, -53, param1);
          var4.a(this, 0, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        int var2 = 32;
        int var2Lifetime1;
        ts.a(0, -121, var2 + 10, "unack: " + this.field_h.a((byte) -16), 16, kn.field_p, 16777215);
        var2Lifetime1 = 48;
        ts.a(0, -122, 10 + var2Lifetime1, "received: " + this.field_c.a((byte) 107), param0, kn.field_p, 16777215);
    }

    final boolean a(byte param0, qh param1, kh param2, int param3) {
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (77 == param3) {
            this.a(param2, 0);
            return true;
          }
          if (param3 == 78) {
            this.a(param1, param2, (byte) -98);
            return true;
          }
          if (param3 == 79) {
            this.a(true, param2, param1);
            return true;
          }
          if (80 == param3) {
            this.a(param1, param2, false);
            return true;
          }
          if (param3 == 81) {
            this.a(param2, param1, 93);
            return true;
          }
          if (82 == param3) {
            this.a(16, param1, param2);
            return true;
          }
          if (83 == param3) {
            this.a(param1, param2, -1);
            return true;
          }
          if (90 == param3) {
            this.b((byte) 30, param1, param2);
            return true;
          }
          if (param3 == 92) {
            this.a((byte) -73, param2, param1);
            return true;
          }
          if (param3 == 91) {
            this.b(param1, param2, 93);
            return true;
          }
          if (param3 == 84) {
            this.a(-31, param2, param1);
            return true;
          }
          if (param3 == 93) {
            this.a((byte) -77, param1, param2);
            return true;
          }
          if (param0 > 40) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_44_0 = var5;
          stackIn_44_1 = new StringBuilder().append("v.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param2 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(ff param0, byte param1) {
        la var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
          while (!this.field_a.b((byte) -26)) {
            var3 = param0.a(0, this.field_d);
            this.a(-92, param0.field_A, 0, var3 == null ? 0 : var3.q((byte) -82) + 1, 0);
          }
          int var3_int = 110 % ((param1 - 27) / 62);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(qh param0, kh param1, boolean param2) {
        uj var4 = null;
        try {
          var4 = new uj(param0.field_k.field_H.length);
          if (param2) {
            this.field_h = (vna) null;
          }
          this.a(var4, 117, param1);
          var4.a(param0, this, (byte) 119);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.CA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(byte param0, qh param1, kh param2) {
        ua var4 = null;
        try {
          var4 = new ua();
          if (param0 != 30) {
            this.a((byte) -120);
          }
          this.a(var4, param0 - 129, param2);
          var4.a(2, this, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1) {
        int var3 = 97 % ((param1 + 33) / 49);
        return this.field_b[param0] == 0 ? true : false;
    }

    private final tt d(int param0) {
        if (param0 != -16) {
          return (tt) null;
        }
        return this.field_c.a(true);
    }

    final void a(int param0, byte param1, int param2) {
        this.field_b[param2] = param0;
        int var4 = -75 % ((param1 + 73) / 32);
        this.field_b[param2] = this.field_b[param2] + 8 * this.field_c.a((byte) 25, param2);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              var3 = sda.a(param1, param0 ^ -65, var4).getFile();
              lb.a(-104, "updatelinks", param1, new Object[]{"home", var3 + "home.ws"});
              if (param0 != 64) {
                field_i = (jea) null;
              }
              lb.a(-121, "updatelinks", param1, new Object[]{"gamelist", var3 + "togamelist.ws"});
              lb.a(-65, "updatelinks", param1, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              lb.a(param0 ^ -54, "updatelinks", param1, new Object[]{"options", var3 + "options.ws"});
              lb.a(-76, "updatelinks", param1, new Object[]{"terms", var3 + "terms.ws"});
              lb.a(-107, "updatelinks", param1, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("v.K(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(qh param0, kh param1, byte param2) {
        vca var4 = null;
        try {
          if (param2 > -67) {
            field_g = (String[]) null;
          }
          var4 = new vca();
          this.a(var4, -4, param1);
          param0.field_k.a((byte) 121, var4.a((byte) 118));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "v.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void f(int param0) {
        this.field_h.d(8);
        this.field_a.c(param0 - 134);
        this.field_b[this.field_d] = 0;
        if (param0 != 10) {
          field_i = (jea) null;
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
          return;
        }
        field_g = null;
        field_i = null;
        field_j = null;
    }

    final static vb a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        if (null == bia.field_J) {
          return null;
        }
        if (param1 > -24) {
          field_g = (String[]) null;
        }
        u var6 = bia.field_J[param3];
        if (var6 == null) {
          fea.a(false, param3);
          var6 = bia.field_J[param3];
        }
        if (param4 > 0) {
          return um.a(param2, param4, var6, -6455, param5);
        }
        return ql.a(param0, var6, (byte) 108, param5, param2);
    }

    final void a(int param0) {
        if (null == ql.field_k) {
          return;
        }
        if (param0 != 6418) {
          v.a(125, (byte) 41, 101, 81, 77, 14);
        }
        ql.field_k.k(81, -2988);
    }

    private final void a(qh param0, kh param1, int param2) {
        vra var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = new vra();
          this.a(var4, param2 ^ -115, param1);
          var4.a(param0, (byte) -123, this);
          if (param2 != -1) {
            this.a(false, 56);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("v.G(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        if (param0 >= -80) {
          qh var9 = (qh) null;
          this.a((kh) null, (qh) null, 41);
        }
        ea var6 = new ea();
        for (var7 = 0; var7 < 8; var7++) {
          var6.a(17, var7, this.field_a.a(-44));
        }
        var6.a(-2767, param4);
        var6.b(8469, param3);
        var6.a(param1, (byte) -113);
        this.field_h.b((byte) -104, var6);
        hw.a((byte) -111, 0, 71, var6);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 125) {
          return;
        }
        for (var2 = 0; var2 < this.field_b.length; var2++) {
          this.field_b[var2] = -1;
        }
    }

    v(int param0, int param1) {
        this.field_a = new bka();
        this.field_h = new vna();
        this.field_d = param0;
        this.field_e = param1;
        this.field_c = new vi();
        this.field_b = new int[param1];
    }

    static {
        field_j = "Please select options in the following rows:  ";
        field_g = new String[6];
        field_g[3] = "Door 4x1 Left";
        field_g[4] = "Door 4x1 Right";
        field_g[5] = "Door 4x1 Lintel";
        field_g[2] = "Door 3x1 Lintel";
        field_g[0] = "Door 3x1 Left";
        field_g[1] = "Door 3x1 Right";
        field_k = 0;
    }
}

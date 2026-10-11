/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends vk implements dc, ga, qk {
    private ab field_B;
    private ng field_K;
    private ng field_z;
    private ng field_G;
    private ng field_E;
    private dk field_I;
    private gh field_D;
    private dk field_M;
    kd field_H;
    static rk field_y;
    private ng field_J;
    private ng field_L;

    public final void a(String param0, byte param1) {
        ng var3 = null;
        String var4 = null;
        String var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_J;
          var4 = param0;
          ((fe) ((Object) var3)).a((byte) -91, false, var4);
          if (param1 > -120) {
            var5 = (String) null;
            this.a((String) null, (byte) -101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("kh.O(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String g(byte param0) {
        if (param0 != -73) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public kh() {
        super(0, 0, 496, 0, (de) null);
        this.field_J = new ng("", (qg) null, 12);
        this.field_z = new ng("", (qg) null, 100);
        this.field_E = new ng("", (qg) null, 100);
        this.field_L = new ng("", (qg) null, 20);
        this.field_G = new ng("", (qg) null, 20);
        this.field_K = new ng("", (qg) null, 3);
        int var1 = 1;
        this.field_D = new gh("", (qg) null, var1 != 0);
        this.field_M = new dk(wk.field_a, (qg) null);
        this.field_I = new dk(fk.field_v, (qg) null);
        this.field_J.field_p = ld.field_jb;
        this.field_z.field_p = q.field_h;
        this.field_E.field_p = ca.field_M;
        this.field_L.field_p = mf.field_e;
        this.field_G.field_p = lh.field_n;
        this.field_K.field_p = ob.field_a;
        this.field_D.field_p = ej.field_q;
        this.field_J.a(new nd(this.field_J), 0);
        this.field_z.a(new mh(this.field_z), 0);
        this.field_E.a(new cf(this.field_E, this.field_z), 0);
        this.field_L.a(new cc(this.field_L, this.field_J, this.field_z), 0);
        this.field_G.a(new vb(this.field_G, this.field_L), 0);
        this.field_K.a(new di(this.field_K), 0);
        this.field_M.field_u = false;
        this.field_M.field_o = (de) ((Object) new gb());
        this.field_I.field_o = (de) ((Object) new wa());
        this.field_J.field_o = (de) ((Object) new fh(10000536));
        fh dupTemp$0 = new fh(10000536);
        this.field_E.field_o = (de) ((Object) dupTemp$0);
        this.field_z.field_o = (de) ((Object) dupTemp$0);
        this.field_K.field_o = (de) ((Object) new fh(10000536));
        this.field_D.field_o = (de) ((Object) new tf());
        sh dupTemp$1 = new sh(10000536);
        this.field_G.field_o = (de) ((Object) dupTemp$1);
        this.field_L.field_o = (de) ((Object) dupTemp$1);
        String var2 = fb.a(nd.field_l, -111, new String[]{this.g((byte) -73), this.j(0)});
        int var3 = 20;
        var3 = var3 + this.a(170, ff.field_q, false, var3, this.field_z);
        var3 = var3 + (this.a((byte) 33, var3, ph.field_mb, "", 20, 170, this.field_E) + 5);
        var3 = var3 + this.a(170, tj.field_y, false, var3, this.field_L);
        var3 = var3 + (5 + this.a(this.field_G, 170, sk.field_a, 37, mc.field_d, var3));
        var3 = var3 + (this.a(this.field_J, 170, tg.field_w, 119, d.field_c, var3) + 5);
        var3 = var3 + this.a(var3, this.field_K, lj.field_f, -113, 170);
        ad var4 = new ad(46, var3, this.field_i - 90, 25, this.field_D, true, -120 + this.field_i, 5, nb.field_b, 11579568, hc.field_d);
        this.a(true, var4);
        var3 = var3 + var4.field_f;
        hd var5 = new hd(nb.field_c, 0, 0, 0, 0, 16777215, -1, 0, 0, nb.field_c.field_p, -1, 2147483647, true);
        this.field_B = new ab(var2, var5);
        this.field_B.field_p = "";
        this.field_B.a(pc.field_b, 113, 0);
        this.field_B.a(pc.field_b, 35, 1);
        this.field_B.field_g = (qg) (this);
        this.field_B.b(46, 100, var3, this.field_i - 90);
        var3 = var3 + (this.field_B.field_f + 15);
        this.a(true, this.field_B);
        int var6 = 4;
        int var7 = 200;
        this.field_M.a(496 - var7 >> 1, var7, (byte) 127, 40, var3);
        this.field_I.a(3 + var6, 60, (byte) 123, 40, var3 + 15);
        this.field_I.field_g = (qg) (this);
        this.field_M.field_g = (qg) (this);
        this.a(true, this.field_M);
        this.a(true, this.field_I);
        this.field_H = new kd((qk) (this));
        this.field_H.a(60 + (this.field_J.field_s + this.field_J.field_i), -this.field_J.field_s + this.field_i - (this.field_J.field_i + 60), (byte) 116, 150, 20 + this.field_J.field_j);
        this.a(true, this.field_H);
        this.a(0, 496, (byte) 121, var3 + (55 + var6), 0);
    }

    private final int a(int param0, String param1, boolean param2, int param3, uj param4) {
        ad var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new ad(20, param3, param0 + 120, 25, param4, param2, 120, 3, nb.field_c, 16777215, param1);
          this.a(true, var6);
          stackIn_1_0 = var6.field_f;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("kh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final boolean a(int param0, ub param1) {
        he var3 = null;
        RuntimeException var3_ref = null;
        p var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(false);
          if (param0 != 1) {
            return false;
          }
          if (var3 == null) {
            return true;
          }
          var4 = var3.b((byte) -128);
          if (var4 == sb.field_n) {
            return false;
          }
          if (cg.field_g == var4) {
            return false;
          }
          if (uh.field_g != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("kh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        oj var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = StarCannon.field_A;
        try {
          if (param0 != -1143) {
            kh.a(-96, 60);
          }
          var4 = (oj) (uc.field_b.c(param0 - 2762));
          while (var4 != null) {
            mg.a(true, var4, param1);
            var4 = (oj) (uc.field_b.a(param0 - 15770));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kh.V(" + param0 + ',' + param1 + ')');
        }
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param2) {
            field_y = (rk) null;
          }
          if (this.field_I == param0) {
            ob.b(11);
          } else {
            if (param0 == this.field_M) {
              discarded$1 = this.i(-1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("kh.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0) {
        boolean discarded$0 = false;
        ((nd) (this.field_J.a(false))).f(param0 ^ 31293);
        if (param0 != -12920) {
          discarded$0 = this.k(26);
        }
    }

    private final int a(int param0, uj param1, String param2, int param3, int param4) {
        RuntimeException var6 = null;
        jg var7 = null;
        int var8 = 0;
        ad var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new ad(20, param0, param4 + 120, 25, param1, false, 120, 3, nb.field_c, 16777215, param2);
          this.a(true, var9);
          var8 = 107 % ((31 - param3) / 59);
          var7 = new jg(((ub) ((Object) param1)).a(false));
          this.a(true, var7);
          var7.a(var9.field_i + (var9.field_s + 3), 15, (byte) 117, 15, (-15 + var9.field_f >> 1) + var9.field_j);
          stackIn_1_0 = var9.field_f;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("kh.R(").append(param0).append(',');
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
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(byte param0, int param1, String param2, String param3, int param4, int param5, uj param6) {
        RuntimeException var8 = null;
        pa var9 = null;
        ad var10 = null;
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
          var10 = new ad(20, param1, param5 + 120, 25, param6, false, 120, 3, nb.field_c, 16777215, param2);
          this.a(true, var10);
          var9 = new pa(((ub) ((Object) param6)).a(false), param3, 126, var10.field_f + param1, 50 + param5, param4);
          var9.field_g = (qg) (this);
          this.a(true, var9);
          if (param0 == 33) {
            stackIn_4_0 = var10.field_f + var9.field_f;
            return stackIn_4_0;
          }
          stackIn_2_0 = 83;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("kh.J(").append(param0).append(',').append(param1).append(',');
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, uj param2, int param3) {
        try {
          super.a(31, param1, param2, param3);
          this.field_M.field_u = this.k(-1);
          if (param0 <= 27) {
            this.field_G = (ng) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kh.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final boolean k(int param0) {
        String discarded$0 = null;
        if (param0 != -1) {
          discarded$0 = this.g((byte) 86);
        }
        if (this.a(param0 ^ -2, (ub) (this.field_J)) &&
          this.a(param0 + 2, (ub) (this.field_z)) &&
          this.a(1, (ub) (this.field_E)) &&
          this.a(1, (ub) (this.field_L)) &&
          this.a(1, (ub) (this.field_G)) &&
          this.a(1, (ub) (this.field_K))) {
          return true;
        }
        return false;
    }

    private final String j(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return "</col></u>";
    }

    private final int a(uj param0, int param1, String param2, int param3, String param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
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
          var7_int = 54 % ((-34 - param3) / 57);
          stackIn_1_0 = this.a((byte) 33, param5, param4, param2, 35, param1, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("kh.W(");
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
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean i(int param0) {
        if (!this.k(-1)) {
          return false;
        }
        int var2 = param0;
        try {
          var2 = Integer.parseInt(this.field_K.field_k);
        } catch (NumberFormatException numberFormatException) {
        }
        return nf.a(this.field_D.field_z, this.field_L.field_k, this.field_J.field_k, var2, this.field_z.field_k, 0, this);
    }

    final static void a(int[] param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$2 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var25Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        int var28Lifetime1;
        int var28Lifetime2;
        int var29Lifetime1;
        int var29Lifetime2;
        var30 = StarCannon.field_A;
        try {
          var13 = 16384 / (param7 * 2 + 1);
          var14 = -param5 + (param7 + (1 - param8));
          if (0 < var14) {
            var14 = 0;
          }
          var15 = -param7 + (-param8 - param5) + ki.field_j;
          if (var15 > 0) {
            var15 = 0;
          }
          var16 = 0;
          var17 = 73 / ((param10 - 73) / 45);
          var18 = 1 + param5 + param7;
          if (ki.field_j < var18) {
            var16 = var18 - ki.field_j;
            var18 = ki.field_j;
          }
          for (var19 = -param1; var19 < 0; var19++) {
            var20 = 0;
            var21 = 0;
            var22 = 0;
            var23 = -param7 + param2;
            var24 = -(param7 << 1) + (var23 - 1);
            var25 = -param7 + param5;
            if (var25 < 0) {
              var24 = var24 - var25;
              var23 = var23 - var25;
              var25 = 0;
            }
            var26 = -var25 + var18;
            while (var25 < var18) {
              if (param0[param6] != 0) {
                param11 = param0[param6];
              } else {
                param11 = 8355711 & param3[var23] >> 1;
              }
              var22 = var22 + (255 & param11);
              var23++;
              var21 = var21 + ((65415 & param11) >> 8);
              var24++;
              param6 += 4;
              var20 = var20 + (param11 >> 16 & 255);
              var25++;
            }
            var24 = var24 + var16;
            var25Lifetime1 = -param8 + 1;
            incrementValue$0 = param2;
            param2++;
            param3[incrementValue$0] = var22 / var26 + (var21 / var26 << 8) + (var20 / var26 << 16);
            while (var25Lifetime1 < var14) {
              var24++;
              if ((param7 + (var25Lifetime1 + param8) + param5) < ki.field_g) {
                if (param0[param6] != 0) {
                  param11 = param0[param6];
                } else {
                  param11 = param3[var23] >> 1 & 8355711;
                }
                param6 += 4;
                var22 = var22 + (255 & param11);
                var26++;
                var21 = var21 + (255 & param11 >> 8);
                var20 = var20 + ((param11 & 16722015) >> 16);
                var23++;
              }
              var27 = var20 / var26;
              var28 = var21 / var26;
              var29 = var22 / var26;
              incrementValue$5 = param2;
              param2++;
              param3[incrementValue$5] = (var27 << 16) + ((var28 << 8) + var29);
              var25Lifetime1++;
            }
            while (var15 > var25Lifetime1) {
              param11 = param3[var24++];
              var20 = var20 - (param11 >> 16 & 255);
              if (var20 < 0) {
                var20 = 0;
              }
              var21 = var21 - (param11 >> 8 & 255);
              if (var21 < 0) {
                var21 = 0;
              }
              var22 = var22 - (param11 & 255);
              if (var22 < 0) {
                var22 = 0;
              }
              if (0 == param0[param6]) {
                param11 = (param3[var23] & 16711422) >> 1;
                var12_int = param11;
                param11 = param11 | (param11 | 16843023) >> 4;
                param11 = param11 - 65793;
                param11 = -((param11 & 1052696) >> 4) + var12_int;
              } else {
                param11 = param0[param6];
              }
              var23++;
              var20 = var20 + ((16774990 & param11) >> 16);
              var22 = var22 + (255 & param11);
              param6 += 4;
              var21 = var21 + (255 & param11 >> 8);
              var27Lifetime1 = var13 * var20 >> 14;
              var28Lifetime1 = var13 * var21 >> 14;
              if (var27Lifetime1 > 255) {
                var27Lifetime1 = 255;
              }
              if (var28Lifetime1 > 255) {
                var28Lifetime1 = 255;
              }
              var29Lifetime1 = var22 * var13 >> 14;
              if (255 < var29Lifetime1) {
                var29Lifetime1 = 255;
              }
              incrementValue$4 = param2;
              param2++;
              param3[incrementValue$4] = (var27Lifetime1 << 16) - (-(var28Lifetime1 << 8) - var29Lifetime1);
              var25Lifetime1++;
            }
            while (var25Lifetime1 < 0) {
              param11 = param3[var24++];
              var22 = var22 - (param11 & 255);
              var20 = var20 - (param11 >> 16 & 255);
              var21 = var21 - ((65308 & param11) >> 8);
              var26--;
              var27Lifetime2 = var20 / var26;
              var28Lifetime2 = var21 / var26;
              if (var28Lifetime2 < 0) {
                var28Lifetime2 = 0;
              } else {
                if (var28Lifetime2 > 255) {
                  var28Lifetime2 = 255;
                }
              }
              var29Lifetime2 = var22 / var26;
              if (var27Lifetime2 < 0) {
                var27Lifetime2 = 0;
              } else {
                if (var27Lifetime2 > 255) {
                  var27Lifetime2 = 255;
                }
              }
              if (var29Lifetime2 >= 0) {
                if (var29Lifetime2 > 255) {
                  var29Lifetime2 = 255;
                }
              } else {
                var29Lifetime2 = 0;
              }
              incrementValue$2 = param2;
              param2++;
              param3[incrementValue$2] = var29Lifetime2 + (var28Lifetime2 << 8) + (var27Lifetime2 << 16);
              var25Lifetime1++;
            }
            param6 = param6 + param9;
            param2 = param2 + param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_65_0 = var12;
          stackIn_65_1 = new StringBuilder().append("kh.F(");
          if (param0 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, int param2, ab param3) {
        int var6 = 0;
        dk var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = StarCannon.field_A;
        try {
          if (param0 != 0) {
            if (1 != param0) {
              if (param0 == 2) {
                qa.a((byte) -117, "conduct.ws");
              }
            } else {
              qa.a((byte) -113, "privacy.ws");
            }
          } else {
            qa.a((byte) -107, "terms.ws");
          }
          if (param1 != -123) {
            var7 = (dk) null;
            this.a((dk) null, 78, true, -77, 22);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("kh.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
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
            stackIn_6_0 = this.b(97, param0);
            return stackIn_6_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_9_0 = this.a((byte) -103, param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("kh.EA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(byte param0) {
        if (param0 != 126) {
          field_y = (rk) null;
        }
        field_y = null;
    }

    static {
        field_y = new rk();
    }
}

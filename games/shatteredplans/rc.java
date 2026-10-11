/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends tn {
    static int field_l;
    pf field_n;
    private ga field_m;
    vk field_o;

    final tn b() {
        qq var1 = (qq) (this.field_n.d(0));
        if (var1 == null) {
          return null;
        }
        if (null != var1.field_K) {
          return (tn) ((Object) var1.field_K);
        }
        return this.d();
    }

    final int a() {
        return 0;
    }

    final void a(int param0) {
        int var2;
        qq var3;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_o.a(param0);
        var3 = (qq) (this.field_n.d(0));
        while (var3 != null) {
          if (!this.field_m.a((byte) 124, var3)) {
            var2 = param0;
            do {
              if (var3.field_p >= var2) {
                this.a(2105376, var3, var2);
                var3.field_p = var3.field_p - var2;
                break;
              }
              this.a(2105376, var3, var3.field_p);
              var2 = var2 - var3.field_p;
            } while (!this.field_m.a(0, (int[]) null, 2, var3, var2));
          }
          var3 = (qq) (this.field_n.a((byte) -71));
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        qq var6 = null;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_o.b(param0, param1, param2);
          var6 = (qq) (this.field_n.d(0));
          while (var6 != null) {
            stackIn_4_0 = this.field_m.a((byte) 122, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var4_int = param1;
              var5 = param2;
              while (var6.field_p < var5) {
                this.a(param0, var4_int, var6, var6.field_p, (byte) 121, var4_int + var5);
                var5 = var5 - var6.field_p;
                var4_int = var4_int + var6.field_p;
                if (this.field_m.a(var4_int, param0, 2, var6, var5)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(param0, var4_int, var6, var5, (byte) 121, var4_int + var5);
                var6.field_p = var6.field_p - var5;
              }
            }
            var6 = (qq) (this.field_n.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("rc.G(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static lp a(byte param0, sd param1, em param2, boolean param3) {
        int var11_int = 0;
        String dupTemp$0 = null;
        int var18 = 0;
        jh stackIn_17_0 = null;
        qk stackIn_17_1 = null;
        StringBuilder stackIn_17_2 = null;
        String stackIn_18_3;
        lp stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ff var5 = null;
        String var6 = null;
        kb var7 = null;
        int var8 = 0;
        ff var9 = null;
        b var10 = null;
        b var11 = null;
        int var12 = 0;
        b var12_ref_b = null;
        qk var13 = null;
        int var13_int = 0;
        ff var14 = null;
        qk var14_ref = null;
        qk var15 = null;
        ff var15_ref = null;
        String var16 = null;
        qk var17 = null;
        int var19 = 0;
        em var20 = null;
        lp var21 = null;
        String var22 = null;
        String var23 = null;
        Object var24 = null;
        jh var24_ref = null;
        String var6Lifetime1;
        String var6Lifetime2;
        var24 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var21 = new lp(0, 0, 209, 70);
          var21.field_h = param1;
          var5 = new ff(-5 + (40 - (-((5 + dm.field_d[0].field_z) * 4) - k.field_d.field_z)), rs.field_Cb.field_J - 7, fj.field_r);
          var21.a(var5, 8);
          var22 = param1.field_q.field_I;
          var6 = var22;
          var6Lifetime1 = var22;
          var6Lifetime2 = var22;
          if (param3) {
            var6Lifetime2 = var22 + " (" + param1.field_o.field_t + ")";
          }
          var7 = new kb(0, 0, 209, param1.field_o.field_k, var6Lifetime2, 16777215, false);
          var21.a(var7, 8);
          var8 = 7;
          var9 = new ff(0, var8 + var7.field_i, 35, 35, uk.a(false, param1.field_q));
          var21.a(var9, 8);
          var10 = new b(40, var8 + (var7.field_i + dm.field_d[0].field_w), 4 * dm.field_d[0].field_z + 15, 35 - dm.field_d[0].field_w, 2, 2105376);
          var21.a(var10, 8);
          for (var11_int = 0; 4 > var11_int; var11_int++) {
            var12_ref_b = new b(var11_int * (5 + dm.field_d[var11_int].field_z) + 40, var7.field_i + var8 + dm.field_d[var11_int].field_w / 2, dm.field_d[var11_int].field_z, 35 - dm.field_d[var11_int].field_w / 2, 2, 2105376);
            var21.a(var12_ref_b, 8);
            var13_int = param1.field_r + param1.field_u[var11_int];
            if (var13_int < 0) {
              var13_int = 0;
            }
            var14_ref = new qk((dm.field_d[var11_int].field_z + 5) * var11_int + 40, dm.field_d[var11_int].field_w + var7.field_i + var8, dm.field_d[var11_int].field_z, rs.field_Cb.field_J, Integer.toString(var13_int));
            var21.a(var14_ref, 8);
            var15_ref = new ff(40 + var11_int * (5 + dm.field_d[var11_int].field_z), var7.field_i + var8, dm.field_d[var11_int]);
            var21.a(var15_ref, 8);
            var23 = ne.field_m[var11_int];
            var16 = var23;
            if (0 == param1.field_u[var11_int]) {
              var16 = var23 + " " + sg.field_yb;
            }
            var15_ref.field_o = var16;
            var14_ref.field_o = var16;
            var12_ref_b.field_o = var16;
          }
          var11 = new b(dm.field_d[0].field_z * 4 + 60, var8 + (var7.field_i + dm.field_d[0].field_w / 2), k.field_d.field_z, -(dm.field_d[0].field_w / 2) + 35, 2, 534312);
          var21.a(var11, 8);
          var12 = param1.field_r;
          if (var12 < 0) {
            var12 = 0;
          }
          if (param0 <= 117) {
            var20 = (em) null;
            rc.a((byte) -57, (sd) null, (em) null, true);
          }
          var13 = new qk(20 + 4 * dm.field_d[0].field_z + 40, dm.field_d[0].field_w + (var7.field_i + var8), k.field_d.field_z, rs.field_Cb.field_J, Integer.toString(var12));
          var21.a(var13, 8);
          var14 = new ff(20 - (-(4 * dm.field_d[0].field_z) - 40), var8 + (var7.field_i - 1), k.field_d);
          var21.a(var14, 8);
          var14.field_o = si.field_w;
          var13.field_o = si.field_w;
          var11.field_o = si.field_w;
          var15 = new qk(54 + dm.field_d[0].field_z * 4, var7.field_i + (var8 + dm.field_d[0].field_w), "=");
          var21.a(var15, 8);
          var24_ref = new jh(4 * dm.field_d[0].field_z + 20 + 40 - (-5 - k.field_d.field_z), var7.field_i + 3, aq.field_i.field_z, aq.field_i.field_w, -1, aq.field_i, (String) null, -1, -1, hq.field_a, (String) null, -1);
          var24_ref.field_h = param1;
          var21.a(var24_ref, 8);
          var17 = new qk(var24_ref.field_k, 29 + var24_ref.field_t, var24_ref.field_m, rs.field_Cb.field_J, Integer.toString(param1.field_x));
          var17.field_h = param1;
          var21.a(var17, 8);
          stackIn_17_0 = var24_ref;
          stackIn_17_1 = var17;
          stackIn_17_2 = new StringBuilder().append(hd.field_j).append(" ");
          if (1 == param1.field_x) {
            stackIn_18_3 = ad.field_a;
          } else {
            stackIn_18_3 = re.a(d.field_c, 4371, new String[]{Integer.toString(param1.field_x)});
          }
          dupTemp$0 = ((StringBuilder) (Object) stackIn_17_2).append(stackIn_18_3).toString();
          stackIn_17_1.field_o = dupTemp$0;
          stackIn_17_0.field_o = dupTemp$0;
          for (var18 = 0; var18 < param2.field_d.length; var18++) {
            if (param2.field_d[var18] != null) {
              continue;
            }
            param2.field_d[var18] = var24_ref;
            param2.field_f[var18] = var21;
            param2.field_i[var18] = var17;
            break;
          }
          stackIn_25_0 = var21;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("rc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(')').toString());
        }
    }

    final tn d() {
        qq var1;
        int var2;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        while (true) {
          var1 = (qq) (this.field_n.a((byte) -71));
          if (var1 == null) {
            return null;
          }
          if (var1.field_K != null) {
            return (tn) ((Object) var1.field_K);
          }
        }
    }

    private final void a(int param0, qq param1, int param2) {
        ga stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        qq stackIn_10_2 = null;
        boolean stackIn_11_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (param0 != 2105376) {
            return;
          }
          if ((4 & this.field_m.field_F[param1.field_y]) != 0) {
            if (param1.field_E >= 0) {
              param1.field_K.a(param2);
              return;
            }
            var4_int = this.field_m.field_u[param1.field_y] / ap.field_j;
            var5 = (1048575 + var4_int - param1.field_j) / var4_int;
            param1.field_j = 1048575 & param1.field_j + param2 * var4_int;
            if (var5 <= param2) {
              if (this.field_m.field_t[param1.field_y] != 0) {
                param1.field_K = al.a(param1.field_M, param1.field_K.f(), 0, param1.field_K.l());
                stackIn_10_0 = this.field_m;
                stackIn_10_1 = -2139009338;
                stackIn_10_2 = (qq) (param1);
                stackIn_11_3 = !(param1.field_A.field_k[param1.field_H] >= 0);
                ((ga) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_11_3);
              } else {
                param1.field_K = al.a(param1.field_M, param1.field_K.f(), param1.field_K.i(), param1.field_K.l());
              }
              if (param1.field_A.field_k[param1.field_H] < 0) {
                param1.field_K.f(-1);
              }
              param2 = param1.field_j / var4_int;
            }
          }
          param1.field_K.a(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("rc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int[] param0, int param1, qq param2, int param3, byte param4, int param5) {
        ga stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        qq stackIn_13_2 = null;
        boolean stackIn_14_3;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        al var11 = null;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if ((4 & this.field_m.field_F[param2.field_y]) != 0 &&
            param2.field_E < 0) {
            var7_int = this.field_m.field_u[param2.field_y] / ap.field_j;
            while (true) {
              var8 = (-param2.field_j + 1048575 + var7_int) / var7_int;
              if (var8 > param3) {
                param2.field_j = param2.field_j + var7_int * param3;
                break;
              }
              param2.field_K.b(param0, param1, var8);
              param2.field_j = param2.field_j + (-1048576 + var8 * var7_int);
              param1 = param1 + var8;
              param3 = param3 - var8;
              var9 = ap.field_j / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param2.field_K;
              if (this.field_m.field_t[param2.field_y] == 0) {
                param2.field_K = al.a(param2.field_M, var11.f(), var11.i(), var11.l());
              } else {
                param2.field_K = al.a(param2.field_M, var11.f(), 0, var11.l());
                stackIn_13_0 = this.field_m;
                stackIn_13_1 = param4 ^ -2139009345;
                stackIn_13_2 = (qq) (param2);
                stackIn_14_3 = !(param2.field_A.field_k[param2.field_H] >= 0);
                ((ga) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_14_3);
                param2.field_K.a(var9, var11.i());
              }
              if (0 > param2.field_A.field_k[param2.field_H]) {
                param2.field_K.f(-1);
              }
              var11.g(var9);
              var11.b(param0, param1, param5 - param1);
              if (!var11.e()) {
                continue;
              }
              this.field_o.a(var11);
            }
          }
          if (param4 != 121) {
            return;
          }
          param2.field_K.b(param0, param1, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("rc.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    rc(ga param0) {
        this.field_n = new pf();
        this.field_o = new vk();
        try {
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "rc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}

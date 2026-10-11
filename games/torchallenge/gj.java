/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    private int field_j;
    static ka field_b;
    private int field_g;
    ka field_e;
    private int field_f;
    static ne field_a;
    static int field_c;
    ka[] field_k;
    private int field_h;
    private boolean field_d;
    private int field_i;

    final gj a(byte param0, ka[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -20) {
            this.field_f = 116;
          }
          this.field_k = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final gj a(boolean param0, int param1) {
        if (param1 != -1) {
          return (gj) null;
        }
        this.field_d = param0 ? true : false;
        return this;
    }

    final gj a(int param0, byte param1) {
        this.field_f = param0;
        if (param1 != 118) {
          return (gj) null;
        }
        return this;
    }

    public static void a(int param0) {
        if (param0 != -909082559) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final gj b(int param0, int param1) {
        if (param0 != -764) {
          return (gj) null;
        }
        this.field_i = param1;
        return this;
    }

    final void a(gj param0, byte param1) {
        param0.field_e = this.field_e;
        if (param1 != 73) {
          return;
        }
        try {
          param0.field_j = this.field_j;
          param0.field_k = this.field_k;
          param0.field_h = this.field_h;
          param0.field_g = this.field_g;
          param0.field_d = this.field_d;
          param0.field_i = this.field_i;
          param0.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "gj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_40_2 = null;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        String stackIn_47_2 = null;
        int stackIn_88_0 = 0;
        boolean stackIn_89_1 = false;
        int stackIn_112_0 = 0;
        int stackIn_113_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          gi.field_c = true;
          nd.field_c = param1;
          if (param0 == ~nd.field_c) {
            var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ll.field_c);
            var4 = 3 + var3_int;
            dl.field_s = new int[var4];
            gf.field_s = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              dl.field_s[var5] = -1;
            }
            pe.field_db = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              gf.field_s[var5] = wf.field_e[var5];
            }
            gf.field_s[-3 + var4] = "";
            gf.field_s[var4 - 2] = cb.field_d;
            dl.field_s[-2 + var4] = 0;
            pe.field_db[0] = 4;
            gf.field_s[-1 + var4] = ab.field_n;
            dl.field_s[-1 + var4] = 1;
            pe.field_db[1] = 5;
          } else if (nd.field_c == 1) {
            var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ll.field_c);
            var4 = 2 + var3_int;
            gf.field_s = new String[var4];
            dl.field_s = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              dl.field_s[var5] = -1;
            }
            pe.field_db = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              gf.field_s[var5] = wf.field_e[var5];
            }
            gf.field_s[var4 - 2] = "";
            gf.field_s[-1 + var4] = ab.field_n;
            dl.field_s[var4 - 1] = 0;
            pe.field_db[0] = 5;
          } else if (nd.field_c != 2) {
            if (3 == nd.field_c) {
              if (!sh.field_u.field_g) {
                var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, d.field_z);
              } else {
                var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, cj.field_a);
              }
              var4 = var3_int + 2;
              gf.field_s = new String[var4];
              dl.field_s = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                dl.field_s[var5] = -1;
              }
              pe.field_db = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                gf.field_s[var5] = wf.field_e[var5];
              }
              gf.field_s[-2 + var4] = "";
              gf.field_s[-1 + var4] = ab.field_n;
              dl.field_s[-1 + var4] = 0;
              pe.field_db[0] = 5;
            } else if (nd.field_c == 4) {
              var3_int = ga.a(~param0, pf.field_c, wf.field_e, aj.field_b, uc.field_T);
              var4 = 2 + var3_int;
              gf.field_s = new String[var4];
              dl.field_s = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                dl.field_s[var5] = -1;
              }
              pe.field_db = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                gf.field_s[var5] = wf.field_e[var5];
              }
              gf.field_s[var4 - 2] = "";
              gf.field_s[-1 + var4] = ab.field_n;
              dl.field_s[var4 - 1] = 0;
              pe.field_db[0] = 5;
            } else {
              if (nd.field_c != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, jd.field_d);
              var4 = 3 + var3_int;
              gf.field_s = new String[var4];
              dl.field_s = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                dl.field_s[var5] = -1;
              }
              pe.field_db = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                gf.field_s[var5] = wf.field_e[var5];
              }
              gf.field_s[-3 + var4] = "";
              gf.field_s[-2 + var4] = ak.field_g;
              dl.field_s[-2 + var4] = 0;
              pe.field_db[0] = 3;
              gf.field_s[-1 + var4] = ab.field_n;
              dl.field_s[var4 - 1] = 1;
              pe.field_db[1] = 5;
            }
          } else {
            var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ni.a(new String[]{"<br><%0><br>"}, 0, qf.field_b));
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(wf.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ji.field_n = new String[var4];
            he.a(wf.field_e, 0, ji.field_n, 0, var4);
            jl.field_c = new String[-1 + (var3_int - var4)];
            he.a(wf.field_e, var4 + 1, jl.field_c, 0, -var4 + var3_int - 1);
            var3_int = ga.a(~param0, pf.field_c, wf.field_e, aj.field_b, ni.a(new String[]{"<br><%0><br>"}, 0, wb.field_q));
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(wf.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            qb.field_c = new String[var4];
            he.a(wf.field_e, 0, qb.field_c, 0, var4);
            qi.field_b = new String[-1 + (-var4 + var3_int)];
            he.a(wf.field_e, 1 + var4, qi.field_b, 0, -1 + (-var4 + var3_int));
            if (qb.field_c.length > ji.field_n.length) {
              stackIn_29_0 = qb.field_c.length;
            } else {
              stackIn_29_0 = ji.field_n.length;
            }
            var5 = stackIn_29_0;
            if (qi.field_b.length > jl.field_c.length) {
              stackIn_32_0 = qi.field_b.length;
            } else {
              stackIn_32_0 = jl.field_c.length;
            }
            var6 = stackIn_32_0;
            var7 = 7 + (var5 + var6);
            gf.field_s = new String[var7];
            dl.field_s = new int[var7];
            for (var8 = 0; var7 > var8; var8++) {
              dl.field_s[var8] = -1;
            }
            dl.field_s[1] = 0;
            gf.field_s[0] = kl.field_c;
            pe.field_db = new int[2];
            gf.field_s[1] = ua.field_a;
            gf.field_s[2] = fb.field_i;
            gf.field_s[3] = ti.field_c;
            pe.field_db[0] = 5;
            gf.field_s[4] = tk.field_T;
            pe.field_db[1] = 2;
            gf.field_s[5] = "";
            dl.field_s[3] = 1;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_39_0 = gf.field_s;
              stackIn_39_1 = 6 + var8Lifetime2;
              if (0 > -var5 + (var8Lifetime2 + qb.field_c.length)) {
                stackIn_40_2 = "";
              } else {
                stackIn_40_2 = qb.field_c[-var5 + (qb.field_c.length + var8Lifetime2)];
              }
              stackIn_39_0[stackIn_39_1] = stackIn_40_2;
            }
            gf.field_s[6 + var5] = null;
            dl.field_s[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_44_0 = gf.field_s;
              stackIn_44_1 = var8Lifetime3 + 7 + var5;
              stackIn_44_2 = ~qi.field_b.length;
              stackIn_44_3 = ~var8Lifetime3;
              if (stackIn_44_2 < stackIn_44_3) {
                stackIn_47_2 = qi.field_b[var8Lifetime3];
              } else {
                stackIn_47_2 = "";
              }
              stackIn_44_0[stackIn_44_1] = stackIn_47_2;
            }
            fd.field_e = ol.a(256);
          }
          ui.field_c.field_b = pe.field_db.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < gf.field_s.length; var4Lifetime1++) {
            stackIn_88_0 = -18;
            stackIn_89_1 = !(dl.field_s[var4Lifetime1] < 0);
            var5Lifetime1 = ki.$cfr$intArgs$a$62abead39cee(stackIn_88_0, stackIn_89_1, gf.field_s[var4Lifetime1]);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (nd.field_c == 2) {
            var10 = ji.field_n;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = ki.$cfr$intArgs$a$62abead39cee(-18, false, var11);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = jl.field_c;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = ki.$cfr$intArgs$a$62abead39cee(-18, false, var12);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          qe.field_R = dg.field_ab - (var3_intLifetime1 >> 1);
          fh.field_c = ui.field_c.field_b * (ai.field_a + uc.field_Y << 1);
          sd.field_a = -(var3_intLifetime1 >> 1) + (var3_intLifetime1 + dg.field_ab);
          for (var4Lifetime2 = 0; gf.field_s.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_112_0 = fh.field_c;
            if (dl.field_s[var4Lifetime2] >= 0) {
              stackIn_113_1 = sl.field_f;
            } else {
              stackIn_113_1 = ok.field_e;
            }
            fh.field_c = stackIn_112_0 + stackIn_113_1;
          }
          jl.field_e = -(fh.field_c >> 1) + ii.field_c;
          r.field_h = new int[gf.field_s.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = jl.field_e;
          while (gf.field_s.length > var4Lifetime3) {
            var6Lifetime1 = dl.field_s[var4Lifetime3];
            if (0 > var6Lifetime1) {
              var5Lifetime3 = var5Lifetime3 + ok.field_e;
            } else {
              var7Lifetime2 = ki.$cfr$intArgs$a$62abead39cee(-18, true, gf.field_s[var4Lifetime3]);
              var5Lifetime3 = var5Lifetime3 + uc.field_Y;
              var8Lifetime1 = -(var7Lifetime2 >> 1) + dg.field_ab;
              r.field_h[var4Lifetime3] = new int[4];
              r.field_h[var4Lifetime3][0] = var8Lifetime1 - ni.field_i;
              r.field_h[var4Lifetime3][1] = var5Lifetime3;
              r.field_h[var4Lifetime3][2] = (ni.field_i << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + (uc.field_Y + (ai.field_a << 1) + sl.field_f);
              r.field_h[var4Lifetime3][3] = sl.field_f + (ai.field_a << 1);
            }
            var4Lifetime3++;
          }
          if (2 == nd.field_c) {
            ui.field_c.a((byte) -86, param2, -1, -1);
          } else {
            ui.field_c.a((byte) 13, param2, 0, ha.a(ph.field_d, kc.field_u, -36));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "gj.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, ee param1, int param2, ga param3, byte param4) {
        eg stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          hd.a(this.field_k, param1.field_l, param1.field_p, (byte) 95, param1.field_i + param0, param1.field_m + param2);
          if (null != this.field_e) {
            var6_int = param2 + param1.field_m + this.field_f;
            var7 = param1.field_i + (param0 + this.field_h);
            if (param3.field_e == 1) {
              var6_int = var6_int + (param1.field_p - this.field_e.field_q) / 2;
            }
            if (param3.field_i == 1) {
              var7 = var7 + (param1.field_l - this.field_e.field_v) / 2;
            }
            if (param3.field_e == 2) {
              var6_int = var6_int + (param1.field_p - this.field_e.field_q);
            }
            if (param3.field_i == 2) {
              var7 = var7 + (param1.field_l - this.field_e.field_v);
            }
            this.field_e.g(var6_int, var7);
          }
          var6 = param3.a(param1, -6782);
          if (param4 != 44) {
            this.b(-104, 43);
          }
          if (var6 != null &&
            param3.field_g != null &&
            this.field_i >= 0) {
            stackIn_20_0 = param3.field_g;
            stackIn_20_1 = var6;
            if (this.field_f == -2147483648) {
              stackIn_21_2 = 0;
            } else {
              stackIn_21_2 = this.field_f;
            }
            stackIn_23_2 = stackIn_21_2 + (param3.field_r + (param1.field_m + param2));
            if (this.field_h != -2147483648) {
              stackIn_24_3 = this.field_h;
            } else {
              stackIn_24_3 = 0;
            }
            stackIn_26_3 = stackIn_24_3 + param1.field_i + (param0 + param3.field_a);
            stackIn_26_4 = -param3.field_p - param3.field_r + param1.field_p;
            stackIn_26_5 = param1.field_l - param3.field_a - param3.field_b;
            stackIn_26_6 = this.field_i;
            stackIn_26_7 = this.field_g;
            if (this.field_j != -2147483648) {
              stackIn_27_8 = this.field_j;
            } else {
              stackIn_27_8 = 256;
            }
            ((eg) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param3.field_e, param3.field_i, param3.field_n);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("gj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(int param0, byte param1, int param2) {
        if (param1 != -123) {
          field_c = 114;
        }
        return param2 + "/" + param0;
    }

    final gj b(int param0, byte param1) {
        this.field_g = param0;
        int var3 = 89 % ((param1 - 48) / 54);
        return this;
    }

    final void a(int param0, gj param1, ga param2, int param3, int param4, ee param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_d) {
            param1.a(param4, param5, param0, param2, (byte) 44);
            param1.b(param3 ^ -15012);
          }
          if (this.field_f != -2147483648) {
            param1.field_f = this.field_f;
          }
          if (this.field_g >= -1) {
            param1.field_g = this.field_g;
          }
          if (-2147483648 != this.field_h) {
            param1.field_h = this.field_h;
          }
          if (this.field_j != -2147483648) {
            param1.field_j = this.field_j;
          }
          if (null != this.field_e) {
            param1.field_e = this.field_e;
          }
          if (this.field_i >= param3) {
            param1.field_i = this.field_i;
          }
          if (null != this.field_k) {
            param1.field_k = this.field_k;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("gj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final gj a(int param0, int param1) {
        if (param1 != 0) {
          return (gj) null;
        }
        this.field_h = param0;
        return this;
    }

    final void b(int param0) {
        this.field_i = 0;
        this.field_e = null;
        this.field_g = -1;
        this.field_h = 0;
        this.field_j = 256;
        if (param0 != 15011) {
          return;
        }
        this.field_k = null;
        this.field_f = 0;
    }

    gj() {
        this.field_j = -2147483648;
        this.field_f = -2147483648;
        this.field_g = -2;
        this.field_e = null;
        this.field_k = null;
        this.field_d = false;
        this.field_h = -2147483648;
        this.field_i = -2;
    }

    static {
    }
}

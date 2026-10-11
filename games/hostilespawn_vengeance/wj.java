/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends ph {
    static String field_K;
    private bg field_I;
    private int field_M;
    static int field_O;
    static String field_G;
    static ub field_N;
    static pf[] field_J;
    static bd field_L;
    static jj field_H;

    final String e(int param0) {
        if (this.field_u) {
          return this.field_I.a(-41);
        }
        if (param0 == 34) {
          return null;
        }
        wj.a((byte) 60);
        return null;
    }

    final static void b(String param0, int param1) {
        try {
          if (param1 != -10603) {
            wj.e((byte) -71);
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "wj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        bm var8;
        int var9;
        int var10;
        int var11;
        bd var12;
        bd var13;
        bd var14;
        var11 = HostileSpawn.field_I ? 1 : 0;
        super.a(param0, param1, (byte) 69, param3);
        if (param3 != 0) {
          return;
        }
        var5 = this.field_v + (param1 + (this.field_s >> 1));
        if (param2 <= 42) {
          field_K = (String) null;
        }
        var6 = (this.field_x >> 1) + (this.field_m + param0);
        var8 = this.field_I.b(-95);
        if (var8 != wl.field_c &&
          m.field_n != var8) {
          if (var8 == bi.field_d) {
            var12 = cf.field_u[2];
            var12.c(var5 - (var12.field_z >> 1), -(var12.field_A >> 1) + var6, 256);
            return;
          }
          if (var8 != nd.field_d) {
            return;
          }
          var13 = cf.field_u[1];
          var13.c(-(var13.field_z >> 1) + var5, -(var13.field_A >> 1) + var6, 256);
          return;
        }
        var14 = cf.field_u[0];
        var9 = var14.field_u << 1;
        var10 = var14.field_r << 1;
        if (null != ng.field_s &&
          var9 <= ng.field_s.field_z &&
          var10 <= ng.field_s.field_A) {
          sb.a(ng.field_s, -127);
          si.d();
        } else {
          ng.field_s = new bd(var9, var10);
          sb.a(ng.field_s, -121);
        }
        var14.b(112, 144, var14.field_u << 4, var14.field_r << 4, -this.field_M << 10, 4096);
        eh.b(false);
        ng.field_s.c(-var14.field_u + var5, var6 - var14.field_r, 256);
        return;
    }

    final static wm e(byte param0) {
        if (param0 >= -59) {
          wj.e((byte) 105);
        }
        return oa.field_b;
    }

    final boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wj.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        if (param1 != 512) {
          wj.a((byte) -69);
        }
        for (var4 = 0; var4 < param0; var4++) {
          var6[var4] = param2;
        }
        return new String(var6);
    }

    public static void j(int param0) {
        field_L = null;
        field_G = null;
        field_N = null;
        field_K = null;
        if (param0 != 11460) {
          String var2 = (String) null;
          wj.b((String) null, -4);
        }
        field_J = null;
        field_H = null;
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
          this.field_M = this.field_M + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "wj.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        oc dupTemp$0 = null;
        oc dupTemp$1 = null;
        ql stackIn_63_0 = null;
        kd stackIn_69_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_100_0 = 0;
        boolean stackIn_104_0 = false;
        wm stackIn_133_0 = null;
        jb[] stackIn_133_1 = null;
        int stackIn_134_2 = 0;
        int stackIn_162_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_186_1 = 0;
        int stackIn_201_0 = 0;
        boolean stackIn_202_1 = false;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int[][] stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        int[] stackIn_247_2 = null;
        boolean stackIn_251_2 = false;
        boolean stackIn_254_3 = false;
        re stackIn_255_0 = null;
        re stackIn_255_1 = null;
        re stackIn_257_0 = null;
        re stackIn_257_1 = null;
        int stackIn_257_2 = 0;
        int[][] stackIn_285_0 = null;
        int stackIn_285_1 = 0;
        int[] stackIn_286_2 = null;
        boolean stackIn_290_2 = false;
        boolean stackIn_293_3 = false;
        re stackIn_295_0 = null;
        re stackIn_295_1 = null;
        re stackIn_296_0 = null;
        re stackIn_296_1 = null;
        int stackIn_296_2 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_103_0;
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        oc var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        og var10 = null;
        int var11_int = 0;
        boolean[] var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13_int = 0;
        oc var13_ref_oc = null;
        double var13 = 0.0;
        int var14 = 0;
        int var15_int = 0;
        double var15 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[] var21 = null;
        boolean[] var22 = null;
        int[] var23 = null;
        boolean[] var24 = null;
        re stackIn_255_0Lifetime1;
        re stackIn_255_1Lifetime1;
        re stackIn_257_0Lifetime1;
        re stackIn_257_1Lifetime1;
        re stackIn_295_0Lifetime1;
        re stackIn_295_1Lifetime1;
        re stackIn_296_0Lifetime1;
        re stackIn_296_1Lifetime1;
        re stackIn_255_0Lifetime1Lifetime1;
        re stackIn_255_1Lifetime1Lifetime1;
        re stackIn_295_0Lifetime1Lifetime1;
        re stackIn_295_0Lifetime1Lifetime2;
        re stackIn_295_1Lifetime1Lifetime1;
        re stackIn_295_1Lifetime1Lifetime2;
        int stackIn_162_0Lifetime1;
        int stackIn_205_0Lifetime1;
        int stackIn_205_1Lifetime1;
        float var1_floatLifetime1;
        float var1_floatLifetime2;
        float var1_floatLifetime3;
        float var1_floatLifetime4;
        float var1_floatLifetime5;
        int var13_intLifetime1;
        int var14Lifetime1;
        int var15_intLifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var19Lifetime1;
        int var13_intLifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        var20 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (e.field_z > 0) {
            e.field_z = e.field_z - 1;
          }
          if (0 < of.field_a) {
            of.field_a = of.field_a - 1;
          }
          if (0 < al.field_Q) {
            al.field_Q = al.field_Q - 1;
          }
          if (0 < qh.field_u) {
            qh.field_u = qh.field_u - 1;
          }
          if (lg.field_f > 0) {
            lg.field_f = lg.field_f - 1;
          }
          if (le.field_gb > 0) {
            le.field_gb = le.field_gb - 1;
          }
          if (0 < te.field_K) {
            te.field_K = te.field_K - 1;
          }
          var1_float = kd.field_v.j();
          if (var1_float != vc.field_a) {
            kd.field_v.d(ua.a((byte) -10, vc.field_a, var1_float, 0.07000000029802322f));
          }
          var1_floatLifetime1 = kd.field_v.h();
          if (var1_floatLifetime1 != qm.field_O) {
            kd.field_v.f(ua.a((byte) -96, qm.field_O, var1_floatLifetime1, 0.07000000029802322f));
          }
          var1_floatLifetime2 = kd.field_v.f();
          if (var1_floatLifetime2 != ea.field_d) {
            kd.field_v.b(ua.a((byte) -73, ea.field_d, var1_floatLifetime2, 0.009999999776482582f));
          }
          var1_floatLifetime3 = kd.field_v.g();
          if (var1_floatLifetime3 != ag.field_w) {
            kd.field_v.e(ua.a((byte) -46, ag.field_w, var1_floatLifetime3, 1.0f));
          }
          var1_floatLifetime4 = kd.field_v.k();
          if (an.field_n != var1_floatLifetime4) {
            kd.field_v.c(ua.a((byte) -112, an.field_n, var1_floatLifetime4, 0.009999999776482582f));
          }
          var1_floatLifetime5 = kd.field_v.e();
          if (var1_floatLifetime5 != vb.field_Jb) {
            kd.field_v.a(ua.a((byte) -56, vb.field_Jb, var1_floatLifetime5, 0.009999999776482582f));
          }
          eb.field_e.a(kd.field_v);
          ik.field_b = false;
          var2 = ln.field_a.field_d;
          var3 = ln.field_a.field_a;
          var4 = ln.field_a.field_n;
          if (cm.field_c == null ||
            cm.field_c.length != var4) {
            cm.field_c = new int[var4];
          }
          if (wa.a(false)) {
            wb.field_R = wb.field_R - 1;
          }
          if (0 < nl.field_d) {
            nl.field_d = nl.field_d - 1;
          }
          if (0 <= pj.field_v) {
            ik.field_c = ik.field_c + 1;
            if (ik.field_c > 2) {
              ik.field_c = 0;
              pj.field_v = pj.field_v + 1;
              if (pj.field_v == 4) {
                pj.field_v = -1;
              }
              if (pj.field_v == 8) {
                pj.field_v = -1;
              }
            }
          }
          if (0 < bh.field_d) {
            bh.field_d = bh.field_d - 1;
          }
          if (rf.field_f > 0) {
            rf.field_f = rf.field_f - 1;
          }
          if (param0 >= -22) {
            return;
          }
          var5 = mm.field_m[0];
          var6 = var5.field_j;
          var7 = var6.field_e;
          var8 = var6.field_g;
          var9 = var6.b(-4);
          if ((15 & ng.field_u) == 0) {
            if (null != q.field_g) {
              stackIn_63_0 = q.field_g;
            } else {
              stackIn_63_0 = ue.field_a;
            }
            var10_int = ((ql) (Object) stackIn_63_0).a(var6, ni.field_e, (byte) 109) ? 1 : 0;
            if ((ni.field_e ? 1 : 0) != var10_int) {
              ni.field_e = (var10_int != 0);
              stackIn_69_0 = ha.field_w;
              if (ni.field_e) {
                stackIn_70_1 = -4;
              } else {
                stackIn_70_1 = 4;
              }
              stackIn_69_0.field_w = stackIn_70_1;
            }
            if (!ni.field_e &&
              ii.b((byte) 30)) {
              qm.field_O = 0.5f;
              vc.field_a = 1.0f;
              ea.field_d = 0.6000000238418579f;
              vb.field_Jb = 0.800000011920929f;
              ag.field_w = 10.0f;
              an.field_n = 0.30000001192092896f;
            } else {
              ea.field_d = 0.5f;
              ag.field_w = 30.0f;
              vb.field_Jb = 0.8999999761581421f;
              an.field_n = 0.20000000298023224f;
              vc.field_a = 0.30000001192092896f;
              qm.field_O = 0.5f;
            }
          }
          var10 = var5.field_l;
          if (5 == ha.field_t) {
            var11_int = -var7 + nh.field_E.field_e;
            if (var11_int < 0) {
              var11_int = -var11_int;
            }
            var12_int = nh.field_E.field_g - var8;
            if (var12_int < 0) {
              var12_int = -var12_int;
            }
            var13_int = var11_int + var12_int;
            if (var13_int < 10) {
              kd.a(6, 1);
            }
          }
          var24 = ln.field_a.field_e;
          var22 = var24;
          var11 = var22;
          var23 = ln.field_a.field_i;
          var21 = var23;
          var12 = var21;
          if (0 == jf.field_c &&
            hg.field_e != 0) {
            if (jf.field_d < 50) {
              pc.a(2);
              var13_intLifetime1 = -25 + var8;
              var14 = var8 + 25;
              var15_int = -30 + var7;
              if (var15_int < 0) {
                var15_int = 0;
              }
              if (var3 <= var14) {
                var14 = -1 + var3;
              }
              if (var13_intLifetime1 < 0) {
                var13_intLifetime1 = 0;
              }
              var16 = var7 + 30;
              if (var16 >= var2) {
                var16 = var2 - 1;
              }
              var18 = var13_intLifetime1;
              L43: while (true) {
                stackIn_100_0 = var14;
                if (stackIn_100_0 > var18) {
                  var17 = var15_int + var18 * var2;
                  for (var19 = var15_int; var19 < var16; var19++) {
                    stackOut_103_0 = var11[var17];
                    stackIn_100_0 = stackOut_103_0 ? 1 : 0;
                    stackIn_104_0 = stackOut_103_0;
                    if (stackIn_104_0) {
                      if (var23[var17] < 26) {
                        var12[var17] = var12[var17] + 1;
                      }
                    } else {
                      if (10 < var23[var17]) {
                        var12[var17] = var12[var17] - 1;
                      }
                    }
                    var17++;
                  }
                  var18++;
                  continue L43;
                }
                break;
              }
              jf.field_d = jf.field_d + 1;
              if (jf.field_d == 1) {
                var18Lifetime1 = 0;
                var19Lifetime1 = 1;
                if (bm.field_c != 0) {
                  if (4 >= rl.field_c) {
                    var18Lifetime1 = 1;
                  }
                  if (rl.field_c == 0) {
                    var19Lifetime1 = 0;
                  }
                  if (rl.field_c == 8) {
                    var19Lifetime1 = 0;
                  }
                  if (rl.field_c == 9) {
                    var19Lifetime1 = 0;
                  }
                } else {
                  if (1 == rl.field_c) {
                    var18Lifetime1 = 1;
                  }
                  if (rl.field_c == 0) {
                    var19Lifetime1 = 0;
                  }
                }
                if (var19Lifetime1 != 0 &&
                  uj.field_l == 1) {
                  stackIn_133_0 = eh.field_c;
                  stackIn_133_1 = lm.field_A;
                  if (var18Lifetime1 != 0) {
                    stackIn_134_2 = 21;
                  } else {
                    stackIn_134_2 = 22;
                  }
                  ((wm) (Object) stackIn_133_0).a(stackIn_133_1[stackIn_134_2], 90, uh.field_i);
                }
              }
              return;
            }
            if (le.field_D > 0 &&
              j.field_c != -1) {
              le.field_D = le.field_D - 1;
              if (512.0 * Math.random() > (double)le.field_D) {
                var13_ref_oc = new oc(var6);
                var13_ref_oc.field_e = var13_ref_oc.field_e + (int)(-25.0 + 50.0 * Math.random());
                var13_ref_oc.field_g = var13_ref_oc.field_g + (int)(-25.0 + Math.random() * 50.0);
                for (var14Lifetime1 = 0; 10 > var14Lifetime1; var14Lifetime1++) {
                  jn.field_F[ib.field_c].field_c = Math.random() * 255.0;
                  jn.field_F[ib.field_c].field_j.a((byte) 46, var13_ref_oc);
                  jn.field_F[ib.field_c].field_l.a(var10, -28860);
                  jn.field_F[ib.field_c].field_e = 0;
                  jn.field_F[ib.field_c].field_h = 0;
                  jn.field_F[ib.field_c].field_i = 8;
                  ib.field_c = ib.field_c + 1;
                }
                var14Lifetime1Lifetime1 = -1;
                var15_intLifetime1 = (int)(3.0 * Math.random());
                if (var15_intLifetime1 == 0) {
                  var14Lifetime1Lifetime1 = 0;
                } else {
                  if (var15_intLifetime1 == 1) {
                    var14Lifetime1Lifetime1 = 1;
                  } else {
                    if (2 == var15_intLifetime1) {
                      var14Lifetime1Lifetime1 = 10;
                    }
                  }
                }
                if (uj.field_l == 1 &&
                  ej.d((byte) 116)) {
                  eh.field_c.a(em.field_a[var14Lifetime1Lifetime1], 100, uh.field_i * (128 - le.field_D / 4) / 128);
                }
              }
              for (var13_intLifetime1Lifetime1 = 0; var13_intLifetime1Lifetime1 < 5; var13_intLifetime1Lifetime1++) {
                stackIn_162_0 = $cfr$dcmpl(Math.random() * 512.0, (double)le.field_D);
                if (stackIn_162_0 > 0) {
                  jn.field_F[ib.field_c].field_c = Math.random() * 255.0;
                  jn.field_F[ib.field_c].field_j.a((byte) 46, var6);
                  dupTemp$0 = jn.field_F[ib.field_c].field_j;
                  dupTemp$0.field_e = dupTemp$0.field_e + (int)(50.0 * Math.random() - 25.0);
                  dupTemp$1 = jn.field_F[ib.field_c].field_j;
                  dupTemp$1.field_g = dupTemp$1.field_g + (int)(-25.0 + Math.random() * 50.0);
                  jn.field_F[ib.field_c].field_l.a(var10, -28860);
                  jn.field_F[ib.field_c].field_e = 0;
                  jn.field_F[ib.field_c].field_h = 0;
                  jn.field_F[ib.field_c].field_i = 8;
                  ib.field_c = ib.field_c + 1;
                }
              }
            }
            stackIn_162_0Lifetime1 = ~le.field_D;
            if (stackIn_162_0Lifetime1 == -2) {
              if (uj.field_l == 1 &&
                ej.d((byte) 57)) {
                eh.field_c.a(lm.field_A[8], 100, uh.field_i);
              }
              mf.a(false, 5);
            }
          }
          if (le.field_D == 1 &&
            1 == uj.field_l &&
            ej.d((byte) 102)) {
            eh.field_c.a(em.field_a[0], 100, uh.field_i * 3 / 2);
          }
          var13 = var10.field_f;
          var15 = var10.field_a;
          while (jn.e((byte) -105)) {
            var17Lifetime1 = pj.field_e - 16;
            stackIn_205_0 = -1;
            stackIn_205_1 = ~var17Lifetime1;
            if (stackIn_205_0 >= stackIn_205_1 &&
              8 > var17Lifetime1) {
              stackIn_185_0 = -127;
              if (qh.field_m[82]) {
                stackIn_186_1 = 1;
              } else {
                stackIn_186_1 = 0;
              }
              t.a(stackIn_185_0, stackIn_186_1, var17Lifetime1);
            } else {
              var17Lifetime1 = -1 + pj.field_e;
              if (var17Lifetime1 >= 0 &&
                var17Lifetime1 < 8) {
                t.a(38, 1, var17Lifetime1);
              }
            }
            if (pj.field_e == 13 &&
              hg.field_e == 1 &&
              0 == jf.field_c) {
              of.field_h = new re(true);
              return;
            }
            if (pj.field_e == 84 &&
              qh.field_m[86] &&
              !ta.p(3) &&
              wb.field_S > 0) {
              nh.a(false, (byte) -107);
            }
            if (pj.field_e == 80) {
              stackIn_201_0 = -123;
              stackIn_202_1 = !(hk.field_q);
              ec.$cfr$intArgs$a$7ffe4b125357(stackIn_201_0, stackIn_202_1);
            }
          }
          stackIn_205_0Lifetime1 = ~jf.field_c;
          stackIn_205_1Lifetime1 = -1;
          if (stackIn_205_0Lifetime1 == stackIn_205_1Lifetime1 ||
            !(mc.field_I < 4)) {
            if (w.field_r > cf.field_s) {
              cf.field_s = cf.field_s + 1;
            }
            if (-10 + w.field_r > cf.field_s) {
              cf.field_s = cf.field_s + 1;
            }
            if (cf.field_s < (-50 + w.field_r)) {
              cf.field_s = cf.field_s + 1;
            }
            if (hg.field_e == 1) {
              var17Lifetime2 = 0;
              if ((j.field_c != -1 ||
                rb.field_m != -1 ||
                rc.field_e == 0) && var17Lifetime2 == 0) {
                bc.a(var5, var2, var4, var7, (byte) 15, var9, var8, var24, var15, var13, var23, var3);
              }
            } else {
              if (0 == hg.field_e) {
                rl.field_c = -1;
              }
              if (pf.field_o == 1 &&
                -1 != rl.field_c) {
                mc.field_I = 1;
                jf.field_c = 1;
              }
            }
          }
          if (jf.field_c != 0) {
            jf.field_c = jf.field_c + 1;
            if (4 > mc.field_I) {
              jf.field_c = jf.field_c + 6;
            }
            if (le.field_D == 1) {
              jf.field_c = jf.field_c + 6;
            }
            if (jf.field_c == 128) {
              if (mc.field_I == 1) {
                if (hg.field_e < 0) {
                  hg.field_e = -1;
                }
                hg.field_e = hg.field_e + 1;
                if (hg.field_e == 0) {
                  stackIn_246_0 = dd.field_o;
                  stackIn_246_1 = 10;
                  if (om.field_b) {
                    stackIn_247_2 = nm.field_c;
                  } else {
                    stackIn_247_2 = ja.field_h;
                  }
                  boolean decompiledFrameRemainder1 = true;
                  stackIn_246_0[stackIn_246_1] = stackIn_247_2;
                  stackIn_255_0 = null;
                  stackIn_255_1 = null;
                  if (ta.p(3)) {
                    if (w.field_r == 0) {
                      stackIn_255_0Lifetime1 = null;
                      stackIn_255_1Lifetime1 = null;
                      stackIn_251_2 = false;
                    } else {
                      stackIn_255_0Lifetime1 = null;
                      stackIn_255_1Lifetime1 = null;
                      stackIn_251_2 = true;
                    }
                    if (ei.field_q.e(-20049)) {
                      stackIn_255_0Lifetime1Lifetime1 = null;
                      stackIn_255_1Lifetime1Lifetime1 = null;
                      stackIn_254_3 = false;
                    } else {
                      stackIn_255_0Lifetime1Lifetime1 = null;
                      stackIn_255_1Lifetime1Lifetime1 = null;
                      stackIn_254_3 = true;
                    }
                    if (wb.a(stackIn_251_2, stackIn_254_3, false, rg.a((byte) -54)) != null) {
                      stackIn_257_0 = null;
                      stackIn_257_1 = null;
                      stackIn_257_2 = 9;
                      decompiledFrameRemainder1 = false;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_257_0Lifetime1 = null;
                    stackIn_257_1Lifetime1 = null;
                    stackIn_257_2 = 10;
                  }
                  of.field_h = new re(stackIn_257_2);
                  u.field_f[26] = jh.field_bb;
                  return;
                }
                if (hg.field_e == 1) {
                  le.field_D = 0;
                  ta.a((byte) -95, rl.field_c);
                  of.field_h = new re(8);
                  return;
                }
              }
              if (mc.field_I == 2) {
                cm.a(bm.field_c, 0, rl.field_c);
                le.field_D = 0;
                ta.a((byte) 127, rl.field_c + 1);
                n.b(false, (byte) -97);
                of.field_h = new re(11);
                return;
              }
              if (mc.field_I == 3) {
                cm.a(bm.field_c, 0, 9);
                u.field_f[26] = jf.field_e;
                if (1 == bm.field_c &&
                  rl.field_c > 9) {
                  rl.field_c = 0;
                  jf.field_d = 50;
                  le.field_D = 0;
                  n.b(true, (byte) -89);
                  of.field_h = new re(13);
                  uk.field_e = 0;
                  return;
                }
                if (bm.field_c == 0 &&
                  rl.field_c <= 2) {
                  jf.field_d = 50;
                  le.field_D = 0;
                  ta.a((byte) -100, 3);
                  of.field_h = new re(12);
                  uk.field_e = 0;
                  n.b(false, (byte) -114);
                  return;
                }
                jf.field_d = 50;
                le.field_D = 0;
                rl.field_c = 0;
                n.b(true, (byte) -93);
                uk.field_e = 0;
                of.field_h = new re(13);
                return;
              }
              if (mc.field_I >= 4) {
                le.field_D = 0;
                hg.field_e = 0;
                if (jh.field_ab == 1) {
                  ja.a((byte) -127, pe.field_ab, true);
                }
                stackIn_285_0 = dd.field_o;
                stackIn_285_1 = 10;
                if (om.field_b) {
                  stackIn_286_2 = nm.field_c;
                } else {
                  stackIn_286_2 = ja.field_h;
                }
                boolean decompiledFrameRemainder0 = true;
                stackIn_285_0[stackIn_285_1] = stackIn_286_2;
                stackIn_295_0 = null;
                stackIn_295_1 = null;
                if (ta.p(3)) {
                  if (w.field_r == 0) {
                    stackIn_295_0Lifetime1 = null;
                    stackIn_295_1Lifetime1 = null;
                    stackIn_290_2 = false;
                  } else {
                    stackIn_295_0Lifetime1 = null;
                    stackIn_295_1Lifetime1 = null;
                    stackIn_290_2 = true;
                  }
                  if (ei.field_q.e(-20049)) {
                    stackIn_295_0Lifetime1Lifetime1 = null;
                    stackIn_295_1Lifetime1Lifetime1 = null;
                    stackIn_293_3 = false;
                  } else {
                    stackIn_295_0Lifetime1Lifetime1 = null;
                    stackIn_295_1Lifetime1Lifetime1 = null;
                    stackIn_293_3 = true;
                  }
                  stackIn_295_0Lifetime1Lifetime2 = null;
                  stackIn_295_1Lifetime1Lifetime2 = null;
                  if (wb.a(stackIn_290_2, stackIn_293_3, false, rg.a((byte) 124)) != null) {
                    stackIn_296_0 = null;
                    stackIn_296_1 = null;
                    stackIn_296_2 = 9;
                    decompiledFrameRemainder0 = false;
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_296_0Lifetime1 = null;
                  stackIn_296_1Lifetime1 = null;
                  stackIn_296_2 = 10;
                }
                of.field_h = new re(stackIn_296_2);
                return;
              }
            }
            jf.field_c = jf.field_c + 1;
            if (256 < jf.field_c) {
              jf.field_c = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "wj.G(" + param0 + ')');
        }
    }

    wj(bg param0) {
        try {
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = "Confirm Email:";
        field_O = 256;
        field_G = "These doors cannot be opened. Find a different route.";
        field_N = new ub();
    }

    private static int $cfr$dcmpl(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }
}

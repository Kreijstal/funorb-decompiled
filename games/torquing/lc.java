/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends ro {
    static int field_z;
    static String field_B;

    public static void a(boolean param0) {
        if (param0) {
          field_z = 16;
        }
        field_B = null;
    }

    public lc() {
    }

    final static bp a(boolean param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        bp stackIn_4_0 = null;
        bp stackIn_8_0 = null;
        bp stackIn_19_0 = null;
        bp stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Torquing.field_u;
        try {
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_4_0 = oj.field_l;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = wn.field_s;
            return stackIn_8_0;
          }
          if (param0) {
            lc.a(-40, -69, -28, 124, -109, 120, -40);
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var2_int - 1 == var3) {
                stackIn_19_0 = va.field_H;
                return stackIn_19_0;
              }
            } else {
              if (kl.field_t.indexOf(var4) == -1) {
                stackIn_22_0 = va.field_H;
                return stackIn_22_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("lc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static long h(byte param0) {
        if (param0 != -76) {
          return -86L;
        }
        return km.b(-1) - rb.field_C;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        if (-param5 + param1 >= kn.field_e &&
          qg.field_z >= param1 + param5 &&
          j.field_q <= param3 - param5 &&
          param3 + param5 <= qk.field_p) {
          mh.a(param0, param1, param5, param6, param3, 15783, param4);
        } else {
          ue.a(-15788, param1, param3, param6, param5, param0, param4);
        }
        var7 = 124 / ((param2 + 16) / 61);
    }

    final int[][] a(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Torquing.field_u;
        int[][] var13 = this.field_r.a(15142, param1);
        int[][] var12 = var13;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (this.field_r.field_b &&
          this.c(-31292)) {
          var4 = var13[0];
          var5 = var13[1];
          var6 = var13[2];
          var7 = this.field_u * (param1 % this.field_u);
          for (var8 = 0; var8 < ci.field_c; var8++) {
            var9 = this.field_s[var8 % this.field_x + var7];
            var6[var8] = ie.a(4080, var9 << 4);
            var5[var8] = ie.a(var9 >> 4, 4080);
            var4[var8] = ie.a(4080, var9 >> 12);
          }
        }
        if (param0 != -29116) {
          field_z = 43;
        }
        return var3;
    }

    final static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        t var6 = null;
        t var7 = null;
        t var8 = null;
        int var3Lifetime1;
        var4 = Torquing.field_u;
        try {
          ph.c(243, 197, 369, 143, 16777215);
          ph.d(244, 198, 367, 141, 0);
          if (null == nc.field_d) {
            if (null != kl.field_o) {
              kl.field_o.a(vo.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = nc.field_d[da.field_a];
          if (var6 == null) {
            if (kl.field_o != null) {
              kl.field_o.a(vo.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          } else {
            var6.d(245, 199);
          }
          if (param0 < 68) {
            lc.g(6);
          }
          if (op.field_j > mf.field_t) {
            var7 = nc.field_d[gf.field_h];
            if (var7 != null) {
              var2_int = (60 + var7.field_w) * mf.field_t / op.field_j;
              var3 = var2_int - 30;
              if (!pp.field_c) {
                ql.a(256 * (var7.field_w - var3) / 30, 245, var7, 199, -256 * var3 / 30, (byte) -81);
              } else {
                ql.a(-256 * var3 / 30, 245, var7, 199, (-var3 + var7.field_w) * 256 / 30, (byte) -122);
              }
            }
          }
          if (null != kl.field_o) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (var5 < nc.field_d.length) {
              var8 = nc.field_d[var5];
              if (var8 != null && (var8.field_w != 365 ||
                var8.field_u != 139)) {
                if (var2 != null) {
                  var2 = (String) (var2) + ", " + var5;
                } else {
                  var2 = Integer.toString(var5);
                }
              }
              var5++;
            }
            if (var2 == null) {
              return;
            }
            kl.field_o.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "lc.J(" + param0 + ')');
        }
    }

    final static void b(int param0, int param1) {
        df var2 = wa.field_d;
        var2.f(87, param1);
        var2.b(90, 1);
        var2.b(90, param0);
    }

    final static void d(int param0) {
        int var23 = 0;
        int var26 = 0;
        uf[] var1 = null;
        int[] var2 = null;
        short[] var3 = null;
        t var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        int var12 = 0;
        rm var13_ref_rm = null;
        int var14 = 0;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        int var19_int = 0;
        int var27 = 0;
        uf[] var28 = null;
        uf[] var29 = null;
        uf[] var30 = null;
        uf[] var31 = null;
        uf[] var32 = null;
        uf[] var33 = null;
        int[] var34 = null;
        int[] var45 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        sg var11 = null;
        int var13 = 0;
        t var15 = null;
        t var16_ref_t = null;
        kh var17_ref_kh = null;
        sg var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21_ref_int__ = null;
        int var21 = 0;
        int var22 = 0;
        long var24 = 0L;
        t var35 = null;
        t var36 = null;
        t var37 = null;
        uf[] var38 = null;
        uf[] var39 = null;
        kh var40 = null;
        uf[] var41 = null;
        uf[] var1Lifetime1;
        uf[] var1Lifetime2;
        uf[] var1Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15_intLifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var22Lifetime1;
        int var17Lifetime2;
        int var15_intLifetime1Lifetime1;
        var27 = Torquing.field_u;
        try {
          var28 = new uf[]{new uf(qh.field_c, 0, 517, 298, (sm) null, 0, 0)};
          var2 = new int[]{0, 1, 2, 4, 6, 5, 9, 18, 7, 8};
          var3 = new short[]{(short)0, (short)2, (short)4, (short)3, (short)1, (short) 5};
          var4 = new t(8, 1);
          var45 = ph.field_e;
          var6 = ph.field_j;
          var7 = ph.field_d;
          var29 = rh.a((byte) -101, var28, var4, vd.field_a);
          var1 = var29;
          ln.a(1, 0, var29, (byte) -58);
          if (param0 != -1339942685) {
            field_B = (String) null;
          }
          var30 = rh.a((byte) 114, var1, kl.field_p, "");
          var30[0].a((byte) -15, 2);
          var31 = rh.a((byte) 116, var30, var4, hl.field_c);
          var31[0].a((byte) 101, 1);
          var32 = rh.a((byte) 125, var31, var4, q.field_i);
          var1Lifetime1 = var32;
          ln.a(1, 0, var32, (byte) -58);
          var1Lifetime1[-1 + var32.length].c(0);
          var1Lifetime1[var32.length - 1].d(102);
          var33 = rh.a((byte) -122, var32, var4, eq.field_c);
          var1Lifetime2 = var33;
          ln.a(0, dd.field_c.field_x, var33, (byte) -58);
          hh.field_e = new t[m.field_n.length];
          be.field_g = 30;
          var34 = var2;
          for (var9 = 0; var34.length > var9; var9++) {
            var10 = var34[var9];
            if (m.field_n[var10] != null) {
              var11_int = be.field_l[200];
              var12 = be.field_o[200];
              var13_ref_rm = vc.field_c[var10].field_l;
              var14 = 99999;
              var15_int = -99999;
              for (var16 = 0; var16 < var13_ref_rm.field_f; var16++) {
                var17 = var13_ref_rm.field_B[var16];
                var18_int = var13_ref_rm.field_E[var16];
                var19_int = var12 * var17 - var18_int * var11_int >> 16;
                var18_int = var11_int * var17 + var18_int * var12 >> 16;
                var17Lifetime2 = (var19_int << 9) / (1024 + var18_int);
                if (var17Lifetime2 < var14) {
                  var14 = var17Lifetime2;
                }
                if (var17Lifetime2 > var15_int) {
                  var15_int = var17Lifetime2;
                }
              }
              var35 = new t(60, -var14 + (1 + var15_int));
              var16_ref_t = var35;
              hh.field_e[var10] = var35;
              var35.e();
              be.a();
              var17_ref_kh = vc.field_c[var10];
              var18 = new sg(1);
              var18.a(0, var17_ref_kh);
              var19 = new int[]{0, 0, 0, 65535, 0, 0, 0, var12, var11_int, 0, -var11_int, var12};
              if (var10 == 1) {
                var20 = new int[]{0, 0, 0, 0, 0, 65536, 0, 65536, 0, 65536, 0, 0};
                var21_ref_int__ = new int[12];
                for (var22 = 0; 3 > var22; var22++) {
                  for (var23 = 0; 3 > var23; var23++) {
                    var24 = 0L;
                    for (var26 = 0; 3 > var26; var26++) {
                      var24 = var24 + (long)var19[3 + (var23 + var26 * 3)] * (long)var20[var22 * 3 + var26 + 3];
                    }
                    var21_ref_int__[3 + (var22 * 3 + var23)] = (int)(var24 >>> 16);
                  }
                }
                var19 = var21_ref_int__;
              }
              var18.a(var17_ref_kh, var19);
              sg.a(var17_ref_kh, 80, 1365, -1, -12, 12);
              be.field_b = -var14;
              var18.a(new int[]{0, 0, -1024, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535});
              if (var10 == 0) {
                var36 = new t(60, var15_int - (var14 + 31));
                var21 = (-31 + (var15_int - var14)) / 2;
                t.a(var35, var36, 0, 0, 0, 0, 60, var21);
                var22Lifetime1 = -var21 + var36.field_t;
                t.a(var35, var36, 0, var35.field_t - var22Lifetime1, 0, var21, 60, var22Lifetime1);
                var37 = new t(var36.field_s, var36.field_t / 2);
                var16_ref_t = var37;
                var37.e();
                var36.c(var36.field_s << 3, var36.field_t << 3, var37.field_s << 3, var37.field_t << 3, 0, 2048);
                hh.field_e[var10] = var37;
              }
              var38 = rh.a((byte) 111, var1Lifetime2, var16_ref_t, m.field_n[var10]);
              var1Lifetime2 = var38;
              ln.a(0, dd.field_c.field_x, var38, (byte) -58);
            }
          }
          var1Lifetime2[-1 + var1Lifetime2.length].d(param0 ^ -1339942758);
          var39 = rh.a((byte) -110, var1Lifetime2, var4, vp.field_G);
          var1Lifetime3 = var39;
          ln.a(0, dd.field_c.field_x, var39, (byte) -58);
          var40 = new kh(new rm(8, 2, 2));
          var40.field_q = new mp(2);
          var40.field_l.a(-60, -60, 0);
          var40.field_l.a(60, -60, 0);
          var40.field_l.a(-60, 60, 0);
          var40.field_l.a(60, 60, 0);
          oj.a(3, (short) 0, 0, false, true, 1, 0, (short) -1, 2, var40);
          oj.a(1, (short) 0, 3, false, true, 2, 3, (short) -1, 1, var40);
          var9 = be.field_l[1664];
          var10 = be.field_o[1664];
          be.field_g = 40;
          var11 = new sg(1);
          var11.a(0, var40);
          var11.a(var40, new int[]{0, 0, 0, 65535, 0, 0, 0, var10, var9, 0, -var9, var10});
          var12 = 99999;
          var13 = -99999;
          for (var14Lifetime1 = 0; var40.field_l.field_f > var14Lifetime1; var14Lifetime1++) {
            var15_intLifetime1 = var40.field_l.field_B[var14Lifetime1];
            var16Lifetime1 = var40.field_l.field_E[var14Lifetime1];
            var17Lifetime1 = var10 * var15_intLifetime1 - var16Lifetime1 * var9 >> 16;
            var16Lifetime1 = var16Lifetime1 * var10 + var9 * var15_intLifetime1 >> 16;
            var15_intLifetime1Lifetime1 = (var17Lifetime1 << 9) / (var16Lifetime1 + 1024);
            if (var12 > var15_intLifetime1Lifetime1) {
              var12 = var15_intLifetime1Lifetime1;
            }
            if (var15_intLifetime1Lifetime1 > var13) {
              var13 = var15_intLifetime1Lifetime1;
            }
          }
          for (var14Lifetime2 = 0; ga.field_d.length > var14Lifetime2; var14Lifetime2++) {
            var15 = new t(80, var13 + 1 - var12);
            var15.e();
            be.a();
            var40.field_l.field_A[0] = var3[var14Lifetime2];
            var40.field_l.field_m[1] = (short)be.field_c.b((int) var3[var14Lifetime2]);
            var40.field_q.field_v = null;
            var40.field_k = null;
            var11.a(0, 80, 1365, 0, -1, 0);
            be.field_b = -var12;
            var11.a(new int[]{0, 0, -1024, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535});
            var41 = rh.a((byte) 120, var1Lifetime3, var15, ga.field_d[var3[var14Lifetime2]]);
            var1Lifetime3 = var41;
            ln.a(0, dd.field_c.field_x, var41, (byte) -58);
          }
          var1Lifetime3[var1Lifetime3.length - 1].c(0);
          hg.field_b = var1Lifetime3;
          ph.a(var45, var6, var7);
          be.a();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1_ref), "lc.A(" + param0 + ')');
        }
    }

    static {
        field_z = 0;
        field_B = "achievements to collect";
    }
}

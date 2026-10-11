/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class opa extends qra {
    private boolean field_o;
    private gsa[] field_r;
    private boolean field_m;
    private boolean field_p;
    private boolean field_q;
    private boolean field_s;
    static mi[] field_n;

    final static void a(int param0, String param1, int param2, int param3, String param4, int param5) {
        kh var8 = null;
        int var7 = 0;
        try {
          var8 = ql.field_k;
          var8.k(param2, param3 - 35359);
          var8.field_h = var8.field_h + 1;
          if (param3 != 32371) {
            field_n = (mi[]) null;
          }
          var7 = var8.field_h;
          var8.i(param0, 0);
          if (param0 == 2) {
            var8.a(param4, false);
          }
          if (param1 != null) {
            wq.a(param1, var8, 0);
          } else {
            var8.f(-1477662136, param5);
          }
          var8.d(-var7 + var8.field_h, (byte) 10);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "opa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 25) {
          this.field_m = false;
          return false;
        }
        return false;
    }

    public static void f(int param0) {
        field_n = null;
        if (param0 < 73) {
          field_n = (mi[]) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          if (param3 <= param1) {
            return;
          }
          if (param1 + 1 >= param2) {
            return;
          }
          if (param2 > param1 + 5 &&
            param0 != param5) {
            var7_int = (1 & (param5 & param0)) + (param5 >> 1) + (param0 >> 1);
            var8 = param1;
            var9 = param0;
            var10 = param5;
            for (var11 = param1; param2 > var11; var11++) {
              var12 = boa.field_n[var11];
              if (!param6) {
                stackIn_22_0 = ic.field_c[var12];
              } else {
                stackIn_22_0 = jk.field_h[var12];
              }
              var13 = stackIn_22_0;
              if (var7_int < var13) {
                boa.field_n[var11] = boa.field_n[var8];
                incrementValue$0 = var8;
                var8++;
                boa.field_n[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            opa.a(param0, param1, var8, param3, (byte) -100, var9, param6);
            opa.a(var10, var8, param2, param3, param4, param5, param6);
            return;
          }
          for (var7_intLifetime1 = param2 - 1; var7_intLifetime1 > param1; var7_intLifetime1--) {
            for (var8Lifetime1 = param1; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = boa.field_n[var8Lifetime1];
              var10Lifetime1 = boa.field_n[var8Lifetime1 + 1];
              if (cl.a(param6, (byte) 119, var10Lifetime1, var9Lifetime1)) {
                boa.field_n[var8Lifetime1] = var10Lifetime1;
                boa.field_n[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "opa.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
          this.field_m = true;
          return true;
        }
        return true;
    }

    final void b(int param0, boolean param1) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_101_0 = 0;
        StringBuilder stackIn_103_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_126_0 = 0;
        StringBuilder stackIn_128_0 = null;
        int stackIn_129_1 = 0;
        int stackIn_137_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_142_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_151_0 = 0;
        StringBuilder stackIn_153_0 = null;
        int stackIn_154_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int stackIn_168_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        gsa var14_ref_gsa;
        int var15;
        int var16;
        String var16_ref_String;
        int var17;
        int var18;
        String var18_ref_String;
        int var19;
        int var20;
        String var20_ref_String;
        nh var21;
        int var21_int;
        int var22;
        int var23;
        int var24;
        nh var25;
        int var26;
        int var27;
        String var28;
        String var29;
        String var30;
        nh var31;
        String var32;
        String var33;
        String var34;
        nh var35;
        String var36;
        String var37;
        nh var38;
        String var39;
        String var40;
        nh var41;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var15Lifetime1;
        int var17Lifetime1;
        int var19Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        String var20_ref_StringLifetime1;
        String var20_ref_StringLifetime2;
        String var20_ref_StringLifetime3;
        String var20_ref_StringLifetime4;
        String var20_ref_StringLifetime5;
        String var20_ref_StringLifetime6;
        String var20_ref_StringLifetime7;
        String var20_ref_StringLifetime8;
        String var20_ref_StringLifetime2Lifetime1;
        String var20_ref_StringLifetime5Lifetime1;
        var27 = TombRacer.field_G ? 1 : 0;
        if (param0 >= -50) {
          this.field_s = false;
        }
        ura.a(-10985);
        la.field_j.a(0, 0);
        ik.field_h.a(0, 0);
        ng.field_b[1].a(50, -10);
        var3 = -250 + aaa.a(false);
        var4 = -10 + ng.field_b[1].c() - 70;
        ng.field_b[1].a(var3, -10);
        nm.field_l.a(var3, 0);
        nm.field_l.a(var3, var4);
        var5 = 3;
        var6 = (var3 - 50) / (var5 + 1);
        for (var7 = 0; var5 > var7; var7++) {
          var8 = 50 + (1 + var7) * var6;
          ng.field_b[0].a(var8, 0);
        }
        for (var7Lifetime1 = 0; 3 > var7Lifetime1; var7Lifetime1++) {
          var8Lifetime1 = -30 + (var3 - 50 >> 2) * 3;
          var9 = (var7Lifetime1 + 1) * ((var4 - 0) / 4) + 20;
          ng.field_b[0].a((float)var8Lifetime1, (float)var9, 4096, 16384, 3, 1610612736, 1);
          ng.field_b[0].a((float)(var8Lifetime1 + 150), (float)var9, 4096, 16384, 3, 1610612736, 1);
        }
        var7Lifetime2 = this.field_c.field_E;
        for (var8Lifetime2 = 0; this.field_c.field_k > var8Lifetime2; var8Lifetime2++) {
          var9Lifetime1 = var3 + 32;
          stackIn_12_0 = 95 * var8Lifetime2;
          stackIn_12_1 = 70;
          if (this.field_c.field_k >= 3) {
            stackIn_13_2 = 0;
          } else {
            stackIn_13_2 = 95;
          }
          var10 = stackIn_12_0 + (stackIn_12_1 + stackIn_13_2);
          var11 = -50 + var10;
          var12 = var10 - 25;
          eca.field_c[2].a(3 + var9Lifetime1, var11, eca.field_c[2].a() >> 2, eca.field_c[2].c() >> 2);
          var13 = var10;
          eca.field_c[1].a(var9Lifetime1, var12, eca.field_c[1].a() >> 2, eca.field_c[1].c() >> 2);
          eca.field_c[0].a(2 + var9Lifetime1, var13, eca.field_c[0].a() / 3, eca.field_c[0].c() / 3);
          var14_ref_gsa = this.field_r[var8Lifetime2];
          if (!var14_ref_gsa.field_l) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = var14_ref_gsa.field_c;
          }
          var15 = stackIn_16_0;
          var28 = Integer.toString(var15);
          var20_ref_String = var28;
          var20_ref_StringLifetime1 = var28;
          var16_ref_String = var28;
          if (var15 < 10) {
            var16_ref_String = "0" + var28;
            var20_ref_StringLifetime2 = var16_ref_String;
            var20_ref_StringLifetime2Lifetime1 = var16_ref_String;
          }
          ts.a(-1, -73, 20 + var11, var16_ref_String.toUpperCase(), 24 + var9Lifetime1, eda.field_f, 2431750);
          if (var14_ref_gsa.field_d) {
            stackIn_22_0 = var14_ref_gsa.field_r;
          } else {
            stackIn_22_0 = 0;
          }
          var17 = stackIn_22_0;
          var29 = Integer.toString(var17);
          var20_ref_StringLifetime3 = var29;
          var20_ref_StringLifetime4 = var29;
          var18_ref_String = var29;
          if (10 > var17) {
            var18_ref_String = "0" + var29;
            var20_ref_StringLifetime5 = var18_ref_String;
            var20_ref_StringLifetime5Lifetime1 = var18_ref_String;
          }
          ts.a(-1, -28, var12 + 17, var18_ref_String.toUpperCase(), var9Lifetime1 + 24, eda.field_f, 2431750);
          if (var14_ref_gsa.field_k) {
            stackIn_28_0 = var14_ref_gsa.field_p;
          } else {
            stackIn_28_0 = 0;
          }
          var19 = stackIn_28_0;
          var30 = Integer.toString(var19);
          var20_ref_StringLifetime6 = var30;
          var20_ref_StringLifetime7 = var30;
          var20_ref_StringLifetime8 = var30;
          if (var19 < 10) {
            var20_ref_StringLifetime8 = "0" + var30;
          }
          ts.a(-1, -29, var13 + 14, var20_ref_StringLifetime8.toUpperCase(), var9Lifetime1 + 24, eda.field_f, 2431750);
          var21_int = this.field_c.field_H[var8Lifetime2].z(-104);
          var22 = 0;
          if (var21_int >= 0 &&
            2 == bta.field_n[var21_int] &&
            var14_ref_gsa.field_o) {
            var22 = 1;
          }
          if (0 <= var21_int &&
            bta.field_n[var21_int] == 1 &&
            var14_ref_gsa.field_h) {
            var22 = 1;
          }
          if (var21_int >= 0 &&
            0 == bta.field_n[var21_int] &&
            var14_ref_gsa.field_b) {
            var22 = 1;
          }
          if (var21_int >= 0 &&
            var22 != 0) {
            var23 = 43 + var9Lifetime1;
            if (bta.field_n[var21_int] != 2) {
              if (bta.field_n[var21_int] != 1) {
                stackIn_52_0 = var13 - 10;
              } else {
                stackIn_52_0 = -6 + var12;
              }
            } else {
              stackIn_52_0 = -4 + var11;
            }
            var24 = stackIn_52_0;
            var31 = sta.field_y[bta.field_f[var21_int]];
            var25 = var31;
            var25.a(var23, var24, var31.a() >> 1, var31.c() >> 1);
          }
          var23Lifetime1 = 80 + var9Lifetime1;
          var24Lifetime1 = 32 + var10;
          var32 = String.valueOf(this.field_r[var8Lifetime2].field_m);
          ts.a(-1, -59, var24Lifetime1, "$", var23Lifetime1, qr.field_v, 2431750);
          ts.a(0, -28, -1 + var24Lifetime1, var32.toUpperCase(), 18 + var23Lifetime1, qr.field_v, wga.field_a[var8Lifetime2]);
          var26 = this.field_c.field_v[var8Lifetime2];
          if (var8Lifetime2 == this.field_c.e(2) &&
            var7Lifetime2 < -100 + fd.field_e) {
            var26--;
          }
          oka.a(Integer.toString(var26), wga.field_a[var8Lifetime2], qr.field_v, -1, -47 + (var24Lifetime1 - 1), 55, 0);
          oka.a(Integer.toString(this.field_c.field_L), wga.field_a[var8Lifetime2], qr.field_v, -1, -12 + (var24Lifetime1 - 1), 55, 0);
          oka.a("_", wga.field_a[var8Lifetime2], qr.field_v, -1, -40 + var24Lifetime1, 55, 0);
        }
        for (var8Lifetime3 = 0; var8Lifetime3 < this.field_c.field_k; var8Lifetime3++) {
          stackIn_61_0 = 95 * var8Lifetime3 + 105;
          if (this.field_c.field_k < 3) {
            stackIn_62_1 = 95;
          } else {
            stackIn_62_1 = 0;
          }
          var9Lifetime2 = stackIn_61_0 + stackIn_62_1;
          if (-100 + fd.field_e <= var7Lifetime2 &&
            var8Lifetime3 == this.field_c.e(2)) {
            if (this.field_c.field_L == this.field_c.field_v[var8Lifetime3]) {
              oka.a(vu.field_d.toUpperCase(), 2431750, qr.field_v, -1, var9Lifetime2 - 22, (var3 + 50 >> 1) + 20, -1);
            } else {
              oka.a(cha.field_h.toUpperCase(), 2431750, qr.field_v, -1, var9Lifetime2 - 22, (var3 + 50 >> 1) + 20, -1);
            }
            var10Lifetime1 = 0;
            for (var11Lifetime1 = 0; this.field_r.length > var11Lifetime1; var11Lifetime1++) {
              if (var11Lifetime1 != var8Lifetime3 &&
                this.field_r[var8Lifetime3].field_x == this.field_r[var11Lifetime1].field_x) {
                var10Lifetime1 = 1;
              }
            }
            if (var10Lifetime1 != 0) {
              oka.a(uda.field_o.toUpperCase(), 2431750, eda.field_f, -1, var9Lifetime2, 20 + (50 + var3 >> 1), -1);
            }
          }
          tga.field_a.KA(0, var9Lifetime2 - 100, (int)(2.0 + this.field_r[var8Lifetime3].field_q), var9Lifetime2 + 50);
          var10Lifetime1Lifetime1 = wga.field_a[var8Lifetime3];
          gca.field_a.a(62, 10 + var9Lifetime2 - 95, 0, var10Lifetime1Lifetime1 | -1006632960, 1);
          tga.field_a.la();
          this.field_c.field_H[var8Lifetime3].n((byte) -42).a(-1, (int)this.field_r[var8Lifetime3].field_q, 1400, 1536, var9Lifetime2);
          oka.a(this.field_c.field_l[var8Lifetime3].toUpperCase(), var10Lifetime1Lifetime1, kn.field_p, -1, var9Lifetime2, (int)this.field_r[var8Lifetime3].field_q, -1);
          if (!this.field_p &&
            var7Lifetime2 >= var8Lifetime3 * 50 + efa.field_y &&
            var7Lifetime2 < 50 + efa.field_y + this.field_c.field_k * 50) {
            stackIn_151_0 = (var8Lifetime3 * 50 + efa.field_y + 25 > var7Lifetime2) ? 0 : 1;
            var11Lifetime1Lifetime1 = stackIn_151_0;
            var39 = Integer.toString(this.field_r[var8Lifetime3].field_p);
            stackIn_153_0 = new StringBuilder().append("$");
            if (var11Lifetime1Lifetime1 == 0) {
              stackIn_154_1 = 0;
            } else {
              stackIn_154_1 = this.field_r[var8Lifetime3].field_u;
            }
            var40 = ((StringBuilder) (Object) stackIn_153_0).append(Integer.toString(stackIn_154_1 + this.field_r[var8Lifetime3].field_v)).toString();
            var14 = this.field_c.field_H[var8Lifetime3].z(-124);
            if (var11Lifetime1Lifetime1 != 0) {
              if (this.field_r[var8Lifetime3].field_u > 0) {
                stackIn_162_0 = (var14 < 0) ? 0 : 1;
              } else {
                stackIn_162_0 = 0;
              }
            } else {
              stackIn_162_0 = 0;
            }
            var15Lifetime1 = stackIn_162_0;
            stackIn_165_0 = (var15Lifetime1 == 0) ? 0 : 20;
            var16 = stackIn_165_0 + Math.max(95 + wb.field_a.a("x" + var39, (byte) -103), wb.field_a.a("+" + var40, (byte) 87) + 70);
            stackIn_167_0 = 40;
            stackIn_167_1 = (int)this.field_r[var8Lifetime3].field_q;
            if ((double)(-var16 + var3) <= this.field_r[var8Lifetime3].field_q) {
              stackIn_168_2 = var16;
            } else {
              stackIn_168_2 = 0;
            }
            var17Lifetime1 = stackIn_167_0 + (stackIn_167_1 - stackIn_168_2);
            var18 = var9Lifetime2 - 70;
            eca.field_c[0].a(var17Lifetime1, -5 + var18, eca.field_c[0].a() >> 1, eca.field_c[0].c() >> 1);
            ts.a(0, -123, 15 + var18, "x", 25 + var17Lifetime1, qr.field_v, wga.field_a[var8Lifetime3]);
            ts.a(0, -51, 17 + var18, var39, 45 + var17Lifetime1, qr.field_v, wga.field_a[var8Lifetime3]);
            ts.a(0, -103, var18 + 55, "+", var17Lifetime1 + 2, qr.field_v, wga.field_a[var8Lifetime3]);
            ts.a(0, -65, var18 + 55, var40, 25 + var17Lifetime1, qr.field_v, wga.field_a[var8Lifetime3]);
            if (var15Lifetime1 != 0) {
              var19Lifetime1 = 25 + wb.field_a.a("x" + var39, (byte) 31) + var17Lifetime1;
              var20 = -11 + var18;
              var41 = sta.field_y[bta.field_f[var14]];
              var21 = var41;
              var21.a(var19Lifetime1, var20, var41.a() >> 1, var41.c() >> 1);
            }
          } else if (!this.field_m &&
            var7Lifetime2 >= var8Lifetime3 * 50 + nta.field_d &&
            50 + (this.field_c.field_k * 50 + nta.field_d) > var7Lifetime2) {
            stackIn_126_0 = (25 + (nta.field_d + var8Lifetime3 * 50) > var7Lifetime2) ? 0 : 1;
            var11Lifetime1Lifetime1 = stackIn_126_0;
            var36 = Integer.toString(this.field_r[var8Lifetime3].field_r);
            stackIn_128_0 = new StringBuilder().append("$");
            if (var11Lifetime1Lifetime1 != 0) {
              stackIn_129_1 = this.field_r[var8Lifetime3].field_z;
            } else {
              stackIn_129_1 = 0;
            }
            var37 = ((StringBuilder) (Object) stackIn_128_0).append(Integer.toString(stackIn_129_1 + this.field_r[var8Lifetime3].field_n)).toString();
            var14 = this.field_c.field_H[var8Lifetime3].z(39);
            if (var11Lifetime1Lifetime1 != 0) {
              if (this.field_r[var8Lifetime3].field_z > 0) {
                stackIn_137_0 = (var14 >= 0) ? 1 : 0;
              } else {
                stackIn_137_0 = 0;
              }
            } else {
              stackIn_137_0 = 0;
            }
            var15Lifetime1 = stackIn_137_0;
            stackIn_139_0 = Math.max(95 + wb.field_a.a("x" + var36, (byte) 49), 70 + wb.field_a.a("+" + var37, (byte) 99));
            if (var15Lifetime1 != 0) {
              stackIn_140_1 = 20;
            } else {
              stackIn_140_1 = 0;
            }
            var16 = stackIn_139_0 + stackIn_140_1;
            stackIn_142_0 = (int)this.field_r[var8Lifetime3].field_q + 40;
            if ((double)(-var16 + var3) <= this.field_r[var8Lifetime3].field_q) {
              stackIn_143_1 = var16;
            } else {
              stackIn_143_1 = 0;
            }
            var17Lifetime1 = stackIn_142_0 - stackIn_143_1;
            var18 = var9Lifetime2 - 70;
            eca.field_c[1].a(var17Lifetime1, -5 + var18, eca.field_c[1].a() >> 2, eca.field_c[1].c() >> 2);
            ts.a(0, -42, 15 + var18, "x", 25 + var17Lifetime1, qr.field_v, wga.field_a[var8Lifetime3]);
            ts.a(0, -124, var18 + 17, var36, 45 + var17Lifetime1, qr.field_v, wga.field_a[var8Lifetime3]);
            ts.a(0, -92, 55 + var18, "+", var17Lifetime1 + 2, qr.field_v, wga.field_a[var8Lifetime3]);
            ts.a(0, -119, 55 + var18, var37, var17Lifetime1 + 25, qr.field_v, wga.field_a[var8Lifetime3]);
            if (var15Lifetime1 != 0) {
              var19Lifetime1 = var17Lifetime1 + (wb.field_a.a("x" + var36, (byte) -122) + 25);
              var20 = var18 - 11;
              var38 = sta.field_y[bta.field_f[var14]];
              var21 = var38;
              var21.a(var19Lifetime1, var20, var38.a() >> 1, var38.c() >> 1);
            }
          } else {
            if (!this.field_o &&
              var7Lifetime2 >= var8Lifetime3 * 50 + iv.field_ub &&
              var7Lifetime2 < this.field_c.field_k * 50 + iv.field_ub + 50) {
              stackIn_101_0 = (50 * var8Lifetime3 + iv.field_ub + 25 > var7Lifetime2) ? 0 : 1;
              var11Lifetime1Lifetime1 = stackIn_101_0;
              var33 = Integer.toString(this.field_r[var8Lifetime3].field_c);
              stackIn_103_0 = new StringBuilder().append("$");
              if (var11Lifetime1Lifetime1 == 0) {
                stackIn_104_1 = 0;
              } else {
                stackIn_104_1 = this.field_r[var8Lifetime3].field_f;
              }
              var34 = ((StringBuilder) (Object) stackIn_103_0).append(Integer.toString(stackIn_104_1 + this.field_r[var8Lifetime3].field_a)).toString();
              var14 = this.field_c.field_H[var8Lifetime3].z(-113);
              if (var11Lifetime1Lifetime1 != 0) {
                if (0 < this.field_r[var8Lifetime3].field_f) {
                  stackIn_112_0 = (var14 >= 0) ? 1 : 0;
                } else {
                  stackIn_112_0 = 0;
                }
              } else {
                stackIn_112_0 = 0;
              }
              var15Lifetime1 = stackIn_112_0;
              stackIn_115_0 = (var15Lifetime1 == 0) ? 0 : 20;
              var16 = stackIn_115_0 + Math.max(95 + wb.field_a.a("x" + var33, (byte) 45), 70 + wb.field_a.a("+" + var34, (byte) 98));
              stackIn_117_0 = 40;
              stackIn_117_1 = (int)this.field_r[var8Lifetime3].field_q;
              if (!((double)(-var16 + var3) <= this.field_r[var8Lifetime3].field_q)) {
                stackIn_118_2 = 0;
              } else {
                stackIn_118_2 = var16;
              }
              var17Lifetime1 = stackIn_117_0 + (stackIn_117_1 - stackIn_118_2);
              var18 = -70 + var9Lifetime2;
              eca.field_c[2].a(var17Lifetime1, var18 - 5, eca.field_c[2].a() >> 2, eca.field_c[2].c() >> 2);
              ts.a(0, -30, 15 + var18, "x", 25 + var17Lifetime1, qr.field_v, wga.field_a[var8Lifetime3]);
              ts.a(0, -100, var18 + 17, var33, 45 + var17Lifetime1, qr.field_v, wga.field_a[var8Lifetime3]);
              ts.a(0, -126, 55 + var18, "+", var17Lifetime1 + 2, qr.field_v, wga.field_a[var8Lifetime3]);
              ts.a(0, -24, 55 + var18, var34, 25 + var17Lifetime1, qr.field_v, wga.field_a[var8Lifetime3]);
              if (var15Lifetime1 != 0) {
                var19Lifetime1 = var17Lifetime1 + wb.field_a.a("x" + var33, (byte) 36) + 25;
                var20 = -11 + var18;
                var35 = sta.field_y[bta.field_f[var14]];
                var21 = var35;
                var21.a(var19Lifetime1, var20, var35.a() >> 1, var35.c() >> 1);
              }
            }
          }
        }
        se.f((byte) -6);
        this.d(-27142);
    }

    final static String a(String param0, byte param1) {
        int var5 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int stackIn_6_0 = 0;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        mi[] var2 = null;
        RuntimeException var2_ref = null;
        StringBuilder var3 = null;
        int var4 = 0;
        mi var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        mi[] var11 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var11 = ih.a((byte) 126, param0);
          var2 = var11;
          var3 = new StringBuilder();
          var4 = -99 % ((param1 - 5) / 54);
          for (var5 = 0; var5 < var11.length; var5++) {
            var6 = var11[var5];
            var7 = var6.field_h;
            if (var5 != var11.length - 1) {
              stackIn_6_0 = var2[var5 + 1].field_h;
            } else {
              stackIn_6_0 = param0.length();
            }
            var8 = stackIn_6_0;
            var9 = param0.substring(var7, var8);
            if (var6.field_p == ma.field_e) {
              discarded$0 = var3.append("<col=66ffff>").append(var9).append("</col>");
            } else {
              if (nl.field_d == var6.field_p) {
                discarded$1 = var3.append("<col=33bbff>").append(var9).append("</col>");
              } else {
                if (var6.field_p != tr.field_f) {
                  if (dc.field_o != var6.field_p) {
                    if (var6.field_p != dja.field_r) {
                      discarded$2 = var3.append(var9);
                    } else {
                      discarded$3 = var3.append("<col=33ffaa>").append(var9).append("</col>");
                    }
                  } else {
                    discarded$4 = var3.append("<col=ffaaff>").append(var9).append("</col>");
                  }
                } else {
                  discarded$5 = var3.append("<col=ffff99>").append(var9).append("</col>");
                }
              }
            }
          }
          stackIn_19_0 = var3.toString();
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("opa.H(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    opa(qh param0, v param1, int[][] param2) {
        super(param0, param1);
        int var5_int = 0;
        int var13_int = 0;
        double stackIn_21_0 = 0.0;
        double stackIn_25_0 = 0.0;
        double stackIn_29_0 = 0.0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        gsa var14 = null;
        double var15 = 0.0;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        double var18 = 0.0;
        gsa var18_ref_gsa = null;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        gsa var18_ref_gsaLifetime1;
        gsa var18_ref_gsaLifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        double var21Lifetime1;
        double var21Lifetime2;
        try {
          var4_int = this.field_c.field_H.length;
          this.field_r = new gsa[var4_int];
          for (var5_int = 0; var4_int > var5_int; var5_int++) {
            this.field_r[var5_int] = new gsa(this.field_c.field_H[var5_int], param2[var5_int]);
          }
          er.b(1, 0);
          this.field_s = false;
          mr.field_w = new w();
          var5 = 0.0;
          var7 = 0.0;
          var9 = 0.0;
          var11 = 0.0;
          for (var13_int = 0; var13_int < this.field_r.length; var13_int++) {
            var14 = this.field_r[var13_int];
            var18_ref_gsa = var14;
            var18_ref_gsaLifetime2 = var14;
            var15_int = var14.field_v + var14.field_u;
            var16 = var14.field_n + var14.field_z;
            var17 = var14.field_a + var14.field_f;
            if (var9 < (double)var16) {
              var9 = (double)var16;
            }
            if (var7 < (double)var15_int) {
              var7 = (double)var15_int;
            }
            if ((double)(var15_int - (-var16 - var17)) > var5) {
              var5 = (double)(var17 + (var15_int + var16));
            }
            if (var11 < (double)var17) {
              var11 = (double)var17;
            }
          }
          var13 = (double)(aaa.a(false) - 250);
          var15 = -50.0 + var13;
          for (var17Lifetime1 = 0; this.field_r.length > var17Lifetime1; var17Lifetime1++) {
            var18_ref_gsaLifetime1 = this.field_r[var17Lifetime1];
            var19 = (double)(var18_ref_gsaLifetime1.field_u + var18_ref_gsaLifetime1.field_v);
            if (var19 != 0.0 &&
              0.0 != var5) {
              stackIn_21_0 = var19 / var5 * 100.0;
            } else {
              stackIn_21_0 = 0.0;
            }
            var21 = stackIn_21_0;
            var23 = var21 * (var15 / 100.0) / 100.0;
            var25 = (double)(var18_ref_gsaLifetime1.field_n + var18_ref_gsaLifetime1.field_z);
            if (0.0 != var25 &&
              var5 != 0.0) {
              stackIn_25_0 = 100.0 * (var25 / var5);
            } else {
              stackIn_25_0 = 0.0;
            }
            var21Lifetime1 = stackIn_25_0;
            var27 = var21Lifetime1 * (var15 / 100.0) / 100.0;
            var29 = (double)(var18_ref_gsaLifetime1.field_f + var18_ref_gsaLifetime1.field_a);
            if (var29 != 0.0 &&
              0.0 != var5) {
              stackIn_29_0 = 100.0 * (var29 / var5);
            } else {
              stackIn_29_0 = 0.0;
            }
            var21Lifetime2 = stackIn_29_0;
            var31 = var21Lifetime2 * (var15 / 100.0) / 100.0;
            var18_ref_gsaLifetime1.a(var27, var31, var23, true);
          }
          var17Lifetime2 = 50;
          if (!(0.0 < var7)) {
            this.field_p = true;
          } else {
            efa.field_y = var17Lifetime2;
            var17Lifetime2 = var4_int * 50 + (var17Lifetime2 + 50);
            ona.field_H = var17Lifetime2;
            var17Lifetime2 += 100;
            var17Lifetime2 += 50;
          }
          if (var9 > 0.0) {
            nta.field_d = var17Lifetime2;
            var17Lifetime2 = 50 + var4_int * 50 + var17Lifetime2;
            og.field_m = var17Lifetime2;
            var17Lifetime2 += 100;
            var17Lifetime2 += 50;
          } else {
            this.field_m = true;
          }
          if (0.0 < var11) {
            iv.field_ub = var17Lifetime2;
            var17Lifetime2 = var17Lifetime2 + var4_int * 50 + 50;
            ema.field_b = var17Lifetime2;
            var17Lifetime2 += 100;
          } else {
            this.field_o = true;
          }
          if (this.field_p &&
            this.field_m &&
            this.field_o) {
            ona.field_H = var17Lifetime2;
            var17Lifetime2 += 100;
            var18 = var15 / 100.0;
            this.field_r[this.field_c.e(2)].field_i = var18;
          }
          var17Lifetime2 += 100;
          fd.field_e = var17Lifetime2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_47_0 = var4;
          stackIn_47_1 = new StringBuilder().append("opa.<init>(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param1 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
          if (param2 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        int var4 = 0;
        w stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean stackIn_22_2 = false;
        int var3;
        int var5;
        int var3Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != 80) {
          this.b(76, true);
        }
        for (var3 = 0; var3 < this.field_c.field_H.length; var3++) {
          if (!this.field_q) {
            this.field_c.field_H[var3].n((byte) -98).a(26, 4, true);
          }
          this.field_c.field_H[var3].n((byte) -127).a(param0 + 21383);
          this.field_c.field_H[var3].n((byte) -54).f(-4366);
        }
        this.field_q = true;
        if (param1) {
          this.c(7);
        }
        this.field_c.field_E = this.field_c.field_E + 1;
        var3Lifetime1 = this.field_c.field_E;
        if (fd.field_e <= var3Lifetime1 &&
          !this.field_s) {
          if (this.field_f != null) {
            this.field_f.a(6418);
          }
          this.field_s = true;
        }
        for (var4 = 0; this.field_r.length > var4; var4++) {
          this.field_r[var4].a(0, var3Lifetime1, var4);
        }
        stackIn_21_0 = mr.field_w;
        stackIn_21_1 = param0 + 35;
        stackIn_22_2 = (param1) ? false : true;
        ((w) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_22_2);
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    private int field_e;
    private tn field_f;
    static int field_g;
    static boolean field_d;
    static StringBuilder field_h;
    static volatile long field_b;
    static p field_a;
    static sc[] field_c;

    private final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int discarded$0 = 0;
        mg var7;
        int var8;
        mg var9;
        mg var10;
        mg stackIn_4_0 = null;
        mg stackIn_10_0 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        if (param4 == 32) {
          if ((1 << param3 & rn.field_c) != 0) {
            stackIn_10_0 = vd.field_Y[param3];
          } else {
            stackIn_10_0 = tn.field_b;
          }
          var10 = stackIn_10_0;
          var7 = var10;
          var10.d(-16 + param0, param5 - 16);
        } else {
          if ((1 << param3 & rn.field_c) != 0) {
            stackIn_4_0 = cb.field_d[param3];
          } else {
            stackIn_4_0 = mj.field_F;
          }
          var9 = stackIn_4_0;
          var10 = var9;
          var7 = var10;
          var10 = var9;
          var7 = var10;
          var7 = var9;
          if (param4 != 128) {
            var9.a(param0 - (param4 >> 1), -(param4 >> 1) + param5, param4, param4);
          } else {
            var9.d(param0 - 64, -64 + param5);
          }
        }
        if (param2) {
          a.field_C[ea.field_d] = param0;
          a.field_F[ea.field_d] = param5;
          a.field_B[ea.field_d] = param4;
          a.field_G[ea.field_d] = param3;
          ea.field_d = ea.field_d + 1;
        }
        if (param1 != 3624) {
          discarded$0 = this.a(74, (byte) -42, -91);
        }
    }

    private final void b(byte param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_35_0 = 0;
        v stackIn_82_0 = null;
        String stackIn_83_1 = null;
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
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var26 = Virogrid.field_F ? 1 : 0;
        var3 = 10;
        if (!db.b((byte) 13, 0) &&
          (512 & rn.field_c) == 0) {
          var3--;
        }
        var4 = -(20 * var3) + 20 + 320;
        ea.field_d = 0;
        var5 = 104;
        var6 = 0;
        if (param0 > -101) {
          this.b((byte) -40);
        }
        while (10 > var6) {
          var7 = var6;
          if (jk.field_d[var7]) {
            if (0 == (1 << var7 & rn.field_c)) {
              if (jk.field_d[var7]) {
                stackIn_16_0 = (db.b((byte) 13, 0)) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 1;
            }
          } else {
            stackIn_16_0 = 1;
          }
          var8 = stackIn_16_0;
          if (var8 != 0) {
            this.a(var4, 3624, true, var7, a.field_J[var7], var5);
          }
          var4 += 40;
          var6++;
        }
        if (ll.field_d != -1) {
          stackIn_24_0 = ll.field_d;
        } else {
          stackIn_24_0 = vm.field_c;
        }
        var6Lifetime1 = stackIn_24_0;
        ah.a(400, 100, 32 + var5, 1141646, 120);
        var7Lifetime1 = 124;
        if (-1 != var6Lifetime1) {
          if (!og.field_j[var6Lifetime1]) {
            stackIn_35_0 = ((rn.field_c & 1 << var6Lifetime1) != 0) ? 1 : 0;
          } else {
            stackIn_35_0 = 1;
          }
          var8Lifetime1 = stackIn_35_0;
          if (param1 != 2) {
            mc.field_b.b(qk.field_d[var6Lifetime1].toUpperCase(), 320, 60 + var7Lifetime1, 8437759, -1);
            if ((rn.field_c & 1 << var6Lifetime1) == 0) {
              vg.field_H.b(rk.field_g.toUpperCase(), 320, var7Lifetime1 + 78, 16711680, -1);
            } else {
              vg.field_H.b(fl.field_j.toUpperCase(), 320, 78 + var7Lifetime1, 65280, -1);
            }
          }
          var9 = (int)(Math.cos((double)((float)id.field_r / 50.0f)) * 76.0);
          var10 = (int)(28.0 * Math.sin((double)((float)id.field_r / 50.0f)));
          var11 = (int)(Math.sin((double)((float)id.field_r / 50.0f)) * 76.0);
          var12 = (int)(Math.cos((double)((float)id.field_r / 50.0f)) * 28.0);
          var13 = (int)(Math.sin((double)((float)(id.field_r + 50) / 50.0f)) * 76.0);
          var14 = (int)(28.0 * Math.cos((double)((float)(id.field_r + 50) / 50.0f)));
          var15 = (int)(Math.sin((double)((float)(id.field_r + 100) / 50.0f)) * 76.0);
          var16 = (int)(28.0 * Math.cos((double)((float)(id.field_r + 100) / 50.0f)));
          var17 = (int)(Math.sin((double)((float)(id.field_r + 150) / 50.0f)) * 76.0);
          var18 = (int)(Math.cos((double)((float)(150 + id.field_r) / 50.0f)) * 28.0);
          var19 = 3072 / (-var10 + 96);
          var20 = 3072 / (-var12 + 96);
          var21 = 3072 / (96 - var14);
          var22 = 3072 / (96 - var16);
          var23 = 3072 / (96 - var18);
          var24 = 210;
          var25 = var7Lifetime1 + 108;
          if (vc.field_eb[var6Lifetime1] >= 1) {
            if (var10 < 0) {
              ad.field_b.a(-(var19 >> 1) + var9 + var24, -(var19 >> 1) + (var25 + (var9 / 2 + var10)), var19, var19);
            }
            if (vc.field_eb[var6Lifetime1] >= 2 &&
              var12 < 0) {
              ad.field_b.a(var11 + var24 - (var20 >> 1), -(var20 >> 1) - var11 / 2 + (var25 + var12), var20, var20);
            }
            if (3 <= vc.field_eb[var6Lifetime1] &&
              var14 < 0) {
              ad.field_b.a(-(var21 >> 1) + (var24 + var13), -(var21 >> 1) - var13 / 2 + (var25 + var14), var21, var21);
            }
            if (vc.field_eb[var6Lifetime1] >= 4 &&
              var16 < 0) {
              ad.field_b.a(-(var22 >> 1) + var24 + var15, var16 + var25 - var15 / 2 - (var22 >> 1), var22, var22);
            }
            if (vc.field_eb[var6Lifetime1] >= 5 &&
              0 > var18) {
              ad.field_b.a(var17 + var24 - (var23 >> 1), var25 - (var17 / 2 - var18 + (var23 >> 1)), var23, var23);
            }
          }
          this.a(var24, 3624, false, var6Lifetime1, 128, var25);
          if (vc.field_eb[var6Lifetime1] >= 1) {
            if (var10 >= 0) {
              ad.field_b.a(var24 - (-var9 + (var19 >> 1)), -(var19 >> 1) + var10 + var25 + var9 / 2, var19, var19);
            }
            if (vc.field_eb[var6Lifetime1] >= 2 &&
              0 <= var12) {
              ad.field_b.a(-(var20 >> 1) + var24 + var11, -(var20 >> 1) + var12 + var25 - var11 / 2, var20, var20);
            }
            if (vc.field_eb[var6Lifetime1] >= 3 &&
              var14 >= 0) {
              ad.field_b.a(var13 + var24 - (var21 >> 1), -(var21 >> 1) + (var14 + var25 - var13 / 2), var21, var21);
            }
            if (vc.field_eb[var6Lifetime1] >= 4 &&
              var16 >= 0) {
              ad.field_b.a(-(var22 >> 1) + var24 + var15, var16 + var25 - (var15 / 2 + (var22 >> 1)), var22, var22);
            }
            if (5 <= vc.field_eb[var6Lifetime1] &&
              var18 >= 0) {
              ad.field_b.a(-(var23 >> 1) + var24 + var17, -(var23 >> 1) + (var18 - var17 / 2 + var25), var23, var23);
            }
          }
          if (param1 != 2) {
            vg.field_H.b(qg.field_m.toUpperCase(), 320, var7Lifetime1 + 158, 8437759, -1);
            vg.field_H.b(Integer.toString(h.field_c[var6Lifetime1]), 420, 158 + var7Lifetime1, 8437759, -1);
            vg.field_H.b(wb.field_i.toUpperCase(), 320, var7Lifetime1 + 178, 8437759, -1);
            vg.field_H.b(Integer.toString(vc.field_eb[var6Lifetime1]), 420, var7Lifetime1 + 178, 8437759, -1);
            stackIn_82_0 = vg.field_H;
            if (var8Lifetime1 == 0) {
              stackIn_83_1 = "???";
            } else {
              stackIn_83_1 = ak.field_b[var6Lifetime1].toUpperCase();
            }
            ((v) (Object) stackIn_82_0).a(stackIn_83_1, 320, var7Lifetime1 + 92, 190, 80, 8437759, -1, 0, 0, 20);
          }
        } else {
          if (param1 != 2) {
            if (qm.i(20)) {
              vg.field_H.c(pc.field_a.toUpperCase(), 320, 270, 8437759, -1);
              vg.field_H.c(dd.field_f.toUpperCase(), 320, 290, 8437759, -1);
              vg.field_H.a(kn.field_L.toUpperCase(), 160, 210, 320, 80, 8437759, -1, 1, 0, 20);
            } else {
              vg.field_H.a(kn.field_L.toUpperCase(), 160, 240, 320, 80, 8437759, -1, 1, 0, 20);
            }
          }
        }
        var8Lifetime2 = 340;
        if (qm.i(20)) {
          var8Lifetime2 -= 20;
        }
        vg.field_H.c(dg.field_G.toUpperCase(), 320, var8Lifetime2, 8437759, -1);
        if (!qm.i(20)) {
          ah.a(400, 100, 350, 1141646, 120);
        }
    }

    private final void a(int param0) {
        int var2;
        var2 = this.field_f.field_d;
        if (param0 != 0) {
          field_h = (StringBuilder) null;
        }
        if (i.field_y == 6 &&
          !qm.i(param0 + 20)) {
          this.b(72);
        } else {
          if (0 != ag.field_j[this.field_e].length) {
            this.field_f.e(param0 ^ 61);
          }
        }
        if (this.field_f.field_d != var2) {
          vm.$cfr$intArgs$a$45c25716b3df(30, wc.field_a);
        }
    }

    final void b(int param0, int param1, int param2) {
        int var6 = 0;
        int stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        int stackIn_3_4 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_18_2 = false;
        int var4;
        int var5;
        int var7;
        var7 = Virogrid.field_F ? 1 : 0;
        df.b(100, 0, 10, 400, 0);
        df.b(530, 0, 10, 400, 0);
        stackIn_2_0 = 110;
        stackIn_2_1 = 0;
        stackIn_2_2 = 420;
        stackIn_2_3 = 400;
        stackIn_3_4 = (param1 == 1) ? 127 : 263172;
        df.b(stackIn_2_0, stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_3_4);
        if (this.field_e == 10) {
          return;
        }
        var4 = -(hd.field_b.a(lc.field_e[this.field_e]) / 2) + 320;
        if (param2 >= -61) {
          return;
        }
        var5 = 40;
        if (this.field_e == 0) {
          eh.field_l.a(-(eh.field_l.field_j / 2) + 320, 20);
        } else {
          hd.field_b.b(lc.field_e[this.field_e], var4, var5, 1141646, -1);
        }
        ah.a(400, 100, 72, 1141646, 120);
        for (var6 = 0; this.field_f.field_o > var6; var6++) {
          if (this.b(var6, -115)) {
            stackIn_17_1 = 64;
            stackIn_18_2 = (this.field_f.field_d == var6);
            this.a((byte) stackIn_17_1, stackIn_18_2, param1, var6);
          }
        }
        if (this.field_e == 6) {
          this.a(param1, 16290);
        } else {
          if (7 == this.field_e) {
            this.a(param0, param1, (byte) 20);
          } else {
            if (8 != this.field_e) {
              if (this.field_e == 9 &&
                param1 != 2) {
                hd.field_b.a(kn.field_J, 135, 78, 370, 180, 8437759, -1, 1, 0, 18);
                return;
              }
            } else {
              this.b((byte) -113, param1);
            }
          }
        }
        return;
    }

    final static String a(String[] args, String param1, int param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          if (param2 != 2) {
            var12 = (String) null;
            oi.a((String[]) null, (String) null, -50);
          }
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var3_int > var5; var5++) {
                if (kf.a(0, param1.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(2 + var6_int, var5);
              if (!pa.a((CharSequence) ((Object) var7_ref_String), param2 - 113)) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param1.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = fm.a((CharSequence) ((Object) var7_ref_String), false);
              var4 = var4 + (-var5 + var6_int + args[var8].length());
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (kf.a(0, param1.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!pa.a((CharSequence) ((Object) var9), param2 ^ -123)) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = fm.a((CharSequence) ((Object) var9), false);
            discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(args[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("oi.F(");
          if (args == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        mi.a(param0, -8241);
        if (param1 != 6) {
          field_c = (sc[]) null;
        }
        we.a(false, param0);
    }

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var8 = Virogrid.field_F ? 1 : 0;
        for (var4 = 0; ea.field_d > var4; var4++) {
          var5 = a.field_C[var4] - param0;
          var6 = -param2 + a.field_F[var4];
          var7 = a.field_B[var4] >> 1;
          if (-var7 <= var5 &&
            var7 >= var5 &&
            var6 >= -var7 &&
            var7 >= var6) {
            return a.field_G[var4];
          }
        }
        var4Lifetime1 = 107 % ((70 - param1) / 37);
        return -1;
    }

    private final void a(int param0, int param1) {
        int var10 = 0;
        int stackIn_26_0;
        int stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_27_4;
        int var3;
        int var4;
        int var5;
        String var6;
        String[] var7;
        int[] var8;
        int var9;
        int var11;
        int var4Lifetime1;
        var11 = Virogrid.field_F ? 1 : 0;
        if (param0 == 2) {
          return;
        }
        if (qm.i(20)) {
          this.b((byte) -86);
          return;
        }
        if (null == mm.field_j) {
          mm.field_j = i.a(0, 7, 10, param1 ^ -16301);
        }
        var3 = 1141646;
        if (param1 != 16290) {
          field_c = (sc[]) null;
        }
        var4 = hd.field_b.field_H + 64;
        var5 = var4;
        if (ih.field_c == 3) {
          var4 = var4 + vg.field_H.field_H;
        }
        L3: {
          re.field_o.c(qe.field_j.toUpperCase(), 310, var5, var3, -1);
          re.field_o.c(aj.field_h.toUpperCase(), 368, var4, var3, -1);
          re.field_o.c(rl.field_s.toUpperCase(), 420, var5, var3, -1);
          re.field_o.c(ql.field_s.toUpperCase(), 458, var4, var3, -1);
          var4 += 24;
          re.field_o.c(rl.field_o.toUpperCase(), 500, var5, var3, -1);
          if (mm.field_j.field_s) {
            if (mm.field_j.field_j != null) {
              var6 = qg.field_s.toUpperCase();
              var7 = mm.field_j.field_j[uk.field_c];
              var8 = mm.field_j.field_t[uk.field_c];
              var9 = 0;
              for (var10 = 0; var10 < 10; var10++) {
                if (var7[var10] != null) {
                  var3 = 1141646;
                  if (jc.a(var7[var10], true)) {
                    var3 = 16777215;
                    var9 = 1;
                  }
                  stackIn_26_0 = 118;
                  stackIn_26_1 = -vg.field_H.field_H - vg.field_H.field_G + var4;
                  stackIn_26_2 = 400;
                  stackIn_26_3 = 22;
                  if (var10 % 2 != 1) {
                    stackIn_27_4 = 665399;
                  } else {
                    stackIn_27_4 = 996169;
                  }
                  df.b(stackIn_26_0, stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_27_4);
                  var6 = "";
                  this.a(178, var8[3 + var10 * 4], var7[var10], var4, var8[4 * var10 + 2], var3, var10, var8[4 * var10 + 1], var8[var10 * 4]);
                }
                var4 += 21;
              }
              if (((var9 == 0)) &&
                (!(0 >= mm.field_j.field_q + (mm.field_j.field_m + mm.field_j.field_h)))) {
                var3 = 8437759;
                this.a(param1 - 16112, mm.field_j.field_m, mi.field_d, var4, mm.field_j.field_q, var3, -1, mm.field_j.field_h, mm.field_j.field_u);
              }
              break L3;
            }
            var6 = te.field_a.toUpperCase();
          } else {
            var6 = wc.field_b.toUpperCase();
          }
        }
        var4Lifetime1 = 120 + vg.field_H.field_H + 10 * ag.field_a[6] / 2;
        vg.field_H.c(var6, 320, var4Lifetime1, 8437759, -1);
        return;
    }

    private final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        String var17 = null;
        int var10_int = param1 + param7 + param4;
        if (param6 != -1) {
          vg.field_H.a(param6 + 1 + ". ", 140, param3, param5, -1);
        }
        if (var10_int != 0) {
          param4 = (param4 * 200 + var10_int) / (var10_int * 2);
          param1 = (var10_int + param1 * 200) / (2 * var10_int);
          param7 = (param7 * 200 + var10_int) / (var10_int * 2);
        }
        String var12 = param2;
        vg.field_H.b(var12, 140, param3, param5, -1);
        String var13 = Integer.toString(param8);
        vg.field_H.c(var13, 310, param3, param5, -1);
        String var14 = var10_int < 50 ? Integer.toString(var10_int) : "50+";
        String var11 = var14;
        vg.field_H.c(var14, 368, param3, param5, -1);
        String var15 = param7 + "%";
        vg.field_H.c(var15, 420, param3, param5, -1);
        String var16 = param1 + "%";
        if (param0 != 178) {
          return;
        }
        try {
          vg.field_H.c(var16, 458, param3, param5, -1);
          var17 = param4 + "%";
          vg.field_H.c(var17, 500, param3, param5, -1);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "oi.CA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(boolean param0, double param1, double param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int var11 = Virogrid.field_F ? 1 : 0;
        if (param3 == 2) {
          return;
        }
        if (!qe.field_k &&
          !eh.field_e) {
          if (this.field_e != 8) {
          } else {
            vm.field_c = param0 ? -1 : this.a((int)param2, -94, (int)param1);
            if (param5 == 1) {
              if (ll.field_d == vm.field_c) {
                ll.field_d = -1;
              } else {
                if (-1 != vm.field_c) {
                  ll.field_d = vm.field_c;
                }
              }
            }
          }
          if (param0) {
            this.field_f.a(-1, false, -1);
          } else {
            var9 = this.field_f.field_d;
            var10 = this.a((int)param1, (byte) -128, (int)param2);
            this.field_f.a(var10, false, var10);
            if (-1 != this.field_f.field_d) {
              this.a(this.field_f.field_d, true, param4 ^ -423235729);
            }
            if (this.field_f.field_d != var9) {
              vm.$cfr$intArgs$a$45c25716b3df(30, wc.field_a);
            }
          }
        }
        if (param4 != -3666) {
          field_a = (p) null;
        }
    }

    private final void b(int param0) {
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        if (96 == um.field_Gb) {
          if (this.field_f.field_d > 0) {
            if (this.field_f.field_d != 2) {
              this.field_f.a(-75, 0);
            }
          } else {
            this.field_f.a(param0 - 168, 1);
          }
        }
        if (97 == um.field_Gb) {
          if (this.field_f.field_d != 1) {
            if (this.field_f.field_d != 2) {
              this.field_f.a(-120, 1);
            }
          } else {
            this.field_f.a(param0 - 105, 0);
          }
        }
        if (um.field_Gb == 99) {
          if (this.field_f.field_d >= 0 &&
            this.field_f.field_d <= 1) {
            this.field_f.a(-75, 2);
          } else {
            this.field_f.a(param0 ^ -39, uk.field_c);
          }
        }
        if (um.field_Gb == 98) {
          if (this.field_f.field_d == 2) {
            this.field_f.a(-61, uk.field_c);
          } else {
            this.field_f.a(-76, 2);
          }
        }
        if (param0 != 72) {
          this.a((byte) -44);
        }
        this.field_f.d((byte) 32);
    }

    private final void b(byte param0) {
        vg.field_H.c(mb.field_mb.toUpperCase(), 320, 197 + hd.field_b.field_H, 8437759, -1);
        if (param0 > -1) {
          this.a((byte) -58, false, -58, 36);
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = ag.field_j[this.field_e][param0];
        this.b(param0, var4, (byte) 124);
        if (param2 != 423239361) {
          field_b = 60L;
        }
        if (this.field_f.b(83)) {
          if (14 != var4 &&
            var4 != 15) {
            vm.$cfr$intArgs$a$45c25716b3df(30, bg.field_Lb);
          }
          wh.a(2094, param1, var4);
        }
    }

    final void a(byte param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (this.field_f.field_d != -1) {
          param1 = this.field_f.field_d;
        }
        if (param0 <= 115) {
          return;
        }
        this.field_f.a(param2, this.a((int)fa.field_k, (byte) -128, (int)sf.field_M), -563, param1);
        qd.field_c = id.field_r;
        if (this.field_e == 8) {
          vm.field_c = -1;
          ll.field_d = -1;
          for (var4 = 0; var4 < 10; var4++) {
            a.field_J[var4] = 0;
          }
        }
    }

    private final int d(int param0, int param1) {
        if (6 == this.field_e &&
          !qm.i(param0 ^ 2)) {
          if (param1 < 2) {
            return ag.field_f[this.field_e];
          }
          return ag.field_f[this.field_e] + ag.field_a[this.field_e];
        }
        if (param0 != 22) {
          field_h = (StringBuilder) null;
        }
        return param1 * ag.field_a[this.field_e] + ag.field_f[this.field_e];
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        if (hk.field_Jb > we.field_c.field_J) {
          return -1;
        }
        for (var4 = 0; ag.field_j[this.field_e].length > var4; var4++) {
          var5 = this.d(22, var4);
          if (this.b(var4, -107) &&
            param2 >= this.c(-57, var4) &&
            param2 < this.a((byte) -94, var4) &&
            var5 <= param0 &&
            param0 < this.a(var4, (byte) 94) + var5) {
            return var4;
          }
        }
        if (param1 > -124) {
          field_g = -3;
        }
        return -1;
    }

    private final void b(int param0, int param1, byte param2) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        boolean stackIn_116_0 = false;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Virogrid.field_F ? 1 : 0;
        if (param2 < 81) {
          this.b(-95, 86, -94);
        }
        L1: {
          var5 = param1;
          if (var5 != 0) {
            L2: {
              if (var5 != 24) {
                if (var5 == 1) {
                  break L1;
                }
                if (2 == var5) {
                  break L1;
                }
                if (var5 == 7) {
                  break L1;
                }
                if (var5 == 3) {
                  break L1;
                }
                if (5 != var5 &&
                  8 != var5 &&
                  var5 != 4 &&
                  var5 != 6) {
                  if (9 == var5) {
                    break L1;
                  }
                  if (var5 == 10) {
                    break L1;
                  }
                  if (var5 != 11) {
                    if (var5 == 18) {
                      break L1;
                    }
                    if (19 != var5 &&
                      12 != var5) {
                      if (var5 == 20) {
                        break L1;
                      }
                      if (var5 != 21) {
                        if (var5 == 22) {
                          break L1;
                        }
                        if (var5 != 13) {
                          if (var5 == 23) {
                            break L1;
                          }
                          if (var5 == 14) {
                            var4 = 0;
                            if (this.field_f.a((byte) 104) &&
                              ag.field_c > 0) {
                              qe.a((byte) 83, 0);
                              var4 = 1;
                            }
                            if (this.field_f.c((byte) 46) &&
                              ag.field_c < 256) {
                              qe.a((byte) 43, 256);
                              var4 = 1;
                            }
                            if (this.field_f.e((byte) 121)) {
                              var5 = -120 + (this.c(102, param0) + this.a((byte) -94, param0)) + ok.field_L >> 1;
                              var6 = (int)sf.field_M - var5;
                              var7 = var6 * 256 / 120;
                              if (0 >= var7) {
                                qe.a((byte) 58, 0);
                              } else {
                                if (var7 >= 256) {
                                  qe.a((byte) 61, 256);
                                } else {
                                  qe.a((byte) 35, var7);
                                }
                              }
                              var4 = 1;
                            }
                            if (this.field_f.g(31) &&
                              ag.field_c > 0) {
                              on.a(88);
                              var4 = 1;
                            }
                            if (this.field_f.b((byte) -125) &&
                              ag.field_c < 256) {
                              ul.c((byte) 64);
                              var4 = 1;
                            }
                            if (((var4 != 0)) && ((!(this.field_f.e((byte) 122)) ||
                              !(qd.field_c >= id.field_r)))) {
                              vm.$cfr$intArgs$a$45c25716b3df(30, bg.field_Lb);
                              qd.field_c = id.field_r + 20;
                            }
                            break L1;
                          }
                          if (var5 == 15) {
                            if (this.field_f.a((byte) 119)) {
                              bm.d(0, 0);
                            }
                            if (this.field_f.c((byte) 102)) {
                              bm.d(256, 0);
                            }
                            if (this.field_f.e((byte) 122)) {
                              var5 = -120 + (this.c(82, param0) - (-this.a((byte) -94, param0) - ok.field_L)) >> 1;
                              var6 = (int)sf.field_M - var5;
                              var7 = 256 * var6 / 120;
                              if (var7 > 0) {
                                if (var7 >= 256) {
                                  bm.d(256, 0);
                                } else {
                                  bm.d(var7, 0);
                                }
                              } else {
                                bm.d(0, 0);
                              }
                            }
                            if (this.field_f.g(31)) {
                              vl.a(11864);
                            }
                            if (this.field_f.b((byte) -128)) {
                              ib.a((byte) 99);
                            }
                          } else {
                            if (var5 == 16) {
                              if (!this.field_f.d(26505) &&
                                !this.field_f.c(-1)) {
                                break L2;
                              }
                              if (bc.field_c >= 2) {
                                bc.field_c = 0;
                                ka.a(true, (byte) 87);
                              } else {
                                bc.field_c = co.field_l;
                                ka.a(true, (byte) 87);
                              }
                              break L1;
                            }
                            if (var5 != 17) {
                              if (var5 == 28) {
                                if (this.field_f.c(-1) ||
                                  this.field_f.d(26505)) {
                                  stackIn_116_0 = !(b.field_Db);
                                  b.field_Db = stackIn_116_0;
                                }
                              } else {
                                switch (var5) {
                                  case 26:
                                    if (this.field_f.c(-1)) {
                                      eg.field_y = (eg.field_y + 1) % sh.field_yb.length;
                                      break L1;
                                    }
                                    if (!this.field_f.d(26505)) {
                                      break L2;
                                    }
                                    eg.field_y = (-1 - (-sh.field_yb.length - eg.field_y)) % sh.field_yb.length;
                                    break L1;
                                  default:
                                    break L1;
                                  case 27:
                                    if (this.field_f.c(-1)) {
                                      ce.field_I = (ce.field_I + 1) % mh.field_i.length;
                                      break L1;
                                    }
                                    if (!this.field_f.d(26505)) {
                                      break L2;
                                    }
                                    ce.field_I = (mh.field_i.length - (1 - ce.field_I)) % mh.field_i.length;
                                    break L1;
                                  case 25:
                                    break;
                                }
                              }
                              if (this.field_f.c(-1)) {
                                ll.field_b = (ll.field_b + 1) % ra.field_a.length;
                              } else {
                                if (!(!this.field_f.d(26505))) {
                                  ll.field_b = (ra.field_a.length - 1 + ll.field_b) % ra.field_a.length;
                                }
                              }
                              break L1;
                            }
                            if (gb.field_H.field_g) {
                              if (this.field_f.d(26505)) {
                                fieldTemp$1 = bc.field_c - 1;
                                bc.field_c = bc.field_c - 1;
                                if (2 <= fieldTemp$1) {
                                  co.field_l = bc.field_c;
                                  ka.a(true, (byte) 87);
                                } else {
                                  bc.field_c = cc.field_v.length - 1;
                                  co.field_l = bc.field_c;
                                  ka.a(true, (byte) 87);
                                }
                                break L1;
                              }
                              if (this.field_f.c(-1)) {
                                fieldTemp$0 = bc.field_c + 1;
                                bc.field_c = bc.field_c + 1;
                                if (fieldTemp$0 >= cc.field_v.length) {
                                  bc.field_c = 2;
                                }
                                co.field_l = bc.field_c;
                                ka.a(true, (byte) 87);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    oi(int param0) {
        this.field_e = param0;
        this.field_f = new tn(ag.field_j[this.field_e].length);
        if (ag.field_j[this.field_e].length == 0) {
          this.field_f.field_d = -1;
        }
    }

    final void a(byte param0) {
        int discarded$0 = 0;
        int var2 = 0;
        int stackIn_31_0 = 0;
        int var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        if (!qe.field_k &&
          !eh.field_e) {
          while (nd.b((byte) -125)) {
            if (um.field_Gb != 13) {
              this.a(0);
              if (-1 == this.field_f.field_d) {
                continue;
              }
              this.a(this.field_f.field_d, false, 423239361);
              continue;
            }
            if (this.field_e != 2 &&
              this.field_e != 3 &&
              this.field_e != 4 &&
              this.field_e != 5) {
              if (bd.field_e == this.field_e) {
                continue;
              }
              if (0 != bd.field_e &&
                bd.field_e != 2 &&
                3 != bd.field_e &&
                bd.field_e != 4) {
                if (bd.field_e != 5) {
                  continue;
                }
                wh.a(2094, false, 8);
                continue;
              }
              wh.a(2094, false, 8);
              continue;
            }
            wh.a(2094, false, 2);
          }
        }
        if (param0 >= -45) {
          discarded$0 = this.c(-89, -85);
        }
        if (this.field_e == 8) {
          for (var2 = 0; var2 < 10; var2++) {
            if (var2 == ll.field_d) {
              stackIn_31_0 = 48;
            } else {
              stackIn_31_0 = (vm.field_c == var2) ? 40 : 32;
            }
            var3 = stackIn_31_0;
            if (a.field_J[var2] <= var3) {
              if (a.field_J[var2] < var3) {
                a.field_J[var2] = a.field_J[var2] + 1;
              }
            } else {
              a.field_J[var2] = a.field_J[var2] - 1;
            }
          }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        String var4 = em.field_b[param0];
        int var5 = vg.field_H.b(var4, 370);
        int var7 = 100 % ((-48 - param2) / 63);
        int var6 = 16 + 18 * var5;
        ah.a(400, 100, 72, 1141646, 120);
        ah.a(400, 100, 72 + var6, 1141646, 120);
        pe.a(73, 1141646, 120, (byte) -122, -1 + var6);
        pe.a(73, 1141646, 519, (byte) -110, -1 + var6);
        if (param1 != 2) {
          vg.field_H.a(var4, 135, 78, 370, 180, 8437759, -1, 0, 0, 18);
        }
    }

    private final boolean b(int param0, int param1) {
        if (param1 > -100) {
          this.a((byte) 52, false, -102, -36);
        }
        return true;
    }

    private final void a(byte param0, boolean param1, int param2, int param3) {
        StringBuilder stackIn_6_0 = null;
        String stackIn_7_1 = null;
        StringBuilder stackIn_11_0 = null;
        String stackIn_12_1 = null;
        StringBuilder stackIn_16_0 = null;
        String stackIn_17_1 = null;
        String stackIn_26_0 = null;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_64_0 = 0;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        String var19;
        String var20;
        var18 = Virogrid.field_F ? 1 : 0;
        if (param2 == 2) {
          return;
        }
        var5 = -24 % ((param0 + 92) / 33);
        var6 = ag.field_j[this.field_e][param3];
        var19 = de.field_pb[var6];
        var7 = var19;
        var7 = var19;
        var7 = var19;
        switch (var6) {
          case 8:
            if (bd.field_e != 0 &&
              hm.field_c != 0) {
              if (bd.field_e != 2 &&
                hm.field_c != 2) {
                if (bd.field_e != 3 &&
                  hm.field_c != 3 &&
                  bd.field_e != 4 &&
                  hm.field_c != 4 &&
                  5 != bd.field_e &&
                  5 != hm.field_c) {
                  break;
                }
                var7 = ql.field_j;
                break;
              }
              var7 = sn.field_p;
              break;
            }
            var7 = de.field_pb[7];
            break;
          case 25:
            var7 = oi.a(new String[]{wc.field_c[1][ll.field_b]}, var19, 2);
            break;
          case 27:
            var7 = oi.a(new String[]{mh.field_i[ce.field_I]}, var19, 2);
            break;
          case 19:
            if (nf.field_g != 0) {
              stackIn_26_0 = en.field_Eb;
            } else {
              stackIn_26_0 = hk.field_Gb;
            }
            var7 = stackIn_26_0;
            break;
          case 26:
            var7 = oi.a(new String[]{wc.field_c[0][eg.field_y]}, var19, 2);
            break;
          case 28:
            stackIn_16_0 = new StringBuilder().append(var19);
            if (!b.field_Db) {
              stackIn_17_1 = am.field_b;
            } else {
              stackIn_17_1 = ad.field_f;
            }
            var7 = ((StringBuilder) (Object) stackIn_16_0).append(stackIn_17_1).toString();
            break;
          case 17:
            stackIn_11_0 = new StringBuilder().append(var19);
            if (!gb.field_H.field_g) {
              stackIn_12_1 = fn.field_g;
            } else {
              stackIn_12_1 = cc.field_v[bc.field_c];
            }
            var7 = ((StringBuilder) (Object) stackIn_11_0).append(stackIn_12_1).toString();
            break;
          case 16:
            stackIn_6_0 = new StringBuilder().append(var19);
            if (gb.field_H.field_g) {
              stackIn_7_1 = ld.field_f;
            } else {
              stackIn_7_1 = sd.field_b;
            }
            var7 = ((StringBuilder) (Object) stackIn_6_0).append(stackIn_7_1).toString();
            break;
          default:
            break;
        }
        var20 = var7.toUpperCase();
        var8 = mc.field_b.a(var20);
        var9 = this.c(108, param3);
        var10 = this.a((byte) -94, param3);
        var11 = this.d(22, param3);
        if (var6 == 14 ||
          15 == var6) {
          var8 = ok.field_L + 120;
        }
        var12 = -var8 + (var9 + var10) >> 1;
        var13 = this.a(param3, (byte) -123);
        var14 = var10 - var9;
        var15 = this.a(param3, (byte) 56);
        fd.a(param2, 6752, var14, var9, param1, var11, var15);
        stackIn_52_0 = (!param1) ? 8437759 : 16777215;
        var16 = stackIn_52_0;
        if (17 == var6 &&
          !gb.field_H.field_g) {
          stackIn_57_0 = (param1) ? 12632256 : 7829367;
          var16 = stackIn_57_0;
        }
        mc.field_b.b(var20, var12, var11 + mc.field_b.field_H, var16, -1);
        if (var6 != 14 &&
          var6 != 15) {
          return;
        }
        var12 = var12 + ok.field_L;
        df.e(var12, -1 + var13 / 2 + var11, 121, 2, var16);
        if (14 == var6) {
          stackIn_64_0 = 120 * ag.field_c / 256;
        } else {
          stackIn_64_0 = c.field_a * 120 / 256;
        }
        var17 = stackIn_64_0;
        df.e(var17 + var12 - 1, 3 + var11, 3, -6 + var13, var16);
        return;
    }

    private final int a(byte param0, int param1) {
        if (this.field_e == 6 &&
          !qm.i(20)) {
          return param1 >= 2 ? ag.field_h[this.field_e] : 310 + param1 * 180;
        }
        if (param0 != -94) {
          this.b((byte) -114, -126);
        }
        return ag.field_h[this.field_e];
    }

    private final int c(int param0, int param1) {
        int var3 = 104 / ((param0 - 9) / 63);
        if (this.field_e == 6 &&
          !qm.i(20)) {
          return param1 < 2 ? 150 + 180 * param1 : ag.field_b[this.field_e];
        }
        return ag.field_b[this.field_e];
    }

    private final int a(int param0, byte param1) {
        int var3 = 122 / ((param1 + 60) / 54);
        return 30;
    }

    public static void c(int param0) {
        field_a = null;
        field_c = null;
        if (param0 < 76) {
          field_b = -59L;
        }
        field_h = null;
    }

    final void d(int param0) {
        if (this.field_e == 6) {
          mm.field_j = null;
        }
        if (param0 != -11308) {
          field_h = (StringBuilder) null;
        }
    }

    static {
        field_d = true;
        field_g = 0;
        field_h = new StringBuilder(80);
        field_b = 0L;
        field_a = new p();
    }
}

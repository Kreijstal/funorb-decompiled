/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends pja {
    static boolean field_r;
    static llb field_s;
    static llb field_q;

    public static void a(boolean param0) {
        field_q = null;
        if (!param0) {
          return;
        }
        field_s = null;
    }

    public me() {
    }

    final static String a(ml param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (2 == param0.i((byte) -112).field_a) {
            stackIn_3_0 = pa.field_c;
            return stackIn_3_0;
          }
          if (param0.i((byte) -112).field_a == 3) {
            stackIn_6_0 = ir.field_o;
            return stackIn_6_0;
          }
          var2_int = -75 % ((-24 - param1) / 52);
          if (null == obb.field_o) {
            return null;
          }
          stackIn_10_0 = obb.field_o[param0.k(0)];
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("me.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[][] a(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = VoidHunters.field_G;
        if (param0 != 255) {
          field_s = (llb) null;
        }
        int[][] var13 = this.field_d.a(param1, (byte) -98);
        int[][] var12 = var13;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (this.field_d.field_g &&
          this.f(0)) {
          var4 = var13[0];
          var5 = var13[1];
          var6 = var13[2];
          var7 = this.field_p * (param1 % this.field_p);
          for (var8 = 0; var8 < hob.field_d; var8++) {
            var9 = this.field_k[var8 % this.field_j + var7];
            var6[var8] = dla.a(4080, var9 << 4);
            var5[var8] = dla.a(4080, var9 >> 4);
            var4[var8] = dla.a(4080, var9 >> 12);
          }
        }
        return var11;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, int param4, int param5, byte param6) {
        int var18_int = 0;
        int var22_int = 0;
        llb dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        soa stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_4_4 = false;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        mm stackIn_12_0;
        llb stackIn_12_1;
        llb stackIn_12_2;
        long stackIn_12_3;
        llb stackIn_13_1 = null;
        llb stackIn_13_2 = null;
        llb stackIn_13_4 = null;
        mm stackIn_29_0;
        llb stackIn_29_1;
        llb stackIn_29_2;
        long stackIn_29_3;
        llb stackIn_30_1;
        llb stackIn_30_2;
        llb stackIn_30_4;
        int stackIn_34_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_77_0 = 0;
        phb[] stackIn_79_0 = null;
        int stackIn_80_1 = 0;
        phb[] stackIn_87_0 = null;
        int stackIn_88_1 = 0;
        String stackIn_152_0 = null;
        String stackIn_160_0 = null;
        String stackIn_165_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        ij var8 = null;
        long var9 = 0L;
        Object var11 = null;
        mm var12 = null;
        int var13 = 0;
        int var14 = 0;
        llb var18 = null;
        llb var19 = null;
        llb var20 = null;
        llb var21 = null;
        llb var22 = null;
        llb var23 = null;
        llb var24 = null;
        llb var25 = null;
        llb var26 = null;
        llb var27 = null;
        llb var28 = null;
        llb var29 = null;
        llb var30 = null;
        int var31 = 0;
        String var32 = null;
        int var33_int = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        phb var42 = null;
        llb var43 = null;
        llb var44 = null;
        llb var45 = null;
        llb var46 = null;
        llb var47 = null;
        llb var48 = null;
        llb var49 = null;
        Object var50 = null;
        phb var50_ref = null;
        Object var51 = null;
        phb var51_ref = null;
        Object var52 = null;
        phb var52_ref = null;
        Object var53 = null;
        phb var53_ref = null;
        phb var54 = null;
        String var34Lifetime1;
        String var34Lifetime2;
        int var14Lifetime1;
        int var33_intLifetime1;
        int var34_intLifetime1;
        int var34_intLifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37_intLifetime1;
        int var38_intLifetime1;
        int var39Lifetime1;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = VoidHunters.field_G;
        try {
          stackIn_3_0 = rgb.field_f;
          stackIn_3_1 = 38;
          stackIn_3_2 = 2;
          stackIn_3_3 = (nna.field_w * 4 + 8) * param1;
          stackIn_4_4 = (qg.field_a == rgb.field_f);
          var7_int = ((soa) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, param2, nna.field_w * 2 + 4) ? 1 : 0;
          if (param6 <= 108) {
            me.a(false);
          }
          var8 = rgb.field_f.field_wb.field_lb;
          var9 = wt.a(false);
          var11 = null;
          var12 = (mm) (var8.d(0));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.field_lb) {
              var12.field_Mb = new llb(0L, geb.field_o);
              stackIn_10_0 = param0;
              stackIn_10_1 = param5;
              var14 = stackIn_10_0 | stackIn_10_1;
              var12.b(-561, var12.field_Mb);
              var12.field_Mb.field_F = 1;
              var12.field_dc = new llb(0L, bsa.field_q);
              var12.b(-561, var12.field_dc);
              var12.field_yb = new llb(0L, geb.field_o);
              var12.b(-561, var12.field_yb);
              var12.field_yb.field_w = 0;
              var12.field_wb = new llb(0L, geb.field_o);
              var12.b(-561, var12.field_wb);
              var12.field_wb.field_w = 0;
              var12.field_Hb = new llb(0L, bsa.field_q);
              var12.b(-561, var12.field_Hb);
              var12.field_Hb.field_F = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (!ll.field_o) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = bsa.field_q;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = geb.field_o;
              }
              stackIn_12_0.field_Lb = new llb(stackIn_12_3, stackIn_13_4);
              var12.b(-561, var12.field_Lb);
              var12.field_Zb = new llb[ocb.field_l];
              var12.field_Wb = new llb(0L, (llb) null);
              if ((1 << ar.field_b & var14) != 0) {
                var12.field_Lb.b(-561, var12.field_Wb);
              }
              var12.field_Eb = new llb(0L, (llb) null);
              if (0 != (var14 & 1 << ujb.field_g)) {
                var12.field_Lb.b(-561, var12.field_Eb);
              }
              var12.field_Ab = new llb(0L, (llb) null);
              if ((var14 & 1 << nt.field_o) != 0) {
                var12.field_Lb.b(-561, var12.field_Ab);
              }
              var12.field_Rb = new llb(0L, (llb) null);
              if (0 != (var14 & 1 << eib.field_o)) {
                var12.field_Lb.b(-561, var12.field_Rb);
              }
              var45 = var12.field_Wb;
              var44 = var12.field_Rb;
              var12.field_Ab.field_B = 1;
              var43 = var12.field_Eb;
              var43.field_B = 1;
              var44.field_B = 1;
              var45.field_B = 1;
              for (var18_int = 0; ocb.field_l > var18_int; var18_int++) {
                var12.field_Zb[var18_int] = new llb(0L, (llb) null);
                if (0 != (1 << var18_int + kb.field_b & var14)) {
                  var12.field_Lb.b(-561, var12.field_Zb[var18_int]);
                }
                var12.field_Zb[var18_int].field_B = 1;
              }
              stackIn_29_0 = var12;
              stackIn_29_1 = null;
              stackIn_29_2 = null;
              stackIn_29_3 = 0L;
              if (!ll.field_o) {
                stackIn_30_1 = null;
                stackIn_30_2 = null;
                stackIn_30_4 = geb.field_o;
              } else {
                stackIn_30_1 = null;
                stackIn_30_2 = null;
                stackIn_30_4 = bsa.field_q;
              }
              stackIn_29_0.field_Yb = new llb(stackIn_29_3, stackIn_30_4);
              var12.b(-561, var12.field_Yb);
              var12.field_Yb.field_F = 2;
              var12.field_Jb = new llb(0L, bsa.field_q);
              var12.b(-561, var12.field_Jb);
              var12.field_Tb = new llb(0L, iga.field_o);
              var12.b(-561, var12.field_Tb);
              var12.field_vb = new llb(0L, iga.field_o);
              var12.b(-561, var12.field_vb);
              var12.field_bc = new llb(0L, qc.field_q);
              var12.b(-561, var12.field_bc);
              var12.g(127);
              var12.field_Sb = new llb(0L, jba.field_h);
              var12.b(-561, var12.field_Sb);
              var13 = 1;
            }
            stackIn_34_0 = (var12.field_fc) ? param0 : param5;
            var14Lifetime1 = stackIn_34_0;
            var12.field_Mb.field_R = null;
            var12.field_Mb.field_G = 0;
            var46 = var12.field_Mb;
            var46.field_hb = 0;
            var12.field_Sb.field_R = null;
            var47 = var12.field_Sb;
            var12.field_Sb.field_G = 0;
            var12.field_dc.field_R = null;
            var47.field_hb = 0;
            var12.field_dc.field_G = 0;
            var48 = var12.field_dc;
            var12.field_yb.field_R = null;
            var48.field_hb = 0;
            var12.field_yb.field_G = 0;
            var18 = var12.field_yb;
            var18.field_hb = 0;
            var12.field_wb.field_R = null;
            var12.field_wb.field_G = 0;
            var19 = var12.field_wb;
            var12.field_Hb.field_R = null;
            var19.field_hb = 0;
            var20 = var12.field_Hb;
            var12.field_Hb.field_G = 0;
            var20.field_hb = 0;
            var12.field_Lb.field_R = null;
            var12.field_Lb.field_G = 0;
            var21 = var12.field_Lb;
            var21.field_hb = 0;
            for (var22_int = 0; ocb.field_l > var22_int; var22_int++) {
              var12.field_Zb[var22_int].field_tb = null;
              var23 = var12.field_Zb[var22_int];
              var12.field_Zb[var22_int].field_G = 0;
              var23.field_hb = 0;
            }
            var12.field_Wb.field_tb = null;
            var12.field_Wb.field_G = 0;
            var22 = var12.field_Wb;
            var12.field_Rb.field_tb = null;
            var22.field_hb = 0;
            var49 = var12.field_Rb;
            var12.field_Rb.field_G = 0;
            var12.field_Eb.field_tb = null;
            var49.field_hb = 0;
            var24 = var12.field_Eb;
            var12.field_Eb.field_G = 0;
            var12.field_Ab.field_tb = null;
            var24.field_hb = 0;
            var25 = var12.field_Ab;
            var12.field_Ab.field_G = 0;
            var25.field_hb = 0;
            var12.field_Yb.field_R = null;
            var12.field_Yb.field_G = 0;
            var26 = var12.field_Yb;
            var26.field_hb = 0;
            var12.field_Jb.field_R = null;
            var12.field_Jb.field_G = 0;
            var27 = var12.field_Jb;
            var12.field_Tb.field_R = null;
            var27.field_hb = 0;
            var28 = var12.field_Tb;
            var12.field_Tb.field_G = 0;
            var12.field_vb.field_R = null;
            var28.field_hb = 0;
            var12.field_vb.field_G = 0;
            var29 = var12.field_vb;
            var29.field_hb = 0;
            var12.field_bc.field_R = null;
            var12.field_bc.field_G = 0;
            var30 = var12.field_bc;
            var30.field_hb = 0;
            var12.field_hb = rgb.field_f.field_wb.field_hb;
            var31 = 0;
            var32 = var12.field_Vb;
            if (!var12.e((byte) 58)) {
              boolean decompiledFrameRemainder1 = true;
              if (!var12.field_fc) {
                if (!var12.field_cc &&
                  !var12.field_ac) {
                  if (var12.field_Xb) {
                    var12.field_Mb.field_R = wt.field_c;
                  } else {
                    var12.field_Mb.field_R = fg.field_a;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_Sb.field_R = di.field_j;
                }
              } else {
                if (0 <= var12.field_Ub) {
                  var12.field_Mb.field_R = sta.field_o;
                } else {
                  if (var12.field_Gb && (var12.field_cc ||
                    var12.field_ac)) {
                    var12.field_Sb.field_R = di.field_j;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var12.field_Bb == 2) {
                      var12.field_Sb.field_R = glb.field_a;
                    } else {
                      var12.field_Mb.field_R = vq.field_w;
                    }
                  }
                }
              }
              if (null != var12.field_Sb.field_R) {
                var12.field_Sb.a(0, -76, 68, var31, nna.field_w);
              } else {
                var12.field_Mb.a(0, 5, 68, var31, nna.field_w);
              }
              var12.field_dc.field_R = no.a(var12.field_dc.field_eb, var32, 78);
              var12.field_dc.a(70, -40, 78, var31, nna.field_w);
              if (var12.field_dc.field_O &&
                !var12.field_dc.field_R.equals(var32)) {
                lob.field_a = var32;
              }
              var12.field_yb.field_R = Integer.toString(var12.field_zb);
              if (!var12.field_Gb) {
                var12.field_yb.field_F = 1;
                var12.field_yb.a(150, 125, 48, var31, nna.field_w);
              } else {
                var12.field_yb.field_F = 2;
                var12.field_wb.field_R = "/" + var12.field_Fb;
                var33_int = (-var12.field_wb.field_eb.b("/") + 348) / 2;
                var12.field_yb.a(150, 127, -150 + var33_int, var31, nna.field_w);
                var12.field_wb.a(var33_int, 121, -var33_int + 198, var31, nna.field_w);
              }
              var12.field_Hb.field_R = Integer.toString(var12.field_Kb);
              var12.field_Hb.a(200, 39, 48, var31, nna.field_w);
              stackIn_67_0 = (ll.field_o) ? 250 : 200;
              var33_intLifetime1 = stackIn_67_0;
              var12.field_Lb.a(var33_intLifetime1, 28, -var33_intLifetime1 + 363, var31, nna.field_w);
              var34_int = hi.field_a;
              if ((1 << ar.field_b & var14Lifetime1) != 0) {
                var50_ref = sqb.field_o[var12.field_Cb];
                var12.field_Wb.field_tb = var50_ref;
                var12.field_Wb.a(var34_int, 32, var50_ref.field_m, 0, var12.field_Lb.field_G);
                var34_int = var34_int + (hi.field_a + var50_ref.field_m);
              }
              if ((var14Lifetime1 & 1 << ujb.field_g) != 0) {
                if (!var12.field_cc) {
                  stackIn_77_0 = (var12.field_ac) ? 1 : 0;
                } else {
                  stackIn_77_0 = 1;
                }
                var36 = stackIn_77_0;
                stackIn_79_0 = atb.field_b;
                if (var36 == 0) {
                  stackIn_80_1 = 0;
                } else {
                  stackIn_80_1 = 1;
                }
                var51_ref = stackIn_79_0[stackIn_80_1];
                var12.field_Eb.field_tb = var51_ref;
                var12.field_Eb.a(var34_int, 35, var51_ref.field_m, 0, var12.field_Lb.field_G);
                var34_int = var34_int + (var51_ref.field_m + hi.field_a);
              }
              if ((1 << nt.field_o & var14Lifetime1) != 0) {
                var52_ref = lcb.field_t[var12.field_Bb - 1];
                var12.field_Ab.field_tb = var52_ref;
                var12.field_Ab.a(var34_int, 117, var52_ref.field_m, 0, var12.field_Lb.field_G);
                var34_int = var34_int + (var52_ref.field_m + hi.field_a);
              }
              if (0 != (1 << eib.field_o & var14Lifetime1)) {
                stackIn_87_0 = hnb.field_U;
                if (!var12.field_xb) {
                  stackIn_88_1 = 0;
                } else {
                  stackIn_88_1 = 1;
                }
                var53_ref = stackIn_87_0[stackIn_88_1];
                var12.field_Rb.field_tb = var53_ref;
                var12.field_Rb.a(var34_int, 121, var53_ref.field_m, 0, var12.field_Lb.field_G);
                var34_int = var34_int + (var53_ref.field_m + hi.field_a);
              }
              if (null != hwa.field_p) {
                for (var36Lifetime1 = 0; var36Lifetime1 < ocb.field_l; var36Lifetime1++) {
                  if (hwa.field_p[var36Lifetime1] != null &&
                    (var14Lifetime1 & 1 << var36Lifetime1 + kb.field_b) != 0) {
                    var42 = hwa.field_p[var36Lifetime1][var12.field_Pb[var36Lifetime1] & 255];
                    var54 = var42;
                    var12.field_Zb[var36Lifetime1].field_tb = var42;
                    var12.field_Zb[var36Lifetime1].a(var34_int, 120, var54.field_m, 0, var12.field_Lb.field_G);
                    var34_int = var34_int + (var54.field_m + hi.field_a);
                  }
                }
              }
              var36Lifetime2 = (var12.field_Lb.field_hb - var34_int) / 2;
              if (var36Lifetime2 > 0) {
                var12.field_Wb.field_L = var12.field_Wb.field_L + var36Lifetime2;
                var12.field_Eb.field_L = var12.field_Eb.field_L + var36Lifetime2;
                var12.field_Ab.field_L = var12.field_Ab.field_L + var36Lifetime2;
                var12.field_Rb.field_L = var12.field_Rb.field_L + var36Lifetime2;
                for (var37_int = 0; ocb.field_l > var37_int; var37_int++) {
                  dupTemp$0 = var12.field_Zb[var37_int];
                  dupTemp$0.field_L = dupTemp$0.field_L + var36Lifetime2;
                }
              }
              if (var12.field_fc) {
                var37_intLifetime1 = var12.field_Ub;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(var9 - var12.field_Ob);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (60 <= var39) {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_Yb.field_R = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var12.field_Yb.field_R = var39 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_Yb.a(365, 43, var12.field_hb - 365, var31, nna.field_w);
              var31 = var31 + nna.field_w;
              if (var12.field_Ib != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(ija.field_c);
                discarded$2 = var37.append(var12.field_Ib[0]);
                for (var38_intLifetime1 = 1; var38_intLifetime1 < var12.field_zb; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_Ib[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_Jb.field_R = var38;
                var39Lifetime1 = var12.field_Jb.field_eb.c(var38, var12.field_hb - var12.field_Jb.field_w * 2);
                var12.field_Jb.a(0, -9, var12.field_hb, var31, var39Lifetime1 * nna.field_w);
                var31 = var31 + nna.field_w * var39Lifetime1;
              }
              if (var12.field_ac) {
                var12.field_Tb.field_R = isa.a(og.field_o, new String[]{var32}, 104);
                var12.field_Tb.a(qs.field_c, 122, var12.field_hb - qs.field_c * 2, var31, nna.field_w);
                var31 = var31 + nna.field_w;
              }
              if (var12.field_Qb) {
                var12.field_vb.field_R = isa.a(bna.field_m, new String[]{var32}, 79);
                var12.field_vb.a(qs.field_c, 0, var12.field_hb - 2 * qs.field_c, var31, nna.field_w);
                var31 = var31 + nna.field_w;
              }
            }
            var33 = jm.a((byte) -126, var32, var12.field_ec);
            var34 = var33;
            var34Lifetime1 = var33;
            if (var33 != null) {
              var34_intLifetime1 = var12.field_bc.field_eb.c(var33, -qs.field_c + (var12.field_hb - qs.field_c));
              var12.field_bc.field_I = var12.field_Db * 256 / ktb.field_p;
              var12.field_bc.field_R = var33;
              var12.field_bc.a(qs.field_c, 126, -(2 * qs.field_c) + var12.field_hb, var31, nna.field_w * var34_intLifetime1);
              var31 = var31 + nna.field_w * var34_intLifetime1;
            }
            if (var7_int == 0) {
              var12.field_E = var31 - var12.field_G;
            }
            if (var13 != 0) {
              rgb.field_f.field_wb.a((llb) (var11), 2, var12, -25);
            }
            for (var34_intLifetime2 = 0; var34_intLifetime2 < ocb.field_l; var34_intLifetime2++) {
              if (var12.field_Zb[var34_intLifetime2].field_O) {
                if (awa.field_o != null) {
                  if (null == awa.field_o[var34_intLifetime2]) {
                    var35 = null;
                  } else {
                    var35 = awa.field_o[var34_intLifetime2][255 & var12.field_Pb[var34_intLifetime2]];
                  }
                } else {
                  var35 = null;
                }
                if (var35 != null) {
                  lob.field_a = hva.field_c[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  lob.field_a = hva.field_c[var34_intLifetime2];
                }
              }
            }
            if (var12.field_Wb.field_O) {
              if (1 != var12.field_Cb) {
                var34Lifetime2 = uka.field_p[var12.field_Cb];
              } else {
                var34Lifetime2 = og.field_p;
              }
              lob.field_a = gib.field_c + " - " + var34Lifetime2;
            }
            if (var12.field_Rb.field_O) {
              if (!var12.field_xb) {
                stackIn_152_0 = dda.field_c;
              } else {
                stackIn_152_0 = hgb.field_p;
              }
              lob.field_a = stackIn_152_0;
            }
            if (var12.field_Eb.field_O) {
              if (!var12.field_cc &&
                !var12.field_ac) {
                if (var12.field_Gb) {
                  stackIn_160_0 = rdb.field_f;
                } else {
                  stackIn_160_0 = jca.field_o;
                }
              } else {
                stackIn_160_0 = gda.field_k;
              }
              lob.field_a = stackIn_160_0;
            }
            if (var12.field_Ab.field_O) {
              if (var12.field_Bb != 2) {
                stackIn_165_0 = jja.field_b;
              } else {
                stackIn_165_0 = tla.field_h;
              }
              lob.field_a = stackIn_165_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.field_o != 0 &&
              !var12.e((byte) 34)) {
              if (var12.field_Sb.field_o == 0) {
                aaa.a((byte) 112, var12, var32, param3);
              } else {
                if (var12.field_fc && (!var12.field_Gb ||
                  !var12.field_cc &&
                  !var12.field_ac)) {
                  jua.a(var12.f((byte) -13), param4, 20694);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  pa.a(param4, (byte) -88, var12.f((byte) -13));
                }
              }
            }
            var12 = (mm) (var8.a((byte) 92));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var7), "me.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_r = false;
    }
}

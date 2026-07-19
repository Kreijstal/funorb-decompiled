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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (2 == param0.i((byte) -112).field_a) {
              stackOut_2_0 = pa.field_c;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.i((byte) -112).field_a != 3) {
                var2_int = -75 % ((-24 - param1) / 52);
                if (null != obb.field_o) {
                  stackOut_9_0 = obb.field_o[param0.k(0)];
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackOut_5_0 = ir.field_o;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("me.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
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
        if (this.field_d.field_g) {
            if (!(!this.f(0))) {
                var4 = var13[0];
                var5 = var13[1];
                var6 = var13[2];
                var7 = this.field_p * (param1 % this.field_p);
                for (var8 = 0; var8 < hob.field_d; var8++) {
                    var9 = this.field_k[var8 % this.field_j + var7];
                    var6[var8] = dla.a(4080, var9 << -1671254556);
                    var5[var8] = dla.a(4080, var9 >> 1965428516);
                    var4[var8] = dla.a(4080, var9 >> -1439463796);
                }
            }
        }
        return var11;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, int param4, int param5, byte param6) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        ij var8 = null;
        long var9 = 0L;
        Object var11 = null;
        mm var12 = null;
        int var13 = 0;
        int var14 = 0;
        llb var18 = null;
        int var18_int = 0;
        llb var19 = null;
        llb var20 = null;
        llb var21 = null;
        int var22_int = 0;
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
        String var33 = null;
        int var33_int = 0;
        String var34 = null;
        int var34_int = 0;
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
        soa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        soa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        soa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        mm stackIn_10_0 = null;
        llb stackIn_10_1 = null;
        llb stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        mm stackIn_11_0 = null;
        llb stackIn_11_1 = null;
        llb stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        mm stackIn_12_0 = null;
        llb stackIn_12_1 = null;
        llb stackIn_12_2 = null;
        long stackIn_12_3 = 0L;
        llb stackIn_12_4 = null;
        mm stackIn_27_0 = null;
        llb stackIn_27_1 = null;
        llb stackIn_27_2 = null;
        long stackIn_27_3 = 0L;
        mm stackIn_28_0 = null;
        llb stackIn_28_1 = null;
        llb stackIn_28_2 = null;
        long stackIn_28_3 = 0L;
        mm stackIn_29_0 = null;
        llb stackIn_29_1 = null;
        llb stackIn_29_2 = null;
        long stackIn_29_3 = 0L;
        llb stackIn_29_4 = null;
        int stackIn_33_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_76_0 = 0;
        phb[] stackIn_77_0 = null;
        phb[] stackIn_78_0 = null;
        phb[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        phb[] stackIn_85_0 = null;
        phb[] stackIn_86_0 = null;
        phb[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        String stackIn_150_0 = null;
        String stackIn_158_0 = null;
        String stackIn_163_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        soa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        soa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        soa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        mm stackOut_9_0 = null;
        llb stackOut_9_1 = null;
        llb stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        mm stackOut_11_0 = null;
        llb stackOut_11_1 = null;
        llb stackOut_11_2 = null;
        long stackOut_11_3 = 0L;
        llb stackOut_11_4 = null;
        mm stackOut_10_0 = null;
        llb stackOut_10_1 = null;
        llb stackOut_10_2 = null;
        long stackOut_10_3 = 0L;
        llb stackOut_10_4 = null;
        mm stackOut_26_0 = null;
        llb stackOut_26_1 = null;
        llb stackOut_26_2 = null;
        long stackOut_26_3 = 0L;
        mm stackOut_28_0 = null;
        llb stackOut_28_1 = null;
        llb stackOut_28_2 = null;
        long stackOut_28_3 = 0L;
        llb stackOut_28_4 = null;
        mm stackOut_27_0 = null;
        llb stackOut_27_1 = null;
        llb stackOut_27_2 = null;
        long stackOut_27_3 = 0L;
        llb stackOut_27_4 = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        phb[] stackOut_76_0 = null;
        phb[] stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        phb[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        phb[] stackOut_84_0 = null;
        phb[] stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        phb[] stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_149_0 = null;
        String stackOut_148_0 = null;
        String stackOut_156_0 = null;
        String stackOut_155_0 = null;
        String stackOut_157_0 = null;
        String stackOut_162_0 = null;
        String stackOut_161_0 = null;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              stackOut_1_0 = rgb.field_f;
              stackOut_1_1 = 38;
              stackOut_1_2 = 2;
              stackOut_1_3 = (nna.field_w * 4 - -8) * param1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (qg.field_a != rgb.field_f) {
                stackOut_3_0 = (soa) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                break L1;
              } else {
                stackOut_2_0 = (soa) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                break L1;
              }
            }
            L2: {
              var7_int = ((soa) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, param2, nna.field_w * 2 + 4) ? 1 : 0;
              if (param6 > 108) {
                break L2;
              } else {
                me.a(false);
                break L2;
              }
            }
            var8 = rgb.field_f.field_wb.field_lb;
            var9 = wt.a(false);
            var11 = null;
            var12 = (mm) ((Object) var8.d(0));
            L3: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L4: {
                  var13 = 0;
                  if (null != var12.field_lb) {
                    break L4;
                  } else {
                    L5: {
                      var12.field_Mb = new llb(0L, geb.field_o);
                      var14 = param0 | param5;
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
                      stackOut_9_0 = (mm) (var12);
                      stackOut_9_1 = null;
                      stackOut_9_2 = null;
                      stackOut_9_3 = 0L;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      stackIn_11_3 = stackOut_9_3;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      stackIn_10_3 = stackOut_9_3;
                      if (!ll.field_o) {
                        stackOut_11_0 = (mm) ((Object) stackIn_11_0);
                        stackOut_11_1 = null;
                        stackOut_11_2 = null;
                        stackOut_11_3 = stackIn_11_3;
                        stackOut_11_4 = bsa.field_q;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        stackIn_12_4 = stackOut_11_4;
                        break L5;
                      } else {
                        stackOut_10_0 = (mm) ((Object) stackIn_10_0);
                        stackOut_10_1 = null;
                        stackOut_10_2 = null;
                        stackOut_10_3 = stackIn_10_3;
                        stackOut_10_4 = geb.field_o;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_12_3 = stackOut_10_3;
                        stackIn_12_4 = stackOut_10_4;
                        break L5;
                      }
                    }
                    L6: {
                      stackIn_12_0.field_Lb = new llb(stackIn_12_3, stackIn_12_4);
                      var12.b(-561, var12.field_Lb);
                      var12.field_Zb = new llb[ocb.field_l];
                      var12.field_Wb = new llb(0L, (llb) null);
                      if ((1 << ar.field_b & var14) == 0) {
                        break L6;
                      } else {
                        var12.field_Lb.b(-561, var12.field_Wb);
                        break L6;
                      }
                    }
                    L7: {
                      var12.field_Eb = new llb(0L, (llb) null);
                      if (0 == (var14 & 1 << ujb.field_g)) {
                        break L7;
                      } else {
                        var12.field_Lb.b(-561, var12.field_Eb);
                        break L7;
                      }
                    }
                    L8: {
                      var12.field_Ab = new llb(0L, (llb) null);
                      if (-1 != (var14 & 1 << nt.field_o ^ -1)) {
                        var12.field_Lb.b(-561, var12.field_Ab);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      var12.field_Rb = new llb(0L, (llb) null);
                      if (0 == (var14 & 1 << eib.field_o)) {
                        break L9;
                      } else {
                        var12.field_Lb.b(-561, var12.field_Rb);
                        break L9;
                      }
                    }
                    var45 = var12.field_Wb;
                    var44 = var12.field_Rb;
                    var12.field_Ab.field_B = 1;
                    var43 = var12.field_Eb;
                    var43.field_B = 1;
                    var44.field_B = 1;
                    var45.field_B = 1;
                    var18_int = 0;
                    L10: while (true) {
                      if (ocb.field_l <= var18_int) {
                        L11: {
                          stackOut_26_0 = (mm) (var12);
                          stackOut_26_1 = null;
                          stackOut_26_2 = null;
                          stackOut_26_3 = 0L;
                          stackIn_28_0 = stackOut_26_0;
                          stackIn_28_1 = stackOut_26_1;
                          stackIn_28_2 = stackOut_26_2;
                          stackIn_28_3 = stackOut_26_3;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          stackIn_27_2 = stackOut_26_2;
                          stackIn_27_3 = stackOut_26_3;
                          if (!ll.field_o) {
                            stackOut_28_0 = (mm) ((Object) stackIn_28_0);
                            stackOut_28_1 = null;
                            stackOut_28_2 = null;
                            stackOut_28_3 = stackIn_28_3;
                            stackOut_28_4 = geb.field_o;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            stackIn_29_2 = stackOut_28_2;
                            stackIn_29_3 = stackOut_28_3;
                            stackIn_29_4 = stackOut_28_4;
                            break L11;
                          } else {
                            stackOut_27_0 = (mm) ((Object) stackIn_27_0);
                            stackOut_27_1 = null;
                            stackOut_27_2 = null;
                            stackOut_27_3 = stackIn_27_3;
                            stackOut_27_4 = bsa.field_q;
                            stackIn_29_0 = stackOut_27_0;
                            stackIn_29_1 = stackOut_27_1;
                            stackIn_29_2 = stackOut_27_2;
                            stackIn_29_3 = stackOut_27_3;
                            stackIn_29_4 = stackOut_27_4;
                            break L11;
                          }
                        }
                        stackIn_29_0.field_Yb = new llb(stackIn_29_3, stackIn_29_4);
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
                        break L4;
                      } else {
                        L12: {
                          var12.field_Zb[var18_int] = new llb(0L, (llb) null);
                          if (0 == (1 << var18_int + kb.field_b & var14)) {
                            break L12;
                          } else {
                            var12.field_Lb.b(-561, var12.field_Zb[var18_int]);
                            break L12;
                          }
                        }
                        var12.field_Zb[var18_int].field_B = 1;
                        var18_int++;
                        continue L10;
                      }
                    }
                  }
                }
                L13: {
                  if (var12.field_fc) {
                    stackOut_32_0 = param0;
                    stackIn_33_0 = stackOut_32_0;
                    break L13;
                  } else {
                    stackOut_31_0 = param5;
                    stackIn_33_0 = stackOut_31_0;
                    break L13;
                  }
                }
                var14 = stackIn_33_0;
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
                var22_int = 0;
                L14: while (true) {
                  if (ocb.field_l <= var22_int) {
                    L15: {
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
                      if (var12.e((byte) 58)) {
                        break L15;
                      } else {
                        L16: {
                          if (!var12.field_fc) {
                            L17: {
                              if (var12.field_cc) {
                                break L17;
                              } else {
                                if (var12.field_ac) {
                                  break L17;
                                } else {
                                  if (var12.field_Xb) {
                                    var12.field_Mb.field_R = wt.field_c;
                                    break L16;
                                  } else {
                                    var12.field_Mb.field_R = fg.field_a;
                                    break L16;
                                  }
                                }
                              }
                            }
                            var12.field_Sb.field_R = di.field_j;
                            break L16;
                          } else {
                            if (0 <= var12.field_Ub) {
                              var12.field_Mb.field_R = sta.field_o;
                              break L16;
                            } else {
                              L18: {
                                if (!var12.field_Gb) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (var12.field_cc) {
                                      break L19;
                                    } else {
                                      if (var12.field_ac) {
                                        break L19;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  var12.field_Sb.field_R = di.field_j;
                                  break L16;
                                }
                              }
                              if (-3 == (var12.field_Bb ^ -1)) {
                                var12.field_Sb.field_R = glb.field_a;
                                break L16;
                              } else {
                                var12.field_Mb.field_R = vq.field_w;
                                break L16;
                              }
                            }
                          }
                        }
                        L20: {
                          if (null != var12.field_Sb.field_R) {
                            var12.field_Sb.a(0, -76, 68, var31, nna.field_w);
                            break L20;
                          } else {
                            var12.field_Mb.a(0, 5, 68, var31, nna.field_w);
                            break L20;
                          }
                        }
                        L21: {
                          var12.field_dc.field_R = no.a(var12.field_dc.field_eb, var32, 78);
                          var12.field_dc.a(70, -40, 78, var31, nna.field_w);
                          if (!var12.field_dc.field_O) {
                            break L21;
                          } else {
                            if (var12.field_dc.field_R.equals(var32)) {
                              break L21;
                            } else {
                              lob.field_a = var32;
                              break L21;
                            }
                          }
                        }
                        L22: {
                          var12.field_yb.field_R = Integer.toString(var12.field_zb);
                          if (!var12.field_Gb) {
                            var12.field_yb.field_F = 1;
                            var12.field_yb.a(150, 125, 48, var31, nna.field_w);
                            break L22;
                          } else {
                            var12.field_yb.field_F = 2;
                            var12.field_wb.field_R = "/" + var12.field_Fb;
                            var33_int = (-var12.field_wb.field_eb.b("/") + 348) / 2;
                            var12.field_yb.a(150, 127, -150 + var33_int, var31, nna.field_w);
                            var12.field_wb.a(var33_int, 121, -var33_int + 198, var31, nna.field_w);
                            break L22;
                          }
                        }
                        L23: {
                          var12.field_Hb.field_R = Integer.toString(var12.field_Kb);
                          var12.field_Hb.a(200, 39, 48, var31, nna.field_w);
                          if (ll.field_o) {
                            stackOut_65_0 = 250;
                            stackIn_66_0 = stackOut_65_0;
                            break L23;
                          } else {
                            stackOut_64_0 = 200;
                            stackIn_66_0 = stackOut_64_0;
                            break L23;
                          }
                        }
                        L24: {
                          var33_int = stackIn_66_0;
                          var12.field_Lb.a(var33_int, 28, -var33_int + 363, var31, nna.field_w);
                          var34_int = hi.field_a;
                          if ((1 << ar.field_b & var14) != 0) {
                            var50_ref = sqb.field_o[var12.field_Cb];
                            var12.field_Wb.field_tb = var50_ref;
                            var12.field_Wb.a(var34_int, 32, var50_ref.field_m, 0, var12.field_Lb.field_G);
                            var34_int = var34_int + (hi.field_a + var50_ref.field_m);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L25: {
                          if (-1 == (var14 & 1 << ujb.field_g ^ -1)) {
                            break L25;
                          } else {
                            L26: {
                              if (!var12.field_cc) {
                                if (var12.field_ac) {
                                  stackOut_74_0 = 1;
                                  stackIn_76_0 = stackOut_74_0;
                                  break L26;
                                } else {
                                  stackOut_73_0 = 0;
                                  stackIn_76_0 = stackOut_73_0;
                                  break L26;
                                }
                              } else {
                                stackOut_71_0 = 1;
                                stackIn_76_0 = stackOut_71_0;
                                break L26;
                              }
                            }
                            L27: {
                              var36 = stackIn_76_0;
                              stackOut_76_0 = atb.field_b;
                              stackIn_78_0 = stackOut_76_0;
                              stackIn_77_0 = stackOut_76_0;
                              if (var36 == 0) {
                                stackOut_78_0 = (phb[]) ((Object) stackIn_78_0);
                                stackOut_78_1 = 0;
                                stackIn_79_0 = stackOut_78_0;
                                stackIn_79_1 = stackOut_78_1;
                                break L27;
                              } else {
                                stackOut_77_0 = (phb[]) ((Object) stackIn_77_0);
                                stackOut_77_1 = 1;
                                stackIn_79_0 = stackOut_77_0;
                                stackIn_79_1 = stackOut_77_1;
                                break L27;
                              }
                            }
                            var51_ref = stackIn_79_0[stackIn_79_1];
                            var12.field_Eb.field_tb = var51_ref;
                            var12.field_Eb.a(var34_int, 35, var51_ref.field_m, 0, var12.field_Lb.field_G);
                            var34_int = var34_int + (var51_ref.field_m + hi.field_a);
                            break L25;
                          }
                        }
                        L28: {
                          if (-1 != (1 << nt.field_o & var14 ^ -1)) {
                            var52_ref = lcb.field_t[var12.field_Bb - 1];
                            var12.field_Ab.field_tb = var52_ref;
                            var12.field_Ab.a(var34_int, 117, var52_ref.field_m, 0, var12.field_Lb.field_G);
                            var34_int = var34_int + (var52_ref.field_m + hi.field_a);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        L29: {
                          if (0 == (1 << eib.field_o & var14)) {
                            break L29;
                          } else {
                            L30: {
                              stackOut_84_0 = hnb.field_U;
                              stackIn_86_0 = stackOut_84_0;
                              stackIn_85_0 = stackOut_84_0;
                              if (!var12.field_xb) {
                                stackOut_86_0 = (phb[]) ((Object) stackIn_86_0);
                                stackOut_86_1 = 0;
                                stackIn_87_0 = stackOut_86_0;
                                stackIn_87_1 = stackOut_86_1;
                                break L30;
                              } else {
                                stackOut_85_0 = (phb[]) ((Object) stackIn_85_0);
                                stackOut_85_1 = 1;
                                stackIn_87_0 = stackOut_85_0;
                                stackIn_87_1 = stackOut_85_1;
                                break L30;
                              }
                            }
                            var53_ref = stackIn_87_0[stackIn_87_1];
                            var12.field_Rb.field_tb = var53_ref;
                            var12.field_Rb.a(var34_int, 121, var53_ref.field_m, 0, var12.field_Lb.field_G);
                            var34_int = var34_int + (var53_ref.field_m - -hi.field_a);
                            break L29;
                          }
                        }
                        L31: {
                          if (null == hwa.field_p) {
                            break L31;
                          } else {
                            var36 = 0;
                            L32: while (true) {
                              if (var36 >= ocb.field_l) {
                                break L31;
                              } else {
                                L33: {
                                  if (hwa.field_p[var36] != null) {
                                    if (-1 != (var14 & 1 << var36 + kb.field_b ^ -1)) {
                                      var42 = hwa.field_p[var36][var12.field_Pb[var36] & 255];
                                      var54 = var42;
                                      var12.field_Zb[var36].field_tb = var42;
                                      var12.field_Zb[var36].a(var34_int, 120, var54.field_m, 0, var12.field_Lb.field_G);
                                      var34_int = var34_int + (var54.field_m + hi.field_a);
                                      break L33;
                                    } else {
                                      var36++;
                                      continue L32;
                                    }
                                  } else {
                                    break L33;
                                  }
                                }
                                var36++;
                                continue L32;
                              }
                            }
                          }
                        }
                        L34: {
                          var36 = (var12.field_Lb.field_hb + -var34_int) / 2;
                          if ((var36 ^ -1) < -1) {
                            var12.field_Wb.field_L = var12.field_Wb.field_L + var36;
                            var12.field_Eb.field_L = var12.field_Eb.field_L + var36;
                            var12.field_Ab.field_L = var12.field_Ab.field_L + var36;
                            var12.field_Rb.field_L = var12.field_Rb.field_L + var36;
                            var37_int = 0;
                            L35: while (true) {
                              if (ocb.field_l <= var37_int) {
                                break L34;
                              } else {
                                var12.field_Zb[var37_int].field_L = var12.field_Zb[var37_int].field_L + var36;
                                var37_int++;
                                continue L35;
                              }
                            }
                          } else {
                            break L34;
                          }
                        }
                        L36: {
                          if (var12.field_fc) {
                            L37: {
                              var37_int = var12.field_Ub;
                              if (var37_int >= 0) {
                                break L37;
                              } else {
                                var37_int = (int)(var9 + -var12.field_Ob);
                                break L37;
                              }
                            }
                            var38_int = var37_int / 1000;
                            var39 = var38_int / 60;
                            var38_int = var38_int % 60;
                            if (60 <= var39) {
                              var40 = var39 / 60;
                              var39 = var39 % 60;
                              var12.field_Yb.field_R = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                              break L36;
                            } else {
                              var12.field_Yb.field_R = var39 + ":" + var38_int / 10 + var38_int % 10;
                              break L36;
                            }
                          } else {
                            break L36;
                          }
                        }
                        L38: {
                          var12.field_Yb.a(365, 43, var12.field_hb - 365, var31, nna.field_w);
                          var31 = var31 + nna.field_w;
                          if (var12.field_Ib == null) {
                            break L38;
                          } else {
                            var31 += 2;
                            var37 = new StringBuilder(64);
                            discarded$4 = var37.append(ija.field_c);
                            discarded$5 = var37.append(var12.field_Ib[0]);
                            var38_int = 1;
                            L39: while (true) {
                              if (var38_int >= var12.field_zb) {
                                var38 = var37.toString();
                                var12.field_Jb.field_R = var38;
                                var39 = var12.field_Jb.field_eb.c(var38, var12.field_hb + -(var12.field_Jb.field_w * 2));
                                var12.field_Jb.a(0, -9, var12.field_hb, var31, var39 * nna.field_w);
                                var31 = var31 + nna.field_w * var39;
                                break L38;
                              } else {
                                discarded$6 = var37.append(", ");
                                discarded$7 = var37.append(var12.field_Ib[var38_int]);
                                var38_int++;
                                continue L39;
                              }
                            }
                          }
                        }
                        L40: {
                          if (!var12.field_ac) {
                            break L40;
                          } else {
                            var12.field_Tb.field_R = isa.a(og.field_o, new String[]{var32}, 104);
                            var12.field_Tb.a(qs.field_c, 122, var12.field_hb - qs.field_c * 2, var31, nna.field_w);
                            var31 = var31 + nna.field_w;
                            break L40;
                          }
                        }
                        if (var12.field_Qb) {
                          var12.field_vb.field_R = isa.a(bna.field_m, new String[]{var32}, 79);
                          var12.field_vb.a(qs.field_c, 0, var12.field_hb + -(2 * qs.field_c), var31, nna.field_w);
                          var31 = var31 + nna.field_w;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L41: {
                      var33 = jm.a((byte) -126, var32, var12.field_ec);
                      var34 = var33;
                      var34 = var33;
                      if (var33 == null) {
                        break L41;
                      } else {
                        var34_int = var12.field_bc.field_eb.c(var33, -qs.field_c + (var12.field_hb - qs.field_c));
                        var12.field_bc.field_I = var12.field_Db * 256 / ktb.field_p;
                        var12.field_bc.field_R = var33;
                        var12.field_bc.a(qs.field_c, 126, -(2 * qs.field_c) + var12.field_hb, var31, nna.field_w * var34_int);
                        var31 = var31 + nna.field_w * var34_int;
                        break L41;
                      }
                    }
                    L42: {
                      if (var7_int == 0) {
                        var12.field_E = var31 + -var12.field_G;
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                    L43: {
                      if (var13 == 0) {
                        break L43;
                      } else {
                        rgb.field_f.field_wb.a((llb) (var11), 2, var12, -25);
                        break L43;
                      }
                    }
                    var34_int = 0;
                    L44: while (true) {
                      if (var34_int >= ocb.field_l) {
                        L45: {
                          if (var12.field_Wb.field_O) {
                            L46: {
                              if (1 != var12.field_Cb) {
                                var34 = uka.field_p[var12.field_Cb];
                                break L46;
                              } else {
                                var34 = og.field_p;
                                break L46;
                              }
                            }
                            lob.field_a = gib.field_c + " - " + var34;
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        L47: {
                          if (var12.field_Rb.field_O) {
                            L48: {
                              if (!var12.field_xb) {
                                stackOut_149_0 = dda.field_c;
                                stackIn_150_0 = stackOut_149_0;
                                break L48;
                              } else {
                                stackOut_148_0 = hgb.field_p;
                                stackIn_150_0 = stackOut_148_0;
                                break L48;
                              }
                            }
                            lob.field_a = stackIn_150_0;
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        L49: {
                          if (!var12.field_Eb.field_O) {
                            break L49;
                          } else {
                            L50: {
                              L51: {
                                if (var12.field_cc) {
                                  break L51;
                                } else {
                                  if (var12.field_ac) {
                                    break L51;
                                  } else {
                                    if (var12.field_Gb) {
                                      stackOut_156_0 = rdb.field_f;
                                      stackIn_158_0 = stackOut_156_0;
                                      break L50;
                                    } else {
                                      stackOut_155_0 = jca.field_o;
                                      stackIn_158_0 = stackOut_155_0;
                                      break L50;
                                    }
                                  }
                                }
                              }
                              stackOut_157_0 = gda.field_k;
                              stackIn_158_0 = stackOut_157_0;
                              break L50;
                            }
                            lob.field_a = stackIn_158_0;
                            break L49;
                          }
                        }
                        L52: {
                          if (!var12.field_Ab.field_O) {
                            break L52;
                          } else {
                            L53: {
                              if ((var12.field_Bb ^ -1) != -3) {
                                stackOut_162_0 = jja.field_b;
                                stackIn_163_0 = stackOut_162_0;
                                break L53;
                              } else {
                                stackOut_161_0 = tla.field_h;
                                stackIn_163_0 = stackOut_161_0;
                                break L53;
                              }
                            }
                            lob.field_a = stackIn_163_0;
                            break L52;
                          }
                        }
                        L54: {
                          if (var12.field_o == 0) {
                            break L54;
                          } else {
                            if (var12.e((byte) 34)) {
                              break L54;
                            } else {
                              if (var12.field_Sb.field_o == 0) {
                                aaa.a((byte) 112, var12, var32, param3);
                                break L54;
                              } else {
                                L55: {
                                  if (!var12.field_fc) {
                                    break L55;
                                  } else {
                                    L56: {
                                      if (!var12.field_Gb) {
                                        break L56;
                                      } else {
                                        if (var12.field_cc) {
                                          break L55;
                                        } else {
                                          if (!var12.field_ac) {
                                            break L56;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                    }
                                    jua.a(var12.f((byte) -13), param4, 20694);
                                    break L54;
                                  }
                                }
                                pa.a(param4, (byte) -88, var12.f((byte) -13));
                                break L54;
                              }
                            }
                          }
                        }
                        var12 = (mm) ((Object) var8.a((byte) 92));
                        continue L3;
                      } else {
                        L57: {
                          if (var12.field_Zb[var34_int].field_O) {
                            L58: {
                              if (awa.field_o != null) {
                                if (null == awa.field_o[var34_int]) {
                                  var35 = null;
                                  break L58;
                                } else {
                                  var35 = awa.field_o[var34_int][255 & var12.field_Pb[var34_int]];
                                  break L58;
                                }
                              } else {
                                var35 = null;
                                break L58;
                              }
                            }
                            if (var35 != null) {
                              lob.field_a = hva.field_c[var34_int] + " - " + (String) (var35);
                              break L57;
                            } else {
                              lob.field_a = hva.field_c[var34_int];
                              break L57;
                            }
                          } else {
                            break L57;
                          }
                        }
                        var34_int++;
                        continue L44;
                      }
                    }
                  } else {
                    var12.field_Zb[var22_int].field_tb = null;
                    var23 = var12.field_Zb[var22_int];
                    var12.field_Zb[var22_int].field_G = 0;
                    var23.field_hb = 0;
                    var22_int++;
                    continue L14;
                  }
                }
              }
            }
          }
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

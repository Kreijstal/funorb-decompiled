/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vl extends hs {
    static bi field_q;
    static String field_p;
    static String field_m;
    static pf field_o;
    static String field_n;
    static String field_r;

    public static void b(byte param0) {
        if (param0 >= -6) {
            vl.b((byte) -19);
        }
        field_m = null;
        field_r = null;
        field_n = null;
        field_p = null;
        field_o = null;
        field_q = null;
    }

    final int[] a(Random param0, ln[] param1, int[][] param2, int param3, byte param4, int param5, int param6, int[] param7, int param8) throws jn {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] stackIn_8_0 = null;
        int[] stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_29_0 = null;
        int[] stackOut_7_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 < -3) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            var15 = new int[param8];
            var10_array = var15;
            if (param7 == null) {
              L2: {
                var13 = param8;
                if (var13 == 2) {
                  var10_array[0] = rh.field_f[0];
                  var10_array[1] = rh.field_f[3];
                  break L2;
                } else {
                  if (var13 == 3) {
                    var10_array[0] = rh.field_f[0];
                    var10_array[1] = rh.field_f[2];
                    var10_array[2] = rh.field_f[4];
                    break L2;
                  } else {
                    if (var13 != 4) {
                      if (var13 == 5) {
                        var12 = 0;
                        var11 = qf.a((byte) 47, 6, param0);
                        var13 = 0;
                        L3: while (true) {
                          if (~param8 >= ~var13) {
                            break L2;
                          } else {
                            L4: {
                              if (~var11 >= ~var13) {
                                var12 = 1;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var10_array[var13] = rh.field_f[var12 + var13];
                            var13++;
                            continue L3;
                          }
                        }
                      } else {
                        if (6 != var13) {
                          throw new jn("Sol Map does not support " + param8 + " players.");
                        } else {
                          var13 = 0;
                          L5: while (true) {
                            if (var13 >= param8) {
                              break L2;
                            } else {
                              var10_array[var13] = rh.field_f[var13];
                              var13++;
                              continue L5;
                            }
                          }
                        }
                      }
                    } else {
                      var10_array[1] = rh.field_f[1];
                      var10_array[2] = rh.field_f[3];
                      var10_array[0] = rh.field_f[0];
                      var10_array[3] = rh.field_f[4];
                      break L2;
                    }
                  }
                }
              }
              stackOut_29_0 = (int[]) var10_array;
              stackIn_30_0 = stackOut_29_0;
              break L0;
            } else {
              var11 = 0;
              L6: while (true) {
                if (~param7.length >= ~var11) {
                  var10_array[-1 + param8] = 36;
                  stackOut_7_0 = (int[]) var10_array;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  var15[var11] = param7[var11];
                  var11++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var10;
            stackOut_31_1 = new StringBuilder().append("vl.K(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          L8: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L8;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L8;
            }
          }
          L9: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L9;
            }
          }
          L10: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param7 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          throw r.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param8 + 41);
        }
        return stackIn_30_0;
    }

    final static void a(byte param0, bc param1, bc param2, bc param3) {
        RuntimeException var4 = null;
        nk[] var5 = null;
        nk[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        nk[] var10 = null;
        int var11_int = 0;
        bi var11 = null;
        bi var12 = null;
        int var13 = 0;
        nk[] var14 = null;
        bi var15 = null;
        int[][] var16 = null;
        bi var17 = null;
        bi var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            os.field_u = ae.a(-115, "commonui", param1, "frame_top");
            oh.field_d = ae.a(-125, "commonui", param1, "frame_bottom");
            kb.field_v = id.a(2, param1, "commonui", "jagex_logo_grey");
            kl.field_q = ae.a(-80, "commonui", param1, "button");
            lp.field_w = va.a("validation", 0, "commonui", param1);
            mf.field_x = (nq) (Object) ri.a("arezzo12", "commonui", param1, param2, (byte) -17);
            gn.field_u = (nq) (Object) ri.a("arezzo14", "commonui", param1, param2, (byte) 90);
            sl.field_p = (nq) (Object) ri.a("arezzo14bold", "commonui", param1, param2, (byte) 111);
            var17 = new bi(param3.a(true, "", "button.gif"), (java.awt.Component) (Object) tm.field_i);
            nk discarded$2 = kf.a("commonui", -108, param1, "dropdown");
            int discarded$3 = -118;
            var5 = tp.a("commonui", param1, "screen_options");
            hl.field_E = new nk[4];
            mf.field_o = new nk[4];
            qr.field_A = new nk[4];
            var6 = new nk[][]{qr.field_A, hl.field_E, mf.field_o};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_k;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var21.length) {
                var8 = var5[0].field_j[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    if (param0 >= 12) {
                      var9 = var17.field_w;
                      wh.a(false);
                      var17.e();
                      gf.e(0, 0, gf.field_b, gf.field_k);
                      var15 = new bi(var9, var9);
                      var18 = var15;
                      var18.e();
                      var17.c(0, 0);
                      var11 = new bi(var9, var9);
                      var11.e();
                      var17.c(-var17.field_z + var9, 0);
                      var12 = new bi(var17.field_z - 2 * var9, var9);
                      var12.e();
                      var17.c(-var9, 0);
                      ln.f((byte) 67);
                      kl.field_q = new bi[]{var15, var12, var11};
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var14.length <= var11_int) {
                        var9++;
                        continue L2;
                      } else {
                        var14[var11_int] = fi.a((byte) 27, var5[var9], var21[var11_int]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("vl.L(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final void a(boolean param0, l param1) throws jn {
        Object var3 = null;
        int var4_int = 0;
        ln[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        t var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        Object stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        Object stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        Object stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var9 = null;
                vl.a((byte) 49, (bc) null, (bc) null, (bc) null);
                break L1;
              }
            }
            L2: {
              var3 = null;
              if (null != mh.field_h) {
                var4_int = mh.field_h.length;
                var18 = new int[var4_int];
                var16 = var18;
                var14 = var16;
                var12 = var14;
                var10 = var12;
                var19 = var10;
                var17 = var19;
                var15 = var17;
                var13 = var15;
                var3 = (Object) (Object) var13;
                var5 = 0;
                L3: while (true) {
                  if (var4_int <= var5) {
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= -1 + var4_int) {
                        break L2;
                      } else {
                        var6_int = d.a((byte) -12, var5 + 1, var4_int + -1, param1.field_j);
                        var7 = var19[var6_int];
                        ((int[]) var3)[var6_int] = var19[var5];
                        var19[var5] = var7;
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    var18[var5] = var5;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            ((vl) this).field_f = new ln[((vl) this).field_c * ((vl) this).field_b];
            var4 = new ln[((vl) this).field_d];
            var5 = 0;
            var11 = 0;
            var6_int = var11;
            L5: while (true) {
              if (((vl) this).field_f.length <= var11) {
                param1.field_e = var4;
                var6 = new t(param1.field_e);
                var6.a(true, 1);
                ((vl) this).a(-11);
                break L0;
              } else {
                L6: {
                  if (ac.field_t[var11]) {
                    L7: {
                      var4[var5] = ((vl) this).a(var11, ((vl) this).field_c, ((vl) this).field_b, -8, var5);
                      var4[var5].field_I = mh.field_h[((int[]) var3)[var5]];
                      if (var5 == 36) {
                        var4[var5].field_I = "SOL";
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((vl) this).field_f[var11] = var4[var5];
                    var5++;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var11++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_22_0 = var3;
            stackOut_22_1 = new StringBuilder().append("vl.J(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    vl(int param0, int param1) {
        super(11, 11, param0, 73, param1);
        ((vl) this).field_e = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "More suggestions";
        field_m = "Age:";
        field_n = "Mute this player for 48 hours";
        field_o = new pf();
        field_r = "Who can join";
    }
}

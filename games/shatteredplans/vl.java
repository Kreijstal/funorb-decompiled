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
        int[] stackIn_8_0 = null;
        int[] stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 < -3) {
                break L1;
              } else {
                field_r = (String) null;
                break L1;
              }
            }
            var15 = new int[param8];
            var10 = var15;
            if (param7 == null) {
              L2: {
                var13 = param8;
                if (-3 == (var13 ^ -1)) {
                  var10[0] = rh.field_f[0];
                  var10[1] = rh.field_f[3];
                  break L2;
                } else {
                  if ((var13 ^ -1) == -4) {
                    var10[0] = rh.field_f[0];
                    var10[1] = rh.field_f[2];
                    var10[2] = rh.field_f[4];
                    break L2;
                  } else {
                    if (-5 != (var13 ^ -1)) {
                      if (-6 == (var13 ^ -1)) {
                        var12 = 0;
                        var11 = qf.a((byte) 47, 6, param0);
                        var13 = 0;
                        L3: while (true) {
                          if (param8 <= var13) {
                            break L2;
                          } else {
                            L4: {
                              if (var11 <= var13) {
                                var12 = 1;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var10[var13] = rh.field_f[var12 + var13];
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
                              var10[var13] = rh.field_f[var13];
                              var13++;
                              continue L5;
                            }
                          }
                        }
                      }
                    } else {
                      var10[1] = rh.field_f[1];
                      var10[2] = rh.field_f[3];
                      var10[0] = rh.field_f[0];
                      var10[3] = rh.field_f[4];
                      break L2;
                    }
                  }
                }
              }
              stackIn_30_0 = (int[]) (var10);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var11 = 0;
              L6: while (true) {
                if (param7.length <= var11) {
                  var10[-1 + param8] = 36;
                  stackIn_8_0 = (int[]) (var10);
                  decompiledRegionSelector0 = 0;
                  break L0;
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
            var10_ref = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var10_ref);

            stackIn_33_1 = new StringBuilder().append("vl.K(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L10;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L10;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_34_0), stackIn_43_2 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_30_0;
        }
    }

    final static void a(byte param0, bc param1, bc param2, bc param3) {
        nk[] var14 = null;
        int var11_int = 0;
        bi var15 = null;
        bi var18 = null;
        bi var11 = null;
        bi var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = ShatteredPlansClient.field_F ? 1 : 0;
        os.field_u = ae.a(-115, "commonui", param1, "frame_top");
        oh.field_d = ae.a(-125, "commonui", param1, "frame_bottom");
        kb.field_v = id.a(2, param1, "commonui", "jagex_logo_grey");
        kl.field_q = ae.a(-80, "commonui", param1, "button");
        lp.field_w = va.a("validation", 0, "commonui", param1);
        mf.field_x = (nq) ((Object) ri.a("arezzo12", "commonui", param1, param2, (byte) -17));
        gn.field_u = (nq) ((Object) ri.a("arezzo14", "commonui", param1, param2, (byte) 90));
        sl.field_p = (nq) ((Object) ri.a("arezzo14bold", "commonui", param1, param2, (byte) 111));
        bi var17 = new bi(param3.a(true, "", "button.gif"), (java.awt.Component) ((Object) tm.field_i));
        kf.a("commonui", -108, param1, "dropdown");
        nk[] var5 = tp.a("commonui", param1, "screen_options", (byte) -118);
        hl.field_E = new nk[4];
        mf.field_o = new nk[4];
        qr.field_A = new nk[4];
        nk[][] var6 = new nk[][]{qr.field_A, hl.field_E, mf.field_o};
        int[][] var19 = new int[4][];
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_k;
        for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
        }
        var8 = var5[0].field_j[0];
        var19[2][var8] = 16777215;
        var19[1][var8] = 2394342;
        var19[3][var8] = 4767999;
        for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            nk[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
                var14[var11_int] = fi.a((byte) 27, var5[var9], var19[var11_int]);
            }
        }
        if (param0 < 12) {
            return;
        }
        try {
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
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "vl.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, l param1) throws jn {
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var4_int = 0;
        ln[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        t var6 = null;
        int var7 = 0;
        int var8 = 0;
        bc var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var9 = (bc) null;
                vl.a((byte) 49, (bc) null, (bc) null, (bc) null);
                break L1;
              }
            }
            L2: {
              var3 = null;
              if (null != mh.field_h) {
                var4_int = mh.field_h.length;
                var14 = new int[var4_int];
                var12 = var14;
                var10 = var12;
                var15 = var10;
                var13 = var15;
                var3 = var13;
                var5 = 0;
                L3: while (true) {
                  if (var4_int <= var5) {
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= -1 + var4_int) {
                        break L2;
                      } else {
                        var6_int = d.a((byte) -12, var5 + 1, var4_int + -1, param1.field_j);
                        var7 = var15[var6_int];
                        ((int[]) (var3))[var6_int] = var15[var5];
                        var15[var5] = var7;
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    var14[var5] = var5;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            this.field_f = new ln[this.field_c * this.field_b];
            var4 = new ln[this.field_d];
            var5 = 0;
            var11 = 0;
            var6_int = var11;
            L5: while (true) {
              if (this.field_f.length <= var11) {
                param1.field_e = var4;
                var6 = new t(param1.field_e);
                var6.a(true, 1);
                this.a(-11);
                break L0;
              } else {
                L6: {
                  if (ac.field_t[var11]) {
                    L7: {
                      var4[var5] = this.a(var11, this.field_c, this.field_b, -8, var5);
                      var4[var5].field_I = mh.field_h[((int[]) (var3))[var5]];
                      if (-37 == (var5 ^ -1)) {
                        var4[var5].field_I = "SOL";
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.field_f[var11] = var4[var5];
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
            var3 = decompiledCaughtException;
            stackIn_24_0 = var3;

            stackIn_24_1 = new StringBuilder().append("vl.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = stackIn_24_0;
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = stackIn_24_0;
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    vl(int param0, int param1) {
        super(11, 11, param0, 73, param1);
        this.field_e = 1;
    }

    static {
        field_p = "More suggestions";
        field_m = "Age:";
        field_n = "Mute this player for 48 hours";
        field_o = new pf();
        field_r = "Who can join";
    }
}

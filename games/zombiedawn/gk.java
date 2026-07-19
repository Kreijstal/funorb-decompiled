/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gk extends fb {
    private boolean field_D;
    static String field_H;
    static int field_G;
    private boolean field_E;
    static String field_F;
    private boolean field_J;
    static String field_I;

    final void a(byte param0, wk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 <= -76) {
              L1: {
                var3_int = param1.a(this.a(true) - 24, (byte) -106);
                var4 = param1.a(-24 + this.f(237239984), 0);
                if (var3_int < -48) {
                  break L1;
                } else {
                  if (var4 < -48) {
                    break L1;
                  } else {
                    if (qj.field_d < var3_int) {
                      break L1;
                    } else {
                      if (var4 <= me.field_Bb) {
                        L2: {
                          if (!this.field_D) {
                            if (!this.field_E) {
                              if (this.field_J) {
                                o.field_d[this.field_t].f(var3_int, var4);
                                break L2;
                              } else {
                                o.field_d[this.field_t].b(var3_int, var4);
                                break L2;
                              }
                            } else {
                              o.field_d[this.field_t].c(var3_int, var4);
                              break L2;
                            }
                          } else {
                            o.field_d[this.field_t].h(var3_int, var4, 2105376);
                            break L2;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("gk.B(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    gk(int param0, int param1, int param2, boolean param3) {
        super(param0, param1, param2);
        this.field_E = false;
        this.field_J = false;
        this.field_D = false;
        this.field_D = param3 ? true : false;
        int var5 = pb.a(so.field_a, 2, 1);
        if ((var5 ^ -1) == -2) {
            this.field_E = true;
        } else {
            if (-3 == (var5 ^ -1)) {
                this.field_J = true;
            }
        }
    }

    public static void i(int param0) {
        field_I = null;
        field_F = null;
        if (param0 <= 110) {
            return;
        }
        field_H = null;
    }

    final static void a(int param0, vn[] param1, boolean param2) {
        on discarded$2 = null;
        RuntimeException var3 = null;
        byte[] var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              kd.field_Fb[param0] = param1;
              kd.field_Fb[param0][-2 + kd.field_Fb[param0].length].a();
              if (ng.field_e) {
                break L1;
              } else {
                bi.d();
                break L1;
              }
            }
            L2: {
              if (!param2) {
                var4 = (byte[]) null;
                discarded$2 = gk.a((byte) 57, (byte[]) null);
                cn.field_f.b(57);
                break L2;
              } else {
                cn.field_f.b(57);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("gk.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
    }

    final static void j(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        gd var4_ref_gd = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        gd var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              bn.field_b = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
              var1_int = ic.field_W.length;
              var21 = new int[var1_int];
              var20 = var21;
              var2 = var20;
              if (param0 == 30549) {
                break L1;
              } else {
                field_H = (String) null;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= var1_int) {
                L3: {
                  var3 = bn.field_b[9] >> -421918744;
                  var4 = bn.field_b[10] >> -48561880;
                  var5 = bn.field_b[11] >> 1453092328;
                  var6 = ej.field_x << 301322468;
                  var7 = 0;
                  var8 = rd.a(true, var6) >> 589984488;
                  var9 = fb.a(1311979239, var6) >> -48259352;
                  if (0 == (ha.field_b ^ -1)) {
                    break L3;
                  } else {
                    if (-1 == ei.field_K) {
                      break L3;
                    } else {
                      var7 = ha.field_b - 320;
                      var9 = -128;
                      var8 = 240 + -ei.field_K;
                      break L3;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var7 * var7 - -(var8 * var8))));
                var8 = (int)((double)var8 * var10);
                var7 = (int)((double)var7 * var10);
                var9 = (int)((double)var9 * var10);
                var12 = var7 + -var3;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 + var14 * var14)));
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var14 = (int)((double)var14 * var10);
                var15 = 0;
                L4: while (true) {
                  if (var15 >= ic.field_W.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (var17_int >= ic.field_W.length) {
                        var2[var16] = -2147483648;
                        var17 = ic.field_W[var16];
                        sl.a(true, var16);
                        var18 = 0;
                        L6: while (true) {
                          if (3 <= var18) {
                            ad.a(true, jc.field_n, var17, (byte) 50, false, false, bn.field_b);
                            rc.a((byte) -111, var14, var13, var17, var7, var8, var9, var12);
                            var15++;
                            continue L4;
                          } else {
                            jc.field_n[var18] = jc.field_n[var18] + eg.field_o[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var21[var17_int] > var21[var16]) {
                            var16 = var17_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var17_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4_ref_gd = ic.field_W[var3];
                var4_ref_gd.b(32767);
                sl.a(true, var3);
                var5 = var4_ref_gd.field_s + var4_ref_gd.field_o >> -804138463;
                var6 = var4_ref_gd.field_L + var4_ref_gd.field_E >> -568361023;
                var7 = var4_ref_gd.field_a - -var4_ref_gd.field_b >> 1482108993;
                var8 = bn.field_b[9] >> 981434050;
                var9 = bn.field_b[10] >> -1765580894;
                var10_int = bn.field_b[11] >> 1801554338;
                var11 = var8 * jc.field_n[3] - (-(jc.field_n[4] * var9) - jc.field_n[5] * var10_int) >> 1595982414;
                var12 = jc.field_n[8] * var10_int + (jc.field_n[6] * var8 - -(jc.field_n[7] * var9)) >> -998075538;
                var13 = var10_int * jc.field_n[11] + (jc.field_n[10] * var9 + jc.field_n[9] * var8) >> 184827374;
                var2[var3] = var7 * var13 + (var11 * var5 - -(var12 * var6)) >> -773098256;
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "gk.F(" + param0 + ')');
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = ZombieDawn.field_J;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (param2 & 16718014) >> 1329809520;
        int var5 = param2 >> -1974293752 & 255;
        int var6 = param2 & 255;
        int var7 = 255 & param0 >> -289558256;
        int var8 = (65282 & param0) >> -1274130456;
        if (param1 > -35) {
            return (int[]) null;
        }
        int var9 = param0 & 255;
        for (var10 = 0; 256 > var10; var10++) {
            var11 = 256 + -var10;
            var13[var10] = ((var4 * var10 >> -1327843032) + (var7 * var11 >> 878376744) << -442621808) + (((var11 * var8 >> 99889640) + (var5 * var10 >> -703553176) << 1556025160) - -(var11 * var9 >> -190188280)) - -(var6 * var10 >> -1766221720);
        }
        return var3;
    }

    final void g(int param0) {
        if (param0 < 95) {
            wk var3 = (wk) null;
            this.a((byte) -5, (wk) null);
        }
    }

    final static on a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        on stackIn_3_0 = null;
        on stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        on stackOut_7_0 = null;
        on stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 <= -67) {
              var2_int = 90000;
              var3 = 10;
              var4 = 0;
              var5 = new byte[12 + param1.length];
              fb.a(0, var5, (byte) 67, md.a(0, param1, 74));
              fb.a(1, var5, (byte) -87, var4);
              fb.a(2, var5, (byte) 70, var2_int);
              fb.a(3, var5, (byte) -109, var3);
              var6 = 1;
              L1: while (true) {
                if (param1.length / 4 <= var6) {
                  stackOut_7_0 = fc.a(var5, (byte) 126);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fb.a(var6 - -3, var5, (byte) -125, md.a(var6, param1, 85));
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (on) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("gk.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
        field_H = "Log in";
        field_G = 600;
        field_I = "Confirm Password: ";
        field_F = null;
    }
}

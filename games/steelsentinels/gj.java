/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gj {
    static String field_c;
    static String field_b;
    static wk field_a;

    final static void a(int param0, gk param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var20 = SteelSentinels.field_G;
          if (param2 <= -63) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          var6 = (param5 - param3 << 1130719784) / param1.field_g;
          var7 = (param3 << -319446840) + var6 * param1.field_j;
          param0 = param0 + param1.field_j;
          param4 = param4 + param1.field_n;
          var8 = pb.field_c * param4 + param0;
          var9 = 0;
          var10 = param1.field_i;
          var11 = param1.field_a;
          var12 = pb.field_c - var11;
          if (pb.field_l > param4) {
            var14 = -param4 + pb.field_l;
            var8 = var8 + pb.field_c * var14;
            var10 = var10 - var14;
            param4 = pb.field_l;
            var9 = var9 + var14 * var11;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var13 = 0;
          if (param0 < pb.field_i) {
            var14 = pb.field_i - param0;
            var11 = var11 - var14;
            param0 = pb.field_i;
            var12 = var12 + var14;
            var13 = var13 + var14;
            var9 = var9 + var14;
            var8 = var8 + var14;
            var7 = var7 + var14 * var6;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (pb.field_d >= var10 + param4) {
            break L3;
          } else {
            var10 = var10 - (var10 + (param4 + -pb.field_d));
            break L3;
          }
        }
        L4: {
          if (var11 + param0 <= pb.field_b) {
            break L4;
          } else {
            var14 = param0 + (var11 + -pb.field_b);
            var12 = var12 + var14;
            var13 = var13 + var14;
            var11 = var11 - var14;
            break L4;
          }
        }
        L5: {
          if (0 >= var11) {
            break L5;
          } else {
            if (-1 > (var10 ^ -1)) {
              param4 = -var10;
              L6: while (true) {
                if (param4 >= 0) {
                  return;
                } else {
                  var14 = var7;
                  param0 = -var11;
                  L7: while (true) {
                    if (0 <= param0) {
                      var9 = var9 + var13;
                      var8 = var8 + var12;
                      param4++;
                      continue L6;
                    } else {
                      var15 = var14 >> -1744839736;
                      var16 = 256 + -var15;
                      var14 = var14 + var6;
                      if (-1 >= (var15 ^ -1)) {
                        var9++;
                        var17 = param1.field_o[param1.field_p[var9] & 255];
                        if (-1 != (var17 ^ -1)) {
                          if (255 < var15) {
                            pb.field_g[var8] = var17;
                            var8++;
                            param0++;
                            continue L7;
                          } else {
                            var18 = pb.field_g[var8];
                            var19 = var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> -687395000 & 16711935;
                            pb.field_g[var8] = var19 + ec.a(65280, var16 * ec.a(var18, 65280) + ec.a(65280, var17) * var15 >> 291921288);
                            var8++;
                            param0++;
                            continue L7;
                          }
                        } else {
                          var8++;
                          param0++;
                          continue L7;
                        }
                      } else {
                        var8++;
                        var9++;
                        param0++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
        }
    }

    final static wk[] b(int param0) {
        wk[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var12 = null;
        int[] var13 = null;
        byte[] var16 = null;
        int[] var17 = null;
        byte[] var20 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = SteelSentinels.field_G;
        var1 = new wk[rl.field_d];
        var2 = param0;
        L0: while (true) {
          if (var2 >= rl.field_d) {
            uh.a(9324);
            return var1;
          } else {
            var3 = le.field_L[var2] * ca.field_r[var2];
            var23 = dl.field_L[var2];
            if (!pd.field_U[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new wk(un.field_n, eb.field_n, rl.field_a[var2], oa.field_M[var2], le.field_L[var2], ca.field_r[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = ba.field_d[ec.a(255, (int) var23[var6])];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var24 = sn.field_g[var2];
              var20 = var24;
              var16 = var20;
              var12 = var16;
              var9 = var12;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (wk) (Object) new ek(un.field_n, eb.field_n, rl.field_a[var2], oa.field_M[var2], le.field_L[var2], ca.field_r[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = vn.a(ba.field_d[ec.a(255, (int) var23[var7])], ec.a(var24[var7] << -1523688808, -16777216));
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == rb.field_h) {
                break L0;
              } else {
                L1: {
                  L2: {
                    if ((param1 ^ -1) <= -1) {
                      if (rn.field_v != jd.field_sb) {
                        break L0;
                      } else {
                        if (mm.field_g.field_p != 0) {
                          break L2;
                        } else {
                          if (10000L + vf.field_d >= mm.a(param0 + 49)) {
                            break L2;
                          } else {
                            mm.field_g.a(param1, (byte) -117);
                            field_b = null;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (mm.field_g.field_p != 0) {
                        break L2;
                      } else {
                        if (10000L + vf.field_d >= mm.a(param0 + 49)) {
                          break L2;
                        } else {
                          mm.field_g.a(param1, (byte) -117);
                          if (param0 == 0) {
                            break L1;
                          } else {
                            field_b = null;
                            field_b = null;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  if (param0 == 0) {
                    break L1;
                  } else {
                    field_b = null;
                    break L1;
                  }
                }
                L3: {
                  if ((mm.field_g.field_p ^ -1) >= -1) {
                    break L3;
                  } else {
                    try {
                      rb.field_h.a(mm.field_g.field_p, mm.field_g.field_t, -100, 0);
                      vf.field_d = mm.a(param0 + 58);
                    } catch (java.io.IOException decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    var2 = (IOException) (Object) decompiledCaughtException;
                    pm.m(-41);
                    break L3;
                  }
                }
                mm.field_g.field_p = 0;
              }
            }
            mm.field_g.field_p = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        int var1 = 10 % ((44 - param0) / 40);
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "???";
    }
}

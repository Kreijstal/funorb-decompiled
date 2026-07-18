/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gj {
    static String field_c;
    static String field_b;
    static wk field_a;

    final static void a(int param0, gk param1, byte param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var20 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param2 <= -63) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              var6_int = (param5 - param3 << 8) / param1.field_g;
              var7 = (param3 << 8) + var6_int * param1.field_j;
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
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var13 = 0;
              if (param0 < pb.field_i) {
                var14 = pb.field_i - param0;
                var11 = var11 - var14;
                param0 = pb.field_i;
                var12 = var12 + var14;
                var13 = var13 + var14;
                var9 = var9 + var14;
                var8 = var8 + var14;
                var7 = var7 + var14 * var6_int;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (pb.field_d >= var10 + param4) {
                break L4;
              } else {
                var10 = var10 - (var10 + (param4 + -pb.field_d));
                break L4;
              }
            }
            L5: {
              if (var11 + param0 <= pb.field_b) {
                break L5;
              } else {
                var14 = param0 + (var11 + -pb.field_b);
                var12 = var12 + var14;
                var13 = var13 + var14;
                var11 = var11 - var14;
                break L5;
              }
            }
            L6: {
              if (0 >= var11) {
                break L6;
              } else {
                if (var10 > 0) {
                  param4 = -var10;
                  L7: while (true) {
                    if (param4 >= 0) {
                      break L0;
                    } else {
                      var14 = var7;
                      param0 = -var11;
                      L8: while (true) {
                        if (0 <= param0) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param4++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> 8;
                            var16 = 256 + -var15;
                            var14 = var14 + var6_int;
                            if (var15 >= 0) {
                              L10: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param1.field_o[param1.field_p[incrementValue$1] & 255];
                                if (var17 == 0) {
                                  break L10;
                                } else {
                                  if (255 < var15) {
                                    pb.field_g[var8] = var17;
                                    break L10;
                                  } else {
                                    var18 = pb.field_g[var8];
                                    var19 = var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> 8 & 16711935;
                                    pb.field_g[var8] = var19 + ec.a(65280, var16 * ec.a(var18, 65280) + ec.a(65280, var17) * var15 >> 8);
                                    break L10;
                                  }
                                }
                              }
                              var8++;
                              break L9;
                            } else {
                              var8++;
                              var9++;
                              break L9;
                            }
                          }
                          param0++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("gj.B(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static wk[] b() {
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
        var2 = 0;
        L0: while (true) {
          if (var2 >= rl.field_d) {
            int discarded$1 = 9324;
            uh.a();
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
                  var6_ref_int__[var7] = vn.a(ba.field_d[ec.a(255, (int) var23[var7])], ec.a(var24[var7] << 24, -16777216));
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
                  if (param1 >= 0) {
                    if (rn.field_v != jd.field_sb) {
                      break L0;
                    } else {
                      if (mm.field_g.field_p != 0) {
                        break L1;
                      } else {
                        if (10000L + vf.field_d >= mm.a(param0 + 49)) {
                          break L1;
                        } else {
                          mm.field_g.a(param1, (byte) -117);
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (mm.field_g.field_p != 0) {
                      break L1;
                    } else {
                      if (10000L + vf.field_d >= mm.a(param0 + 49)) {
                        break L1;
                      } else {
                        mm.field_g.a(param1, (byte) -117);
                        break L1;
                      }
                    }
                  }
                }
                L2: {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    field_b = null;
                    break L2;
                  }
                }
                L3: {
                  if (mm.field_g.field_p <= 0) {
                    break L3;
                  } else {
                    {
                      L4: {
                        rb.field_h.a(mm.field_g.field_p, mm.field_g.field_t, -100, 0);
                        vf.field_d = mm.a(param0 + 58);
                        break L4;
                      }
                    }
                    mm.field_g.field_p = 0;
                    break L3;
                  }
                }
                return;
              }
            }
            mm.field_g.field_p = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
        int var1 = 1;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "???";
    }
}

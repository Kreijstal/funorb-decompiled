/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends gg {
    byte[] field_k;
    static kl field_j;
    static int field_l;
    static boolean field_i;
    static gb field_h;

    final static rj e(int param0) {
        return (rj) (Object) new dk();
    }

    final static void f(int param0) {
        int var1 = 0;
        int var2 = SolKnight.field_L ? 1 : 0;
        ce.field_b = false;
        v.field_a = null;
        if (k.field_b) {
            ah.field_e.m(125);
        } else {
            var1 = c.field_H;
            if (var1 <= 0) {
            } else {
                if (1 != var1) {
                    v.field_a = bb.a(vc.field_b, new String[1], -63);
                } else {
                    v.field_a = bf.field_m;
                }
                v.field_a = ci.a(new CharSequence[3], (byte) -93);
            }
            ah.field_e.f(true);
            ql.d(18962);
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        hi var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        String stackIn_39_0 = null;
        String stackIn_40_0 = null;
        String stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        hi stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        String stackOut_38_0 = null;
        String stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        hi stackOut_45_0 = null;
        hi stackOut_44_0 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = th.field_J;
              var2 = 0;
              if (te.field_M == 2) {
                var3_long = -fg.field_f + je.a(1);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (0 > var2) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (~var3 <= ~vc.field_d.length) {
                break L0;
              } else {
                L3: {
                  var4 = oa.field_l[var3];
                  if (var4 >= 0) {
                    if (bc.field_K.field_f != var4) {
                      var5 = rj.field_c;
                      break L3;
                    } else {
                      var5 = pb.field_b;
                      break L3;
                    }
                  } else {
                    var5 = hc.field_d;
                    break L3;
                  }
                }
                L4: {
                  var6 = vc.field_d[var3];
                  if (2 != te.field_M) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      L5: {
                        if (~ak.field_b.length <= ~i.field_I.length) {
                          stackOut_18_0 = ak.field_b.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L5;
                        } else {
                          stackOut_17_0 = i.field_I.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_19_0;
                        if (~qc.field_h.length > ~qa.field_o.length) {
                          stackOut_21_0 = qa.field_o.length;
                          stackIn_22_0 = stackOut_21_0;
                          break L6;
                        } else {
                          stackOut_20_0 = qc.field_h.length;
                          stackIn_22_0 = stackOut_20_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_22_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (~(6 - -var7) >= ~var3) {
                            break L7;
                          } else {
                            L8: {
                              if (-var7 + (-6 + var3) - -ak.field_b.length >= 0) {
                                stackOut_26_0 = ak.field_b[var3 + -6 - (-ak.field_b.length - -var7)];
                                stackIn_27_0 = stackOut_26_0;
                                break L8;
                              } else {
                                stackOut_25_0 = "";
                                stackIn_27_0 = stackOut_25_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_27_0;
                            break L7;
                          }
                        }
                      }
                      if (var7 + 7 > var3) {
                        break L4;
                      } else {
                        if (~var3 > ~(7 - (-var7 - var8))) {
                          L9: {
                            if (~qc.field_h.length < ~(-var7 + -7 + var3)) {
                              stackOut_33_0 = qc.field_h[-var7 + var3 - 7];
                              stackIn_34_0 = stackOut_33_0;
                              break L9;
                            } else {
                              stackOut_32_0 = "";
                              stackIn_34_0 = stackOut_32_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_34_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  stackOut_38_0 = (String) var6;
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_39_0 = stackOut_38_0;
                  if (var4 < 0) {
                    stackOut_40_0 = (String) (Object) stackIn_40_0;
                    stackOut_40_1 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    break L11;
                  } else {
                    stackOut_39_0 = (String) (Object) stackIn_39_0;
                    stackOut_39_1 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    break L11;
                  }
                }
                L12: {
                  var7 = fa.a(stackIn_41_0, stackIn_41_1 != 0, (byte) 99);
                  var8 = sb.field_d + -(var7 >> 1);
                  if (var4 >= 0) {
                    L13: {
                      var1_int = var1_int + vg.field_N;
                      if (~bc.field_K.field_f != ~var4) {
                        stackOut_45_0 = kb.field_d;
                        stackIn_46_0 = stackOut_45_0;
                        break L13;
                      } else {
                        stackOut_44_0 = ai.field_a;
                        stackIn_46_0 = stackOut_44_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_46_0;
                      if (var9 != null) {
                        var9.a(false, var7 - -(bl.field_i << 1), var1_int, we.field_c + (g.field_l << 1), var8 + -bl.field_i);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + g.field_l;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (var4 < 0) {
                    ke.field_H.c(var6, var8, var1_int + ha.field_g, var5, -1);
                    var1_int = var1_int + uc.field_i;
                    break L15;
                  } else {
                    kb.field_f.c(var6, var8, var1_int - -ph.field_k, var5, -1);
                    var1_int = var1_int + (we.field_c + (vg.field_N + g.field_l));
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "ee.D(" + -4537 + ')');
        }
    }

    ee(byte[] param0) {
        try {
            ((ee) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ee.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        uh var4_ref_uh = null;
        int var4 = 0;
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
        uh var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            aj.field_m = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = wk.field_d.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  if (param0 >= 30) {
                    break L2;
                  } else {
                    field_j = null;
                    break L2;
                  }
                }
                L3: {
                  var3 = aj.field_m[9] >> 8;
                  var4 = aj.field_m[10] >> 8;
                  var5 = aj.field_m[11] >> 8;
                  var6 = ad.field_h << 4;
                  var7 = 0;
                  var8 = uk.a((byte) -64, var6) >> 8;
                  var9 = rd.a((byte) -30, var6) >> 8;
                  if (gb.field_j == -1) {
                    break L3;
                  } else {
                    if (ad.field_m != -1) {
                      var9 = -128;
                      var7 = gb.field_j - 320;
                      var8 = 240 + -ad.field_m;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 - -(var9 * var9)));
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = var7 - var3;
                var13 = var8 - var4;
                var14 = var9 + -var5;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var13 * var13 + var12 * var12));
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                var14 = (int)((double)var14 * var10);
                var15 = 0;
                L4: while (true) {
                  if (var15 >= wk.field_d.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (var17_int >= wk.field_d.length) {
                        var2[var16] = -2147483648;
                        var17 = wk.field_d[var16];
                        jh.a((byte) 126, var16);
                        var18 = 0;
                        L6: while (true) {
                          if (var18 >= 3) {
                            mb.a(var17, false, aj.field_m, qf.field_e, true, false, 5);
                            bi.a((byte) 77, var12, var14, var9, var17, var13, var8, var7);
                            var15++;
                            continue L4;
                          } else {
                            qf.field_e[var18] = qf.field_e[var18] + bg.field_v[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var23[var17_int] > var23[var16]) {
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
                var4_ref_uh = wk.field_d[var3];
                var17 = var4_ref_uh;
                var17 = var4_ref_uh;
                var4_ref_uh.b(32767);
                jh.a((byte) 126, var3);
                var5 = var4_ref_uh.field_E - -var4_ref_uh.field_Q >> 1;
                var6 = var4_ref_uh.field_t + var4_ref_uh.field_m >> 1;
                var7 = var4_ref_uh.field_N + var4_ref_uh.field_G >> 1;
                var8 = aj.field_m[9] >> 2;
                var9 = aj.field_m[10] >> 2;
                var10_int = aj.field_m[11] >> 2;
                var11 = var8 * qf.field_e[3] + var9 * qf.field_e[4] + qf.field_e[5] * var10_int >> 14;
                var12 = qf.field_e[8] * var10_int + qf.field_e[7] * var9 + var8 * qf.field_e[6] >> 14;
                var13 = qf.field_e[9] * var8 + var9 * qf.field_e[10] + qf.field_e[11] * var10_int >> 14;
                var2[var3] = var12 * var6 + var11 * var5 + var13 * var7 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "ee.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        int var1 = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new kl();
    }
}

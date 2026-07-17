/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class kd extends qe {
    static mg[] field_p;
    private boolean field_s;
    static String field_r;
    private ci field_o;
    static float field_t;
    static String field_n;
    private String field_q;

    public static void c(byte param0) {
        field_r = null;
        if (param0 >= -84) {
            mg[] discarded$0 = kd.c(false);
        }
        field_p = null;
        field_n = null;
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
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
            if (((kd) this).field_o.a(param1, true) == ee.field_c) {
              stackOut_2_0 = ((kd) this).field_o.a(param0, param1);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (((kd) this).a(param1, true) != ee.field_c) {
                L1: {
                  if (param0 == -26358) {
                    break L1;
                  } else {
                    kd.c((byte) -2);
                    break L1;
                  }
                }
                stackOut_9_0 = bk.field_c;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_5_0 = sg.field_g;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("kd.H(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final static void a(byte param0, String param1) {
        try {
            int var2_int = 32 / ((-65 - param0) / 43);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "kd.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(mg[] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 >= param3) {
                  break L1;
                } else {
                  var6_int = param0[0].field_u;
                  var7 = param0[2].field_u;
                  var8 = param0[1].field_u;
                  param0[0].c(param4, param1, param5);
                  param0[2].c(param3 + param4 - var7, param1, param5);
                  df.b(od.field_m);
                  df.h(param4 - -var6_int, param1, -var7 + (param4 + param3), param1 - -param0[1].field_z);
                  var9 = param4 - -var6_int;
                  var10 = param4 + (param3 + -var7);
                  param4 = var9;
                  L2: while (true) {
                    if (var10 <= param4) {
                      L3: {
                        df.a(od.field_m);
                        if (!param2) {
                          break L3;
                        } else {
                          var12 = null;
                          kd.a((mg[]) null, 31, true, 51, -96, 109);
                          break L3;
                        }
                      }
                      break L0;
                    } else {
                      param0[1].c(param4, param1, param5);
                      param4 = param4 + var8;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("kd.Q(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static mg[] c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Virogrid.field_F ? 1 : 0;
        mg[] var1 = new mg[rj.field_h];
        if (!param0) {
            return null;
        }
        for (var2 = 0; rj.field_h > var2; var2++) {
            var3 = db.field_k[var2] * gb.field_F[var2];
            var4 = lj.field_j[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = k.field_c[rb.a((int) var4[var6], 255)];
            }
            var1[var2] = new mg(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var5);
        }
        pe.b((byte) -28);
        return var1;
    }

    kd(wa param0, wa param1) {
        super(param0);
        ((kd) this).field_s = false;
        ((kd) this).field_q = "";
        try {
            ((kd) this).field_o = new ci(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "kd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(int param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        bj var4_ref_bj = null;
        int var4 = 0;
        int var5_int = 0;
        bj var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -117) {
                break L1;
              } else {
                var8 = null;
                kd.a((mg[]) null, -48, false, 30, 95, 36);
                break L1;
              }
            }
            if (ug.field_a == kh.field_c) {
              L2: {
                L3: {
                  var2_long = hc.a(-9986);
                  if (kg.field_e == 0) {
                    break L3;
                  } else {
                    if (0 > s.field_g) {
                      L4: {
                        var4_ref_bj = (bj) (Object) ac.field_d.a((byte) -120);
                        if (var4_ref_bj == null) {
                          break L4;
                        } else {
                          if (~var2_long < ~var4_ref_bj.field_p) {
                            var4_ref_bj.a(false);
                            ba.field_a = var4_ref_bj.field_l.length;
                            sh.field_qb.field_l = 0;
                            var5_int = 0;
                            L5: while (true) {
                              if (ba.field_a <= var5_int) {
                                ah.field_e = pl.field_c;
                                pl.field_c = md.field_b;
                                md.field_b = ci.field_q;
                                ci.field_q = var4_ref_bj.field_i;
                                stackOut_15_0 = 1;
                                stackIn_16_0 = stackOut_15_0;
                                return stackIn_16_0 != 0;
                              } else {
                                sh.field_qb.field_g[var5_int] = var4_ref_bj.field_l[var5_int];
                                var5_int++;
                                continue L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      stackOut_18_0 = s.field_g;
                      stackIn_20_0 = stackOut_18_0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_17_0 = s.field_g;
                stackIn_20_0 = stackOut_17_0;
                break L2;
              }
              L6: while (true) {
                L7: {
                  if (stackIn_20_0 >= 0) {
                    break L7;
                  } else {
                    sh.field_qb.field_l = 0;
                    if (wg.a(1, 0)) {
                      s.field_g = sh.field_qb.e(false);
                      sh.field_qb.field_l = 0;
                      ba.field_a = param1[s.field_g];
                      break L7;
                    } else {
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0 != 0;
                    }
                  }
                }
                if (ic.c((byte) 48)) {
                  if (kg.field_e == 0) {
                    ah.field_e = pl.field_c;
                    pl.field_c = md.field_b;
                    md.field_b = ci.field_q;
                    ci.field_q = s.field_g;
                    s.field_g = -1;
                    stackOut_37_0 = 1;
                    stackIn_38_0 = stackOut_37_0;
                    break L0;
                  } else {
                    L8: {
                      var4 = kg.field_e;
                      if (0.0 == qa.field_b) {
                        break L8;
                      } else {
                        var4 = (int)((double)var4 + mc.field_c.nextGaussian() * qa.field_b);
                        if (var4 < 0) {
                          var4 = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var5 = new bj((long)var4 + var2_long, s.field_g, new byte[ba.field_a]);
                    var6 = 0;
                    L9: while (true) {
                      if (ba.field_a <= var6) {
                        ac.field_d.a((l) (Object) var5, (byte) -68);
                        s.field_g = -1;
                        stackOut_19_0 = s.field_g;
                        stackIn_20_0 = stackOut_19_0;
                        continue L6;
                      } else {
                        var5.field_l[var6] = sh.field_qb.field_g[var6];
                        var6++;
                        continue L9;
                      }
                    }
                  }
                } else {
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  return stackIn_27_0 != 0;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("kd.J(").append(param0).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
        return stackIn_38_0 != 0;
    }

    final wl a(String param0, boolean param1) {
        kg var3 = null;
        RuntimeException var3_ref = null;
        wl stackIn_2_0 = null;
        wl stackIn_7_0 = null;
        wl stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        wl stackOut_6_0 = null;
        wl stackOut_11_0 = null;
        wl stackOut_10_0 = null;
        wl stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((kd) this).field_o.a(param0, param1) != ee.field_c) {
              L1: {
                if (param0.equals((Object) (Object) ((kd) this).field_q)) {
                  break L1;
                } else {
                  var3 = ub.a(99, param0);
                  if (!var3.b(-114)) {
                    stackOut_6_0 = te.field_d;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  } else {
                    ((kd) this).field_q = param0;
                    ((kd) this).field_s = var3.a((byte) -47);
                    break L1;
                  }
                }
              }
              L2: {
                if (((kd) this).field_s) {
                  stackOut_11_0 = bm.field_i;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = ee.field_c;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = ee.field_c;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("kd.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Reject";
        field_n = "Macroing or use of bots";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd implements dr {
    static String field_a;
    static ri field_g;
    static String field_b;
    static String field_e;
    static String field_c;
    static Boolean field_d;
    static ja[][] field_f;

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1) {
        nc.a(-122, param0);
        pm.a(false, param0);
    }

    final static void a() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5 = hl.field_e;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1_ref, "dd.C(" + 8 + ')');
        }
    }

    final static boolean a(int[] param0) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        bb var4_ref_bb = null;
        int var4 = 0;
        int var5_int = 0;
        bb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (pi.field_a == vo.field_l) {
              var2_long = bl.a((byte) 94);
              L1: {
                L2: {
                  if (od.field_Db == 0) {
                    break L2;
                  } else {
                    if (fd.field_F < 0) {
                      L3: {
                        var4_ref_bb = (bb) (Object) he.field_k.c(60);
                        if (var4_ref_bb == null) {
                          break L3;
                        } else {
                          if (var4_ref_bb.field_j >= var2_long) {
                            break L3;
                          } else {
                            var4_ref_bb.a(true);
                            hd.field_q = var4_ref_bb.field_f.length;
                            s.field_e.field_j = 0;
                            var5_int = 0;
                            L4: while (true) {
                              if (hd.field_q <= var5_int) {
                                k.field_k = jp.field_e;
                                jp.field_e = ij.field_d;
                                ij.field_d = op.field_i;
                                op.field_i = var4_ref_bb.field_l;
                                stackOut_14_0 = 1;
                                stackIn_15_0 = stackOut_14_0;
                                return stackIn_15_0 != 0;
                              } else {
                                s.field_e.field_m[var5_int] = var4_ref_bb.field_f[var5_int];
                                var5_int++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_17_0 = fd.field_F;
                      stackIn_19_0 = stackOut_17_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_16_0 = fd.field_F;
                stackIn_19_0 = stackOut_16_0;
                break L1;
              }
              L5: while (true) {
                L6: {
                  if (stackIn_19_0 >= 0) {
                    break L6;
                  } else {
                    s.field_e.field_j = 0;
                    if (!fa.b(10, 1)) {
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0 != 0;
                    } else {
                      fd.field_F = s.field_e.m(101);
                      s.field_e.field_j = 0;
                      hd.field_q = param0[fd.field_F];
                      break L6;
                    }
                  }
                }
                if (!dd.a(0)) {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  return stackIn_28_0 != 0;
                } else {
                  if (od.field_Db == 0) {
                    k.field_k = jp.field_e;
                    jp.field_e = ij.field_d;
                    ij.field_d = op.field_i;
                    op.field_i = fd.field_F;
                    fd.field_F = -1;
                    stackOut_39_0 = 1;
                    stackIn_40_0 = stackOut_39_0;
                    break L0;
                  } else {
                    L7: {
                      var4 = od.field_Db;
                      if (0.0 != la.field_n) {
                        var4 = (int)((double)var4 + c.field_c.nextGaussian() * la.field_n);
                        if (var4 < 0) {
                          var4 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var5 = new bb(var2_long + (long)var4, fd.field_F, new byte[hd.field_q]);
                    var6 = 0;
                    L8: while (true) {
                      if (hd.field_q <= var6) {
                        he.field_k.a((br) (Object) var5, false);
                        fd.field_F = -1;
                        stackOut_18_0 = fd.field_F;
                        stackIn_19_0 = stackOut_18_0;
                        continue L5;
                      } else {
                        var5.field_f[var6] = s.field_e.field_m[var6];
                        var6++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("dd.F(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + -126 + ')');
        }
        return stackIn_40_0 != 0;
    }

    final static boolean a(int param0) {
        if (!(hd.field_q != -1)) {
            if (!(fa.b(10, 1))) {
                return false;
            }
            hd.field_q = s.field_e.g(31365);
            s.field_e.field_j = 0;
        }
        if (!(hd.field_q != -2)) {
            if (!(fa.b(10, 2))) {
                return false;
            }
            hd.field_q = s.field_e.d((byte) 69);
            s.field_e.field_j = 0;
        }
        return fa.b(10, hd.field_q);
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          ta.field_hb = oi.field_j;
          if (param3 != 255) {
            if (param3 < 100) {
              ai.field_g = p.a(-28, param2, param3);
              return;
            } else {
              if (param3 <= 105) {
                var7 = param1;
                jk.a(0, var7);
                ai.field_g = kn.a(param1, -107);
                return;
              } else {
                ai.field_g = p.a(-28, param2, param3);
                return;
              }
            }
          } else {
            L0: {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (rj.field_J >= 13) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L0;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L0;
              }
            }
            ai.field_g = ij.a(stackIn_5_0 != 0, stackIn_5_1 != 0);
            var6 = null;
            jk.a(0, (String[]) null);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("dd.B(").append(0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please check if address is correct";
        field_b = "Draws even more zombies to you at the start of each match than Prepared. Equip both for the maximum number of minions.";
        field_f = new ja[5][];
        field_e = "Cancel";
        field_c = "For the zombie on the go.";
    }
}

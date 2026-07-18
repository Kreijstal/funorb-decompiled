/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ca extends ck {
    bj[] field_u;
    sk[] field_x;
    static int[] field_r;
    byte[] field_q;
    byte[] field_v;
    short[] field_p;
    private int[] field_s;
    byte[] field_o;
    static String field_w;
    int field_t;

    final boolean a(byte[] param0, int param1, ub param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -12422) {
                break L1;
              } else {
                ((ca) this).field_p = null;
                break L1;
              }
            }
            var5_int = 1;
            var6 = 0;
            var7 = null;
            var8 = 0;
            L2: while (true) {
              if (var8 >= 128) {
                stackOut_19_0 = var5_int;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    if (param0 == null) {
                      break L4;
                    } else {
                      if (param0[var8] == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var9 = ((ca) this).field_s[var8];
                  if (0 != var9) {
                    L5: {
                      if (~var6 == ~var9) {
                        break L5;
                      } else {
                        L6: {
                          var6 = var9;
                          var9--;
                          if ((1 & var9) != 0) {
                            var7 = (Object) (Object) param2.a((byte) -35, param3, var9 >> 2);
                            break L6;
                          } else {
                            var7 = (Object) (Object) param2.a(param3, var9 >> 2, -6923);
                            break L6;
                          }
                        }
                        if (var7 != null) {
                          break L5;
                        } else {
                          var5_int = 0;
                          break L5;
                        }
                      }
                    }
                    if (var7 == null) {
                      break L3;
                    } else {
                      ((ca) this).field_x[var8] = (sk) var7;
                      ((ca) this).field_s[var8] = 0;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("ca.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final static void d(int param0) {
        t.field_l = -1;
        eh.field_a = -1;
        rc.field_b = null;
        pg.field_A = false;
        si.field_m = 0;
    }

    public static void c(byte param0) {
        field_w = null;
        field_r = null;
    }

    final void a(byte param0) {
        ((ca) this).field_s = null;
        if (param0 < 100) {
            ((ca) this).field_x = null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6) {
        int var7_int = 0;
        ul var8 = null;
        long var9 = 0L;
        Object var11 = null;
        hk var12 = null;
        int var13 = 0;
        int var14 = 0;
        gh var18 = null;
        int var18_int = 0;
        gh var19 = null;
        gh var20 = null;
        gh var21 = null;
        int var22_int = 0;
        gh var22 = null;
        gh var23 = null;
        gh var24 = null;
        gh var25 = null;
        gh var26 = null;
        gh var27 = null;
        gh var28 = null;
        gh var29 = null;
        gh var30 = null;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        int var33_int = 0;
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
        wk var42 = null;
        gh var43 = null;
        gh var44 = null;
        gh var45 = null;
        gh var46 = null;
        gh var47 = null;
        gh var48 = null;
        gh var49 = null;
        Object var50 = null;
        wk var50_ref = null;
        Object var51 = null;
        wk var51_ref = null;
        Object var52 = null;
        wk var52_ref = null;
        Object var53 = null;
        wk var53_ref = null;
        wk var54 = null;
        kg stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        kg stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        kg stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        hk stackIn_9_0 = null;
        gh stackIn_9_1 = null;
        gh stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        hk stackIn_10_0 = null;
        gh stackIn_10_1 = null;
        gh stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        hk stackIn_11_0 = null;
        gh stackIn_11_1 = null;
        gh stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        gh stackIn_11_4 = null;
        hk stackIn_27_0 = null;
        gh stackIn_27_1 = null;
        gh stackIn_27_2 = null;
        long stackIn_27_3 = 0L;
        hk stackIn_28_0 = null;
        gh stackIn_28_1 = null;
        gh stackIn_28_2 = null;
        long stackIn_28_3 = 0L;
        hk stackIn_29_0 = null;
        gh stackIn_29_1 = null;
        gh stackIn_29_2 = null;
        long stackIn_29_3 = 0L;
        gh stackIn_29_4 = null;
        int stackIn_67_0 = 0;
        int stackIn_76_0 = 0;
        wk[] stackIn_77_0 = null;
        wk[] stackIn_78_0 = null;
        wk[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        wk[] stackIn_85_0 = null;
        wk[] stackIn_86_0 = null;
        wk[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        String stackIn_149_0 = null;
        String stackIn_158_0 = null;
        String stackIn_164_0 = null;
        kg stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        kg stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        kg stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        hk stackOut_8_0 = null;
        gh stackOut_8_1 = null;
        gh stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        hk stackOut_10_0 = null;
        gh stackOut_10_1 = null;
        gh stackOut_10_2 = null;
        long stackOut_10_3 = 0L;
        gh stackOut_10_4 = null;
        hk stackOut_9_0 = null;
        gh stackOut_9_1 = null;
        gh stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        gh stackOut_9_4 = null;
        hk stackOut_26_0 = null;
        gh stackOut_26_1 = null;
        gh stackOut_26_2 = null;
        long stackOut_26_3 = 0L;
        hk stackOut_28_0 = null;
        gh stackOut_28_1 = null;
        gh stackOut_28_2 = null;
        long stackOut_28_3 = 0L;
        gh stackOut_28_4 = null;
        hk stackOut_27_0 = null;
        gh stackOut_27_1 = null;
        gh stackOut_27_2 = null;
        long stackOut_27_3 = 0L;
        gh stackOut_27_4 = null;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        wk[] stackOut_76_0 = null;
        wk[] stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        wk[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        wk[] stackOut_84_0 = null;
        wk[] stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        wk[] stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_148_0 = null;
        String stackOut_147_0 = null;
        String stackOut_156_0 = null;
        String stackOut_155_0 = null;
        String stackOut_157_0 = null;
        String stackOut_163_0 = null;
        String stackOut_162_0 = null;
        L0: {
          var50 = null;
          var51 = null;
          var52 = null;
          var53 = null;
          var41 = SteelSentinels.field_G;
          stackOut_0_0 = rn.field_y;
          stackOut_0_1 = 2;
          stackOut_0_2 = 2 * (2 + db.field_b);
          stackOut_0_3 = param3 * (4 * (db.field_b - -2));
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (la.field_c != rn.field_y) {
            stackOut_2_0 = (kg) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (kg) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        var7_int = ((kg) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, param2, (byte) -41) ? 1 : 0;
        var8 = rn.field_y.field_Ub.field_M;
        var9 = mm.a(-113);
        var11 = null;
        var12 = (hk) (Object) var8.e(13058);
        L1: while (true) {
          if (var12 == null) {
            return;
          } else {
            L2: {
              var13 = 0;
              if (null == var12.field_M) {
                L3: {
                  var14 = 16777215;
                  var12.field_kc = new gh(0L, SteelSentinels.field_J);
                  var12.a(var12.field_kc, 125);
                  var12.field_kc.field_Kb = 1;
                  var12.field_Cc = new gh(0L, bb.field_W);
                  var12.a(var12.field_Cc, 127);
                  var12.field_qc = new gh(0L, SteelSentinels.field_J);
                  var12.a(var12.field_qc, 123);
                  var12.field_qc.field_ub = 0;
                  var12.field_zc = new gh(0L, SteelSentinels.field_J);
                  var12.a(var12.field_zc, 123);
                  var12.field_zc.field_ub = 0;
                  var12.field_Ic = new gh(0L, bb.field_W);
                  var12.a(var12.field_Ic, 118);
                  var12.field_Ic.field_Kb = 2;
                  stackOut_8_0 = (hk) var12;
                  stackOut_8_1 = null;
                  stackOut_8_2 = null;
                  stackOut_8_3 = 0L;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  stackIn_10_3 = stackOut_8_3;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  if (rm.field_p) {
                    stackOut_10_0 = (hk) (Object) stackIn_10_0;
                    stackOut_10_1 = null;
                    stackOut_10_2 = null;
                    stackOut_10_3 = stackIn_10_3;
                    stackOut_10_4 = SteelSentinels.field_J;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    stackIn_11_3 = stackOut_10_3;
                    stackIn_11_4 = stackOut_10_4;
                    break L3;
                  } else {
                    stackOut_9_0 = (hk) (Object) stackIn_9_0;
                    stackOut_9_1 = null;
                    stackOut_9_2 = null;
                    stackOut_9_3 = stackIn_9_3;
                    stackOut_9_4 = bb.field_W;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_11_3 = stackOut_9_3;
                    stackIn_11_4 = stackOut_9_4;
                    break L3;
                  }
                }
                L4: {
                  stackIn_11_0.field_uc = new gh(stackIn_11_3, stackIn_11_4);
                  var12.a(var12.field_uc, 118);
                  var12.field_Gc = new gh[be.field_a];
                  var12.field_Fc = new gh(0L, (gh) null);
                  if ((1 << ol.field_dc & var14) == 0) {
                    break L4;
                  } else {
                    var12.field_uc.a(var12.field_Fc, 125);
                    break L4;
                  }
                }
                L5: {
                  var12.field_Wb = new gh(0L, (gh) null);
                  if ((var14 & 1 << sn.field_b) == 0) {
                    break L5;
                  } else {
                    var12.field_uc.a(var12.field_Wb, 124);
                    break L5;
                  }
                }
                L6: {
                  var12.field_ac = new gh(0L, (gh) null);
                  if ((var14 & 1 << jf.field_Z) != 0) {
                    var12.field_uc.a(var12.field_ac, 126);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var12.field_tc = new gh(0L, (gh) null);
                  if ((1 << ja.field_f & var14) == 0) {
                    break L7;
                  } else {
                    var12.field_uc.a(var12.field_tc, 122);
                    break L7;
                  }
                }
                var45 = var12.field_Fc;
                var44 = var12.field_tc;
                var12.field_ac.field_Fb = 1;
                var43 = var12.field_Wb;
                var43.field_Fb = 1;
                var44.field_Fb = 1;
                var45.field_Fb = 1;
                var18_int = 0;
                L8: while (true) {
                  if (~var18_int <= ~be.field_a) {
                    L9: {
                      stackOut_26_0 = (hk) var12;
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
                      if (!rm.field_p) {
                        stackOut_28_0 = (hk) (Object) stackIn_28_0;
                        stackOut_28_1 = null;
                        stackOut_28_2 = null;
                        stackOut_28_3 = stackIn_28_3;
                        stackOut_28_4 = SteelSentinels.field_J;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        stackIn_29_3 = stackOut_28_3;
                        stackIn_29_4 = stackOut_28_4;
                        break L9;
                      } else {
                        stackOut_27_0 = (hk) (Object) stackIn_27_0;
                        stackOut_27_1 = null;
                        stackOut_27_2 = null;
                        stackOut_27_3 = stackIn_27_3;
                        stackOut_27_4 = bb.field_W;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        stackIn_29_2 = stackOut_27_2;
                        stackIn_29_3 = stackOut_27_3;
                        stackIn_29_4 = stackOut_27_4;
                        break L9;
                      }
                    }
                    stackIn_29_0.field_Lc = new gh(stackIn_29_3, stackIn_29_4);
                    var12.a(var12.field_Lc, 119);
                    var12.field_Lc.field_Kb = 2;
                    var12.field_Bc = new gh(0L, bb.field_W);
                    var12.a(var12.field_Bc, 119);
                    var12.field_Dc = new gh(0L, qb.field_K);
                    var12.a(var12.field_Dc, 121);
                    var12.field_lc = new gh(0L, qb.field_K);
                    var12.a(var12.field_lc, 124);
                    var12.field_xc = new gh(0L, bd.field_f);
                    var12.a(var12.field_xc, 121);
                    var12.h(-103);
                    var12.field_gc = new gh(0L, fa.field_f);
                    var13 = 1;
                    var12.a(var12.field_gc, 120);
                    break L2;
                  } else {
                    L10: {
                      var12.field_Gc[var18_int] = new gh(0L, (gh) null);
                      if ((1 << var18_int + ch.field_L & var14) != 0) {
                        var12.field_uc.a(var12.field_Gc[var18_int], 126);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var12.field_Gc[var18_int].field_Fb = 1;
                    var18_int++;
                    continue L8;
                  }
                }
              } else {
                break L2;
              }
            }
            L11: {
              var12.field_kc.field_S = null;
              if (var12.field_rc) {
                break L11;
              } else {
                break L11;
              }
            }
            var14 = 16777215;
            var46 = var12.field_kc;
            var12.field_kc.field_Lb = 0;
            var46.field_zb = 0;
            var12.field_gc.field_S = null;
            var47 = var12.field_gc;
            var12.field_gc.field_Lb = 0;
            var12.field_Cc.field_S = null;
            var47.field_zb = 0;
            var48 = var12.field_Cc;
            var12.field_Cc.field_Lb = 0;
            var48.field_zb = 0;
            var12.field_qc.field_S = null;
            var18 = var12.field_qc;
            var12.field_qc.field_Lb = 0;
            var18.field_zb = 0;
            var12.field_zc.field_S = null;
            var12.field_zc.field_Lb = 0;
            var19 = var12.field_zc;
            var19.field_zb = 0;
            var12.field_Ic.field_S = null;
            var20 = var12.field_Ic;
            var12.field_Ic.field_Lb = 0;
            var20.field_zb = 0;
            var12.field_uc.field_S = null;
            var12.field_uc.field_Lb = 0;
            var21 = var12.field_uc;
            var21.field_zb = 0;
            var22_int = 0;
            L12: while (true) {
              if (be.field_a <= var22_int) {
                L13: {
                  var12.field_Fc.field_Pb = null;
                  var22 = var12.field_Fc;
                  var12.field_Fc.field_Lb = 0;
                  var12.field_tc.field_Pb = null;
                  var22.field_zb = 0;
                  var12.field_tc.field_Lb = 0;
                  var49 = var12.field_tc;
                  var12.field_Wb.field_Pb = null;
                  var49.field_zb = 0;
                  var24 = var12.field_Wb;
                  var12.field_Wb.field_Lb = 0;
                  var24.field_zb = 0;
                  var12.field_ac.field_Pb = null;
                  var12.field_ac.field_Lb = 0;
                  var25 = var12.field_ac;
                  var12.field_Lc.field_S = null;
                  var25.field_zb = 0;
                  var12.field_Lc.field_Lb = 0;
                  var26 = var12.field_Lc;
                  var26.field_zb = 0;
                  var12.field_Bc.field_S = null;
                  var27 = var12.field_Bc;
                  var12.field_Bc.field_Lb = 0;
                  var12.field_Dc.field_S = null;
                  var27.field_zb = 0;
                  var28 = var12.field_Dc;
                  var12.field_Dc.field_Lb = 0;
                  var12.field_lc.field_S = null;
                  var28.field_zb = 0;
                  var29 = var12.field_lc;
                  var12.field_lc.field_Lb = 0;
                  var29.field_zb = 0;
                  var12.field_xc.field_S = null;
                  var30 = var12.field_xc;
                  var12.field_xc.field_Lb = 0;
                  var30.field_zb = 0;
                  var12.field_zb = rn.field_y.field_Ub.field_zb;
                  var31 = 0;
                  var32 = var12.field_Xb;
                  if (!var12.k(4219)) {
                    L14: {
                      if (!var12.field_rc) {
                        L15: {
                          if (var12.field_cc) {
                            break L15;
                          } else {
                            if (var12.field_vc) {
                              break L15;
                            } else {
                              if (var12.field_nc) {
                                var12.field_kc.field_S = ua.field_L;
                                break L14;
                              } else {
                                var12.field_kc.field_S = mj.field_ac;
                                break L14;
                              }
                            }
                          }
                        }
                        var12.field_gc.field_S = rn.field_A;
                        break L14;
                      } else {
                        if (var12.field_Mc < 0) {
                          L16: {
                            if (!var12.field_dc) {
                              break L16;
                            } else {
                              L17: {
                                if (var12.field_cc) {
                                  break L17;
                                } else {
                                  if (!var12.field_vc) {
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              var12.field_gc.field_S = rn.field_A;
                              break L14;
                            }
                          }
                          if (var12.field_sc == 2) {
                            var12.field_gc.field_S = cl.field_e;
                            break L14;
                          } else {
                            var12.field_kc.field_S = nn.field_e;
                            break L14;
                          }
                        } else {
                          var12.field_kc.field_S = bd.field_e;
                          break L14;
                        }
                      }
                    }
                    L18: {
                      if (var12.field_gc.field_S == null) {
                        var12.field_kc.a(0, var31, db.field_b, 0, 68);
                        break L18;
                      } else {
                        var12.field_gc.a(0, var31, db.field_b, 0, 68);
                        break L18;
                      }
                    }
                    L19: {
                      var12.field_Cc.field_S = mi.a(var12.field_Cc.field_L, var32, 78);
                      var12.field_Cc.a(0, var31, db.field_b, 70, 78);
                      if (!var12.field_Cc.field_kb) {
                        break L19;
                      } else {
                        if (!var12.field_Cc.field_S.equals((Object) (Object) var32)) {
                          ll.field_i = var32;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      var12.field_qc.field_S = Integer.toString(var12.field_wc);
                      if (!var12.field_dc) {
                        var12.field_qc.field_Kb = 1;
                        var12.field_qc.a(0, var31, db.field_b, 150, 48);
                        break L20;
                      } else {
                        var12.field_qc.field_Kb = 2;
                        var12.field_zc.field_S = "/" + var12.field_Ub;
                        var33_int = (-var12.field_zc.field_L.c("/") + 348) / 2;
                        var12.field_qc.a(0, var31, db.field_b, 150, var33_int + -150);
                        var12.field_zc.a(0, var31, db.field_b, var33_int, -var33_int + 198);
                        break L20;
                      }
                    }
                    L21: {
                      var12.field_Ic.field_S = Integer.toString(var12.field_yc);
                      var12.field_Ic.a(0, var31, db.field_b, 200, 48);
                      if (rm.field_p) {
                        stackOut_66_0 = 250;
                        stackIn_67_0 = stackOut_66_0;
                        break L21;
                      } else {
                        stackOut_65_0 = 200;
                        stackIn_67_0 = stackOut_65_0;
                        break L21;
                      }
                    }
                    L22: {
                      var33_int = stackIn_67_0;
                      var12.field_uc.a(0, var31, db.field_b, var33_int, 365 + (-var33_int + -2));
                      var34_int = va.field_e;
                      if ((1 << ol.field_dc & var14) == 0) {
                        break L22;
                      } else {
                        var50_ref = hg.field_i[var12.field_Nc];
                        var12.field_Fc.field_Pb = var50_ref;
                        var12.field_Fc.a(0, 0, var12.field_uc.field_Lb, var34_int, var50_ref.field_z);
                        var34_int = var34_int + (va.field_e + var50_ref.field_z);
                        break L22;
                      }
                    }
                    L23: {
                      if ((1 << sn.field_b & var14) != 0) {
                        L24: {
                          L25: {
                            if (var12.field_cc) {
                              break L25;
                            } else {
                              if (!var12.field_vc) {
                                stackOut_75_0 = 0;
                                stackIn_76_0 = stackOut_75_0;
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                          stackOut_74_0 = 1;
                          stackIn_76_0 = stackOut_74_0;
                          break L24;
                        }
                        L26: {
                          var36 = stackIn_76_0;
                          stackOut_76_0 = jn.field_d;
                          stackIn_78_0 = stackOut_76_0;
                          stackIn_77_0 = stackOut_76_0;
                          if (var36 != 0) {
                            stackOut_78_0 = (wk[]) (Object) stackIn_78_0;
                            stackOut_78_1 = 1;
                            stackIn_79_0 = stackOut_78_0;
                            stackIn_79_1 = stackOut_78_1;
                            break L26;
                          } else {
                            stackOut_77_0 = (wk[]) (Object) stackIn_77_0;
                            stackOut_77_1 = 0;
                            stackIn_79_0 = stackOut_77_0;
                            stackIn_79_1 = stackOut_77_1;
                            break L26;
                          }
                        }
                        var51_ref = stackIn_79_0[stackIn_79_1];
                        var12.field_Wb.field_Pb = var51_ref;
                        var12.field_Wb.a(0, 0, var12.field_uc.field_Lb, var34_int, var51_ref.field_z);
                        var34_int = var34_int + (va.field_e + var51_ref.field_z);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L27: {
                      if ((1 << jf.field_Z & var14) != 0) {
                        var52_ref = bm.field_Z[-1 + var12.field_sc];
                        var12.field_ac.field_Pb = var52_ref;
                        var12.field_ac.a(0, 0, var12.field_uc.field_Lb, var34_int, var52_ref.field_z);
                        var34_int = var34_int + (va.field_e + var52_ref.field_z);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if ((1 << ja.field_f & var14) == 0) {
                        break L28;
                      } else {
                        L29: {
                          stackOut_84_0 = ha.field_Q;
                          stackIn_86_0 = stackOut_84_0;
                          stackIn_85_0 = stackOut_84_0;
                          if (var12.field_ec) {
                            stackOut_86_0 = (wk[]) (Object) stackIn_86_0;
                            stackOut_86_1 = 1;
                            stackIn_87_0 = stackOut_86_0;
                            stackIn_87_1 = stackOut_86_1;
                            break L29;
                          } else {
                            stackOut_85_0 = (wk[]) (Object) stackIn_85_0;
                            stackOut_85_1 = 0;
                            stackIn_87_0 = stackOut_85_0;
                            stackIn_87_1 = stackOut_85_1;
                            break L29;
                          }
                        }
                        var53_ref = stackIn_87_0[stackIn_87_1];
                        var12.field_tc.field_Pb = var53_ref;
                        var12.field_tc.a(0, 0, var12.field_uc.field_Lb, var34_int, var53_ref.field_z);
                        var34_int = var34_int + (var53_ref.field_z - -va.field_e);
                        break L28;
                      }
                    }
                    L30: {
                      if (li.field_D != null) {
                        var36 = 0;
                        L31: while (true) {
                          if (~var36 <= ~be.field_a) {
                            break L30;
                          } else {
                            L32: {
                              if (null == li.field_D[var36]) {
                                break L32;
                              } else {
                                if ((1 << var36 + ch.field_L & var14) != 0) {
                                  var42 = li.field_D[var36][var12.field_Sb[var36] & 255];
                                  var54 = var42;
                                  var12.field_Gc[var36].field_Pb = var42;
                                  var12.field_Gc[var36].a(0, 0, var12.field_uc.field_Lb, var34_int, var54.field_z);
                                  var34_int = var34_int + (var54.field_z + va.field_e);
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            var36++;
                            continue L31;
                          }
                        }
                      } else {
                        break L30;
                      }
                    }
                    L33: {
                      var36 = (-var34_int + var12.field_uc.field_zb) / 2;
                      if (var36 > 0) {
                        var12.field_Fc.field_Y = var12.field_Fc.field_Y + var36;
                        var12.field_Wb.field_Y = var12.field_Wb.field_Y + var36;
                        var12.field_ac.field_Y = var12.field_ac.field_Y + var36;
                        var12.field_tc.field_Y = var12.field_tc.field_Y + var36;
                        var37_int = 0;
                        L34: while (true) {
                          if (be.field_a <= var37_int) {
                            break L33;
                          } else {
                            var12.field_Gc[var37_int].field_Y = var12.field_Gc[var37_int].field_Y + var36;
                            var37_int++;
                            continue L34;
                          }
                        }
                      } else {
                        break L33;
                      }
                    }
                    L35: {
                      if (!var12.field_rc) {
                        break L35;
                      } else {
                        L36: {
                          var37_int = var12.field_Mc;
                          if (var37_int < 0) {
                            var37_int = (int)(-var12.field_Hc + var9);
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        var38_int = var37_int / 1000;
                        var39 = var38_int / 60;
                        var38_int = var38_int % 60;
                        if (var39 < 60) {
                          var12.field_Lc.field_S = var39 + ":" + var38_int / 10 + var38_int % 10;
                          break L35;
                        } else {
                          var40 = var39 / 60;
                          var39 = var39 % 60;
                          var12.field_Lc.field_S = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                          break L35;
                        }
                      }
                    }
                    L37: {
                      var12.field_Lc.a(0, var31, db.field_b, 365, -365 + var12.field_zb);
                      var31 = var31 + db.field_b;
                      if (null != var12.field_hc) {
                        var31 += 2;
                        var37 = new StringBuilder(64);
                        StringBuilder discarded$4 = var37.append(ph.field_a);
                        StringBuilder discarded$5 = var37.append(var12.field_hc[0]);
                        var38_int = 1;
                        L38: while (true) {
                          if (~var38_int <= ~var12.field_wc) {
                            var38 = var37.toString();
                            var12.field_Bc.field_S = var38;
                            var39 = var12.field_Bc.field_L.b(var38, -(2 * var12.field_Bc.field_ub) + var12.field_zb);
                            var12.field_Bc.a(0, var31, db.field_b * var39, 0, var12.field_zb);
                            var31 = var31 + db.field_b * var39;
                            break L37;
                          } else {
                            StringBuilder discarded$6 = var37.append(", ");
                            StringBuilder discarded$7 = var37.append(var12.field_hc[var38_int]);
                            var38_int++;
                            continue L38;
                          }
                        }
                      } else {
                        break L37;
                      }
                    }
                    L39: {
                      if (var12.field_vc) {
                        var12.field_Dc.field_S = db.a(de.field_a, -121, new String[1]);
                        var12.field_Dc.a(0, var31, db.field_b, da.field_g, var12.field_zb - da.field_g * 2);
                        var31 = var31 + db.field_b;
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    if (!var12.field_bc) {
                      break L13;
                    } else {
                      var12.field_lc.field_S = db.a(ej.field_x, -33, new String[1]);
                      var12.field_lc.a(0, var31, db.field_b, da.field_g, -(da.field_g * 2) + var12.field_zb);
                      var31 = var31 + db.field_b;
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L40: {
                  var33 = dh.a(var32, (byte) 112, var12.field_Ac);
                  if (var33 != null) {
                    var34_int = var12.field_xc.field_L.b(var33, -da.field_g + -da.field_g + var12.field_zb);
                    var12.field_xc.field_S = var33;
                    var12.field_xc.field_V = var12.field_mc * 256 / ta.field_l;
                    var12.field_xc.a(0, var31, db.field_b * var34_int, da.field_g, -(2 * da.field_g) + var12.field_zb);
                    var31 = var31 + var34_int * db.field_b;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if (var7_int != 0) {
                    break L41;
                  } else {
                    var12.field_lb = var31 - var12.field_Lb;
                    break L41;
                  }
                }
                L42: {
                  if (var13 != 0) {
                    rn.field_y.field_Ub.a(2, (byte) 111, (gh) var11, (gh) (Object) var12);
                    break L42;
                  } else {
                    break L42;
                  }
                }
                var34_int = 0;
                L43: while (true) {
                  if (var34_int >= be.field_a) {
                    L44: {
                      if (!var12.field_Fc.field_kb) {
                        break L44;
                      } else {
                        L45: {
                          if (1 == var12.field_Nc) {
                            var34 = na.field_r;
                            break L45;
                          } else {
                            var34 = m.field_j[var12.field_Nc];
                            break L45;
                          }
                        }
                        ll.field_i = bc.field_xb + " - " + var34;
                        break L44;
                      }
                    }
                    L46: {
                      if (!var12.field_tc.field_kb) {
                        break L46;
                      } else {
                        L47: {
                          if (var12.field_ec) {
                            stackOut_148_0 = he.field_g;
                            stackIn_149_0 = stackOut_148_0;
                            break L47;
                          } else {
                            stackOut_147_0 = i.field_b;
                            stackIn_149_0 = stackOut_147_0;
                            break L47;
                          }
                        }
                        ll.field_i = stackIn_149_0;
                        break L46;
                      }
                    }
                    L48: {
                      if (var12.field_Wb.field_kb) {
                        L49: {
                          L50: {
                            if (var12.field_cc) {
                              break L50;
                            } else {
                              if (var12.field_vc) {
                                break L50;
                              } else {
                                if (var12.field_dc) {
                                  stackOut_156_0 = fb.field_p;
                                  stackIn_158_0 = stackOut_156_0;
                                  break L49;
                                } else {
                                  stackOut_155_0 = jh.field_e;
                                  stackIn_158_0 = stackOut_155_0;
                                  break L49;
                                }
                              }
                            }
                          }
                          stackOut_157_0 = ij.field_V;
                          stackIn_158_0 = stackOut_157_0;
                          break L49;
                        }
                        ll.field_i = stackIn_158_0;
                        break L48;
                      } else {
                        break L48;
                      }
                    }
                    L51: {
                      if (var12.field_ac.field_kb) {
                        L52: {
                          if (2 == var12.field_sc) {
                            stackOut_163_0 = jf.field_db;
                            stackIn_164_0 = stackOut_163_0;
                            break L52;
                          } else {
                            stackOut_162_0 = hk.field_Yb;
                            stackIn_164_0 = stackOut_162_0;
                            break L52;
                          }
                        }
                        ll.field_i = stackIn_164_0;
                        break L51;
                      } else {
                        break L51;
                      }
                    }
                    L53: {
                      if (var12.field_Eb == 0) {
                        break L53;
                      } else {
                        if (!var12.k(4219)) {
                          if (0 != var12.field_gc.field_Eb) {
                            L54: {
                              if (!var12.field_rc) {
                                break L54;
                              } else {
                                L55: {
                                  if (!var12.field_dc) {
                                    break L55;
                                  } else {
                                    if (var12.field_cc) {
                                      break L54;
                                    } else {
                                      if (var12.field_vc) {
                                        break L54;
                                      } else {
                                        break L55;
                                      }
                                    }
                                  }
                                }
                                ei.a(var12.j(-33), (byte) -23, 11);
                                break L53;
                              }
                            }
                            jg.a(var12.j(-40), (byte) -74, 11);
                            break L53;
                          } else {
                            qa.a(var32, true, var12, 88);
                            break L53;
                          }
                        } else {
                          var12 = (hk) (Object) var8.a((byte) -123);
                          continue L1;
                        }
                      }
                    }
                    var12 = (hk) (Object) var8.a((byte) -123);
                    continue L1;
                  } else {
                    L56: {
                      if (!var12.field_Gc[var34_int].field_kb) {
                        break L56;
                      } else {
                        L57: {
                          if (fj.field_b == null) {
                            var35 = null;
                            break L57;
                          } else {
                            if (null != fj.field_b[var34_int]) {
                              var35 = (Object) (Object) fj.field_b[var34_int][255 & var12.field_Sb[var34_int]];
                              break L57;
                            } else {
                              var35 = null;
                              break L57;
                            }
                          }
                        }
                        if (var35 == null) {
                          ll.field_i = al.field_a[var34_int];
                          break L56;
                        } else {
                          ll.field_i = al.field_a[var34_int] + " - " + (String) var35;
                          break L56;
                        }
                      }
                    }
                    var34_int++;
                    continue L43;
                  }
                }
              } else {
                var12.field_Gc[var22_int].field_Pb = null;
                var23 = var12.field_Gc[var22_int];
                var12.field_Gc[var22_int].field_Lb = 0;
                var23.field_zb = 0;
                var22_int++;
                continue L12;
              }
            }
          }
        }
    }

    ca(byte[] param0) {
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        bj[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        bj var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        gi var38 = null;
        byte[] var39 = null;
        bj var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        bj var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        bj var48 = null;
        bj var49 = null;
        bj var50 = null;
        bj var51 = null;
        bj var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] var59 = null;
        byte[] var60 = null;
        byte[] var61 = null;
        byte[] var62 = null;
        byte[] var63 = null;
        byte[] var64 = null;
        byte[] var65 = null;
        byte[] var66 = null;
        byte[] var67 = null;
        byte[] var68 = null;
        byte[] var69 = null;
        byte[] var70 = null;
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        byte[] stackOut_39_0 = null;
        ((ca) this).field_p = new short[128];
        ((ca) this).field_q = new byte[128];
        ((ca) this).field_u = new bj[128];
        ((ca) this).field_v = new byte[128];
        ((ca) this).field_o = new byte[128];
        ((ca) this).field_s = new int[128];
        ((ca) this).field_x = new sk[128];
        var38 = new gi(param0);
        var3 = 0;
        L0: while (true) {
          if (var38.field_t[var38.field_p - -var3] == 0) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var38.field_p = var38.field_p + 1;
                var3++;
                var5 = var38.field_p;
                var38.field_p = var38.field_p + var3;
                var6 = 0;
                L2: while (true) {
                  if (0 == var38.field_t[var6 + var38.field_p]) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (~var6 >= ~var8) {
                        var38.field_p = var38.field_p + 1;
                        var6++;
                        var8 = var38.field_p;
                        var38.field_p = var38.field_p + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_t[var38.field_p - -var9] == 0) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (~var9 >= ~var11_int) {
                                L6: {
                                  var38.field_p = var38.field_p + 1;
                                  var9++;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if (var9 <= 1) {
                                    var12 = var9;
                                    break L6;
                                  } else {
                                    var65[1] = (byte) 1;
                                    var12 = 2;
                                    var13_int = 1;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (~var9 >= ~var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.f((byte) -106);
                                          if (var15_int != 0) {
                                            L9: {
                                              if (~var15_int < ~var13_int) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          } else {
                                            int incrementValue$9 = var12;
                                            var12++;
                                            var13_int = incrementValue$9;
                                            break L8;
                                          }
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var13 = new bj[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.f((byte) -63);
                                      if (var14 > 0) {
                                        stackOut_37_0 = new byte[var14 * 2];
                                        stackIn_38_0 = stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var70 = stackIn_38_0;
                                      var64 = var70;
                                      var58 = var64;
                                      var46 = var58;
                                      var15_array = var46;
                                      var14 = var38.f((byte) -60);
                                      if (0 >= var14) {
                                        stackOut_40_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = new byte[2 * var14];
                                        stackIn_41_0 = stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var47 = stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (var38.field_t[var38.field_p - -var17] == 0) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_p = var38.field_p + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (var20 >= 128) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (var23 >= 128) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (var24 >= 128) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (128 <= var25_int) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (var27 >= 128) {
                                                                        ((ca) this).field_t = var38.f((byte) -69) + 1;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var27 >= var70.length) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.d((byte) -2);
                                                                                    var27 += 2;
                                                                                    continue L24;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L25: {
                                                                              if (var16 == null) {
                                                                                break L25;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L26: while (true) {
                                                                                  if (~var47.length >= ~var27) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.d((byte) -2);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (~var12 >= ~var27) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var12 <= var27) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.f((byte) -90);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (~var70.length >= ~var27) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var70.length) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (var30 >= 128) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((ca) this).field_q[var30] = (byte)(32 + var28 * ((ca) this).field_q[var30] >> 6);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = (-var27 + var30) / 2 + (-var27 + var30) * var28;
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var30 <= var33) {
                                                                                                        var27 = var30;
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = ad.a(110, var32, -var27 + var30);
                                                                                                        ((ca) this).field_q[var33] = (byte)(32 + var34 * ((ca) this).field_q[var33] >> 6);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((ca) this).field_q[var29] = (byte)(32 + ((ca) this).field_q[var29] * var28 >> 6);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.f((byte) -55) + (1 + var19);
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 != null) {
                                                                                        var19 = var38.f((byte) -114);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (~var47.length >= ~var27) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << 1;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (~var29 <= ~var27) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (~var47.length >= ~var29) {
                                                                                                    var16 = null;
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if (128 <= var30) {
                                                                                                        var27 = 0;
                                                                                                        L40: while (true) {
                                                                                                          if (~var27 <= ~var12) {
                                                                                                            break L35;
                                                                                                          } else {
                                                                                                            var13[var27].field_i = var38.f((byte) -126);
                                                                                                            var27++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L41: {
                                                                                                          var31 = (255 & ((ca) this).field_o[var30]) - -var28;
                                                                                                          if (0 <= var31) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        L42: {
                                                                                                          if (128 >= var31) {
                                                                                                            break L42;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L42;
                                                                                                          }
                                                                                                        }
                                                                                                        ((ca) this).field_o[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[1 + var29] << 1;
                                                                                                    var32 = (var30 - var27) / 2 + (var30 + -var27) * var28;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L43: while (true) {
                                                                                                      if (~var37 <= ~var30) {
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        var28 = var31;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L44: {
                                                                                                          var34 = ad.a(121, var32, var30 - var27);
                                                                                                          var35 = (255 & ((ca) this).field_o[var37]) - -var34;
                                                                                                          if (var35 >= 0) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        L45: {
                                                                                                          if (var35 <= 128) {
                                                                                                            break L45;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L45;
                                                                                                          }
                                                                                                        }
                                                                                                        ((ca) this).field_o[var37] = (byte)var35;
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        var37++;
                                                                                                        continue L43;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L46: {
                                                                                                  var30 = var28 + (255 & ((ca) this).field_o[var29]);
                                                                                                  if (var30 >= 0) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                L47: {
                                                                                                  if (var30 <= 128) {
                                                                                                    break L47;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L47;
                                                                                                  }
                                                                                                }
                                                                                                ((ca) this).field_o[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var38.f((byte) -127) + (1 + var19);
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (~var27 <= ~var12) {
                                                                                            break L35;
                                                                                          } else {
                                                                                            var13[var27].field_i = var38.f((byte) -126);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L49: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        var27 = 0;
                                                                                        L50: while (true) {
                                                                                          if (~var12 >= ~var27) {
                                                                                            var27 = 0;
                                                                                            L51: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    return;
                                                                                                  } else {
                                                                                                    L53: {
                                                                                                      var52 = var13[var27];
                                                                                                      if (var52.field_o <= 0) {
                                                                                                        break L53;
                                                                                                      } else {
                                                                                                        var52.field_n = var38.f((byte) -61);
                                                                                                        break L53;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L52;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L54: {
                                                                                                  var51 = var13[var27];
                                                                                                  if (0 >= var51.field_q) {
                                                                                                    break L54;
                                                                                                  } else {
                                                                                                    var51.field_o = var38.f((byte) -81);
                                                                                                    break L54;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L51;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_q = var38.f((byte) -58);
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L55: {
                                                                                          var50 = var13[var27];
                                                                                          if (null == var50.field_m) {
                                                                                            break L55;
                                                                                          } else {
                                                                                            var50.field_k = var38.f((byte) -96);
                                                                                            break L55;
                                                                                          }
                                                                                        }
                                                                                        L56: {
                                                                                          if (null == var50.field_p) {
                                                                                            break L56;
                                                                                          } else {
                                                                                            var50.field_g = var38.f((byte) -99);
                                                                                            break L56;
                                                                                          }
                                                                                        }
                                                                                        L57: {
                                                                                          if (var50.field_i <= 0) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            var50.field_e = var38.f((byte) -76);
                                                                                            break L57;
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L49;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L58: {
                                                                                      var49 = var13[var27];
                                                                                      if (null == var49.field_m) {
                                                                                        break L58;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L59: while (true) {
                                                                                          if (var29 >= var49.field_m.length) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = var19 - (-1 + -var38.f((byte) -61));
                                                                                            var49.field_m[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L59;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L60: {
                                                                                  var48 = var13[var27];
                                                                                  if (null == var48.field_p) {
                                                                                    break L60;
                                                                                  } else {
                                                                                    var19 = 0;
                                                                                    var29 = 2;
                                                                                    L61: while (true) {
                                                                                      if (~var29 <= ~var48.field_p.length) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 1 + (var19 - -var38.f((byte) -90));
                                                                                        var48.field_p[var29] = (byte)var19;
                                                                                        var29 += 2;
                                                                                        continue L61;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L27;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L62: {
                                                                              var45 = var13[var27];
                                                                              if (null == var45.field_m) {
                                                                                break L62;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L63: while (true) {
                                                                                  if (~var29 <= ~var45.field_m.length) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var45.field_m[var29] = var38.d((byte) -2);
                                                                                    var29 += 2;
                                                                                    continue L63;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L64: {
                                                                              if (null == var45.field_p) {
                                                                                break L64;
                                                                              } else {
                                                                                var29 = 3;
                                                                                L65: while (true) {
                                                                                  if (~var29 <= ~(-2 + var45.field_p.length)) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var45.field_p[var29] = var38.d((byte) -2);
                                                                                    var29 += 2;
                                                                                    continue L65;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L66: {
                                                                          if (var20 != 0) {
                                                                            break L66;
                                                                          } else {
                                                                            L67: {
                                                                              if (var21 >= var66.length) {
                                                                                var20 = -1;
                                                                                break L67;
                                                                              } else {
                                                                                int incrementValue$10 = var21;
                                                                                var21++;
                                                                                var20 = var18[incrementValue$10];
                                                                                break L67;
                                                                              }
                                                                            }
                                                                            if (((ca) this).field_s[var27] <= 0) {
                                                                              break L66;
                                                                            } else {
                                                                              var26 = var38.f((byte) -74) + 1;
                                                                              break L66;
                                                                            }
                                                                          }
                                                                        }
                                                                        ((ca) this).field_q[var27] = (byte)var26;
                                                                        var20--;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L68: {
                                                                      if (0 == ((ca) this).field_s[var26]) {
                                                                        break L68;
                                                                      } else {
                                                                        L69: {
                                                                          if (var20 != 0) {
                                                                            break L69;
                                                                          } else {
                                                                            var25 = (Object) (Object) var13[var65[var21]];
                                                                            if (var21 < var69.length) {
                                                                              int incrementValue$11 = var21;
                                                                              var21++;
                                                                              var20 = var10[incrementValue$11];
                                                                              break L69;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L69;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((ca) this).field_u[var26] = (bj) var25;
                                                                        break L68;
                                                                      }
                                                                    }
                                                                    var26++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L70: {
                                                                  if (((ca) this).field_s[var25_int] == 0) {
                                                                    break L70;
                                                                  } else {
                                                                    L71: {
                                                                      if (var20 != 0) {
                                                                        break L71;
                                                                      } else {
                                                                        int incrementValue$12 = var8;
                                                                        var8++;
                                                                        var24 = 16 + var38.field_t[incrementValue$12] << 2;
                                                                        if (var21 >= var68.length) {
                                                                          var20 = -1;
                                                                          break L71;
                                                                        } else {
                                                                          int incrementValue$13 = var21;
                                                                          var21++;
                                                                          var20 = var7[incrementValue$13];
                                                                          break L71;
                                                                        }
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    ((ca) this).field_o[var25_int] = (byte)var24;
                                                                    break L70;
                                                                  }
                                                                }
                                                                var25_int++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L72: {
                                                              if (((ca) this).field_s[var24] == 0) {
                                                                break L72;
                                                              } else {
                                                                L73: {
                                                                  if (var20 != 0) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (~var21 <= ~var67.length) {
                                                                        var20 = -1;
                                                                        break L74;
                                                                      } else {
                                                                        int incrementValue$14 = var21;
                                                                        var21++;
                                                                        var20 = var4[incrementValue$14];
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    int incrementValue$15 = var5;
                                                                    var5++;
                                                                    var23 = var38.field_t[incrementValue$15] + -1;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var20--;
                                                                ((ca) this).field_v[var24] = (byte)var23;
                                                                break L72;
                                                              }
                                                            }
                                                            var24++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        L75: {
                                                          if (0 != var20) {
                                                            break L75;
                                                          } else {
                                                            L76: {
                                                              if (var21 < var66.length) {
                                                                int incrementValue$16 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$16];
                                                                break L76;
                                                              } else {
                                                                var20 = -1;
                                                                break L76;
                                                              }
                                                            }
                                                            var22 = var38.e(82);
                                                            break L75;
                                                          }
                                                        }
                                                        ((ca) this).field_p[var23] = (short)(((ca) this).field_p[var23] + ec.a(32768, -1 + var22 << 14));
                                                        ((ca) this).field_s[var23] = var22;
                                                        var20--;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.f((byte) -111);
                                                    ((ca) this).field_p[var20] = (short)(((ca) this).field_p[var20] + (var19 << 8));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.f((byte) -88);
                                                ((ca) this).field_p[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.d((byte) -2);
                                            var19++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        var17++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    L77: {
                                      bj dupTemp$17 = new bj();
                                      var13[var14] = dupTemp$17;
                                      var40 = dupTemp$17;
                                      var15 = var40;
                                      var16_int = var38.f((byte) -120);
                                      if (var16_int <= 0) {
                                        break L77;
                                      } else {
                                        var15.field_m = new byte[var16_int * 2];
                                        break L77;
                                      }
                                    }
                                    L78: {
                                      var16_int = var38.f((byte) -55);
                                      if (0 >= var16_int) {
                                        break L78;
                                      } else {
                                        var15.field_p = new byte[2 + var16_int * 2];
                                        var40.field_p[1] = (byte) 64;
                                        break L78;
                                      }
                                    }
                                    var14++;
                                    continue L10;
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.d((byte) -2);
                                var11_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        var7[var8] = var38.d((byte) -2);
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var4[var5] = var38.d((byte) -2);
                var5++;
                continue L1;
              }
            }
          } else {
            var3++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "You have not yet unlocked this option for use.";
    }
}

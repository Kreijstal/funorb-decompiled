/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class ra extends dj {
    private kq[] field_K;
    static sr field_H;
    static int[][][] field_F;
    private up[] field_M;
    private String[] field_E;
    private int field_J;
    private kp[] field_I;
    static int field_N;
    static String field_O;
    static ot field_L;
    static js field_G;

    final static void a(boolean param0, int param1, iw param2, qb param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        qb stackIn_3_0 = null;
        qb stackIn_4_0 = null;
        qb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        qb stackIn_6_0 = null;
        qb stackIn_7_0 = null;
        qb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        qb stackIn_9_0 = null;
        qb stackIn_10_0 = null;
        qb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        qb stackIn_12_0 = null;
        qb stackIn_13_0 = null;
        qb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        qb stackIn_15_0 = null;
        qb stackIn_16_0 = null;
        qb stackIn_17_0 = null;
        qb stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        qb stackIn_19_0 = null;
        qb stackIn_20_0 = null;
        qb stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        qb stackOut_2_0 = null;
        qb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        qb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        qb stackOut_5_0 = null;
        qb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        qb stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        qb stackOut_8_0 = null;
        qb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        qb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        qb stackOut_11_0 = null;
        qb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        qb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        qb stackOut_14_0 = null;
        qb stackOut_15_0 = null;
        qb stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qb stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        qb stackOut_18_0 = null;
        qb stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        qb stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          var9 = Kickabout.field_G;
          if (!param0) {
            break L0;
          } else {
            param3.field_gc = param2.h((byte) -119);
            break L0;
          }
        }
        L1: {
          param3.field_bc = param2.h((byte) -123);
          param3.field_Wb = param2.h((byte) -126);
          var4 = param2.h((byte) -109);
          stackOut_2_0 = (qb) param3;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (0 == (128 & var4)) {
            stackOut_4_0 = (qb) (Object) stackIn_4_0;
            stackOut_4_1 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = (qb) (Object) stackIn_3_0;
            stackOut_3_1 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        L2: {
          stackIn_5_0.field_yb = stackIn_5_1 != 0;
          stackOut_5_0 = (qb) param3;
          stackIn_7_0 = stackOut_5_0;
          stackIn_6_0 = stackOut_5_0;
          if (-1 == (var4 & 64 ^ -1)) {
            stackOut_7_0 = (qb) (Object) stackIn_7_0;
            stackOut_7_1 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L2;
          } else {
            stackOut_6_0 = (qb) (Object) stackIn_6_0;
            stackOut_6_1 = 1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            break L2;
          }
        }
        L3: {
          stackIn_8_0.field_Cb = stackIn_8_1 != 0;
          stackOut_8_0 = (qb) param3;
          stackIn_10_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if ((var4 & 16) != -1) {
            stackOut_10_0 = (qb) (Object) stackIn_10_0;
            stackOut_10_1 = 2;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L3;
          } else {
            stackOut_9_0 = (qb) (Object) stackIn_9_0;
            stackOut_9_1 = 1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            break L3;
          }
        }
        L4: {
          stackIn_11_0.field_Mb = stackIn_11_1;
          stackOut_11_0 = (qb) param3;
          stackIn_13_0 = stackOut_11_0;
          stackIn_12_0 = stackOut_11_0;
          if (-1 == (var4 & 32)) {
            stackOut_13_0 = (qb) (Object) stackIn_13_0;
            stackOut_13_1 = 0;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            break L4;
          } else {
            stackOut_12_0 = (qb) (Object) stackIn_12_0;
            stackOut_12_1 = 1;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            break L4;
          }
        }
        L5: {
          L6: {
            stackIn_14_0.field_Ub = stackIn_14_1 != 0;
            stackOut_14_0 = (qb) param3;
            stackIn_17_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (!param3.field_yb) {
              break L6;
            } else {
              stackOut_15_0 = (qb) (Object) stackIn_15_0;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (param3.field_bc <= param3.field_gc) {
                break L6;
              } else {
                stackOut_16_0 = (qb) (Object) stackIn_16_0;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L5;
              }
            }
          }
          stackOut_17_0 = (qb) (Object) stackIn_17_0;
          stackOut_17_1 = 0;
          stackIn_18_0 = stackOut_17_0;
          stackIn_18_1 = stackOut_17_1;
          break L5;
        }
        L7: {
          stackIn_18_0.field_Xb = stackIn_18_1 != 0;
          stackOut_18_0 = (qb) param3;
          stackIn_20_0 = stackOut_18_0;
          stackIn_19_0 = stackOut_18_0;
          if ((8 & var4) == -1) {
            stackOut_20_0 = (qb) (Object) stackIn_20_0;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L7;
          } else {
            stackOut_19_0 = (qb) (Object) stackIn_19_0;
            stackOut_19_1 = 1;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            break L7;
          }
        }
        L8: {
          stackIn_21_0.field_ic = stackIn_21_1 != 0;
          if (-1 == (4 & var4)) {
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            break L8;
          } else {
            stackOut_22_0 = 1;
            stackIn_24_0 = stackOut_22_0;
            break L8;
          }
        }
        L9: {
          var5 = stackIn_24_0;
          param2.a(param3.field_Eb, 0, (byte) -6, param3.field_Eb.length);
          if ((var4 & 2) == 0) {
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L9;
          } else {
            stackOut_25_0 = 1;
            stackIn_27_0 = stackOut_25_0;
            break L9;
          }
        }
        L10: {
          var6 = stackIn_27_0;
          param3.field_Ob = param2.a((byte) 81);
          param3.field_Fb = nj.a(-128) - (long)param2.k(4);
          if (var5 != 0) {
            param3.field_ac = param2.k(4);
            break L10;
          } else {
            param3.field_ac = -1;
            break L10;
          }
        }
        L11: {
          param3.field_Nb = param2.i((byte) -124);
          if (param1 >= 113) {
            break L11;
          } else {
            var10 = null;
            ra.a(true, -32, (iw) null, (qb) null);
            break L11;
          }
        }
        L12: {
          var7 = param2.field_n;
          param3.field_ec = param2.a(22);
          if (var6 == 0) {
            param3.field_Kb = null;
            break L12;
          } else {
            param3.field_Kb = new String[param3.field_gc];
            param2.field_n = var7;
            var8 = 0;
            L13: while (true) {
              if (var8 >= param3.field_gc) {
                break L12;
              } else {
                param3.field_Kb[var8] = param2.a(3);
                var8++;
                continue L13;
              }
            }
          }
        }
    }

    final static int[] a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = Kickabout.field_G;
        if (param3 != 0) {
            field_L = null;
        }
        int[] var7 = new int[]{param0, param4};
        int[] var8 = var7;
        int[] var5 = var8;
        if (-639 <= (param0 - -param2 ^ -1)) {
            // if_icmple L82
            var7[0] = 2;
        } else {
            var5[0] = -param2 + 638;
        }
        if (-479 > (param1 + param4 ^ -1)) {
            var5[1] = 478 + -param1;
        } else {
            if (!(param4 >= 2)) {
                var8[1] = 2;
            }
        }
        return var5;
    }

    final static void i(byte param0) {
        if (param0 >= -16) {
            int[] discarded$0 = ra.a(-54, 93, 33, 14, -70);
        }
        k.field_m = null;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        String var15_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        kp var22 = null;
        String var23 = null;
        String var24 = null;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_42_0 = 0;
        int[] stackIn_42_1 = null;
        int stackIn_43_0 = 0;
        int[] stackIn_43_1 = null;
        int stackIn_44_0 = 0;
        int[] stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        String[] stackIn_46_0 = null;
        int[] stackIn_46_1 = null;
        String[] stackIn_47_0 = null;
        int[] stackIn_47_1 = null;
        String[] stackIn_48_0 = null;
        int[] stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        String stackIn_50_0 = null;
        int[] stackIn_51_0 = null;
        int[] stackIn_52_0 = null;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        String[] stackIn_55_0 = null;
        int[] stackIn_55_1 = null;
        String[] stackIn_56_0 = null;
        int[] stackIn_56_1 = null;
        String[] stackIn_57_0 = null;
        int[] stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        String stackIn_59_0 = null;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_41_0 = 0;
        int[] stackOut_41_1 = null;
        int stackOut_43_0 = 0;
        int[] stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_42_0 = 0;
        int[] stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        String stackOut_49_0 = null;
        String[] stackOut_45_0 = null;
        int[] stackOut_45_1 = null;
        String[] stackOut_47_0 = null;
        int[] stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        String[] stackOut_46_0 = null;
        int[] stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        String stackOut_48_0 = null;
        int[] stackOut_50_0 = null;
        int[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        String stackOut_58_0 = null;
        String[] stackOut_54_0 = null;
        int[] stackOut_54_1 = null;
        String[] stackOut_56_0 = null;
        int[] stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        String[] stackOut_55_0 = null;
        int[] stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        String stackOut_57_0 = null;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        L0: {
          var25 = Kickabout.field_G;
          super.a(param0, param1);
          var3 = 40;
          var4 = 126;
          var5 = 265;
          var6 = 270;
          var7 = 20 + var4;
          var8 = 10;
          var9 = -var8 + var5 - var8;
          var10 = 16;
          if (-1 == (((ra) this).field_C ^ -1)) {
            var4 = 200;
            var6 = 230;
            var5 = 380;
            var9 = -var8 + (var5 + -var8);
            var10 = 16;
            var11 = -1;
            var12 = 0;
            L1: while (true) {
              if (-10 >= (var12 ^ -1)) {
                gd.a(-1, 178, ((ra) this).field_j + 45, (byte) -96, var11);
                var12 = 0;
                L2: while (true) {
                  if (var12 >= 9) {
                    on.a(40 + ((ra) this).field_j, 120, 560, 50, 10, 65793, 140);
                    int discarded$3 = pb.field_C.a(tr.field_c, ((ra) this).field_j - -70, 126, 500, 40, 16777215, -1, 0, 1, 16);
                    on.a(210 + ((ra) this).field_j, 178, 390, 225, 10, 65793, 140);
                    var12 = 0;
                    var13 = ((ra) this).field_j + 230;
                    var14 = var4;
                    L3: while (true) {
                      if (ml.field_s.length <= var12) {
                        break L0;
                      } else {
                        var15_ref_String = ml.field_s[var12];
                        var16 = pb.field_C.c(var15_ref_String, var9, var10);
                        if (var14 - -var16 <= var6 + var4) {
                          var14 = var14 + (var10 * pb.field_C.a(var15_ref_String, var13, var14, var9, 999, 16777215, -1, 0, 0, var10) + 20);
                          var12++;
                          continue L3;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    ((ra) this).field_K[var12].field_s = ((ra) this).field_j + 45 + var12 % 3 * 52;
                    ((ra) this).field_K[var12].b(0, false);
                    ((ra) this).field_K[var12].h((byte) -123);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                if (((ra) this).field_K[var12].field_gb) {
                  if (!((ra) this).field_K[var12].field_Eb.c(-2)) {
                    var11 = var12;
                    var12++;
                    continue L1;
                  } else {
                    var12++;
                    continue L1;
                  }
                } else {
                  var12++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (-2 != (((ra) this).field_C ^ -1)) {
            break L4;
          } else {
            on.a(40 + ((ra) this).field_j, 120, 560, 50, 10, 65793, 140);
            var6 -= 50;
            int discarded$4 = pb.field_C.a(jb.field_h, ((ra) this).field_j - -70, 126, 500, 40, 16777215, -1, 0, 1, 16);
            var4 += 50;
            var11 = 0;
            L5: while (true) {
              if ((var11 ^ -1) <= -3) {
                break L4;
              } else {
                L6: {
                  if (1 != var11) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L6;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L6;
                  }
                }
                L7: {
                  var12 = stackIn_23_0;
                  if (var12 != 0) {
                    stackOut_25_0 = -var5 + (640 - var3 - -var8);
                    stackIn_26_0 = stackOut_25_0;
                    break L7;
                  } else {
                    stackOut_24_0 = var8 + var3;
                    stackIn_26_0 = stackOut_24_0;
                    break L7;
                  }
                }
                var13 = stackIn_26_0;
                var13 = var13 + ((ra) this).field_j;
                on.a(-var8 + var13, var4, var5, var6, 10, 65793, 140);
                var14 = 40 + var7;
                var15 = 0;
                L8: while (true) {
                  if (tn.field_g[var11].length > var15) {
                    var26 = tn.field_g[var11][var15];
                    var14 = var14 + (15 - -(pb.field_C.a(var26, var13, var14, var9, 999, 16777215, -1, 0, 0, var10) * var10));
                    var15++;
                    continue L8;
                  } else {
                    var11++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
        L9: {
          if (-3 == (((ra) this).field_C ^ -1)) {
            on.a(40 + ((ra) this).field_j, 120, 560, 50, 10, 65793, 140);
            int discarded$5 = pb.field_C.a(ll.field_l, ((ra) this).field_j + 70, 126, 500, 40, 16777215, -1, 0, 1, 16);
            on.a(40 + ((ra) this).field_j, 178, 275, 225, 10, 65793, 140);
            var4 = 195;
            var11 = 0;
            var6 = 230;
            var12 = ((ra) this).field_j + 60;
            var13 = var4;
            L10: while (true) {
              L11: {
                if (var11 >= re.field_b.length) {
                  break L11;
                } else {
                  var14_ref_String = re.field_b[var11];
                  var15 = pb.field_C.c(var14_ref_String, var9, var10);
                  if (var15 + var13 > var4 - -var6) {
                    break L11;
                  } else {
                    var11++;
                    var13 = var13 + (20 + pb.field_C.a(var14_ref_String, var12, var13, var9, 999, 16777215, -1, 0, 0, var10) * var10);
                    continue L10;
                  }
                }
              }
              on.a(((ra) this).field_j - -325, 178, 275, 225, 10, 65793, 140);
              pt.a(((ra) this).field_j + 595, -22914, ((ra) this).field_j - -330, 398, 183);
              var14 = 7;
              var15 = 110;
              var16 = 40;
              var17 = (var15 << -566610559) / 3;
              var18 = var16 - -10;
              var19 = ((ra) this).field_J + (-(var17 << 601193249) + ((ra) this).field_j) - -462;
              var12 = var19;
              var20 = 290 + (-var18 + -25);
              var13 = var20;
              var21 = 0;
              L12: while (true) {
                if (var14 <= var21) {
                  ta.e(125);
                  break L9;
                } else {
                  L13: {
                    if (null == ((ra) this).field_I) {
                      break L13;
                    } else {
                      if (null == ((ra) this).field_I[var21]) {
                        break L13;
                      } else {
                        L14: {
                          var22 = ((ra) this).field_I[var21];
                          stackOut_41_0 = -1;
                          stackOut_41_1 = var22.field_c;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          if (var22.field_d) {
                            stackOut_43_0 = stackIn_43_0;
                            stackOut_43_1 = (int[]) (Object) stackIn_43_1;
                            stackOut_43_2 = 1;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            stackIn_44_2 = stackOut_43_2;
                            break L14;
                          } else {
                            stackOut_42_0 = stackIn_42_0;
                            stackOut_42_1 = (int[]) (Object) stackIn_42_1;
                            stackOut_42_2 = 0;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            stackIn_44_2 = stackOut_42_2;
                            break L14;
                          }
                        }
                        L15: {
                          if (stackIn_44_0 == stackIn_44_1[stackIn_44_2]) {
                            stackOut_49_0 = "";
                            stackIn_50_0 = stackOut_49_0;
                            break L15;
                          } else {
                            L16: {
                              stackOut_45_0 = ((ra) this).field_E;
                              stackOut_45_1 = var22.field_c;
                              stackIn_47_0 = stackOut_45_0;
                              stackIn_47_1 = stackOut_45_1;
                              stackIn_46_0 = stackOut_45_0;
                              stackIn_46_1 = stackOut_45_1;
                              if (!var22.field_d) {
                                stackOut_47_0 = (String[]) (Object) stackIn_47_0;
                                stackOut_47_1 = (int[]) (Object) stackIn_47_1;
                                stackOut_47_2 = 0;
                                stackIn_48_0 = stackOut_47_0;
                                stackIn_48_1 = stackOut_47_1;
                                stackIn_48_2 = stackOut_47_2;
                                break L16;
                              } else {
                                stackOut_46_0 = (String[]) (Object) stackIn_46_0;
                                stackOut_46_1 = (int[]) (Object) stackIn_46_1;
                                stackOut_46_2 = 1;
                                stackIn_48_0 = stackOut_46_0;
                                stackIn_48_1 = stackOut_46_1;
                                stackIn_48_2 = stackOut_46_2;
                                break L16;
                              }
                            }
                            stackOut_48_0 = stackIn_48_0[stackIn_48_1[stackIn_48_2]];
                            stackIn_50_0 = stackOut_48_0;
                            break L15;
                          }
                        }
                        L17: {
                          var23 = stackIn_50_0;
                          stackOut_50_0 = var22.field_c;
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_51_0 = stackOut_50_0;
                          if (!var22.field_d) {
                            stackOut_52_0 = (int[]) (Object) stackIn_52_0;
                            stackOut_52_1 = 1;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            break L17;
                          } else {
                            stackOut_51_0 = (int[]) (Object) stackIn_51_0;
                            stackOut_51_1 = 0;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_53_1 = stackOut_51_1;
                            break L17;
                          }
                        }
                        L18: {
                          if (stackIn_53_0[stackIn_53_1] == -1) {
                            stackOut_58_0 = "";
                            stackIn_59_0 = stackOut_58_0;
                            break L18;
                          } else {
                            L19: {
                              stackOut_54_0 = ((ra) this).field_E;
                              stackOut_54_1 = var22.field_c;
                              stackIn_56_0 = stackOut_54_0;
                              stackIn_56_1 = stackOut_54_1;
                              stackIn_55_0 = stackOut_54_0;
                              stackIn_55_1 = stackOut_54_1;
                              if (!var22.field_d) {
                                stackOut_56_0 = (String[]) (Object) stackIn_56_0;
                                stackOut_56_1 = (int[]) (Object) stackIn_56_1;
                                stackOut_56_2 = 1;
                                stackIn_57_0 = stackOut_56_0;
                                stackIn_57_1 = stackOut_56_1;
                                stackIn_57_2 = stackOut_56_2;
                                break L19;
                              } else {
                                stackOut_55_0 = (String[]) (Object) stackIn_55_0;
                                stackOut_55_1 = (int[]) (Object) stackIn_55_1;
                                stackOut_55_2 = 0;
                                stackIn_57_0 = stackOut_55_0;
                                stackIn_57_1 = stackOut_55_1;
                                stackIn_57_2 = stackOut_55_2;
                                break L19;
                              }
                            }
                            stackOut_57_0 = stackIn_57_0[stackIn_57_1[stackIn_57_2]];
                            stackIn_59_0 = stackOut_57_0;
                            break L18;
                          }
                        }
                        var24 = stackIn_59_0;
                        eo.a(var22, var23, var24, -(var15 >> 1663632609) + var12, var13 + -(var16 >> 1762643777), var15, var16);
                        on.e(-(var15 >> 1581379777) + var12, var13 + -(var16 >> 148950337), (var15 >> -1457503231) + var12, -(var16 >> 1391494849) + var13, 11184810, 128);
                        on.e(var12 + -(var15 >> 1677071201), (var16 >> 449720481) + var13, var12 - -(var15 >> -1095734239), var13 - -(var16 >> -1255871839), 11184810, 128);
                        on.e(var12 + -(var15 >> -950785151), -(var16 >> -1999930079) + (var13 - -1), -(var15 >> 368453185) + var12, -1 + ((var16 >> -1344775967) + var13), 11184810, 128);
                        on.e((var15 >> -708761311) + var12, var13 - -(var16 >> 1986262657) + -1, (var15 >> -410200383) + var12, 1 + (var13 + -(var16 >> 1949816577)), 11184810, 128);
                        on.e(-(var15 >> -2116250335) + var12 + 1, var13, -1 + (var15 >> -1668557663) + var12, var13, 11184810, 128);
                        on.e((var15 >> -859176063) + (var12 + -19), 1 + var13 - (var16 >> 1592140385), (var15 >> -1480971039) + var12 + -19, -1 + var13 - -(var16 >> -457248447), 11184810, 128);
                        break L13;
                      }
                    }
                  }
                  L20: {
                    if (var21 == -1 + var14) {
                      break L20;
                    } else {
                      L21: {
                        stackOut_61_0 = (var15 >> -511337695) + var12;
                        stackOut_61_1 = var13;
                        stackOut_61_2 = -(var15 >> -1043032479) + ((var17 << -1185834527) + var12);
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        stackIn_63_2 = stackOut_61_2;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        stackIn_62_2 = stackOut_61_2;
                        if (var21 % 2 == 0) {
                          stackOut_63_0 = stackIn_63_0;
                          stackOut_63_1 = stackIn_63_1;
                          stackOut_63_2 = stackIn_63_2;
                          stackOut_63_3 = var18 >> -1685263167;
                          stackIn_64_0 = stackOut_63_0;
                          stackIn_64_1 = stackOut_63_1;
                          stackIn_64_2 = stackOut_63_2;
                          stackIn_64_3 = stackOut_63_3;
                          break L21;
                        } else {
                          stackOut_62_0 = stackIn_62_0;
                          stackOut_62_1 = stackIn_62_1;
                          stackOut_62_2 = stackIn_62_2;
                          stackOut_62_3 = -(var18 >> 546752609);
                          stackIn_64_0 = stackOut_62_0;
                          stackIn_64_1 = stackOut_62_1;
                          stackIn_64_2 = stackOut_62_2;
                          stackIn_64_3 = stackOut_62_3;
                          break L21;
                        }
                      }
                      L22: {
                        on.b(stackIn_64_0, stackIn_64_1, stackIn_64_2, stackIn_64_3 + var13, 11184810);
                        stackOut_64_0 = var12 + (var15 >> -873390239);
                        stackOut_64_1 = 1 + var13;
                        stackOut_64_2 = var12 - (-(var17 << 959424129) - -(var15 >> -1325998015));
                        stackOut_64_3 = 1 + var13;
                        stackIn_66_0 = stackOut_64_0;
                        stackIn_66_1 = stackOut_64_1;
                        stackIn_66_2 = stackOut_64_2;
                        stackIn_66_3 = stackOut_64_3;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        stackIn_65_2 = stackOut_64_2;
                        stackIn_65_3 = stackOut_64_3;
                        if (-1 == (var21 % 2 ^ -1)) {
                          stackOut_66_0 = stackIn_66_0;
                          stackOut_66_1 = stackIn_66_1;
                          stackOut_66_2 = stackIn_66_2;
                          stackOut_66_3 = stackIn_66_3;
                          stackOut_66_4 = var18 >> -1676736159;
                          stackIn_67_0 = stackOut_66_0;
                          stackIn_67_1 = stackOut_66_1;
                          stackIn_67_2 = stackOut_66_2;
                          stackIn_67_3 = stackOut_66_3;
                          stackIn_67_4 = stackOut_66_4;
                          break L22;
                        } else {
                          stackOut_65_0 = stackIn_65_0;
                          stackOut_65_1 = stackIn_65_1;
                          stackOut_65_2 = stackIn_65_2;
                          stackOut_65_3 = stackIn_65_3;
                          stackOut_65_4 = -(var18 >> -21617023);
                          stackIn_67_0 = stackOut_65_0;
                          stackIn_67_1 = stackOut_65_1;
                          stackIn_67_2 = stackOut_65_2;
                          stackIn_67_3 = stackOut_65_3;
                          stackIn_67_4 = stackOut_65_4;
                          break L22;
                        }
                      }
                      on.b(stackIn_67_0, stackIn_67_1, stackIn_67_2, stackIn_67_3 - -stackIn_67_4, 11184810);
                      break L20;
                    }
                  }
                  L23: {
                    var13 = var13 + var18;
                    if (var21 == var14 + -8) {
                      break L23;
                    } else {
                      if (var21 == var14 - 4) {
                        break L23;
                      } else {
                        if (var21 == -2 + var14) {
                          break L23;
                        } else {
                          var21++;
                          continue L12;
                        }
                      }
                    }
                  }
                  var20 = var20 + (var18 >> -1879913247);
                  var19 = var19 + (var17 << -981742847);
                  var13 = var20;
                  var12 = var19;
                  var18 = var18 << 1;
                  var21++;
                  continue L12;
                }
              }
            }
          } else {
            break L9;
          }
        }
        L24: {
          if (3 == ((ra) this).field_C) {
            var11 = 0;
            L25: while (true) {
              if (2 <= var11) {
                break L24;
              } else {
                L26: {
                  if ((var11 ^ -1) != -2) {
                    stackOut_80_0 = 0;
                    stackIn_81_0 = stackOut_80_0;
                    break L26;
                  } else {
                    stackOut_79_0 = 1;
                    stackIn_81_0 = stackOut_79_0;
                    break L26;
                  }
                }
                L27: {
                  var12 = stackIn_81_0;
                  if (var12 != 0) {
                    stackOut_83_0 = var8 + (-var5 + 640 + -var3);
                    stackIn_84_0 = stackOut_83_0;
                    break L27;
                  } else {
                    stackOut_82_0 = var8 + var3;
                    stackIn_84_0 = stackOut_82_0;
                    break L27;
                  }
                }
                var13 = stackIn_84_0;
                var13 = var13 + ((ra) this).field_j;
                var14 = var7 + -5;
                on.a(var13 - var8, var4, var5, var6, 10, 65793, 140);
                var15 = 0;
                L28: while (true) {
                  if (va.field_y[var11].length <= var15) {
                    var11++;
                    continue L25;
                  } else {
                    var27 = va.field_y[var11][var15];
                    var14 = var14 + (pb.field_C.a(var27, var13, var14, var9, 999, 16777215, -1, 0, 0, var10) * var10 + 15);
                    var15++;
                    continue L28;
                  }
                }
              }
            }
          } else {
            break L24;
          }
        }
    }

    public static void g(int param0) {
        field_O = null;
        field_F = null;
        field_H = null;
        field_G = null;
        field_L = null;
        if (param0 != 128) {
            field_L = null;
        }
    }

    final void a(byte param0, boolean param1) {
        int var4_int = 0;
        double var4 = 0.0;
        int var6 = Kickabout.field_G;
        super.a((byte) 104, param1);
        int var3 = -118 / ((param0 - 38) / 60);
        if (((ra) this).field_C == 0) {
            for (var4_int = 0; 9 > var4_int; var4_int++) {
                ((ra) this).field_K[var4_int].b(0, param1);
                ((ra) this).field_K[var4_int].a(31, 11, (byte) 125, 16, ((ra) this).field_M[var4_int]);
            }
        }
        if ((((ra) this).field_C ^ -1) == -3) {
            var4 = (double)(nj.a(61) >> -1577102267);
            ((ra) this).field_J = (int)(Math.sin(var4 * 3.141592653589793 / 256.0) * 140.0);
        }
    }

    final void b(int param0) {
        int var3 = 0;
        int var4 = 0;
        up var5 = null;
        int var6 = Kickabout.field_G;
        Random var8 = new Random();
        for (var3 = 0; -10 < var3; var3++) {
            ((ra) this).field_M[var3] = new up();
            var4 = 0;
            if (!(-3 >= var3)) {
                var4 = 3;
            }
            if (!(5 >= var3)) {
                var4 = 1;
            }
            var5 = ((ra) this).field_M[var3];
            var5.field_r = 0;
            var5.field_n = 50;
            var5.field_g = 50;
            var5.field_q = var4;
            var5.field_o = 50;
            var5.field_l = dq.a((byte) -110, ce.field_G[var5.field_q].length, var8);
            var5.field_e = dq.a((byte) -92, td.field_a.length, var8);
            var5.field_j = var5.field_j | dq.a((byte) -62, 3, var8);
            var5.field_j = var5.field_j | dq.a((byte) 95, 3, var8) << 373289892;
            var5.field_j = var5.field_j | dq.a((byte) 91, 5, var8) << -1842280152;
            ((ra) this).field_K[var3] = new kq();
            ((ra) this).field_K[var3].field_s = 45 - -(var3 % 3 * 52);
            ((ra) this).field_K[var3].field_J = var3 / 3 * 75 + 178;
        }
        ((ra) this).field_E = new String[]{"Mod_Iain", "Mod_Thomas", "Mod_Shade", "Mod_Korpz", "Mod_Zeph", "Mod_Thor", "Mod_Wivlaro", "Mod_Crispy"};
        ((ra) this).field_I = new kp[7];
        int var7 = 0;
        var3 = var7;
        while (((ra) this).field_I.length > var7) {
            ((ra) this).field_I[var7] = new kp();
            ((ra) this).field_I[var7].field_f = 5;
            ((ra) this).field_I[var7].field_o = 0;
            var7++;
        }
        ((ra) this).field_I[0].field_c = new int[]{0, 1};
        ((ra) this).field_I[0].field_j = 2;
        ((ra) this).field_I[0].field_b = 1;
        ((ra) this).field_I[2].field_o = 1;
        ((ra) this).field_I[1].field_b = 0;
        if (param0 != -38) {
            return;
        }
        ((ra) this).field_I[1].field_c = new int[]{2, 3};
        ((ra) this).field_I[1].field_j = 3;
        ((ra) this).field_I[2].field_j = 0;
        ((ra) this).field_I[2].field_c = new int[]{5, 4};
        ((ra) this).field_I[2].field_b = 1;
        ((ra) this).field_I[3].field_b = 0;
        ((ra) this).field_I[3].field_c = new int[]{6, 7};
        ((ra) this).field_I[3].field_j = 5;
        ((ra) this).field_I[4].field_o = 1;
        ((ra) this).field_I[4].field_j = 2;
        ((ra) this).field_I[4].field_c = new int[]{2, 0};
        ((ra) this).field_I[4].field_b = 4;
        ((ra) this).field_I[5].field_j = 3;
        ((ra) this).field_I[5].field_c = new int[]{4, 6};
        ((ra) this).field_I[5].field_b = 1;
        ((ra) this).field_I[6].field_j = 1;
        ((ra) this).field_I[6].field_c = new int[]{0, 4};
        ((ra) this).field_I[6].field_b = 0;
    }

    ra() {
        ((ra) this).field_K = new kq[9];
        ((ra) this).field_M = new up[9];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[33][33][33];
        field_H = (sr) (Object) new en();
        field_N = 7;
        field_O = "Play free version";
    }
}

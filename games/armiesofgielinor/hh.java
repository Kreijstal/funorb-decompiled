/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String field_a;
    private em field_k;
    private int field_h;
    int field_b;
    static wk field_d;
    static String field_j;
    static nc field_i;
    static int field_c;
    static int[] field_e;
    private int field_g;
    static wk field_f;

    public static void b(int param0) {
        field_d = null;
        field_i = null;
        field_j = null;
        field_f = null;
        field_e = null;
        if (param0 != 16) {
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        vs.a(256, wn.field_jb);
        if (param0 < 113) {
            field_d = null;
        }
    }

    final void b(byte param0) {
        if (param0 != -66) {
            return;
        }
        if (!(((hh) this).field_k != null)) {
            ((hh) this).field_g = 127;
            return;
        }
        if (((hh) this).field_k.c(param0 ^ 65)) {
            ((hh) this).field_k.b(17);
        }
        int var2 = ((hh) this).field_k.field_a;
        int var3 = ((hh) this).field_k.field_f;
        var3 = var3 >> -1953891327;
        int var4 = var2 <= var3 ? 1 : 0;
        var2 = var4 != 0 ? var2 : -var3 + var2;
        int var5 = var4 == 0 ? ((hh) this).field_b : ((hh) this).field_h;
        int var6 = var4 == 0 ? ((hh) this).field_h : ((hh) this).field_b;
        ((hh) this).field_g = var5 - -(var2 * (-var5 + var6) / var3);
        if (((hh) this).field_g < ((hh) this).field_h) {
            ((hh) this).field_g = ((hh) this).field_h;
        }
        if (((hh) this).field_b < ((hh) this).field_g) {
            ((hh) this).field_g = ((hh) this).field_b;
        }
    }

    final static void a(int param0, int param1, um param2, boolean param3) {
        if (param0 != -16147) {
            return;
        }
        lk.field_e.a(256, !param3 ? true : false, param2, -1, param1, 1000000);
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        if (param3 < 0) {
            param3 = 100;
        }
        if (-1 >= (param0 ^ -1)) {
            // if_icmpge L31
        }
        param0 = 32;
        ((hh) this).field_k = new em(param3);
        if (param1 < 117) {
            return;
        }
        ((hh) this).field_h = param0;
        if (param2 >= 0) {
            // if_icmplt L77
            // if_icmplt L77
        } else {
            param2 = 224;
        }
        ((hh) this).field_b = param2;
        ((hh) this).field_g = ((hh) this).field_b + ((hh) this).field_h >> 1097606465;
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (0 != param2) {
          if (-2 == (param2 ^ -1)) {
            var10 = param0[param3];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param3 + param2;
            var5 = param1;
            var6_int = param3;
            L0: while (true) {
              if (var4 <= var6_int) {
                var6 = new StringBuilder(var5);
                var7 = param3;
                L1: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param0[var7];
                    if (var8 == null) {
                      StringBuilder discarded$2 = var6.append("null");
                      var7++;
                      continue L1;
                    } else {
                      StringBuilder discarded$3 = var6.append(var8);
                      var7++;
                      continue L1;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param0[var6_int];
                if (var7_ref_CharSequence != null) {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                } else {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return "";
        }
    }

    final static void a(au param0, boolean param1, vh param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        au stackIn_3_0 = null;
        au stackIn_4_0 = null;
        au stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        au stackIn_6_0 = null;
        au stackIn_7_0 = null;
        au stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        au stackIn_9_0 = null;
        au stackIn_10_0 = null;
        au stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        au stackIn_12_0 = null;
        au stackIn_13_0 = null;
        au stackIn_14_0 = null;
        au stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        au stackIn_16_0 = null;
        au stackIn_17_0 = null;
        au stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        au stackIn_19_0 = null;
        au stackIn_20_0 = null;
        au stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        au stackOut_2_0 = null;
        au stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        au stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        au stackOut_5_0 = null;
        au stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        au stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        au stackOut_8_0 = null;
        au stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        au stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        au stackOut_11_0 = null;
        au stackOut_12_0 = null;
        au stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        au stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        au stackOut_15_0 = null;
        au stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        au stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        au stackOut_18_0 = null;
        au stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        au stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            param0.field_Ub = param2.k(0);
            break L0;
          }
        }
        L1: {
          param0.field_nc = param2.k(0);
          param0.field_Tb = param2.k(0);
          var4 = param2.k(0);
          stackOut_2_0 = (au) param0;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (0 == (128 & var4)) {
            stackOut_4_0 = (au) (Object) stackIn_4_0;
            stackOut_4_1 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = (au) (Object) stackIn_3_0;
            stackOut_3_1 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        L2: {
          ((au) (Object) stackIn_5_0).field_uc = stackIn_5_1 != 0;
          stackOut_5_0 = (au) param0;
          stackIn_7_0 = stackOut_5_0;
          stackIn_6_0 = stackOut_5_0;
          if (-1 == (var4 & 64 ^ -1)) {
            stackOut_7_0 = (au) (Object) stackIn_7_0;
            stackOut_7_1 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L2;
          } else {
            stackOut_6_0 = (au) (Object) stackIn_6_0;
            stackOut_6_1 = 1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            break L2;
          }
        }
        L3: {
          ((au) (Object) stackIn_8_0).field_kc = stackIn_8_1 != 0;
          stackOut_8_0 = (au) param0;
          stackIn_10_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if ((16 & var4) != 0) {
            stackOut_10_0 = (au) (Object) stackIn_10_0;
            stackOut_10_1 = 2;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L3;
          } else {
            stackOut_9_0 = (au) (Object) stackIn_9_0;
            stackOut_9_1 = 1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            break L3;
          }
        }
        L4: {
          L5: {
            ((au) (Object) stackIn_11_0).field_ac = stackIn_11_1;
            stackOut_11_0 = (au) param0;
            stackIn_14_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (!param0.field_uc) {
              break L5;
            } else {
              stackOut_12_0 = (au) (Object) stackIn_12_0;
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (param0.field_Ub >= param0.field_nc) {
                break L5;
              } else {
                stackOut_13_0 = (au) (Object) stackIn_13_0;
                stackOut_13_1 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                break L4;
              }
            }
          }
          stackOut_14_0 = (au) (Object) stackIn_14_0;
          stackOut_14_1 = 0;
          stackIn_15_0 = stackOut_14_0;
          stackIn_15_1 = stackOut_14_1;
          break L4;
        }
        L6: {
          ((au) (Object) stackIn_15_0).field_Sb = stackIn_15_1 != 0;
          stackOut_15_0 = (au) param0;
          stackIn_17_0 = stackOut_15_0;
          stackIn_16_0 = stackOut_15_0;
          if (0 == (8 & var4)) {
            stackOut_17_0 = (au) (Object) stackIn_17_0;
            stackOut_17_1 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L6;
          } else {
            stackOut_16_0 = (au) (Object) stackIn_16_0;
            stackOut_16_1 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            break L6;
          }
        }
        L7: {
          ((au) (Object) stackIn_18_0).field_tc = stackIn_18_1 != 0;
          stackOut_18_0 = (au) param0;
          stackIn_20_0 = stackOut_18_0;
          stackIn_19_0 = stackOut_18_0;
          if (-1 == (32 & var4 ^ -1)) {
            stackOut_20_0 = (au) (Object) stackIn_20_0;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L7;
          } else {
            stackOut_19_0 = (au) (Object) stackIn_19_0;
            stackOut_19_1 = 1;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            break L7;
          }
        }
        L8: {
          ((au) (Object) stackIn_21_0).field_vc = stackIn_21_1 != 0;
          if (0 == (var4 & 4)) {
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
          param2.a(0, param0.field_pc.length, 0, param0.field_pc);
          param0.field_qc = param2.e((byte) -104);
          param0.field_Mb = vi.b(39) - (long)param2.i(1);
          if (var5 == 0) {
            param0.field_bc = -1;
            break L10;
          } else {
            param0.field_bc = param2.i(1);
            break L10;
          }
        }
        param0.field_dc = param2.j((byte) -2);
        var7 = param2.field_q;
        if (param3 >= 73) {
          L11: {
            param0.field_rc = param2.g(1);
            if (var6 != 0) {
              param0.field_jc = new String[param0.field_Ub];
              param2.field_q = var7;
              var8 = 0;
              L12: while (true) {
                if (var8 >= param0.field_Ub) {
                  break L11;
                } else {
                  param0.field_jc[var8] = param2.g(1);
                  var8++;
                  continue L12;
                }
              }
            } else {
              param0.field_jc = null;
              break L11;
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 > -121) {
            int discarded$0 = ((hh) this).c(103);
        }
        return ((hh) this).field_k.field_a <= ((hh) this).field_k.field_f >> -586726463 ? true : false;
    }

    final int c(int param0) {
        if (param0 != -1953891327) {
            return 4;
        }
        if (((hh) this).field_g >= 0) {
            // if_icmpgt L30
        } else {
            return 127;
        }
        return ((hh) this).field_g;
    }

    hh(int param0, int param1, int param2) {
        this.a(param0, (byte) 127, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You have 1 unread message!";
        field_j = "Confirm Email:";
        field_e = new int[]{0, 1, 2, 4, 8, 31, 16, 0, 0};
        field_c = 0;
    }
}

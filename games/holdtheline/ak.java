/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static String[] field_d;
    static String field_a;
    static sa field_b;
    static int field_c;

    final static hj a(int param0, boolean param1, int param2) {
        hj stackIn_10_0 = null;
        hj stackIn_15_0 = null;
        hj stackIn_21_0 = null;
        hj stackIn_31_0 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (param0 > -24) {
          ak.a(124);
        }
        if (param2 == -1) {
          if (null == vm.field_vb) {
            vm.field_vb = dl.a(wj.field_n, "basic", false, "unachieved");
            hi.field_N = new hj(32, 32);
            vb.a(-79, hi.field_N);
            vm.field_vb.c(0, 0, 32, 32);
            ug.b(-1);
          }
          if (!param1) {
            stackIn_10_0 = vm.field_vb;
          } else {
            stackIn_10_0 = hi.field_N;
          }
          return stackIn_10_0;
        }
        if (null != cd.field_a) {
          if (param1) {
            stackIn_15_0 = nl.field_h[param2];
          } else {
            stackIn_15_0 = cd.field_a[param2];
          }
          return stackIn_15_0;
        }
        if (!fb.field_i.b("achievements_128", 89)) {
          if (param1) {
            stackIn_21_0 = hi.a(32, (byte) -106, 32);
          } else {
            stackIn_21_0 = ra.field_hb;
          }
          return stackIn_21_0;
        }
        cd.field_a = si.a(fb.field_i, 33, "achievements_128", "");
        nl.field_h = new hj[cd.field_a.length];
        ok.a(32381);
        var3 = 0;
        do {
          if (!(var3 < cd.field_a.length)) {
            ug.b(-1);
            break;
          }
          nl.field_h[var3] = new hj(32, 32);
          nl.field_h[var3].f();
          cd.field_a[var3].c(0, 0, 32, 32);
          var3++;
        } while (var4 == 0);
        if (param1) {
          stackIn_31_0 = nl.field_h[param2];
        } else {
          stackIn_31_0 = cd.field_a[param2];
        }
        return stackIn_31_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_d = null;
    }

    final static hj[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int var9 = 0;
        hj[] var10 = null;
        hj[] var11_ref_hj__ = null;
        int var11 = 0;
        int var12 = 0;
        hj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = HoldTheLine.field_D;
        var9 = param8 + (param5 + param2);
        var10 = new hj[]{new hj(var9, var9), new hj(param7, var9), new hj(var9, var9), new hj(var9, param7), new hj(64, 64), new hj(var9, param7), new hj(var9, var9), new hj(param7, var9), new hj(var9, var9)};
        var11_ref_hj__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 < var11_ref_hj__.length) {
            var13 = var11_ref_hj__[var12];
            stackIn_11_0 = 0;
            if (var15 != 0) {
              break L0;
            }
            var14 = stackIn_11_0;
            while (var14 < var13.field_z.length) {
              var13.field_z[var14] = param0;
              var14++;
            }
            var12++;
            continue L0;
          }
          stackIn_11_0 = 0;
          break;
        }
        var11 = stackIn_11_0;
        L6: while (true) {
          if (param5 > var11) {
            stackIn_22_0 = 0;
            if (var15 != 0) {
              break L6;
            }
            var12Lifetime1 = stackIn_22_0;
            while (var9 > var12Lifetime1) {
              var10[6].field_z[var9 * (-var11 + var9 - 1) + var12Lifetime1] = param1;
              var10[8].field_z[var12Lifetime1 + var9 * (-1 + (-var11 + var9))] = param1;
              var10[2].field_z[-var11 - (-var9 + (1 - var12Lifetime1 * var9))] = param1;
              var10[8].field_z[var9 * var12Lifetime1 + (-1 + var9) - var11] = param1;
              var12Lifetime1++;
            }
            var11++;
            continue L6;
          }
          stackIn_22_0 = 0;
          break;
        }
        var11Lifetime1 = stackIn_22_0;
        while (true) {
          stackIn_24_0 = param5;
          stackIn_24_1 = var11Lifetime1;
          if (stackIn_24_0 > stackIn_24_1) {
            stackIn_35_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_35_0;
              while (var9 > var12Lifetime2) {
                var10[0].field_z[var11Lifetime1 * var9 + var12Lifetime2] = param3;
                var10[0].field_z[var11Lifetime1 + var9 * var12Lifetime2] = param3;
                stackIn_24_0 = -var11Lifetime1 + var9;
                stackIn_24_1 = var12Lifetime2;
                if (stackIn_24_0 > stackIn_24_1) {
                  var10[2].field_z[var11Lifetime1 * var9 + var12Lifetime2] = param3;
                  var10[6].field_z[var12Lifetime2 * var9 + var11Lifetime1] = param3;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            stackIn_35_0 = param6;
          }
          var11Lifetime1 = stackIn_35_0;
          L19: while (true) {
            if (var11Lifetime1 < param7) {
              stackIn_46_0 = 0;
              if (var15 != 0) {
                break L19;
              }
              var12Lifetime2Lifetime1 = stackIn_46_0;
              while (param5 > var12Lifetime2Lifetime1) {
                var10[7].field_z[var11Lifetime1 + (var9 + (-var12Lifetime2Lifetime1 - 1)) * param7] = param1;
                var10[5].field_z[var9 * var11Lifetime1 - (1 - var9 + var12Lifetime2Lifetime1)] = param1;
                var10[1].field_z[var11Lifetime1 + var12Lifetime2Lifetime1 * param7] = param3;
                var10[3].field_z[var12Lifetime2Lifetime1 + var11Lifetime1 * var9] = param3;
                var12Lifetime2Lifetime1++;
              }
              var11Lifetime1++;
              continue L19;
            }
            stackIn_46_0 = 0;
            break;
          }
          var11Lifetime1 = stackIn_46_0;
          L25: while (var11Lifetime1 < param7 >> 1) {
            var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (var12Lifetime2Lifetime2 < param8) {
                var10[1].field_z[var11Lifetime1 + (var9 - (var12Lifetime2Lifetime2 + 1)) * param7] = param4;
                var10[3].field_z[var11Lifetime1 * var9 + var9 - 1 - var12Lifetime2Lifetime2] = param4;
                var10[7].field_z[param7 * var12Lifetime2Lifetime2 + var11Lifetime1] = param4;
                var10[5].field_z[var12Lifetime2Lifetime2 + var11Lifetime1 * var9] = param4;
                var12Lifetime2Lifetime2++;
                if (var15 == 0) {
                  continue;
                }
              } else {
                var11Lifetime1++;
              }
              break;
            }
            if (var15 == 0) {
              continue L25;
            }
            break;
          }
          return var10;
        }
    }

    static {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_c = -1;
    }
}

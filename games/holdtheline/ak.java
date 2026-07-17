/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static String[] field_d;
    static String field_a;
    static sa field_b;
    static int field_c;

    final static hj a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        if (param0 > -24) {
            ak.a(124);
        }
        if (!(param2 != -1)) {
            if (!(null != vm.field_vb)) {
                vm.field_vb = dl.a(wj.field_n, "basic", false, "unachieved");
                hi.field_N = new hj(32, 32);
                vb.a(-79, hi.field_N);
                vm.field_vb.c(0, 0, 32, 32);
                ug.b(-1);
            }
            return param1 ? hi.field_N : vm.field_vb;
        }
        if (null == cd.field_a) {
            if (!(fb.field_i.b("achievements_128", 89))) {
                return !param1 ? ra.field_hb : hi.a(32, (byte) -106, 32);
            }
            cd.field_a = si.a(fb.field_i, 33, "achievements_128", "");
            nl.field_h = new hj[cd.field_a.length];
            int discarded$0 = 32381;
            ok.a();
            for (var3 = 0; var3 < cd.field_a.length; var3++) {
                nl.field_h[var3] = new hj(32, 32);
                nl.field_h[var3].f();
                cd.field_a[var3].c(0, 0, 32, 32);
            }
            ug.b(-1);
        }
        return !param1 ? cd.field_a[param2] : nl.field_h[param2];
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
    }

    final static hj[] a() {
        int var9 = 0;
        hj[] var10 = null;
        hj[] var11_ref_hj__ = null;
        int var11 = 0;
        int var12 = 0;
        hj var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = HoldTheLine.field_D;
        var9 = 3;
        var10 = new hj[]{new hj(var9, var9), new hj(3, var9), new hj(var9, var9), new hj(var9, 3), new hj(64, 64), new hj(var9, 3), new hj(var9, var9), new hj(3, var9), new hj(var9, var9)};
        var11_ref_hj__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_hj__.length) {
            var11 = 0;
            L1: while (true) {
              if (1 <= var11) {
                var11 = 0;
                L2: while (true) {
                  if (1 <= var11) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 < 1) {
                                var10[1].field_z[var11 + (var9 - (var12 + 1)) * 3] = 65793;
                                var10[3].field_z[var11 * var9 + var9 - 1 + -var12] = 65793;
                                var10[7].field_z[3 * var12 - -var11] = 65793;
                                var10[5].field_z[var12 + var11 * var9] = 65793;
                                var12++;
                                continue L5;
                              } else {
                                var11++;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (1 > var12) {
                            var10[7].field_z[var11 + (var9 + (-var12 + -1)) * 3] = 0;
                            var10[5].field_z[var9 * var11 - (1 + -var9 - -var12)] = 0;
                            var10[1].field_z[var11 + var12 * 3] = 0;
                            var10[3].field_z[var12 + var11 * var9] = 0;
                            var12++;
                            continue L6;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_z[var11 * var9 + var12] = 0;
                        var10[0].field_z[var11 + var9 * var12] = 0;
                        if (-var11 + var9 > var12) {
                          var10[2].field_z[var11 * var9 + var12] = 0;
                          var10[6].field_z[var12 * var9 - -var11] = 0;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_z[var9 * (-var11 + var9 + -1) - -var12] = 0;
                    var10[8].field_z[var12 + var9 * (-1 + (-var11 + var9))] = 0;
                    var10[2].field_z[-var11 - (-var9 + (1 - var12 * var9))] = 0;
                    var10[8].field_z[var9 * var12 + (-1 + var9) + -var11] = 0;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_hj__[var12];
            var14 = 0;
            L9: while (true) {
              if (var14 >= var13.field_z.length) {
                var12++;
                continue L0;
              } else {
                var13.field_z[var14] = 0;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_c = -1;
    }
}

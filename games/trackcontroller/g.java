/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class g extends gb {
    int field_t;
    static int[] field_u;
    static int field_p;
    static oa field_x;
    int field_v;
    static int field_y;
    int field_q;
    int field_o;
    int field_r;
    static ti field_w;
    int field_s;

    final static int g() {
        if (!re.field_k) {
            if (fe.field_L >= bc.field_o) {
                if (!(bc.field_o + cl.field_a <= fe.field_L)) {
                    return field_y;
                }
            }
        }
        return -1;
    }

    final static void f() {
        int var1 = 0;
        if (32 >= qd.field_d) {
            da.a(0, (byte) -74);
        } else {
            var1 = qd.field_d % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            da.a(-var1 + qd.field_d, (byte) -74);
        }
        var1 = 67;
    }

    final static qj[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        qj[] var10 = null;
        qj[] var11_ref_qj__ = null;
        int var11 = 0;
        int var12 = 0;
        qj var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = TrackController.field_F ? 1 : 0;
        var9 = 3;
        var10 = new qj[]{new qj(var9, var9), new qj(3, var9), new qj(var9, var9), new qj(var9, 3), new qj(64, 64), new qj(var9, 3), new qj(var9, var9), new qj(3, var9), new qj(var9, var9)};
        var11_ref_qj__ = var10;
        var12 = 0;
        L0: while (true) {
          if (~var12 <= ~var11_ref_qj__.length) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
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
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_z[(-var12 + var9 - 1) * 3 - -var11] = 65793;
                                var10[3].field_z[var9 * var11 - (1 + -var9) + -var12] = 65793;
                                var10[7].field_z[var11 + 3 * var12] = 65793;
                                var10[5].field_z[var9 * var11 - -var12] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 >= 1) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_z[var11 + (-1 + -var12 + var9) * 3] = 0;
                            var10[5].field_z[-1 - -var9 - (var12 - var9 * var11)] = 0;
                            var10[1].field_z[var12 * 3 + var11] = 0;
                            var10[3].field_z[var9 * var11 + var12] = 0;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (~var9 >= ~var12) {
                        var11++;
                        continue L2;
                      } else {
                        L8: {
                          var10[0].field_z[var12 - -(var11 * var9)] = 0;
                          var10[0].field_z[var12 * var9 - -var11] = 0;
                          if (var12 >= -var11 + var9) {
                            break L8;
                          } else {
                            var10[2].field_z[var12 - -(var11 * var9)] = 0;
                            var10[6].field_z[var9 * var12 - -var11] = 0;
                            break L8;
                          }
                        }
                        var12++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_z[(-1 + -var11 + var9) * var9 - -var12] = 0;
                    var10[8].field_z[(-1 + var9 + -var11) * var9 + var12] = 0;
                    var10[2].field_z[var12 * var9 - var11 - (1 + -var9)] = 0;
                    var10[8].field_z[var9 + (-1 - var11 + var9 * var12)] = 0;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_qj__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_z.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_z[var14] = 0;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_w = null;
        field_u = null;
        field_x = null;
    }

    g() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_y = -1;
        field_w = null;
    }
}

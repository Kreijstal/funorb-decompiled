/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra {
    static volatile int field_d;
    static java.util.zip.CRC32 field_h;
    static int field_a;
    static ak field_e;
    static int field_g;
    static String field_f;
    static int field_c;
    static ei field_b;

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        field_f = null;
        field_h = null;
    }

    final static tf[] a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        int var9 = 0;
        tf[] var10 = null;
        tf[] var11_ref_tf__ = null;
        int var11 = 0;
        int var12 = 0;
        tf var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Pixelate.field_H ? 1 : 0;
        var9 = 3;
        var10 = new tf[]{new tf(var9, var9), new tf(3, var9), new tf(var9, var9), new tf(var9, 3), new tf(64, 64), new tf(var9, 3), new tf(var9, var9), new tf(3, var9), new tf(var9, var9)};
        var11_ref_tf__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_tf__.length) {
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
                                var10[1].field_G[var11 + 3 * (-1 + (-var12 + var9))] = 65793;
                                var10[3].field_G[var9 * var11 - (1 + -var9 - -var12)] = 65793;
                                var10[7].field_G[var11 + 3 * var12] = 65793;
                                var10[5].field_G[var11 * var9 - -var12] = 65793;
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
                            var10[7].field_G[3 * (-var12 + (var9 + -1)) + var11] = 0;
                            var10[5].field_G[-var12 - (-var9 - (-1 + var9 * var11))] = 0;
                            var10[1].field_G[var11 + 3 * var12] = 0;
                            var10[3].field_G[var11 * var9 - -var12] = 0;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var12 < var9) {
                        var10[0].field_G[var9 * var11 + var12] = 0;
                        var10[0].field_G[var11 + var9 * var12] = 0;
                        if (var9 - var11 > var12) {
                          var10[2].field_G[var11 * var9 + var12] = 0;
                          var10[6].field_G[var11 + var12 * var9] = 0;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_G[var12 + var9 * (-1 + -var11 + var9)] = 0;
                    var10[8].field_G[(var9 - var11 + -1) * var9 - -var12] = 0;
                    var10[2].field_G[var12 * var9 - (-var9 + 1) - var11] = 0;
                    var10[8].field_G[-var11 - -var9 + -1 + var12 * var9] = 0;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_tf__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_G.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_G[var14] = 0;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= -79) {
            return false;
        }
        return qp.a(true, fp.field_e, fp.field_d);
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        if (!(un.field_l)) {
            return;
        }
        bn.field_I.a(-28476, param2);
        int var4 = bo.field_h.m(14685) ? 1 : 0;
        if (nm.field_c != 0) {
            if (var4 == 0) {
                po.a(true);
                param2 = false;
            }
        }
        if (!(!param2)) {
            bo.field_h.b(15, -1, 13);
        }
        if (var4 != 0) {
            bn.field_I.a(-28476, param2);
        }
        int var5 = bo.field_h.k(-16200) + bo.field_h.field_tb;
        if (var5 > 640) {
            di.field_a = di.field_a + 5;
        } else {
            if (635 > var5) {
                if (0 < di.field_a) {
                    di.field_a = di.field_a - 5;
                }
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_f = "Return to lobby";
        field_h = new java.util.zip.CRC32();
    }
}

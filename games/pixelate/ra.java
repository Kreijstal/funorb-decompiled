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
        if (param0) {
            field_b = null;
        }
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
        var9 = param1 + param0 + param8;
        var10 = new tf[]{new tf(var9, var9), new tf(param4, var9), new tf(var9, var9), new tf(var9, param4), new tf(64, 64), new tf(var9, param4), new tf(var9, var9), new tf(param4, var9), new tf(var9, var9)};
        var11_ref_tf__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_tf__.length) {
            L1: {
              if (param5 > 104) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            var11 = 0;
            L2: while (true) {
              if (param8 <= var11) {
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param8) {
                    var11 = 0;
                    L4: while (true) {
                      if (param4 <= var11) {
                        var11 = 0;
                        L5: while (true) {
                          if (param4 >> 800796033 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 >= param1) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_G[var11 + param4 * (-1 + (-var12 + var9))] = param7;
                                var10[3].field_G[var9 * var11 - (1 + -var9 - -var12)] = param7;
                                var10[7].field_G[var11 + param4 * var12] = param7;
                                var10[5].field_G[var11 * var9 - -var12] = param7;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 >= param8) {
                            var11++;
                            continue L4;
                          } else {
                            var10[7].field_G[param4 * (-var12 + (var9 + -1)) + var11] = param6;
                            var10[5].field_G[-var12 - (-var9 - (-1 + var9 * var11))] = param6;
                            var10[1].field_G[var11 + param4 * var12] = param2;
                            var10[3].field_G[var11 * var9 - -var12] = param2;
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 < var9) {
                        var10[0].field_G[var9 * var11 + var12] = param2;
                        var10[0].field_G[var11 + var9 * var12] = param2;
                        if (var9 - var11 > var12) {
                          var10[2].field_G[var11 * var9 + var12] = param2;
                          var10[6].field_G[var11 + var12 * var9] = param2;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L2;
                  } else {
                    var10[6].field_G[var12 + var9 * (-1 + -var11 + var9)] = param6;
                    var10[8].field_G[(var9 - var11 + -1) * var9 - -var12] = param6;
                    var10[2].field_G[var12 * var9 - (-var9 + 1) - var11] = param6;
                    var10[8].field_G[-var11 - -var9 + -1 + var12 * var9] = param6;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_tf__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_G.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_G[var14] = param3;
                var14++;
                continue L10;
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
        bn.field_I.a(param3 ^ 4400, param2);
        int var4 = bo.field_h.m(14685) ? 1 : 0;
        if (param3 != -32268) {
            field_f = null;
        }
        if (nm.field_c != 0) {
            if (var4 == 0) {
                po.a(true);
                param2 = false;
            }
        }
        if (!(!param2)) {
            bo.field_h.b(param1, param3 ^ 32267, param0);
        }
        if (var4 != 0) {
            bn.field_I.a(-28476, param2);
        }
        int var5 = bo.field_h.k(-16200) + bo.field_h.field_tb;
        if ((var5 ^ -1) < -641) {
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

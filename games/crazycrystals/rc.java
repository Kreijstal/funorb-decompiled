/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rc {
    static int[] field_b;
    static Vector field_a;

    final static boolean a(int param0) {
        if (param0 > -20) {
            return true;
        }
        return gl.field_c;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if ((fk.field_s & 1 << param5) != 0) {
            return;
        }
        ca var7 = new ca(param5, param3, param1, param2, param4, param6);
        if (!rc.a(-126)) {
            mb.a(var7, 4, 0);
        } else {
            so.field_h.b(0, (jb) (Object) var7);
        }
        fk.field_s = fk.field_s + (param0 << param5);
        pc.field_y = pc.field_y + (1 << param5);
        ge.field_c = ge.field_c + (1 << param5);
    }

    public static void a(boolean param0) {
        if (param0) {
            field_a = null;
        }
        field_a = null;
        field_b = null;
    }

    final static dl[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        dl[] var10 = null;
        dl[] var11_ref_dl__ = null;
        int var11 = 0;
        int var12 = 0;
        dl var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = CrazyCrystals.field_B;
        var9 = param8 + (param1 - -param4);
        var10 = new dl[]{new dl(var9, var9), new dl(param0, var9), new dl(var9, var9), new dl(var9, param0), new dl(64, 64), new dl(var9, param0), new dl(var9, var9), new dl(param0, var9), new dl(var9, var9)};
        var11_ref_dl__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_dl__.length <= var12) {
            var10 = var11_ref_dl__;
            var11 = 0;
            L1: while (true) {
              if (param1 <= var11) {
                L2: {
                  if (param7 == 2958) {
                    break L2;
                  } else {
                    dl[] discarded$1 = rc.a(-44, -87, 63, -114, -113, -87, 75, -11, 77);
                    break L2;
                  }
                }
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param1) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param0) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param0 >> -1140107775) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 < param4) {
                                var10[1].field_w[var11 + (var9 - (var12 + 1)) * param0] = param3;
                                var10[3].field_w[var11 * var9 - (1 + -var9 - -var12)] = param3;
                                var10[7].field_w[var12 * param0 + var11] = param3;
                                var10[5].field_w[var12 + var9 * var11] = param3;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 < param1) {
                            var10[7].field_w[var11 + (var9 - (var12 + 1)) * param0] = param5;
                            var10[5].field_w[var11 * var9 + var9 - (1 - -var12)] = param5;
                            var10[1].field_w[var11 + var12 * param0] = param6;
                            var10[3].field_w[var12 + var11 * var9] = param6;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 > var12) {
                        var10[0].field_w[var11 * var9 + var12] = param6;
                        var10[0].field_w[var11 + var12 * var9] = param6;
                        if (var12 < -var11 + var9) {
                          var10[2].field_w[var12 - -(var9 * var11)] = param6;
                          var10[6].field_w[var12 * var9 - -var11] = param6;
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
                    continue L1;
                  } else {
                    var10[6].field_w[var12 + var9 * (-var11 + var9 - 1)] = param5;
                    var10[8].field_w[var12 + (-1 + (-var11 + var9)) * var9] = param5;
                    var10[2].field_w[-1 + (var9 - var11 + var9 * var12)] = param5;
                    var10[8].field_w[-1 - (-var9 + var11 - var9 * var12)] = param5;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_dl__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_w.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_w[var14] = param2;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        pl.field_g = param1;
        if (param0 != -25537) {
            field_a = null;
        }
    }

    static {
    }
}

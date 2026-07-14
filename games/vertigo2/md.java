/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md extends ji {
    private int field_B;
    private int field_E;
    static String[] field_C;
    private int field_A;
    private int field_z;
    private int field_F;
    static int field_D;
    static String field_y;

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param0 == 110) {
            break L0;
          } else {
            md.g(10);
            break L0;
          }
        }
        L1: {
          var4 = param1;
          if (-1 == (var4 ^ -1)) {
            ((md) this).field_E = param2.h(-11);
            break L1;
          } else {
            if (1 == var4) {
              ((md) this).field_F = param2.a((byte) -11);
              break L1;
            } else {
              if ((var4 ^ -1) != -3) {
                if (var4 == 3) {
                  ((md) this).field_A = param2.a((byte) -11);
                  break L1;
                } else {
                  if ((var4 ^ -1) == -5) {
                    ((md) this).field_z = param2.a((byte) -11);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                ((md) this).field_B = param2.h(-11);
                break L1;
              }
            }
          }
        }
    }

    final void a(int param0) {
        if (param0 >= -98) {
            Object var3 = null;
            md.a(-83, -41, (int[]) null, 88, -98);
        }
        uk.d((byte) 71);
    }

    final static boolean a(int param0, tp param1, tp param2) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        int var3 = param2.field_Pb - param1.field_Pb;
        if (dg.field_d != param2.field_Lb) {
            // if_acmpne L63
            // wide iinc 3 200
        } else {
            // wide iinc 3 -200
        }
        if (param1.field_Lb == dg.field_d) {
            // wide iinc 3 200
        } else {
            if (!(null != param1.field_Lb)) {
                // wide iinc 3 -200
            }
        }
        if (param0 != 1308) {
            field_y = null;
        }
        return var3 > 0 ? true : false;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Vertigo2.field_L ? 1 : 0;
        while (true) {
            param3--;
            if (0 > param3) {
                break;
            }
            var9 = param2;
            int[] var5_ref_int__ = var9;
            var6 = param1;
            var7 = param4;
            var9[var6] = (b.a(16711422, var9[var6]) >> 428046817) + var7;
            param1++;
        }
        int var5 = 4 / ((param0 - -39) / 53);
    }

    public md() {
        super(0, true);
        ((md) this).field_B = 16;
        ((md) this).field_E = 0;
        ((md) this).field_A = 0;
        ((md) this).field_F = 2000;
        ((md) this).field_z = 4096;
    }

    public static void g(int param0) {
        field_C = null;
        int var1 = -119 / ((param0 - 50) / 32);
        field_y = null;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        Random var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        Object var28 = null;
        int[][] var32 = null;
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var27 = Vertigo2.field_L ? 1 : 0;
          if (param1 > 91) {
            break L0;
          } else {
            var28 = null;
            boolean discarded$1 = md.a(55, (tp) null, (tp) null);
            break L0;
          }
        }
        L1: {
          var3 = ((md) this).field_x.a(param0, (byte) 110);
          if (!((md) this).field_x.field_i) {
            break L1;
          } else {
            var4 = ((md) this).field_z >> 846283457;
            var32 = ((md) this).field_x.a(100);
            var6 = new Random((long)((md) this).field_E);
            var7 = 0;
            L2: while (true) {
              if (var7 >= ((md) this).field_F) {
                break L1;
              } else {
                L3: {
                  if ((((md) this).field_z ^ -1) >= -1) {
                    stackOut_7_0 = ((md) this).field_A;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = ((md) this).field_A + (mj.a(-110, var6, ((md) this).field_z) + -var4);
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_8_0;
                  var8 = var8 >> 1325167332 & 255;
                  var9 = mj.a(-106, var6, we.field_M);
                  var10 = mj.a(-128, var6, aa.field_Vb);
                  var11 = (qb.field_b[var8] * ((md) this).field_B >> 1040223372) + var9;
                  var12 = var10 + (((md) this).field_B * eh.field_b[var8] >> -1783165140);
                  var13 = -var10 + var12;
                  var14 = var11 + -var9;
                  if (var14 != 0) {
                    break L4;
                  } else {
                    if (0 != var13) {
                      break L4;
                    } else {
                      var7++;
                      continue L2;
                    }
                  }
                }
                L5: {
                  if (0 <= var14) {
                    break L5;
                  } else {
                    var14 = -var14;
                    break L5;
                  }
                }
                L6: {
                  if (var13 >= 0) {
                    break L6;
                  } else {
                    var13 = -var13;
                    break L6;
                  }
                }
                L7: {
                  if (var13 <= var14) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L7;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L7;
                  }
                }
                L8: {
                  var15 = stackIn_19_0;
                  if (var15 != 0) {
                    var16 = var9;
                    var17 = var11;
                    var9 = var10;
                    var10 = var16;
                    var11 = var12;
                    var12 = var17;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var11 < var9) {
                    var16 = var9;
                    var9 = var11;
                    var17 = var10;
                    var11 = var16;
                    var10 = var12;
                    var12 = var17;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var16 = var10;
                  var17 = var11 - var9;
                  var18 = var12 - var10;
                  var19 = -var17 / 2;
                  var20 = 2048 / var17;
                  var21 = -(mj.a(-107, var6, 4096) >> 32915650) + 1024;
                  if (var10 >= var12) {
                    stackOut_27_0 = -1;
                    stackIn_28_0 = stackOut_27_0;
                    break L10;
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    break L10;
                  }
                }
                L11: {
                  var22 = stackIn_28_0;
                  if ((var18 ^ -1) > -1) {
                    var18 = -var18;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var23 = var9;
                L12: while (true) {
                  if (var23 < var11) {
                    L13: {
                      var24 = var20 * (-var9 + var23) + (1024 + var21);
                      var25 = var23 & rm.field_z;
                      var26 = fk.field_x & var16;
                      if (var15 != 0) {
                        var32[var26][var25] = var24;
                        break L13;
                      } else {
                        var32[var25][var26] = var24;
                        break L13;
                      }
                    }
                    var19 = var19 + var18;
                    if (var19 > 0) {
                      var19 = var19 - var17;
                      var16 = var16 - -var22;
                      var23++;
                      continue L12;
                    } else {
                      var23++;
                      continue L12;
                    }
                  } else {
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Press any key to continue";
    }
}

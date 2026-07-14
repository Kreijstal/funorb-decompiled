/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sva extends le {
    private int field_j;
    private int field_k;
    static int field_m;
    private int field_l;
    private int field_i;
    private int field_n;

    final int[] a(int param0, boolean param1) {
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
        int[][] var31 = null;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          var27 = VoidHunters.field_G;
          var3 = ((sva) this).field_f.a((byte) 117, param0);
          if (((sva) this).field_f.field_e) {
            var4 = ((sva) this).field_j >> -532029343;
            var31 = ((sva) this).field_f.b(73);
            var6 = new Random((long)((sva) this).field_n);
            var7 = 0;
            L1: while (true) {
              if (((sva) this).field_k <= var7) {
                break L0;
              } else {
                L2: {
                  if (((sva) this).field_j <= 0) {
                    stackOut_6_0 = ((sva) this).field_i;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = ((sva) this).field_i + (-var4 + hob.a(var6, ((sva) this).field_j, 124));
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_7_0;
                  var8 = var8 >> 1189200676 & 255;
                  var9 = hob.a(var6, hob.field_d, 127);
                  var10 = hob.a(var6, noa.field_o, 117);
                  var11 = var9 - -(jmb.field_q[var8] * ((sva) this).field_l >> 1177164684);
                  var12 = var10 + (qta.field_o[var8] * ((sva) this).field_l >> 1109056556);
                  var13 = -var10 + var12;
                  var14 = -var9 + var11;
                  if (var14 != 0) {
                    break L3;
                  } else {
                    if (-1 != (var13 ^ -1)) {
                      break L3;
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
                L4: {
                  if (0 > var14) {
                    var14 = -var14;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((var13 ^ -1) > -1) {
                    var13 = -var13;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var14 >= var13) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L6;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L6;
                  }
                }
                L7: {
                  var15 = stackIn_19_0;
                  if (var15 == 0) {
                    break L7;
                  } else {
                    var16 = var9;
                    var17 = var11;
                    var9 = var10;
                    var11 = var12;
                    var10 = var16;
                    var12 = var17;
                    break L7;
                  }
                }
                L8: {
                  if (var9 <= var11) {
                    break L8;
                  } else {
                    var16 = var9;
                    var9 = var11;
                    var17 = var10;
                    var10 = var12;
                    var11 = var16;
                    var12 = var17;
                    break L8;
                  }
                }
                L9: {
                  var16 = var10;
                  var17 = var11 + -var9;
                  var18 = var12 - var10;
                  var19 = -var17 / 2;
                  var20 = 2048 / var17;
                  var21 = 1024 + -(hob.a(var6, 4096, 127) >> -1241200286);
                  if (var12 > var10) {
                    stackOut_25_0 = 1;
                    stackIn_26_0 = stackOut_25_0;
                    break L9;
                  } else {
                    stackOut_24_0 = -1;
                    stackIn_26_0 = stackOut_24_0;
                    break L9;
                  }
                }
                L10: {
                  var22 = stackIn_26_0;
                  if (var18 >= 0) {
                    break L10;
                  } else {
                    var18 = -var18;
                    break L10;
                  }
                }
                var23 = var9;
                L11: while (true) {
                  if (var23 < var11) {
                    L12: {
                      var24 = var20 * (var23 + -var9) + 1024 + var21;
                      var25 = gbb.field_q & var23;
                      var26 = var16 & wf.field_d;
                      var19 = var19 + var18;
                      if (var15 == 0) {
                        var31[var25][var26] = var24;
                        break L12;
                      } else {
                        var31[var26][var25] = var24;
                        break L12;
                      }
                    }
                    if ((var19 ^ -1) < -1) {
                      var19 = -var17 + var19;
                      var16 = var16 - -var22;
                      var23++;
                      continue L11;
                    } else {
                      var23++;
                      continue L11;
                    }
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L13: {
          if (param1) {
            break L13;
          } else {
            boolean discarded$1 = sva.e((byte) 3);
            break L13;
          }
        }
        return var3;
    }

    public sva() {
        super(0, true);
        ((sva) this).field_k = 2000;
        ((sva) this).field_j = 4096;
        ((sva) this).field_l = 16;
        ((sva) this).field_n = 0;
        ((sva) this).field_i = 0;
    }

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (param1 < -60) {
            break L0;
          } else {
            int[] discarded$2 = ((sva) this).a(66, true);
            break L0;
          }
        }
        L1: {
          var4 = param0;
          if (var4 == 0) {
            ((sva) this).field_n = param2.e((byte) -101);
            break L1;
          } else {
            if (var4 == -2) {
              ((sva) this).field_k = param2.e(1869);
              break L1;
            } else {
              if (-3 != var4) {
                if (var4 == -4) {
                  ((sva) this).field_i = param2.e(1869);
                  break L1;
                } else {
                  if (-5 == var4) {
                    ((sva) this).field_j = param2.e(1869);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                ((sva) this).field_l = param2.e((byte) -117);
                break L1;
              }
            }
          }
        }
    }

    final void c(byte param0) {
        if (param0 >= -35) {
            boolean discarded$0 = sva.e((byte) -123);
        }
        taa.e((byte) -120);
    }

    final static boolean e(byte param0) {
        if (param0 != -34) {
            boolean discarded$0 = sva.e((byte) 68);
        }
        return !wba.field_p.a(4) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 20;
    }
}

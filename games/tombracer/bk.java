/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bk extends ci {
    private int field_q;
    static String[] field_m;
    private int field_p;
    private int field_o;
    private int field_r;
    private int field_n;

    public static void d(byte param0) {
        if (param0 != 101) {
            field_m = null;
        }
        field_m = null;
    }

    final void b(byte param0) {
        if (param0 != 116) {
            Object var3 = null;
            ((bk) this).a((byte) 61, (uia) null, -62);
        }
        tka.b((byte) 115);
    }

    public bk() {
        super(0, true);
        ((bk) this).field_q = 4096;
        ((bk) this).field_o = 16;
        ((bk) this).field_p = 2000;
        ((bk) this).field_r = 0;
        ((bk) this).field_n = 0;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var4 = param2;
          if (var4 != 0) {
            if ((var4 ^ -1) != -2) {
              if (2 == var4) {
                ((bk) this).field_o = param1.h(255);
                break L0;
              } else {
                if (3 == var4) {
                  ((bk) this).field_r = param1.d(param0 + 17);
                  break L0;
                } else {
                  if (4 == var4) {
                    ((bk) this).field_q = param1.d(121);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              ((bk) this).field_p = param1.d(param0 ^ 21);
              break L0;
            }
          } else {
            ((bk) this).field_n = param1.h(param0 ^ 148);
            break L0;
          }
        }
        L1: {
          if (param0 == 107) {
            break L1;
          } else {
            ((bk) this).field_o = -113;
            break L1;
          }
        }
    }

    final static void c(int param0) {
        if (param0 != 9033) {
            field_m = null;
        }
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
        int[][] var31 = null;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          var27 = TombRacer.field_G ? 1 : 0;
          var3 = ((bk) this).field_i.a((byte) -104, param1);
          if (!((bk) this).field_i.field_d) {
            break L0;
          } else {
            var4 = ((bk) this).field_q >> -1886740095;
            var31 = ((bk) this).field_i.a(0);
            var6 = new Random((long)((bk) this).field_n);
            var7 = 0;
            L1: while (true) {
              if (((bk) this).field_p <= var7) {
                break L0;
              } else {
                L2: {
                  if ((((bk) this).field_q ^ -1) >= -1) {
                    stackOut_5_0 = ((bk) this).field_r;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = ((bk) this).field_r + jqa.a(((bk) this).field_q, var6, -102) + -var4;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_6_0;
                  var8 = var8 >> 1578168452 & 255;
                  var9 = jqa.a(ns.field_g, var6, 44);
                  var10 = jqa.a(qda.field_i, var6, -127);
                  var11 = (((bk) this).field_o * lm.field_r[var8] >> -816044628) + var9;
                  var12 = var10 - -(ou.field_e[var8] * ((bk) this).field_o >> 969785164);
                  var13 = var12 + -var10;
                  var14 = -var9 + var11;
                  if (var14 != 0) {
                    break L3;
                  } else {
                    if (var13 != 0) {
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
                  if (var13 < 0) {
                    var13 = -var13;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var13 <= var14) {
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
                    var9 = var10;
                    var17 = var11;
                    var11 = var12;
                    var10 = var16;
                    var12 = var17;
                    break L7;
                  }
                }
                L8: {
                  if (var11 < var9) {
                    var16 = var9;
                    var9 = var11;
                    var17 = var10;
                    var11 = var16;
                    var10 = var12;
                    var12 = var17;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var16 = var10;
                  var17 = var11 + -var9;
                  var18 = -var10 + var12;
                  var19 = -var17 / 2;
                  var20 = 2048 / var17;
                  var21 = -(jqa.a(4096, var6, -85) >> -727497790) + 1024;
                  if (var12 > var10) {
                    stackOut_26_0 = 1;
                    stackIn_27_0 = stackOut_26_0;
                    break L9;
                  } else {
                    stackOut_25_0 = -1;
                    stackIn_27_0 = stackOut_25_0;
                    break L9;
                  }
                }
                L10: {
                  var22 = stackIn_27_0;
                  if (-1 < (var18 ^ -1)) {
                    var18 = -var18;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var23 = var9;
                L11: while (true) {
                  if (var23 < var11) {
                    L12: {
                      var24 = var21 - -1024 + (var23 - var9) * var20;
                      var25 = var23 & una.field_b;
                      var26 = var16 & hba.field_b;
                      if (var15 != 0) {
                        var31[var26][var25] = var24;
                        break L12;
                      } else {
                        var31[var25][var26] = var24;
                        break L12;
                      }
                    }
                    var19 = var19 + var18;
                    if (-1 > (var19 ^ -1)) {
                      var16 = var16 - -var22;
                      var19 = var19 - var17;
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
          }
        }
        if (param0 == 1) {
          return var3;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}

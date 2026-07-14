/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ihb extends ksa {
    int field_d;
    int field_e;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static int a(int[] param0, int param1, int[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int stackIn_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        var17 = VoidHunters.field_G;
        var3 = param0[0];
        var4 = var3;
        var5 = param2[0];
        var6 = var5;
        var7 = param0[1];
        var8 = var7;
        var9 = param2[1];
        var10 = var9;
        var11 = 2;
        L0: while (true) {
          if (param0.length <= var11) {
            if (param1 == -5115) {
              var11 = 2;
              L1: while (true) {
                if (param2.length <= var11) {
                  L2: {
                    if (var3 > var6) {
                      break L2;
                    } else {
                      if (var4 < var5) {
                        break L2;
                      } else {
                        if (var7 > var10) {
                          break L2;
                        } else {
                          if (var9 > var8) {
                            break L2;
                          } else {
                            L3: {
                              var11 = Math.max(0, -14 + vma.a(125, Math.max(Math.max(var4, var6) + -Math.min(var3, var5), Math.max(var8, var10) - Math.min(var7, var9))));
                              var12 = 2147483647;
                              var14 = -var6 + var3;
                              var15 = var4 + -var5;
                              if (Math.abs(var14) < Math.abs(var15)) {
                                var13 = var14;
                                break L3;
                              } else {
                                var13 = var15;
                                break L3;
                              }
                            }
                            L4: {
                              var15 = var7 - var10;
                              var16 = var8 - var9;
                              if (Math.abs(var15) >= Math.abs(var16)) {
                                var14 = var16;
                                break L4;
                              } else {
                                var14 = var15;
                                break L4;
                              }
                            }
                            L5: {
                              if (Math.abs(var13) >= Math.abs(var14)) {
                                var12 = var14;
                                break L5;
                              } else {
                                var12 = var13;
                                break L5;
                              }
                            }
                            var13 = Math.min(var3, var5);
                            var14 = Math.min(var7, var9);
                            var15 = fva.a(var12, var13, param2, var14, param0, var11, -1);
                            if ((var15 ^ -1) == -2147483648) {
                              return -1;
                            } else {
                              L6: {
                                var16 = fva.a(var15, var13, param0, var14, param2, var11, -1);
                                if (Math.abs(var16) < Math.min(Math.abs(var15), Math.abs(var12))) {
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              L7: {
                                if ((var16 ^ -1) != -2147483648) {
                                  stackOut_44_0 = Math.abs(var16);
                                  stackIn_45_0 = stackOut_44_0;
                                  break L7;
                                } else {
                                  stackOut_43_0 = -1;
                                  stackIn_45_0 = stackOut_43_0;
                                  break L7;
                                }
                              }
                              return stackIn_45_0;
                            }
                          }
                        }
                      }
                    }
                  }
                  return -1;
                } else {
                  L8: {
                    var12 = param2[var11];
                    if (var5 <= var12) {
                      if (var12 <= var6) {
                        break L8;
                      } else {
                        var6 = var12;
                        break L8;
                      }
                    } else {
                      var5 = var12;
                      break L8;
                    }
                  }
                  var11++;
                  var12 = param2[var11];
                  var11++;
                  if (var9 <= var12) {
                    if (var10 >= var12) {
                      continue L1;
                    } else {
                      var10 = var12;
                      continue L1;
                    }
                  } else {
                    var9 = var12;
                    continue L1;
                  }
                }
              }
            } else {
              return 61;
            }
          } else {
            L9: {
              var11++;
              var12 = param0[var11];
              if (var12 >= var3) {
                if (var4 >= var12) {
                  break L9;
                } else {
                  var4 = var12;
                  break L9;
                }
              } else {
                var3 = var12;
                break L9;
              }
            }
            var11++;
            var12 = param0[var11];
            if (var12 < var7) {
              var7 = var12;
              continue L0;
            } else {
              if (var12 > var8) {
                var8 = var12;
                continue L0;
              } else {
                continue L0;
              }
            }
          }
        }
    }

    ihb(int param0, int param1) {
        ((ihb) this).field_e = param1;
        ((ihb) this).field_d = param0;
    }

    final static byte[] a(byte param0, int param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3_ref_byte__ = null;
        Random var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pab var2_ref = null;
        int var9 = VoidHunters.field_G;
        pab var2 = (pab) (Object) cs.field_c.a((long)param1, 72);
        if (var2 == null) {
            var11 = new byte[512];
            var10 = var11;
            var3_ref_byte__ = var10;
            var4 = new Random((long)param1);
            for (var5 = 0; var5 < 255; var5++) {
                var3_ref_byte__[var5] = (byte)var5;
            }
            for (var5 = 0; 255 > var5; var5++) {
                var6 = -var5 + 255;
                var7 = hob.a(var4, var6, 124);
                var8 = var11[var7];
                var3_ref_byte__[var7] = var11[var6];
                var3_ref_byte__[511 + -var5] = (byte) var8;
                var3_ref_byte__[var6] = (byte) var8;
            }
            var2_ref = new pab(var11);
            cs.field_c.a((long)param1, (byte) -48, (fh) (Object) var2_ref);
        }
        int var3 = -56 / ((-24 - param0) / 45);
        return var2_ref.field_l;
    }

    static {
    }
}

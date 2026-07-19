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
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int stackIn_14_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = param0[0];
            var4 = var3_int;
            var5 = param2[0];
            var6 = var5;
            var7 = param0[1];
            var8 = var7;
            var9 = param2[1];
            var10 = var9;
            var11 = 2;
            L1: while (true) {
              if (param0.length <= var11) {
                if (param1 == -5115) {
                  var11 = 2;
                  L2: while (true) {
                    if (param2.length <= var11) {
                      L3: {
                        if (var3_int > var6) {
                          break L3;
                        } else {
                          if (var4 < var5) {
                            break L3;
                          } else {
                            if (var7 > var10) {
                              break L3;
                            } else {
                              if (var9 > var8) {
                                break L3;
                              } else {
                                L4: {
                                  var11 = Math.max(0, -14 + vma.a(125, Math.max(Math.max(var4, var6) + -Math.min(var3_int, var5), Math.max(var8, var10) - Math.min(var7, var9))));
                                  var12 = 2147483647;
                                  var14 = -var6 + var3_int;
                                  var15 = var4 + -var5;
                                  if (Math.abs(var14) < Math.abs(var15)) {
                                    var13 = var14;
                                    break L4;
                                  } else {
                                    var13 = var15;
                                    break L4;
                                  }
                                }
                                L5: {
                                  var15 = var7 - var10;
                                  var16 = var8 - var9;
                                  if (Math.abs(var15) >= Math.abs(var16)) {
                                    var14 = var16;
                                    break L5;
                                  } else {
                                    var14 = var15;
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (Math.abs(var13) >= Math.abs(var14)) {
                                    var12 = var14;
                                    break L6;
                                  } else {
                                    var12 = var13;
                                    break L6;
                                  }
                                }
                                var13 = Math.min(var3_int, var5);
                                var14 = Math.min(var7, var9);
                                var15 = fva.a(var12, var13, param2, var14, param0, var11, -1);
                                if ((var15 ^ -1) == -2147483648) {
                                  stackOut_43_0 = -1;
                                  stackIn_44_0 = stackOut_43_0;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                } else {
                                  L7: {
                                    var16 = fva.a(var15, var13, param0, var14, param2, var11, -1);
                                    if (Math.abs(var16) < Math.min(Math.abs(var15), Math.abs(var12))) {
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    if ((var16 ^ -1) != -2147483648) {
                                      stackOut_48_0 = Math.abs(var16);
                                      stackIn_49_0 = stackOut_48_0;
                                      break L8;
                                    } else {
                                      stackOut_47_0 = -1;
                                      stackIn_49_0 = stackOut_47_0;
                                      break L8;
                                    }
                                  }
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_30_0 = -1;
                      stackIn_31_0 = stackOut_30_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L9: {
                        var12 = param2[var11];
                        if (var5 <= var12) {
                          if (var12 <= var6) {
                            break L9;
                          } else {
                            var6 = var12;
                            break L9;
                          }
                        } else {
                          var5 = var12;
                          break L9;
                        }
                      }
                      var11++;
                      var12 = param2[var11];
                      var11++;
                      if (var9 <= var12) {
                        if (var10 >= var12) {
                          continue L2;
                        } else {
                          var10 = var12;
                          continue L2;
                        }
                      } else {
                        var9 = var12;
                        continue L2;
                      }
                    }
                  }
                } else {
                  stackOut_13_0 = 61;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L10: {
                  incrementValue$2 = var11;
                  var11++;
                  var12 = param0[incrementValue$2];
                  if (var12 >= var3_int) {
                    if (var4 >= var12) {
                      break L10;
                    } else {
                      var4 = var12;
                      break L10;
                    }
                  } else {
                    var3_int = var12;
                    break L10;
                  }
                }
                incrementValue$3 = var11;
                var11++;
                var12 = param0[incrementValue$3];
                if (var12 < var7) {
                  var7 = var12;
                  continue L1;
                } else {
                  if (var12 > var8) {
                    var8 = var12;
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var3);
            stackOut_50_1 = new StringBuilder().append("ihb.B(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L11;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L11;
            }
          }
          L12: {
            stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
            stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param1).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param2 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L12;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L12;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_44_0;
            } else {
              return stackIn_49_0;
            }
          }
        }
    }

    ihb(int param0, int param1) {
        this.field_e = param1;
        this.field_d = param0;
    }

    final static byte[] a(byte param0, int param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3_ref_byte__ = null;
        Random var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var9 = VoidHunters.field_G;
        pab var2 = (pab) ((Object) cs.field_c.a((long)param1, 72));
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
            var2 = new pab(var11);
            cs.field_c.a((long)param1, (byte) -48, var2);
        }
        int var3 = -56 / ((-24 - param0) / 45);
        return var2.field_l;
    }

    static {
    }
}

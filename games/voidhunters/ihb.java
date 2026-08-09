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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
                    L3: {
                      L4: {
                        if (param2.length <= var11) {
                          if (var3_int > var6) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          var12 = param2[var11];
                          stackIn_22_0 = var5;

                          stackIn_22_1 = var12;

                          L5: {
                            if (stackIn_22_0 <= stackIn_22_1) {
                              if (var12 <= var6) {
                                break L5;
                              } else {
                                var6 = var12;
                                break L5;
                              }
                            } else {
                              var5 = var12;
                              break L5;
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
                      if (var4 < var5) {
                        break L3;
                      } else {
                        if (var7 > var10) {
                          break L3;
                        } else {
                          if (var9 > var8) {
                            break L3;
                          } else {
                            L6: {
                              var11 = Math.max(0, -14 + vma.a(125, Math.max(Math.max(var4, var6) + -Math.min(var3_int, var5), Math.max(var8, var10) - Math.min(var7, var9))));
                              var12 = 2147483647;
                              var14 = -var6 + var3_int;
                              var15 = var4 + -var5;
                              if (Math.abs(var14) < Math.abs(var15)) {
                                var13 = var14;
                                break L6;
                              } else {
                                var13 = var15;
                                break L6;
                              }
                            }
                            L7: {
                              var15 = var7 - var10;
                              var16 = var8 - var9;
                              if (Math.abs(var15) >= Math.abs(var16)) {
                                var14 = var16;
                                break L7;
                              } else {
                                var14 = var15;
                                break L7;
                              }
                            }
                            L8: {
                              if (Math.abs(var13) >= Math.abs(var14)) {
                                var12 = var14;
                                break L8;
                              } else {
                                var12 = var13;
                                break L8;
                              }
                            }
                            var13 = Math.min(var3_int, var5);
                            var14 = Math.min(var7, var9);
                            var15 = fva.a(var12, var13, param2, var14, param0, var11, -1);
                            if ((var15 ^ -1) == -2147483648) {
                              stackIn_49_0 = -1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              L9: {
                                var16 = fva.a(var15, var13, param0, var14, param2, var11, -1);
                                if (Math.abs(var16) < Math.min(Math.abs(var15), Math.abs(var12))) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                if ((var16 ^ -1) != -2147483648) {
                                  stackIn_54_0 = Math.abs(var16);
                                  break L10;
                                } else {
                                  stackIn_54_0 = -1;
                                  break L10;
                                }
                              }
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                    stackIn_36_0 = -1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_16_0 = 61;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L11: {
                  incrementValue$0 = var11;
                  var11++;
                  var12 = param0[incrementValue$0];
                  if (var12 >= var3_int) {
                    if (var4 >= var12) {
                      break L11;
                    } else {
                      var4 = var12;
                      break L11;
                    }
                  } else {
                    var3_int = var12;
                    break L11;
                  }
                }
                incrementValue$1 = var11;
                var11++;
                var12 = param0[incrementValue$1];
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
          L12: {
            var3 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var3);

            stackIn_57_1 = new StringBuilder().append("ihb.B(");

            if (param0 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L12;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L13;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_58_0), stackIn_61_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_36_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_49_0;
            } else {
              return stackIn_54_0;
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

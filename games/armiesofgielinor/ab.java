/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ab {
    static int field_a;
    static int[] field_c;
    static java.util.zip.CRC32 field_b;
    static me field_d;
    static String field_e;

    public static void a(byte param0) {
        if (param0 != 32) {
          field_d = (me) null;
          field_b = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= param0.length()) {
                    break L3;
                  } else {
                    var3 = param0.charAt(var2_int);
                    stackOut_3_0 = ni.a((byte) -105, (char) var3);
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          break L4;
                        } else {
                          if (mu.a(28799, (char) var3)) {
                            break L4;
                          } else {
                            stackOut_6_0 = 1;
                            stackIn_7_0 = stackOut_6_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("ab.B(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        wk var10 = null;
        wk var11 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        int stackOut_3_0 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1 = param1 | param1 << 2064010280;
            var4_int = param1 >> 1927127457 ^ param1;
            var7 = 0;
            L1: while (true) {
              L2: {
                if (4 <= var7) {
                  stackOut_8_0 = param3;
                  stackIn_9_0 = stackOut_8_0 ? 1 : 0;
                  break L2;
                } else {
                  var6 = -64 + (bm.field_y[var7][1] + param0 - -(param1 & 3));
                  var5 = -44 + ((var4_int & 7) + bm.field_y[var7][0] + param2);
                  stackOut_3_0 = 0;
                  stackIn_9_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (stackIn_4_0 == var7) {
                          break L4;
                        } else {
                          var11 = tn.field_eb[25 + param1 % 9];
                          fe.a(var11, var5, var6);
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var10 = tn.field_eb[16 + param1 % 9];
                      fe.a(var10, var5, -bm.field_y[var7][1] + var6);
                      break L3;
                    }
                    param1 = param1 >> 1;
                    var4_int = var4_int >> 1;
                    var7++;
                    continue L1;
                  }
                }
              }
              if (stackIn_9_0 == 0) {
                break L0;
              } else {
                ab.a((byte) 89);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "ab.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = -1;
        field_c = new int[16384];
        field_b = new java.util.zip.CRC32();
        field_e = "This option cannot be combined with the current '<%0>' setting.";
        field_d = new me(8, 0, 4, 1);
    }
}

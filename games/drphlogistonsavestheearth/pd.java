/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    static double field_a;
    static Random field_c;
    static int field_b;
    static n field_d;

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            field_d = (n) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static vi a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        vi var7 = null;
        int var8 = 0;
        vi stackIn_4_0 = null;
        vi stackIn_7_0 = null;
        vi stackIn_10_0 = null;
        vi stackIn_16_0 = null;
        vi stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if ((var2_int ^ -1) == param1) {
              stackIn_4_0 = qj.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (255 >= var2_int) {
                var3 = ki.a((byte) -97, '.', param0);
                if (2 <= var3.length) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      stackIn_19_0 = vg.a((byte) -126, var3[var3.length - 1]);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = nc.a(var6, (byte) -33);
                      if (var7 != null) {
                        stackIn_16_0 = (vi) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = qj.field_e;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = ej.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("pd.A(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L2;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                return stackIn_19_0;
              }
            }
          }
        }
    }

    static {
        field_a = Math.atan2(1.0, 0.0);
        field_c = new Random(15L);
    }
}

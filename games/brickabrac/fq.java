/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fq {
    static java.util.zip.CRC32 field_a;
    static jp[] field_d;
    static jp[] field_c;
    static int[] field_e;
    static int field_b;

    final static void a(int param0, int param1, int param2, jp[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param0 > 0) {
                  L2: {
                    if (param2 == 743) {
                      break L2;
                    } else {
                      fq.a((byte) 123);
                      break L2;
                    }
                  }
                  var5_int = param3[0].field_x;
                  var6 = param3[2].field_x;
                  var7 = param3[1].field_x;
                  param3[0].c(param4, param1);
                  param3[2].c(param4 + param0 - var6, param1);
                  lb.a(pb.field_n);
                  lb.d(param4 + var5_int, param1, param0 + param4 + -var6, param3[1].field_z + param1);
                  var8 = param4 + var5_int;
                  var9 = param4 - (-param0 - -var6);
                  param4 = var8;
                  L3: while (true) {
                    if (var9 <= param4) {
                      lb.b(pb.field_n);
                      break L0;
                    } else {
                      param3[1].c(param4, param1);
                      param4 = param4 + var7;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("fq.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 41);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        ug.field_I = param1;
        if (param0 <= 83) {
          fq.a((byte) -44, 39, -69, 32);
          qh.field_d = param3;
          om.field_hc = param2;
          return;
        } else {
          qh.field_d = param3;
          om.field_hc = param2;
          return;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 15) {
            return;
        }
        field_a = null;
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.util.zip.CRC32();
        field_b = 97;
        field_e = new int[]{1, 2, 3, 3, 5, 1, 3, 3, 5, 2, 5, 5, 5, 10, 3, 10, 1, 3, 5, 3, 5, 10, 5, 3, 5, 10, 3, 2, 5, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 5, 10, 2};
    }
}

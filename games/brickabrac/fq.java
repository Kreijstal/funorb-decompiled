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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = BrickABrac.field_J ? 1 : 0;
          if (param3 == null) {
            break L0;
          } else {
            if (param0 > 0) {
              if (param2 != 743) {
                fq.a((byte) 123);
                var5 = param3[0].field_x;
                var6 = param3[2].field_x;
                var7 = param3[1].field_x;
                param3[0].c(param4, param1);
                param3[2].c(param4 + param0 - var6, param1);
                lb.a(pb.field_n);
                lb.d(param4 + var5, param1, param0 + param4 + -var6, param3[1].field_z + param1);
                var8 = param4 + var5;
                var9 = param4 - (-param0 - -var6);
                param4 = var8;
                L1: while (true) {
                  if (var9 <= param4) {
                    lb.b(pb.field_n);
                    return;
                  } else {
                    param3[1].c(param4, param1);
                    param4 = param4 + var7;
                    continue L1;
                  }
                }
              } else {
                var5 = param3[0].field_x;
                var6 = param3[2].field_x;
                var7 = param3[1].field_x;
                param3[0].c(param4, param1);
                param3[2].c(param4 + param0 - var6, param1);
                lb.a(pb.field_n);
                lb.d(param4 + var5, param1, param0 + param4 + -var6, param3[1].field_z + param1);
                var8 = param4 + var5;
                var9 = param4 - (-param0 - -var6);
                param4 = var8;
                L2: while (true) {
                  if (var9 <= param4) {
                    lb.b(pb.field_n);
                    return;
                  } else {
                    param3[1].c(param4, param1);
                    param4 = param4 + var7;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
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

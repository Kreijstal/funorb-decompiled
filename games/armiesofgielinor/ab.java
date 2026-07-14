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
            field_d = null;
        }
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param1;
        L0: while (true) {
          if (var2 >= param0.length()) {
            return false;
          } else {
            var3 = param0.charAt(var2);
            if (!ni.a((byte) -105, (char) var3)) {
              if (!mu.a(28799, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var7 = 0;
        int var6 = 0;
        int var5 = 0;
        wk var10 = null;
        wk var11 = null;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        param1 = param1 | param1 << 2064010280;
        int var4 = param1 >> 1927127457 ^ param1;
        for (var7 = 0; 4 > var7; var7++) {
            var6 = -64 + (bm.field_y[var7][1] + param0 - -(param1 & 3));
            var5 = -44 + ((var4 & 7) + bm.field_y[var7][0] + param2);
            if (0 != var7) {
                var11 = tn.field_eb[25 + param1 % 9];
                fe.a(var11, var5, var6);
            } else {
                var10 = tn.field_eb[16 + param1 % 9];
                fe.a(var10, var5, -bm.field_y[var7][1] + var6);
            }
            param1 = param1 >> 1;
            var4 = var4 >> 1;
        }
        if (param3) {
            ab.a((byte) 89);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_c = new int[16384];
        field_b = new java.util.zip.CRC32();
        field_e = "This option cannot be combined with the current '<%0>' setting.";
        field_d = new me(8, 0, 4, 1);
    }
}

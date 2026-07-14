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
            field_d = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static vi a(String param0, int param1) {
        int var2 = 0;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        vi var7 = null;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0.length();
        if ((var2 ^ -1) == param1) {
          return qj.field_e;
        } else {
          if (255 >= var2) {
            var3 = ki.a((byte) -97, '.', param0);
            if (2 <= var3.length) {
              var4 = var3;
              var5 = 0;
              L0: while (true) {
                if (var4.length > var5) {
                  var6 = var4[var5];
                  var7 = nc.a(var6, (byte) -33);
                  if (var7 != null) {
                    return var7;
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  return vg.a((byte) -126, var3[var3.length - 1]);
                }
              }
            } else {
              return qj.field_e;
            }
          } else {
            return ej.field_f;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = Math.atan2(1.0, 0.0);
        field_c = new Random(15L);
    }
}

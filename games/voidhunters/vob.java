/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vob extends rqa {
    static no field_r;
    static String field_q;
    static boolean[] field_o;
    static int field_p;

    final static int a(Random param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var3 = -66 / ((param1 - -62) / 62);
        var2 = hob.a(param0, gn.field_m, 123);
        var4 = 0;
        L0: while (true) {
          if (var4 >= 56) {
            throw new IllegalStateException("No playable chassis found. number_of_chassis=" + gn.field_m);
          } else {
            if (tnb.a(130, var4)) {
              if (var2 == 0) {
                return var4;
              } else {
                var2--;
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(218, 124));
    }

    public static void e(byte param0) {
        field_q = null;
        field_o = null;
        int var1 = 114 % ((param0 - -51) / 61);
        field_r = null;
    }

    vob(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Hydra chassis";
        field_o = new boolean[11];
    }
}

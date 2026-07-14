/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mp {
    static String field_e;
    static String field_b;
    static se field_a;
    static String field_c;
    static String field_f;
    static String field_g;
    static int field_d;

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        int var1 = 20 / ((param0 - 45) / 60);
        field_b = null;
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final static void a(Random param0, int[] param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = DungeonAssault.field_K;
        if (param2 <= -126) {
          var5 = 0;
          L0: while (true) {
            if (8 > var5) {
              oh.a(param4, 7);
              if (al.field_o.a(param3, (byte) 104)) {
                if (ll.a((byte) -110, param0, hb.a((byte) -111, param3), param1)) {
                  var5++;
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var7 = null;
          mp.a((Random) null, (int[]) null, -15, 56, 15);
          var5 = 0;
          L1: while (true) {
            if (8 > var5) {
              oh.a(param4, 7);
              if (al.field_o.a(param3, (byte) 104)) {
                if (ll.a((byte) -110, param0, hb.a((byte) -111, param3), param1)) {
                  var5++;
                  continue L1;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static cf a(String param0, String param1, int param2, int param3) {
        Object var5 = null;
        if (param2 != 0) {
          var5 = null;
          mp.a((Random) null, (int[]) null, -57, -11, 117);
          return hd.a(false, param3, param1 + "_" + param0);
        } else {
          return hd.a(false, param3, param1 + "_" + param0);
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email (Login):";
        field_c = "Loading fonts";
        field_e = "Yes";
        field_f = "Orb coins: ";
        field_g = "Shapeshifter";
    }
}

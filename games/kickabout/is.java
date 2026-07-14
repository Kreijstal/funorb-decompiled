/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class is {
    static boolean field_a;
    static int field_g;
    static int field_d;
    static hd field_b;
    static Random field_e;
    static boolean field_c;
    static String field_f;

    final static void a(hu param0, String param1, qj param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        var5 = 0;
        if (param4 == -1942293368) {
          var6 = -1;
          var7 = 1;
          L0: while (true) {
            if (var7 >= param1.length()) {
              return;
            } else {
              L1: {
                var8 = param1.charAt(var7);
                if (var8 != 60) {
                  break L1;
                } else {
                  var6 = (var5 >> -1853929048) + param2.field_b[0] - -param0.a(param1.substring(0, var7));
                  break L1;
                }
              }
              L2: {
                if (var6 != -1) {
                  param2.field_b[var7] = var6;
                  break L2;
                } else {
                  L3: {
                    if (var8 == 32) {
                      var5 = var5 + param3;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  param2.field_b[var7] = param2.field_b[0] + (var5 >> -1942293368) + param0.a(param1.substring(0, var7 + 1)) + -param0.a((char) var8);
                  break L2;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, vc param1) {
        int var2 = 119 % ((-72 - param0) / 44);
        np.field_Jb.a((gn) (Object) new hk(param1, 32), 3);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = Kickabout.field_G;
        for (var1 = 0; var1 < e.field_n.length; var1++) {
            e.field_n[var1].a(param0 + -7232);
        }
        if (param0 != 7249) {
            field_e = null;
        }
    }

    public static void b(int param0) {
        if (param0 <= 110) {
            field_g = 118;
        }
        field_b = null;
        field_f = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_g = 0;
        field_c = false;
        field_f = "Back";
        field_e = new Random();
    }
}

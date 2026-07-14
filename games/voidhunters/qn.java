/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qn extends ksa {
    static String field_d;
    static int field_f;
    int field_e;
    int field_i;
    static ida field_h;
    int field_g;

    final static void c(byte param0) {
        ms.field_y = new ij();
        gtb.field_d = new ij();
        if (param0 < 52) {
          boolean discarded$2 = qn.a(11, (byte) 95);
          jp.field_Jc = new Random();
          return;
        } else {
          jp.field_Jc = new Random();
          return;
        }
    }

    final static boolean a(int param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == -25) {
          if (tla.b(111, param0)) {
            if (!fwa.field_g.a(param0, false)) {
              return false;
            } else {
              return true;
            }
          } else {
            if (!fwa.field_g.b(param0, param1 ^ -29)) {
              return false;
            } else {
              L0: {
                if (!fwa.field_g.a(param0, false)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          }
        } else {
          return true;
        }
    }

    final static int a(char param0, byte param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var3 = 0;
        if (param1 != 58) {
          return -52;
        } else {
          var4 = param2.length();
          var5 = 0;
          L0: while (true) {
            if (var4 <= var5) {
              return var3;
            } else {
              if (param0 == param2.charAt(var5)) {
                var3++;
                var5++;
                var5++;
                continue L0;
              } else {
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            qn.c((byte) -115);
            field_h = null;
            field_d = null;
            return;
        }
        field_h = null;
        field_d = null;
    }

    private qn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 20;
        field_d = "Decreased map width";
    }
}

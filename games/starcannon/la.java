/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static String field_a;
    static int field_b;
    static int field_c;
    static int[] field_d;

    final static boolean a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = StarCannon.field_A;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param1.length()) {
            if (param0 == 96) {
              return false;
            } else {
              field_c = -105;
              return false;
            }
          } else {
            var3 = param1.charAt(var2);
            if (!eh.a((char) var3, false)) {
              if (!wc.a(48, (char) var3)) {
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

    final static int a(int param0, int param1, int param2) {
        if (param0 != 64) {
            return 110;
        }
        int var3 = param2 >> 689455647 & param1 - 1;
        return var3 + ((param2 >>> -1931279585) + param2) % param1;
    }

    final static void a(int param0) {
        re.a(param0 ^ param0);
        if (kj.field_E != null) {
            wf.a(kj.field_E, false);
        }
        te.a((byte) 98);
        li.a(1392);
        vf.a(79);
        if (jb.b(param0 + -127)) {
            d.field_b.d((byte) 76, 1);
            nf.a(0, (byte) 95);
        }
        ec.a((byte) 27);
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        int var1 = -33 / ((param0 - -66) / 38);
    }

    final static void a(int param0, we param1, int param2) {
        ia var3 = d.field_b;
        var3.d((byte) 73, param2);
        var3.a(2, -111);
        var3.a(param0, -73);
        var3.a(param1.field_g, -86);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Collecting the same power-up as the currently active laser will increase the power of all your weapons.";
        field_b = 64;
        field_c = 0;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    int field_a;
    static String field_b;

    final static void a(int param0) {
        fh.a(-55);
        if (param0 != -17634) {
            return;
        }
        jg.field_d = true;
        fk.field_D = true;
        nb.field_a.i(-106);
        wf.a(dh.field_c, false, false);
    }

    public static void a(byte param0) {
        if (param0 >= -26) {
            re.a((byte) 91);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static String a(byte param0, int param1, rh param2, String param3, String param4) {
        if (param0 <= 125) {
            field_b = null;
            if (!(param2.b((byte) -106))) {
                return param4;
            }
            return param3 + " - " + param2.b(param1, -2) + "%";
        }
        if (!(param2.b((byte) -106))) {
            return param4;
        }
        return param3 + " - " + param2.b(param1, -2) + "%";
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 0;
        Object var4 = null;
        if (param2) {
          var4 = null;
          String discarded$2 = re.a((byte) 110, 3, (rh) null, (String) null, (String) null);
          var3 = param0 >>> 1846747487;
          return (param0 - -var3) / param1 - var3;
        } else {
          var3 = param0 >>> 1846747487;
          return (param0 - -var3) / param1 - var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0>Teleporter:<%1> these always come in pairs, and teleport the fleas back and forth.";
    }
}

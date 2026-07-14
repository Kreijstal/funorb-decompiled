/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static String field_e;
    static jp field_b;
    static jp field_d;
    static volatile long field_c;
    static String field_a;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = param2 >> 342261439 & -1 + param1;
        if (param0 != -1560508993) {
          field_e = null;
          return var3 + ((param2 >>> -1560508993) + param2) % param1;
        } else {
          return var3 + ((param2 >>> -1560508993) + param2) % param1;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != -121) {
          int discarded$2 = er.a(-124, 122, -66);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_c = 0L;
        field_a = "Accept draw";
    }
}

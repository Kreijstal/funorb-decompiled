/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static ph[] field_b;
    static volatile int field_a;
    static String[] field_c;
    static String field_d;

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (mk.a(param1, param2, (byte) 64)) {
          var3 = 0;
          L0: while (true) {
            if (param2.length() > var3) {
              if (rp.a(param2.charAt(var3), (byte) -107)) {
                var3++;
                continue L0;
              } else {
                return false;
              }
            } else {
              var4 = 108 % ((param0 - 72) / 33);
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static java.awt.Container a(int param0) {
        if (null != ad.field_d) {
            return (java.awt.Container) (Object) ad.field_d;
        }
        if (param0 != 0) {
            java.awt.Container discarded$0 = ua.a(-74);
            return (java.awt.Container) (Object) m.c(true);
        }
        return (java.awt.Container) (Object) m.c(true);
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_d = null;
        field_c = null;
        if (param0 != 103) {
          var2 = null;
          boolean discarded$2 = ua.a((byte) 109, true, (CharSequence) null);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = new String[]{"Fickle", "Leaves stable if fail any raid."};
        field_d = "Cave Troll";
    }
}

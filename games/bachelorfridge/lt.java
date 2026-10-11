/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lt {
    static kv field_a;
    static int field_b;
    static String field_c;

    public static void b(byte param0) {
        field_c = null;
        if (param0 >= -4) {
          lt.b((byte) 37);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static boolean a(byte param0) {
        if (param0 != 99) {
          field_c = (String) null;
          if (null == dma.field_b) {
            return false;
          }
          if (eia.field_a.a(23716)) {
            return true;
          }
          return false;
        }
        if (null == dma.field_b) {
          return false;
        }
        if (eia.field_a.a(23716)) {
          return true;
        }
        return false;
    }

    final static boolean b(int param0, int param1) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 != 28427) {
          lt.b((byte) -113);
          var2 = lka.field_E[param1][17];
          var2 = var2.trim();
          var2 = var2.toLowerCase();
          if (!var2.equals("yes")) {
            return false;
          }
          return true;
        }
        var2Lifetime1 = lka.field_E[param1][17];
        var2Lifetime1 = var2Lifetime1.trim();
        var2Lifetime1 = var2Lifetime1.toLowerCase();
        if (!var2Lifetime1.equals("yes")) {
          return false;
        }
        return true;
    }

    static {
        field_b = 0;
        field_c = "RuneScape clan";
    }
}

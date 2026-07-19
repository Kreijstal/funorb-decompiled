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
        if (param0 == 99) {
          if (null != dma.field_b) {
            if (!eia.field_a.a(23716)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_c = (String) null;
          if (null != dma.field_b) {
            if (!eia.field_a.a(23716)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean b(int param0, int param1) {
        String var2 = null;
        if (param0 == 28427) {
          var2 = lka.field_E[param1][17];
          var2 = var2.trim();
          var2 = var2.toLowerCase();
          if (var2.equals("yes")) {
            return true;
          } else {
            return false;
          }
        } else {
          lt.b((byte) -113);
          var2 = lka.field_E[param1][17];
          var2 = var2.trim();
          var2 = var2.toLowerCase();
          if (var2.equals("yes")) {
            return true;
          } else {
            return false;
          }
        }
    }

    static {
        field_b = 0;
        field_c = "RuneScape clan";
    }
}

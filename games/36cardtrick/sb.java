/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static int field_a;
    static String[] field_b;

    public static void a(boolean param0) {
        if (param0) {
            String discarded$0 = sb.a(-48);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = Main.field_T;
        if (param3 >= 82) {
          var4 = param0.indexOf(param1);
          L0: while (true) {
            if (var4 == -1) {
              return param0;
            } else {
              param0 = param0.substring(0, var4) + param2 + param0.substring(param1.length() + var4);
              var4 = param0.indexOf(param1, var4 + param2.length());
              continue L0;
            }
          }
        } else {
          field_a = 88;
          var4 = param0.indexOf(param1);
          L1: while (true) {
            if (var4 == -1) {
              return param0;
            } else {
              param0 = param0.substring(0, var4) + param2 + param0.substring(param1.length() + var4);
              var4 = param0.indexOf(param1, var4 + param2.length());
              continue L1;
            }
          }
        }
    }

    final static String a(int param0) {
        if (param0 != -3871) {
            field_a = 86;
            return rd.field_j.c(false);
        }
        return rd.field_j.c(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}

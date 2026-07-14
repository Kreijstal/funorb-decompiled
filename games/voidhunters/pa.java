/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static llb field_a;
    static String field_c;
    static int field_b;

    final static void a(int param0, byte param1, int param2) {
        faa var3 = null;
        Object var4 = null;
        if (param1 >= -82) {
          var4 = null;
          boolean discarded$2 = pa.a(-92, -5, (asb) null, 15);
          var3 = dpa.field_p;
          var3.h(24335, param0);
          var3.c(0, 3);
          var3.c(0, 8);
          var3.a(param2, true);
          return;
        } else {
          var3 = dpa.field_p;
          var3.h(24335, param0);
          var3.c(0, 3);
          var3.c(0, 8);
          var3.a(param2, true);
          return;
        }
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + sh.a("\n", "%0a", param0, 0));
        if (param1 != 3) {
            pa.a(111);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 2) {
            field_a = null;
        }
    }

    final static boolean a(int param0, int param1, asb param2, int param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        if (param1 == 2) {
          var5 = param2.a(param0, param3, (byte) 13);
          var4 = var5;
          if (var5 == null) {
            return false;
          } else {
            wab.a(0, var5);
            return true;
          }
        } else {
          pa.a(36);
          var5 = param2.a(param0, param3, (byte) 13);
          var4 = var5;
          if (var5 == null) {
            return false;
          } else {
            wab.a(0, var5);
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        lob discarded$0 = new lob();
        field_c = "Hull piece";
    }
}

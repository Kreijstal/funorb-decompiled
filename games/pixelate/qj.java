/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static tc field_e;
    static boolean field_b;
    static int[] field_a;
    static long field_d;
    static String field_c;

    final static void a(String param0, long param1, byte param2) {
        CharSequence var5 = null;
        jo.field_k = param0;
        if (param2 != 8) {
          return;
        } else {
          ce.field_d = 2;
          var5 = (CharSequence) (Object) param0;
          fp.field_d = dh.a(var5, (byte) 74);
          fp.field_e = param1;
          ib.b(param2 ^ 20550);
          return;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        pc var3 = null;
        if (param0) {
          qj.a(false);
          var3 = aa.field_f;
          var3.g(param2, 15514);
          var3.e(160, 3);
          var3.e(160, 10);
          var3.b(1276387944, param1);
          return;
        } else {
          var3 = aa.field_f;
          var3.g(param2, 15514);
          var3.e(160, 3);
          var3.e(160, 10);
          var3.b(1276387944, param1);
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_e = null;
        field_a = null;
        if (param0) {
            field_e = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Puzzle Failed!";
    }
}

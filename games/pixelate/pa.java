/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int[][] field_a;
    static int field_b;

    final static id a(int param0, String param1, byte param2) {
        id var3 = null;
        if (param2 > -96) {
          field_b = 1;
          var3 = new id(false);
          var3.field_c = param1;
          var3.field_a = param0;
          return var3;
        } else {
          var3 = new id(false);
          var3.field_c = param1;
          var3.field_a = param0;
          return var3;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 8) {
            Object var2 = null;
            id discarded$0 = pa.a(-122, (String) null, (byte) -98);
        }
    }

    static {
    }
}

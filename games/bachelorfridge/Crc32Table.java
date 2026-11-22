/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Crc32Table {
    static du field_b;
    static int[] lookupTable;
    static String field_c;
    static qia field_a;

    final static void a(int param0, byte param1) {
        if (!af.field_a) {
          return;
        }
        bf.field_h[CreatureType.field_n].a(param0, (byte) 73);
        int var2 = 56 / ((param1 - 49) / 47);
    }

    public static void releaseStatics(boolean param0) {
        field_c = null;
        field_b = null;
        lookupTable = null;
        field_a = null;
        if (param0) {
          field_a = (qia) null;
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_b = new du(6, 0, 4, 2);
        field_c = "From only <%0>/month";
        lookupTable = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if (1 == (1 & var0)) {
              var0 = var0 >>> 1 ^ -306674912;
            } else {
              var0 = var0 >>> 1;
            }
          }
          lookupTable[var1] = var0;
        }
        field_a = new qia();
    }
}

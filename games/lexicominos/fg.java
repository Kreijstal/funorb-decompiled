/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static RgbSprite[] field_e;
    static String field_a;
    static int[] field_f;
    static wh field_c;
    static String field_d;
    static boolean field_b;

    public static void clearStaticReferences(int param0) {
        field_e = null;
        field_a = null;
        if (param0 == 24) {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
        field_a = (String) null;
        field_f = null;
        field_d = null;
        field_c = null;
    }

    final static void a(byte param0) {
        try {
          int var1 = 0;
          Exception var2 = null;
          Throwable decompiledCaughtException = null;
          var1 = 4 % ((41 - param0) / 63);
          if (InteractiveWidget.field_y != null) {
            try {
              InteractiveWidget.field_y.seek((byte) 40, 0L);
              InteractiveWidget.field_y.write(ig.field_a.position, ig.field_a.payload, 24, -31593);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (Exception) (Object) decompiledCaughtException;
            }
          }
          ig.field_a.position = ig.field_a.position + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Loading languages";
        field_d = "Email: ";
        field_f = new int[256];
    }
}

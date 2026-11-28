/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static RgbSprite[] field_b;
    static int field_c;
    static String field_a;

    final static bl a(int param0) {
        if (param0 == 0) {
          if (TextLineMetrics.field_h == null) {
            TextLineMetrics.field_h = new bl();
            TextLineMetrics.field_h.a(lm.field_f, -2699);
            TextLineMetrics.field_h.field_j = StandardContentDialog.field_bb;
            TextLineMetrics.field_h.field_r = 7697781;
            TextLineMetrics.field_h.field_d = 4;
            TextLineMetrics.field_h.field_a = 5;
            TextLineMetrics.field_h.field_o = 0;
            TextLineMetrics.field_h.field_h = 6;
            TextLineMetrics.field_h.field_i = 14;
            TextLineMetrics.field_h.field_k = 2763306;
          }
          return TextLineMetrics.field_h;
        }
        field_a = (String) null;
        if (TextLineMetrics.field_h == null) {
          TextLineMetrics.field_h = new bl();
          TextLineMetrics.field_h.a(lm.field_f, -2699);
          TextLineMetrics.field_h.field_j = StandardContentDialog.field_bb;
          TextLineMetrics.field_h.field_r = 7697781;
          TextLineMetrics.field_h.field_d = 4;
          TextLineMetrics.field_h.field_a = 5;
          TextLineMetrics.field_h.field_o = 0;
          TextLineMetrics.field_h.field_h = 6;
          TextLineMetrics.field_h.field_i = 14;
          TextLineMetrics.field_h.field_k = 2763306;
        }
        return TextLineMetrics.field_h;
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 24) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (InteractiveWidget.field_y != null) {
            try {
              InteractiveWidget.field_y.seek(0L, -1);
              InteractiveWidget.field_y.write(false, NetworkArchiveRequest.field_t.payload, 24, NetworkArchiveRequest.field_t.position);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              NetworkArchiveRequest.field_t.position = NetworkArchiveRequest.field_t.position + 24;
              if (param0 > 38) {
                return;
              }
              field_b = (RgbSprite[]) null;
              return;
            }
          }
          NetworkArchiveRequest.field_t.position = NetworkArchiveRequest.field_t.position + 24;
          if (param0 <= 38) {
            field_b = (RgbSprite[]) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "CHOMPO";
    }
}

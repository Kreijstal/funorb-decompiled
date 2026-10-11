/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static int field_i;
    static int field_h;
    static String field_b;
    static String field_e;
    static int[][] field_c;
    static int field_a;
    static int field_f;
    static String field_d;
    static String field_g;
    static int field_j;

    final static void b(byte param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != -105) {
            field_b = (String) null;
          }
          if (null != va.field_h) {
            try {
              va.field_h.a(-94, 0L);
              va.field_h.a(rf.field_d.position, 24, param0 ^ -67, rf.field_d.payload);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
            }
          }
          rf.field_d.position = rf.field_d.position + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = (int[][]) null;
        field_g = null;
        int var1 = -80 / ((28 - param0) / 45);
        field_d = null;
        field_b = null;
    }

    static {
        field_i = 0;
        field_e = "Basic Combat";
        field_b = "To report a player, right-click on their name and select the option to report abuse.";
        field_a = 64;
        field_d = "Unable to add friend - system busy";
        field_c = new int[][]{null, new int[]{140, 200, 120, 210, 150, 185, 270, 180, 255, 220}, new int[]{225, 325, 200, 270, 190, 300, 270, 200, 195, 320}};
        field_g = "module:</col>";
    }
}

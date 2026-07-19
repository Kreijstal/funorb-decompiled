/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_b;
    static kb field_f;
    static int[] field_a;
    static String field_e;
    static String field_d;
    static int[] field_c;

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        if (param0 != 4) {
          field_c = (int[]) null;
          field_b = null;
          field_e = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (ff.field_H == null) {
          if (param0 != 4) {
            td.b(-24);
            return;
          } else {
            return;
          }
        } else {
          var1 = ff.field_H;
          synchronized (var1) {
            L0: {
              ff.field_H = null;
              break L0;
            }
          }
          L1: {
            if (param0 == 4) {
              break L1;
            } else {
              td.b(-24);
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_b = "OK";
        field_a = new int[4];
    }
}

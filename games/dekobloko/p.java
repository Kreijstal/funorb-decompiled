/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_c;
    static w field_b;
    static String field_d;
    static long field_a;

    public static void a(int param0) {
        if (param0 >= 104) {
          field_b = null;
          field_d = null;
          field_c = null;
          return;
        }
        field_b = (w) null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, byte param1) {
        try {
          try {
            nc.a("resizing", param1 - 14511, se.h(param1 ^ -25126), new Object[]{new Integer(param0)});
          } catch (Throwable throwable) {
          }
          if (param1 == -30) {
            return;
          }
          p.a(72, (byte) -105);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "Create unrated game";
        field_d = "Position";
    }
}

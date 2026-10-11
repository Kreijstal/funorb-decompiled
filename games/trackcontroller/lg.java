/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static char[] field_b;
    static long field_a;
    static cg[] field_d;
    static String field_c;

    final static boolean c(int param0) {
        int var2 = 0;
        kj var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        kj var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          var4 = (kj) (si.field_a.b(2));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 != -1) {
            lg.c(-128);
          }
          for (var2 = 0; var2 < var1.field_n; var2++) {
            if (null != var4.field_j[var2] &&
              var4.field_j[var2].field_f == 0) {
              return false;
            }
            if (var4.field_v[var2] != null &&
              var4.field_v[var2].field_f == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1_ref), "lg.B(" + param0 + ')');
        }
    }

    final static h a(int param0) {
        try {
          Throwable var1 = null;
          h stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          if (param0 < 54) {
            lg.c(106);
          }
          try {
            stackIn_3_0 = (h) (Class.forName("bi").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 != 16228) {
          return;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    static {
        field_b = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_c = "Click";
    }
}

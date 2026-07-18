/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lo extends IOException {
    static String[] field_c;
    static String field_b;
    static String field_d;
    static boolean field_a;

    final static nq b(int param0) {
        if (null == ae.field_c) {
          ae.field_c = new nq();
          ae.field_c.a(lc.field_O, -76);
          ae.field_c.field_m = 6;
          ae.field_c.field_b = 4;
          ae.field_c.field_i = qk.field_a;
          ae.field_c.field_a = 2763306;
          ae.field_c.field_e = 7697781;
          ae.field_c.field_h = 0;
          ae.field_c.field_g = 14;
          ae.field_c.field_d = 5;
          return ae.field_c;
        } else {
          return ae.field_c;
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_b = null;
        if (param0 < 110) {
            field_d = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static String a(long param0, int param1) {
        return di.a(param0, 16, false, -112, 6, 10);
    }

    lo(String param0) {
        super(param0);
    }

    final static int a(int param0, int param1, byte param2) {
        if (param2 < 53) {
            lo.a(85);
            return (param0 << 12) / param1;
        }
        return (param0 << 12) / param1;
    }

    final static void a(int param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (param0 < -7) {
                  break L0;
                } else {
                  field_c = null;
                  break L0;
                }
              }
              if (var1 != null) {
                try {
                  L1: {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                    rf.field_d = 1 + (int)(var3.longValue() / 1048576L);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "(1 player wants to join)";
        field_d = "Confirm Email:";
    }
}

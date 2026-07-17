/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static ll field_c;
    static ea[] field_d;
    static hm field_b;
    static String field_a;

    final static char a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param1;
        if (0 == var2) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          if (var2 >= 128) {
            if (160 <= var2) {
              return (char)var2;
            } else {
              L0: {
                var3 = tk.field_e[-128 + var2];
                if (var3 != 0) {
                  break L0;
                } else {
                  var3 = 63;
                  break L0;
                }
              }
              var2 = var3;
              return (char)var2;
            }
          } else {
            return (char)var2;
          }
        }
    }

    final static int b() {
        return me.field_j;
    }

    final static void a() {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
              if (var1_ref != null) {
                try {
                  L0: {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                    ec.field_e = 1 + (int)(var3.longValue() / 1048576L);
                    break L0;
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
              var1 = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading fonts";
    }
}

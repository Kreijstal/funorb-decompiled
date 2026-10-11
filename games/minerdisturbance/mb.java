/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static ll field_c;
    static ea[] field_d;
    static hm field_b;
    static String field_a;

    final static char a(boolean param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        if (param0) {
          mb.a((byte) 124);
          var2 = 255 & param1;
          if (0 == var2) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
          if (var2 < 128) {
            return (char)var2;
          }
          if (160 > var2) {
            var3 = tk.field_e[-128 + var2];
            if (var3 == 0) {
              var3 = 63;
            }
            var2 = var3;
          }
          return (char)var2;
        }
        var2Lifetime1 = 255 & param1;
        if (0 == var2Lifetime1) {
          throw new IllegalArgumentException("" + Integer.toString(var2Lifetime1, 16));
        }
        if (var2Lifetime1 < 128) {
          return (char)var2Lifetime1;
        }
        if (160 <= var2Lifetime1) {
          return (char)var2Lifetime1;
        }
        var3Lifetime1 = tk.field_e[-128 + var2Lifetime1];
        if (var3Lifetime1 == 0) {
          var3Lifetime1 = 63;
        }
        var2Lifetime2 = var3Lifetime1;
        return (char)var2Lifetime2;
    }

    final static int b(byte param0) {
        if (param0 > -65) {
          return 51;
        }
        return me.field_j;
    }

    final static void a(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          if (param0 != -71) {
            field_d = (ea[]) null;
          }
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 == null) {
              return;
            }
            try {
              var2 = Runtime.getRuntime();
              var4 = (Object[]) null;
              var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
              ec.field_e = 1 + (int)(var3.longValue() / 1048576L);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
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

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != 30520) {
          field_d = (ea[]) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_a = "Loading fonts";
    }
}

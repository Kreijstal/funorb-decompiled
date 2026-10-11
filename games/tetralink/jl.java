/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static je field_a;
    static int field_e;
    static String[] field_b;
    static String field_d;
    static String field_c;

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 != -25534) {
          jl.a(69);
        }
        field_c = null;
    }

    final static boolean a(boolean param0) {
        int var2 = 0;
        nm var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        nm var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TetraLink.field_J;
        try {
          var4 = (nm) (bo.field_C.c(param0));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var2 < var1.field_r; var2++) {
            if (null != var4.field_x[var2] &&
              var4.field_x[var2].field_d == 0) {
              return false;
            }
            if (null != var4.field_u[var2] &&
              var4.field_u[var2].field_d == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref), "jl.D(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 < 108) {
          field_b = (String[]) null;
        }
        if (kd.field_g != null) {
          var1 = kd.field_g;
          synchronized (var1) {
            kd.field_g = null;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = TetraLink.field_J;
        try {
          ra.c(640 - param1 >> 1, param2 - param0 >> 1, param1, param0, 9408511);
          var3_int = -param0;
          while (true) {
            if (var3_int >= 0) {
              return;
            }
            var4 = 640 * (var3_int + (480 + param0 >> 1)) + (640 - param1 >> 1);
            var5 = param1;
            while (true) {
              var5--;
              if (0 > var5) {
                var3_int += 2;
                break;
              }
              incrementValue$1 = var4;
              var4++;
              ra.field_b[incrementValue$1] = 11513855;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "jl.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = 0;
        field_d = "<%0> has left.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String[] field_d;
    static int field_c;
    static String field_f;
    static int field_a;
    static boolean field_e;
    private tg[] field_b;

    public static void a(byte param0) {
        if (param0 == -59) {
          field_f = null;
          field_d = null;
          return;
        }
        String[] var2 = (String[]) null;
        oh.a((byte) -47, (String[]) null);
        field_f = null;
        field_d = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ve.a(param4, param0, this.field_b, (byte) -96, param2, param1);
        if (param3 != -21907) {
          field_e = true;
        }
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != lg.field_b) {
            lg.field_b.field_z.a((byte) -124, param1);
          }
          if (null != il.field_b) {
            il.field_b.field_C.a((byte) -112, param1);
          }
          if (param0 == -29) {
            return;
          }
          field_a = 86;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("oh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        ck.field_a = 0;
        if (!param0) {
          field_e = false;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = -56 / ((param0 - 26) / 52);
        m.field_g = param1;
    }

    oh(tg[] param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(boolean param0) {
        ed.field_c.a(10768, new k());
        if (!param0) {
          oh.a(true);
        }
    }

    final static void a(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          int var2 = 0;
          Runtime var3 = null;
          Throwable var3_ref = null;
          Long var4 = null;
          Object[] var5 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            var2 = -12 % ((param0 + 53) / 62);
            if (var1 != null) {
              try {
                var3 = Runtime.getRuntime();
                var5 = (Object[]) null;
                var4 = (Long) (var1.invoke((Object) (var3), (Object[]) null));
                ja.field_d = (int)(var4.longValue() / 1048576L) + 1;
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_f = "Achieved";
        field_a = 0;
    }
}

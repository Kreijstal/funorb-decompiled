/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static int[] field_f;
    static rc field_b;
    static int field_g;
    static qi field_e;
    static int field_c;
    static String field_d;
    static int field_a;
    static int[] field_h;

    final static boolean b(int param0) {
        java.applet.Applet var2;
        boolean stackIn_6_0 = false;
        if (param0 >= -100) {
          var2 = (java.applet.Applet) null;
          hi.a(-99, 17L, (String) null, (String) null, (java.applet.Applet) null);
        }
        stackIn_6_0 = (null != vg.field_b) && (vg.field_b.a(67));
        return stackIn_6_0;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 >= -41) {
          hi.a(false, -36);
        }
        stackIn_8_0 = (ck.field_I == this) || (this == pj.field_w) || (ll.field_Q == this);
        return stackIn_8_0;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_d = null;
        if (param0) {
          field_c = -26;
        }
        field_h = null;
        field_b = null;
    }

    final static void a(int param0, String param1) {
        try {
          if (param0 != -23883) {
            hi.a(true);
          }
          e.field_I = param1;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "hi.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, long param1, String param2, String param3, java.applet.Applet param4) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param4.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param2 + "=" + param3 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param1 < (long)param0) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + e.a(lk.a(0) + param1 * 1000L, (byte) -78) + "; Max-Age=" + param1;
              }
              kj.a(12, "document.cookie=\"" + var7Lifetime4 + "\"", param4);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var6_ref;
            stackIn_9_1 = new StringBuilder().append("hi.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
            if (param3 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param4 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
          return 34;
        }
        param1 = (param1 >>> 1 & 1431655765) + (1431655765 & param1);
        param1 = ((-858993458 & param1) >>> 2) + (858993459 & param1);
        param1 = (param1 >>> 4) + param1 & 252645135;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return 255 & param1;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_f = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((1 & var0) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_f[var1] = var0;
        }
        field_b = new rc();
        field_g = 0;
        field_e = new qi();
        field_d = "en-gb";
        field_a = 1;
        field_h = new int[8192];
    }
}

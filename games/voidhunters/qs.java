/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qs {
    static String field_b;
    static int field_a;
    static int field_c;

    final static void a(java.applet.Applet param0, int param1, String param2, String param3, long param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
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
              if (param1 > -99) {
                field_c = -102;
              }
              var8 = param0.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param3 + "=" + param2 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param4 < 0L) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + tnb.a((byte) 98, param4 * 1000L + wt.a(false)) + "; Max-Age=" + param4;
              }
              ia.a((byte) -122, param0, "document.cookie=\"" + var7Lifetime4 + "\"");
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("qs.A(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param3 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_b = null;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!fva.field_p) {
            return false;
          }
          if (ow.field_b == 2 &&
            nkb.field_o != null) {
            var3 = (CharSequence) ((Object) param1);
            if (!nkb.field_o.equals(jwa.a(false, var3))) {
              return false;
            }
            if (param0 == 0) {
              return true;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qs.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_a = 0;
        field_b = "Confirm Email:";
    }
}

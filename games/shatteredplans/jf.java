/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static byte[][] field_c;
    static boolean[] field_e;
    static bi field_a;
    static qr field_b;
    static String[] field_d;

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          java.applet.Applet var6 = null;
          String var7 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            cj.field_u = param1;
            try {
              var7 = param2.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              if (param0 != -25602) {
                var6 = (java.applet.Applet) null;
                jf.a(-11, (String) null, (java.applet.Applet) null);
              }
              var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              if (param1.length() == 0) {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var8 + "; Expires=" + vm.a(94608000000L + pr.a(param0 ^ -21444), param0 + 25612) + "; Max-Age=" + 94608000L;
              }
              ll.a(param2, "document.cookie=\"" + var5Lifetime6 + "\"", (byte) 123);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            h.a(-1, param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("jf.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 == -23) {
          field_b = null;
          field_c = (byte[][]) null;
          field_d = null;
          field_e = null;
          return;
        }
        jf.a(96, 113, -78);
        field_b = null;
        field_c = (byte[][]) null;
        field_d = null;
        field_e = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 79 % ((param2 - 39) / 60);
        int var4 = -1 + param0 & param1 >> 31;
        return (param1 + (param1 >>> 31)) % param0 + var4;
    }

    final static void b(byte param0) {
        bh.field_j = false;
        if (param0 == -15) {
          hm.field_p = null;
          el.field_d = null;
          kp.field_o = null;
          kd.field_b = null;
          return;
        }
        field_c = (byte[][]) null;
        hm.field_p = null;
        el.field_d = null;
        kp.field_o = null;
        kd.field_b = null;
    }

    static {
        field_c = new byte[50][];
        field_d = new String[3];
    }
}

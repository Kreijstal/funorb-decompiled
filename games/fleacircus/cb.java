/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cb extends pa {
    int field_r;
    static java.awt.Frame field_t;
    static String field_q;
    static ae field_v;
    static dd field_u;
    static el field_w;
    static String field_s;

    abstract Object g(int param0);

    abstract boolean c(byte param0);

    final static dd[] a(int param0, int param1, int param2, int param3, int param4) {
        dd[] var6 = new dd[9];
        dd[] var5 = var6;
        dd dupTemp$0 = oh.c(102, param3, param0);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[param2] = dupTemp$0;
        dd dupTemp$1 = oh.c(107, param1, param0);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param4 != 0) {
          var5[4] = oh.c(df.a(param2, 122), param4, 64);
        }
        return var5;
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String var5 = null;
          String var4 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            me.field_b = param1;
            try {
              var3 = param2.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var5Lifetime4 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
              if (param1.length() == 0) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              eb.a("document.cookie=\"" + var5Lifetime4 + "\"", -28924, param2);
              int var6 = -73 / ((-61 - param0) / 43);
            } catch (Throwable throwable) {
            }
            bf.a(32010, param2);
          } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "cb.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    cb(int param0) {
        this.field_r = param0;
    }

    final static String a(String param0, String param1, rh param2, byte param3) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 13) {
            cb.a(-76, -116, -108, 42, -102);
          }
          if (!param2.b((byte) -120)) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = param1 + " - " + param2.a((byte) -111) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cb.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
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
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_w = null;
        field_u = null;
        field_s = null;
        if (param0 >= -37) {
          return;
        }
        field_t = null;
        field_v = null;
        field_q = null;
    }

    static {
        field_q = "Unpacking music";
        field_s = "To Customer Support";
    }
}

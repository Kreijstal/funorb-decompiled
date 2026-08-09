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
        if (!(param4 == 0)) {
            var5[4] = oh.c(df.a(param2, 122), param4, 64);
        }
        return var5;
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            try {
                me.field_b = param1;
                try {
                    var3 = param2.getParameter("cookieprefix");
                    var5 = var3;
                    var5 = var3;
                    var4 = param2.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                    if (param1.length() == 0) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    eb.a("document.cookie=\"" + var5 + "\"", -28924, param2);
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 13) {
                break L1;
              } else {
                cb.a(-76, -116, -108, 42, -102);
                break L1;
              }
            }
            if (!param2.b((byte) -120)) {
              stackIn_5_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param1 + " - " + param2.a((byte) -111) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("cb.H(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
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

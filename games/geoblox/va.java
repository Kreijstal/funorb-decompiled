/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static int field_b;
    static ck field_f;
    static boolean field_d;
    static al field_e;
    static int field_a;
    static tf field_c;

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                me.field_j = param0;
                try {
                    var3 = param1.getParameter("cookieprefix");
                    var4 = param1.getParameter("cookiehost");
                    var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    if (!((param0.length() ^ -1) != param2)) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    wk.a(param1, "document.cookie=\"" + var5 + "\"", (byte) -92);
                } catch (Throwable throwable) {
                }
                oj.a(param1, 20000000);
            } catch (RuntimeException runtimeException) {
                throw t.a((Throwable) ((Object) runtimeException), "va.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static dm[] a(int param0, byte param1) {
        if (param1 != -112) {
            field_e = (al) null;
        }
        dm[] var3 = new dm[9];
        dm[] var2 = var3;
        var3[4] = ef.a(0, param0, 64);
        return var2;
    }

    final static void a(int param0, byte[] param1, int param2, int[] param3, byte param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= ch.field_d.length) {
                L2: {
                  if (param4 == -85) {
                    break L2;
                  } else {
                    va.a(80, (byte) 55);
                    break L2;
                  }
                }
                break L0;
              } else {
                param2 = ch.field_d[var5_int];
                var6 = var5_int << -1588670812;
                L3: while (true) {
                  incrementValue$4 = param2;
                  param2--;
                  if (0 == incrementValue$4) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$5 = var6;
                    var6++;
                    param0 = pj.field_i[incrementValue$5];
                    dupTemp$6 = param1[param0];
                    dupTemp$7 = param3[dupTemp$6];
                    param3[dupTemp$6] = dupTemp$7 + 1;
                    pj.field_i[dupTemp$7] = param0;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("va.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    static {
        field_d = false;
        field_f = new ck(14, 0, 4, 1);
        field_e = new al();
    }
}

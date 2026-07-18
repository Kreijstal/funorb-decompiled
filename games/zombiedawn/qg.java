/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class qg {
    static int field_c;
    static boolean field_d;
    static int field_f;
    int field_b;
    static int[] field_a;
    static String field_h;
    String field_e;
    static String[] field_g;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            int var2_int = 94 % ((param1 - 9) / 62);
            pl.a("", (byte) 71, param0);
            fo.a(38205, param0);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "qg.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract java.net.Socket a(boolean param0) throws IOException;

    public static void a() {
        field_g = null;
        field_a = null;
        field_h = null;
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                nj.field_X = param2;
                try {
                  L1: {
                    L2: {
                      var6 = param1.getParameter("cookieprefix");
                      var5 = var6;
                      var5 = var6;
                      var4 = param1.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                      var5 = var7;
                      var5 = var7;
                      if (param2.length() == 0) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      } else {
                        var5 = var7 + "; Expires=" + jb.a(2147483647, 94608000000L + pd.a(-22826)) + "; Max-Age=" + 94608000L;
                        break L2;
                      }
                    }
                    qe.a("document.cookie=\"" + var5 + "\"", param1, (byte) 63);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    break L3;
                  }
                }
                int discarded$2 = 1;
                hl.a(param1);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3_ref;
                stackOut_11_1 = new StringBuilder().append("qg.J(").append(165).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              L5: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 16076) {
            return null;
        }
        return new java.net.Socket(((qg) this).field_e, ((qg) this).field_b);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_g = new String[]{"Gah. They're not going to be enough. You'll need to do better next time!", "These humans are dwindling too fast! You won't be able to finish the level.", "No, this just won't do. Not enough humans left!"};
        field_d = false;
        field_h = "Achievements";
        field_a = new int[]{165, 400, 370, 463};
    }
}

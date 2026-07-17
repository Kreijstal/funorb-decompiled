/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc implements ad {
    private int field_d;
    static boolean field_e;
    private int field_a;
    static String field_b;
    private we field_c;

    final static void a(java.applet.Applet param0, String param1, byte param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            try {
                nj.field_a = param1;
                try {
                    var6 = param0.getParameter("cookieprefix");
                    var5 = var6;
                    var5 = var6;
                    var4 = param0.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    if (param2 < 66) {
                        field_b = null;
                    }
                    var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                    var5 = var7;
                    var5 = var7;
                    if (param1.length() == 0) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var5 = var7 + "; Expires=" + e.a(sf.a((byte) -122) - -94608000000L, -127) + "; Max-Age=" + 94608000L;
                    }
                    lk.a(param0, "document.cookie=\"" + var5 + "\"", (byte) -106);
                } catch (Throwable throwable) {
                }
                ie.a(param0, true);
            } catch (RuntimeException runtimeException) {
                throw lj.a((Throwable) (Object) runtimeException, "nc.A(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        int var1 = -96 % ((33 - param0) / 63);
        field_b = null;
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              L2: {
                if (param2.field_x) {
                  break L2;
                } else {
                  if (param2.k(param0 + -12174)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 2188450;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_5_0;
              if (param0 == 12088) {
                break L3;
              } else {
                field_b = null;
                break L3;
              }
            }
            int discarded$1 = ((nc) this).field_c.a("<u=" + Integer.toString(var6_int, 16) + ">" + param2.field_s + "</u>", param1 - -param2.field_u, param2.field_t + param3, param2.field_v, param2.field_q, var6_int, -1, ((nc) this).field_a, ((nc) this).field_d, ((nc) this).field_c.field_I + ((nc) this).field_c.field_E);
            if (param2.k(-105)) {
              L4: {
                var7 = ((nc) this).field_c.a(param2.field_s);
                var8 = ((nc) this).field_c.field_E + ((nc) this).field_c.field_I;
                var9 = param2.field_u + param1;
                var10 = param3 - -param2.field_t;
                if (((nc) this).field_a != 2) {
                  if (1 == ((nc) this).field_a) {
                    var9 = var9 + (param2.field_v + -var7 >> 1);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  var9 = var9 + (-var7 + param2.field_v);
                  break L4;
                }
              }
              L5: {
                if (-3 != ((nc) this).field_d) {
                  if (-2 != ((nc) this).field_d) {
                    break L5;
                  } else {
                    var10 = var10 + (-var8 + param2.field_q >> 1);
                    break L5;
                  }
                } else {
                  var10 = var10 + (param2.field_q + -var8);
                  break L5;
                }
              }
              se.c(-2 + var9, 2, var10 - -2, 4 + var7, var8);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("nc.B(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public nc() {
        ((nc) this).field_a = 1;
        ((nc) this).field_d = 1;
        ((nc) this).field_c = bn.field_d;
    }

    nc(we param0, int param1, int param2) {
        try {
            ((nc) this).field_c = param0;
            ((nc) this).field_a = param1;
            ((nc) this).field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "nc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_b = "Here Lies Crushed";
    }
}

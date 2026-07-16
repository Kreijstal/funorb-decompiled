/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static fn[] field_e;
    static int field_d;
    static bn field_a;
    static int field_b;
    static String field_c;

    final static boolean a(int param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -40) {
            break L0;
          } else {
            var2 = null;
            String discarded$2 = m.a((java.applet.Applet) null, (byte) 61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == lj.field_a) {
              break L2;
            } else {
              if (!tb.field_f.a((byte) -121)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            Object stackIn_3_0 = null;
            String stackIn_10_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_9_0 = null;
            Object stackOut_2_0 = null;
            var8 = Chess.field_G;
            try {
              L0: {
                var9 = param0.getParameter("cookieprefix");
                var3 = var9 + "settings";
                var4 = (String) u.a(true, "getcookies", param0);
                if (param1 == 87) {
                  var5 = gl.a((byte) -118, ';', var4);
                  var6 = 0;
                  L1: while (true) {
                    if (var6 >= var5.length) {
                      break L0;
                    } else {
                      L2: {
                        var7 = var5[var6].indexOf('=');
                        if (var7 < 0) {
                          break L2;
                        } else {
                          if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                            stackOut_9_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var6++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_2_0 = null;
                  stackIn_3_0 = stackOut_2_0;
                  return (String) (Object) stackIn_3_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = decompiledCaughtException;
                break L3;
              }
            }
            if (wg.field_p != null) {
              return wg.field_p;
            } else {
              return param0.getParameter("settings");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = null;
        }
        field_c = null;
        field_e = null;
    }

    final static void a(int param0, int param1) {
        int var3 = Chess.field_G;
        if (param1 != 0) {
            field_a = null;
        }
        dc var4 = (dc) (Object) fa.field_j.g(param1 + -18110);
        while (var4 != null) {
            bh.a(var4, (byte) 46, param0);
            var4 = (dc) (Object) fa.field_j.a((byte) -92);
        }
        pa var5 = (pa) (Object) ve.field_Nb.g(param1 ^ -18110);
        while (var5 != null) {
            ri.a(param1 + -1281, var5, param0);
            var5 = (pa) (Object) ve.field_Nb.a((byte) -111);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait...";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nt {
    static int field_a;
    static String field_c;
    static int field_d;
    static int field_b;

    final static cn a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
            ppa var6 = null;
            IOException var6_ref = null;
            ppa var7 = null;
            js var8 = null;
            Object var9 = null;
            cn stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            cn stackOut_13_0 = null;
            try {
              L0: {
                var6 = null;
                var7 = null;
                if (oi.field_a.field_n == null) {
                  break L0;
                } else {
                  wka.field_c = new ph(oi.field_a.field_n, 5200, 0);
                  oi.field_a.field_n = null;
                  var6 = new ppa(255, wka.field_c, new ph(oi.field_a.field_q, 12000, 0), 2097152);
                  break L0;
                }
              }
              L1: {
                if (wka.field_c != null) {
                  L2: {
                    if (tna.field_c != null) {
                      break L2;
                    } else {
                      tna.field_c = new ph[oi.field_a.field_h.length];
                      break L2;
                    }
                  }
                  L3: {
                    if (null != tna.field_c[param0]) {
                      break L3;
                    } else {
                      tna.field_c[param0] = new ph(oi.field_a.field_h[param0], 12000, 0);
                      oi.field_a.field_h[param0] = null;
                      break L3;
                    }
                  }
                  var7 = new ppa(param0, wka.field_c, tna.field_c[param0], 2097152);
                  break L1;
                } else {
                  break L1;
                }
              }
              L4: {
                if (param2 == 5200) {
                  break L4;
                } else {
                  var9 = null;
                  nt.a((java.applet.Applet) null, 34);
                  break L4;
                }
              }
              L5: {
                var8 = uja.field_a.a(var7, param0, var6, param4, param2 ^ 5167);
                if (!param3) {
                  break L5;
                } else {
                  var8.a((byte) 115);
                  break L5;
                }
              }
              stackOut_13_0 = new cn((dr) (Object) var8, param5, param1);
              stackIn_14_0 = stackOut_13_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_14_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            field_a = -25;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (param1 != -1978) {
                    nt.a(true);
                }
                if ((var3 ^ -1) <= -1) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(sda.a(param0, -1, var5), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Buying or selling an account";
        field_a = 0;
        field_b = -1;
    }
}

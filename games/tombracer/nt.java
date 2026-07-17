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
            Object var6 = null;
            Object var7 = null;
            js var8 = null;
            Object var9 = null;
            cn stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            cn stackOut_13_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (oi.field_a.field_n == null) {
                    break L1;
                  } else {
                    wka.field_c = new ph(oi.field_a.field_n, 5200, 0);
                    oi.field_a.field_n = null;
                    var6 = (Object) (Object) new ppa(255, wka.field_c, new ph(oi.field_a.field_q, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  if (wka.field_c != null) {
                    L3: {
                      if (tna.field_c != null) {
                        break L3;
                      } else {
                        tna.field_c = new ph[oi.field_a.field_h.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (null != tna.field_c[param0]) {
                        break L4;
                      } else {
                        tna.field_c[param0] = new ph(oi.field_a.field_h[param0], 12000, 0);
                        oi.field_a.field_h[param0] = null;
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new ppa(param0, wka.field_c, tna.field_c[param0], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  if (param2 == 5200) {
                    break L5;
                  } else {
                    var9 = null;
                    nt.a((java.applet.Applet) null, 34);
                    break L5;
                  }
                }
                L6: {
                  var8 = uja.field_a.a((ppa) var7, param0, (ppa) var6, param4, param2 ^ 5167);
                  if (!param3) {
                    break L6;
                  } else {
                    var8.a((byte) 115);
                    break L6;
                  }
                }
                stackOut_13_0 = new cn((dr) (Object) var8, param5, param1);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_14_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = param0.getDocumentBase().getFile();
                    var4 = var2;
                    var4 = var2;
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (param1 == -1978) {
                      break L1;
                    } else {
                      nt.a(true);
                      break L1;
                    }
                  }
                  L2: {
                    if (var3 < 0) {
                      break L2;
                    } else {
                      var4 = var4 + var2.substring(var3);
                      break L2;
                    }
                  }
                  var5 = new java.net.URL(param0.getCodeBase(), var4);
                  param0.getAppletContext().showDocument(sda.a(param0, -1, var5), "_self");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var2_ref2;
                stackOut_8_1 = new StringBuilder().append("nt.C(");
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L3;
                } else {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L3;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
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

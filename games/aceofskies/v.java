/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class v {
    static kp field_b;
    static boolean field_a;

    final static void a(String param0, byte param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            en var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            rk stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            rk stackIn_16_0 = null;
            int stackIn_16_1 = 0;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            java.net.URL stackIn_16_4 = null;
            StringBuilder stackIn_16_5 = null;
            rk stackIn_17_0 = null;
            int stackIn_17_1 = 0;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            java.net.URL stackIn_17_4 = null;
            StringBuilder stackIn_17_5 = null;
            String stackIn_17_6 = null;
            Throwable decompiledCaughtException = null;
            rk stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            rk stackOut_16_0 = null;
            int stackOut_16_1 = 0;
            java.net.URL stackOut_16_2 = null;
            java.net.URL stackOut_16_3 = null;
            java.net.URL stackOut_16_4 = null;
            StringBuilder stackOut_16_5 = null;
            String stackOut_16_6 = null;
            rk stackOut_15_0 = null;
            int stackOut_15_1 = 0;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            java.net.URL stackOut_15_4 = null;
            StringBuilder stackOut_15_5 = null;
            String stackOut_15_6 = null;
            var6 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param2 != null) {
                    var3_ref = br.a(param2, (byte) -29);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 != null) {
                    L3: {
                      if (param2 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                jb.a(var3_ref, 20164);
                var7 = eh.a(":", 113, "%3a", var3_ref);
                var8 = eh.a("@", -77, "%40", var7);
                var9 = eh.a("&", 113, "%26", var8);
                var10 = eh.a("#", 118, "%23", var9);
                if (null == fb.field_c) {
                  return;
                } else {
                  L4: {
                    stackOut_14_0 = mj.field_a;
                    stackOut_14_1 = 70;
                    stackOut_14_2 = null;
                    stackOut_14_3 = null;
                    stackOut_14_4 = fb.field_c.getCodeBase();
                    stackOut_14_5 = new StringBuilder().append("clienterror.ws?c=").append(bs.field_c).append("&u=");
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    stackIn_16_4 = stackOut_14_4;
                    stackIn_16_5 = stackOut_14_5;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    stackIn_15_4 = stackOut_14_4;
                    stackIn_15_5 = stackOut_14_5;
                    if (co.field_g == null) {
                      stackOut_16_0 = (rk) (Object) stackIn_16_0;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = null;
                      stackOut_16_3 = null;
                      stackOut_16_4 = (java.net.URL) (Object) stackIn_16_4;
                      stackOut_16_5 = (StringBuilder) (Object) stackIn_16_5;
                      stackOut_16_6 = "" + dl.field_o;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      stackIn_17_4 = stackOut_16_4;
                      stackIn_17_5 = stackOut_16_5;
                      stackIn_17_6 = stackOut_16_6;
                      break L4;
                    } else {
                      stackOut_15_0 = (rk) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = null;
                      stackOut_15_3 = null;
                      stackOut_15_4 = (java.net.URL) (Object) stackIn_15_4;
                      stackOut_15_5 = (StringBuilder) (Object) stackIn_15_5;
                      stackOut_15_6 = co.field_g;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      stackIn_17_4 = stackOut_15_4;
                      stackIn_17_5 = stackOut_15_5;
                      stackIn_17_6 = stackOut_15_6;
                      break L4;
                    }
                  }
                  var4 = ((rk) (Object) stackIn_17_0).a((byte) stackIn_17_1, new java.net.URL(stackIn_17_4, stackIn_17_6 + "&v1=" + rk.field_o + "&v2=" + rk.field_l + "&e=" + var10));
                  L5: while (true) {
                    if (var4.field_a != 0) {
                      L6: {
                        if (var4.field_a != 1) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) var4.field_f;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      wf.a(1L, false);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var4 = param1.getCodeBase();
                var3 = jf.a(param1, var4, 70).getFile();
                Object discarded$6 = fe.a("updatelinks", -15201, new Object[2], param1);
                Object discarded$7 = fe.a("updatelinks", -15201, new Object[2], param1);
                Object discarded$8 = fe.a("updatelinks", -15201, new Object[2], param1);
                Object discarded$9 = fe.a("updatelinks", -15201, new Object[2], param1);
                Object discarded$10 = fe.a("updatelinks", -15201, new Object[2], param1);
                Object discarded$11 = fe.a("updatelinks", -15201, new Object[2], param1);
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("v.C(").append(true).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new kp();
    }
}

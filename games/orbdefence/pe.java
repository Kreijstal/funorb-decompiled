/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

abstract class pe {
    static byte[][] field_a;
    static String field_c;
    static im field_b;

    abstract void a(int param0, java.awt.Component param1);

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, int param1);

    final static void a(byte param0, Throwable param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            eb var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            be stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            be stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            be stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            String stackIn_16_5 = null;
            Throwable decompiledCaughtException = null;
            be stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            be stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            String stackOut_15_5 = null;
            be stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            String stackOut_14_5 = null;
            var6 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param1 != null) {
                    var3_ref = vi.a(41, param1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2 != null) {
                    L3: {
                      if (param1 != null) {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                int discarded$2 = 98;
                ae.a(var3_ref);
                var7 = hg.a(var3_ref, "%3a", ":", (byte) -36);
                var8 = hg.a(var7, "%40", "@", (byte) -67);
                var9 = hg.a(var8, "%26", "&", (byte) -61);
                var10 = hg.a(var9, "%23", "#", (byte) -34);
                if (null == cg.field_f) {
                  return;
                } else {
                  L4: {
                    stackOut_13_0 = df.field_e;
                    stackOut_13_1 = null;
                    stackOut_13_2 = null;
                    stackOut_13_3 = cg.field_f.getCodeBase();
                    stackOut_13_4 = new StringBuilder().append("clienterror.ws?c=").append(lm.field_d).append("&u=");
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_15_3 = stackOut_13_3;
                    stackIn_15_4 = stackOut_13_4;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    stackIn_14_4 = stackOut_13_4;
                    if (null != th.field_b) {
                      stackOut_15_0 = (be) (Object) stackIn_15_0;
                      stackOut_15_1 = null;
                      stackOut_15_2 = null;
                      stackOut_15_3 = (java.net.URL) (Object) stackIn_15_3;
                      stackOut_15_4 = (StringBuilder) (Object) stackIn_15_4;
                      stackOut_15_5 = th.field_b;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      stackIn_16_3 = stackOut_15_3;
                      stackIn_16_4 = stackOut_15_4;
                      stackIn_16_5 = stackOut_15_5;
                      break L4;
                    } else {
                      stackOut_14_0 = (be) (Object) stackIn_14_0;
                      stackOut_14_1 = null;
                      stackOut_14_2 = null;
                      stackOut_14_3 = (java.net.URL) (Object) stackIn_14_3;
                      stackOut_14_4 = (StringBuilder) (Object) stackIn_14_4;
                      stackOut_14_5 = "" + el.field_F;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      stackIn_16_3 = stackOut_14_3;
                      stackIn_16_4 = stackOut_14_4;
                      stackIn_16_5 = stackOut_14_5;
                      break L4;
                    }
                  }
                  var4 = ((be) (Object) stackIn_16_0).a(new java.net.URL(stackIn_16_3, stackIn_16_5 + "&v1=" + be.field_s + "&v2=" + be.field_j + "&e=" + var10), (byte) -49);
                  L5: while (true) {
                    if (var4.field_a != 0) {
                      if (var4.field_a == 1) {
                        var5 = (DataInputStream) var4.field_g;
                        int discarded$3 = var5.read();
                        var5.close();
                        break L0;
                      } else {
                        return;
                      }
                    } else {
                      hb.a(1L, 110);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 105) {
            pe.b(119);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Suggested names: ";
        field_a = new byte[250][];
        field_b = new im();
    }
}

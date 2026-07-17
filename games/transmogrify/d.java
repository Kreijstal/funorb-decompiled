/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.URL;
import java.lang.String;

final class d {
    static Random field_c;
    static pl field_e;
    static int[] field_a;
    static oa field_d;
    static int[] field_b;

    final static void a(Throwable param0, int param1, String param2) {
        try {
            int var3 = 0;
            Exception var4 = null;
            String var4_ref = null;
            ib var5 = null;
            DataInputStream var6 = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            fe stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            java.net.URL stackIn_11_4 = null;
            StringBuilder stackIn_11_5 = null;
            fe stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            fe stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            String stackIn_13_6 = null;
            Throwable decompiledCaughtException = null;
            fe stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            java.net.URL stackOut_10_4 = null;
            StringBuilder stackOut_10_5 = null;
            fe stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            fe stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            String stackOut_11_6 = null;
            var7 = Transmogrify.field_A ? 1 : 0;
            var3 = 90 % ((param1 - -65) / 45);
            try {
              L0: {
                L1: {
                  var4_ref = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    int discarded$2 = 0;
                    var4_ref = rk.a(param0);
                    break L1;
                  }
                }
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 != null) {
                        var4_ref = var4_ref + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4_ref = var4_ref + param2;
                    break L2;
                  }
                }
                fc.a(121, var4_ref);
                var8 = mg.a(":", false, "%3a", var4_ref);
                var9 = mg.a("@", false, "%40", var8);
                var10 = mg.a("&", false, "%26", var9);
                var11 = mg.a("#", false, "%23", var10);
                if (re.field_i != null) {
                  L4: {
                    stackOut_10_0 = f.field_b;
                    stackOut_10_1 = -21377;
                    stackOut_10_2 = null;
                    stackOut_10_3 = null;
                    stackOut_10_4 = re.field_i.getCodeBase();
                    stackOut_10_5 = new StringBuilder().append("clienterror.ws?c=").append(gh.field_h).append("&u=");
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    stackIn_12_5 = stackOut_10_5;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    stackIn_11_3 = stackOut_10_3;
                    stackIn_11_4 = stackOut_10_4;
                    stackIn_11_5 = stackOut_10_5;
                    if (null == mh.field_c) {
                      stackOut_12_0 = (fe) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                      stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                      stackOut_12_6 = "" + oi.field_i;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      stackIn_13_5 = stackOut_12_5;
                      stackIn_13_6 = stackOut_12_6;
                      break L4;
                    } else {
                      stackOut_11_0 = (fe) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = null;
                      stackOut_11_3 = null;
                      stackOut_11_4 = (java.net.URL) (Object) stackIn_11_4;
                      stackOut_11_5 = (StringBuilder) (Object) stackIn_11_5;
                      stackOut_11_6 = mh.field_c;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_13_3 = stackOut_11_3;
                      stackIn_13_4 = stackOut_11_4;
                      stackIn_13_5 = stackOut_11_5;
                      stackIn_13_6 = stackOut_11_6;
                      break L4;
                    }
                  }
                  var5 = ((fe) (Object) stackIn_13_0).a(stackIn_13_1, new java.net.URL(stackIn_13_4, stackIn_13_6 + "&v1=" + fe.field_w + "&v2=" + fe.field_c + "&e=" + var11));
                  L5: while (true) {
                    if (var5.field_c != 0) {
                      L6: {
                        if (var5.field_c != 1) {
                          break L6;
                        } else {
                          var6 = (DataInputStream) var5.field_g;
                          int discarded$3 = var6.read();
                          var6.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      pg.a(1L, -124);
                      continue L5;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var4 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_e = null;
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new Random();
        field_a = new int[8192];
        field_d = new oa(256);
        field_b = new int[8192];
    }
}

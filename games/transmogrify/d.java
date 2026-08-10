/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class d {
    static Random field_c;
    static pl field_e;
    static int[] field_a;
    static oa field_d;
    static int[] field_b;

    final static void a(Throwable param0, int param1, String param2) {
        try {
            fe stackIn_12_0;
            int stackIn_12_1;
            java.net.URL stackIn_12_2;
            java.net.URL stackIn_12_3;
            java.net.URL stackIn_12_4;
            StringBuilder stackIn_12_5;
            fe stackIn_13_0;
            int stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            java.net.URL stackIn_13_4;
            StringBuilder stackIn_13_5;
            String stackIn_13_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var3 = 0;
            String var4 = null;
            Exception var4_ref = null;
            ib var5 = null;
            DataInputStream var6 = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            var7 = Transmogrify.field_A ? 1 : 0;
            var3 = 90 % ((param1 - -65) / 45);
            try {
              L0: {
                L1: {
                  var4 = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var4 = rk.a(param0, false);
                    break L1;
                  }
                }
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 != null) {
                        var4 = var4 + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4 = var4 + param2;
                    break L2;
                  }
                }
                fc.a(121, var4);
                var8 = mg.a(":", false, "%3a", var4);
                var9 = mg.a("@", false, "%40", var8);
                var10 = mg.a("&", false, "%26", var9);
                var11 = mg.a("#", false, "%23", var10);
                if (re.field_i != null) {
                  L4: {
                    stackIn_12_0 = f.field_b;

                    stackIn_12_1 = -21377;

                    stackIn_12_2 = null;

                    stackIn_12_3 = null;

                    stackIn_12_4 = re.field_i.getCodeBase();

                    stackIn_12_5 = new StringBuilder().append("clienterror.ws?c=").append(gh.field_h).append("&u=");

                    if (null == mh.field_c) {
                      stackIn_13_0 = (fe) ((Object) stackIn_12_0);
                      stackIn_13_1 = stackIn_12_1;
                      stackIn_13_2 = null;
                      stackIn_13_3 = null;
                      stackIn_13_4 = (java.net.URL) ((Object) stackIn_12_4);
                      stackIn_13_5 = (StringBuilder) ((Object) stackIn_12_5);
                      stackIn_13_6 = "" + oi.field_i;
                      break L4;
                    } else {
                      stackIn_13_0 = (fe) ((Object) stackIn_12_0);
                      stackIn_13_1 = stackIn_12_1;
                      stackIn_13_2 = null;
                      stackIn_13_3 = null;
                      stackIn_13_4 = (java.net.URL) ((Object) stackIn_12_4);
                      stackIn_13_5 = (StringBuilder) ((Object) stackIn_12_5);
                      stackIn_13_6 = mh.field_c;
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
                          var6 = (DataInputStream) (var5.field_g);
                          var6.read();
                          var6.close();
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      pg.a(1L, -124);
                      continue L5;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 != 1) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_c = new Random();
        field_a = new int[8192];
        field_d = new oa(256);
        field_b = new int[8192];
    }
}

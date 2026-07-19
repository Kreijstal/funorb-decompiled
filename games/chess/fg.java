/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fg {
    static String field_a;
    static jc field_c;
    static boolean field_b;
    static ok field_d;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            fg.a(false);
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            nl var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            jk stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            jk stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            jk stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            jk stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            jk stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            jk stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            var6 = Chess.field_G;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 != null) {
                    var3_ref = qm.a((byte) -89, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 != null) {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L2;
                  }
                }
                ol.a(var3_ref, 26613);
                var7 = kb.a(var3_ref, 0, "%3a", ":");
                var8 = kb.a(var7, param1 + 77, "%40", "@");
                var9 = kb.a(var8, 0, "%26", "&");
                var10 = kb.a(var9, param1 ^ -77, "%23", "#");
                if (null == ba.field_L) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackOut_12_0 = um.field_g;
                    stackOut_12_1 = -49;
                    stackOut_12_2 = null;
                    stackOut_12_3 = null;
                    stackOut_12_4 = ba.field_L.getCodeBase();
                    stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(cg.field_a).append("&u=");
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    stackIn_14_4 = stackOut_12_4;
                    stackIn_14_5 = stackOut_12_5;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    stackIn_13_5 = stackOut_12_5;
                    if (null == fj.field_h) {
                      stackOut_14_0 = (jk) ((Object) stackIn_14_0);
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = null;
                      stackOut_14_3 = null;
                      stackOut_14_4 = (java.net.URL) ((Object) stackIn_14_4);
                      stackOut_14_5 = (StringBuilder) ((Object) stackIn_14_5);
                      stackOut_14_6 = "" + gi.field_e;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      stackIn_15_3 = stackOut_14_3;
                      stackIn_15_4 = stackOut_14_4;
                      stackIn_15_5 = stackOut_14_5;
                      stackIn_15_6 = stackOut_14_6;
                      break L4;
                    } else {
                      stackOut_13_0 = (jk) ((Object) stackIn_13_0);
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = null;
                      stackOut_13_3 = null;
                      stackOut_13_4 = (java.net.URL) ((Object) stackIn_13_4);
                      stackOut_13_5 = (StringBuilder) ((Object) stackIn_13_5);
                      stackOut_13_6 = fj.field_h;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_15_4 = stackOut_13_4;
                      stackIn_15_5 = stackOut_13_5;
                      stackIn_15_6 = stackOut_13_6;
                      break L4;
                    }
                  }
                  L5: {
                    var4 = ((jk) (Object) stackIn_15_0).a((byte) stackIn_15_1, new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + jk.field_o + "&v2=" + jk.field_i + "&e=" + var10));
                    if (param1 == -77) {
                      break L5;
                    } else {
                      field_a = (String) null;
                      break L5;
                    }
                  }
                  L6: while (true) {
                    if (var4.field_f != 0) {
                      L7: {
                        if ((var4.field_f ^ -1) != -2) {
                          break L7;
                        } else {
                          var5 = (DataInputStream) (var4.field_b);
                          discarded$1 = var5.read();
                          var5.close();
                          break L7;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      bc.a(1L, (byte) -92);
                      continue L6;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L8;
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

    static {
        field_a = "Show all private chat";
        field_c = new jc();
    }
}

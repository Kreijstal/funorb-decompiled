/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sm {
    static String field_f;
    static String field_e;
    static cn field_g;
    int field_d;
    static String field_b;
    static String field_a;
    static int field_c;

    final static void a(Throwable param0, int param1, String param2) {
        try {
            qg stackIn_14_0;
            int stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            java.net.URL stackIn_14_4;
            StringBuilder stackIn_14_5;
            qg stackIn_15_0;
            int stackIn_15_1;
            java.net.URL stackIn_15_2;
            java.net.URL stackIn_15_3;
            java.net.URL stackIn_15_4;
            StringBuilder stackIn_15_5;
            String stackIn_15_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            pn var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = DungeonAssault.field_K;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param0 != null) {
                    var3 = hc.a(9, param0);
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
                        var3 = var3 + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3 = var3 + param2;
                    break L2;
                  }
                }
                sn.a(11580, var3);
                var7 = eg.a(var3, ":", "%3a", true);
                var8 = eg.a(var7, "@", "%40", true);
                var9 = eg.a(var8, "&", "%26", true);
                var10 = eg.a(var9, "#", "%23", true);
                if (null == ci.field_q) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackIn_14_0 = kf.field_o;

                    stackIn_14_1 = param1 ^ -17;

                    stackIn_14_2 = null;

                    stackIn_14_3 = null;

                    stackIn_14_4 = ci.field_q.getCodeBase();

                    stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(wj.field_s).append("&u=");

                    if (pe.field_o != null) {
                      stackIn_15_0 = (qg) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = null;
                      stackIn_15_3 = null;
                      stackIn_15_4 = (java.net.URL) ((Object) stackIn_14_4);
                      stackIn_15_5 = (StringBuilder) ((Object) stackIn_14_5);
                      stackIn_15_6 = pe.field_o;
                      break L4;
                    } else {
                      stackIn_15_0 = (qg) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = null;
                      stackIn_15_3 = null;
                      stackIn_15_4 = (java.net.URL) ((Object) stackIn_14_4);
                      stackIn_15_5 = (StringBuilder) ((Object) stackIn_14_5);
                      stackIn_15_6 = "" + ne.field_g;
                      break L4;
                    }
                  }
                  var4 = ((qg) (Object) stackIn_15_0).a(stackIn_15_1, new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + qg.field_c + "&v2=" + qg.field_p + "&e=" + var10));
                  L5: while (true) {
                    if (var4.field_c != 0) {
                      L6: {
                        if (param1 != var4.field_c) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) (var4.field_f);
                          var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      pj.a(0, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
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

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (param1.length() < wa.field_k) {
                    break L1;
                  } else {
                    if (param1.length() <= md.field_b) {
                      stackIn_10_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("sm.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        if (param0 != -118) {
          sm.a((byte) 34);
          field_b = null;
          field_g = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_f = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            try {
                pa.field_b = param2;
                try {
                    var7 = param0.getParameter("cookieprefix");
                    var5 = var7;
                    var5 = var7;
                    var4 = param0.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    if (param1 != 31500) {
                        String var6 = (String) null;
                        sm.a((Throwable) null, 45, (String) null);
                    }
                    var8 = var7 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                    var5 = var8;
                    var5 = var8;
                    var5 = var8;
                    if (param2.length() == 0) {
                        var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    ee.a("document.cookie=\"" + var5 + "\"", (byte) -46, param0);
                } catch (Throwable throwable) {
                }
                lm.a((byte) -106, param0);
            } catch (RuntimeException runtimeException) {
                throw vk.a((Throwable) ((Object) runtimeException), "sm.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = "Please enter your age in years";
        field_a = "Hidden Darts";
        field_b = "A very large, wolf-like creature with burning red eyes.";
        field_e = "You woke the sleeping dragon!";
    }
}

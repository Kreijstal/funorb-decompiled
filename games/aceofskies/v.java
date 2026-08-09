/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class v {
    static kp field_b;
    static boolean field_a;

    final static void a(String param0, byte param1, Throwable param2) {
        try {
            rk stackIn_16_0;
            int stackIn_16_1;
            java.net.URL stackIn_16_2;
            java.net.URL stackIn_16_3;
            java.net.URL stackIn_16_4;
            StringBuilder stackIn_16_5;
            rk stackIn_17_0;
            int stackIn_17_1;
            java.net.URL stackIn_17_2;
            java.net.URL stackIn_17_3;
            java.net.URL stackIn_17_4;
            StringBuilder stackIn_17_5;
            String stackIn_17_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            en var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param2 != null) {
                    var3 = br.a(param2, (byte) -29);
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
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                jb.a(var3, 20164);
                var7 = eh.a(":", param1 + 165, "%3a", var3);
                var8 = eh.a("@", -77, "%40", var7);
                var9 = eh.a("&", param1 ^ -67, "%26", var8);
                if (param1 == -52) {
                  var10 = eh.a("#", 118, "%23", var9);
                  if (null == fb.field_c) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L4: {
                      stackIn_16_0 = mj.field_a;

                      stackIn_16_1 = 70;

                      stackIn_16_2 = null;

                      stackIn_16_3 = null;

                      stackIn_16_4 = fb.field_c.getCodeBase();

                      stackIn_16_5 = new StringBuilder().append("clienterror.ws?c=").append(bs.field_c).append("&u=");

                      if (co.field_g == null) {
                        stackIn_17_0 = (rk) ((Object) stackIn_16_0);
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = null;
                        stackIn_17_3 = null;
                        stackIn_17_4 = (java.net.URL) ((Object) stackIn_16_4);
                        stackIn_17_5 = (StringBuilder) ((Object) stackIn_16_5);
                        stackIn_17_6 = "" + dl.field_o;
                        break L4;
                      } else {
                        stackIn_17_0 = (rk) ((Object) stackIn_16_0);
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = null;
                        stackIn_17_3 = null;
                        stackIn_17_4 = (java.net.URL) ((Object) stackIn_16_4);
                        stackIn_17_5 = (StringBuilder) ((Object) stackIn_16_5);
                        stackIn_17_6 = co.field_g;
                        break L4;
                      }
                    }
                    var4 = ((rk) (Object) stackIn_17_0).a((byte) stackIn_17_1, new java.net.URL(stackIn_17_4, stackIn_17_6 + "&v1=" + rk.field_o + "&v2=" + rk.field_l + "&e=" + var10));
                    L5: while (true) {
                      if (var4.field_a != 0) {
                        L6: {
                          if (-2 != (var4.field_a ^ -1)) {
                            break L6;
                          } else {
                            var5 = (DataInputStream) (var4.field_f);
                            var5.read();
                            var5.close();
                            break L6;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        wf.a(1L, false);
                        continue L5;
                      }
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
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 2;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 32342) {
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param1.getCodeBase();
                    var3 = jf.a(param1, var4, 70).getFile();
                    fe.a("updatelinks", -15201, new Object[]{"home", var3 + "home.ws"}, param1);
                    fe.a("updatelinks", -15201, new Object[]{"gamelist", var3 + "togamelist.ws"}, param1);
                    fe.a("updatelinks", -15201, new Object[]{"serverlist", var3 + "toserverlist.ws"}, param1);
                    fe.a("updatelinks", -15201, new Object[]{"options", var3 + "options.ws"}, param1);
                    fe.a("updatelinks", -15201, new Object[]{"terms", var3 + "terms.ws"}, param1);
                    fe.a("updatelinks", -15201, new Object[]{"privacy", var3 + "privacy.ws"}, param1);
                    if (param0) {
                      break L1;
                    } else {
                      field_a = true;
                      return;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_7_0 = (RuntimeException) (var2_ref);

                stackIn_7_1 = new StringBuilder().append("v.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L2;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L2;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new kp();
    }
}

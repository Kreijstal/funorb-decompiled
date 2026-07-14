/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class md extends rg {
    static im field_h;
    private java.net.ProxySelector field_c;
    static int field_j;
    static int field_g;
    static int field_f;
    static String[] field_e;
    static byte[][] field_i;
    static ki field_d;

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        String var15 = null;
        L0: {
          var12 = OrbDefence.field_D ? 1 : 0;
          var13 = new java.net.Socket(param2, param1);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param3 != null) {
            var6.write(("CONNECT " + ((md) this).field_a + ":" + ((md) this).field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((md) this).field_a + ":" + ((md) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        L1: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var14 = var7.readLine();
          var8 = var14;
          var8 = var14;
          if (param0 == 0) {
            break L1;
          } else {
            field_d = null;
            break L1;
          }
        }
        L2: {
          if (var14 == null) {
            break L2;
          } else {
            L3: {
              if (var14.startsWith("HTTP/1.0 200")) {
                break L3;
              } else {
                if (!var14.startsWith("HTTP/1.1 200")) {
                  L4: {
                    if (var14.startsWith("HTTP/1.0 407")) {
                      break L4;
                    } else {
                      if (!var14.startsWith("HTTP/1.1 407")) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var9 = 0;
                  var10 = "proxy-authenticate: ";
                  var8 = var10;
                  var8 = var10;
                  var8 = var7.readLine();
                  L5: while (true) {
                    L6: {
                      if (var8 == null) {
                        break L6;
                      } else {
                        if (var9 >= 50) {
                          break L6;
                        } else {
                          if (!var8.toLowerCase().startsWith(var10)) {
                            var9++;
                            var8 = var7.readLine();
                            continue L5;
                          } else {
                            L7: {
                              var15 = var8.substring(var10.length()).trim();
                              var8 = var15;
                              var8 = var15;
                              var11 = var15.indexOf(' ');
                              if (-1 == var11) {
                                break L7;
                              } else {
                                var8 = var15.substring(0, var11);
                                break L7;
                              }
                            }
                            throw new bk(var8);
                          }
                        }
                      }
                    }
                    throw new bk("");
                  }
                } else {
                  break L3;
                }
              }
            }
            return var13;
          }
        }
        var6.close();
        var7.close();
        var13.close();
        return null;
    }

    final static void a(byte param0) {
        fl.field_a = null;
        jd.field_g = null;
        m.field_a = null;
        if (param0 >= -102) {
            md.d(89);
        }
        vc.field_g = null;
        wc.field_a = null;
        wh.field_b = null;
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        Object var3 = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        java.net.Socket var5 = null;
        Exception var6 = null;
        Class var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param1.type() == java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return ((md) this).a(-5942);
                }
                case 3: {
                    var3 = param1.address();
                    if (var3 instanceof java.net.InetSocketAddress) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return null;
                }
                case 5: {
                    if (param0 == -1) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    md.d(31);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param1.type() == java.net.Proxy.Type.HTTP) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param1.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 10;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = new java.net.Socket(param1);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((md) this).field_a, ((md) this).field_b));
                    return var5;
                }
                case 11: {
                    var5 = null;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 == null) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    return this.a(0, var4_ref.getPort(), var4_ref.getHostName(), (String) (Object) var5);
                }
                case 19: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(int param0) {
        if (param0 != 32) {
            md.a((byte) -11);
        }
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = OrbDefence.field_D ? 1 : 0;
          if (param0 == -20767) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= param1.length()) {
            return false;
          } else {
            var3 = param1.charAt(var2);
            if (!cd.a(param0 + 20676, (char) var3)) {
              if (!hm.a(-20625, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void b(byte param0) {
        if (-11 != (hi.field_k ^ -1)) {
            // ifeq L21
        } else {
            dk.a(-108);
            hi.field_k = 11;
        }
        mf.field_d = true;
        int var1 = -81 / ((param0 - -21) / 46);
    }

    final java.net.Socket b(int param0) throws IOException {
        java.net.URISyntaxException uRISyntaxException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        Object[] var6 = null;
        bk var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        bk var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        int stackIn_6_0 = 0;
        java.net.ProxySelector stackIn_8_0 = null;
        java.net.URI stackIn_8_1 = null;
        java.net.URI stackIn_8_2 = null;
        StringBuilder stackIn_8_3 = null;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        String stackIn_10_4 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        String stackIn_13_4 = null;
        java.net.Socket stackIn_22_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        java.net.ProxySelector stackOut_7_0 = null;
        java.net.URI stackOut_7_1 = null;
        java.net.URI stackOut_7_2 = null;
        StringBuilder stackOut_7_3 = null;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        String stackOut_8_4 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        String stackOut_9_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.Socket stackOut_21_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = OrbDefence.field_D ? 1 : 0;
                    if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    String discarded$4 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (((md) this).field_b != 443) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var5 = stackIn_6_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = ((md) this).field_c;
                        stackOut_7_1 = null;
                        stackOut_7_2 = null;
                        stackOut_7_3 = new StringBuilder();
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        if (var5 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (java.net.ProxySelector) (Object) stackIn_8_0;
                        stackOut_8_1 = null;
                        stackOut_8_2 = null;
                        stackOut_8_3 = (StringBuilder) (Object) stackIn_8_3;
                        stackOut_8_4 = "https";
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        stackIn_10_3 = stackOut_8_3;
                        stackIn_10_4 = stackOut_8_4;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (java.net.ProxySelector) (Object) stackIn_9_0;
                        stackOut_9_1 = null;
                        stackOut_9_2 = null;
                        stackOut_9_3 = (StringBuilder) (Object) stackIn_9_3;
                        stackOut_9_4 = "http";
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        stackIn_10_3 = stackOut_9_3;
                        stackIn_10_4 = stackOut_9_4;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        new java.net.URI(stackIn_10_4 + "://" + ((md) this).field_a);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(stackIn_10_1);
                        stackOut_10_0 = ((md) this).field_c;
                        stackOut_10_1 = null;
                        stackOut_10_2 = null;
                        stackOut_10_3 = new StringBuilder();
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_12_3 = stackOut_10_3;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        stackIn_11_3 = stackOut_10_3;
                        if (var5 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (java.net.ProxySelector) (Object) stackIn_11_0;
                        stackOut_11_1 = null;
                        stackOut_11_2 = null;
                        stackOut_11_3 = (StringBuilder) (Object) stackIn_11_3;
                        stackOut_11_4 = "http";
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_13_4 = stackOut_11_4;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (java.net.ProxySelector) (Object) stackIn_12_0;
                        stackOut_12_1 = null;
                        stackOut_12_2 = null;
                        stackOut_12_3 = (StringBuilder) (Object) stackIn_12_3;
                        stackOut_12_4 = "https";
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        stackIn_13_4 = stackOut_12_4;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        new java.net.URI(stackIn_13_4 + "://" + ((md) this).field_a);
                        var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(stackIn_13_1);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    uRISyntaxException = (java.net.URISyntaxException) (Object) caughtException;
                    return ((md) this).a(param0 + -5942);
                }
                case 16: {
                    boolean discarded$5 = var3.addAll((Collection) (Object) var4);
                    var6 = var3.toArray();
                    var7 = null;
                    var8 = var6;
                    var9 = param0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var8.length <= var9) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10 = var8[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var12 = this.a(param0 + -1, var11);
                        if (var12 != null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof bk ? 23 : 24);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof bk ? 23 : 24);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (java.net.Socket) var12;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof bk ? 23 : 24);
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0;
                }
                case 23: {
                    var12_ref = (bk) (Object) caughtException;
                    var7 = var12_ref;
                    var9++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 24: {
                    var12_ref2 = (IOException) (Object) caughtException;
                    var9++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 25: {
                    if (var7 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    throw var7;
                }
                case 27: {
                    return ((md) this).a(-5942);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    md() {
        ((md) this).field_c = java.net.ProxySelector.getDefault();
    }

    public static void d(int param0) {
        field_h = null;
        field_e = null;
        field_i = null;
        if (param0 > -71) {
            field_e = null;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_e = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_h = new im();
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class ph extends rn {
    private java.net.ProxySelector field_j;
    static long field_i;
    static mg[] field_m;
    static wm[] field_n;
    static int[] field_o;
    static int[][] field_l;
    static int field_h;
    static ii field_k;

    final static String c(int param0) {
        if (param0 != -15025) {
            String discarded$0 = ph.c(-119);
        }
        if (ei.field_a) {
            return null;
        }
        if (ed.field_a > wa.field_F) {
            return null;
        }
        if (ed.field_a - -nb.field_y <= wa.field_F) {
            return null;
        }
        return od.field_l;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != -1550172208) {
            field_k = null;
        }
        if (param1 > param0) {
            return -wd.a((byte) -53, (param0 << 1645052304) / param1) + 2048;
        }
        return wd.a((byte) -71, (param1 << -1550172208) / param0);
    }

    final java.net.Socket b(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        te var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        te var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_5_0 = 0;
        java.net.ProxySelector stackIn_7_0 = null;
        java.net.URI stackIn_7_1 = null;
        java.net.URI stackIn_7_2 = null;
        StringBuilder stackIn_7_3 = null;
        java.net.ProxySelector stackIn_8_0 = null;
        java.net.URI stackIn_8_1 = null;
        java.net.URI stackIn_8_2 = null;
        StringBuilder stackIn_8_3 = null;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        String stackIn_9_4 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        String stackIn_12_4 = null;
        java.net.Socket stackIn_23_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        java.net.ProxySelector stackOut_6_0 = null;
        java.net.URI stackOut_6_1 = null;
        java.net.URI stackOut_6_2 = null;
        StringBuilder stackOut_6_3 = null;
        java.net.ProxySelector stackOut_7_0 = null;
        java.net.URI stackOut_7_1 = null;
        java.net.URI stackOut_7_2 = null;
        StringBuilder stackOut_7_3 = null;
        String stackOut_7_4 = null;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        String stackOut_8_4 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.Socket stackOut_22_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Virogrid.field_F ? 1 : 0;
                    if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((((ph) this).field_b ^ -1) != -444) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var5 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        stackOut_6_0 = ((ph) this).field_j;
                        stackOut_6_1 = null;
                        stackOut_6_2 = null;
                        stackOut_6_3 = new StringBuilder();
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        stackIn_8_3 = stackOut_6_3;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        stackIn_7_3 = stackOut_6_3;
                        if (var5 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (java.net.ProxySelector) (Object) stackIn_7_0;
                        stackOut_7_1 = null;
                        stackOut_7_2 = null;
                        stackOut_7_3 = (StringBuilder) (Object) stackIn_7_3;
                        stackOut_7_4 = "http";
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        stackIn_9_4 = stackOut_7_4;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
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
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        stackIn_9_3 = stackOut_8_3;
                        stackIn_9_4 = stackOut_8_4;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        new java.net.URI(stackIn_9_4 + "://" + ((ph) this).field_d);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(stackIn_9_1);
                        stackOut_9_0 = ((ph) this).field_j;
                        stackOut_9_1 = null;
                        stackOut_9_2 = null;
                        stackOut_9_3 = new StringBuilder();
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_11_3 = stackOut_9_3;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        stackIn_10_3 = stackOut_9_3;
                        if (var5 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                        stackOut_10_1 = null;
                        stackOut_10_2 = null;
                        stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                        stackOut_10_4 = "https";
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_12_3 = stackOut_10_3;
                        stackIn_12_4 = stackOut_10_4;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
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
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        stackIn_12_4 = stackOut_11_4;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        new java.net.URI(stackIn_12_4 + "://" + ((ph) this).field_d);
                        var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(stackIn_12_1);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var6 = (java.net.URISyntaxException) (Object) caughtException;
                    return ((ph) this).a(false);
                }
                case 15: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    if (param0 == -18982) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    field_h = 99;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var9 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var9 >= var8_array.length) {
                        statePc = 26;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        var12_ref2 = this.a(var11, -128);
                        if (var12_ref2 != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof te ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9++;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof te ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = (java.net.Socket) var12_ref2;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof te ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var12 = (te) (Object) caughtException;
                    var7 = var12;
                    var9++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 25: {
                    var12_ref = (IOException) (Object) caughtException;
                    var9++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 26: {
                    if (var7 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    throw var7;
                }
                case 28: {
                    return ((ph) this).a(false);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(String param0, int param1, String param2, int param3) throws IOException {
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
          var12 = Virogrid.field_F ? 1 : 0;
          var13 = new java.net.Socket(param2, param1);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param0 == null) {
            var6.write(("CONNECT " + ((ph) this).field_d + ":" + ((ph) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((ph) this).field_d + ":" + ((ph) this).field_b + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        L1: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var14 = var7.readLine();
          var8 = var14;
          if (var14 == null) {
            break L1;
          } else {
            L2: {
              if (var14.startsWith("HTTP/1.0 200")) {
                break L2;
              } else {
                if (!var14.startsWith("HTTP/1.1 200")) {
                  L3: {
                    if (var14.startsWith("HTTP/1.0 407")) {
                      break L3;
                    } else {
                      if (!var14.startsWith("HTTP/1.1 407")) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = 0;
                  var10 = "proxy-authenticate: ";
                  var8 = var10;
                  var8 = var7.readLine();
                  L4: while (true) {
                    L5: {
                      if (var8 == null) {
                        break L5;
                      } else {
                        if (var9 >= 50) {
                          break L5;
                        } else {
                          if (!var8.toLowerCase().startsWith(var10)) {
                            var8 = var7.readLine();
                            var9++;
                            continue L4;
                          } else {
                            L6: {
                              var15 = var8.substring(var10.length()).trim();
                              var8 = var15;
                              var11 = var15.indexOf(' ');
                              if (-1 != var11) {
                                var8 = var15.substring(0, var11);
                                break L6;
                              } else {
                                var8 = var15;
                                break L6;
                              }
                            }
                            throw new te(var8);
                          }
                        }
                      }
                    }
                    throw new te("");
                  }
                } else {
                  break L2;
                }
              }
            }
            return var13;
          }
        }
        L7: {
          var6.close();
          var7.close();
          if (param3 == 32) {
            break L7;
          } else {
            field_h = -100;
            break L7;
          }
        }
        var13.close();
        return null;
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
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
                    if (param1 <= -124) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    int discarded$1 = ph.a(107, -47, 41);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (param0.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return ((ph) this).a(false);
                }
                case 4: {
                    var3 = param0.address();
                    if (var3 instanceof java.net.InetSocketAddress) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return null;
                }
                case 6: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param0.type() != java.net.Proxy.Type.HTTP) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5 = null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 == null) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return this.a((String) (Object) var5, var4_ref.getPort(), var4_ref.getHostName(), 32);
                }
                case 15: {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = new java.net.Socket(param0);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((ph) this).field_d, ((ph) this).field_b));
                    return var5;
                }
                case 18: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ph() {
        ((ph) this).field_j = java.net.ProxySelector.getDefault();
    }

    public static void d(int param0) {
        int var1 = -95 % ((param0 - 31) / 49);
        field_o = null;
        field_n = null;
        field_k = null;
        field_l = null;
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[128];
        field_l = new int[4][];
        field_h = 0;
    }
}

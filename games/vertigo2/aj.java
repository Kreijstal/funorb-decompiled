/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class aj extends ig {
    static String field_i;
    static int[] field_f;
    static long field_j;
    private java.net.ProxySelector field_g;
    static int field_h;
    static int field_e;

    final java.net.Socket b(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        rg var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        rg var12 = null;
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
                    var13 = Vertigo2.field_L ? 1 : 0;
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
                    if ((((aj) this).field_b ^ -1) != -444) {
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
                        stackOut_6_0 = ((aj) this).field_g;
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
                        new java.net.URI(stackIn_9_4 + "://" + ((aj) this).field_a);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(stackIn_9_1);
                        stackOut_9_0 = ((aj) this).field_g;
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
                        if (var5 == 0) {
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
                        stackOut_10_4 = "http";
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
                        stackOut_11_4 = "https";
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
                        new java.net.URI(stackIn_12_4 + "://" + ((aj) this).field_a);
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
                    return ((aj) this).a((byte) -39);
                }
                case 15: {
                    if (param0 == 640) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return null;
                }
                case 17: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var8_array.length <= var9) {
                        statePc = 27;
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
                        var12_ref2 = this.a((byte) 107, var11);
                        if (var12_ref2 != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof rg ? 24 : 25);
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
                        statePc = (stateCaught_21 instanceof rg ? 24 : 25);
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
                        statePc = (stateCaught_22 instanceof rg ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var12 = (rg) (Object) caughtException;
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
                case 27: {
                    if (var7 != null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return ((aj) this).a((byte) -39);
                }
                case 29: {
                    throw var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, String param1, byte param2) {
        if (param2 == 33) {
          if (df.field_l != null) {
            df.field_l.h((byte) 64);
            eb.field_d = new ob(param1, param0, false, true, true);
            n.field_b.a(false, (iq) (Object) eb.field_d);
            return;
          } else {
            eb.field_d = new ob(param1, param0, false, true, true);
            n.field_b.a(false, (iq) (Object) eb.field_d);
            return;
          }
        } else {
          return;
        }
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
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
                    if (param1.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return ((aj) this).a((byte) -39);
                }
                case 2: {
                    var3 = param1.address();
                    if (var3 instanceof java.net.InetSocketAddress) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return null;
                }
                case 4: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param0 >= 71) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    field_e = -16;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1.type() != java.net.Proxy.Type.HTTP) {
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
                        if (var8 != null) {
                            statePc = 10;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (!((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
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
                    return this.a(var4_ref.getPort(), 32, var4_ref.getHostName(), (String) (Object) var5);
                }
                case 15: {
                    if (param1.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = new java.net.Socket(param1);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((aj) this).field_a, ((aj) this).field_b));
                    return var5;
                }
                case 18: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        OutputStream var15 = null;
        BufferedReader var16 = null;
        String var17 = null;
        BufferedReader var18 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        OutputStream var27 = null;
        BufferedReader var28 = null;
        String var30 = null;
        String var39 = null;
        BufferedReader var40 = null;
        String var42 = null;
        String var43 = null;
        String var44 = null;
        String var45 = null;
        String var46 = null;
        String var49 = null;
        String var50 = null;
        String var51 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        var13 = new java.net.Socket(param2, param0);
        if (param1 != 32) {
          aj.a(72, 23, (vi) null);
          var13.setSoTimeout(10000);
          var27 = var13.getOutputStream();
          if (param3 == null) {
            L0: {
              var27.write(("CONNECT " + ((aj) this).field_a + ":" + ((aj) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              var27.flush();
              var28 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var7 = var28;
              var8 = var28.readLine();
              var30 = var8;
              var8 = var30;
              var50 = var8;
              var8 = var50;
              var10 = var8;
              if (var8 != null) {
                if (!var8.startsWith("HTTP/1.0 200")) {
                  if (!var8.startsWith("HTTP/1.1 200")) {
                    L1: {
                      if (var8.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var28.readLine();
                        break L1;
                      } else {
                        if (var8.startsWith("HTTP/1.1 407")) {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          var8 = var10;
                          var8 = var28.readLine();
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                    L2: while (true) {
                      if (var8 != null) {
                        if (-51 < (var9 ^ -1)) {
                          if (var8.toLowerCase().startsWith(var10)) {
                            L3: {
                              var39 = var8.substring(var10.length()).trim();
                              var8 = var39;
                              var8 = var39;
                              var11 = var39.indexOf(' ');
                              if (var11 == -1) {
                                break L3;
                              } else {
                                var8 = var39.substring(0, var11);
                                break L3;
                              }
                            }
                            throw new rg(var8);
                          } else {
                            var9++;
                            var8 = var28.readLine();
                            continue L2;
                          }
                        } else {
                          throw new rg("");
                        }
                      } else {
                        throw new rg("");
                      }
                    }
                  } else {
                    return var13;
                  }
                } else {
                  return var13;
                }
              } else {
                break L0;
              }
            }
            var27.close();
            var28.close();
            var13.close();
            return null;
          } else {
            var27.write(("CONNECT " + ((aj) this).field_a + ":" + ((aj) this).field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var27.flush();
            var40 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var40;
            var8 = var40.readLine();
            var42 = var8;
            var8 = var42;
            if (var8 != null) {
              if (!var8.startsWith("HTTP/1.0 200")) {
                if (!var8.startsWith("HTTP/1.1 200")) {
                  if (var8.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var43 = "proxy-authenticate: ";
                    var8 = var43;
                    var8 = var43;
                    var8 = var40.readLine();
                    L4: while (true) {
                      L5: {
                        if (var8 == null) {
                          break L5;
                        } else {
                          if (-51 >= (var9 ^ -1)) {
                            break L5;
                          } else {
                            if (var8.toLowerCase().startsWith(var43)) {
                              L6: {
                                var44 = var8.substring(var43.length()).trim();
                                var8 = var44;
                                var8 = var44;
                                var11 = var44.indexOf(' ');
                                if (var11 == -1) {
                                  break L6;
                                } else {
                                  var8 = var44.substring(0, var11);
                                  break L6;
                                }
                              }
                              throw new rg(var8);
                            } else {
                              var9++;
                              var8 = var40.readLine();
                              continue L4;
                            }
                          }
                        }
                      }
                      throw new rg("");
                    }
                  } else {
                    if (var8.startsWith("HTTP/1.1 407")) {
                      var9 = 0;
                      var45 = "proxy-authenticate: ";
                      var8 = var45;
                      var8 = var45;
                      var10 = var45;
                      var8 = var10;
                      var8 = var10;
                      var8 = var40.readLine();
                      L7: while (true) {
                        L8: {
                          if (var8 == null) {
                            break L8;
                          } else {
                            if (-51 >= (var9 ^ -1)) {
                              break L8;
                            } else {
                              if (var8.toLowerCase().startsWith(var45)) {
                                L9: {
                                  var46 = var8.substring(var45.length()).trim();
                                  var8 = var46;
                                  var8 = var46;
                                  var11 = var46.indexOf(' ');
                                  if (var11 == -1) {
                                    break L9;
                                  } else {
                                    var8 = var46.substring(0, var11);
                                    break L9;
                                  }
                                }
                                throw new rg(var8);
                              } else {
                                var9++;
                                var8 = var40.readLine();
                                var51 = var8;
                                var51 = var8;
                                continue L7;
                              }
                            }
                          }
                        }
                        throw new rg("");
                      }
                    } else {
                      var27.close();
                      var40.close();
                      var13.close();
                      return null;
                    }
                  }
                } else {
                  return var13;
                }
              } else {
                return var13;
              }
            } else {
              var27.close();
              var40.close();
              var13.close();
              return null;
            }
          }
        } else {
          var13.setSoTimeout(10000);
          var15 = var13.getOutputStream();
          if (param3 == null) {
            L10: {
              var15.write(("CONNECT " + ((aj) this).field_a + ":" + ((aj) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              var15.flush();
              var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var8 = var16.readLine();
              var10 = var8;
              var8 = var10;
              var10 = var8;
              if (var8 != null) {
                L11: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L11;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L12: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var16.readLine();
                          break L12;
                        } else {
                          if (var8.startsWith("HTTP/1.1 407")) {
                            var9 = 0;
                            var10 = "proxy-authenticate: ";
                            var8 = var10;
                            var8 = var10;
                            var8 = var16.readLine();
                            break L12;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: while (true) {
                        if (var8 != null) {
                          if (-51 < (var9 ^ -1)) {
                            if (var8.toLowerCase().startsWith(var10)) {
                              L14: {
                                var17 = var8.substring(var10.length()).trim();
                                var8 = var17;
                                var8 = var17;
                                var11 = var17.indexOf(' ');
                                if (var11 == -1) {
                                  break L14;
                                } else {
                                  var8 = var17.substring(0, var11);
                                  break L14;
                                }
                              }
                              throw new rg(var8);
                            } else {
                              var9++;
                              var8 = var16.readLine();
                              continue L13;
                            }
                          } else {
                            throw new rg("");
                          }
                        } else {
                          throw new rg("");
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                return var13;
              } else {
                break L10;
              }
            }
            var15.close();
            var16.close();
            var13.close();
            return null;
          } else {
            var15.write(("CONNECT " + ((aj) this).field_a + ":" + ((aj) this).field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var15.flush();
            var18 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var18;
            var8 = var18.readLine();
            var20 = var8;
            var8 = var20;
            if (var8 != null) {
              if (!var8.startsWith("HTTP/1.0 200")) {
                if (!var8.startsWith("HTTP/1.1 200")) {
                  if (var8.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var21 = "proxy-authenticate: ";
                    var8 = var21;
                    var8 = var21;
                    var8 = var18.readLine();
                    L15: while (true) {
                      if (var8 != null) {
                        if (-51 < (var9 ^ -1)) {
                          if (var8.toLowerCase().startsWith(var21)) {
                            L16: {
                              var22 = var8.substring(var21.length()).trim();
                              var8 = var22;
                              var8 = var22;
                              var11 = var22.indexOf(' ');
                              if (var11 == -1) {
                                break L16;
                              } else {
                                var8 = var22.substring(0, var11);
                                break L16;
                              }
                            }
                            throw new rg(var8);
                          } else {
                            var9++;
                            var8 = var18.readLine();
                            continue L15;
                          }
                        } else {
                          throw new rg("");
                        }
                      } else {
                        throw new rg("");
                      }
                    }
                  } else {
                    if (var8.startsWith("HTTP/1.1 407")) {
                      var9 = 0;
                      var23 = "proxy-authenticate: ";
                      var8 = var23;
                      var8 = var23;
                      var10 = var23;
                      var8 = var10;
                      var8 = var10;
                      var8 = var18.readLine();
                      L17: while (true) {
                        if (var8 != null) {
                          if (-51 < (var9 ^ -1)) {
                            if (var8.toLowerCase().startsWith(var23)) {
                              L18: {
                                var24 = var8.substring(var23.length()).trim();
                                var8 = var24;
                                var8 = var24;
                                var11 = var24.indexOf(' ');
                                if (var11 == -1) {
                                  break L18;
                                } else {
                                  var8 = var24.substring(0, var11);
                                  break L18;
                                }
                              }
                              throw new rg(var8);
                            } else {
                              var9++;
                              var8 = var18.readLine();
                              var49 = var8;
                              var8 = var49;
                              var49 = var8;
                              continue L17;
                            }
                          } else {
                            throw new rg("");
                          }
                        } else {
                          throw new rg("");
                        }
                      }
                    } else {
                      var15.close();
                      var18.close();
                      var13.close();
                      return null;
                    }
                  }
                } else {
                  return var13;
                }
              } else {
                return var13;
              }
            } else {
              var15.close();
              var18.close();
              var13.close();
              return null;
            }
          }
        }
    }

    final static void a(int param0, int param1, vi param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mi var7 = null;
        mi var8 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        var7 = uh.field_Wb;
        var8 = var7;
        var8.j(param0, 120);
        var8.field_u = var8.field_u + 1;
        var4 = var8.field_u;
        var8.f(1, 85);
        var8.d(param2.field_u, -1783);
        var8.d(param2.field_v, -1783);
        var8.d(param2.field_y, -1783);
        var8.e(param2.field_t, 0);
        var8.e(param2.field_p, 0);
        var8.e(param2.field_q, 0);
        if (param1 <= 6) {
          return;
        } else {
          var8.e(param2.field_A, 0);
          var8.f(param2.field_o.length, -76);
          var5 = 0;
          L0: while (true) {
            if (param2.field_o.length <= var5) {
              int discarded$2 = var8.c(var4, 25);
              var8.b((byte) -95, -var4 + var8.field_u);
              return;
            } else {
              var7.e(param2.field_o[var5], 0);
              var5++;
              continue L0;
            }
          }
        }
    }

    aj() {
        ((aj) this).field_g = java.net.ProxySelector.getDefault();
    }

    final static void a(boolean param0, float param1, String param2) {
        if (param0) {
            aj.a(false, -0.6848612427711487f, (String) null);
            d.field_C = param1;
            li.field_h = param2;
            return;
        }
        d.field_C = param1;
        li.field_h = param2;
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 50;
        field_i = "Level View - jump to exit";
    }
}

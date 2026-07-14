/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class ch extends lg {
    static String field_g;
    private java.net.ProxySelector field_f;
    static String field_d;
    static int field_e;

    final static void a(int param0, int param1, f param2) {
        th var3 = null;
        Object var4 = null;
        if (param0 != 18391) {
          var4 = null;
          ch.a(91, -91, (f) null);
          var3 = ed.field_q;
          var3.h(param1, 0);
          var3.c(param2.field_k, param0 + -18392);
          var3.c(param2.field_j, -1);
          return;
        } else {
          var3 = ed.field_q;
          var3.h(param1, 0);
          var3.c(param2.field_k, param0 + -18392);
          var3.c(param2.field_j, -1);
          return;
        }
    }

    private final java.net.Socket a(boolean param0, java.net.Proxy param1) throws IOException {
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
        Object var14 = null;
        Class var15 = null;
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
                    return ((ch) this).a(-86);
                }
                case 2: {
                    if (!param0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var14 = null;
                    ch.a(17, -71, (f) null);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = param1.address();
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
                    if (param1.type() == java.net.Proxy.Type.HTTP) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param1.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 9;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = new java.net.Socket(param1);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((ch) this).field_a, ((ch) this).field_b));
                    return var5;
                }
                case 10: {
                    var5 = null;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var15;
                        var7 = var15.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 == null) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var15.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return this.a(var4_ref.getPort(), false, (String) (Object) var5, var4_ref.getHostName());
                }
                case 18: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        ck var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        ck var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_8_0 = 0;
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
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        java.net.ProxySelector stackIn_14_0 = null;
        java.net.URI stackIn_14_1 = null;
        java.net.URI stackIn_14_2 = null;
        StringBuilder stackIn_14_3 = null;
        java.net.ProxySelector stackIn_15_0 = null;
        java.net.URI stackIn_15_1 = null;
        java.net.URI stackIn_15_2 = null;
        StringBuilder stackIn_15_3 = null;
        String stackIn_15_4 = null;
        java.net.Socket stackIn_24_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
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
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        java.net.ProxySelector stackOut_13_0 = null;
        java.net.URI stackOut_13_1 = null;
        java.net.URI stackOut_13_2 = null;
        StringBuilder stackOut_13_3 = null;
        String stackOut_13_4 = null;
        java.net.ProxySelector stackOut_14_0 = null;
        java.net.URI stackOut_14_1 = null;
        java.net.URI stackOut_14_2 = null;
        StringBuilder stackOut_14_3 = null;
        String stackOut_14_4 = null;
        java.net.Socket stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Lexicominos.field_L ? 1 : 0;
                    if (param0 >= 14) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ch.d(-8);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (443 != ((ch) this).field_b) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var5 = stackIn_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        stackOut_9_0 = ((ch) this).field_f;
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
                        statePc = 17;
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
                        statePc = 17;
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
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        new java.net.URI(stackIn_12_4 + "://" + ((ch) this).field_a);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(stackIn_12_1);
                        stackOut_12_0 = ((ch) this).field_f;
                        stackOut_12_1 = null;
                        stackOut_12_2 = null;
                        stackOut_12_3 = new StringBuilder();
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_14_3 = stackOut_12_3;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        if (var5 != 0) {
                            statePc = 14;
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
                        stackOut_13_0 = (java.net.ProxySelector) (Object) stackIn_13_0;
                        stackOut_13_1 = null;
                        stackOut_13_2 = null;
                        stackOut_13_3 = (StringBuilder) (Object) stackIn_13_3;
                        stackOut_13_4 = "https";
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        stackIn_15_3 = stackOut_13_3;
                        stackIn_15_4 = stackOut_13_4;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (java.net.ProxySelector) (Object) stackIn_14_0;
                        stackOut_14_1 = null;
                        stackOut_14_2 = null;
                        stackOut_14_3 = (StringBuilder) (Object) stackIn_14_3;
                        stackOut_14_4 = "http";
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        stackIn_15_3 = stackOut_14_3;
                        stackIn_15_4 = stackOut_14_4;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        new java.net.URI(stackIn_15_4 + "://" + ((ch) this).field_a);
                        var4 = ((java.net.ProxySelector) (Object) stackIn_15_0).select(stackIn_15_1);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var6 = (java.net.URISyntaxException) (Object) caughtException;
                    return ((ch) this).a(-106);
                }
                case 18: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var8_array.length <= var9) {
                        statePc = 28;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var12_ref2 = this.a(false, var11);
                        if (var12_ref2 != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof ck ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof ck ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = (java.net.Socket) var12_ref2;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof ck ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var12 = (ck) (Object) caughtException;
                    var7 = var12;
                    var9++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 26: {
                    var12_ref = (IOException) (Object) caughtException;
                    var9++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 28: {
                    if (var7 != null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    return ((ch) this).a(-98);
                }
                case 30: {
                    throw var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(int param0, boolean param1, String param2, String param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        BufferedReader var15 = null;
        String var17 = null;
        String var34 = null;
        BufferedReader var35 = null;
        String var36 = null;
        String var43 = null;
        String var44 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        var13 = new java.net.Socket(param3, param0);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param2 == null) {
          L0: {
            var6.write(("CONNECT " + ((ch) this).field_a + ":" + ((ch) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var6.flush();
            var35 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var35;
            var8 = var35.readLine();
            if (var8 != null) {
              L1: {
                if (var8.startsWith("HTTP/1.0 200")) {
                  break L1;
                } else {
                  if (var8.startsWith("HTTP/1.1 200")) {
                    break L1;
                  } else {
                    L2: {
                      if (var8.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var35.readLine();
                        break L2;
                      } else {
                        if (!var8.startsWith("HTTP/1.1 407")) {
                          break L0;
                        } else {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          var8 = var10;
                          var8 = var35.readLine();
                          break L2;
                        }
                      }
                    }
                    L3: while (true) {
                      if (var8 != null) {
                        if ((var9 ^ -1) <= -51) {
                          throw new ck("");
                        } else {
                          if (var8.toLowerCase().startsWith(var10)) {
                            L4: {
                              var36 = var8.substring(var10.length()).trim();
                              var8 = var36;
                              var8 = var36;
                              var11 = var36.indexOf(' ');
                              if (var11 == -1) {
                                break L4;
                              } else {
                                var8 = var36.substring(0, var11);
                                break L4;
                              }
                            }
                            throw new ck(var8);
                          } else {
                            var8 = var35.readLine();
                            var9++;
                            continue L3;
                          }
                        }
                      } else {
                        throw new ck("");
                      }
                    }
                  }
                }
              }
              return var13;
            } else {
              break L0;
            }
          }
          var6.close();
          if (!param1) {
            var35.close();
            var13.close();
            return null;
          } else {
            return null;
          }
        } else {
          L5: {
            var6.write(("CONNECT " + ((ch) this).field_a + ":" + ((ch) this).field_b + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var6.flush();
            var15 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var15;
            var8 = var15.readLine();
            var17 = var8;
            var43 = var17;
            var8 = var43;
            var44 = var8;
            var43 = var8;
            var17 = var43;
            var43 = var17;
            var8 = var43;
            var44 = var8;
            if (var8 != null) {
              if (!var8.startsWith("HTTP/1.0 200")) {
                if (!var8.startsWith("HTTP/1.1 200")) {
                  L6: {
                    if (var8.startsWith("HTTP/1.0 407")) {
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var15.readLine();
                      break L6;
                    } else {
                      if (!var8.startsWith("HTTP/1.1 407")) {
                        break L5;
                      } else {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var10;
                        var8 = var10;
                        var8 = var15.readLine();
                        break L6;
                      }
                    }
                  }
                  L7: while (true) {
                    if (var8 != null) {
                      if ((var9 ^ -1) > -51) {
                        if (var8.toLowerCase().startsWith(var10)) {
                          L8: {
                            var34 = var8.substring(var10.length()).trim();
                            var8 = var34;
                            var8 = var34;
                            var11 = var34.indexOf(' ');
                            if (var11 == -1) {
                              break L8;
                            } else {
                              var8 = var34.substring(0, var11);
                              break L8;
                            }
                          }
                          throw new ck(var8);
                        } else {
                          var8 = var15.readLine();
                          var9++;
                          continue L7;
                        }
                      } else {
                        throw new ck("");
                      }
                    } else {
                      throw new ck("");
                    }
                  }
                } else {
                  return var13;
                }
              } else {
                return var13;
              }
            } else {
              break L5;
            }
          }
          var6.close();
          if (param1) {
            return null;
          } else {
            var15.close();
            var13.close();
            return null;
          }
        }
    }

    public static void d(int param0) {
        field_d = null;
        if (param0 >= -121) {
            ch.d(29);
            field_g = null;
            return;
        }
        field_g = null;
    }

    ch() {
        ((ch) this).field_f = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_d = "TIMES";
        field_g = "Go Back";
    }
}

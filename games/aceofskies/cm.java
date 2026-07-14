/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class cm extends jm {
    private java.net.ProxySelector field_g;

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        Object var3 = null;
        int var4 = 0;
        Object var5 = null;
        java.net.InetSocketAddress var5_ref = null;
        java.net.Socket var6 = null;
        Exception var7 = null;
        Class var7_ref = null;
        java.lang.reflect.Method var8 = null;
        Object var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        java.lang.reflect.Method var12 = null;
        String var13 = null;
        String var14 = null;
        Class var15 = null;
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
                    return ((cm) this).b((byte) 80);
                }
                case 3: {
                    var3 = param1.address();
                    var4 = -35 % ((-30 - param0) / 59);
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
                    var5_ref = (java.net.InetSocketAddress) var3;
                    if (param1.type() != java.net.Proxy.Type.HTTP) {
                        statePc = 15;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = null;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var7_ref = var15;
                        var8 = var15.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var8.setAccessible(true);
                        var9 = var8.invoke((Object) null, new Object[2]);
                        if (var9 != null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = var7_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var10.setAccessible(true);
                        if (((Boolean) var10.invoke(var9, new Object[0])).booleanValue()) {
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
                        var11 = var7_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var11.setAccessible(true);
                        var12 = var15.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var12.setAccessible(true);
                        var13 = (String) var11.invoke(var9, new Object[0]);
                        var14 = (String) var12.invoke(var9, new Object[2]);
                        var6 = (java.net.Socket) (Object) (var13 + ": " + var14);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var7 = (Exception) (Object) caughtException;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return this.a((byte) 127, (String) (Object) var6, var5_ref.getPort(), var5_ref.getHostName());
                }
                case 15: {
                    if (param1.type() != java.net.Proxy.Type.SOCKS) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var6 = new java.net.Socket(param1);
                    var6.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((cm) this).field_e, ((cm) this).field_f));
                    return var6;
                }
                case 17: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(ll param0, int param1) {
        qk.a((byte) -92);
        if (param1 != -14492) {
            return;
        }
        vp.a(((ll) param0).field_x, ((ll) param0).field_v, ((ll) param0).field_q);
    }

    final java.net.Socket a(byte param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        ls var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        java.net.Proxy var12 = null;
        ls var13 = null;
        IOException var13_ref = null;
        java.net.Socket var13_ref2 = null;
        int var14 = 0;
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
        java.net.Socket stackIn_21_0 = null;
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
        java.net.Socket stackOut_20_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = AceOfSkies.field_G ? 1 : 0;
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
                    if ((((cm) this).field_f ^ -1) != -444) {
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
                        stackOut_6_0 = ((cm) this).field_g;
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
                        new java.net.URI((String) (Object) (stackIn_9_4 + "://" + ((cm) this).field_e));
                        var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select((java.net.URI) (Object) stackIn_9_1);
                        stackOut_9_0 = ((cm) this).field_g;
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
                        new java.net.URI((String) (Object) (stackIn_12_4 + "://" + ((cm) this).field_e));
                        var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select((java.net.URI) (Object) stackIn_12_1);
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
                    return ((cm) this).b((byte) -116);
                }
                case 15: {
                    boolean discarded$3 = ((List) var3).addAll((Collection) (Object) var4);
                    var6_array = ((List) var3).toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = -91 % ((-33 - param0) / 38);
                    var10 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var8_array.length <= var10) {
                        statePc = 25;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var11 = var8_array[var10];
                    var12 = (java.net.Proxy) var11;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        var13_ref2 = this.a(-109, var12);
                        if (var13_ref2 != null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof ls ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var10++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof ls ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (java.net.Socket) var13_ref2;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof ls ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 21: {
                    return (java.net.Socket) (Object) stackIn_21_0;
                }
                case 22: {
                    var13 = (ls) (Object) caughtException;
                    var7 = var13;
                    var10++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 23: {
                    var13_ref = (IOException) (Object) caughtException;
                    var10++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 25: {
                    if (var7 != null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return ((cm) this).b((byte) 98);
                }
                case 27: {
                    throw var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(byte param0, String param1, int param2, String param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        BufferedReader var15 = null;
        String var32 = null;
        BufferedReader var33 = null;
        String var34 = null;
        BufferedReader var35 = null;
        String var36 = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        var13 = new java.net.Socket(param3, param2);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param0 > 119) {
          if (param1 != null) {
            L0: {
              var6.write(("CONNECT " + ((cm) this).field_e + ":" + ((cm) this).field_f + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              var6.flush();
              var35 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var7 = var35;
              var8 = var35.readLine();
              if (var8 == null) {
                break L0;
              } else {
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
                        L4: {
                          if (var8 == null) {
                            break L4;
                          } else {
                            if (-51 >= (var9 ^ -1)) {
                              break L4;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var8 = var35.readLine();
                                var9++;
                                continue L3;
                              } else {
                                L5: {
                                  var36 = var8.substring(var10.length()).trim();
                                  var8 = var36;
                                  var8 = var36;
                                  var11 = var36.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L5;
                                  } else {
                                    var8 = var36.substring(0, var11);
                                    break L5;
                                  }
                                }
                                throw new ls(var8);
                              }
                            }
                          }
                        }
                        throw new ls("");
                      }
                    }
                  }
                }
                return var13;
              }
            }
            var6.close();
            var35.close();
            var13.close();
            return null;
          } else {
            var6.write(("CONNECT " + ((cm) this).field_e + ":" + ((cm) this).field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var6.flush();
            var33 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var8 = var33.readLine();
            if (var8 != null) {
              L6: {
                if (var8.startsWith("HTTP/1.0 200")) {
                  break L6;
                } else {
                  if (var8.startsWith("HTTP/1.1 200")) {
                    break L6;
                  } else {
                    L7: {
                      if (var8.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var33.readLine();
                        break L7;
                      } else {
                        if (var8.startsWith("HTTP/1.1 407")) {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          var8 = var10;
                          var8 = var33.readLine();
                          break L7;
                        } else {
                          var6.close();
                          var33.close();
                          var13.close();
                          return null;
                        }
                      }
                    }
                    L8: while (true) {
                      L9: {
                        if (var8 == null) {
                          break L9;
                        } else {
                          if (-51 >= (var9 ^ -1)) {
                            break L9;
                          } else {
                            if (!var8.toLowerCase().startsWith(var10)) {
                              var8 = var33.readLine();
                              var9++;
                              continue L8;
                            } else {
                              L10: {
                                var34 = var8.substring(var10.length()).trim();
                                var8 = var34;
                                var8 = var34;
                                var11 = var34.indexOf(' ');
                                if (0 == (var11 ^ -1)) {
                                  break L10;
                                } else {
                                  var8 = var34.substring(0, var11);
                                  break L10;
                                }
                              }
                              throw new ls(var8);
                            }
                          }
                        }
                      }
                      throw new ls("");
                    }
                  }
                }
              }
              return var13;
            } else {
              var6.close();
              var33.close();
              var13.close();
              return null;
            }
          }
        } else {
          L11: {
            gk discarded$1 = cm.a(-79, (byte) 58);
            if (param1 != null) {
              var6.write(("CONNECT " + ((cm) this).field_e + ":" + ((cm) this).field_f + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L11;
            } else {
              var6.write(("CONNECT " + ((cm) this).field_e + ":" + ((cm) this).field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L11;
            }
          }
          var6.flush();
          var15 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var7 = var15;
          var8 = var15.readLine();
          var10 = var8;
          var8 = var10;
          if (var8 != null) {
            L12: {
              if (var8.startsWith("HTTP/1.0 200")) {
                break L12;
              } else {
                if (var8.startsWith("HTTP/1.1 200")) {
                  break L12;
                } else {
                  L13: {
                    if (var8.startsWith("HTTP/1.0 407")) {
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var15.readLine();
                      break L13;
                    } else {
                      if (var8.startsWith("HTTP/1.1 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var10;
                        var8 = var10;
                        var8 = var15.readLine();
                        break L13;
                      } else {
                        var6.close();
                        var15.close();
                        var13.close();
                        return null;
                      }
                    }
                  }
                  L14: while (true) {
                    if (var8 != null) {
                      if (-51 < (var9 ^ -1)) {
                        if (!var8.toLowerCase().startsWith(var10)) {
                          var8 = var15.readLine();
                          var9++;
                          continue L14;
                        } else {
                          L15: {
                            var32 = var8.substring(var10.length()).trim();
                            var8 = var32;
                            var8 = var32;
                            var11 = var32.indexOf(' ');
                            if (0 == (var11 ^ -1)) {
                              break L15;
                            } else {
                              var8 = var32.substring(0, var11);
                              break L15;
                            }
                          }
                          throw new ls(var8);
                        }
                      } else {
                        throw new ls("");
                      }
                    } else {
                      throw new ls("");
                    }
                  }
                }
              }
            }
            return var13;
          } else {
            var6.close();
            var15.close();
            var13.close();
            return null;
          }
        }
    }

    cm() {
        ((cm) this).field_g = java.net.ProxySelector.getDefault();
    }

    final static gk a(int param0, byte param1) {
        int var2 = 0;
        gk stackIn_3_0 = null;
        gk stackOut_1_0 = null;
        var2 = -125 % ((34 - param1) / 51);
        if (null == iq.field_h) {
          if ((param0 ^ -1) == 0) {
            return iq.field_h;
          } else {
            return lc.a(true, false, true, (byte) -65, 1, param0);
          }
        } else {
          stackOut_1_0 = iq.field_h;
          stackIn_3_0 = stackOut_1_0;
          return (gk) (Object) stackIn_3_0;
        }
    }

    static {
    }
}

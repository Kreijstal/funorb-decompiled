/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class vb extends ca {
    static a field_l;
    static String field_m;
    static boolean field_j;
    private java.net.ProxySelector field_k;

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
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
                    if (param0.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return ((vb) this).a(-1);
                }
                case 2: {
                    var3 = param0.address();
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
                    var4 = -26 / ((param1 - 53) / 54);
                    var5_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param0.type() != java.net.Proxy.Type.HTTP) {
                        statePc = 14;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var6 = null;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var7_ref = var15;
                        var8 = var15.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var8.setAccessible(true);
                        var9 = var8.invoke((Object) null, new Object[2]);
                        if (var9 != null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = var7_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var10.setAccessible(true);
                        if (((Boolean) var10.invoke(var9, new Object[0])).booleanValue()) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11 = var7_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var11.setAccessible(true);
                        var12 = var15.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var12.setAccessible(true);
                        var13 = (String) var11.invoke(var9, new Object[0]);
                        var14 = (String) var12.invoke(var9, new Object[2]);
                        var6 = (java.net.Socket) (Object) (var13 + ": " + var14);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var7 = (Exception) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return this.a((String) (Object) var6, var5_ref.getHostName(), -124, var5_ref.getPort());
                }
                case 14: {
                    if (param0.type() != java.net.Proxy.Type.SOCKS) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var6 = new java.net.Socket(param0);
                    var6.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((vb) this).field_a, ((vb) this).field_e));
                    return var6;
                }
                case 16: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final java.net.Socket a(byte param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        bn var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        bn var12 = null;
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
                    var13 = TetraLink.field_J;
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
                    if (-444 != (((vb) this).field_e ^ -1)) {
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
                        stackOut_6_0 = ((vb) this).field_k;
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
                        if (var5 == 0) {
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
                        stackOut_7_4 = "https";
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
                        stackOut_8_4 = "http";
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
                        new java.net.URI(stackIn_9_4 + "://" + ((vb) this).field_a);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(stackIn_9_1);
                        stackOut_9_0 = ((vb) this).field_k;
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
                        new java.net.URI(stackIn_12_4 + "://" + ((vb) this).field_a);
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
                    return ((vb) this).a(-1);
                }
                case 15: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    if (param0 < -45) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    field_l = null;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
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
                        var12_ref2 = this.a(var11, 111);
                        if (var12_ref2 != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof bn ? 24 : 25);
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
                        statePc = (stateCaught_21 instanceof bn ? 24 : 25);
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
                        statePc = (stateCaught_22 instanceof bn ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var12 = (bn) (Object) caughtException;
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
                    return ((vb) this).a(-1);
                }
                case 29: {
                    throw var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        java.net.Socket var14 = null;
        BufferedReader var16 = null;
        String var17 = null;
        String var38 = null;
        BufferedReader var39 = null;
        String var40 = null;
        String var42 = null;
        String var43 = null;
        String var44 = null;
        String var45 = null;
        String var46 = null;
        String var49 = null;
        String var50 = null;
        var12 = TetraLink.field_J;
        var14 = new java.net.Socket(param1, param3);
        var14.setSoTimeout(10000);
        var6 = var14.getOutputStream();
        if (param0 == null) {
          var6.write(("CONNECT " + ((vb) this).field_a + ":" + ((vb) this).field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
          var7 = var16;
          var8 = var16.readLine();
          var10 = var8;
          var8 = var10;
          var49 = var8;
          var10 = var8;
          if (param2 >= -58) {
            L0: {
              var13 = null;
              vb.a(18, (java.awt.Component) null);
              if (var8 != null) {
                if (!var8.startsWith("HTTP/1.0 200")) {
                  if (!var8.startsWith("HTTP/1.1 200")) {
                    L1: {
                      if (var8.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var16.readLine();
                        break L1;
                      } else {
                        if (!var8.startsWith("HTTP/1.1 407")) {
                          break L0;
                        } else {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          var8 = var10;
                          var8 = var16.readLine();
                          break L1;
                        }
                      }
                    }
                    L2: while (true) {
                      L3: {
                        if (var8 == null) {
                          break L3;
                        } else {
                          if (-51 >= (var9 ^ -1)) {
                            break L3;
                          } else {
                            if (var8.toLowerCase().startsWith(var10)) {
                              L4: {
                                var38 = var8.substring(var10.length()).trim();
                                var8 = var38;
                                var8 = var38;
                                var11 = var38.indexOf(' ');
                                if (0 == (var11 ^ -1)) {
                                  break L4;
                                } else {
                                  var8 = var38.substring(0, var11);
                                  break L4;
                                }
                              }
                              throw new bn(var8);
                            } else {
                              var9++;
                              var8 = var16.readLine();
                              continue L2;
                            }
                          }
                        }
                      }
                      throw new bn("");
                    }
                  } else {
                    return var14;
                  }
                } else {
                  return var14;
                }
              } else {
                break L0;
              }
            }
            var6.close();
            var16.close();
            var14.close();
            return null;
          } else {
            if (var8 != null) {
              L5: {
                if (var8.startsWith("HTTP/1.0 200")) {
                  break L5;
                } else {
                  if (!var8.startsWith("HTTP/1.1 200")) {
                    L6: {
                      if (var8.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var16.readLine();
                        break L6;
                      } else {
                        if (var8.startsWith("HTTP/1.1 407")) {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          var8 = var10;
                          var8 = var16.readLine();
                          break L6;
                        } else {
                          var6.close();
                          var16.close();
                          var14.close();
                          return null;
                        }
                      }
                    }
                    L7: while (true) {
                      if (var8 != null) {
                        if (-51 < (var9 ^ -1)) {
                          if (var8.toLowerCase().startsWith(var10)) {
                            L8: {
                              var17 = var8.substring(var10.length()).trim();
                              var8 = var17;
                              var8 = var17;
                              var11 = var17.indexOf(' ');
                              if (0 == (var11 ^ -1)) {
                                break L8;
                              } else {
                                var8 = var17.substring(0, var11);
                                break L8;
                              }
                            }
                            throw new bn(var8);
                          } else {
                            var9++;
                            var8 = var16.readLine();
                            continue L7;
                          }
                        } else {
                          throw new bn("");
                        }
                      } else {
                        throw new bn("");
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              return var14;
            } else {
              var6.close();
              var16.close();
              var14.close();
              return null;
            }
          }
        } else {
          var6.write(("CONNECT " + ((vb) this).field_a + ":" + ((vb) this).field_e + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          var39 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
          var7 = var39;
          var8 = var39.readLine();
          var10 = var8;
          var8 = var10;
          var10 = var8;
          if (param2 < -58) {
            if (var8 != null) {
              if (var8.startsWith("HTTP/1.0 200")) {
                return var14;
              } else {
                if (!var8.startsWith("HTTP/1.1 200")) {
                  if (var8.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var43 = "proxy-authenticate: ";
                    var8 = var43;
                    var8 = var43;
                    var8 = var39.readLine();
                    L9: while (true) {
                      L10: {
                        if (var8 == null) {
                          break L10;
                        } else {
                          if (-51 >= (var9 ^ -1)) {
                            break L10;
                          } else {
                            if (var8.toLowerCase().startsWith(var43)) {
                              L11: {
                                var44 = var8.substring(var43.length()).trim();
                                var8 = var44;
                                var8 = var44;
                                var11 = var44.indexOf(' ');
                                if (0 == (var11 ^ -1)) {
                                  break L11;
                                } else {
                                  var8 = var44.substring(0, var11);
                                  break L11;
                                }
                              }
                              throw new bn(var8);
                            } else {
                              var9++;
                              var8 = var39.readLine();
                              continue L9;
                            }
                          }
                        }
                      }
                      throw new bn("");
                    }
                  } else {
                    if (!var8.startsWith("HTTP/1.1 407")) {
                      var6.close();
                      var39.close();
                      var14.close();
                      return null;
                    } else {
                      var9 = 0;
                      var45 = "proxy-authenticate: ";
                      var8 = var45;
                      var8 = var45;
                      var10 = var45;
                      var8 = var10;
                      var8 = var10;
                      var8 = var39.readLine();
                      L12: while (true) {
                        L13: {
                          if (var8 == null) {
                            break L13;
                          } else {
                            if (-51 >= (var9 ^ -1)) {
                              break L13;
                            } else {
                              if (var8.toLowerCase().startsWith(var45)) {
                                L14: {
                                  var46 = var8.substring(var45.length()).trim();
                                  var8 = var46;
                                  var8 = var46;
                                  var11 = var46.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L14;
                                  } else {
                                    var8 = var46.substring(0, var11);
                                    break L14;
                                  }
                                }
                                throw new bn(var8);
                              } else {
                                var9++;
                                var8 = var39.readLine();
                                var50 = var8;
                                var50 = var8;
                                continue L12;
                              }
                            }
                          }
                        }
                        throw new bn("");
                      }
                    }
                  }
                } else {
                  return var14;
                }
              }
            } else {
              var6.close();
              var39.close();
              var14.close();
              return null;
            }
          } else {
            L15: {
              var13 = null;
              vb.a(18, (java.awt.Component) null);
              if (var8 != null) {
                L16: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L16;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L17: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var39.readLine();
                          break L17;
                        } else {
                          if (!var8.startsWith("HTTP/1.1 407")) {
                            break L15;
                          } else {
                            var9 = 0;
                            var10 = "proxy-authenticate: ";
                            var40 = var10;
                            var8 = var40;
                            var8 = var10;
                            var8 = var39.readLine();
                            var40 = var8;
                            var8 = var40;
                            break L17;
                          }
                        }
                      }
                      L18: while (true) {
                        L19: {
                          if (var8 == null) {
                            break L19;
                          } else {
                            if (-51 >= (var9 ^ -1)) {
                              break L19;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L20: {
                                  var40 = var8.substring(var10.length()).trim();
                                  var8 = var40;
                                  var8 = var40;
                                  var11 = var40.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L20;
                                  } else {
                                    var8 = var40.substring(0, var11);
                                    break L20;
                                  }
                                }
                                throw new bn(var8);
                              } else {
                                var9++;
                                var8 = var39.readLine();
                                var42 = var8;
                                var8 = var42;
                                continue L18;
                              }
                            }
                          }
                        }
                        throw new bn("");
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                return var14;
              } else {
                break L15;
              }
            }
            var6.close();
            var39.close();
            var14.close();
            return null;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != -109) {
            field_j = false;
            field_l = null;
            field_m = null;
            return;
        }
        field_l = null;
        field_m = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) kd.field_g);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) kd.field_g);
        if (param0 != -51) {
            return;
        }
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) kd.field_g);
        kf.field_c = 0;
    }

    final static boolean e(int param0) {
        if (param0 != -30962) {
            field_j = false;
            return lf.field_b != null ? true : false;
        }
        return lf.field_b != null ? true : false;
    }

    vb() {
        ((vb) this).field_k = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Quick Chat Help";
        field_l = new a();
    }
}

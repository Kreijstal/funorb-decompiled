/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class kr extends bg {
    private java.net.ProxySelector field_f;
    static na field_e;
    static int field_h;
    static long field_g;

    public static void c(int param0) {
        field_e = null;
        if (param0 != 15296) {
            Object var2 = null;
            kr.a((byte) -15, 68L, (String) null);
        }
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
                    return ((kr) this).b(5101);
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
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param1.type() != java.net.Proxy.Type.HTTP) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = null;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 == null) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
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
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return this.a(var4_ref.getPort(), (byte) 25, (String) (Object) var5, var4_ref.getHostName());
                }
                case 14: {
                    if (param1.type() != java.net.Proxy.Type.SOCKS) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5 = new java.net.Socket(param1);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((kr) this).field_c, ((kr) this).field_a));
                    return var5;
                }
                case 16: {
                    if (param0 == -6589) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    kr.a(false);
                    return null;
                }
                case 18: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(int param0, byte param1, String param2, String param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        BufferedReader var16 = null;
        String var17 = null;
        String var38 = null;
        BufferedReader var39 = null;
        String var40 = null;
        String var41 = null;
        BufferedReader var42 = null;
        String var43 = null;
        String var46 = null;
        String var47 = null;
        String var48 = null;
        String var49 = null;
        String var52 = null;
        String var57 = null;
        String var58 = null;
        var12 = Pool.field_O;
        var13 = new java.net.Socket(param3, param0);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param2 != null) {
          L0: {
            var6.write(("CONNECT " + ((kr) this).field_c + ":" + ((kr) this).field_a + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            if (param1 == 25) {
              break L0;
            } else {
              kr.c(-94);
              break L0;
            }
          }
          var6.flush();
          var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var7 = var16;
          var17 = var16.readLine();
          var52 = var17;
          var8 = var52;
          var52 = var17;
          var14 = var17;
          var52 = var14;
          var8 = var52;
          var52 = var14;
          if (var17 != null) {
            if (!var17.startsWith("HTTP/1.0 200")) {
              if (!var17.startsWith("HTTP/1.1 200")) {
                L1: {
                  if (var17.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var8 = var16.readLine();
                    var10 = "proxy-authenticate: ";
                    break L1;
                  } else {
                    if (var17.startsWith("HTTP/1.1 407")) {
                      var9 = 0;
                      var8 = var16.readLine();
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
                      break L1;
                    } else {
                      var6.close();
                      var16.close();
                      var13.close();
                      return null;
                    }
                  }
                }
                L2: while (true) {
                  L3: {
                    if (var8 == null) {
                      break L3;
                    } else {
                      if ((var9 ^ -1) <= -51) {
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
                          throw new lo(var8);
                        } else {
                          var9++;
                          var8 = var16.readLine();
                          continue L2;
                        }
                      }
                    }
                  }
                  throw new lo("");
                }
              } else {
                return var13;
              }
            } else {
              return var13;
            }
          } else {
            var6.close();
            var16.close();
            var13.close();
            return null;
          }
        } else {
          var6.write(("CONNECT " + ((kr) this).field_c + ":" + ((kr) this).field_a + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          if (param1 == 25) {
            var6.flush();
            var42 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var42;
            var43 = var42.readLine();
            var57 = var43;
            var8 = var57;
            var57 = var43;
            if (var43 != null) {
              if (var43.startsWith("HTTP/1.0 200")) {
                return var13;
              } else {
                if (!var43.startsWith("HTTP/1.1 200")) {
                  if (var43.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var8 = var42.readLine();
                    var46 = "proxy-authenticate: ";
                    var8 = var46;
                    var8 = var46;
                    L5: while (true) {
                      L6: {
                        if (var8 == null) {
                          break L6;
                        } else {
                          if ((var9 ^ -1) <= -51) {
                            break L6;
                          } else {
                            if (var8.toLowerCase().startsWith(var46)) {
                              L7: {
                                var47 = var8.substring(var46.length()).trim();
                                var8 = var47;
                                var8 = var47;
                                var11 = var47.indexOf(' ');
                                if (0 == (var11 ^ -1)) {
                                  break L7;
                                } else {
                                  var8 = var47.substring(0, var11);
                                  break L7;
                                }
                              }
                              throw new lo(var8);
                            } else {
                              var9++;
                              var8 = var42.readLine();
                              continue L5;
                            }
                          }
                        }
                      }
                      throw new lo("");
                    }
                  } else {
                    if (!var43.startsWith("HTTP/1.1 407")) {
                      var6.close();
                      var42.close();
                      var13.close();
                      return null;
                    } else {
                      var9 = 0;
                      var8 = var42.readLine();
                      var48 = "proxy-authenticate: ";
                      var8 = var48;
                      var8 = var48;
                      var10 = var48;
                      var8 = var10;
                      var8 = var10;
                      L8: while (true) {
                        L9: {
                          if (var8 == null) {
                            break L9;
                          } else {
                            if ((var9 ^ -1) <= -51) {
                              break L9;
                            } else {
                              if (var8.toLowerCase().startsWith(var48)) {
                                L10: {
                                  var49 = var8.substring(var48.length()).trim();
                                  var8 = var49;
                                  var8 = var49;
                                  var11 = var49.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L10;
                                  } else {
                                    var8 = var49.substring(0, var11);
                                    break L10;
                                  }
                                }
                                throw new lo(var8);
                              } else {
                                var9++;
                                var8 = var42.readLine();
                                var58 = var8;
                                var58 = var8;
                                continue L8;
                              }
                            }
                          }
                        }
                        throw new lo("");
                      }
                    }
                  }
                } else {
                  return var13;
                }
              }
            } else {
              var6.close();
              var42.close();
              var13.close();
              return null;
            }
          } else {
            L11: {
              kr.c(-94);
              var6.flush();
              var39 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var40 = var39.readLine();
              var8 = var40;
              var8 = var40;
              if (var40 != null) {
                L12: {
                  if (var40.startsWith("HTTP/1.0 200")) {
                    break L12;
                  } else {
                    if (!var40.startsWith("HTTP/1.1 200")) {
                      L13: {
                        if (var40.startsWith("HTTP/1.0 407")) {
                          var9 = 0;
                          var8 = var39.readLine();
                          var10 = "proxy-authenticate: ";
                          break L13;
                        } else {
                          if (!var40.startsWith("HTTP/1.1 407")) {
                            break L11;
                          } else {
                            var9 = 0;
                            var8 = var39.readLine();
                            var10 = "proxy-authenticate: ";
                            var8 = var10;
                            var8 = var10;
                            break L13;
                          }
                        }
                      }
                      L14: while (true) {
                        L15: {
                          if (var8 == null) {
                            break L15;
                          } else {
                            if ((var9 ^ -1) <= -51) {
                              break L15;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L16: {
                                  var41 = var8.substring(var10.length()).trim();
                                  var8 = var41;
                                  var8 = var41;
                                  var11 = var41.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L16;
                                  } else {
                                    var8 = var41.substring(0, var11);
                                    break L16;
                                  }
                                }
                                throw new lo(var8);
                              } else {
                                var9++;
                                var8 = var39.readLine();
                                var57 = var8;
                                var8 = var57;
                                var57 = var8;
                                continue L14;
                              }
                            }
                          }
                        }
                        throw new lo("");
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                return var13;
              } else {
                break L11;
              }
            }
            var6.close();
            var39.close();
            var13.close();
            return null;
          }
        }
    }

    kr() {
        ((kr) this).field_f = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket a(byte param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        lo var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        lo var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_6_0 = 0;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        String stackIn_11_4 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        java.net.ProxySelector stackIn_14_0 = null;
        java.net.URI stackIn_14_1 = null;
        java.net.URI stackIn_14_2 = null;
        StringBuilder stackIn_14_3 = null;
        String stackIn_14_4 = null;
        java.net.Socket stackIn_23_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        String stackOut_9_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.ProxySelector stackOut_13_0 = null;
        java.net.URI stackOut_13_1 = null;
        java.net.URI stackOut_13_2 = null;
        StringBuilder stackOut_13_3 = null;
        String stackOut_13_4 = null;
        java.net.Socket stackOut_22_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Pool.field_O;
                    if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (((kr) this).field_a != 443) {
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
                    if (param0 <= -94) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return null;
                }
                case 8: {
                    try {
                        stackOut_8_0 = ((kr) this).field_f;
                        stackOut_8_1 = null;
                        stackOut_8_2 = null;
                        stackOut_8_3 = new StringBuilder();
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        stackIn_10_3 = stackOut_8_3;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        stackIn_9_3 = stackOut_8_3;
                        if (var5 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (java.net.ProxySelector) (Object) stackIn_9_0;
                        stackOut_9_1 = null;
                        stackOut_9_2 = null;
                        stackOut_9_3 = (StringBuilder) (Object) stackIn_9_3;
                        stackOut_9_4 = "https";
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_11_3 = stackOut_9_3;
                        stackIn_11_4 = stackOut_9_4;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
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
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        stackIn_11_3 = stackOut_10_3;
                        stackIn_11_4 = stackOut_10_4;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        new java.net.URI(stackIn_11_4 + "://" + ((kr) this).field_c);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(stackIn_11_1);
                        stackOut_11_0 = ((kr) this).field_f;
                        stackOut_11_1 = null;
                        stackOut_11_2 = null;
                        stackOut_11_3 = new StringBuilder();
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        if (var5 != 0) {
                            statePc = 13;
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
                        stackOut_12_0 = (java.net.ProxySelector) (Object) stackIn_12_0;
                        stackOut_12_1 = null;
                        stackOut_12_2 = null;
                        stackOut_12_3 = (StringBuilder) (Object) stackIn_12_3;
                        stackOut_12_4 = "https";
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_14_3 = stackOut_12_3;
                        stackIn_14_4 = stackOut_12_4;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (java.net.ProxySelector) (Object) stackIn_13_0;
                        stackOut_13_1 = null;
                        stackOut_13_2 = null;
                        stackOut_13_3 = (StringBuilder) (Object) stackIn_13_3;
                        stackOut_13_4 = "http";
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        stackIn_14_3 = stackOut_13_3;
                        stackIn_14_4 = stackOut_13_4;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        new java.net.URI(stackIn_14_4 + "://" + ((kr) this).field_c);
                        var4 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(stackIn_14_1);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var6 = (java.net.URISyntaxException) (Object) caughtException;
                    return ((kr) this).b(5101);
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
                        var12_ref2 = this.a(-6589, var11);
                        if (var12_ref2 != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof lo ? 24 : 25);
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
                        statePc = (stateCaught_21 instanceof lo ? 24 : 25);
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
                        statePc = (stateCaught_22 instanceof lo ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var12 = (lo) (Object) caughtException;
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
                    return ((kr) this).b(5101);
                }
                case 29: {
                    throw var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0) {
        String var1 = null;
        if (!ro.field_e) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (d.field_d != null) {
              d.field_d.k(17);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = ve.d(120);
          vj.field_j = new ui(var1, (String) null, true, false, param0);
          wd.field_Ub.b((ei) (Object) tn.field_n, 30000);
          tn.field_n.d((ei) (Object) vj.field_j, 30);
          tn.field_n.b(param0);
          return;
        }
    }

    final static void a(byte param0, long param1, String param2) {
        CharSequence var5 = null;
        CharSequence var6 = null;
        if (param0 >= -58) {
          field_e = null;
          fm.field_I = param2;
          hn.field_b = 2;
          var5 = (CharSequence) (Object) param2;
          di.field_a = hq.a(88, var5);
          c.field_d = param1;
          rg.field_p = true;
          return;
        } else {
          fm.field_I = param2;
          hn.field_b = 2;
          var6 = (CharSequence) (Object) param2;
          di.field_a = hq.a(88, var6);
          c.field_d = param1;
          rg.field_p = true;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 99;
        field_e = new na();
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class wi extends dl {
    static String field_h;
    static int field_m;
    static th field_i;
    private java.net.ProxySelector field_l;
    static mh field_n;
    static int field_k;
    static boolean field_g;
    static mh field_j;

    final java.net.Socket a(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        ef var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        ef var12 = null;
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
        java.net.Socket stackIn_21_0 = null;
        int stackOut_3_0;
        int stackOut_4_0;
        java.net.ProxySelector stackOut_6_0;
        java.net.URI stackOut_6_1;
        java.net.URI stackOut_6_2;
        StringBuilder stackOut_6_3;
        java.net.ProxySelector stackOut_7_0;
        java.net.URI stackOut_7_1;
        java.net.URI stackOut_7_2;
        StringBuilder stackOut_7_3;
        String stackOut_7_4;
        java.net.ProxySelector stackOut_8_0;
        java.net.URI stackOut_8_1;
        java.net.URI stackOut_8_2;
        StringBuilder stackOut_8_3;
        String stackOut_8_4;
        java.net.ProxySelector stackOut_9_0;
        java.net.URI stackOut_9_1;
        java.net.URI stackOut_9_2;
        StringBuilder stackOut_9_3;
        java.net.ProxySelector stackOut_10_0;
        java.net.URI stackOut_10_1;
        java.net.URI stackOut_10_2;
        StringBuilder stackOut_10_3;
        String stackOut_10_4;
        java.net.ProxySelector stackOut_11_0;
        java.net.URI stackOut_11_1;
        java.net.URI stackOut_11_2;
        StringBuilder stackOut_11_3;
        String stackOut_11_4;
        java.net.Socket stackOut_20_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = BrickABrac.field_J ? 1 : 0;
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
                    if (443 != ((wi) this).field_c) {
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
                        stackOut_6_0 = ((wi) this).field_l;
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
                        new java.net.URI((String) (Object) (stackIn_9_4 + "://" + ((wi) this).field_a));
                        var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select((java.net.URI) (Object) stackIn_9_1);
                        stackOut_9_0 = ((wi) this).field_l;
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
                        new java.net.URI((String) (Object) (stackIn_12_4 + "://" + ((wi) this).field_a));
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
                    return ((wi) this).a((byte) -76);
                }
                case 15: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = param0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var8_array.length <= var9) {
                        statePc = 25;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        var12_ref2 = this.a(param0 + 8, var11);
                        if (var12_ref2 != null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof ef ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof ef ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (java.net.Socket) var12_ref2;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof ef ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 21: {
                    return (java.net.Socket) (Object) stackIn_21_0;
                }
                case 22: {
                    var12 = (ef) (Object) caughtException;
                    var7 = var12;
                    var9++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 23: {
                    var12_ref = (IOException) (Object) caughtException;
                    var9++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 25: {
                    if (var7 != null) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    throw var7;
                }
                case 28: {
                    return ((wi) this).a((byte) -76);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        if (param0 != -54) {
          field_h = null;
          field_i = null;
          field_j = null;
          field_h = null;
          field_n = null;
          return;
        } else {
          field_i = null;
          field_j = null;
          field_h = null;
          field_n = null;
          return;
        }
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        BufferedReader var16 = null;
        String var27 = null;
        String var38 = null;
        BufferedReader var39 = null;
        String var40 = null;
        String var41 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        var13 = new java.net.Socket(param2, param1);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param3 == null) {
          L0: {
            var6.write(("CONNECT " + ((wi) this).field_a + ":" + ((wi) this).field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var6.flush();
            var39 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var39;
            var40 = var39.readLine();
            var8 = var40;
            var8 = var40;
            if (param0 < -61) {
              break L0;
            } else {
              int discarded$2 = wi.a((byte) -52, 76);
              break L0;
            }
          }
          L1: {
            if (var40 == null) {
              break L1;
            } else {
              L2: {
                if (var40.startsWith("HTTP/1.0 200")) {
                  break L2;
                } else {
                  if (!var40.startsWith("HTTP/1.1 200")) {
                    L3: {
                      if (var40.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var39.readLine();
                        break L3;
                      } else {
                        if (!var40.startsWith("HTTP/1.1 407")) {
                          break L1;
                        } else {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          var8 = var10;
                          var8 = var39.readLine();
                          break L3;
                        }
                      }
                    }
                    L4: while (true) {
                      L5: {
                        if (var8 == null) {
                          break L5;
                        } else {
                          if (var9 >= 50) {
                            break L5;
                          } else {
                            if (!var8.toLowerCase().startsWith(var10)) {
                              var9++;
                              var8 = var39.readLine();
                              continue L4;
                            } else {
                              L6: {
                                var41 = var8.substring(var10.length()).trim();
                                var8 = var41;
                                var8 = var41;
                                var11 = var41.indexOf(' ');
                                if (var11 == -1) {
                                  break L6;
                                } else {
                                  var8 = var41.substring(0, var11);
                                  break L6;
                                }
                              }
                              throw new ef(var8);
                            }
                          }
                        }
                      }
                      throw new ef("");
                    }
                  } else {
                    break L2;
                  }
                }
              }
              return var13;
            }
          }
          var6.close();
          var39.close();
          var13.close();
          return null;
        } else {
          L7: {
            var6.write(("CONNECT " + ((wi) this).field_a + ":" + ((wi) this).field_c + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var6.flush();
            var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var16;
            var27 = var16.readLine();
            var8 = var27;
            var8 = var27;
            if (param0 < -61) {
              break L7;
            } else {
              int discarded$3 = wi.a((byte) -52, 76);
              break L7;
            }
          }
          if (var27 != null) {
            L8: {
              if (var27.startsWith("HTTP/1.0 200")) {
                break L8;
              } else {
                if (!var27.startsWith("HTTP/1.1 200")) {
                  L9: {
                    if (var27.startsWith("HTTP/1.0 407")) {
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var16.readLine();
                      break L9;
                    } else {
                      if (var27.startsWith("HTTP/1.1 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var10;
                        var8 = var10;
                        var8 = var16.readLine();
                        break L9;
                      } else {
                        var6.close();
                        var16.close();
                        var13.close();
                        return null;
                      }
                    }
                  }
                  L10: while (true) {
                    L11: {
                      if (var8 == null) {
                        break L11;
                      } else {
                        if (var9 >= 50) {
                          break L11;
                        } else {
                          if (!var8.toLowerCase().startsWith(var10)) {
                            var9++;
                            var8 = var16.readLine();
                            continue L10;
                          } else {
                            L12: {
                              var38 = var8.substring(var10.length()).trim();
                              var8 = var38;
                              var8 = var38;
                              var11 = var38.indexOf(' ');
                              if (var11 == -1) {
                                break L12;
                              } else {
                                var8 = var38.substring(0, var11);
                                break L12;
                              }
                            }
                            throw new ef(var8);
                          }
                        }
                      }
                    }
                    throw new ef("");
                  }
                } else {
                  break L8;
                }
              }
            }
            return var13;
          } else {
            var6.close();
            var16.close();
            var13.close();
            return null;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if ((param1 & 7) != 0) {
            var2 = -(param1 & 7) + 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -71) {
          wi.b((byte) -125);
          var3 = var2 + param1;
          return var3;
        } else {
          var3 = var2 + param1;
          return var3;
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
                    if (param1.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return ((wi) this).a((byte) -76);
                }
                case 2: {
                    var3 = param1.address();
                    if (param0 == 8) {
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
                    return this.a(-83, var4_ref.getPort(), var4_ref.getHostName(), (String) (Object) var5);
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
                    var5 = new java.net.Socket(param1);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((wi) this).field_a, ((wi) this).field_c));
                    return var5;
                }
                case 17: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    wi() {
        ((wi) this).field_l = java.net.ProxySelector.getDefault();
    }

    final static int c(int param0) {
        if (param0 != 1) {
            field_j = null;
            return ge.field_w;
        }
        return ge.field_w;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Connection lost. <%0>";
        field_i = new th(8, 0, 4, 1);
        field_g = false;
    }
}

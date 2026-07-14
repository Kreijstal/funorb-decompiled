/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class fc extends gl {
    static cf field_q;
    static int field_o;
    private java.net.ProxySelector field_n;
    static nf field_p;
    static ka field_m;

    final static long e(int param0) {
        if (param0 < 74) {
            field_m = null;
            return ol.a(256) + -ac.field_e;
        }
        return ol.a(256) + -ac.field_e;
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        Object var3 = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        int var5 = 0;
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
                    if (param0.type() == java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return ((fc) this).b(1);
                }
                case 3: {
                    var3 = param0.address();
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
                    var5 = 11 % ((param1 - 70) / 46);
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param0.type() == java.net.Proxy.Type.HTTP) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 8;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var6 = new java.net.Socket(param0);
                    var6.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((fc) this).field_i, ((fc) this).field_d));
                    return var6;
                }
                case 9: {
                    var6 = null;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var7_ref = var15;
                        var8 = var15.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var8.setAccessible(true);
                        var9 = var8.invoke((Object) null, new Object[2]);
                        if (var9 != null) {
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10 = var7_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var10.setAccessible(true);
                        if (!((Boolean) var10.invoke(var9, new Object[0])).booleanValue()) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var11 = var7_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var11.setAccessible(true);
                        var12 = var15.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var12.setAccessible(true);
                        var13 = (String) var11.invoke(var9, new Object[0]);
                        var14 = (String) var12.invoke(var9, new Object[2]);
                        var6 = (java.net.Socket) (Object) (var13 + ": " + var14);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var7 = (Exception) (Object) caughtException;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return this.a(var4_ref.getPort(), 52, var4_ref.getHostName(), (String) (Object) var6);
                }
                case 17: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static lj a(boolean param0, int param1, int param2, int param3, boolean param4) {
        int var5 = 118 % ((-62 - param2) / 37);
        return bb.a(param3, param4, param1, (byte) 92, false, param0);
    }

    final static boolean d(int param0) {
        if (param0 <= 121) {
            return true;
        }
        return eh.field_p == qc.field_i ? true : false;
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        int var6 = 0;
        OutputStream var7 = null;
        BufferedReader var8 = null;
        String var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        java.net.Socket var14 = null;
        BufferedReader var16 = null;
        String var18 = null;
        String var35 = null;
        BufferedReader var36 = null;
        String var38 = null;
        String var39 = null;
        String var40 = null;
        String var41 = null;
        String var42 = null;
        String var46 = null;
        String var47 = null;
        var13 = TorChallenge.field_F ? 1 : 0;
        var6 = -39 % ((param1 - -24) / 41);
        var14 = new java.net.Socket(param2, param0);
        var14.setSoTimeout(10000);
        var7 = var14.getOutputStream();
        if (param3 != null) {
          L0: {
            var7.write(("CONNECT " + ((fc) this).field_i + ":" + ((fc) this).field_d + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var7.flush();
            var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
            var8 = var16;
            var9 = var16.readLine();
            var18 = var9;
            var9 = var18;
            if (var9 != null) {
              if (!var9.startsWith("HTTP/1.0 200")) {
                if (!var9.startsWith("HTTP/1.1 200")) {
                  L1: {
                    if (var9.startsWith("HTTP/1.0 407")) {
                      var10 = 0;
                      var9 = var16.readLine();
                      var11 = "proxy-authenticate: ";
                      break L1;
                    } else {
                      if (var9.startsWith("HTTP/1.1 407")) {
                        var10 = 0;
                        var9 = var16.readLine();
                        var46 = var9;
                        var11 = "proxy-authenticate: ";
                        var46 = var11;
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                  L2: while (true) {
                    if (var9 != null) {
                      if ((var10 ^ -1) > -51) {
                        if (var9.toLowerCase().startsWith(var11)) {
                          L3: {
                            var35 = var9.substring(var11.length()).trim();
                            var9 = var35;
                            var12 = var35.indexOf(' ');
                            if (0 != (var12 ^ -1)) {
                              var9 = var35.substring(0, var12);
                              break L3;
                            } else {
                              var9 = var35;
                              break L3;
                            }
                          }
                          throw new bj(var9);
                        } else {
                          var9 = var16.readLine();
                          var10++;
                          continue L2;
                        }
                      } else {
                        throw new bj("");
                      }
                    } else {
                      throw new bj("");
                    }
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
          var7.close();
          var16.close();
          var14.close();
          return null;
        } else {
          var7.write(("CONNECT " + ((fc) this).field_i + ":" + ((fc) this).field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var7.flush();
          var36 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
          var8 = var36;
          var9 = var36.readLine();
          var38 = var9;
          var9 = var38;
          if (var9 != null) {
            if (!var9.startsWith("HTTP/1.0 200")) {
              if (!var9.startsWith("HTTP/1.1 200")) {
                if (var9.startsWith("HTTP/1.0 407")) {
                  var10 = 0;
                  var9 = var36.readLine();
                  var39 = "proxy-authenticate: ";
                  var9 = var39;
                  L4: while (true) {
                    if (var9 != null) {
                      if ((var10 ^ -1) > -51) {
                        if (var9.toLowerCase().startsWith(var39)) {
                          L5: {
                            var40 = var9.substring(var39.length()).trim();
                            var9 = var40;
                            var12 = var40.indexOf(' ');
                            if (0 != (var12 ^ -1)) {
                              var9 = var40.substring(0, var12);
                              break L5;
                            } else {
                              var9 = var40;
                              break L5;
                            }
                          }
                          throw new bj(var9);
                        } else {
                          var9 = var36.readLine();
                          var10++;
                          continue L4;
                        }
                      } else {
                        throw new bj("");
                      }
                    } else {
                      throw new bj("");
                    }
                  }
                } else {
                  if (var9.startsWith("HTTP/1.1 407")) {
                    var10 = 0;
                    var9 = var36.readLine();
                    var41 = "proxy-authenticate: ";
                    var9 = var41;
                    var11 = var41;
                    var9 = var11;
                    L6: while (true) {
                      L7: {
                        if (var9 == null) {
                          break L7;
                        } else {
                          if ((var10 ^ -1) <= -51) {
                            break L7;
                          } else {
                            if (var9.toLowerCase().startsWith(var41)) {
                              L8: {
                                var42 = var9.substring(var41.length()).trim();
                                var9 = var42;
                                var12 = var42.indexOf(' ');
                                if (0 != (var12 ^ -1)) {
                                  var9 = var42.substring(0, var12);
                                  break L8;
                                } else {
                                  var9 = var42;
                                  break L8;
                                }
                              }
                              throw new bj(var9);
                            } else {
                              var9 = var36.readLine();
                              var47 = var9;
                              var10++;
                              continue L6;
                            }
                          }
                        }
                      }
                      throw new bj("");
                    }
                  } else {
                    var7.close();
                    var36.close();
                    var14.close();
                    return null;
                  }
                }
              } else {
                return var14;
              }
            } else {
              return var14;
            }
          } else {
            var7.close();
            var36.close();
            var14.close();
            return null;
          }
        }
    }

    final static String a(String param0, lj param1, int param2, int param3, String param4) {
        if (!(param1.b(-7957))) {
            return param0;
        }
        if (param3 <= 13) {
            field_o = -99;
        }
        return param4 + " - " + param1.a(param2, (byte) 12) + "%";
    }

    final java.net.Socket a(byte param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        bj var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        bj var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        Object var14 = null;
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
        java.net.Socket stackIn_25_0 = null;
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
        java.net.Socket stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = TorChallenge.field_F ? 1 : 0;
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
                    if ((((fc) this).field_d ^ -1) != -444) {
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
                        stackOut_7_0 = ((fc) this).field_n;
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
                        if (var5 != 0) {
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
                        stackOut_8_4 = "http";
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
                        stackOut_9_4 = "https";
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
                        new java.net.URI(stackIn_10_4 + "://" + ((fc) this).field_i);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(stackIn_10_1);
                        stackOut_10_0 = ((fc) this).field_n;
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
                        new java.net.URI(stackIn_13_4 + "://" + ((fc) this).field_i);
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
                    var6 = (java.net.URISyntaxException) (Object) caughtException;
                    return ((fc) this).b(1);
                }
                case 16: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    if (param0 > 85) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var14 = null;
                    fc.a((rd) null, 103, true);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var8_array.length <= var9) {
                        statePc = 29;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var12_ref2 = this.a(var11, (byte) -115);
                        if (var12_ref2 != null) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof bj ? 26 : 27);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9++;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof bj ? 26 : 27);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = (java.net.Socket) var12_ref2;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof bj ? 26 : 27);
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0;
                }
                case 26: {
                    var12 = (bj) (Object) caughtException;
                    var7 = var12;
                    var9++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 27: {
                    var12_ref = (IOException) (Object) caughtException;
                    var9++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 29: {
                    if (var7 != null) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    throw var7;
                }
                case 32: {
                    return ((fc) this).b(1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(rd param0, int param1, boolean param2) {
        Object var4 = null;
        if (param2) {
          var4 = null;
          fc.a((rd) null, 123, false);
          bb.field_d.a((da) (Object) param0, -70);
          mg.a(-127, param0, param1);
          return;
        } else {
          bb.field_d.a((da) (Object) param0, -70);
          mg.a(-127, param0, param1);
          return;
        }
    }

    fc() {
        ((fc) this).field_n = java.net.ProxySelector.getDefault();
    }

    public static void c(int param0) {
        field_q = null;
        field_m = null;
        int var1 = -103 / ((14 - param0) / 49);
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_q = new cf();
    }
}

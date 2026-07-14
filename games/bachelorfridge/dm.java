/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class dm extends rma {
    private java.net.ProxySelector field_h;
    static lu field_g;
    static int field_f;
    static String field_e;

    private final java.net.Socket a(String param0, int param1, String param2, int param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        BufferedReader var16 = null;
        String var25 = null;
        String var36 = null;
        BufferedReader var37 = null;
        String var38 = null;
        String var39 = null;
        var12 = BachelorFridge.field_y;
        var13 = new java.net.Socket(param0, param3);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param2 == null) {
          L0: {
            var6.write(("CONNECT " + ((dm) this).field_a + ":" + ((dm) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var6.flush();
            var37 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var37;
            var38 = var37.readLine();
            var8 = var38;
            if (param1 == 23772) {
              break L0;
            } else {
              dm.b((byte) -111);
              break L0;
            }
          }
          L1: {
            if (var38 == null) {
              break L1;
            } else {
              L2: {
                if (var38.startsWith("HTTP/1.0 200")) {
                  break L2;
                } else {
                  if (var38.startsWith("HTTP/1.1 200")) {
                    break L2;
                  } else {
                    L3: {
                      if (var38.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var8 = var37.readLine();
                        var10 = "proxy-authenticate: ";
                        break L3;
                      } else {
                        if (!var38.startsWith("HTTP/1.1 407")) {
                          break L1;
                        } else {
                          var9 = 0;
                          var8 = var37.readLine();
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          break L3;
                        }
                      }
                    }
                    L4: while (true) {
                      L5: {
                        if (var8 == null) {
                          break L5;
                        } else {
                          if (50 <= var9) {
                            break L5;
                          } else {
                            if (!var8.toLowerCase().startsWith(var10)) {
                              var9++;
                              var8 = var37.readLine();
                              continue L4;
                            } else {
                              L6: {
                                var39 = var8.substring(var10.length()).trim();
                                var8 = var39;
                                var11 = var39.indexOf(' ');
                                if (-1 != var11) {
                                  var8 = var39.substring(0, var11);
                                  break L6;
                                } else {
                                  var8 = var39;
                                  break L6;
                                }
                              }
                              throw new en(var8);
                            }
                          }
                        }
                      }
                      throw new en("");
                    }
                  }
                }
              }
              return var13;
            }
          }
          var6.close();
          var37.close();
          var13.close();
          return null;
        } else {
          L7: {
            var6.write(("CONNECT " + ((dm) this).field_a + ":" + ((dm) this).field_b + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var6.flush();
            var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var16;
            var25 = var16.readLine();
            var8 = var25;
            if (param1 == 23772) {
              break L7;
            } else {
              dm.b((byte) -111);
              break L7;
            }
          }
          if (var25 != null) {
            if (!var25.startsWith("HTTP/1.0 200")) {
              if (var25.startsWith("HTTP/1.1 200")) {
                return var13;
              } else {
                L8: {
                  if (var25.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var8 = var16.readLine();
                    var10 = "proxy-authenticate: ";
                    break L8;
                  } else {
                    if (var25.startsWith("HTTP/1.1 407")) {
                      var9 = 0;
                      var8 = var16.readLine();
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      break L8;
                    } else {
                      var6.close();
                      var16.close();
                      var13.close();
                      return null;
                    }
                  }
                }
                L9: while (true) {
                  if (var8 != null) {
                    if (50 <= var9) {
                      throw new en("");
                    } else {
                      if (!var8.toLowerCase().startsWith(var10)) {
                        var9++;
                        var8 = var16.readLine();
                        continue L9;
                      } else {
                        L10: {
                          var36 = var8.substring(var10.length()).trim();
                          var8 = var36;
                          var11 = var36.indexOf(' ');
                          if (-1 != var11) {
                            var8 = var36.substring(0, var11);
                            break L10;
                          } else {
                            var8 = var36;
                            break L10;
                          }
                        }
                        throw new en(var8);
                      }
                    }
                  } else {
                    throw new en("");
                  }
                }
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
        }
    }

    dm() {
        ((dm) this).field_h = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket a(byte param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        en var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        en var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
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
        java.net.Socket stackIn_24_0 = null;
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
        java.net.Socket stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = BachelorFridge.field_y;
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
                    if ((((dm) this).field_b ^ -1) != -444) {
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
                        stackOut_7_0 = ((dm) this).field_h;
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
                        new java.net.URI((String) (Object) (stackIn_10_4 + "://" + ((dm) this).field_a));
                        var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select((java.net.URI) (Object) stackIn_10_1);
                        stackOut_10_0 = ((dm) this).field_h;
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
                        new java.net.URI((String) (Object) (stackIn_13_4 + "://" + ((dm) this).field_a));
                        var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select((java.net.URI) (Object) stackIn_13_1);
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
                    return ((dm) this).a(3332);
                }
                case 16: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    if (param0 == -70) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    dm.b((byte) 99);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
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
                        var12_ref2 = this.a((byte) -20, var11);
                        if (var12_ref2 != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof en ? 25 : 26);
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
                        statePc = (stateCaught_22 instanceof en ? 25 : 26);
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
                        statePc = (stateCaught_23 instanceof en ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 24: {
                    return (java.net.Socket) (Object) stackIn_24_0;
                }
                case 25: {
                    var12 = (en) (Object) caughtException;
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
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    throw var7;
                }
                case 31: {
                    return ((dm) this).a(3332);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
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
                    if (param1.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return ((dm) this).a(3332);
                }
                case 2: {
                    var3 = param1.address();
                    var4 = 35 / ((42 - param0) / 54);
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
                    var5_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param1.type() != java.net.Proxy.Type.HTTP) {
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
                    return this.a(var5_ref.getHostName(), 23772, (String) (Object) var6, var5_ref.getPort());
                }
                case 14: {
                    if (param1.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var6 = new java.net.Socket(param1);
                    var6.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((dm) this).field_a, ((dm) this).field_b));
                    return var6;
                }
                case 17: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 != -100) {
            return;
        }
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new lu(256);
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}

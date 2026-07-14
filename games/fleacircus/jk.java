/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class jk extends hm {
    static byte[][] field_n;
    static int field_l;
    static int field_r;
    private java.net.ProxySelector field_k;
    static vc field_m;
    static String field_o;
    static String field_p;
    static String field_q;
    static String field_i;
    static String field_j;

    final java.net.Socket a(boolean param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        em var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        em var12 = null;
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
        java.net.Socket stackIn_24_0 = null;
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
        java.net.Socket stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = fleas.field_A ? 1 : 0;
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
                    if (-444 != (((jk) this).field_e ^ -1)) {
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
                        stackOut_6_0 = ((jk) this).field_k;
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
                        new java.net.URI(stackIn_9_4 + "://" + ((jk) this).field_a);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(stackIn_9_1);
                        stackOut_9_0 = ((jk) this).field_k;
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
                        new java.net.URI(stackIn_12_4 + "://" + ((jk) this).field_a);
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
                    return ((jk) this).a(200);
                }
                case 15: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    if (param0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    field_o = null;
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
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
                        var12_ref2 = this.a(var11, (byte) -38);
                        if (var12_ref2 != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof em ? 25 : 26);
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
                        statePc = (stateCaught_22 instanceof em ? 25 : 26);
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
                        statePc = (stateCaught_23 instanceof em ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var12 = (em) (Object) caughtException;
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
                    return ((jk) this).a(200);
                }
                case 30: {
                    throw var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(String param0, int param1, String param2, byte param3) throws IOException {
        int var6 = 0;
        OutputStream var7 = null;
        BufferedReader var8 = null;
        String var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        java.net.Socket var14 = null;
        String var15 = null;
        String var16 = null;
        var13 = fleas.field_A ? 1 : 0;
        var14 = new java.net.Socket(param2, param1);
        var6 = -29 % ((param3 - 14) / 46);
        var14.setSoTimeout(10000);
        var7 = var14.getOutputStream();
        if (param0 == null) {
          var7.write(("CONNECT " + ((jk) this).field_a + ":" + ((jk) this).field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var7.flush();
          var8 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
          var15 = var8.readLine();
          var9 = var15;
          if (var15 != null) {
            L0: {
              if (var15.startsWith("HTTP/1.0 200")) {
                break L0;
              } else {
                if (var15.startsWith("HTTP/1.1 200")) {
                  break L0;
                } else {
                  if (var15.startsWith("HTTP/1.0 407")) {
                    var10 = 0;
                    var11 = "proxy-authenticate: ";
                    var9 = var11;
                    var9 = var8.readLine();
                    L1: while (true) {
                      L2: {
                        if (var9 == null) {
                          break L2;
                        } else {
                          if (var10 >= 50) {
                            break L2;
                          } else {
                            if (!var9.toLowerCase().startsWith(var11)) {
                              var9 = var8.readLine();
                              var10++;
                              continue L1;
                            } else {
                              L3: {
                                var16 = var9.substring(var11.length()).trim();
                                var9 = var16;
                                var12 = var16.indexOf(' ');
                                if (0 != (var12 ^ -1)) {
                                  var9 = var16.substring(0, var12);
                                  break L3;
                                } else {
                                  var9 = var16;
                                  break L3;
                                }
                              }
                              throw new em(var9);
                            }
                          }
                        }
                      }
                      throw new em("");
                    }
                  } else {
                    if (var15.startsWith("HTTP/1.1 407")) {
                      var10 = 0;
                      var11 = "proxy-authenticate: ";
                      var9 = var11;
                      var9 = var8.readLine();
                      L4: while (true) {
                        L5: {
                          if (var9 == null) {
                            break L5;
                          } else {
                            if (var10 >= 50) {
                              break L5;
                            } else {
                              if (!var9.toLowerCase().startsWith(var11)) {
                                var9 = var8.readLine();
                                var10++;
                                continue L4;
                              } else {
                                L6: {
                                  var16 = var9.substring(var11.length()).trim();
                                  var9 = var16;
                                  var12 = var16.indexOf(' ');
                                  if (0 != (var12 ^ -1)) {
                                    var9 = var16.substring(0, var12);
                                    break L6;
                                  } else {
                                    var9 = var16;
                                    break L6;
                                  }
                                }
                                throw new em(var9);
                              }
                            }
                          }
                        }
                        throw new em("");
                      }
                    } else {
                      var7.close();
                      var8.close();
                      var14.close();
                      return null;
                    }
                  }
                }
              }
            }
            return var14;
          } else {
            var7.close();
            var8.close();
            var14.close();
            return null;
          }
        } else {
          L7: {
            var7.write(("CONNECT " + ((jk) this).field_a + ":" + ((jk) this).field_e + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var7.flush();
            var8 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
            var15 = var8.readLine();
            var9 = var15;
            if (var15 != null) {
              if (!var15.startsWith("HTTP/1.0 200")) {
                if (!var15.startsWith("HTTP/1.1 200")) {
                  if (var15.startsWith("HTTP/1.0 407")) {
                    var10 = 0;
                    var11 = "proxy-authenticate: ";
                    var9 = var11;
                    var9 = var8.readLine();
                    L8: while (true) {
                      if (var9 != null) {
                        if (var10 < 50) {
                          if (!var9.toLowerCase().startsWith(var11)) {
                            var9 = var8.readLine();
                            var10++;
                            continue L8;
                          } else {
                            L9: {
                              var16 = var9.substring(var11.length()).trim();
                              var9 = var16;
                              var12 = var16.indexOf(' ');
                              if (0 != (var12 ^ -1)) {
                                var9 = var16.substring(0, var12);
                                break L9;
                              } else {
                                var9 = var16;
                                break L9;
                              }
                            }
                            throw new em(var9);
                          }
                        } else {
                          throw new em("");
                        }
                      } else {
                        throw new em("");
                      }
                    }
                  } else {
                    if (var15.startsWith("HTTP/1.1 407")) {
                      var10 = 0;
                      var11 = "proxy-authenticate: ";
                      var9 = var11;
                      var9 = var8.readLine();
                      L10: while (true) {
                        L11: {
                          if (var9 == null) {
                            break L11;
                          } else {
                            if (var10 >= 50) {
                              break L11;
                            } else {
                              if (!var9.toLowerCase().startsWith(var11)) {
                                var9 = var8.readLine();
                                var10++;
                                continue L10;
                              } else {
                                L12: {
                                  var16 = var9.substring(var11.length()).trim();
                                  var9 = var16;
                                  var12 = var16.indexOf(' ');
                                  if (0 != (var12 ^ -1)) {
                                    var9 = var16.substring(0, var12);
                                    break L12;
                                  } else {
                                    var9 = var16;
                                    break L12;
                                  }
                                }
                                throw new em(var9);
                              }
                            }
                          }
                        }
                        throw new em("");
                      }
                    } else {
                      break L7;
                    }
                  }
                } else {
                  return var14;
                }
              } else {
                return var14;
              }
            } else {
              break L7;
            }
          }
          var7.close();
          var8.close();
          var14.close();
          return null;
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
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
                    if (param0.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return ((jk) this).a(param1 + 238);
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
                    if (param1 == -38) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    jk.c(-87);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param0.type() == java.net.Proxy.Type.HTTP) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param0.type() != java.net.Proxy.Type.SOCKS) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5 = new java.net.Socket(param0);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((jk) this).field_a, ((jk) this).field_e));
                    return var5;
                }
                case 9: {
                    return null;
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
                            statePc = 17;
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
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (!((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
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
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
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
                    return this.a((String) (Object) var5, var4_ref.getPort(), var4_ref.getHostName(), (byte) 101);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    jk() {
        ((jk) this).field_k = java.net.ProxySelector.getDefault();
    }

    public static void c(int param0) {
        field_q = null;
        field_i = null;
        field_m = null;
        int var1 = -62 / ((param0 - 77) / 37);
        field_j = null;
        field_n = null;
        field_o = null;
        field_p = null;
    }

    final static ob a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var2 = param0.length();
        if (var2 != -1) {
          if (-65 < var2) {
            return hg.field_i;
          } else {
            if (param0.charAt(0) != 34) {
              L0: {
                var3 = 0;
                var4 = 0;
                if (param1 < 112) {
                  break L0;
                } else {
                  if (var2 > var4) {
                    L1: {
                      var5 = param0.charAt(var4);
                      if (var5 == 46) {
                        if (var4 != 0) {
                          if (var2 + -1 != var4) {
                            if (var3 != 0) {
                              return je.field_M;
                            } else {
                              var3 = 1;
                              var4++;
                              break L1;
                            }
                          } else {
                            return je.field_M;
                          }
                        } else {
                          return je.field_M;
                        }
                      } else {
                        if (0 == (tb.field_a.indexOf(var5) ^ -1)) {
                          return je.field_M;
                        } else {
                          var3 = 0;
                          break L1;
                        }
                      }
                    }
                    var4++;
                    var4++;
                    var4++;
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
              jk.c(-110);
              if (var2 > var4) {
                L2: {
                  var5 = param0.charAt(var4);
                  if (var5 == 46) {
                    L3: {
                      if (var4 == 0) {
                        break L3;
                      } else {
                        if (var2 + -1 == var4) {
                          break L3;
                        } else {
                          if (var3 != 0) {
                            break L3;
                          } else {
                            var3 = 1;
                            var4++;
                            break L2;
                          }
                        }
                      }
                    }
                    return je.field_M;
                  } else {
                    if (0 == (tb.field_a.indexOf(var5) ^ -1)) {
                      return je.field_M;
                    } else {
                      var3 = 0;
                      break L2;
                    }
                  }
                }
                var4++;
                var4++;
                L4: while (true) {
                  if (var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 == 46) {
                      L5: {
                        if (var4 == 0) {
                          break L5;
                        } else {
                          if (var2 + -1 == var4) {
                            break L5;
                          } else {
                            if (var3 != 0) {
                              break L5;
                            } else {
                              var3 = 1;
                              var4++;
                              continue L4;
                            }
                          }
                        }
                      }
                      return je.field_M;
                    } else {
                      if (0 == (tb.field_a.indexOf(var5) ^ -1)) {
                        return je.field_M;
                      } else {
                        var3 = 0;
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              if (34 != param0.charAt(-1 + var2)) {
                return je.field_M;
              } else {
                var3 = 0;
                var4 = 1;
                L6: while (true) {
                  if (var2 - 1 > var4) {
                    var5 = param0.charAt(var4);
                    if (92 == var5) {
                      L7: {
                        if (var3 != 0) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L7;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L7;
                        }
                      }
                      var3 = stackIn_17_0;
                      var4++;
                      continue L6;
                    } else {
                      L8: {
                        if (var5 != 34) {
                          break L8;
                        } else {
                          if (var3 != 0) {
                            break L8;
                          } else {
                            return je.field_M;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L6;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } else {
          return tf.field_H;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new byte[50][];
        field_l = 1;
        field_o = "<%0>Entrance:<%1> Fleas enter the level from the bottom of this.";
        field_r = 0;
        field_m = new vc();
        field_i = "Not yet achieved";
        field_p = "Visit the Account Management section on the main site to view.";
        field_q = "<%0>Water:<%1> Fleas drown in water. Keep the fleas away!";
    }
}

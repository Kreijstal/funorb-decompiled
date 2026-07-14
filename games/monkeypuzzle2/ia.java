/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class ia extends al {
    static long field_f;
    private java.net.ProxySelector field_e;
    static int[] field_g;
    static char[] field_d;
    static String field_c;

    final java.net.Socket a(int param0) throws IOException {
        java.net.URISyntaxException uRISyntaxException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        Object[] var6 = null;
        pg var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        pg var12_ref = null;
        IOException var12_ref2 = null;
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
                    var13 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    String discarded$4 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (-444 != (((ia) this).field_a ^ -1)) {
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
                        stackOut_6_0 = ((ia) this).field_e;
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
                        new java.net.URI(stackIn_9_4 + "://" + ((ia) this).field_b);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(stackIn_9_1);
                        stackOut_9_0 = ((ia) this).field_e;
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
                        new java.net.URI(stackIn_12_4 + "://" + ((ia) this).field_b);
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
                    uRISyntaxException = (java.net.URISyntaxException) (Object) caughtException;
                    return ((ia) this).b((byte) 122);
                }
                case 15: {
                    boolean discarded$5 = var3.addAll((Collection) (Object) var4);
                    var6 = var3.toArray();
                    var7 = null;
                    var8 = var6;
                    var9 = param0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var8.length <= var9) {
                        statePc = 25;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10 = var8[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        var12 = this.a((byte) 126, var11);
                        if (var12 != null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof pg ? 22 : 23);
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
                        statePc = (stateCaught_19 instanceof pg ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (java.net.Socket) var12;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof pg ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var12_ref = (pg) (Object) caughtException;
                    var7 = var12_ref;
                    var9++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 23: {
                    var12_ref2 = (IOException) (Object) caughtException;
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
                    return ((ia) this).b((byte) 121);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static float a(boolean param0, float param1) {
        if (!param0) {
          field_d = null;
          return vh.field_C[65535 & (int)((double)(32768.0f * param1) / 3.141592653589793)];
        } else {
          return vh.field_C[65535 & (int)((double)(32768.0f * param1) / 3.141592653589793)];
        }
    }

    ia() {
        ((ia) this).field_e = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        BufferedReader var16 = null;
        String var17 = null;
        String var29 = null;
        String var36 = null;
        BufferedReader var37 = null;
        String var38 = null;
        String var41 = null;
        String var42 = null;
        String var43 = null;
        String var44 = null;
        String var48 = null;
        String var49 = null;
        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
        var13 = new java.net.Socket(param1, param2);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param0 != null) {
          L0: {
            var6.write(("CONNECT " + ((ia) this).field_b + ":" + ((ia) this).field_a + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var6.flush();
            var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var16;
            var17 = var16.readLine();
            var8 = var17;
            if (var17 != null) {
              if (!var17.startsWith("HTTP/1.0 200")) {
                if (!var17.startsWith("HTTP/1.1 200")) {
                  L1: {
                    if (var17.startsWith("HTTP/1.0 407")) {
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var16.readLine();
                      break L1;
                    } else {
                      if (var17.startsWith("HTTP/1.1 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var29 = var10;
                        var8 = var29;
                        var8 = var16.readLine();
                        var29 = var8;
                        var8 = var29;
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                  L2: while (true) {
                    if (var8 != null) {
                      if (var9 < 50) {
                        if (var8.toLowerCase().startsWith(var10)) {
                          L3: {
                            var36 = var8.substring(var10.length()).trim();
                            var8 = var36;
                            var11 = var36.indexOf(' ');
                            if (0 != (var11 ^ -1)) {
                              var8 = var36.substring(0, var11);
                              break L3;
                            } else {
                              var8 = var36;
                              break L3;
                            }
                          }
                          throw new pg(var8);
                        } else {
                          var8 = var16.readLine();
                          var48 = var8;
                          var9++;
                          continue L2;
                        }
                      } else {
                        throw new pg("");
                      }
                    } else {
                      throw new pg("");
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
          var6.close();
          if (param3 <= 29) {
            return null;
          } else {
            var16.close();
            var13.close();
            return null;
          }
        } else {
          var6.write(("CONNECT " + ((ia) this).field_b + ":" + ((ia) this).field_a + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          var37 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var7 = var37;
          var38 = var37.readLine();
          var48 = var38;
          if (var38 != null) {
            if (!var38.startsWith("HTTP/1.0 200")) {
              if (!var38.startsWith("HTTP/1.1 200")) {
                if (var38.startsWith("HTTP/1.0 407")) {
                  var9 = 0;
                  var41 = "proxy-authenticate: ";
                  var8 = var41;
                  var8 = var37.readLine();
                  L4: while (true) {
                    L5: {
                      if (var8 == null) {
                        break L5;
                      } else {
                        if (var9 >= 50) {
                          break L5;
                        } else {
                          if (var8.toLowerCase().startsWith(var41)) {
                            L6: {
                              var42 = var8.substring(var41.length()).trim();
                              var8 = var42;
                              var11 = var42.indexOf(' ');
                              if (0 != (var11 ^ -1)) {
                                var8 = var42.substring(0, var11);
                                break L6;
                              } else {
                                var8 = var42;
                                break L6;
                              }
                            }
                            throw new pg(var8);
                          } else {
                            var8 = var37.readLine();
                            var9++;
                            continue L4;
                          }
                        }
                      }
                    }
                    throw new pg("");
                  }
                } else {
                  if (var38.startsWith("HTTP/1.1 407")) {
                    var9 = 0;
                    var43 = "proxy-authenticate: ";
                    var8 = var43;
                    var10 = var43;
                    var8 = var10;
                    var8 = var37.readLine();
                    L7: while (true) {
                      L8: {
                        if (var8 == null) {
                          break L8;
                        } else {
                          if (var9 >= 50) {
                            break L8;
                          } else {
                            if (var8.toLowerCase().startsWith(var43)) {
                              L9: {
                                var44 = var8.substring(var43.length()).trim();
                                var8 = var44;
                                var11 = var44.indexOf(' ');
                                if (0 != (var11 ^ -1)) {
                                  var8 = var44.substring(0, var11);
                                  break L9;
                                } else {
                                  var8 = var44;
                                  break L9;
                                }
                              }
                              throw new pg(var8);
                            } else {
                              var8 = var37.readLine();
                              var49 = var8;
                              var9++;
                              continue L7;
                            }
                          }
                        }
                      }
                      throw new pg("");
                    }
                  } else {
                    var6.close();
                    if (param3 > 29) {
                      var37.close();
                      var13.close();
                      return null;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                return var13;
              }
            } else {
              return var13;
            }
          } else {
            var6.close();
            if (param3 <= 29) {
              return null;
            } else {
              var37.close();
              var13.close();
              return null;
            }
          }
        }
    }

    public static void d(byte param0) {
        field_d = null;
        field_g = null;
        int var1 = -83 / ((param0 - -86) / 33);
        field_c = null;
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
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
                    if (param1.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return ((ia) this).b((byte) 122);
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
                    var5 = -21 / ((param0 - 60) / 62);
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param1.type() == java.net.Proxy.Type.HTTP) {
                        statePc = 9;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param1.type() != java.net.Proxy.Type.SOCKS) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = new java.net.Socket(param1);
                    var6.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((ia) this).field_b, ((ia) this).field_a));
                    return var6;
                }
                case 7: {
                    return null;
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
                        if (var9 == null) {
                            statePc = 16;
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
                        var10 = var7_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var10.setAccessible(true);
                        if (((Boolean) var10.invoke(var9, new Object[0])).booleanValue()) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
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
                    return this.a((String) (Object) var6, var4_ref.getHostName(), var4_ref.getPort(), 56);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static h a(int param0, String param1) {
        int var2 = -7 % ((-25 - param0) / 35);
        return new h(param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_g = new int[128];
        field_d = new char[128];
    }
}

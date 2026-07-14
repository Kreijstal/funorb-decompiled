/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class r extends db {
    static String[] field_j;
    static String field_q;
    static ki field_r;
    static String field_m;
    static String field_i;
    private java.net.ProxySelector field_n;
    static String field_p;
    static String field_o;
    static String field_k;
    static long field_l;

    final static void a(int param0, ud param1, int param2) {
        kj var3 = null;
        if (param0 != 27153) {
          r.a(true, false);
          var3 = mm.field_g;
          var3.a(param2, (byte) -117);
          var3.a((byte) 126, param1.field_t);
          var3.a((byte) 111, param1.field_u);
          return;
        } else {
          var3 = mm.field_g;
          var3.a(param2, (byte) -117);
          var3.a((byte) 126, param1.field_t);
          var3.a((byte) 111, param1.field_u);
          return;
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        int var7 = 0;
        vg var8 = null;
        Object[] var9 = null;
        Object[] var9_array = null;
        int var10 = 0;
        Object var11 = null;
        java.net.Proxy var12 = null;
        vg var13 = null;
        IOException var13_ref = null;
        java.net.Socket var13_ref2 = null;
        int var14 = 0;
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
        java.net.Socket stackIn_22_0 = null;
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
        java.net.Socket stackOut_21_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = SteelSentinels.field_G;
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
                    if ((((r) this).field_c ^ -1) != -444) {
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
                        stackOut_7_0 = ((r) this).field_n;
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
                        new java.net.URI(stackIn_10_4 + "://" + ((r) this).field_e);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(stackIn_10_1);
                        stackOut_10_0 = ((r) this).field_n;
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
                        if (var5 != 0) {
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
                        stackOut_11_4 = "https";
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
                        stackOut_12_4 = "http";
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
                        new java.net.URI(stackIn_13_4 + "://" + ((r) this).field_e);
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
                    return ((r) this).a((byte) 82);
                }
                case 16: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var7 = -4 % ((-25 - param0) / 46);
                    var6_array = var3.toArray();
                    var8 = null;
                    var9_array = var6_array;
                    var10 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var9_array.length <= var10) {
                        statePc = 26;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var11 = var9_array[var10];
                    var12 = (java.net.Proxy) var11;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var13_ref2 = this.a(25382, var12);
                        if (var13_ref2 != null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof vg ? 23 : 24);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof vg ? 23 : 24);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (java.net.Socket) var13_ref2;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof vg ? 23 : 24);
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0;
                }
                case 23: {
                    var13 = (vg) (Object) caughtException;
                    var8 = var13;
                    var10++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 24: {
                    var13_ref = (IOException) (Object) caughtException;
                    var10++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 26: {
                    if (var8 != null) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    throw var8;
                }
                case 29: {
                    return ((r) this).a((byte) 59);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        field_q = null;
        field_o = null;
        field_k = null;
        field_m = null;
        field_p = null;
        field_j = null;
        if (param0 != -117) {
          field_q = null;
          field_i = null;
          field_r = null;
          return;
        } else {
          field_i = null;
          field_r = null;
          return;
        }
    }

    final static void a(int param0, byte param1, cf param2) {
        jb.field_A.a(3, (ck) (Object) param2);
        if (param1 != 123) {
          r.b((byte) 48);
          ml.a(1, param2, param0);
          return;
        } else {
          ml.a(1, param2, param0);
          return;
        }
    }

    final static void a(int param0, byte param1) {
        int discarded$4 = gh.i(107);
        if (param1 != 104) {
            field_r = null;
        }
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (param0 == 46) {
          if ((lb.field_ac ^ -1) > -225) {
            var1 = lb.field_ac % 32;
            bb.a(-var1 + lb.field_ac + 32, (byte) 64);
            return;
          } else {
            bb.a(256, (byte) 64);
            return;
          }
        } else {
          return;
        }
    }

    private final java.net.Socket a(int param0, String param1, String param2, int param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        BufferedReader var15 = null;
        String var36 = null;
        BufferedReader var37 = null;
        String var38 = null;
        String var50 = null;
        var12 = SteelSentinels.field_G;
        var13 = new java.net.Socket(param2, param0);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param1 != null) {
          var6.write(("CONNECT " + ((r) this).field_e + ":" + ((r) this).field_c + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          if (param3 <= -40) {
            L0: {
              var6.flush();
              var37 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var7 = var37;
              var8 = var37.readLine();
              if (var8 == null) {
                break L0;
              } else {
                L1: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L1;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L2: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          var9 = 0;
                          var8 = var37.readLine();
                          var10 = "proxy-authenticate: ";
                          break L2;
                        } else {
                          if (!var8.startsWith("HTTP/1.1 407")) {
                            break L0;
                          } else {
                            var9 = 0;
                            var8 = var37.readLine();
                            var10 = "proxy-authenticate: ";
                            var8 = var10;
                            var8 = var10;
                            break L2;
                          }
                        }
                      }
                      L3: while (true) {
                        L4: {
                          if (var8 == null) {
                            break L4;
                          } else {
                            if (50 <= var9) {
                              break L4;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L5: {
                                  var38 = var8.substring(var10.length()).trim();
                                  var8 = var38;
                                  var8 = var38;
                                  var11 = var38.indexOf(' ');
                                  if ((var11 ^ -1) == 0) {
                                    break L5;
                                  } else {
                                    var8 = var38.substring(0, var11);
                                    break L5;
                                  }
                                }
                                throw new vg(var8);
                              } else {
                                var9++;
                                var8 = var37.readLine();
                                var50 = var8;
                                var8 = var50;
                                var50 = var8;
                                continue L3;
                              }
                            }
                          }
                        }
                        throw new vg("");
                      }
                    } else {
                      break L1;
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
            return null;
          }
        } else {
          var6.write(("CONNECT " + ((r) this).field_e + ":" + ((r) this).field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          if (param3 <= -40) {
            var6.flush();
            var15 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var15;
            var8 = var15.readLine();
            if (var8 != null) {
              if (!var8.startsWith("HTTP/1.0 200")) {
                if (!var8.startsWith("HTTP/1.1 200")) {
                  L6: {
                    if (var8.startsWith("HTTP/1.0 407")) {
                      var9 = 0;
                      var8 = var15.readLine();
                      var10 = "proxy-authenticate: ";
                      break L6;
                    } else {
                      if (var8.startsWith("HTTP/1.1 407")) {
                        var9 = 0;
                        var8 = var15.readLine();
                        var10 = "proxy-authenticate: ";
                        var8 = var10;
                        var8 = var10;
                        break L6;
                      } else {
                        var6.close();
                        var15.close();
                        var13.close();
                        return null;
                      }
                    }
                  }
                  L7: while (true) {
                    if (var8 != null) {
                      if (50 <= var9) {
                        throw new vg("");
                      } else {
                        if (var8.toLowerCase().startsWith(var10)) {
                          L8: {
                            var36 = var8.substring(var10.length()).trim();
                            var8 = var36;
                            var8 = var36;
                            var11 = var36.indexOf(' ');
                            if ((var11 ^ -1) == 0) {
                              break L8;
                            } else {
                              var8 = var36.substring(0, var11);
                              break L8;
                            }
                          }
                          throw new vg(var8);
                        } else {
                          var9++;
                          var8 = var15.readLine();
                          continue L7;
                        }
                      }
                    } else {
                      throw new vg("");
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
              var15.close();
              var13.close();
              return null;
            }
          } else {
            return null;
          }
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
                    return ((r) this).a((byte) -112);
                }
                case 3: {
                    if (param0 == 25382) {
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
                    var3 = param1.address();
                    if (var3 instanceof java.net.InetSocketAddress) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return null;
                }
                case 7: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param1.type() == java.net.Proxy.Type.HTTP) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param1.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 10;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = new java.net.Socket(param1);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((r) this).field_e, ((r) this).field_c));
                    return var5;
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
                        if (var8 != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return this.a(var4_ref.getPort(), (String) (Object) var5, var4_ref.getHostName(), param0 ^ -25436);
                }
                case 20: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    r() {
        ((r) this).field_n = java.net.ProxySelector.getDefault();
    }

    final static void a(boolean param0, boolean param1) {
        if (!(!jc.a(2))) {
            param1 = false;
        }
        ah.a(param1, -127);
        if (param0) {
            return;
        }
        li.e(0);
    }

    final static int a(gi param0, String param1, int param2) {
        int var3 = param0.field_p;
        CharSequence var5 = (CharSequence) (Object) param1;
        byte[] var4 = km.a(-38, var5);
        param0.a(var4.length, 32768);
        param0.field_p = param0.field_p + ob.field_r.a(param0.field_p, param0.field_t, param2 ^ 115, var4, param2, var4.length);
        return -var3 + param0.field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "All games";
        field_i = "EMP";
        field_m = "Create your own free Jagex account";
        field_p = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_o = "Try again";
        field_k = "Private";
    }
}

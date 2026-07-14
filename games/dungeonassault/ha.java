/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ha extends um {
    static String[] field_n;
    static String[] field_j;
    private java.net.ProxySelector field_m;
    static String field_o;
    static lc field_k;
    static String[] field_l;

    final static void d(int param0) {
        vf.field_w = 620;
        qc.field_w = 240;
        kn.field_g = true;
        id.field_l = null;
        gk.field_L = null;
        wi.field_kb = 0;
        jn.field_l = null;
        hc.field_b = 0;
        h.field_f = null;
        ui.field_a = 0;
        ce.field_p = -1;
        bl.field_l = null;
        pp.field_K = new md();
        ti.field_A = sj.a(dh.field_a, 37);
        ti.field_A.field_v = 1;
        tk.field_k = sj.a(fl.field_i, 107);
        ec.field_n = sj.a(wm.field_h, 59);
        ec.field_n.field_v = param0;
        pp.field_K.a((ne) (Object) ti.field_A, false);
        pp.field_K.a((ne) (Object) tk.field_k, false);
        pp.field_K.a((ne) (Object) ec.field_n, false);
        o.field_n.a(1);
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
        BufferedReader var16 = null;
        String var24 = null;
        String var34 = null;
        BufferedReader var35 = null;
        String var36 = null;
        String var37 = null;
        var12 = DungeonAssault.field_K;
        var13 = new java.net.Socket(param2, param0);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param3 == null) {
          var6.write(("CONNECT " + ((ha) this).field_a + ":" + ((ha) this).field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          var35 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var7 = var35;
          var36 = var35.readLine();
          var10 = var36;
          var10 = var36;
          if (var36 != null) {
            L0: {
              if (var36.startsWith("HTTP/1.0 200")) {
                break L0;
              } else {
                if (var36.startsWith("HTTP/1.1 200")) {
                  break L0;
                } else {
                  L1: {
                    if (var36.startsWith("HTTP/1.0 407")) {
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var35.readLine();
                      break L1;
                    } else {
                      if (var36.startsWith("HTTP/1.1 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var10;
                        var8 = var35.readLine();
                        break L1;
                      } else {
                        L2: {
                          var6.close();
                          var35.close();
                          if (param1 >= 6) {
                            break L2;
                          } else {
                            ha.d(66);
                            break L2;
                          }
                        }
                        var13.close();
                        return null;
                      }
                    }
                  }
                  L3: while (true) {
                    if (var8 != null) {
                      if (50 > var9) {
                        if (var8.toLowerCase().startsWith(var10)) {
                          L4: {
                            var37 = var8.substring(var10.length()).trim();
                            var8 = var37;
                            var11 = var37.indexOf(' ');
                            if ((var11 ^ -1) != 0) {
                              var8 = var37.substring(0, var11);
                              break L4;
                            } else {
                              var8 = var37;
                              break L4;
                            }
                          }
                          throw new wl(var8);
                        } else {
                          var9++;
                          var8 = var35.readLine();
                          continue L3;
                        }
                      } else {
                        throw new wl("");
                      }
                    } else {
                      throw new wl("");
                    }
                  }
                }
              }
            }
            return var13;
          } else {
            L5: {
              var6.close();
              var35.close();
              if (param1 >= 6) {
                break L5;
              } else {
                ha.d(66);
                break L5;
              }
            }
            var13.close();
            return null;
          }
        } else {
          var6.write(("CONNECT " + ((ha) this).field_a + ":" + ((ha) this).field_f + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var7 = var16;
          var24 = var16.readLine();
          var10 = var24;
          var10 = var24;
          if (var24 != null) {
            if (!var24.startsWith("HTTP/1.0 200")) {
              if (var24.startsWith("HTTP/1.1 200")) {
                return var13;
              } else {
                L6: {
                  if (var24.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var10 = "proxy-authenticate: ";
                    var8 = var16.readLine();
                    break L6;
                  } else {
                    if (var24.startsWith("HTTP/1.1 407")) {
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var16.readLine();
                      break L6;
                    } else {
                      L7: {
                        var6.close();
                        var16.close();
                        if (param1 >= 6) {
                          break L7;
                        } else {
                          ha.d(66);
                          break L7;
                        }
                      }
                      var13.close();
                      return null;
                    }
                  }
                }
                L8: while (true) {
                  if (var8 != null) {
                    if (50 > var9) {
                      if (var8.toLowerCase().startsWith(var10)) {
                        L9: {
                          var34 = var8.substring(var10.length()).trim();
                          var8 = var34;
                          var10 = var34;
                          var8 = var10;
                          var11 = var34.indexOf(' ');
                          if ((var11 ^ -1) != 0) {
                            var8 = var34.substring(0, var11);
                            break L9;
                          } else {
                            var8 = var10;
                            break L9;
                          }
                        }
                        throw new wl(var8);
                      } else {
                        var9++;
                        var8 = var16.readLine();
                        var10 = var8;
                        var10 = var8;
                        continue L8;
                      }
                    } else {
                      throw new wl("");
                    }
                  } else {
                    throw new wl("");
                  }
                }
              }
            } else {
              return var13;
            }
          } else {
            L10: {
              var6.close();
              var16.close();
              if (param1 >= 6) {
                break L10;
              } else {
                ha.d(66);
                break L10;
              }
            }
            var13.close();
            return null;
          }
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        int var2 = 0;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        wl var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        wl var12 = null;
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
                    var13 = DungeonAssault.field_K;
                    var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
                    if (param0 == 13905) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    if (var2 == 0) {
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
                    if (443 != ((ha) this).field_f) {
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
                        stackOut_9_0 = ((ha) this).field_m;
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
                        stackOut_10_4 = "http";
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
                        stackOut_11_4 = "https";
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
                        new java.net.URI(stackIn_12_4 + "://" + ((ha) this).field_a);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(stackIn_12_1);
                        stackOut_12_0 = ((ha) this).field_m;
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
                        new java.net.URI(stackIn_15_4 + "://" + ((ha) this).field_a);
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
                    return ((ha) this).a(-27549);
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
                        var12_ref2 = this.a(var11, param0 + -13285);
                        if (var12_ref2 != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof wl ? 25 : 26);
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
                        statePc = (stateCaught_22 instanceof wl ? 25 : 26);
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
                        statePc = (stateCaught_23 instanceof wl ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var12 = (wl) (Object) caughtException;
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
                    return ((ha) this).a(-27549);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
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
                    if (param0.type() == java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return ((ha) this).a(-27549);
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
                    if (param1 == 620) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    field_o = null;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param0.type() != java.net.Proxy.Type.HTTP) {
                        statePc = 16;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5 = null;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 == null) {
                            statePc = 15;
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
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return this.a(var4_ref.getPort(), (byte) 113, var4_ref.getHostName(), (String) (Object) var5);
                }
                case 16: {
                    if (param0.type() != java.net.Proxy.Type.SOCKS) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = new java.net.Socket(param0);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((ha) this).field_a, ((ha) this).field_f));
                    return var5;
                }
                case 18: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) in.field_C;
                    // monitorenter in.field_C
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (je.field_i == pj.field_x) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var1
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        mm.field_t = jk.field_Db[je.field_i];
                        ob.field_Yb = b.field_a[je.field_i];
                        je.field_i = 127 & je.field_i + 1;
                        if (param0 == 47) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_j = null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        // monitorexit var1
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static double a(byte param0) {
        if (param0 != -21) {
            return -1.090574406064165;
        }
        return ld.field_f.nextDouble();
    }

    public static void c(int param0) {
        field_o = null;
        field_k = null;
        field_j = null;
        int var1 = -122 / ((param0 - 7) / 48);
        field_n = null;
        field_l = null;
    }

    ha() {
        ((ha) this).field_m = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Hoard Room", "You have reached the <%highlight>hoard room</col>! You can now select <%highlight>how much gold you wish to steal</col>. For every ten pieces of gold you steal, you will gain <%highlight>one point of Renown</col> - but the chance of waking the dragon increases as your raiders become more ambitious! If the Dragon wakes, <%highlight>some of your raiders may be killed</col>."};
        field_o = "Connection lost - attempting to reconnect";
        field_n = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_l = new String[]{"Harden Raider", "Double target <%defence> in the next room. (Single use)"};
    }
}

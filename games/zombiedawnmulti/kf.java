/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.URL;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class kf extends dl {
    static java.security.SecureRandom field_j;
    static cj field_i;
    private java.net.ProxySelector field_l;
    static String field_k;

    final static java.net.URL a(String param0, int param1, byte param2, String param3, java.net.URL param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            var9 = ZombieDawnMulti.field_E ? 1 : 0;
            var5 = param4.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                    break L2;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (-1 < (param1 ^ -1)) {
                        break L1;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                    break L3;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                    break L4;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (0 > var7_int) {
                      break L4;
                    } else {
                      if (param3 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  }
                }
                L5: {
                  L6: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L6;
                    } else {
                      if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (var7_int >= 0) {
                    if (param0 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L5;
                  }
                }
                L7: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                  if (-1 > (param1 ^ -1)) {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param1));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param3 == null) {
                    break L8;
                  } else {
                    if (param3.length() > 0) {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param3);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param0 == null) {
                    break L9;
                  } else {
                    if (0 < param0.length()) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param0);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var5.length() > var6) {
                    StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                    break L10;
                  } else {
                    StringBuilder discarded$17 = var7.append(47);
                    break L10;
                  }
                }
                L11: {
                  if (param2 > 107) {
                    break L11;
                  } else {
                    field_k = null;
                    break L11;
                  }
                }
                try {
                  stackOut_41_0 = new java.net.URL(param4, var7.toString());
                  stackIn_42_0 = stackOut_41_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_42_0;
                }
              }
              var6 = var7_int;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          var6 = param3 + 485 + (8 - -param2) + 10;
          qe.field_q.a(-6 + dq.field_k.field_z, 3, var6 - 6, 3, -3344);
          var7 = qe.field_q.field_z - 5;
          ek.field_z.a(param5, var7 - param5, param2 + 487 + param3, 5, param0 ^ -3342);
          ec.field_b.a(param5, 0, -ua.field_E.field_zb + (ek.field_z.field_zb - param2), param2, -3344);
          ua.field_E.a(param5, 0, ua.field_E.field_zb, param2 + ec.field_b.field_zb, param0 + -3346);
          var7 = var7 - (2 + param5);
          tn.field_A.a(param3, 2, param3 + (param0 + param2) + 485, 5, var7 - 5, param0 ^ -31467, 5);
          if (ra.field_f == null) {
            break L0;
          } else {
            ra.field_f.b(tn.field_A.field_x, tn.field_A.field_Q, 28972, tn.field_A.field_zb, tn.field_A.field_z);
            break L0;
          }
        }
        var8 = -var6 + -param2 + dq.field_k.field_zb;
        var9 = var8 / 2;
        var10 = param2 + param1 + var9;
        var11 = 0;
        var12 = 0;
        L1: while (true) {
          if ((var12 ^ -1) <= -7) {
            return;
          } else {
            L2: {
              if (5 <= var12) {
                break L2;
              } else {
                if (la.field_h[var12] != null) {
                  break L2;
                } else {
                  var12++;
                  continue L1;
                }
              }
            }
            var13 = (2 + (-6 + dq.field_k.field_z)) * var11 / (1 + gi.field_l) + 3;
            var11++;
            var7 = var11 * (dq.field_k.field_z + -4) / (1 + gi.field_l) + (1 + -var13);
            if (5 > var12) {
              la.field_h[var12].a(var7, var13, var8, var6, param0 ^ -3342);
              ij.field_k[var12].a(var7, 0, var9 - param2, param2, param0 ^ -3342);
              pf.field_d[var12].a(-param4 + var7 - param4, param4, param1, var9, -3344);
              hh.field_l[var12].a(-param4 + var7 - param4, param4, var8 - (param2 - -var10), var10, -3344);
              var12++;
              continue L1;
            } else {
              nn.field_b.a(var7, var13, var8, var6, -3344);
              var12++;
              continue L1;
            }
          }
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != 3) {
            return;
        }
        field_j = null;
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
                    if (param0.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return ((kf) this).b((byte) 100);
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
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param1 == 1) {
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
                    if (param0.type() == java.net.Proxy.Type.HTTP) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 9;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = new java.net.Socket(param0);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((kf) this).field_b, ((kf) this).field_f));
                    return var5;
                }
                case 10: {
                    var5 = null;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 != null) {
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
                        statePc = 17;
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
                    return this.a((byte) -96, var4_ref.getHostName(), var4_ref.getPort(), (String) (Object) var5);
                }
                case 18: {
                    return null;
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
        String var14 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= -25) {
          L0: {
            var13 = new java.net.Socket(param1, param2);
            var13.setSoTimeout(10000);
            var6 = var13.getOutputStream();
            if (param3 == null) {
              var6.write(("CONNECT " + ((kf) this).field_b + ":" + ((kf) this).field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L0;
            } else {
              var6.write(("CONNECT " + ((kf) this).field_b + ":" + ((kf) this).field_f + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L0;
            }
          }
          L1: {
            var6.flush();
            var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var8 = var7.readLine();
            if (var8 == null) {
              break L1;
            } else {
              L2: {
                if (var8.startsWith("HTTP/1.0 200")) {
                  break L2;
                } else {
                  if (!var8.startsWith("HTTP/1.1 200")) {
                    L3: {
                      if (var8.startsWith("HTTP/1.0 407")) {
                        break L3;
                      } else {
                        if (var8.startsWith("HTTP/1.1 407")) {
                          break L3;
                        } else {
                          break L1;
                        }
                      }
                    }
                    var9 = 0;
                    var10 = "proxy-authenticate: ";
                    var8 = var10;
                    var8 = var7.readLine();
                    L4: while (true) {
                      L5: {
                        if (var8 == null) {
                          break L5;
                        } else {
                          if (50 <= var9) {
                            break L5;
                          } else {
                            if (var8.toLowerCase().startsWith(var10)) {
                              L6: {
                                var14 = var8.substring(var10.length()).trim();
                                var8 = var14;
                                var11 = var14.indexOf(' ');
                                if (0 != (var11 ^ -1)) {
                                  var8 = var14.substring(0, var11);
                                  break L6;
                                } else {
                                  var8 = var14;
                                  break L6;
                                }
                              }
                              throw new en(var8);
                            } else {
                              var8 = var7.readLine();
                              var9++;
                              continue L4;
                            }
                          }
                        }
                      }
                      throw new en("");
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
          var7.close();
          var13.close();
          return null;
        } else {
          return null;
        }
    }

    kf() {
        ((kf) this).field_l = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket b(int param0) throws IOException {
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
        int stackIn_7_0 = 0;
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
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
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
                    var13 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param0 == 4646) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    kf.a(-21, 110, 106, 109, 24, -20);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (-444 != (((kf) this).field_f ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var5 = stackIn_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = ((kf) this).field_l;
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
                        new java.net.URI(stackIn_11_4 + "://" + ((kf) this).field_b);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(stackIn_11_1);
                        stackOut_11_0 = ((kf) this).field_l;
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
                        new java.net.URI(stackIn_14_4 + "://" + ((kf) this).field_b);
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
                    return ((kf) this).b((byte) 97);
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
                    if (var9 >= var8_array.length) {
                        statePc = 26;
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
                        var12_ref2 = this.a(var11, 1);
                        if (var12_ref2 != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof en ? 24 : 25);
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
                        statePc = (stateCaught_21 instanceof en ? 24 : 25);
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
                        statePc = (stateCaught_22 instanceof en ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var12 = (en) (Object) caughtException;
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
                case 26: {
                    if (var7 != null) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    throw var7;
                }
                case 29: {
                    return ((kf) this).b((byte) 89);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}

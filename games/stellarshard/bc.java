/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class bc extends nl {
    static int field_i;
    private java.net.ProxySelector field_k;
    static ac field_j;
    static String field_h;

    final java.net.Socket b(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        tl var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        tl var12 = null;
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
                    var13 = stellarshard.field_B;
                    if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    String discarded$3 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-444 != (((bc) this).field_g ^ -1)) {
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
                        stackOut_7_0 = ((bc) this).field_k;
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
                        new java.net.URI(stackIn_10_4 + "://" + ((bc) this).field_c);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(stackIn_10_1);
                        stackOut_10_0 = ((bc) this).field_k;
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
                        new java.net.URI(stackIn_13_4 + "://" + ((bc) this).field_c);
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
                    return ((bc) this).a(-28548);
                }
                case 16: {
                    boolean discarded$4 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = 0;
                    if (param0 <= -127) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var14 = null;
                    byte[] discarded$5 = bc.a(-89, 82, 75, (byte[]) null);
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
                        var12_ref2 = this.a(var11, -444);
                        if (var12_ref2 != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof tl ? 25 : 26);
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
                        statePc = (stateCaught_22 instanceof tl ? 25 : 26);
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
                        statePc = (stateCaught_23 instanceof tl ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var12 = (tl) (Object) caughtException;
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
                    return ((bc) this).a(-28548);
                }
                case 30: {
                    throw var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(byte param0, int param1, String param2, String param3) throws IOException {
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
        String var49 = null;
        String var50 = null;
        String var51 = null;
        L0: {
          var12 = stellarshard.field_B;
          var13 = new java.net.Socket(param3, param1);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param2 == null) {
            var6.write(("CONNECT " + ((bc) this).field_c + ":" + ((bc) this).field_g + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((bc) this).field_c + ":" + ((bc) this).field_g + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        if (param0 == 66) {
          var6.flush();
          var37 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var7 = var37;
          var38 = var37.readLine();
          var50 = var38;
          var8 = var50;
          var50 = var38;
          if (var38 != null) {
            if (!var38.startsWith("HTTP/1.0 200")) {
              if (!var38.startsWith("HTTP/1.1 200")) {
                if (var38.startsWith("HTTP/1.0 407")) {
                  var9 = 0;
                  var41 = "proxy-authenticate: ";
                  var8 = var41;
                  var8 = var41;
                  var8 = var37.readLine();
                  L1: while (true) {
                    if (var8 != null) {
                      if ((var9 ^ -1) > -51) {
                        if (!var8.toLowerCase().startsWith(var41)) {
                          var9++;
                          var8 = var37.readLine();
                          continue L1;
                        } else {
                          L2: {
                            var42 = var8.substring(var41.length()).trim();
                            var8 = var42;
                            var8 = var42;
                            var11 = var42.indexOf(' ');
                            if (var11 == -1) {
                              break L2;
                            } else {
                              var8 = var42.substring(0, var11);
                              break L2;
                            }
                          }
                          throw new tl(var8);
                        }
                      } else {
                        throw new tl("");
                      }
                    } else {
                      throw new tl("");
                    }
                  }
                } else {
                  if (var38.startsWith("HTTP/1.1 407")) {
                    var9 = 0;
                    var43 = "proxy-authenticate: ";
                    var8 = var43;
                    var8 = var43;
                    var10 = var43;
                    var8 = var10;
                    var8 = var10;
                    var8 = var37.readLine();
                    L3: while (true) {
                      L4: {
                        if (var8 == null) {
                          break L4;
                        } else {
                          if ((var9 ^ -1) <= -51) {
                            break L4;
                          } else {
                            if (!var8.toLowerCase().startsWith(var43)) {
                              var9++;
                              var8 = var37.readLine();
                              var51 = var8;
                              var51 = var8;
                              continue L3;
                            } else {
                              L5: {
                                var44 = var8.substring(var43.length()).trim();
                                var8 = var44;
                                var8 = var44;
                                var11 = var44.indexOf(' ');
                                if (var11 == -1) {
                                  break L5;
                                } else {
                                  var8 = var44.substring(0, var11);
                                  break L5;
                                }
                              }
                              throw new tl(var8);
                            }
                          }
                        }
                      }
                      throw new tl("");
                    }
                  } else {
                    var6.close();
                    var37.close();
                    var13.close();
                    return null;
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
            var37.close();
            var13.close();
            return null;
          }
        } else {
          L6: {
            field_i = -31;
            var6.flush();
            var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var16;
            var17 = var16.readLine();
            var8 = var17;
            var8 = var17;
            if (var17 != null) {
              if (!var17.startsWith("HTTP/1.0 200")) {
                if (!var17.startsWith("HTTP/1.1 200")) {
                  L7: {
                    if (var17.startsWith("HTTP/1.0 407")) {
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var16.readLine();
                      break L7;
                    } else {
                      if (var17.startsWith("HTTP/1.1 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var29 = var10;
                        var49 = var29;
                        var8 = var49;
                        var49 = var10;
                        var8 = var16.readLine();
                        var29 = var8;
                        var49 = var29;
                        var8 = var49;
                        var49 = var8;
                        var29 = var49;
                        var49 = var29;
                        var8 = var49;
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L8: while (true) {
                    if (var8 != null) {
                      if ((var9 ^ -1) > -51) {
                        if (!var8.toLowerCase().startsWith(var10)) {
                          var9++;
                          var8 = var16.readLine();
                          var50 = var8;
                          var8 = var50;
                          var50 = var8;
                          continue L8;
                        } else {
                          L9: {
                            var36 = var8.substring(var10.length()).trim();
                            var8 = var36;
                            var8 = var36;
                            var11 = var36.indexOf(' ');
                            if (var11 == -1) {
                              break L9;
                            } else {
                              var8 = var36.substring(0, var11);
                              break L9;
                            }
                          }
                          throw new tl(var8);
                        }
                      } else {
                        throw new tl("");
                      }
                    } else {
                      throw new tl("");
                    }
                  }
                } else {
                  return var13;
                }
              } else {
                return var13;
              }
            } else {
              break L6;
            }
          }
          var6.close();
          var16.close();
          var13.close();
          return null;
        }
    }

    public static void b(byte param0) {
        if (param0 <= 43) {
            return;
        }
        field_h = null;
    }

    final static void a(boolean param0, int param1) {
        if (param1 > -7) {
            return;
        }
        vc.a((byte) -78, param0, true);
    }

    bc() {
        ((bc) this).field_k = java.net.ProxySelector.getDefault();
    }

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        int var5_int = 0;
        we var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        L0: {
          var7 = stellarshard.field_B;
          if (param1 <= 0) {
            var4 = param3;
            break L0;
          } else {
            var8 = new byte[param2];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (param2 <= var5_int) {
                break L0;
              } else {
                var8[var5_int] = param3[var5_int + param1];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        var5 = new we();
        var5.a(false);
        var5.a((long)(8 * param2), (byte) -78, var4);
        var6 = new byte[64];
        var5.a(var6, param0, 22297);
        return var6;
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
                    if (param1 == -444) {
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
                    if (param0.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return ((bc) this).a(param1 + -28104);
                }
                case 4: {
                    var3 = param0.address();
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
                    if (param0.type() != java.net.Proxy.Type.HTTP) {
                        statePc = 16;
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
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 15;
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
                    return this.a((byte) 66, var4_ref.getPort(), (String) (Object) var5, var4_ref.getHostName());
                }
                case 16: {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5 = new java.net.Socket(param0);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((bc) this).field_c, ((bc) this).field_g));
                    return var5;
                }
                case 19: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = null;
        field_h = "Go Back";
    }
}

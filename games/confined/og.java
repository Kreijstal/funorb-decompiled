/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class og extends n {
    static float field_h;
    static double[] field_g;
    private java.net.ProxySelector field_j;
    static bi field_f;
    static e field_i;

    public static void d(int param0) {
        int var1 = 13 / ((param0 - -72) / 34);
        field_f = null;
        field_g = null;
        field_i = null;
    }

    final static boolean a(int param0, char param1) {
        if (param0 != -96) {
            field_g = null;
            if (Character.isISOControl(param1)) {
                return false;
            }
            if (!(!ld.a((byte) -21, param1))) {
                return true;
            }
            if (param1 == 45) {
                return true;
            }
            if (param1 == 160) {
                return true;
            }
            if (param1 != 32) {
                // if_icmpeq L103
            } else {
                return true;
            }
            return false;
        }
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (!(!ld.a((byte) -21, param1))) {
            return true;
        }
        if (param1 != 45) {
            // if_icmpeq L161
            // if_icmpeq L161
            // if_icmpeq L161
        } else {
            return true;
        }
        return false;
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        java.net.Socket var14 = null;
        BufferedReader var17 = null;
        String var18 = null;
        String var19 = null;
        BufferedReader var20 = null;
        String var21 = null;
        String var22 = null;
        String var41 = null;
        String var42 = null;
        var12 = Confined.field_J ? 1 : 0;
        var14 = new java.net.Socket(param0, param2);
        var14.setSoTimeout(10000);
        var6 = var14.getOutputStream();
        if (param1 == null) {
          var6.write(("CONNECT " + ((og) this).field_b + ":" + ((og) this).field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          var20 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
          var7 = var20;
          if (param3 != 0) {
            var13 = null;
            og.a((byte) -66, (mi) null, (be) null, -29);
            var41 = var20.readLine();
            var8 = var41;
            if (var41 != null) {
              L0: {
                if (var41.startsWith("HTTP/1.0 200")) {
                  break L0;
                } else {
                  if (!var41.startsWith("HTTP/1.1 200")) {
                    L1: {
                      if (var41.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var20.readLine();
                        break L1;
                      } else {
                        if (!var41.startsWith("HTTP/1.1 407")) {
                          var6.close();
                          var20.close();
                          var14.close();
                          return null;
                        } else {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          var8 = var20.readLine();
                          break L1;
                        }
                      }
                    }
                    L2: while (true) {
                      L3: {
                        if (var8 == null) {
                          break L3;
                        } else {
                          if (50 <= var9) {
                            break L3;
                          } else {
                            if (var8.toLowerCase().startsWith(var10)) {
                              L4: {
                                var42 = var8.substring(var10.length()).trim();
                                var8 = var42;
                                var11 = var42.indexOf(' ');
                                if (var11 != -1) {
                                  var8 = var42.substring(0, var11);
                                  break L4;
                                } else {
                                  var8 = var42;
                                  break L4;
                                }
                              }
                              throw new kk(var8);
                            } else {
                              var9++;
                              var8 = var20.readLine();
                              continue L2;
                            }
                          }
                        }
                      }
                      throw new kk("");
                    }
                  } else {
                    break L0;
                  }
                }
              }
              return var14;
            } else {
              var6.close();
              var20.close();
              var14.close();
              return null;
            }
          } else {
            var21 = var20.readLine();
            var8 = var21;
            if (var21 != null) {
              L5: {
                if (var21.startsWith("HTTP/1.0 200")) {
                  break L5;
                } else {
                  if (!var21.startsWith("HTTP/1.1 200")) {
                    L6: {
                      if (var21.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var20.readLine();
                        break L6;
                      } else {
                        if (var21.startsWith("HTTP/1.1 407")) {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          var8 = var20.readLine();
                          break L6;
                        } else {
                          var6.close();
                          var20.close();
                          var14.close();
                          return null;
                        }
                      }
                    }
                    L7: while (true) {
                      if (var8 != null) {
                        if (50 > var9) {
                          if (var8.toLowerCase().startsWith(var10)) {
                            L8: {
                              var22 = var8.substring(var10.length()).trim();
                              var8 = var22;
                              var11 = var22.indexOf(' ');
                              if (var11 != -1) {
                                var8 = var22.substring(0, var11);
                                break L8;
                              } else {
                                var8 = var22;
                                break L8;
                              }
                            }
                            throw new kk(var8);
                          } else {
                            var9++;
                            var8 = var20.readLine();
                            continue L7;
                          }
                        } else {
                          throw new kk("");
                        }
                      } else {
                        throw new kk("");
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              return var14;
            } else {
              var6.close();
              var20.close();
              var14.close();
              return null;
            }
          }
        } else {
          L9: {
            var6.write(("CONNECT " + ((og) this).field_b + ":" + ((og) this).field_c + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var6.flush();
            var17 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
            if (param3 == 0) {
              break L9;
            } else {
              var13 = null;
              og.a((byte) -66, (mi) null, (be) null, -29);
              break L9;
            }
          }
          var18 = var17.readLine();
          var8 = var18;
          if (var18 != null) {
            L10: {
              if (var18.startsWith("HTTP/1.0 200")) {
                break L10;
              } else {
                if (!var18.startsWith("HTTP/1.1 200")) {
                  L11: {
                    if (var18.startsWith("HTTP/1.0 407")) {
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var17.readLine();
                      break L11;
                    } else {
                      if (var18.startsWith("HTTP/1.1 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var10;
                        var8 = var17.readLine();
                        break L11;
                      } else {
                        var6.close();
                        var17.close();
                        var14.close();
                        return null;
                      }
                    }
                  }
                  L12: while (true) {
                    if (var8 != null) {
                      if (50 > var9) {
                        if (var8.toLowerCase().startsWith(var10)) {
                          L13: {
                            var19 = var8.substring(var10.length()).trim();
                            var8 = var19;
                            var11 = var19.indexOf(' ');
                            if (var11 != -1) {
                              var8 = var19.substring(0, var11);
                              break L13;
                            } else {
                              var8 = var19;
                              break L13;
                            }
                          }
                          throw new kk(var8);
                        } else {
                          var9++;
                          var8 = var17.readLine();
                          continue L12;
                        }
                      } else {
                        throw new kk("");
                      }
                    } else {
                      throw new kk("");
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            return var14;
          } else {
            var6.close();
            var17.close();
            var14.close();
            return null;
          }
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        kk var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        kk var12 = null;
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
        java.net.Socket stackIn_23_0 = null;
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
        java.net.Socket stackOut_22_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Confined.field_J ? 1 : 0;
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
                    if (443 != ((og) this).field_c) {
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
                        stackOut_7_0 = ((og) this).field_j;
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
                        statePc = 16;
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
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        new java.net.URI(stackIn_10_4 + "://" + ((og) this).field_b);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(stackIn_10_1);
                        stackOut_10_0 = ((og) this).field_j;
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
                        statePc = 16;
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
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        stackIn_13_4 = stackOut_12_4;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        new java.net.URI(stackIn_13_4 + "://" + ((og) this).field_b);
                        var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(stackIn_13_1);
                        if (param0 == -22176) {
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
                        og.a(false);
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
                    return ((og) this).c(param0 ^ 30609);
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
                        var12_ref2 = this.a(param0 ^ 22172, var11);
                        if (var12_ref2 != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof kk ? 24 : 25);
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
                        statePc = (stateCaught_21 instanceof kk ? 24 : 25);
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
                        statePc = (stateCaught_22 instanceof kk ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var12 = (kk) (Object) caughtException;
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
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    throw var7;
                }
                case 30: {
                    return ((og) this).c(param0 ^ 30609);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static jg e(int param0) {
        if (param0 != 1) {
            field_g = null;
            return (jg) (Object) new q();
        }
        return (jg) (Object) new q();
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
                    return ((og) this).c(param0 ^ 8461);
                }
                case 3: {
                    if (param0 == -4) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    jb discarded$1 = og.a(true, (byte) 97);
                    statePc = 5;
                    continue stateLoop;
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
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((og) this).field_b, ((og) this).field_c));
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
                    return this.a(var4_ref.getHostName(), (String) (Object) var5, var4_ref.getPort(), 0);
                }
                case 20: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static jb a(boolean param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jb var12 = null;
        bd var15 = null;
        bd var16 = null;
        bd var17 = null;
        bd var18 = null;
        bd var19 = null;
        bd var20 = null;
        bd var21 = null;
        bd var22 = null;
        bd var23 = null;
        bd var24 = null;
        bd var25 = null;
        bd var26 = null;
        bd var27 = null;
        bd var28 = null;
        bd var29 = null;
        bd var30 = null;
        bd var31 = null;
        bd var32 = null;
        bd var33 = null;
        jb stackIn_1_0 = null;
        jb stackIn_2_0 = null;
        jb stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        jb stackOut_0_0 = null;
        jb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        jb stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var9 = Confined.field_J ? 1 : 0;
          var12 = new jb(11);
          stackOut_0_0 = (jb) var12;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (jb) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (jb) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_a = stackIn_3_1 != 0;
        if (param0) {
          L1: {
            var12.a((byte) -78, new bd(14, tn.field_C, (ok) (Object) pn.field_a));
            if (!param0) {
              var12.a((byte) -116, new bd(2, mk.field_k, (ok) (Object) pn.field_a));
              var12.a((byte) -53, new bd(3, ea.field_e, (ok) (Object) pn.field_a));
              var12.a((byte) -80, new bd(4, ef.field_ub, (ok) (Object) pn.field_a));
              break L1;
            } else {
              if (of.field_a) {
                break L1;
              } else {
                if (null != qn.field_v.field_K) {
                  break L1;
                } else {
                  L2: {
                    var12.a((byte) -71, new bd(2, mk.field_k, (ok) (Object) pn.field_a));
                    var15 = new bd(5, qa.field_e, (ok) (Object) pn.field_a);
                    var16 = new bd(6, cc.field_p, (ok) (Object) pn.field_a);
                    var5 = var15.field_f;
                    if (var16.field_f <= var5) {
                      break L2;
                    } else {
                      var5 = var16.field_f;
                      break L2;
                    }
                  }
                  var16.field_f = var5;
                  var15.field_f = var5;
                  var12.a((byte) -70, var15);
                  var12.a((byte) -87, var16);
                  break L1;
                }
              }
            }
          }
          L3: {
            var17 = new bd(7, rb.field_h, (ok) (Object) pn.field_a);
            var18 = new bd(8, mg.field_d, (ok) (Object) pn.field_a);
            var19 = new bd(9, pm.field_u, (ok) (Object) pn.field_a);
            var6 = var17.field_f;
            if (var6 < var18.field_f) {
              var6 = var18.field_f;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var19.field_f <= var6) {
              break L4;
            } else {
              var6 = var19.field_f;
              break L4;
            }
          }
          L5: {
            var19.field_f = var6;
            var18.field_f = var6;
            var17.field_f = var6;
            var12.a((byte) -52, var17);
            var12.a((byte) -115, var18);
            var12.a((byte) -113, var19);
            var7 = 1;
            if (!param0) {
              break L5;
            } else {
              if ((sg.field_x ^ -1) < -1) {
                break L5;
              } else {
                var7 = 0;
                break L5;
              }
            }
          }
          L6: {
            if (var7 != 0) {
              var12.a((byte) -61, new bd(10, nn.field_v, (ok) (Object) pn.field_a));
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (param1 == 55) {
              break L7;
            } else {
              boolean discarded$5 = og.a(38, '%');
              break L7;
            }
          }
          L8: {
            if (!param0) {
              var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
              var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
              var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
              break L8;
            } else {
              var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
              break L8;
            }
          }
          var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
          var12.a(var8, 30, 43, 320);
          var12.a(false, param1 + 26151, 0);
          var12.c(92);
          return var12;
        } else {
          var12.a((byte) -63, new bd(1, qj.field_d, (ok) (Object) pn.field_a));
          if (!param0) {
            L9: {
              var12.a((byte) -116, new bd(2, mk.field_k, (ok) (Object) pn.field_a));
              var12.a((byte) -53, new bd(3, ea.field_e, (ok) (Object) pn.field_a));
              var12.a((byte) -80, new bd(4, ef.field_ub, (ok) (Object) pn.field_a));
              var31 = new bd(7, rb.field_h, (ok) (Object) pn.field_a);
              var32 = new bd(8, mg.field_d, (ok) (Object) pn.field_a);
              var33 = new bd(9, pm.field_u, (ok) (Object) pn.field_a);
              var6 = var31.field_f;
              if (var6 < var32.field_f) {
                var6 = var32.field_f;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (var33.field_f <= var6) {
                break L10;
              } else {
                var6 = var33.field_f;
                break L10;
              }
            }
            L11: {
              var33.field_f = var6;
              var32.field_f = var6;
              var31.field_f = var6;
              var12.a((byte) -52, var31);
              var12.a((byte) -115, var32);
              var12.a((byte) -113, var33);
              var7 = 1;
              if (!param0) {
                break L11;
              } else {
                if ((sg.field_x ^ -1) < -1) {
                  break L11;
                } else {
                  var7 = 0;
                  break L11;
                }
              }
            }
            L12: {
              if (var7 != 0) {
                var12.a((byte) -61, new bd(10, nn.field_v, (ok) (Object) pn.field_a));
                break L12;
              } else {
                break L12;
              }
            }
            if (param1 == 55) {
              if (param0) {
                var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                var12.a(var8, 30, 43, 320);
                var12.a(false, param1 + 26151, 0);
                var12.c(92);
                return var12;
              } else {
                var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                var12.a(var8, 30, 43, 320);
                var12.a(false, param1 + 26151, 0);
                var12.c(92);
                return var12;
              }
            } else {
              L13: {
                boolean discarded$6 = og.a(38, '%');
                if (!param0) {
                  var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                  var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                  var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                  break L13;
                } else {
                  var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                  break L13;
                }
              }
              var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
              var12.a(var8, 30, 43, 320);
              var12.a(false, param1 + 26151, 0);
              var12.c(92);
              return var12;
            }
          } else {
            if (!of.field_a) {
              if (null == qn.field_v.field_K) {
                L14: {
                  var12.a((byte) -71, new bd(2, mk.field_k, (ok) (Object) pn.field_a));
                  var26 = new bd(5, qa.field_e, (ok) (Object) pn.field_a);
                  var27 = new bd(6, cc.field_p, (ok) (Object) pn.field_a);
                  var5 = var26.field_f;
                  if (var27.field_f <= var5) {
                    break L14;
                  } else {
                    var5 = var27.field_f;
                    break L14;
                  }
                }
                L15: {
                  var27.field_f = var5;
                  var26.field_f = var5;
                  var12.a((byte) -70, var26);
                  var12.a((byte) -87, var27);
                  var28 = new bd(7, rb.field_h, (ok) (Object) pn.field_a);
                  var29 = new bd(8, mg.field_d, (ok) (Object) pn.field_a);
                  var30 = new bd(9, pm.field_u, (ok) (Object) pn.field_a);
                  var6 = var28.field_f;
                  if (var6 < var29.field_f) {
                    var6 = var29.field_f;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (var30.field_f <= var6) {
                    break L16;
                  } else {
                    var6 = var30.field_f;
                    break L16;
                  }
                }
                L17: {
                  var30.field_f = var6;
                  var29.field_f = var6;
                  var28.field_f = var6;
                  var12.a((byte) -52, var28);
                  var12.a((byte) -115, var29);
                  var12.a((byte) -113, var30);
                  var7 = 1;
                  if (!param0) {
                    break L17;
                  } else {
                    if ((sg.field_x ^ -1) < -1) {
                      break L17;
                    } else {
                      var7 = 0;
                      break L17;
                    }
                  }
                }
                L18: {
                  if (var7 != 0) {
                    var12.a((byte) -61, new bd(10, nn.field_v, (ok) (Object) pn.field_a));
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (param1 == 55) {
                    break L19;
                  } else {
                    boolean discarded$7 = og.a(38, '%');
                    break L19;
                  }
                }
                if (!param0) {
                  var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                  var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                  var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                  var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                  var12.a(var8, 30, 43, 320);
                  var12.a(false, param1 + 26151, 0);
                  var12.c(92);
                  return var12;
                } else {
                  var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                  var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                  var12.a(var8, 30, 43, 320);
                  var12.a(false, param1 + 26151, 0);
                  var12.c(92);
                  return var12;
                }
              } else {
                L20: {
                  var23 = new bd(7, rb.field_h, (ok) (Object) pn.field_a);
                  var24 = new bd(8, mg.field_d, (ok) (Object) pn.field_a);
                  var25 = new bd(9, pm.field_u, (ok) (Object) pn.field_a);
                  var6 = var23.field_f;
                  if (var6 < var24.field_f) {
                    var6 = var24.field_f;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var25.field_f <= var6) {
                    break L21;
                  } else {
                    var6 = var25.field_f;
                    break L21;
                  }
                }
                L22: {
                  var25.field_f = var6;
                  var24.field_f = var6;
                  var23.field_f = var6;
                  var12.a((byte) -52, var23);
                  var12.a((byte) -115, var24);
                  var12.a((byte) -113, var25);
                  var7 = 1;
                  if (!param0) {
                    break L22;
                  } else {
                    if ((sg.field_x ^ -1) < -1) {
                      break L22;
                    } else {
                      var7 = 0;
                      break L22;
                    }
                  }
                }
                L23: {
                  if (var7 != 0) {
                    var12.a((byte) -61, new bd(10, nn.field_v, (ok) (Object) pn.field_a));
                    break L23;
                  } else {
                    break L23;
                  }
                }
                if (param1 == 55) {
                  if (param0) {
                    var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                    var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                    var12.a(var8, 30, 43, 320);
                    var12.a(false, param1 + 26151, 0);
                    var12.c(92);
                    return var12;
                  } else {
                    var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                    var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                    var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                    var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                    var12.a(var8, 30, 43, 320);
                    var12.a(false, param1 + 26151, 0);
                    var12.c(92);
                    return var12;
                  }
                } else {
                  L24: {
                    boolean discarded$8 = og.a(38, '%');
                    if (!param0) {
                      var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                      var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                      var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                      break L24;
                    } else {
                      var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                      break L24;
                    }
                  }
                  var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                  var12.a(var8, 30, 43, 320);
                  var12.a(false, param1 + 26151, 0);
                  var12.c(92);
                  return var12;
                }
              }
            } else {
              L25: {
                var20 = new bd(7, rb.field_h, (ok) (Object) pn.field_a);
                var21 = new bd(8, mg.field_d, (ok) (Object) pn.field_a);
                var22 = new bd(9, pm.field_u, (ok) (Object) pn.field_a);
                var6 = var20.field_f;
                if (var6 < var21.field_f) {
                  var6 = var21.field_f;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (var22.field_f <= var6) {
                  break L26;
                } else {
                  var6 = var22.field_f;
                  break L26;
                }
              }
              L27: {
                var22.field_f = var6;
                var21.field_f = var6;
                var20.field_f = var6;
                var12.a((byte) -52, var20);
                var12.a((byte) -115, var21);
                var12.a((byte) -113, var22);
                var7 = 1;
                if ((sg.field_x ^ -1) < -1) {
                  break L27;
                } else {
                  var7 = 0;
                  break L27;
                }
              }
              L28: {
                if (var7 != 0) {
                  var12.a((byte) -61, new bd(10, nn.field_v, (ok) (Object) pn.field_a));
                  break L28;
                } else {
                  break L28;
                }
              }
              if (param1 == 55) {
                if (param0) {
                  var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                  var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                  var12.a(var8, 30, 43, 320);
                  var12.a(false, param1 + 26151, 0);
                  var12.c(92);
                  return var12;
                } else {
                  var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                  var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                  var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                  var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                  var12.a(var8, 30, 43, 320);
                  var12.a(false, param1 + 26151, 0);
                  var12.c(92);
                  return var12;
                }
              } else {
                boolean discarded$9 = og.a(38, '%');
                var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                var12.a(var8, 30, 43, 320);
                var12.a(false, param1 + 26151, 0);
                var12.c(92);
                return var12;
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        hb var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (param0) {
          return;
        } else {
          var1 = vh.field_a;
          L0: while (true) {
            if (!wi.a(param0)) {
              return;
            } else {
              var1.b(true, 8);
              var1.field_n = var1.field_n + 1;
              var2 = var1.field_n + 1;
              md.a(var1, (byte) 126);
              vh.field_a.a(25859, -var2 + var1.field_n);
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0, mi param1, be param2, int param3) {
        mg.field_g = bg.a(12398) * param3 / 1000;
        pl.a(param1, true);
        if (param0 <= 115) {
          return;
        } else {
          ck.a(26613, param1);
          ee.a(param1, (byte) 70);
          pb.b(126);
          im.b((byte) -85);
          tg.field_H = 0 + -mg.field_g;
          return;
        }
    }

    og() {
        ((og) this).field_j = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new double[]{0.0, -4.0, 96.0};
        field_i = new e(11, 0, 1, 2);
    }
}

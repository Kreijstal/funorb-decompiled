/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class aj extends ig {
    static String field_i;
    static int[] field_f;
    static long field_j;
    private java.net.ProxySelector field_g;
    static int field_h;
    static int field_e;

    final java.net.Socket b(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        rg var12 = null;
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
        java.net.Socket stackIn_23_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        java.net.ProxySelector stackOut_6_0 = null;
        java.net.URI stackOut_6_1 = null;
        java.net.URI stackOut_6_2 = null;
        StringBuilder stackOut_6_3 = null;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        String stackOut_8_4 = null;
        java.net.ProxySelector stackOut_7_0 = null;
        java.net.URI stackOut_7_1 = null;
        java.net.URI stackOut_7_2 = null;
        StringBuilder stackOut_7_3 = null;
        String stackOut_7_4 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.Socket stackOut_22_0 = null;
        L0: {
          var13 = Vertigo2.field_L ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (((aj) this).field_b != 443) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var5 = stackIn_5_0;
        try {
          L2: {
            L3: {
              stackOut_6_0 = ((aj) this).field_g;
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
              if (var5 != 0) {
                stackOut_8_0 = (java.net.ProxySelector) (Object) stackIn_8_0;
                stackOut_8_1 = null;
                stackOut_8_2 = null;
                stackOut_8_3 = (StringBuilder) (Object) stackIn_8_3;
                stackOut_8_4 = "https";
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                break L3;
              } else {
                stackOut_7_0 = (java.net.ProxySelector) (Object) stackIn_7_0;
                stackOut_7_1 = null;
                stackOut_7_2 = null;
                stackOut_7_3 = (StringBuilder) (Object) stackIn_7_3;
                stackOut_7_4 = "http";
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + ((aj) this).field_a));
              stackOut_9_0 = ((aj) this).field_g;
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
              if (var5 == 0) {
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
                break L4;
              } else {
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
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + ((aj) this).field_a));
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((aj) this).a((byte) -39);
        }
        if (param0 == 640) {
          boolean discarded$3 = var3.addAll((Collection) (Object) var4);
          var6_array = var3.toArray();
          var7 = null;
          var8_array = var6_array;
          var9 = 0;
          L5: while (true) {
            if (var8_array.length <= var9) {
              if (var7 != null) {
                throw aj.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
              } else {
                return ((aj) this).a((byte) -39);
              }
            } else {
              var10 = var8_array[var9];
              var11 = (java.net.Proxy) var10;
              try {
                L6: {
                  var12_ref2 = this.a((byte) 107, var11);
                  if (var12_ref2 != null) {
                    stackOut_22_0 = (java.net.Socket) var12_ref2;
                    stackIn_23_0 = stackOut_22_0;
                    decompiledRegionSelector0 = 1;
                    break L6;
                  } else {
                    var9++;
                    var9++;
                    decompiledRegionSelector0 = 0;
                    break L6;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                L8: {
                  var12_ref = (IOException) (Object) decompiledCaughtException;
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L8;
                }
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var12 = (rg) (Object) decompiledCaughtException;
                  var7 = (Object) (Object) var12;
                  var9++;
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                continue L5;
              } else {
                return stackIn_23_0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(String param0, String param1) {
        try {
            if (df.field_l != null) {
                df.field_l.h((byte) 64);
            }
            eb.field_d = new ob(param1, param0, false, true, true);
            n.field_b.a(false, (iq) (Object) eb.field_d);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "aj.I(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 33 + 41);
        }
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
        RuntimeException var3 = null;
        java.net.SocketAddress var3_ref = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        Object var5 = null;
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
        java.net.Socket stackIn_2_0 = null;
        java.net.Socket stackIn_15_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        java.net.Socket stackOut_14_0 = null;
        java.net.Socket stackOut_1_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (param1.type() != java.net.Proxy.Type.DIRECT) {
              var3_ref = param1.address();
              if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                if (param1.type() != java.net.Proxy.Type.HTTP) {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = (Object) (Object) new java.net.Socket(param1);
                    ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((aj) this).field_a, ((aj) this).field_b));
                    stackOut_18_0 = var5;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  var5 = null;
                  try {
                    L1: {
                      L2: {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 != null) {
                          var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                          var9.setAccessible(true);
                          if (!((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            break L2;
                          } else {
                            var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                            var11.setAccessible(true);
                            var12 = (String) var10.invoke(var8, new Object[0]);
                            var13 = (String) var11.invoke(var8, new Object[2]);
                            var5 = (Object) (Object) (var12 + ": " + var13);
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      }
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  stackOut_14_0 = this.a(var4_ref.getPort(), 32, var4_ref.getHostName(), (String) var5);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = ((aj) this).a((byte) -39);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("aj.K(").append(107).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return (java.net.Socket) (Object) stackIn_19_0;
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        RuntimeException var5 = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        java.net.Socket stackIn_10_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_9_0 = null;
        Object stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param2, param0);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param3 == null) {
                var6.write(("CONNECT " + ((aj) this).field_a + ":" + ((aj) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + ((aj) this).field_a + ":" + ((aj) this).field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var8 = var7.readLine();
              if (var8 != null) {
                L3: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L3;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L4: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          break L4;
                        } else {
                          if (var8.startsWith("HTTP/1.1 407")) {
                            break L4;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
                      var8 = var7.readLine();
                      L5: while (true) {
                        L6: {
                          if (var8 == null) {
                            break L6;
                          } else {
                            if (var9 >= 50) {
                              break L6;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L7: {
                                  var14 = var8.substring(var10.length()).trim();
                                  var8 = var14;
                                  var8 = var14;
                                  var11 = var14.indexOf(' ');
                                  if (var11 == -1) {
                                    break L7;
                                  } else {
                                    var8 = var14.substring(0, var11);
                                    break L7;
                                  }
                                }
                                throw new rg(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                continue L5;
                              }
                            }
                          }
                        }
                        throw new rg("");
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_9_0 = (java.net.Socket) var13;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                break L2;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            stackOut_24_0 = null;
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("aj.G(").append(param0).append(44).append(32).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
        return (java.net.Socket) (Object) stackIn_25_0;
    }

    final static void a(int param0, int param1, vi param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mi var7 = null;
        mi var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var7 = uh.field_Wb;
            var8 = var7;
            var8.j(3, 120);
            var8.field_u = var8.field_u + 1;
            var4 = var8.field_u;
            var8.f(1, 85);
            var8.d(param2.field_u, -1783);
            var8.d(param2.field_v, -1783);
            var8.d(param2.field_y, -1783);
            var8.e(param2.field_t, 0);
            var8.e(param2.field_p, 0);
            var8.e(param2.field_q, 0);
            if (param1 > 6) {
              var8.e(param2.field_A, 0);
              var8.f(param2.field_o.length, -76);
              var5 = 0;
              L1: while (true) {
                if (param2.field_o.length <= var5) {
                  int discarded$1 = var8.c(var4, 25);
                  var8.b((byte) -95, -var4 + var8.field_u);
                  break L0;
                } else {
                  var7.e(param2.field_o[var5], 0);
                  var5++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("aj.L(").append(3).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    aj() {
        ((aj) this).field_g = java.net.ProxySelector.getDefault();
    }

    final static void a(boolean param0, float param1, String param2) {
        try {
            d.field_C = param1;
            li.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "aj.H(" + 0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_f = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 50;
        field_i = "Level View - jump to exit";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.Socket;
import java.net.ProxySelector;
import java.net.URI;

final class vb extends ca {
    static a field_l;
    static String field_m;
    static boolean field_j;
    private java.net.ProxySelector field_k;

    private final java.net.Socket a(java.net.Proxy param0) throws IOException {
        RuntimeException var3 = null;
        java.net.SocketAddress var3_ref = null;
        int var4 = 0;
        Object var5 = null;
        java.net.InetSocketAddress var5_ref = null;
        Object var6 = null;
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
        java.net.Socket stackIn_2_0 = null;
        java.net.Socket stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_19_0 = null;
        java.net.Socket stackOut_15_0 = null;
        java.net.Socket stackOut_1_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3_ref = param0.address();
              if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                var4 = -26;
                var5_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                if (param0.type() != java.net.Proxy.Type.HTTP) {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var6 = (Object) (Object) new java.net.Socket(param0);
                    ((java.net.Socket) var6).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((vb) this).field_a, ((vb) this).field_e));
                    stackOut_19_0 = var6;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  var6 = null;
                  try {
                    L1: {
                      L2: {
                        var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var7_ref = var15;
                        var8 = var15.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var8.setAccessible(true);
                        var9 = var8.invoke((Object) null, new Object[2]);
                        if (var9 != null) {
                          var10 = var7_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                          var10.setAccessible(true);
                          if (((Boolean) var10.invoke(var9, new Object[0])).booleanValue()) {
                            var11 = var7_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                            var11.setAccessible(true);
                            var12 = var15.getDeclaredMethod("getHeaderValue", new Class[2]);
                            var12.setAccessible(true);
                            var13 = (String) var11.invoke(var9, new Object[0]);
                            var14 = (String) var12.invoke(var9, new Object[2]);
                            var6 = (Object) (Object) (var13 + ": " + var14);
                            break L2;
                          } else {
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
                      var7 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  stackOut_15_0 = this.a((String) var6, var5_ref.getHostName(), -124, var5_ref.getPort());
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = ((vb) this).a(-1);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("vb.D(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 111 + 41);
        }
        return (java.net.Socket) (Object) stackIn_20_0;
    }

    final java.net.Socket a(byte param0) throws IOException {
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
        bn var12 = null;
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
          var13 = TetraLink.field_J;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            String discarded$3 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (((vb) this).field_e != 443) {
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
              stackOut_6_0 = ((vb) this).field_k;
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
                break L3;
              } else {
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
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + ((vb) this).field_a));
              stackOut_9_0 = ((vb) this).field_k;
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
                break L4;
              } else {
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
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + ((vb) this).field_a));
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((vb) this).a(-1);
        }
        L5: {
          boolean discarded$4 = var3.addAll((Collection) (Object) var4);
          var6_array = var3.toArray();
          var7 = null;
          if (param0 < -45) {
            break L5;
          } else {
            field_l = null;
            break L5;
          }
        }
        var8_array = var6_array;
        var9 = 0;
        L6: while (true) {
          if (var8_array.length <= var9) {
            if (var7 != null) {
              throw vb.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return ((vb) this).a(-1);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                int discarded$5 = 111;
                var12_ref2 = this.a(var11);
                if (var12_ref2 != null) {
                  stackOut_22_0 = (java.net.Socket) var12_ref2;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 1;
                  break L7;
                } else {
                  var9++;
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L9: {
                var12_ref = (IOException) (Object) decompiledCaughtException;
                var9++;
                decompiledRegionSelector0 = 0;
                break L9;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var12 = (bn) (Object) decompiledCaughtException;
                var7 = (Object) (Object) var12;
                var9++;
                var9++;
                decompiledRegionSelector0 = 0;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue L6;
            } else {
              return stackIn_23_0;
            }
          }
        }
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
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
        var12 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param1, param3);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param0 == null) {
                var6.write(("CONNECT " + ((vb) this).field_a + ":" + ((vb) this).field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + ((vb) this).field_a + ":" + ((vb) this).field_e + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
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
                          if (!var8.startsWith("HTTP/1.1 407")) {
                            break L2;
                          } else {
                            break L4;
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
                                throw new bn(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                continue L5;
                              }
                            }
                          }
                        }
                        throw new bn("");
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
            stackOut_26_1 = new StringBuilder().append("vb.E(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
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
            if (param1 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + -124 + 44 + param3 + 41);
        }
        return (java.net.Socket) (Object) stackIn_25_0;
    }

    public static void b() {
        field_l = null;
        field_m = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) kd.field_g);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) kd.field_g);
        try {
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) kd.field_g);
            kf.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "vb.F(" + -51 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean e(int param0) {
        if (param0 != -30962) {
            field_j = false;
            return lf.field_b != null ? true : false;
        }
        return lf.field_b != null ? true : false;
    }

    vb() {
        ((vb) this).field_k = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Quick Chat Help";
        field_l = new a();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

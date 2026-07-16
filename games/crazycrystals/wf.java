/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class wf extends tl {
    static String field_f;
    private java.net.ProxySelector field_g;
    static int field_h;

    public static void c(int param0) {
        if (param0 != 0) {
            wf.c(59);
        }
        field_f = null;
    }

    private final java.net.Socket a(String param0, int param1, String param2, int param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        String var15 = null;
        L0: {
          var12 = CrazyCrystals.field_B;
          var13 = new java.net.Socket(param0, param1);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param3 <= 0) {
            break L0;
          } else {
            wf.c(-1);
            break L0;
          }
        }
        L1: {
          if (param2 == null) {
            var6.write(("CONNECT " + ((wf) this).field_c + ":" + ((wf) this).field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L1;
          } else {
            var6.write(("CONNECT " + ((wf) this).field_c + ":" + ((wf) this).field_d + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L1;
          }
        }
        L2: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var14 = var7.readLine();
          var8 = var14;
          if (var14 != null) {
            L3: {
              if (var14.startsWith("HTTP/1.0 200")) {
                break L3;
              } else {
                if (!var14.startsWith("HTTP/1.1 200")) {
                  L4: {
                    if (var14.startsWith("HTTP/1.0 407")) {
                      break L4;
                    } else {
                      if (!var14.startsWith("HTTP/1.1 407")) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var9 = 0;
                  var10 = "proxy-authenticate: ";
                  var8 = var10;
                  var8 = var7.readLine();
                  L5: while (true) {
                    L6: {
                      if (var8 == null) {
                        break L6;
                      } else {
                        if ((var9 ^ -1) <= -51) {
                          break L6;
                        } else {
                          if (var8.toLowerCase().startsWith(var10)) {
                            L7: {
                              var15 = var8.substring(var10.length()).trim();
                              var8 = var15;
                              var11 = var15.indexOf(' ');
                              if (-1 != var11) {
                                var8 = var15.substring(0, var11);
                                break L7;
                              } else {
                                var8 = var15;
                                break L7;
                              }
                            }
                            throw new va(var8);
                          } else {
                            var9++;
                            var8 = var7.readLine();
                            continue L5;
                          }
                        }
                      }
                    }
                    throw new va("");
                  }
                } else {
                  break L3;
                }
              }
            }
            return var13;
          } else {
            break L2;
          }
        }
        var6.close();
        var7.close();
        var13.close();
        return null;
    }

    final java.net.Socket a(boolean param0) throws IOException {
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
        va var12 = null;
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
        java.net.Socket stackIn_22_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        java.net.ProxySelector stackOut_7_0 = null;
        java.net.URI stackOut_7_1 = null;
        java.net.URI stackOut_7_2 = null;
        StringBuilder stackOut_7_3 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        String stackOut_9_4 = null;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        String stackOut_8_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.Socket stackOut_21_0 = null;
        L0: {
          var13 = CrazyCrystals.field_B;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((wf) this).field_d != 443) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var5 = stackIn_6_0;
        try {
          L2: {
            L3: {
              stackOut_7_0 = ((wf) this).field_g;
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
                break L3;
              } else {
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
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + ((wf) this).field_c));
              stackOut_10_0 = ((wf) this).field_g;
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
                break L4;
              } else {
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
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + ((wf) this).field_c));
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((wf) this).a(96);
        }
        boolean discarded$3 = var3.addAll((Collection) (Object) var4);
        var6_array = var3.toArray();
        var7 = null;
        var8_array = var6_array;
        var9 = 0;
        L5: while (true) {
          if (var9 >= var8_array.length) {
            L6: {
              if (param0) {
                break L6;
              } else {
                field_f = null;
                break L6;
              }
            }
            if (var7 == null) {
              return ((wf) this).a(14);
            } else {
              throw wf.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                var12_ref2 = this.a(var11, (byte) -123);
                if (var12_ref2 != null) {
                  stackOut_21_0 = (java.net.Socket) var12_ref2;
                  stackIn_22_0 = stackOut_21_0;
                  decompiledRegionSelector0 = 1;
                  break L7;
                } else {
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
                var12 = (va) (Object) decompiledCaughtException;
                var7 = (Object) (Object) var12;
                var9++;
                decompiledRegionSelector0 = 0;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue L5;
            } else {
              return stackIn_22_0;
            }
          }
        }
    }

    wf() {
        ((wf) this).field_g = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        java.net.SocketAddress var3 = null;
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
        Throwable decompiledCaughtException = null;
        if (param0.type() == java.net.Proxy.Type.DIRECT) {
          return ((wf) this).a(64);
        } else {
          if (param1 == -123) {
            var3 = param0.address();
            if ((Object) var3 instanceof java.net.InetSocketAddress) {
              var4_ref = (java.net.InetSocketAddress) (Object) var3;
              if (param0.type() != java.net.Proxy.Type.HTTP) {
                if (param0.type() == java.net.Proxy.Type.SOCKS) {
                  var5 = (Object) (Object) new java.net.Socket(param0);
                  ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((wf) this).field_c, ((wf) this).field_d));
                  return (java.net.Socket) var5;
                } else {
                  return null;
                }
              } else {
                var5 = null;
                try {
                  L0: {
                    L1: {
                      var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                      var6_ref = var14;
                      var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                      var7.setAccessible(true);
                      var8 = var7.invoke((Object) null, new Object[2]);
                      if (var8 != null) {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                          var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                          var10.setAccessible(true);
                          var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                          var11.setAccessible(true);
                          var12 = (String) var10.invoke(var8, new Object[0]);
                          var13 = (String) var11.invoke(var8, new Object[2]);
                          var5 = (Object) (Object) (var12 + ": " + var13);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                    break L0;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    break L2;
                  }
                }
                return this.a(var4_ref.getHostName(), var4_ref.getPort(), (String) var5, -38);
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "As you will soon see just here, rocks roll off each other too.";
        field_h = 500;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

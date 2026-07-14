/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class ra extends oa {
    private java.net.ProxySelector field_g;
    static String field_f;

    private final java.net.Socket a(String param0, String param1, boolean param2, int param3) throws IOException {
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
          var12 = Bounce.field_N;
          var13 = new java.net.Socket(param0, param3);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param1 != null) {
            var6.write(("CONNECT " + ((ra) this).field_d + ":" + ((ra) this).field_e + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((ra) this).field_d + ":" + ((ra) this).field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        L1: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var14 = var7.readLine();
          var8 = var14;
          if (var14 != null) {
            L2: {
              if (var14.startsWith("HTTP/1.0 200")) {
                break L2;
              } else {
                if (!var14.startsWith("HTTP/1.1 200")) {
                  L3: {
                    if (var14.startsWith("HTTP/1.0 407")) {
                      break L3;
                    } else {
                      if (!var14.startsWith("HTTP/1.1 407")) {
                        break L1;
                      } else {
                        break L3;
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
                          if (!var8.toLowerCase().startsWith(var10)) {
                            var9++;
                            var8 = var7.readLine();
                            continue L4;
                          } else {
                            L6: {
                              var15 = var8.substring(var10.length()).trim();
                              var8 = var15;
                              var11 = var15.indexOf(' ');
                              if ((var11 ^ -1) != 0) {
                                var8 = var15.substring(0, var11);
                                break L6;
                              } else {
                                var8 = var15;
                                break L6;
                              }
                            }
                            throw new tk(var8);
                          }
                        }
                      }
                    }
                    throw new tk("");
                  }
                } else {
                  break L2;
                }
              }
            }
            return var13;
          } else {
            break L1;
          }
        }
        if (param2) {
          var6.close();
          var7.close();
          var13.close();
          return null;
        } else {
          return null;
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        tk var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        tk var12 = null;
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
        java.net.Socket stackIn_24_0 = null;
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
        java.net.Socket stackOut_23_0 = null;
        L0: {
          var13 = Bounce.field_N;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (443 != ((ra) this).field_e) {
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
            stackOut_7_0 = ((ra) this).field_g;
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
              break L2;
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
              break L2;
            }
          }
          L3: {
            new java.net.URI(stackIn_10_4 + "://" + ((ra) this).field_d);
            var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(stackIn_10_1);
            stackOut_10_0 = ((ra) this).field_g;
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
              break L3;
            } else {
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
              break L3;
            }
          }
          new java.net.URI(stackIn_13_4 + "://" + ((ra) this).field_d);
          var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(stackIn_13_1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((ra) this).a(false);
        }
        boolean discarded$3 = var3.addAll((Collection) (Object) var4);
        var6_array = var3.toArray();
        var7 = null;
        var8_array = var6_array;
        if (param0 == -19314) {
          var9 = 0;
          L4: while (true) {
            if (var9 >= var8_array.length) {
              if (var7 == null) {
                return ((ra) this).a(false);
              } else {
                throw var7;
              }
            } else {
              var10 = var8_array[var9];
              var11 = (java.net.Proxy) var10;
              try {
                var12_ref2 = this.a(var11, (byte) -37);
                if (var12_ref2 != null) {
                  stackOut_23_0 = (java.net.Socket) var12_ref2;
                  stackIn_24_0 = stackOut_23_0;
                  decompiledRegionSelector0 = 1;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var12_ref = (IOException) (Object) decompiledCaughtException;
                var9++;
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var12 = (tk) (Object) decompiledCaughtException;
                var7 = var12;
                var9++;
                decompiledRegionSelector0 = 0;
              }
              if (decompiledRegionSelector0 == 0) {
                continue L4;
              } else {
                return stackIn_24_0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void c(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Bounce.field_N;
        var1 = (Object) (Object) qj.field_c;
        synchronized (var1) {
          L0: {
            if (param0 == 28282) {
              break L0;
            } else {
              field_f = null;
              break L0;
            }
          }
          L1: {
            oh.field_a = ec.field_bb;
            ak.field_y = ak.field_y + 1;
            if ((db.field_R ^ -1) > -1) {
              var5 = 0;
              var2 = var5;
              L2: while (true) {
                if (-113 <= var5) {
                  db.field_R = rj.field_g;
                  break L1;
                } else {
                  ng.field_a[var5] = false;
                  var5++;
                  continue L2;
                }
              }
            } else {
              L3: while (true) {
                if (rj.field_g == db.field_R) {
                  break L1;
                } else {
                  var2 = di.field_b[rj.field_g];
                  rj.field_g = 127 & 1 + rj.field_g;
                  if (var2 >= 0) {
                    ng.field_a[var2] = true;
                    continue L3;
                  } else {
                    ng.field_a[var2] = false;
                    continue L3;
                  }
                }
              }
            }
          }
          ec.field_bb = Bounce.field_F;
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        java.net.SocketAddress var3 = null;
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
        Throwable decompiledCaughtException = null;
        if (param0.type() != java.net.Proxy.Type.DIRECT) {
          var3 = param0.address();
          if (var3 instanceof java.net.InetSocketAddress) {
            if (param1 == -37) {
              var4_ref = (java.net.InetSocketAddress) (Object) var3;
              if (param0.type() != java.net.Proxy.Type.HTTP) {
                if (param0.type() == java.net.Proxy.Type.SOCKS) {
                  var5 = new java.net.Socket(param0);
                  var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((ra) this).field_d, ((ra) this).field_e));
                  return var5;
                } else {
                  return null;
                }
              } else {
                var5 = null;
                try {
                  L0: {
                    var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                    var6_ref = var14;
                    var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                    var7.setAccessible(true);
                    var8 = var7.invoke((Object) null, new Object[2]);
                    if (var8 == null) {
                      break L0;
                    } else {
                      var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                      var9.setAccessible(true);
                      if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (Exception) (Object) decompiledCaughtException;
                }
                return this.a(var4_ref.getHostName(), (String) (Object) var5, true, var4_ref.getPort());
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return ((ra) this).a(false);
        }
    }

    ra() {
        ((ra) this).field_g = java.net.ProxySelector.getDefault();
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 <= 109) {
            ra.b((byte) 102);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}

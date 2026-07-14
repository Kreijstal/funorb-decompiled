/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class sc extends we {
    static pi[][] field_j;
    static int field_n;
    static String field_h;
    static boolean field_m;
    private java.net.ProxySelector field_i;
    static char[] field_o;
    static String field_p;
    static String field_k;
    static ne field_l;

    final java.net.Socket a(int param0) throws IOException {
        Object var7_ref = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        db var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        db var12 = null;
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
        var7_ref = null;
        L0: {
          var13 = client.field_A ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (443 != ((sc) this).field_f) {
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
            stackOut_6_0 = ((sc) this).field_i;
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
              break L2;
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
              break L2;
            }
          }
          L3: {
            new java.net.URI(stackIn_9_4 + "://" + ((sc) this).field_d);
            var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(stackIn_9_1);
            stackOut_9_0 = ((sc) this).field_i;
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
              break L3;
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
              break L3;
            }
          }
          new java.net.URI(stackIn_12_4 + "://" + ((sc) this).field_d);
          var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(stackIn_12_1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((sc) this).b(2);
        }
        L4: {
          boolean discarded$3 = var3.addAll((Collection) (Object) var4);
          var6_array = var3.toArray();
          if (param0 < -2) {
            break L4;
          } else {
            sc.b(true);
            break L4;
          }
        }
        var7_ref = null;
        var8_array = var6_array;
        var9 = 0;
        L5: while (true) {
          if (var8_array.length <= var9) {
            if (var7 == null) {
              return ((sc) this).b(2);
            } else {
              throw var7;
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              var12_ref2 = this.a((byte) -86, var11);
              if (var12_ref2 != null) {
                stackOut_22_0 = (java.net.Socket) var12_ref2;
                stackIn_23_0 = stackOut_22_0;
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
              var12 = (db) (Object) decompiledCaughtException;
              var7 = var12;
              var9++;
              decompiledRegionSelector0 = 0;
            }
            if (decompiledRegionSelector0 == 0) {
              continue L5;
            } else {
              return stackIn_23_0;
            }
          }
        }
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
        java.net.SocketAddress var3 = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        Object var5 = null;
        java.net.Socket var5_ref = null;
        String var5_ref2 = null;
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
        if (param1.type() == java.net.Proxy.Type.DIRECT) {
          return ((sc) this).b(2);
        } else {
          if (param0 < -82) {
            var3 = param1.address();
            if (var3 instanceof java.net.InetSocketAddress) {
              var4_ref = (java.net.InetSocketAddress) (Object) var3;
              if (param1.type() != java.net.Proxy.Type.HTTP) {
                if (param1.type() == java.net.Proxy.Type.SOCKS) {
                  var5_ref = new java.net.Socket(param1);
                  var5_ref.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((sc) this).field_d, ((sc) this).field_f));
                  return var5_ref;
                } else {
                  return null;
                }
              } else {
                var5_ref = null;
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
                        var5_ref2 = var12 + ": " + var13;
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
                return this.a(var5_ref2, var4_ref.getPort(), var4_ref.getHostName(), 1323);
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
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
        L0: {
          var12 = client.field_A ? 1 : 0;
          var13 = new java.net.Socket(param2, param1);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param0 == null) {
            var6.write(("CONNECT " + ((sc) this).field_d + ":" + ((sc) this).field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((sc) this).field_d + ":" + ((sc) this).field_f + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        L1: {
          var6.flush();
          if (param3 == 1323) {
            break L1;
          } else {
            ((sc) this).field_i = null;
            break L1;
          }
        }
        L2: {
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var8 = var7.readLine();
          if (var8 == null) {
            break L2;
          } else {
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
                  var8 = var7.readLine();
                  var10 = "proxy-authenticate: ";
                  var8 = var10;
                  L5: while (true) {
                    L6: {
                      if (var8 == null) {
                        break L6;
                      } else {
                        if ((var9 ^ -1) <= -51) {
                          break L6;
                        } else {
                          if (!var8.toLowerCase().startsWith(var10)) {
                            var8 = var7.readLine();
                            var9++;
                            continue L5;
                          } else {
                            L7: {
                              var14 = var8.substring(var10.length()).trim();
                              var8 = var14;
                              var11 = var14.indexOf(' ');
                              if ((var11 ^ -1) != 0) {
                                var8 = var14.substring(0, var11);
                                break L7;
                              } else {
                                var8 = var14;
                                break L7;
                              }
                            }
                            throw new db(var8);
                          }
                        }
                      }
                    }
                    throw new db("");
                  }
                } else {
                  break L3;
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
    }

    final static boolean c(byte param0) {
        kl var1 = null;
        int var2 = 0;
        int var3 = 0;
        kl var4 = null;
        var3 = client.field_A ? 1 : 0;
        var4 = (kl) (Object) aa.field_f.c((byte) -95);
        var1 = var4;
        if (var1 == null) {
          return false;
        } else {
          L0: {
            if (param0 <= -57) {
              break L0;
            } else {
              field_p = null;
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (var2 >= var1.field_o) {
              return true;
            } else {
              L2: {
                if (var4.field_y[var2] != null) {
                  if (0 == var4.field_y[var2].field_c) {
                    return false;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (null != var4.field_t[var2]) {
                if (-1 == (var4.field_t[var2].field_c ^ -1)) {
                  return false;
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    sc() {
        ((sc) this).field_i = java.net.ProxySelector.getDefault();
    }

    public static void b(boolean param0) {
        field_j = null;
        field_p = null;
        if (param0) {
            field_h = null;
        }
        field_h = null;
        field_k = null;
        field_o = null;
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Cancel rematch";
        field_n = 0;
        field_m = true;
        field_j = new pi[8][];
        field_o = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_k = "Waiting for sound effects";
        field_p = "Cancel";
    }
}

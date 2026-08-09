/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class aj extends ig {
    static String field_i;
    static int[] field_f;
    static long field_j;
    private java.net.ProxySelector field_g;
    static int field_h;
    static int field_e;

    final java.net.Socket b(int param0) throws IOException {
        int stackIn_5_0 = 0;
        java.net.ProxySelector stackIn_8_0;
        java.net.URI stackIn_8_1;
        java.net.URI stackIn_8_2;
        StringBuilder stackIn_8_3;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        String stackIn_9_4 = null;
        java.net.ProxySelector stackIn_11_0;
        java.net.URI stackIn_11_1;
        java.net.URI stackIn_11_2;
        StringBuilder stackIn_11_3;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        String stackIn_12_4;
        java.net.Socket stackIn_23_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        rg var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = Vertigo2.field_L ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if ((this.field_b ^ -1) != -444) {
            stackIn_5_0 = 0;
            break L1;
          } else {
            stackIn_5_0 = 1;
            break L1;
          }
        }
        var5 = stackIn_5_0;
        try {
          L2: {
            L3: {
              stackIn_8_0 = this.field_g;

              stackIn_8_1 = null;

              stackIn_8_2 = null;

              stackIn_8_3 = new StringBuilder();

              if (var5 != 0) {
                stackIn_9_0 = (java.net.ProxySelector) ((Object) stackIn_8_0);
                stackIn_9_1 = null;
                stackIn_9_2 = null;
                stackIn_9_3 = (StringBuilder) ((Object) stackIn_8_3);
                stackIn_9_4 = "https";
                break L3;
              } else {
                stackIn_9_0 = (java.net.ProxySelector) ((Object) stackIn_8_0);
                stackIn_9_1 = null;
                stackIn_9_2 = null;
                stackIn_9_3 = (StringBuilder) ((Object) stackIn_8_3);
                stackIn_9_4 = "http";
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + this.field_a));
              stackIn_11_0 = this.field_g;

              stackIn_11_1 = null;

              stackIn_11_2 = null;

              stackIn_11_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "https";
                break L4;
              } else {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "http";
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + this.field_a));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a((byte) -39);
        }
        if (param0 == 640) {
          var3.addAll((Collection) ((Object) var4));
          var6_array = var3.toArray();
          var7 = null;
          var8 = var6_array;
          var9 = 0;
          L5: while (true) {
            if (var8.length <= var9) {
              if (var7 != null) {
                throw aj.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
              } else {
                return this.a((byte) -39);
              }
            } else {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                L6: {
                  var12 = this.a((byte) 107, var11);
                  if (var12 != null) {
                    stackIn_23_0 = (java.net.Socket) (var12);
                    decompiledRegionSelector0 = 1;
                    break L6;
                  } else {
                    var9++;
                    decompiledRegionSelector0 = 0;
                    break L6;
                  }
                }
              } catch (rg decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var12_ref = (rg) (Object) decompiledCaughtException;
                  var7 = var12_ref;
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                L8: {
                  var12_ref2 = (IOException) (Object) decompiledCaughtException;
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L8;
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
          return (java.net.Socket) null;
        }
    }

    final static void a(String param0, String param1, byte param2) {
        if (param2 != 33) {
            return;
        }
        try {
            if (df.field_l != null) {
                df.field_l.h((byte) 64);
            }
            eb.field_d = new ob(param1, param0, false, true, true);
            n.field_b.a(false, eb.field_d);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "aj.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        java.net.Socket stackIn_17_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        Object var5 = null;
        Class var6 = null;
        Exception var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        try {
          L0: {
            if (param1.type() != java.net.Proxy.Type.DIRECT) {
              var3 = param1.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                L1: {
                  var4 = (java.net.InetSocketAddress) ((Object) var3);
                  if (param0 >= 71) {
                    break L1;
                  } else {
                    field_e = -16;
                    break L1;
                  }
                }
                if (param1.type() != java.net.Proxy.Type.HTTP) {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param1);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_b)));
                    stackIn_21_0 = var5;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  var5 = null;
                  try {
                    L2: {
                      L3: {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6 = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                        if (var8 != null) {
                          var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var9.setAccessible(true);
                          if (!((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            break L3;
                          } else {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                            var5 = var12 + ": " + var13;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var6_ref = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  stackIn_17_0 = this.a(var4.getPort(), 32, var4.getHostName(), (String) (var5));
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = this.a((byte) -39);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3_ref);

            stackIn_24_1 = new StringBuilder().append("aj.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_21_0);
          }
        }
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_12_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        vi var13 = null;
        java.net.Socket var14 = null;
        String var15 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = new java.net.Socket(param2, param0);
              if (param1 == 32) {
                break L1;
              } else {
                var13 = (vi) null;
                aj.a(72, 23, (vi) null);
                break L1;
              }
            }
            L2: {
              var14.setSoTimeout(10000);
              var6 = var14.getOutputStream();
              if (param3 == null) {
                var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L2;
              } else {
                var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L2;
              }
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var14.getInputStream())));
              var8 = var7.readLine();
              if (var8 != null) {
                L4: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L4;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L5: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          break L5;
                        } else {
                          if (var8.startsWith("HTTP/1.1 407")) {
                            break L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
                      var8 = var7.readLine();
                      L6: while (true) {
                        L7: {
                          if (var8 == null) {
                            break L7;
                          } else {
                            if (-51 >= (var9 ^ -1)) {
                              break L7;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L8: {
                                  var15 = var8.substring(var10.length()).trim();
                                  var8 = var15;
                                  var8 = var15;
                                  var8 = var15;
                                  var11 = var15.indexOf(' ');
                                  if (var11 == -1) {
                                    break L8;
                                  } else {
                                    var8 = var15.substring(0, var11);
                                    break L8;
                                  }
                                }
                                throw new rg(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                continue L6;
                              }
                            }
                          }
                        }
                        throw new rg("");
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                stackIn_12_0 = (java.net.Socket) (var14);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L3;
              }
            }
            var6.close();
            var7.close();
            var14.close();
            stackIn_27_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("aj.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_27_0);
        }
    }

    final static void a(int param0, int param1, vi param2) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        mi var7 = uh.field_Wb;
        mi var8 = var7;
        var8.j(param0, 120);
        var8.field_u = var8.field_u + 1;
        int var4 = var8.field_u;
        var8.f(1, 85);
        var8.d(param2.field_u, -1783);
        var8.d(param2.field_v, -1783);
        var8.d(param2.field_y, -1783);
        var8.e(param2.field_t, 0);
        var8.e(param2.field_p, 0);
        var8.e(param2.field_q, 0);
        if (param1 <= 6) {
            return;
        }
        try {
            var8.e(param2.field_A, 0);
            var8.f(param2.field_o.length, -76);
            for (var5 = 0; param2.field_o.length > var5; var5++) {
                var7.e(param2.field_o[var5], 0);
            }
            var8.c(var4, 25);
            var8.b((byte) -95, -var4 + var8.field_u);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "aj.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    aj() {
        this.field_g = java.net.ProxySelector.getDefault();
    }

    final static void a(boolean param0, float param1, String param2) {
        try {
            if (param0) {
                String var4 = (String) null;
                aj.a(false, -0.6848612427711487f, (String) null);
            }
            d.field_C = param1;
            li.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "aj.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    static {
        field_h = 50;
        field_i = "Level View - jump to exit";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

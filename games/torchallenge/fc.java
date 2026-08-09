/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class fc extends gl {
    static cf field_q;
    static int field_o;
    private java.net.ProxySelector field_n;
    static nf field_p;
    static ka field_m;

    final static long e(int param0) {
        if (param0 < 74) {
            field_m = (ka) null;
            return ol.a(256) + -ac.field_e;
        }
        return ol.a(256) + -ac.field_e;
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        int var5 = 0;
        Object var6 = null;
        Class var7 = null;
        java.lang.reflect.Method var8 = null;
        Object var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        java.lang.reflect.Method var12 = null;
        String var13 = null;
        String var14 = null;
        Class var15 = null;
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        java.net.Socket stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var7_ref = null;
        try {
          L0: {
            if (param0.type() == java.net.Proxy.Type.DIRECT) {
              stackIn_3_0 = this.b(1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var5 = 11 % ((param1 - 70) / 46);
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param0.type() == java.net.Proxy.Type.HTTP) {
                  var6 = null;
                  try {
                    L1: {
                      L2: {
                        var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var7 = var15;
                        var8 = var15.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var8.setAccessible(true);
                        var9 = var8.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                        if (var9 != null) {
                          var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var10.setAccessible(true);
                          if (!((Boolean) (var10.invoke(var9, new Object[]{}))).booleanValue()) {
                            break L2;
                          } else {
                            var11 = var7.getDeclaredMethod("getHeaderName", new Class[]{});
                            var11.setAccessible(true);
                            var12 = var15.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var12.setAccessible(true);
                            var13 = (String) (var11.invoke(var9, new Object[]{}));
                            var14 = (String) (var12.invoke(var9, new Object[]{new java.net.URL("https://" + this.field_i + "/"), "https"}));
                            var6 = var13 + ": " + var14;
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
                      var7_ref = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  stackIn_20_0 = this.a(var4.getPort(), 52, var4.getHostName(), (String) (var6));
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var6 = new java.net.Socket(param0);
                    ((java.net.Socket) (var6)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_i, this.field_d)));
                    stackIn_11_0 = var6;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3_ref);

            stackIn_23_1 = new StringBuilder().append("fc.I(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.net.Socket) ((Object) stackIn_11_0);
            } else {
              return stackIn_20_0;
            }
          }
        }
    }

    final static lj a(boolean param0, int param1, int param2, int param3, boolean param4) {
        int var5 = 118 % ((-62 - param2) / 37);
        return bb.a(param3, param4, param1, (byte) 92, false, param0);
    }

    final static boolean d(int param0) {
        if (param0 <= 121) {
            return true;
        }
        return eh.field_p == qc.field_i ? true : false;
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_10_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        OutputStream var7 = null;
        BufferedReader var8 = null;
        String var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        java.net.Socket var14 = null;
        String var15 = null;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = -39 % ((param1 - -24) / 41);
              var14 = new java.net.Socket(param2, param0);
              var14.setSoTimeout(10000);
              var7 = var14.getOutputStream();
              if (param3 != null) {
                var7.write(("CONNECT " + this.field_i + ":" + this.field_d + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var7.write(("CONNECT " + this.field_i + ":" + this.field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var7.flush();
              var8 = new BufferedReader((Reader) ((Object) new InputStreamReader(var14.getInputStream())));
              var9 = var8.readLine();
              if (var9 != null) {
                L3: {
                  if (var9.startsWith("HTTP/1.0 200")) {
                    break L3;
                  } else {
                    if (!var9.startsWith("HTTP/1.1 200")) {
                      L4: {
                        if (var9.startsWith("HTTP/1.0 407")) {
                          break L4;
                        } else {
                          if (var9.startsWith("HTTP/1.1 407")) {
                            break L4;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var10 = 0;
                      var9 = var8.readLine();
                      var11 = "proxy-authenticate: ";
                      L5: while (true) {
                        L6: {
                          if (var9 == null) {
                            break L6;
                          } else {
                            if ((var10 ^ -1) <= -51) {
                              break L6;
                            } else {
                              if (var9.toLowerCase().startsWith(var11)) {
                                L7: {
                                  var15 = var9.substring(var11.length()).trim();
                                  var9 = var15;
                                  var12 = var15.indexOf(' ');
                                  if (0 != (var12 ^ -1)) {
                                    var9 = var15.substring(0, var12);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                throw new bj(var9);
                              } else {
                                var9 = var8.readLine();
                                var10++;
                                continue L5;
                              }
                            }
                          }
                        }
                        throw new bj("");
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_10_0 = (java.net.Socket) (var14);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L2;
              }
            }
            var7.close();
            var8.close();
            var14.close();
            stackIn_26_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("fc.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_26_0);
        }
    }

    final static String a(String param0, lj param1, int param2, int param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.b(-7957)) {
              stackIn_3_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3 > 13) {
                  break L1;
                } else {
                  field_o = -99;
                  break L1;
                }
              }
              stackIn_7_0 = param4 + " - " + param1.a(param2, (byte) 12) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("fc.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final java.net.Socket a(byte param0) throws IOException {
        int stackIn_6_0 = 0;
        java.net.ProxySelector stackIn_9_0;
        java.net.URI stackIn_9_1;
        java.net.URI stackIn_9_2;
        StringBuilder stackIn_9_3;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        String stackIn_10_4 = null;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        java.net.ProxySelector stackIn_13_0;
        java.net.URI stackIn_13_1;
        java.net.URI stackIn_13_2;
        StringBuilder stackIn_13_3;
        String stackIn_13_4;
        java.net.Socket stackIn_25_0 = null;
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
        bj var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        rd var14 = null;
        L0: {
          var13 = TorChallenge.field_F ? 1 : 0;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((this.field_d ^ -1) != -444) {
            stackIn_6_0 = 0;
            break L1;
          } else {
            stackIn_6_0 = 1;
            break L1;
          }
        }
        var5 = stackIn_6_0;
        try {
          L2: {
            L3: {
              stackIn_9_0 = this.field_n;

              stackIn_9_1 = null;

              stackIn_9_2 = null;

              stackIn_9_3 = new StringBuilder();

              if (var5 != 0) {
                stackIn_10_0 = (java.net.ProxySelector) ((Object) stackIn_9_0);
                stackIn_10_1 = null;
                stackIn_10_2 = null;
                stackIn_10_3 = (StringBuilder) ((Object) stackIn_9_3);
                stackIn_10_4 = "https";
                break L3;
              } else {
                stackIn_10_0 = (java.net.ProxySelector) ((Object) stackIn_9_0);
                stackIn_10_1 = null;
                stackIn_10_2 = null;
                stackIn_10_3 = (StringBuilder) ((Object) stackIn_9_3);
                stackIn_10_4 = "http";
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + this.field_i));
              stackIn_12_0 = this.field_n;

              stackIn_12_1 = null;

              stackIn_12_2 = null;

              stackIn_12_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_13_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_3 = (StringBuilder) ((Object) stackIn_12_3);
                stackIn_13_4 = "https";
                break L4;
              } else {
                stackIn_13_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_3 = (StringBuilder) ((Object) stackIn_12_3);
                stackIn_13_4 = "http";
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + this.field_i));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b(1);
        }
        L5: {
          var3.addAll((Collection) ((Object) var4));
          if (param0 > 85) {
            var6_array = var3.toArray();
            var7 = null;
            var8 = var6_array;
            var9 = 0;
            break L5;
          } else {
            var14 = (rd) null;
            fc.a((rd) null, 103, true);
            var6_array = var3.toArray();
            var7 = null;
            var8 = var6_array;
            var9 = 0;
            break L5;
          }
        }
        L6: while (true) {
          if (var8.length <= var9) {
            if (var7 != null) {
              throw fc.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return this.b(1);
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              L7: {
                var12 = this.a(var11, (byte) -115);
                if (var12 != null) {
                  stackIn_25_0 = (java.net.Socket) (var12);
                  decompiledRegionSelector0 = 1;
                  break L7;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              }
            } catch (bj decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var12_ref = (bj) (Object) decompiledCaughtException;
                var7 = var12_ref;
                var9++;
                decompiledRegionSelector0 = 0;
                break L8;
              }
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L9: {
                var12_ref2 = (IOException) (Object) decompiledCaughtException;
                var9++;
                decompiledRegionSelector0 = 0;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue L6;
            } else {
              return stackIn_25_0;
            }
          }
        }
    }

    final static void a(rd param0, int param1, boolean param2) {
        try {
            if (param2) {
                rd var4 = (rd) null;
                fc.a((rd) null, 123, false);
            }
            bb.field_d.a(param0, -70);
            mg.a(-127, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "fc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    fc() {
        this.field_n = java.net.ProxySelector.getDefault();
    }

    public static void c(int param0) {
        field_q = null;
        field_m = null;
        int var1 = -103 / ((14 - param0) / 49);
        field_p = null;
    }

    static {
        field_o = 0;
        field_q = new cf();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

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
        java.net.Socket stackIn_12_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
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
        java.net.Socket var13 = null;
        String var14 = null;
        String var15 = null;
        var12 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param0, param1);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param3 <= 0) {
                break L1;
              } else {
                wf.c(-1);
                break L1;
              }
            }
            L2: {
              if (param2 == null) {
                var6.write(("CONNECT " + this.field_c + ":" + this.field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L2;
              } else {
                var6.write(("CONNECT " + this.field_c + ":" + this.field_d + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L2;
              }
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              var14 = var7.readLine();
              if (var14 != null) {
                L4: {
                  if (var14.startsWith("HTTP/1.0 200")) {
                    break L4;
                  } else {
                    if (!var14.startsWith("HTTP/1.1 200")) {
                      L5: {
                        if (var14.startsWith("HTTP/1.0 407")) {
                          break L5;
                        } else {
                          if (!var14.startsWith("HTTP/1.1 407")) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var7.readLine();
                      L6: while (true) {
                        L7: {
                          if (var8 == null) {
                            break L7;
                          } else {
                            if ((var9 ^ -1) <= -51) {
                              break L7;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L8: {
                                  var15 = var8.substring(var10.length()).trim();
                                  var8 = var15;
                                  var11 = var15.indexOf(' ');
                                  if (-1 != var11) {
                                    var8 = var15.substring(0, var11);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                throw new va(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                continue L6;
                              }
                            }
                          }
                        }
                        throw new va("");
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                stackIn_12_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L3;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            stackIn_28_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("wf.E(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L10;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_28_0);
        }
    }

    final java.net.Socket a(boolean param0) throws IOException {
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
        java.net.Socket stackIn_22_0 = null;
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
        va var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = CrazyCrystals.field_B;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_d != 443) {
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
              stackIn_9_0 = this.field_g;

              stackIn_9_1 = null;

              stackIn_9_2 = null;

              stackIn_9_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_10_0 = (java.net.ProxySelector) ((Object) stackIn_9_0);
                stackIn_10_1 = null;
                stackIn_10_2 = null;
                stackIn_10_3 = (StringBuilder) ((Object) stackIn_9_3);
                stackIn_10_4 = "http";
                break L3;
              } else {
                stackIn_10_0 = (java.net.ProxySelector) ((Object) stackIn_9_0);
                stackIn_10_1 = null;
                stackIn_10_2 = null;
                stackIn_10_3 = (StringBuilder) ((Object) stackIn_9_3);
                stackIn_10_4 = "https";
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + this.field_c));
              stackIn_12_0 = this.field_g;

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
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + this.field_c));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(96);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        var9 = 0;
        L5: while (true) {
          if (var9 >= var8.length) {
            L6: {
              if (param0) {
                break L6;
              } else {
                field_f = (String) null;
                break L6;
              }
            }
            if (var7 == null) {
              return this.a(14);
            } else {
              throw wf.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              L7: {
                var12 = this.a(var11, (byte) -123);
                if (var12 != null) {
                  stackIn_22_0 = (java.net.Socket) (var12);
                  decompiledRegionSelector0 = 1;
                  break L7;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              }
            } catch (va decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var12_ref = (va) (Object) decompiledCaughtException;
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
              continue L5;
            } else {
              return stackIn_22_0;
            }
          }
        }
    }

    wf() {
        this.field_g = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        java.net.Socket stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        java.net.Socket stackIn_20_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
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
            if (param0.type() == java.net.Proxy.Type.DIRECT) {
              stackIn_3_0 = this.a(64);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == -123) {
                var3 = param0.address();
                if ((Object) var3 instanceof java.net.InetSocketAddress) {
                  var4 = (java.net.InetSocketAddress) ((Object) var3);
                  if (param0.type() != java.net.Proxy.Type.HTTP) {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                      var5 = new java.net.Socket(param0);
                      ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_c, this.field_d)));
                      stackIn_24_0 = var5;
                      decompiledRegionSelector0 = 4;
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
                          var6 = var14;
                          var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                          var7.setAccessible(true);
                          var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                          if (var8 != null) {
                            var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                            var9.setAccessible(true);
                            if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                              var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                              var10.setAccessible(true);
                              var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                              var11.setAccessible(true);
                              var12 = (String) (var10.invoke(var8, new Object[]{}));
                              var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_c + "/"), "https"}));
                              var5 = var12 + ": " + var13;
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
                        var6_ref = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    stackIn_20_0 = this.a(var4.getHostName(), var4.getPort(), (String) (var5), -38);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = (java.net.Socket) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3_ref);

            stackIn_28_1 = new StringBuilder().append("wf.F(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L4;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.net.Socket) ((Object) stackIn_9_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                return (java.net.Socket) ((Object) stackIn_24_0);
              }
            }
          }
        }
    }

    static {
        field_f = "As you will soon see just here, rocks roll off each other too.";
        field_h = 500;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ch extends lg {
    static String field_g;
    private java.net.ProxySelector field_f;
    static String field_d;
    static int field_e;

    final static void a(int param0, int param1, f param2) {
        th var3 = null;
        try {
            if (param0 != 18391) {
                f var4 = (f) null;
                ch.a(91, -91, (f) null);
            }
            var3 = ed.field_q;
            var3.h(param1, 0);
            var3.c(param2.field_k, param0 + -18392);
            var3.c(param2.field_j, -1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ch.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final java.net.Socket a(boolean param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_12_0 = null;
        java.net.Socket stackIn_21_0 = null;
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
        f var14 = null;
        Class var15 = null;
        try {
          L0: {
            if (param1.type() != java.net.Proxy.Type.DIRECT) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var14 = (f) null;
                  ch.a(17, -71, (f) null);
                  break L1;
                }
              }
              var3 = param1.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param1.type() == java.net.Proxy.Type.HTTP) {
                  var5 = null;
                  try {
                    L2: {
                      L3: {
                        var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6 = var15;
                        var7 = var15.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                        if (var8 == null) {
                          break L3;
                        } else {
                          var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var9.setAccessible(true);
                          if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var15.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                            var5 = var12 + ": " + var13;
                            break L3;
                          } else {
                            break L3;
                          }
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
                  stackIn_21_0 = this.a(var4.getPort(), false, (String) (var5), var4.getHostName());
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param1);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_b)));
                    stackIn_12_0 = var5;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = this.a(-86);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3_ref);

            stackIn_24_1 = new StringBuilder().append("ch.G(").append(param0).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_12_0);
          } else {
            return stackIn_21_0;
          }
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        int stackIn_8_0 = 0;
        java.net.ProxySelector stackIn_11_0;
        java.net.URI stackIn_11_1;
        java.net.URI stackIn_11_2;
        StringBuilder stackIn_11_3;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        String stackIn_12_4 = null;
        java.net.ProxySelector stackIn_14_0;
        java.net.URI stackIn_14_1;
        java.net.URI stackIn_14_2;
        StringBuilder stackIn_14_3;
        java.net.ProxySelector stackIn_15_0;
        java.net.URI stackIn_15_1;
        java.net.URI stackIn_15_2;
        StringBuilder stackIn_15_3;
        String stackIn_15_4;
        java.net.Socket stackIn_26_0 = null;
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
        ck var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = Lexicominos.field_L ? 1 : 0;
          if (param0 >= 14) {
            break L0;
          } else {
            ch.d(-8);
            break L0;
          }
        }
        L1: {
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (443 != this.field_b) {
            stackIn_8_0 = 0;
            break L2;
          } else {
            stackIn_8_0 = 1;
            break L2;
          }
        }
        var5 = stackIn_8_0;
        try {
          L3: {
            L4: {
              stackIn_11_0 = this.field_f;

              stackIn_11_1 = null;

              stackIn_11_2 = null;

              stackIn_11_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "http";
                break L4;
              } else {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "https";
                break L4;
              }
            }
            L5: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + this.field_a));
              stackIn_14_0 = this.field_f;

              stackIn_14_1 = null;

              stackIn_14_2 = null;

              stackIn_14_3 = new StringBuilder();

              if (var5 != 0) {
                stackIn_15_0 = (java.net.ProxySelector) ((Object) stackIn_14_0);
                stackIn_15_1 = null;
                stackIn_15_2 = null;
                stackIn_15_3 = (StringBuilder) ((Object) stackIn_14_3);
                stackIn_15_4 = "http";
                break L5;
              } else {
                stackIn_15_0 = (java.net.ProxySelector) ((Object) stackIn_14_0);
                stackIn_15_1 = null;
                stackIn_15_2 = null;
                stackIn_15_3 = (StringBuilder) ((Object) stackIn_14_3);
                stackIn_15_4 = "https";
                break L5;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_15_0).select(new java.net.URI(stackIn_15_4 + "://" + this.field_a));
            break L3;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(-106);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        var9 = 0;
        L6: while (true) {
          L7: {
            if (var8.length <= var9) {
              break L7;
            } else {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                L8: {
                  var12 = this.a(false, var11);
                  if (var13 == 0) {
                    if (var12 != null) {
                      stackIn_26_0 = (java.net.Socket) (var12);
                      decompiledRegionSelector0 = 1;
                      break L8;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L8;
                    }
                  } else {
                    return this.a(-98);
                  }
                }
              } catch (ck decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L9: {
                  var12_ref = (ck) (Object) decompiledCaughtException;
                  var7 = var12_ref;
                  decompiledRegionSelector0 = 0;
                  break L9;
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                L10: {
                  var12_ref2 = (IOException) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 0;
                  break L10;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                var9++;
                if (var13 == 0) {
                  continue L6;
                } else {
                  break L7;
                }
              } else {
                return stackIn_26_0;
              }
            }
          }
          if (var7 == null) {
            return this.a(-98);
          } else {
            throw ch.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
          }
        }
    }

    private final java.net.Socket a(int param0, boolean param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_11_0 = null;
        java.net.Socket stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
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
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var13 = new java.net.Socket(param3, param0);
                var13.setSoTimeout(10000);
                var6 = var13.getOutputStream();
                if (param2 == null) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              var8 = var7.readLine();
              if (var8 != null) {
                L4: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L4;
                  } else {
                    if (var8.startsWith("HTTP/1.1 200")) {
                      break L4;
                    } else {
                      L5: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          break L5;
                        } else {
                          if (!var8.startsWith("HTTP/1.1 407")) {
                            break L3;
                          } else {
                            break L5;
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
                            if ((var9 ^ -1) <= -51) {
                              break L7;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L8: {
                                  var14 = var8.substring(var10.length()).trim();
                                  var8 = var14;
                                  var8 = var14;
                                  var8 = var14;
                                  var11 = var14.indexOf(' ');
                                  if (var11 == -1) {
                                    break L8;
                                  } else {
                                    var8 = var14.substring(0, var11);
                                    break L8;
                                  }
                                }
                                throw new ck(var8);
                              } else {
                                var8 = var7.readLine();
                                var9++;
                                if (var12 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                        throw new ck("");
                      }
                    }
                  }
                }
                stackIn_11_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L3;
              }
            }
            var6.close();
            if (!param1) {
              var7.close();
              var13.close();
              stackIn_29_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_27_0 = (java.net.Socket) null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("ch.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_27_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_29_0);
          }
        }
    }

    public static void d(int param0) {
        field_d = null;
        if (param0 >= -121) {
            ch.d(29);
            field_g = null;
            return;
        }
        field_g = null;
    }

    ch() {
        this.field_f = java.net.ProxySelector.getDefault();
    }

    static {
        field_e = -1;
        field_d = "TIMES";
        field_g = "Go Back";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

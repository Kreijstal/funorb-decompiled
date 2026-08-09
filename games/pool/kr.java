/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class kr extends bg {
    private java.net.ProxySelector field_f;
    static na field_e;
    static int field_h;
    static long field_g;

    public static void c(int param0) {
        field_e = null;
        if (param0 != 15296) {
            String var2 = (String) null;
            kr.a((byte) -15, 68L, (String) null);
        }
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        java.net.Socket stackIn_16_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
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
            if (param1.type() == java.net.Proxy.Type.DIRECT) {
              stackIn_3_0 = this.b(5101);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = param1.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param1.type() != java.net.Proxy.Type.HTTP) {
                  if (param1.type() != java.net.Proxy.Type.SOCKS) {
                    if (param0 != -6589) {
                      kr.a(false);
                      stackIn_23_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    var5 = new java.net.Socket(param1);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_c, this.field_a)));
                    stackIn_19_0 = var5;
                    decompiledRegionSelector0 = 2;
                    break L0;
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
                        if (var8 == null) {
                          break L2;
                        } else {
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
                  stackIn_16_0 = this.a(var4.getPort(), (byte) 25, (String) (var5), var4.getHostName());
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3_ref);

            stackIn_26_1 = new StringBuilder().append("kr.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.net.Socket) ((Object) stackIn_19_0);
            } else {
              return (java.net.Socket) ((Object) stackIn_23_0);
            }
          }
        }
    }

    private final java.net.Socket a(int param0, byte param1, String param2, String param3) throws IOException {
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
        java.net.Socket var13 = null;
        String var14 = null;
        String var15 = null;
        var12 = Pool.field_O;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param3, param0);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param2 != null) {
                var6.write(("CONNECT " + this.field_c + ":" + this.field_a + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_c + ":" + this.field_a + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              if (param1 == 25) {
                break L2;
              } else {
                kr.c(-94);
                break L2;
              }
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              var14 = var7.readLine();
              var8 = var14;
              var8 = var14;
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
                      var8 = var7.readLine();
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
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
                                  var8 = var15;
                                  var8 = var15;
                                  var11 = var15.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L8;
                                  } else {
                                    var8 = var15.substring(0, var11);
                                    break L8;
                                  }
                                }
                                throw new lo(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                continue L6;
                              }
                            }
                          }
                        }
                        throw new lo("");
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
            stackIn_27_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("kr.F(").append(param0).append(',').append(param1).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_27_0);
        }
    }

    kr() {
        this.field_f = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket a(byte param0) throws IOException {
        int stackIn_6_0 = 0;
        java.net.ProxySelector stackIn_10_0;
        java.net.URI stackIn_10_1;
        java.net.URI stackIn_10_2;
        StringBuilder stackIn_10_3;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        String stackIn_11_4 = null;
        java.net.ProxySelector stackIn_13_0;
        java.net.URI stackIn_13_1;
        java.net.URI stackIn_13_2;
        StringBuilder stackIn_13_3;
        java.net.ProxySelector stackIn_14_0;
        java.net.URI stackIn_14_1;
        java.net.URI stackIn_14_2;
        StringBuilder stackIn_14_3;
        String stackIn_14_4;
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
        lo var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = Pool.field_O;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_a != 443) {
            stackIn_6_0 = 0;
            break L1;
          } else {
            stackIn_6_0 = 1;
            break L1;
          }
        }
        var5 = stackIn_6_0;
        if (param0 <= -94) {
          try {
            L2: {
              L3: {
                stackIn_10_0 = this.field_f;

                stackIn_10_1 = null;

                stackIn_10_2 = null;

                stackIn_10_3 = new StringBuilder();

                if (var5 == 0) {
                  stackIn_11_0 = (java.net.ProxySelector) ((Object) stackIn_10_0);
                  stackIn_11_1 = null;
                  stackIn_11_2 = null;
                  stackIn_11_3 = (StringBuilder) ((Object) stackIn_10_3);
                  stackIn_11_4 = "http";
                  break L3;
                } else {
                  stackIn_11_0 = (java.net.ProxySelector) ((Object) stackIn_10_0);
                  stackIn_11_1 = null;
                  stackIn_11_2 = null;
                  stackIn_11_3 = (StringBuilder) ((Object) stackIn_10_3);
                  stackIn_11_4 = "https";
                  break L3;
                }
              }
              L4: {
                var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(stackIn_11_4 + "://" + this.field_c));
                stackIn_13_0 = this.field_f;

                stackIn_13_1 = null;

                stackIn_13_2 = null;

                stackIn_13_3 = new StringBuilder();

                if (var5 != 0) {
                  stackIn_14_0 = (java.net.ProxySelector) ((Object) stackIn_13_0);
                  stackIn_14_1 = null;
                  stackIn_14_2 = null;
                  stackIn_14_3 = (StringBuilder) ((Object) stackIn_13_3);
                  stackIn_14_4 = "http";
                  break L4;
                } else {
                  stackIn_14_0 = (java.net.ProxySelector) ((Object) stackIn_13_0);
                  stackIn_14_1 = null;
                  stackIn_14_2 = null;
                  stackIn_14_3 = (StringBuilder) ((Object) stackIn_13_3);
                  stackIn_14_4 = "https";
                  break L4;
                }
              }
              var4 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + this.field_c));
              break L2;
            }
          } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
            return this.b(5101);
          }
          var3.addAll((Collection) ((Object) var4));
          var6_array = var3.toArray();
          var7 = null;
          var8 = var6_array;
          var9 = 0;
          L5: while (true) {
            if (var8.length <= var9) {
              if (var7 != null) {
                throw kr.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
              } else {
                return this.b(5101);
              }
            } else {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                L6: {
                  var12 = this.a(-6589, var11);
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
              } catch (lo decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var12_ref = (lo) (Object) decompiledCaughtException;
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

    final static void a(boolean param0) {
        String var1;
        if (!ro.field_e) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (d.field_d != null) {
              d.field_d.k(17);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = ve.d(120);
          vj.field_j = new ui(var1, (String) null, true, false, param0);
          wd.field_Ub.b(tn.field_n, 30000);
          tn.field_n.d(vj.field_j, 30);
          tn.field_n.b(param0);
          return;
        }
    }

    final static void a(byte param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
            if (param0 >= -58) {
                field_e = (na) null;
            }
            fm.field_I = param2;
            hn.field_b = 2;
            var5 = (CharSequence) ((Object) param2);
            di.field_a = hq.a(88, var5);
            c.field_d = param1;
            rg.field_p = true;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "kr.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 99;
        field_e = new na();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

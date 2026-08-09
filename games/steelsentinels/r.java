/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class r extends db {
    static String[] field_j;
    static String field_q;
    static ki field_r;
    static String field_m;
    static String field_i;
    private java.net.ProxySelector field_n;
    static String field_p;
    static String field_o;
    static String field_k;
    static long field_l;

    final static void a(int param0, ud param1, int param2) {
        kj var3 = null;
        try {
            if (param0 != 27153) {
                r.a(true, false);
            }
            var3 = mm.field_g;
            var3.a(param2, (byte) -117);
            var3.a((byte) 126, param1.field_t);
            var3.a((byte) 111, param1.field_u);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "r.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final java.net.Socket a(int param0) throws IOException {
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
        int var7 = 0;
        Object var8 = null;
        Object[] var9 = null;
        int var10 = 0;
        Object var11 = null;
        java.net.Proxy var12 = null;
        java.net.Socket var13 = null;
        vg var13_ref = null;
        IOException var13_ref2 = null;
        int var14 = 0;
        L0: {
          var14 = SteelSentinels.field_G;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((this.field_c ^ -1) != -444) {
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
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + this.field_e));
              stackIn_12_0 = this.field_n;

              stackIn_12_1 = null;

              stackIn_12_2 = null;

              stackIn_12_3 = new StringBuilder();

              if (var5 != 0) {
                stackIn_13_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_3 = (StringBuilder) ((Object) stackIn_12_3);
                stackIn_13_4 = "http";
                break L4;
              } else {
                stackIn_13_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_3 = (StringBuilder) ((Object) stackIn_12_3);
                stackIn_13_4 = "https";
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + this.field_e));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a((byte) 82);
        }
        var3.addAll((Collection) ((Object) var4));
        var7 = -4 % ((-25 - param0) / 46);
        var6_array = var3.toArray();
        var8 = null;
        var9 = var6_array;
        var10 = 0;
        L5: while (true) {
          if (var9.length <= var10) {
            if (var8 != null) {
              throw r.<RuntimeException>$cfr$sneakyThrow((Throwable) var8);
            } else {
              return this.a((byte) 59);
            }
          } else {
            var11 = var9[var10];
            var12 = (java.net.Proxy) (var11);
            try {
              L6: {
                var13 = this.a(25382, var12);
                if (var13 != null) {
                  stackIn_22_0 = (java.net.Socket) (var13);
                  decompiledRegionSelector0 = 1;
                  break L6;
                } else {
                  var10++;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              }
            } catch (vg decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var13_ref = (vg) (Object) decompiledCaughtException;
                var8 = var13_ref;
                var10++;
                decompiledRegionSelector0 = 0;
                break L7;
              }
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L8: {
                var13_ref2 = (IOException) (Object) decompiledCaughtException;
                var10++;
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

    public static void c(byte param0) {
        field_q = null;
        field_o = null;
        field_k = null;
        field_m = null;
        field_p = null;
        field_j = null;
        if (param0 != -117) {
          field_q = (String) null;
          field_i = null;
          field_r = null;
          return;
        } else {
          field_i = null;
          field_r = null;
          return;
        }
    }

    final static void a(int param0, byte param1, cf param2) {
        try {
            jb.field_A.a(3, param2);
            if (param1 != 123) {
                r.b((byte) 48);
            }
            ml.a(1, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "r.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        gh.i(107);
        if (param1 != 104) {
            field_r = (ki) null;
        }
    }

    final static void b(byte param0) {
        int var1;
        if (param0 == 46) {
          if ((lb.field_ac ^ -1) > -225) {
            var1 = lb.field_ac % 32;
            bb.a(-var1 + lb.field_ac + 32, (byte) 64);
            return;
          } else {
            bb.a(256, (byte) 64);
            return;
          }
        } else {
          return;
        }
    }

    private final java.net.Socket a(int param0, String param1, String param2, int param3) throws IOException {
        java.net.Socket stackIn_6_0 = null;
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
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param2, param0);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param1 != null) {
                var6.write(("CONNECT " + this.field_e + ":" + this.field_c + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_e + ":" + this.field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            if (param3 <= -40) {
              L2: {
                var6.flush();
                var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
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
                        var8 = var10;
                        L5: while (true) {
                          L6: {
                            if (var8 == null) {
                              break L6;
                            } else {
                              if (50 <= var9) {
                                break L6;
                              } else {
                                if (var8.toLowerCase().startsWith(var10)) {
                                  L7: {
                                    var14 = var8.substring(var10.length()).trim();
                                    var8 = var14;
                                    var8 = var14;
                                    var8 = var14;
                                    var11 = var14.indexOf(' ');
                                    if ((var11 ^ -1) == 0) {
                                      break L7;
                                    } else {
                                      var8 = var14.substring(0, var11);
                                      break L7;
                                    }
                                  }
                                  throw new vg(var8);
                                } else {
                                  var9++;
                                  var8 = var7.readLine();
                                  continue L5;
                                }
                              }
                            }
                          }
                          throw new vg("");
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_12_0 = (java.net.Socket) (var13);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              var6.close();
              var7.close();
              var13.close();
              stackIn_27_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_6_0 = (java.net.Socket) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("r.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_27_0);
          }
        }
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        java.net.Socket stackIn_6_0 = null;
        Object stackIn_14_0 = null;
        java.net.Socket stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
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
              stackIn_3_0 = this.a((byte) -112);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 25382) {
                var3 = param1.address();
                if ((Object) var3 instanceof java.net.InetSocketAddress) {
                  var4 = (java.net.InetSocketAddress) ((Object) var3);
                  if (param1.type() == java.net.Proxy.Type.HTTP) {
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
                              var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_e + "/"), "https"}));
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
                    stackIn_24_0 = this.a(var4.getPort(), (String) (var5), var4.getHostName(), param0 ^ -25436);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1.type() == java.net.Proxy.Type.SOCKS) {
                      var5 = new java.net.Socket(param1);
                      ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_e, this.field_c)));
                      stackIn_14_0 = var5;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
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
            stackIn_27_0 = (RuntimeException) (var3_ref);

            stackIn_27_1 = new StringBuilder().append("r.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.net.Socket) ((Object) stackIn_14_0);
            } else {
              return stackIn_24_0;
            }
          }
        }
    }

    r() {
        this.field_n = java.net.ProxySelector.getDefault();
    }

    final static void a(boolean param0, boolean param1) {
        if (!(!jc.a(2))) {
            param1 = false;
        }
        ah.a(param1, -127);
        if (param0) {
            return;
        }
        li.e(0);
    }

    final static int a(gi param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = param0.field_p;
            var5 = (CharSequence) ((Object) param1);
            var4 = km.a(-38, var5);
            param0.a(var4.length, 32768);
            param0.field_p = param0.field_p + ob.field_r.a(param0.field_p, param0.field_t, param2 ^ 115, var4, param2, var4.length);
            stackIn_1_0 = -var3_int + param0.field_p;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("r.O(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_q = "All games";
        field_i = "EMP";
        field_m = "Create your own free Jagex account";
        field_p = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_o = "Try again";
        field_k = "Private";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

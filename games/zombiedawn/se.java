/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class se extends qg {
    private java.net.ProxySelector field_k;
    static int field_o;
    static cg field_n;
    static vo field_m;
    static String field_i;
    static rh field_l;
    static of field_j;

    private final java.net.Socket a(String param0, String param1, byte param2, int param3) throws IOException {
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
        String var15 = null;
        var12 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param1, param3);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param0 == null) {
                var6.write(("CONNECT " + this.field_e + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_e + ":" + this.field_b + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            var6.flush();
            if (param2 >= 43) {
              L2: {
                var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
                var14 = var7.readLine();
                if (var14 == null) {
                  break L2;
                } else {
                  L3: {
                    if (var14.startsWith("HTTP/1.0 200")) {
                      break L3;
                    } else {
                      if (!var14.startsWith("HTTP/1.1 200")) {
                        L4: {
                          if (var14.startsWith("HTTP/1.0 407")) {
                            break L4;
                          } else {
                            if (var14.startsWith("HTTP/1.1 407")) {
                              break L4;
                            } else {
                              break L2;
                            }
                          }
                        }
                        var9 = 0;
                        var8 = var7.readLine();
                        var10 = "proxy-authenticate: ";
                        L5: while (true) {
                          L6: {
                            if (var8 == null) {
                              break L6;
                            } else {
                              if (var9 >= 50) {
                                break L6;
                              } else {
                                if (!var8.toLowerCase().startsWith(var10)) {
                                  var8 = var7.readLine();
                                  var9++;
                                  continue L5;
                                } else {
                                  L7: {
                                    var15 = var8.substring(var10.length()).trim();
                                    var8 = var15;
                                    var11 = var15.indexOf(' ');
                                    if ((var11 ^ -1) != 0) {
                                      var8 = var15.substring(0, var11);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  throw new dg(var8);
                                }
                              }
                            }
                          }
                          throw new dg("");
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

            stackIn_30_1 = new StringBuilder().append("se.D(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ',' + param3 + ')');
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

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              rk.a((byte) -65, (java.awt.Component) ((Object) param1));
              pg.a((java.awt.Component) ((Object) param1), (byte) 66);
              if (param0 == 20922) {
                break L1;
              } else {
                se.a(true, -64, 43, 72, 83, -44, -98, -34, -52, -65, -84, 97, -14, 56, 78, 114);
                break L1;
              }
            }
            if (jl.field_u == null) {
              break L0;
            } else {
              jl.field_u.a(param0 + 3012, (java.awt.Component) ((Object) param1));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("se.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public static void c(int param0) {
        field_m = null;
        field_j = null;
        if (param0 != 32) {
          se.c(-126);
          field_n = null;
          field_l = null;
          field_i = null;
          return;
        } else {
          field_n = null;
          field_l = null;
          field_i = null;
          return;
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = ZombieDawn.field_J;
        if (param13 < param4) {
          if (param4 < param14) {
            pi.a(param11, param10, bi.field_c, param6, (byte) -104, param7, param12, param8, param2, param1, param15, param14, param9, param3, param5, param13, param4);
            if (param0) {
              field_m = (vo) null;
              return;
            } else {
              return;
            }
          } else {
            if (param13 >= param14) {
              pi.a(param5, param1, bi.field_c, param11, (byte) -104, param12, param9, param3, param8, param15, param10, param4, param7, param2, param6, param14, param13);
              if (param0) {
                field_m = (vo) null;
                return;
              } else {
                return;
              }
            } else {
              pi.a(param5, param15, bi.field_c, param6, (byte) -104, param12, param7, param3, param2, param1, param10, param4, param9, param8, param11, param13, param14);
              if (param0) {
                field_m = (vo) null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param13 < param14) {
            pi.a(param11, param1, bi.field_c, param5, (byte) -104, param7, param9, param8, param3, param10, param15, param14, param12, param2, param6, param4, param13);
            if (!param0) {
              return;
            } else {
              field_m = (vo) null;
              return;
            }
          } else {
            if (param4 >= param14) {
              pi.a(param6, param10, bi.field_c, param11, (byte) -104, param9, param12, param2, param8, param15, param1, param13, param7, param3, param5, param14, param4);
              if (!param0) {
                return;
              } else {
                field_m = (vo) null;
                return;
              }
            } else {
              pi.a(param6, param15, bi.field_c, param5, (byte) -104, param9, param7, param2, param3, param10, param1, param13, param12, param8, param11, param4, param14);
              if (param0) {
                field_m = (vo) null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    se() {
        this.field_k = java.net.ProxySelector.getDefault();
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
        java.net.Socket stackIn_24_0 = null;
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
        dg var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = ZombieDawn.field_J;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-444 != (this.field_b ^ -1)) {
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
              stackIn_9_0 = this.field_k;

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
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + this.field_e));
              stackIn_12_0 = this.field_k;

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
          return this.b(16076);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        if (!param0) {
          var8 = var6_array;
          var9 = 0;
          L5: while (true) {
            if (var8.length <= var9) {
              if (var7 != null) {
                throw se.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
              } else {
                return this.b(16076);
              }
            } else {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                L6: {
                  var12 = this.a(var11, (byte) -27);
                  if (var12 != null) {
                    stackIn_24_0 = (java.net.Socket) (var12);
                    decompiledRegionSelector0 = 1;
                    break L6;
                  } else {
                    var9++;
                    decompiledRegionSelector0 = 0;
                    break L6;
                  }
                }
              } catch (dg decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var12_ref = (dg) (Object) decompiledCaughtException;
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
                return stackIn_24_0;
              }
            }
          }
        } else {
          return (java.net.Socket) null;
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        java.net.Socket stackIn_15_0 = null;
        Object stackIn_19_0 = null;
        java.net.Socket stackIn_23_0 = null;
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
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param0.type() != java.net.Proxy.Type.HTTP) {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param0);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_e, this.field_b)));
                    stackIn_19_0 = var5;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1 != -27) {
                      stackIn_23_0 = (java.net.Socket) null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return null;
                    }
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
                          if (!((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            break L2;
                          } else {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_e + "/"), "https"}));
                            var5 = var12 + ": " + var13;
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
                  stackIn_15_0 = this.a((String) (var5), var4.getHostName(), (byte) 69, var4.getPort());
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.b(param1 ^ -16087);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3_ref);

            stackIn_27_1 = new StringBuilder().append("se.E(");

            if (param0 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.net.Socket) ((Object) stackIn_19_0);
              } else {
                return stackIn_23_0;
              }
            }
          }
        }
    }

    static {
        field_o = 10;
        field_n = new cg(15, 0, 1, 0);
        field_i = "PER MONTH";
        field_m = new vo();
        field_l = new rh();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

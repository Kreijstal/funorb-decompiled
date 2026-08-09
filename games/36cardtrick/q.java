/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class q extends tl {
    static int field_i;
    static java.awt.Frame field_g;
    static int[] field_h;
    private java.net.ProxySelector field_e;
    static String field_f;

    final static void a(String[] args, int param1, int param2, String param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        String[] var6 = null;
        var5 = Main.field_T;
        try {
          L0: {
            L1: {
              ei.field_d = gg.field_b;
              if (param2 == -106) {
                break L1;
              } else {
                field_g = (java.awt.Frame) null;
                break L1;
              }
            }
            L2: {
              if (255 == param1) {
                L3: {
                  stackIn_11_0 = -1;

                  if ((ok.field_c ^ -1) <= -14) {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = 0;
                    break L3;
                  } else {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = 1;
                    break L3;
                  }
                }
                tf.field_s = il.a(stackIn_12_0, stackIn_12_1 != 0);
                var6 = (String[]) null;
                wh.a((String[]) null, 61);
                break L2;
              } else {
                L4: {
                  if (param1 < 100) {
                    break L4;
                  } else {
                    if (-106 <= (param1 ^ -1)) {
                      var4 = args;
                      wh.a(var4, param2 + 167);
                      tf.field_s = pf.a(param2 ^ 28, args);
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                tf.field_s = nc.a(param1, 0, param3);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("q.H(");

            if (args == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    private final java.net.Socket a(String param0, int param1, String param2, int param3) throws IOException {
        java.net.Socket stackIn_9_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
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
        var12 = Main.field_T;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param0, param3);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param2 == null) {
                var6.write(("CONNECT " + this.field_c + ":" + this.field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_c + ":" + this.field_d + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              var14 = var7.readLine();
              if (var14 == null) {
                break L2;
              } else {
                L3: {
                  if (var14.startsWith("HTTP/1.0 200")) {
                    break L3;
                  } else {
                    if (var14.startsWith("HTTP/1.1 200")) {
                      break L3;
                    } else {
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
                              if (var8.toLowerCase().startsWith(var10)) {
                                L7: {
                                  var15 = var8.substring(var10.length()).trim();
                                  var8 = var15;
                                  var11 = var15.indexOf(' ');
                                  if (0 != (var11 ^ -1)) {
                                    var8 = var15.substring(0, var11);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                throw new vc(var8);
                              } else {
                                var8 = var7.readLine();
                                var9++;
                                continue L5;
                              }
                            }
                          }
                        }
                        throw new vc("");
                      }
                    }
                  }
                }
                stackIn_9_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var9 = 72 % ((-23 - param1) / 59);
            var6.close();
            var7.close();
            var13.close();
            stackIn_25_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("q.G(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_25_0);
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
        vc var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = Main.field_T;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-444 != (this.field_d ^ -1)) {
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
              stackIn_9_0 = this.field_e;

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
              stackIn_12_0 = this.field_e;

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
          return this.a(true);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        if (param0 == -26042) {
          var7 = null;
          var8 = var6_array;
          var9 = 0;
          L5: while (true) {
            if (var9 >= var8.length) {
              if (var7 != null) {
                throw q.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
              } else {
                return this.a(true);
              }
            } else {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                L6: {
                  var12 = this.a(var11, -72);
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
              } catch (vc decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var12_ref = (vc) (Object) decompiledCaughtException;
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

    q() {
        this.field_e = java.net.ProxySelector.getDefault();
    }

    public static void c(int param0) {
        field_h = null;
        field_g = null;
        field_f = null;
        if (param0 != 0) {
            String var2 = (String) null;
            q.a((String[]) null, 35, -19, (String) null);
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
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
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        java.net.Socket stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var7_ref = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var5 = -79 % ((3 - param1) / 39);
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
                          if (((Boolean) (var10.invoke(var9, new Object[]{}))).booleanValue()) {
                            var11 = var7.getDeclaredMethod("getHeaderName", new Class[]{});
                            var11.setAccessible(true);
                            var12 = var15.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var12.setAccessible(true);
                            var13 = (String) (var11.invoke(var9, new Object[]{}));
                            var14 = (String) (var12.invoke(var9, new Object[]{new java.net.URL("https://" + this.field_c + "/"), "https"}));
                            var6 = var13 + ": " + var14;
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
                      var7_ref = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  stackIn_20_0 = this.a(var4.getHostName(), -90, (String) (var6), var4.getPort());
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var6 = new java.net.Socket(param0);
                    ((java.net.Socket) (var6)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_c, this.field_d)));
                    stackIn_10_0 = var6;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.a(true);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3_ref);

            stackIn_24_1 = new StringBuilder().append("q.I(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.net.Socket) ((Object) stackIn_10_0);
            } else {
              return stackIn_20_0;
            }
          }
        }
    }

    final static void a(int[] param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, byte[] param8, int param9, int param10, int param11, int param12) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = Main.field_T;
        try {
          L0: {
            if (param1 > 114) {
              var13_int = -param4;
              L1: while (true) {
                if (-1 >= (var13_int ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var14 = 65536 + -param7 >> -1458828504;
                  var15 = param7 >> 217358696;
                  var16 = ((param2 & 65280) * var15 + (65280 & param12) * var14 & 16711680) + ((param2 & 16711935) * var15 + (param12 & 16711935) * var14 & -16711936) >>> 1693269128;
                  var17 = -param5;
                  L2: while (true) {
                    if (0 <= var17) {
                      param7 = param7 + param6;
                      param9 = param9 + param11;
                      param3 = param3 + param10;
                      var13_int++;
                      continue L1;
                    } else {
                      L3: {
                        incrementValue$0 = param9;
                        param9++;
                        if (0 != param8[incrementValue$0]) {
                          incrementValue$1 = param3;
                          param3++;
                          param0[incrementValue$1] = var16;
                          break L3;
                        } else {
                          param3++;
                          break L3;
                        }
                      }
                      var17++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var13 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var13);

            stackIn_15_1 = new StringBuilder().append("q.F(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_f = "Log in";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

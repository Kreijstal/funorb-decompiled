/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class pa extends li {
    static boolean field_j;
    private java.net.ProxySelector field_g;
    static String field_i;
    static String field_h;

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        ob var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            L1: {
              var9 = new ob(param0);
              var3 = var9.j(-56);
              var4 = var9.a(16711680);
              if (param1 == 200) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            L2: {
              if (-1 < (var4 ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (-1 == (ho.field_b ^ -1)) {
                    break L3;
                  } else {
                    if (ho.field_b < var4) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var3 == 0) {
                  var13 = new byte[var4];
                  var11 = var13;
                  var5 = var11;
                  var9.a(var4, 0, 17469032, var13);
                  stackIn_23_0 = (byte[]) (var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var5_int = var9.a(16711680);
                    if (0 > var5_int) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 == (ho.field_b ^ -1)) {
                          break L5;
                        } else {
                          if (var5_int <= ho.field_b) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var12 = new byte[var5_int];
                        var10 = var12;
                        var6 = var10;
                        if (var3 != 1) {
                          var7 = ig.field_a;
                          synchronized (var7) {
                            L7: {
                              ig.field_a.a(var12, var9, 5591);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          lb.a(var12, var5_int, param0, var4, 9);
                          break L6;
                        }
                      }
                      stackIn_21_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("pa.I(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0;
        } else {
          return stackIn_23_0;
        }
    }

    private final java.net.Socket a(int param0, String param1, String param2, int param3) throws IOException {
        java.net.Socket stackIn_6_0 = null;
        java.net.Socket stackIn_13_0 = null;
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
        String var15 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param2, param0);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param1 == null) {
                var6.write(("CONNECT " + this.field_f + ":" + this.field_a + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_f + ":" + this.field_a + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            var6.flush();
            if (param3 == 0) {
              L2: {
                var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
                var14 = var7.readLine();
                if (var14 != null) {
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
                              if (50 <= var9) {
                                break L6;
                              } else {
                                if (var8.toLowerCase().startsWith(var10)) {
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
                                  throw new lg(var8);
                                } else {
                                  var8 = var7.readLine();
                                  var9++;
                                  continue L5;
                                }
                              }
                            }
                          }
                          throw new lg("");
                        }
                      }
                    }
                  }
                  stackIn_13_0 = (java.net.Socket) (var13);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              var6.close();
              var7.close();
              var13.close();
              stackIn_29_0 = null;
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
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("pa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_29_0);
          }
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (!(-12 != (gm.field_i ^ -1))) {
            lg.a(param0 + -9242);
        }
        if (param0 != 9242) {
            return;
        }
        try {
            jp.a(pc.field_r, il.field_cb, (byte) 121, oi.field_f);
            mc.a(47, 0, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "pa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_i = null;
        field_h = null;
        if (param0 != 1) {
            field_h = (String) null;
        }
    }

    final static void a(String[] args, sq param1, byte param2) {
        String[] var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var7 = args;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                L2: {
                  if (param2 < -116) {
                    break L2;
                  } else {
                    field_h = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = var7[var4];
                param1.a(var5, (byte) -47);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("pa.E(");

            if (args == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    pa() {
        this.field_g = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        java.net.Socket stackIn_17_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
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
              L1: {
                if (param0 < -47) {
                  break L1;
                } else {
                  field_j = true;
                  break L1;
                }
              }
              var3 = param1.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param1.type() != java.net.Proxy.Type.HTTP) {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param1);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_f, this.field_a)));
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
                        if (var8 == null) {
                          break L3;
                        } else {
                          var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var9.setAccessible(true);
                          if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_f + "/"), "https"}));
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
                  stackIn_17_0 = this.a(var4.getPort(), (String) (var5), var4.getHostName(), 0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = this.a(124);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3_ref);

            stackIn_25_1 = new StringBuilder().append("pa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
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

    final static String a(ln param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_y != null) {
                stackIn_3_0 = param0.field_y.field_s;
                break L1;
              } else {
                stackIn_3_0 = 8421504;
                break L1;
              }
            }
            L2: {
              var2_int = stackIn_3_0;
              if (param1 <= -3) {
                break L2;
              } else {
                field_h = (String) null;
                break L2;
              }
            }
            stackIn_6_0 = re.a("<col=<%0>>" + param0.field_I + "</col>", 4371, new String[]{Integer.toString(var2_int, 16)});
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("pa.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

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
        lg var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = ShatteredPlansClient.field_F ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if ((this.field_a ^ -1) != -444) {
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

              if (var5 == 0) {
                stackIn_9_0 = (java.net.ProxySelector) ((Object) stackIn_8_0);
                stackIn_9_1 = null;
                stackIn_9_2 = null;
                stackIn_9_3 = (StringBuilder) ((Object) stackIn_8_3);
                stackIn_9_4 = "http";
                break L3;
              } else {
                stackIn_9_0 = (java.net.ProxySelector) ((Object) stackIn_8_0);
                stackIn_9_1 = null;
                stackIn_9_2 = null;
                stackIn_9_3 = (StringBuilder) ((Object) stackIn_8_3);
                stackIn_9_4 = "https";
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + this.field_f));
              stackIn_11_0 = this.field_g;

              stackIn_11_1 = null;

              stackIn_11_2 = null;

              stackIn_11_3 = new StringBuilder();

              if (var5 != 0) {
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
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + this.field_f));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(119);
        }
        L5: {
          var3.addAll((Collection) ((Object) var4));
          var6_array = var3.toArray();
          var7 = null;
          var8 = var6_array;
          var9 = 0;
          if (param0 == -10463) {
            break L5;
          } else {
            field_j = false;
            break L5;
          }
        }
        L6: while (true) {
          if (var8.length <= var9) {
            if (var7 != null) {
              throw pa.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return this.a(param0 ^ -10411);
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              L7: {
                var12 = this.a(-73, var11);
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
            } catch (lg decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var12_ref = (lg) (Object) decompiledCaughtException;
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
              return stackIn_22_0;
            }
          }
        }
    }

    final static void c(int param0) {
        float var3 = (float)di.field_m / 1000.0f + 0.15000000596046448f;
        int var1 = -(int)(Math.sin((double)var3) * 200.0);
        int var2 = -200 + (int)(Math.cos((double)var3) * 200.0);
        va.field_e.f(var1, var2);
        var2 = -(di.field_m * 40 / 800) + 200;
        var1 = -62;
        he.field_h.c(var1, -60 + var2, 256);
        var2 = 300 + -(150 * di.field_m / 800);
        var1 = -120;
        we.field_f.c(var1, -60 + var2, 256);
        var1 = -62;
        var2 = -(di.field_m * 40 / 800) + 200;
        q.field_Cb.f(var1, var2);
        var1 = -120;
        var2 = -(di.field_m * 150 / 800) + 300;
        mm.field_o.f(var1, var2);
        var2 = di.field_m * 240 / 800 + 20;
        var1 = 0;
        ch.field_c.f(var1, var2);
        gf.d(0, ch.field_c.field_p + var2, 640, 480, 0);
        if (param0 != 8421504) {
            ln var4 = (ln) null;
            pa.a((ln) null, 30);
        }
    }

    static {
        field_i = "System name";
        field_h = "Accept";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

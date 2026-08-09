/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class cd extends jg {
    static dm field_l;
    static int field_j;
    private java.net.ProxySelector field_k;
    static ck field_i;
    static rh field_m;

    final static void a(byte param0) {
        int var2;
        L0: {
          var2 = Geoblox.field_C;
          if (param0 > 75) {
            break L0;
          } else {
            field_m = (rh) null;
            break L0;
          }
        }
        L1: {
          if ((c.field_ab ^ -1) == -5) {
            ec.field_c = hi.field_F;
            mf.field_a = ca.field_g;
            break L1;
          } else {
            if (c.field_ab == 1) {
              mf.field_a = fe.field_j;
              ec.field_c = ne.field_b;
              break L1;
            } else {
              if (c.field_ab == 3) {
                ec.field_c = sl.field_c;
                mf.field_a = sg.field_e;
                break L1;
              } else {
                if (c.field_ab != 0) {
                  if (6 != c.field_ab) {
                    if (c.field_ab != 5) {
                      if (2 != c.field_ab) {
                        break L1;
                      } else {
                        mf.field_a = pi.field_O;
                        ec.field_c = lb.field_d;
                        break L1;
                      }
                    } else {
                      mf.field_a = th.field_f;
                      ec.field_c = hd.field_H;
                      break L1;
                    }
                  } else {
                    ec.field_c = fl.field_a;
                    mf.field_a = df.field_a;
                    break L1;
                  }
                } else {
                  mf.field_a = bj.field_r;
                  ec.field_c = kj.field_E;
                  break L1;
                }
              }
            }
          }
        }
    }

    public static void e(int param0) {
        if (param0 != 1353) {
            return;
        }
        field_m = null;
        field_l = null;
        field_i = null;
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_12_0 = null;
        java.net.Socket stackIn_22_0 = null;
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
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              L1: {
                var3 = param0.address();
                if (param1 == -18) {
                  break L1;
                } else {
                  field_l = (dm) null;
                  break L1;
                }
              }
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param0.type() == java.net.Proxy.Type.HTTP) {
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
                          if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_e + "/"), "https"}));
                            var5 = var12 + ": " + var13;
                            break L3;
                          } else {
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
                  stackIn_22_0 = this.a((byte) -60, (String) (var5), var4.getPort(), var4.getHostName());
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param0);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_e, this.field_b)));
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
              stackIn_2_0 = this.a(1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3_ref);

            stackIn_25_1 = new StringBuilder().append("cd.L(");

            if (param0 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_12_0);
          } else {
            return stackIn_22_0;
          }
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        java.net.URISyntaxException uRISyntaxException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        Object[] var6 = null;
        Object var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        int var13 = 0;
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
        java.net.Socket stackIn_21_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        bd var12_ref = null;
        IOException var12_ref2 = null;
        L0: {
          var13 = Geoblox.field_C;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (-444 != (this.field_b ^ -1)) {
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
              stackIn_8_0 = this.field_k;

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
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + this.field_e));
              stackIn_11_0 = this.field_k;

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
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + this.field_e));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          uRISyntaxException = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(1);
        }
        var3.addAll((Collection) ((Object) var4));
        var6 = var3.toArray();
        var7 = null;
        var8 = var6;
        var9 = param0;
        L5: while (true) {
          if (var9 >= var8.length) {
            if (var7 != null) {
              throw cd.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return this.a(1);
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              L6: {
                var12 = this.a(var11, (byte) -18);
                if (var12 != null) {
                  stackIn_21_0 = (java.net.Socket) (var12);
                  decompiledRegionSelector0 = 1;
                  break L6;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              }
            } catch (bd decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var12_ref = (bd) (Object) decompiledCaughtException;
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
              return stackIn_21_0;
            }
          }
        }
    }

    private final java.net.Socket a(byte param0, String param1, int param2, String param3) throws IOException {
        java.net.Socket stackIn_10_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        java.net.Socket var14 = null;
        String var15 = null;
        var13 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var14 = new java.net.Socket(param3, param2);
              var14.setSoTimeout(10000);
              var6 = var14.getOutputStream();
              if (param1 == null) {
                var6.write(("CONNECT " + this.field_e + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_e + ":" + this.field_b + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var14.getInputStream())));
              var9 = -22 % ((3 - param0) / 53);
              var8 = var7.readLine();
              if (var8 != null) {
                L3: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L3;
                  } else {
                    if (var8.startsWith("HTTP/1.1 200")) {
                      break L3;
                    } else {
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
                      var10 = 0;
                      var11 = "proxy-authenticate: ";
                      var8 = var11;
                      var8 = var11;
                      var8 = var7.readLine();
                      L5: while (true) {
                        L6: {
                          if (var8 == null) {
                            break L6;
                          } else {
                            if (-51 >= (var10 ^ -1)) {
                              break L6;
                            } else {
                              if (!var8.toLowerCase().startsWith(var11)) {
                                var8 = var7.readLine();
                                var10++;
                                continue L5;
                              } else {
                                L7: {
                                  var15 = var8.substring(var11.length()).trim();
                                  var8 = var15;
                                  var8 = var15;
                                  var8 = var15;
                                  var12 = var15.indexOf(' ');
                                  if (0 == (var12 ^ -1)) {
                                    break L7;
                                  } else {
                                    var8 = var15.substring(0, var12);
                                    break L7;
                                  }
                                }
                                throw new bd(var8);
                              }
                            }
                          }
                        }
                        throw new bd("");
                      }
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
            var6.close();
            var7.close();
            var14.close();
            stackIn_24_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("cd.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_24_0);
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    cd() {
        this.field_k = java.net.ProxySelector.getDefault();
    }

    static {
        field_j = -1;
        field_l = new dm(270, 70);
        field_i = new ck(8, 0, 4, 1);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

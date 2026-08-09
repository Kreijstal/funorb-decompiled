/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ra extends oa {
    private java.net.ProxySelector field_g;
    static String field_f;

    private final java.net.Socket a(String param0, String param1, boolean param2, int param3) throws IOException {
        java.net.Socket stackIn_10_0 = null;
        java.net.Socket stackIn_26_0 = null;
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
        var12 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param0, param3);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param1 != null) {
                var6.write(("CONNECT " + this.field_d + ":" + this.field_e + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_d + ":" + this.field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              var14 = var7.readLine();
              if (var14 != null) {
                L3: {
                  if (var14.startsWith("HTTP/1.0 200")) {
                    break L3;
                  } else {
                    if (!var14.startsWith("HTTP/1.1 200")) {
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
                      var10 = "proxy-authenticate: ";
                      var8 = var7.readLine();
                      L5: while (true) {
                        L6: {
                          if (var8 == null) {
                            break L6;
                          } else {
                            if (50 <= var9) {
                              break L6;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var9++;
                                var8 = var7.readLine();
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
                                throw new tk(var8);
                              }
                            }
                          }
                        }
                        throw new tk("");
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_10_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L2;
              }
            }
            if (param2) {
              var6.close();
              var7.close();
              var13.close();
              stackIn_28_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_26_0 = (java.net.Socket) null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("ra.A(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_26_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_28_0);
          }
        }
    }

    final java.net.Socket b(int param0) throws IOException {
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
        tk var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = Bounce.field_N;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (443 != this.field_e) {
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
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + this.field_d));
              stackIn_12_0 = this.field_g;

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
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + this.field_d));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(false);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        if (param0 == -19314) {
          var9 = 0;
          L5: while (true) {
            if (var9 >= var8.length) {
              if (var7 == null) {
                return this.a(false);
              } else {
                throw ra.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
              }
            } else {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                L6: {
                  var12 = this.a(var11, (byte) -37);
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
              } catch (tk decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var12_ref = (tk) (Object) decompiledCaughtException;
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

    final static void c(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = Bounce.field_N;
        try {
          L0: {
            var1 = qj.field_c;
            synchronized (var1) {
              L1: {
                L2: {
                  if (param0 == 28282) {
                    break L2;
                  } else {
                    field_f = (String) null;
                    break L2;
                  }
                }
                L3: {
                  oh.field_a = ec.field_bb;
                  ak.field_y = ak.field_y + 1;
                  if ((db.field_R ^ -1) > -1) {
                    var5 = 0;
                    var2 = var5;
                    L4: while (true) {
                      if (-113 >= (var5 ^ -1)) {
                        db.field_R = rj.field_g;
                        break L3;
                      } else {
                        ng.field_a[var5] = false;
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: while (true) {
                      if (rj.field_g == db.field_R) {
                        break L3;
                      } else {
                        var2 = di.field_b[rj.field_g];
                        rj.field_g = 127 & 1 + rj.field_g;
                        if (var2 >= 0) {
                          ng.field_a[var2] = true;
                          continue L5;
                        } else {
                          ng.field_a[var2 ^ -1] = false;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                ec.field_bb = Bounce.field_F;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1_ref), "ra.E(" + param0 + ')');
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        Object var5 = null;
        Class var6 = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        java.net.Socket stackIn_8_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var6_ref = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                if (param1 == -37) {
                  var4 = (java.net.InetSocketAddress) ((Object) var3);
                  if (param0.type() != java.net.Proxy.Type.HTTP) {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                      var5 = new java.net.Socket(param0);
                      ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_d, this.field_e)));
                      stackIn_22_0 = var5;
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
                              var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_d + "/"), "https"}));
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
                    stackIn_18_0 = this.a(var4.getHostName(), (String) (var5), true, var4.getPort());
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = (java.net.Socket) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.a(false);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3_ref);

            stackIn_26_1 = new StringBuilder().append("ra.C(");

            if (param0 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return (java.net.Socket) ((Object) stackIn_22_0);
              }
            }
          }
        }
    }

    ra() {
        this.field_g = java.net.ProxySelector.getDefault();
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 <= 109) {
            ra.b((byte) 102);
        }
    }

    static {
        field_f = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

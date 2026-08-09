/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class md extends rg {
    static im field_h;
    private java.net.ProxySelector field_c;
    static int field_j;
    static int field_g;
    static int field_f;
    static String[] field_e;
    static byte[][] field_i;
    static ki field_d;

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_12_0 = null;
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
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var13 = new java.net.Socket(param2, param1);
                var13.setSoTimeout(10000);
                var6 = var13.getOutputStream();
                if (param3 != null) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              var14 = var7.readLine();
              var8 = var14;
              var8 = var14;
              if (param0 == 0) {
                break L3;
              } else {
                field_d = (ki) null;
                break L3;
              }
            }
            L4: {
              if (var14 == null) {
                break L4;
              } else {
                L5: {
                  if (var14.startsWith("HTTP/1.0 200")) {
                    break L5;
                  } else {
                    if (!var14.startsWith("HTTP/1.1 200")) {
                      L6: {
                        if (var14.startsWith("HTTP/1.0 407")) {
                          break L6;
                        } else {
                          if (!var14.startsWith("HTTP/1.1 407")) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
                      var8 = var7.readLine();
                      L7: while (true) {
                        L8: {
                          if (var8 == null) {
                            break L8;
                          } else {
                            if (var9 >= 50) {
                              break L8;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var9++;
                                var8 = var7.readLine();
                                if (var12 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              } else {
                                L9: {
                                  var15 = var8.substring(var10.length()).trim();
                                  var8 = var15;
                                  var8 = var15;
                                  var8 = var15;
                                  var11 = var15.indexOf(' ');
                                  if (-1 == var11) {
                                    break L9;
                                  } else {
                                    var8 = var15.substring(0, var11);
                                    break L9;
                                  }
                                }
                                throw new bk(var8);
                              }
                            }
                          }
                        }
                        throw new bk("");
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackIn_12_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            stackIn_26_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("md.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_26_0);
        }
    }

    final static void a(byte param0) {
        fl.field_a = (byte[][]) null;
        jd.field_g = null;
        m.field_a = null;
        if (param0 >= -102) {
          md.d(89);
          vc.field_g = null;
          wc.field_a = null;
          wh.field_b = null;
          return;
        } else {
          vc.field_g = null;
          wc.field_a = null;
          wh.field_b = null;
          return;
        }
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_13_0 = null;
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
            if (param1.type() == java.net.Proxy.Type.DIRECT) {
              stackIn_3_0 = this.a(-5942);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = param1.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    md.d(31);
                    break L1;
                  }
                }
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param1.type() == java.net.Proxy.Type.HTTP) {
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
                  stackIn_22_0 = this.a(0, var4.getPort(), var4.getHostName(), (String) (var5));
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param1);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_b)));
                    stackIn_13_0 = var5;
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
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3_ref);

            stackIn_25_1 = new StringBuilder().append("md.A(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.net.Socket) ((Object) stackIn_13_0);
            } else {
              return stackIn_22_0;
            }
          }
        }
    }

    final static void c(int param0) {
        if (param0 != 32) {
            md.a((byte) -11);
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -20767) {
                break L1;
              } else {
                field_h = (im) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= param1.length()) {
                    break L4;
                  } else {
                    var3 = param1.charAt(var2_int);
                    stackOut_5_0 = cd.a(param0 + 20676, (char) var3);
                    stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0) {
                          break L5;
                        } else {
                          if (hm.a(-20625, (char) var3)) {
                            break L5;
                          } else {
                            stackIn_9_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_12_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("md.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static void b(byte param0) {
        int var1;
        if (-11 != (hi.field_k ^ -1)) {
          if (ld.a((byte) 85)) {
            mf.field_d = true;
            var1 = -81 / ((param0 - -21) / 46);
            return;
          } else {
            dk.a(-108);
            hi.field_k = 11;
            mf.field_d = true;
            var1 = -81 / ((param0 - -21) / 46);
            return;
          }
        } else {
          dk.a(-108);
          hi.field_k = 11;
          mf.field_d = true;
          var1 = -81 / ((param0 - -21) / 46);
          return;
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
        java.net.Socket stackIn_23_0 = null;
        Object stackIn_28_0 = null;
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
        bk var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = OrbDefence.field_D ? 1 : 0;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_b != 443) {
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
              stackIn_9_0 = this.field_c;

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
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + this.field_a));
              stackIn_12_0 = this.field_c;

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
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + this.field_a));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(param0 + -5942);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        var9 = param0;
        L5: while (true) {
          L6: {
            L7: {
              if (var8.length <= var9) {
                break L7;
              } else {
                var10 = var8[var9];
                var11 = (java.net.Proxy) (var10);
                try {
                  L8: {
                    var12 = this.a(param0 + -1, var11);
                    stackIn_28_0 = null;

                    if (var13 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L8;
                    } else {
                      if (stackIn_28_0 != var12) {
                        stackIn_23_0 = (java.net.Socket) (var12);
                        decompiledRegionSelector0 = 2;
                        break L8;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L8;
                      }
                    }
                  }
                } catch (bk decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L9: {
                    var12_ref = (bk) (Object) decompiledCaughtException;
                    var7 = var12_ref;
                    decompiledRegionSelector0 = 1;
                    break L9;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L10: {
                    var12_ref2 = (IOException) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L10;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  break L6;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    var9++;
                    if (var13 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  } else {
                    return stackIn_23_0;
                  }
                }
              }
            }
            stackIn_28_0 = null;
            break L6;
          }
          if (stackIn_28_0 != var7) {
            throw md.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
          } else {
            return this.a(-5942);
          }
        }
    }

    md() {
        this.field_c = java.net.ProxySelector.getDefault();
    }

    public static void d(int param0) {
        field_h = null;
        field_e = null;
        field_i = (byte[][]) null;
        if (param0 > -71) {
          field_e = (String[]) null;
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    static {
        field_g = 0;
        field_e = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_h = new im();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

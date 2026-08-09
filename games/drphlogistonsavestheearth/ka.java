/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ka extends hj {
    static sd field_q;
    private java.net.ProxySelector field_k;
    static String[] field_p;
    static int[] field_m;
    static String[] field_j;
    static int field_o;
    static int field_n;
    static boolean field_r;
    static String field_l;

    final java.net.Socket a(boolean param0) throws IOException {
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
        qk var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (this.field_d != 443) {
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
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + this.field_b));
              stackIn_11_0 = this.field_k;

              stackIn_11_1 = null;

              stackIn_11_2 = null;

              stackIn_11_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "https";
                break L4;
              } else {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "http";
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + this.field_b));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b(31619);
        }
        var3.addAll((Collection) ((Object) var4));
        if (param0) {
          var6_array = var3.toArray();
          var7 = null;
          var8 = var6_array;
          var9 = 0;
          L5: while (true) {
            if (var8.length <= var9) {
              if (var7 == null) {
                return this.b(31619);
              } else {
                throw ka.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
              }
            } else {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                L6: {
                  var12 = this.a(-39, var11);
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
              } catch (qk decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var12_ref = (qk) (Object) decompiledCaughtException;
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

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        java.net.InetSocketAddress var5 = null;
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
        java.net.Socket stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var7_ref = null;
        try {
          L0: {
            if (param1.type() != java.net.Proxy.Type.DIRECT) {
              var4 = -7 % ((7 - param0) / 35);
              var3 = param1.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var5 = (java.net.InetSocketAddress) ((Object) var3);
                if (param1.type() == java.net.Proxy.Type.HTTP) {
                  var6 = null;
                  try {
                    L1: {
                      L2: {
                        var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var7 = var15;
                        var8 = var15.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var8.setAccessible(true);
                        var9 = var8.invoke((Object) null, new Object[]{var5.getHostName(), new Integer(var5.getPort())});
                        if (var9 != null) {
                          var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var10.setAccessible(true);
                          if (!((Boolean) (var10.invoke(var9, new Object[]{}))).booleanValue()) {
                            break L2;
                          } else {
                            var11 = var7.getDeclaredMethod("getHeaderName", new Class[]{});
                            var11.setAccessible(true);
                            var12 = var15.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var12.setAccessible(true);
                            var13 = (String) (var11.invoke(var9, new Object[]{}));
                            var14 = (String) (var12.invoke(var9, new Object[]{new java.net.URL("https://" + this.field_b + "/"), "https"}));
                            var6 = var13 + ": " + var14;
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
                  stackIn_19_0 = this.a(var5.getPort(), var5.getHostName(), 0, (String) (var6));
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var6 = new java.net.Socket(param1);
                    ((java.net.Socket) (var6)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_d)));
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
              stackIn_2_0 = this.b(31619);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("ka.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
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
              return stackIn_19_0;
            }
          }
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < 160) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                var6 = we.field_a;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if ((param0 ^ -1) == (var4 ^ -1)) {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              }
            }
            L5: {
              if (param1 == 8192) {
                break L5;
              } else {
                ka.c(110);
                break L5;
              }
            }
            stackIn_21_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "ka.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        bg var4 = null;
        vb var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var4 = (bg) ((Object) gf.field_h.h(-11151));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 < -23) {
                    break L2;
                  } else {
                    field_m = (int[]) null;
                    break L2;
                  }
                }
                var5 = (vb) ((Object) je.field_i.h(-11151));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    mh.a(param0, (byte) 52, var5);
                    var5 = (vb) ((Object) je.field_i.e(0));
                    continue L3;
                  }
                }
              } else {
                jc.a(param0, var4, -125);
                var4 = (bg) ((Object) gf.field_h.e(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "ka.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 >= -17) {
            ka.c(-43);
        }
        sd.a((byte) -124);
        sf.a(4, 11649);
    }

    ka() {
        this.field_k = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(int param0, String param1, int param2, String param3) throws IOException {
        java.net.Socket stackIn_9_0 = null;
        java.net.Socket stackIn_25_0 = null;
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
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param1, param0);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param3 != null) {
                var6.write(("CONNECT " + this.field_b + ":" + this.field_d + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_b + ":" + this.field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
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
                          if (var8.startsWith("HTTP/1.1 407")) {
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
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var9++;
                                var8 = var7.readLine();
                                continue L5;
                              } else {
                                L7: {
                                  var14 = var8.substring(var10.length()).trim();
                                  var8 = var14;
                                  var11 = var14.indexOf(' ');
                                  if (var11 != -1) {
                                    var8 = var14.substring(0, var11);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                throw new qk(var8);
                              }
                            }
                          }
                        }
                        throw new qk("");
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_9_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var6.close();
            if (param2 == 0) {
              var7.close();
              var13.close();
              stackIn_27_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_25_0 = (java.net.Socket) null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("ka.J(").append(param0).append(',');

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


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_27_0);
          }
        }
    }

    public static void c(int param0) {
        field_j = null;
        field_p = null;
        if (param0 != 26713) {
            return;
        }
        field_q = null;
        field_m = null;
        field_l = null;
    }

    static {
        field_p = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_m = new int[8192];
        field_q = new sd("usename");
        field_j = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_l = "Warning: if you quit, you will lose any game you are in the middle of!";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

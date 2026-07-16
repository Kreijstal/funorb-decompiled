/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class qk extends ug {
    static char[] field_k;
    static String field_j;
    static int field_m;
    static da field_h;
    static String field_o;
    static String field_n;
    private java.net.ProxySelector field_i;
    static o[] field_l;

    final java.net.Socket a(byte param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        cb var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_6_0 = 0;
        java.net.ProxySelector stackIn_8_0 = null;
        java.net.URI stackIn_8_1 = null;
        java.net.URI stackIn_8_2 = null;
        StringBuilder stackIn_8_3 = null;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        String stackIn_10_4 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        String stackIn_13_4 = null;
        java.net.Socket stackIn_24_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        java.net.ProxySelector stackOut_7_0 = null;
        java.net.URI stackOut_7_1 = null;
        java.net.URI stackOut_7_2 = null;
        StringBuilder stackOut_7_3 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        String stackOut_9_4 = null;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        String stackOut_8_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.Socket stackOut_23_0 = null;
        L0: {
          var13 = SolKnight.field_L ? 1 : 0;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((qk) this).field_b != 443) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var5 = stackIn_6_0;
        try {
          L2: {
            L3: {
              stackOut_7_0 = ((qk) this).field_i;
              stackOut_7_1 = null;
              stackOut_7_2 = null;
              stackOut_7_3 = new StringBuilder();
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              if (var5 == 0) {
                stackOut_9_0 = (java.net.ProxySelector) (Object) stackIn_9_0;
                stackOut_9_1 = null;
                stackOut_9_2 = null;
                stackOut_9_3 = (StringBuilder) (Object) stackIn_9_3;
                stackOut_9_4 = "http";
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                stackIn_10_4 = stackOut_9_4;
                break L3;
              } else {
                stackOut_8_0 = (java.net.ProxySelector) (Object) stackIn_8_0;
                stackOut_8_1 = null;
                stackOut_8_2 = null;
                stackOut_8_3 = (StringBuilder) (Object) stackIn_8_3;
                stackOut_8_4 = "https";
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                stackIn_10_4 = stackOut_8_4;
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + ((qk) this).field_c));
              stackOut_10_0 = ((qk) this).field_i;
              stackOut_10_1 = null;
              stackOut_10_2 = null;
              stackOut_10_3 = new StringBuilder();
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_12_3 = stackOut_10_3;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              stackIn_11_3 = stackOut_10_3;
              if (var5 != 0) {
                stackOut_12_0 = (java.net.ProxySelector) (Object) stackIn_12_0;
                stackOut_12_1 = null;
                stackOut_12_2 = null;
                stackOut_12_3 = (StringBuilder) (Object) stackIn_12_3;
                stackOut_12_4 = "http";
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                stackIn_13_4 = stackOut_12_4;
                break L4;
              } else {
                stackOut_11_0 = (java.net.ProxySelector) (Object) stackIn_11_0;
                stackOut_11_1 = null;
                stackOut_11_2 = null;
                stackOut_11_3 = (StringBuilder) (Object) stackIn_11_3;
                stackOut_11_4 = "https";
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                stackIn_13_4 = stackOut_11_4;
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + ((qk) this).field_c));
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((qk) this).a(-57);
        }
        L5: {
          boolean discarded$3 = var3.addAll((Collection) (Object) var4);
          var6_array = var3.toArray();
          var7 = null;
          if (param0 == -93) {
            break L5;
          } else {
            ((qk) this).field_i = null;
            break L5;
          }
        }
        var8_array = var6_array;
        var9 = 0;
        L6: while (true) {
          if (var8_array.length <= var9) {
            if (var7 != null) {
              throw qk.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return ((qk) this).a(param0 ^ -48);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                var12_ref2 = this.a(var11, 80);
                if (var12_ref2 != null) {
                  stackOut_23_0 = (java.net.Socket) var12_ref2;
                  stackIn_24_0 = stackOut_23_0;
                  decompiledRegionSelector0 = 1;
                  break L7;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L9: {
                var12_ref = (IOException) (Object) decompiledCaughtException;
                var9++;
                decompiledRegionSelector0 = 0;
                break L9;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var12 = (cb) (Object) decompiledCaughtException;
                var7 = (Object) (Object) var12;
                var9++;
                decompiledRegionSelector0 = 0;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue L6;
            } else {
              return stackIn_24_0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        sb.field_d = param0;
        int var3 = 89 / ((-62 - param2) / 40);
        vk.field_m = param1;
    }

    final static void e(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = SolKnight.field_L ? 1 : 0;
        hk.a();
        pj.field_H = 11;
        ud.field_i = new int[260];
        for (var1 = param0; -257 < (var1 ^ -1); var1++) {
            var2 = 15.0;
            ud.field_i[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
        }
        int var5 = 256;
        var1 = var5;
        while (var5 < ud.field_i.length) {
            ud.field_i[var5] = 255;
            var5++;
        }
    }

    final static void d(int param0) {
        if (param0 != 14995) {
            return;
        }
        if (!(dj.field_k != null)) {
            return;
        }
        nc.a((byte) 86, (java.awt.Canvas) (Object) dj.field_k);
        dj.field_k.a(-3680, wh.field_c);
        dj.field_k = null;
        if (fc.field_l != null) {
            fc.field_l.a(false);
        }
        dc.field_q.requestFocus();
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        if (param0 == null) {
          return false;
        } else {
          var3 = param0.length();
          if ((var3 ^ -1) > param2) {
            return false;
          } else {
            if ((var3 ^ -1) >= -13) {
              L0: {
                var4 = jg.a(param0, -2);
                if (var4 == null) {
                  break L0;
                } else {
                  if (-2 >= (var4.length() ^ -1)) {
                    L1: {
                      if (ck.a(var4.charAt(0), true)) {
                        break L1;
                      } else {
                        if (ck.a(var4.charAt(var4.length() - 1), true)) {
                          break L1;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L2: while (true) {
                            if (var6 >= param0.length()) {
                              L3: {
                                if ((var5 ^ -1) < -1) {
                                  stackOut_26_0 = 0;
                                  stackIn_27_0 = stackOut_26_0;
                                  break L3;
                                } else {
                                  stackOut_25_0 = 1;
                                  stackIn_27_0 = stackOut_25_0;
                                  break L3;
                                }
                              }
                              return stackIn_27_0 != 0;
                            } else {
                              L4: {
                                var7 = param0.charAt(var6);
                                if (!ck.a((char) var7, true)) {
                                  var5 = 0;
                                  break L4;
                                } else {
                                  var5++;
                                  break L4;
                                }
                              }
                              L5: {
                                if ((var5 ^ -1) > -3) {
                                  break L5;
                                } else {
                                  if (param1) {
                                    break L5;
                                  } else {
                                    return false;
                                  }
                                }
                              }
                              var6++;
                              continue L2;
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          }
        }
    }

    private final java.net.Socket a(int param0, String param1, String param2, int param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        L0: {
          var12 = SolKnight.field_L ? 1 : 0;
          var13 = new java.net.Socket(param2, param3);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param1 != null) {
            var6.write(("CONNECT " + ((qk) this).field_c + ":" + ((qk) this).field_b + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((qk) this).field_c + ":" + ((qk) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        var6.flush();
        var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
        if (param0 >= 72) {
          L1: {
            var8 = var7.readLine();
            if (var8 != null) {
              L2: {
                if (var8.startsWith("HTTP/1.0 200")) {
                  break L2;
                } else {
                  if (var8.startsWith("HTTP/1.1 200")) {
                    break L2;
                  } else {
                    L3: {
                      if (var8.startsWith("HTTP/1.0 407")) {
                        break L3;
                      } else {
                        if (!var8.startsWith("HTTP/1.1 407")) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = 0;
                    var8 = var7.readLine();
                    var10 = "proxy-authenticate: ";
                    var8 = var10;
                    var8 = var10;
                    L4: while (true) {
                      L5: {
                        if (var8 == null) {
                          break L5;
                        } else {
                          if (var9 >= 50) {
                            break L5;
                          } else {
                            if (var8.toLowerCase().startsWith(var10)) {
                              L6: {
                                var14 = var8.substring(var10.length()).trim();
                                var8 = var14;
                                var8 = var14;
                                var11 = var14.indexOf(' ');
                                if (0 == (var11 ^ -1)) {
                                  break L6;
                                } else {
                                  var8 = var14.substring(0, var11);
                                  break L6;
                                }
                              }
                              throw new cb(var8);
                            } else {
                              var8 = var7.readLine();
                              var9++;
                              continue L4;
                            }
                          }
                        }
                      }
                      throw new cb("");
                    }
                  }
                }
              }
              return var13;
            } else {
              break L1;
            }
          }
          var6.close();
          var7.close();
          var13.close();
          return null;
        } else {
          return null;
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void c(int param0) {
        field_o = null;
        field_n = null;
        field_j = null;
        field_h = null;
        if (param0 != -25904) {
            field_j = null;
        }
        field_l = null;
        field_k = null;
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.SocketAddress var3 = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        Object var5 = null;
        Exception var6 = null;
        Class var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        Throwable decompiledCaughtException = null;
        if (param0.type() != java.net.Proxy.Type.DIRECT) {
          L0: {
            var3 = param0.address();
            if (param1 > 73) {
              break L0;
            } else {
              qk.a(25, -30, 54);
              break L0;
            }
          }
          if ((Object) var3 instanceof java.net.InetSocketAddress) {
            var4_ref = (java.net.InetSocketAddress) (Object) var3;
            if (param0.type() == java.net.Proxy.Type.HTTP) {
              var5 = null;
              try {
                L1: {
                  L2: {
                    var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                    var6_ref = var14;
                    var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                    var7.setAccessible(true);
                    var8 = var7.invoke((Object) null, new Object[2]);
                    if (var8 == null) {
                      break L2;
                    } else {
                      var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                      var9.setAccessible(true);
                      if (!((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                        break L2;
                      } else {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (Object) (Object) (var12 + ": " + var13);
                        break L2;
                      }
                    }
                  }
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  break L3;
                }
              }
              return this.a(89, (String) var5, var4_ref.getHostName(), var4_ref.getPort());
            } else {
              if (param0.type() == java.net.Proxy.Type.SOCKS) {
                var5 = (Object) (Object) new java.net.Socket(param0);
                ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((qk) this).field_c, ((qk) this).field_b));
                return (java.net.Socket) var5;
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return ((qk) this).a(-63);
        }
    }

    qk() {
        ((qk) this).field_i = java.net.ProxySelector.getDefault();
    }

    final static void f(int param0) {
        ql.d(18962);
        h.a(param0, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new char[]{(char)91, (char)93, (char)35};
        field_j = "Cancel";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

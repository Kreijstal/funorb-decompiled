/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class qc extends hk {
    private java.net.ProxySelector field_g;
    static k field_e;
    static String field_f;

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        if (!param0) {
            qc.a(true);
        }
    }

    private final java.net.Socket a(byte param0, String param1, String param2, int param3) throws IOException {
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
        L0: {
          var12 = TrackController.field_F ? 1 : 0;
          var13 = new java.net.Socket(param2, param3);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param1 == null) {
            var6.write(("CONNECT " + ((qc) this).field_b + ":" + ((qc) this).field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((qc) this).field_b + ":" + ((qc) this).field_c + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        var6.flush();
        if (param0 <= -97) {
          L1: {
            var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var14 = var7.readLine();
            var8 = var14;
            if (var14 != null) {
              L2: {
                if (var14.startsWith("HTTP/1.0 200")) {
                  break L2;
                } else {
                  if (!var14.startsWith("HTTP/1.1 200")) {
                    L3: {
                      if (var14.startsWith("HTTP/1.0 407")) {
                        break L3;
                      } else {
                        if (var14.startsWith("HTTP/1.1 407")) {
                          break L3;
                        } else {
                          break L1;
                        }
                      }
                    }
                    var9 = 0;
                    var8 = var7.readLine();
                    var10 = "proxy-authenticate: ";
                    var8 = var10;
                    L4: while (true) {
                      L5: {
                        if (var8 == null) {
                          break L5;
                        } else {
                          if ((var9 ^ -1) <= -51) {
                            break L5;
                          } else {
                            if (var8.toLowerCase().startsWith(var10)) {
                              L6: {
                                var15 = var8.substring(var10.length()).trim();
                                var8 = var15;
                                var11 = var15.indexOf(' ');
                                if (-1 != var11) {
                                  var8 = var15.substring(0, var11);
                                  break L6;
                                } else {
                                  var8 = var15;
                                  break L6;
                                }
                              }
                              throw new dj(var8);
                            } else {
                              var9++;
                              var8 = var7.readLine();
                              continue L4;
                            }
                          }
                        }
                      }
                      throw new dj("");
                    }
                  } else {
                    break L2;
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

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var3 = TrackController.field_F ? 1 : 0;
          fe.field_L = fe.field_L + 1;
          if (param0 == g.field_y) {
            break L0;
          } else {
            L1: {
              if (!re.field_k) {
                if (fe.field_L >= bc.field_o) {
                  if (fe.field_L < cl.field_a + bc.field_o) {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_9_0 = stackOut_6_0;
                    break L1;
                  }
                } else {
                  stackOut_4_0 = 0;
                  stackIn_9_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_9_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_9_0;
              if (param0 != -1) {
                if (!re.field_k) {
                  if (var2 != 0) {
                    fe.field_L = bc.field_o;
                    break L2;
                  } else {
                    fe.field_L = 0;
                    break L2;
                  }
                } else {
                  fe.field_L = bc.field_o;
                  break L2;
                }
              } else {
                fe.field_L = 0;
                break L2;
              }
            }
            ha.field_z = kf.field_b;
            kj.field_o = fg.field_a;
            if (param0 == -1) {
              if (var2 == 0) {
                break L0;
              } else {
                re.field_k = true;
                break L0;
              }
            } else {
              re.field_k = false;
              break L0;
            }
          }
        }
        if (param1 == 20) {
          L3: {
            g.field_y = param0;
            if (re.field_k) {
              break L3;
            } else {
              if (fe.field_L >= bc.field_o) {
                break L3;
              } else {
                if (!mg.field_a) {
                  break L3;
                } else {
                  fe.field_L = 0;
                  kj.field_o = fg.field_a;
                  ha.field_z = kf.field_b;
                  break L3;
                }
              }
            }
          }
          L4: {
            if (!re.field_k) {
              break L4;
            } else {
              if (rk.field_Y == fe.field_L) {
                fe.field_L = 0;
                re.field_k = false;
                break L4;
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    qc() {
        ((qc) this).field_g = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket c(int param0) throws IOException {
        int var2 = 0;
        List var4 = null;
        List var5 = null;
        int var6 = 0;
        java.net.URISyntaxException var7 = null;
        Object[] var7_array = null;
        Object var8 = null;
        Object[] var9 = null;
        Object[] var9_array = null;
        int var10 = 0;
        Object var11 = null;
        java.net.Proxy var12 = null;
        dj var13 = null;
        IOException var13_ref = null;
        java.net.Socket var13_ref2 = null;
        int var14 = 0;
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
        java.net.Socket stackIn_22_0 = null;
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
        java.net.Socket stackOut_21_0 = null;
        L0: {
          var14 = TrackController.field_F ? 1 : 0;
          var2 = -56 / ((param0 - -2) / 36);
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((((qc) this).field_c ^ -1) != -444) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var6 = stackIn_6_0;
        try {
          L2: {
            L3: {
              stackOut_7_0 = ((qc) this).field_g;
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
              if (var6 == 0) {
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
              var4 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + ((qc) this).field_b));
              stackOut_10_0 = ((qc) this).field_g;
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
              if (var6 == 0) {
                stackOut_12_0 = (java.net.ProxySelector) (Object) stackIn_12_0;
                stackOut_12_1 = null;
                stackOut_12_2 = null;
                stackOut_12_3 = (StringBuilder) (Object) stackIn_12_3;
                stackOut_12_4 = "https";
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
                stackOut_11_4 = "http";
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                stackIn_13_4 = stackOut_11_4;
                break L4;
              }
            }
            var5 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + ((qc) this).field_b));
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((qc) this).b(0);
        }
        boolean discarded$3 = var4.addAll((Collection) (Object) var5);
        var7_array = var4.toArray();
        var8 = null;
        var9_array = var7_array;
        var10 = 0;
        L5: while (true) {
          if (var10 >= var9_array.length) {
            if (var8 != null) {
              throw qc.<RuntimeException>$cfr$sneakyThrow((Throwable) var8);
            } else {
              return ((qc) this).b(0);
            }
          } else {
            var11 = var9_array[var10];
            var12 = (java.net.Proxy) var11;
            try {
              L6: {
                var13_ref2 = this.a(var12, (byte) 66);
                if (var13_ref2 != null) {
                  stackOut_21_0 = (java.net.Socket) var13_ref2;
                  stackIn_22_0 = stackOut_21_0;
                  decompiledRegionSelector0 = 1;
                  break L6;
                } else {
                  var10++;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L8: {
                var13_ref = (IOException) (Object) decompiledCaughtException;
                var10++;
                decompiledRegionSelector0 = 0;
                break L8;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var13 = (dj) (Object) decompiledCaughtException;
                var8 = (Object) (Object) var13;
                var10++;
                decompiledRegionSelector0 = 0;
                break L7;
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

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param2)) {
            var4 += 4;
        }
        if (!(!param3)) {
            var4 += 2;
        }
        if (!(!param0)) {
            var4++;
        }
        if (param1 >= -59) {
            String discarded$0 = qc.a(true, (byte) -37, false, false);
        }
        return al.field_i[var4];
    }

    final static void b(int param0, byte param1) {
        if (param1 != -42) {
            field_f = null;
        }
        ra.field_v = param0;
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
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
        if (param0.type() == java.net.Proxy.Type.DIRECT) {
          return ((qc) this).b(0);
        } else {
          L0: {
            if (param1 == 66) {
              break L0;
            } else {
              ((qc) this).field_g = null;
              break L0;
            }
          }
          var3 = param0.address();
          if ((Object) var3 instanceof java.net.InetSocketAddress) {
            var4_ref = (java.net.InetSocketAddress) (Object) var3;
            if (param0.type() != java.net.Proxy.Type.HTTP) {
              if (param0.type() == java.net.Proxy.Type.SOCKS) {
                var5 = (Object) (Object) new java.net.Socket(param0);
                ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((qc) this).field_b, ((qc) this).field_c));
                return (java.net.Socket) var5;
              } else {
                return null;
              }
            } else {
              var5 = null;
              try {
                L1: {
                  L2: {
                    var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                    var6_ref = var14;
                    var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                    var7.setAccessible(true);
                    var8 = var7.invoke((Object) null, new Object[2]);
                    if (var8 != null) {
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
                    } else {
                      break L2;
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
              return this.a((byte) -124, (String) var5, var4_ref.getHostName(), var4_ref.getPort());
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

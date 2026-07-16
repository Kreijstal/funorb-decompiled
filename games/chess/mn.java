/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class mn extends wn {
    static p field_h;
    private java.net.ProxySelector field_k;
    static String field_l;
    static String field_i;
    static String field_j;

    final static double a(double param0, int param1) {
        if (param1 != 2278) {
            return 0.29154005432218943;
        }
        return li.field_d[65535 & (int)(32768.0 * param0 / 3.141592653589793)];
    }

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
        oa var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        Object var14 = null;
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
          var13 = Chess.field_G;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            String discarded$3 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (443 != ((mn) this).field_c) {
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
              stackOut_7_0 = ((mn) this).field_k;
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
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + ((mn) this).field_a));
              stackOut_10_0 = ((mn) this).field_k;
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
              if (var5 == 0) {
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
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + ((mn) this).field_a));
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((mn) this).a(true);
        }
        L5: {
          boolean discarded$4 = var3.addAll((Collection) (Object) var4);
          var6_array = var3.toArray();
          var7 = null;
          var8_array = var6_array;
          if (param0 <= -79) {
            break L5;
          } else {
            var14 = null;
            sa discarded$5 = mn.a((String) null, 40);
            break L5;
          }
        }
        var9 = 0;
        L6: while (true) {
          if (var9 >= var8_array.length) {
            if (var7 == null) {
              return ((mn) this).a(true);
            } else {
              throw mn.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                var12_ref2 = this.a((byte) 96, var11);
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
                var12 = (oa) (Object) decompiledCaughtException;
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

    final static sa a(String param0, int param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        sa var5 = null;
        Object var6 = null;
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length() != 0) {
              var2 = param0.indexOf('@');
              if ((var2 ^ -1) == 0) {
                return ef.field_j;
              } else {
                L1: {
                  if (param1 == 19525) {
                    break L1;
                  } else {
                    var6 = null;
                    String discarded$2 = mn.a((byte) 26, (ld) null);
                    break L1;
                  }
                }
                var3 = param0.substring(0, var2);
                var4 = param0.substring(1 + var2);
                var5 = qm.a((byte) -24, var3);
                if (var5 == null) {
                  return oj.a(var4, (byte) 86);
                } else {
                  return var5;
                }
              }
            } else {
              break L0;
            }
          }
        }
        return mh.field_a;
    }

    final static String a(byte param0, ld param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        L0: {
          var4 = Chess.field_G;
          var2 = null;
          if (param0 == -30) {
            break L0;
          } else {
            var5 = null;
            ve discarded$1 = mn.a(-100, (String) null);
            break L0;
          }
        }
        L1: {
          if (null != param1.field_o) {
            L2: {
              var6 = param1.field_o;
              var2 = (Object) (Object) var6;
              var2 = (Object) (Object) var6;
              if (1 != param1.field_h) {
                break L2;
              } else {
                var2 = (Object) (Object) ("<img=0>" + var6);
                break L2;
              }
            }
            if (2 != param1.field_h) {
              break L1;
            } else {
              var2 = (Object) (Object) ("<img=1>" + var2);
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          var3 = "";
          if (2 != param1.field_k) {
            L4: {
              if (param1.field_k != 0) {
                break L4;
              } else {
                if (dn.field_b) {
                  var3 = "[" + ja.field_c + "] ";
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param1.field_k != 1) {
                break L5;
              } else {
                var3 = "[" + oc.a(fb.field_D, new String[1], (byte) -122) + "] ";
                break L5;
              }
            }
            L6: {
              if ((param1.field_k ^ -1) != -5) {
                break L6;
              } else {
                if (kb.field_P == null) {
                  break L6;
                } else {
                  var3 = "[" + kb.field_P + "] ";
                  break L6;
                }
              }
            }
            L7: {
              if (-4 == (param1.field_k ^ -1)) {
                var3 = "[#" + param1.field_b + "] ";
                break L7;
              } else {
                break L7;
              }
            }
            if (param1.field_d) {
              break L3;
            } else {
              var3 = var3 + var2 + ": ";
              break L3;
            }
          } else {
            if (param1.field_d) {
              break L3;
            } else {
              L8: {
                if (0 != param1.field_e) {
                  break L8;
                } else {
                  if (-1 != (param1.field_q ^ -1)) {
                    break L8;
                  } else {
                    var3 = oc.a(vf.field_d, new String[1], (byte) -61);
                    break L3;
                  }
                }
              }
              var3 = oc.a(sa.field_d, new String[1], (byte) -54);
              break L3;
            }
          }
        }
        return var3;
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
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
          var12 = Chess.field_G;
          var13 = new java.net.Socket(param1, param2);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param0 == null) {
            var6.write(("CONNECT " + ((mn) this).field_a + ":" + ((mn) this).field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((mn) this).field_a + ":" + ((mn) this).field_c + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        L1: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
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
                  var10 = "proxy-authenticate: ";
                  var8 = var10;
                  var8 = var10;
                  var8 = var7.readLine();
                  L4: while (true) {
                    L5: {
                      if (var8 == null) {
                        break L5;
                      } else {
                        if (-51 >= (var9 ^ -1)) {
                          break L5;
                        } else {
                          if (!var8.toLowerCase().startsWith(var10)) {
                            var9++;
                            var8 = var7.readLine();
                            continue L4;
                          } else {
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
                            throw new oa(var8);
                          }
                        }
                      }
                    }
                    throw new oa("");
                  }
                }
              }
            }
            return var13;
          } else {
            break L1;
          }
        }
        L7: {
          if (param3 == 25748) {
            break L7;
          } else {
            field_i = null;
            break L7;
          }
        }
        var6.close();
        var7.close();
        var13.close();
        return null;
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_i = null;
        field_h = null;
        if (param0 != 32768) {
            Object var2 = null;
            String discarded$0 = mn.a((byte) -7, (ld) null);
        }
    }

    final static ve a(int param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = Chess.field_G;
        if (null != bf.field_M) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var6 = (CharSequence) (Object) param1;
              var2 = ad.a(var6, param0 + param0);
              if (var2 != null) {
                var3 = (ve) (Object) bf.field_M.a((long)var2.hashCode(), param0 ^ -3001);
                L0: while (true) {
                  if (var3 != null) {
                    var7 = (CharSequence) (Object) var3.field_Fb;
                    var4 = ad.a(var7, -2);
                    if (var4.equals((Object) (Object) var2)) {
                      return var3;
                    } else {
                      var3 = (ve) (Object) bf.field_M.b(true);
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
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
        if (param1.type() != java.net.Proxy.Type.DIRECT) {
          L0: {
            if (param0 == 96) {
              break L0;
            } else {
              field_h = null;
              break L0;
            }
          }
          var3 = param1.address();
          if ((Object) var3 instanceof java.net.InetSocketAddress) {
            var4_ref = (java.net.InetSocketAddress) (Object) var3;
            if (param1.type() == java.net.Proxy.Type.HTTP) {
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
                      if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (Object) (Object) (var12 + ": " + var13);
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
                  var6 = (Exception) (Object) decompiledCaughtException;
                  break L3;
                }
              }
              return this.a((String) var5, var4_ref.getHostName(), var4_ref.getPort(), param0 + 25652);
            } else {
              if (param1.type() == java.net.Proxy.Type.SOCKS) {
                var5 = (Object) (Object) new java.net.Socket(param1);
                ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((mn) this).field_a, ((mn) this).field_c));
                return (java.net.Socket) var5;
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return ((mn) this).a(true);
        }
    }

    mn() {
        ((mn) this).field_k = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Show game chat from my friends";
        field_h = new p(256);
        field_i = "Month";
        field_j = "Real-life threats";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

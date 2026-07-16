/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class dq extends av {
    static int field_f;
    private java.net.ProxySelector field_g;
    static boolean field_e;
    static String field_h;

    final static void a(int param0, int param1) {
        gn var2 = null;
        int var3 = 0;
        mp var4 = null;
        var3 = Kickabout.field_G;
        if (param0 == -1) {
          var4 = (mp) (Object) le.field_d.g(24009);
          L0: while (true) {
            if (var4 == null) {
              var2 = ci.field_f.g(24009);
              L1: while (true) {
                if (var2 != null) {
                  pt.a(true, param1);
                  var2 = ci.field_f.c(33);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              aa.a((byte) 20, param1, var4);
              var4 = (mp) (Object) le.field_d.c(33);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            dq.a(true);
            field_h = null;
            return;
        }
        field_h = null;
    }

    final static int a(byte param0, int param1, Random param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if ((param1 ^ -1) < -1) {
          if (rf.a(param1, 16)) {
            return (int)((long)param1 * (4294967295L & (long)param2.nextInt()) >> 1252478560);
          } else {
            var3 = -2147483648 + -(int)(4294967296L % (long)param1);
            L0: while (true) {
              var4 = param2.nextInt();
              if (var4 < var3) {
                var5 = -40 / ((param0 - 25) / 54);
                return ct.a(-68, var4, param1);
              } else {
                continue L0;
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final static void a(bu param0, java.awt.Frame param1, int param2) {
        wu var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        L0: while (true) {
          var3 = param0.a((byte) -106, param1);
          L1: while (true) {
            if ((var3.field_a ^ -1) != -1) {
              if (-2 == (var3.field_a ^ -1)) {
                param1.setVisible(false);
                if (param2 == 0) {
                  param1.dispose();
                  return;
                } else {
                  field_h = null;
                  param1.dispose();
                  return;
                }
              } else {
                aj.a(100L, 1);
                continue L0;
              }
            } else {
              aj.a(10L, 1);
              continue L1;
            }
          }
        }
    }

    final java.net.Socket a(int param0) throws IOException {
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
        lw var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_5_0 = 0;
        java.net.ProxySelector stackIn_7_0 = null;
        java.net.URI stackIn_7_1 = null;
        java.net.URI stackIn_7_2 = null;
        StringBuilder stackIn_7_3 = null;
        java.net.ProxySelector stackIn_8_0 = null;
        java.net.URI stackIn_8_1 = null;
        java.net.URI stackIn_8_2 = null;
        StringBuilder stackIn_8_3 = null;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        String stackIn_9_4 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        String stackIn_12_4 = null;
        java.net.Socket stackIn_23_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        java.net.ProxySelector stackOut_6_0 = null;
        java.net.URI stackOut_6_1 = null;
        java.net.URI stackOut_6_2 = null;
        StringBuilder stackOut_6_3 = null;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        String stackOut_8_4 = null;
        java.net.ProxySelector stackOut_7_0 = null;
        java.net.URI stackOut_7_1 = null;
        java.net.URI stackOut_7_2 = null;
        StringBuilder stackOut_7_3 = null;
        String stackOut_7_4 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.Socket stackOut_22_0 = null;
        L0: {
          var13 = Kickabout.field_G;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (443 != ((dq) this).field_a) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var5 = stackIn_5_0;
        try {
          L2: {
            L3: {
              stackOut_6_0 = ((dq) this).field_g;
              stackOut_6_1 = null;
              stackOut_6_2 = null;
              stackOut_6_3 = new StringBuilder();
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              if (var5 != 0) {
                stackOut_8_0 = (java.net.ProxySelector) (Object) stackIn_8_0;
                stackOut_8_1 = null;
                stackOut_8_2 = null;
                stackOut_8_3 = (StringBuilder) (Object) stackIn_8_3;
                stackOut_8_4 = "https";
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                break L3;
              } else {
                stackOut_7_0 = (java.net.ProxySelector) (Object) stackIn_7_0;
                stackOut_7_1 = null;
                stackOut_7_2 = null;
                stackOut_7_3 = (StringBuilder) (Object) stackIn_7_3;
                stackOut_7_4 = "http";
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + ((dq) this).field_c));
              stackOut_9_0 = ((dq) this).field_g;
              stackOut_9_1 = null;
              stackOut_9_2 = null;
              stackOut_9_3 = new StringBuilder();
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              stackIn_11_3 = stackOut_9_3;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              stackIn_10_3 = stackOut_9_3;
              if (var5 == 0) {
                stackOut_11_0 = (java.net.ProxySelector) (Object) stackIn_11_0;
                stackOut_11_1 = null;
                stackOut_11_2 = null;
                stackOut_11_3 = (StringBuilder) (Object) stackIn_11_3;
                stackOut_11_4 = "https";
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                stackIn_12_4 = stackOut_11_4;
                break L4;
              } else {
                stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                stackOut_10_1 = null;
                stackOut_10_2 = null;
                stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                stackOut_10_4 = "http";
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                stackIn_12_4 = stackOut_10_4;
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + ((dq) this).field_c));
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((dq) this).c(16080938);
        }
        L5: {
          boolean discarded$3 = var3.addAll((Collection) (Object) var4);
          var6_array = var3.toArray();
          var7 = null;
          if (param0 == 1) {
            break L5;
          } else {
            field_h = null;
            break L5;
          }
        }
        var8_array = var6_array;
        var9 = 0;
        L6: while (true) {
          if (var8_array.length <= var9) {
            if (var7 != null) {
              throw dq.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return ((dq) this).c(16080938);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                var12_ref2 = this.a(true, var11);
                if (var12_ref2 != null) {
                  stackOut_22_0 = (java.net.Socket) var12_ref2;
                  stackIn_23_0 = stackOut_22_0;
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
                var12 = (lw) (Object) decompiledCaughtException;
                var7 = (Object) (Object) var12;
                var9++;
                decompiledRegionSelector0 = 0;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue L6;
            } else {
              return stackIn_23_0;
            }
          }
        }
    }

    private final java.net.Socket a(boolean param0, java.net.Proxy param1) throws IOException {
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
          var3 = param1.address();
          if ((Object) var3 instanceof java.net.InetSocketAddress) {
            if (param0) {
              var4_ref = (java.net.InetSocketAddress) (Object) var3;
              if (param1.type() != java.net.Proxy.Type.HTTP) {
                if (param1.type() != java.net.Proxy.Type.SOCKS) {
                  return null;
                } else {
                  var5 = (Object) (Object) new java.net.Socket(param1);
                  ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((dq) this).field_c, ((dq) this).field_a));
                  return (java.net.Socket) var5;
                }
              } else {
                var5 = null;
                try {
                  L0: {
                    L1: {
                      var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                      var6_ref = var14;
                      var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                      var7.setAccessible(true);
                      var8 = var7.invoke((Object) null, new Object[2]);
                      if (var8 == null) {
                        break L1;
                      } else {
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
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    break L0;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    break L2;
                  }
                }
                return this.a((byte) 125, var4_ref.getPort(), (String) var5, var4_ref.getHostName());
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return ((dq) this).c(16080938);
        }
    }

    private final java.net.Socket a(byte param0, int param1, String param2, String param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        BufferedReader var15 = null;
        String var17 = null;
        String var34 = null;
        BufferedReader var35 = null;
        String var36 = null;
        String var43 = null;
        String var44 = null;
        var12 = Kickabout.field_G;
        var13 = new java.net.Socket(param3, param1);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param2 == null) {
          var6.write(("CONNECT " + ((dq) this).field_c + ":" + ((dq) this).field_a + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          var35 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var7 = var35;
          var8 = var35.readLine();
          if (var8 != null) {
            L0: {
              if (var8.startsWith("HTTP/1.0 200")) {
                break L0;
              } else {
                if (var8.startsWith("HTTP/1.1 200")) {
                  break L0;
                } else {
                  L1: {
                    if (var8.startsWith("HTTP/1.0 407")) {
                      var9 = 0;
                      var8 = var35.readLine();
                      var10 = "proxy-authenticate: ";
                      break L1;
                    } else {
                      if (var8.startsWith("HTTP/1.1 407")) {
                        var9 = 0;
                        var8 = var35.readLine();
                        var10 = "proxy-authenticate: ";
                        var8 = var10;
                        var8 = var10;
                        break L1;
                      } else {
                        L2: {
                          if (param0 >= 88) {
                            break L2;
                          } else {
                            field_h = null;
                            break L2;
                          }
                        }
                        var6.close();
                        var35.close();
                        var13.close();
                        return null;
                      }
                    }
                  }
                  L3: while (true) {
                    L4: {
                      if (var8 == null) {
                        break L4;
                      } else {
                        if (-51 >= (var9 ^ -1)) {
                          break L4;
                        } else {
                          if (!var8.toLowerCase().startsWith(var10)) {
                            var8 = var35.readLine();
                            var9++;
                            continue L3;
                          } else {
                            L5: {
                              var36 = var8.substring(var10.length()).trim();
                              var8 = var36;
                              var8 = var36;
                              var11 = var36.indexOf(' ');
                              if ((var11 ^ -1) == 0) {
                                break L5;
                              } else {
                                var8 = var36.substring(0, var11);
                                break L5;
                              }
                            }
                            throw new lw(var8);
                          }
                        }
                      }
                    }
                    throw new lw("");
                  }
                }
              }
            }
            return var13;
          } else {
            L6: {
              if (param0 >= 88) {
                break L6;
              } else {
                field_h = null;
                break L6;
              }
            }
            var6.close();
            var35.close();
            var13.close();
            return null;
          }
        } else {
          var6.write(("CONNECT " + ((dq) this).field_c + ":" + ((dq) this).field_a + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          var15 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var7 = var15;
          var8 = var15.readLine();
          var17 = var8;
          var43 = var17;
          var8 = var43;
          var44 = var8;
          var43 = var8;
          var17 = var43;
          var43 = var17;
          var8 = var43;
          var44 = var8;
          if (var8 != null) {
            if (!var8.startsWith("HTTP/1.0 200")) {
              if (!var8.startsWith("HTTP/1.1 200")) {
                L7: {
                  if (var8.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var8 = var15.readLine();
                    var10 = "proxy-authenticate: ";
                    break L7;
                  } else {
                    if (var8.startsWith("HTTP/1.1 407")) {
                      var9 = 0;
                      var8 = var15.readLine();
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
                      break L7;
                    } else {
                      L8: {
                        if (param0 >= 88) {
                          break L8;
                        } else {
                          field_h = null;
                          break L8;
                        }
                      }
                      var6.close();
                      var15.close();
                      var13.close();
                      return null;
                    }
                  }
                }
                L9: while (true) {
                  if (var8 != null) {
                    if (-51 < (var9 ^ -1)) {
                      if (!var8.toLowerCase().startsWith(var10)) {
                        var8 = var15.readLine();
                        var9++;
                        continue L9;
                      } else {
                        L10: {
                          var34 = var8.substring(var10.length()).trim();
                          var8 = var34;
                          var8 = var34;
                          var11 = var34.indexOf(' ');
                          if ((var11 ^ -1) == 0) {
                            break L10;
                          } else {
                            var8 = var34.substring(0, var11);
                            break L10;
                          }
                        }
                        throw new lw(var8);
                      }
                    } else {
                      throw new lw("");
                    }
                  } else {
                    throw new lw("");
                  }
                }
              } else {
                return var13;
              }
            } else {
              return var13;
            }
          } else {
            L11: {
              if (param0 >= 88) {
                break L11;
              } else {
                field_h = null;
                break L11;
              }
            }
            var6.close();
            var15.close();
            var13.close();
            return null;
          }
        }
    }

    dq() {
        ((dq) this).field_g = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_h = "You have 1 unread message!";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

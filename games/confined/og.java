/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.Socket;
import java.net.ProxySelector;
import java.net.URI;

final class og extends n {
    static float field_h;
    static double[] field_g;
    private java.net.ProxySelector field_j;
    static bi field_f;
    static e field_i;

    public static void d(int param0) {
        int var1 = 13 / ((param0 - -72) / 34);
        field_f = null;
        field_g = null;
        field_i = null;
    }

    final static boolean a(int param0, char param1) {
        if (param0 == -96) {
          if (!Character.isISOControl(param1)) {
            if (ld.a((byte) -21, param1)) {
              return true;
            } else {
              L0: {
                if (param1 == 45) {
                  break L0;
                } else {
                  if (param1 == 160) {
                    break L0;
                  } else {
                    if (param1 == 32) {
                      break L0;
                    } else {
                      if (param1 == 95) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_g = null;
          if (!Character.isISOControl(param1)) {
            if (ld.a((byte) -21, param1)) {
              return true;
            } else {
              if (param1 != 45) {
                if (param1 != 160) {
                  L1: {
                    if (param1 == 32) {
                      break L1;
                    } else {
                      if (param1 == 95) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                  return true;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
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
        java.net.Socket stackIn_9_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_8_0 = null;
        Object stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var12 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param0, param2);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param1 == null) {
                var6.write(("CONNECT " + ((og) this).field_b + ":" + ((og) this).field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + ((og) this).field_b + ":" + ((og) this).field_c + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var14 = var7.readLine();
              var8 = var14;
              if (var14 == null) {
                break L2;
              } else {
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
                      var8 = var10;
                      var8 = var7.readLine();
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
                                  if (var11 != -1) {
                                    var8 = var15.substring(0, var11);
                                    break L7;
                                  } else {
                                    var8 = var15;
                                    break L7;
                                  }
                                }
                                throw new kk(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                continue L5;
                              }
                            }
                          }
                        }
                        throw new kk("");
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_8_0 = (java.net.Socket) var13;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            stackOut_24_0 = null;
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("og.J(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 44 + 0 + 41);
        }
        return (java.net.Socket) (Object) stackIn_25_0;
    }

    final java.net.Socket b(int param0) throws IOException {
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
        kk var12 = null;
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
        java.net.Socket stackIn_23_0 = null;
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
        java.net.Socket stackOut_22_0 = null;
        L0: {
          var13 = Confined.field_J ? 1 : 0;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (443 != ((og) this).field_c) {
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
              stackOut_7_0 = ((og) this).field_j;
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
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + ((og) this).field_b));
              stackOut_10_0 = ((og) this).field_j;
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
            L5: {
              var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + ((og) this).field_b));
              if (param0 == -22176) {
                break L5;
              } else {
                og.a(false);
                break L5;
              }
            }
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((og) this).c(param0 ^ 30609);
        }
        boolean discarded$3 = var3.addAll((Collection) (Object) var4);
        var6_array = var3.toArray();
        var7 = null;
        var8_array = var6_array;
        var9 = 0;
        L6: while (true) {
          if (var8_array.length <= var9) {
            if (var7 != null) {
              throw og.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return ((og) this).c(param0 ^ 30609);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                var12_ref2 = this.a(param0 ^ 22172, var11);
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
                var12 = (kk) (Object) decompiledCaughtException;
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

    final static jg e(int param0) {
        return (jg) (Object) new q();
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        RuntimeException var3 = null;
        java.net.SocketAddress var3_ref = null;
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
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_13_0 = null;
        java.net.Socket stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        java.net.Socket stackOut_2_0 = null;
        java.net.Socket stackOut_22_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (param1.type() == java.net.Proxy.Type.DIRECT) {
              stackOut_2_0 = ((og) this).c(param0 ^ 8461);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 == -4) {
                  break L1;
                } else {
                  jb discarded$1 = og.a(true, (byte) 97);
                  break L1;
                }
              }
              var3_ref = param1.address();
              if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                if (param1.type() == java.net.Proxy.Type.HTTP) {
                  var5 = null;
                  try {
                    L2: {
                      L3: {
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
                      var6 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  stackOut_22_0 = this.a(var4_ref.getHostName(), (String) var5, var4_ref.getPort(), 0);
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = (Object) (Object) new java.net.Socket(param1);
                    ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((og) this).field_b, ((og) this).field_c));
                    stackOut_12_0 = var5;
                    stackIn_13_0 = stackOut_12_0;
                    return (java.net.Socket) (Object) stackIn_13_0;
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("og.G(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_23_0;
    }

    final static jb a(boolean param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jb var12 = null;
        bd var15 = null;
        bd var16 = null;
        bd var17 = null;
        bd var18 = null;
        bd var19 = null;
        bd var20 = null;
        bd var21 = null;
        bd var22 = null;
        bd var23 = null;
        bd var24 = null;
        bd var25 = null;
        bd var26 = null;
        bd var27 = null;
        bd var28 = null;
        bd var29 = null;
        bd var30 = null;
        bd var31 = null;
        bd var32 = null;
        bd var33 = null;
        jb stackIn_1_0 = null;
        jb stackIn_2_0 = null;
        jb stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        jb stackOut_0_0 = null;
        jb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        jb stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var9 = Confined.field_J ? 1 : 0;
          var12 = new jb(11);
          stackOut_0_0 = (jb) var12;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (jb) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (jb) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_a = stackIn_3_1 != 0;
        if (param0) {
          L1: {
            var12.a((byte) -78, new bd(14, tn.field_C, (ok) (Object) pn.field_a));
            if (!param0) {
              var12.a((byte) -116, new bd(2, mk.field_k, (ok) (Object) pn.field_a));
              var12.a((byte) -53, new bd(3, ea.field_e, (ok) (Object) pn.field_a));
              var12.a((byte) -80, new bd(4, ef.field_ub, (ok) (Object) pn.field_a));
              break L1;
            } else {
              if (of.field_a) {
                break L1;
              } else {
                if (null != qn.field_v.field_K) {
                  break L1;
                } else {
                  L2: {
                    var12.a((byte) -71, new bd(2, mk.field_k, (ok) (Object) pn.field_a));
                    var15 = new bd(5, qa.field_e, (ok) (Object) pn.field_a);
                    var16 = new bd(6, cc.field_p, (ok) (Object) pn.field_a);
                    var5 = var15.field_f;
                    if (var16.field_f <= var5) {
                      break L2;
                    } else {
                      var5 = var16.field_f;
                      break L2;
                    }
                  }
                  var16.field_f = var5;
                  var15.field_f = var5;
                  var12.a((byte) -70, var15);
                  var12.a((byte) -87, var16);
                  break L1;
                }
              }
            }
          }
          L3: {
            var17 = new bd(7, rb.field_h, (ok) (Object) pn.field_a);
            var18 = new bd(8, mg.field_d, (ok) (Object) pn.field_a);
            var19 = new bd(9, pm.field_u, (ok) (Object) pn.field_a);
            var6 = var17.field_f;
            if (var6 < var18.field_f) {
              var6 = var18.field_f;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var19.field_f <= var6) {
              break L4;
            } else {
              var6 = var19.field_f;
              break L4;
            }
          }
          L5: {
            var19.field_f = var6;
            var18.field_f = var6;
            var17.field_f = var6;
            var12.a((byte) -52, var17);
            var12.a((byte) -115, var18);
            var12.a((byte) -113, var19);
            var7 = 1;
            if (!param0) {
              break L5;
            } else {
              if (sg.field_x > 0) {
                break L5;
              } else {
                var7 = 0;
                break L5;
              }
            }
          }
          L6: {
            if (var7 != 0) {
              var12.a((byte) -61, new bd(10, nn.field_v, (ok) (Object) pn.field_a));
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (param1 == 55) {
              break L7;
            } else {
              boolean discarded$5 = og.a(38, '%');
              break L7;
            }
          }
          L8: {
            if (!param0) {
              var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
              var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
              var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
              break L8;
            } else {
              var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
              break L8;
            }
          }
          var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
          var12.a(var8, 30, 43, 320);
          var12.a(false, param1 + 26151, 0);
          var12.c(92);
          return var12;
        } else {
          var12.a((byte) -63, new bd(1, qj.field_d, (ok) (Object) pn.field_a));
          if (!param0) {
            L9: {
              var12.a((byte) -116, new bd(2, mk.field_k, (ok) (Object) pn.field_a));
              var12.a((byte) -53, new bd(3, ea.field_e, (ok) (Object) pn.field_a));
              var12.a((byte) -80, new bd(4, ef.field_ub, (ok) (Object) pn.field_a));
              var31 = new bd(7, rb.field_h, (ok) (Object) pn.field_a);
              var32 = new bd(8, mg.field_d, (ok) (Object) pn.field_a);
              var33 = new bd(9, pm.field_u, (ok) (Object) pn.field_a);
              var6 = var31.field_f;
              if (var6 < var32.field_f) {
                var6 = var32.field_f;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (var33.field_f <= var6) {
                break L10;
              } else {
                var6 = var33.field_f;
                break L10;
              }
            }
            L11: {
              var33.field_f = var6;
              var32.field_f = var6;
              var31.field_f = var6;
              var12.a((byte) -52, var31);
              var12.a((byte) -115, var32);
              var12.a((byte) -113, var33);
              var7 = 1;
              if (!param0) {
                break L11;
              } else {
                if (sg.field_x > 0) {
                  break L11;
                } else {
                  var7 = 0;
                  break L11;
                }
              }
            }
            L12: {
              if (var7 != 0) {
                var12.a((byte) -61, new bd(10, nn.field_v, (ok) (Object) pn.field_a));
                break L12;
              } else {
                break L12;
              }
            }
            if (param1 == 55) {
              if (param0) {
                var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                var12.a(var8, 30, 43, 320);
                var12.a(false, param1 + 26151, 0);
                var12.c(92);
                return var12;
              } else {
                var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                var12.a(var8, 30, 43, 320);
                var12.a(false, param1 + 26151, 0);
                var12.c(92);
                return var12;
              }
            } else {
              L13: {
                boolean discarded$6 = og.a(38, '%');
                if (!param0) {
                  var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                  var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                  var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                  break L13;
                } else {
                  var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                  break L13;
                }
              }
              var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
              var12.a(var8, 30, 43, 320);
              var12.a(false, param1 + 26151, 0);
              var12.c(92);
              return var12;
            }
          } else {
            if (!of.field_a) {
              if (null == qn.field_v.field_K) {
                L14: {
                  var12.a((byte) -71, new bd(2, mk.field_k, (ok) (Object) pn.field_a));
                  var26 = new bd(5, qa.field_e, (ok) (Object) pn.field_a);
                  var27 = new bd(6, cc.field_p, (ok) (Object) pn.field_a);
                  var5 = var26.field_f;
                  if (var27.field_f <= var5) {
                    break L14;
                  } else {
                    var5 = var27.field_f;
                    break L14;
                  }
                }
                L15: {
                  var27.field_f = var5;
                  var26.field_f = var5;
                  var12.a((byte) -70, var26);
                  var12.a((byte) -87, var27);
                  var28 = new bd(7, rb.field_h, (ok) (Object) pn.field_a);
                  var29 = new bd(8, mg.field_d, (ok) (Object) pn.field_a);
                  var30 = new bd(9, pm.field_u, (ok) (Object) pn.field_a);
                  var6 = var28.field_f;
                  if (var6 < var29.field_f) {
                    var6 = var29.field_f;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (var30.field_f <= var6) {
                    break L16;
                  } else {
                    var6 = var30.field_f;
                    break L16;
                  }
                }
                L17: {
                  var30.field_f = var6;
                  var29.field_f = var6;
                  var28.field_f = var6;
                  var12.a((byte) -52, var28);
                  var12.a((byte) -115, var29);
                  var12.a((byte) -113, var30);
                  var7 = 1;
                  if (!param0) {
                    break L17;
                  } else {
                    if (sg.field_x > 0) {
                      break L17;
                    } else {
                      var7 = 0;
                      break L17;
                    }
                  }
                }
                L18: {
                  if (var7 != 0) {
                    var12.a((byte) -61, new bd(10, nn.field_v, (ok) (Object) pn.field_a));
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (param1 == 55) {
                    break L19;
                  } else {
                    boolean discarded$7 = og.a(38, '%');
                    break L19;
                  }
                }
                if (!param0) {
                  var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                  var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                  var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                  var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                  var12.a(var8, 30, 43, 320);
                  var12.a(false, param1 + 26151, 0);
                  var12.c(92);
                  return var12;
                } else {
                  var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                  var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                  var12.a(var8, 30, 43, 320);
                  var12.a(false, param1 + 26151, 0);
                  var12.c(92);
                  return var12;
                }
              } else {
                L20: {
                  var23 = new bd(7, rb.field_h, (ok) (Object) pn.field_a);
                  var24 = new bd(8, mg.field_d, (ok) (Object) pn.field_a);
                  var25 = new bd(9, pm.field_u, (ok) (Object) pn.field_a);
                  var6 = var23.field_f;
                  if (var6 < var24.field_f) {
                    var6 = var24.field_f;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var25.field_f <= var6) {
                    break L21;
                  } else {
                    var6 = var25.field_f;
                    break L21;
                  }
                }
                L22: {
                  var25.field_f = var6;
                  var24.field_f = var6;
                  var23.field_f = var6;
                  var12.a((byte) -52, var23);
                  var12.a((byte) -115, var24);
                  var12.a((byte) -113, var25);
                  var7 = 1;
                  if (!param0) {
                    break L22;
                  } else {
                    if (sg.field_x > 0) {
                      break L22;
                    } else {
                      var7 = 0;
                      break L22;
                    }
                  }
                }
                L23: {
                  if (var7 != 0) {
                    var12.a((byte) -61, new bd(10, nn.field_v, (ok) (Object) pn.field_a));
                    break L23;
                  } else {
                    break L23;
                  }
                }
                if (param1 == 55) {
                  if (param0) {
                    var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                    var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                    var12.a(var8, 30, 43, 320);
                    var12.a(false, param1 + 26151, 0);
                    var12.c(92);
                    return var12;
                  } else {
                    var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                    var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                    var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                    var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                    var12.a(var8, 30, 43, 320);
                    var12.a(false, param1 + 26151, 0);
                    var12.c(92);
                    return var12;
                  }
                } else {
                  L24: {
                    boolean discarded$8 = og.a(38, '%');
                    if (!param0) {
                      var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                      var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                      var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                      break L24;
                    } else {
                      var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                      break L24;
                    }
                  }
                  var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                  var12.a(var8, 30, 43, 320);
                  var12.a(false, param1 + 26151, 0);
                  var12.c(92);
                  return var12;
                }
              }
            } else {
              L25: {
                var20 = new bd(7, rb.field_h, (ok) (Object) pn.field_a);
                var21 = new bd(8, mg.field_d, (ok) (Object) pn.field_a);
                var22 = new bd(9, pm.field_u, (ok) (Object) pn.field_a);
                var6 = var20.field_f;
                if (var6 < var21.field_f) {
                  var6 = var21.field_f;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (var22.field_f <= var6) {
                  break L26;
                } else {
                  var6 = var22.field_f;
                  break L26;
                }
              }
              L27: {
                var22.field_f = var6;
                var21.field_f = var6;
                var20.field_f = var6;
                var12.a((byte) -52, var20);
                var12.a((byte) -115, var21);
                var12.a((byte) -113, var22);
                var7 = 1;
                if (!param0) {
                  break L27;
                } else {
                  if (sg.field_x > 0) {
                    break L27;
                  } else {
                    var7 = 0;
                    break L27;
                  }
                }
              }
              L28: {
                if (var7 != 0) {
                  var12.a((byte) -61, new bd(10, nn.field_v, (ok) (Object) pn.field_a));
                  break L28;
                } else {
                  break L28;
                }
              }
              if (param1 == 55) {
                if (param0) {
                  var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                  var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                  var12.a(var8, 30, 43, 320);
                  var12.a(false, param1 + 26151, 0);
                  var12.c(92);
                  return var12;
                } else {
                  var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                  var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                  var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                  var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                  var12.a(var8, 30, 43, 320);
                  var12.a(false, param1 + 26151, 0);
                  var12.c(92);
                  return var12;
                }
              } else {
                L29: {
                  boolean discarded$9 = og.a(38, '%');
                  if (!param0) {
                    var12.a((byte) -119, new bd(11, li.field_n, (ok) (Object) pn.field_a));
                    var12.a((byte) -114, new bd(12, hh.field_b, (ok) (Object) pn.field_a));
                    var12.a((byte) -78, new bd(13, w.field_Q, (ok) (Object) pn.field_a));
                    break L29;
                  } else {
                    var12.a((byte) -59, new bd(15, hn.field_e, (ok) (Object) pn.field_a));
                    break L29;
                  }
                }
                var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
                var12.a(var8, 30, 43, 320);
                var12.a(false, param1 + 26151, 0);
                var12.c(92);
                return var12;
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        hb var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var1 = vh.field_a;
            L1: while (true) {
              if (!wi.a(false)) {
                break L0;
              } else {
                var1.b(true, 8);
                int fieldTemp$5 = var1.field_n + 1;
                var1.field_n = var1.field_n + 1;
                var2 = fieldTemp$5;
                md.a(var1, (byte) 126);
                vh.field_a.a(25859, -var2 + var1.field_n);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1_ref, "og.E(" + 0 + 41);
        }
    }

    final static void a(byte param0, mi param1, be param2, int param3) {
        mg.field_g = bg.a(12398) * param3 / 1000;
        pl.a(param1, true);
        if (param0 <= 115) {
            return;
        }
        try {
            ck.a(26613, param1);
            ee.a(param1, (byte) 70);
            pb.b(126);
            im.b((byte) -85);
            tg.field_H = -mg.field_g;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "og.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    og() {
        ((og) this).field_j = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new double[]{0.0, -4.0, 96.0};
        field_i = new e(11, 0, 1, 2);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class vb extends ca {
    static a field_l;
    static String field_m;
    static boolean field_j;
    private java.net.ProxySelector field_k;

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.SocketAddress var3 = null;
        int var4 = 0;
        Object var5 = null;
        java.net.InetSocketAddress var5_ref = null;
        Object var6 = null;
        Exception var7 = null;
        Class var7_ref = null;
        java.lang.reflect.Method var8 = null;
        Object var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        java.lang.reflect.Method var12 = null;
        String var13 = null;
        String var14 = null;
        Class var15 = null;
        Throwable decompiledCaughtException = null;
        if (param0.type() != java.net.Proxy.Type.DIRECT) {
          var3 = param0.address();
          if ((Object) var3 instanceof java.net.InetSocketAddress) {
            var4 = -26 / ((param1 - 53) / 54);
            var5_ref = (java.net.InetSocketAddress) (Object) var3;
            if (param0.type() != java.net.Proxy.Type.HTTP) {
              if (param0.type() != java.net.Proxy.Type.SOCKS) {
                return null;
              } else {
                var6 = (Object) (Object) new java.net.Socket(param0);
                ((java.net.Socket) var6).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((vb) this).field_a, ((vb) this).field_e));
                return (java.net.Socket) var6;
              }
            } else {
              var6 = null;
              try {
                L0: {
                  L1: {
                    var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                    var7_ref = var15;
                    var8 = var15.getDeclaredMethod("getProxyAuth", new Class[2]);
                    var8.setAccessible(true);
                    var9 = var8.invoke((Object) null, new Object[2]);
                    if (var9 != null) {
                      var10 = var7_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                      var10.setAccessible(true);
                      if (((Boolean) var10.invoke(var9, new Object[0])).booleanValue()) {
                        var11 = var7_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var11.setAccessible(true);
                        var12 = var15.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var12.setAccessible(true);
                        var13 = (String) var11.invoke(var9, new Object[0]);
                        var14 = (String) var12.invoke(var9, new Object[2]);
                        var6 = (Object) (Object) (var13 + ": " + var14);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var7 = (Exception) (Object) decompiledCaughtException;
                  break L2;
                }
              }
              return this.a((String) var6, var5_ref.getHostName(), -124, var5_ref.getPort());
            }
          } else {
            return null;
          }
        } else {
          return ((vb) this).a(-1);
        }
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
        bn var12 = null;
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
          var13 = TetraLink.field_J;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (-444 != (((vb) this).field_e ^ -1)) {
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
              stackOut_6_0 = ((vb) this).field_k;
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
              if (var5 == 0) {
                stackOut_8_0 = (java.net.ProxySelector) (Object) stackIn_8_0;
                stackOut_8_1 = null;
                stackOut_8_2 = null;
                stackOut_8_3 = (StringBuilder) (Object) stackIn_8_3;
                stackOut_8_4 = "http";
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
                stackOut_7_4 = "https";
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + ((vb) this).field_a));
              stackOut_9_0 = ((vb) this).field_k;
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
              if (var5 != 0) {
                stackOut_11_0 = (java.net.ProxySelector) (Object) stackIn_11_0;
                stackOut_11_1 = null;
                stackOut_11_2 = null;
                stackOut_11_3 = (StringBuilder) (Object) stackIn_11_3;
                stackOut_11_4 = "http";
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
                stackOut_10_4 = "https";
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                stackIn_12_4 = stackOut_10_4;
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + ((vb) this).field_a));
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((vb) this).a(-1);
        }
        L5: {
          boolean discarded$3 = var3.addAll((Collection) (Object) var4);
          var6_array = var3.toArray();
          var7 = null;
          if (param0 < -45) {
            break L5;
          } else {
            field_l = null;
            break L5;
          }
        }
        var8_array = var6_array;
        var9 = 0;
        L6: while (true) {
          if (var8_array.length <= var9) {
            if (var7 != null) {
              throw vb.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return ((vb) this).a(-1);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                var12_ref2 = this.a(var11, 111);
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
                var12 = (bn) (Object) decompiledCaughtException;
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

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        java.net.Socket var14 = null;
        BufferedReader var16 = null;
        String var17 = null;
        String var38 = null;
        BufferedReader var39 = null;
        String var40 = null;
        String var42 = null;
        String var43 = null;
        String var44 = null;
        String var45 = null;
        String var46 = null;
        String var49 = null;
        String var50 = null;
        var12 = TetraLink.field_J;
        var14 = new java.net.Socket(param1, param3);
        var14.setSoTimeout(10000);
        var6 = var14.getOutputStream();
        if (param0 == null) {
          var6.write(("CONNECT " + ((vb) this).field_a + ":" + ((vb) this).field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
          var7 = var16;
          var8 = var16.readLine();
          var10 = var8;
          var8 = var10;
          var49 = var8;
          var10 = var8;
          if (param2 >= -58) {
            L0: {
              var13 = null;
              vb.a(18, (java.awt.Component) null);
              if (var8 != null) {
                if (!var8.startsWith("HTTP/1.0 200")) {
                  if (!var8.startsWith("HTTP/1.1 200")) {
                    L1: {
                      if (var8.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var16.readLine();
                        break L1;
                      } else {
                        if (!var8.startsWith("HTTP/1.1 407")) {
                          break L0;
                        } else {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          var8 = var10;
                          var8 = var16.readLine();
                          break L1;
                        }
                      }
                    }
                    L2: while (true) {
                      L3: {
                        if (var8 == null) {
                          break L3;
                        } else {
                          if (-51 >= (var9 ^ -1)) {
                            break L3;
                          } else {
                            if (var8.toLowerCase().startsWith(var10)) {
                              L4: {
                                var38 = var8.substring(var10.length()).trim();
                                var8 = var38;
                                var8 = var38;
                                var11 = var38.indexOf(' ');
                                if (0 == (var11 ^ -1)) {
                                  break L4;
                                } else {
                                  var8 = var38.substring(0, var11);
                                  break L4;
                                }
                              }
                              throw new bn(var8);
                            } else {
                              var9++;
                              var8 = var16.readLine();
                              continue L2;
                            }
                          }
                        }
                      }
                      throw new bn("");
                    }
                  } else {
                    return var14;
                  }
                } else {
                  return var14;
                }
              } else {
                break L0;
              }
            }
            var6.close();
            var16.close();
            var14.close();
            return null;
          } else {
            if (var8 != null) {
              L5: {
                if (var8.startsWith("HTTP/1.0 200")) {
                  break L5;
                } else {
                  if (!var8.startsWith("HTTP/1.1 200")) {
                    L6: {
                      if (var8.startsWith("HTTP/1.0 407")) {
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var16.readLine();
                        break L6;
                      } else {
                        if (var8.startsWith("HTTP/1.1 407")) {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var10;
                          var8 = var10;
                          var8 = var16.readLine();
                          break L6;
                        } else {
                          var6.close();
                          var16.close();
                          var14.close();
                          return null;
                        }
                      }
                    }
                    L7: while (true) {
                      if (var8 != null) {
                        if (-51 < (var9 ^ -1)) {
                          if (var8.toLowerCase().startsWith(var10)) {
                            L8: {
                              var17 = var8.substring(var10.length()).trim();
                              var8 = var17;
                              var8 = var17;
                              var11 = var17.indexOf(' ');
                              if (0 == (var11 ^ -1)) {
                                break L8;
                              } else {
                                var8 = var17.substring(0, var11);
                                break L8;
                              }
                            }
                            throw new bn(var8);
                          } else {
                            var9++;
                            var8 = var16.readLine();
                            continue L7;
                          }
                        } else {
                          throw new bn("");
                        }
                      } else {
                        throw new bn("");
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              return var14;
            } else {
              var6.close();
              var16.close();
              var14.close();
              return null;
            }
          }
        } else {
          var6.write(("CONNECT " + ((vb) this).field_a + ":" + ((vb) this).field_e + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          var39 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
          var7 = var39;
          var8 = var39.readLine();
          var10 = var8;
          var8 = var10;
          var10 = var8;
          if (param2 < -58) {
            if (var8 != null) {
              if (var8.startsWith("HTTP/1.0 200")) {
                return var14;
              } else {
                if (!var8.startsWith("HTTP/1.1 200")) {
                  if (var8.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var43 = "proxy-authenticate: ";
                    var8 = var43;
                    var8 = var43;
                    var8 = var39.readLine();
                    L9: while (true) {
                      L10: {
                        if (var8 == null) {
                          break L10;
                        } else {
                          if (-51 >= (var9 ^ -1)) {
                            break L10;
                          } else {
                            if (var8.toLowerCase().startsWith(var43)) {
                              L11: {
                                var44 = var8.substring(var43.length()).trim();
                                var8 = var44;
                                var8 = var44;
                                var11 = var44.indexOf(' ');
                                if (0 == (var11 ^ -1)) {
                                  break L11;
                                } else {
                                  var8 = var44.substring(0, var11);
                                  break L11;
                                }
                              }
                              throw new bn(var8);
                            } else {
                              var9++;
                              var8 = var39.readLine();
                              continue L9;
                            }
                          }
                        }
                      }
                      throw new bn("");
                    }
                  } else {
                    if (!var8.startsWith("HTTP/1.1 407")) {
                      var6.close();
                      var39.close();
                      var14.close();
                      return null;
                    } else {
                      var9 = 0;
                      var45 = "proxy-authenticate: ";
                      var8 = var45;
                      var8 = var45;
                      var10 = var45;
                      var8 = var10;
                      var8 = var10;
                      var8 = var39.readLine();
                      L12: while (true) {
                        L13: {
                          if (var8 == null) {
                            break L13;
                          } else {
                            if (-51 >= (var9 ^ -1)) {
                              break L13;
                            } else {
                              if (var8.toLowerCase().startsWith(var45)) {
                                L14: {
                                  var46 = var8.substring(var45.length()).trim();
                                  var8 = var46;
                                  var8 = var46;
                                  var11 = var46.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L14;
                                  } else {
                                    var8 = var46.substring(0, var11);
                                    break L14;
                                  }
                                }
                                throw new bn(var8);
                              } else {
                                var9++;
                                var8 = var39.readLine();
                                var50 = var8;
                                var50 = var8;
                                continue L12;
                              }
                            }
                          }
                        }
                        throw new bn("");
                      }
                    }
                  }
                } else {
                  return var14;
                }
              }
            } else {
              var6.close();
              var39.close();
              var14.close();
              return null;
            }
          } else {
            L15: {
              var13 = null;
              vb.a(18, (java.awt.Component) null);
              if (var8 != null) {
                L16: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L16;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L17: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          var9 = 0;
                          var10 = "proxy-authenticate: ";
                          var8 = var39.readLine();
                          break L17;
                        } else {
                          if (!var8.startsWith("HTTP/1.1 407")) {
                            break L15;
                          } else {
                            var9 = 0;
                            var10 = "proxy-authenticate: ";
                            var40 = var10;
                            var8 = var40;
                            var8 = var10;
                            var8 = var39.readLine();
                            var40 = var8;
                            var8 = var40;
                            break L17;
                          }
                        }
                      }
                      L18: while (true) {
                        L19: {
                          if (var8 == null) {
                            break L19;
                          } else {
                            if (-51 >= (var9 ^ -1)) {
                              break L19;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L20: {
                                  var40 = var8.substring(var10.length()).trim();
                                  var8 = var40;
                                  var8 = var40;
                                  var11 = var40.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L20;
                                  } else {
                                    var8 = var40.substring(0, var11);
                                    break L20;
                                  }
                                }
                                throw new bn(var8);
                              } else {
                                var9++;
                                var8 = var39.readLine();
                                var42 = var8;
                                var8 = var42;
                                continue L18;
                              }
                            }
                          }
                        }
                        throw new bn("");
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                return var14;
              } else {
                break L15;
              }
            }
            var6.close();
            var39.close();
            var14.close();
            return null;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != -109) {
            field_j = false;
            field_l = null;
            field_m = null;
            return;
        }
        field_l = null;
        field_m = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) kd.field_g);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) kd.field_g);
        if (param0 != -51) {
            return;
        }
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) kd.field_g);
        kf.field_c = 0;
    }

    final static boolean e(int param0) {
        if (param0 != -30962) {
            field_j = false;
            return lf.field_b != null ? true : false;
        }
        return lf.field_b != null ? true : false;
    }

    vb() {
        ((vb) this).field_k = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Quick Chat Help";
        field_l = new a();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

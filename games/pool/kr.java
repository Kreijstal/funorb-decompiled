/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class kr extends bg {
    private java.net.ProxySelector field_f;
    static na field_e;
    static int field_h;
    static long field_g;

    public static void c(int param0) {
        field_e = null;
        if (param0 != 15296) {
            Object var2 = null;
            kr.a((byte) -15, 68L, (String) null);
        }
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
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
        if (param1.type() == java.net.Proxy.Type.DIRECT) {
          return ((kr) this).b(5101);
        } else {
          var3 = param1.address();
          if ((Object) var3 instanceof java.net.InetSocketAddress) {
            var4_ref = (java.net.InetSocketAddress) (Object) var3;
            if (param1.type() != java.net.Proxy.Type.HTTP) {
              if (param1.type() != java.net.Proxy.Type.SOCKS) {
                if (param0 == -6589) {
                  return null;
                } else {
                  kr.a(false);
                  return null;
                }
              } else {
                var5 = (Object) (Object) new java.net.Socket(param1);
                ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((kr) this).field_c, ((kr) this).field_a));
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
              return this.a(var4_ref.getPort(), (byte) 25, (String) var5, var4_ref.getHostName());
            }
          } else {
            return null;
          }
        }
    }

    private final java.net.Socket a(int param0, byte param1, String param2, String param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        BufferedReader var16 = null;
        String var17 = null;
        String var38 = null;
        BufferedReader var39 = null;
        String var40 = null;
        String var41 = null;
        BufferedReader var42 = null;
        String var43 = null;
        String var46 = null;
        String var47 = null;
        String var48 = null;
        String var49 = null;
        String var52 = null;
        String var57 = null;
        String var58 = null;
        var12 = Pool.field_O;
        var13 = new java.net.Socket(param3, param0);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param2 != null) {
          L0: {
            var6.write(("CONNECT " + ((kr) this).field_c + ":" + ((kr) this).field_a + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            if (param1 == 25) {
              break L0;
            } else {
              kr.c(-94);
              break L0;
            }
          }
          var6.flush();
          var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var7 = var16;
          var17 = var16.readLine();
          var52 = var17;
          var8 = var52;
          var52 = var17;
          var14 = var17;
          var52 = var14;
          var8 = var52;
          var52 = var14;
          if (var17 != null) {
            if (!var17.startsWith("HTTP/1.0 200")) {
              if (!var17.startsWith("HTTP/1.1 200")) {
                L1: {
                  if (var17.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var8 = var16.readLine();
                    var10 = "proxy-authenticate: ";
                    break L1;
                  } else {
                    if (var17.startsWith("HTTP/1.1 407")) {
                      var9 = 0;
                      var8 = var16.readLine();
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
                      break L1;
                    } else {
                      var6.close();
                      var16.close();
                      var13.close();
                      return null;
                    }
                  }
                }
                L2: while (true) {
                  L3: {
                    if (var8 == null) {
                      break L3;
                    } else {
                      if ((var9 ^ -1) <= -51) {
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
                          throw new lo(var8);
                        } else {
                          var9++;
                          var8 = var16.readLine();
                          continue L2;
                        }
                      }
                    }
                  }
                  throw new lo("");
                }
              } else {
                return var13;
              }
            } else {
              return var13;
            }
          } else {
            var6.close();
            var16.close();
            var13.close();
            return null;
          }
        } else {
          var6.write(("CONNECT " + ((kr) this).field_c + ":" + ((kr) this).field_a + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          if (param1 == 25) {
            var6.flush();
            var42 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var42;
            var43 = var42.readLine();
            var57 = var43;
            var8 = var57;
            var57 = var43;
            if (var43 != null) {
              if (var43.startsWith("HTTP/1.0 200")) {
                return var13;
              } else {
                if (!var43.startsWith("HTTP/1.1 200")) {
                  if (var43.startsWith("HTTP/1.0 407")) {
                    var9 = 0;
                    var8 = var42.readLine();
                    var46 = "proxy-authenticate: ";
                    var8 = var46;
                    var8 = var46;
                    L5: while (true) {
                      L6: {
                        if (var8 == null) {
                          break L6;
                        } else {
                          if ((var9 ^ -1) <= -51) {
                            break L6;
                          } else {
                            if (var8.toLowerCase().startsWith(var46)) {
                              L7: {
                                var47 = var8.substring(var46.length()).trim();
                                var8 = var47;
                                var8 = var47;
                                var11 = var47.indexOf(' ');
                                if (0 == (var11 ^ -1)) {
                                  break L7;
                                } else {
                                  var8 = var47.substring(0, var11);
                                  break L7;
                                }
                              }
                              throw new lo(var8);
                            } else {
                              var9++;
                              var8 = var42.readLine();
                              continue L5;
                            }
                          }
                        }
                      }
                      throw new lo("");
                    }
                  } else {
                    if (!var43.startsWith("HTTP/1.1 407")) {
                      var6.close();
                      var42.close();
                      var13.close();
                      return null;
                    } else {
                      var9 = 0;
                      var8 = var42.readLine();
                      var48 = "proxy-authenticate: ";
                      var8 = var48;
                      var8 = var48;
                      var10 = var48;
                      var8 = var10;
                      var8 = var10;
                      L8: while (true) {
                        L9: {
                          if (var8 == null) {
                            break L9;
                          } else {
                            if ((var9 ^ -1) <= -51) {
                              break L9;
                            } else {
                              if (var8.toLowerCase().startsWith(var48)) {
                                L10: {
                                  var49 = var8.substring(var48.length()).trim();
                                  var8 = var49;
                                  var8 = var49;
                                  var11 = var49.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L10;
                                  } else {
                                    var8 = var49.substring(0, var11);
                                    break L10;
                                  }
                                }
                                throw new lo(var8);
                              } else {
                                var9++;
                                var8 = var42.readLine();
                                var58 = var8;
                                var58 = var8;
                                continue L8;
                              }
                            }
                          }
                        }
                        throw new lo("");
                      }
                    }
                  }
                } else {
                  return var13;
                }
              }
            } else {
              var6.close();
              var42.close();
              var13.close();
              return null;
            }
          } else {
            L11: {
              kr.c(-94);
              var6.flush();
              var39 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var40 = var39.readLine();
              var8 = var40;
              var8 = var40;
              if (var40 != null) {
                L12: {
                  if (var40.startsWith("HTTP/1.0 200")) {
                    break L12;
                  } else {
                    if (!var40.startsWith("HTTP/1.1 200")) {
                      L13: {
                        if (var40.startsWith("HTTP/1.0 407")) {
                          var9 = 0;
                          var8 = var39.readLine();
                          var10 = "proxy-authenticate: ";
                          break L13;
                        } else {
                          if (!var40.startsWith("HTTP/1.1 407")) {
                            break L11;
                          } else {
                            var9 = 0;
                            var8 = var39.readLine();
                            var10 = "proxy-authenticate: ";
                            var8 = var10;
                            var8 = var10;
                            break L13;
                          }
                        }
                      }
                      L14: while (true) {
                        L15: {
                          if (var8 == null) {
                            break L15;
                          } else {
                            if ((var9 ^ -1) <= -51) {
                              break L15;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L16: {
                                  var41 = var8.substring(var10.length()).trim();
                                  var8 = var41;
                                  var8 = var41;
                                  var11 = var41.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L16;
                                  } else {
                                    var8 = var41.substring(0, var11);
                                    break L16;
                                  }
                                }
                                throw new lo(var8);
                              } else {
                                var9++;
                                var8 = var39.readLine();
                                var57 = var8;
                                var8 = var57;
                                var57 = var8;
                                continue L14;
                              }
                            }
                          }
                        }
                        throw new lo("");
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                return var13;
              } else {
                break L11;
              }
            }
            var6.close();
            var39.close();
            var13.close();
            return null;
          }
        }
    }

    kr() {
        ((kr) this).field_f = java.net.ProxySelector.getDefault();
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
        lo var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_6_0 = 0;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        String stackIn_11_4 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        java.net.ProxySelector stackIn_14_0 = null;
        java.net.URI stackIn_14_1 = null;
        java.net.URI stackIn_14_2 = null;
        StringBuilder stackIn_14_3 = null;
        String stackIn_14_4 = null;
        java.net.Socket stackIn_23_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        String stackOut_9_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        java.net.ProxySelector stackOut_13_0 = null;
        java.net.URI stackOut_13_1 = null;
        java.net.URI stackOut_13_2 = null;
        StringBuilder stackOut_13_3 = null;
        String stackOut_13_4 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.Socket stackOut_22_0 = null;
        L0: {
          var13 = Pool.field_O;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((kr) this).field_a != 443) {
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
        if (param0 <= -94) {
          try {
            L2: {
              L3: {
                stackOut_8_0 = ((kr) this).field_f;
                stackOut_8_1 = null;
                stackOut_8_2 = null;
                stackOut_8_3 = new StringBuilder();
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                if (var5 == 0) {
                  stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                  stackOut_10_1 = null;
                  stackOut_10_2 = null;
                  stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                  stackOut_10_4 = "http";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  stackIn_11_4 = stackOut_10_4;
                  break L3;
                } else {
                  stackOut_9_0 = (java.net.ProxySelector) (Object) stackIn_9_0;
                  stackOut_9_1 = null;
                  stackOut_9_2 = null;
                  stackOut_9_3 = (StringBuilder) (Object) stackIn_9_3;
                  stackOut_9_4 = "https";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_11_3 = stackOut_9_3;
                  stackIn_11_4 = stackOut_9_4;
                  break L3;
                }
              }
              L4: {
                var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(stackIn_11_4 + "://" + ((kr) this).field_c));
                stackOut_11_0 = ((kr) this).field_f;
                stackOut_11_1 = null;
                stackOut_11_2 = null;
                stackOut_11_3 = new StringBuilder();
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                if (var5 != 0) {
                  stackOut_13_0 = (java.net.ProxySelector) (Object) stackIn_13_0;
                  stackOut_13_1 = null;
                  stackOut_13_2 = null;
                  stackOut_13_3 = (StringBuilder) (Object) stackIn_13_3;
                  stackOut_13_4 = "http";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  stackIn_14_4 = stackOut_13_4;
                  break L4;
                } else {
                  stackOut_12_0 = (java.net.ProxySelector) (Object) stackIn_12_0;
                  stackOut_12_1 = null;
                  stackOut_12_2 = null;
                  stackOut_12_3 = (StringBuilder) (Object) stackIn_12_3;
                  stackOut_12_4 = "https";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  stackIn_14_4 = stackOut_12_4;
                  break L4;
                }
              }
              var4 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + ((kr) this).field_c));
              break L2;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
            return ((kr) this).b(5101);
          }
          boolean discarded$3 = var3.addAll((Collection) (Object) var4);
          var6_array = var3.toArray();
          var7 = null;
          var8_array = var6_array;
          var9 = 0;
          L5: while (true) {
            if (var8_array.length <= var9) {
              if (var7 != null) {
                throw kr.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
              } else {
                return ((kr) this).b(5101);
              }
            } else {
              var10 = var8_array[var9];
              var11 = (java.net.Proxy) var10;
              try {
                L6: {
                  var12_ref2 = this.a(-6589, var11);
                  if (var12_ref2 != null) {
                    stackOut_22_0 = (java.net.Socket) var12_ref2;
                    stackIn_23_0 = stackOut_22_0;
                    decompiledRegionSelector0 = 1;
                    break L6;
                  } else {
                    var9++;
                    decompiledRegionSelector0 = 0;
                    break L6;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                L8: {
                  var12_ref = (IOException) (Object) decompiledCaughtException;
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L8;
                }
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var12 = (lo) (Object) decompiledCaughtException;
                  var7 = (Object) (Object) var12;
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
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
          return null;
        }
    }

    final static void a(boolean param0) {
        String var1 = null;
        if (!ro.field_e) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (d.field_d != null) {
              d.field_d.k(17);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = ve.d(120);
          vj.field_j = new ui(var1, (String) null, true, false, param0);
          wd.field_Ub.b((ei) (Object) tn.field_n, 30000);
          tn.field_n.d((ei) (Object) vj.field_j, 30);
          tn.field_n.b(param0);
          return;
        }
    }

    final static void a(byte param0, long param1, String param2) {
        CharSequence var5 = null;
        CharSequence var6 = null;
        if (param0 >= -58) {
          field_e = null;
          fm.field_I = param2;
          hn.field_b = 2;
          var5 = (CharSequence) (Object) param2;
          di.field_a = hq.a(88, var5);
          c.field_d = param1;
          rg.field_p = true;
          return;
        } else {
          fm.field_I = param2;
          hn.field_b = 2;
          var6 = (CharSequence) (Object) param2;
          di.field_a = hq.a(88, var6);
          c.field_d = param1;
          rg.field_p = true;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 99;
        field_e = new na();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

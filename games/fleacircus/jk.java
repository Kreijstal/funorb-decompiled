/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class jk extends hm {
    static byte[][] field_n;
    static int field_l;
    static int field_r;
    private java.net.ProxySelector field_k;
    static vc field_m;
    static String field_o;
    static String field_p;
    static String field_q;
    static String field_i;
    static String field_j;

    final java.net.Socket a(boolean param0) throws IOException {
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
        em var12 = null;
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
        java.net.Socket stackIn_24_0 = null;
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
        java.net.Socket stackOut_23_0 = null;
        L0: {
          var13 = fleas.field_A ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (-444 != (((jk) this).field_e ^ -1)) {
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
              stackOut_6_0 = ((jk) this).field_k;
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
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + ((jk) this).field_a));
              stackOut_9_0 = ((jk) this).field_k;
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
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + ((jk) this).field_a));
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((jk) this).a(200);
        }
        L5: {
          boolean discarded$3 = var3.addAll((Collection) (Object) var4);
          if (param0) {
            var6_array = var3.toArray();
            var7 = null;
            var8_array = var6_array;
            var9 = 0;
            break L5;
          } else {
            field_o = null;
            var6_array = var3.toArray();
            var7 = null;
            var8_array = var6_array;
            var9 = 0;
            break L5;
          }
        }
        L6: while (true) {
          if (var8_array.length <= var9) {
            if (var7 != null) {
              throw jk.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return ((jk) this).a(200);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                var12_ref2 = this.a(var11, (byte) -38);
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
                var12 = (em) (Object) decompiledCaughtException;
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

    private final java.net.Socket a(String param0, int param1, String param2, byte param3) throws IOException {
        int var6 = 0;
        OutputStream var7 = null;
        BufferedReader var8 = null;
        String var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        java.net.Socket var14 = null;
        String var15 = null;
        String var16 = null;
        var13 = fleas.field_A ? 1 : 0;
        var14 = new java.net.Socket(param2, param1);
        var6 = -29 % ((param3 - 14) / 46);
        var14.setSoTimeout(10000);
        var7 = var14.getOutputStream();
        if (param0 == null) {
          var7.write(("CONNECT " + ((jk) this).field_a + ":" + ((jk) this).field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var7.flush();
          var8 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
          var15 = var8.readLine();
          var9 = var15;
          if (var15 != null) {
            L0: {
              if (var15.startsWith("HTTP/1.0 200")) {
                break L0;
              } else {
                if (var15.startsWith("HTTP/1.1 200")) {
                  break L0;
                } else {
                  if (var15.startsWith("HTTP/1.0 407")) {
                    var10 = 0;
                    var11 = "proxy-authenticate: ";
                    var9 = var11;
                    var9 = var8.readLine();
                    L1: while (true) {
                      L2: {
                        if (var9 == null) {
                          break L2;
                        } else {
                          if (var10 >= 50) {
                            break L2;
                          } else {
                            if (!var9.toLowerCase().startsWith(var11)) {
                              var9 = var8.readLine();
                              var10++;
                              continue L1;
                            } else {
                              L3: {
                                var16 = var9.substring(var11.length()).trim();
                                var9 = var16;
                                var12 = var16.indexOf(' ');
                                if (0 != (var12 ^ -1)) {
                                  var9 = var16.substring(0, var12);
                                  break L3;
                                } else {
                                  var9 = var16;
                                  break L3;
                                }
                              }
                              throw new em(var9);
                            }
                          }
                        }
                      }
                      throw new em("");
                    }
                  } else {
                    if (var15.startsWith("HTTP/1.1 407")) {
                      var10 = 0;
                      var11 = "proxy-authenticate: ";
                      var9 = var11;
                      var9 = var8.readLine();
                      L4: while (true) {
                        L5: {
                          if (var9 == null) {
                            break L5;
                          } else {
                            if (var10 >= 50) {
                              break L5;
                            } else {
                              if (!var9.toLowerCase().startsWith(var11)) {
                                var9 = var8.readLine();
                                var10++;
                                continue L4;
                              } else {
                                L6: {
                                  var16 = var9.substring(var11.length()).trim();
                                  var9 = var16;
                                  var12 = var16.indexOf(' ');
                                  if (0 != (var12 ^ -1)) {
                                    var9 = var16.substring(0, var12);
                                    break L6;
                                  } else {
                                    var9 = var16;
                                    break L6;
                                  }
                                }
                                throw new em(var9);
                              }
                            }
                          }
                        }
                        throw new em("");
                      }
                    } else {
                      var7.close();
                      var8.close();
                      var14.close();
                      return null;
                    }
                  }
                }
              }
            }
            return var14;
          } else {
            var7.close();
            var8.close();
            var14.close();
            return null;
          }
        } else {
          L7: {
            var7.write(("CONNECT " + ((jk) this).field_a + ":" + ((jk) this).field_e + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            var7.flush();
            var8 = new BufferedReader((Reader) (Object) new InputStreamReader(var14.getInputStream()));
            var15 = var8.readLine();
            var9 = var15;
            if (var15 != null) {
              if (!var15.startsWith("HTTP/1.0 200")) {
                if (!var15.startsWith("HTTP/1.1 200")) {
                  if (var15.startsWith("HTTP/1.0 407")) {
                    var10 = 0;
                    var11 = "proxy-authenticate: ";
                    var9 = var11;
                    var9 = var8.readLine();
                    L8: while (true) {
                      if (var9 != null) {
                        if (var10 < 50) {
                          if (!var9.toLowerCase().startsWith(var11)) {
                            var9 = var8.readLine();
                            var10++;
                            continue L8;
                          } else {
                            L9: {
                              var16 = var9.substring(var11.length()).trim();
                              var9 = var16;
                              var12 = var16.indexOf(' ');
                              if (0 != (var12 ^ -1)) {
                                var9 = var16.substring(0, var12);
                                break L9;
                              } else {
                                var9 = var16;
                                break L9;
                              }
                            }
                            throw new em(var9);
                          }
                        } else {
                          throw new em("");
                        }
                      } else {
                        throw new em("");
                      }
                    }
                  } else {
                    if (var15.startsWith("HTTP/1.1 407")) {
                      var10 = 0;
                      var11 = "proxy-authenticate: ";
                      var9 = var11;
                      var9 = var8.readLine();
                      L10: while (true) {
                        L11: {
                          if (var9 == null) {
                            break L11;
                          } else {
                            if (var10 >= 50) {
                              break L11;
                            } else {
                              if (!var9.toLowerCase().startsWith(var11)) {
                                var9 = var8.readLine();
                                var10++;
                                continue L10;
                              } else {
                                L12: {
                                  var16 = var9.substring(var11.length()).trim();
                                  var9 = var16;
                                  var12 = var16.indexOf(' ');
                                  if (0 != (var12 ^ -1)) {
                                    var9 = var16.substring(0, var12);
                                    break L12;
                                  } else {
                                    var9 = var16;
                                    break L12;
                                  }
                                }
                                throw new em(var9);
                              }
                            }
                          }
                        }
                        throw new em("");
                      }
                    } else {
                      break L7;
                    }
                  }
                } else {
                  return var14;
                }
              } else {
                return var14;
              }
            } else {
              break L7;
            }
          }
          var7.close();
          var8.close();
          var14.close();
          return null;
        }
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
        if (param0.type() != java.net.Proxy.Type.DIRECT) {
          var3 = param0.address();
          if ((Object) var3 instanceof java.net.InetSocketAddress) {
            L0: {
              if (param1 == -38) {
                break L0;
              } else {
                jk.c(-87);
                break L0;
              }
            }
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
              return this.a((String) var5, var4_ref.getPort(), var4_ref.getHostName(), (byte) 101);
            } else {
              if (param0.type() != java.net.Proxy.Type.SOCKS) {
                return null;
              } else {
                var5 = (Object) (Object) new java.net.Socket(param0);
                ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((jk) this).field_a, ((jk) this).field_e));
                return (java.net.Socket) var5;
              }
            }
          } else {
            return null;
          }
        } else {
          return ((jk) this).a(param1 + 238);
        }
    }

    jk() {
        ((jk) this).field_k = java.net.ProxySelector.getDefault();
    }

    public static void c(int param0) {
        field_q = null;
        field_i = null;
        field_m = null;
        int var1 = -62 / ((param0 - 77) / 37);
        field_j = null;
        field_n = null;
        field_o = null;
        field_p = null;
    }

    final static ob a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var2 = param0.length();
        if ((var2 ^ -1) != -1) {
          if (-65 > (var2 ^ -1)) {
            return hg.field_i;
          } else {
            if (param0.charAt(0) != 34) {
              L0: {
                var3 = 0;
                var4 = 0;
                if (param1 < 112) {
                  break L0;
                } else {
                  if ((var2 ^ -1) < (var4 ^ -1)) {
                    L1: {
                      var5 = param0.charAt(var4);
                      if (var5 == 46) {
                        if (var4 != 0) {
                          if (var2 + -1 != var4) {
                            if (var3 != 0) {
                              return je.field_M;
                            } else {
                              var3 = 1;
                              var4++;
                              break L1;
                            }
                          } else {
                            return je.field_M;
                          }
                        } else {
                          return je.field_M;
                        }
                      } else {
                        if (0 == (tb.field_a.indexOf(var5) ^ -1)) {
                          return je.field_M;
                        } else {
                          var3 = 0;
                          break L1;
                        }
                      }
                    }
                    var4++;
                    var4++;
                    var4++;
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
              jk.c(-110);
              if ((var2 ^ -1) < (var4 ^ -1)) {
                L2: {
                  var5 = param0.charAt(var4);
                  if (var5 == 46) {
                    L3: {
                      if (var4 == 0) {
                        break L3;
                      } else {
                        if (var2 + -1 == var4) {
                          break L3;
                        } else {
                          if (var3 != 0) {
                            break L3;
                          } else {
                            var3 = 1;
                            var4++;
                            break L2;
                          }
                        }
                      }
                    }
                    return je.field_M;
                  } else {
                    if (0 == (tb.field_a.indexOf(var5) ^ -1)) {
                      return je.field_M;
                    } else {
                      var3 = 0;
                      break L2;
                    }
                  }
                }
                var4++;
                var4++;
                L4: while (true) {
                  if ((var2 ^ -1) < (var4 ^ -1)) {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (var5 == 46) {
                        L6: {
                          if (var4 == 0) {
                            break L6;
                          } else {
                            if (var2 + -1 == var4) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                var3 = 1;
                                break L5;
                              }
                            }
                          }
                        }
                        return je.field_M;
                      } else {
                        if (0 == (tb.field_a.indexOf(var5) ^ -1)) {
                          return je.field_M;
                        } else {
                          var3 = 0;
                          break L5;
                        }
                      }
                    }
                    var4++;
                    continue L4;
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              if (34 != param0.charAt(-1 + var2)) {
                return je.field_M;
              } else {
                var3 = 0;
                var4 = 1;
                L7: while (true) {
                  if (var2 - 1 > var4) {
                    L8: {
                      var5 = param0.charAt(var4);
                      if (92 == var5) {
                        L9: {
                          if (var3 != 0) {
                            stackOut_16_0 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            break L9;
                          } else {
                            stackOut_15_0 = 1;
                            stackIn_17_0 = stackOut_15_0;
                            break L9;
                          }
                        }
                        var3 = stackIn_17_0;
                        break L8;
                      } else {
                        if (var5 != 34) {
                          var3 = 0;
                          break L8;
                        } else {
                          if (var3 == 0) {
                            return je.field_M;
                          } else {
                            var3 = 0;
                            var4++;
                            continue L7;
                          }
                        }
                      }
                    }
                    var4++;
                    continue L7;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } else {
          return tf.field_H;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new byte[50][];
        field_l = 1;
        field_o = "<%0>Entrance:<%1> Fleas enter the level from the bottom of this.";
        field_r = 0;
        field_m = new vc();
        field_i = "Not yet achieved";
        field_p = "Visit the Account Management section on the main site to view.";
        field_q = "<%0>Water:<%1> Fleas drown in water. Keep the fleas away!";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

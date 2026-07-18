/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class sc extends we {
    static pi[][] field_j;
    static int field_n;
    static String field_h;
    static boolean field_m;
    private java.net.ProxySelector field_i;
    static char[] field_o;
    static String field_p;
    static String field_k;
    static ne field_l;

    final java.net.Socket a(int param0) throws IOException {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        db var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_8_0 = 0;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        String stackIn_13_4 = null;
        java.net.ProxySelector stackIn_14_0 = null;
        java.net.URI stackIn_14_1 = null;
        java.net.URI stackIn_14_2 = null;
        StringBuilder stackIn_14_3 = null;
        java.net.ProxySelector stackIn_16_0 = null;
        java.net.URI stackIn_16_1 = null;
        java.net.URI stackIn_16_2 = null;
        StringBuilder stackIn_16_3 = null;
        java.net.ProxySelector stackIn_17_0 = null;
        java.net.URI stackIn_17_1 = null;
        java.net.URI stackIn_17_2 = null;
        StringBuilder stackIn_17_3 = null;
        String stackIn_17_4 = null;
        java.net.Socket stackIn_20_0 = null;
        java.net.Socket stackIn_28_0 = null;
        java.net.Socket stackIn_33_0 = null;
        java.net.Socket stackIn_42_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.ProxySelector stackOut_13_0 = null;
        java.net.URI stackOut_13_1 = null;
        java.net.URI stackOut_13_2 = null;
        StringBuilder stackOut_13_3 = null;
        java.net.ProxySelector stackOut_16_0 = null;
        java.net.URI stackOut_16_1 = null;
        java.net.URI stackOut_16_2 = null;
        StringBuilder stackOut_16_3 = null;
        String stackOut_16_4 = null;
        java.net.ProxySelector stackOut_14_0 = null;
        java.net.URI stackOut_14_1 = null;
        java.net.URI stackOut_14_2 = null;
        StringBuilder stackOut_14_3 = null;
        String stackOut_14_4 = null;
        java.net.Socket stackOut_19_0 = null;
        java.net.Socket stackOut_27_0 = null;
        java.net.Socket stackOut_32_0 = null;
        java.net.Socket stackOut_41_0 = null;
        var13 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
              if (var2_int != 0) {
                break L1;
              } else {
                String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                break L1;
              }
            }
            L2: {
              if (443 != ((sc) this).field_f) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            var5 = stackIn_8_0;
            try {
              L3: {
                L4: {
                  stackOut_9_0 = ((sc) this).field_i;
                  stackOut_9_1 = null;
                  stackOut_9_2 = null;
                  stackOut_9_3 = new StringBuilder();
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1;
                  stackIn_12_2 = stackOut_9_2;
                  stackIn_12_3 = stackOut_9_3;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  stackIn_10_3 = stackOut_9_3;
                  if (var5 != 0) {
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
                    stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                    stackOut_10_1 = null;
                    stackOut_10_2 = null;
                    stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                    stackOut_10_4 = "http";
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_13_1 = stackOut_10_1;
                    stackIn_13_2 = stackOut_10_2;
                    stackIn_13_3 = stackOut_10_3;
                    stackIn_13_4 = stackOut_10_4;
                    break L4;
                  }
                }
                L5: {
                  var3 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + ((sc) this).field_d));
                  stackOut_13_0 = ((sc) this).field_i;
                  stackOut_13_1 = null;
                  stackOut_13_2 = null;
                  stackOut_13_3 = new StringBuilder();
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_16_2 = stackOut_13_2;
                  stackIn_16_3 = stackOut_13_3;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  if (var5 == 0) {
                    stackOut_16_0 = (java.net.ProxySelector) (Object) stackIn_16_0;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = (StringBuilder) (Object) stackIn_16_3;
                    stackOut_16_4 = "https";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    stackIn_17_4 = stackOut_16_4;
                    break L5;
                  } else {
                    stackOut_14_0 = (java.net.ProxySelector) (Object) stackIn_14_0;
                    stackOut_14_1 = null;
                    stackOut_14_2 = null;
                    stackOut_14_3 = (StringBuilder) (Object) stackIn_14_3;
                    stackOut_14_4 = "http";
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_17_1 = stackOut_14_1;
                    stackIn_17_2 = stackOut_14_2;
                    stackIn_17_3 = stackOut_14_3;
                    stackIn_17_4 = stackOut_14_4;
                    break L5;
                  }
                }
                var4 = ((java.net.ProxySelector) (Object) stackIn_17_0).select(new java.net.URI(stackIn_17_4 + "://" + ((sc) this).field_d));
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
              stackOut_19_0 = ((sc) this).b(2);
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0;
            }
            L6: {
              boolean discarded$3 = var3.addAll((Collection) (Object) var4);
              var6_array = var3.toArray();
              if (param0 < -2) {
                break L6;
              } else {
                sc.b(true);
                break L6;
              }
            }
            var7 = null;
            var8_array = var6_array;
            var9 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if (~var8_array.length >= ~var9) {
                    break L9;
                  } else {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    try {
                      L10: {
                        var12_ref2 = this.a((byte) -86, var11);
                        stackOut_27_0 = (java.net.Socket) var12_ref2;
                        stackIn_42_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if (var13 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L10;
                        } else {
                          if (stackIn_28_0 != null) {
                            stackOut_32_0 = (java.net.Socket) var12_ref2;
                            stackIn_33_0 = stackOut_32_0;
                            decompiledRegionSelector0 = 1;
                            break L10;
                          } else {
                            decompiledRegionSelector0 = 2;
                            break L10;
                          }
                        }
                      }
                    } catch (java.io.IOException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L12: {
                        var12_ref = (IOException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 2;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L11: {
                        var12 = (db) (Object) decompiledCaughtException;
                        var7 = (Object) (Object) var12;
                        decompiledRegionSelector0 = 2;
                        break L11;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      break L8;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        return stackIn_33_0;
                      } else {
                        var9++;
                        if (var13 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                if (var7 == null) {
                  stackOut_41_0 = ((sc) this).b(2);
                  stackIn_42_0 = stackOut_41_0;
                  break L8;
                } else {
                  throw sc.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "sc.E(" + param0 + ')');
        }
        return stackIn_42_0;
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
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
        java.net.Socket stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_13_0 = null;
        java.net.Socket stackIn_24_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        Throwable decompiledCaughtException = null;
        java.net.Socket stackOut_3_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        java.net.Socket stackOut_23_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            if (param1.type() == java.net.Proxy.Type.DIRECT) {
              stackOut_3_0 = ((sc) this).b(2);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 < -82) {
                var3_ref = param1.address();
                if (!((Object) var3_ref instanceof java.net.InetSocketAddress)) {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  return (java.net.Socket) (Object) stackIn_13_0;
                } else {
                  var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                  if (param1.type() != java.net.Proxy.Type.HTTP) {
                    if (param1.type() == java.net.Proxy.Type.SOCKS) {
                      var5 = (Object) (Object) new java.net.Socket(param1);
                      ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((sc) this).field_d, ((sc) this).field_f));
                      stackOut_28_0 = var5;
                      stackIn_29_0 = stackOut_28_0;
                      return (java.net.Socket) (Object) stackIn_29_0;
                    } else {
                      stackOut_30_0 = null;
                      stackIn_31_0 = stackOut_30_0;
                      break L0;
                    }
                  } else {
                    var5 = null;
                    try {
                      L1: {
                        L2: {
                          var6_ref = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                          var7 = var6_ref.getDeclaredMethod("getProxyAuth", new Class[2]);
                          var7.setAccessible(true);
                          var8 = var7.invoke((Object) null, new Object[2]);
                          if (var8 == null) {
                            break L2;
                          } else {
                            var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                            var9.setAccessible(true);
                            if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                              var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                              var10.setAccessible(true);
                              var11 = var6_ref.getDeclaredMethod("getHeaderValue", new Class[2]);
                              var11.setAccessible(true);
                              var12 = (String) var10.invoke(var8, new Object[0]);
                              var13 = (String) var11.invoke(var8, new Object[2]);
                              var5 = (Object) (Object) (var12 + ": " + var13);
                              break L2;
                            } else {
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
                    stackOut_23_0 = this.a((String) var5, var4_ref.getPort(), var4_ref.getHostName(), 1323);
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0;
                  }
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (java.net.Socket) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("sc.I(").append(param0).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L4;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return (java.net.Socket) (Object) stackIn_31_0;
    }

    private final java.net.Socket a(String param0, int param1, String param2, int param3) throws IOException {
        RuntimeException var5 = null;
        java.net.Socket var5_ref = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_17_0 = null;
        Object stackOut_36_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5_ref = new java.net.Socket(param2, param1);
                var5_ref.setSoTimeout(10000);
                var6 = var5_ref.getOutputStream();
                if (null == param0) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + ((sc) this).field_d + ":" + ((sc) this).field_f + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + ((sc) this).field_d + ":" + ((sc) this).field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            L3: {
              var6.flush();
              if (param3 == 1323) {
                break L3;
              } else {
                ((sc) this).field_i = null;
                break L3;
              }
            }
            L4: {
              var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var5_ref.getInputStream()));
              var8 = var7.readLine();
              if (var8 == null) {
                break L4;
              } else {
                L5: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L5;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L6: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          break L6;
                        } else {
                          if (!var8.startsWith("HTTP/1.1 407")) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var9 = 0;
                      var8 = var7.readLine();
                      var10 = "proxy-authenticate: ";
                      L7: while (true) {
                        L8: {
                          if (var8 == null) {
                            break L8;
                          } else {
                            if (var9 >= 50) {
                              break L8;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var8 = var7.readLine();
                                var9++;
                                if (var12 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              } else {
                                L9: {
                                  var8 = var8.substring(var10.length()).trim();
                                  var11 = var8.indexOf(' ');
                                  if (var11 != -1) {
                                    var8 = var8.substring(0, var11);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                throw new db(var8);
                              }
                            }
                          }
                        }
                        throw new db("");
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackOut_17_0 = (java.net.Socket) var5_ref;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0;
              }
            }
            var6.close();
            var7.close();
            var5_ref.close();
            stackOut_36_0 = null;
            stackIn_37_0 = stackOut_36_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var5;
            stackOut_38_1 = new StringBuilder().append("sc.J(");
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L10;
            }
          }
          L11: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(param1).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L11;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param3 + ')');
        }
        return (java.net.Socket) (Object) stackIn_37_0;
    }

    final static boolean c(byte param0) {
        kl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1 = (kl) (Object) aa.field_f.c((byte) -95);
            if (null == var1) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                if (param0 <= -57) {
                  break L1;
                } else {
                  field_p = null;
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                L3: {
                  if (var2 >= var1.field_o) {
                    break L3;
                  } else {
                    L4: {
                      if (var1.field_y[var2] != null) {
                        if (0 == var1.field_y[var2].field_c) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (null == var1.field_t[var2]) {
                        break L5;
                      } else {
                        if (var1.field_t[var2].field_c == 0) {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0 != 0;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var2++;
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_28_0 = 1;
                stackIn_29_0 = stackOut_28_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1_ref, "sc.H(" + param0 + ')');
        }
        return stackIn_29_0 != 0;
    }

    sc() {
        try {
            ((sc) this).field_i = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "sc.<init>()");
        }
    }

    public static void b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_j = null;
              field_p = null;
              if (!param0) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            field_h = null;
            field_k = null;
            field_o = null;
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "sc.G(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Cancel rematch";
        field_n = 0;
        field_m = true;
        field_j = new pi[8][];
        field_o = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_k = "Waiting for sound effects";
        field_p = "Cancel";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

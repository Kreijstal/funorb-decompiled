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
        em var12 = null;
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
        java.net.Socket stackIn_32_0 = null;
        java.net.Socket stackIn_41_0 = null;
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
        java.net.Socket stackOut_31_0 = null;
        java.net.Socket stackOut_40_0 = null;
        var13 = fleas.field_A ? 1 : 0;
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
              if (((jk) this).field_e != 443) {
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
                  stackOut_9_0 = ((jk) this).field_k;
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
                  if (var5 == 0) {
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
                    stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                    stackOut_10_1 = null;
                    stackOut_10_2 = null;
                    stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                    stackOut_10_4 = "https";
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_13_1 = stackOut_10_1;
                    stackIn_13_2 = stackOut_10_2;
                    stackIn_13_3 = stackOut_10_3;
                    stackIn_13_4 = stackOut_10_4;
                    break L4;
                  }
                }
                L5: {
                  var3 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + ((jk) this).field_a));
                  stackOut_13_0 = ((jk) this).field_k;
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
                  if (var5 != 0) {
                    stackOut_16_0 = (java.net.ProxySelector) (Object) stackIn_16_0;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = (StringBuilder) (Object) stackIn_16_3;
                    stackOut_16_4 = "http";
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
                    stackOut_14_4 = "https";
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_17_1 = stackOut_14_1;
                    stackIn_17_2 = stackOut_14_2;
                    stackIn_17_3 = stackOut_14_3;
                    stackIn_17_4 = stackOut_14_4;
                    break L5;
                  }
                }
                var4 = ((java.net.ProxySelector) (Object) stackIn_17_0).select(new java.net.URI(stackIn_17_4 + "://" + ((jk) this).field_a));
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
              stackOut_19_0 = ((jk) this).a(200);
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0;
            }
            L6: {
              boolean discarded$3 = var3.addAll((Collection) (Object) var4);
              if (param0) {
                break L6;
              } else {
                field_o = null;
                break L6;
              }
            }
            var6_array = var3.toArray();
            var7 = null;
            var8_array = var6_array;
            var9 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if (var8_array.length <= var9) {
                    break L9;
                  } else {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    try {
                      L10: {
                        var12_ref2 = this.a(var11, (byte) -38);
                        if (var13 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L10;
                        } else {
                          if (null == var12_ref2) {
                            decompiledRegionSelector0 = 2;
                            break L10;
                          } else {
                            stackOut_31_0 = (java.net.Socket) var12_ref2;
                            stackIn_32_0 = stackOut_31_0;
                            decompiledRegionSelector0 = 1;
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
                        var12 = (em) (Object) decompiledCaughtException;
                        var7 = (Object) (Object) var12;
                        decompiledRegionSelector0 = 2;
                        break L11;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      break L8;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        return stackIn_32_0;
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
                  break L8;
                } else {
                  throw jk.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
                }
              }
              stackOut_40_0 = ((jk) this).a(200);
              stackIn_41_0 = stackOut_40_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "jk.C(" + param0 + ')');
        }
        return stackIn_41_0;
    }

    private final java.net.Socket a(String param0, int param1, String param2, byte param3) throws IOException {
        RuntimeException var5 = null;
        java.net.Socket var5_ref = null;
        int var6 = 0;
        OutputStream var7 = null;
        BufferedReader var8 = null;
        String var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        java.net.Socket stackIn_17_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_16_0 = null;
        Object stackOut_37_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var13 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5_ref = new java.net.Socket(param2, param1);
                var6 = -29 % ((param3 - 14) / 46);
                var5_ref.setSoTimeout(10000);
                var7 = var5_ref.getOutputStream();
                if (param0 == null) {
                  break L2;
                } else {
                  var7.write(("CONNECT " + ((jk) this).field_a + ":" + ((jk) this).field_e + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var7.write(("CONNECT " + ((jk) this).field_a + ":" + ((jk) this).field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            L3: {
              var7.flush();
              var8 = new BufferedReader((Reader) (Object) new InputStreamReader(var5_ref.getInputStream()));
              var9 = var8.readLine();
              if (null != var9) {
                L4: {
                  if (var9.startsWith("HTTP/1.0 200")) {
                    break L4;
                  } else {
                    if (var9.startsWith("HTTP/1.1 200")) {
                      break L4;
                    } else {
                      L5: {
                        if (var9.startsWith("HTTP/1.0 407")) {
                          break L5;
                        } else {
                          if (var9.startsWith("HTTP/1.1 407")) {
                            break L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var10 = 0;
                      var11 = "proxy-authenticate: ";
                      var9 = var8.readLine();
                      L6: while (true) {
                        L7: {
                          if (var9 == null) {
                            break L7;
                          } else {
                            if (var10 >= 50) {
                              break L7;
                            } else {
                              if (!var9.toLowerCase().startsWith(var11)) {
                                var9 = var8.readLine();
                                var10++;
                                if (var13 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              } else {
                                L8: {
                                  var9 = var9.substring(var11.length()).trim();
                                  var12 = var9.indexOf(' ');
                                  if (var12 != -1) {
                                    var9 = var9.substring(0, var12);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                throw new em(var9);
                              }
                            }
                          }
                        }
                        throw new em("");
                      }
                    }
                  }
                }
                stackOut_16_0 = (java.net.Socket) var5_ref;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0;
              } else {
                break L3;
              }
            }
            var7.close();
            var8.close();
            var5_ref.close();
            stackOut_37_0 = null;
            stackIn_38_0 = stackOut_37_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var5;
            stackOut_39_1 = new StringBuilder().append("jk.I(");
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L9;
            }
          }
          L10: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param1).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L10;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param3 + ')');
        }
        return (java.net.Socket) (Object) stackIn_38_0;
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
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
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_15_0 = null;
        java.net.Socket stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        java.net.Socket stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_5_0 = null;
        java.net.Socket stackOut_1_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3_ref = param0.address();
              if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                L1: {
                  if (param1 == -38) {
                    break L1;
                  } else {
                    jk.c(-87);
                    break L1;
                  }
                }
                var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                if (param0.type() == java.net.Proxy.Type.HTTP) {
                  var5 = null;
                  try {
                    L2: {
                      L3: {
                        var6_ref = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var7 = var6_ref.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (null == var8) {
                          break L3;
                        } else {
                          var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                          var9.setAccessible(true);
                          if (!((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            break L3;
                          } else {
                            var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                            var10.setAccessible(true);
                            var11 = var6_ref.getDeclaredMethod("getHeaderValue", new Class[2]);
                            var11.setAccessible(true);
                            var12 = (String) var10.invoke(var8, new Object[0]);
                            var13 = (String) var11.invoke(var8, new Object[2]);
                            var5 = (Object) (Object) (var12 + ": " + var13);
                            break L3;
                          }
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
                  stackOut_22_0 = this.a((String) var5, var4_ref.getPort(), var4_ref.getHostName(), (byte) 101);
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0;
                } else {
                  if (param0.type() != java.net.Proxy.Type.SOCKS) {
                    stackOut_24_0 = null;
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  } else {
                    var5 = (Object) (Object) new java.net.Socket(param0);
                    ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((jk) this).field_a, ((jk) this).field_e));
                    stackOut_14_0 = var5;
                    stackIn_15_0 = stackOut_14_0;
                    return (java.net.Socket) (Object) stackIn_15_0;
                  }
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (java.net.Socket) (Object) stackIn_6_0;
              }
            } else {
              stackOut_1_0 = ((jk) this).a(param1 + 238);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("jk.H(");
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ')');
        }
        return (java.net.Socket) (Object) stackIn_25_0;
    }

    jk() {
        try {
            ((jk) this).field_k = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "jk.<init>()");
        }
    }

    public static void c(int param0) {
        try {
            field_q = null;
            field_i = null;
            field_m = null;
            int var1_int = -62 / ((param0 - 77) / 37);
            field_j = null;
            field_n = null;
            field_o = null;
            field_p = null;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "jk.F(" + param0 + ')');
        }
    }

    final static ob a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ob stackIn_3_0 = null;
        ob stackIn_8_0 = null;
        ob stackIn_16_0 = null;
        int stackIn_26_0 = 0;
        ob stackIn_36_0 = null;
        Object stackIn_40_0 = null;
        ob stackIn_58_0 = null;
        ob stackIn_66_0 = null;
        Object stackIn_70_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        ob stackOut_7_0 = null;
        ob stackOut_57_0 = null;
        ob stackOut_65_0 = null;
        Object stackOut_69_0 = null;
        ob stackOut_15_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        ob stackOut_35_0 = null;
        Object stackOut_39_0 = null;
        ob stackOut_2_0 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (var2_int > 64) {
                stackOut_7_0 = hg.field_i;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (param0.charAt(0) != 34) {
                  L1: {
                    var3 = 0;
                    var4 = 0;
                    if (param1 >= 112) {
                      break L1;
                    } else {
                      jk.c(-110);
                      break L1;
                    }
                  }
                  L2: while (true) {
                    L3: {
                      if (~var2_int >= ~var4) {
                        break L3;
                      } else {
                        L4: {
                          L5: {
                            var5 = param0.charAt(var4);
                            if (var5 == 46) {
                              L6: {
                                if (var4 == 0) {
                                  break L6;
                                } else {
                                  if (var2_int + -1 == var4) {
                                    break L6;
                                  } else {
                                    if (var3 != 0) {
                                      break L6;
                                    } else {
                                      var3 = 1;
                                      if (var6 == 0) {
                                        break L4;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_57_0 = je.field_M;
                              stackIn_58_0 = stackOut_57_0;
                              return stackIn_58_0;
                            } else {
                              break L5;
                            }
                          }
                          if (tb.field_a.indexOf(var5) == -1) {
                            stackOut_65_0 = je.field_M;
                            stackIn_66_0 = stackOut_65_0;
                            return stackIn_66_0;
                          } else {
                            var3 = 0;
                            break L4;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_69_0 = null;
                    stackIn_70_0 = stackOut_69_0;
                    break L0;
                  }
                } else {
                  if (34 != param0.charAt(-1 + var2_int)) {
                    stackOut_15_0 = je.field_M;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L7: while (true) {
                      L8: {
                        if (var2_int - 1 <= var4) {
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              var5 = param0.charAt(var4);
                              if (92 == var5) {
                                L11: {
                                  if (var3 != 0) {
                                    stackOut_25_0 = 0;
                                    stackIn_26_0 = stackOut_25_0;
                                    break L11;
                                  } else {
                                    stackOut_23_0 = 1;
                                    stackIn_26_0 = stackOut_23_0;
                                    break L11;
                                  }
                                }
                                var3 = stackIn_26_0;
                                if (var6 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              } else {
                                break L10;
                              }
                            }
                            L12: {
                              if (var5 != 34) {
                                break L12;
                              } else {
                                if (var3 == 0) {
                                  stackOut_35_0 = je.field_M;
                                  stackIn_36_0 = stackOut_35_0;
                                  return stackIn_36_0;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var3 = 0;
                            break L9;
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      stackOut_39_0 = null;
                      stackIn_40_0 = stackOut_39_0;
                      return (ob) (Object) stackIn_40_0;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = tf.field_H;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var2;
            stackOut_71_1 = new StringBuilder().append("jk.G(");
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L13;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L13;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param1 + ')');
        }
        return (ob) (Object) stackIn_70_0;
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

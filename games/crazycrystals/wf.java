/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.Socket;
import java.net.ProxySelector;
import java.net.URI;

final class wf extends tl {
    static String field_f;
    private java.net.ProxySelector field_g;
    static int field_h;

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                wf.c(59);
                break L1;
              }
            }
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "wf.G(" + param0 + ')');
        }
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
        Object stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_17_0 = null;
        Object stackOut_38_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var12 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var5_ref = new java.net.Socket(param0, param1);
              var5_ref.setSoTimeout(10000);
              var6 = var5_ref.getOutputStream();
              if (param3 <= 0) {
                break L1;
              } else {
                wf.c(-1);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2 == null) {
                  break L3;
                } else {
                  var6.write(("CONNECT " + ((wf) this).field_c + ":" + ((wf) this).field_d + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6.write(("CONNECT " + ((wf) this).field_c + ":" + ((wf) this).field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L2;
            }
            L4: {
              var6.flush();
              var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var5_ref.getInputStream()));
              var8 = var7.readLine();
              if (null != var8) {
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
                      var10 = "proxy-authenticate: ";
                      var8 = var7.readLine();
                      L7: while (true) {
                        L8: {
                          if (null == var8) {
                            break L8;
                          } else {
                            if (var9 >= 50) {
                              break L8;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L9: {
                                  var8 = var8.substring(var10.length()).trim();
                                  var11 = var8.indexOf(' ');
                                  if (-1 != var11) {
                                    var8 = var8.substring(0, var11);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                throw new va(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                if (var12 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        throw new va("");
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackOut_17_0 = (java.net.Socket) var5_ref;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0;
              } else {
                break L4;
              }
            }
            var6.close();
            var7.close();
            var5_ref.close();
            stackOut_38_0 = null;
            stackIn_39_0 = stackOut_38_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var5;
            stackOut_40_1 = new StringBuilder().append("wf.E(");
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L10;
            }
          }
          L11: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L11;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param3 + ')');
        }
        return (java.net.Socket) (Object) stackIn_39_0;
    }

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
        va var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_9_0 = 0;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        java.net.ProxySelector stackIn_14_0 = null;
        java.net.URI stackIn_14_1 = null;
        java.net.URI stackIn_14_2 = null;
        StringBuilder stackIn_14_3 = null;
        String stackIn_14_4 = null;
        java.net.ProxySelector stackIn_15_0 = null;
        java.net.URI stackIn_15_1 = null;
        java.net.URI stackIn_15_2 = null;
        StringBuilder stackIn_15_3 = null;
        java.net.ProxySelector stackIn_17_0 = null;
        java.net.URI stackIn_17_1 = null;
        java.net.URI stackIn_17_2 = null;
        StringBuilder stackIn_17_3 = null;
        java.net.ProxySelector stackIn_18_0 = null;
        java.net.URI stackIn_18_1 = null;
        java.net.URI stackIn_18_2 = null;
        StringBuilder stackIn_18_3 = null;
        String stackIn_18_4 = null;
        java.net.Socket stackIn_21_0 = null;
        java.net.Socket stackIn_26_0 = null;
        java.net.Socket stackIn_30_0 = null;
        java.net.Socket stackIn_42_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        java.net.ProxySelector stackOut_13_0 = null;
        java.net.URI stackOut_13_1 = null;
        java.net.URI stackOut_13_2 = null;
        StringBuilder stackOut_13_3 = null;
        String stackOut_13_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.ProxySelector stackOut_14_0 = null;
        java.net.URI stackOut_14_1 = null;
        java.net.URI stackOut_14_2 = null;
        StringBuilder stackOut_14_3 = null;
        java.net.ProxySelector stackOut_17_0 = null;
        java.net.URI stackOut_17_1 = null;
        java.net.URI stackOut_17_2 = null;
        StringBuilder stackOut_17_3 = null;
        String stackOut_17_4 = null;
        java.net.ProxySelector stackOut_15_0 = null;
        java.net.URI stackOut_15_1 = null;
        java.net.URI stackOut_15_2 = null;
        StringBuilder stackOut_15_3 = null;
        String stackOut_15_4 = null;
        java.net.Socket stackOut_20_0 = null;
        java.net.Socket stackOut_25_0 = null;
        java.net.Socket stackOut_29_0 = null;
        java.net.Socket stackOut_41_0 = null;
        var13 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var2_int = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
              if (var2_int == 0) {
                String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((wf) this).field_d != 443) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_9_0 = stackOut_6_0;
                break L2;
              }
            }
            var5 = stackIn_9_0;
            try {
              L3: {
                L4: {
                  stackOut_10_0 = ((wf) this).field_g;
                  stackOut_10_1 = null;
                  stackOut_10_2 = null;
                  stackOut_10_3 = new StringBuilder();
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_13_1 = stackOut_10_1;
                  stackIn_13_2 = stackOut_10_2;
                  stackIn_13_3 = stackOut_10_3;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  if (var5 == 0) {
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
                    stackOut_11_0 = (java.net.ProxySelector) (Object) stackIn_11_0;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = (StringBuilder) (Object) stackIn_11_3;
                    stackOut_11_4 = "https";
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_14_1 = stackOut_11_1;
                    stackIn_14_2 = stackOut_11_2;
                    stackIn_14_3 = stackOut_11_3;
                    stackIn_14_4 = stackOut_11_4;
                    break L4;
                  }
                }
                L5: {
                  var3 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + ((wf) this).field_c));
                  stackOut_14_0 = ((wf) this).field_g;
                  stackOut_14_1 = null;
                  stackOut_14_2 = null;
                  stackOut_14_3 = new StringBuilder();
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  stackIn_17_3 = stackOut_14_3;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  if (var5 == 0) {
                    stackOut_17_0 = (java.net.ProxySelector) (Object) stackIn_17_0;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = (StringBuilder) (Object) stackIn_17_3;
                    stackOut_17_4 = "https";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    stackIn_18_4 = stackOut_17_4;
                    break L5;
                  } else {
                    stackOut_15_0 = (java.net.ProxySelector) (Object) stackIn_15_0;
                    stackOut_15_1 = null;
                    stackOut_15_2 = null;
                    stackOut_15_3 = (StringBuilder) (Object) stackIn_15_3;
                    stackOut_15_4 = "http";
                    stackIn_18_0 = stackOut_15_0;
                    stackIn_18_1 = stackOut_15_1;
                    stackIn_18_2 = stackOut_15_2;
                    stackIn_18_3 = stackOut_15_3;
                    stackIn_18_4 = stackOut_15_4;
                    break L5;
                  }
                }
                var4 = ((java.net.ProxySelector) (Object) stackIn_18_0).select(new java.net.URI(stackIn_18_4 + "://" + ((wf) this).field_c));
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
              stackOut_20_0 = ((wf) this).a(96);
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0;
            }
            boolean discarded$3 = var3.addAll((Collection) (Object) var4);
            var6_array = var3.toArray();
            var7 = null;
            var8_array = var6_array;
            var9 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (~var9 <= ~var8_array.length) {
                    break L8;
                  } else {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    try {
                      L9: {
                        var12_ref2 = this.a(var11, (byte) -123);
                        stackOut_25_0 = (java.net.Socket) var12_ref2;
                        stackIn_42_0 = stackOut_25_0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var13 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L9;
                        } else {
                          if (stackIn_26_0 == null) {
                            decompiledRegionSelector0 = 2;
                            break L9;
                          } else {
                            stackOut_29_0 = (java.net.Socket) var12_ref2;
                            stackIn_30_0 = stackOut_29_0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          }
                        }
                      }
                    } catch (java.io.IOException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L11: {
                        var12_ref = (IOException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 2;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var12 = (va) (Object) decompiledCaughtException;
                        var7 = (Object) (Object) var12;
                        decompiledRegionSelector0 = 2;
                        break L10;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      break L7;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        return stackIn_30_0;
                      } else {
                        var9++;
                        if (var13 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (param0) {
                    break L12;
                  } else {
                    field_f = null;
                    break L12;
                  }
                }
                if (var7 == null) {
                  stackOut_41_0 = ((wf) this).a(14);
                  stackIn_42_0 = stackOut_41_0;
                  break L7;
                } else {
                  throw wf.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "wf.A(" + param0 + ')');
        }
        return stackIn_42_0;
    }

    wf() {
        try {
            ((wf) this).field_g = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "wf.<init>()");
        }
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
        java.net.Socket stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        java.net.Socket stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        Throwable decompiledCaughtException = null;
        java.net.Socket stackOut_3_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_26_0 = null;
        java.net.Socket stackOut_23_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (param0.type() == java.net.Proxy.Type.DIRECT) {
              stackOut_3_0 = ((wf) this).a(64);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 == -123) {
                var3_ref = param0.address();
                if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                  var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                  if (param0.type() != java.net.Proxy.Type.HTTP) {
                    if (param0.type() != java.net.Proxy.Type.SOCKS) {
                      stackOut_28_0 = null;
                      stackIn_29_0 = stackOut_28_0;
                      break L0;
                    } else {
                      var5 = (Object) (Object) new java.net.Socket(param0);
                      ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((wf) this).field_c, ((wf) this).field_d));
                      stackOut_26_0 = var5;
                      stackIn_27_0 = stackOut_26_0;
                      return (java.net.Socket) (Object) stackIn_27_0;
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
                          if (null != var8) {
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
                    stackOut_23_0 = this.a(var4_ref.getHostName(), var4_ref.getPort(), (String) var5, -38);
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0;
                  }
                } else {
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (java.net.Socket) (Object) stackIn_11_0;
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
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("wf.F(");
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L4;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ')');
        }
        return (java.net.Socket) (Object) stackIn_29_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "As you will soon see just here, rocks roll off each other too.";
        field_h = 500;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

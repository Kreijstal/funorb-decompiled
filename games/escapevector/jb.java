/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.Socket;
import java.net.ProxySelector;
import java.net.URI;

final class jb extends kb {
    static boolean field_p;
    static w field_r;
    static ed field_w;
    static String[] field_o;
    private java.net.ProxySelector field_n;
    static int[] field_y;
    static int[] field_x;
    static int[] field_v;
    static jk[] field_k;
    static int[] field_h;
    static int[] field_z;
    static int[] field_t;
    static mb[] field_i;
    static int[] field_u;
    static ci[] field_l;
    static int[] field_q;
    static int[] field_j;
    static int[] field_m;
    static int[] field_s;

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
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
        Object stackIn_8_0 = null;
        java.net.Socket stackIn_19_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_23_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_26_0 = null;
        java.net.Socket stackOut_18_0 = null;
        java.net.Socket stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3_ref = param0.address();
              if (!((Object) var3_ref instanceof java.net.InetSocketAddress)) {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (java.net.Socket) (Object) stackIn_8_0;
              } else {
                var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                if (param0.type() != java.net.Proxy.Type.HTTP) {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = (Object) (Object) new java.net.Socket(param0);
                    ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((jb) this).field_a, ((jb) this).field_b));
                    stackOut_23_0 = var5;
                    stackIn_24_0 = stackOut_23_0;
                    return (java.net.Socket) (Object) stackIn_24_0;
                  } else {
                    if (param1 < -61) {
                      stackOut_29_0 = null;
                      stackIn_30_0 = stackOut_29_0;
                      break L0;
                    } else {
                      stackOut_26_0 = null;
                      stackIn_27_0 = stackOut_26_0;
                      return (java.net.Socket) (Object) stackIn_27_0;
                    }
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
                        if (null == var8) {
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
                  stackOut_18_0 = this.a(var4_ref.getPort(), (String) var5, 37, var4_ref.getHostName());
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                }
              }
            } else {
              stackOut_1_0 = ((jb) this).b(false);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("jb.H(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L4;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param1 + ')');
        }
        return (java.net.Socket) (Object) stackIn_30_0;
    }

    final static String a(long param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        String stackIn_29_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        byte stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        String stackOut_28_0 = null;
        Object stackOut_5_0 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 <= 0L) {
                break L1;
              } else {
                if (param0 < 6582952005840035281L) {
                  if (param0 % 37L == 0L) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (String) (Object) stackIn_11_0;
                  } else {
                    var3_int = 0;
                    var4 = param0;
                    L2: while (true) {
                      L3: {
                        if (var4 == 0L) {
                          break L3;
                        } else {
                          var3_int++;
                          var4 = var4 / 37L;
                          if (var11 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var6 = new StringBuilder(var3_int);
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (0L == param0) {
                              break L6;
                            } else {
                              var7 = param0;
                              param0 = param0 / 37L;
                              var9 = tc.field_n[(int)(-(param0 * 37L) + var7)];
                              stackOut_17_0 = var9;
                              stackOut_17_1 = 95;
                              stackIn_25_0 = stackOut_17_0;
                              stackIn_25_1 = stackOut_17_1;
                              stackIn_18_0 = stackOut_17_0;
                              stackIn_18_1 = stackOut_17_1;
                              if (var11 != 0) {
                                break L5;
                              } else {
                                L7: {
                                  if (stackIn_18_0 == stackIn_18_1) {
                                    var10 = var6.length() + -1;
                                    var9 = 160;
                                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                StringBuilder discarded$3 = var6.append((char) var9);
                                if (var11 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          stackOut_24_0 = param1;
                          stackOut_24_1 = 29;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          break L5;
                        }
                        L8: {
                          if (stackIn_25_0 == stackIn_25_1) {
                            break L8;
                          } else {
                            String discarded$4 = jb.a(-73L, (byte) -11);
                            break L8;
                          }
                        }
                        StringBuilder discarded$5 = var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        stackOut_28_0 = var6.toString();
                        stackIn_29_0 = stackOut_28_0;
                        break L0;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = null;
            stackIn_6_0 = stackOut_5_0;
            return (String) (Object) stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "jb.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_29_0;
    }

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
        im var12 = null;
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
        java.net.Socket stackIn_25_0 = null;
        java.net.Socket stackIn_30_0 = null;
        java.net.Socket stackIn_39_0 = null;
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
        java.net.Socket stackOut_24_0 = null;
        java.net.Socket stackOut_29_0 = null;
        java.net.Socket stackOut_38_0 = null;
        var13 = EscapeVector.field_A;
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
              if (443 != ((jb) this).field_b) {
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
                  stackOut_9_0 = ((jb) this).field_n;
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
                  var3 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + ((jb) this).field_a));
                  stackOut_13_0 = ((jb) this).field_n;
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
                var4 = ((java.net.ProxySelector) (Object) stackIn_17_0).select(new java.net.URI(stackIn_17_4 + "://" + ((jb) this).field_a));
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
              stackOut_19_0 = ((jb) this).b(false);
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0;
            }
            boolean discarded$3 = var3.addAll((Collection) (Object) var4);
            var6_array = var3.toArray();
            var7 = null;
            var8_array = var6_array;
            var9 = param0;
            L6: while (true) {
              L7: {
                L8: {
                  if (var9 >= var8_array.length) {
                    break L8;
                  } else {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    try {
                      L9: {
                        var12_ref2 = this.a(var11, -76);
                        stackOut_24_0 = (java.net.Socket) var12_ref2;
                        stackIn_39_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var13 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L9;
                        } else {
                          if (stackIn_25_0 != null) {
                            stackOut_29_0 = (java.net.Socket) var12_ref2;
                            stackIn_30_0 = stackOut_29_0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          } else {
                            decompiledRegionSelector0 = 2;
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
                        var12 = (im) (Object) decompiledCaughtException;
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
                if (var7 == null) {
                  stackOut_38_0 = ((jb) this).b(false);
                  stackIn_39_0 = stackOut_38_0;
                  break L7;
                } else {
                  throw jb.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "jb.C(" + param0 + ')');
        }
        return stackIn_39_0;
    }

    public static void c(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_m = null;
              field_j = null;
              if (param0) {
                break L1;
              } else {
                String discarded$2 = jb.a(48L, (byte) -107);
                break L1;
              }
            }
            field_x = null;
            field_w = null;
            field_o = null;
            field_l = null;
            field_q = null;
            field_y = null;
            field_s = null;
            field_u = null;
            field_h = null;
            field_i = null;
            field_r = null;
            field_t = null;
            field_z = null;
            field_v = null;
            field_k = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "jb.D(" + param0 + ')');
        }
    }

    private final java.net.Socket a(int param0, String param1, int param2, String param3) throws IOException {
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
        var12 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              L2: {
                var5_ref = new java.net.Socket(param3, param0);
                var5_ref.setSoTimeout(10000);
                var6 = var5_ref.getOutputStream();
                if (param1 != null) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + ((jb) this).field_a + ":" + ((jb) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + ((jb) this).field_a + ":" + ((jb) this).field_b + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var5_ref.getInputStream()));
              if (param2 == 37) {
                break L3;
              } else {
                field_y = null;
                break L3;
              }
            }
            L4: {
              var8 = var7.readLine();
              if (var8 != null) {
                L5: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L5;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L6: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          break L6;
                        } else {
                          if (var8.startsWith("HTTP/1.1 407")) {
                            break L6;
                          } else {
                            break L4;
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
                                  if (var11 == -1) {
                                    break L9;
                                  } else {
                                    var8 = var8.substring(0, var11);
                                    break L9;
                                  }
                                }
                                throw new im(var8);
                              } else {
                                var8 = var7.readLine();
                                var9++;
                                if (var12 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        throw new im("");
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
            stackOut_40_1 = new StringBuilder().append("jb.F(").append(param0).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
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
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(param2).append(',');
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param3 == null) {
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
          throw t.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ')');
        }
        return (java.net.Socket) (Object) stackIn_39_0;
    }

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 88) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            if (param1 == 0) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (1 != param1) {
                if (param1 != 2) {
                  if (param1 == 3) {
                    stackOut_17_0 = 3;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    stackOut_19_0 = -1;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  }
                } else {
                  stackOut_12_0 = 2;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              } else {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "jb.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0;
    }

    jb() {
        try {
            ((jb) this).field_n = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "jb.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"Low-security Facility", "Deep Excavation", "Blue Defence", "Pod Defence", "Attractor Tunnel", "Moon Fuel Depot", "TNT Storage Cavern", "Force Matrix Defence", "Ice Labyrinth", "Seeker Caves", "High-security Stronghold", "Rock Buster Twister", "Small Ship Fuel Depot", "The Shafts", "Seeker Prison Cell", "Central Munition Cavern"};
        field_p = false;
        field_w = new ed(1, 1);
        field_z = new int[]{8, 17};
        field_v = new int[]{18, 19, 20, 21, 0, 1, 2, 3, 22, 23, 24, 25, 31, 30};
        field_h = new int[]{3, 3, 3, 3, 1, 1, 1, 1, 4, 4, 4, 4, 8, 8};
        field_t = new int[]{100, 100, 200, 300, 200, 500, 100, 300, 100, 500, 1000, 500, 500, 300, 500, 500, 500, 300, 50, 50, 100, 150, 100, 200, 300, 500, 200, 500, 500, 1000, 500, 100};
        field_j = new int[]{25000, 100000, 350000, 800000};
        field_x = new int[]{4, 5, 26, 27};
        field_y = new int[]{0, 0, 2, 2};
        field_m = new int[]{22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        field_u = new int[]{3, 7, 11, 15, 3, 7, 11, 15, 3, 7, 11, 15, 0, 10};
        field_q = new int[]{1, 1, 1, 1, 3, 3, 3, 1, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 8, 8, 8};
        field_s = new int[]{1, 1, 2, 3, 2, 5, 1, 3, 1, 5, 10, 5, 5, 3, 5, 5, 5, 3, 1, 1, 1, 1, 1, 2, 3, 5, 2, 5, 5, 10, 5, 1};
        cf.a((byte) -76);
        gi.a(0);
        jj.a(false);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

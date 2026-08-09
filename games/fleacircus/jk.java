/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

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
        int stackIn_5_0 = 0;
        java.net.ProxySelector stackIn_8_0;
        java.net.URI stackIn_8_1;
        java.net.URI stackIn_8_2;
        StringBuilder stackIn_8_3;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        String stackIn_9_4 = null;
        java.net.ProxySelector stackIn_11_0;
        java.net.URI stackIn_11_1;
        java.net.URI stackIn_11_2;
        StringBuilder stackIn_11_3;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        String stackIn_12_4;
        java.net.Socket stackIn_25_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        em var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = fleas.field_A ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (-444 != (this.field_e ^ -1)) {
            stackIn_5_0 = 0;
            break L1;
          } else {
            stackIn_5_0 = 1;
            break L1;
          }
        }
        var5 = stackIn_5_0;
        try {
          L2: {
            L3: {
              stackIn_8_0 = this.field_k;

              stackIn_8_1 = null;

              stackIn_8_2 = null;

              stackIn_8_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_9_0 = (java.net.ProxySelector) ((Object) stackIn_8_0);
                stackIn_9_1 = null;
                stackIn_9_2 = null;
                stackIn_9_3 = (StringBuilder) ((Object) stackIn_8_3);
                stackIn_9_4 = "http";
                break L3;
              } else {
                stackIn_9_0 = (java.net.ProxySelector) ((Object) stackIn_8_0);
                stackIn_9_1 = null;
                stackIn_9_2 = null;
                stackIn_9_3 = (StringBuilder) ((Object) stackIn_8_3);
                stackIn_9_4 = "https";
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + this.field_a));
              stackIn_11_0 = this.field_k;

              stackIn_11_1 = null;

              stackIn_11_2 = null;

              stackIn_11_3 = new StringBuilder();

              if (var5 != 0) {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "http";
                break L4;
              } else {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "https";
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + this.field_a));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(200);
        }
        L5: {
          var3.addAll((Collection) ((Object) var4));
          if (param0) {
            var6_array = var3.toArray();
            var7 = null;
            var8 = var6_array;
            var9 = 0;
            break L5;
          } else {
            field_o = (String) null;
            var6_array = var3.toArray();
            var7 = null;
            var8 = var6_array;
            var9 = 0;
            break L5;
          }
        }
        L6: while (true) {
          L7: {
            if (var8.length <= var9) {
              break L7;
            } else {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                L8: {
                  var12 = this.a(var11, (byte) -38);
                  if (var13 == 0) {
                    if (var12 == null) {
                      decompiledRegionSelector0 = 0;
                      break L8;
                    } else {
                      stackIn_25_0 = (java.net.Socket) (var12);
                      decompiledRegionSelector0 = 1;
                      break L8;
                    }
                  } else {
                    return this.a(200);
                  }
                }
              } catch (em decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L9: {
                  var12_ref = (em) (Object) decompiledCaughtException;
                  var7 = var12_ref;
                  decompiledRegionSelector0 = 0;
                  break L9;
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                L10: {
                  var12_ref2 = (IOException) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 0;
                  break L10;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                var9++;
                if (var13 == 0) {
                  continue L6;
                } else {
                  break L7;
                }
              } else {
                return stackIn_25_0;
              }
            }
          }
          if (var7 == null) {
            return this.a(200);
          } else {
            throw jk.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
          }
        }
    }

    private final java.net.Socket a(String param0, int param1, String param2, byte param3) throws IOException {
        java.net.Socket stackIn_11_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
        try {
          L0: {
            L1: {
              L2: {
                var14 = new java.net.Socket(param2, param1);
                var6 = -29 % ((param3 - 14) / 46);
                var14.setSoTimeout(10000);
                var7 = var14.getOutputStream();
                if (param0 == null) {
                  break L2;
                } else {
                  var7.write(("CONNECT " + this.field_a + ":" + this.field_e + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var7.write(("CONNECT " + this.field_a + ":" + this.field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            L3: {
              var7.flush();
              var8 = new BufferedReader((Reader) ((Object) new InputStreamReader(var14.getInputStream())));
              var15 = var8.readLine();
              if (var15 != null) {
                L4: {
                  if (var15.startsWith("HTTP/1.0 200")) {
                    break L4;
                  } else {
                    if (var15.startsWith("HTTP/1.1 200")) {
                      break L4;
                    } else {
                      L5: {
                        if (var15.startsWith("HTTP/1.0 407")) {
                          break L5;
                        } else {
                          if (var15.startsWith("HTTP/1.1 407")) {
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
                                  var16 = var9.substring(var11.length()).trim();
                                  var9 = var16;
                                  var12 = var16.indexOf(' ');
                                  if (0 != (var12 ^ -1)) {
                                    var9 = var16.substring(0, var12);
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
                stackIn_11_0 = (java.net.Socket) (var14);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L3;
              }
            }
            var7.close();
            var8.close();
            var14.close();
            stackIn_26_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("jk.I(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_26_0);
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        Exception exception = null;
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        Object var5 = null;
        Class var6 = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        java.net.Socket stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                L1: {
                  if (param1 == -38) {
                    break L1;
                  } else {
                    jk.c(-87);
                    break L1;
                  }
                }
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param0.type() == java.net.Proxy.Type.HTTP) {
                  var5 = null;
                  try {
                    L2: {
                      L3: {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6 = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                        if (var8 == null) {
                          break L3;
                        } else {
                          var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var9.setAccessible(true);
                          if (!((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            break L3;
                          } else {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                            var5 = var12 + ": " + var13;
                            break L3;
                          }
                        }
                      }
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      exception = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  stackIn_20_0 = this.a((String) (var5), var4.getPort(), var4.getHostName(), (byte) 101);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param0);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_e)));
                    stackIn_12_0 = var5;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.a(param1 + 238);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3_ref);

            stackIn_24_1 = new StringBuilder().append("jk.H(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.net.Socket) ((Object) stackIn_12_0);
            } else {
              return stackIn_20_0;
            }
          }
        }
    }

    jk() {
        this.field_k = java.net.ProxySelector.getDefault();
    }

    public static void c(int param0) {
        field_q = null;
        field_i = null;
        field_m = null;
        int var1 = -62 / ((param0 - 77) / 37);
        field_j = null;
        field_n = (byte[][]) null;
        field_o = null;
        field_p = null;
    }

    final static ob a(String param0, byte param1) {
        ob stackIn_3_0 = null;
        ob stackIn_7_0 = null;
        ob stackIn_12_0 = null;
        int stackIn_21_0 = 0;
        ob stackIn_26_0 = null;
        Object stackIn_30_0 = null;
        ob stackIn_42_0 = null;
        ob stackIn_47_0 = null;
        Object stackIn_51_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length();
                        if (var2_int != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = tf.field_H;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (-65 > (var2_int ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = hg.field_i;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        if (param0.charAt(0) != 34) {
                            statePc = 31;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (34 != param0.charAt(-1 + var2_int)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = je.field_M;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        var3 = 0;
                        var4 = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var2_int - 1 > var4) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5 = param0.charAt(var4);
                        if (92 == var5) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var3 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_21_0 = 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3 = stackIn_21_0;
                        if (var6 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var5 != 34) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var3 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = je.field_M;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    try {
                        var3 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = null;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return (ob) ((Object) stackIn_30_0);
                }
                case 31: {
                    try {
                        var3 = 0;
                        var4 = 0;
                        if (param1 >= 112) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        jk.c(-110);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var2_int > var4) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = param0.charAt(var4);
                        if (var5 == 46) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var4 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var2_int + -1 == var4) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var3 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = je.field_M;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 42: {
                    return stackIn_42_0;
                }
                case 43: {
                    try {
                        var3 = 1;
                        if (var6 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (0 == (tb.field_a.indexOf(var5) ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = je.field_M;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return stackIn_47_0;
                }
                case 48: {
                    try {
                        var3 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = null;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    return (ob) ((Object) stackIn_51_0);
                }
                case 52: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_54_0 = (RuntimeException) (var2);
                    stackIn_53_0 = stackIn_54_0;
                    stackIn_54_1 = new StringBuilder().append("jk.G(");
                    stackIn_53_1 = stackIn_54_1;
                    if (param0 == null) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_55_0 = (RuntimeException) ((Object) stackIn_53_0);
                    stackIn_55_1 = (StringBuilder) ((Object) stackIn_53_1);
                    stackIn_55_2 = "{...}";
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
                    stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
                    stackIn_55_2 = "null";
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    throw pf.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
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

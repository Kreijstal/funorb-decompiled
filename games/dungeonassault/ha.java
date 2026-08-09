/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ha extends um {
    static String[] field_n;
    static String[] field_j;
    private java.net.ProxySelector field_m;
    static String field_o;
    static lc field_k;
    static String[] field_l;

    final static void d(int param0) {
        vf.field_w = 620;
        qc.field_w = 240;
        kn.field_g = true;
        id.field_l = null;
        gk.field_L = null;
        wi.field_kb = 0;
        jn.field_l = null;
        hc.field_b = 0;
        h.field_f = null;
        ui.field_a = 0;
        ce.field_p = -1;
        bl.field_l = null;
        pp.field_K = new md();
        ti.field_A = sj.a(dh.field_a, 37);
        ti.field_A.field_v = 1;
        tk.field_k = sj.a(fl.field_i, 107);
        ec.field_n = sj.a(wm.field_h, 59);
        ec.field_n.field_v = param0;
        pp.field_K.a(ti.field_A, false);
        pp.field_K.a(tk.field_k, false);
        pp.field_K.a(ec.field_n, false);
        o.field_n.a(1);
    }

    private final java.net.Socket a(int param0, byte param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_9_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param2, param0);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param3 == null) {
                var6.write(("CONNECT " + this.field_a + ":" + this.field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_a + ":" + this.field_f + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              var14 = var7.readLine();
              if (var14 == null) {
                break L2;
              } else {
                L3: {
                  if (var14.startsWith("HTTP/1.0 200")) {
                    break L3;
                  } else {
                    if (var14.startsWith("HTTP/1.1 200")) {
                      break L3;
                    } else {
                      L4: {
                        if (var14.startsWith("HTTP/1.0 407")) {
                          break L4;
                        } else {
                          if (var14.startsWith("HTTP/1.1 407")) {
                            break L4;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
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
                                  if ((var11 ^ -1) != 0) {
                                    var8 = var15.substring(0, var11);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                throw new wl(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                continue L5;
                              }
                            }
                          }
                        }
                        throw new wl("");
                      }
                    }
                  }
                }
                stackIn_9_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L8: {
              var6.close();
              var7.close();
              if (param1 >= 6) {
                break L8;
              } else {
                ha.d(66);
                break L8;
              }
            }
            var13.close();
            stackIn_27_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("ha.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_27_0);
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        int stackIn_8_0 = 0;
        java.net.ProxySelector stackIn_11_0;
        java.net.URI stackIn_11_1;
        java.net.URI stackIn_11_2;
        StringBuilder stackIn_11_3;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        String stackIn_12_4 = null;
        java.net.ProxySelector stackIn_14_0;
        java.net.URI stackIn_14_1;
        java.net.URI stackIn_14_2;
        StringBuilder stackIn_14_3;
        java.net.ProxySelector stackIn_15_0;
        java.net.URI stackIn_15_1;
        java.net.URI stackIn_15_2;
        StringBuilder stackIn_15_3;
        String stackIn_15_4;
        java.net.Socket stackIn_24_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
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
        wl var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = DungeonAssault.field_K;
        var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
        if (param0 == 13905) {
          L0: {
            if (var2 == 0) {
              System.setProperty("java.net.useSystemProxies", "true");
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (443 != this.field_f) {
              stackIn_8_0 = 0;
              break L1;
            } else {
              stackIn_8_0 = 1;
              break L1;
            }
          }
          var5 = stackIn_8_0;
          try {
            L2: {
              L3: {
                stackIn_11_0 = this.field_m;

                stackIn_11_1 = null;

                stackIn_11_2 = null;

                stackIn_11_3 = new StringBuilder();

                if (var5 != 0) {
                  stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                  stackIn_12_1 = null;
                  stackIn_12_2 = null;
                  stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                  stackIn_12_4 = "https";
                  break L3;
                } else {
                  stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                  stackIn_12_1 = null;
                  stackIn_12_2 = null;
                  stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                  stackIn_12_4 = "http";
                  break L3;
                }
              }
              L4: {
                var3 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + this.field_a));
                stackIn_14_0 = this.field_m;

                stackIn_14_1 = null;

                stackIn_14_2 = null;

                stackIn_14_3 = new StringBuilder();

                if (var5 != 0) {
                  stackIn_15_0 = (java.net.ProxySelector) ((Object) stackIn_14_0);
                  stackIn_15_1 = null;
                  stackIn_15_2 = null;
                  stackIn_15_3 = (StringBuilder) ((Object) stackIn_14_3);
                  stackIn_15_4 = "http";
                  break L4;
                } else {
                  stackIn_15_0 = (java.net.ProxySelector) ((Object) stackIn_14_0);
                  stackIn_15_1 = null;
                  stackIn_15_2 = null;
                  stackIn_15_3 = (StringBuilder) ((Object) stackIn_14_3);
                  stackIn_15_4 = "https";
                  break L4;
                }
              }
              var4 = ((java.net.ProxySelector) (Object) stackIn_15_0).select(new java.net.URI(stackIn_15_4 + "://" + this.field_a));
              break L2;
            }
          } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
            return this.a(-27549);
          }
          var3.addAll((Collection) ((Object) var4));
          var6_array = var3.toArray();
          var7 = null;
          var8 = var6_array;
          var9 = 0;
          L5: while (true) {
            if (var8.length <= var9) {
              if (var7 != null) {
                throw ha.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
              } else {
                return this.a(-27549);
              }
            } else {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                L6: {
                  var12 = this.a(var11, param0 + -13285);
                  if (var12 != null) {
                    stackIn_24_0 = (java.net.Socket) (var12);
                    decompiledRegionSelector0 = 1;
                    break L6;
                  } else {
                    var9++;
                    decompiledRegionSelector0 = 0;
                    break L6;
                  }
                }
              } catch (wl decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var12_ref = (wl) (Object) decompiledCaughtException;
                  var7 = var12_ref;
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                L8: {
                  var12_ref2 = (IOException) (Object) decompiledCaughtException;
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                continue L5;
              } else {
                return stackIn_24_0;
              }
            }
          }
        } else {
          return (java.net.Socket) null;
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        Object var5 = null;
        Class var6 = null;
        Exception var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        try {
          L0: {
            if (param0.type() == java.net.Proxy.Type.DIRECT) {
              stackIn_3_0 = this.a(-27549);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                L1: {
                  if (param1 == 620) {
                    break L1;
                  } else {
                    field_o = (String) null;
                    break L1;
                  }
                }
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param0.type() != java.net.Proxy.Type.HTTP) {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param0);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_f)));
                    stackIn_22_0 = var5;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
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
                          if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                            var5 = var12 + ": " + var13;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var6_ref = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  stackIn_18_0 = this.a(var4.getPort(), (byte) 113, var4.getHostName(), (String) (var5));
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3_ref);

            stackIn_26_1 = new StringBuilder().append("ha.D(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_22_0);
          }
        }
    }

    final static boolean b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        var1 = in.field_C;
        synchronized (var1) {
          L0: {
            if (je.field_i == pj.field_x) {
              stackIn_4_0 = 0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                mm.field_t = jk.field_Db[je.field_i];
                ob.field_Yb = b.field_a[je.field_i];
                je.field_i = 127 & je.field_i + 1;
                if (param0 == 47) {
                  break L1;
                } else {
                  field_j = (String[]) null;
                  break L1;
                }
              }
              stackIn_8_0 = 1;
              break L0;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    final static double a(byte param0) {
        if (param0 != -21) {
            return -1.090574406064165;
        }
        return ld.field_f.nextDouble();
    }

    public static void c(int param0) {
        field_o = null;
        field_k = null;
        field_j = null;
        int var1 = -122 / ((param0 - 7) / 48);
        field_n = null;
        field_l = null;
    }

    ha() {
        this.field_m = java.net.ProxySelector.getDefault();
    }

    static {
        field_j = new String[]{"Hoard Room", "You have reached the <%highlight>hoard room</col>! You can now select <%highlight>how much gold you wish to steal</col>. For every ten pieces of gold you steal, you will gain <%highlight>one point of Renown</col> - but the chance of waking the dragon increases as your raiders become more ambitious! If the Dragon wakes, <%highlight>some of your raiders may be killed</col>."};
        field_o = "Connection lost - attempting to reconnect";
        field_n = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_l = new String[]{"Harden Raider", "Double target <%defence> in the next room. (Single use)"};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

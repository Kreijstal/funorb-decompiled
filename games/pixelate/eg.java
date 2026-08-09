/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class eg extends eh {
    static int[] field_h;
    static int[] field_l;
    static ak field_k;
    static wi field_n;
    private java.net.ProxySelector field_m;
    static java.awt.Frame field_i;
    static java.awt.Frame field_j;

    private final java.net.Socket a(int param0, String param1, String param2, byte param3) throws IOException {
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
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 >= 92) {
                break L1;
              } else {
                eg.f(125);
                break L1;
              }
            }
            L2: {
              var13 = new java.net.Socket(param1, param0);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param2 != null) {
                var6.write(("CONNECT " + this.field_b + ":" + this.field_e + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L2;
              } else {
                var6.write(("CONNECT " + this.field_b + ":" + this.field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L2;
              }
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              var14 = var7.readLine();
              var8 = var14;
              var8 = var14;
              if (var14 == null) {
                break L3;
              } else {
                L4: {
                  if (var14.startsWith("HTTP/1.0 200")) {
                    break L4;
                  } else {
                    if (!var14.startsWith("HTTP/1.1 200")) {
                      L5: {
                        if (var14.startsWith("HTTP/1.0 407")) {
                          break L5;
                        } else {
                          if (!var14.startsWith("HTTP/1.1 407")) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var9 = 0;
                      var8 = var7.readLine();
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
                      L6: while (true) {
                        L7: {
                          if (var8 == null) {
                            break L7;
                          } else {
                            if (50 <= var9) {
                              break L7;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L8: {
                                  var15 = var8.substring(var10.length()).trim();
                                  var8 = var15;
                                  var8 = var15;
                                  var8 = var15;
                                  var11 = var15.indexOf(' ');
                                  if ((var11 ^ -1) == 0) {
                                    break L8;
                                  } else {
                                    var8 = var15.substring(0, var11);
                                    break L8;
                                  }
                                }
                                throw new uf(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                continue L6;
                              }
                            }
                          }
                        }
                        throw new uf("");
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                stackIn_11_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            stackIn_26_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("eg.H(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_26_0);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, java.applet.Applet param4, String[] param5) {
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              al.field_g = param4.getParameter("overxgames");
              if (null != al.field_g) {
                break L1;
              } else {
                al.field_g = "0";
                break L1;
              }
            }
            L2: {
              bl.field_g = param4.getParameter("overxachievements");
              if (null != bl.field_g) {
                break L2;
              } else {
                bl.field_g = "0";
                break L2;
              }
            }
            L3: {
              var6 = param4.getParameter("currency");
              if (var6 == null) {
                gb.field_c = 2;
                break L3;
              } else {
                if (!td.a(param0 + -12, (CharSequence) ((Object) var6))) {
                  gb.field_c = 2;
                  break L3;
                } else {
                  gb.field_c = na.a((CharSequence) ((Object) var6), (byte) -33);
                  break L3;
                }
              }
            }
            in.field_t = param2;
            gq.field_n = param1;
            ug.field_k = param3;
            li.field_a = new tf[param5.length];
            var7 = 0;
            L4: while (true) {
              if (param5.length <= var7) {
                L5: {
                  if (param0 == -94) {
                    break L5;
                  } else {
                    field_h = (int[]) null;
                    break L5;
                  }
                }
                tm.field_S = param5;
                break L0;
              } else {
                li.field_a[var7] = new tf(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6_ref);

            stackIn_19_1 = new StringBuilder().append("eg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param5 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
    }

    final static String f(int param0) {
        if (rj.field_F == tm.field_X) {
            return vp.field_Nb;
        }
        if (param0 != 8192) {
            field_n = (wi) null;
        }
        if (!(qo.field_n != rj.field_F)) {
            return uh.field_m;
        }
        if (!an.field_e.d(79)) {
            return uh.field_m;
        }
        return h.field_U;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var9 = new int[256];
            var13 = var9;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                gd.field_f = new tf[50];
                var2 = -48 / ((param0 - 31) / 39);
                var3 = 0;
                L2: while (true) {
                  if (50 <= var3) {
                    break L0;
                  } else {
                    gd.field_f[var3] = new tf(63, 63);
                    gd.field_f[var3].c();
                    var4 = (double)var3 * 6.283185307179586 / 50.0;
                    var6 = (int)(16.0 * Math.sin(var4)) >> 1552058433;
                    t.a(512, 512, 48 + var6 << 1696985476, 255, var13);
                    var7 = 0;
                    L3: while (true) {
                      if (t.field_k.length <= var7) {
                        var7 = 0;
                        L4: while (true) {
                          if (-6 >= (var7 ^ -1)) {
                            var3++;
                            continue L2;
                          } else {
                            t.b();
                            var7++;
                            continue L4;
                          }
                        }
                      } else {
                        t.field_k[var7] = 16777215 + -t.field_k[var7];
                        var7++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var9[var2] = var2 * 65793;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "eg.D(" + param0 + ')');
        }
    }

    final java.net.Socket a(int param0) throws IOException {
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
        java.net.Socket stackIn_21_0 = null;
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
        uf var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = Pixelate.field_H ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (443 != this.field_e) {
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
              stackIn_8_0 = this.field_m;

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
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + this.field_b));
              stackIn_11_0 = this.field_m;

              stackIn_11_1 = null;

              stackIn_11_2 = null;

              stackIn_11_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "https";
                break L4;
              } else {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "http";
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + this.field_b));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b(-2);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        var9 = 0;
        L5: while (true) {
          if (var8.length <= var9) {
            L6: {
              if (param0 >= 114) {
                break L6;
              } else {
                field_n = (wi) null;
                break L6;
              }
            }
            if (var7 == null) {
              return this.b(-2);
            } else {
              throw eg.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              L7: {
                var12 = this.a(var11, 26251);
                if (var12 != null) {
                  stackIn_21_0 = (java.net.Socket) (var12);
                  decompiledRegionSelector0 = 1;
                  break L7;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              }
            } catch (uf decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var12_ref = (uf) (Object) decompiledCaughtException;
                var7 = var12_ref;
                var9++;
                decompiledRegionSelector0 = 0;
                break L8;
              }
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L9: {
                var12_ref2 = (IOException) (Object) decompiledCaughtException;
                var9++;
                decompiledRegionSelector0 = 0;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue L5;
            } else {
              return stackIn_21_0;
            }
          }
        }
    }

    final static void e(int param0) {
        int var1 = 0;
        if (-225 >= (wn.field_u ^ -1)) {
            jg.a(256, 114);
        } else {
            var1 = wn.field_u % 32;
            jg.a(wn.field_u + (32 + -var1), param0 ^ -4847);
        }
        if (param0 != -4767) {
            field_h = (int[]) null;
        }
    }

    public static void g(int param0) {
        if (param0 != -6835) {
            return;
        }
        field_i = null;
        field_k = null;
        field_j = null;
        field_n = null;
        field_h = null;
        field_l = null;
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param0--;
              if (0 > param0) {
                L2: {
                  if (param1 == 1022226145) {
                    break L2;
                  } else {
                    eg.e(-111);
                    break L2;
                  }
                }
                break L0;
              } else {
                var9 = param3;
                var5 = var9;
                var6 = param2;
                var7 = param4;
                var9[var6] = var7 - -cm.a(var9[var6] >> 1022226145, 8355711);
                param2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("eg.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
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
        Object stackIn_10_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param0.type() == java.net.Proxy.Type.HTTP) {
                  var5 = null;
                  try {
                    L1: {
                      L2: {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6 = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                        if (var8 == null) {
                          break L2;
                        } else {
                          var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var9.setAccessible(true);
                          if (!((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            break L2;
                          } else {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_b + "/"), "https"}));
                            var5 = var12 + ": " + var13;
                            break L2;
                          }
                        }
                      }
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  stackIn_18_0 = this.a(var4.getPort(), var4.getHostName(), (String) (var5), (byte) 115);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param0);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_e)));
                    stackIn_10_0 = var5;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (param1 != 26251) {
                      field_h = (int[]) null;
                      stackIn_22_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.b(param1 ^ -26251);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3_ref);

            stackIn_25_1 = new StringBuilder().append("eg.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.net.Socket) ((Object) stackIn_10_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return (java.net.Socket) ((Object) stackIn_22_0);
              }
            }
          }
        }
    }

    eg() {
        this.field_m = java.net.ProxySelector.getDefault();
    }

    static {
        field_l = new int[8192];
        field_h = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

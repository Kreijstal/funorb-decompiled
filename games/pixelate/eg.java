/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class eg extends eh {
    static int[] field_h;
    static int[] field_l;
    static ak field_k;
    static wi field_n;
    private java.net.ProxySelector field_m;
    static java.awt.Frame field_i;
    static java.awt.Frame field_j;

    private final java.net.Socket a(int param0, String param1, String param2, byte param3) throws IOException {
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
        L0: {
          var12 = Pixelate.field_H ? 1 : 0;
          if (param3 >= 92) {
            break L0;
          } else {
            String discarded$1 = eg.f(125);
            break L0;
          }
        }
        L1: {
          var13 = new java.net.Socket(param1, param0);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param2 != null) {
            var6.write(("CONNECT " + ((eg) this).field_b + ":" + ((eg) this).field_e + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L1;
          } else {
            var6.write(("CONNECT " + ((eg) this).field_b + ":" + ((eg) this).field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L1;
          }
        }
        L2: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var14 = var7.readLine();
          var8 = var14;
          var8 = var14;
          if (var14 == null) {
            break L2;
          } else {
            L3: {
              if (var14.startsWith("HTTP/1.0 200")) {
                break L3;
              } else {
                if (!var14.startsWith("HTTP/1.1 200")) {
                  L4: {
                    if (var14.startsWith("HTTP/1.0 407")) {
                      break L4;
                    } else {
                      if (!var14.startsWith("HTTP/1.1 407")) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var9 = 0;
                  var8 = var7.readLine();
                  var10 = "proxy-authenticate: ";
                  var8 = var10;
                  var8 = var10;
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
                              var8 = var15;
                              var11 = var15.indexOf(' ');
                              if ((var11 ^ -1) == 0) {
                                break L7;
                              } else {
                                var8 = var15.substring(0, var11);
                                break L7;
                              }
                            }
                            throw new uf(var8);
                          } else {
                            var9++;
                            var8 = var7.readLine();
                            continue L5;
                          }
                        }
                      }
                    }
                    throw new uf("");
                  }
                } else {
                  break L3;
                }
              }
            }
            return var13;
          }
        }
        var6.close();
        var7.close();
        var13.close();
        return null;
    }

    final static void a(byte param0, int param1, int param2, int param3, java.applet.Applet param4, String[] param5) {
        int var7 = 0;
        int var8 = Pixelate.field_H ? 1 : 0;
        al.field_g = param4.getParameter("overxgames");
        if (null == al.field_g) {
            al.field_g = "0";
        }
        bl.field_g = param4.getParameter("overxachievements");
        if (null == bl.field_g) {
            bl.field_g = "0";
        }
        String var6 = param4.getParameter("currency");
        if (var6 == null) {
            gb.field_c = 2;
        } else {
            if (!td.a(param0 + -12, (CharSequence) (Object) var6)) {
                gb.field_c = 2;
            } else {
                gb.field_c = na.a((CharSequence) (Object) var6, (byte) -33);
            }
        }
        in.field_t = param2;
        gq.field_n = param1;
        ug.field_k = param3;
        li.field_a = new tf[param5.length];
        for (var7 = 0; param5.length > var7; var7++) {
            li.field_a[var7] = new tf(317, 34);
        }
        if (param0 != -94) {
            field_h = null;
        }
        tm.field_S = param5;
    }

    final static String f(int param0) {
        if (rj.field_F == tm.field_X) {
            return vp.field_Nb;
        }
        if (param0 != 8192) {
            field_n = null;
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
        int var8 = Pixelate.field_H ? 1 : 0;
        int[] var9 = new int[256];
        int[] var13 = var9;
        for (var2 = 0; var2 < 256; var2++) {
            var9[var2] = var2 * 65793;
        }
        gd.field_f = new tf[50];
        var2 = -48 / ((param0 - 31) / 39);
        for (var3 = 0; 50 > var3; var3++) {
            gd.field_f[var3] = new tf(63, 63);
            gd.field_f[var3].c();
            var4 = (double)var3 * 6.283185307179586 / 50.0;
            var6 = (int)(16.0 * Math.sin(var4)) >> 1552058433;
            t.a(512, 512, 48 + var6 << 1696985476, 255, var13);
            for (var7 = 0; t.field_k.length > var7; var7++) {
                t.field_k[var7] = 16777215 + -t.field_k[var7];
            }
            for (var7 = 0; -6 < (var7 ^ -1); var7++) {
                t.b();
            }
        }
    }

    final java.net.Socket a(int param0) throws IOException {
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
        uf var12 = null;
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
        java.net.Socket stackIn_21_0 = null;
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
        java.net.Socket stackOut_20_0 = null;
        L0: {
          var13 = Pixelate.field_H ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (443 != ((eg) this).field_e) {
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
              stackOut_6_0 = ((eg) this).field_m;
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
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + ((eg) this).field_b));
              stackOut_9_0 = ((eg) this).field_m;
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
              if (var5 == 0) {
                stackOut_11_0 = (java.net.ProxySelector) (Object) stackIn_11_0;
                stackOut_11_1 = null;
                stackOut_11_2 = null;
                stackOut_11_3 = (StringBuilder) (Object) stackIn_11_3;
                stackOut_11_4 = "https";
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
                stackOut_10_4 = "http";
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                stackIn_12_4 = stackOut_10_4;
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + ((eg) this).field_b));
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((eg) this).b(-2);
        }
        boolean discarded$3 = var3.addAll((Collection) (Object) var4);
        var6_array = var3.toArray();
        var7 = null;
        var8_array = var6_array;
        var9 = 0;
        L5: while (true) {
          if (var8_array.length <= var9) {
            L6: {
              if (param0 >= 114) {
                break L6;
              } else {
                field_n = null;
                break L6;
              }
            }
            if (var7 == null) {
              return ((eg) this).b(-2);
            } else {
              throw eg.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                var12_ref2 = this.a(var11, 26251);
                if (var12_ref2 != null) {
                  stackOut_20_0 = (java.net.Socket) var12_ref2;
                  stackIn_21_0 = stackOut_20_0;
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
                var12 = (uf) (Object) decompiledCaughtException;
                var7 = (Object) (Object) var12;
                var9++;
                decompiledRegionSelector0 = 0;
                break L8;
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
            field_h = null;
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
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Pixelate.field_H ? 1 : 0;
        while (true) {
            param0--;
            if (0 > param0) {
                break;
            }
            var9 = param3;
            int[] var5 = var9;
            var6 = param2;
            var7 = param4;
            var9[var6] = var7 - -cm.a(var9[var6] >> 1022226145, 8355711);
            param2++;
        }
        if (param1 != 1022226145) {
            eg.e(-111);
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
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
            var4_ref = (java.net.InetSocketAddress) (Object) var3;
            if (param0.type() == java.net.Proxy.Type.HTTP) {
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
                      if (!((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                        break L1;
                      } else {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (Object) (Object) (var12 + ": " + var13);
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
              return this.a(var4_ref.getPort(), var4_ref.getHostName(), (String) var5, (byte) 115);
            } else {
              if (param0.type() == java.net.Proxy.Type.SOCKS) {
                var5 = (Object) (Object) new java.net.Socket(param0);
                ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((eg) this).field_b, ((eg) this).field_e));
                return (java.net.Socket) var5;
              } else {
                if (param1 != 26251) {
                  field_h = null;
                  return null;
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return ((eg) this).b(param1 ^ -26251);
        }
    }

    eg() {
        ((eg) this).field_m = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[8192];
        field_h = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

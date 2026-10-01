/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class cd extends jg {
    static dm field_l;
    static int field_j;
    private java.net.ProxySelector field_k;
    static ck field_i;
    static rh field_m;

    final static void a(byte param0) {
        int var2;
        var2 = Geoblox.field_C;
        if (param0 <= 75) {
          field_m = (rh) null;
        }
        if ((c.field_ab ^ -1) == -5) {
          ec.field_c = hi.field_F;
          mf.field_a = ca.field_g;
        } else {
          if (c.field_ab == 1) {
            mf.field_a = fe.field_j;
            ec.field_c = ne.field_b;
          } else {
            if (c.field_ab == 3) {
              ec.field_c = sl.field_c;
              mf.field_a = sg.field_e;
            } else {
              if (c.field_ab != 0) {
                if (6 != c.field_ab) {
                  if (c.field_ab != 5) {
                    if (2 == c.field_ab) {
                      mf.field_a = pi.field_O;
                      ec.field_c = lb.field_d;
                    }
                  } else {
                    mf.field_a = th.field_f;
                    ec.field_c = hd.field_H;
                  }
                } else {
                  ec.field_c = fl.field_a;
                  mf.field_a = df.field_a;
                }
              } else {
                mf.field_a = bj.field_r;
                ec.field_c = kj.field_E;
              }
            }
          }
        }
    }

    public static void e(int param0) {
        if (param0 != 1353) {
            return;
        }
        field_m = null;
        field_l = null;
        field_i = null;
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_12_0 = null;
        java.net.Socket stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
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
          if (param0.type() != java.net.Proxy.Type.DIRECT) {
            var3 = param0.address();
            if (param1 != -18) {
              field_l = (dm) null;
            }
            if ((Object) var3 instanceof java.net.InetSocketAddress) {
              var4 = (java.net.InetSocketAddress) ((Object) var3);
              if (param0.type() == java.net.Proxy.Type.HTTP) {
                var5 = null;
                try {
                  var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                  var6 = var14;
                  var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                  var7.setAccessible(true);
                  var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                  if (var8 != null) {
                    var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                    var9.setAccessible(true);
                    if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                      var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                      var10.setAccessible(true);
                      var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                      var11.setAccessible(true);
                      var12 = (String) (var10.invoke(var8, new Object[]{}));
                      var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_e + "/"), "https"}));
                      var5 = var12 + ": " + var13;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6_ref = (Exception) (Object) decompiledCaughtException;
                }
                stackIn_22_0 = this.a((byte) -60, (String) (var5), var4.getPort(), var4.getHostName());
                decompiledRegionSelector0 = 2;
              } else {
                if (param0.type() == java.net.Proxy.Type.SOCKS) {
                  var5 = new java.net.Socket(param0);
                  ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_e, this.field_b)));
                  stackIn_12_0 = var5;
                  decompiledRegionSelector0 = 1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            stackIn_2_0 = this.a(1);
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = (RuntimeException) (var3_ref);

          stackIn_25_1 = new StringBuilder().append("cd.L(");

          if (param0 == null) {
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
            stackIn_26_2 = "null";
          } else {
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_12_0);
          } else {
            return stackIn_22_0;
          }
        }
    }

    final java.net.Socket b(int param0) throws IOException {
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
        bd var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = Geoblox.field_C;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        if (-444 != (this.field_b ^ -1)) {
          stackIn_5_0 = 0;
        } else {
          stackIn_5_0 = 1;
        }
        var5 = stackIn_5_0;
        try {
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
          } else {
            stackIn_9_0 = (java.net.ProxySelector) ((Object) stackIn_8_0);
            stackIn_9_1 = null;
            stackIn_9_2 = null;
            stackIn_9_3 = (StringBuilder) ((Object) stackIn_8_3);
            stackIn_9_4 = "https";
          }
          var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_9_3).append(stackIn_9_4).append("://").append(this.field_e).toString()));
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
          } else {
            stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
            stackIn_12_1 = null;
            stackIn_12_2 = null;
            stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
            stackIn_12_4 = "https";
          }
          var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_12_3).append(stackIn_12_4).append("://").append(this.field_e).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(1);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        var9 = param0;
        L5: while (true) {
          if (var9 >= var8.length) {
            if (var7 != null) {
              throw cd.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return this.a(1);
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              var12 = this.a(var11, (byte) -18);
              if (var12 != null) {
                stackIn_21_0 = (java.net.Socket) (var12);
                decompiledRegionSelector0 = 1;
              } else {
                var9++;
                decompiledRegionSelector0 = 0;
              }
            } catch (bd decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var12_ref = (bd) (Object) decompiledCaughtException;
              var7 = var12_ref;
              var9++;
              decompiledRegionSelector0 = 0;
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var12_ref2 = (IOException) (Object) decompiledCaughtException;
              var9++;
              decompiledRegionSelector0 = 0;
            }
            if (decompiledRegionSelector0 == 0) {
              continue L5;
            } else {
              return stackIn_21_0;
            }
          }
        }
    }

    private final java.net.Socket a(byte param0, String param1, int param2, String param3) throws IOException {
        java.net.Socket stackIn_10_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        java.net.Socket var14 = null;
        String var15 = null;
        var13 = Geoblox.field_C;
        try {
          L0: {
            var14 = new java.net.Socket(param3, param2);
            var14.setSoTimeout(10000);
            var6 = var14.getOutputStream();
            if (param1 == null) {
              var6.write(("CONNECT " + this.field_e + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            } else {
              var6.write(("CONNECT " + this.field_e + ":" + this.field_b + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var14.getInputStream())));
              var9 = -22 % ((3 - param0) / 53);
              var8 = var7.readLine();
              if (var8 != null) {
                if (!var8.startsWith("HTTP/1.0 200")) {
                  if (!var8.startsWith("HTTP/1.1 200")) {
                    if (!var8.startsWith("HTTP/1.0 407")) {
                      if (!var8.startsWith("HTTP/1.1 407")) {
                        break L2;
                      }
                    }
                    var10 = 0;
                    var11 = "proxy-authenticate: ";
                    var8 = var11;
                    var8 = var11;
                    var8 = var7.readLine();
                    L5: while (var8 != null) {
                      if (-51 < (var10 ^ -1)) {
                        if (!var8.toLowerCase().startsWith(var11)) {
                          var8 = var7.readLine();
                          var10++;
                          continue L5;
                        } else {
                          var15 = var8.substring(var11.length()).trim();
                          var8 = var15;
                          var8 = var15;
                          var8 = var15;
                          var12 = var15.indexOf(' ');
                          if (0 != (var12 ^ -1)) {
                            var8 = var15.substring(0, var12);
                          }
                          throw new bd(var8);
                        }
                      }
                      break;
                    }
                    throw new bd("");
                  }
                }
                stackIn_10_0 = (java.net.Socket) (var14);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var6.close();
            var7.close();
            var14.close();
            stackIn_24_0 = null;
            decompiledRegionSelector0 = 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = (RuntimeException) (var5);

          stackIn_27_1 = new StringBuilder().append("cd.J(").append(param0).append(',');

          if (param1 == null) {
            stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
            stackIn_28_2 = "null";
          } else {
            stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
            stackIn_28_2 = "{...}";
          }


          stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
            stackIn_31_2 = "null";
          } else {
            stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
            stackIn_31_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_24_0);
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    cd() {
        this.field_k = java.net.ProxySelector.getDefault();
    }

    static {
        field_j = -1;
        field_l = new dm(270, 70);
        field_i = new ck(8, 0, 4, 1);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

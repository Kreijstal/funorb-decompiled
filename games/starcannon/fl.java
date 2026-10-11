/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class fl extends oe {
    static String field_g;
    static hl[] field_f;
    static String field_i;
    private java.net.ProxySelector field_j;
    static wd field_h;
    static int[] field_e;

    final static boolean d(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 897584976) {
          return true;
        }
        stackIn_6_0 = (null != ed.field_q) && (ed.field_q.k(param0 ^ 897584976) != null);
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, byte param7, int param8) {
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = StarCannon.field_A;
        try {
          if (param0 >= 0 &&
            param8 < gl.field_a) {
            if (param5 < 0 &&
              param1 < 0 &&
              param3 < 0) {
              return;
            }
            if (param5 >= gl.field_f &&
              param1 >= gl.field_f &&
              gl.field_f <= param3) {
              return;
            }
            if (param7 != -43) {
              return;
            }
            var14 = param0 - param8;
            if (param4 == param8) {
              if (param0 != param8) {
                var15 = param0 - param4;
                if (param1 <= param5) {
                  var12 = (param3 - param5 << 16) / var14;
                  var11 = (param3 - param1 << 16) / var15;
                  var9_int = param1 << 16;
                  var10 = param5 << 16;
                } else {
                  var12 = (-param1 + param3 << 16) / var15;
                  var11 = (param3 - param5 << 16) / var14;
                  var10 = param1 << 16;
                  var9_int = param5 << 16;
                }
              } else {
                var12 = 0;
                var10 = param1 << 16;
                var9_int = param5 << 16;
                var11 = 0;
              }
              if (param8 < 0) {
                param8 = Math.min(-param8, param4 - param8);
                var9_int = var9_int + param8 * var11;
                var10 = var10 + var12 * param8;
                param8 = 0;
              }
              var13 = 0;
            } else {
              var10 = param5 << 16;
              var9_int = param5 << 16;
              var15 = -param8 + param4;
              var12 = (-param5 + param3 << 16) / var14;
              var11 = (param1 - param5 << 16) / var15;
              if (var11 < var12) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param8 < 0) {
                if (param4 < 0) {
                  param8 = param4 - param8;
                  var9_int = var9_int + var11 * param8;
                  var10 = var10 + param8 * var12;
                  param8 = param4;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param8 = -param8;
                  var9_int = var9_int + param8 * var11;
                  var10 = var10 + param8 * var12;
                  param8 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = gl.field_c[param8];
                while (param8 < param4) {
                  var17 = var9_int >> 16;
                  if (var17 < gl.field_f) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (var18 + var17 >= gl.field_f) {
                        var18 = -1 + (gl.field_f - var17);
                      }
                      if (var17 < 0) {
                        qd.a(var17 + var18, 27, var16Lifetime2, param2, param6);
                      } else {
                        qd.a(var18, 56, var16Lifetime2 + var17, param2, param6);
                      }
                    } else {
                      if (0 <= var17 &&
                        var17 < gl.field_f) {
                        qd.a(var18, 125, var16Lifetime2 + var17, param2, param6);
                      }
                    }
                  }
                  param8++;
                  if (param8 >= gl.field_a) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + ki.field_j;
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                }
              }
              var16Lifetime3 = -param4 + param0;
              if (var16Lifetime3 == 0) {
                var12 = 0;
                var11 = 0;
              } else {
                if (var13 != 0) {
                  var10 = param1 << 16;
                } else {
                  var9_int = param1 << 16;
                }
                var17Lifetime2 = param3 << 16;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (param8 < 0) {
              param8 = -param8;
              var9_int = var9_int + param8 * var11;
              var10 = var10 + param8 * var12;
              param8 = 0;
            }
            var15Lifetime1 = gl.field_c[param8];
            while (param8 < param0) {
              var16Lifetime1 = var9_int >> 16;
              if (gl.field_f > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 != 0) {
                  if (var16Lifetime1 + var17Lifetime1 >= gl.field_f) {
                    var17Lifetime1 = gl.field_f - var16Lifetime1 - 1;
                  }
                  if (var16Lifetime1 < 0) {
                    qd.a(var17Lifetime1 + var16Lifetime1, 25, var15Lifetime1, param2, param6);
                  } else {
                    qd.a(var17Lifetime1, 38, var16Lifetime1 + var15Lifetime1, param2, param6);
                  }
                } else {
                  if (0 <= var16Lifetime1 &&
                    var16Lifetime1 < gl.field_f) {
                    qd.a(var17Lifetime1, param7 ^ -45, var15Lifetime1 + var16Lifetime1, param2, param6);
                  }
                }
              }
              param8++;
              if (gl.field_a <= param8) {
                return;
              }
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + ki.field_j;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_81_0 = var9;
          stackIn_81_1 = new StringBuilder().append("fl.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    fl() {
        this.field_j = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        java.net.Socket stackIn_9_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
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
        String var8Lifetime1;
        String var8Lifetime2;
        String var8Lifetime2Lifetime1;
        String var8Lifetime2Lifetime2;
        var12 = StarCannon.field_A;
        try {
          var13 = new java.net.Socket(param1, param3);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param0 == null) {
            var6.write(("CONNECT " + this.field_c + ":" + this.field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_c + ":" + this.field_d + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          boolean decompiledFrameRemainder0 = true;
          var6.flush();
          var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
          var14 = var7.readLine();
          var8 = var14;
          var8Lifetime1 = var14;
          if (var14 != null) {
            if ((!var14.startsWith("HTTP/1.0 200") &&
              !var14.startsWith("HTTP/1.1 200")) &&
              (decompiledFrameRemainder0 = (var14.startsWith("HTTP/1.0 407") ||
              var14.startsWith("HTTP/1.1 407")))) {
              var9 = 0;
              var10 = "proxy-authenticate: ";
              var8Lifetime2 = var10;
              var8Lifetime2Lifetime1 = var10;
              var8Lifetime2Lifetime2 = var7.readLine();
              while (var8Lifetime2Lifetime2 != null) {
                if (50 > var9) {
                  if (!var8Lifetime2Lifetime2.toLowerCase().startsWith(var10)) {
                    var9++;
                    var8Lifetime2Lifetime2 = var7.readLine();
                    continue;
                  }
                  var15 = var8Lifetime2Lifetime2.substring(var10.length()).trim();
                  var8Lifetime2Lifetime2 = var15;
                  var8Lifetime2Lifetime2 = var15;
                  var8Lifetime2Lifetime2 = var15;
                  var11 = var15.indexOf(' ');
                  if (var11 != -1) {
                    var8Lifetime2Lifetime2 = var15.substring(0, var11);
                  }
                  throw new le(var8Lifetime2Lifetime2);
                }
                break;
              }
              throw new le("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_9_0 = var13;
              return stackIn_9_0;
            }
          }
          var6.close();
          var7.close();
          var13.close();
          if (param2 == -20384) {
            return null;
          }
          fl.e(-64);
          stackIn_26_0 = null;
          return (java.net.Socket) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("fl.E(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final java.net.Socket a(byte param0) throws IOException {
        int var9 = 0;
        int stackIn_7_0 = 0;
        java.net.ProxySelector stackIn_10_0;
        java.net.URI stackIn_10_1;
        java.net.URI stackIn_10_2;
        StringBuilder stackIn_10_3;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        String stackIn_11_4 = null;
        java.net.ProxySelector stackIn_13_0;
        java.net.URI stackIn_13_1;
        java.net.URI stackIn_13_2;
        StringBuilder stackIn_13_3;
        java.net.URI stackIn_14_1;
        java.net.URI stackIn_14_2;
        String stackIn_14_4;
        java.net.Socket stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        le var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = StarCannon.field_A;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        if (param0 > -3) {
          field_h = (wd) null;
        }
        stackIn_7_0 = (this.field_d != 443) ? 0 : 1;
        var5 = stackIn_7_0;
        try {
          stackIn_10_0 = this.field_j;
          stackIn_10_1 = null;
          stackIn_10_2 = null;
          stackIn_10_3 = new StringBuilder();
          if (var5 == 0) {
            stackIn_11_1 = null;
            stackIn_11_2 = null;
            stackIn_11_4 = "http";
          } else {
            stackIn_11_1 = null;
            stackIn_11_2 = null;
            stackIn_11_4 = "https";
          }
          var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_10_3).append(stackIn_11_4).append("://").append(this.field_c).toString()));
          stackIn_13_0 = this.field_j;
          stackIn_13_1 = null;
          stackIn_13_2 = null;
          stackIn_13_3 = new StringBuilder();
          if (var5 != 0) {
            stackIn_14_1 = null;
            stackIn_14_2 = null;
            stackIn_14_4 = "http";
          } else {
            stackIn_14_1 = null;
            stackIn_14_2 = null;
            stackIn_14_4 = "https";
          }
          var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_13_3).append(stackIn_14_4).append("://").append(this.field_c).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b((byte) -83);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        for (var9 = 0; var8.length > var9; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (le) null;
            var12 = this.a(-56426768, var11);
            if (var12 != null) {
              stackIn_24_0 = var12;
              return stackIn_24_0;
            }
          } catch (le decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (le) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 != null) {
          throw fl.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
        }
        return this.b((byte) -64);
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
          if (param1.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_3_0 = this.b((byte) -125);
            return stackIn_3_0;
          }
          var3 = param1.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            stackIn_6_0 = null;
            return (java.net.Socket) (stackIn_6_0);
          }
          if (param0 != -56426768) {
            field_i = (String) null;
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1.type() != java.net.Proxy.Type.HTTP) {
            if (param1.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var5 = new java.net.Socket(param1);
            ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_c, this.field_d)));
            stackIn_22_0 = var5;
            return (java.net.Socket) (stackIn_22_0);
          }
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
                var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_c + "/"), "https"}));
                var5 = var12 + ": " + var13;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_18_0 = this.a((String) (var5), var4.getHostName(), -20384, var4.getPort());
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("fl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_e = null;
        field_h = null;
        int var1 = -118 % ((-22 - param0) / 55);
        field_i = null;
        field_g = null;
        field_f = null;
    }

    static {
        field_g = "Difficulty - MEDIUM";
        field_i = "Start Game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

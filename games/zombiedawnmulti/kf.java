/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class kf extends dl {
    static java.security.SecureRandom field_j;
    static cj field_i;
    private java.net.ProxySelector field_l;
    static String field_k;

    final static java.net.URL a(String param0, int param1, byte param2, String param3, java.net.URL param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_42_0 = null;
          java.net.URL stackIn_44_0 = null;
          RuntimeException stackIn_47_0 = null;
          StringBuilder stackIn_47_1 = null;
          String stackIn_48_2 = null;
          StringBuilder stackIn_50_1 = null;
          String stackIn_51_2 = null;
          StringBuilder stackIn_53_1 = null;
          String stackIn_54_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            var5 = param4.getFile();
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if ((var7_int >= 0) &&
                  (decompiledFrameRemainder0 = !(param1 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  decompiledFrameRemainder0 = !(var7_int >= 0);
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (0 <= var7_int) {
                      if (param3 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if ((var7_int >= 0) &&
                      (decompiledFrameRemainder0 = (param0 != null))) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var7 = new StringBuilder(var6);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (param1 > 0) {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param1));
                    }
                    if (param3 != null &&
                      param3.length() > 0) {
                      discarded$3 = var7.append("/p=");
                      discarded$4 = var7.append(param3);
                    }
                    if (param0 != null &&
                      0 < param0.length()) {
                      discarded$5 = var7.append("/s=");
                      discarded$6 = var7.append(param0);
                    }
                    if (var5.length() > var6) {
                      discarded$7 = var7.append(var5.substring(var6, var5.length()));
                    } else {
                      discarded$8 = var7.append('/');
                    }
                    if (param2 <= 107) {
                      field_k = (String) null;
                    }
                    try {
                      stackIn_42_0 = new java.net.URL(param4, var7.toString());
                      return stackIn_42_0;
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_44_0 = (java.net.URL) (param4);
                      return stackIn_44_0;
                    }
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_47_0 = var5_ref;
            stackIn_47_1 = new StringBuilder().append("kf.A(");
            if (param0 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
            if (param4 == null) {
              stackIn_54_2 = "null";
            } else {
              stackIn_54_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var6_int = param3 + 485 + (8 + param2) + 10;
          qe.field_q.a(-6 + dq.field_k.field_z, 3, var6_int - 6, 3, -3344);
          var7 = qe.field_q.field_z - 5;
          ek.field_z.a(param5, var7 - param5, param2 + 487 + param3, 5, param0 ^ -3342);
          ec.field_b.a(param5, 0, -ua.field_E.field_zb + (ek.field_z.field_zb - param2), param2, -3344);
          ua.field_E.a(param5, 0, ua.field_E.field_zb, param2 + ec.field_b.field_zb, param0 - 3346);
          var7 = var7 - (2 + param5);
          tn.field_A.a(param3, 2, param3 + (param0 + param2) + 485, 5, var7 - 5, param0 ^ -31467, 5);
          if (ra.field_f != null) {
            ra.field_f.b(tn.field_A.field_x, tn.field_A.field_Q, 28972, tn.field_A.field_zb, tn.field_A.field_z);
          }
          var8 = -var6_int - param2 + dq.field_k.field_zb;
          var9 = var8 / 2;
          var10 = param2 + param1 + var9;
          var11 = 0;
          for (var12 = 0; var12 < 6; var12++) {
            if (5 <= var12 ||
              la.field_h[var12] != null) {
              var13 = (2 + (-6 + dq.field_k.field_z)) * var11 / (1 + gi.field_l) + 3;
              var11++;
              var7Lifetime1 = var11 * (dq.field_k.field_z - 4) / (1 + gi.field_l) + (1 - var13);
              if (5 > var12) {
                la.field_h[var12].a(var7Lifetime1, var13, var8, var6_int, param0 ^ -3342);
                ij.field_k[var12].a(var7Lifetime1, 0, var9 - param2, param2, param0 ^ -3342);
                pf.field_d[var12].a(-param4 + var7Lifetime1 - param4, param4, param1, var9, -3344);
                hh.field_l[var12].a(-param4 + var7Lifetime1 - param4, param4, var8 - (param2 + var10), var10, -3344);
              } else {
                nn.field_b.a(var7Lifetime1, var13, var8, var6_int, -3344);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6), "kf.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != 3) {
          return;
        }
        field_j = null;
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        java.net.Socket stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        java.net.Socket stackIn_22_0 = null;
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
          if (param0.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_2_0 = this.b((byte) 100);
            return stackIn_2_0;
          }
          var3 = param0.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            stackIn_5_0 = null;
            return (java.net.Socket) (stackIn_5_0);
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1 != 1) {
            stackIn_8_0 = (java.net.Socket) null;
            return stackIn_8_0;
          }
          if (param0.type() != java.net.Proxy.Type.HTTP) {
            if (param0.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var5 = new java.net.Socket(param0);
            ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_f)));
            stackIn_13_0 = var5;
            return (java.net.Socket) (stackIn_13_0);
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
                var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_b + "/"), "https"}));
                var5 = var12 + ": " + var13;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_22_0 = this.a((byte) -96, var4.getHostName(), var4.getPort(), (String) (var5));
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("kf.B(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private final java.net.Socket a(byte param0, String param1, int param2, String param3) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        java.net.Socket stackIn_12_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
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
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 > -25) {
            stackIn_3_0 = (java.net.Socket) null;
            return stackIn_3_0;
          }
          var13 = new java.net.Socket(param1, param2);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param3 == null) {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_f + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          boolean decompiledFrameRemainder0 = true;
          var6.flush();
          var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
          var8 = var7.readLine();
          if (var8 != null) {
            if ((!var8.startsWith("HTTP/1.0 200") &&
              !var8.startsWith("HTTP/1.1 200")) &&
              (decompiledFrameRemainder0 = (var8.startsWith("HTTP/1.0 407") ||
              var8.startsWith("HTTP/1.1 407")))) {
              var9 = 0;
              var10 = "proxy-authenticate: ";
              var8 = var7.readLine();
              while (var8 != null) {
                if (50 > var9) {
                  if (!var8.toLowerCase().startsWith(var10)) {
                    var8 = var7.readLine();
                    var9++;
                    continue;
                  }
                  var14 = var8.substring(var10.length()).trim();
                  var8 = var14;
                  var11 = var14.indexOf(' ');
                  if (var11 != -1) {
                    var8 = var14.substring(0, var11);
                  }
                  throw new en(var8);
                }
                break;
              }
              throw new en("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_12_0 = var13;
              return stackIn_12_0;
            }
          }
          var6.close();
          var7.close();
          var13.close();
          stackIn_28_0 = null;
          return (java.net.Socket) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("kf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    kf() {
        this.field_l = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket b(int param0) throws IOException {
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
        en var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 4646) {
          kf.a(-21, 110, 106, 109, 24, -20);
        }
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_7_0 = (this.field_f != 443) ? 0 : 1;
        var5 = stackIn_7_0;
        try {
          stackIn_10_0 = this.field_l;
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
          var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_10_3).append(stackIn_11_4).append("://").append(this.field_b).toString()));
          stackIn_13_0 = this.field_l;
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
          var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_13_3).append(stackIn_14_4).append("://").append(this.field_b).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b((byte) 97);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        for (var9 = 0; var9 < var8.length; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (en) null;
            var12 = this.a(var11, 1);
            if (var12 != null) {
              stackIn_24_0 = var12;
              return stackIn_24_0;
            }
          } catch (en decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (en) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 != null) {
          throw kf.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
        }
        return this.b((byte) 89);
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

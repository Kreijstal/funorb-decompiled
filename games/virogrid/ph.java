/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ph extends rn {
    private java.net.ProxySelector field_j;
    static long field_i;
    static mg[] field_m;
    static wm[] field_n;
    static int[] field_o;
    static int[][] field_l;
    static int field_h;
    static ii field_k;

    final static String c(int param0) {
        if (param0 != -15025) {
          ph.c(-119);
        }
        if (ei.field_a) {
          return null;
        }
        if (ed.field_a > wa.field_F) {
          return null;
        }
        if (ed.field_a + nb.field_y <= wa.field_F) {
          return null;
        }
        return od.field_l;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != -1550172208) {
          field_k = (ii) null;
        }
        if (param1 > param0) {
          return -wd.a((byte) -53, (param0 << 16) / param1) + 2048;
        }
        return wd.a((byte) -71, (param1 << 16) / param0);
    }

    final java.net.Socket b(int param0) throws IOException {
        int var9 = 0;
        int stackIn_5_0 = 0;
        java.net.ProxySelector stackIn_8_0;
        java.net.URI stackIn_8_1;
        java.net.URI stackIn_8_2;
        StringBuilder stackIn_8_3;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        String stackIn_9_4 = null;
        java.net.ProxySelector stackIn_11_0;
        java.net.URI stackIn_11_1;
        java.net.URI stackIn_11_2;
        StringBuilder stackIn_11_3;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        String stackIn_12_4;
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
        te var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = Virogrid.field_F ? 1 : 0;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_5_0 = (this.field_b != 443) ? 0 : 1;
        var5 = stackIn_5_0;
        try {
          stackIn_8_0 = this.field_j;
          stackIn_8_1 = null;
          stackIn_8_2 = null;
          stackIn_8_3 = new StringBuilder();
          if (var5 != 0) {
            stackIn_9_1 = null;
            stackIn_9_2 = null;
            stackIn_9_4 = "https";
          } else {
            stackIn_9_1 = null;
            stackIn_9_2 = null;
            stackIn_9_4 = "http";
          }
          var3 = ((java.net.ProxySelector) (Object) stackIn_8_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_8_3).append(stackIn_9_4).append("://").append(this.field_d).toString()));
          stackIn_11_0 = this.field_j;
          stackIn_11_1 = null;
          stackIn_11_2 = null;
          stackIn_11_3 = new StringBuilder();
          if (var5 != 0) {
            stackIn_12_1 = null;
            stackIn_12_2 = null;
            stackIn_12_4 = "http";
          } else {
            stackIn_12_1 = null;
            stackIn_12_2 = null;
            stackIn_12_4 = "https";
          }
          var4 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_11_3).append(stackIn_12_4).append("://").append(this.field_d).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(false);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        if (param0 != -18982) {
          field_h = 99;
        }
        for (var9 = 0; var9 < var8.length; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (te) null;
            var12 = this.a(var11, -128);
            if (var12 != null) {
              stackIn_24_0 = var12;
              return stackIn_24_0;
            }
          } catch (te decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (te) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 == null) {
          return this.a(false);
        }
        throw ph.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
    }

    private final java.net.Socket a(String param0, int param1, String param2, int param3) throws IOException {
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
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          var13 = new java.net.Socket(param2, param1);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param0 == null) {
            var6.write(("CONNECT " + this.field_d + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_d + ":" + this.field_b + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          boolean decompiledFrameRemainder0 = true;
          var6.flush();
          var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
          var14 = var7.readLine();
          if (var14 != null) {
            if ((!var14.startsWith("HTTP/1.0 200") &&
              !var14.startsWith("HTTP/1.1 200")) &&
              (decompiledFrameRemainder0 = (var14.startsWith("HTTP/1.0 407") ||
              var14.startsWith("HTTP/1.1 407")))) {
              var9 = 0;
              var10 = "proxy-authenticate: ";
              var8 = var7.readLine();
              while (var8 != null) {
                if (var9 < 50) {
                  if (!var8.toLowerCase().startsWith(var10)) {
                    var8 = var7.readLine();
                    var9++;
                    continue;
                  }
                  var15 = var8.substring(var10.length()).trim();
                  var8 = var15;
                  var11 = var15.indexOf(' ');
                  if (-1 != var11) {
                    var8 = var15.substring(0, var11);
                  }
                  throw new te(var8);
                }
                break;
              }
              throw new te("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_9_0 = var13;
              return stackIn_9_0;
            }
          }
          var6.close();
          var7.close();
          if (param3 != 32) {
            field_h = -100;
          }
          var13.close();
          stackIn_26_0 = null;
          return (java.net.Socket) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("ph.E(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(')').toString());
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.Socket stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        java.net.Socket stackIn_17_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
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
          if (param1 > -124) {
            ph.a(107, -47, 41);
          }
          if (param0.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_4_0 = this.a(false);
            return stackIn_4_0;
          }
          var3 = param0.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            stackIn_7_0 = null;
            return (java.net.Socket) (stackIn_7_0);
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param0.type() != java.net.Proxy.Type.HTTP) {
            if (param0.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var5 = new java.net.Socket(param0);
            ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_d, this.field_b)));
            stackIn_21_0 = var5;
            return (java.net.Socket) (stackIn_21_0);
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
                var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_d + "/"), "https"}));
                var5 = var12 + ": " + var13;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_17_0 = this.a((String) (var5), var4.getPort(), var4.getHostName(), 32);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var3_ref;
          stackIn_24_1 = new StringBuilder().append("ph.F(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    ph() {
        this.field_j = java.net.ProxySelector.getDefault();
    }

    public static void d(int param0) {
        int var1 = -95 % ((param0 - 31) / 49);
        field_o = null;
        field_n = null;
        field_k = null;
        field_l = (int[][]) null;
        field_m = null;
    }

    static {
        field_o = new int[128];
        field_l = new int[4][];
        field_h = 0;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class kr extends bg {
    private java.net.ProxySelector field_f;
    static na field_e;
    static int field_h;
    static long field_g;

    public static void c(int param0) {
        field_e = null;
        if (param0 != 15296) {
          String var2 = (String) null;
          kr.a((byte) -15, 68L, (String) null);
        }
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        java.net.Socket stackIn_16_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
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
            stackIn_3_0 = this.b(5101);
            return stackIn_3_0;
          }
          var3 = param1.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            return null;
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1.type() != java.net.Proxy.Type.HTTP) {
            if (param1.type() == java.net.Proxy.Type.SOCKS) {
              var5 = new java.net.Socket(param1);
              ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_c, this.field_a)));
              stackIn_19_0 = var5;
              return (java.net.Socket) (stackIn_19_0);
            }
            if (param0 == -6589) {
              return null;
            }
            kr.a(false);
            stackIn_23_0 = null;
            return (java.net.Socket) (stackIn_23_0);
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
          stackIn_16_0 = this.a(var4.getPort(), (byte) 25, (String) (var5), var4.getHostName());
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("kr.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final java.net.Socket a(int param0, byte param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_12_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
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
        var12 = Pool.field_O;
        try {
          var13 = new java.net.Socket(param3, param0);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param2 != null) {
            var6.write(("CONNECT " + this.field_c + ":" + this.field_a + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_c + ":" + this.field_a + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          if (param1 != 25) {
            kr.c(-94);
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
              var8Lifetime2 = var7.readLine();
              var10 = "proxy-authenticate: ";
              var8Lifetime2Lifetime1 = var10;
              var8Lifetime2Lifetime2 = var10;
              while (var8Lifetime2Lifetime2 != null) {
                if (var9 < 50) {
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
                  throw new lo(var8Lifetime2Lifetime2);
                }
                break;
              }
              throw new lo("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_12_0 = var13;
              return stackIn_12_0;
            }
          }
          var6.close();
          var7.close();
          var13.close();
          stackIn_27_0 = null;
          return (java.net.Socket) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("kr.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    kr() {
        this.field_f = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket a(byte param0) throws IOException {
        int var9 = 0;
        int stackIn_6_0 = 0;
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
        lo var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = Pool.field_O;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_6_0 = (this.field_a != 443) ? 0 : 1;
        var5 = stackIn_6_0;
        if (param0 > -94) {
          return (java.net.Socket) null;
        }
        try {
          stackIn_10_0 = this.field_f;
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
          stackIn_13_0 = this.field_f;
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
          return this.b(5101);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        for (var9 = 0; var8.length > var9; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (lo) null;
            var12 = this.a(-6589, var11);
            if (var12 != null) {
              stackIn_24_0 = var12;
              return stackIn_24_0;
            }
          } catch (lo decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (lo) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 != null) {
          throw kr.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
        }
        return this.b(5101);
    }

    final static void a(boolean param0) {
        String var1 = null;
        if (ro.field_e) {
          if (d.field_d != null) {
            d.field_d.k(17);
          }
          var1 = ve.d(120);
          vj.field_j = new ui(var1, (String) null, true, false, param0);
          wd.field_Ub.b(tn.field_n, 30000);
          tn.field_n.d(vj.field_j, 30);
          tn.field_n.b(param0);
          return;
        }
        throw new IllegalStateException();
    }

    final static void a(byte param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
          if (param0 >= -58) {
            field_e = (na) null;
          }
          fm.field_I = param2;
          hn.field_b = 2;
          var5 = (CharSequence) ((Object) param2);
          di.field_a = hq.a(88, var5);
          c.field_d = param1;
          rg.field_p = true;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "kr.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 99;
        field_e = new na();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class bc extends nl {
    static int field_i;
    private java.net.ProxySelector field_k;
    static ac field_j;
    static String field_h;

    final java.net.Socket b(int param0) throws IOException {
        int stackIn_6_0 = 0;
        java.net.ProxySelector stackIn_9_0;
        java.net.URI stackIn_9_1;
        java.net.URI stackIn_9_2;
        StringBuilder stackIn_9_3;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        String stackIn_10_4 = null;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        java.net.URI stackIn_13_1;
        java.net.URI stackIn_13_2;
        String stackIn_13_4;
        java.net.Socket stackIn_24_0 = null;
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
        tl var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        byte[] var14 = null;
        var13 = stellarshard.field_B;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_6_0 = (this.field_g != 443) ? 0 : 1;
        var5 = stackIn_6_0;
        try {
          stackIn_9_0 = this.field_k;
          stackIn_9_1 = null;
          stackIn_9_2 = null;
          stackIn_9_3 = new StringBuilder();
          if (var5 == 0) {
            stackIn_10_1 = null;
            stackIn_10_2 = null;
            stackIn_10_4 = "http";
          } else {
            stackIn_10_1 = null;
            stackIn_10_2 = null;
            stackIn_10_4 = "https";
          }
          var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_9_3).append(stackIn_10_4).append("://").append(this.field_c).toString()));
          stackIn_12_0 = this.field_k;
          stackIn_12_1 = null;
          stackIn_12_2 = null;
          stackIn_12_3 = new StringBuilder();
          if (var5 != 0) {
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_4 = "http";
          } else {
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_4 = "https";
          }
          var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_12_3).append(stackIn_13_4).append("://").append(this.field_c).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(-28548);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        var9 = 0;
        if (param0 > -127) {
          var14 = (byte[]) null;
          bc.a(-89, 82, 75, (byte[]) null);
        }
        while (var8.length > var9) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (tl) null;
            var12 = this.a(var11, -444);
            if (var12 != null) {
              stackIn_24_0 = var12;
              return stackIn_24_0;
            }
          } catch (tl decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (tl) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
          var9++;
        }
        if (var7 != null) {
          throw bc.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
        }
        return this.a(-28548);
    }

    private final java.net.Socket a(byte param0, int param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_12_0 = null;
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
        var12 = stellarshard.field_B;
        try {
          var13 = new java.net.Socket(param3, param1);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param2 == null) {
            var6.write(("CONNECT " + this.field_c + ":" + this.field_g + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_c + ":" + this.field_g + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          if (param0 != 66) {
            field_i = -31;
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
                  throw new tl(var8Lifetime2Lifetime2);
                }
                break;
              }
              throw new tl("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_12_0 = var13;
              return stackIn_12_0;
            }
          }
          var6.close();
          var7.close();
          var13.close();
          stackIn_26_0 = null;
          return (java.net.Socket) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("bc.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 <= 43) {
          return;
        }
        field_h = null;
    }

    final static void a(boolean param0, int param1) {
        if (param1 > -7) {
          return;
        }
        vc.a((byte) -78, param0, true);
    }

    bc() {
        this.field_k = java.net.ProxySelector.getDefault();
    }

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        we var5 = null;
        byte[] var6 = null;
        var7 = stellarshard.field_B;
        try {
          if (param1 > 0) {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; param2 > var5_int; var5_int++) {
              var8[var5_int] = param3[var5_int + param1];
            }
          } else {
            var4 = param3;
          }
          var5 = new we();
          var5.a(false);
          var5.a((long)(8 * param2), (byte) -78, var4);
          var6 = new byte[64];
          var5.a(var6, param0, 22297);
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("bc.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        java.net.Socket stackIn_5_0 = null;
        java.net.Socket stackIn_19_0 = null;
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
          if (param1 != -444) {
            stackIn_2_0 = (java.net.Socket) null;
            return stackIn_2_0;
          }
          if (param0.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_5_0 = this.a(param1 - 28104);
            return stackIn_5_0;
          }
          var3 = param0.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            return null;
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param0.type() != java.net.Proxy.Type.HTTP) {
            if (param0.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var5 = new java.net.Socket(param0);
            ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_c, this.field_g)));
            stackIn_23_0 = var5;
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
          stackIn_19_0 = this.a((byte) 66, var4.getPort(), (String) (var5), var4.getHostName());
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("bc.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_j = null;
        field_h = "Go Back";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

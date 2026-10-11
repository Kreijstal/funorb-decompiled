/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class nw extends g {
    static String field_h;
    static mm field_e;
    private java.net.ProxySelector field_g;
    static ri[] field_f;

    final static float a(int param0, float param1, float param2, float param3) {
        if (param0 != 1050) {
          nw.b(-23);
        }
        return (param2 - param1) * param3 + param1;
    }

    private final java.net.Socket a(String param0, int param1, String param2, byte param3) throws IOException {
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
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param3 != 105) {
            nw.b(109);
          }
          var13 = new java.net.Socket(param2, param1);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param0 == null) {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_d + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
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
                  if (-1 != var11) {
                    var8Lifetime2Lifetime2 = var15.substring(0, var11);
                  }
                  throw new hh(var8Lifetime2Lifetime2);
                }
                break;
              }
              throw new hh("");
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
          stackIn_30_1 = new StringBuilder().append("nw.E(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_e = null;
        field_h = null;
        if (param0 != 1183) {
          String var2 = (String) null;
          nw.a((String) null, (byte) 106, 118, (ki) null, (String) null);
        }
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        java.net.Socket stackIn_15_0 = null;
        Object stackIn_19_0 = null;
        java.net.Socket stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
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
            stackIn_2_0 = this.a((byte) 117);
            return stackIn_2_0;
          }
          var3 = param1.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            return null;
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1.type() != java.net.Proxy.Type.HTTP) {
            if (param1.type() == java.net.Proxy.Type.SOCKS) {
              var5 = new java.net.Socket(param1);
              ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_d)));
              stackIn_19_0 = var5;
              return (java.net.Socket) (stackIn_19_0);
            }
            if (param0 == 10000) {
              return null;
            }
            stackIn_23_0 = (java.net.Socket) null;
            return stackIn_23_0;
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
          stackIn_15_0 = this.a((String) (var5), var4.getPort(), var4.getHostName(), (byte) 105);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var3_ref;
          stackIn_27_1 = new StringBuilder().append("nw.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final java.net.Socket b(byte param0) throws IOException {
        int var9 = 0;
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
        java.net.Socket stackIn_25_0 = null;
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
        hh var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = Sumoblitz.field_L ? 1 : 0;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_6_0 = (this.field_d != 443) ? 0 : 1;
        var5 = stackIn_6_0;
        try {
          stackIn_9_0 = this.field_g;
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
          var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_9_3).append(stackIn_10_4).append("://").append(this.field_b).toString()));
          stackIn_12_0 = this.field_g;
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
          var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_12_3).append(stackIn_13_4).append("://").append(this.field_b).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a((byte) 95);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        if (param0 != 61) {
          return (java.net.Socket) null;
        }
        for (var9 = 0; var9 < var8.length; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (hh) null;
            var12 = this.a(param0 + 9939, var11);
            if (var12 != null) {
              stackIn_25_0 = var12;
              return stackIn_25_0;
            }
          } catch (hh decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (hh) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 == null) {
          return this.a((byte) 119);
        }
        throw nw.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
    }

    final static String a(String param0, byte param1, int param2, ki param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 85) {
            field_h = (String) null;
          }
          if (!param3.b((byte) 127)) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = param4 + " - " + param3.a(param2, (byte) -114) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("nw.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    nw() {
        this.field_g = java.net.ProxySelector.getDefault();
    }

    static {
        field_h = "Email is valid";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

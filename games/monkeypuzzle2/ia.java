/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ia extends al {
    static long field_f;
    private java.net.ProxySelector field_e;
    static int[] field_g;
    static char[] field_d;
    static String field_c;

    final java.net.Socket a(int param0) throws IOException {
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
        java.net.Socket stackIn_22_0 = null;
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
        pg var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_5_0 = (this.field_a != 443) ? 0 : 1;
        var5 = stackIn_5_0;
        try {
          stackIn_8_0 = this.field_e;
          stackIn_8_1 = null;
          stackIn_8_2 = null;
          stackIn_8_3 = new StringBuilder();
          if (var5 == 0) {
            stackIn_9_1 = null;
            stackIn_9_2 = null;
            stackIn_9_4 = "http";
          } else {
            stackIn_9_1 = null;
            stackIn_9_2 = null;
            stackIn_9_4 = "https";
          }
          var3 = ((java.net.ProxySelector) (Object) stackIn_8_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_8_3).append(stackIn_9_4).append("://").append(this.field_b).toString()));
          stackIn_11_0 = this.field_e;
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
          var4 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_11_3).append(stackIn_12_4).append("://").append(this.field_b).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b((byte) 122);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        for (var9 = param0; var8.length > var9; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (pg) null;
            var12 = this.a((byte) 126, var11);
            if (var12 != null) {
              stackIn_22_0 = var12;
              return stackIn_22_0;
            }
          } catch (pg decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (pg) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 != null) {
          throw ia.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
        }
        return this.b((byte) 121);
    }

    final static float a(boolean param0, float param1) {
        if (param0) {
          return vh.field_C[65535 & (int)((double)(32768.0f * param1) / 3.141592653589793)];
        }
        field_d = (char[]) null;
        return vh.field_C[65535 & (int)((double)(32768.0f * param1) / 3.141592653589793)];
    }

    ia() {
        this.field_e = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        java.net.Socket stackIn_10_0 = null;
        java.net.Socket stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
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
        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var13 = new java.net.Socket(param1, param2);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param0 != null) {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_a + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_a + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
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
                  if (var11 != -1) {
                    var8 = var15.substring(0, var11);
                  }
                  throw new pg(var8);
                }
                break;
              }
              throw new pg("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_10_0 = var13;
              return stackIn_10_0;
            }
          }
          var6.close();
          if (param3 <= 29) {
            stackIn_27_0 = (java.net.Socket) null;
            return stackIn_27_0;
          }
          var7.close();
          var13.close();
          stackIn_29_0 = null;
          return (java.net.Socket) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("ia.J(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_d = null;
        field_g = null;
        int var1 = -83 / ((param0 + 86) / 33);
        field_c = null;
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        int var5 = 0;
        Object var6 = null;
        Class var7 = null;
        java.lang.reflect.Method var8 = null;
        Object var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        java.lang.reflect.Method var12 = null;
        String var13 = null;
        String var14 = null;
        Class var15 = null;
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        java.net.Socket stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var7_ref = null;
        try {
          if (param1.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_2_0 = this.b((byte) 122);
            return stackIn_2_0;
          }
          var3 = param1.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            stackIn_5_0 = null;
            return (java.net.Socket) (stackIn_5_0);
          }
          var5 = -21 / ((param0 - 60) / 62);
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1.type() != java.net.Proxy.Type.HTTP) {
            if (param1.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var6 = new java.net.Socket(param1);
            ((java.net.Socket) (var6)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_a)));
            stackIn_10_0 = var6;
            return (java.net.Socket) (stackIn_10_0);
          }
          var6 = null;
          try {
            var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
            var7 = var15;
            var8 = var15.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
            var8.setAccessible(true);
            var9 = var8.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
            if (var9 != null) {
              var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
              var10.setAccessible(true);
              if (((Boolean) (var10.invoke(var9, new Object[]{}))).booleanValue()) {
                var11 = var7.getDeclaredMethod("getHeaderName", new Class[]{});
                var11.setAccessible(true);
                var12 = var15.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                var12.setAccessible(true);
                var13 = (String) (var11.invoke(var9, new Object[]{}));
                var14 = (String) (var12.invoke(var9, new Object[]{new java.net.URL("https://" + this.field_b + "/"), "https"}));
                var6 = var13 + ": " + var14;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_19_0 = this.a((String) (var6), var4.getHostName(), var4.getPort(), 56);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("ia.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static h a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        h stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -7 % ((-25 - param0) / 35);
          stackIn_1_0 = new h(param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ia.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
        field_c = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_g = new int[128];
        field_d = new char[128];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

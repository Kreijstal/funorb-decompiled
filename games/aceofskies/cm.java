/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class cm extends jm {
    private java.net.ProxySelector field_g;

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          if (param1.type() == java.net.Proxy.Type.DIRECT) {
            java.net.Socket stackIn_3_0 = this.b((byte) 80);
            return stackIn_3_0;
          }
          java.net.SocketAddress var3 = param1.address();
          int var4 = -35 % ((-30 - param0) / 59);
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            Object stackIn_6_0 = null;
            return (java.net.Socket) (stackIn_6_0);
          }
          java.net.InetSocketAddress var5 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1.type() != java.net.Proxy.Type.HTTP) {
            if (param1.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var6 = new java.net.Socket(param1);
            ((java.net.Socket) (var6)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_e, this.field_f)));
            Object stackIn_21_0 = var6;
            return (java.net.Socket) (stackIn_21_0);
          }
          var6 = null;
          try {
            Class var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
            Class var7 = var15;
            java.lang.reflect.Method var8 = var15.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
            var8.setAccessible(true);
            Object var9 = var8.invoke((Object) null, new Object[]{var5.getHostName(), new Integer(var5.getPort())});
            if (var9 != null) {
              java.lang.reflect.Method var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
              var10.setAccessible(true);
              if (((Boolean) (var10.invoke(var9, new Object[]{}))).booleanValue()) {
                java.lang.reflect.Method var11 = var7.getDeclaredMethod("getHeaderName", new Class[]{});
                var11.setAccessible(true);
                java.lang.reflect.Method var12 = var15.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                var12.setAccessible(true);
                String var13 = (String) (var11.invoke(var9, new Object[]{}));
                String var14 = (String) (var12.invoke(var9, new Object[]{new java.net.URL("https://" + this.field_e + "/"), "https"}));
                var6 = var13 + ": " + var14;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var7_ref = (Exception) (Object) decompiledCaughtException;
          }
          java.net.Socket stackIn_17_0 = this.a((byte) 127, (String) (var6), var5.getPort(), var5.getHostName());
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_25_0 = var3_ref;
          StringBuilder stackIn_25_1 = new StringBuilder().append("cm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(Sprite param0, int param1) {
        qk.a((byte) -92);
        if (param1 != -14492) {
          return;
        }
        try {
          SoftwareRasterizer.setRasterTarget(param0.pixels, param0.fullWidth, param0.fullHeight);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "cm.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final java.net.Socket a(byte param0) throws IOException {
        String stackIn_9_4 = null;
        String stackIn_12_4;
        Throwable decompiledCaughtException = null;
        List var3 = null;
        List var4 = null;
        int var14 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        int stackIn_5_0 = (this.field_f != 443) ? 0 : 1;
        int var5 = stackIn_5_0;
        try {
          java.net.ProxySelector stackIn_8_0 = this.field_g;
          java.net.URI stackIn_8_1 = null;
          java.net.URI stackIn_8_2 = null;
          StringBuilder stackIn_8_3 = new StringBuilder();
          if (var5 != 0) {
            stackIn_9_4 = "https";
          } else {
            java.net.URI stackIn_9_1 = null;
            java.net.URI stackIn_9_2 = null;
            stackIn_9_4 = "http";
          }
          var3 = ((java.net.ProxySelector) (Object) stackIn_8_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_8_3).append(stackIn_9_4).append("://").append(this.field_e).toString()));
          java.net.ProxySelector stackIn_11_0 = this.field_g;
          java.net.URI stackIn_11_1 = null;
          java.net.URI stackIn_11_2 = null;
          StringBuilder stackIn_11_3 = new StringBuilder();
          if (var5 != 0) {
            stackIn_12_4 = "http";
          } else {
            java.net.URI stackIn_12_1 = null;
            java.net.URI stackIn_12_2 = null;
            stackIn_12_4 = "https";
          }
          var4 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_11_3).append(stackIn_12_4).append("://").append(this.field_e).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          java.net.URISyntaxException var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b((byte) -116);
        }
        var3.addAll((Collection) ((Object) var4));
        Object[] var6_array = var3.toArray();
        Object var7 = null;
        Object[] var8 = var6_array;
        int var9 = -91 % ((-33 - param0) / 38);
        for (int var10 = 0; var8.length > var10; var10++) {
          Object var11 = var8[var10];
          java.net.Proxy var12 = (java.net.Proxy) (var11);
          try {
            if (false) throw (ls) null;
            java.net.Socket var13 = this.a(-109, var12);
            if (var13 != null) {
              java.net.Socket stackIn_22_0 = var13;
              return stackIn_22_0;
            }
          } catch (ls decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            ls var13_ref = (ls) (Object) decompiledCaughtException;
            var7 = var13_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            IOException var13_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 != null) {
          throw cm.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
        }
        return this.b((byte) 98);
    }

    private final java.net.Socket a(byte param0, String param1, int param2, String param3) throws IOException {
        String stackIn_29_2 = null;
        String stackIn_32_2 = null;
        int var12 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          java.net.Socket var13 = new java.net.Socket(param3, param2);
          var13.setSoTimeout(10000);
          OutputStream var6 = var13.getOutputStream();
          if (param0 <= 119) {
            cm.a(-79, (byte) 58);
          }
          if (param1 != null) {
            var6.write(("CONNECT " + this.field_e + ":" + this.field_f + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_e + ":" + this.field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          boolean decompiledFrameRemainder0 = true;
          var6.flush();
          BufferedReader var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
          String var8 = var7.readLine();
          if (var8 != null) {
            if ((!var8.startsWith("HTTP/1.0 200") &&
              !var8.startsWith("HTTP/1.1 200")) &&
              (decompiledFrameRemainder0 = (var8.startsWith("HTTP/1.0 407") ||
              var8.startsWith("HTTP/1.1 407")))) {
              int var9 = 0;
              String var10 = "proxy-authenticate: ";
              var8 = var10;
              var8 = var10;
              var8 = var7.readLine();
              while (var8 != null) {
                if (var9 < 50) {
                  if (!var8.toLowerCase().startsWith(var10)) {
                    var8 = var7.readLine();
                    var9++;
                    continue;
                  }
                  String var14 = var8.substring(var10.length()).trim();
                  var8 = var14;
                  var8 = var14;
                  var8 = var14;
                  int var11 = var14.indexOf(' ');
                  if (var11 != -1) {
                    var8 = var14.substring(0, var11);
                  }
                  throw new ls(var8);
                }
                break;
              }
              throw new ls("");
            }
            if (decompiledFrameRemainder0) {
              java.net.Socket stackIn_11_0 = var13;
              return stackIn_11_0;
            }
          }
          var6.close();
          var7.close();
          var13.close();
          Object stackIn_25_0 = null;
          return (java.net.Socket) (stackIn_25_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_28_0 = var5;
          StringBuilder stackIn_28_1 = new StringBuilder().append("cm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          StringBuilder stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    cm() {
        this.field_g = java.net.ProxySelector.getDefault();
    }

    final static ResourceArchive a(int param0, byte param1) {
        int var2 = -125 % ((34 - param1) / 51);
        if (null != iq.field_h) {
          return iq.field_h;
        }
        if (param0 != -1) {
          return lc.a(true, false, true, (byte) -65, 1, param0);
        }
        return iq.field_h;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class eg extends eh {
    static int[] field_h;
    static int[] field_l;
    static ak field_k;
    static wi field_n;
    private java.net.ProxySelector field_m;
    static java.awt.Frame field_i;
    static java.awt.Frame field_j;

    private final java.net.Socket a(int param0, String param1, String param2, byte param3) throws IOException {
        java.net.Socket stackIn_11_0 = null;
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
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          if (param3 < 92) {
            eg.f(125);
          }
          var13 = new java.net.Socket(param1, param0);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param2 != null) {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_e + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
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
                  if (var11 != -1) {
                    var8Lifetime2Lifetime2 = var15.substring(0, var11);
                  }
                  throw new uf(var8Lifetime2Lifetime2);
                }
                break;
              }
              throw new uf("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_11_0 = var13;
              return stackIn_11_0;
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
          stackIn_29_1 = new StringBuilder().append("eg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, java.applet.Applet param4, String[] param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          al.field_g = param4.getParameter("overxgames");
          if (null == al.field_g) {
            al.field_g = "0";
          }
          bl.field_g = param4.getParameter("overxachievements");
          if (null == bl.field_g) {
            bl.field_g = "0";
          }
          var6 = param4.getParameter("currency");
          if (var6 == null) {
            gb.field_c = 2;
          } else {
            if (!td.a(param0 - 12, (CharSequence) ((Object) var6))) {
              gb.field_c = 2;
            } else {
              gb.field_c = na.a((CharSequence) ((Object) var6), (byte) -33);
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
            field_h = (int[]) null;
          }
          tm.field_S = param5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_19_0 = var6_ref;
          stackIn_19_1 = new StringBuilder().append("eg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static String f(int param0) {
        if (rj.field_F == tm.field_X) {
          return vp.field_Nb;
        }
        if (param0 != 8192) {
          field_n = (wi) null;
        }
        if (qo.field_n == rj.field_F) {
          return uh.field_m;
        }
        if (!an.field_e.d(79)) {
          return uh.field_m;
        }
        return h.field_U;
    }

    final static void a(byte param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int var2Lifetime1;
        int var7Lifetime1;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var9 = new int[256];
          var13 = var9;
          for (var2 = 0; var2 < 256; var2++) {
            var9[var2] = var2 * 65793;
          }
          gd.field_f = new tf[50];
          var2Lifetime1 = -48 / ((param0 - 31) / 39);
          for (var3 = 0; 50 > var3; var3++) {
            gd.field_f[var3] = new tf(63, 63);
            gd.field_f[var3].c();
            var4 = (double)var3 * 6.283185307179586 / 50.0;
            var6 = (int)(16.0 * Math.sin(var4)) >> 1;
            t.a(512, 512, 48 + var6 << 4, 255, var13);
            for (var7 = 0; t.field_k.length > var7; var7++) {
              t.field_k[var7] = 16777215 - t.field_k[var7];
            }
            for (var7Lifetime1 = 0; var7Lifetime1 < 5; var7Lifetime1++) {
              t.b();
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "eg.D(" + param0 + ')');
        }
    }

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
        uf var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = Pixelate.field_H ? 1 : 0;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_5_0 = (443 != this.field_e) ? 0 : 1;
        var5 = stackIn_5_0;
        try {
          stackIn_8_0 = this.field_m;
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
          stackIn_11_0 = this.field_m;
          stackIn_11_1 = null;
          stackIn_11_2 = null;
          stackIn_11_3 = new StringBuilder();
          if (var5 == 0) {
            stackIn_12_1 = null;
            stackIn_12_2 = null;
            stackIn_12_4 = "https";
          } else {
            stackIn_12_1 = null;
            stackIn_12_2 = null;
            stackIn_12_4 = "http";
          }
          var4 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_11_3).append(stackIn_12_4).append("://").append(this.field_b).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b(-2);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        for (var9 = 0; var8.length > var9; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (uf) null;
            var12 = this.a(var11, 26251);
            if (var12 != null) {
              stackIn_22_0 = var12;
              return stackIn_22_0;
            }
          } catch (uf decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (uf) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (param0 < 114) {
          field_n = (wi) null;
        }
        if (var7 == null) {
          return this.b(-2);
        }
        throw eg.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
    }

    final static void e(int param0) {
        int var1 = 0;
        if (wn.field_u >= 224) {
          jg.a(256, 114);
        } else {
          var1 = wn.field_u % 32;
          jg.a(wn.field_u + (32 - var1), param0 ^ -4847);
        }
        if (param0 != -4767) {
          field_h = (int[]) null;
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
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          while (true) {
            param0--;
            if (0 > param0) {
              if (param1 != 1022226145) {
                eg.e(-111);
              }
              return;
            }
            var9 = param3;
            var5 = var9;
            var6 = param2;
            var7 = param4;
            var9[var6] = var7 + cm.a(var9[var6] >> 1, 8355711);
            param2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("eg.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        Exception exception = null;
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        Object var5 = null;
        Class var6 = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param0.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_2_0 = this.b(param1 ^ -26251);
            return stackIn_2_0;
          }
          var3 = param0.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            stackIn_5_0 = null;
            return (java.net.Socket) (stackIn_5_0);
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param0.type() != java.net.Proxy.Type.HTTP) {
            if (param0.type() == java.net.Proxy.Type.SOCKS) {
              var5 = new java.net.Socket(param0);
              ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_e)));
              stackIn_10_0 = var5;
              return (java.net.Socket) (stackIn_10_0);
            }
            if (param1 == 26251) {
              return null;
            }
            field_h = (int[]) null;
            stackIn_22_0 = null;
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
                var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_b + "/"), "https"}));
                var5 = var12 + ": " + var13;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_18_0 = this.a(var4.getPort(), var4.getHostName(), (String) (var5), (byte) 115);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("eg.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    eg() {
        this.field_m = java.net.ProxySelector.getDefault();
    }

    static {
        field_l = new int[8192];
        field_h = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

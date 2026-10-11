/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ka extends hj {
    static sd field_q;
    private java.net.ProxySelector field_k;
    static String[] field_p;
    static int[] field_m;
    static String[] field_j;
    static int field_o;
    static int field_n;
    static boolean field_r;
    static String field_l;

    final java.net.Socket a(boolean param0) throws IOException {
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
        qk var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_5_0 = (this.field_d != 443) ? 0 : 1;
        var5 = stackIn_5_0;
        try {
          stackIn_8_0 = this.field_k;
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
          stackIn_11_0 = this.field_k;
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
          return this.b(31619);
        }
        var3.addAll((Collection) ((Object) var4));
        if (!param0) {
          return (java.net.Socket) null;
        }
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        for (var9 = 0; var8.length > var9; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (qk) null;
            var12 = this.a(-39, var11);
            if (var12 != null) {
              stackIn_24_0 = var12;
              return stackIn_24_0;
            }
          } catch (qk decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (qk) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 == null) {
          return this.b(31619);
        }
        throw ka.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        java.net.InetSocketAddress var5 = null;
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var7_ref = null;
        try {
          if (param1.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_2_0 = this.b(31619);
            return stackIn_2_0;
          }
          var4 = -7 % ((7 - param0) / 35);
          var3 = param1.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            stackIn_5_0 = null;
            return (java.net.Socket) (stackIn_5_0);
          }
          var5 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1.type() != java.net.Proxy.Type.HTTP) {
            if (param1.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var6 = new java.net.Socket(param1);
            ((java.net.Socket) (var6)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_d)));
            stackIn_10_0 = var6;
            return (java.net.Socket) (stackIn_10_0);
          }
          var6 = null;
          try {
            var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
            var7 = var15;
            var8 = var15.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
            var8.setAccessible(true);
            var9 = var8.invoke((Object) null, new Object[]{var5.getHostName(), new Integer(var5.getPort())});
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
          stackIn_19_0 = this.a(var5.getPort(), var5.getHostName(), 0, (String) (var6));
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("ka.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static boolean a(char param0, int param1) {
        int var3 = 0;
        char[] var2 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (0 < param0 &&
            param0 < 128) {
            return true;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 0) {
            var6 = we.field_a;
            var2 = var6;
            for (var3 = 0; var3 < var6.length; var3++) {
              var4 = var6[var3];
              if (~param0 == ~var4) {
                return true;
              }
            }
          }
          if (param1 != 8192) {
            ka.c(110);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "ka.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        bg var4 = null;
        vb var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var4 = (bg) (gf.field_h.h(-11151));
          while (var4 != null) {
            jc.a(param0, var4, -125);
            var4 = (bg) (gf.field_h.e(0));
          }
          if (param1 >= -23) {
            field_m = (int[]) null;
          }
          var5 = (vb) (je.field_i.h(-11151));
          while (var5 != null) {
            mh.a(param0, (byte) 52, var5);
            var5 = (vb) (je.field_i.e(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "ka.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 >= -17) {
          ka.c(-43);
        }
        sd.a((byte) -124);
        sf.a(4, 11649);
    }

    ka() {
        this.field_k = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(int param0, String param1, int param2, String param3) throws IOException {
        java.net.Socket stackIn_9_0 = null;
        java.net.Socket stackIn_25_0 = null;
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
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var13 = new java.net.Socket(param1, param0);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param3 != null) {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_d + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
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
              var8 = var7.readLine();
              var10 = "proxy-authenticate: ";
              while (var8 != null) {
                if (50 > var9) {
                  if (!var8.toLowerCase().startsWith(var10)) {
                    var9++;
                    var8 = var7.readLine();
                    continue;
                  }
                  var14 = var8.substring(var10.length()).trim();
                  var8 = var14;
                  var11 = var14.indexOf(' ');
                  if (var11 != -1) {
                    var8 = var14.substring(0, var11);
                  }
                  throw new qk(var8);
                }
                break;
              }
              throw new qk("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_9_0 = var13;
              return stackIn_9_0;
            }
          }
          var6.close();
          if (param2 != 0) {
            stackIn_25_0 = (java.net.Socket) null;
            return stackIn_25_0;
          }
          var7.close();
          var13.close();
          stackIn_27_0 = null;
          return (java.net.Socket) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ka.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_j = null;
        field_p = null;
        if (param0 != 26713) {
          return;
        }
        field_q = null;
        field_m = null;
        field_l = null;
    }

    static {
        field_p = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_m = new int[8192];
        field_q = new sd("usename");
        field_j = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_l = "Warning: if you quit, you will lose any game you are in the middle of!";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

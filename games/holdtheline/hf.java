/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class hf extends qe {
    static uf field_h;
    private java.net.ProxySelector field_k;
    static String field_l;
    static int field_i;
    static ah field_j;

    private final java.net.Socket a(byte param0, String param1, String param2, int param3) throws IOException {
        java.net.Socket stackIn_11_0 = null;
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
        var12 = HoldTheLine.field_D;
        try {
          if (param0 >= -13) {
            hf.b((byte) 32);
          }
          var13 = new java.net.Socket(param1, param3);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param2 != null) {
            var6.write(("CONNECT " + this.field_c + ":" + this.field_d + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_c + ":" + this.field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
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
              var8 = var7.readLine();
              var10 = "proxy-authenticate: ";
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
                  throw new uk(var8);
                }
                break;
              }
              throw new uk("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_11_0 = var13;
              return stackIn_11_0;
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
          stackIn_30_1 = new StringBuilder().append("hf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(int param0) {
        qd.a(20830, param0);
        cf.field_w = 0;
        nm.field_b = tk.field_c[4][0];
        vg.field_P = 0;
        eb.field_o = null;
        if (pd.a(nm.field_b, true)) {
          bl.field_r = new sg(nm.field_b, 3, false, false, -1, -1);
          kk.field_j = true;
          wm.a(false, false, -1);
          return;
        }
        qn.field_k = false;
        on.field_r = -1;
        bl.field_r = null;
        ca.field_r = 3;
        fl.field_j = false;
        sk.field_i = -1;
        kk.field_j = true;
        wm.a(false, false, -1);
    }

    final java.net.Socket b(int param0) throws IOException {
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
        uk var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        ib var14 = null;
        var13 = HoldTheLine.field_D;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_6_0 = (443 != this.field_d) ? 0 : 1;
        var5 = stackIn_6_0;
        try {
          stackIn_9_0 = this.field_k;
          stackIn_9_1 = null;
          stackIn_9_2 = null;
          stackIn_9_3 = new StringBuilder();
          if (var5 != 0) {
            stackIn_10_1 = null;
            stackIn_10_2 = null;
            stackIn_10_4 = "https";
          } else {
            stackIn_10_1 = null;
            stackIn_10_2 = null;
            stackIn_10_4 = "http";
          }
          var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_9_3).append(stackIn_10_4).append("://").append(this.field_c).toString()));
          stackIn_12_0 = this.field_k;
          stackIn_12_1 = null;
          stackIn_12_2 = null;
          stackIn_12_3 = new StringBuilder();
          if (var5 == 0) {
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_4 = "https";
          } else {
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_4 = "http";
          }
          var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_12_3).append(stackIn_13_4).append("://").append(this.field_c).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(675834672);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        if (param0 >= -33) {
          var14 = (ib) null;
          hf.a((ib) null, -54);
        }
        for (var9 = 0; var8.length > var9; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (uk) null;
            var12 = this.a(var11, (byte) 110);
            if (var12 != null) {
              stackIn_25_0 = var12;
              return stackIn_25_0;
            }
          } catch (uk decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (uk) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 != null) {
          throw hf.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
        }
        return this.a(675834672);
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_8_0 = null;
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
            stackIn_3_0 = this.a(675834672);
            return stackIn_3_0;
          }
          if (param1 < 12) {
            hf.b((byte) 54);
          }
          var3 = param0.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            stackIn_8_0 = null;
            return (java.net.Socket) (stackIn_8_0);
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param0.type() != java.net.Proxy.Type.HTTP) {
            if (param0.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var5 = new java.net.Socket(param0);
            ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_c, this.field_d)));
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
                var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_c + "/"), "https"}));
                var5 = var12 + ": " + var13;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_22_0 = this.a((byte) -113, var4.getHostName(), (String) (var5), var4.getPort());
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("hf.I(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(hj param0, int param1) {
        try {
          if (param1 != -1) {
            field_j = (ah) null;
          }
          lj.a((byte) -111);
          tc.a(param0.field_z, param0.field_o, param0.field_v);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "hf.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(ib param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = param0.a(true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("hf.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    hf() {
        this.field_k = java.net.ProxySelector.getDefault();
    }

    public static void b(byte param0) {
        field_j = null;
        if (param0 != -124) {
          hf.c(24);
          field_l = null;
          field_h = null;
          return;
        }
        field_l = null;
        field_h = null;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

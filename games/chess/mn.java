/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class mn extends wn {
    static p field_h;
    private java.net.ProxySelector field_k;
    static String field_l;
    static String field_i;
    static String field_j;

    final static double a(double param0, int param1) {
        if (param1 != 2278) {
          return 0.29154005432218943;
        }
        return li.field_d[65535 & (int)(32768.0 * param0 / 3.141592653589793)];
    }

    final java.net.Socket a(byte param0) throws IOException {
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
        oa var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        String var14 = null;
        var13 = Chess.field_G;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_6_0 = (443 != this.field_c) ? 0 : 1;
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
          var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_9_3).append(stackIn_10_4).append("://").append(this.field_a).toString()));
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
          var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_12_3).append(stackIn_13_4).append("://").append(this.field_a).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(true);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        if (param0 > -79) {
          var14 = (String) null;
          mn.a((String) null, 40);
        }
        for (var9 = 0; var9 < var8.length; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (oa) null;
            var12 = this.a((byte) 96, var11);
            if (var12 != null) {
              stackIn_25_0 = var12;
              return stackIn_25_0;
            }
          } catch (oa decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (oa) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 == null) {
          return this.a(true);
        }
        throw mn.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
    }

    final static sa a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        sa var5 = null;
        ld var6 = null;
        sa stackIn_4_0 = null;
        sa stackIn_8_0 = null;
        sa stackIn_13_0 = null;
        sa stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = ef.field_j;
              return stackIn_8_0;
            }
            if (param1 != 19525) {
              var6 = (ld) null;
              mn.a((byte) 26, (ld) null);
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(1 + var2_int);
            var5 = qm.a((byte) -24, var3);
            if (var5 == null) {
              stackIn_15_0 = oj.a(var4, (byte) 86);
              return stackIn_15_0;
            }
            stackIn_13_0 = var5;
            return stackIn_13_0;
          }
          stackIn_4_0 = mh.field_a;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("mn.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(byte param0, ld param1) {
        String stackIn_30_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        var4 = Chess.field_G;
        try {
          var2 = null;
          if (param0 != -30) {
            var5 = (String) null;
            mn.a(-100, (String) null);
          }
          if (null != param1.field_o) {
            var6 = param1.field_o;
            var2 = var6;
            var2 = var6;
            var2 = var6;
            if (1 == param1.field_h) {
              var2 = "<img=0>" + var6;
            }
            if (2 == param1.field_h) {
              var2 = "<img=1>" + (String) (var2);
            }
          }
          var3 = "";
          if (2 != param1.field_k) {
            if (param1.field_k == 0 &&
              dn.field_b) {
              var3 = "[" + ja.field_c + "] ";
            }
            if (param1.field_k == 1) {
              var3 = "[" + oc.a(fb.field_D, new String[]{param1.field_b}, (byte) -122) + "] ";
            }
            if (param1.field_k == 4 &&
              kb.field_P != null) {
              var3 = "[" + kb.field_P + "] ";
            }
            if (param1.field_k == 3) {
              var3 = "[#" + param1.field_b + "] ";
            }
            if (!param1.field_d) {
              var3 = var3 + (String) (var2) + ": ";
            }
          } else {
            if (!param1.field_d) {
              if (0 == param1.field_e &&
                param1.field_q == 0) {
                var3 = oc.a(vf.field_d, new String[]{(String) (var2)}, (byte) -61);
              } else {
                var3 = oc.a(sa.field_d, new String[]{(String) (var2)}, (byte) -54);
              }
            }
          }
          stackIn_30_0 = var3;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("mn.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fk.a((Throwable) (stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        java.net.Socket stackIn_10_0 = null;
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
        var12 = Chess.field_G;
        try {
          var13 = new java.net.Socket(param1, param2);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param0 == null) {
            var6.write(("CONNECT " + this.field_a + ":" + this.field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_a + ":" + this.field_c + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
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
              var8 = var10;
              var8 = var10;
              var8 = var7.readLine();
              while (var8 != null) {
                if (var9 < 50) {
                  if (!var8.toLowerCase().startsWith(var10)) {
                    var9++;
                    var8 = var7.readLine();
                    continue;
                  }
                  var14 = var8.substring(var10.length()).trim();
                  var8 = var14;
                  var8 = var14;
                  var8 = var14;
                  var11 = var14.indexOf(' ');
                  if (var11 != -1) {
                    var8 = var14.substring(0, var11);
                  }
                  throw new oa(var8);
                }
                break;
              }
              throw new oa("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_10_0 = var13;
              return stackIn_10_0;
            }
          }
          if (param3 != 25748) {
            field_i = (String) null;
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
          stackIn_29_1 = new StringBuilder().append("mn.A(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_i = null;
        field_h = null;
        if (param0 != 32768) {
          ld var2 = (ld) null;
          mn.a((byte) -7, (ld) null);
        }
    }

    final static ve a(int param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_10_0 = null;
        ve stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Chess.field_G;
        try {
          if (null == bf.field_M) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            return null;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = ad.a(var6, param0 + param0);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (ve) (stackIn_10_0);
          }
          var3 = (ve) (bf.field_M.a((long)var2.hashCode(), param0 ^ -3001));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Fb);
            var4 = ad.a(var7, -2);
            if (var4.equals(var2)) {
              stackIn_17_0 = var3;
              return stackIn_17_0;
            }
            var3 = (ve) (bf.field_M.b(true));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("mn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_12_0 = null;
        java.net.Socket stackIn_22_0 = null;
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
            stackIn_2_0 = this.a(true);
            return stackIn_2_0;
          }
          if (param0 != 96) {
            field_h = (p) null;
          }
          var3 = param1.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            return null;
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1.type() != java.net.Proxy.Type.HTTP) {
            if (param1.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var5 = new java.net.Socket(param1);
            ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_c)));
            stackIn_12_0 = var5;
            return (java.net.Socket) (stackIn_12_0);
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
                var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                var5 = var12 + ": " + var13;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_22_0 = this.a((String) (var5), var4.getHostName(), var4.getPort(), param0 + 25652);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("mn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    mn() {
        this.field_k = java.net.ProxySelector.getDefault();
    }

    static {
        field_l = "Show game chat from my friends";
        field_h = new p(256);
        field_i = "Month";
        field_j = "Real-life threats";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class qc extends hk {
    private java.net.ProxySelector field_g;
    static k field_e;
    static String field_f;

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        if (!param0) {
          qc.a(true);
        }
    }

    private final java.net.Socket a(byte param0, String param1, String param2, int param3) throws IOException {
        java.net.Socket stackIn_6_0 = null;
        java.net.Socket stackIn_13_0 = null;
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
        var12 = TrackController.field_F ? 1 : 0;
        try {
          var13 = new java.net.Socket(param2, param3);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param1 == null) {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_c + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          var6.flush();
          if (param0 > -97) {
            stackIn_6_0 = (java.net.Socket) null;
            return stackIn_6_0;
          }
          boolean decompiledFrameRemainder0 = true;
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
                    var9++;
                    var8 = var7.readLine();
                    continue;
                  }
                  var15 = var8.substring(var10.length()).trim();
                  var8 = var15;
                  var11 = var15.indexOf(' ');
                  if (-1 != var11) {
                    var8 = var15.substring(0, var11);
                  }
                  throw new dj(var8);
                }
                break;
              }
              throw new dj("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_13_0 = var13;
              return stackIn_13_0;
            }
          }
          var6.close();
          var7.close();
          var13.close();
          stackIn_29_0 = null;
          return (java.net.Socket) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("qc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        int var2;
        int var3;
        int stackIn_9_0 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        fe.field_L = fe.field_L + 1;
        if (param0 != g.field_y) {
          if (!re.field_k) {
            if (fe.field_L >= bc.field_o) {
              stackIn_9_0 = (fe.field_L < cl.field_a + bc.field_o) ? 1 : 0;
            } else {
              stackIn_9_0 = 0;
            }
          } else {
            stackIn_9_0 = 0;
          }
          var2 = stackIn_9_0;
          if (param0 != -1) {
            if (!re.field_k) {
              if (var2 != 0) {
                fe.field_L = bc.field_o;
              } else {
                fe.field_L = 0;
              }
            } else {
              fe.field_L = bc.field_o;
            }
          } else {
            fe.field_L = 0;
          }
          ha.field_z = kf.field_b;
          kj.field_o = fg.field_a;
          if (param0 == -1) {
            if (var2 != 0) {
              re.field_k = true;
            }
          } else {
            re.field_k = false;
          }
        }
        if (param1 != 20) {
          return;
        }
        g.field_y = param0;
        if (!re.field_k &&
          fe.field_L < bc.field_o &&
          mg.field_a) {
          fe.field_L = 0;
          kj.field_o = fg.field_a;
          ha.field_z = kf.field_b;
        }
        if (re.field_k &&
          rk.field_Y == fe.field_L) {
          fe.field_L = 0;
          re.field_k = false;
        }
    }

    qc() {
        this.field_g = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket c(int param0) throws IOException {
        int var10 = 0;
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
        java.net.Socket stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        List var4 = null;
        List var5 = null;
        int var6 = 0;
        java.net.URISyntaxException var7 = null;
        Object[] var7_array = null;
        Object var8 = null;
        Object[] var9 = null;
        Object var11 = null;
        java.net.Proxy var12 = null;
        java.net.Socket var13 = null;
        dj var13_ref = null;
        IOException var13_ref2 = null;
        int var14 = 0;
        var14 = TrackController.field_F ? 1 : 0;
        var2 = -56 / ((param0 + 2) / 36);
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_6_0 = (this.field_c != 443) ? 0 : 1;
        var6 = stackIn_6_0;
        try {
          stackIn_9_0 = this.field_g;
          stackIn_9_1 = null;
          stackIn_9_2 = null;
          stackIn_9_3 = new StringBuilder();
          if (var6 == 0) {
            stackIn_10_1 = null;
            stackIn_10_2 = null;
            stackIn_10_4 = "http";
          } else {
            stackIn_10_1 = null;
            stackIn_10_2 = null;
            stackIn_10_4 = "https";
          }
          var4 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_9_3).append(stackIn_10_4).append("://").append(this.field_b).toString()));
          stackIn_12_0 = this.field_g;
          stackIn_12_1 = null;
          stackIn_12_2 = null;
          stackIn_12_3 = new StringBuilder();
          if (var6 == 0) {
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_4 = "https";
          } else {
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_4 = "http";
          }
          var5 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_12_3).append(stackIn_13_4).append("://").append(this.field_b).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b(0);
        }
        var4.addAll((Collection) ((Object) var5));
        var7_array = var4.toArray();
        var8 = null;
        var9 = var7_array;
        for (var10 = 0; var10 < var9.length; var10++) {
          var11 = var9[var10];
          var12 = (java.net.Proxy) (var11);
          try {
            if (false) throw (dj) null;
            var13 = this.a(var12, (byte) 66);
            if (var13 != null) {
              stackIn_23_0 = var13;
              return stackIn_23_0;
            }
          } catch (dj decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var13_ref = (dj) (Object) decompiledCaughtException;
            var8 = var13_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var13_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var8 != null) {
          throw qc.<RuntimeException>$cfr$sneakyThrow((Throwable) var8);
        }
        return this.b(0);
    }

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param0) {
          var4++;
        }
        if (param1 >= -59) {
          qc.$cfr$intArgs$a$feb7e63b59d8(true, -37, false, false);
        }
        return al.field_i[var4];
    }

    final static void b(int param0, byte param1) {
        if (param1 != -42) {
          field_f = (String) null;
        }
        ra.field_v = param0;
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_22_0 = null;
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
            stackIn_3_0 = this.b(0);
            return stackIn_3_0;
          }
          if (param1 != 66) {
            this.field_g = (java.net.ProxySelector) null;
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
            ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_c)));
            stackIn_22_0 = var5;
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
            var6_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_18_0 = this.a((byte) -124, (String) (var5), var4.getHostName(), var4.getPort());
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("qc.I(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$feb7e63b59d8(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param0) {
          var4++;
        }
        if (param1 >= -59) {
          qc.$cfr$intArgs$a$feb7e63b59d8(true, -37, false, false);
        }
        return al.field_i[var4];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

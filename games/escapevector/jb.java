/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class jb extends kb {
    static boolean field_p;
    static w field_r;
    static ed field_w;
    static String[] field_o;
    private java.net.ProxySelector field_n;
    static int[] field_y;
    static int[] field_x;
    static int[] field_v;
    static jk[] field_k;
    static int[] field_h;
    static int[] field_z;
    static int[] field_t;
    static mb[] field_i;
    static int[] field_u;
    static ci[] field_l;
    static int[] field_q;
    static int[] field_j;
    static int[] field_m;
    static int[] field_s;

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
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
          if (param0.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_2_0 = this.b(false);
            return stackIn_2_0;
          }
          var3 = param0.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            return null;
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param0.type() != java.net.Proxy.Type.HTTP) {
            if (param0.type() == java.net.Proxy.Type.SOCKS) {
              var5 = new java.net.Socket(param0);
              ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_b)));
              stackIn_19_0 = var5;
              return (java.net.Socket) (stackIn_19_0);
            }
            if (param1 < -61) {
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
                var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                var5 = var12 + ": " + var13;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_15_0 = this.a(var4.getPort(), (String) (var5), 37, var4.getHostName());
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var3_ref;
          stackIn_27_1 = new StringBuilder().append("jb.H(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(long param0, byte param1) {
        StringBuilder discarded$0 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var11;
        int var10;
        var11 = EscapeVector.field_A;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        var3 = 0;
        var4 = param0;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        var6 = new StringBuilder(var3);
        while (0L != param0) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = tc.field_n[(int)(-(param0 * 37L) + var7)];
          if (var9 == 95) {
            var10 = var6.length() - 1;
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        if (param1 != 29) {
          jb.a(-73L, (byte) -11);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final java.net.Socket a(int param0) throws IOException {
        int var9 = 0;
        java.net.URISyntaxException uRISyntaxException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        Object[] var6 = null;
        Object var7 = null;
        Object[] var8 = null;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        int var13 = 0;
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
        im var12_ref = null;
        IOException var12_ref2 = null;
        var13 = EscapeVector.field_A;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_5_0 = (443 != this.field_b) ? 0 : 1;
        var5 = stackIn_5_0;
        try {
          stackIn_8_0 = this.field_n;
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
          var3 = ((java.net.ProxySelector) (Object) stackIn_8_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_8_3).append(stackIn_9_4).append("://").append(this.field_a).toString()));
          stackIn_11_0 = this.field_n;
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
          var4 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_11_3).append(stackIn_12_4).append("://").append(this.field_a).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          uRISyntaxException = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b(false);
        }
        var3.addAll((Collection) ((Object) var4));
        var6 = var3.toArray();
        var7 = null;
        var8 = var6;
        for (var9 = param0; var9 < var8.length; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (im) null;
            var12 = this.a(var11, -76);
            if (var12 != null) {
              stackIn_22_0 = var12;
              return stackIn_22_0;
            }
          } catch (im decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (im) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 == null) {
          return this.b(false);
        }
        throw jb.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
    }

    public static void c(boolean param0) {
        field_m = null;
        field_j = null;
        if (!param0) {
          jb.a(48L, (byte) -107);
        }
        field_x = null;
        field_w = null;
        field_o = null;
        field_l = null;
        field_q = null;
        field_y = null;
        field_s = null;
        field_u = null;
        field_h = null;
        field_i = null;
        field_r = null;
        field_t = null;
        field_z = null;
        field_v = null;
        field_k = null;
    }

    private final java.net.Socket a(int param0, String param1, int param2, String param3) throws IOException {
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
        var12 = EscapeVector.field_A;
        try {
          var13 = new java.net.Socket(param3, param0);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param1 != null) {
            var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          var6.flush();
          var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
          if (param2 != 37) {
            field_y = (int[]) null;
          }
          boolean decompiledFrameRemainder0 = true;
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
                    var8 = var7.readLine();
                    var9++;
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
                  throw new im(var8);
                }
                break;
              }
              throw new im("");
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
          stackIn_30_1 = new StringBuilder().append("jb.F(").append(param0).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        if (param0 < 88) {
          field_t = (int[]) null;
        }
        if (param1 == 0) {
          return 0;
        }
        if (1 == param1) {
          return 1;
        }
        if (param1 == 2) {
          return 2;
        }
        if (param1 == 3) {
          return 3;
        }
        return -1;
    }

    jb() {
        this.field_n = java.net.ProxySelector.getDefault();
    }

    static {
        field_o = new String[]{"Low-security Facility", "Deep Excavation", "Blue Defence", "Pod Defence", "Attractor Tunnel", "Moon Fuel Depot", "TNT Storage Cavern", "Force Matrix Defence", "Ice Labyrinth", "Seeker Caves", "High-security Stronghold", "Rock Buster Twister", "Small Ship Fuel Depot", "The Shafts", "Seeker Prison Cell", "Central Munition Cavern"};
        field_p = false;
        field_w = new ed(1, 1);
        field_z = new int[]{8, 17};
        field_v = new int[]{18, 19, 20, 21, 0, 1, 2, 3, 22, 23, 24, 25, 31, 30};
        field_h = new int[]{3, 3, 3, 3, 1, 1, 1, 1, 4, 4, 4, 4, 8, 8};
        field_t = new int[]{100, 100, 200, 300, 200, 500, 100, 300, 100, 500, 1000, 500, 500, 300, 500, 500, 500, 300, 50, 50, 100, 150, 100, 200, 300, 500, 200, 500, 500, 1000, 500, 100};
        field_j = new int[]{25000, 100000, 350000, 800000};
        field_x = new int[]{4, 5, 26, 27};
        field_y = new int[]{0, 0, 2, 2};
        field_m = new int[]{22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        field_u = new int[]{3, 7, 11, 15, 3, 7, 11, 15, 3, 7, 11, 15, 0, 10};
        field_q = new int[]{1, 1, 1, 1, 3, 3, 3, 1, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 8, 8, 8};
        field_s = new int[]{1, 1, 2, 3, 2, 5, 1, 3, 1, 5, 10, 5, 5, 3, 5, 5, 5, 3, 1, 1, 1, 1, 1, 2, 3, 5, 2, 5, 5, 10, 5, 1};
        cf.a((byte) -76);
        gi.a(0);
        jj.a(false);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

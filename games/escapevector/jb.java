/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

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
        Object var3 = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        java.net.Socket var5 = null;
        Exception var6 = null;
        Class var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return ((jb) this).b(false);
                }
                case 2: {
                    var3 = param0.address();
                    if (var3 instanceof java.net.InetSocketAddress) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return null;
                }
                case 4: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param0.type() != java.net.Proxy.Type.HTTP) {
                        statePc = 13;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = null;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 == null) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return this.a(var4_ref.getPort(), (String) (Object) var5, 37, var4_ref.getHostName());
                }
                case 13: {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5 = new java.net.Socket(param0);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((jb) this).field_a, ((jb) this).field_b));
                    return var5;
                }
                case 16: {
                    if (param1 >= -61) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return null;
                }
                case 18: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(long param0, byte param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = EscapeVector.field_A;
        if ((param0 ^ -1L) >= -1L) {
            return null;
        }
        if ((param0 ^ -1L) <= -6582952005840035282L) {
            return null;
        }
        if (param0 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = param0;
        while ((var4 ^ -1L) != -1L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (0L != param0) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = tc.field_n[(int)(-(param0 * 37L) + var7)];
            if (!(var9 != 95)) {
                var10 = var6.length() + -1;
                var9 = 160;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        if (param1 != 29) {
            String discarded$1 = jb.a(-73L, (byte) -11);
        }
        StringBuilder discarded$2 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final java.net.Socket a(int param0) throws IOException {
        java.net.URISyntaxException uRISyntaxException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        Object[] var6 = null;
        im var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        im var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        int stackIn_5_0 = 0;
        java.net.ProxySelector stackIn_7_0 = null;
        java.net.URI stackIn_7_1 = null;
        java.net.URI stackIn_7_2 = null;
        StringBuilder stackIn_7_3 = null;
        java.net.ProxySelector stackIn_8_0 = null;
        java.net.URI stackIn_8_1 = null;
        java.net.URI stackIn_8_2 = null;
        StringBuilder stackIn_8_3 = null;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        String stackIn_9_4 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        String stackIn_12_4 = null;
        java.net.Socket stackIn_21_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        java.net.ProxySelector stackOut_6_0 = null;
        java.net.URI stackOut_6_1 = null;
        java.net.URI stackOut_6_2 = null;
        StringBuilder stackOut_6_3 = null;
        java.net.ProxySelector stackOut_7_0 = null;
        java.net.URI stackOut_7_1 = null;
        java.net.URI stackOut_7_2 = null;
        StringBuilder stackOut_7_3 = null;
        String stackOut_7_4 = null;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        String stackOut_8_4 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.Socket stackOut_20_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = EscapeVector.field_A;
                    if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    String discarded$4 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (443 != ((jb) this).field_b) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var5 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        stackOut_6_0 = ((jb) this).field_n;
                        stackOut_6_1 = null;
                        stackOut_6_2 = null;
                        stackOut_6_3 = new StringBuilder();
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        stackIn_8_3 = stackOut_6_3;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        stackIn_7_3 = stackOut_6_3;
                        if (var5 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (java.net.ProxySelector) (Object) stackIn_7_0;
                        stackOut_7_1 = null;
                        stackOut_7_2 = null;
                        stackOut_7_3 = (StringBuilder) (Object) stackIn_7_3;
                        stackOut_7_4 = "https";
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        stackIn_9_4 = stackOut_7_4;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (java.net.ProxySelector) (Object) stackIn_8_0;
                        stackOut_8_1 = null;
                        stackOut_8_2 = null;
                        stackOut_8_3 = (StringBuilder) (Object) stackIn_8_3;
                        stackOut_8_4 = "http";
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        stackIn_9_3 = stackOut_8_3;
                        stackIn_9_4 = stackOut_8_4;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        new java.net.URI(stackIn_9_4 + "://" + ((jb) this).field_a);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(stackIn_9_1);
                        stackOut_9_0 = ((jb) this).field_n;
                        stackOut_9_1 = null;
                        stackOut_9_2 = null;
                        stackOut_9_3 = new StringBuilder();
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_11_3 = stackOut_9_3;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        stackIn_10_3 = stackOut_9_3;
                        if (var5 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                        stackOut_10_1 = null;
                        stackOut_10_2 = null;
                        stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                        stackOut_10_4 = "http";
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_12_3 = stackOut_10_3;
                        stackIn_12_4 = stackOut_10_4;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (java.net.ProxySelector) (Object) stackIn_11_0;
                        stackOut_11_1 = null;
                        stackOut_11_2 = null;
                        stackOut_11_3 = (StringBuilder) (Object) stackIn_11_3;
                        stackOut_11_4 = "https";
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        stackIn_12_4 = stackOut_11_4;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        new java.net.URI(stackIn_12_4 + "://" + ((jb) this).field_a);
                        var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(stackIn_12_1);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    uRISyntaxException = (java.net.URISyntaxException) (Object) caughtException;
                    return ((jb) this).b(false);
                }
                case 15: {
                    boolean discarded$5 = var3.addAll((Collection) (Object) var4);
                    var6 = var3.toArray();
                    var7 = null;
                    var8 = var6;
                    var9 = param0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var9 >= var8.length) {
                        statePc = 24;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10 = var8[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        var12 = this.a(var11, -76);
                        if (var12 != null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof im ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof im ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (java.net.Socket) var12;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof im ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var12_ref = (im) (Object) caughtException;
                    var7 = var12_ref;
                    var9++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 23: {
                    var12_ref2 = (IOException) (Object) caughtException;
                    var9++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 24: {
                    if (var7 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    throw var7;
                }
                case 26: {
                    return ((jb) this).b(false);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(boolean param0) {
        field_m = null;
        field_j = null;
        if (!param0) {
            String discarded$0 = jb.a(48L, (byte) -107);
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
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        L0: {
          var12 = EscapeVector.field_A;
          var13 = new java.net.Socket(param3, param0);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param1 != null) {
            var6.write(("CONNECT " + ((jb) this).field_a + ":" + ((jb) this).field_b + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((jb) this).field_a + ":" + ((jb) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        L1: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          if (param2 == 37) {
            break L1;
          } else {
            field_y = null;
            break L1;
          }
        }
        L2: {
          var8 = var7.readLine();
          if (var8 != null) {
            L3: {
              if (var8.startsWith("HTTP/1.0 200")) {
                break L3;
              } else {
                if (!var8.startsWith("HTTP/1.1 200")) {
                  L4: {
                    if (var8.startsWith("HTTP/1.0 407")) {
                      break L4;
                    } else {
                      if (var8.startsWith("HTTP/1.1 407")) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var9 = 0;
                  var10 = "proxy-authenticate: ";
                  var8 = var10;
                  var8 = var10;
                  var8 = var7.readLine();
                  L5: while (true) {
                    L6: {
                      if (var8 == null) {
                        break L6;
                      } else {
                        if (var9 >= 50) {
                          break L6;
                        } else {
                          if (var8.toLowerCase().startsWith(var10)) {
                            L7: {
                              var14 = var8.substring(var10.length()).trim();
                              var8 = var14;
                              var8 = var14;
                              var11 = var14.indexOf(' ');
                              if (0 == (var11 ^ -1)) {
                                break L7;
                              } else {
                                var8 = var14.substring(0, var11);
                                break L7;
                              }
                            }
                            throw new im(var8);
                          } else {
                            var8 = var7.readLine();
                            var9++;
                            continue L5;
                          }
                        }
                      }
                    }
                    throw new im("");
                  }
                } else {
                  break L3;
                }
              }
            }
            return var13;
          } else {
            break L2;
          }
        }
        var6.close();
        var7.close();
        var13.close();
        return null;
    }

    final static int a(int param0, int param1) {
        if (param0 < 88) {
            field_t = null;
        }
        if (!(param1 != 0)) {
            return 0;
        }
        if (1 == param1) {
            return 1;
        }
        if (param1 == 2) {
            return 2;
        }
        if (!(-4 != (param1 ^ -1))) {
            return 3;
        }
        return -1;
    }

    jb() {
        ((jb) this).field_n = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
}

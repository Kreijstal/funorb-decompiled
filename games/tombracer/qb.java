/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class qb extends be {
    static int field_f;
    static jpa[] field_e;
    private java.net.ProxySelector field_d;

    public static void b(byte param0) {
        field_e = null;
        if (param0 != 90) {
            qb.b((byte) -30);
        }
    }

    final static String a(String param0, int param1, int param2) {
        if (3 == param2) {
            return hj.field_e;
        }
        if (param1 != 8793) {
            field_e = null;
        }
        if (-7 == (param2 ^ -1)) {
            return era.field_f;
        }
        if (!(param2 != 7)) {
            return tla.field_j;
        }
        if (param2 == 8) {
            return ipa.field_N;
        }
        if (param2 == -10) {
            return nta.field_e;
        }
        if (!(-11 != param2)) {
            return cha.field_c;
        }
        if (-12 == (param2 ^ -1)) {
            return esa.field_a;
        }
        if (!(14 != param2)) {
            return gl.a((byte) 92, ir.field_e, new String[1]);
        }
        return null;
    }

    final static void c(byte param0) {
        lqa var1 = null;
        int var2 = 0;
        L0: {
          var2 = TombRacer.field_G ? 1 : 0;
          var1 = uv.b(false);
          if (param0 <= -90) {
            break L0;
          } else {
            field_f = 50;
            break L0;
          }
        }
        L1: {
          if (kra.field_a != var1) {
            if (var1 != paa.field_z) {
              if (nj.field_t == var1) {
                baa.field_d.a(0, new ei[1]);
                break L1;
              } else {
                if (vea.field_c == var1) {
                  baa.field_d.a(0, new ei[1]);
                  break L1;
                } else {
                  if (laa.field_x != var1) {
                    if (var1 != daa.field_d) {
                      break L1;
                    } else {
                      baa.field_d.a(0, new ei[1]);
                      break L1;
                    }
                  } else {
                    baa.field_d.a(0, new ei[1]);
                    break L1;
                  }
                }
              }
            } else {
              baa.field_d.a(0, new ei[1]);
              break L1;
            }
          } else {
            baa.field_d.a(0, new ei[1]);
            break L1;
          }
        }
        L2: {
          System.gc();
          if (uv.b(false).field_c) {
            break L2;
          } else {
            qb.c((byte) -127);
            break L2;
          }
        }
    }

    final static void a(int param0, int param1) {
        if (msa.field_a == param0) {
            // ifnull L16
        } else {
            return;
        }
        if (fna.field_j == null) {
            return;
        }
        aoa.a(83, 3);
        aoa.a(param1 ^ 125, 4);
        aoa.a(76, param1);
        aoa.a(param1 ^ 80, 6);
        aoa.a(82, 7);
        aoa.a(param1 ^ 68, 8);
    }

    final java.net.Socket a(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        wra var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        wra var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
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
                    var13 = TombRacer.field_G ? 1 : 0;
                    if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (443 != ((qb) this).field_b) {
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
                        stackOut_6_0 = ((qb) this).field_d;
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
                        new java.net.URI(stackIn_9_4 + "://" + ((qb) this).field_a);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(stackIn_9_1);
                        stackOut_9_0 = ((qb) this).field_d;
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
                        if (var5 != 0) {
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
                        stackOut_10_4 = "https";
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
                        stackOut_11_4 = "http";
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
                        new java.net.URI(stackIn_12_4 + "://" + ((qb) this).field_a);
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
                    var6 = (java.net.URISyntaxException) (Object) caughtException;
                    return ((qb) this).a((byte) 112);
                }
                case 15: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var9 >= var8_array.length) {
                        statePc = 24;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        var12_ref2 = this.a(var11, 443);
                        if (var12_ref2 != null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof wra ? 22 : 23);
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
                        statePc = (stateCaught_19 instanceof wra ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (java.net.Socket) var12_ref2;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof wra ? 22 : 23);
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var12 = (wra) (Object) caughtException;
                    var7 = var12;
                    var9++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 23: {
                    var12_ref = (IOException) (Object) caughtException;
                    var9++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 24: {
                    if (var7 != null) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    throw var7;
                }
                case 27: {
                    if (param0 == 25927) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return null;
                }
                case 29: {
                    return ((qb) this).a((byte) -105);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

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
                    if (param0.type() == java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return ((qb) this).a((byte) 112);
                }
                case 3: {
                    if (param1 == 443) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    qb.b((byte) 83);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var3 = param0.address();
                    if (var3 instanceof java.net.InetSocketAddress) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return null;
                }
                case 7: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param0.type() != java.net.Proxy.Type.HTTP) {
                        statePc = 15;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5 = null;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 == null) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (!((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return this.a(73, var4_ref.getPort(), var4_ref.getHostName(), (String) (Object) var5);
                }
                case 15: {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = new java.net.Socket(param0);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((qb) this).field_a, ((qb) this).field_b));
                    return var5;
                }
                case 18: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
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
          var12 = TombRacer.field_G ? 1 : 0;
          var13 = new java.net.Socket(param2, param1);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param3 == null) {
            var6.write(("CONNECT " + ((qb) this).field_a + ":" + ((qb) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((qb) this).field_a + ":" + ((qb) this).field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        L1: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          if (param0 >= 11) {
            break L1;
          } else {
            qb.c((byte) -97);
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
                if (var8.startsWith("HTTP/1.1 200")) {
                  break L3;
                } else {
                  L4: {
                    if (var8.startsWith("HTTP/1.0 407")) {
                      break L4;
                    } else {
                      if (!var8.startsWith("HTTP/1.1 407")) {
                        break L2;
                      } else {
                        break L4;
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
                        if (50 <= var9) {
                          break L6;
                        } else {
                          if (var8.toLowerCase().startsWith(var10)) {
                            L7: {
                              var14 = var8.substring(var10.length()).trim();
                              var8 = var14;
                              var8 = var14;
                              var11 = var14.indexOf(' ');
                              if ((var11 ^ -1) == 0) {
                                break L7;
                              } else {
                                var8 = var14.substring(0, var11);
                                break L7;
                              }
                            }
                            throw new wra(var8);
                          } else {
                            var9++;
                            var8 = var7.readLine();
                            continue L5;
                          }
                        }
                      }
                    }
                    throw new wra("");
                  }
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

    final static int a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        L0: {
          if (Math.max(param6, param0) < Math.min(param7, param5)) {
            break L0;
          } else {
            if (Math.max(param3, param1) < Math.min(param9, param2)) {
              break L0;
            } else {
              if (Math.max(param7, param5) < Math.min(param6, param0)) {
                break L0;
              } else {
                if (Math.max(param9, param2) >= Math.min(param3, param1)) {
                  L1: {
                    param1 = param1 - param3;
                    param0 = param0 - param6;
                    param5 = param5 - param7;
                    param2 = param2 - param9;
                    param6 = param6 - param7;
                    param3 = param3 - param9;
                    var10 = -14 + Math.max(Math.max(vd.b(1, param6), vd.b(1, param0)), vd.b(1, param5));
                    if (0 >= var10) {
                      break L1;
                    } else {
                      param5 = param5 >> var10;
                      param0 = param0 >> var10;
                      param6 = param6 >> var10;
                      break L1;
                    }
                  }
                  L2: {
                    if (param4 < -63) {
                      break L2;
                    } else {
                      field_e = null;
                      break L2;
                    }
                  }
                  L3: {
                    var10 = Math.max(Math.max(vd.b(1, param3), vd.b(1, param1)), vd.b(1, param2)) - 14;
                    if ((var10 ^ -1) >= -1) {
                      break L3;
                    } else {
                      param1 = param1 >> var10;
                      param3 = param3 >> var10;
                      param2 = param2 >> var10;
                      break L3;
                    }
                  }
                  return nla.a(2749, param2, param1, param3, param6, param8, param0, param5);
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -1;
    }

    qb() {
        ((qb) this).field_d = java.net.ProxySelector.getDefault();
    }

    static {
    }
}

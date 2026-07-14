/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class se extends qg {
    private java.net.ProxySelector field_k;
    static int field_o;
    static cg field_n;
    static vo field_m;
    static String field_i;
    static rh field_l;
    static of field_j;

    private final java.net.Socket a(String param0, String param1, byte param2, int param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        BufferedReader var16 = null;
        String var26 = null;
        String var38 = null;
        BufferedReader var39 = null;
        String var40 = null;
        String var41 = null;
        String var54 = null;
        var12 = ZombieDawn.field_J;
        var13 = new java.net.Socket(param1, param3);
        var13.setSoTimeout(10000);
        var6 = var13.getOutputStream();
        if (param0 == null) {
          var6.write(("CONNECT " + ((se) this).field_e + ":" + ((se) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          if (param2 >= 43) {
            L0: {
              var39 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var7 = var39;
              var40 = var39.readLine();
              var8 = var40;
              var8 = var40;
              if (var40 == null) {
                break L0;
              } else {
                L1: {
                  if (var40.startsWith("HTTP/1.0 200")) {
                    break L1;
                  } else {
                    if (!var40.startsWith("HTTP/1.1 200")) {
                      L2: {
                        if (var40.startsWith("HTTP/1.0 407")) {
                          var9 = 0;
                          var8 = var39.readLine();
                          var10 = "proxy-authenticate: ";
                          break L2;
                        } else {
                          if (var40.startsWith("HTTP/1.1 407")) {
                            var9 = 0;
                            var8 = var39.readLine();
                            var10 = "proxy-authenticate: ";
                            var8 = var10;
                            break L2;
                          } else {
                            break L0;
                          }
                        }
                      }
                      L3: while (true) {
                        L4: {
                          if (var8 == null) {
                            break L4;
                          } else {
                            if (var9 >= 50) {
                              break L4;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var8 = var39.readLine();
                                var54 = var8;
                                var9++;
                                continue L3;
                              } else {
                                L5: {
                                  var41 = var8.substring(var10.length()).trim();
                                  var8 = var41;
                                  var11 = var41.indexOf(' ');
                                  if ((var11 ^ -1) != 0) {
                                    var8 = var41.substring(0, var11);
                                    break L5;
                                  } else {
                                    var8 = var41;
                                    break L5;
                                  }
                                }
                                throw new dg(var8);
                              }
                            }
                          }
                        }
                        throw new dg("");
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                return var13;
              }
            }
            var6.close();
            var39.close();
            var13.close();
            return null;
          } else {
            return null;
          }
        } else {
          var6.write(("CONNECT " + ((se) this).field_e + ":" + ((se) this).field_b + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          var6.flush();
          if (param2 >= 43) {
            var16 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
            var7 = var16;
            var26 = var16.readLine();
            var8 = var26;
            if (var26 != null) {
              if (!var26.startsWith("HTTP/1.0 200")) {
                if (!var26.startsWith("HTTP/1.1 200")) {
                  L6: {
                    if (var26.startsWith("HTTP/1.0 407")) {
                      var9 = 0;
                      var8 = var16.readLine();
                      var10 = "proxy-authenticate: ";
                      break L6;
                    } else {
                      if (var26.startsWith("HTTP/1.1 407")) {
                        var9 = 0;
                        var8 = var16.readLine();
                        var10 = "proxy-authenticate: ";
                        var8 = var10;
                        var8 = var10;
                        break L6;
                      } else {
                        var6.close();
                        var16.close();
                        var13.close();
                        return null;
                      }
                    }
                  }
                  L7: while (true) {
                    if (var8 != null) {
                      if (var9 < 50) {
                        if (!var8.toLowerCase().startsWith(var10)) {
                          var8 = var16.readLine();
                          var9++;
                          continue L7;
                        } else {
                          L8: {
                            var38 = var8.substring(var10.length()).trim();
                            var8 = var38;
                            var8 = var38;
                            var11 = var38.indexOf(' ');
                            if ((var11 ^ -1) != 0) {
                              var8 = var38.substring(0, var11);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          throw new dg(var8);
                        }
                      } else {
                        throw new dg("");
                      }
                    } else {
                      throw new dg("");
                    }
                  }
                } else {
                  return var13;
                }
              } else {
                return var13;
              }
            } else {
              var6.close();
              var16.close();
              var13.close();
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        rk.a((byte) -65, (java.awt.Component) (Object) param1);
        pg.a((java.awt.Component) (Object) param1, (byte) 66);
        if (param0 == 20922) {
          if (jl.field_u != null) {
            jl.field_u.a(param0 + 3012, (java.awt.Component) (Object) param1);
            return;
          } else {
            return;
          }
        } else {
          se.a(true, -64, 43, 72, 83, -44, -98, -34, -52, -65, -84, 97, -14, 56, 78, 114);
          if (jl.field_u == null) {
            return;
          } else {
            jl.field_u.a(param0 + 3012, (java.awt.Component) (Object) param1);
            return;
          }
        }
    }

    public static void c(int param0) {
        field_m = null;
        field_j = null;
        if (param0 != 32) {
          se.c(-126);
          field_n = null;
          field_l = null;
          field_i = null;
          return;
        } else {
          field_n = null;
          field_l = null;
          field_i = null;
          return;
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = ZombieDawn.field_J;
        if (param13 < param4) {
          if (param4 < param14) {
            pi.a(param11, param10, bi.field_c, param6, (byte) -104, param7, param12, param8, param2, param1, param15, param14, param9, param3, param5, param13, param4);
            if (param0) {
              field_m = null;
              return;
            } else {
              return;
            }
          } else {
            if (param13 >= param14) {
              pi.a(param5, param1, bi.field_c, param11, (byte) -104, param12, param9, param3, param8, param15, param10, param4, param7, param2, param6, param14, param13);
              if (param0) {
                field_m = null;
                return;
              } else {
                return;
              }
            } else {
              pi.a(param5, param15, bi.field_c, param6, (byte) -104, param12, param7, param3, param2, param1, param10, param4, param9, param8, param11, param13, param14);
              if (param0) {
                field_m = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param13 < param14) {
            pi.a(param11, param1, bi.field_c, param5, (byte) -104, param7, param9, param8, param3, param10, param15, param14, param12, param2, param6, param4, param13);
            if (!param0) {
              return;
            } else {
              field_m = null;
              return;
            }
          } else {
            if (param4 >= param14) {
              pi.a(param6, param10, bi.field_c, param11, (byte) -104, param9, param12, param2, param8, param15, param1, param13, param7, param3, param5, param14, param4);
              if (!param0) {
                return;
              } else {
                field_m = null;
                return;
              }
            } else {
              pi.a(param6, param15, bi.field_c, param5, (byte) -104, param9, param7, param2, param3, param10, param1, param13, param12, param8, param11, param4, param14);
              if (param0) {
                field_m = null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    se() {
        ((se) this).field_k = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket a(boolean param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        dg var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        dg var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_6_0 = 0;
        java.net.ProxySelector stackIn_8_0 = null;
        java.net.URI stackIn_8_1 = null;
        java.net.URI stackIn_8_2 = null;
        StringBuilder stackIn_8_3 = null;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        String stackIn_10_4 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        String stackIn_13_4 = null;
        java.net.Socket stackIn_24_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        java.net.ProxySelector stackOut_7_0 = null;
        java.net.URI stackOut_7_1 = null;
        java.net.URI stackOut_7_2 = null;
        StringBuilder stackOut_7_3 = null;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        String stackOut_8_4 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        String stackOut_9_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.Socket stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ZombieDawn.field_J;
                    if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-444 != (((se) this).field_b ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var5 = stackIn_6_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = ((se) this).field_k;
                        stackOut_7_1 = null;
                        stackOut_7_2 = null;
                        stackOut_7_3 = new StringBuilder();
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        if (var5 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (java.net.ProxySelector) (Object) stackIn_8_0;
                        stackOut_8_1 = null;
                        stackOut_8_2 = null;
                        stackOut_8_3 = (StringBuilder) (Object) stackIn_8_3;
                        stackOut_8_4 = "https";
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        stackIn_10_3 = stackOut_8_3;
                        stackIn_10_4 = stackOut_8_4;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (java.net.ProxySelector) (Object) stackIn_9_0;
                        stackOut_9_1 = null;
                        stackOut_9_2 = null;
                        stackOut_9_3 = (StringBuilder) (Object) stackIn_9_3;
                        stackOut_9_4 = "http";
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        stackIn_10_3 = stackOut_9_3;
                        stackIn_10_4 = stackOut_9_4;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        new java.net.URI(stackIn_10_4 + "://" + ((se) this).field_e);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(stackIn_10_1);
                        stackOut_10_0 = ((se) this).field_k;
                        stackOut_10_1 = null;
                        stackOut_10_2 = null;
                        stackOut_10_3 = new StringBuilder();
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_12_3 = stackOut_10_3;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        stackIn_11_3 = stackOut_10_3;
                        if (var5 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
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
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_13_4 = stackOut_11_4;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (java.net.ProxySelector) (Object) stackIn_12_0;
                        stackOut_12_1 = null;
                        stackOut_12_2 = null;
                        stackOut_12_3 = (StringBuilder) (Object) stackIn_12_3;
                        stackOut_12_4 = "http";
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        stackIn_13_4 = stackOut_12_4;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        new java.net.URI(stackIn_13_4 + "://" + ((se) this).field_e);
                        var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(stackIn_13_1);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var6 = (java.net.URISyntaxException) (Object) caughtException;
                    return ((se) this).b(16076);
                }
                case 16: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    if (!param0) {
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
                    var8_array = var6_array;
                    var9 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var8_array.length <= var9) {
                        statePc = 28;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var12_ref2 = this.a(var11, (byte) -27);
                        if (var12_ref2 != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof dg ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof dg ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = (java.net.Socket) var12_ref2;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof dg ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var12 = (dg) (Object) caughtException;
                    var7 = var12;
                    var9++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 26: {
                    var12_ref = (IOException) (Object) caughtException;
                    var9++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 28: {
                    if (var7 != null) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    throw var7;
                }
                case 31: {
                    return ((se) this).b(16076);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
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
                    return ((se) this).b(param1 ^ -16087);
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
                        if (var8 != null) {
                            statePc = 8;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (!((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
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
                    return this.a((String) (Object) var5, var4_ref.getHostName(), (byte) 69, var4_ref.getPort());
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
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((se) this).field_e, ((se) this).field_b));
                    return var5;
                }
                case 16: {
                    if (param1 == -27) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 10;
        field_n = new cg(15, 0, 1, 0);
        field_i = "PER MONTH";
        field_m = new vo();
        field_l = new rh();
    }
}

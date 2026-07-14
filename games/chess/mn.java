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
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        oa var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        oa var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        Object var14 = null;
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
                    var13 = Chess.field_G;
                    if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    String discarded$3 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (443 != ((mn) this).field_c) {
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
                        stackOut_7_0 = ((mn) this).field_k;
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
                        new java.net.URI((String) (Object) (stackIn_10_4 + "://" + ((mn) this).field_a));
                        var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select((java.net.URI) (Object) stackIn_10_1);
                        stackOut_10_0 = ((mn) this).field_k;
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
                        if (var5 == 0) {
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
                        stackOut_11_4 = "http";
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
                        stackOut_12_4 = "https";
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
                        new java.net.URI((String) (Object) (stackIn_13_4 + "://" + ((mn) this).field_a));
                        var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select((java.net.URI) (Object) stackIn_13_1);
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
                    return ((mn) this).a(true);
                }
                case 16: {
                    boolean discarded$4 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    if (param0 <= -79) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var14 = null;
                    sa discarded$5 = mn.a((String) null, 40);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var9 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var9 >= var8_array.length) {
                        statePc = 27;
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
                        var12_ref2 = this.a((byte) 96, var11);
                        if (var12_ref2 != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof oa ? 25 : 26);
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
                        statePc = (stateCaught_22 instanceof oa ? 25 : 26);
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
                        statePc = (stateCaught_23 instanceof oa ? 25 : 26);
                        continue stateLoop;
                    }
                }
                case 24: {
                    return (java.net.Socket) (Object) stackIn_24_0;
                }
                case 25: {
                    var12 = (oa) (Object) caughtException;
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
                case 27: {
                    if (var7 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    throw var7;
                }
                case 29: {
                    return ((mn) this).a(true);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static sa a(String param0, int param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        sa var5 = null;
        Object var6 = null;
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length() != 0) {
              var2 = param0.indexOf('@');
              if ((var2 ^ -1) == 0) {
                return ef.field_j;
              } else {
                L1: {
                  if (param1 == 19525) {
                    break L1;
                  } else {
                    var6 = null;
                    String discarded$2 = mn.a((byte) 26, (ld) null);
                    break L1;
                  }
                }
                var3 = param0.substring(0, var2);
                var4 = param0.substring(1 + var2);
                var5 = qm.a((byte) -24, var3);
                if (var5 == null) {
                  return oj.a(var4, (byte) 86);
                } else {
                  return var5;
                }
              }
            } else {
              break L0;
            }
          }
        }
        return mh.field_a;
    }

    final static String a(byte param0, ld param1) {
        String var2 = null;
        String var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        L0: {
          var4 = Chess.field_G;
          var2 = null;
          if (param0 == -30) {
            break L0;
          } else {
            var5 = null;
            ve discarded$1 = mn.a(-100, (String) null);
            break L0;
          }
        }
        L1: {
          if (null != param1.field_o) {
            L2: {
              var6 = param1.field_o;
              var2 = var6;
              var2 = var6;
              if (1 != param1.field_h) {
                break L2;
              } else {
                var2 = "<img=0>" + var6;
                break L2;
              }
            }
            if (2 != param1.field_h) {
              break L1;
            } else {
              var2 = "<img=1>" + var2;
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          var3 = "";
          if (2 != param1.field_k) {
            L4: {
              if (param1.field_k != 0) {
                break L4;
              } else {
                if (dn.field_b) {
                  var3 = "[" + ja.field_c + "] ";
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param1.field_k != 1) {
                break L5;
              } else {
                var3 = "[" + oc.a(fb.field_D, new String[1], (byte) -122) + "] ";
                break L5;
              }
            }
            L6: {
              if ((param1.field_k ^ -1) != -5) {
                break L6;
              } else {
                if (kb.field_P == null) {
                  break L6;
                } else {
                  var3 = "[" + kb.field_P + "] ";
                  break L6;
                }
              }
            }
            L7: {
              if (-4 == (param1.field_k ^ -1)) {
                var3 = "[#" + param1.field_b + "] ";
                break L7;
              } else {
                break L7;
              }
            }
            if (param1.field_d) {
              break L3;
            } else {
              var3 = var3 + var2 + ": ";
              break L3;
            }
          } else {
            if (param1.field_d) {
              break L3;
            } else {
              L8: {
                if (0 != param1.field_e) {
                  break L8;
                } else {
                  if (-1 != (param1.field_q ^ -1)) {
                    break L8;
                  } else {
                    var3 = oc.a(vf.field_d, new String[1], (byte) -61);
                    break L3;
                  }
                }
              }
              var3 = oc.a(sa.field_d, new String[1], (byte) -54);
              break L3;
            }
          }
        }
        return var3;
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
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
          var12 = Chess.field_G;
          var13 = new java.net.Socket(param1, param2);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param0 == null) {
            var6.write(("CONNECT " + ((mn) this).field_a + ":" + ((mn) this).field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((mn) this).field_a + ":" + ((mn) this).field_c + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        L1: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var8 = var7.readLine();
          if (var8 != null) {
            L2: {
              if (var8.startsWith("HTTP/1.0 200")) {
                break L2;
              } else {
                if (var8.startsWith("HTTP/1.1 200")) {
                  break L2;
                } else {
                  L3: {
                    if (var8.startsWith("HTTP/1.0 407")) {
                      break L3;
                    } else {
                      if (!var8.startsWith("HTTP/1.1 407")) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = 0;
                  var10 = "proxy-authenticate: ";
                  var8 = var10;
                  var8 = var10;
                  var8 = var7.readLine();
                  L4: while (true) {
                    L5: {
                      if (var8 == null) {
                        break L5;
                      } else {
                        if (-51 >= (var9 ^ -1)) {
                          break L5;
                        } else {
                          if (!var8.toLowerCase().startsWith(var10)) {
                            var9++;
                            var8 = var7.readLine();
                            continue L4;
                          } else {
                            L6: {
                              var14 = var8.substring(var10.length()).trim();
                              var8 = var14;
                              var8 = var14;
                              var11 = var14.indexOf(' ');
                              if (0 == (var11 ^ -1)) {
                                break L6;
                              } else {
                                var8 = var14.substring(0, var11);
                                break L6;
                              }
                            }
                            throw new oa(var8);
                          }
                        }
                      }
                    }
                    throw new oa("");
                  }
                }
              }
            }
            return var13;
          } else {
            break L1;
          }
        }
        L7: {
          if (param3 == 25748) {
            break L7;
          } else {
            field_i = null;
            break L7;
          }
        }
        var6.close();
        var7.close();
        var13.close();
        return null;
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_i = null;
        field_h = null;
        if (param0 != 32768) {
            Object var2 = null;
            String discarded$0 = mn.a((byte) -7, (ld) null);
        }
    }

    final static ve a(int param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = Chess.field_G;
        if (null != bf.field_M) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var6 = (CharSequence) (Object) param1;
              var2 = ad.a(var6, param0 + param0);
              if (var2 != null) {
                var3 = (ve) (Object) bf.field_M.a((long)var2.hashCode(), param0 ^ -3001);
                L0: while (true) {
                  if (var3 != null) {
                    var7 = (CharSequence) (Object) var3.field_Fb;
                    var4 = ad.a(var7, -2);
                    if (var4.equals((Object) (Object) var2)) {
                      return var3;
                    } else {
                      var3 = (ve) (Object) bf.field_M.b(true);
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
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
                    if (param1.type() != java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return ((mn) this).a(true);
                }
                case 2: {
                    if (param0 == 96) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    field_h = null;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = param1.address();
                    if (var3 instanceof java.net.InetSocketAddress) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return null;
                }
                case 6: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param1.type() == java.net.Proxy.Type.HTTP) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param1.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return null;
                }
                case 9: {
                    var5 = new java.net.Socket(param1);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((mn) this).field_a, ((mn) this).field_c));
                    return var5;
                }
                case 10: {
                    var5 = null;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 != null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    return this.a((String) (Object) var5, var4_ref.getHostName(), var4_ref.getPort(), param0 + 25652);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    mn() {
        ((mn) this).field_k = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Show game chat from my friends";
        field_h = new p(256);
        field_i = "Month";
        field_j = "Real-life threats";
    }
}

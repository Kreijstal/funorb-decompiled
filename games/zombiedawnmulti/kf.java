/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.URL;
import java.net.Socket;
import java.net.ProxySelector;
import java.net.URI;

final class kf extends dl {
    static java.security.SecureRandom field_j;
    static cj field_i;
    private java.net.ProxySelector field_l;
    static String field_k;

    final static java.net.URL a(String param0, int param1, byte param2, String param3, java.net.URL param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_35_0 = null;
            java.net.URL stackIn_37_0 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            String stackIn_44_2 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_34_0 = null;
            java.net.URL stackOut_36_0 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            String stackOut_42_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            var9 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              var5_ref = param4.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      break L3;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 > var7_int) {
                        break L4;
                      } else {
                        if (param3 != null) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        } else {
                          var6 = var7_int;
                          continue L0;
                        }
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (param0 == null) {
                        break L1;
                      } else {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                    if (param3 == null) {
                      break L7;
                    } else {
                      if (param3.length() > 0) {
                        StringBuilder discarded$8 = var7.append("/p=");
                        StringBuilder discarded$9 = var7.append(param3);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param0 == null) {
                      break L8;
                    } else {
                      if (0 < param0.length()) {
                        StringBuilder discarded$10 = var7.append("/s=");
                        StringBuilder discarded$11 = var7.append(param0);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var5_ref.length() > var6) {
                      StringBuilder discarded$12 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L9;
                    } else {
                      StringBuilder discarded$13 = var7.append(47);
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_34_0 = new java.net.URL(param4, var7.toString());
                      stackIn_35_0 = stackOut_34_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_36_0 = (java.net.URL) param4;
                    stackIn_37_0 = stackOut_36_0;
                    return stackIn_37_0;
                  }
                  return stackIn_35_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_38_0 = (RuntimeException) var5;
                stackOut_38_1 = new StringBuilder().append("kf.A(");
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param0 == null) {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L11;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L11;
                }
              }
              L12: {
                stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(44).append(-1).append(44).append(126).append(44);
                stackIn_43_0 = stackOut_41_0;
                stackIn_43_1 = stackOut_41_1;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                if (param3 == null) {
                  stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                  stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                  stackOut_43_2 = "null";
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  break L12;
                } else {
                  stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = "{...}";
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  stackIn_44_2 = stackOut_42_2;
                  break L12;
                }
              }
              L13: {
                stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(44);
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param4 == null) {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L13;
                } else {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L13;
                }
              }
              throw fa.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param3 + 485 + (8 - -param2) + 10;
              qe.field_q.a(-6 + dq.field_k.field_z, 3, var6_int - 6, 3, -3344);
              var7 = qe.field_q.field_z - 5;
              ek.field_z.a(param5, var7 - param5, param2 + 487 + param3, 5, param0 ^ -3342);
              ec.field_b.a(param5, 0, -ua.field_E.field_zb + (ek.field_z.field_zb - param2), param2, -3344);
              ua.field_E.a(param5, 0, ua.field_E.field_zb, param2 + ec.field_b.field_zb, param0 + -3346);
              var7 = var7 - (2 + param5);
              tn.field_A.a(param3, 2, param3 + (param0 + param2) + 485, 5, var7 - 5, param0 ^ -31467, 5);
              if (ra.field_f == null) {
                break L1;
              } else {
                ra.field_f.b(tn.field_A.field_x, tn.field_A.field_Q, 28972, tn.field_A.field_zb, tn.field_A.field_z);
                break L1;
              }
            }
            var8 = -var6_int + -param2 + dq.field_k.field_zb;
            var9 = var8 / 2;
            var10 = param2 + param1 + var9;
            var11 = 0;
            var12 = 0;
            L2: while (true) {
              if (var12 >= 6) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if (5 <= var12) {
                      break L4;
                    } else {
                      if (la.field_h[var12] != null) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var13 = (2 + (-6 + dq.field_k.field_z)) * var11 / (1 + gi.field_l) + 3;
                  var11++;
                  var7 = var11 * (dq.field_k.field_z + -4) / (1 + gi.field_l) + (1 + -var13);
                  if (5 > var12) {
                    la.field_h[var12].a(var7, var13, var8, var6_int, param0 ^ -3342);
                    ij.field_k[var12].a(var7, 0, var9 - param2, param2, param0 ^ -3342);
                    pf.field_d[var12].a(-param4 + var7 - param4, param4, param1, var9, -3344);
                    hh.field_l[var12].a(-param4 + var7 - param4, param4, var8 - (param2 - -var10), var10, -3344);
                    break L3;
                  } else {
                    nn.field_b.a(var7, var13, var8, var6_int, -3344);
                    break L3;
                  }
                }
                var12++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var6, "kf.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_k = null;
        field_j = null;
    }

    private final java.net.Socket a(java.net.Proxy param0) throws IOException {
        RuntimeException var3 = null;
        java.net.SocketAddress var3_ref = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        Object var5 = null;
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
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        java.net.Socket stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        java.net.Socket stackOut_20_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_4_0 = null;
        java.net.Socket stackOut_1_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3_ref = param0.address();
              if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                if (param0.type() == java.net.Proxy.Type.HTTP) {
                  var5 = null;
                  try {
                    L1: {
                      L2: {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 != null) {
                          var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                          var9.setAccessible(true);
                          if (!((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            break L2;
                          } else {
                            var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                            var11.setAccessible(true);
                            var12 = (String) var10.invoke(var8, new Object[0]);
                            var13 = (String) var11.invoke(var8, new Object[2]);
                            var5 = (Object) (Object) (var12 + ": " + var13);
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      }
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  stackOut_20_0 = this.a((byte) -96, var4_ref.getHostName(), var4_ref.getPort(), (String) var5);
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = (Object) (Object) new java.net.Socket(param0);
                    ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((kf) this).field_b, ((kf) this).field_f));
                    stackOut_11_0 = var5;
                    stackIn_12_0 = stackOut_11_0;
                    return (java.net.Socket) (Object) stackIn_12_0;
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (java.net.Socket) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ((kf) this).b((byte) 100);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("kf.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 1 + 41);
        }
        return stackIn_21_0;
    }

    private final java.net.Socket a(byte param0, String param1, int param2, String param3) throws IOException {
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
        java.net.Socket stackIn_11_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_10_0 = null;
        Object stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param1, param2);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param3 == null) {
                var6.write(("CONNECT " + ((kf) this).field_b + ":" + ((kf) this).field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + ((kf) this).field_b + ":" + ((kf) this).field_f + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var8 = var7.readLine();
              if (var8 == null) {
                break L2;
              } else {
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
                                  var11 = var14.indexOf(' ');
                                  if (var11 != -1) {
                                    var8 = var14.substring(0, var11);
                                    break L7;
                                  } else {
                                    var8 = var14;
                                    break L7;
                                  }
                                }
                                throw new en(var8);
                              } else {
                                var8 = var7.readLine();
                                var9++;
                                continue L5;
                              }
                            }
                          }
                        }
                        throw new en("");
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_10_0 = (java.net.Socket) var13;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            stackOut_26_0 = null;
            stackIn_27_0 = stackOut_26_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("kf.D(").append(-96).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44).append(param2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
        return (java.net.Socket) (Object) stackIn_27_0;
    }

    kf() {
        ((kf) this).field_l = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket b(int param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        en var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_7_0 = 0;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        String stackIn_11_4 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        java.net.ProxySelector stackIn_14_0 = null;
        java.net.URI stackIn_14_1 = null;
        java.net.URI stackIn_14_2 = null;
        StringBuilder stackIn_14_3 = null;
        String stackIn_14_4 = null;
        java.net.Socket stackIn_23_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        String stackOut_9_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        java.net.ProxySelector stackOut_13_0 = null;
        java.net.URI stackOut_13_1 = null;
        java.net.URI stackOut_13_2 = null;
        StringBuilder stackOut_13_3 = null;
        String stackOut_13_4 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.Socket stackOut_22_0 = null;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 4646) {
            break L0;
          } else {
            kf.a(-21, 110, 106, 109, 24, -20);
            break L0;
          }
        }
        L1: {
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L1;
          } else {
            String discarded$3 = System.setProperty("java.net.useSystemProxies", "true");
            break L1;
          }
        }
        L2: {
          if (((kf) this).field_f != 443) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L2;
          } else {
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L2;
          }
        }
        var5 = stackIn_7_0;
        try {
          L3: {
            L4: {
              stackOut_8_0 = ((kf) this).field_l;
              stackOut_8_1 = null;
              stackOut_8_2 = null;
              stackOut_8_3 = new StringBuilder();
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              stackIn_10_3 = stackOut_8_3;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              stackIn_9_3 = stackOut_8_3;
              if (var5 == 0) {
                stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                stackOut_10_1 = null;
                stackOut_10_2 = null;
                stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                stackOut_10_4 = "http";
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = stackOut_10_3;
                stackIn_11_4 = stackOut_10_4;
                break L4;
              } else {
                stackOut_9_0 = (java.net.ProxySelector) (Object) stackIn_9_0;
                stackOut_9_1 = null;
                stackOut_9_2 = null;
                stackOut_9_3 = (StringBuilder) (Object) stackIn_9_3;
                stackOut_9_4 = "https";
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                stackIn_11_3 = stackOut_9_3;
                stackIn_11_4 = stackOut_9_4;
                break L4;
              }
            }
            L5: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(stackIn_11_4 + "://" + ((kf) this).field_b));
              stackOut_11_0 = ((kf) this).field_l;
              stackOut_11_1 = null;
              stackOut_11_2 = null;
              stackOut_11_3 = new StringBuilder();
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              stackIn_13_3 = stackOut_11_3;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              stackIn_12_3 = stackOut_11_3;
              if (var5 != 0) {
                stackOut_13_0 = (java.net.ProxySelector) (Object) stackIn_13_0;
                stackOut_13_1 = null;
                stackOut_13_2 = null;
                stackOut_13_3 = (StringBuilder) (Object) stackIn_13_3;
                stackOut_13_4 = "http";
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                stackIn_14_3 = stackOut_13_3;
                stackIn_14_4 = stackOut_13_4;
                break L5;
              } else {
                stackOut_12_0 = (java.net.ProxySelector) (Object) stackIn_12_0;
                stackOut_12_1 = null;
                stackOut_12_2 = null;
                stackOut_12_3 = (StringBuilder) (Object) stackIn_12_3;
                stackOut_12_4 = "https";
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                stackIn_14_4 = stackOut_12_4;
                break L5;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + ((kf) this).field_b));
            break L3;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((kf) this).b((byte) 97);
        }
        boolean discarded$4 = var3.addAll((Collection) (Object) var4);
        var6_array = var3.toArray();
        var7 = null;
        var8_array = var6_array;
        var9 = 0;
        L6: while (true) {
          if (var9 >= var8_array.length) {
            if (var7 != null) {
              throw kf.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return ((kf) this).b((byte) 89);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                int discarded$5 = 1;
                var12_ref2 = this.a(var11);
                if (var12_ref2 != null) {
                  stackOut_22_0 = (java.net.Socket) var12_ref2;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 1;
                  break L7;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L9: {
                var12_ref = (IOException) (Object) decompiledCaughtException;
                var9++;
                decompiledRegionSelector0 = 0;
                break L9;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var12 = (en) (Object) decompiledCaughtException;
                var7 = (Object) (Object) var12;
                var9++;
                decompiledRegionSelector0 = 0;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue L6;
            } else {
              return stackIn_23_0;
            }
          }
        }
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

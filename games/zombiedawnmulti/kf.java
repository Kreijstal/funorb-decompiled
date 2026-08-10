/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class kf extends dl {
    static java.security.SecureRandom field_j;
    static cj field_i;
    private java.net.ProxySelector field_l;
    static String field_k;

    final static java.net.URL a(String param0, int param1, byte param2, String param3, java.net.URL param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            StringBuilder stackIn_50_1 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            StringBuilder stackIn_53_1 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                var5 = param4.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (var7_int >= 0) {
                          if (-1 < (param1 ^ -1)) {
                            break L2;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                        break L4;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (var7_int >= 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (0 > var7_int) {
                          break L5;
                        } else {
                          if (param3 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        if (param0 == null) {
                          break L2;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (-1 > (param1 ^ -1)) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param1));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param3 == null) {
                        break L9;
                      } else {
                        if (param3.length() > 0) {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param3);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param0 == null) {
                        break L10;
                      } else {
                        if (0 < param0.length()) {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param0);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var5.length() > var6) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                        break L11;
                      } else {
                        discarded$8 = var7.append('/');
                        break L11;
                      }
                    }
                    L12: {
                      if (param2 > 107) {
                        break L12;
                      } else {
                        field_k = (String) null;
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackIn_42_0 = new java.net.URL(param4, var7.toString());
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_44_0 = (java.net.URL) (param4);
                      return stackIn_44_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L14: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_47_0 = (RuntimeException) (var5_ref);

                stackIn_47_1 = new StringBuilder().append("kf.A(");

                if (param0 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "null";
                  break L14;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "null";
                  break L15;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "{...}";
                  break L15;
                }
              }
              L16: {


                stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');

                if (param4 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "null";
                  break L16;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "{...}";
                  break L16;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_48_0), stackIn_54_2 + ')');
            }
            return stackIn_42_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        RuntimeException var6 = null;
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
              if ((var12 ^ -1) <= -7) {
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
          throw fa.a((Throwable) ((Object) var6), "kf.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != 3) {
            return;
        }
        field_j = null;
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        Object var5 = null;
        Class var6 = null;
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
        java.net.Socket stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        java.net.Socket stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var6_ref = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param1 == 1) {
                  if (param0.type() == java.net.Proxy.Type.HTTP) {
                    var5 = null;
                    try {
                      L1: {
                        L2: {
                          var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                          var6 = var14;
                          var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                          var7.setAccessible(true);
                          var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                          if (var8 != null) {
                            var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                            var9.setAccessible(true);
                            if (!((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                              break L2;
                            } else {
                              var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                              var10.setAccessible(true);
                              var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                              var11.setAccessible(true);
                              var12 = (String) (var10.invoke(var8, new Object[]{}));
                              var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_b + "/"), "https"}));
                              var5 = var12 + ": " + var13;
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
                        var6_ref = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    stackIn_22_0 = this.a((byte) -96, var4.getHostName(), var4.getPort(), (String) (var5));
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                      var5 = new java.net.Socket(param0);
                      ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_f)));
                      stackIn_13_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackIn_8_0 = (java.net.Socket) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.b((byte) 100);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3_ref);

            stackIn_25_1 = new StringBuilder().append("kf.B(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.net.Socket) ((Object) stackIn_13_0);
              } else {
                return stackIn_22_0;
              }
            }
          }
        }
    }

    private final java.net.Socket a(byte param0, String param1, int param2, String param3) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        java.net.Socket stackIn_12_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
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
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 <= -25) {
              L1: {
                var13 = new java.net.Socket(param1, param2);
                var13.setSoTimeout(10000);
                var6 = var13.getOutputStream();
                if (param3 == null) {
                  var6.write(("CONNECT " + this.field_b + ":" + this.field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  break L1;
                } else {
                  var6.write(("CONNECT " + this.field_b + ":" + this.field_f + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  break L1;
                }
              }
              L2: {
                var6.flush();
                var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
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
                                    if (0 != (var11 ^ -1)) {
                                      var8 = var14.substring(0, var11);
                                      break L7;
                                    } else {
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
                  stackIn_12_0 = (java.net.Socket) (var13);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              var6.close();
              var7.close();
              var13.close();
              stackIn_28_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_3_0 = (java.net.Socket) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("kf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_28_0);
          }
        }
    }

    kf() {
        this.field_l = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket b(int param0) throws IOException {
        int stackIn_7_0 = 0;
        java.net.ProxySelector stackIn_10_0;
        java.net.URI stackIn_10_1;
        java.net.URI stackIn_10_2;
        StringBuilder stackIn_10_3;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        String stackIn_11_4 = null;
        java.net.ProxySelector stackIn_13_0;
        java.net.URI stackIn_13_1;
        java.net.URI stackIn_13_2;
        StringBuilder stackIn_13_3;
        java.net.ProxySelector stackIn_14_0;
        java.net.URI stackIn_14_1;
        java.net.URI stackIn_14_2;
        StringBuilder stackIn_14_3;
        String stackIn_14_4;
        java.net.Socket stackIn_23_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        en var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
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
            System.setProperty("java.net.useSystemProxies", "true");
            break L1;
          }
        }
        L2: {
          if (-444 != (this.field_f ^ -1)) {
            stackIn_7_0 = 0;
            break L2;
          } else {
            stackIn_7_0 = 1;
            break L2;
          }
        }
        var5 = stackIn_7_0;
        try {
          L3: {
            L4: {
              stackIn_10_0 = this.field_l;

              stackIn_10_1 = null;

              stackIn_10_2 = null;

              stackIn_10_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_11_0 = (java.net.ProxySelector) ((Object) stackIn_10_0);
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_3 = (StringBuilder) ((Object) stackIn_10_3);
                stackIn_11_4 = "http";
                break L4;
              } else {
                stackIn_11_0 = (java.net.ProxySelector) ((Object) stackIn_10_0);
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_3 = (StringBuilder) ((Object) stackIn_10_3);
                stackIn_11_4 = "https";
                break L4;
              }
            }
            L5: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(stackIn_11_4 + "://" + this.field_b));
              stackIn_13_0 = this.field_l;

              stackIn_13_1 = null;

              stackIn_13_2 = null;

              stackIn_13_3 = new StringBuilder();

              if (var5 != 0) {
                stackIn_14_0 = (java.net.ProxySelector) ((Object) stackIn_13_0);
                stackIn_14_1 = null;
                stackIn_14_2 = null;
                stackIn_14_3 = (StringBuilder) ((Object) stackIn_13_3);
                stackIn_14_4 = "http";
                break L5;
              } else {
                stackIn_14_0 = (java.net.ProxySelector) ((Object) stackIn_13_0);
                stackIn_14_1 = null;
                stackIn_14_2 = null;
                stackIn_14_3 = (StringBuilder) ((Object) stackIn_13_3);
                stackIn_14_4 = "https";
                break L5;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + this.field_b));
            break L3;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b((byte) 97);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        var9 = 0;
        L6: while (true) {
          if (var9 >= var8.length) {
            if (var7 != null) {
              throw kf.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return this.b((byte) 89);
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              L7: {
                var12 = this.a(var11, 1);
                if (var12 != null) {
                  stackIn_23_0 = (java.net.Socket) (var12);
                  decompiledRegionSelector0 = 1;
                  break L7;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              }
            } catch (en decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var12_ref = (en) (Object) decompiledCaughtException;
                var7 = var12_ref;
                var9++;
                decompiledRegionSelector0 = 0;
                break L8;
              }
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L9: {
                var12_ref2 = (IOException) (Object) decompiledCaughtException;
                var9++;
                decompiledRegionSelector0 = 0;
                break L9;
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

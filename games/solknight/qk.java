/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class qk extends ug {
    static char[] field_k;
    static String field_j;
    static int field_m;
    static da field_h;
    static String field_o;
    static String field_n;
    private java.net.ProxySelector field_i;
    static o[] field_l;

    final java.net.Socket a(byte param0) throws IOException {
        int stackIn_6_0 = 0;
        java.net.ProxySelector stackIn_9_0;
        java.net.URI stackIn_9_1;
        java.net.URI stackIn_9_2;
        StringBuilder stackIn_9_3;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        String stackIn_10_4 = null;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        java.net.ProxySelector stackIn_13_0;
        java.net.URI stackIn_13_1;
        java.net.URI stackIn_13_2;
        StringBuilder stackIn_13_3;
        String stackIn_13_4;
        java.net.Socket stackIn_24_0 = null;
        java.net.Socket stackIn_32_0 = null;
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
        cb var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = SolKnight.field_L ? 1 : 0;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_b != 443) {
            stackIn_6_0 = 0;
            break L1;
          } else {
            stackIn_6_0 = 1;
            break L1;
          }
        }
        var5 = stackIn_6_0;
        try {
          L2: {
            L3: {
              stackIn_9_0 = this.field_i;

              stackIn_9_1 = null;

              stackIn_9_2 = null;

              stackIn_9_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_10_0 = (java.net.ProxySelector) ((Object) stackIn_9_0);
                stackIn_10_1 = null;
                stackIn_10_2 = null;
                stackIn_10_3 = (StringBuilder) ((Object) stackIn_9_3);
                stackIn_10_4 = "http";
                break L3;
              } else {
                stackIn_10_0 = (java.net.ProxySelector) ((Object) stackIn_9_0);
                stackIn_10_1 = null;
                stackIn_10_2 = null;
                stackIn_10_3 = (StringBuilder) ((Object) stackIn_9_3);
                stackIn_10_4 = "https";
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + this.field_c));
              stackIn_12_0 = this.field_i;

              stackIn_12_1 = null;

              stackIn_12_2 = null;

              stackIn_12_3 = new StringBuilder();

              if (var5 != 0) {
                stackIn_13_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_3 = (StringBuilder) ((Object) stackIn_12_3);
                stackIn_13_4 = "http";
                break L4;
              } else {
                stackIn_13_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_3 = (StringBuilder) ((Object) stackIn_12_3);
                stackIn_13_4 = "https";
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + this.field_c));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(-57);
        }
        L5: {
          var3.addAll((Collection) ((Object) var4));
          var6_array = var3.toArray();
          var7 = null;
          if (param0 == -93) {
            break L5;
          } else {
            this.field_i = (java.net.ProxySelector) null;
            break L5;
          }
        }
        var8 = var6_array;
        var9 = 0;
        L6: while (true) {
          L7: {
            if (var8.length <= var9) {
              break L7;
            } else {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                L8: {
                  var12 = this.a(var11, 80);
                  stackIn_32_0 = (java.net.Socket) (var12);

                  if (var13 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L8;
                  } else {
                    if (stackIn_32_0 == null) {
                      decompiledRegionSelector0 = 1;
                      break L8;
                    } else {
                      stackIn_24_0 = (java.net.Socket) (var12);
                      decompiledRegionSelector0 = 2;
                      break L8;
                    }
                  }
                }
              } catch (cb decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L9: {
                  var12_ref = (cb) (Object) decompiledCaughtException;
                  var7 = var12_ref;
                  decompiledRegionSelector0 = 1;
                  break L9;
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                L10: {
                  var12_ref2 = (IOException) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 1;
                  break L10;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_32_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  var9++;
                  if (var13 == 0) {
                    continue L6;
                  } else {
                    break L7;
                  }
                } else {
                  return stackIn_24_0;
                }
              }
            }
          }
          if (var7 != null) {
            throw qk.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
          } else {
            return this.a(param0 ^ -48);
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        sb.field_d = param0;
        int var3 = 89 / ((-62 - param2) / 40);
        vk.field_m = param1;
    }

    final static void e(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        hk.a();
                        pj.field_H = 11;
                        ud.field_i = new int[260];
                        var1_int = param0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-257 >= (var1_int ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = 15.0;
                        ud.field_i[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                        var1_int++;
                        if (var4 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var1_int = 256;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var1_int >= ud.field_i.length) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ud.field_i[var1_int] = 255;
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 7;
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
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var1), "qk.E(" + param0 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void d(int param0) {
        if (param0 == 14995) {
          if (dj.field_k == null) {
            return;
          } else {
            nc.a((byte) 86, dj.field_k);
            dj.field_k.a(-3680, wh.field_c);
            dj.field_k = null;
            if (fc.field_l != null) {
              fc.field_l.a(false);
              dc.field_q.requestFocus();
              return;
            } else {
              dc.field_q.requestFocus();
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_22_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param0.length();
              if ((var3_int ^ -1) > param2) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((var3_int ^ -1) >= -13) {
                  L1: {
                    var4 = jg.a(param0, -2);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (-2 >= (var4.length() ^ -1)) {
                        L2: {
                          if (ck.a(var4.charAt(0), true)) {
                            break L2;
                          } else {
                            if (ck.a(var4.charAt(var4.length() - 1), true)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                L4: {
                                  L5: {
                                    if (var6 >= param0.length()) {
                                      break L5;
                                    } else {
                                      var7 = param0.charAt(var6);
                                      stackOut_22_0 = ck.a((char) var7, true);
                                      stackIn_33_0 = stackOut_22_0 ? 1 : 0;
                                      stackIn_23_0 = stackOut_22_0;
                                      if (var8 != 0) {
                                        break L4;
                                      } else {
                                        L6: {
                                          L7: {
                                            if (!stackIn_23_0) {
                                              break L7;
                                            } else {
                                              var5++;
                                              if (var8 == 0) {
                                                break L6;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          var5 = 0;
                                          break L6;
                                        }
                                        L8: {
                                          if ((var5 ^ -1) > -3) {
                                            break L8;
                                          } else {
                                            if (param1) {
                                              break L8;
                                            } else {
                                              stackIn_30_0 = 0;
                                              decompiledRegionSelector0 = 4;
                                              break L0;
                                            }
                                          }
                                        }
                                        var6++;
                                        if (var8 == 0) {
                                          continue L3;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                  stackIn_33_0 = var5 ^ -1;
                                  break L4;
                                }
                                if (stackIn_33_0 < -1) {
                                  stackIn_36_0 = 0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("qk.G(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L9;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L9;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  return stackIn_36_0 != 0;
                }
              }
            }
          }
        }
    }

    private final java.net.Socket a(int param0, String param1, String param2, int param3) throws IOException {
        java.net.Socket stackIn_7_0 = null;
        java.net.Socket stackIn_14_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
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
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var13 = new java.net.Socket(param2, param3);
                var13.setSoTimeout(10000);
                var6 = var13.getOutputStream();
                if (param1 != null) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + this.field_c + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + this.field_c + ":" + this.field_b + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            var6.flush();
            var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
            if (param0 >= 72) {
              L3: {
                var8 = var7.readLine();
                if (var8 != null) {
                  L4: {
                    if (var8.startsWith("HTTP/1.0 200")) {
                      break L4;
                    } else {
                      if (var8.startsWith("HTTP/1.1 200")) {
                        break L4;
                      } else {
                        L5: {
                          if (var8.startsWith("HTTP/1.0 407")) {
                            break L5;
                          } else {
                            if (!var8.startsWith("HTTP/1.1 407")) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var9 = 0;
                        var8 = var7.readLine();
                        var10 = "proxy-authenticate: ";
                        var8 = var10;
                        var8 = var10;
                        L6: while (true) {
                          L7: {
                            if (var8 == null) {
                              break L7;
                            } else {
                              if (var9 >= 50) {
                                break L7;
                              } else {
                                if (var8.toLowerCase().startsWith(var10)) {
                                  L8: {
                                    var14 = var8.substring(var10.length()).trim();
                                    var8 = var14;
                                    var8 = var14;
                                    var8 = var14;
                                    var11 = var14.indexOf(' ');
                                    if (0 == (var11 ^ -1)) {
                                      break L8;
                                    } else {
                                      var8 = var14.substring(0, var11);
                                      break L8;
                                    }
                                  }
                                  throw new cb(var8);
                                } else {
                                  var8 = var7.readLine();
                                  var9++;
                                  if (var12 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          throw new cb("");
                        }
                      }
                    }
                  }
                  stackIn_14_0 = (java.net.Socket) (var13);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L3;
                }
              }
              var6.close();
              var7.close();
              var13.close();
              stackIn_29_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_7_0 = (java.net.Socket) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("qk.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_29_0);
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void c(int param0) {
        field_o = null;
        field_n = null;
        field_j = null;
        field_h = null;
        if (param0 != -25904) {
          field_j = (String) null;
          field_l = null;
          field_k = null;
          return;
        } else {
          field_l = null;
          field_k = null;
          return;
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        Exception exception = null;
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
        Object stackIn_12_0 = null;
        java.net.Socket stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              L1: {
                var3 = param0.address();
                if (param1 > 73) {
                  break L1;
                } else {
                  qk.a(25, -30, 54);
                  break L1;
                }
              }
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param0.type() == java.net.Proxy.Type.HTTP) {
                  var5 = null;
                  try {
                    L2: {
                      L3: {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6 = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                        if (var8 == null) {
                          break L3;
                        } else {
                          var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var9.setAccessible(true);
                          if (!((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            break L3;
                          } else {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_c + "/"), "https"}));
                            var5 = var12 + ": " + var13;
                            break L3;
                          }
                        }
                      }
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      exception = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  stackIn_20_0 = this.a(89, (String) (var5), var4.getHostName(), var4.getPort());
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param0);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_c, this.field_b)));
                    stackIn_12_0 = var5;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = this.a(-63);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3_ref);

            stackIn_24_1 = new StringBuilder().append("qk.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_12_0);
          } else {
            return stackIn_20_0;
          }
        }
    }

    qk() {
        this.field_i = java.net.ProxySelector.getDefault();
    }

    final static void f(int param0) {
        ql.d(18962);
        h.a(param0, true);
    }

    static {
        field_k = new char[]{(char)91, (char)93, (char)35};
        field_j = "Cancel";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

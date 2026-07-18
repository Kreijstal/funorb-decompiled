/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class r extends db {
    static String[] field_j;
    static String field_q;
    static ki field_r;
    static String field_m;
    static String field_i;
    private java.net.ProxySelector field_n;
    static String field_p;
    static String field_o;
    static String field_k;
    static long field_l;

    final static void a(int param0, ud param1, int param2) {
        kj var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 27153) {
                break L1;
              } else {
                r.a(true, false);
                break L1;
              }
            }
            var3 = mm.field_g;
            var3.a(param2, (byte) -117);
            var3.a((byte) 126, param1.field_t);
            var3.a((byte) 111, param1.field_u);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("r.K(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        RuntimeException var2 = null;
        int var2_int = 0;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        int var7 = 0;
        Object var8 = null;
        Object[] var9 = null;
        Object[] var9_array = null;
        int var10 = 0;
        Object var11 = null;
        java.net.Proxy var12 = null;
        vg var13 = null;
        IOException var13_ref = null;
        java.net.Socket var13_ref2 = null;
        int var14 = 0;
        int stackIn_9_0 = 0;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        java.net.ProxySelector stackIn_14_0 = null;
        java.net.URI stackIn_14_1 = null;
        java.net.URI stackIn_14_2 = null;
        StringBuilder stackIn_14_3 = null;
        String stackIn_14_4 = null;
        java.net.ProxySelector stackIn_15_0 = null;
        java.net.URI stackIn_15_1 = null;
        java.net.URI stackIn_15_2 = null;
        StringBuilder stackIn_15_3 = null;
        java.net.ProxySelector stackIn_17_0 = null;
        java.net.URI stackIn_17_1 = null;
        java.net.URI stackIn_17_2 = null;
        StringBuilder stackIn_17_3 = null;
        java.net.ProxySelector stackIn_18_0 = null;
        java.net.URI stackIn_18_1 = null;
        java.net.URI stackIn_18_2 = null;
        StringBuilder stackIn_18_3 = null;
        String stackIn_18_4 = null;
        java.net.Socket stackIn_21_0 = null;
        java.net.Socket stackIn_26_0 = null;
        java.net.Socket stackIn_31_0 = null;
        java.net.Socket stackIn_41_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        java.net.ProxySelector stackOut_13_0 = null;
        java.net.URI stackOut_13_1 = null;
        java.net.URI stackOut_13_2 = null;
        StringBuilder stackOut_13_3 = null;
        String stackOut_13_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        String stackOut_11_4 = null;
        java.net.ProxySelector stackOut_14_0 = null;
        java.net.URI stackOut_14_1 = null;
        java.net.URI stackOut_14_2 = null;
        StringBuilder stackOut_14_3 = null;
        java.net.ProxySelector stackOut_17_0 = null;
        java.net.URI stackOut_17_1 = null;
        java.net.URI stackOut_17_2 = null;
        StringBuilder stackOut_17_3 = null;
        String stackOut_17_4 = null;
        java.net.ProxySelector stackOut_15_0 = null;
        java.net.URI stackOut_15_1 = null;
        java.net.URI stackOut_15_2 = null;
        StringBuilder stackOut_15_3 = null;
        String stackOut_15_4 = null;
        java.net.Socket stackOut_20_0 = null;
        java.net.Socket stackOut_25_0 = null;
        java.net.Socket stackOut_30_0 = null;
        java.net.Socket stackOut_40_0 = null;
        var14 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_int = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
              if (var2_int == 0) {
                String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((r) this).field_c != 443) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_9_0 = stackOut_6_0;
                break L2;
              }
            }
            var5 = stackIn_9_0;
            try {
              L3: {
                L4: {
                  stackOut_10_0 = ((r) this).field_n;
                  stackOut_10_1 = null;
                  stackOut_10_2 = null;
                  stackOut_10_3 = new StringBuilder();
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_13_1 = stackOut_10_1;
                  stackIn_13_2 = stackOut_10_2;
                  stackIn_13_3 = stackOut_10_3;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  if (var5 != 0) {
                    stackOut_13_0 = (java.net.ProxySelector) (Object) stackIn_13_0;
                    stackOut_13_1 = null;
                    stackOut_13_2 = null;
                    stackOut_13_3 = (StringBuilder) (Object) stackIn_13_3;
                    stackOut_13_4 = "https";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    stackIn_14_4 = stackOut_13_4;
                    break L4;
                  } else {
                    stackOut_11_0 = (java.net.ProxySelector) (Object) stackIn_11_0;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = (StringBuilder) (Object) stackIn_11_3;
                    stackOut_11_4 = "http";
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_14_1 = stackOut_11_1;
                    stackIn_14_2 = stackOut_11_2;
                    stackIn_14_3 = stackOut_11_3;
                    stackIn_14_4 = stackOut_11_4;
                    break L4;
                  }
                }
                L5: {
                  var3 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + ((r) this).field_e));
                  stackOut_14_0 = ((r) this).field_n;
                  stackOut_14_1 = null;
                  stackOut_14_2 = null;
                  stackOut_14_3 = new StringBuilder();
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  stackIn_17_3 = stackOut_14_3;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  if (var5 != 0) {
                    stackOut_17_0 = (java.net.ProxySelector) (Object) stackIn_17_0;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = (StringBuilder) (Object) stackIn_17_3;
                    stackOut_17_4 = "http";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    stackIn_18_4 = stackOut_17_4;
                    break L5;
                  } else {
                    stackOut_15_0 = (java.net.ProxySelector) (Object) stackIn_15_0;
                    stackOut_15_1 = null;
                    stackOut_15_2 = null;
                    stackOut_15_3 = (StringBuilder) (Object) stackIn_15_3;
                    stackOut_15_4 = "https";
                    stackIn_18_0 = stackOut_15_0;
                    stackIn_18_1 = stackOut_15_1;
                    stackIn_18_2 = stackOut_15_2;
                    stackIn_18_3 = stackOut_15_3;
                    stackIn_18_4 = stackOut_15_4;
                    break L5;
                  }
                }
                var4 = ((java.net.ProxySelector) (Object) stackIn_18_0).select(new java.net.URI(stackIn_18_4 + "://" + ((r) this).field_e));
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
              stackOut_20_0 = ((r) this).a((byte) 82);
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0;
            }
            boolean discarded$3 = var3.addAll((Collection) (Object) var4);
            var7 = -4 % ((-25 - param0) / 46);
            var6_array = var3.toArray();
            var8 = null;
            var9_array = var6_array;
            var10 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (~var9_array.length >= ~var10) {
                    break L8;
                  } else {
                    var11 = var9_array[var10];
                    var12 = (java.net.Proxy) var11;
                    try {
                      L9: {
                        var13_ref2 = this.a(25382, var12);
                        stackOut_25_0 = (java.net.Socket) var13_ref2;
                        stackIn_41_0 = stackOut_25_0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var14 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L9;
                        } else {
                          if (stackIn_26_0 != null) {
                            stackOut_30_0 = (java.net.Socket) var13_ref2;
                            stackIn_31_0 = stackOut_30_0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          } else {
                            decompiledRegionSelector0 = 2;
                            break L9;
                          }
                        }
                      }
                    } catch (java.io.IOException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L11: {
                        var13_ref = (IOException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 2;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var13 = (vg) (Object) decompiledCaughtException;
                        var8 = (Object) (Object) var13;
                        decompiledRegionSelector0 = 2;
                        break L10;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      break L7;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        return stackIn_31_0;
                      } else {
                        var10++;
                        if (var14 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                if (null != var8) {
                  throw r.<RuntimeException>$cfr$sneakyThrow((Throwable) var8);
                } else {
                  stackOut_40_0 = ((r) this).a((byte) 59);
                  stackIn_41_0 = stackOut_40_0;
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "r.F(" + param0 + ')');
        }
        return stackIn_41_0;
    }

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_q = null;
              field_o = null;
              field_k = null;
              field_m = null;
              field_p = null;
              field_j = null;
              if (param0 == -117) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            field_i = null;
            field_r = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "r.N(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1, cf param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              jb.field_A.a(3, (ck) (Object) param2);
              if (param1 == 123) {
                break L1;
              } else {
                r.b((byte) 48);
                break L1;
              }
            }
            ml.a(1, param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("r.M(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        try {
            int discarded$4 = gh.i(107);
            if (param1 != 104) {
                field_r = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "r.L(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 46) {
              L1: {
                L2: {
                  if (lb.field_ac >= 224) {
                    break L2;
                  } else {
                    var1_int = lb.field_ac % 32;
                    bb.a(-var1_int + lb.field_ac + 32, (byte) 64);
                    if (SteelSentinels.field_G == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                bb.a(256, (byte) 64);
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "r.P(" + param0 + ')');
        }
    }

    private final java.net.Socket a(int param0, String param1, String param2, int param3) throws IOException {
        RuntimeException var5 = null;
        java.net.Socket var5_ref = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_9_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_17_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var5_ref = new java.net.Socket(param2, param0);
                var5_ref.setSoTimeout(10000);
                var6 = var5_ref.getOutputStream();
                if (param1 != null) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + ((r) this).field_e + ":" + ((r) this).field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + ((r) this).field_e + ":" + ((r) this).field_c + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            if (param3 <= -40) {
              L3: {
                var6.flush();
                var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var5_ref.getInputStream()));
                var8 = var7.readLine();
                if (var8 == null) {
                  break L3;
                } else {
                  L4: {
                    if (var8.startsWith("HTTP/1.0 200")) {
                      break L4;
                    } else {
                      if (!var8.startsWith("HTTP/1.1 200")) {
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
                        L6: while (true) {
                          L7: {
                            if (null == var8) {
                              break L7;
                            } else {
                              if (50 <= var9) {
                                break L7;
                              } else {
                                if (var8.toLowerCase().startsWith(var10)) {
                                  L8: {
                                    var8 = var8.substring(var10.length()).trim();
                                    var11 = var8.indexOf(' ');
                                    if (var11 == -1) {
                                      break L8;
                                    } else {
                                      var8 = var8.substring(0, var11);
                                      break L8;
                                    }
                                  }
                                  throw new vg(var8);
                                } else {
                                  var9++;
                                  var8 = var7.readLine();
                                  if (var12 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          throw new vg("");
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_17_0 = (java.net.Socket) var5_ref;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                }
              }
              var6.close();
              var7.close();
              var5_ref.close();
              stackOut_36_0 = null;
              stackIn_37_0 = stackOut_36_0;
              break L0;
            } else {
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (java.net.Socket) (Object) stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var5;
            stackOut_38_1 = new StringBuilder().append("r.I(").append(param0).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L9;
            }
          }
          L10: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param3 + ')');
        }
        return (java.net.Socket) (Object) stackIn_37_0;
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
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
        java.net.Socket stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_21_0 = null;
        java.net.Socket stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        Throwable decompiledCaughtException = null;
        java.net.Socket stackOut_3_0 = null;
        Object stackOut_12_0 = null;
        java.net.Socket stackOut_32_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            if (param1.type() == java.net.Proxy.Type.DIRECT) {
              stackOut_3_0 = ((r) this).a((byte) -112);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 == 25382) {
                var3_ref = param1.address();
                if (!((Object) var3_ref instanceof java.net.InetSocketAddress)) {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  return (java.net.Socket) (Object) stackIn_13_0;
                } else {
                  var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                  if (param1.type() == java.net.Proxy.Type.HTTP) {
                    var5 = null;
                    try {
                      L1: {
                        L2: {
                          var6_ref = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                          var7 = var6_ref.getDeclaredMethod("getProxyAuth", new Class[2]);
                          var7.setAccessible(true);
                          var8 = var7.invoke((Object) null, new Object[2]);
                          if (var8 != null) {
                            var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                            var9.setAccessible(true);
                            if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                              var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                              var10.setAccessible(true);
                              var11 = var6_ref.getDeclaredMethod("getHeaderValue", new Class[2]);
                              var11.setAccessible(true);
                              var12 = (String) var10.invoke(var8, new Object[0]);
                              var13 = (String) var11.invoke(var8, new Object[2]);
                              var5 = (Object) (Object) (var12 + ": " + var13);
                              break L2;
                            } else {
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
                    stackOut_32_0 = this.a(var4_ref.getPort(), (String) var5, var4_ref.getHostName(), param0 ^ -25436);
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  } else {
                    if (param1.type() == java.net.Proxy.Type.SOCKS) {
                      var5 = (Object) (Object) new java.net.Socket(param1);
                      ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((r) this).field_e, ((r) this).field_c));
                      stackOut_20_0 = var5;
                      stackIn_21_0 = stackOut_20_0;
                      return (java.net.Socket) (Object) stackIn_21_0;
                    } else {
                      stackOut_34_0 = null;
                      stackIn_35_0 = stackOut_34_0;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (java.net.Socket) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("r.J(").append(param0).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L4;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
        return (java.net.Socket) (Object) stackIn_35_0;
    }

    r() {
        try {
            ((r) this).field_n = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "r.<init>()");
        }
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (jc.a(2)) {
                param1 = false;
                break L1;
              } else {
                break L1;
              }
            }
            ah.a(param1, -127);
            if (!param0) {
              li.e(0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "r.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(gi param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var3_int = param0.field_p;
            var4 = km.a(-38, (CharSequence) (Object) param1);
            param0.a(var4.length, 32768);
            param0.field_p = param0.field_p + ob.field_r.a(param0.field_p, param0.field_t, param2 ^ 115, var4, param2, var4.length);
            stackOut_0_0 = -var3_int + param0.field_p;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("r.O(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "All games";
        field_i = "EMP";
        field_m = "Create your own free Jagex account";
        field_p = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_o = "Try again";
        field_k = "Private";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

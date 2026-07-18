/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.Socket;
import java.net.ProxySelector;
import java.net.URI;

final class ra extends oa {
    private java.net.ProxySelector field_g;
    static String field_f;

    private final java.net.Socket a(String param0, String param1, boolean param2, int param3) throws IOException {
        RuntimeException var5 = null;
        java.net.Socket var5_ref = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket stackIn_15_0 = null;
        Object stackIn_35_0 = null;
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
        java.net.Socket stackOut_14_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_34_0 = null;
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
        var12 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                var5_ref = new java.net.Socket(param0, param3);
                var5_ref.setSoTimeout(10000);
                var6 = var5_ref.getOutputStream();
                if (param1 != null) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + ((ra) this).field_d + ":" + ((ra) this).field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + ((ra) this).field_d + ":" + ((ra) this).field_e + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var5_ref.getInputStream()));
              var8 = var7.readLine();
              if (var8 != null) {
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
                      var10 = "proxy-authenticate: ";
                      var8 = var7.readLine();
                      L6: while (true) {
                        L7: {
                          if (var8 == null) {
                            break L7;
                          } else {
                            if (50 <= var9) {
                              break L7;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var9++;
                                var8 = var7.readLine();
                                if (var12 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              } else {
                                L8: {
                                  var8 = var8.substring(var10.length()).trim();
                                  var11 = var8.indexOf(' ');
                                  if (var11 != -1) {
                                    var8 = var8.substring(0, var11);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                throw new tk(var8);
                              }
                            }
                          }
                        }
                        throw new tk("");
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_14_0 = (java.net.Socket) var5_ref;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              } else {
                break L3;
              }
            }
            if (param2) {
              var6.close();
              var7.close();
              var5_ref.close();
              stackOut_36_0 = null;
              stackIn_37_0 = stackOut_36_0;
              break L0;
            } else {
              stackOut_34_0 = null;
              stackIn_35_0 = stackOut_34_0;
              return (java.net.Socket) (Object) stackIn_35_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var5;
            stackOut_38_1 = new StringBuilder().append("ra.A(");
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
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
            if (param1 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (java.net.Socket) (Object) stackIn_37_0;
    }

    final java.net.Socket b(int param0) throws IOException {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        tk var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
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
        Object stackIn_24_0 = null;
        java.net.Socket stackIn_29_0 = null;
        java.net.Socket stackIn_33_0 = null;
        java.net.Socket stackIn_42_0 = null;
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
        java.net.Socket stackOut_28_0 = null;
        java.net.Socket stackOut_32_0 = null;
        java.net.Socket stackOut_41_0 = null;
        Object stackOut_23_0 = null;
        var13 = Bounce.field_N;
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
              if (443 != ((ra) this).field_e) {
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
                  stackOut_10_0 = ((ra) this).field_g;
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
                  if (var5 == 0) {
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
                    break L4;
                  } else {
                    stackOut_11_0 = (java.net.ProxySelector) (Object) stackIn_11_0;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = (StringBuilder) (Object) stackIn_11_3;
                    stackOut_11_4 = "https";
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_14_1 = stackOut_11_1;
                    stackIn_14_2 = stackOut_11_2;
                    stackIn_14_3 = stackOut_11_3;
                    stackIn_14_4 = stackOut_11_4;
                    break L4;
                  }
                }
                L5: {
                  var3 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + ((ra) this).field_d));
                  stackOut_14_0 = ((ra) this).field_g;
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
                var4 = ((java.net.ProxySelector) (Object) stackIn_18_0).select(new java.net.URI(stackIn_18_4 + "://" + ((ra) this).field_d));
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
              stackOut_20_0 = ((ra) this).a(false);
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0;
            }
            boolean discarded$3 = var3.addAll((Collection) (Object) var4);
            var6_array = var3.toArray();
            var7 = null;
            var8_array = var6_array;
            if (param0 == -19314) {
              var9 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (var9 >= var8_array.length) {
                      break L8;
                    } else {
                      var10 = var8_array[var9];
                      var11 = (java.net.Proxy) var10;
                      try {
                        L9: {
                          var12_ref2 = this.a(var11, (byte) -37);
                          stackOut_28_0 = (java.net.Socket) var12_ref2;
                          stackIn_42_0 = stackOut_28_0;
                          stackIn_29_0 = stackOut_28_0;
                          if (var13 != 0) {
                            decompiledRegionSelector0 = 0;
                            break L9;
                          } else {
                            if (stackIn_29_0 == null) {
                              decompiledRegionSelector0 = 2;
                              break L9;
                            } else {
                              stackOut_32_0 = (java.net.Socket) var12_ref2;
                              stackIn_33_0 = stackOut_32_0;
                              decompiledRegionSelector0 = 1;
                              break L9;
                            }
                          }
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L11: {
                          var12_ref = (IOException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 2;
                          break L11;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L10: {
                          var12 = (tk) (Object) decompiledCaughtException;
                          var7 = (Object) (Object) var12;
                          decompiledRegionSelector0 = 2;
                          break L10;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L7;
                      } else {
                        if (decompiledRegionSelector0 == 1) {
                          return stackIn_33_0;
                        } else {
                          var9++;
                          if (var13 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  if (null == var7) {
                    stackOut_41_0 = ((ra) this).a(false);
                    stackIn_42_0 = stackOut_41_0;
                    break L7;
                  } else {
                    throw ra.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
                  }
                }
                break L0;
              }
            } else {
              stackOut_23_0 = null;
              stackIn_24_0 = stackOut_23_0;
              return (java.net.Socket) (Object) stackIn_24_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "ra.D(" + param0 + ')');
        }
        return stackIn_42_0;
    }

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_25_0 = 0;
        var4 = Bounce.field_N;
        try {
          L0: {
            var1 = (Object) (Object) qj.field_c;
            synchronized (var1) {
              L1: {
                L2: {
                  if (param0 == 28282) {
                    break L2;
                  } else {
                    field_f = null;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        oh.field_a = ec.field_bb;
                        ak.field_y = ak.field_y + 1;
                        if (db.field_R < 0) {
                          break L6;
                        } else {
                          L7: while (true) {
                            if (rj.field_g == db.field_R) {
                              break L5;
                            } else {
                              var2 = di.field_b[rj.field_g];
                              rj.field_g = 127 & 1 + rj.field_g;
                              stackOut_8_0 = var2;
                              stackIn_26_0 = stackOut_8_0;
                              stackIn_9_0 = stackOut_8_0;
                              if (var4 != 0) {
                                break L4;
                              } else {
                                L8: {
                                  L9: {
                                    if (stackIn_9_0 >= 0) {
                                      break L9;
                                    } else {
                                      ng.field_a[~var2] = false;
                                      if (var4 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  ng.field_a[var2] = true;
                                  break L8;
                                }
                                if (var4 == 0) {
                                  continue L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                      }
                      var2 = 0;
                      L10: while (true) {
                        L11: {
                          if (var2 >= 112) {
                            break L11;
                          } else {
                            ng.field_a[var2] = false;
                            var2++;
                            if (var4 != 0) {
                              break L3;
                            } else {
                              if (var4 == 0) {
                                continue L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        db.field_R = rj.field_g;
                        break L5;
                      }
                    }
                    stackOut_25_0 = Bounce.field_F;
                    stackIn_26_0 = stackOut_25_0;
                    break L4;
                  }
                  ec.field_bb = stackIn_26_0;
                  break L3;
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) (Object) runtimeException, "ra.E(" + param0 + ')');
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
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
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        java.net.Socket stackIn_21_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        Object stackOut_23_0 = null;
        java.net.Socket stackOut_20_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_5_0 = null;
        java.net.Socket stackOut_1_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3_ref = param0.address();
              if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                if (param1 == -37) {
                  var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                  if (param0.type() != java.net.Proxy.Type.HTTP) {
                    if (param0.type() != java.net.Proxy.Type.SOCKS) {
                      stackOut_25_0 = null;
                      stackIn_26_0 = stackOut_25_0;
                      break L0;
                    } else {
                      var5 = (Object) (Object) new java.net.Socket(param0);
                      ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((ra) this).field_d, ((ra) this).field_e));
                      stackOut_23_0 = var5;
                      stackIn_24_0 = stackOut_23_0;
                      return (java.net.Socket) (Object) stackIn_24_0;
                    }
                  } else {
                    var5 = null;
                    try {
                      L1: {
                        L2: {
                          var6_ref = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                          var7 = var6_ref.getDeclaredMethod("getProxyAuth", new Class[2]);
                          var7.setAccessible(true);
                          var8 = var7.invoke((Object) null, new Object[2]);
                          if (var8 == null) {
                            break L2;
                          } else {
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
                    stackOut_20_0 = this.a(var4_ref.getHostName(), (String) var5, true, var4_ref.getPort());
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0;
                  }
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (java.net.Socket) (Object) stackIn_9_0;
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (java.net.Socket) (Object) stackIn_6_0;
              }
            } else {
              stackOut_1_0 = ((ra) this).a(false);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("ra.C(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L4;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ')');
        }
        return (java.net.Socket) (Object) stackIn_26_0;
    }

    ra() {
        try {
            ((ra) this).field_g = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ra.<init>()");
        }
    }

    public static void b(byte param0) {
        try {
            field_f = null;
            if (param0 <= 109) {
                ra.b((byte) 102);
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ra.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

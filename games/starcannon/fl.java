/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.Socket;
import java.net.ProxySelector;
import java.net.URI;

final class fl extends oe {
    static String field_g;
    static hl[] field_f;
    static String field_i;
    private java.net.ProxySelector field_j;
    static wd field_h;
    static int[] field_e;

    final static boolean d(int param0) {
        return null != ed.field_q && ed.field_q.k(0) != null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, byte param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var19 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                if (~param8 <= ~gl.field_a) {
                  break L1;
                } else {
                  L2: {
                    if (param5 >= 0) {
                      break L2;
                    } else {
                      if (param1 >= 0) {
                        break L2;
                      } else {
                        if (param3 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param5 < gl.field_f) {
                      break L3;
                    } else {
                      if (param1 < gl.field_f) {
                        break L3;
                      } else {
                        if (gl.field_f > param3) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (param7 == -43) {
                    L4: {
                      var14 = param0 - param8;
                      if (param4 == param8) {
                        L5: {
                          if (~param0 != ~param8) {
                            var15 = param0 + -param4;
                            if (~param1 >= ~param5) {
                              var12 = (param3 + -param5 << 16) / var14;
                              var11 = (param3 + -param1 << 16) / var15;
                              var9_int = param1 << 16;
                              var10 = param5 << 16;
                              break L5;
                            } else {
                              var12 = (-param1 + param3 << 16) / var15;
                              var11 = (param3 - param5 << 16) / var14;
                              var10 = param1 << 16;
                              var9_int = param5 << 16;
                              break L5;
                            }
                          } else {
                            var12 = 0;
                            var10 = param1 << 16;
                            var9_int = param5 << 16;
                            var11 = 0;
                            break L5;
                          }
                        }
                        L6: {
                          if (param8 >= 0) {
                            break L6;
                          } else {
                            param8 = Math.min(-param8, param4 - param8);
                            var9_int = var9_int + param8 * var11;
                            var10 = var10 + var12 * param8;
                            param8 = 0;
                            break L6;
                          }
                        }
                        var13 = 0;
                        break L4;
                      } else {
                        L7: {
                          var10 = param5 << 16;
                          var9_int = param5 << 16;
                          var15 = -param8 + param4;
                          var12 = (-param5 + param3 << 16) / var14;
                          var11 = (param1 + -param5 << 16) / var15;
                          if (var11 < var12) {
                            var13 = 0;
                            break L7;
                          } else {
                            var13 = 1;
                            var16 = var11;
                            var11 = var12;
                            var12 = var16;
                            break L7;
                          }
                        }
                        L8: {
                          L9: {
                            if (param8 < 0) {
                              if (param4 < 0) {
                                param8 = param4 + -param8;
                                var9_int = var9_int + var11 * param8;
                                var10 = var10 + param8 * var12;
                                param8 = param4;
                                break L8;
                              } else {
                                param8 = -param8;
                                var9_int = var9_int + param8 * var11;
                                var10 = var10 + param8 * var12;
                                param8 = 0;
                                break L9;
                              }
                            } else {
                              break L9;
                            }
                          }
                          var16 = gl.field_c[param8];
                          L10: while (true) {
                            if (param8 >= param4) {
                              break L8;
                            } else {
                              L11: {
                                var17 = var9_int >> 16;
                                if (var17 >= gl.field_f) {
                                  break L11;
                                } else {
                                  var18 = (var10 >> 16) - (var9_int >> 16);
                                  if (var18 != 0) {
                                    L12: {
                                      if (var18 + var17 >= gl.field_f) {
                                        var18 = -1 + (gl.field_f + -var17);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    if (var17 < 0) {
                                      qd.a(var17 + var18, 27, var16, param2, param6);
                                      break L11;
                                    } else {
                                      qd.a(var18, 56, var16 + var17, param2, param6);
                                      break L11;
                                    }
                                  } else {
                                    if (0 > var17) {
                                      break L11;
                                    } else {
                                      if (var17 < gl.field_f) {
                                        qd.a(var18, 125, var16 + var17, param2, param6);
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                              }
                              param8++;
                              if (param8 < gl.field_a) {
                                var16 = var16 + ki.field_j;
                                var10 = var10 + var12;
                                var9_int = var9_int + var11;
                                continue L10;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                        var16 = -param4 + param0;
                        if (var16 == 0) {
                          var12 = 0;
                          var11 = 0;
                          break L4;
                        } else {
                          L13: {
                            if (var13 != 0) {
                              var10 = param1 << 16;
                              break L13;
                            } else {
                              var9_int = param1 << 16;
                              break L13;
                            }
                          }
                          var17 = param3 << 16;
                          var12 = (-var10 + var17) / var16;
                          var11 = (-var9_int + var17) / var16;
                          break L4;
                        }
                      }
                    }
                    L14: {
                      if (param8 < 0) {
                        param8 = -param8;
                        var9_int = var9_int + param8 * var11;
                        var10 = var10 + param8 * var12;
                        param8 = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var15 = gl.field_c[param8];
                    L15: while (true) {
                      if (~param8 <= ~param0) {
                        break L0;
                      } else {
                        L16: {
                          var16 = var9_int >> 16;
                          if (gl.field_f > var16) {
                            var17 = (var10 >> 16) - (var9_int >> 16);
                            if (var17 != 0) {
                              L17: {
                                if (~(var16 + var17) <= ~gl.field_f) {
                                  var17 = gl.field_f + -var16 - 1;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              if (var16 < 0) {
                                qd.a(var17 - -var16, 25, var15, param2, param6);
                                break L16;
                              } else {
                                qd.a(var17, 38, var16 + var15, param2, param6);
                                break L16;
                              }
                            } else {
                              if (0 > var16) {
                                break L16;
                              } else {
                                if (var16 >= gl.field_f) {
                                  break L16;
                                } else {
                                  qd.a(var17, param7 ^ -45, var15 + var16, param2, param6);
                                  break L16;
                                }
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                        param8++;
                        if (gl.field_a <= param8) {
                          return;
                        } else {
                          var9_int = var9_int + var11;
                          var15 = var15 + ki.field_j;
                          var10 = var10 + var12;
                          continue L15;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) var9;
            stackOut_79_1 = new StringBuilder().append("fl.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param6 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L18;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L18;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    fl() {
        ((fl) this).field_j = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
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
        String var15 = null;
        java.net.Socket stackIn_9_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_8_0 = null;
        Object stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var12 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param1, param3);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param0 == null) {
                var6.write(("CONNECT " + ((fl) this).field_c + ":" + ((fl) this).field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + ((fl) this).field_c + ":" + ((fl) this).field_d + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
              var14 = var7.readLine();
              var8 = var14;
              var8 = var14;
              if (var14 == null) {
                break L2;
              } else {
                L3: {
                  if (var14.startsWith("HTTP/1.0 200")) {
                    break L3;
                  } else {
                    if (!var14.startsWith("HTTP/1.1 200")) {
                      L4: {
                        if (var14.startsWith("HTTP/1.0 407")) {
                          break L4;
                        } else {
                          if (var14.startsWith("HTTP/1.1 407")) {
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
                            if (50 <= var9) {
                              break L6;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L7: {
                                  var15 = var8.substring(var10.length()).trim();
                                  var8 = var15;
                                  var8 = var15;
                                  var11 = var15.indexOf(' ');
                                  if (var11 == -1) {
                                    break L7;
                                  } else {
                                    var8 = var15.substring(0, var11);
                                    break L7;
                                  }
                                }
                                throw new le(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                continue L5;
                              }
                            }
                          }
                        }
                        throw new le("");
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_8_0 = (java.net.Socket) var13;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            if (param2 != -20384) {
              fl.e(-64);
              stackOut_25_0 = null;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("fl.E(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param2 + 44 + param3 + 41);
        }
        return (java.net.Socket) (Object) stackIn_26_0;
    }

    final java.net.Socket a(byte param0) throws IOException {
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
        le var12 = null;
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
          var13 = StarCannon.field_A;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (param0 <= -3) {
            break L1;
          } else {
            field_h = null;
            break L1;
          }
        }
        L2: {
          if (((fl) this).field_d != 443) {
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
              stackOut_8_0 = ((fl) this).field_j;
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
              var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(stackIn_11_4 + "://" + ((fl) this).field_c));
              stackOut_11_0 = ((fl) this).field_j;
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
            var4 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + ((fl) this).field_c));
            break L3;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return ((fl) this).b((byte) -83);
        }
        boolean discarded$3 = var3.addAll((Collection) (Object) var4);
        var6_array = var3.toArray();
        var7 = null;
        var8_array = var6_array;
        var9 = 0;
        L6: while (true) {
          if (var8_array.length <= var9) {
            if (var7 != null) {
              throw fl.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return ((fl) this).b((byte) -64);
            }
          } else {
            var10 = var8_array[var9];
            var11 = (java.net.Proxy) var10;
            try {
              L7: {
                var12_ref2 = this.a(-56426768, var11);
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
                var12 = (le) (Object) decompiledCaughtException;
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
        Class var14 = null;
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        java.net.Socket stackOut_2_0 = null;
        Object stackOut_21_0 = null;
        java.net.Socket stackOut_17_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (param1.type() == java.net.Proxy.Type.DIRECT) {
              stackOut_2_0 = ((fl) this).b((byte) -125);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var3_ref = param1.address();
              if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                L1: {
                  if (param0 == -56426768) {
                    break L1;
                  } else {
                    field_i = null;
                    break L1;
                  }
                }
                var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                if (param1.type() != java.net.Proxy.Type.HTTP) {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = (Object) (Object) new java.net.Socket(param1);
                    ((java.net.Socket) var5).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((fl) this).field_c, ((fl) this).field_d));
                    stackOut_21_0 = var5;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  var5 = null;
                  try {
                    L2: {
                      L3: {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 == null) {
                          break L3;
                        } else {
                          var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                          var9.setAccessible(true);
                          if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                            var11.setAccessible(true);
                            var12 = (String) var10.invoke(var8, new Object[0]);
                            var13 = (String) var11.invoke(var8, new Object[2]);
                            var5 = (Object) (Object) (var12 + ": " + var13);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  stackOut_17_0 = this.a((String) var5, var4_ref.getHostName(), -20384, var4_ref.getPort());
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (java.net.Socket) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("fl.C(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return (java.net.Socket) (Object) stackIn_22_0;
    }

    public static void e(int param0) {
        field_e = null;
        field_h = null;
        int var1 = -118 % ((-22 - param0) / 55);
        field_i = null;
        field_g = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Difficulty - MEDIUM";
        field_i = "Start Game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

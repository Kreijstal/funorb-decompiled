/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class fl extends oe {
    static String field_g;
    static hl[] field_f;
    static String field_i;
    private java.net.ProxySelector field_j;
    static wd field_h;
    static int[] field_e;

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 897584976) {
          L0: {
            L1: {
              if (null == ed.field_q) {
                break L1;
              } else {
                if (ed.field_q.k(param0 ^ 897584976) == null) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, byte param7, int param8) {
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        var19 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                if (param8 >= gl.field_a) {
                  break L1;
                } else {
                  L2: {
                    if (-1 >= (param5 ^ -1)) {
                      break L2;
                    } else {
                      if ((param1 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (-1 >= (param3 ^ -1)) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
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
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  if (param7 == -43) {
                    L4: {
                      var14 = param0 - param8;
                      if (param4 == param8) {
                        L5: {
                          if (param0 != param8) {
                            var15 = param0 + -param4;
                            if (param1 <= param5) {
                              var12 = (param3 + -param5 << -568024176) / var14;
                              var11 = (param3 + -param1 << -1151943472) / var15;
                              var9_int = param1 << 2106676816;
                              var10 = param5 << -56426768;
                              break L5;
                            } else {
                              var12 = (-param1 + param3 << 897584976) / var15;
                              var11 = (param3 - param5 << 1015589904) / var14;
                              var10 = param1 << 632014672;
                              var9_int = param5 << 1278467888;
                              break L5;
                            }
                          } else {
                            var12 = 0;
                            var10 = param1 << -182089648;
                            var9_int = param5 << -1077607792;
                            var11 = 0;
                            break L5;
                          }
                        }
                        L6: {
                          if ((param8 ^ -1) <= -1) {
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
                          var10 = param5 << 1502669744;
                          var9_int = param5 << 1502669744;
                          var15 = -param8 + param4;
                          var12 = (-param5 + param3 << 156289840) / var14;
                          var11 = (param1 + -param5 << 606068112) / var15;
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
                            if (-1 < (param8 ^ -1)) {
                              if ((param4 ^ -1) > -1) {
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
                                var17 = var9_int >> 1475987568;
                                if (var17 >= gl.field_f) {
                                  break L11;
                                } else {
                                  var18 = (var10 >> 1339306544) - (var9_int >> 1812992816);
                                  if (var18 != 0) {
                                    L12: {
                                      if (var18 + var17 >= gl.field_f) {
                                        var18 = -1 + (gl.field_f + -var17);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    if (-1 < (var17 ^ -1)) {
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
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        var16 = -param4 + param0;
                        if (-1 == (var16 ^ -1)) {
                          var12 = 0;
                          var11 = 0;
                          break L4;
                        } else {
                          L13: {
                            if (var13 != 0) {
                              var10 = param1 << 1753558256;
                              break L13;
                            } else {
                              var9_int = param1 << 1795637232;
                              break L13;
                            }
                          }
                          var17 = param3 << 140410736;
                          var12 = (-var10 + var17) / var16;
                          var11 = (-var9_int + var17) / var16;
                          break L4;
                        }
                      }
                    }
                    L14: {
                      if ((param8 ^ -1) > -1) {
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
                      if (param8 >= param0) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L16: {
                          var16 = var9_int >> 2064360880;
                          if (gl.field_f > var16) {
                            var17 = (var10 >> 5714160) - (var9_int >> -1810197168);
                            if (-1 != (var17 ^ -1)) {
                              L17: {
                                if (var16 + var17 >= gl.field_f) {
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
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          var9_int = var9_int + var11;
                          var15 = var15 + ki.field_j;
                          var10 = var10 + var12;
                          continue L15;
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackIn_81_0 = (RuntimeException) (var9);

            stackIn_81_1 = new StringBuilder().append("fl.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "null";
              break L18;
            } else {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "{...}";
              break L18;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    fl() {
        this.field_j = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        java.net.Socket stackIn_9_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
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
        String var15 = null;
        var12 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param1, param3);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param0 == null) {
                var6.write(("CONNECT " + this.field_c + ":" + this.field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_c + ":" + this.field_d + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
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
                                  var8 = var15;
                                  var11 = var15.indexOf(' ');
                                  if ((var11 ^ -1) == 0) {
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
                stackIn_9_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            if (param2 != -20384) {
              fl.e(-64);
              stackIn_26_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("fl.E(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_26_0);
        }
    }

    final java.net.Socket a(byte param0) throws IOException {
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
        le var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = StarCannon.field_A;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (param0 <= -3) {
            break L1;
          } else {
            field_h = (wd) null;
            break L1;
          }
        }
        L2: {
          if ((this.field_d ^ -1) != -444) {
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
              stackIn_10_0 = this.field_j;

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
              var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(stackIn_11_4 + "://" + this.field_c));
              stackIn_13_0 = this.field_j;

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
            var4 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + this.field_c));
            break L3;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b((byte) -83);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        var9 = 0;
        L6: while (true) {
          if (var8.length <= var9) {
            if (var7 != null) {
              throw fl.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return this.b((byte) -64);
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              L7: {
                var12 = this.a(-56426768, var11);
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
            } catch (le decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var12_ref = (le) (Object) decompiledCaughtException;
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

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        Object var5 = null;
        Class var6 = null;
        Exception var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        try {
          L0: {
            if (param1.type() == java.net.Proxy.Type.DIRECT) {
              stackIn_3_0 = this.b((byte) -125);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = param1.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                L1: {
                  if (param0 == -56426768) {
                    break L1;
                  } else {
                    field_i = (String) null;
                    break L1;
                  }
                }
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param1.type() != java.net.Proxy.Type.HTTP) {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param1);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_c, this.field_d)));
                    stackIn_22_0 = var5;
                    decompiledRegionSelector0 = 3;
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
                        var6 = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                        if (var8 == null) {
                          break L3;
                        } else {
                          var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var9.setAccessible(true);
                          if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_c + "/"), "https"}));
                            var5 = var12 + ": " + var13;
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
                      var6_ref = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  stackIn_18_0 = this.a((String) (var5), var4.getHostName(), -20384, var4.getPort());
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3_ref);

            stackIn_25_1 = new StringBuilder().append("fl.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              return (java.net.Socket) ((Object) stackIn_22_0);
            }
          }
        }
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
        field_g = "Difficulty - MEDIUM";
        field_i = "Start Game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

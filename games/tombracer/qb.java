/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

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
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (3 != param2) {
              L1: {
                if (param1 == 8793) {
                  break L1;
                } else {
                  field_e = (jpa[]) null;
                  break L1;
                }
              }
              if (-7 != (param2 ^ -1)) {
                if (param2 == 7) {
                  stackIn_11_0 = tla.field_j;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param2 != 8) {
                    if ((param2 ^ -1) != -10) {
                      if (-11 == (param2 ^ -1)) {
                        stackIn_21_0 = cha.field_c;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (-12 != (param2 ^ -1)) {
                          if (14 == param2) {
                            stackIn_28_0 = gl.a((byte) 92, ir.field_e, new String[]{param0});
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackIn_24_0 = esa.field_a;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_17_0 = nta.field_e;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = ipa.field_N;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = era.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = hj.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("qb.D(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L2;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_28_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        lqa var1;
        int var2;
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
                baa.field_d.a(0, new ei[]{(ei) ((Object) vea.field_c)});
                break L1;
              } else {
                if (vea.field_c == var1) {
                  baa.field_d.a(0, new ei[]{(ei) ((Object) laa.field_x)});
                  break L1;
                } else {
                  if (laa.field_x != var1) {
                    if (var1 != daa.field_d) {
                      break L1;
                    } else {
                      baa.field_d.a(0, new ei[]{(ei) ((Object) kra.field_a)});
                      break L1;
                    }
                  } else {
                    baa.field_d.a(0, new ei[]{(ei) ((Object) daa.field_d)});
                    break L1;
                  }
                }
              }
            } else {
              baa.field_d.a(0, new ei[]{(ei) ((Object) nj.field_t)});
              break L1;
            }
          } else {
            baa.field_d.a(0, new ei[]{(ei) ((Object) paa.field_z)});
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
        L0: {
          if (msa.field_a != param0) {
            break L0;
          } else {
            if (rba.field_a == null) {
              break L0;
            } else {
              if (fna.field_j != null) {
                aoa.a(83, 3);
                aoa.a(param1 ^ 125, 4);
                aoa.a(76, param1);
                aoa.a(param1 ^ 80, 6);
                aoa.a(82, 7);
                aoa.a(param1 ^ 68, 8);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        int stackIn_5_0 = 0;
        java.net.ProxySelector stackIn_8_0;
        java.net.URI stackIn_8_1;
        java.net.URI stackIn_8_2;
        StringBuilder stackIn_8_3;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        String stackIn_9_4 = null;
        java.net.ProxySelector stackIn_11_0;
        java.net.URI stackIn_11_1;
        java.net.URI stackIn_11_2;
        StringBuilder stackIn_11_3;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        String stackIn_12_4;
        java.net.Socket stackIn_21_0 = null;
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
        wra var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L0;
          } else {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          }
        }
        L1: {
          if (443 != this.field_b) {
            stackIn_5_0 = 0;
            break L1;
          } else {
            stackIn_5_0 = 1;
            break L1;
          }
        }
        var5 = stackIn_5_0;
        try {
          L2: {
            L3: {
              stackIn_8_0 = this.field_d;

              stackIn_8_1 = null;

              stackIn_8_2 = null;

              stackIn_8_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_9_0 = (java.net.ProxySelector) ((Object) stackIn_8_0);
                stackIn_9_1 = null;
                stackIn_9_2 = null;
                stackIn_9_3 = (StringBuilder) ((Object) stackIn_8_3);
                stackIn_9_4 = "http";
                break L3;
              } else {
                stackIn_9_0 = (java.net.ProxySelector) ((Object) stackIn_8_0);
                stackIn_9_1 = null;
                stackIn_9_2 = null;
                stackIn_9_3 = (StringBuilder) ((Object) stackIn_8_3);
                stackIn_9_4 = "https";
                break L3;
              }
            }
            L4: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(stackIn_9_4 + "://" + this.field_a));
              stackIn_11_0 = this.field_d;

              stackIn_11_1 = null;

              stackIn_11_2 = null;

              stackIn_11_3 = new StringBuilder();

              if (var5 != 0) {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "http";
                break L4;
              } else {
                stackIn_12_0 = (java.net.ProxySelector) ((Object) stackIn_11_0);
                stackIn_12_1 = null;
                stackIn_12_2 = null;
                stackIn_12_3 = (StringBuilder) ((Object) stackIn_11_3);
                stackIn_12_4 = "https";
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(stackIn_12_4 + "://" + this.field_a));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a((byte) 112);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        var9 = 0;
        L5: while (true) {
          if (var9 >= var8.length) {
            if (var7 != null) {
              throw qb.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              if (param0 == 25927) {
                return this.a((byte) -105);
              } else {
                return (java.net.Socket) null;
              }
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              L6: {
                var12 = this.a(var11, 443);
                if (var12 != null) {
                  stackIn_21_0 = (java.net.Socket) (var12);
                  decompiledRegionSelector0 = 1;
                  break L6;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              }
            } catch (wra decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var12_ref = (wra) (Object) decompiledCaughtException;
                var7 = var12_ref;
                var9++;
                decompiledRegionSelector0 = 0;
                break L7;
              }
            } catch (java.io.IOException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L8: {
                var12_ref2 = (IOException) (Object) decompiledCaughtException;
                var9++;
                decompiledRegionSelector0 = 0;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue L5;
            } else {
              return stackIn_21_0;
            }
          }
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        java.net.Socket stackIn_17_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
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
            if (param0.type() == java.net.Proxy.Type.DIRECT) {
              stackIn_3_0 = this.a((byte) 112);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 443) {
                  break L1;
                } else {
                  qb.b((byte) 83);
                  break L1;
                }
              }
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param0.type() != java.net.Proxy.Type.HTTP) {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param0);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_b)));
                    stackIn_21_0 = var5;
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
                          if (!((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            break L3;
                          } else {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
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
                      var6_ref = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  stackIn_17_0 = this.a(73, var4.getPort(), var4.getHostName(), (String) (var5));
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3_ref);

            stackIn_24_1 = new StringBuilder().append("qb.B(");

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
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return (java.net.Socket) ((Object) stackIn_21_0);
            }
          }
        }
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_12_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
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
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param2, param1);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param3 == null) {
                var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              if (param0 >= 11) {
                break L2;
              } else {
                qb.c((byte) -97);
                break L2;
              }
            }
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
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
                      var8 = var7.readLine();
                      L6: while (true) {
                        L7: {
                          if (var8 == null) {
                            break L7;
                          } else {
                            if (50 <= var9) {
                              break L7;
                            } else {
                              if (var8.toLowerCase().startsWith(var10)) {
                                L8: {
                                  var14 = var8.substring(var10.length()).trim();
                                  var8 = var14;
                                  var8 = var14;
                                  var8 = var14;
                                  var11 = var14.indexOf(' ');
                                  if ((var11 ^ -1) == 0) {
                                    break L8;
                                  } else {
                                    var8 = var14.substring(0, var11);
                                    break L8;
                                  }
                                }
                                throw new wra(var8);
                              } else {
                                var9++;
                                var8 = var7.readLine();
                                continue L6;
                              }
                            }
                          }
                        }
                        throw new wra("");
                      }
                    }
                  }
                }
                stackIn_12_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L3;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            stackIn_27_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("qb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_27_0);
        }
    }

    final static int a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9) {
        int var10;
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
                      field_e = (jpa[]) null;
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
        this.field_d = java.net.ProxySelector.getDefault();
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

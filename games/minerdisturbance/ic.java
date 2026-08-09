/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ic extends jh {
    static String field_m;
    private static long[] field_j;
    static int field_h;
    static String field_i;
    static String field_g;
    static volatile int field_n;
    static bd field_l;
    static int field_k;
    private java.net.ProxySelector field_o;

    final java.net.Socket a(int param0) throws IOException {
        java.net.URISyntaxException uRISyntaxException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        Object[] var6 = null;
        Object var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        int var13 = 0;
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
        java.net.Socket stackIn_22_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        pm var12_ref = null;
        IOException var12_ref2 = null;
        L0: {
          var13 = MinerDisturbance.field_ab;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (443 != this.field_e) {
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
              stackIn_9_0 = this.field_o;

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
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + this.field_f));
              stackIn_12_0 = this.field_o;

              stackIn_12_1 = null;

              stackIn_12_2 = null;

              stackIn_12_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_13_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_3 = (StringBuilder) ((Object) stackIn_12_3);
                stackIn_13_4 = "https";
                break L4;
              } else {
                stackIn_13_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_3 = (StringBuilder) ((Object) stackIn_12_3);
                stackIn_13_4 = "http";
                break L4;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + this.field_f));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          uRISyntaxException = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b((byte) 51);
        }
        var3.addAll((Collection) ((Object) var4));
        var6 = var3.toArray();
        var7 = null;
        var8 = var6;
        var9 = param0;
        L5: while (true) {
          if (var9 >= var8.length) {
            if (var7 != null) {
              throw ic.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            } else {
              return this.b((byte) 51);
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              L6: {
                var12 = this.a(var11, 8217);
                if (var12 != null) {
                  stackIn_22_0 = (java.net.Socket) (var12);
                  decompiledRegionSelector0 = 1;
                  break L6;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              }
            } catch (pm decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var12_ref = (pm) (Object) decompiledCaughtException;
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
              return stackIn_22_0;
            }
          }
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        java.net.Socket stackIn_19_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
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
        CharSequence var14 = null;
        Class var15 = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param0.type() == java.net.Proxy.Type.HTTP) {
                  var5 = null;
                  try {
                    L1: {
                      L2: {
                        var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6 = var15;
                        var7 = var15.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
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
                            var11 = var15.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_f + "/"), "https"}));
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
                  stackIn_19_0 = this.a(var4.getHostName(), var4.getPort(), (String) (var5), -13368);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (param0.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param0);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_f, this.field_e)));
                    stackIn_10_0 = var5;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (param1 != 8217) {
                      var14 = (CharSequence) null;
                      ic.a(true, (CharSequence) null);
                      stackIn_23_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.b((byte) 51);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3_ref);

            stackIn_26_1 = new StringBuilder().append("ic.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.net.Socket) ((Object) stackIn_10_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return (java.net.Socket) ((Object) stackIn_23_0);
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 <= 5) {
            ic.b(-73);
        }
        pb.field_K = param1;
        fg.field_b = param2;
        am.field_J = param3;
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 < 13) {
            CharSequence var2 = (CharSequence) null;
            ic.a(true, (CharSequence) null);
        }
        field_g = null;
        field_l = null;
        field_m = null;
        field_i = null;
    }

    private final java.net.Socket a(String param0, int param1, String param2, int param3) throws IOException {
        java.net.Socket stackIn_9_0 = null;
        java.net.Socket stackIn_26_0 = null;
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
        var12 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param0, param1);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param2 == null) {
                var6.write(("CONNECT " + this.field_f + ":" + this.field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_f + ":" + this.field_e + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
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
                    if (var8.startsWith("HTTP/1.1 200")) {
                      break L3;
                    } else {
                      L4: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          break L4;
                        } else {
                          if (!var8.startsWith("HTTP/1.1 407")) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var9 = 0;
                      var8 = var7.readLine();
                      var10 = "proxy-authenticate: ";
                      L5: while (true) {
                        L6: {
                          if (var8 == null) {
                            break L6;
                          } else {
                            if (-51 >= (var9 ^ -1)) {
                              break L6;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var8 = var7.readLine();
                                var9++;
                                continue L5;
                              } else {
                                L7: {
                                  var14 = var8.substring(var10.length()).trim();
                                  var8 = var14;
                                  var11 = var14.indexOf(' ');
                                  if (-1 != var11) {
                                    var8 = var14.substring(0, var11);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                throw new pm(var8);
                              }
                            }
                          }
                        }
                        throw new pm("");
                      }
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
            if (param3 != -13368) {
              stackIn_26_0 = (java.net.Socket) null;
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
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("ic.D(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_26_0;
        }
    }

    final static byte[] a(boolean param0, CharSequence param1) {
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new byte[var2_int];
              if (!param0) {
                break L1;
              } else {
                field_l = (bd) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_69_0 = (byte[]) (var3);
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L5;
                      } else {
                        if (128 > var5) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (var5 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (8364 == var5) {
                      var3[var4] = (byte)-128;
                      break L3;
                    } else {
                      if (var5 != 8218) {
                        if (var5 == 402) {
                          var3[var4] = (byte)-125;
                          break L3;
                        } else {
                          if (var5 == 8222) {
                            var3[var4] = (byte)-124;
                            break L3;
                          } else {
                            if (var5 != 8230) {
                              if (var5 != 8224) {
                                if (var5 == 8225) {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                } else {
                                  if (var5 != 710) {
                                    if (8240 == var5) {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var5 != 352) {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (338 != var5) {
                                            if (var5 == 381) {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (var5 == 8216) {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (8217 == var5) {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (8220 != var5) {
                                                    if (var5 != 8221) {
                                                      if (8226 == var5) {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (8211 != var5) {
                                                          if (var5 != 8212) {
                                                            if (var5 == 732) {
                                                              var3[var4] = (byte)-104;
                                                              break L3;
                                                            } else {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (var5 != 353) {
                                                                  if (8250 == var5) {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var5 != 339) {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (376 == var5) {
                                                                          var3[var4] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-105;
                                                            break L3;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-116;
                                            break L3;
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  }
                                }
                              } else {
                                var3[var4] = (byte)-122;
                                break L3;
                              }
                            } else {
                              var3[var4] = (byte)-123;
                              break L3;
                            }
                          }
                        }
                      } else {
                        var3[var4] = (byte)-126;
                        break L3;
                      }
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var2);

            stackIn_72_1 = new StringBuilder().append("ic.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        return stackIn_69_0;
    }

    ic() {
        this.field_o = java.net.ProxySelector.getDefault();
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_j = new long[256];
            var2 = 0;
            L0: while (true) {
              if ((var2 ^ -1) <= -257) {
                field_i = null;
                field_n = 0;
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (-9 >= (var3 ^ -1)) {
                    field_j[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0 ^ -1L) == -2L) {
                      var0 = -3932672073523589310L ^ var0 >>> -866120575;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

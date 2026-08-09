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
        oa var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        String var14 = null;
        L0: {
          var13 = Chess.field_G;
          if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            System.setProperty("java.net.useSystemProxies", "true");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (443 != this.field_c) {
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
              stackIn_9_0 = this.field_k;

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
              var3 = ((java.net.ProxySelector) (Object) stackIn_10_0).select(new java.net.URI(stackIn_10_4 + "://" + this.field_a));
              stackIn_12_0 = this.field_k;

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
            var4 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + this.field_a));
            break L2;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(true);
        }
        L5: {
          var3.addAll((Collection) ((Object) var4));
          var6_array = var3.toArray();
          var7 = null;
          var8 = var6_array;
          if (param0 <= -79) {
            break L5;
          } else {
            var14 = (String) null;
            mn.a((String) null, 40);
            break L5;
          }
        }
        var9 = 0;
        L6: while (true) {
          if (var9 >= var8.length) {
            if (var7 == null) {
              return this.a(true);
            } else {
              throw mn.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            }
          } else {
            var10 = var8[var9];
            var11 = (java.net.Proxy) (var10);
            try {
              L7: {
                var12 = this.a((byte) 96, var11);
                if (var12 != null) {
                  stackIn_24_0 = (java.net.Socket) (var12);
                  decompiledRegionSelector0 = 1;
                  break L7;
                } else {
                  var9++;
                  decompiledRegionSelector0 = 0;
                  break L7;
                }
              }
            } catch (oa decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var12_ref = (oa) (Object) decompiledCaughtException;
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
              return stackIn_24_0;
            }
          }
        }
    }

    final static sa a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        sa var5 = null;
        ld var6 = null;
        sa stackIn_4_0 = null;
        sa stackIn_8_0 = null;
        sa stackIn_13_0 = null;
        sa stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (-1 != (param0.length() ^ -1)) {
                  var2_int = param0.indexOf('@');
                  if ((var2_int ^ -1) == 0) {
                    stackIn_8_0 = ef.field_j;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      if (param1 == 19525) {
                        break L2;
                      } else {
                        var6 = (ld) null;
                        mn.a((byte) 26, (ld) null);
                        break L2;
                      }
                    }
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(1 + var2_int);
                    var5 = qm.a((byte) -24, var3);
                    if (var5 == null) {
                      stackIn_15_0 = oj.a(var4, (byte) 86);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_13_0 = (sa) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = mh.field_a;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("mn.E(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    final static String a(byte param0, ld param1) {
        String stackIn_30_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param0 == -30) {
                break L1;
              } else {
                var5 = (String) null;
                mn.a(-100, (String) null);
                break L1;
              }
            }
            L2: {
              if (null != param1.field_o) {
                L3: {
                  var6 = param1.field_o;
                  var2 = var6;
                  var2 = var6;
                  var2 = var6;
                  if (1 != param1.field_h) {
                    break L3;
                  } else {
                    var2 = "<img=0>" + var6;
                    break L3;
                  }
                }
                if (2 != param1.field_h) {
                  break L2;
                } else {
                  var2 = "<img=1>" + (String) (var2);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L4: {
              var3 = "";
              if (2 != param1.field_k) {
                L5: {
                  if (param1.field_k != 0) {
                    break L5;
                  } else {
                    if (dn.field_b) {
                      var3 = "[" + ja.field_c + "] ";
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (param1.field_k != 1) {
                    break L6;
                  } else {
                    var3 = "[" + oc.a(fb.field_D, new String[]{param1.field_b}, (byte) -122) + "] ";
                    break L6;
                  }
                }
                L7: {
                  if ((param1.field_k ^ -1) != -5) {
                    break L7;
                  } else {
                    if (kb.field_P == null) {
                      break L7;
                    } else {
                      var3 = "[" + kb.field_P + "] ";
                      break L7;
                    }
                  }
                }
                L8: {
                  if (-4 == (param1.field_k ^ -1)) {
                    var3 = "[#" + param1.field_b + "] ";
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (param1.field_d) {
                  break L4;
                } else {
                  var3 = var3 + (String) (var2) + ": ";
                  break L4;
                }
              } else {
                if (param1.field_d) {
                  break L4;
                } else {
                  L9: {
                    if (0 != param1.field_e) {
                      break L9;
                    } else {
                      if (-1 != (param1.field_q ^ -1)) {
                        break L9;
                      } else {
                        var3 = oc.a(vf.field_d, new String[]{(String) (var2)}, (byte) -61);
                        break L4;
                      }
                    }
                  }
                  var3 = oc.a(sa.field_d, new String[]{(String) (var2)}, (byte) -54);
                  break L4;
                }
              }
            }
            stackIn_30_0 = (String) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = var2;

            stackIn_33_1 = new StringBuilder().append("mn.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        return stackIn_30_0;
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        java.net.Socket stackIn_10_0 = null;
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
        var12 = Chess.field_G;
        try {
          L0: {
            L1: {
              var13 = new java.net.Socket(param1, param2);
              var13.setSoTimeout(10000);
              var6 = var13.getOutputStream();
              if (param0 == null) {
                var6.write(("CONNECT " + this.field_a + ":" + this.field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              } else {
                var6.write(("CONNECT " + this.field_a + ":" + this.field_c + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
            }
            L2: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
              var8 = var7.readLine();
              if (var8 != null) {
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
                      var10 = "proxy-authenticate: ";
                      var8 = var10;
                      var8 = var10;
                      var8 = var7.readLine();
                      L5: while (true) {
                        L6: {
                          if (var8 == null) {
                            break L6;
                          } else {
                            if (-51 >= (var9 ^ -1)) {
                              break L6;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var9++;
                                var8 = var7.readLine();
                                continue L5;
                              } else {
                                L7: {
                                  var14 = var8.substring(var10.length()).trim();
                                  var8 = var14;
                                  var8 = var14;
                                  var8 = var14;
                                  var11 = var14.indexOf(' ');
                                  if (0 == (var11 ^ -1)) {
                                    break L7;
                                  } else {
                                    var8 = var14.substring(0, var11);
                                    break L7;
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
                stackIn_10_0 = (java.net.Socket) (var13);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L2;
              }
            }
            L8: {
              if (param3 == 25748) {
                break L8;
              } else {
                field_i = (String) null;
                break L8;
              }
            }
            var6.close();
            var7.close();
            var13.close();
            stackIn_26_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("mn.A(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_26_0);
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_i = null;
        field_h = null;
        if (param0 != 32768) {
            ld var2 = (ld) null;
            mn.a((byte) -7, (ld) null);
        }
    }

    final static ve a(int param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_10_0 = null;
        ve stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Chess.field_G;
        try {
          L0: {
            if (null != bf.field_M) {
              if (param1 != null) {
                if (param1.length() != 0) {
                  var6 = (CharSequence) ((Object) param1);
                  var2 = ad.a(var6, param0 + param0);
                  if (var2 != null) {
                    var3 = (ve) ((Object) bf.field_M.a((long)var2.hashCode(), param0 ^ -3001));
                    L1: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) ((Object) var3.field_Fb);
                        var4 = ad.a(var7, -2);
                        if (var4.equals(var2)) {
                          stackIn_17_0 = (ve) (var3);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3 = (ve) ((Object) bf.field_M.b(true));
                          continue L1;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref);

            stackIn_22_1 = new StringBuilder().append("mn.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L2;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ve) ((Object) stackIn_10_0);
        } else {
          return stackIn_17_0;
        }
    }

    private final java.net.Socket a(byte param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_12_0 = null;
        java.net.Socket stackIn_22_0 = null;
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
        Class var14 = null;
        try {
          L0: {
            if (param1.type() != java.net.Proxy.Type.DIRECT) {
              L1: {
                if (param0 == 96) {
                  break L1;
                } else {
                  field_h = (p) null;
                  break L1;
                }
              }
              var3 = param1.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param1.type() == java.net.Proxy.Type.HTTP) {
                  var5 = null;
                  try {
                    L2: {
                      L3: {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6 = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                        if (var8 != null) {
                          var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var9.setAccessible(true);
                          if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                            var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                            var10.setAccessible(true);
                            var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var11.setAccessible(true);
                            var12 = (String) (var10.invoke(var8, new Object[]{}));
                            var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                            var5 = var12 + ": " + var13;
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
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
                  stackIn_22_0 = this.a((String) (var5), var4.getHostName(), var4.getPort(), param0 + 25652);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var5 = new java.net.Socket(param1);
                    ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_c)));
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
              stackIn_2_0 = this.a(true);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3_ref);

            stackIn_26_1 = new StringBuilder().append("mn.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_12_0);
          } else {
            return stackIn_22_0;
          }
        }
    }

    mn() {
        this.field_k = java.net.ProxySelector.getDefault();
    }

    static {
        field_l = "Show game chat from my friends";
        field_h = new p(256);
        field_i = "Month";
        field_j = "Real-life threats";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

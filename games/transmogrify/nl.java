/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class nl extends ec {
    private java.net.ProxySelector field_f;
    static String field_g;
    static boolean field_h;

    final static int a(int param0, String param1, String param2, int param3, int param4, boolean param5, String param6) {
        hg var7 = null;
        RuntimeException var7_ref = null;
        hg var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 2) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            var7 = new hg(param6);
            var8 = new hg(param1);
            stackIn_4_0 = jd.a(param4, var8, (byte) -9, param2, param0, param5, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7_ref);

            stackIn_8_1 = new StringBuilder().append("nl.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    nl() {
        try {
            this.field_f = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "nl.<init>()");
        }
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        java.net.Socket stackIn_19_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        int var5 = 0;
        Object var6 = null;
        Class var7 = null;
        Exception var7_ref = null;
        java.lang.reflect.Method var8 = null;
        Object var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        java.lang.reflect.Method var12 = null;
        String var13 = null;
        String var14 = null;
        try {
          L0: {
            if (param1.type() != java.net.Proxy.Type.DIRECT) {
              var3 = param1.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                var5 = 121 / ((-20 - param0) / 37);
                if (param1.type() != java.net.Proxy.Type.HTTP) {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var6 = new java.net.Socket(param1);
                    ((java.net.Socket) (var6)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_e)));
                    stackIn_24_0 = var6;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_26_0 = null;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  var6 = null;
                  try {
                    L1: {
                      L2: {
                        var7 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var8 = var7.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var8.setAccessible(true);
                        var9 = var8.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                        if (null != var9) {
                          var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var10.setAccessible(true);
                          if (((Boolean) (var10.invoke(var9, new Object[]{}))).booleanValue()) {
                            var11 = var7.getDeclaredMethod("getHeaderName", new Class[]{});
                            var11.setAccessible(true);
                            var12 = var7.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var12.setAccessible(true);
                            var13 = (String) (var11.invoke(var9, new Object[]{}));
                            var14 = (String) (var12.invoke(var9, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                            var6 = var13 + ": " + var14;
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
                      var7_ref = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  stackIn_19_0 = this.a(var4.getHostName(), 32, (String) (var6), var4.getPort());
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.b(-9008);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3_ref);

            stackIn_30_1 = new StringBuilder().append("nl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L4;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.net.Socket) ((Object) stackIn_24_0);
              } else {
                return (java.net.Socket) ((Object) stackIn_26_0);
              }
            }
          }
        }
    }

    private final java.net.Socket a(String param0, int param1, String param2, int param3) throws IOException {
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_47_1 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket var5 = null;
        RuntimeException var5_ref = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5 = new java.net.Socket(param0, param3);
                var5.setSoTimeout(10000);
                var6 = var5.getOutputStream();
                if (null != param2) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + this.field_a + ":" + this.field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + this.field_a + ":" + this.field_e + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var5.getInputStream())));
              var8 = var7.readLine();
              if (param1 == 32) {
                break L3;
              } else {
                this.field_f = (java.net.ProxySelector) null;
                break L3;
              }
            }
            L4: {
              if (null == var8) {
                break L4;
              } else {
                L5: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L5;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L6: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          break L6;
                        } else {
                          if (var8.startsWith("HTTP/1.1 407")) {
                            break L6;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var9 = 0;
                      var10 = "proxy-authenticate: ";
                      var8 = var7.readLine();
                      L7: while (true) {
                        L8: {
                          if (var8 == null) {
                            break L8;
                          } else {
                            if ((var9 ^ -1) <= -51) {
                              break L8;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var8 = var7.readLine();
                                var9++;
                                if (var12 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              } else {
                                L9: {
                                  var8 = var8.substring(var10.length()).trim();
                                  var11 = var8.indexOf(' ');
                                  if ((var11 ^ -1) != 0) {
                                    var8 = var8.substring(0, var11);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                throw new jd(var8);
                              }
                            }
                          }
                        }
                        throw new jd("");
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackIn_18_0 = (java.net.Socket) (var5);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var6.close();
            var7.close();
            var5.close();
            stackIn_39_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5_ref = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var5_ref);

            stackIn_43_1 = new StringBuilder().append("nl.B(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L10;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L11;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_44_0), stackIn_48_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_39_0);
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        uk var5_ref = null;
        uk var6 = null;
        String var6_ref = null;
        uk var7 = null;
        String var7_ref = null;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = nf.field_l;
              var2 = var1.d((byte) 29);
              if (param0 == -7) {
                break L1;
              } else {
                nl.d(-7);
                break L1;
              }
            }
            if (-1 != (var2 ^ -1)) {
              if (var2 == 1) {
                L2: {
                  if (sj.field_u != null) {
                    break L2;
                  } else {
                    sj.field_u = new wb(128);
                    vl.field_A = 0;
                    break L2;
                  }
                }
                L3: {
                  var3 = var1.g(12248);
                  if (!((String) (var3)).equals("")) {
                    break L3;
                  } else {
                    var3 = null;
                    break L3;
                  }
                }
                L4: {
                  var4_ref_String = var1.g(param0 + 12255);
                  var5 = var1.g(param0 + 12255);
                  var6 = mk.a(124, var4_ref_String);
                  if (var6 != null) {
                    break L4;
                  } else {
                    var6 = mk.a(param0 ^ -111, var5);
                    if (null == var6) {
                      break L4;
                    } else {
                      sj.field_u.a(19200, (long)hj.a((byte) -128, (CharSequence) ((Object) var4_ref_String)).hashCode(), var6);
                      break L4;
                    }
                  }
                }
                L5: {
                  if (null == var6) {
                    var6 = new uk();
                    sj.field_u.a(19200, (long)hj.a((byte) -128, (CharSequence) ((Object) var4_ref_String)).hashCode(), var6);
                    fieldTemp$0 = vl.field_A;
                    vl.field_A = vl.field_A + 1;
                    var6.field_hb = fieldTemp$0;
                    oa.field_k.a(var6, param0 ^ 116);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (null == var3) {
                    break L6;
                  } else {
                    var3 = ((String) (var3)).intern();
                    break L6;
                  }
                }
                var6.field_eb = var4_ref_String;
                var6.field_fb = (String) (var3);
                var6.c(param0 + 12);
                var7 = (uk) ((Object) oa.field_k.a((byte) -95));
                L7: while (true) {
                  L8: {
                    if (var7 == null) {
                      break L8;
                    } else {
                      if (!fc.a((byte) 118, var7, var6)) {
                        break L8;
                      } else {
                        var7 = (uk) ((Object) oa.field_k.a(true));
                        if (var8 == 0) {
                          continue L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if (null != var7) {
                        break L10;
                      } else {
                        oa.field_k.a(var6, param0 ^ 102);
                        if (var8 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    td.a(var7, (byte) 125, var6);
                    break L9;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (-3 != (var2 ^ -1)) {
                  if (3 != var2) {
                    if (4 != var2) {
                      d.a((Throwable) null, param0 + -117, "F1: " + ik.q(48));
                      pc.a(1);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      kl.field_c = 1;
                      var3 = var1.g(12248);
                      bd.field_v = ((String) (var3)).intern();
                      var4 = var1.d((byte) 37);
                      wc.a(param0 + 9, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    L11: {
                      if ((kl.field_c ^ -1) == -3) {
                        kl.field_c = 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  L12: {
                    if (1 == kl.field_c) {
                      kl.field_c = 2;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              L13: {
                if (rb.field_b == null) {
                  rb.field_b = new wb(128);
                  fc.field_d = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (1 != var1.d((byte) 113)) {
                  stackIn_15_0 = 0;
                  break L14;
                } else {
                  stackIn_15_0 = 1;
                  break L14;
                }
              }
              L15: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1.g(12248);
                if (var3_int != 0) {
                  var1.g(param0 ^ -12255);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                var5_ref = fi.b(var4_ref_String, (byte) 51);
                var6_ref = var1.g(12248);
                var7_ref = hj.a((byte) -128, (CharSequence) ((Object) var4_ref_String));
                if (null != var7_ref) {
                  break L16;
                } else {
                  var7_ref = var4_ref_String;
                  break L16;
                }
              }
              L17: {
                if (null != var5_ref) {
                  break L17;
                } else {
                  var5_ref = fi.b(var6_ref, (byte) 51);
                  if (null != var5_ref) {
                    rb.field_b.a(19200, (long)var7_ref.hashCode(), var5_ref);
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (var5_ref != null) {
                  break L18;
                } else {
                  var5_ref = new uk();
                  rb.field_b.a(19200, (long)var7_ref.hashCode(), var5_ref);
                  fieldTemp$1 = fc.field_d;
                  fc.field_d = fc.field_d + 1;
                  var5_ref.field_hb = fieldTemp$1;
                  re.field_C.a(var5_ref, param0 + -84);
                  break L18;
                }
              }
              var5_ref.field_eb = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "nl.C(" + param0 + ')');
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
                  return;
                }
              }
            }
          }
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        int stackIn_8_0 = 0;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        String stackIn_13_4 = null;
        java.net.ProxySelector stackIn_16_0;
        java.net.URI stackIn_16_1;
        java.net.URI stackIn_16_2;
        StringBuilder stackIn_16_3;
        java.net.ProxySelector stackIn_17_0;
        java.net.URI stackIn_17_1;
        java.net.URI stackIn_17_2;
        StringBuilder stackIn_17_3;
        String stackIn_17_4;
        java.net.Socket stackIn_20_0 = null;
        java.net.Socket stackIn_32_0 = null;
        java.net.Socket stackIn_41_0 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        jd var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
              if (var2_int != 0) {
                break L1;
              } else {
                System.setProperty("java.net.useSystemProxies", "true");
                break L1;
              }
            }
            L2: {
              if (-444 != (this.field_e ^ -1)) {
                stackIn_8_0 = 0;
                break L2;
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            var5 = stackIn_8_0;
            try {
              L3: {
                L4: {
                  stackIn_12_0 = this.field_f;

                  stackIn_12_1 = null;

                  stackIn_12_2 = null;

                  stackIn_12_3 = new StringBuilder();

                  if (var5 != 0) {
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
                L5: {
                  var3 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + this.field_a));
                  stackIn_16_0 = this.field_f;

                  stackIn_16_1 = null;

                  stackIn_16_2 = null;

                  stackIn_16_3 = new StringBuilder();

                  if (var5 != 0) {
                    stackIn_17_0 = (java.net.ProxySelector) ((Object) stackIn_16_0);
                    stackIn_17_1 = null;
                    stackIn_17_2 = null;
                    stackIn_17_3 = (StringBuilder) ((Object) stackIn_16_3);
                    stackIn_17_4 = "http";
                    break L5;
                  } else {
                    stackIn_17_0 = (java.net.ProxySelector) ((Object) stackIn_16_0);
                    stackIn_17_1 = null;
                    stackIn_17_2 = null;
                    stackIn_17_3 = (StringBuilder) ((Object) stackIn_16_3);
                    stackIn_17_4 = "https";
                    break L5;
                  }
                }
                var4 = ((java.net.ProxySelector) (Object) stackIn_17_0).select(new java.net.URI(stackIn_17_4 + "://" + this.field_a));
                break L3;
              }
            } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
              stackIn_20_0 = this.b(-9008);
              return stackIn_20_0;
            }
            L6: {
              var3.addAll((Collection) ((Object) var4));
              var6_array = var3.toArray();
              var7 = null;
              var8 = var6_array;
              if (param0 <= -41) {
                break L6;
              } else {
                field_g = (String) null;
                break L6;
              }
            }
            var9 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if (var8.length <= var9) {
                    break L9;
                  } else {
                    var10 = var8[var9];
                    var11 = (java.net.Proxy) (var10);
                    try {
                      L10: {
                        var12 = this.a(-82, var11);
                        stackIn_41_0 = (java.net.Socket) (var12);

                        if (var13 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L10;
                        } else {
                          if (stackIn_41_0 == null) {
                            decompiledRegionSelector0 = 2;
                            break L10;
                          } else {
                            stackIn_32_0 = (java.net.Socket) (var12);
                            decompiledRegionSelector0 = 1;
                            break L10;
                          }
                        }
                      }
                    } catch (jd decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L11: {
                        var12_ref = (jd) (Object) decompiledCaughtException;
                        var7 = var12_ref;
                        decompiledRegionSelector0 = 2;
                        break L11;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L12: {
                        var12_ref2 = (IOException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 2;
                        break L12;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      break L8;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        decompiledRegionSelector1 = 1;
                        break L0;
                      } else {
                        var9++;
                        if (var13 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                if (var7 == null) {
                  stackIn_41_0 = this.b(-9008);
                  break L8;
                } else {
                  throw nl.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
                }
              }
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "nl.D(" + param0 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_41_0;
        } else {
          return stackIn_32_0;
        }
    }

    public static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 < -85) {
                break L1;
              } else {
                field_h = false;
                break L1;
              }
            }
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "nl.E(" + param0 + ')');
        }
    }

    static {
        field_g = "<u>Tutorial complete<br>Press 'ENTER' or click the button to continue from here, or press 'ESC' to return to the main menu.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

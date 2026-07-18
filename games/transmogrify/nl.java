/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.Socket;
import java.net.ProxySelector;
import java.net.URI;

final class nl extends ec {
    private java.net.ProxySelector field_f;
    static String field_g;
    static boolean field_h;

    final static int a(int param0, String param1, String param2, int param3, int param4, boolean param5, String param6) {
        RuntimeException var7 = null;
        hg var7_ref = null;
        hg var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var7_ref = new hg(param6);
            var8 = new hg(param1);
            stackOut_3_0 = jd.a(param4, var8, (byte) -9, param2, param0, param5, var7_ref);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("nl.F(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param6 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    nl() {
        try {
            ((nl) this).field_f = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "nl.<init>()");
        }
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        RuntimeException var3 = null;
        java.net.SocketAddress var3_ref = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        Exception var7 = null;
        Class var7_ref = null;
        java.lang.reflect.Method var8 = null;
        Object var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        java.lang.reflect.Method var12 = null;
        String var13 = null;
        String var14 = null;
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        java.net.Socket stackIn_19_0 = null;
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
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        java.net.Socket stackOut_18_0 = null;
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
            if (param1.type() != java.net.Proxy.Type.DIRECT) {
              var3_ref = param1.address();
              if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                var4_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                var5 = 121;
                if (param1.type() != java.net.Proxy.Type.HTTP) {
                  if (param1.type() == java.net.Proxy.Type.SOCKS) {
                    var6 = (Object) (Object) new java.net.Socket(param1);
                    ((java.net.Socket) var6).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((nl) this).field_a, ((nl) this).field_e));
                    stackOut_23_0 = var6;
                    stackIn_24_0 = stackOut_23_0;
                    return (java.net.Socket) (Object) stackIn_24_0;
                  } else {
                    stackOut_25_0 = null;
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  }
                } else {
                  var6 = null;
                  try {
                    L1: {
                      L2: {
                        var7_ref = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var8 = var7_ref.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var8.setAccessible(true);
                        var9 = var8.invoke((Object) null, new Object[2]);
                        if (null != var9) {
                          var10 = var7_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                          var10.setAccessible(true);
                          if (((Boolean) var10.invoke(var9, new Object[0])).booleanValue()) {
                            var11 = var7_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                            var11.setAccessible(true);
                            var12 = var7_ref.getDeclaredMethod("getHeaderValue", new Class[2]);
                            var12.setAccessible(true);
                            var13 = (String) var11.invoke(var9, new Object[0]);
                            var14 = (String) var12.invoke(var9, new Object[2]);
                            var6 = (Object) (Object) (var13 + ": " + var14);
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
                      var7 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  stackOut_18_0 = this.a(var4_ref.getHostName(), 32, (String) var6, var4_ref.getPort());
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (java.net.Socket) (Object) stackIn_6_0;
              }
            } else {
              stackOut_1_0 = ((nl) this).b(-9008);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("nl.A(").append(-82).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return (java.net.Socket) (Object) stackIn_26_0;
    }

    private final java.net.Socket a(String param0, int param1, String param2, int param3) throws IOException {
        RuntimeException var5 = null;
        java.net.Socket var5_ref = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_17_0 = null;
        Object stackOut_38_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5_ref = new java.net.Socket(param0, param3);
                var5_ref.setSoTimeout(10000);
                var6 = var5_ref.getOutputStream();
                if (null != param2) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + ((nl) this).field_a + ":" + ((nl) this).field_e + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + ((nl) this).field_a + ":" + ((nl) this).field_e + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            var6.flush();
            var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var5_ref.getInputStream()));
            var8 = var7.readLine();
            L3: {
              if (null == var8) {
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
                          if (var8.startsWith("HTTP/1.1 407")) {
                            break L5;
                          } else {
                            break L3;
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
                            if (var9 >= 50) {
                              break L7;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var8 = var7.readLine();
                                var9++;
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
                                throw new jd(var8);
                              }
                            }
                          }
                        }
                        throw new jd("");
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
            stackOut_38_0 = null;
            stackIn_39_0 = stackOut_38_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var5;
            stackOut_40_1 = new StringBuilder().append("nl.B(");
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L9;
            }
          }
          L10: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(32).append(',');
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L10;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L10;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param3 + ')');
        }
        return (java.net.Socket) (Object) stackIn_39_0;
    }

    final static void a() {
        RuntimeException var1 = null;
        hj var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        uk var5_ref = null;
        uk var6 = null;
        String var6_ref = null;
        String var7 = null;
        uk var7_ref = null;
        int var8 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var1_ref = nf.field_l;
            var2 = var1_ref.d((byte) 29);
            if (var2 != 0) {
              if (var2 == 1) {
                L1: {
                  if (sj.field_u != null) {
                    break L1;
                  } else {
                    sj.field_u = new wb(128);
                    vl.field_A = 0;
                    break L1;
                  }
                }
                L2: {
                  var3 = var1_ref.g(12248);
                  if (!var3.equals((Object) (Object) "")) {
                    break L2;
                  } else {
                    var3 = null;
                    break L2;
                  }
                }
                L3: {
                  var4_ref_String = var1_ref.g(12248);
                  var5 = var1_ref.g(12248);
                  var6 = mk.a(124, var4_ref_String);
                  if (var6 != null) {
                    break L3;
                  } else {
                    var6 = mk.a(104, var5);
                    if (null == var6) {
                      break L3;
                    } else {
                      sj.field_u.a(19200, (long)hj.a((byte) -128, (CharSequence) (Object) var4_ref_String).hashCode(), (ri) (Object) var6);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null == var6) {
                    var6 = new uk();
                    sj.field_u.a(19200, (long)hj.a((byte) -128, (CharSequence) (Object) var4_ref_String).hashCode(), (ri) (Object) var6);
                    int fieldTemp$7 = vl.field_A;
                    vl.field_A = vl.field_A + 1;
                    var6.field_hb = fieldTemp$7;
                    oa.field_k.a((wf) (Object) var6, -115);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (null == var3) {
                    break L5;
                  } else {
                    var3 = var3.intern();
                    break L5;
                  }
                }
                var6.field_eb = var4_ref_String;
                var6.field_fb = var3;
                var6.c(5);
                var7_ref = (uk) (Object) oa.field_k.a((byte) -95);
                L6: while (true) {
                  L7: {
                    if (var7_ref == null) {
                      break L7;
                    } else {
                      if (!fc.a((byte) 118, var7_ref, var6)) {
                        break L7;
                      } else {
                        var7_ref = (uk) (Object) oa.field_k.a(true);
                        if (var8 == 0) {
                          continue L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (null != var7_ref) {
                        break L9;
                      } else {
                        oa.field_k.a((wf) (Object) var6, -97);
                        if (var8 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    td.a((wf) (Object) var7_ref, (byte) 125, (wf) (Object) var6);
                    break L8;
                  }
                  return;
                }
              } else {
                if (var2 != 2) {
                  if (3 != var2) {
                    if (4 != var2) {
                      int discarded$8 = 48;
                      d.a((Throwable) null, -124, "F1: " + ik.q());
                      int discarded$9 = 1;
                      pc.a();
                      break L0;
                    } else {
                      kl.field_c = 1;
                      var3 = var1_ref.g(12248);
                      bd.field_v = var3.intern();
                      var4 = var1_ref.d((byte) 37);
                      wc.a(2, var4);
                      return;
                    }
                  } else {
                    L10: {
                      if (kl.field_c == 2) {
                        kl.field_c = 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  L11: {
                    if (1 == kl.field_c) {
                      kl.field_c = 2;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                }
              }
            } else {
              L12: {
                if (rb.field_b == null) {
                  rb.field_b = new wb(128);
                  fc.field_d = 0;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (1 != var1_ref.d((byte) 113)) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L13;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_15_0 = stackOut_12_0;
                  break L13;
                }
              }
              L14: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1_ref.g(12248);
                if (var3_int != 0) {
                  String discarded$10 = var1_ref.g(12248);
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                int discarded$11 = 51;
                var5_ref = fi.b(var4_ref_String);
                var6_ref = var1_ref.g(12248);
                var7 = hj.a((byte) -128, (CharSequence) (Object) var4_ref_String);
                if (null != var7) {
                  break L15;
                } else {
                  var7 = var4_ref_String;
                  break L15;
                }
              }
              L16: {
                if (null != var5_ref) {
                  break L16;
                } else {
                  int discarded$12 = 51;
                  var5_ref = fi.b(var6_ref);
                  if (null != var5_ref) {
                    rb.field_b.a(19200, (long)var7.hashCode(), (ri) (Object) var5_ref);
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (var5_ref != null) {
                  break L17;
                } else {
                  var5_ref = new uk();
                  rb.field_b.a(19200, (long)var7.hashCode(), (ri) (Object) var5_ref);
                  int fieldTemp$13 = fc.field_d;
                  fc.field_d = fc.field_d + 1;
                  var5_ref.field_hb = fieldTemp$13;
                  re.field_C.a((wf) (Object) var5_ref, -91);
                  break L17;
                }
              }
              var5_ref.field_eb = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "nl.C(" + -7 + ')');
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
        Object var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        jd var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_8_0 = 0;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        String stackIn_13_4 = null;
        java.net.ProxySelector stackIn_14_0 = null;
        java.net.URI stackIn_14_1 = null;
        java.net.URI stackIn_14_2 = null;
        StringBuilder stackIn_14_3 = null;
        java.net.ProxySelector stackIn_16_0 = null;
        java.net.URI stackIn_16_1 = null;
        java.net.URI stackIn_16_2 = null;
        StringBuilder stackIn_16_3 = null;
        java.net.ProxySelector stackIn_17_0 = null;
        java.net.URI stackIn_17_1 = null;
        java.net.URI stackIn_17_2 = null;
        StringBuilder stackIn_17_3 = null;
        String stackIn_17_4 = null;
        java.net.Socket stackIn_20_0 = null;
        java.net.Socket stackIn_28_0 = null;
        java.net.Socket stackIn_32_0 = null;
        java.net.Socket stackIn_41_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.ProxySelector stackOut_13_0 = null;
        java.net.URI stackOut_13_1 = null;
        java.net.URI stackOut_13_2 = null;
        StringBuilder stackOut_13_3 = null;
        java.net.ProxySelector stackOut_16_0 = null;
        java.net.URI stackOut_16_1 = null;
        java.net.URI stackOut_16_2 = null;
        StringBuilder stackOut_16_3 = null;
        String stackOut_16_4 = null;
        java.net.ProxySelector stackOut_14_0 = null;
        java.net.URI stackOut_14_1 = null;
        java.net.URI stackOut_14_2 = null;
        StringBuilder stackOut_14_3 = null;
        String stackOut_14_4 = null;
        java.net.Socket stackOut_19_0 = null;
        java.net.Socket stackOut_27_0 = null;
        java.net.Socket stackOut_31_0 = null;
        java.net.Socket stackOut_40_0 = null;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
              if (var2_int != 0) {
                break L1;
              } else {
                String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                break L1;
              }
            }
            L2: {
              if (((nl) this).field_e != 443) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            var5 = stackIn_8_0;
            try {
              L3: {
                L4: {
                  stackOut_9_0 = ((nl) this).field_f;
                  stackOut_9_1 = null;
                  stackOut_9_2 = null;
                  stackOut_9_3 = new StringBuilder();
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1;
                  stackIn_12_2 = stackOut_9_2;
                  stackIn_12_3 = stackOut_9_3;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  stackIn_10_3 = stackOut_9_3;
                  if (var5 != 0) {
                    stackOut_12_0 = (java.net.ProxySelector) (Object) stackIn_12_0;
                    stackOut_12_1 = null;
                    stackOut_12_2 = null;
                    stackOut_12_3 = (StringBuilder) (Object) stackIn_12_3;
                    stackOut_12_4 = "https";
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    break L4;
                  } else {
                    stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                    stackOut_10_1 = null;
                    stackOut_10_2 = null;
                    stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                    stackOut_10_4 = "http";
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_13_1 = stackOut_10_1;
                    stackIn_13_2 = stackOut_10_2;
                    stackIn_13_3 = stackOut_10_3;
                    stackIn_13_4 = stackOut_10_4;
                    break L4;
                  }
                }
                L5: {
                  var3 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + ((nl) this).field_a));
                  stackOut_13_0 = ((nl) this).field_f;
                  stackOut_13_1 = null;
                  stackOut_13_2 = null;
                  stackOut_13_3 = new StringBuilder();
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_16_2 = stackOut_13_2;
                  stackIn_16_3 = stackOut_13_3;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  if (var5 != 0) {
                    stackOut_16_0 = (java.net.ProxySelector) (Object) stackIn_16_0;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = (StringBuilder) (Object) stackIn_16_3;
                    stackOut_16_4 = "http";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    stackIn_17_4 = stackOut_16_4;
                    break L5;
                  } else {
                    stackOut_14_0 = (java.net.ProxySelector) (Object) stackIn_14_0;
                    stackOut_14_1 = null;
                    stackOut_14_2 = null;
                    stackOut_14_3 = (StringBuilder) (Object) stackIn_14_3;
                    stackOut_14_4 = "https";
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_17_1 = stackOut_14_1;
                    stackIn_17_2 = stackOut_14_2;
                    stackIn_17_3 = stackOut_14_3;
                    stackIn_17_4 = stackOut_14_4;
                    break L5;
                  }
                }
                var4 = ((java.net.ProxySelector) (Object) stackIn_17_0).select(new java.net.URI(stackIn_17_4 + "://" + ((nl) this).field_a));
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
              stackOut_19_0 = ((nl) this).b(-9008);
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0;
            }
            L6: {
              boolean discarded$3 = var3.addAll((Collection) (Object) var4);
              var6_array = var3.toArray();
              var7 = null;
              var8_array = var6_array;
              if (param0 <= -41) {
                break L6;
              } else {
                field_g = null;
                break L6;
              }
            }
            var9 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if (var8_array.length <= var9) {
                    break L9;
                  } else {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    try {
                      L10: {
                        var12_ref2 = this.a(-82, var11);
                        stackOut_27_0 = (java.net.Socket) var12_ref2;
                        stackIn_41_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if (var13 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L10;
                        } else {
                          if (stackIn_28_0 == null) {
                            decompiledRegionSelector0 = 2;
                            break L10;
                          } else {
                            stackOut_31_0 = (java.net.Socket) var12_ref2;
                            stackIn_32_0 = stackOut_31_0;
                            decompiledRegionSelector0 = 1;
                            break L10;
                          }
                        }
                      }
                    } catch (java.io.IOException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L12: {
                        var12_ref = (IOException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 2;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L11: {
                        var12 = (jd) (Object) decompiledCaughtException;
                        var7 = (Object) (Object) var12;
                        decompiledRegionSelector0 = 2;
                        break L11;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      break L8;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        return stackIn_32_0;
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
                  stackOut_40_0 = ((nl) this).b(-9008);
                  stackIn_41_0 = stackOut_40_0;
                  break L8;
                } else {
                  throw nl.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "nl.D(" + param0 + ')');
        }
        return stackIn_41_0;
    }

    public static void d() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "nl.E(" + -114 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<u>Tutorial complete<br>Press 'ENTER' or click the button to continue from here, or press 'ESC' to return to the main menu.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

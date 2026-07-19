/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class kf extends dl {
    static java.security.SecureRandom field_j;
    static cj field_i;
    private java.net.ProxySelector field_l;
    static String field_k;

    final static java.net.URL a(String param0, int param1, byte param2, String param3, java.net.URL param4) {
        try {
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            StringBuilder discarded$18 = null;
            StringBuilder discarded$19 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            java.net.URL stackIn_46_0 = null;
            java.net.URL stackIn_48_0 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            String stackIn_55_2 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            RuntimeException stackIn_57_0 = null;
            StringBuilder stackIn_57_1 = null;
            RuntimeException stackIn_58_0 = null;
            StringBuilder stackIn_58_1 = null;
            String stackIn_58_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            boolean stackOut_9_0 = false;
            java.net.URL stackOut_45_0 = null;
            java.net.URL stackOut_47_0 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            RuntimeException stackOut_55_0 = null;
            StringBuilder stackOut_55_1 = null;
            RuntimeException stackOut_57_0 = null;
            StringBuilder stackOut_57_1 = null;
            String stackOut_57_2 = null;
            RuntimeException stackOut_56_0 = null;
            StringBuilder stackOut_56_1 = null;
            String stackOut_56_2 = null;
            var9 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                var5_ref = param4.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        stackOut_3_0 = var7_int;
                        stackIn_10_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var9 != 0) {
                          break L2;
                        } else {
                          if (stackIn_4_0 >= 0) {
                            L4: {
                              if (-1 < (param1 ^ -1)) {
                                break L4;
                              } else {
                                var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                                if (var9 == 0) {
                                  continue L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var6 = var7_int;
                            if (var9 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_9_0 = var5_ref.regionMatches(var6, "/a=", 0, 3);
                    stackIn_10_0 = stackOut_9_0 ? 1 : 0;
                    break L2;
                  }
                  L5: {
                    if (stackIn_10_0 == 0) {
                      break L5;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        var6 = var7_int;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L6;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 > var7_int) {
                        break L6;
                      } else {
                        L7: {
                          if (param3 != null) {
                            break L7;
                          } else {
                            var6 = var7_int;
                            if (var9 == 0) {
                              continue L1;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L9;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      L10: {
                        if (param0 == null) {
                          break L10;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var6 = var7_int;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L11: {
                    var7 = new StringBuilder(var6);
                    discarded$10 = var7.append(var5_ref.substring(0, var6));
                    if (-1 > (param1 ^ -1)) {
                      discarded$11 = var7.append("/l=");
                      discarded$12 = var7.append(Integer.toString(param1));
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (param3 == null) {
                      break L12;
                    } else {
                      if (param3.length() > 0) {
                        discarded$13 = var7.append("/p=");
                        discarded$14 = var7.append(param3);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (param0 == null) {
                      break L13;
                    } else {
                      if (0 < param0.length()) {
                        discarded$15 = var7.append("/s=");
                        discarded$16 = var7.append(param0);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var5_ref.length() > var6) {
                      discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L14;
                    } else {
                      discarded$18 = var7.append('/');
                      if (var9 == 0) {
                        break L14;
                      } else {
                        discarded$19 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (param2 > 107) {
                      break L15;
                    } else {
                      field_k = (String) null;
                      break L15;
                    }
                  }
                  try {
                    L16: {
                      stackOut_45_0 = new java.net.URL(param4, var7.toString());
                      stackIn_46_0 = stackOut_45_0;
                      break L16;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_47_0 = (java.net.URL) (param4);
                    stackIn_48_0 = stackOut_47_0;
                    return stackIn_48_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L17: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_49_0 = (RuntimeException) (var5);
                stackOut_49_1 = new StringBuilder().append("kf.A(");
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param0 == null) {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L17;
                } else {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L17;
                }
              }
              L18: {
                stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_54_0 = stackOut_52_0;
                stackIn_54_1 = stackOut_52_1;
                stackIn_53_0 = stackOut_52_0;
                stackIn_53_1 = stackOut_52_1;
                if (param3 == null) {
                  stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
                  stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackOut_54_2 = "null";
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  stackIn_55_2 = stackOut_54_2;
                  break L18;
                } else {
                  stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                  stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackOut_53_2 = "{...}";
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  stackIn_55_2 = stackOut_53_2;
                  break L18;
                }
              }
              L19: {
                stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
                stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');
                stackIn_57_0 = stackOut_55_0;
                stackIn_57_1 = stackOut_55_1;
                stackIn_56_0 = stackOut_55_0;
                stackIn_56_1 = stackOut_55_1;
                if (param4 == null) {
                  stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
                  stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
                  stackOut_57_2 = "null";
                  stackIn_58_0 = stackOut_57_0;
                  stackIn_58_1 = stackOut_57_1;
                  stackIn_58_2 = stackOut_57_2;
                  break L19;
                } else {
                  stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
                  stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
                  stackOut_56_2 = "{...}";
                  stackIn_58_0 = stackOut_56_0;
                  stackIn_58_1 = stackOut_56_1;
                  stackIn_58_2 = stackOut_56_2;
                  break L19;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
            }
            return stackIn_46_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param3 + 485 + (8 - -param2) + 10;
              qe.field_q.a(-6 + dq.field_k.field_z, 3, var6_int - 6, 3, -3344);
              var7 = qe.field_q.field_z - 5;
              ek.field_z.a(param5, var7 - param5, param2 + 487 + param3, 5, param0 ^ -3342);
              ec.field_b.a(param5, 0, -ua.field_E.field_zb + (ek.field_z.field_zb - param2), param2, -3344);
              ua.field_E.a(param5, 0, ua.field_E.field_zb, param2 + ec.field_b.field_zb, param0 + -3346);
              var7 = var7 - (2 + param5);
              tn.field_A.a(param3, 2, param3 + (param0 + param2) + 485, 5, var7 - 5, param0 ^ -31467, 5);
              if (ra.field_f == null) {
                break L1;
              } else {
                ra.field_f.b(tn.field_A.field_x, tn.field_A.field_Q, 28972, tn.field_A.field_zb, tn.field_A.field_z);
                break L1;
              }
            }
            var8 = -var6_int + -param2 + dq.field_k.field_zb;
            var9 = var8 / 2;
            var10 = param2 + param1 + var9;
            var11 = 0;
            var12 = 0;
            L2: while (true) {
              L3: {
                if ((var12 ^ -1) <= -7) {
                  break L3;
                } else {
                  if (var14 == 0) {
                    L4: {
                      L5: {
                        if (5 <= var12) {
                          break L5;
                        } else {
                          if (la.field_h[var12] != null) {
                            break L5;
                          } else {
                            if (var14 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        var13 = (2 + (-6 + dq.field_k.field_z)) * var11 / (1 + gi.field_l) + 3;
                        var11++;
                        var7 = var11 * (dq.field_k.field_z + -4) / (1 + gi.field_l) + (1 + -var13);
                        if (5 > var12) {
                          break L6;
                        } else {
                          nn.field_b.a(var7, var13, var8, var6_int, -3344);
                          if (var14 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      la.field_h[var12].a(var7, var13, var8, var6_int, param0 ^ -3342);
                      ij.field_k[var12].a(var7, 0, var9 - param2, param2, param0 ^ -3342);
                      pf.field_d[var12].a(-param4 + var7 - param4, param4, param1, var9, -3344);
                      hh.field_l[var12].a(-param4 + var7 - param4, param4, var8 - (param2 - -var10), var10, -3344);
                      break L4;
                    }
                    var12++;
                    if (var14 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6), "kf.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != 3) {
            return;
        }
        field_j = null;
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
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
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        java.net.Socket stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        java.net.Socket stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        java.net.Socket stackOut_21_0 = null;
        Object stackOut_12_0 = null;
        java.net.Socket stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        java.net.Socket stackOut_1_0 = null;
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
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3_ref = param0.address();
              if ((Object) var3_ref instanceof java.net.InetSocketAddress) {
                var4_ref = (java.net.InetSocketAddress) ((Object) var3_ref);
                if (param1 == 1) {
                  if (param0.type() == java.net.Proxy.Type.HTTP) {
                    var5 = null;
                    try {
                      L1: {
                        L2: {
                          var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                          var6_ref = var14;
                          var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                          var7.setAccessible(true);
                          var8 = var7.invoke((Object) null, new Object[]{var4_ref.getHostName(), new Integer(var4_ref.getPort())});
                          if (var8 != null) {
                            var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                            var9.setAccessible(true);
                            if (!((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                              break L2;
                            } else {
                              var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[]{});
                              var10.setAccessible(true);
                              var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                              var11.setAccessible(true);
                              var12 = (String) (var10.invoke(var8, new Object[]{}));
                              var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_b + "/"), "https"}));
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
                        var6 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    stackOut_21_0 = this.a((byte) -96, var4_ref.getHostName(), var4_ref.getPort(), (String) (var5));
                    stackIn_22_0 = stackOut_21_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                      var5 = new java.net.Socket(param0);
                      ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_f)));
                      stackOut_12_0 = var5;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_7_0 = (java.net.Socket) null;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = this.b((byte) 100);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("kf.B(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.net.Socket) ((Object) stackIn_13_0);
              } else {
                return stackIn_22_0;
              }
            }
          }
        }
    }

    private final java.net.Socket a(byte param0, String param1, int param2, String param3) throws IOException {
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
        java.net.Socket stackIn_3_0 = null;
        java.net.Socket stackIn_13_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_12_0 = null;
        Object stackOut_28_0 = null;
        java.net.Socket stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 <= -25) {
              L1: {
                L2: {
                  var13 = new java.net.Socket(param1, param2);
                  var13.setSoTimeout(10000);
                  var6 = var13.getOutputStream();
                  if (param3 == null) {
                    break L2;
                  } else {
                    var6.write(("CONNECT " + this.field_b + ":" + this.field_f + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                    if (var12 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6.write(("CONNECT " + this.field_b + ":" + this.field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
              L3: {
                var6.flush();
                var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
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
                              if (50 <= var9) {
                                break L7;
                              } else {
                                if (var8.toLowerCase().startsWith(var10)) {
                                  L8: {
                                    var14 = var8.substring(var10.length()).trim();
                                    var8 = var14;
                                    var11 = var14.indexOf(' ');
                                    if (0 != (var11 ^ -1)) {
                                      var8 = var14.substring(0, var11);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  throw new en(var8);
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
                          throw new en("");
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_12_0 = (java.net.Socket) (var13);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              var6.close();
              var7.close();
              var13.close();
              stackOut_28_0 = null;
              stackIn_29_0 = stackOut_28_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_2_0 = (java.net.Socket) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var5);
            stackOut_30_1 = new StringBuilder().append("kf.D(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          L10: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_29_0);
          }
        }
    }

    kf() {
        this.field_l = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket b(int param0) throws IOException {
        String discarded$2 = null;
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
        en var12 = null;
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
        Object stackIn_21_0 = null;
        java.net.Socket stackIn_23_0 = null;
        Object stackIn_28_0 = null;
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
        Object stackOut_20_0 = null;
        java.net.Socket stackOut_22_0 = null;
        Object stackOut_27_0 = null;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 4646) {
            break L0;
          } else {
            kf.a(-21, 110, 106, 109, 24, -20);
            break L0;
          }
        }
        L1: {
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L1;
          } else {
            discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
            break L1;
          }
        }
        L2: {
          if (-444 != (this.field_f ^ -1)) {
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
              stackOut_8_0 = this.field_l;
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
                stackOut_10_0 = (java.net.ProxySelector) ((Object) stackIn_10_0);
                stackOut_10_1 = null;
                stackOut_10_2 = null;
                stackOut_10_3 = (StringBuilder) ((Object) stackIn_10_3);
                stackOut_10_4 = "http";
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = stackOut_10_3;
                stackIn_11_4 = stackOut_10_4;
                break L4;
              } else {
                stackOut_9_0 = (java.net.ProxySelector) ((Object) stackIn_9_0);
                stackOut_9_1 = null;
                stackOut_9_2 = null;
                stackOut_9_3 = (StringBuilder) ((Object) stackIn_9_3);
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
              var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(stackIn_11_4 + "://" + this.field_b));
              stackOut_11_0 = this.field_l;
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
                stackOut_13_0 = (java.net.ProxySelector) ((Object) stackIn_13_0);
                stackOut_13_1 = null;
                stackOut_13_2 = null;
                stackOut_13_3 = (StringBuilder) ((Object) stackIn_13_3);
                stackOut_13_4 = "http";
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                stackIn_14_3 = stackOut_13_3;
                stackIn_14_4 = stackOut_13_4;
                break L5;
              } else {
                stackOut_12_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                stackOut_12_1 = null;
                stackOut_12_2 = null;
                stackOut_12_3 = (StringBuilder) ((Object) stackIn_12_3);
                stackOut_12_4 = "https";
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                stackIn_14_4 = stackOut_12_4;
                break L5;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + this.field_b));
            break L3;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b((byte) 97);
        }
        boolean discarded$3 = var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8_array = var6_array;
        var9 = 0;
        L6: while (true) {
          L7: {
            L8: {
              if (var9 >= var8_array.length) {
                break L8;
              } else {
                var10 = var8_array[var9];
                var11 = (java.net.Proxy) (var10);
                try {
                  L9: {
                    var12_ref2 = this.a(var11, 1);
                    stackOut_20_0 = null;
                    stackIn_28_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (var13 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L9;
                    } else {
                      if (stackIn_21_0 == var12_ref2) {
                        decompiledRegionSelector0 = 1;
                        break L9;
                      } else {
                        stackOut_22_0 = (java.net.Socket) (var12_ref2);
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 2;
                        break L9;
                      }
                    }
                  }
                } catch (en decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L10: {
                    var12 = (en) (Object) decompiledCaughtException;
                    var7 = var12;
                    decompiledRegionSelector0 = 1;
                    break L10;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L11: {
                    var12_ref = (IOException) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L11;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  break L7;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    var9++;
                    if (var13 == 0) {
                      continue L6;
                    } else {
                      break L8;
                    }
                  } else {
                    return stackIn_23_0;
                  }
                }
              }
            }
            stackOut_27_0 = null;
            stackIn_28_0 = stackOut_27_0;
            break L7;
          }
          if (stackIn_28_0 != var7) {
            throw kf.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
          } else {
            return this.b((byte) 89);
          }
        }
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_c;
    static int field_a;
    static wd field_b;

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            try {
                lj.field_g = param2;
                try {
                    if (param0 != 376) {
                        field_b = (wd) null;
                    }
                    var6 = param1.getParameter("cookieprefix");
                    var5 = var6;
                    var5 = var6;
                    var4 = param1.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                    var5 = var7;
                    var5 = var7;
                    if (0 == param2.length()) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var5 = var7 + "; Expires=" + wd.a((byte) -116, lj.a((byte) -75) - -94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    eb.a("document.cookie=\"" + var5 + "\"", -28924, param1);
                } catch (Throwable throwable) {
                }
                bf.a(32010, param1);
            } catch (RuntimeException runtimeException) {
                throw pf.a((Throwable) ((Object) runtimeException), "ea.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6 = -85 % ((-40 - param1) / 46);
        param4 = param4 * 16;
        param5 = param5 * 16;
        param2 = param2 * 16;
        param3 = param3 * 16;
        gb.g(param5 + -4, param2 + -4, param4, param3, 16711680, param0 + 96);
        gb.e(param5 + -4, param2 - 4, param4, param3, 16711680, param0 + 128);
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        if (param0 < 111) {
            return;
        }
        try {
            param1.addKeyListener(rh.field_f);
            param1.addFocusListener(rh.field_f);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ea.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -25 % ((-34 - param0) / 53);
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            String var4 = null;
            Object[] var5 = null;
            L0: {
              if (param0 == 8216) {
                break L0;
              } else {
                var4 = (String) null;
                ea.a(50, (java.applet.Applet) null, (String) null);
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 != null) {
                    try {
                      L3: {
                        var2 = Runtime.getRuntime();
                        var5 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                        kf.field_k = 1 + (int)(var3.longValue() / 1048576L);
                        break L3;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var2_ref = decompiledCaughtException;
                        break L4;
                      }
                    }
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
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
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 == -18428) {
                break L1;
              } else {
                ea.a(107, (byte) 40, -41, 107, -6, 86);
                break L1;
              }
            }
            var3 = new byte[var2_int];
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
                      if (0 >= var5) {
                        break L5;
                      } else {
                        if (var5 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (160 > var5) {
                        break L6;
                      } else {
                        if (var5 > 255) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 != 8218) {
                        if (var5 != 402) {
                          if (var5 != 8222) {
                            if (var5 != 8230) {
                              if (8224 != var5) {
                                if (var5 == 8225) {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                } else {
                                  if (710 == var5) {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  } else {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var5 != 352) {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var5 != 338) {
                                            if (var5 == 381) {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (8216 == var5) {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var5 != 8220) {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (var5 != 8211) {
                                                          if (var5 == 8212) {
                                                            var3[var4] = (byte)-105;
                                                            break L3;
                                                          } else {
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
                                                                      if (382 == var5) {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)-97;
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
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        }
                                                      }
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
                          } else {
                            var3[var4] = (byte)-124;
                            break L3;
                          }
                        } else {
                          var3[var4] = (byte)-125;
                          break L3;
                        }
                      } else {
                        var3[var4] = (byte)-126;
                        break L3;
                      }
                    } else {
                      var3[var4] = (byte)-128;
                      break L3;
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

            stackIn_72_1 = new StringBuilder().append("ea.C(").append(param0).append(',');

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
          throw pf.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        return stackIn_69_0;
    }

    static {
        field_c = "They cannot be placed where any fleas are standing. Hold the mouse button, and the tile will be placed as soon as the fleas have gone.";
        field_b = new wd();
    }
}

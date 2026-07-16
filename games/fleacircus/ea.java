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
            lj.field_g = param2;
            try {
                if (param0 != 376) {
                    field_b = null;
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
        param1.addKeyListener((java.awt.event.KeyListener) (Object) rh.field_f);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) rh.field_f);
    }

    public static void a(byte param0) {
        int var1 = -25 % ((-34 - param0) / 53);
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Object var5 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == 8216) {
                break L0;
              } else {
                var4 = null;
                ea.a(50, (java.applet.Applet) null, (String) null);
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref != null) {
                    try {
                      L3: {
                        var2_ref = Runtime.getRuntime();
                        var5 = null;
                        var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                        kf.field_k = 1 + (int)(var3.longValue() / 1048576L);
                        break L3;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var2 = decompiledCaughtException;
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
                var1 = (Exception) (Object) decompiledCaughtException;
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
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = fleas.field_A ? 1 : 0;
          var2 = param1.length();
          if (param0 == -18428) {
            break L0;
          } else {
            ea.a(107, (byte) 40, -41, 107, -6, 86);
            break L0;
          }
        }
        var3 = new byte[var2];
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param1.charAt(var4);
                  if (0 >= var5) {
                    break L4;
                  } else {
                    if (var5 < 128) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (160 > var5) {
                    break L5;
                  } else {
                    if (var5 > 255) {
                      break L5;
                    } else {
                      break L3;
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
                              break L2;
                            } else {
                              if (710 == var5) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (var5 == 8240) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 != 352) {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (var5 != 338) {
                                        if (var5 == 381) {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        } else {
                                          if (8216 == var5) {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          } else {
                                            if (var5 == 8217) {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            } else {
                                              if (var5 != 8220) {
                                                if (var5 == 8221) {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                } else {
                                                  if (var5 == 8226) {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  } else {
                                                    if (var5 != 8211) {
                                                      if (var5 == 8212) {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 732) {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        } else {
                                                          if (var5 == 8482) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (var5 != 353) {
                                                              if (8250 == var5) {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              } else {
                                                                if (var5 != 339) {
                                                                  if (382 == var5) {
                                                                    var3[var4] = (byte)-98;
                                                                    break L2;
                                                                  } else {
                                                                    if (var5 != 376) {
                                                                      var3[var4] = (byte)63;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-100;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  }
                                }
                              }
                            }
                          } else {
                            var3[var4] = (byte)-122;
                            break L2;
                          }
                        } else {
                          var3[var4] = (byte)-123;
                          break L2;
                        }
                      } else {
                        var3[var4] = (byte)-124;
                        break L2;
                      }
                    } else {
                      var3[var4] = (byte)-125;
                      break L2;
                    }
                  } else {
                    var3[var4] = (byte)-126;
                    break L2;
                  }
                } else {
                  var3[var4] = (byte)-128;
                  break L2;
                }
              }
              var3[var4] = (byte)var5;
              break L2;
            }
            var4++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "They cannot be placed where any fleas are standing. Hold the mouse button, and the tile will be placed as soon as the fleas have gone.";
        field_b = new wd();
    }
}

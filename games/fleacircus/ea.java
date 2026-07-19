/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_c;
    static int field_a;
    static wd field_b;

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                lj.field_g = param2;
                try {
                  L1: {
                    L2: {
                      if (param0 == 376) {
                        break L2;
                      } else {
                        field_b = (wd) null;
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        var6 = param1.getParameter("cookieprefix");
                        var5 = var6;
                        var5 = var6;
                        var4 = param1.getParameter("cookiehost");
                        var5 = var4;
                        var5 = var4;
                        var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                        var5 = var7;
                        var5 = var7;
                        var5 = var7;
                        if (0 != param2.length()) {
                          break L4;
                        } else {
                          var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          if (!fleas.field_A) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5 = var5 + "; Expires=" + wd.a((byte) -116, lj.a((byte) -75) - -94608000000L) + "; Max-Age=" + 94608000L;
                      break L3;
                    }
                    eb.a("document.cookie=\"" + var5 + "\"", -28924, param1);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = decompiledCaughtException;
                    break L5;
                  }
                }
                bf.a(32010, param1);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) (var3_ref);
                stackOut_11_1 = new StringBuilder().append("ea.A(").append(param0).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L6;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L6;
                }
              }
              L7: {
                stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L7;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L7;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            String var4 = null;
            Object[] var5 = null;
            Throwable decompiledCaughtException = null;
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
              var1_ref = Runtime.class.getMethod("maxMemory", new Class[]{});
              if (var1_ref != null) {
                try {
                  L1: {
                    var2_ref = Runtime.getRuntime();
                    var5 = (Object[]) null;
                    var3 = (Long) (var1_ref.invoke((Object) (var2_ref), (Object[]) null));
                    kf.field_k = 1 + (int)(var3.longValue() / 1048576L);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_97_0 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_96_0 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
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
              L3: {
                if (var4 >= var2_int) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          var5 = param1.charAt(var4);
                          if (0 >= var5) {
                            break L7;
                          } else {
                            if (var5 < 128) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (160 > var5) {
                          break L5;
                        } else {
                          if (var5 > 255) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3[var4] = (byte)var5;
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                    L8: {
                      if (var5 != 8364) {
                        break L8;
                      } else {
                        var3[var4] = (byte)-128;
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var5 != 8218) {
                        break L9;
                      } else {
                        var3[var4] = (byte)-126;
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var5 != 402) {
                        break L10;
                      } else {
                        var3[var4] = (byte)-125;
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var5 != 8222) {
                        break L11;
                      } else {
                        var3[var4] = (byte)-124;
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var5 != 8230) {
                        break L12;
                      } else {
                        var3[var4] = (byte)-123;
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (8224 != var5) {
                        break L13;
                      } else {
                        var3[var4] = (byte)-122;
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (var5 == 8225) {
                        break L14;
                      } else {
                        L15: {
                          if (710 == var5) {
                            break L15;
                          } else {
                            L16: {
                              if (var5 == 8240) {
                                break L16;
                              } else {
                                L17: {
                                  if (var5 != 352) {
                                    break L17;
                                  } else {
                                    var3[var4] = (byte)-118;
                                    if (var6 == 0) {
                                      break L4;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  if (var5 == 8249) {
                                    break L18;
                                  } else {
                                    L19: {
                                      if (var5 != 338) {
                                        break L19;
                                      } else {
                                        var3[var4] = (byte)-116;
                                        if (var6 == 0) {
                                          break L4;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (var5 == 381) {
                                        break L20;
                                      } else {
                                        L21: {
                                          if (8216 == var5) {
                                            break L21;
                                          } else {
                                            L22: {
                                              if (var5 == 8217) {
                                                break L22;
                                              } else {
                                                L23: {
                                                  if (var5 != 8220) {
                                                    break L23;
                                                  } else {
                                                    var3[var4] = (byte)-109;
                                                    if (var6 == 0) {
                                                      break L4;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                                L24: {
                                                  if (var5 == 8221) {
                                                    break L24;
                                                  } else {
                                                    L25: {
                                                      if (var5 == 8226) {
                                                        break L25;
                                                      } else {
                                                        L26: {
                                                          if (var5 != 8211) {
                                                            break L26;
                                                          } else {
                                                            var3[var4] = (byte)-106;
                                                            if (var6 == 0) {
                                                              break L4;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                        }
                                                        L27: {
                                                          if (var5 == 8212) {
                                                            break L27;
                                                          } else {
                                                            L28: {
                                                              if (var5 == 732) {
                                                                break L28;
                                                              } else {
                                                                L29: {
                                                                  if (var5 == 8482) {
                                                                    break L29;
                                                                  } else {
                                                                    L30: {
                                                                      if (var5 != 353) {
                                                                        break L30;
                                                                      } else {
                                                                        var3[var4] = (byte)-102;
                                                                        if (var6 == 0) {
                                                                          break L4;
                                                                        } else {
                                                                          break L30;
                                                                        }
                                                                      }
                                                                    }
                                                                    L31: {
                                                                      if (8250 == var5) {
                                                                        break L31;
                                                                      } else {
                                                                        L32: {
                                                                          if (var5 != 339) {
                                                                            break L32;
                                                                          } else {
                                                                            var3[var4] = (byte)-100;
                                                                            if (var6 == 0) {
                                                                              break L4;
                                                                            } else {
                                                                              break L32;
                                                                            }
                                                                          }
                                                                        }
                                                                        L33: {
                                                                          if (382 == var5) {
                                                                            break L33;
                                                                          } else {
                                                                            L34: {
                                                                              if (var5 != 376) {
                                                                                break L34;
                                                                              } else {
                                                                                var3[var4] = (byte)-97;
                                                                                if (var6 == 0) {
                                                                                  break L4;
                                                                                } else {
                                                                                  break L34;
                                                                                }
                                                                              }
                                                                            }
                                                                            var3[var4] = (byte)63;
                                                                            if (var6 == 0) {
                                                                              break L4;
                                                                            } else {
                                                                              break L33;
                                                                            }
                                                                          }
                                                                        }
                                                                        var3[var4] = (byte)-98;
                                                                        if (var6 == 0) {
                                                                          break L4;
                                                                        } else {
                                                                          break L31;
                                                                        }
                                                                      }
                                                                    }
                                                                    var3[var4] = (byte)-101;
                                                                    if (var6 == 0) {
                                                                      break L4;
                                                                    } else {
                                                                      break L29;
                                                                    }
                                                                  }
                                                                }
                                                                var3[var4] = (byte)-103;
                                                                if (var6 == 0) {
                                                                  break L4;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                            }
                                                            var3[var4] = (byte)-104;
                                                            if (var6 == 0) {
                                                              break L4;
                                                            } else {
                                                              break L27;
                                                            }
                                                          }
                                                        }
                                                        var3[var4] = (byte)-105;
                                                        if (var6 == 0) {
                                                          break L4;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    var3[var4] = (byte)-107;
                                                    if (var6 == 0) {
                                                      break L4;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                var3[var4] = (byte)-108;
                                                if (var6 == 0) {
                                                  break L4;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            var3[var4] = (byte)-110;
                                            if (var6 == 0) {
                                              break L4;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        var3[var4] = (byte)-111;
                                        if (var6 == 0) {
                                          break L4;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    var3[var4] = (byte)-114;
                                    if (var6 == 0) {
                                      break L4;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                var3[var4] = (byte)-117;
                                if (var6 == 0) {
                                  break L4;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var3[var4] = (byte)-119;
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var3[var4] = (byte)-120;
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var3[var4] = (byte)-121;
                    break L4;
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_96_0 = (byte[]) (var3);
              stackIn_97_0 = stackOut_96_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var2 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) (var2);
            stackOut_98_1 = new StringBuilder().append("ea.C(").append(param0).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param1 == null) {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L35;
            } else {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L35;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ')');
        }
        return stackIn_97_0;
    }

    static {
        field_c = "They cannot be placed where any fleas are standing. Hold the mouse button, and the tile will be placed as soon as the fleas have gone.";
        field_b = new wd();
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static String field_c;
    static bd field_b;
    static ub field_e;
    static bd[] field_a;
    static volatile int field_d;

    final static void a(byte param0) {
        Object var2 = null;
        im.field_e.f((byte) 32);
        if (param0 >= -83) {
          L0: {
            var2 = null;
            dc.a((java.awt.Component) null, (byte) 101);
            if (hj.field_t == null) {
              hj.field_t = new pe(im.field_e, se.field_g);
              break L0;
            } else {
              break L0;
            }
          }
          im.field_e.c((ag) (Object) hj.field_t, 108);
          return;
        } else {
          L1: {
            if (hj.field_t == null) {
              hj.field_t = new pe(im.field_e, se.field_g);
              break L1;
            } else {
              break L1;
            }
          }
          im.field_e.c((ag) (Object) hj.field_t, 108);
          return;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (tk.field_e >= 0) {
          L0: {
            var3 = 185;
            var4 = -35 + param1;
            var5 = 256;
            if (75 <= tk.field_e) {
              break L0;
            } else {
              var5 = (tk.field_e << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (tk.field_e <= 200) {
              break L1;
            } else {
              var5 = (-tk.field_e + 250 << 8) / 50;
              break L1;
            }
          }
          sb.a(il.field_f, -120);
          ge.b();
          si.d();
          uc.b(-45);
          if (var5 < 256) {
            si.a(0, 0, si.field_e, si.field_k, 0, -var5 + 256);
            eh.b(false);
            if (150 > tk.field_e) {
              il.field_f.f(var3, var4);
              var6 = tk.field_e - 125;
              if (var6 <= 0) {
                if (param0 == 11) {
                  L2: {
                    var6 = tk.field_e - 140;
                    if (var6 <= 0) {
                      break L2;
                    } else {
                      L3: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                if (var6 < 50) {
                  if (20 <= var6) {
                    if (var6 < 30) {
                      ti.field_c.c(var3, var4, 256);
                      if (param0 == 11) {
                        L4: {
                          var6 = tk.field_e - 140;
                          if (var6 <= 0) {
                            break L4;
                          } else {
                            L5: {
                              var7 = 256;
                              if (var6 < 20) {
                                var7 = 256 * var6 / 20;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                            break L4;
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var7 = (-(256 * var6) + 12800) / 20;
                      ti.field_c.c(var3, var4, var7);
                      if (param0 == 11) {
                        L6: {
                          var6 = tk.field_e - 140;
                          if (var6 <= 0) {
                            break L6;
                          } else {
                            L7: {
                              var7 = 256;
                              if (var6 < 20) {
                                var7 = 256 * var6 / 20;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                            break L6;
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    var7 = var6 * 256 / 20;
                    ti.field_c.c(var3, var4, var7);
                    if (param0 == 11) {
                      L8: {
                        var6 = tk.field_e - 140;
                        if (var6 <= 0) {
                          break L8;
                        } else {
                          L9: {
                            var7 = 256;
                            if (var6 < 20) {
                              var7 = 256 * var6 / 20;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                          break L8;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param0 == 11) {
                    L10: {
                      var6 = tk.field_e - 140;
                      if (var6 <= 0) {
                        break L10;
                      } else {
                        L11: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                        break L10;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              ob.field_C.b(var3 - -15, 10 + var4, var5);
              var6 = tk.field_e - 125;
              if (var6 > 0) {
                L12: {
                  if (var6 < 50) {
                    if (20 <= var6) {
                      if (var6 < 30) {
                        ti.field_c.c(var3, var4, 256);
                        if (param0 == 11) {
                          L13: {
                            var6 = tk.field_e - 140;
                            if (var6 <= 0) {
                              break L13;
                            } else {
                              L14: {
                                var7 = 256;
                                if (var6 < 20) {
                                  var7 = 256 * var6 / 20;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                              break L13;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var7 = (-(256 * var6) + 12800) / 20;
                        ti.field_c.c(var3, var4, var7);
                        if (param0 == 11) {
                          L15: {
                            var6 = tk.field_e - 140;
                            if (var6 <= 0) {
                              break L15;
                            } else {
                              L16: {
                                var7 = 256;
                                if (var6 < 20) {
                                  var7 = 256 * var6 / 20;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                              break L15;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      var7 = var6 * 256 / 20;
                      ti.field_c.c(var3, var4, var7);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                if (param0 == 11) {
                  L17: {
                    var6 = tk.field_e - 140;
                    if (var6 <= 0) {
                      break L17;
                    } else {
                      L18: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                      break L17;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 == 11) {
                  L19: {
                    var6 = tk.field_e - 140;
                    if (var6 <= 0) {
                      break L19;
                    } else {
                      L20: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                      break L19;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            eh.b(false);
            if (150 > tk.field_e) {
              L21: {
                il.field_f.f(var3, var4);
                var6 = tk.field_e - 125;
                if (var6 <= 0) {
                  break L21;
                } else {
                  if (var6 < 50) {
                    if (20 <= var6) {
                      if (var6 < 30) {
                        ti.field_c.c(var3, var4, 256);
                        break L21;
                      } else {
                        var7 = (-(256 * var6) + 12800) / 20;
                        ti.field_c.c(var3, var4, var7);
                        break L21;
                      }
                    } else {
                      var7 = var6 * 256 / 20;
                      ti.field_c.c(var3, var4, var7);
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
              }
              if (param0 == 11) {
                L22: {
                  var6 = tk.field_e - 140;
                  if (var6 <= 0) {
                    break L22;
                  } else {
                    L23: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                    break L22;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              L24: {
                ob.field_C.b(var3 - -15, 10 + var4, var5);
                var6 = tk.field_e - 125;
                if (var6 <= 0) {
                  break L24;
                } else {
                  if (var6 < 50) {
                    if (20 <= var6) {
                      if (var6 < 30) {
                        ti.field_c.c(var3, var4, 256);
                        break L24;
                      } else {
                        var7 = (-(256 * var6) + 12800) / 20;
                        ti.field_c.c(var3, var4, var7);
                        break L24;
                      }
                    } else {
                      var7 = var6 * 256 / 20;
                      ti.field_c.c(var3, var4, var7);
                      break L24;
                    }
                  } else {
                    break L24;
                  }
                }
              }
              if (param0 == 11) {
                L25: {
                  var6 = tk.field_e - 140;
                  if (var6 <= 0) {
                    break L25;
                  } else {
                    L26: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    ki.field_e.b(var3 + 15, var4 + 10, var7 * var5 >> 8);
                    break L25;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              if (param0 > 39) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var3 = new byte[var2_int];
            kf.a(param1, 0, var3, 0, var2_int);
            stackOut_2_0 = (byte[]) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("dc.F(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) jc.field_b);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) jc.field_b);
        if (param1 != 48) {
            return;
        }
        try {
            param0.addFocusListener((java.awt.event.FocusListener) (Object) jc.field_b);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "dc.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                  if (param0 >= 60) {
                    param1.getAppletContext().showDocument(nj.a(param1, true, var2), "_top");
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("dc.A(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_e = new ub();
        field_d = 0;
        field_a = new bd[222];
    }
}

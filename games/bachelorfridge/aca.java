/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aca extends kj {
    static int[] field_g;
    private int field_f;
    static int field_i;
    private boolean field_j;
    static int field_k;
    private eaa field_h;

    final boolean b(int param0) {
        RuntimeException var2 = null;
        bma var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_13_0 = 0;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              ((aca) this).field_f = ((aca) this).field_f - 1;
              if (((aca) this).field_f >= 0) {
                L2: {
                  if (!((aca) this).field_j) {
                    stackOut_7_0 = 3;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_5_0 = 7;
                    stackIn_8_0 = stackOut_5_0;
                    break L2;
                  }
                }
                var2_int = stackIn_8_0;
                if ((((aca) this).field_f & var2_int) == 0) {
                  this.c((byte) -100);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var2_ref = (bma) (Object) ((aca) this).field_h.b((byte) 90);
            if (param0 > 21) {
              L3: while (true) {
                L4: {
                  L5: {
                    if (null == var2_ref) {
                      break L5;
                    } else {
                      int fieldTemp$2 = var2_ref.field_r + 1;
                      var2_ref.field_r = var2_ref.field_r + 1;
                      var3 = 8191 & 8192 * fieldTemp$2 / var2_ref.field_s;
                      var2_ref.field_p = via.a(var3, (byte) 125) >> -1275181268;
                      var2_ref.field_k = -((via.a(var3, (byte) 109) >> -392579572) + 20);
                      var2_ref.field_g = ft.a(var3, (byte) -128) >> 2109534796;
                      boolean discarded$3 = var2_ref.b(true);
                      stackOut_16_0 = var2_ref.field_h;
                      stackIn_24_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (var4 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_17_0 < 0) {
                            var2_ref.a(false);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var2_ref = (bma) (Object) ((aca) this).field_h.c(0);
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = ((aca) this).field_f;
                  stackIn_24_0 = stackOut_23_0;
                  break L4;
                }
                L7: {
                  L8: {
                    if (stackIn_24_0 >= 0) {
                      break L8;
                    } else {
                      if (!((aca) this).field_h.e(12917)) {
                        break L8;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_31_0 = stackOut_28_0;
                        break L7;
                      }
                    }
                  }
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L7;
                }
                break L0;
              }
            } else {
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aca.F(" + param0 + ')');
        }
        return stackIn_31_0 != 0;
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bma var7 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = kla.a(1024, sma.field_I, -2147483648);
              var3 = kla.a(1024, sma.field_I, -2147483648);
              var4 = var3 + var2_int;
              var5 = var2_int - var3;
              if (((aca) this).field_j) {
                stackOut_3_0 = 60;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 200;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            var6 = stackIn_4_0;
            var7 = new bma(var4, var6 << -2137495420, var5, kla.a(mla.field_b.length, sma.field_I, -2147483648), 50 + kla.a(50, sma.field_I, -2147483648));
            if (param0 == -100) {
              ((aca) this).field_h.a((bw) (Object) var7, true);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "aca.D(" + param0 + ')');
        }
    }

    final static byte a(char param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_125_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_124_0 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param0 <= 0) {
                    break L3;
                  } else {
                    if (param0 < 128) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (param0 < 160) {
                    break L4;
                  } else {
                    if (param0 <= 255) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param0 == 8364) {
                    break L5;
                  } else {
                    L6: {
                      if (8218 != param0) {
                        break L6;
                      } else {
                        var2_int = -126;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (param0 == 402) {
                        break L7;
                      } else {
                        L8: {
                          if (param0 == 8222) {
                            break L8;
                          } else {
                            L9: {
                              if (param0 == 8230) {
                                break L9;
                              } else {
                                L10: {
                                  if (param0 == 8224) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (param0 == 8225) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (param0 != 710) {
                                            break L12;
                                          } else {
                                            var2_int = -120;
                                            if (var3 == 0) {
                                              break L1;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        L13: {
                                          if (param0 == 8240) {
                                            break L13;
                                          } else {
                                            L14: {
                                              if (param0 == 352) {
                                                break L14;
                                              } else {
                                                L15: {
                                                  if (param0 != 8249) {
                                                    break L15;
                                                  } else {
                                                    var2_int = -117;
                                                    if (var3 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                                L16: {
                                                  if (338 == param0) {
                                                    break L16;
                                                  } else {
                                                    L17: {
                                                      if (param0 == 381) {
                                                        break L17;
                                                      } else {
                                                        L18: {
                                                          if (param0 == 8216) {
                                                            break L18;
                                                          } else {
                                                            L19: {
                                                              if (8217 != param0) {
                                                                break L19;
                                                              } else {
                                                                var2_int = -110;
                                                                if (var3 == 0) {
                                                                  break L1;
                                                                } else {
                                                                  break L19;
                                                                }
                                                              }
                                                            }
                                                            L20: {
                                                              if (8220 == param0) {
                                                                break L20;
                                                              } else {
                                                                L21: {
                                                                  if (param0 != 8221) {
                                                                    break L21;
                                                                  } else {
                                                                    var2_int = -108;
                                                                    if (var3 == 0) {
                                                                      break L1;
                                                                    } else {
                                                                      break L21;
                                                                    }
                                                                  }
                                                                }
                                                                L22: {
                                                                  if (param0 != 8226) {
                                                                    break L22;
                                                                  } else {
                                                                    var2_int = -107;
                                                                    if (var3 == 0) {
                                                                      break L1;
                                                                    } else {
                                                                      break L22;
                                                                    }
                                                                  }
                                                                }
                                                                L23: {
                                                                  if (param0 == 8211) {
                                                                    break L23;
                                                                  } else {
                                                                    L24: {
                                                                      if (8212 != param0) {
                                                                        break L24;
                                                                      } else {
                                                                        var2_int = -105;
                                                                        if (var3 == 0) {
                                                                          break L1;
                                                                        } else {
                                                                          break L24;
                                                                        }
                                                                      }
                                                                    }
                                                                    L25: {
                                                                      if (param0 == 732) {
                                                                        break L25;
                                                                      } else {
                                                                        L26: {
                                                                          if (param0 == 8482) {
                                                                            break L26;
                                                                          } else {
                                                                            L27: {
                                                                              if (param0 != 353) {
                                                                                break L27;
                                                                              } else {
                                                                                var2_int = -102;
                                                                                if (var3 == 0) {
                                                                                  break L1;
                                                                                } else {
                                                                                  break L27;
                                                                                }
                                                                              }
                                                                            }
                                                                            L28: {
                                                                              if (param0 != 8250) {
                                                                                break L28;
                                                                              } else {
                                                                                var2_int = -101;
                                                                                if (var3 == 0) {
                                                                                  break L1;
                                                                                } else {
                                                                                  break L28;
                                                                                }
                                                                              }
                                                                            }
                                                                            L29: {
                                                                              if (339 != param0) {
                                                                                break L29;
                                                                              } else {
                                                                                var2_int = -100;
                                                                                if (var3 == 0) {
                                                                                  break L1;
                                                                                } else {
                                                                                  break L29;
                                                                                }
                                                                              }
                                                                            }
                                                                            L30: {
                                                                              if (param0 != 382) {
                                                                                break L30;
                                                                              } else {
                                                                                var2_int = -98;
                                                                                if (var3 == 0) {
                                                                                  break L1;
                                                                                } else {
                                                                                  break L30;
                                                                                }
                                                                              }
                                                                            }
                                                                            L31: {
                                                                              if (376 != param0) {
                                                                                break L31;
                                                                              } else {
                                                                                var2_int = -97;
                                                                                if (var3 == 0) {
                                                                                  break L1;
                                                                                } else {
                                                                                  break L31;
                                                                                }
                                                                              }
                                                                            }
                                                                            var2_int = 63;
                                                                            if (var3 == 0) {
                                                                              break L1;
                                                                            } else {
                                                                              break L26;
                                                                            }
                                                                          }
                                                                        }
                                                                        var2_int = -103;
                                                                        if (var3 == 0) {
                                                                          break L1;
                                                                        } else {
                                                                          break L25;
                                                                        }
                                                                      }
                                                                    }
                                                                    var2_int = -104;
                                                                    if (var3 == 0) {
                                                                      break L1;
                                                                    } else {
                                                                      break L23;
                                                                    }
                                                                  }
                                                                }
                                                                var2_int = -106;
                                                                if (var3 == 0) {
                                                                  break L1;
                                                                } else {
                                                                  break L20;
                                                                }
                                                              }
                                                            }
                                                            var2_int = -109;
                                                            if (var3 == 0) {
                                                              break L1;
                                                            } else {
                                                              break L18;
                                                            }
                                                          }
                                                        }
                                                        var2_int = -111;
                                                        if (var3 == 0) {
                                                          break L1;
                                                        } else {
                                                          break L17;
                                                        }
                                                      }
                                                    }
                                                    var2_int = -114;
                                                    if (var3 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                                var2_int = -116;
                                                if (var3 == 0) {
                                                  break L1;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            var2_int = -118;
                                            if (var3 == 0) {
                                              break L1;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        var2_int = -119;
                                        if (var3 == 0) {
                                          break L1;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var2_int = -121;
                                    if (var3 == 0) {
                                      break L1;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var2_int = -122;
                                if (var3 == 0) {
                                  break L1;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var2_int = -123;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var2_int = -124;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var2_int = -125;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                var2_int = -128;
                if (var3 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var2_int = (byte)param0;
              break L1;
            }
            L32: {
              if (param1 == 8220) {
                break L32;
              } else {
                byte discarded$1 = aca.a('ﾵ', 108);
                break L32;
              }
            }
            stackOut_124_0 = var2_int;
            stackIn_125_0 = stackOut_124_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "aca.C(" + param0 + ',' + param1 + ')');
        }
        return (byte) stackIn_125_0;
    }

    aca(gj param0, int param1, int param2, boolean param3) {
        super(param0, param1, param2);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                ((aca) this).field_h = new eaa();
                ((aca) this).field_j = param3;
                if (!((aca) this).field_j) {
                  break L2;
                } else {
                  ((aca) this).field_f = 30;
                  if (BachelorFridge.field_y == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((aca) this).field_f = 100;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("aca.<init>(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        bma var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = (bma) (Object) ((aca) this).field_h.b((byte) 90);
            if (param1) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      var5 = (var4.field_i >> 197807620) + param2;
                      var6 = (var4.field_q >> -1867103964) + param0 - (var4.field_h >> -1554850748);
                      mla.field_b[var4.field_v].e(var5, var6);
                      var4 = (bma) (Object) ((aca) this).field_h.c(0);
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) (Object) runtimeException, "aca.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        try {
            if (param1 != 0) {
                ((aca) this).field_f = 8;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "aca.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        try {
            field_g = null;
            if (param0 > -110) {
                field_k = -103;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "aca.A(" + param0 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        try {
            int discarded$6 = fda.b(param0 ^ -117);
            if (param0 != -118) {
                byte discarded$7 = aca.a('q', -54);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "aca.K(" + param0 + ',' + param1 + ')');
        }
    }

    final static hs a(byte param0, int param1, int param2) {
        IllegalArgumentException illegalArgumentException = null;
        hs var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        byte[] var4_array = null;
        hs stackIn_19_0 = null;
        Throwable decompiledCaughtException = null;
        hs stackOut_18_0 = null;
        try {
          L0: {
            L1: {
              if (bca.field_n[param1][param2] != null) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (11 == param2) {
                param1 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == -100) {
                break L3;
              } else {
                field_i = -82;
                break L3;
              }
            }
            L4: {
              if (param2 == 10) {
                param1 = 11;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3 = bca.field_n[param1][param2].a(0);
              if (null != var3) {
                break L5;
              } else {
                var4 = null;
                try {
                  L6: {
                    var4_array = bk.field_v.a((byte) 123, hk.field_h[param2], fl.field_o[param1]);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    illegalArgumentException = (IllegalArgumentException) (Object) decompiledCaughtException;
                    break L7;
                  }
                }
                var3 = oo.a(param2, (byte) -77, var4_array, param1);
                bca.field_n[param1][param2] = new al(var3);
                break L5;
              }
            }
            stackOut_18_0 = (hs) var3;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3_ref, "aca.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_g = new int[12];
        field_k = -1;
    }
}

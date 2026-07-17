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
        Object var2 = null;
        bma var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        var2 = null;
        var4 = BachelorFridge.field_y;
        ((aca) this).field_f = ((aca) this).field_f - 1;
        if (((aca) this).field_f >= 0) {
          L0: {
            if (!((aca) this).field_j) {
              stackOut_16_0 = 3;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_15_0 = 7;
              stackIn_17_0 = stackOut_15_0;
              break L0;
            }
          }
          var2_int = stackIn_17_0;
          if ((((aca) this).field_f & var2_int) == 0) {
            int discarded$7 = -100;
            this.c();
            var2_ref = (bma) (Object) ((aca) this).field_h.b((byte) 90);
            if (param0 <= 21) {
              return false;
            } else {
              L1: while (true) {
                if (var2_ref == null) {
                  L2: {
                    L3: {
                      if (((aca) this).field_f >= 0) {
                        break L3;
                      } else {
                        if (!((aca) this).field_h.e(12917)) {
                          break L3;
                        } else {
                          stackOut_39_0 = 1;
                          stackIn_41_0 = stackOut_39_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_40_0 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    break L2;
                  }
                  return stackIn_41_0 != 0;
                } else {
                  L4: {
                    int fieldTemp$8 = var2_ref.field_r + 1;
                    var2_ref.field_r = var2_ref.field_r + 1;
                    var3 = 8191 & 8192 * fieldTemp$8 / var2_ref.field_s;
                    var2_ref.field_p = via.a(var3, (byte) 125) >> 12;
                    var2_ref.field_k = -((via.a(var3, (byte) 109) >> 12) + 20);
                    var2_ref.field_g = ft.a(var3, (byte) -128) >> 12;
                    boolean discarded$9 = var2_ref.b(true);
                    if (var2_ref.field_h < 0) {
                      var2_ref.a(false);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var2_ref = (bma) (Object) ((aca) this).field_h.c(0);
                  continue L1;
                }
              }
            }
          } else {
            var2_ref = (bma) (Object) ((aca) this).field_h.b((byte) 90);
            if (param0 > 21) {
              L5: while (true) {
                if (var2_ref == null) {
                  L6: {
                    L7: {
                      if (((aca) this).field_f >= 0) {
                        break L7;
                      } else {
                        if (!((aca) this).field_h.e(12917)) {
                          break L7;
                        } else {
                          stackOut_27_0 = 1;
                          stackIn_29_0 = stackOut_27_0;
                          break L6;
                        }
                      }
                    }
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  }
                  return stackIn_29_0 != 0;
                } else {
                  L8: {
                    int fieldTemp$10 = var2_ref.field_r + 1;
                    var2_ref.field_r = var2_ref.field_r + 1;
                    var3 = 8191 & 8192 * fieldTemp$10 / var2_ref.field_s;
                    var2_ref.field_p = via.a(var3, (byte) 125) >> 12;
                    var2_ref.field_k = -((via.a(var3, (byte) 109) >> 12) + 20);
                    var2_ref.field_g = ft.a(var3, (byte) -128) >> 12;
                    boolean discarded$11 = var2_ref.b(true);
                    if (var2_ref.field_h < 0) {
                      var2_ref.a(false);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var2_ref = (bma) (Object) ((aca) this).field_h.c(0);
                  continue L5;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          var2_ref = (bma) (Object) ((aca) this).field_h.b((byte) 90);
          if (param0 > 21) {
            L9: while (true) {
              if (var2_ref == null) {
                L10: {
                  L11: {
                    if (((aca) this).field_f >= 0) {
                      break L11;
                    } else {
                      if (!((aca) this).field_h.e(12917)) {
                        break L11;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L10;
                      }
                    }
                  }
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L10;
                }
                return stackIn_12_0 != 0;
              } else {
                L12: {
                  int fieldTemp$12 = var2_ref.field_r + 1;
                  var2_ref.field_r = var2_ref.field_r + 1;
                  var3 = 8191 & 8192 * fieldTemp$12 / var2_ref.field_s;
                  var2_ref.field_p = via.a(var3, (byte) 125) >> 12;
                  var2_ref.field_k = -((via.a(var3, (byte) 109) >> 12) + 20);
                  var2_ref.field_g = ft.a(var3, (byte) -128) >> 12;
                  boolean discarded$13 = var2_ref.b(true);
                  if (var2_ref.field_h < 0) {
                    var2_ref.a(false);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var2_ref = (bma) (Object) ((aca) this).field_h.c(0);
                continue L9;
              }
            }
          } else {
            return false;
          }
        }
    }

    private final void c() {
        int var2 = kla.a(1024, sma.field_I, -2147483648);
        int var3 = kla.a(1024, sma.field_I, -2147483648);
        int var4 = var3 + var2;
        int var5 = var2 - var3;
        int var6 = !((aca) this).field_j ? 200 : 60;
        bma var7 = new bma(var4, var6 << 4, var5, kla.a(mla.field_b.length, sma.field_I, -2147483648), 50 + kla.a(50, sma.field_I, -2147483648));
        ((aca) this).field_h.a((bw) (Object) var7, true);
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 > 0) {
          if (param0 >= 128) {
            L0: {
              L1: {
                if (param0 < 160) {
                  break L1;
                } else {
                  if (param0 <= 255) {
                    var2 = (byte)param0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (param0 == 8364) {
                var2 = -128;
                if (param1 == 8220) {
                  return (byte) var2;
                } else {
                  byte discarded$20 = aca.a('ﾵ', 108);
                  return (byte) var2;
                }
              } else {
                if (8218 != param0) {
                  if (param0 == 402) {
                    var2 = -125;
                    if (param1 == 8220) {
                      return (byte) var2;
                    } else {
                      byte discarded$21 = aca.a('ﾵ', 108);
                      return (byte) var2;
                    }
                  } else {
                    if (param0 == 8222) {
                      var2 = -124;
                      if (param1 == 8220) {
                        return (byte) var2;
                      } else {
                        byte discarded$22 = aca.a('ﾵ', 108);
                        return (byte) var2;
                      }
                    } else {
                      if (param0 == 8230) {
                        var2 = -123;
                        if (param1 == 8220) {
                          return (byte) var2;
                        } else {
                          byte discarded$23 = aca.a('ﾵ', 108);
                          return (byte) var2;
                        }
                      } else {
                        if (param0 == 8224) {
                          var2 = -122;
                          if (param1 == 8220) {
                            return (byte) var2;
                          } else {
                            byte discarded$24 = aca.a('ﾵ', 108);
                            return (byte) var2;
                          }
                        } else {
                          if (param0 == 8225) {
                            var2 = -121;
                            if (param1 == 8220) {
                              return (byte) var2;
                            } else {
                              byte discarded$25 = aca.a('ﾵ', 108);
                              return (byte) var2;
                            }
                          } else {
                            if (param0 != 710) {
                              if (param0 == 8240) {
                                var2 = -119;
                                if (param1 == 8220) {
                                  return (byte) var2;
                                } else {
                                  byte discarded$26 = aca.a('ﾵ', 108);
                                  return (byte) var2;
                                }
                              } else {
                                if (param0 == 352) {
                                  var2 = -118;
                                  if (param1 == 8220) {
                                    return (byte) var2;
                                  } else {
                                    byte discarded$27 = aca.a('ﾵ', 108);
                                    return (byte) var2;
                                  }
                                } else {
                                  if (param0 != 8249) {
                                    if (338 == param0) {
                                      var2 = -116;
                                      if (param1 == 8220) {
                                        return (byte) var2;
                                      } else {
                                        byte discarded$28 = aca.a('ﾵ', 108);
                                        return (byte) var2;
                                      }
                                    } else {
                                      if (param0 == 381) {
                                        var2 = -114;
                                        if (param1 == 8220) {
                                          return (byte) var2;
                                        } else {
                                          byte discarded$29 = aca.a('ﾵ', 108);
                                          return (byte) var2;
                                        }
                                      } else {
                                        if (param0 == 8216) {
                                          var2 = -111;
                                          if (param1 == 8220) {
                                            return (byte) var2;
                                          } else {
                                            byte discarded$30 = aca.a('ﾵ', 108);
                                            return (byte) var2;
                                          }
                                        } else {
                                          if (8217 != param0) {
                                            if (8220 == param0) {
                                              var2 = -109;
                                              if (param1 == 8220) {
                                                return (byte) var2;
                                              } else {
                                                byte discarded$31 = aca.a('ﾵ', 108);
                                                return (byte) var2;
                                              }
                                            } else {
                                              if (param0 != 8221) {
                                                if (param0 != 8226) {
                                                  if (param0 == 8211) {
                                                    var2 = -106;
                                                    break L0;
                                                  } else {
                                                    if (8212 != param0) {
                                                      if (param0 == 732) {
                                                        var2 = -104;
                                                        break L0;
                                                      } else {
                                                        if (param0 == 8482) {
                                                          var2 = -103;
                                                          break L0;
                                                        } else {
                                                          if (param0 != 353) {
                                                            if (param0 != 8250) {
                                                              if (339 != param0) {
                                                                if (param0 != 382) {
                                                                  if (376 != param0) {
                                                                    var2 = 63;
                                                                    break L0;
                                                                  } else {
                                                                    var2 = -97;
                                                                    break L0;
                                                                  }
                                                                } else {
                                                                  var2 = -98;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                var2 = -100;
                                                                break L0;
                                                              }
                                                            } else {
                                                              var2 = -101;
                                                              break L0;
                                                            }
                                                          } else {
                                                            var2 = -102;
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -105;
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -107;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -108;
                                                break L0;
                                              }
                                            }
                                          } else {
                                            var2 = -110;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              var2 = -120;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var2 = -126;
                  break L0;
                }
              }
            }
            if (param1 == 8220) {
              return (byte) var2;
            } else {
              byte discarded$32 = aca.a('ﾵ', 108);
              return (byte) var2;
            }
          } else {
            var2 = (byte)param0;
            if (param1 == 8220) {
              return (byte) var2;
            } else {
              byte discarded$33 = aca.a('ﾵ', 108);
              return (byte) var2;
            }
          }
        } else {
          L2: {
            L3: {
              if (param0 < 160) {
                break L3;
              } else {
                if (param0 <= 255) {
                  var2 = (byte)param0;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (param0 != 8364) {
              if (8218 != param0) {
                if (param0 == 402) {
                  var2 = -125;
                  if (param1 == 8220) {
                    return (byte) var2;
                  } else {
                    byte discarded$34 = aca.a('ﾵ', 108);
                    return (byte) var2;
                  }
                } else {
                  if (param0 == 8222) {
                    var2 = -124;
                    if (param1 == 8220) {
                      return (byte) var2;
                    } else {
                      byte discarded$35 = aca.a('ﾵ', 108);
                      return (byte) var2;
                    }
                  } else {
                    if (param0 == 8230) {
                      var2 = -123;
                      if (param1 == 8220) {
                        return (byte) var2;
                      } else {
                        byte discarded$36 = aca.a('ﾵ', 108);
                        return (byte) var2;
                      }
                    } else {
                      if (param0 == 8224) {
                        var2 = -122;
                        if (param1 == 8220) {
                          return (byte) var2;
                        } else {
                          byte discarded$37 = aca.a('ﾵ', 108);
                          return (byte) var2;
                        }
                      } else {
                        if (param0 == 8225) {
                          var2 = -121;
                          break L2;
                        } else {
                          if (param0 != 710) {
                            if (param0 == 8240) {
                              var2 = -119;
                              break L2;
                            } else {
                              if (param0 == 352) {
                                var2 = -118;
                                break L2;
                              } else {
                                if (param0 != 8249) {
                                  if (338 == param0) {
                                    var2 = -116;
                                    break L2;
                                  } else {
                                    if (param0 == 381) {
                                      var2 = -114;
                                      break L2;
                                    } else {
                                      if (param0 == 8216) {
                                        var2 = -111;
                                        break L2;
                                      } else {
                                        if (8217 != param0) {
                                          if (8220 == param0) {
                                            var2 = -109;
                                            break L2;
                                          } else {
                                            if (param0 != 8221) {
                                              if (param0 != 8226) {
                                                if (param0 == 8211) {
                                                  var2 = -106;
                                                  break L2;
                                                } else {
                                                  if (8212 != param0) {
                                                    if (param0 == 732) {
                                                      var2 = -104;
                                                      break L2;
                                                    } else {
                                                      if (param0 == 8482) {
                                                        var2 = -103;
                                                        break L2;
                                                      } else {
                                                        if (param0 != 353) {
                                                          if (param0 != 8250) {
                                                            if (339 != param0) {
                                                              if (param0 != 382) {
                                                                if (376 != param0) {
                                                                  var2 = 63;
                                                                  break L2;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var2 = -107;
                                                break L2;
                                              }
                                            } else {
                                              var2 = -108;
                                              break L2;
                                            }
                                          }
                                        } else {
                                          var2 = -110;
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                  break L2;
                                }
                              }
                            }
                          } else {
                            var2 = -120;
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var2 = -126;
                break L2;
              }
            } else {
              L4: {
                var2 = -128;
                if (param1 == 8220) {
                  break L4;
                } else {
                  byte discarded$38 = aca.a('ﾵ', 108);
                  break L4;
                }
              }
              return (byte) var2;
            }
          }
          if (param1 == 8220) {
            return (byte) var2;
          } else {
            byte discarded$39 = aca.a('ﾵ', 108);
            return (byte) var2;
          }
        }
    }

    aca(gj param0, int param1, int param2, boolean param3) {
        super(param0, param1, param2);
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              ((aca) this).field_h = new eaa();
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((aca) this).field_j = stackIn_4_1 != 0;
              if (!((aca) this).field_j) {
                ((aca) this).field_f = 100;
                break L2;
              } else {
                ((aca) this).field_f = 30;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("aca.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        bma var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var4 = (bma) (Object) ((aca) this).field_h.b((byte) 90);
        if (param1) {
          L0: while (true) {
            if (var4 != null) {
              var5 = (var4.field_i >> 4) + param2;
              var6 = (var4.field_q >> 4) + param0 - (var4.field_h >> 4);
              mla.field_b[var4.field_v].e(var5, var6);
              var4 = (bma) (Object) ((aca) this).field_h.c(0);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 == 0) {
            return;
        }
        ((aca) this).field_f = 8;
    }

    public static void c(int param0) {
        field_g = null;
    }

    final static void a(byte param0, int param1) {
        int discarded$0 = fda.b(1);
    }

    final static hs a(byte param0, int param1, int param2) {
        byte[] var4_array = null;
        if (bca.field_n[param1][param2] == null) {
        }
        if (!(11 != param2)) {
            param1 = 0;
        }
        if (!(param2 != 10)) {
            param1 = 11;
        }
        hs var3 = bca.field_n[param1][param2].a(0);
        if (var3 == null) {
            Object var4 = null;
            try {
                var4_array = bk.field_v.a((byte) 123, hk.field_h[param2], fl.field_o[param1]);
            } catch (IllegalArgumentException illegalArgumentException) {
            }
            var3 = oo.a(param2, (byte) -77, var4_array, param1);
            bca.field_n[param1][param2] = new al(var3);
        }
        return var3;
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

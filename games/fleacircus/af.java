/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af implements Runnable {
    private bf field_e;
    static ce field_f;
    static String field_a;
    static int field_b;
    private boolean field_c;
    static int field_g;
    private Thread field_h;
    int field_d;

    final static mk a(byte param0, int param1, String param2) {
        mk var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        mk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        mk stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new mk(false);
            var3.field_f = param1;
            var3.field_b = param2;
            if (param0 == 36) {
              stackOut_3_0 = (mk) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("af.J(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2) {
              L1: {
                if (ib.field_k >= 10) {
                  if (wh.b(27415)) {
                    if (bh.field_t != 0) {
                      bg.a((byte) -66, param0);
                      break L1;
                    } else {
                      pd.a(param1, false, 0);
                      be.a(0, param0, (byte) -61, 0);
                      break L1;
                    }
                  } else {
                    gb.c();
                    hd.a(320, 240, -27794);
                    be.a(0, param0, (byte) -29, 0);
                    break L1;
                  }
                } else {
                  L2: {
                    var3_int = 0;
                    if (j.field_e) {
                      var3_int = 1;
                      j.field_e = false;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  se.a(hl.d((byte) -85), ga.field_p, gk.a(-1917), var3_int != 0, (byte) -81);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("af.G(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            qh var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = fleas.field_A ? 1 : 0;
            L0: while (true) {
              if (((af) this).field_c) {
                return;
              } else {
                var2 = (Object) (Object) ((af) this).field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (qh) (Object) ((af) this).field_e.a(-123);
                    if (var7 != null) {
                      ((af) this).field_d = ((af) this).field_d - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((af) this).field_e).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var7.field_B == 2) {
                          boolean discarded$1 = var7.field_A.a(var7.field_x, var7.field_x.length, (int)var7.field_j, (byte) 93);
                          break L5;
                        } else {
                          if (var7.field_B != 3) {
                            break L5;
                          } else {
                            var7.field_x = var7.field_A.a((byte) -90, (int)var7.field_j);
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      ud.a((String) null, (Throwable) (Object) var2_ref, 0);
                      break L6;
                    }
                  }
                  var7.field_q = false;
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final qh a(int param0, ah param1, boolean param2) {
        qh var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        qh var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        qh stackIn_8_0 = null;
        qh stackIn_15_0 = null;
        qh stackIn_16_0 = null;
        qh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        qh stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        qh stackOut_7_0 = null;
        qh stackOut_14_0 = null;
        qh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        qh stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = new qh();
            var4.field_B = 1;
            var5 = (Object) (Object) ((af) this).field_e;
            synchronized (var5) {
              L1: {
                var6 = (qh) (Object) ((af) this).field_e.b((byte) 105);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var6.field_j != (long)param0) {
                        break L3;
                      } else {
                        if (param1 != var6.field_A) {
                          break L3;
                        } else {
                          if (var6.field_B != 2) {
                            break L3;
                          } else {
                            var4.field_q = false;
                            var4.field_x = var6.field_x;
                            stackOut_7_0 = (qh) var4;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (qh) (Object) ((af) this).field_e.c((byte) 88);
                    continue L2;
                  }
                }
              }
            }
            L4: {
              var4.field_x = param1.a((byte) -90, param0);
              stackOut_14_0 = (qh) var4;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!param2) {
                stackOut_16_0 = (qh) (Object) stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L4;
              } else {
                stackOut_15_0 = (qh) (Object) stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L4;
              }
            }
            stackIn_17_0.field_v = stackIn_17_1 != 0;
            var4.field_q = false;
            stackOut_17_0 = (qh) var4;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("af.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(byte param0, qh param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
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
          L0: {
            var3 = (Object) (Object) ((af) this).field_e;
            synchronized (var3) {
              L1: {
                ((af) this).field_e.a((pa) (Object) param1, -1089421886);
                ((af) this).field_d = ((af) this).field_d + 1;
                ((Object) (Object) ((af) this).field_e).notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("af.C(").append(101).append(',');
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
          throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var6_int = param2;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6_int) {
                L2: {
                  if (param4 < -56) {
                    break L2;
                  } else {
                    field_f = null;
                    break L2;
                  }
                }
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param3.charAt(var7);
                      if (var8 <= 0) {
                        break L5;
                      } else {
                        if (128 > var8) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (var8 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (8364 != var8) {
                      if (8218 == var8) {
                        param1[var7 + param5] = (byte) -126;
                        break L3;
                      } else {
                        if (var8 == 402) {
                          param1[var7 + param5] = (byte) -125;
                          break L3;
                        } else {
                          if (8222 == var8) {
                            param1[param5 + var7] = (byte) -124;
                            break L3;
                          } else {
                            if (8230 == var8) {
                              param1[var7 + param5] = (byte) -123;
                              break L3;
                            } else {
                              if (var8 == 8224) {
                                param1[param5 + var7] = (byte) -122;
                                break L3;
                              } else {
                                if (8225 != var8) {
                                  if (710 != var8) {
                                    if (8240 == var8) {
                                      param1[param5 + var7] = (byte) -119;
                                      break L3;
                                    } else {
                                      if (var8 != 352) {
                                        if (var8 != 8249) {
                                          if (var8 == 338) {
                                            param1[var7 + param5] = (byte) -116;
                                            break L3;
                                          } else {
                                            if (var8 != 381) {
                                              if (var8 == 8216) {
                                                param1[var7 + param5] = (byte) -111;
                                                break L3;
                                              } else {
                                                if (var8 == 8217) {
                                                  param1[param5 + var7] = (byte) -110;
                                                  break L3;
                                                } else {
                                                  if (var8 != 8220) {
                                                    if (var8 != 8221) {
                                                      if (var8 == 8226) {
                                                        param1[var7 + param5] = (byte) -107;
                                                        break L3;
                                                      } else {
                                                        if (var8 != 8211) {
                                                          if (8212 != var8) {
                                                            if (var8 != 732) {
                                                              if (var8 == 8482) {
                                                                param1[var7 + param5] = (byte) -103;
                                                                break L3;
                                                              } else {
                                                                if (var8 == 353) {
                                                                  param1[var7 + param5] = (byte) -102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 != 8250) {
                                                                    if (var8 == 339) {
                                                                      param1[var7 + param5] = (byte) -100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (var8 != 376) {
                                                                          param1[param5 - -var7] = (byte) 63;
                                                                          break L3;
                                                                        } else {
                                                                          param1[param5 - -var7] = (byte) -97;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param1[param5 + var7] = (byte) -98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param1[var7 + param5] = (byte) -101;
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              param1[param5 + var7] = (byte) -104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            param1[param5 + var7] = (byte) -105;
                                                            break L3;
                                                          }
                                                        } else {
                                                          param1[param5 - -var7] = (byte) -106;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      param1[var7 + param5] = (byte) -108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    param1[var7 + param5] = (byte) -109;
                                                    break L3;
                                                  }
                                                }
                                              }
                                            } else {
                                              param1[param5 + var7] = (byte) -114;
                                              break L3;
                                            }
                                          }
                                        } else {
                                          param1[var7 + param5] = (byte) -117;
                                          break L3;
                                        }
                                      } else {
                                        param1[param5 + var7] = (byte) -118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    param1[param5 + var7] = (byte) -120;
                                    break L3;
                                  }
                                } else {
                                  param1[var7 + param5] = (byte) -121;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      param1[param5 + var7] = (byte) -128;
                      break L3;
                    }
                  }
                  param1[var7 + param5] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("af.A(").append(0).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          L8: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param3 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L8;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L8;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    final qh a(int param0, int param1, ah param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        qh var6 = null;
        qh stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        qh stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5_int = 116 % ((26 - param0) / 42);
            var6 = new qh();
            var6.field_x = param3;
            var6.field_j = (long)param1;
            var6.field_v = false;
            var6.field_A = param2;
            var6.field_B = 2;
            this.a((byte) 101, var6);
            stackOut_0_0 = (qh) var6;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("af.F(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final qh a(int param0, int param1, ah param2) {
        qh var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        qh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qh stackOut_2_0 = null;
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
              var4 = new qh();
              var4.field_v = false;
              var4.field_A = param2;
              if (param0 >= 111) {
                break L1;
              } else {
                var5 = null;
                mk discarded$2 = af.a((byte) 74, 43, (String) null);
                break L1;
              }
            }
            var4.field_j = (long)param1;
            var4.field_B = 3;
            this.a((byte) 101, var4);
            stackOut_2_0 = (qh) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("af.E(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, boolean param1, String param2, byte param3) {
        try {
            if (param3 <= 26) {
                field_b = 37;
            }
            aa.field_s = param2;
            jk.field_j = param0;
            wf.a(ll.field_o, false, param1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "af.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(boolean param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((af) this).field_c = stackIn_3_1 != 0;
        var2 = (Object) (Object) ((af) this).field_e;
        synchronized (var2) {
          L1: {
            ((Object) (Object) ((af) this).field_e).notifyAll();
            break L1;
          }
        }
        try {
          L2: {
            ((af) this).field_h.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((af) this).field_h = null;
    }

    af(ce param0) {
        od var2 = null;
        ((af) this).field_e = new bf();
        ((af) this).field_c = false;
        ((af) this).field_d = 0;
        try {
            var2 = param0.a(4532, (Runnable) this, 5);
            while (var2.field_b == 0) {
                vh.a(10L, -101);
            }
            if (var2.field_b == 2) {
                throw new RuntimeException();
            }
            ((af) this).field_h = (Thread) var2.field_e;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "af.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0>Slopes:<%1> fleas can climb up and down ramps to reach different levels (these are the other type of tile you can place).";
    }
}

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
        var3 = new mk(false);
        var3.field_f = param1;
        var3.field_b = param2;
        if (param0 != 36) {
          return null;
        } else {
          return var3;
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (!param2) {
          return;
        } else {
          L0: {
            if ((ib.field_k ^ -1) <= -11) {
              if (wh.b(27415)) {
                if (-1 != (bh.field_t ^ -1)) {
                  bg.a((byte) -66, param0);
                  break L0;
                } else {
                  pd.a(param1, false, 0);
                  be.a(0, param0, (byte) -61, 0);
                  break L0;
                }
              } else {
                gb.c();
                hd.a(320, 240, -27794);
                be.a(0, param0, (byte) -29, 0);
                break L0;
              }
            } else {
              L1: {
                var3 = 0;
                if (j.field_e) {
                  var3 = 1;
                  j.field_e = false;
                  break L1;
                } else {
                  break L1;
                }
              }
              se.a(hl.d((byte) -85), ga.field_p, gk.a(-1917), var3 != 0, (byte) -81);
              break L0;
            }
          }
          return;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            qh var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = fleas.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((af) this).field_c) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((af) this).field_e;
                        // monitorenter ((af) this).field_e
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (qh) (Object) ((af) this).field_e.a(-123);
                            if (var7 != null) {
                                statePc = 10;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((Object) (Object) ((af) this).field_e).wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 7 : 12);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            interruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var2
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((af) this).field_d = ((af) this).field_d - 1;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 14: {
                        try {
                            if (var7.field_B == -3) {
                                statePc = 17;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-4 != var7.field_B) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var7.field_x = var7.field_A.a((byte) -90, (int)var7.field_j);
                            var7.field_q = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            boolean discarded$1 = var7.field_A.a(var7.field_x, var7.field_x.length, (int)var7.field_j, (byte) 93);
                            var7.field_q = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        ud.a((String) null, (Throwable) (Object) var2_ref, 0);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        var7.field_q = false;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 21: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        Object var5 = null;
        qh var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        qh stackIn_7_0 = null;
        qh stackIn_14_0 = null;
        qh stackIn_15_0 = null;
        qh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        qh stackOut_6_0 = null;
        qh stackOut_13_0 = null;
        qh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        qh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = fleas.field_A ? 1 : 0;
                    var4 = new qh();
                    var4.field_B = 1;
                    var5 = (Object) (Object) ((af) this).field_e;
                    // monitorenter ((af) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (qh) (Object) ((af) this).field_e.b((byte) 105);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var6.field_j != (long)param0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 != var6.field_A) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var6.field_B != 2) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4.field_q = false;
                        var4.field_x = var6.field_x;
                        // monitorexit var5
                        stackOut_6_0 = (qh) var4;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var6 = (qh) (Object) ((af) this).field_e.c((byte) 88);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) var7;
                }
                case 13: {
                    var4.field_x = param1.a((byte) -90, param0);
                    stackOut_13_0 = (qh) var4;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (!param2) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = (qh) (Object) stackIn_14_0;
                    stackOut_14_1 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = (qh) (Object) stackIn_15_0;
                    stackOut_15_1 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_16_0.field_v = stackIn_16_1 != 0;
                    var4.field_q = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, qh param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((af) this).field_e;
                    // monitorenter ((af) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((af) this).field_e.a((pa) (Object) param1, param0 ^ -1089421913);
                        if (param0 == 101) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_g = -128;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((af) this).field_d = ((af) this).field_d + 1;
                        ((Object) (Object) ((af) this).field_e).notifyAll();
                        // monitorexit var3
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var4;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 89) {
            Object var2 = null;
            int discarded$0 = af.a(-4, (byte[]) null, 19, (CharSequence) null, 98, 103);
        }
        field_f = null;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = fleas.field_A ? 1 : 0;
        var6 = -param0 + param2;
        var7 = 0;
        L0: while (true) {
          L1: {
            if (var7 >= var6) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    var8 = param3.charAt(param0 + var7);
                    if (var8 <= 0) {
                      break L4;
                    } else {
                      if (128 > var8) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var8 < 160) {
                      break L5;
                    } else {
                      if (var8 <= 255) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (8364 != var8) {
                      break L6;
                    } else {
                      param1[param5 + var7] = (byte)-128;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (8218 == var8) {
                      break L7;
                    } else {
                      L8: {
                        if (var8 == 402) {
                          break L8;
                        } else {
                          L9: {
                            if (8222 == var8) {
                              break L9;
                            } else {
                              L10: {
                                if (8230 == var8) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (var8 == 8224) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (8225 != var8) {
                                          break L12;
                                        } else {
                                          param1[var7 + param5] = (byte)-121;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L13: {
                                        if (710 != var8) {
                                          break L13;
                                        } else {
                                          param1[param5 + var7] = (byte)-120;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      L14: {
                                        if (8240 == var8) {
                                          break L14;
                                        } else {
                                          L15: {
                                            if (var8 != 352) {
                                              break L15;
                                            } else {
                                              param1[param5 + var7] = (byte)-118;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var8 != 8249) {
                                              break L16;
                                            } else {
                                              param1[var7 + param5] = (byte)-117;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (var8 == 338) {
                                              break L17;
                                            } else {
                                              L18: {
                                                if (var8 != 381) {
                                                  break L18;
                                                } else {
                                                  param1[param5 + var7] = (byte)-114;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              L19: {
                                                if (var8 == 8216) {
                                                  break L19;
                                                } else {
                                                  L20: {
                                                    if (var8 == 8217) {
                                                      break L20;
                                                    } else {
                                                      L21: {
                                                        if (var8 != 8220) {
                                                          break L21;
                                                        } else {
                                                          param1[var7 + param5] = (byte)-109;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                      L22: {
                                                        if (var8 != 8221) {
                                                          break L22;
                                                        } else {
                                                          param1[var7 + param5] = (byte)-108;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      L23: {
                                                        if (var8 == 8226) {
                                                          break L23;
                                                        } else {
                                                          L24: {
                                                            if (var8 != 8211) {
                                                              break L24;
                                                            } else {
                                                              param1[param5 - -var7] = (byte)-106;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L24;
                                                              }
                                                            }
                                                          }
                                                          L25: {
                                                            if (8212 != var8) {
                                                              break L25;
                                                            } else {
                                                              param1[param5 + var7] = (byte)-105;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                          L26: {
                                                            if (var8 != 732) {
                                                              break L26;
                                                            } else {
                                                              param1[param5 + var7] = (byte)-104;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L26;
                                                              }
                                                            }
                                                          }
                                                          L27: {
                                                            if (var8 == 8482) {
                                                              break L27;
                                                            } else {
                                                              L28: {
                                                                if (var8 == 353) {
                                                                  break L28;
                                                                } else {
                                                                  L29: {
                                                                    if (var8 != 8250) {
                                                                      break L29;
                                                                    } else {
                                                                      param1[var7 + param5] = (byte)-101;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L29;
                                                                      }
                                                                    }
                                                                  }
                                                                  L30: {
                                                                    if (var8 == 339) {
                                                                      break L30;
                                                                    } else {
                                                                      L31: {
                                                                        if (var8 != 382) {
                                                                          break L31;
                                                                        } else {
                                                                          param1[param5 + var7] = (byte)-98;
                                                                          if (0 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      L32: {
                                                                        if (var8 != 376) {
                                                                          break L32;
                                                                        } else {
                                                                          param1[param5 - -var7] = (byte)-97;
                                                                          if (0 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L32;
                                                                          }
                                                                        }
                                                                      }
                                                                      param1[param5 - -var7] = (byte)63;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  param1[var7 + param5] = (byte)-100;
                                                                  if (0 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                              param1[var7 + param5] = (byte)-102;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                          param1[var7 + param5] = (byte)-103;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                      }
                                                      param1[var7 + param5] = (byte)-107;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  param1[param5 + var7] = (byte)-110;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              param1[var7 + param5] = (byte)-111;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          param1[var7 + param5] = (byte)-116;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      param1[param5 + var7] = (byte)-119;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  param1[param5 + var7] = (byte)-122;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              param1[var7 + param5] = (byte)-123;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param1[param5 + var7] = (byte)-124;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                      param1[var7 + param5] = (byte)-125;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param1[var7 + param5] = (byte)-126;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                param1[var7 + param5] = (byte)var8;
                break L2;
              }
              var7++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L33: {
            if (param4 < -56) {
              break L33;
            } else {
              field_f = null;
              break L33;
            }
          }
          return var6;
        }
    }

    final qh a(int param0, int param1, ah param2, byte[] param3) {
        int var5 = 116 % ((26 - param0) / 42);
        qh var6 = new qh();
        var6.field_x = param3;
        var6.field_j = (long)param1;
        var6.field_v = false;
        var6.field_A = param2;
        var6.field_B = 2;
        this.a((byte) 101, var6);
        return var6;
    }

    final qh a(int param0, int param1, ah param2) {
        qh var4 = new qh();
        var4.field_v = false;
        var4.field_A = param2;
        if (param0 < 111) {
            Object var5 = null;
            mk discarded$0 = af.a((byte) 74, 43, (String) null);
        }
        var4.field_j = (long)param1;
        var4.field_B = 3;
        this.a((byte) 101, var4);
        return var4;
    }

    final static void a(String param0, boolean param1, String param2, byte param3) {
        if (param3 <= 26) {
            field_b = 37;
        }
        aa.field_s = param2;
        jk.field_j = param0;
        wf.a(ll.field_o, false, param1);
    }

    final void a(boolean param0) {
        ((af) this).field_c = param0 ? true : false;
        Object var2 = (Object) (Object) ((af) this).field_e;
        // monitorenter ((af) this).field_e
        ((Object) (Object) ((af) this).field_e).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((af) this).field_h.join();
        } catch (InterruptedException interruptedException) {
        }
        ((af) this).field_h = null;
    }

    af(ce param0) {
        ((af) this).field_e = new bf();
        ((af) this).field_c = false;
        ((af) this).field_d = 0;
        od var2 = param0.a(4532, (Runnable) this, 5);
        while (var2.field_b == 0) {
            vh.a(10L, -101);
        }
        if (var2.field_b == 2) {
            throw new RuntimeException();
        }
        ((af) this).field_h = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0>Slopes:<%1> fleas can climb up and down ramps to reach different levels (these are the other type of tile you can place).";
    }
}

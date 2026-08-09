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
        mk stackIn_2_0 = null;
        mk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new mk(false);
            var3.field_f = param1;
            var3.field_b = param2;
            if (param0 == 36) {
              stackIn_4_0 = (mk) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (mk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("af.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2) {
              L1: {
                L2: {
                  if ((ib.field_k ^ -1) <= -11) {
                    break L2;
                  } else {
                    L3: {
                      var3_int = 0;
                      if (j.field_e) {
                        var3_int = 1;
                        j.field_e = false;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    se.a(hl.d((byte) -85), ga.field_p, gk.a(-1917), var3_int != 0, (byte) -81);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (wh.b(27415)) {
                    break L4;
                  } else {
                    gb.c();
                    hd.a(320, 240, -27794);
                    be.a(0, param0, (byte) -29, 0);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (-1 != (bh.field_t ^ -1)) {
                    break L5;
                  } else {
                    pd.a(param1, false, 0);
                    be.a(0, param0, (byte) -61, 0);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                bg.a((byte) -66, param0);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("af.G(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            qh var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            Exception var2_ref2 = null;
            String var6 = null;
            var5 = fleas.field_A ? 1 : 0;
            L0: while (true) {
              L1: {
                if (this.field_c) {
                  break L1;
                } else {
                  var2_ref = this.field_e;
                  synchronized (var2_ref) {
                    L2: {
                      var7 = (qh) ((Object) this.field_e.a(-123));
                      if (var5 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L2;
                      } else {
                        L3: {
                          if (var7 != null) {
                            break L3;
                          } else {
                            try {
                              L4: {
                                this.field_e.wait();
                                break L4;
                              }
                            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L5: {
                                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                                break L5;
                              }
                            }
                            if (var5 == 0) {
                              decompiledRegionSelector0 = 1;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        this.field_d = this.field_d - 1;
                        decompiledRegionSelector0 = 2;
                        break L2;
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L1;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      continue L0;
                    } else {
                      try {
                        L6: {
                          L7: {
                            L8: {
                              if ((var7.field_B ^ -1) == -3) {
                                break L8;
                              } else {
                                if (-4 != (var7.field_B ^ -1)) {
                                  break L7;
                                } else {
                                  var7.field_x = var7.field_A.a((byte) -90, (int)var7.field_j);
                                  if (var5 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            var7.field_A.a(var7.field_x, var7.field_x.length, (int)var7.field_j, (byte) 93);
                            break L7;
                          }
                          break L6;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L9: {
                          var2_ref2 = (Exception) (Object) decompiledCaughtException;
                          var6 = (String) null;
                          ud.a((String) null, (Throwable) ((Object) var2_ref2), 0);
                          break L9;
                        }
                      }
                      var7.field_q = false;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              return;
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
        Object var5_ref = null;
        qh var6 = null;
        int var8 = 0;
        qh stackIn_9_0 = null;
        qh stackIn_17_0 = null;
        qh stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        qh stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = new qh();
            var4.field_B = 1;
            var5_ref = this.field_e;
            synchronized (var5_ref) {
              L1: {
                var6 = (qh) ((Object) this.field_e.b((byte) 105));
                L2: while (true) {
                  L3: {
                    if (var6 == null) {
                      break L3;
                    } else {
                      stackIn_19_0 = (qh) (var6);

                      if (var8 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_19_0.field_j != (long)param0) {
                            break L4;
                          } else {
                            if (param1 != var6.field_A) {
                              break L4;
                            } else {
                              if (var6.field_B != 2) {
                                break L4;
                              } else {
                                var4.field_q = false;
                                var4.field_x = var6.field_x;
                                stackIn_9_0 = (qh) (var4);
                                return stackIn_9_0;
                              }
                            }
                          }
                        }
                        var6 = (qh) ((Object) this.field_e.c((byte) 88));
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            }
            L5: {
              if (decompiledRegionSelector0 == 0) {
                break L5;
              } else {
                L6: {
                  var4.field_x = param1.a((byte) -90, param0);
                  stackIn_17_0 = (qh) (var4);

                  if (!param2) {
                    stackIn_18_0 = (qh) ((Object) stackIn_17_0);
                    stackIn_18_1 = 0;
                    break L6;
                  } else {
                    stackIn_18_0 = (qh) ((Object) stackIn_17_0);
                    stackIn_18_1 = 1;
                    break L6;
                  }
                }
                stackIn_18_0.field_v = stackIn_18_1 != 0;
                var4.field_q = false;
                stackIn_19_0 = (qh) (var4);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4_ref);

            stackIn_22_1 = new StringBuilder().append("af.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    private final void a(byte param0, qh param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = this.field_e;
            synchronized (var3) {
              L1: {
                L2: {
                  this.field_e.a(param1, param0 ^ -1089421913);
                  if (param0 == 101) {
                    break L2;
                  } else {
                    field_g = -128;
                    break L2;
                  }
                }
                this.field_d = this.field_d + 1;
                this.field_e.notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("af.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 89) {
            CharSequence var2 = (CharSequence) null;
            af.a(-4, (byte[]) null, 19, (CharSequence) null, 98, 103);
        }
        field_f = null;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        int stackIn_4_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = -param0 + param2;
                        var7 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var7 >= var6_int) {
                            statePc = 95;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = param3.charAt(param0 + var7);
                        stackIn_96_0 = var8;
                        stackIn_4_0 = stackIn_96_0;
                        if (var9 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 <= 0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (128 > var8) {
                            statePc = 93;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 < 160) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 <= 255) {
                            statePc = 93;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (8364 != var8) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param1[param5 + var7] = (byte)-128;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (8218 == var8) {
                            statePc = 91;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 402) {
                            statePc = 89;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (8222 == var8) {
                            statePc = 87;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (8230 == var8) {
                            statePc = 85;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var8 == 8224) {
                            statePc = 83;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (8225 != var8) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param1[var7 + param5] = (byte)-121;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (710 != var8) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param1[param5 + var7] = (byte)-120;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (8240 == var8) {
                            statePc = 81;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var8 != 352) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param1[param5 + var7] = (byte)-118;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var8 != 8249) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        param1[var7 + param5] = (byte)-117;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var8 == 338) {
                            statePc = 79;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var8 != 381) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        param1[param5 + var7] = (byte)-114;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var8 == 8216) {
                            statePc = 77;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var8 == 8217) {
                            statePc = 75;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var8 != 8220) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        param1[var7 + param5] = (byte)-109;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var8 != 8221) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        param1[var7 + param5] = (byte)-108;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var8 == 8226) {
                            statePc = 73;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var8 != 8211) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        param1[param5 - -var7] = (byte)-106;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (8212 != var8) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        param1[param5 + var7] = (byte)-105;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var8 != 732) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        param1[param5 + var7] = (byte)-104;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var8 == 8482) {
                            statePc = 71;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var8 == 353) {
                            statePc = 69;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var8 != 8250) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        param1[var7 + param5] = (byte)-101;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var8 == 339) {
                            statePc = 67;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var8 != 382) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        param1[param5 + var7] = (byte)-98;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var8 != 376) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        param1[param5 - -var7] = (byte)-97;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        param1[param5 - -var7] = (byte)63;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        param1[var7 + param5] = (byte)-100;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        param1[var7 + param5] = (byte)-102;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        param1[var7 + param5] = (byte)-103;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        param1[var7 + param5] = (byte)-107;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        param1[param5 + var7] = (byte)-110;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        param1[var7 + param5] = (byte)-111;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        param1[var7 + param5] = (byte)-116;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        param1[param5 + var7] = (byte)-119;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        param1[param5 + var7] = (byte)-122;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        param1[var7 + param5] = (byte)-123;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        param1[param5 + var7] = (byte)-124;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        param1[var7 + param5] = (byte)-125;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        param1[var7 + param5] = (byte)-126;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        param1[var7 + param5] = (byte)var8;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackIn_96_0 = param4;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (stackIn_96_0 < -56) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        field_f = (ce) null;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackIn_99_0 = var6_int;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 99: {
                    return stackIn_99_0;
                }
                case 100: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_102_0 = (RuntimeException) (var6);
                    stackIn_101_0 = stackIn_102_0;
                    stackIn_102_1 = new StringBuilder().append("af.A(").append(param0).append(',');
                    stackIn_101_1 = stackIn_102_1;
                    if (param1 == null) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_103_0 = (RuntimeException) ((Object) stackIn_101_0);
                    stackIn_103_1 = (StringBuilder) ((Object) stackIn_101_1);
                    stackIn_103_2 = "{...}";
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
                    stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
                    stackIn_103_2 = "null";
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_105_0 = (RuntimeException) ((Object) stackIn_103_0);
                    stackIn_104_0 = stackIn_105_0;
                    stackIn_105_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(',').append(param2).append(',');
                    stackIn_104_1 = stackIn_105_1;
                    if (param3 == null) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_106_0 = (RuntimeException) ((Object) stackIn_104_0);
                    stackIn_106_1 = (StringBuilder) ((Object) stackIn_104_1);
                    stackIn_106_2 = "{...}";
                    statePc = 106;
                    continue stateLoop;
                }
                case 105: {
                    stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
                    stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
                    stackIn_106_2 = "null";
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    throw pf.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ',' + param4 + ',' + param5 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final qh a(int param0, int param1, ah param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        qh var6 = null;
        qh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_1_0 = (qh) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("af.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final qh a(int param0, int param1, ah param2) {
        qh var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        qh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new qh();
              var4.field_v = false;
              var4.field_A = param2;
              if (param0 >= 111) {
                break L1;
              } else {
                var5 = (String) null;
                af.a((byte) 74, 43, (String) null);
                break L1;
              }
            }
            var4.field_j = (long)param1;
            var4.field_B = 3;
            this.a((byte) 101, var4);
            stackIn_3_0 = (qh) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("af.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
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
            throw pf.a((Throwable) ((Object) runtimeException), "af.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(boolean param0) {
        try {
            this.field_c = param0 ? true : false;
            synchronized (this.field_e) {
                this.field_e.notifyAll();
            }
            try {
                this.field_h.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    af(ce param0) {
        RuntimeException runtimeException = null;
        od var2 = null;
        int var3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = fleas.field_A ? 1 : 0;
                    this.field_e = new bf();
                    this.field_c = false;
                    this.field_d = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0.a(4532, (Runnable) (this), 5);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2.field_b != 0) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vh.a(10L, -101);
                        if (var3 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var2.field_b != 2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_h = (Thread) (var2.field_e);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (runtimeException);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("af.<init>(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = "<%0>Slopes:<%1> fleas can climb up and down ramps to reach different levels (these are the other type of tile you can place).";
    }
}

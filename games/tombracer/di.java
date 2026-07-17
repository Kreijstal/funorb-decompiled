/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    private boolean field_e;
    private ei[] field_b;
    private d field_c;
    static boolean[] field_f;
    iqa field_i;
    static int field_a;
    static boolean[] field_g;
    static String field_h;
    static iw field_d;

    final void a(int param0, ei[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param0 == 0) {
              L1: {
                if (param1 != ((di) this).field_b) {
                  if (param1.length != 0) {
                    ((di) this).field_e = false;
                    ((di) this).field_b = param1;
                    break L1;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
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
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("di.A(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != -22765) {
            return;
        }
        field_h = null;
        field_d = null;
    }

    di(d param0, ei[] param1) {
        this(tba.a((byte) 98), cfa.e(-1), param0, dsa.field_c, param1);
    }

    final boolean b(int param0) {
        if (param0 != 100663296) {
            return false;
        }
        return this.a(-101, kw.b((byte) -97));
    }

    final static void a(byte param0, boolean param1) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = TombRacer.field_G ? 1 : 0;
            if (param1) {
              break L1;
            } else {
              if (uu.field_a != null) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          tla.field_e = false;
          break L0;
        }
        L2: {
          if (param1) {
            if (mla.field_a > 0) {
              mla.field_a = mla.field_a - 1;
              break L2;
            } else {
              if (gt.field_a > 0) {
                gt.field_a = gt.field_a - 1;
                break L2;
              } else {
                if (fp.field_e <= 0) {
                  break L2;
                } else {
                  fp.field_e = fp.field_e - 1;
                  break L2;
                }
              }
            }
          } else {
            if (null == uu.field_a) {
              if (ifa.field_n == null) {
                tla.field_e = false;
                if (0 < gt.field_a) {
                  gt.field_a = gt.field_a - 1;
                  break L2;
                } else {
                  if (0 < fp.field_e) {
                    fp.field_e = fp.field_e - 1;
                    break L2;
                  } else {
                    if (mla.field_a < pna.field_q) {
                      L3: {
                        if (mla.field_a != 0) {
                          break L3;
                        } else {
                          csa.a(false);
                          break L3;
                        }
                      }
                      mla.field_a = mla.field_a + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                if (mla.field_a > 0) {
                  mla.field_a = mla.field_a - 1;
                  break L2;
                } else {
                  if (fp.field_e <= 0) {
                    if (pna.field_q <= gt.field_a) {
                      break L2;
                    } else {
                      iw.a((byte) -64, true);
                      gt.field_a = gt.field_a + 1;
                      break L2;
                    }
                  } else {
                    fp.field_e = fp.field_e - 1;
                    break L2;
                  }
                }
              }
            } else {
              if (0 < mla.field_a) {
                mla.field_a = mla.field_a - 1;
                break L2;
              } else {
                if (gt.field_a > 0) {
                  gt.field_a = gt.field_a - 1;
                  break L2;
                } else {
                  if (fp.field_e < pna.field_q) {
                    L4: {
                      if (0 != fp.field_e) {
                        break L4;
                      } else {
                        iw.a((byte) -64, false);
                        break L4;
                      }
                    }
                    fp.field_e = fp.field_e + 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
        }
        L5: {
          if (param0 == -98) {
            break L5;
          } else {
            java.applet.Applet discarded$1 = di.a(57);
            break L5;
          }
        }
    }

    private final void a(java.awt.Canvas param0, byte param1) {
        Object var3 = null;
        int var4 = 0;
        ei[] var5 = null;
        int var6 = 0;
        Object var7 = null;
        ei var7_ref = null;
        RuntimeException var8 = null;
        int var8_int = 0;
        iqa var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        ha var12 = null;
        Object stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        Object stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        Object stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        Object stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        Object stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        Object stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = null;
                        var4 = -17;
                        var5 = ((di) this).field_b;
                        var6 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5.length <= var6) {
                            statePc = 115;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7_ref = var5[var6];
                        if (var7_ref.field_c) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8_int = var7_ref.field_b;
                        if (var8_int != 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8_int == 5) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (1 != var8_int) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var8_int != 3) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8_int != 2) {
                            statePc = 79;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (lga.field_B.b(-35)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        var8_int = sma.a("hw3d", 28893);
                        if (var8_int != -1) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var8_int >= 100) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return;
                }
                case 22: {
                    try {
                        var9_int = sma.a("jaclib", 28893);
                        if (var9_int != -1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var9_int < 100) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        var10 = sma.a("jaggl", 28893);
                        if (var10 != -1) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var10 < 100) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return;
                }
                case 32: {
                    try {
                        if (lga.field_B.b(-53)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return;
                }
                case 34: {
                    try {
                        var8_int = sma.a("jaclib", 28893);
                        if (var8_int == -1) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (100 > var8_int) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return;
                }
                case 40: {
                    try {
                        var9_int = sma.a("jaggl", 28893);
                        if (-1 != var9_int) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var9_int < 100) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return;
                }
                case 45: {
                    try {
                        if (!lga.field_B.b(-63)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return;
                }
                case 48: {
                    try {
                        var8_int = sma.a("jaclib", 28893);
                        if (var8_int != -1) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var8_int >= 100) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 52: {
                    return;
                }
                case 53: {
                    try {
                        var9_int = sma.a("jagdx", 28893);
                        if (var9_int == -1) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (100 <= var9_int) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 58: {
                    return;
                }
                case 59: {
                    try {
                        var10 = sma.a("hw3d", 28893);
                        if (-1 == var10) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var10 < 100) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 64: {
                    return;
                }
                case 65: {
                    try {
                        if (!lga.field_B.b(-63)) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 67: {
                    return;
                }
                case 68: {
                    try {
                        var8_int = sma.a("jaclib", 28893);
                        if (-1 == var8_int) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (100 > var8_int) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 73: {
                    return;
                }
                case 74: {
                    try {
                        var9_int = sma.a("sw3d", 28893);
                        if (var9_int != -1) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var9_int >= 100) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 78: {
                    return;
                }
                case 79: {
                    try {
                        throw new IllegalStateException("UT" + var7_ref.field_b);
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (null == ((di) this).field_i) {
                            statePc = 90;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (!((di) this).field_i.field_b.a(var7_ref, 55)) {
                            statePc = 87;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (null == ((di) this).field_i.field_d) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (((di) this).field_i.field_a != param0) {
                            statePc = 87;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (!var7_ref.a(((di) this).field_i, (byte) -126)) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ((di) this).field_e = true;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 86: {
                    return;
                }
                case 87: {
                    try {
                        if (((di) this).field_i.field_b.field_b != var7_ref.field_b) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (((di) this).field_i.field_d == null) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var3 = (Object) (Object) ((di) this).field_i.a((byte) -43);
                        ((di) this).field_i.field_d.a(true);
                        ((di) this).field_i = null;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var12 = nw.a(var7_ref.field_a, -29355, ((di) this).field_c, var7_ref.field_b, ck.field_a, param0);
                        if (var12 != null) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var9 = new iqa(var12, var7_ref, param0);
                        if (!var7_ref.a(var9, (byte) -126)) {
                            statePc = 108;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (((di) this).field_i == null) {
                            statePc = 99;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var9.field_d != ((di) this).field_i.field_d) {
                            statePc = 98;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (((di) this).field_i.field_a != var9.field_a) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        ((di) this).field_e = true;
                        ((di) this).field_i = var9;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 97: {
                    return;
                }
                case 98: {
                    try {
                        var3 = (Object) (Object) ((di) this).field_i.a((byte) -124);
                        ((di) this).field_i.field_d.a(true);
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (!var9.field_d.j()) {
                            statePc = 101;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var9.field_d.a(var9.field_d.a(100663296));
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (var3 == null) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        ((soa) var3).a((byte) -77, var9);
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var9.field_f = bva.b((byte) -107);
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        ((di) this).field_e = true;
                        ((di) this).field_i = var9;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    return;
                }
                case 107: {
                    try {
                        var8 = (RuntimeException) (Object) caughtException;
                        var8.printStackTrace();
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var7_ref.field_c = false;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var6++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 111: {
                    var3 = (Object) (Object) caughtException;
                    stackOut_111_0 = var3;
                    stackOut_111_1 = new StringBuilder().append("di.E(");
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_113_1 = stackOut_111_1;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    if (param0 == null) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    stackOut_112_0 = stackIn_112_0;
                    stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
                    stackOut_112_2 = "{...}";
                    stackIn_114_0 = stackOut_112_0;
                    stackIn_114_1 = stackOut_112_1;
                    stackIn_114_2 = stackOut_112_2;
                    statePc = 114;
                    continue stateLoop;
                }
                case 113: {
                    stackOut_113_0 = stackIn_113_0;
                    stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
                    stackOut_113_2 = "null";
                    stackIn_114_0 = stackOut_113_0;
                    stackIn_114_1 = stackOut_113_1;
                    stackIn_114_2 = stackOut_113_2;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    throw tba.a((Throwable) (Object) stackIn_114_0, stackIn_114_2 + 44 + -70 + 41);
                }
                case 115: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, java.awt.Canvas param1) {
        iqa var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -101) {
                break L1;
              } else {
                ((di) this).field_e = true;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = ((di) this).field_i;
                if (var3 == null) {
                  break L3;
                } else {
                  if (!((di) this).field_e) {
                    break L3;
                  } else {
                    if (var3.field_a == param1) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.a(param1, (byte) -70);
              break L2;
            }
            L4: {
              if (null != ((di) this).field_i) {
                ((di) this).field_i.field_d.c((int)(bva.b((byte) -107) - ((di) this).field_i.field_f));
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              L6: {
                if (null == ((di) this).field_i) {
                  break L6;
                } else {
                  L7: {
                    if (var3 == null) {
                      break L7;
                    } else {
                      if (var3.field_d == ((di) this).field_i.field_d) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L5;
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("di.H(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0 != 0;
    }

    private di(cn param0, cn param1, d param2, fia param3, ei[] param4) {
        ((di) this).field_e = false;
        try {
            ((di) this).field_c = param2;
            ck.field_a = param1;
            lga.field_B = param0;
            vsa.a(param0, param3, -55);
            ((di) this).a(0, param4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "di.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(uia param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              var2_int = param0.h(255);
              if (var2_int != 1) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            stackOut_3_0 = var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("di.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 107 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static java.applet.Applet a(int param0) {
        if (param0 <= 16) {
            field_d = null;
        }
        if (!(cba.field_a == null)) {
            return cba.field_a;
        }
        return (java.applet.Applet) (Object) kua.field_j;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new boolean[13];
        field_g = new boolean[13];
        field_h = "Ask to join <%0>'s game";
        field_g[6] = true;
        field_g[0] = true;
        field_f[0] = true;
        field_f[6] = true;
        field_f[1] = true;
        field_f[12] = true;
        field_f[4] = true;
        field_f[10] = true;
        field_d = new iw();
    }
}

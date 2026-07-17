/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    private nj[] field_a;
    private d field_e;
    static ki field_d;
    private boolean field_b;
    private bk field_c;

    private final void a(nj[] param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0 == ((ik) this).field_a) {
                break L1;
              } else {
                if (param0.length != 0) {
                  ((ik) this).field_a = param0;
                  ((ik) this).field_b = false;
                  break L1;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("ik.G(");
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
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 97 + 41);
        }
    }

    final static int c(int param0) {
        L0: {
          if (param0 == -10517) {
            break L0;
          } else {
            int discarded$2 = ik.c(113);
            break L0;
          }
        }
        L1: {
          if (!oj.a(false)) {
            break L1;
          } else {
            if (null != pu.field_e.e((byte) 54)) {
              return pu.field_e.e((byte) 54).field_r;
            } else {
              break L1;
            }
          }
        }
        return -1;
    }

    final boolean a(boolean param0) {
        if (param0) {
            ((ik) this).field_e = null;
        }
        return this.a(hk.b(-45), 89);
    }

    public static void b(int param0) {
        field_d = null;
    }

    private final boolean a(java.awt.Canvas param0, int param1) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
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
            L1: {
              L2: {
                var3 = ((ik) this).field_c;
                if (var3 == null) {
                  break L2;
                } else {
                  if (!((ik) this).field_b) {
                    break L2;
                  } else {
                    if (param0 != var3.field_c) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              this.a(-101, param0);
              break L1;
            }
            L3: {
              var4 = -113;
              if (((ik) this).field_c == null) {
                break L3;
              } else {
                ((ik) this).field_c.field_g.f((int)(wq.a(-116) + -((ik) this).field_c.field_f));
                break L3;
              }
            }
            L4: {
              L5: {
                if (null == ((ik) this).field_c) {
                  break L5;
                } else {
                  L6: {
                    if (var3 == null) {
                      break L6;
                    } else {
                      if (((ik) this).field_c.field_g == var3.field_g) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L4;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("ik.A(");
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
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 89 + 41);
        }
        return stackIn_13_0 != 0;
    }

    private final void a(int param0, java.awt.Canvas param1) {
        Object var3 = null;
        nj[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        nj var6_ref = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        bk var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        Object stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        Object stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        Object stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        Object stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        Object stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        Object stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = null;
                        if (param0 == -101) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ha discarded$1 = ((ik) this).a(-39);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = ((ik) this).field_a;
                        var5 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 >= var4.length) {
                            statePc = 117;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6_ref = var4[var5];
                        if (var6_ref.field_f) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7_int = var6_ref.field_c;
                        if (var7_int != 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7_int == 5) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (1 != var7_int) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7_int == 3) {
                            statePc = 47;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7_int != 2) {
                            statePc = 78;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!sn.field_d.b((byte) 127)) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        var7_int = ig.a("hw3d", true);
                        if (var7_int != -1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (100 <= var7_int) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return;
                }
                case 23: {
                    try {
                        var8_int = ig.a("jaclib", true);
                        if (var8_int != -1) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var8_int >= 100) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return;
                }
                case 28: {
                    try {
                        var9 = ig.a("jaggl", true);
                        if (var9 != -1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var9 >= 100) {
                            statePc = 79;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return;
                }
                case 33: {
                    try {
                        if (!sn.field_d.b((byte) 127)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return;
                }
                case 36: {
                    try {
                        var7_int = ig.a("jaclib", true);
                        if (-1 != var7_int) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (100 <= var7_int) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return;
                }
                case 41: {
                    try {
                        var8_int = ig.a("jaggl", true);
                        if (var8_int == -1) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var8_int < 100) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return;
                }
                case 47: {
                    try {
                        if (sn.field_d.b((byte) 127)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 48: {
                    return;
                }
                case 49: {
                    try {
                        var7_int = ig.a("jaclib", true);
                        if (var7_int == -1) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var7_int < 100) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 54: {
                    return;
                }
                case 55: {
                    try {
                        var8_int = ig.a("jagdx", true);
                        if (var8_int != -1) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var8_int >= 100) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 59: {
                    return;
                }
                case 60: {
                    try {
                        var9 = ig.a("hw3d", true);
                        if (var9 == -1) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (100 <= var9) {
                            statePc = 79;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 65: {
                    return;
                }
                case 66: {
                    try {
                        if (sn.field_d.b((byte) 127)) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 67: {
                    return;
                }
                case 68: {
                    try {
                        var7_int = ig.a("jaclib", true);
                        if (var7_int != -1) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (100 <= var7_int) {
                            statePc = 73;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 72: {
                    return;
                }
                case 73: {
                    try {
                        var8_int = ig.a("sw3d", true);
                        if (var8_int != -1) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (100 <= var8_int) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 77: {
                    return;
                }
                case 78: {
                    try {
                        throw new IllegalStateException("UT" + var6_ref.field_c);
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (null == ((ik) this).field_c) {
                            statePc = 90;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (!((ik) this).field_c.field_d.a(var6_ref, (byte) 95)) {
                            statePc = 86;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (null == ((ik) this).field_c.field_g) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (((ik) this).field_c.field_c != param1) {
                            statePc = 86;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (!var6_ref.a(((ik) this).field_c, (byte) -123)) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        ((ik) this).field_b = true;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 85: {
                    return;
                }
                case 86: {
                    try {
                        if (~((ik) this).field_c.field_d.field_c != ~var6_ref.field_c) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (((ik) this).field_c.field_g != null) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var3 = (Object) (Object) ((ik) this).field_c.b(-43);
                        ((ik) this).field_c.field_g.a((byte) -94);
                        ((ik) this).field_c = null;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var11 = ks.a(var6_ref.field_c, param1, ((ik) this).field_e, true, var6_ref.field_g, ha.field_g);
                        if (var11 != null) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var8 = new bk(var11, var6_ref, param1);
                        if (!var6_ref.a(var8, (byte) -36)) {
                            statePc = 110;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (((ik) this).field_c == null) {
                            statePc = 100;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var8.field_g != ((ik) this).field_c.field_g) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var8.field_c == ((ik) this).field_c.field_c) {
                            statePc = 97;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        ((ik) this).field_c = var8;
                        ((ik) this).field_b = true;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 98: {
                    return;
                }
                case 99: {
                    try {
                        var3 = (Object) (Object) ((ik) this).field_c.b(79);
                        ((ik) this).field_c.field_g.a((byte) -109);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (var8.field_g.c()) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var8.field_g.a(var8.field_g.c(100663296));
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (var3 == null) {
                            statePc = 105;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        ((cj) var3).a(var8, 3);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var8.field_f = wq.a(param0 + 59);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        ((ik) this).field_b = true;
                        ((ik) this).field_c = var8;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 107: {
                    return;
                }
                case 109: {
                    try {
                        var7 = (RuntimeException) (Object) caughtException;
                        var7.printStackTrace();
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var6_ref.field_f = false;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var5++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 113: {
                    var3 = (Object) (Object) caughtException;
                    stackOut_113_0 = var3;
                    stackOut_113_1 = new StringBuilder().append("ik.B(").append(param0).append(44);
                    stackIn_115_0 = stackOut_113_0;
                    stackIn_115_1 = stackOut_113_1;
                    stackIn_114_0 = stackOut_113_0;
                    stackIn_114_1 = stackOut_113_1;
                    if (param1 == null) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackOut_114_0 = stackIn_114_0;
                    stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
                    stackOut_114_2 = "{...}";
                    stackIn_116_0 = stackOut_114_0;
                    stackIn_116_1 = stackOut_114_1;
                    stackIn_116_2 = stackOut_114_2;
                    statePc = 116;
                    continue stateLoop;
                }
                case 115: {
                    stackOut_115_0 = stackIn_115_0;
                    stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
                    stackOut_115_2 = "null";
                    stackIn_116_0 = stackOut_115_0;
                    stackIn_116_1 = stackOut_115_1;
                    stackIn_116_2 = stackOut_115_2;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    throw qo.a((Throwable) (Object) stackIn_116_0, stackIn_116_2 + 41);
                }
                case 117: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ha a(int param0) {
        if (param0 >= -89) {
            return null;
        }
        if (((ik) this).field_c == null) {
            return null;
        }
        return ((ik) this).field_c.field_g;
    }

    ik(int param0, int param1, d param2) {
        this(kd.a((byte) -123, param0), vo.b(param1, -1), param2, lt.field_m, ms.b(-16754));
    }

    private ik(ki param0, ki param1, d param2, wi param3, nj[] param4) {
        ((ik) this).field_b = false;
        try {
            ha.field_g = param1;
            ((ik) this).field_e = param2;
            sn.field_d = param0;
            ow.a(-18527, param0, param3);
            this.a(param4, 97);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ik.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}

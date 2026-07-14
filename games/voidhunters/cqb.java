/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cqb extends wm implements ntb {
    static boolean field_e;
    private int field_d;
    private int field_c;
    static String field_f;

    final String a(int param0) {
        if (param0 != -1) {
          cqb.a(104, -21, -70, -33, (byte) -17);
          return "Variable " + ((cqb) this).field_c + " at least " + ((cqb) this).field_d;
        } else {
          return "Variable " + ((cqb) this).field_c + " at least " + ((cqb) this).field_d;
        }
    }

    public final boolean a(byte param0, tv param1) {
        cqb var3 = null;
        int var4 = 0;
        var3 = (cqb) (Object) param1;
        var4 = 7 % ((22 - param0) / 59);
        if (!super.a((byte) 116, param1)) {
          if (var3.field_c == ((cqb) this).field_c) {
            if (var3.field_d != ((cqb) this).field_d) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void c(int param0) {
        int var1 = -104 / ((param0 - -54) / 51);
        field_f = null;
    }

    final boolean a(int param0, lbb param1, pe param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            ((cqb) this).field_d = 113;
            if (param1.b(7061, ((cqb) this).field_c) < ((cqb) this).field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param1.b(7061, ((cqb) this).field_c) < ((cqb) this).field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static rn d(int param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        rn var2 = null;
        rn stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        rn stackOut_5_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 10) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    try {
                        var1_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = lnb.field_i.a((byte) -72, var1_int);
                        if (var2.field_k) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (rn) var2;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        var1_int++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1 = (IllegalArgumentException) (Object) caughtException;
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void b(byte param0, tv param1) {
        cqb var5 = null;
        cqb var5_ref = null;
        cqb var6 = null;
        cqb var8 = null;
        cqb var11 = null;
        var5 = null;
        if (param0 <= 54) {
          int discarded$2 = ((cqb) this).a((byte) -47, -43);
          super.b((byte) 82, param1);
          var5_ref = (cqb) (Object) param1;
          var6 = var5_ref;
          var5 = var6;
          var6.field_d = var5.field_d;
          var6.field_c = var5.field_c;
          return;
        } else {
          super.b((byte) 82, param1);
          var11 = (cqb) (Object) param1;
          var5 = var11;
          var8 = var11;
          var8.field_d = var11.field_d;
          var8.field_c = var11.field_c;
          return;
        }
    }

    final static void b(byte param0) {
        pja.e(-110);
        int var1 = -25 / ((46 - param0) / 35);
    }

    final ucb[] a(pe param0, int param1) {
        if (param1 == -20605) {
            return null;
        }
        return null;
    }

    cqb() {
    }

    final void a(pe param0, int param1, int param2, int param3) {
        if (param2 == 0) {
          ((cqb) this).field_c = param3;
          if (0 > ((cqb) this).field_c) {
            ((cqb) this).field_c = 0;
            if (param1 != -2) {
              cqb.c(80);
              return;
            } else {
              return;
            }
          } else {
            if (param1 == -2) {
              return;
            } else {
              cqb.c(80);
              return;
            }
          }
        } else {
          ((cqb) this).field_d = param3;
          if (param1 == -2) {
            return;
          } else {
            cqb.c(80);
            return;
          }
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -120);
        param0.a(-632, ((cqb) this).field_c, 32);
        if (param1 > -109) {
          return;
        } else {
          param0.a(-632, ((cqb) this).field_d, 32);
          return;
        }
    }

    cqb(int param0, int param1) {
        ((cqb) this).field_c = param0;
        ((cqb) this).field_d = param1;
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((cqb) this).field_c = param0.i(0, 32);
        ((cqb) this).field_d = param0.i(0, 32);
    }

    final static void b(int param0) {
        int var2 = 0;
        String[] stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        String[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        String[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        String stackIn_4_2 = null;
        String[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        String[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_20_2 = null;
        String[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        String[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        String[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        String stackIn_27_2 = null;
        String[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        String[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        String stackOut_26_2 = null;
        String[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        String stackOut_25_2 = null;
        String[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        String[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        String stackOut_19_2 = null;
        String[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        String stackOut_18_2 = null;
        String[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        String[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        String[] stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        String[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        String stackOut_3_2 = null;
        String[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        String stackOut_2_2 = null;
        var2 = VoidHunters.field_G;
        if ((1 << vqa.field_g.field_L & vqa.field_g.field_m.field_k) == 0) {
          if (vqa.field_g.field_m.field_k != 0) {
            L0: {
              stackOut_24_0 = ifa.field_g;
              stackOut_24_1 = 10;
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              if (vqa.field_g.field_h) {
                stackOut_26_0 = (String[]) (Object) stackIn_26_0;
                stackOut_26_1 = stackIn_26_1;
                stackOut_26_2 = gdb.field_d;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                stackIn_27_2 = stackOut_26_2;
                break L0;
              } else {
                stackOut_25_0 = (String[]) (Object) stackIn_25_0;
                stackOut_25_1 = stackIn_25_1;
                stackOut_25_2 = wpb.field_o;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_27_2 = stackOut_25_2;
                break L0;
              }
            }
            stackIn_27_0[stackIn_27_1] = stackIn_27_2;
            if (param0 > -76) {
              field_e = false;
              return;
            } else {
              return;
            }
          } else {
            if ((vqa.field_g.field_B | 1 << vqa.field_g.field_L) == -1 + (1 << vqa.field_g.field_m.field_a)) {
              L1: {
                stackOut_17_0 = ifa.field_g;
                stackOut_17_1 = 10;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (!vqa.field_g.field_h) {
                  stackOut_19_0 = (String[]) (Object) stackIn_19_0;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = gs.field_d;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L1;
                } else {
                  stackOut_18_0 = (String[]) (Object) stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = pva.field_e;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L1;
                }
              }
              stackIn_20_0[stackIn_20_1] = stackIn_20_2;
              if (param0 > -76) {
                field_e = false;
                return;
              } else {
                return;
              }
            } else {
              L2: {
                stackOut_10_0 = ifa.field_g;
                stackOut_10_1 = 10;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (vqa.field_g.field_h) {
                  stackOut_12_0 = (String[]) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = eua.field_a;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L2;
                } else {
                  stackOut_11_0 = (String[]) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = ffb.field_d;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L2;
                }
              }
              stackIn_13_0[stackIn_13_1] = stackIn_13_2;
              if (param0 <= -76) {
                return;
              } else {
                field_e = false;
                return;
              }
            }
          }
        } else {
          L3: {
            stackOut_1_0 = ifa.field_g;
            stackOut_1_1 = 10;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (vqa.field_g.field_h) {
              stackOut_3_0 = (String[]) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = csa.field_b;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L3;
            } else {
              stackOut_2_0 = (String[]) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = fhb.field_o;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L3;
            }
          }
          stackIn_4_0[stackIn_4_1] = stackIn_4_2;
          if (param0 <= -76) {
            return;
          } else {
            field_e = false;
            return;
          }
        }
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
            return -56;
        }
        if (param1 != 0) {
            return ((cqb) this).field_d;
        }
        return ((cqb) this).field_c;
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        cqb var5 = null;
        L0: {
          super.a(param0, -64);
          var5 = (cqb) (Object) param0;
          var4 = 0;
          if (var5.field_c != var5.field_c) {
            System.out.println("int index has changed. before=" + var5.field_c + ", now=" + var5.field_c);
            var4 = 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var5.field_d == var5.field_d) {
            break L1;
          } else {
            var4 = 1;
            System.out.println("int value has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            break L1;
          }
        }
        if (param1 <= -19) {
          if (var4 != 0) {
            System.out.println("This instance of MissionConditionVariableAtLeast has changed");
            return;
          } else {
            return;
          }
        } else {
          field_f = null;
          if (var4 == 0) {
            return;
          } else {
            System.out.println("This instance of MissionConditionVariableAtLeast has changed");
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -54) {
            return;
        }
        if (!(rb.field_c != null)) {
            return;
        }
        rb.field_c.b(-10258, (ksa) (Object) new pd(param3, param2, param0, param1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You must play 1 more rated game before playing with the current options.";
    }
}

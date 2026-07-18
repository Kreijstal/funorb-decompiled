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
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (cqb) (Object) param1;
                var4 = 7 % ((22 - param0) / 59);
                if (super.a((byte) 116, param1)) {
                  break L2;
                } else {
                  if (var3.field_c != ((cqb) this).field_c) {
                    break L2;
                  } else {
                    if (var3.field_d == ((cqb) this).field_d) {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("cqb.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    public static void c(int param0) {
        int var1 = -104 / ((param0 - -54) / 51);
        field_f = null;
    }

    final boolean a(int param0, lbb param1, pe param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((cqb) this).field_d = 113;
                break L1;
              }
            }
            L2: {
              if (param1.b(7061, ((cqb) this).field_c) < ((cqb) this).field_d) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("cqb.G(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static rn d(int param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        rn var2 = null;
        rn stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        rn stackOut_4_0 = null;
        try {
          var1_int = 0;
          L0: while (true) {
            var2 = lnb.field_i.a((byte) -72, var1_int);
            if (var2.field_k) {
              stackOut_4_0 = (rn) var2;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var1_int++;
              continue L0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    public final void b(byte param0, tv param1) {
        cqb var5 = null;
        cqb var6 = null;
        try {
            if (param0 <= 54) {
                int discarded$0 = ((cqb) this).a((byte) -47, -43);
            }
            super.b((byte) 82, param1);
            var5 = (cqb) (Object) param1;
            var6 = var5;
            var6.field_d = ((cqb) this).field_d;
            var6.field_c = ((cqb) this).field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "cqb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        pja.e(-110);
        int var1 = -25 / ((46 - param0) / 35);
    }

    final ucb[] a(pe param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
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
            if (param1 != -20605) {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("cqb.I(");
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return (ucb[]) (Object) stackIn_3_0;
    }

    cqb() {
    }

    final void a(pe param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
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
            L1: {
              if (param2 == 0) {
                ((cqb) this).field_c = param3;
                if (0 > ((cqb) this).field_c) {
                  ((cqb) this).field_c = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ((cqb) this).field_d = param3;
                break L1;
              }
            }
            if (param1 == -2) {
              break L0;
            } else {
              cqb.c(80);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("cqb.E(");
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
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -120);
        param0.a(-632, ((cqb) this).field_c, 32);
        if (param1 > -109) {
            return;
        }
        try {
            param0.a(-632, ((cqb) this).field_d, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "cqb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    cqb(int param0, int param1) {
        ((cqb) this).field_c = param0;
        ((cqb) this).field_d = param1;
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            ((cqb) this).field_c = param0.i(0, 32);
            ((cqb) this).field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "cqb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
        RuntimeException var3 = null;
        int var4 = 0;
        cqb var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -64);
              var5 = (cqb) (Object) param0;
              var4 = 0;
              if (var5.field_c != ((cqb) this).field_c) {
                System.out.println("int index has changed. before=" + var5.field_c + ", now=" + ((cqb) this).field_c);
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var5.field_d == ((cqb) this).field_d) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int value has changed. before=" + var5.field_d + ", now=" + ((cqb) this).field_d);
                break L2;
              }
            }
            L3: {
              if (param1 <= -19) {
                break L3;
              } else {
                field_f = null;
                break L3;
              }
            }
            if (var4 == 0) {
              break L0;
            } else {
              System.out.println("This instance of MissionConditionVariableAtLeast has changed");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("cqb.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
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

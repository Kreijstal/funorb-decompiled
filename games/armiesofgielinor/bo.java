/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    private int[] field_e;
    private int[] field_f;
    private int[] field_a;
    private int[] field_h;
    static String field_c;
    private int[] field_d;
    static wk field_b;
    static int[] field_g;

    final int a(byte param0, int param1) {
        int var3 = -102 / ((param0 - 44) / 42);
        return ((bo) this).field_d[param1] + (-640 + so.field_b.field_a >> 1);
    }

    final int a(int param0, byte param1) {
        if (param1 > -100) {
          field_c = null;
          return ((bo) this).field_h[param0] + (so.field_b.field_g - 480 >> 1);
        } else {
          return ((bo) this).field_h[param0] + (so.field_b.field_g - 480 >> 1);
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 120 / ((param0 - -93) / 33);
        ((bo) this).field_d[param2] = ((bo) this).field_d[param2] + (param1 + -((bo) this).a((byte) -125, param2));
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        ((bo) this).field_a[param6] = param4;
        ((bo) this).field_d[param6] = param0;
        ((bo) this).field_h[param6] = param3;
        ((bo) this).field_f[param6] = param5;
        ((bo) this).field_e[param6] = param1;
        if (param2 != 18) {
            ((bo) this).a(-45, 80, (byte) -101, -37, -18, -104, -117);
        }
    }

    final int b(int param0, int param1) {
        Object var4 = null;
        if (param1 != 29) {
          var4 = null;
          ik discarded$2 = bo.a(-13, (vh) null, 83);
          return (-640 + so.field_b.field_a >> 1) - -((bo) this).field_a[param0];
        } else {
          return (-640 + so.field_b.field_a >> 1) - -((bo) this).field_a[param0];
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != -1) {
          return;
        } else {
          ((bo) this).field_a[param2] = ((bo) this).field_a[param2] + (-((bo) this).b(param2, 29) + param1);
          return;
        }
    }

    final static ik a(int param0, vh param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        al stackIn_16_0 = null;
        ra stackIn_21_0 = null;
        al stackIn_23_0 = null;
        wa stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        al stackOut_15_0 = null;
        wa stackOut_24_0 = null;
        ra stackOut_20_0 = null;
        al stackOut_22_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 4368051) {
                break L1;
              } else {
                var6 = null;
                ik discarded$1 = bo.a(-35, (vh) null, 62);
                break L1;
              }
            }
            var3_int = param1.e((byte) -104);
            var4 = uc.field_d[var3_int][3];
            if (var4 == 4) {
              stackOut_15_0 = new al(var3_int);
              stackIn_16_0 = stackOut_15_0;
              return (ik) (Object) stackIn_16_0;
            } else {
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  if (var4 != 1) {
                    if (var4 != 2) {
                      if (8 == var4) {
                        break L2;
                      } else {
                        if (3 == var4) {
                          break L2;
                        } else {
                          if (var4 == 5) {
                            break L2;
                          } else {
                            if (6 == var4) {
                              break L2;
                            } else {
                              if (7 == var4) {
                                break L2;
                              } else {
                                return null;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (uc.field_d[var3_int][4] != 5) {
                stackOut_24_0 = new wa(var3_int, param1.k(param2 ^ 4368051), param1.k(0));
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                if (param0 > -1) {
                  stackOut_20_0 = new ra(var3_int, (mn) (Object) new am(param1, param0));
                  stackIn_21_0 = stackOut_20_0;
                  return (ik) (Object) stackIn_21_0;
                } else {
                  stackOut_22_0 = new al(var3_int);
                  stackIn_23_0 = stackOut_22_0;
                  return (ik) (Object) stackIn_23_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("bo.J(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L3;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ')');
        }
        return (ik) (Object) stackIn_25_0;
    }

    public static void a(int param0) {
        if (param0 != 4368051) {
          bo.a(false);
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final int b(int param0, byte param1) {
        int var3 = -53 % ((45 - param1) / 61);
        return ((bo) this).field_f[param0];
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 <= 118) {
          ((bo) this).field_e = null;
          ((bo) this).field_h[param1] = ((bo) this).field_h[param1] + (param0 - ((bo) this).a(param1, (byte) -108));
          return;
        } else {
          ((bo) this).field_h[param1] = ((bo) this).field_h[param1] + (param0 - ((bo) this).a(param1, (byte) -108));
          return;
        }
    }

    final static void a(boolean param0) {
        tp.field_e = new at();
        if (!param0) {
            field_b = null;
        }
    }

    final int a(int param0, int param1) {
        if (param0 != -6) {
          ((bo) this).b(-40, 11, -54);
          return (so.field_b.field_g - 480 >> 1) - -((bo) this).field_e[param1];
        } else {
          return (so.field_b.field_g - 480 >> 1) - -((bo) this).field_e[param1];
        }
    }

    bo() {
        ((bo) this).field_a = new int[29];
        ((bo) this).field_f = new int[29];
        ((bo) this).field_h = new int[29];
        ((bo) this).field_e = new int[29];
        ((bo) this).field_d = new int[29];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> / <%1> (+<%2>) - Victory in <%3> turns";
        field_g = new int[]{12303291, 740023, 12521488, 8495921, 4368051, 5132314, 10573849};
    }
}

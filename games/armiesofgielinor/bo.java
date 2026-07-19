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
        return this.field_d[param1] + (-640 + so.field_b.field_a >> 453533825);
    }

    final int a(int param0, byte param1) {
        if (param1 > -100) {
          field_c = (String) null;
          return this.field_h[param0] + (so.field_b.field_g - 480 >> -622903007);
        } else {
          return this.field_h[param0] + (so.field_b.field_g - 480 >> -622903007);
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 120 / ((param0 - -93) / 33);
        this.field_d[param2] = this.field_d[param2] + (param1 + -this.a((byte) -125, param2));
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        this.field_a[param6] = param4;
        this.field_d[param6] = param0;
        this.field_h[param6] = param3;
        this.field_f[param6] = param5;
        this.field_e[param6] = param1;
        if (param2 != 18) {
            this.a(-45, 80, (byte) -101, -37, -18, -104, -117);
        }
    }

    final int b(int param0, int param1) {
        ik discarded$2 = null;
        vh var4 = null;
        if (param1 != 29) {
          var4 = (vh) null;
          discarded$2 = bo.a(-13, (vh) null, 83);
          return (-640 + so.field_b.field_a >> 328354849) - -this.field_a[param0];
        } else {
          return (-640 + so.field_b.field_a >> 328354849) - -this.field_a[param0];
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != -1) {
          return;
        } else {
          this.field_a[param2] = this.field_a[param2] + (-this.b(param2, 29) + param1);
          return;
        }
    }

    final static ik a(int param0, vh param1, int param2) {
        ik discarded$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        vh var6 = null;
        al stackIn_20_0 = null;
        ra stackIn_25_0 = null;
        al stackIn_27_0 = null;
        wa stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wa stackOut_28_0 = null;
        ra stackOut_24_0 = null;
        al stackOut_26_0 = null;
        al stackOut_19_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 4368051) {
                break L1;
              } else {
                var6 = (vh) null;
                discarded$1 = bo.a(-35, (vh) null, 62);
                break L1;
              }
            }
            L2: {
              var3_int = param1.e((byte) -104);
              var4 = uc.field_d[var3_int][3];
              if (-5 == (var4 ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (-1 == (var4 ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if (-2 != (var4 ^ -1)) {
                        break L4;
                      } else {
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (-3 != (var4 ^ -1)) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (8 == var4) {
                      break L3;
                    } else {
                      if (3 == var4) {
                        break L3;
                      } else {
                        if ((var4 ^ -1) == -6) {
                          break L3;
                        } else {
                          if (6 == var4) {
                            break L3;
                          } else {
                            if (7 == var4) {
                              if (var5 == 0) {
                                break L3;
                              } else {
                                break L2;
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (uc.field_d[var3_int][4] != 5) {
                  stackOut_28_0 = new wa(var3_int, param1.k(param2 ^ 4368051), param1.k(0));
                  stackIn_29_0 = stackOut_28_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (param0 > -1) {
                    stackOut_24_0 = new ra(var3_int, new am(param1, param0));
                    stackIn_25_0 = stackOut_24_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackOut_26_0 = new al(var3_int);
                    stackIn_27_0 = stackOut_26_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
            stackOut_19_0 = new al(var3_int);
            stackIn_20_0 = stackOut_19_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("bo.J(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ik) ((Object) stackIn_20_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ik) ((Object) stackIn_25_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ik) ((Object) stackIn_27_0);
            } else {
              return (ik) ((Object) stackIn_29_0);
            }
          }
        }
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
        return this.field_f[param0];
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 <= 118) {
          this.field_e = (int[]) null;
          this.field_h[param1] = this.field_h[param1] + (param0 - this.a(param1, (byte) -108));
          return;
        } else {
          this.field_h[param1] = this.field_h[param1] + (param0 - this.a(param1, (byte) -108));
          return;
        }
    }

    final static void a(boolean param0) {
        tp.field_e = new at();
        if (!param0) {
            field_b = (wk) null;
        }
    }

    final int a(int param0, int param1) {
        if (param0 != -6) {
          this.b(-40, 11, -54);
          return (so.field_b.field_g - 480 >> 1896245185) - -this.field_e[param1];
        } else {
          return (so.field_b.field_g - 480 >> 1896245185) - -this.field_e[param1];
        }
    }

    bo() {
        this.field_a = new int[29];
        this.field_f = new int[29];
        this.field_h = new int[29];
        this.field_e = new int[29];
        this.field_d = new int[29];
    }

    static {
        field_c = "<%0> / <%1> (+<%2>) - Victory in <%3> turns";
        field_g = new int[]{12303291, 740023, 12521488, 8495921, 4368051, 5132314, 10573849};
    }
}

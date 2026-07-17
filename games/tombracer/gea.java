/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gea {
    static String field_c;
    private int[][] field_b;
    private boolean field_a;

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -4075) {
          L0: {
            L1: {
              if (((gea) this).field_b == null) {
                break L1;
              } else {
                if (((gea) this).field_b.length != 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_c = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < ((gea) this).field_b.length; var2++) {
            ((gea) this).field_b[var2][0] = -((gea) this).field_b[var2][0];
        }
        if (!param0) {
            field_c = null;
        }
    }

    final static void a(int param0, cn param1, il param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        br var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = bg.field_t;
            rua.field_gb = new jea(0L, (jea) null);
            if (param1 != null) {
              param1.field_j = 0;
              param1.field_g = false;
              taa.field_g = new nc(var3_int, param1, param1);
              qu.field_a = new tr(var3_int, param1, param1, (pp) (Object) new gha());
              var4 = eka.d((byte) 86);
              if (var4 == null) {
                var11 = null;
                ssa.a("QC2", (byte) 122, (Throwable) null);
                return;
              } else {
                vp.a(-1, var4);
                var12 = null;
                oka.field_w = ow.a(1127256, 1513239, 1513239, 0, (il) null, 2245737, 4020342, 65793, 65793, 5138823, 8947848, 65793, (byte) -78);
                uka.field_M = ow.a(0, 0, 0, 16764006, param2, 0, param0, 0, 0, 0, 0, 0, (byte) -81);
                tg.field_c = ow.a(0, 0, 0, 16777215, param2, 0, 0, 0, 0, 0, 0, 0, (byte) -123);
                var5 = bea.field_g;
                var6 = bea.field_a;
                var16 = bea.field_l;
                gfa.field_j = new iu(10, 14);
                gfa.field_j.c();
                var8 = 2;
                L1: while (true) {
                  if (var8 >= 7) {
                    bea.a(var16, var5, var6);
                    cia.field_g = qla.a(true, uka.field_M, oka.field_w, var4, tg.field_c);
                    rua.field_gb.field_J = new vna();
                    break L0;
                  } else {
                    bea.f(var8, var8 - -1, -(var8 << 1) + 14, 16777215);
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              var10 = null;
              ssa.a("QC1", (byte) 123, (Throwable) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("gea.F(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    public gea() {
        this(new int[0][]);
    }

    final int[][] c(int param0) {
        int var2 = 84 % ((param0 - 85) / 34);
        return ((gea) this).field_b;
    }

    final boolean a(byte param0) {
        if (param0 != 21) {
            ((gea) this).a(false, -22);
        }
        return ((gea) this).field_a;
    }

    final void a(boolean param0, int param1) {
        ((gea) this).field_a = param0 ? true : false;
        if (param1 != 1) {
            ((gea) this).field_a = true;
        }
    }

    gea(int[][] param0) {
        ir discarded$0 = new ir();
        try {
            ((gea) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gea.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    gea(int param0, kh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        ir discarded$2 = new ir();
        try {
          L0: {
            var3_int = param1.b((byte) 44, 4);
            ((gea) this).field_b = new int[var3_int][2];
            var4 = 0;
            L1: while (true) {
              if (var3_int <= var4) {
                L2: {
                  if (11 > param0) {
                    break L2;
                  } else {
                    L3: {
                      stackOut_5_0 = this;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (param1.b((byte) 44, 1) != 1) {
                        stackOut_7_0 = this;
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L3;
                      } else {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        break L3;
                      }
                    }
                    ((gea) this).field_a = stackIn_8_1 != 0;
                    break L2;
                  }
                }
                break L0;
              } else {
                ((gea) this).field_b[var4][0] = bla.a(true, 12, param1.b((byte) 44, 12)) << 16;
                ((gea) this).field_b[var4][1] = bla.a(true, 12, param1.b((byte) 44, 12)) << 16;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("gea.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final void a(kh param0, int param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            param0.a((byte) 20, ((gea) this).field_b.length, 4);
            for (var3_int = param1; var3_int < ((gea) this).field_b.length; var3_int++) {
                param0.a((byte) -128, dqa.a(true, ((gea) this).field_b[var3_int][0] >> 16, 12), 12);
                param0.a((byte) -125, dqa.a(true, ((gea) this).field_b[var3_int][1] >> 16, 12), 12);
            }
            param0.a((byte) 74, !((gea) this).field_a ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gea.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Confirm Password: ";
    }
}

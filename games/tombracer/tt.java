/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt extends vg implements bo {
    private int[][] field_f;
    static String field_g;
    private boolean[] field_h;

    public final void a(kh param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        boolean[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        boolean[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param0.h((byte) 125);
            var3_int = 0;
            L1: while (true) {
              if (((tt) this).field_f.length <= var3_int) {
                L2: {
                  if (param1 != -19) {
                    ((tt) this).field_h = null;
                    param0.i((byte) 98);
                    break L2;
                  } else {
                    param0.i((byte) 98);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  stackOut_3_0 = ((tt) this).field_h;
                  stackOut_3_1 = var3_int;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (param0.b((byte) 44, 1) == 1) {
                    stackOut_5_0 = (boolean[]) (Object) stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L3;
                  } else {
                    stackOut_4_0 = (boolean[]) (Object) stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L3;
                  }
                }
                L4: {
                  stackIn_6_0[stackIn_6_1] = stackIn_6_2 != 0;
                  if (((tt) this).field_h[var3_int]) {
                    var4 = 0;
                    L5: while (true) {
                      if (var4 >= ((tt) this).field_f[var3_int].length) {
                        break L4;
                      } else {
                        ((tt) this).field_f[var3_int][var4] = vp.a(param0.b((byte) 44, 7), param1 + -6468);
                        var4++;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("tt.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "S2CActionPacket playerOrders:";
        for (var2 = 0; ((tt) this).field_f.length > var2; var2++) {
            var1 = var1 + " " + ((tt) this).field_h[var2];
        }
        return var1;
    }

    final static roa a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            tt.a(59);
            break L0;
          }
        }
        var2 = param1;
        if (4 == var2) {
          int discarded$2 = -110;
          return eo.D();
        } else {
          if (var2 != 0) {
            if (var2 != 1) {
              if (2 == var2) {
                return mr.a((byte) 125);
              } else {
                throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
              }
            } else {
              int discarded$3 = -17698;
              return ik.b();
            }
          } else {
            return gda.a(true);
          }
        }
    }

    public final void a(int param0, kh param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        try {
            param1.i(8);
            var3_int = 0;
            if (param0 != 200) {
                ((tt) this).field_h = null;
            }
            while (var3_int < ((tt) this).field_f.length) {
                param1.a((byte) 71, ((tt) this).field_h[var3_int] ? 1 : 0, 1);
                if (((tt) this).field_h[var3_int]) {
                    for (var4 = 0; var4 < ((tt) this).field_f[var3_int].length; var4++) {
                        param1.a((byte) -23, uja.a(-47, ((tt) this).field_f[var3_int][var4]), 7);
                    }
                }
                var3_int++;
            }
            param1.k(param0 + -1826190886);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tt.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
            Object var2 = null;
            boolean discarded$0 = tt.a((cn) null, (byte) -100);
        }
        field_g = null;
    }

    final static boolean a(cn param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 101 / ((param1 - 15) / 60);
            stackOut_0_0 = param0.a(0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("tt.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final boolean a(boolean param0, int param1) {
        if (param0) {
            return true;
        }
        return ((tt) this).field_h[param1];
    }

    tt(int param0) {
        ((tt) this).field_f = new int[param0][8];
        ((tt) this).field_h = new boolean[param0];
    }

    final int a(boolean param0, int param1, int param2) {
        if (param0) {
            Object var5 = null;
            boolean discarded$0 = tt.a((cn) null, (byte) 42);
        }
        return ((tt) this).field_f[param1][param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Return to Main Menu";
    }
}

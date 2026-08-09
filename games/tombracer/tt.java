/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt extends vg implements bo {
    private int[][] field_f;
    static String field_g;
    private boolean[] field_h;

    public final void a(kh param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        boolean[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param0.h((byte) 125);
            var3_int = 0;
            L1: while (true) {
              if (this.field_f.length <= var3_int) {
                L2: {
                  if (param1 != -19) {
                    this.field_h = (boolean[]) null;
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
                  stackIn_5_0 = this.field_h;

                  stackIn_5_1 = var3_int;

                  if ((param0.b((byte) 44, 1) ^ -1) == -2) {
                    stackIn_6_0 = (boolean[]) ((Object) stackIn_5_0);
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 1;
                    break L3;
                  } else {
                    stackIn_6_0 = (boolean[]) ((Object) stackIn_5_0);
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 0;
                    break L3;
                  }
                }
                L4: {
                  stackIn_6_0[stackIn_6_1] = stackIn_6_2 != 0;
                  if (this.field_h[var3_int]) {
                    var4 = 0;
                    L5: while (true) {
                      if (var4 >= this.field_f[var3_int].length) {
                        break L4;
                      } else {
                        this.field_f[var3_int][var4] = vp.a(param0.b((byte) 44, 7), param1 + -6468);
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
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("tt.A(");

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
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "S2CActionPacket playerOrders:";
        for (var2 = 0; this.field_f.length > var2; var2++) {
            var1 = var1 + " " + this.field_h[var2];
        }
        return var1;
    }

    final static roa a(int param0, int param1) {
        int var2;
        int var3;
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
          return eo.D((byte) -110);
        } else {
          if (-1 != (var2 ^ -1)) {
            if (-2 != (var2 ^ -1)) {
              if (2 == var2) {
                return mr.a((byte) 125);
              } else {
                throw new IllegalStateException("Unknown/unimplemented weapon preset: " + param1);
              }
            } else {
              return ik.b(-17698);
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
                this.field_h = (boolean[]) null;
            }
            while (var3_int < this.field_f.length) {
                param1.a((byte) 71, this.field_h[var3_int] ? 1 : 0, 1);
                if (this.field_h[var3_int]) {
                    for (var4 = 0; var4 < this.field_f[var3_int].length; var4++) {
                        param1.a((byte) -23, uja.a(-47, this.field_f[var3_int][var4]), 7);
                    }
                }
                var3_int++;
            }
            param1.k(param0 + -1826190886);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tt.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
            cn var2 = (cn) null;
            tt.a((cn) null, (byte) -100);
        }
        field_g = null;
    }

    final static boolean a(cn param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 101 / ((param1 - 15) / 60);
            stackIn_1_0 = param0.a(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("tt.E(");

            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final boolean a(boolean param0, int param1) {
        if (param0) {
            return true;
        }
        return this.field_h[param1];
    }

    tt(int param0) {
        this.field_f = new int[param0][8];
        this.field_h = new boolean[param0];
    }

    final int a(boolean param0, int param1, int param2) {
        if (param0) {
            cn var5 = (cn) null;
            tt.a((cn) null, (byte) 42);
        }
        return this.field_f[param1][param2];
    }

    static {
        field_g = "Return to Main Menu";
    }
}

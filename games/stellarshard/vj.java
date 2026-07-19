/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    private int[] field_a;
    static String field_b;

    final static kl a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        kl var8 = null;
        var8 = new kl(param5, param6, param3, param4, param0, param1);
        if (param2 != 15) {
          field_b = (String) null;
          nl.field_e.b(-127, var8);
          ca.a(param7, var8, (byte) -70);
          return var8;
        } else {
          nl.field_e.b(-127, var8);
          ca.a(param7, var8, (byte) -70);
          return var8;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = 38 / ((-75 - param1) / 47);
        var3 = -1 + (this.field_a.length >> -128090687);
        var4 = var3 & param0;
        L0: while (true) {
          var6 = this.field_a[1 + var4 + var4];
          if (var6 == -1) {
            return -1;
          } else {
            if (this.field_a[var4 + var4] != param0) {
              var4 = var3 & var4 - -1;
              continue L0;
            } else {
              return var6;
            }
          }
        }
    }

    vj(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            var2_int = 1;
            L1: while (true) {
              if (var2_int > (param0.length >> 235870689) + param0.length) {
                this.field_a = new int[var2_int - -var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & var2_int + -1;
                        L4: while (true) {
                          if ((this.field_a[1 + var4 + var4] ^ -1) == 0) {
                            this.field_a[var4 + var4] = param0[var3];
                            this.field_a[var4 + var4 + 1] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = 1 + var4 & -1 + var2_int;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_a[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("vj.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 18596) {
          L0: {
            field_b = (String) null;
            if (al.field_f.a(true)) {
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
            if (al.field_f.a(true)) {
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

    public static void a(byte param0) {
        kl discarded$2 = null;
        if (param0 < 31) {
          discarded$2 = vj.a(8, 68, (byte) 48, -30, 100, 35, 21, 10);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static boolean a(int param0) {
        kl discarded$12 = null;
        if (param0 == 25424) {
          if (10 <= eg.field_d) {
            if ((rk.field_f ^ -1) > -14) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$12 = vj.a(-81, 22, (byte) -98, 70, -85, -21, -31, 59);
          if (10 <= eg.field_d) {
            if ((rk.field_f ^ -1) > -14) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            var1_int = -73 / ((param0 - 83) / 35);
            var2 = gg.field_h[0];
            var3 = 1;
            L1: while (true) {
              if (gg.field_h.length <= var3) {
                break L0;
              } else {
                var4 = gg.field_h[var3];
                ri.a(ki.field_z, var3 << 2119653092, ki.field_z, var2, var4);
                var2 = var2 + var4;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "vj.C(" + param0 + ')');
        }
    }

    static {
        field_b = "Creating your account";
    }
}

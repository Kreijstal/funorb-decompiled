/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class m {
    static String field_c;
    static String field_b;
    static he[] field_a;

    abstract long a(int param0);

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_a = null;
        }
        field_c = null;
        field_a = null;
    }

    abstract int a(long param0, int param1);

    abstract void b(boolean param0);

    final static ej[] a(int param0, lh param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ej[] var4 = null;
        int var5 = 0;
        ej var6_ref_ej = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        ej[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ej[] stackOut_11_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param1.e(8, (byte) 48);
            if (var2_int <= 0) {
              var3 = param1.e(12, (byte) -123);
              var4 = new ej[var3];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var3) {
                  stackOut_11_0 = (ej[]) var4;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  L2: {
                    int discarded$21 = 0;
                    if (!ti.a(param1)) {
                      var6 = param1.e(jl.a(109, var5 - 1), (byte) 53);
                      var4[var5] = var4[var6];
                      break L2;
                    } else {
                      var6_ref_ej = new ej();
                      int discarded$22 = param1.e(24, (byte) 40);
                      int discarded$23 = param1.e(24, (byte) 95);
                      var6_ref_ej.field_d = param1.e(24, (byte) 114);
                      int discarded$24 = param1.e(9, (byte) 62);
                      int discarded$25 = param1.e(12, (byte) 42);
                      int discarded$26 = param1.e(12, (byte) 75);
                      int discarded$27 = param1.e(12, (byte) -115);
                      var4[var5] = var6_ref_ej;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ej[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("m.F(").append(103).append(44);
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
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    final static sa a(int param0, byte param1) {
        sa[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        sa[] var5 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var5 = ug.c((byte) -23);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length <= var3) {
            return null;
          } else {
            if (param0 != var5[var3].field_d) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          }
        }
    }

    final int b(long param0, int param1) {
        if (param1 != 1) {
            field_a = null;
        }
        long var4 = ((m) this).a(param1);
        if (0L < var4) {
            kk.a(var4, true);
        }
        return ((m) this).a(param0, -110);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}

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
            field_a = (he[]) null;
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
        ej[] stackIn_6_0 = null;
        ej[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param1.e(8, (byte) 48);
            if (var2_int <= 0) {
              if (param0 >= 13) {
                var3 = param1.e(12, (byte) -123);
                var4 = new ej[var3];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var3) {
                    stackIn_14_0 = (ej[]) (var4);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      if (!ti.a(param1, false)) {
                        var6 = param1.e(jl.a(109, var5 - 1), (byte) 53);
                        var4[var5] = var4[var6];
                        break L2;
                      } else {
                        var6_ref_ej = new ej();
                        param1.e(24, (byte) 40);
                        param1.e(24, (byte) 95);
                        var6_ref_ej.field_d = param1.e(24, (byte) 114);
                        param1.e(9, (byte) 62);
                        param1.e(12, (byte) 42);
                        param1.e(12, (byte) 75);
                        param1.e(12, (byte) -115);
                        var4[var5] = var6_ref_ej;
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = (ej[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("m.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ej[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static sa a(int param0, byte param1) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        sa[] var5 = ug.c((byte) -23);
        sa[] var2 = var5;
        for (var3 = 0; var5.length > var3; var3++) {
            if (param0 == var5[var3].field_d) {
                return var5[var3];
            }
        }
        if (param1 == 46) {
            return null;
        }
        field_b = (String) null;
        return null;
    }

    final int b(long param0, int param1) {
        if (param1 != 1) {
            field_a = (he[]) null;
        }
        long var4 = this.a(param1 + 0);
        if (0L < var4) {
            kk.a(var4, true);
        }
        return this.a(param0, -110);
    }

    static {
        field_c = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}

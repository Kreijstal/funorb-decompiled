/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static ml field_b;
    static jb[] field_d;
    static String field_c;
    static int field_a;
    static int field_e;

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -127) {
            return;
        }
        field_d = null;
        field_c = null;
    }

    abstract long c(int param0);

    abstract int a(long param0, boolean param1);

    abstract void b(int param0);

    final static boolean a(byte param0, ae param1, ae param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var3_int = param1.field_kb + -param2.field_kb;
              if (param1.field_jb == og.field_m) {
                var3_int -= 200;
                break L1;
              } else {
                if (param1.field_jb == null) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param2.field_jb != og.field_m) {
                if (null != param2.field_jb) {
                  break L2;
                } else {
                  var3_int -= 200;
                  break L2;
                }
              } else {
                var3_int += 200;
                break L2;
              }
            }
            L3: {
              if (var3_int <= 0) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ha.J(").append(75).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final int a(byte param0, long param1) {
        long var4 = ((ha) this).c(20520);
        if (param0 >= -97) {
            return 126;
        }
        if (!(var4 <= 0L)) {
            ub.a(1976, var4);
        }
        return ((ha) this).a(param1, true);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Torquing.field_u;
        try {
          L0: {
            var6_int = ln.a(qk.field_p, j.field_q, param4, 91);
            var7 = ln.a(qk.field_p, j.field_q, param5, 97);
            var8 = ln.a(qg.field_z, kn.field_e, param0, 81);
            var9 = ln.a(qg.field_z, kn.field_e, param3, 81);
            var10 = var6_int;
            L1: while (true) {
              if (var10 > var7) {
                break L0;
              } else {
                di.a(var8, (byte) -113, param1, qd.field_a[var10], var9);
                var10++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var6, "ha.K(" + param0 + 44 + param1 + 44 + -126 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Just play";
        field_a = -1;
        field_b = new ml();
    }
}

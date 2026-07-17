/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends ng {
    static int field_A;
    static long field_z;
    static String field_D;
    static char[] field_E;
    static String field_C;

    private ah(pk param0, int param1) {
        super(param0, param1);
    }

    ah(int param0) {
        this(qk.field_e, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              l.d(param3, param4, 1 + param2, 10000536);
              l.d(param3, param4 + param0, 1 + param2, 12105912);
              var5_int = 1;
              if (var5_int + param4 >= l.field_d) {
                break L1;
              } else {
                var5_int = -param4 + l.field_d;
                break L1;
              }
            }
            L2: {
              var6 = param0;
              if (var6 + param4 <= l.field_c) {
                break L2;
              } else {
                var6 = l.field_c + -param4;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = 48 * var7 / param0 + 152;
                var9 = var8 | (var8 << 8 | var8 << 16);
                l.field_i[param3 + (param4 - -var7) * l.field_k] = var9;
                l.field_i[param3 + (l.field_k * (param4 - -var7) - -param2)] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var5, "ah.BA(" + param0 + 44 + 128 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        ji var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = (ji) (Object) vc.field_d.d(9272);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$8 = 2;
                int discarded$9 = 75;
                nc.a(var4);
                var4 = (ji) (Object) vc.field_d.e((byte) -119);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ah.A(" + 48 + 44 + 2 + 41);
        }
    }

    final String b(gl param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 32032) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            stackOut_2_0 = uh.a(0, param0.field_o.length(), '*');
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ah.T(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static mj a(String param0, int param1) {
        ql var3 = null;
        RuntimeException var3_ref = null;
        ql stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ql stackOut_0_0 = null;
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
            var3 = new ql();
            ((mj) (Object) var3).field_d = param0;
            ((mj) (Object) var3).field_b = param1;
            stackOut_0_0 = (ql) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("ah.B(");
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
          throw qk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + -23891 + 41);
        }
        return (mj) (Object) stackIn_1_0;
    }

    public static void a(boolean param0) {
        field_D = null;
        field_E = null;
        field_C = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new char[128];
        field_C = "Soldier-A";
        field_D = "ACT II, Invasion";
    }
}

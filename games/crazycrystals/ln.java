/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ln {
    int field_b;
    static dl field_d;
    static am field_f;
    int field_c;
    int field_e;
    String field_a;

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param0 == -17512) {
                break L1;
              } else {
                var8 = null;
                ln.a(46, (db) null);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (ga.field_J.length <= var5_int) {
                break L0;
              } else {
                param1 = ga.field_J[var5_int];
                var6 = var5_int << 4;
                L3: while (true) {
                  int incrementValue$12 = param1;
                  param1--;
                  if (incrementValue$12 == 0) {
                    var5_int++;
                    var5_int++;
                    continue L2;
                  } else {
                    int incrementValue$13 = var6;
                    var6++;
                    param4 = gh.field_E[incrementValue$13];
                    param3[param2[param4]] = param3[param2[param4]] + 1;
                    gh.field_E[param3[param2[param4]]] = param4;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ln.J(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
    }

    abstract int a(int param0, byte param1);

    final static void a(int param0, db param1) {
        try {
            if (param0 != 0) {
                Object var3 = null;
                ln.a(46, (db) null);
            }
            fm.field_s = bf.a(-1, "sprites_player_death_electrocution_player", "", param1);
            mj.field_f = bf.a(-1, "sprites_player_death_electrocution_skeleton", "", param1);
            ro.field_u = bf.a(~param0, "sprites_player_death_electrocution_halo", "", param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ln.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ln(String param0, int param1, int param2, int param3) {
        try {
            ((ln) this).field_e = param1;
            ((ln) this).field_c = param2;
            ((ln) this).field_a = param0;
            ((ln) this).field_b = param3;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ln.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
    }
}

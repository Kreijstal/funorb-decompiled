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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (ga.field_J.length <= var5_int) {
                break L0;
              } else {
                param1 = ga.field_J[var5_int];
                var6 = var5_int << 4;
                L2: while (true) {
                  int incrementValue$12 = param1;
                  param1--;
                  if (incrementValue$12 == 0) {
                    var5_int++;
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$13 = var6;
                    var6++;
                    param4 = gh.field_E[incrementValue$13];
                    param3[param2[param4]] = param3[param2[param4]] + 1;
                    gh.field_E[param3[param2[param4]]] = param4;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ln.J(").append(-17512).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param4 + ')');
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
            throw dn.a((Throwable) (Object) runtimeException, "ln.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ln(String param0, int param1, int param2, int param3) {
        try {
            ((ln) this).field_e = param1;
            ((ln) this).field_c = param2;
            ((ln) this).field_a = param0;
            ((ln) this).field_b = param3;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ln.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}

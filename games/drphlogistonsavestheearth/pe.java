/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pe {
    int field_d;
    static String field_i;
    int field_h;
    static int field_j;
    int field_f;
    int field_c;
    static int field_b;
    int field_k;
    int field_a;
    static td field_e;
    static int field_g;

    public static void b(int param0) {
        if (param0 != 0) {
            pe.b(96);
            field_i = null;
            field_e = null;
            return;
        }
        field_i = null;
        field_e = null;
    }

    final static l a(int param0) {
        if (!(null != qc.field_b)) {
            qc.field_b = new l(u.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, u.field_d.field_x, -1, 2147483647, true);
        }
        return qc.field_b;
    }

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    final static void a(nh[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param3 > 0) {
                  if (param1 >= 25) {
                    var5_int = param0[0].field_z;
                    var6 = param0[2].field_z;
                    var7 = param0[1].field_z;
                    param0[0].d(param2, param4);
                    param0[2].d(param3 + (param2 - var6), param4);
                    wj.b(rb.field_e);
                    wj.d(var5_int + param2, param4, -var6 + param2 + param3, param4 - -param0[1].field_C);
                    var8 = var5_int + param2;
                    var9 = param2 + (param3 - var6);
                    param2 = var8;
                    L2: while (true) {
                      if (var9 <= param2) {
                        wj.a(rb.field_e);
                        break L0;
                      } else {
                        param0[1].d(param2, param4);
                        param2 = param2 + var7;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("pe.EA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Level not reached";
        field_g = 64;
        field_b = -1;
    }
}

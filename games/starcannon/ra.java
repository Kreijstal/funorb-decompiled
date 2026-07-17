/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends ik {
    static sk field_t;
    rb field_u;
    byte field_w;
    int field_v;
    static String field_y;
    static String field_x;

    final static re a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        re var9 = null;
        RuntimeException var9_ref = null;
        Object var10 = null;
        re stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        re stackOut_2_0 = null;
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
              if (param5 < -67) {
                break L1;
              } else {
                var10 = null;
                re discarded$2 = ra.a(58, -25, 122, -39, (int[]) null, 47, 64, -83, 118);
                break L1;
              }
            }
            var9 = new re(param0, param7, param1, param2, param6, param3, param4);
            s.field_e.b(68, (rf) (Object) var9);
            vh.a(param8, var9, 0);
            stackOut_2_0 = (re) var9;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9_ref;
            stackOut_4_1 = new StringBuilder().append("ra.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
        return stackIn_3_0;
    }

    final byte[] f(int param0) {
        if (!((ra) this).field_r) {
          if (((ra) this).field_u.field_g >= ((ra) this).field_u.field_f.length + -((ra) this).field_w) {
            if (param0 != 0) {
              byte[] discarded$2 = ((ra) this).f(-20);
              return ((ra) this).field_u.field_f;
            } else {
              return ((ra) this).field_u.field_f;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final int e(int param0) {
        if (((ra) this).field_u != null) {
          if (param0 != -29144) {
            return 74;
          } else {
            return 100 * ((ra) this).field_u.field_g / (-((ra) this).field_w + ((ra) this).field_u.field_f.length);
          }
        } else {
          return 0;
        }
    }

    public static void d(byte param0) {
        field_x = null;
        field_y = null;
        field_t = null;
        int var1 = 116;
    }

    ra() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new sk();
        field_y = "SIDE GUNS - Provides extra fire platforms for the Nova Ray's main gun, which support the front of the ship.";
        field_x = "FULL ACCESS";
    }
}

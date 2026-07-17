/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oea extends vg {
    static volatile boolean field_k;
    fo field_h;
    static jpa field_j;
    static int field_f;
    static String field_g;
    static jea field_i;

    final static boolean a(int param0, int param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (0 == (65536 & param0)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == 0 | cra.a(param1, -31, param0)) {
          if (!ooa.a(param1, param0, -68)) {
            var3 = 0;
            if (0 == (55 & param1)) {
              int discarded$7 = 13650;
              if (!vua.e(param0, param1)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        if (param0 > param3) {
          if (param4 <= param0) {
            if (param3 < param4) {
              vb.a(-922437200, param2, param6, param3, param7, param5, param4, param0, bea.field_l);
              return;
            } else {
              vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
              return;
            }
          } else {
            vb.a(-922437200, param7, param6, param3, param2, param5, param0, param4, bea.field_l);
            return;
          }
        } else {
          if (param3 >= param4) {
            if (param4 <= param0) {
              vb.a(-922437200, param7, param6, param4, param5, param2, param0, param3, bea.field_l);
              return;
            } else {
              vb.a(-922437200, param2, param6, param0, param5, param7, param4, param3, bea.field_l);
              return;
            }
          } else {
            vb.a(-922437200, param5, param6, param0, param2, param7, param3, param4, bea.field_l);
            return;
          }
        }
    }

    public static void a() {
        field_i = null;
        field_g = null;
        field_j = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = param1 + -1 & param0 >> 31;
        if (param2 > -54) {
          int discarded$2 = oea.a(28, -97, -108);
          return (param0 - -(param0 >>> 31)) % param1 - -var3;
        } else {
          return (param0 - -(param0 >>> 31)) % param1 - -var3;
        }
    }

    oea(fo param0) {
        try {
            ((oea) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oea.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = true;
        field_g = "Withdraw invitation to <%0> to join this game";
        field_f = 0;
    }
}

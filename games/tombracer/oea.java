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

    final static boolean a(int param0, int param1, byte param2) {
        if ((0 != (65536 & param0) ? true : false) | cra.a(param1, -31, param0)) {
          return true;
        }
        if (ooa.a(param1, param0, -68)) {
          return true;
        }
        int var3 = -66 % ((param2 - 4) / 48);
        if (0 != (55 & param1)) {
          return false;
        }
        if (vua.e(param0, param1, 13650)) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = TombRacer.field_G ? 1 : 0;
        if (param0 > param3) {
          if (param4 > param0) {
            vb.a(-922437200, param7, param6, param3, param2, param5, param0, param4, bea.field_l);
          } else {
            if (param3 >= param4) {
              vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
            } else {
              vb.a(-922437200, param2, param6, param3, param7, param5, param4, param0, bea.field_l);
            }
          }
        } else {
          if (param3 < param4) {
            vb.a(-922437200, param5, param6, param0, param2, param7, param3, param4, bea.field_l);
          } else {
            if (param4 > param0) {
              vb.a(-922437200, param2, param6, param0, param5, param7, param4, param3, bea.field_l);
            } else {
              vb.a(-922437200, param7, param6, param4, param5, param2, param0, param3, bea.field_l);
            }
          }
        }
        if (param1 == -8543) {
          return;
        }
        field_i = (jea) null;
    }

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_j = null;
        if (param0 != -49) {
          oea.a(80, -20, -71, 70, -11, -46, 20, 64);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 - 1 & param0 >> 31;
        if (param2 <= -54) {
          return (param0 + (param0 >>> 31)) % param1 + var3;
        }
        oea.a(28, -97, -108);
        return (param0 + (param0 >>> 31)) % param1 + var3;
    }

    oea(fo param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = true;
        field_g = "Withdraw invitation to <%0> to join this game";
        field_f = 0;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends kg {
    static int field_lb;
    String field_mb;
    static int[][][] field_nb;
    String field_F;
    int field_ob;

    qk() {
        super(0L, (kg) null);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var15 = TorChallenge.field_F ? 1 : 0;
        if ((param0 ^ -1) <= -1) {
            var8 = ll.field_e[param0][param6][param3];
        } else {
            var8 = 127;
        }
        int var9 = param1 - param7;
        int var10 = param2 - param5;
        if (!((var10 ^ -1) <= -1)) {
            var10 = -var10;
        }
        int var11 = 0;
        int var12 = -43 % ((param4 - 57) / 60);
        if (var9 < 0) {
            var9 = -var9;
        }
        if (!(-33 < (var9 ^ -1))) {
            var9 = -var9 + 64;
        }
        if (var9 < -65) {
            return -1;
        }
        if (16 < var9) {
            return 0;
        }
        if (!(-241 >= var10 * 64)) {
            return 0;
        }
        var10 = var10 * 4 - -1;
        int var13 = var9 * var9 + var10 * var10;
        int var14 = 0;
        while ((var13 ^ -1) < -1) {
            var13 = var13 >> 1771887969;
            var14++;
        }
        var11 = -var14 + 9;
        var11 = var11 * var8 >> 1230128835;
        return var11;
    }

    final static ka a(String param0, String param1, lj param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2.a(param0, param3 ^ -117);
        if (param3 != 0) {
          qk.d((byte) -119);
          var5 = param2.a(var4, param1, (byte) 115);
          return jj.a((byte) 62, param2, var4, var5);
        } else {
          var5 = param2.a(var4, param1, (byte) 115);
          return jj.a((byte) 62, param2, var4, var5);
        }
    }

    final static void d(byte param0) {
        L0: {
          if (null != da.field_c) {
            da.field_c.o(77);
            break L0;
          } else {
            break L0;
          }
        }
        m.field_j = new ib();
        if (param0 >= -43) {
          return;
        } else {
          bg.field_K.c(0, (ee) (Object) m.field_j);
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        ll.a(param1, true, param0);
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_nb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = new int[][][]{new int[2][], new int[2][], new int[2][], new int[2][], new int[2][]};
    }
}

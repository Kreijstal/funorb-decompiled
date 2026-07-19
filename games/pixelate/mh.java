/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static int field_b;
    static int field_a;

    final static void a(te param0, byte param1) {
        if (param0 == null) {
            return;
        }
        try {
            bo.field_h = param0;
            bn.field_I.field_L.e(43);
            if (param1 < 73) {
                field_b = 37;
            }
            bn.field_I.a(bo.field_h, (byte) 26);
            un.field_l = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "mh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param2 = param2 + hp.field_Gb.field_D;
          param0 = param0 + hp.field_Gb.field_y;
          var4 = param2 - -(param0 * t.field_j);
          var5 = 0;
          var6 = hp.field_Gb.field_E;
          var7 = hp.field_Gb.field_F;
          var8 = t.field_j + -var7;
          if (param0 < t.field_f) {
            var10 = -param0 + t.field_f;
            var4 = var4 + var10 * t.field_j;
            var6 = var6 - var10;
            param0 = t.field_f;
            var5 = var5 + var10 * var7;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var9 = param3;
          if (t.field_e <= param2) {
            break L1;
          } else {
            var10 = -param2 + t.field_e;
            var4 = var4 + var10;
            param2 = t.field_e;
            var5 = var5 + var10;
            var8 = var8 + var10;
            var9 = var9 + var10;
            var7 = var7 - var10;
            break L1;
          }
        }
        L2: {
          if (t.field_a < param0 - -var6) {
            var6 = var6 - (var6 + (param0 - t.field_a));
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var7 + param2 <= t.field_h) {
            break L3;
          } else {
            var10 = var7 + (param2 - t.field_h);
            var8 = var8 + var10;
            var9 = var9 + var10;
            var7 = var7 - var10;
            break L3;
          }
        }
        if (-1 > (var7 ^ -1)) {
          if (var6 <= 0) {
            return;
          } else {
            wd.a(t.field_k, param3 ^ -123, param1, var6, var9, var4, var5, var7, var8, hp.field_Gb.field_G);
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    final static void a(ds param0, int param1, byte param2) {
        int var4 = 0;
        dl var5 = null;
        var5 = q.field_p;
        var5.g(109, param1);
        ((dl) var5).field_g = ((dl) var5).field_g + 1;
        var4 = ((dl) var5).field_g;
        var5.b(-1336879960, 1);
        if (((ds) param0).field_f != null) {
          var5.b(-1336879960, ((ds) param0).field_f.length);
          var5.a(true, ((ds) param0).field_f.length, 0, ((ds) param0).field_f);
          int discarded$4 = var5.e(var4, 16);
          ((dl) var5).field_g = ((dl) var5).field_g - 4;
          param0.field_g = var5.a((byte) 121);
          if (param2 < 27) {
            return;
          } else {
            var5.b(-var4 + ((dl) var5).field_g, (byte) 124);
            return;
          }
        } else {
          var5.b(-1336879960, 0);
          int discarded$5 = var5.e(var4, 16);
          ((dl) var5).field_g = ((dl) var5).field_g - 4;
          param0.field_g = var5.a((byte) 121);
          if (param2 < 27) {
            return;
          } else {
            var5.b(-var4 + ((dl) var5).field_g, (byte) 124);
            return;
          }
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = AceOfSkies.field_G ? 1 : 0;
        vp.b(param2, param0, param3 + 1, 10000536);
        vp.b(param2, param4 + param0, param3 + 1, 12105912);
        var5 = 1;
        if (param1 != 70) {
          return;
        } else {
          L0: {
            var6 = param4;
            if (var5 + param0 < vp.field_f) {
              var5 = vp.field_f - param0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var6 + param0 <= vp.field_d) {
              break L1;
            } else {
              var6 = -param0 + vp.field_d;
              break L1;
            }
          }
          var7 = var5;
          L2: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 152 - -(var7 * 48 / param4);
              var9 = var8 << 783689864 | var8 << 1258760400 | var8;
              vp.field_j[param2 + vp.field_i * (var7 + param0)] = var9;
              vp.field_j[param3 + param2 + (param0 - -var7) * vp.field_i] = var9;
              var7++;
              continue L2;
            }
          }
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tf extends eo {
    static volatile int field_n;

    final static kv a(byte param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        kv var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = BachelorFridge.field_y;
        var13 = new kv(param3, param4);
        var6 = 0;
        for (var7 = 0; param4 >> 1 > var7; var7++) {
          var8 = -(65793 * (32 * var7 / param4)) + 9474192;
          var9 = ((16711422 & var8) >>> 1) + 5263440;
          var10 = 2 * ((param4 >> 1) - 1 - var7);
          if (0 >= -1 + param3 - 2 * (var10 + param1)) {
            var6 = var6 + var10;
            for (var11 = 0; -(var10 * 2) + (param3 - 1) > var11; var11++) {
              var13.field_v[var6] = var9;
              var6++;
            }
            var6 = var6 + (1 + var10);
          } else {
            for (var11 = 0; param1 > var11; var11++) {
              var13.field_v[var11 + var10 + var6] = var9;
              var13.field_v[-var11 + (-var10 + var6) + param3 - 2] = var9;
            }
            var6 = var6 + (param1 + var10);
            for (var11 = 0; var11 < param3 - 1 - 2 * (var10 + param1); var11++) {
              var13.field_v[var6] = var8;
              var6++;
            }
            var6 = var6 + (param1 + (var10 + 1));
          }
        }
        if (param0 != 119) {
          tf.a((byte) -3, -17, -90, -4, -52);
        }
        for (var7Lifetime1 = 0; param4 >> 1 > var7Lifetime1; var7Lifetime1++) {
          var8Lifetime1 = (-(var7Lifetime1 * 32 / param4) + 128) * 65793;
          var9Lifetime1 = var8Lifetime1 >>> 1 & 8355711;
          var10Lifetime1 = var7Lifetime1 * 2;
          if (-((param2 + var10Lifetime1) * 2) + param3 - 1 <= 0) {
            var6 = var6 + var10Lifetime1;
            var11Lifetime1 = 0;
            while (var11Lifetime1 < -(2 * var10Lifetime1) + (-1 + param3)) {
              var13.field_v[var6] = var9Lifetime1;
              var11Lifetime1++;
              var6++;
            }
            var6 = var6 + (var10Lifetime1 + 1);
          } else {
            for (var11Lifetime1 = 0; param2 > var11Lifetime1; var11Lifetime1++) {
              var13.field_v[var10Lifetime1 + var6 + var11Lifetime1] = var9Lifetime1;
              var13.field_v[param3 + var6 - (2 - (-var10Lifetime1 - var11Lifetime1))] = var9Lifetime1;
            }
            var6 = var6 + (param2 + var10Lifetime1);
            var11Lifetime1 = 0;
            while (-1 + param3 - 2 * (var10Lifetime1 + param2) > var11Lifetime1) {
              var13.field_v[var6] = var8Lifetime1;
              var11Lifetime1++;
              var6++;
            }
            var6 = var6 + (1 + var10Lifetime1 + param2);
          }
        }
        return var13;
    }

    final static int a(int param0, int param1) {
        int var2 = -13 % ((-60 - param0) / 39);
        return param1 >> 8 & 255;
    }

    tf() {
    }

    static {
        field_n = 0;
    }
}

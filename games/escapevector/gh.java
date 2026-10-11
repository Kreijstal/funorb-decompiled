/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    final static void a(int param0, int param1, boolean param2, boolean param3) {
        gh.a(param0, param1, 0, param2, param3);
    }

    private final static void a(int param0, int param1, int param2, boolean param3, boolean param4) {
        int var11 = 0;
        int var12 = 0;
        int var19 = 0;
        int var20 = 0;
        int incrementValue$0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        var5 = (param2 & 16711935) * (256 - param1) >>> 8 & 16711935;
        param2 = var5 | (param2 & 65280) * (256 - param1) >>> 8 & 65280;
        var8 = 0;
        if (!param3) {
          var6 = 0;
        } else {
          var6 = (em.field_l - 1) % param0;
          var8 = var8 + (param0 - 1);
        }
        if (!param4) {
          var7 = 0;
        } else {
          var7 = (em.field_d - 1) % param0;
          var8 = var8 + (param0 - 1) * em.field_l;
        }
        var9 = var7 * em.field_l + var6;
        var10 = em.field_l * param0 - (em.field_l + param0 - 1) / param0 * param0;
        for (var11 = var7; var11 < em.field_d; var11 = var11 + param0) {
          for (var12 = var6; var12 < em.field_l; var12 = var12 + param0) {
            var13 = em.field_i[var9];
            var14 = (var13 & 16711935) * param1 >>> 8 & 16711935;
            var13 = (var14 | (var13 & 65280) * param1 >>> 8 & 65280) + param2;
            var15 = param0;
            var16 = param0;
            var17 = var9 - var8;
            var18 = em.field_l;
            if (!param3) {
              if (var15 > em.field_l - var12) {
                var15 = em.field_l - var12;
              }
            } else {
              if (var15 > var12 + 1) {
                var17 = var17 + (var15 - var12 - 1);
                var15 = var12 + 1;
              }
            }
            if (!param4) {
              if (var16 > em.field_d - var11) {
                var16 = em.field_d - var11;
              }
            } else {
              if (var16 > var11 + 1) {
                var17 = var17 + (var16 - var11 - 1) * var18;
                var16 = var11 + 1;
              }
            }
            var18 = var18 - var15;
            var15 = -var15;
            var16 = -var16;
            for (var19 = var16; var19 < 0; var19++) {
              for (var20 = var15; var20 < 0; var20++) {
                incrementValue$0 = var17;
                var17++;
                em.field_i[incrementValue$0] = var13;
              }
              var17 = var17 + var18;
            }
            var9 = var9 + param0;
          }
          var9 = var9 + var10;
        }
    }
}

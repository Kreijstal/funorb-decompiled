/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends pg {
    int field_g;
    static String field_i;
    static String field_h;
    static kc field_m;
    int field_k;
    static int[] field_l;
    wk field_j;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var15 = 0;
        int var16 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        var22 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = param4 * param4;
          var6 = param0 - param4;
          var7 = param4 + param0;
          var8 = -param4 + param1;
          var9 = param1 + param4;
          if (var8 < de.field_i) {
            var8 = de.field_i;
          }
          if (de.field_h < var9) {
            var9 = de.field_h;
          }
          if (var6 < de.field_c) {
            var6 = de.field_c;
          }
          if (var7 > de.field_k) {
            var7 = de.field_k;
          }
          var24 = de.field_l;
          var23 = var24;
          var10 = var23;
          if (param3 != 2232) {
            field_l = (int[]) null;
          }
          for (var15 = var6; var7 > var15; var15++) {
            for (var16 = var8; var9 > var16; var16++) {
              boolean decompiledFrameRemainder0 = true;
              var12 = var16 - param1;
              var13 = -param0 + var15;
              var14 = var13 * var13 + var12 * var12;
              if (var14 < var5_int) {
                if (var14 == 0) {
                  var14 = 1;
                }
                var11 = var16 + var15 * de.field_e;
                var17 = 256 + param2 * var14 / var5_int - param2;
                var18 = var24[var11];
                var19 = var18 >> 16 & 255;
                var20 = 255 & var18 >> 8;
                var21 = 255 & var18;
                if (0 < var17) {
                  if (var17 == 256) {
                    var10[var11] = fj.b(fj.b(var19 << 16, var20 << 8), var21);
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (var17 <= var20) {
                      var20 = -(var17 * (var20 - var17) / (256 - var17)) + var17;
                    } else {
                      var20 = var20 + (256 - var17);
                    }
                    if (var17 <= var19) {
                      var19 = var17 - var17 * (var19 - var17) / (256 - var17);
                    } else {
                      var19 = var19 + (256 - var17);
                    }
                    if (var17 > var21) {
                      var21 = var21 + (256 - var17);
                    } else {
                      var21 = var17 - var17 * (var21 - var17) / (-var17 + 256);
                    }
                  }
                } else {
                  var20 = -var20 + 255;
                  var19 = 255 - var19;
                  var21 = -var21 + 255;
                }
                if (decompiledFrameRemainder0) {
                  var10[var11] = fj.b(fj.b(var19 << 16, var20 << 8), var21);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "hl.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 == -1513388336) {
          field_m = null;
          field_h = null;
          field_l = null;
          field_i = null;
          return;
        }
        field_m = (kc) null;
        field_m = null;
        field_h = null;
        field_l = null;
        field_i = null;
    }

    hl() {
    }

    static {
        field_i = "  You have the option of selecting Team Games when you select 'Create an Unrated Game' or when you set up the options for a Rated game. When this option is selected, any game with either 4 or 6 players will be divided into two seperate teams, the <u><col=aa0000>Reds</col></u> and the <u><col=0000ff>Blues</col></u>.";
        field_h = "Withdraw request to join <%0>'s game";
    }
}

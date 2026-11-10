/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteFadeHelpers {
    static PlatformTaskDispatcher field_a;
    static Sprite[] field_e;
    static LoginPayloadKind field_d;
    static int field_b;
    static AccountRequestState field_c;

    final static void drawHorizontalFadeSprite(IndexedSprite param0, int param1, int param2, int param3, int param4, byte param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        IndexedSprite var21 = null;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = ZombieDawn.field_J;
        try {
          var6_int = (param1 - param2 << 8) / param0.field_a;
          param3 = param3 + param0.field_g;
          param4 = param4 + param0.field_h;
          var7 = (param2 << 8) + var6_int * param0.field_g;
          var8 = Rasterizer.width * param4 + param3;
          var9 = 0;
          var10 = param0.field_d;
          var11 = param0.field_j;
          var12 = -var11 + Rasterizer.width;
          var13 = 0;
          if (param4 < Rasterizer.clipTop) {
            var14 = Rasterizer.clipTop - param4;
            param4 = Rasterizer.clipTop;
            var10 = var10 - var14;
            var9 = var9 + var11 * var14;
            var8 = var8 + Rasterizer.width * var14;
          }
          if (Rasterizer.clipBottom < var10 + param4) {
            var10 = var10 - (param4 + (var10 - Rasterizer.clipBottom));
          }
          if (Rasterizer.clipLeft > param3) {
            var14Lifetime1 = Rasterizer.clipLeft - param3;
            var7 = var7 + var14Lifetime1 * var6_int;
            param3 = Rasterizer.clipLeft;
            var8 = var8 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
          }
          if (param3 + var11 > Rasterizer.clipRight) {
            var14Lifetime2 = var11 + param3 - Rasterizer.clipRight;
            var12 = var12 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
          }
          if (param5 != 84) {
            var21 = (IndexedSprite) null;
            SpriteFadeHelpers.drawHorizontalFadeSprite((IndexedSprite) null, -118, 46, -65, -1, (byte) -59);
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param4 = -var10; param4 < 0; param4++) {
              var14Lifetime3 = var7;
              for (param3 = -var11; param3 < 0; param3++) {
                var15 = var14Lifetime3 >> 8;
                var16 = -var15 + 256;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 < 0) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param0.field_l[param0.field_k[incrementValue$0] & 255];
                  if (0 != var17) {
                    if (var15 <= 255) {
                      var18 = Rasterizer.pixels[var8];
                      var19 = 16711935 & (16711935 & var17) * var15 + var16 * (var18 & 16711935) >> 8;
                      Rasterizer.pixels[var8] = (TextHotspotRegion.bitAnd(TextHotspotRegion.bitAnd(var17, 65280) * var15 + var16 * TextHotspotRegion.bitAnd(65280, var18), 16711732) >> 8) + var19;
                    } else {
                      Rasterizer.pixels[var8] = var17;
                    }
                  }
                  var8++;
                }
              }
              var8 = var8 + var12;
              var9 = var9 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("vh.A(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        int var1 = 92 % ((param0 + 17) / 32);
        field_d = null;
        field_e = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_d = new LoginPayloadKind(2);
        field_b = 0;
        field_c = new AccountRequestState();
    }
}

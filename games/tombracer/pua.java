/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pua extends hq {
    static apa field_c;
    private static String[] field_d;

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 >= -45) {
          return;
        }
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[] var21 = null;
        int var15Lifetime1;
        int var15Lifetime2;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          var11 = CharacterPreview.clamp(LineShape.field_h, -16226, gca.field_d, param2);
          var12 = CharacterPreview.clamp(LineShape.field_h, -16226, gca.field_d, param3);
          var13 = CharacterPreview.clamp(DiskCacheWorker.field_c, -16226, pka.field_b, param1);
          var14 = CharacterPreview.clamp(DiskCacheWorker.field_c, -16226, pka.field_b, param6);
          var7_int = CharacterPreview.clamp(LineShape.field_h, -16226, gca.field_d, param4 + param2);
          var8 = CharacterPreview.clamp(LineShape.field_h, -16226, gca.field_d, param3 - param4);
          for (var15 = var11; var7_int > var15; var15++) {
            C2SRoomResultPacket.fillRange((byte) -55, param5, var14, vaa.field_a[var15], var13);
          }
          for (var15Lifetime1 = var12; var8 < var15Lifetime1; var15Lifetime1--) {
            C2SRoomResultPacket.fillRange((byte) -55, param5, var14, vaa.field_a[var15Lifetime1], var13);
          }
          var9 = CharacterPreview.clamp(DiskCacheWorker.field_c, -16226, pka.field_b, param4 + param1);
          var10 = CharacterPreview.clamp(DiskCacheWorker.field_c, -16226, pka.field_b, -param4 + param6);
          if (param0 >= -11) {
            pua.releaseStatics((byte) -34);
          }
          for (var15Lifetime2 = var7_int; var15Lifetime2 <= var8; var15Lifetime2++) {
            var21 = vaa.field_a[var15Lifetime2];
            C2SRoomResultPacket.fillRange((byte) -55, param5, var9, var21, var13);
            C2SRoomResultPacket.fillRange((byte) -55, param5, var14, var21, var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var7), "pua.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_d = new String[2];
        field_d[0] = "Boulder 2x2";
        field_d[1] = "Sawblade";
    }
}

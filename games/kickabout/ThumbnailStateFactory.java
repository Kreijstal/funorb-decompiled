/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ThumbnailStateFactory {
    static int field_c;
    static boolean field_b;
    static String field_e;
    static String field_a;
    static CommonGame field_d;

    final static Sprite[] createThumbnailStates(int param0, String param1, Sprite param2, int param3) {
        int var5 = 0;
        Sprite[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Sprite[] var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        Sprite[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          param2 = CachedArchiveSource.a((byte) -86, param2, param3);
          var9 = new Sprite[2];
          var4 = var9;
          for (var5 = param0; var5 < 2; var5++) {
            var4[var5] = new Sprite(param2.field_o, param2.field_v);
            stackIn_6_0 = (1 != var5) ? 0 : 1;
            var6 = stackIn_6_0;
            PacketBuffer.a(param0 ^ 55, var9[var5]);
            param2.d(0, 0);
            if (var6 == 0) {
              SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_g, SoftwareRasterizer.field_f);
            }
            stackIn_12_0 = (var6 != 0) ? 2 : 0;
            var7 = stackIn_12_0;
            ByteArrayPool.field_d.d(param1.toLowerCase(), var7 + (SoftwareRasterizer.field_g >> 1), -13 + (SoftwareRasterizer.field_f + var7), 0, -1);
            TeamManagementScreen.e(123);
            SpriteBackgroundSupport.fillTransparentBackground(var9[var5], (byte) -51);
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("et.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_a = null;
        if (param0 < 116) {
          Sprite var2 = (Sprite) null;
          ThumbnailStateFactory.createThumbnailStates(49, (String) null, (Sprite) null, 57);
        }
        field_e = null;
    }

    static {
        field_b = false;
        field_a = "Chat view has been scrolled up. Scroll down to chat.";
        field_e = "type";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static String[] field_e;
    static int field_a;
    static int[] decodedSpriteWidths;
    static RgbSprite field_d;
    static String field_c;

    final static RgbSprite a(int param0, RgbSprite param1) {
        RgbSprite var2 = null;
        RuntimeException var2_ref = null;
        RgbSprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new RgbSprite(param1.canvasWidth / 2, param1.canvasHeight / 2);
          var2.bindRasterTarget();
          param1.a(param0, 0, param1.canvasWidth / 2, param1.canvasHeight / 2);
          BallPulseEffect.framebuffer.bindRaster((byte) 102);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("jh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 54 / ((-65 - param0) / 48);
        field_d = null;
        decodedSpriteWidths = null;
        field_c = null;
        field_e = null;
    }

    final static void a(boolean param0, mh param1) {
        mh var4 = null;
        mh var5 = null;
        int var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = (mh) (param1.field_bb.first(-104));
          mh var2 = var4;
          while (var4 != null) {
            var4.field_Db = 0;
            var4.field_cb = 0;
            var4.field_C = 0;
            var4.field_zb = 0;
            var5 = (mh) (param1.field_bb.next((byte) 116));
            var5 = var5;
          }
          if (!param0) {
            jh.a((byte) -19);
          }
          param1.field_zb = 0;
          param1.field_Db = 0;
          param1.field_cb = 0;
          param1.field_C = 0;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "jh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = "Good grief!";
        field_a = 250;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundPlayback extends IntrusiveNode {
    static SoundCache soundCache;
    int baseGain;
    PcmStream stream;
    static volatile int livePressX;
    static String field_k;
    IntrusiveNode sourceNode;

    final static void a(int param0, int param1, RasterCacheSurface param2, int param3, int param4, RgbSprite param5) {
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-89, param2.sprite);
          la.a(param5, (-param5.canvasWidth + param2.width) / 2, -param5.canvasHeight + (param0 + param2.height), MatchCompleteScreen.field_C[param3]);
          sc.popRaster(-95);
          if (param1 != 26746) {
            RgbSprite var7 = (RgbSprite) null;
            SoundPlayback.a(-125, 69, (RasterCacheSurface) null, 30, 70, (RgbSprite) null);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "l.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static AccountResponse a(int param0) {
        if (IntrusiveHashIterator.field_g == StrongCacheEntry.field_P) {
          throw new IllegalStateException();
        }
        if (IntrusiveHashIterator.field_g == StatefulWidgetRenderer.field_v) {
          IntrusiveHashIterator.field_g = StrongCacheEntry.field_P;
          return StateIconLabel.field_Rb;
        }
        if (param0 <= 17) {
          return (AccountResponse) null;
        }
        return null;
    }

    public static void a(byte param0) {
        soundCache = null;
        if (param0 <= 22) {
          soundCache = (SoundCache) null;
          field_k = null;
          return;
        }
        field_k = null;
    }

    final static String a(byte param0, String param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        String stackIn_36_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (1 == param2) {
            stackIn_2_0 = rd.a(IntKeyIndex.field_d, new String[]{param1}, (byte) 103);
            return stackIn_2_0;
          }
          if (param2 == 2) {
            stackIn_5_0 = rd.a(InstructionsScreen.field_w, new String[]{param1}, (byte) 103);
            return stackIn_5_0;
          }
          if (param2 == 3) {
            stackIn_9_0 = rd.a(DateInputWidget.field_K, new String[]{param1}, (byte) 103);
            return stackIn_9_0;
          }
          if (param2 == 4) {
            stackIn_13_0 = rd.a(ArcticBackground.field_v, new String[]{param1}, (byte) 103);
            return stackIn_13_0;
          }
          if (5 == param2) {
            stackIn_17_0 = rd.a(Brick.field_z, new String[]{param1}, (byte) 103);
            return stackIn_17_0;
          }
          if (param2 == 6) {
            stackIn_20_0 = rd.a(SpriteGeometry.field_B, new String[]{param1}, (byte) 103);
            return stackIn_20_0;
          }
          if (param2 == 7) {
            stackIn_23_0 = rd.a(bm.field_e, new String[]{param1}, (byte) 103);
            return stackIn_23_0;
          }
          if (8 == param2) {
            stackIn_27_0 = rd.a(BlankScreen.field_h, new String[]{param1}, (byte) 103);
            return stackIn_27_0;
          }
          if (param0 != -110) {
            field_k = (String) null;
          }
          if (param2 == 11) {
            stackIn_33_0 = rd.a(rd.field_c, new String[]{param1}, (byte) 103);
            return stackIn_33_0;
          }
          if (param2 == 12) {
            stackIn_36_0 = rd.a(LevelPack.field_f, new String[]{param1}, (byte) 103);
            return stackIn_36_0;
          }
          if (param2 != 13) {
            return null;
          }
          stackIn_40_0 = rd.a(gr.field_b, new String[]{param1}, (byte) 103);
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_43_0 = var3;
          stackIn_43_1 = new StringBuilder().append("l.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(')').toString());
        }
    }

    SoundPlayback(PcmStream stream, IntrusiveNode sourceNode) {
        try {
          this.stream = stream;
          this.baseGain = stream.getGain();
          this.sourceNode = sourceNode;
          this.stream.setGain(128 + this.baseGain * BackgroundScene.masterSoundGain >> 8);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "l.<init>(" + (stream != null ? "{...}" : "null") + ',' + (sourceNode != null ? "{...}" : "null") + ')');
        }
    }

    static {
        livePressX = 0;
        field_k = "Password is valid";
    }
}

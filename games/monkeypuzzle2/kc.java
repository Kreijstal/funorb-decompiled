/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kc {
    static int field_c;
    static IntrusiveDeque field_a;
    static Boolean field_b;
    static int field_d;

    abstract void a(int param0, PacketBuffer param1);

    final static void b(boolean param0) {
        if (null == ha.field_Z) {
          ha.field_Z = PcmSampleStream.createForPlaybackRate(ke.field_h[4], 100, 96);
          na.a((byte) 60, ha.field_Z);
          if (!param0) {
            field_b = (Boolean) null;
          }
          return;
        }
        if (!ha.field_Z.isSamplePositionOutOfRange()) {
          return;
        }
        ha.field_Z = PcmSampleStream.createForPlaybackRate(ke.field_h[4], 100, 96);
        na.a((byte) 60, ha.field_Z);
        if (!param0) {
          field_b = (Boolean) null;
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 4) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1 = TextFieldValidator.field_k;
          synchronized (var1) {
            PcmResampler.field_b = bh.field_e;
            WeightedObjectCache.field_c = WeightedObjectCache.field_c + 1;
            if (param0 < 86) {
              field_b = (Boolean) null;
            }
            if (0 > vf.field_a) {
              var5 = 0;
              var2 = var5;
              while (112 > var5) {
                dl.field_c[var5] = false;
                var5++;
              }
              vf.field_a = ImageProducerRasterBuffer.field_j;
            } else {
              while (ImageProducerRasterBuffer.field_j != vf.field_a) {
                var2 = ProxySocketConnector.field_g[ImageProducerRasterBuffer.field_j];
                ImageProducerRasterBuffer.field_j = 127 & ImageProducerRasterBuffer.field_j + 1;
                if (var2 < 0) {
                  dl.field_c[~var2] = false;
                  continue;
                }
                dl.field_c[var2] = true;
              }
            }
            bh.field_e = jk.field_w;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "kc.I(" + param0 + ')');
        }
    }

    abstract fk a(boolean param0);

    static {
        field_d = 0;
    }
}

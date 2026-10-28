/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    private ResourceArchive field_d;
    private WeightedLruCache field_c;
    static int field_h;
    private ResourceArchive field_j;
    static TerrainMaskSupport field_b;
    static int field_e;
    static boolean field_g;
    static String field_f;
    static String field_a;
    static PcmSample field_i;

    final static void a(String param0, boolean param1, int param2, boolean param3) {
        try {
          if (param2 != 64) {
            field_i = (PcmSample) null;
          }
          fc.a(3161);
          bo.field_F.l(param2 ^ 17479);
          PcmResampler.field_d = new h(StrongCacheEntry.field_v, (String) null, eb.field_H, param3, param1);
          rd.field_c = new ng(bo.field_F, PcmResampler.field_d);
          bo.field_F.b(rd.field_c, 40);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ff.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_i = null;
        field_b = null;
        field_f = null;
        if (guard != 100) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final QuickChatPhraseDefinition a(int param0, byte param1) {
        byte[] var4 = null;
        QuickChatPhraseDefinition var3 = (QuickChatPhraseDefinition) (this.field_c.get((long)param0, (byte) -54));
        if (var3 != null) {
          return var3;
        }
        if (param0 >= 32768) {
          var4 = this.field_j.getFile(1, (byte) -97, 32767 & param0);
        } else {
          var4 = this.field_d.getFile(1, (byte) -97, param0);
        }
        var3 = new QuickChatPhraseDefinition();
        if (var4 != null) {
          var3.decode(new PacketBuffer(var4), 0);
        }
        if (param0 >= 32768) {
          var3.markGlobalResponses((byte) 88);
        }
        if (param1 <= -118) {
          this.field_c.put(var3, (long)param0, (byte) 100);
          return var3;
        }
        field_e = -127;
        this.field_c.put(var3, (long)param0, (byte) 100);
        return var3;
    }

    final static void a(byte param0) {
        if (param0 <= 50) {
          ff.a((byte) -15);
        }
        SectorCacheStore.a((byte) 123);
        if (mj.field_d != 0) {
          if (mj.field_d < 1000) {
            mj.field_d = mj.field_d + 1;
            pl.field_q.a(400);
            SingleChildContainer.field_y = true;
            IntValueNode.field_j = true;
            return;
          }
          pl.field_q.a(400);
          SingleChildContainer.field_y = true;
          IntValueNode.field_j = true;
          return;
        }
        if (dj.field_c != null) {
          dj.field_c.fadeOut(2048);
        } else {
          dj.field_c = PcmSampleStream.createAtRatePercentQ6(nn.field_g, 100, 3072 * IterableNodeHashTable.field_c / 64, 8192);
          ObjectSpriteSet.field_e.addSubstream(dj.field_c);
          sj.a(8192, (byte) 51);
          if (mj.field_d < 1000) {
            mj.field_d = mj.field_d + 1;
            pl.field_q.a(400);
            SingleChildContainer.field_y = true;
            IntValueNode.field_j = true;
            return;
          }
          pl.field_q.a(400);
          SingleChildContainer.field_y = true;
          IntValueNode.field_j = true;
          return;
        }
        dj.field_c = PcmSampleStream.createAtRatePercentQ6(nn.field_g, 100, 3072 * IterableNodeHashTable.field_c / 64, 8192);
        ObjectSpriteSet.field_e.addSubstream(dj.field_c);
        sj.a(8192, (byte) 51);
        if (mj.field_d < 1000) {
          mj.field_d = mj.field_d + 1;
          pl.field_q.a(400);
          SingleChildContainer.field_y = true;
          IntValueNode.field_j = true;
          return;
        }
        pl.field_q.a(400);
        SingleChildContainer.field_y = true;
        IntValueNode.field_j = true;
    }

    private ff() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new TerrainMaskSupport();
        field_a = "Waiting for extra data";
        field_f = "Container is on hill - please land closer";
    }
}

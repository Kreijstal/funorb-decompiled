/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends IntrusiveNode {
    int field_j;
    static RgbSprite[] field_g;
    static int field_i;
    IntrusiveNode field_f;
    static tl field_l;
    RawPcmStream field_h;
    static int field_k;

    final static void a(boolean param0, java.awt.Component param1) {
        try {
          param1.setFocusTraversalKeysEnabled(param0);
          param1.addKeyListener(ad.field_b);
          param1.addFocusListener(ad.field_b);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "hf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(BitmapFont param0, int param1, int param2, int param3, int param4, boolean param5, int param6, RgbSprite[] param7, BitmapFont param8, int param9, int param10, int param11, int param12, RgbSprite[] param13, int param14) {
        try {
          RgbSprite[] var17 = (RgbSprite[]) null;
          ok.a(param2, param9, param4, param13, param11, param6, param3, -1, 0, lf.field_e, he.field_C, param7, param14, mf.field_c, 480, (RgbSprite[]) null, param12, 0, param1, param0, param8);
          hb.a(param5, (byte) -128);
          if (param10 < 5) {
            ResourceArchive var16 = (ResourceArchive) null;
            hf.a((PcmStreamMixer) null, (ResourceArchive) null, 124, 16);
          }
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "hf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + (param13 != null ? "{...}" : "null") + ',' + param14 + ')');
        }
    }

    final static void a(PcmStreamMixer param0, ResourceArchive param1, int param2, int param3) {
        try {
          DualLinkDequeIterator.field_h = ok.a((byte) 84) * param2 / param3;
          fb.a(-2, param1);
          RasterBuffer.a(param1, -237);
          f.a(param1, -17763);
          OrbDefence.d(false);
          DequeWidgetContainer.j(0);
          ji.field_b = -DualLinkDequeIterator.field_h + 0;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "hf.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void clearStaticReferences(boolean param0) {
        field_g = null;
        if (!param0) {
          return;
        }
        field_l = null;
    }

    hf(RawPcmStream param0, IntrusiveNode param1) {
        try {
          this.field_h = param0;
          this.field_j = param0.getTargetVolume();
          this.field_f = param1;
          this.field_h.setVolume(ck.field_f * this.field_j + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 0;
        field_l = new tl();
    }
}

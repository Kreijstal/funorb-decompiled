/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends IntrusiveNode {
    static RgbSprite[] arcticCentreSprites;
    static int field_i;
    static int incomingPacketLength;
    static boolean[] field_l;

    public ga() {
    }

    final static void a(boolean param0, int param1) {
        boolean decompiledFrameRemainder0 = true;
        if ((ml.field_b <= 0) &&
          (decompiledFrameRemainder0 = (!(IntArrayRequest.field_j <= 0) ||
          !(0 >= TableDataRequest.field_m))) &&
          (decompiledFrameRemainder0 = !(!hc.field_c))) {
          Rasterizer2D.darkenRectangle(0, 0, Rasterizer2D.width, DualLinkDeque.field_d.screenY);
          wi.field_j.drawRoot(true, param0);
          if (param1 >= -106) {
            field_l = (boolean[]) null;
          }
          return;
        }
        if (decompiledFrameRemainder0) {
          if (sc.field_c) {
            Rasterizer2D.darkenRectangle(0, 0, Rasterizer2D.width, DualLinkDeque.field_d.screenY);
            qp.field_f.drawRoot(true, param0);
            if ((!(IntArrayRequest.field_j <= 0) ||
              !(0 >= TableDataRequest.field_m)) &&
              hc.field_c) {
              Rasterizer2D.darkenRectangle(0, 0, Rasterizer2D.width, DualLinkDeque.field_d.screenY);
              wi.field_j.drawRoot(true, param0);
            }
          } else {
            if (IntArrayRequest.field_j > 0) {
              if (hc.field_c) {
                Rasterizer2D.darkenRectangle(0, 0, Rasterizer2D.width, DualLinkDeque.field_d.screenY);
                wi.field_j.drawRoot(true, param0);
              }
            } else {
              if (0 < TableDataRequest.field_m &&
                hc.field_c) {
                Rasterizer2D.darkenRectangle(0, 0, Rasterizer2D.width, DualLinkDeque.field_d.screenY);
                wi.field_j.drawRoot(true, param0);
              }
            }
          }
        }
        if (param1 < -106) {
          return;
        }
        field_l = (boolean[]) null;
    }

    final static void d(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        if (BackgroundScene.masterSoundGain <= 32) {
          SingleChildWidget.a(13894, 0);
          var1 = -2 % ((-60 - param0) / 34);
          return;
        }
        var1Lifetime1 = BackgroundScene.masterSoundGain % 32;
        if (0 == var1Lifetime1) {
          var1Lifetime1 = 32;
        }
        SingleChildWidget.a(13894, BackgroundScene.masterSoundGain - var1Lifetime1);
        var1Lifetime2 = -2 % ((-60 - param0) / 34);
    }

    final static boolean c(int param0) {
        if (param0 != 30794) {
          return false;
        }
        return !LabeledWidget.field_I.b(96) ? true : false;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          ga.a(51);
          field_l = null;
          arcticCentreSprites = null;
          return;
        }
        field_l = null;
        arcticCentreSprites = null;
    }

    static {
    }
}

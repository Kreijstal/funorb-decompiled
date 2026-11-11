/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static String field_b;
    static SpriteData field_a;

    public static void releaseStatics(byte param0) {
        int var1 = -87 % ((param0 - 30) / 32);
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        BufferedSocket.field_g = SoftwareRasterizer.height;
        SceneLight.field_i = SoftwareRasterizer.width;
        NodeHashTable.a(16);
        oca.field_b.a(0, 0, 20, C2SRoomResultPacket.field_a.field_G, -2 + (-40 + C2SRoomResultPacket.field_a.field_t));
        PerlinNoise2D.field_t.setBounds(hk.field_e.field_G, di.field_a, param0 + 5264, 0, 0);
        int var1 = 2 + di.field_a;
        RasterShape.field_e.setBounds(hk.field_e.field_G, hk.field_e.field_t - (UnlockOverlay.field_p ? var1 : 0), -23776, !UnlockOverlay.field_p ? 0 : var1, 0);
        GameFont.a(false);
        ImageProducerRasterBuffer.field_j.setBounds(C2SRoomResultPacket.field_a.field_G, 40, -23776, C2SRoomResultPacket.field_a.field_t - 40, 0);
        C2SChooseCharacterPacket.field_a.setBounds(OpenGlToolkit.field_fd.field_G, 30, -23776, 0, 0);
        Obstacle.field_s.setBounds(OpenGlToolkit.field_fd.field_G, OpenGlToolkit.field_fd.field_t - 40 - 2 - 30, param0 + 5264, 30, 0);
        gta.field_b.setBounds(68, 30, -23776, 5, 5);
        RandomBrickOperator.field_r.setBounds(78, 30, -23776, 5, 75);
        RotateLocomotor.field_o.setBounds(48, 30, -23776, 5, 155);
        if (param0 == -29040) {
          MidiPcmStream.field_K.setBounds(48, 30, -23776, 5, 205);
          var2 = UnlockOverlay.field_p ? 250 : 200;
          MirrorComponent.field_I.setBounds(-var2 + 363, 30, -23776, 5, 5 + var2);
          cq.field_e.setBounds(-365 + (-5 + (OpenGlToolkit.field_fd.field_G - 5)), 30, -23776, 5, 370);
          nsa.field_i.setPaneBounds(-5 + (Obstacle.field_s.field_G - 5), 2, (byte) 127, 5, io.field_a, -42 + Obstacle.field_s.field_t, 37);
          var3 = (2 + OpenGlToolkit.field_fd.field_G) / 2;
          TileRenderable.field_c.setBounds(var3 - 2, 40, param0 + 5264, -40 + OpenGlToolkit.field_fd.field_t, 0);
          if (!UnlockOverlay.field_p) {
            var3 = 0;
          }
          CharacterChoiceFactory.field_c.setBounds(OpenGlToolkit.field_fd.field_G - var3, 40, param0 + 5264, OpenGlToolkit.field_fd.field_t - 40, var3);
          return;
        }
    }

    static {
        field_b = "DNF";
    }
}

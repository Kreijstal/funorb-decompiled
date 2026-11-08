/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlphaContainer extends SingleChildContainer {
    static int[] field_C;
    int field_F;
    static String field_A;
    static String field_D;
    static UiLayoutNode field_E;

    final static IndexedSprite renderCrowdFrame(boolean param0, int param1, IntrusiveDeque param2, int param3) {
        Sprite var4 = null;
        RuntimeException var4_ref = null;
        Sprite var5 = null;
        PlayerModelPreview var6 = null;
        int var7 = 0;
        Sprite[] stackIn_3_0 = null;
        int stackIn_4_1 = 0;
        Sprite stackIn_6_0 = null;
        int stackIn_7_1 = 0;
        IndexedSprite stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          stackIn_3_0 = TeamSelectionAgent.field_p;
          if (param0) {
            stackIn_4_1 = 0;
          } else {
            stackIn_4_1 = 1;
          }
          var4 = stackIn_3_0[stackIn_4_1];
          var5 = new Sprite(var4.field_o, var4.field_v);
          PacketBuffer.pushSpriteRaster(-55, var5);
          stackIn_6_0 = FootballerPreview.a(-5275);
          if (!param0) {
            stackIn_7_1 = -10;
          } else {
            stackIn_7_1 = -120;
          }
          ((Sprite) (Object) stackIn_6_0).drawOpaque(stackIn_7_1, 0);
          var4.draw(0, 0);
          var6 = (PlayerModelPreview) (param2.first(24009));
          while (var6 != null) {
            var6.drawSpectatorFrame(param3, -2);
            var6 = (PlayerModelPreview) (param2.next(33));
          }
          if (param1 > -41) {
            field_D = (String) null;
          }
          TeamManagementScreen.e(120);
          stackIn_13_0 = SoftwareDrawingSupport.toIndexedSprite(var5);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("pj.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    AlphaContainer(UiWidget param0) {
        super(param0.field_t, param0.field_g, param0.field_n, param0.field_i, (WidgetPainter) null, (UiListener) null);
        try {
          param0.setBounds(this.field_i, 1, 0, this.field_n, 0);
          this.field_F = 256;
          this.field_z = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_C = null;
        field_E = null;
        field_A = null;
        if (param0 <= 110) {
          field_E = (UiLayoutNode) null;
          field_D = null;
          return;
        }
        field_D = null;
    }

    public AlphaContainer() {
        super(0, 0, 0, 0, (WidgetPainter) null, (UiListener) null);
        this.field_F = 256;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (0 != param0) {
          return;
        }
        if (null == this.field_z) {
          return;
        }
        if (this.field_F == 0) {
          return;
        }
        if (256 == this.field_F) {
          this.field_z.drawLayer(param0, 65, this.field_t + param2, this.field_g + param3);
          return;
        }
        Sprite var6 = new Sprite(this.field_z.field_n, this.field_z.field_i);
        PacketBuffer.pushSpriteRaster(-46, var6);
        this.field_z.drawLayer(param0, (int) (char)param1, 0, 0);
        TeamManagementScreen.e(127);
        var6.drawAlpha(param2 + this.field_t, this.field_g + param3, this.field_F);
    }

    static {
        field_D = "Money: ";
        field_A = "draw?";
    }
}

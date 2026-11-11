/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class VertexAttribute {
    private int field_c;
    static VertexAttribute field_p;
    static VertexAttribute field_e;
    int field_l;
    private GpuDataType field_g;
    int field_i;
    static VertexAttribute field_b;
    static VertexAttribute field_m;
    static VertexAttribute field_n;
    static VertexAttribute field_k;
    static VertexAttribute field_j;
    static int field_f;
    static nt field_o;
    static boolean field_r;
    static String field_q;
    static float field_h;
    static Hashtable field_d;
    static String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void loadBasicSprites(ResourceArchive param0, boolean param1) {
        UiComponent stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        UiComponent stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        UiComponent var3 = null;
        ResourceArchive var4 = null;
        UiComponent var6 = null;
        UiComponent var7 = null;
        try {
          ConsoleValue.field_e = MaskBlendOperator.loadSpriteByName(param0, "basic", "display_name_changed", 121);
          TextureCoordinateGeneration.field_b = new TitledScrollPanel(0L, LegacyOpenGlWaterTextures.field_d, GraphicsQuality.field_a, ai.field_d);
          OpenGlSprite.field_j = new TitledScrollPanel(0L, LegacyOpenGlWaterTextures.field_d, ParticleEffects.field_a, uma.field_a);
          dqa.field_e = new UiComponent(0L, (UiComponent) null);
          NameEntryPopup.field_yb = new UiComponent(0L, Corpse.field_i);
          NameEntryPopup.field_yb.field_z = 1;
          MatchScreen.field_F = new UiComponent(0L, ooa.field_f, CanvasImageBuffer.field_i);
          Puddle.field_v = new UiComponent(0L, SecondaryNodeDeque.field_b, C2SChooseCharacterPacket.field_c);
          SoftwareDepthBuffer.field_c = new UiComponent(0L, PressureSwitchBehaviour.field_p);
          dqa.field_e.addChild(-122, NameEntryPopup.field_yb);
          dqa.field_e.addChild(-126, MatchScreen.field_F);
          if (!param1) {
            var4 = (ResourceArchive) null;
            VertexAttribute.loadBasicSprites((ResourceArchive) null, true);
          }
          dqa.field_e.addChild(-123, Puddle.field_v);
          dqa.field_e.addChild(-123, TextureCoordinateGeneration.field_b);
          dqa.field_e.addChild(-125, SoftwareDepthBuffer.field_c);
          stackIn_4_0 = TextureCoordinateGeneration.field_b.field_vb.field_vb;
          stackIn_5_1 = !(param1);
          ((UiComponent) (Object) stackIn_4_0).applyStyle(stackIn_5_1, Corpse.field_i);
          TextureCoordinateGeneration.field_b.field_vb.field_vb.field_bb = 1;
          var6 = TextureCoordinateGeneration.field_b.field_vb.field_vb;
          var7 = var6;
          var7.field_z = 1;
          stackIn_7_0 = OpenGlSprite.field_j.field_vb.field_vb;
          stackIn_8_1 = !(param1);
          ((UiComponent) (Object) stackIn_7_0).applyStyle(stackIn_8_1, Corpse.field_i);
          OpenGlSprite.field_j.field_vb.field_vb.field_bb = 1;
          var3 = OpenGlSprite.field_j.field_vb.field_vb;
          var3.field_z = 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("gj.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static VertexAttribute forId(byte param0, int param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = param1;
        if (var2 == 0) {
          return field_p;
        }
        if (var2 == 1) {
          return field_e;
        }
        if (var2 == 2) {
          return field_b;
        }
        if (var2 == 3) {
          return field_m;
        }
        if (var2 == 4) {
          return field_n;
        }
        if (var2 == 5) {
          return field_k;
        }
        if (var2 == 6) {
          return field_j;
        }
        if (param0 == 41) {
          return null;
        }
        field_d = (Hashtable) null;
        return null;
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        field_o = null;
        field_e = null;
        field_j = null;
        int var1 = -99 / ((-68 - param0) / 50);
        field_d = null;
        field_q = null;
        field_a = null;
        field_n = null;
        field_k = null;
        field_p = null;
        field_b = null;
    }

    private VertexAttribute(int param0, int param1, GpuDataType param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = param0;
          this.field_c = param1;
          this.field_g = param2;
          this.field_l = this.field_g.field_e * this.field_c;
          if (this.field_i < 16) {
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("gj.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_p = new VertexAttribute(0, 3, GpuDataType.field_h);
        field_e = new VertexAttribute(1, 3, GpuDataType.field_h);
        field_b = new VertexAttribute(2, 4, GpuDataType.field_g);
        field_m = new VertexAttribute(3, 1, GpuDataType.field_h);
        field_n = new VertexAttribute(4, 2, GpuDataType.field_h);
        field_k = new VertexAttribute(5, 3, GpuDataType.field_h);
        field_j = new VertexAttribute(6, 4, GpuDataType.field_h);
        field_f = CauldronComponent.bitLength((byte) 93, 16);
        field_o = new nt();
        field_d = new Hashtable();
        field_a = "ESC - cancel private message";
    }
}

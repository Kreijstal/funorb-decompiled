/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_b;
    int field_a;
    static String field_c;

    final static QuickChatPhraseDefinition a(boolean param0) {
        int var1_int = 0;
        int var3 = 0;
        QuickChatPhraseDefinition stackIn_3_0 = null;
        QuickChatPhraseRegistry stackIn_6_0 = null;
        QuickChatPhraseDefinition stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        QuickChatPhraseDefinition var2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1_int = 0;
          if (param0) {
            stackIn_3_0 = (QuickChatPhraseDefinition) null;
            return stackIn_3_0;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
        stackIn_6_0 = GameScreen.field_A;
        try {
          while (true) {
            var2 = ((QuickChatPhraseRegistry) (Object) stackIn_6_0).a(var1_int, (byte) 100);
            if (var2.field_y) {
              stackIn_8_0 = var2;
              return stackIn_8_0;
            }
            var1_int++;
            stackIn_6_0 = GameScreen.field_A;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    final static MenuList a(int param0, int param1, int param2) {
        MenuList var9 = new MenuList(param0, param2, 209, rs.field_Cb.field_J);
        int var4 = (-rs.field_Cb.stringWidth(ho.field_g) + 209 - 20) / 2;
        vc.field_b = new Sprite(var4, 2);
        int var5 = 112 / ((param1 - 89) / 37);
        RandomAccessCacheFile.a(-107);
        vc.field_b.bindAsRenderTarget();
        gf.d(0, 0, var4, 2, 16777215);
        cg.i(0);
        SpriteButton var6 = new SpriteButton(5 + param0, var9.field_i / 2 + param2, vc.field_b);
        SpriteButton var7 = new SpriteButton(-vc.field_b.field_z + (var9.field_m + (param0 - 5)), var9.field_i / 2 + param2, vc.field_b);
        MenuLabel var8 = new MenuLabel(param0, param2, var9.field_m, var9.field_i, ho.field_g);
        var9.addChild(var6, 8);
        var9.addChild(var7, 8);
        var9.addChild(var8, 8);
        return var9;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 41) {
          hc.a(-92, -95, -94);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Loading music";
        field_c = "Lost";
    }
}

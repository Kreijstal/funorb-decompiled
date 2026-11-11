/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lla {
    static boolean field_b;
    TabbedPanel field_a;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_a.setBoundsAndLayoutTabs(var6, var7, param3, param0, -25436, param4, param1);
        NameEntryPopup.field_yb.setBounds(dqa.field_e.field_G, ToolkitSelector.field_a, param2 - 23796, 0, 0);
        MatchScreen.field_F.setBounds(-82 + (-io.field_a + (dqa.field_e.field_G - 2)), 18, param2 ^ -23756, 2 + ToolkitSelector.field_a, 0);
        Puddle.field_v.setBounds(82 + io.field_a, 18, -23776, 2 + ToolkitSelector.field_a, -80 + (dqa.field_e.field_G - io.field_a - 2));
        TextureCoordinateGeneration.field_b.setPanelBounds(io.field_a, 20, -128, 0, ToolkitSelector.field_a + 2 + 20, 2, -20 + (-2 + (dqa.field_e.field_t - ToolkitSelector.field_a)), dqa.field_e.field_G);
        OpenGlSprite.field_j.layoutChildren(param2, io.field_a, 0, 2);
    }

    lla(String param0, UiComponent param1) {
        String[] var3 = null;
        UiComponent[] var4 = null;
        try {
          var3 = new String[]{param0, MonochromeFillOperator.field_o, of.field_a};
          var4 = new UiComponent[]{param1, dqa.field_e, (UiComponent) ((Object) OpenGlSprite.field_j)};
          this.field_a = new TabbedPanel(0L, HazardEffect.field_a, var3, CachedArchiveSource.field_d, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "lla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int nextPowerOfTwo(boolean param0, int param1) {
        param1--;
        if (!param0) {
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
        lla.nextPowerOfTwo(false, 59);
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return 1 + param1;
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CacheReferenceNode extends DualLinkNode {
    static int field_r;
    static int field_w;
    static int field_s;
    static ToolkitSprite field_y;
    static int field_u;
    static WidgetTheme field_v;
    static PlatformTaskDispatcher field_t;
    static long lastServerReadMillis;
    int weight;

    public static void releaseStatics(byte param0) {
        field_t = null;
        if (param0 != 54) {
          CacheReferenceNode.a(-29);
          field_v = null;
          field_y = null;
          return;
        }
        field_v = null;
        field_y = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (TextureGeneratorNode.musicVolume >= 224) {
          lf.setMusicVolume(0, 256);
        } else {
          var1 = TextureGeneratorNode.musicVolume % 32;
          lf.setMusicVolume(0, TextureGeneratorNode.musicVolume + (32 - var1));
        }
        var1Lifetime1 = -44 % ((param0 - 35) / 40);
    }

    abstract Object getValue(byte param0);

    abstract boolean isSoftReference(int param0);

    final static boolean a(byte param0) {
        int var1 = 102 / ((param0 + 27) / 59);
        if (SecondaryNodeDequeIterator.field_b == null) {
          return false;
        }
        if (SecondaryNodeDequeIterator.field_b.canAutoResize(-1)) {
          return true;
        }
        return false;
    }

    CacheReferenceNode(int param0) {
        this.weight = param0;
    }

    static {
        field_s = 0;
    }
}

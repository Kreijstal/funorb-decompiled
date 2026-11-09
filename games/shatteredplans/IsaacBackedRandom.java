/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IsaacBackedRandom extends Random {
    static String field_d;
    private IsaacRandom field_f;
    static AnimatedPanel field_a;
    static String field_e;
    static SecondaryNodeHashTable field_b;
    static AnimatedPanel field_c;

    final static void a(int param0) {
        if (param0 > 111) {
          TertiaryLinkNode.field_o.field_a = 0;
          TertiaryLinkNode.field_o.field_p = 0;
          return;
        }
        field_c = (AnimatedPanel) null;
        TertiaryLinkNode.field_o.field_a = 0;
        TertiaryLinkNode.field_o.field_p = 0;
    }

    final static Sprite[] a(int param0, byte param1, int param2, int param3) {
        int var4 = 10;
        Sprite[] var5 = new Sprite[9];
        var5[0] = new Sprite(param3, param3);
        var5[1] = new Sprite(10, param3);
        var5[2] = new Sprite(param3, param3);
        var5[3] = new Sprite(param3, 10);
        var5[5] = new Sprite(param3, 10);
        var5[6] = new Sprite(param3, param3);
        var5[7] = new Sprite(10, param3);
        var5[8] = new Sprite(param3, param3);
        RandomAccessCacheFile.a(-128);
        var5[0].bindAsRenderTarget();
        RoundedFrameSupport.a(20, 3974311, var4, 10 + param3 * 2, 0, 0, 3974311, 10 + 2 * param3);
        var5[1].bindAsRenderTarget();
        RoundedFrameSupport.a(20, 3974311, var4, 10 + param3 * 2, -param3, 0, 3974311, 2 * param3 + 10);
        var5[2].bindAsRenderTarget();
        RoundedFrameSupport.a(20, 3974311, var4, 10 + param3 * 2, -param3 - 10, 0, 3974311, 2 * param3 + 10);
        var5[3].bindAsRenderTarget();
        RoundedFrameSupport.a(20, 3974311, var4, param3 * 2 + 10, 0, -param3, 3974311, 2 * param3 + 10);
        var5[5].bindAsRenderTarget();
        RoundedFrameSupport.a(20, 3974311, var4, 10 + param3 * 2, -param3 - 10, -param3, 3974311, 10 + 2 * param3);
        int var6 = -123 % ((-36 - param1) / 62);
        var5[6].bindAsRenderTarget();
        RoundedFrameSupport.a(20, 3974311, var4, param3 * 2 + 10, 0, -param3 - 10 - 1, 3974311, 10 + param3 * 2);
        var5[7].bindAsRenderTarget();
        RoundedFrameSupport.a(20, 3974311, var4, param3 * 2 + 10, -param3, -10 - param3 - 2, 3974311, 10 + 2 * param3);
        var5[8].bindAsRenderTarget();
        RoundedFrameSupport.a(20, 3974311, var4, 10 + param3 * 2, -10 - param3, -11 - param3, 3974311, 10 + 2 * param3);
        OpacityWidget.popLegacyRasterState(0);
        return var5;
    }

    protected final int next(int param0) {
        return this.field_f.nextInt(13) >> -param0 + 32;
    }

    public final void setSeed(long param0) {
        int[] var4 = new int[2];
        int[] var3 = var4;
        var4[0] = (int)GarrisonTask.longAnd(65535L, param0);
        var4[1] = (int)GarrisonTask.longAnd(param0 >> 32, 65535L);
        this.field_f = new IsaacRandom(var4);
    }

    final static WidgetTheme b(int param0) {
        if (MusicVoice.field_o == null) {
          MusicVoice.field_o = new WidgetTheme(EmailValidator.field_x, 20, 0, 0, 0, 11579568, -1, 0, 0, EmailValidator.field_x.field_J, -1, 2147483647, true);
        }
        if (param0 > 12) {
          return MusicVoice.field_o;
        }
        IsaacBackedRandom.a(23);
        return MusicVoice.field_o;
    }

    public static void clearStatics(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != -109) {
          return;
        }
        field_a = null;
        field_d = null;
        field_e = null;
    }

    IsaacBackedRandom(long param0) {
        this.setSeed(param0);
    }

    public IsaacBackedRandom() {
        this(42L);
    }

    static {
        field_e = "<%0> has entered a game.";
        field_d = "Please wait...";
    }
}

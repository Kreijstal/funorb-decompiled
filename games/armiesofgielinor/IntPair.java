/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntPair extends IntrusiveNode {
    int first;
    static String field_l;
    static String field_o;
    static String localAccountNameKey;
    int second;
    static AnimationFrameSet field_q;
    static PlatformTaskService field_m;

    public static void a(int param0) {
        if (param0 != -10) {
          IntPair.e(-3);
        }
        field_m = null;
        field_q = null;
        localAccountNameKey = null;
        field_l = null;
        field_o = null;
    }

    final static RgbSprite[] a(int param0, byte param1, int param2, int param3) {
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        RgbSprite[] var7 = new RgbSprite[9];
        RgbSprite[] var4 = var7;
        var7[0] = SocialListEntry.a(false, param2, param3);
        int var5 = 1;
        if (param1 > -8) {
          IntPair.e(-23);
        }
        while (var5 < 9) {
          var4[var5] = var4[0];
          var5++;
        }
        var4[4] = SocialListEntry.a(false, param0, 64);
        return var4;
    }

    final static void e(int param0) {
        gl.a(120, param0);
    }

    IntPair(int first, int second) {
        this.second = second;
        this.first = first;
    }

    static {
        field_l = "Reward: ";
        field_o = "Extra coats of arms parts.";
    }
}

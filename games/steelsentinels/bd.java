/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static NodeDeque field_b;
    static SceneWidget field_f;
    static String field_a;
    static String field_e;
    static int field_d;
    static int field_c;

    final static RgbSprite a(int param0, int param1, int param2) {
        int var5 = SteelSentinels.obfuscationControl;
        RgbSprite var3 = new RgbSprite(param1, param1);
        int var4 = 0;
        if (param2 != 248) {
          bd.a(17, 14, -114);
        }
        while (var4 < var3.field_E.length) {
          var3.field_E[var4] = param0;
          var4++;
        }
        return var3;
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != -23333) {
          field_f = (SceneWidget) null;
        }
    }

    static {
        field_b = new NodeDeque();
        field_a = "<%0> is not on your friend list.";
        field_e = "Concluded";
    }
}

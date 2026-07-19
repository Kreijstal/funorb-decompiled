/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn implements dja {
    static String field_b;
    static float[][] field_a;

    public static void a(boolean param0) {
        field_b = null;
        field_a = (float[][]) null;
        if (param0) {
            cn.a(true);
        }
    }

    public final tv a(byte param0) {
        int var2 = -32 % ((param0 - -64) / 50);
        return (tv) ((Object) new dab());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = (float[][]) null;
            return (tv[]) ((Object) new dab[param1]);
        }
        return (tv[]) ((Object) new dab[param1]);
    }

    static {
        field_b = "Searching for an opponent";
        field_a = new float[][]{new float[]{-0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}};
    }
}

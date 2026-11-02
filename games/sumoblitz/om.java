/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends IntrusiveNode {
    private wc[] field_o;
    static String unpackingLevelsText;
    static boolean field_l;
    static ri[] field_m;
    static String[] droneNames;

    om(wc[] param0) {
        try {
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "om.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        droneNames = null;
        int var1 = -126 / ((param0 - 34) / 59);
        unpackingLevelsText = null;
        field_m = null;
    }

    final wc[] a(int param0) {
        int var2 = 45 % ((param0 + 35) / 38);
        return this.field_o;
    }

    final static boolean a(int param0, int param1, byte param2) {
        int var3 = -118 / ((param2 - 64) / 51);
        return em.a(false, param0, param1) & sg.a(param0, param1, 65);
    }

    static {
        unpackingLevelsText = "Unpacking levels";
        field_l = false;
        droneNames = new String[]{"Player", "HyoujunBot", "SuiminBot", "KosokuBot", "BunkatBot", "SosakuBot"};
    }
}

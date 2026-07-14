/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends wf {
    int field_e;
    boolean field_g;
    int[] field_f;

    eh() {
        ((eh) this).field_g = false;
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var6 = AceOfSkies.field_G ? 1 : 0;
        int var4 = param3.indexOf(param0);
        while (var4 != -1) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(param0.length() + var4);
            var4 = param3.indexOf(param0, var4 + param2.length());
        }
        int var5 = -105 % ((param1 - 60) / 43);
        return param3;
    }
}

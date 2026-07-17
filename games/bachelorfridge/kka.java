/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kka extends bw {
    static int field_g;
    static kv[] field_i;
    static sja field_l;
    int[] field_m;
    static ee field_f;
    static String[] field_k;
    boolean field_j;
    static kv field_h;

    final static int a(int param0, int param1, int param2) {
        String var3 = null;
        int var4 = 0;
        var3 = lka.field_E[param0][param2];
        var3 = var3.trim();
        var3 = var3.toLowerCase();
        if (var3.equals((Object) (Object) "")) {
          return -1;
        } else {
          var4 = 53 / ((4 - param1) / 41);
          return ((ji) (Object) eo.field_f.a(true, (long)var3.hashCode())).field_h;
        }
    }

    public static void a() {
        field_k = null;
        field_l = null;
        field_h = null;
        field_f = null;
        field_i = null;
    }

    kka() {
        ((kka) this).field_j = false;
    }

    static {
    }
}

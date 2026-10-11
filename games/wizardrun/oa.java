/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static String field_a;
    static bh field_b;
    static qi field_c;

    final static boolean a(int param0) {
        if (param0 != -25231) {
          field_a = (String) null;
          return eb.field_a;
        }
        return eb.field_a;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
          field_a = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static String a(byte param0, char param1, int param2) {
        int var4 = 0;
        int var5 = wizardrun.field_H;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        int var4Lifetime1;
        if (param0 == -95) {
          for (var4 = 0; param2 > var4; var4++) {
            var6[var4] = param1;
          }
          return new String(var6);
        }
        oa.a(-22);
        for (var4Lifetime1 = 0; param2 > var4Lifetime1; var4Lifetime1++) {
          var6[var4Lifetime1] = param1;
        }
        return new String(var6);
    }

    static {
        field_a = "Cancel";
        field_c = null;
        field_b = new bh(6, 0, 4, 2);
    }
}

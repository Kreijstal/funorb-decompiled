/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static String field_c;
    static String field_e;
    static boolean field_f;
    static String field_d;
    static cj field_a;
    static int field_b;

    final static gh a(String[] args, int param1) {
        gh var2 = null;
        Object var3 = null;
        var2 = new gh(false);
        if (param1 >= -104) {
          var3 = null;
          kn.a(-95, false, (String) null, (String) null);
          var2.field_b = args;
          return var2;
        } else {
          var2.field_b = args;
          return var2;
        }
    }

    final static so a(byte param0, ga param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        var2 = param1.d((byte) 69);
        var3 = param1.d((byte) 69);
        var4 = param1.g(31365);
        var5 = param1.i(-1478490344);
        var6 = param1.i(-1478490344);
        var7 = param1.i(-1478490344);
        var8 = param1.i(-1478490344);
        if (param0 <= 63) {
          var10 = null;
          kn.a(-24, false, (String) null, (String) null);
          var9 = param1.i(-1478490344);
          return ng.a(var5, 47, var4, var3, var7, var2, var8, var9, var6);
        } else {
          var9 = param1.i(-1478490344);
          return ng.a(var5, 47, var4, var3, var7, var2, var8, var9, var6);
        }
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        fa.field_Ib = param3;
        s.field_a = param2;
        qj.a(jl.field_v, param1, param0 + 1549);
        if (param0 != -1431) {
            field_d = null;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_e = null;
        if (param0) {
          var2 = null;
          kn.a(104, true, (String) null, (String) null);
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Sage";
        field_c = "Private";
        field_d = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}

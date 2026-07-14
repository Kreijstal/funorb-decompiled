/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static ts field_a;
    static String field_b;

    public static void b(int param0) {
        int var1 = -48 % ((-58 - param0) / 49);
        field_a = null;
        field_b = null;
    }

    final static al a(int param0) {
        if (param0 != 14263) {
            field_b = null;
            return sj.field_c;
        }
        return sj.field_c;
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        if (param0 != -73) {
            field_b = null;
            return uv.a(param2, param1, true, (byte) -86);
        }
        return uv.a(param2, param1, true, (byte) -86);
    }

    final static void a(int param0, boolean param1, String param2, boolean param3) {
        iu.a((byte) -124);
        if (param0 != 1) {
          return;
        } else {
          rf.field_a.a((byte) -34);
          no.field_a = new cv(ac.field_F, (String) null, pg.field_a, param3, param1);
          vi.field_y = new dc(rf.field_a, (pk) (Object) no.field_a);
          rf.field_a.a((byte) 104, (pk) (Object) vi.field_y);
          return;
        }
    }

    final static boolean a(byte param0, char param1) {
        if (param0 != -54) {
            return false;
        }
        if (param1 < 48) {
            return false;
        }
        if (57 < param1) {
            return false;
        }
        return true;
    }

    final static boolean a(String param0, byte param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (param1 != -25) {
          field_b = null;
          var3 = (CharSequence) (Object) param0;
          return tc.field_f.equals((Object) (Object) uk.a(param1 ^ 24, var3));
        } else {
          var4 = (CharSequence) (Object) param0;
          return tc.field_f.equals((Object) (Object) uk.a(param1 ^ 24, var4));
        }
    }

    final static void a(ki param0, boolean param1, byte param2, ki param3, ki param4) {
        ut.field_o = aj.a(false, "");
        ut.field_o.a(113, false);
        da.a(param4, param3, 17474, param0);
        if (param2 < 20) {
          return;
        } else {
          ro.b(246);
          vm.field_c = hm.field_a;
          nw.field_e = hm.field_a;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ts(12, 0, 1, 0);
        field_b = "Difficulty: ";
    }
}

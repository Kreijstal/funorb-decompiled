/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static int[] field_b;
    static int field_e;
    static IntrusiveDeque field_c;
    static String field_f;
    static String field_d;
    static int[] field_a;
    static hl field_g;

    final static Sprite[] a(int param0, int param1, int param2, int param3, byte param4) {
        Sprite dupTemp$0 = null;
        Sprite dupTemp$1 = null;
        Sprite[] var6 = null;
        Sprite[] var5 = null;
        Sprite[] var6Lifetime1;
        Sprite[] var5Lifetime1;
        if (param4 != 126) {
          bd.a((byte) -37);
          var6 = new Sprite[9];
          var5 = var6;
          dupTemp$0 = ce.a(param2, param1, param4 - 126);
          var5[6] = dupTemp$0;
          var5[3] = dupTemp$0;
          var5[2] = dupTemp$0;
          var5[1] = dupTemp$0;
          var5[0] = dupTemp$0;
          dupTemp$1 = ce.a(param0, param1, 0);
          var6[8] = dupTemp$1;
          var5[7] = dupTemp$1;
          var5[5] = dupTemp$1;
          if (param3 != 0) {
            var5[4] = ce.a(param3, 64, param4 - 126);
            return var5;
          }
          return var5;
        }
        var6Lifetime1 = new Sprite[9];
        var5Lifetime1 = var6Lifetime1;
        Sprite dupTemp$2 = ce.a(param2, param1, param4 - 126);
        var5Lifetime1[6] = dupTemp$2;
        var5Lifetime1[3] = dupTemp$2;
        var5Lifetime1[2] = dupTemp$2;
        var5Lifetime1[1] = dupTemp$2;
        var5Lifetime1[0] = dupTemp$2;
        Sprite dupTemp$3 = ce.a(param0, param1, 0);
        var6Lifetime1[8] = dupTemp$3;
        var5Lifetime1[7] = dupTemp$3;
        var5Lifetime1[5] = dupTemp$3;
        if (param3 == 0) {
          return var5Lifetime1;
        }
        var5Lifetime1[4] = ce.a(param3, 64, param4 - 126);
        return var5Lifetime1;
    }

    final static String a(int param0) {
        if (null == ph.field_w) {
          return "";
        }
        if (param0 == 6) {
          return ph.field_w;
        }
        bd.a(85, -19, 63, -86, (byte) 97);
        return ph.field_w;
    }

    final static void a(Sprite param0, int param1) {
        try {
          if (param1 != 6) {
            Sprite var3 = (Sprite) null;
            bd.a((Sprite) null, -66);
          }
          me.a(false);
          param0.c();
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "bd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_g = null;
        if (param0 < 111) {
          Sprite var2 = (Sprite) null;
          bd.a((Sprite) null, 71);
        }
    }

    static {
        field_c = new IntrusiveDeque();
        field_f = "Report abuse";
        field_d = "Quick Chat game";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends bk {
    private String field_k;
    static String[] field_i;
    static String field_j;
    static int field_g;
    private long field_h;
    static String field_f;
    static String field_e;

    ul a(boolean param0) {
        if (!param0) {
            mh.b((byte) -16);
        }
        return p.field_b;
    }

    public static void b(byte param0) {
        field_f = null;
        field_i = null;
        field_j = null;
        if (param0 != 51) {
            field_i = null;
        }
        field_e = null;
    }

    final static String a(CharSequence[] param0, byte param1, int param2, int param3) {
        CharSequence var10 = null;
        CharSequence var4_ref_CharSequence = null;
        int var6_int = 0;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = Virogrid.field_F ? 1 : 0;
        if (!((param3 ^ -1) != -1)) {
            return "";
        }
        if (!(-2 != (param3 ^ -1))) {
            var10 = param0[param2];
            var4_ref_CharSequence = var10;
            if (var4_ref_CharSequence == null) {
                return "null";
            }
            return ((Object) (Object) var10).toString();
        }
        int var4 = param3 + param2;
        int var5 = 0;
        for (var6_int = param2; (var4 ^ -1) < (var6_int ^ -1); var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence != null) {
                var5 = var5 + var7_ref_CharSequence.length();
            } else {
                var5 += 4;
            }
        }
        StringBuilder var6 = new StringBuilder(var5);
        if (param1 <= 3) {
            mh.a(-16L, (byte) -125);
        }
        for (var7 = param2; var7 < var4; var7++) {
            var8 = param0[var7];
            if (var8 == null) {
                StringBuilder discarded$1 = var6.append("null");
            } else {
                StringBuilder discarded$2 = var6.append(var8);
            }
        }
        return var6.toString();
    }

    final void a(boolean param0, jc param1) {
        param1.a((byte) 87, ((mh) this).field_h);
        param1.c(((mh) this).field_k, (byte) 60);
        if (param0) {
            mh.a(-122L, (byte) -22);
        }
    }

    final static void a(long param0, byte param1) {
        InterruptedException var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              Thread.sleep(param0);
              if (param1 == -88) {
                break L1;
              } else {
                var4 = null;
                String discarded$1 = mh.a((CharSequence[]) null, (byte) 99, -73, 66);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
    }

    mh(long param0, String param1) {
        ((mh) this).field_k = param1;
        ((mh) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"None", "Easy", "Normal", "Hard"};
        field_f = "<%0> has resigned and left.";
        field_e = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_j = "Create your own free Jagex account";
    }
}

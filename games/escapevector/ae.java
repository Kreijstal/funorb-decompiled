/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements db {
    static uk field_b;
    static lk field_a;
    static ed[] field_c;
    static java.security.SecureRandom field_d;
    static String[] field_e;

    final static int a(byte[] param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int var4 = -1;
        if (param1 > -37) {
            ae.a(45L, (byte) -21);
        }
        for (var5 = param3; var5 < param2; var5++) {
            var4 = al.field_a[(param0[var5] ^ var4) & 255] ^ var4 >>> 680910440;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    final static void a(long param0, byte param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        if (param1 == 118) {
          try {
            Thread.sleep(param0);
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          var3 = (InterruptedException) (Object) decompiledCaughtException;
        } else {
          return;
        }
    }

    final static int b(int param0) {
        af.field_e.a((byte) 12);
        if (param0 != -1021831775) {
            field_b = null;
        }
        if (!od.field_j.d(-3994)) {
            return un.f(param0 + 1021831755);
        }
        return 0;
    }

    final static te[] a(String param0, String param1, byte param2, mf param3) {
        if (param2 >= -45) {
            return null;
        }
        int var4 = param3.b(-1, param0);
        int var5 = param3.a(var4, param1, true);
        return bl.a(var5, 255, param3, var4);
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 1) {
            ae.a(-128);
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        if (param2 > -14) {
            Object var9 = null;
            ((ae) this).a(-95, 88, 12, (hm) null, false);
        }
        int var6 = param0 + param3.field_k;
        int var7 = param1 + param3.field_j;
        mn.a(-27951, var6, var7, param3.field_g, param3.field_x);
        ed var8 = ul.field_E[1];
        if (param3 instanceof hc) {
            if (((hc) (Object) param3).field_z) {
                var8.c((-var8.field_A + param3.field_g >> -1021831775) + 1 + var6, var7 - (-1 - (param3.field_x - var8.field_z >> -1905179359)), 256);
            }
        }
        if (param3.h(0)) {
            ic.a(false, param3.field_g + -4, 2 + var6, -4 + param3.field_x, 2 + var7);
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ed[30];
        field_b = new uk();
        field_e = new String[]{"Congratulations on your success so far.<delay><br><br>We have just received intelligence on two types of alien defence.", "These blue cylinders will repel your ship.", "These green pods will shoot energy balls at any unidentified ship within range of their sensors."};
    }
}

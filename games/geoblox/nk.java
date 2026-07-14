/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends df {
    static String field_i;
    static String field_g;
    private String field_d;
    static int[] field_c;
    private String field_h;
    static int[] field_f;
    static volatile int field_e;

    final void a(int param0, qc param1) {
        Object var4 = null;
        if (param0 <= 107) {
          var4 = null;
          byte[] discarded$2 = nk.a((byte[]) null, -72);
          param1.a(((nk) this).field_d, (byte) -126);
          param1.a(((nk) this).field_h, false);
          return;
        } else {
          param1.a(((nk) this).field_d, (byte) -126);
          param1.a(((nk) this).field_h, false);
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2 = param0.length;
        byte[] var3 = new byte[var2];
        sf.a(param0, 0, var3, param1, var2);
        return var3;
    }

    public static void b(int param0) {
        field_i = null;
        field_f = null;
        field_g = null;
        field_c = null;
        if (param0 != -17226) {
            field_g = null;
        }
    }

    final qg a(byte param0) {
        if (param0 != -32) {
            field_c = null;
            return ej.field_b;
        }
        return ej.field_b;
    }

    nk(String param0, String param1) {
        ((nk) this).field_h = param1;
        ((nk) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Start Game";
        field_i = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = new int[1000];
        field_e = 0;
    }
}

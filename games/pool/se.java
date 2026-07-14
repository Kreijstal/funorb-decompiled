/*
 * Decompiled by CFR-JS 0.4.0.
 */
class se extends re {
    static String field_k;
    static int field_l;
    private long field_j;
    private String field_g;
    static int[] field_i;
    static String field_m;
    static int field_h;

    tf b(byte param0) {
        int var2 = -3 / ((param0 - -54) / 43);
        return rp.field_b;
    }

    public static void b(int param0) {
        field_m = null;
        if (param0 != -1431655766) {
            field_h = -108;
            field_i = null;
            field_k = null;
            return;
        }
        field_i = null;
        field_k = null;
    }

    final void a(byte param0, ge param1) {
        param1.a(((se) this).field_j, (byte) -90);
        int var3 = 6 % ((param0 - 22) / 51);
        param1.a(((se) this).field_g, 103);
    }

    final static int a(boolean param0, int param1) {
        param1 = (1431655765 & param1) + ((param1 & -1431655766) >>> -1118350591);
        param1 = (param1 & 858993459) + (-1288490189 & param1 >>> -781252286);
        param1 = 252645135 & (param1 >>> 1836330372) + param1;
        param1 = param1 + (param1 >>> 749537320);
        param1 = param1 + (param1 >>> -647104976);
        if (param0) {
          field_k = null;
          return 255 & param1;
        } else {
          return 255 & param1;
        }
    }

    se(long param0, String param1) {
        ((se) this).field_j = param0;
        ((se) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 50;
        field_k = "Player names can be up to 12 letters, numbers and underscores";
        field_i = new int[]{291, 363, 428, 486, 548};
        field_m = "Join <%0>'s game";
    }
}

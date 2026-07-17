/*
 * Decompiled by CFR-JS 0.4.0.
 */
class or extends fi {
    private byte[] field_l;
    private int[] field_i;
    static String[] field_m;
    private int field_k;
    static nt field_j;
    private int field_n;

    final void a(int param0, byte param1, int param2) {
        if (param1 > -37) {
          ((or) this).c(-100);
          ((or) this).field_n = ((or) this).field_n + (param0 * ((or) this).field_i[param2] >> 12);
          return;
        } else {
          ((or) this).field_n = ((or) this).field_n + (param0 * ((or) this).field_i[param2] >> 12);
          return;
        }
    }

    void a(int param0, boolean param1, byte param2) {
        int fieldTemp$0 = ((or) this).field_k;
        ((or) this).field_k = ((or) this).field_k + 1;
        ((or) this).field_l[fieldTemp$0] = (byte)(127 + sea.c(127, param2 >> 1));
        if (param1) {
            field_m = null;
        }
    }

    or(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var7 = 0;
        ((or) this).field_i = new int[((or) this).field_a];
        for (var7 = 0; ((or) this).field_a > var7; var7++) {
            ((or) this).field_i[var7] = (short)(int)(Math.pow((double)param5, (double)var7) * 4096.0);
        }
    }

    final void c(int param0) {
        ((or) this).field_n = Math.abs(((or) this).field_n);
        if (param0 != 32164) {
          L0: {
            ((or) this).field_n = 78;
            if (((or) this).field_n >= 4096) {
              ((or) this).field_n = 4095;
              break L0;
            } else {
              break L0;
            }
          }
          int fieldTemp$2 = ((or) this).field_k;
          ((or) this).field_k = ((or) this).field_k + 1;
          ((or) this).a(fieldTemp$2, false, (byte)(((or) this).field_n >> 4));
          ((or) this).field_n = 0;
          return;
        } else {
          L1: {
            if (((or) this).field_n >= 4096) {
              ((or) this).field_n = 4095;
              break L1;
            } else {
              break L1;
            }
          }
          int fieldTemp$3 = ((or) this).field_k;
          ((or) this).field_k = ((or) this).field_k + 1;
          ((or) this).a(fieldTemp$3, false, (byte)(((or) this).field_n >> 4));
          ((or) this).field_n = 0;
          return;
        }
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int discarded$2 = 82;
        var1 = qd.a();
        var2 = mg.a(-62);
        qqa.field_t.a((byte) 57, var1 - -(ro.field_p << 1), -lsa.field_b + jua.field_d, am.field_o + -ro.field_p, (lsa.field_b << 1) + var2);
        if (param0 != -1226152383) {
          or.d(-112);
          fp.a((byte) -83);
          return;
        } else {
          fp.a((byte) -83);
          return;
        }
    }

    public static void e() {
        field_j = null;
        field_m = null;
    }

    final void a(byte param0) {
        if (param0 != 50) {
          ((or) this).field_l = null;
          ((or) this).field_n = 0;
          ((or) this).field_k = 0;
          return;
        } else {
          ((or) this).field_n = 0;
          ((or) this).field_k = 0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"<%0> was pancaked", "<%0> forgot to bring the hard hat", "<%0> entered the land of Moin", "<%0> is quite a bit shorter now", "<%0> should have looked up", "<%0> could not shoulder the burden", "<%0> became pate"};
        field_j = new nt();
    }
}

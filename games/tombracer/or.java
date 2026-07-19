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
          this.c(-100);
          this.field_n = this.field_n + (param0 * this.field_i[param2] >> -526253108);
          return;
        } else {
          this.field_n = this.field_n + (param0 * this.field_i[param2] >> -526253108);
          return;
        }
    }

    void a(int param0, boolean param1, byte param2) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_l[fieldTemp$0] = (byte)(127 + sea.c(127, param2 >> -332397343));
        if (param1) {
            field_m = (String[]) null;
        }
    }

    or(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var8 = TombRacer.field_G ? 1 : 0;
        this.field_i = new int[this.field_a];
        int var7 = 0;
        while (this.field_a > var7) {
            this.field_i[var7] = (short)(int)(Math.pow((double)param5, (double)var7) * 4096.0);
            var7++;
            if (var8 != 0) {
                return;
            }
        }
    }

    final void c(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        this.field_n = Math.abs(this.field_n);
        if (param0 != 32164) {
          L0: {
            this.field_n = 78;
            if (-4097 >= (this.field_n ^ -1)) {
              this.field_n = 4095;
              break L0;
            } else {
              break L0;
            }
          }
          fieldTemp$2 = this.field_k;
          this.field_k = this.field_k + 1;
          this.a(fieldTemp$2, false, (byte)(this.field_n >> -128544348));
          this.field_n = 0;
          return;
        } else {
          L1: {
            if (-4097 >= (this.field_n ^ -1)) {
              this.field_n = 4095;
              break L1;
            } else {
              break L1;
            }
          }
          fieldTemp$3 = this.field_k;
          this.field_k = this.field_k + 1;
          this.a(fieldTemp$3, false, (byte)(this.field_n >> -128544348));
          this.field_n = 0;
          return;
        }
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = qd.a((byte) 82);
        var2 = mg.a(-62);
        qqa.field_t.a((byte) 57, var1 - -(ro.field_p << 1553777153), -lsa.field_b + jua.field_d, am.field_o + -ro.field_p, (lsa.field_b << -1226152383) + var2);
        if (param0 != -1226152383) {
          or.d(-112);
          fp.a((byte) -83);
          return;
        } else {
          fp.a((byte) -83);
          return;
        }
    }

    public static void e(int param0) {
        field_j = null;
        if (param0 != 24451) {
            return;
        }
        field_m = null;
    }

    final void a(byte param0) {
        if (param0 != 50) {
          this.field_l = (byte[]) null;
          this.field_n = 0;
          this.field_k = 0;
          return;
        } else {
          this.field_n = 0;
          this.field_k = 0;
          return;
        }
    }

    static {
        field_m = new String[]{"<%0> was pancaked", "<%0> forgot to bring the hard hat", "<%0> entered the land of Moin", "<%0> is quite a bit shorter now", "<%0> should have looked up", "<%0> could not shoulder the burden", "<%0> became pate"};
        field_j = new nt();
    }
}

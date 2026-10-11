/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    private int field_d;
    private boolean field_a;
    private int field_j;
    private int field_o;
    private int field_n;
    static int[] field_f;
    private int field_e;
    private int field_k;
    static String field_l;
    private int field_b;
    static boolean field_c;
    static dj field_h;
    private int field_i;
    static int field_m;
    static int[] field_g;

    public static void b(byte param0) {
        if (param0 <= 78) {
          return;
        }
        field_h = null;
        field_g = null;
        field_f = null;
        field_l = null;
    }

    final void a(wk param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        if (!this.field_a) {
          return;
        }
        try {
          var3_int = param0.a(this.field_i >> 16, (byte) -60);
          if (param1 != 8192) {
            a.a((byte) 123);
          }
          var4 = param0.a(this.field_o >> 16, 0) - (this.field_k >> 16);
          tf.field_b[this.field_b].b(-3 + var3_int, -3 + var4);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "a.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_i = param2;
        this.field_o = param0 + (-(so.c(8) << 16) + 262144);
        this.field_k = param1 << 16;
        if (param3 > 57) {
          this.field_j = (so.c(1) << 16) + 65536;
          this.field_e = so.c(32768) - 114688;
          this.field_a = true;
          this.field_d = 12 + so.c(3);
          this.field_n = 0;
          this.field_b = 0;
          so.a(sg.field_fb);
          return;
        }
        a.b((byte) -23);
        this.field_j = (so.c(1) << 16) + 65536;
        this.field_e = so.c(32768) - 114688;
        this.field_a = true;
        this.field_d = 12 + so.c(3);
        this.field_n = 0;
        this.field_b = 0;
        so.a(sg.field_fb);
    }

    final static void a(byte param0) {
        if (param0 != 40) {
          field_h = (dj) null;
          pa.field_x = new va[]{};
          return;
        }
        pa.field_x = new va[]{};
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var2Lifetime1;
        if (!this.field_a) {
          return;
        }
        if (this.field_k <= 0) {
          return;
        }
        this.field_k = this.field_k + this.field_j;
        this.field_i = this.field_i + this.field_e;
        if (this.field_j <= -131072) {
          var2 = 63 / ((41 - param0) / 53);
          if (this.field_b >= 2) {
            return;
          }
          fieldTemp$0 = this.field_n + 1;
          this.field_n = this.field_n + 1;
          if (this.field_d >= fieldTemp$0) {
            return;
          }
          this.field_n = 0;
          this.field_b = this.field_b + 1;
          if (this.field_b != 2) {
            return;
          }
          kh.a(so.c(1) + 153, false);
          return;
        }
        this.field_j = this.field_j - 8192;
        var2Lifetime1 = 63 / ((41 - param0) / 53);
        if (this.field_b >= 2) {
          return;
        }
        fieldTemp$1 = this.field_n + 1;
        this.field_n = this.field_n + 1;
        if (this.field_d >= fieldTemp$1) {
          return;
        }
        this.field_n = 0;
        this.field_b = this.field_b + 1;
        if (this.field_b != 2) {
          return;
        }
        kh.a(so.c(1) + 153, false);
        return;
    }

    a() {
        this.field_d = 20;
        this.field_a = false;
    }

    static {
        int var0 = 0;
        field_f = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
          field_f[var0] = jm.a(var0, 89);
        }
        field_l = "Player names can be up to 12 letters, numbers and underscores";
        field_g = new int[]{280, 180, 180, 180, 180, 180, 180};
        field_m = 8;
        field_c = false;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static ta field_h;
    private int field_g;
    private int field_d;
    private int[] field_l;
    private int[] field_e;
    static int field_i;
    static long field_k;
    private int field_n;
    private int field_b;
    static char[] field_f;
    static Boolean field_a;
    static ea field_c;
    static int[] field_m;
    static ac field_j;

    public static void c(byte param0) {
        if (param0 <= 0) {
          field_h = (ta) null;
        }
        field_j = null;
        field_f = null;
        field_m = null;
        field_a = null;
        field_h = null;
        field_c = null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 != -752960408) {
          return;
        }
        try {
          if (11 == fh.field_b) {
            pk.b(114);
          }
          mn.a((byte) -63, oe.field_d, ul.field_a, bj.field_c);
          cl.a(param1, 0, 0, 310);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "mf.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = MinerDisturbance.field_ab;
        int fieldTemp$0 = this.field_n + 1;
        this.field_n = this.field_n + 1;
        this.field_g = this.field_g + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_e[var2];
          if ((var2 & 2) == 0) {
            if ((var2 & 1) != 0) {
              this.field_b = this.field_b ^ this.field_b >>> 6;
            } else {
              this.field_b = this.field_b ^ this.field_b << 13;
            }
          } else {
            if ((1 & var2) == 0) {
              this.field_b = this.field_b ^ this.field_b << 2;
            } else {
              this.field_b = this.field_b ^ this.field_b >>> 16;
            }
          }
          this.field_b = this.field_b + this.field_e[var2 + 128 & 255];
          dupTemp$1 = this.field_g + (this.field_b + this.field_e[c.a(1020, var3) >> 2]);
          var4 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_e[c.a(261205, var4) >> 8 >> 2];
          this.field_g = dupTemp$2;
          this.field_l[var2] = dupTemp$2;
        }
        if (param0 != -91) {
          this.field_d = -29;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var11 = MinerDisturbance.field_ab;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != 90) {
          this.field_e = (int[]) null;
        }
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        int var4 = -1640531527;
        int var9 = -1640531527;
        int var3 = -1640531527;
        int var5 = -1640531527;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var5 = var5 + this.field_l[2 + var2Lifetime1];
          var6 = var6 + this.field_l[var2Lifetime1 + 3];
          var3 = var3 + this.field_l[var2Lifetime1];
          var4 = var4 + this.field_l[var2Lifetime1 + 1];
          var8 = var8 + this.field_l[5 + var2Lifetime1];
          var9 = var9 + this.field_l[6 + var2Lifetime1];
          var10 = var10 + this.field_l[var2Lifetime1 + 7];
          var7 = var7 + this.field_l[var2Lifetime1 + 4];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_e[var2Lifetime1] = var3;
          this.field_e[var2Lifetime1 + 1] = var4;
          this.field_e[var2Lifetime1 + 2] = var5;
          this.field_e[3 + var2Lifetime1] = var6;
          this.field_e[4 + var2Lifetime1] = var7;
          this.field_e[var2Lifetime1 + 5] = var8;
          this.field_e[var2Lifetime1 + 6] = var9;
          this.field_e[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var5 = var5 + this.field_e[var2Lifetime2 + 2];
          var3 = var3 + this.field_e[var2Lifetime2];
          var9 = var9 + this.field_e[6 + var2Lifetime2];
          var8 = var8 + this.field_e[var2Lifetime2 + 5];
          var7 = var7 + this.field_e[4 + var2Lifetime2];
          var10 = var10 + this.field_e[7 + var2Lifetime2];
          var6 = var6 + this.field_e[3 + var2Lifetime2];
          var4 = var4 + this.field_e[var2Lifetime2 + 1];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_e[var2Lifetime2] = var3;
          this.field_e[var2Lifetime2 + 1] = var4;
          this.field_e[2 + var2Lifetime2] = var5;
          this.field_e[var2Lifetime2 + 3] = var6;
          this.field_e[4 + var2Lifetime2] = var7;
          this.field_e[5 + var2Lifetime2] = var8;
          this.field_e[6 + var2Lifetime2] = var9;
          this.field_e[var2Lifetime2 + 7] = var10;
        }
        this.a((byte) -91);
        this.field_d = 256;
    }

    final static pf a(int param0) {
        int var1 = 78 / ((param0 - 80) / 44);
        return new pf(lm.n(81), wc.b((byte) 117));
    }

    final int b(int param0) {
        if (param0 != 4) {
          return 35;
        }
        if (this.field_d == 0) {
          this.a((byte) -91);
          this.field_d = 256;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_l[fieldTemp$0];
    }

    mf(int[] param0) {
        int var2_int = 0;
        try {
          this.field_l = new int[256];
          this.field_e = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_l[var2_int] = param0[var2_int];
          }
          this.b((byte) 90);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = 0L;
        field_h = new ta();
        field_f = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_c = new ea(640, 480);
    }
}

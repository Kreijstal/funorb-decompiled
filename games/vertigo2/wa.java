/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static er field_f;
    private int[] field_b;
    private int[] field_a;
    private int field_c;
    private int field_k;
    private int field_j;
    static ug field_i;
    static String field_g;
    static String[][] field_e;
    static String[] field_h;
    private int field_d;

    final static boolean b(byte param0) {
        int var1 = -29 % ((param0 + 65) / 52);
        return bf.field_b == um.field_F ? true : false;
    }

    final static er[] c(int param0) {
        int var7 = 0;
        int var8 = 0;
        er[] var1;
        int var2;
        int var3;
        int var4;
        byte[] var6;
        int[] var7_ref_int__;
        int var9;
        byte[] var10;
        int[] var11;
        byte[] var12;
        int[] var14;
        byte[] var16;
        int[] var18;
        byte[] var22;
        int[] var23;
        var9 = Vertigo2.field_L ? 1 : 0;
        var1 = new er[eo.field_m];
        var2 = 0;
        var3 = -51 / ((param0 - 55) / 61);
        while (var2 < eo.field_m) {
          var4 = vi.field_w[var2] * mh.field_c[var2];
          var22 = se.field_y[var2];
          if (!vl.field_j[var2]) {
            var11 = new int[var4];
            var23 = var11;
            for (var7 = 0; var7 < var4; var7++) {
              var11[var7] = in.field_c[b.a(255, (int) var22[var7])];
            }
            var1[var2] = new er(ql.field_M, vj.field_c, ca.field_a[var2], pc.field_a[var2], mh.field_c[var2], vi.field_w[var2], var23);
          } else {
            var16 = ej.field_c[var2];
            var12 = var16;
            var10 = var12;
            var6 = var10;
            var18 = new int[var4];
            var14 = var18;
            var7_ref_int__ = var14;
            for (var8 = 0; var8 < var4; var8++) {
              var7_ref_int__[var8] = om.a(b.a(var16[var8] << 24, -16777216), in.field_c[b.a(255, (int) var22[var8])]);
            }
            var1[var2] = (er) ((Object) new fe(ql.field_M, vj.field_c, ca.field_a[var2], pc.field_a[var2], mh.field_c[var2], vi.field_w[var2], var18));
          }
          var2++;
        }
        la.a((byte) 50);
        return var1;
    }

    private final void b(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0 >= -34) {
          wa.a(-78);
        }
        int fieldTemp$0 = this.field_d + 1;
        this.field_d = this.field_d + 1;
        this.field_c = this.field_c + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_b[var2];
          if ((var2 & 2) != 0) {
            if ((var2 & 1) == 0) {
              this.field_k = this.field_k ^ this.field_k << 2;
            } else {
              this.field_k = this.field_k ^ this.field_k >>> 16;
            }
          } else {
            if ((var2 & 1) == 0) {
              this.field_k = this.field_k ^ this.field_k << 13;
            } else {
              this.field_k = this.field_k ^ this.field_k >>> 6;
            }
          }
          this.field_k = this.field_k + this.field_b[128 + var2 & 255];
          dupTemp$1 = this.field_k + (this.field_b[b.a(var3 >> 2, 255)] + this.field_c);
          var4 = dupTemp$1;
          this.field_b[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_b[b.a(255, var4 >> 8 >> 2)];
          this.field_c = dupTemp$2;
          this.field_a[var2] = dupTemp$2;
        }
    }

    final int a(byte param0) {
        if (this.field_j == 0) {
          this.b(-93);
          this.field_j = 256;
        }
        if (param0 != 72) {
          return -40;
        }
        int fieldTemp$0 = this.field_j - 1;
        this.field_j = this.field_j - 1;
        return this.field_a[fieldTemp$0];
    }

    public static void a(int param0) {
        field_g = null;
        field_e = (String[][]) null;
        int var1 = 48 / ((75 - param0) / 45);
        field_f = null;
        field_h = null;
        field_i = null;
    }

    private final void d(int param0) {
        int var12 = Vertigo2.field_L ? 1 : 0;
        int var5 = -1640531527;
        int var3 = -1640531527;
        int var9 = -1640531527;
        int var7 = -1640531527;
        int var6 = -1640531527;
        int var8 = -1640531527;
        int var10 = -1640531527;
        int var4 = -1640531527;
        int var2 = 0;
        int var11 = 89 % ((param0 - 55) / 51);
        int var2Lifetime1;
        int var2Lifetime2;
        while (4 > var2) {
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var6 = var6 + this.field_a[3 + var2Lifetime1];
          var8 = var8 + this.field_a[5 + var2Lifetime1];
          var9 = var9 + this.field_a[var2Lifetime1 + 6];
          var4 = var4 + this.field_a[1 + var2Lifetime1];
          var10 = var10 + this.field_a[7 + var2Lifetime1];
          var7 = var7 + this.field_a[var2Lifetime1 + 4];
          var3 = var3 + this.field_a[var2Lifetime1];
          var5 = var5 + this.field_a[var2Lifetime1 + 2];
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
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_b[var2Lifetime1] = var3;
          this.field_b[var2Lifetime1 + 1] = var4;
          this.field_b[var2Lifetime1 + 2] = var5;
          this.field_b[var2Lifetime1 + 3] = var6;
          this.field_b[4 + var2Lifetime1] = var7;
          this.field_b[var2Lifetime1 + 5] = var8;
          this.field_b[6 + var2Lifetime1] = var9;
          this.field_b[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var9 = var9 + this.field_b[var2Lifetime2 + 6];
          var10 = var10 + this.field_b[7 + var2Lifetime2];
          var6 = var6 + this.field_b[3 + var2Lifetime2];
          var4 = var4 + this.field_b[1 + var2Lifetime2];
          var3 = var3 + this.field_b[var2Lifetime2];
          var5 = var5 + this.field_b[var2Lifetime2 + 2];
          var8 = var8 + this.field_b[5 + var2Lifetime2];
          var7 = var7 + this.field_b[var2Lifetime2 + 4];
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
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_b[var2Lifetime2] = var3;
          this.field_b[1 + var2Lifetime2] = var4;
          this.field_b[var2Lifetime2 + 2] = var5;
          this.field_b[3 + var2Lifetime2] = var6;
          this.field_b[4 + var2Lifetime2] = var7;
          this.field_b[var2Lifetime2 + 5] = var8;
          this.field_b[6 + var2Lifetime2] = var9;
          this.field_b[7 + var2Lifetime2] = var10;
        }
        this.b(-86);
        this.field_j = 256;
    }

    wa(int[] param0) {
        int var2_int = 0;
        try {
          this.field_a = new int[256];
          this.field_b = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_a[var2_int] = param0[var2_int];
          }
          this.d(-28);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "That name is not available";
        field_h = new String[]{"Skip to next level", "Give 1 Jet Pack", "Give 1 Life", "Give 1 Dynamite", "Force next Death Electric", "Force next Death Spikes", "Turn Fake Lag On", "Turn Fake Lag Off", "Set 20 FPS", "Set 50 FPS"};
        field_e = new String[][]{new String[]{"Co-op", "Paint-off"}, new String[]{"1", "5", "10", "15", "20", "25", "30", "35"}, new String[]{"1", "5", "10", "All"}};
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    private int[] field_a;
    private int field_k;
    private int field_d;
    private int[] field_f;
    static String field_c;
    private int field_b;
    static String field_e;
    static String field_i;
    static qb[] field_j;
    static String field_g;
    private int field_h;

    final int c(byte param0) {
        int fieldTemp$0 = this.field_b;
        this.field_b = this.field_b - 1;
        if (fieldTemp$0 == 0) {
          this.a((byte) -103);
          this.field_b = 255;
        }
        if (param0 != -46) {
          field_i = (String) null;
        }
        return this.field_a[this.field_b];
    }

    public static void d(byte param0) {
        field_j = null;
        if (param0 != -109) {
          jd.d((byte) -44);
        }
        field_i = null;
        field_g = null;
        field_c = null;
        field_e = null;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var11 = ArcanistsMulti.field_G ? 1 : 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != 1046142536) {
          field_c = (String) null;
        }
        int var8 = -1640531527;
        int var3 = -1640531527;
        int var5 = -1640531527;
        int var4 = -1640531527;
        int var9 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var10 = -1640531527;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
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
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var7 = var7 + this.field_a[4 + var2Lifetime1];
          var4 = var4 + this.field_a[var2Lifetime1 + 1];
          var10 = var10 + this.field_a[var2Lifetime1 + 7];
          var5 = var5 + this.field_a[var2Lifetime1 + 2];
          var8 = var8 + this.field_a[var2Lifetime1 + 5];
          var9 = var9 + this.field_a[var2Lifetime1 + 6];
          var6 = var6 + this.field_a[3 + var2Lifetime1];
          var3 = var3 + this.field_a[var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
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
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_f[var2Lifetime1] = var3;
          this.field_f[var2Lifetime1 + 1] = var4;
          this.field_f[var2Lifetime1 + 2] = var5;
          this.field_f[var2Lifetime1 + 3] = var6;
          this.field_f[var2Lifetime1 + 4] = var7;
          this.field_f[var2Lifetime1 + 5] = var8;
          this.field_f[6 + var2Lifetime1] = var9;
          this.field_f[7 + var2Lifetime1] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var7 = var7 + this.field_f[var2Lifetime2 + 4];
          var9 = var9 + this.field_f[6 + var2Lifetime2];
          var3 = var3 + this.field_f[var2Lifetime2];
          var10 = var10 + this.field_f[7 + var2Lifetime2];
          var6 = var6 + this.field_f[var2Lifetime2 + 3];
          var4 = var4 + this.field_f[var2Lifetime2 + 1];
          var8 = var8 + this.field_f[5 + var2Lifetime2];
          var5 = var5 + this.field_f[var2Lifetime2 + 2];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_f[var2Lifetime2] = var3;
          this.field_f[1 + var2Lifetime2] = var4;
          this.field_f[var2Lifetime2 + 2] = var5;
          this.field_f[3 + var2Lifetime2] = var6;
          this.field_f[var2Lifetime2 + 4] = var7;
          this.field_f[var2Lifetime2 + 5] = var8;
          this.field_f[var2Lifetime2 + 6] = var9;
          this.field_f[var2Lifetime2 + 7] = var10;
        }
        this.a((byte) -126);
        this.field_b = 256;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 >= -84) {
          this.field_d = -89;
        }
        int fieldTemp$0 = this.field_d + 1;
        this.field_d = this.field_d + 1;
        this.field_k = this.field_k + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_f[var2];
          if ((2 & var2) != 0) {
            if (0 != (1 & var2)) {
              this.field_h = this.field_h ^ this.field_h >>> 16;
            } else {
              this.field_h = this.field_h ^ this.field_h << 2;
            }
          } else {
            if ((var2 & 1) != 0) {
              this.field_h = this.field_h ^ this.field_h >>> 6;
            } else {
              this.field_h = this.field_h ^ this.field_h << 13;
            }
          }
          this.field_h = this.field_h + this.field_f[var2 + 128 & 255];
          dupTemp$1 = this.field_h + this.field_f[dg.a(var3 >> 2, 255)] + this.field_k;
          var4 = dupTemp$1;
          this.field_f[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_f[dg.a(255, var4 >> 8 >> 2)];
          this.field_k = dupTemp$2;
          this.field_a[var2] = dupTemp$2;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        co.field_f.a(param3, param0, param5, param1, (byte) -120);
        if (null != nn.field_q) {
          nn.field_q.a(param6, -ng.field_K + param6, param1, true, param1, param4);
        }
        if (param2 != 19) {
          field_e = (String) null;
        }
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != -116) {
          this.field_b = 111;
        }
        if (param0 <= 0) {
          throw new IllegalArgumentException();
        }
        int var3 = 2147483647 - (int)(4294967296L % (long)param0);
        do {
          var4 = this.c((byte) -46);
        } while (var3 < var4);
        return dh.a(var4, true, param0);
    }

    final static int b(int param0) {
        if (param0 >= -6) {
          jd.b(1);
        }
        return qm.field_u;
    }

    final jd b(byte param0) {
        jd var2 = new jd();
        var2.field_f = new int[256];
        var2.field_a = new int[256];
        if (param0 <= 22) {
          this.field_f = (int[]) null;
        }
        var2.field_b = this.field_b;
        sf.a(this.field_a, 0, var2.field_a, 0, 256);
        sf.a(this.field_f, 0, var2.field_f, 0, 256);
        var2.field_d = this.field_d;
        var2.field_k = this.field_k;
        var2.field_h = this.field_h;
        return var2;
    }

    private jd() {
    }

    jd(int[] param0) {
        int var2_int = 0;
        try {
          this.field_a = new int[256];
          this.field_f = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_a[var2_int] = param0[var2_int];
          }
          this.a(1046142536);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "The target up the cliff to the left is harder to reach. Pressing 'Backspace' will cause you to jump up high. Use this ability to scale the cliff.";
        field_e = "Protect your Arcanist within the safety of a tower - just click the mouse to cast. You can leave a tower by jumping.";
        field_i = "Message lobby";
    }
}
